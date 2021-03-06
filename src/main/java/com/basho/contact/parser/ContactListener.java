// Generated from ./src/main/java/com/basho/contact/parser/Contact.g4 by ANTLR 4.0
package com.basho.contact.parser;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface ContactListener extends ParseTreeListener {
	void enterListkeys(ContactParser.ListkeysContext ctx);
	void exitListkeys(ContactParser.ListkeysContext ctx);

	void enterUpdate(ContactParser.UpdateContext ctx);
	void exitUpdate(ContactParser.UpdateContext ctx);

	void enterStore_indexes(ContactParser.Store_indexesContext ctx);
	void exitStore_indexes(ContactParser.Store_indexesContext ctx);

	void enterUsing(ContactParser.UsingContext ctx);
	void exitUsing(ContactParser.UsingContext ctx);

	void enterConnect(ContactParser.ConnectContext ctx);
	void exitConnect(ContactParser.ConnectContext ctx);

	void enterConnection_selector(ContactParser.Connection_selectorContext ctx);
	void exitConnection_selector(ContactParser.Connection_selectorContext ctx);

	void enterStore(ContactParser.StoreContext ctx);
	void exitStore(ContactParser.StoreContext ctx);

	void enterPair(ContactParser.PairContext ctx);
	void exitPair(ContactParser.PairContext ctx);

	void enterPairStringValue(ContactParser.PairStringValueContext ctx);
	void exitPairStringValue(ContactParser.PairStringValueContext ctx);

	void enterClusterid(ContactParser.ClusteridContext ctx);
	void exitClusterid(ContactParser.ClusteridContext ctx);

	void enterSet(ContactParser.SetContext ctx);
	void exitSet(ContactParser.SetContext ctx);

	void enterOptionslist(ContactParser.OptionslistContext ctx);
	void exitOptionslist(ContactParser.OptionslistContext ctx);

	void enterQuery2i(ContactParser.Query2iContext ctx);
	void exitQuery2i(ContactParser.Query2iContext ctx);

	void enterUse(ContactParser.UseContext ctx);
	void exitUse(ContactParser.UseContext ctx);

	void enterCode_string(ContactParser.Code_stringContext ctx);
	void exitCode_string(ContactParser.Code_stringContext ctx);

	void enterOp_with_options(ContactParser.Op_with_optionsContext ctx);
	void exitOp_with_options(ContactParser.Op_with_optionsContext ctx);

	void enterUseBucketOptions(ContactParser.UseBucketOptionsContext ctx);
	void exitUseBucketOptions(ContactParser.UseBucketOptionsContext ctx);

	void enterFetch_select(ContactParser.Fetch_selectContext ctx);
	void exitFetch_select(ContactParser.Fetch_selectContext ctx);

	void enterProg(ContactParser.ProgContext ctx);
	void exitProg(ContactParser.ProgContext ctx);

	void enterUser_content(ContactParser.User_contentContext ctx);
	void exitUser_content(ContactParser.User_contentContext ctx);

	void enterDelete(ContactParser.DeleteContext ctx);
	void exitDelete(ContactParser.DeleteContext ctx);

	void enterNoderef(ContactParser.NoderefContext ctx);
	void exitNoderef(ContactParser.NoderefContext ctx);

	void enterListbuckets(ContactParser.ListbucketsContext ctx);
	void exitListbuckets(ContactParser.ListbucketsContext ctx);

	void enterLoadscript(ContactParser.LoadscriptContext ctx);
	void exitLoadscript(ContactParser.LoadscriptContext ctx);

	void enterConnections(ContactParser.ConnectionsContext ctx);
	void exitConnections(ContactParser.ConnectionsContext ctx);

	void enterCountkeys(ContactParser.CountkeysContext ctx);
	void exitCountkeys(ContactParser.CountkeysContext ctx);

	void enterContent_string(ContactParser.Content_stringContext ctx);
	void exitContent_string(ContactParser.Content_stringContext ctx);

	void enterOptions(ContactParser.OptionsContext ctx);
	void exitOptions(ContactParser.OptionsContext ctx);

	void enterConsole_op(ContactParser.Console_opContext ctx);
	void exitConsole_op(ContactParser.Console_opContext ctx);

	void enterFetch(ContactParser.FetchContext ctx);
	void exitFetch(ContactParser.FetchContext ctx);

	void enterWith(ContactParser.WithContext ctx);
	void exitWith(ContactParser.WithContext ctx);

	void enterGet(ContactParser.GetContext ctx);
	void exitGet(ContactParser.GetContext ctx);

	void enterSet_action(ContactParser.Set_actionContext ctx);
	void exitSet_action(ContactParser.Set_actionContext ctx);

	void enterBucketprops(ContactParser.BucketpropsContext ctx);
	void exitBucketprops(ContactParser.BucketpropsContext ctx);

	void enterGet_bucketprops(ContactParser.Get_bucketpropsContext ctx);
	void exitGet_bucketprops(ContactParser.Get_bucketpropsContext ctx);

	void enterScript(ContactParser.ScriptContext ctx);
	void exitScript(ContactParser.ScriptContext ctx);

	void enterStat(ContactParser.StatContext ctx);
	void exitStat(ContactParser.StatContext ctx);

	void enterId_list(ContactParser.Id_listContext ctx);
	void exitId_list(ContactParser.Id_listContext ctx);

	void enterGet_action(ContactParser.Get_actionContext ctx);
	void exitGet_action(ContactParser.Get_actionContext ctx);

	void enterAssignment(ContactParser.AssignmentContext ctx);
	void exitAssignment(ContactParser.AssignmentContext ctx);

	void enterSet_bucketprops(ContactParser.Set_bucketpropsContext ctx);
	void exitSet_bucketprops(ContactParser.Set_bucketpropsContext ctx);

	void enterPairIntValue(ContactParser.PairIntValueContext ctx);
	void exitPairIntValue(ContactParser.PairIntValueContext ctx);

	void enterBool(ContactParser.BoolContext ctx);
	void exitBool(ContactParser.BoolContext ctx);

	void enterNode_name(ContactParser.Node_nameContext ctx);
	void exitNode_name(ContactParser.Node_nameContext ctx);

	void enterPairBoolValue(ContactParser.PairBoolValueContext ctx);
	void exitPairBoolValue(ContactParser.PairBoolValueContext ctx);
}