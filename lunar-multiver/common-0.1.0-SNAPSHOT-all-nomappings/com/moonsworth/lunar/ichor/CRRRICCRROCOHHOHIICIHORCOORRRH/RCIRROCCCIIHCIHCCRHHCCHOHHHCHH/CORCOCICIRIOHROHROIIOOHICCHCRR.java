package com.moonsworth.lunar.ichor.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldNode;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI
public interface CORCOCICIRIOHROHROIIOOHICCHCRR {
   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH
   default void HHCCIRHCCCIIRHCROHIORHIRHHIORH(ClassNode var1, FieldNode var2) {
      if ((
            !com.moonsworth.lunar.ichor.util.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIROICHCRROROHCCROOCCCCOCHCCRI(var1)
               || !com.moonsworth.lunar.ichor.util.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.isStatic(var2.access)
         )
         && !com.moonsworth.lunar.ichor.util.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, "Lorg/spongepowered/asm/mixin/Shadow;")) {
         var2.access = com.moonsworth.lunar.ichor.util.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHRORROHIRIRIHHOOCOIRHCIRHHORI(var2.access);
      }
   }
}
