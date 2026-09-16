package com.moonsworth.lunar.OCOHORHCROHICRRIHCIHHRRCIHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.sugar.Local;
import com.lunarclient.apollo.module.limb.ArmorPiece;
import com.lunarclient.apollo.module.limb.LimbModule;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CORCOCICIRIOHROHROIIOOHICCHCRR;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IIOCHOIICCIORCOROIROHICCHIOHIC.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.Collection;
import java.util.Optional;
import java.util.Set;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.init.Items;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(RenderBiped.class)
public abstract class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   @Unique
   private static final ResourceLocation[] lunar$armorResources = new ResourceLocation[]{
      new ResourceLocation("textures/models/armor/leather_layer_1.png"),
      new ResourceLocation("textures/models/armor/leather_layer_2.png"),
      new ResourceLocation("textures/models/armor/chainmail_layer_1.png"),
      new ResourceLocation("textures/models/armor/chainmail_layer_2.png"),
      new ResourceLocation("textures/models/armor/iron_layer_1.png"),
      new ResourceLocation("textures/models/armor/iron_layer_2.png"),
      new ResourceLocation("textures/models/armor/diamond_layer_1.png"),
      new ResourceLocation("textures/models/armor/diamond_layer_2.png"),
      new ResourceLocation("textures/models/armor/gold_layer_1.png"),
      new ResourceLocation("textures/models/armor/gold_layer_2.png"),
      new ResourceLocation("textures/models/armor/leather_layer_1_overlay.png"),
      new ResourceLocation("textures/models/armor/leather_layer_2_overlay.png")
   };
   @Unique
   private static final ItemStack lunar$dummyItemStack = new ItemStack(Items.diamond_sword);

   @Overwrite
   public static ResourceLocation func_110857_a(ItemArmor var0, int var1) {
      return lunar$armorResources[(var0.renderIndex << 1) + (var1 == 2 ? 1 : 0)];
   }

   @Overwrite
   public static ResourceLocation func_110858_a(ItemArmor var0, int var1, String var2) {
      return lunar$armorResources[(var0.renderIndex << 1) + (var1 == 2 ? 11 : 10)];
   }

   @Redirect(method = "renderEquippedItems", at = @At(value = "INVOKE", target = "Lorg/lwjgl/opengl/GL11;glScalef(FFF)V", ordinal = 1))
   public void impl$headFixBabyZombie(float var1, float var2, float var3, EntityLiving var4) {
      boolean var5 = var4 instanceof EntityVillager || var4 instanceof EntityZombie && ((EntityZombie)var4).isVillager();
      if (!var5 && var4.isChild()) {
         float var8 = 2.0F;
         float var7 = 1.65F;
         GL11.glScalef(var7 / var8, var7 / var8, var7 / var8);
         GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
         GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
         GL11.glTranslatef(0.0F, -0.936F, 0.0F);
      } else {
         float var6 = 1.0625F;
         GL11.glScalef(var6, -var6, -var6);
      }
   }

   @Inject(method = "shouldRenderPass(Lnet/minecraft/entity/EntityLiving;IF)I", at = @At("HEAD"), cancellable = true)
   private void lunar$shouldRenderPass(EntityLiving var1, int var2, float var3, CallbackInfoReturnable<Integer> var4) {
      IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .CIRCCCHCCCROROIIOIHIOROIHCHRCH()
         .OOROOCCIRCCRHOIOIORIHCHHOOCCOR(LimbModule.class)
         .ifPresent(var3x -> {
            IHHCHHHCRIHOOCOIOOCRIIICIOROIR var4x = (IHHCHHHCRIHOOCOIOOCRIIICIOROIR)var3x;
            Set var5x = (Set)var4x.ICOHIOIHHOIOHIOIICHICIRHOORCOI().get(var1.getUniqueID());
            if (var5x != null) {
               if (var2 == 0 && var5x.contains(ArmorPiece.HELMET)) {
                  var4.setReturnValue(-1);
               } else if (var2 == 1 && var5x.contains(ArmorPiece.CHESTPLATE)) {
                  var4.setReturnValue(-1);
               } else if (var2 == 2 && var5x.contains(ArmorPiece.LEGGINGS)) {
                  var4.setReturnValue(-1);
               } else if (var2 == 3 && var5x.contains(ArmorPiece.BOOTS)) {
                  var4.setReturnValue(-1);
               }
            }
         });
      RRCRRCORICCHOHHIRCHIROOHIIOHCO var5 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .HOORIHHORRRRHCIRCIHCCCRRCCICIR();
      if (var2 == 0 && var5.HHCCIRHCCCIIRHCROHIORHIRHHIORH((RIOOCHICIHRHOHCCCCCHOCCCOHCRHI)var1)) {
         var4.setReturnValue(-1);
      } else if (var2 == 1 && var5.CRRRICCRROCOHHOHIICIHORCOORRRH((RIOOCHICIHRHOHCCCCCHOCCCOHCRHI)var1)) {
         var4.setReturnValue(-1);
      } else if (var2 == 2 && var5.RRCRRCORICCHOHHIRCHIROOHIIOHCO((RIOOCHICIHRHOHCCCCCHOCCCOHCRHI)var1)) {
         var4.setReturnValue(-1);
      } else if (var2 == 3 && var5.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI((RIOOCHICIHRHOHCCCCCHOCCCOHCRHI)var1)) {
         var4.setReturnValue(-1);
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @ModifyExpressionValue(
      method = "renderEquippedItems(Lnet/minecraft/entity/EntityLiving;F)V",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/EntityLiving;func_130225_q(I)Lnet/minecraft/item/ItemStack;")
   )
   private ItemStack lunar$RenderEquipped(ItemStack var1, @Local(argsOnly = true) EntityLiving var2) {
      Optional var3 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .CIRCCCHCCCROROIIOIHIOROIHCHRCH()
         .OOROOCCIRCCRHOIOIORIHCHHOOCCOR(LimbModule.class);
      if (var3.isPresent()) {
         Collection var4 = (Collection)((IHHCHHHCRIHOOCOIOOCRIIICIOROIR)var3.get()).ICOHIOIHHOIOHIOIICHICIRHOORCOI().get(var2.getUniqueID());
         if (var4 != null && var4.contains(ArmorPiece.HELMET)) {
            return lunar$dummyItemStack;
         }
      }

      return IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .HOORIHHORRRRHCIRCIHCCCRRCCICIR()
            .HHCCIRHCCCIIRHCROHIORHIRHHIORH((CORCOCICIRIOHROHROIIOOHICCHCRR)var2)
         ? lunar$dummyItemStack
         : var1;
   }
}
