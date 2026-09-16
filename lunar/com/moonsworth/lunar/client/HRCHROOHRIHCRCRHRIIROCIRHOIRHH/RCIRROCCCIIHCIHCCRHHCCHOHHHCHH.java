package com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;

import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Deque;
import java.util.Map.Entry;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   private static final boolean OOICICHHRHOHRRHORCIHROHIHOOIOC = false;
   private static final boolean HIHCIICCRIRHOHHHOOCROCIIRRHOOI = false;
   private static final boolean HOHCHRHCOOHCHHHRHIHRIIHOHRCIOI = false;
   protected final Deque<Class<? extends com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH>> HHCROHIHRRCOIHHRROHOIOOHOOIHHC = null;

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      if (com.moonsworth.lunar.client.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHRRICCIOIHROCCOIIORROIROCIIOR) {
         throw new IllegalAccessError("DebuggingEventBus is being used in production environment!");
      }
   }

   public Object2IntMap<String> IHOROCHCICHIIOOHHRRIRIIICIRRRR() {
      Object2IntOpenHashMap var1 = new Object2IntOpenHashMap();

      for (Entry var3 : this.ORICOOIHHOIOIHOOHHOHHHIIHCHRII.entrySet()) {
         int var4 = ((RRCRRCORICCHOHHIRCHIROOHIIOHCO[])var3.getValue()).length;
         if (var4 > 1) {
            var1.put(this.CRICCOOHHHCHOORCICOCOHIHOIRHOO((Class<?>)var3.getKey()), var4);
         }
      }

      return var1;
   }

   @Override
   protected void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<?> var1) {
      this.HCOHRORHHOHRROHROCCOCROROHRHHR.add(var1);
   }

   @Override
   protected void CORCOCICIRIOHROHROIIOOHICCHCRR(
      Class<? extends com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH> var1
   ) {
      super.CORCOCICIRIOHROHROIIOOHICCHCRR(var1);
   }

   @Override
   protected void IIOIIRHIHIHROIHHOROOHCHCOOCRIC() {
      super.IIOIIRHIHIHROIHHOROOHCHCOOCRIC();
   }

   @Override
   protected void OHCROCICCCORCIRCIHRRCIORCHOHRH() {
      if (!this.HCOHRORHHOHRROHROCCOCROROHRHHR.isEmpty()) {
         for (HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 : this.HCOHRORHHOHRROHROCCOCROROHRHHR) {
            if (var2.HHIHHOCHCHOICHRIHCHRIICHOCCHHI()) {
               this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var2.HCOCHROIHOHRIIHHRIHCOOIIOHOORC(), var2.COIOHCOCOHIRRRRRCCIHRRCICOCOII(), var2.priority());
            } else {
               this.CRRRICCRROCOHHOHIICIHORCOORRRH(var2.HCOCHROIHOHRIIHHRIHCOOIIOHOORC(), var2.COIOHCOCOHIRRRRRCCIHRRCICOCOII());
            }
         }

         this.HCOHRORHHOHRROHROCCOCROROHRHHR.clear();
      }
   }

   private String CRICCOOHHHCHOORCICOCOHIHOIRHOO(Class<?> var1) {
      String var2 = var1.getSimpleName();
      int var3 = var2.length();
      if (var3 > 8 && var2.contains("Event")) {
         return var2;
      }

      String var4 = var1.getName();
      int var5 = var4.lastIndexOf(46);
      return var5 != -1 && var4.length() - var5 >= 8 ? var4.substring(var5 + 1) : var4;
   }
}
