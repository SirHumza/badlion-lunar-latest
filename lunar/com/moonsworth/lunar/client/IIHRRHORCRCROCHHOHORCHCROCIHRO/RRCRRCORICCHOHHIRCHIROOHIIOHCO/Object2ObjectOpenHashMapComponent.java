package com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RRCRRCORICCHOHHIRCHIROOHIIOHCO;

import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH
   extends Object2ObjectOpenHashMap<IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH, com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> {
   private IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH OHOOHCCOHCHOOCCHHOIRCOIORCHOIO = new IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      null, 0, false
   );

   public com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      String var1, int var2, boolean var3
   ) {
      this.OHOOHCCOHCHOOCCHHOIRCOIORCHOIO.string = var1;
      this.OHOOHCCOHCHOOCCHHOIRCOIORCHOIO.color = var2;
      this.OHOOHCCOHCHOOCCHHOIRCOIORCHOIO.shadow = var3;
      return (com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)this.get(
         this.OHOOHCCOHCHOOCCHHOIRCOIORCHOIO
      );
   }

   public static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      private String string;
      private int color;
      private boolean shadow;

      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, int var2, boolean var3) {
         this.string = var1;
         this.color = var2;
         this.shadow = var3;
      }

      @Override
      public boolean equals(Object var1) {
         if (this == var1) {
            return true;
         } else if (var1 != null && this.getClass() == var1.getClass()) {
            IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = (IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var1;
            return this.color == var2.color && this.shadow == var2.shadow && this.string.equals(var2.string);
         } else {
            return false;
         }
      }

      @Override
      public int hashCode() {
         int var1 = this.string.hashCode();
         var1 = 31 * var1 + this.color;
         return 31 * var1 + (this.shadow ? 1 : 0);
      }
   }
}
