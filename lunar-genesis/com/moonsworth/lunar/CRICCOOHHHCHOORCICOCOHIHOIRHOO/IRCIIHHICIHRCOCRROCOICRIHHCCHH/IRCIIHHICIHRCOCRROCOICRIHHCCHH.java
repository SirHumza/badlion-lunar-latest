package com.moonsworth.lunar.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import java.util.ArrayList;
import java.util.List;
import org.objectweb.asm.tree.AnnotationNode;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   public static boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      AnnotationNode var0, com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
   ) {
      List var2 = var0.values;
      com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 = null;
      com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4 = null;
      ArrayList var5 = null;
      boolean var6 = false;

      for (byte var7 = 0; var7 < var2.size(); var7 += 2) {
         String var8 = var2.get(var7).toString();
         Object var9 = var2.get(var7 + 1);
         if ("max".equals(var8)) {
            Integer var18 = (Integer)var9;
            if (var18 != -1) {
               var4 = com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRHRHRCHHRCHCCRCRRCRICOICHCRRO(var18).orElse(null);
            }
         } else if ("min".equals(var8)) {
            Integer var17 = (Integer)var9;
            if (var17 != -1) {
               var3 = com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRHRHRCHHRCHCCRCRRCRICOICHCRRO(var17).orElse(null);
            }
         } else if ("value".equals(var8) && var9 instanceof List var10) {
            var5 = new ArrayList(var2.size());

            for (Object var12 : var10) {
               if (var12 instanceof Integer var13) {
                  com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRHRHRCHHRCHCCRCRRCRICOICHCRRO(var13).ifPresent(var5::add);
               } else if (var12 instanceof String var14) {
                  com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.get(var14).ifPresent(var5::add);
               }
            }
         } else if ("inverted".equals(var8)) {
            var6 = (Boolean)var9;
         } else if ("onReturn".equals(var8) && (Boolean)var9) {
            return true;
         }
      }

      if (var5 != null) {
         return var6 != var5.contains(var1);
      }

      if (var6) {
         boolean var16 = false;
         if (var3 != null) {
            var16 |= var1.RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO(var3);
         }

         if (var4 != null) {
            var16 |= var1.HHRIICOIOORCHCOIICOOIHIRHHICRI(var4);
         }

         return var16;
      } else {
         boolean var15 = true;
         if (var3 != null) {
            var15 &= var1.ORHIOICIOCRRHOOCOHRORIHICHRCRR(var3);
         }

         if (var4 != null) {
            var15 &= var4.ORHIOICIOCRRHOOCOHRORIHICHRCRR(var1);
         }

         return var15;
      }
   }
}
