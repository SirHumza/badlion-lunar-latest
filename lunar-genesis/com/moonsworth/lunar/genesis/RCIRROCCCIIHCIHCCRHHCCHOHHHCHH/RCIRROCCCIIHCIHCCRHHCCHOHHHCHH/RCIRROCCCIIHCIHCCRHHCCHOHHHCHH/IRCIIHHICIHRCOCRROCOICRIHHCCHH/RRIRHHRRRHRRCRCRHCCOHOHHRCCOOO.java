package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import java.io.Serializable;
import java.util.Iterator;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
   serializable = true
)
final class RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO<T> extends IIHRRHORCRCROCHHOHORCHCROCIHRO<Iterable<T>> implements Serializable {
   final IIHRRHORCRCROCHHOHORCHCROCIHRO<? super T> ICOOHRHHCOIOOOORHCICORRRHOORIR;
   private static final long HIICOCOOORCHIIHHOHROOIIROCROHI = 1L;

   RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO(IIHRRHORCRCROCHHOHORCHCROCIHRO<? super T> var1) {
      this.ICOOHRHHCOIOOOORHCICORRRHOORIR = IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var1);
   }

   protected boolean doEquivalent(Iterable<T> var1, Iterable<T> var2) {
      Iterator var3 = var1.iterator();
      Iterator var4 = var2.iterator();

      while (var3.hasNext() && var4.hasNext()) {
         if (!this.ICOOHRHHCOIOOOORHCICORRRHOORIR.IHHCHHHCRIHOOCOIOOCRIIICIOROIR((T)var3.next(), (T)var4.next())) {
            return false;
         }
      }

      return !var3.hasNext() && !var4.hasNext();
   }

   protected int doHash(Iterable<T> var1) {
      int var2 = 78721;

      for (Object var4 : var1) {
         var2 = var2 * 24943 + this.ICOOHRHHCOIOOOORHCICORRRHOORIR.ICOHIIIRCIORCORHRRROOOOCOOROIC((T)var4);
      }

      return var2;
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      if (var1 instanceof RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO) {
         RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO var2 = (RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO)var1;
         return this.ICOOHRHHCOIOOOORHCICORRRHOORIR.equals(var2.ICOOHRHHCOIOOOORHCICORRRHOORIR);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.ICOOHRHHCOIOOOORHCICORRRHOORIR.hashCode() ^ 1185147655;
   }

   @Override
   public String toString() {
      return this.ICOOHRHHCOIOOOORHCICORRRHOORIR + ".pairwise()";
   }
}
