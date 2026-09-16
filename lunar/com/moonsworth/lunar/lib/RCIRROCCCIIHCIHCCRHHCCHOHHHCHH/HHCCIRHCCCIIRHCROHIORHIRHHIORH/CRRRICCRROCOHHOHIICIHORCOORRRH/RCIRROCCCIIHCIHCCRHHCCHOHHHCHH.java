package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH;
import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI;
import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI;
import java.util.Collection;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends HRCHROOHRIHCRCRHRIIROCIRHOIRHH {
   private static final long COIRHHIIRROOHCIRCIRCHHCRROIRHI = 1L;

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      OCOHORHCROHICRRIHCIHHRRCIHICRI var1, String var2, HICHRCOHCCRHOHCICOOCHOIHCCHIRI var3, Class<?> var4, String var5, Collection<Object> var6
   ) {
      super(var1, var2, var3, var4, var5, var6);
   }

   @Deprecated
   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, HICHRCOHCCRHOHCICOOCHOIHCCHIRI var2, Class<?> var3, String var4, Collection<Object> var5) {
      super(var1, var2, var3, var4, var5);
   }

   public static CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      OCOHORHCROHICRRIHCIHHRRCIHICRI var0, Object var1, String var2, Collection<Object> var3
   ) {
      Class var4;
      if (var1 instanceof Class) {
         var4 = (Class)var1;
      } else {
         var4 = var1.getClass();
      }

      String var5 = String.format("Ignored field \"%s\" (class %s) encountered; mapper configured not to allow this", var2, var4.getName());
      CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var6 = new CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var0, var5, var0.COIIOIOCCIOCOOIROHCCHHRHCICIHI(), var4, var2, var3
      );
      var6.CRICCOOHHHCHOORCICOCOHIHOIRHOO(var1, var2);
      return var6;
   }
}
