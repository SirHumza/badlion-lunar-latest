package com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.IIRHCHHOICHRICOOCRORCCIOOIHOIR;
import it.unimi.dsi.fastutil.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import lombok.Generated;
import org.jetbrains.annotations.Nullable;

public class HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   private static final boolean CIICORRHCCIRIIHHCRCIROIOHCHHRI = !com.moonsworth.lunar.client.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHRRICCIOIHROCCOIIORROIROCIIOR;
   private static final boolean CRIHCRICCHIOIROCOORRHRRHHCHHOO = !IICCOOCHCHROORHHIIHROHCCRHRCOR.RHRRIHCHRHCCROOHIHROIHHOROCHRH
      && (
         !com.moonsworth.lunar.client.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHRRICCIOIHROCCOIIORROIROCIIOR
            || IIRHCHHOICHRICOOCRORCCIOOIHOIR.RCHOCOOROOICCIROHRIHCIICIHIHCH
               && com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.THROW_ON_WRONG_THREAD_BETA
                  .isEnabled()
            || IIRHCHHOICHRICOOCRORCCIOOIHOIR.OCIOHCIOHIOOICOHRRHCIRRRRIHCCR
               && com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.THROW_ON_WRONG_THREAD_DEV
                  .isEnabled()
      );
   private static final boolean IHICHIIOCRICOOROCOHIOORRIIRIII = com.moonsworth.lunar.client.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHRRICCIOIHROCCOIIORROIROCIIOR
      && (
         !IIRHCHHOICHRICOOCRORCCIOOIHOIR.RCHOCOOROOICCIROHRIHCIICIHIHCH
            || com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IGNORE_EXTERNAL_THREAD_BETA
               .isEnabled()
      );
   private static final HHCCIRHCCCIIRHCROHIORHIRHHIORH RHHHORCOOHOCRHIHRRCOOCCHICOCHH = CIICORRHCCIRIIHHCRCIROIOHCHHRI
      ? new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH()
      : new HHCCIRHCCCIIRHCROHIORHIRHHIORH();
   private final ReentrantLock CIHCIHCORCICOHIRICHRRIORROOICH = new ReentrantLock();
   protected final List<HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<?>> HCOHRORHHOHRROHROCCOCROROHRHHR = new ArrayList<>();
   protected final AtomicInteger CIOIHHIORRORCCHHRICCHHICICHHRO = new AtomicInteger();
   protected final HashMap<Class<? extends com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH>, RRCRRCORICCHOHHIRCHIROOHIIOHCO<? extends com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH>[]> ORICOOIHHOIOIHOOHHOHHHIIHCHRII = new HashMap<>();
   public static final int HHICIRIIRHRORHICRRHROCCHRHCRIH = 100;

   public <T extends com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH> void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      Class<T> var1, Runnable var2
   ) {
      this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1, var1x -> var2.run());
   }

   public <T extends com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH> void HHCCIRHCCCIIRHCROHIORHIRHHIORH(
      Class<T> var1, Consumer<T> var2
   ) {
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, var2, 100);
   }

   public <T extends com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH> void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      Class<T> var1, Runnable var2, int var3
   ) {
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, var1x -> var2.run(), var3);
   }

   public <T extends com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH> void IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      Class<T> var1, Consumer<T> var2, int var3
   ) {
      if (this.CIHCIHCORCICOHIRICHRRIORROOICH.isHeldByCurrentThread()) {
         this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1, var2, var3);
      } else {
         this.CIHCIHCORCICOHIRICHRRIORROOICH.lock();

         try {
            this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1, var2, var3);
         } finally {
            this.CIHCIHCORCICOHIRICHRRIORROOICH.unlock();
         }
      }
   }

   private <T extends com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH> void HHCCIRHCCCIIRHCROHIORHIRHHIORH(
      Class<T> var1, Consumer<T> var2, int var3
   ) {
      if (this.CIOIHHIORRORCCHHRICCHHICICHHRO.get() != 0) {
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(new HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(true, var1, var2, var3));
      } else {
         Object[] var4 = this.ORICOOIHHOIOIHOOHHOHHHIIHCHRII.get(var1);
         if (var4 == null || var4.length == 0) {
            this.HICHRCOHCCRHOHCICOOCHOIHCCHIRI(var1);
         }

         this.ORICOOIHHOIOIHOOHHOHHHIIHCHRII.compute(var1, (var2x, var3x) -> {
            RRCRRCORICCHOHHIRCHIROOHIIOHCO[] var4x = new RRCRRCORICCHOHHIRCHIROOHIIOHCO[(var3x == null ? 0 : var3x.length) + 1];
            var4x[var3x == null ? 0 : var3x.length] = new RRCRRCORICCHOHHIRCHIROOHIIOHCO(var3, var2);
            if (var4x.length > 1) {
               System.arraycopy(var3x, 0, var4x, 0, var3x.length);
               Arrays.sort(var4x, Comparator.comparingInt(var0x -> -var0x.priority()));
            }

            return var4x;
         });
      }
   }

   public <T extends com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH> void CRRRICCRROCOHHOHIICIHORCOORRRH(
      Class<T> var1, Consumer<T> var2
   ) {
      if (this.CIHCIHCORCICOHIRICHRRIORROOICH.isHeldByCurrentThread()) {
         this.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var1, var2);
      } else {
         this.CIHCIHCORCICOHIRICHRRIORROOICH.lock();

         try {
            this.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var1, var2);
         } finally {
            this.CIHCIHCORCICOHIRICHRRIORROOICH.unlock();
         }
      }
   }

   private <T extends com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH> void RRCRRCORICCHOHHIRCHIROOHIIOHCO(
      Class<T> var1, Consumer<T> var2
   ) {
      if (this.CIOIHHIORRORCCHHRICCHHICICHHRO.get() != 0) {
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(new HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(false, var1, var2, 0));
      } else {
         Object var3 = this.ORICOOIHHOIOIHOOHHOHHHIIHCHRII.computeIfPresent(var1, (var1x, var2x) -> {
            ArrayList var3x = new ArrayList();

            for (RRCRRCORICCHOHHIRCHIROOHIIOHCO var7 : var2x) {
               if (var7.COIOHCOCOHIRRRRRCCIHRRCICOCOII() != var2) {
                  var3x.add(var7);
               }
            }

            return var3x.isEmpty() ? null : var3x.toArray(new RRCRRCORICCHOHHIRCHIROOHIIOHCO[0]);
         });
         if (var3 == null) {
            this.IIHRRHORCRCROCHHOHORCHCROCIHRO(var1);
         }
      }
   }

   protected <T extends com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH> void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      Class<T> var1, @Nullable T var2, @Nullable Supplier<T> var3
   ) {
      if ((var2 != null || var3 != null) && !this.HCOHRORHHOHRROHROCCOCROROHRHHR.isEmpty()) {
         boolean var4 = false;
         int var6 = 0;

         int var5;
         do {
            var5 = this.HCOHRORHHOHRROHROCCOCROROHRHHR.size();

            for (int var7 = var6; var7 < var5; var7++) {
               HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var8 = this.HCOHRORHHOHRROHROCCOCROROHRHHR.get(var7);
               if (var8.IRHCHROHHCCOORICICRRCRHOHIHHCH && var8.HIHOOCIIOHHRICCHHCROOIIOORRRRR == var1) {
                  try {
                     if (var2 == null) {
                        var2 = (com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH)var3.get();
                        if (var2 == null) {
                           return;
                        }

                        this.CORCOCICIRIOHROHROIIOOHICCHCRR(var1);
                        var4 = true;
                     }

                     var8.IIOOCICIHRCHRRCHHOCCOIRCOHRICI.accept((T)var2);
                  } catch (Exception | Error var10) {
                     this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var10, var1);
                  }
               }
            }

            var6 = this.HCOHRORHHOHRROHROCCOCROROHRHHR.size();
         } while (var5 != var6);

         if (var4) {
            this.IIOIIRHIHIHROIHHOROOHCHCOOCRIC();
         }
      }
   }

   private void HICHRCOHCCRHOHCICOOCHOIHCCHIRI(Class<? extends com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH> var1) {
      this.OCOHORHCROHICRRIHCIHHRRCIHICRI(var1)
         .ifPresent(com.moonsworth.lunar.client.IRRCCOICORICIHCHRHIHIHROIRHOCR.CRRRICCRROCOHHOHIICIHORCOORRRH::RCHOIICOHORCIHHIIOOHHCCOIIIOHC);
   }

   private void IIHRRHORCRCROCHHOHORCHCROCIHRO(Class<? extends com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH> var1) {
      this.OCOHORHCROHICRRIHCIHHRRCIHICRI(var1)
         .ifPresent(com.moonsworth.lunar.client.IRRCCOICORICIHCHRHIHIHROIRHOCR.CRRRICCRROCOHHOHIICIHORCOORRRH::HOCCOCRCOHORCHOHCHIROIHCOHOIRR);
   }

   private Optional<com.moonsworth.lunar.client.IRRCCOICORICIHCHRHIHIHROIRHOCR.CRRRICCRROCOHHOHIICIHORCOORRRH> OCOHORHCROHICRRIHCIHHRRCIHICRI(
      Class<? extends com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH> var1
   ) {
      com.moonsworth.lunar.client.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH var2 = var1.getAnnotation(
         com.moonsworth.lunar.client.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.class
      );
      if (!com.moonsworth.lunar.client.IRRCCOICORICIHCHRHIHIHROIRHOCR.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class
         .isAssignableFrom(var1)) {
         if (var2 != null) {
            throw new RuntimeException("Event " + var1.getName() + " has a @TriggeredBy annotation, but does not extend DynamicListenerEvent");
         } else {
            return Optional.empty();
         }
      } else if (var2 == null) {
         throw new RuntimeException("DynamicListenerEvent must be annotated with @TriggeredBy, " + var1.getName());
      } else {
         return Optional.of(
            com.moonsworth.lunar.client.IRRCCOICORICIHCHRHIHIHROIRHOCR.CRRRICCRROCOHHOHIICIHORCOORRRH.IOIICIRIICICIIOORHCIIIIRRIHRHI(var2.value())
         );
      }
   }

   @Nullable
   public <T extends com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH> T RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      Class<T> var1, Supplier<T> var2
   ) {
      this.CIOHHCORHRCCRICCCORIHCRHCCCRRR(var1);
      if (this.CIHCIHCORCICOHIRICHRRIORROOICH.isHeldByCurrentThread()) {
         return this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, var2);
      }

      this.CIHCIHCORCICOHIRICHRRIORROOICH.lock();

      try {
         return this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, var2);
      } finally {
         this.CIHCIHCORCICOHIRICHRRIORROOICH.unlock();
      }
   }

   @Nullable
   private <T extends com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH> T IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      Class<T> var1, Supplier<T> var2
   ) {
      RRCRRCORICCHOHHIRCHIROOHIIOHCO[] var3 = this.ORICOOIHHOIOIHOOHHOHHHIIHCHRII.get(var1);
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4 = null;
      if (var3 != null) {
         var4 = (com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH)var2.get();
         if (var4 == null) {
            return null;
         }

         this.CORCOCICIRIOHROHROIIOOHICCHCRR(var1);

         try {
            for (RRCRRCORICCHOHHIRCHIROOHIIOHCO var8 : var3) {
               try {
                  Consumer var9 = var8.COIOHCOCOHIRRRRRCCIHRRCICOCOII();
                  var9.accept(var4);
               } catch (Throwable var10) {
                  this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var10);
               }
            }
         } catch (Exception | Error var11) {
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var11, var1);
         }
      }

      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var4, var2);
      if (var3 != null) {
         this.IIOIIRHIHIHROIHHOROOHCHCOOCRIC();
      }

      return (T)var4;
   }

   public <T extends com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH> void RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
      Class<T> var1, Consumer<Consumer<T>> var2
   ) {
      this.CIOHHCORHRCCRICCCORIHCRHCCCRRR(var1);
      if (this.CIHCIHCORCICOHIRICHRRIORROOICH.isHeldByCurrentThread()) {
         this.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var1, var2);
      } else {
         this.CIHCIHCORCICOHIRICHRRIORROOICH.lock();

         try {
            this.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var1, var2);
         } finally {
            this.CIHCIHCORCICOHIRICHRRIORROOICH.unlock();
         }
      }
   }

   private <T extends com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH> void HRCHROOHRIHCRCRHRIIROCIRHOIRHH(
      Class<T> var1, Consumer<Consumer<T>> var2
   ) {
      RRCRRCORICCHOHHIRCHIROOHIIOHCO[] var3 = this.ORICOOIHHOIOIHOOHHOHHHIIHCHRII.get(var1);
      if (var3 != null) {
         this.CORCOCICIRIOHROHROIIOOHICCHCRR(var1);

         try {
            var2.accept(var3x -> {
               if (var3x != null) {
                  for (RRCRRCORICCHOHHIRCHIROOHIIOHCO var7 : var3) {
                     try {
                        Consumer var8 = var7.COIOHCOCOHIRRRRRCCIHRRCICOCOII();
                        var8.accept(var3x);
                     } catch (Throwable var9) {
                        this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var9);
                     }
                  }
               }
            });
         } catch (Exception | Error var5) {
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5, var1);
         }
      }

      if (!this.HCOHRORHHOHRROHROCCOCROROHRHHR.isEmpty()) {
         var2.accept(var2x -> this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2x, null));
      }

      if (var3 != null) {
         this.IIOIIRHIHIHROIHHOROOHCHCOOCRIC();
      }
   }

   public <PRE extends com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH, POST extends com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH> void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      Class<PRE> var1, Class<POST> var2, Function<HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH, Pair<PRE, POST>> var3, Runnable var4
   ) {
      this.CIOHHCORHRCCRICCCORIHCRHCCCRRR(var1);
      this.CIOHHCORHRCCRICCCORIHCRHCCCRRR(var2);
      if (this.CIHCIHCORCICOHIRICHRRIORROOICH.isHeldByCurrentThread()) {
         this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, var2, var3, var4);
      } else {
         this.CIHCIHCORCICOHIRICHRRIORROOICH.lock();

         try {
            this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, var2, var3, var4);
         } finally {
            this.CIHCIHCORCICOHIRICHRRIORROOICH.unlock();
         }
      }
   }

   private <PRE extends com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH, POST extends com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH> void IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      Class<PRE> var1, Class<POST> var2, Function<HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH, Pair<PRE, POST>> var3, Runnable var4
   ) {
      RRCRRCORICCHOHHIRCHIROOHIIOHCO[] var5 = this.ORICOOIHHOIOIHOOHHOHHHIIHCHRII.get(var1);
      RRCRRCORICCHOHHIRCHIROOHIIOHCO[] var6 = this.ORICOOIHHOIOIHOOHHOHHHIIHCHRII.get(var2);
      if (var5 != null || var6 != null) {
         try {
            Pair var17 = (Pair)var3.apply(
               !this.HCOHRORHHOHRROHROCCOCROROHRHHR.isEmpty()
                  ? HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.BOTH
                  : (
                     var5 == null
                        ? HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.POST
                        : (
                           var6 == null
                              ? HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.PRE
                              : HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.BOTH
                        )
                  )
            );
            if (var5 != null) {
               com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var8 = (com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH)var17.first();
               if (var8 != null) {
                  this.CORCOCICIRIOHROHROIIOOHICCHCRR(var1);

                  for (RRCRRCORICCHOHHIRCHIROOHIIOHCO var12 : var5) {
                     try {
                        Consumer var13 = var12.COIOHCOCOHIRRRRRCCIHRRCICOCOII();
                        var13.accept(var8);
                     } catch (Throwable var15) {
                        this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var15);
                     }
                  }

                  this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var8, null);
                  this.IIOIIRHIHIHROIHHOROOHCHCOOCRIC();
                  if (var8 instanceof CRRRICCRROCOHHOHIICIHORCOORRRH var19 && var19.isCancelled()) {
                     return;
                  }
               }
            } else {
               this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  var1, (com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH)var17.first(), null
               );
            }

            var4.run();
            if (var6 == null) {
               this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  var2, (com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH)var17.second(), null
               );
            } else {
               com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var18 = (com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH)var17.second();
               if (var18 != null) {
                  this.CORCOCICIRIOHROHROIIOOHICCHCRR(var2);

                  for (RRCRRCORICCHOHHIRCHIROOHIIOHCO var23 : var6) {
                     try {
                        Consumer var24 = var23.COIOHCOCOHIRRRRRCCIHRRCICOCOII();
                        var24.accept(var18);
                     } catch (Throwable var14) {
                        this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var14);
                     }
                  }

                  this.IIOIIRHIHIHROIHHOROOHCHCOOCRIC();
               }
            }
         } catch (Exception | Error var16) {
            if (!com.moonsworth.lunar.client.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHRRICCIOIHROCCOIIORROIROCIIOR) {
               com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
                  "EventBus [" + var1 + "][" + var2 + "]"
               );
               throw var16;
            }

            if (var16 instanceof AbstractMethodError || var16 instanceof IllegalAccessError) {
               throw var16;
            }

            com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
               "EventBus [" + var1 + "][" + var2 + "]: " + var16.getClass() + ":" + var16.getMessage()
            );
            var16.printStackTrace();
         }
      } else if (!this.HCOHRORHHOHRROHROCCOCROROHRHHR.isEmpty()) {
         Pair var7 = (Pair)var3.apply(HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.BOTH);
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var1, (com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH)var7.first(), null
         );
         var4.run();
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var2, (com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH)var7.second(), null
         );
      } else {
         var4.run();
      }
   }

   protected void CORCOCICIRIOHROHROIIOOHICCHCRR(
      Class<? extends com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH> var1
   ) {
      this.CIOIHHIORRORCCHHRICCHHICICHHRO.incrementAndGet();
   }

   protected void IIOIIRHIHIHROIHHOROOHCHCOOCRIC() {
      if (this.CIOIHHIORRORCCHHRICCHHICICHHRO.decrementAndGet() == 0) {
         this.OHCROCICCCORCIRCIHRRCIORCHOHRH();
      }
   }

   protected void OHCROCICCCORCIRCIHRRCIORCHOHRH() {
      if (!this.HCOHRORHHOHRROHROCCOCROROHRHHR.isEmpty()) {
         for (HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 : this.HCOHRORHHOHRROHROCCOCROROHRHHR) {
            if (var2.IRHCHROHHCCOORICICRRCRHOHIHHCH) {
               this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                  var2.HIHOOCIIOHHRICCHHCROOIIOORRRRR, var2.IIOOCICIHRCHRRCHHOCCOIRCOHRICI, var2.HOOHORRRIIHCHCOCRCCCICCROOROIC
               );
            } else {
               this.CRRRICCRROCOHHOHIICIHORCOORRRH(var2.HIHOOCIIOHHRICCHHCROOIIOORRRRR, var2.IIOOCICIHRCHRRCHHOCCOIRCOHRICI);
            }
         }

         this.HCOHRORHHOHRROHROCCOCROROHRHHR.clear();
      }
   }

   protected void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<?> var1) {
      this.HCOHRORHHOHRROHROCCOCROROHRHHR.add(var1);
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      Class<? extends com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH> var1, Throwable var2
   ) {
      com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
         "EventBus [" + var1 + "]: " + var2.getMessage()
      );
      com.moonsworth.lunar.client.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var2, "EventBus", !com.moonsworth.lunar.client.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHRRICCIOIHROCCOIIORROIROCIIOR, null
      );
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      Throwable var1, Class<? extends com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH> var2
   ) {
      try {
         if (!com.moonsworth.lunar.client.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHRRICCIOIHROCCOIIORROIROCIIOR) {
            com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH("EventBus [" + var2 + "]");
            throw var1;
         }

         if (!(var1 instanceof AbstractMethodError) && !(var1 instanceof IllegalAccessError)) {
            com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
               "EventBus [" + var2 + "]: " + var1.getClass() + ":" + var1.getMessage()
            );
            var1.printStackTrace();
         } else {
            throw var1;
         }
      } catch (Throwable var4) {
         throw var4;
      }
   }

   public void CRRRICCRROCOHHOHIICIHORCOORRRH(Runnable var1) {
      if (this.CIHCIHCORCICOHIRICHRRIORROOICH.isHeldByCurrentThread()) {
         var1.run();
      } else {
         this.CIHCIHCORCICOHIRICHRRIORROOICH.lock();

         try {
            var1.run();
         } finally {
            this.CIHCIHCORCICOHIRICHRRIORROOICH.unlock();
         }
      }
   }

   public <T> T HHCCIRHCCCIIRHCROHIORHIRHHIORH(Supplier<T> var1) {
      if (this.CIHCIHCORCICOHIRICHRRIORROOICH.isHeldByCurrentThread()) {
         return (T)var1.get();
      }

      this.CIHCIHCORCICOHIRICHRRIORROOICH.lock();

      try {
         return (T)var1.get();
      } finally {
         this.CIHCIHCORCICOHIRICHRRIORROOICH.unlock();
      }
   }

   public boolean HOHHOCRCRCHRRHHOIIHOCOIOCOIRRO() {
      return this.CIHCIHCORCICOHIRICHRRIORROOICH.isHeldByCurrentThread();
   }

   private void CIOHHCORHRCCRICCCORIHCRHCCCRRR(Class<? extends com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH> var1) {
      if (CRIHCRICCHIOIROCOORRHRRHHCHHOO) {
         if (!com.moonsworth.lunar.client.IRRCCOICORICIHCHRHIHIHROIRHOCR.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.class
            .isAssignableFrom(var1)) {
            if (!com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RHCHRCCRRHORIOCIOHHCRHCHICRIHH()
               .RIHCIRRIOICHROIOROIIIRIHORRRIR()) {
               com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                  "Event [" + var1.getSimpleName() + "] was fired on the wrong thread! If this is intentional, make it implement ThreadedEvent"
               );
               Thread.dumpStack();
            }
         }
      }
   }

   public HashMap<Class<? extends com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH>, RRCRRCORICCHOHHIRCHIROOHIIOHCO<? extends com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH>[]> RIIOIOHHOCOROCRROOOCRRCIICORIC() {
      return this.ORICOOIHHOIOIHOOHHOHHHIIHCHRII;
   }

   @Generated
   public static HHCCIRHCCCIIRHCROHIORHIRHHIORH HCCOIRHHOOHICHHIOOOIRORRCRIRRO() {
      return RHHHORCOOHOCRHIHRRCOOCCHICOCHH;
   }

   @Generated
   public ReentrantLock HOIRROCROIIHIROHORIOOROCCHOCHI() {
      return this.CIHCIHCORCICOHIRICHRRIORROOICH;
   }

   public enum IRCIIHHICIHRCOCRROCOICRIHHCCHH {
      PRE(true, false),
      POST(false, true),
      BOTH(true, true);

      private final boolean pre;
      private final boolean post;

      public <PRE extends com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH, POST extends com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH> Pair<PRE, POST> wrapEvents(
         Supplier<PRE> var1, Supplier<POST> var2
      ) {
         if (this == BOTH) {
            return Pair.of(
               (com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH)var1.get(),
               (com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH)var2.get()
            );
         } else {
            return this == PRE
               ? Pair.of((com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH)var1.get(), null)
               : Pair.of(null, (com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH)var2.get());
         }
      }

      @Generated
      public boolean isPre() {
         return this.pre;
      }

      @Generated
      public boolean isPost() {
         return this.post;
      }

      @Generated
      IRCIIHHICIHRCOCRROCOICRIHHCCHH(boolean var3, boolean var4) {
         this.pre = var3;
         this.post = var4;
      }
   }

   protected record RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<T extends com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH>() {
      private final boolean IRHCHROHHCCOORICICRRCRHOHIHHCH;
      private final Class<T> HIHOOCIIOHHRICCHHCROOIIOORRRRR;
      private final Consumer<T> IIOOCICIHRCHRRCHHOCCOIRCOHRICI;
      private final int HOOHORRRIIHCHCOCRCCCICCROOROIC;

      protected RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(boolean var1, Class<T> var2, Consumer<T> var3, int var4) {
         this.IRHCHROHHCCOORICICRRCRHOHIHHCH = var1;
         this.HIHOOCIIOHHRICCHHCROOIIOORRRRR = var2;
         this.IIOOCICIHRCHRRCHHOCCOIRCOHRICI = var3;
         this.HOOHORRRIIHCHCOCRCCCICCROOROIC = var4;
      }

      public boolean HHIHHOCHCHOICHRIHCHRIICHOCCHHI() {
         return this.IRHCHROHHCCOORICICRRCRHOHIHHCH;
      }

      public Class<T> HCOCHROIHOHRIIHHRIHCOOIIOHOORC() {
         return this.HIHOOCIIOHHRICCHHCROOIIOORRRRR;
      }

      public Consumer<T> COIOHCOCOHIRRRRRCCIHRRCICOCOII() {
         return this.IIOOCICIHRCHRRCHHOCCOIRCOHRICI;
      }

      public int priority() {
         return this.HOOHORRRIIHCHCOCRCCCICCROOROIC;
      }
   }
}
