// $ANTLR null /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g 2019-04-23 02:15:24

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ExprLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__54=54;
	public static final int T__55=55;
	public static final int T__56=56;
	public static final int T__57=57;
	public static final int T__58=58;
	public static final int T__59=59;
	public static final int T__60=60;
	public static final int T__61=61;
	public static final int T__62=62;
	public static final int T__63=63;
	public static final int T__64=64;
	public static final int T__65=65;
	public static final int T__66=66;
	public static final int T__67=67;
	public static final int T__68=68;
	public static final int T__69=69;
	public static final int T__70=70;
	public static final int T__71=71;
	public static final int T__72=72;
	public static final int T__73=73;
	public static final int T__74=74;
	public static final int T__75=75;
	public static final int T__76=76;
	public static final int T__77=77;
	public static final int T__78=78;
	public static final int T__79=79;
	public static final int T__80=80;
	public static final int T__81=81;
	public static final int T__82=82;
	public static final int T__83=83;
	public static final int T__84=84;
	public static final int T__85=85;
	public static final int T__86=86;
	public static final int AFFECT=4;
	public static final int AFFECTATT=5;
	public static final int ARG=6;
	public static final int ARGDEC=7;
	public static final int ARRAY=8;
	public static final int ATTRIBUT=9;
	public static final int ATTRIBUTAFFECT=10;
	public static final int BLOCK=11;
	public static final int CALL=12;
	public static final int CALLCROCHET=13;
	public static final int CALLEXP=14;
	public static final int CALLFUN=15;
	public static final int COND=16;
	public static final int DIV=17;
	public static final int DO=18;
	public static final int EGAL=19;
	public static final int ELSE=20;
	public static final int ELSEIF=21;
	public static final int END=22;
	public static final int FINBLOCK=23;
	public static final int FOR=24;
	public static final int FUNCDEC=25;
	public static final int ID=26;
	public static final int IF=27;
	public static final int IN=28;
	public static final int INFIXCOMP=29;
	public static final int INFIXMULTDIV=30;
	public static final int INTLIT=31;
	public static final int ITERATION=32;
	public static final int LET=33;
	public static final int MLCOMMENT=34;
	public static final int MOINS=35;
	public static final int MOINS_UNAIRE=36;
	public static final int MULT=37;
	public static final int OF=38;
	public static final int PARAM=39;
	public static final int PLUS=40;
	public static final int RETURN=41;
	public static final int ROOT=42;
	public static final int STRINGLIT=43;
	public static final int THEN=44;
	public static final int TYPEARRAYDEC=45;
	public static final int TYPEDEC=46;
	public static final int TYPERENAME=47;
	public static final int VARARRAYDEC=48;
	public static final int VARDEC=49;
	public static final int VARRECORD=50;
	public static final int VARSIMPLE=51;
	public static final int WHILE=52;
	public static final int WHITESPACE=53;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public ExprLexer() {} 
	public ExprLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public ExprLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g"; }

	// $ANTLR start "T__54"
	public final void mT__54() throws RecognitionException {
		try {
			int _type = T__54;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:7:7: ( '&' )
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:7:9: '&'
			{
			match('&'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__54"

	// $ANTLR start "T__55"
	public final void mT__55() throws RecognitionException {
		try {
			int _type = T__55;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:8:7: ( '(' )
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:8:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__55"

	// $ANTLR start "T__56"
	public final void mT__56() throws RecognitionException {
		try {
			int _type = T__56;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:9:7: ( ')' )
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:9:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__56"

	// $ANTLR start "T__57"
	public final void mT__57() throws RecognitionException {
		try {
			int _type = T__57;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:10:7: ( '+' )
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:10:9: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__57"

	// $ANTLR start "T__58"
	public final void mT__58() throws RecognitionException {
		try {
			int _type = T__58;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:11:7: ( ',' )
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:11:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__58"

	// $ANTLR start "T__59"
	public final void mT__59() throws RecognitionException {
		try {
			int _type = T__59;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:12:7: ( '-' )
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:12:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__59"

	// $ANTLR start "T__60"
	public final void mT__60() throws RecognitionException {
		try {
			int _type = T__60;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:13:7: ( '.' )
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:13:9: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__60"

	// $ANTLR start "T__61"
	public final void mT__61() throws RecognitionException {
		try {
			int _type = T__61;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:14:7: ( ':' )
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:14:9: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__61"

	// $ANTLR start "T__62"
	public final void mT__62() throws RecognitionException {
		try {
			int _type = T__62;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:15:7: ( ':=' )
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:15:9: ':='
			{
			match(":="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__62"

	// $ANTLR start "T__63"
	public final void mT__63() throws RecognitionException {
		try {
			int _type = T__63;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:16:7: ( ';' )
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:16:9: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__63"

	// $ANTLR start "T__64"
	public final void mT__64() throws RecognitionException {
		try {
			int _type = T__64;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:17:7: ( '=' )
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:17:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__64"

	// $ANTLR start "T__65"
	public final void mT__65() throws RecognitionException {
		try {
			int _type = T__65;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:18:7: ( '[' )
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:18:9: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__65"

	// $ANTLR start "T__66"
	public final void mT__66() throws RecognitionException {
		try {
			int _type = T__66;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:19:7: ( ']' )
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:19:9: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__66"

	// $ANTLR start "T__67"
	public final void mT__67() throws RecognitionException {
		try {
			int _type = T__67;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:20:7: ( 'array' )
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:20:9: 'array'
			{
			match("array"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__67"

	// $ANTLR start "T__68"
	public final void mT__68() throws RecognitionException {
		try {
			int _type = T__68;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:21:7: ( 'break' )
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:21:9: 'break'
			{
			match("break"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__68"

	// $ANTLR start "T__69"
	public final void mT__69() throws RecognitionException {
		try {
			int _type = T__69;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:22:7: ( 'do' )
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:22:9: 'do'
			{
			match("do"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__69"

	// $ANTLR start "T__70"
	public final void mT__70() throws RecognitionException {
		try {
			int _type = T__70;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:23:7: ( 'else' )
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:23:9: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__70"

	// $ANTLR start "T__71"
	public final void mT__71() throws RecognitionException {
		try {
			int _type = T__71;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:24:7: ( 'end' )
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:24:9: 'end'
			{
			match("end"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__71"

	// $ANTLR start "T__72"
	public final void mT__72() throws RecognitionException {
		try {
			int _type = T__72;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:25:7: ( 'for' )
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:25:9: 'for'
			{
			match("for"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__72"

	// $ANTLR start "T__73"
	public final void mT__73() throws RecognitionException {
		try {
			int _type = T__73;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:26:7: ( 'function' )
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:26:9: 'function'
			{
			match("function"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__73"

	// $ANTLR start "T__74"
	public final void mT__74() throws RecognitionException {
		try {
			int _type = T__74;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:27:7: ( 'if' )
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:27:9: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__74"

	// $ANTLR start "T__75"
	public final void mT__75() throws RecognitionException {
		try {
			int _type = T__75;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:28:7: ( 'in' )
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:28:9: 'in'
			{
			match("in"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__75"

	// $ANTLR start "T__76"
	public final void mT__76() throws RecognitionException {
		try {
			int _type = T__76;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:29:7: ( 'let' )
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:29:9: 'let'
			{
			match("let"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__76"

	// $ANTLR start "T__77"
	public final void mT__77() throws RecognitionException {
		try {
			int _type = T__77;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:30:7: ( 'nil' )
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:30:9: 'nil'
			{
			match("nil"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__77"

	// $ANTLR start "T__78"
	public final void mT__78() throws RecognitionException {
		try {
			int _type = T__78;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:31:7: ( 'of' )
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:31:9: 'of'
			{
			match("of"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__78"

	// $ANTLR start "T__79"
	public final void mT__79() throws RecognitionException {
		try {
			int _type = T__79;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:32:7: ( 'then' )
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:32:9: 'then'
			{
			match("then"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__79"

	// $ANTLR start "T__80"
	public final void mT__80() throws RecognitionException {
		try {
			int _type = T__80;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:33:7: ( 'to' )
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:33:9: 'to'
			{
			match("to"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__80"

	// $ANTLR start "T__81"
	public final void mT__81() throws RecognitionException {
		try {
			int _type = T__81;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:34:7: ( 'type' )
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:34:9: 'type'
			{
			match("type"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__81"

	// $ANTLR start "T__82"
	public final void mT__82() throws RecognitionException {
		try {
			int _type = T__82;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:35:7: ( 'var' )
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:35:9: 'var'
			{
			match("var"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__82"

	// $ANTLR start "T__83"
	public final void mT__83() throws RecognitionException {
		try {
			int _type = T__83;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:36:7: ( 'while' )
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:36:9: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__83"

	// $ANTLR start "T__84"
	public final void mT__84() throws RecognitionException {
		try {
			int _type = T__84;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:37:7: ( '{' )
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:37:9: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__84"

	// $ANTLR start "T__85"
	public final void mT__85() throws RecognitionException {
		try {
			int _type = T__85;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:38:7: ( '|' )
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:38:9: '|'
			{
			match('|'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__85"

	// $ANTLR start "T__86"
	public final void mT__86() throws RecognitionException {
		try {
			int _type = T__86;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:39:7: ( '}' )
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:39:9: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__86"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:198:4: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:198:6: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:198:25: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "INTLIT"
	public final void mINTLIT() throws RecognitionException {
		try {
			int _type = INTLIT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:199:8: ( ( '0' .. '9' )+ )
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:199:10: ( '0' .. '9' )+
			{
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:199:10: ( '0' .. '9' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INTLIT"

	// $ANTLR start "STRINGLIT"
	public final void mSTRINGLIT() throws RecognitionException {
		try {
			int _type = STRINGLIT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:202:11: ( '\"' (~ ( '\"' | '\\\\' ) | '\\\\' ( '\"' | '\\\\' | 'n' | 't' ) )* '\"' )
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:202:13: '\"' (~ ( '\"' | '\\\\' ) | '\\\\' ( '\"' | '\\\\' | 'n' | 't' ) )* '\"'
			{
			match('\"'); 
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:202:17: (~ ( '\"' | '\\\\' ) | '\\\\' ( '\"' | '\\\\' | 'n' | 't' ) )*
			loop3:
			while (true) {
				int alt3=3;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '\u0000' && LA3_0 <= '!')||(LA3_0 >= '#' && LA3_0 <= '[')||(LA3_0 >= ']' && LA3_0 <= '\uFFFF')) ) {
					alt3=1;
				}
				else if ( (LA3_0=='\\') ) {
					alt3=2;
				}

				switch (alt3) {
				case 1 :
					// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:202:18: ~ ( '\"' | '\\\\' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:202:35: '\\\\' ( '\"' | '\\\\' | 'n' | 't' )
					{
					match('\\'); 
					if ( input.LA(1)=='\"'||input.LA(1)=='\\'||input.LA(1)=='n'||input.LA(1)=='t' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop3;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRINGLIT"

	// $ANTLR start "INFIXCOMP"
	public final void mINFIXCOMP() throws RecognitionException {
		try {
			int _type = INFIXCOMP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:204:11: ( ( '>=' | '<=' | '<' | '>' | '=' | '<>' ) )
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:204:13: ( '>=' | '<=' | '<' | '>' | '=' | '<>' )
			{
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:204:13: ( '>=' | '<=' | '<' | '>' | '=' | '<>' )
			int alt4=6;
			switch ( input.LA(1) ) {
			case '>':
				{
				int LA4_1 = input.LA(2);
				if ( (LA4_1=='=') ) {
					alt4=1;
				}

				else {
					alt4=4;
				}

				}
				break;
			case '<':
				{
				switch ( input.LA(2) ) {
				case '=':
					{
					alt4=2;
					}
					break;
				case '>':
					{
					alt4=6;
					}
					break;
				default:
					alt4=3;
				}
				}
				break;
			case '=':
				{
				alt4=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:204:14: '>='
					{
					match(">="); 

					}
					break;
				case 2 :
					// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:204:19: '<='
					{
					match("<="); 

					}
					break;
				case 3 :
					// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:204:24: '<'
					{
					match('<'); 
					}
					break;
				case 4 :
					// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:204:28: '>'
					{
					match('>'); 
					}
					break;
				case 5 :
					// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:204:32: '='
					{
					match('='); 
					}
					break;
				case 6 :
					// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:204:36: '<>'
					{
					match("<>"); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INFIXCOMP"

	// $ANTLR start "INFIXMULTDIV"
	public final void mINFIXMULTDIV() throws RecognitionException {
		try {
			int _type = INFIXMULTDIV;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:205:14: ( ( '*' | '/' ) )
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:
			{
			if ( input.LA(1)=='*'||input.LA(1)=='/' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INFIXMULTDIV"

	// $ANTLR start "WHITESPACE"
	public final void mWHITESPACE() throws RecognitionException {
		try {
			int _type = WHITESPACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:210:13: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:210:17: ( ' ' | '\\t' | '\\r' | '\\n' )+
			{
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:210:17: ( ' ' | '\\t' | '\\r' | '\\n' )+
			int cnt5=0;
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '\t' && LA5_0 <= '\n')||LA5_0=='\r'||LA5_0==' ') ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt5 >= 1 ) break loop5;
					EarlyExitException eee = new EarlyExitException(5, input);
					throw eee;
				}
				cnt5++;
			}

			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHITESPACE"

	// $ANTLR start "MLCOMMENT"
	public final void mMLCOMMENT() throws RecognitionException {
		try {
			int _type = MLCOMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:217:11: ( '/*' ( options {greedy=false; } : ( MLCOMMENT | . ) )* '*/' )
			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:217:13: '/*' ( options {greedy=false; } : ( MLCOMMENT | . ) )* '*/'
			{
			match("/*"); 

			// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:217:18: ( options {greedy=false; } : ( MLCOMMENT | . ) )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0=='*') ) {
					int LA7_1 = input.LA(2);
					if ( (LA7_1=='/') ) {
						alt7=2;
					}
					else if ( ((LA7_1 >= '\u0000' && LA7_1 <= '.')||(LA7_1 >= '0' && LA7_1 <= '\uFFFF')) ) {
						alt7=1;
					}

				}
				else if ( ((LA7_0 >= '\u0000' && LA7_0 <= ')')||(LA7_0 >= '+' && LA7_0 <= '\uFFFF')) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:217:46: ( MLCOMMENT | . )
					{
					// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:217:46: ( MLCOMMENT | . )
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0=='/') ) {
						int LA6_1 = input.LA(2);
						if ( (LA6_1=='*') ) {
							alt6=1;
						}
						else if ( ((LA6_1 >= '\u0000' && LA6_1 <= ')')||(LA6_1 >= '+' && LA6_1 <= '\uFFFF')) ) {
							alt6=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 6, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( ((LA6_0 >= '\u0000' && LA6_0 <= '.')||(LA6_0 >= '0' && LA6_0 <= '\uFFFF')) ) {
						alt6=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 6, 0, input);
						throw nvae;
					}

					switch (alt6) {
						case 1 :
							// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:217:47: MLCOMMENT
							{
							mMLCOMMENT(); 

							}
							break;
						case 2 :
							// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:217:57: .
							{
							matchAny(); 
							}
							break;

					}

					}
					break;

				default :
					break loop7;
				}
			}

			match("*/"); 

			 _channel = HIDDEN; 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MLCOMMENT"

	@Override
	public void mTokens() throws RecognitionException {
		// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:1:8: ( T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | ID | INTLIT | STRINGLIT | INFIXCOMP | INFIXMULTDIV | WHITESPACE | MLCOMMENT )
		int alt8=40;
		alt8 = dfa8.predict(input);
		switch (alt8) {
			case 1 :
				// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:1:10: T__54
				{
				mT__54(); 

				}
				break;
			case 2 :
				// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:1:16: T__55
				{
				mT__55(); 

				}
				break;
			case 3 :
				// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:1:22: T__56
				{
				mT__56(); 

				}
				break;
			case 4 :
				// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:1:28: T__57
				{
				mT__57(); 

				}
				break;
			case 5 :
				// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:1:34: T__58
				{
				mT__58(); 

				}
				break;
			case 6 :
				// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:1:40: T__59
				{
				mT__59(); 

				}
				break;
			case 7 :
				// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:1:46: T__60
				{
				mT__60(); 

				}
				break;
			case 8 :
				// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:1:52: T__61
				{
				mT__61(); 

				}
				break;
			case 9 :
				// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:1:58: T__62
				{
				mT__62(); 

				}
				break;
			case 10 :
				// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:1:64: T__63
				{
				mT__63(); 

				}
				break;
			case 11 :
				// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:1:70: T__64
				{
				mT__64(); 

				}
				break;
			case 12 :
				// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:1:76: T__65
				{
				mT__65(); 

				}
				break;
			case 13 :
				// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:1:82: T__66
				{
				mT__66(); 

				}
				break;
			case 14 :
				// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:1:88: T__67
				{
				mT__67(); 

				}
				break;
			case 15 :
				// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:1:94: T__68
				{
				mT__68(); 

				}
				break;
			case 16 :
				// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:1:100: T__69
				{
				mT__69(); 

				}
				break;
			case 17 :
				// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:1:106: T__70
				{
				mT__70(); 

				}
				break;
			case 18 :
				// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:1:112: T__71
				{
				mT__71(); 

				}
				break;
			case 19 :
				// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:1:118: T__72
				{
				mT__72(); 

				}
				break;
			case 20 :
				// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:1:124: T__73
				{
				mT__73(); 

				}
				break;
			case 21 :
				// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:1:130: T__74
				{
				mT__74(); 

				}
				break;
			case 22 :
				// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:1:136: T__75
				{
				mT__75(); 

				}
				break;
			case 23 :
				// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:1:142: T__76
				{
				mT__76(); 

				}
				break;
			case 24 :
				// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:1:148: T__77
				{
				mT__77(); 

				}
				break;
			case 25 :
				// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:1:154: T__78
				{
				mT__78(); 

				}
				break;
			case 26 :
				// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:1:160: T__79
				{
				mT__79(); 

				}
				break;
			case 27 :
				// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:1:166: T__80
				{
				mT__80(); 

				}
				break;
			case 28 :
				// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:1:172: T__81
				{
				mT__81(); 

				}
				break;
			case 29 :
				// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:1:178: T__82
				{
				mT__82(); 

				}
				break;
			case 30 :
				// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:1:184: T__83
				{
				mT__83(); 

				}
				break;
			case 31 :
				// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:1:190: T__84
				{
				mT__84(); 

				}
				break;
			case 32 :
				// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:1:196: T__85
				{
				mT__85(); 

				}
				break;
			case 33 :
				// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:1:202: T__86
				{
				mT__86(); 

				}
				break;
			case 34 :
				// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:1:208: ID
				{
				mID(); 

				}
				break;
			case 35 :
				// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:1:211: INTLIT
				{
				mINTLIT(); 

				}
				break;
			case 36 :
				// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:1:218: STRINGLIT
				{
				mSTRINGLIT(); 

				}
				break;
			case 37 :
				// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:1:228: INFIXCOMP
				{
				mINFIXCOMP(); 

				}
				break;
			case 38 :
				// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:1:238: INFIXMULTDIV
				{
				mINFIXMULTDIV(); 

				}
				break;
			case 39 :
				// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:1:251: WHITESPACE
				{
				mWHITESPACE(); 

				}
				break;
			case 40 :
				// /home/ali/Desktop/2ndyear/ProjetCompil/labbaize1u/Expr.g:1:262: MLCOMMENT
				{
				mMLCOMMENT(); 

				}
				break;

		}
	}


	protected DFA8 dfa8 = new DFA8(this);
	static final String DFA8_eotS =
		"\10\uffff\1\44\4\uffff\14\34\7\uffff\1\42\5\uffff\2\34\1\72\4\34\1\77"+
		"\1\100\2\34\1\103\1\34\1\105\3\34\1\uffff\2\34\1\uffff\1\34\1\114\1\115"+
		"\1\34\2\uffff\1\117\1\120\1\uffff\1\34\1\uffff\1\34\1\123\3\34\1\127\2"+
		"\uffff\1\34\2\uffff\1\131\1\132\1\uffff\1\34\1\134\1\135\1\uffff\1\34"+
		"\2\uffff\1\137\2\uffff\1\34\1\uffff\1\34\1\142\1\uffff";
	static final String DFA8_eofS =
		"\143\uffff";
	static final String DFA8_minS =
		"\1\11\7\uffff\1\75\4\uffff\2\162\1\157\1\154\1\157\1\146\1\145\1\151\1"+
		"\146\1\150\1\141\1\150\7\uffff\1\52\5\uffff\1\162\1\145\1\60\1\163\1\144"+
		"\1\162\1\156\2\60\1\164\1\154\1\60\1\145\1\60\1\160\1\162\1\151\1\uffff"+
		"\2\141\1\uffff\1\145\2\60\1\143\2\uffff\2\60\1\uffff\1\156\1\uffff\1\145"+
		"\1\60\1\154\1\171\1\153\1\60\2\uffff\1\164\2\uffff\2\60\1\uffff\1\145"+
		"\2\60\1\uffff\1\151\2\uffff\1\60\2\uffff\1\157\1\uffff\1\156\1\60\1\uffff";
	static final String DFA8_maxS =
		"\1\175\7\uffff\1\75\4\uffff\2\162\1\157\1\156\1\165\1\156\1\145\1\151"+
		"\1\146\1\171\1\141\1\150\7\uffff\1\52\5\uffff\1\162\1\145\1\172\1\163"+
		"\1\144\1\162\1\156\2\172\1\164\1\154\1\172\1\145\1\172\1\160\1\162\1\151"+
		"\1\uffff\2\141\1\uffff\1\145\2\172\1\143\2\uffff\2\172\1\uffff\1\156\1"+
		"\uffff\1\145\1\172\1\154\1\171\1\153\1\172\2\uffff\1\164\2\uffff\2\172"+
		"\1\uffff\1\145\2\172\1\uffff\1\151\2\uffff\1\172\2\uffff\1\157\1\uffff"+
		"\1\156\1\172\1\uffff";
	static final String DFA8_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff\1\12\1\13\1\14\1\15\14\uffff"+
		"\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\uffff\1\47\1\46\1\11\1\10\1\13\21"+
		"\uffff\1\50\2\uffff\1\20\4\uffff\1\25\1\26\2\uffff\1\31\1\uffff\1\33\6"+
		"\uffff\1\22\1\23\1\uffff\1\27\1\30\2\uffff\1\35\3\uffff\1\21\1\uffff\1"+
		"\32\1\34\1\uffff\1\16\1\17\1\uffff\1\36\2\uffff\1\24";
	static final String DFA8_specialS =
		"\143\uffff}>";
	static final String[] DFA8_transitionS = {
			"\2\41\2\uffff\1\41\22\uffff\1\41\1\uffff\1\36\3\uffff\1\1\1\uffff\1\2"+
			"\1\3\1\42\1\4\1\5\1\6\1\7\1\40\12\35\1\10\1\11\1\37\1\12\1\37\2\uffff"+
			"\32\34\1\13\1\uffff\1\14\3\uffff\1\15\1\16\1\34\1\17\1\20\1\21\2\34\1"+
			"\22\2\34\1\23\1\34\1\24\1\25\4\34\1\26\1\34\1\27\1\30\3\34\1\31\1\32"+
			"\1\33",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\43",
			"",
			"",
			"",
			"",
			"\1\46",
			"\1\47",
			"\1\50",
			"\1\51\1\uffff\1\52",
			"\1\53\5\uffff\1\54",
			"\1\55\7\uffff\1\56",
			"\1\57",
			"\1\60",
			"\1\61",
			"\1\62\6\uffff\1\63\11\uffff\1\64",
			"\1\65",
			"\1\66",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\67",
			"",
			"",
			"",
			"",
			"",
			"\1\70",
			"\1\71",
			"\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\1\73",
			"\1\74",
			"\1\75",
			"\1\76",
			"\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\1\101",
			"\1\102",
			"\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\1\104",
			"\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\1\106",
			"\1\107",
			"\1\110",
			"",
			"\1\111",
			"\1\112",
			"",
			"\1\113",
			"\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\1\116",
			"",
			"",
			"\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"",
			"\1\121",
			"",
			"\1\122",
			"\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\1\124",
			"\1\125",
			"\1\126",
			"\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"",
			"",
			"\1\130",
			"",
			"",
			"\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"",
			"\1\133",
			"\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"",
			"\1\136",
			"",
			"",
			"\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"",
			"",
			"\1\140",
			"",
			"\1\141",
			"\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			""
	};

	static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
	static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
	static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
	static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
	static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
	static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
	static final short[][] DFA8_transition;

	static {
		int numStates = DFA8_transitionS.length;
		DFA8_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
		}
	}

	protected class DFA8 extends DFA {

		public DFA8(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 8;
			this.eot = DFA8_eot;
			this.eof = DFA8_eof;
			this.min = DFA8_min;
			this.max = DFA8_max;
			this.accept = DFA8_accept;
			this.special = DFA8_special;
			this.transition = DFA8_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | ID | INTLIT | STRINGLIT | INFIXCOMP | INFIXMULTDIV | WHITESPACE | MLCOMMENT );";
		}
	}

}
