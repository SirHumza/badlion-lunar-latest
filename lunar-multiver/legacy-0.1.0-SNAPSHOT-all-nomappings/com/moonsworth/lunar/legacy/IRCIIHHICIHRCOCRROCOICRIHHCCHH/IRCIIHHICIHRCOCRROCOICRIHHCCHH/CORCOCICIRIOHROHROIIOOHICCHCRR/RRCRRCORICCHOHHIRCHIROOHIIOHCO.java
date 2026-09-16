package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CORCOCICIRIOHROHROIIOOHICCHCRR;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(targets = "org.lwjgl.opengl.WindowsMouse")
public abstract class RRCRRCORICCHOHHIRCHIROOHIIOHCO implements RIOOCHICIHRHOHCCCCCHOCCCOHCRHI {
   @Shadow
   private int last_x;
   @Shadow
   private int last_y;
   @Shadow
   private boolean mouse_grabbed;
   @Shadow
   private int accum_dx;
   @Shadow
   private int accum_dy;

   @Shadow
   public abstract boolean isGrabbed();

   @Shadow
   public abstract void handleMouseMoved(int var1, int var2, long var3);

   @Shadow
   protected abstract void putMouseEventWithCoords(byte var1, byte var2, int var3, int var4, int var5, long var6);

   public boolean bridge$isGrabbed() {
      return this.isGrabbed();
   }

   public void bridge$handleMouseMoved(int var1, int var2, long var3) {
      this.handleMouseMoved(var1, var2, var3);
   }

   public void bridge$handleMouseMovedRelative(int var1, int var2, long var3) {
      int var5 = var1 + this.last_x;
      int var6 = var2 + this.last_y;
      if (var1 != 0 || var2 != 0) {
         this.accum_dx += var1;
         this.accum_dy += var2;
         this.last_x = var5;
         this.last_y = var6;
         long var7 = var3 * 1000000L;
         if (this.mouse_grabbed) {
            this.putMouseEventWithCoords((byte)-1, (byte)0, var1, var2, 0, var7);
         } else {
            this.putMouseEventWithCoords((byte)-1, (byte)0, var5, var6, 0, var7);
         }
      }
   }
}
