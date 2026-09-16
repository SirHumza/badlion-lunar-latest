package com.moonsworth.lunar.client.util.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.common.collect.ImmutableSet;
import java.lang.reflect.Modifier;
import java.util.Set;
import javax.annotation.Nullable;
import lombok.Generated;

public class RRCRRCORICCHOHHIRCHIROOHIIOHCO extends IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   private String fieldName;
   private String OHCOHOHCHCHOHHCORCIOIROCOICIHI;
   @Nullable
   private String RCHHHORIRORROOHRRHHIIIOIROHHCC;
   private int modifiers;
   @Nullable
   private String CHHCROCHCIIHHIHIIORHRHCOIIOHCI;

   public RRCRRCORICCHOHHIRCHIROOHIIOHCO(@Nullable String var1) {
      super(null, null);
      this.CHHCROCHCIIHHIHIIORHRHCOIIOHCI = var1;
   }

   private RRCRRCORICCHOHHIRCHIROOHIIOHCO(
      Set<HRCHROOHRIHCRCRHRIIROCIRHOIRHH> var1, Set<HHCCIRHCCCIIRHCROHIORHIRHHIORH> var2, String var3, String var4, @Nullable String var5, int var6
   ) {
      super(var1, var2);
      this.fieldName = var3;
      this.OHCOHOHCHCHOHHCORCIOIROCOICIHI = var4;
      this.RCHHHORIRORROOHRRHHIIIOIROHHCC = var5;
      this.modifiers = var6;
   }

   @Override
   public String RRRHRIRCHOIHCORHIIOCICCCRHCHHO(int var1) {
      if (this.CHHCROCHCIIHHIHIIORHRHCOIIOHCI != null) {
         return com.moonsworth.lunar.client.util.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRHRHOOHRRICOHRHHOCRCCHHRIIIHR(var1)
            + this.CHHCROCHCIIHHIHIIORHRHCOIIOHCI;
      }

      StringBuilder var2 = new StringBuilder();
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var1);
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var2, var1);
      var2.append(
            com.moonsworth.lunar.client.util.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRHRHOOHRRICOHRHHOCRCCHHRIIIHR(var1)
               + Modifier.toString(this.modifiers)
         )
         .append(" ")
         .append(this.OHCOHOHCHCHOHHCORCIOIROCOICIHI)
         .append(" ")
         .append(this.fieldName);
      if (this.RCHHHORIRORROOHRRHHIIIOIROHHCC != null) {
         String[] var3 = this.RCHHHORIRORROOHRRHHIIIOIROHHCC.split("\n");
         var2.append(" = ").append(var3[0]);

         for (int var4 = 1; var4 < var3.length; var4++) {
            var2.append("\n")
               .append(com.moonsworth.lunar.client.util.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRHRHOOHRRICOHRHHOCRCCHHRIIIHR(var1 + 1))
               .append(var3[var4]);
         }
      }

      var2.append(";");
      return var2.toString();
   }

   public static RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH IORRORCRRHRRORHIRHRROHCRRIHRII(String var0, String var1) {
      return new RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1);
   }

   public static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
      extends com.moonsworth.lunar.client.util.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> {
      private final String IRIHHIORHRIORIICCRCHCOCOIIIRCC;
      private final String HCICROCOOORCOORCOOIRHCICRHHICO;
      private String RCHHHORIRORROOHRRHHIIIOIROHHCC;
      private int modifiers;

      public RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HIROOIRICIRHIHHIIIRCIOHHHIOHIC(String var1) {
         this.RCHHHORIRORROOHRRHHIIIOIROHHCC = var1;
         return this;
      }

      public RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH IHICORCROOROHCIHIHCOIHRRHICICO(String... var1) {
         this.RCHHHORIRORROOHRRHHIIIOIROHHCC = String.join("\n", var1);
         return this;
      }

      public RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HOIOHRCOCOOHHCHHHHROHHCOCOOOHI(String var1) {
         if (this.RCHHHORIRORROOHRRHHIIIOIROHHCC == null) {
            this.RCHHHORIRORROOHRRHHIIIOIROHHCC = var1;
         } else {
            this.RCHHHORIRORROOHRRHHIIIOIROHHCC = this.RCHHHORIRORROOHRRHHIIIOIROHHCC + "\n" + var1;
         }

         return this;
      }

      public RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         com.moonsworth.lunar.client.util.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1
      ) {
         this.modifiers = this.modifiers | switch (var1) {
            case PUBLIC -> 1;
            case PROTECTED -> 4;
            case PRIVATE -> 2;
            case PACKAGE -> 0;
         };
         return this;
      }

      public RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH OOOHIHORIRCHHIROHCCRROHHCICIOR() {
         this.modifiers |= 16;
         return this;
      }

      public RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HOCRHCHCOOHCRIIHOHROHRIIOOOOCO() {
         this.modifiers |= 8;
         return this;
      }

      public RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH OIIOHHIIIHIROIIRHIIRORORHHICHR() {
         this.modifiers |= 128;
         return this;
      }

      public RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH CHOIOIROCIOOIOICRRORRCIOOHORCH() {
         this.modifiers |= 64;
         return this;
      }

      public RRCRRCORICCHOHHIRCHIROOHIIOHCO HIICHIIRIRCICIOHOIOIRHHCCCHHOC() {
         return new RRCRRCORICCHOHHIRCHIROOHIIOHCO(
            ImmutableSet.copyOf(this.IOHCICCRIHOORICCOOOCHCCIOIOCCH()),
            ImmutableSet.copyOf(this.CRIHIRCIOOROHHRCRCCCCIHCOHIIIR()),
            this.IRIHHIORHRIORIICCRCHCOCOIIIRCC,
            this.HCICROCOOORCOORCOOIRHCICRHHICO,
            this.RCHHHORIRORROOHRRHHIIIOIROHHCC,
            this.modifiers
         );
      }

      @Generated
      protected RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, String var2) {
         this.IRIHHIORHRIORIICCRCHCOCOIIIRCC = var1;
         this.HCICROCOOORCOORCOOIRHCICRHHICO = var2;
      }
   }
}
