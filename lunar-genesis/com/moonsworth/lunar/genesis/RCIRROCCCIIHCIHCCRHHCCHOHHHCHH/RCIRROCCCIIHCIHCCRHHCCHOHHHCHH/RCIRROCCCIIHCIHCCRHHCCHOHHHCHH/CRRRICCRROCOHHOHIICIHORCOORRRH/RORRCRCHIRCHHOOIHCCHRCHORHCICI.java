package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import com.google.j2objc.annotations.Weak;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
class RORRCRCHIRCHHOOIHCCHRCHORHCICI<K, V, E extends RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR<K, V, E>, S extends RORRCRCHIRCHHOOIHCCHRCHORHCICI.CIOHHCORHRCCRICCCORIHCRHCCCRRR<K, V, E, S>>
   extends AbstractMap<K, V>
   implements Serializable,
   ConcurrentMap<K, V> {
   static final int CRIHRCRRRIICROCOOOCCRIICHRICHC = 1073741824;
   static final int HCCRRCIHOOOHORHRCIHCRHHHCORHIH = 65536;
   static final int OCOHOHIOHHHOHCOICCORCIRHCHCICC = 3;
   static final int OHRHOIOOCHOHIRHOCOCOOCROCHOCCH = 63;
   static final int IRCOHIRRRHOCCOCOIHIOOOHHRICIIC = 16;
   static final long ICCIOICCCIRHICCHIOICIRHORIRIIC = 60L;
   final transient int RHIIIOCHRIHIOHROOIRCRIRHIOIIIC;
   final transient int IHIHIICHCOOIRCOIHRRCRCIIHCOIOH;
   final transient RORRCRCHIRCHHOOIHCCHRCHORHCICI.CIOHHCORHRCCRICCCORIHCRHCCCRRR<K, V, E, S>[] HCHOOIRHHOHRIHRRROHOHRRIIHICOC;
   final int RIOOOOOCCHOHOIOCIHRCROIHHIHCHR;
   final com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IIHRRHORCRCROCHHOHORCHCROCIHRO<Object> IOCICHCIRRCRIRHHICCCICRHOICHRO;
   final transient RORRCRCHIRCHHOOIHCCHRCHORHCICI.CRICCOOHHHCHOORCICOCOHIHOIRHOO<K, V, E, S> OHOHCORROCHOHORCOHCHIHIIROCCHO;
   static final RORRCRCHIRCHHOOIHCCHRCHORHCICI.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR<Object, Object, RORRCRCHIRCHHOOIHCCHRCHORHCICI.RRCRRCORICCHOHHIRCHIROOHIIOHCO> OHRRORHCCRCHIHRRCOHHRCIORCCICH = new RORRCRCHIRCHHOOIHCCHRCHORHCICI.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR<Object, Object, RORRCRCHIRCHHOOIHCCHRCHORHCICI.RRCRRCORICCHOHHIRCHIROOHIIOHCO>() {
      public RORRCRCHIRCHHOOIHCCHRCHORHCICI.RRCRRCORICCHOHHIRCHIROOHIIOHCO ICOCOCHICICROIRICOHOORCOHRIROI() {
         return null;
      }

      @Override
      public void clear() {
      }

      @Override
      public Object get() {
         return null;
      }

      public RORRCRCHIRCHHOOIHCCHRCHORHCICI.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR<Object, Object, RORRCRCHIRCHHOOIHCCHRCHORHCICI.RRCRRCORICCHOHHIRCHIROOHIIOHCO> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         ReferenceQueue<Object> var1, RORRCRCHIRCHHOOIHCCHRCHORHCICI.RRCRRCORICCHOHHIRCHIROOHIIOHCO var2
      ) {
         return this;
      }
   };
   transient @Nullable Set<K> keySet;
   transient @Nullable Collection<V> values;
   transient @Nullable Set<Entry<K, V>> entrySet;
   private static final long HCIOIIIRHHRHIHOCOCRCHRIHOOCOHI = 5L;

   private RORRCRCHIRCHHOOIHCCHRCHORHCICI(HCHOOCHIOICRRHHIHHHICIRCIOICRI var1, RORRCRCHIRCHHOOIHCCHRCHORHCICI.CRICCOOHHHCHOORCICOCOHIHOIRHOO<K, V, E, S> var2) {
      this.RIOOOOOCCHOHOIOCIHRCROIHHIHCHR = Math.min(var1.getConcurrencyLevel(), 65536);
      this.IOCICHCIRRCRIRHHICCCICRHOICHRO = var1.ICCRRCIHIIHCRHORHHHCHOIORHCCCH();
      this.OHOHCORROCHOHORCOHCHIHIIROCCHO = var2;
      int var3 = Math.min(var1.getInitialCapacity(), 1073741824);
      int var4 = 0;

      byte var5;
      for (var5 = 1; var5 < this.RIOOOOOCCHOHOIOCIHRCROIHHIHCHR; var5 <<= 1) {
         var4++;
      }

      this.IHIHIICHCOOIRCOIHRRCRCIIHCOIOH = 32 - var4;
      this.RHIIIOCHRIHIOHROOIRCRIRHIOIIIC = var5 - 1;
      this.HCHOOIRHHOHRIHRRROHOHRRIIHICOC = this.CIICCRHHHOHOIOHCHRHOORCICRCORC(var5);
      int var6 = var3 / var5;
      if (var6 * var5 < var3) {
         var6++;
      }

      byte var7 = 1;

      while (var7 < var6) {
         var7 <<= 1;
      }

      for (int var8 = 0; var8 < this.HCHOOIRHHOHRIHRRROHOHRRIIHICOC.length; var8++) {
         this.HCHOOIRHHOHRIHRRROHOHRRIIHICOC[var8] = this.RICHHRCCHRIICHROOROCCICOIRRHCR(var7, -1);
      }
   }

   static <K, V> RORRCRCHIRCHHOOIHCCHRCHORHCICI<K, V, ? extends RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR<K, V, ?>, ?> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      HCHOOCHIOICRRHHIHHHICIRCIOICRI var0
   ) {
      if (var0.IOCROIRCIIIRCIIIRIHOHHHORHHIRR() == RORRCRCHIRCHHOOIHCCHRCHORHCICI.IIRHCHHOICHRICOOCRORCCIOOIHOIR.STRONG
         && var0.RCROIOCORIIHRRORROHHCHIOROCRRI() == RORRCRCHIRCHHOOIHCCHRCHORHCICI.IIRHCHHOICHRICOOCRORCCIOOIHOIR.STRONG) {
         return (RORRCRCHIRCHHOOIHCCHRCHORHCICI<K, V, ? extends RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR<K, V, ?>, ?>)(new RORRCRCHIRCHHOOIHCCHRCHORHCICI<>(
            var0, RORRCRCHIRCHHOOIHCCHRCHORHCICI.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHORRCOCICICROIIIOCCRIOIHIIROH()
         ));
      } else if (var0.IOCROIRCIIIRCIIIRIHOHHHORHHIRR() == RORRCRCHIRCHHOOIHCCHRCHORHCICI.IIRHCHHOICHRICOOCRORCCIOOIHOIR.STRONG
         && var0.RCROIOCORIIHRRORROHHCHIOROCRRI() == RORRCRCHIRCHHOOIHCCHRCHORHCICI.IIRHCHHOICHRICOOCRORCCIOOIHOIR.WEAK) {
         return (RORRCRCHIRCHHOOIHCCHRCHORHCICI<K, V, ? extends RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR<K, V, ?>, ?>)(new RORRCRCHIRCHHOOIHCCHRCHORHCICI<>(
            var0, RORRCRCHIRCHHOOIHCCHRCHORHCICI.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RHHHCOHCRIHIRIIRRHHOHICHOHIRCC()
         ));
      } else if (var0.IOCROIRCIIIRCIIIRIHOHHHORHHIRR() == RORRCRCHIRCHHOOIHCCHRCHORHCICI.IIRHCHHOICHRICOOCRORCCIOOIHOIR.WEAK
         && var0.RCROIOCORIIHRRORROHHCHIOROCRRI() == RORRCRCHIRCHHOOIHCCHRCHORHCICI.IIRHCHHOICHRICOOCRORCCIOOIHOIR.STRONG) {
         return (RORRCRCHIRCHHOOIHCCHRCHORHCICI<K, V, ? extends RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR<K, V, ?>, ?>)(new RORRCRCHIRCHHOOIHCCHRCHORHCICI<>(
            var0, RORRCRCHIRCHHOOIHCCHRCHORHCICI.IHCRORHRORIICHRHRCHRRIRRHHOCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.ROOIIRCHICROOOCIHRHHRCRIOHCIHR()
         ));
      } else if (var0.IOCROIRCIIIRCIIIRIHOHHHORHHIRR() == RORRCRCHIRCHHOOIHCCHRCHORHCICI.IIRHCHHOICHRICOOCRORCCIOOIHOIR.WEAK
         && var0.RCROIOCORIIHRRORROHHCHIOROCRRI() == RORRCRCHIRCHHOOIHCCHRCHORHCICI.IIRHCHHOICHRICOOCRORCCIOOIHOIR.WEAK) {
         return (RORRCRCHIRCHHOOIHCCHRCHORHCICI<K, V, ? extends RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR<K, V, ?>, ?>)(new RORRCRCHIRCHHOOIHCCHRCHORHCICI<>(
            var0, RORRCRCHIRCHHOOIHCCHRCHORHCICI.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRHHHCOOICRIRCCCOIORIHIHRHROOO()
         ));
      } else {
         throw new AssertionError();
      }
   }

   static <K> RORRCRCHIRCHHOOIHCCHRCHORHCICI<K, HCHOOCHIOICRRHHIHHHICIRCIOICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH, ? extends RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR<K, HCHOOCHIOICRRHHIHHHICIRCIOICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH, ?>, ?> IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      HCHOOCHIOICRRHHIHHHICIRCIOICRI var0
   ) {
      if (var0.IOCROIRCIIIRCIIIRIHOHHHORHHIRR() == RORRCRCHIRCHHOOIHCCHRCHORHCICI.IIRHCHHOICHRICOOCRORCCIOOIHOIR.STRONG
         && var0.RCROIOCORIIHRRORROHHCHIOROCRRI() == RORRCRCHIRCHHOOIHCCHRCHORHCICI.IIRHCHHOICHRICOOCRORCCIOOIHOIR.STRONG) {
         return new RORRCRCHIRCHHOOIHCCHRCHORHCICI<>(
            var0, RORRCRCHIRCHHOOIHCCHRCHORHCICI.OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HROOHCIOOHHOROOCIOROIRCCOOHOOR()
         );
      } else if (var0.IOCROIRCIIIRCIIIRIHOHHHORHHIRR() == RORRCRCHIRCHHOOIHCCHRCHORHCICI.IIRHCHHOICHRICOOCRORCCIOOIHOIR.WEAK
         && var0.RCROIOCORIIHRRORROHHCHIOROCRRI() == RORRCRCHIRCHHOOIHCCHRCHORHCICI.IIRHCHHOICHRICOOCRORCCIOOIHOIR.STRONG) {
         return new RORRCRCHIRCHHOOIHCCHRCHORHCICI<>(
            var0, RORRCRCHIRCHHOOIHCCHRCHORHCICI.ORHIOICIOCRRHOOCOHRORIHICHRCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CICORHRHIOCOOCCICRICHOOCROIHRH()
         );
      } else if (var0.RCROIOCORIIHRRORROHHCHIOROCRRI() == RORRCRCHIRCHHOOIHCCHRCHORHCICI.IIRHCHHOICHRICOOCRORCCIOOIHOIR.WEAK) {
         throw new IllegalArgumentException("Map cannot have both weak and dummy values");
      } else {
         throw new AssertionError();
      }
   }

   static <K, V, E extends RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR<K, V, E>> RORRCRCHIRCHHOOIHCCHRCHORHCICI.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR<K, V, E> CHRIRORHHHIHCHIOOCHRHORRORCRIH() {
      return (RORRCRCHIRCHHOOIHCCHRCHORHCICI.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR<K, V, E>)OHRRORHCCRCHIHRRCOHHRCIORCCICH;
   }

   static int rehash(int var0) {
      var0 += var0 << 15 ^ -12931;
      var0 ^= var0 >>> 10;
      var0 += var0 << 3;
      var0 ^= var0 >>> 6;
      var0 += (var0 << 2) + (var0 << 14);
      return var0 ^ var0 >>> 16;
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH
   E RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(E var1, E var2) {
      int var3 = var1.getHash();
      return this.CCCCHCRIHOHHIIIICHRCOOIRHOHIOH(var3).RCIRROCCCIIHCIHCCRHHCCHOHHHCHH((E)var1, (E)var2);
   }

   int hash(Object var1) {
      int var2 = this.IOCICHCIRRCRIRHHICCCICRHOICHRO.ICOHIIIRCIORCORHRRROOOOCOOROIC(var1);
      return rehash(var2);
   }

   void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RORRCRCHIRCHHOOIHCCHRCHORHCICI.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR<K, V, E> var1) {
      RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR var2 = var1.RCRRRICHIHCRORCHIHICHHHHRRIOHH();
      int var3 = var2.getHash();
      this.CCCCHCRIHOHHIIIICHRCOOIRHOHIOH(var3).RCIRROCCCIIHCIHCCRHHCCHOHHHCHH((K)var2.getKey(), var3, var1);
   }

   void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(E var1) {
      int var2 = var1.getHash();
      this.CCCCHCRIHOHHIIIICHRCOOIRHOHIOH(var2).RCIRROCCCIIHCIHCCRHHCCHOHHHCHH((E)var1, var2);
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH
   boolean IRCIIHHICIHRCOCRROCOICRIHHCCHH(RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR<K, V, ?> var1) {
      return this.CCCCHCRIHOHHIIIICHRCOOIRHOHIOH(var1.getHash()).OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var1) != null;
   }

   RORRCRCHIRCHHOOIHCCHRCHORHCICI.CIOHHCORHRCCRICCCORIHCRHCCCRRR<K, V, E, S> CCCCHCRIHOHHIIIICHRCOOIRHOHIOH(int var1) {
      return this.HCHOOIRHHOHRIHRRROHOHRRIIHICOC[var1 >>> this.IHIHIICHCOOIRCOIHRRCRCIIHCOIOH & this.RHIIIOCHRIHIOHROOIRCRIRHIOIIIC];
   }

   RORRCRCHIRCHHOOIHCCHRCHORHCICI.CIOHHCORHRCCRICCCORIHCRHCCCRRR<K, V, E, S> RICHHRCCHRIICHROOROCCICOIRRHCR(int var1, int var2) {
      return this.OHOHCORROCHOHORCOHCHIHIIROCCHO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this, var1, var2);
   }

   V HHCCIRHCCCIIRHCROHIORHIRHHIORH(E var1) {
      return (V)(var1.getKey() == null ? null : var1.getValue());
   }

   final RORRCRCHIRCHHOOIHCCHRCHORHCICI.CIOHHCORHRCCRICCCORIHCRHCCCRRR<K, V, E, S>[] CIICCRHHHOHOIOHCHRHOORCICRCORC(int var1) {
      return new RORRCRCHIRCHHOOIHCCHRCHORHCICI.CIOHHCORHRCCRICCCORIHCRHCCCRRR[var1];
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH
   RORRCRCHIRCHHOOIHCCHRCHORHCICI.IIRHCHHOICHRICOOCRORCCIOOIHOIR OOCRORCHRCHIRIHHRCRICOORIRCORI() {
      return this.OHOHCORROCHOHORCOHCHIHIIROCCHO.OOCRORCHRCHIRIHHRCRICOORIRCORI();
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH
   RORRCRCHIRCHHOOIHCCHRCHORHCICI.IIRHCHHOICHRICOOCRORCCIOOIHOIR OCCHOHIOCCIHIHRCHIIHIRIICOHHIC() {
      return this.OHOHCORROCHOHORCOHCHIHIIROCCHO.OCCHOHIOCCIHIHRCHIIHIRIICOHHIC();
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH
   com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IIHRRHORCRCROCHHOHORCHCROCIHRO<Object> ICOIORHIROCOCIHCICHRRCIHOHHCCR() {
      return this.OHOHCORROCHOHORCOHCHIHIIROCCHO.OCCHOHIOCCIHIHRCHIIHIRIICOHHIC().defaultEquivalence();
   }

   @Override
   public boolean isEmpty() {
      long var1 = 0L;
      RORRCRCHIRCHHOOIHCCHRCHORHCICI.CIOHHCORHRCCRICCCORIHCRHCCCRRR[] var3 = this.HCHOOIRHHOHRIHRRROHOHRRIIHICOC;

      for (int var4 = 0; var4 < var3.length; var4++) {
         if (var3[var4].count != 0) {
            return false;
         }

         var1 += var3[var4].modCount;
      }

      if (var1 != 0L) {
         for (int var5 = 0; var5 < var3.length; var5++) {
            if (var3[var5].count != 0) {
               return false;
            }

            var1 -= var3[var5].modCount;
         }

         return var1 == 0L;
      } else {
         return true;
      }
   }

   @Override
   public int size() {
      RORRCRCHIRCHHOOIHCCHRCHORHCICI.CIOHHCORHRCCRICCCORIHCRHCCCRRR[] var1 = this.HCHOOIRHHOHRIHRRROHOHRRIIHICOC;
      long var2 = 0L;

      for (int var4 = 0; var4 < var1.length; var4++) {
         var2 += var1[var4].count;
      }

      return com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.saturatedCast(
         var2
      );
   }

   @Override
   public V get(@Nullable Object var1) {
      if (var1 == null) {
         return null;
      }

      int var2 = this.hash(var1);
      return this.CCCCHCRIHOHHIIIICHRCOOIRHOHIOH(var2).get(var1, var2);
   }

   E ROIOROHRIHRRHIHRRRIHHHIICCHIOI(@Nullable Object var1) {
      if (var1 == null) {
         return null;
      }

      int var2 = this.hash(var1);
      return this.CCCCHCRIHOHHIIIICHRCOOIRHOHIOH(var2).IIHRRHORCRCROCHHOHORCHCROCIHRO(var1, var2);
   }

   @Override
   public boolean containsKey(@Nullable Object var1) {
      if (var1 == null) {
         return false;
      }

      int var2 = this.hash(var1);
      return this.CCCCHCRIHOHHIIIICHRCOOIRHOHIOH(var2).containsKey(var1, var2);
   }

   @Override
   public boolean containsValue(@Nullable Object var1) {
      if (var1 == null) {
         return false;
      }

      RORRCRCHIRCHHOOIHCCHRCHORHCICI.CIOHHCORHRCCRICCCORIHCRHCCCRRR[] var2 = this.HCHOOIRHHOHRIHRRROHOHRRIIHICOC;
      long var3 = -1L;

      for (int var5 = 0; var5 < 3; var5++) {
         long var6 = 0L;

         for (RORRCRCHIRCHHOOIHCCHRCHORHCICI.CIOHHCORHRCCRICCCORIHCRHCCCRRR var11 : var2) {
            int var12 = var11.count;
            AtomicReferenceArray var13 = var11.table;

            for (int var14 = 0; var14 < var13.length(); var14++) {
               for (RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR var15 = (RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR)var13.get(
                     var14
                  );
                  var15 != null;
                  var15 = var15.OIIRRHOROIOIROIHHIIHOIRHIHHHHR()
               ) {
                  Object var16 = var11.HHCCIRHCCCIIRHCROHIORHIRHHIORH((E)var15);
                  if (var16 != null && this.ICOIORHIROCOCIHCICHRRCIHOHHCCR().IHHCHHHCRIHOOCOIOOCRIIICIOROIR(var1, var16)) {
                     return true;
                  }
               }
            }

            var6 += var11.modCount;
         }

         if (var6 == var3) {
            break;
         }

         var3 = var6;
      }

      return false;
   }

   @CanIgnoreReturnValue
   @Override
   public V put(K var1, V var2) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var2
      );
      int var3 = this.hash(var1);
      return this.CCCCHCRIHOHHIIIICHRCOOIRHOHIOH(var3).put((K)var1, var3, (V)var2, false);
   }

   @CanIgnoreReturnValue
   @Override
   public V putIfAbsent(K var1, V var2) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var2
      );
      int var3 = this.hash(var1);
      return this.CCCCHCRIHOHHIIIICHRCOOIRHOHIOH(var3).put((K)var1, var3, (V)var2, true);
   }

   @Override
   public void putAll(Map<? extends K, ? extends V> var1) {
      for (Entry var3 : var1.entrySet()) {
         this.put((K)var3.getKey(), (V)var3.getValue());
      }
   }

   @CanIgnoreReturnValue
   @Override
   public V remove(@Nullable Object var1) {
      if (var1 == null) {
         return null;
      }

      int var2 = this.hash(var1);
      return this.CCCCHCRIHOHHIIIICHRCOOIRHOHIOH(var2).remove(var1, var2);
   }

   @CanIgnoreReturnValue
   @Override
   public boolean remove(@Nullable Object var1, @Nullable Object var2) {
      if (var1 != null && var2 != null) {
         int var3 = this.hash(var1);
         return this.CCCCHCRIHOHHIIIICHRCOOIRHOHIOH(var3).remove(var1, var3, var2);
      } else {
         return false;
      }
   }

   @CanIgnoreReturnValue
   @Override
   public boolean replace(K var1, @Nullable V var2, V var3) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var3
      );
      if (var2 == null) {
         return false;
      }

      int var4 = this.hash(var1);
      return this.CCCCHCRIHOHHIIIICHRCOOIRHOHIOH(var4).replace((K)var1, var4, (V)var2, (V)var3);
   }

   @CanIgnoreReturnValue
   @Override
   public V replace(K var1, V var2) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var2
      );
      int var3 = this.hash(var1);
      return this.CCCCHCRIHOHHIIIICHRCOOIRHOHIOH(var3).replace((K)var1, var3, (V)var2);
   }

   @Override
   public void clear() {
      for (RORRCRCHIRCHHOOIHCCHRCHORHCICI.CIOHHCORHRCCRICCCORIHCRHCCCRRR var4 : this.HCHOOIRHHOHRIHRRROHOHRRIIHICOC) {
         var4.clear();
      }
   }

   @Override
   public Set<K> keySet() {
      Set var1 = this.keySet;
      return var1 != null ? var1 : (this.keySet = new RORRCRCHIRCHHOOIHCCHRCHORHCICI.IIHRRHORCRCROCHHOHORCHCROCIHRO());
   }

   @Override
   public Collection<V> values() {
      Collection var1 = this.values;
      return var1 != null ? var1 : (this.values = new RORRCRCHIRCHHOOIHCCHRCHORHCICI.HHRIICOIOORCHCOIICOOIHIRHHICRI());
   }

   @Override
   public Set<Entry<K, V>> entrySet() {
      Set var1 = this.entrySet;
      return var1 != null ? var1 : (this.entrySet = new RORRCRCHIRCHHOOIHCCHRCHORHCICI.HRCHROOHRIHCRCRHRIIROCIRHOIRHH());
   }

   private static <E> ArrayList<E> toArrayList(Collection<E> var0) {
      ArrayList var1 = new ArrayList(var0.size());
      HRCROCOHHHICRHIHHOOCIIRRRCCIRR.addAll(var1, var0.iterator());
      return var1;
   }

   Object writeReplace() {
      return new RORRCRCHIRCHHOOIHCCHRCHORHCICI.IHHCHHHCRIHOOCOIOOCRIIICIOROIR<>(
         this.OHOHCORROCHOHORCOHCHIHIIROCCHO.OOCRORCHRCHIRIHHRCRICOORIRCORI(),
         this.OHOHCORROCHOHORCOHCHIHIIROCCHO.OCCHOHIOCCIHIHRCHIIHIRIICOHHIC(),
         this.IOCICHCIRRCRIRHHICCCICRHOICHRO,
         this.OHOHCORROCHOHORCOHCHIHIIROCCHO.OCCHOHIOCCIHIHRCHIIHIRIICOHHIC().defaultEquivalence(),
         this.RIOOOOOCCHOHOIOCIHRCROIHHIHCHR,
         this
      );
   }

   abstract static class CIOHHCORHRCCRICCCORIHCRHCCCRRR<K, V, E extends RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR<K, V, E>, S extends RORRCRCHIRCHHOOIHCCHRCHORHCICI.CIOHHCORHRCCRICCCORIHCRHCCCRRR<K, V, E, S>>
      extends ReentrantLock {
      @Weak
      final RORRCRCHIRCHHOOIHCCHRCHORHCICI<K, V, E, S> RCORIIOOHIIHCIICHHHCOHRIOIHROC;
      volatile int count;
      int modCount;
      int threshold;
      volatile @Nullable AtomicReferenceArray<E> table;
      final int IHCHHHORCCICRRRHRCIRRCOOOCRORI;
      final AtomicInteger CIHOHIOHHOHOHCRRROHIRIIIHCHHOR = new AtomicInteger();

      CIOHHCORHRCCRICCCORIHCRHCCCRRR(RORRCRCHIRCHHOOIHCCHRCHORHCICI<K, V, E, S> var1, int var2, int var3) {
         this.RCORIIOOHIIHCIICHHHCOHRIOIHROC = var1;
         this.IHCHHHORCCICRRRHRCIRRCOOOCRORI = var3;
         this.initTable(this.newEntryArray(var2));
      }

      abstract S HHIRHCHCHCHOORHHHIIIRRRCIIRRRI();

      @GuardedBy("this")
      void maybeDrainReferenceQueues() {
      }

      void maybeClearReferenceQueues() {
      }

      void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(E var1, V var2) {
         this.RCORIIOOHIIHCIICHHHCOHRIOIHROC
            .OHOHCORROCHOHORCOHCHIHIIROCCHO
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.HHIRHCHCHCHOORHHHIIIRRRCIIRRRI(), (E)var1, (V)var2);
      }

      E RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(E var1, E var2) {
         return this.RCORIIOOHIIHCIICHHHCOHRIOIHROC
            .OHOHCORROCHOHORCOHCHIHIIROCCHO
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.HHIRHCHCHCHOORHHHIIIRRRCIIRRRI(), (E)var1, (E)var2);
      }

      AtomicReferenceArray<E> newEntryArray(int var1) {
         return new AtomicReferenceArray<>(var1);
      }

      void initTable(AtomicReferenceArray<E> var1) {
         this.threshold = var1.length() * 3 / 4;
         if (this.threshold == this.IHCHHHORCCICRRRHRCIRRCOOOCRORI) {
            this.threshold++;
         }

         this.table = var1;
      }

      abstract E RRCRRCORICCHOHHIRCHIROOHIIOHCO(RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR<K, V, ?> var1);

      ReferenceQueue<K> getKeyReferenceQueueForTesting() {
         throw new AssertionError();
      }

      ReferenceQueue<V> getValueReferenceQueueForTesting() {
         throw new AssertionError();
      }

      RORRCRCHIRCHHOOIHCCHRCHORHCICI.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR<K, V, E> RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
         RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR<K, V, ?> var1
      ) {
         throw new AssertionError();
      }

      RORRCRCHIRCHHOOIHCCHRCHORHCICI.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR<K, V, E> IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR<K, V, ?> var1, V var2
      ) {
         throw new AssertionError();
      }

      void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR<K, V, ?> var1,
         RORRCRCHIRCHHOOIHCCHRCHORHCICI.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR<K, V, ? extends RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR<K, V, ?>> var2
      ) {
         throw new AssertionError();
      }

      void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(int var1, RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR<K, V, ?> var2) {
         this.table.set(var1, this.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var2));
      }

      E IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR<K, V, ?> var1,
         RORRCRCHIRCHHOOIHCCHRCHORHCICI.@Nullable CORCOCICIRIOHROHROIIOOHICCHCRR<K, V, ?> var2
      ) {
         return this.RCORIIOOHIIHCIICHHHCOHRIOIHROC
            .OHOHCORROCHOHORCOHCHIHIIROCCHO
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               this.HHIRHCHCHCHOORHHHIIIRRRCIIRRRI(), this.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var1), this.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var2)
            );
      }

      void HHCCIRHCCCIIRHCROHIORHIRHHIORH(RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR<K, V, ?> var1, V var2) {
         this.RCORIIOOHIIHCIICHHHCOHRIOIHROC
            .OHOHCORROCHOHORCOHCHIHIIROCCHO
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.HHIRHCHCHCHOORHHHIIIRRRCIIRRRI(), this.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var1), (V)var2);
      }

      E RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(K var1, int var2, RORRCRCHIRCHHOOIHCCHRCHORHCICI.@Nullable CORCOCICIRIOHROHROIIOOHICCHCRR<K, V, ?> var3) {
         return this.RCORIIOOHIIHCIICHHHCOHRIOIHROC
            .OHOHCORROCHOHORCOHCHIHIIROCCHO
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.HHIRHCHCHCHOORHHHIIIRRRCIIRRRI(), (K)var1, var2, this.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var3));
      }

      @CanIgnoreReturnValue
      boolean HRCHROOHRIHCRCRHRIIROCIRHOIRHH(RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR<K, V, ?> var1) {
         return this.CORCOCICIRIOHROHROIIOOHICCHCRR(this.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var1));
      }

      E HHCCIRHCCCIIRHCROHIORHIRHHIORH(
         RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR<K, V, ?> var1,
         RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR<K, V, ?> var2
      ) {
         return this.CRRRICCRROCOHHOHIICIHORCOORRRH(this.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var1), this.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var2));
      }

      @Nullable V OOROOCCIRCCRHOIOIORIHCHHOOCCOR(RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR<K, V, ?> var1) {
         return this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(this.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var1));
      }

      void tryDrainReferenceQueues() {
         if (this.tryLock()) {
            try {
               this.maybeDrainReferenceQueues();
            } finally {
               this.unlock();
            }
         }
      }

      @GuardedBy("this")
      void drainKeyReferenceQueue(ReferenceQueue<K> var1) {
         int var3 = 0;

         Reference var2;
         while ((var2 = var1.poll()) != null) {
            RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR var4 = (RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR)var2;
            this.RCORIIOOHIIHCIICHHHCOHRIOIHROC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH((E)var4);
            if (++var3 == 16) {
               break;
            }
         }
      }

      @GuardedBy("this")
      void drainValueReferenceQueue(ReferenceQueue<V> var1) {
         int var3 = 0;

         Reference var2;
         while ((var2 = var1.poll()) != null) {
            RORRCRCHIRCHHOOIHCCHRCHORHCICI.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR var4 = (RORRCRCHIRCHHOOIHCCHRCHORHCICI.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR)var2;
            this.RCORIIOOHIIHCIICHHHCOHRIOIHROC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4);
            if (++var3 == 16) {
               break;
            }
         }
      }

      <T> void clearReferenceQueue(ReferenceQueue<T> var1) {
         while (var1.poll() != null) {
         }
      }

      E IICHCOCCIOIIHRHHROCOIOHOHCIHCH(int var1) {
         AtomicReferenceArray var2 = this.table;
         return (E)var2.get(var1 & var2.length() - 1);
      }

      E IIHRRHORCRCROCHHOHORCHCROCIHRO(Object var1, int var2) {
         if (this.count != 0) {
            for (RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR var3 = this.IICHCOCCIOIIHRHHROCOIOHOHCIHCH(var2);
               var3 != null;
               var3 = var3.OIIRRHOROIOIROIHHIIHOIRHIHHHHR()
            ) {
               if (var3.getHash() == var2) {
                  Object var4 = var3.getKey();
                  if (var4 == null) {
                     this.tryDrainReferenceQueues();
                  } else if (this.RCORIIOOHIIHCIICHHHCOHRIOIHROC.IOCICHCIRRCRIRHHICCCICRHOICHRO.IHHCHHHCRIHOOCOIOOCRIIICIOROIR(var1, var4)) {
                     return (E)var3;
                  }
               }
            }
         }

         return null;
      }

      E OCOHORHCROHICRRIHCIHHRRCIHICRI(Object var1, int var2) {
         return this.IIHRRHORCRCROCHHOHORCHCROCIHRO(var1, var2);
      }

      V get(Object var1, int var2) {
         try {
            RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR var3 = this.OCOHORHCROHICRRIHCIHHRRCIHICRI(var1, var2);
            if (var3 == null) {
               return null;
            }

            Object var4 = var3.getValue();
            if (var4 == null) {
               this.tryDrainReferenceQueues();
            }

            return (V)var4;
         } finally {
            this.postReadCleanup();
         }
      }

      boolean containsKey(Object var1, int var2) {
         try {
            if (this.count == 0) {
               return false;
            }

            RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR var3 = this.OCOHORHCROHICRRIHCIHHRRCIHICRI(var1, var2);
            return var3 != null && var3.getValue() != null;
         } finally {
            this.postReadCleanup();
         }
      }

      @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH
      boolean containsValue(Object var1) {
         try {
            if (this.count != 0) {
               AtomicReferenceArray var2 = this.table;
               int var3 = var2.length();

               for (int var4 = 0; var4 < var3; var4++) {
                  for (RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR var5 = (RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR)var2.get(
                        var4
                     );
                     var5 != null;
                     var5 = var5.OIIRRHOROIOIROIHHIIHOIRHIHHHHR()
                  ) {
                     Object var6 = this.HHCCIRHCCCIIRHCROHIORHIRHHIORH((E)var5);
                     if (var6 != null && this.RCORIIOOHIIHCIICHHHCOHRIOIHROC.ICOIORHIROCOCIHCICHRRCIHOHHCCR().IHHCHHHCRIHOOCOIOOCRIIICIOROIR(var1, var6)) {
                        return true;
                     }
                  }
               }
            }

            return false;
         } finally {
            this.postReadCleanup();
         }
      }

      V put(K var1, int var2, V var3, boolean var4) {
         this.lock();

         try {
            this.preWriteCleanup();
            int var5 = this.count + 1;
            if (var5 > this.threshold) {
               this.expand();
               var5 = this.count + 1;
            }

            AtomicReferenceArray var6 = this.table;
            int var7 = var2 & var6.length() - 1;
            RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR var8 = (RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR)var6.get(var7);

            for (RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR var9 = var8; var9 != null; var9 = var9.OIIRRHOROIOIROIHHIIHOIRHIHHHHR()) {
               Object var10 = var9.getKey();
               if (var9.getHash() == var2
                  && var10 != null
                  && this.RCORIIOOHIIHCIICHHHCOHRIOIHROC.IOCICHCIRRCRIRHHICCCICRHOICHRO.IHHCHHHCRIHOOCOIOOCRIIICIOROIR(var1, var10)) {
                  Object var11 = var9.getValue();
                  if (var11 == null) {
                     this.modCount++;
                     this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH((E)var9, (V)var3);
                     var5 = this.count;
                     this.count = var5;
                     return null;
                  }

                  if (var4) {
                     return (V)var11;
                  }

                  this.modCount++;
                  this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH((E)var9, (V)var3);
                  return (V)var11;
               }
            }

            this.modCount++;
            RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR var17 = this.RCORIIOOHIIHCIICHHHCOHRIOIHROC
               .OHOHCORROCHOHORCOHCHIHIIROCCHO
               .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.HHIRHCHCHCHOORHHHIIIRRRCIIRRRI(), (K)var1, var2, (E)var8);
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH((E)var17, (V)var3);
            var6.set(var7, var17);
            this.count = var5;
            return null;
         } finally {
            this.unlock();
         }
      }

      @GuardedBy("this")
      void expand() {
         AtomicReferenceArray var1 = this.table;
         int var2 = var1.length();
         if (var2 < 1073741824) {
            int var3 = this.count;
            AtomicReferenceArray var4 = this.newEntryArray(var2 << 1);
            this.threshold = var4.length() * 3 / 4;
            int var5 = var4.length() - 1;

            for (int var6 = 0; var6 < var2; var6++) {
               RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR var7 = (RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR)var1.get(
                  var6
               );
               if (var7 != null) {
                  RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR var8 = var7.OIIRRHOROIOIROIHHIIHOIRHIHHHHR();
                  int var9 = var7.getHash() & var5;
                  if (var8 == null) {
                     var4.set(var9, var7);
                  } else {
                     RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR var10 = var7;
                     int var11 = var9;

                     for (RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR var12 = var8;
                        var12 != null;
                        var12 = var12.OIIRRHOROIOIROIHHIIHOIRHIHHHHR()
                     ) {
                        int var13 = var12.getHash() & var5;
                        if (var13 != var11) {
                           var11 = var13;
                           var10 = var12;
                        }
                     }

                     var4.set(var11, var10);

                     for (RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR var16 = var7;
                        var16 != var10;
                        var16 = var16.OIIRRHOROIOIROIHHIIHOIRHIHHHHR()
                     ) {
                        int var17 = var16.getHash() & var5;
                        RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR var14 = (RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR)var4.get(
                           var17
                        );
                        RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR var15 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH((E)var16, (E)var14);
                        if (var15 != null) {
                           var4.set(var17, var15);
                        } else {
                           var3--;
                        }
                     }
                  }
               }
            }

            this.table = var4;
            this.count = var3;
         }
      }

      boolean replace(K var1, int var2, V var3, V var4) {
         this.lock();

         try {
            this.preWriteCleanup();
            AtomicReferenceArray var5 = this.table;
            int var6 = var2 & var5.length() - 1;
            RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR var7 = (RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR)var5.get(var6);

            for (RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR var8 = var7; var8 != null; var8 = var8.OIIRRHOROIOIROIHHIIHOIRHIHHHHR()) {
               Object var9 = var8.getKey();
               if (var8.getHash() == var2
                  && var9 != null
                  && this.RCORIIOOHIIHCIICHHHCOHRIOIHROC.IOCICHCIRRCRIRHHICCCICRHOICHRO.IHHCHHHCRIHOOCOIOOCRIIICIOROIR(var1, var9)) {
                  Object var10 = var8.getValue();
                  if (var10 == null) {
                     if (CRICCOOHHHCHOORCICOCOHIHOIRHOO((E)var8)) {
                        int var11 = this.count - 1;
                        this.modCount++;
                        RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR var12 = this.CRRRICCRROCOHHOHIICIHORCOORRRH((E)var7, (E)var8);
                        var11 = this.count - 1;
                        var5.set(var6, var12);
                        this.count = var11;
                     }

                     return false;
                  }

                  if (this.RCORIIOOHIIHCIICHHHCOHRIOIHROC.ICOIORHIROCOCIHCICHRRCIHOHHCCR().IHHCHHHCRIHOOCOIOOCRIIICIOROIR(var3, var10)) {
                     this.modCount++;
                     this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH((E)var8, (V)var4);
                     return true;
                  }

                  return false;
               }
            }

            return false;
         } finally {
            this.unlock();
         }
      }

      V replace(K var1, int var2, V var3) {
         this.lock();

         try {
            this.preWriteCleanup();
            AtomicReferenceArray var4 = this.table;
            int var5 = var2 & var4.length() - 1;
            RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR var6 = (RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR)var4.get(var5);

            for (RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR var7 = var6; var7 != null; var7 = var7.OIIRRHOROIOIROIHHIIHOIRHIHHHHR()) {
               Object var8 = var7.getKey();
               if (var7.getHash() == var2
                  && var8 != null
                  && this.RCORIIOOHIIHCIICHHHCOHRIOIHROC.IOCICHCIRRCRIRHHICCCICRHOICHRO.IHHCHHHCRIHOOCOIOOCRIIICIOROIR(var1, var8)) {
                  Object var9 = var7.getValue();
                  if (var9 == null) {
                     if (CRICCOOHHHCHOORCICOCOHIHOIRHOO((E)var7)) {
                        int var10 = this.count - 1;
                        this.modCount++;
                        RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR var11 = this.CRRRICCRROCOHHOHIICIHORCOORRRH((E)var6, (E)var7);
                        var10 = this.count - 1;
                        var4.set(var5, var11);
                        this.count = var10;
                     }

                     return null;
                  }

                  this.modCount++;
                  this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH((E)var7, (V)var3);
                  return (V)var9;
               }
            }

            return null;
         } finally {
            this.unlock();
         }
      }

      @CanIgnoreReturnValue
      V remove(Object var1, int var2) {
         this.lock();

         try {
            this.preWriteCleanup();
            int var3 = this.count - 1;
            AtomicReferenceArray var4 = this.table;
            int var5 = var2 & var4.length() - 1;
            RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR var6 = (RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR)var4.get(var5);

            for (RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR var7 = var6; var7 != null; var7 = var7.OIIRRHOROIOIROIHHIIHOIRHIHHHHR()) {
               Object var8 = var7.getKey();
               if (var7.getHash() == var2
                  && var8 != null
                  && this.RCORIIOOHIIHCIICHHHCOHRIOIHROC.IOCICHCIRRCRIRHHICCCICRHOICHRO.IHHCHHHCRIHOOCOIOOCRIIICIOROIR(var1, var8)) {
                  Object var9 = var7.getValue();
                  if (var9 == null && !CRICCOOHHHCHOORCICOCOHIHOIRHOO((E)var7)) {
                     return null;
                  }

                  this.modCount++;
                  RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR var10 = this.CRRRICCRROCOHHOHIICIHORCOORRRH((E)var6, (E)var7);
                  var3 = this.count - 1;
                  var4.set(var5, var10);
                  this.count = var3;
                  return (V)var9;
               }
            }

            return null;
         } finally {
            this.unlock();
         }
      }

      boolean remove(Object var1, int var2, Object var3) {
         this.lock();

         try {
            this.preWriteCleanup();
            int var4 = this.count - 1;
            AtomicReferenceArray var5 = this.table;
            int var6 = var2 & var5.length() - 1;
            RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR var7 = (RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR)var5.get(var6);

            for (RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR var8 = var7; var8 != null; var8 = var8.OIIRRHOROIOIROIHHIIHOIRHIHHHHR()) {
               Object var9 = var8.getKey();
               if (var8.getHash() == var2
                  && var9 != null
                  && this.RCORIIOOHIIHCIICHHHCOHRIOIHROC.IOCICHCIRRCRIRHHICCCICRHOICHRO.IHHCHHHCRIHOOCOIOOCRIIICIOROIR(var1, var9)) {
                  Object var10 = var8.getValue();
                  boolean var11 = false;
                  if (this.RCORIIOOHIIHCIICHHHCOHRIOIHROC.ICOIORHIROCOCIHCICHRRCIHOHHCCR().IHHCHHHCRIHOOCOIOOCRIIICIOROIR(var3, var10)) {
                     var11 = true;
                  } else if (!CRICCOOHHHCHOORCICOCOHIHOIRHOO((E)var8)) {
                     return false;
                  }

                  this.modCount++;
                  RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR var12 = this.CRRRICCRROCOHHOHIICIHORCOORRRH((E)var7, (E)var8);
                  var4 = this.count - 1;
                  var5.set(var6, var12);
                  this.count = var4;
                  return var11;
               }
            }

            return false;
         } finally {
            this.unlock();
         }
      }

      void clear() {
         if (this.count != 0) {
            this.lock();

            try {
               AtomicReferenceArray var1 = this.table;

               for (int var2 = 0; var2 < var1.length(); var2++) {
                  var1.set(var2, null);
               }

               this.maybeClearReferenceQueues();
               this.CIHOHIOHHOHOHCRRROHIRIIIHCHHOR.set(0);
               this.modCount++;
               this.count = 0;
            } finally {
               this.unlock();
            }
         }
      }

      @GuardedBy("this")
      E CRRRICCRROCOHHOHIICIHORCOORRRH(E var1, E var2) {
         int var3 = this.count;
         RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR var4 = var2.OIIRRHOROIOIROIHHIIHOIRHIHHHHR();

         for (RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR var5 = var1; var5 != var2; var5 = var5.OIIRRHOROIOIROIHHIIHOIRHIHHHHR()) {
            RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR var6 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH((E)var5, (E)var4);
            if (var6 != null) {
               var4 = var6;
            } else {
               var3--;
            }
         }

         this.count = var3;
         return (E)var4;
      }

      @CanIgnoreReturnValue
      boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(E var1, int var2) {
         this.lock();

         try {
            int var3 = this.count - 1;
            AtomicReferenceArray var4 = this.table;
            int var5 = var2 & var4.length() - 1;
            RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR var6 = (RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR)var4.get(var5);

            for (RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR var7 = var6; var7 != null; var7 = var7.OIIRRHOROIOIROIHHIIHOIRHIHHHHR()) {
               if (var7 == var1) {
                  this.modCount++;
                  RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR var8 = this.CRRRICCRROCOHHOHIICIHORCOORRRH((E)var6, (E)var7);
                  var3 = this.count - 1;
                  var4.set(var5, var8);
                  this.count = var3;
                  return true;
               }
            }

            return false;
         } finally {
            this.unlock();
         }
      }

      @CanIgnoreReturnValue
      boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(K var1, int var2, RORRCRCHIRCHHOOIHCCHRCHORHCICI.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR<K, V, E> var3) {
         this.lock();

         try {
            int var4 = this.count - 1;
            AtomicReferenceArray var5 = this.table;
            int var6 = var2 & var5.length() - 1;
            RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR var7 = (RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR)var5.get(var6);

            for (RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR var8 = var7; var8 != null; var8 = var8.OIIRRHOROIOIROIHHIIHOIRHIHHHHR()) {
               Object var9 = var8.getKey();
               if (var8.getHash() == var2
                  && var9 != null
                  && this.RCORIIOOHIIHCIICHHHCOHRIOIHROC.IOCICHCIRRCRIRHHICCCICRHOICHRO.IHHCHHHCRIHOOCOIOOCRIIICIOROIR(var1, var9)) {
                  RORRCRCHIRCHHOOIHCCHRCHORHCICI.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR var10 = ((RORRCRCHIRCHHOOIHCCHRCHORHCICI.OIHCOHRCICCCRHRCROOCIOIRRHHHIH)var8)
                     .ICRHRCCRHRRRCCCOOCHIIRRIRHCCII();
                  if (var10 == var3) {
                     this.modCount++;
                     RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR var11 = this.CRRRICCRROCOHHOHIICIHORCOORRRH((E)var7, (E)var8);
                     var4 = this.count - 1;
                     var5.set(var6, var11);
                     this.count = var4;
                     return true;
                  }

                  return false;
               }
            }

            return false;
         } finally {
            this.unlock();
         }
      }

      @CanIgnoreReturnValue
      boolean IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         K var1,
         int var2,
         RORRCRCHIRCHHOOIHCCHRCHORHCICI.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR<K, V, ? extends RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR<K, V, ?>> var3
      ) {
         this.lock();

         try {
            AtomicReferenceArray var4 = this.table;
            int var5 = var2 & var4.length() - 1;
            RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR var6 = (RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR)var4.get(var5);

            for (RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR var7 = var6; var7 != null; var7 = var7.OIIRRHOROIOIROIHHIIHOIRHIHHHHR()) {
               Object var8 = var7.getKey();
               if (var7.getHash() == var2
                  && var8 != null
                  && this.RCORIIOOHIIHCIICHHHCOHRIOIHROC.IOCICHCIRRCRIRHHICCCICRHOICHRO.IHHCHHHCRIHOOCOIOOCRIIICIOROIR(var1, var8)) {
                  RORRCRCHIRCHHOOIHCCHRCHORHCICI.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR var9 = ((RORRCRCHIRCHHOOIHCCHRCHORHCICI.OIHCOHRCICCCRHRCROOCIOIRRHHHIH)var7)
                     .ICRHRCCRHRRRCCCOOCHIIRRIRHCCII();
                  if (var9 == var3) {
                     RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR var10 = this.CRRRICCRROCOHHOHIICIHORCOORRRH((E)var6, (E)var7);
                     var4.set(var5, var10);
                     return true;
                  }

                  return false;
               }
            }

            return false;
         } finally {
            this.unlock();
         }
      }

      @GuardedBy("this")
      boolean CORCOCICIRIOHROHROIIOOHICCHCRR(E var1) {
         int var2 = var1.getHash();
         int var3 = this.count - 1;
         AtomicReferenceArray var4 = this.table;
         int var5 = var2 & var4.length() - 1;
         RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR var6 = (RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR)var4.get(var5);

         for (RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR var7 = var6; var7 != null; var7 = var7.OIIRRHOROIOIROIHHIIHOIRHIHHHHR()) {
            if (var7 == var1) {
               this.modCount++;
               RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR var8 = this.CRRRICCRROCOHHOHIICIHORCOORRRH((E)var6, (E)var7);
               var3 = this.count - 1;
               var4.set(var5, var8);
               this.count = var3;
               return true;
            }
         }

         return false;
      }

      static <K, V, E extends RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR<K, V, E>> boolean CRICCOOHHHCHOORCICOCOHIHOIRHOO(E var0) {
         return var0.getValue() == null;
      }

      @Nullable V HHCCIRHCCCIIRHCROHIORHIRHHIORH(E var1) {
         if (var1.getKey() == null) {
            this.tryDrainReferenceQueues();
            return null;
         } else {
            Object var2 = var1.getValue();
            if (var2 == null) {
               this.tryDrainReferenceQueues();
               return null;
            } else {
               return (V)var2;
            }
         }
      }

      void postReadCleanup() {
         if ((this.CIHOHIOHHOHOHCRRROHIRIIIHCHHOR.incrementAndGet() & 63) == 0) {
            this.runCleanup();
         }
      }

      @GuardedBy("this")
      void preWriteCleanup() {
         this.runLockedCleanup();
      }

      void runCleanup() {
         this.runLockedCleanup();
      }

      void runLockedCleanup() {
         if (this.tryLock()) {
            try {
               this.maybeDrainReferenceQueues();
               this.CIHOHIOHHOHOHCRRROHIRIIIHCHHOR.set(0);
            } finally {
               this.unlock();
            }
         }
      }
   }

   interface CORCOCICIRIOHROHROIIOOHICCHCRR<K, V, E extends RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR<K, V, E>> {
      E OIIRRHOROIOIROIHHIIHOIRHIHHHHR();

      int getHash();

      K getKey();

      V getValue();
   }

   interface CRICCOOHHHCHOORCICOCOHIHOIRHOO<K, V, E extends RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR<K, V, E>, S extends RORRCRCHIRCHHOOIHCCHRCHORHCICI.CIOHHCORHRCCRICCCORIHCRHCCCRRR<K, V, E, S>> {
      RORRCRCHIRCHHOOIHCCHRCHORHCICI.IIRHCHHOICHRICOOCRORCCIOOIHOIR OOCRORCHRCHIRIHHRCRICOORIRCORI();

      RORRCRCHIRCHHOOIHCCHRCHORHCICI.IIRHCHHOICHRICOOCRORCCIOOIHOIR OCCHOHIOCCIHIHRCHIIHIRIICOHHIC();

      S RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RORRCRCHIRCHHOOIHCCHRCHORHCICI<K, V, E, S> var1, int var2, int var3);

      E RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(S var1, K var2, int var3, @Nullable E var4);

      E RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(S var1, E var2, @Nullable E var3);

      void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(S var1, E var2, V var3);
   }

   static final class CRRRICCRROCOHHOHIICIHORCOORRRH implements Runnable {
      final WeakReference<RORRCRCHIRCHHOOIHCCHRCHORHCICI<?, ?, ?, ?>> HRCCHOOHHIOCCICHOHHHIHRHHHHIHR;

      public CRRRICCRROCOHHOHIICIHORCOORRRH(RORRCRCHIRCHHOOIHCCHRCHORHCICI<?, ?, ?, ?> var1) {
         this.HRCCHOOHHIOCCICHOHHHIHRHHHHIHR = new WeakReference<>(var1);
      }

      @Override
      public void run() {
         RORRCRCHIRCHHOOIHCCHRCHORHCICI var1 = this.HRCCHOOHHIOCCICHOHHHIHRHHHHIHR.get();
         if (var1 == null) {
            throw new CancellationException();
         }

         for (RORRCRCHIRCHHOOIHCCHRCHORHCICI.CIOHHCORHRCCRICCCORIHCRHCCCRRR var5 : var1.HCHOOIRHHOHRIHRRROHOHRRIIHICOC) {
            var5.runCleanup();
         }
      }
   }

   abstract static class HHCCIRHCCCIIRHCROHIORHIRHHIORH<K, V, E extends RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR<K, V, E>>
      extends WeakReference<K>
      implements RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR<K, V, E> {
      final int HHRCRROORHCHORCHHRHCIOCRHHROOI;
      final @Nullable E OHRCRCRCIRCHOIHHOOHIHCIOHIROCI;

      HHCCIRHCCCIIRHCROHIORHIRHHIORH(ReferenceQueue<K> var1, K var2, int var3, @Nullable E var4) {
         super((K)var2, var1);
         this.HHRCRROORHCHORCHHRHCIOCRHHROOI = var3;
         this.OHRCRCRCIRCHOIHHOOHIHCIOHIROCI = (E)var4;
      }

      @Override
      public K getKey() {
         return this.get();
      }

      @Override
      public int getHash() {
         return this.HHRCRROORHCHORCHHRHCIOCRHHROOI;
      }

      @Override
      public E OIIRRHOROIOIROIHHIIHOIRHIHHHHR() {
         return this.OHRCRCRCIRCHOIHHOOHIHCIOHIROCI;
      }
   }

   final class HHRIICOIOORCHCOIICOOIHIRHHICRI extends AbstractCollection<V> {
      @Override
      public Iterator<V> iterator() {
         return RORRCRCHIRCHHOOIHCCHRCHORHCICI.this.new IOIICIRIICICIIOORHCIIIIRRIHRHI();
      }

      @Override
      public int size() {
         return RORRCRCHIRCHHOOIHCCHRCHORHCICI.this.size();
      }

      @Override
      public boolean isEmpty() {
         return RORRCRCHIRCHHOOIHCCHRCHORHCICI.this.isEmpty();
      }

      @Override
      public boolean contains(Object var1) {
         return RORRCRCHIRCHHOOIHCCHRCHORHCICI.this.containsValue(var1);
      }

      @Override
      public void clear() {
         RORRCRCHIRCHHOOIHCCHRCHORHCICI.this.clear();
      }

      @Override
      public Object[] toArray() {
         return RORRCRCHIRCHHOOIHCCHRCHORHCICI.toArrayList(this).toArray();
      }

      @Override
      public <T> T[] toArray(T[] var1) {
         return (T[])RORRCRCHIRCHHOOIHCCHRCHORHCICI.toArrayList(this).toArray(var1);
      }
   }

   final class HICHRCOHCCRHOHCICOOCHOIHCCHIRI extends RORRCRCHIRCHHOOIHCCHRCHORHCICI<K, V, E, S>.OOROOCCIRCCRHOIOIORIHCHHOOCCOR<K> {
      @Override
      public K next() {
         return this.RROHHICCIRROIIRRRIIIIOOHHOHCCR().getKey();
      }
   }

   static final class HICRRICCHCCROOHHCHOCOCCHOIHHOC<K, V>
      extends RORRCRCHIRCHHOOIHCCHRCHORHCICI.IRCIIHHICIHRCOCRROCOICRIHHCCHH<K, V, RORRCRCHIRCHHOOIHCCHRCHORHCICI.HICRRICCHCCROOHHCHOCOCCHOIHHOC<K, V>>
      implements RORRCRCHIRCHHOOIHCCHRCHORHCICI.OIHCOHRCICCCRHRCROOCIOIRRHHHIH<K, V, RORRCRCHIRCHHOOIHCCHRCHORHCICI.HICRRICCHCCROOHHCHOCOCCHOIHHOC<K, V>> {
      private volatile RORRCRCHIRCHHOOIHCCHRCHORHCICI.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR<K, V, RORRCRCHIRCHHOOIHCCHRCHORHCICI.HICRRICCHCCROOHHCHOCOCCHOIHHOC<K, V>> RHCRRIHHOICICCCROOOCHHROOHOOOO = RORRCRCHIRCHHOOIHCCHRCHORHCICI.CHRIRORHHHIHCHIOOCHRHORRORCRIH();

      HICRRICCHCCROOHHCHOCOCCHOIHHOC(K var1, int var2, RORRCRCHIRCHHOOIHCCHRCHORHCICI.@Nullable HICRRICCHCCROOHHCHOCOCCHOIHHOC<K, V> var3) {
         super((K)var1, var2, var3);
      }

      @Override
      public V getValue() {
         return this.RHCRRIHHOICICCCROOOCHHROOHOOOO.get();
      }

      @Override
      public void clearValue() {
         this.RHCRRIHHOICICCCROOOCHHROOHOOOO.clear();
      }

      void setValue(V var1, ReferenceQueue<V> var2) {
         RORRCRCHIRCHHOOIHCCHRCHORHCICI.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR var3 = this.RHCRRIHHOICICCCROOOCHHROOHOOOO;
         this.RHCRRIHHOICICCCROOOCHHROOHOOOO = new RORRCRCHIRCHHOOIHCCHRCHORHCICI.IOHIHIIHCCCCCIHRORIOIOORCIOHII<>(var2, (V)var1, this);
         var3.clear();
      }

      RORRCRCHIRCHHOOIHCCHRCHORHCICI.HICRRICCHCCROOHHCHOCOCCHOIHHOC<K, V> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         ReferenceQueue<V> var1, RORRCRCHIRCHHOOIHCCHRCHORHCICI.HICRRICCHCCROOHHCHOCOCCHOIHHOC<K, V> var2
      ) {
         RORRCRCHIRCHHOOIHCCHRCHORHCICI.HICRRICCHCCROOHHCHOCOCCHOIHHOC var3 = new RORRCRCHIRCHHOOIHCCHRCHORHCICI.HICRRICCHCCROOHHCHOCOCCHOIHHOC(
            this.ICCIRHORRICOOHORCOIHRIRCHRIOII, this.ICOIIRHCCOIOCHOIRCRRCOIRCROOIC, var2
         );
         var3.RHCRRIHHOICICCCROOOCHHROOHOOOO = this.RHCRRIHHOICICCCROOOCHHROOHOOOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var3);
         return var3;
      }

      @Override
      public RORRCRCHIRCHHOOIHCCHRCHORHCICI.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR<K, V, RORRCRCHIRCHHOOIHCCHRCHORHCICI.HICRRICCHCCROOHHCHOCOCCHOIHHOC<K, V>> ICRHRCCRHRRRCCCOOCHIIRRIRHCCII() {
         return this.RHCRRIHHOICICCCROOOCHHROOHOOOO;
      }

      static final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<K, V>
         implements RORRCRCHIRCHHOOIHCCHRCHORHCICI.CRICCOOHHHCHOORCICOCOHIHOIRHOO<K, V, RORRCRCHIRCHHOOIHCCHRCHORHCICI.HICRRICCHCCROOHHCHOCOCCHOIHHOC<K, V>, RORRCRCHIRCHHOOIHCCHRCHORHCICI.RIROICHCRROROHCCROOCCCCOCHCCRI<K, V>> {
         private static final RORRCRCHIRCHHOOIHCCHRCHORHCICI.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<?, ?> CHOCOORIIHROOOCRCRRIHHCIIOHRII = new RORRCRCHIRCHHOOIHCCHRCHORHCICI.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();

         static <K, V> RORRCRCHIRCHHOOIHCCHRCHORHCICI.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<K, V> RHHHCOHCRIHIRIIRRHHOHICHOHIRCC() {
            return (RORRCRCHIRCHHOOIHCCHRCHORHCICI.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<K, V>)CHOCOORIIHROOOCRCRRIHHCIIOHRII;
         }

         @Override
         public RORRCRCHIRCHHOOIHCCHRCHORHCICI.IIRHCHHOICHRICOOCRORCCIOOIHOIR OOCRORCHRCHIRIHHRCRICOORIRCORI() {
            return RORRCRCHIRCHHOOIHCCHRCHORHCICI.IIRHCHHOICHRICOOCRORCCIOOIHOIR.STRONG;
         }

         @Override
         public RORRCRCHIRCHHOOIHCCHRCHORHCICI.IIRHCHHOICHRICOOCRORCCIOOIHOIR OCCHOHIOCCIHIHRCHIIHIRIICOHHIC() {
            return RORRCRCHIRCHHOOIHCCHRCHORHCICI.IIRHCHHOICHRICOOCRORCCIOOIHOIR.WEAK;
         }

         public RORRCRCHIRCHHOOIHCCHRCHORHCICI.RIROICHCRROROHCCROOCCCCOCHCCRI<K, V> CRRRICCRROCOHHOHIICIHORCOORRRH(
            RORRCRCHIRCHHOOIHCCHRCHORHCICI<K, V, RORRCRCHIRCHHOOIHCCHRCHORHCICI.HICRRICCHCCROOHHCHOCOCCHOIHHOC<K, V>, RORRCRCHIRCHHOOIHCCHRCHORHCICI.RIROICHCRROROHCCROOCCCCOCHCCRI<K, V>> var1,
            int var2,
            int var3
         ) {
            return new RORRCRCHIRCHHOOIHCCHRCHORHCICI.RIROICHCRROROHCCROOCCCCOCHCCRI<>(var1, var2, var3);
         }

         public RORRCRCHIRCHHOOIHCCHRCHORHCICI.HICRRICCHCCROOHHCHOCOCCHOIHHOC<K, V> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            RORRCRCHIRCHHOOIHCCHRCHORHCICI.RIROICHCRROROHCCROOCCCCOCHCCRI<K, V> var1,
            RORRCRCHIRCHHOOIHCCHRCHORHCICI.HICRRICCHCCROOHHCHOCOCCHOIHHOC<K, V> var2,
            RORRCRCHIRCHHOOIHCCHRCHORHCICI.@Nullable HICRRICCHCCROOHHCHOCOCCHOIHHOC<K, V> var3
         ) {
            return RORRCRCHIRCHHOOIHCCHRCHORHCICI.CIOHHCORHRCCRICCCORIHCRHCCCRRR.CRICCOOHHHCHOORCICOCOHIHOIRHOO(var2)
               ? null
               : var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.OHRIORRHICHOHRRHHCOOIRCOORRHHC, var3);
         }

         public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            RORRCRCHIRCHHOOIHCCHRCHORHCICI.RIROICHCRROROHCCROOCCCCOCHCCRI<K, V> var1,
            RORRCRCHIRCHHOOIHCCHRCHORHCICI.HICRRICCHCCROOHHCHOCOCCHOIHHOC<K, V> var2,
            V var3
         ) {
            var2.setValue(var3, var1.OHRIORRHICHOHRRHHCOOIRCOORRHHC);
         }

         public RORRCRCHIRCHHOOIHCCHRCHORHCICI.HICRRICCHCCROOHHCHOCOCCHOIHHOC<K, V> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            RORRCRCHIRCHHOOIHCCHRCHORHCICI.RIROICHCRROROHCCROOCCCCOCHCCRI<K, V> var1,
            K var2,
            int var3,
            RORRCRCHIRCHHOOIHCCHRCHORHCICI.@Nullable HICRRICCHCCROOHHCHOCOCCHOIHHOC<K, V> var4
         ) {
            return new RORRCRCHIRCHHOOIHCCHRCHORHCICI.HICRRICCHCCROOHHCHOCOCCHOIHHOC<>((K)var2, var3, var4);
         }
      }
   }

   final class HRCHROOHRIHCRCRHRIIROCIRHOIRHH extends RORRCRCHIRCHHOOIHCCHRCHORHCICI.OCOHORHCROHICRRIHCIHHRRCIHICRI<Entry<K, V>> {
      @Override
      public Iterator<Entry<K, V>> iterator() {
         return RORRCRCHIRCHHOOIHCCHRCHORHCICI.this.new RIOOCHICIHRHOHCCCCCHOCCCOHCRHI();
      }

      @Override
      public boolean contains(Object var1) {
         if (!(var1 instanceof Entry)) {
            return false;
         }

         Entry var2 = (Entry)var1;
         Object var3 = var2.getKey();
         if (var3 == null) {
            return false;
         }

         Object var4 = RORRCRCHIRCHHOOIHCCHRCHORHCICI.this.get(var3);
         return var4 != null && RORRCRCHIRCHHOOIHCCHRCHORHCICI.this.ICOIORHIROCOCIHCICHRRCIHOHHCCR().IHHCHHHCRIHOOCOIOOCRIIICIOROIR(var2.getValue(), var4);
      }

      @Override
      public boolean remove(Object var1) {
         if (!(var1 instanceof Entry)) {
            return false;
         }

         Entry var2 = (Entry)var1;
         Object var3 = var2.getKey();
         return var3 != null && RORRCRCHIRCHHOOIHCCHRCHORHCICI.this.remove(var3, var2.getValue());
      }

      @Override
      public int size() {
         return RORRCRCHIRCHHOOIHCCHRCHORHCICI.this.size();
      }

      @Override
      public boolean isEmpty() {
         return RORRCRCHIRCHHOOIHCCHRCHORHCICI.this.isEmpty();
      }

      @Override
      public void clear() {
         RORRCRCHIRCHHOOIHCCHRCHORHCICI.this.clear();
      }
   }

   static final class ICICIOCHHHIHOCHCOHORIHRCOHHOCR<K, V>
      extends RORRCRCHIRCHHOOIHCCHRCHORHCICI.CIOHHCORHRCCRICCCORIHCRHCCCRRR<K, V, RORRCRCHIRCHHOOIHCCHRCHORHCICI.IHCRORHRORIICHRHRCHRRIRRHHOCOO<K, V>, RORRCRCHIRCHHOOIHCCHRCHORHCICI.ICICIOCHHHIHOCHCOHORIHRCOHHOCR<K, V>> {
      private final ReferenceQueue<K> OICCIHICIIIRRRIIIROIOIHRIICICO = new ReferenceQueue<>();

      ICICIOCHHHIHOCHCOHORIHRCOHHOCR(
         RORRCRCHIRCHHOOIHCCHRCHORHCICI<K, V, RORRCRCHIRCHHOOIHCCHRCHORHCICI.IHCRORHRORIICHRHRCHRRIRRHHOCOO<K, V>, RORRCRCHIRCHHOOIHCCHRCHORHCICI.ICICIOCHHHIHOCHCOHORIHRCOHHOCR<K, V>> var1,
         int var2,
         int var3
      ) {
         super(var1, var2, var3);
      }

      RORRCRCHIRCHHOOIHCCHRCHORHCICI.ICICIOCHHHIHOCHCOHORIHRCOHHOCR<K, V> RORRIHHIICOCCIICCOCIOCIHROOHHH() {
         return this;
      }

      @Override
      ReferenceQueue<K> getKeyReferenceQueueForTesting() {
         return this.OICCIHICIIIRRRIIIROIOIHRIICICO;
      }

      public RORRCRCHIRCHHOOIHCCHRCHORHCICI.IHCRORHRORIICHRHRCHRRIRRHHOCOO<K, V> IHHCHHHCRIHOOCOIOOCRIIICIOROIR(
         RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR<K, V, ?> var1
      ) {
         return (RORRCRCHIRCHHOOIHCCHRCHORHCICI.IHCRORHRORIICHRHRCHRRIRRHHOCOO<K, V>)var1;
      }

      @Override
      void maybeDrainReferenceQueues() {
         this.drainKeyReferenceQueue(this.OICCIHICIIIRRRIIIROIOIHRIICICO);
      }

      @Override
      void maybeClearReferenceQueues() {
         this.clearReferenceQueue(this.OICCIHICIIIRRRIIIROIOIHRIICICO);
      }
   }

   static final class IHCRORHRORIICHRHRCHRRIRRHHOCOO<K, V>
      extends RORRCRCHIRCHHOOIHCCHRCHORHCICI.HHCCIRHCCCIIRHCROHIORHIRHHIORH<K, V, RORRCRCHIRCHHOOIHCCHRCHORHCICI.IHCRORHRORIICHRHRCHRRIRRHHOCOO<K, V>>
      implements RORRCRCHIRCHHOOIHCCHRCHORHCICI.IHIRRIIORRHORHRORIHOROIRCORCOO<K, V, RORRCRCHIRCHHOOIHCCHRCHORHCICI.IHCRORHRORIICHRHRCHRRIRRHHOCOO<K, V>> {
      private volatile @Nullable V value = (V)null;

      IHCRORHRORIICHRHRCHRRIRRHHOCOO(
         ReferenceQueue<K> var1, K var2, int var3, RORRCRCHIRCHHOOIHCCHRCHORHCICI.@Nullable IHCRORHRORIICHRHRCHRRIRRHHOCOO<K, V> var4
      ) {
         super(var1, (K)var2, var3, var4);
      }

      @Override
      public @Nullable V getValue() {
         return this.value;
      }

      void setValue(V var1) {
         this.value = (V)var1;
      }

      RORRCRCHIRCHHOOIHCCHRCHORHCICI.IHCRORHRORIICHRHRCHRRIRRHHOCOO<K, V> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         ReferenceQueue<K> var1, RORRCRCHIRCHHOOIHCCHRCHORHCICI.IHCRORHRORIICHRHRCHRRIRRHHOCOO<K, V> var2
      ) {
         RORRCRCHIRCHHOOIHCCHRCHORHCICI.IHCRORHRORIICHRHRCHRRIRRHHOCOO var3 = new RORRCRCHIRCHHOOIHCCHRCHORHCICI.IHCRORHRORIICHRHRCHRRIRRHHOCOO(
            var1, this.getKey(), this.HHRCRROORHCHORCHHRHCIOCRHHROOI, var2
         );
         var3.setValue(this.value);
         return var3;
      }

      static final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<K, V>
         implements RORRCRCHIRCHHOOIHCCHRCHORHCICI.CRICCOOHHHCHOORCICOCOHIHOIRHOO<K, V, RORRCRCHIRCHHOOIHCCHRCHORHCICI.IHCRORHRORIICHRHRCHRRIRRHHOCOO<K, V>, RORRCRCHIRCHHOOIHCCHRCHORHCICI.ICICIOCHHHIHOCHCOHORIHRCOHHOCR<K, V>> {
         private static final RORRCRCHIRCHHOOIHCCHRCHORHCICI.IHCRORHRORIICHRHRCHRRIRRHHOCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<?, ?> OIIHOOOCRHCORHCIOORICCRRICRRRC = new RORRCRCHIRCHHOOIHCCHRCHORHCICI.IHCRORHRORIICHRHRCHRRIRRHHOCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();

         static <K, V> RORRCRCHIRCHHOOIHCCHRCHORHCICI.IHCRORHRORIICHRHRCHRRIRRHHOCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<K, V> ROOIIRCHICROOOCIHRHHRCRIOHCIHR() {
            return (RORRCRCHIRCHHOOIHCCHRCHORHCICI.IHCRORHRORIICHRHRCHRRIRRHHOCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<K, V>)OIIHOOOCRHCORHCIOORICCRRICRRRC;
         }

         @Override
         public RORRCRCHIRCHHOOIHCCHRCHORHCICI.IIRHCHHOICHRICOOCRORCCIOOIHOIR OOCRORCHRCHIRIHHRCRICOORIRCORI() {
            return RORRCRCHIRCHHOOIHCCHRCHORHCICI.IIRHCHHOICHRICOOCRORCCIOOIHOIR.WEAK;
         }

         @Override
         public RORRCRCHIRCHHOOIHCCHRCHORHCICI.IIRHCHHOICHRICOOCRORCCIOOIHOIR OCCHOHIOCCIHIHRCHIIHIRIICOHHIC() {
            return RORRCRCHIRCHHOOIHCCHRCHORHCICI.IIRHCHHOICHRICOOCRORCCIOOIHOIR.STRONG;
         }

         public RORRCRCHIRCHHOOIHCCHRCHORHCICI.ICICIOCHHHIHOCHCOHORIHRCOHHOCR<K, V> RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
            RORRCRCHIRCHHOOIHCCHRCHORHCICI<K, V, RORRCRCHIRCHHOOIHCCHRCHORHCICI.IHCRORHRORIICHRHRCHRRIRRHHOCOO<K, V>, RORRCRCHIRCHHOOIHCCHRCHORHCICI.ICICIOCHHHIHOCHCOHORIHRCOHHOCR<K, V>> var1,
            int var2,
            int var3
         ) {
            return new RORRCRCHIRCHHOOIHCCHRCHORHCICI.ICICIOCHHHIHOCHCOHORIHRCOHHOCR<>(var1, var2, var3);
         }

         public RORRCRCHIRCHHOOIHCCHRCHORHCICI.IHCRORHRORIICHRHRCHRRIRRHHOCOO<K, V> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            RORRCRCHIRCHHOOIHCCHRCHORHCICI.ICICIOCHHHIHOCHCOHORIHRCOHHOCR<K, V> var1,
            RORRCRCHIRCHHOOIHCCHRCHORHCICI.IHCRORHRORIICHRHRCHRRIRRHHOCOO<K, V> var2,
            RORRCRCHIRCHHOOIHCCHRCHORHCICI.@Nullable IHCRORHRORIICHRHRCHRRIRRHHOCOO<K, V> var3
         ) {
            return var2.getKey() == null ? null : var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.OICCIHICIIIRRRIIIROIOIHRIICICO, var3);
         }

         public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            RORRCRCHIRCHHOOIHCCHRCHORHCICI.ICICIOCHHHIHOCHCOHORIHRCOHHOCR<K, V> var1,
            RORRCRCHIRCHHOOIHCCHRCHORHCICI.IHCRORHRORIICHRHRCHRRIRRHHOCOO<K, V> var2,
            V var3
         ) {
            var2.setValue(var3);
         }

         public RORRCRCHIRCHHOOIHCCHRCHORHCICI.IHCRORHRORIICHRHRCHRRIRRHHOCOO<K, V> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            RORRCRCHIRCHHOOIHCCHRCHORHCICI.ICICIOCHHHIHOCHCOHORIHRCOHHOCR<K, V> var1,
            K var2,
            int var3,
            RORRCRCHIRCHHOOIHCCHRCHORHCICI.@Nullable IHCRORHRORIICHRHRCHRRIRRHHOCOO<K, V> var4
         ) {
            return new RORRCRCHIRCHHOOIHCCHRCHORHCICI.IHCRORHRORIICHRHRCHRRIRRHHOCOO<>(var1.OICCIHICIIIRRRIIIROIOIHRIICICO, (K)var2, var3, var4);
         }
      }
   }

   private static final class IHHCHHHCRIHOOCOIOOCRIIICIOROIR<K, V> extends RORRCRCHIRCHHOOIHCCHRCHORHCICI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<K, V> {
      private static final long HIHOROORCIROHIRRIRHIOIHRCOORHH = 3L;

      IHHCHHHCRIHOOCOIOOCRIIICIOROIR(
         RORRCRCHIRCHHOOIHCCHRCHORHCICI.IIRHCHHOICHRICOOCRORCCIOOIHOIR var1,
         RORRCRCHIRCHHOOIHCCHRCHORHCICI.IIRHCHHOICHRICOOCRORCCIOOIHOIR var2,
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IIHRRHORCRCROCHHOHORCHCROCIHRO<Object> var3,
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IIHRRHORCRCROCHHOHORCHCROCIHRO<Object> var4,
         int var5,
         ConcurrentMap<K, V> var6
      ) {
         super(var1, var2, var3, var4, var5, var6);
      }

      private void writeObject(ObjectOutputStream var1) {
         var1.defaultWriteObject();
         this.writeMapTo(var1);
      }

      private void readObject(ObjectInputStream var1) {
         var1.defaultReadObject();
         HCHOOCHIOICRRHHIHHHICIRCIOICRI var2 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1);
         this.delegate = var2.makeMap();
         this.readEntries(var1);
      }

      private Object readResolve() {
         return this.delegate;
      }
   }

   interface IHIRRIIORRHORHRORIHOROIRCORCOO<K, V, E extends RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR<K, V, E>>
      extends RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR<K, V, E> {
   }

   final class IIHRRHORCRCROCHHOHORCHCROCIHRO extends RORRCRCHIRCHHOOIHCCHRCHORHCICI.OCOHORHCROHICRRIHCIHHRRCIHICRI<K> {
      @Override
      public Iterator<K> iterator() {
         return RORRCRCHIRCHHOOIHCCHRCHORHCICI.this.new HICHRCOHCCRHOHCICOOCHOIHCCHIRI();
      }

      @Override
      public int size() {
         return RORRCRCHIRCHHOOIHCCHRCHORHCICI.this.size();
      }

      @Override
      public boolean isEmpty() {
         return RORRCRCHIRCHHOOIHCCHRCHORHCICI.this.isEmpty();
      }

      @Override
      public boolean contains(Object var1) {
         return RORRCRCHIRCHHOOIHCCHRCHORHCICI.this.containsKey(var1);
      }

      @Override
      public boolean remove(Object var1) {
         return RORRCRCHIRCHHOOIHCCHRCHORHCICI.this.remove(var1) != null;
      }

      @Override
      public void clear() {
         RORRCRCHIRCHHOOIHCCHRCHORHCICI.this.clear();
      }
   }

   enum IIRHCHHOICHRICOOCRORCCIOOIHOIR {
      STRONG {
         @Override
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IIHRRHORCRCROCHHOHORCHCROCIHRO<Object> defaultEquivalence() {
            return com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IIHRRHORCRCROCHHOHORCHCROCIHRO.CIROHOCCIIIOCHRRRCRRHIORRICIOR();
         }
      },
      WEAK {
         @Override
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IIHRRHORCRCROCHHOHORCHCROCIHRO<Object> defaultEquivalence() {
            return com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IIHRRHORCRCROCHHOHORCHCROCIHRO.OHCRHOHOICICOCCHCCHIHRRCICIHRR();
         }
      };

      IIRHCHHOICHRICOOCRORCCIOOIHOIR() {
      }

      abstract com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IIHRRHORCRCROCHHOHORCHCROCIHRO<Object> defaultEquivalence();
   }

   static final class IOHIHIIHCCCCCIHRORIOIOORCIOHII<K, V, E extends RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR<K, V, E>>
      extends WeakReference<V>
      implements RORRCRCHIRCHHOOIHCCHRCHORHCICI.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR<K, V, E> {
      @Weak
      final E IOICRHRHROICIOCHIHIRICHOIHRRCC;

      IOHIHIIHCCCCCIHRORIOIOORCIOHII(ReferenceQueue<V> var1, V var2, E var3) {
         super((V)var2, var1);
         this.IOICRHRHROICIOCHIHIRICHOIHRRCC = (E)var3;
      }

      @Override
      public E RCRRRICHIHCRORCHIHICHHHHRRIOHH() {
         return this.IOICRHRHROICIOCHIHIRICHOIHRRCC;
      }

      @Override
      public RORRCRCHIRCHHOOIHCCHRCHORHCICI.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR<K, V, E> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ReferenceQueue<V> var1, E var2) {
         return new RORRCRCHIRCHHOOIHCCHRCHORHCICI.IOHIHIIHCCCCCIHRORIOIOORCIOHII<>(var1, this.get(), (E)var2);
      }
   }

   final class IOIICIRIICICIIOORHCIIIIRRIHRHI extends RORRCRCHIRCHHOOIHCCHRCHORHCICI<K, V, E, S>.OOROOCCIRCCRHOIOIORIHCHHOOCCOR<V> {
      @Override
      public V next() {
         return this.RROHHICCIRROIIRRRIIIIOOHHOHCCR().getValue();
      }
   }

   abstract static class IRCIIHHICIHRCOCRROCOICRIHHCCHH<K, V, E extends RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR<K, V, E>>
      implements RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR<K, V, E> {
      final K ICCIRHORRICOOHORCOIHRIRCHRIOII;
      final int ICOIIRHCCOIOCHOIRCRRCOIRCROOIC;
      final @Nullable E OIICOHCRRRIIIRHOHHRCOIOCOHORRI;

      IRCIIHHICIHRCOCRROCOICRIHHCCHH(K var1, int var2, @Nullable E var3) {
         this.ICCIRHORRICOOHORCOIHRIRCHRIOII = (K)var1;
         this.ICOIIRHCCOIOCHOIRCRRCOIRCROOIC = var2;
         this.OIICOHCRRRIIIRHOHHRCOIOCOHORRI = (E)var3;
      }

      @Override
      public K getKey() {
         return this.ICCIRHORRICOOHORCOIHRIRCHRIOII;
      }

      @Override
      public int getHash() {
         return this.ICOIIRHCCOIOCHOIRCRRCOIRCROOIC;
      }

      @Override
      public E OIIRRHOROIOIROIHHIIHOIRHIHHHHR() {
         return this.OIICOHCRRRIIIRHOHHRCOIOCOHORRI;
      }
   }

   static final class IRCRRHRCIRHIHIHROHCRRHIIHHHHCH<K, V>
      extends RORRCRCHIRCHHOOIHCCHRCHORHCICI.HHCCIRHCCCIIRHCROHIORHIRHHIORH<K, V, RORRCRCHIRCHHOOIHCCHRCHORHCICI.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH<K, V>>
      implements RORRCRCHIRCHHOOIHCCHRCHORHCICI.OIHCOHRCICCCRHRCROOCIOIRRHHHIH<K, V, RORRCRCHIRCHHOOIHCCHRCHORHCICI.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH<K, V>> {
      private volatile RORRCRCHIRCHHOOIHCCHRCHORHCICI.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR<K, V, RORRCRCHIRCHHOOIHCCHRCHORHCICI.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH<K, V>> RHCRRIHHOICICCCROOOCHHROOHOOOO = RORRCRCHIRCHHOOIHCCHRCHORHCICI.CHRIRORHHHIHCHIOOCHRHORRORCRIH();

      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH(
         ReferenceQueue<K> var1, K var2, int var3, RORRCRCHIRCHHOOIHCCHRCHORHCICI.@Nullable IRCRRHRCIRHIHIHROHCRRHIIHHHHCH<K, V> var4
      ) {
         super(var1, (K)var2, var3, var4);
      }

      @Override
      public V getValue() {
         return this.RHCRRIHHOICICCCROOOCHHROOHOOOO.get();
      }

      RORRCRCHIRCHHOOIHCCHRCHORHCICI.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH<K, V> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         ReferenceQueue<K> var1, ReferenceQueue<V> var2, RORRCRCHIRCHHOOIHCCHRCHORHCICI.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH<K, V> var3
      ) {
         RORRCRCHIRCHHOOIHCCHRCHORHCICI.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH var4 = new RORRCRCHIRCHHOOIHCCHRCHORHCICI.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH(
            var1, this.getKey(), this.HHRCRROORHCHORCHHRHCIOCRHHROOI, var3
         );
         var4.RHCRRIHHOICICCCROOOCHHROOHOOOO = this.RHCRRIHHOICICCCROOOCHHROOHOOOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var4);
         return var4;
      }

      @Override
      public void clearValue() {
         this.RHCRRIHHOICICCCROOOCHHROOHOOOO.clear();
      }

      void setValue(V var1, ReferenceQueue<V> var2) {
         RORRCRCHIRCHHOOIHCCHRCHORHCICI.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR var3 = this.RHCRRIHHOICICCCROOOCHHROOHOOOO;
         this.RHCRRIHHOICICCCROOOCHHROOHOOOO = new RORRCRCHIRCHHOOIHCCHRCHORHCICI.IOHIHIIHCCCCCIHRORIOIOORCIOHII<>(var2, (V)var1, this);
         var3.clear();
      }

      @Override
      public RORRCRCHIRCHHOOIHCCHRCHORHCICI.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR<K, V, RORRCRCHIRCHHOOIHCCHRCHORHCICI.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH<K, V>> ICRHRCCRHRRRCCCOOCHIIRRIRHCCII() {
         return this.RHCRRIHHOICICCCROOOCHHROOHOOOO;
      }

      static final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<K, V>
         implements RORRCRCHIRCHHOOIHCCHRCHORHCICI.CRICCOOHHHCHOORCICOCOHIHOIRHOO<K, V, RORRCRCHIRCHHOOIHCCHRCHORHCICI.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH<K, V>, RORRCRCHIRCHHOOIHCCHRCHORHCICI.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<K, V>> {
         private static final RORRCRCHIRCHHOOIHCCHRCHORHCICI.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<?, ?> RORIRCCRORHOHIIIIRRHIHOHIIROHR = new RORRCRCHIRCHHOOIHCCHRCHORHCICI.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();

         static <K, V> RORRCRCHIRCHHOOIHCCHRCHORHCICI.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<K, V> RRHHHCOOICRIRCCCOIORIHIHRHROOO() {
            return (RORRCRCHIRCHHOOIHCCHRCHORHCICI.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<K, V>)RORIRCCRORHOHIIIIRRHIHOHIIROHR;
         }

         @Override
         public RORRCRCHIRCHHOOIHCCHRCHORHCICI.IIRHCHHOICHRICOOCRORCCIOOIHOIR OOCRORCHRCHIRIHHRCRICOORIRCORI() {
            return RORRCRCHIRCHHOOIHCCHRCHORHCICI.IIRHCHHOICHRICOOCRORCCIOOIHOIR.WEAK;
         }

         @Override
         public RORRCRCHIRCHHOOIHCCHRCHORHCICI.IIRHCHHOICHRICOOCRORCCIOOIHOIR OCCHOHIOCCIHIHRCHIIHIRIICOHHIC() {
            return RORRCRCHIRCHHOOIHCCHRCHORHCICI.IIRHCHHOICHRICOOCRORCCIOOIHOIR.WEAK;
         }

         public RORRCRCHIRCHHOOIHCCHRCHORHCICI.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<K, V> HRCHROOHRIHCRCRHRIIROCIRHOIRHH(
            RORRCRCHIRCHHOOIHCCHRCHORHCICI<K, V, RORRCRCHIRCHHOOIHCCHRCHORHCICI.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH<K, V>, RORRCRCHIRCHHOOIHCCHRCHORHCICI.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<K, V>> var1,
            int var2,
            int var3
         ) {
            return new RORRCRCHIRCHHOOIHCCHRCHORHCICI.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<>(var1, var2, var3);
         }

         public RORRCRCHIRCHHOOIHCCHRCHORHCICI.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH<K, V> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            RORRCRCHIRCHHOOIHCCHRCHORHCICI.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<K, V> var1,
            RORRCRCHIRCHHOOIHCCHRCHORHCICI.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH<K, V> var2,
            RORRCRCHIRCHHOOIHCCHRCHORHCICI.@Nullable IRCRRHRCIRHIHIHROHCRRHIIHHHHCH<K, V> var3
         ) {
            if (var2.getKey() == null) {
               return null;
            } else {
               return RORRCRCHIRCHHOOIHCCHRCHORHCICI.CIOHHCORHRCCRICCCORIHCRHCCCRRR.CRICCOOHHHCHOORCICOCOHIHOIRHOO(var2)
                  ? null
                  : var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.HRHIHRCIIRHIIOCOIOHOOOCIIORIRH, var1.HRCOOOICIOIHHRCOCCRCHICHRCICRC, var3);
            }
         }

         public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            RORRCRCHIRCHHOOIHCCHRCHORHCICI.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<K, V> var1,
            RORRCRCHIRCHHOOIHCCHRCHORHCICI.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH<K, V> var2,
            V var3
         ) {
            var2.setValue(var3, var1.HRCOOOICIOIHHRCOCCRCHICHRCICRC);
         }

         public RORRCRCHIRCHHOOIHCCHRCHORHCICI.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH<K, V> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            RORRCRCHIRCHHOOIHCCHRCHORHCICI.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<K, V> var1,
            K var2,
            int var3,
            RORRCRCHIRCHHOOIHCCHRCHORHCICI.@Nullable IRCRRHRCIRHIHIHROHCRRHIIHHHHCH<K, V> var4
         ) {
            return new RORRCRCHIRCHHOOIHCCHRCHORHCICI.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH<>(var1.HRHIHRCIIRHIIOCOIOHOOOCIIORIRH, (K)var2, var3, var4);
         }
      }
   }

   static final class IRRCCOICORICIHCHRHIHIHROIRHOCR<K, V>
      extends RORRCRCHIRCHHOOIHCCHRCHORHCICI.IRCIIHHICIHRCOCRROCOICRIHHCCHH<K, V, RORRCRCHIRCHHOOIHCCHRCHORHCICI.IRRCCOICORICIHCHRHIHIHROIRHOCR<K, V>>
      implements RORRCRCHIRCHHOOIHCCHRCHORHCICI.IHIRRIIORRHORHRORIHOROIRCORCOO<K, V, RORRCRCHIRCHHOOIHCCHRCHORHCICI.IRRCCOICORICIHCHRHIHIHROIRHOCR<K, V>> {
      private volatile @Nullable V value = (V)null;

      IRRCCOICORICIHCHRHIHIHROIRHOCR(K var1, int var2, RORRCRCHIRCHHOOIHCCHRCHORHCICI.@Nullable IRRCCOICORICIHCHRHIHIHROIRHOCR<K, V> var3) {
         super((K)var1, var2, var3);
      }

      @Override
      public @Nullable V getValue() {
         return this.value;
      }

      void setValue(V var1) {
         this.value = (V)var1;
      }

      RORRCRCHIRCHHOOIHCCHRCHORHCICI.IRRCCOICORICIHCHRHIHIHROIRHOCR<K, V> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         RORRCRCHIRCHHOOIHCCHRCHORHCICI.IRRCCOICORICIHCHRHIHIHROIRHOCR<K, V> var1
      ) {
         RORRCRCHIRCHHOOIHCCHRCHORHCICI.IRRCCOICORICIHCHRHIHIHROIRHOCR var2 = new RORRCRCHIRCHHOOIHCCHRCHORHCICI.IRRCCOICORICIHCHRHIHIHROIRHOCR(
            this.ICCIRHORRICOOHORCOIHRIRCHRIOII, this.ICOIIRHCCOIOCHOIRCRRCOIRCROOIC, var1
         );
         var2.value = this.value;
         return var2;
      }

      static final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<K, V>
         implements RORRCRCHIRCHHOOIHCCHRCHORHCICI.CRICCOOHHHCHOORCICOCOHIHOIRHOO<K, V, RORRCRCHIRCHHOOIHCCHRCHORHCICI.IRRCCOICORICIHCHRHIHIHROIRHOCR<K, V>, RORRCRCHIRCHHOOIHCCHRCHORHCICI.RICRIRRCOHRCOCRRHHCRHRROOIOHHR<K, V>> {
         private static final RORRCRCHIRCHHOOIHCCHRCHORHCICI.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<?, ?> OIRHHCIHICHOIRRICCCRCICIHOOICC = new RORRCRCHIRCHHOOIHCCHRCHORHCICI.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();

         static <K, V> RORRCRCHIRCHHOOIHCCHRCHORHCICI.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<K, V> HHORRCOCICICROIIIOCCRIOIHIIROH() {
            return (RORRCRCHIRCHHOOIHCCHRCHORHCICI.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<K, V>)OIRHHCIHICHOIRRICCCRCICIHOOICC;
         }

         @Override
         public RORRCRCHIRCHHOOIHCCHRCHORHCICI.IIRHCHHOICHRICOOCRORCCIOOIHOIR OOCRORCHRCHIRIHHRCRICOORIRCORI() {
            return RORRCRCHIRCHHOOIHCCHRCHORHCICI.IIRHCHHOICHRICOOCRORCCIOOIHOIR.STRONG;
         }

         @Override
         public RORRCRCHIRCHHOOIHCCHRCHORHCICI.IIRHCHHOICHRICOOCRORCCIOOIHOIR OCCHOHIOCCIHIHRCHIIHIRIICOHHIC() {
            return RORRCRCHIRCHHOOIHCCHRCHORHCICI.IIRHCHHOICHRICOOCRORCCIOOIHOIR.STRONG;
         }

         public RORRCRCHIRCHHOOIHCCHRCHORHCICI.RICRIRRCOHRCOCRRHHCRHRROOIOHHR<K, V> HHCCIRHCCCIIRHCROHIORHIRHHIORH(
            RORRCRCHIRCHHOOIHCCHRCHORHCICI<K, V, RORRCRCHIRCHHOOIHCCHRCHORHCICI.IRRCCOICORICIHCHRHIHIHROIRHOCR<K, V>, RORRCRCHIRCHHOOIHCCHRCHORHCICI.RICRIRRCOHRCOCRRHHCRHRROOIOHHR<K, V>> var1,
            int var2,
            int var3
         ) {
            return new RORRCRCHIRCHHOOIHCCHRCHORHCICI.RICRIRRCOHRCOCRRHHCRHRROOIOHHR<>(var1, var2, var3);
         }

         public RORRCRCHIRCHHOOIHCCHRCHORHCICI.IRRCCOICORICIHCHRHIHIHROIRHOCR<K, V> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            RORRCRCHIRCHHOOIHCCHRCHORHCICI.RICRIRRCOHRCOCRRHHCRHRROOIOHHR<K, V> var1,
            RORRCRCHIRCHHOOIHCCHRCHORHCICI.IRRCCOICORICIHCHRHIHIHROIRHOCR<K, V> var2,
            RORRCRCHIRCHHOOIHCCHRCHORHCICI.@Nullable IRRCCOICORICIHCHRHIHIHROIRHOCR<K, V> var3
         ) {
            return var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3);
         }

         public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            RORRCRCHIRCHHOOIHCCHRCHORHCICI.RICRIRRCOHRCOCRRHHCRHRROOIOHHR<K, V> var1,
            RORRCRCHIRCHHOOIHCCHRCHORHCICI.IRRCCOICORICIHCHRHIHIHROIRHOCR<K, V> var2,
            V var3
         ) {
            var2.setValue(var3);
         }

         public RORRCRCHIRCHHOOIHCCHRCHORHCICI.IRRCCOICORICIHCHRHIHIHROIRHOCR<K, V> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            RORRCRCHIRCHHOOIHCCHRCHORHCICI.RICRIRRCOHRCOCRRHHCRHRROOIOHHR<K, V> var1,
            K var2,
            int var3,
            RORRCRCHIRCHHOOIHCCHRCHORHCICI.@Nullable IRRCCOICORICIHCHRHIHIHROIRHOCR<K, V> var4
         ) {
            return new RORRCRCHIRCHHOOIHCCHRCHORHCICI.IRRCCOICORICIHCHRHIHIHROIRHOCR<>((K)var2, var3, var4);
         }
      }
   }

   private abstract static class OCOHORHCROHICRRIHCIHHRRCIHICRI<E> extends AbstractSet<E> {
      private OCOHORHCROHICRRIHCIHHRRCIHICRI() {
      }

      @Override
      public Object[] toArray() {
         return RORRCRCHIRCHHOOIHCCHRCHORHCICI.toArrayList(this).toArray();
      }

      @Override
      public <T> T[] toArray(T[] var1) {
         return (T[])RORRCRCHIRCHHOOIHCCHRCHORHCICI.toArrayList(this).toArray(var1);
      }
   }

   static final class OHHRIOHROOIHOROCIRHCHORIHRRRRI<K>
      extends RORRCRCHIRCHHOOIHCCHRCHORHCICI.IRCIIHHICIHRCOCRROCOICRIHHCCHH<K, HCHOOCHIOICRRHHIHHHICIRCIOICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH, RORRCRCHIRCHHOOIHCCHRCHORHCICI.OHHRIOHROOIHOROCIRHCHORIHRRRRI<K>>
      implements RORRCRCHIRCHHOOIHCCHRCHORHCICI.IHIRRIIORRHORHRORIHOROIRCORCOO<K, HCHOOCHIOICRRHHIHHHICIRCIOICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH, RORRCRCHIRCHHOOIHCCHRCHORHCICI.OHHRIOHROOIHOROCIRHCHORIHRRRRI<K>> {
      OHHRIOHROOIHOROCIRHCHORIHRRRRI(K var1, int var2, RORRCRCHIRCHHOOIHCCHRCHORHCICI.@Nullable OHHRIOHROOIHOROCIRHCHORIHRRRRI<K> var3) {
         super((K)var1, var2, var3);
      }

      public HCHOOCHIOICRRHHIHHHICIRCIOICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH ICRRICHIOOICRCOCRIOIOHIIOOOHIC() {
         return HCHOOCHIOICRRHHIHHHICIRCIOICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.VALUE;
      }

      void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HCHOOCHIOICRRHHIHHHICIRCIOICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      }

      RORRCRCHIRCHHOOIHCCHRCHORHCICI.OHHRIOHROOIHOROCIRHCHORIHRRRRI<K> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         RORRCRCHIRCHHOOIHCCHRCHORHCICI.OHHRIOHROOIHOROCIRHCHORIHRRRRI<K> var1
      ) {
         return new RORRCRCHIRCHHOOIHCCHRCHORHCICI.OHHRIOHROOIHOROCIRHCHORIHRRRRI<>(
            this.ICCIRHORRICOOHORCOIHRIRCHRIOII, this.ICOIIRHCCOIOCHOIRCRRCOIRCROOIC, var1
         );
      }

      static final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<K>
         implements RORRCRCHIRCHHOOIHCCHRCHORHCICI.CRICCOOHHHCHOORCICOCOHIHOIRHOO<K, HCHOOCHIOICRRHHIHHHICIRCIOICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH, RORRCRCHIRCHHOOIHCCHRCHORHCICI.OHHRIOHROOIHOROCIRHCHORIHRRRRI<K>, RORRCRCHIRCHHOOIHCCHRCHORHCICI.RHOCHHIRRCHHHOHOIRROIROHHHIHIO<K>> {
         private static final RORRCRCHIRCHHOOIHCCHRCHORHCICI.OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<?> IRCHCCOCCRHHCCRCIHRRHOHCRICICH = new RORRCRCHIRCHHOOIHCCHRCHORHCICI.OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();

         static <K> RORRCRCHIRCHHOOIHCCHRCHORHCICI.OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<K> HROOHCIOOHHOROOCIOROIRCCOOHOOR() {
            return (RORRCRCHIRCHHOOIHCCHRCHORHCICI.OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<K>)IRCHCCOCCRHHCCRCIHRRHOHCRICICH;
         }

         @Override
         public RORRCRCHIRCHHOOIHCCHRCHORHCICI.IIRHCHHOICHRICOOCRORCCIOOIHOIR OOCRORCHRCHIRIHHRCRICOORIRCORI() {
            return RORRCRCHIRCHHOOIHCCHRCHORHCICI.IIRHCHHOICHRICOOCRORCCIOOIHOIR.STRONG;
         }

         @Override
         public RORRCRCHIRCHHOOIHCCHRCHORHCICI.IIRHCHHOICHRICOOCRORCCIOOIHOIR OCCHOHIOCCIHIHRCHIIHIRIICOHHIC() {
            return RORRCRCHIRCHHOOIHCCHRCHORHCICI.IIRHCHHOICHRICOOCRORCCIOOIHOIR.STRONG;
         }

         public RORRCRCHIRCHHOOIHCCHRCHORHCICI.RHOCHHIRRCHHHOHOIRROIROHHHIHIO<K> IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            RORRCRCHIRCHHOOIHCCHRCHORHCICI<K, HCHOOCHIOICRRHHIHHHICIRCIOICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH, RORRCRCHIRCHHOOIHCCHRCHORHCICI.OHHRIOHROOIHOROCIRHCHORIHRRRRI<K>, RORRCRCHIRCHHOOIHCCHRCHORHCICI.RHOCHHIRRCHHHOHOIRROIROHHHIHIO<K>> var1,
            int var2,
            int var3
         ) {
            return new RORRCRCHIRCHHOOIHCCHRCHORHCICI.RHOCHHIRRCHHHOHOIRROIROHHHIHIO<>(var1, var2, var3);
         }

         public RORRCRCHIRCHHOOIHCCHRCHORHCICI.OHHRIOHROOIHOROCIRHCHORIHRRRRI<K> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            RORRCRCHIRCHHOOIHCCHRCHORHCICI.RHOCHHIRRCHHHOHOIRROIROHHHIHIO<K> var1,
            RORRCRCHIRCHHOOIHCCHRCHORHCICI.OHHRIOHROOIHOROCIRHCHORIHRRRRI<K> var2,
            RORRCRCHIRCHHOOIHCCHRCHORHCICI.@Nullable OHHRIOHROOIHOROCIRHCHORIHRRRRI<K> var3
         ) {
            return var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3);
         }

         public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            RORRCRCHIRCHHOOIHCCHRCHORHCICI.RHOCHHIRRCHHHOHOIRROIROHHHIHIO<K> var1,
            RORRCRCHIRCHHOOIHCCHRCHORHCICI.OHHRIOHROOIHOROCIRHCHORIHRRRRI<K> var2,
            HCHOOCHIOICRRHHIHHHICIRCIOICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3
         ) {
         }

         public RORRCRCHIRCHHOOIHCCHRCHORHCICI.OHHRIOHROOIHOROCIRHCHORIHRRRRI<K> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            RORRCRCHIRCHHOOIHCCHRCHORHCICI.RHOCHHIRRCHHHOHOIRROIROHHHIHIO<K> var1,
            K var2,
            int var3,
            RORRCRCHIRCHHOOIHCCHRCHORHCICI.@Nullable OHHRIOHROOIHOROCIRHCHORIHRRRRI<K> var4
         ) {
            return new RORRCRCHIRCHHOOIHCCHRCHORHCICI.OHHRIOHROOIHOROCIRHCHORIHRRRRI<>((K)var2, var3, var4);
         }
      }
   }

   interface OIHCOHRCICCCRHRCROOCIOIRRHHHIH<K, V, E extends RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR<K, V, E>>
      extends RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR<K, V, E> {
      RORRCRCHIRCHHOOIHCCHRCHORHCICI.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR<K, V, E> ICRHRCCRHRRRCCCOOCHIIRRIRHCCII();

      void clearValue();
   }

   abstract class OOROOCCIRCCRHOIOIORIHCHHOOCCOR<T> implements Iterator<T> {
      int nextSegmentIndex = RORRCRCHIRCHHOOIHCCHRCHORHCICI.this.HCHOOIRHHOHRIHRRROHOHRRIIHICOC.length - 1;
      int nextTableIndex = -1;
      RORRCRCHIRCHHOOIHCCHRCHORHCICI.@Nullable CIOHHCORHRCCRICCCORIHCRHCCCRRR<K, V, E, S> OICRRCCCHHCRCCRRHOOOIORCHHIIRC;
      @Nullable AtomicReferenceArray<E> currentTable;
      RORRCRCHIRCHHOOIHCCHRCHORHCICI.@Nullable CORCOCICIRIOHROHROIIOOHICCHCRR ORHCHCIOHRCHICCOOOCOCRHOHOHHCC;
      RORRCRCHIRCHHOOIHCCHRCHORHCICI.@Nullable RCIROOOOICRHCCRRCIORHHIRCOIIIC RIHHOCCORHORRRCORCCRIRHHICRHRI;
      RORRCRCHIRCHHOOIHCCHRCHORHCICI.@Nullable RCIROOOOICRHCCRRCIORHHIRCOIIIC OCORIHIICCIICOROHROOIOHOROORIR;

      OOROOCCIRCCRHOIOIORIHCHHOOCCOR() {
         this.IRIHHIOCRIIIHHCROOOICIOICCCHOI();
      }

      @Override
      public abstract T next();

      final void IRIHHIOCRIIIHHCROOOICIOICCCHOI() {
         this.RIHHOCCORHORRRCORCCRIRHHICRHRI = null;
         if (!this.nextInChain()) {
            if (!this.nextInTable()) {
               while (this.nextSegmentIndex >= 0) {
                  this.OICRRCCCHHCRCCRRHOOOIORCHHIIRC = RORRCRCHIRCHHOOIHCCHRCHORHCICI.this.HCHOOIRHHOHRIHRRROHOHRRIIHICOC[this.nextSegmentIndex--];
                  if (this.OICRRCCCHHCRCCRRHOOOIORCHHIIRC.count != 0) {
                     this.currentTable = this.OICRRCCCHHCRCCRRHOOOIORCHHIIRC.table;
                     this.nextTableIndex = this.currentTable.length() - 1;
                     if (this.nextInTable()) {
                        return;
                     }
                  }
               }
            }
         }
      }

      boolean nextInChain() {
         if (this.ORHCHCIOHRCHICCOOOCOCRHOHOHHCC != null) {
            for (this.ORHCHCIOHRCHICCOOOCOCRHOHOHHCC = this.ORHCHCIOHRCHICCOOOCOCRHOHOHHCC.OIIRRHOROIOIROIHHIIHOIRHIHHHHR();
               this.ORHCHCIOHRCHICCOOOCOCRHOHOHHCC != null;
               this.ORHCHCIOHRCHICCOOOCOCRHOHOHHCC = this.ORHCHCIOHRCHICCOOOCOCRHOHOHHCC.OIIRRHOROIOIROIHHIIHOIRHIHHHHR()
            ) {
               if (this.CRRRICCRROCOHHOHIICIHORCOORRRH((E)this.ORHCHCIOHRCHICCOOOCOCRHOHOHHCC)) {
                  return true;
               }
            }
         }

         return false;
      }

      boolean nextInTable() {
         while (this.nextTableIndex >= 0) {
            if ((this.ORHCHCIOHRCHICCOOOCOCRHOHOHHCC = this.currentTable.get(this.nextTableIndex--)) != null
               && (this.CRRRICCRROCOHHOHIICIHORCOORRRH((E)this.ORHCHCIOHRCHICCOOOCOCRHOHOHHCC) || this.nextInChain())) {
               return true;
            }
         }

         return false;
      }

      boolean CRRRICCRROCOHHOHIICIHORCOORRRH(E var1) {
         try {
            Object var2 = var1.getKey();
            Object var3 = RORRCRCHIRCHHOOIHCCHRCHORHCICI.this.HHCCIRHCCCIIRHCROHIORHIRHHIORH((E)var1);
            if (var3 != null) {
               this.RIHHOCCORHORRRCORCCRIRHHICRHRI = RORRCRCHIRCHHOOIHCCHRCHORHCICI.this.new RCIROOOOICRHCCRRCIORHHIRCOIIIC(var2, var3);
               return true;
            } else {
               return false;
            }
         } finally {
            this.OICRRCCCHHCRCCRRHOOOIORCHHIIRC.postReadCleanup();
         }
      }

      @Override
      public boolean hasNext() {
         return this.RIHHOCCORHORRRCORCCRIRHHICRHRI != null;
      }

      RORRCRCHIRCHHOOIHCCHRCHORHCICI<K, V, E, S>.RCIROOOOICRHCCRRCIORHHIRCOIIIC RROHHICCIRROIIRRRIIIIOOHHOHCCR() {
         if (this.RIHHOCCORHORRRCORCCRIRHHICRHRI == null) {
            throw new NoSuchElementException();
         }

         this.OCORIHIICCIICOROHROOIOHOROORIR = this.RIHHOCCORHORRRCORCCRIRHHICRHRI;
         this.IRIHHIOCRIIIHHCROOOICIOICCCHOI();
         return this.OCORIHIICCIICOROHROOIOHOROORIR;
      }

      @Override
      public void remove() {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.ICICIOCHHHIHOCHCOHORIHRCOHHOCR.checkRemove(
            this.OCORIHIICCIICOROHROOIOHOROORIR != null
         );
         RORRCRCHIRCHHOOIHCCHRCHORHCICI.this.remove(this.OCORIHIICCIICOROHROOIOHOROORIR.getKey());
         this.OCORIHIICCIICOROHROOIOHOROORIR = null;
      }
   }

   static final class ORHIOICIOCRRHOOCOHRORIHICHRCRR<K>
      extends RORRCRCHIRCHHOOIHCCHRCHORHCICI.HHCCIRHCCCIIRHCROHIORHIRHHIORH<K, HCHOOCHIOICRRHHIHHHICIRCIOICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH, RORRCRCHIRCHHOOIHCCHRCHORHCICI.ORHIOICIOCRRHOOCOHRORIHICHRCRR<K>>
      implements RORRCRCHIRCHHOOIHCCHRCHORHCICI.IHIRRIIORRHORHRORIHOROIRCORCOO<K, HCHOOCHIOICRRHHIHHHICIRCIOICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH, RORRCRCHIRCHHOOIHCCHRCHORHCICI.ORHIOICIOCRRHOOCOHRORIHICHRCRR<K>> {
      ORHIOICIOCRRHOOCOHRORIHICHRCRR(ReferenceQueue<K> var1, K var2, int var3, RORRCRCHIRCHHOOIHCCHRCHORHCICI.@Nullable ORHIOICIOCRRHOOCOHRORIHICHRCRR<K> var4) {
         super(var1, (K)var2, var3, var4);
      }

      public HCHOOCHIOICRRHHIHHHICIRCIOICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH ICRRICHIOOICRCOCRIOIOHIIOOOHIC() {
         return HCHOOCHIOICRRHHIHHHICIRCIOICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.VALUE;
      }

      void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HCHOOCHIOICRRHHIHHHICIRCIOICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      }

      RORRCRCHIRCHHOOIHCCHRCHORHCICI.ORHIOICIOCRRHOOCOHRORIHICHRCRR<K> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         ReferenceQueue<K> var1, RORRCRCHIRCHHOOIHCCHRCHORHCICI.ORHIOICIOCRRHOOCOHRORIHICHRCRR<K> var2
      ) {
         return new RORRCRCHIRCHHOOIHCCHRCHORHCICI.ORHIOICIOCRRHOOCOHRORIHICHRCRR<>(var1, this.getKey(), this.HHRCRROORHCHORCHHRHCIOCRHHROOI, var2);
      }

      static final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<K>
         implements RORRCRCHIRCHHOOIHCCHRCHORHCICI.CRICCOOHHHCHOORCICOCOHIHOIRHOO<K, HCHOOCHIOICRRHHIHHHICIRCIOICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH, RORRCRCHIRCHHOOIHCCHRCHORHCICI.ORHIOICIOCRRHOOCOHRORIHICHRCRR<K>, RORRCRCHIRCHHOOIHCCHRCHORHCICI.RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO<K>> {
         private static final RORRCRCHIRCHHOOIHCCHRCHORHCICI.ORHIOICIOCRRHOOCOHRORIHICHRCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<?> HIIRROCOHOCCOIRCOHHCRIHCIIORHH = new RORRCRCHIRCHHOOIHCCHRCHORHCICI.ORHIOICIOCRRHOOCOHRORIHICHRCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();

         static <K> RORRCRCHIRCHHOOIHCCHRCHORHCICI.ORHIOICIOCRRHOOCOHRORIHICHRCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<K> CICORHRHIOCOOCCICRICHOOCROIHRH() {
            return (RORRCRCHIRCHHOOIHCCHRCHORHCICI.ORHIOICIOCRRHOOCOHRORIHICHRCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<K>)HIIRROCOHOCCOIRCOHHCRIHCIIORHH;
         }

         @Override
         public RORRCRCHIRCHHOOIHCCHRCHORHCICI.IIRHCHHOICHRICOOCRORCCIOOIHOIR OOCRORCHRCHIRIHHRCRICOORIRCORI() {
            return RORRCRCHIRCHHOOIHCCHRCHORHCICI.IIRHCHHOICHRICOOCRORCCIOOIHOIR.WEAK;
         }

         @Override
         public RORRCRCHIRCHHOOIHCCHRCHORHCICI.IIRHCHHOICHRICOOCRORCCIOOIHOIR OCCHOHIOCCIHIHRCHIIHIRIICOHHIC() {
            return RORRCRCHIRCHHOOIHCCHRCHORHCICI.IIRHCHHOICHRICOOCRORCCIOOIHOIR.STRONG;
         }

         public RORRCRCHIRCHHOOIHCCHRCHORHCICI.RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO<K> RRCRRCORICCHOHHIRCHIROOHIIOHCO(
            RORRCRCHIRCHHOOIHCCHRCHORHCICI<K, HCHOOCHIOICRRHHIHHHICIRCIOICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH, RORRCRCHIRCHHOOIHCCHRCHORHCICI.ORHIOICIOCRRHOOCOHRORIHICHRCRR<K>, RORRCRCHIRCHHOOIHCCHRCHORHCICI.RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO<K>> var1,
            int var2,
            int var3
         ) {
            return new RORRCRCHIRCHHOOIHCCHRCHORHCICI.RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO<>(var1, var2, var3);
         }

         public RORRCRCHIRCHHOOIHCCHRCHORHCICI.ORHIOICIOCRRHOOCOHRORIHICHRCRR<K> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            RORRCRCHIRCHHOOIHCCHRCHORHCICI.RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO<K> var1,
            RORRCRCHIRCHHOOIHCCHRCHORHCICI.ORHIOICIOCRRHOOCOHRORIHICHRCRR<K> var2,
            RORRCRCHIRCHHOOIHCCHRCHORHCICI.@Nullable ORHIOICIOCRRHOOCOHRORIHICHRCRR<K> var3
         ) {
            return var2.getKey() == null ? null : var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.IIOHCCCHRRIHHRHROIRHIHIIIRHCCI, var3);
         }

         public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            RORRCRCHIRCHHOOIHCCHRCHORHCICI.RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO<K> var1,
            RORRCRCHIRCHHOOIHCCHRCHORHCICI.ORHIOICIOCRRHOOCOHRORIHICHRCRR<K> var2,
            HCHOOCHIOICRRHHIHHHICIRCIOICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3
         ) {
         }

         public RORRCRCHIRCHHOOIHCCHRCHORHCICI.ORHIOICIOCRRHOOCOHRORIHICHRCRR<K> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            RORRCRCHIRCHHOOIHCCHRCHORHCICI.RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO<K> var1,
            K var2,
            int var3,
            RORRCRCHIRCHHOOIHCCHRCHORHCICI.@Nullable ORHIOICIOCRRHOOCOHRORIHICHRCRR<K> var4
         ) {
            return new RORRCRCHIRCHHOOIHCCHRCHORHCICI.ORHIOICIOCRRHOOCOHRORIHICHRCRR<>(var1.IIOHCCCHRRIHHRHROIRHIHIIIRHCCI, (K)var2, var3, var4);
         }
      }
   }

   final class RCIROOOOICRHCCRRCIORHHIRCOIIIC
      extends com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH<K, V> {
      final Object CCHOIIHCHICOROCCICOCIRHHCRIHIO;
      Object value;

      RCIROOOOICRHCCRRCIORHHIRCOIIIC(K var2, V var3) {
         this.CCHOIIHCHICOROCCICOCIRHHCRIHIO = var2;
         this.value = var3;
      }

      @Override
      public K getKey() {
         return (K)this.CCHOIIHCHICOROCCICOCIRHHCRIHIO;
      }

      @Override
      public V getValue() {
         return (V)this.value;
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         if (!(var1 instanceof Entry)) {
            return false;
         }

         Entry var2 = (Entry)var1;
         return this.CCHOIIHCHICOROCCICOCIRHHCRIHIO.equals(var2.getKey()) && this.value.equals(var2.getValue());
      }

      @Override
      public int hashCode() {
         return this.CCHOIIHCHICOROCCICOCIRHHCRIHIO.hashCode() ^ this.value.hashCode();
      }

      @Override
      public V setValue(V var1) {
         Object var2 = RORRCRCHIRCHHOOIHCCHRCHORHCICI.this.put((K)this.CCHOIIHCHICOROCCICOCIRHHCRIHIO, (V)var1);
         this.value = var1;
         return (V)var2;
      }
   }

   abstract static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<K, V> extends OCIROOIHIHRHOCCHIIIROOCRIIOCRR<K, V> implements Serializable {
      private static final long CIOHIHRIHCCRCHCHOOORHHRICIHCOR = 3L;
      final RORRCRCHIRCHHOOIHCCHRCHORHCICI.IIRHCHHOICHRICOOCRORCCIOOIHOIR RRHROCOCHHCHOCHORCIHIRHRIIRRHO;
      final RORRCRCHIRCHHOOIHCCHRCHORHCICI.IIRHCHHOICHRICOOCRORCCIOOIHOIR IHIRIIRHRIORHCIOHRCHOIOCICCIIC;
      final com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IIHRRHORCRCROCHHOHORCHCROCIHRO<Object> RIOICORIHICIHRICORCOCCRRIROIIH;
      final com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IIHRRHORCRCROCHHOHORCHCROCIHRO<Object> OCRIRCCROHICHIOOCOIRICIRRIIIRO;
      final int COOOHHHOOROIIIHICOHCHOCCIROHOI;
      transient ConcurrentMap<K, V> delegate;

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         RORRCRCHIRCHHOOIHCCHRCHORHCICI.IIRHCHHOICHRICOOCRORCCIOOIHOIR var1,
         RORRCRCHIRCHHOOIHCCHRCHORHCICI.IIRHCHHOICHRICOOCRORCCIOOIHOIR var2,
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IIHRRHORCRCROCHHOHORCHCROCIHRO<Object> var3,
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IIHRRHORCRCROCHHOHORCHCROCIHRO<Object> var4,
         int var5,
         ConcurrentMap<K, V> var6
      ) {
         this.RRHROCOCHHCHOCHORCIHIRHRIIRRHO = var1;
         this.IHIRIIRHRIORHCIOHRCHOIOCICCIIC = var2;
         this.RIOICORIHICIHRICORCOCCRRIROIIH = var3;
         this.OCRIRCCROHICHIOOCOIRICIRRIIIRO = var4;
         this.COOOHHHOOROIIIHICOHCHOCCIROHOI = var5;
         this.delegate = var6;
      }

      @Override
      protected ConcurrentMap<K, V> delegate() {
         return this.delegate;
      }

      void writeMapTo(ObjectOutputStream var1) {
         var1.writeInt(this.delegate.size());

         for (Entry var3 : this.delegate.entrySet()) {
            var1.writeObject(var3.getKey());
            var1.writeObject(var3.getValue());
         }

         var1.writeObject(null);
      }

      HCHOOCHIOICRRHHIHHHICIRCIOICRI RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ObjectInputStream var1) {
         int var2 = var1.readInt();
         return new HCHOOCHIOICRRHHIHHHICIRCIOICRI()
            .COCOCIOICRORHCCRIORHCCIHIROIOO(var2)
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.RRHROCOCHHCHOCHORCIHIRHRIIRRHO)
            .IRCIIHHICIHRCOCRROCOICRIHHCCHH(this.IHIRIIRHRIORHCIOHRCHOIOCICCIIC)
            .HHCCIRHCCCIIRHCROHIORHIRHHIORH(this.RIOICORIHICIHRICORCOCCRRIROIIH)
            .RCCRRHHIOCHHHHOOOCIOHHIHHOIHCI(this.COOOHHHOOROIIIHICOHCHOCCIROHOI);
      }

      void readEntries(ObjectInputStream var1) {
         while (true) {
            Object var2 = var1.readObject();
            if (var2 == null) {
               return;
            }

            Object var3 = var1.readObject();
            this.delegate.put((K)var2, (V)var3);
         }
      }
   }

   static final class RHOCHHIRRCHHHOHOIRROIROHHHIHIO<K>
      extends RORRCRCHIRCHHOOIHCCHRCHORHCICI.CIOHHCORHRCCRICCCORIHCRHCCCRRR<K, HCHOOCHIOICRRHHIHHHICIRCIOICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH, RORRCRCHIRCHHOOIHCCHRCHORHCICI.OHHRIOHROOIHOROCIRHCHORIHRRRRI<K>, RORRCRCHIRCHHOOIHCCHRCHORHCICI.RHOCHHIRRCHHHOHOIRROIROHHHIHIO<K>> {
      RHOCHHIRRCHHHOHOIRROIROHHHIHIO(
         RORRCRCHIRCHHOOIHCCHRCHORHCICI<K, HCHOOCHIOICRRHHIHHHICIRCIOICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH, RORRCRCHIRCHHOOIHCCHRCHORHCICI.OHHRIOHROOIHOROCIRHCHORIHRRRRI<K>, RORRCRCHIRCHHOOIHCCHRCHORHCICI.RHOCHHIRRCHHHOHOIRROIROHHHIHIO<K>> var1,
         int var2,
         int var3
      ) {
         super(var1, var2, var3);
      }

      RORRCRCHIRCHHOOIHCCHRCHORHCICI.RHOCHHIRRCHHHOHOIRROIROHHHIHIO<K> ORIRHHIOIHRHCOHIIIIHRRROIOICRC() {
         return this;
      }

      public RORRCRCHIRCHHOOIHCCHRCHORHCICI.OHHRIOHROOIHOROCIRHCHORIHRRRRI<K> HICHRCOHCCRHOHCICOOCHOIHCCHIRI(
         RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR<K, HCHOOCHIOICRRHHIHHHICIRCIOICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH, ?> var1
      ) {
         return (RORRCRCHIRCHHOOIHCCHRCHORHCICI.OHHRIOHROOIHOROCIRHCHORIHRRRRI<K>)var1;
      }
   }

   static final class RICRIRRCOHRCOCRRHHCRHRROOIOHHR<K, V>
      extends RORRCRCHIRCHHOOIHCCHRCHORHCICI.CIOHHCORHRCCRICCCORIHCRHCCCRRR<K, V, RORRCRCHIRCHHOOIHCCHRCHORHCICI.IRRCCOICORICIHCHRHIHIHROIRHOCR<K, V>, RORRCRCHIRCHHOOIHCCHRCHORHCICI.RICRIRRCOHRCOCRRHHCRHRROOIOHHR<K, V>> {
      RICRIRRCOHRCOCRRHHCRHRROOIOHHR(
         RORRCRCHIRCHHOOIHCCHRCHORHCICI<K, V, RORRCRCHIRCHHOOIHCCHRCHORHCICI.IRRCCOICORICIHCHRHIHIHROIRHOCR<K, V>, RORRCRCHIRCHHOOIHCCHRCHORHCICI.RICRIRRCOHRCOCRRHHCRHRROOIOHHR<K, V>> var1,
         int var2,
         int var3
      ) {
         super(var1, var2, var3);
      }

      RORRCRCHIRCHHOOIHCCHRCHORHCICI.RICRIRRCOHRCOCRRHHCRHRROOIOHHR<K, V> IRIRRRIRIHCHOCIRHOOOHRROIRRHHC() {
         return this;
      }

      public RORRCRCHIRCHHOOIHCCHRCHORHCICI.IRRCCOICORICIHCHRHIHIHROIRHOCR<K, V> IIHRRHORCRCROCHHOHORCHCROCIHRO(
         RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR<K, V, ?> var1
      ) {
         return (RORRCRCHIRCHHOOIHCCHRCHORHCICI.IRRCCOICORICIHCHRHIHIHROIRHOCR<K, V>)var1;
      }
   }

   final class RIOOCHICIHRHOHCCCCCHOCCCOHCRHI extends RORRCRCHIRCHHOOIHCCHRCHORHCICI<K, V, E, S>.OOROOCCIRCCRHOIOIORIHCHHOOCCOR<Entry<K, V>> {
      public Entry<K, V> next() {
         return this.RROHHICCIRROIIRRRIIIIOOHHOHCCR();
      }
   }

   static final class RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<K, V>
      extends RORRCRCHIRCHHOOIHCCHRCHORHCICI.CIOHHCORHRCCRICCCORIHCRHCCCRRR<K, V, RORRCRCHIRCHHOOIHCCHRCHORHCICI.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH<K, V>, RORRCRCHIRCHHOOIHCCHRCHORHCICI.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<K, V>> {
      private final ReferenceQueue<K> HRHIHRCIIRHIIOCOIOHOOOCIIORIRH = new ReferenceQueue<>();
      private final ReferenceQueue<V> HRCOOOICIOIHHRCOCCRCHICHRCICRC = new ReferenceQueue<>();

      RIRHOCHIORCCIIOIIRHOCCCRHHCHHH(
         RORRCRCHIRCHHOOIHCCHRCHORHCICI<K, V, RORRCRCHIRCHHOOIHCCHRCHORHCICI.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH<K, V>, RORRCRCHIRCHHOOIHCCHRCHORHCICI.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<K, V>> var1,
         int var2,
         int var3
      ) {
         super(var1, var2, var3);
      }

      RORRCRCHIRCHHOOIHCCHRCHORHCICI.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<K, V> RCROCOCIOOHHOIHIHHHIOHCROHCRII() {
         return this;
      }

      @Override
      ReferenceQueue<K> getKeyReferenceQueueForTesting() {
         return this.HRHIHRCIIRHIIOCOIOHOOOCIIORIRH;
      }

      @Override
      ReferenceQueue<V> getValueReferenceQueueForTesting() {
         return this.HRCOOOICIOIHHRCOCCRCHICHRCICRC;
      }

      public RORRCRCHIRCHHOOIHCCHRCHORHCICI.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH<K, V> IIRHCHHOICHRICOOCRORCCIOOIHOIR(
         RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR<K, V, ?> var1
      ) {
         return (RORRCRCHIRCHHOOIHCCHRCHORHCICI.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH<K, V>)var1;
      }

      @Override
      public RORRCRCHIRCHHOOIHCCHRCHORHCICI.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR<K, V, RORRCRCHIRCHHOOIHCCHRCHORHCICI.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH<K, V>> RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
         RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR<K, V, ?> var1
      ) {
         return this.IIRHCHHOICHRICOOCRORCCIOOIHOIR(var1).ICRHRCCRHRRRCCCOOCHIIRRIRHCCII();
      }

      @Override
      public RORRCRCHIRCHHOOIHCCHRCHORHCICI.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR<K, V, RORRCRCHIRCHHOOIHCCHRCHORHCICI.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH<K, V>> IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR<K, V, ?> var1, V var2
      ) {
         return new RORRCRCHIRCHHOOIHCCHRCHORHCICI.IOHIHIIHCCCCCIHRORIOIOORCIOHII<>(
            this.HRCOOOICIOIHHRCOCCRCHICHRCICRC, (V)var2, this.IIRHCHHOICHRICOOCRORCCIOOIHOIR(var1)
         );
      }

      @Override
      public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR<K, V, ?> var1,
         RORRCRCHIRCHHOOIHCCHRCHORHCICI.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR<K, V, ? extends RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR<K, V, ?>> var2
      ) {
         RORRCRCHIRCHHOOIHCCHRCHORHCICI.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH var3 = this.IIRHCHHOICHRICOOCRORCCIOOIHOIR(var1);
         RORRCRCHIRCHHOOIHCCHRCHORHCICI.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR var4 = var2;
         RORRCRCHIRCHHOOIHCCHRCHORHCICI.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR var5 = var3.RHCRRIHHOICICCCROOOCHHROOHOOOO;
         var3.RHCRRIHHOICICCCROOOCHHROOHOOOO = var4;
         var5.clear();
      }

      @Override
      void maybeDrainReferenceQueues() {
         this.drainKeyReferenceQueue(this.HRHIHRCIIRHIIOCOIOHOOOCIIORIRH);
         this.drainValueReferenceQueue(this.HRCOOOICIOIHHRCOCCRCHICHRCICRC);
      }

      @Override
      void maybeClearReferenceQueues() {
         this.clearReferenceQueue(this.HRHIHRCIIRHIIOCOIOHOOOCIIORIRH);
      }
   }

   static final class RIROICHCRROROHCCROOCCCCOCHCCRI<K, V>
      extends RORRCRCHIRCHHOOIHCCHRCHORHCICI.CIOHHCORHRCCRICCCORIHCRHCCCRRR<K, V, RORRCRCHIRCHHOOIHCCHRCHORHCICI.HICRRICCHCCROOHHCHOCOCCHOIHHOC<K, V>, RORRCRCHIRCHHOOIHCCHRCHORHCICI.RIROICHCRROROHCCROOCCCCOCHCCRI<K, V>> {
      private final ReferenceQueue<V> OHRIORRHICHOHRRHHCOOIRCOORRHHC = new ReferenceQueue<>();

      RIROICHCRROROHCCROOCCCCOCHCCRI(
         RORRCRCHIRCHHOOIHCCHRCHORHCICI<K, V, RORRCRCHIRCHHOOIHCCHRCHORHCICI.HICRRICCHCCROOHHCHOCOCCHOIHHOC<K, V>, RORRCRCHIRCHHOOIHCCHRCHORHCICI.RIROICHCRROROHCCROOCCCCOCHCCRI<K, V>> var1,
         int var2,
         int var3
      ) {
         super(var1, var2, var3);
      }

      RORRCRCHIRCHHOOIHCCHRCHORHCICI.RIROICHCRROROHCCROOCCCCOCHCCRI<K, V> ORHRRHCRRCIHIIRIRHICHOHORHRIRC() {
         return this;
      }

      @Override
      ReferenceQueue<V> getValueReferenceQueueForTesting() {
         return this.OHRIORRHICHOHRRHHCOOIRCOORRHHC;
      }

      public RORRCRCHIRCHHOOIHCCHRCHORHCICI.HICRRICCHCCROOHHCHOCOCCHOIHHOC<K, V> OCOHORHCROHICRRIHCIHHRRCIHICRI(
         RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR<K, V, ?> var1
      ) {
         return (RORRCRCHIRCHHOOIHCCHRCHORHCICI.HICRRICCHCCROOHHCHOCOCCHOIHHOC<K, V>)var1;
      }

      @Override
      public RORRCRCHIRCHHOOIHCCHRCHORHCICI.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR<K, V, RORRCRCHIRCHHOOIHCCHRCHORHCICI.HICRRICCHCCROOHHCHOCOCCHOIHHOC<K, V>> RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
         RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR<K, V, ?> var1
      ) {
         return this.OCOHORHCROHICRRIHCIHHRRCIHICRI(var1).ICRHRCCRHRRRCCCOOCHIIRRIRHCCII();
      }

      @Override
      public RORRCRCHIRCHHOOIHCCHRCHORHCICI.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR<K, V, RORRCRCHIRCHHOOIHCCHRCHORHCICI.HICRRICCHCCROOHHCHOCOCCHOIHHOC<K, V>> IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR<K, V, ?> var1, V var2
      ) {
         return new RORRCRCHIRCHHOOIHCCHRCHORHCICI.IOHIHIIHCCCCCIHRORIOIOORCIOHII<>(
            this.OHRIORRHICHOHRRHHCOOIRCOORRHHC, (V)var2, this.OCOHORHCROHICRRIHCIHHRRCIHICRI(var1)
         );
      }

      @Override
      public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR<K, V, ?> var1,
         RORRCRCHIRCHHOOIHCCHRCHORHCICI.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR<K, V, ? extends RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR<K, V, ?>> var2
      ) {
         RORRCRCHIRCHHOOIHCCHRCHORHCICI.HICRRICCHCCROOHHCHOCOCCHOIHHOC var3 = this.OCOHORHCROHICRRIHCIHHRRCIHICRI(var1);
         RORRCRCHIRCHHOOIHCCHRCHORHCICI.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR var4 = var2;
         RORRCRCHIRCHHOOIHCCHRCHORHCICI.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR var5 = var3.RHCRRIHHOICICCCROOOCHHROOHOOOO;
         var3.RHCRRIHHOICICCCROOOCHHROOHOOOO = var4;
         var5.clear();
      }

      @Override
      void maybeDrainReferenceQueues() {
         this.drainValueReferenceQueue(this.OHRIORRHICHOHRRHHCOOIRCOORRHHC);
      }

      @Override
      void maybeClearReferenceQueues() {
         this.clearReferenceQueue(this.OHRIORRHICHOHRRHHCOOIRCOORRHHC);
      }
   }

   interface ROOCOCCCIRHHHIRIOIHHHHRHIICHHR<K, V, E extends RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR<K, V, E>> {
      @Nullable V get();

      E RCRRRICHIHCRORCHIHICHHHHRRIOHH();

      void clear();

      RORRCRCHIRCHHOOIHCCHRCHORHCICI.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR<K, V, E> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ReferenceQueue<V> var1, E var2);
   }

   static final class RRCRRCORICCHOHHIRCHIROOHIIOHCO
      implements RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR<Object, Object, RORRCRCHIRCHHOOIHCCHRCHORHCICI.RRCRRCORICCHOHHIRCHIROOHIIOHCO> {
      private RRCRRCORICCHOHHIRCHIROOHIIOHCO() {
         throw new AssertionError();
      }

      public RORRCRCHIRCHHOOIHCCHRCHORHCICI.RRCRRCORICCHOHHIRCHIROOHIIOHCO OIHRORRHHIICRHHIOHCCORCCHCORCH() {
         throw new AssertionError();
      }

      @Override
      public int getHash() {
         throw new AssertionError();
      }

      @Override
      public Object getKey() {
         throw new AssertionError();
      }

      @Override
      public Object getValue() {
         throw new AssertionError();
      }
   }

   static final class RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO<K>
      extends RORRCRCHIRCHHOOIHCCHRCHORHCICI.CIOHHCORHRCCRICCCORIHCRHCCCRRR<K, HCHOOCHIOICRRHHIHHHICIRCIOICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH, RORRCRCHIRCHHOOIHCCHRCHORHCICI.ORHIOICIOCRRHOOCOHRORIHICHRCRR<K>, RORRCRCHIRCHHOOIHCCHRCHORHCICI.RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO<K>> {
      private final ReferenceQueue<K> IIOHCCCHRRIHHRHROIRHIHIIIRHCCI = new ReferenceQueue<>();

      RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO(
         RORRCRCHIRCHHOOIHCCHRCHORHCICI<K, HCHOOCHIOICRRHHIHHHICIRCIOICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH, RORRCRCHIRCHHOOIHCCHRCHORHCICI.ORHIOICIOCRRHOOCOHRORIHICHRCRR<K>, RORRCRCHIRCHHOOIHCCHRCHORHCICI.RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO<K>> var1,
         int var2,
         int var3
      ) {
         super(var1, var2, var3);
      }

      RORRCRCHIRCHHOOIHCCHRCHORHCICI.RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO<K> HOIHOOOIHIHORHCHOROOHCHHRICCRO() {
         return this;
      }

      @Override
      ReferenceQueue<K> getKeyReferenceQueueForTesting() {
         return this.IIOHCCCHRRIHHRHROIRHIHIIIRHCCI;
      }

      public RORRCRCHIRCHHOOIHCCHRCHORHCICI.ORHIOICIOCRRHOOCOHRORIHICHRCRR<K> CIOHHCORHRCCRICCCORIHCRHCCCRRR(
         RORRCRCHIRCHHOOIHCCHRCHORHCICI.CORCOCICIRIOHROHROIIOOHICCHCRR<K, HCHOOCHIOICRRHHIHHHICIRCIOICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH, ?> var1
      ) {
         return (RORRCRCHIRCHHOOIHCCHRCHORHCICI.ORHIOICIOCRRHOOCOHRORIHICHRCRR<K>)var1;
      }

      @Override
      void maybeDrainReferenceQueues() {
         this.drainKeyReferenceQueue(this.IIOHCCCHRRIHHRHROIRHIHIIIRHCCI);
      }

      @Override
      void maybeClearReferenceQueues() {
         this.clearReferenceQueue(this.IIOHCCCHRRIHHRHROIRHIHIIIRHCCI);
      }
   }
}
