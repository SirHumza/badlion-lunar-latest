package com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.CRICCOOHHHCHOORCICOCOHIHOIRHOO;
import java.util.Set;
import org.cadixdev.bombe.provider.ClassProvider;
import org.objectweb.asm.tree.InsnList;

public record RIOOCHICIHRHOHCCCCCHOCCCOHCRHI() implements CRRRICCRROCOHHOHIICIHORCOORRRH {
   private final ClassProvider IRIICICHHHCHCIOCCRRORHHHRRHHOH;

   public RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(ClassProvider var1) {
      this.IRIICICHHHCHCIOCCRRORHHHRRHHOH = var1;
   }

   @Override
   public com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1,
      com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2,
      InsnList var3
   ) {
      if (var1.equals(var2)) {
         return var2;
      } else {
         CRICCOOHHHCHOORCICOCOHIHOIRHOO var4 = var1.IICRHRIOIROIOHRICHHHHHIHIOOICI();
         CRICCOOHHHCHOORCICOCOHIHOIRHOO var5 = var2.IICRHRIOIROIOHRICHHHHHIHIOOICI();
         if (var4 instanceof com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH var6
            && var5 instanceof com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH var7) {
            String var8 = var6.name();
            Set var9 = com.moonsworth.lunar.ichor.util.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var8, this.IRIICICHHHCHCIOCCRRORHHHRRHHOH);
            return var9.contains(var7.name()) ? var2 : var1;
         } else {
            return var1;
         }
      }
   }

   @Override
   public com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1,
      com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2,
      InsnList var3
   ) {
      if (var1.equals(var2)) {
         return var1;
      } else {
         CRICCOOHHHCHOORCICOCOHIHOIRHOO var4 = var1.IICRHRIOIROIOHRICHHHHHIHIOOICI();
         CRICCOOHHHCHOORCICOCOHIHOIRHOO var5 = var2.IICRHRIOIROIOHRICHHHHHIHIOOICI();
         if (var4 instanceof com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH var6
            && var5 instanceof com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH var7) {
            String var8 = var6.name();
            Set var9 = com.moonsworth.lunar.ichor.util.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var8, this.IRIICICHHHCHCIOCCRRORHHHRRHHOH);
            return var9.contains(var7.name()) ? var1 : var2;
         } else {
            return var2;
         }
      }
   }

   public ClassProvider OICROOOICOOHCIIHHOCRRRIRIHHIIH() {
      return this.IRIICICHHHCHCIOCCRRORHHHRRHHOH;
   }
}
