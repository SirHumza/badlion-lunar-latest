package com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CIOHHCORHRCCRICCCORIHCRHCCCRRR;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class HICHRCOHCCRHOHCICOOCHOIHCCHIRI implements OOROOCCIRCCRHOIOIORIHCHHOOCCOR {
   private final byte RHCORIHRIORRHIRRRRCICOOORCRIHI = -1;
   private final ByteBuffer RRROICIORROHIOIHORHRICHCOOORCC;
   private final int RCHOHCHOICCORRROCRRRCOIHIROHOC;
   private final int HIRIHCROHHIHHHICRCHROHICCOHCHO;

   public HICHRCOHCCRHOHCICOOCHOIHCCHIRI(ByteBuffer var1, int var2, int var3) {
      this.RRROICIORROHIOIHORHRICHCOOORCC = var1;
      this.RCHOHCHOICCORRROCRRRCOIHIROHOC = var2;
      this.HIRIHCROHHIHHHICRCHROHICCOHCHO = var3;
   }

   public static ByteBuffer IIHRRHORCRCROCHHOHORCHCROCIHRO(int var0, int var1) {
      return ByteBuffer.allocateDirect(var0 * var1 * 4).order(ByteOrder.nativeOrder());
   }

   private byte OCOHORHCROHICRRIHCIHHRRCIHICRI(int var1, int var2) {
      if (var1 >= 0 && var2 >= 0 && var1 < this.RCHOHCHOICCORRROCRRRCOIHIROHOC && var2 < this.HIRIHCROHHIHHHICRCHROHICCOHCHO) {
         int var3 = (var1 + var2 * this.RCHOHCHOICCORRROCRRRCOIHIROHOC) * 4 + 3;
         return this.RRROICIORROHIOIHORHRICHCOOORCC.get(var3);
      } else {
         throw new IllegalArgumentException(
            "Image coordinates ("
               + var1
               + ", "
               + var2
               + ") out of bounds for image of dimensions "
               + this.RCHOHCHOICCORRROCRRRCOIHIROHOC
               + "x"
               + this.HIRIHCROHHIHHHICRCHROHICCOHCHO
         );
      }
   }

   @Override
   public int bridge$getWidth() {
      return this.RCHOHCHOICCORRROCRRRCOIHIROHOC;
   }

   @Override
   public int bridge$getHeight() {
      return this.HIRIHCROHHIHHHICRCHROHICCOHCHO;
   }

   @Override
   public boolean CRICCOOHHHCHOORCICOCOHIHOIRHOO(int var1, int var2) {
      return this.OCOHORHCROHICRRIHCIHHRRCIHICRI(var1, var2) != 0;
   }

   @Override
   public boolean HICHRCOHCCRHOHCICOOCHOIHCCHIRI(int var1, int var2) {
      return this.OCOHORHCROHICRRIHCIHHRRCIHICRI(var1, var2) == -1;
   }

   @Override
   public void close() {
   }
}
