package com.moonsworth.lunar.ichor.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.MethodNode;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI
public interface RRCRRCORICCHOHHIRCHIROOHIIOHCO {
   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO
   default void OOROOCCIRCCRHOIOIORIHCHHOOCCOR(ClassNode var1, MethodNode var2) {
      if (var1.superName != null) {
         if (!var1.superName.contains("/")
            || var1.superName.startsWith("net/minecraft")
            || var1.superName.startsWith("com/mojang")
            || var1.superName.startsWith("net/optifine")) {
            var2.access = com.moonsworth.lunar.ichor.util.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHRORROHIRIRIHHOOCOIRHCIRHHORI(var2.access);
         }
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH
   default void IRCIIHHICIHRCOCRROCOICRIHHCCHH(ClassNode var1, FieldNode var2) {
      if (var1.superName != null) {
         if (!var1.superName.contains("/")
            || var1.superName.startsWith("net/minecraft")
            || var1.superName.startsWith("com/mojang")
            || var1.superName.startsWith("net/optifine")) {
            var2.access = com.moonsworth.lunar.ichor.util.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHRORROHIRIRIHHOOCOIRHCIRHHORI(var2.access);
         }
      }
   }
}
