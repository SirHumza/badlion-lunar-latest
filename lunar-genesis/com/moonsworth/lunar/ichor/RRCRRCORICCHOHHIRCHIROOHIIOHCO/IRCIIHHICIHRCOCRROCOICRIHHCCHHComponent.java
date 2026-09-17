package com.moonsworth.lunar.ichor.RRCRRCORICCHOHHIRCHIROOHIIOHCO;

import java.util.Optional;
import org.cadixdev.lorenz.MappingSet;
import org.cadixdev.lorenz.model.ClassMapping;

public class HRCHROOHRIHCRCRHRIIROCIRHOIRHH implements IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   private final MappingSet RHIRROHICCHRHIRCCHIRICCHICIIOR;

   public HRCHROOHRIHCRCRHRIIROCIRHOIRHH(MappingSet var1) {
      this.RHIRROHICCHRHIRCCHIRICCHICIIOR = var1;
   }

   @Override
   public String remap(String var1) {
      if (var1 != null && !var1.isEmpty()) {
         Optional var2 = this.RHIRROHICCHRHIRCCHIRICCHICIIOR.computeClassMapping(var1);
         if (var2.isPresent()) {
            var1 = ((ClassMapping)var2.get()).getFullDeobfuscatedName();
         }

         return var1;
      } else {
         return var1;
      }
   }

   @Override
   public String unmap(String var1) {
      return var1 != null && !var1.isEmpty() ? CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.RHIRROHICCHRHIRCCHIRICCHICIIOR, var1) : var1;
   }
}
