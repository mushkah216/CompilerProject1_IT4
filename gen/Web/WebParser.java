// Generated from C:/Users/DELL/IdeaProjects/untitled2/src/Web/WebParser.g4 by ANTLR 4.13.2
package Web;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class WebParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PLUS=1, MINUS=2, STAR=3, SLASH=4, DIV=5, MOD=6, LPAREN=7, RPAREN=8, DOT=9, 
		COMMA=10, EQ=11, NEQ=12, GT=13, LT=14, GTE=15, LTE=16, IFKW=17, ELIFKW=18, 
		ELSEKW=19, ENDIFKW=20, FORKW=21, ENDFORKW=22, SETKW=23, IN=24, ASSIGN=25, 
		TAG_EQUALS=26, ATTVALUE_TEXT=27, JINJA_EXPR_START=28, JINJA_STMT_START=29, 
		JINJA_EXPR_END=30, JINJA_STMT_END=31, JINJA_NAME=32, JINJA_NUMBER=33, 
		JINJA_STRING=34, HTML_COMMENT=35, STYLE_OPEN=36, SCRIPT_OPEN=37, JINJA_COMMENT_START=38, 
		TAG_OPEN=39, HTML_TEXT=40, TAG_CLOSE=41, TAG_SLASH_CLOSE=42, TAG_SLASH=43, 
		TAG_NAME=44, TAG_WHITESPACE=45, ATTR_DQ_COMMENT_START=46, ATTR_DQ_CLOSE=47, 
		ATTR_SQ_COMMENT_START=48, ATTR_SQ_CLOSE=49, STYLE_CLOSE=50, STYLE_WS=51, 
		STYLE_JINJA_COMMENT_START=52, CSS_COMMENT=53, CSS_LBRACE=54, CSS_RBRACE=55, 
		CSS_COLON=56, CSS_SEMI=57, CSS_DOT=58, CSS_HASH=59, CSS_LPAREN=60, CSS_RPAREN=61, 
		CSS_COMMA=62, CSS_AT=63, CSS_TILDE=64, CSS_IDENT=65, CSS_NUMBER=66, CSS_STRING=67, 
		SCRIPT_JINJA_COMMENT_START=68, SCRIPT_CLOSE=69, SCRIPT_COMMENT=70, SCRIPT_LINE_COMMENT=71, 
		SCRIPT_LBRACE=72, SCRIPT_RBRACE=73, SCRIPT_LT=74, SCRIPT_OTHER=75, JEXPR_WS=76, 
		JSTMT_WS=77, JCOMMENT_END=78, JCOMMENT_TEXT=79, STYLE_PLUS=80, STYLE_MINUS=81, 
		STYLE_STAR=82, JEXPR_END=83, JSTMT_END=84, JSTMT_IF=85, JSTMT_ELIF=86, 
		JSTMT_ELSE=87, JSTMT_ENDIF=88, JSTMT_FOR=89, JSTMT_ENDFOR=90, JSTMT_SET=91, 
		JSTMT_IN=92, JSTMT_ASSIGN=93;
	public static final int
		RULE_htmlDocument = 0, RULE_htmlContent = 1, RULE_htmlElement = 2, RULE_styleElement = 3, 
		RULE_scriptElement = 4, RULE_attribute = 5, RULE_attributeValue = 6, RULE_attributeValueContent = 7, 
		RULE_styleContent = 8, RULE_scriptContent = 9, RULE_jinjaExpression = 10, 
		RULE_jinjaStatement = 11, RULE_jinjaStatementBody = 12, RULE_expression = 13, 
		RULE_simpleExpression = 14, RULE_term = 15, RULE_factor = 16, RULE_primary = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"htmlDocument", "htmlContent", "htmlElement", "styleElement", "scriptElement", 
			"attribute", "attributeValue", "attributeValueContent", "styleContent", 
			"scriptContent", "jinjaExpression", "jinjaStatement", "jinjaStatementBody", 
			"expression", "simpleExpression", "term", "factor", "primary"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "'{{'", "'{%'", null, null, null, null, null, 
			"' '", null, null, null, null, null, null, "'/>'", null, null, null, 
			null, "'\"'", null, "'''", "'</style>'", null, null, null, null, null, 
			"':'", "';'", null, "'#'", null, null, null, "'@'", "'~'", null, null, 
			null, null, "'</script>'", null, null, null, null, null, null, null, 
			null, "'#}'", null, null, null, null, "'}}'", "'%}'", "'if'", "'elif'", 
			"'else'", "'endif'", "'for'", "'endfor'", "'set'", "'in'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PLUS", "MINUS", "STAR", "SLASH", "DIV", "MOD", "LPAREN", "RPAREN", 
			"DOT", "COMMA", "EQ", "NEQ", "GT", "LT", "GTE", "LTE", "IFKW", "ELIFKW", 
			"ELSEKW", "ENDIFKW", "FORKW", "ENDFORKW", "SETKW", "IN", "ASSIGN", "TAG_EQUALS", 
			"ATTVALUE_TEXT", "JINJA_EXPR_START", "JINJA_STMT_START", "JINJA_EXPR_END", 
			"JINJA_STMT_END", "JINJA_NAME", "JINJA_NUMBER", "JINJA_STRING", "HTML_COMMENT", 
			"STYLE_OPEN", "SCRIPT_OPEN", "JINJA_COMMENT_START", "TAG_OPEN", "HTML_TEXT", 
			"TAG_CLOSE", "TAG_SLASH_CLOSE", "TAG_SLASH", "TAG_NAME", "TAG_WHITESPACE", 
			"ATTR_DQ_COMMENT_START", "ATTR_DQ_CLOSE", "ATTR_SQ_COMMENT_START", "ATTR_SQ_CLOSE", 
			"STYLE_CLOSE", "STYLE_WS", "STYLE_JINJA_COMMENT_START", "CSS_COMMENT", 
			"CSS_LBRACE", "CSS_RBRACE", "CSS_COLON", "CSS_SEMI", "CSS_DOT", "CSS_HASH", 
			"CSS_LPAREN", "CSS_RPAREN", "CSS_COMMA", "CSS_AT", "CSS_TILDE", "CSS_IDENT", 
			"CSS_NUMBER", "CSS_STRING", "SCRIPT_JINJA_COMMENT_START", "SCRIPT_CLOSE", 
			"SCRIPT_COMMENT", "SCRIPT_LINE_COMMENT", "SCRIPT_LBRACE", "SCRIPT_RBRACE", 
			"SCRIPT_LT", "SCRIPT_OTHER", "JEXPR_WS", "JSTMT_WS", "JCOMMENT_END", 
			"JCOMMENT_TEXT", "STYLE_PLUS", "STYLE_MINUS", "STYLE_STAR", "JEXPR_END", 
			"JSTMT_END", "JSTMT_IF", "JSTMT_ELIF", "JSTMT_ELSE", "JSTMT_ENDIF", "JSTMT_FOR", 
			"JSTMT_ENDFOR", "JSTMT_SET", "JSTMT_IN", "JSTMT_ASSIGN"
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
	public String getGrammarFileName() { return "WebParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public WebParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlDocumentContext extends ParserRuleContext {
		public HtmlContentContext htmlContent() {
			return getRuleContext(HtmlContentContext.class,0);
		}
		public TerminalNode EOF() { return getToken(WebParser.EOF, 0); }
		public HtmlDocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlDocument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterHtmlDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitHtmlDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitHtmlDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlDocumentContext htmlDocument() throws RecognitionException {
		HtmlDocumentContext _localctx = new HtmlDocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_htmlDocument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			htmlContent();
			setState(37);
			match(EOF);
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
	public static class HtmlContentContext extends ParserRuleContext {
		public List<HtmlElementContext> htmlElement() {
			return getRuleContexts(HtmlElementContext.class);
		}
		public HtmlElementContext htmlElement(int i) {
			return getRuleContext(HtmlElementContext.class,i);
		}
		public List<StyleElementContext> styleElement() {
			return getRuleContexts(StyleElementContext.class);
		}
		public StyleElementContext styleElement(int i) {
			return getRuleContext(StyleElementContext.class,i);
		}
		public List<ScriptElementContext> scriptElement() {
			return getRuleContexts(ScriptElementContext.class);
		}
		public ScriptElementContext scriptElement(int i) {
			return getRuleContext(ScriptElementContext.class,i);
		}
		public List<JinjaExpressionContext> jinjaExpression() {
			return getRuleContexts(JinjaExpressionContext.class);
		}
		public JinjaExpressionContext jinjaExpression(int i) {
			return getRuleContext(JinjaExpressionContext.class,i);
		}
		public List<JinjaStatementContext> jinjaStatement() {
			return getRuleContexts(JinjaStatementContext.class);
		}
		public JinjaStatementContext jinjaStatement(int i) {
			return getRuleContext(JinjaStatementContext.class,i);
		}
		public List<TerminalNode> HTML_TEXT() { return getTokens(WebParser.HTML_TEXT); }
		public TerminalNode HTML_TEXT(int i) {
			return getToken(WebParser.HTML_TEXT, i);
		}
		public HtmlContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterHtmlContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitHtmlContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitHtmlContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlContentContext htmlContent() throws RecognitionException {
		HtmlContentContext _localctx = new HtmlContentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_htmlContent);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(45);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case TAG_OPEN:
						{
						setState(39);
						htmlElement();
						}
						break;
					case STYLE_OPEN:
						{
						setState(40);
						styleElement();
						}
						break;
					case SCRIPT_OPEN:
						{
						setState(41);
						scriptElement();
						}
						break;
					case JINJA_EXPR_START:
						{
						setState(42);
						jinjaExpression();
						}
						break;
					case JINJA_STMT_START:
						{
						setState(43);
						jinjaStatement();
						}
						break;
					case HTML_TEXT:
						{
						setState(44);
						match(HTML_TEXT);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(49);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlElementContext extends ParserRuleContext {
		public List<TerminalNode> TAG_OPEN() { return getTokens(WebParser.TAG_OPEN); }
		public TerminalNode TAG_OPEN(int i) {
			return getToken(WebParser.TAG_OPEN, i);
		}
		public List<TerminalNode> TAG_NAME() { return getTokens(WebParser.TAG_NAME); }
		public TerminalNode TAG_NAME(int i) {
			return getToken(WebParser.TAG_NAME, i);
		}
		public List<TerminalNode> TAG_CLOSE() { return getTokens(WebParser.TAG_CLOSE); }
		public TerminalNode TAG_CLOSE(int i) {
			return getToken(WebParser.TAG_CLOSE, i);
		}
		public HtmlContentContext htmlContent() {
			return getRuleContext(HtmlContentContext.class,0);
		}
		public TerminalNode TAG_SLASH() { return getToken(WebParser.TAG_SLASH, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public TerminalNode TAG_SLASH_CLOSE() { return getToken(WebParser.TAG_SLASH_CLOSE, 0); }
		public HtmlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterHtmlElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitHtmlElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitHtmlElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementContext htmlElement() throws RecognitionException {
		HtmlElementContext _localctx = new HtmlElementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_htmlElement);
		int _la;
		try {
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				match(TAG_OPEN);
				setState(51);
				match(TAG_NAME);
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TAG_NAME) {
					{
					{
					setState(52);
					attribute();
					}
					}
					setState(57);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(58);
				match(TAG_CLOSE);
				setState(59);
				htmlContent();
				setState(60);
				match(TAG_OPEN);
				setState(61);
				match(TAG_SLASH);
				setState(62);
				match(TAG_NAME);
				setState(63);
				match(TAG_CLOSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				match(TAG_OPEN);
				setState(66);
				match(TAG_NAME);
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TAG_NAME) {
					{
					{
					setState(67);
					attribute();
					}
					}
					setState(72);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(73);
				match(TAG_SLASH_CLOSE);
				}
				break;
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
	public static class StyleElementContext extends ParserRuleContext {
		public TerminalNode STYLE_OPEN() { return getToken(WebParser.STYLE_OPEN, 0); }
		public TerminalNode STYLE_CLOSE() { return getToken(WebParser.STYLE_CLOSE, 0); }
		public List<StyleContentContext> styleContent() {
			return getRuleContexts(StyleContentContext.class);
		}
		public StyleContentContext styleContent(int i) {
			return getRuleContext(StyleContentContext.class,i);
		}
		public StyleElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_styleElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterStyleElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitStyleElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitStyleElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleElementContext styleElement() throws RecognitionException {
		StyleElementContext _localctx = new StyleElementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_styleElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(STYLE_OPEN);
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -18014397704167394L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 15L) != 0)) {
				{
				{
				setState(77);
				styleContent();
				}
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(83);
			match(STYLE_CLOSE);
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
	public static class ScriptElementContext extends ParserRuleContext {
		public TerminalNode SCRIPT_OPEN() { return getToken(WebParser.SCRIPT_OPEN, 0); }
		public TerminalNode SCRIPT_CLOSE() { return getToken(WebParser.SCRIPT_CLOSE, 0); }
		public List<ScriptContentContext> scriptContent() {
			return getRuleContexts(ScriptContentContext.class);
		}
		public ScriptContentContext scriptContent(int i) {
			return getRuleContext(ScriptContentContext.class,i);
		}
		public ScriptElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scriptElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterScriptElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitScriptElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitScriptElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptElementContext scriptElement() throws RecognitionException {
		ScriptElementContext _localctx = new ScriptElementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_scriptElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(SCRIPT_OPEN);
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 28)) & ~0x3f) == 0 && ((1L << (_la - 28)) & 263882790666243L) != 0)) {
				{
				{
				setState(86);
				scriptContent();
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(92);
			match(SCRIPT_CLOSE);
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
	public static class AttributeContext extends ParserRuleContext {
		public TerminalNode TAG_NAME() { return getToken(WebParser.TAG_NAME, 0); }
		public TerminalNode TAG_EQUALS() { return getToken(WebParser.TAG_EQUALS, 0); }
		public AttributeValueContext attributeValue() {
			return getRuleContext(AttributeValueContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(TAG_NAME);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TAG_EQUALS) {
				{
				setState(95);
				match(TAG_EQUALS);
				setState(96);
				attributeValue();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeValueContext extends ParserRuleContext {
		public List<AttributeValueContentContext> attributeValueContent() {
			return getRuleContexts(AttributeValueContentContext.class);
		}
		public AttributeValueContentContext attributeValueContent(int i) {
			return getRuleContext(AttributeValueContentContext.class,i);
		}
		public AttributeValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterAttributeValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitAttributeValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitAttributeValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeValueContext attributeValue() throws RecognitionException {
		AttributeValueContext _localctx = new AttributeValueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_attributeValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 939524096L) != 0)) {
				{
				{
				setState(99);
				attributeValueContent();
				}
				}
				setState(104);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeValueContentContext extends ParserRuleContext {
		public JinjaExpressionContext jinjaExpression() {
			return getRuleContext(JinjaExpressionContext.class,0);
		}
		public JinjaStatementContext jinjaStatement() {
			return getRuleContext(JinjaStatementContext.class,0);
		}
		public TerminalNode ATTVALUE_TEXT() { return getToken(WebParser.ATTVALUE_TEXT, 0); }
		public AttributeValueContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeValueContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterAttributeValueContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitAttributeValueContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitAttributeValueContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeValueContentContext attributeValueContent() throws RecognitionException {
		AttributeValueContentContext _localctx = new AttributeValueContentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_attributeValueContent);
		try {
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JINJA_EXPR_START:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				jinjaExpression();
				}
				break;
			case JINJA_STMT_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				jinjaStatement();
				}
				break;
			case ATTVALUE_TEXT:
				enterOuterAlt(_localctx, 3);
				{
				setState(107);
				match(ATTVALUE_TEXT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StyleContentContext extends ParserRuleContext {
		public JinjaExpressionContext jinjaExpression() {
			return getRuleContext(JinjaExpressionContext.class,0);
		}
		public JinjaStatementContext jinjaStatement() {
			return getRuleContext(JinjaStatementContext.class,0);
		}
		public TerminalNode CSS_IDENT() { return getToken(WebParser.CSS_IDENT, 0); }
		public TerminalNode CSS_NUMBER() { return getToken(WebParser.CSS_NUMBER, 0); }
		public TerminalNode CSS_STRING() { return getToken(WebParser.CSS_STRING, 0); }
		public TerminalNode CSS_LBRACE() { return getToken(WebParser.CSS_LBRACE, 0); }
		public TerminalNode CSS_RBRACE() { return getToken(WebParser.CSS_RBRACE, 0); }
		public TerminalNode CSS_COLON() { return getToken(WebParser.CSS_COLON, 0); }
		public TerminalNode CSS_SEMI() { return getToken(WebParser.CSS_SEMI, 0); }
		public TerminalNode CSS_DOT() { return getToken(WebParser.CSS_DOT, 0); }
		public TerminalNode CSS_HASH() { return getToken(WebParser.CSS_HASH, 0); }
		public TerminalNode CSS_LPAREN() { return getToken(WebParser.CSS_LPAREN, 0); }
		public TerminalNode CSS_RPAREN() { return getToken(WebParser.CSS_RPAREN, 0); }
		public TerminalNode CSS_COMMA() { return getToken(WebParser.CSS_COMMA, 0); }
		public TerminalNode CSS_AT() { return getToken(WebParser.CSS_AT, 0); }
		public TerminalNode CSS_TILDE() { return getToken(WebParser.CSS_TILDE, 0); }
		public TerminalNode PLUS() { return getToken(WebParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(WebParser.MINUS, 0); }
		public TerminalNode STAR() { return getToken(WebParser.STAR, 0); }
		public TerminalNode SLASH() { return getToken(WebParser.SLASH, 0); }
		public TerminalNode GT() { return getToken(WebParser.GT, 0); }
		public StyleContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_styleContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterStyleContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitStyleContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitStyleContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleContentContext styleContent() throws RecognitionException {
		StyleContentContext _localctx = new StyleContentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_styleContent);
		try {
			setState(131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JINJA_EXPR_START:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				jinjaExpression();
				}
				break;
			case JINJA_STMT_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				jinjaStatement();
				}
				break;
			case CSS_IDENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(112);
				match(CSS_IDENT);
				}
				break;
			case CSS_NUMBER:
				enterOuterAlt(_localctx, 4);
				{
				setState(113);
				match(CSS_NUMBER);
				}
				break;
			case CSS_STRING:
				enterOuterAlt(_localctx, 5);
				{
				setState(114);
				match(CSS_STRING);
				}
				break;
			case CSS_LBRACE:
				enterOuterAlt(_localctx, 6);
				{
				setState(115);
				match(CSS_LBRACE);
				}
				break;
			case CSS_RBRACE:
				enterOuterAlt(_localctx, 7);
				{
				setState(116);
				match(CSS_RBRACE);
				}
				break;
			case CSS_COLON:
				enterOuterAlt(_localctx, 8);
				{
				setState(117);
				match(CSS_COLON);
				}
				break;
			case CSS_SEMI:
				enterOuterAlt(_localctx, 9);
				{
				setState(118);
				match(CSS_SEMI);
				}
				break;
			case CSS_DOT:
				enterOuterAlt(_localctx, 10);
				{
				setState(119);
				match(CSS_DOT);
				}
				break;
			case CSS_HASH:
				enterOuterAlt(_localctx, 11);
				{
				setState(120);
				match(CSS_HASH);
				}
				break;
			case CSS_LPAREN:
				enterOuterAlt(_localctx, 12);
				{
				setState(121);
				match(CSS_LPAREN);
				}
				break;
			case CSS_RPAREN:
				enterOuterAlt(_localctx, 13);
				{
				setState(122);
				match(CSS_RPAREN);
				}
				break;
			case CSS_COMMA:
				enterOuterAlt(_localctx, 14);
				{
				setState(123);
				match(CSS_COMMA);
				}
				break;
			case CSS_AT:
				enterOuterAlt(_localctx, 15);
				{
				setState(124);
				match(CSS_AT);
				}
				break;
			case CSS_TILDE:
				enterOuterAlt(_localctx, 16);
				{
				setState(125);
				match(CSS_TILDE);
				}
				break;
			case PLUS:
				enterOuterAlt(_localctx, 17);
				{
				setState(126);
				match(PLUS);
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 18);
				{
				setState(127);
				match(MINUS);
				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 19);
				{
				setState(128);
				match(STAR);
				}
				break;
			case SLASH:
				enterOuterAlt(_localctx, 20);
				{
				setState(129);
				match(SLASH);
				}
				break;
			case GT:
				enterOuterAlt(_localctx, 21);
				{
				setState(130);
				match(GT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ScriptContentContext extends ParserRuleContext {
		public JinjaExpressionContext jinjaExpression() {
			return getRuleContext(JinjaExpressionContext.class,0);
		}
		public JinjaStatementContext jinjaStatement() {
			return getRuleContext(JinjaStatementContext.class,0);
		}
		public TerminalNode SCRIPT_LBRACE() { return getToken(WebParser.SCRIPT_LBRACE, 0); }
		public TerminalNode SCRIPT_RBRACE() { return getToken(WebParser.SCRIPT_RBRACE, 0); }
		public TerminalNode SCRIPT_LT() { return getToken(WebParser.SCRIPT_LT, 0); }
		public TerminalNode SCRIPT_OTHER() { return getToken(WebParser.SCRIPT_OTHER, 0); }
		public ScriptContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scriptContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterScriptContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitScriptContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitScriptContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptContentContext scriptContent() throws RecognitionException {
		ScriptContentContext _localctx = new ScriptContentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_scriptContent);
		try {
			setState(139);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JINJA_EXPR_START:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				jinjaExpression();
				}
				break;
			case JINJA_STMT_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				jinjaStatement();
				}
				break;
			case SCRIPT_LBRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(135);
				match(SCRIPT_LBRACE);
				}
				break;
			case SCRIPT_RBRACE:
				enterOuterAlt(_localctx, 4);
				{
				setState(136);
				match(SCRIPT_RBRACE);
				}
				break;
			case SCRIPT_LT:
				enterOuterAlt(_localctx, 5);
				{
				setState(137);
				match(SCRIPT_LT);
				}
				break;
			case SCRIPT_OTHER:
				enterOuterAlt(_localctx, 6);
				{
				setState(138);
				match(SCRIPT_OTHER);
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

	@SuppressWarnings("CheckReturnValue")
	public static class JinjaExpressionContext extends ParserRuleContext {
		public TerminalNode JINJA_EXPR_START() { return getToken(WebParser.JINJA_EXPR_START, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode JINJA_EXPR_END() { return getToken(WebParser.JINJA_EXPR_END, 0); }
		public JinjaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterJinjaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitJinjaExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitJinjaExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaExpressionContext jinjaExpression() throws RecognitionException {
		JinjaExpressionContext _localctx = new JinjaExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_jinjaExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(JINJA_EXPR_START);
			setState(142);
			expression();
			setState(143);
			match(JINJA_EXPR_END);
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
	public static class JinjaStatementContext extends ParserRuleContext {
		public TerminalNode JINJA_STMT_START() { return getToken(WebParser.JINJA_STMT_START, 0); }
		public JinjaStatementBodyContext jinjaStatementBody() {
			return getRuleContext(JinjaStatementBodyContext.class,0);
		}
		public TerminalNode JINJA_STMT_END() { return getToken(WebParser.JINJA_STMT_END, 0); }
		public JinjaStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterJinjaStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitJinjaStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitJinjaStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaStatementContext jinjaStatement() throws RecognitionException {
		JinjaStatementContext _localctx = new JinjaStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_jinjaStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(JINJA_STMT_START);
			setState(146);
			jinjaStatementBody();
			setState(147);
			match(JINJA_STMT_END);
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
	public static class JinjaStatementBodyContext extends ParserRuleContext {
		public TerminalNode IFKW() { return getToken(WebParser.IFKW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ELIFKW() { return getToken(WebParser.ELIFKW, 0); }
		public TerminalNode ELSEKW() { return getToken(WebParser.ELSEKW, 0); }
		public TerminalNode ENDIFKW() { return getToken(WebParser.ENDIFKW, 0); }
		public TerminalNode FORKW() { return getToken(WebParser.FORKW, 0); }
		public TerminalNode JINJA_NAME() { return getToken(WebParser.JINJA_NAME, 0); }
		public TerminalNode IN() { return getToken(WebParser.IN, 0); }
		public TerminalNode ENDFORKW() { return getToken(WebParser.ENDFORKW, 0); }
		public TerminalNode SETKW() { return getToken(WebParser.SETKW, 0); }
		public TerminalNode ASSIGN() { return getToken(WebParser.ASSIGN, 0); }
		public JinjaStatementBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaStatementBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterJinjaStatementBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitJinjaStatementBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitJinjaStatementBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaStatementBodyContext jinjaStatementBody() throws RecognitionException {
		JinjaStatementBodyContext _localctx = new JinjaStatementBodyContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_jinjaStatementBody);
		try {
			setState(164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IFKW:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				match(IFKW);
				setState(150);
				expression();
				}
				break;
			case ELIFKW:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				match(ELIFKW);
				setState(152);
				expression();
				}
				break;
			case ELSEKW:
				enterOuterAlt(_localctx, 3);
				{
				setState(153);
				match(ELSEKW);
				}
				break;
			case ENDIFKW:
				enterOuterAlt(_localctx, 4);
				{
				setState(154);
				match(ENDIFKW);
				}
				break;
			case FORKW:
				enterOuterAlt(_localctx, 5);
				{
				setState(155);
				match(FORKW);
				setState(156);
				match(JINJA_NAME);
				setState(157);
				match(IN);
				setState(158);
				expression();
				}
				break;
			case ENDFORKW:
				enterOuterAlt(_localctx, 6);
				{
				setState(159);
				match(ENDFORKW);
				}
				break;
			case SETKW:
				enterOuterAlt(_localctx, 7);
				{
				setState(160);
				match(SETKW);
				setState(161);
				match(JINJA_NAME);
				setState(162);
				match(ASSIGN);
				setState(163);
				expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public List<SimpleExpressionContext> simpleExpression() {
			return getRuleContexts(SimpleExpressionContext.class);
		}
		public SimpleExpressionContext simpleExpression(int i) {
			return getRuleContext(SimpleExpressionContext.class,i);
		}
		public List<TerminalNode> EQ() { return getTokens(WebParser.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(WebParser.EQ, i);
		}
		public List<TerminalNode> NEQ() { return getTokens(WebParser.NEQ); }
		public TerminalNode NEQ(int i) {
			return getToken(WebParser.NEQ, i);
		}
		public List<TerminalNode> GT() { return getTokens(WebParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(WebParser.GT, i);
		}
		public List<TerminalNode> LT() { return getTokens(WebParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(WebParser.LT, i);
		}
		public List<TerminalNode> GTE() { return getTokens(WebParser.GTE); }
		public TerminalNode GTE(int i) {
			return getToken(WebParser.GTE, i);
		}
		public List<TerminalNode> LTE() { return getTokens(WebParser.LTE); }
		public TerminalNode LTE(int i) {
			return getToken(WebParser.LTE, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			simpleExpression();
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 129024L) != 0)) {
				{
				{
				setState(167);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 129024L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(168);
				simpleExpression();
				}
				}
				setState(173);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SimpleExpressionContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(WebParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(WebParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(WebParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(WebParser.MINUS, i);
		}
		public SimpleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterSimpleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitSimpleExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitSimpleExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleExpressionContext simpleExpression() throws RecognitionException {
		SimpleExpressionContext _localctx = new SimpleExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_simpleExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			term();
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(175);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(176);
				term();
				}
				}
				setState(181);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> STAR() { return getTokens(WebParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(WebParser.STAR, i);
		}
		public List<TerminalNode> SLASH() { return getTokens(WebParser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(WebParser.SLASH, i);
		}
		public List<TerminalNode> DIV() { return getTokens(WebParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(WebParser.DIV, i);
		}
		public List<TerminalNode> MOD() { return getTokens(WebParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(WebParser.MOD, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			factor();
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 120L) != 0)) {
				{
				{
				setState(183);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 120L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(184);
				factor();
				}
				}
				setState(189);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_factor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			primary();
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
	public static class PrimaryContext extends ParserRuleContext {
		public TerminalNode JINJA_NUMBER() { return getToken(WebParser.JINJA_NUMBER, 0); }
		public TerminalNode JINJA_STRING() { return getToken(WebParser.JINJA_STRING, 0); }
		public List<TerminalNode> JINJA_NAME() { return getTokens(WebParser.JINJA_NAME); }
		public TerminalNode JINJA_NAME(int i) {
			return getToken(WebParser.JINJA_NAME, i);
		}
		public List<TerminalNode> DOT() { return getTokens(WebParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(WebParser.DOT, i);
		}
		public TerminalNode LPAREN() { return getToken(WebParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(WebParser.RPAREN, 0); }
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WebParserListener ) ((WebParserListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WebParserVisitor ) return ((WebParserVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_primary);
		int _la;
		try {
			setState(206);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JINJA_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				match(JINJA_NUMBER);
				}
				break;
			case JINJA_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				match(JINJA_STRING);
				}
				break;
			case JINJA_NAME:
				enterOuterAlt(_localctx, 3);
				{
				setState(194);
				match(JINJA_NAME);
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(195);
					match(DOT);
					setState(196);
					match(JINJA_NAME);
					}
					}
					setState(201);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 4);
				{
				setState(202);
				match(LPAREN);
				setState(203);
				expression();
				setState(204);
				match(RPAREN);
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

	public static final String _serializedATN =
		"\u0004\u0001]\u00d1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0005\u0001.\b\u0001\n\u0001\f\u00011\t\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u00026\b\u0002\n\u0002\f\u00029\t\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002E\b\u0002"+
		"\n\u0002\f\u0002H\t\u0002\u0001\u0002\u0003\u0002K\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0005\u0003O\b\u0003\n\u0003\f\u0003R\t\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0005\u0004X\b\u0004\n\u0004\f\u0004"+
		"[\t\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005b\b\u0005\u0001\u0006\u0005\u0006e\b\u0006\n\u0006\f\u0006"+
		"h\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007m\b\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\b\u0084\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\u008c\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0003\f\u00a5\b\f\u0001\r\u0001\r\u0001\r\u0005\r\u00aa\b\r"+
		"\n\r\f\r\u00ad\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00b2"+
		"\b\u000e\n\u000e\f\u000e\u00b5\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0005\u000f\u00ba\b\u000f\n\u000f\f\u000f\u00bd\t\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005"+
		"\u0011\u00c6\b\u0011\n\u0011\f\u0011\u00c9\t\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0003\u0011\u00cf\b\u0011\u0001\u0011\u0000\u0000"+
		"\u0012\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"\u0000\u0003\u0001\u0000\u000b\u0010\u0001\u0000"+
		"\u0001\u0002\u0001\u0000\u0003\u0006\u00f3\u0000$\u0001\u0000\u0000\u0000"+
		"\u0002/\u0001\u0000\u0000\u0000\u0004J\u0001\u0000\u0000\u0000\u0006L"+
		"\u0001\u0000\u0000\u0000\bU\u0001\u0000\u0000\u0000\n^\u0001\u0000\u0000"+
		"\u0000\ff\u0001\u0000\u0000\u0000\u000el\u0001\u0000\u0000\u0000\u0010"+
		"\u0083\u0001\u0000\u0000\u0000\u0012\u008b\u0001\u0000\u0000\u0000\u0014"+
		"\u008d\u0001\u0000\u0000\u0000\u0016\u0091\u0001\u0000\u0000\u0000\u0018"+
		"\u00a4\u0001\u0000\u0000\u0000\u001a\u00a6\u0001\u0000\u0000\u0000\u001c"+
		"\u00ae\u0001\u0000\u0000\u0000\u001e\u00b6\u0001\u0000\u0000\u0000 \u00be"+
		"\u0001\u0000\u0000\u0000\"\u00ce\u0001\u0000\u0000\u0000$%\u0003\u0002"+
		"\u0001\u0000%&\u0005\u0000\u0000\u0001&\u0001\u0001\u0000\u0000\u0000"+
		"\'.\u0003\u0004\u0002\u0000(.\u0003\u0006\u0003\u0000).\u0003\b\u0004"+
		"\u0000*.\u0003\u0014\n\u0000+.\u0003\u0016\u000b\u0000,.\u0005(\u0000"+
		"\u0000-\'\u0001\u0000\u0000\u0000-(\u0001\u0000\u0000\u0000-)\u0001\u0000"+
		"\u0000\u0000-*\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000-,\u0001"+
		"\u0000\u0000\u0000.1\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000\u0000"+
		"/0\u0001\u0000\u0000\u00000\u0003\u0001\u0000\u0000\u00001/\u0001\u0000"+
		"\u0000\u000023\u0005\'\u0000\u000037\u0005,\u0000\u000046\u0003\n\u0005"+
		"\u000054\u0001\u0000\u0000\u000069\u0001\u0000\u0000\u000075\u0001\u0000"+
		"\u0000\u000078\u0001\u0000\u0000\u00008:\u0001\u0000\u0000\u000097\u0001"+
		"\u0000\u0000\u0000:;\u0005)\u0000\u0000;<\u0003\u0002\u0001\u0000<=\u0005"+
		"\'\u0000\u0000=>\u0005+\u0000\u0000>?\u0005,\u0000\u0000?@\u0005)\u0000"+
		"\u0000@K\u0001\u0000\u0000\u0000AB\u0005\'\u0000\u0000BF\u0005,\u0000"+
		"\u0000CE\u0003\n\u0005\u0000DC\u0001\u0000\u0000\u0000EH\u0001\u0000\u0000"+
		"\u0000FD\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GI\u0001\u0000"+
		"\u0000\u0000HF\u0001\u0000\u0000\u0000IK\u0005*\u0000\u0000J2\u0001\u0000"+
		"\u0000\u0000JA\u0001\u0000\u0000\u0000K\u0005\u0001\u0000\u0000\u0000"+
		"LP\u0005$\u0000\u0000MO\u0003\u0010\b\u0000NM\u0001\u0000\u0000\u0000"+
		"OR\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000"+
		"\u0000QS\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000ST\u00052\u0000"+
		"\u0000T\u0007\u0001\u0000\u0000\u0000UY\u0005%\u0000\u0000VX\u0003\u0012"+
		"\t\u0000WV\u0001\u0000\u0000\u0000X[\u0001\u0000\u0000\u0000YW\u0001\u0000"+
		"\u0000\u0000YZ\u0001\u0000\u0000\u0000Z\\\u0001\u0000\u0000\u0000[Y\u0001"+
		"\u0000\u0000\u0000\\]\u0005E\u0000\u0000]\t\u0001\u0000\u0000\u0000^a"+
		"\u0005,\u0000\u0000_`\u0005\u001a\u0000\u0000`b\u0003\f\u0006\u0000a_"+
		"\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000b\u000b\u0001\u0000"+
		"\u0000\u0000ce\u0003\u000e\u0007\u0000dc\u0001\u0000\u0000\u0000eh\u0001"+
		"\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000"+
		"g\r\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000im\u0003\u0014\n"+
		"\u0000jm\u0003\u0016\u000b\u0000km\u0005\u001b\u0000\u0000li\u0001\u0000"+
		"\u0000\u0000lj\u0001\u0000\u0000\u0000lk\u0001\u0000\u0000\u0000m\u000f"+
		"\u0001\u0000\u0000\u0000n\u0084\u0003\u0014\n\u0000o\u0084\u0003\u0016"+
		"\u000b\u0000p\u0084\u0005A\u0000\u0000q\u0084\u0005B\u0000\u0000r\u0084"+
		"\u0005C\u0000\u0000s\u0084\u00056\u0000\u0000t\u0084\u00057\u0000\u0000"+
		"u\u0084\u00058\u0000\u0000v\u0084\u00059\u0000\u0000w\u0084\u0005:\u0000"+
		"\u0000x\u0084\u0005;\u0000\u0000y\u0084\u0005<\u0000\u0000z\u0084\u0005"+
		"=\u0000\u0000{\u0084\u0005>\u0000\u0000|\u0084\u0005?\u0000\u0000}\u0084"+
		"\u0005@\u0000\u0000~\u0084\u0005\u0001\u0000\u0000\u007f\u0084\u0005\u0002"+
		"\u0000\u0000\u0080\u0084\u0005\u0003\u0000\u0000\u0081\u0084\u0005\u0004"+
		"\u0000\u0000\u0082\u0084\u0005\r\u0000\u0000\u0083n\u0001\u0000\u0000"+
		"\u0000\u0083o\u0001\u0000\u0000\u0000\u0083p\u0001\u0000\u0000\u0000\u0083"+
		"q\u0001\u0000\u0000\u0000\u0083r\u0001\u0000\u0000\u0000\u0083s\u0001"+
		"\u0000\u0000\u0000\u0083t\u0001\u0000\u0000\u0000\u0083u\u0001\u0000\u0000"+
		"\u0000\u0083v\u0001\u0000\u0000\u0000\u0083w\u0001\u0000\u0000\u0000\u0083"+
		"x\u0001\u0000\u0000\u0000\u0083y\u0001\u0000\u0000\u0000\u0083z\u0001"+
		"\u0000\u0000\u0000\u0083{\u0001\u0000\u0000\u0000\u0083|\u0001\u0000\u0000"+
		"\u0000\u0083}\u0001\u0000\u0000\u0000\u0083~\u0001\u0000\u0000\u0000\u0083"+
		"\u007f\u0001\u0000\u0000\u0000\u0083\u0080\u0001\u0000\u0000\u0000\u0083"+
		"\u0081\u0001\u0000\u0000\u0000\u0083\u0082\u0001\u0000\u0000\u0000\u0084"+
		"\u0011\u0001\u0000\u0000\u0000\u0085\u008c\u0003\u0014\n\u0000\u0086\u008c"+
		"\u0003\u0016\u000b\u0000\u0087\u008c\u0005H\u0000\u0000\u0088\u008c\u0005"+
		"I\u0000\u0000\u0089\u008c\u0005J\u0000\u0000\u008a\u008c\u0005K\u0000"+
		"\u0000\u008b\u0085\u0001\u0000\u0000\u0000\u008b\u0086\u0001\u0000\u0000"+
		"\u0000\u008b\u0087\u0001\u0000\u0000\u0000\u008b\u0088\u0001\u0000\u0000"+
		"\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008b\u008a\u0001\u0000\u0000"+
		"\u0000\u008c\u0013\u0001\u0000\u0000\u0000\u008d\u008e\u0005\u001c\u0000"+
		"\u0000\u008e\u008f\u0003\u001a\r\u0000\u008f\u0090\u0005\u001e\u0000\u0000"+
		"\u0090\u0015\u0001\u0000\u0000\u0000\u0091\u0092\u0005\u001d\u0000\u0000"+
		"\u0092\u0093\u0003\u0018\f\u0000\u0093\u0094\u0005\u001f\u0000\u0000\u0094"+
		"\u0017\u0001\u0000\u0000\u0000\u0095\u0096\u0005\u0011\u0000\u0000\u0096"+
		"\u00a5\u0003\u001a\r\u0000\u0097\u0098\u0005\u0012\u0000\u0000\u0098\u00a5"+
		"\u0003\u001a\r\u0000\u0099\u00a5\u0005\u0013\u0000\u0000\u009a\u00a5\u0005"+
		"\u0014\u0000\u0000\u009b\u009c\u0005\u0015\u0000\u0000\u009c\u009d\u0005"+
		" \u0000\u0000\u009d\u009e\u0005\u0018\u0000\u0000\u009e\u00a5\u0003\u001a"+
		"\r\u0000\u009f\u00a5\u0005\u0016\u0000\u0000\u00a0\u00a1\u0005\u0017\u0000"+
		"\u0000\u00a1\u00a2\u0005 \u0000\u0000\u00a2\u00a3\u0005\u0019\u0000\u0000"+
		"\u00a3\u00a5\u0003\u001a\r\u0000\u00a4\u0095\u0001\u0000\u0000\u0000\u00a4"+
		"\u0097\u0001\u0000\u0000\u0000\u00a4\u0099\u0001\u0000\u0000\u0000\u00a4"+
		"\u009a\u0001\u0000\u0000\u0000\u00a4\u009b\u0001\u0000\u0000\u0000\u00a4"+
		"\u009f\u0001\u0000\u0000\u0000\u00a4\u00a0\u0001\u0000\u0000\u0000\u00a5"+
		"\u0019\u0001\u0000\u0000\u0000\u00a6\u00ab\u0003\u001c\u000e\u0000\u00a7"+
		"\u00a8\u0007\u0000\u0000\u0000\u00a8\u00aa\u0003\u001c\u000e\u0000\u00a9"+
		"\u00a7\u0001\u0000\u0000\u0000\u00aa\u00ad\u0001\u0000\u0000\u0000\u00ab"+
		"\u00a9\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac"+
		"\u001b\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ae"+
		"\u00b3\u0003\u001e\u000f\u0000\u00af\u00b0\u0007\u0001\u0000\u0000\u00b0"+
		"\u00b2\u0003\u001e\u000f\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b2"+
		"\u00b5\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b3"+
		"\u00b4\u0001\u0000\u0000\u0000\u00b4\u001d\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b3\u0001\u0000\u0000\u0000\u00b6\u00bb\u0003 \u0010\u0000\u00b7\u00b8"+
		"\u0007\u0002\u0000\u0000\u00b8\u00ba\u0003 \u0010\u0000\u00b9\u00b7\u0001"+
		"\u0000\u0000\u0000\u00ba\u00bd\u0001\u0000\u0000\u0000\u00bb\u00b9\u0001"+
		"\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc\u001f\u0001"+
		"\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00be\u00bf\u0003"+
		"\"\u0011\u0000\u00bf!\u0001\u0000\u0000\u0000\u00c0\u00cf\u0005!\u0000"+
		"\u0000\u00c1\u00cf\u0005\"\u0000\u0000\u00c2\u00c7\u0005 \u0000\u0000"+
		"\u00c3\u00c4\u0005\t\u0000\u0000\u00c4\u00c6\u0005 \u0000\u0000\u00c5"+
		"\u00c3\u0001\u0000\u0000\u0000\u00c6\u00c9\u0001\u0000\u0000\u0000\u00c7"+
		"\u00c5\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8"+
		"\u00cf\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00ca"+
		"\u00cb\u0005\u0007\u0000\u0000\u00cb\u00cc\u0003\u001a\r\u0000\u00cc\u00cd"+
		"\u0005\b\u0000\u0000\u00cd\u00cf\u0001\u0000\u0000\u0000\u00ce\u00c0\u0001"+
		"\u0000\u0000\u0000\u00ce\u00c1\u0001\u0000\u0000\u0000\u00ce\u00c2\u0001"+
		"\u0000\u0000\u0000\u00ce\u00ca\u0001\u0000\u0000\u0000\u00cf#\u0001\u0000"+
		"\u0000\u0000\u0012-/7FJPYafl\u0083\u008b\u00a4\u00ab\u00b3\u00bb\u00c7"+
		"\u00ce";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}