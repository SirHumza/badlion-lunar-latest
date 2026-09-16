package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.multiplayer.PlayerControllerMP;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ClickType;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.joml.Vector3d;
import org.joml.Vector3i;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PlayerControllerMP.class)
public abstract class IRCIIHHICIHRCOCRROCOICRIHHCCHH
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   @Shadow
   public int blockHitDelay;
   @Final
   @Shadow
   public Minecraft mc;
   @Shadow
   public boolean isHittingBlock;
   @Shadow
   public float curBlockDamageMP;
   @Shadow
   public BlockPos currentBlock$v1_8;
   @Shadow
   public int currentBlockX$v1_7;
   @Shadow
   public int currentBlockY$v1_7;
   @Shadow
   public int currentblockZ$v1_7;

   @Shadow
   public abstract boolean isSpectator$v1_8();

   @Shadow
   public abstract boolean isSpectatorMode$v1_8();

   @Shadow
   public abstract EnumActionResult processRightClick$v1_12(EntityPlayer var1, World var2, EnumHand var3);

   @Shadow
   public abstract EnumActionResult processRightClickBlock$v1_12(
      EntityPlayerSP var1, WorldClient var2, BlockPos var3, EnumFacing var4, Vec3d var5, EnumHand var6
   );

   @Shadow
   public abstract boolean onPlayerRightClick$v1_7(EntityPlayer var1, World var2, ItemStack var3, int var4, int var5, int var6, int var7, Vec3d var8);

   @Shadow
   public abstract boolean onPlayerRightClick$v1_8(EntityPlayerSP var1, WorldClient var2, ItemStack var3, BlockPos var4, EnumFacing var5, Vec3d var6);

   @Shadow
   public abstract boolean sendUseItem$v1_7(EntityPlayer var1, World var2, ItemStack var3);

   @Shadow
   public abstract void attackEntity(EntityPlayer var1, Entity var2);

   public boolean bridge$isSpectator() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 && this.isSpectator$v1_8();
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   @Inject(method = "windowClick$v1_12", at = @At("HEAD"), cancellable = true)
   private void lunar$windowClick(int var1, int var2, int var3, ClickType var4, EntityPlayer var5, CallbackInfoReturnable<ItemStack> var6) {
      if (var5.openContainer != null && var2 >= var5.openContainer.inventorySlots$v1_8.size()) {
         var6.cancel();
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 1)
   @Inject(method = "windowClick$v1_7", at = @At("HEAD"), cancellable = true)
   private void lunar$windowClick(int var1, int var2, int var3, int var4, EntityPlayer var5, CallbackInfoReturnable<ItemStack> var6) {
      if (var5.openContainer != null
         && var2
            >= (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? var5.openContainer.inventorySlots$v1_8.size() : var5.openContainer.inventorySlots$v1_7.size())
         )
       {
         var6.cancel();
      }
   }

   public int bridge$destroyDelay() {
      return this.blockHitDelay;
   }

   public void bridge$attack() {
      Minecraft var1 = Minecraft.getMinecraft();
      if (var1.pointedEntity != null) {
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 0) {
            this.attackEntity(var1.thePlayer$v1_7, var1.pointedEntity);
         } else {
            this.attackEntity(var1.player$v1_8, var1.pointedEntity);
         }
      }
   }

   public void bridge$useItemOn(Vector3i var1, int var2, int var3, Vector3d var4, boolean var5, boolean var6) {
      Minecraft var7 = Minecraft.getMinecraft();
      boolean var10 = true;
      ItemStack var8;
      int var9;
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 0) {
         var8 = var7.thePlayer$v1_7.getCurrentEquippedItem$v1_7();
         var9 = var8 != null ? var8.stackSize : 0;
         this.onPlayerRightClick$v1_7(var7.thePlayer$v1_7, var7.world, var8, var1.x(), var1.y(), var1.z(), var3, new Vec3d(var4.x, var4.y, var4.z));
      } else if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 1) {
         var8 = var7.player$v1_8.getCurrentEquippedItem$v1_7();
         var9 = var8 != null ? var8.stackSize : 0;
         this.onPlayerRightClick$v1_8(
            var7.player$v1_8, var7.world, var8, new BlockPos(var1.x(), var1.y(), var1.z()), EnumFacing.values()[var3], new Vec3d(var4.x, var4.y, var4.z)
         );
      } else {
         var8 = var7.player$v1_8.getHeldItem$v1_12(EnumHand.values()[var2]);
         var9 = var8.getCount$v1_12();
         var10 = this.processRightClickBlock$v1_12(
               var7.player$v1_8,
               var7.world,
               new BlockPos(var1.x(), var1.y(), var1.z()),
               EnumFacing.values()[var3],
               new Vec3d(var4.x, var4.y, var4.z),
               EnumHand.values()[var2]
            )
            == EnumActionResult.SUCCESS;
      }

      if (var10 && var8 != null && (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION != 5 || !var8.isEmpty$v1_12())) {
         if (var8.stackSize == 0 && IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 1) {
            if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 0) {
               var7.thePlayer$v1_7.inventory.mainInventory$v1_7[var7.thePlayer$v1_7.inventory.currentItem] = null;
            } else {
               var7.player$v1_8.inventory.mainInventory$v1_7[var7.player$v1_8.inventory.currentItem] = null;
            }
         } else if (var8.stackSize != var9 || var7.playerController.isInCreativeMode()) {
            if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 1) {
               var7.entityRenderer.itemRenderer.resetEquippedProgress$v1_7();
            } else {
               var7.entityRenderer.itemRenderer.resetEquippedProgress$v1_12(EnumHand.values()[var2]);
            }
         }
      }
   }

   public void bridge$useItem(int var1) {
      Minecraft var2 = Minecraft.getMinecraft();
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 1) {
         Object var3;
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 0) {
            var3 = var2.thePlayer$v1_7;
         } else {
            var3 = var2.player$v1_8;
         }

         this.sendUseItem$v1_7((EntityPlayer)var3, var2.world, var3.getCurrentEquippedItem$v1_7());
      } else {
         this.processRightClick$v1_12(var2.player$v1_8, var2.world, EnumHand.values()[var1]);
      }
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH bridge$getBlockBeingDestroyed() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 0
         ? (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH)(
            new Vector3i(this.currentBlockX$v1_7, this.currentBlockY$v1_7, this.currentblockZ$v1_7)
         )
         : (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH)this.currentBlock$v1_8;
   }

   public float bridge$getBlockDestroyProgress() {
      return this.curBlockDamageMP;
   }

   public boolean bridge$isHittingBlock() {
      return this.isHittingBlock;
   }
}
