// Generated from C:/Users/DELL/IdeaProjects/untitled2/src/antler/Example1Parser.g4 by ANTLR 4.13.2
package antler;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class Example1Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NEW_PAGE=1, WS=2, CLOSE_PAGE=3, NAME=4, NAV=5, FOOTER=6, OPEN_BR=7, SEMICOLN=8, 
		CLOSE_BR=9, STRING=10, QOUT=11;
	public static final int
		RULE_page = 0, RULE_page_style = 1, RULE_name = 2, RULE_page_name = 3, 
		RULE_nav = 4, RULE_footer = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"page", "page_style", "name", "page_name", "nav", "footer"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'}'", "'name'", "'add_nav'", "'add_footer'", "'('", 
			"';'", "')'", null, "'\\''"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NEW_PAGE", "WS", "CLOSE_PAGE", "NAME", "NAV", "FOOTER", "OPEN_BR", 
			"SEMICOLN", "CLOSE_BR", "STRING", "QOUT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Example1Parser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Example1Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PageContext extends ParserRuleContext {
		public TerminalNode NEW_PAGE() { return getToken(Example1Parser.NEW_PAGE, 0); }
		public TerminalNode CLOSE_PAGE() { return getToken(Example1Parser.CLOSE_PAGE, 0); }
		public List<Page_styleContext> page_style() {
			return getRuleContexts(Page_styleContext.class);
		}
		public Page_styleContext page_style(int i) {
			return getRuleContext(Page_styleContext.class,i);
		}
		public PageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_page; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterPage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitPage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitPage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PageContext page() throws RecognitionException {
		PageContext _localctx = new PageContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_page);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			match(NEW_PAGE);
			setState(14); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(13);
				page_style();
				}
				}
				setState(16); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 112L) != 0) );
			setState(18);
			match(CLOSE_PAGE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Page_styleContext extends ParserRuleContext {
		public TerminalNode SEMICOLN() { return getToken(Example1Parser.SEMICOLN, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public NavContext nav() {
			return getRuleContext(NavContext.class,0);
		}
		public FooterContext footer() {
			return getRuleContext(FooterContext.class,0);
		}
		public Page_styleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_page_style; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterPage_style(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitPage_style(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitPage_style(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Page_styleContext page_style() throws RecognitionException {
		Page_styleContext _localctx = new Page_styleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_page_style);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				{
				setState(20);
				name();
				}
				break;
			case NAV:
				{
				setState(21);
				nav();
				}
				break;
			case FOOTER:
				{
				setState(22);
				footer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(25);
			match(SEMICOLN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(Example1Parser.NAME, 0); }
		public TerminalNode OPEN_BR() { return getToken(Example1Parser.OPEN_BR, 0); }
		public List<TerminalNode> QOUT() { return getTokens(Example1Parser.QOUT); }
		public TerminalNode QOUT(int i) {
			return getToken(Example1Parser.QOUT, i);
		}
		public TerminalNode CLOSE_BR() { return getToken(Example1Parser.CLOSE_BR, 0); }
		public Page_nameContext page_name() {
			return getRuleContext(Page_nameContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			match(NAME);
			setState(28);
			match(OPEN_BR);
			setState(29);
			match(QOUT);
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(30);
				page_name();
				}
			}

			setState(33);
			match(QOUT);
			setState(34);
			match(CLOSE_BR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Page_nameContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(Example1Parser.STRING, 0); }
		public Page_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_page_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterPage_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitPage_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitPage_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Page_nameContext page_name() throws RecognitionException {
		Page_nameContext _localctx = new Page_nameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_page_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(STRING);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NavContext extends ParserRuleContext {
		public TerminalNode NAV() { return getToken(Example1Parser.NAV, 0); }
		public NavContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nav; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterNav(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitNav(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitNav(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NavContext nav() throws RecognitionException {
		NavContext _localctx = new NavContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_nav);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(NAV);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FooterContext extends ParserRuleContext {
		public TerminalNode FOOTER() { return getToken(Example1Parser.FOOTER, 0); }
		public FooterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_footer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).enterFooter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Example1ParserListener ) ((Example1ParserListener)listener).exitFooter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Example1ParserVisitor ) return ((Example1ParserVisitor<? extends T>)visitor).visitFooter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FooterContext footer() throws RecognitionException {
		FooterContext _localctx = new FooterContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_footer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(FOOTER);
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
		"\u0004\u0001\u000b+\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0001\u0000\u0001\u0000\u0004\u0000\u000f\b\u0000\u000b"+
		"\u0000\f\u0000\u0010\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001\u0018\b\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002 \b\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0000\u0000\u0006\u0000\u0002\u0004\u0006"+
		"\b\n\u0000\u0000(\u0000\f\u0001\u0000\u0000\u0000\u0002\u0017\u0001\u0000"+
		"\u0000\u0000\u0004\u001b\u0001\u0000\u0000\u0000\u0006$\u0001\u0000\u0000"+
		"\u0000\b&\u0001\u0000\u0000\u0000\n(\u0001\u0000\u0000\u0000\f\u000e\u0005"+
		"\u0001\u0000\u0000\r\u000f\u0003\u0002\u0001\u0000\u000e\r\u0001\u0000"+
		"\u0000\u0000\u000f\u0010\u0001\u0000\u0000\u0000\u0010\u000e\u0001\u0000"+
		"\u0000\u0000\u0010\u0011\u0001\u0000\u0000\u0000\u0011\u0012\u0001\u0000"+
		"\u0000\u0000\u0012\u0013\u0005\u0003\u0000\u0000\u0013\u0001\u0001\u0000"+
		"\u0000\u0000\u0014\u0018\u0003\u0004\u0002\u0000\u0015\u0018\u0003\b\u0004"+
		"\u0000\u0016\u0018\u0003\n\u0005\u0000\u0017\u0014\u0001\u0000\u0000\u0000"+
		"\u0017\u0015\u0001\u0000\u0000\u0000\u0017\u0016\u0001\u0000\u0000\u0000"+
		"\u0018\u0019\u0001\u0000\u0000\u0000\u0019\u001a\u0005\b\u0000\u0000\u001a"+
		"\u0003\u0001\u0000\u0000\u0000\u001b\u001c\u0005\u0004\u0000\u0000\u001c"+
		"\u001d\u0005\u0007\u0000\u0000\u001d\u001f\u0005\u000b\u0000\u0000\u001e"+
		" \u0003\u0006\u0003\u0000\u001f\u001e\u0001\u0000\u0000\u0000\u001f \u0001"+
		"\u0000\u0000\u0000 !\u0001\u0000\u0000\u0000!\"\u0005\u000b\u0000\u0000"+
		"\"#\u0005\t\u0000\u0000#\u0005\u0001\u0000\u0000\u0000$%\u0005\n\u0000"+
		"\u0000%\u0007\u0001\u0000\u0000\u0000&\'\u0005\u0005\u0000\u0000\'\t\u0001"+
		"\u0000\u0000\u0000()\u0005\u0006\u0000\u0000)\u000b\u0001\u0000\u0000"+
		"\u0000\u0003\u0010\u0017\u001f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}