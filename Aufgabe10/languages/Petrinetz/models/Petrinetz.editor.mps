<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:f607f90a-f7bf-44d4-bf1d-1337065cc452(Petrinetz.editor)">
  <persistence version="9" />
  <languages>
    <use id="18bc6592-03a6-4e29-a83a-7ff23bde13ba" name="jetbrains.mps.lang.editor" version="14" />
    <use id="aee9cad2-acd4-4608-aef2-0004f6a1cdbd" name="jetbrains.mps.lang.actions" version="4" />
    <devkit ref="fbc25dd2-5da4-483a-8b19-70928e1b62d7(jetbrains.mps.devkit.general-purpose)" />
  </languages>
  <imports>
    <import index="xful" ref="r:2823fc59-4fda-4dc8-9c31-04a97812e045(Petrinetz.structure)" implicit="true" />
    <import index="tpck" ref="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" implicit="true" />
  </imports>
  <registry>
    <language id="18bc6592-03a6-4e29-a83a-7ff23bde13ba" name="jetbrains.mps.lang.editor">
      <concept id="1071666914219" name="jetbrains.mps.lang.editor.structure.ConceptEditorDeclaration" flags="ig" index="24kQdi" />
      <concept id="1140524381322" name="jetbrains.mps.lang.editor.structure.CellModel_ListWithRole" flags="ng" index="2czfm3">
        <property id="1140524450557" name="separatorText" index="2czwfO" />
        <child id="1140524464360" name="cellLayout" index="2czzBx" />
      </concept>
      <concept id="1237303669825" name="jetbrains.mps.lang.editor.structure.CellLayout_Indent" flags="nn" index="l2Vlx" />
      <concept id="1237307900041" name="jetbrains.mps.lang.editor.structure.IndentLayoutIndentStyleClassItem" flags="ln" index="lj46D" />
      <concept id="1237308012275" name="jetbrains.mps.lang.editor.structure.IndentLayoutNewLineStyleClassItem" flags="ln" index="ljvvj" />
      <concept id="1237375020029" name="jetbrains.mps.lang.editor.structure.IndentLayoutNewLineChildrenStyleClassItem" flags="ln" index="pj6Ft" />
      <concept id="1080736578640" name="jetbrains.mps.lang.editor.structure.BaseEditorComponent" flags="ig" index="2wURMF">
        <child id="1080736633877" name="cellModel" index="2wV5jI" />
      </concept>
      <concept id="1186414536763" name="jetbrains.mps.lang.editor.structure.BooleanStyleSheetItem" flags="ln" index="VOi$J">
        <property id="1186414551515" name="flag" index="VOm3f" />
      </concept>
      <concept id="1233758997495" name="jetbrains.mps.lang.editor.structure.PunctuationLeftStyleClassItem" flags="ln" index="11L4FC" />
      <concept id="1088013125922" name="jetbrains.mps.lang.editor.structure.CellModel_RefCell" flags="sg" stub="730538219795941030" index="1iCGBv">
        <child id="1088186146602" name="editorComponent" index="1sWHZn" />
      </concept>
      <concept id="1236262245656" name="jetbrains.mps.lang.editor.structure.MatchingLabelStyleClassItem" flags="ln" index="3mYdg7">
        <property id="1238091709220" name="labelName" index="1413C4" />
      </concept>
      <concept id="1088185857835" name="jetbrains.mps.lang.editor.structure.InlineEditorComponent" flags="ig" index="1sVBvm" />
      <concept id="1139848536355" name="jetbrains.mps.lang.editor.structure.CellModel_WithRole" flags="ng" index="1$h60E">
        <reference id="1140103550593" name="relationDeclaration" index="1NtTu8" />
      </concept>
      <concept id="1073389446423" name="jetbrains.mps.lang.editor.structure.CellModel_Collection" flags="sn" stub="3013115976261988961" index="3EZMnI">
        <child id="1106270802874" name="cellLayout" index="2iSdaV" />
        <child id="1073389446424" name="childCellModel" index="3EZMnx" />
      </concept>
      <concept id="1073389577006" name="jetbrains.mps.lang.editor.structure.CellModel_Constant" flags="sn" stub="3610246225209162225" index="3F0ifn">
        <property id="1073389577007" name="text" index="3F0ifm" />
      </concept>
      <concept id="1073389658414" name="jetbrains.mps.lang.editor.structure.CellModel_Property" flags="sg" stub="730538219796134133" index="3F0A7n" />
      <concept id="1219418625346" name="jetbrains.mps.lang.editor.structure.IStyleContainer" flags="ng" index="3F0Thp">
        <child id="1219418656006" name="styleItem" index="3F10Kt" />
      </concept>
      <concept id="1073390211982" name="jetbrains.mps.lang.editor.structure.CellModel_RefNodeList" flags="sg" stub="2794558372793454595" index="3F2HdR" />
      <concept id="1166049232041" name="jetbrains.mps.lang.editor.structure.AbstractComponent" flags="ng" index="1XWOmA">
        <reference id="1166049300910" name="conceptDeclaration" index="1XX52x" />
      </concept>
    </language>
  </registry>
  <node concept="24kQdi" id="3xyw8AYHVoW">
    <ref role="1XX52x" to="xful:5NPqCQTMT8r" resolve="Marke" />
    <node concept="3EZMnI" id="3xyw8AYHVoY" role="2wV5jI">
      <node concept="l2Vlx" id="3xyw8AYHVoZ" role="2iSdaV" />
      <node concept="3F0ifn" id="3xyw8AYHVp0" role="3EZMnx">
        <property role="3F0ifm" value="marke" />
      </node>
      <node concept="3F0ifn" id="3xyw8AYHVp1" role="3EZMnx">
        <property role="3F0ifm" value=";" />
        <node concept="11L4FC" id="3xyw8AYHVp2" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="3xyw8AYHVp8">
    <ref role="1XX52x" to="xful:5NPqCQTMT8m" resolve="Petrinetz" />
    <node concept="3EZMnI" id="3xyw8AYInDO" role="2wV5jI">
      <node concept="l2Vlx" id="3xyw8AYInDP" role="2iSdaV" />
      <node concept="3F0ifn" id="3xyw8AYInDQ" role="3EZMnx">
        <property role="3F0ifm" value="petrinetz" />
      </node>
      <node concept="3F0A7n" id="3xyw8AYInDR" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
      </node>
      <node concept="3F0ifn" id="3xyw8AYInDS" role="3EZMnx">
        <property role="3F0ifm" value="{" />
        <node concept="3mYdg7" id="3xyw8AYInDT" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
        <node concept="ljvvj" id="3xyw8AYInDU" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3EZMnI" id="3xyw8AYInDV" role="3EZMnx">
        <node concept="l2Vlx" id="3xyw8AYInDW" role="2iSdaV" />
        <node concept="lj46D" id="3xyw8AYInDX" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3F0ifn" id="3xyw8AYInDY" role="3EZMnx">
          <property role="3F0ifm" value="stellen" />
        </node>
        <node concept="3F0ifn" id="3xyw8AYInDZ" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="3xyw8AYInE0" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="3xyw8AYInE1" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F2HdR" id="3xyw8AYInE2" role="3EZMnx">
          <ref role="1NtTu8" to="xful:5NPqCQTMT8t" resolve="stellen" />
          <node concept="l2Vlx" id="3xyw8AYInE3" role="2czzBx" />
          <node concept="pj6Ft" id="3xyw8AYInE4" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="lj46D" id="3xyw8AYInE5" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="3xyw8AYInE6" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="3xyw8AYInE7" role="3EZMnx">
          <node concept="ljvvj" id="3xyw8AYInE8" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="3xyw8AYInE9" role="3EZMnx">
          <property role="3F0ifm" value="transitionen" />
        </node>
        <node concept="3F0ifn" id="3xyw8AYInEa" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="3xyw8AYInEb" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="3xyw8AYInEc" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F2HdR" id="3xyw8AYInEd" role="3EZMnx">
          <ref role="1NtTu8" to="xful:5NPqCQTMT8u" resolve="transitionen" />
          <node concept="l2Vlx" id="3xyw8AYInEe" role="2czzBx" />
          <node concept="pj6Ft" id="3xyw8AYInEf" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="lj46D" id="3xyw8AYInEg" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="3xyw8AYInEh" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
      </node>
      <node concept="3F0ifn" id="3xyw8AYInEi" role="3EZMnx">
        <property role="3F0ifm" value="}" />
        <node concept="3mYdg7" id="3xyw8AYInEj" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="3xyw8AYHVqa">
    <ref role="1XX52x" to="xful:5NPqCQTMT8p" resolve="Stelle" />
    <node concept="3EZMnI" id="3xyw8AYInEO" role="2wV5jI">
      <node concept="l2Vlx" id="3xyw8AYInEP" role="2iSdaV" />
      <node concept="3F0ifn" id="3xyw8AYInEQ" role="3EZMnx">
        <property role="3F0ifm" value="stelle" />
      </node>
      <node concept="3F0A7n" id="3xyw8AYInER" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
      </node>
      <node concept="3F0ifn" id="3xyw8AYInES" role="3EZMnx">
        <property role="3F0ifm" value="{" />
        <node concept="3mYdg7" id="3xyw8AYInET" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
        <node concept="ljvvj" id="3xyw8AYInEU" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3EZMnI" id="3xyw8AYInEV" role="3EZMnx">
        <node concept="l2Vlx" id="3xyw8AYInEW" role="2iSdaV" />
        <node concept="lj46D" id="3xyw8AYInEX" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="3F0ifn" id="3xyw8AYInEY" role="3EZMnx">
          <property role="3F0ifm" value="marken" />
        </node>
        <node concept="3F0ifn" id="3xyw8AYInEZ" role="3EZMnx">
          <property role="3F0ifm" value=":" />
          <node concept="11L4FC" id="3xyw8AYInF0" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="3xyw8AYInF1" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F2HdR" id="3xyw8AYInF2" role="3EZMnx">
          <ref role="1NtTu8" to="xful:5NPqCQTMT8w" resolve="marken" />
          <node concept="l2Vlx" id="3xyw8AYInF3" role="2czzBx" />
          <node concept="pj6Ft" id="3xyw8AYInF4" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="lj46D" id="3xyw8AYInF5" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
          <node concept="ljvvj" id="3xyw8AYInF6" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
      </node>
      <node concept="3F0ifn" id="3xyw8AYInF7" role="3EZMnx">
        <property role="3F0ifm" value="}" />
        <node concept="3mYdg7" id="3xyw8AYInF8" role="3F10Kt">
          <property role="1413C4" value="body-brace" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="3xyw8AYHVqQ">
    <ref role="1XX52x" to="xful:5NPqCQTMT8y" resolve="StellenReference" />
    <node concept="3EZMnI" id="3xyw8AYInFQ" role="2wV5jI">
      <node concept="l2Vlx" id="3xyw8AYInFR" role="2iSdaV" />
      <node concept="3F0ifn" id="3xyw8AYInFS" role="3EZMnx">
        <property role="3F0ifm" value="stellen reference" />
      </node>
      <node concept="3F0ifn" id="3xyw8AYInFT" role="3EZMnx">
        <property role="3F0ifm" value="stelle" />
      </node>
      <node concept="1iCGBv" id="3xyw8AYInFU" role="3EZMnx">
        <ref role="1NtTu8" to="xful:5NPqCQTMT8z" resolve="stelle" />
        <node concept="1sVBvm" id="3xyw8AYInFX" role="1sWHZn">
          <node concept="3F0A7n" id="3xyw8AYInFZ" role="2wV5jI">
            <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
          </node>
        </node>
      </node>
      <node concept="3F0ifn" id="3xyw8AYInG0" role="3EZMnx">
        <property role="3F0ifm" value=";" />
        <node concept="11L4FC" id="3xyw8AYInG1" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="3xyw8AYHVrd">
    <ref role="1XX52x" to="xful:5NPqCQTMT8q" resolve="Transition" />
    <node concept="3EZMnI" id="3xyw8AYInFu" role="2wV5jI">
      <node concept="l2Vlx" id="3xyw8AYInFv" role="2iSdaV" />
      <node concept="3F0ifn" id="3xyw8AYInFw" role="3EZMnx">
        <property role="3F0ifm" value="transition" />
      </node>
      <node concept="3F0A7n" id="3xyw8AYInFx" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
      </node>
      <node concept="3F0ifn" id="3xyw8AYInFy" role="3EZMnx">
        <property role="3F0ifm" value="input" />
      </node>
      <node concept="3F2HdR" id="3xyw8AYInFz" role="3EZMnx">
        <property role="2czwfO" value="," />
        <ref role="1NtTu8" to="xful:5NPqCQTMT8$" resolve="input" />
        <node concept="l2Vlx" id="3xyw8AYInF$" role="2czzBx" />
      </node>
      <node concept="3F0ifn" id="3xyw8AYInF_" role="3EZMnx">
        <property role="3F0ifm" value="output" />
      </node>
      <node concept="3F2HdR" id="3xyw8AYInFA" role="3EZMnx">
        <property role="2czwfO" value="," />
        <ref role="1NtTu8" to="xful:5NPqCQTMT8_" resolve="output" />
        <node concept="l2Vlx" id="3xyw8AYInFB" role="2czzBx" />
      </node>
      <node concept="3F0ifn" id="3xyw8AYInFC" role="3EZMnx">
        <property role="3F0ifm" value=";" />
        <node concept="11L4FC" id="3xyw8AYInFD" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
    </node>
  </node>
</model>

