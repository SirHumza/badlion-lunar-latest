package com.moonsworth.lunar.ichor.RRCRRCORICCHOHHIRCHIROOHIIOHCO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import org.cadixdev.bombe.provider.ClassProvider;
import org.cadixdev.lorenz.MappingSet;
import org.cadixdev.lorenz.model.Mapping;

public interface RIOOCHICIHRHOHCCCCCHOCCCOHCRHI {
   Map<String, String> IOHIHIIHCCCCCIHRORIOIOORCIOHII();

   Map<String, String> CHICIIIHHHRRIIIIRHIHOCOHHCRRHH();

   default void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(com.moonsworth.lunar.ichor.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1, String var2, List<String> var3) {
      com.moonsworth.lunar.ichor.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var4 = var1.IOHOCCRORRHOHRROHCIHIIROIHRHOO(var2);
      var4.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2, (var2x, var3x) -> {
         for (String var5 : var3) {
            if (var2x.startsWith(var5) && var2x.endsWith(".class")) {
               try {
                  this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3x.get(), var2x);
                  break;
               } catch (Exception var7) {
                  throw new IllegalStateException("Failed to read inheritance map from file " + var2x, var7);
               }
            }
         }
      });
   }

   default void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(byte[] var1, String var2) {
      if (var1 != null) {
         String var3 = var2.substring(0, var2.indexOf(46));
         com.moonsworth.lunar.ichor.util.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IIOCHOIICCIORCOROIROHICCHIOHIC(var1)
            .ifPresent(var2x -> this.IOHIHIIHCCCCCIHRORIOIOORCIOHII().put(var3, var2x));
      }
   }

   default void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(MappingSet var1, ClassProvider var2) {
      for (Entry var4 : this.IOHIHIIHCCCCCIHRORIOIOORCIOHII().entrySet()) {
         String var5 = (String)var4.getKey();
         String var6 = var1.getClassMapping((String)var4.getValue()).map(Mapping::getFullDeobfuscatedName).orElse((String)var4.getValue());
         this.CHICIIIHHHRRIIIIRHIHOCOHHCRRHH().put(var5, var6);
         Set var7 = com.moonsworth.lunar.ichor.util.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5, var2);
         var7.forEach(
            var3 -> CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               var3, var5, var1, var1, var1xx -> com.moonsworth.lunar.ichor.util.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1xx, var2)
            )
         );
      }
   }

   default void IRCIIHHICIHRCOCRROCOICRIHHCCHH(MappingSet var1) {
      HashMap var2 = new HashMap();
      this.IOHIHIIHCCCCCIHRORIOIOORCIOHII().forEach((var2x, var3) -> {
         String var4 = var1.getClassMapping(var2x).map(Mapping::getFullDeobfuscatedName).orElse(var2x);
         String var5 = var1.getClassMapping(var3).map(Mapping::getFullDeobfuscatedName).orElse(var3);
         var2.put(var4, var5);
      });
      this.IOHIHIIHCCCCCIHRORIOIOORCIOHII().clear();
      this.IOHIHIIHCCCCCIHRORIOIOORCIOHII().putAll(var2);
   }
}
