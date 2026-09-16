package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import java.util.Iterator;

public abstract class RHOCHHIRRCHHHOHOIRROIROHHHIHIO<T>
   implements com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RRCRRCORICCHOHHIRCHIROOHIIOHCO {
   public RHOCHHIRRCHHHOHOIRROIROHHHIHIO<T> unwrappingSerializer(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.RIROICHCRROROHCCROOCCCCOCHCCRI var1
   ) {
      return this;
   }

   public RHOCHHIRRCHHHOHOIRROIROHHHIHIO<T> replaceDelegatee(RHOCHHIRRCHHHOHOIRROIROHHHIHIO<?> var1) {
      throw new UnsupportedOperationException();
   }

   public RHOCHHIRRCHHHOHOIRROIROHHHIHIO<?> withFilterId(Object var1) {
      return this;
   }

   public abstract void serialize(
      T var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO var2,
      RCIROOOOICRHCCRRCIORHHIRCOIIIC var3
   );

   public void serializeWithType(
      T var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO var2,
      RCIROOOOICRHCCRRCIORHHIRCOIIIC var3,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.CORCOCICIRIOHROHROIIOOHICCHCRR var4
   ) {
      Class var5 = this.handledType();
      if (var5 == null) {
         var5 = var1.getClass();
      }

      var3.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
         var5, String.format("Type id handling not implemented for type %s (by serializer of type %s)", var5.getName(), this.getClass().getName())
      );
   }

   public Class<T> handledType() {
      return null;
   }

   @Deprecated
   public boolean isEmpty(T var1) {
      return this.isEmpty(null, (T)var1);
   }

   public boolean isEmpty(RCIROOOOICRHCCRRCIORHHIRCOIIIC var1, T var2) {
      return var2 == null;
   }

   public boolean usesObjectId() {
      return false;
   }

   public boolean isUnwrappingSerializer() {
      return false;
   }

   public RHOCHHIRRCHHHOHOIRROIROHHHIHIO<?> getDelegatee() {
      return null;
   }

   public Iterator<com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CIOHHCORHRCCRICCCORIHCRHCCCRRR.IHHCHHHCRIHOOCOIOOCRIIICIOROIR> properties() {
      return com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCIHOHRHOCIRCCROHHHIHIICCIHHOC();
   }

   @Override
   public void acceptJsonFormatVisitor(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1,
      OCOHORHCROHICRRIHCIHHRRCIHICRI var2
   ) {
      var1.OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(var2);
   }

   public abstract static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends RHOCHHIRRCHHHOHOIRROIROHHHIHIO<Object> {
   }
}
