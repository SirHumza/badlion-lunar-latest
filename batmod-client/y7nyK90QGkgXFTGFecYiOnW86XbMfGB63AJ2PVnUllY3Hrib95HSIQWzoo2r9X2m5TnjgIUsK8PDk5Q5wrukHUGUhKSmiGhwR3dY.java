import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;

public class y7nyK90QGkgXFTGFecYiOnW86XbMfGB63AJ2PVnUllY3Hrib95HSIQWzoo2r9X2m5TnjgIUsK8PDk5Q5wrukHUGUhKSmiGhwR3dY {
   private final Logger Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I = LogManager.getLogger();
   private File BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW;
   public static final VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h[] DISCONNECT_CONFIRMATION = new VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h[]{
      new VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h("click_twice"),
      new VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h("double_buttons")
   };
   public static final VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h[] IMGUR_SCREENSHOT_OPTION = new VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h[]{
      new VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h("upload"),
      new VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h("upload_and_save")
   };
   public static final VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h[] BETTER_SPRINTING = new VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h[]{
      new VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h("always"),
      new VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h("toggle")
   };
   public static final VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h[] PERSPECTIVE_360_ACTIVATION_METHOD = new VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h[]{
      new VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h("hold"),
      new VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h("press")
   };
   public static final VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h[] PERSPECTIVE_360_THIRD_PERSON_VIEW_MODE = new VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h[]{
      new VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h("behind"),
      new VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h("in_front")
   };
   public static final VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h[] WALLPAPERS = new VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h[aPyvloaczxvJEpKcdCXw5tr0KLcON9kP2nQEKjfX2Qyx7yra7So3KuV4CMDmf4MkjS6VRxUMWCXevpWX2N6rcH4Kuvd46dus01W8.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I().length
      + 2];
   public static final VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h[] ARMOR_OPTION = new VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h[]{
      new VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h("percentage"),
      new VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h("durability"),
      new VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h("durability_max")
   };
   public static final VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h[] COSMETICS_BAT_SHOULDER_OPTION = new VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h[]{
      new VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h("left"),
      new VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h("right")
   };
   public static final VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h[] BACKWARDS_MOVEMENT_OPTION = new VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h[]{
      new VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h("1.8", true),
      new VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h("1.12", true)
   };
   public static final VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h[] SWORD_ANIMATION_OPTION = new VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h[]{
      new VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h("sword_and_blockhit"),
      new VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h("sword"),
      new VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h("blockhit")
   };
   public static final VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h[] ITEM_ANIMATION_OPTION = new VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h[]{
      new VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h("position_and_switch"),
      new VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h("position"),
      new VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h("switch")
   };
   public static final VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h[] BLOCK_OVERLAY_MODE = new VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h[]{
      new VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h("fill_and_outline"),
      new VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h("fill"),
      new VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h("outline")
   };
   public static final VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h[] REGIONAL_FORMAT = new VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h[]{
      new VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h("minecraft_settings"),
      new VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h("system_settings")
   };
   public static final VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h[] DATE_STYLE = new VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h[]{
      new VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h("long"),
      new VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h("medium"),
      new VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h("short")
   };
   public static final VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h[] HYPIXEL_AUTO_GG_PHRASES = new VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h[]{
      new VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h("gg", true),
      new VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h("good game", true),
      new VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h("GG", true),
      new VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h("Good Game", true)
   };
   public static VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h[] HUD_RESOURCE_PACKS = new VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h[AKnHvCEvff0plRZMvivJHI1Y16hUOHf1ple94i52Q2QOBbkkTa9CdhlfxOJQmuqBGcGc4Btt3nXUKX1ypstf7VYEhFEpOcflQPhB.HEycvLXuxJtqnm1Q22Ov3jPFXiY9uV7PHxZL3mxyhegWr71nFjdNmThCqfwtAatIAo5zb7RQ0HbwXhvMNWmPD7lI7R6v8rrgROSU()
         .ajjr7Ni2EHRE1u7yRvYCgdpdiULiyx9X9XJNVVs4B4DzQKYyKiXERSDVF9iR5GLEXGUwZen2M6GVpVpve4n5zSvVjjNeyHxMfxu()
         .vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5()
         .size()
      + 1];
   public int hudResourcePackTrim = 160;
   public VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h hudResourcePackSelected = HUD_RESOURCE_PACKS[HUD_RESOURCE_PACKS.length
      - 1];
   public boolean disconnectConfirmation = false;
   public VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h disconnectConfirmationOption = DISCONNECT_CONFIRMATION[0];
   public boolean betterSprinting = false;
   public VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h betterSprintingOption = BETTER_SPRINTING[0];
   public boolean transparentChat = false;
   public boolean transparentBackground = false;
   public boolean hypixelAutoGG = false;
   public boolean hypixelAutoGGHideKarma = false;
   public VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h hypixelAutoGGPhrase = HYPIXEL_AUTO_GG_PHRASES[0];
   public boolean pingOnTab = false;
   public float pingOnTabScale = 1.0F;
   public boolean hudScoreboard = true;
   public boolean hudScoreboardShowNumbers = true;
   public boolean hudBossBar = true;
   public boolean hudBossBarShowHealth = true;
   public boolean imgurScreenshot = false;
   public VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h imgurScreenshotOption = IMGUR_SCREENSHOT_OPTION[0];
   public int imgurScreenshotKeyBinding = 62;
   public boolean pingIndicator = false;
   public boolean showOwnName = false;
   public boolean hatLayer3D = false;
   public boolean fancyButtons = true;
   public boolean fancyButtonsFading = true;
   public boolean fancyButtonsSliding = false;
   public boolean backgroundBlur = false;
   public float backgroundBlurFade = 100.0F;
   public float backgroundBlurRadius = 20.0F;
   public boolean damageAnimation_1_7 = false;
   public boolean healthAnimation_1_7 = false;
   public boolean sneakAnimation_1_7 = false;
   public boolean inventoryAnimation_1_7 = false;
   public boolean swordAnimation_1_7 = false;
   public VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h swordAnimation_1_7Option = SWORD_ANIMATION_OPTION[0];
   public boolean rodAnimation_1_7 = false;
   public boolean eatingAnimation_1_7 = false;
   public boolean bowAnimation_1_7 = false;
   public boolean itemAnimation_1_7 = false;
   public VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h itemAnimation_1_7Option = ITEM_ANIMATION_OPTION[0];
   public boolean toggleSneak = false;
   public boolean bigChungus = false;
   public List keystrokesTypes = new ArrayList<>(
      Arrays.asList(atG6g6xREMcSbdyd2tvIoR1k57PYjbVnr37nfAu9CMaUXhzKosfIudhaKmuf7CZYWBeLEGWoA869EUAfOkgwJVrVn2SsFrMz4h15.values())
   );
   public int keystrokesFade = 50;
   public float keystrokesSpacing = 2.0F;
   public boolean keystrokesCPS = false;
   public boolean keystrokesArrows = false;
   public boolean keystrokesJumpText = false;
   public boolean keystrokesShowBindings = false;
   public boolean enchantOriginalCapes = true;
   public boolean perspective360 = false;
   public int perspective360KeyBinding = 56;
   public VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h perspective360ActivationMethod = PERSPECTIVE_360_ACTIVATION_METHOD[0];
   public VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h perspective360ThirdPersonViewMode = PERSPECTIVE_360_THIRD_PERSON_VIEW_MODE[0];
   public boolean perspective360InvertVertical = false;
   public boolean perspective360InvertHorizontal = false;
   public VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h wallpaper = WALLPAPERS[0];
   public boolean optionsShortcut = true;
   public int optionsShortcutKeyBinding = 54;
   public boolean itemPhysics = false;
   public int itemPhysicsRotationSpeed = 5;
   public boolean timeChanger;
   public long timeChangerValue = 18L;
   public boolean coordinatesVertical = true;
   public boolean coordinatesShowAxis = true;
   public boolean coordinatesDirection = true;
   public boolean coordinatesBiome = true;
   public boolean armorName = true;
   public boolean armorDurabilityColor = true;
   public boolean armorNameOverwriteColor = false;
   public VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h armorOption = ARMOR_OPTION[0];
   public boolean smoothScroll = true;
   public float smoothScrollMultiplier = 0.3F;
   public boolean smoothScrollBounce = true;
   public boolean cpsLeftButton = true;
   public boolean cpsRightButton = false;
   public boolean cpsMiddleButton = false;
   public boolean spotifyOverlay = false;
   public int spotifyOverlayStay = 5;
   public boolean discordRPCUsername = true;
   public boolean discordRPCServer = true;
   public VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h backwardsMovement = BACKWARDS_MOVEMENT_OPTION[0];
   public boolean blockOverlay = false;
   public DEQqSlCVUv9dFM4e3dvTyktom3aZFVgTaip76sPHPdujGACXYXbDgNlk7vNfMH1aHbyjfqeeEysnzf37tyuXY6C0Ukz4CeQHxauW blockOverlayFillColor = new DEQqSlCVUv9dFM4e3dvTyktom3aZFVgTaip76sPHPdujGACXYXbDgNlk7vNfMH1aHbyjfqeeEysnzf37tyuXY6C0Ukz4CeQHxauW(
      new Color(1.0F, 1.0F, 1.0F, 0.2F)
   );
   public DEQqSlCVUv9dFM4e3dvTyktom3aZFVgTaip76sPHPdujGACXYXbDgNlk7vNfMH1aHbyjfqeeEysnzf37tyuXY6C0Ukz4CeQHxauW blockOverlayOutlineColor = new DEQqSlCVUv9dFM4e3dvTyktom3aZFVgTaip76sPHPdujGACXYXbDgNlk7vNfMH1aHbyjfqeeEysnzf37tyuXY6C0Ukz4CeQHxauW(
         new Color(1.0F, 1.0F, 1.0F, 0.5F)
      )
      .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(true);
   public float blockOverlayOutlineWidth = 2.0F;
   public boolean blockOverlayFadeAnimation = false;
   public VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h blockOverlayMode = BLOCK_OVERLAY_MODE[0];
   public boolean particleMultiplier = false;
   public int particleMultiplierCritical = 2;
   public boolean particleMultiplierAlwaysCritical = false;
   public int particleMultiplierSharpness = 2;
   public boolean particleMultiplierAlwaysSharpness = false;
   public boolean damageParticleFix = false;
   public boolean hudTimeSeconds = false;
   public VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h hudTimeRegionalFormat = REGIONAL_FORMAT[0];
   public VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h hudDateStyle = DATE_STYLE[0];
   public VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h hudDateRegionalFormat = REGIONAL_FORMAT[0];
   public boolean fullbright = false;
   public int fullbrightGamma = 1200;

   public y7nyK90QGkgXFTGFecYiOnW86XbMfGB63AJ2PVnUllY3Hrib95HSIQWzoo2r9X2m5TnjgIUsK8PDk5Q5wrukHUGUhKSmiGhwR3dY() {
      this.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5();
      this.PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u();
      this.uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590();
      this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I();
   }

   private void vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5() {
      AKnHvCEvff0plRZMvivJHI1Y16hUOHf1ple94i52Q2QOBbkkTa9CdhlfxOJQmuqBGcGc4Btt3nXUKX1ypstf7VYEhFEpOcflQPhB var1 = AKnHvCEvff0plRZMvivJHI1Y16hUOHf1ple94i52Q2QOBbkkTa9CdhlfxOJQmuqBGcGc4Btt3nXUKX1ypstf7VYEhFEpOcflQPhB.HEycvLXuxJtqnm1Q22Ov3jPFXiY9uV7PHxZL3mxyhegWr71nFjdNmThCqfwtAatIAo5zb7RQ0HbwXhvMNWmPD7lI7R6v8rrgROSU();
      List var2 = var1.ajjr7Ni2EHRE1u7yRvYCgdpdiULiyx9X9XJNVVs4B4DzQKYyKiXERSDVF9iR5GLEXGUwZen2M6GVpVpve4n5zSvVjjNeyHxMfxu()
         .vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5();
      HUD_RESOURCE_PACKS = new VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h[var2.size() + 1];

      for (int var3 = 0; var3 < var2.size(); var3++) {
         HUD_RESOURCE_PACKS[var3] = new VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h(
            ((IhqTPhERQScqyMXGKrf16PRTjoTv0po3O7UO4evEf90EkIBCAnMVcITGjUlqttVjzEk2EFEewk4QrbjmomxC8GqsF8dhU6oiVa42)var2.get(var2.size() - var3 - 1))
               .PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u(),
            true
         );
      }

      HUD_RESOURCE_PACKS[var2.size()] = new VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h(
         var1.o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4
            .BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(),
         true
      );
   }

   public void Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I() {
      this.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5();
      AKnHvCEvff0plRZMvivJHI1Y16hUOHf1ple94i52Q2QOBbkkTa9CdhlfxOJQmuqBGcGc4Btt3nXUKX1ypstf7VYEhFEpOcflQPhB var1 = AKnHvCEvff0plRZMvivJHI1Y16hUOHf1ple94i52Q2QOBbkkTa9CdhlfxOJQmuqBGcGc4Btt3nXUKX1ypstf7VYEhFEpOcflQPhB.HEycvLXuxJtqnm1Q22Ov3jPFXiY9uV7PHxZL3mxyhegWr71nFjdNmThCqfwtAatIAo5zb7RQ0HbwXhvMNWmPD7lI7R6v8rrgROSU();
      if (this.hudResourcePackSelected == null
         || var1.ajjr7Ni2EHRE1u7yRvYCgdpdiULiyx9X9XJNVVs4B4DzQKYyKiXERSDVF9iR5GLEXGUwZen2M6GVpVpve4n5zSvVjjNeyHxMfxu()
                  .vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5()
                  .stream()
                  .filter(
                     var1x -> var1x.PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u()
                        .equals(
                           this.hudResourcePackSelected.PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u()
                        )
                  )
                  .findFirst()
                  .orElse(null)
               == null
            && !var1.o9J5ygGImNI5Ws5L9s4ppy1zSfK22KkGYNOpS82I0raEIiSJMfxzEaEXlpHB7PQt4MvV6jd06TVrtRsToMod2AlaZlRNnI6veuC4
               .BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW()
               .equals(this.hudResourcePackSelected.PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u())) {
         this.hudResourcePackSelected = HUD_RESOURCE_PACKS[HUD_RESOURCE_PACKS.length - 1];
      }
   }

   private void PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u() {
      File var1 = new File(
         AKnHvCEvff0plRZMvivJHI1Y16hUOHf1ple94i52Q2QOBbkkTa9CdhlfxOJQmuqBGcGc4Btt3nXUKX1ypstf7VYEhFEpOcflQPhB.HEycvLXuxJtqnm1Q22Ov3jPFXiY9uV7PHxZL3mxyhegWr71nFjdNmThCqfwtAatIAo5zb7RQ0HbwXhvMNWmPD7lI7R6v8rrgROSU()
               .K8fgK6SJTLD5kNdQl59F9Js9gC8cN1NCeb1mW2tUoSWhxfq1ilNyZ38fRHDneEOE3UTXU8PslB1j8FjHqFAL6e5Iaxq178LZtxuY
            + "/BatMod"
      );
      if (!var1.isDirectory()) {
         var1.mkdir();
      }

      this.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW = new File(
         var1.getAbsolutePath(), "options.txt"
      );
      if (!this.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW.exists()) {
         try {
            this.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW.createNewFile();
         } catch (IOException var3) {
            var3.printStackTrace();
         }
      }
   }

   private void uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590() {
      try {
         if (!this.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW.exists()) {
            return;
         }

         BufferedReader var1 = new BufferedReader(
            new FileReader(this.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW)
         );
         String var2 = "";

         while ((var2 = var1.readLine()) != null) {
            try {
               String[] var3 = var2.split(":");
               if (var3.length >= 2) {
                  if (var3[0].equals("disconnectconfirmation")) {
                     this.disconnectConfirmation = Boolean.parseBoolean(var3[1]);
                  }

                  if (var3[0].equals("disconnectconfirmationoption")) {
                     this.disconnectConfirmationOption = VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                        var3[1], this.disconnectConfirmationOption
                     );
                  }

                  if (var3[0].equals("bettersprinting")) {
                     this.betterSprinting = Boolean.parseBoolean(var3[1]);
                  }

                  if (var3[0].equals("bettersprintingmode")) {
                     this.betterSprintingOption = VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                        var3[1], this.betterSprintingOption
                     );
                  }

                  if (var3[0].equals("transparentchat")) {
                     this.transparentChat = Boolean.parseBoolean(var3[1]);
                  }

                  if (var3[0].equals("transparentbackground")) {
                     this.transparentBackground = Boolean.parseBoolean(var3[1]);
                  }

                  if (var3[0].equals("hypixelautogg")) {
                     this.hypixelAutoGG = Boolean.parseBoolean(var3[1]);
                  }

                  if (var3[0].equals("hypixelautogghidekarma")) {
                     this.hypixelAutoGGHideKarma = Boolean.parseBoolean(var3[1]);
                  }

                  if (var3[0].equals("hypixelautoggphrase")) {
                     this.hypixelAutoGGPhrase = VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                        var3[1], this.hypixelAutoGGPhrase
                     );
                  }

                  if (var3[0].equals("pingontab")) {
                     this.pingOnTab = Boolean.parseBoolean(var3[1]);
                  }

                  if (var3[0].equals("pingontabscale")) {
                     this.pingOnTabScale = Float.parseFloat(var3[1]);
                  }

                  if (var3[0].equals("hudscoreboard")) {
                     this.hudScoreboard = Boolean.parseBoolean(var3[1]);
                  }

                  if (var3[0].equals("hudscoreboardshownumbers")) {
                     this.hudScoreboardShowNumbers = Boolean.parseBoolean(var3[1]);
                  }

                  if (var3[0].equals("hudbossbar")) {
                     this.hudBossBar = Boolean.parseBoolean(var3[1]);
                  }

                  if (var3[0].equals("hudbossbarshowhealth")) {
                     this.hudBossBarShowHealth = Boolean.parseBoolean(var3[1]);
                  }

                  if (var3[0].equals("imgurscreenshot")) {
                     this.imgurScreenshot = Boolean.parseBoolean(var3[1]);
                  }

                  if (var3[0].equals("imgurscreenshotoption")) {
                     this.imgurScreenshotOption = VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                        var3[1], this.imgurScreenshotOption
                     );
                  }

                  if (var3[0].equals("imgurscreenshotkeybinding")) {
                     this.imgurScreenshotKeyBinding = Integer.parseInt(var3[1]);
                  }

                  if (var3[0].equals("pingindicator")) {
                     this.pingIndicator = Boolean.parseBoolean(var3[1]);
                  }

                  if (var3[0].equals("showownname")) {
                     this.showOwnName = Boolean.parseBoolean(var3[1]);
                  }

                  if (var3[0].equals("hatlayer3d")) {
                     this.hatLayer3D = Boolean.parseBoolean(var3[1]);
                  }

                  if (var3[0].equals("fancybuttons")) {
                     this.fancyButtons = Boolean.parseBoolean(var3[1]);
                  }

                  if (var3[0].equals("fancybuttonsfading")) {
                     this.fancyButtonsFading = Boolean.parseBoolean(var3[1]);
                  }

                  if (var3[0].equals("fancybuttonssliding")) {
                     this.fancyButtonsSliding = Boolean.parseBoolean(var3[1]);
                  }

                  if (var3[0].equals("backgroundblur")) {
                     this.backgroundBlur = Boolean.parseBoolean(var3[1]);
                  }

                  if (var3[0].equals("backgroundblurfade")) {
                     this.backgroundBlurFade = Float.parseFloat(var3[1]);
                  }

                  if (var3[0].equals("backgroundblurradius")) {
                     this.backgroundBlurRadius = Math.max(
                        Math.min(
                           bsqEiiARMHW3736zGOGBtbS2Hf3wZktlTQxnxScJPIsQcqCzUjbbYxDHJnL7DPpGsisJEpvaR2RI5n59wPBJRByCL2fhjctOEVMf.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                              bsqEiiARMHW3736zGOGBtbS2Hf3wZktlTQxnxScJPIsQcqCzUjbbYxDHJnL7DPpGsisJEpvaR2RI5n59wPBJRByCL2fhjctOEVMf.LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN
                           ),
                           Float.parseFloat(var3[1])
                        ),
                        bsqEiiARMHW3736zGOGBtbS2Hf3wZktlTQxnxScJPIsQcqCzUjbbYxDHJnL7DPpGsisJEpvaR2RI5n59wPBJRByCL2fhjctOEVMf.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(
                           bsqEiiARMHW3736zGOGBtbS2Hf3wZktlTQxnxScJPIsQcqCzUjbbYxDHJnL7DPpGsisJEpvaR2RI5n59wPBJRByCL2fhjctOEVMf.LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN
                        )
                     );
                  }

                  if (var3[0].equals("damageanimation_1_7")) {
                     this.damageAnimation_1_7 = Boolean.parseBoolean(var3[1]);
                  }

                  if (var3[0].equals("healthanimation_1_7")) {
                     this.healthAnimation_1_7 = Boolean.parseBoolean(var3[1]);
                  }

                  if (var3[0].equals("sneakanimation_1_7")) {
                     this.sneakAnimation_1_7 = Boolean.parseBoolean(var3[1]);
                  }

                  if (var3[0].equals("inventoryanimation_1_7")) {
                     this.inventoryAnimation_1_7 = Boolean.parseBoolean(var3[1]);
                  }

                  if (var3[0].equals("swordanimation_1_7")) {
                     this.swordAnimation_1_7 = Boolean.parseBoolean(var3[1]);
                  }

                  if (var3[0].equals("swordanimation_1_7option")) {
                     this.swordAnimation_1_7Option = VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                        var3[1], this.swordAnimation_1_7Option
                     );
                  }

                  if (var3[0].equals("rodanimation_1_7")) {
                     this.rodAnimation_1_7 = Boolean.parseBoolean(var3[1]);
                  }

                  if (var3[0].equals("eatinganimation_1_7")) {
                     this.eatingAnimation_1_7 = Boolean.parseBoolean(var3[1]);
                  }

                  if (var3[0].equals("bowanimation_1_7")) {
                     this.bowAnimation_1_7 = Boolean.parseBoolean(var3[1]);
                  }

                  if (var3[0].equals("togglesneak")) {
                     this.toggleSneak = Boolean.parseBoolean(var3[1]);
                  }

                  if (var3[0].equals("bigchungus")) {
                     this.bigChungus = Boolean.parseBoolean(var3[1]);
                  }

                  if (var3[0].equals("keystrokestypes")) {
                     this.keystrokesTypes = Arrays.stream(var3[1].split(","))
                        .map(atG6g6xREMcSbdyd2tvIoR1k57PYjbVnr37nfAu9CMaUXhzKosfIudhaKmuf7CZYWBeLEGWoA869EUAfOkgwJVrVn2SsFrMz4h15::valueOf)
                        .collect(Collectors.toCollection(ArrayList::new));
                  }

                  if (var3[0].equals("keystrokesfade")) {
                     this.keystrokesFade = Integer.parseInt(var3[1]);
                  }

                  if (var3[0].equals("keystrokesspacing")) {
                     this.keystrokesSpacing = Float.parseFloat(var3[1]);
                  }

                  if (var3[0].equals("keystrokescps")) {
                     this.keystrokesCPS = Boolean.parseBoolean(var3[1]);
                  }

                  if (var3[0].equals("keystrokesarrows")) {
                     this.keystrokesArrows = Boolean.parseBoolean(var3[1]);
                  }

                  if (var3[0].equals("keystrokesjumptext")) {
                     this.keystrokesJumpText = Boolean.parseBoolean(var3[1]);
                  }

                  if (var3[0].equals("keystrokesshowbindings")) {
                     this.keystrokesShowBindings = Boolean.parseBoolean(var3[1]);
                  }

                  if (var3[0].equals("enchantoriginalcapes")) {
                     this.enchantOriginalCapes = Boolean.parseBoolean(var3[1]);
                  }

                  if (var3[0].equals("perspective_360")) {
                     this.perspective360 = Boolean.parseBoolean(var3[1]);
                  }

                  if (var3[0].equals("perspective_360_keybinding")) {
                     this.perspective360KeyBinding = Integer.parseInt(var3[1]);
                  }

                  if (var3[0].equals("perspective_360_activation_method")) {
                     this.perspective360ActivationMethod = VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                        var3[1], this.perspective360ActivationMethod
                     );
                  }

                  if (var3[0].equals("perspective_360_third_person_view_mode")) {
                     this.perspective360ThirdPersonViewMode = VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                        var3[1], this.perspective360ThirdPersonViewMode
                     );
                  }

                  if (var3[0].equals("perspective_360_invert_horizontal")) {
                     this.perspective360InvertHorizontal = Boolean.parseBoolean(var3[1]);
                  }

                  if (var3[0].equals("perspective_360_invert_vertical")) {
                     this.perspective360InvertVertical = Boolean.parseBoolean(var3[1]);
                  }

                  if (var3[0].equals("wallpaper")) {
                     this.wallpaper = VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                        var3[1], this.wallpaper
                     );
                  }

                  if (var3[0].equals("optionsshortcut")) {
                     this.optionsShortcut = Boolean.parseBoolean(var3[1]);
                  }

                  if (var3[0].equals("optionsshortcut_keybinding")) {
                     this.optionsShortcutKeyBinding = Integer.parseInt(var3[1]);
                  }

                  if (var3[0].equals("itemphysics")) {
                     this.itemPhysics = Boolean.parseBoolean(var3[1]);
                  }

                  if (var3[0].equals("itemphysicsrotationspeed")) {
                     this.itemPhysicsRotationSpeed = Integer.parseInt(var3[1]);
                  }

                  if (var3[0].equals("timechanger")) {
                     this.timeChanger = Boolean.parseBoolean(var3[1]);
                  }

                  if (var3[0].equals("timechangervalue")) {
                     this.timeChangerValue = Long.parseLong(var3[1]);
                  }

                  if (var3[0].equals("coordinatesvertical")) {
                     this.coordinatesVertical = Boolean.parseBoolean(var3[1]);
                  }

                  if (var3[0].equals("coordinatesshowaxis")) {
                     this.coordinatesShowAxis = Boolean.parseBoolean(var3[1]);
                  }

                  if (var3[0].equals("coordinatesdirection")) {
                     this.coordinatesDirection = Boolean.parseBoolean(var3[1]);
                  }

                  if (var3[0].equals("coordinatesbiome")) {
                     this.coordinatesBiome = Boolean.parseBoolean(var3[1]);
                  }

                  if (var3[0].equals("armorname")) {
                     this.armorName = Boolean.parseBoolean(var3[1]);
                  }

                  if (var3[0].equals("armordurabilitycolor")) {
                     this.armorDurabilityColor = Boolean.parseBoolean(var3[1]);
                  }

                  if (var3[0].equals("armornameoverwritecolor")) {
                     this.armorNameOverwriteColor = Boolean.parseBoolean(var3[1]);
                  }

                  if (var3[0].equals("armoroption")) {
                     this.armorOption = VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                        var3[1], this.armorOption
                     );
                  }

                  if (var3[0].equals("smoothscroll")) {
                     this.smoothScroll = Boolean.parseBoolean(var3[1]);
                  }

                  if (var3[0].equals("smoothscrollmultiplier")) {
                     this.smoothScrollMultiplier = Float.parseFloat(var3[1]);
                  }

                  if (var3[0].equals("smoothscrollbounce")) {
                     this.smoothScrollBounce = Boolean.parseBoolean(var3[1]);
                  }

                  if (var3[0].equals("cpsleftbutton")) {
                     this.cpsLeftButton = Boolean.parseBoolean(var3[1]);
                  }

                  if (var3[0].equals("cpsrightbutton")) {
                     this.cpsRightButton = Boolean.parseBoolean(var3[1]);
                  }

                  if (var3[0].equals("cpsmiddlebutton")) {
                     this.cpsMiddleButton = Boolean.parseBoolean(var3[1]);
                  }

                  if (var3[0].equals("spotifyoverlay")) {
                     this.spotifyOverlay = Boolean.parseBoolean(var3[1]);
                  }

                  if (var3[0].equals("spotifyoverlaystay")) {
                     this.spotifyOverlayStay = Integer.parseInt(var3[1]);
                  }

                  if (var3[0].equals("discordrpcusername")) {
                     this.discordRPCUsername = Boolean.parseBoolean(var3[1]);
                  }

                  if (var3[0].equals("discordrpcserver")) {
                     this.discordRPCServer = Boolean.parseBoolean(var3[1]);
                  }

                  if (var3[0].equals("backwardsmovement")) {
                     this.backwardsMovement = VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                        var3[1], this.backwardsMovement
                     );
                  }

                  if (var3[0].equals("blockoverlay")) {
                     this.blockOverlay = Boolean.parseBoolean(var3[1]);
                  }

                  if (var3[0].equals("blockoverlayfillcolor")) {
                     this.blockOverlayFillColor = DEQqSlCVUv9dFM4e3dvTyktom3aZFVgTaip76sPHPdujGACXYXbDgNlk7vNfMH1aHbyjfqeeEysnzf37tyuXY6C0Ukz4CeQHxauW.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                        var3[1]
                     );
                  }

                  if (var3[0].equals("blockoverlayoutlinecolor")) {
                     this.blockOverlayOutlineColor = DEQqSlCVUv9dFM4e3dvTyktom3aZFVgTaip76sPHPdujGACXYXbDgNlk7vNfMH1aHbyjfqeeEysnzf37tyuXY6C0Ukz4CeQHxauW.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                        var3[1]
                     );
                  }

                  if (var3[0].equals("blockoverlayoutlinewidth")) {
                     this.blockOverlayOutlineWidth = Float.parseFloat(var3[1]);
                  }

                  if (var3[0].equals("blockoverlayfadeanimation")) {
                     this.blockOverlayFadeAnimation = Boolean.parseBoolean(var3[1]);
                  }

                  if (var3[0].equals("blockoverlaymode")) {
                     this.blockOverlayMode = VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                        var3[1], this.blockOverlayMode
                     );
                  }

                  if (var3[0].equals("particlemultiplier")) {
                     this.particleMultiplier = Boolean.parseBoolean(var3[1]);
                  }

                  if (var3[0].equals("particlemultipliercritical")) {
                     this.particleMultiplierCritical = Integer.parseInt(var3[1]);
                  }

                  if (var3[0].equals("particlemultiplieralwayscritical")) {
                     this.particleMultiplierAlwaysCritical = Boolean.parseBoolean(var3[1]);
                  }

                  if (var3[0].equals("particlemultipliersharpness")) {
                     this.particleMultiplierSharpness = Integer.parseInt(var3[1]);
                  }

                  if (var3[0].equals("particlemultiplieralwayssharpness")) {
                     this.particleMultiplierAlwaysSharpness = Boolean.parseBoolean(var3[1]);
                  }

                  if (var3[0].equals("damageparticlefix")) {
                     this.damageParticleFix = Boolean.parseBoolean(var3[1]);
                  }

                  if (var3[0].equals("hudtimeseconds")) {
                     this.hudTimeSeconds = Boolean.parseBoolean(var3[1]);
                  }

                  if (var3[0].equals("hudtimeregionalformat")) {
                     this.hudTimeRegionalFormat = VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                        var3[1], this.hudTimeRegionalFormat
                     );
                  }

                  if (var3[0].equals("huddatestyle")) {
                     this.hudDateStyle = VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                        var3[1], this.hudDateStyle
                     );
                  }

                  if (var3[0].equals("huddateregionalformat")) {
                     this.hudDateRegionalFormat = VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                        var3[1], this.hudDateRegionalFormat
                     );
                  }

                  if (var3[0].equals("hudresourcepacktrim")) {
                     this.hudResourcePackTrim = Integer.parseInt(var3[1]);
                  }

                  if (var3[0].equals("hudresourcepackselected")) {
                     this.hudResourcePackSelected = VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                        var3[1], this.hudResourcePackSelected
                     );
                  }

                  if (var3[0].equals("fullbright")) {
                     this.fullbright = Boolean.parseBoolean(var3[1]);
                  }

                  if (var3[0].equals("fullbrightgamma")) {
                     this.fullbrightGamma = Integer.parseInt(var3[1]);
                  }
               }
            } catch (Exception var4) {
               this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I
                  .warn("Skipping bad BatMod option: " + var2);
               var4.printStackTrace();
            }
         }

         var1.close();
      } catch (Exception var5) {
         this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I("Failed to load BatMod options :(", var5);
      }

      this.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW();
   }

   public void BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW() {
      try {
         PrintWriter var1 = new PrintWriter(
            new FileWriter(this.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW)
         );
         var1.println("disconnectconfirmation:" + this.disconnectConfirmation);
         var1.println("disconnectconfirmationoption:" + this.disconnectConfirmationOption);
         var1.println("bettersprinting:" + this.betterSprinting);
         var1.println("bettersprintingmode:" + this.betterSprintingOption);
         var1.println("transparentchat:" + this.transparentChat);
         var1.println("transparentbackground:" + this.transparentBackground);
         var1.println("hypixelautogg:" + this.hypixelAutoGG);
         var1.println("hypixelautogghidekarma:" + this.hypixelAutoGGHideKarma);
         var1.println("hypixelautoggphrase:" + this.hypixelAutoGGPhrase);
         var1.println("pingontab:" + this.pingOnTab);
         var1.println("pingontabscale:" + this.pingOnTabScale);
         var1.println("hudscoreboard:" + this.hudScoreboard);
         var1.println("hudscoreboardshownumbers:" + this.hudScoreboardShowNumbers);
         var1.println("hudbossbar:" + this.hudBossBar);
         var1.println("hudbossbarshowhealth:" + this.hudBossBarShowHealth);
         var1.println("imgurscreenshot:" + this.imgurScreenshot);
         var1.println("imgurscreenshotoption:" + this.imgurScreenshotOption);
         var1.println("imgurscreenshotkeybinding:" + this.imgurScreenshotKeyBinding);
         var1.println("pingindicator:" + this.pingIndicator);
         var1.println("showownname:" + this.showOwnName);
         var1.println("hatlayer3d:" + this.hatLayer3D);
         var1.println("fancybuttons:" + this.fancyButtons);
         var1.println("fancybuttonsfading:" + this.fancyButtonsFading);
         var1.println("fancybuttonssliding:" + this.fancyButtonsSliding);
         var1.println("backgroundblur:" + this.backgroundBlur);
         var1.println("backgroundblurfade:" + this.backgroundBlurFade);
         var1.println("backgroundblurradius:" + this.backgroundBlurRadius);
         var1.println("damageanimation_1_7:" + this.damageAnimation_1_7);
         var1.println("healthanimation_1_7:" + this.healthAnimation_1_7);
         var1.println("sneakanimation_1_7:" + this.sneakAnimation_1_7);
         var1.println("inventoryanimation_1_7:" + this.inventoryAnimation_1_7);
         var1.println("swordanimation_1_7:" + this.swordAnimation_1_7);
         var1.println("swordanimation_1_7option:" + this.swordAnimation_1_7Option);
         var1.println("rodanimation_1_7:" + this.rodAnimation_1_7);
         var1.println("eatinganimation_1_7:" + this.eatingAnimation_1_7);
         var1.println("bowanimation_1_7:" + this.bowAnimation_1_7);
         var1.println("togglesneak:" + this.toggleSneak);
         var1.println("bigchungus:" + this.bigChungus);
         var1.println("keystrokestypes:" + this.keystrokesTypes.toString().replace(" ", "").replace("[", "").replace("]", ""));
         var1.println("keystrokesfade:" + this.keystrokesFade);
         var1.println("keystrokesspacing:" + this.keystrokesSpacing);
         var1.println("keystrokescps:" + this.keystrokesCPS);
         var1.println("keystrokesarrows:" + this.keystrokesArrows);
         var1.println("keystrokesjumptext:" + this.keystrokesJumpText);
         var1.println("keystrokesshowbindings:" + this.keystrokesShowBindings);
         var1.println("enchantoriginalcapes:" + this.enchantOriginalCapes);
         var1.println("perspective_360:" + this.perspective360);
         var1.println("perspective_360_keybinding:" + this.perspective360KeyBinding);
         var1.println("perspective_360_activation_method:" + this.perspective360ActivationMethod);
         var1.println("perspective_360_third_person_view_mode:" + this.perspective360ThirdPersonViewMode);
         var1.println("perspective_360_invert_horizontal:" + this.perspective360InvertHorizontal);
         var1.println("perspective_360_invert_vertical:" + this.perspective360InvertVertical);
         var1.println("wallpaper:" + this.wallpaper);
         var1.println("optionsshortcut:" + this.optionsShortcut);
         var1.println("optionsshortcut_keybinding:" + this.optionsShortcutKeyBinding);
         var1.println("itemphysics:" + this.itemPhysics);
         var1.println("itemphysicsrotationspeed:" + this.itemPhysicsRotationSpeed);
         var1.println("timechanger:" + this.timeChanger);
         var1.println("timechangervalue:" + this.timeChangerValue);
         var1.println("coordinatesvertical:" + this.coordinatesVertical);
         var1.println("coordinatesshowaxis:" + this.coordinatesShowAxis);
         var1.println("coordinatesdirection:" + this.coordinatesDirection);
         var1.println("coordinatesbiome:" + this.coordinatesBiome);
         var1.println("armorname:" + this.armorName);
         var1.println("armordurabilitycolor:" + this.armorDurabilityColor);
         var1.println("armornameoverwritecolor:" + this.armorNameOverwriteColor);
         var1.println("armoroption:" + this.armorOption);
         var1.println("smoothscroll:" + this.smoothScroll);
         var1.println("smoothscrollmultiplier:" + this.smoothScrollMultiplier);
         var1.println("smoothscrollbounce:" + this.smoothScrollBounce);
         var1.println("cpsleftbutton:" + this.cpsLeftButton);
         var1.println("cpsrightbutton:" + this.cpsRightButton);
         var1.println("cpsmiddlebutton:" + this.cpsMiddleButton);
         var1.println("spotifyoverlay:" + this.spotifyOverlay);
         var1.println("spotifyoverlaystay:" + this.spotifyOverlayStay);
         var1.println("discordrpcusername:" + this.discordRPCUsername);
         var1.println("discordrpcserver:" + this.discordRPCServer);
         var1.println("backwardsmovement:" + this.backwardsMovement);
         var1.println("blockoverlay:" + this.blockOverlay);
         var1.println("blockoverlayfillcolor:" + this.blockOverlayFillColor);
         var1.println("blockoverlayoutlinecolor:" + this.blockOverlayOutlineColor);
         var1.println("blockoverlayoutlinewidth:" + this.blockOverlayOutlineWidth);
         var1.println("blockoverlayfadeanimation:" + this.blockOverlayFadeAnimation);
         var1.println("blockoverlaymode:" + this.blockOverlayMode);
         var1.println("particlemultiplier:" + this.particleMultiplier);
         var1.println("particlemultipliercritical:" + this.particleMultiplierCritical);
         var1.println("particlemultiplieralwayscritical:" + this.particleMultiplierAlwaysCritical);
         var1.println("particlemultipliersharpness:" + this.particleMultiplierSharpness);
         var1.println("particlemultiplieralwayssharpness:" + this.particleMultiplierAlwaysSharpness);
         var1.println("damageparticlefix:" + this.damageParticleFix);
         var1.println("hudtimeseconds:" + this.hudTimeSeconds);
         var1.println("hudtimeregionalformat:" + this.hudTimeRegionalFormat);
         var1.println("huddatestyle:" + this.hudDateStyle);
         var1.println("huddateregionalformat:" + this.hudDateRegionalFormat);
         var1.println("hudresourcepacktrim:" + this.hudResourcePackTrim);
         var1.println("hudresourcepackselected:" + this.hudResourcePackSelected);
         var1.println("fullbright:" + this.fullbright);
         var1.println("fullbrightgamma:" + this.fullbrightGamma);
         var1.close();
      } catch (Exception var2) {
         this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I("Failed to save BatMod options :(", var2);
      }
   }

   public void Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(String var1, boolean var2) {
      try {
         this.getClass().getField(var1).set(this, var2);
      } catch (Exception var4) {
         var4.printStackTrace();
      }
   }

   public boolean Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(String var1) {
      try {
         return this.getClass().getField(var1).getBoolean(this);
      } catch (Exception var3) {
         var3.printStackTrace();
         return false;
      }
   }

   public void Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(String var1, int var2) {
      try {
         this.getClass().getField(var1).set(this, var2);
      } catch (Exception var4) {
         var4.printStackTrace();
      }
   }

   public int BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(String var1) {
      try {
         return this.getClass().getField(var1).getInt(this);
      } catch (Exception var3) {
         var3.printStackTrace();
         return -1;
      }
   }

   public String vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(String var1) {
      int var2 = this.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(var1);
      return var2 < 0
         ? rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
            "key.mouseButton", var2 + 101
         )
         : (var2 < 256 ? Keyboard.getKeyName(var2) : String.format("%c", (char)(var2 - 256)).toUpperCase());
   }

   private void Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(String var1, Exception var2) {
      this.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I.error(var1, var2);
   }

   public float Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      bsqEiiARMHW3736zGOGBtbS2Hf3wZktlTQxnxScJPIsQcqCzUjbbYxDHJnL7DPpGsisJEpvaR2RI5n59wPBJRByCL2fhjctOEVMf var1
   ) {
      return var1
               == bsqEiiARMHW3736zGOGBtbS2Hf3wZktlTQxnxScJPIsQcqCzUjbbYxDHJnL7DPpGsisJEpvaR2RI5n59wPBJRByCL2fhjctOEVMf.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I
            && Vfq9mSkAXpuxraNRNlMqE5xZv02b8IHnLyxD1GZO80ifGPGTX82Yf2B8EwOuuIxg0KubmG05rew2v1FPE8OdLwUzYRJDeshae83B.QcHYSL1fJpPwS8I6lDMqHeG0PpI9KENOilkz5Zn7Mesbj9VY4zckGxbjAEO8XHoUDZ8CippSgxILNeARjCg07BQVJdCIm7SIrBC0()
               != null
         ? Vfq9mSkAXpuxraNRNlMqE5xZv02b8IHnLyxD1GZO80ifGPGTX82Yf2B8EwOuuIxg0KubmG05rew2v1FPE8OdLwUzYRJDeshae83B.QcHYSL1fJpPwS8I6lDMqHeG0PpI9KENOilkz5Zn7Mesbj9VY4zckGxbjAEO8XHoUDZ8CippSgxILNeARjCg07BQVJdCIm7SIrBC0()
            .RModJZEOhhjT4uPKAuLskN6fUYKpGeXWlTKMKzVCotnh8IDpnUM8zKUPyM7irhoYqhF5jIRt2a397vXyAe9gezlx1K6YataCwKwM()
         : (
            var1
                  == bsqEiiARMHW3736zGOGBtbS2Hf3wZktlTQxnxScJPIsQcqCzUjbbYxDHJnL7DPpGsisJEpvaR2RI5n59wPBJRByCL2fhjctOEVMf.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW
               ? this.pingOnTabScale
               : (
                  var1
                        == bsqEiiARMHW3736zGOGBtbS2Hf3wZktlTQxnxScJPIsQcqCzUjbbYxDHJnL7DPpGsisJEpvaR2RI5n59wPBJRByCL2fhjctOEVMf.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5
                     ? this.keystrokesFade
                     : (
                        var1
                              == bsqEiiARMHW3736zGOGBtbS2Hf3wZktlTQxnxScJPIsQcqCzUjbbYxDHJnL7DPpGsisJEpvaR2RI5n59wPBJRByCL2fhjctOEVMf.PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u
                           ? this.keystrokesSpacing
                           : (
                              var1
                                    == bsqEiiARMHW3736zGOGBtbS2Hf3wZktlTQxnxScJPIsQcqCzUjbbYxDHJnL7DPpGsisJEpvaR2RI5n59wPBJRByCL2fhjctOEVMf.uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590
                                 ? this.itemPhysicsRotationSpeed
                                 : (
                                    var1
                                          == bsqEiiARMHW3736zGOGBtbS2Hf3wZktlTQxnxScJPIsQcqCzUjbbYxDHJnL7DPpGsisJEpvaR2RI5n59wPBJRByCL2fhjctOEVMf.QcHYSL1fJpPwS8I6lDMqHeG0PpI9KENOilkz5Zn7Mesbj9VY4zckGxbjAEO8XHoUDZ8CippSgxILNeARjCg07BQVJdCIm7SIrBC0
                                       ? (float)this.timeChangerValue
                                       : (
                                          var1
                                                == bsqEiiARMHW3736zGOGBtbS2Hf3wZktlTQxnxScJPIsQcqCzUjbbYxDHJnL7DPpGsisJEpvaR2RI5n59wPBJRByCL2fhjctOEVMf.kpjeuvirVi401rGj4cseffd4WxtSSMZm3fFgpSU28wbJZ50n48BdWMQa6TLB5qajxzarOlQ9OP0uFpV2DZPAvWuKoICgD6I2s6EQ
                                             ? this.smoothScrollMultiplier * 10.0F
                                             : (
                                                var1
                                                      == bsqEiiARMHW3736zGOGBtbS2Hf3wZktlTQxnxScJPIsQcqCzUjbbYxDHJnL7DPpGsisJEpvaR2RI5n59wPBJRByCL2fhjctOEVMf.y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY
                                                   ? this.spotifyOverlayStay
                                                   : (
                                                      var1
                                                            == bsqEiiARMHW3736zGOGBtbS2Hf3wZktlTQxnxScJPIsQcqCzUjbbYxDHJnL7DPpGsisJEpvaR2RI5n59wPBJRByCL2fhjctOEVMf.sZrYAdOvyZNrQTQ3ZU8UOhdt4uTik3WKlaSKgnyMXjeCxz5oe8Mw0rtvMcjdpzjEHp0Gs48dlfFyZy3PJfJ9pOtzgSWW5nUaRf9
                                                         ? this.blockOverlayOutlineWidth
                                                         : (
                                                            var1
                                                                  == bsqEiiARMHW3736zGOGBtbS2Hf3wZktlTQxnxScJPIsQcqCzUjbbYxDHJnL7DPpGsisJEpvaR2RI5n59wPBJRByCL2fhjctOEVMf.lupDZ2Cnh8fIgzDGHlnSYSWdtTyhGvQM8ySvPCDcouYi9MkHlLktznCZqsSuMBFSPFPFDsZ7NP0MqV4XGlOC2qxTDOCxMbPdCQAQ
                                                               ? this.particleMultiplierCritical
                                                               : (
                                                                  var1
                                                                        == bsqEiiARMHW3736zGOGBtbS2Hf3wZktlTQxnxScJPIsQcqCzUjbbYxDHJnL7DPpGsisJEpvaR2RI5n59wPBJRByCL2fhjctOEVMf.agT8inGCbH8rayL8VsmaMaspbLMGTDlBxvqPNtSCjwfCRRGc6iLfpTSmirkhWw98WNUsLxy6fpx4xiEhjg3oGQ49nFAuKxcjw4x
                                                                     ? this.particleMultiplierSharpness
                                                                     : (
                                                                        var1
                                                                              == bsqEiiARMHW3736zGOGBtbS2Hf3wZktlTQxnxScJPIsQcqCzUjbbYxDHJnL7DPpGsisJEpvaR2RI5n59wPBJRByCL2fhjctOEVMf.uwmpQe9Z6P5oVtJ4Fngiye6Go07tT1k7MmJWyeIyQZtqKkGtsgtF82QEuqeLijTB8aHZ8IbS8cVrh5MTgtKjKuehs0ISeEviQqHk
                                                                           ? this.hudResourcePackTrim
                                                                           : (
                                                                              var1
                                                                                    == bsqEiiARMHW3736zGOGBtbS2Hf3wZktlTQxnxScJPIsQcqCzUjbbYxDHJnL7DPpGsisJEpvaR2RI5n59wPBJRByCL2fhjctOEVMf.Av9NCLMFKmcdQyDh94IetGz0HVnvO8Z0B91SkuS2PyEokqZHrbzx6ixu4d4MQrtbtjm2ELsB9G7tkxOyYXbuQSU73b4KPQTV9equ
                                                                                 ? this.fullbrightGamma
                                                                                 : (
                                                                                    var1
                                                                                          == bsqEiiARMHW3736zGOGBtbS2Hf3wZktlTQxnxScJPIsQcqCzUjbbYxDHJnL7DPpGsisJEpvaR2RI5n59wPBJRByCL2fhjctOEVMf.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA
                                                                                       ? this.backgroundBlurFade
                                                                                       : (
                                                                                          var1
                                                                                                == bsqEiiARMHW3736zGOGBtbS2Hf3wZktlTQxnxScJPIsQcqCzUjbbYxDHJnL7DPpGsisJEpvaR2RI5n59wPBJRByCL2fhjctOEVMf.LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN
                                                                                             ? this.backgroundBlurRadius
                                                                                             : 0.0F
                                                                                       )
                                                                                 )
                                                                           )
                                                                     )
                                                               )
                                                         )
                                                   )
                                             )
                                       )
                                 )
                           )
                     )
               )
         );
   }

   public void Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      bsqEiiARMHW3736zGOGBtbS2Hf3wZktlTQxnxScJPIsQcqCzUjbbYxDHJnL7DPpGsisJEpvaR2RI5n59wPBJRByCL2fhjctOEVMf var1, float var2
   ) {
      if (var1
            == bsqEiiARMHW3736zGOGBtbS2Hf3wZktlTQxnxScJPIsQcqCzUjbbYxDHJnL7DPpGsisJEpvaR2RI5n59wPBJRByCL2fhjctOEVMf.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I
         && Vfq9mSkAXpuxraNRNlMqE5xZv02b8IHnLyxD1GZO80ifGPGTX82Yf2B8EwOuuIxg0KubmG05rew2v1FPE8OdLwUzYRJDeshae83B.QcHYSL1fJpPwS8I6lDMqHeG0PpI9KENOilkz5Zn7Mesbj9VY4zckGxbjAEO8XHoUDZ8CippSgxILNeARjCg07BQVJdCIm7SIrBC0()
            != null) {
         Vfq9mSkAXpuxraNRNlMqE5xZv02b8IHnLyxD1GZO80ifGPGTX82Yf2B8EwOuuIxg0KubmG05rew2v1FPE8OdLwUzYRJDeshae83B.QcHYSL1fJpPwS8I6lDMqHeG0PpI9KENOilkz5Zn7Mesbj9VY4zckGxbjAEO8XHoUDZ8CippSgxILNeARjCg07BQVJdCIm7SIrBC0()
            .Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var2);
      }

      if (var1
         == bsqEiiARMHW3736zGOGBtbS2Hf3wZktlTQxnxScJPIsQcqCzUjbbYxDHJnL7DPpGsisJEpvaR2RI5n59wPBJRByCL2fhjctOEVMf.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW
         )
       {
         this.pingOnTabScale = var2;
      }

      if (var1
         == bsqEiiARMHW3736zGOGBtbS2Hf3wZktlTQxnxScJPIsQcqCzUjbbYxDHJnL7DPpGsisJEpvaR2RI5n59wPBJRByCL2fhjctOEVMf.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5
         )
       {
         this.keystrokesFade = (int)var2;
      }

      if (var1
         == bsqEiiARMHW3736zGOGBtbS2Hf3wZktlTQxnxScJPIsQcqCzUjbbYxDHJnL7DPpGsisJEpvaR2RI5n59wPBJRByCL2fhjctOEVMf.PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u
         )
       {
         this.keystrokesSpacing = var2;
      }

      if (var1
         == bsqEiiARMHW3736zGOGBtbS2Hf3wZktlTQxnxScJPIsQcqCzUjbbYxDHJnL7DPpGsisJEpvaR2RI5n59wPBJRByCL2fhjctOEVMf.uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590
         )
       {
         this.itemPhysicsRotationSpeed = (int)var2;
      }

      if (var1
         == bsqEiiARMHW3736zGOGBtbS2Hf3wZktlTQxnxScJPIsQcqCzUjbbYxDHJnL7DPpGsisJEpvaR2RI5n59wPBJRByCL2fhjctOEVMf.QcHYSL1fJpPwS8I6lDMqHeG0PpI9KENOilkz5Zn7Mesbj9VY4zckGxbjAEO8XHoUDZ8CippSgxILNeARjCg07BQVJdCIm7SIrBC0
         )
       {
         this.timeChangerValue = (int)var2;
      }

      if (var1
         == bsqEiiARMHW3736zGOGBtbS2Hf3wZktlTQxnxScJPIsQcqCzUjbbYxDHJnL7DPpGsisJEpvaR2RI5n59wPBJRByCL2fhjctOEVMf.kpjeuvirVi401rGj4cseffd4WxtSSMZm3fFgpSU28wbJZ50n48BdWMQa6TLB5qajxzarOlQ9OP0uFpV2DZPAvWuKoICgD6I2s6EQ
         )
       {
         this.smoothScrollMultiplier = var2 / 10.0F;
      }

      if (var1
         == bsqEiiARMHW3736zGOGBtbS2Hf3wZktlTQxnxScJPIsQcqCzUjbbYxDHJnL7DPpGsisJEpvaR2RI5n59wPBJRByCL2fhjctOEVMf.y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY
         )
       {
         this.spotifyOverlayStay = (int)var2;
      }

      if (var1
         == bsqEiiARMHW3736zGOGBtbS2Hf3wZktlTQxnxScJPIsQcqCzUjbbYxDHJnL7DPpGsisJEpvaR2RI5n59wPBJRByCL2fhjctOEVMf.sZrYAdOvyZNrQTQ3ZU8UOhdt4uTik3WKlaSKgnyMXjeCxz5oe8Mw0rtvMcjdpzjEHp0Gs48dlfFyZy3PJfJ9pOtzgSWW5nUaRf9
         )
       {
         this.blockOverlayOutlineWidth = var2;
      }

      if (var1
         == bsqEiiARMHW3736zGOGBtbS2Hf3wZktlTQxnxScJPIsQcqCzUjbbYxDHJnL7DPpGsisJEpvaR2RI5n59wPBJRByCL2fhjctOEVMf.lupDZ2Cnh8fIgzDGHlnSYSWdtTyhGvQM8ySvPCDcouYi9MkHlLktznCZqsSuMBFSPFPFDsZ7NP0MqV4XGlOC2qxTDOCxMbPdCQAQ
         )
       {
         this.particleMultiplierCritical = (int)var2;
      }

      if (var1
         == bsqEiiARMHW3736zGOGBtbS2Hf3wZktlTQxnxScJPIsQcqCzUjbbYxDHJnL7DPpGsisJEpvaR2RI5n59wPBJRByCL2fhjctOEVMf.agT8inGCbH8rayL8VsmaMaspbLMGTDlBxvqPNtSCjwfCRRGc6iLfpTSmirkhWw98WNUsLxy6fpx4xiEhjg3oGQ49nFAuKxcjw4x
         )
       {
         this.particleMultiplierSharpness = (int)var2;
      }

      if (var1
         == bsqEiiARMHW3736zGOGBtbS2Hf3wZktlTQxnxScJPIsQcqCzUjbbYxDHJnL7DPpGsisJEpvaR2RI5n59wPBJRByCL2fhjctOEVMf.uwmpQe9Z6P5oVtJ4Fngiye6Go07tT1k7MmJWyeIyQZtqKkGtsgtF82QEuqeLijTB8aHZ8IbS8cVrh5MTgtKjKuehs0ISeEviQqHk
         )
       {
         this.hudResourcePackTrim = (int)var2;
      }

      if (var1
         == bsqEiiARMHW3736zGOGBtbS2Hf3wZktlTQxnxScJPIsQcqCzUjbbYxDHJnL7DPpGsisJEpvaR2RI5n59wPBJRByCL2fhjctOEVMf.Av9NCLMFKmcdQyDh94IetGz0HVnvO8Z0B91SkuS2PyEokqZHrbzx6ixu4d4MQrtbtjm2ELsB9G7tkxOyYXbuQSU73b4KPQTV9equ
         )
       {
         this.fullbrightGamma = (int)var2;
      }

      if (var1
         == bsqEiiARMHW3736zGOGBtbS2Hf3wZktlTQxnxScJPIsQcqCzUjbbYxDHJnL7DPpGsisJEpvaR2RI5n59wPBJRByCL2fhjctOEVMf.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA
         )
       {
         this.backgroundBlurFade = var2;
      }

      if (var1
         == bsqEiiARMHW3736zGOGBtbS2Hf3wZktlTQxnxScJPIsQcqCzUjbbYxDHJnL7DPpGsisJEpvaR2RI5n59wPBJRByCL2fhjctOEVMf.LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN
         )
       {
         this.backgroundBlurRadius = var2;
      }
   }

   public String BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(
      bsqEiiARMHW3736zGOGBtbS2Hf3wZktlTQxnxScJPIsQcqCzUjbbYxDHJnL7DPpGsisJEpvaR2RI5n59wPBJRByCL2fhjctOEVMf var1
   ) {
      if (var1
         == bsqEiiARMHW3736zGOGBtbS2Hf3wZktlTQxnxScJPIsQcqCzUjbbYxDHJnL7DPpGsisJEpvaR2RI5n59wPBJRByCL2fhjctOEVMf.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I
         )
       {
         return rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
               "options.chat.scale"
            )
            + ": "
            + (int)(
               (
                     Vfq9mSkAXpuxraNRNlMqE5xZv02b8IHnLyxD1GZO80ifGPGTX82Yf2B8EwOuuIxg0KubmG05rew2v1FPE8OdLwUzYRJDeshae83B.QcHYSL1fJpPwS8I6lDMqHeG0PpI9KENOilkz5Zn7Mesbj9VY4zckGxbjAEO8XHoUDZ8CippSgxILNeARjCg07BQVJdCIm7SIrBC0()
                           != null
                        ? Vfq9mSkAXpuxraNRNlMqE5xZv02b8IHnLyxD1GZO80ifGPGTX82Yf2B8EwOuuIxg0KubmG05rew2v1FPE8OdLwUzYRJDeshae83B.QcHYSL1fJpPwS8I6lDMqHeG0PpI9KENOilkz5Zn7Mesbj9VY4zckGxbjAEO8XHoUDZ8CippSgxILNeARjCg07BQVJdCIm7SIrBC0()
                           .RModJZEOhhjT4uPKAuLskN6fUYKpGeXWlTKMKzVCotnh8IDpnUM8zKUPyM7irhoYqhF5jIRt2a397vXyAe9gezlx1K6YataCwKwM()
                        : 0.0F
                  )
                  * 100.0F
            )
            + "%";
      } else if (var1
         == bsqEiiARMHW3736zGOGBtbS2Hf3wZktlTQxnxScJPIsQcqCzUjbbYxDHJnL7DPpGsisJEpvaR2RI5n59wPBJRByCL2fhjctOEVMf.BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW
         )
       {
         return rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
               "options.chat.scale"
            )
            + ": "
            + (int)(this.pingOnTabScale * 100.0F)
            + "%";
      } else if (var1
         == bsqEiiARMHW3736zGOGBtbS2Hf3wZktlTQxnxScJPIsQcqCzUjbbYxDHJnL7DPpGsisJEpvaR2RI5n59wPBJRByCL2fhjctOEVMf.vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5
         )
       {
         return rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
               "bm.options.fade"
            )
            + ": "
            + this.keystrokesFade
            + " "
            + rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
               "bm.options.milliseconds"
            );
      } else if (var1
         == bsqEiiARMHW3736zGOGBtbS2Hf3wZktlTQxnxScJPIsQcqCzUjbbYxDHJnL7DPpGsisJEpvaR2RI5n59wPBJRByCL2fhjctOEVMf.PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u
         )
       {
         return rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
               "bm.options.spacing"
            )
            + ": "
            + this.keystrokesSpacing
            + " px";
      } else if (var1
         == bsqEiiARMHW3736zGOGBtbS2Hf3wZktlTQxnxScJPIsQcqCzUjbbYxDHJnL7DPpGsisJEpvaR2RI5n59wPBJRByCL2fhjctOEVMf.uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590
         )
       {
         return rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
               "bm.options.speed"
            )
            + ": "
            + this.itemPhysicsRotationSpeed;
      } else if (var1
         == bsqEiiARMHW3736zGOGBtbS2Hf3wZktlTQxnxScJPIsQcqCzUjbbYxDHJnL7DPpGsisJEpvaR2RI5n59wPBJRByCL2fhjctOEVMf.QcHYSL1fJpPwS8I6lDMqHeG0PpI9KENOilkz5Zn7Mesbj9VY4zckGxbjAEO8XHoUDZ8CippSgxILNeARjCg07BQVJdCIm7SIrBC0
         )
       {
         return this.timeChangerValue == 6L
            ? rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
               "bm.timechanger.day"
            )
            : (
               this.timeChangerValue == 14L
                  ? rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                     "bm.timechanger.sunset"
                  )
                  : (
                     this.timeChangerValue == 18L
                        ? rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                           "bm.timechanger.night"
                        )
                        : rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                              "bm.value"
                           )
                           + ": "
                           + this.timeChangerValue
                  )
            );
      } else if (var1
         == bsqEiiARMHW3736zGOGBtbS2Hf3wZktlTQxnxScJPIsQcqCzUjbbYxDHJnL7DPpGsisJEpvaR2RI5n59wPBJRByCL2fhjctOEVMf.kpjeuvirVi401rGj4cseffd4WxtSSMZm3fFgpSU28wbJZ50n48BdWMQa6TLB5qajxzarOlQ9OP0uFpV2DZPAvWuKoICgD6I2s6EQ
         )
       {
         return rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
               "bm.options.multiplier"
            )
            + ": "
            + (int)(this.smoothScrollMultiplier * 10.0F);
      } else if (var1
         == bsqEiiARMHW3736zGOGBtbS2Hf3wZktlTQxnxScJPIsQcqCzUjbbYxDHJnL7DPpGsisJEpvaR2RI5n59wPBJRByCL2fhjctOEVMf.y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY
         )
       {
         return rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
               "bm.options.stay"
            )
            + ": "
            + this.spotifyOverlayStay
            + " s";
      } else if (var1
         == bsqEiiARMHW3736zGOGBtbS2Hf3wZktlTQxnxScJPIsQcqCzUjbbYxDHJnL7DPpGsisJEpvaR2RI5n59wPBJRByCL2fhjctOEVMf.sZrYAdOvyZNrQTQ3ZU8UOhdt4uTik3WKlaSKgnyMXjeCxz5oe8Mw0rtvMcjdpzjEHp0Gs48dlfFyZy3PJfJ9pOtzgSWW5nUaRf9
         )
       {
         return rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
               "bm.options.outline_width"
            )
            + ": "
            + (int)this.blockOverlayOutlineWidth
            + " px";
      } else if (var1
         == bsqEiiARMHW3736zGOGBtbS2Hf3wZktlTQxnxScJPIsQcqCzUjbbYxDHJnL7DPpGsisJEpvaR2RI5n59wPBJRByCL2fhjctOEVMf.lupDZ2Cnh8fIgzDGHlnSYSWdtTyhGvQM8ySvPCDcouYi9MkHlLktznCZqsSuMBFSPFPFDsZ7NP0MqV4XGlOC2qxTDOCxMbPdCQAQ
         )
       {
         return this.particleMultiplierCritical == 0
            ? rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
               "bm.disabled"
            )
            : (
               this.particleMultiplierCritical == 1
                  ? rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                     "bm.default"
                  )
                  : rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                        "bm.options.multiplier"
                     )
                     + ": "
                     + this.particleMultiplierCritical
                     + "x"
            );
      } else if (var1
         == bsqEiiARMHW3736zGOGBtbS2Hf3wZktlTQxnxScJPIsQcqCzUjbbYxDHJnL7DPpGsisJEpvaR2RI5n59wPBJRByCL2fhjctOEVMf.agT8inGCbH8rayL8VsmaMaspbLMGTDlBxvqPNtSCjwfCRRGc6iLfpTSmirkhWw98WNUsLxy6fpx4xiEhjg3oGQ49nFAuKxcjw4x
         )
       {
         return this.particleMultiplierSharpness == 0
            ? rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
               "bm.disabled"
            )
            : (
               this.particleMultiplierSharpness == 1
                  ? rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                     "bm.default"
                  )
                  : rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                        "bm.options.multiplier"
                     )
                     + ": "
                     + this.particleMultiplierSharpness
                     + "x"
            );
      } else if (var1
         == bsqEiiARMHW3736zGOGBtbS2Hf3wZktlTQxnxScJPIsQcqCzUjbbYxDHJnL7DPpGsisJEpvaR2RI5n59wPBJRByCL2fhjctOEVMf.uwmpQe9Z6P5oVtJ4Fngiye6Go07tT1k7MmJWyeIyQZtqKkGtsgtF82QEuqeLijTB8aHZ8IbS8cVrh5MTgtKjKuehs0ISeEviQqHk
         )
       {
         return rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
               "bm.options.trimmed_width"
            )
            + ": "
            + this.hudResourcePackTrim
            + " px";
      } else if (var1
         == bsqEiiARMHW3736zGOGBtbS2Hf3wZktlTQxnxScJPIsQcqCzUjbbYxDHJnL7DPpGsisJEpvaR2RI5n59wPBJRByCL2fhjctOEVMf.Av9NCLMFKmcdQyDh94IetGz0HVnvO8Z0B91SkuS2PyEokqZHrbzx6ixu4d4MQrtbtjm2ELsB9G7tkxOyYXbuQSU73b4KPQTV9equ
         )
       {
         return rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
               "options.gamma"
            )
            + ": +"
            + this.fullbrightGamma
            + "%";
      } else if (var1
         == bsqEiiARMHW3736zGOGBtbS2Hf3wZktlTQxnxScJPIsQcqCzUjbbYxDHJnL7DPpGsisJEpvaR2RI5n59wPBJRByCL2fhjctOEVMf.aHV8Pc8fKaYoTFVjg5nNPReU6wuKOE57VLPQA1JDXf6oEySyuPy65TWgIpLNrB3svE7ygGUPECsf6pZWPobt6CeAnVJt70ekjPGA
         )
       {
         return rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
               "bm.options.fade"
            )
            + ": "
            + (int)this.backgroundBlurFade
            + " "
            + rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
               "bm.options.milliseconds"
            );
      } else {
         return var1
               == bsqEiiARMHW3736zGOGBtbS2Hf3wZktlTQxnxScJPIsQcqCzUjbbYxDHJnL7DPpGsisJEpvaR2RI5n59wPBJRByCL2fhjctOEVMf.LU8Huv8dNJpML2JB8fJWzj9J43KolrD8eyRsYcSdQZ3KH8jshbGfdwvq3RpIPDuukZZv21DROpftzYXoq05vVeGAMsPHlkNSkgtN
            ? rNwJ4I02OUAysDSPHru31rx6EAmfjS0D4tuupAIkr95xZWRMo0w98vizVfxup78guYqYVHssdUknEbQvin7dHl8cJfr1BY8hIU75.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                  "bm.options.radius"
               )
               + ": "
               + (int)this.backgroundBlurRadius
               + " px"
            : null;
      }
   }

   static {
      WALLPAPERS[0] = new VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h("auto_randomize");
      WALLPAPERS[1] = new VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h("randomize");

      for (int var0 = 0;
         var0
            < aPyvloaczxvJEpKcdCXw5tr0KLcON9kP2nQEKjfX2Qyx7yra7So3KuV4CMDmf4MkjS6VRxUMWCXevpWX2N6rcH4Kuvd46dus01W8.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I().length;
         var0++
      ) {
         WALLPAPERS[var0 + 2] = new VrEi1wxT4T9gmHAiPj4WYApoJ5uQJteMdWjwnVoFMNQ9lPrxHah12cUsSyGlUAIgyPazxQFFtZqGPt9A5zK4vi0rsM9aUdahq39h(
            "wallpaper."
               + aPyvloaczxvJEpKcdCXw5tr0KLcON9kP2nQEKjfX2Qyx7yra7So3KuV4CMDmf4MkjS6VRxUMWCXevpWX2N6rcH4Kuvd46dus01W8.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I()[var0]
                  .QcHYSL1fJpPwS8I6lDMqHeG0PpI9KENOilkz5Zn7Mesbj9VY4zckGxbjAEO8XHoUDZ8CippSgxILNeARjCg07BQVJdCIm7SIrBC0()
         );
      }
   }
}
