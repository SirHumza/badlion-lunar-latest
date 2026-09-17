package com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CIOHHCORHRCCRICCCORIHCRHCCCRRR;

import java.awt.image.BufferedImage;
import lombok.Generated;
import org.jetbrains.annotations.NotNull;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH implements OOROOCCIRCCRHOIOIORIHCHHOOCCOR {
   @NotNull
   private final BufferedImage image;

   @Override
   public int bridge$getWidth() {
      return this.image.getWidth();
   }

   @Override
   public int bridge$getHeight() {
      return this.image.getHeight();
   }

   @Override
   public boolean CRICCOOHHHCHOORCICOCOHIHOIRHOO(int var1, int var2) {
      return (this.image.getRGB(var1, var2) & 0xFF000000) != 0;
   }

   @Override
   public boolean HICHRCOHCCRHOHCICOOCHOIHCCHIRI(int var1, int var2) {
      return (this.image.getRGB(var1, var2) & 0xFF000000) == -16777216;
   }

   @Override
   public void close() {
   }

   @Generated
   public IRCIIHHICIHRCOCRROCOICRIHHCCHH(@NotNull BufferedImage var1) {
      if (var1 == null) {
         throw new NullPointerException("image is marked non-null but is null");
      }

      this.image = var1;
   }
}
