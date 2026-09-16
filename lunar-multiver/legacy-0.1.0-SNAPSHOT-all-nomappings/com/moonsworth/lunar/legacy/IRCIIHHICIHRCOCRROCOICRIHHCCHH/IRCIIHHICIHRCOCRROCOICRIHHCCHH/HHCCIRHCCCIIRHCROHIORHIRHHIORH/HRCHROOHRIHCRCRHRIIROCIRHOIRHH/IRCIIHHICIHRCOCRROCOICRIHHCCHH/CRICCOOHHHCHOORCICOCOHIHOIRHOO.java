package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.lunarclient.apollo.module.limb.BodyPart;
import com.lunarclient.apollo.module.limb.LimbModule;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.Set;
import javax.vecmath.Matrix4f;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.ThreadDownloadImageData;
import net.minecraft.client.renderer.entity.RenderPlayer_v1_7;
import net.minecraft.client.renderer.entity.RendererLivingEntity;
import net.minecraft.client.renderer.texture.ITextureObject;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL14;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
@Mixin(RenderPlayer_v1_7.class)
public abstract class CRICCOOHHHCHOORCICOCOHIHOIRHOO
   extends RendererLivingEntity
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   @Shadow
   public ModelBiped modelBipedMain;
   @Unique
   private float lunar$savedPartialTicks;
   @Unique
   private com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH lunar$alexModel;
   @Unique
   private com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH lunar$steveModel;
   @Unique
   private ModelBiped lunar$original;

   @Inject(method = "<init>", at = @At("TAIL"))
   public void lunar$setupEnhancedPlayerModels(CallbackInfo var1) {
      this.lunar$steveModel = new com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         0.0F, true, false
      );
      this.lunar$alexModel = new com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         0.0F, true, true
      );
      this.lunar$original = this.modelBipedMain;
   }

   public void renderModel(EntityLivingBase var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IIRHCHHOICHRICOOCRORCCIOOIHOIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var8 = com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.OICHHROCICIIHIIRCIOCCHCHCRIIOH;
      com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.OICHHROCICIIHIIRCIOCCHCHCRIIOH = null;
      Matrix4f var9 = var8.getMatrix();
      var8.CCICHRCORROHIOCIOIRHOICHRRIRHO();
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.class,
            () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(
               (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH)var1,
               var9,
               this.bridge$getMainModel(),
               this.lunar$savedPartialTicks
            )
         );
      var8.ORHHRHCOIOCOHIIHIROCIRCOIRIHHI();
      super.renderModel(var1, var2, var3, var4, var5, var6, var7);
   }

   @Inject(method = "doRender*", at = @At("HEAD"), cancellable = true)
   private void lunar$preRenderPlayerEvent$v1_7(AbstractClientPlayer var1, double var2, double var4, double var6, float var8, float var9, CallbackInfo var10) {
      if (com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH)var1,
            var2,
            var4,
            var6,
            var9
         )
         .isCancelled()) {
         var10.cancel();
      } else {
         GL11.glEnable(3042);
         GL14.glBlendEquation(32774);
         OpenGlHelper.glBlendFunc(770, 771, 1, 771);
         if (var1.hasSkin() && this.isModernSkin(var1)) {
            if ("slim"
               .equals(
                  ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var1)
                     .bridge$getSkinType()
               )) {
               this.mainModel = this.modelBipedMain = this.lunar$alexModel;
            } else {
               this.mainModel = this.modelBipedMain = this.lunar$steveModel;
            }
         }
      }

      com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.OICHHROCICIIHIIRCIOCCHCHCRIIOH = new com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IIRHCHHOICHRICOOCRORCCIOOIHOIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();
      this.lunar$savedPartialTicks = var9;
   }

   @Inject(method = "renderFirstPersonArm", at = @At("HEAD"), cancellable = true)
   private void lunar$onRenderHand(EntityPlayer var1, CallbackInfo var2) {
      if (var1 instanceof AbstractClientPlayer var3 && var3.hasSkin() && this.isModernSkin(var3)) {
         var2.cancel();
         boolean var4 = "slim"
            .equals(
               ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var1)
                  .bridge$getSkinType()
            );
         if (var4) {
            this.modelBipedMain = this.lunar$alexModel;
         } else {
            this.modelBipedMain = this.lunar$steveModel;
         }

         if (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RIHOOCIHRICOCHRHCOOCCOIHOCHRCR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.ICIIHRIOHCHOOCICICROOHIOIRHOIH()
               .isEnabled()
            && (Boolean)com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RIHOOCIHRICOCHRHCOOCCOIHOCHRCR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.ICIIHRIOHCHOOCICICROOHIOIRHOIH()
               .ORROHOHCRHCOOHRCRHOHOCOCRHHRHO()
               .get()) {
            ((com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)this.modelBipedMain)
               .bipedRightArmwear
               .showModel = false;
         }

         float var5 = 1.0F;
         GL11.glColor3f(var5, var5, var5);
         GL11.glEnable(3042);
         GL11.glDisable(2884);
         GL14.glBlendEquation(32774);
         GL11.glBlendFunc(770, 771);
         this.modelBipedMain.swingProgress = 0.0F;
         this.modelBipedMain.setRotationAngles(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F, var1);
         this.modelBipedMain.bipedRightArm.render(0.0625F);
         ((com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)this.modelBipedMain)
            .bipedRightArmwear
            .render(0.0625F);
         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RIHOOCIHRICOCHRHCOOCCOIHOCHRCR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI.HHHRRIRIHIHRORCOHCRRCIOCRIORIR(),
            0.0625F,
            (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH)this.modelBipedMain
               .bipedRightArm,
            ((com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)this.modelBipedMain)
               .bipedRightArmwear
               .showModel,
            (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var3,
            var4,
            false
         );
         GL11.glEnable(2884);
      }
   }

   @Inject(method = "renderEquippedItems", at = @At("HEAD"), cancellable = true)
   private void apollo$hideHeldItem(AbstractClientPlayer var1, float var2, CallbackInfo var3) {
      IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .CIRCCCHCCCROROIIOIHIOROIHCHRCH()
         .OOROOCCIRCCRHOIOIORIHCHHOOCCOR(LimbModule.class)
         .map(
            var1x -> (Set)((com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR)var1x)
               .HHHRCHICIIHIRIOROHHCIOCCCRRORR()
               .get(var1.getUniqueID())
         )
         .filter(var0 -> var0 != null && var0.contains(BodyPart.RIGHT_ARM))
         .ifPresent(var1x -> var3.cancel());
   }

   @Inject(method = "renderFirstPersonArm", at = @At("TAIL"))
   private void lunar$onRenderHand$tail(EntityPlayer var1, CallbackInfo var2) {
      this.modelBipedMain = this.lunar$original;
   }

   public boolean hasModernSkin(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1
   ) {
      return this.isModernSkin((AbstractClientPlayer)var1);
   }

   private boolean isModernSkin(AbstractClientPlayer var1) {
      ITextureObject var2 = Minecraft.getMinecraft().getTextureManager().getTexture(var1.getLocationSkin());
      if (var2 != null && !(var2 instanceof ThreadDownloadImageData)) {
         return false;
      }

      ThreadDownloadImageData var3 = AbstractClientPlayer.getDownloadImageSkin(var1.getLocationSkin(), var1.getGameProfile().getName());
      return var3.textureUploaded && var3.bufferedImage.getHeight() > 32;
   }

   @Inject(method = "doRender*", at = @At("TAIL"))
   private void lunar$onDoRender$tail(AbstractClientPlayer var1, double var2, double var4, double var6, float var8, float var9, CallbackInfo var10) {
      this.lunar$showAllParts(this.modelBipedMain);
      this.mainModel = this.lunar$original;
      this.modelBipedMain = this.lunar$original;
   }

   @Unique
   private void lunar$showAllParts(ModelBiped var1) {
      var1.bipedHead.showModel = true;
      var1.bipedHeadwear.showModel = true;
      var1.bipedBody.showModel = true;
      var1.bipedRightArm.showModel = true;
      var1.bipedLeftArm.showModel = true;
      var1.bipedRightLeg.showModel = true;
      var1.bipedLeftLeg.showModel = true;
      if (var1 instanceof com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2) {
         var2.bipedBodyWear.showModel = true;
         var2.bipedRightArmwear.showModel = true;
         var2.bipedLeftArmwear.showModel = true;
         var2.bipedRightLegwear.showModel = true;
         var2.bipedLeftLegwear.showModel = true;
      }
   }

   @Redirect(
      method = "rotateCorpse(Lnet/minecraft/client/entity/AbstractClientPlayer;FFF)V",
      at = @At(value = "INVOKE", target = "org/lwjgl/opengl/GL11.glRotatef(FFFF)V", remap = false),
      require = 3,
      expect = 3
   )
   private void lunar$onRotatef(float var1, float var2, float var3, float var4) {
      GL11.glRotatef(var1, var2, var3, var4);
      if (com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.OICHHROCICIIHIIRCIOCCHCHCRIIOH
         != null) {
         com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.OICHHROCICIIHIIRCIOCCHCHCRIIOH
            .RRCRRCORICCHOHHIRCHIROOHIIOHCO(var1, var2, var3, var4);
      }
   }

   @Redirect(
      method = "preRenderCallback(Lnet/minecraft/client/entity/AbstractClientPlayer;F)V",
      at = @At(value = "INVOKE", target = "org/lwjgl/opengl/GL11.glScalef (FFF)V", remap = false),
      require = 1
   )
   private void lunar$onScalef(float var1, float var2, float var3) {
      GL11.glScalef(var1, var2, var3);
      if (com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.OICHHROCICIIHIIRCIOCCHCHCRIIOH
         != null) {
         com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.OICHHROCICIIHIIRCIOCCHCHCRIIOH
            .scale(var1, var2, var3);
      }
   }

   @Redirect(
      method = {
            "rotateCorpse(Lnet/minecraft/client/entity/AbstractClientPlayer;FFF)V", "preRenderCallback(Lnet/minecraft/client/entity/AbstractClientPlayer;F)V"
      },
      at = @At(value = "INVOKE", target = "org/lwjgl/opengl/GL11.glTranslatef(FFF)V", remap = false),
      require = 0,
      expect = 0
   )
   private void lunar$onTranslatef(float var1, float var2, float var3) {
      GL11.glTranslatef(var1, var2, var3);
      if (com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.OICHHROCICIIHIIRCIOCCHCHCRIIOH
         != null) {
         com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.OICHHROCICIIHIIRCIOCCHCHCRIIOH
            .CRICCOOHHHCHOORCICOCOHIHOIRHOO(var1, var2, var3);
      }
   }
}
