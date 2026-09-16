package com.moonsworth.lunar.legacy.wrapper.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.common.collect.BiMap;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import lombok.Generated;
import net.minecraft.network.EnumConnectionState;
import net.minecraft.network.EnumPacketDirection;

public abstract class RIRHOCHIORCCIIOIIRHOCCCRHHCHHH
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH {
   private final AtomicReference<Object> OHCHHOHCRORHRIRCRHHIHROOHCOCOR = new AtomicReference<>();
   private final Class<?> CCIRIRCHOOOICIRIHROCOORCHHOOOC;

   protected RIRHOCHIORCCIIOIIRHOCCCRHHCHHH(
      Class<?> var1,
      List<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH> var2
   ) {
      this.CCIRIRCHOOOICIRIHROCOORCHHOOOC = var1;
      var2.add(this);
   }

   private int CIIHRRCRHIROCCIRHICOHOHCRCOCRH() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 0) {
         return (Integer)EnumConnectionState.PLAY.func_150755_b$v1_7().inverse().get(this.CCIRIRCHOOOICIRIHROCOORCHHOOOC);
      } else {
         return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 1
            ? (Integer)((BiMap)EnumConnectionState.PLAY.directionMaps$v1_8.get(EnumPacketDirection.CLIENTBOUND))
               .inverse()
               .get(this.CCIRIRCHOOOICIRIHROCOORCHHOOOC)
            : (Integer)((BiMap)EnumConnectionState.PLAY.directionMaps$v1_12.get(EnumPacketDirection.CLIENTBOUND))
               .inverse()
               .get(this.CCIRIRCHOOOICIRIHROCOORCHHOOOC);
      }
   }

   public boolean IRCIIHHICIHRCOCRROCOICRIHHCCHH(RCIROOOOICRHCCRRCIORHHIRCOIIIC var1, int var2) {
      return this.ROCCCIOIOIOOICICROHRRRCRHRRCHO() == var2;
   }

   public boolean IRCIIHHICIHRCOCRROCOICRIHHCCHH(Class<?> var1) {
      return this.CCIRIRCHOOOICIRIHROCOORCHHOOOC == null ? false : this.CCIRIRCHOOOICIRIHROCOORCHHOOOC.equals(var1);
   }

   public boolean HHCCIRHCCCIIRHCROHIORHIRHHIORH(Class<?> var1) {
      return this.CCIRIRCHOOOICIRIHROCOORCHHOOOC == null ? false : this.CCIRIRCHOOOICIRIHROCOORCHHOOOC.isAssignableFrom(var1);
   }

   @Generated
   public int ROCCCIOIOIOOICICROHRRRCRHRRCHO() {
      Object var1 = this.OHCHHOHCRORHRIRCRHHIHROOHCOCOR.get();
      if (var1 == null) {
         synchronized (this.OHCHHOHCRORHRIRCRHHIHROOHCOCOR) {
            var1 = this.OHCHHOHCRORHRIRCRHHIHROOHCOCOR.get();
            if (var1 == null) {
               int var3 = this.CIIHRRCRHIROCCIRHICOHOHCRCOCRH();
               var1 = var3;
               this.OHCHHOHCRORHRIRCRHHIHROOHCOCOR.set(var1);
            }
         }
      }

      return (Integer)var1;
   }

   @Generated
   public Class<?> OICRHIOROCOIIHOHCCOOOICHIHIHRO() {
      return this.CCIRIRCHOOOICIRIHROCOORCHHOOOC;
   }
}
