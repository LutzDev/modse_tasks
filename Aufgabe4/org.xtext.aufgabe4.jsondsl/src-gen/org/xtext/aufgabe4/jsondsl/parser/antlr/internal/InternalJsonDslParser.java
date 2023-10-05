package org.xtext.aufgabe4.jsondsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.aufgabe4.jsondsl.services.JsonDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJsonDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'['", "','", "']'", "'true'", "'false'", "'null'", "'-'", "'.'", "'E'", "'e'", "'+'", "':'", "'{'", "'}'"
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

        public InternalJsonDslParser(TokenStream input, JsonDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "JSON_Document";
       	}

       	@Override
       	protected JsonDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleJSON_Document"
    // InternalJsonDsl.g:64:1: entryRuleJSON_Document returns [EObject current=null] : iv_ruleJSON_Document= ruleJSON_Document EOF ;
    public final EObject entryRuleJSON_Document() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJSON_Document = null;


        try {
            // InternalJsonDsl.g:64:54: (iv_ruleJSON_Document= ruleJSON_Document EOF )
            // InternalJsonDsl.g:65:2: iv_ruleJSON_Document= ruleJSON_Document EOF
            {
             newCompositeNode(grammarAccess.getJSON_DocumentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJSON_Document=ruleJSON_Document();

            state._fsp--;

             current =iv_ruleJSON_Document; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJSON_Document"


    // $ANTLR start "ruleJSON_Document"
    // InternalJsonDsl.g:71:1: ruleJSON_Document returns [EObject current=null] : ( (lv_json_value_0_0= ruleJSON_Value ) ) ;
    public final EObject ruleJSON_Document() throws RecognitionException {
        EObject current = null;

        EObject lv_json_value_0_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:77:2: ( ( (lv_json_value_0_0= ruleJSON_Value ) ) )
            // InternalJsonDsl.g:78:2: ( (lv_json_value_0_0= ruleJSON_Value ) )
            {
            // InternalJsonDsl.g:78:2: ( (lv_json_value_0_0= ruleJSON_Value ) )
            // InternalJsonDsl.g:79:3: (lv_json_value_0_0= ruleJSON_Value )
            {
            // InternalJsonDsl.g:79:3: (lv_json_value_0_0= ruleJSON_Value )
            // InternalJsonDsl.g:80:4: lv_json_value_0_0= ruleJSON_Value
            {

            				newCompositeNode(grammarAccess.getJSON_DocumentAccess().getJson_valueJSON_ValueParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_json_value_0_0=ruleJSON_Value();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getJSON_DocumentRule());
            				}
            				set(
            					current,
            					"json_value",
            					lv_json_value_0_0,
            					"org.xtext.aufgabe4.jsondsl.JsonDsl.JSON_Value");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJSON_Document"


    // $ANTLR start "entryRuleJSON_Value"
    // InternalJsonDsl.g:100:1: entryRuleJSON_Value returns [EObject current=null] : iv_ruleJSON_Value= ruleJSON_Value EOF ;
    public final EObject entryRuleJSON_Value() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJSON_Value = null;


        try {
            // InternalJsonDsl.g:100:51: (iv_ruleJSON_Value= ruleJSON_Value EOF )
            // InternalJsonDsl.g:101:2: iv_ruleJSON_Value= ruleJSON_Value EOF
            {
             newCompositeNode(grammarAccess.getJSON_ValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJSON_Value=ruleJSON_Value();

            state._fsp--;

             current =iv_ruleJSON_Value; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJSON_Value"


    // $ANTLR start "ruleJSON_Value"
    // InternalJsonDsl.g:107:1: ruleJSON_Value returns [EObject current=null] : ( ( (lv_json_value_0_1= ruleJSON_Array | lv_json_value_0_2= ruleJSON_String | lv_json_value_0_3= ruleJSON_Boolean | lv_json_value_0_4= ruleJSON_Number | lv_json_value_0_5= ruleJSON_Object ) ) ) ;
    public final EObject ruleJSON_Value() throws RecognitionException {
        EObject current = null;

        EObject lv_json_value_0_1 = null;

        EObject lv_json_value_0_2 = null;

        EObject lv_json_value_0_3 = null;

        EObject lv_json_value_0_4 = null;

        EObject lv_json_value_0_5 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:113:2: ( ( ( (lv_json_value_0_1= ruleJSON_Array | lv_json_value_0_2= ruleJSON_String | lv_json_value_0_3= ruleJSON_Boolean | lv_json_value_0_4= ruleJSON_Number | lv_json_value_0_5= ruleJSON_Object ) ) ) )
            // InternalJsonDsl.g:114:2: ( ( (lv_json_value_0_1= ruleJSON_Array | lv_json_value_0_2= ruleJSON_String | lv_json_value_0_3= ruleJSON_Boolean | lv_json_value_0_4= ruleJSON_Number | lv_json_value_0_5= ruleJSON_Object ) ) )
            {
            // InternalJsonDsl.g:114:2: ( ( (lv_json_value_0_1= ruleJSON_Array | lv_json_value_0_2= ruleJSON_String | lv_json_value_0_3= ruleJSON_Boolean | lv_json_value_0_4= ruleJSON_Number | lv_json_value_0_5= ruleJSON_Object ) ) )
            // InternalJsonDsl.g:115:3: ( (lv_json_value_0_1= ruleJSON_Array | lv_json_value_0_2= ruleJSON_String | lv_json_value_0_3= ruleJSON_Boolean | lv_json_value_0_4= ruleJSON_Number | lv_json_value_0_5= ruleJSON_Object ) )
            {
            // InternalJsonDsl.g:115:3: ( (lv_json_value_0_1= ruleJSON_Array | lv_json_value_0_2= ruleJSON_String | lv_json_value_0_3= ruleJSON_Boolean | lv_json_value_0_4= ruleJSON_Number | lv_json_value_0_5= ruleJSON_Object ) )
            // InternalJsonDsl.g:116:4: (lv_json_value_0_1= ruleJSON_Array | lv_json_value_0_2= ruleJSON_String | lv_json_value_0_3= ruleJSON_Boolean | lv_json_value_0_4= ruleJSON_Number | lv_json_value_0_5= ruleJSON_Object )
            {
            // InternalJsonDsl.g:116:4: (lv_json_value_0_1= ruleJSON_Array | lv_json_value_0_2= ruleJSON_String | lv_json_value_0_3= ruleJSON_Boolean | lv_json_value_0_4= ruleJSON_Number | lv_json_value_0_5= ruleJSON_Object )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case RULE_STRING:
                {
                alt1=2;
                }
                break;
            case 14:
            case 15:
            case 16:
                {
                alt1=3;
                }
                break;
            case EOF:
            case RULE_INT:
            case 12:
            case 13:
            case 17:
            case 18:
            case 19:
            case 20:
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
                    // InternalJsonDsl.g:117:5: lv_json_value_0_1= ruleJSON_Array
                    {

                    					newCompositeNode(grammarAccess.getJSON_ValueAccess().getJson_valueJSON_ArrayParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_json_value_0_1=ruleJSON_Array();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getJSON_ValueRule());
                    					}
                    					set(
                    						current,
                    						"json_value",
                    						lv_json_value_0_1,
                    						"org.xtext.aufgabe4.jsondsl.JsonDsl.JSON_Array");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 2 :
                    // InternalJsonDsl.g:133:5: lv_json_value_0_2= ruleJSON_String
                    {

                    					newCompositeNode(grammarAccess.getJSON_ValueAccess().getJson_valueJSON_StringParserRuleCall_0_1());
                    				
                    pushFollow(FOLLOW_2);
                    lv_json_value_0_2=ruleJSON_String();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getJSON_ValueRule());
                    					}
                    					set(
                    						current,
                    						"json_value",
                    						lv_json_value_0_2,
                    						"org.xtext.aufgabe4.jsondsl.JsonDsl.JSON_String");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 3 :
                    // InternalJsonDsl.g:149:5: lv_json_value_0_3= ruleJSON_Boolean
                    {

                    					newCompositeNode(grammarAccess.getJSON_ValueAccess().getJson_valueJSON_BooleanParserRuleCall_0_2());
                    				
                    pushFollow(FOLLOW_2);
                    lv_json_value_0_3=ruleJSON_Boolean();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getJSON_ValueRule());
                    					}
                    					set(
                    						current,
                    						"json_value",
                    						lv_json_value_0_3,
                    						"org.xtext.aufgabe4.jsondsl.JsonDsl.JSON_Boolean");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 4 :
                    // InternalJsonDsl.g:165:5: lv_json_value_0_4= ruleJSON_Number
                    {

                    					newCompositeNode(grammarAccess.getJSON_ValueAccess().getJson_valueJSON_NumberParserRuleCall_0_3());
                    				
                    pushFollow(FOLLOW_2);
                    lv_json_value_0_4=ruleJSON_Number();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getJSON_ValueRule());
                    					}
                    					set(
                    						current,
                    						"json_value",
                    						lv_json_value_0_4,
                    						"org.xtext.aufgabe4.jsondsl.JsonDsl.JSON_Number");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;
                case 5 :
                    // InternalJsonDsl.g:181:5: lv_json_value_0_5= ruleJSON_Object
                    {

                    					newCompositeNode(grammarAccess.getJSON_ValueAccess().getJson_valueJSON_ObjectParserRuleCall_0_4());
                    				
                    pushFollow(FOLLOW_2);
                    lv_json_value_0_5=ruleJSON_Object();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getJSON_ValueRule());
                    					}
                    					set(
                    						current,
                    						"json_value",
                    						lv_json_value_0_5,
                    						"org.xtext.aufgabe4.jsondsl.JsonDsl.JSON_Object");
                    					afterParserOrEnumRuleCall();
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJSON_Value"


    // $ANTLR start "entryRuleJSON_Array"
    // InternalJsonDsl.g:202:1: entryRuleJSON_Array returns [EObject current=null] : iv_ruleJSON_Array= ruleJSON_Array EOF ;
    public final EObject entryRuleJSON_Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJSON_Array = null;


        try {
            // InternalJsonDsl.g:202:51: (iv_ruleJSON_Array= ruleJSON_Array EOF )
            // InternalJsonDsl.g:203:2: iv_ruleJSON_Array= ruleJSON_Array EOF
            {
             newCompositeNode(grammarAccess.getJSON_ArrayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJSON_Array=ruleJSON_Array();

            state._fsp--;

             current =iv_ruleJSON_Array; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJSON_Array"


    // $ANTLR start "ruleJSON_Array"
    // InternalJsonDsl.g:209:1: ruleJSON_Array returns [EObject current=null] : (otherlv_0= '[' ( (lv_first_1_0= ruleJSON_Value ) ) (otherlv_2= ',' ( (lv_other_3_0= ruleJSON_Value ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleJSON_Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_first_1_0 = null;

        EObject lv_other_3_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:215:2: ( (otherlv_0= '[' ( (lv_first_1_0= ruleJSON_Value ) ) (otherlv_2= ',' ( (lv_other_3_0= ruleJSON_Value ) ) )* otherlv_4= ']' ) )
            // InternalJsonDsl.g:216:2: (otherlv_0= '[' ( (lv_first_1_0= ruleJSON_Value ) ) (otherlv_2= ',' ( (lv_other_3_0= ruleJSON_Value ) ) )* otherlv_4= ']' )
            {
            // InternalJsonDsl.g:216:2: (otherlv_0= '[' ( (lv_first_1_0= ruleJSON_Value ) ) (otherlv_2= ',' ( (lv_other_3_0= ruleJSON_Value ) ) )* otherlv_4= ']' )
            // InternalJsonDsl.g:217:3: otherlv_0= '[' ( (lv_first_1_0= ruleJSON_Value ) ) (otherlv_2= ',' ( (lv_other_3_0= ruleJSON_Value ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getJSON_ArrayAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalJsonDsl.g:221:3: ( (lv_first_1_0= ruleJSON_Value ) )
            // InternalJsonDsl.g:222:4: (lv_first_1_0= ruleJSON_Value )
            {
            // InternalJsonDsl.g:222:4: (lv_first_1_0= ruleJSON_Value )
            // InternalJsonDsl.g:223:5: lv_first_1_0= ruleJSON_Value
            {

            					newCompositeNode(grammarAccess.getJSON_ArrayAccess().getFirstJSON_ValueParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_first_1_0=ruleJSON_Value();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJSON_ArrayRule());
            					}
            					set(
            						current,
            						"first",
            						lv_first_1_0,
            						"org.xtext.aufgabe4.jsondsl.JsonDsl.JSON_Value");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJsonDsl.g:240:3: (otherlv_2= ',' ( (lv_other_3_0= ruleJSON_Value ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalJsonDsl.g:241:4: otherlv_2= ',' ( (lv_other_3_0= ruleJSON_Value ) )
            	    {
            	    otherlv_2=(Token)match(input,12,FOLLOW_3); 

            	    				newLeafNode(otherlv_2, grammarAccess.getJSON_ArrayAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalJsonDsl.g:245:4: ( (lv_other_3_0= ruleJSON_Value ) )
            	    // InternalJsonDsl.g:246:5: (lv_other_3_0= ruleJSON_Value )
            	    {
            	    // InternalJsonDsl.g:246:5: (lv_other_3_0= ruleJSON_Value )
            	    // InternalJsonDsl.g:247:6: lv_other_3_0= ruleJSON_Value
            	    {

            	    						newCompositeNode(grammarAccess.getJSON_ArrayAccess().getOtherJSON_ValueParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_other_3_0=ruleJSON_Value();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getJSON_ArrayRule());
            	    						}
            	    						add(
            	    							current,
            	    							"other",
            	    							lv_other_3_0,
            	    							"org.xtext.aufgabe4.jsondsl.JsonDsl.JSON_Value");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getJSON_ArrayAccess().getRightSquareBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJSON_Array"


    // $ANTLR start "entryRuleJSON_String"
    // InternalJsonDsl.g:273:1: entryRuleJSON_String returns [EObject current=null] : iv_ruleJSON_String= ruleJSON_String EOF ;
    public final EObject entryRuleJSON_String() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJSON_String = null;


        try {
            // InternalJsonDsl.g:273:52: (iv_ruleJSON_String= ruleJSON_String EOF )
            // InternalJsonDsl.g:274:2: iv_ruleJSON_String= ruleJSON_String EOF
            {
             newCompositeNode(grammarAccess.getJSON_StringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJSON_String=ruleJSON_String();

            state._fsp--;

             current =iv_ruleJSON_String; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJSON_String"


    // $ANTLR start "ruleJSON_String"
    // InternalJsonDsl.g:280:1: ruleJSON_String returns [EObject current=null] : ( (lv_json_string_0_0= RULE_STRING ) ) ;
    public final EObject ruleJSON_String() throws RecognitionException {
        EObject current = null;

        Token lv_json_string_0_0=null;


        	enterRule();

        try {
            // InternalJsonDsl.g:286:2: ( ( (lv_json_string_0_0= RULE_STRING ) ) )
            // InternalJsonDsl.g:287:2: ( (lv_json_string_0_0= RULE_STRING ) )
            {
            // InternalJsonDsl.g:287:2: ( (lv_json_string_0_0= RULE_STRING ) )
            // InternalJsonDsl.g:288:3: (lv_json_string_0_0= RULE_STRING )
            {
            // InternalJsonDsl.g:288:3: (lv_json_string_0_0= RULE_STRING )
            // InternalJsonDsl.g:289:4: lv_json_string_0_0= RULE_STRING
            {
            lv_json_string_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_json_string_0_0, grammarAccess.getJSON_StringAccess().getJson_stringSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getJSON_StringRule());
            				}
            				setWithLastConsumed(
            					current,
            					"json_string",
            					lv_json_string_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJSON_String"


    // $ANTLR start "entryRuleJSON_Boolean"
    // InternalJsonDsl.g:308:1: entryRuleJSON_Boolean returns [EObject current=null] : iv_ruleJSON_Boolean= ruleJSON_Boolean EOF ;
    public final EObject entryRuleJSON_Boolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJSON_Boolean = null;


        try {
            // InternalJsonDsl.g:308:53: (iv_ruleJSON_Boolean= ruleJSON_Boolean EOF )
            // InternalJsonDsl.g:309:2: iv_ruleJSON_Boolean= ruleJSON_Boolean EOF
            {
             newCompositeNode(grammarAccess.getJSON_BooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJSON_Boolean=ruleJSON_Boolean();

            state._fsp--;

             current =iv_ruleJSON_Boolean; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJSON_Boolean"


    // $ANTLR start "ruleJSON_Boolean"
    // InternalJsonDsl.g:315:1: ruleJSON_Boolean returns [EObject current=null] : ( ( (lv_json_boolean_0_1= 'true' | lv_json_boolean_0_2= 'false' | lv_json_boolean_0_3= 'null' ) ) ) ;
    public final EObject ruleJSON_Boolean() throws RecognitionException {
        EObject current = null;

        Token lv_json_boolean_0_1=null;
        Token lv_json_boolean_0_2=null;
        Token lv_json_boolean_0_3=null;


        	enterRule();

        try {
            // InternalJsonDsl.g:321:2: ( ( ( (lv_json_boolean_0_1= 'true' | lv_json_boolean_0_2= 'false' | lv_json_boolean_0_3= 'null' ) ) ) )
            // InternalJsonDsl.g:322:2: ( ( (lv_json_boolean_0_1= 'true' | lv_json_boolean_0_2= 'false' | lv_json_boolean_0_3= 'null' ) ) )
            {
            // InternalJsonDsl.g:322:2: ( ( (lv_json_boolean_0_1= 'true' | lv_json_boolean_0_2= 'false' | lv_json_boolean_0_3= 'null' ) ) )
            // InternalJsonDsl.g:323:3: ( (lv_json_boolean_0_1= 'true' | lv_json_boolean_0_2= 'false' | lv_json_boolean_0_3= 'null' ) )
            {
            // InternalJsonDsl.g:323:3: ( (lv_json_boolean_0_1= 'true' | lv_json_boolean_0_2= 'false' | lv_json_boolean_0_3= 'null' ) )
            // InternalJsonDsl.g:324:4: (lv_json_boolean_0_1= 'true' | lv_json_boolean_0_2= 'false' | lv_json_boolean_0_3= 'null' )
            {
            // InternalJsonDsl.g:324:4: (lv_json_boolean_0_1= 'true' | lv_json_boolean_0_2= 'false' | lv_json_boolean_0_3= 'null' )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt3=1;
                }
                break;
            case 15:
                {
                alt3=2;
                }
                break;
            case 16:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalJsonDsl.g:325:5: lv_json_boolean_0_1= 'true'
                    {
                    lv_json_boolean_0_1=(Token)match(input,14,FOLLOW_2); 

                    					newLeafNode(lv_json_boolean_0_1, grammarAccess.getJSON_BooleanAccess().getJson_booleanTrueKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getJSON_BooleanRule());
                    					}
                    					setWithLastConsumed(current, "json_boolean", lv_json_boolean_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalJsonDsl.g:336:5: lv_json_boolean_0_2= 'false'
                    {
                    lv_json_boolean_0_2=(Token)match(input,15,FOLLOW_2); 

                    					newLeafNode(lv_json_boolean_0_2, grammarAccess.getJSON_BooleanAccess().getJson_booleanFalseKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getJSON_BooleanRule());
                    					}
                    					setWithLastConsumed(current, "json_boolean", lv_json_boolean_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalJsonDsl.g:347:5: lv_json_boolean_0_3= 'null'
                    {
                    lv_json_boolean_0_3=(Token)match(input,16,FOLLOW_2); 

                    					newLeafNode(lv_json_boolean_0_3, grammarAccess.getJSON_BooleanAccess().getJson_booleanNullKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getJSON_BooleanRule());
                    					}
                    					setWithLastConsumed(current, "json_boolean", lv_json_boolean_0_3, null);
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJSON_Boolean"


    // $ANTLR start "entryRuleJSON_Number"
    // InternalJsonDsl.g:363:1: entryRuleJSON_Number returns [EObject current=null] : iv_ruleJSON_Number= ruleJSON_Number EOF ;
    public final EObject entryRuleJSON_Number() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJSON_Number = null;


        try {
            // InternalJsonDsl.g:363:52: (iv_ruleJSON_Number= ruleJSON_Number EOF )
            // InternalJsonDsl.g:364:2: iv_ruleJSON_Number= ruleJSON_Number EOF
            {
             newCompositeNode(grammarAccess.getJSON_NumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJSON_Number=ruleJSON_Number();

            state._fsp--;

             current =iv_ruleJSON_Number; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJSON_Number"


    // $ANTLR start "ruleJSON_Number"
    // InternalJsonDsl.g:370:1: ruleJSON_Number returns [EObject current=null] : ( (otherlv_0= '-' )? ( (lv_zahl_1_0= RULE_INT ) )? (otherlv_2= '.' ( (lv_komma_3_0= RULE_INT ) ) )? ( (otherlv_4= 'E' | otherlv_5= 'e' ) (otherlv_6= '-' | otherlv_7= '+' )? ( (lv_expo_8_0= RULE_INT ) ) )? ) ;
    public final EObject ruleJSON_Number() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_zahl_1_0=null;
        Token otherlv_2=null;
        Token lv_komma_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_expo_8_0=null;


        	enterRule();

        try {
            // InternalJsonDsl.g:376:2: ( ( (otherlv_0= '-' )? ( (lv_zahl_1_0= RULE_INT ) )? (otherlv_2= '.' ( (lv_komma_3_0= RULE_INT ) ) )? ( (otherlv_4= 'E' | otherlv_5= 'e' ) (otherlv_6= '-' | otherlv_7= '+' )? ( (lv_expo_8_0= RULE_INT ) ) )? ) )
            // InternalJsonDsl.g:377:2: ( (otherlv_0= '-' )? ( (lv_zahl_1_0= RULE_INT ) )? (otherlv_2= '.' ( (lv_komma_3_0= RULE_INT ) ) )? ( (otherlv_4= 'E' | otherlv_5= 'e' ) (otherlv_6= '-' | otherlv_7= '+' )? ( (lv_expo_8_0= RULE_INT ) ) )? )
            {
            // InternalJsonDsl.g:377:2: ( (otherlv_0= '-' )? ( (lv_zahl_1_0= RULE_INT ) )? (otherlv_2= '.' ( (lv_komma_3_0= RULE_INT ) ) )? ( (otherlv_4= 'E' | otherlv_5= 'e' ) (otherlv_6= '-' | otherlv_7= '+' )? ( (lv_expo_8_0= RULE_INT ) ) )? )
            // InternalJsonDsl.g:378:3: (otherlv_0= '-' )? ( (lv_zahl_1_0= RULE_INT ) )? (otherlv_2= '.' ( (lv_komma_3_0= RULE_INT ) ) )? ( (otherlv_4= 'E' | otherlv_5= 'e' ) (otherlv_6= '-' | otherlv_7= '+' )? ( (lv_expo_8_0= RULE_INT ) ) )?
            {
            // InternalJsonDsl.g:378:3: (otherlv_0= '-' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalJsonDsl.g:379:4: otherlv_0= '-'
                    {
                    otherlv_0=(Token)match(input,17,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getJSON_NumberAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalJsonDsl.g:384:3: ( (lv_zahl_1_0= RULE_INT ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalJsonDsl.g:385:4: (lv_zahl_1_0= RULE_INT )
                    {
                    // InternalJsonDsl.g:385:4: (lv_zahl_1_0= RULE_INT )
                    // InternalJsonDsl.g:386:5: lv_zahl_1_0= RULE_INT
                    {
                    lv_zahl_1_0=(Token)match(input,RULE_INT,FOLLOW_6); 

                    					newLeafNode(lv_zahl_1_0, grammarAccess.getJSON_NumberAccess().getZahlINTTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getJSON_NumberRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"zahl",
                    						lv_zahl_1_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

                    }


                    }
                    break;

            }

            // InternalJsonDsl.g:402:3: (otherlv_2= '.' ( (lv_komma_3_0= RULE_INT ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalJsonDsl.g:403:4: otherlv_2= '.' ( (lv_komma_3_0= RULE_INT ) )
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getJSON_NumberAccess().getFullStopKeyword_2_0());
                    			
                    // InternalJsonDsl.g:407:4: ( (lv_komma_3_0= RULE_INT ) )
                    // InternalJsonDsl.g:408:5: (lv_komma_3_0= RULE_INT )
                    {
                    // InternalJsonDsl.g:408:5: (lv_komma_3_0= RULE_INT )
                    // InternalJsonDsl.g:409:6: lv_komma_3_0= RULE_INT
                    {
                    lv_komma_3_0=(Token)match(input,RULE_INT,FOLLOW_8); 

                    						newLeafNode(lv_komma_3_0, grammarAccess.getJSON_NumberAccess().getKommaINTTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getJSON_NumberRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"komma",
                    							lv_komma_3_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJsonDsl.g:426:3: ( (otherlv_4= 'E' | otherlv_5= 'e' ) (otherlv_6= '-' | otherlv_7= '+' )? ( (lv_expo_8_0= RULE_INT ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=19 && LA9_0<=20)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalJsonDsl.g:427:4: (otherlv_4= 'E' | otherlv_5= 'e' ) (otherlv_6= '-' | otherlv_7= '+' )? ( (lv_expo_8_0= RULE_INT ) )
                    {
                    // InternalJsonDsl.g:427:4: (otherlv_4= 'E' | otherlv_5= 'e' )
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==19) ) {
                        alt7=1;
                    }
                    else if ( (LA7_0==20) ) {
                        alt7=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 0, input);

                        throw nvae;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalJsonDsl.g:428:5: otherlv_4= 'E'
                            {
                            otherlv_4=(Token)match(input,19,FOLLOW_9); 

                            					newLeafNode(otherlv_4, grammarAccess.getJSON_NumberAccess().getEKeyword_3_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalJsonDsl.g:433:5: otherlv_5= 'e'
                            {
                            otherlv_5=(Token)match(input,20,FOLLOW_9); 

                            					newLeafNode(otherlv_5, grammarAccess.getJSON_NumberAccess().getEKeyword_3_0_1());
                            				

                            }
                            break;

                    }

                    // InternalJsonDsl.g:438:4: (otherlv_6= '-' | otherlv_7= '+' )?
                    int alt8=3;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==17) ) {
                        alt8=1;
                    }
                    else if ( (LA8_0==21) ) {
                        alt8=2;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalJsonDsl.g:439:5: otherlv_6= '-'
                            {
                            otherlv_6=(Token)match(input,17,FOLLOW_7); 

                            					newLeafNode(otherlv_6, grammarAccess.getJSON_NumberAccess().getHyphenMinusKeyword_3_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalJsonDsl.g:444:5: otherlv_7= '+'
                            {
                            otherlv_7=(Token)match(input,21,FOLLOW_7); 

                            					newLeafNode(otherlv_7, grammarAccess.getJSON_NumberAccess().getPlusSignKeyword_3_1_1());
                            				

                            }
                            break;

                    }

                    // InternalJsonDsl.g:449:4: ( (lv_expo_8_0= RULE_INT ) )
                    // InternalJsonDsl.g:450:5: (lv_expo_8_0= RULE_INT )
                    {
                    // InternalJsonDsl.g:450:5: (lv_expo_8_0= RULE_INT )
                    // InternalJsonDsl.g:451:6: lv_expo_8_0= RULE_INT
                    {
                    lv_expo_8_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_expo_8_0, grammarAccess.getJSON_NumberAccess().getExpoINTTerminalRuleCall_3_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getJSON_NumberRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"expo",
                    							lv_expo_8_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJSON_Number"


    // $ANTLR start "entryRuleJSON_Member"
    // InternalJsonDsl.g:472:1: entryRuleJSON_Member returns [EObject current=null] : iv_ruleJSON_Member= ruleJSON_Member EOF ;
    public final EObject entryRuleJSON_Member() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJSON_Member = null;


        try {
            // InternalJsonDsl.g:472:52: (iv_ruleJSON_Member= ruleJSON_Member EOF )
            // InternalJsonDsl.g:473:2: iv_ruleJSON_Member= ruleJSON_Member EOF
            {
             newCompositeNode(grammarAccess.getJSON_MemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJSON_Member=ruleJSON_Member();

            state._fsp--;

             current =iv_ruleJSON_Member; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJSON_Member"


    // $ANTLR start "ruleJSON_Member"
    // InternalJsonDsl.g:479:1: ruleJSON_Member returns [EObject current=null] : ( ( (lv_json_member_0_0= ruleJSON_String ) ) otherlv_1= ':' ( (lv_json_value_2_0= ruleJSON_Value ) ) ) ;
    public final EObject ruleJSON_Member() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_json_member_0_0 = null;

        EObject lv_json_value_2_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:485:2: ( ( ( (lv_json_member_0_0= ruleJSON_String ) ) otherlv_1= ':' ( (lv_json_value_2_0= ruleJSON_Value ) ) ) )
            // InternalJsonDsl.g:486:2: ( ( (lv_json_member_0_0= ruleJSON_String ) ) otherlv_1= ':' ( (lv_json_value_2_0= ruleJSON_Value ) ) )
            {
            // InternalJsonDsl.g:486:2: ( ( (lv_json_member_0_0= ruleJSON_String ) ) otherlv_1= ':' ( (lv_json_value_2_0= ruleJSON_Value ) ) )
            // InternalJsonDsl.g:487:3: ( (lv_json_member_0_0= ruleJSON_String ) ) otherlv_1= ':' ( (lv_json_value_2_0= ruleJSON_Value ) )
            {
            // InternalJsonDsl.g:487:3: ( (lv_json_member_0_0= ruleJSON_String ) )
            // InternalJsonDsl.g:488:4: (lv_json_member_0_0= ruleJSON_String )
            {
            // InternalJsonDsl.g:488:4: (lv_json_member_0_0= ruleJSON_String )
            // InternalJsonDsl.g:489:5: lv_json_member_0_0= ruleJSON_String
            {

            					newCompositeNode(grammarAccess.getJSON_MemberAccess().getJson_memberJSON_StringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_10);
            lv_json_member_0_0=ruleJSON_String();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJSON_MemberRule());
            					}
            					set(
            						current,
            						"json_member",
            						lv_json_member_0_0,
            						"org.xtext.aufgabe4.jsondsl.JsonDsl.JSON_String");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getJSON_MemberAccess().getColonKeyword_1());
            		
            // InternalJsonDsl.g:510:3: ( (lv_json_value_2_0= ruleJSON_Value ) )
            // InternalJsonDsl.g:511:4: (lv_json_value_2_0= ruleJSON_Value )
            {
            // InternalJsonDsl.g:511:4: (lv_json_value_2_0= ruleJSON_Value )
            // InternalJsonDsl.g:512:5: lv_json_value_2_0= ruleJSON_Value
            {

            					newCompositeNode(grammarAccess.getJSON_MemberAccess().getJson_valueJSON_ValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_json_value_2_0=ruleJSON_Value();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJSON_MemberRule());
            					}
            					set(
            						current,
            						"json_value",
            						lv_json_value_2_0,
            						"org.xtext.aufgabe4.jsondsl.JsonDsl.JSON_Value");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJSON_Member"


    // $ANTLR start "entryRuleJSON_Object"
    // InternalJsonDsl.g:533:1: entryRuleJSON_Object returns [EObject current=null] : iv_ruleJSON_Object= ruleJSON_Object EOF ;
    public final EObject entryRuleJSON_Object() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJSON_Object = null;


        try {
            // InternalJsonDsl.g:533:52: (iv_ruleJSON_Object= ruleJSON_Object EOF )
            // InternalJsonDsl.g:534:2: iv_ruleJSON_Object= ruleJSON_Object EOF
            {
             newCompositeNode(grammarAccess.getJSON_ObjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJSON_Object=ruleJSON_Object();

            state._fsp--;

             current =iv_ruleJSON_Object; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJSON_Object"


    // $ANTLR start "ruleJSON_Object"
    // InternalJsonDsl.g:540:1: ruleJSON_Object returns [EObject current=null] : (otherlv_0= '{' ( (lv_first_1_0= ruleJSON_Member ) ) (otherlv_2= ',' ( (lv_other_3_0= ruleJSON_Member ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleJSON_Object() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_first_1_0 = null;

        EObject lv_other_3_0 = null;



        	enterRule();

        try {
            // InternalJsonDsl.g:546:2: ( (otherlv_0= '{' ( (lv_first_1_0= ruleJSON_Member ) ) (otherlv_2= ',' ( (lv_other_3_0= ruleJSON_Member ) ) )* otherlv_4= '}' ) )
            // InternalJsonDsl.g:547:2: (otherlv_0= '{' ( (lv_first_1_0= ruleJSON_Member ) ) (otherlv_2= ',' ( (lv_other_3_0= ruleJSON_Member ) ) )* otherlv_4= '}' )
            {
            // InternalJsonDsl.g:547:2: (otherlv_0= '{' ( (lv_first_1_0= ruleJSON_Member ) ) (otherlv_2= ',' ( (lv_other_3_0= ruleJSON_Member ) ) )* otherlv_4= '}' )
            // InternalJsonDsl.g:548:3: otherlv_0= '{' ( (lv_first_1_0= ruleJSON_Member ) ) (otherlv_2= ',' ( (lv_other_3_0= ruleJSON_Member ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getJSON_ObjectAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalJsonDsl.g:552:3: ( (lv_first_1_0= ruleJSON_Member ) )
            // InternalJsonDsl.g:553:4: (lv_first_1_0= ruleJSON_Member )
            {
            // InternalJsonDsl.g:553:4: (lv_first_1_0= ruleJSON_Member )
            // InternalJsonDsl.g:554:5: lv_first_1_0= ruleJSON_Member
            {

            					newCompositeNode(grammarAccess.getJSON_ObjectAccess().getFirstJSON_MemberParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_first_1_0=ruleJSON_Member();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJSON_ObjectRule());
            					}
            					set(
            						current,
            						"first",
            						lv_first_1_0,
            						"org.xtext.aufgabe4.jsondsl.JsonDsl.JSON_Member");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJsonDsl.g:571:3: (otherlv_2= ',' ( (lv_other_3_0= ruleJSON_Member ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==12) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalJsonDsl.g:572:4: otherlv_2= ',' ( (lv_other_3_0= ruleJSON_Member ) )
            	    {
            	    otherlv_2=(Token)match(input,12,FOLLOW_11); 

            	    				newLeafNode(otherlv_2, grammarAccess.getJSON_ObjectAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalJsonDsl.g:576:4: ( (lv_other_3_0= ruleJSON_Member ) )
            	    // InternalJsonDsl.g:577:5: (lv_other_3_0= ruleJSON_Member )
            	    {
            	    // InternalJsonDsl.g:577:5: (lv_other_3_0= ruleJSON_Member )
            	    // InternalJsonDsl.g:578:6: lv_other_3_0= ruleJSON_Member
            	    {

            	    						newCompositeNode(grammarAccess.getJSON_ObjectAccess().getOtherJSON_MemberParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_other_3_0=ruleJSON_Member();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getJSON_ObjectRule());
            	    						}
            	    						add(
            	    							current,
            	    							"other",
            	    							lv_other_3_0,
            	    							"org.xtext.aufgabe4.jsondsl.JsonDsl.JSON_Member");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_4=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getJSON_ObjectAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJSON_Object"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000009FC830L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000001C0022L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000001C0002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000220020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001001000L});

}