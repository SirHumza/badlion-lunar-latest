package com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;
import com.moonsworth.lunar.ichor.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CORCOCICIRIOHROHROIIOOHICCHCRR;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;
import lombok.Generated;
import org.cadixdev.bombe.provider.ClassProvider;
import org.cadixdev.lorenz.MappingSet;
import org.cadixdev.lorenz.model.Mapping;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.MethodNode;

public class HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   private static final String HOCOCCIICIOICHIOCHORCORCHIHRRR = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class.descriptorString();
   private final Map<String, com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> RCOOHIIRCICOCRRRCCCIROCRRORIIC = new HashMap<>();
   private boolean initialized = false;
   private final String HRROROIRHIRHCOCHCIIOHRCRICOOOH;
   @Nullable
   private final MappingSet HRHOORCROIRCCCIHRHHRHHIRCOCOHR;

   public HHCCIRHCCCIIRHCROHIORHIRHHIORH(String var1) {
      this(var1, null);
   }

   public HHCCIRHCCCIIRHCROHIORHIRHHIORH(String var1, @Nullable MappingSet var2) {
      this.HRROROIRHIRHCOCHCIIOHRCRICOOOH = var1;
      this.HRHOORCROIRCCCIHRHHRHHIRCOCOHR = var2;
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ClassProvider var1) {
      if (!this.initialized) {
         this.initialized = true;
         JsonElement var2 = JsonParser.parseString(this.HRROROIRHIRHCOCHCIIOHRCRICOOOH);
         if (var2.isJsonObject()) {
            JsonObject var3 = var2.getAsJsonObject();
            if (var3.has("bridges")) {
               for (JsonElement var6 : var3.getAsJsonArray("bridges")) {
                  String var7 = var6.getAsString();
                  ClassNode var8 = var1.getAsNode(var7, 7);
                  com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var9 = this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
                     var8
                  );
                  if (var9 != null) {
                     this.RCOOHIIRCICOCRRRCCCIROCRRORIIC.put(var7, var9);
                  }
               }
            }
         }
      }
   }

   @Nullable
   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
      ClassNode var1
   ) {
      if ((var1.access & 512) != 0 && var1.visibleAnnotations != null) {
         AnnotationNode var2 = null;

         for (AnnotationNode var4 : var1.visibleAnnotations) {
            if (var4.desc.equals(HOCOCCIICIOICHIOCHORCORCHIHRRR)) {
               var2 = var4;
               break;
            }
         }

         if (var2 == null) {
            return null;
         }

         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.CRRRICCRROCOHHOHIICIHORCOORRRH.CRRRICCRROCOHHOHIICIHORCOORRRH var10 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.CRRRICCRROCOHHOHIICIHORCOORRRH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var2
         );
         ArrayList var11 = new ArrayList();

         for (MethodNode var6 : var1.methods) {
            AnnotationNode var7 = null;
            if (var6.visibleAnnotations != null) {
               for (AnnotationNode var9 : var6.visibleAnnotations) {
                  if (var9.desc.equals(HOCOCCIICIOICHIOCHORCORCHIHRRR)) {
                     var7 = var9;
                     break;
                  }
               }
            }

            if (var7 != null) {
               com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.CRRRICCRROCOHHOHIICIHORCOORRRH.CRRRICCRROCOHHOHIICIHORCOORRRH var12 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.CRRRICCRROCOHHOHIICIHORCOORRRH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  var7, var6
               );
               var11.add(
                  new com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                     var12, var6
                  )
               );
            }
         }

         return new com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var1.name,
            var10,
            var11.toArray(
               new com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH[0]
            )
         );
      } else {
         return null;
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      ClassNode var1, com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2, ClassProvider var3
   ) {
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3);
      String var4 = this.HRHOORCROIRCCCIHRHHRHHIRCOCOHR == null
         ? var1.name
         : CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.HRHOORCROIRCCCIHRHHRHHIRCOCOHR, var1.name);
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var4, var2).ifPresent(var4x -> var4x.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this, var1, var2, var3));
   }

   public Optional<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      String var1, com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2
   ) {
      return Optional.ofNullable(this.RCOOHIIRCICOCRRRCCCIROCRRORIIC.get(var1))
         .or(() -> this.RCOOHIIRCICOCRRRCCCIROCRRORIIC.values().stream().filter(var2xx -> var1.equals(var2xx.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2))).findFirst());
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1) {
      if (var1.getParams() != null) {
         for (OOROOCCIRCCRHOIOIORIHCHHOOCCOR var3 : var1.getParams()) {
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3);
         }
      }

      if (var1.IICRHRIOIROIOHRICHHHHHIHIOOICI() instanceof com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH var4) {
         String var6 = var4.name();
         if (this.HRHOORCROIRCCCIHRHHRHHIRCOCOHR != null) {
            var6 = this.HRHOORCROIRCCCIHRHHRHHIRCOCOHR
               .getClassMapping(CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.HRHOORCROIRCCCIHRHHRHHIRCOCOHR, var6))
               .<String>map(Mapping::getDeobfuscatedName)
               .orElse(var6);
         }

         var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(new com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var6));
      }
   }

   @Nullable
   @Generated
   public MappingSet getMappings() {
      return this.HRHOORCROIRCCCIHRHHRHHIRCOCOHR;
   }
}
