package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IIOCHOIICCIORCOROIROHICCHIOHIC;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   private static final float ICRICORIOIOORICHIRORCCCIRORIOC = 0.6F;
   private static volatile int generation;
   private static final Map<int[], IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> IHRRCHOOCOHICROHROIICOHCHOCHOI = new ConcurrentHashMap<>();

   private IRCIIHHICIHRCOCRROCOICRIHHCCHH() {
   }

   public static void IOHIROOORHHCOIHCHIOOHHRROOOHHI() {
      generation++;
   }

   public static void reset() {
      IHRRCHOOCOHICROHROIICOHCHOCHOI.clear();
   }

   public static boolean IRRCCOICORICIHCHRHIHIHROIRHOCR(float var0, float var1) {
      return var1 - var0 >= 0.6F;
   }

   public static float RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RRCRRCORICCHOHHIRCHIROOHIIOHCO var0, float var1, float var2) {
      return var2 + (var1 - var2) * var0.ICRHHCRHIICCCRCRRRCHOOCOCOIIHO().get();
   }

   public static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RRCRRCORICCHOHHIRCHIROOHIIOHCO var0, int[] var1, int var2) {
      int var3 = generation;
      IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 = IHRRCHOOCOHICROHROIICOHCHOCHOI.get(var1);
      if (var4 == null || var4.generation != var3) {
         boolean var5 = var0.IOCRIHORCRHHHRCCRCCHROOOCCIRIR();
         if (var4 == null) {
            if (!var5) {
               return;
            }

            var4 = IHRRCHOOCOHICROHROIICOHCHOCHOI.computeIfAbsent(
               var1,
               var1x -> new IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  new float[]{
                     Float.intBitsToFloat(var1x[0 * var2 + 1]),
                     Float.intBitsToFloat(var1x[1 * var2 + 1]),
                     Float.intBitsToFloat(var1x[2 * var2 + 1]),
                     Float.intBitsToFloat(var1x[3 * var2 + 1])
                  }
               )
            );
         }

         float[] var6 = var4.ICHRHCIORCCIIIRIRROIIHCROHCIOI;
         float var7 = Math.min(Math.min(var6[0], var6[1]), Math.min(var6[2], var6[3]));
         float var8 = Math.max(Math.max(var6[0], var6[1]), Math.max(var6[2], var6[3]));
         boolean var9 = var5 && IRRCCOICORICIHCHRHIHIHROIRHOCR(var7, var8);

         for (int var10 = 0; var10 < 4; var10++) {
            var1[var10 * var2 + 1] = Float.floatToRawIntBits(var9 ? RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var6[var10], var7) : var6[var10]);
         }

         var4.generation = var3;
      }
   }

   private static final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      private final float[] ICHRHCIORCCIIIRIRROIIHCROHCIOI;
      private volatile int generation = -1;

      private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(float[] var1) {
         this.ICHRHCIORCCIIIRIRROIIHCROHCIOI = var1;
      }
   }
}
