package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityFishHook;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(EntityFishHook.class)
public abstract class IRCIIHHICIHRCOCRROCOICRIHHCCHH extends Entity {
   @Shadow
   public EntityPlayer angler;
   private boolean hasCast = false;

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH(World var1) {
      super(var1);
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 1)
   @Inject(method = "onUpdate", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/Entity;attackEntityFrom(Lnet/minecraft/util/DamageSource;F)Z"))
   private void lunar$addRodAccuracySuccess_v1_7(CallbackInfo var1) {
      this.lunar$addRodAccuracySuccess();
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   @Inject(
      method = "notifyDataManagerChange$v1_12",
      at = @At(value = "FIELD", target = "net/minecraft/entity/projectile/EntityFishHook.caughtEntity : Lnet/minecraft/entity/Entity;")
   )
   private void lunar$addRodAccuracySuccess_v1_12(CallbackInfo var1) {
      this.lunar$addRodAccuracySuccess();
   }

   private void lunar$addRodAccuracySuccess() {
      if (this.world.isRemote && this.hasCast) {
         IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .CRHHCROOHRIIHCRRHOHRRCROOHICOO()
            .RORCHCIIICOHIRROOORHOCCCCIOCCI(var0 -> var0.HIHRHHIHRHHRRIRRRHIIHRHRORCOOI().CHIHIROROIIRIHRHIHICHHOOOIHCHI());
         this.hasCast = false;
      }
   }

   @Inject(method = "handleHookRetraction", at = @At("HEAD"))
   private void lunar$addRodAccuracyFailure(CallbackInfoReturnable<Integer> var1) {
      if (this.world.isRemote) {
         if (this.hasCast) {
            IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .CRHHCROOHRIIHCRRHOHRRCROOHICOO()
               .RORCHCIIICOHIRROOORHOCCCCIOCCI(var0 -> var0.HIHRHHIHRHHRRIRRRHIIHRHRORCOOI().CHIOIOIRIHRCRHIHIIHIICOOHRHOOH());
            this.hasCast = false;
         }
      }
   }

   @Inject(
      method = {
            "<init>(Lnet/minecraft/world/World;)V",
            "<init>(Lnet/minecraft/world/World;Lnet/minecraft/entity/player/EntityPlayer;)V",
            "<init>(Lnet/minecraft/world/World;DDDLnet/minecraft/entity/player/EntityPlayer;)V",
            "<init>(Lnet/minecraft/world/World;Lnet/minecraft/entity/player/EntityPlayer;DDD)V"
      },
      at = @At("RETURN")
   )
   private void lunar$hasCastRod(CallbackInfo var1) {
      if (this.world.isRemote) {
         if (this.angler != null && this.angler.equals(IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH())) {
            this.hasCast = true;
         }
      }
   }
}
