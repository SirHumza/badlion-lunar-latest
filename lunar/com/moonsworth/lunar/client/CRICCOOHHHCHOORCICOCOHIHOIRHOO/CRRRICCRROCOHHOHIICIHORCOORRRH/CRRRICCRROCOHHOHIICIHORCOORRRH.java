package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.moonsworth.lunar.client.util.IORRORCRRHRRORHIRHRROHCRRIHRII;
import java.util.Set;
import lombok.Generated;

public class CRRRICCRROCOHHOHIICIHORCOORRRH
   implements com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI,
   com.moonsworth.lunar.client.OHHRIOHROOIHOROCIRHCHORIHRRRRI.CRRRICCRROCOHHOHIICIHORCOORRRH {
   private final String IRCCIIOCCIOROROICOROIHRCORRCHI;
   private final Set<com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH> RHIHIOCRCORICRCCRRIHHHCROCRHRC;
   private final Set<String> IIHORHOIOCRROHHCRICHCCHROCCICR;
   private final Set<String> IOOCCRCOCOHCHOIHOIIOIRCOIROOHO;
   private final boolean OHOCIRRIRHORIRHIIHRCOCOCICCHHO;
   private final boolean IOOHORRRHCCHIOORRHCIOCRCICRRHI;

   @Override
   public boolean HOIIORIICHCCORIIHCRHRIROICIRRO() {
      return this.IOOHORRRHCCHIOORRHCIOCRCICRRHI;
   }

   @Override
   public String getLanguagePath() {
      return this.IRCCIIOCCIOROROICOROIHRCORRCHI + ".details";
   }

   @Override
   public String getName() {
      return this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI("name");
   }

   @Override
   public String getDescription() {
      return this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI("description");
   }

   @Override
   public String IRCIIHHICIHRCOCRROCOICRIHHCCHH(String var1, Object... var2) {
      return com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
         .CCHHHHCICRCCCIOOIOICOOCRCRHCCR()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.IRCCIIOCCIOROROICOROIHRCORRCHI + ".info", var1, var2);
   }

   @Override
   public com.moonsworth.lunar.client.OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RIIRCHROOOOORRCIRIOCHCOIOHRRHH(
      String var1
   ) {
      return IORRORCRRHRRORHIRHRROHCRRIHRII.RICRRCRROIHCOOOCHCRROCHIOCOORI(
         com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
            .CCHHHHCICRCCCIOOIOICOOCRCRHCCR()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.IRCCIIOCCIOROROICOROIHRCORRCHI + ".info", var1)
      );
   }

   @Generated
   @Override
   public String toString() {
      return "FeatureDetailsImpl(languagePath="
         + this.getLanguagePath()
         + ", categories="
         + this.CCCCRRHICIRRIIRCIRROOROHRCRIRI()
         + ", aliases="
         + this.HRROOHIHRHIOIOIRHHRIROOOHRORRH()
         + ", originalAuthors="
         + this.OROIRHIOOCCCHRCICICCHRRHIIRRCR()
         + ", isVanilla="
         + this.isVanilla()
         + ", allowsKeybind="
         + this.IOOHORRRHCCHIOORRHCIOCRCICRRHI
         + ")";
   }

   @Generated
   public CRRRICCRROCOHHOHIICIHORCOORRRH(
      String var1,
      Set<com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH> var2,
      Set<String> var3,
      Set<String> var4,
      boolean var5,
      boolean var6
   ) {
      this.IRCCIIOCCIOROROICOROIHRCORRCHI = var1;
      this.RHIHIOCRCORICRCCRRIHHHCROCRHRC = var2;
      this.IIHORHOIOCRROHHCRICHCCHROCCICR = var3;
      this.IOOCCRCOCOHCHOIHOIIOIRCOIROOHO = var4;
      this.OHOCIRRIRHORIRHIIHRCOCOCICCHHO = var5;
      this.IOOHORRRHCCHIOORRHCIOCRCICRRHI = var6;
   }

   @Generated
   @Override
   public Set<com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH> CCCCRRHICIRRIIRCIRROOROHRCRIRI() {
      return this.RHIHIOCRCORICRCCRRIHHHCROCRHRC;
   }

   @Generated
   @Override
   public Set<String> HRROOHIHRHIOIOIRHHRIROOOHRORRH() {
      return this.IIHORHOIOCRROHHCRICHCCHROCCICR;
   }

   @Generated
   @Override
   public Set<String> OROIRHIOOCCCHRCICICCHRRHIIRRCR() {
      return this.IOOCCRCOCOHCHOIHOIIOIRCOIROOHO;
   }

   @Generated
   @Override
   public boolean isVanilla() {
      return this.OHOCIRRIRHORIRHIIHRCOCOCICCHHO;
   }
}
