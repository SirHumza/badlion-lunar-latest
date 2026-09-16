package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListenableFutureTask;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.llamalad7.mixinextras.sugar.Share;
import com.llamalad7.mixinextras.sugar.ref.LocalLongRef;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.properties.PropertyMap;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HCHRIROHHHCORIOCROOCHRCIOROOCI;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IHICORCROOROHCIHIHCOIHRRHICICO;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.OIHCOHRCICCCRHRCROOCIOIRRHHHIH;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.CORCOCICIRIOHROHROIIOOHICCHCRR;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CORCOCICIRIOHROHROIIOOHICCHCRR.IIHRRHORCRCROCHHOHORCHCROCIHRO;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CORCOCICIRIOHROHROIIOOHICCHCRR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ORHIOICIOCRRHOOCOHRORIHICHRCRR;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CIOHHCORHRCCRICCCORIHCRHCCCRRR.HICRRICCHCCROOHHCHOCOCCHOIHHOC;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CIOHHCORHRCCRICCCORIHCRHCCCRRR.RIROICHCRROROHCCROOCCCCOCHCCRI;
import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.IOIICIRIICICIIOORHCIIIIRRIHRHI;
import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRRCCOICORICIHCHRHIHIHROIRHOCR;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.legacy.wrapper.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.net.InetSocketAddress;
import java.util.List;
import java.util.Optional;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import net.minecraft.block.Block;
import net.minecraft.client.LoadingScreenRenderer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.SoundHandler;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiChat;
import net.minecraft.client.gui.GuiIngame;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.advancements.GuiAdvancement;
import net.minecraft.client.gui.inventory.GuiContainerCreative;
import net.minecraft.client.gui.toasts.GuiToast;
import net.minecraft.client.multiplayer.GuiConnecting;
import net.minecraft.client.multiplayer.PlayerControllerMP;
import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.client.particle.ParticleManager;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.debug.DebugRenderer;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.resources.AbstractResourcePack;
import net.minecraft.client.resources.DefaultResourcePack;
import net.minecraft.client.resources.IReloadableResourceManager;
import net.minecraft.client.resources.IResourcePack;
import net.minecraft.client.resources.LanguageManager;
import net.minecraft.client.resources.ResourcePackRepository;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.client.settings.KeyBinding_v1_7;
import net.minecraft.client.settings.KeyBinding_v1_8;
import net.minecraft.client.settings.GameSettings.Options;
import net.minecraft.client.shader.Framebuffer;
import net.minecraft.crash.CrashReport;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Blocks;
import net.minecraft.profiler.ISnooperInfo;
import net.minecraft.profiler.Profiler;
import net.minecraft.server.integrated.IntegratedServer;
import net.minecraft.util.IThreadListener;
import net.minecraft.util.MouseHelper;
import net.minecraft.util.ReportedException;
import net.minecraft.util.Session;
import net.minecraft.util.Timer;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.WorldSettings;
import net.minecraft.world.storage.ISaveFormat;
import org.apache.commons.lang3.SystemUtils;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.Sys;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Slice;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Minecraft.class)
public abstract class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements RRCRRCORICCHOHHIRCHIROOHIIOHCO, ISnooperInfo, IThreadListener {
   @Shadow
   public static int debugFPS;
   @Shadow
   public LoadingScreenRenderer loadingScreen;
   @Shadow
   public GuiScreen currentScreen;
   @Shadow
   public WorldClient world;
   @Shadow
   public FontRenderer fontRenderer;
   @Shadow
   public IReloadableResourceManager resourceManager;
   @Shadow
   public TextureManager renderEngine;
   @Mutable
   @Final
   @Shadow
   public Session session;
   @Final
   @Shadow
   public File gameDir;
   @Shadow
   public int displayWidth;
   @Shadow
   public int displayHeight;
   @Shadow
   public DebugRenderer debugRenderer$v1_12;
   @Shadow
   public GameSettings gameSettings;
   @Shadow
   public EntityRenderer entityRenderer;
   @Shadow
   public ServerData currentServerData;
   @Final
   @Shadow
   public DefaultResourcePack defaultResourcePack;
   @Shadow
   public Entity renderViewEntity$v1_8;
   @Shadow
   public EntityLivingBase renderViewEntity$v1_7;
   @Shadow
   public GuiIngame ingameGUI;
   @Shadow
   public Entity pointedEntity;
   @Shadow
   public RenderItem renderItem$v1_8;
   @Final
   @Shadow
   public PropertyMap profileProperties$v1_8;
   @Shadow
   public EntityPlayerSP player$v1_8;
   @Shadow
   public EntityClientPlayerMP thePlayer$v1_7;
   @Final
   @Shadow
   public Timer timer;
   @Shadow
   public RayTraceResult objectMouseOver;
   @Shadow
   public RenderGlobal renderGlobal;
   @Shadow
   public boolean inGameHasFocus;
   @Shadow
   public TextureMap textureMapBlocks;
   @Shadow
   public PlayerControllerMP playerController;
   @Shadow
   public ParticleManager effectRenderer;
   @Shadow
   public SoundHandler soundHandler;
   @Final
   @Shadow
   public MinecraftSessionService sessionService;
   @Shadow
   public boolean isGamePaused;
   @Unique
   private HHCCIRHCCCIIRHCROHIORHIRHHIORH bridge$lastServerData;
   @Unique
   private long lunar$frameTimeNs;
   @Shadow
   public IntegratedServer integratedServer;
   @Shadow
   public volatile boolean running;
   @Unique
   private boolean lunar$resourcesLoaded = false;
   @Shadow
   public long debugCrashKeyPressTime;
   @Shadow
   public int joinPlayerCounter;
   @Shadow
   public MouseHelper mouseHelper;
   @Shadow
   public static boolean IS_RUNNING_ON_MAC;
   @Shadow
   public Queue<FutureTask<?>> scheduledTasks$v1_8;
   @Shadow
   public Queue scheduledTasks$v1_7;
   @Shadow
   public GuiAdvancement guiAchievement$v1_7;
   @Shadow
   public GuiToast toastGui$v1_12;
   @Shadow
   public Profiler profiler;
   @Shadow
   public String debugProfilerName;
   @Shadow
   public Framebuffer framebuffer;
   @Unique
   public long lunar$realSystemTime;
   @Unique
   public CRRRICCRROCOHHOHIICIHORCOORRRH lunar$spectatedEntity = null;

   @Shadow
   public abstract ResourcePackRepository getResourcePackRepository();

   @Shadow
   public abstract boolean isFullScreen();

   @Shadow
   public abstract void toggleFullscreen();

   @Shadow
   public abstract TextureManager getTextureManager();

   @Shadow
   public abstract void loadWorld(WorldClient var1);

   @Shadow
   public abstract Framebuffer getFramebuffer();

   @Shadow
   public abstract PropertyMap getProfileProperties$v1_8();

   @Shadow
   public abstract void refreshResources();

   @Shadow
   public abstract void shutdownMinecraftApplet();

   @Shadow
   public abstract NetHandlerPlayClient getConnection$v1_12();

   @Shadow
   public abstract NetHandlerPlayClient getNetHandler$v1_7();

   @Shadow
   public abstract RenderManager getRenderManager$v1_8();

   @Shadow
   public abstract ItemRenderer getItemRenderer$v1_8();

   @Shadow
   public abstract void updateDisplay$v1_8();

   @Shadow
   public abstract void resetSize$v1_7();

   @Shadow
   public abstract void displayGuiScreen(GuiScreen var1);

   @Shadow
   public abstract boolean isUnicode();

   @Shadow
   public abstract void setRenderViewEntity$v1_8(Entity var1);

   @Shadow
   public abstract void runTickKeyboard$v1_12();

   @Shadow
   public abstract void runTickMouse$v1_12();

   @Shadow
   public abstract void setIngameFocus();

   @Shadow
   public abstract void dispatchKeypresses();

   @Shadow
   public abstract void displayInGameMenu();

   @Shadow
   public abstract void updateDebugProfilerName(int var1);

   @Shadow
   public abstract LanguageManager getLanguageManager();

   @Shadow
   public abstract void updateFramebufferSize();

   @Shadow
   public abstract void setIngameNotInFocus();

   @Shadow
   public abstract ListenableFuture<Object> addScheduledTask$v1_8(Runnable var1);

   @Shadow
   public abstract ListenableFuture addScheduledTask$v1_7(Runnable var1);

   @Shadow
   public abstract void middleClickMouse();

   @Shadow
   public abstract ISaveFormat getSaveLoader();

   @Shadow
   public abstract void launchIntegratedServer(String var1, String var2, WorldSettings var3);

   public ORHIOICIOCRRHOOCOHRORIHICHRCRR bridge$getCurrentScreen() {
      return (ORHIOICIOCRRHOOCOHRORIHICHRCRR)this.currentScreen;
   }

   public ORHIOICIOCRRHOOCOHRORIHICHRCRR bridge$getCurrentScreenOrRewind() {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
         .HOROHROIORRIRIIIOOCCIROCRCROHI();
      return var1 != null
         ? ((com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.CRRRICCRROCOHHOHIICIHORCOORRRH.CRRRICCRROCOHHOHIICIHORCOORRRH)var1.COICHIOIHHOHRHRHCIOICORCRORIIR()
               .get())
            .HHOHIHRCICOIICIIOHHHRHROHCHICI()
            .RCORHIHICHCOORRRHCHCRICCHICOOO()
         : this.bridge$getCurrentScreen();
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH bridge$getPlayer() {
      return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH)(
         IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? this.player$v1_8 : this.thePlayer$v1_7
      );
   }

   public void bridge$setPlayer(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1
   ) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         this.player$v1_8 = (EntityPlayerSP)var1;
      } else {
         this.thePlayer$v1_7 = (EntityClientPlayerMP)var1;
      }
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH bridge$getPlayerController() {
      return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)this.playerController;
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO bridge$getWorld() {
      return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO)this.world;
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO bridge$getFontRenderer() {
      return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO)this.fontRenderer;
   }

   public RIOOCHICIHRHOHCCCCCHOCCCOHCRHI bridge$getResourceManager() {
      return (RIOOCHICIHRHOHCCCCCHOCCCOHCRHI)this.resourceManager;
   }

   public OOROOCCIRCCRHOIOIORIHCHHOOCCOR bridge$getMcDefaultResourcePack() {
      return (OOROOCCIRCCRHOIOIORIHCHHOOCCOR)this.defaultResourcePack;
   }

   public HICRRICCHCCROOHHCHOCOCCHOIHHOC bridge$getTextureManager() {
      return (HICRRICCHCCROOHHCHOCOCCHOIHHOC)this.renderEngine;
   }

   public IHICORCROOROHCIHIHCOIHRRHICICO bridge$getSession() {
      return (IHICORCROOROHCIHIHCOIHRRHICICO)this.session;
   }

   public PropertyMap bridge$getProfileProperties() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         return this.getProfileProperties$v1_8();
      }

      PropertyMap var1 = new PropertyMap();
      GameProfile var2 = this.sessionService.fillProfileProperties(this.session.getProfile(), false);
      var1.putAll(var2.getProperties());
      return var1;
   }

   public MinecraftSessionService bridge$getSessionService() {
      return this.sessionService;
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH bridge$getGameRenderer() {
      return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH)this.entityRenderer;
   }

   public HHCCIRHCCCIIRHCROHIORHIRHHIORH bridge$getCurrentServerData() {
      return (HHCCIRHCCCIIRHCROHIORHIRHHIORH)this.currentServerData;
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI bridge$getRenderItem() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1
         ? (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI)this.renderItem$v1_8
         : (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI)RenderManager.instance$v1_7
            .entityRenderMap$v1_7
            .get(EntityItem.class);
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH bridge$getSoundHandler() {
      return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH)this.soundHandler;
   }

   public void bridge$setSession(IHICORCROOROHCIHIHCOIHRRHICICO var1) {
      Session var2 = this.session;
      this.session = (Session)var1;
      if (var1 != null) {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            "Setting user: " + this.session.getUsername(), new Object[0]
         );
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
            this.profileProperties$v1_8.clear();
         }

         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR() != null) {
            IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().RCIRROCCCIIHCIHCCRHHCCHOHHHCHH((IHICORCROOROHCIHIHCOIHRRHICICO)var2);
         }
      }
   }

   public File bridge$getMcDataDir() {
      return this.gameDir;
   }

   public void bridge$displayScreen(ORHIOICIOCRRHOOCOHRORIHICHRCRR var1) {
      if (com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR() != null) {
         com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR().HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var1);
      }

      this.displayGuiScreen((GuiScreen)var1);
   }

   public void bridge$setCurrentScreenSilent(ORHIOICIOCRRHOOCOHRORIHICHRCRR var1) {
      this.currentScreen = (GuiScreen)var1;
   }

   public void bridge$openChat(String var1) {
      this.displayGuiScreen(new GuiChat(var1));
   }

   public int bridge$displayWidth() {
      return this.displayWidth;
   }

   public void bridge$setDisplayWidth(int var1) {
      this.displayWidth = var1;
   }

   public int bridge$displayHeight() {
      return this.displayHeight;
   }

   public void bridge$setDisplayHeight(int var1) {
      this.displayHeight = var1;
   }

   public int bridge$logicalWidth() {
      return Display.getWidth();
   }

   public int bridge$logicalHeight() {
      return Display.getHeight();
   }

   public boolean bridge$unicode() {
      return this.isUnicode();
   }

   public int bridge$getGuiScale() {
      return this.gameSettings.guiScale;
   }

   public void bridge$setGuiScale(int var1) {
      this.gameSettings.guiScale = var1;
   }

   public void bridge$setRawGuiScale(int var1) {
      this.gameSettings.guiScale = var1;
   }

   public void bridge$updateFramebufferSize() {
      this.updateFramebufferSize();
   }

   public void bridge$loadWorld(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO var1
   ) {
      this.loadWorld((WorldClient)var1);
   }

   public void bridge$setWorldDirect(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO var1
   ) {
      this.world = (WorldClient)var1;
   }

   public void bridge$shutdownMinecraftApplet() {
      this.shutdownMinecraftApplet();
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH bridge$getClientPacketListener() {
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1;
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
         var1 = (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)this.getConnection$v1_12();
      } else {
         var1 = (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)this.getNetHandler$v1_7();
      }

      if (var1 == null
         && this.currentScreen instanceof com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var2
         )
       {
         var1 = var2.bridge$getClientPacketListener();
      }

      return var1;
   }

   public void bridge$refreshResources() {
      this.refreshResources();
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH bridge$getEntityRenderDispatcher() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1
         ? (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)this.getRenderManager$v1_8()
         : (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)RenderManager.instance$v1_7;
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO bridge$getWindow() {
      try {
         Field var1 = Display.class.getDeclaredField("display_impl");
         var1.setAccessible(true);
         return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO)var1.get(
            null
         );
      } catch (IllegalAccessException | NoSuchFieldException var2) {
         throw new RuntimeException(var2);
      }
   }

   public Optional<CRRRICCRROCOHHOHIICIHORCOORRRH> bridge$getPointedEntity() {
      return Optional.ofNullable((CRRRICCRROCOHHOHIICIHORCOORRRH)this.pointedEntity);
   }

   public long bridge$getSystemTime() {
      return Minecraft.getSystemTime();
   }

   public long bridge$getRealSystemTime() {
      return Sys.getTime() * 1000L / Sys.getTimerResolution();
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH bridge$getGameSettings() {
      return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)this.gameSettings;
   }

   public OHHRIOHROOIHOROCIRHCHORIHRRRRI bridge$getGuiIngame() {
      return (OHHRIOHROOIHOROCIRHCHORIHRRRRI)this.ingameGUI;
   }

   public int bridge$getDebugFPS() {
      return debugFPS;
   }

   public float bridge$getFrametime() {
      return (float)this.lunar$frameTimeNs / 1.0E9F;
   }

   public CRRRICCRROCOHHOHIICIHORCOORRRH bridge$getRenderViewEntity() {
      return (CRRRICCRROCOHHOHIICIHORCOORRRH)(IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? this.renderViewEntity$v1_8 : this.renderViewEntity$v1_7);
   }

   public void bridge$setRenderViewEntity(CRRRICCRROCOHHOHIICIHORCOORRRH var1) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         this.setRenderViewEntity$v1_8((Entity)var1);
      } else if (var1 == null) {
         this.renderViewEntity$v1_7 = null;
      } else if (var1 instanceof EntityLivingBase var2) {
         this.renderViewEntity$v1_7 = var2;
      } else {
         this.renderViewEntity$v1_7 = new HRCHROOHRIHCRCRHRIIROCIRHOIRHH((Entity)var1);
      }
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI bridge$getLevelRenderer() {
      return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI)this.renderGlobal;
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH bridge$getMainRenderTarget() {
      return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH)this.getFramebuffer();
   }

   public void bridge$setMainRenderTarget(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1
   ) {
      this.framebuffer = (Framebuffer)var1;
   }

   public boolean bridge$hasInGameFocus() {
      return this.inGameHasFocus;
   }

   public void bridge$setInGameFocus(boolean var1) {
      this.inGameHasFocus = var1;
      if (var1) {
         if (!IS_RUNNING_ON_MAC && IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
            KeyBinding_v1_8.updateKeyBindState$v1_12();
         }

         this.mouseHelper.grabMouseCursor();
      } else {
         this.mouseHelper.ungrabMouseCursor();
      }
   }

   public RIROICHCRROROHCCROOCCCCOCHCCRI bridge$getTextureMap() {
      return (RIROICHCRROROHCCROOCCCCOCHCCRI)this.textureMapBlocks;
   }

   public RIROICHCRROROHCCROOCCCCOCHCCRI bridge$getTextureMapById(RCIROOOOICRHCCRRCIORHHIRCOIIIC var1) {
      return TextureMap.LOCATION_BLOCKS_TEXTURE.equals(var1) ? (RIROICHCRROROHCCROOCCCCOCHCCRI)this.textureMapBlocks : null;
   }

   public boolean bridge$isFullScreen() {
      return this.isFullScreen();
   }

   public void bridge$toggleFullscreen() {
      this.toggleFullscreen();
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH bridge$getEffectRenderer() {
      return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH)this.effectRenderer;
   }

   public HCHRIROHHHCORIOCROOCHRCIOROOCI bridge$getTimer() {
      return (HCHRIROHHHCORIOCROOCHRCIOROOCI)this.timer;
   }

   public OIHCOHRCICCCRHRCROOCIOIRRHHHIH bridge$getObjectMouseOver() {
      return (OIHCOHRCICCCRHRCROOCIOIRRHHHIH)this.objectMouseOver;
   }

   public void bridge$submit(Runnable var1) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         this.addScheduledTask$v1_8(var1);
      } else {
         this.addScheduledTask$v1_7(var1);
      }
   }

   public void bridge$schedule(Runnable var1) {
      ListenableFutureTask var2 = ListenableFutureTask.create(Executors.callable(var1));
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         synchronized (this.scheduledTasks$v1_8) {
            this.scheduledTasks$v1_8.add(var2);
         }
      } else {
         synchronized (this.scheduledTasks$v1_7) {
            this.scheduledTasks$v1_7.add(var2);
         }
      }
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.CRRRICCRROCOHHOHIICIHORCOORRRH bridge$getItemRenderer() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1
         ? (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.CRRRICCRROCOHHOHIICIHORCOORRRH)this.getItemRenderer$v1_8()
         : (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.CRRRICCRROCOHHOHIICIHORCOORRRH)this.entityRenderer
            .itemRenderer;
   }

   public boolean bridge$isGamePaused() {
      return this.isGamePaused;
   }

   public boolean bridge$isDisplayActive() {
      return Display.isActive();
   }

   public boolean bridge$isDisplayCreated() {
      return Display.isCreated();
   }

   public void bridge$setDisplayTitle(String var1) {
      Display.setTitle(var1);
   }

   public HHCCIRHCCCIIRHCROHIORHIRHHIORH bridge$lastServerData() {
      return this.bridge$lastServerData;
   }

   @Inject(method = "setServerData", at = @At("HEAD"))
   private void bridge$setServerData(ServerData var1, CallbackInfo var2) {
      this.bridge$lastServerData = (HHCCIRHCCCIIRHCROHIORHIRHHIORH)this.currentServerData;
   }

   public void bridge$setCurrentServer(HHCCIRHCCCIIRHCROHIORHIRHHIORH var1) {
      this.bridge$lastServerData = var1;
   }

   public void bridge$setRepeatEventsEnabled(boolean var1) {
      Keyboard.enableRepeatEvents(var1);
   }

   public OOROOCCIRCCRHOIOIORIHCHHOOCCOR bridge$getSelectedResourcePack() {
      List var1 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1
         ? this.getResourcePackRepository().getRepositoryEntries$v1_8()
         : this.getResourcePackRepository().getRepositoryEntries$v1_7();
      return (OOROOCCIRCCRHOIOIORIHCHHOOCCOR)var1.stream()
         .map(var0 -> var0.reResourcePack)
         .findFirst()
         .orElseGet(() -> (IResourcePack)this.bridge$getMcDefaultResourcePack());
   }

   public List<File> bridge$getClientResourcePacksFiles() {
      List var1 = this.bridge$getAllSelectedPacks();
      IResourcePack var2 = this.getResourcePackRepository().serverResourcePack;
      return var1.stream()
         .filter(var1x -> var1x instanceof AbstractResourcePack && var1x != var2)
         .map(var0 -> ((AbstractResourcePack)var0).resourcePackFile)
         .toList();
   }

   public List<File> bridge$getServerResourcePacksFiles() {
      return this.getResourcePackRepository().serverResourcePack instanceof AbstractResourcePack var2 ? List.of(var2.resourcePackFile) : List.of();
   }

   public List<File> bridge$getAllBuiltInPacksFiles() {
      return List.of();
   }

   @Nullable
   public String bridge$getBuiltInPackName(String var1) {
      return null;
   }

   public List<OOROOCCIRCCRHOIOIORIHCHHOOCCOR> bridge$getAllSelectedPacks() {
      List var1 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1
         ? this.getResourcePackRepository().getRepositoryEntries$v1_8()
         : this.getResourcePackRepository().getRepositoryEntries$v1_7();
      return var1.stream().map(var0 -> (OOROOCCIRCCRHOIOIORIHCHHOOCCOR)var0.reResourcePack).toList();
   }

   public Optional<InetSocketAddress> bridge$resolveAddress(String var1) {
      return com.moonsworth.lunar.client.IOHIHIIHCCCCCIHRORIOIOORCIOHII.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORIRHOIOHCCHOHRIRIHCHIICOIIOOR
         .IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            com.moonsworth.lunar.client.IOHIHIIHCCCCCIHRORIOIOORCIOHII.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCROOOORIRIHOORHRHCIHICIIRROO(var1)
         )
         .map(com.moonsworth.lunar.client.IOHIHIIHCCCCCIHRORIOIOORCIOHII.IRCIIHHICIHRCOCRROCOICRIHHCCHH::OROORHRRCHCOHRCORCCRHHCIORORCI);
   }

   public void bridge$connect(HHCCIRHCCCIIRHCROHIORHIRHHIORH var1, ORHIOICIOCRRHOOCOHRORIHICHRCRR var2) {
      this.displayGuiScreen(new GuiConnecting((GuiScreen)var2, (Minecraft)this, (ServerData)var1));
   }

   public boolean bridge$isConnectedToRealms() {
      return false;
   }

   public void bridge$updateDisplay() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         this.updateDisplay$v1_8();
      } else {
         this.resetSize$v1_7();
      }
   }

   public boolean bridge$isWindowFocused() {
      return Display.isActive();
   }

   public boolean bridge$isFpsLimited() {
      return false;
   }

   public IIHRRHORCRCROCHHOHORCHCROCIHRO bridge$getSkinManager() {
      return (IIHRRHORCRCROCHHOHORCHCROCIHRO)((Minecraft)this).getSkinManager();
   }

   public boolean bridge$renderChunkBorder() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5 && this.debugRenderer$v1_12.chunkBorderEnabled;
   }

   public void bridge$setRenderChunkBorder(boolean var1) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5 && this.debugRenderer$v1_12 != null) {
         this.debugRenderer$v1_12.chunkBorderEnabled = var1;
      }
   }

   @Inject(method = "run", at = @At("HEAD"))
   private void lunar$run(CallbackInfo var1) {
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this);
   }

   public Set<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> bridge$xrayBlocks() {
      Builder var1 = ImmutableSet.builder();
      var1.add(
         new Block[]{
            Blocks.COAL_ORE,
            Blocks.IRON_ORE,
            Blocks.GOLD_ORE,
            Blocks.REDSTONE_ORE,
            Blocks.LAPIS_ORE,
            Blocks.DIAMOND_ORE,
            Blocks.EMERALD_ORE,
            Blocks.QUARTZ_ORE,
            Blocks.GLOWSTONE,
            Blocks.CRAFTING_TABLE,
            Blocks.TORCH,
            Blocks.LADDER,
            Blocks.TNT,
            Blocks.COAL_BLOCK,
            Blocks.IRON_BLOCK,
            Blocks.GOLD_BLOCK,
            Blocks.DIAMOND_BLOCK,
            Blocks.CHEST,
            Blocks.TRAPPED_CHEST,
            Blocks.EMERALD_BLOCK,
            Blocks.REDSTONE_BLOCK,
            Blocks.LAPIS_BLOCK,
            Blocks.FIRE,
            Blocks.MOSSY_COBBLESTONE,
            Blocks.MOB_SPAWNER,
            Blocks.END_PORTAL_FRAME,
            Blocks.ENCHANTING_TABLE,
            Blocks.BOOKSHELF,
            Blocks.COMMAND_BLOCK,
            Blocks.FURNACE,
            Blocks.LIT_FURNACE
         }
      );
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 0) {
         var1.add(new Block[]{Blocks.lava$v1_7, Blocks.flowing_lava$v1_7, Blocks.water$v1_7, Blocks.flowing_water$v1_7});
      } else {
         var1.add(new Block[]{Blocks.LAVA$v1_8, Blocks.FLOWING_LAVA$v1_8, Blocks.WATER$v1_8, Blocks.FLOWING_WATER$v1_8});
      }

      return (Set<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH>)var1.build();
   }

   public void bridge$recreateLoadingScreen() {
      if (OpenGlHelper.isFramebufferEnabled()) {
         LoadingScreenRenderer var1 = this.loadingScreen;
         if (var1 == null || var1.framebuffer == null || var1.framebuffer.framebufferObject == -1) {
            this.loadingScreen = new LoadingScreenRenderer((Minecraft)this);
         }
      }
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.ORHIOICIOCRRHOOCOHRORIHICHRCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH bridge$getIntegratedServer() {
      return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.ORHIOICIOCRRHOOCOHRORIHICHRCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)this.integratedServer;
   }

   public boolean bridge$isRunning() {
      return this.running;
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH bridge$getLanguageManager() {
      return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH)this.getLanguageManager();
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Inject(method = "runGameLoop", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/GlStateManager;clear(I)V", ordinal = 0))
   private void lunar$startFrametime$v1_8(CallbackInfo var1, @Share("frametime") LocalLongRef var2) {
      var2.set(System.nanoTime());
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Inject(
      method = "runGameLoop",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/EntityRenderer;renderStreamIndicator$v1_8(F)V", shift = Shift.AFTER, ordinal = 0)
   )
   private void lunar$endFrametime$v1_8(CallbackInfo var1, @Share("frametime") LocalLongRef var2) {
      this.lunar$frameTimeNs = System.nanoTime() - var2.get();
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Inject(method = "runGameLoop", at = @At(value = "INVOKE", target = "Lorg/lwjgl/opengl/GL11;glClear(I)V", ordinal = 0))
   private void lunar$startFrametime$v1_7(CallbackInfo var1, @Share("frametime") LocalLongRef var2) {
      var2.set(System.nanoTime());
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Inject(
      method = "runGameLoop",
      slice = @Slice(from = @At(value = "INVOKE", target = "Lnet/minecraft/client/shader/Framebuffer;framebufferRender(II)V")),
      at = @At(value = "INVOKE", target = "Lnet/minecraft/profiler/Profiler;startSection(Ljava/lang/String;)V", ordinal = 0)
   )
   private void lunar$endFrametime$v1_7(CallbackInfo var1, @Share("frametime") LocalLongRef var2) {
      this.lunar$frameTimeNs = System.nanoTime() - var2.get();
   }

   @Inject(method = "refreshResources", at = @At("HEAD"))
   private void lunar$refreshResources$head(CallbackInfo var1) {
      this.lunar$resourcesLoaded = false;
   }

   @Inject(method = "refreshResources", at = @At("RETURN"))
   private void lunar$refreshResources$return(CallbackInfo var1) {
      this.lunar$resourcesLoaded = true;
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            IRRCCOICORICIHCHRHIHIHROIRHOCR.class, () -> new IRRCCOICORICIHCHRHIHIHROIRHOCR(CompletableFuture.completedFuture(null))
         );
   }

   public boolean bridge$areResourcesLoaded() {
      return this.lunar$resourcesLoaded;
   }

   public void bridge$processKeyboardAndMouse() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 5) {
         this.runTickKeyboard$v1_12();
         this.runTickMouse$v1_12();
      } else {
         while (Keyboard.next()) {
            if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 0) {
               KeyBinding_v1_7.setKeyBindState(Keyboard.getEventKey(), Keyboard.getEventKeyState());
               if (Keyboard.getEventKeyState()) {
                  KeyBinding_v1_7.onTick(Keyboard.getEventKey());
               }
            } else {
               KeyBinding_v1_8.setKeyBindState(Keyboard.getEventKey(), Keyboard.getEventKeyState());
               if (Keyboard.getEventKeyState()) {
                  KeyBinding_v1_8.onTick(Keyboard.getEventKey());
               }
            }

            if (this.debugCrashKeyPressTime > 0L) {
               if (this.bridge$getRealSystemTime() - this.debugCrashKeyPressTime >= 6000L) {
                  throw new ReportedException(new CrashReport("Manually triggered debug crash", new Throwable()));
               }

               if (!Keyboard.isKeyDown(46) || !Keyboard.isKeyDown(61)) {
                  this.debugCrashKeyPressTime = -1L;
               }
            } else if (Keyboard.isKeyDown(46) && Keyboard.isKeyDown(61)) {
               this.debugCrashKeyPressTime = this.bridge$getRealSystemTime();
            }

            this.dispatchKeypresses();
            if (Keyboard.getEventKeyState()) {
               if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 0 && Keyboard.getEventKey() == 62 && this.entityRenderer != null) {
                  this.entityRenderer.deactivateShader$v1_7();
               }

               if (this.currentScreen == null) {
                  if (Keyboard.getEventKey() == 1) {
                     this.displayInGameMenu();
                  }

                  if (Keyboard.getEventKey() == 31 && Keyboard.isKeyDown(61)) {
                     this.refreshResources();
                  }

                  if (Keyboard.getEventKey() == 20 && Keyboard.isKeyDown(61)) {
                     this.refreshResources();
                  }

                  if (Keyboard.getEventKey() == 33 && Keyboard.isKeyDown(61)) {
                     boolean var1 = Keyboard.isKeyDown(42) | Keyboard.isKeyDown(54);
                     this.gameSettings.setOptionValue(Options.RENDER_DISTANCE, var1 ? -1 : 1);
                  }

                  if (Keyboard.getEventKey() == 30 && Keyboard.isKeyDown(61)) {
                     this.renderGlobal.loadRenderers();
                  }

                  if (Keyboard.getEventKey() == 35 && Keyboard.isKeyDown(61)) {
                     this.gameSettings.advancedItemTooltips = !this.gameSettings.advancedItemTooltips;
                     this.gameSettings.saveOptions();
                  }

                  if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 0 && Keyboard.getEventKey() == 48 && Keyboard.isKeyDown(61)) {
                     RenderManager.debugBoundingBox$v1_7 = !RenderManager.debugBoundingBox$v1_7;
                  }

                  if (Keyboard.getEventKey() == 25 && Keyboard.isKeyDown(61)) {
                     this.gameSettings.pauseOnLostFocus = !this.gameSettings.pauseOnLostFocus;
                     this.gameSettings.saveOptions();
                  }

                  if (Keyboard.getEventKey() == 59) {
                     this.gameSettings.hideGUI = !this.gameSettings.hideGUI;
                  }

                  if (Keyboard.getEventKey() == 61) {
                     this.gameSettings.showDebugInfo = !this.gameSettings.showDebugInfo;
                     this.gameSettings.showDebugProfilerChart = GuiScreen.isShiftKeyDown();
                  }

                  if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 0) {
                     if (this.gameSettings.keyBindTogglePerspective$v1_7.isPressed()) {
                        this.gameSettings.thirdPersonView++;
                        if (this.gameSettings.thirdPersonView > 2) {
                           this.gameSettings.thirdPersonView = 0;
                        }
                     }

                     if (this.gameSettings.keyBindSmoothCamera$v1_7.isPressed()) {
                        this.gameSettings.smoothCamera = !this.gameSettings.smoothCamera;
                     }
                  } else {
                     if (this.gameSettings.keyBindTogglePerspective$v1_8.isPressed()) {
                        this.gameSettings.thirdPersonView++;
                        if (this.gameSettings.thirdPersonView > 2) {
                           this.gameSettings.thirdPersonView = 0;
                        }
                     }

                     if (this.gameSettings.keyBindSmoothCamera$v1_8.isPressed()) {
                        this.gameSettings.smoothCamera = !this.gameSettings.smoothCamera;
                     }
                  }
               }

               if (this.gameSettings.showDebugInfo && this.gameSettings.showDebugProfilerChart) {
                  if (Keyboard.getEventKey() == 11) {
                     this.updateDebugProfilerName(0);
                  }

                  for (int var9 = 0; var9 < 9; var9++) {
                     if (Keyboard.getEventKey() == 2 + var9) {
                        this.updateDebugProfilerName(var9 + 1);
                     }
                  }
               }
            }
         }

         while (Mouse.next()) {
            int var10 = Mouse.getEventButton();
            if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 0) {
               KeyBinding_v1_7.setKeyBindState(var10 - 100, Mouse.getEventButtonState());
               if (Mouse.getEventButtonState()) {
                  KeyBinding_v1_7.onTick(var10 - 100);
               }
            } else {
               KeyBinding_v1_8.setKeyBindState(var10 - 100, Mouse.getEventButtonState());
               if (Mouse.getEventButtonState()) {
                  KeyBinding_v1_8.onTick(var10 - 100);
               }
            }

            long var2 = this.bridge$getRealSystemTime() - this.lunar$realSystemTime;
            if (var2 <= 200L) {
               int var4 = Mouse.getEventDWheel();
               if (var4 != 0) {
                  int var5 = var4;
                  com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO var6 = (com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO)com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
                     .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                        com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.class,
                        () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO(
                           var5
                        )
                     );
                  if (var6 != null && var6.isCancelled()
                     || (Boolean)IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                        .HHHIHROORHHOOCCOOCHRIRHRHCRHIH()
                        .OHOHCHORHIIHCCOIHOHCCICRHHICIR()
                        .ICCHCICCROHCOIOHRCHORCOCIHORIO()
                        .get()) {
                     var4 = 0;
                  }
               }

               if (var4 != 0) {
                  if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 1) {
                     this.player$v1_8.inventory.changeCurrentItem(var4);
                  } else {
                     this.thePlayer$v1_7.inventory.changeCurrentItem(var4);
                     if (this.gameSettings.noclip$v1_7) {
                        if (var4 > 0) {
                           var4 = 1;
                        }

                        if (var4 < 0) {
                           var4 = -1;
                        }

                        GameSettings var11 = this.gameSettings;
                        var11.noclipRate$v1_7 += var4 * 0.25F;
                     }
                  }
               }

               if (this.currentScreen == null) {
                  if (!this.inGameHasFocus && Mouse.getEventButtonState()) {
                     this.setIngameFocus();
                  }
               } else if (this.currentScreen != null) {
                  this.currentScreen.handleMouseInput();
                  if (!IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                     .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
                     .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
                     .OOROOCCIRCCRHOIOIORIHCHHOOCCOR(
                        com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH::IHHCRHRIORROROHIIIRHOORHHRHOII
                     )) {
                     int var12 = Mouse.getEventDWheel();
                     if (var12 != 0) {
                        com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CCHIHCHICORHHHIHRHCRCICCROHORR()
                           .RRCRRCORICCHOHHIRCHIROOHIIOHCO(0.0, var12 > 0 ? 1.0 : -1.0);
                     }

                     int var13 = Mouse.getEventButton();
                     if (var13 != -1) {
                        com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH var7 = (com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH)com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
                           .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                              com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.class,
                              () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                                 Mouse.getEventButton(),
                                 com.moonsworth.lunar.legacy.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CHOOOHOIIRRCRCIHRORHIOOCIHHOHC(),
                                 Mouse.getEventButtonState()
                                    ? com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.DOWN
                                    : com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.UP
                              )
                           );
                        if (var7 == null || !var7.isCancelled()) {
                           boolean var8 = Mouse.getEventButtonState();
                           com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CCHIHCHICORHHHIHRHCRCICCROHORR()
                              .RCIROOOOICRHCCRRCIORHHIRCOIIIC(
                                 var13,
                                 var8 ? 1 : 0,
                                 com.moonsworth.lunar.legacy.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CHOOOHOIIRRCRCIHRORHIOOCIHHOHC()
                              );
                        }
                     }
                  }
               }
            }
         }

         this.lunar$realSystemTime = this.bridge$getRealSystemTime();
      }
   }

   public int bridge$getCreativeTab() {
      return GuiContainerCreative.selectedTabIndex;
   }

   public void bridge$setCreativeTab(int var1) {
      GuiContainerCreative.selectedTabIndex = var1;
   }

   public void bridge$clearLevel() {
      this.loadWorld(null);
   }

   public void bridge$processRewindTick() {
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IOIICIRIICICIIOORHCIIIIRRIHRHI.class, IOIICIRIICICIIOORHCIIIIRRIHRHI::new);
      if (IOIICIRIICICIIOORHCIIIIRRIHRHI.ROCHOOHIHIHCIRHCICIOHHCIOHHHRH != 0 && IOIICIRIICICIIOORHCIIIIRRIHRHI.ROCHOOHIHIHCIRHCICIOHHCIOHHHRH % 20 == 0) {
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIROICHCRROROHCCROOCCCCOCHCCRI.class,
               com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIROICHCRROROHCCROOCCCCOCHCCRI::new
            );
      }

      IOIICIRIICICIIOORHCIIIIRRIHRHI.ROCHOOHIHIHCIRHCICIOHHCIOHHHRH++;
      if (this.world != null) {
         this.renderEngine.tick();
         Object var1 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? this.player$v1_8 : this.thePlayer$v1_7;
         if (var1 != null) {
            this.joinPlayerCounter++;
            if (this.joinPlayerCounter == 30) {
               this.joinPlayerCounter = 0;
               this.world.joinEntityInSurroundings((Entity)var1);
            }
         }

         if (!this.isGamePaused) {
            this.entityRenderer.updateRenderer();
            this.renderGlobal.updateClouds();
            if (this.world.lastLightningBolt > 0) {
               this.world.lastLightningBolt--;
            }

            this.world.updateEntities();
            this.world.tick();
         }
      }

      if (!this.isGamePaused) {
         this.effectRenderer.updateEffects();
      }
   }

   public void bridge$pickBlock() {
      this.middleClickMouse();
   }

   public void bridge$waitOnAllChunksRendering() {
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HRICIORORHCRHCCCIIIHRRHCICOHOR()
         .ifPresent(var1 -> var1.waitOnAllChunksRendering(this));
   }

   public void bridge$overrideMainRenderTarget(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1,
      boolean var2,
      boolean var3
   ) {
      Framebuffer var4;
      if (var1 instanceof Framebuffer var5) {
         var4 = var5;
      } else {
         var4 = this.framebuffer;
      }

      if (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HRICIORORHCRHCCCIIIHRRHCICOHOR()
            .map(var0 -> var0.getConfig().hasFastRender())
            .orElse(false)
         && var3) {
         int var8 = var4 == this.framebuffer ? 0 : var4.framebufferObject;
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
            OpenGlHelper.glBindFramebuffer$v1_8(36009, var8);
         } else {
            OpenGlHelper.func_153171_g$v1_7(36009, var8);
         }

         int var6 = var4.framebufferWidth;
         int var7 = var4.framebufferHeight;
         if (var2) {
            if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
               GlStateManager.viewport(0, 0, var6, var7);
            } else {
               GL11.glViewport(0, 0, var6, var7);
            }
         }
      } else {
         var4.bindFramebuffer(var2);
      }
   }

   public int bridge$getProtocolVersion() {
      return switch (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION) {
         case 0 -> 5;
         case 1 -> 47;
         case 5 -> 340;
         default -> throw new IllegalStateException("Unexpected version: " + IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION);
      };
   }

   public CRRRICCRROCOHHOHIICIHORCOORRRH bridge$getSpectatedEntity() {
      return this.lunar$spectatedEntity;
   }

   public void bridge$setSpectatedEntity(CRRRICCRROCOHHOHIICIHORCOORRRH var1) {
      this.lunar$spectatedEntity = var1;
   }

   public void bridge$joinWorld(String var1, String var2, CORCOCICIRIOHROHROIIOOHICCHCRR var3, Runnable var4) {
      try {
         this.launchIntegratedServer(var2, var1, (WorldSettings)var3);
      } catch (ReportedException var6) {
         throw var6;
      } catch (Exception var7) {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var7, "Failed to join world %s", new Object[]{var2}
         );
         var4.run();
      }
   }

   public boolean bridge$deleteWorld(String var1) {
      ISaveFormat var2 = this.getSaveLoader();
      var2.flushCache();

      try {
         if (!var2.deleteWorldDirectory(var1)) {
            com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
               "World", "Failed to delete world save %s", new Object[]{var1}
            );
            return false;
         } else {
            return true;
         }
      } catch (Exception var4) {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var4, "Failed to delete world save %s", new Object[]{var1}
         );
         return false;
      }
   }

   public List<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> bridge$getPieChartResults() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         List var2 = this.profiler.getProfilingData$v1_8(this.debugProfilerName);
         return var2 == null
            ? null
            : var2.stream()
               .map(
                  var0 -> (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var0
               )
               .toList();
      } else {
         List var1 = this.profiler.getProfilingData$v1_7(this.debugProfilerName);
         return var1 == null
            ? null
            : var1.stream()
               .map(
                  var0 -> (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var0
               )
               .toList();
      }
   }

   public boolean bridge$isReducedDebugInfo() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION < 1
         ? false
         : this.player$v1_8 != null && this.player$v1_8.hasReducedDebug$v1_8() || this.gameSettings.reducedDebugInfo$v1_8;
   }

   public boolean bridge$isMouseButtonDown(int var1) {
      return Mouse.isButtonDown(var1);
   }

   @WrapOperation(
      method = "updateDisplayMode",
      at = @At(value = "INVOKE", target = "Lorg/lwjgl/opengl/Display;setDisplayMode(Lorg/lwjgl/opengl/DisplayMode;)V")
   )
   private void lunar$fullscreenRefreshRateFix(DisplayMode var1, Operation<Void> var2) {
      if (SystemUtils.IS_OS_WINDOWS) {
         try {
            Constructor var3 = DisplayMode.class.getDeclaredConstructor(int.class, int.class, int.class, int.class, boolean.class);
            var3.setAccessible(true);
            var1 = (DisplayMode)var3.newInstance(var1.getWidth(), var1.getHeight(), var1.getBitsPerPixel(), 0, var1.isFullscreenCapable());
         } catch (Exception var4) {
            com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.warn("Failed to inject into display mode", var4);
         }
      }

      var2.call(new Object[]{var1});
   }
}
