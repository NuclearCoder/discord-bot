package nukescript.token

import java.util.*

enum class Token {
    AND, ARRAY, ASTERISK, BECOMES, BEGIN, COLON,
    COMMA, CONST, DIV, DO, DOUBLE_DOT, ELSE, END,
    END_TEXT, EQUAL, GREATER, IF, LEFT_BRACKET,
    LEFT_PARENTHESIS, LESS, MINUS, MOD, NAME,
    NEW_LINE, NOT, NOT_EQUAL, NOT_GREATER, NOT_LESS,
    NUMERAL, OF, OR, PERIOD, PLUS, PROCEDURE,
    PROGRAM, RECORD, RIGHT_BRACKET, RIGHT_PARENTHESIS,
    SEMICOLON, THEN, TYPE, VAR, WHILE, UNKNOWN
}

inline fun Queue<Int>.removeToken(): Token = Token.values()[remove()]
