package com.moonsworth.lunar.client.util;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import javax.annotation.Nullable;
import lombok.Generated;

public class IRCRRHRCIRHIHIHROHCRRHIIHHHHCH extends Random {
   @Nullable
   private Random RIORRICCRHICIIOOOCRCOOHRHHHRCI = null;

   private Random HIOIOIRRCIOIOOCRHIRHIRHHCROORO() {
      return this.RIORRICCRHICIIOOOCRCOOHRHHHRCI == null ? ThreadLocalRandom.current() : this.RIORRICCRHICIIOOOCRCOOHRHHHRCI;
   }

   @Override
   public synchronized void setSeed(long var1) {
      if (this.RIORRICCRHICIIOOOCRCOOHRHHHRCI == null) {
         this.RIORRICCRHICIIOOOCRCOOHRHHHRCI = new Random(var1);
      } else {
         this.RIORRICCRHICIIOOOCRCOOHRHHHRCI.setSeed(var1);
      }
   }

   @Override
   public boolean nextBoolean() {
      return this.HIOIOIRRCIOIOOCRHIRHIRHHCROORO().nextBoolean();
   }

   @Override
   public int nextInt() {
      return this.HIOIOIRRCIOIOOCRHIRHIRHHCROORO().nextInt();
   }

   @Override
   public int nextInt(int var1) {
      return this.HIOIOIRRCIOIOOCRHIRHIRHHCROORO().nextInt(var1);
   }

   @Override
   public int nextInt(int var1, int var2) {
      return this.HIOIOIRRCIOIOOCRHIRHIRHHCROORO().nextInt(var1, var2);
   }

   @Override
   public long nextLong() {
      return this.HIOIOIRRCIOIOOCRHIRHIRHHCROORO().nextLong();
   }

   @Override
   public long nextLong(long var1) {
      return this.HIOIOIRRCIOIOOCRHIRHIRHHCROORO().nextLong(var1);
   }

   @Override
   public long nextLong(long var1, long var3) {
      return this.HIOIOIRRCIOIOOCRHIRHIRHHCROORO().nextLong(var1, var3);
   }

   @Override
   public float nextFloat() {
      return this.HIOIOIRRCIOIOOCRHIRHIRHHCROORO().nextFloat();
   }

   @Override
   public float nextFloat(float var1) {
      return this.HIOIOIRRCIOIOOCRHIRHIRHHCROORO().nextFloat(var1);
   }

   @Override
   public float nextFloat(float var1, float var2) {
      return this.HIOIOIRRCIOIOOCRHIRHIRHHCROORO().nextFloat(var1, var2);
   }

   @Override
   public double nextDouble() {
      return this.HIOIOIRRCIOIOOCRHIRHIRHHCROORO().nextDouble();
   }

   @Override
   public double nextDouble(double var1) {
      return this.HIOIOIRRCIOIOOCRHIRHIRHHCROORO().nextDouble(var1);
   }

   @Override
   public double nextDouble(double var1, double var3) {
      return this.HIOIOIRRCIOIOOCRHIRHIRHHCROORO().nextDouble(var1, var3);
   }

   @Override
   public IntStream ints() {
      return this.HIOIOIRRCIOIOOCRHIRHIRHHCROORO().ints();
   }

   @Override
   public IntStream ints(long var1) {
      return this.HIOIOIRRCIOIOOCRHIRHIRHHCROORO().ints(var1);
   }

   @Override
   public IntStream ints(long var1, int var3, int var4) {
      return this.HIOIOIRRCIOIOOCRHIRHIRHHCROORO().ints(var1, var3, var4);
   }

   @Override
   public IntStream ints(int var1, int var2) {
      return this.HIOIOIRRCIOIOOCRHIRHIRHHCROORO().ints(var1, var2);
   }

   @Override
   public LongStream longs() {
      return this.HIOIOIRRCIOIOOCRHIRHIRHHCROORO().longs();
   }

   @Override
   public LongStream longs(long var1) {
      return this.HIOIOIRRCIOIOOCRHIRHIRHHCROORO().longs(var1);
   }

   @Override
   public LongStream longs(long var1, long var3, long var5) {
      return this.HIOIOIRRCIOIOOCRHIRHIRHHCROORO().longs(var1, var3, var5);
   }

   @Override
   public LongStream longs(long var1, long var3) {
      return this.HIOIOIRRCIOIOOCRHIRHIRHHCROORO().longs(var1, var3);
   }

   @Override
   public DoubleStream doubles() {
      return this.HIOIOIRRCIOIOOCRHIRHIRHHCROORO().doubles();
   }

   @Override
   public DoubleStream doubles(long var1) {
      return this.HIOIOIRRCIOIOOCRHIRHIRHHCROORO().doubles(var1);
   }

   @Override
   public DoubleStream doubles(long var1, double var3, double var5) {
      return this.HIOIOIRRCIOIOOCRHIRHIRHHCROORO().doubles(var1, var3, var5);
   }

   @Override
   public DoubleStream doubles(double var1, double var3) {
      return this.HIOIOIRRCIOIOOCRHIRHIRHHCROORO().doubles(var1, var3);
   }
}
