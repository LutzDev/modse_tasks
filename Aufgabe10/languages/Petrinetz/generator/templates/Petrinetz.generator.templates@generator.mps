<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:3d65810a-76f3-46a9-8a11-e10f509540b5(Petrinetz.generator.templates@generator)">
  <persistence version="9" />
  <languages>
    <use id="f3061a53-9226-4cc5-a443-f952ceaf5816" name="jetbrains.mps.baseLanguage" version="11" />
    <use id="b401a680-8325-4110-8fd3-84331ff25bef" name="jetbrains.mps.lang.generator" version="4" />
    <use id="f2801650-65d5-424e-bb1b-463a8781b786" name="jetbrains.mps.baseLanguage.javadoc" version="2" />
    <devkit ref="a2eb3a43-fcc2-4200-80dc-c60110c4862d(jetbrains.mps.devkit.templates)" />
  </languages>
  <imports>
    <import index="xful" ref="r:2823fc59-4fda-4dc8-9c31-04a97812e045(Petrinetz.structure)" />
    <import index="wyt6" ref="6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.lang(JDK/)" implicit="true" />
    <import index="guwi" ref="6354ebe7-c22a-4a0f-ac54-50b52ab9b065/java:java.io(JDK/)" implicit="true" />
    <import index="tpck" ref="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" implicit="true" />
  </imports>
  <registry>
    <language id="f3061a53-9226-4cc5-a443-f952ceaf5816" name="jetbrains.mps.baseLanguage">
      <concept id="1202948039474" name="jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation" flags="nn" index="liA8E" />
      <concept id="1465982738277781862" name="jetbrains.mps.baseLanguage.structure.PlaceholderMember" flags="nn" index="2tJIrI" />
      <concept id="1239714755177" name="jetbrains.mps.baseLanguage.structure.AbstractUnaryNumberOperation" flags="nn" index="2$Kvd9">
        <child id="1239714902950" name="expression" index="2$L3a6" />
      </concept>
      <concept id="1197027756228" name="jetbrains.mps.baseLanguage.structure.DotExpression" flags="nn" index="2OqwBi">
        <child id="1197027771414" name="operand" index="2Oq$k0" />
        <child id="1197027833540" name="operation" index="2OqNvi" />
      </concept>
      <concept id="1137021947720" name="jetbrains.mps.baseLanguage.structure.ConceptFunction" flags="in" index="2VMwT0">
        <child id="1137022507850" name="body" index="2VODD2" />
      </concept>
      <concept id="1070475926800" name="jetbrains.mps.baseLanguage.structure.StringLiteral" flags="nn" index="Xl_RD">
        <property id="1070475926801" name="value" index="Xl_RC" />
      </concept>
      <concept id="1081236700938" name="jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration" flags="ig" index="2YIFZL" />
      <concept id="1070533707846" name="jetbrains.mps.baseLanguage.structure.StaticFieldReference" flags="nn" index="10M0yZ">
        <reference id="1144433057691" name="classifier" index="1PxDUh" />
      </concept>
      <concept id="1070534370425" name="jetbrains.mps.baseLanguage.structure.IntegerType" flags="in" index="10Oyi0" />
      <concept id="1070534760951" name="jetbrains.mps.baseLanguage.structure.ArrayType" flags="in" index="10Q1$e">
        <child id="1070534760952" name="componentType" index="10Q1$1" />
      </concept>
      <concept id="1068390468198" name="jetbrains.mps.baseLanguage.structure.ClassConcept" flags="ig" index="312cEu" />
      <concept id="1068431474542" name="jetbrains.mps.baseLanguage.structure.VariableDeclaration" flags="ng" index="33uBYm">
        <child id="1068431790190" name="initializer" index="33vP2m" />
      </concept>
      <concept id="1068498886296" name="jetbrains.mps.baseLanguage.structure.VariableReference" flags="nn" index="37vLTw">
        <reference id="1068581517664" name="variableDeclaration" index="3cqZAo" />
      </concept>
      <concept id="1068498886292" name="jetbrains.mps.baseLanguage.structure.ParameterDeclaration" flags="ir" index="37vLTG" />
      <concept id="1225271177708" name="jetbrains.mps.baseLanguage.structure.StringType" flags="in" index="17QB3L" />
      <concept id="4972933694980447171" name="jetbrains.mps.baseLanguage.structure.BaseVariableDeclaration" flags="ng" index="19Szcq">
        <child id="5680397130376446158" name="type" index="1tU5fm" />
      </concept>
      <concept id="1068580123132" name="jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration" flags="ng" index="3clF44">
        <child id="1068580123133" name="returnType" index="3clF45" />
        <child id="1068580123134" name="parameter" index="3clF46" />
        <child id="1068580123135" name="body" index="3clF47" />
      </concept>
      <concept id="1068580123155" name="jetbrains.mps.baseLanguage.structure.ExpressionStatement" flags="nn" index="3clFbF">
        <child id="1068580123156" name="expression" index="3clFbG" />
      </concept>
      <concept id="1068580123157" name="jetbrains.mps.baseLanguage.structure.Statement" flags="nn" index="3clFbH" />
      <concept id="1068580123136" name="jetbrains.mps.baseLanguage.structure.StatementList" flags="sn" stub="5293379017992965193" index="3clFbS">
        <child id="1068581517665" name="statement" index="3cqZAp" />
      </concept>
      <concept id="1068580320020" name="jetbrains.mps.baseLanguage.structure.IntegerConstant" flags="nn" index="3cmrfG">
        <property id="1068580320021" name="value" index="3cmrfH" />
      </concept>
      <concept id="1068581242875" name="jetbrains.mps.baseLanguage.structure.PlusExpression" flags="nn" index="3cpWs3" />
      <concept id="1068581242864" name="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" flags="nn" index="3cpWs8">
        <child id="1068581242865" name="localVariableDeclaration" index="3cpWs9" />
      </concept>
      <concept id="1068581242863" name="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" flags="nr" index="3cpWsn" />
      <concept id="1068581517677" name="jetbrains.mps.baseLanguage.structure.VoidType" flags="in" index="3cqZAl" />
      <concept id="1204053956946" name="jetbrains.mps.baseLanguage.structure.IMethodCall" flags="ng" index="1ndlxa">
        <reference id="1068499141037" name="baseMethodDeclaration" index="37wK5l" />
        <child id="1068499141038" name="actualArgument" index="37wK5m" />
      </concept>
      <concept id="1107461130800" name="jetbrains.mps.baseLanguage.structure.Classifier" flags="ng" index="3pOWGL">
        <child id="5375687026011219971" name="member" index="jymVt" unordered="true" />
      </concept>
      <concept id="1081773326031" name="jetbrains.mps.baseLanguage.structure.BinaryOperation" flags="nn" index="3uHJSO">
        <child id="1081773367579" name="rightExpression" index="3uHU7w" />
        <child id="1081773367580" name="leftExpression" index="3uHU7B" />
      </concept>
      <concept id="1214918800624" name="jetbrains.mps.baseLanguage.structure.PostfixIncrementExpression" flags="nn" index="3uNrnE" />
      <concept id="1178549954367" name="jetbrains.mps.baseLanguage.structure.IVisible" flags="ng" index="1B3ioH">
        <child id="1178549979242" name="visibility" index="1B3o_S" />
      </concept>
      <concept id="1146644602865" name="jetbrains.mps.baseLanguage.structure.PublicVisibility" flags="nn" index="3Tm1VV" />
    </language>
    <language id="b401a680-8325-4110-8fd3-84331ff25bef" name="jetbrains.mps.lang.generator">
      <concept id="1095416546421" name="jetbrains.mps.lang.generator.structure.MappingConfiguration" flags="ig" index="bUwia">
        <child id="1200911492601" name="mappingLabel" index="2rTMjI" />
        <child id="1167514678247" name="rootMappingRule" index="3lj3bC" />
      </concept>
      <concept id="1168619357332" name="jetbrains.mps.lang.generator.structure.RootTemplateAnnotation" flags="lg" index="n94m4">
        <reference id="1168619429071" name="applicableConcept" index="n9lRv" />
      </concept>
      <concept id="1200911316486" name="jetbrains.mps.lang.generator.structure.MappingLabelDeclaration" flags="lg" index="2rT7sh" />
      <concept id="1167169188348" name="jetbrains.mps.lang.generator.structure.TemplateFunctionParameter_sourceNode" flags="nn" index="30H73N" />
      <concept id="1167169308231" name="jetbrains.mps.lang.generator.structure.BaseMappingRule" flags="ng" index="30H$t8">
        <reference id="1167169349424" name="applicableConcept" index="30HIoZ" />
      </concept>
      <concept id="1087833241328" name="jetbrains.mps.lang.generator.structure.PropertyMacro" flags="ln" index="17Uvod">
        <child id="1167756362303" name="propertyValueFunction" index="3zH0cK" />
      </concept>
      <concept id="1167514355419" name="jetbrains.mps.lang.generator.structure.Root_MappingRule" flags="lg" index="3lhOvk">
        <reference id="1167514355421" name="template" index="3lhOvi" />
      </concept>
      <concept id="1167756080639" name="jetbrains.mps.lang.generator.structure.PropertyMacro_GetPropertyValue" flags="in" index="3zFVjK" />
      <concept id="1167951910403" name="jetbrains.mps.lang.generator.structure.SourceSubstituteMacro_SourceNodesQuery" flags="in" index="3JmXsc" />
      <concept id="1118786554307" name="jetbrains.mps.lang.generator.structure.LoopMacro" flags="ln" index="1WS0z7">
        <child id="1167952069335" name="sourceNodesQuery" index="3Jn$fo" />
      </concept>
    </language>
    <language id="7866978e-a0f0-4cc7-81bc-4d213d9375e1" name="jetbrains.mps.lang.smodel">
      <concept id="1138056022639" name="jetbrains.mps.lang.smodel.structure.SPropertyAccess" flags="nn" index="3TrcHB">
        <reference id="1138056395725" name="property" index="3TsBF5" />
      </concept>
      <concept id="1138056282393" name="jetbrains.mps.lang.smodel.structure.SLinkListAccess" flags="nn" index="3Tsc0h">
        <reference id="1138056546658" name="link" index="3TtcxE" />
      </concept>
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1133920641626" name="jetbrains.mps.lang.core.structure.BaseConcept" flags="ng" index="2VYdi">
        <child id="5169995583184591170" name="smodelAttribute" index="lGtFl" />
      </concept>
      <concept id="3364660638048049750" name="jetbrains.mps.lang.core.structure.PropertyAttribute" flags="ng" index="A9Btg">
        <property id="1757699476691236117" name="name_DebugInfo" index="2qtEX9" />
        <property id="1341860900487648621" name="propertyId" index="P4ACc" />
      </concept>
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ng" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
  </registry>
  <node concept="bUwia" id="3xyw8AYHVoN">
    <property role="TrG5h" value="main" />
    <node concept="3lhOvk" id="3xyw8AYKYf$" role="3lj3bC">
      <ref role="30HIoZ" to="xful:5NPqCQTMT8m" resolve="Petrinetz" />
      <ref role="3lhOvi" node="3xyw8AYJcRc" resolve="map_Petrinetz" />
    </node>
    <node concept="2rT7sh" id="3xyw8AYLSW1" role="2rTMjI">
      <property role="TrG5h" value="test" />
    </node>
  </node>
  <node concept="312cEu" id="3xyw8AYJcRc">
    <property role="TrG5h" value="map_Petrinetz" />
    <node concept="2tJIrI" id="3xyw8AYMgSb" role="jymVt" />
    <node concept="2tJIrI" id="3xyw8AYMgm9" role="jymVt" />
    <node concept="2YIFZL" id="3xyw8AYLB5G" role="jymVt">
      <property role="TrG5h" value="main" />
      <node concept="3clFbS" id="3xyw8AYJcS9" role="3clF47">
        <node concept="3clFbF" id="3xyw8AYJd0W" role="3cqZAp">
          <node concept="2OqwBi" id="3xyw8AYJdph" role="3clFbG">
            <node concept="10M0yZ" id="3xyw8AYJd1O" role="2Oq$k0">
              <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
              <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
            </node>
            <node concept="liA8E" id="3xyw8AYJdK9" role="2OqNvi">
              <ref role="37wK5l" to="guwi:~PrintStream.println(java.lang.String)" resolve="println" />
              <node concept="Xl_RD" id="3xyw8AYJdL$" role="37wK5m">
                <property role="Xl_RC" value="Starting ..." />
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbH" id="3xyw8AYLAnh" role="3cqZAp" />
        <node concept="3cpWs8" id="3xyw8AYMEc2" role="3cqZAp">
          <node concept="3cpWsn" id="3xyw8AYMEc5" role="3cpWs9">
            <property role="TrG5h" value="stellenCount" />
            <node concept="10Oyi0" id="3xyw8AYMEc0" role="1tU5fm" />
            <node concept="3cmrfG" id="3xyw8AYMEo9" role="33vP2m">
              <property role="3cmrfH" value="0" />
            </node>
          </node>
        </node>
        <node concept="3cpWs8" id="3xyw8AYMDsR" role="3cqZAp">
          <node concept="3cpWsn" id="3xyw8AYMDsU" role="3cpWs9">
            <property role="TrG5h" value="transitionenCount" />
            <node concept="10Oyi0" id="3xyw8AYMDsP" role="1tU5fm" />
            <node concept="3cmrfG" id="3xyw8AYMDZu" role="33vP2m">
              <property role="3cmrfH" value="0" />
            </node>
          </node>
        </node>
        <node concept="3clFbH" id="3xyw8AYMEps" role="3cqZAp" />
        <node concept="3clFbF" id="3xyw8AYMErG" role="3cqZAp">
          <node concept="3uNrnE" id="3xyw8AYMF8X" role="3clFbG">
            <node concept="37vLTw" id="3xyw8AYMF8Z" role="2$L3a6">
              <ref role="3cqZAo" node="3xyw8AYMEc5" resolve="stellenCount" />
            </node>
          </node>
          <node concept="1WS0z7" id="3xyw8AYMFnA" role="lGtFl">
            <node concept="3JmXsc" id="3xyw8AYMFnD" role="3Jn$fo">
              <node concept="3clFbS" id="3xyw8AYMFnE" role="2VODD2">
                <node concept="3clFbF" id="3xyw8AYMFnK" role="3cqZAp">
                  <node concept="2OqwBi" id="3xyw8AYMFnF" role="3clFbG">
                    <node concept="3Tsc0h" id="3xyw8AYMFnI" role="2OqNvi">
                      <ref role="3TtcxE" to="xful:5NPqCQTMT8t" resolve="stellen" />
                    </node>
                    <node concept="30H73N" id="3xyw8AYMFnJ" role="2Oq$k0" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="3xyw8AYMG69" role="3cqZAp">
          <node concept="3uNrnE" id="3xyw8AYMGQb" role="3clFbG">
            <node concept="37vLTw" id="3xyw8AYMGQd" role="2$L3a6">
              <ref role="3cqZAo" node="3xyw8AYMDsU" resolve="transitionenCount" />
            </node>
          </node>
          <node concept="1WS0z7" id="3xyw8AYMH5R" role="lGtFl">
            <node concept="3JmXsc" id="3xyw8AYMH5U" role="3Jn$fo">
              <node concept="3clFbS" id="3xyw8AYMH5V" role="2VODD2">
                <node concept="3clFbF" id="3xyw8AYMH61" role="3cqZAp">
                  <node concept="2OqwBi" id="3xyw8AYMH5W" role="3clFbG">
                    <node concept="3Tsc0h" id="3xyw8AYMH5Z" role="2OqNvi">
                      <ref role="3TtcxE" to="xful:5NPqCQTMT8u" resolve="transitionen" />
                    </node>
                    <node concept="30H73N" id="3xyw8AYMH60" role="2Oq$k0" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbH" id="3xyw8AYML0G" role="3cqZAp" />
        <node concept="3clFbF" id="3xyw8AYML90" role="3cqZAp">
          <node concept="2OqwBi" id="3xyw8AYMLBW" role="3clFbG">
            <node concept="10M0yZ" id="3xyw8AYMLdc" role="2Oq$k0">
              <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
              <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
            </node>
            <node concept="liA8E" id="3xyw8AYMM25" role="2OqNvi">
              <ref role="37wK5l" to="guwi:~PrintStream.println(java.lang.String)" resolve="println" />
              <node concept="3cpWs3" id="3xyw8AYMO$N" role="37wK5m">
                <node concept="Xl_RD" id="3xyw8AYMOEs" role="3uHU7w">
                  <property role="Xl_RC" value="Stellencount" />
                </node>
                <node concept="37vLTw" id="3xyw8AYMMvO" role="3uHU7B">
                  <ref role="3cqZAo" node="3xyw8AYMEc5" resolve="stellenCount" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="3clFbF" id="3xyw8AYMHe8" role="3cqZAp">
          <node concept="2OqwBi" id="3xyw8AYMHF0" role="3clFbG">
            <node concept="10M0yZ" id="3xyw8AYMHhi" role="2Oq$k0">
              <ref role="3cqZAo" to="wyt6:~System.out" resolve="out" />
              <ref role="1PxDUh" to="wyt6:~System" resolve="System" />
            </node>
            <node concept="liA8E" id="3xyw8AYMI52" role="2OqNvi">
              <ref role="37wK5l" to="guwi:~PrintStream.println(java.lang.String)" resolve="println" />
              <node concept="3cpWs3" id="3xyw8AYMKm6" role="37wK5m">
                <node concept="Xl_RD" id="3xyw8AYMKqH" role="3uHU7w">
                  <property role="Xl_RC" value=" Transitionen" />
                </node>
                <node concept="37vLTw" id="3xyw8AYMIrh" role="3uHU7B">
                  <ref role="3cqZAo" node="3xyw8AYMDsU" resolve="transitionenCount" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="37vLTG" id="3xyw8AYJcSw" role="3clF46">
        <property role="TrG5h" value="args" />
        <node concept="10Q1$e" id="3xyw8AYJcTZ" role="1tU5fm">
          <node concept="17QB3L" id="3xyw8AYJcSv" role="10Q1$1" />
        </node>
      </node>
      <node concept="3cqZAl" id="3xyw8AYJcRV" role="3clF45" />
      <node concept="3Tm1VV" id="3xyw8AYJcR$" role="1B3o_S" />
    </node>
    <node concept="3Tm1VV" id="3xyw8AYJcRd" role="1B3o_S" />
    <node concept="n94m4" id="3xyw8AYJcRe" role="lGtFl">
      <ref role="n9lRv" to="xful:5NPqCQTMT8m" resolve="Petrinetz" />
    </node>
    <node concept="17Uvod" id="3xyw8AYKYUR" role="lGtFl">
      <property role="2qtEX9" value="name" />
      <property role="P4ACc" value="ceab5195-25ea-4f22-9b92-103b95ca8c0c/1169194658468/1169194664001" />
      <node concept="3zFVjK" id="3xyw8AYKYUS" role="3zH0cK">
        <node concept="3clFbS" id="3xyw8AYKYUT" role="2VODD2">
          <node concept="3clFbF" id="3xyw8AYKZpW" role="3cqZAp">
            <node concept="2OqwBi" id="3xyw8AYKZJg" role="3clFbG">
              <node concept="30H73N" id="3xyw8AYKZpV" role="2Oq$k0" />
              <node concept="3TrcHB" id="3xyw8AYLo49" role="2OqNvi">
                <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
</model>

