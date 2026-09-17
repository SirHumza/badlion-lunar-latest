package com.moonsworth.lunar.client.IRRCCOICORICIHCHRHIHIHROIRHOCR;

import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CORCOCICIRIOHROHROIIOOHICCHCRR;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.OHHRIOHROOIHOROCIRHCHORIHRRRRI;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;

public abstract class CRRRICCRROCOHHOHIICIHORCOORRRH implements IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   private static final Map<Class<?>, CRRRICCRROCOHHOHIICIHORCOORRRH> CIOCIRRRROCHICRRIOIICOHCOCCIHC = new HashMap<>();
   private final com.moonsworth.lunar.client.IRRCCOICORICIHCHRHIHIHROIRHOCR.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH IRHOHROCIHHOHHOCIOIRHICOIOICHH = new com.moonsworth.lunar.client.IRRCCOICORICIHCHRHIHIHROIRHOCR.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH();
   private final Set<IRCIIHHICIHRCOCRROCOICRIHHCCHH> HOIRIHRIOCIOHIRCRIOIIRCHOHRHOH = new HashSet<>();
   private int RROORRCIIRCRCRROOCRHIRIIIIOROH = 0;
   private boolean enabled = false;
   private Runnable HCICIIOCCIOIIHCRRCOCROCOOCORIO;
   private boolean OHIICHRICIIOCOICHHHCHOIICRRRCR;

   private void COHHOHOOHRRRRRRRROHIHCCRCCICII() {
      this.IRHOHROCIHHOHHOCIOIRHICOIOICHH.IOOCRRRIHHHRHROIIHOOIHROHRRIRI();
      this.HOIRIHRIOCIOHIRCRIOIIRCHOHRHOH.forEach(IRCIIHHICIHRCOCRROCOICRIHHCCHH::RCHOIICOHORCIHHIIOOHHCCOIIIOHC);
      this.enabled = true;
      this.onEnable();
   }

   private void HOROHHRCHRCRROIRIHOOHCRHRHIHCC() {
      this.onDisable();
      this.enabled = false;
      this.HOIRIHRIOCIOHIRCRIOIIRCHOHRHOH.forEach(IRCIIHHICIHRCOCRROCOICRIHHCCHH::HOCCOCRCOHORCHOHCHIROIHCOHOIRR);
      this.IRHOHROCIHHOHHOCIOIRHICOIOICHH.RHOCICCROICIHRRIIHRRIORRHOHIHC();
   }

   private void init() {
      this.OHIICHRICIIOCOICHHHCHOIICRRRCR = true;
      Runnable var1 = () -> this.HCICIIOCCIOIIHCRRCOCROCOOCORIO.run();
      RRCRRCORICCHOHHIRCHIROOHIIOHCO var2 = RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHIHIIHCCCCCIHRORIOIOORCIOHII(var1);
      this.HCICIIOCCIOIIHCRRCOCROCOOCORIO = () -> {
         boolean var2x = var2.RIIHIHHCRHCHRCICHOROHCHIIHCICH(() -> this.RROORRCIIRCRCRROOCRHIRIIIIOROH != 0 && this.isEnabled());
         if (var2x != this.enabled) {
            if (var2x) {
               this.COHHOHOOHRRRRRRRROHIHCCRCCICII();
            } else {
               this.HOROHHRCHRCRROIRIHOOHCRHRHIHCC();
            }
         }
      };
      this.HCICIIOCCIOIIHCRRCOCROCOOCORIO.run();
   }

   protected <T extends CRRRICCRROCOHHOHIICIHORCOORRRH> T IIRHCHHOICHRICOOCRORCCIOOIHOIR(Class<T> var1) {
      if (this.OHIICHRICIIOCOICHHHCHOIICRRRCR) {
         throw new IllegalStateException(
            "DynamicListener#addDependency() must be called before the listener is initialized! (Do it in the constructor or field initialization)"
         );
      }

      CRRRICCRROCOHHOHIICIHORCOORRRH var2 = IOIICIRIICICIIOORHCIIIIRRIHRHI(var1);
      this.HOIRIHRIOCIOHIRCRIOIIRCHOHRHOH.add(var2);
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         this, var2
      );
      return (T)var2;
   }

   protected static <T extends CRRRICCRROCOHHOHIICIHORCOORRRH> T IHIRRIIORRHORHRORIHOROIRCORCOO(Class<T> var0) {
      CRRRICCRROCOHHOHIICIHORCOORRRH var1 = IOIICIRIICICIIOORHCIIIIRRIHRHI(var0);
      var1.RCHOIICOHORCIHHIIOOHHCCOIIIOHC();
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         "GLOBAL DEP", var1
      );
      return (T)var1;
   }

   @Override
   public void RCHOIICOHORCIHHIIOOHHCCOIIIOHC() {
      int var1 = ++this.RROORRCIIRCRCRROOCRHIRIIIIOROH;
      if (var1 == 1 && this.HCICIIOCCIOIIHCRRCOCROCOOCORIO != null) {
         this.HCICIIOCCIOIIHCRRCOCROCOOCORIO.run();
      }
   }

   @Override
   public void HOCCOCRCOHORCHOHCHIROIHCOHOIRR() {
      int var1 = --this.RROORRCIIRCRCRROOCRHIRIIIIOROH;
      if (var1 == 0 && this.HCICIIOCCIOIIHCRRCOCROCOOCORIO != null) {
         this.HCICIIOCCIOIIHCRRCOCROCOOCORIO.run();
      }
   }

   public static <T extends CRRRICCRROCOHHOHIICIHORCOORRRH> T IOIICIRIICICIIOORHCIIIIRRIHRHI(Class<T> var0) {
      CRRRICCRROCOHHOHIICIHORCOORRRH var1 = CIOCIRRRROCHICRRIOIICOHCOCCIHC.get(var0);
      if (var1 == null) {
         HHRIICOIOORCHCOIICOOIHIRHHICRI(var0);
         CRRRICCRROCOHHOHIICIHORCOORRRH var2 = CIOCIRRRROCHICRRIOIICOHCOCCIHC.get(var0);
         if (var2 != null) {
            var1 = var2;
         } else {
            var1 = RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO(var0);
            CRRRICCRROCOHHOHIICIHORCOORRRH var3 = CIOCIRRRROCHICRRIOIICOHCOCCIHC.get(var0);
            if (var3 != null) {
               var1 = var3;
            } else {
               CIOCIRRRROCHICRRIOIICOHCOCCIHC.put(var0, var1);
            }
         }
      }

      return (T)var1;
   }

   private static void HHRIICOIOORCHCOIICOOIHIRHHICRI(Class<?> var0) {
      try {
         Class.forName(var0.getName(), true, var0.getClassLoader());
      } catch (ClassNotFoundException var2) {
         throw new AssertionError(var2);
      }
   }

   public static <T extends CRRRICCRROCOHHOHIICIHORCOORRRH> Optional<T> ORHIOICIOCRRHOOCOHRORIHICHRCRR(Class<T> var0) {
      CRRRICCRROCOHHOHIICIHORCOORRRH var1 = CIOCIRRRROCHICRRIOIICOHCOCCIHC.get(var0);
      return var1 != null && var1.IRRRRCCCHRIRCRRRCHIOORHHRHICRH() ? Optional.of((T)var1) : Optional.empty();
   }

   private static synchronized CRRRICCRROCOHHOHIICIHORCOORRRH RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO(Class<? extends CRRRICCRROCOHHOHIICIHORCOORRRH> var0) {
      try {
         Constructor var1 = var0.getDeclaredConstructor();
         boolean var2 = Modifier.isPublic(var1.getModifiers());
         if (!var2) {
            var1.setAccessible(true);
         }

         CRRRICCRROCOHHOHIICIHORCOORRRH var3 = (CRRRICCRROCOHHOHIICIHORCOORRRH)var1.newInstance();
         if (!var2) {
            var1.setAccessible(false);
         }

         var3.init();
         return var3;
      } catch (InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException var4) {
         throw new RuntimeException(var4);
      }
   }

   @com.moonsworth.lunar.client.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
      RHCCIRHOHROOOIOHHIIHOCHRCOHOCO = com.moonsworth.lunar.client.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.DYNAMICLISTENER_ISENABLED
   )
   protected boolean isEnabled() {
      return true;
   }

   protected void onEnable() {
   }

   protected void onDisable() {
   }

   protected <T extends com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH> void handle(Class<T> var1, Consumer<T> var2) {
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2, 100);
   }

   protected <T extends com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH> void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      Class<T> var1, Consumer<T> var2, int var3
   ) {
      this.IRHOHROCIHHOHHOCIOIRHICOIOICHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var3, var1);
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IRCIIHHICIHRCOCRROCOICRIHHCCHH var1) {
      this.HOIRIHRIOCIOHIRCRIOIIRCHOHRHOH.add(var1);
   }

   public boolean IRRRRCCCHRIRCRRRCHIOORHHRHICRH() {
      return this.enabled;
   }

   public static List<String> IICHOIOOHRCOOHORIOORROIRRRHOHI() {
      ArrayList var0 = new ArrayList();

      for (CRRRICCRROCOHHOHIICIHORCOORRRH var2 : CIOCIRRRROCHICRRIOIICOHCOCCIHC.values()
         .stream()
         .sorted(Comparator.comparing(var0x -> var0x.getClass().getName()))
         .toList()) {
         boolean var3 = var2.IRRRRCCCHRIRCRRRCHIOORHHRHICRH();
         StringBuilder var4 = new StringBuilder();
         var4.append(var2.getClass().getName())
            .append(": ")
            .append(var3 ? "ENABLED" : "DISABLED")
            .append(" (")
            .append(var2.RROORRCIIRCRCRROOCRHIRIIIIOROH)
            .append(" deps)");
         var0.add(var4.toString());

         for (String var6 : com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var2, true
         )) {
            var0.add("  - " + var6);
         }
      }

      return var0;
   }

   public static List<com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH> IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      OHHRIOHROOIHOROCIRHCHORIHRRRRI var0, OHHRIOHROOIHOROCIRHCHORIHRRRRI var1
   ) {
      ArrayList var2 = new ArrayList();

      for (CRRRICCRROCOHHOHIICIHORCOORRRH var4 : CIOCIRRRROCHICRRIOIICOHCOCCIHC.values()
         .stream()
         .sorted(Comparator.comparing(var0x -> var0x.getClass().getSimpleName()))
         .toList()) {
         boolean var5 = var4.IRRRRCCCHRIRCRRRCHIOORHHRHICRH();
         var2.add(
            new com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
                  new com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI()
                     .HHCCIRHCCCIIRHCROHIORHIRHHIORH(new CORCOCICIRIOHROHROIIOOHICCHCRR(var4.getClass().getSimpleName()))
                     .HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                        new CORCOCICIRIOHROHROIIOOHICCHCRR(": ")
                           .IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                              com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.GRAY
                           )
                     )
                     .HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                        new CORCOCICIRIOHROHROIIOOHICCHCRR(var5 ? "ENABLED" : "DISABLED").IRCIIHHICIHRCOCRROCOICRIHHCCHH(var5 ? var0 : var1)
                     )
                     .HHCCIRHCCCIIRHCROHIORHIRHHIORH(new CORCOCICIRIOHROHROIIOOHICCHCRR(" ("))
                     .HHCCIRHCCCIIRHCROHIORHIRHHIORH(new CORCOCICIRIOHROHROIIOOHICCHCRR(String.valueOf(var4.RROORRCIIRCRCRROOCRHIRIIIIOROH)))
                     .HHCCIRHCCCIIRHCROHIORHIRHHIORH(new CORCOCICIRIOHROHROIIOOHICCHCRR(" deps)"))
               )
               .ROOCOCCCIRHHHIRIOIHHHHRHIICHHR(
                  com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                     var4
                  )
               )
         );
      }

      return var2;
   }
}
