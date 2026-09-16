package com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.google.gson.JsonObject;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HCHRIROHHHCORIOCROOCHRCIOROOCI;
import com.moonsworth.lunar.client.util.IIOCHOIICCIORCOROIROHICCHIOHIC;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;
import lombok.Generated;
import org.jspecify.annotations.Nullable;

public class RIOOCHICIHRHOHCCCCCHOCCCOHCRHI implements RRCRRCORICCHOHHIRCHIROOHIIOHCO {
   protected final @Nullable CRRRICCRROCOHHOHIICIHORCOORRRH HCOOOHIIICCCCOHRCICIHOICICROOH;
   protected final @Nullable Supplier<String> IIOHHOCCROIOROIOHHCIICRRIRCHRR;
   protected final @Nullable RCIRROCCCIIHCIHCCRHHCCHOHHHCHH IORCOOOIOCHOIOIHICCCCIRICOHICR;
   protected final @Nullable BooleanSupplier CHOROCCOHOICORRHOROIHIOOHCRCRR;
   protected final RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.@Nullable RCIRROCCCIIHCIHCCRHHCCHOHHHCHH IRHCORIHIOIOOHHIRIIHOCHHHCHIRR;
   protected final boolean CICOHIOHCCOORCIOOOORHOOCHRHHCC;
   protected boolean CHOIORORCRRORRRRRICCRIROOICCOR;

   RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
      @Nullable CRRRICCRROCOHHOHIICIHORCOORRRH var1,
      @Nullable Supplier<String> var2,
      @Nullable RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3,
      @Nullable BooleanSupplier var4,
      RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.@Nullable RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var5,
      boolean var6,
      boolean var7
   ) {
      if (var3 != null
         && var1 != com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.CATEGORY
         && var3.getType() != com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.STROKE) {
         throw new IllegalArgumentException("Option icons must be of type 'stroke'");
      }

      this.HCOOOHIIICCCCOHRCICIHOICICROOH = var1;
      this.IIOHHOCCROIOROIOHHCIICRRIRCHRR = var2;
      this.IORCOOOIOCHOIOIHICCCCIRICOHICR = var3;
      this.CHOROCCOHOICORRHOROIHIOOHCRCRR = var4;
      this.IRHCORIHIOIOOHHIRIIHOCHHHCHIRR = var5;
      this.CICOHIOHCCOORCIOOOORHOOCHRHHCC = var6;
      this.CHOIORORCRRORRRRRICCRIROOICCOR = var7;
   }

   RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
      @Nullable CRRRICCRROCOHHOHIICIHORCOORRRH var1,
      @Nullable Supplier<String> var2,
      @Nullable RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3,
      @Nullable BooleanSupplier var4,
      RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.@Nullable RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var5,
      boolean var6
   ) {
      this(var1, var2, var3, var4, var5, var6, var4 != null);
   }

   @Override
   public @Nullable String RCHCRRRHCIRHCOOIOCICOHCHCOOHHO() {
      return this.IIOHHOCCROIOROIOHHCIICRRIRCHRR == null ? null : this.IIOHHOCCROIOROIOHHCIICRRIRCHRR.get();
   }

   @Override
   public @Nullable RCIRROCCCIIHCIHCCRHHCCHOHHHCHH icon() {
      return this.IORCOOOIOCHOIOIHICCCCIRICOHICR;
   }

   @Override
   public @Nullable Runnable CRCHCRIHHRHHIIOIROCIIHHHHIRHRI() {
      return this.IRHCORIHIOIOOHHIRIIHOCHHHCHIRR == null ? null : this.IRHCORIHIOIOOHHIRIIHOCHHHCHIRR.IRHRORHICIHICHHCCIRIHORHOIIHIO();
   }

   @Override
   public boolean RIRHOCHIORCCIIOIIRHOCCCRHHCHHH(HCHRIROHHHCORIOCROOCHRCIOROOCI<?> var1) {
      return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, true);
   }

   public boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HCHRIROHHHCORIOCROOCHRCIOROOCI<?> var1, boolean var2) {
      if (this.CHOROCCOHOICORRHOROIHIOOHCRCRR != null) {
         boolean var3 = this.CHOROCCOHOICORRHOROIHIOOHCRCRR.getAsBoolean();
         if (this.CHOIORORCRRORRRRRICCRIROOICCOR != var3) {
            this.CHOIORORCRRORRRRRICCRIROOICCOR = var3;
            if (var2) {
               IIOCHOIICCIORCOROIROHICCHIOHIC.IIHOCRCHOOCROHIICOCIROOORHIOIR();
            }
         }

         return var3
            || var1.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH(CRICCOOHHHCHOORCICOCOHIHOIRHOO.COIIHHRHOCRHHHCICCIHOHHOCICORR)
               .flatMap(
                  com.moonsworth.lunar.client.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH::RROOOOIIOCRRHIOHCHRIOIIIHCHCCH
               )
               .isPresent();
      } else {
         return var1.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH(CRICCOOHHHCHOORCICOCOHIHOIRHOO.COIIHHRHOCRHHHCICCIHOHHOCICORR)
            .flatMap(
               com.moonsworth.lunar.client.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH::RROOOOIIOCRRHIOHCHRIOIIIHCHCCH
            )
            .isPresent();
      }
   }

   @Override
   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(HCHRIROHHHCORIOCROOCHRCIOROOCI<?> var1, JsonObject var2) {
      if (this.IIOHHOCCROIOROIOHHCIICRRIRCHRR != null) {
         var2.addProperty("name", this.IIOHHOCCROIOROIOHHCIICRRIRCHRR.get());
      }

      if (this.HCOOOHIIICCCCOHRCICIHOICICROOH != null) {
         var2.addProperty("type", this.HCOOOHIIICCCCOHRCICIHOICICROOH.getId());
      }

      var2.addProperty("isHidden", this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, false));
      if (this.IORCOOOIOCHOIOIHICCCCIRICOHICR != null) {
         var2.addProperty("icon", this.IORCOOOIOCHOIOIHICCCCIRICOHICR.ordinal());
      }

      if (this.IRHCORIHIOIOOHHIRIIHOCHHHCHIRR != null) {
         JsonObject var3 = new JsonObject();
         if (this.IRHCORIHIOIOOHHIRIIHOCHHHCHIRR.icon() != null) {
            var3.addProperty("icon", this.IRHCORIHIOIOOHHIRIIHOCHHHCHIRR.icon().ordinal());
         }

         var3.addProperty("text", this.IRHCORIHIOIOOHHIRIIHOCHHHCHIRR.text());
         var2.add("actionButton", var3);
      }
   }

   @Override
   public RRCRRCORICCHOHHIRCHIROOHIIOHCO IIRHCHHOICHRICOOCRORCCIOOIHOIR(BooleanSupplier var1) {
      BooleanSupplier var2;
      if (this.CHOROCCOHOICORRHOROIHIOOHCRCRR != null) {
         var2 = () -> var1.getAsBoolean() || this.CHOROCCOHOICORRHOROIHIOOHCRCRR.getAsBoolean();
      } else {
         var2 = var1;
      }

      return new RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
         this.HCOOOHIIICCCCOHRCICIHOICICROOH,
         this.IIOHHOCCROIOROIOHHCIICRRIRCHRR,
         this.IORCOOOIOCHOIOIHICCCCIRICOHICR,
         var2,
         this.IRHCORIHIOIOOHHIRIIHOCHHHCHIRR,
         this.CICOHIOHCCOORCIOOOORHOOCHRHHCC
      );
   }

   @Generated
   @Override
   public @Nullable CRRRICCRROCOHHOHIICIHORCOORRRH CRHCCHIIHORROIHCROHRCCIOCIOROC() {
      return this.HCOOOHIIICCCCOHRCICIHOICICROOH;
   }

   @Generated
   @Override
   public boolean CRRIHOOHIRHRHHCROHIHHCICRICIIH() {
      return this.CICOHIOHCCOORCIOOOORHOOCHRHHCC;
   }

   protected record RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      private final @Nullable RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HRCRCIHIOOIOHHCROHHOCHCRICIHCI;
      private final String COOORCRCHIHCROCHOCOHHORHRCIORC;
      private final Runnable OCOIRHIIRCCIHRRIIORHHCCCCCHCOI;

      protected RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(@Nullable RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1, String var2, Runnable var3) {
         this.HRCRCIHIOOIOHHCROHHOCHCRICIHCI = var1;
         this.COOORCRCHIHCROCHOCOHHORHRCIORC = var2;
         this.OCOIRHIIRCCIHRRIIORHHCCCCCHCOI = var3;
      }

      public @Nullable RCIRROCCCIIHCIHCCRHHCCHOHHHCHH icon() {
         return this.HRCRCIHIOOIOHHCROHHOCHCRICIHCI;
      }

      public String text() {
         return this.COOORCRCHIHCROCHOCOHHORHRCIORC;
      }

      public Runnable IRHRORHICIHICHHCCIRIHORHOIIHIO() {
         return this.OCOIRHIIRCCIHRRIIORHHCCCCCHCOI;
      }
   }
}
