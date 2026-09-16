package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
   emulated = true
)
final class CIOHHCORHRCCRICCCORIHCRHCCCRRR extends RICRIRRCOHRCOCRRHHCRHRROOIOHHR implements IIHRRHORCRCROCHHOHORCHCROCIHRO, Serializable {
   private static final long CRIRHHCHIHRHHIIORCHRIORORHHIHH = 7249069246863182397L;

   @Override
   final long fn(long var1, long var3) {
      return var1 + var3;
   }

   public CIOHHCORHRCCRICCCORIHCRHCCCRRR() {
   }

   @Override
   public void add(long var1) {
      RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH[] var3 = this.CIIRCHHCOCHRRHRRCOHOIIOROIHRIH;
      if (this.CIIRCHHCOCHRRHRRCOHOIIOROIHRIH == null) {
         long var4 = this.base;
         if (this.CRICCOOHHHCHOORCICOCOHIHOIRHOO(this.base, var4 + var1)) {
            return;
         }
      }

      boolean var11 = true;
      int[] var8;
      RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var9;
      int var10;
      if ((var8 = CRCOCCIORHCOOIRIRRCOIOROCIRRCI.get()) != null && var3 != null && (var10 = var3.length) >= 1 && (var9 = var3[var10 - 1 & var8[0]]) != null) {
         long var6 = var9.value;
         if (var11 = var9.HICHRCOHCCRHOHCICOOCHOIHCCHIRI(var9.value, var6 + var1)) {
            return;
         }
      }

      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var8, var11);
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
      RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH[] var3 = this.CIIRCHHCOCHRRHRRCOHOIIOROIHRIH;
      if (var3 != null) {
         for (RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var6 : var3) {
            if (var6 != null) {
               var1 += var6.value;
            }
         }
      }

      return var1;
   }

   public void reset() {
      this.OCCORIIORHORROHHROHHOORHIHRIOO(0L);
   }

   public long sumThenReset() {
      long var1 = this.base;
      RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH[] var3 = this.CIIRCHHCOCHRRHRRCOHOIIOROIHRIH;
      this.base = 0L;
      if (var3 != null) {
         for (RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var6 : var3) {
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
      this.CIIRCHHCOCHRRHRRCOHOIIOROIHRIH = null;
      this.base = var1.readLong();
   }
}
