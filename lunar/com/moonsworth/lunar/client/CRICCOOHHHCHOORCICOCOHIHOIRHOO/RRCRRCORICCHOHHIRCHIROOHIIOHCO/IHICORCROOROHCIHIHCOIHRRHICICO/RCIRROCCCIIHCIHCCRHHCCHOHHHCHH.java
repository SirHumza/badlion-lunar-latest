package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IHICORCROOROHCIHIHCOIHRRHICICO;

import it.unimi.dsi.fastutil.ints.Int2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import lombok.Generated;

class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private final Object2ObjectMap<String, List<com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IHICORCROOROHCIHIHCOIHRRHICICO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH>> IRIOCOCHIIRIOOICOOCRCICROOOHOI = new Object2ObjectOpenHashMap();

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IHICORCROOROHCIHIHCOIHRRHICICO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1
   ) {
      this.IRIOCOCHIIRIOOICOOCRCICROOOHOI.putAll(var1.IRIOCOCHIIRIOOICOOCRCICROOOHOI);
   }

   public Set<String> keySet() {
      return this.IRIOCOCHIIRIOOICOOCRCICROOOHOI.keySet();
   }

   public int OIOIICCHICHHHCRROHIHIOICHROOCR(String var1) {
      List var2 = (List)this.IRIOCOCHIIRIOOICOOCRCICROOOHOI.get(var1);
      if (var2 == null) {
         return 0;
      }

      int var3 = 0;

      for (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IHICORCROOROHCIHIHCOIHRRHICICO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var5 : var2) {
         var3 += var5.RHHIOHORCORRRIORHHOICHRCCIIOOI;
      }

      return var3;
   }

   public int RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, Int2BooleanMap var2) {
      List var3 = (List)this.IRIOCOCHIIRIOOICOOCRCICROOOHOI.get(var1);
      if (var3 == null) {
         return 0;
      }

      int var4 = 0;

      for (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IHICORCROOROHCIHIHCOIHRRHICICO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var6 : var3) {
         if (!var2.get(var6.HIOCCOOIRICIHCRCHOHOCHCHRCOIIR)) {
            var4 += var6.RHHIOHORCORRRIORHHOICHRCCIIOOI;
         }
      }

      return var4;
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, int var2, int var3) {
      ((List)this.IRIOCOCHIIRIOOICOOCRCICROOOHOI.computeIfAbsent(var1, var0 -> new ArrayList()))
         .add(
            new com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IHICORCROOROHCIHIHCOIHRRHICICO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               var2, var3
            )
         );
   }

   public void remove(String var1) {
      this.IRIOCOCHIIRIOOICOOCRCICROOOHOI.remove(var1);
   }

   @Generated
   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
   }

   private record RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      private final int HIOCCOOIRICIHCRCHOHOCHCHRCOIIR;
      private final int RHHIOHORCORRRIORHHOICHRCCIIOOI;

      private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(int var1, int var2) {
         this.HIOCCOOIRICIHCRCHOHOCHCHRCOIIR = var1;
         this.RHHIOHORCORRRIORHHOICHRCCIIOOI = var2;
      }

      public int CRORORCORCHIHOIOICHHIROHRIOCOI() {
         return this.HIOCCOOIRICIHCRCHOHOCHCHRCOIIR;
      }

      public int count() {
         return this.RHHIOHORCORRRIORHHOICHRCCIIOOI;
      }
   }
}
