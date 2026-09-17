package com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import java.lang.ref.SoftReference;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import lombok.Generated;

public class HRCHROOHRIHCRCRHRIIROCIRHOIRHH implements RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH, Consumer<RIOOCHICIHRHOHCCCCCHOCCCOHCRHI> {
   private static final boolean ROHOHHCICOICIORCCCIOIRRRICIIRH = System.getProperty("ichor.mx.debug", "true").equals("true");
   public static final com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH OICICCHOOROHCCOIRHOROIOCHCCORI = com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.HOHORCIHRHCIRHIHHRCHIIOHORHCRH(
      "MRegistry"
   );
   private final com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO CHRCIIROCIROOCHRIRROOHCROOHRIC;
   private final Set<IRCIIHHICIHRCOCRROCOICRIHHCCHH> OIHOHIICIOCCIIIICHHCHICHOIOIOO;
   private final List<SoftReference<RCIRROCCCIIHCIHCCRHHCCHOHHHCHH>> COOHCROOIOCOIIRROHIIOOIIICCRIO;
   private final List<RRCRRCORICCHOHHIRCHIROOHIIOHCO> RIHRROHICIHHORCHHIHRICICHRIRCO;
   private final Map<CRRRICCRROCOHHOHIICIHORCOORRRH, Set<CRRRICCRROCOHHOHIICIHORCOORRRH>> HOIRCHHOOCOOICRRCROOIHCCIRCHCH;
   private final Map<CRRRICCRROCOHHOHIICIHORCOORRRH, IRCIIHHICIHRCOCRROCOICRIHHCCHH> ICHICOHORHICCHCHRIROIICHORRCHI;

   public HRCHROOHRIHCRCRHRIIROCIRHOIRHH(OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1) {
      this.CHRCIIROCIROOCHRIRROOHCROOHRIC = new com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO(
         var1, this
      );
      this.OIHOHIICIOCCIIIICHHCHICHOIOIOO = Collections.synchronizedSet(new LinkedHashSet<>());
      this.COOHCROOIOCOIIRROHIIOOIIICCRIO = Collections.synchronizedList(new ArrayList<>());
      this.RIHRROHICIHHORCHHIHRICICHRIRCO = Collections.synchronizedList(new ArrayList<>());
      this.HOIRCHHOOCOOICRRCROOIHCCIRCHCH = new ConcurrentHashMap<>();
      this.ICHICOHORHICCHCHRIROIICHORRCHI = new HashMap<>();
   }

   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      this.COOHCROOIOCOIIRROHIIOOIIICCRIO.add(new SoftReference<>(var1));
   }

   private Optional<RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> CIOHHCORHRCCRICCCORIHCRHCCCRRR(Predicate<RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> var1) {
      synchronized (this.COOHCROOIOCOIIRROHIIOOIIICCRIO) {
         Iterator var3 = this.COOHCROOIOCOIIRROHIIOOIIICCRIO.iterator();

         while (var3.hasNext()) {
            SoftReference var4 = (SoftReference)var3.next();
            RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var5 = (RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var4.get();
            if (var5 == null) {
               var3.remove();
            } else if (var1.test(var5)) {
               return Optional.of(var5);
            }
         }
      }

      return Optional.empty();
   }

   private void HHCCIRHCCCIIRHCROHIORHIRHHIORH(RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var1) {
      synchronized (this.COOHCROOIOCOIIRROHIIOOIIICCRIO) {
         Iterator var3 = this.COOHCROOIOCOIIRROHIIOOIIICCRIO.iterator();

         while (var3.hasNext()) {
            SoftReference var4 = (SoftReference)var3.next();
            RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var5 = (RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var4.get();
            if (var5 == null) {
               var3.remove();
            } else {
               var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5);
            }
         }
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IRCIIHHICIHRCOCRROCOICRIHHCCHH var1) {
      this.OIHOHIICIOCCIIIICHHCHICHOIOIOO.add(var1);
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IRCIIHHICIHRCOCRROCOICRIHHCCHH var1, CRRRICCRROCOHHOHIICIHORCOORRRH var2) {
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1);
      this.HOIRCHHOOCOOICRRCROOIHCCIRCHCH.put(var2, var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this));
      this.ICHICOHORHICCHCHRIROIICHORRCHI.put(var2, var1);

      for (CRRRICCRROCOHHOHIICIHORCOORRRH var4 : var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this)) {
         this.ICHICOHORHICCHCHRIROIICHORRCHI.put(var4, var1);
         this.ICHICOHORHICCHCHRIROIICHORRCHI.put(var4.HHCCIRHCCCIIRHCROHIORHIRHHIORH(this), var1);
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RRCRRCORICCHOHHIRCHIROOHIIOHCO var1) {
      this.RIHRROHICIHHORCHHIHRICICHRIRCO.add(var1);
   }

   private OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH IRCIIHHICIHRCOCRROCOICRIHHCCHH(IRCIIHHICIHRCOCRROCOICRIHHCCHH var1) {
      long var2 = System.currentTimeMillis();

      try {
         OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 = this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1);
         if (var4 != null) {
            long var11 = System.currentTimeMillis() - var2;
            if (var11 > 500L) {
               OICICCHOOROHCCOIRHOROIOCHCCORI.info("[Timing] compute(" + var1.getId() + ") cache-hit in " + var11 + "ms");
            }

            return var4;
         } else {
            var1.COIOIOCIRHROOHROCOCIHRORHCOOHO().forEach(var1x -> {
               for (CRRRICCRROCOHHOHIICIHORCOORRRH var3 : var1x.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this)) {
                  if (this.CRRRICCRROCOHHOHIICIHORCOORRRH(var3).isEmpty()) {
                     this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1x);
                     return;
                  }
               }
            });
            if (this.CHRCIIROCIROOCHRIRROOHCROOHRIC.IRCIIHHICIHRCOCRROCOICRIHHCCHH(this.RIHRROHICIHHORCHHIHRICICHRIRCO, var1, this)
               && var1 instanceof HHCCIRHCCCIIRHCROHIORHIRHHIORH) {
               for (CRRRICCRROCOHHOHIICIHORCOORRRH var6 : var1.CCOOCICOOOCOICIIHRIIOIROCHHIOH().apply(this)) {
                  CRRRICCRROCOHHOHIICIHORCOORRRH var7 = var6.HHCCIRHCCCIIRHCROHIORHIRHHIORH(this);
                  IRCIIHHICIHRCOCRROCOICRIHHCCHH var8 = this.ICHICOHORHICCHCHRIROIICHORRCHI.get(var7);
                  if (var8 != null) {
                     var1 = var8;
                     var1.COIOIOCIRHROOHROCOCIHRORHCOOHO().forEach(this::IRCIIHHICIHRCOCRROCOICRIHHCCHH);
                     break;
                  }
               }
            }

            OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var10 = this.CHRCIIROCIROOCHRIRROOHCROOHRIC
               .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.RIHRROHICIHHORCHHIHRICICHRIRCO, var1, this);
            long var12 = System.currentTimeMillis() - var2;
            if (var12 > 500L) {
               OICICCHOOROHCCOIRHOROIOCHCCORI.info("[Timing] compute(" + var1.getId() + ") full-compute in " + var12 + "ms");
            }

            return var10;
         }
      } catch (Exception var9) {
         throw new IllegalStateException("Failed to compute " + var1.getId(), var9);
      }
   }

   private OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HHCCIRHCCCIIRHCROHIORHIRHHIORH(IRCIIHHICIHRCOCRROCOICRIHHCCHH var1) {
      RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var2 = new RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.RIHRROHICIHHORCHHIHRICICHRIRCO, var1);
      this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var2);
      ArrayList var3 = new ArrayList();
      boolean var4 = false;

      for (CRRRICCRROCOHHOHIICIHORCOORRRH var6 : var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this)) {
         CRRRICCRROCOHHOHIICIHORCOORRRH var7 = var6.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var2);
         if (var7.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var2)) {
            Optional var8 = this.CHRCIIROCIROOCHRIRROOHCROOHRIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var7);
            if (!var8.isPresent()) {
               var4 = true;
               break;
            }

            RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var9 = (RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var8.get();
            var3.add(var9);
         }
      }

      if (!var4 && !var3.isEmpty()) {
         for (RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var11 : var3) {
            this.CHRCIIROCIROOCHRIRROOHCROOHRIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var11);
         }

         return new OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3, null);
      } else {
         return null;
      }
   }

   public Optional<RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> CRRRICCRROCOHHOHIICIHORCOORRRH(CRRRICCRROCOHHOHIICIHORCOORRRH var1) {
      CRRRICCRROCOHHOHIICIHORCOORRRH var2 = var1.HHCCIRHCCCIIRHCROHIORHIRHHIORH(this);
      Optional var3 = this.CIOHHCORHRCCRICCCORIHCRHCCCRRR(var2x -> {
         CRRRICCRROCOHHOHIICIHORCOORRRH var3x = var2x.RCICIOOOHOCCORRRCOOCHICIRHOCHC();
         return var1.equals(var3x) || var2.equals(var3x);
      });
      if (var3.isPresent()) {
         return var3;
      }

      Set var4 = this.HOIRCHHOOCOOICRRCROOIHCCIRCHCH.get(var1);
      if (var4 != null) {
         Optional var5 = this.CIOHHCORHRCCRICCCORIHCRHCCCRRR(var2x -> {
            CRRRICCRROCOHHOHIICIHORCOORRRH var3x = var2x.RCICIOOOHOCCORRRCOOCHICIRHOCHC();

            for (CRRRICCRROCOHHOHIICIHORCOORRRH var5x : var4) {
               CRRRICCRROCOHHOHIICIHORCOORRRH var6 = var5x.HHCCIRHCCCIIRHCROHIORHIRHHIORH(this);
               if (var5x.equals(var3x) || var6.equals(var3x)) {
                  return true;
               }
            }

            return false;
         });
         if (var5.isPresent()) {
            return var5;
         }
      }

      return Optional.empty();
   }

   public Optional<RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CRRRICCRROCOHHOHIICIHORCOORRRH var1) {
      long var2 = System.currentTimeMillis();
      CRRRICCRROCOHHOHIICIHORCOORRRH var4 = var1.HHCCIRHCCCIIRHCROHIORHIRHHIORH(this);
      Optional var5 = this.CRRRICCRROCOHHOHIICIHORCOORRRH(var1);
      if (var5.isPresent()) {
         return var5;
      }

      synchronized (this.OIHOHIICIOCCIIIICHHCHICHOIOIOO) {
         for (IRCIIHHICIHRCOCRROCOICRIHHCCHH var8 : this.OIHOHIICIOCCIIIICHHCHICHOIOIOO) {
            Set var9 = var8.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this);
            if (var9.contains(var1) || var9.contains(var4)) {
               OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var10 = this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var8);
               Collection var11 = var10.OHRCHIHCHCOIORIICCCICOOROHHIHC();
               if (var11 == null) {
                  if (var10.HOOCHRHCCRCOIIIRROCCOIIRRHHCOC() != null && !var10.HOOCHRHCCRCOIIIRROCCOIIRRHHCOC().isEmpty() && ROHOHHCICOICIORCCCIOIRRRICIIRH) {
                     OICICCHOOROHCCOIRHOROIOCHCCORI.info("Failed to get data for " + var4.OIHOOHOHHOICRIOOCICCHCHHOROCIH());

                     for (CRRRICCRROCOHHOHIICIHORCOORRRH var21 : var10.HOOCHRHCCRCOIIIRROCCOIIRRHHCOC()) {
                        OICICCHOOROHCCOIRHOROIOCHCCORI.info("missing data = " + var21);
                     }
                  }
               } else {
                  for (RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var13 : var11) {
                     CRRRICCRROCOHHOHIICIHORCOORRRH var14 = var13.RCICIOOOHOCCORRRCOOCHICIRHOCHC();
                     if (var14 != null && (var14.equals(var1) || var14.equals(var4))) {
                        long var15 = System.currentTimeMillis() - var2;
                        if (var15 > 500L) {
                           OICICCHOOROHCCOIRHOROIOCHCCORI.info(
                              "[Timing] getData(" + var4.OIHOOHOHHOICRIOOCICCHCHHOROCIH() + ") via " + var8.getId() + " in " + var15 + "ms"
                           );
                        }

                        return Optional.of(var13);
                     }
                  }
               }
            }
         }
      }

      long var19 = System.currentTimeMillis() - var2;
      if (var19 > 500L) {
         OICICCHOOROHCCOIRHOROIOCHCCORI.info("[Timing] getData(" + var4.OIHOOHOHHOICRIOOCICCHCHHOROCIH() + ") fallback in " + var19 + "ms");
      }

      return this.CRRRICCRROCOHHOHIICIHORCOORRRH(var1);
   }

   public Optional<OOROOCCIRCCRHOIOIORIHCHHOOCCOR> HICRRICCHCCROOHHCHOCOCCHOIHHOC(Function<OOROOCCIRCCRHOIOIORIHCHHOOCCOR, Boolean> var1) {
      com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = this.CHRCIIROCIROOCHRIRROOHCROOHRIC;

      while (var2 != null) {
         if ((Boolean)var1.apply(var2)) {
            return Optional.of(var2);
         }

         if (var2.IRHOOCOOOIRHOIIHOOCRIHRIHIROCC() instanceof com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4
            )
          {
            var2 = var4;
         } else {
            var2 = null;
         }
      }

      return Optional.empty();
   }

   public Optional<Path> IRCIIHHICIHRCOCRROCOICRIHHCCHH(IRCIIHHICIHRCOCRROCOICRIHHCCHH var1, CRRRICCRROCOHHOHIICIHORCOORRRH var2) {
      return this.HICRRICCHCCROOHHCHOCOCCHOIHHOC(
            var0 -> var0 instanceof com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
         )
         .map(
            var3 -> {
               com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var4 = (com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH)var3;
               RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var5 = var4.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.RIHRROHICIHHORCHHIHRICICHRIRCO, var1);
               this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var5);
               return var4.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var5, var2);
            }
         );
   }

   @Override
   public Collection<RRCRRCORICCHOHHIRCHIROOHIIOHCO> OCHOCOOCROIICOIIHIHHHCICCHIICO() {
      return this.RIHRROHICIHHORCHHIHRICICHRIRCO;
   }

   public void CRRRICCRROCOHHOHIICIHORCOORRRH(RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var1) {
      this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1);
   }

   @Generated
   public com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO OCIIORIOOHIHICOOOHRROHRORRIOIC() {
      return this.CHRCIIROCIROOCHRIRROOHCROOHRIC;
   }

   @Generated
   public Set<IRCIIHHICIHRCOCRROCOICRIHHCCHH> OIHRIOIOCHCIHORHCIICCHORROCOIH() {
      return this.OIHOHIICIOCCIIIICHHCHICHOIOIOO;
   }

   @Generated
   public List<RRCRRCORICCHOHHIRCHIROOHIIOHCO> RORCHHRHRRCCHIRCOIIIOOHROCCOIO() {
      return this.RIHRROHICIHHORCHHIHRICICHRIRCO;
   }

   @Generated
   public Map<CRRRICCRROCOHHOHIICIHORCOORRRH, Set<CRRRICCRROCOHHOHIICIHORCOORRRH>> CRIOHIICICHCHIOCCRHHHIRIORCCHC() {
      return this.HOIRCHHOOCOOICRRCROOIHCCIRCHCH;
   }

   @Generated
   public Map<CRRRICCRROCOHHOHIICIHORCOORRRH, IRCIIHHICIHRCOCRROCOICRIHHCCHH> IHRRICRRICCORIOHRHHCIHIROCICHO() {
      return this.ICHICOHORHICCHCHRIROIICHORRCHI;
   }
}
