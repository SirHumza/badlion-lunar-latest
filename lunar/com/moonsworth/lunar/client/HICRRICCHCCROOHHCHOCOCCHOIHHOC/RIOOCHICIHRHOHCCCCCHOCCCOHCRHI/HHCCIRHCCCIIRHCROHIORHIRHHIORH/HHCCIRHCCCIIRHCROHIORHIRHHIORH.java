package com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.IIRHCHHOICHRICOOCRORCCIOOIHOIR;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import org.apache.commons.io.IOUtils;
import org.jgrapht.alg.cycle.CycleDetector;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.jgrapht.traverse.TopologicalOrderIterator;

public class HHCCIRHCCCIIRHCROHIORHIRHHIORH implements RIOOCHICIHRHOHCCCCCHOCCCOHCRHI {
   private static final RCIROOOOICRHCCRRCIORHHIRCOIIIC HOORCORRRHHOIRIHORRROHCICCRCIR = RCIROOOOICRHCCRRCIORHHIRCOIIIC.create("lunar", "cosmetics/compat.json");
   private Map<String, RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> HCHROHIROIOOCROIIIHCRCOCHHCCIO = new HashMap<>();

   public Optional<RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> IHRRCOCOIIIIICRHRRICIOCRCIRHCO(String var1) {
      return Optional.ofNullable(this.HCHROHIROIOOCROIIIHCRCOCHHCCIO.get(var1));
   }

   @Override
   public void close() {
   }

   @Override
   public void init() {
      this.HCHROHIROIOOCROIIIHCRCOCHHCCIO.clear();
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var1 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
         .bridge$getResourceManager();
      com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         "Loading cosmetic compatibility json"
      );

      try {
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CORCOCICIRIOHROHROIIOOHICCHCRR.RRCRRCORICCHOHHIRCHIROOHIIOHCO var2 = var1.bridge$getResource(
            HOORCORRRHHOIRIHORRROHCICCRCIR
         );
         if (var2 == null) {
            com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
               "Could not find cosmetic compatibility json file: " + HOORCORRRHHOIRIHORRROHCICCRCIR
            );
            return;
         }

         JsonObject var3 = IIRHCHHOICHRICOOCRORCCIOOIHOIR.ORHHIICRRIOIOHCHHCHHHRCIORCHRI
            .fromJson(IOUtils.toString(var2.bridge$getInputStream()), JsonObject.class);
         DefaultDirectedGraph var4 = this.ORCOCORROHIROCCIORORRRRCHIOOCH(var3);
         CycleDetector var5 = new CycleDetector(var4);
         if (var5.detectCycles()) {
            com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
               "Invalid parenting cycle in compatibility presets"
            );
            Set var19 = var5.findCycles();
            com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
               "Following compatibility presets are in a cycle"
            );
            var19.forEach(System.out::println);
            return;
         }

         TopologicalOrderIterator var6 = new TopologicalOrderIterator(var4);
         HashMap var7 = new HashMap();

         while (var6.hasNext()) {
            JsonObject var8 = (JsonObject)var6.next();
            ArrayList var9 = new ArrayList(var4.incomingEdgesOf(var8));
            String var10 = var8.get("name").getAsString();
            HashSet var11 = new HashSet();
            HashSet var12 = new HashSet();
            HashSet var13 = new HashSet();
            HashSet var14 = new HashSet();
            IRCIIHHICIHRCOCRROCOICRIHHCCHH var15 = null;
            if (var9.size() == 1) {
               JsonObject var16 = ((RRCRRCORICCHOHHIRCHIROOHIIOHCO)var9.get(0)).RCIIHIHRIIRHCOHIICCOOIHOOORRCR();
               var15 = (IRCIIHHICIHRCOCRROCOICRIHHCCHH)var7.get(var16.get("name").getAsString());
               var11.addAll(var15.RIHCCOHHRHICIOIIHIHCICHCIOOROC());
               var12.addAll(var15.OOOICOROOHRIIOCCRCOOIIIRROHCCI());
            }

            if (var8.get("incompatible") instanceof JsonArray var20) {
               var20.forEach(var2x -> {
                  Set var3x = CRRRICCRROCOHHOHIICIHORCOORRRH.IRORRCRORIHIIROORHIIRHROOIIHOO(var2x.getAsString()).RCOIOOHOCCCIRCHIOHIHHCRCCHRHOR();
                  var13.addAll(var3x);
                  var12.removeAll(var3x);
               });
            }

            if (var8.get("compatible") instanceof JsonArray var21) {
               var21.forEach(var2x -> {
                  Set var3x = CRRRICCRROCOHHOHIICIHORCOORRRH.IRORRCRORIHIIROORHIIRHROOIIHOO(var2x.getAsString()).RCOIOOHOCCCIRCHIOHIHHCRCCHRHOR();
                  var14.addAll(var3x);
                  var11.removeAll(var3x);
               });
            }

            var14.addAll(var12);
            var13.addAll(var11);
            var7.put(var10, new IRCIIHHICIHRCOCRROCOICRIHHCCHH(var10, var15, var14, var13));
         }

         var7.forEach((var1x, var2x) -> this.HCHROHIROIOOCROIIIHCRCOCHHCCIO.put(var1x, var2x.IIICCRIIROIOOIHCHCHCCCIHHIOHIC()));
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            "Compiled cosmetic compatability presets"
         );
      } catch (IOException var18) {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
            "Could not find cosmetic compatibility json file"
         );
      }
   }

   private DefaultDirectedGraph<JsonObject, RRCRRCORICCHOHHIRCHIROOHIIOHCO> ORCOCORROHIROCCIORORRRRCHIOOCH(JsonObject var1) {
      DefaultDirectedGraph var2 = new DefaultDirectedGraph<>(RRCRRCORICCHOHHIRCHIROOHIIOHCO.class);
      HashMap var3 = new HashMap();
      if (var1.get("presets") instanceof JsonArray var4) {
         var4.forEach(var2x -> {
            if (var2x instanceof JsonObject var3x && var3x.has("name")) {
               var3.put(var3x.get("name").getAsString(), var3x);
               var2.addVertex(var3x);
            }
         });

         for (JsonElement var6 : var4) {
            if (var6 instanceof JsonObject var7 && var7.has("parent")) {
               String var8 = var7.get("parent").getAsString();
               if (var3.containsKey(var8)) {
                  var2.addEdge((JsonObject)var3.get(var8), var7);
               } else {
                  com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
                     "Could not find compatibility preset {}, referenced from {}", var8, var7.get("name").getAsString()
                  );
               }
            }
         }
      }

      return var2;
   }
}
