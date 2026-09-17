package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHOCHHIRRCHHHOHOIRROIROHHHIHIO;

import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HICRRICCHCCROOHHCHOCOCCHOIHHOC;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.IOHHOIIOCRHCHHCRORICCOHOHROOIH;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.OHHRIOHROOIHOROCIRHCHORIHRRRRI;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.ORHIOICIOCRRHOOCOHRORIHICHRCRR;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.RIROICHCRROROHCCROOCCCCOCHCCRI;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO;
import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.IOIICIRIICICIIOORHCIIIIRRIHRHI;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.RHRIIOOOCRHIIOORCOCRCHRCCRRCIH;
import it.unimi.dsi.fastutil.longs.Long2FloatLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectBidirectionalIterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import lombok.Generated;
import org.jetbrains.annotations.MustBeInvokedByOverriders;
import org.jetbrains.annotations.Nullable;

public abstract class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   protected final com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HICHRCOHCCRHOHCICOOCHOIHCCHIRI CHRORRRCHIRRIIICHHRHCRCRCROOHI = IOHHOIIOCRHCHHCRORICCOHOHROOIH.CHCHHCCOHHIIHICCHCCICHIOCHOCOC(
         "showGraph"
      )
      .RICIORHICRROHOCHRRCRIHCROOCIIC(true)
      .CHCROCIHRRCHHCIHIICOCOCIIHCCOO();
   protected final com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HICHRCOHCCRHOHCICOOCHOIHCCHIRI RCCIOHIHOHRHROHIRRCOORIRCCRIRR = IOHHOIIOCRHCHHCRORICCOHOHROOIH.CHCHHCCOHHIIHICCHCCICHIOCHOCOC(
         "showUsage"
      )
      .RICIORHICRROHOCHRRCRIHCROOCIIC(true)
      .CHCROCIHRRCHHCIHIICOCOCIIHCCOO();
   protected final OHHRIOHROOIHOROCIRHCHORIHRRRRI ROOIIRHHIICIHHRHIIRHHHHCIHIOOI = IOHHOIIOCRHCHHCRORICCOHOHROOIH.CHOCHCOCIIICCORORHHOCRIIIHOHHR("graphColor")
      .RCIICICHIIRIIRHHROCOOOHRROOIIC(-872349952)
      .CHCROCIHRRCHHCIHIICOCOCIIHCCOO();
   protected final RIROICHCRROROHCCROOCCCCOCHCCRI<com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH> CICRIIHOCCIICIICOCIOCOHRCCIROI = IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         "updateRate",
         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.EVERY_TICK
      )
      .CHCROCIHRRCHHCIHIICOCOCIIHCCOO();
   protected final RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO IIRRRCORCRICRORHHOCROHCIIOOIHO = IOHHOIIOCRHCHHCRORICCOHOHROOIH.ICHOCHHROIHCROICCIRIHHCHRHROCO(
         "graphTimeframe"
      )
      .RCIICICHIIRIIRHHROCOOOHRROOIIC(60)
      .OCIROOIHIHRHOCCHIIIROOCRIIOCRR(1, 1800)
      .CHCROCIHRRCHHCIHIICOCOCIIHCCOO();
   protected final Map<com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH, Long2FloatLinkedOpenHashMap> ICHOHCRCRIRRCHIIHCIHCIOIORRHII;
   protected String IHOHICIIHRORHCOCHORHCORCIIOOII;
   protected boolean OHCIHHRCCROIHRCRCIIHCROOHRORHC;
   @Nullable
   private Class<? extends IRCIIHHICIHRCOCRROCOICRIHHCCHH> ROIRCHOCCHRHCOIHOHRIICICOOICIR;
   @Nullable
   private Consumer<? extends IRCIIHHICIHRCOCRROCOICRIHHCCHH> IRCROICHRHHIIOIIOIORIHRRICHROR;

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(boolean var1) {
      super(var1);
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HICRRICCHCCROOHHCHOCOCCHOIHHOC.HRRICIHOCORIIHCHROCROCICOIRIIO, this.IROROHHHHRORIRHHRHRCOIHCHOCRIC());
      List var2 = this.CIIOCCOOIIOIRCRIIOHIOIOOCRCOCI();
      this.ICHOHCRCRIRRCHIIHCIHCIOIORRHII = new LinkedHashMap<>(var2.size());

      for (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 : var2) {
         this.ICHOHCRCRIRRCHIIHCIHCIOIORRHII.put(var4, new Long2FloatLinkedOpenHashMap());
         if (var4.HCROCRCOHORCCHHHHRROOORICOIOHI() != -1L) {
            this.OHCIHHRCCROIHRCRCIIHCROOHRORHC = true;
         }
      }

      this.CICRIIHOCCIICIICOCIOCOHRCCIROI
         .IOIOHIORIROHRRCOOOHCROHORCOIIH(
            var1x -> {
               if (this.ROIRCHOCCHRHCOIHOHRIICICOOICIR != null && this.IRCROICHRHHIIOIIOIORIHRRICHROR != null) {
                  com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
                     .CRRRICCRROCOHHOHIICIHORCOORRRH(this.ROIRCHOCCHRHCOIHOHRIICICOOICIR, this.IRCROICHRHHIIOIIOIORIHRRICHROR);
                  this.ROIRCHOCCHRHCOIHOHRIICICOOICIR = null;
                  this.IRCROICHRHHIIOIIOIORIHRRICHROR = null;
               }

               var1x.getEventHandler()
                  .accept(
                     (var1xx, var2x) -> {
                        this.IRCROICHRHHIIOIIOIORIHRRICHROR = var2x;
                        this.ROIRCHOCCHRHCOIHOHRIICICOOICIR = var1xx;
                        this.handle(var1xx, var2x);
                     },
                     () -> {
                        boolean var1xx = true;
                        boolean var2x = !this.CHRORRRCHIRRIIICHHRHCRCRCROOHI.get();

                        for (Entry var4x : this.ICHOHCRCRIRRCHIIHCIHCIOIORRHII.entrySet()) {
                           com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var5 = (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var4x.getKey();
                           long var6 = var5.HCROCRCOHORCCHHHHRROOORICOIOHI();
                           if (var6 != -1L) {
                              long var8 = var5.getValue();
                              float var10 = var5.OHOHCHCCORORRIRHIIHOOOHIHOCCRC();
                              if (var1xx) {
                                 boolean var11 = var5.CRRROHROCCIHHRRIIIOCRCHCRIHOHI() != this.RCCIOHIHOHRHROHIRRCOORIRCCRIRR.get();
                                 String var12 = this.RHOCHHIRRCHHHOHOIRROIROHHHIHIO(var11 ? var6 - var8 : var8);
                                 this.IHOHICIIHRORHCOCHORHCORCIIOOII = String.format("%s  %.2f%%", var12, 100.0F - var10 * 100.0F);
                                 var1xx = false;
                              }

                              if (var2x) {
                                 return;
                              }

                              long var16 = System.currentTimeMillis();
                              long var13 = var16 - this.IIRRRCORCRICRORHHOCROHCIIOOIHO.get() * 1000;
                              Long2FloatLinkedOpenHashMap var15 = (Long2FloatLinkedOpenHashMap)var4x.getValue();
                              var15.long2FloatEntrySet().removeIf(var2xx -> var2xx.getLongKey() < var13);
                              var15.put(var16, var10);
                           } else if (var1xx) {
                              this.IHOHICIIHRORHCOCHORHCORCIIOOII = this.RHOCHHIRRCHHHOHOIRROIROHHHIHIO(var5.getValue());
                              var1xx = false;
                              if (var2x) {
                                 return;
                              }
                           }
                        }
                     }
                  );
            }
         );
      this.CHRORRRCHIRRIIICHHRHCRCRCROOHI
         .IOIOHIORIROHRRCOOOHCROHORCOIIH(var1x -> this.ICHOHCRCRIRRCHIIHCIHCIOIORRHII.values().forEach(Long2FloatLinkedOpenHashMap::clear));
   }

   protected abstract com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH IROROHHHHRORIRHHRHRCOIHCHOCRIC();

   protected abstract List<com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> CIIOCCOOIIOIRCRIIOHIOIOOCRCOCI();

   protected abstract String RHOCHHIRRCHHHOHOIRROIROHHHIHIO(long var1);

   @MustBeInvokedByOverriders
   @Override
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
   ) {
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.SETTINGS,
         var1x -> {
            var1x.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  this.CHRORRRCHIRRIIICHHRHCRCRCROOHI, var1xx -> var1xx.CRRRICCRROCOHHOHIICIHORCOORRRH(this.ROOIIRHHIICIHHRHIIRHHHHCIHIOOI)
               )
               .IIHRRHORCRCROCHHOHORCHCROCIHRO(
                  () -> !this.OHCIHHRCCROIHRCRCIIHCROOHRORHC
                     || !((com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRICCOOHHHCHOORCICOCOHIHOIRHOO)this.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH(
                           HICRRICCHCCROOHHCHOCOCCHOIHHOC.HRRICIHOCORIIHCHROCROCICOIRIIO
                        ))
                        .IICCRRCHRRCOHCHIHORRRIOHRRCHRO()
                        .get()
               );
            var1x.CRRRICCRROCOHHOHIICIHORCOORRRH(this.RCCIOHIHOHRHROHIRRCOORIRCCRIRR)
               .IIHRRHORCRCROCHHOHORCHCROCIHRO(() -> !this.OHCIHHRCCROIHRCRCIIHCROOHRORHC);
            var1x.CRRRICCRROCOHHOHIICIHORCOORRRH(this.CICRIIHOCCIICIICOCIOCOHRCCIROI, this.IIRRRCORCRICRORHHOCROHCIIOOIHO);
         }
      );
   }

   @Override
   protected com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI ORIRHOHRHHROCHHRRIOOCRIHRIIIOC() {
      return com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CIICCCRRHHCHRRHRIRCHOICCHROHCR()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CCCIRORHIRRORROOOOCCHCRIORHOIC
         )
         .RRCRRCORICCHOHHIRCHIROOHIIOHCO(this);
   }

   protected enum HHCCIRHCCCIIRHCROHIORHIRHHIORH implements ORHIOICIOCRRHOOCOHRORIHICHRCRR {
      EVERY_FRAME(
         (var0, var1) -> var0.accept(
            com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.OHHRIOHROOIHOROCIRHCHORIHRRRRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.class,
            var1x -> var1.run()
         )
      ),
      EVERY_OTHER_FRAME(
         (var0, var1) -> {
            AtomicBoolean var2 = new AtomicBoolean(true);
            var0.accept(
               com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.OHHRIOHROOIHOROCIRHCHORIHRRRRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.class,
               var2x -> {
                  if (var2.get()) {
                     var1.run();
                     var2.set(false);
                  } else {
                     var2.set(true);
                  }
               }
            );
         }
      ),
      EVERY_TICK((var0, var1) -> var0.accept(IOIICIRIICICIIOORHCIIIIRRIHRHI.class, var1x -> var1.run())),
      EVERY_OTHER_TICK((var0, var1) -> var0.accept(IOIICIRIICICIIOORHCIIIIRRIHRHI.class, var1x -> {
         if (IOIICIRIICICIIOORHCIIIIRRIHRHI.ROCHOOHIHIHCIRHCICIOHHCIOHHHRH % 2 == 0) {
            var1.run();
         }
      })),
      EVERY_HALF_SECOND((var0, var1) -> var0.accept(IOIICIRIICICIIOORHCIIIIRRIHRHI.class, var1x -> {
         if (IOIICIRIICICIIOORHCIIIIRRIHRHI.ROCHOOHIHIHCIRHCICIOHHCIOHHHRH % 10 == 0) {
            var1.run();
         }
      })),
      EVERY_SECOND(
         (var0, var1) -> var0.accept(
            com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIROICHCRROROHCCROOCCCCOCHCCRI.class,
            var1x -> var1.run()
         )
      ),
      EVERY_15_SECONDS(
         (var0, var1) -> {
            AtomicInteger var2 = new AtomicInteger();
            var0.accept(
               com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIROICHCRROROHCCROOCCCCOCHCCRI.class,
               var2x -> {
                  int var3 = var2.getAndIncrement();
                  if (var3 == 0) {
                     var1.run();
                  } else if (var3 >= 15) {
                     var2.set(0);
                  }
               }
            );
         }
      ),
      EVERY_30_SECONDS(
         (var0, var1) -> {
            AtomicInteger var2 = new AtomicInteger();
            var0.accept(
               com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIROICHCRROROHCCROOCCCCOCHCCRI.class,
               var2x -> {
                  int var3 = var2.getAndIncrement();
                  if (var3 == 0) {
                     var1.run();
                  } else if (var3 >= 30) {
                     var2.set(0);
                  }
               }
            );
         }
      );

      private final BiConsumer<BiConsumer<Class<? extends com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH>, Consumer<? extends com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH>>, Runnable> eventHandler;

      @Override
      public String id() {
         return this.name();
      }

      @Generated
      public BiConsumer<BiConsumer<Class<? extends com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH>, Consumer<? extends com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH>>, Runnable> getEventHandler() {
         return this.eventHandler;
      }

      @Generated
      HHCCIRHCCCIIRHCROHIORHIRHHIORH(
         BiConsumer<BiConsumer<Class<? extends com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH>, Consumer<? extends com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH>>, Runnable> var3
      ) {
         this.eventHandler = var3;
      }
   }

   protected class IRCIIHHICIHRCOCRROCOICRIHHCCHH
      extends com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRICCOOHHHCHOORCICOCOHIHOIRHOO<String> {
      private static final com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH HORCCCRORRIOHRROHIHHIOCRCOOROC = new com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(
         10, 24, 80, 50, 100, 120
      );
      private final String HHCIICIHCORICRRCHHCIOHRIOIHICC;

      public IRCIIHHICIHRCOCRROCOICRIHHCCHH(float var2, float var3, String var4) {
         super(var2, var3, com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.MIDDLE_LEFT);
         this.HHCIICIHCORICRRCHHCIOHRIOIHICC = var4;
      }

      @Override
      public com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH HRRIHHICORIHCHICOHCCRCHCHOHRCH() {
         return HORCCCRORRIOHRROHIHHIOCRCOOROC;
      }

      @Nullable
      public String HOHCCHOIOHOHHOROHOIIHOOHORRHRO(boolean var1) {
         return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.IHOHICIIHRORHCOCHORHCORCIIOOII;
      }

      @Override
      protected void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
         float var2,
         float var3,
         boolean var4,
         boolean var5
      ) {
         if (!var5) {
            com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var9 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH(
                  HICRRICCHCCROOHHCHOCOCCHOIHHOC.CORCICHOCCRIHORROHIOCRROCCIICO
               )
               .RHHCIICOCRRIHOOCHHHRHICRORCCRI();
            if (var9.RRIIRHOCCRIOCCOOROHCIOCCRCRICI()) {
               var1.push();
               var1.scale(0.5F, 0.5F, 0.5F);
               var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  IICCOOCHCHROORHHIIHROHCCRHRCOR.HRRIOIRCCHIICOOHHRCIHCCHCORICR(),
                  this.HHCIICIHCORICRRCHHCIOHRIOIHICC,
                  (var2 + 1.0F) * 2.0F,
                  (var3 + 1.0F) * 2.0F,
                  -1,
                  false
               );
               var1.pop();
            }
         } else {
            if (RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.OHCIHHRCCROIHRCRCIIHCROOHRORHC && RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.CHRORRRCHIRRIIICHHRHCRCRCROOHI.get()) {
               for (Entry var7 : RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.ICHOHCRCRIRRCHIIHCIHCIOIORRHII.entrySet()) {
                  Long2FloatLinkedOpenHashMap var8 = (Long2FloatLinkedOpenHashMap)var7.getValue();
                  if (var8.size() > 1) {
                     this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                        var1,
                        var2,
                        var3,
                        this.getWidth(),
                        this.getHeight(),
                        var8,
                        ((com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var7.getKey())
                           .getColor()
                     );
                  }
               }
            }
         }
      }

      protected void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
         float var2,
         float var3,
         float var4,
         float var5,
         Long2FloatLinkedOpenHashMap var6,
         int var7
      ) {
         float var8 = this.getScale();
         long var9 = var6.firstLongKey();
         long var11 = var6.lastLongKey();
         double var13 = var11 - var9;
         float var15 = var2 + var4;
         float var16 = var3 + var5;
         var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            1.0F, var7 == -1 ? RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.ROOIIRHHIICIHHRHIIRHHHHCIHIOOI.CRHRHRIOIHRCHRIORHRRCHHIHCOCCC(0.0F) : var7, var10 -> {
               boolean var11x = true;
               float var12 = 0.0F;
               float var13x = 0.0F;
               ObjectBidirectionalIterator var14 = var6.long2FloatEntrySet().iterator();

               while (var14.hasNext()) {
                  it.unimi.dsi.fastutil.longs.Long2FloatMap.Entry var15x = (it.unimi.dsi.fastutil.longs.Long2FloatMap.Entry)var14.next();
                  float var16x = RHRIIOOOCRHIIOORCOCRCHRCCRRCIH.lerp(var2, var15, (float)((var15x.getLongKey() - var9) / var13)) * var8;
                  float var17 = RHRIIOOOCRHIIOORCOCRCHRCCRRCIH.lerp(var3, var16, var15x.getFloatValue()) * var8;
                  if (!var11x) {
                     var10.accept(var12, var13x, var16x, var17);
                  } else {
                     var11x = false;
                  }

                  var12 = var16x;
                  var13x = var17;
               }
            }
         );
      }
   }

   public interface RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      long HCROCRCOHORCCHHHHRROOORICOIOHI();

      long getValue();

      default float OHOHCHCCORORRIRHIIHOOOHIHOCCRC() {
         return 2.0F - (float)((double)this.HCROCRCOHORCCHHHHRROOORICOIOHI() / this.getValue());
      }

      default int getColor() {
         return -1;
      }

      default boolean CRRROHROCCIHHRRIIIOCRCHCRIHOHI() {
         return false;
      }
   }
}
