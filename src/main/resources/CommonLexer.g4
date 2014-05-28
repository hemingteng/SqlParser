/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
lexer grammar CommonLexer;

WHITE_SPACE : ' '; //空格
TAB : '\t'; //tab
NEWLINE : '\r'? '\n';//换行符

//正负号
SIGN : PLUS_SIGN | MINUS_SIGN;
PLUS_SIGN : '+';
MINUS_SIGN : '-';

//单字符定义
DOUBLE_QUOTE : '"';
PERCENT : '%';
AMPERSAND : '&';
QUOTE : '\'';
fragment QUOTE2 : '\'';
LEFT_PAREN : '(';
RIGHT_PAREN : ')';
ASTERISK : '*';
COMMA : ',';
PERIOD : '.';
SOLIDUS : '/';
COLON : ':';
SEMICOLON : ';';
LESS_THAN : '<';
LESS_THAN_OR_EQ : '<=';
EQ : '=';
NOT_EQ : '<>'|'!=';
GREATER_THAN : '>';
GREATER_THAN_OR_EQ : '>=';
QUESTION_MARK : '?';
UNDERSCORE : '_';
VERTICAL_BAR : '|';
LEFT_BRACKET : '[';
RIGHT_BRACKET : ']';

fragment
    ZERO : '0'; //零
fragment
    DIGIT : [0-9]; //数字
fragment
    ALPHA : [a-zA-Z]; //英文字母
fragment
    IDENTIFIER_BEGINNING_LETTER : [a-zA-Z_]; //标识符开始字母
fragment
    //宽松的标识符开始字母，英文字母、下划线、变音字符、非拉丁字母
    IDENTIFIER_BEGINNING_LETTER_LOOSE : [a-zA-Z_\u0080...\uFFFE];
fragment
    IDENTIFIER_FOLLOW_BEGIN_LETTER : [a-zA-Z_\u0080...\uFFFE0-9$];
fragment
    HEX : [0-9a-fA-F]; //十六进制
fragment
    UNICODE : 'uU' HEX HEX HEX HEX; //unicode
fragment
    BIT : [01]; //二进制
fragment
    SEXAGESIMAL : [0-5] [0-9]|[0-9]|'60'; //六十进制
fragment
    DECIMAL : PERIOD DIGIT+; //小数部分
//无符号整数
fragment
    UNSIGNED_INTEGER : ZERO | [1-9] DIGIT*;
//精确数(有理数)
fragment
    EXACT_NUMERIC_LITERAL : UNSIGNED_INTEGER DECIMAL? | DECIMAL;
//近似数,科学计数法表示
fragment
    APPROXIMATE_NUMERIC_LITERAL : MANTISSA [Ee] EXPONENT;
fragment
    EXPONENT : SIGN? UNSIGNED_INTEGER; //指数
fragment
    MANTISSA : EXACT_NUMERIC_LITERAL; //尾数
fragment
    TIME_ZONE_INTERVAL : SIGN HOURS_VALUE COLON MINUTES_VALUE;//+10:59 -10:59
fragment
    YEAR_MONTH_LITERAL : YEARS_VALUE | (YEARS_VALUE MINUS_SIGN)? MONTHS_VALUE;//2012 or 12 or 2012-12
fragment
    DAY_TIME_LITERAL : DAY_TIME_INTERVAL|TIME_INTERVAL;
fragment
    DAY_TIME_INTERVAL : DAYS_VALUE (WHITE_SPACE HOURS_VALUE (COLON MINUTES_VALUE (COLON SECONDS_VALUE)?)?)?;//31 12:59:59
fragment
    TIME_INTERVAL : HOURS_VALUE (COLON MINUTES_VALUE (COLON SECONDS_VALUE)?)? | MINUTES_VALUE (COLON SECONDS_VALUE)? | SECONDS_VALUE;//12:59:59
//日期
fragment
	YEARS_VALUE : [1-9] [0-9]*; //2012
fragment
	MONTHS_VALUE : ('0'? [1-9])|'1' [0-2]; //09，9
fragment
	DAYS_VALUE : ('0'? [1-9])|[1-2] [0-9]|'3' [0-1]; //31，03
//时间
fragment
	HOURS_VALUE : '0'? [0-9]|'1' [0-9]|'2' [0-4];
fragment
	MINUTES_VALUE : SEXAGESIMAL;
fragment
	SECONDS_VALUE : SECONDS_INTEGER_VALUE (PERIOD SECONDS_FRACTION)?;
fragment
	SECONDS_INTEGER_VALUE : SEXAGESIMAL;
fragment
	SECONDS_FRACTION : DIGIT DIGIT DIGIT;

//有符号数
SIGNED_NUMERIC_LITERAL : SIGN (EXACT_NUMERIC_LITERAL | APPROXIMATE_NUMERIC_LITERAL);
//无符号数
UNSIGNED_NUMERIC_LITERAL : EXACT_NUMERIC_LITERAL | APPROXIMATE_NUMERIC_LITERAL;
TIMESTAMP_STRING : QUOTE DATE_VALUE WHITE_SPACE TIME_VALUE TIME_ZONE_INTERVAL? QUOTE;

DATE_STRING : QUOTE DATE_VALUE QUOTE; //'2014-01-01'
DATE_VALUE : YEARS_VALUE MINUS_SIGN MONTHS_VALUE MINUS_SIGN DAYS_VALUE;//2014-1-2 2014-01-02 2014-12-31

TIME_STRING : QUOTE TIME_VALUE QUOTE; //'12:00:00'
TIME_VALUE : HOURS_VALUE COLON MINUTES_VALUE COLON SECONDS_VALUE; //10:59:59

INTERVAL_STRING : QUOTE (YEAR_MONTH_LITERAL|DAY_TIME_LITERAL) QUOTE;//'2012-12'
//标识符
IDENTIFIER : IDENTIFIER_BEGINNING_LETTER_LOOSE IDENTIFIER_FOLLOW_BEGIN_LETTER*;