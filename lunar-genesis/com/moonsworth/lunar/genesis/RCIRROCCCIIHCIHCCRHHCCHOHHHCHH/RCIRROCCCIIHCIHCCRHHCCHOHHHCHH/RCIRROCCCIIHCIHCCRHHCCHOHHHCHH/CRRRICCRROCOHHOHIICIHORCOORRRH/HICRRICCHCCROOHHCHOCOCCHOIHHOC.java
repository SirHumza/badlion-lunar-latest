package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Spliterator;
import java.util.Map.Entry;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
   emulated = true
)
public final class HICRRICCHCCROOHHCHOCOCCHOIHHOC<R, C, V> extends OHHRIOHROOIHOROCIRHCHORIHRRRRI<R, C, V> implements Serializable {
   private final COIRRRCIORROCHIROCHROCHICCICIC<R> CCRCHHRCIOOCCHIORORRIHRHCCHHCC;
   private final COIRRRCIORROCHIROCHROCHICCICIC<C> CROROHRHROIICRROHIHIICIHOROHRH;
   private final OOHRIIOOHROIOHCIRIHRHRRICRRHOI<R, Integer> ROROORICCRCORCIICOCIRRIICHIOCH;
   private final OOHRIIOOHROIOHCIRIHRHRRICRRHOI<C, Integer> HOIOOOHIHRCIHRCHICORIIIHOCICCR;
   private final V[][] COROCOROROCHCOHHIIIHHIROORIHOR;
   private transient HICRRICCHCCROOHHCHOCOCCHOIHHOC.@Nullable HHCCIRHCCCIIRHCROHIORHIRHHIORH OHHHRIHCRHHCIHRHIIHIIRCICROIIH;
   private transient HICRRICCHCCROOHHCHOCOCCHOIHHOC.@Nullable RRCRRCORICCHOHHIRCHIROOHIIOHCO ORCRICCRIRHRCRIHIRHRRCICHIROHH;
   private static final long RCCHCIIHOCORORHOHHRCHRCRHIICIH = 0L;

   public static <R, C, V> HICRRICCHCCROOHHCHOCOCCHOIHHOC<R, C, V> IRCIIHHICIHRCOCRROCOICRIHHCCHH(Iterable<? extends R> var0, Iterable<? extends C> var1) {
      return new HICRRICCHCCROOHHCHOCOCCHOIHHOC<>(var0, var1);
   }

   public static <R, C, V> HICRRICCHCCROOHHCHOCOCCHOIHHOC<R, C, V> IRCIIHHICIHRCOCRROCOICRIHHCCHH(RCCICOCCCHROHOCCHIHORIHHCOHOHH<R, C, V> var0) {
      return var0 instanceof HICRRICCHCCROOHHCHOCOCCHOIHHOC
         ? new HICRRICCHCCROOHHCHOCOCCHOIHHOC<>((HICRRICCHCCROOHHCHOCOCCHOIHHOC<R, C, V>)var0)
         : new HICRRICCHCCROOHHCHOCOCCHOIHHOC<>(var0);
   }

   private HICRRICCHCCROOHHCHOCOCCHOIHHOC(Iterable<? extends R> var1, Iterable<? extends C> var2) {
      this.CCRCHHRCIOOCCHIORORRIHRHCCHHCC = COIRRRCIORROCHIROCHROCHICCICIC.HICRRICCHCCROOHHCHOCOCCHOIHHOC(var1);
      this.CROROHRHROIICRROHIHIICIHOROHRH = COIRRRCIORROCHIROCHROCHICCICIC.HICRRICCHCCROOHHCHOCOCCHOIHHOC(var2);
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
         this.CCRCHHRCIOOCCHIORORRIHRHCCHHCC.isEmpty() == this.CROROHRHROIICRROHIHIICIHOROHRH.isEmpty()
      );
      this.ROROORICCRCORCIICOCIRRIICHIOCH = ROCHRRCORRCOOOOOCOICOCROIIHIHH.RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO(this.CCRCHHRCIOOCCHIORORRIHRHCCHHCC);
      this.HOIOOOHIHRCIHRCHICORIIIHOCICCR = ROCHRRCORRCOOOOOCOICOCROIIHIHH.RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO(this.CROROHRHROIICRROHIHIICIHOROHRH);
      Object[][] var3 = new Object[this.CCRCHHRCIOOCCHIORORRIHRHCCHHCC.size()][this.CROROHRHROIICRROHIHIICIHOROHRH.size()];
      this.COROCOROROCHCOHHIIIHHIROORIHOR = (V[][])var3;
      this.eraseAll();
   }

   private HICRRICCHCCROOHHCHOCOCCHOIHHOC(RCCICOCCCHROHOCCHIHORIHHCOHOHH<R, C, V> var1) {
      this(var1.rowKeySet(), var1.columnKeySet());
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1);
   }

   private HICRRICCHCCROOHHCHOCOCCHOIHHOC(HICRRICCHCCROOHHCHOCOCCHOIHHOC<R, C, V> var1) {
      this.CCRCHHRCIOOCCHIORORRIHRHCCHHCC = var1.CCRCHHRCIOOCCHIORORRIHRHCCHHCC;
      this.CROROHRHROIICRROHIHIICIHOROHRH = var1.CROROHRHROIICRROHIHIICIHOROHRH;
      this.ROROORICCRCORCIICOCIRRIICHIOCH = var1.ROROORICCRCORCIICOCIRRIICHIOCH;
      this.HOIOOOHIHRCIHRCHICORIIIHOCICCR = var1.HOIOOOHIHRCIHRCHICORIIIHOCICCR;
      Object[][] var2 = new Object[this.CCRCHHRCIOOCCHIORORRIHRHCCHHCC.size()][this.CROROHRHROIICRROHIHIICIHOROHRH.size()];
      this.COROCOROROCHCOHHIIIHHIROORIHOR = (V[][])var2;

      for (int var3 = 0; var3 < this.CCRCHHRCIOOCCHIORORRIHRHCCHHCC.size(); var3++) {
         System.arraycopy(var1.COROCOROROCHCOHHIIIHHIROORIHOR[var3], 0, var2[var3], 0, var1.COROCOROROCHCOHHIIIHHIROORIHOR[var3].length);
      }
   }

   public COIRRRCIORROCHIROCHROCHICCICIC<R> CCCOHIHHRCOCRRIOOCCRIIHICRHCHI() {
      return this.CCRCHHRCIOOCCHIORORRIHRHCCHHCC;
   }

   public COIRRRCIORROCHIROCHROCHICCICIC<C> RCRROHRIIHOCHIHHICRRHRHHIRCOCR() {
      return this.CROROHRHROIICRROHIHIICIHOROHRH;
   }

   public V at(int var1, int var2) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkElementIndex(
         var1, this.CCRCHHRCIOOCCHIORORRIHRHCCHHCC.size()
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkElementIndex(
         var2, this.CROROHRHROIICRROHIHIICIHOROHRH.size()
      );
      return this.COROCOROROCHCOHHIIIHHIROORIHOR[var1][var2];
   }

   @CanIgnoreReturnValue
   public V set(int var1, int var2, @Nullable V var3) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkElementIndex(
         var1, this.CCRCHHRCIOOCCHIORORRIHRHCCHHCC.size()
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkElementIndex(
         var2, this.CROROHRHROIICRROHIHIICIHOROHRH.size()
      );
      Object var4 = this.COROCOROROCHCOHHIIIHHIROORIHOR[var1][var2];
      this.COROCOROROCHCOHHIIIHHIROORIHOR[var1][var2] = (V)var3;
      return (V)var4;
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   public V[][] toArray(Class<V> var1) {
      Object[][] var2 = (Object[][])Array.newInstance(var1, this.CCRCHHRCIOOCCHIORORRIHRHCCHHCC.size(), this.CROROHRHROIICRROHIHIICIHOROHRH.size());

      for (int var3 = 0; var3 < this.CCRCHHRCIOOCCHIORORRIHRHCCHHCC.size(); var3++) {
         System.arraycopy(this.COROCOROROCHCOHHIIIHHIROORIHOR[var3], 0, var2[var3], 0, this.COROCOROROCHCOHHIIIHHIROORIHOR[var3].length);
      }

      return (V[][])var2;
   }

   @Deprecated
   @Override
   public void clear() {
      throw new UnsupportedOperationException();
   }

   public void eraseAll() {
      for (Object[] var4 : this.COROCOROROCHCOHHIIIHHIROORIHOR) {
         Arrays.fill(var4, null);
      }
   }

   @Override
   public boolean contains(@Nullable Object var1, @Nullable Object var2) {
      return this.containsRow(var1) && this.containsColumn(var2);
   }

   @Override
   public boolean containsColumn(@Nullable Object var1) {
      return this.HOIOOOHIHRCIHRCHICORIIIHOCICCR.containsKey(var1);
   }

   @Override
   public boolean containsRow(@Nullable Object var1) {
      return this.ROROORICCRCORCIICOCIRRIICHIOCH.containsKey(var1);
   }

   @Override
   public boolean containsValue(@Nullable Object var1) {
      for (Object[] var5 : this.COROCOROROCHCOHHIIIHHIROORIHOR) {
         for (Object var9 : var5) {
            if (com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHRIICOIOORCHCOIICOOIHIRHHICRI.equal(
               var1, var9
            )) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public V get(@Nullable Object var1, @Nullable Object var2) {
      Integer var3 = this.ROROORICCRCORCIICOCIRRIICHIOCH.get(var1);
      Integer var4 = this.HOIOOOHIHRCIHRCHICORIIIHOCICCR.get(var2);
      return var3 != null && var4 != null ? this.at(var3, var4) : null;
   }

   @Override
   public boolean isEmpty() {
      return this.CCRCHHRCIOOCCHIORORRIHRHCCHHCC.isEmpty() || this.CROROHRHROIICRROHIHIICIHOROHRH.isEmpty();
   }

   @CanIgnoreReturnValue
   @Override
   public V put(R var1, C var2, @Nullable V var3) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var2
      );
      Integer var4 = this.ROROORICCRCORCIICOCIRRIICHIOCH.get(var1);
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
         var4 != null, "Row %s not in %s", var1, this.CCRCHHRCIOOCCHIORORRIHRHCCHHCC
      );
      Integer var5 = this.HOIOOOHIHRCIHRCHICORIIIHOCICCR.get(var2);
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
         var5 != null, "Column %s not in %s", var2, this.CROROHRHROIICRROHIHIICIHOROHRH
      );
      return this.set(var4, var5, (V)var3);
   }

   @Override
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RCCICOCCCHROHOCCHIHORIHHCOHOHH<? extends R, ? extends C, ? extends V> var1) {
      super.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1);
   }

   @Deprecated
   @CanIgnoreReturnValue
   @Override
   public V remove(Object var1, Object var2) {
      throw new UnsupportedOperationException();
   }

   @CanIgnoreReturnValue
   public V erase(@Nullable Object var1, @Nullable Object var2) {
      Integer var3 = this.ROROORICCRCORCIICOCIRRIICHIOCH.get(var1);
      Integer var4 = this.HOIOOOHIHRCIHRCHICORIIIHOCICCR.get(var2);
      return var3 != null && var4 != null ? this.set(var3, var4, null) : null;
   }

   @Override
   public int size() {
      return this.CCRCHHRCIOOCCHIORORRIHRHCCHHCC.size() * this.CROROHRHROIICRROHIHIICIHOROHRH.size();
   }

   @Override
   public Set<RCCICOCCCHROHOCCHIHORIHHCOHOHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<R, C, V>> cellSet() {
      return super.cellSet();
   }

   @Override
   Iterator<RCCICOCCCHROHOCCHIHORIHHCOHOHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<R, C, V>> cellIterator() {
      return new com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH<RCCICOCCCHROHOCCHIHORIHHCOHOHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<R, C, V>>(
         this.size()
      ) {
         protected RCCICOCCCHROHOCCHIHORIHHCOHOHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<R, C, V> ROCOICHOOCIOHOHICOHRICCHOROCRH(int var1) {
            return HICRRICCHCCROOHHCHOCOCCHOIHHOC.this.HHHHCCHIHRHHOOIIROHOOCHOOCHORI(var1);
         }
      };
   }

   @Override
   Spliterator<RCCICOCCCHROHOCCHIHORIHHCOHOHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<R, C, V>> cellSpliterator() {
      return IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.indexed(this.size(), 273, this::HHHHCCHIHRHHOOIIROHOOCHOOCHORI);
   }

   private RCCICOCCCHROHOCCHIHORIHHCOHOHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<R, C, V> HHHHCCHIHRHHOOIIROHOOCHOOCHORI(final int var1) {
      return new CIHHIHOORIIHCOORRRICHHCCRRRCHO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<R, C, V>() {
         final int OIOORCOOORRROCHHIIHRIRRCOCOORR = var1 / HICRRICCHCCROOHHCHOCOCCHOIHHOC.this.CROROHRHROIICRROHIHIICIHOROHRH.size();
         final int OIHCCCIHICIOCHRICHOHCICIROCRIC = var1 % HICRRICCHCCROOHHCHOCOCCHOIHHOC.this.CROROHRHROIICRROHIHIICIHOROHRH.size();

         @Override
         public R getRowKey() {
            return HICRRICCHCCROOHHCHOCOCCHOIHHOC.this.CCRCHHRCIOOCCHIORORRIHRHCCHHCC.get(this.OIOORCOOORRROCHHIIHRIRRCOCOORR);
         }

         @Override
         public C getColumnKey() {
            return HICRRICCHCCROOHHCHOCOCCHOIHHOC.this.CROROHRHROIICRROHIHIICIHOROHRH.get(this.OIHCCCIHICIOCHRICHOHCICIROCRIC);
         }

         @Override
         public V getValue() {
            return (V)HICRRICCHCCROOHHCHOCOCCHOIHHOC.this.at(this.OIOORCOOORRROCHHIIHRIRRCOCOORR, this.OIHCCCIHICIOCHRICHOHCICIROCRIC);
         }
      };
   }

   private V getValue(int var1) {
      int var2 = var1 / this.CROROHRHROIICRROHIHIICIHOROHRH.size();
      int var3 = var1 % this.CROROHRHROIICRROHIHIICIHOROHRH.size();
      return this.at(var2, var3);
   }

   @Override
   public Map<R, V> column(C var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      Integer var2 = this.HOIOOOHIHRCIHRCHICORIIIHOCICCR.get(var1);
      return var2 == null
         ? OOHRIIOOHROIOHCIRIHRHRRICRRHOI.RIOCOIOOIIRHOROHOCHHOORRCCOIHR()
         : new HICRRICCHCCROOHHCHOCOCCHOIHHOC.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var2);
   }

   public CICOIHIRIIHHCIOICHRHICRIRCIOHC<C> RICORHOHCCIRCIOICOIHIRCRCIOIIC() {
      return this.HOIOOOHIHRCIHRCHICORIIIHOCICCR.RORCHHOHICRHCCIRRORIHCCOCRHOCO();
   }

   @Override
   public Map<C, Map<R, V>> columnMap() {
      HICRRICCHCCROOHHCHOCOCCHOIHHOC.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1 = this.OHHHRIHCRHHCIHRHIIHIIRCICROIIH;
      return var1 == null ? (this.OHHHRIHCRHHCIHRHIIHIIRCICROIIH = new HICRRICCHCCROOHHCHOCOCCHOIHHOC.HHCCIRHCCCIIRHCROHIORHIRHHIORH()) : var1;
   }

   @Override
   public Map<C, V> row(R var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      Integer var2 = this.ROROORICCRCORCIICOCIRRIICHIOCH.get(var1);
      return var2 == null
         ? OOHRIIOOHROIOHCIRIHRHRRICRRHOI.RIOCOIOOIIRHOROHOCHHOORRCCOIHR()
         : new HICRRICCHCCROOHHCHOCOCCHOIHHOC.CRRRICCRROCOHHOHIICIHORCOORRRH(var2);
   }

   public CICOIHIRIIHHCIOICHRHICRIRCIOHC<R> CROHHOORHORCHCIIHCOORHROCIHRCI() {
      return this.ROROORICCRCORCIICOCIRRIICHIOCH.RORCHHOHICRHCCIRRORIHCCOCRHOCO();
   }

   @Override
   public Map<R, Map<C, V>> rowMap() {
      HICRRICCHCCROOHHCHOCOCCHOIHHOC.RRCRRCORICCHOHHIRCHIROOHIIOHCO var1 = this.ORCRICCRIRHRCRIHIRHRRCICHIROHH;
      return var1 == null ? (this.ORCRICCRIRHRCRIHIRHRRCICHIROHH = new HICRRICCHCCROOHHCHOCOCCHOIHHOC.RRCRRCORICCHOHHIRCHIROOHIIOHCO()) : var1;
   }

   @Override
   public Collection<V> values() {
      return super.values();
   }

   @Override
   Iterator<V> valuesIterator() {
      return new com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH<V>(
         this.size()
      ) {
         @Override
         protected V get(int var1) {
            return (V)HICRRICCHCCROOHHCHOCOCCHOIHHOC.this.getValue(var1);
         }
      };
   }

   @Override
   Spliterator<V> valuesSpliterator() {
      return IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.indexed(this.size(), 16, this::getValue);
   }

   private class CRRRICCRROCOHHOHIICIHORCOORRRH extends HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<C, V> {
      final int CIRRRICCRHIIRRIIHCRRIOHRHRCIIC;

      CRRRICCRROCOHHOHIICIHORCOORRRH(int var2) {
         super(HICRRICCHCCROOHHCHOCOCCHOIHHOC.this.HOIOOOHIHRCIHRCHICORIIIHOCICCR);
         this.CIRRRICCRHIIRRIIHCRRIOHRHRCIIC = var2;
      }

      @Override
      String getKeyRole() {
         return "Column";
      }

      @Override
      V getValue(int var1) {
         return HICRRICCHCCROOHHCHOCOCCHOIHHOC.this.at(this.CIRRRICCRHIIRRIIHCRRIOHRHRCIIC, var1);
      }

      @Override
      V setValue(int var1, V var2) {
         return HICRRICCHCCROOHHCHOCOCCHOIHHOC.this.set(this.CIRRRICCRHIIRRIIHCRRIOHRHRCIIC, var1, (V)var2);
      }
   }

   private class HHCCIRHCCCIIRHCROHIORHIRHHIORH extends HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<C, Map<R, V>> {
      private HHCCIRHCCCIIRHCROHIORHIRHHIORH() {
         super(HICRRICCHCCROOHHCHOCOCCHOIHHOC.this.HOIOOOHIHRCIHRCHICORIIIHOCICCR);
      }

      @Override
      String getKeyRole() {
         return "Column";
      }

      Map<R, V> getValue(int var1) {
         return HICRRICCHCCROOHHCHOCOCCHOIHHOC.this.new IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1);
      }

      Map<R, V> setValue(int var1, Map<R, V> var2) {
         throw new UnsupportedOperationException();
      }

      public Map<R, V> put(C var1, Map<R, V> var2) {
         throw new UnsupportedOperationException();
      }
   }

   private class IRCIIHHICIHRCOCRROCOICRIHHCCHH extends HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<R, V> {
      final int OICHHOCICIHIOCOCOIIORIHIOOCIOO;

      IRCIIHHICIHRCOCRROCOICRIHHCCHH(int var2) {
         super(HICRRICCHCCROOHHCHOCOCCHOIHHOC.this.ROROORICCRCORCIICOCIRRIICHIOCH);
         this.OICHHOCICIHIOCOCOIIORIHIOOCIOO = var2;
      }

      @Override
      String getKeyRole() {
         return "Row";
      }

      @Override
      V getValue(int var1) {
         return HICRRICCHCCROOHHCHOCOCCHOIHHOC.this.at(var1, this.OICHHOCICIHIOCOCOIIORIHIOOCIOO);
      }

      @Override
      V setValue(int var1, V var2) {
         return HICRRICCHCCROOHHCHOCOCCHOIHHOC.this.set(var1, this.OICHHOCICIHIOCOCOIIORIHIOOCIOO, (V)var2);
      }
   }

   private abstract static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<K, V> extends ROCHRRCORRCOOOOOCOICOCROIIHIHH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR<K, V> {
      private final OOHRIIOOHROIOHCIRIHRHRRICRRHOI<K, Integer> IOHIRCIRHHIROIIHIHHCIIHOHHHIRI;

      private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(OOHRIIOOHROIOHCIRIHRHRRICRRHOI<K, Integer> var1) {
         this.IOHIRCIRHHIROIIHIHHCIIHOHHHIRI = var1;
      }

      @Override
      public Set<K> keySet() {
         return this.IOHIRCIRHHIROIIHIHHCIIHOHHHIRI.RORCHHOHICRHCCIRRORIHCCOCRHOCO();
      }

      K getKey(int var1) {
         return this.IOHIRCIRHHIROIIHIHHCIIHOHHHIRI.RORCHHOHICRHCCIRRORIHCCOCRHOCO().OHOOIHCOHHORHICHIOROIRIHCOOCRR().get(var1);
      }

      abstract String getKeyRole();

      abstract @Nullable V getValue(int var1);

      abstract @Nullable V setValue(int var1, V var2);

      @Override
      public int size() {
         return this.IOHIRCIRHHIROIIHIHHCIIHOHHHIRI.size();
      }

      @Override
      public boolean isEmpty() {
         return this.IOHIRCIRHHIROIIHIHHCIIHOHHHIRI.isEmpty();
      }

      Entry<K, V> getEntry(final int var1) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkElementIndex(
            var1, this.size()
         );
         return new HRCHROOHRIHCRCRHRIIROCIRHOIRHH<K, V>() {
            @Override
            public K getKey() {
               return (K)RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.getKey(var1);
            }

            @Override
            public V getValue() {
               return (V)RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.getValue(var1);
            }

            @Override
            public V setValue(V var1x) {
               return (V)RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.setValue(var1, var1x);
            }
         };
      }

      @Override
      Iterator<Entry<K, V>> entryIterator() {
         return new com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH<Entry<K, V>>(
            this.size()
         ) {
            protected Entry<K, V> get(int var1) {
               return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.getEntry(var1);
            }
         };
      }

      @Override
      Spliterator<Entry<K, V>> entrySpliterator() {
         return IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.indexed(this.size(), 16, this::getEntry);
      }

      @Override
      public boolean containsKey(@Nullable Object var1) {
         return this.IOHIRCIRHHIROIIHIHHCIIHOHHHIRI.containsKey(var1);
      }

      @Override
      public V get(@Nullable Object var1) {
         Integer var2 = this.IOHIRCIRHHIROIIHIHHCIIHOHHHIRI.get(var1);
         return var2 == null ? null : this.getValue(var2);
      }

      @Override
      public V put(K var1, V var2) {
         Integer var3 = this.IOHIRCIRHHIROIIHIHHCIIHOHHHIRI.get(var1);
         if (var3 == null) {
            throw new IllegalArgumentException(
               this.getKeyRole() + " " + var1 + " not in " + this.IOHIRCIRHHIROIIHIHHCIIHOHHHIRI.RORCHHOHICRHCCIRRORIHCCOCRHOCO()
            );
         } else {
            return this.setValue(var3, (V)var2);
         }
      }

      @Override
      public V remove(Object var1) {
         throw new UnsupportedOperationException();
      }

      @Override
      public void clear() {
         throw new UnsupportedOperationException();
      }
   }

   private class RRCRRCORICCHOHHIRCHIROOHIIOHCO extends HICRRICCHCCROOHHCHOCOCCHOIHHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<R, Map<C, V>> {
      private RRCRRCORICCHOHHIRCHIROOHIIOHCO() {
         super(HICRRICCHCCROOHHCHOCOCCHOIHHOC.this.ROROORICCRCORCIICOCIRRIICHIOCH);
      }

      @Override
      String getKeyRole() {
         return "Row";
      }

      Map<C, V> getValue(int var1) {
         return HICRRICCHCCROOHHCHOCOCCHOIHHOC.this.new CRRRICCRROCOHHOHIICIHORCOORRRH(var1);
      }

      Map<C, V> setValue(int var1, Map<C, V> var2) {
         throw new UnsupportedOperationException();
      }

      public Map<C, V> put(R var1, Map<C, V> var2) {
         throw new UnsupportedOperationException();
      }
   }
}
