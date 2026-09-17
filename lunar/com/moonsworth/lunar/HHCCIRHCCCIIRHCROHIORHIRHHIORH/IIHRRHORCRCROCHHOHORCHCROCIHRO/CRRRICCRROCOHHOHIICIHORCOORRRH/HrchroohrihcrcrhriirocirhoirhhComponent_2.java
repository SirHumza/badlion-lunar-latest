package com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;
import com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;
import com.moonsworth.lunar.ichor.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CORCOCICIRIOHROHROIIOOHICCHCRR;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import org.cadixdev.lorenz.MappingSet;
import org.cadixdev.lorenz.model.ClassMapping;
import org.cadixdev.lorenz.model.FieldMapping;
import org.cadixdev.lorenz.model.MethodMapping;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldNode;
import org.objectweb.asm.tree.MethodNode;

public record RRCRRCORICCHOHHIRCHIROOHIIOHCO() {
   private final String[] ICIIOHIRRHRORROIIHCIRCIIOIHCHR;

   public RRCRRCORICCHOHHIRCHIROOHIIOHCO(String[] var1) {
      this.ICIIOHIRRHRORROIIHCIRCIIOIHCHR = var1;
   }

   public List<IRCIIHHICIHRCOCRROCOICRIHHCCHH> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1, ClassNode var2
   ) {
      ArrayList var3 = new ArrayList();
      ClassNode var4 = var2;
      OOROOCCIRCCRHOIOIORIHCHHOOCCOR var5 = new OOROOCCIRCCRHOIOIORIHCHHOOCCOR(
         new com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var2.name)
      );
      MappingSet var6 = var1.HCICORHROROHIIOOCOORORCCOHRIIO().getMappings();
      ClassMapping var7 = var6 == null ? null : var6.getOrCreateClassMapping(CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var6, var2.name));

      for (String var11 : this.ICIIOHIRRHRORROIIHCIRCIIOIHCHR) {
         if (var4 == null) {
            throw new IllegalStateException(
               var2.name + " " + String.join(",", this.ICIIOHIRRHRORROIIHCIRCIIOIHCHR) + ": tried to find " + var11 + " in null class node"
            );
         }

         IRCIIHHICIHRCOCRROCOICRIHHCCHH var12 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4, var5, var11, var7);
         if (var12 == null) {
            throw new IllegalStateException(
               var2.name
                  + " "
                  + String.join(",", this.ICIIOHIRRHRORROIIHCIRCIIOIHCHR)
                  + ": uh what where the memberNode at??? looking for: "
                  + var11
                  + " in "
                  + var4.name
            );
         }

         var3.add(var12);
         if (var12.ORHOOHRCIHIORCCRCOOOOCIROHRHCO().IICRHRIOIROIOHRICHHHHHIHIOOICI() instanceof com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH var13
            )
          {
            var4 = var1.CCRIIICIIIIIIHHROHCROIRCCOHCOI().getAsNode(var13.name(), 5);
            var5 = var12.ORHOOHRCIHIORCCRCOOOOCIROHRHCO();
            if (var6 != null) {
               var7 = var6.getOrCreateClassMapping(CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var6, var4.name));
            }
         } else {
            var4 = null;
         }
      }

      return var3;
   }

   @Nullable
   private IRCIIHHICIHRCOCRROCOICRIHHCCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      ClassNode var1, OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2, String var3, @Nullable ClassMapping<?, ?> var4
   ) {
      FieldNode var5 = null;
      if (var3.indexOf(40) == -1) {
         String var6 = var3;
         if (var4 != null) {
            for (FieldMapping var8 : var4.getFieldMappings()) {
               if (var8.getObfuscatedName().equals(var3)) {
                  var6 = var8.getDeobfuscatedName();
                  break;
               }
            }
         }

         for (FieldNode var21 : var1.fields) {
            if (var21.name.equals(var6)) {
               var5 = var21;
               break;
            }
         }
      }

      if (var5 != null) {
         return new IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            var1, var2, var5, null, null, com.moonsworth.lunar.ichor.util.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IHIRRIIORRHORHRORIHOROIRCORCOO(var1)
         );
      }

      if (var4 != null) {
         if (var3.indexOf(40) != -1) {
            for (MethodMapping var18 : var4.getMethodMappings()) {
               if (var18.getSignature().toJvmsIdentifier().equals(var3)) {
                  var3 = var18.getDeobfuscatedSignature().toJvmsIdentifier();
                  break;
               }
            }
         } else {
            for (MethodMapping var19 : var4.getMethodMappings()) {
               if (var19.getObfuscatedName().equals(var3)) {
                  var3 = var19.getDeobfuscatedName();
                  break;
               }
            }
         }
      }

      com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var16 = null;
      boolean var20 = var3.indexOf(40) != -1;
      String var22 = var20 ? var3.substring(0, var3.indexOf(40)) : var3;
      if (var20) {
         try {
            var16 = HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3.substring(var3.indexOf(40)), var1.signature, var2);
         } catch (Exception var13) {
         }
      }

      MethodNode var9 = null;
      if (var16 != null) {
         for (MethodNode var11 : var1.methods) {
            com.moonsworth.lunar.ichor.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var12 = HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               Objects.requireNonNullElse(var11.signature, var11.desc), var1.signature, var2
            );
            if (var11.name.equals(var22) && var12.equals(var16)) {
               var9 = var11;
               break;
            }
         }
      } else {
         for (MethodNode var24 : var1.methods) {
            if (var24.name.equals(var3)) {
               if (var9 != null) {
                  throw new IllegalStateException(
                     "Ambiguous method reference '%s' in %s! Both %s and %s match".formatted(var3, var1.name, var9.desc, var24.desc)
                  );
               }

               var9 = var24;
               var16 = HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  Objects.requireNonNullElse(var24.signature, var24.desc), var1.signature, var2
               );
            }
         }
      }

      return var9 != null
         ? new IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            var1, var2, null, var9, var16, com.moonsworth.lunar.ichor.util.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IHIRRIIORRHORHRORIHOROIRCORCOO(var1)
         )
         : null;
   }

   public String[] OOHHRICCIOICOORRRROOCCHRCHOICR() {
      return this.ICIIOHIRRHRORROIIHCIRCIIOIHCHR;
   }
}
