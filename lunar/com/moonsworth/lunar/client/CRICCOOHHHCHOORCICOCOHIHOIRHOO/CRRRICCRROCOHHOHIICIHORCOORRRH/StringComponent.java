package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import it.unimi.dsi.fastutil.Pair;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import lombok.Generated;

public class IIHRRHORCRCROCHHOHORCHCROCIHRO implements com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IIHRRHORCRCROCHHOHORCHCROCIHRO {
   private final List<String> OHCORIIIRIRCRCRIRHCRIHCHORHICH = new ArrayList<>();
   private final List<String> ORHCOIOCRIHOOHHORRIROOCRRCHCOH = new ArrayList<>();

   @Override
   public void OOROOCCIRCCRHOIOIORIHCHHOOCCOR(com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1) {
      if (this.OHCORIIIRIRCRCRIRHCRIHCHORHICH.isEmpty()) {
         Pair var2 = com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IIHRRHORCRCROCHHOHORCHCROCIHRO.CORCOCICIRIOHROHROIIOOHICCHCRR(var1);
         this.OHCORIIIRIRCRCRIRHCRIHCHORHICH.addAll((Collection<? extends String>)var2.first());
         this.ORHCOIOCRIHOOHHORRIROOCRRCHCOH.addAll((Collection<? extends String>)var2.second());
      }
   }

   @Override
   public boolean IRHIOIHIIIHIIROOIIRIIHHIRHHOOC(String var1) {
      var1 = var1.toLowerCase();
      return this.ROIIRHIRRRCRROCIIOICIIRICHCCHO(var1) || this.RHHRICHORHROCCOCCRCRIRHIIOORCH(var1);
   }

   @Override
   public boolean ROIIRHIRRRCRROCIIOICIIRICHCCHO(String var1) {
      for (String var3 : this.IIHCRCIICOOIROIOOIRCHRIHRCRCCC()) {
         if (var3.startsWith(var1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public boolean RHHRICHORHROCCOCCRCRIRHIIOORCH(String var1) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHHIHROORHHOOCCOOCHRIRHRHCRHIH()
         .OHOHCHORHIIHCCOIHOHCCICRHHICIR()
         .RIRIIRRCHHRCRORRHRICIIOORHRORR()
         .get()) {
         for (String var3 : this.IIOCOCIORHHIOHCROOCOOCICIHCOHO()) {
            if (var3.startsWith(var1)) {
               return true;
            }
         }
      }

      return false;
   }

   @Generated
   @Override
   public List<String> IIHCRCIICOOIROIOOIRCHRIHRCRCCC() {
      return this.OHCORIIIRIRCRCRIRHCRIHCHORHICH;
   }

   @Generated
   @Override
   public List<String> IIOCOCIORHHIOHCROOCOOCICIHCOHO() {
      return this.ORHCOIOCRIHOOHHORRIROOCRRCHCOH;
   }
}
