package com.moonsworth.lunar.ichor.util;

import java.util.Optional;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import org.cadixdev.bombe.analysis.InheritanceProvider;

public class HRCHROOHRIHCRCRHRIIROCIRHOIRHH implements InheritanceProvider {
   private final InheritanceProvider CHOOIOORRCOOOHOCHCCHRICROIRIRH;
   private final com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH<String, Optional<InheritanceProvider.ClassInfo>> ORCORRCRCIORRCRCRIICIOIICICHCI = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.OHRCCIIHCHIIRORORRICRHOIOOCHRH()
      .IRCIIHHICIHRCOCRROCOICRIHHCCHH(5L, TimeUnit.MINUTES)
      .IHIHOIOHCOOORRHIICCROCHRCOIHHO();

   public HRCHROOHRIHCRCRHRIIROCIRHOIRHH(InheritanceProvider var1) {
      this.CHOOIOORRCOOOHOCHCCHRICROIRIRH = var1;
   }

   @Override
   public Optional<InheritanceProvider.ClassInfo> provide(String var1) {
      try {
         return this.ORCORRCRCIORRCRCRIICIOIICICHCI.get(var1, () -> this.CHOOIOORRCOOOHOCHCCHRICROIRIRH.provide(var1));
      } catch (ExecutionException var3) {
         throw new RuntimeException(var3);
      }
   }

   @Override
   public Optional<InheritanceProvider.ClassInfo> provide(String var1, Object var2) {
      try {
         return this.ORCORRCRCIORRCRCRIICIOIICICHCI.get(var1, () -> this.CHOOIOORRCOOOHOCHCCHRICROIRIRH.provide(var1, var2));
      } catch (ExecutionException var4) {
         throw new RuntimeException(var4);
      }
   }
}
