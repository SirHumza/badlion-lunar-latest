package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.CORCOCICIRIOHROHROIIOOHICCHCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.mojang.authlib.GameProfile;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms.TransformType;
import net.minecraft.client.renderer.tileentity.TileEntitySkullRenderer_v1_7;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTUtil;
import net.minecraft.util.StringUtils;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(ItemRenderer.class)
public abstract class IRCIIHHICIHRCOCRROCOICRIHHCCHH
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.CRRRICCRROCOHHOHIICIHORCOORRRH {
   @Final
   @Shadow
   public Minecraft mc;

   @Shadow
   public abstract void renderItem$v1_7(EntityLivingBase var1, ItemStack var2, int var3);

   @Shadow
   public abstract void renderItem$v1_8(EntityLivingBase var1, ItemStack var2, TransformType var3);

   public void bridge$renderItem(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CORCOCICIRIOHROHROIIOOHICCHCRR var1,
      IIRHCHHOICHRICOOCRORCCIOOIHOIR var2,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3
   ) {
      ItemStack var4 = (ItemStack)var2;
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         this.renderItem$v1_8((EntityLivingBase)var1, var4, TransformType.values()[var3.legacyIndex()]);
      } else if (var4.getItem() == Items.SKULL) {
         GameProfile var5 = null;
         if (var4.hasTagCompound()) {
            NBTTagCompound var6 = var4.getTagCompound();
            if (var6.hasKey("SkullOwner", 10)) {
               var5 = NBTUtil.readGameProfileFromNBT(var6.getCompoundTag("SkullOwner"));
            } else if (var6.hasKey("SkullOwner", 8) && !StringUtils.isNullOrEmpty(var6.getString("SkullOwner"))) {
               var5 = new GameProfile(null, var6.getString("SkullOwner"));
            }
         }

         TileEntitySkullRenderer_v1_7.field_147536_b.func_152674_a(-0.5F, 0.0F, -0.5F, 1, 180.0F, var4.getMetadata(), var5);
      } else {
         this.renderItem$v1_7((EntityLivingBase)var1, var4, var3.legacyIndex());
      }
   }
}
