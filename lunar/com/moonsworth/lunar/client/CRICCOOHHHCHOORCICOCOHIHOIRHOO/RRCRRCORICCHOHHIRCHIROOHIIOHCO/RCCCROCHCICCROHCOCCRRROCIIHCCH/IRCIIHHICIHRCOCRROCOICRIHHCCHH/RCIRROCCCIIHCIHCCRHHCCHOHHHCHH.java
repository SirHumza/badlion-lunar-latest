package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCCCROCHCICCROHCOCCRRROCIIHCCH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import org.joml.Vector3ic;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   public static int OCIOROHIHRROROOIRRHRRCCHHRRRHI(int var0) {
      return var0 >> 5;
   }

   public static long ORHIOICIOCRRHOOCOHRORIHICHRCRR(int var0, int var1) {
      return var0 & 4294967295L | (var1 & 4294967295L) << 32;
   }

   public static long RRCRRCORICCHOHHIRCHIROOHIIOHCO(Vector3ic var0) {
      return ORHIOICIOCRRHOOCOHRORIHICHRCRR(var0.x() >> 4, var0.z() >> 4);
   }

   public static long RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO(int var0, int var1) {
      return ORHIOICIOCRRHOOCOHRORIHICHRCRR(OCIOROHIHRROROOIRRHRRCCHHRRRHI(var0), OCIOROHIHRROROOIRRHRRCCHHRRRHI(var1));
   }

   public static int HHRIICOIOORCHCOIICOOIHIRHHICRI(long var0) {
      return (int)(var0 & 4294967295L);
   }

   public static int ORHIOICIOCRRHOOCOHRORIHICHRCRR(long var0) {
      return (int)(var0 >>> 32 & 4294967295L);
   }
}
