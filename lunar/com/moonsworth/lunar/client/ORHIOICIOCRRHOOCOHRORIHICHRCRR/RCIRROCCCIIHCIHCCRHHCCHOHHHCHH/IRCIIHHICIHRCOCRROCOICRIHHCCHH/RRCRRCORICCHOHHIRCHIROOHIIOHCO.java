package com.moonsworth.lunar.client.ORHIOICIOCRRHOOCOHRORIHICHRCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

public class RRCRRCORICCHOHHIRCHIROOHIIOHCO {
   public static int clamp(int var0, int var1, int var2) {
      return var0 < var1 ? var1 : (var0 > var2 ? var2 : var0);
   }

   public static float clamp(float var0, float var1, float var2) {
      return var0 < var1 ? var1 : (var0 > var2 ? var2 : var0);
   }

   public static double clamp(double var0, double var2, double var4) {
      return var0 < var2 ? var2 : (var0 > var4 ? var4 : var0);
   }

   public static int cycler(int var0, int var1, int var2) {
      return var0 < var1 ? var2 : (var0 > var2 ? var1 : var0);
   }

   public static float cycler(float var0, float var1, float var2) {
      return var0 < var1 ? var2 : (var0 > var2 ? var1 : var0);
   }

   public static double cycler(double var0, double var2, double var4) {
      return var0 < var2 ? var4 : (var0 > var4 ? var2 : var0);
   }
}
