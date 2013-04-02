// Generated from ./src/main/java/com/basho/contact/parser/Contact.g4 by ANTLR 4.0
package com.basho.contact.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ContactParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LET=1, PB=2, HTTP=3, FETCH=4, STORE=5, DELETE=6, VALUE=7, CONN=8, CONNS=9, 
		CONNECT=10, USE=11, USING=12, WITH=13, AND=14, BUCKET=15, OPTIONS=16, 
		QUERY2I=17, COUNT=18, FROM=19, INDEX=20, TO=21, JAVASCRIPT=22, PROPERTIES=23, 
		LOAD=24, SCRIPT=25, LIST=26, BUCKETS=27, KEYS=28, TRUE=29, FALSE=30, DEFAULT=31, 
		SET=32, GET=33, ACTION=34, AS=35, JSON=36, TEXT=37, XML=38, AT=39, COMMA=40, 
		LSQUARE=41, RSQUARE=42, LPAREN=43, RPAREN=44, EQUALS=45, DOT=46, SEMI=47, 
		ID=48, INT=49, FLOAT=50, STRING=51, DATA_CONTENT=52, LINE_COMMENT=53, 
		COMMENT=54, WS=55;
	public static final String[] tokenNames = {
		"<INVALID>", "'let'", "'pb'", "'http'", "'fetch'", "'store'", "'delete'", 
		"'value'", "'connection'", "'connections'", "'connect'", "'use'", "'using'", 
		"'with'", "'and'", "'bucket'", "'options'", "'query2i'", "'count'", "'from'", 
		"'index'", "'to'", "'javascript'", "'properties'", "'load'", "'script'", 
		"'list'", "'buckets'", "'keys'", "'true'", "'false'", "'default'", "'set'", 
		"'get'", "'action'", "'as'", "'json'", "'text'", "'xml'", "'@'", "','", 
		"'['", "']'", "'('", "')'", "'='", "'.'", "';'", "ID", "INT", "FLOAT", 
		"STRING", "DATA_CONTENT", "LINE_COMMENT", "COMMENT", "WS"
	};
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_connection_selector = 2, RULE_console_op = 3, 
		RULE_connections = 4, RULE_assignment = 5, RULE_using = 6, RULE_with = 7, 
		RULE_op_with_options = 8, RULE_options = 9, RULE_listbuckets = 10, RULE_listkeys = 11, 
		RULE_countkeys = 12, RULE_optionslist = 13, RULE_fetch = 14, RULE_store = 15, 
		RULE_store_indexes = 16, RULE_content_string = 17, RULE_delete = 18, RULE_query2i = 19, 
		RULE_use = 20, RULE_useBucketOptions = 21, RULE_get_bucketprops = 22, 
		RULE_connect = 23, RULE_set = 24, RULE_set_action = 25, RULE_get = 26, 
		RULE_get_action = 27, RULE_loadscript = 28, RULE_script = 29, RULE_pair = 30, 
		RULE_pairValue = 31, RULE_code_string = 32, RULE_bool = 33;
	public static final String[] ruleNames = {
		"prog", "stat", "connection_selector", "console_op", "connections", "assignment", 
		"using", "with", "op_with_options", "options", "listbuckets", "listkeys", 
		"countkeys", "optionslist", "fetch", "store", "store_indexes", "content_string", 
		"delete", "query2i", "use", "useBucketOptions", "get_bucketprops", "connect", 
		"set", "set_action", "get", "get_action", "loadscript", "script", "pair", 
		"pairValue", "code_string", "bool"
	};

	@Override
	public String getGrammarFileName() { return "Contact.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public ContactParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public TerminalNode EOF() { return getToken(ContactParser.EOF, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(68); stat();
				}
				}
				setState(71); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LET) | (1L << FETCH) | (1L << STORE) | (1L << DELETE) | (1L << CONNS) | (1L << CONNECT) | (1L << USE) | (1L << USING) | (1L << QUERY2I) | (1L << COUNT) | (1L << LOAD) | (1L << SCRIPT) | (1L << LIST) | (1L << SET) | (1L << GET))) != 0) );
			setState(73); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatContext extends ParserRuleContext {
		public Console_opContext console_op() {
			return getRuleContext(Console_opContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public UsingContext using() {
			return getRuleContext(UsingContext.class,0);
		}
		public Connection_selectorContext connection_selector() {
			return getRuleContext(Connection_selectorContext.class,0);
		}
		public ConnectContext connect() {
			return getRuleContext(ConnectContext.class,0);
		}
		public ListbucketsContext listbuckets() {
			return getRuleContext(ListbucketsContext.class,0);
		}
		public UseContext use() {
			return getRuleContext(UseContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ContactParser.SEMI, 0); }
		public ConnectionsContext connections() {
			return getRuleContext(ConnectionsContext.class,0);
		}
		public Op_with_optionsContext op_with_options() {
			return getRuleContext(Op_with_optionsContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitStat(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_la = _input.LA(1);
			if (_la==LET) {
				{
				setState(75); assignment();
				}
			}

			setState(85);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(78); connect();
				}
				break;

			case 2:
				{
				setState(79); use();
				}
				break;

			case 3:
				{
				setState(80); using();
				}
				break;

			case 4:
				{
				setState(81); op_with_options();
				}
				break;

			case 5:
				{
				setState(82); listbuckets();
				}
				break;

			case 6:
				{
				setState(83); console_op();
				}
				break;

			case 7:
				{
				setState(84); connections();
				}
				break;
			}
			setState(88);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(87); connection_selector();
				}
			}

			setState(90); match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Connection_selectorContext extends ParserRuleContext {
		public Token connname;
		public TerminalNode AT() { return getToken(ContactParser.AT, 0); }
		public TerminalNode ID() { return getToken(ContactParser.ID, 0); }
		public Connection_selectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_connection_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterConnection_selector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitConnection_selector(this);
		}
	}

	public final Connection_selectorContext connection_selector() throws RecognitionException {
		Connection_selectorContext _localctx = new Connection_selectorContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_connection_selector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92); match(AT);
			setState(93); ((Connection_selectorContext)_localctx).connname = match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Console_opContext extends ParserRuleContext {
		public GetContext get() {
			return getRuleContext(GetContext.class,0);
		}
		public SetContext set() {
			return getRuleContext(SetContext.class,0);
		}
		public LoadscriptContext loadscript() {
			return getRuleContext(LoadscriptContext.class,0);
		}
		public ScriptContext script() {
			return getRuleContext(ScriptContext.class,0);
		}
		public Console_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_console_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterConsole_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitConsole_op(this);
		}
	}

	public final Console_opContext console_op() throws RecognitionException {
		Console_opContext _localctx = new Console_opContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_console_op);
		try {
			setState(99);
			switch (_input.LA(1)) {
			case GET:
				enterOuterAlt(_localctx, 1);
				{
				setState(95); get();
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 2);
				{
				setState(96); set();
				}
				break;
			case LOAD:
				enterOuterAlt(_localctx, 3);
				{
				setState(97); loadscript();
				}
				break;
			case SCRIPT:
				enterOuterAlt(_localctx, 4);
				{
				setState(98); script();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConnectionsContext extends ParserRuleContext {
		public TerminalNode CONNS() { return getToken(ContactParser.CONNS, 0); }
		public ConnectionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_connections; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterConnections(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitConnections(this);
		}
	}

	public final ConnectionsContext connections() throws RecognitionException {
		ConnectionsContext _localctx = new ConnectionsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_connections);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101); match(CONNS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public Token name;
		public TerminalNode EQUALS() { return getToken(ContactParser.EQUALS, 0); }
		public TerminalNode ID() { return getToken(ContactParser.ID, 0); }
		public TerminalNode LET() { return getToken(ContactParser.LET, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103); match(LET);
			setState(104); ((AssignmentContext)_localctx).name = match(ID);
			setState(105); match(EQUALS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UsingContext extends ParserRuleContext {
		public Token bucket;
		public TerminalNode BUCKET() { return getToken(ContactParser.BUCKET, 0); }
		public TerminalNode USING() { return getToken(ContactParser.USING, 0); }
		public TerminalNode STRING() { return getToken(ContactParser.STRING, 0); }
		public Op_with_optionsContext op_with_options() {
			return getRuleContext(Op_with_optionsContext.class,0);
		}
		public UsingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_using; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterUsing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitUsing(this);
		}
	}

	public final UsingContext using() throws RecognitionException {
		UsingContext _localctx = new UsingContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_using);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107); match(USING);
			setState(108); match(BUCKET);
			setState(109); ((UsingContext)_localctx).bucket = match(STRING);
			setState(110); op_with_options();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WithContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(ContactParser.AND, 0); }
		public TerminalNode WITH() { return getToken(ContactParser.WITH, 0); }
		public WithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterWith(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitWith(this);
		}
	}

	public final WithContext with() throws RecognitionException {
		WithContext _localctx = new WithContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_with);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_la = _input.LA(1);
			if ( !(_la==WITH || _la==AND) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_with_optionsContext extends ParserRuleContext {
		public ListkeysContext listkeys() {
			return getRuleContext(ListkeysContext.class,0);
		}
		public FetchContext fetch() {
			return getRuleContext(FetchContext.class,0);
		}
		public StoreContext store() {
			return getRuleContext(StoreContext.class,0);
		}
		public Query2iContext query2i() {
			return getRuleContext(Query2iContext.class,0);
		}
		public DeleteContext delete() {
			return getRuleContext(DeleteContext.class,0);
		}
		public Get_bucketpropsContext get_bucketprops() {
			return getRuleContext(Get_bucketpropsContext.class,0);
		}
		public CountkeysContext countkeys() {
			return getRuleContext(CountkeysContext.class,0);
		}
		public OptionsContext options() {
			return getRuleContext(OptionsContext.class,0);
		}
		public Op_with_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_with_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterOp_with_options(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitOp_with_options(this);
		}
	}

	public final Op_with_optionsContext op_with_options() throws RecognitionException {
		Op_with_optionsContext _localctx = new Op_with_optionsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_op_with_options);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			switch (_input.LA(1)) {
			case FETCH:
				{
				setState(114); fetch();
				}
				break;
			case STORE:
				{
				setState(115); store();
				}
				break;
			case DELETE:
				{
				setState(116); delete();
				}
				break;
			case QUERY2I:
				{
				setState(117); query2i();
				}
				break;
			case LIST:
				{
				setState(118); listkeys();
				}
				break;
			case COUNT:
				{
				setState(119); countkeys();
				}
				break;
			case GET:
				{
				setState(120); get_bucketprops();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(124);
			_la = _input.LA(1);
			if (_la==WITH || _la==AND) {
				{
				setState(123); options();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionsContext extends ParserRuleContext {
		public WithContext with() {
			return getRuleContext(WithContext.class,0);
		}
		public OptionslistContext optionslist() {
			return getRuleContext(OptionslistContext.class,0);
		}
		public TerminalNode ID() { return getToken(ContactParser.ID, 0); }
		public TerminalNode OPTIONS() { return getToken(ContactParser.OPTIONS, 0); }
		public OptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterOptions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitOptions(this);
		}
	}

	public final OptionsContext options() throws RecognitionException {
		OptionsContext _localctx = new OptionsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_options);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126); with();
			setState(127); match(OPTIONS);
			setState(130);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(128); optionslist();
				}
				break;

			case 2:
				{
				setState(129); match(ID);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListbucketsContext extends ParserRuleContext {
		public TerminalNode LIST() { return getToken(ContactParser.LIST, 0); }
		public TerminalNode BUCKETS() { return getToken(ContactParser.BUCKETS, 0); }
		public ListbucketsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listbuckets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterListbuckets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitListbuckets(this);
		}
	}

	public final ListbucketsContext listbuckets() throws RecognitionException {
		ListbucketsContext _localctx = new ListbucketsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_listbuckets);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132); match(LIST);
			setState(133); match(BUCKETS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListkeysContext extends ParserRuleContext {
		public TerminalNode KEYS() { return getToken(ContactParser.KEYS, 0); }
		public TerminalNode LIST() { return getToken(ContactParser.LIST, 0); }
		public ListkeysContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listkeys; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterListkeys(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitListkeys(this);
		}
	}

	public final ListkeysContext listkeys() throws RecognitionException {
		ListkeysContext _localctx = new ListkeysContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_listkeys);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135); match(LIST);
			setState(136); match(KEYS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CountkeysContext extends ParserRuleContext {
		public TerminalNode COUNT() { return getToken(ContactParser.COUNT, 0); }
		public TerminalNode KEYS() { return getToken(ContactParser.KEYS, 0); }
		public CountkeysContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_countkeys; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterCountkeys(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitCountkeys(this);
		}
	}

	public final CountkeysContext countkeys() throws RecognitionException {
		CountkeysContext _localctx = new CountkeysContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_countkeys);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138); match(COUNT);
			setState(139); match(KEYS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionslistContext extends ParserRuleContext {
		public PairContext pair;
		public List<PairContext> opts = new ArrayList<PairContext>();
		public TerminalNode COMMA(int i) {
			return getToken(ContactParser.COMMA, i);
		}
		public List<PairContext> pair() {
			return getRuleContexts(PairContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(ContactParser.COMMA); }
		public PairContext pair(int i) {
			return getRuleContext(PairContext.class,i);
		}
		public OptionslistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionslist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterOptionslist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitOptionslist(this);
		}
	}

	public final OptionslistContext optionslist() throws RecognitionException {
		OptionslistContext _localctx = new OptionslistContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_optionslist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141); ((OptionslistContext)_localctx).pair = pair();
			((OptionslistContext)_localctx).opts.add(((OptionslistContext)_localctx).pair);
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(142); match(COMMA);
				setState(143); ((OptionslistContext)_localctx).pair = pair();
				((OptionslistContext)_localctx).opts.add(((OptionslistContext)_localctx).pair);
				}
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FetchContext extends ParserRuleContext {
		public Token key;
		public TerminalNode FETCH() { return getToken(ContactParser.FETCH, 0); }
		public TerminalNode STRING() { return getToken(ContactParser.STRING, 0); }
		public FetchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fetch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterFetch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitFetch(this);
		}
	}

	public final FetchContext fetch() throws RecognitionException {
		FetchContext _localctx = new FetchContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_fetch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149); match(FETCH);
			setState(150); ((FetchContext)_localctx).key = match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StoreContext extends ParserRuleContext {
		public Token key;
		public Token existing_obj;
		public Store_indexesContext store_indexes() {
			return getRuleContext(Store_indexesContext.class,0);
		}
		public WithContext with() {
			return getRuleContext(WithContext.class,0);
		}
		public TerminalNode ID() { return getToken(ContactParser.ID, 0); }
		public TerminalNode STORE() { return getToken(ContactParser.STORE, 0); }
		public TerminalNode STRING() { return getToken(ContactParser.STRING, 0); }
		public Content_stringContext content_string() {
			return getRuleContext(Content_stringContext.class,0);
		}
		public StoreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_store; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterStore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitStore(this);
		}
	}

	public final StoreContext store() throws RecognitionException {
		StoreContext _localctx = new StoreContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_store);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152); match(STORE);
			setState(155);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(153); ((StoreContext)_localctx).key = match(STRING);
				}
				break;
			case ID:
				{
				setState(154); ((StoreContext)_localctx).existing_obj = match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(157); store_indexes();
			setState(158); with();
			setState(159); content_string();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Store_indexesContext extends ParserRuleContext {
		public List<TerminalNode> INDEX() { return getTokens(ContactParser.INDEX); }
		public List<WithContext> with() {
			return getRuleContexts(WithContext.class);
		}
		public List<PairContext> pair() {
			return getRuleContexts(PairContext.class);
		}
		public WithContext with(int i) {
			return getRuleContext(WithContext.class,i);
		}
		public PairContext pair(int i) {
			return getRuleContext(PairContext.class,i);
		}
		public TerminalNode INDEX(int i) {
			return getToken(ContactParser.INDEX, i);
		}
		public Store_indexesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_store_indexes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterStore_indexes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitStore_indexes(this);
		}
	}

	public final Store_indexesContext store_indexes() throws RecognitionException {
		Store_indexesContext _localctx = new Store_indexesContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_store_indexes);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(161); with();
					setState(162); match(INDEX);
					setState(163); pair();
					}
					} 
				}
				setState(169);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Content_stringContext extends ParserRuleContext {
		public TerminalNode JSON() { return getToken(ContactParser.JSON, 0); }
		public TerminalNode TEXT() { return getToken(ContactParser.TEXT, 0); }
		public TerminalNode XML() { return getToken(ContactParser.XML, 0); }
		public TerminalNode DATA_CONTENT() { return getToken(ContactParser.DATA_CONTENT, 0); }
		public TerminalNode STRING() { return getToken(ContactParser.STRING, 0); }
		public Content_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterContent_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitContent_string(this);
		}
	}

	public final Content_stringContext content_string() throws RecognitionException {
		Content_stringContext _localctx = new Content_stringContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_content_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JSON) | (1L << TEXT) | (1L << XML))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(171);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==DATA_CONTENT) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeleteContext extends ParserRuleContext {
		public Token key;
		public TerminalNode DELETE() { return getToken(ContactParser.DELETE, 0); }
		public TerminalNode STRING() { return getToken(ContactParser.STRING, 0); }
		public DeleteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterDelete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitDelete(this);
		}
	}

	public final DeleteContext delete() throws RecognitionException {
		DeleteContext _localctx = new DeleteContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_delete);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173); match(DELETE);
			setState(174); ((DeleteContext)_localctx).key = match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Query2iContext extends ParserRuleContext {
		public Token index;
		public Token exact;
		public Token vmin;
		public Token vmax;
		public TerminalNode INDEX() { return getToken(ContactParser.INDEX, 0); }
		public List<WithContext> with() {
			return getRuleContexts(WithContext.class);
		}
		public TerminalNode STRING(int i) {
			return getToken(ContactParser.STRING, i);
		}
		public TerminalNode FETCH() { return getToken(ContactParser.FETCH, 0); }
		public WithContext with(int i) {
			return getRuleContext(WithContext.class,i);
		}
		public TerminalNode VALUE() { return getToken(ContactParser.VALUE, 0); }
		public TerminalNode AND() { return getToken(ContactParser.AND, 0); }
		public TerminalNode TO() { return getToken(ContactParser.TO, 0); }
		public TerminalNode FROM() { return getToken(ContactParser.FROM, 0); }
		public TerminalNode QUERY2I() { return getToken(ContactParser.QUERY2I, 0); }
		public List<TerminalNode> STRING() { return getTokens(ContactParser.STRING); }
		public Query2iContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query2i; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterQuery2i(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitQuery2i(this);
		}
	}

	public final Query2iContext query2i() throws RecognitionException {
		Query2iContext _localctx = new Query2iContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_query2i);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176); match(QUERY2I);
			setState(179);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(177); match(AND);
				setState(178); match(FETCH);
				}
				break;
			}
			setState(181); with();
			setState(182); match(INDEX);
			setState(183); ((Query2iContext)_localctx).index = match(STRING);
			setState(192);
			switch (_input.LA(1)) {
			case WITH:
			case AND:
				{
				setState(184); with();
				setState(185); match(VALUE);
				setState(186); ((Query2iContext)_localctx).exact = match(STRING);
				}
				break;
			case FROM:
				{
				setState(188); match(FROM);
				setState(189); ((Query2iContext)_localctx).vmin = match(STRING);
				setState(190); match(TO);
				setState(191); ((Query2iContext)_localctx).vmax = match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UseContext extends ParserRuleContext {
		public Token name;
		public Token var;
		public TerminalNode BUCKET() { return getToken(ContactParser.BUCKET, 0); }
		public TerminalNode USE() { return getToken(ContactParser.USE, 0); }
		public TerminalNode CONN() { return getToken(ContactParser.CONN, 0); }
		public TerminalNode ID() { return getToken(ContactParser.ID, 0); }
		public TerminalNode STRING() { return getToken(ContactParser.STRING, 0); }
		public UseBucketOptionsContext useBucketOptions() {
			return getRuleContext(UseBucketOptionsContext.class,0);
		}
		public UseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_use; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterUse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitUse(this);
		}
	}

	public final UseContext use() throws RecognitionException {
		UseContext _localctx = new UseContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_use);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194); match(USE);
			setState(202);
			switch (_input.LA(1)) {
			case BUCKET:
				{
				{
				setState(195); match(BUCKET);
				setState(196); ((UseContext)_localctx).name = match(STRING);
				setState(198);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(197); useBucketOptions();
					}
					break;
				}
				}
				}
				break;
			case CONN:
				{
				{
				setState(200); match(CONN);
				setState(201); ((UseContext)_localctx).var = match(ID);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UseBucketOptionsContext extends ParserRuleContext {
		public OptionslistContext fetchOptions;
		public OptionslistContext storeOptions;
		public OptionslistContext deleteOptions;
		public OptionslistContext query2iOptions;
		public List<WithContext> with() {
			return getRuleContexts(WithContext.class);
		}
		public TerminalNode DELETE() { return getToken(ContactParser.DELETE, 0); }
		public TerminalNode OPTIONS(int i) {
			return getToken(ContactParser.OPTIONS, i);
		}
		public List<OptionslistContext> optionslist() {
			return getRuleContexts(OptionslistContext.class);
		}
		public TerminalNode FETCH() { return getToken(ContactParser.FETCH, 0); }
		public WithContext with(int i) {
			return getRuleContext(WithContext.class,i);
		}
		public TerminalNode QUERY2I() { return getToken(ContactParser.QUERY2I, 0); }
		public OptionslistContext optionslist(int i) {
			return getRuleContext(OptionslistContext.class,i);
		}
		public TerminalNode STORE() { return getToken(ContactParser.STORE, 0); }
		public List<TerminalNode> OPTIONS() { return getTokens(ContactParser.OPTIONS); }
		public UseBucketOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useBucketOptions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterUseBucketOptions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitUseBucketOptions(this);
		}
	}

	public final UseBucketOptionsContext useBucketOptions() throws RecognitionException {
		UseBucketOptionsContext _localctx = new UseBucketOptionsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_useBucketOptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(204); with();
				setState(205); match(FETCH);
				setState(206); match(OPTIONS);
				setState(207); ((UseBucketOptionsContext)_localctx).fetchOptions = optionslist();
				}
				break;
			}
			setState(216);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(211); with();
				setState(212); match(STORE);
				setState(213); match(OPTIONS);
				setState(214); ((UseBucketOptionsContext)_localctx).storeOptions = optionslist();
				}
				break;
			}
			setState(223);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(218); with();
				setState(219); match(DELETE);
				setState(220); match(OPTIONS);
				setState(221); ((UseBucketOptionsContext)_localctx).deleteOptions = optionslist();
				}
				break;
			}
			setState(230);
			_la = _input.LA(1);
			if (_la==WITH || _la==AND) {
				{
				setState(225); with();
				setState(226); match(QUERY2I);
				setState(227); match(OPTIONS);
				setState(228); ((UseBucketOptionsContext)_localctx).query2iOptions = optionslist();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Get_bucketpropsContext extends ParserRuleContext {
		public TerminalNode GET() { return getToken(ContactParser.GET, 0); }
		public TerminalNode PROPERTIES() { return getToken(ContactParser.PROPERTIES, 0); }
		public Get_bucketpropsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_bucketprops; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterGet_bucketprops(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitGet_bucketprops(this);
		}
	}

	public final Get_bucketpropsContext get_bucketprops() throws RecognitionException {
		Get_bucketpropsContext _localctx = new Get_bucketpropsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_get_bucketprops);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232); match(GET);
			setState(233); match(PROPERTIES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConnectContext extends ParserRuleContext {
		public Token host;
		public Token pbport;
		public Token httpport;
		public Token connname;
		public TerminalNode AS() { return getToken(ContactParser.AS, 0); }
		public List<TerminalNode> INT() { return getTokens(ContactParser.INT); }
		public TerminalNode HTTP() { return getToken(ContactParser.HTTP, 0); }
		public TerminalNode ID() { return getToken(ContactParser.ID, 0); }
		public TerminalNode CONNECT() { return getToken(ContactParser.CONNECT, 0); }
		public TerminalNode INT(int i) {
			return getToken(ContactParser.INT, i);
		}
		public TerminalNode STRING() { return getToken(ContactParser.STRING, 0); }
		public TerminalNode PB() { return getToken(ContactParser.PB, 0); }
		public TerminalNode DEFAULT() { return getToken(ContactParser.DEFAULT, 0); }
		public ConnectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_connect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterConnect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitConnect(this);
		}
	}

	public final ConnectContext connect() throws RecognitionException {
		ConnectContext _localctx = new ConnectContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_connect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235); match(CONNECT);
			setState(244);
			switch (_input.LA(1)) {
			case DEFAULT:
				{
				setState(236); match(DEFAULT);
				}
				break;
			case STRING:
				{
				setState(237); ((ConnectContext)_localctx).host = match(STRING);
				setState(238); match(PB);
				setState(239); ((ConnectContext)_localctx).pbport = match(INT);
				setState(242);
				_la = _input.LA(1);
				if (_la==HTTP) {
					{
					setState(240); match(HTTP);
					setState(241); ((ConnectContext)_localctx).httpport = match(INT);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(248);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(246); match(AS);
				setState(247); ((ConnectContext)_localctx).connname = match(ID);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(ContactParser.SET, 0); }
		public Set_actionContext set_action() {
			return getRuleContext(Set_actionContext.class,0);
		}
		public SetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitSet(this);
		}
	}

	public final SetContext set() throws RecognitionException {
		SetContext _localctx = new SetContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250); match(SET);
			setState(251); set_action();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_actionContext extends ParserRuleContext {
		public Token actionname;
		public TerminalNode ID() { return getToken(ContactParser.ID, 0); }
		public Code_stringContext code_string() {
			return getRuleContext(Code_stringContext.class,0);
		}
		public TerminalNode ACTION() { return getToken(ContactParser.ACTION, 0); }
		public TerminalNode WITH() { return getToken(ContactParser.WITH, 0); }
		public Set_actionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterSet_action(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitSet_action(this);
		}
	}

	public final Set_actionContext set_action() throws RecognitionException {
		Set_actionContext _localctx = new Set_actionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_set_action);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253); match(ACTION);
			setState(254); ((Set_actionContext)_localctx).actionname = match(ID);
			setState(255); match(WITH);
			setState(256); code_string();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GetContext extends ParserRuleContext {
		public TerminalNode BUCKET() { return getToken(ContactParser.BUCKET, 0); }
		public Get_actionContext get_action() {
			return getRuleContext(Get_actionContext.class,0);
		}
		public TerminalNode GET() { return getToken(ContactParser.GET, 0); }
		public GetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterGet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitGet(this);
		}
	}

	public final GetContext get() throws RecognitionException {
		GetContext _localctx = new GetContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_get);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258); match(GET);
			setState(261);
			switch (_input.LA(1)) {
			case ACTION:
				{
				setState(259); get_action();
				}
				break;
			case BUCKET:
				{
				setState(260); match(BUCKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Get_actionContext extends ParserRuleContext {
		public Token actionname;
		public TerminalNode ID() { return getToken(ContactParser.ID, 0); }
		public TerminalNode ACTION() { return getToken(ContactParser.ACTION, 0); }
		public Get_actionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterGet_action(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitGet_action(this);
		}
	}

	public final Get_actionContext get_action() throws RecognitionException {
		Get_actionContext _localctx = new Get_actionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_get_action);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263); match(ACTION);
			setState(264); ((Get_actionContext)_localctx).actionname = match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoadscriptContext extends ParserRuleContext {
		public Token filename;
		public TerminalNode SCRIPT() { return getToken(ContactParser.SCRIPT, 0); }
		public TerminalNode STRING() { return getToken(ContactParser.STRING, 0); }
		public TerminalNode LOAD() { return getToken(ContactParser.LOAD, 0); }
		public LoadscriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loadscript; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterLoadscript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitLoadscript(this);
		}
	}

	public final LoadscriptContext loadscript() throws RecognitionException {
		LoadscriptContext _localctx = new LoadscriptContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_loadscript);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266); match(LOAD);
			setState(267); match(SCRIPT);
			setState(268); ((LoadscriptContext)_localctx).filename = match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScriptContext extends ParserRuleContext {
		public Token content;
		public TerminalNode SCRIPT() { return getToken(ContactParser.SCRIPT, 0); }
		public TerminalNode DATA_CONTENT() { return getToken(ContactParser.DATA_CONTENT, 0); }
		public TerminalNode STRING() { return getToken(ContactParser.STRING, 0); }
		public ScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitScript(this);
		}
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_script);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270); match(SCRIPT);
			setState(271);
			((ScriptContext)_localctx).content = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==DATA_CONTENT) ) {
				((ScriptContext)_localctx).content = (Token)_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PairContext extends ParserRuleContext {
		public Token name;
		public Token id;
		public TerminalNode EQUALS() { return getToken(ContactParser.EQUALS, 0); }
		public TerminalNode ID() { return getToken(ContactParser.ID, 0); }
		public PairValueContext pairValue() {
			return getRuleContext(PairValueContext.class,0);
		}
		public TerminalNode STRING() { return getToken(ContactParser.STRING, 0); }
		public PairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitPair(this);
		}
	}

	public final PairContext pair() throws RecognitionException {
		PairContext _localctx = new PairContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(273); ((PairContext)_localctx).name = match(STRING);
				}
				break;
			case ID:
				{
				setState(274); ((PairContext)_localctx).id = match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(277); match(EQUALS);
			setState(278); pairValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PairValueContext extends ParserRuleContext {
		public PairValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pairValue; }
	 
		public PairValueContext() { }
		public void copyFrom(PairValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PairStringValueContext extends PairValueContext {
		public Token stringValue;
		public TerminalNode STRING() { return getToken(ContactParser.STRING, 0); }
		public PairStringValueContext(PairValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterPairStringValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitPairStringValue(this);
		}
	}
	public static class PairIntValueContext extends PairValueContext {
		public Token intValue;
		public TerminalNode INT() { return getToken(ContactParser.INT, 0); }
		public PairIntValueContext(PairValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterPairIntValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitPairIntValue(this);
		}
	}
	public static class PairBoolValueContext extends PairValueContext {
		public BoolContext boolValue;
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public PairBoolValueContext(PairValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterPairBoolValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitPairBoolValue(this);
		}
	}

	public final PairValueContext pairValue() throws RecognitionException {
		PairValueContext _localctx = new PairValueContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_pairValue);
		try {
			setState(283);
			switch (_input.LA(1)) {
			case STRING:
				_localctx = new PairStringValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(280); ((PairStringValueContext)_localctx).stringValue = match(STRING);
				}
				break;
			case INT:
				_localctx = new PairIntValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(281); ((PairIntValueContext)_localctx).intValue = match(INT);
				}
				break;
			case TRUE:
			case FALSE:
				_localctx = new PairBoolValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(282); ((PairBoolValueContext)_localctx).boolValue = bool();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Code_stringContext extends ParserRuleContext {
		public TerminalNode JAVASCRIPT() { return getToken(ContactParser.JAVASCRIPT, 0); }
		public TerminalNode DATA_CONTENT() { return getToken(ContactParser.DATA_CONTENT, 0); }
		public TerminalNode STRING() { return getToken(ContactParser.STRING, 0); }
		public Code_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterCode_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitCode_string(this);
		}
	}

	public final Code_stringContext code_string() throws RecognitionException {
		Code_stringContext _localctx = new Code_stringContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_code_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285); match(JAVASCRIPT);
			setState(286);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==DATA_CONTENT) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolContext extends ParserRuleContext {
		public TerminalNode FALSE() { return getToken(ContactParser.FALSE, 0); }
		public TerminalNode TRUE() { return getToken(ContactParser.TRUE, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ContactListener ) ((ContactListener)listener).exitBool(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\2\39\u0125\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
		"\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36"+
		"\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\3\2\6\2H\n\2\r\2\16\2I\3\2\3\2\3"+
		"\3\5\3O\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3X\n\3\3\3\5\3[\n\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5f\n\5\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n|\n\n\3\n\5\n\177"+
		"\n\n\3\13\3\13\3\13\3\13\5\13\u0085\n\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\7\17\u0093\n\17\f\17\16\17\u0096\13\17\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\5\21\u009e\n\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\7\22\u00a8\n\22\f\22\16\22\u00ab\13\22\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\5\25\u00b6\n\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\5\25\u00c3\n\25\3\26\3\26\3\26\3\26\5\26\u00c9"+
		"\n\26\3\26\3\26\5\26\u00cd\n\26\3\27\3\27\3\27\3\27\3\27\5\27\u00d4\n"+
		"\27\3\27\3\27\3\27\3\27\3\27\5\27\u00db\n\27\3\27\3\27\3\27\3\27\3\27"+
		"\5\27\u00e2\n\27\3\27\3\27\3\27\3\27\3\27\5\27\u00e9\n\27\3\30\3\30\3"+
		"\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u00f5\n\31\5\31\u00f7\n\31"+
		"\3\31\3\31\5\31\u00fb\n\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\5\34\u0108\n\34\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3 \3 \5 \u0116\n \3 \3 \3 \3!\3!\3!\5!\u011e\n!\3\"\3\"\3\"\3#\3"+
		"#\3#\2$\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:"+
		"<>@BD\2\b\3\17\20\3&(\3\65\66\3\65\66\3\65\66\3\37 \u0128\2G\3\2\2\2\4"+
		"N\3\2\2\2\6^\3\2\2\2\be\3\2\2\2\ng\3\2\2\2\fi\3\2\2\2\16m\3\2\2\2\20r"+
		"\3\2\2\2\22{\3\2\2\2\24\u0080\3\2\2\2\26\u0086\3\2\2\2\30\u0089\3\2\2"+
		"\2\32\u008c\3\2\2\2\34\u008f\3\2\2\2\36\u0097\3\2\2\2 \u009a\3\2\2\2\""+
		"\u00a9\3\2\2\2$\u00ac\3\2\2\2&\u00af\3\2\2\2(\u00b2\3\2\2\2*\u00c4\3\2"+
		"\2\2,\u00d3\3\2\2\2.\u00ea\3\2\2\2\60\u00ed\3\2\2\2\62\u00fc\3\2\2\2\64"+
		"\u00ff\3\2\2\2\66\u0104\3\2\2\28\u0109\3\2\2\2:\u010c\3\2\2\2<\u0110\3"+
		"\2\2\2>\u0115\3\2\2\2@\u011d\3\2\2\2B\u011f\3\2\2\2D\u0122\3\2\2\2FH\5"+
		"\4\3\2GF\3\2\2\2HI\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JK\3\2\2\2KL\7\1\2\2L\3"+
		"\3\2\2\2MO\5\f\7\2NM\3\2\2\2NO\3\2\2\2OW\3\2\2\2PX\5\60\31\2QX\5*\26\2"+
		"RX\5\16\b\2SX\5\22\n\2TX\5\26\f\2UX\5\b\5\2VX\5\n\6\2WP\3\2\2\2WQ\3\2"+
		"\2\2WR\3\2\2\2WS\3\2\2\2WT\3\2\2\2WU\3\2\2\2WV\3\2\2\2XZ\3\2\2\2Y[\5\6"+
		"\4\2ZY\3\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\]\7\61\2\2]\5\3\2\2\2^_\7)\2\2_`"+
		"\7\62\2\2`\7\3\2\2\2af\5\66\34\2bf\5\62\32\2cf\5:\36\2df\5<\37\2ea\3\2"+
		"\2\2eb\3\2\2\2ec\3\2\2\2ed\3\2\2\2f\t\3\2\2\2gh\7\13\2\2h\13\3\2\2\2i"+
		"j\7\3\2\2jk\7\62\2\2kl\7/\2\2l\r\3\2\2\2mn\7\16\2\2no\7\21\2\2op\7\65"+
		"\2\2pq\5\22\n\2q\17\3\2\2\2rs\t\2\2\2s\21\3\2\2\2t|\5\36\20\2u|\5 \21"+
		"\2v|\5&\24\2w|\5(\25\2x|\5\30\r\2y|\5\32\16\2z|\5.\30\2{t\3\2\2\2{u\3"+
		"\2\2\2{v\3\2\2\2{w\3\2\2\2{x\3\2\2\2{y\3\2\2\2{z\3\2\2\2|~\3\2\2\2}\177"+
		"\5\24\13\2~}\3\2\2\2~\177\3\2\2\2\177\23\3\2\2\2\u0080\u0081\5\20\t\2"+
		"\u0081\u0084\7\22\2\2\u0082\u0085\5\34\17\2\u0083\u0085\7\62\2\2\u0084"+
		"\u0082\3\2\2\2\u0084\u0083\3\2\2\2\u0085\25\3\2\2\2\u0086\u0087\7\34\2"+
		"\2\u0087\u0088\7\35\2\2\u0088\27\3\2\2\2\u0089\u008a\7\34\2\2\u008a\u008b"+
		"\7\36\2\2\u008b\31\3\2\2\2\u008c\u008d\7\24\2\2\u008d\u008e\7\36\2\2\u008e"+
		"\33\3\2\2\2\u008f\u0094\5> \2\u0090\u0091\7*\2\2\u0091\u0093\5> \2\u0092"+
		"\u0090\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2"+
		"\2\2\u0095\35\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0098\7\6\2\2\u0098\u0099"+
		"\7\65\2\2\u0099\37\3\2\2\2\u009a\u009d\7\7\2\2\u009b\u009e\7\65\2\2\u009c"+
		"\u009e\7\62\2\2\u009d\u009b\3\2\2\2\u009d\u009c\3\2\2\2\u009e\u009f\3"+
		"\2\2\2\u009f\u00a0\5\"\22\2\u00a0\u00a1\5\20\t\2\u00a1\u00a2\5$\23\2\u00a2"+
		"!\3\2\2\2\u00a3\u00a4\5\20\t\2\u00a4\u00a5\7\26\2\2\u00a5\u00a6\5> \2"+
		"\u00a6\u00a8\3\2\2\2\u00a7\u00a3\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7"+
		"\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa#\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac"+
		"\u00ad\t\3\2\2\u00ad\u00ae\t\4\2\2\u00ae%\3\2\2\2\u00af\u00b0\7\b\2\2"+
		"\u00b0\u00b1\7\65\2\2\u00b1\'\3\2\2\2\u00b2\u00b5\7\23\2\2\u00b3\u00b4"+
		"\7\20\2\2\u00b4\u00b6\7\6\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2"+
		"\u00b6\u00b7\3\2\2\2\u00b7\u00b8\5\20\t\2\u00b8\u00b9\7\26\2\2\u00b9\u00c2"+
		"\7\65\2\2\u00ba\u00bb\5\20\t\2\u00bb\u00bc\7\t\2\2\u00bc\u00bd\7\65\2"+
		"\2\u00bd\u00c3\3\2\2\2\u00be\u00bf\7\25\2\2\u00bf\u00c0\7\65\2\2\u00c0"+
		"\u00c1\7\27\2\2\u00c1\u00c3\7\65\2\2\u00c2\u00ba\3\2\2\2\u00c2\u00be\3"+
		"\2\2\2\u00c3)\3\2\2\2\u00c4\u00cc\7\r\2\2\u00c5\u00c6\7\21\2\2\u00c6\u00c8"+
		"\7\65\2\2\u00c7\u00c9\5,\27\2\u00c8\u00c7\3\2\2\2\u00c8\u00c9\3\2\2\2"+
		"\u00c9\u00cd\3\2\2\2\u00ca\u00cb\7\n\2\2\u00cb\u00cd\7\62\2\2\u00cc\u00c5"+
		"\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd+\3\2\2\2\u00ce\u00cf\5\20\t\2\u00cf"+
		"\u00d0\7\6\2\2\u00d0\u00d1\7\22\2\2\u00d1\u00d2\5\34\17\2\u00d2\u00d4"+
		"\3\2\2\2\u00d3\u00ce\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00da\3\2\2\2\u00d5"+
		"\u00d6\5\20\t\2\u00d6\u00d7\7\7\2\2\u00d7\u00d8\7\22\2\2\u00d8\u00d9\5"+
		"\34\17\2\u00d9\u00db\3\2\2\2\u00da\u00d5\3\2\2\2\u00da\u00db\3\2\2\2\u00db"+
		"\u00e1\3\2\2\2\u00dc\u00dd\5\20\t\2\u00dd\u00de\7\b\2\2\u00de\u00df\7"+
		"\22\2\2\u00df\u00e0\5\34\17\2\u00e0\u00e2\3\2\2\2\u00e1\u00dc\3\2\2\2"+
		"\u00e1\u00e2\3\2\2\2\u00e2\u00e8\3\2\2\2\u00e3\u00e4\5\20\t\2\u00e4\u00e5"+
		"\7\23\2\2\u00e5\u00e6\7\22\2\2\u00e6\u00e7\5\34\17\2\u00e7\u00e9\3\2\2"+
		"\2\u00e8\u00e3\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9-\3\2\2\2\u00ea\u00eb"+
		"\7#\2\2\u00eb\u00ec\7\31\2\2\u00ec/\3\2\2\2\u00ed\u00f6\7\f\2\2\u00ee"+
		"\u00f7\7!\2\2\u00ef\u00f0\7\65\2\2\u00f0\u00f1\7\4\2\2\u00f1\u00f4\7\63"+
		"\2\2\u00f2\u00f3\7\5\2\2\u00f3\u00f5\7\63\2\2\u00f4\u00f2\3\2\2\2\u00f4"+
		"\u00f5\3\2\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00ee\3\2\2\2\u00f6\u00ef\3\2"+
		"\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f9\7%\2\2\u00f9\u00fb\7\62\2\2\u00fa"+
		"\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\61\3\2\2\2\u00fc\u00fd\7\"\2"+
		"\2\u00fd\u00fe\5\64\33\2\u00fe\63\3\2\2\2\u00ff\u0100\7$\2\2\u0100\u0101"+
		"\7\62\2\2\u0101\u0102\7\17\2\2\u0102\u0103\5B\"\2\u0103\65\3\2\2\2\u0104"+
		"\u0107\7#\2\2\u0105\u0108\58\35\2\u0106\u0108\7\21\2\2\u0107\u0105\3\2"+
		"\2\2\u0107\u0106\3\2\2\2\u0108\67\3\2\2\2\u0109\u010a\7$\2\2\u010a\u010b"+
		"\7\62\2\2\u010b9\3\2\2\2\u010c\u010d\7\32\2\2\u010d\u010e\7\33\2\2\u010e"+
		"\u010f\7\65\2\2\u010f;\3\2\2\2\u0110\u0111\7\33\2\2\u0111\u0112\t\5\2"+
		"\2\u0112=\3\2\2\2\u0113\u0116\7\65\2\2\u0114\u0116\7\62\2\2\u0115\u0113"+
		"\3\2\2\2\u0115\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0118\7/\2\2\u0118"+
		"\u0119\5@!\2\u0119?\3\2\2\2\u011a\u011e\7\65\2\2\u011b\u011e\7\63\2\2"+
		"\u011c\u011e\5D#\2\u011d\u011a\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011c"+
		"\3\2\2\2\u011eA\3\2\2\2\u011f\u0120\7\30\2\2\u0120\u0121\t\6\2\2\u0121"+
		"C\3\2\2\2\u0122\u0123\t\7\2\2\u0123E\3\2\2\2\33INWZe{~\u0084\u0094\u009d"+
		"\u00a9\u00b5\u00c2\u00c8\u00cc\u00d3\u00da\u00e1\u00e8\u00f4\u00f6\u00fa"+
		"\u0107\u0115\u011d";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}