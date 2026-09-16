package com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;

import com.lunarclient.websocket.analytics.v1.CounterUpdate;
import com.lunarclient.websocket.analytics.v1.RecordCountersRequest;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import it.unimi.dsi.fastutil.objects.Object2IntMap.FastEntrySet;
import java.util.Map;
import lombok.Generated;

public class HHCCIRHCCCIIRHCROHIORHIRHHIORH
   extends com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.HHCCIRHCCCIIRHCROHIORHIRHHIORH<String, Integer>
   implements com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI,
   com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH {
   private static final int CRHROHHRIOHOCIOCIRHICICOIIICRH = 60;
   private int ICOHOHHHOHRICCHCRCIIOIHHIHRHRH = 0;

   public HHCCIRHCCCIIRHCROHIORHIRHHIORH() {
      this.handle(
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.class,
         var1 -> this.CIOHHCORHRCCRICCCORIHCRHCCCRRR("stat:minecraft.custom:minecraft.deaths", 1)
      );
      this.handle(
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIROICHCRROROHCCROOCCCCOCHCCRI.class,
         var1 -> this.OOIHOHCIIRORIOHIRRRORHHHIIIHCH(false)
      );
      this.handle(
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.class,
         var1 -> this.OOIHOHCIIRORIOHIRRRORHHHIIIHCH(true)
      );
   }

   @Override
   protected Map<String, Integer> HOIHRIHCOICOOORCIORHOCRCRRCRHI() {
      Object2IntOpenHashMap var1 = new Object2IntOpenHashMap();
      var1.defaultReturnValue(0);
      return var1;
   }

   public void CIOHHCORHRCCRICCCORIHCRHCCCRRR(String var1, int var2) {
      IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$submit(() -> {
         Object2IntOpenHashMap var3 = (Object2IntOpenHashMap)this.RHHCIRRROCHIIHOCRIIHIHOOCCCRCR();
         var3.put(var1, var3.getInt(var1) + var2);
      });
   }

   private void OOIHOHCIIRORIOHIRRRORHHHIIIHCH(boolean var1) {
      if (!var1 && this.ICOHOHHHOHRICCHCRCIIOIHHIHRHRH < 60) {
         this.ICOHOHHHOHRICCHCRCIIOIHHIHRHRH++;
      } else {
         this.ICOHOHHHOHRICCHCRCIIOIHHIHRHRH = 0;
         if (!this.RHHCIRRROCHIIHOCRIIHIHOOCCCRCR().isEmpty()) {
            IICCOOCHCHROORHHIIHROHCCRHRCOR.IIIIIOCCCIIOHOCRRCCOOCHOHRCRCO().ifPresent(var1x -> {
               RecordCountersRequest.Builder var2 = RecordCountersRequest.newBuilder();
               FastEntrySet var3 = ((Object2IntOpenHashMap)this.RHHCIRRROCHIIHOCRIIHIHOOCCCRCR()).object2IntEntrySet();
               ObjectIterator var4 = var3.fastIterator();

               while (var4.hasNext()) {
                  Entry var5 = (Entry)var4.next();
                  int var6 = var5.getIntValue();
                  if (var6 != 0) {
                     var2.addUpdates(CounterUpdate.newBuilder().setCounter((String)var5.getKey()).setDelta(var6).build());
                  }
               }

               var1x.IOIOORHICOIOOHCRIIROHCIROICCCO().recordCounters(null, var2.build(), var0 -> {});
               this.clear();
            });
         }
      }
   }

   @Override
   public void close() {
      this.OOIHOHCIIRORIOHIRRRORHHHIIIHCH(true);
   }

   @Generated
   public int OICRRHOOHRCIIIHIIIROCCOCCHCHHR() {
      return this.ICOHOHHHOHRICCHCRCIIOIHHIHRHRH;
   }
}
