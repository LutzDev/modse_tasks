package Petrinetz.structure;

/*Generated by MPS */

import jetbrains.mps.lang.smodel.LanguageConceptIndex;
import jetbrains.mps.lang.smodel.LanguageConceptIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.SConceptId;
import org.jetbrains.mps.openapi.language.SAbstractConcept;

public final class LanguageConceptSwitch {
  private final LanguageConceptIndex myIndex;
  public static final int Marke = 0;
  public static final int Petrinetz = 1;
  public static final int Stelle = 2;
  public static final int StellenReference = 3;
  public static final int Transition = 4;

  public LanguageConceptSwitch() {
    LanguageConceptIndexBuilder builder = new LanguageConceptIndexBuilder(0x8151472b9fd84208L, 0xa479dc05429f091aL);
    builder.put(0x5cf56a8db9cb921bL, Marke);
    builder.put(0x5cf56a8db9cb9216L, Petrinetz);
    builder.put(0x5cf56a8db9cb9219L, Stelle);
    builder.put(0x5cf56a8db9cb9222L, StellenReference);
    builder.put(0x5cf56a8db9cb921aL, Transition);
    myIndex = builder.seal();
  }

  /*package*/ int index(SConceptId cid) {
    return myIndex.index(cid);
  }

  public int index(SAbstractConcept concept) {
    return myIndex.index(concept);
  }
}
