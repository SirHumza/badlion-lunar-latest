package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

final class IOIICIRIICICIIOORHCIIIIRRIHRHI extends RIRHOCHIORCCIIOIIRHOCCCRHHCHHH implements RIROICHCRROROHCCROOCCCCOCHCCRI, Serializable {
   private static final long RRICRCORCRIIRRIIHIRCOIRCIRIHCO = 7249069246863182397L;

   @Override
   final long fn(long var1, long var3) {
      return var1 + var3;
   }

   public IOIICIRIICICIIOORHCIIIIRRIHRHI() {
   }

   @Override
   public void add(long var1) {
      RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH[] var3 = this.IRICCCRHHCCCCOOCRHCHOHRIRCHOIH;
      if (this.IRICCCRHHCCCCOOCRHCHOHRIRCHOIH == null) {
         long var4 = this.base;
         if (this.IIRHCHHOICHRICOOCRORCCIOOIHOIR(this.base, var4 + var1)) {
            return;
         }
      }

      boolean var11 = true;
      int[] var8;
      RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var9;
      int var10;
      if ((var8 = RRCIIOHHOIIIHRRCOIHHCOHHHRCRRR.get()) != null && var3 != null && (var10 = var3.length) >= 1 && (var9 = var3[var10 - 1 & var8[0]]) != null) {
         long var6 = var9.value;
         if (var11 = var9.OHHRIOHROOIHOROCIRHCHORIHRRRRI(var9.value, var6 + var1)) {
            return;
         }
      }

      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, var8, var11);
   }

   @Override
   public void increment() {
      this.add(1L);
   }

   public void decrement() {
      this.add(-1L);
   }

   @Override
   public long sum() {
      long var1 = this.base;
      RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH[] var3 = this.IRICCCRHHCCCCOOCRHCHOHRIRCHOIH;
      if (var3 != null) {
         for (RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var6 : var3) {
            if (var6 != null) {
               var1 += var6.value;
            }
         }
      }

      return var1;
   }

   public void reset() {
      this.RCOHCCHCRHIIIICRIHCOICIHHCCOOC(0L);
   }

   public long sumThenReset() {
      long var1 = this.base;
      RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH[] var3 = this.IRICCCRHHCCCCOOCRHCHOHRIRCHOIH;
      this.base = 0L;
      if (var3 != null) {
         for (RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var6 : var3) {
            if (var6 != null) {
               var1 += var6.value;
               var6.value = 0L;
            }
         }
      }

      return var1;
   }

   @Override
   public String toString() {
      return Long.toString(this.sum());
   }

   @Override
   public long longValue() {
      return this.sum();
   }

   @Override
   public int intValue() {
      return (int)this.sum();
   }

   @Override
   public float floatValue() {
      return (float)this.sum();
   }

   @Override
   public double doubleValue() {
      return this.sum();
   }

   private void writeObject(ObjectOutputStream var1) {
      var1.defaultWriteObject();
      var1.writeLong(this.sum());
   }

   private void readObject(ObjectInputStream var1) {
      var1.defaultReadObject();
      this.busy = 0;
      this.IRICCCRHHCCCCOOCRHCHOHRIRCHOIH = null;
      this.base = var1.readLong();
   }
}
