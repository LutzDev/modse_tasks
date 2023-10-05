package org.xtext.aufgabe4.jsondsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.aufgabe4.jsondsl.services.JsonDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJsonDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'null'", "'E'", "'e'", "'-'", "'+'", "'['", "']'", "','", "'.'", "':'", "'{'", "'}'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalJsonDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalJsonDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalJsonDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalJsonDsl.g"; }


    	private JsonDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(JsonDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleJSON_Document"
    // InternalJsonDsl.g:53:1: entryRuleJSON_Document : ruleJSON_Document EOF ;
    public final void entryRuleJSON_Document() throws RecognitionException {
        try {
            // InternalJsonDsl.g:54:1: ( ruleJSON_Document EOF )
            // InternalJsonDsl.g:55:1: ruleJSON_Document EOF
            {
             before(grammarAccess.getJSON_DocumentRule()); 
            pushFollow(FOLLOW_1);
            ruleJSON_Document();

            state._fsp--;

             after(grammarAccess.getJSON_DocumentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJSON_Document"


    // $ANTLR start "ruleJSON_Document"
    // InternalJsonDsl.g:62:1: ruleJSON_Document : ( ( rule__JSON_Document__Json_valueAssignment ) ) ;
    public final void ruleJSON_Document() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonDsl.g:66:2: ( ( ( rule__JSON_Document__Json_valueAssignment ) ) )
            // InternalJsonDsl.g:67:2: ( ( rule__JSON_Document__Json_valueAssignment ) )
            {
            // InternalJsonDsl.g:67:2: ( ( rule__JSON_Document__Json_valueAssignment ) )
            // InternalJsonDsl.g:68:3: ( rule__JSON_Document__Json_valueAssignment )
            {
             before(grammarAccess.getJSON_DocumentAccess().getJson_valueAssignment()); 
            // InternalJsonDsl.g:69:3: ( rule__JSON_Document__Json_valueAssignment )
            // InternalJsonDsl.g:69:4: rule__JSON_Document__Json_valueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__JSON_Document__Json_valueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getJSON_DocumentAccess().getJson_valueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJSON_Document"


    // $ANTLR start "entryRuleJSON_Value"
    // InternalJsonDsl.g:78:1: entryRuleJSON_Value : ruleJSON_Value EOF ;
    public final void entryRuleJSON_Value() throws RecognitionException {
        try {
            // InternalJsonDsl.g:79:1: ( ruleJSON_Value EOF )
            // InternalJsonDsl.g:80:1: ruleJSON_Value EOF
            {
             before(grammarAccess.getJSON_ValueRule()); 
            pushFollow(FOLLOW_1);
            ruleJSON_Value();

            state._fsp--;

             after(grammarAccess.getJSON_ValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJSON_Value"


    // $ANTLR start "ruleJSON_Value"
    // InternalJsonDsl.g:87:1: ruleJSON_Value : ( ( rule__JSON_Value__Json_valueAssignment ) ) ;
    public final void ruleJSON_Value() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonDsl.g:91:2: ( ( ( rule__JSON_Value__Json_valueAssignment ) ) )
            // InternalJsonDsl.g:92:2: ( ( rule__JSON_Value__Json_valueAssignment ) )
            {
            // InternalJsonDsl.g:92:2: ( ( rule__JSON_Value__Json_valueAssignment ) )
            // InternalJsonDsl.g:93:3: ( rule__JSON_Value__Json_valueAssignment )
            {
             before(grammarAccess.getJSON_ValueAccess().getJson_valueAssignment()); 
            // InternalJsonDsl.g:94:3: ( rule__JSON_Value__Json_valueAssignment )
            // InternalJsonDsl.g:94:4: rule__JSON_Value__Json_valueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__JSON_Value__Json_valueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getJSON_ValueAccess().getJson_valueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJSON_Value"


    // $ANTLR start "entryRuleJSON_Array"
    // InternalJsonDsl.g:103:1: entryRuleJSON_Array : ruleJSON_Array EOF ;
    public final void entryRuleJSON_Array() throws RecognitionException {
        try {
            // InternalJsonDsl.g:104:1: ( ruleJSON_Array EOF )
            // InternalJsonDsl.g:105:1: ruleJSON_Array EOF
            {
             before(grammarAccess.getJSON_ArrayRule()); 
            pushFollow(FOLLOW_1);
            ruleJSON_Array();

            state._fsp--;

             after(grammarAccess.getJSON_ArrayRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJSON_Array"


    // $ANTLR start "ruleJSON_Array"
    // InternalJsonDsl.g:112:1: ruleJSON_Array : ( ( rule__JSON_Array__Group__0 ) ) ;
    public final void ruleJSON_Array() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonDsl.g:116:2: ( ( ( rule__JSON_Array__Group__0 ) ) )
            // InternalJsonDsl.g:117:2: ( ( rule__JSON_Array__Group__0 ) )
            {
            // InternalJsonDsl.g:117:2: ( ( rule__JSON_Array__Group__0 ) )
            // InternalJsonDsl.g:118:3: ( rule__JSON_Array__Group__0 )
            {
             before(grammarAccess.getJSON_ArrayAccess().getGroup()); 
            // InternalJsonDsl.g:119:3: ( rule__JSON_Array__Group__0 )
            // InternalJsonDsl.g:119:4: rule__JSON_Array__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__JSON_Array__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJSON_ArrayAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJSON_Array"


    // $ANTLR start "entryRuleJSON_String"
    // InternalJsonDsl.g:128:1: entryRuleJSON_String : ruleJSON_String EOF ;
    public final void entryRuleJSON_String() throws RecognitionException {
        try {
            // InternalJsonDsl.g:129:1: ( ruleJSON_String EOF )
            // InternalJsonDsl.g:130:1: ruleJSON_String EOF
            {
             before(grammarAccess.getJSON_StringRule()); 
            pushFollow(FOLLOW_1);
            ruleJSON_String();

            state._fsp--;

             after(grammarAccess.getJSON_StringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJSON_String"


    // $ANTLR start "ruleJSON_String"
    // InternalJsonDsl.g:137:1: ruleJSON_String : ( ( rule__JSON_String__Json_stringAssignment ) ) ;
    public final void ruleJSON_String() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonDsl.g:141:2: ( ( ( rule__JSON_String__Json_stringAssignment ) ) )
            // InternalJsonDsl.g:142:2: ( ( rule__JSON_String__Json_stringAssignment ) )
            {
            // InternalJsonDsl.g:142:2: ( ( rule__JSON_String__Json_stringAssignment ) )
            // InternalJsonDsl.g:143:3: ( rule__JSON_String__Json_stringAssignment )
            {
             before(grammarAccess.getJSON_StringAccess().getJson_stringAssignment()); 
            // InternalJsonDsl.g:144:3: ( rule__JSON_String__Json_stringAssignment )
            // InternalJsonDsl.g:144:4: rule__JSON_String__Json_stringAssignment
            {
            pushFollow(FOLLOW_2);
            rule__JSON_String__Json_stringAssignment();

            state._fsp--;


            }

             after(grammarAccess.getJSON_StringAccess().getJson_stringAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJSON_String"


    // $ANTLR start "entryRuleJSON_Boolean"
    // InternalJsonDsl.g:153:1: entryRuleJSON_Boolean : ruleJSON_Boolean EOF ;
    public final void entryRuleJSON_Boolean() throws RecognitionException {
        try {
            // InternalJsonDsl.g:154:1: ( ruleJSON_Boolean EOF )
            // InternalJsonDsl.g:155:1: ruleJSON_Boolean EOF
            {
             before(grammarAccess.getJSON_BooleanRule()); 
            pushFollow(FOLLOW_1);
            ruleJSON_Boolean();

            state._fsp--;

             after(grammarAccess.getJSON_BooleanRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJSON_Boolean"


    // $ANTLR start "ruleJSON_Boolean"
    // InternalJsonDsl.g:162:1: ruleJSON_Boolean : ( ( rule__JSON_Boolean__Json_booleanAssignment ) ) ;
    public final void ruleJSON_Boolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonDsl.g:166:2: ( ( ( rule__JSON_Boolean__Json_booleanAssignment ) ) )
            // InternalJsonDsl.g:167:2: ( ( rule__JSON_Boolean__Json_booleanAssignment ) )
            {
            // InternalJsonDsl.g:167:2: ( ( rule__JSON_Boolean__Json_booleanAssignment ) )
            // InternalJsonDsl.g:168:3: ( rule__JSON_Boolean__Json_booleanAssignment )
            {
             before(grammarAccess.getJSON_BooleanAccess().getJson_booleanAssignment()); 
            // InternalJsonDsl.g:169:3: ( rule__JSON_Boolean__Json_booleanAssignment )
            // InternalJsonDsl.g:169:4: rule__JSON_Boolean__Json_booleanAssignment
            {
            pushFollow(FOLLOW_2);
            rule__JSON_Boolean__Json_booleanAssignment();

            state._fsp--;


            }

             after(grammarAccess.getJSON_BooleanAccess().getJson_booleanAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJSON_Boolean"


    // $ANTLR start "entryRuleJSON_Number"
    // InternalJsonDsl.g:178:1: entryRuleJSON_Number : ruleJSON_Number EOF ;
    public final void entryRuleJSON_Number() throws RecognitionException {
        try {
            // InternalJsonDsl.g:179:1: ( ruleJSON_Number EOF )
            // InternalJsonDsl.g:180:1: ruleJSON_Number EOF
            {
             before(grammarAccess.getJSON_NumberRule()); 
            pushFollow(FOLLOW_1);
            ruleJSON_Number();

            state._fsp--;

             after(grammarAccess.getJSON_NumberRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJSON_Number"


    // $ANTLR start "ruleJSON_Number"
    // InternalJsonDsl.g:187:1: ruleJSON_Number : ( ( rule__JSON_Number__Group__0 ) ) ;
    public final void ruleJSON_Number() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonDsl.g:191:2: ( ( ( rule__JSON_Number__Group__0 ) ) )
            // InternalJsonDsl.g:192:2: ( ( rule__JSON_Number__Group__0 ) )
            {
            // InternalJsonDsl.g:192:2: ( ( rule__JSON_Number__Group__0 ) )
            // InternalJsonDsl.g:193:3: ( rule__JSON_Number__Group__0 )
            {
             before(grammarAccess.getJSON_NumberAccess().getGroup()); 
            // InternalJsonDsl.g:194:3: ( rule__JSON_Number__Group__0 )
            // InternalJsonDsl.g:194:4: rule__JSON_Number__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__JSON_Number__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJSON_NumberAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJSON_Number"


    // $ANTLR start "entryRuleJSON_Member"
    // InternalJsonDsl.g:203:1: entryRuleJSON_Member : ruleJSON_Member EOF ;
    public final void entryRuleJSON_Member() throws RecognitionException {
        try {
            // InternalJsonDsl.g:204:1: ( ruleJSON_Member EOF )
            // InternalJsonDsl.g:205:1: ruleJSON_Member EOF
            {
             before(grammarAccess.getJSON_MemberRule()); 
            pushFollow(FOLLOW_1);
            ruleJSON_Member();

            state._fsp--;

             after(grammarAccess.getJSON_MemberRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJSON_Member"


    // $ANTLR start "ruleJSON_Member"
    // InternalJsonDsl.g:212:1: ruleJSON_Member : ( ( rule__JSON_Member__Group__0 ) ) ;
    public final void ruleJSON_Member() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonDsl.g:216:2: ( ( ( rule__JSON_Member__Group__0 ) ) )
            // InternalJsonDsl.g:217:2: ( ( rule__JSON_Member__Group__0 ) )
            {
            // InternalJsonDsl.g:217:2: ( ( rule__JSON_Member__Group__0 ) )
            // InternalJsonDsl.g:218:3: ( rule__JSON_Member__Group__0 )
            {
             before(grammarAccess.getJSON_MemberAccess().getGroup()); 
            // InternalJsonDsl.g:219:3: ( rule__JSON_Member__Group__0 )
            // InternalJsonDsl.g:219:4: rule__JSON_Member__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__JSON_Member__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJSON_MemberAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJSON_Member"


    // $ANTLR start "entryRuleJSON_Object"
    // InternalJsonDsl.g:228:1: entryRuleJSON_Object : ruleJSON_Object EOF ;
    public final void entryRuleJSON_Object() throws RecognitionException {
        try {
            // InternalJsonDsl.g:229:1: ( ruleJSON_Object EOF )
            // InternalJsonDsl.g:230:1: ruleJSON_Object EOF
            {
             before(grammarAccess.getJSON_ObjectRule()); 
            pushFollow(FOLLOW_1);
            ruleJSON_Object();

            state._fsp--;

             after(grammarAccess.getJSON_ObjectRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJSON_Object"


    // $ANTLR start "ruleJSON_Object"
    // InternalJsonDsl.g:237:1: ruleJSON_Object : ( ( rule__JSON_Object__Group__0 ) ) ;
    public final void ruleJSON_Object() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonDsl.g:241:2: ( ( ( rule__JSON_Object__Group__0 ) ) )
            // InternalJsonDsl.g:242:2: ( ( rule__JSON_Object__Group__0 ) )
            {
            // InternalJsonDsl.g:242:2: ( ( rule__JSON_Object__Group__0 ) )
            // InternalJsonDsl.g:243:3: ( rule__JSON_Object__Group__0 )
            {
             before(grammarAccess.getJSON_ObjectAccess().getGroup()); 
            // InternalJsonDsl.g:244:3: ( rule__JSON_Object__Group__0 )
            // InternalJsonDsl.g:244:4: rule__JSON_Object__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__JSON_Object__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJSON_ObjectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJSON_Object"


    // $ANTLR start "rule__JSON_Value__Json_valueAlternatives_0"
    // InternalJsonDsl.g:252:1: rule__JSON_Value__Json_valueAlternatives_0 : ( ( ruleJSON_Array ) | ( ruleJSON_String ) | ( ruleJSON_Boolean ) | ( ruleJSON_Number ) | ( ruleJSON_Object ) );
    public final void rule__JSON_Value__Json_valueAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonDsl.g:256:1: ( ( ruleJSON_Array ) | ( ruleJSON_String ) | ( ruleJSON_Boolean ) | ( ruleJSON_Number ) | ( ruleJSON_Object ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt1=1;
                }
                break;
            case RULE_STRING:
                {
                alt1=2;
                }
                break;
            case 11:
            case 12:
            case 13:
                {
                alt1=3;
                }
                break;
            case EOF:
            case RULE_INT:
            case 14:
            case 15:
            case 16:
            case 19:
            case 20:
            case 21:
            case 24:
                {
                alt1=4;
                }
                break;
            case 23:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalJsonDsl.g:257:2: ( ruleJSON_Array )
                    {
                    // InternalJsonDsl.g:257:2: ( ruleJSON_Array )
                    // InternalJsonDsl.g:258:3: ruleJSON_Array
                    {
                     before(grammarAccess.getJSON_ValueAccess().getJson_valueJSON_ArrayParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleJSON_Array();

                    state._fsp--;

                     after(grammarAccess.getJSON_ValueAccess().getJson_valueJSON_ArrayParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJsonDsl.g:263:2: ( ruleJSON_String )
                    {
                    // InternalJsonDsl.g:263:2: ( ruleJSON_String )
                    // InternalJsonDsl.g:264:3: ruleJSON_String
                    {
                     before(grammarAccess.getJSON_ValueAccess().getJson_valueJSON_StringParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleJSON_String();

                    state._fsp--;

                     after(grammarAccess.getJSON_ValueAccess().getJson_valueJSON_StringParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalJsonDsl.g:269:2: ( ruleJSON_Boolean )
                    {
                    // InternalJsonDsl.g:269:2: ( ruleJSON_Boolean )
                    // InternalJsonDsl.g:270:3: ruleJSON_Boolean
                    {
                     before(grammarAccess.getJSON_ValueAccess().getJson_valueJSON_BooleanParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleJSON_Boolean();

                    state._fsp--;

                     after(grammarAccess.getJSON_ValueAccess().getJson_valueJSON_BooleanParserRuleCall_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalJsonDsl.g:275:2: ( ruleJSON_Number )
                    {
                    // InternalJsonDsl.g:275:2: ( ruleJSON_Number )
                    // InternalJsonDsl.g:276:3: ruleJSON_Number
                    {
                     before(grammarAccess.getJSON_ValueAccess().getJson_valueJSON_NumberParserRuleCall_0_3()); 
                    pushFollow(FOLLOW_2);
                    ruleJSON_Number();

                    state._fsp--;

                     after(grammarAccess.getJSON_ValueAccess().getJson_valueJSON_NumberParserRuleCall_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalJsonDsl.g:281:2: ( ruleJSON_Object )
                    {
                    // InternalJsonDsl.g:281:2: ( ruleJSON_Object )
                    // InternalJsonDsl.g:282:3: ruleJSON_Object
                    {
                     before(grammarAccess.getJSON_ValueAccess().getJson_valueJSON_ObjectParserRuleCall_0_4()); 
                    pushFollow(FOLLOW_2);
                    ruleJSON_Object();

                    state._fsp--;

                     after(grammarAccess.getJSON_ValueAccess().getJson_valueJSON_ObjectParserRuleCall_0_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSON_Value__Json_valueAlternatives_0"


    // $ANTLR start "rule__JSON_Boolean__Json_booleanAlternatives_0"
    // InternalJsonDsl.g:291:1: rule__JSON_Boolean__Json_booleanAlternatives_0 : ( ( 'true' ) | ( 'false' ) | ( 'null' ) );
    public final void rule__JSON_Boolean__Json_booleanAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonDsl.g:295:1: ( ( 'true' ) | ( 'false' ) | ( 'null' ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalJsonDsl.g:296:2: ( 'true' )
                    {
                    // InternalJsonDsl.g:296:2: ( 'true' )
                    // InternalJsonDsl.g:297:3: 'true'
                    {
                     before(grammarAccess.getJSON_BooleanAccess().getJson_booleanTrueKeyword_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getJSON_BooleanAccess().getJson_booleanTrueKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJsonDsl.g:302:2: ( 'false' )
                    {
                    // InternalJsonDsl.g:302:2: ( 'false' )
                    // InternalJsonDsl.g:303:3: 'false'
                    {
                     before(grammarAccess.getJSON_BooleanAccess().getJson_booleanFalseKeyword_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getJSON_BooleanAccess().getJson_booleanFalseKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalJsonDsl.g:308:2: ( 'null' )
                    {
                    // InternalJsonDsl.g:308:2: ( 'null' )
                    // InternalJsonDsl.g:309:3: 'null'
                    {
                     before(grammarAccess.getJSON_BooleanAccess().getJson_booleanNullKeyword_0_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getJSON_BooleanAccess().getJson_booleanNullKeyword_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSON_Boolean__Json_booleanAlternatives_0"


    // $ANTLR start "rule__JSON_Number__Alternatives_3_0"
    // InternalJsonDsl.g:318:1: rule__JSON_Number__Alternatives_3_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__JSON_Number__Alternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonDsl.g:322:1: ( ( 'E' ) | ( 'e' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            else if ( (LA3_0==15) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalJsonDsl.g:323:2: ( 'E' )
                    {
                    // InternalJsonDsl.g:323:2: ( 'E' )
                    // InternalJsonDsl.g:324:3: 'E'
                    {
                     before(grammarAccess.getJSON_NumberAccess().getEKeyword_3_0_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getJSON_NumberAccess().getEKeyword_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJsonDsl.g:329:2: ( 'e' )
                    {
                    // InternalJsonDsl.g:329:2: ( 'e' )
                    // InternalJsonDsl.g:330:3: 'e'
                    {
                     before(grammarAccess.getJSON_NumberAccess().getEKeyword_3_0_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getJSON_NumberAccess().getEKeyword_3_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSON_Number__Alternatives_3_0"


    // $ANTLR start "rule__JSON_Number__Alternatives_3_1"
    // InternalJsonDsl.g:339:1: rule__JSON_Number__Alternatives_3_1 : ( ( '-' ) | ( '+' ) );
    public final void rule__JSON_Number__Alternatives_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonDsl.g:343:1: ( ( '-' ) | ( '+' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            else if ( (LA4_0==17) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalJsonDsl.g:344:2: ( '-' )
                    {
                    // InternalJsonDsl.g:344:2: ( '-' )
                    // InternalJsonDsl.g:345:3: '-'
                    {
                     before(grammarAccess.getJSON_NumberAccess().getHyphenMinusKeyword_3_1_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getJSON_NumberAccess().getHyphenMinusKeyword_3_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalJsonDsl.g:350:2: ( '+' )
                    {
                    // InternalJsonDsl.g:350:2: ( '+' )
                    // InternalJsonDsl.g:351:3: '+'
                    {
                     before(grammarAccess.getJSON_NumberAccess().getPlusSignKeyword_3_1_1()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getJSON_NumberAccess().getPlusSignKeyword_3_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSON_Number__Alternatives_3_1"


    // $ANTLR start "rule__JSON_Array__Group__0"
    // InternalJsonDsl.g:360:1: rule__JSON_Array__Group__0 : rule__JSON_Array__Group__0__Impl rule__JSON_Array__Group__1 ;
    public final void rule__JSON_Array__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonDsl.g:364:1: ( rule__JSON_Array__Group__0__Impl rule__JSON_Array__Group__1 )
            // InternalJsonDsl.g:365:2: rule__JSON_Array__Group__0__Impl rule__JSON_Array__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__JSON_Array__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JSON_Array__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSON_Array__Group__0"


    // $ANTLR start "rule__JSON_Array__Group__0__Impl"
    // InternalJsonDsl.g:372:1: rule__JSON_Array__Group__0__Impl : ( '[' ) ;
    public final void rule__JSON_Array__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonDsl.g:376:1: ( ( '[' ) )
            // InternalJsonDsl.g:377:1: ( '[' )
            {
            // InternalJsonDsl.g:377:1: ( '[' )
            // InternalJsonDsl.g:378:2: '['
            {
             before(grammarAccess.getJSON_ArrayAccess().getLeftSquareBracketKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getJSON_ArrayAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSON_Array__Group__0__Impl"


    // $ANTLR start "rule__JSON_Array__Group__1"
    // InternalJsonDsl.g:387:1: rule__JSON_Array__Group__1 : rule__JSON_Array__Group__1__Impl rule__JSON_Array__Group__2 ;
    public final void rule__JSON_Array__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonDsl.g:391:1: ( rule__JSON_Array__Group__1__Impl rule__JSON_Array__Group__2 )
            // InternalJsonDsl.g:392:2: rule__JSON_Array__Group__1__Impl rule__JSON_Array__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__JSON_Array__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JSON_Array__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSON_Array__Group__1"


    // $ANTLR start "rule__JSON_Array__Group__1__Impl"
    // InternalJsonDsl.g:399:1: rule__JSON_Array__Group__1__Impl : ( ( rule__JSON_Array__FirstAssignment_1 ) ) ;
    public final void rule__JSON_Array__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonDsl.g:403:1: ( ( ( rule__JSON_Array__FirstAssignment_1 ) ) )
            // InternalJsonDsl.g:404:1: ( ( rule__JSON_Array__FirstAssignment_1 ) )
            {
            // InternalJsonDsl.g:404:1: ( ( rule__JSON_Array__FirstAssignment_1 ) )
            // InternalJsonDsl.g:405:2: ( rule__JSON_Array__FirstAssignment_1 )
            {
             before(grammarAccess.getJSON_ArrayAccess().getFirstAssignment_1()); 
            // InternalJsonDsl.g:406:2: ( rule__JSON_Array__FirstAssignment_1 )
            // InternalJsonDsl.g:406:3: rule__JSON_Array__FirstAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__JSON_Array__FirstAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getJSON_ArrayAccess().getFirstAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSON_Array__Group__1__Impl"


    // $ANTLR start "rule__JSON_Array__Group__2"
    // InternalJsonDsl.g:414:1: rule__JSON_Array__Group__2 : rule__JSON_Array__Group__2__Impl rule__JSON_Array__Group__3 ;
    public final void rule__JSON_Array__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonDsl.g:418:1: ( rule__JSON_Array__Group__2__Impl rule__JSON_Array__Group__3 )
            // InternalJsonDsl.g:419:2: rule__JSON_Array__Group__2__Impl rule__JSON_Array__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__JSON_Array__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JSON_Array__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSON_Array__Group__2"


    // $ANTLR start "rule__JSON_Array__Group__2__Impl"
    // InternalJsonDsl.g:426:1: rule__JSON_Array__Group__2__Impl : ( ( rule__JSON_Array__Group_2__0 )* ) ;
    public final void rule__JSON_Array__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonDsl.g:430:1: ( ( ( rule__JSON_Array__Group_2__0 )* ) )
            // InternalJsonDsl.g:431:1: ( ( rule__JSON_Array__Group_2__0 )* )
            {
            // InternalJsonDsl.g:431:1: ( ( rule__JSON_Array__Group_2__0 )* )
            // InternalJsonDsl.g:432:2: ( rule__JSON_Array__Group_2__0 )*
            {
             before(grammarAccess.getJSON_ArrayAccess().getGroup_2()); 
            // InternalJsonDsl.g:433:2: ( rule__JSON_Array__Group_2__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==20) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalJsonDsl.g:433:3: rule__JSON_Array__Group_2__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__JSON_Array__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getJSON_ArrayAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSON_Array__Group__2__Impl"


    // $ANTLR start "rule__JSON_Array__Group__3"
    // InternalJsonDsl.g:441:1: rule__JSON_Array__Group__3 : rule__JSON_Array__Group__3__Impl ;
    public final void rule__JSON_Array__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonDsl.g:445:1: ( rule__JSON_Array__Group__3__Impl )
            // InternalJsonDsl.g:446:2: rule__JSON_Array__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JSON_Array__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSON_Array__Group__3"


    // $ANTLR start "rule__JSON_Array__Group__3__Impl"
    // InternalJsonDsl.g:452:1: rule__JSON_Array__Group__3__Impl : ( ']' ) ;
    public final void rule__JSON_Array__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonDsl.g:456:1: ( ( ']' ) )
            // InternalJsonDsl.g:457:1: ( ']' )
            {
            // InternalJsonDsl.g:457:1: ( ']' )
            // InternalJsonDsl.g:458:2: ']'
            {
             before(grammarAccess.getJSON_ArrayAccess().getRightSquareBracketKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getJSON_ArrayAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSON_Array__Group__3__Impl"


    // $ANTLR start "rule__JSON_Array__Group_2__0"
    // InternalJsonDsl.g:468:1: rule__JSON_Array__Group_2__0 : rule__JSON_Array__Group_2__0__Impl rule__JSON_Array__Group_2__1 ;
    public final void rule__JSON_Array__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonDsl.g:472:1: ( rule__JSON_Array__Group_2__0__Impl rule__JSON_Array__Group_2__1 )
            // InternalJsonDsl.g:473:2: rule__JSON_Array__Group_2__0__Impl rule__JSON_Array__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__JSON_Array__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JSON_Array__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSON_Array__Group_2__0"


    // $ANTLR start "rule__JSON_Array__Group_2__0__Impl"
    // InternalJsonDsl.g:480:1: rule__JSON_Array__Group_2__0__Impl : ( ',' ) ;
    public final void rule__JSON_Array__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonDsl.g:484:1: ( ( ',' ) )
            // InternalJsonDsl.g:485:1: ( ',' )
            {
            // InternalJsonDsl.g:485:1: ( ',' )
            // InternalJsonDsl.g:486:2: ','
            {
             before(grammarAccess.getJSON_ArrayAccess().getCommaKeyword_2_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getJSON_ArrayAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSON_Array__Group_2__0__Impl"


    // $ANTLR start "rule__JSON_Array__Group_2__1"
    // InternalJsonDsl.g:495:1: rule__JSON_Array__Group_2__1 : rule__JSON_Array__Group_2__1__Impl ;
    public final void rule__JSON_Array__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonDsl.g:499:1: ( rule__JSON_Array__Group_2__1__Impl )
            // InternalJsonDsl.g:500:2: rule__JSON_Array__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JSON_Array__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSON_Array__Group_2__1"


    // $ANTLR start "rule__JSON_Array__Group_2__1__Impl"
    // InternalJsonDsl.g:506:1: rule__JSON_Array__Group_2__1__Impl : ( ( rule__JSON_Array__OtherAssignment_2_1 ) ) ;
    public final void rule__JSON_Array__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonDsl.g:510:1: ( ( ( rule__JSON_Array__OtherAssignment_2_1 ) ) )
            // InternalJsonDsl.g:511:1: ( ( rule__JSON_Array__OtherAssignment_2_1 ) )
            {
            // InternalJsonDsl.g:511:1: ( ( rule__JSON_Array__OtherAssignment_2_1 ) )
            // InternalJsonDsl.g:512:2: ( rule__JSON_Array__OtherAssignment_2_1 )
            {
             before(grammarAccess.getJSON_ArrayAccess().getOtherAssignment_2_1()); 
            // InternalJsonDsl.g:513:2: ( rule__JSON_Array__OtherAssignment_2_1 )
            // InternalJsonDsl.g:513:3: rule__JSON_Array__OtherAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__JSON_Array__OtherAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getJSON_ArrayAccess().getOtherAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSON_Array__Group_2__1__Impl"


    // $ANTLR start "rule__JSON_Number__Group__0"
    // InternalJsonDsl.g:522:1: rule__JSON_Number__Group__0 : rule__JSON_Number__Group__0__Impl rule__JSON_Number__Group__1 ;
    public final void rule__JSON_Number__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonDsl.g:526:1: ( rule__JSON_Number__Group__0__Impl rule__JSON_Number__Group__1 )
            // InternalJsonDsl.g:527:2: rule__JSON_Number__Group__0__Impl rule__JSON_Number__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__JSON_Number__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JSON_Number__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSON_Number__Group__0"


    // $ANTLR start "rule__JSON_Number__Group__0__Impl"
    // InternalJsonDsl.g:534:1: rule__JSON_Number__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__JSON_Number__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonDsl.g:538:1: ( ( ( '-' )? ) )
            // InternalJsonDsl.g:539:1: ( ( '-' )? )
            {
            // InternalJsonDsl.g:539:1: ( ( '-' )? )
            // InternalJsonDsl.g:540:2: ( '-' )?
            {
             before(grammarAccess.getJSON_NumberAccess().getHyphenMinusKeyword_0()); 
            // InternalJsonDsl.g:541:2: ( '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalJsonDsl.g:541:3: '-'
                    {
                    match(input,16,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getJSON_NumberAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSON_Number__Group__0__Impl"


    // $ANTLR start "rule__JSON_Number__Group__1"
    // InternalJsonDsl.g:549:1: rule__JSON_Number__Group__1 : rule__JSON_Number__Group__1__Impl rule__JSON_Number__Group__2 ;
    public final void rule__JSON_Number__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonDsl.g:553:1: ( rule__JSON_Number__Group__1__Impl rule__JSON_Number__Group__2 )
            // InternalJsonDsl.g:554:2: rule__JSON_Number__Group__1__Impl rule__JSON_Number__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__JSON_Number__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JSON_Number__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSON_Number__Group__1"


    // $ANTLR start "rule__JSON_Number__Group__1__Impl"
    // InternalJsonDsl.g:561:1: rule__JSON_Number__Group__1__Impl : ( ( rule__JSON_Number__ZahlAssignment_1 )? ) ;
    public final void rule__JSON_Number__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonDsl.g:565:1: ( ( ( rule__JSON_Number__ZahlAssignment_1 )? ) )
            // InternalJsonDsl.g:566:1: ( ( rule__JSON_Number__ZahlAssignment_1 )? )
            {
            // InternalJsonDsl.g:566:1: ( ( rule__JSON_Number__ZahlAssignment_1 )? )
            // InternalJsonDsl.g:567:2: ( rule__JSON_Number__ZahlAssignment_1 )?
            {
             before(grammarAccess.getJSON_NumberAccess().getZahlAssignment_1()); 
            // InternalJsonDsl.g:568:2: ( rule__JSON_Number__ZahlAssignment_1 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_INT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalJsonDsl.g:568:3: rule__JSON_Number__ZahlAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__JSON_Number__ZahlAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJSON_NumberAccess().getZahlAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSON_Number__Group__1__Impl"


    // $ANTLR start "rule__JSON_Number__Group__2"
    // InternalJsonDsl.g:576:1: rule__JSON_Number__Group__2 : rule__JSON_Number__Group__2__Impl rule__JSON_Number__Group__3 ;
    public final void rule__JSON_Number__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonDsl.g:580:1: ( rule__JSON_Number__Group__2__Impl rule__JSON_Number__Group__3 )
            // InternalJsonDsl.g:581:2: rule__JSON_Number__Group__2__Impl rule__JSON_Number__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__JSON_Number__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JSON_Number__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSON_Number__Group__2"


    // $ANTLR start "rule__JSON_Number__Group__2__Impl"
    // InternalJsonDsl.g:588:1: rule__JSON_Number__Group__2__Impl : ( ( rule__JSON_Number__Group_2__0 )? ) ;
    public final void rule__JSON_Number__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonDsl.g:592:1: ( ( ( rule__JSON_Number__Group_2__0 )? ) )
            // InternalJsonDsl.g:593:1: ( ( rule__JSON_Number__Group_2__0 )? )
            {
            // InternalJsonDsl.g:593:1: ( ( rule__JSON_Number__Group_2__0 )? )
            // InternalJsonDsl.g:594:2: ( rule__JSON_Number__Group_2__0 )?
            {
             before(grammarAccess.getJSON_NumberAccess().getGroup_2()); 
            // InternalJsonDsl.g:595:2: ( rule__JSON_Number__Group_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalJsonDsl.g:595:3: rule__JSON_Number__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__JSON_Number__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJSON_NumberAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSON_Number__Group__2__Impl"


    // $ANTLR start "rule__JSON_Number__Group__3"
    // InternalJsonDsl.g:603:1: rule__JSON_Number__Group__3 : rule__JSON_Number__Group__3__Impl ;
    public final void rule__JSON_Number__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonDsl.g:607:1: ( rule__JSON_Number__Group__3__Impl )
            // InternalJsonDsl.g:608:2: rule__JSON_Number__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JSON_Number__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSON_Number__Group__3"


    // $ANTLR start "rule__JSON_Number__Group__3__Impl"
    // InternalJsonDsl.g:614:1: rule__JSON_Number__Group__3__Impl : ( ( rule__JSON_Number__Group_3__0 )? ) ;
    public final void rule__JSON_Number__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonDsl.g:618:1: ( ( ( rule__JSON_Number__Group_3__0 )? ) )
            // InternalJsonDsl.g:619:1: ( ( rule__JSON_Number__Group_3__0 )? )
            {
            // InternalJsonDsl.g:619:1: ( ( rule__JSON_Number__Group_3__0 )? )
            // InternalJsonDsl.g:620:2: ( rule__JSON_Number__Group_3__0 )?
            {
             before(grammarAccess.getJSON_NumberAccess().getGroup_3()); 
            // InternalJsonDsl.g:621:2: ( rule__JSON_Number__Group_3__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=14 && LA9_0<=15)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalJsonDsl.g:621:3: rule__JSON_Number__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__JSON_Number__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJSON_NumberAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSON_Number__Group__3__Impl"


    // $ANTLR start "rule__JSON_Number__Group_2__0"
    // InternalJsonDsl.g:630:1: rule__JSON_Number__Group_2__0 : rule__JSON_Number__Group_2__0__Impl rule__JSON_Number__Group_2__1 ;
    public final void rule__JSON_Number__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonDsl.g:634:1: ( rule__JSON_Number__Group_2__0__Impl rule__JSON_Number__Group_2__1 )
            // InternalJsonDsl.g:635:2: rule__JSON_Number__Group_2__0__Impl rule__JSON_Number__Group_2__1
            {
            pushFollow(FOLLOW_7);
            rule__JSON_Number__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JSON_Number__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSON_Number__Group_2__0"


    // $ANTLR start "rule__JSON_Number__Group_2__0__Impl"
    // InternalJsonDsl.g:642:1: rule__JSON_Number__Group_2__0__Impl : ( '.' ) ;
    public final void rule__JSON_Number__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonDsl.g:646:1: ( ( '.' ) )
            // InternalJsonDsl.g:647:1: ( '.' )
            {
            // InternalJsonDsl.g:647:1: ( '.' )
            // InternalJsonDsl.g:648:2: '.'
            {
             before(grammarAccess.getJSON_NumberAccess().getFullStopKeyword_2_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getJSON_NumberAccess().getFullStopKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSON_Number__Group_2__0__Impl"


    // $ANTLR start "rule__JSON_Number__Group_2__1"
    // InternalJsonDsl.g:657:1: rule__JSON_Number__Group_2__1 : rule__JSON_Number__Group_2__1__Impl ;
    public final void rule__JSON_Number__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonDsl.g:661:1: ( rule__JSON_Number__Group_2__1__Impl )
            // InternalJsonDsl.g:662:2: rule__JSON_Number__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JSON_Number__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSON_Number__Group_2__1"


    // $ANTLR start "rule__JSON_Number__Group_2__1__Impl"
    // InternalJsonDsl.g:668:1: rule__JSON_Number__Group_2__1__Impl : ( ( rule__JSON_Number__KommaAssignment_2_1 ) ) ;
    public final void rule__JSON_Number__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonDsl.g:672:1: ( ( ( rule__JSON_Number__KommaAssignment_2_1 ) ) )
            // InternalJsonDsl.g:673:1: ( ( rule__JSON_Number__KommaAssignment_2_1 ) )
            {
            // InternalJsonDsl.g:673:1: ( ( rule__JSON_Number__KommaAssignment_2_1 ) )
            // InternalJsonDsl.g:674:2: ( rule__JSON_Number__KommaAssignment_2_1 )
            {
             before(grammarAccess.getJSON_NumberAccess().getKommaAssignment_2_1()); 
            // InternalJsonDsl.g:675:2: ( rule__JSON_Number__KommaAssignment_2_1 )
            // InternalJsonDsl.g:675:3: rule__JSON_Number__KommaAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__JSON_Number__KommaAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getJSON_NumberAccess().getKommaAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSON_Number__Group_2__1__Impl"


    // $ANTLR start "rule__JSON_Number__Group_3__0"
    // InternalJsonDsl.g:684:1: rule__JSON_Number__Group_3__0 : rule__JSON_Number__Group_3__0__Impl rule__JSON_Number__Group_3__1 ;
    public final void rule__JSON_Number__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonDsl.g:688:1: ( rule__JSON_Number__Group_3__0__Impl rule__JSON_Number__Group_3__1 )
            // InternalJsonDsl.g:689:2: rule__JSON_Number__Group_3__0__Impl rule__JSON_Number__Group_3__1
            {
            pushFollow(FOLLOW_8);
            rule__JSON_Number__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JSON_Number__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSON_Number__Group_3__0"


    // $ANTLR start "rule__JSON_Number__Group_3__0__Impl"
    // InternalJsonDsl.g:696:1: rule__JSON_Number__Group_3__0__Impl : ( ( rule__JSON_Number__Alternatives_3_0 ) ) ;
    public final void rule__JSON_Number__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonDsl.g:700:1: ( ( ( rule__JSON_Number__Alternatives_3_0 ) ) )
            // InternalJsonDsl.g:701:1: ( ( rule__JSON_Number__Alternatives_3_0 ) )
            {
            // InternalJsonDsl.g:701:1: ( ( rule__JSON_Number__Alternatives_3_0 ) )
            // InternalJsonDsl.g:702:2: ( rule__JSON_Number__Alternatives_3_0 )
            {
             before(grammarAccess.getJSON_NumberAccess().getAlternatives_3_0()); 
            // InternalJsonDsl.g:703:2: ( rule__JSON_Number__Alternatives_3_0 )
            // InternalJsonDsl.g:703:3: rule__JSON_Number__Alternatives_3_0
            {
            pushFollow(FOLLOW_2);
            rule__JSON_Number__Alternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getJSON_NumberAccess().getAlternatives_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSON_Number__Group_3__0__Impl"


    // $ANTLR start "rule__JSON_Number__Group_3__1"
    // InternalJsonDsl.g:711:1: rule__JSON_Number__Group_3__1 : rule__JSON_Number__Group_3__1__Impl rule__JSON_Number__Group_3__2 ;
    public final void rule__JSON_Number__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonDsl.g:715:1: ( rule__JSON_Number__Group_3__1__Impl rule__JSON_Number__Group_3__2 )
            // InternalJsonDsl.g:716:2: rule__JSON_Number__Group_3__1__Impl rule__JSON_Number__Group_3__2
            {
            pushFollow(FOLLOW_8);
            rule__JSON_Number__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JSON_Number__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSON_Number__Group_3__1"


    // $ANTLR start "rule__JSON_Number__Group_3__1__Impl"
    // InternalJsonDsl.g:723:1: rule__JSON_Number__Group_3__1__Impl : ( ( rule__JSON_Number__Alternatives_3_1 )? ) ;
    public final void rule__JSON_Number__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonDsl.g:727:1: ( ( ( rule__JSON_Number__Alternatives_3_1 )? ) )
            // InternalJsonDsl.g:728:1: ( ( rule__JSON_Number__Alternatives_3_1 )? )
            {
            // InternalJsonDsl.g:728:1: ( ( rule__JSON_Number__Alternatives_3_1 )? )
            // InternalJsonDsl.g:729:2: ( rule__JSON_Number__Alternatives_3_1 )?
            {
             before(grammarAccess.getJSON_NumberAccess().getAlternatives_3_1()); 
            // InternalJsonDsl.g:730:2: ( rule__JSON_Number__Alternatives_3_1 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=16 && LA10_0<=17)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalJsonDsl.g:730:3: rule__JSON_Number__Alternatives_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__JSON_Number__Alternatives_3_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJSON_NumberAccess().getAlternatives_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSON_Number__Group_3__1__Impl"


    // $ANTLR start "rule__JSON_Number__Group_3__2"
    // InternalJsonDsl.g:738:1: rule__JSON_Number__Group_3__2 : rule__JSON_Number__Group_3__2__Impl ;
    public final void rule__JSON_Number__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonDsl.g:742:1: ( rule__JSON_Number__Group_3__2__Impl )
            // InternalJsonDsl.g:743:2: rule__JSON_Number__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JSON_Number__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSON_Number__Group_3__2"


    // $ANTLR start "rule__JSON_Number__Group_3__2__Impl"
    // InternalJsonDsl.g:749:1: rule__JSON_Number__Group_3__2__Impl : ( ( rule__JSON_Number__ExpoAssignment_3_2 ) ) ;
    public final void rule__JSON_Number__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonDsl.g:753:1: ( ( ( rule__JSON_Number__ExpoAssignment_3_2 ) ) )
            // InternalJsonDsl.g:754:1: ( ( rule__JSON_Number__ExpoAssignment_3_2 ) )
            {
            // InternalJsonDsl.g:754:1: ( ( rule__JSON_Number__ExpoAssignment_3_2 ) )
            // InternalJsonDsl.g:755:2: ( rule__JSON_Number__ExpoAssignment_3_2 )
            {
             before(grammarAccess.getJSON_NumberAccess().getExpoAssignment_3_2()); 
            // InternalJsonDsl.g:756:2: ( rule__JSON_Number__ExpoAssignment_3_2 )
            // InternalJsonDsl.g:756:3: rule__JSON_Number__ExpoAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__JSON_Number__ExpoAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getJSON_NumberAccess().getExpoAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSON_Number__Group_3__2__Impl"


    // $ANTLR start "rule__JSON_Member__Group__0"
    // InternalJsonDsl.g:765:1: rule__JSON_Member__Group__0 : rule__JSON_Member__Group__0__Impl rule__JSON_Member__Group__1 ;
    public final void rule__JSON_Member__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonDsl.g:769:1: ( rule__JSON_Member__Group__0__Impl rule__JSON_Member__Group__1 )
            // InternalJsonDsl.g:770:2: rule__JSON_Member__Group__0__Impl rule__JSON_Member__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__JSON_Member__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JSON_Member__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSON_Member__Group__0"


    // $ANTLR start "rule__JSON_Member__Group__0__Impl"
    // InternalJsonDsl.g:777:1: rule__JSON_Member__Group__0__Impl : ( ( rule__JSON_Member__Json_memberAssignment_0 ) ) ;
    public final void rule__JSON_Member__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonDsl.g:781:1: ( ( ( rule__JSON_Member__Json_memberAssignment_0 ) ) )
            // InternalJsonDsl.g:782:1: ( ( rule__JSON_Member__Json_memberAssignment_0 ) )
            {
            // InternalJsonDsl.g:782:1: ( ( rule__JSON_Member__Json_memberAssignment_0 ) )
            // InternalJsonDsl.g:783:2: ( rule__JSON_Member__Json_memberAssignment_0 )
            {
             before(grammarAccess.getJSON_MemberAccess().getJson_memberAssignment_0()); 
            // InternalJsonDsl.g:784:2: ( rule__JSON_Member__Json_memberAssignment_0 )
            // InternalJsonDsl.g:784:3: rule__JSON_Member__Json_memberAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__JSON_Member__Json_memberAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getJSON_MemberAccess().getJson_memberAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSON_Member__Group__0__Impl"


    // $ANTLR start "rule__JSON_Member__Group__1"
    // InternalJsonDsl.g:792:1: rule__JSON_Member__Group__1 : rule__JSON_Member__Group__1__Impl rule__JSON_Member__Group__2 ;
    public final void rule__JSON_Member__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonDsl.g:796:1: ( rule__JSON_Member__Group__1__Impl rule__JSON_Member__Group__2 )
            // InternalJsonDsl.g:797:2: rule__JSON_Member__Group__1__Impl rule__JSON_Member__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__JSON_Member__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JSON_Member__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSON_Member__Group__1"


    // $ANTLR start "rule__JSON_Member__Group__1__Impl"
    // InternalJsonDsl.g:804:1: rule__JSON_Member__Group__1__Impl : ( ':' ) ;
    public final void rule__JSON_Member__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonDsl.g:808:1: ( ( ':' ) )
            // InternalJsonDsl.g:809:1: ( ':' )
            {
            // InternalJsonDsl.g:809:1: ( ':' )
            // InternalJsonDsl.g:810:2: ':'
            {
             before(grammarAccess.getJSON_MemberAccess().getColonKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getJSON_MemberAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSON_Member__Group__1__Impl"


    // $ANTLR start "rule__JSON_Member__Group__2"
    // InternalJsonDsl.g:819:1: rule__JSON_Member__Group__2 : rule__JSON_Member__Group__2__Impl ;
    public final void rule__JSON_Member__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonDsl.g:823:1: ( rule__JSON_Member__Group__2__Impl )
            // InternalJsonDsl.g:824:2: rule__JSON_Member__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JSON_Member__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSON_Member__Group__2"


    // $ANTLR start "rule__JSON_Member__Group__2__Impl"
    // InternalJsonDsl.g:830:1: rule__JSON_Member__Group__2__Impl : ( ( rule__JSON_Member__Json_valueAssignment_2 ) ) ;
    public final void rule__JSON_Member__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonDsl.g:834:1: ( ( ( rule__JSON_Member__Json_valueAssignment_2 ) ) )
            // InternalJsonDsl.g:835:1: ( ( rule__JSON_Member__Json_valueAssignment_2 ) )
            {
            // InternalJsonDsl.g:835:1: ( ( rule__JSON_Member__Json_valueAssignment_2 ) )
            // InternalJsonDsl.g:836:2: ( rule__JSON_Member__Json_valueAssignment_2 )
            {
             before(grammarAccess.getJSON_MemberAccess().getJson_valueAssignment_2()); 
            // InternalJsonDsl.g:837:2: ( rule__JSON_Member__Json_valueAssignment_2 )
            // InternalJsonDsl.g:837:3: rule__JSON_Member__Json_valueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__JSON_Member__Json_valueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getJSON_MemberAccess().getJson_valueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSON_Member__Group__2__Impl"


    // $ANTLR start "rule__JSON_Object__Group__0"
    // InternalJsonDsl.g:846:1: rule__JSON_Object__Group__0 : rule__JSON_Object__Group__0__Impl rule__JSON_Object__Group__1 ;
    public final void rule__JSON_Object__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonDsl.g:850:1: ( rule__JSON_Object__Group__0__Impl rule__JSON_Object__Group__1 )
            // InternalJsonDsl.g:851:2: rule__JSON_Object__Group__0__Impl rule__JSON_Object__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__JSON_Object__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JSON_Object__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSON_Object__Group__0"


    // $ANTLR start "rule__JSON_Object__Group__0__Impl"
    // InternalJsonDsl.g:858:1: rule__JSON_Object__Group__0__Impl : ( '{' ) ;
    public final void rule__JSON_Object__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonDsl.g:862:1: ( ( '{' ) )
            // InternalJsonDsl.g:863:1: ( '{' )
            {
            // InternalJsonDsl.g:863:1: ( '{' )
            // InternalJsonDsl.g:864:2: '{'
            {
             before(grammarAccess.getJSON_ObjectAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getJSON_ObjectAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSON_Object__Group__0__Impl"


    // $ANTLR start "rule__JSON_Object__Group__1"
    // InternalJsonDsl.g:873:1: rule__JSON_Object__Group__1 : rule__JSON_Object__Group__1__Impl rule__JSON_Object__Group__2 ;
    public final void rule__JSON_Object__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonDsl.g:877:1: ( rule__JSON_Object__Group__1__Impl rule__JSON_Object__Group__2 )
            // InternalJsonDsl.g:878:2: rule__JSON_Object__Group__1__Impl rule__JSON_Object__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__JSON_Object__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JSON_Object__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSON_Object__Group__1"


    // $ANTLR start "rule__JSON_Object__Group__1__Impl"
    // InternalJsonDsl.g:885:1: rule__JSON_Object__Group__1__Impl : ( ( rule__JSON_Object__FirstAssignment_1 ) ) ;
    public final void rule__JSON_Object__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonDsl.g:889:1: ( ( ( rule__JSON_Object__FirstAssignment_1 ) ) )
            // InternalJsonDsl.g:890:1: ( ( rule__JSON_Object__FirstAssignment_1 ) )
            {
            // InternalJsonDsl.g:890:1: ( ( rule__JSON_Object__FirstAssignment_1 ) )
            // InternalJsonDsl.g:891:2: ( rule__JSON_Object__FirstAssignment_1 )
            {
             before(grammarAccess.getJSON_ObjectAccess().getFirstAssignment_1()); 
            // InternalJsonDsl.g:892:2: ( rule__JSON_Object__FirstAssignment_1 )
            // InternalJsonDsl.g:892:3: rule__JSON_Object__FirstAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__JSON_Object__FirstAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getJSON_ObjectAccess().getFirstAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSON_Object__Group__1__Impl"


    // $ANTLR start "rule__JSON_Object__Group__2"
    // InternalJsonDsl.g:900:1: rule__JSON_Object__Group__2 : rule__JSON_Object__Group__2__Impl rule__JSON_Object__Group__3 ;
    public final void rule__JSON_Object__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonDsl.g:904:1: ( rule__JSON_Object__Group__2__Impl rule__JSON_Object__Group__3 )
            // InternalJsonDsl.g:905:2: rule__JSON_Object__Group__2__Impl rule__JSON_Object__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__JSON_Object__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JSON_Object__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSON_Object__Group__2"


    // $ANTLR start "rule__JSON_Object__Group__2__Impl"
    // InternalJsonDsl.g:912:1: rule__JSON_Object__Group__2__Impl : ( ( rule__JSON_Object__Group_2__0 )* ) ;
    public final void rule__JSON_Object__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonDsl.g:916:1: ( ( ( rule__JSON_Object__Group_2__0 )* ) )
            // InternalJsonDsl.g:917:1: ( ( rule__JSON_Object__Group_2__0 )* )
            {
            // InternalJsonDsl.g:917:1: ( ( rule__JSON_Object__Group_2__0 )* )
            // InternalJsonDsl.g:918:2: ( rule__JSON_Object__Group_2__0 )*
            {
             before(grammarAccess.getJSON_ObjectAccess().getGroup_2()); 
            // InternalJsonDsl.g:919:2: ( rule__JSON_Object__Group_2__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==20) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalJsonDsl.g:919:3: rule__JSON_Object__Group_2__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__JSON_Object__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getJSON_ObjectAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSON_Object__Group__2__Impl"


    // $ANTLR start "rule__JSON_Object__Group__3"
    // InternalJsonDsl.g:927:1: rule__JSON_Object__Group__3 : rule__JSON_Object__Group__3__Impl ;
    public final void rule__JSON_Object__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonDsl.g:931:1: ( rule__JSON_Object__Group__3__Impl )
            // InternalJsonDsl.g:932:2: rule__JSON_Object__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JSON_Object__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSON_Object__Group__3"


    // $ANTLR start "rule__JSON_Object__Group__3__Impl"
    // InternalJsonDsl.g:938:1: rule__JSON_Object__Group__3__Impl : ( '}' ) ;
    public final void rule__JSON_Object__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonDsl.g:942:1: ( ( '}' ) )
            // InternalJsonDsl.g:943:1: ( '}' )
            {
            // InternalJsonDsl.g:943:1: ( '}' )
            // InternalJsonDsl.g:944:2: '}'
            {
             before(grammarAccess.getJSON_ObjectAccess().getRightCurlyBracketKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getJSON_ObjectAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSON_Object__Group__3__Impl"


    // $ANTLR start "rule__JSON_Object__Group_2__0"
    // InternalJsonDsl.g:954:1: rule__JSON_Object__Group_2__0 : rule__JSON_Object__Group_2__0__Impl rule__JSON_Object__Group_2__1 ;
    public final void rule__JSON_Object__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonDsl.g:958:1: ( rule__JSON_Object__Group_2__0__Impl rule__JSON_Object__Group_2__1 )
            // InternalJsonDsl.g:959:2: rule__JSON_Object__Group_2__0__Impl rule__JSON_Object__Group_2__1
            {
            pushFollow(FOLLOW_10);
            rule__JSON_Object__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JSON_Object__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSON_Object__Group_2__0"


    // $ANTLR start "rule__JSON_Object__Group_2__0__Impl"
    // InternalJsonDsl.g:966:1: rule__JSON_Object__Group_2__0__Impl : ( ',' ) ;
    public final void rule__JSON_Object__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonDsl.g:970:1: ( ( ',' ) )
            // InternalJsonDsl.g:971:1: ( ',' )
            {
            // InternalJsonDsl.g:971:1: ( ',' )
            // InternalJsonDsl.g:972:2: ','
            {
             before(grammarAccess.getJSON_ObjectAccess().getCommaKeyword_2_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getJSON_ObjectAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSON_Object__Group_2__0__Impl"


    // $ANTLR start "rule__JSON_Object__Group_2__1"
    // InternalJsonDsl.g:981:1: rule__JSON_Object__Group_2__1 : rule__JSON_Object__Group_2__1__Impl ;
    public final void rule__JSON_Object__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonDsl.g:985:1: ( rule__JSON_Object__Group_2__1__Impl )
            // InternalJsonDsl.g:986:2: rule__JSON_Object__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JSON_Object__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSON_Object__Group_2__1"


    // $ANTLR start "rule__JSON_Object__Group_2__1__Impl"
    // InternalJsonDsl.g:992:1: rule__JSON_Object__Group_2__1__Impl : ( ( rule__JSON_Object__OtherAssignment_2_1 ) ) ;
    public final void rule__JSON_Object__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonDsl.g:996:1: ( ( ( rule__JSON_Object__OtherAssignment_2_1 ) ) )
            // InternalJsonDsl.g:997:1: ( ( rule__JSON_Object__OtherAssignment_2_1 ) )
            {
            // InternalJsonDsl.g:997:1: ( ( rule__JSON_Object__OtherAssignment_2_1 ) )
            // InternalJsonDsl.g:998:2: ( rule__JSON_Object__OtherAssignment_2_1 )
            {
             before(grammarAccess.getJSON_ObjectAccess().getOtherAssignment_2_1()); 
            // InternalJsonDsl.g:999:2: ( rule__JSON_Object__OtherAssignment_2_1 )
            // InternalJsonDsl.g:999:3: rule__JSON_Object__OtherAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__JSON_Object__OtherAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getJSON_ObjectAccess().getOtherAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSON_Object__Group_2__1__Impl"


    // $ANTLR start "rule__JSON_Document__Json_valueAssignment"
    // InternalJsonDsl.g:1008:1: rule__JSON_Document__Json_valueAssignment : ( ruleJSON_Value ) ;
    public final void rule__JSON_Document__Json_valueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonDsl.g:1012:1: ( ( ruleJSON_Value ) )
            // InternalJsonDsl.g:1013:2: ( ruleJSON_Value )
            {
            // InternalJsonDsl.g:1013:2: ( ruleJSON_Value )
            // InternalJsonDsl.g:1014:3: ruleJSON_Value
            {
             before(grammarAccess.getJSON_DocumentAccess().getJson_valueJSON_ValueParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleJSON_Value();

            state._fsp--;

             after(grammarAccess.getJSON_DocumentAccess().getJson_valueJSON_ValueParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSON_Document__Json_valueAssignment"


    // $ANTLR start "rule__JSON_Value__Json_valueAssignment"
    // InternalJsonDsl.g:1023:1: rule__JSON_Value__Json_valueAssignment : ( ( rule__JSON_Value__Json_valueAlternatives_0 ) ) ;
    public final void rule__JSON_Value__Json_valueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonDsl.g:1027:1: ( ( ( rule__JSON_Value__Json_valueAlternatives_0 ) ) )
            // InternalJsonDsl.g:1028:2: ( ( rule__JSON_Value__Json_valueAlternatives_0 ) )
            {
            // InternalJsonDsl.g:1028:2: ( ( rule__JSON_Value__Json_valueAlternatives_0 ) )
            // InternalJsonDsl.g:1029:3: ( rule__JSON_Value__Json_valueAlternatives_0 )
            {
             before(grammarAccess.getJSON_ValueAccess().getJson_valueAlternatives_0()); 
            // InternalJsonDsl.g:1030:3: ( rule__JSON_Value__Json_valueAlternatives_0 )
            // InternalJsonDsl.g:1030:4: rule__JSON_Value__Json_valueAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__JSON_Value__Json_valueAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getJSON_ValueAccess().getJson_valueAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSON_Value__Json_valueAssignment"


    // $ANTLR start "rule__JSON_Array__FirstAssignment_1"
    // InternalJsonDsl.g:1038:1: rule__JSON_Array__FirstAssignment_1 : ( ruleJSON_Value ) ;
    public final void rule__JSON_Array__FirstAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonDsl.g:1042:1: ( ( ruleJSON_Value ) )
            // InternalJsonDsl.g:1043:2: ( ruleJSON_Value )
            {
            // InternalJsonDsl.g:1043:2: ( ruleJSON_Value )
            // InternalJsonDsl.g:1044:3: ruleJSON_Value
            {
             before(grammarAccess.getJSON_ArrayAccess().getFirstJSON_ValueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleJSON_Value();

            state._fsp--;

             after(grammarAccess.getJSON_ArrayAccess().getFirstJSON_ValueParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSON_Array__FirstAssignment_1"


    // $ANTLR start "rule__JSON_Array__OtherAssignment_2_1"
    // InternalJsonDsl.g:1053:1: rule__JSON_Array__OtherAssignment_2_1 : ( ruleJSON_Value ) ;
    public final void rule__JSON_Array__OtherAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonDsl.g:1057:1: ( ( ruleJSON_Value ) )
            // InternalJsonDsl.g:1058:2: ( ruleJSON_Value )
            {
            // InternalJsonDsl.g:1058:2: ( ruleJSON_Value )
            // InternalJsonDsl.g:1059:3: ruleJSON_Value
            {
             before(grammarAccess.getJSON_ArrayAccess().getOtherJSON_ValueParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleJSON_Value();

            state._fsp--;

             after(grammarAccess.getJSON_ArrayAccess().getOtherJSON_ValueParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSON_Array__OtherAssignment_2_1"


    // $ANTLR start "rule__JSON_String__Json_stringAssignment"
    // InternalJsonDsl.g:1068:1: rule__JSON_String__Json_stringAssignment : ( RULE_STRING ) ;
    public final void rule__JSON_String__Json_stringAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonDsl.g:1072:1: ( ( RULE_STRING ) )
            // InternalJsonDsl.g:1073:2: ( RULE_STRING )
            {
            // InternalJsonDsl.g:1073:2: ( RULE_STRING )
            // InternalJsonDsl.g:1074:3: RULE_STRING
            {
             before(grammarAccess.getJSON_StringAccess().getJson_stringSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getJSON_StringAccess().getJson_stringSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSON_String__Json_stringAssignment"


    // $ANTLR start "rule__JSON_Boolean__Json_booleanAssignment"
    // InternalJsonDsl.g:1083:1: rule__JSON_Boolean__Json_booleanAssignment : ( ( rule__JSON_Boolean__Json_booleanAlternatives_0 ) ) ;
    public final void rule__JSON_Boolean__Json_booleanAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonDsl.g:1087:1: ( ( ( rule__JSON_Boolean__Json_booleanAlternatives_0 ) ) )
            // InternalJsonDsl.g:1088:2: ( ( rule__JSON_Boolean__Json_booleanAlternatives_0 ) )
            {
            // InternalJsonDsl.g:1088:2: ( ( rule__JSON_Boolean__Json_booleanAlternatives_0 ) )
            // InternalJsonDsl.g:1089:3: ( rule__JSON_Boolean__Json_booleanAlternatives_0 )
            {
             before(grammarAccess.getJSON_BooleanAccess().getJson_booleanAlternatives_0()); 
            // InternalJsonDsl.g:1090:3: ( rule__JSON_Boolean__Json_booleanAlternatives_0 )
            // InternalJsonDsl.g:1090:4: rule__JSON_Boolean__Json_booleanAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__JSON_Boolean__Json_booleanAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getJSON_BooleanAccess().getJson_booleanAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSON_Boolean__Json_booleanAssignment"


    // $ANTLR start "rule__JSON_Number__ZahlAssignment_1"
    // InternalJsonDsl.g:1098:1: rule__JSON_Number__ZahlAssignment_1 : ( RULE_INT ) ;
    public final void rule__JSON_Number__ZahlAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonDsl.g:1102:1: ( ( RULE_INT ) )
            // InternalJsonDsl.g:1103:2: ( RULE_INT )
            {
            // InternalJsonDsl.g:1103:2: ( RULE_INT )
            // InternalJsonDsl.g:1104:3: RULE_INT
            {
             before(grammarAccess.getJSON_NumberAccess().getZahlINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getJSON_NumberAccess().getZahlINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSON_Number__ZahlAssignment_1"


    // $ANTLR start "rule__JSON_Number__KommaAssignment_2_1"
    // InternalJsonDsl.g:1113:1: rule__JSON_Number__KommaAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__JSON_Number__KommaAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonDsl.g:1117:1: ( ( RULE_INT ) )
            // InternalJsonDsl.g:1118:2: ( RULE_INT )
            {
            // InternalJsonDsl.g:1118:2: ( RULE_INT )
            // InternalJsonDsl.g:1119:3: RULE_INT
            {
             before(grammarAccess.getJSON_NumberAccess().getKommaINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getJSON_NumberAccess().getKommaINTTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSON_Number__KommaAssignment_2_1"


    // $ANTLR start "rule__JSON_Number__ExpoAssignment_3_2"
    // InternalJsonDsl.g:1128:1: rule__JSON_Number__ExpoAssignment_3_2 : ( RULE_INT ) ;
    public final void rule__JSON_Number__ExpoAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonDsl.g:1132:1: ( ( RULE_INT ) )
            // InternalJsonDsl.g:1133:2: ( RULE_INT )
            {
            // InternalJsonDsl.g:1133:2: ( RULE_INT )
            // InternalJsonDsl.g:1134:3: RULE_INT
            {
             before(grammarAccess.getJSON_NumberAccess().getExpoINTTerminalRuleCall_3_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getJSON_NumberAccess().getExpoINTTerminalRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSON_Number__ExpoAssignment_3_2"


    // $ANTLR start "rule__JSON_Member__Json_memberAssignment_0"
    // InternalJsonDsl.g:1143:1: rule__JSON_Member__Json_memberAssignment_0 : ( ruleJSON_String ) ;
    public final void rule__JSON_Member__Json_memberAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonDsl.g:1147:1: ( ( ruleJSON_String ) )
            // InternalJsonDsl.g:1148:2: ( ruleJSON_String )
            {
            // InternalJsonDsl.g:1148:2: ( ruleJSON_String )
            // InternalJsonDsl.g:1149:3: ruleJSON_String
            {
             before(grammarAccess.getJSON_MemberAccess().getJson_memberJSON_StringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleJSON_String();

            state._fsp--;

             after(grammarAccess.getJSON_MemberAccess().getJson_memberJSON_StringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSON_Member__Json_memberAssignment_0"


    // $ANTLR start "rule__JSON_Member__Json_valueAssignment_2"
    // InternalJsonDsl.g:1158:1: rule__JSON_Member__Json_valueAssignment_2 : ( ruleJSON_Value ) ;
    public final void rule__JSON_Member__Json_valueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonDsl.g:1162:1: ( ( ruleJSON_Value ) )
            // InternalJsonDsl.g:1163:2: ( ruleJSON_Value )
            {
            // InternalJsonDsl.g:1163:2: ( ruleJSON_Value )
            // InternalJsonDsl.g:1164:3: ruleJSON_Value
            {
             before(grammarAccess.getJSON_MemberAccess().getJson_valueJSON_ValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleJSON_Value();

            state._fsp--;

             after(grammarAccess.getJSON_MemberAccess().getJson_valueJSON_ValueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSON_Member__Json_valueAssignment_2"


    // $ANTLR start "rule__JSON_Object__FirstAssignment_1"
    // InternalJsonDsl.g:1173:1: rule__JSON_Object__FirstAssignment_1 : ( ruleJSON_Member ) ;
    public final void rule__JSON_Object__FirstAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonDsl.g:1177:1: ( ( ruleJSON_Member ) )
            // InternalJsonDsl.g:1178:2: ( ruleJSON_Member )
            {
            // InternalJsonDsl.g:1178:2: ( ruleJSON_Member )
            // InternalJsonDsl.g:1179:3: ruleJSON_Member
            {
             before(grammarAccess.getJSON_ObjectAccess().getFirstJSON_MemberParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleJSON_Member();

            state._fsp--;

             after(grammarAccess.getJSON_ObjectAccess().getFirstJSON_MemberParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSON_Object__FirstAssignment_1"


    // $ANTLR start "rule__JSON_Object__OtherAssignment_2_1"
    // InternalJsonDsl.g:1188:1: rule__JSON_Object__OtherAssignment_2_1 : ( ruleJSON_Member ) ;
    public final void rule__JSON_Object__OtherAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalJsonDsl.g:1192:1: ( ( ruleJSON_Member ) )
            // InternalJsonDsl.g:1193:2: ( ruleJSON_Member )
            {
            // InternalJsonDsl.g:1193:2: ( ruleJSON_Member )
            // InternalJsonDsl.g:1194:3: ruleJSON_Member
            {
             before(grammarAccess.getJSON_ObjectAccess().getOtherJSON_MemberParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleJSON_Member();

            state._fsp--;

             after(grammarAccess.getJSON_ObjectAccess().getOtherJSON_MemberParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JSON_Object__OtherAssignment_2_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000A5F830L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000021C020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000030020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001100000L});

}