package com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.function.IntFunction;
import lombok.Generated;

public abstract class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<T extends Number & Comparable<T>> implements HRCHROOHRIHCRCRHRIIROCIRHOIRHH<T> {
   private static final boolean HICRRCRIOCIRHHHRIROCIRHCIHRROH = true;
   private static final Int2ObjectMap<RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<?>> OHOOOCIOIOHHRRIOCCCRIOIRCIOHHR = new Int2ObjectOpenHashMap();
   private final boolean CRRCRHRCCHCHIHHOORHCROOHOIRHHC;
   private final boolean OOOOCRIIOHCIOHCHRCRIOHCOICCHII;

   @Override
   public int RHCHHHCCIHOHOCHOIRORRHRCCRIRIR() {
      return 0;
   }

   public static <A extends RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<T>, T extends Number & Comparable<T>> A RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(int var0, IntFunction<A> var1) {
      return (A)OHOOOCIOIOHHRRIOCCCRIOIRCIOHHR.computeIfAbsent(var0, var1);
   }

   @Generated
   @Override
   public boolean OCHHOOIIOIIHOIHCCOHCOOOHRICHIR() {
      return this.CRRCRHRCCHCHIHHOORHCROOHOIRHHC;
   }

   @Generated
   @Override
   public boolean HROIRIHCIHHCICRHIOHORRCOOHHROH() {
      return this.OOOOCRIIOHCIOHCHRCRIOHCOICCHII;
   }

   @Generated
   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(boolean var1, boolean var2) {
      this.CRRCRHRCCHCHIHHOORHCROOHOIRHHC = var1;
      this.OOOOCRIIOHCIOHCHRCRIOHCOICCHII = var2;
   }
}
