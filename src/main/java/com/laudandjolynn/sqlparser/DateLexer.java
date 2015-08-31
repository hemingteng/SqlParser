// Generated from D:/Work/Code/Intelij IDEA/SqlParser/src/main/resources\DateLexer.g4 by ANTLR 4.x
package com.laudandjolynn.sqlparser;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DateLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DATE_STRING=1, DATE_VALUE=2, TIME_STRING=3, TIME_VALUE=4, TIMESTAMP_STRING=5, 
		INTERVAL_STRING=6, TIME_ZONE_INTERVAL=7, YEAR_MONTH_LITERAL=8, DAY_TIME_LITERAL=9, 
		DAY_TIME_INTERVAL=10, TIME_INTERVAL=11, SPACE=12, TAB=13, NEWLINE=14, 
		SIGN=15, PLUS_SIGN=16, MINUS_SIGN=17, DOUBLE_QUOTE=18, PERCENT=19, AMPERSAND=20, 
		QUOTE=21, LEFT_PAREN=22, RIGHT_PAREN=23, ASTERISK=24, COMMA=25, PERIOD=26, 
		SOLIDUS=27, COLON=28, SEMICOLON=29, LESS_THAN=30, LESS_THAN_OR_EQ=31, 
		EQ=32, NOT_EQ=33, GREATER_THAN=34, GREATER_THAN_OR_EQ=35, QUESTION_MARK=36, 
		UNDERSCORE=37, VERTICAL_BAR=38, LEFT_BRACKET=39, RIGHT_BRACKET=40, SIGNED_NUMERIC_LITERAL=41, 
		UNSIGNED_NUMERIC_LITERAL=42, IDENTIFIER=43;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'", "'&'", "'''", 
		"'('", "')'", "'*'", "'+'"
	};
	public static final String[] ruleNames = {
		"YEARS_VALUE", "MONTHS_VALUE", "DAYS_VALUE", "HOURS_VALUE", "MINUTES_VALUE", 
		"SECONDS_VALUE", "SECONDS_INTEGER_VALUE", "SECONDS_FRACTION", "DATE_STRING", 
		"DATE_VALUE", "TIME_STRING", "TIME_VALUE", "TIMESTAMP_STRING", "INTERVAL_STRING", 
		"TIME_ZONE_INTERVAL", "YEAR_MONTH_LITERAL", "DAY_TIME_LITERAL", "DAY_TIME_INTERVAL", 
		"TIME_INTERVAL", "SPACE", "TAB", "NEWLINE", "SIGN", "PLUS_SIGN", "MINUS_SIGN", 
		"DOUBLE_QUOTE", "PERCENT", "AMPERSAND", "QUOTE", "LEFT_PAREN", "RIGHT_PAREN", 
		"ASTERISK", "COMMA", "PERIOD", "SOLIDUS", "COLON", "SEMICOLON", "LESS_THAN", 
		"LESS_THAN_OR_EQ", "EQ", "NOT_EQ", "GREATER_THAN", "GREATER_THAN_OR_EQ", 
		"QUESTION_MARK", "UNDERSCORE", "VERTICAL_BAR", "LEFT_BRACKET", "RIGHT_BRACKET", 
		"ZERO", "DIGIT", "ALPHA", "IDENTIFIER_BEGINNING_LETTER", "IDENTIFIER_BEGINNING_LETTER_LOOSE", 
		"IDENTIFIER_FOLLOW_BEGIN_LETTER", "HEX", "UNICODE", "BIT", "SEXAGESIMAL", 
		"DECIMAL", "UNSIGNED_INTEGER", "EXACT_NUMERIC_LITERAL", "APPROXIMATE_NUMERIC_LITERAL", 
		"EXPONENT", "MANTISSA", "SIGNED_NUMERIC_LITERAL", "UNSIGNED_NUMERIC_LITERAL", 
		"IDENTIFIER"
	};


	public DateLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DateLexer.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2-\u01a7\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\3\2\3\2\7\2\u008c\n\2\f\2\16"+
		"\2\u008f\13\2\3\3\5\3\u0092\n\3\3\3\3\3\3\3\5\3\u0097\n\3\3\4\5\4\u009a"+
		"\n\4\3\4\3\4\3\4\3\4\3\4\5\4\u00a1\n\4\3\5\5\5\u00a4\n\5\3\5\3\5\3\5\3"+
		"\5\3\5\5\5\u00ab\n\5\3\6\3\6\3\7\3\7\3\7\3\7\5\7\u00b3\n\7\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\5\16\u00d4\n\16"+
		"\3\16\3\16\3\17\3\17\3\17\5\17\u00db\n\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\5\21\u00e8\n\21\3\21\5\21\u00eb\n\21\3\22\3"+
		"\22\5\22\u00ef\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00f9"+
		"\n\23\5\23\u00fb\n\23\5\23\u00fd\n\23\3\24\3\24\3\24\3\24\3\24\3\24\5"+
		"\24\u0105\n\24\5\24\u0107\n\24\3\24\3\24\3\24\3\24\5\24\u010d\n\24\3\24"+
		"\5\24\u0110\n\24\3\25\3\25\3\26\3\26\3\27\5\27\u0117\n\27\3\27\3\27\3"+
		"\30\3\30\5\30\u011d\n\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35"+
		"\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&"+
		"\3\'\3\'\3(\3(\3(\3)\3)\3*\3*\3*\3*\5*\u0146\n*\3+\3+\3,\3,\3,\3-\3-\3"+
		".\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65"+
		"\3\66\3\66\3\67\3\67\38\38\39\39\39\39\39\39\39\39\3:\3:\3;\3;\3;\3;\3"+
		";\5;\u0174\n;\3<\3<\6<\u0178\n<\r<\16<\u0179\3=\3=\3=\7=\u017f\n=\f=\16"+
		"=\u0182\13=\5=\u0184\n=\3>\3>\5>\u0188\n>\3>\5>\u018b\n>\3?\3?\3?\3?\3"+
		"@\5@\u0192\n@\3@\3@\3A\3A\3B\3B\3B\5B\u019b\nB\3C\3C\5C\u019f\nC\3D\3"+
		"D\7D\u01a3\nD\fD\16D\u01a6\13D\2\2E\3\2\5\2\7\2\t\2\13\2\r\2\17\2\21\2"+
		"\23\3\25\4\27\5\31\6\33\7\35\b\37\t!\n#\13%\f\'\r)\16+\17-\20/\21\61\22"+
		"\63\23\65\24\67\259\26;\27=\30?\31A\32C\33E\34G\35I\36K\37M O!Q\"S#U$"+
		"W%Y&[\'](_)a*c\2e\2g\2i\2k\2m\2o\2q\2s\2u\2w\2y\2{\2}\2\177\2\u0081\2"+
		"\u0083+\u0085,\u0087-\3\2\17\3\2\63;\3\2\62;\3\2\62\64\3\2\63\64\3\2\62"+
		"\63\3\2\62\66\4\2C\\c|\5\2C\\aac|\b\2\60\60C\\aac|\u0082\u0082\0\0\n\2"+
		"&&\60\60\62;C\\aac|\u0082\u0082\0\0\5\2\62;CHch\3\2\62\67\4\2GGgg\u01b3"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2"+
		"A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3"+
		"\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2"+
		"\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2\u0083\3\2\2\2\2\u0085"+
		"\3\2\2\2\2\u0087\3\2\2\2\3\u0089\3\2\2\2\5\u0096\3\2\2\2\7\u00a0\3\2\2"+
		"\2\t\u00aa\3\2\2\2\13\u00ac\3\2\2\2\r\u00ae\3\2\2\2\17\u00b4\3\2\2\2\21"+
		"\u00b6\3\2\2\2\23\u00ba\3\2\2\2\25\u00be\3\2\2\2\27\u00c4\3\2\2\2\31\u00c8"+
		"\3\2\2\2\33\u00ce\3\2\2\2\35\u00d7\3\2\2\2\37\u00de\3\2\2\2!\u00ea\3\2"+
		"\2\2#\u00ee\3\2\2\2%\u00f0\3\2\2\2\'\u010f\3\2\2\2)\u0111\3\2\2\2+\u0113"+
		"\3\2\2\2-\u0116\3\2\2\2/\u011c\3\2\2\2\61\u011e\3\2\2\2\63\u0120\3\2\2"+
		"\2\65\u0122\3\2\2\2\67\u0124\3\2\2\29\u0126\3\2\2\2;\u0128\3\2\2\2=\u012a"+
		"\3\2\2\2?\u012c\3\2\2\2A\u012e\3\2\2\2C\u0130\3\2\2\2E\u0132\3\2\2\2G"+
		"\u0134\3\2\2\2I\u0136\3\2\2\2K\u0138\3\2\2\2M\u013a\3\2\2\2O\u013c\3\2"+
		"\2\2Q\u013f\3\2\2\2S\u0145\3\2\2\2U\u0147\3\2\2\2W\u0149\3\2\2\2Y\u014c"+
		"\3\2\2\2[\u014e\3\2\2\2]\u0150\3\2\2\2_\u0152\3\2\2\2a\u0154\3\2\2\2c"+
		"\u0156\3\2\2\2e\u0158\3\2\2\2g\u015a\3\2\2\2i\u015c\3\2\2\2k\u015e\3\2"+
		"\2\2m\u0160\3\2\2\2o\u0162\3\2\2\2q\u0164\3\2\2\2s\u016c\3\2\2\2u\u0173"+
		"\3\2\2\2w\u0175\3\2\2\2y\u0183\3\2\2\2{\u018a\3\2\2\2}\u018c\3\2\2\2\177"+
		"\u0191\3\2\2\2\u0081\u0195\3\2\2\2\u0083\u0197\3\2\2\2\u0085\u019e\3\2"+
		"\2\2\u0087\u01a0\3\2\2\2\u0089\u008d\t\2\2\2\u008a\u008c\t\3\2\2\u008b"+
		"\u008a\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2"+
		"\2\2\u008e\4\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0092\7\62\2\2\u0091\u0090"+
		"\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0097\t\2\2\2\u0094"+
		"\u0095\7\63\2\2\u0095\u0097\t\4\2\2\u0096\u0091\3\2\2\2\u0096\u0094\3"+
		"\2\2\2\u0097\6\3\2\2\2\u0098\u009a\7\62\2\2\u0099\u0098\3\2\2\2\u0099"+
		"\u009a\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u00a1\t\2\2\2\u009c\u009d\t\5"+
		"\2\2\u009d\u00a1\t\3\2\2\u009e\u009f\7\65\2\2\u009f\u00a1\t\6\2\2\u00a0"+
		"\u0099\3\2\2\2\u00a0\u009c\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\b\3\2\2\2"+
		"\u00a2\u00a4\7\62\2\2\u00a3\u00a2\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5"+
		"\3\2\2\2\u00a5\u00ab\t\3\2\2\u00a6\u00a7\7\63\2\2\u00a7\u00ab\t\3\2\2"+
		"\u00a8\u00a9\7\64\2\2\u00a9\u00ab\t\7\2\2\u00aa\u00a3\3\2\2\2\u00aa\u00a6"+
		"\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\n\3\2\2\2\u00ac\u00ad\5u;\2\u00ad\f"+
		"\3\2\2\2\u00ae\u00b2\5\17\b\2\u00af\u00b0\5E#\2\u00b0\u00b1\5\21\t\2\u00b1"+
		"\u00b3\3\2\2\2\u00b2\u00af\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\16\3\2\2"+
		"\2\u00b4\u00b5\5u;\2\u00b5\20\3\2\2\2\u00b6\u00b7\5e\63\2\u00b7\u00b8"+
		"\5e\63\2\u00b8\u00b9\5e\63\2\u00b9\22\3\2\2\2\u00ba\u00bb\5;\36\2\u00bb"+
		"\u00bc\5\25\13\2\u00bc\u00bd\5;\36\2\u00bd\24\3\2\2\2\u00be\u00bf\5\3"+
		"\2\2\u00bf\u00c0\5\63\32\2\u00c0\u00c1\5\5\3\2\u00c1\u00c2\5\63\32\2\u00c2"+
		"\u00c3\5\7\4\2\u00c3\26\3\2\2\2\u00c4\u00c5\5;\36\2\u00c5\u00c6\5\31\r"+
		"\2\u00c6\u00c7\5;\36\2\u00c7\30\3\2\2\2\u00c8\u00c9\5\t\5\2\u00c9\u00ca"+
		"\5I%\2\u00ca\u00cb\5\13\6\2\u00cb\u00cc\5I%\2\u00cc\u00cd\5\r\7\2\u00cd"+
		"\32\3\2\2\2\u00ce\u00cf\5;\36\2\u00cf\u00d0\5\25\13\2\u00d0\u00d1\5)\25"+
		"\2\u00d1\u00d3\5\31\r\2\u00d2\u00d4\5\37\20\2\u00d3\u00d2\3\2\2\2\u00d3"+
		"\u00d4\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\5;\36\2\u00d6\34\3\2\2"+
		"\2\u00d7\u00da\5;\36\2\u00d8\u00db\5!\21\2\u00d9\u00db\5#\22\2\u00da\u00d8"+
		"\3\2\2\2\u00da\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\5;\36\2\u00dd"+
		"\36\3\2\2\2\u00de\u00df\5/\30\2\u00df\u00e0\5\t\5\2\u00e0\u00e1\5I%\2"+
		"\u00e1\u00e2\5\13\6\2\u00e2 \3\2\2\2\u00e3\u00eb\5\3\2\2\u00e4\u00e5\5"+
		"\3\2\2\u00e5\u00e6\5\63\32\2\u00e6\u00e8\3\2\2\2\u00e7\u00e4\3\2\2\2\u00e7"+
		"\u00e8\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00eb\5\5\3\2\u00ea\u00e3\3\2"+
		"\2\2\u00ea\u00e7\3\2\2\2\u00eb\"\3\2\2\2\u00ec\u00ef\5%\23\2\u00ed\u00ef"+
		"\5\'\24\2\u00ee\u00ec\3\2\2\2\u00ee\u00ed\3\2\2\2\u00ef$\3\2\2\2\u00f0"+
		"\u00fc\5\7\4\2\u00f1\u00f2\5)\25\2\u00f2\u00fa\5\t\5\2\u00f3\u00f4\5I"+
		"%\2\u00f4\u00f8\5\13\6\2\u00f5\u00f6\5I%\2\u00f6\u00f7\5\r\7\2\u00f7\u00f9"+
		"\3\2\2\2\u00f8\u00f5\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fb\3\2\2\2\u00fa"+
		"\u00f3\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00f1\3\2"+
		"\2\2\u00fc\u00fd\3\2\2\2\u00fd&\3\2\2\2\u00fe\u0106\5\t\5\2\u00ff\u0100"+
		"\5I%\2\u0100\u0104\5\13\6\2\u0101\u0102\5I%\2\u0102\u0103\5\r\7\2\u0103"+
		"\u0105\3\2\2\2\u0104\u0101\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0107\3\2"+
		"\2\2\u0106\u00ff\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0110\3\2\2\2\u0108"+
		"\u010c\5\13\6\2\u0109\u010a\5I%\2\u010a\u010b\5\r\7\2\u010b\u010d\3\2"+
		"\2\2\u010c\u0109\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u0110\3\2\2\2\u010e"+
		"\u0110\5\r\7\2\u010f\u00fe\3\2\2\2\u010f\u0108\3\2\2\2\u010f\u010e\3\2"+
		"\2\2\u0110(\3\2\2\2\u0111\u0112\7\"\2\2\u0112*\3\2\2\2\u0113\u0114\7\13"+
		"\2\2\u0114,\3\2\2\2\u0115\u0117\7\17\2\2\u0116\u0115\3\2\2\2\u0116\u0117"+
		"\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\7\f\2\2\u0119.\3\2\2\2\u011a"+
		"\u011d\5\61\31\2\u011b\u011d\5\63\32\2\u011c\u011a\3\2\2\2\u011c\u011b"+
		"\3\2\2\2\u011d\60\3\2\2\2\u011e\u011f\7-\2\2\u011f\62\3\2\2\2\u0120\u0121"+
		"\7/\2\2\u0121\64\3\2\2\2\u0122\u0123\7$\2\2\u0123\66\3\2\2\2\u0124\u0125"+
		"\7\'\2\2\u01258\3\2\2\2\u0126\u0127\7(\2\2\u0127:\3\2\2\2\u0128\u0129"+
		"\7)\2\2\u0129<\3\2\2\2\u012a\u012b\7*\2\2\u012b>\3\2\2\2\u012c\u012d\7"+
		"+\2\2\u012d@\3\2\2\2\u012e\u012f\7,\2\2\u012fB\3\2\2\2\u0130\u0131\7."+
		"\2\2\u0131D\3\2\2\2\u0132\u0133\7\60\2\2\u0133F\3\2\2\2\u0134\u0135\7"+
		"\61\2\2\u0135H\3\2\2\2\u0136\u0137\7<\2\2\u0137J\3\2\2\2\u0138\u0139\7"+
		"=\2\2\u0139L\3\2\2\2\u013a\u013b\7>\2\2\u013bN\3\2\2\2\u013c\u013d\7>"+
		"\2\2\u013d\u013e\7?\2\2\u013eP\3\2\2\2\u013f\u0140\7?\2\2\u0140R\3\2\2"+
		"\2\u0141\u0142\7>\2\2\u0142\u0146\7@\2\2\u0143\u0144\7#\2\2\u0144\u0146"+
		"\7?\2\2\u0145\u0141\3\2\2\2\u0145\u0143\3\2\2\2\u0146T\3\2\2\2\u0147\u0148"+
		"\7@\2\2\u0148V\3\2\2\2\u0149\u014a\7@\2\2\u014a\u014b\7?\2\2\u014bX\3"+
		"\2\2\2\u014c\u014d\7A\2\2\u014dZ\3\2\2\2\u014e\u014f\7a\2\2\u014f\\\3"+
		"\2\2\2\u0150\u0151\7~\2\2\u0151^\3\2\2\2\u0152\u0153\7]\2\2\u0153`\3\2"+
		"\2\2\u0154\u0155\7_\2\2\u0155b\3\2\2\2\u0156\u0157\7\62\2\2\u0157d\3\2"+
		"\2\2\u0158\u0159\t\3\2\2\u0159f\3\2\2\2\u015a\u015b\t\b\2\2\u015bh\3\2"+
		"\2\2\u015c\u015d\t\t\2\2\u015dj\3\2\2\2\u015e\u015f\t\n\2\2\u015fl\3\2"+
		"\2\2\u0160\u0161\t\13\2\2\u0161n\3\2\2\2\u0162\u0163\t\f\2\2\u0163p\3"+
		"\2\2\2\u0164\u0165\7w\2\2\u0165\u0166\7W\2\2\u0166\u0167\3\2\2\2\u0167"+
		"\u0168\5o8\2\u0168\u0169\5o8\2\u0169\u016a\5o8\2\u016a\u016b\5o8\2\u016b"+
		"r\3\2\2\2\u016c\u016d\t\6\2\2\u016dt\3\2\2\2\u016e\u016f\t\r\2\2\u016f"+
		"\u0174\t\3\2\2\u0170\u0174\t\3\2\2\u0171\u0172\78\2\2\u0172\u0174\7\62"+
		"\2\2\u0173\u016e\3\2\2\2\u0173\u0170\3\2\2\2\u0173\u0171\3\2\2\2\u0174"+
		"v\3\2\2\2\u0175\u0177\5E#\2\u0176\u0178\5e\63\2\u0177\u0176\3\2\2\2\u0178"+
		"\u0179\3\2\2\2\u0179\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017ax\3\2\2\2"+
		"\u017b\u0184\5c\62\2\u017c\u0180\t\2\2\2\u017d\u017f\5e\63\2\u017e\u017d"+
		"\3\2\2\2\u017f\u0182\3\2\2\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181"+
		"\u0184\3\2\2\2\u0182\u0180\3\2\2\2\u0183\u017b\3\2\2\2\u0183\u017c\3\2"+
		"\2\2\u0184z\3\2\2\2\u0185\u0187\5y=\2\u0186\u0188\5w<\2\u0187\u0186\3"+
		"\2\2\2\u0187\u0188\3\2\2\2\u0188\u018b\3\2\2\2\u0189\u018b\5w<\2\u018a"+
		"\u0185\3\2\2\2\u018a\u0189\3\2\2\2\u018b|\3\2\2\2\u018c\u018d\5\u0081"+
		"A\2\u018d\u018e\t\16\2\2\u018e\u018f\5\177@\2\u018f~\3\2\2\2\u0190\u0192"+
		"\5/\30\2\u0191\u0190\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0193\3\2\2\2\u0193"+
		"\u0194\5y=\2\u0194\u0080\3\2\2\2\u0195\u0196\5{>\2\u0196\u0082\3\2\2\2"+
		"\u0197\u019a\5/\30\2\u0198\u019b\5{>\2\u0199\u019b\5}?\2\u019a\u0198\3"+
		"\2\2\2\u019a\u0199\3\2\2\2\u019b\u0084\3\2\2\2\u019c\u019f\5{>\2\u019d"+
		"\u019f\5}?\2\u019e\u019c\3\2\2\2\u019e\u019d\3\2\2\2\u019f\u0086\3\2\2"+
		"\2\u01a0\u01a4\5k\66\2\u01a1\u01a3\5m\67\2\u01a2\u01a1\3\2\2\2\u01a3\u01a6"+
		"\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u0088\3\2\2\2\u01a6"+
		"\u01a4\3\2\2\2$\2\u008d\u0091\u0096\u0099\u00a0\u00a3\u00aa\u00b2\u00d3"+
		"\u00da\u00e7\u00ea\u00ee\u00f8\u00fa\u00fc\u0104\u0106\u010c\u010f\u0116"+
		"\u011c\u0145\u0173\u0179\u0180\u0183\u0187\u018a\u0191\u019a\u019e\u01a4"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}