package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;

import com.lunarclient.generated.skyblockprofileresponse.profile.Member;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;
import com.moonsworth.lunar.client.IRRCCOICORICIHCHRHIHIHROIRHOCR.CRRRICCRROCOHHOHIICIHORCOORRRH;
import com.moonsworth.lunar.client.util.COOCCHICCCIIICRHIOCOCIOOORCOCC;
import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.event.HoverEvent;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import lombok.Generated;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH extends CRRRICCRROCOHHOHIICIHORCOORRRH {
   private static final Pattern RRHCHRROIOIIOICOIRRCIOCOOOHOOO = Pattern.compile("^ {2}(?<amount>[+-][\\d,]+) (?<item>[\\w ]+) \\((?<sack>[\\w ]+ Sack)\\)$");
   private static final Pattern RORHRICCIICIHHIRHRHRHOCRORIOCR = Pattern.compile("^\\[Sacks] (?<amount>[+-][0-9,]+) items?\\. \\(Last \\d+s\\.\\)$");
   private final com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH RORHCHCIOOHCCHCOIIIHROOIIRROIR = this.IIRHCHHOICHRICOOCRORCCIOOIHOIR(
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.class
   );
   private final Object2IntOpenHashMap<String> COIHIRIICOOOCCRCCIHHRHROOCCCHO = new Object2IntOpenHashMap();

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH() {
      this.handle(RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.class, this::IRCIIHHICIHRCOCRROCOICRIHHCCHH);
      this.handle(RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class, this::CRRRICCRROCOHHOHIICIHORCOORRRH);
      this.handle(
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.class,
         this::OCOHORHCROHICRRIHCIHHRRCIHICRI
      );
   }

   public int CHCOHOCCOOHCHIHHRCIHIHOHOIRIHH(String var1) {
      return this.COIHIRIICOOOCCRCCIHHRHROOCCCHO.getOrDefault(var1, 0);
   }

   private void IRCIIHHICIHRCOCRROCOICRIHHCCHH(RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1) {
      this.COIHIRIICOOOCCRCCIHHRHROOCCCHO.clear();
   }

   private void CRRRICCRROCOHHOHIICIHORCOORRRH(RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      this.ICCIORRHHHCOHCCIIORCCRHHOCCHOH();
   }

   @Override
   public void onEnable() {
      this.ICCIORRHHHCOHCCIIORCCRHHOCCHOH();
   }

   private void OCOHORHCROHICRRIHCIHHRRCIHICRI(
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
   ) {
      String var2 = var1.OIHOIRRICORHHRHOIOIHORCHOIRCOO();
      if (RORHRICCIICIHHIRHRHRHOCRORIOCR.matcher(var2).matches()) {
         Component var3 = var1.RRCIOIRIRCCHCRCOOICRRORCRIHHRC();

         for (Component var5 : var3.children()) {
            HoverEvent var6 = var5.hoverEvent();
            if (var6 != null && var6.action() == HoverEvent.Action.SHOW_TEXT && var6.value() instanceof Component var7) {
               String var17 = RRCRRCORICCHOHHIRCHIROOHIIOHCO.getTextContent(var7);

               for (String var12 : var17.split("\n")) {
                  Matcher var13 = RRHCHRROIOIIOICOIRRCIOCOOOHOOO.matcher(var12);
                  if (var13.matches()) {
                     int var14 = COOCCHICCCIIICRHIOCOCIOOORCOCC.IOORROIRICCOCCOOCCIROIIIHRCCCC(var13.group("amount").replace("+", "").replace(",", ""));
                     String var15 = com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HIOHROICIHRRRRIHIRHHIIRRCCHRHO
                        .get(var13.group("item"));
                     if (var15 != null) {
                        int var16 = Math.max(this.COIHIRIICOOOCCRCCIHHRHROOCCCHO.getOrDefault(var15, 0) + var14, 0);
                        this.COIHIRIICOOOCCRCCIHHRHROOCCCHO.put(var15, var16);
                     }
                  }
               }

               return;
            }
         }
      }
   }

   private void ICCIORRHHHCOHCCIIORCCRHHOCCHOH() {
      Member var1 = this.RORHCHCIOOHCCHCOIIIHROOIIRROIR.COHORHIORRCRCRHRIIOICCCCRCHOHC();
      if (var1 != null) {
         Map var2 = var1.inventory().sacksCounts().entrySet().stream().collect(Collectors.toMap(Entry::getKey, var0 -> ((Double)var0.getValue()).intValue()));
         this.COIHIRIICOOOCCRCCIHHRHROOCCCHO.putAll(var2);
      }
   }

   @Generated
   public Object2IntOpenHashMap<String> CRCHHHICCICHHHCORIHOHROOORRCHO() {
      return this.COIHIRIICOOOCCRCCIHHRHROOCCCHO;
   }
}
