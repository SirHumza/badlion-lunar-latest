package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.CORCOCICIRIOHROHROIIOOHICCHCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.lunarclient.apollo.module.limb.ArmorPiece;
import com.lunarclient.apollo.module.limb.LimbModule;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CORCOCICIRIOHROHROIIOOHICCHCRR;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IIOCHOIICCIORCOROIROHICCHIOHIC.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.ORHIOICIOCRRHOOCOHRORIHICHRCRR;
import com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.Set;
import java.util.function.IntConsumer;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLivingBase;
import net.minecraft.client.renderer.entity.layers.LayerArmorBase;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.util.ResourceLocation;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
@Mixin(LayerArmorBase.class)
public abstract class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<T extends ModelBase> {
   @Final
   @Shadow
   public RenderLivingBase<?> renderer;
   @Final
   @Shadow
   public static ResourceLocation ENCHANTED_ITEM_GLINT_RES;
   @Unique
   private static final ResourceLocation[] ARMOR_RESOURCE = new ResourceLocation[]{
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

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   @Inject(method = "renderArmorLayer$v1_12", at = @At("HEAD"), cancellable = true)
   private void lunar$renderArmorLayer$v1_12(
      EntityLivingBase var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, EntityEquipmentSlot var9, CallbackInfo var10
   ) {
      IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .CIRCCCHCCCROROIIOIHIOROIHCHRCH()
         .OOROOCCIRCCRHOIOIORIHCHHOOCCOR(LimbModule.class)
         .ifPresent(var3x -> {
            IHHCHHHCRIHOOCOIOOCRIIICIOROIR var4x = (IHHCHHHCRIHOOCOIOOCRIIICIOROIR)var3x;
            Set var5x = (Set)var4x.ICOHIOIHHOIOHIOIICHICIRHOORCOI().get(var1.getUniqueID());
            if (var5x != null) {
               if (var9 == EntityEquipmentSlot.HEAD && var5x.contains(ArmorPiece.HELMET)) {
                  var10.cancel();
               } else if (var9 == EntityEquipmentSlot.CHEST && var5x.contains(ArmorPiece.CHESTPLATE)) {
                  var10.cancel();
               } else if (var9 == EntityEquipmentSlot.LEGS && var5x.contains(ArmorPiece.LEGGINGS)) {
                  var10.cancel();
               } else if (var9 == EntityEquipmentSlot.FEET && var5x.contains(ArmorPiece.BOOTS)) {
                  var10.cancel();
               }
            }
         });
      RRCRRCORICCHOHHIRCHIROOHIIOHCO var11 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .HOORIHHORRRRHCIRCIHCCCRRCCICIR();
      CORCOCICIRIOHROHROIIOOHICCHCRR var12 = (CORCOCICIRIOHROHROIIOOHICCHCRR)var1;
      if (var9 == EntityEquipmentSlot.HEAD && var11.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var12)) {
         var10.cancel();
      } else if (var9 == EntityEquipmentSlot.CHEST && var11.CRRRICCRROCOHHOHIICIHORCOORRRH(var12)) {
         var10.cancel();
      } else if (var9 == EntityEquipmentSlot.LEGS && var11.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var12)) {
         var10.cancel();
      } else if (var9 == EntityEquipmentSlot.FEET && var11.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var12)) {
         var10.cancel();
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(1)
   @Inject(method = "renderLayer$v1_8", at = @At("HEAD"), cancellable = true)
   private void lunar$renderArmorLayer$v1_8(
      EntityLivingBase var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, CallbackInfo var10
   ) {
      IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .CIRCCCHCCCROROIIOIHIOROIHCHRCH()
         .OOROOCCIRCCRHOIOIORIHCHHOOCCOR(LimbModule.class)
         .ifPresent(var3x -> {
            IHHCHHHCRIHOOCOIOOCRIIICIOROIR var4x = (IHHCHHHCRIHOOCOIOOCRIIICIOROIR)var3x;
            Set var5x = (Set)var4x.ICOHIOIHHOIOHIOIICHICIRHOORCOI().get(var1.getUniqueID());
            if (var5x != null) {
               if (var9 == 4 && var5x.contains(ArmorPiece.HELMET)) {
                  var10.cancel();
               } else if (var9 == 3 && var5x.contains(ArmorPiece.CHESTPLATE)) {
                  var10.cancel();
               } else if (var9 == 2 && var5x.contains(ArmorPiece.LEGGINGS)) {
                  var10.cancel();
               } else if (var9 == 1 && var5x.contains(ArmorPiece.BOOTS)) {
                  var10.cancel();
               }
            }
         });
      RRCRRCORICCHOHHIRCHIROOHIIOHCO var11 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .HOORIHHORRRRHCIRCIHCCCRRCCICIR();
      CORCOCICIRIOHROHROIIOOHICCHCRR var12 = (CORCOCICIRIOHROHROIIOOHICCHCRR)var1;
      if (var9 == 4 && var11.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var12)) {
         var10.cancel();
      } else if (var9 == 3 && var11.CRRRICCRROCOHHOHIICIHORCOORRRH(var12)) {
         var10.cancel();
      } else if (var9 == 2 && var11.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var12)) {
         var10.cancel();
      } else if (var9 == 1 && var11.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var12)) {
         var10.cancel();
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(1)
   @Inject(method = "renderGlint$v1_8", at = @At("HEAD"), cancellable = true)
   public void impl$renderGlint_v1_8(
      EntityLivingBase var1, T var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, CallbackInfo var10
   ) {
      impl$eventRenderGlint(this.renderer, var1, var8x -> var2.render(var1, var3, var4, var6, var7, var8, var9), var10);
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   @Inject(method = "renderEnchantedGlint$v1_12", at = @At("HEAD"), cancellable = true)
   private static void impl$eventRenderGlint_v1_12(
      RenderLivingBase<?> var0,
      EntityLivingBase var1,
      ModelBase var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      CallbackInfo var10
   ) {
      impl$eventRenderGlint(var0, var1, var8x -> var2.render(var1, var3, var4, var6, var7, var8, var9), var10);
   }

   private static void impl$eventRenderGlint(RenderLivingBase<?> var0, EntityLivingBase var1, IntConsumer var2, CallbackInfo var3) {
      var0.bindTexture(ENCHANTED_ITEM_GLINT_RES);
      ORHIOICIOCRRHOOCOHRORIHICHRCRR var4 = (ORHIOICIOCRRHOOCOHRORIHICHRCRR)com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            ORHIOICIOCRRHOOCOHRORIHICHRCRR.class,
            () -> new ORHIOICIOCRRHOOCOHRORIHICHRCRR(
               com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.ORHIOICIOCRRHOOCOHRORIHICHRCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.EQUIPPED_ARMOR,
               var2,
               null,
               (CRRRICCRROCOHHOHIICIHORCOORRRH)var1,
               null,
               OCOHORHCROHICRRIHCIHHRRCIHICRI.HHHRRIRIHIHRORCOHCRRCIOCRIORIR()
            )
         );
      if (var4 != null && var4.isCancelled()) {
         var3.cancel();
      }
   }

   @Overwrite
   public ResourceLocation getArmorResource(ItemArmor var1, boolean var2) {
      return ARMOR_RESOURCE[(var1.renderIndex << 1) + (var2 ? 1 : 0)];
   }

   @Overwrite
   public ResourceLocation getArmorResource(ItemArmor var1, boolean var2, String var3) {
      return ARMOR_RESOURCE[(var1.renderIndex << 1) + (var2 && var3.equals("overlay") ? 11 : 10)];
   }
}
