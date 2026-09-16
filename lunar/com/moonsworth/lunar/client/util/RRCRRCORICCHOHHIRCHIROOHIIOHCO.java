package com.moonsworth.lunar.client.util;

import com.google.common.collect.AbstractIterator;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.objects.ObjectIntPair;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import org.jetbrains.annotations.Nullable;

public class RRCRRCORICCHOHHIRCHIROOHIIOHCO {
   @Nullable
   public static RORCHCIIICOHIRROOORHOCCCCIOCCI RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RORCHCIIICOHIRROOORHOCCCCIOCCI var0,
      int var1,
      int var2,
      Predicate<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RORCHCIIICOHIRROOORHOCCCCIOCCI> var3
   ) {
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RORCHCIIICOHIRROOORHOCCCCIOCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
         .IRCIIHHICIHRCOCRROCOICRIHHCCHH(0, 0, 0);

      for (byte var5 = 0; var5 <= var1; var5 = (byte)(var5 > 0 ? -var5 : 1 - var5)) {
         for (int var6 = 0; var6 < var2; var6++) {
            for (byte var7 = 0; var7 <= var6; var7 = (byte)(var7 > 0 ? -var7 : 1 - var7)) {
               for (byte var8 = (byte)(var7 < var6 && var7 > -var6 ? var6 : 0); var8 <= var6; var8 = (byte)(var8 > 0 ? -var8 : 1 - var8)) {
                  var4.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var7, var5 - 1, var8);
                  if (var3.test(var4)) {
                     return var4.RCOOHIIRCICOCRRRCCCIROCRRORIIC();
                  }
               }
            }
         }
      }

      return null;
   }

   public static com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RORCHCIIICOHIRROOORHOCCCCIOCCI IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RORCHCIIICOHIRROOORHOCCCCIOCCI var0,
      int var1,
      int var2,
      Predicate<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RORCHCIIICOHIRROOORHOCCCCIOCCI> var3
   ) {
      LinkedList var4 = new LinkedList();
      var4.add(var0);

      while (!var4.isEmpty()) {
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RORCHCIIICOHIRROOORHOCCCCIOCCI var5 = (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RORCHCIIICOHIRROOORHOCCCCIOCCI)var4.poll();
         if (var3.test(var5)) {
            return var5;
         }

         for (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var9 : com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.values()) {
            int var10 = var5.bridge$getX() + var9.getOffsetX();
            int var11 = var5.bridge$getY() + var9.getOffsetY();
            int var12 = var5.bridge$getZ() + var9.getOffsetX();
            if (Math.abs(var10 - var0.bridge$getX()) <= var2 && Math.abs(var11 - var0.bridge$getX()) <= var1 && Math.abs(var12 - var0.bridge$getX()) <= var2) {
               var4.add(
                  com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
                     .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var10, var11, var12)
               );
            }
         }
      }

      return null;
   }

   public static int RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var0,
      int var1,
      int var2,
      Predicate<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH> var3,
      BiConsumer<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH, Consumer<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH>> var4
   ) {
      ArrayDeque var5 = new ArrayDeque();
      LongOpenHashSet var6 = new LongOpenHashSet();
      var5.add(ObjectIntPair.of(var0, 0));
      int var7 = 0;

      while (!var5.isEmpty()) {
         ObjectIntPair var8 = (ObjectIntPair)var5.poll();
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var9 = (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH)var8.key();
         int var10 = var8.valueInt();
         if (var6.add(var9.bridge$asLong()) && var10 < var1 && var3.test(var9)) {
            if (++var7 >= var2) {
               return var7;
            }

            var4.accept(var9, var2x -> var5.add(ObjectIntPair.of(var2x, var10 + 1)));
         }
      }

      return var7;
   }

   public static Iterable<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      Random var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7
   ) {
      int var8 = var5 - var2 + 1;
      int var9 = var6 - var3 + 1;
      int var10 = var7 - var4 + 1;
      return () -> new AbstractIterator<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH>() {
         final com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RORCHCIIICOHIRROOORHOCCCCIOCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH CHCIRORCRHIHOOOHRHOHOCOCRIIROC = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
            .IRCIIHHICIHRCOCRROCOICRIHHCCHH(0, 0, 0);
         int counter = var1;

         protected com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH CRHHOOCCRHOCIRIHIIOHRHCOOOHHHH() {
            if (this.counter <= 0) {
               return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH)this.endOfData();
            }

            this.CHCIRORCRHIHOOOHRHOHOCOCRIIROC.bridge$setPos(var2 + var0.nextInt(var8), var3 + var0.nextInt(var9), var4 + var0.nextInt(var10));
            this.counter--;
            return this.CHCIRORCRHIHOOOHRHOHOCOCRIIROC.RCOOHIIRCICOCRRRCCCIROCRRORIIC();
         }
      };
   }
}
