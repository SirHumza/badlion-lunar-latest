package com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.CRICCOOHHHCHOORCICOCOHIHOIRHOO;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.MethodInsnNode;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH implements CRRRICCRROCOHHOHIICIHORCOORRRH {
   @Override
   public com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1,
      com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2,
      InsnList var3
   ) {
      CRICCOOHHHCHOORCICOCOHIHOIRHOO var4 = var1.IICRHRIOIROIOHRICHHHHHIHIOOICI();
      CRICCOOHHHCHOORCICOCOHIHOIRHOO var5 = var2.IICRHRIOIROIOHRICHHHHHIHIOOICI();
      if (var4 instanceof com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH var6
         && var5 instanceof com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH) {
         Character var7 = com.moonsworth.lunar.ichor.util.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RICIRORIRHHIHIICHOHROROHRIIOOR(var6.name());
         if (var7 == null) {
            return var1;
         }

         var3.add(
            new MethodInsnNode(
               182, var6.name(), com.moonsworth.lunar.ichor.util.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IOIICIRIICICIIOORHCIIIIRRIHRHI(var7), "()" + var7
            )
         );
         return new com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(
            new com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var7)
         );
      } else {
         return var1;
      }
   }

   @Override
   public com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1,
      com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2,
      InsnList var3
   ) {
      CRICCOOHHHCHOORCICOCOHIHOIRHOO var4 = var1.IICRHRIOIROIOHRICHHHHHIHIOOICI();
      if (var4 instanceof com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH
         && var2.IICRHRIOIROIOHRICHHHHHIHIOOICI() instanceof com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH var6) {
         Character var7 = com.moonsworth.lunar.ichor.util.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RICIRORIRHHIHIICHOHROROHRIIOOR(var6.name());
         if (var7 == null) {
            return var2;
         }

         var3.add(new MethodInsnNode(184, var6.name(), "valueOf", "(" + var7 + ")L" + var6.name() + ";"));
         return new com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(
            new com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var7)
         );
      } else {
         return var2;
      }
   }
}
