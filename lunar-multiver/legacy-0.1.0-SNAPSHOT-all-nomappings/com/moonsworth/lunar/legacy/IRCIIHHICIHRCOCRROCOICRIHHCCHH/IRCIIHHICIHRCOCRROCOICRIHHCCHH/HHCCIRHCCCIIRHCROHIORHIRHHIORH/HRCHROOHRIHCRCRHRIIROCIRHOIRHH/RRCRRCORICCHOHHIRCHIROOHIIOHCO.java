package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import com.llamalad7.mixinextras.injector.v2.WrapWithCondition;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.llamalad7.mixinextras.sugar.Local;
import com.llamalad7.mixinextras.sugar.Share;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import com.lunarclient.apollo.module.packetenrichment.PacketEnrichmentModule;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ORHIOICIOCRRHOOCOHRORIHICHRCRR;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CIOHHCORHRCCRICCCORIHCRHCCCRRR;
import com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HICHRCOHCCRHOHCICOOCHOIHCCHIRI;
import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IHIRRIIORRHORHRORIHOROIRCORCOO;
import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI;
import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO;
import com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRRCCOICORICIHCHRHIHIHROIRHOCR;
import com.moonsworth.lunar.client.util.CCRHOICIRORRHOOOCIHHHHCHCICHOH;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.OCOHORHCROHICRRIHCIHHRRCIHICRI;
import com.moonsworth.lunar.client.util.RHRIIOOOCRHIIOORCOCRCHRCCRRCIH;
import com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.IHHCHHHCRIHOOCOIOOCRIIICIOROIR;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.particle.ParticleManager;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.culling.ClippingHelperImpl;
import net.minecraft.client.settings.KeyBinding_v1_8;
import net.minecraft.client.shader.Framebuffer;
import net.minecraft.client.shader.ShaderGroup;
import net.minecraft.crash.CrashReport;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.MouseFilter;
import net.minecraft.util.ReportedException;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.DimensionType;
import net.minecraft.world.World;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL30;
import org.spongepowered.asm.mixin.Dynamic;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.Slice;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(EntityRenderer.class)
public abstract class RRCRRCORICCHOHHIRCHIROOHIIOHCO {
   private boolean renderingWorldDirections;
   @Final
   @Shadow
   public Minecraft mc;
   @Shadow
   public float smoothCamFilterX;
   @Shadow
   public float smoothCamFilterY;
   @Final
   @Shadow
   public MouseFilter mouseFilterXAxis;
   @Final
   @Shadow
   public MouseFilter mouseFilterYAxis;
   @Shadow
   public float fovModifierHandPrev;
   @Shadow
   public float fovModifierHand;
   @Unique
   private float timesUpdated;
   @Shadow
   public Entity pointedEntity;
   @Unique
   private Integer lunar$inventoryGuiScale;
   @Unique
   private float lunar$inventoryScaleFactor = 1.0F;
   @Unique
   private com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH lunar$fastRenderCapture;
   @Shadow
   public float farPlaneDistance;
   @Shadow
   public boolean cloudFog;
   @Shadow
   public float fogColorRed;
   @Shadow
   public float fogColorGreen;
   @Shadow
   public float fogColorBlue;
   @Shadow
   public ShaderGroup shaderGroup;

   @Shadow
   public abstract void orientCamera(float var1);

   @Shadow
   public abstract void setupOverlayRendering();

   @Inject(method = "updateFogColor", at = @At(value = "FIELD", target = "Lnet/minecraft/util/math/Vec3d;x:D", shift = Shift.BEFORE, ordinal = 0))
   private void lunar$skyColorHook(float var1, CallbackInfo var2, @Local Vec3d var3) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IICCOOCHCHROORHHIIHROHCCRHRCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .RIHIRICHICORROIIHIRROIRHOHRHHO();
      if (var4.isEnabled()
         && var4.COIRRHICRCCCCHHIHHRRCHHIOCHROR().get()
            == com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IICCOOCHCHROORHHIIHROHCCRHRCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.NETHER
         && this.lunar$isOverworld(this.mc.world)) {
         ((IHHCHHHCRIHOOCOIOOCRIIICIOROIR)var3).bridge$setX(0.0);
         ((IHHCHHHCRIHOOCOIOOCRIIICIOROIR)var3).bridge$setY(0.0);
         ((IHHCHHHCRIHOOCOIOOCRIIICIOROIR)var3).bridge$setZ(0.0);
      }
   }

   @Inject(method = "updateFogColor", at = @At(value = "FIELD", target = "Lnet/minecraft/client/settings/GameSettings;renderDistanceChunks:I", ordinal = 1))
   private void lunar$fogHook(float var1, CallbackInfo var2) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IICCOOCHCHROORHHIIHROHCCRHRCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .RIHIRICHICORROIIHIRROIRHOHRHHO();
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IICCOOCHCHROORHHIIHROHCCRHRCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 = (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IICCOOCHCHROORHHIIHROHCCRHRCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var3.COIRRHICRCCCCHHIHHRRCHHIOCHROR()
         .get();
      if (var3.isEnabled()
         && this.lunar$isOverworld(this.mc.world)
         && var4
            != com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IICCOOCHCHROORHHIIHROHCCRHRCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.DEFAULT
         )
       {
         Vec3d var5;
         if (var4
            == com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IICCOOCHCHROORHHIIHROHCCRHRCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.NETHER
            )
          {
            var5 = this.lunar$getNetherFog();
         } else {
            var5 = this.lunar$getEndFog(this.mc.world.getCelestialAngle(var1));
         }

         this.fogColorRed = (float)var5.x;
         this.fogColorGreen = (float)var5.y;
         this.fogColorBlue = (float)var5.z;
      }
   }

   @Unique
   private Vec3d lunar$getEndFog(float var1) {
      float var2 = MathHelper.cos(var1 * (float) (Math.PI * 2)) * 2.0F + 0.5F;
      var2 = Math.max(0.0F, Math.min(1.0F, var2));
      float var3 = 0.627451F;
      float var4 = 0.5019608F;
      float var5 = 0.627451F;
      var3 *= var2 * 0.0F + 0.15F;
      var4 *= var2 * 0.0F + 0.15F;
      var5 *= var2 * 0.0F + 0.15F;
      return new Vec3d(var3, var4, var5);
   }

   @Unique
   private Vec3d lunar$getNetherFog() {
      return new Vec3d(0.2F, 0.03F, 0.03F);
   }

   @Unique
   private boolean lunar$isOverworld(World var1) {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 5
         ? var1.provider.getDimensionType$v1_12() == DimensionType.OVERWORLD
         : var1.provider.dimensionId$v1_7 == 0;
   }

   @ModifyExpressionValue(
      method = "updateFogColor",
      at = @At(value = "FIELD", target = "Lnet/minecraft/client/settings/GameSettings;renderDistanceChunks:I", ordinal = 1)
   )
   private int lunar$skyFogHook(int var1) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IICCOOCHCHROORHHIIHROHCCRHRCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .RIHIRICHICORROIIHIRROIRHOHRHHO();
      return var1 < 4
            || var2.isEnabled()
               && var2.COIRRHICRCCCCHHIHHRRCHHIOCHROR().get()
                  != com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IICCOOCHCHROORHHIIHROHCCRHRCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.DEFAULT
         ? 0
         : var1;
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @ModifyExpressionValue(
      method = "updateFovModifierHand",
      at = @At(target = "Lnet/minecraft/client/entity/EntityPlayerSP;getFOVMultiplier()F", value = "INVOKE")
   )
   private float lunar$updateFovModifierHand(float var1) {
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2 = (com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR)com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.class,
            () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(
               var1
            )
         );
      if (var2 == null) {
         return var1;
      } else {
         return var2.isCancelled() ? 1.0F : var2.RHHHRIIROORRIHCHRHCOCOCIHRCCIC();
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Inject(method = "updateFogColor", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/World;getRainStrength(F)F", ordinal = 0))
   private void lunar$renderDistanceFogColorEvent$v1_8(float var1, CallbackInfo var2) {
      this.lunar$renderDistanceFogColorEvent(var1);
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Inject(
      method = "updateFogColor",
      at = @At(value = "FIELD", target = "Lnet/minecraft/client/renderer/EntityRenderer;fogColorBlue:F", ordinal = 2, opcode = 181, shift = Shift.AFTER)
   )
   private void lunar$renderDistanceFogColorEvent$v1_7(float var1, CallbackInfo var2) {
      this.lunar$renderDistanceFogColorEvent(var1);
   }

   @Unique
   private void lunar$renderDistanceFogColorEvent(float var1) {
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = (com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class,
            () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RENDER_DISTANCE,
               var1,
               this.fogColorRed,
               this.fogColorGreen,
               this.fogColorBlue
            )
         );
      if (var2 != null) {
         this.fogColorRed = var2.COCRROCCIRHOIOHIOHRCRIIHRHRHOO();
         this.fogColorGreen = var2.ORORCHIOOOCIOHHOROHICHOHHCCHIO();
         this.fogColorBlue = var2.OOHOROHRCOHIIRCHHOHOCIRHROOOHR();
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @ModifyArg(method = "updateFogColor", at = @At(value = "INVOKE", target = "Lorg/lwjgl/opengl/GL11;glClearColor(FFFF)V"), index = 3)
   private float lunar$opaqueWorldClearAlpha$v1_7(float var1) {
      return 1.0F;
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 0)
   @WrapWithCondition(
      method = "setupFog",
      slice = @Slice(
         from = @At(value = "INVOKE", target = "Lnet/minecraft/entity/EntityLivingBase;isPotionActive(Lnet/minecraft/potion/Potion;)Z", ordinal = 0),
         to = @At(value = "FIELD", target = "Lnet/minecraft/client/renderer/EntityRenderer;cloudFog:Z", ordinal = 0)
      ),
      at = {
            @At(value = "INVOKE", target = "Lorg/lwjgl/opengl/GL11;glFogf(IF)V", ordinal = 0),
            @At(value = "INVOKE", target = "Lorg/lwjgl/opengl/GL11;glFogf(IF)V", ordinal = 2)
      },
      require = 0
   )
   private boolean lunar$blindnessFogStartEvent(int var1, float var2) {
      return this.lunar$blindnessFogStartEvent(var2);
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(1)
   @WrapWithCondition(
      method = "setupFog",
      slice = @Slice(to = @At(value = "FIELD", target = "Lnet/minecraft/client/renderer/EntityRenderer;cloudFog:Z", ordinal = 0)),
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/GlStateManager;setFogStart(F)V")
   )
   private boolean lunar$blindnessFogStartEvent_v1_8(float var1) {
      return this.lunar$blindnessFogStartEvent(var1);
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   @WrapWithCondition(
      method = "setupFog",
      slice = @Slice(
         from = @At(value = "FIELD", target = "Lnet/minecraft/init/MobEffects;BLINDNESS:Lnet/minecraft/potion/Potion;", ordinal = 0),
         to = @At(value = "FIELD", target = "Lnet/minecraft/client/renderer/EntityRenderer;cloudFog:Z", ordinal = 0)
      ),
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/GlStateManager;setFogStart(F)V")
   )
   private boolean lunar$blindnessFogStartEvent_v1_12(float var1) {
      return this.lunar$blindnessFogStartEvent(var1);
   }

   private boolean lunar$blindnessFogStartEvent(float var1) {
      return this.lunar$postEventEntityFogRender(
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RRCRRCORICCHOHHIRCHIROOHIIOHCO.BLINDNESS,
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CRRRICCRROCOHHOHIICIHORCOORRRH.START,
         var1
      );
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @WrapWithCondition(
      method = "setupFog",
      slice = @Slice(
         from = @At(value = "INVOKE", target = "Lnet/minecraft/entity/EntityLivingBase;isPotionActive(Lnet/minecraft/potion/Potion;)Z", ordinal = 0),
         to = @At(value = "FIELD", target = "Lnet/minecraft/client/renderer/EntityRenderer;cloudFog:Z", ordinal = 0)
      ),
      at = {
            @At(value = "INVOKE", target = "Lorg/lwjgl/opengl/GL11;glFogf(IF)V", ordinal = 1),
            @At(value = "INVOKE", target = "Lorg/lwjgl/opengl/GL11;glFogf(IF)V", ordinal = 3)
      }
   )
   private boolean lunar$blindnessFogEndEvent(int var1, float var2) {
      return this.lunar$blindnessFogEndEvent(var2);
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(1)
   @WrapWithCondition(
      method = "setupFog",
      slice = @Slice(to = @At(value = "FIELD", target = "Lnet/minecraft/client/renderer/EntityRenderer;cloudFog:Z", ordinal = 0)),
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/GlStateManager;setFogEnd(F)V")
   )
   private boolean lunar$blindnessFogEndEvent_v1_8(float var1) {
      return this.lunar$blindnessFogEndEvent(var1);
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   @WrapWithCondition(
      method = "setupFog",
      slice = @Slice(
         from = @At(value = "FIELD", target = "Lnet/minecraft/init/MobEffects;BLINDNESS:Lnet/minecraft/potion/Potion;", ordinal = 0),
         to = @At(value = "FIELD", target = "Lnet/minecraft/client/renderer/EntityRenderer;cloudFog:Z", ordinal = 0)
      ),
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/GlStateManager;setFogEnd(F)V")
   )
   private boolean lunar$blindnessFogEndEvent_v1_12(float var1) {
      return this.lunar$blindnessFogEndEvent(var1);
   }

   private boolean lunar$blindnessFogEndEvent(float var1) {
      return this.lunar$postEventEntityFogRender(
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RRCRRCORICCHOHHIRCHIROOHIIOHCO.BLINDNESS,
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CRRRICCRROCOHHOHIICIHORCOORRRH.END,
         var1
      );
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @WrapWithCondition(method = "setupFog", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/GlStateManager;setFogDensity(F)V", ordinal = 0))
   private boolean lunar$thickFogDensityEvent(float var1) {
      return this.lunar$postEventEntityFogRender(
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RENDER_DISTANCE,
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CRRRICCRROCOHHOHIICIHORCOORRRH.DENSITY,
         var1
      );
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @WrapWithCondition(
      method = "setupFog",
      slice = @Slice(from = @At(value = "FIELD", target = "Lnet/minecraft/client/renderer/EntityRenderer;cloudFog:Z")),
      at = @At(value = "INVOKE", target = "Lorg/lwjgl/opengl/GL11;glFogf(IF)V", ordinal = 0)
   )
   private boolean lunar$thickFogDensityEvent(int var1, float var2) {
      return this.lunar$postEventEntityFogRender(
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RENDER_DISTANCE,
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CRRRICCRROCOHHOHIICIHORCOORRRH.DENSITY,
         var2
      );
   }

   @Unique
   private boolean lunar$postEventEntityFogRender(
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RRCRRCORICCHOHHIRCHIROOHIIOHCO var1,
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CRRRICCRROCOHHOHIICIHORCOORRRH var2,
      float var3
   ) {
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4 = (com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH)com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.class,
            () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
               var1, this.farPlaneDistance, this.cloudFog, var2, var3
            )
         );
      return var4 == null || !var4.isCancelled();
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @WrapWithCondition(
      method = "setupFog",
      at = {
            @At(value = "INVOKE", target = "Lorg/lwjgl/opengl/GL11;glFogf(IF)V", ordinal = 8),
            @At(value = "INVOKE", target = "Lorg/lwjgl/opengl/GL11;glFogf(IF)V", ordinal = 9)
      }
   )
   private boolean lunar$waterFogDensityEvent(int var1, float var2) {
      return this.lunar$postEventEntityFogRender(
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RRCRRCORICCHOHHIRCHIROOHIIOHCO.WATER,
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CRRRICCRROCOHHOHIICIHORCOORRRH.DENSITY,
         var2
      );
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @WrapWithCondition(
      method = "setupFog",
      slice = @Slice(
         from = @At(value = "FIELD", target = "Lnet/minecraft/block/material/Material;WATER:Lnet/minecraft/block/material/Material;", ordinal = 0),
         to = @At(value = "FIELD", target = "Lnet/minecraft/block/material/Material;LAVA:Lnet/minecraft/block/material/Material;", ordinal = 0)
      ),
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/GlStateManager;setFogDensity(F)V")
   )
   private boolean lunar$waterFogDensityEvent(float var1) {
      return this.lunar$postEventEntityFogRender(
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RRCRRCORICCHOHHIRCHIROOHIIOHCO.WATER,
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CRRRICCRROCOHHOHIICIHORCOORRRH.DENSITY,
         var1
      );
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @WrapWithCondition(method = "setupFog", at = @At(value = "INVOKE", target = "Lorg/lwjgl/opengl/GL11;glFogf(IF)V", ordinal = 10))
   private boolean lunar$lavaFogDensityEvent(int var1, float var2) {
      return this.lunar$postEventEntityFogRender(
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RRCRRCORICCHOHHIRCHIROOHIIOHCO.LAVA,
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CRRRICCRROCOHHOHIICIHORCOORRRH.DENSITY,
         var2
      );
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @WrapWithCondition(
      method = "setupFog",
      slice = @Slice(from = @At(value = "FIELD", target = "Lnet/minecraft/block/material/Material;LAVA:Lnet/minecraft/block/material/Material;", ordinal = 0)),
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/GlStateManager;setFogDensity(F)V", ordinal = 0)
   )
   private boolean lunar$lavaFogDensityEvent(float var1) {
      return this.lunar$postEventEntityFogRender(
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RRCRRCORICCHOHHIRCHIROOHIIOHCO.LAVA,
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CRRRICCRROCOHHOHIICIHORCOORRRH.DENSITY,
         var1
      );
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @WrapWithCondition(
      method = "setupFog",
      slice = @Slice(from = @At(value = "FIELD", target = "Lnet/minecraft/client/renderer/EntityRenderer;farPlaneDistance:F", ordinal = 1)),
      at = {
            @At(value = "INVOKE", target = "Lorg/lwjgl/opengl/GL11;glFogf(IF)V", ordinal = 0),
            @At(value = "INVOKE", target = "Lorg/lwjgl/opengl/GL11;glFogf(IF)V", ordinal = 2),
            @At(value = "INVOKE", target = "Lorg/lwjgl/opengl/GL11;glFogf(IF)V", ordinal = 4)
      }
   )
   private boolean lunar$renderDistanceFogStartEvent(int var1, float var2) {
      return this.lunar$postEventEntityFogRender(
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RENDER_DISTANCE,
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CRRRICCRROCOHHOHIICIHORCOORRRH.START,
         var2
      );
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @WrapWithCondition(
      method = "setupFog",
      slice = @Slice(from = @At(value = "FIELD", target = "Lnet/minecraft/client/renderer/EntityRenderer;farPlaneDistance:F", ordinal = 1)),
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/GlStateManager;setFogStart(F)V")
   )
   private boolean lunar$renderDistanceFogStartEvent(float var1) {
      return this.lunar$postEventEntityFogRender(
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RENDER_DISTANCE,
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CRRRICCRROCOHHOHIICIHORCOORRRH.START,
         var1
      );
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @WrapWithCondition(
      method = "setupFog",
      slice = @Slice(from = @At(value = "FIELD", target = "Lnet/minecraft/client/renderer/EntityRenderer;farPlaneDistance:F", ordinal = 1)),
      at = {
            @At(value = "INVOKE", target = "Lorg/lwjgl/opengl/GL11;glFogf(IF)V", ordinal = 1),
            @At(value = "INVOKE", target = "Lorg/lwjgl/opengl/GL11;glFogf(IF)V", ordinal = 3),
            @At(value = "INVOKE", target = "Lorg/lwjgl/opengl/GL11;glFogf(IF)V", ordinal = 5)
      }
   )
   private boolean lunar$renderDistanceFogEndEvent(int var1, float var2) {
      return this.lunar$postEventEntityFogRender(
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RENDER_DISTANCE,
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CRRRICCRROCOHHOHIICIHORCOORRRH.END,
         var2
      );
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @WrapWithCondition(
      method = "setupFog",
      slice = @Slice(from = @At(value = "FIELD", target = "Lnet/minecraft/client/renderer/EntityRenderer;farPlaneDistance:F", ordinal = 1)),
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/GlStateManager;setFogEnd(F)V")
   )
   private boolean lunar$renderDistanceFogEndEvent(float var1) {
      return this.lunar$postEventEntityFogRender(
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RENDER_DISTANCE,
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CRRRICCRROCOHHOHIICIHORCOORRRH.END,
         var1
      );
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @ModifyArg(
      method = "orientCamera",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/GlStateManager;translate(FFF)V", ordinal = 4),
      index = 1
   )
   private float lunar$onTranslateEyeHeight(float var1) {
      float var2 = -var1;
      Entity var3 = this.mc.getRenderViewEntity$v1_8();
      if (var3 == Minecraft.getMinecraft().player$v1_8 && !this.renderingWorldDirections) {
         float var4 = var3.getEyeHeight();
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var5 = (com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH)com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.class,
               () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                  var4, 0.08F
               )
            );
         if (var5 != null && var5.isModified()) {
            var2 = var5.getEyeHeight();
         } else {
            var2 = var4;
         }

         if (((EntityLivingBase)var3).isPlayerSleeping()) {
            var2 = (float)(var2 + 1.0);
         }
      }

      return -var2;
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(1)
   @Redirect(method = "renderWorldDirections$v1_8", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/EntityRenderer;orientCamera(F)V"))
   private void lunar$renderWorldDirections(EntityRenderer var1, float var2) {
      this.renderingWorldDirections = true;
      this.orientCamera(var2);
      this.renderingWorldDirections = false;
   }

   @Inject(method = "addRainParticles", at = @At("HEAD"), cancellable = true)
   private void lunar$preventRainParticles(CallbackInfo var1) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IHORRHOROHHHIORCCHRCRIRRHHCCCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .HOORCICIRRCCORHCIHROHRIRIHCOHI();
      if (var2.isEnabled()
         && var2.CCHOOOIRHRRCCRRCCCIORIIOOCCHOI().get()
            == com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IHORRHOROHHHIORCCHRCRIRRHHCCCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CLEAR
         )
       {
         var1.cancel();
      }
   }

   @Inject(method = "renderRainSnow", at = @At("HEAD"), cancellable = true)
   private void lunar$optifineWeatherControl(float var1, CallbackInfo var2) {
      if (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HRICIORORHCRHCCCIIIHRRHCICOHOR().isPresent()
         && !((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.HHCCIRHCCCIIRHCROHIORHIRHHIORH)com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HRICIORORHCRHCCCIIIHRRHCICOHOR()
               .get())
            .getConfig()
            .isWeatherEnabled()) {
         var2.cancel();
      }

      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IHORRHOROHHHIORCCHRCRIRRHHCCCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .HOORCICIRRCCORHCIHROHRIRIHCOHI();
      if (var3.isEnabled()
         && var3.CCHOOOIRHRRCCRRCCCIORIIOOCCHOI().get()
            == com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IHORRHOROHHHIORCCHRCRIRRHHCCCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CLEAR
         )
       {
         var2.cancel();
      }
   }

   @ModifyExpressionValue(method = "renderRainSnow", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/multiplayer/WorldClient;getRainStrength(F)F"))
   private float lunar$modifyRainStrength(float var1) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IHORRHOROHHHIORCCHRCRIRRHHCCCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .HOORCICIRRCCORHCIHROHRIRIHCOHI();
      return var2.RRHHORICORICIRHICOHHROHIIHICCH(var1) ? var2.ICOCOHRRCCOIHOIHICIROHHOIIORHH() : var1;
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @ModifyExpressionValue(method = "renderRainSnow", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/biome/Biome;canRain$v1_8()Z"))
   private boolean lunar$canRain(boolean var1) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IHORRHOROHHHIORCCHRCRIRRHHCCCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .HOORCICIRRCCORHCIHROHRIRIHCOHI();
      if (var2.isEnabled()) {
         switch ((com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IHORRHOROHHHIORCCHRCRIRRHHCCCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var2.CCHOOOIRHRRCCRRCCCIORIIOOCCHOI()
            .get()) {
            case RAIN:
            case SNOW:
               return true;
            case CLEAR:
               return false;
         }
      }

      return var1;
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 1)
   @ModifyExpressionValue(
      method = "renderRainSnow",
      at = @At(value = "INVOKE", target = "net/minecraft/world/biome/WorldChunkManager.getTemperatureAtHeight (FI)F")
   )
   private float lunar$forceRainInAllBiomes_v1_7(float var1) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IHORRHOROHHHIORCCHRCRIRRHHCCCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .HOORCICIRRCCORHCIHROHRIRIHCOHI();
      if (var2.isEnabled()) {
         switch ((com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IHORRHOROHHHIORCCHRCRIRRHHCCCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var2.CCHOOOIRHRRCCRRCCCIORIIOOCCHOI()
            .get()) {
            case RAIN:
               return 0.15F;
            case SNOW:
               return 0.0F;
         }
      }

      return var1;
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   @ModifyExpressionValue(
      method = "renderRainSnow",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/world/biome/BiomeProvider;getTemperatureAtHeight$v1_12(FI)F")
   )
   private float lunar$forceRainInAllBiomes_v1_12(float var1) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IHORRHOROHHHIORCCHRCRIRRHHCCCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .HOORCICIRRCCORHCIHROHRIRIHCOHI();
      if (var2.isEnabled()) {
         switch ((com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IHORRHOROHHHIORCCHRCRIRRHHCCCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var2.CCHOOOIRHRRCCRRCCCIORIIOOCCHOI()
            .get()) {
            case RAIN:
               return 0.15F;
            case SNOW:
               return 0.0F;
         }
      }

      return var1;
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Redirect(method = "renderRainSnow", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/Tessellator;setColorRGBA_F$v1_7(FFFF)V"))
   private void lunar$changeRainColor(Tessellator var1, float var2, float var3, float var4, float var5) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IHORRHOROHHHIORCCHRCRIRRHHCCCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var6 = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .HOORCICIRRCCORHCIHROHRIRIHCOHI();
      if (var6.isEnabled()) {
         int var7 = var6.COCCCORHHRIICIROCCCOHCRCIICROO().OCOHORHCROHICRRIHCIHHRRCIHICRI(0.0F);
         var1.setColorRGBA_F$v1_7(
            OCOHORHCROHICRRIHCIHHRRCIHICRI.RCHRHOCCORRRCRORCHIIRRIIIRRCRR(var7),
            OCOHORHCROHICRRIHCIHHRRCIHICRI.HOHHRHCIOCRCHCOOOHORROICORCCCC(var7),
            OCOHORHCROHICRRIHCIHHRRCIHICRI.RICIORHICRROHOCHRRCRIHCROOCIIC(var7),
            var5
         );
      } else {
         var1.setColorRGBA_F$v1_7(var2, var3, var4, var5);
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Redirect(
      method = "renderRainSnow",
      require = 4,
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/BufferBuilder;color$v1_8(FFFF)Lnet/minecraft/client/renderer/BufferBuilder;")
   )
   private BufferBuilder lunar$changeRainColor(BufferBuilder var1, float var2, float var3, float var4, float var5) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IHORRHOROHHHIORCCHRCRIRRHHCCCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var6 = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .HOORCICIRRCCORHCIHROHRIRIHCOHI();
      if (var6.isEnabled()) {
         int var7 = var6.COCCCORHHRIICIROCCCOHCRCIICROO().OCOHORHCROHICRRIHCIHHRRCIHICRI(0.0F);
         var1.color$v1_8(
            OCOHORHCROHICRRIHCIHHRRCIHICRI.RCHRHOCCORRRCRORCHIIRRIIIRRCRR(var7),
            OCOHORHCROHICRRIHCIHHRRCIHICRI.HOHHRHCIOCRCHCOOOHORROICORCCCC(var7),
            OCOHORHCROHICRRIHCIHHRRCIHICRI.RICIORHICRROHOCHRRCRIHCROOCIIC(var7),
            var5
         );
      } else {
         var1.color$v1_8(var2, var3, var4, var5);
      }

      return var1;
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @ModifyArg(method = "hurtCameraEffect", at = @At(value = "INVOKE", target = "org/lwjgl/opengl/GL11.glRotatef (FFFF)V"), index = 0)
   private float lunar$applyHurtShakeIntensity_v1_7(float var1) {
      return var1
         * IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .IRORCRICCHHIRICCCCIHICOCIOCCII()
            .OOIRRCRIIOCROCCOHICRCOORICOCOI();
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @ModifyArg(method = "hurtCameraEffect", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/GlStateManager;rotate(FFFF)V"), index = 0)
   private float lunar$applyHurtShakeIntensity_v1_8(float var1) {
      return var1
         * IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .IRORCRICCHHIRICCCCIHICOCIOCCII()
            .OOIRRCRIIOCROCCOHICRCOORICOCOI();
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 1)
   @WrapWithCondition(
      method = "setupCameraTransform",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/EntityRenderer;setupViewBobbing$v1_7(F)V")
   )
   private boolean lunar$applyViewBobbing_v1_7(EntityRenderer var1, float var2) {
      return !IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .HOORIHHORRRRHCIRCIHCCCRRCCICIR()
         .RCIHORCICCIICRIOHIHHIHIICHHOCH();
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   @WrapWithCondition(
      method = "setupCameraTransform",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/EntityRenderer;applyBobbing$v1_12(F)V")
   )
   private boolean lunar$applyViewBobbing_v1_12(EntityRenderer var1, float var2) {
      return !IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .HOORIHHORRRRHCIRCIHCCCRRCCICIR()
         .RCIHORCICCIICRIOHIHHIHIICHHOCH();
   }

   @Inject(method = {"updateCameraAndRender$v1_7", "updateCameraAndRender$v1_8"}, at = @At("HEAD"))
   private void lunar$limitFps(CallbackInfo var1) {
      HICHRCOHCCRHOHCICOOCHOIHCCHIRI.OIOOCRIOHRHHIHICRICHHICHOCRCII();
   }

   @Inject(
      method = {"updateCameraAndRender$v1_7", "updateCameraAndRender$v1_8"},
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/shader/Framebuffer;bindFramebuffer(Z)V", shift = Shift.AFTER)
   )
   private void lunar$postEffectRenderingEvent(CallbackInfo var1) {
      if (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RHCHHROCORIHCIORRRIIOHIRHCRIOH().CCCCCHHRHOIHHORCHHOCIHHRCHOCRC()) {
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               OHHRIOHROOIHOROCIRHCHORIHRRRRI.class,
               () -> new OHHRIOHROOIHOROCIRHCHORIHRRRRI(
                  com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI.HHHRRIRIHIHRORCOHCRRCIOCRIORIR(),
                  com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IHRCROHROHOCCHIHOHRROHOCOIRHIO()
                     .bridge$getMainRenderTarget()
               )
            );
         if (this.lunar$fastRenderCapture != null) {
            this.lunar$fastRenderCapture.bridge$delete();
            this.lunar$fastRenderCapture = null;
         }
      } else if (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RHCHHROCORIHCIORRRIIOHIRHCRIOH()
         .HCRCROOHOHOHOHCOCRCCHRIHCORRIO()) {
         OHHRIOHROOIHOROCIRHCHORIHRRRRI var2 = (OHHRIOHROOIHOROCIRHCHORIHRRRRI)com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               OHHRIOHROOIHOROCIRHCHORIHRRRRI.class,
               () -> {
                  com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1x = this.lunar$getFastRenderCaptureTarget();
                  GL30.glBindFramebuffer(36008, 0);
                  GL30.glBindFramebuffer(36009, ((Framebuffer)var1x).framebufferObject);
                  GL30.glBlitFramebuffer(
                     0, 0, this.mc.displayWidth, this.mc.displayHeight, 0, 0, var1x.bridge$framebufferWidth(), var1x.bridge$framebufferHeight(), 16384, 9728
                  );
                  GL30.glBindFramebuffer(36160, 0);
                  return new OHHRIOHROOIHOROCIRHCHORIHRRRRI(
                     com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI.HHHRRIRIHIHRORCOHCRRCIOCRIORIR(),
                     var1x
                  );
               }
            );
         if (var2 != null && var2.isModified()) {
            GL30.glBindFramebuffer(36160, 0);
            var2.HICROOROOIIHCROHIIRIICOOHROORI().bridge$blitToScreen(0, 0, this.mc.displayWidth, this.mc.displayHeight, false);
         }
      }
   }

   @Unique
   private com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH lunar$getFastRenderCaptureTarget() {
      int var1 = this.mc.displayWidth;
      int var2 = this.mc.displayHeight;
      if (this.lunar$fastRenderCapture != null
         && this.lunar$fastRenderCapture.bridge$framebufferWidth() == var1
         && this.lunar$fastRenderCapture.bridge$framebufferHeight() == var2) {
         return this.lunar$fastRenderCapture;
      }

      if (this.lunar$fastRenderCapture == null) {
         this.lunar$fastRenderCapture = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IHORRHCCCIROIRCIRIRCIORHRRRHRR()
            .CIOHHCORHRCCRICCCORIHCRHCCCRRR(var1, var2)
            .RIROICHCRROROHCCROOCCCCOCHCCRI(true)
            .OHHHOIRORRRHROOROCHCIIICIRCROH();
      } else {
         this.lunar$fastRenderCapture.bridge$createBindFramebuffer(var1, var2);
      }

      return this.lunar$fastRenderCapture;
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Inject(
      method = "renderWorld",
      at = @At(
         value = "INVOKE_STRING",
         target = "Lnet/minecraft/profiler/Profiler;endStartSection(Ljava/lang/String;)V",
         args = "ldc=hand",
         shift = Shift.AFTER
      )
   )
   private void lunar$postLevelRenderingEvent$v1_7(CallbackInfo var1) {
      this.lunar$postLevelRenderingEvent();
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Inject(
      method = "renderWorldPass$v1_8",
      at = @At(
         value = "INVOKE_STRING",
         target = "Lnet/minecraft/profiler/Profiler;endStartSection(Ljava/lang/String;)V",
         args = "ldc=hand",
         shift = Shift.AFTER
      )
   )
   private void lunar$postLevelRenderingEvent$v1_8(int var1, float var2, long var3, CallbackInfo var5) {
      this.lunar$postLevelRenderingEvent();
   }

   @Unique
   private void lunar$postLevelRenderingEvent() {
      if (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RHCHHROCORIHCIORRRIIOHIRHCRIOH().CCCCCHHRHOIHHORCHHOCIHHRCHOCRC()) {
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               RHOCHHIRRCHHHOHOIRROIROHHHIHIO.class,
               () -> new RHOCHHIRRCHHHOHOIRROIROHHHIHIO(
                  com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI.HHHRRIRIHIHRORCOHCRRCIOCRIORIR(),
                  com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IHRCROHROHOCCHIHOHRROHOCOIRHIO()
                     .bridge$getMainRenderTarget()
               )
            );
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Inject(method = "renderWorld", at = @At("HEAD"))
   private void lunar$beginLazyChunkLoading$v1_7(CallbackInfo var1) {
      if (((com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .HHHIHROORHHOOCCOOCHRIRHRHCRHIH()
               .OCROCOHRIHRIRHRROHRRCHCORRCCHH()
               .IRCHIIRCIIORIOCOCIOIRCOCICRCCO()
               .get())
            .getAmount()
         > 30) {
         this.timesUpdated = 0.0F;
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Redirect(
      method = "renderWorld",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/RenderGlobal;updateRenderers(Lnet/minecraft/entity/EntityLivingBase;Z)Z")
   )
   private boolean lunar$onUpdateRenderers$v1_7(RenderGlobal var1, EntityLivingBase var2, boolean var3) {
      boolean var4 = this.timesUpdated == 0.0F && var1.updateRenderers$v1_7(var2, var3);
      this.timesUpdated++;
      if (this.timesUpdated
         >= ((com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .HHHIHROORHHOOCCOOCHRIRHRHCRHIH()
               .OCROCOHRIHRIRHRROHRRCHCORRCCHH()
               .IRCHIIRCIIORIOCOCIOIRCOCICRCCO()
               .get())
            .getAmount()) {
         this.timesUpdated = 0.0F;
      }

      return var4;
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @ModifyArg(method = "hurtCameraEffect(F)V", at = @At(value = "INVOKE", target = "Lnet/minecraft/util/math/MathHelper;sin(F)F"))
   private float lunar$oneSevenHurtShake(float var1) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .ICORHOCRRIRHRIOHCCHIIOHHICCCCC()
         .CRCIOCHORHIOROOCOCOOHHIRHIHOCH()
         .HCIRCRCIOHICHCHCORRIROHRIRRRHO()) {
         float var2 = (float)Math.sqrt(Math.sqrt(var1 / Math.PI));
         var2 /= 1.15F;
         return (float)(var2 * var2 * var2 * var2 * Math.PI);
      } else {
         return var1;
      }
   }

   @ModifyExpressionValue(method = "getFOVModifier(FZ)F", at = @At(value = "FIELD", target = "net/minecraft/client/settings/GameSettings.fovSetting : F"))
   private float lunar$eventFovConstant(float var1, float var2, boolean var3) {
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var4 = (com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH)com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.class,
            () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
               var1, var2, this.fovModifierHandPrev, this.fovModifierHand
            )
         );
      return var4 == null ? var1 : var4.RHHHRIIROORRIHCHRHCOCOCIHRCCIC();
   }

   @ModifyReturnValue(method = "getFOVModifier(FZ)F", at = @At("RETURN"))
   private float lunar$eventFovReturn(float var1, float var2, boolean var3) {
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var4 = (com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH)com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class,
            () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               var1, var2, 0.0F, 0.0F
            )
         );
      return var4 == null ? var1 : var4.RHHHRIIROORRIHCHRHCOCOCIHRCCIC();
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Inject(method = "updateRenderer", at = @At("TAIL"))
   private void lunar$smoothCamera(CallbackInfo var1) {
      if (!this.mc.gameSettings.smoothCamera) {
         this.smoothCamFilterX = 0.0F;
         this.smoothCamFilterY = 0.0F;
         this.mouseFilterXAxis.targetValue = 0.0F;
         this.mouseFilterXAxis.remainingValue = 0.0F;
         this.mouseFilterXAxis.lastAmount = 0.0F;
         this.mouseFilterYAxis.targetValue = 0.0F;
         this.mouseFilterYAxis.remainingValue = 0.0F;
         this.mouseFilterYAxis.lastAmount = 0.0F;
      }
   }

   @ModifyExpressionValue(
      method = {"updateCameraAndRender$v1_7", "updateCameraAndRender$v1_8"},
      at = @At(value = "FIELD", opcode = 180, target = "Lnet/minecraft/client/settings/GameSettings;mouseSensitivity:F")
   )
   private float lunar$adjustCameraSensitivity$v1_8(float var1) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOCCCRIHOCHRCHRHCRHROIRIRHHHIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .HOCHHHRHHIOOIHCRCRHRROIHCCRRHR();
      return var2.isEnabled() && var2.isActive() ? var1 * var2.ORCOOICOHOIHRRCOCRIIRHHHHHOOIO() : var1;
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Inject(
      method = "renderWorldPass$v1_8",
      at = @At(value = "INVOKE_STRING", target = "Lnet/minecraft/profiler/Profiler;endStartSection(Ljava/lang/String;)V", args = "ldc=hand")
   )
   private void lunar$renderWorldLast$v1_8(int var1, float var2, long var3, CallbackInfo var5) {
      Minecraft.getMinecraft().profiler.endStartSection("event3d");
      this.lunar$updateClippingHelper(var2);
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHCRORHRORIICHRHRCHRRIRRHHOCOO(
         var2
      );
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.class,
            () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RHOCHHIRRCHHHOHOIRROIROHHHIHIO(
               (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI)this.mc
                  .renderGlobal,
               var2
            )
         );
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Inject(
      method = "renderWorld",
      at = @At(value = "INVOKE_STRING", target = "Lnet/minecraft/profiler/Profiler;endStartSection(Ljava/lang/String;)V", args = "ldc=hand")
   )
   private void lunar$renderWorldLast$v1_7(float var1, long var2, CallbackInfo var4) {
      Minecraft.getMinecraft().profiler.endStartSection("event3d");
      this.lunar$updateClippingHelper(var1);
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHCRORHRORIICHRHRCHRRIRRHHOCOO(
         var1
      );
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.class,
            () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RHOCHHIRRCHHHOHOIRROIROHHHIHIO(
               (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI)this.mc
                  .renderGlobal,
               var1
            )
         );
   }

   @Unique
   private void lunar$updateClippingHelper(float var1) {
      Minecraft var2 = this.mc;
      Object var3 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? var2.renderViewEntity$v1_8 : var2.renderViewEntity$v1_7;
      ClippingHelperImpl var4 = ClippingHelperImpl.instance;
      var2.profiler.endStartSection("event3d");
      double var5 = RHRIIOOOCRHIIOORCOCRCHRCCRRCIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(((Entity)var3).prevPosX, ((Entity)var3).posX, var1);
      double var7 = RHRIIOOOCRHIIOORCOCRCHRCCRRCIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(((Entity)var3).prevPosY, ((Entity)var3).posY, var1) + var3.getEyeHeight();
      double var9 = RHRIIOOOCRHIIOORCOCRCHRCCRRCIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(((Entity)var3).prevPosZ, ((Entity)var3).posZ, var1);
      CCRHOICIRORRHOOOCIHHHHCHCICHOH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5, var7, var9, (var1x, var2x) -> {
         System.arraycopy(var4.modelviewMatrix, 0, var1x.array(), 0, var4.modelviewMatrix.length);
         System.arraycopy(var4.projectionMatrix, 0, var2x.array(), 0, var4.projectionMatrix.length);
      });
   }

   @Unique
   private void lunar$callGuiDrawScreenEvents(GuiScreen var1, int var2, int var3, float var4) {
      int var5;
      int var6;
      if (this.lunar$inventoryGuiScale$pre()) {
         var5 = (int)(var2 / this.lunar$inventoryScaleFactor);
         var6 = (int)(var3 / this.lunar$inventoryScaleFactor);
      } else {
         var5 = var2;
         var6 = var3;
      }

      CIOHHCORHRCCRICCCORIHCRHCCCRRR var7 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI.HHHRRIRIHIHRORCOHCRRCIOCRIORIR();

      try {
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.class,
               com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.class,
               var5x -> var5x.wrapEvents(
                  () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH(
                     new com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var5, var6),
                     var4,
                     (ORHIOICIOCRRHOOCOHRORIHICHRCRR)var1,
                     var7,
                     new com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                        var7
                     )
                  ),
                  () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                     new com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var5, var6),
                     var4,
                     (ORHIOICIOCRRHOOCOHRORIHICHRCRR)var1,
                     var7,
                     new com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                        var7
                     )
                  )
               ),
               () -> var1.drawScreen(var5, var6, var4)
            );
      } finally {
         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IIOCHOIICCIORCOROIROHICCHIOHIC.CRRRICCRROCOHHOHIICIHORCOORRRH.RIRRCORROOHICCHOHOORICRRCHRCOR();
      }

      this.lunar$inventoryGuiScale$post();
   }

   @Unique
   private boolean lunar$inventoryGuiScale$pre() {
      ORHIOICIOCRRHOOCOHRORIHICHRCRR var1 = (ORHIOICIOCRRHOOCOHRORIHICHRCRR)this.mc.currentScreen;
      int var2 = var1 == null ? 0 : var1.bridge$getInventoryScale();
      if (var2 <= 0) {
         this.lunar$inventoryScaleFactor = 1.0F;
         return false;
      } else {
         this.lunar$inventoryGuiScale = this.mc.gameSettings.guiScale;
         this.mc.gameSettings.guiScale = var2;
         this.lunar$inventoryScaleFactor = (float)var2
            / com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.ROHHOOHOHCHRIICCCHCOHCORROHRIH()
               .IOCIOIHIOOCRHHORHHCOOHIIHICOCH();
         var1.bridge$setInventoryScaleFactor(this.lunar$inventoryScaleFactor);
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RHCHRCCRRHORIOCIOHHCRHCHICRIHH().HHIHIIOICHCCHIIRRCCRHHHOOCOOCO();
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RHCHRCCRRHORIOCIOHHCRHCHICRIHH()
            .bridge$scale(this.lunar$inventoryScaleFactor, this.lunar$inventoryScaleFactor, 1.0F);
         return true;
      }
   }

   @Unique
   private void lunar$inventoryGuiScale$post() {
      if (this.lunar$inventoryGuiScale != null) {
         this.mc.gameSettings.guiScale = this.lunar$inventoryGuiScale;
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RHCHRCCRRHORIOCIOHHCRHCHICRIHH().HROOORICCCOROOORORCORRHRHORIRC();
         this.lunar$inventoryGuiScale = null;
         this.lunar$inventoryScaleFactor = 1.0F;
         ORHIOICIOCRRHOOCOHRORIHICHRCRR var1 = (ORHIOICIOCRRHOOCOHRORIHICHRCRR)this.mc.currentScreen;
         if (var1 != null) {
            var1.bridge$setInventoryScaleFactor(1.0F);
         }
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Redirect(method = "updateCameraAndRender$v1_7", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/GuiScreen;drawScreen(IIF)V"))
   private void lunar$updateCameraAndRender$drawScreen$v1_7(GuiScreen var1, int var2, int var3, float var4) {
      if (com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ROCOCHICHORROOHCHOCIIICOHCHIOC()
            != null
         && com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ROCOCHICHORROOHCHOCIIICOHCHIOC()
            .ROHCORIRIRHCCCOROHIOOOCHHCICCR()) {
         var2 = 0;
         var3 = 0;
      }

      try {
         OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, 240.0F, 240.0F);
         this.lunar$callGuiDrawScreenEvents(var1, var2, var3, var4);
      } catch (Throwable var11) {
         CrashReport var6 = CrashReport.makeCrashReport(var11, "Rendering screen");
         CrashReportCategory var7 = var6.makeCategory("Screen render details");
         String var8 = this.mc.currentScreen.getClass().getCanonicalName();
         var7.addCrashSectionCallable$v1_7("Screen name", () -> var8);
         String var9 = String.format("Scaled: (%d, %d). Absolute: (%d, %d)", var2, var3, Mouse.getX(), Mouse.getY());
         var7.addCrashSectionCallable$v1_7("Mouse location", () -> var9);
         String var10 = String.format("Scaled: (%d, %d). Absolute: (%d, %d). Scale factor of %d", 0, 0, this.mc.displayWidth, this.mc.displayHeight, 0);
         var7.addCrashSectionCallable$v1_7("Screen size", () -> var10);
         throw new ReportedException(var6);
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Redirect(method = "updateCameraAndRender$v1_8", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/GuiScreen;drawScreen(IIF)V"))
   @com.moonsworth.lunar.ichor.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(absent = "forge")
   private void lunar$updateCameraAndRender$drawScreen$v1_8(GuiScreen var1, int var2, int var3, float var4) {
      if (com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ROCOCHICHORROOHCHOCIIICOHCHIOC()
            != null
         && com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ROCOCHICHORROOHCHOCIIICOHCHIOC()
            .ROHCORIRIRHCCCOROHIOOOCHHCICCR()) {
         var2 = 0;
         var3 = 0;
      }

      try {
         OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, 240.0F, 240.0F);
         this.lunar$callGuiDrawScreenEvents(var1, var2, var3, var4);
      } catch (Throwable var11) {
         CrashReport var6 = CrashReport.makeCrashReport(var11, "Rendering screen");
         CrashReportCategory var7 = var6.makeCategory("Screen render details");
         String var8 = this.mc.currentScreen.getClass().getCanonicalName();
         String var9 = String.format("Scaled: (%d, %d). Absolute: (%d, %d)", var2, var3, Mouse.getX(), Mouse.getY());
         String var10 = String.format("Scaled: (%d, %d). Absolute: (%d, %d). Scale factor of %d", 0, 0, this.mc.displayWidth, this.mc.displayHeight, 0);
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 0) {
            var7.addCrashSectionCallable$v1_7("Screen name", () -> var8);
            var7.addCrashSectionCallable$v1_7("Mouse location", () -> var9);
            var7.addCrashSectionCallable$v1_7("Screen size", () -> var10);
         } else if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 1) {
            var7.addCrashSectionCallable$v1_8("Screen name", () -> var8);
            var7.addCrashSectionCallable$v1_8("Mouse location", () -> var9);
            var7.addCrashSectionCallable$v1_8("Screen size", () -> var10);
         } else {
            var7.addDetail$v1_12("Screen name", () -> var8);
            var7.addDetail$v1_12("Mouse location", () -> var9);
            var7.addDetail$v1_12("Screen size", () -> var10);
         }

         throw new ReportedException(var6);
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Redirect(
      method = "updateCameraAndRender$v1_7",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/entity/EntityClientPlayerMP;setAngles$v1_7(FF)V")
   )
   private void lunar$setAngles$v1_7(EntityClientPlayerMP var1, float var2, float var3) {
      if (var1 != null) {
         IHIRRIIORRHORHRORIHOROIRCORCOO var4 = (IHIRRIIORRHORHRORIHOROIRCORCOO)com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IHIRRIIORRHORHRORIHOROIRCORCOO.class, () -> new IHIRRIIORRHORHRORIHOROIRCORCOO(var2, var3));
         if (var4 != null) {
            if (!var4.isCancelled()
               && !IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HHCCIRORCRCHOIOHRRIRRRIORRCRRR().CHICCHHHRCRROORCRCCCRHOICIOROC().isActive()
               )
             {
               var1.setAngles$v1_7(var4.OHHRCICCCCHHCOCOHHHIOOHCOCHOOR(), var4.HOCCHIRRRORRRRORCRHHHOHOOHOOOI());
            }
         } else {
            var1.setAngles$v1_7(var2, var3);
         }
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(1)
   @Redirect(method = "updateCameraAndRender$v1_8", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/entity/EntityPlayerSP;setAngles(FF)V"))
   private void lunar$setAngles$v1_8(EntityPlayerSP var1, float var2, float var3) {
      if (var1 != null) {
         IHIRRIIORRHORHRORIHOROIRCORCOO var4 = (IHIRRIIORRHORHRORIHOROIRCORCOO)com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IHIRRIIORRHORHRORIHOROIRCORCOO.class, () -> new IHIRRIIORRHORHRORIHOROIRCORCOO(var2, var3));
         if (var4 != null) {
            if (!var4.isCancelled()
               && !IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HHCCIRORCRCHOIOHRRIRRRIORRCRRR().CHICCHHHRCRROORCRCCCRHOICIOROC().isActive()
               )
             {
               var1.setAngles$v1_7(var4.OHHRCICCCCHHCOCOHHHIOOHCOCHOOR(), var4.HOCCHIRRRORRRRORCRHHHOHOOHOOOI());
            }
         } else {
            var1.setAngles$v1_7(var2, var3);
         }
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   @Redirect(method = "updateCameraAndRender$v1_8", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/entity/EntityPlayerSP;turn(FF)V"))
   private void lunar$setAngles$v1_12(EntityPlayerSP var1, float var2, float var3) {
      if (var1 != null) {
         IHIRRIIORRHORHRORIHOROIRCORCOO var4 = (IHIRRIIORRHORHRORIHOROIRCORCOO)com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IHIRRIIORRHORHRORIHOROIRCORCOO.class, () -> new IHIRRIIORRHORHRORIHOROIRCORCOO(var2, var3));
         if (var4 != null) {
            if (!var4.isCancelled()
               && !IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HHCCIRORCRCHOIOHRRIRRRIORRCRRR().CHICCHHHRCRROORCRCCCRHOICIOROC().isActive()
               )
             {
               var1.turn$v1_12(var4.OHHRCICCCCHHCOCOHHHIOOHCOCHOOR(), var4.HOCCHIRRRORRRRORCRHHHOHOOHOOOI());
            }
         } else {
            var1.turn$v1_12(var2, var3);
         }
      }
   }

   @ModifyExpressionValue(
      method = "orientCamera",
      at = {
            @At(value = "FIELD", target = "Lnet/minecraft/entity/EntityLivingBase;rotationYaw:F"),
            @At(value = "FIELD", target = "Lnet/minecraft/entity/EntityLivingBase;prevRotationYaw:F"),
            @At(value = "FIELD", target = "Lnet/minecraft/entity/Entity;rotationYaw:F"),
            @At(value = "FIELD", target = "Lnet/minecraft/entity/Entity;prevRotationYaw:F")
      },
      require = 2,
      expect = 2
   )
   private float lunar$changeCameraYaw(float var1, float var2) {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HHCCIRORCRCHOIOHRRIRRRIORRCRRR().CHICCHHHRCRROORCRCCCRHOICIOROC().isEnabled()
            && IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HHCCIRORCRCHOIOHRRIRRRIORRCRRR().CHICCHHHRCRROORCRCCCRHOICIOROC().isActive()
         ? IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .CHICCHHHRCRROORCRCCCRHOICIOROC()
            .HRHOIRCHICHROHIHORRCRIRHOCRRRH()
         : var1;
   }

   @ModifyExpressionValue(
      method = "orientCamera",
      at = {
            @At(value = "FIELD", target = "Lnet/minecraft/entity/EntityLivingBase;rotationPitch:F"),
            @At(value = "FIELD", target = "Lnet/minecraft/entity/EntityLivingBase;prevRotationPitch:F"),
            @At(value = "FIELD", target = "Lnet/minecraft/entity/Entity;rotationPitch:F"),
            @At(value = "FIELD", target = "Lnet/minecraft/entity/Entity;prevRotationPitch:F")
      },
      require = 2,
      expect = 2
   )
   private float lunar$changeCameraPitch(float var1, float var2) {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HHCCIRORCRCHOIOHRRIRRRIORRCRRR().CHICCHHHRCRROORCRCCCRHOICIOROC().isEnabled()
            && IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HHCCIRORCRCHOIOHRRIRRRIORRCRRR().CHICCHHHRCRROORCRCCCRHOICIOROC().isActive()
         ? IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .CHICCHHHRCRROORCRCCCRHOICIOROC()
            .HIICIHRORROOIIROCCRHICCHIHRCOH()
         : var1;
   }

   @WrapOperation(
      method = "orientCamera",
      at = {
            @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/GlStateManager;translate(FFF)V", ordinal = 2),
            @At(value = "INVOKE", target = "Lorg/lwjgl/opengl/GL11;glTranslatef(FFF)V", ordinal = 2)
      },
      require = 1
   )
   private void lunar$freelookTranslate(float var1, float var2, float var3, Operation<Void> var4) {
      if (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOIICIRIICICIIOORHCIIIIRRIHRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IIIIRORCORHIIIRCRIOCIOOICOCROI()
            .isActive()
         && !com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOIICIRIICICIIOORHCIIIIRRIHRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IIIIRORCORHIIIRCRIOCIOOICOCROI()
            .CCHRRRORHHCHCOIIORCCRICOHICOHI()) {
         float var5 = 0.125F;
         var4.call(
            new Object[]{
               var1,
               var2,
               var3
                  * (
                     var5
                        + com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOIICIRIICICIIOORHCIIIIRRIHRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IIIIRORCORHIIIRCRIOCIOOICOCROI()
                              .OICICHCIIHCIHHRRROIIIIHIIICCRI()
                           * (1.0F - var5)
                  )
            }
         );
      } else {
         var4.call(new Object[]{var1, var2, var3});
      }
   }

   @Redirect(
      method = "orientCamera",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/multiplayer/WorldClient;rayTraceBlocks(Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;)Lnet/minecraft/util/math/RayTraceResult;"
      )
   )
   private RayTraceResult lunar$thirdPersonFix(WorldClient var1, Vec3d var2, Vec3d var3) {
      return var1.rayTraceBlocks(var2, var3, false, true, false);
   }

   @Inject(method = "orientCamera", at = @At("HEAD"))
   private void lunar$rewindCameraTiltAndShake(CallbackInfo var1) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .IOIOHOOCRRORCCCOCIRROHCOCCCRCO();
      if (var2.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(
         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH::RICCCROHOIOCHORIRCHIIOORHIRHHR
      )) {
         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 = var2.HOROHROIORRIRIIIOOCCIROCRCROHI()
            .CCRHOIIHHCCIROCCROHHIIOCOHIRRC();
         float[] var4 = var3.IOIHOCIIIOOIIRHRCOCORIIHIIRIIO();
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
            GlStateManager.rotate(var4[1], -1.0F, 0.0F, 0.0F);
            GlStateManager.rotate(var4[0], 0.0F, 1.0F, 0.0F);
         } else {
            GL11.glRotatef(var4[1], -1.0F, 0.0F, 0.0F);
            GL11.glRotatef(var4[0], 0.0F, 1.0F, 0.0F);
         }

         if (!var3.CHORCRORCICOCOOORCIOOICCOOIOHC().isFixedToPlayer()) {
            float var5 = ((Double)((List)var3.ICHHOIRROHCRCHHOOCRCIHIICORHRR().get()).get(5)).floatValue();
            if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
               GlStateManager.rotate(var5, 0.0F, 0.0F, 1.0F);
            } else {
               GL11.glRotatef(var5, 0.0F, 0.0F, 1.0F);
            }
         }
      }
   }

   @Inject(method = {"updateCameraAndRender$v1_7", "updateCameraAndRender$v1_8"}, at = @At("TAIL"))
   private void lunar$onUpdateCameraRender(CallbackInfo var1) {
      float var2 = com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.getScale();
      CIOHHCORHRCCRICCCORIHCRHCCCRRR var3 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI.HHHRRIRIHIHRORCOHCRRCIOCRIORIR();
      var3.IRCHOHHOOROOHIIHHROOOOIIHHOIIH();
      var3.push();
      var3.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var2, var2);
      com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
         .IHIHHCICIRHOCHCIOCIORCCOCHORHC()
         .IIHRRHORCRCROCHHOHORCHCROCIHRO(var3);
      var3.pop();
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Inject(method = "updateShaderGroupSize", at = @At("RETURN"))
   private void lunar$bindEntityOutlineFramebuffer(int var1, int var2, CallbackInfo var3) {
      if (OpenGlHelper.shadersSupported) {
         ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI)this.mc
               .renderGlobal)
            .bridge$bindEntityOutlineFbs(var1, var2);
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Inject(
      method = "updateCameraAndRender$v1_7",
      at = @At(
         value = "FIELD",
         opcode = 180,
         target = "Lnet/minecraft/client/renderer/EntityRenderer;shaderGroup:Lnet/minecraft/client/shader/ShaderGroup;",
         shift = Shift.BEFORE,
         ordinal = 0
      )
   )
   private void lunar$renderEntityOutlineFramebuffer(float var1, CallbackInfo var2) {
      ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI)this.mc
            .renderGlobal)
         .bridge$renderEntityOutlineFramebuffer();
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Inject(
      method = "getMouseOver(F)V",
      at = {
            @At(
               value = "FIELD",
               target = "Lnet/minecraft/client/renderer/EntityRenderer;pointedEntity:Lnet/minecraft/entity/Entity;",
               opcode = 181,
               ordinal = 5
            ),
            @At(
               value = "FIELD",
               target = "Lnet/minecraft/client/Minecraft;objectMouseOver:Lnet/minecraft/util/math/RayTraceResult;",
               shift = Shift.AFTER,
               opcode = 181,
               ordinal = 2
            )
      }
   )
   @Dynamic
   private void apollo$reachCheck$v1_8(CallbackInfo var1, @Local(ordinal = 2) double var2) {
      if (this.pointedEntity instanceof AbstractClientPlayer) {
         com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
            .CIRCCCHCCCROROIIOIHIOROIHCHRCH()
            .OOROOCCIRCCRHOIOIORIHCHHOOCCOR(PacketEnrichmentModule.class)
            .filter(var0 -> (Boolean)var0.getOptions().get(PacketEnrichmentModule.PLAYER_ATTACK_PACKET))
            .ifPresent(var3 -> ((IRRCCOICORICIHCHRHIHIHROIRHOCR)var3).RHIIIIHIICHCCOHRRCHIOIOOHHOOHO().put(this.pointedEntity.getUniqueID(), var2));
      }
   }

   @Inject(method = "getFOVModifier(FZ)F", at = @At("HEAD"), cancellable = true)
   private void lunar$rewindFreeCamFOV(float var1, boolean var2, CallbackInfoReturnable<Float> var3) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
         .OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var0 -> !var0.CCRHOIIHHCCIROCCROHHIIOCOHIRRC().CHORCRORCICOCOOORCIOOICCOOIOHC().isFixedToPlayer())) {
         float var4 = this.mc.gameSettings.fovSetting;
         float var5 = var4;
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var6 = (com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH)com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.class,
               () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                  var5, var1, this.fovModifierHandPrev, this.fovModifierHand
               )
            );
         if (var6 != null) {
            var4 = var6.RHHHRIIROORRIHCHRHCOCOCIHRCCIC();
         }

         float var7 = var4;
         var6 = (com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH)com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class,
               () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  var7, var1, 0.0F, 0.0F
               )
            );
         if (var6 != null && (var6.isCancelled() || var6.RHHHRIIROORRIHCHRHCOCOCIHRCCIC() != var4)) {
            var4 = var6.RHHHRIIROORRIHCHRHCOCOCIHRCCIC();
         }

         var3.setReturnValue(var4);
      }
   }

   @WrapOperation(method = "getFOVModifier", at = @At(value = "FIELD", target = "Lnet/minecraft/client/Minecraft;currentScreen"))
   @com.moonsworth.lunar.ichor.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(present = "optifine")
   @Dynamic
   private GuiScreen lunar$rewindAllowZoom(Minecraft var1, Operation<GuiScreen> var2) {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
            .HRIICOIOIIIIRIHHOICRHOIIRCIRIC()
         ? null
         : (GuiScreen)var2.call(new Object[]{var1});
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @WrapOperation(
      method = "getFOVModifier",
      at = {
            @At(value = "INVOKE", target = "Lorg/lwjgl/input/Keyboard;isKeyDown(I)Z"),
            @At(value = "INVOKE", target = "Lorg/lwjgl/input/Mouse;isButtonDown(I)Z")
      },
      require = 2
   )
   @com.moonsworth.lunar.ichor.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(present = "optifine")
   @Dynamic
   private boolean lunar$rewindZoomKey$v1_7(int var1, Operation<Boolean> var2) {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
            .HRIICOIOIIIIRIHHOICRHOIIRCIRIC()
         ? ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH)IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
               .bridge$getGameSettings()
               .bridge$getZoomKey()
               .orElseThrow())
            .bridge$isKeyDown()
         : (Boolean)var2.call(new Object[]{var1});
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @WrapOperation(
      method = "getFOVModifier",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/settings/GameSettings;isKeyDown(Lnet/minecraft/client/settings/KeyBinding_v1_8;)Z")
   )
   @com.moonsworth.lunar.ichor.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(present = "optifine")
   @Dynamic
   private boolean lunar$rewindZoomKey$v1_8(KeyBinding_v1_8 var1, Operation<Boolean> var2) {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
            .HRIICOIOIIIIRIHHOICRHOIIRCIRIC()
         ? var1.pressed
         : (Boolean)var2.call(new Object[]{var1});
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Inject(method = "loadShader$v1_8", at = @At("HEAD"))
   private void lunar$clearCurrentlyLoadedShaders(ResourceLocation var1, CallbackInfo var2) {
      if (this.shaderGroup != null) {
         this.shaderGroup.deleteShaderGroup();
      }
   }

   @Inject(method = {"updateCameraAndRender$v1_7", "updateCameraAndRender$v1_8"}, at = @At("HEAD"))
   private void lunar$webosr$renderGameUI$head(
      CallbackInfo var1,
      @Share("dummyScreen") LocalRef<com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> var2
   ) {
      var2.set(IICCOOCHCHROORHHIIHROHCCRHRCOR.IIRCRIIHOHIORRRRCRICHHRIRHCOOR());
   }

   @Inject(method = {"updateCameraAndRender$v1_7", "updateCameraAndRender$v1_8"}, at = @At("TAIL"))
   private void lunar$webosr$renderGameUI$tail(
      CallbackInfo var1,
      @Share("dummyScreen") LocalRef<com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> var2
   ) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .IOIOHOOCRRORCCCOCIRROHCOCCCRCO();
      if (var3.HRIICOIOIIIIRIHHOICRHOIIRCIRIC()) {
         var3.HOROHROIORRIRIIIOOCCIROCRCROHI().HIHCRRIHRIROROCRICHHORIOCRCOCO().HRRRCOHOIIOCIRCRIIIHRICROCCOHC();
      }

      int var4 = Mouse.getX();
      int var5 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$logicalHeight() - Mouse.getY();
      com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO var6 = new com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO(
         var4, var5
      );
      if (var2.get() != null
         && !((com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var2.get())
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var6)) {
         com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CCHIHCHICORHHHIHRHCRCICCROHORR()
            .OOROOCCIRCCRHOIOIORIHCHHOOCCOR(
               new com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO(-1.0, -1.0)
            );
      } else if (!var3.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(
         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH::IHHCRHRIORROROHIIIRHOORHHRHOII
      )) {
         com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CCHIHCHICORHHHIHRHCRCICCROHORR()
            .OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var6);
      }

      if (var2.get() == null || var3.HRIICOIOIIIIRIHHOICRHOIIRCIRIC()) {
         if (this.mc.gameSettings.hideGUI && this.mc.currentScreen == null && this.mc.world != null) {
            this.setupOverlayRendering();
         }

         CIOHHCORHRCCRICCCORIHCRHCCCRRR var7 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI.HHHRRIRIHIHRORCOHCRRCIOCRIORIR();
         var7.push();
         com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CCHIHCHICORHHHIHRHCRCICCROHORR()
            .ORHIOICIOCRRHOOCOHRORIHICHRCRR(
               new com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                  var7
               )
            );
         var7.pop();
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @WrapWithCondition(
      method = "renderWorld",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/RenderGlobal;sortAndRender$v1_7(Lnet/minecraft/entity/EntityLivingBase;ID)I")
   )
   @Dynamic
   private boolean lunar$rewindRenderBlocks$v1_7(RenderGlobal var1, EntityLivingBase var2, int var3, double var4) {
      return this.lunar$rewindWorldRenderingCheck(var0 -> (Boolean)var0.IHCOIOHICOIIRRORIRHRHOOOIIHIIO().get())
         && this.lunar$rewindChromaKeyingCheck(var0 -> (Boolean)var0.OOHIIRRIOHRIICIOHIIRRHHHHCRRIH().get());
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @WrapWithCondition(
      method = "renderWorldPass$v1_8",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/renderer/RenderGlobal;renderBlockLayer$v1_8(Lnet/minecraft/util/BlockRenderLayer;DILnet/minecraft/entity/Entity;)I"
      )
   )
   private boolean lunar$rewindRenderBlocks$v1_8(RenderGlobal var1, BlockRenderLayer var2, double var3, int var5, Entity var6) {
      return this.lunar$rewindWorldRenderingCheck(var0 -> (Boolean)var0.IHCOIOHICOIIRRORIRHRHOOOIIHIIO().get())
         && this.lunar$rewindChromaKeyingCheck(var0 -> (Boolean)var0.OOHIIRRIOHRIICIOHIIRRHHHHCRRIH().get());
   }

   @Inject(method = {"renderCloudsCheck$v1_7", "renderCloudsCheck$v1_8", "renderCloudsCheck$v1_12"}, at = @At("HEAD"), cancellable = true)
   private void lunar$rewindRenderClouds(CallbackInfo var1) {
      if (!this.lunar$rewindWorldRenderingCheck(var0 -> (Boolean)var0.HRICIORHHIORIIOHHIHIICCCRIRCHH().get())) {
         var1.cancel();
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @WrapWithCondition(method = "renderWorld", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/RenderGlobal;renderSky$v1_7(F)V"))
   @Dynamic
   private boolean lunar$rewindRenderSky$v1_7(RenderGlobal var1, float var2) {
      return this.lunar$rewindWorldRenderingCheck(var0 -> (Boolean)var0.OOCHRIHIOIIROCHCHCCIHCCCHIIOOI().get())
         && this.lunar$rewindChromaKeyingCheck(var0 -> (Boolean)var0.OIRCHOOHHIOCCIRRCHCCRIOHOIIHHR().get());
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @WrapWithCondition(method = "renderWorldPass$v1_8", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/RenderGlobal;renderSky$v1_8(FI)V"))
   private boolean lunar$rewindRenderSky$v1_8(RenderGlobal var1, float var2, int var3) {
      return this.lunar$rewindWorldRenderingCheck(var0 -> (Boolean)var0.OOCHRIHIOIIROCHCHCCIHCCCHIIOOI().get())
         && this.lunar$rewindChromaKeyingCheck(var0 -> (Boolean)var0.OIRCHOOHHIOCCIRRCHCCRIOHOIIHHR().get());
   }

   @WrapWithCondition(
      method = {"renderWorldPass$v1_8", "renderWorld"},
      at = {
            @At(value = "INVOKE", target = "Lnet/minecraft/client/particle/ParticleManager;renderParticles(Lnet/minecraft/entity/Entity;F)V"),
            @At(value = "INVOKE", target = "Lnet/minecraft/client/particle/ParticleManager;renderLitParticles(Lnet/minecraft/entity/Entity;F)V")
      },
      expect = 2,
      require = 2
   )
   private boolean lunar$rewindRenderParticles(ParticleManager var1, Entity var2, float var3) {
      return this.lunar$rewindWorldRenderingCheck(var0 -> (Boolean)var0.RHHIHHRORRIHCHCOOHOROIHCIRIOHI().get());
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @WrapWithCondition(
      method = "renderWorldPass$v1_8",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/RenderGlobal;renderWorldBorder$v1_8(Lnet/minecraft/entity/Entity;F)V")
   )
   private boolean lunar$rewindWorldBorder(RenderGlobal var1, Entity var2, float var3) {
      return this.lunar$rewindWorldRenderingCheck(var0 -> (Boolean)var0.IHOCOCRHIHRHHHCRIIROHRIROCIIHO().get());
   }

   @Unique
   private boolean lunar$rewindWorldRenderingCheck(
      Function<com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CIOHHCORHRCCRICCCORIHCRHCCCRRR, Boolean> var1
   ) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .IOIOHOOCRRORCCCOCIRROHCOCCCRCO();
      if (var2.HRIICOIOIIIIRIHHOICRHOIIRCIRIC()) {
         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CIOHHCORHRCCRICCCORIHCRHCCCRRR var3 = var2.HOROHROIORRIRIIIOOCCIROCRCROHI()
            .IROIIOOCICHRIHCIOHCRCCCRICHIHC();
         if ((Boolean)var3.CCRIOOOOCRRCHOICOHOCOIRICIIIRC().get()) {
            return (Boolean)var1.apply(var3);
         }
      }

      return true;
   }

   @Unique
   private boolean lunar$rewindChromaKeyingCheck(
      Function<com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CIOHHCORHRCCRICCCORIHCRHCCCRRR, Boolean> var1
   ) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .IOIOHOOCRRORCCCOCIRROHCOCCCRCO();
      if (var2.HRIICOIOIIIIRIHHOICRHOIIRCIRIC()) {
         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CIOHHCORHRCCRICCCORIHCRHCCCRRR var3 = var2.HOROHROIORRIRIIIOOCCIROCRCROHI()
            .IROIIOOCICHRIHCIOHCRCCCRICHIHC();
         if ((Boolean)var3.IRCOOICRICCRCCROHRROIRHHIHHCCO().get()) {
            return !(Boolean)var1.apply(var3);
         }
      }

      return true;
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @WrapOperation(
      method = "loadShader$v1_8",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/Minecraft;getFramebuffer()Lnet/minecraft/client/shader/Framebuffer;")
   )
   private Framebuffer lunar$rewindFramebuffer(Minecraft var1, Operation<Framebuffer> var2) {
      if (!IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
         .HRIICOIOIIIIRIHHOICRHOIIRCIRIC()) {
         return (Framebuffer)var2.call(new Object[]{var1});
      }

      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
         .HOROHROIORRIRIIIOOCCIROCRCROHI();
      return (Framebuffer)var3.HIHCRRIHRIROROCRICHHORIOCRCOCO().HHRRRORIICOCHCOOOORHHOOHHIOHHI().HOIHRCIOCIHORHIRHCOHRHHCCHOOOR();
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @WrapOperation(method = "loadShader$v1_8", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/shader/ShaderGroup;createBindFramebuffers(II)V"))
   private void lunar$rewindShadersSize(ShaderGroup var1, int var2, int var3, Operation<Void> var4) {
      if (!IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
         .HRIICOIOIIIIRIHHOICRHOIIRCIRIC()) {
         var4.call(new Object[]{var1, var2, var3});
      } else {
         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var5 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
            .HOROHROIORRIRIIIOOCCIROCRCROHI();
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var6 = var5.HIHCRRIHRIROROCRICHHORIOCRCOCO()
            .HHRRRORIICOCHCOOOORHHOOHHIOHHI()
            .HOIHRCIOCIHORHIRHCOHRHHCCHOOOR();
         var4.call(new Object[]{var1, var6.bridge$framebufferTextureWidth(), var6.bridge$framebufferTextureHeight()});
      }
   }

   @Inject(method = "displayItemActivation$v1_12", at = @At("HEAD"))
   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   private void lunar$totemHook(ItemStack var1, CallbackInfo var2) {
      if (Minecraft.getMinecraft().player$v1_8 != null && Objects.equals(var1.getItem(), Items.TOTEM_OF_UNDYING$v1_12)) {
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI.class,
               () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI(
                  IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH()
               )
            );
      }
   }

   @Inject(
      method = {"updateCameraAndRender$v1_7", "updateCameraAndRender$v1_8"},
      at = @At(value = "FIELD", target = "Lnet/minecraft/client/Minecraft;currentScreen:Lnet/minecraft/client/gui/GuiScreen;")
   )
   private void lunar$rewindRestoreScreen(CallbackInfo var1) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
         .HOROHROIORRIRIIIOOCCIROCRCROHI();
      if (var2 != null) {
         var2.HIHCRRIHRIROROCRICHHORIOCRCOCO().HOHHOIHOOIOCOCHRHHHRIRICRHIRIO();
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @WrapOperation(method = "renderWorldPass$v1_8", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/entity/EntityPlayerSP;isSpectator$v1_8()Z"))
   private boolean lunar$rewindForceSpectatorCheck(EntityPlayerSP var1, Operation<Boolean> var2) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .IOIOHOOCRRORCCCOCIRROHCOCCCRCO();
      return var3.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var0 -> !var0.CCRHOIIHHCCIROCCROHHIIOCOHIRRC().CHORCRORCICOCOOORCIOOICCOOIOHC().isFixedToPlayer())
         ? true
         : (Boolean)var2.call(new Object[]{var1});
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @WrapOperation(method = "updateCameraAndRender$v1_8", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/GuiScreen;drawScreen(IIF)V"))
   @com.moonsworth.lunar.ichor.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(absent = "forge")
   private void lunar$overwriteGuiRender$lunar(GuiScreen var1, int var2, int var3, float var4, Operation<Void> var5) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var6 = com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HIHRCRRHOROCOHRRCOIOOHOCHRRRHH
         .RHCIHRRRCROICORRHICOCIORCCOOCI();
      if (!var6.HIOOIIICOCICOICOICCICCHRIORORI()) {
         if (var6.OOOOIRIIOHIICOOHOHCCIOHCROCRCC()) {
            var5.call(new Object[]{var1, -1, -1, var4});
         } else {
            var5.call(new Object[]{var1, var2, var3, var4});
         }
      }

      var6.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getCurrentScreen(),
         new com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI.HHHRRIRIHIHRORCOHCRRCIOCRIORIR()
         ),
         var2,
         var3,
         var4
      );
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(1)
   @WrapOperation(
      method = "updateCameraAndRender$v1_8",
      at = @At(value = "INVOKE", target = "Lnet/minecraftforge/client/ForgeHooksClient;drawScreen(Lnet/minecraft/client/gui/GuiScreen;IIF)V")
   )
   @com.moonsworth.lunar.ichor.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(present = "forge", absent = "optifine")
   @Dynamic
   private void lunar$overwriteGuiRender$forge$1_8(GuiScreen var1, int var2, int var3, float var4, Operation<Void> var5) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var6 = com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HIHRCRRHOROCOHRRCOIOOHOCHRRRHH
         .RHCIHRRRCROICORRHICOCIORCCOOCI();
      if (!var6.HIOOIIICOCICOICOICCICCHRIORORI()) {
         if (var6.OOOOIRIIOHIICOOHOHCCIOHCROCRCC()) {
            var5.call(new Object[]{var1, -1, -1, var4});
         } else {
            var5.call(new Object[]{var1, var2, var3, var4});
         }
      }

      var6.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getCurrentScreen(),
         new com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI.HHHRRIRIHIHRORCOHCRRCIOCRIORIR()
         ),
         var2,
         var3,
         var4
      );
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(1)
   @WrapOperation(method = "updateCameraAndRender$v1_8", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/GuiScreen;drawScreen(IIF)V"))
   @com.moonsworth.lunar.ichor.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(present = {"forge", "optifine"})
   @Dynamic
   private void lunar$overwriteGuiRender$forgeOptifine$1_8(GuiScreen var1, int var2, int var3, float var4, Operation<Void> var5) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var6 = com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HIHRCRRHOROCOHRRCOIOOHOCHRRRHH
         .RHCIHRRRCROICORRHICOCIORCCOOCI();
      if (!var6.HIOOIIICOCICOICOICCICCHRIORORI()) {
         if (var6.OOOOIRIIOHIICOOHOHCCIOHCROCRCC()) {
            var5.call(new Object[]{var1, -1, -1, var4});
         } else {
            var5.call(new Object[]{var1, var2, var3, var4});
         }
      }

      var6.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getCurrentScreen(),
         new com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI.HHHRRIRIHIHRORCOHCRRCIOCRIORIR()
         ),
         var2,
         var3,
         var4
      );
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   @WrapOperation(method = "updateCameraAndRender$v1_8", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/GuiScreen;drawScreen(IIF)V"))
   @com.moonsworth.lunar.ichor.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(present = "forge")
   private void lunar$overwriteGuiRender$forge$1_12(GuiScreen var1, int var2, int var3, float var4, Operation<Void> var5) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var6 = com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HIHRCRRHOROCOHRRCOIOOHOCHRRRHH
         .RHCIHRRRCROICORRHICOCIORCCOOCI();
      if (!var6.HIOOIIICOCICOICOICCICCHRIORORI()) {
         if (var6.OOOOIRIIOHIICOOHOHCCIOHCROCRCC()) {
            var5.call(new Object[]{var1, -1, -1, var4});
         } else {
            var5.call(new Object[]{var1, var2, var3, var4});
         }
      }

      var6.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getCurrentScreen(),
         new com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI.HHHRRIRIHIHRORCOHCRRCIOCRIORIR()
         ),
         var2,
         var3,
         var4
      );
   }

   @Inject(method = {"enableLightmap$v1_7", "enableLightmap$v1_8"}, at = @At("HEAD"))
   private void lunar$enableLightmap(CallbackInfo var1) {
      com.moonsworth.lunar.legacy.wrapper.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIRHCOCHCRIHRRRCOCOOHOOHRORHHH.CIHICRHCOCHIOHOCRCCICRCHIHRRRC = true;
   }

   @Inject(method = {"disableLightmap$v1_7", "disableLightmap$v1_8"}, at = @At("HEAD"))
   private void lunar$disableLightmap(CallbackInfo var1) {
      com.moonsworth.lunar.legacy.wrapper.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIRHCOCHCRIHRRRCOCOOHOOHRORHHH.CIHICRHCOCHIOHOCRCCICRCHIHRRRC = false;
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Inject(method = "orientCamera", at = @At("TAIL"))
   private void lunar$offsetCamera$v1_7(float var1, CallbackInfo var2) {
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 = (com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH)com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.class,
            () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
               var1
            )
         );
      if (var3 != null) {
         GL11.glTranslatef(var3.HHHHCIICCHHICIOIHCHOROHOCIHIRI(), var3.ROIRICOHOICIIHRCROHICOOHIOIHCI(), var3.OCROIRRHIOCCIHHCIHIHORHRIHROCI());
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Inject(method = "orientCamera", at = @At("TAIL"))
   private void lunar$offsetCamera$v1_8(float var1, CallbackInfo var2) {
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 = (com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH)com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.class,
            () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
               var1
            )
         );
      if (var3 != null) {
         GlStateManager.translate(var3.HHHHCIICCHHICIOIHCHOROHOCIHIRI(), var3.ROIRICOHOICIIHRCROHICOOHIOIHCI(), var3.OCROIRRHIOCCIHHCIHIHORHRIHROCI());
      }
   }
}
