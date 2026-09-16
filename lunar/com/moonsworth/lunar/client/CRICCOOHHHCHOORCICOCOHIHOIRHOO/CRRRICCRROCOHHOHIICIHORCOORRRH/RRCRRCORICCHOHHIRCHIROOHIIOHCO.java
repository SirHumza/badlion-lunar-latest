package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.google.gson.JsonObject;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.function.Supplier;
import lombok.Generated;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class RRCRRCORICCHOHHIRCHIROOHIIOHCO
   implements com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH,
   com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.RHOCHHIRRCHHHOHOIRROIROHHHIHIO {
   @Nullable
   private final RCIROOOOICRHCCRRCIORHHIRCOIIIC COOICOICHCOORRHRHHCOHIHCOCOIOH;
   @Nullable
   private final RCIROOOOICRHCCRRCIORHHIRCOIIIC ICIRORCCIIOCCROCCCOHHCHROOHIRI;
   @NotNull
   private final Supplier<String> HOOIRCHCHRRRCHOORCOOORHRIICROH;
   private boolean RHHIIHHCOIOICRIIOHOHOHIICICOIH;
   private long lastModified;
   private boolean HHRRORICOOHHOICRRHCOCCHHRRRROH;

   @Override
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      float var2,
      float var3,
      float var4,
      float var5,
      com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var6,
      boolean var7
   ) {
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, this.HOOIRCHCHRRRCHOORCOOORHRIICROH.get(), var2, var3, var4, var5);
   }

   protected void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      String var2,
      float var3,
      float var4,
      float var5,
      float var6
   ) {
      float var7 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HRRIOIRCCHIICOOHHRCIHCCHCORICR().bridge$getStringWidth(var2);
      float var8 = var3 + var5 / 2.0F - var7 / 2.0F;
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IICCOOCHCHROORHHIIHROHCCRHRCOR.HRRIOIRCCHIICOOHHRCIHCCHCORICR(), var2, var8, var4 + var6 / 2.0F, -1, true);
   }

   @Override
   public void load(JsonObject var1) {
      if (var1.has("seen")) {
         this.IOIOHIORIROHRRCOOOHCROHORCOIIH(var1.get("seen").getAsBoolean());
      }

      if (var1.has("lastModified")) {
         this.CRICCOOHHHCHOORCICOCOHIHOIRHOO(var1.get("lastModified").getAsLong());
      }

      if (var1.has("favorite")) {
         this.IIOCHOIICCIORCOROIROHICCHIOHIC(var1.get("favorite").getAsBoolean());
      }
   }

   @Override
   public void HHCCIRHCCCIIRHCROHIORHIRHHIORH(JsonObject var1) {
      if (this.HIRCHOHIHROROIRRIOCRCCIHOHCOCC()) {
         var1.addProperty("seen", true);
      }

      if (this.getLastModified() != 0L) {
         var1.addProperty("lastModified", this.getLastModified());
      }

      if (this.OIRORIRRIICROHIHOCOOCOCOIRRRHI()) {
         var1.addProperty("favorite", true);
      }
   }

   @Nullable
   @Generated
   @Override
   public RCIROOOOICRHCCRRCIORHHIRCOIIIC RRRHICCIOOIIHOCIHORCIROICRRRHI() {
      return this.COOICOICHCOORRHRHHCOHIHCOCOIOH;
   }

   @Nullable
   @Generated
   @Override
   public RCIROOOOICRHCCRRCIORHHIRCOIIIC OOORHHCRROHOHRIHCOHIOHIRRCOOCH() {
      return this.ICIRORCCIIOCCROCCCOHHCHROOHIRI;
   }

   @NotNull
   @Generated
   public Supplier<String> CCRHHHHHOCHOROIOIOOORRIRCOCIOO() {
      return this.HOOIRCHCHRRRCHOORCOOORHRIICROH;
   }

   @Generated
   @Override
   public boolean HIRCHOHIHROROIRRIOCRCCIHOHCOCC() {
      return this.RHHIIHHCOIOICRIIOHOHOHIICICOIH;
   }

   @Generated
   @Override
   public long getLastModified() {
      return this.lastModified;
   }

   @Generated
   @Override
   public boolean OIRORIRRIICROHIHOCOOCOCOIRRRHI() {
      return this.HHRRORICOOHHOICRRHCOCCHHRRRROH;
   }

   @Generated
   public RRCRRCORICCHOHHIRCHIROOHIIOHCO(
      @Nullable RCIROOOOICRHCCRRCIORHHIRCOIIIC var1,
      @Nullable RCIROOOOICRHCCRRCIORHHIRCOIIIC var2,
      @NotNull Supplier<String> var3,
      boolean var4,
      long var5,
      boolean var7
   ) {
      if (var3 == null) {
         throw new NullPointerException("thumbnailSupplier is marked non-null but is null");
      }

      this.COOICOICHCOORRHRHHCOHIHCOCOIOH = var1;
      this.ICIRORCCIIOCCROCCCOHHCHROOHIRI = var2;
      this.HOOIRCHCHRRRCHOORCOOORHRIICROH = var3;
      this.RHHIIHHCOIOICRIIOHOHOHIICICOIH = var4;
      this.lastModified = var5;
      this.HHRRORICOOHHOICRRHCOCCHHRRRROH = var7;
   }

   @Generated
   @Override
   public void IOIOHIORIROHRRCOOOHCROHORCOIIH(boolean var1) {
      this.RHHIIHHCOIOICRIIOHOHOHIICICOIH = var1;
   }

   @Generated
   @Override
   public void CRICCOOHHHCHOORCICOCOHIHOIRHOO(long var1) {
      this.lastModified = var1;
   }

   @Generated
   @Override
   public void IIOCHOIICCIORCOROIROHICCHIOHIC(boolean var1) {
      this.HHRRORICOOHHOICRRHCOCCHHRRRROH = var1;
   }
}
