package com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;

public interface ORHIOICIOCRRHOOCOHRORIHICHRCRR extends CORCOCICIRIOHROHROIIOOHICCHCRR {
   default boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Class<?> var1) {
      boolean var2 = var1.isInstance(this);
      if (this instanceof RIRHOCHIORCCIIOIIRHOCCCRHHCHHH) {
         var2 |= var1.isInstance(((RIRHOCHIORCCIIOIIRHOCCCRHHCHHH)this).RRIOOIOROCIRHRORIRHIRHIHOCHICH());
      }

      return var2;
   }

   void bridge$drawScreen(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      int var2,
      int var3,
      float var4
   );

   void bridge$setWorldAndResolution(int var1, int var2);

   void bridge$updateScreen();

   int bridge$getWidth();

   int bridge$getHeight();

   void bridge$mouseClicked(int var1, int var2, int var3);

   void bridge$mouseReleased(int var1, int var2, int var3);

   void bridge$mouseClickMove(int var1, int var2, int var3, long var4, double var6, double var8);

   boolean bridge$isShiftKeyDown();

   boolean bridge$isCtrlKeyDown();

   void bridge$mouseScrolled(int var1, int var2, double var3, double var5);

   void bridge$keyTyped(char var1, int var2, int var3);

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 6)
   default void bridge$keyReleased(int var1, int var2) {
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 6)
   default void bridge$charTyped(char var1, int var2) {
   }

   boolean bridge$hasTextFieldFocused();

   boolean bridge$allowUserInput();

   void bridge$setAllowUserInput(boolean var1);

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 22)
   default void bridge$setPanorama(RCIROOOOICRHCCRRCIORHHIRCOIIIC var1) {
   }

   default int bridge$getInventoryScale() {
      return 0;
   }

   default void bridge$setInventoryScale(int var1) {
   }

   default float bridge$getInventoryScaleFactor() {
      return 1.0F;
   }

   default void bridge$setInventoryScaleFactor(float var1) {
   }
}
