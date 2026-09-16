package com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CIOHHCORHRCCRICCCORIHCRHCCCRRR;

import java.nio.IntBuffer;

public interface OOROOCCIRCCRHOIOIORIHCHHOOCCOR extends AutoCloseable {
   int bridge$getWidth();

   int bridge$getHeight();

   boolean CRICCOOHHHCHOORCICOCOHIHOIRHOO(int var1, int var2);

   boolean HICHRCOHCCRHOHCICOOCHOIHCCHIRI(int var1, int var2);

   @Override
   void close();

   static OOROOCCIRCCRHOIOIORIHCHHOOCCOR RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(final int var0, final int var1, final IntBuffer var2) {
      return new OOROOCCIRCCRHOIOIORIHCHHOOCCOR() {
         @Override
         public int bridge$getWidth() {
            return var0;
         }

         @Override
         public int bridge$getHeight() {
            return var1;
         }

         @Override
         public boolean CRICCOOHHHCHOORCICOCOHIHOIRHOO(int var1x, int var2x) {
            int var3 = var0 * var2x + var1x;
            return (var2.get(var3) & 0xFF) != 0;
         }

         @Override
         public boolean HICHRCOHCCRHOHCICOOCHOIHCCHIRI(int var1x, int var2x) {
            int var3 = var0 * var2x + var1x;
            return (var2.get(var3) & 0xFF) == 255;
         }

         @Override
         public void close() {
         }
      };
   }
}
