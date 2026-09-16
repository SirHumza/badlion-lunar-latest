package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   public static double OOROOCCIRCCRHOIOIORIHCHHOOCCOR(double var0, double var2) {
      double var4 = Math.abs(var2 - var0);
      if (var4 > 180.0) {
         var0 += var0 < var2 ? 360.0 : -360.0;
      }

      return var0;
   }

   public static double OOCCRCRCOHIIORCCORCRCIRRROIOOR(double var0) {
      return (var0 % 360.0 + 360.0) % 360.0;
   }
}
