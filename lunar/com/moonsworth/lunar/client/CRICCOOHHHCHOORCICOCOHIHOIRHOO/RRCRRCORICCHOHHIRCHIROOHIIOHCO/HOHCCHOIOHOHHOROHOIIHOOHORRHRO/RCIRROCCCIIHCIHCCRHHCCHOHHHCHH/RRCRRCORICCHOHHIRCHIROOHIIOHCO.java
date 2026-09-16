package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HOHCCHOIOHOHHOROHOIIHOOHORRHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import lombok.Generated;

public enum RRCRRCORICCHOHHIRCHIROOHIIOHCO {
   NA(14244970),
   EU(9040284),
   AS(11501457),
   SA(6147292),
   ME(15061894),
   AU(14003584),
   AF(12409789);

   public final int color;

   public static RRCRRCORICCHOHHIRCHIROOHIIOHCO fromString(String var0) {
      String[] var1 = var0.split("_");
      if (var1.length == 1) {
         return valueOf(var1[0].substring(0, 2));
      }

      StringBuilder var2 = new StringBuilder();

      for (String var6 : var1) {
         var2.append(var6.charAt(0));
      }

      return valueOf(var2.toString());
   }

   @Generated
   RRCRRCORICCHOHHIRCHIROOHIIOHCO(int var3) {
      this.color = var3;
   }
}
