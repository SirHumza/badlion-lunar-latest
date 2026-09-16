package com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import com.lunarclient.dfu.serialization.Codec;
import com.moonsworth.lunar.client.util.HIHCCHCCOCOHRICOICHRCOIHIIRIHO;
import com.moonsworth.lunar.lib.adventure.text.format.TextColor;
import java.awt.Color;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import lombok.Generated;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Range;
import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

public class OHHRIOHROOIHOROCIRHCHORIHRRRRI
   extends RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO
   implements com.moonsworth.lunar.client.util.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH,
   com.moonsworth.lunar.client.util.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   public static final Codec<Integer> CIIOOHCCCROCCOCIHCIRROCHOIORRO = Codec.withAlternative(
      Codec.INT, com.moonsworth.lunar.client.util.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OHOCCOROIOIOICROOIOHIORHHIHCCO
   );
   private final HICHRCOHCCRHOHCICOOCHOIHCCHIRI ORCCOOHCICROCRHOOIHHHHOIHIIRHR;
   private final RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO IRHRROOHHHHROHIIHIOOOROIHRICRH;
   private final RIROICHCRROROHCCROOCCCCOCHCCRI<com.moonsworth.lunar.client.util.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH> HCCCOCCOHROCIHIHHRHCCCRHOHCOII;
   private final boolean IRHIICCHHRIIIRIRRIIOCHHIIIHCOI;
   private final boolean CCOIRHOCRROCCHCHHHRIHOHICRRHIO;

   protected OHHRIOHROOIHOROCIRHCHORIHRRRRI(
      @HIHCCHCCOCOHRICOICHRCOIHIIRIHO(CHHOHHOIRCCRRCRIHCCOHHRCIHRHII = HIHCCHCCOCOHRICOICHRCOIHIIRIHO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.SETTING) String var1,
      @Nullable Codec<Integer> var2,
      int var3,
      boolean var4,
      boolean var5,
      HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var6,
      RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var7,
      RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<com.moonsworth.lunar.client.util.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH> var8
   ) {
      super(var1, var2, var3);
      this.ORCCOOHCICROCRHOOIHHHHOIHIIRHR = var6.CHCROCIHRRCHHCIHIICOCOCIIHCCOO();
      this.IRHRROOHHHHROHIIHIOOOROIHRICRH = var7.CHCROCIHRRCHHCIHIICOCOCIIHCCOO();
      this.HCCCOCCOHROCIHIHHRHCCCRHOHCOII = (RIROICHCRROROHCCROOCCCCOCHCCRI<com.moonsworth.lunar.client.util.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH>)var8.CHCROCIHRRCHHCIHIICOCOCIIHCCOO();
      this.IRHIICCHHRIIIRIRRIIOCHHIIIHCOI = var4;
      this.CCOIRHOCRROCCHCHHHRIHOHICRRHIO = var5;
   }

   @Override
   protected void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.util.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<HCHRIROHHHCORIOCROOCHRCIOROOCI<?>> var1
   ) {
      super.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1);
      var1.IIHRRHORCRCROCHHOHORCHCROCIHRO(this.ORCCOOHCICROCRHOOIHHHHOIHIIRHR, this.IRHRROOHHHHROHIIHIOOOROIHRICRH, this.HCCCOCCOHROCIHIHHRHCCCRHOHCOII);
   }

   public boolean OOROOCCIRCCRHOIOIORIHCHHOOCCOR(OHHRIOHROOIHOROCIRHCHORIHRRRRI var1) {
      if (!this.ORCCOOHCICROCRHOOIHHHHOIHIIRHR.get()
         || var1.IRHRROOHHHHROHIIHIOOOROIHRICRH.get().equals(this.IRHRROOHHHHROHIIHIOOOROIHRICRH.get())
            && var1.HCCCOCCOHROCIHIHHRHCCCRHOHCOII.get() == this.HCCCOCCOHROCIHIHHRHCCCRHOHCOII.get()) {
         float[] var2 = this.IIRCRHRICROIRIIHRCICICIIORIOOH();
         float[] var3 = var1.IIRCRHRICROIRIIHRCICICIIORIOOH();
         float var4 = Math.abs(var3[0] - var2[0]);
         if (var4 > 0.015F) {
            return false;
         }

         float var5 = Math.abs(var3[1] - var2[1]);
         if (var5 > 0.015F) {
            return false;
         }

         float var6 = Math.abs(var3[2] - var2[2]);
         if (var6 > 0.015F) {
            return false;
         }

         float var7 = Math.abs(var1.getAlpha() - this.getAlpha());
         return var7 <= 4.0F;
      } else {
         return false;
      }
   }

   public boolean ICRIRROOCOHRIRHRHROHCRHROOOIRI() {
      return this.IRHIICCHHRIIIRIRRIIOCHHIIIHCOI;
   }

   @Override
   public boolean RCRHHRIIHHRCRCIHHHCCRIIOCHCRCH() {
      return this.ORCCOOHCICROCRHOOIHHHHOIHIIRHR.get();
   }

   @Override
   public int RRCOIRHOCOOCRHIRIIORRIRHCRORCC() {
      return this.HOIRCIOOCCHCORIOIOHOORROCOCHRH().get();
   }

   @Override
   public boolean OOCOOIIHCHIHOIIOHOHHHHRHCIRHIR() {
      return this.CCOIRHOCRROCCHCHHHRIHOHICRRHIO;
   }

   @Override
   public void OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(@NonNull Integer var1) {
      if (!this.CCOIRHOCRROCCHCHHHRIHOHICRRHIO) {
         var1 = var1 & 16777215 | 0xFF000000;
      }

      super.OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(var1);
   }

   @Override
   public void OOCCCHRCIRHCRCIRHRHHCRIOHICRRC(String var1) {
      if (CIOICHOCCRHORIRHHOOHHOROCCCIOR(var1).isJsonObject()) {
         this.CCHHRCRRIIOCOOCCRHHCRROHRIICOC(var1);
      } else {
         super.OOCCCHRCIRHCRCIRHRHHCRIOHICRRC(var1);
      }
   }

   public void CCHHRCRRIIOCOOCCRHHCRROHRIICOC(String var1) {
      try {
         int var2 = ORIIHHHCORIRHRRHHIIHORHIRRCRHH(var1);
         this.OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(var2);
      } catch (NumberFormatException var11) {
         try {
            JsonElement var3 = JsonParser.parseString(var1);
            if (var3.isJsonObject()) {
               JsonObject var4 = var3.getAsJsonObject();
               if (var4.has("chroma")) {
                  JsonObject var5 = var4.getAsJsonObject("chroma");
                  if (var5.has("chroma")) {
                     this.ORCCOOHCICROCRHOOIHHHHOIHIIRHR.RHRIIOOOCRHIIOORCOCRCHRCCRRCIH(var5.get("chroma").getAsBoolean());
                  }

                  if (var5.has("chromaType")) {
                     this.HCCCOCCOHROCIHIHHRHCCCRHOHCOII
                        .RIROICHCRROROHCCROOCCCCOCHCCRI(var5.get("chromaType"))
                        .ifPresent(this.HCCCOCCOHROCIHIHHRHCCCRHOHCOII::RHRIIOOOCRHIIOORCOCRCHRCCRRCIH);
                  }

                  if (var5.has("chromaSpeed")) {
                     this.IRHRROOHHHHROHIIHIOOOROIHRICRH.OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(var5.get("chromaSpeed").getAsInt());
                  }
               }

               if (var4.has("hex")) {
                  this.OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(ORIIHHHCORIRHRRHHIIHORHIRRCRHH(var4.get("hex").getAsString()));
               } else {
                  float[] var12 = new float[]{-1.0F, -1.0F, -1.0F};
                  if (var4.has("hue")) {
                     var12[0] = var4.get("hue").getAsFloat();
                  }

                  if (var4.has("saturation")) {
                     var12[1] = var4.get("saturation").getAsFloat();
                  }

                  if (var4.has("brightness")) {
                     var12[2] = var4.get("brightness").getAsFloat();
                  }

                  float var6 = -1.0F;
                  if (var4.has("opacity") && this.CCOIRHOCRROCCHCHHHRIHOHICRRHIO) {
                     var6 = var4.get("opacity").getAsFloat();
                  }

                  boolean var7 = var12[0] != -1.0F || var12[1] != -1.0F || var12[2] != -1.0F;
                  if (var7 || var6 != -1.0F) {
                     int var8 = 0;
                     if (var7) {
                        if (var12[0] != -1.0F && var12[1] != -1.0F && var12[2] != -1.0F) {
                           var8 = com.moonsworth.lunar.client.util.OCOHORHCROHICRRIHCIHHRRCIHICRI.ICICIOCHHHIHOCHCOHORIHRCOHHOCR(var12[0], var12[1], var12[2]);
                        } else {
                           float[] var9 = this.IIRCRHRICROIRIIHRCICICIIORIOOH();
                           var8 = com.moonsworth.lunar.client.util.OCOHORHCROHICRRIHCIHHRRCIHICRI.ICICIOCHHHIHOCHCOHORIHRCOHHOCR(
                              var12[0] != -1.0F ? var12[0] : var9[0], var12[1] != -1.0F ? var12[1] : var9[1], var12[2] != -1.0F ? var12[2] : var9[2]
                           );
                        }
                     }

                     if (var6 != -1.0F) {
                        var8 = com.moonsworth.lunar.client.util.OCOHORHCROHICRRIHCIHHRRCIHICRI.CRICCOOHHHCHOORCICOCOHIHOIRHOO(var8, var6);
                     }

                     this.OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(var8);
                  }
               }
            }
         } catch (JsonSyntaxException var10) {
            var10.printStackTrace();
         }
      }
   }

   public static int ORIIHHHCORIRHRRHHIIHORHIRRCRHH(String var0) {
      if (var0.startsWith("#")) {
         var0 = var0.substring(1);
      }

      return (int)Long.parseLong(var0, 16);
   }

   public void CORCOCICIRIOHROHROIIOOHICCHCRR(OHHRIOHROOIHOROCIRHCHORIHRRRRI var1) {
      this.ORIHICRCCORORROOIICCOCCIIHOOHR().RHRIIOOOCRHIIOORCOCRCHRCCRRCIH(var1.ORIHICRCCORORROOIICCOCCIIHOOHR().get());
      this.HOIRCIOOCCHCORIOIOHOORROCOCHRH().OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(var1.HOIRCIOOCCHCORIOIOHOORROCOCHRH().get());
      this.OCIHHIIOCRHCCOOHROIIIICOHCIRCI().RHRIIOOOCRHIIOORCOCRCHRCCRRCIH(var1.OCIHHIIOCRHCCOOHROIIIICOHCIRCI().get());
      this.OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(var1.CHRHCORIRCORHHIIROCRORHIROICOC());
   }

   @Override
   public void HIHHOCRHHRORRHHRORRRIIHHORIHOC(Object var1) {
      if (var1 instanceof OHHRIOHROOIHOROCIRHCHORIHRRRRI var2) {
         this.ORIHICRCCORORROOIICCOCCIIHOOHR().HIHHOCRHHRORRHHRORRRIIHHORIHOC(var2.ORIHICRCCORORROOIICCOCCIIHOOHR().get());
         this.HOIRCIOOCCHCORIOIOHOORROCOCHRH().HIHHOCRHHRORRHHRORRRIIHHORIHOC(var2.HOIRCIOOCCHCORIOIOHOORROCOCHRH().get());
         this.OCIHHIIOCRHCCOOHROIIIICOHCIRCI().HIHHOCRHHRORRHHRORRRIIHHORIHOC(var2.OCIHHIIOCRHCCOOHROIIIICOHCIRCI().get());
         if (!this.CCOIRHOCRROCCHCHHHRIHOHICRRHIO) {
            var1 = var2.CHRHCORIRCORHHIIROCRORHIROICOC() & 16777215 | 0xFF000000;
         } else {
            var1 = var2.CHRHCORIRCORHHIIROCRORHIROICOC();
         }
      }

      if (var1 instanceof Integer var3) {
         super.HIHHOCRHHRORRHHRORRRIIHHORIHOC(var3);
      }
   }

   public Integer CHRHCORIRCORHHIIROCRORHIROICOC() {
      int var1 = super.get();
      if (!this.CCOIRHOCRROCCHCHHHRIHOHICRRHIO) {
         var1 = var1 & 16777215 | 0xFF000000;
      }

      return var1;
   }

   public Integer CRHRHRIOIHRCHRIORHRRCHHIHCOCCC(float var1) {
      if (this.ORCCOOHCICROCRHOOIHHHHOIHIIRHR.get()) {
         var1 = com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.ROHHOOHOHCHRIICCCHCOHCORROHRIH()
                  .getScaledWidth()
               + com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.ROHHOOHOHCHRIICCCHCOHCORROHRIH()
                  .getScaledHeight()
            - var1;
         return this.HCCCOCCOHROCIHIHHRHCCCRHOHCOII.get().color().apply(var1, this);
      } else {
         return this.CHRHCORIRCORHHIIROCRORHIROICOC();
      }
   }

   @Override
   public int getColor() {
      return this.CHRHCORIRCORHHIIROCRORHIROICOC();
   }

   @Override
   public int OCOHORHCROHICRRIHCIHHRRCIHICRI(float var1) {
      return this.CRHRHRIOIHRCHRIORHRRCHHIHCOCCC(var1);
   }

   @Override
   public void RHIOICROIRRRIROHIHICIRRHCCIRHO(int var1) {
      this.OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(var1);
   }

   public void IHCRCORHOIRRIRIHOHCIRIOHRIHIIO() {
      this.CRCCHRRRHCCCIHORHHICRROIHCOROC(com.moonsworth.lunar.client.util.IIRHCHHOICHRICOOCRORCCIOOIHOIR.HHHRRCCHRCHCRORIIRIHOHCCOIRIRH.nextInt() & 16777215);
   }

   @Override
   protected com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ICICIOCHHHIHOCHCOHORIHRCOHHOCR<?> CIOHHCORHRCCRICCCORIHCRHCCCRRR(
      com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
   ) {
      return new com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(
         this, var1
      );
   }

   @Override
   public void reset() {
      this.ORCCOOHCICROCRHOOIHHHHOIHIIRHR.reset();
      this.IRHRROOHHHHROHIIHIOOOROIHRICRH.reset();
      this.HCCCOCCOHROCIHIHHRHCCCRHOHCOII.reset();
      super.reset();
   }

   @Override
   public boolean isDefault() {
      return super.isDefault()
         && this.ORCCOOHCICROCRHOOIHHHHOIHIIRHR.isDefault()
         && this.IRHRROOHHHHROHIIHIOOOROIHRICRH.isDefault()
         && this.HCCCOCCOHROCIHIHHRHCCCRHOHCOII.isDefault();
   }

   @Generated
   public HICHRCOHCCRHOHCICOOCHOIHCCHIRI ORIHICRCCORORROOIICCOCCIIHOOHR() {
      return this.ORCCOOHCICROCRHOOIHHHHOIHIIRHR;
   }

   @Generated
   public RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO HOIRCIOOCCHCORIOIOHOORROCOCHRH() {
      return this.IRHRROOHHHHROHIIHIOOOROIHRICRH;
   }

   @Generated
   public RIROICHCRROROHCCROOCCCCOCHCCRI<com.moonsworth.lunar.client.util.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH> OCIHHIIOCRHCCOOHROIIIICOHCIRCI() {
      return this.HCCCOCCOHROCIHIHHRHCCCRHOHCOII;
   }

   public static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
      extends com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI<OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH, OHHRIOHROOIHOROCIRHCHORIHRRRRI> {
      private boolean IRHIICCHHRIIIRIRRIIOCHHIIIHCOI = true;
      private boolean CCOIRHOCRROCCHCHHHRIHOHICRRHIO = true;
      private final HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH CCOOHCCOHROOOCOIHIHHCHHRCCROHR = IOHHOIIOCRHCHHCRORICCOHOHROOIH.CHCHHCCOHHIIHICCHCCICHIOCHOCOC(
         "chroma"
      );
      private final RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH CIICIOIIIROOHRIIOCIICCRRRCRHOC = IOHHOIIOCRHCHHCRORICCOHOHROOIH.ICHOCHHROIHCROICCIRIHHCHRHROCO(
            "chromaSpeed"
         )
         .RCIICICHIIRIIRHHROCOOOHRROOIIC(40)
         .OCIROOIHIHRHOCCHIIIROOCRIIOCRR(1, 100);
      private final RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<com.moonsworth.lunar.client.util.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH> CROHRIOCHRHOIRIOHIIIRRRROORROO = IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         "chromaType", com.moonsworth.lunar.client.util.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.WAVE
      );

      protected RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         @HIHCCHCCOCOHRICOICHRCOIHIIRIHO(CHHOHHOIRCCRRCRIHCCOHHRCIHRHII = HIHCCHCCOCOHRICOICHRCOIHIIRIHO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.SETTING) String var1
      ) {
         super(var1);
      }

      @Override
      protected com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH ORCHRRHCCOIHHRROOHROROROOHOHIO() {
         return com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.COLOR_PICKER;
      }

      @Override
      protected Codec<Integer> CIHHRHHHCCHCCCCCIRRORHICROCHHR() {
         return OHHRIOHROOIHOROCIRHCHORIHRRRRI.CIIOOHCCCROCCOCIHCIRROCHOIORRO;
      }

      @Override
      protected @Nullable Function<OHHRIOHROOIHOROCIRHCHORIHRRRRI, HHCCIRHCCCIIRHCROHIORHIRHHIORH> OOCCCOICCIHIIHRRRHHROIRIOROCCR() {
         return var1 -> new com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.CRRRICCRROCOHHOHIICIHORCOORRRH(var1) {
            @Override
            public JsonElement provide() {
               OHHRIOHROOIHOROCIRHCHORIHRRRRI var1x = (OHHRIOHROOIHOROCIRHCHORIHRRRRI)this.option;
               int var2 = var1x.CHRHCORIRCORHHIIROCRORHIROICOC();
               int var3 = var2 << 8 | var2 >>> 24;
               JsonObject var4 = super.provide().getAsJsonObject();
               var4.addProperty("value", "#" + String.format("%08x", var3));
               JsonObject var5 = new JsonObject();
               com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var6 = var1x.ORCCOOHCICROCRHOOIHHHHOIHIIRHR
                  .IHCRORHRORIICHRHRCHRRIRRHHOCOO(
                     com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.CRHRCRCCHCICIRIRCIRHRCIHCIRHIO
                  );
               if (var6 != null) {
                  var5.add("chroma", var6.provide());
               }

               var6 = var1x.IRHRROOHHHHROHIIHIOOOROIHRICRH
                  .IHCRORHRORIICHRHRCHRRIRRHHOCOO(
                     com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.CRHRCRCCHCICIRIRCIRHRCIHCIRHIO
                  );
               if (var6 != null) {
                  var5.add("chromaSpeed", var6.provide());
               }

               var6 = var1x.HCCCOCCOHROCIHIHHRHCCCRHOHCOII
                  .IHCRORHRORIICHRHRCHRRIRRHHOCOO(
                     com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.CRHRCRCCHCICIRIRCIRHRCIHCIRHIO
                  );
               if (var6 != null) {
                  var5.add("chromaType", var6.provide());
               }

               var4.add("chroma", var5);
               var4.addProperty("hex", String.format("%08x", var2));
               float[] var7 = com.moonsworth.lunar.client.util.OCOHORHCROHICRRIHCIHHRRCIHICRI.ICOIOIRCHCIOCHCOHOHIOOCORIICRO(var2);
               var4.addProperty("hue", var7[0]);
               var4.addProperty("saturation", var7[1]);
               var4.addProperty("brightness", var7[2]);
               var4.addProperty("alpha", com.moonsworth.lunar.client.util.OCOHORHCROHICRRIHCIHHRRCIHICRI.HRCRHOOIROHCIIRHIIROHHROHRHHCR(var2));
               return var4;
            }
         };
      }

      @Contract("_->this")
      public OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RHOORRIIOCHIRRHOHOOHIROHCRICRO(
         Consumer<HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> var1
      ) {
         var1.accept(this.CCOOHCCOHROOOCOIHIHHCHHRCCROHR);
         return this;
      }

      @Contract("_->this")
      public OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH CCHHCIRHICHHHHRRIHIORCCORCCIHR(
         Consumer<RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> var1
      ) {
         var1.accept(this.CIICIOIIIROOHRIIOCIICCRRRCRHOC);
         return this;
      }

      @Contract("_->this")
      public OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH COIHORRCHRRCHOCIRHHRRIOIHRIHCC(
         Consumer<RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<com.moonsworth.lunar.client.util.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH>> var1
      ) {
         var1.accept(this.CROHRIOCHRHOIRIOHIIIRRRROORROO);
         return this;
      }

      @Contract("_->this")
      public OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(TextColor var1) {
         return this.RCIICICHIIRIIRHHROCOOOHRROOIIC(var1.value());
      }

      @Contract("_->this")
      public OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HHCCIRHCCCIIRHCROHIORHIRHHIORH(
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RRCRRCORICCHOHHIRCHIROOHIIOHCO var1
      ) {
         return this.RCIICICHIIRIIRHHROCOOOHRROOIIC(Objects.requireNonNull(var1.getAdventureColor()).value() | 0xFF000000);
      }

      @Contract("_->this")
      public OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HHCCIRHCCCIIRHCROHIORHIRHHIORH(Color var1) {
         return this.RCIICICHIIRIIRHHROCOOOHRROOIIC(var1.getRGB());
      }

      @Contract("_,_,_,_->this")
      public OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH IHIRRIIORRHORHRORIHOROIRCORCOO(
         @Range(from = 0L, to = 255L) int var1,
         @Range(from = 0L, to = 255L) int var2,
         @Range(from = 0L, to = 255L) int var3,
         @Range(from = 0L, to = 255L) int var4
      ) {
         return this.RCIICICHIIRIIRHHROCOOOHRROOIIC(
            com.moonsworth.lunar.client.util.OCOHORHCROHICRRIHCIHHRRCIHICRI.ORHIOICIOCRRHOOCOHRORIHICHRCRR(var1, var2, var3, var4)
         );
      }

      @Contract("_,_,_->this")
      public OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH IOHIHIIHCCCCCIHRORIOIOORCIOHII(
         @Range(from = 0L, to = 255L) int var1, @Range(from = 0L, to = 255L) int var2, @Range(from = 0L, to = 255L) int var3
      ) {
         return this.IHIRRIIORRHORHRORIHOROIRCORCOO(var1, var2, var3, 255);
      }

      @Contract("_,_,_,_->this")
      public OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HICRRICCHCCROOHHCHOCOCCHOIHHOC(
         @Range(from = 0L, to = 1L) float var1,
         @Range(from = 0L, to = 1L) float var2,
         @Range(from = 0L, to = 1L) float var3,
         @Range(from = 0L, to = 1L) float var4
      ) {
         return this.RCIICICHIIRIIRHHROCOOOHRROOIIC(
            com.moonsworth.lunar.client.util.OCOHORHCROHICRRIHCIHHRRCIHICRI.IHIRRIIORRHORHRORIHOROIRCORCOO(var1, var2, var3, var4)
         );
      }

      @Contract("_,_,_->this")
      public OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH ORHIOICIOCRRHOOCOHRORIHICHRCRR(
         @Range(from = 0L, to = 1L) float var1, @Range(from = 0L, to = 1L) float var2, @Range(from = 0L, to = 1L) float var3
      ) {
         return this.HICRRICCHCCROOHHCHOCOCCHOIHHOC(var1, var2, var3, 1.0F);
      }

      @Contract("->this")
      public OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH CIHRIRCICHROCRCCOCOROOIOIORCII() {
         this.CCOOHCCOHROOOCOIHIHHCHHRCCROHR.RICIORHICRROHOCHRRCRIHCROOCIIC(true);
         return this;
      }

      @Contract("->this")
      public OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH OCCHOIIHOCRIHROOHHROROOIICHIHC() {
         this.IRHIICCHHRIIIRIRRIIOCHHIIIHCOI = false;
         return this;
      }

      @Contract("->this")
      public OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RCIORIIRHRHOHHOHRHOROOIICIRHIR() {
         this.CCOIRHOCRROCCHCHHHRIHOHICRRHIO = false;
         return this;
      }

      @Contract("_->this")
      public OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HOHCOOORCOCOCIIOIORHCRCRCRHOOI(boolean var1) {
         this.IRHIICCHHRIIIRIRRIIOCHHIIIHCOI = var1;
         return this;
      }

      @Contract("_->this")
      public OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RROIHOHRRCRICIIRHCCHOCOROOCOOR(boolean var1) {
         this.CCOIRHOCRROCCHCHHHRIHOHICRRHIO = var1;
         return this;
      }

      protected OHHRIOHROOIHOROCIRHCHORIHRRRRI ICOIHCIHHCOIOORHOIIHOIOOOHIOHI() {
         return new OHHRIOHROOIHOROCIRHCHORIHRRRRI(
            this.RROHIIOCCIOHRHHIIRIOIRHHIOCRRO,
            this.codec,
            this.IOCHHHHOCICCRICCCCRCCCRRCRCRIR,
            this.IRHIICCHHRIIIRIRRIIOCHHIIIHCOI,
            this.CCOIRHOCRROCCHCHHHRIHOHICRRHIO,
            this.CCOOHCCOHROOOCOIHIHHCHHRCCROHR,
            this.CIICIOIIIROOHRIIOCIICCRRRCRHOC,
            this.CROHRIOCHRHOIRIOHIIIRRRROORROO
         );
      }
   }
}
