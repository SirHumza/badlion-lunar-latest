package com.moonsworth.lunar.legacy.optifine.mixin.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import com.moonsworth.lunar.ichor.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelBlock;
import net.minecraft.util.ResourceLocation;
import net.optifine.CustomItems;
import net.optifine.util.StrUtils;
import net.optifine.util.TextureUtils;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(present = "forge")
@Mixin(ModelBakery.class)
public abstract class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   @Shadow
   public abstract ResourceLocation getModelLocation(ResourceLocation var1);

   @ModifyVariable(
      method = "loadModel",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/resources/IResourceManager;getResource(Lnet/minecraft/util/ResourceLocation;)Lnet/minecraft/client/resources/IResource;"
      ),
      argsOnly = true
   )
   private ResourceLocation lunar$setResourceLocationAsOptiFineDoes(ResourceLocation var1) {
      return this.getModelLocation(var1);
   }

   @ModifyVariable(
      method = "loadModel",
      at = @At(value = "FIELD", target = "Lnet/minecraft/client/renderer/block/model/ModelBlock;name:Ljava/lang/String;", opcode = 181),
      ordinal = 0
   )
   private ModelBlock lunar$fixModelLocationsAsOptiFineDoes(ModelBlock var1, ResourceLocation var2) {
      RCIROOOOICRHCCRRCIORHHIRCOIIIC var3 = (RCIROOOOICRHCCRRCIORHHIRCOIIIC)var2;
      String var4 = TextureUtils.getBasePath(var3.bridge$getPath());
      fixModelLocations(var1, var4);
      return var1;
   }

   @Inject(method = "registerVariantNames", at = @At("TAIL"))
   private void lunar$initializeOptiFineCITs(CallbackInfo var1) {
      CustomItems.update();
      CustomItems.loadModels((ModelBakery)this);
   }

   @Unique
   private static void fixModelLocations(ModelBlock var0, String var1) {
      ResourceLocation var2 = fixModelLocation(var0.getParentLocation(), var1);
      if (var2 != var0.getParentLocation()) {
         var0.parentLocation = var2;
      }

      Map var3 = var0.textures;
      if (var3 != null) {
         for (Entry var5 : var3.entrySet()) {
            String var6 = (String)var5.getValue();
            String var7 = fixResourcePath(var6, var1);
            if (!Objects.equals(var7, var6)) {
               var5.setValue(var7);
            }
         }
      }
   }

   @Unique
   private static ResourceLocation fixModelLocation(ResourceLocation var0, String var1) {
      RCIROOOOICRHCCRRCIORHHIRCOIIIC var2 = (RCIROOOOICRHCCRRCIORHHIRCOIIIC)var0;
      if (var0 != null && var1 != null) {
         if (!var2.bridge$getDomain().equals("minecraft")) {
            return var0;
         }

         String var3 = var2.bridge$getPath();
         String var4 = fixResourcePath(var3, var1);
         if (!Objects.equals(var4, var3)) {
            var0 = new ResourceLocation(var2.bridge$getDomain(), var4);
         }

         return var0;
      } else {
         return var0;
      }
   }

   @Unique
   private static String fixResourcePath(String var0, String var1) {
      var0 = TextureUtils.fixResourcePath(var0, var1);
      var0 = StrUtils.removeSuffix(var0, ".json");
      return StrUtils.removeSuffix(var0, ".png");
   }
}
