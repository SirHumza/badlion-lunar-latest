import bnm.a;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.net.URI;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import net.optifine.DynamicLights;
import net.optifine.GlErrors;
import net.optifine.VersionCheckThread;
import net.optifine.config.GlVersion;
import net.optifine.gui.GuiMessage;
import net.optifine.reflect.Reflector;
import net.optifine.reflect.ReflectorForge;
import net.optifine.shaders.Shaders;
import net.optifine.util.DisplayModeComparator;
import net.optifine.util.PropertiesOrdered;
import net.optifine.util.TextureUtils;
import net.optifine.util.TimedEvent;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.LWJGLException;
import org.lwjgl.Sys;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL30;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.PixelFormat;

public class Config {
   public static final String OF_NAME = "OptiFine";
   public static final String MC_VERSION = "1.8.9";
   public static final String OF_EDITION = "HD_U";
   public static final String OF_RELEASE = "M6_pre2";
   public static final String VERSION = "OptiFine_1.8.9_HD_U_M6_pre2";
   private static String build = null;
   private static String newRelease = null;
   private static boolean notify64BitJava = false;
   public static String openGlVersion = null;
   public static String openGlRenderer = null;
   public static String openGlVendor = null;
   public static String[] openGlExtensions = null;
   public static GlVersion glVersion = null;
   public static GlVersion glslVersion = null;
   public static int minecraftVersionInt = -1;
   public static boolean fancyFogAvailable = false;
   public static boolean occlusionAvailable = false;
   private static avh gameSettings = null;
   private static ave minecraft = ave.A();
   private static boolean initialized = false;
   private static Thread minecraftThread = null;
   private static DisplayMode desktopDisplayMode = null;
   private static DisplayMode[] displayModes = null;
   private static int antialiasingLevel = 0;
   private static int availableProcessors = 0;
   public static boolean zoomMode = false;
   public static boolean zoomSmoothCamera = false;
   private static int texturePackClouds = 0;
   public static boolean waterOpacityChanged = false;
   private static boolean fullscreenModeChecked = false;
   private static boolean desktopModeChecked = false;
   private static bna defaultResourcePackLazy = null;
   public static final Float DEF_ALPHA_FUNC_LEVEL = 0.1F;
   private static final Logger LOGGER = LogManager.getLogger();
   public static final boolean logDetail = System.getProperty("log.detail", "false").equals("true");
   private static String mcDebugLast = null;
   private static int fpsMinLast = 0;
   public static float renderPartialTicks;

   private Config() {
   }

   public static String getVersion() {
      return "OptiFine_1.8.9_HD_U_M6_pre2";
   }

   public static String getVersionDebug() {
      StringBuffer sb = new StringBuffer(32);
      if (isDynamicLights()) {
         sb.append("DL: ");
         sb.append(String.valueOf(DynamicLights.getCount()));
         sb.append(", ");
      }

      sb.append("OptiFine_1.8.9_HD_U_M6_pre2");
      String shaderPack = Shaders.getShaderPackName();
      if (shaderPack != null) {
         sb.append(", ");
         sb.append(shaderPack);
      }

      return sb.toString();
   }

   public static void initGameSettings(avh settings) {
      if (gameSettings == null) {
         gameSettings = settings;
         desktopDisplayMode = Display.getDesktopDisplayMode();
         updateAvailableProcessors();
         ReflectorForge.putLaunchBlackboard("optifine.ForgeSplashCompatible", Boolean.TRUE);
      }
   }

   public static void initDisplay() {
      checkInitialized();
      antialiasingLevel = gameSettings.ofAaLevel;
      checkDisplaySettings();
      checkDisplayMode();
      minecraftThread = Thread.currentThread();
      updateThreadPriorities();
      Shaders.startup(ave.A());
   }

   public static void checkInitialized() {
      if (!initialized) {
         if (Display.isCreated()) {
            initialized = true;
            checkOpenGlCaps();
            startVersionCheckThread();
         }
      }
   }

   private static void checkOpenGlCaps() {
      log("");
      log(getVersion());
      log("Build: " + getBuild());
      log("OS: " + System.getProperty("os.name") + " (" + System.getProperty("os.arch") + ") version " + System.getProperty("os.version"));
      log("Java: " + System.getProperty("java.version") + ", " + System.getProperty("java.vendor"));
      log("VM: " + System.getProperty("java.vm.name") + " (" + System.getProperty("java.vm.info") + "), " + System.getProperty("java.vm.vendor"));
      log("LWJGL: " + Sys.getVersion());
      openGlVersion = GL11.glGetString(7938);
      openGlRenderer = GL11.glGetString(7937);
      openGlVendor = GL11.glGetString(7936);
      log("OpenGL: " + openGlRenderer + ", version " + openGlVersion + ", " + openGlVendor);
      log("OpenGL Version: " + getOpenGlVersionString());
      if (!GLContext.getCapabilities().OpenGL12) {
         log("OpenGL Mipmap levels: Not available (GL12.GL_TEXTURE_MAX_LEVEL)");
      }

      fancyFogAvailable = GLContext.getCapabilities().GL_NV_fog_distance;
      if (!fancyFogAvailable) {
         log("OpenGL Fancy fog: Not available (GL_NV_fog_distance)");
      }

      occlusionAvailable = GLContext.getCapabilities().GL_ARB_occlusion_query;
      if (!occlusionAvailable) {
         log("OpenGL Occlussion culling: Not available (GL_ARB_occlusion_query)");
      }

      int maxTexSize = TextureUtils.getGLMaximumTextureSize();
      dbg("Maximum texture size: " + maxTexSize + "x" + maxTexSize);
   }

   public static String getBuild() {
      if (build == null) {
         try {
            InputStream in = Config.class.getResourceAsStream("/buildof.txt");
            if (in == null) {
               return null;
            }

            build = readLines(in)[0];
         } catch (Exception e) {
            warn("" + e.getClass().getName() + ": " + e.getMessage());
            build = "";
         }
      }

      return build;
   }

   public static boolean isFancyFogAvailable() {
      return fancyFogAvailable;
   }

   public static boolean isOcclusionAvailable() {
      return occlusionAvailable;
   }

   public static int getMinecraftVersionInt() {
      if (minecraftVersionInt < 0) {
         String[] verStrs = tokenize("1.8.9", ".");
         int ver = 0;
         if (verStrs.length > 0) {
            ver += 10000 * parseInt(verStrs[0], 0);
         }

         if (verStrs.length > 1) {
            ver += 100 * parseInt(verStrs[1], 0);
         }

         if (verStrs.length > 2) {
            ver += 1 * parseInt(verStrs[2], 0);
         }

         minecraftVersionInt = ver;
      }

      return minecraftVersionInt;
   }

   public static String getOpenGlVersionString() {
      GlVersion ver = getGlVersion();
      return "" + ver.getMajor() + "." + ver.getMinor() + "." + ver.getRelease();
   }

   private static GlVersion getGlVersionLwjgl() {
      if (GLContext.getCapabilities().OpenGL44) {
         return new GlVersion(4, 4);
      } else if (GLContext.getCapabilities().OpenGL43) {
         return new GlVersion(4, 3);
      } else if (GLContext.getCapabilities().OpenGL42) {
         return new GlVersion(4, 2);
      } else if (GLContext.getCapabilities().OpenGL41) {
         return new GlVersion(4, 1);
      } else if (GLContext.getCapabilities().OpenGL40) {
         return new GlVersion(4, 0);
      } else if (GLContext.getCapabilities().OpenGL33) {
         return new GlVersion(3, 3);
      } else if (GLContext.getCapabilities().OpenGL32) {
         return new GlVersion(3, 2);
      } else if (GLContext.getCapabilities().OpenGL31) {
         return new GlVersion(3, 1);
      } else if (GLContext.getCapabilities().OpenGL30) {
         return new GlVersion(3, 0);
      } else if (GLContext.getCapabilities().OpenGL21) {
         return new GlVersion(2, 1);
      } else if (GLContext.getCapabilities().OpenGL20) {
         return new GlVersion(2, 0);
      } else if (GLContext.getCapabilities().OpenGL15) {
         return new GlVersion(1, 5);
      } else if (GLContext.getCapabilities().OpenGL14) {
         return new GlVersion(1, 4);
      } else if (GLContext.getCapabilities().OpenGL13) {
         return new GlVersion(1, 3);
      } else if (GLContext.getCapabilities().OpenGL12) {
         return new GlVersion(1, 2);
      } else {
         return GLContext.getCapabilities().OpenGL11 ? new GlVersion(1, 1) : new GlVersion(1, 0);
      }
   }

   public static GlVersion getGlVersion() {
      if (glVersion == null) {
         String verStr = GL11.glGetString(7938);
         glVersion = parseGlVersion(verStr, null);
         if (glVersion == null) {
            glVersion = getGlVersionLwjgl();
         }

         if (glVersion == null) {
            glVersion = new GlVersion(1, 0);
         }
      }

      return glVersion;
   }

   public static GlVersion getGlslVersion() {
      if (glslVersion == null) {
         String verStr = GL11.glGetString(35724);
         glslVersion = parseGlVersion(verStr, null);
         if (glslVersion == null) {
            glslVersion = new GlVersion(1, 10);
         }
      }

      return glslVersion;
   }

   public static GlVersion parseGlVersion(String versionString, GlVersion def) {
      try {
         if (versionString == null) {
            return def;
         }

         Pattern REGEXP_VERSION = Pattern.compile("([0-9]+)\\.([0-9]+)(\\.([0-9]+))?(.+)?");
         Matcher matcher = REGEXP_VERSION.matcher(versionString);
         if (!matcher.matches()) {
            return def;
         }

         int major = Integer.parseInt(matcher.group(1));
         int minor = Integer.parseInt(matcher.group(2));
         int release = matcher.group(4) != null ? Integer.parseInt(matcher.group(4)) : 0;
         String suffix = matcher.group(5);
         return new GlVersion(major, minor, release, suffix);
      } catch (Exception e) {
         e.printStackTrace();
         return def;
      }
   }

   public static String[] getOpenGlExtensions() {
      if (openGlExtensions == null) {
         openGlExtensions = detectOpenGlExtensions();
      }

      return openGlExtensions;
   }

   private static String[] detectOpenGlExtensions() {
      try {
         GlVersion ver = getGlVersion();
         if (ver.getMajor() >= 3) {
            int countExt = GL11.glGetInteger(33309);
            if (countExt > 0) {
               String[] exts = new String[countExt];

               for (int i = 0; i < countExt; i++) {
                  exts[i] = GL30.glGetStringi(7939, i);
               }

               return exts;
            }
         }
      } catch (Exception e) {
         e.printStackTrace();
      }

      try {
         String extStr = GL11.glGetString(7939);
         return extStr.split(" ");
      } catch (Exception e) {
         e.printStackTrace();
         return new String[0];
      }
   }

   public static void updateThreadPriorities() {
      updateAvailableProcessors();
      int ELEVATED_PRIORITY = 8;
      if (isSingleProcessor()) {
         if (isSmoothWorld()) {
            minecraftThread.setPriority(10);
            setThreadPriority("Server thread", 1);
         } else {
            minecraftThread.setPriority(5);
            setThreadPriority("Server thread", 5);
         }
      } else {
         minecraftThread.setPriority(10);
         setThreadPriority("Server thread", 5);
      }
   }

   private static void setThreadPriority(String prefix, int priority) {
      try {
         ThreadGroup tg = Thread.currentThread().getThreadGroup();
         if (tg == null) {
            return;
         }

         int num = (tg.activeCount() + 10) * 2;
         Thread[] ts = new Thread[num];
         tg.enumerate(ts, false);

         for (int i = 0; i < ts.length; i++) {
            Thread t = ts[i];
            if (t != null && t.getName().startsWith(prefix)) {
               t.setPriority(priority);
            }
         }
      } catch (Throwable e) {
         warn(e.getClass().getName() + ": " + e.getMessage());
      }
   }

   public static boolean isMinecraftThread() {
      return Thread.currentThread() == minecraftThread;
   }

   private static void startVersionCheckThread() {
      VersionCheckThread vct = new VersionCheckThread();
      vct.start();
   }

   public static boolean isMipmaps() {
      return gameSettings.J > 0;
   }

   public static int getMipmapLevels() {
      return gameSettings.J;
   }

   public static int getMipmapType() {
      switch (gameSettings.ofMipmapType) {
         case 0:
            return 9986;
         case 1:
            return 9986;
         case 2:
            if (isMultiTexture()) {
               return 9985;
            }

            return 9986;
         case 3:
            if (isMultiTexture()) {
               return 9987;
            }

            return 9986;
         default:
            return 9986;
      }
   }

   public static boolean isUseAlphaFunc() {
      float alphaFuncLevel = getAlphaFuncLevel();
      return alphaFuncLevel > DEF_ALPHA_FUNC_LEVEL + 1.0E-5F;
   }

   public static float getAlphaFuncLevel() {
      return DEF_ALPHA_FUNC_LEVEL;
   }

   public static boolean isFogFancy() {
      return !isFancyFogAvailable() ? false : gameSettings.ofFogType == 2;
   }

   public static boolean isFogFast() {
      return gameSettings.ofFogType == 1;
   }

   public static boolean isFogOff() {
      return gameSettings.ofFogType == 3;
   }

   public static boolean isFogOn() {
      return gameSettings.ofFogType != 3;
   }

   public static float getFogStart() {
      return gameSettings.ofFogStart;
   }

   public static void detail(String s) {
      if (logDetail) {
         LOGGER.info("[OptiFine] " + s);
      }
   }

   public static void dbg(String s) {
      LOGGER.info("[OptiFine] " + s);
   }

   public static void warn(String s) {
      LOGGER.warn("[OptiFine] " + s);
   }

   public static void error(String s) {
      LOGGER.error("[OptiFine] " + s);
   }

   public static void log(String s) {
      dbg(s);
   }

   public static int getUpdatesPerFrame() {
      return gameSettings.ofChunkUpdates;
   }

   public static boolean isDynamicUpdates() {
      return gameSettings.ofChunkUpdatesDynamic;
   }

   public static boolean isRainFancy() {
      return gameSettings.ofRain == 0 ? gameSettings.i : gameSettings.ofRain == 2;
   }

   public static boolean isRainOff() {
      return gameSettings.ofRain == 3;
   }

   public static boolean isCloudsFancy() {
      if (gameSettings.ofClouds != 0) {
         return gameSettings.ofClouds == 2;
      } else if (isShaders() && !Shaders.shaderPackClouds.isDefault()) {
         return Shaders.shaderPackClouds.isFancy();
      } else {
         return texturePackClouds != 0 ? texturePackClouds == 2 : gameSettings.i;
      }
   }

   public static boolean isCloudsOff() {
      if (gameSettings.ofClouds != 0) {
         return gameSettings.ofClouds == 3;
      } else if (isShaders() && !Shaders.shaderPackClouds.isDefault()) {
         return Shaders.shaderPackClouds.isOff();
      } else {
         return texturePackClouds != 0 ? texturePackClouds == 3 : false;
      }
   }

   public static void updateTexturePackClouds() {
      texturePackClouds = 0;
      bni rm = getResourceManager();
      if (rm != null) {
         try {
            InputStream in = rm.a(new jy("mcpatcher/color.properties")).b();
            if (in == null) {
               return;
            }

            Properties props = new PropertiesOrdered();
            props.load(in);
            in.close();
            String cloudStr = props.getProperty("clouds");
            if (cloudStr == null) {
               return;
            }

            dbg("Texture pack clouds: " + cloudStr);
            cloudStr = cloudStr.toLowerCase();
            if (cloudStr.equals("fast")) {
               texturePackClouds = 1;
            }

            if (cloudStr.equals("fancy")) {
               texturePackClouds = 2;
            }

            if (cloudStr.equals("off")) {
               texturePackClouds = 3;
            }
         } catch (Exception e) {
         }
      }
   }

   public static bou getModelManager() {
      return minecraft.ag().modelManager;
   }

   public static boolean isTreesFancy() {
      return gameSettings.ofTrees == 0 ? gameSettings.i : gameSettings.ofTrees != 1;
   }

   public static boolean isTreesSmart() {
      return gameSettings.ofTrees == 4;
   }

   public static boolean isCullFacesLeaves() {
      return gameSettings.ofTrees == 0 ? !gameSettings.i : gameSettings.ofTrees == 4;
   }

   public static boolean isDroppedItemsFancy() {
      return gameSettings.ofDroppedItems == 0 ? gameSettings.i : gameSettings.ofDroppedItems == 2;
   }

   public static int limit(int val, int min, int max) {
      if (val < min) {
         return min;
      } else {
         return val > max ? max : val;
      }
   }

   public static float limit(float val, float min, float max) {
      if (val < min) {
         return min;
      } else {
         return val > max ? max : val;
      }
   }

   public static double limit(double val, double min, double max) {
      if (val < min) {
         return min;
      } else {
         return val > max ? max : val;
      }
   }

   public static float limitTo1(float val) {
      if (val < 0.0F) {
         return 0.0F;
      } else {
         return val > 1.0F ? 1.0F : val;
      }
   }

   public static boolean isAnimatedWater() {
      return gameSettings.ofAnimatedWater != 2;
   }

   public static boolean isGeneratedWater() {
      return gameSettings.ofAnimatedWater == 1;
   }

   public static boolean isAnimatedPortal() {
      return gameSettings.ofAnimatedPortal;
   }

   public static boolean isAnimatedLava() {
      return gameSettings.ofAnimatedLava != 2;
   }

   public static boolean isGeneratedLava() {
      return gameSettings.ofAnimatedLava == 1;
   }

   public static boolean isAnimatedFire() {
      return gameSettings.ofAnimatedFire;
   }

   public static boolean isAnimatedRedstone() {
      return gameSettings.ofAnimatedRedstone;
   }

   public static boolean isAnimatedExplosion() {
      return gameSettings.ofAnimatedExplosion;
   }

   public static boolean isAnimatedFlame() {
      return gameSettings.ofAnimatedFlame;
   }

   public static boolean isAnimatedSmoke() {
      return gameSettings.ofAnimatedSmoke;
   }

   public static boolean isVoidParticles() {
      return gameSettings.ofVoidParticles;
   }

   public static boolean isWaterParticles() {
      return gameSettings.ofWaterParticles;
   }

   public static boolean isRainSplash() {
      return gameSettings.ofRainSplash;
   }

   public static boolean isPortalParticles() {
      return gameSettings.ofPortalParticles;
   }

   public static boolean isPotionParticles() {
      return gameSettings.ofPotionParticles;
   }

   public static boolean isFireworkParticles() {
      return gameSettings.ofFireworkParticles;
   }

   public static float getAmbientOcclusionLevel() {
      return isShaders() && Shaders.aoLevel >= 0.0F ? Shaders.aoLevel : gameSettings.ofAoLevel;
   }

   public static String listToString(List list) {
      return listToString(list, ", ");
   }

   public static String listToString(List list, String separator) {
      if (list == null) {
         return "";
      }

      StringBuffer buf = new StringBuffer(list.size() * 5);

      for (int i = 0; i < list.size(); i++) {
         Object obj = list.get(i);
         if (i > 0) {
            buf.append(separator);
         }

         buf.append(String.valueOf(obj));
      }

      return buf.toString();
   }

   public static String arrayToString(Object[] arr) {
      return arrayToString(arr, ", ");
   }

   public static String arrayToString(Object[] arr, String separator) {
      if (arr == null) {
         return "";
      }

      StringBuffer buf = new StringBuffer(arr.length * 5);

      for (int i = 0; i < arr.length; i++) {
         Object obj = arr[i];
         if (i > 0) {
            buf.append(separator);
         }

         buf.append(String.valueOf(obj));
      }

      return buf.toString();
   }

   public static String arrayToString(int[] arr) {
      return arrayToString(arr, ", ");
   }

   public static String arrayToString(int[] arr, String separator) {
      if (arr == null) {
         return "";
      }

      StringBuffer buf = new StringBuffer(arr.length * 5);

      for (int i = 0; i < arr.length; i++) {
         int x = arr[i];
         if (i > 0) {
            buf.append(separator);
         }

         buf.append(String.valueOf(x));
      }

      return buf.toString();
   }

   public static String arrayToString(float[] arr) {
      return arrayToString(arr, ", ");
   }

   public static String arrayToString(float[] arr, String separator) {
      if (arr == null) {
         return "";
      }

      StringBuffer buf = new StringBuffer(arr.length * 5);

      for (int i = 0; i < arr.length; i++) {
         float x = arr[i];
         if (i > 0) {
            buf.append(separator);
         }

         buf.append(String.valueOf(x));
      }

      return buf.toString();
   }

   public static ave getMinecraft() {
      return minecraft;
   }

   public static bmj getTextureManager() {
      return minecraft.P();
   }

   public static bni getResourceManager() {
      return minecraft.Q();
   }

   public static InputStream getResourceStream(jy location) throws IOException {
      return getResourceStream(minecraft.Q(), location);
   }

   public static InputStream getResourceStream(bni resourceManager, jy location) throws IOException {
      bnh res = resourceManager.a(location);
      return res == null ? null : res.b();
   }

   public static bnh getResource(jy location) throws IOException {
      return minecraft.Q().a(location);
   }

   public static boolean hasResource(jy location) {
      if (location == null) {
         return false;
      }

      bnk rp = getDefiningResourcePack(location);
      return rp != null;
   }

   public static boolean hasResource(bni resourceManager, jy location) {
      try {
         bnh res = resourceManager.a(location);
         return res != null;
      } catch (IOException e) {
         return false;
      }
   }

   public static bnk[] getResourcePacks() {
      bnm rep = minecraft.R();
      List entries = rep.c();
      List list = new ArrayList();

      for (a entry : entries) {
         list.add(entry.c());
      }

      if (rep.e() != null) {
         list.add(rep.e());
      }

      bnk[] rps = list.toArray(new bnk[list.size()]);
      return rps;
   }

   public static String getResourcePackNames() {
      if (minecraft.R() == null) {
         return "";
      }

      bnk[] rps = getResourcePacks();
      if (rps.length <= 0) {
         return getDefaultResourcePack().b();
      }

      String[] names = new String[rps.length];

      for (int i = 0; i < rps.length; i++) {
         names[i] = rps[i].b();
      }

      return arrayToString(names);
   }

   public static bna getDefaultResourcePack() {
      if (defaultResourcePackLazy == null) {
         ave mc = ave.A();
         defaultResourcePackLazy = (bna)Reflector.getFieldValue(mc, Reflector.Minecraft_defaultResourcePack);
         if (defaultResourcePackLazy == null) {
            bnm repository = mc.R();
            if (repository != null) {
               defaultResourcePackLazy = (bna)repository.a;
            }
         }
      }

      return defaultResourcePackLazy;
   }

   public static boolean isFromDefaultResourcePack(jy loc) {
      bnk rp = getDefiningResourcePack(loc);
      return rp == getDefaultResourcePack();
   }

   public static bnk getDefiningResourcePack(jy location) {
      bnm rep = minecraft.R();
      bnk serverRp = rep.e();
      if (serverRp != null && serverRp.b(location)) {
         return serverRp;
      }

      List<a> entries = rep.k;

      for (int i = entries.size() - 1; i >= 0; i--) {
         a entry = entries.get(i);
         bnk rp = entry.c();
         if (rp.b(location)) {
            return rp;
         }
      }

      return getDefaultResourcePack().b(location) ? getDefaultResourcePack() : null;
   }

   public static bfr getRenderGlobal() {
      return minecraft.g;
   }

   public static boolean isBetterGrass() {
      return gameSettings.ofBetterGrass != 3;
   }

   public static boolean isBetterGrassFancy() {
      return gameSettings.ofBetterGrass == 2;
   }

   public static boolean isWeatherEnabled() {
      return gameSettings.ofWeather;
   }

   public static boolean isSkyEnabled() {
      return gameSettings.ofSky;
   }

   public static boolean isSunMoonEnabled() {
      return gameSettings.ofSunMoon;
   }

   public static boolean isSunTexture() {
      return !isSunMoonEnabled() ? false : !isShaders() || Shaders.isSun();
   }

   public static boolean isMoonTexture() {
      return !isSunMoonEnabled() ? false : !isShaders() || Shaders.isMoon();
   }

   public static boolean isVignetteEnabled() {
      if (isShaders() && !Shaders.isVignette()) {
         return false;
      } else {
         return gameSettings.ofVignette == 0 ? gameSettings.i : gameSettings.ofVignette == 2;
      }
   }

   public static boolean isStarsEnabled() {
      return gameSettings.ofStars;
   }

   public static void sleep(long ms) {
      try {
         Thread.sleep(ms);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
   }

   public static boolean isTimeDayOnly() {
      return gameSettings.ofTime == 1;
   }

   public static boolean isTimeDefault() {
      return gameSettings.ofTime == 0;
   }

   public static boolean isTimeNightOnly() {
      return gameSettings.ofTime == 2;
   }

   public static boolean isClearWater() {
      return gameSettings.ofClearWater;
   }

   public static int getAnisotropicFilterLevel() {
      return gameSettings.ofAfLevel;
   }

   public static boolean isAnisotropicFiltering() {
      return getAnisotropicFilterLevel() > 1;
   }

   public static int getAntialiasingLevel() {
      return antialiasingLevel;
   }

   public static boolean isAntialiasing() {
      return getAntialiasingLevel() > 0;
   }

   public static boolean isAntialiasingConfigured() {
      return getGameSettings().ofAaLevel > 0;
   }

   public static boolean isMultiTexture() {
      return getAnisotropicFilterLevel() > 1 ? true : getAntialiasingLevel() > 0;
   }

   public static boolean between(int val, int min, int max) {
      return val >= min && val <= max;
   }

   public static boolean between(float val, float min, float max) {
      return val >= min && val <= max;
   }

   public static boolean isDrippingWaterLava() {
      return gameSettings.ofDrippingWaterLava;
   }

   public static boolean isBetterSnow() {
      return gameSettings.ofBetterSnow;
   }

   public static Dimension getFullscreenDimension() {
      if (desktopDisplayMode == null) {
         return null;
      }

      if (gameSettings == null) {
         return new Dimension(desktopDisplayMode.getWidth(), desktopDisplayMode.getHeight());
      }

      String dimStr = gameSettings.ofFullscreenMode;
      if (dimStr.equals("Default")) {
         return new Dimension(desktopDisplayMode.getWidth(), desktopDisplayMode.getHeight());
      }

      String[] dimStrs = tokenize(dimStr, " x");
      return dimStrs.length < 2
         ? new Dimension(desktopDisplayMode.getWidth(), desktopDisplayMode.getHeight())
         : new Dimension(parseInt(dimStrs[0], -1), parseInt(dimStrs[1], -1));
   }

   public static int parseInt(String str, int defVal) {
      try {
         if (str == null) {
            return defVal;
         }

         str = str.trim();
         return Integer.parseInt(str);
      } catch (NumberFormatException e) {
         return defVal;
      }
   }

   public static float parseFloat(String str, float defVal) {
      try {
         if (str == null) {
            return defVal;
         }

         str = str.trim();
         return Float.parseFloat(str);
      } catch (NumberFormatException e) {
         return defVal;
      }
   }

   public static boolean parseBoolean(String str, boolean defVal) {
      try {
         if (str == null) {
            return defVal;
         }

         str = str.trim();
         return Boolean.parseBoolean(str);
      } catch (NumberFormatException e) {
         return defVal;
      }
   }

   public static Boolean parseBoolean(String str, Boolean defVal) {
      try {
         if (str == null) {
            return defVal;
         } else {
            str = str.trim().toLowerCase();
            if (str.equals("true")) {
               return Boolean.TRUE;
            } else {
               return str.equals("false") ? Boolean.FALSE : defVal;
            }
         }
      } catch (NumberFormatException e) {
         return defVal;
      }
   }

   public static String[] tokenize(String str, String delim) {
      StringTokenizer tok = new StringTokenizer(str, delim);
      List list = new ArrayList();

      while (tok.hasMoreTokens()) {
         String token = tok.nextToken();
         list.add(token);
      }

      return list.toArray(new String[list.size()]);
   }

   public static DisplayMode getDesktopDisplayMode() {
      return desktopDisplayMode;
   }

   public static DisplayMode[] getDisplayModes() {
      if (displayModes == null) {
         try {
            DisplayMode[] modes = Display.getAvailableDisplayModes();
            Set<Dimension> setDimensions = getDisplayModeDimensions(modes);
            List list = new ArrayList();

            for (Dimension dim : setDimensions) {
               DisplayMode[] dimModes = getDisplayModes(modes, dim);
               DisplayMode dm = getDisplayMode(dimModes, desktopDisplayMode);
               if (dm != null) {
                  list.add(dm);
               }
            }

            DisplayMode[] fsModes = list.toArray(new DisplayMode[list.size()]);
            Arrays.sort(fsModes, new DisplayModeComparator());
            return fsModes;
         } catch (Exception e) {
            e.printStackTrace();
            displayModes = new DisplayMode[]{desktopDisplayMode};
         }
      }

      return displayModes;
   }

   public static DisplayMode getLargestDisplayMode() {
      DisplayMode[] modes = getDisplayModes();
      if (modes != null && modes.length >= 1) {
         DisplayMode mode = modes[modes.length - 1];
         if (desktopDisplayMode.getWidth() > mode.getWidth()) {
            return desktopDisplayMode;
         } else {
            return desktopDisplayMode.getWidth() == mode.getWidth() && desktopDisplayMode.getHeight() > mode.getHeight() ? desktopDisplayMode : mode;
         }
      } else {
         return desktopDisplayMode;
      }
   }

   private static Set<Dimension> getDisplayModeDimensions(DisplayMode[] modes) {
      Set<Dimension> set = new HashSet<>();

      for (int i = 0; i < modes.length; i++) {
         DisplayMode mode = modes[i];
         Dimension dim = new Dimension(mode.getWidth(), mode.getHeight());
         set.add(dim);
      }

      return set;
   }

   private static DisplayMode[] getDisplayModes(DisplayMode[] modes, Dimension dim) {
      List list = new ArrayList();

      for (int i = 0; i < modes.length; i++) {
         DisplayMode mode = modes[i];
         if (mode.getWidth() == dim.getWidth() && mode.getHeight() == dim.getHeight()) {
            list.add(mode);
         }
      }

      return list.toArray(new DisplayMode[list.size()]);
   }

   private static DisplayMode getDisplayMode(DisplayMode[] modes, DisplayMode desktopMode) {
      if (desktopMode != null) {
         for (int i = 0; i < modes.length; i++) {
            DisplayMode mode = modes[i];
            if (mode.getBitsPerPixel() == desktopMode.getBitsPerPixel() && mode.getFrequency() == desktopMode.getFrequency()) {
               return mode;
            }
         }
      }

      if (modes.length <= 0) {
         return null;
      }

      Arrays.sort(modes, new DisplayModeComparator());
      return modes[modes.length - 1];
   }

   public static String[] getDisplayModeNames() {
      DisplayMode[] modes = getDisplayModes();
      String[] names = new String[modes.length];

      for (int i = 0; i < modes.length; i++) {
         DisplayMode mode = modes[i];
         String name = "" + mode.getWidth() + "x" + mode.getHeight();
         names[i] = name;
      }

      return names;
   }

   public static DisplayMode getDisplayMode(Dimension dim) throws LWJGLException {
      DisplayMode[] modes = getDisplayModes();

      for (int i = 0; i < modes.length; i++) {
         DisplayMode dm = modes[i];
         if (dm.getWidth() == dim.width && dm.getHeight() == dim.height) {
            return dm;
         }
      }

      return desktopDisplayMode;
   }

   public static boolean isAnimatedTerrain() {
      return gameSettings.ofAnimatedTerrain;
   }

   public static boolean isAnimatedTextures() {
      return gameSettings.ofAnimatedTextures;
   }

   public static boolean isSwampColors() {
      return gameSettings.ofSwampColors;
   }

   public static boolean isRandomEntities() {
      return gameSettings.ofRandomEntities;
   }

   public static void checkGlError(String loc) {
      int errorCode = bfl.glGetError();
      if (errorCode != 0 && GlErrors.isEnabled(errorCode)) {
         String errorText = getGlErrorString(errorCode);
         String messageLog = String.format("OpenGL error: %s (%s), at: %s", errorCode, errorText, loc);
         error(messageLog);
         if (isShowGlErrors() && TimedEvent.isActive("ShowGlError", 10000L)) {
            String message = bnq.a("of.message.openglError", new Object[]{errorCode, errorText});
            minecraft.q.d().a(new fa(message));
         }
      }
   }

   public static boolean isSmoothBiomes() {
      return gameSettings.ofSmoothBiomes;
   }

   public static boolean isCustomColors() {
      return gameSettings.ofCustomColors;
   }

   public static boolean isCustomSky() {
      return gameSettings.ofCustomSky;
   }

   public static boolean isCustomFonts() {
      return gameSettings.ofCustomFonts;
   }

   public static boolean isShowCapes() {
      return gameSettings.ofShowCapes;
   }

   public static boolean isConnectedTextures() {
      return gameSettings.ofConnectedTextures != 3;
   }

   public static boolean isNaturalTextures() {
      return gameSettings.ofNaturalTextures;
   }

   public static boolean isEmissiveTextures() {
      return gameSettings.ofEmissiveTextures;
   }

   public static boolean isConnectedTexturesFancy() {
      return gameSettings.ofConnectedTextures == 2;
   }

   public static boolean isFastRender() {
      return gameSettings.ofFastRender;
   }

   public static boolean isTranslucentBlocksFancy() {
      return gameSettings.ofTranslucentBlocks == 0 ? gameSettings.i : gameSettings.ofTranslucentBlocks == 2;
   }

   public static boolean isShaders() {
      return Shaders.shaderPackLoaded;
   }

   public static String[] readLines(File file) throws IOException {
      FileInputStream fis = new FileInputStream(file);
      return readLines(fis);
   }

   public static String[] readLines(InputStream is) throws IOException {
      List list = new ArrayList();
      InputStreamReader isr = new InputStreamReader(is, "ASCII");
      BufferedReader br = new BufferedReader(isr);

      while (true) {
         String line = br.readLine();
         if (line == null) {
            return list.toArray(new String[list.size()]);
         }

         list.add(line);
      }
   }

   public static String readFile(File file) throws IOException {
      FileInputStream fin = new FileInputStream(file);
      return readInputStream(fin, "ASCII");
   }

   public static String readInputStream(InputStream in) throws IOException {
      return readInputStream(in, "ASCII");
   }

   public static String readInputStream(InputStream in, String encoding) throws IOException {
      InputStreamReader inr = new InputStreamReader(in, encoding);
      BufferedReader br = new BufferedReader(inr);
      StringBuffer sb = new StringBuffer();

      while (true) {
         String line = br.readLine();
         if (line == null) {
            return sb.toString();
         }

         sb.append(line);
         sb.append("\n");
      }
   }

   public static byte[] readAll(InputStream is) throws IOException {
      ByteArrayOutputStream baos = new ByteArrayOutputStream();
      byte[] buf = new byte[1024];

      while (true) {
         int len = is.read(buf);
         if (len < 0) {
            is.close();
            return baos.toByteArray();
         }

         baos.write(buf, 0, len);
      }
   }

   public static avh getGameSettings() {
      return gameSettings;
   }

   public static String getNewRelease() {
      return newRelease;
   }

   public static void setNewRelease(String newRelease) {
      Config.newRelease = newRelease;
   }

   public static int compareRelease(String rel1, String rel2) {
      String[] rels1 = splitRelease(rel1);
      String[] rels2 = splitRelease(rel2);
      String branch1 = rels1[0];
      String branch2 = rels2[0];
      if (!branch1.equals(branch2)) {
         return branch1.compareTo(branch2);
      }

      int rev1 = parseInt(rels1[1], -1);
      int rev2 = parseInt(rels2[1], -1);
      if (rev1 != rev2) {
         return rev1 - rev2;
      }

      String suf1 = rels1[2];
      String suf2 = rels2[2];
      if (!suf1.equals(suf2)) {
         if (suf1.isEmpty()) {
            return 1;
         }

         if (suf2.isEmpty()) {
            return -1;
         }
      }

      return suf1.compareTo(suf2);
   }

   private static String[] splitRelease(String relStr) {
      if (relStr != null && relStr.length() > 0) {
         Pattern p = Pattern.compile("([A-Z])([0-9]+)(.*)");
         Matcher m = p.matcher(relStr);
         if (!m.matches()) {
            return new String[]{"", "", ""};
         }

         String branch = normalize(m.group(1));
         String revision = normalize(m.group(2));
         String suffix = normalize(m.group(3));
         return new String[]{branch, revision, suffix};
      } else {
         return new String[]{"", "", ""};
      }
   }

   public static int intHash(int x) {
      x = x ^ 61 ^ x >> 16;
      x += x << 3;
      x ^= x >> 4;
      x *= 668265261;
      return x ^ x >> 15;
   }

   public static int getRandom(cj blockPos, int face) {
      int rand = intHash(face + 37);
      rand = intHash(rand + blockPos.n());
      rand = intHash(rand + blockPos.p());
      return intHash(rand + blockPos.o());
   }

   public static int getAvailableProcessors() {
      return availableProcessors;
   }

   public static void updateAvailableProcessors() {
      availableProcessors = Runtime.getRuntime().availableProcessors();
   }

   public static boolean isSingleProcessor() {
      return getAvailableProcessors() <= 1;
   }

   public static boolean isSmoothWorld() {
      return gameSettings.ofSmoothWorld;
   }

   public static boolean isLazyChunkLoading() {
      return gameSettings.ofLazyChunkLoading;
   }

   public static boolean isDynamicFov() {
      return gameSettings.ofDynamicFov;
   }

   public static boolean isAlternateBlocks() {
      return gameSettings.ofAlternateBlocks;
   }

   public static int getChunkViewDistance() {
      return gameSettings == null ? 10 : gameSettings.c;
   }

   public static boolean equals(Object o1, Object o2) {
      if (o1 == o2) {
         return true;
      } else {
         return o1 == null ? false : o1.equals(o2);
      }
   }

   public static boolean equalsOne(Object a, Object[] bs) {
      if (bs == null) {
         return false;
      }

      for (int i = 0; i < bs.length; i++) {
         Object b = bs[i];
         if (equals(a, b)) {
            return true;
         }
      }

      return false;
   }

   public static boolean equalsOne(int val, int[] vals) {
      for (int i = 0; i < vals.length; i++) {
         if (vals[i] == val) {
            return true;
         }
      }

      return false;
   }

   public static boolean isSameOne(Object a, Object[] bs) {
      if (bs == null) {
         return false;
      }

      for (int i = 0; i < bs.length; i++) {
         Object b = bs[i];
         if (a == b) {
            return true;
         }
      }

      return false;
   }

   public static String normalize(String s) {
      return s == null ? "" : s;
   }

   public static void checkDisplaySettings() {
      int samples = getAntialiasingLevel();
      if (samples > 0) {
         DisplayMode displayMode = Display.getDisplayMode();
         dbg("FSAA Samples: " + samples);

         try {
            Display.destroy();
            Display.setDisplayMode(displayMode);
            Display.create(new PixelFormat().withDepthBits(24).withSamples(samples));
            if (g.a() == g.a.c) {
               Display.setResizable(false);
               Display.setResizable(true);
            }
         } catch (LWJGLException e) {
            warn("Error setting FSAA: " + samples + "x");
            e.printStackTrace();

            try {
               Display.setDisplayMode(displayMode);
               Display.create(new PixelFormat().withDepthBits(24));
               if (g.a() == g.a.c) {
                  Display.setResizable(false);
                  Display.setResizable(true);
               }
            } catch (LWJGLException e2) {
               e2.printStackTrace();

               try {
                  Display.setDisplayMode(displayMode);
                  Display.create();
                  if (g.a() == g.a.c) {
                     Display.setResizable(false);
                     Display.setResizable(true);
                  }
               } catch (LWJGLException e3) {
                  e3.printStackTrace();
               }
            }
         }

         if (!ave.a && getDefaultResourcePack() != null) {
            InputStream var2 = null;
            InputStream var3 = null;

            try {
               var2 = getDefaultResourcePack().c(new jy("icons/icon_16x16.png"));
               var3 = getDefaultResourcePack().c(new jy("icons/icon_32x32.png"));
               if (var2 != null && var3 != null) {
                  Display.setIcon(new ByteBuffer[]{readIconImage(var2), readIconImage(var3)});
               }
            } catch (IOException var8) {
               warn("Error setting window icon: " + var8.getClass().getName() + ": " + var8.getMessage());
            } finally {
               IOUtils.closeQuietly(var2);
               IOUtils.closeQuietly(var3);
            }
         }
      }
   }

   private static ByteBuffer readIconImage(InputStream is) throws IOException {
      BufferedImage var2 = ImageIO.read(is);
      int[] var3 = var2.getRGB(0, 0, var2.getWidth(), var2.getHeight(), (int[])null, 0, var2.getWidth());
      ByteBuffer var4 = ByteBuffer.allocate(4 * var3.length);
      int[] var5 = var3;
      int var6 = var3.length;

      for (int var7 = 0; var7 < var6; var7++) {
         int var8 = var5[var7];
         var4.putInt(var8 << 8 | var8 >> 24 & 0xFF);
      }

      ((Buffer)var4).flip();
      return var4;
   }

   public static void checkDisplayMode() {
      try {
         if (minecraft.K()) {
            if (fullscreenModeChecked) {
               return;
            }

            fullscreenModeChecked = true;
            desktopModeChecked = false;
            DisplayMode mode = Display.getDisplayMode();
            Dimension dim = getFullscreenDimension();
            if (dim == null) {
               return;
            }

            if (mode.getWidth() == dim.width && mode.getHeight() == dim.height) {
               return;
            }

            DisplayMode newMode = getDisplayMode(dim);
            if (newMode == null) {
               return;
            }

            Display.setDisplayMode(newMode);
            minecraft.d = Display.getDisplayMode().getWidth();
            minecraft.e = Display.getDisplayMode().getHeight();
            if (minecraft.d <= 0) {
               minecraft.d = 1;
            }

            if (minecraft.e <= 0) {
               minecraft.e = 1;
            }

            if (minecraft.m != null) {
               avr sr = new avr(minecraft);
               int sw = sr.a();
               int sh = sr.b();
               minecraft.m.a(minecraft, sw, sh);
            }

            updateFramebufferSize();
            Display.setFullscreen(true);
            minecraft.t.updateVSync();
            bfl.w();
         } else {
            if (desktopModeChecked) {
               return;
            }

            desktopModeChecked = true;
            fullscreenModeChecked = false;
            minecraft.t.updateVSync();
            Display.update();
            bfl.w();
            if (g.a() == g.a.c) {
               Display.setResizable(false);
               Display.setResizable(true);
            }
         }
      } catch (Exception e) {
         e.printStackTrace();
         gameSettings.ofFullscreenMode = "Default";
         gameSettings.saveOfOptions();
      }
   }

   public static void updateFramebufferSize() {
      minecraft.b().a(minecraft.d, minecraft.e);
      if (minecraft.o != null) {
         minecraft.o.a(minecraft.d, minecraft.e);
      }

      minecraft.n = new avi(minecraft);
   }

   public static Object[] addObjectToArray(Object[] arr, Object obj) {
      if (arr == null) {
         throw new NullPointerException("The given array is NULL");
      }

      int arrLen = arr.length;
      int newLen = arrLen + 1;
      Object[] newArr = (Object[])Array.newInstance(arr.getClass().getComponentType(), newLen);
      System.arraycopy(arr, 0, newArr, 0, arrLen);
      newArr[arrLen] = obj;
      return newArr;
   }

   public static Object[] addObjectToArray(Object[] arr, Object obj, int index) {
      List list = new ArrayList<>(Arrays.asList(arr));
      list.add(index, obj);
      Object[] newArr = (Object[])Array.newInstance(arr.getClass().getComponentType(), list.size());
      return list.toArray(newArr);
   }

   public static Object[] addObjectsToArray(Object[] arr, Object[] objs) {
      if (arr == null) {
         throw new NullPointerException("The given array is NULL");
      }

      if (objs.length == 0) {
         return arr;
      }

      int arrLen = arr.length;
      int newLen = arrLen + objs.length;
      Object[] newArr = (Object[])Array.newInstance(arr.getClass().getComponentType(), newLen);
      System.arraycopy(arr, 0, newArr, 0, arrLen);
      System.arraycopy(objs, 0, newArr, arrLen, objs.length);
      return newArr;
   }

   public static Object[] removeObjectFromArray(Object[] arr, Object obj) {
      List list = new ArrayList<>(Arrays.asList(arr));
      list.remove(obj);
      return collectionToArray(list, arr.getClass().getComponentType());
   }

   public static Object[] collectionToArray(Collection coll, Class elementClass) {
      if (coll == null) {
         return null;
      }

      if (elementClass == null) {
         return null;
      }

      if (elementClass.isPrimitive()) {
         throw new IllegalArgumentException("Can not make arrays with primitive elements (int, double), element class: " + elementClass);
      }

      Object[] array = (Object[])Array.newInstance(elementClass, coll.size());
      return coll.toArray(array);
   }

   public static boolean isCustomItems() {
      return gameSettings.ofCustomItems;
   }

   public static void drawFps() {
      int fps = ave.ai();
      String updates = getUpdates(minecraft.C);
      int renderersActive = minecraft.g.getCountActiveRenderers();
      int entities = minecraft.g.getCountEntitiesRendered();
      int tileEntities = minecraft.g.getCountTileEntitiesRendered();
      String fpsStr = "" + fps + "/" + getFpsMin() + " fps, C: " + renderersActive + ", E: " + entities + "+" + tileEntities + ", U: " + updates;
      minecraft.k.a(fpsStr, 2, 2, -2039584);
   }

   public static int getFpsMin() {
      if (minecraft.C == mcDebugLast) {
         return fpsMinLast;
      }

      mcDebugLast = minecraft.C;
      nh ft = minecraft.aj();
      long[] frames = ft.c();
      int index = ft.b();
      int indexEnd = ft.a();
      if (index == indexEnd) {
         return fpsMinLast;
      }

      int fps = ave.ai();
      if (fps <= 0) {
         fps = 1;
      }

      long timeAvgNs = (long)(1.0 / fps * 1.0E9);
      long timeMaxNs = timeAvgNs;
      long timeTotalNs = 0L;

      for (int ix = ns.b(index - 1, frames.length); ix != indexEnd && timeTotalNs < 1.0E9; ix = ns.b(ix - 1, frames.length)) {
         long timeNs = frames[ix];
         if (timeNs > timeMaxNs) {
            timeMaxNs = timeNs;
         }

         timeTotalNs += timeNs;
      }

      double timeMaxSec = timeMaxNs / 1.0E9;
      fpsMinLast = (int)(1.0 / timeMaxSec);
      return fpsMinLast;
   }

   private static String getUpdates(String str) {
      int pos1 = str.indexOf(40);
      if (pos1 < 0) {
         return "";
      }

      int pos2 = str.indexOf(32, pos1);
      return pos2 < 0 ? "" : str.substring(pos1 + 1, pos2);
   }

   public static int getBitsOs() {
      String progFiles86 = System.getenv("ProgramFiles(X86)");
      return progFiles86 != null ? 64 : 32;
   }

   public static int getBitsJre() {
      String[] propNames = new String[]{"sun.arch.data.model", "com.ibm.vm.bitmode", "os.arch"};

      for (int i = 0; i < propNames.length; i++) {
         String propName = propNames[i];
         String propVal = System.getProperty(propName);
         if (propVal != null && propVal.contains("64")) {
            return 64;
         }
      }

      return 32;
   }

   public static boolean isNotify64BitJava() {
      return notify64BitJava;
   }

   public static void setNotify64BitJava(boolean flag) {
      notify64BitJava = flag;
   }

   public static boolean isConnectedModels() {
      return false;
   }

   public static void showGuiMessage(String line1, String line2) {
      GuiMessage gui = new GuiMessage(minecraft.m, line1, line2);
      minecraft.a(gui);
   }

   public static int[] addIntToArray(int[] intArray, int intValue) {
      return addIntsToArray(intArray, new int[]{intValue});
   }

   public static int[] addIntsToArray(int[] intArray, int[] copyFrom) {
      if (intArray != null && copyFrom != null) {
         int arrLen = intArray.length;
         int newLen = arrLen + copyFrom.length;
         int[] newArray = new int[newLen];
         System.arraycopy(intArray, 0, newArray, 0, arrLen);

         for (int index = 0; index < copyFrom.length; index++) {
            newArray[index + arrLen] = copyFrom[index];
         }

         return newArray;
      } else {
         throw new NullPointerException("The given array is NULL");
      }
   }

   public static blz getMojangLogoTexture(blz texDefault) {
      try {
         jy locationMojangPng = new jy("textures/gui/title/mojang.png");
         InputStream in = getResourceStream(locationMojangPng);
         if (in == null) {
            return texDefault;
         }

         BufferedImage bi = ImageIO.read(in);
         return bi == null ? texDefault : new blz(bi);
      } catch (Exception e) {
         warn(e.getClass().getName() + ": " + e.getMessage());
         return texDefault;
      }
   }

   public static void writeFile(File file, String str) throws IOException {
      FileOutputStream fos = new FileOutputStream(file);
      byte[] bytes = str.getBytes("ASCII");
      fos.write(bytes);
      fos.close();
   }

   public static bmh getTextureMap() {
      return getMinecraft().T();
   }

   public static boolean isDynamicLights() {
      return gameSettings.ofDynamicLights != 3;
   }

   public static boolean isDynamicLightsFast() {
      return gameSettings.ofDynamicLights == 1;
   }

   public static boolean isDynamicHandLight() {
      if (!isDynamicLights()) {
         return false;
      } else {
         return isShaders() ? Shaders.isDynamicHandLight() : true;
      }
   }

   public static boolean isCustomEntityModels() {
      return gameSettings.ofCustomEntityModels;
   }

   public static boolean isCustomGuis() {
      return gameSettings.ofCustomGuis;
   }

   public static int getScreenshotSize() {
      return gameSettings.ofScreenshotSize;
   }

   public static int[] toPrimitive(Integer[] arr) {
      if (arr == null) {
         return null;
      }

      if (arr.length == 0) {
         return new int[0];
      }

      int[] intArr = new int[arr.length];

      for (int i = 0; i < intArr.length; i++) {
         intArr[i] = arr[i];
      }

      return intArr;
   }

   public static boolean isRenderRegions() {
      return gameSettings.ofRenderRegions;
   }

   public static boolean isVbo() {
      return bqs.f();
   }

   public static boolean isSmoothFps() {
      return gameSettings.ofSmoothFps;
   }

   public static boolean openWebLink(URI uri) {
      try {
         Desktop.getDesktop().browse(uri);
         return true;
      } catch (Exception e) {
         warn("Error opening link: " + uri);
         warn(e.getClass().getName() + ": " + e.getMessage());
         return false;
      }
   }

   public static boolean isShowGlErrors() {
      return gameSettings.ofShowGlErrors;
   }

   public static String arrayToString(boolean[] arr, String separator) {
      if (arr == null) {
         return "";
      }

      StringBuffer buf = new StringBuffer(arr.length * 5);

      for (int i = 0; i < arr.length; i++) {
         boolean x = arr[i];
         if (i > 0) {
            buf.append(separator);
         }

         buf.append(String.valueOf(x));
      }

      return buf.toString();
   }

   public static boolean isIntegratedServerRunning() {
      return minecraft.G() == null ? false : minecraft.E();
   }

   public static IntBuffer createDirectIntBuffer(int capacity) {
      return avd.c(capacity << 2).asIntBuffer();
   }

   public static String getGlErrorString(int err) {
      switch (err) {
         case 0:
            return "No error";
         case 1280:
            return "Invalid enum";
         case 1281:
            return "Invalid value";
         case 1282:
            return "Invalid operation";
         case 1283:
            return "Stack overflow";
         case 1284:
            return "Stack underflow";
         case 1285:
            return "Out of memory";
         case 1286:
            return "Invalid framebuffer operation";
         default:
            return "Unknown";
      }
   }

   public static boolean isTrue(Boolean val) {
      return val != null && val;
   }

   public static boolean isQuadsToTriangles() {
      return !isShaders() ? false : !Shaders.canRenderQuads();
   }

   public static void checkNull(Object obj, String msg) throws NullPointerException {
      if (obj == null) {
         throw new NullPointerException(msg);
      }
   }
}
