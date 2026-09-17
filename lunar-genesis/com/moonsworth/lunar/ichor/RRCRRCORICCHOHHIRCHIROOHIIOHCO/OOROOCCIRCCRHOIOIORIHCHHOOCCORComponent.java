package com.moonsworth.lunar.ichor.RRCRRCORICCHOHHIRCHIROOHIIOHCO;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import lombok.Generated;
import org.cadixdev.bombe.analysis.InheritanceProvider;
import org.cadixdev.bombe.analysis.InheritanceType;
import org.cadixdev.bombe.type.MethodDescriptor;
import org.cadixdev.bombe.type.signature.MethodSignature;
import org.cadixdev.lorenz.MappingSet;
import org.cadixdev.lorenz.model.ClassMapping;
import org.cadixdev.lorenz.model.FieldMapping;
import org.cadixdev.lorenz.model.MethodMapping;

public class RRCRRCORICCHOHHIRCHIROOHIIOHCO extends OOROOCCIRCCRHOIOIORIHCHHOOCCOR {
   public static boolean DEBUG = System.getProperty("ichor.debug.remapper", null) != null;
   protected final com.moonsworth.lunar.ichor.CRRRICCRROCOHHOHIICIHORCOORRRH CCCIROHIRHIIHHROOCIICCRCOCCHOC;
   protected boolean HCHOCICIROHOORRCCIHHHCCRRROOIR;
   protected boolean COICCIHIRRORRHCORHHRROIIHROHRR;
   protected Set<String> IRIRHIORHICRCOHHHROCCRRCOORRII = Collections.newSetFromMap(new ConcurrentHashMap<>());

   public RRCRRCORICCHOHHIRCHIROOHIIOHCO(
      com.moonsworth.lunar.ichor.CRRRICCRROCOHHOHIICIHORCOORRRH var1, MappingSet var2, InheritanceProvider var3, boolean var4, boolean var5
   ) {
      super(var2, var3);
      this.CCCIROHIRHIIHHROOCIICCRCOCCHOC = var1;
      this.HCHOCICIROHOORRCCIHHHCCRRROOIR = var4;
      this.COICCIHIRRORRHCORHHRROIIHROHRR = var5;
   }

   @Override
   public ClassMapping<?, ?> getCompletedClassMapping(String var1) {
      ClassMapping var2 = this.CHHHCHHCOOCRIHHHHHCHOOIORROROO.getOrCreateClassMapping(var1);
      if (this.HCHOCICIROHOORRCCIHHHCCRRROOIR) {
         this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var2);
      }

      var2.complete(this.ROCHOICOOIIROHCIIICOIHRCCCHHRO);
      return var2;
   }

   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(ClassMapping<?, ?> var1) {
      if (this.IRIRHIORHICRCOHHHROCCRRCOORRII.add(var1.getFullObfuscatedName())) {
         InheritanceProvider.ClassInfo var2 = this.ROCHOICOOIIROHCIIICOIHRCCCHHRO.provide(var1.getFullDeobfuscatedName()).orElse(null);
         if (var2 != null) {
            Set var3 = var2.provideParents(this.ROCHOICOOIIROHCIIICOIHRCCCHHRO);
            if (!var3.isEmpty()) {
               HashMap var4 = new HashMap();

               for (Entry var6 : var2.getMethods().entrySet()) {
                  Set var7 = var4.computeIfAbsent(((MethodSignature)var6.getKey()).getName(), var0 -> new HashSet());
                  var7.add((MethodSignature)var6.getKey());
               }

               for (InheritanceProvider.ClassInfo var18 : var3) {
                  String var19 = var18.getName();
                  if (!var19.equals("java/lang/Object")) {
                     String var8 = this.HCHOCICIROHOORRCCIHHHCCRRROOIR
                        ? CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.CHHHCHHCOOCRIHHHHHCHOOIORROROO, var19)
                        : null;
                     ClassMapping var9 = var8 == null ? null : this.CHHHCHHCOOCRIHHHHHCHOOIORROROO.getClassMapping(var8).orElse(null);
                     if (var9 != null) {
                        var9 = this.getCompletedClassMapping(var9.getFullObfuscatedName());

                        for (FieldMapping var11 : var9.getFieldMappings()) {
                           if (!var1.computeFieldMapping(var11.getSignature()).isPresent()
                              && var18.canInherit(var2, var11.getDeobfuscatedSignature())
                              && var1.getFieldMapping(var11.getSignature()).isEmpty()) {
                              var1.createFieldMapping(var11.getSignature(), var11.getDeobfuscatedName());
                           }
                        }

                        for (MethodMapping var22 : var9.getMethodMappings()) {
                           if (!this.COICCIHIRRORRHCORHHRROIIHROHRR
                              || var18.getMethod(var22.getSignature()) != InheritanceType.NONE
                              || var18.getMethod(var22.getDeobfuscatedSignature()) != InheritanceType.NONE) {
                              if (var18.canInherit(var2, var22.getDeobfuscatedSignature())) {
                                 Optional var12 = var1.getMethodMapping(var22.getSignature());
                                 if (var12.isEmpty()) {
                                    var1.createMethodMapping(var22.getSignature(), var22.getDeobfuscatedName());
                                 }
                              }

                              if (var4.containsKey(var22.getObfuscatedName())) {
                                 for (MethodSignature var13 : (Set)var4.get(var22.getObfuscatedName())) {
                                    MethodDescriptor var14 = var13.getDescriptor();
                                    MethodSignature var15 = var22.getSignature();
                                    MethodDescriptor var16 = var15.getDescriptor();
                                    if (Objects.equals(var14.getParamTypes(), var16.getParamTypes())
                                       && var16.getReturnType().isAssignableFrom(var14.getReturnType(), this.ROCHOICOOIIROHCIIICOIHRCCCHHRO)
                                       && var1.getMethodMapping(var13).isEmpty()) {
                                       var1.createMethodMapping(var13, var22.getDeobfuscatedName());
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   @Generated
   public boolean RHRRIICOCRHOIIRHHHIIRHIOHRCCRC() {
      return this.HCHOCICIROHOORRCCIHHHCCRRROOIR;
   }
}
