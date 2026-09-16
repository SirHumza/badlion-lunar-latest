package com.moonsworth.lunar.client.IHIRRIIORRHORHRORIHOROIRCORCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import java.util.List;
import org.objectweb.asm.Type;

public interface RIOOCHICIHRHOHCCCCCHOCCCOHCRHI extends com.moonsworth.lunar.client.IHIRRIIORRHORHRORIHOROIRCORCOO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI {
   boolean ICRCOOIHHHRCCROCCRIRCIOCIRIHIH(int var1);

   default boolean IIRIIICCOORHIRHCIIROIHOROCICCC(int var1) {
      return false;
   }

   default boolean HCCICIIIHORIIRRCIRRIHORHOHIHCH(int var1) {
      return false;
   }

   @com.moonsworth.lunar.ichor.util.CORCOCICIRIOHROHROIIOOHICCHCRR
   default double call(double... var1) {
      throw new UnsupportedOperationException("Not implemented! " + this.getClass().getSimpleName());
   }

   default void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      List<com.moonsworth.lunar.client.IHIRRIIORRHORHRORIHOROIRCORCOO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> var1,
      com.moonsworth.lunar.client.IHIRRIIORRHORHRORIHOROIRCORCOO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var2,
      com.moonsworth.lunar.client.IHIRRIIORRHORHRORIHOROIRCORCOO.OCOHORHCROHICRRIHCIHHRRCIHICRI var3
   ) {
      if (this.HCCICIIIHORIIRRCIRRIHORHOHIHCH(var1.size())) {
         this.CRRRICCRROCOHHOHIICIHORCOORRRH(var1, var2, var3);
      } else if (this.IIRIIICCOORHIRHCIIROIHOROCICCC(var1.size())) {
         this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1, var2, var3);
      } else {
         this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, var2, var3);
      }
   }

   default void IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      List<com.moonsworth.lunar.client.IHIRRIIORRHORHRORIHOROIRCORCOO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> var1,
      com.moonsworth.lunar.client.IHIRRIIORRHORHRORIHOROIRCORCOO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var2,
      com.moonsworth.lunar.client.IHIRRIIORRHORHRORIHOROIRCORCOO.OCOHORHCROHICRRIHCIHHRRCIHICRI var3
   ) {
      com.moonsworth.lunar.client.IHIRRIIORRHORHRORIHOROIRCORCOO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this, var2);
      var2.OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(var1x -> {
         com.moonsworth.lunar.client.IHIRRIIORRHORHRORIHOROIRCORCOO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1x, var1.size());
         var1x.visitIntInsn(188, 7);
      });

      for (int var4 = 0; var4 < var1.size(); var4++) {
         int var5 = var4;
         var2.OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(var1x -> {
            var1x.visitInsn(89);
            com.moonsworth.lunar.client.IHIRRIIORRHORHRORIHOROIRCORCOO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1x, var5);
         });
         com.moonsworth.lunar.client.IHIRRIIORRHORHRORIHOROIRCORCOO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            (com.moonsworth.lunar.client.IHIRRIIORRHORHRORIHOROIRCORCOO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var1.get(var4),
            var2,
            com.moonsworth.lunar.client.IHIRRIIORRHORHRORIHOROIRCORCOO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.DOUBLE_PRIM
         );
         var2.OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(var0 -> var0.visitInsn(82));
      }

      var2.OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(
         var1x -> var1x.visitMethodInsn(
            182, Type.getInternalName(this.getClass()), "call", Type.getMethodDescriptor(Type.DOUBLE_TYPE, new Type[]{Type.getType(double[].class)}), false
         )
      );
   }

   default void HHCCIRHCCCIIRHCROHIORHIRHHIORH(
      List<com.moonsworth.lunar.client.IHIRRIIORRHORHRORIHOROIRCORCOO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> var1,
      com.moonsworth.lunar.client.IHIRRIIORRHORHRORIHOROIRCORCOO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var2,
      com.moonsworth.lunar.client.IHIRRIIORRHORHRORIHOROIRCORCOO.OCOHORHCROHICRRIHCIHHRRCIHICRI var3
   ) {
      com.moonsworth.lunar.client.IHIRRIIORRHORHRORIHOROIRCORCOO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this, var2);
      Type[] var4 = new Type[var1.size()];

      for (int var5 = 0; var5 < var1.size(); var5++) {
         com.moonsworth.lunar.client.IHIRRIIORRHORHRORIHOROIRCORCOO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            (com.moonsworth.lunar.client.IHIRRIIORRHORHRORIHOROIRCORCOO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var1.get(var5),
            var2,
            com.moonsworth.lunar.client.IHIRRIIORRHORHRORIHOROIRCORCOO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.DOUBLE_PRIM
         );
         var4[var5] = Type.DOUBLE_TYPE;
      }

      var2.OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(
         var2x -> var2x.visitMethodInsn(182, Type.getInternalName(this.getClass()), "call", Type.getMethodDescriptor(Type.DOUBLE_TYPE, var4), false)
      );
   }

   default void CRRRICCRROCOHHOHIICIHORCOORRRH(
      List<com.moonsworth.lunar.client.IHIRRIIORRHORHRORIHOROIRCORCOO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> var1,
      com.moonsworth.lunar.client.IHIRRIIORRHORHRORIHOROIRCORCOO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var2,
      com.moonsworth.lunar.client.IHIRRIIORRHORHRORIHOROIRCORCOO.OCOHORHCROHICRRIHCIHHRRCIHICRI var3
   ) {
      Type[] var4 = new Type[var1.size()];

      for (int var5 = 0; var5 < var1.size(); var5++) {
         com.moonsworth.lunar.client.IHIRRIIORRHORHRORIHOROIRCORCOO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            (com.moonsworth.lunar.client.IHIRRIIORRHORHRORIHOROIRCORCOO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var1.get(var5),
            var2,
            com.moonsworth.lunar.client.IHIRRIIORRHORHRORIHOROIRCORCOO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.DOUBLE_PRIM
         );
         var4[var5] = Type.DOUBLE_TYPE;
      }

      var2.OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(
         var2x -> var2x.visitMethodInsn(184, Type.getInternalName(this.getClass()), "call", Type.getMethodDescriptor(Type.DOUBLE_TYPE, var4), false)
      );
   }
}
