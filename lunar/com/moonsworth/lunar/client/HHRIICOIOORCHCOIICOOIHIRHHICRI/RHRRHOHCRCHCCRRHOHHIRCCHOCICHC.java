package com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI;

import com.lunarclient.dfu.serialization.Codec;
import com.moonsworth.lunar.client.util.HIHCCHCCOCOHRICOICHRCOIHIIRIHO;
import it.unimi.dsi.fastutil.chars.Char2ObjectFunction;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import lombok.Generated;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Nullable;

public class RHRRHOHCRCHCCRRHOHHIRCCHOCICHC
   extends HRCHROOHRIHCRCRHRIIROCIRHOIRHH<String>
   implements com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CRRRICCRROCOHHOHIICIHORCOORRRH {
   private boolean OICORIRHHHHHHCORHCIORRCORCRIRI;
   private final int HRCOOORIRRHOICCOOHIIRCOHIHOIRO;
   private final List<Consumer<String>> HCORCROORHRRCHHCOCIROROCHOCOIR;
   private final List<Consumer<String>> IRRCRHIRIRIOCOHHRROOHHCRCOHROH;
   private final Function<String, String> RCCIOOOICRIHORIHIHOOHOORHHIRCI;
   private final Char2ObjectFunction<@Nullable Character> OCCRCIOIOROCHCRCHIOORCOICRORHO;

   public RHRRHOHCRCHCCRRHOHHIRCCHOCICHC(
      @HIHCCHCCOCOHRICOICHRCOIHIIRIHO(CHHOHHOIRCCRRCRIHCCOHHRCIHRHII = HIHCCHCCOCOHRICOICHRCOIHIIRIHO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.SETTING) String var1,
      @Nullable Codec<String> var2,
      String var3,
      int var4,
      List<Consumer<String>> var5,
      List<Consumer<String>> var6,
      Function<String, String> var7,
      Char2ObjectFunction<@Nullable Character> var8
   ) {
      super(var1, var2, var3);
      this.HRCOOORIRRHOICCOOHIIRCOHIHOIRO = var4;
      this.HCORCROORHRRCHHCOCIROROCHOCOIR = var5;
      this.IRRCRHIRIRIOCOHHRROOHHCRCOHROH = var6;
      this.RCCIOOOICRIHORIHIHOOHOORHHIRCI = var7;
      this.OCCRCIOIOROCHCRCHIOORCOICRORHO = var8;
   }

   public static boolean CORCOCICIRIOHROHROIIOOHICCHCRR(char var0) {
      return var0 == '\b' || var0 == 0;
   }

   public boolean isEmpty() {
      return this.get() == null || this.get().trim().isEmpty();
   }

   @Override
   protected com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ICICIOCHHHIHOCHCOHORIHRCOHHOCR<?> CIOHHCORHRCCRICCCORIHCRHCCCRRR(
      com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
   ) {
      com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCCCROCHCICCROHCOCCRRROCIIHCCH var2 = new com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCCCROCHCICCROHCOCCRRROCIIHCCH(
         this, this.HRCOOORIRRHOICCOOHIIRCOHIHOIRO, var1
      );
      var2.ICRIIIOCHROORCICOCHIIHOCIHHCRH().OCICOOCOOOIRCCORCOCIRCCRRHIHRC().CORCOCICIRIOHROHROIIOOHICCHCRR(this.RCCIOOOICRIHORIHIHOOHOORHHIRCI);
      return var2;
   }

   @Override
   public boolean isEditing() {
      return this.OICORIRHHHHHHCORHCIORRCORCRIRI;
   }

   @Generated
   public boolean OHROHOCORIIHOHIORHROHOIHIRRCCC() {
      return this.OICORIRHHHHHHCORHCIORRCORCRIRI;
   }

   @Generated
   public void IHCRHHHRRRRHICCHOROCRHHCRCRHOO(boolean var1) {
      this.OICORIRHHHHHHCORHCIORRCORCRIRI = var1;
   }

   @Generated
   public List<Consumer<String>> RHHIRHHHROHROHIHIOOHIRCIHIRCIO() {
      return this.HCORCROORHRRCHHCOCIROROCHOCOIR;
   }

   @Generated
   public List<Consumer<String>> ORHHOIHRCIHORCHOIROHCIOHICRIOH() {
      return this.IRRCRHIRIRIOCOHHRROOHHCRCOHROH;
   }

   @Generated
   public Char2ObjectFunction<@Nullable Character> IOIHCORIRROOIRHRCRCCROHHOORIOH() {
      return this.OCCRCIOIOROCHCRCHIOORCOICRORHO;
   }

   public static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
      extends com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH<RHRRHOHCRCHCCRRHOHHIRCCHOCICHC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH, RHRRHOHCRCHCCRRHOHHIRCCHOCICHC, String> {
      private int HRCOOORIRRHOICCOOHIIRCOHIHOIRO = 256;
      private final List<Consumer<String>> RHHHCIRICIHRROOIIOICRCORRHCCOO = new ArrayList<>(0);
      private final List<Consumer<String>> ROORCIRROOCCIROHIRHHOCICICIIRR = new ArrayList<>(0);
      private Function<String, String> CIOCRCRRRHHCRHOCORCCHIICRHRROR = var0 -> var0;
      private Char2ObjectFunction<@Nullable Character> ORRCRIHIHHRHIHHCIRIOHHCIIHORCC = var0 -> var0;

      @Override
      protected com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH ORCHRRHCCOIHHRROOHROROROOHOHIO() {
         return com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.TEXT;
      }

      @Nullable
      @Override
      protected Codec<String> CIHHRHHHCCHCCCCCIRRORHICROCHHR() {
         return Codec.STRING;
      }

      protected RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         @HIHCCHCCOCOHRICOICHRCOIHIIRIHO(CHHOHHOIRCCRRCRIHCCOHHRCIHRHII = HIHCCHCCOCOHRICOICHRCOIHIIRIHO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.SETTING) String var1
      ) {
         super(var1);
      }

      @Contract("_->this")
      public RHRRHOHCRCHCCRRHOHHIRCCHOCICHC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH OHIROCOCCHORRCCHIOICOCOHRHORCC(int var1) {
         this.HRCOOORIRRHOICCOOHIIRCOHIHOIRO = var1;
         return this;
      }

      @Contract("_->this")
      public RHRRHOHCRCHCCRRHOHHIRCCHOCICHC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RICRIHOOHROHICCHHIIHRHCORHIOHR(Consumer<String> var1) {
         this.RHHHCIRICIHRROOIIOICRCORRHCCOO.add(var1);
         return this;
      }

      @Contract("_->this")
      public RHRRHOHCRCHCCRRHOHHIRCCHOCICHC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RIIHIHHCRHCHRCICHOROHCHIIHCICH(Consumer<String> var1) {
         this.ROORCIRROOCCIROHIRHHOCICICIIRR.add(var1);
         return this;
      }

      @Contract("_->this")
      public RHRRHOHCRCHCCRRHOHHIRCCHOCICHC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH IHHCHHHCRIHOOCOIOOCRIIICIOROIR(Function<String, String> var1) {
         this.CIOCRCRRRHHCRHOCORCCHIICRHRROR = var1;
         return this;
      }

      @Contract("_->this")
      public RHRRHOHCRCHCCRRHOHHIRCCHOCICHC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Char2ObjectFunction<@Nullable Character> var1) {
         this.ORRCRIHIHHRHIHHCIRIOHHCIIHORCC = var1;
         return this;
      }

      protected RHRRHOHCRCHCCRRHOHHIRCCHOCICHC RROIIHHIIHOIOIOROCROHHCIROICOH() {
         if (this.defaultValue == null) {
            this.defaultValue = "";
         }

         return new RHRRHOHCRCHCCRRHOHHIRCCHOCICHC(
            this.RROHIIOCCIOHRHHIIRIOIRHHIOCRRO,
            this.codec,
            this.defaultValue,
            this.HRCOOORIRRHOICCOOHIIRCOHIHOIRO,
            this.RHHHCIRICIHRROOIIOICRCORRHCCOO,
            this.ROORCIRROOCCIROHIRHHOCICICIIRR,
            this.CIOCRCRRRHHCRHOCORCCHIICRHRROR,
            this.ORRCRIHIHHRHIHHCIRIOHHCIIHORCC
         );
      }
   }
}
