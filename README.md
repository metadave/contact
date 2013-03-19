# Contact

## What is it?

Contact is a language and interactive shell for [Riak](http://basho.com/riak/).

## Status

This is a prototype and ***SHOULD NOT BE USED IN PRODUCTION. I'm actively working on this project, and the language is very likely to change. Many things probably don't work right now.***

See the TODO section below.

## Goals

1. An easy syntax for all Riak operations
2. An easy way to incorporate text, JSON, XML, Javascript into a Contact script file without escape-character madness.
3. A console that supports simple command completion and history.
4. Extensible object output, conflict resolution and retrier with Javascript (via Mozilla Rhino)

## Language Grammer

See: [Contact.g4](https://github.com/metadave/contact/blob/master/src/com/basho/contact/Contact.g4)

Contact uses an Antlr 4 grammar under the hood for all lexical + semantic goodness.


## Building

Be sure you `JAVA_HOME` is set. You'll need at least JDK 1.6 and Apache Maven to build Contact.

At the console, type:

	mvn package


## Hello world

After you've built Contact, just type:

	./contact.sh

## Help

At a Contact console prompt, try one of:

	help 
	
	help commands
	
	help <commandname> ## TODO

***(3/17/2013 - Only `help commands` is supported at the moment.)***

## Connecting

To connect to a Riak instance, use the `connect` command:

	connect "127.0.0.1" pb 10017;
	
`pb` refers to the procol buffers port that Riak is configured to use. Check the `pb_port` 
setting in **app.config** for the exact port to use.

To exit the shell, type `exit`.

## Comments

Comments in a script can either be:

	/* like this */
	
or

	// like this

## Use

To fetch many objects from a single bucket, you can select a bucket with the `use` command:

	use bucket "Foo";

Otherwise, all commands that require a bucket will need to be prefixed with:
	
	using bucket "Foo" … 

## Fetching Data

To fetch a key named "MyKey" from bucket "Foo", use the following:

	using bucket "Foo" fetch "MyKey";

Key and Bucket names are always in double quotes (for now).


To fetch many objects from a single bucket, you can select a bucket with the `use` command:

	use bucket "Foo";
	fetch "MyKey";
	fetch "MyOtherKey";

To bind a Riak object to a Contact variable:

	let myKey = fetch "MyKey";

Once you have a binding ("myKey" in the example above), you can refer to it from other Contact operations. 
(TODO: not much of a use right now)
	
### Fetching with options
	
	fetch "MyKey" 
		with options 
			"r" = 1, 
			"pr" = 1;

All options need to appear between double quotes (for now).

###Available fetch options:

* r (Integer)	
* pr (Integer)
* basic_quorum (Boolean)
* notfound_ok (Boolean)
* deletedvclock (Boolean)



## Storing Data

To store plain text, json, or xml, you can use the following commands:

	/* using "text" will set the content-type to text/plain */	
	using bucket "Foo" 
		store "MyKey" 
		with text "This is text";

	/* using "json" will set the content-type to application/json */
	using bucket "Foo" 
		store "MyKey" 
		with json "{foo:bar}";

	/* using "json" will set the content-type to application/xml */
	using bucket "Foo" 
		store "MyKey" 
		with xml "This is text";

Note, any double quotes appearing in the content string will need to be escaped. To store larger 
chunks of text, use a here doc:

```
// no escaping required!
using bucket "Foo" store "MyKey" with text 
~%~
This is "Free form text" and doesn't need any escaping!
~%~;
```

```
// no escaping required!
using bucket "Foo" store "MyKey" with json
~%~
{
	"person": {
        "name": "Dave Parfitt",
        "city": "Buffalo",
        "state": "NY"
    	}
}
~%~;
```

```	
// no escaping required!
using bucket "Foo" store "MyKey" with xml
~%~
<email>
	<to>foo@example.com</to>
	<from>bar@example.com</from>
	<subject>This is a reminder</subject>
	<body>Go to the dentist!</body>
</email>
~%~;	
```

### Storing with options

	using bucket "Foo" 
		store "MyKey" 
			with text "This is text" 
			with options "w" = 1, "pw" = 2;

###Available store options:

* w (Integer)
* pw (Integer)
* dw (Integer)
* return_body (Boolean)
* if_not_modified (Boolean)
* if_none_match (Boolean)

## Storing data with secondary indexes

	using bucket "Foo" 
		store "MyKey" 
			with index "twitter_bin" = "test" 
			and index "github_bin" = "test2" 
			and text "This is text";

	store "MyKey" 
			with index "twitter_bin" = "test" 
			and index "github_bin" = "test2" 
			and text "This is text";

## Deleting objects

**NOT IMPLEMENTED** at the moment

	using bucket "Foo" delete "MyKey";

	delete "MyKey";

### Options

**Not implemented**

## Secondary Index Query

**Query names and parameters must always appear in double quotes.**

Setup sample data with these:

	using bucket "Foo" 
	store "First" 
	with index "range_int" = "1" 
	and text "This is text 1";

	using bucket "Foo" 
	store "Last" 
	with index "range_int" = "2" 
	and text "This is text 2";

Execute queries like this:

	using bucket "Foo" query2i with index "twitter_bin" and value "test";
	using bucket "Foo" query2i with index "range_int" and value "1";

or with `use bucket`:

	use bucket "Foo";
	query2i with index "range_int" and value "2";
	query2i with index "range_int" from "1" to "2";

	
	
## Map/Reduce

**NOT IMPLEMENTED** at the moment

## Customizable Output

There are customizable actions via Javascript for most Contact commands. They come in pairs of pre/postcommand. 

Here's an example of the default action for rendering the results of a fetch:

```
set action postfetch with javascript 
~%~
  if(obj != undefined) { out.println(obj.getValueAsString()); }
~%~;
```

To see the code for an action:

```
get action postfetch;
```

For example, to print out the last modified date:

```
set action postfetch with javascript 
~%~
  if(obj != undefined) { out.println(obj.getLastModified()); }
~%~;
```

And here's a more in depth example that renderes sections of a JSON doc:

```
use bucket "Foo";

store "JsonTest" with json
~%~
  {
    "firstName": "John",
    "lastName": "Smith",
    "age": 25,
    "address": {
        "streetAddress": "21 2nd Street",
        "city": "New York",
        "state": "NY",
        "postalCode": 10021
    },
    "phoneNumber": [
        {
            "type": "home",
            "number": "212 555-1234"
        },
        {
            "type": "fax",
            "number": "646 555-4567"
        }
    ]
}
~%~;

set action postfetch with javascript 
~%~
  if(obj != undefined) { 
    var v = obj.getValueAsString(); 
    var j = JSON.parse(v);
    out.println(j.firstName + " " + j.lastName);
    out.println("Address:");
    out.println("   " + j.address.streetAddress);
    out.println("   " + j.address.city + 
                    ", " + j.address.state +
                    " " + j.address.postalCode);
    }
~%~;

fetch "JsonTest";
```

displays:

```
John Smith
Address:
   21 2nd Street
   New York, NY 10021
```

The key function in the postfetch action above is `JSON.parse(v)`, which turns evaluates a string and returns a Javascript object.

I hope to have a "Cookbook" section on the Contact wiki eventually, but in the meantime, you can check out the [Javadocs for the Riak Java Client](http://basho.github.com/riak-java-client/1.1.0/index.html) for available methods.


####Available actions:
 * preconnect
 * postconnect
 * prefetch
 * postfetch
 * prestore
 * poststore
 * predelete
 * postdelete
 * prequery2i
 * postquery2i
 * premapred
 * postmapred
 * prelistbuckets
 * postlistbuckets
 * prelistkeys
 * postlistkeys
 * pregetbucketprops
 * postgetbucketprops




## Customizable Conflict Resolvers and Retriers

**TODO**

These will also be customizable with Javascript.


## Listing Bucket

*Listing buckets should NOT be used on any production system*

	list buckets;

## Listing Keys

*Listing keys should NOT be used on any production system*

	using bucket "Foo" list keys;

or

	use bucket "Foo";
	list keys;


## Configuration

If you want to run some code upon startup, you can create a file called `~/.contact.config` with 
any Contact code you want.

For example, if you always connect to the same host, you can add this to the .contact.config file:

	connect "127.0.0.1" pb 10017;
	
## Basic Types

* Strings: "This is a string"   
* Integers: 1000
* Floats: Not implemented
* Boolean: false, true
* Here documents

```
~%~
Any text between the "scissor operators" doesn't need to be escaped. 
This means you can paste a full XML or JSON document here, and you don't 
have to worry about escaping quotes! Of course, you'll need to escape the scissor operator with: \~%~
~%~
```
	

#TODO
* TESTING TESTING TESTING
* implement Javascript resolvers + retiers
* bucket properties via pb (the HTTP interface code is currently commented out)
* script mode (read from stdin etc)
* clean up mr syntax + implementation
* link walking
* listing and using shell variables (ie from a 2i query)
* setup connections to multiple clusters, refer to a connection during a fetch, store, etc.
* load balancing
* do I need client ids?
* simple interactive web ui ala "Try Riak"
* Pasting text into the shell erroneously kicks off tab completion
* User content-types
* move to JLine2

#Contributing

If you are a Riak + Java fan, I'm looking for devs to help out.

Fork this repo, create a feature branch using something like this:
	
	git checkout -b branch_name
	
and submit a pull request. 

Please send me an email (dparfitt at basho dot com) and let me know if you want to work on any features.

Only friendly pull requests accepted:
[Assholes are Ruining Your Project by Donnie Berkholz](http://www.youtube.com/watch?v=-ZSli7QW4rg)
	

#License

http://www.apache.org/licenses/LICENSE-2.0.html

---

© 2013 Dave Parfitt