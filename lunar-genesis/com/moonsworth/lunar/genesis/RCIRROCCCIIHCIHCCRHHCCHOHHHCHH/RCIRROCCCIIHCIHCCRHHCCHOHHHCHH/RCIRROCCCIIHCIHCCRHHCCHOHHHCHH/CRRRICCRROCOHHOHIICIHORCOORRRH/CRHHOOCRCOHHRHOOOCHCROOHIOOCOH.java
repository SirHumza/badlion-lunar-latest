package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
   serializable = true
)
public class CRHHOOCRCOHHRHOOOCHCROOHIOOCOH<R, C, V> extends HIORIIIIOCCCRCHCOROROCCOIOOIIR<R, C, V> {
   private static final long OHRCHHICORIRIIRCOHRHHOOCICROOC = 0L;

   public static <R, C, V> CRHHOOCRCOHHRHOOOCHCROOHIOOCOH<R, C, V> HIOIRRRCICRRRHRHHRHCCCCRRHORIO() {
      return new CRHHOOCRCOHHRHOOOCHCROOHIOOCOH<>(new LinkedHashMap<>(), new CRHHOOCRCOHHRHOOOCHCROOHIOOCOH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<>(0));
   }

   public static <R, C, V> CRHHOOCRCOHHRHOOOCHCROOHIOOCOH<R, C, V> IOOCHIRHCRICHIHORCRCHCRHCICROH(int var0, int var1) {
      ICICIOCHHHIHOCHCOHORIHRCOHHOCR.checkNonnegative(var1, "expectedCellsPerRow");
      LinkedHashMap var2 = ROCHRRCORRCOOOOOCOICOCROIIHIHH.newLinkedHashMapWithExpectedSize(var0);
      return new CRHHOOCRCOHHRHOOOCHCROOHIOOCOH<>(var2, new CRHHOOCRCOHHRHOOOCHCROOHIOOCOH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<>(var1));
   }

   public static <R, C, V> CRHHOOCRCOHHRHOOOCHCROOHIOOCOH<R, C, V> HHCCIRHCCCIIRHCROHIORHIRHHIORH(
      RCCICOCCCHROHOCCHIHORIHHCOHOHH<? extends R, ? extends C, ? extends V> var0
   ) {
      CRHHOOCRCOHHRHOOOCHCROOHIOOCOH var1 = HIOIRRRCICRRRHRHHRHCCCCRRHORIO();
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0);
      return var1;
   }

   CRHHOOCRCOHHRHOOOCHCROOHIOOCOH(Map<R, Map<C, V>> var1, CRHHOOCRCOHHRHOOOCHCROOHIOOCOH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<C, V> var2) {
      super(var1, var2);
   }

   @Override
   public boolean contains(@Nullable Object var1, @Nullable Object var2) {
      return super.contains(var1, var2);
   }

   @Override
   public boolean containsColumn(@Nullable Object var1) {
      return super.containsColumn(var1);
   }

   @Override
   public boolean containsRow(@Nullable Object var1) {
      return super.containsRow(var1);
   }

   @Override
   public boolean containsValue(@Nullable Object var1) {
      return super.containsValue(var1);
   }

   @Override
   public V get(@Nullable Object var1, @Nullable Object var2) {
      return super.get(var1, var2);
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      return super.equals(var1);
   }

   @CanIgnoreReturnValue
   @Override
   public V remove(@Nullable Object var1, @Nullable Object var2) {
      return super.remove(var1, var2);
   }

   private static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<C, V>
      implements com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HCHRIROHHHCORIOCROOCHRCIOROOCI<Map<C, V>>,
      Serializable {
      final int RHRHCIICHRHRCHROHICHOORHROHCHR;
      private static final long HCOCIOOHORCRICOCHOCOCHHCIIOCOR = 0L;

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(int var1) {
         this.RHRHCIICHRHRCHROHICHOORHROHCHR = var1;
      }

      public Map<C, V> get() {
         return ROCHRRCORRCOOOOOCOICOCROIIHIHH.newLinkedHashMapWithExpectedSize(this.RHRHCIICHRHRCHROHICHOORHROHCHR);
      }
   }
}
