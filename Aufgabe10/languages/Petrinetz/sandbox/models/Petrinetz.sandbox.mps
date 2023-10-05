<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:2c2b7783-5b3b-42f3-bb02-b4176b692083(Petrinetz.sandbox)">
  <persistence version="9" />
  <languages>
    <use id="8151472b-9fd8-4208-a479-dc05429f091a" name="Petrinetz" version="0" />
    <use id="f3061a53-9226-4cc5-a443-f952ceaf5816" name="jetbrains.mps.baseLanguage" version="11" />
  </languages>
  <imports />
  <registry>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ng" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
    <language id="8151472b-9fd8-4208-a479-dc05429f091a" name="Petrinetz">
      <concept id="6698377177723539993" name="Petrinetz.structure.Stelle" flags="ng" index="3_fJyk">
        <child id="6698377177723540000" name="marken" index="3_fJyH" />
      </concept>
      <concept id="6698377177723539995" name="Petrinetz.structure.Marke" flags="ng" index="3_fJym" />
      <concept id="6698377177723539994" name="Petrinetz.structure.Transition" flags="ng" index="3_fJyn">
        <child id="6698377177723540005" name="output" index="3_fJyC" />
        <child id="6698377177723540004" name="input" index="3_fJyD" />
      </concept>
      <concept id="6698377177723539990" name="Petrinetz.structure.Petrinetz" flags="ng" index="3_fJyr">
        <child id="6698377177723539997" name="stellen" index="3_fJyg" />
        <child id="6698377177723539998" name="transitionen" index="3_fJyj" />
      </concept>
      <concept id="6698377177723540002" name="Petrinetz.structure.StellenReference" flags="ng" index="3_fJyJ">
        <reference id="6698377177723540003" name="stelle" index="3_fJyI" />
      </concept>
    </language>
  </registry>
  <node concept="3_fJyr" id="3xyw8AYIqHd">
    <property role="TrG5h" value="zyklischerProzess" />
    <node concept="3_fJyn" id="3xyw8AYIqHf" role="3_fJyj">
      <property role="TrG5h" value="a" />
      <node concept="3_fJyJ" id="3xyw8AYIqHp" role="3_fJyC">
        <ref role="3_fJyI" node="3xyw8AYIqHi" resolve="2" />
      </node>
      <node concept="3_fJyJ" id="3xyw8AYIqHg" role="3_fJyD">
        <ref role="3_fJyI" node="3xyw8AYIqHe" resolve="1" />
      </node>
      <node concept="3_fJyJ" id="3xyw8AYIqHo" role="3_fJyD">
        <ref role="3_fJyI" node="3xyw8AYIqHj" resolve="3" />
      </node>
    </node>
    <node concept="3_fJyn" id="3xyw8AYIqHq" role="3_fJyj">
      <property role="TrG5h" value="b" />
      <node concept="3_fJyJ" id="3xyw8AYIqHs" role="3_fJyC">
        <ref role="3_fJyI" node="3xyw8AYIqHe" resolve="1" />
      </node>
      <node concept="3_fJyJ" id="3xyw8AYIqHu" role="3_fJyC">
        <ref role="3_fJyI" node="3xyw8AYIqHj" resolve="3" />
      </node>
      <node concept="3_fJyJ" id="3xyw8AYIqHr" role="3_fJyD">
        <ref role="3_fJyI" node="3xyw8AYIqHi" resolve="2" />
      </node>
    </node>
    <node concept="3_fJyn" id="3xyw8AYIqHv" role="3_fJyj">
      <property role="TrG5h" value="c" />
      <node concept="3_fJyJ" id="3xyw8AYIWN7" role="3_fJyC">
        <ref role="3_fJyI" node="3xyw8AYIWMN" resolve="4" />
      </node>
      <node concept="3_fJyJ" id="3xyw8AYIqHw" role="3_fJyD">
        <ref role="3_fJyI" node="3xyw8AYIqHj" resolve="3" />
      </node>
      <node concept="3_fJyJ" id="3xyw8AYIqHx" role="3_fJyD">
        <ref role="3_fJyI" node="3xyw8AYIqHm" resolve="5" />
      </node>
    </node>
    <node concept="3_fJyn" id="3xyw8AYIqHz" role="3_fJyj">
      <property role="TrG5h" value="d" />
      <node concept="3_fJyJ" id="3xyw8AYIWN5" role="3_fJyD">
        <ref role="3_fJyI" node="3xyw8AYIWMN" resolve="4" />
      </node>
      <node concept="3_fJyJ" id="3xyw8AYIqH_" role="3_fJyC">
        <ref role="3_fJyI" node="3xyw8AYIqHj" resolve="3" />
      </node>
      <node concept="3_fJyJ" id="3xyw8AYIqHA" role="3_fJyC">
        <ref role="3_fJyI" node="3xyw8AYIqHm" resolve="5" />
      </node>
    </node>
    <node concept="3_fJyk" id="3xyw8AYIqHe" role="3_fJyg">
      <property role="TrG5h" value="1" />
      <node concept="3_fJym" id="3xyw8AYIqHh" role="3_fJyH" />
    </node>
    <node concept="3_fJyk" id="3xyw8AYIqHi" role="3_fJyg">
      <property role="TrG5h" value="2" />
    </node>
    <node concept="3_fJyk" id="3xyw8AYIqHj" role="3_fJyg">
      <property role="TrG5h" value="3" />
      <node concept="3_fJym" id="3xyw8AYIqHl" role="3_fJyH" />
    </node>
    <node concept="3_fJyk" id="3xyw8AYIWMN" role="3_fJyg">
      <property role="TrG5h" value="4" />
    </node>
    <node concept="3_fJyk" id="3xyw8AYIqHm" role="3_fJyg">
      <property role="TrG5h" value="5" />
      <node concept="3_fJym" id="3xyw8AYIqHn" role="3_fJyH" />
    </node>
  </node>
</model>

