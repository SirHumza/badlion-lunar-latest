package com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.IIHRRHORCRCROCHHOHORCHCROCIHRO;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;
import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.HHRIICOIOORCHCOIICOOIHIRHHICRI;
import com.moonsworth.lunar.client.IRRCCOICORICIHCHRHIHIHROIRHOCR.CRRRICCRROCOHHOHIICIHORCOORRRH;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.ORCOCORROHIROCCIORORRRRCHIOOCH;
import com.moonsworth.lunar.client.util.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Supplier;
import org.jetbrains.annotations.NotNull;

public class HHCCIRHCCCIIRHCROHIORHIRHHIORH extends CRRRICCRROCOHHOHIICIHORCOORRRH {
   @NotNull
   private static RCIRROCCCIIHCIHCCRHHCCHOHHHCHH OOICCHHORRRRIRCOHCHHHCRROCHIOO = new RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();
   private final Map<String, List<IRCIIHHICIHRCOCRROCOICRIHHCCHH>> OROCHIRHIOCRCORIRHROIHCHRIOORH = new ConcurrentHashMap<>();
   private final RRCRRCORICCHOHHIRCHIROOHIIOHCO ROHOCCHOROIRHRROCIHICHRCOCCICI = IICCOOCHCHROORHHIIHROHCCRHRCOR.hasModule("optifine")
      ? this.IIRHCHHOICHRICOOCRORCCIOOIHOIR(RRCRRCORICCHOHHIRCHIROOHIIOHCO.class)
      : null;
   private volatile boolean OHCCHHIOOOCHRHOCHIIRRCCOCCRIOO = false;

   private HHCCIRHCCCIIRHCROHIORHIRHHIORH() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.hasModule("sodium")) {
         this.handle(HHRIICOIOORCHCOIICOOIHIRHHICRI.class, var1 -> {
            if (this.OHCCHHIOOOCHRHOCHIIRRCCOCCRIOO) {
               this.OHCCHHIOOOCHRHOCHIIRRCCOCCRIOO = false;
               if (IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI() != null) {
                  RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getLevelRenderer();
                  if (var2 != null) {
                     var2.bridge$reloadChunks();
                  }
               }
            }
         });
      }
   }

   public static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var0
   ) {
      if (var0 != null) {
         ORCOCORROHIROCCIORORRRRCHIOOCH.RHCHRCOCCOIIIHCHRHIRCORHRHRICR(
            () -> {
               com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1 = OOICCHHORRRRIRCOHCHHHCRROCHIOO;
               OOICCHHORRRRIRCOHCHHHCRROCHIOO = var0;
               if (var1 instanceof RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2) {
                  var0.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var2.HIHRCIIHROOCCHHHIIICCHIHCOOCOO());
                  var2.HIHRCIIHROOCCHHHIIICCHIHCOOCOO().clear();
               }
            }
         );
      }
   }

   @Override
   protected void onDisable() {
      if (!this.OROCHIRHIOCRCORIRHROIHCHRIOORH.isEmpty()) {
         HashSet var1 = new HashSet<>(this.OROCHIRHIOCRCORIRHROIHCHRIOORH.keySet());
         this.OROCHIRHIOCRCORIRHROIHCHRIOORH.clear();
         this.IHIRRIIORRHORHRORIHOROIRCORCOO(var1);
      }
   }

   public void RIROICHCRROROHCCROOCCCCOCHCCRI(Set<? extends IRCIIHHICIHRCOCRROCOICRIHHCCHH> var1) {
      HashSet var2 = new HashSet();

      for (String var4 : this.OROCHIRHIOCRCORIRHROIHCHRIOORH.keySet()) {
         for (IRCIIHHICIHRCOCRROCOICRIHHCCHH var7 : this.OROCHIRHIOCRCORIRHROIHCHRIOORH.get(var4)) {
            if (var1.contains(var7)) {
               var2.add(var4);
               break;
            }
         }
      }

      if (!var2.isEmpty()) {
         OOICCHHORRRRIRCOHCHHHCRROCHIOO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var2);
         this.OHCCHHIOOOCHRHOCHIIRRCCOCCRIOO = true;
      }
   }

   public void OCHORHOIHOOIRIRORORCHHIOOOIIHC() {
      if (!this.OROCHIRHIOCRCORIRHROIHCHRIOORH.isEmpty()) {
         OOICCHHORRRRIRCOHCHHHCRROCHIOO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(this.OROCHIRHIOCRCORIRHROIHCHRIOORH.keySet());
         this.OHCCHHIOOOCHRHOCHIIRRCCOCCRIOO = true;
      }
   }

   public void IHIRRIIORRHORHRORIHOROIRCORCOO(Set<String> var1) {
      if (!var1.isEmpty()) {
         OOICCHHORRRRIRCOHCHHHCRROCHIOO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var1);
         this.OHCCHHIOOOCHRHOCHIIRRCCOCCRIOO = true;
      }
   }

   public void CRRRICCRROCOHHOHIICIHORCOORRRH(String var1, Supplier<IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> var2) {
      List var3 = this.OROCHIRHIOCRCORIRHROIHCHRIOORH.get(var1);
      if (var3 != null && !var3.isEmpty()) {
         IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 = (IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var2.get();

         for (int var5 = var3.size() - 1; var5 >= 0; var5--) {
            ((IRCIIHHICIHRCOCRROCOICRIHHCCHH)var3.get(var5)).process(var4);
         }
      }
   }

   public boolean RRIIOCROCRROCCOOHRRRCHHCRRHCRI(String var1) {
      List var2 = this.OROCHIRHIOCRCORIRHROIHCHRIOORH.get(var1);
      return var2 != null && !var2.isEmpty();
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, IRCIIHHICIHRCOCRROCOICRIHHCCHH var2, boolean var3) {
      var1 = OCOCOOOIHOOIOHCOHICOHRCRCRIIHC(var1);
      List var4 = this.OROCHIRHIOCRCORIRHROIHCHRIOORH.computeIfAbsent(var1, var0 -> new CopyOnWriteArrayList<>());
      if (!var4.contains(var2)) {
         var4.add(var2);
         if (var3) {
            this.IHIRRIIORRHORHRORIHOROIRCORCOO(Set.of(var1));
         }
      }
   }

   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(String var1, IRCIIHHICIHRCOCRROCOICRIHHCCHH var2, boolean var3) {
      var1 = OCOCOOOIHOOIOHCOHICOHRCRCRIIHC(var1);
      List var4 = this.OROCHIRHIOCRCORIRHROIHCHRIOORH.get(var1);
      if (var4 != null) {
         boolean var5 = var4.remove(var2) && var3;
         if (var4.isEmpty()) {
            this.OROCHIRHIOCRCORIRHROIHCHRIOORH.remove(var1);
         }

         if (var5) {
            this.IHIRRIIORRHORHRORIHOROIRCORCOO(Set.of(var1));
         }
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IRCIIHHICIHRCOCRROCOICRIHHCCHH var1, boolean var2) {
      HashSet var3 = new HashSet();
      Iterator var4 = this.OROCHIRHIOCRCORIRHROIHCHRIOORH.entrySet().iterator();

      while (var4.hasNext()) {
         Entry var5 = (Entry)var4.next();
         String var6 = (String)var5.getKey();
         List var7 = (List)var5.getValue();
         if (var7 != null && var7.remove(var1)) {
            if (var2) {
               var3.add(var6);
            }

            if (var7.isEmpty()) {
               var4.remove();
            }
         }
      }

      if (!var3.isEmpty()) {
         this.IHIRRIIORRHORHRORIHOROIRCORCOO(var3);
      }
   }

   public void RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO(String var1, boolean var2) {
      var1 = OCOCOOOIHOOIOHCOHICOHRCRCRIIHC(var1);
      List var3 = this.OROCHIRHIOCRCORIRHROIHCHRIOORH.remove(var1);
      if (var3 != null) {
         boolean var4 = var2 && !var3.isEmpty();
         var3.clear();
         if (var4) {
            this.IHIRRIIORRHORHRORIHOROIRCORCOO(Set.of(var1));
         }
      }
   }

   public Optional<RRCRRCORICCHOHHIRCHIROOHIIOHCO> HRRORCIHIHROCIRCRHOORROIOCOCCH() {
      return this.ROHOCCHOROIRHRROCIHICHRCOCCICI != null && this.ROHOCCHOROIRHRROCIHICHRCOCCICI.IRRRRCCCHRIRCRRRCHIOORHHRHICRH()
         ? Optional.of(this.ROHOCCHOROIRHRROCIHICHRCOCCICI)
         : Optional.empty();
   }

   public static String OCOCOOOIHOOIOHCOHICOHRCRCRIIHC(String var0) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 0) {
         int var1 = var0.indexOf(":");
         if (var1 != -1) {
            var0 = var0.substring(var1 + 1);
         }

         var0 = var0.replace("blocks/", "");
         var0 = var0.replace("block/", "");
         var0 = var0.replace("items/", "");
         return var0.replace("item/", "");
      } else {
         if (!var0.contains(":")) {
            var0 = "minecraft:" + var0;
         }

         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION > 5) {
            var0 = var0.replace("minecraft:blocks/", "minecraft:block/");
            var0 = var0.replace("minecraft:items/", "minecraft:item/");
         } else {
            var0 = var0.replace("minecraft:block/", "minecraft:blocks/");
            var0 = var0.replace("minecraft:item/", "minecraft:items/");
         }

         return var0;
      }
   }

   public void CRCIRHHIIIROIRCIIOCIHOHHHCRHIC() {
      OOICCHHORRRRIRCOHCHHHCRROCHIOO.CRCIRHHIIIROIRCIIOCIHOHHHCRHIC();
   }

   public void IHIIICHIOORRRCCHHORHCOHRHIICOH() {
      OOICCHHORRRRIRCOHCHHHCRROCHIOO.IHIIICHIOORRRCCHHORHCOHRHIICOH();
   }
}
