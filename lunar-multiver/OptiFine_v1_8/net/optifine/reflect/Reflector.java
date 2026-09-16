package net.optifine.reflect;

import bmv.b;
import com.google.common.base.Optional;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import javax.vecmath.Matrix4f;
import net.minecraftforge.common.property.IUnlistedProperty;
import net.optifine.Log;
import net.optifine.util.ArrayUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Reflector {
   private static final Logger LOGGER = LogManager.getLogger();
   private static boolean logForge = logEntry("*** Reflector Forge ***");
   public static ReflectorClass BetterFoliageClient = new ReflectorClass("mods.betterfoliage.client.BetterFoliageClient");
   public static ReflectorClass BlamingTransformer = new ReflectorClass("net.minecraftforge.fml.common.asm.transformers.BlamingTransformer");
   public static ReflectorMethod BlamingTransformer_onCrash = new ReflectorMethod(BlamingTransformer, "onCrash");
   public static ReflectorClass ChunkWatchEvent_UnWatch = new ReflectorClass("net.minecraftforge.event.world.ChunkWatchEvent$UnWatch");
   public static ReflectorConstructor ChunkWatchEvent_UnWatch_Constructor = new ReflectorConstructor(ChunkWatchEvent_UnWatch, new Class[]{adg.class, lf.class});
   public static ReflectorClass CoreModManager = new ReflectorClass("net.minecraftforge.fml.relauncher.CoreModManager");
   public static ReflectorMethod CoreModManager_onCrash = new ReflectorMethod(CoreModManager, "onCrash");
   public static ReflectorClass DimensionManager = new ReflectorClass("net.minecraftforge.common.DimensionManager");
   public static ReflectorMethod DimensionManager_createProviderFor = new ReflectorMethod(DimensionManager, "createProviderFor");
   public static ReflectorMethod DimensionManager_getStaticDimensionIDs = new ReflectorMethod(DimensionManager, "getStaticDimensionIDs");
   public static ReflectorClass DrawScreenEvent_Pre = new ReflectorClass("net.minecraftforge.client.event.GuiScreenEvent$DrawScreenEvent$Pre");
   public static ReflectorConstructor DrawScreenEvent_Pre_Constructor = new ReflectorConstructor(
      DrawScreenEvent_Pre, new Class[]{axu.class, int.class, int.class, float.class}
   );
   public static ReflectorClass DrawScreenEvent_Post = new ReflectorClass("net.minecraftforge.client.event.GuiScreenEvent$DrawScreenEvent$Post");
   public static ReflectorConstructor DrawScreenEvent_Post_Constructor = new ReflectorConstructor(
      DrawScreenEvent_Post, new Class[]{axu.class, int.class, int.class, float.class}
   );
   public static ReflectorClass EntityViewRenderEvent_CameraSetup = new ReflectorClass("net.minecraftforge.client.event.EntityViewRenderEvent$CameraSetup");
   public static ReflectorConstructor EntityViewRenderEvent_CameraSetup_Constructor = new ReflectorConstructor(
      EntityViewRenderEvent_CameraSetup, new Class[]{bfk.class, pk.class, afh.class, double.class, float.class, float.class, float.class}
   );
   public static ReflectorField EntityViewRenderEvent_CameraSetup_yaw = new ReflectorField(EntityViewRenderEvent_CameraSetup, "yaw");
   public static ReflectorField EntityViewRenderEvent_CameraSetup_pitch = new ReflectorField(EntityViewRenderEvent_CameraSetup, "pitch");
   public static ReflectorField EntityViewRenderEvent_CameraSetup_roll = new ReflectorField(EntityViewRenderEvent_CameraSetup, "roll");
   public static ReflectorClass EntityViewRenderEvent_FogColors = new ReflectorClass("net.minecraftforge.client.event.EntityViewRenderEvent$FogColors");
   public static ReflectorConstructor EntityViewRenderEvent_FogColors_Constructor = new ReflectorConstructor(
      EntityViewRenderEvent_FogColors, new Class[]{bfk.class, pk.class, afh.class, double.class, float.class, float.class, float.class}
   );
   public static ReflectorField EntityViewRenderEvent_FogColors_red = new ReflectorField(EntityViewRenderEvent_FogColors, "red");
   public static ReflectorField EntityViewRenderEvent_FogColors_green = new ReflectorField(EntityViewRenderEvent_FogColors, "green");
   public static ReflectorField EntityViewRenderEvent_FogColors_blue = new ReflectorField(EntityViewRenderEvent_FogColors, "blue");
   public static ReflectorClass Event = new ReflectorClass("net.minecraftforge.fml.common.eventhandler.Event");
   public static ReflectorMethod Event_isCanceled = new ReflectorMethod(Event, "isCanceled");
   public static ReflectorClass EventBus = new ReflectorClass("net.minecraftforge.fml.common.eventhandler.EventBus");
   public static ReflectorMethod EventBus_post = new ReflectorMethod(EventBus, "post");
   public static ReflectorClass Event_Result = new ReflectorClass("net.minecraftforge.fml.common.eventhandler.Event$Result");
   public static ReflectorField Event_Result_DENY = new ReflectorField(Event_Result, "DENY");
   public static ReflectorField Event_Result_ALLOW = new ReflectorField(Event_Result, "ALLOW");
   public static ReflectorField Event_Result_DEFAULT = new ReflectorField(Event_Result, "DEFAULT");
   public static ReflectorClass ExtendedBlockState = new ReflectorClass("net.minecraftforge.common.property.ExtendedBlockState");
   public static ReflectorConstructor ExtendedBlockState_Constructor = new ReflectorConstructor(
      ExtendedBlockState, new Class[]{afh.class, amo[].class, IUnlistedProperty[].class}
   );
   public static ReflectorClass FMLClientHandler = new ReflectorClass("net.minecraftforge.fml.client.FMLClientHandler");
   public static ReflectorMethod FMLClientHandler_instance = new ReflectorMethod(FMLClientHandler, "instance");
   public static ReflectorMethod FMLClientHandler_handleLoadingScreen = new ReflectorMethod(FMLClientHandler, "handleLoadingScreen");
   public static ReflectorMethod FMLClientHandler_isLoading = new ReflectorMethod(FMLClientHandler, "isLoading");
   public static ReflectorMethod FMLClientHandler_trackBrokenTexture = new ReflectorMethod(FMLClientHandler, "trackBrokenTexture");
   public static ReflectorMethod FMLClientHandler_trackMissingTexture = new ReflectorMethod(FMLClientHandler, "trackMissingTexture");
   public static ReflectorClass FMLCommonHandler = new ReflectorClass("net.minecraftforge.fml.common.FMLCommonHandler");
   public static ReflectorMethod FMLCommonHandler_callFuture = new ReflectorMethod(FMLCommonHandler, "callFuture");
   public static ReflectorMethod FMLCommonHandler_enhanceCrashReport = new ReflectorMethod(FMLCommonHandler, "enhanceCrashReport");
   public static ReflectorMethod FMLCommonHandler_getBrandings = new ReflectorMethod(FMLCommonHandler, "getBrandings");
   public static ReflectorMethod FMLCommonHandler_handleServerAboutToStart = new ReflectorMethod(FMLCommonHandler, "handleServerAboutToStart");
   public static ReflectorMethod FMLCommonHandler_handleServerStarting = new ReflectorMethod(FMLCommonHandler, "handleServerStarting");
   public static ReflectorMethod FMLCommonHandler_instance = new ReflectorMethod(FMLCommonHandler, "instance");
   public static ReflectorClass ForgeBiome = new ReflectorClass(ady.class);
   public static ReflectorMethod ForgeBiome_getWaterColorMultiplier = new ReflectorMethod(ForgeBiome, "getWaterColorMultiplier");
   public static ReflectorClass ForgeBlock = new ReflectorClass(afh.class);
   public static ReflectorMethod ForgeBlock_addDestroyEffects = new ReflectorMethod(ForgeBlock, "addDestroyEffects");
   public static ReflectorMethod ForgeBlock_addHitEffects = new ReflectorMethod(ForgeBlock, "addHitEffects");
   public static ReflectorMethod ForgeBlock_canCreatureSpawn = new ReflectorMethod(ForgeBlock, "canCreatureSpawn");
   public static ReflectorMethod ForgeBlock_canRenderInLayer = new ReflectorMethod(ForgeBlock, "canRenderInLayer", new Class[]{adf.class});
   public static ReflectorMethod ForgeBlock_doesSideBlockRendering = new ReflectorMethod(ForgeBlock, "doesSideBlockRendering");
   public static ReflectorMethod ForgeBlock_getBedDirection = new ReflectorMethod(ForgeBlock, "getBedDirection");
   public static ReflectorMethod ForgeBlock_getExtendedState = new ReflectorMethod(ForgeBlock, "getExtendedState");
   public static ReflectorMethod ForgeBlock_getLightOpacity = new ReflectorMethod(ForgeBlock, "getLightOpacity", new Class[]{adq.class, cj.class});
   public static ReflectorMethod ForgeBlock_getLightValue = new ReflectorMethod(ForgeBlock, "getLightValue", new Class[]{adq.class, cj.class});
   public static ReflectorMethod ForgeBlock_hasTileEntity = new ReflectorMethod(ForgeBlock, "hasTileEntity", new Class[]{alz.class});
   public static ReflectorMethod ForgeBlock_isAir = new ReflectorMethod(ForgeBlock, "isAir");
   public static ReflectorMethod ForgeBlock_isBed = new ReflectorMethod(ForgeBlock, "isBed");
   public static ReflectorMethod ForgeBlock_isBedFoot = new ReflectorMethod(ForgeBlock, "isBedFoot");
   public static ReflectorMethod ForgeBlock_isSideSolid = new ReflectorMethod(ForgeBlock, "isSideSolid");
   public static ReflectorClass ForgeChunkCache = new ReflectorClass(adv.class);
   public static ReflectorMethod ForgeChunkCache_isSideSolid = new ReflectorMethod(ForgeChunkCache, "isSideSolid");
   public static ReflectorClass ForgeEntity = new ReflectorClass(pk.class);
   public static ReflectorMethod ForgeEntity_canRiderInteract = new ReflectorMethod(ForgeEntity, "canRiderInteract");
   public static ReflectorField ForgeEntity_captureDrops = new ReflectorField(ForgeEntity, "captureDrops");
   public static ReflectorField ForgeEntity_capturedDrops = new ReflectorField(ForgeEntity, "capturedDrops");
   public static ReflectorMethod ForgeEntity_shouldRenderInPass = new ReflectorMethod(ForgeEntity, "shouldRenderInPass");
   public static ReflectorMethod ForgeEntity_shouldRiderSit = new ReflectorMethod(ForgeEntity, "shouldRiderSit");
   public static ReflectorClass ForgeEventFactory = new ReflectorClass("net.minecraftforge.event.ForgeEventFactory");
   public static ReflectorMethod ForgeEventFactory_canEntityDespawn = new ReflectorMethod(ForgeEventFactory, "canEntityDespawn");
   public static ReflectorMethod ForgeEventFactory_canEntitySpawn = new ReflectorMethod(ForgeEventFactory, "canEntitySpawn");
   public static ReflectorMethod ForgeEventFactory_doSpecialSpawn = new ReflectorMethod(
      ForgeEventFactory, "doSpecialSpawn", new Class[]{ps.class, adm.class, float.class, float.class, float.class}
   );
   public static ReflectorMethod ForgeEventFactory_getMaxSpawnPackSize = new ReflectorMethod(ForgeEventFactory, "getMaxSpawnPackSize");
   public static ReflectorMethod ForgeEventFactory_renderBlockOverlay = new ReflectorMethod(ForgeEventFactory, "renderBlockOverlay");
   public static ReflectorMethod ForgeEventFactory_renderFireOverlay = new ReflectorMethod(ForgeEventFactory, "renderFireOverlay");
   public static ReflectorMethod ForgeEventFactory_renderWaterOverlay = new ReflectorMethod(ForgeEventFactory, "renderWaterOverlay");
   public static ReflectorClass ForgeHooks = new ReflectorClass("net.minecraftforge.common.ForgeHooks");
   public static ReflectorMethod ForgeHooks_onLivingAttack = new ReflectorMethod(ForgeHooks, "onLivingAttack");
   public static ReflectorMethod ForgeHooks_onLivingDeath = new ReflectorMethod(ForgeHooks, "onLivingDeath");
   public static ReflectorMethod ForgeHooks_onLivingDrops = new ReflectorMethod(ForgeHooks, "onLivingDrops");
   public static ReflectorMethod ForgeHooks_onLivingFall = new ReflectorMethod(ForgeHooks, "onLivingFall");
   public static ReflectorMethod ForgeHooks_onLivingHurt = new ReflectorMethod(ForgeHooks, "onLivingHurt");
   public static ReflectorMethod ForgeHooks_onLivingJump = new ReflectorMethod(ForgeHooks, "onLivingJump");
   public static ReflectorMethod ForgeHooks_onLivingSetAttackTarget = new ReflectorMethod(ForgeHooks, "onLivingSetAttackTarget");
   public static ReflectorMethod ForgeHooks_onLivingUpdate = new ReflectorMethod(ForgeHooks, "onLivingUpdate");
   public static ReflectorClass ForgeHooksClient = new ReflectorClass("net.minecraftforge.client.ForgeHooksClient");
   public static ReflectorMethod ForgeHooksClient_applyTransform = new ReflectorMethod(
      ForgeHooksClient, "applyTransform", new Class[]{Matrix4f.class, Optional.class}
   );
   public static ReflectorMethod ForgeHooksClient_dispatchRenderLast = new ReflectorMethod(ForgeHooksClient, "dispatchRenderLast");
   public static ReflectorMethod ForgeHooksClient_drawScreen = new ReflectorMethod(ForgeHooksClient, "drawScreen");
   public static ReflectorMethod ForgeHooksClient_fillNormal = new ReflectorMethod(ForgeHooksClient, "fillNormal");
   public static ReflectorMethod ForgeHooksClient_handleCameraTransforms = new ReflectorMethod(ForgeHooksClient, "handleCameraTransforms");
   public static ReflectorMethod ForgeHooksClient_getArmorModel = new ReflectorMethod(ForgeHooksClient, "getArmorModel");
   public static ReflectorMethod ForgeHooksClient_getArmorTexture = new ReflectorMethod(ForgeHooksClient, "getArmorTexture");
   public static ReflectorMethod ForgeHooksClient_getFogDensity = new ReflectorMethod(ForgeHooksClient, "getFogDensity");
   public static ReflectorMethod ForgeHooksClient_getFOVModifier = new ReflectorMethod(ForgeHooksClient, "getFOVModifier");
   public static ReflectorMethod ForgeHooksClient_getMatrix = new ReflectorMethod(ForgeHooksClient, "getMatrix", new Class[]{bor.class});
   public static ReflectorMethod ForgeHooksClient_getOffsetFOV = new ReflectorMethod(ForgeHooksClient, "getOffsetFOV");
   public static ReflectorMethod ForgeHooksClient_loadEntityShader = new ReflectorMethod(ForgeHooksClient, "loadEntityShader");
   public static ReflectorMethod ForgeHooksClient_onDrawBlockHighlight = new ReflectorMethod(ForgeHooksClient, "onDrawBlockHighlight");
   public static ReflectorMethod ForgeHooksClient_onFogRender = new ReflectorMethod(ForgeHooksClient, "onFogRender");
   public static ReflectorMethod ForgeHooksClient_onTextureStitchedPre = new ReflectorMethod(ForgeHooksClient, "onTextureStitchedPre");
   public static ReflectorMethod ForgeHooksClient_onTextureStitchedPost = new ReflectorMethod(ForgeHooksClient, "onTextureStitchedPost");
   public static ReflectorMethod ForgeHooksClient_orientBedCamera = new ReflectorMethod(ForgeHooksClient, "orientBedCamera");
   public static ReflectorMethod ForgeHooksClient_putQuadColor = new ReflectorMethod(ForgeHooksClient, "putQuadColor");
   public static ReflectorMethod ForgeHooksClient_renderFirstPersonHand = new ReflectorMethod(ForgeHooksClient, "renderFirstPersonHand");
   public static ReflectorMethod ForgeHooksClient_renderMainMenu = new ReflectorMethod(ForgeHooksClient, "renderMainMenu");
   public static ReflectorMethod ForgeHooksClient_setRenderLayer = new ReflectorMethod(ForgeHooksClient, "setRenderLayer");
   public static ReflectorMethod ForgeHooksClient_setRenderPass = new ReflectorMethod(ForgeHooksClient, "setRenderPass");
   public static ReflectorMethod ForgeHooksClient_transform = new ReflectorMethod(ForgeHooksClient, "transform");
   public static ReflectorClass ForgeItem = new ReflectorClass(zw.class);
   public static ReflectorField ForgeItem_delegate = new ReflectorField(ForgeItem, "delegate");
   public static ReflectorMethod ForgeItem_getDurabilityForDisplay = new ReflectorMethod(ForgeItem, "getDurabilityForDisplay");
   public static ReflectorMethod ForgeItem_getModel = new ReflectorMethod(ForgeItem, "getModel");
   public static ReflectorMethod ForgeItem_onEntitySwing = new ReflectorMethod(ForgeItem, "onEntitySwing");
   public static ReflectorMethod ForgeItem_shouldCauseReequipAnimation = new ReflectorMethod(ForgeItem, "shouldCauseReequipAnimation");
   public static ReflectorMethod ForgeItem_showDurabilityBar = new ReflectorMethod(ForgeItem, "showDurabilityBar");
   public static ReflectorClass ForgeModContainer = new ReflectorClass("net.minecraftforge.common.ForgeModContainer");
   public static ReflectorField ForgeModContainer_forgeLightPipelineEnabled = new ReflectorField(ForgeModContainer, "forgeLightPipelineEnabled");
   public static ReflectorClass ForgePotionEffect = new ReflectorClass(pf.class);
   public static ReflectorMethod ForgePotionEffect_isCurativeItem = new ReflectorMethod(ForgePotionEffect, "isCurativeItem");
   public static ReflectorClass ForgeTileEntity = new ReflectorClass(akw.class);
   public static ReflectorMethod ForgeTileEntity_canRenderBreaking = new ReflectorMethod(ForgeTileEntity, "canRenderBreaking");
   public static ReflectorMethod ForgeTileEntity_getRenderBoundingBox = new ReflectorMethod(ForgeTileEntity, "getRenderBoundingBox");
   public static ReflectorMethod ForgeTileEntity_hasFastRenderer = new ReflectorMethod(ForgeTileEntity, "hasFastRenderer");
   public static ReflectorMethod ForgeTileEntity_shouldRenderInPass = new ReflectorMethod(ForgeTileEntity, "shouldRenderInPass");
   public static ReflectorClass ForgeVertexFormatElementEnumUseage = new ReflectorClass(b.class);
   public static ReflectorMethod ForgeVertexFormatElementEnumUseage_preDraw = new ReflectorMethod(ForgeVertexFormatElementEnumUseage, "preDraw");
   public static ReflectorMethod ForgeVertexFormatElementEnumUseage_postDraw = new ReflectorMethod(ForgeVertexFormatElementEnumUseage, "postDraw");
   public static ReflectorClass ForgeWorld = new ReflectorClass(adm.class);
   public static ReflectorMethod ForgeWorld_countEntities = new ReflectorMethod(ForgeWorld, "countEntities", new Class[]{pt.class, boolean.class});
   public static ReflectorMethod ForgeWorld_getPerWorldStorage = new ReflectorMethod(ForgeWorld, "getPerWorldStorage");
   public static ReflectorClass ForgeWorldProvider = new ReflectorClass(anm.class);
   public static ReflectorMethod ForgeWorldProvider_getCloudRenderer = new ReflectorMethod(ForgeWorldProvider, "getCloudRenderer");
   public static ReflectorMethod ForgeWorldProvider_getSkyRenderer = new ReflectorMethod(ForgeWorldProvider, "getSkyRenderer");
   public static ReflectorMethod ForgeWorldProvider_getWeatherRenderer = new ReflectorMethod(ForgeWorldProvider, "getWeatherRenderer");
   public static ReflectorMethod ForgeWorldProvider_getSaveFolder = new ReflectorMethod(ForgeWorldProvider, "getSaveFolder");
   public static ReflectorClass GuiModList = new ReflectorClass("net.minecraftforge.fml.client.GuiModList");
   public static ReflectorConstructor GuiModList_Constructor = new ReflectorConstructor(GuiModList, new Class[]{axu.class});
   public static ReflectorClass IColoredBakedQuad = new ReflectorClass("net.minecraftforge.client.model.IColoredBakedQuad");
   public static ReflectorClass IExtendedBlockState = new ReflectorClass("net.minecraftforge.common.property.IExtendedBlockState");
   public static ReflectorMethod IExtendedBlockState_getClean = new ReflectorMethod(IExtendedBlockState, "getClean");
   public static ReflectorClass IModel = new ReflectorClass("net.minecraftforge.client.model.IModel");
   public static ReflectorMethod IModel_getTextures = new ReflectorMethod(IModel, "getTextures");
   public static ReflectorClass IRenderHandler = new ReflectorClass("net.minecraftforge.client.IRenderHandler");
   public static ReflectorMethod IRenderHandler_render = new ReflectorMethod(IRenderHandler, "render");
   public static ReflectorClass ItemModelMesherForge = new ReflectorClass("net.minecraftforge.client.ItemModelMesherForge");
   public static ReflectorConstructor ItemModelMesherForge_Constructor = new ReflectorConstructor(ItemModelMesherForge, new Class[]{bou.class});
   public static ReflectorClass Launch = new ReflectorClass("net.minecraft.launchwrapper.Launch");
   public static ReflectorField Launch_blackboard = new ReflectorField(Launch, "blackboard");
   public static ReflectorClass LightUtil = new ReflectorClass("net.minecraftforge.client.model.pipeline.LightUtil");
   public static ReflectorField LightUtil_itemConsumer = new ReflectorField(LightUtil, "itemConsumer");
   public static ReflectorMethod LightUtil_putBakedQuad = new ReflectorMethod(LightUtil, "putBakedQuad");
   public static ReflectorMethod LightUtil_renderQuadColor = new ReflectorMethod(LightUtil, "renderQuadColor");
   public static ReflectorField LightUtil_tessellator = new ReflectorField(LightUtil, "tessellator");
   public static ReflectorClass Loader = new ReflectorClass("net.minecraftforge.fml.common.Loader");
   public static ReflectorMethod Loader_getActiveModList = new ReflectorMethod(Loader, "getActiveModList");
   public static ReflectorMethod Loader_instance = new ReflectorMethod(Loader, "instance");
   public static ReflectorClass MinecraftForge = new ReflectorClass("net.minecraftforge.common.MinecraftForge");
   public static ReflectorField MinecraftForge_EVENT_BUS = new ReflectorField(MinecraftForge, "EVENT_BUS");
   public static ReflectorClass MinecraftForgeClient = new ReflectorClass("net.minecraftforge.client.MinecraftForgeClient");
   public static ReflectorMethod MinecraftForgeClient_getRenderPass = new ReflectorMethod(MinecraftForgeClient, "getRenderPass");
   public static ReflectorMethod MinecraftForgeClient_onRebuildChunk = new ReflectorMethod(MinecraftForgeClient, "onRebuildChunk");
   public static ReflectorClass ModContainer = new ReflectorClass("net.minecraftforge.fml.common.ModContainer");
   public static ReflectorMethod ModContainer_getModId = new ReflectorMethod(ModContainer, "getModId");
   public static ReflectorClass ModelLoader = new ReflectorClass("net.minecraftforge.client.model.ModelLoader");
   public static ReflectorField ModelLoader_stateModels = new ReflectorField(ModelLoader, "stateModels");
   public static ReflectorMethod ModelLoader_onRegisterItems = new ReflectorMethod(ModelLoader, "onRegisterItems");
   public static ReflectorMethod ModelLoader_getInventoryVariant = new ReflectorMethod(ModelLoader, "getInventoryVariant");
   public static ReflectorField ModelLoader_textures = new ReflectorField(ModelLoader, "textures");
   public static ReflectorClass ModelLoader_VanillaLoader = new ReflectorClass("net.minecraftforge.client.model.ModelLoader$VanillaLoader");
   public static ReflectorField ModelLoader_VanillaLoader_INSTANCE = new ReflectorField(ModelLoader_VanillaLoader, "instance");
   public static ReflectorMethod ModelLoader_VanillaLoader_loadModel = new ReflectorMethod(ModelLoader_VanillaLoader, "loadModel");
   public static ReflectorClass RenderBlockOverlayEvent_OverlayType = new ReflectorClass("net.minecraftforge.client.event.RenderBlockOverlayEvent$OverlayType");
   public static ReflectorField RenderBlockOverlayEvent_OverlayType_BLOCK = new ReflectorField(RenderBlockOverlayEvent_OverlayType, "BLOCK");
   public static ReflectorClass RenderingRegistry = new ReflectorClass("net.minecraftforge.fml.client.registry.RenderingRegistry");
   public static ReflectorMethod RenderingRegistry_loadEntityRenderers = new ReflectorMethod(
      RenderingRegistry, "loadEntityRenderers", new Class[]{biu.class, Map.class}
   );
   public static ReflectorClass RenderItemInFrameEvent = new ReflectorClass("net.minecraftforge.client.event.RenderItemInFrameEvent");
   public static ReflectorConstructor RenderItemInFrameEvent_Constructor = new ReflectorConstructor(RenderItemInFrameEvent, new Class[]{uo.class, bjg.class});
   public static ReflectorClass RenderLivingEvent_Pre = new ReflectorClass("net.minecraftforge.client.event.RenderLivingEvent$Pre");
   public static ReflectorConstructor RenderLivingEvent_Pre_Constructor = new ReflectorConstructor(
      RenderLivingEvent_Pre, new Class[]{pr.class, bjl.class, double.class, double.class, double.class}
   );
   public static ReflectorClass RenderLivingEvent_Post = new ReflectorClass("net.minecraftforge.client.event.RenderLivingEvent$Post");
   public static ReflectorConstructor RenderLivingEvent_Post_Constructor = new ReflectorConstructor(
      RenderLivingEvent_Post, new Class[]{pr.class, bjl.class, double.class, double.class, double.class}
   );
   public static ReflectorClass RenderLivingEvent_Specials_Pre = new ReflectorClass("net.minecraftforge.client.event.RenderLivingEvent$Specials$Pre");
   public static ReflectorConstructor RenderLivingEvent_Specials_Pre_Constructor = new ReflectorConstructor(
      RenderLivingEvent_Specials_Pre, new Class[]{pr.class, bjl.class, double.class, double.class, double.class}
   );
   public static ReflectorClass RenderLivingEvent_Specials_Post = new ReflectorClass("net.minecraftforge.client.event.RenderLivingEvent$Specials$Post");
   public static ReflectorConstructor RenderLivingEvent_Specials_Post_Constructor = new ReflectorConstructor(
      RenderLivingEvent_Specials_Post, new Class[]{pr.class, bjl.class, double.class, double.class, double.class}
   );
   public static ReflectorClass SplashScreen = new ReflectorClass("net.minecraftforge.fml.client.SplashProgress");
   public static ReflectorClass WorldEvent_Load = new ReflectorClass("net.minecraftforge.event.world.WorldEvent$Load");
   public static ReflectorConstructor WorldEvent_Load_Constructor = new ReflectorConstructor(WorldEvent_Load, new Class[]{adm.class});
   private static boolean logVanilla = logEntry("*** Reflector Vanilla ***");
   public static ReflectorClass ChunkProviderClient = new ReflectorClass(bcz.class);
   public static ReflectorField ChunkProviderClient_chunkMapping = new ReflectorField(ChunkProviderClient, nq.class);
   public static ReflectorClass EntityVillager = new ReflectorClass(wi.class);
   public static ReflectorField EntityVillager_careerId = new ReflectorField(
      new FieldLocatorTypes(wi.class, new Class[0], int.class, new Class[]{int.class, boolean.class, boolean.class, oq.class}, "EntityVillager.careerId")
   );
   public static ReflectorField EntityVillager_careerLevel = new ReflectorField(
      new FieldLocatorTypes(wi.class, new Class[]{int.class}, int.class, new Class[]{boolean.class, boolean.class, oq.class}, "EntityVillager.careerLevel")
   );
   public static ReflectorClass GuiBeacon = new ReflectorClass(ayn.class);
   public static ReflectorField GuiBeacon_tileBeacon = new ReflectorField(GuiBeacon, og.class);
   public static ReflectorClass GuiBrewingStand = new ReflectorClass(ayp.class);
   public static ReflectorField GuiBrewingStand_tileBrewingStand = new ReflectorField(GuiBrewingStand, og.class);
   public static ReflectorClass GuiChest = new ReflectorClass(ayr.class);
   public static ReflectorField GuiChest_lowerChestInventory = new ReflectorField(GuiChest, og.class, 1);
   public static ReflectorClass GuiEnchantment = new ReflectorClass(ayy.class);
   public static ReflectorField GuiEnchantment_nameable = new ReflectorField(GuiEnchantment, op.class);
   public static ReflectorClass GuiFurnace = new ReflectorClass(ayz.class);
   public static ReflectorField GuiFurnace_tileFurnace = new ReflectorField(GuiFurnace, og.class);
   public static ReflectorClass GuiHopper = new ReflectorClass(aza.class);
   public static ReflectorField GuiHopper_hopperInventory = new ReflectorField(GuiHopper, og.class, 1);
   public static ReflectorClass GuiMainMenu = new ReflectorClass(aya.class);
   public static ReflectorField GuiMainMenu_splashText = new ReflectorField(GuiMainMenu, String.class);
   public static ReflectorClass Minecraft = new ReflectorClass(ave.class);
   public static ReflectorField Minecraft_defaultResourcePack = new ReflectorField(Minecraft, bna.class);
   public static ReflectorClass ModelHumanoidHead = new ReflectorClass(bbi.class);
   public static ReflectorField ModelHumanoidHead_head = new ReflectorField(ModelHumanoidHead, bct.class);
   public static ReflectorClass ModelBat = new ReflectorClass(bav.class);
   public static ReflectorFields ModelBat_ModelRenderers = new ReflectorFields(ModelBat, bct.class, 6);
   public static ReflectorClass ModelBlaze = new ReflectorClass(baw.class);
   public static ReflectorField ModelBlaze_blazeHead = new ReflectorField(ModelBlaze, bct.class);
   public static ReflectorField ModelBlaze_blazeSticks = new ReflectorField(ModelBlaze, bct[].class);
   public static ReflectorClass ModelBlock = new ReflectorClass(bgl.class);
   public static ReflectorField ModelBlock_parentLocation = new ReflectorField(ModelBlock, jy.class);
   public static ReflectorField ModelBlock_textures = new ReflectorField(ModelBlock, Map.class);
   public static ReflectorClass ModelDragon = new ReflectorClass(bco.class);
   public static ReflectorFields ModelDragon_ModelRenderers = new ReflectorFields(ModelDragon, bct.class, 12);
   public static ReflectorClass ModelEnderCrystal = new ReflectorClass(bcp.class);
   public static ReflectorFields ModelEnderCrystal_ModelRenderers = new ReflectorFields(ModelEnderCrystal, bct.class, 3);
   public static ReflectorClass RenderEnderCrystal = new ReflectorClass(biq.class);
   public static ReflectorField RenderEnderCrystal_modelEnderCrystal = new ReflectorField(RenderEnderCrystal, bbo.class, 0);
   public static ReflectorClass ModelEnderMite = new ReflectorClass(bbe.class);
   public static ReflectorField ModelEnderMite_bodyParts = new ReflectorField(ModelEnderMite, bct[].class);
   public static ReflectorClass ModelGhast = new ReflectorClass(bbf.class);
   public static ReflectorField ModelGhast_body = new ReflectorField(ModelGhast, bct.class);
   public static ReflectorField ModelGhast_tentacles = new ReflectorField(ModelGhast, bct[].class);
   public static ReflectorClass ModelGuardian = new ReflectorClass(bbg.class);
   public static ReflectorField ModelGuardian_body = new ReflectorField(ModelGuardian, bct.class, 0);
   public static ReflectorField ModelGuardian_eye = new ReflectorField(ModelGuardian, bct.class, 1);
   public static ReflectorField ModelGuardian_spines = new ReflectorField(ModelGuardian, bct[].class, 0);
   public static ReflectorField ModelGuardian_tail = new ReflectorField(ModelGuardian, bct[].class, 1);
   public static ReflectorClass ModelHorse = new ReflectorClass(bbh.class);
   public static ReflectorFields ModelHorse_ModelRenderers = new ReflectorFields(ModelHorse, bct.class, 39);
   public static ReflectorClass RenderLeashKnot = new ReflectorClass(bjj.class);
   public static ReflectorField RenderLeashKnot_leashKnotModel = new ReflectorField(RenderLeashKnot, bbm.class);
   public static ReflectorClass ModelMagmaCube = new ReflectorClass(bbl.class);
   public static ReflectorField ModelMagmaCube_core = new ReflectorField(ModelMagmaCube, bct.class);
   public static ReflectorField ModelMagmaCube_segments = new ReflectorField(ModelMagmaCube, bct[].class);
   public static ReflectorClass ModelOcelot = new ReflectorClass(bbp.class);
   public static ReflectorFields ModelOcelot_ModelRenderers = new ReflectorFields(ModelOcelot, bct.class, 8);
   public static ReflectorClass ModelRabbit = new ReflectorClass(bbu.class);
   public static ReflectorFields ModelRabbit_renderers = new ReflectorFields(ModelRabbit, bct.class, 12);
   public static ReflectorClass ModelSilverfish = new ReflectorClass(bby.class);
   public static ReflectorField ModelSilverfish_bodyParts = new ReflectorField(ModelSilverfish, bct[].class, 0);
   public static ReflectorField ModelSilverfish_wingParts = new ReflectorField(ModelSilverfish, bct[].class, 1);
   public static ReflectorClass ModelSlime = new ReflectorClass(bcc.class);
   public static ReflectorFields ModelSlime_ModelRenderers = new ReflectorFields(ModelSlime, bct.class, 4);
   public static ReflectorClass ModelSquid = new ReflectorClass(bcf.class);
   public static ReflectorField ModelSquid_body = new ReflectorField(ModelSquid, bct.class);
   public static ReflectorField ModelSquid_tentacles = new ReflectorField(ModelSquid, bct[].class);
   public static ReflectorClass ModelWitch = new ReflectorClass(bck.class);
   public static ReflectorField ModelWitch_mole = new ReflectorField(ModelWitch, bct.class, 0);
   public static ReflectorField ModelWitch_hat = new ReflectorField(ModelWitch, bct.class, 1);
   public static ReflectorClass ModelWither = new ReflectorClass(bcl.class);
   public static ReflectorField ModelWither_bodyParts = new ReflectorField(ModelWither, bct[].class, 0);
   public static ReflectorField ModelWither_heads = new ReflectorField(ModelWither, bct[].class, 1);
   public static ReflectorClass ModelWolf = new ReflectorClass(bcm.class);
   public static ReflectorField ModelWolf_tail = new ReflectorField(ModelWolf, bct.class, 6);
   public static ReflectorField ModelWolf_mane = new ReflectorField(ModelWolf, bct.class, 7);
   public static ReflectorClass OptiFineClassTransformer = new ReflectorClass("optifine.OptiFineClassTransformer");
   public static ReflectorField OptiFineClassTransformer_instance = new ReflectorField(OptiFineClassTransformer, "instance");
   public static ReflectorMethod OptiFineClassTransformer_getOptiFineResource = new ReflectorMethod(OptiFineClassTransformer, "getOptiFineResource");
   public static ReflectorClass RenderBoat = new ReflectorClass(bik.class);
   public static ReflectorField RenderBoat_modelBoat = new ReflectorField(RenderBoat, bbo.class);
   public static ReflectorClass RenderMinecart = new ReflectorClass(bjm.class);
   public static ReflectorField RenderMinecart_modelMinecart = new ReflectorField(RenderMinecart, bbo.class);
   public static ReflectorClass RenderWitherSkull = new ReflectorClass(bkk.class);
   public static ReflectorField RenderWitherSkull_model = new ReflectorField(RenderWitherSkull, bbz.class);
   public static ReflectorClass TileEntityBannerRenderer = new ReflectorClass(bha.class);
   public static ReflectorField TileEntityBannerRenderer_bannerModel = new ReflectorField(TileEntityBannerRenderer, bau.class);
   public static ReflectorClass TileEntityBeacon = new ReflectorClass(akv.class);
   public static ReflectorField TileEntityBeacon_customName = new ReflectorField(TileEntityBeacon, String.class);
   public static ReflectorClass TileEntityBrewingStand = new ReflectorClass(akx.class);
   public static ReflectorField TileEntityBrewingStand_customName = new ReflectorField(TileEntityBrewingStand, String.class);
   public static ReflectorClass TileEntityChestRenderer = new ReflectorClass(bhe.class);
   public static ReflectorField TileEntityChestRenderer_simpleChest = new ReflectorField(TileEntityChestRenderer, baz.class, 0);
   public static ReflectorField TileEntityChestRenderer_largeChest = new ReflectorField(TileEntityChestRenderer, baz.class, 1);
   public static ReflectorClass TileEntityEnchantmentTable = new ReflectorClass(ale.class);
   public static ReflectorField TileEntityEnchantmentTable_customName = new ReflectorField(TileEntityEnchantmentTable, String.class);
   public static ReflectorClass TileEntityEnchantmentTableRenderer = new ReflectorClass(bhf.class);
   public static ReflectorField TileEntityEnchantmentTableRenderer_modelBook = new ReflectorField(TileEntityEnchantmentTableRenderer, bay.class);
   public static ReflectorClass TileEntityEnderChestRenderer = new ReflectorClass(bhg.class);
   public static ReflectorField TileEntityEnderChestRenderer_modelChest = new ReflectorField(TileEntityEnderChestRenderer, baz.class);
   public static ReflectorClass TileEntityFurnace = new ReflectorClass(alh.class);
   public static ReflectorField TileEntityFurnace_customName = new ReflectorField(TileEntityFurnace, String.class);
   public static ReflectorClass TileEntitySignRenderer = new ReflectorClass(bhj.class);
   public static ReflectorField TileEntitySignRenderer_model = new ReflectorField(TileEntitySignRenderer, bbx.class);
   public static ReflectorClass TileEntitySkullRenderer = new ReflectorClass(bhk.class);
   public static ReflectorField TileEntitySkullRenderer_skeletonHead = new ReflectorField(TileEntitySkullRenderer, bbz.class, 0);
   public static ReflectorField TileEntitySkullRenderer_humanoidHead = new ReflectorField(TileEntitySkullRenderer, bbz.class, 1);

   public static void callVoid(ReflectorMethod refMethod, Object... params) {
      try {
         Method m = refMethod.getTargetMethod();
         if (m == null) {
            return;
         }

         m.invoke(null, params);
      } catch (Throwable e) {
         handleException(e, null, refMethod, params);
      }
   }

   public static boolean callBoolean(ReflectorMethod refMethod, Object... params) {
      try {
         Method method = refMethod.getTargetMethod();
         if (method == null) {
            return false;
         }

         Boolean retVal = (Boolean)method.invoke(null, params);
         return retVal;
      } catch (Throwable e) {
         handleException(e, null, refMethod, params);
         return false;
      }
   }

   public static int callInt(ReflectorMethod refMethod, Object... params) {
      try {
         Method method = refMethod.getTargetMethod();
         if (method == null) {
            return 0;
         }

         Integer retVal = (Integer)method.invoke(null, params);
         return retVal;
      } catch (Throwable e) {
         handleException(e, null, refMethod, params);
         return 0;
      }
   }

   public static float callFloat(ReflectorMethod refMethod, Object... params) {
      try {
         Method method = refMethod.getTargetMethod();
         if (method == null) {
            return 0.0F;
         }

         Float retVal = (Float)method.invoke(null, params);
         return retVal;
      } catch (Throwable e) {
         handleException(e, null, refMethod, params);
         return 0.0F;
      }
   }

   public static double callDouble(ReflectorMethod refMethod, Object... params) {
      try {
         Method method = refMethod.getTargetMethod();
         if (method == null) {
            return 0.0;
         }

         Double retVal = (Double)method.invoke(null, params);
         return retVal;
      } catch (Throwable e) {
         handleException(e, null, refMethod, params);
         return 0.0;
      }
   }

   public static String callString(ReflectorMethod refMethod, Object... params) {
      try {
         Method method = refMethod.getTargetMethod();
         return method == null ? null : (String)method.invoke(null, params);
      } catch (Throwable e) {
         handleException(e, null, refMethod, params);
         return null;
      }
   }

   public static Object call(ReflectorMethod refMethod, Object... params) {
      try {
         Method method = refMethod.getTargetMethod();
         return method == null ? null : method.invoke(null, params);
      } catch (Throwable e) {
         handleException(e, null, refMethod, params);
         return null;
      }
   }

   public static void callVoid(Object obj, ReflectorMethod refMethod, Object... params) {
      try {
         if (obj == null) {
            return;
         }

         Method method = refMethod.getTargetMethod();
         if (method == null) {
            return;
         }

         method.invoke(obj, params);
      } catch (Throwable e) {
         handleException(e, obj, refMethod, params);
      }
   }

   public static boolean callBoolean(Object obj, ReflectorMethod refMethod, Object... params) {
      try {
         Method method = refMethod.getTargetMethod();
         if (method == null) {
            return false;
         }

         Boolean retVal = (Boolean)method.invoke(obj, params);
         return retVal;
      } catch (Throwable e) {
         handleException(e, obj, refMethod, params);
         return false;
      }
   }

   public static int callInt(Object obj, ReflectorMethod refMethod, Object... params) {
      try {
         Method method = refMethod.getTargetMethod();
         if (method == null) {
            return 0;
         }

         Integer retVal = (Integer)method.invoke(obj, params);
         return retVal;
      } catch (Throwable e) {
         handleException(e, obj, refMethod, params);
         return 0;
      }
   }

   public static float callFloat(Object obj, ReflectorMethod refMethod, Object... params) {
      try {
         Method method = refMethod.getTargetMethod();
         if (method == null) {
            return 0.0F;
         }

         Float retVal = (Float)method.invoke(obj, params);
         return retVal;
      } catch (Throwable e) {
         handleException(e, obj, refMethod, params);
         return 0.0F;
      }
   }

   public static double callDouble(Object obj, ReflectorMethod refMethod, Object... params) {
      try {
         Method method = refMethod.getTargetMethod();
         if (method == null) {
            return 0.0;
         }

         Double retVal = (Double)method.invoke(obj, params);
         return retVal;
      } catch (Throwable e) {
         handleException(e, obj, refMethod, params);
         return 0.0;
      }
   }

   public static String callString(Object obj, ReflectorMethod refMethod, Object... params) {
      try {
         Method method = refMethod.getTargetMethod();
         return method == null ? null : (String)method.invoke(obj, params);
      } catch (Throwable e) {
         handleException(e, obj, refMethod, params);
         return null;
      }
   }

   public static Object call(Object obj, ReflectorMethod refMethod, Object... params) {
      try {
         Method method = refMethod.getTargetMethod();
         return method == null ? null : method.invoke(obj, params);
      } catch (Throwable e) {
         handleException(e, obj, refMethod, params);
         return null;
      }
   }

   public static Object getFieldValue(ReflectorField refField) {
      return getFieldValue(null, refField);
   }

   public static Object getFieldValue(Object obj, ReflectorField refField) {
      try {
         Field field = refField.getTargetField();
         return field == null ? null : field.get(obj);
      } catch (Throwable e) {
         Log.error("", e);
         return null;
      }
   }

   public static boolean getFieldValueBoolean(ReflectorField refField, boolean def) {
      try {
         Field field = refField.getTargetField();
         return field == null ? def : field.getBoolean(null);
      } catch (Throwable e) {
         Log.error("", e);
         return def;
      }
   }

   public static boolean getFieldValueBoolean(Object obj, ReflectorField refField, boolean def) {
      try {
         Field field = refField.getTargetField();
         return field == null ? def : field.getBoolean(obj);
      } catch (Throwable e) {
         Log.error("", e);
         return def;
      }
   }

   public static Object getFieldValue(ReflectorFields refFields, int index) {
      ReflectorField refField = refFields.getReflectorField(index);
      return refField == null ? null : getFieldValue(refField);
   }

   public static Object getFieldValue(Object obj, ReflectorFields refFields, int index) {
      ReflectorField refField = refFields.getReflectorField(index);
      return refField == null ? null : getFieldValue(obj, refField);
   }

   public static float getFieldValueFloat(Object obj, ReflectorField refField, float def) {
      try {
         Field field = refField.getTargetField();
         return field == null ? def : field.getFloat(obj);
      } catch (Throwable e) {
         Log.error("", e);
         return def;
      }
   }

   public static int getFieldValueInt(Object obj, ReflectorField refField, int def) {
      try {
         Field field = refField.getTargetField();
         return field == null ? def : field.getInt(obj);
      } catch (Throwable e) {
         Log.error("", e);
         return def;
      }
   }

   public static long getFieldValueLong(Object obj, ReflectorField refField, long def) {
      try {
         Field field = refField.getTargetField();
         return field == null ? def : field.getLong(obj);
      } catch (Throwable e) {
         Log.error("", e);
         return def;
      }
   }

   public static boolean setFieldValue(ReflectorField refField, Object value) {
      return setFieldValue(null, refField, value);
   }

   public static boolean setFieldValue(Object obj, ReflectorField refField, Object value) {
      try {
         Field field = refField.getTargetField();
         if (field == null) {
            return false;
         }

         field.set(obj, value);
         return true;
      } catch (Throwable e) {
         Log.error("", e);
         return false;
      }
   }

   public static boolean setFieldValueInt(ReflectorField refField, int value) {
      return setFieldValueInt(null, refField, value);
   }

   public static boolean setFieldValueInt(Object obj, ReflectorField refField, int value) {
      try {
         Field field = refField.getTargetField();
         if (field == null) {
            return false;
         }

         field.setInt(obj, value);
         return true;
      } catch (Throwable e) {
         Log.error("", e);
         return false;
      }
   }

   public static boolean postForgeBusEvent(ReflectorConstructor constr, Object... params) {
      Object event = newInstance(constr, params);
      return event == null ? false : postForgeBusEvent(event);
   }

   public static boolean postForgeBusEvent(Object event) {
      if (event == null) {
         return false;
      }

      Object eventBus = getFieldValue(MinecraftForge_EVENT_BUS);
      if (eventBus == null) {
         return false;
      }

      Object ret = call(eventBus, EventBus_post, event);
      if (!(ret instanceof Boolean)) {
         return false;
      }

      Boolean retBool = (Boolean)ret;
      return retBool;
   }

   public static Object newInstance(ReflectorConstructor constr, Object... params) {
      Constructor c = constr.getTargetConstructor();
      if (c == null) {
         return null;
      }

      try {
         return c.newInstance(params);
      } catch (Throwable e) {
         handleException(e, constr, params);
         return null;
      }
   }

   public static boolean matchesTypes(Class[] pTypes, Class[] cTypes) {
      if (pTypes.length != cTypes.length) {
         return false;
      }

      for (int i = 0; i < cTypes.length; i++) {
         Class pType = pTypes[i];
         Class cType = cTypes[i];
         if (pType != cType) {
            return false;
         }
      }

      return true;
   }

   private static void dbgCall(boolean isStatic, String callType, ReflectorMethod refMethod, Object[] params, Object retVal) {
      String className = refMethod.getTargetMethod().getDeclaringClass().getName();
      String methodName = refMethod.getTargetMethod().getName();
      String staticStr = "";
      if (isStatic) {
         staticStr = " static";
      }

      Log.dbg(callType + staticStr + " " + className + "." + methodName + "(" + ArrayUtils.arrayToString(params) + ") => " + retVal);
   }

   private static void dbgCallVoid(boolean isStatic, String callType, ReflectorMethod refMethod, Object[] params) {
      String className = refMethod.getTargetMethod().getDeclaringClass().getName();
      String methodName = refMethod.getTargetMethod().getName();
      String staticStr = "";
      if (isStatic) {
         staticStr = " static";
      }

      Log.dbg(callType + staticStr + " " + className + "." + methodName + "(" + ArrayUtils.arrayToString(params) + ")");
   }

   private static void dbgFieldValue(boolean isStatic, String accessType, ReflectorField refField, Object val) {
      String className = refField.getTargetField().getDeclaringClass().getName();
      String fieldName = refField.getTargetField().getName();
      String staticStr = "";
      if (isStatic) {
         staticStr = " static";
      }

      Log.dbg(accessType + staticStr + " " + className + "." + fieldName + " => " + val);
   }

   private static void handleException(Throwable e, Object obj, ReflectorMethod refMethod, Object[] params) {
      if (e instanceof InvocationTargetException) {
         Throwable cause = e.getCause();
         if (cause instanceof RuntimeException) {
            RuntimeException causeRuntime = (RuntimeException)cause;
            throw causeRuntime;
         }

         Log.error("", e);
      } else {
         Log.warn("*** Exception outside of method ***");
         Log.warn("Method deactivated: " + refMethod.getTargetMethod());
         refMethod.deactivate();
         if (e instanceof IllegalArgumentException) {
            Log.warn("*** IllegalArgumentException ***");
            Log.warn("Method: " + refMethod.getTargetMethod());
            Log.warn("Object: " + obj);
            Log.warn("Parameter classes: " + ArrayUtils.arrayToString(getClasses(params)));
            Log.warn("Parameters: " + ArrayUtils.arrayToString(params));
         }

         Log.warn("", e);
      }
   }

   private static void handleException(Throwable e, ReflectorConstructor refConstr, Object[] params) {
      if (e instanceof InvocationTargetException) {
         Log.error("", e);
      } else {
         Log.warn("*** Exception outside of constructor ***");
         Log.warn("Constructor deactivated: " + refConstr.getTargetConstructor());
         refConstr.deactivate();
         if (e instanceof IllegalArgumentException) {
            Log.warn("*** IllegalArgumentException ***");
            Log.warn("Constructor: " + refConstr.getTargetConstructor());
            Log.warn("Parameter classes: " + ArrayUtils.arrayToString(getClasses(params)));
            Log.warn("Parameters: " + ArrayUtils.arrayToString(params));
         }

         Log.warn("", e);
      }
   }

   private static Object[] getClasses(Object[] objs) {
      if (objs == null) {
         return new Class[0];
      }

      Class[] classes = new Class[objs.length];

      for (int i = 0; i < classes.length; i++) {
         Object obj = objs[i];
         if (obj != null) {
            classes[i] = obj.getClass();
         }
      }

      return classes;
   }

   private static ReflectorField[] getReflectorFields(ReflectorClass parentClass, Class fieldType, int count) {
      ReflectorField[] rfs = new ReflectorField[count];

      for (int i = 0; i < rfs.length; i++) {
         rfs[i] = new ReflectorField(parentClass, fieldType, i);
      }

      return rfs;
   }

   private static boolean logEntry(String str) {
      LOGGER.info("[OptiFine] " + str);
      return true;
   }

   private static boolean registerResolvable(String str) {
      final String msg = str;
      IResolvable ir = new IResolvable() {
         @Override
         public void resolve() {
            Reflector.LOGGER.info("[OptiFine] " + msg);
         }
      };
      ReflectorResolver.register(ir);
      return true;
   }
}
