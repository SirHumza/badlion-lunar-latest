package com.moonsworth.lunar.client.OOOOCCOOOHCHCIIHOIHCRIIOOROHRC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.RegionRenderCache;
import net.minecraft.util.BlockPos;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(RegionRenderCache.class)
public abstract class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   @Shadow
   public IBlockState[] blockStates;
   @Final
   @Shadow
   public static IBlockState DEFAULT_STATE;

   @Shadow
   public abstract int getPositionIndex(BlockPos var1);

   @Inject(method = "getBlockState", at = @At("HEAD"), cancellable = true)
   private void lunar$fixGetBlockStateAioob(BlockPos var1, CallbackInfoReturnable<IBlockState> var2) {
      int var3 = this.getPositionIndex(var1);
      if (this.blockStates.length <= var3 || var3 < 0) {
         var2.setReturnValue(DEFAULT_STATE);
      }
   }
}
