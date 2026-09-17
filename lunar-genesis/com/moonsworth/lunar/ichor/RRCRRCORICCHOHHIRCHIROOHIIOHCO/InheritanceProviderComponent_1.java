package com.moonsworth.lunar.ichor.RRCRRCORICCHOHHIRCHIROOHIIOHCO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import org.cadixdev.bombe.analysis.InheritanceProvider;
import org.cadixdev.bombe.analysis.InheritanceType;
import org.cadixdev.bombe.type.FieldType;
import org.cadixdev.bombe.type.MethodDescriptor;
import org.cadixdev.bombe.type.signature.FieldSignature;
import org.cadixdev.bombe.type.signature.MethodSignature;
import org.cadixdev.lorenz.MappingSet;
import org.cadixdev.lorenz.model.ClassMapping;
import org.cadixdev.lorenz.model.Mapping;

public class HHCCIRHCCCIIRHCROHIORHIRHHIORH implements InheritanceProvider.ClassInfo {
   protected final InheritanceProvider.ClassInfo HHIRRHHCOHRORIROOCIOORCHHOCRCC;
   @Nullable
   protected final MappingSet IIOIIRHICHRIHIHHIRCCCICRHIOCCH;
   private final ClassMapping<?, ?> RRIHIOIRIIHIIRIORCIHOCICROIHHR;

   public HHCCIRHCCCIIRHCROHIORHIRHHIORH(InheritanceProvider.ClassInfo var1, @Nullable MappingSet var2) {
      this.HHIRRHHCOHRORIROOCIOORCHHOCRCC = var1;
      if (var2 != null) {
         this.IIOIIRHICHRIHIHHIRCCCICRHIOCCH = var2;
         String var3 = CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var1.getName(), null);
         if (var3 != null) {
            this.RRIHIOIRIIHIIRIORCIHOCICROIHHR = (ClassMapping<?, ?>)var2.getClassMapping(var3).orElse(null);
         } else {
            this.RRIHIOIRIIHIIRIORCIHOCICROIHHR = null;
         }
      } else {
         this.IIOIIRHICHRIHIHHIRCCCICRHIOCCH = null;
         this.RRIHIOIRIIHIIRIORCIHOCICROIHHR = null;
      }
   }

   @Override
   public String getName() {
      return this.RRIHIOIRIIHIIRIORCIHOCICROIHHR != null
         ? this.RRIHIOIRIIHIIRIORCIHOCICROIHHR.getFullDeobfuscatedName()
         : this.HHIRRHHCOHRORIROOCIOORCHHOCRCC.getName();
   }

   @Override
   public boolean isInterface() {
      return this.HHIRRHHCOHRORIROOCIOORCHHOCRCC.isInterface();
   }

   @Override
   public String getSuperName() {
      String var1 = this.HHIRRHHCOHRORIROOCIOORCHHOCRCC.getSuperName();
      if (this.IIOIIRHICHRIHIHHIRCCCICRHIOCCH != null) {
         String var2 = CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.IIOIIRHICHRIHIHHIRCCCICRHIOCCH, var1, null);
         if (var2 != null) {
            Optional var3 = this.IIOIIRHICHRIHIHHIRCCCICRHIOCCH.getClassMapping(var2);
            if (var3.isPresent()) {
               return ((ClassMapping)var3.get()).getFullDeobfuscatedName();
            }
         }
      }

      return var1;
   }

   @Override
   public List<String> getInterfaces() {
      ArrayList var1 = new ArrayList();

      for (String var3 : this.HHIRRHHCOHRORIROOCIOORCHHOCRCC.getInterfaces()) {
         if (this.IIOIIRHICHRIHIHHIRCCCICRHIOCCH != null) {
            String var4 = CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.IIOIIRHICHRIHIHHIRCCCICRHIOCCH, var3, null);
            if (var4 != null) {
               Optional var5 = this.IIOIIRHICHRIHIHHIRCCCICRHIOCCH.getClassMapping(var4);
               if (var5.isPresent()) {
                  var3 = ((ClassMapping)var5.get()).getFullDeobfuscatedName();
               }
            }
         }

         var1.add(var3);
      }

      return var1;
   }

   @Override
   public Map<FieldSignature, InheritanceType> getFields() {
      Map var1 = this.HHIRRHHCOHRORIROOCIOORCHHOCRCC.getFields();
      HashMap var2 = new HashMap();

      for (Entry var4 : var1.entrySet()) {
         FieldSignature var5 = (FieldSignature)var4.getKey();
         InheritanceType var6 = (InheritanceType)var4.getValue();
         if (this.RRIHIOIRIIHIIRIORCIHOCICROIHHR != null && this.IIOIIRHICHRIHIHHIRCCCICRHIOCCH != null) {
            Optional var7 = this.RRIHIOIRIIHIIRIORCIHOCICROIHHR.getFieldMapping(var5).map(Mapping::getDeobfuscatedName);
            if (var7.isPresent()) {
               FieldType var8 = var5.getType().orElseThrow();
               FieldType var9 = this.IIOIIRHICHRIHIHHIRCCCICRHIOCCH.deobfuscate(var8);
               var2.putIfAbsent(new FieldSignature((String)var7.get(), var9), var6);
               continue;
            }
         }

         var2.putIfAbsent(var5, var6);
      }

      return var2;
   }

   @Override
   public Map<String, InheritanceType> getFieldsByName() {
      Map var1 = this.HHIRRHHCOHRORIROOCIOORCHHOCRCC.getFieldsByName();
      HashMap var2 = new HashMap();

      for (Entry var4 : var1.entrySet()) {
         String var5 = (String)var4.getKey();
         InheritanceType var6 = (InheritanceType)var4.getValue();
         if (this.RRIHIOIRIIHIIRIORCIHOCICROIHHR != null) {
            Optional var7 = this.RRIHIOIRIIHIIRIORCIHOCICROIHHR.getFieldMapping(var5).map(Mapping::getDeobfuscatedName);
            if (var7.isPresent()) {
               var2.putIfAbsent((String)var7.get(), var6);
               continue;
            }
         }

         var2.putIfAbsent(var5, var6);
      }

      return var2;
   }

   @Override
   public Map<MethodSignature, InheritanceType> getMethods() {
      Map var1 = this.HHIRRHHCOHRORIROOCIOORCHHOCRCC.getMethods();
      HashMap var2 = new HashMap();

      for (Entry var4 : var1.entrySet()) {
         MethodSignature var5 = (MethodSignature)var4.getKey();
         InheritanceType var6 = (InheritanceType)var4.getValue();
         if (this.RRIHIOIRIIHIIRIORCIHOCICROIHHR != null && this.IIOIIRHICHRIHIHHIRCCCICRHIOCCH != null) {
            Optional var7 = this.RRIHIOIRIIHIIRIORCIHOCICROIHHR.getMethodMapping(var5).map(Mapping::getDeobfuscatedName);
            if (var7.isPresent()) {
               MethodDescriptor var8 = this.IIOIIRHICHRIHIHHIRCCCICRHIOCCH.deobfuscate(var5.getDescriptor());
               var2.put(new MethodSignature((String)var7.get(), var8), var6);
               continue;
            }
         }

         var2.put(var5, var6);
      }

      return var2;
   }

   @Override
   public Set<InheritanceProvider.ClassInfo> provideParents(InheritanceProvider var1) {
      LinkedHashSet var2 = new LinkedHashSet();
      this.provideParents(var1, var2);
      LinkedHashSet var3 = new LinkedHashSet();

      for (InheritanceProvider.ClassInfo var5 : var2) {
         var3.add(new HHCCIRHCCCIIRHCROHIORHIRHHIORH(var5, this.IIOIIRHICHRIHIHHIRCCCICRHIOCCH).lazy());
      }

      return var3;
   }

   @Override
   public void provideParents(InheritanceProvider var1, Collection<InheritanceProvider.ClassInfo> var2) {
      String var3 = this.getSuperName();
      if (var3 != null && !var3.isEmpty()) {
         Optional var4 = var1.provide(this.getSuperName());
         if (var4.isPresent()) {
            InheritanceProvider.ClassInfo var5 = (InheritanceProvider.ClassInfo)var4.get();
            var2.add(var5);
            var5.provideParents(var1, var2);
         }
      }

      for (String var9 : this.getInterfaces()) {
         Optional var6 = var1.provide(var9);
         if (var6.isPresent()) {
            InheritanceProvider.ClassInfo var7 = (InheritanceProvider.ClassInfo)var6.get();
            var2.add(var7);
            var7.provideParents(var1, var2);
         }
      }
   }

   @Override
   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      }

      if (!(var1 instanceof InheritanceProvider)) {
         return false;
      }

      InheritanceProvider.ClassInfo var2 = (InheritanceProvider.ClassInfo)var1;
      return Objects.equals(this.getName(), var2.getName());
   }

   @Override
   public final int hashCode() {
      return this.getName().hashCode();
   }

   @Override
   public String toString() {
      return "IchorClassInfo{name='"
         + this.getName()
         + "', interface="
         + this.isInterface()
         + ", superName='"
         + this.getSuperName()
         + "', interfaces="
         + this.getInterfaces()
         + ", fields="
         + this.getFields()
         + ", methods="
         + this.getMethods()
         + "}";
   }
}
