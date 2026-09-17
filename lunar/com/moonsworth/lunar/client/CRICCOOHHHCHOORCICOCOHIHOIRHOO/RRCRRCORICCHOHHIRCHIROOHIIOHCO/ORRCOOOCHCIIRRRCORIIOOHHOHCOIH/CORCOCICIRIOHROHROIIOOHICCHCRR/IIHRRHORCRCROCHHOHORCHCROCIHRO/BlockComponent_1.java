package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.IIHRRHORCRCROCHHOHORCHCROCIHRO;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class CORCOCICIRIOHROHROIIOOHICCHCRR {
   private static final IntOpenHashSet ICICHRIRCHHCRCIRHIOCOCCIRCHRRI = new IntOpenHashSet();
   private final Map<String, IntOpenHashSet> OORICOOHRHICCRCRHOIHHHICORCRCH = new Object2ObjectOpenHashMap();
   private final List<CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> OHHCRICROCIHROHOORICCCOOROIOOO = new ArrayList<>();
   private final List<CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> OIRIOIHRORCHOIORICRCRRICHHCOCR = new ArrayList<>();
   private final List<CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> IIRRRCHORHRHOCROCOOORHHORRHIHO = new ArrayList<>();
   private final LoadingCache<String, IntOpenHashSet> RCCOCICOHIRHOHHIOIROOHOCHIIOHC = CacheBuilder.newBuilder()
      .maximumSize(50L)
      .build(CacheLoader.from(this::HCOOIIIRIOOOIRRIIOIRIIRHRIHOHH));

   @Nullable
   public IntOpenHashSet RCCHCOOHRHCOHOHCIOCHRCRHOHOHRC(String var1) {
      try {
         IntOpenHashSet var2 = (IntOpenHashSet)this.RCCOCICOHIRHOHHIOIROOHOCHIIOHC.get(var1);
         return var2 == ICICHRIRCHHCRCIRHIOCOCCIRCHRRI ? null : var2;
      } catch (ExecutionException var3) {
         com.moonsworth.lunar.client.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var3, "SkyBlockMiddleClickGuis"
         );
         return null;
      }
   }

   @NotNull
   private IntOpenHashSet HCOOIIIRIOOOIRRIIOIRIIRHRIHOHH(String var1) {
      IntOpenHashSet var2 = this.OORICOOHRHICCRCRHOIHHHICORCRCH.get(var1);
      if (var2 != null) {
         return var2;
      }

      for (CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 : this.OHHCRICROCIHROHOORICCCOOROIOOO) {
         if (var1.startsWith(var4.name())) {
            return var4.HHRORIHCRIIOROORHOIIOICRCHCICH();
         }
      }

      for (CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var7 : this.OIRIOIHRORCHOIORICRCRRICHHCOCR) {
         if (var1.endsWith(var7.name())) {
            return var7.HHRORIHCRIIOROORHOIIOICRCHCICH();
         }
      }

      for (CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var8 : this.IIRRRCHORHRHOCROCOOORHHORRHIHO) {
         if (var1.contains(var8.name())) {
            return var8.HHRORIHCRIIOROORHOIIOICRCHCICH();
         }
      }

      return ICICHRIRCHHCRCIRHIOCOCCIRCHRRI;
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, IntOpenHashSet var2) {
      this.OHHCRICROCIHROHOORICCCOOROIOOO.add(new CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2));
   }

   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(String var1, IntOpenHashSet var2) {
      this.OIRIOIHRORCHOIORICRCRRICHHCOCR.add(new CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2));
   }

   public void HHCCIRHCCCIIRHCROHIORHIRHHIORH(String var1, IntOpenHashSet var2) {
      this.IIRRRCHORHRHOCROCOOORHHORRHIHO.add(new CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2));
   }

   public void CRRRICCRROCOHHOHIICIHORCOORRRH(String var1, IntOpenHashSet var2) {
      this.OORICOOHRHICCRCRHOIHHHICORCRCH.put(var1, var2);
   }

   private record RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      private final String HORHCIHICIRRCOHRHRIRCICCIHCRIR;
      private final IntOpenHashSet HCHHIIIOHHOCICCOOIHCOORIOOHRHH;

      private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, IntOpenHashSet var2) {
         this.HORHCIHICIRRCOHRHRIRCICCIHCRIR = var1;
         this.HCHHIIIOHHOCICCOOIHCOORIOOHRHH = var2;
      }

      public String name() {
         return this.HORHCIHICIRRCOHRHRIRCICCIHCRIR;
      }

      public IntOpenHashSet HHRORIHCRIIOROORHOIIOICRCHCICH() {
         return this.HCHHIIIOHHOCICCOOIHCOORIOOHRHH;
      }
   }
}
