package ch.randelshofer.fastdoubleparser;

import java.math.BigInteger;

class FftMultiplier {
   public static final double COS_0_25 = Math.cos(Math.PI / 4);
   public static final double SIN_0_25 = Math.sin(Math.PI / 4);
   private static final int FFT_THRESHOLD = 33220;
   private static final int MAX_MAG_LENGTH = 67108864;
   private static final int ROOTS3_CACHE_SIZE = 20;
   private static final int ROOTS_CACHE2_SIZE = 20;
   private static final int TOOM_COOK_THRESHOLD = 1920;
   private static volatile FftMultiplier.ComplexVector[] ROOTS2_CACHE = new FftMultiplier.ComplexVector[20];
   private static volatile FftMultiplier.ComplexVector[] ROOTS3_CACHE = new FftMultiplier.ComplexVector[20];

   static int bitsPerFftPoint(int var0) {
      if (var0 <= 9728) {
         return 19;
      } else if (var0 <= 18432) {
         return 18;
      } else if (var0 <= 69632) {
         return 17;
      } else if (var0 <= 262144) {
         return 16;
      } else if (var0 <= 983040) {
         return 15;
      } else if (var0 <= 3670016) {
         return 14;
      } else if (var0 <= 13631488) {
         return 13;
      } else if (var0 <= 25165824) {
         return 12;
      } else if (var0 <= 92274688) {
         return 11;
      } else if (var0 <= 335544320) {
         return 10;
      } else {
         return var0 <= 1207959552 ? 9 : 8;
      }
   }

   private static FftMultiplier.ComplexVector calculateRootsOfUnity(int var0) {
      if (var0 == 1) {
         FftMultiplier.ComplexVector var11 = new FftMultiplier.ComplexVector(1);
         var11.real(0, 1.0);
         var11.imag(0, 0.0);
         return var11;
      }

      FftMultiplier.ComplexVector var1 = new FftMultiplier.ComplexVector(var0);
      var1.set(0, 1.0, 0.0);
      double var2 = COS_0_25;
      double var4 = SIN_0_25;
      var1.set(var0 / 2, var2, var4);
      double var6 = (Math.PI / 2) / var0;

      for (int var8 = 1; var8 < var0 / 2; var8++) {
         double var9 = var6 * var8;
         var2 = Math.cos(var9);
         var4 = Math.sin(var9);
         var1.set(var8, var2, var4);
         var1.set(var0 - var8, var4, var2);
      }

      return var1;
   }

   private static void fft(FftMultiplier.ComplexVector var0, FftMultiplier.ComplexVector[] var1) {
      int var2 = var0.length;
      int var3 = 31 - Integer.numberOfLeadingZeros(var2);
      FftMultiplier.MutableComplex var4 = new FftMultiplier.MutableComplex();
      FftMultiplier.MutableComplex var5 = new FftMultiplier.MutableComplex();
      FftMultiplier.MutableComplex var6 = new FftMultiplier.MutableComplex();
      FftMultiplier.MutableComplex var7 = new FftMultiplier.MutableComplex();
      FftMultiplier.MutableComplex var8 = new FftMultiplier.MutableComplex();
      FftMultiplier.MutableComplex var9 = new FftMultiplier.MutableComplex();

      int var10;
      for (var10 = var3; var10 >= 2; var10 -= 2) {
         FftMultiplier.ComplexVector var11 = var1[var10 - 2];
         int var12 = 1 << var10;

         for (int var13 = 0; var13 < var2; var13 += var12) {
            for (int var14 = 0; var14 < var12 / 4; var14++) {
               var8.set(var11, var14);
               var8.squareInto(var9);
               int var15 = var13 + var14;
               int var16 = var13 + var14 + var12 / 4;
               int var17 = var13 + var14 + var12 / 2;
               int var18 = var13 + var14 + var12 * 3 / 4;
               var0.addInto(var15, var0, var16, var4);
               var4.add(var0, var17);
               var4.add(var0, var18);
               var0.subtractTimesIInto(var15, var0, var16, var5);
               var5.subtract(var0, var17);
               var5.addTimesI(var0, var18);
               var5.multiplyConjugate(var8);
               var0.subtractInto(var15, var0, var16, var6);
               var6.add(var0, var17);
               var6.subtract(var0, var18);
               var6.multiplyConjugate(var9);
               var0.addTimesIInto(var15, var0, var16, var7);
               var7.subtract(var0, var17);
               var7.subtractTimesI(var0, var18);
               var7.multiply(var8);
               var4.copyInto(var0, var15);
               var5.copyInto(var0, var16);
               var6.copyInto(var0, var17);
               var7.copyInto(var0, var18);
            }
         }
      }

      if (var10 > 0) {
         for (byte var19 = 0; var19 < var2; var19 += 2) {
            var0.copyInto(var19, var4);
            var0.copyInto(var19 + 1, var5);
            var0.add(var19, var5);
            var4.subtractInto(var5, var0, var19 + 1);
         }
      }
   }

   private static void fft3(FftMultiplier.ComplexVector var0, FftMultiplier.ComplexVector var1, FftMultiplier.ComplexVector var2, int var3, double var4) {
      double var6 = var3 * -0.5 * Math.sqrt(3.0);

      for (int var8 = 0; var8 < var0.length; var8++) {
         double var9 = var0.real(var8) + var1.real(var8) + var2.real(var8);
         double var11 = var0.imag(var8) + var1.imag(var8) + var2.imag(var8);
         double var13 = var6 * (var2.imag(var8) - var1.imag(var8));
         double var15 = var6 * (var1.real(var8) - var2.real(var8));
         double var17 = 0.5 * (var1.real(var8) + var2.real(var8));
         double var19 = 0.5 * (var1.imag(var8) + var2.imag(var8));
         double var21 = var0.real(var8) - var17 + var13;
         double var23 = var0.imag(var8) + var15 - var19;
         double var25 = var0.real(var8) - var17 - var13;
         double var27 = var0.imag(var8) - var15 - var19;
         var0.real(var8, var9 * var4);
         var0.imag(var8, var11 * var4);
         var1.real(var8, var21 * var4);
         var1.imag(var8, var23 * var4);
         var2.real(var8, var25 * var4);
         var2.imag(var8, var27 * var4);
      }
   }

   private static void fftMixedRadix(FftMultiplier.ComplexVector var0, FftMultiplier.ComplexVector[] var1, FftMultiplier.ComplexVector var2) {
      int var3 = var0.length / 3;
      FftMultiplier.ComplexVector var4 = new FftMultiplier.ComplexVector(var0, 0, var3);
      FftMultiplier.ComplexVector var5 = new FftMultiplier.ComplexVector(var0, var3, var3 * 2);
      FftMultiplier.ComplexVector var6 = new FftMultiplier.ComplexVector(var0, var3 * 2, var0.length);
      fft3(var4, var5, var6, 1, 1.0);
      FftMultiplier.MutableComplex var7 = new FftMultiplier.MutableComplex();

      for (int var8 = 0; var8 < var0.length / 4; var8++) {
         var7.set(var2, var8);
         var5.multiplyConjugate(var8, var7);
         var6.multiplyConjugate(var8, var7);
         var6.multiplyConjugate(var8, var7);
      }

      for (int var9 = var0.length / 4; var9 < var3; var9++) {
         var7.set(var2, var9 - var0.length / 4);
         var5.multiplyConjugateTimesI(var9, var7);
         var6.multiplyConjugateTimesI(var9, var7);
         var6.multiplyConjugateTimesI(var9, var7);
      }

      fft(var4, var1);
      fft(var5, var1);
      fft(var6, var1);
   }

   static BigInteger fromFftVector(FftMultiplier.ComplexVector var0, int var1, int var2) {
      assert var2 <= 25 : var2 + " does not fit into an int with slack";
      int var3 = (int)Math.min(var0.length, 2147483648L / var2 + 1L);
      int var4 = (int)(8L * ((long)var3 * var2 + 31L) / 32L);
      byte[] var5 = new byte[var4];
      int var6 = 1 << var2;
      int var7 = var6 - 1;
      int var8 = 32 - var2;
      long var9 = 0L;
      int var11 = var5.length * 8;
      int var12 = var11 - var2;
      int var13 = 0;
      int var14 = Math.min(Math.max(0, var12 >> 3), var5.length - 4);

      for (int var15 = 0; var15 <= 1; var15++) {
         for (int var16 = 0; var16 < var3; var16++) {
            long var17 = Math.round(var0.part(var16, var15)) + var9;
            var9 = var17 >> var2;
            int var19 = Math.min(Math.max(0, var12 >> 3), var5.length - 4);
            int var21 = var13 >>> (var14 - var19 << 3);
            int var20 = var8 - var12 + (var19 << 3);
            var13 = (int)(var21 | (var17 & var7) << var20);
            FastDoubleSwar.writeIntBE(var5, var19, var13);
            var14 = var19;
            var12 -= var2;
         }
      }

      return new BigInteger(var1, var5);
   }

   private static FftMultiplier.ComplexVector[] getRootsOfUnity2(int var0) {
      FftMultiplier.ComplexVector[] var1 = new FftMultiplier.ComplexVector[var0 + 1];

      for (int var2 = var0; var2 >= 0; var2 -= 2) {
         if (var2 < 20) {
            if (ROOTS2_CACHE[var2] == null) {
               ROOTS2_CACHE[var2] = calculateRootsOfUnity(1 << var2);
            }

            var1[var2] = ROOTS2_CACHE[var2];
         } else {
            var1[var2] = calculateRootsOfUnity(1 << var2);
         }
      }

      return var1;
   }

   private static FftMultiplier.ComplexVector getRootsOfUnity3(int var0) {
      if (var0 < 20) {
         if (ROOTS3_CACHE[var0] == null) {
            ROOTS3_CACHE[var0] = calculateRootsOfUnity(3 << var0);
         }

         return ROOTS3_CACHE[var0];
      } else {
         return calculateRootsOfUnity(3 << var0);
      }
   }

   private static void ifft(FftMultiplier.ComplexVector var0, FftMultiplier.ComplexVector[] var1) {
      int var2 = var0.length;
      int var3 = 31 - Integer.numberOfLeadingZeros(var2);
      FftMultiplier.MutableComplex var4 = new FftMultiplier.MutableComplex();
      FftMultiplier.MutableComplex var5 = new FftMultiplier.MutableComplex();
      FftMultiplier.MutableComplex var6 = new FftMultiplier.MutableComplex();
      FftMultiplier.MutableComplex var7 = new FftMultiplier.MutableComplex();
      FftMultiplier.MutableComplex var8 = new FftMultiplier.MutableComplex();
      FftMultiplier.MutableComplex var9 = new FftMultiplier.MutableComplex();
      FftMultiplier.MutableComplex var10 = new FftMultiplier.MutableComplex();
      FftMultiplier.MutableComplex var11 = new FftMultiplier.MutableComplex();
      int var12 = 1;
      if (var3 % 2 != 0) {
         for (byte var13 = 0; var13 < var2; var13 += 2) {
            var0.copyInto(var13 + 1, var6);
            var0.copyInto(var13, var4);
            var0.add(var13, var6);
            var4.subtractInto(var6, var0, var13 + 1);
         }

         var12++;
      }

      FftMultiplier.MutableComplex var23 = new FftMultiplier.MutableComplex();
      FftMultiplier.MutableComplex var14 = new FftMultiplier.MutableComplex();

      while (var12 <= var3) {
         FftMultiplier.ComplexVector var15 = var1[var12 - 1];
         int var16 = 1 << var12 + 1;

         for (int var17 = 0; var17 < var2; var17 += var16) {
            for (int var18 = 0; var18 < var16 / 4; var18++) {
               var23.set(var15, var18);
               var23.squareInto(var14);
               int var19 = var17 + var18;
               int var20 = var17 + var18 + var16 / 4;
               int var21 = var17 + var18 + var16 / 2;
               int var22 = var17 + var18 + var16 * 3 / 4;
               var0.copyInto(var19, var4);
               var0.multiplyInto(var20, var23, var5);
               var0.multiplyInto(var21, var14, var6);
               var0.multiplyConjugateInto(var22, var23, var7);
               var4.addInto(var5, var8);
               var8.add(var6);
               var8.add(var7);
               var4.addTimesIInto(var5, var9);
               var9.subtract(var6);
               var9.subtractTimesI(var7);
               var4.subtractInto(var5, var10);
               var10.add(var6);
               var10.subtract(var7);
               var4.subtractTimesIInto(var5, var11);
               var11.subtract(var6);
               var11.addTimesI(var7);
               var8.copyInto(var0, var19);
               var9.copyInto(var0, var20);
               var10.copyInto(var0, var21);
               var11.copyInto(var0, var22);
            }
         }

         var12 += 2;
      }

      for (int var24 = 0; var24 < var2; var24++) {
         var0.timesTwoToThe(var24, -var3);
      }
   }

   private static void ifftMixedRadix(FftMultiplier.ComplexVector var0, FftMultiplier.ComplexVector[] var1, FftMultiplier.ComplexVector var2) {
      int var3 = var0.length / 3;
      FftMultiplier.ComplexVector var4 = new FftMultiplier.ComplexVector(var0, 0, var3);
      FftMultiplier.ComplexVector var5 = new FftMultiplier.ComplexVector(var0, var3, var3 * 2);
      FftMultiplier.ComplexVector var6 = new FftMultiplier.ComplexVector(var0, var3 * 2, var0.length);
      ifft(var4, var1);
      ifft(var5, var1);
      ifft(var6, var1);
      FftMultiplier.MutableComplex var7 = new FftMultiplier.MutableComplex();

      for (int var8 = 0; var8 < var0.length / 4; var8++) {
         var7.set(var2, var8);
         var5.multiply(var8, var7);
         var6.multiply(var8, var7);
         var6.multiply(var8, var7);
      }

      for (int var9 = var0.length / 4; var9 < var3; var9++) {
         var7.set(var2, var9 - var0.length / 4);
         var5.multiplyByIAnd(var9, var7);
         var6.multiplyByIAnd(var9, var7);
         var6.multiplyByIAnd(var9, var7);
      }

      fft3(var4, var5, var6, -1, 0.3333333333333333);
   }

   static BigInteger multiply(BigInteger var0, BigInteger var1) {
      if (var1.signum() == 0 || var0.signum() == 0) {
         return BigInteger.ZERO;
      } else if (var1 == var0) {
         return square(var1);
      } else {
         int var2 = var0.bitLength();
         int var3 = var1.bitLength();
         if ((long)var2 + var3 > 2147483648L) {
            throw new ArithmeticException("BigInteger would overflow supported range");
         } else {
            return var2 <= 1920 || var3 <= 1920 || var2 <= 33220 && var3 <= 33220 ? var0.multiply(var1) : multiplyFft(var0, var1);
         }
      }
   }

   static BigInteger multiplyFft(BigInteger var0, BigInteger var1) {
      int var2 = var0.signum() * var1.signum();
      byte[] var3 = (var0.signum() < 0 ? var0.negate() : var0).toByteArray();
      byte[] var4 = (var1.signum() < 0 ? var1.negate() : var1).toByteArray();
      int var5 = Math.max(var3.length, var4.length) * 8;
      int var6 = bitsPerFftPoint(var5);
      int var7 = (var5 + var6 - 1) / var6 + 1;
      int var8 = 32 - Integer.numberOfLeadingZeros(var7 - 1);
      int var9 = 1 << var8;
      int var10 = var9 * 3 / 4;
      if (var7 < var10 && var8 > 3) {
         FftMultiplier.ComplexVector[] var16 = getRootsOfUnity2(var8 - 2);
         FftMultiplier.ComplexVector var17 = getRootsOfUnity3(var8 - 2);
         FftMultiplier.ComplexVector var18 = getRootsOfUnity3(var8 - 4);
         FftMultiplier.ComplexVector var14 = toFftVector(var3, var10, var6);
         var14.applyWeights(var17);
         fftMixedRadix(var14, var16, var18);
         FftMultiplier.ComplexVector var15 = toFftVector(var4, var10, var6);
         var15.applyWeights(var17);
         fftMixedRadix(var15, var16, var18);
         var14.multiplyPointwise(var15);
         ifftMixedRadix(var14, var16, var18);
         var14.applyInverseWeights(var17);
         return fromFftVector(var14, var2, var6);
      } else {
         FftMultiplier.ComplexVector[] var11 = getRootsOfUnity2(var8);
         FftMultiplier.ComplexVector var12 = toFftVector(var3, var9, var6);
         var12.applyWeights(var11[var8]);
         fft(var12, var11);
         FftMultiplier.ComplexVector var13 = toFftVector(var4, var9, var6);
         var13.applyWeights(var11[var8]);
         fft(var13, var11);
         var12.multiplyPointwise(var13);
         ifft(var12, var11);
         var12.applyInverseWeights(var11[var8]);
         return fromFftVector(var12, var2, var6);
      }
   }

   static BigInteger square(BigInteger var0) {
      if (var0.signum() == 0) {
         return BigInteger.ZERO;
      } else {
         return var0.bitLength() < 33220 ? var0.multiply(var0) : squareFft(var0);
      }
   }

   static BigInteger squareFft(BigInteger var0) {
      byte[] var1 = var0.toByteArray();
      int var2 = var1.length * 8;
      int var3 = bitsPerFftPoint(var2);
      int var4 = (var2 + var3 - 1) / var3 + 1;
      int var5 = 32 - Integer.numberOfLeadingZeros(var4 - 1);
      int var6 = 1 << var5;
      int var7 = var6 * 3 / 4;
      if (var4 < var7) {
         var4 = var7;
         FftMultiplier.ComplexVector var14 = toFftVector(var1, var4, var3);
         FftMultiplier.ComplexVector[] var15 = getRootsOfUnity2(var5 - 2);
         FftMultiplier.ComplexVector var10 = getRootsOfUnity3(var5 - 2);
         FftMultiplier.ComplexVector var11 = getRootsOfUnity3(var5 - 4);
         var14.applyWeights(var10);
         fftMixedRadix(var14, var15, var11);
         var14.squarePointwise();
         ifftMixedRadix(var14, var15, var11);
         var14.applyInverseWeights(var10);
         return fromFftVector(var14, 1, var3);
      } else {
         var4 = var6;
         FftMultiplier.ComplexVector var8 = toFftVector(var1, var4, var3);
         FftMultiplier.ComplexVector[] var9 = getRootsOfUnity2(var5);
         var8.applyWeights(var9[var5]);
         fft(var8, var9);
         var8.squarePointwise();
         ifft(var8, var9);
         var8.applyInverseWeights(var9[var5]);
         return fromFftVector(var8, 1, var3);
      }
   }

   static FftMultiplier.ComplexVector toFftVector(byte[] var0, int var1, int var2) {
      assert var2 <= 25 : var2 + " does not fit into an int with slack";
      FftMultiplier.ComplexVector var3 = new FftMultiplier.ComplexVector(var1);
      if (var0.length < 4) {
         byte[] var4 = new byte[4];
         System.arraycopy(var0, 0, var4, 4 - var0.length, var0.length);
         var0 = var4;
      }

      int var15 = 1 << var2;
      int var5 = var15 / 2;
      int var6 = var15 - 1;
      int var7 = 32 - var2;
      int var8 = var0.length * 8;
      int var9 = 0;
      int var10 = 0;

      for (int var11 = var8 - var2; var11 > -var2; var11 -= var2) {
         int var12 = Math.min(Math.max(0, var11 >> 3), var0.length - 4);
         int var13 = var7 - var11 + (var12 << 3);
         int var14 = FastDoubleSwar.readIntBE(var0, var12) >>> var13 & var6;
         var14 += var9;
         var9 = var5 - var14 >>> 31;
         var14 -= var15 & -var9;
         var3.real(var10, var14);
         var10++;
      }

      if (var9 > 0) {
         var3.real(var10, var9);
      }

      return var3;
   }

   static final class ComplexVector {
      private static final int COMPLEX_SIZE_SHIFT = 1;
      private static final int IMAG = 1;
      private static final int REAL = 0;
      private final double[] a;
      private final int length;
      private final int offset;

      ComplexVector(int var1) {
         this.a = new double[var1 << 1];
         this.length = var1;
         this.offset = 0;
      }

      ComplexVector(FftMultiplier.ComplexVector var1, int var2, int var3) {
         this.length = var3 - var2;
         this.a = var1.a;
         this.offset = var2 << 1;
      }

      void add(int var1, FftMultiplier.MutableComplex var2) {
         this.a[this.realIdx(var1)] += var2.real;
         this.a[this.imagIdx(var1)] += var2.imag;
      }

      void addInto(int var1, FftMultiplier.ComplexVector var2, int var3, FftMultiplier.MutableComplex var4) {
         var4.real = this.a[this.realIdx(var1)] + var2.real(var3);
         var4.imag = this.a[this.imagIdx(var1)] + var2.imag(var3);
      }

      void addTimesIInto(int var1, FftMultiplier.ComplexVector var2, int var3, FftMultiplier.MutableComplex var4) {
         var4.real = this.a[this.realIdx(var1)] - var2.imag(var3);
         var4.imag = this.a[this.imagIdx(var1)] + var2.real(var3);
      }

      void applyInverseWeights(FftMultiplier.ComplexVector var1) {
         int var2 = this.offset;
         int var3 = var1.offset;
         double[] var4 = var1.a;

         for (int var5 = 0; var5 < this.length; var5++) {
            double var6 = this.a[var2 + 0];
            double var8 = this.a[var2 + 1];
            this.a[var2] = FastDoubleSwar.fma(var6, var4[var3 + 0], var8 * var4[var3 + 1]);
            this.a[var2 + 1] = FastDoubleSwar.fma(-var6, var4[var3 + 1], var8 * var4[var3 + 0]);
            var2 += 2;
            var3 += 2;
         }
      }

      void applyWeights(FftMultiplier.ComplexVector var1) {
         int var2 = var1.offset;
         double[] var3 = var1.a;
         int var4 = this.offset + this.length << 1;

         for (int var5 = this.offset; var5 < var4; var5 += 2) {
            double var6 = this.a[var5 + 0];
            this.a[var5 + 0] = var6 * var3[var2 + 0];
            this.a[var5 + 1] = var6 * var3[var2 + 1];
            var2 += 2;
         }
      }

      void copyInto(int var1, FftMultiplier.MutableComplex var2) {
         var2.real = this.a[this.realIdx(var1)];
         var2.imag = this.a[this.imagIdx(var1)];
      }

      double imag(int var1) {
         return this.a[(var1 << 1) + this.offset + 1];
      }

      void imag(int var1, double var2) {
         this.a[(var1 << 1) + this.offset + 1] = var2;
      }

      private int imagIdx(int var1) {
         return (var1 << 1) + this.offset + 1;
      }

      void multiply(int var1, FftMultiplier.MutableComplex var2) {
         int var3 = this.realIdx(var1);
         int var4 = this.imagIdx(var1);
         double var5 = this.a[var3];
         double var7 = this.a[var4];
         this.a[var3] = FastDoubleSwar.fma(var5, var2.real, -var7 * var2.imag);
         this.a[var4] = FastDoubleSwar.fma(var5, var2.imag, var7 * var2.real);
      }

      void multiplyByIAnd(int var1, FftMultiplier.MutableComplex var2) {
         int var3 = this.realIdx(var1);
         int var4 = this.imagIdx(var1);
         double var5 = this.a[var3];
         double var7 = this.a[var4];
         this.a[var3] = FastDoubleSwar.fma(-var5, var2.imag, -var7 * var2.real);
         this.a[var4] = FastDoubleSwar.fma(var5, var2.real, -var7 * var2.imag);
      }

      void multiplyConjugate(int var1, FftMultiplier.MutableComplex var2) {
         int var3 = this.realIdx(var1);
         int var4 = this.imagIdx(var1);
         double var5 = this.a[var3];
         double var7 = this.a[var4];
         this.a[var3] = FastDoubleSwar.fma(var5, var2.real, var7 * var2.imag);
         this.a[var4] = FastDoubleSwar.fma(-var5, var2.imag, var7 * var2.real);
      }

      void multiplyConjugateInto(int var1, FftMultiplier.MutableComplex var2, FftMultiplier.MutableComplex var3) {
         double var4 = this.a[this.realIdx(var1)];
         double var6 = this.a[this.imagIdx(var1)];
         var3.real = FastDoubleSwar.fma(var4, var2.real, var6 * var2.imag);
         var3.imag = FastDoubleSwar.fma(-var4, var2.imag, var6 * var2.real);
      }

      void multiplyConjugateTimesI(int var1, FftMultiplier.MutableComplex var2) {
         int var3 = this.realIdx(var1);
         int var4 = this.imagIdx(var1);
         double var5 = this.a[var3];
         double var7 = this.a[var4];
         this.a[var3] = FastDoubleSwar.fma(-var5, var2.imag, var7 * var2.real);
         this.a[var4] = FastDoubleSwar.fma(-var5, var2.real, -var7 * var2.imag);
      }

      void multiplyInto(int var1, FftMultiplier.MutableComplex var2, FftMultiplier.MutableComplex var3) {
         double var4 = this.a[this.realIdx(var1)];
         double var6 = this.a[this.imagIdx(var1)];
         var3.real = FastDoubleSwar.fma(var4, var2.real, -var6 * var2.imag);
         var3.imag = FastDoubleSwar.fma(var4, var2.imag, var6 * var2.real);
      }

      void multiplyPointwise(FftMultiplier.ComplexVector var1) {
         int var2 = var1.offset;
         double[] var3 = var1.a;
         int var4 = this.offset + this.length << 1;

         for (int var5 = this.offset; var5 < var4; var5 += 2) {
            double var6 = this.a[var5 + 0];
            double var8 = this.a[var5 + 1];
            double var10 = var3[var2 + 0];
            double var12 = var3[var2 + 1];
            this.a[var5 + 0] = FastDoubleSwar.fma(var6, var10, -var8 * var12);
            this.a[var5 + 1] = FastDoubleSwar.fma(var6, var12, var8 * var10);
            var2 += 2;
         }
      }

      double part(int var1, int var2) {
         return this.a[(var1 << 1) + var2];
      }

      double real(int var1) {
         return this.a[(var1 << 1) + this.offset];
      }

      void real(int var1, double var2) {
         this.a[(var1 << 1) + this.offset] = var2;
      }

      private int realIdx(int var1) {
         return (var1 << 1) + this.offset;
      }

      void set(int var1, double var2, double var4) {
         int var6 = this.realIdx(var1);
         this.a[var6] = var2;
         this.a[var6 + 1] = var4;
      }

      void squarePointwise() {
         int var1 = this.offset + this.length << 1;

         for (int var2 = this.offset; var2 < var1; var2 += 2) {
            double var3 = this.a[var2 + 0];
            double var5 = this.a[var2 + 1];
            this.a[var2 + 0] = FastDoubleSwar.fma(var3, var3, -var5 * var5);
            this.a[var2 + 1] = 2.0 * var3 * var5;
         }
      }

      void subtractInto(int var1, FftMultiplier.ComplexVector var2, int var3, FftMultiplier.MutableComplex var4) {
         var4.real = this.a[this.realIdx(var1)] - var2.real(var3);
         var4.imag = this.a[this.imagIdx(var1)] - var2.imag(var3);
      }

      void subtractTimesIInto(int var1, FftMultiplier.ComplexVector var2, int var3, FftMultiplier.MutableComplex var4) {
         var4.real = this.a[this.realIdx(var1)] + var2.imag(var3);
         var4.imag = this.a[this.imagIdx(var1)] - var2.real(var3);
      }

      void timesTwoToThe(int var1, int var2) {
         int var3 = this.realIdx(var1);
         int var4 = this.imagIdx(var1);
         double var5 = this.a[var3];
         double var7 = this.a[var4];
         this.a[var3] = Math.scalb(var5, var2);
         this.a[var4] = Math.scalb(var7, var2);
      }
   }

   static final class MutableComplex {
      double real;
      double imag;

      void add(FftMultiplier.MutableComplex var1) {
         this.real = this.real + var1.real;
         this.imag = this.imag + var1.imag;
      }

      void add(FftMultiplier.ComplexVector var1, int var2) {
         this.real = this.real + var1.real(var2);
         this.imag = this.imag + var1.imag(var2);
      }

      void addInto(FftMultiplier.MutableComplex var1, FftMultiplier.MutableComplex var2) {
         var2.real = this.real + var1.real;
         var2.imag = this.imag + var1.imag;
      }

      void addTimesI(FftMultiplier.MutableComplex var1) {
         this.real = this.real - var1.imag;
         this.imag = this.imag + var1.real;
      }

      void addTimesI(FftMultiplier.ComplexVector var1, int var2) {
         this.real = this.real - var1.imag(var2);
         this.imag = this.imag + var1.real(var2);
      }

      void addTimesIInto(FftMultiplier.MutableComplex var1, FftMultiplier.MutableComplex var2) {
         var2.real = this.real - var1.imag;
         var2.imag = this.imag + var1.real;
      }

      void copyInto(FftMultiplier.ComplexVector var1, int var2) {
         var1.real(var2, this.real);
         var1.imag(var2, this.imag);
      }

      void multiply(FftMultiplier.MutableComplex var1) {
         double var2 = this.real;
         this.real = FastDoubleSwar.fma(var2, var1.real, -this.imag * var1.imag);
         this.imag = FastDoubleSwar.fma(var2, var1.imag, this.imag * var1.real);
      }

      void multiplyConjugate(FftMultiplier.MutableComplex var1) {
         double var2 = this.real;
         this.real = FastDoubleSwar.fma(var2, var1.real, this.imag * var1.imag);
         this.imag = FastDoubleSwar.fma(-var2, var1.imag, this.imag * var1.real);
      }

      void set(FftMultiplier.ComplexVector var1, int var2) {
         this.real = var1.real(var2);
         this.imag = var1.imag(var2);
      }

      void squareInto(FftMultiplier.MutableComplex var1) {
         var1.real = FastDoubleSwar.fma(this.real, this.real, -this.imag * this.imag);
         var1.imag = 2.0 * this.real * this.imag;
      }

      void subtract(FftMultiplier.MutableComplex var1) {
         this.real = this.real - var1.real;
         this.imag = this.imag - var1.imag;
      }

      void subtract(FftMultiplier.ComplexVector var1, int var2) {
         this.real = this.real - var1.real(var2);
         this.imag = this.imag - var1.imag(var2);
      }

      void subtractInto(FftMultiplier.MutableComplex var1, FftMultiplier.MutableComplex var2) {
         var2.real = this.real - var1.real;
         var2.imag = this.imag - var1.imag;
      }

      void subtractInto(FftMultiplier.MutableComplex var1, FftMultiplier.ComplexVector var2, int var3) {
         var2.real(var3, this.real - var1.real);
         var2.imag(var3, this.imag - var1.imag);
      }

      void subtractTimesI(FftMultiplier.MutableComplex var1) {
         this.real = this.real + var1.imag;
         this.imag = this.imag - var1.real;
      }

      void subtractTimesI(FftMultiplier.ComplexVector var1, int var2) {
         this.real = this.real + var1.imag(var2);
         this.imag = this.imag - var1.real(var2);
      }

      void subtractTimesIInto(FftMultiplier.MutableComplex var1, FftMultiplier.MutableComplex var2) {
         var2.real = this.real + var1.imag;
         var2.imag = this.imag - var1.real;
      }
   }
}
