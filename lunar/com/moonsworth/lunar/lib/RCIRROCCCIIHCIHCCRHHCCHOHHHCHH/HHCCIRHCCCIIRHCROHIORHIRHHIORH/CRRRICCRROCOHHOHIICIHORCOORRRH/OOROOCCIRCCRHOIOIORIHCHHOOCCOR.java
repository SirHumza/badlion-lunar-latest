package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI;
import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI;
import java.util.Collection;

public class OOROOCCIRCCRHOIOIORIHCHHOOCCOR extends HRCHROOHRIHCRCRHRIIROCIRHOIRHH {
   private static final long ICOHIIRORHRRCCRHICOROIIOCHIORO = 1L;

   public OOROOCCIRCCRHOIOIORIHCHHOOCCOR(
      OCOHORHCROHICRRIHCIHHRRCIHICRI var1, String var2, HICHRCOHCCRHOHCICOOCHOIHCCHIRI var3, Class<?> var4, String var5, Collection<Object> var6
   ) {
      super(var1, var2, var3, var4, var5, var6);
   }

   @Deprecated
   public OOROOCCIRCCRHOIOIORIHCHHOOCCOR(String var1, HICHRCOHCCRHOHCICOOCHOIHCCHIRI var2, Class<?> var3, String var4, Collection<Object> var5) {
      super(var1, var2, var3, var4, var5);
   }

   public static OOROOCCIRCCRHOIOIORIHCHHOOCCOR IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      OCOHORHCROHICRRIHCIHHRRCIHICRI var0, Object var1, String var2, Collection<Object> var3
   ) {
      Class var4;
      if (var1 instanceof Class) {
         var4 = (Class)var1;
      } else {
         var4 = var1.getClass();
      }

      String var5 = String.format("Unrecognized field \"%s\" (class %s), not marked as ignorable", var2, var4.getName());
      OOROOCCIRCCRHOIOIORIHCHHOOCCOR var6 = new OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var0, var5, var0.COIIOIOCCIOCOOIROHCCHHRHCICIHI(), var4, var2, var3);
      var6.CRICCOOHHHCHOORCICOCOHIHOIRHOO(var1, var2);
      return var6;
   }
}
