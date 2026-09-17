package com.moonsworth.lunar.ichor.RRCRRCORICCHOHHIRCHIROOHIIOHCO;

import java.util.Optional;
import org.cadixdev.bombe.analysis.InheritanceProvider;
import org.cadixdev.lorenz.MappingSet;
import org.cadixdev.lorenz.model.ClassMapping;

public class HICHRCOHCCRHOHCICOOCHOIHCCHIRI implements InheritanceProvider {
   private final InheritanceProvider RIORHCOIOROHICCOOOICOIORRCCCIO;
   private final MappingSet CCCRRROHRHOOOHHHCRICIHOOCHOROI;

   public HICHRCOHCCRHOHCICOOCHOIHCCHIRI(
      InheritanceProvider var1,
      MappingSet var2,
      com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3
   ) {
      this.RIORHCOIOROHICCOOOICOIORRCCCIO = var1;
      this.CCCRRROHRHOOOHHHCRICIHOOCHOROI = var2;
   }

   @Override
   public Optional<InheritanceProvider.ClassInfo> provide(String var1) {
      InheritanceProvider.ClassInfo var2 = this.RIORHCOIOROHICCOOOICOIORRCCCIO.provide(var1).orElse(null);
      if (var2 == null) {
         Optional var3 = this.CCCRRROHRHOOOHHHCRICIHOOCHOROI.getClassMapping(var1);
         if (var3.isPresent()) {
            ClassMapping var4 = (ClassMapping)var3.get();
            Optional var5 = this.RIORHCOIOROHICCOOOICOIORRCCCIO.provide(var4.getFullDeobfuscatedName());
            if (var5.isPresent()) {
               var2 = (InheritanceProvider.ClassInfo)var5.get();
            }
         }
      }

      return var2 == null ? Optional.empty() : Optional.ofNullable(new HHCCIRHCCCIIRHCROHIORHIRHHIORH(var2, this.CCCRRROHRHOOOHHHCRICIHOOCHOROI).lazy());
   }
}
