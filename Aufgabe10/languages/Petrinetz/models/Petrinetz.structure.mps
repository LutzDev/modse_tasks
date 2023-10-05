<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:2823fc59-4fda-4dc8-9c31-04a97812e045(Petrinetz.structure)">
  <persistence version="9" />
  <languages>
    <use id="c72da2b9-7cce-4447-8389-f407dc1158b7" name="jetbrains.mps.lang.structure" version="9" />
    <devkit ref="78434eb8-b0e5-444b-850d-e7c4ad2da9ab(jetbrains.mps.devkit.aspect.structure)" />
  </languages>
  <imports>
    <import index="tpck" ref="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" implicit="true" />
  </imports>
  <registry>
    <language id="c72da2b9-7cce-4447-8389-f407dc1158b7" name="jetbrains.mps.lang.structure">
      <concept id="1169125787135" name="jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration" flags="ig" index="PkWjJ">
        <property id="6714410169261853888" name="conceptId" index="EcuMT" />
        <child id="1071489727083" name="linkDeclaration" index="1TKVEi" />
      </concept>
      <concept id="1169127622168" name="jetbrains.mps.lang.structure.structure.InterfaceConceptReference" flags="ig" index="PrWs8">
        <reference id="1169127628841" name="intfc" index="PrY4T" />
      </concept>
      <concept id="1071489090640" name="jetbrains.mps.lang.structure.structure.ConceptDeclaration" flags="ig" index="1TIwiD">
        <property id="1096454100552" name="rootable" index="19KtqR" />
        <reference id="1071489389519" name="extends" index="1TJDcQ" />
        <child id="1169129564478" name="implements" index="PzmwI" />
      </concept>
      <concept id="1071489288298" name="jetbrains.mps.lang.structure.structure.LinkDeclaration" flags="ig" index="1TJgyj">
        <property id="1071599776563" name="role" index="20kJfa" />
        <property id="1071599893252" name="sourceCardinality" index="20lbJX" />
        <property id="1071599937831" name="metaClass" index="20lmBu" />
        <property id="241647608299431140" name="linkId" index="IQ2ns" />
        <reference id="1071599976176" name="target" index="20lvS9" />
      </concept>
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ng" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
  </registry>
  <node concept="1TIwiD" id="5NPqCQTMT8q">
    <property role="EcuMT" value="6698377177723539994" />
    <property role="TrG5h" value="Transition" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="1TJgyj" id="5NPqCQTMT8$" role="1TKVEi">
      <property role="IQ2ns" value="6698377177723540004" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="input" />
      <property role="20lbJX" value="fLJekj5/_0__n" />
      <ref role="20lvS9" node="5NPqCQTMT8y" resolve="StellenReference" />
    </node>
    <node concept="1TJgyj" id="5NPqCQTMT8_" role="1TKVEi">
      <property role="IQ2ns" value="6698377177723540005" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="output" />
      <property role="20lbJX" value="fLJekj5/_0__n" />
      <ref role="20lvS9" node="5NPqCQTMT8y" resolve="StellenReference" />
    </node>
    <node concept="PrWs8" id="3xyw8AYInDm" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
  </node>
  <node concept="1TIwiD" id="5NPqCQTMT8y">
    <property role="EcuMT" value="6698377177723540002" />
    <property role="TrG5h" value="StellenReference" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="1TJgyj" id="5NPqCQTMT8z" role="1TKVEi">
      <property role="IQ2ns" value="6698377177723540003" />
      <property role="20kJfa" value="stelle" />
      <property role="20lbJX" value="fLJekj4/_1" />
      <ref role="20lvS9" node="5NPqCQTMT8p" resolve="Stelle" />
    </node>
  </node>
  <node concept="1TIwiD" id="5NPqCQTMT8p">
    <property role="EcuMT" value="6698377177723539993" />
    <property role="TrG5h" value="Stelle" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="1TJgyj" id="5NPqCQTMT8w" role="1TKVEi">
      <property role="IQ2ns" value="6698377177723540000" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="marken" />
      <property role="20lbJX" value="fLJekj5/_0__n" />
      <ref role="20lvS9" node="5NPqCQTMT8r" resolve="Marke" />
    </node>
    <node concept="PrWs8" id="3xyw8AYInDk" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
  </node>
  <node concept="1TIwiD" id="5NPqCQTMT8m">
    <property role="EcuMT" value="6698377177723539990" />
    <property role="TrG5h" value="Petrinetz" />
    <property role="19KtqR" value="true" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="1TJgyj" id="5NPqCQTMT8t" role="1TKVEi">
      <property role="IQ2ns" value="6698377177723539997" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="stellen" />
      <property role="20lbJX" value="fLJekj5/_0__n" />
      <ref role="20lvS9" node="5NPqCQTMT8p" resolve="Stelle" />
    </node>
    <node concept="1TJgyj" id="5NPqCQTMT8u" role="1TKVEi">
      <property role="IQ2ns" value="6698377177723539998" />
      <property role="20lmBu" value="fLJjDmT/aggregation" />
      <property role="20kJfa" value="transitionen" />
      <property role="20lbJX" value="fLJekj5/_0__n" />
      <ref role="20lvS9" node="5NPqCQTMT8q" resolve="Transition" />
    </node>
    <node concept="PrWs8" id="3xyw8AYInDo" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
  </node>
  <node concept="1TIwiD" id="5NPqCQTMT8r">
    <property role="EcuMT" value="6698377177723539995" />
    <property role="TrG5h" value="Marke" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
  </node>
</model>

