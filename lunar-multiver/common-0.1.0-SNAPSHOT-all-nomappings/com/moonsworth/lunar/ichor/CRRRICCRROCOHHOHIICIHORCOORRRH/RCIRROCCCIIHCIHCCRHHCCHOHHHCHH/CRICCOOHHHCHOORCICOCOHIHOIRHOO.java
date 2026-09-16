package com.moonsworth.lunar.ichor.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.InnerClassNode;
import org.objectweb.asm.tree.MethodNode;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI
public interface CRICCOOHHHCHOORCICOCOHIHOIRHOO {
   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH
   default void HICHRCOHCCRHOHCICOOCHOIHCCHIRI(ClassNode var1) {
      if (this.IIOHRRHHOORCOHRHHOHOHRRRIRIIOO()) {
         var1.access = com.moonsworth.lunar.ichor.util.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI(var1.access, true);
         var1.permittedSubclasses = null;

         for (InnerClassNode var3 : var1.innerClasses) {
            var3.access = com.moonsworth.lunar.ichor.util.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI(var3.access, true);
         }
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO
   default void CORCOCICIRIOHROHROIIOOHICCHCRR(ClassNode var1, MethodNode var2) {
      if (this.IIOHRRHHOORCOHRHHOHOHRRRIRIIOO()) {
         boolean var3 = (var2.access & 64) != 0;
         boolean var4 = (var1.access & 4096) != 0 || !var3 && (var2.access & 4096) != 0;
         if (!var4) {
            boolean var5 = (var1.access & 512) != 0;
            var2.access = com.moonsworth.lunar.ichor.util.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI(
               var2.access, !var5 && this.IIOHRRHHOORCOHRHHOHOHRRRIRIIOO()
            );
         }
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH
   default void HHCCIRHCCCIIRHCROHIORHIRHHIORH(ClassNode var1, FieldNode var2) {
      boolean var3 = (var1.access & 512) != 0;
      var2.access = com.moonsworth.lunar.ichor.util.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI(
         var2.access, !var3 && this.IIOHRRHHOORCOHRHHOHOHRRRIRIIOO()
      );
   }

   default boolean IIOHRRHHOORCOHRHHOHOHRRRIRIIOO() {
      return false;
   }
}
