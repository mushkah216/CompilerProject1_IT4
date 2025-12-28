// Generated from C:/Users/acer-/IdeaProjects/compiler/src/parser_pkg/pythonParser.g4 by ANTLR 4.13.2

    package parser_pkg;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class pythonParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DEF=1, IF=2, ELSE=3, ELIF=4, WHILE=5, FOR=6, IN=7, PRINT=8, RETURN=9, 
		AND=10, OR=11, NOT=12, TRUE=13, FALSE=14, NONE=15, IMPORT=16, FROM=17, 
		AS=18, IS=19, PLUS=20, MINUS=21, MUL=22, AT=23, DIV=24, EQ=25, EQEQ=26, 
		LT=27, GT=28, LE=29, GE=30, NOT_EQ=31, LP=32, RP=33, LB=34, RB=35, LC=36, 
		RC=37, COMMA=38, COLON=39, DOT=40, ID=41, NUMBER=42, STRING=43, WS=44, 
		COMMENT=45, NEWLINE=46, INDENT=47, DEDENT=48;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_simple_stmt = 2, RULE_compound_stmt = 3, 
		RULE_importStatement = 4, RULE_functionDef = 5, RULE_decorator = 6, RULE_parameters = 7, 
		RULE_block = 8, RULE_assignment = 9, RULE_target = 10, RULE_expressionStatement = 11, 
		RULE_returnStatement = 12, RULE_testList = 13, RULE_ifStatement = 14, 
		RULE_elifPart = 15, RULE_elsePart = 16, RULE_whileStatement = 17, RULE_forStatement = 18, 
		RULE_expression = 19, RULE_logic_expr = 20, RULE_comparison = 21, RULE_arith_expr = 22, 
		RULE_term = 23, RULE_factor = 24, RULE_trailer = 25, RULE_argList = 26, 
		RULE_testList_comp = 27, RULE_argument = 28, RULE_atom = 29, RULE_listLiteral = 30, 
		RULE_dictLiteral = 31, RULE_dictEntry = 32, RULE_comp_for = 33, RULE_comp_iter = 34, 
		RULE_star_expr = 35, RULE_expr_list = 36;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "simple_stmt", "compound_stmt", "importStatement", 
			"functionDef", "decorator", "parameters", "block", "assignment", "target", 
			"expressionStatement", "returnStatement", "testList", "ifStatement", 
			"elifPart", "elsePart", "whileStatement", "forStatement", "expression", 
			"logic_expr", "comparison", "arith_expr", "term", "factor", "trailer", 
			"argList", "testList_comp", "argument", "atom", "listLiteral", "dictLiteral", 
			"dictEntry", "comp_for", "comp_iter", "star_expr", "expr_list"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'def'", "'if'", "'else'", "'elif'", "'while'", "'for'", "'in'", 
			"'print'", "'return'", "'and'", "'or'", "'not'", "'True'", "'False'", 
			"'None'", "'import'", "'from'", "'as'", "'is'", "'+'", "'-'", "'*'", 
			"'@'", "'/'", "'='", "'=='", "'<'", "'>'", "'<='", "'>='", "'!='", "'('", 
			"')'", "'{'", "'}'", "'['", "']'", "','", "':'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DEF", "IF", "ELSE", "ELIF", "WHILE", "FOR", "IN", "PRINT", "RETURN", 
			"AND", "OR", "NOT", "TRUE", "FALSE", "NONE", "IMPORT", "FROM", "AS", 
			"IS", "PLUS", "MINUS", "MUL", "AT", "DIV", "EQ", "EQEQ", "LT", "GT", 
			"LE", "GE", "NOT_EQ", "LP", "RP", "LB", "RB", "LC", "RC", "COMMA", "COLON", 
			"DOT", "ID", "NUMBER", "STRING", "WS", "COMMENT", "NEWLINE", "INDENT", 
			"DEDENT"
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
	public String getGrammarFileName() { return "pythonParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public pythonParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(pythonParser.EOF, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(pythonParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(pythonParser.NEWLINE, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 85852113072742L) != 0)) {
				{
				setState(76);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(74);
					match(NEWLINE);
					}
					break;
				case 2:
					{
					setState(75);
					statement();
					}
					break;
				}
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(81);
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
	public static class StatementContext extends ParserRuleContext {
		public Compound_stmtContext compound_stmt() {
			return getRuleContext(Compound_stmtContext.class,0);
		}
		public Simple_stmtContext simple_stmt() {
			return getRuleContext(Simple_stmtContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(pythonParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(pythonParser.NEWLINE, i);
		}
		public TerminalNode EOF() { return getToken(pythonParser.EOF, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				compound_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				simple_stmt();
				setState(85);
				_la = _input.LA(1);
				if ( !(_la==EOF || _la==NEWLINE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(88); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(87);
						match(NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(90); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class Simple_stmtContext extends ParserRuleContext {
		public ImportStatementContext importStatement() {
			return getRuleContext(ImportStatementContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public Logic_exprContext logic_expr() {
			return getRuleContext(Logic_exprContext.class,0);
		}
		public Simple_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterSimple_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitSimple_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitSimple_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_stmtContext simple_stmt() throws RecognitionException {
		Simple_stmtContext _localctx = new Simple_stmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_simple_stmt);
		try {
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				importStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				returnStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(97);
				expressionStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(98);
				logic_expr();
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
	public static class Compound_stmtContext extends ParserRuleContext {
		public FunctionDefContext functionDef() {
			return getRuleContext(FunctionDefContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public Compound_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterCompound_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitCompound_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitCompound_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compound_stmtContext compound_stmt() throws RecognitionException {
		Compound_stmtContext _localctx = new Compound_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_compound_stmt);
		try {
			setState(105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEF:
			case AT:
			case NEWLINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				functionDef();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				ifStatement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(103);
				whileStatement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(104);
				forStatement();
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
	public static class ImportStatementContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(pythonParser.IMPORT, 0); }
		public List<TerminalNode> ID() { return getTokens(pythonParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(pythonParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(pythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(pythonParser.COMMA, i);
		}
		public TerminalNode AS() { return getToken(pythonParser.AS, 0); }
		public TerminalNode FROM() { return getToken(pythonParser.FROM, 0); }
		public TerminalNode MUL() { return getToken(pythonParser.MUL, 0); }
		public List<TerminalNode> DOT() { return getTokens(pythonParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(pythonParser.DOT, i);
		}
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_importStatement);
		int _la;
		try {
			setState(141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				match(IMPORT);
				setState(108);
				match(ID);
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(109);
					match(COMMA);
					setState(110);
					match(ID);
					}
					}
					setState(115);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(116);
					match(AS);
					setState(117);
					match(ID);
					}
				}

				}
				break;
			case FROM:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				match(FROM);
				setState(121);
				match(ID);
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(122);
					match(DOT);
					setState(123);
					match(ID);
					}
					}
					setState(128);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(129);
				match(IMPORT);
				setState(139);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
					{
					setState(130);
					match(ID);
					setState(135);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(131);
						match(COMMA);
						setState(132);
						match(ID);
						}
						}
						setState(137);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case MUL:
					{
					setState(138);
					match(MUL);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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
	public static class FunctionDefContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(pythonParser.DEF, 0); }
		public TerminalNode ID() { return getToken(pythonParser.ID, 0); }
		public TerminalNode LP() { return getToken(pythonParser.LP, 0); }
		public TerminalNode RP() { return getToken(pythonParser.RP, 0); }
		public TerminalNode COLON() { return getToken(pythonParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<DecoratorContext> decorator() {
			return getRuleContexts(DecoratorContext.class);
		}
		public DecoratorContext decorator(int i) {
			return getRuleContext(DecoratorContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(pythonParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(pythonParser.NEWLINE, i);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public FunctionDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterFunctionDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitFunctionDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitFunctionDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefContext functionDef() throws RecognitionException {
		FunctionDefContext _localctx = new FunctionDefContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functionDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT) {
				{
				{
				setState(143);
				decorator();
				}
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(149);
				match(NEWLINE);
				}
				}
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(155);
			match(DEF);
			setState(156);
			match(ID);
			setState(157);
			match(LP);
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(158);
				parameters();
				}
			}

			setState(161);
			match(RP);
			setState(162);
			match(COLON);
			setState(163);
			block();
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
	public static class DecoratorContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(pythonParser.AT, 0); }
		public List<TerminalNode> ID() { return getTokens(pythonParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(pythonParser.ID, i);
		}
		public List<TerminalNode> DOT() { return getTokens(pythonParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(pythonParser.DOT, i);
		}
		public TerminalNode LP() { return getToken(pythonParser.LP, 0); }
		public TerminalNode RP() { return getToken(pythonParser.RP, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(pythonParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(pythonParser.NEWLINE, i);
		}
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public DecoratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decorator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterDecorator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitDecorator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitDecorator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecoratorContext decorator() throws RecognitionException {
		DecoratorContext _localctx = new DecoratorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_decorator);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(AT);
			setState(166);
			match(ID);
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(167);
				match(DOT);
				setState(168);
				match(ID);
				}
				}
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP) {
				{
				setState(174);
				match(LP);
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 15483360309248L) != 0)) {
					{
					setState(175);
					argList();
					}
				}

				setState(178);
				match(RP);
				}
			}

			setState(184);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(181);
					match(NEWLINE);
					}
					} 
				}
				setState(186);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
	public static class ParametersContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(pythonParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(pythonParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(pythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(pythonParser.COMMA, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(ID);
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(188);
				match(COMMA);
				setState(189);
				match(ID);
				}
				}
				setState(194);
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
	public static class BlockContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(pythonParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(pythonParser.NEWLINE, i);
		}
		public TerminalNode INDENT() { return getToken(pythonParser.INDENT, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode DEDENT() { return getToken(pythonParser.DEDENT, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(NEWLINE);
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INDENT) {
				{
				setState(196);
				match(INDENT);
				}
			}

			setState(201); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(201);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						setState(199);
						statement();
						}
						break;
					case 2:
						{
						setState(200);
						match(NEWLINE);
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(203); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(205);
				match(DEDENT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public TargetContext target() {
			return getRuleContext(TargetContext.class,0);
		}
		public TerminalNode EQ() { return getToken(pythonParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			target();
			setState(209);
			match(EQ);
			setState(210);
			expression();
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
	public static class TargetContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(pythonParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(pythonParser.ID, i);
		}
		public List<TerminalNode> DOT() { return getTokens(pythonParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(pythonParser.DOT, i);
		}
		public List<TerminalNode> LC() { return getTokens(pythonParser.LC); }
		public TerminalNode LC(int i) {
			return getToken(pythonParser.LC, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RC() { return getTokens(pythonParser.RC); }
		public TerminalNode RC(int i) {
			return getToken(pythonParser.RC, i);
		}
		public TargetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_target; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterTarget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitTarget(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitTarget(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TargetContext target() throws RecognitionException {
		TargetContext _localctx = new TargetContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_target);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(ID);
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LC || _la==DOT) {
				{
				setState(219);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DOT:
					{
					setState(213);
					match(DOT);
					setState(214);
					match(ID);
					}
					break;
				case LC:
					{
					setState(215);
					match(LC);
					setState(216);
					expression();
					setState(217);
					match(RC);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(223);
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
	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			expression();
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
	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(pythonParser.RETURN, 0); }
		public TestListContext testList() {
			return getRuleContext(TestListContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(RETURN);
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 15483360309248L) != 0)) {
				{
				setState(227);
				testList();
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
	public static class TestListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(pythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(pythonParser.COMMA, i);
		}
		public TestListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_testList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterTestList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitTestList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitTestList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TestListContext testList() throws RecognitionException {
		TestListContext _localctx = new TestListContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_testList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			expression();
			setState(235);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(231);
					match(COMMA);
					setState(232);
					expression();
					}
					} 
				}
				setState(237);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(238);
				match(COMMA);
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
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(pythonParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(pythonParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<ElifPartContext> elifPart() {
			return getRuleContexts(ElifPartContext.class);
		}
		public ElifPartContext elifPart(int i) {
			return getRuleContext(ElifPartContext.class,i);
		}
		public ElsePartContext elsePart() {
			return getRuleContext(ElsePartContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ifStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(IF);
			setState(242);
			expression();
			setState(243);
			match(COLON);
			setState(244);
			block();
			setState(248);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(245);
					elifPart();
					}
					} 
				}
				setState(250);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(251);
				elsePart();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElifPartContext extends ParserRuleContext {
		public TerminalNode ELIF() { return getToken(pythonParser.ELIF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(pythonParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElifPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elifPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterElifPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitElifPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitElifPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElifPartContext elifPart() throws RecognitionException {
		ElifPartContext _localctx = new ElifPartContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_elifPart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(ELIF);
			setState(255);
			expression();
			setState(256);
			match(COLON);
			setState(257);
			block();
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
	public static class ElsePartContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(pythonParser.ELSE, 0); }
		public TerminalNode COLON() { return getToken(pythonParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElsePartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsePart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterElsePart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitElsePart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitElsePart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElsePartContext elsePart() throws RecognitionException {
		ElsePartContext _localctx = new ElsePartContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_elsePart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(ELSE);
			setState(260);
			match(COLON);
			setState(261);
			block();
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
	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(pythonParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(pythonParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(WHILE);
			setState(264);
			expression();
			setState(265);
			match(COLON);
			setState(266);
			block();
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
	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(pythonParser.FOR, 0); }
		public TerminalNode ID() { return getToken(pythonParser.ID, 0); }
		public TerminalNode IN() { return getToken(pythonParser.IN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(pythonParser.COLON, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(FOR);
			setState(269);
			match(ID);
			setState(270);
			match(IN);
			setState(271);
			expression();
			setState(272);
			match(COLON);
			setState(273);
			block();
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
		public List<Logic_exprContext> logic_expr() {
			return getRuleContexts(Logic_exprContext.class);
		}
		public Logic_exprContext logic_expr(int i) {
			return getRuleContext(Logic_exprContext.class,i);
		}
		public TerminalNode IF() { return getToken(pythonParser.IF, 0); }
		public TerminalNode ELSE() { return getToken(pythonParser.ELSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			logic_expr();
			setState(281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(276);
				match(IF);
				setState(277);
				logic_expr();
				setState(278);
				match(ELSE);
				setState(279);
				expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Logic_exprContext extends ParserRuleContext {
		public List<ComparisonContext> comparison() {
			return getRuleContexts(ComparisonContext.class);
		}
		public ComparisonContext comparison(int i) {
			return getRuleContext(ComparisonContext.class,i);
		}
		public List<TerminalNode> NOT() { return getTokens(pythonParser.NOT); }
		public TerminalNode NOT(int i) {
			return getToken(pythonParser.NOT, i);
		}
		public List<TerminalNode> AND() { return getTokens(pythonParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(pythonParser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(pythonParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(pythonParser.OR, i);
		}
		public List<TerminalNode> IS() { return getTokens(pythonParser.IS); }
		public TerminalNode IS(int i) {
			return getToken(pythonParser.IS, i);
		}
		public Logic_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterLogic_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitLogic_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitLogic_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logic_exprContext logic_expr() throws RecognitionException {
		Logic_exprContext _localctx = new Logic_exprContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_logic_expr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(283);
					match(NOT);
					}
					} 
				}
				setState(288);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			setState(289);
			comparison();
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 527360L) != 0)) {
				{
				{
				setState(290);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 527360L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(291);
				comparison();
				}
				}
				setState(296);
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
	public static class ComparisonContext extends ParserRuleContext {
		public List<Arith_exprContext> arith_expr() {
			return getRuleContexts(Arith_exprContext.class);
		}
		public Arith_exprContext arith_expr(int i) {
			return getRuleContext(Arith_exprContext.class,i);
		}
		public List<TerminalNode> EQEQ() { return getTokens(pythonParser.EQEQ); }
		public TerminalNode EQEQ(int i) {
			return getToken(pythonParser.EQEQ, i);
		}
		public List<TerminalNode> NOT_EQ() { return getTokens(pythonParser.NOT_EQ); }
		public TerminalNode NOT_EQ(int i) {
			return getToken(pythonParser.NOT_EQ, i);
		}
		public List<TerminalNode> LT() { return getTokens(pythonParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(pythonParser.LT, i);
		}
		public List<TerminalNode> GT() { return getTokens(pythonParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(pythonParser.GT, i);
		}
		public List<TerminalNode> LE() { return getTokens(pythonParser.LE); }
		public TerminalNode LE(int i) {
			return getToken(pythonParser.LE, i);
		}
		public List<TerminalNode> GE() { return getTokens(pythonParser.GE); }
		public TerminalNode GE(int i) {
			return getToken(pythonParser.GE, i);
		}
		public List<TerminalNode> IS() { return getTokens(pythonParser.IS); }
		public TerminalNode IS(int i) {
			return getToken(pythonParser.IS, i);
		}
		public List<TerminalNode> IN() { return getTokens(pythonParser.IN); }
		public TerminalNode IN(int i) {
			return getToken(pythonParser.IN, i);
		}
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_comparison);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			arith_expr();
			setState(302);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(298);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4228382848L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(299);
					arith_expr();
					}
					} 
				}
				setState(304);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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
	public static class Arith_exprContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(pythonParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(pythonParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(pythonParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(pythonParser.MINUS, i);
		}
		public Arith_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arith_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterArith_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitArith_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitArith_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arith_exprContext arith_expr() throws RecognitionException {
		Arith_exprContext _localctx = new Arith_exprContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_arith_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			term();
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(306);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(307);
				term();
				}
				}
				setState(312);
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
		public List<TerminalNode> MUL() { return getTokens(pythonParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(pythonParser.MUL, i);
		}
		public List<TerminalNode> DIV() { return getTokens(pythonParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(pythonParser.DIV, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			factor();
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MUL || _la==DIV) {
				{
				{
				setState(314);
				_la = _input.LA(1);
				if ( !(_la==MUL || _la==DIV) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(315);
				factor();
				}
				}
				setState(320);
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
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public List<TrailerContext> trailer() {
			return getRuleContexts(TrailerContext.class);
		}
		public TrailerContext trailer(int i) {
			return getRuleContext(TrailerContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(pythonParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(pythonParser.MINUS, 0); }
		public TerminalNode NOT() { return getToken(pythonParser.NOT, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_factor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3149824L) != 0)) {
				{
				setState(321);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3149824L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(324);
			atom();
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1172526071808L) != 0)) {
				{
				{
				setState(325);
				trailer();
				}
				}
				setState(330);
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
	public static class TrailerContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(pythonParser.LP, 0); }
		public TerminalNode RP() { return getToken(pythonParser.RP, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public TerminalNode LC() { return getToken(pythonParser.LC, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RC() { return getToken(pythonParser.RC, 0); }
		public TerminalNode DOT() { return getToken(pythonParser.DOT, 0); }
		public TerminalNode ID() { return getToken(pythonParser.ID, 0); }
		public TrailerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trailer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterTrailer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitTrailer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitTrailer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrailerContext trailer() throws RecognitionException {
		TrailerContext _localctx = new TrailerContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_trailer);
		int _la;
		try {
			setState(342);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LP:
				enterOuterAlt(_localctx, 1);
				{
				setState(331);
				match(LP);
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 15483360309248L) != 0)) {
					{
					setState(332);
					argList();
					}
				}

				setState(335);
				match(RP);
				}
				break;
			case LC:
				enterOuterAlt(_localctx, 2);
				{
				setState(336);
				match(LC);
				setState(337);
				expression();
				setState(338);
				match(RC);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(340);
				match(DOT);
				setState(341);
				match(ID);
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
	public static class ArgListContext extends ParserRuleContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(pythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(pythonParser.COMMA, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(pythonParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(pythonParser.NEWLINE, i);
		}
		public List<TerminalNode> INDENT() { return getTokens(pythonParser.INDENT); }
		public TerminalNode INDENT(int i) {
			return getToken(pythonParser.INDENT, i);
		}
		public List<TerminalNode> DEDENT() { return getTokens(pythonParser.DEDENT); }
		public TerminalNode DEDENT(int i) {
			return getToken(pythonParser.DEDENT, i);
		}
		public ArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterArgList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitArgList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitArgList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgListContext argList() throws RecognitionException {
		ArgListContext _localctx = new ArgListContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_argList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			argument();
			setState(355);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(345);
					match(COMMA);
					setState(349);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 492581209243648L) != 0)) {
						{
						{
						setState(346);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 492581209243648L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						setState(351);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(352);
					argument();
					}
					} 
				}
				setState(357);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			}
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(358);
				match(COMMA);
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
	public static class TestList_compContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Comp_forContext comp_for() {
			return getRuleContext(Comp_forContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(pythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(pythonParser.COMMA, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(pythonParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(pythonParser.NEWLINE, i);
		}
		public TestList_compContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_testList_comp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterTestList_comp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitTestList_comp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitTestList_comp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TestList_compContext testList_comp() throws RecognitionException {
		TestList_compContext _localctx = new TestList_compContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_testList_comp);
		int _la;
		try {
			int _alt;
			setState(379);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(361);
				expression();
				setState(362);
				comp_for();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(364);
				expression();
				setState(373);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(366); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(365);
							_la = _input.LA(1);
							if ( !(_la==COMMA || _la==NEWLINE) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							}
							}
							setState(368); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==COMMA || _la==NEWLINE );
						setState(370);
						expression();
						}
						} 
					}
					setState(375);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				}
				setState(377);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(376);
					match(COMMA);
					}
				}

				}
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
	public static class ArgumentContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ID() { return getToken(pythonParser.ID, 0); }
		public TerminalNode EQ() { return getToken(pythonParser.EQ, 0); }
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(381);
				match(ID);
				setState(382);
				match(EQ);
				}
				break;
			}
			setState(385);
			expression();
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
	public static class AtomContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(pythonParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(pythonParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(pythonParser.STRING, 0); }
		public ListLiteralContext listLiteral() {
			return getRuleContext(ListLiteralContext.class,0);
		}
		public DictLiteralContext dictLiteral() {
			return getRuleContext(DictLiteralContext.class,0);
		}
		public TerminalNode LP() { return getToken(pythonParser.LP, 0); }
		public TestList_compContext testList_comp() {
			return getRuleContext(TestList_compContext.class,0);
		}
		public TerminalNode RP() { return getToken(pythonParser.RP, 0); }
		public TerminalNode TRUE() { return getToken(pythonParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(pythonParser.FALSE, 0); }
		public TerminalNode NONE() { return getToken(pythonParser.NONE, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_atom);
		try {
			setState(399);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(387);
				match(ID);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(388);
				match(NUMBER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(389);
				match(STRING);
				}
				break;
			case LC:
				enterOuterAlt(_localctx, 4);
				{
				setState(390);
				listLiteral();
				}
				break;
			case LB:
				enterOuterAlt(_localctx, 5);
				{
				setState(391);
				dictLiteral();
				}
				break;
			case LP:
				enterOuterAlt(_localctx, 6);
				{
				setState(392);
				match(LP);
				setState(393);
				testList_comp();
				setState(394);
				match(RP);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 7);
				{
				setState(396);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 8);
				{
				setState(397);
				match(FALSE);
				}
				break;
			case NONE:
				enterOuterAlt(_localctx, 9);
				{
				setState(398);
				match(NONE);
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
	public static class ListLiteralContext extends ParserRuleContext {
		public TerminalNode LC() { return getToken(pythonParser.LC, 0); }
		public TerminalNode RC() { return getToken(pythonParser.RC, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(pythonParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(pythonParser.NEWLINE, i);
		}
		public TestList_compContext testList_comp() {
			return getRuleContext(TestList_compContext.class,0);
		}
		public ListLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterListLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitListLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitListLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListLiteralContext listLiteral() throws RecognitionException {
		ListLiteralContext _localctx = new ListLiteralContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_listLiteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			match(LC);
			setState(405);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(402);
					match(NEWLINE);
					}
					} 
				}
				setState(407);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			}
			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 15483360309248L) != 0)) {
				{
				setState(408);
				testList_comp();
				}
			}

			setState(414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(411);
				match(NEWLINE);
				}
				}
				setState(416);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(417);
			match(RC);
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
	public static class DictLiteralContext extends ParserRuleContext {
		public TerminalNode LB() { return getToken(pythonParser.LB, 0); }
		public TerminalNode RB() { return getToken(pythonParser.RB, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(pythonParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(pythonParser.NEWLINE, i);
		}
		public List<DictEntryContext> dictEntry() {
			return getRuleContexts(DictEntryContext.class);
		}
		public DictEntryContext dictEntry(int i) {
			return getRuleContext(DictEntryContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(pythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(pythonParser.COMMA, i);
		}
		public DictLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterDictLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitDictLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitDictLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictLiteralContext dictLiteral() throws RecognitionException {
		DictLiteralContext _localctx = new DictLiteralContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_dictLiteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			match(LB);
			setState(423);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(420);
					match(NEWLINE);
					}
					} 
				}
				setState(425);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			setState(440);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 15483360309248L) != 0)) {
				{
				setState(426);
				dictEntry();
				setState(437);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(427);
						match(COMMA);
						setState(431);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NEWLINE) {
							{
							{
							setState(428);
							match(NEWLINE);
							}
							}
							setState(433);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(434);
						dictEntry();
						}
						} 
					}
					setState(439);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				}
				}
			}

			setState(443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(442);
				match(COMMA);
				}
			}

			setState(448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(445);
				match(NEWLINE);
				}
				}
				setState(450);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(451);
			match(RB);
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
	public static class DictEntryContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COLON() { return getToken(pythonParser.COLON, 0); }
		public DictEntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictEntry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterDictEntry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitDictEntry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitDictEntry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictEntryContext dictEntry() throws RecognitionException {
		DictEntryContext _localctx = new DictEntryContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_dictEntry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			expression();
			setState(454);
			match(COLON);
			setState(455);
			expression();
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
	public static class Comp_forContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(pythonParser.FOR, 0); }
		public TargetContext target() {
			return getRuleContext(TargetContext.class,0);
		}
		public TerminalNode IN() { return getToken(pythonParser.IN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Comp_iterContext comp_iter() {
			return getRuleContext(Comp_iterContext.class,0);
		}
		public Comp_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterComp_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitComp_for(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitComp_for(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comp_forContext comp_for() throws RecognitionException {
		Comp_forContext _localctx = new Comp_forContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_comp_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			match(FOR);
			setState(458);
			target();
			setState(459);
			match(IN);
			setState(460);
			expression();
			setState(462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF || _la==FOR) {
				{
				setState(461);
				comp_iter();
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
	public static class Comp_iterContext extends ParserRuleContext {
		public Comp_forContext comp_for() {
			return getRuleContext(Comp_forContext.class,0);
		}
		public TerminalNode IF() { return getToken(pythonParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Comp_iterContext comp_iter() {
			return getRuleContext(Comp_iterContext.class,0);
		}
		public Comp_iterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_iter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterComp_iter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitComp_iter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitComp_iter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comp_iterContext comp_iter() throws RecognitionException {
		Comp_iterContext _localctx = new Comp_iterContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_comp_iter);
		int _la;
		try {
			setState(470);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(464);
				comp_for();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(465);
				match(IF);
				setState(466);
				expression();
				setState(468);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF || _la==FOR) {
					{
					setState(467);
					comp_iter();
					}
				}

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
	public static class Star_exprContext extends ParserRuleContext {
		public TerminalNode MUL() { return getToken(pythonParser.MUL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Star_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_star_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterStar_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitStar_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitStar_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Star_exprContext star_expr() throws RecognitionException {
		Star_exprContext _localctx = new Star_exprContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_star_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			match(MUL);
			setState(473);
			expression();
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
	public static class Expr_listContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<Star_exprContext> star_expr() {
			return getRuleContexts(Star_exprContext.class);
		}
		public Star_exprContext star_expr(int i) {
			return getRuleContext(Star_exprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(pythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(pythonParser.COMMA, i);
		}
		public Expr_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).enterExpr_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonParserListener ) ((pythonParserListener)listener).exitExpr_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pythonParserVisitor ) return ((pythonParserVisitor<? extends T>)visitor).visitExpr_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_listContext expr_list() throws RecognitionException {
		Expr_listContext _localctx = new Expr_listContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_expr_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
			case TRUE:
			case FALSE:
			case NONE:
			case PLUS:
			case MINUS:
			case LP:
			case LB:
			case LC:
			case ID:
			case NUMBER:
			case STRING:
				{
				setState(475);
				expression();
				}
				break;
			case MUL:
				{
				setState(476);
				star_expr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(486);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(479);
				match(COMMA);
				setState(482);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NOT:
				case TRUE:
				case FALSE:
				case NONE:
				case PLUS:
				case MINUS:
				case LP:
				case LB:
				case LC:
				case ID:
				case NUMBER:
				case STRING:
					{
					setState(480);
					expression();
					}
					break;
				case MUL:
					{
					setState(481);
					star_expr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(488);
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

	public static final String _serializedATN =
		"\u0004\u00010\u01ea\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0001\u0000\u0001\u0000\u0005\u0000M\b\u0000\n"+
		"\u0000\f\u0000P\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001Y\b\u0001\u000b\u0001"+
		"\f\u0001Z\u0003\u0001]\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002d\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003j\b\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0005\u0004p\b\u0004\n\u0004\f\u0004s\t\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004w\b\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0005\u0004}\b\u0004\n\u0004\f\u0004\u0080\t\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u0086\b\u0004"+
		"\n\u0004\f\u0004\u0089\t\u0004\u0001\u0004\u0003\u0004\u008c\b\u0004\u0003"+
		"\u0004\u008e\b\u0004\u0001\u0005\u0005\u0005\u0091\b\u0005\n\u0005\f\u0005"+
		"\u0094\t\u0005\u0001\u0005\u0005\u0005\u0097\b\u0005\n\u0005\f\u0005\u009a"+
		"\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00a0"+
		"\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00aa\b\u0006\n\u0006\f\u0006"+
		"\u00ad\t\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00b1\b\u0006\u0001"+
		"\u0006\u0003\u0006\u00b4\b\u0006\u0001\u0006\u0005\u0006\u00b7\b\u0006"+
		"\n\u0006\f\u0006\u00ba\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0005"+
		"\u0007\u00bf\b\u0007\n\u0007\f\u0007\u00c2\t\u0007\u0001\b\u0001\b\u0003"+
		"\b\u00c6\b\b\u0001\b\u0001\b\u0004\b\u00ca\b\b\u000b\b\f\b\u00cb\u0001"+
		"\b\u0003\b\u00cf\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00dc\b\n\n\n\f\n\u00df\t\n"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0003\f\u00e5\b\f\u0001\r\u0001"+
		"\r\u0001\r\u0005\r\u00ea\b\r\n\r\f\r\u00ed\t\r\u0001\r\u0003\r\u00f0\b"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e"+
		"\u00f7\b\u000e\n\u000e\f\u000e\u00fa\t\u000e\u0001\u000e\u0003\u000e\u00fd"+
		"\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u011a\b\u0013\u0001"+
		"\u0014\u0005\u0014\u011d\b\u0014\n\u0014\f\u0014\u0120\t\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0005\u0014\u0125\b\u0014\n\u0014\f\u0014\u0128"+
		"\t\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u012d\b\u0015"+
		"\n\u0015\f\u0015\u0130\t\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0005"+
		"\u0016\u0135\b\u0016\n\u0016\f\u0016\u0138\t\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0005\u0017\u013d\b\u0017\n\u0017\f\u0017\u0140\t\u0017\u0001"+
		"\u0018\u0003\u0018\u0143\b\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u0147"+
		"\b\u0018\n\u0018\f\u0018\u014a\t\u0018\u0001\u0019\u0001\u0019\u0003\u0019"+
		"\u014e\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0003\u0019\u0157\b\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0005\u001a\u015c\b\u001a\n\u001a\f\u001a\u015f\t\u001a\u0001"+
		"\u001a\u0005\u001a\u0162\b\u001a\n\u001a\f\u001a\u0165\t\u001a\u0001\u001a"+
		"\u0003\u001a\u0168\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0004\u001b\u016f\b\u001b\u000b\u001b\f\u001b\u0170\u0001"+
		"\u001b\u0005\u001b\u0174\b\u001b\n\u001b\f\u001b\u0177\t\u001b\u0001\u001b"+
		"\u0003\u001b\u017a\b\u001b\u0003\u001b\u017c\b\u001b\u0001\u001c\u0001"+
		"\u001c\u0003\u001c\u0180\b\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u0190"+
		"\b\u001d\u0001\u001e\u0001\u001e\u0005\u001e\u0194\b\u001e\n\u001e\f\u001e"+
		"\u0197\t\u001e\u0001\u001e\u0003\u001e\u019a\b\u001e\u0001\u001e\u0005"+
		"\u001e\u019d\b\u001e\n\u001e\f\u001e\u01a0\t\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001f\u0001\u001f\u0005\u001f\u01a6\b\u001f\n\u001f\f\u001f\u01a9"+
		"\t\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u01ae\b\u001f"+
		"\n\u001f\f\u001f\u01b1\t\u001f\u0001\u001f\u0005\u001f\u01b4\b\u001f\n"+
		"\u001f\f\u001f\u01b7\t\u001f\u0003\u001f\u01b9\b\u001f\u0001\u001f\u0003"+
		"\u001f\u01bc\b\u001f\u0001\u001f\u0005\u001f\u01bf\b\u001f\n\u001f\f\u001f"+
		"\u01c2\t\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0003!\u01cf\b!\u0001\"\u0001\"\u0001\""+
		"\u0001\"\u0003\"\u01d5\b\"\u0003\"\u01d7\b\"\u0001#\u0001#\u0001#\u0001"+
		"$\u0001$\u0003$\u01de\b$\u0001$\u0001$\u0001$\u0003$\u01e3\b$\u0005$\u01e5"+
		"\b$\n$\f$\u01e8\t$\u0001$\u0000\u0000%\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF"+
		"H\u0000\b\u0001\u0001..\u0002\u0000\n\u000b\u0013\u0013\u0003\u0000\u0007"+
		"\u0007\u0013\u0013\u001a\u001f\u0001\u0000\u0014\u0015\u0002\u0000\u0016"+
		"\u0016\u0018\u0018\u0002\u0000\f\f\u0014\u0015\u0001\u0000.0\u0002\u0000"+
		"&&..\u0213\u0000N\u0001\u0000\u0000\u0000\u0002\\\u0001\u0000\u0000\u0000"+
		"\u0004c\u0001\u0000\u0000\u0000\u0006i\u0001\u0000\u0000\u0000\b\u008d"+
		"\u0001\u0000\u0000\u0000\n\u0092\u0001\u0000\u0000\u0000\f\u00a5\u0001"+
		"\u0000\u0000\u0000\u000e\u00bb\u0001\u0000\u0000\u0000\u0010\u00c3\u0001"+
		"\u0000\u0000\u0000\u0012\u00d0\u0001\u0000\u0000\u0000\u0014\u00d4\u0001"+
		"\u0000\u0000\u0000\u0016\u00e0\u0001\u0000\u0000\u0000\u0018\u00e2\u0001"+
		"\u0000\u0000\u0000\u001a\u00e6\u0001\u0000\u0000\u0000\u001c\u00f1\u0001"+
		"\u0000\u0000\u0000\u001e\u00fe\u0001\u0000\u0000\u0000 \u0103\u0001\u0000"+
		"\u0000\u0000\"\u0107\u0001\u0000\u0000\u0000$\u010c\u0001\u0000\u0000"+
		"\u0000&\u0113\u0001\u0000\u0000\u0000(\u011e\u0001\u0000\u0000\u0000*"+
		"\u0129\u0001\u0000\u0000\u0000,\u0131\u0001\u0000\u0000\u0000.\u0139\u0001"+
		"\u0000\u0000\u00000\u0142\u0001\u0000\u0000\u00002\u0156\u0001\u0000\u0000"+
		"\u00004\u0158\u0001\u0000\u0000\u00006\u017b\u0001\u0000\u0000\u00008"+
		"\u017f\u0001\u0000\u0000\u0000:\u018f\u0001\u0000\u0000\u0000<\u0191\u0001"+
		"\u0000\u0000\u0000>\u01a3\u0001\u0000\u0000\u0000@\u01c5\u0001\u0000\u0000"+
		"\u0000B\u01c9\u0001\u0000\u0000\u0000D\u01d6\u0001\u0000\u0000\u0000F"+
		"\u01d8\u0001\u0000\u0000\u0000H\u01dd\u0001\u0000\u0000\u0000JM\u0005"+
		".\u0000\u0000KM\u0003\u0002\u0001\u0000LJ\u0001\u0000\u0000\u0000LK\u0001"+
		"\u0000\u0000\u0000MP\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000"+
		"NO\u0001\u0000\u0000\u0000OQ\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000"+
		"\u0000QR\u0005\u0000\u0000\u0001R\u0001\u0001\u0000\u0000\u0000S]\u0003"+
		"\u0006\u0003\u0000TU\u0003\u0004\u0002\u0000UV\u0007\u0000\u0000\u0000"+
		"V]\u0001\u0000\u0000\u0000WY\u0005.\u0000\u0000XW\u0001\u0000\u0000\u0000"+
		"YZ\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000"+
		"\u0000[]\u0001\u0000\u0000\u0000\\S\u0001\u0000\u0000\u0000\\T\u0001\u0000"+
		"\u0000\u0000\\X\u0001\u0000\u0000\u0000]\u0003\u0001\u0000\u0000\u0000"+
		"^d\u0003\b\u0004\u0000_d\u0003\u0012\t\u0000`d\u0003\u0018\f\u0000ad\u0003"+
		"\u0016\u000b\u0000bd\u0003(\u0014\u0000c^\u0001\u0000\u0000\u0000c_\u0001"+
		"\u0000\u0000\u0000c`\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000"+
		"cb\u0001\u0000\u0000\u0000d\u0005\u0001\u0000\u0000\u0000ej\u0003\n\u0005"+
		"\u0000fj\u0003\u001c\u000e\u0000gj\u0003\"\u0011\u0000hj\u0003$\u0012"+
		"\u0000ie\u0001\u0000\u0000\u0000if\u0001\u0000\u0000\u0000ig\u0001\u0000"+
		"\u0000\u0000ih\u0001\u0000\u0000\u0000j\u0007\u0001\u0000\u0000\u0000"+
		"kl\u0005\u0010\u0000\u0000lq\u0005)\u0000\u0000mn\u0005&\u0000\u0000n"+
		"p\u0005)\u0000\u0000om\u0001\u0000\u0000\u0000ps\u0001\u0000\u0000\u0000"+
		"qo\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rv\u0001\u0000\u0000"+
		"\u0000sq\u0001\u0000\u0000\u0000tu\u0005\u0012\u0000\u0000uw\u0005)\u0000"+
		"\u0000vt\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000w\u008e\u0001"+
		"\u0000\u0000\u0000xy\u0005\u0011\u0000\u0000y~\u0005)\u0000\u0000z{\u0005"+
		"(\u0000\u0000{}\u0005)\u0000\u0000|z\u0001\u0000\u0000\u0000}\u0080\u0001"+
		"\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000"+
		"\u0000\u007f\u0081\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000"+
		"\u0081\u008b\u0005\u0010\u0000\u0000\u0082\u0087\u0005)\u0000\u0000\u0083"+
		"\u0084\u0005&\u0000\u0000\u0084\u0086\u0005)\u0000\u0000\u0085\u0083\u0001"+
		"\u0000\u0000\u0000\u0086\u0089\u0001\u0000\u0000\u0000\u0087\u0085\u0001"+
		"\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u008c\u0001"+
		"\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u008a\u008c\u0005"+
		"\u0016\u0000\u0000\u008b\u0082\u0001\u0000\u0000\u0000\u008b\u008a\u0001"+
		"\u0000\u0000\u0000\u008c\u008e\u0001\u0000\u0000\u0000\u008dk\u0001\u0000"+
		"\u0000\u0000\u008dx\u0001\u0000\u0000\u0000\u008e\t\u0001\u0000\u0000"+
		"\u0000\u008f\u0091\u0003\f\u0006\u0000\u0090\u008f\u0001\u0000\u0000\u0000"+
		"\u0091\u0094\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000"+
		"\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0098\u0001\u0000\u0000\u0000"+
		"\u0094\u0092\u0001\u0000\u0000\u0000\u0095\u0097\u0005.\u0000\u0000\u0096"+
		"\u0095\u0001\u0000\u0000\u0000\u0097\u009a\u0001\u0000\u0000\u0000\u0098"+
		"\u0096\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099"+
		"\u009b\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009b"+
		"\u009c\u0005\u0001\u0000\u0000\u009c\u009d\u0005)\u0000\u0000\u009d\u009f"+
		"\u0005 \u0000\u0000\u009e\u00a0\u0003\u000e\u0007\u0000\u009f\u009e\u0001"+
		"\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001"+
		"\u0000\u0000\u0000\u00a1\u00a2\u0005!\u0000\u0000\u00a2\u00a3\u0005\'"+
		"\u0000\u0000\u00a3\u00a4\u0003\u0010\b\u0000\u00a4\u000b\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a6\u0005\u0017\u0000\u0000\u00a6\u00ab\u0005)\u0000\u0000"+
		"\u00a7\u00a8\u0005(\u0000\u0000\u00a8\u00aa\u0005)\u0000\u0000\u00a9\u00a7"+
		"\u0001\u0000\u0000\u0000\u00aa\u00ad\u0001\u0000\u0000\u0000\u00ab\u00a9"+
		"\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac\u00b3"+
		"\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ae\u00b0"+
		"\u0005 \u0000\u0000\u00af\u00b1\u00034\u001a\u0000\u00b0\u00af\u0001\u0000"+
		"\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b4\u0005!\u0000\u0000\u00b3\u00ae\u0001\u0000\u0000"+
		"\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b8\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b7\u0005.\u0000\u0000\u00b6\u00b5\u0001\u0000\u0000\u0000"+
		"\u00b7\u00ba\u0001\u0000\u0000\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000"+
		"\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\r\u0001\u0000\u0000\u0000\u00ba"+
		"\u00b8\u0001\u0000\u0000\u0000\u00bb\u00c0\u0005)\u0000\u0000\u00bc\u00bd"+
		"\u0005&\u0000\u0000\u00bd\u00bf\u0005)\u0000\u0000\u00be\u00bc\u0001\u0000"+
		"\u0000\u0000\u00bf\u00c2\u0001\u0000\u0000\u0000\u00c0\u00be\u0001\u0000"+
		"\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u000f\u0001\u0000"+
		"\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c3\u00c5\u0005.\u0000"+
		"\u0000\u00c4\u00c6\u0005/\u0000\u0000\u00c5\u00c4\u0001\u0000\u0000\u0000"+
		"\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6\u00c9\u0001\u0000\u0000\u0000"+
		"\u00c7\u00ca\u0003\u0002\u0001\u0000\u00c8\u00ca\u0005.\u0000\u0000\u00c9"+
		"\u00c7\u0001\u0000\u0000\u0000\u00c9\u00c8\u0001\u0000\u0000\u0000\u00ca"+
		"\u00cb\u0001\u0000\u0000\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cb"+
		"\u00cc\u0001\u0000\u0000\u0000\u00cc\u00ce\u0001\u0000\u0000\u0000\u00cd"+
		"\u00cf\u00050\u0000\u0000\u00ce\u00cd\u0001\u0000\u0000\u0000\u00ce\u00cf"+
		"\u0001\u0000\u0000\u0000\u00cf\u0011\u0001\u0000\u0000\u0000\u00d0\u00d1"+
		"\u0003\u0014\n\u0000\u00d1\u00d2\u0005\u0019\u0000\u0000\u00d2\u00d3\u0003"+
		"&\u0013\u0000\u00d3\u0013\u0001\u0000\u0000\u0000\u00d4\u00dd\u0005)\u0000"+
		"\u0000\u00d5\u00d6\u0005(\u0000\u0000\u00d6\u00dc\u0005)\u0000\u0000\u00d7"+
		"\u00d8\u0005$\u0000\u0000\u00d8\u00d9\u0003&\u0013\u0000\u00d9\u00da\u0005"+
		"%\u0000\u0000\u00da\u00dc\u0001\u0000\u0000\u0000\u00db\u00d5\u0001\u0000"+
		"\u0000\u0000\u00db\u00d7\u0001\u0000\u0000\u0000\u00dc\u00df\u0001\u0000"+
		"\u0000\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000"+
		"\u0000\u0000\u00de\u0015\u0001\u0000\u0000\u0000\u00df\u00dd\u0001\u0000"+
		"\u0000\u0000\u00e0\u00e1\u0003&\u0013\u0000\u00e1\u0017\u0001\u0000\u0000"+
		"\u0000\u00e2\u00e4\u0005\t\u0000\u0000\u00e3\u00e5\u0003\u001a\r\u0000"+
		"\u00e4\u00e3\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000"+
		"\u00e5\u0019\u0001\u0000\u0000\u0000\u00e6\u00eb\u0003&\u0013\u0000\u00e7"+
		"\u00e8\u0005&\u0000\u0000\u00e8\u00ea\u0003&\u0013\u0000\u00e9\u00e7\u0001"+
		"\u0000\u0000\u0000\u00ea\u00ed\u0001\u0000\u0000\u0000\u00eb\u00e9\u0001"+
		"\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec\u00ef\u0001"+
		"\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ee\u00f0\u0005"+
		"&\u0000\u0000\u00ef\u00ee\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000"+
		"\u0000\u0000\u00f0\u001b\u0001\u0000\u0000\u0000\u00f1\u00f2\u0005\u0002"+
		"\u0000\u0000\u00f2\u00f3\u0003&\u0013\u0000\u00f3\u00f4\u0005\'\u0000"+
		"\u0000\u00f4\u00f8\u0003\u0010\b\u0000\u00f5\u00f7\u0003\u001e\u000f\u0000"+
		"\u00f6\u00f5\u0001\u0000\u0000\u0000\u00f7\u00fa\u0001\u0000\u0000\u0000"+
		"\u00f8\u00f6\u0001\u0000\u0000\u0000\u00f8\u00f9\u0001\u0000\u0000\u0000"+
		"\u00f9\u00fc\u0001\u0000\u0000\u0000\u00fa\u00f8\u0001\u0000\u0000\u0000"+
		"\u00fb\u00fd\u0003 \u0010\u0000\u00fc\u00fb\u0001\u0000\u0000\u0000\u00fc"+
		"\u00fd\u0001\u0000\u0000\u0000\u00fd\u001d\u0001\u0000\u0000\u0000\u00fe"+
		"\u00ff\u0005\u0004\u0000\u0000\u00ff\u0100\u0003&\u0013\u0000\u0100\u0101"+
		"\u0005\'\u0000\u0000\u0101\u0102\u0003\u0010\b\u0000\u0102\u001f\u0001"+
		"\u0000\u0000\u0000\u0103\u0104\u0005\u0003\u0000\u0000\u0104\u0105\u0005"+
		"\'\u0000\u0000\u0105\u0106\u0003\u0010\b\u0000\u0106!\u0001\u0000\u0000"+
		"\u0000\u0107\u0108\u0005\u0005\u0000\u0000\u0108\u0109\u0003&\u0013\u0000"+
		"\u0109\u010a\u0005\'\u0000\u0000\u010a\u010b\u0003\u0010\b\u0000\u010b"+
		"#\u0001\u0000\u0000\u0000\u010c\u010d\u0005\u0006\u0000\u0000\u010d\u010e"+
		"\u0005)\u0000\u0000\u010e\u010f\u0005\u0007\u0000\u0000\u010f\u0110\u0003"+
		"&\u0013\u0000\u0110\u0111\u0005\'\u0000\u0000\u0111\u0112\u0003\u0010"+
		"\b\u0000\u0112%\u0001\u0000\u0000\u0000\u0113\u0119\u0003(\u0014\u0000"+
		"\u0114\u0115\u0005\u0002\u0000\u0000\u0115\u0116\u0003(\u0014\u0000\u0116"+
		"\u0117\u0005\u0003\u0000\u0000\u0117\u0118\u0003&\u0013\u0000\u0118\u011a"+
		"\u0001\u0000\u0000\u0000\u0119\u0114\u0001\u0000\u0000\u0000\u0119\u011a"+
		"\u0001\u0000\u0000\u0000\u011a\'\u0001\u0000\u0000\u0000\u011b\u011d\u0005"+
		"\f\u0000\u0000\u011c\u011b\u0001\u0000\u0000\u0000\u011d\u0120\u0001\u0000"+
		"\u0000\u0000\u011e\u011c\u0001\u0000\u0000\u0000\u011e\u011f\u0001\u0000"+
		"\u0000\u0000\u011f\u0121\u0001\u0000\u0000\u0000\u0120\u011e\u0001\u0000"+
		"\u0000\u0000\u0121\u0126\u0003*\u0015\u0000\u0122\u0123\u0007\u0001\u0000"+
		"\u0000\u0123\u0125\u0003*\u0015\u0000\u0124\u0122\u0001\u0000\u0000\u0000"+
		"\u0125\u0128\u0001\u0000\u0000\u0000\u0126\u0124\u0001\u0000\u0000\u0000"+
		"\u0126\u0127\u0001\u0000\u0000\u0000\u0127)\u0001\u0000\u0000\u0000\u0128"+
		"\u0126\u0001\u0000\u0000\u0000\u0129\u012e\u0003,\u0016\u0000\u012a\u012b"+
		"\u0007\u0002\u0000\u0000\u012b\u012d\u0003,\u0016\u0000\u012c\u012a\u0001"+
		"\u0000\u0000\u0000\u012d\u0130\u0001\u0000\u0000\u0000\u012e\u012c\u0001"+
		"\u0000\u0000\u0000\u012e\u012f\u0001\u0000\u0000\u0000\u012f+\u0001\u0000"+
		"\u0000\u0000\u0130\u012e\u0001\u0000\u0000\u0000\u0131\u0136\u0003.\u0017"+
		"\u0000\u0132\u0133\u0007\u0003\u0000\u0000\u0133\u0135\u0003.\u0017\u0000"+
		"\u0134\u0132\u0001\u0000\u0000\u0000\u0135\u0138\u0001\u0000\u0000\u0000"+
		"\u0136\u0134\u0001\u0000\u0000\u0000\u0136\u0137\u0001\u0000\u0000\u0000"+
		"\u0137-\u0001\u0000\u0000\u0000\u0138\u0136\u0001\u0000\u0000\u0000\u0139"+
		"\u013e\u00030\u0018\u0000\u013a\u013b\u0007\u0004\u0000\u0000\u013b\u013d"+
		"\u00030\u0018\u0000\u013c\u013a\u0001\u0000\u0000\u0000\u013d\u0140\u0001"+
		"\u0000\u0000\u0000\u013e\u013c\u0001\u0000\u0000\u0000\u013e\u013f\u0001"+
		"\u0000\u0000\u0000\u013f/\u0001\u0000\u0000\u0000\u0140\u013e\u0001\u0000"+
		"\u0000\u0000\u0141\u0143\u0007\u0005\u0000\u0000\u0142\u0141\u0001\u0000"+
		"\u0000\u0000\u0142\u0143\u0001\u0000\u0000\u0000\u0143\u0144\u0001\u0000"+
		"\u0000\u0000\u0144\u0148\u0003:\u001d\u0000\u0145\u0147\u00032\u0019\u0000"+
		"\u0146\u0145\u0001\u0000\u0000\u0000\u0147\u014a\u0001\u0000\u0000\u0000"+
		"\u0148\u0146\u0001\u0000\u0000\u0000\u0148\u0149\u0001\u0000\u0000\u0000"+
		"\u01491\u0001\u0000\u0000\u0000\u014a\u0148\u0001\u0000\u0000\u0000\u014b"+
		"\u014d\u0005 \u0000\u0000\u014c\u014e\u00034\u001a\u0000\u014d\u014c\u0001"+
		"\u0000\u0000\u0000\u014d\u014e\u0001\u0000\u0000\u0000\u014e\u014f\u0001"+
		"\u0000\u0000\u0000\u014f\u0157\u0005!\u0000\u0000\u0150\u0151\u0005$\u0000"+
		"\u0000\u0151\u0152\u0003&\u0013\u0000\u0152\u0153\u0005%\u0000\u0000\u0153"+
		"\u0157\u0001\u0000\u0000\u0000\u0154\u0155\u0005(\u0000\u0000\u0155\u0157"+
		"\u0005)\u0000\u0000\u0156\u014b\u0001\u0000\u0000\u0000\u0156\u0150\u0001"+
		"\u0000\u0000\u0000\u0156\u0154\u0001\u0000\u0000\u0000\u01573\u0001\u0000"+
		"\u0000\u0000\u0158\u0163\u00038\u001c\u0000\u0159\u015d\u0005&\u0000\u0000"+
		"\u015a\u015c\u0007\u0006\u0000\u0000\u015b\u015a\u0001\u0000\u0000\u0000"+
		"\u015c\u015f\u0001\u0000\u0000\u0000\u015d\u015b\u0001\u0000\u0000\u0000"+
		"\u015d\u015e\u0001\u0000\u0000\u0000\u015e\u0160\u0001\u0000\u0000\u0000"+
		"\u015f\u015d\u0001\u0000\u0000\u0000\u0160\u0162\u00038\u001c\u0000\u0161"+
		"\u0159\u0001\u0000\u0000\u0000\u0162\u0165\u0001\u0000\u0000\u0000\u0163"+
		"\u0161\u0001\u0000\u0000\u0000\u0163\u0164\u0001\u0000\u0000\u0000\u0164"+
		"\u0167\u0001\u0000\u0000\u0000\u0165\u0163\u0001\u0000\u0000\u0000\u0166"+
		"\u0168\u0005&\u0000\u0000\u0167\u0166\u0001\u0000\u0000\u0000\u0167\u0168"+
		"\u0001\u0000\u0000\u0000\u01685\u0001\u0000\u0000\u0000\u0169\u016a\u0003"+
		"&\u0013\u0000\u016a\u016b\u0003B!\u0000\u016b\u017c\u0001\u0000\u0000"+
		"\u0000\u016c\u0175\u0003&\u0013\u0000\u016d\u016f\u0007\u0007\u0000\u0000"+
		"\u016e\u016d\u0001\u0000\u0000\u0000\u016f\u0170\u0001\u0000\u0000\u0000"+
		"\u0170\u016e\u0001\u0000\u0000\u0000\u0170\u0171\u0001\u0000\u0000\u0000"+
		"\u0171\u0172\u0001\u0000\u0000\u0000\u0172\u0174\u0003&\u0013\u0000\u0173"+
		"\u016e\u0001\u0000\u0000\u0000\u0174\u0177\u0001\u0000\u0000\u0000\u0175"+
		"\u0173\u0001\u0000\u0000\u0000\u0175\u0176\u0001\u0000\u0000\u0000\u0176"+
		"\u0179\u0001\u0000\u0000\u0000\u0177\u0175\u0001\u0000\u0000\u0000\u0178"+
		"\u017a\u0005&\u0000\u0000\u0179\u0178\u0001\u0000\u0000\u0000\u0179\u017a"+
		"\u0001\u0000\u0000\u0000\u017a\u017c\u0001\u0000\u0000\u0000\u017b\u0169"+
		"\u0001\u0000\u0000\u0000\u017b\u016c\u0001\u0000\u0000\u0000\u017c7\u0001"+
		"\u0000\u0000\u0000\u017d\u017e\u0005)\u0000\u0000\u017e\u0180\u0005\u0019"+
		"\u0000\u0000\u017f\u017d\u0001\u0000\u0000\u0000\u017f\u0180\u0001\u0000"+
		"\u0000\u0000\u0180\u0181\u0001\u0000\u0000\u0000\u0181\u0182\u0003&\u0013"+
		"\u0000\u01829\u0001\u0000\u0000\u0000\u0183\u0190\u0005)\u0000\u0000\u0184"+
		"\u0190\u0005*\u0000\u0000\u0185\u0190\u0005+\u0000\u0000\u0186\u0190\u0003"+
		"<\u001e\u0000\u0187\u0190\u0003>\u001f\u0000\u0188\u0189\u0005 \u0000"+
		"\u0000\u0189\u018a\u00036\u001b\u0000\u018a\u018b\u0005!\u0000\u0000\u018b"+
		"\u0190\u0001\u0000\u0000\u0000\u018c\u0190\u0005\r\u0000\u0000\u018d\u0190"+
		"\u0005\u000e\u0000\u0000\u018e\u0190\u0005\u000f\u0000\u0000\u018f\u0183"+
		"\u0001\u0000\u0000\u0000\u018f\u0184\u0001\u0000\u0000\u0000\u018f\u0185"+
		"\u0001\u0000\u0000\u0000\u018f\u0186\u0001\u0000\u0000\u0000\u018f\u0187"+
		"\u0001\u0000\u0000\u0000\u018f\u0188\u0001\u0000\u0000\u0000\u018f\u018c"+
		"\u0001\u0000\u0000\u0000\u018f\u018d\u0001\u0000\u0000\u0000\u018f\u018e"+
		"\u0001\u0000\u0000\u0000\u0190;\u0001\u0000\u0000\u0000\u0191\u0195\u0005"+
		"$\u0000\u0000\u0192\u0194\u0005.\u0000\u0000\u0193\u0192\u0001\u0000\u0000"+
		"\u0000\u0194\u0197\u0001\u0000\u0000\u0000\u0195\u0193\u0001\u0000\u0000"+
		"\u0000\u0195\u0196\u0001\u0000\u0000\u0000\u0196\u0199\u0001\u0000\u0000"+
		"\u0000\u0197\u0195\u0001\u0000\u0000\u0000\u0198\u019a\u00036\u001b\u0000"+
		"\u0199\u0198\u0001\u0000\u0000\u0000\u0199\u019a\u0001\u0000\u0000\u0000"+
		"\u019a\u019e\u0001\u0000\u0000\u0000\u019b\u019d\u0005.\u0000\u0000\u019c"+
		"\u019b\u0001\u0000\u0000\u0000\u019d\u01a0\u0001\u0000\u0000\u0000\u019e"+
		"\u019c\u0001\u0000\u0000\u0000\u019e\u019f\u0001\u0000\u0000\u0000\u019f"+
		"\u01a1\u0001\u0000\u0000\u0000\u01a0\u019e\u0001\u0000\u0000\u0000\u01a1"+
		"\u01a2\u0005%\u0000\u0000\u01a2=\u0001\u0000\u0000\u0000\u01a3\u01a7\u0005"+
		"\"\u0000\u0000\u01a4\u01a6\u0005.\u0000\u0000\u01a5\u01a4\u0001\u0000"+
		"\u0000\u0000\u01a6\u01a9\u0001\u0000\u0000\u0000\u01a7\u01a5\u0001\u0000"+
		"\u0000\u0000\u01a7\u01a8\u0001\u0000\u0000\u0000\u01a8\u01b8\u0001\u0000"+
		"\u0000\u0000\u01a9\u01a7\u0001\u0000\u0000\u0000\u01aa\u01b5\u0003@ \u0000"+
		"\u01ab\u01af\u0005&\u0000\u0000\u01ac\u01ae\u0005.\u0000\u0000\u01ad\u01ac"+
		"\u0001\u0000\u0000\u0000\u01ae\u01b1\u0001\u0000\u0000\u0000\u01af\u01ad"+
		"\u0001\u0000\u0000\u0000\u01af\u01b0\u0001\u0000\u0000\u0000\u01b0\u01b2"+
		"\u0001\u0000\u0000\u0000\u01b1\u01af\u0001\u0000\u0000\u0000\u01b2\u01b4"+
		"\u0003@ \u0000\u01b3\u01ab\u0001\u0000\u0000\u0000\u01b4\u01b7\u0001\u0000"+
		"\u0000\u0000\u01b5\u01b3\u0001\u0000\u0000\u0000\u01b5\u01b6\u0001\u0000"+
		"\u0000\u0000\u01b6\u01b9\u0001\u0000\u0000\u0000\u01b7\u01b5\u0001\u0000"+
		"\u0000\u0000\u01b8\u01aa\u0001\u0000\u0000\u0000\u01b8\u01b9\u0001\u0000"+
		"\u0000\u0000\u01b9\u01bb\u0001\u0000\u0000\u0000\u01ba\u01bc\u0005&\u0000"+
		"\u0000\u01bb\u01ba\u0001\u0000\u0000\u0000\u01bb\u01bc\u0001\u0000\u0000"+
		"\u0000\u01bc\u01c0\u0001\u0000\u0000\u0000\u01bd\u01bf\u0005.\u0000\u0000"+
		"\u01be\u01bd\u0001\u0000\u0000\u0000\u01bf\u01c2\u0001\u0000\u0000\u0000"+
		"\u01c0\u01be\u0001\u0000\u0000\u0000\u01c0\u01c1\u0001\u0000\u0000\u0000"+
		"\u01c1\u01c3\u0001\u0000\u0000\u0000\u01c2\u01c0\u0001\u0000\u0000\u0000"+
		"\u01c3\u01c4\u0005#\u0000\u0000\u01c4?\u0001\u0000\u0000\u0000\u01c5\u01c6"+
		"\u0003&\u0013\u0000\u01c6\u01c7\u0005\'\u0000\u0000\u01c7\u01c8\u0003"+
		"&\u0013\u0000\u01c8A\u0001\u0000\u0000\u0000\u01c9\u01ca\u0005\u0006\u0000"+
		"\u0000\u01ca\u01cb\u0003\u0014\n\u0000\u01cb\u01cc\u0005\u0007\u0000\u0000"+
		"\u01cc\u01ce\u0003&\u0013\u0000\u01cd\u01cf\u0003D\"\u0000\u01ce\u01cd"+
		"\u0001\u0000\u0000\u0000\u01ce\u01cf\u0001\u0000\u0000\u0000\u01cfC\u0001"+
		"\u0000\u0000\u0000\u01d0\u01d7\u0003B!\u0000\u01d1\u01d2\u0005\u0002\u0000"+
		"\u0000\u01d2\u01d4\u0003&\u0013\u0000\u01d3\u01d5\u0003D\"\u0000\u01d4"+
		"\u01d3\u0001\u0000\u0000\u0000\u01d4\u01d5\u0001\u0000\u0000\u0000\u01d5"+
		"\u01d7\u0001\u0000\u0000\u0000\u01d6\u01d0\u0001\u0000\u0000\u0000\u01d6"+
		"\u01d1\u0001\u0000\u0000\u0000\u01d7E\u0001\u0000\u0000\u0000\u01d8\u01d9"+
		"\u0005\u0016\u0000\u0000\u01d9\u01da\u0003&\u0013\u0000\u01daG\u0001\u0000"+
		"\u0000\u0000\u01db\u01de\u0003&\u0013\u0000\u01dc\u01de\u0003F#\u0000"+
		"\u01dd\u01db\u0001\u0000\u0000\u0000\u01dd\u01dc\u0001\u0000\u0000\u0000"+
		"\u01de\u01e6\u0001\u0000\u0000\u0000\u01df\u01e2\u0005&\u0000\u0000\u01e0"+
		"\u01e3\u0003&\u0013\u0000\u01e1\u01e3\u0003F#\u0000\u01e2\u01e0\u0001"+
		"\u0000\u0000\u0000\u01e2\u01e1\u0001\u0000\u0000\u0000\u01e3\u01e5\u0001"+
		"\u0000\u0000\u0000\u01e4\u01df\u0001\u0000\u0000\u0000\u01e5\u01e8\u0001"+
		"\u0000\u0000\u0000\u01e6\u01e4\u0001\u0000\u0000\u0000\u01e6\u01e7\u0001"+
		"\u0000\u0000\u0000\u01e7I\u0001\u0000\u0000\u0000\u01e8\u01e6\u0001\u0000"+
		"\u0000\u0000ALNZ\\ciqv~\u0087\u008b\u008d\u0092\u0098\u009f\u00ab\u00b0"+
		"\u00b3\u00b8\u00c0\u00c5\u00c9\u00cb\u00ce\u00db\u00dd\u00e4\u00eb\u00ef"+
		"\u00f8\u00fc\u0119\u011e\u0126\u012e\u0136\u013e\u0142\u0148\u014d\u0156"+
		"\u015d\u0163\u0167\u0170\u0175\u0179\u017b\u017f\u018f\u0195\u0199\u019e"+
		"\u01a7\u01af\u01b5\u01b8\u01bb\u01c0\u01ce\u01d4\u01d6\u01dd\u01e2\u01e6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}