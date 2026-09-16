package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import net.minecraft.client.renderer.BlockModelShapes;
import net.minecraft.client.renderer.block.model.IBakedModel;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelBlock;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.RegistrySimple;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
@Mixin(ModelBakery.class)
public class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   @Final
   @Shadow
   public Map<String, ResourceLocation> itemLocations;
   @Final
   @Shadow
   public Map<ResourceLocation, TextureAtlasSprite> sprites;
   @Final
   @Shadow
   public Map<ResourceLocation, ModelBlock> models;
   @Final
   @Shadow
   public TextureMap textureMap;
   @Final
   @Shadow
   public RegistrySimple<ModelResourceLocation, IBakedModel> bakedRegistry;
   @Unique
   private final HashSet<String> prebakedItemModels = new HashSet<>();

   @Shadow
   public boolean hasItemModel(ModelBlock var1) {
      throw new AssertionError();
   }

   @Shadow
   public boolean isCustomRenderer(ModelBlock var1) {
      throw new AssertionError();
   }

   @Inject(method = "<init>", at = @At("RETURN"))
   private void onInit(IResourceManager var1, TextureMap var2, BlockModelShapes var3, CallbackInfo var4) {
      com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HRHCCIHCOHROHICHIRIOCROCOIHRCH = (ModelBakery)this;
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 1)
   @Redirect(
      method = "bakeBlockModels",
      at = @At(value = "FIELD", target = "net/minecraft/client/resources/model/ModelBakery.itemLocations : Ljava/util/Map;")
   )
   private Map<String, ResourceLocation> impl$dontBakePrebakedModels_v1_8(ModelBakery var1) {
      return this.impl$dontBakePrebakedModels();
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   @Redirect(
      method = "bakeItemModels",
      at = @At(value = "FIELD", target = "net/minecraft/client/renderer/block/model/ModelBakery.itemLocations : Ljava/util/Map;")
   )
   private Map<String, ResourceLocation> impl$dontBakePrebakedModels_v1_12(ModelBakery var1) {
      return this.impl$dontBakePrebakedModels();
   }

   private Map<String, ResourceLocation> impl$dontBakePrebakedModels() {
      HashMap var1 = new HashMap<>(this.itemLocations);

      for (String var3 : this.prebakedItemModels) {
         var1.remove(var3);
      }

      return var1;
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 1)
   @Overwrite
   public void bakeItemModels() {
      this.impl$makeAndBakeItemModels();
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   @Overwrite
   public void makeItemModels$v1_12() {
      this.impl$makeAndBakeItemModels();
   }

   @Unique
   public void impl$makeAndBakeItemModels() {
      this.itemLocations
         .forEach(
            (var1, var2x) -> {
               ModelBlock var3 = this.models.get(var2x);
               if (this.hasItemModel(var3)) {
                  IBakedModel var4 = com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                     (ModelBakery)this, this.textureMap, var3
                  );
                  ModelResourceLocation var5 = new ModelResourceLocation(var1, "inventory");
                  this.bakedRegistry.putObject(var5, var4);
                  this.prebakedItemModels.add(var1);
               } else if (this.isCustomRenderer(var3)) {
                  this.models.put(var2x, var3);
               }
            }
         );

      for (TextureAtlasSprite var2 : this.sprites.values()) {
         if (!var2.hasAnimationMetadata()) {
            var2.clearFramesTextureData();
         }
      }
   }

   @Inject(method = "getVariantsTextureLocations", at = @At("RETURN"), cancellable = true)
   public void lunar$onLoadItems(CallbackInfoReturnable<Set<ResourceLocation>> var1) {
      for (String var3 : com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CHORIHIHCCOHOHRRIOOROIOOOHIIIO()) {
         ((Set)var1.getReturnValue()).add(new ResourceLocation(var3));
      }
   }
}
