package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLongArray;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
public class CIOHHCORHRCCRICCCORIHCRHCCCRRR implements Serializable {
   private static final long IRCRCICHOIRRRHIHHHICCIOCRHCCIR = 0L;
   private transient AtomicLongArray longs;

   public CIOHHCORHRCCRICCCORIHCRHCCCRRR(int var1) {
      this.longs = new AtomicLongArray(var1);
   }

   public CIOHHCORHRCCRICCCORIHCRHCCCRRR(double[] var1) {
      int var2 = var1.length;
      long[] var3 = new long[var2];

      for (int var4 = 0; var4 < var2; var4++) {
         var3[var4] = Double.doubleToRawLongBits(var1[var4]);
      }

      this.longs = new AtomicLongArray(var3);
   }

   public final int OHRHIOHRCOOHICCICRHORIRHCCHICR() {
      return this.longs.length();
   }

   public final double COHHIHOCHHCOOOIICHOHOIHHIICRHC(int var1) {
      return Double.longBitsToDouble(this.longs.get(var1));
   }

   public final void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(int var1, double var2) {
      long var4 = Double.doubleToRawLongBits(var2);
      this.longs.set(var1, var4);
   }

   public final void IRCIIHHICIHRCOCRROCOICRIHHCCHH(int var1, double var2) {
      long var4 = Double.doubleToRawLongBits(var2);
      this.longs.lazySet(var1, var4);
   }

   public final double HHCCIRHCCCIIRHCROHIORHIRHHIORH(int var1, double var2) {
      long var4 = Double.doubleToRawLongBits(var2);
      return Double.longBitsToDouble(this.longs.getAndSet(var1, var4));
   }

   public final boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(int var1, double var2, double var4) {
      return this.longs.compareAndSet(var1, Double.doubleToRawLongBits(var2), Double.doubleToRawLongBits(var4));
   }

   public final boolean IRCIIHHICIHRCOCRROCOICRIHHCCHH(int var1, double var2, double var4) {
      return this.longs.weakCompareAndSet(var1, Double.doubleToRawLongBits(var2), Double.doubleToRawLongBits(var4));
   }

   @CanIgnoreReturnValue
   public final double CRRRICCRROCOHHOHIICIHORCOORRRH(int var1, double var2) {
      long var4;
      double var6;
      long var10;
      do {
         var4 = this.longs.get(var1);
         var6 = Double.longBitsToDouble(var4);
         double var8 = var6 + var2;
         var10 = Double.doubleToRawLongBits(var8);
      } while (!this.longs.compareAndSet(var1, var4, var10));

      return var6;
   }

   @CanIgnoreReturnValue
   public double addAndGet(int var1, double var2) {
      long var4;
      double var8;
      long var10;
      do {
         var4 = this.longs.get(var1);
         double var6 = Double.longBitsToDouble(var4);
         var8 = var6 + var2;
         var10 = Double.doubleToRawLongBits(var8);
      } while (!this.longs.compareAndSet(var1, var4, var10));

      return var8;
   }

   @Override
   public String toString() {
      int var1 = this.OHRHIOHRCOOHICCICRHORIRHCCHICR() - 1;
      if (var1 == -1) {
         return "[]";
      }

      StringBuilder var2 = new StringBuilder(19 * (var1 + 1));
      var2.append('[');
      int var3 = 0;

      while (true) {
         var2.append(Double.longBitsToDouble(this.longs.get(var3)));
         if (var3 == var1) {
            return var2.append(']').toString();
         }

         var2.append(',').append(' ');
         var3++;
      }
   }

   private void writeObject(ObjectOutputStream var1) {
      var1.defaultWriteObject();
      int var2 = this.OHRHIOHRCOOHICCICRHORIRHCCHICR();
      var1.writeInt(var2);

      for (int var3 = 0; var3 < var2; var3++) {
         var1.writeDouble(this.COHHIHOCHHCOOOIICHOHOIHHIICRHC(var3));
      }
   }

   private void readObject(ObjectInputStream var1) {
      var1.defaultReadObject();
      int var2 = var1.readInt();
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI.CRICCOOHHHCHOORCICOCOHIHOIRHOO.CIRCRHCIHROROOCOHOIIHCOHCOCHRO();

      for (int var4 = 0; var4 < var2; var4++) {
         var3.RICHIIOOOHORCHORORHIHIRRHCOOIH(Double.doubleToRawLongBits(var1.readDouble()));
      }

      this.longs = new AtomicLongArray(var3.OOHOHRCOHRHCHCOOCOHHIRICOORIHC().toArray());
   }
}
