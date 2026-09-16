package com.moonsworth.lunar.client.util.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import lombok.Generated;

public class OOROOCCIRCCRHOIOIORIHCHHOOCCOR extends IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   private final String RHHCHHRHROOOCRROHCRRIORCCIORII;
   private final String returnType;
   private final List<CORCOCICIRIOHROHROIIOOHICCHCRR<String>> params;
   private final List<String> CICHOROCIIOHIHHOCICIHRIHCORHOR;
   private final int ICHHRIIRRRCIHRIIOHCCHOROROCIOI;
   private final boolean IIROHHICOHHCOCCORIHCCCHHHOOORC;

   private OOROOCCIRCCRHOIOIORIHCHHOOCCOR(
      Set<HRCHROOHRIHCRCRHRIIROCIRHOIRHH> var1,
      Set<HHCCIRHCCCIIRHCROHIORHIRHHIORH> var2,
      String var3,
      String var4,
      List<CORCOCICIRIOHROHROIIOOHICCHCRR<String>> var5,
      List<String> var6,
      int var7,
      boolean var8
   ) {
      super(var1, var2);
      this.RHHCHHRHROOOCRROHCRRIORCCIORII = var3;
      this.returnType = var4;
      this.params = var5;
      this.CICHOROCIIOHIHHOCICIHRIHCORHOR = var6;
      this.ICHHRIIRRRCIHRIIOHCCHOROROCIOI = var7;
      this.IIROHHICOHHCOCCORIHCCCHHHOOORC = var8;
   }

   @Override
   public String RRRHRIRCHOIHCORHIIOCICCCRHCHHO(int var1) {
      StringBuilder var2 = new StringBuilder();
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var1);
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var2, var1);
      String var3 = Modifier.toString(this.ICHHRIIRRRCIHRIIOHCCHOROROCIOI);
      var2.append(com.moonsworth.lunar.client.util.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRHRHOOHRRICOHRHHOCRCCHHRIIIHR(var1))
         .append(var3);
      if (!this.IIROHHICOHHCOCCORIHCCCHHHOOORC) {
         if (!var3.isEmpty()) {
            var2.append(" ");
         }

         var2.append(this.returnType);
      }

      var2.append(" ").append(this.RHHCHHRHROOOCRROHCRRIORCCIORII).append("(");
      boolean var4 = true;

      for (CORCOCICIRIOHROHROIIOOHICCHCRR var6 : this.params) {
         if (var4) {
            var4 = false;
         } else {
            var2.append(", ");
         }

         var2.append(var6.RRRHRIRCHOIHCORHIIOCICCCRHCHHO(0));
      }

      var2.append(") {\n");

      for (String var8 : this.CICHOROCIIOHIHHOCICIHRIHCORHOR) {
         var2.append(
               com.moonsworth.lunar.client.util.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IHIRRIIORRHORHRORIHOROIRCORCOO(var8, var1 + 1)
            )
            .append("\n");
      }

      var2.append(com.moonsworth.lunar.client.util.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRHRHOOHRRICOHRHHOCRCCHHRIIIHR(var1))
         .append("}");
      return var2.toString();
   }

   public static OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH OIICIRRCOOCIHRHOIOIOOROCRHCHIC(String var0, String var1) {
      return new OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1);
   }

   public static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
      extends com.moonsworth.lunar.client.util.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> {
      private final String IHRIOOCOIIHRHOOCCHORRHHCIIIRHO;
      private final String OOROOHRRRORHRHIRRRRRRRCHIOOIOH;
      private final List<CORCOCICIRIOHROHROIIOOHICCHCRR<String>> HOHHHHHRCHHRIHIRIORCORHRRIIICO = new ArrayList<>();
      private final List<String> COIROHCIICIIIIHCOOIHHCCICHRHII = new ArrayList<>();
      private int modifiers;
      private boolean IIROHHICOHHCOCCORIHCCCHHHOOORC;

      public OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH ROICRICHCIOOHOROHOHCOHCRROIIOR() {
         this.IIROHHICOHHCOCCORIHCCCHHHOOORC = true;
         return this;
      }

      public OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH IRCIIHHICIHRCOCRROCOICRIHHCCHH(CORCOCICIRIOHROHROIIOOHICCHCRR<String> var1) {
         this.HOHHHHHRCHHRIHIRIORCORHRRIIICO.add(var1);
         return this;
      }

      @SafeVarargs
      public final OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH IRCIIHHICIHRCOCRROCOICRIHHCCHH(CORCOCICIRIOHROHROIIOOHICCHCRR<String>... var1) {
         this.HOHHHHHRCHHRIHIRIORCORHRRIIICO.addAll(List.of(var1));
         return this;
      }

      public OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HRHHIRHOCROHRRCRHIHCRIIRIOHHOH(String var1) {
         this.COIROHCIICIIIIHCOOIHHCCICHRHII.add(var1);
         return this;
      }

      public OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH CCIHHRIOOOOCOHRCIHOHROOICIORCC(String... var1) {
         this.COIROHCIICIIIIHCOOIHHCCICHRHII.addAll(List.of(var1));
         return this;
      }

      public OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HHCCIRHCCCIIRHCROHIORHIRHHIORH(
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

      public OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH CIOIIHIOHHHIHIRHORROHHRRIRIOCO() {
         this.modifiers |= 1024;
         return this;
      }

      public OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HHROHOHROOHHHHHRCOHRCIIRHCRHCH() {
         this.modifiers |= 16;
         return this;
      }

      public OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH IHCOOCCRCHCCRRIRCHCOHOHIHRRRIO() {
         this.modifiers |= 8;
         return this;
      }

      public OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH ORIRHOIIHCRIOIOHIIRRRIRORHOORR() {
         this.modifiers |= 16;
         return this;
      }

      public OOROOCCIRCCRHOIOIORIHCHHOOCCOR HCHHOIOCIOORCIOCRRIOIHIOOHCROR() {
         return new OOROOCCIRCCRHOIOIORIHCHHOOCCOR(
            ImmutableSet.copyOf(this.IOHCICCRIHOORICCOOOCHCCIOIOCCH()),
            ImmutableSet.copyOf(this.CRIHIRCIOOROHHRCRCCCCIHCOHIIIR()),
            this.IHRIOOCOIIHRHOOCCHORRHHCIIIRHO,
            this.OOROOHRRRORHRHIRRRRRRRCHIOOIOH,
            ImmutableList.copyOf(this.HOHHHHHRCHHRIHIRIORCORHRRIIICO),
            ImmutableList.copyOf(this.COIROHCIICIIIIHCOOIHHCCICHRHII),
            this.modifiers,
            this.IIROHHICOHHCOCCORIHCCCHHHOOORC
         );
      }

      @Generated
      protected RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, String var2) {
         this.IHRIOOCOIIHRHOOCCHORRHHCIIIRHO = var1;
         this.OOROOHRRRORHRHIRRRRRRRCHIOOIOH = var2;
      }
   }
}
