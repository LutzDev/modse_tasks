<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:b62f06e7-402f-41ad-aefc-b0d588fc9e60(Petrinetz.typesystem)">
  <persistence version="9" />
  <languages>
    <use id="7a5dda62-9140-4668-ab76-d5ed1746f2b2" name="jetbrains.mps.lang.typesystem" version="5" />
    <devkit ref="00000000-0000-4000-0000-1de82b3a4936(jetbrains.mps.devkit.aspect.typesystem)" />
  </languages>
  <imports>
    <import index="xful" ref="r:2823fc59-4fda-4dc8-9c31-04a97812e045(Petrinetz.structure)" implicit="true" />
    <import index="tpck" ref="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" implicit="true" />
  </imports>
  <registry>
    <language id="f3061a53-9226-4cc5-a443-f952ceaf5816" name="jetbrains.mps.baseLanguage">
      <concept id="1154032098014" name="jetbrains.mps.baseLanguage.structure.AbstractLoopStatement" flags="nn" index="2LF5Ji">
        <child id="1154032183016" name="body" index="2LFqv$" />
      </concept>
      <concept id="1197027756228" name="jetbrains.mps.baseLanguage.structure.DotExpression" flags="nn" index="2OqwBi">
        <child id="1197027771414" name="operand" index="2Oq$k0" />
        <child id="1197027833540" name="operation" index="2OqNvi" />
      </concept>
      <concept id="1145552977093" name="jetbrains.mps.baseLanguage.structure.GenericNewExpression" flags="nn" index="2ShNRf">
        <child id="1145553007750" name="creator" index="2ShVmc" />
      </concept>
      <concept id="1070475926800" name="jetbrains.mps.baseLanguage.structure.StringLiteral" flags="nn" index="Xl_RD">
        <property id="1070475926801" name="value" index="Xl_RC" />
      </concept>
      <concept id="1068431474542" name="jetbrains.mps.baseLanguage.structure.VariableDeclaration" flags="ng" index="33uBYm">
        <child id="1068431790190" name="initializer" index="33vP2m" />
      </concept>
      <concept id="1068498886296" name="jetbrains.mps.baseLanguage.structure.VariableReference" flags="nn" index="37vLTw">
        <reference id="1068581517664" name="variableDeclaration" index="3cqZAo" />
      </concept>
      <concept id="1225271177708" name="jetbrains.mps.baseLanguage.structure.StringType" flags="in" index="17QB3L" />
      <concept id="4972933694980447171" name="jetbrains.mps.baseLanguage.structure.BaseVariableDeclaration" flags="ng" index="19Szcq">
        <child id="5680397130376446158" name="type" index="1tU5fm" />
      </concept>
      <concept id="1068580123155" name="jetbrains.mps.baseLanguage.structure.ExpressionStatement" flags="nn" index="3clFbF">
        <child id="1068580123156" name="expression" index="3clFbG" />
      </concept>
      <concept id="1068580123157" name="jetbrains.mps.baseLanguage.structure.Statement" flags="nn" index="3clFbH" />
      <concept id="1068580123159" name="jetbrains.mps.baseLanguage.structure.IfStatement" flags="nn" index="3clFbJ">
        <child id="1068580123160" name="condition" index="3clFbw" />
        <child id="1068580123161" name="ifTrue" index="3clFbx" />
      </concept>
      <concept id="1068580123136" name="jetbrains.mps.baseLanguage.structure.StatementList" flags="sn" stub="5293379017992965193" index="3clFbS">
        <child id="1068581517665" name="statement" index="3cqZAp" />
      </concept>
      <concept id="1068581242864" name="jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement" flags="nn" index="3cpWs8">
        <child id="1068581242865" name="localVariableDeclaration" index="3cpWs9" />
      </concept>
      <concept id="1068581242863" name="jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration" flags="nr" index="3cpWsn" />
      <concept id="1081516740877" name="jetbrains.mps.baseLanguage.structure.NotExpression" flags="nn" index="3fqX7Q">
        <child id="1081516765348" name="expression" index="3fr31v" />
      </concept>
      <concept id="1081773326031" name="jetbrains.mps.baseLanguage.structure.BinaryOperation" flags="nn" index="3uHJSO">
        <child id="1081773367579" name="rightExpression" index="3uHU7w" />
        <child id="1081773367580" name="leftExpression" index="3uHU7B" />
      </concept>
      <concept id="1073239437375" name="jetbrains.mps.baseLanguage.structure.NotEqualsExpression" flags="nn" index="3y3z36" />
    </language>
    <language id="7a5dda62-9140-4668-ab76-d5ed1746f2b2" name="jetbrains.mps.lang.typesystem">
      <concept id="1175517767210" name="jetbrains.mps.lang.typesystem.structure.ReportErrorStatement" flags="nn" index="2MkqsV">
        <child id="1175517851849" name="errorString" index="2MkJ7o" />
      </concept>
      <concept id="1195213580585" name="jetbrains.mps.lang.typesystem.structure.AbstractCheckingRule" flags="ig" index="18hYwZ">
        <child id="1195213635060" name="body" index="18ibNy" />
      </concept>
      <concept id="1195214364922" name="jetbrains.mps.lang.typesystem.structure.NonTypesystemRule" flags="ig" index="18kY7G" />
      <concept id="3937244445246642777" name="jetbrains.mps.lang.typesystem.structure.AbstractReportStatement" flags="ng" index="1urrMJ">
        <child id="3937244445246642781" name="nodeToReport" index="1urrMF" />
      </concept>
      <concept id="1174642788531" name="jetbrains.mps.lang.typesystem.structure.ConceptReference" flags="ig" index="1YaCAy">
        <reference id="1174642800329" name="concept" index="1YaFvo" />
      </concept>
      <concept id="1174648085619" name="jetbrains.mps.lang.typesystem.structure.AbstractRule" flags="ng" index="1YuPPy">
        <child id="1174648101952" name="applicableNode" index="1YuTPh" />
      </concept>
      <concept id="1174650418652" name="jetbrains.mps.lang.typesystem.structure.ApplicableNodeReference" flags="nn" index="1YBJjd">
        <reference id="1174650432090" name="applicableNode" index="1YBMHb" />
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
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ng" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
    <language id="83888646-71ce-4f1c-9c53-c54016f6ad4f" name="jetbrains.mps.baseLanguage.collections">
      <concept id="540871147943773365" name="jetbrains.mps.baseLanguage.collections.structure.SingleArgumentSequenceOperation" flags="nn" index="25WWJ4">
        <child id="540871147943773366" name="argument" index="25WWJ7" />
      </concept>
      <concept id="1151688443754" name="jetbrains.mps.baseLanguage.collections.structure.ListType" flags="in" index="_YKpA">
        <child id="1151688676805" name="elementType" index="_ZDj9" />
      </concept>
      <concept id="1153943597977" name="jetbrains.mps.baseLanguage.collections.structure.ForEachStatement" flags="nn" index="2Gpval">
        <child id="1153944400369" name="variable" index="2Gsz3X" />
        <child id="1153944424730" name="inputSequence" index="2GsD0m" />
      </concept>
      <concept id="1153944193378" name="jetbrains.mps.baseLanguage.collections.structure.ForEachVariable" flags="nr" index="2GrKxI" />
      <concept id="1153944233411" name="jetbrains.mps.baseLanguage.collections.structure.ForEachVariableReference" flags="nn" index="2GrUjf">
        <reference id="1153944258490" name="variable" index="2Gs0qQ" />
      </concept>
      <concept id="1237721394592" name="jetbrains.mps.baseLanguage.collections.structure.AbstractContainerCreator" flags="nn" index="HWqM0">
        <child id="1237721435807" name="elementType" index="HW$YZ" />
      </concept>
      <concept id="1227008614712" name="jetbrains.mps.baseLanguage.collections.structure.LinkedListCreator" flags="nn" index="2Jqq0_" />
      <concept id="1160612413312" name="jetbrains.mps.baseLanguage.collections.structure.AddElementOperation" flags="nn" index="TSZUe" />
      <concept id="1162935959151" name="jetbrains.mps.baseLanguage.collections.structure.GetSizeOperation" flags="nn" index="34oBXx" />
      <concept id="1172254888721" name="jetbrains.mps.baseLanguage.collections.structure.ContainsOperation" flags="nn" index="3JPx81" />
    </language>
  </registry>
  <node concept="18kY7G" id="3xyw8AYItJZ">
    <property role="TrG5h" value="UniqueStellenName" />
    <node concept="3clFbS" id="3xyw8AYItK0" role="18ibNy">
      <node concept="3cpWs8" id="3xyw8AYItKd" role="3cqZAp">
        <node concept="3cpWsn" id="3xyw8AYItKg" role="3cpWs9">
          <property role="TrG5h" value="dups" />
          <node concept="_YKpA" id="3xyw8AYItKb" role="1tU5fm">
            <node concept="17QB3L" id="3xyw8AYItKr" role="_ZDj9" />
          </node>
          <node concept="2ShNRf" id="3xyw8AYItKY" role="33vP2m">
            <node concept="2Jqq0_" id="3xyw8AYIuTr" role="2ShVmc">
              <node concept="17QB3L" id="3xyw8AYIv6U" role="HW$YZ" />
            </node>
          </node>
        </node>
      </node>
      <node concept="3clFbH" id="3xyw8AYIv7J" role="3cqZAp" />
      <node concept="2Gpval" id="3xyw8AYIv82" role="3cqZAp">
        <node concept="2GrKxI" id="3xyw8AYIv84" role="2Gsz3X">
          <property role="TrG5h" value="stelle" />
        </node>
        <node concept="2OqwBi" id="3xyw8AYIvi_" role="2GsD0m">
          <node concept="1YBJjd" id="3xyw8AYIv8I" role="2Oq$k0">
            <ref role="1YBMHb" node="3xyw8AYItK2" resolve="petrinetz" />
          </node>
          <node concept="3Tsc0h" id="3xyw8AYIvr8" role="2OqNvi">
            <ref role="3TtcxE" to="xful:5NPqCQTMT8t" resolve="stellen" />
          </node>
        </node>
        <node concept="3clFbS" id="3xyw8AYIv88" role="2LFqv$">
          <node concept="3clFbJ" id="3xyw8AYIvtD" role="3cqZAp">
            <node concept="3fqX7Q" id="3xyw8AYIvtP" role="3clFbw">
              <node concept="2OqwBi" id="3xyw8AYIwf6" role="3fr31v">
                <node concept="37vLTw" id="3xyw8AYIvu5" role="2Oq$k0">
                  <ref role="3cqZAo" node="3xyw8AYItKg" resolve="dups" />
                </node>
                <node concept="3JPx81" id="3xyw8AYIwRH" role="2OqNvi">
                  <node concept="2OqwBi" id="3xyw8AYIxjr" role="25WWJ7">
                    <node concept="2GrUjf" id="3xyw8AYIx8j" role="2Oq$k0">
                      <ref role="2Gs0qQ" node="3xyw8AYIv84" resolve="stelle" />
                    </node>
                    <node concept="3TrcHB" id="3xyw8AYIxwW" role="2OqNvi">
                      <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node concept="3clFbS" id="3xyw8AYIvtF" role="3clFbx">
              <node concept="3clFbF" id="3xyw8AYIx_4" role="3cqZAp">
                <node concept="2OqwBi" id="3xyw8AYIydR" role="3clFbG">
                  <node concept="37vLTw" id="3xyw8AYIx_3" role="2Oq$k0">
                    <ref role="3cqZAo" node="3xyw8AYItKg" resolve="dups" />
                  </node>
                  <node concept="TSZUe" id="3xyw8AYIyIj" role="2OqNvi">
                    <node concept="2OqwBi" id="3xyw8AYIzcK" role="25WWJ7">
                      <node concept="2GrUjf" id="3xyw8AYIz7k" role="2Oq$k0">
                        <ref role="2Gs0qQ" node="3xyw8AYIv84" resolve="stelle" />
                      </node>
                      <node concept="3TrcHB" id="3xyw8AYIzhT" role="2OqNvi">
                        <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3clFbH" id="3xyw8AYIzpm" role="3cqZAp" />
      <node concept="3clFbJ" id="3xyw8AYI$rd" role="3cqZAp">
        <node concept="3clFbS" id="3xyw8AYI$rf" role="3clFbx">
          <node concept="2MkqsV" id="3xyw8AYIQNF" role="3cqZAp">
            <node concept="Xl_RD" id="3xyw8AYIQNU" role="2MkJ7o">
              <property role="Xl_RC" value="Unique state name condition" />
            </node>
            <node concept="1YBJjd" id="3xyw8AYIQP4" role="1urrMF">
              <ref role="1YBMHb" node="3xyw8AYItK2" resolve="petrinetz" />
            </node>
          </node>
        </node>
        <node concept="3y3z36" id="3xyw8AYIO6M" role="3clFbw">
          <node concept="2OqwBi" id="3xyw8AYIPXC" role="3uHU7w">
            <node concept="37vLTw" id="3xyw8AYIOBA" role="2Oq$k0">
              <ref role="3cqZAo" node="3xyw8AYItKg" resolve="dups" />
            </node>
            <node concept="34oBXx" id="3xyw8AYIQGb" role="2OqNvi" />
          </node>
          <node concept="2OqwBi" id="3xyw8AYIKgf" role="3uHU7B">
            <node concept="2OqwBi" id="3xyw8AYIIy2" role="2Oq$k0">
              <node concept="1YBJjd" id="3xyw8AYI$rV" role="2Oq$k0">
                <ref role="1YBMHb" node="3xyw8AYItK2" resolve="petrinetz" />
              </node>
              <node concept="3Tsc0h" id="3xyw8AYIICc" role="2OqNvi">
                <ref role="3TtcxE" to="xful:5NPqCQTMT8t" resolve="stellen" />
              </node>
            </node>
            <node concept="34oBXx" id="3xyw8AYIMmB" role="2OqNvi" />
          </node>
        </node>
      </node>
    </node>
    <node concept="1YaCAy" id="3xyw8AYItK2" role="1YuTPh">
      <property role="TrG5h" value="petrinetz" />
      <ref role="1YaFvo" to="xful:5NPqCQTMT8m" resolve="Petrinetz" />
    </node>
  </node>
</model>

