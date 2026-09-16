package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CORCOCICIRIOHROHROIIOOHICCHCRR;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;
import com.moonsworth.lunar.ichor.util.CORCOCICIRIOHROHROIIOOHICCHCRR;
import org.lwjgl.opengl.Display;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Coerce;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Slice;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(targets = "org.lwjgl.opengl.WindowsDisplay")
public abstract class CRRRICCRROCOHHOHIICIHORCOORRRH
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO {
   @Final
   @Shadow
   private static int WM_XBUTTONDOWN;
   @Final
   @Shadow
   private static int XBUTTON1;
   @Shadow
   private long hwnd;
   @Unique
   private Object lunar$mouse = null;
   @Unique
   private boolean lunar$useRawInput = false;
   @Unique
   private boolean lunar$rawInputEnabled = false;

   @Shadow
   protected abstract void handleMouseButton(int var1, int var2, long var3);

   @Shadow
   private static int transformY(long var0, int var2) {
      throw new AssertionError();
   }

   @Shadow
   protected abstract long getHwnd();

   @Shadow
   private static native long defWindowProc(long var0, int var2, long var3, long var5);

   @Unique
   private native void nToggleRawInput(long var1, boolean var3);

   @Unique
   private native boolean nGetRawMouseCoords(long var1, CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3);

   @Inject(method = "doHandleMessage", at = @At("HEAD"), cancellable = true)
   private void lunar$doHandleMessage(long var1, int var3, long var4, long var6, long var8, CallbackInfoReturnable<Long> var10) {
      if (var3 == WM_XBUTTONDOWN && var4 >> 16 == XBUTTON1) {
         this.handleMouseButton(3, 1, var8);
         var10.setReturnValue(1L);
      }
   }

   public long bridge$getDisplayHandle() {
      return 0L;
   }

   public long bridge$getWindowHandle() {
      return this.hwnd;
   }

   public void bridge$toggleRawInput(boolean var1) {
      if (!Display.isCreated()) {
         throw new IllegalStateException("Display not yet created.");
      }

      this.lunar$useRawInput = var1;
      boolean var2 = this.lunar$useRawInput && this.lunar$mouse != null && ((RIOOCHICIHRHOHCCCCCHOCCCOHCRHI)this.lunar$mouse).bridge$isGrabbed();
      if (this.lunar$rawInputEnabled != var2) {
         this.nToggleRawInput(this.hwnd, var2);
         this.lunar$rawInputEnabled = var2;
      }
   }

   @Inject(method = "createWindow", at = @At("TAIL"))
   private void lunar$rawMouseInput$createWindow$tail(CallbackInfo var1) {
      boolean var2 = this.lunar$useRawInput && this.lunar$mouse != null && ((RIOOCHICIHRHOHCCCCCHOCCCOHCRHI)this.lunar$mouse).bridge$isGrabbed();
      if (this.lunar$rawInputEnabled != var2) {
         this.nToggleRawInput(this.hwnd, var2);
         this.lunar$rawInputEnabled = var2;
      }
   }

   @Inject(method = "destroyWindow", at = @At("TAIL"))
   private void lunar$rawMouseInput$destroyWindow$tail(CallbackInfo var1) {
      this.lunar$rawInputEnabled = false;
   }

   @WrapOperation(method = "createMouse", at = @At(value = "NEW", target = "(J)Lorg/lwjgl/opengl/WindowsMouse;"))
   @Coerce
   private Object lunar$rawMouseInput$createMouse(long var1, Operation<Object> var3) {
      return this.lunar$mouse = var3.call(new Object[]{var1});
   }

   @Inject(method = "destroyMouse", at = @At("TAIL"))
   private void lunar$rawMouseInput$destroyMouse(CallbackInfo var1) {
      this.lunar$mouse = null;
   }

   @Inject(method = "grabMouse", at = @At("TAIL"))
   private void lunar$rawMouseInput$grabMouse(boolean var1, CallbackInfo var2) {
      boolean var3 = var1 && this.lunar$useRawInput;
      if (this.lunar$rawInputEnabled != var3) {
         this.nToggleRawInput(this.hwnd, var3);
         this.lunar$rawInputEnabled = var3;
      }
   }

   @ModifyExpressionValue(
      method = "doHandleMessage",
      at = @At(value = "FIELD", target = "Lorg/lwjgl/opengl/WindowsDisplay;mouse:Lorg/lwjgl/opengl/WindowsMouse;", opcode = 180, ordinal = 0)
   )
   @Coerce
   private Object lunar$rawMouseInput$doHandleMessage$disableMouseMove(@Coerce Object var1) {
      return this.lunar$rawInputEnabled ? null : var1;
   }

   @ModifyReturnValue(
      method = "doHandleMessage",
      at = @At("RETURN"),
      slice = @Slice(
         from = @At(value = "INVOKE", target = "Lorg/lwjgl/opengl/WindowsDisplay;nTrackMouseEvent(J)Z"),
         to = @At(value = "INVOKE", target = "Lorg/lwjgl/opengl/WindowsDisplay;handleMouseScrolled(IJ)V")
      ),
      allow = 1
   )
   private long lunar$rawMouseInput$doHandleMessage$disableMouseMoveReturn(long var1, long var3, int var5, long var6, long var8) {
      return this.lunar$rawInputEnabled ? defWindowProc(var3, var5, var6, var8) : var1;
   }

   @Inject(method = "doHandleMessage", at = @At(value = "INVOKE", target = "Lorg/lwjgl/opengl/WindowsDisplay;defWindowProc(JIJJ)J", shift = Shift.BEFORE))
   private void lunar$rawMouseInput$doHandleMessage$wmInput(long var1, int var3, long var4, long var6, long var8, CallbackInfoReturnable<Long> var10) {
      if (var3 == 255) {
         if (this.lunar$rawInputEnabled) {
            CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var11 = new CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();
            boolean var12 = this.nGetRawMouseCoords(var6, var11);
            if (var12 && this.lunar$mouse != null) {
               int var13 = var11.x;
               int var14 = var11.y;
               if (var11.absolute) {
                  ((RIOOCHICIHRHOHCCCCCHOCCCOHCRHI)this.lunar$mouse).bridge$handleMouseMoved(var13, transformY(this.getHwnd(), var14), var8);
               } else {
                  ((RIOOCHICIHRHOHCCCCCHOCCCOHCRHI)this.lunar$mouse).bridge$handleMouseMovedRelative(var13, -var14, var8);
               }
            }
         }
      }
   }

   @Unique
   @CORCOCICIRIOHROHROIIOOHICCHCRR
   private static final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      public boolean absolute;
      public int x;
      public int y;
   }
}
