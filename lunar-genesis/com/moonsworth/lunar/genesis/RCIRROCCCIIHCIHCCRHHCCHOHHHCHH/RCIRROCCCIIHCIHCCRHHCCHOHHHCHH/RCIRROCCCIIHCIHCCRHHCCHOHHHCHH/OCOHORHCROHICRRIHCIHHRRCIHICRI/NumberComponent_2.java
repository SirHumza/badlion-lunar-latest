package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI;

import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
public final class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   private IRCIIHHICIHRCOCRROCOICRIHHCCHH() {
   }

   public static int hashCode(byte var0) {
      return var0;
   }

   public static boolean contains(byte[] var0, byte var1) {
      for (byte var5 : var0) {
         if (var5 == var1) {
            return true;
         }
      }

      return false;
   }

   public static int indexOf(byte[] var0, byte var1) {
      return indexOf(var0, var1, 0, var0.length);
   }

   private static int indexOf(byte[] var0, byte var1, int var2, int var3) {
      for (int var4 = var2; var4 < var3; var4++) {
         if (var0[var4] == var1) {
            return var4;
         }
      }

      return -1;
   }

   public static int indexOf(byte[] var0, byte[] var1) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var0, "array");
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var1, "target");
      if (var1.length == 0) {
         return 0;
      }

      label28:
      for (int var2 = 0; var2 < var0.length - var1.length + 1; var2++) {
         for (int var3 = 0; var3 < var1.length; var3++) {
            if (var0[var2 + var3] != var1[var3]) {
               continue label28;
            }
         }

         return var2;
      }

      return -1;
   }

   public static int lastIndexOf(byte[] var0, byte var1) {
      return lastIndexOf(var0, var1, 0, var0.length);
   }

   private static int lastIndexOf(byte[] var0, byte var1, int var2, int var3) {
      for (int var4 = var3 - 1; var4 >= var2; var4--) {
         if (var0[var4] == var1) {
            return var4;
         }
      }

      return -1;
   }

   public static byte[] concat(byte[]... var0) {
      int var1 = 0;

      for (byte[] var5 : var0) {
         var1 += var5.length;
      }

      byte[] var8 = new byte[var1];
      int var9 = 0;

      for (byte[] var7 : var0) {
         System.arraycopy(var7, 0, var8, var9, var7.length);
         var9 += var7.length;
      }

      return var8;
   }

   public static byte[] ensureCapacity(byte[] var0, int var1, int var2) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(var1 >= 0, "Invalid minLength: %s", var1);
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(var2 >= 0, "Invalid padding: %s", var2);
      return var0.length < var1 ? Arrays.copyOf(var0, var1 + var2) : var0;
   }

   public static byte[] toArray(Collection<? extends Number> var0) {
      if (var0 instanceof IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH) {
         return ((IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var0).toByteArray();
      }

      Object[] var1 = var0.toArray();
      int var2 = var1.length;
      byte[] var3 = new byte[var2];

      for (int var4 = 0; var4 < var2; var4++) {
         var3[var4] = ((Number)IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var1[var4])).byteValue();
      }

      return var3;
   }

   public static List<Byte> asList(byte... var0) {
      return var0.length == 0 ? Collections.emptyList() : new IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0);
   }

   public static void reverse(byte[] var0) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var0);
      reverse(var0, 0, var0.length);
   }

   public static void reverse(byte[] var0, int var1, int var2) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var0);
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkPositionIndexes(var1, var2, var0.length);
      int var3 = var1;

      for (int var4 = var2 - 1; var3 < var4; var4--) {
         byte var5 = var0[var3];
         var0[var3] = var0[var4];
         var0[var4] = var5;
         var3++;
      }
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
   private static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends AbstractList<Byte> implements Serializable, RandomAccess {
      final byte[] IROIRICRIRRIRRIIHHRRICICCICOOO;
      final int OROIIIIOHOIOHROHOROOOHOCHOOIRO;
      final int OHHRHIHOOIOORHIRHRHICHHHRCHHRC;
      private static final long CRICCHOHHCRHIROIRCRIRHROOCOHIH = 0L;

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(byte[] var1) {
         this(var1, 0, var1.length);
      }

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(byte[] var1, int var2, int var3) {
         this.IROIRICRIRRIRRIIHHRRICICCICOOO = var1;
         this.OROIIIIOHOIOHROHOROOOHOCHOOIRO = var2;
         this.OHHRHIHOOIOORHIRHRHICHHHRCHHRC = var3;
      }

      @Override
      public int size() {
         return this.OHHRHIHOOIOORHIRHRHICHHHRCHHRC - this.OROIIIIOHOIOHROHOROOOHOCHOOIRO;
      }

      @Override
      public boolean isEmpty() {
         return false;
      }

      public Byte get(int var1) {
         IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkElementIndex(var1, this.size());
         return this.IROIRICRIRRIRRIIHHRRICICCICOOO[this.OROIIIIOHOIOHROHOROOOHOCHOOIRO + var1];
      }

      @Override
      public boolean contains(Object var1) {
         return var1 instanceof Byte
            && IRCIIHHICIHRCOCRROCOICRIHHCCHH.indexOf(
                  this.IROIRICRIRRIRRIIHHRRICICCICOOO, (Byte)var1, this.OROIIIIOHOIOHROHOROOOHOCHOOIRO, this.OHHRHIHOOIOORHIRHRHICHHHRCHHRC
               )
               != -1;
      }

      @Override
      public int indexOf(Object var1) {
         if (var1 instanceof Byte) {
            int var2 = IRCIIHHICIHRCOCRROCOICRIHHCCHH.indexOf(
               this.IROIRICRIRRIRRIIHHRRICICCICOOO, (Byte)var1, this.OROIIIIOHOIOHROHOROOOHOCHOOIRO, this.OHHRHIHOOIOORHIRHRHICHHHRCHHRC
            );
            if (var2 >= 0) {
               return var2 - this.OROIIIIOHOIOHROHOROOOHOCHOOIRO;
            }
         }

         return -1;
      }

      @Override
      public int lastIndexOf(Object var1) {
         if (var1 instanceof Byte) {
            int var2 = IRCIIHHICIHRCOCRROCOICRIHHCCHH.lastIndexOf(
               this.IROIRICRIRRIRRIIHHRRICICCICOOO, (Byte)var1, this.OROIIIIOHOIOHROHOROOOHOCHOOIRO, this.OHHRHIHOOIOORHIRHRHICHHHRCHHRC
            );
            if (var2 >= 0) {
               return var2 - this.OROIIIIOHOIOHROHOROOOHOCHOOIRO;
            }
         }

         return -1;
      }

      public Byte set(int var1, Byte var2) {
         IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkElementIndex(var1, this.size());
         byte var3 = this.IROIRICRIRRIRRIIHHRRICICCICOOO[this.OROIIIIOHOIOHROHOROOOHOCHOOIRO + var1];
         this.IROIRICRIRRIRRIIHHRRICICCICOOO[this.OROIIIIOHOIOHROHOROOOHOCHOOIRO + var1] = IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var2);
         return var3;
      }

      @Override
      public List<Byte> subList(int var1, int var2) {
         int var3 = this.size();
         IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkPositionIndexes(var1, var2, var3);
         return var1 == var2
            ? Collections.emptyList()
            : new IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               this.IROIRICRIRRIRRIIHHRRICICCICOOO, this.OROIIIIOHOIOHROHOROOOHOCHOOIRO + var1, this.OROIIIIOHOIOHROHOROOOHOCHOOIRO + var2
            );
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         if (var1 == this) {
            return true;
         }

         if (var1 instanceof IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH) {
            IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = (IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var1;
            int var3 = this.size();
            if (var2.size() != var3) {
               return false;
            }

            for (int var4 = 0; var4 < var3; var4++) {
               if (this.IROIRICRIRRIRRIIHHRRICICCICOOO[this.OROIIIIOHOIOHROHOROOOHOCHOOIRO + var4]
                  != var2.IROIRICRIRRIRRIIHHRRICICCICOOO[var2.OROIIIIOHOIOHROHOROOOHOCHOOIRO + var4]) {
                  return false;
               }
            }

            return true;
         } else {
            return super.equals(var1);
         }
      }

      @Override
      public int hashCode() {
         int var1 = 1;

         for (int var2 = this.OROIIIIOHOIOHROHOROOOHOCHOOIRO; var2 < this.OHHRHIHOOIOORHIRHRHICHHHRCHHRC; var2++) {
            var1 = 31 * var1 + IRCIIHHICIHRCOCRROCOICRIHHCCHH.hashCode(this.IROIRICRIRRIRRIIHHRRICICCICOOO[var2]);
         }

         return var1;
      }

      @Override
      public String toString() {
         StringBuilder var1 = new StringBuilder(this.size() * 5);
         var1.append('[').append(this.IROIRICRIRRIRRIIHHRRICICCICOOO[this.OROIIIIOHOIOHROHOROOOHOCHOOIRO]);

         for (int var2 = this.OROIIIIOHOIOHROHOROOOHOCHOOIRO + 1; var2 < this.OHHRHIHOOIOORHIRHRHICHHHRCHHRC; var2++) {
            var1.append(", ").append(this.IROIRICRIRRIRRIIHHRRICICCICOOO[var2]);
         }

         return var1.append(']').toString();
      }

      byte[] toByteArray() {
         return Arrays.copyOfRange(this.IROIRICRIRRIRRIIHHRRICICCICOOO, this.OROIIIIOHOIOHROHOROOOHOCHOOIRO, this.OHHRHIHOOIOORHIRHRHICHHHRCHHRC);
      }
   }
}
