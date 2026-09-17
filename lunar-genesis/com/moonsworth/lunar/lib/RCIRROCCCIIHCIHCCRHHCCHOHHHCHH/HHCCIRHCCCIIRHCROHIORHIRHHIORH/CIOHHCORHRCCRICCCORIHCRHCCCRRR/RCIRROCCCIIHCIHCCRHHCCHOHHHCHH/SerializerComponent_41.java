package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CIOHHCORHRCCRICCCORIHCRHCCCRRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map.Entry;

public class RICRIRRCOHRCOCRRHHCRHRROOIOHHR
   extends com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CIOHHCORHRCCRICCCORIHCRHCCCRRR.CRRRICCRROCOHHOHIICIHORCOORRRH
   implements Serializable {
   private static final long serialVersionUID = 1L;
   protected final com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.RIROICHCRROROHCCROOCCCCOCHCCRI _nameTransformer;

   public RICRIRRCOHRCOCRRHHCRHRROOIOHHR(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CIOHHCORHRCCRICCCORIHCRHCCCRRR.CRRRICCRROCOHHOHIICIHORCOORRRH var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.RIROICHCRROROHCCROOCCCCOCHCCRI var2
   ) {
      super(var1);
      this._nameTransformer = var2;
   }

   protected RICRIRRCOHRCOCRRHHCRHRROOIOHHR(
      RICRIRRCOHRCOCRRHHCRHRROOIOHHR var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.RIROICHCRROROHCCROOCCCCOCHCCRI var2,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IIRHCHHOICHRICOOCRORCCIOOIHOIR var3
   ) {
      super(var1, var3);
      this._nameTransformer = var2;
   }

   public RICRIRRCOHRCOCRRHHCRHRROOIOHHR rename(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.RIROICHCRROROHCCROOCCCCOCHCCRI var1
   ) {
      String var2 = this._name.getValue();
      String var3 = var1.CCOOHCORIOIRCOICIOIOOCRIICCHCO(var2);
      var1 = com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var1, this._nameTransformer
      );
      return this._new(
         var1,
         new com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IIRHCHHOICHRICOOCRORCCIOOIHOIR(
            var3
         )
      );
   }

   protected RICRIRRCOHRCOCRRHHCRHRROOIOHHR _new(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.RIROICHCRROROHCCROOCCCCOCHCCRI var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IIRHCHHOICHRICOOCRORCCIOOIHOIR var2
   ) {
      return new RICRIRRCOHRCOCRRHHCRHRROOIOHHR(this, var1, var2);
   }

   @Override
   public boolean isUnwrapping() {
      return true;
   }

   @Override
   public void serializeAsField(
      Object var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO var2,
      RCIROOOOICRHCCRRCIORHHIRCOIIIC var3
   ) {
      Object var4 = this.get(var1);
      if (var4 != null) {
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO var5 = this._serializer;
         if (var5 == null) {
            Class var6 = var4.getClass();
            HICHRCOHCCRHOHCICOOCHOIHCCHIRI var7 = this._dynamicSerializers;
            var5 = var7.IIHROHOIOHICCRRHRICHCIHRCROOIO(var6);
            if (var5 == null) {
               var5 = this._findAndAddDynamic(var7, var6, var3);
            }
         }

         if (this._suppressableValue != null) {
            if (MARKER_FOR_EMPTY == this._suppressableValue) {
               if (var5.isEmpty(var3, var4)) {
                  return;
               }
            } else if (this._suppressableValue.equals(var4)) {
               return;
            }
         }

         if (var4 != var1 || !this._handleSelfReference(var1, var2, var3, var5)) {
            if (!var5.isUnwrappingSerializer()) {
               var2.HHCCIRHCCCIIRHCROHIORHIRHHIORH(this._name);
            }

            if (this._typeSerializer == null) {
               var5.serialize(var4, var2, var3);
            } else {
               var5.serializeWithType(var4, var2, var3, this._typeSerializer);
            }
         }
      }
   }

   @Override
   public void assignSerializer(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO<Object> var1
   ) {
      if (var1 != null) {
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.RIROICHCRROROHCCROOCCCCOCHCCRI var2 = this._nameTransformer;
         if (var1.isUnwrappingSerializer() && var1 instanceof HICRRICCHCCROOHHCHOCOCCHOIHHOC) {
            var2 = com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               var2, ((HICRRICCHCCROOHHCHOCOCCHOIHHOC)var1).OCORHOHOIOHIRIHIIHOOHHIOOHIHRI
            );
         }

         var1 = var1.unwrappingSerializer(var2);
      }

      super.assignSerializer(var1);
   }

   @Override
   public void depositSchemaProperty(
      final com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.IIHRRHORCRCROCHHOHORCHCROCIHRO var1,
      RCIROOOOICRHCCRRCIORHHIRCOIIIC var2
   ) {
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO var3 = var2.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
            this.getType(), this
         )
         .unwrappingSerializer(this._nameTransformer);
      if (var3.isUnwrappingSerializer()) {
         var3.acceptJsonFormatVisitor(
            new com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               var2
            ) {
               @Override
               public com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.IIHRRHORCRCROCHHOHORCHCROCIHRO CCIHHRIOOOOCOHRCIHOHROOICIORCC(
                  com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI var1x
               ) {
                  return var1;
               }
            },
            this.getType()
         );
      } else {
         super.depositSchemaProperty(var1, var2);
      }
   }

   @Override
   protected void _depositSchemaProperty(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.HICRRICCHCCROOHHCHOCOCCHOIHHOC var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR var2
   ) {
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR var3 = var2.RHIORRCOCIORHOIRCOIRCIOOHHIRII(
         "properties"
      );
      if (var3 != null) {
         Iterator var4 = var3.IHIOOIORHOHHHHCHHOHRRCHHOOCIII();

         while (var4.hasNext()) {
            Entry var5 = (Entry)var4.next();
            String var6 = (String)var5.getKey();
            if (this._nameTransformer != null) {
               var6 = this._nameTransformer.CCOOHCORIOIRCOICIOIOOCRIICCHCO(var6);
            }

            var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               var6, (com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR)var5.getValue()
            );
         }
      }
   }

   @Override
   protected com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO<Object> _findAndAddDynamic(
      HICHRCOHCCRHOHCICOOCHOIHCCHIRI var1, Class<?> var2, RCIROOOOICRHCCRRCIORHHIRCOIIIC var3
   ) {
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO var4;
      if (this._nonTrivialBaseType != null) {
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI var5 = var3.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            this._nonTrivialBaseType, var2
         );
         var4 = var3.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var5, this);
      } else {
         var4 = var3.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, this);
      }

      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.RIROICHCRROROHCCROOCCCCOCHCCRI var7 = this._nameTransformer;
      if (var4.isUnwrappingSerializer() && var4 instanceof HICRRICCHCCROOHHCHOCOCCHOIHHOC) {
         var7 = com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR.RIROICHCRROROHCCROOCCCCOCHCCRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var7, ((HICRRICCHCCROOHHCHOCOCCHOIHHOC)var4).OCORHOHOIOHIRIHIIHOOHHIOOHIHRI
         );
      }

      var4 = var4.unwrappingSerializer(var7);
      this._dynamicSerializers = this._dynamicSerializers.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var2, var4);
      return var4;
   }
}
