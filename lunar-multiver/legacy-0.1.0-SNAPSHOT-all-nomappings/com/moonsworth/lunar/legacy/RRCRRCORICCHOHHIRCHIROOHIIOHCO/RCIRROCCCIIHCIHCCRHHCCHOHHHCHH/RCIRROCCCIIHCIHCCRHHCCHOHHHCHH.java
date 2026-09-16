package com.moonsworth.lunar.legacy.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;
import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Minecraft.class)
public abstract class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   @Shadow
   public abstract void shutdown();

   @IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 1)
   @Inject(method = "startGame$v1_7", at = @At("RETURN"))
   public void test$start_v1_7(CallbackInfo var1) {
      this.test$start();
   }

   @IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   @Inject(method = "init$v1_12", at = @At("RETURN"))
   public void test$start_v1_12(CallbackInfo var1) {
      this.test$start();
   }

   @Unique
   public void test$start() {
      com.moonsworth.lunar.ichor.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HROHCRIOCIHCORHOHIOCIHOHHCIIRH(this);
      System.out.println("[Test] Returning early in Minecraft#startGame");
      this.shutdown();
   }
}
