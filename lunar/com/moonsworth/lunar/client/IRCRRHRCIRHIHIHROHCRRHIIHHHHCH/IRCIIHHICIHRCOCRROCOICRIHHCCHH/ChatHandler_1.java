package com.moonsworth.lunar.client.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BiConsumer;

public final class CRRRICCRROCOHHOHIICIHORCOORRRH {
   private static final Map<Integer, String> HOHCRORHIHRHOCIIOHRCRICICHRIHH = COIORRCOCHCRRIROHOOHHICRCRCHCO();
   private static final Map<Integer, String> IIICCCCROCCRRHCRRRCROHHORHRHHR = HCIOORIHIRIOCIOROCORRORCCROHOH();
   private static final Map<String, String> RIHOCHRHROOIIHRRHIOIORRCHOCHOR = new LinkedHashMap<String, String>() {
      {
         this.put("helmet:", "ARMORSTATUS_HELMET_CHILD");
         this.put("chestplate:", "ARMORSTATUS_CHESTPLATE_CHILD");
         this.put("leggings:", "ARMORSTATUS_LEGGINGS_CHILD");
         this.put("bootsConfig:", "ARMORSTATUS_BOOTS_CHILD");
         this.put("mainhand:", "ARMORSTATUS_HELD_ITEM_CHILD");
         this.put("offhand:", "ARMORSTATUS_OFF_HAND_HELD_ITEM_CHILD");
      }
   };
   private static final BiConsumer<HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH, JsonObject> RICRRCIHRCHCIHRHHOHIHIOIRHHHIH = (var0, var1) -> {};

   public com.moonsworth.lunar.client.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      HHCCIRHCCCIIRHCROHIORHIRHHIORH var1
   ) {
      return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, null, null);
   }

   public com.moonsworth.lunar.client.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      HHCCIRHCCCIIRHCROHIORHIRHHIORH var1, JsonArray var2
   ) {
      return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2, null);
   }

   public com.moonsworth.lunar.client.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      HHCCIRHCCCIIRHCROHIORHIRHHIORH var1, JsonArray var2, JsonObject var3
   ) {
      CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 = new CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1);
      var4.IRCIIHHICIHRCOCRROCOICRIHHCCHH("FPS", "fps", (var0, var1x) -> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1x, "reverseOrder", var0, "reversed"));
      var4.IRCIIHHICIHRCOCRROCOICRIHHCCHH("CPS", "cps", (var0, var1x) -> {
         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1x, "showCPSText", var0, "showCPSText");
         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1x, "rightClick", var0, "right");
         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1x, "lineColor", var0.COOIROCORRIHROOCCRCOIOCOHHRROO("lineColor"));
      });
      var4.IRCIIHHICIHRCOCRROCOICRIHHCCHH("KEYSTROKES", "keystrokes", CRRRICCRROCOHHOHIICIHORCOORRRH::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH);
      var4.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         "COORDINATES", "coordinates", (var0, var1x) -> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1x, "decimalCoordinates", var0, "showCoordDecimals")
      );
      var4.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         "COORDINATES", "coordinates", "COORDINATES_X_CHILD", "COORDINATES_Y_CHILD", "COORDINATES_Z_CHILD", "COORDINATES_C_CHILD"
      );
      var4.IRCIIHHICIHRCOCRROCOICRIHHCCHH("ARMORSTATUS", "armorStatus", CRRRICCRROCOHHOHIICIHORCOORRRH::IRCIIHHICIHRCOCRROCOICRIHHCCHH);
      var4.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         "ARMORSTATUS",
         "armorStatus",
         "ARMORSTATUS_HELD_ITEM_CHILD",
         "ARMORSTATUS_HELMET_CHILD",
         "ARMORSTATUS_CHESTPLATE_CHILD",
         "ARMORSTATUS_LEGGINGS_CHILD",
         "ARMORSTATUS_BOOTS_CHILD",
         "ARMORSTATUS_OFF_HAND_HELD_ITEM_CHILD",
         "ARMORSTATUS_PROTECTION_CHILD"
      );
      var4.IHHIROIRHHOIOCHCHCCCIRHRIROIIO();
      var4.IRCIIHHICIHRCOCRROCOICRIHHCCHH("REACH_DISPLAY", "reachDisplay", RICRRCIHRCHCIHRHHOHIHIOIRHHHIH);
      var4.IRCIIHHICIHRCOCRROCOICRIHHCCHH("COMBO", "comboDisplay", RICRRCIHRCHCIHRHHOHIHIOIRHHHIH);
      var4.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         "POTION_EFFECTS", "potionEffects", (var0, var1x) -> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1x, "showAmplifier", var0, "showAmplifier")
      );
      var4.IRCIIHHICIHRCOCRROCOICRIHHCCHH("SCOREBOARD", "scoreboard", CRRRICCRROCOHHOHIICIHORCOORRRH::HHCCIRHCCCIIRHCROHIORHIRHHIORH);
      var4.IRCIIHHICIHRCOCRROCOICRIHHCCHH("MOMENTUM", "speedMeter", RICRRCIHRCHCIHRHHOHIHIOIRHHHIH);
      var4.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         "WAILA", "blockIndicator", (var0, var1x) -> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1x, "showBreakTime", var0, "showBlockBreakingPercentage")
      );
      var4.IRCIIHHICIHRCOCRROCOICRIHHCCHH("TAB", "tablist", RICRRCIHRCHCIHRHHOHIHIOIRHHHIH);
      var4.IRCIIHHICIHRCOCRROCOICRIHHCCHH("NAMETAG", "nametags", (var0, var1x) -> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1x, "nametagShadow", var0, "textShadow"));
      var4.IRCIIHHICIHRCOCRROCOICRIHHCCHH("DIRECTION_HUD", "direction", CRRRICCRROCOHHOHIICIHORCOORRRH::CRRRICCRROCOHHOHIICIHORCOORRRH);
      var4.IRCIIHHICIHRCOCRROCOICRIHHCCHH("CLOCK", "time", RICRRCIHRCHCIHRHHOHIHIOIRHHHIH);
      var4.IRCIIHHICIHRCOCRROCOICRIHHCCHH("ITEM_COUNTER", "itemCounter", RICRRCIHRCHCIHRHHOHIHIOIRHHHIH);
      var4.HHHCOOOORCRCIOIOORIHHIROOCCIIH();
      var4.IRCIIHHICIHRCOCRROCOICRIHHCCHH("HORSE_STATS", "horses", RICRRCIHRCHCIHRHHOHIHIOIRHHHIH);
      var4.IRCIIHHICIHRCOCRROCOICRIHHCCHH("STOPWATCH", "stopwatch1", RICRRCIHRCHCIHRHHOHIHIOIRHHHIH);
      var4.IRCIIHHICIHRCOCRROCOICRIHHCCHH("SERVER_ADDRESS", "serverAddress", RICRRCIHRCHCIHRHHOHIHIOIRHHHIH);
      var4.IRCIIHHICIHRCOCRROCOICRIHHCCHH("PLAYTIME", "playtime", RICRRCIHRCHCIHRHHOHIHIOIRHHHIH);
      var4.IRCIIHHICIHRCOCRROCOICRIHHCCHH("MEMORY", "systemresources", RICRRCIHRCHCIHRHHOHIHIOIRHHHIH);
      var4.IRCIIHHICIHRCOCRROCOICRIHHCCHH("TNT_COUNTDOWN", "tnttimer", RICRRCIHRCHCIHRHHOHIHIOIRHHHIH);
      var4.IRCIIHHICIHRCOCRROCOICRIHHCCHH("PACK_DISPLAY", "packdisplay", RICRRCIHRCHCIHRHHOHIHIOIRHHHIH);
      var4.IRCIIHHICIHRCOCRROCOICRIHHCCHH("BOSSBAR", "bossBar", RICRRCIHRCHCIHRHHOHIHIOIRHHHIH);
      var4.IRCIIHHICIHRCOCRROCOICRIHHCCHH("TITLES", "titletweaker", RICRRCIHRCHCIHRHHOHIHIOIRHHHIH);
      var4.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("PING", "PING_HUD", "ping", (var0, var1x) -> var1x.addProperty("showPingPrefix", false), (var0, var1x) -> {
         IRCIIHHICIHRCOCRROCOICRIHHCCHH var2x = var0.COOIROCORRIHROOCCRCOIOCOHHRROO("textColor");
         if (var2x != null) {
            var1x.addProperty("overridePingTextColor", true);
            RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1x, "pingTextColor", var2x);
         }
      });
      var4.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("SATURATION", "SATURATION_HUD_CHILD", "saturation", RICRRCIHRCHCIHRHHOHIHIOIRHHHIH, RICRRCIHRCHCIHRHHOHIHIOIRHHHIH);
      var4.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("TOTEM_COUNTER", "TOTEM_COUNTER_HUD_CHILD", "totem", RICRRCIHRCHCIHRHHOHIHIOIRHHHIH, RICRRCIHRCHCIHRHHOHIHIOIRHHHIH);
      var4.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("TOGGLE_SNEAK", "TOGGLE_SNEAK_HUD_CHILD", "toggleSprint", (var0, var1x) -> {
         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1x, "toggleSprint", var0, "toggleSprint");
         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1x, "toggleSneak", var0, "toggleSneak");
         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1x, "flyBoost", var0, "flyBoostToggle");
         if (var0.has("flyBoostAmount")) {
            var1x.addProperty("flyBoostAmount", RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0.CRRRICCRROCOHHOHIICIHORCOORRRH("flyBoostAmount", 4.0F), 2, 8));
         }
      }, RICRRCIHRCHCIHRHHOHIHIOIRHHHIH);
      var4.IORRRRHRRHRROCRHIROCRHCHCCRRHI();
      var4.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("ZOOM", "zoom", (var0, var1x) -> {
         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1x, "smoothZoom", var0, "smoothZoom");
         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1x, "smoothCamera", var0, "smoothMovement");
         IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1x, "zoomKeybind", var0.HIOIOHROHRCRIIRHIICRRHCHHHHIHH("keyZoom"));
      });
      var4.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("LIGHTING", "brightness", RICRRCIHRCHCIHRHHOHIHIOIRHHHIH);
      var4.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("FOV", "fovChanger", RICRRCIHRCHCIHRHHOHIHIOIRHHHIH);
      var4.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("FOG", "customfog", RICRRCIHRCHCIHRHHOHIHIOIRHHHIH);
      var4.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("MOTION_BLUR", "motionBlur", RICRRCIHRCHCIHRHHOHIHIOIRHHHIH);
      var4.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("ITEM_PHYSICS", "itemPhysic", RICRRCIHRCHCIHRHHOHIHIOIRHHHIH);
      var4.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("BLOCK_OUTLINE", "blockOverlay", CRRRICCRROCOHHOHIICIHORCOORRRH::RRCRRCORICCHOHHIRCHIROOHIIOHCO);
      var4.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("SNAPLOOK", "snaplook", RICRRCIHRCHCIHRHHOHIHIOIRHHHIH);
      var4.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("NICK_HIDER", "nickHider", (var0, var1x) -> {
         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1x, "hideOwnName", var0, "hideOwnName");
         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1x, "hideOtherNames", var0, "hideOtherNames");
      });
      var4.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("HYPIXEL_MOD", "hypixel", (var0, var1x) -> {
         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1x, "autoGG", var0, "autoGGEnabled");
         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1x, "antiGG", var0, "antiGGEnabled");
         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1x, "levelHead", var0, "levelHeadEnabled");
         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1x, "autoFriend", var0, "autoFriendEnabled");
      });
      var4.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("ATTACK_INDICATOR", "attackIndicator", RICRRCIHRCHCIHRHHOHIHIOIRHHHIH);
      var4.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("SCREENSHOT", "screenshot", RICRRCIHRCHCIHRHHOHIHIOIRHHHIH);
      var4.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         "TIME_CHANGER", "timeChanger", (var0, var1x) -> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1x, "useRealTime", var0, "useRealWorldTime")
      );
      var4.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("WEATHER_CHANGER", "weatherchanger", CRRRICCRROCOHHOHIICIHORCOORRRH::RIOOCHICIHRHOHCCCCCHOCCCOHCRHI);
      var4.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("COLOR_SATURATION", "colorSaturation", CRRRICCRROCOHHOHIICIHORCOORRRH::HRCHROOHRIHCRCRHRIIROCIRHOIRHH);
      var4.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("SHULKER_PREVIEW", "shulkertooltips", RICRRCIHRCHCIHRHHOHIHIOIRHHHIH);
      var4.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("UHC_OVERLAY", "uhcoverlay", RICRRCIHRCHCIHRHHOHIHIOIRHHHIH);
      var4.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("WAYPOINTS", "waypoints", RICRRCIHRCHCIHRHHOHIHIOIRHHHIH);
      var4.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("SCROLLABLE_TOOLTIPS", "tooltips", RICRRCIHRCHCIHRHHOHIHIOIRHHHIH);
      var4.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var2);
      var4.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("TEAM_VIEW", "teamtracker", RICRRCIHRCHCIHRHHOHIHIOIRHHHIH);
      var4.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("INVENTORY_MOD", "inventory", RICRRCIHRCHCIHRHHOHIHIOIRHHHIH);
      var4.IRCHRIHOORHIRRCRRHIHCCRROORCOO();
      var4.HICOIIHORCCIOHCHHCHHCOIIHOCOCR();
      var4.RIRRCIRIIOHOCOIRHRORCOCIOHIROH();
      var4.RROORHCHHHOROCCCCIOIOROOCROHII();
      var4.IIIIRHIHROIRCROHHROIHIIHRCRRHO(var3);
      var4.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("TIER_TAGGER", "tiertagger", RICRRCIHRCHCIHRHHOHIHIOIRHHHIH);
      var4.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("GLINT_COLORIZER", "glint", RICRRCIHRCHCIHRHHOHIHIOIRHHHIH);
      var4.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("HITBOX", "hitbox", RICRRCIHRCHCIHRHHOHIHIOIRHHHIH);
      var4.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("CHAT", "customChat", RICRRCIHRCHCIHRHHOHIHIOIRHHHIH);
      var4.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("F3_DISPLAY", "customf3", RICRRCIHRCHCIHRHHOHIHIOIRHHHIH);
      return var4.OORCROORCOCIORHHCIRICOOOOHRROH();
   }

   private static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var0, JsonObject var1) {
      boolean var2 = "fill".equalsIgnoreCase(var0.CCHORHIOORICCIRIHRIIHIICORIORO("animType", "fill"));
      var1.addProperty("animate", var2);
      if (var2) {
         var1.addProperty("animation", "Smooth Fill");
         var1.addProperty("animationType", "synced");
         var1.addProperty("timerType", "complete");
         var1.addProperty("duration", clamp(var0.CRRRICCRROCOHHOHIICIHORCOORRRH("fadeTime", 150.0F) / 1000.0F, 0.1F, 1.0F));
      } else if (var0.has("fadeTime")) {
         var1.addProperty("keyFadeDelay", RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0.CRRRICCRROCOHHOHIICIHORCOORRRH("fadeTime", 150.0F), 0, 500));
      }

      String var3 = var0.CCHORHIOORICCIRIHRIIHIICORIORO("keysDisplayMode", "names");
      var1.addProperty("keyStrokesMovement", !"none".equalsIgnoreCase(var3));
      var1.addProperty("useArrows", "arrows".equalsIgnoreCase(var3));
      var1.addProperty("keyStrokesClicks", !"none".equalsIgnoreCase(var0.CCHORHIOORICCIRIHRIIHIICORIORO("clicksDisplayMode", "names")));
      var1.addProperty("keyStrokesSpacebar", !"none".equalsIgnoreCase(var0.CCHORHIOORICCIRIHRIIHIICORIORO("jumpDisplayMode", "arrows")));
      boolean var4 = "withClicks".equalsIgnoreCase(var0.CCHORHIOORICCIRIHRIIHIICORIORO("cpsDisplayMode", "separate"));
      var1.addProperty("leftCPS", var4);
      var1.addProperty("rightCPS", var4);
      if (var0.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR("border", false)) {
         var1.addProperty("innerBorder", true);
      }

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, "textPressedColor", var0.COOIROCORRIHROOCCRCOIOCOHHRROO("textActiveColor"));
      if (var0.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR("background", true)) {
         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, "backgroundPressedColor", var0.COOIROCORRIHROOCCRCOIOCOHHRROO("backgroundActiveColor"));
      } else {
         IHHCHHHCRIHOOCOIOOCRIIICIOROIR(var1, "backgroundColor");
         IHHCHHHCRIHOOCOIOOCRIIICIOROIR(var1, "backgroundPressedColor");
      }
   }

   private static void IRCIIHHICIHRCOCRROCOICRIHHCCHH(HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var0, JsonObject var1) {
      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, "itemDamage", var0, "showItemDamage");
      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, "maxDamage", var0, "showMaxDamage");
      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, "itemName", var0, "enableItemName");
      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, "damageOverlay", var0, "showDamageOverlay");
      if (var0.has("dynamicColor")) {
         var1.addProperty("staticDamageColors", !var0.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR("dynamicColor", true));
      }

      if (var0.has("damageDisplayType")) {
         var1.addProperty("damageDisplay", RHCORIHRIORRHIRRRRCICOOORCRIHI(var0.CCHORHIOORICCIRIHRIIHIICORIORO("damageDisplayType", "value")));
      }

      if (var0.has("listMode")) {
         var1.addProperty("listMode", "horizontal".equalsIgnoreCase(var0.CCHORHIOORICCIRIHRIIHIICORIORO("listMode", "vertical")) ? "horizontal" : "vertical");
      }

      if (var0.has("textAlignment")) {
         var1.addProperty("durabilityPosition", RRROICIORROHIOIHORHRICHCOOORCC(var0.CCHORHIOORICCIRIHRIIHIICORIORO("textAlignment", "right")));
      }
   }

   private static void HHCCIRHCCCIIRHCROHIORHIRHHIORH(HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var0, JsonObject var1) {
      if (var0.has("showNumbers")) {
         var1.addProperty("numbers", !var0.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR("showNumbers", true));
      }

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, "headerColor", var0.COOIROCORRIHROOCCRCOIOCOHHRROO("titleBackgroundColor"));
      if (var0.has("background") && !var0.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR("background", true)) {
         IHHCHHHCRIHOOCOIOOCRIIICIOROIR(var1, "backgroundColor");
         IHHCHHHCRIHOOCOIOOCRIIICIOROIR(var1, "headerColor");
      }
   }

   private static void CRRRICCRROCOHHOHIICIHORCOORRRH(HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var0, JsonObject var1) {
      var1.addProperty("background", true);
      var1.addProperty("hudStyle", "normal");
      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, "textShadow", var0, "shadow");
      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, "directionColor", var0.COOIROCORRIHROOCCRCOIOCOHHRROO("directionColor"));
      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, "markerColor", var0.COOIROCORRIHROOCCRCOIOCOHHRROO("markerColor"));
      if (var0.has("width")) {
         var1.addProperty("width", clamp(var0.CRRRICCRROCOHHOHIICIHORCOORRRH("width", 300.0F), 168.0F, 448.0F));
      }
   }

   private static void RRCRRCORICCHOHHIRCHIROOHIIOHCO(HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var0, JsonObject var1) {
      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, "blockOutline", var0, "showOutline");
      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, "blockOutlineColor", var0.COOIROCORRIHROOCCRCOIOCOHHRROO("outlineColor"));
      if (var0.has("outlineThickness")) {
         var1.addProperty("blockOutlineWidth", clamp(var0.CRRRICCRROCOHHOHIICIHORCOORRRH("outlineThickness", 25.0F) / 10.0F, 1.0F, 10.0F));
      }

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, "blockOverlay", var0, "fill");
      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, "blockOverlayColor", var0.COOIROCORRIHROOCCRCOIOCOHHRROO("fillColor"));
      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, "blockOutlineSide", var0, "showSide");
      if (var0.has("shapeMode")) {
         boolean var2 = "dynamic".equalsIgnoreCase(var0.CCHORHIOORICCIRIHRIIHIICORIORO("shapeMode", "dynamic"));
         var1.addProperty("blockOutlineAccurate", var2);
         var1.addProperty("blockOverlayAccurate", var2);
      }
   }

   private static void RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var0, JsonObject var1) {
      String var2 = var0.CCHORHIOORICCIRIHRIIHIICORIORO("weatherMode", null);
      if (var2 != null) {
         switch (var2.toLowerCase()) {
            case "clear":
               var1.addProperty("weatherMode", "clear");
               break;
            case "rain":
               var1.addProperty("weatherMode", "rain");
               break;
            case "thunder":
               var1.addProperty("weatherMode", "rain");
               var1.addProperty("thunderStorm", true);
               break;
            default:
               var1.addProperty("weatherMode", "natural");
         }
      }

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, "rainColor", var0.COOIROCORRIHROOCCRCOIOCOHHRROO("fallingColor"));
   }

   private static void HRCHROOHRIHCRCRHRIIROCIRHOIRHH(HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var0, JsonObject var1) {
      if (var0.has("saturation")) {
         var1.addProperty("colorSaturationSaturation", clamp(var0.CRRRICCRROCOHHOHIICIHORCOORRRH("saturation", 0.0F) * 10.0F + 5.0F, 0.0F, 10.0F));
      }

      if (var0.has("brightness")) {
         var1.addProperty("colorSaturationBrightness", clamp(var0.CRRRICCRROCOHHOHIICIHORCOORRRH("brightness", 0.0F) * 10.0F + 5.0F, 0.0F, 10.0F));
      }

      if (var0.has("contrast")) {
         var1.addProperty("colorSaturationContrast", clamp(var0.CRRRICCRROCOHHOHIICIHORCOORRRH("contrast", 0.0F) * 10.0F + 5.0F, 0.0F, 10.0F));
      }

      if (var0.has("hue")) {
         var1.addProperty("colorSaturationHue", clamp(var0.CRRRICCRROCOHHOHIICIHORCOORRRH("hue", 0.0F) / 36.0F, 0.0F, 10.0F));
      }
   }

   private static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      JsonObject var0, String var1, HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2, String var3
   ) {
      if (var2.has(var3)) {
         var0.addProperty(var1, var2.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR(var3, false));
      }
   }

   private static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(JsonObject var0, String var1, IRCIIHHICIHRCOCRROCOICRIHHCCHH var2) {
      if (var2 != null) {
         JsonObject var3 = new JsonObject();
         if (var2.ICCICOOROCORCIHCOHCOORIHRRIRCO()) {
            var3.addProperty("value", (var2.alpha() & 0xFF) << 24 | 0xFF0000);
            var3.addProperty("chroma", true);
         } else {
            var3.addProperty("value", var2.HICOHOOHRHRRCIHRRCORRRHCIHOOCO());
         }

         var0.add(var1, var3);
      }
   }

   private static void IRCIIHHICIHRCOCRROCOICRIHHCCHH(JsonObject var0, String var1, Integer var2) {
      if (var2 != null) {
         String var3 = HOHCRORHIHRHOCIIOHRCRICICHRIHH.get(var2);
         if (var3 != null) {
            var0.addProperty(var1, var3);
         }
      }
   }

   private static JsonObject RIRHOCHIORCCIIOIIRHOCCCRHHCHHH(JsonElement var0) {
      if (var0 != null && var0.isJsonObject()) {
         JsonElement var1 = var0.getAsJsonObject().get("keys");
         if (var1 != null && var1.isJsonArray()) {
            boolean var2 = false;
            boolean var3 = false;
            boolean var4 = false;
            String var5 = null;

            for (JsonElement var7 : var1.getAsJsonArray()) {
               int var8 = var7.getAsInt();
               switch (var8) {
                  case 340:
                  case 344:
                     var2 = true;
                     break;
                  case 341:
                  case 345:
                     var3 = true;
                     break;
                  case 342:
                  case 346:
                     var4 = true;
                     break;
                  case 343:
                  default:
                     if (var5 == null) {
                        var5 = IIICCCCROCCRRHCRRRCROHHORHRHHR.get(var8);
                     }
               }
            }

            if (var5 == null) {
               return null;
            }

            JsonObject var9 = new JsonObject();
            var9.addProperty("value", var5);
            if (var2) {
               var9.addProperty("shift", true);
            }

            if (var3) {
               var9.addProperty("control", true);
            }

            if (var4) {
               var9.addProperty("alt", true);
            }

            return var9;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   private static int RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(float var0, int var1, int var2) {
      return Math.max(var1, Math.min(var2, Math.round(var0)));
   }

   private static float clamp(float var0, float var1, float var2) {
      return Math.max(var1, Math.min(var2, var0));
   }

   private static String ICHOCCCIHHOCRRIIICRHROIOHHROHO(String var0) {
      int var1 = var0.indexOf(36);
      if (var1 < 0) {
         return var0;
      }

      String var2 = var0.substring(0, var1);
      String var3 = var0.substring(var1 + 1);

      return switch (var2) {
         case "minecraft:potion" -> var3;
         case "minecraft:splash_potion" -> var3 + "_splash";
         case "minecraft:lingering_potion" -> var3 + "_lingering";
         default -> var2;
      };
   }

   private static String RHCORIHRIORRHIRRRRCICOOORCRIHI(String var0) {
      return switch (var0.toLowerCase()) {
         case "percent" -> "percent";
         case "none", "off" -> "none";
         default -> "value";
      };
   }

   private static String RRROICIORROHIOIHORHRICHCOOORCC(String var0) {
      return switch (var0.toLowerCase()) {
         case "up", "top" -> "top";
         case "down", "bottom" -> "bottom";
         case "left" -> "left";
         default -> "right";
      };
   }

   private static JsonObject RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO(JsonElement var0) {
      return var0 != null && var0.isJsonObject() ? var0.getAsJsonObject() : null;
   }

   private static void IHHCHHHCRIHOOCOIOOCRIIICIOROIR(JsonObject var0, String var1) {
      JsonObject var2 = new JsonObject();
      var2.addProperty("value", 0);
      var0.add(var1, var2);
   }

   static com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO RCHOHCHOICCORRROCRRRCOIHIROHOC(
      String var0
   ) {
      if (var0 == null) {
         return null;
      }

      return switch (var0.toLowerCase()) {
         case "top_left" -> com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.TOP_LEFT;
         case "top_center" -> com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.TOP_CENTER;
         case "top_right" -> com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.TOP_RIGHT;
         case "center_left", "middle_left" -> com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.MIDDLE_LEFT;
         case "center", "center_center", "middle_center" -> com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.MIDDLE_CENTER;
         case "center_right", "middle_right" -> com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.MIDDLE_RIGHT;
         case "bottom_left" -> com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.BOTTOM_LEFT;
         case "bottom_center" -> com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.BOTTOM_CENTER_R;
         case "bottom_right" -> com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.BOTTOM_RIGHT;
         default -> null;
      };
   }

   private static Map<Integer, String> COIORRCOCHCRRIROHOOHHICRCRCHCO() {
      HashMap var0 = new HashMap();

      for (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4 : com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.values()) {
         if (var4 != com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.KEY_NONE
            && !var4.isMouse()) {
            int var5 = var4.getVk();
            if (var5 != 0) {
               var0.putIfAbsent(var5, var4.name());
            }
         }
      }

      var0.put(16, com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.KEY_LSHIFT.name());
      var0.put(17, com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.KEY_LCONTROL.name());
      var0.put(18, com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.KEY_LMENU.name());
      var0.put(13, com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.KEY_RETURN.name());
      var0.put(187, com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.KEY_EQUALS.name());
      return var0;
   }

   private static Map<Integer, String> HCIOORIHIRIOCIOROCORRORCCROHOH() {
      HashMap var0 = new HashMap();

      for (char var1 = '0'; var1 <= '9'; var1++) {
         var0.put(Integer.valueOf(var1), "KEY_" + var1);
      }

      for (char var2 = 'A'; var2 <= 'Z'; var2++) {
         var0.put(Integer.valueOf(var2), "KEY_" + var2);
      }

      var0.put(32, com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.KEY_SPACE.name());
      var0.put(39, com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.KEY_APOSTROPHE.name());
      var0.put(44, com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.KEY_COMMA.name());
      var0.put(45, com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.KEY_MINUS.name());
      var0.put(46, com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.KEY_PERIOD.name());
      var0.put(47, com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.KEY_SLASH.name());
      var0.put(59, com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.KEY_SEMICOLON.name());
      var0.put(61, com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.KEY_EQUALS.name());
      var0.put(91, com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.KEY_LBRACKET.name());
      var0.put(92, com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.KEY_BACKSLASH.name());
      var0.put(93, com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.KEY_RBRACKET.name());
      var0.put(96, com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.KEY_GRAVE.name());
      var0.put(256, com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.KEY_ESCAPE.name());
      var0.put(257, com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.KEY_RETURN.name());
      var0.put(258, com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.KEY_TAB.name());
      var0.put(259, com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.KEY_BACK.name());
      var0.put(260, com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.KEY_INSERT.name());
      var0.put(261, com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.KEY_DELETE.name());
      var0.put(262, com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.KEY_RIGHT.name());
      var0.put(263, com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.KEY_LEFT.name());
      var0.put(264, com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.KEY_DOWN.name());
      var0.put(265, com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.KEY_UP.name());
      var0.put(266, com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.KEY_PGUP.name());
      var0.put(267, com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.KEY_PGDOWN.name());
      var0.put(268, com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.KEY_HOME.name());
      var0.put(269, com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.KEY_END.name());
      var0.put(280, com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.KEY_CAPITAL.name());
      var0.put(281, com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.KEY_SCROLL.name());
      var0.put(282, com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.KEY_NUMLOCK.name());
      var0.put(283, com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.KEY_PRINTSC.name());
      var0.put(284, com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.KEY_PAUSE.name());

      for (int var3 = 1; var3 <= 19; var3++) {
         var0.put(289 + var3, "KEY_F" + var3);
      }

      for (int var4 = 0; var4 <= 9; var4++) {
         var0.put(320 + var4, "KEY_NUMPAD" + var4);
      }

      var0.put(330, com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.KEY_DECIMAL.name());
      var0.put(331, com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.KEY_DIVIDE.name());
      var0.put(332, com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.KEY_MULTIPLY.name());
      var0.put(333, com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.KEY_SUBTRACT.name());
      var0.put(334, com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.KEY_ADD.name());
      var0.put(335, com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.KEY_NUMPADENTER.name());
      var0.put(336, com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.KEY_NUMPADEQUALS.name());
      var0.put(340, com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.KEY_LSHIFT.name());
      var0.put(341, com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.KEY_LCONTROL.name());
      var0.put(342, com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.KEY_LMENU.name());
      var0.put(343, com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.KEY_LWINDOWS.name());
      var0.put(344, com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.KEY_RSHIFT.name());
      var0.put(345, com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.KEY_RCONTROL.name());
      var0.put(346, com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.KEY_RMENU.name());
      var0.put(347, com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.KEY_RWINDOWS.name());
      return var0;
   }

   private static final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      private final HHCCIRHCCCIIRHCROHIORHIRHHIORH CRIRCIHHRCIHRIOOCCRCCOHCCORRIR;
      private final JsonObject HHCORCHIOHCIICCCROCRCRHHCIICIC = new JsonObject();
      private final List<String> RCCHHOOIRIHOHOORHORIHCCIIHICCC = new ArrayList<>();

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HHCCIRHCCCIIRHCROHIORHIRHHIORH var1) {
         this.CRIRCIHHRCIHRIOOCCRCCOHCCORRIR = var1;
         this.HHCORCHIOHCIICCCROCRCRHHCIICIC
            .addProperty(
               "version",
               com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OCCRIIOROHCIIOROCCCHOCIHHOOCIH
            );
      }

      void IRCIIHHICIHRCOCRROCOICRIHHCCHH(String var1, String var2, BiConsumer<HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH, JsonObject> var3) {
         HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 = this.HRHRORCIRICHCCCCCHICOOICIRHRIO(var1, var2);
         if (var4 != null) {
            JsonObject var5 = this.HHCORCHIOHCIICCCROCRCRHHCIICIC.getAsJsonObject(var1);
            JsonObject var6 = new JsonObject();
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4, var5, var6);
            this.RIROICHCRROROHCCROOCCCCOCHCCRI(var4, var6);
            var3.accept(var4, var6);
            RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var5, var6);
         }
      }

      void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         String var1,
         String var2,
         String var3,
         BiConsumer<HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH, JsonObject> var4,
         BiConsumer<HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH, JsonObject> var5
      ) {
         HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var6 = this.HRHRORCIRICHCCCCCHICOOICIRHRIO(var1, var3);
         if (var6 != null) {
            JsonObject var7 = this.HHCORCHIOHCIICCCROCRCRHHCIICIC.getAsJsonObject(var1);
            JsonObject var8 = new JsonObject();
            var4.accept(var6, var8);
            RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var7, var8);
            JsonObject var9 = new JsonObject();
            JsonObject var10 = new JsonObject();
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var6, var9, var10);
            this.RIROICHCRROROHCCROOCCCCOCHCCRI(var6, var10);
            var5.accept(var6, var10);
            RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var9, var10);
            if (!var9.entrySet().isEmpty()) {
               var7.add(var2, var9);
            }
         }
      }

      void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, String var2, BiConsumer<HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH, JsonObject> var3) {
         HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 = this.HRHRORCIRICHCCCCCHICOOICIRHRIO(var1, var2);
         if (var4 != null) {
            JsonObject var5 = new JsonObject();
            var3.accept(var4, var5);
            RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.HHCORCHIOHCIICCCROCRCRHHCIICIC.getAsJsonObject(var1), var5);
         }
      }

      private void RIROICHCRROROHCCROOCCCCOCHCCRI(HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1, JsonObject var2) {
         String var3 = var1.CCHORHIOORICCIRIHRIIHIICORIORO("displayMode", null);
         boolean var4 = "brackets".equalsIgnoreCase(var3);
         var2.addProperty("brackets", var4);
         if (var4) {
            CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, "bracketColor", var1.COOIROCORRIHROOCCRCOIOCOHHRROO("textColor"));
         }

         if (var1.has("background")) {
            var2.addProperty("background", var1.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR("background", true));
         } else if (var3 != null) {
            var2.addProperty("background", "background".equalsIgnoreCase(var3));
         }

         CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, "backgroundColor", var1.COOIROCORRIHROOCCRCOIOCOHHRROO("backgroundColor"));
         String var5 = var1.CCHORHIOORICCIRIHRIIHIICORIORO("backgroundType", null);
         if (var5 != null) {
            boolean var6 = "static".equalsIgnoreCase(var5);
            var2.addProperty("staticBackgroundWidth", var6);
            var2.addProperty("staticBackgroundHeight", var6);
            if (var6) {
               if (var1.has("backgroundWidth")) {
                  var2.addProperty("backgroundWidth", Math.round(var1.CRRRICCRROCOHHOHIICIHORCOORRRH("backgroundWidth", 60.0F)));
               }

               if (var1.has("backgroundHeight")) {
                  var2.addProperty("backgroundHeight", Math.round(var1.CRRRICCRROCOHHOHIICIHORCOORRRH("backgroundHeight", 20.0F)));
               }
            }
         }

         CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, "border", var1, "border");
         CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, "borderColor", var1.COOIROCORRIHROOCCRCOIOCOHHRROO("borderColor"));
         if (var1.has("borderThickness1")) {
            var2.addProperty(
               "borderThickness", CRRRICCRROCOHHOHIICIHORCOORRRH.clamp(var1.CRRRICCRROCOHHOHIICIHORCOORRRH("borderThickness1", 1.0F) / 2.0F, 0.5F, 3.0F)
            );
         }

         CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, "textColor", var1.COOIROCORRIHROOCCRCOIOCOHHRROO("textColor"));
         CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, "textShadow", var1, "textShadow");
      }

      void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, String var2, String... var3) {
         HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 = this.CRIRCIHHRCIHRIOOCCRCCOHCCORRIR.CCRCCROHHIHRIIRHOROIOIRCRHHOHI(var2);
         if (var4 != null && this.HHCORCHIOHCIICCCROCRCRHHCIICIC.has(var1)) {
            JsonObject var5 = this.HHCORCHIOHCIICCCROCRCRHHCIICIC.getAsJsonObject(var1);

            for (String var9 : var3) {
               JsonObject var10 = var5.has(var9) ? var5.getAsJsonObject(var9) : new JsonObject();
               JsonObject var11 = new JsonObject();
               this.RIROICHCRROROHCCROOCCCCOCHCCRI(var4, var11);
               RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var10, var11);
               if (!var10.entrySet().isEmpty()) {
                  var5.add(var9, var10);
               }
            }
         }
      }

      void RROORHCHHHOROCCCCIOIOROOCROHII() {
         HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1 = this.CRIRCIHHRCIHRIOOCCRCCOHCCORRIR.CCRCCROHHIHRIIRHOROIOIRCRHHOHI("animations");
         if (var1 != null) {
            String var2 = var1.CCHORHIOORICCIRIHRIIHIICORIORO("hurtAnimationMode", "default").toLowerCase();
            if (!var2.equals("default") && this.HRHRORCIRICHCCCCCHICOOICIRHRIO("HURT_CAM", "animations") != null) {
               JsonObject var3 = new JsonObject();
               if (var2.equals("off")) {
                  var3.addProperty("disableHurtCam", true);
               } else {
                  var3.addProperty(
                     "hurtShakingIntensity", CRRRICCRROCOHHOHIICIHORCOORRRH.clamp(var1.CRRRICCRROCOHHOHIICIHORCOORRRH("hurtMultiplier", 1.0F), 0.0F, 2.0F)
                  );
               }

               RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.HHCORCHIOHCIICCCROCRCRHHCIICIC.getAsJsonObject("HURT_CAM"), var3);
            }
         }
      }

      void IIIIRHIHROIRCROHHROIHIIHRCRRHO(JsonObject var1) {
         if (var1 != null && var1.has("graphicsOptions") && !this.HHCORCHIOHCIICCCROCRCRHHCIICIC.has("OVERLAY_MOD")) {
            HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCOCHHHCCIORCORCHIOOOCCCCHICH(
               var1.getAsJsonObject("graphicsOptions")
            );
            JsonObject var3 = new JsonObject();
            if (var2.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR("minViewBobbing", false)) {
               var3.addProperty("minimalViewBobbing", true);
            }

            if (var2.has("clearGlass") && var2.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR("clearGlass", false)) {
               var3.addProperty("clearGlass", true);
               CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3, "clearColoredGlass", var2, "clearColoredGlass");
            }

            if (var2.has("fireHeight")) {
               var3.addProperty("fireHeight", CRRRICCRROCOHHOHIICIHORCOORRRH.clamp(var2.CRRRICCRROCOHHOHIICIHORCOORRRH("fireHeight", 1.0F), 0.0F, 2.0F));
            }

            if (!var3.entrySet().isEmpty()) {
               JsonObject var4 = new JsonObject();
               var4.addProperty("enabled", true);
               var4.addProperty("seen", true);
               var4.add("options", var3);
               this.HHCORCHIOHCIICCCROCRCRHHCIICIC.add("OVERLAY_MOD", var4);
            }
         }
      }

      void IRCHRIHOORHIRRCRRHIHCCRROORCOO() {
         HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1 = this.CRIRCIHHRCIHRIOOCCRCCOHCCORRIR.CCRCCROHHIHRIIRHOROIOIRCRHHOHI("inventory");
         if (var1 != null && this.HHCORCHIOHCIICCCROCRCRHHCIICIC.has("INVENTORY_MOD")) {
            HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = var1.RHRRRICCOOCRORCOIROOROCCOHRRHO("inventoryHud:");
            if (var2.has("hudEnabled1")) {
               JsonObject var3 = new JsonObject();
               var3.addProperty("enabled", var2.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR("hudEnabled1", false));
               com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO var4 = CRRRICCRROCOHHOHIICIHORCOORRRH.RCHOHCHOICCORRROCRRRCOIHIROHOC(
                  var2.ROCHCOOHRCROOOIHICOIIIOROCOHCO()
               );
               if (var4 != null) {
                  var3.addProperty("position", var4.id());
               }

               float var5 = var2.HIHOOROORCHCROHHIHRHICICHIICRR();
               if (var5 != 0.0F) {
                  var3.addProperty("x", var5);
               }

               float var6 = var2.HROHOIHRICOOHHHIOHHOIIHCRRCIOH();
               if (var6 != 0.0F) {
                  var3.addProperty("y", var6);
               }

               JsonObject var7 = new JsonObject();
               var7.addProperty("scale", CRRRICCRROCOHHOHIICIHORCOORRRH.clamp(var2.IICOHOIHOCIIRRCRRHHICHHCIOHCRC() * 0.35F, 0.25F, 5.0F));
               CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var7, "background", var1, "inventoryHudBackground");
               IRCIIHHICIHRCOCRROCOICRIHHCCHH var8 = var1.COOIROCORRIHROOCCRCOIOCOHHRROO("inventoryHudBackgroundColor");
               if (var8 != null) {
                  var7.addProperty("mcBackground", false);
                  var7.addProperty("backgroundColor", true);
                  CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var7, "color", var8);
               }

               CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var7, "grid", var1, "inventoryHudSlotBorder");
               CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  var7, "gridColor", var1.COOIROCORRIHROOCCRCOIOCOHHRROO("inventoryHudSlotBorderColor")
               );
               var3.add("options", var7);
               this.HHCORCHIOHCIICCCROCRCRHHCIICIC.getAsJsonObject("INVENTORY_MOD").add("INVENTORY_HUD", var3);
            }
         }
      }

      void HHHCOOOORCRCIOIOORIHHIROOCCIIH() {
         HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1 = this.CRIRCIHHRCIHRIOOCCRCCOHCCORRIR.CCRCCROHHIHRIIRHOROIOIRCRHHOHI("itemCounter");
         if (var1 != null && var1.IHIOIHRIHHHCCHCOIHOHROIRHRICIC() != null && this.HHCORCHIOHCIICCCROCRCRHHCIICIC.has("ITEM_COUNTER")) {
            JsonElement var2 = var1.IHIOIHRIHHHCCHCOIHOHROIRHRICIC().get("Config");
            if (var2 != null && var2.isJsonArray()) {
               JsonObject var3 = this.HHCORCHIOHCIICCCROCRCRHHCIICIC.getAsJsonObject("ITEM_COUNTER");
               boolean var4 = !"vertical".equalsIgnoreCase(var1.CCHORHIOORICCIRIHRIIHIICORIORO("displayMode", "horizontal"));
               com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO var5 = CRRRICCRROCOHHOHIICIHORCOORRRH.RCHOHCHOICCORRROCRRRCOIHIROHOC(
                  var1.ROCHCOOHRCROOOIHICOIIIOROCOHCO()
               );
               float var6 = var1.HIHOOROORCHCROHHIHRHICICHIICRR();
               float var7 = var1.HROHOIHRICOOHHHIOHHOIIHCRRCIOH();
               float var8 = 20.0F;
               byte var9 = 10;
               float var10 = var5 != null
                     && var5.getHorizontal()
                        == com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIGHT
                  ? -var8
                  : var8;
               float var11 = var5 != null
                     && var5.getVertical()
                        == com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.BOTTOM
                  ? -var8
                  : var8;
               LinkedHashSet var12 = new LinkedHashSet();
               LinkedHashMap var13 = new LinkedHashMap();
               boolean var14 = false;
               int var15 = 0;

               for (JsonElement var17 : var2.getAsJsonArray()) {
                  if (var17.isJsonObject()) {
                     JsonObject var18 = var17.getAsJsonObject();
                     JsonObject var19 = CRRRICCRROCOHHOHIICIHORCOORRRH.RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO(var18.get("settings"));
                     JsonObject var20 = CRRRICCRROCOHHOHIICIHORCOORRRH.RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO(var18.get("hudElementConfig"));
                     if (var19 != null && var19.has("slug")) {
                        String var21 = CRRRICCRROCOHHOHIICIHORCOORRRH.ICHOCCCIHHOCRRIIICRHROIOHHROHO(var19.get("slug").getAsString());
                        if (var12.add(var21)) {
                           JsonObject var22 = new JsonObject();
                           var22.addProperty("enabled", true);
                           boolean var23 = var20 != null && var20.get("hudEnabled") != null && var20.get("hudEnabled").getAsBoolean();
                           if (var23) {
                              var14 = true;
                              if (var20.has("anchorPoint")) {
                                 com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO var24 = CRRRICCRROCOHHOHIICIHORCOORRRH.RCHOHCHOICCORRROCRRRCOIHIROHOC(
                                    var20.get("anchorPoint").getAsString()
                                 );
                                 if (var24 != null) {
                                    var22.addProperty("position", var24.id());
                                 }
                              }

                              float var35 = var20.has("relX") ? var20.get("relX").getAsFloat() : 0.0F;
                              if (var35 != 0.0F) {
                                 var22.addProperty("x", var35);
                              }

                              float var25 = var20.has("relY") ? var20.get("relY").getAsFloat() : 0.0F;
                              if (var25 != 0.0F) {
                                 var22.addProperty("y", var25);
                              }

                              float var26 = var20.has("scale") ? var20.get("scale").getAsFloat() : 1.0F;
                              if (var26 != 1.0F) {
                                 JsonObject var27 = new JsonObject();
                                 var27.addProperty("scale", CRRRICCRROCOHHOHIICIHORCOORRRH.clamp(var26, 0.25F, 5.0F));
                                 var22.add("options", var27);
                              }
                           } else {
                              if (var5 != null) {
                                 var22.addProperty("position", var5.id());
                              }

                              int var36 = var15 % var9;
                              int var37 = var15 / var9;
                              float var38 = var6 + var10 * (var4 ? var36 : var37);
                              float var39 = var7 + var11 * (var4 ? var37 : var36);
                              if (var38 != 0.0F) {
                                 var22.addProperty("x", var38);
                              }

                              if (var39 != 0.0F) {
                                 var22.addProperty("y", var39);
                              }

                              var15++;
                           }

                           var13.put("ITEM_COUNTER_" + var21.replace("minecraft:", "").toUpperCase() + "_CHILD", var22);
                        }
                     }
                  }
               }

               if (!var12.isEmpty()) {
                  boolean var28 = !var14;

                  for (Entry var31 : var13.entrySet()) {
                     JsonObject var33 = (JsonObject)var31.getValue();
                     if (!var28) {
                        JsonObject var34 = var33.has("options") ? var33.getAsJsonObject("options") : new JsonObject();
                        this.RIROICHCRROROHCCROOCCCCOCHCCRI(var1, var34);
                        if (!var34.entrySet().isEmpty()) {
                           var33.add("options", var34);
                        }
                     }

                     var3.add((String)var31.getKey(), var33);
                  }

                  JsonArray var30 = new JsonArray();
                  var12.forEach(var30::add);
                  JsonObject var32 = RRRHHIRORHCHHCOOCIHOICORHHCHHO(var3);
                  var32.add("itemCounterCountedItems", var30);
                  var32.addProperty("itemCounterGrouped", var28);
               }
            }
         }
      }

      void HICOIIHORCCIOHCHHCHHCOIIHOCOCR() {
         HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1 = this.CRIRCIHHRCIHRIOOCCRCCOHCCORRIR.CCRCCROHHIHRIIRHOROIOIRCRHHOHI("inventory");
         if (var1 != null && !this.HHCORCHIOHCIICCCROCRCRHHCIICIC.has("ITEM_TRACKER")) {
            HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = var1.RHRRRICCOOCRORCOIROOROCCOHRRHO("itemPickup:");
            if (var2.has("hudEnabled1")) {
               JsonObject var3 = new JsonObject();
               var3.addProperty("enabled", var1.OCRHORCRRHCRIORIOCIRHICIRHHCOR() && var2.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR("hudEnabled1", false));
               var3.addProperty("seen", true);
               JsonObject var4 = new JsonObject();
               this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var3, var4);
               if (var1.has("itemPickupRemovalDelay")) {
                  var4.addProperty(
                     "popupDurationSec",
                     CRRRICCRROCOHHOHIICIHORCOORRRH.clamp(var1.CRRRICCRROCOHHOHIICIHORCOORRRH("itemPickupRemovalDelay", 12.0F), 0.1F, 30.0F)
                  );
               }

               RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var3, var4);
               this.HHCORCHIOHCIICCCROCRCRHHCIICIC.add("ITEM_TRACKER", var3);
            }
         }
      }

      void IHHIROIRHHOIOCHCHCCCIRHRIROIIO() {
         HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1 = this.CRIRCIHHRCIHRIOOCCRCCOHCCORRIR.CCRCCROHHIHRIIRHOROIOIRCRHHOHI("armorStatus");
         if (var1 != null && this.HHCORCHIOHCIICCCROCRCRHHCIICIC.has("ARMORSTATUS")) {
            JsonObject var2 = this.HHCORCHIOHCIICCCROCRCRHHCIICIC.getAsJsonObject("ARMORSTATUS");
            String var3 = var1.has("textAlignment")
               ? CRRRICCRROCOHHOHIICIHORCOORRRH.RRROICIORROHIOIHORHRICHCOOORCC(var1.CCHORHIOORICCIRIHRIIHIICORIORO("textAlignment", "right"))
               : null;
            boolean var4 = false;

            for (Entry var6 : CRRRICCRROCOHHOHIICIHORCOORRRH.RIHOCHRHROOIIHRRHIOIORRCHOCHOR.entrySet()) {
               String var7 = (String)var6.getValue();

               Boolean var8 = switch (var7) {
                  case "ARMORSTATUS_HELD_ITEM_CHILD" -> var1.has("showEquippedItem") ? var1.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR("showEquippedItem", true) : null;
                  case "ARMORSTATUS_OFF_HAND_HELD_ITEM_CHILD" -> var1.has("showOffhandItem")
                     ? var1.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR("showOffhandItem", true)
                     : null;
                  default -> null;
               };
               HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var13 = var1.RHRRRICCOOCRORCOIROOROCCOHRRHO((String)var6.getKey());
               boolean var14 = var13.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR("hudEnabled1", false);
               if (var14 || var8 != null) {
                  JsonObject var11 = var2.has(var7) ? var2.getAsJsonObject(var7) : new JsonObject();
                  JsonObject var12 = var11.has("options") ? var11.getAsJsonObject("options") : new JsonObject();
                  if (var8 != null) {
                     var11.addProperty("enabled", var8);
                  }

                  if (var14) {
                     var4 = true;
                     this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var13, var11, var12);
                     if (var3 != null) {
                        var12.addProperty("durabilityPosition", var3);
                     }
                  }

                  RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var11, var12);
                  if (!var11.entrySet().isEmpty()) {
                     var2.add(var7, var11);
                  }
               }
            }

            if (var4) {
               RRRHHIRORHCHHCOOCIHOICORHHCHHO(var2).addProperty("moveArmorIndividually", true);
            }
         }
      }

      void RIRRCIRIIOHOCOIRHRORCOCIOHIROH() {
         HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1 = this.CRIRCIHHRCIHRIOOCCRCCOHCCORRIR.CCRCCROHHIHRIIRHOROIOIRCRHHOHI("uiScaling");
         if (var1 != null) {
            float var2 = var1.CRRRICCRROCOHHOHIICIHORCOORRRH("containerScale", 0.0F);
            if (var1.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR("overrideContainerScale", false) && !(var2 <= 0.0F)) {
               if (this.HRHRORCIRICHCCCCCHICOOICIRHRIO("GUI_SCALE", "uiScaling") != null) {
                  JsonObject var3 = new JsonObject();
                  var3.addProperty("inventoryScale", CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, 1, 5));
                  RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.HHCORCHIOHCIICCCROCRCRHHCIICIC.getAsJsonObject("GUI_SCALE"), var3);
               }
            }
         }
      }

      void OOROOCCIRCCRHOIOIORIHCHHOOCCOR(JsonArray var1) {
         HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = this.HRHRORCIRICHCCCCCHICOOICIRHRIO("AUTO_TEXT_HOTKEY", "autoText");
         if (var2 != null && var1 != null) {
            JsonObject var3 = new JsonObject();
            int var4 = 1;

            for (JsonElement var6 : var1) {
               if (var6.isJsonObject()) {
                  JsonObject var7 = var6.getAsJsonObject();
                  if (var7.has("command") && !var7.get("command").getAsString().isBlank()) {
                     JsonObject var8 = new JsonObject();
                     var8.addProperty("value", var7.get("command").getAsString());
                     JsonObject var9 = CRRRICCRROCOHHOHIICIHORCOORRRH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH(var7.get("key"));
                     if (var9 != null) {
                        var8.add(var4 + "hotkey", var9);
                     }

                     var3.add(var4 + "hotkey", var8);
                     var4++;
                  }
               }
            }

            RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.HHCORCHIOHCIICCCROCRCRHHCIICIC.getAsJsonObject("AUTO_TEXT_HOTKEY"), var3);
         }
      }

      void IORRRRHRRHRROCRHIROCRHCHCCRRHI() {
         HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1 = this.HRHRORCIRICHCCCCCHICOOICIRHRIO("CROSSHAIR", "crosshair");
         if (var1 != null) {
            JsonObject var2 = this.HHCORCHIOHCIICCCROCRCRHHCIICIC.getAsJsonObject("CROSSHAIR");
            JsonObject var3 = new JsonObject();
            if (var1.has("removeCrosshairInPerspective1")) {
               var3.addProperty("showInF5", !var1.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR("removeCrosshairInPerspective1", true));
            }

            RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var2, var3);
            boolean var4 = var1.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR("invertColor", false);
            var2.add("CROSSHAIR_NORMAL", this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var1.COOIROCORRIHROOCCRCOIOCOHHRROO("color"), var4));
            if (var1.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR("colorAllyEnemy", false)) {
               var2.add("CROSSHAIR_FRIENDLY", this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var1.COOIROCORRIHROOCCRCOIOCOHHRROO("allyColor"), var4));
               var2.add("CROSSHAIR_ENEMY", this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var1.COOIROCORRIHROOCCRCOIOCOHHRROO("enemyColor"), var4));
            }
         }
      }

      private JsonObject RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1, IRCIIHHICIHRCOCRROCOICRIHHCCHH var2, boolean var3
      ) {
         JsonObject var4 = new JsonObject();
         var4.addProperty("enabled", true);
         JsonObject var5 = new JsonObject();
         var5.addProperty("crosshairMode", "crosshairModeSimple");
         float var6 = var1.CRRRICCRROCOHHOHIICIHORCOORRRH("thickness", 1.0F);
         float var7 = var1.CRRRICCRROCOHHOHIICIHORCOORRRH("size2", 5.0F) * 3.0F;
         float var8 = var1.CRRRICCRROCOHHOHIICIHORCOORRRH("gap", 3.0F);
         float var9 = Math.max(0.0F, (var7 - 6.0F) / 2.0F);
         String var10 = var1.CCHORHIOORICCIRIHRIIHIICORIORO("type", "cross").toLowerCase();
         boolean var11 = var1.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR("dot", false);
         boolean var12 = var1.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR("outline", false);
         int var13 = CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var6, 1, 5);
         var5.addProperty("crosshairThickness", var13);
         switch (var10) {
            case "circle":
               float var21 = Math.max((var7 - 3.0F) / 4.0F + var8 - 3.0F, 1.0F);
               var5.addProperty("crosshairShape", "circle");
               var5.addProperty("crosshairGap", CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH((var21 - 1.0F) * 2.0F, 0, 8));
               break;
            case "square":
               int var20 = CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH((var7 - 3.0F) / 4.0F, 0, 16);
               var5.addProperty("crosshairShape", "dot");
               var5.addProperty("crosshairWidth", var20);
               var5.addProperty("crosshairHeight", var20);
               break;
            case "arrow":
               int var19 = CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH((var8 / 2.0F + var9) / (float)Math.sqrt(2.0), 0, 16);
               var5.addProperty("crosshairShape", "arrow");
               var5.addProperty("crosshairWidth", var19);
               var5.addProperty("crosshairHeight", var19);
               var5.addProperty("crosshairGap", 0);
               break;
            case "default":
            case "drawn":
               int var18 = CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var7 * 7.0F / 15.0F, 0, 16);
               var5.addProperty("crosshairShape", "cross");
               var5.addProperty("crosshairWidth", var18);
               var5.addProperty("crosshairHeight", var18);
               var5.addProperty("crosshairGap", 0);
               var5.addProperty("crosshairThickness", CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var7 / 15.0F, 1, 5));
               break;
            default:
               int var16 = CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var9, 0, 16);
               var5.addProperty("crosshairShape", "cross");
               var5.addProperty("crosshairWidth", var16);
               var5.addProperty("crosshairHeight", var16);
               var5.addProperty("crosshairGap", CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH((var8 - var13) / 2.0F, 0, 8));
         }

         var5.addProperty("crosshairDot", var11);
         if (var11) {
            var5.addProperty("dotSize", CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var6 * 2.0F + 0.7F, 1, 16));
            IRCIIHHICIHRCOCRROCOICRIHHCCHH var17 = var1.COOIROCORRIHROOCCRCOIOCOHHRROO("dotColor");
            if (var17 != null) {
               var5.addProperty("customDotColor", true);
               CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5, "dotColor", var17);
            }

            if (var12) {
               var5.addProperty("dotOutline", true);
               var5.addProperty("dotOutlineThickness", 1.0F);
            }
         }

         var5.addProperty("crosshairColorVanilla", var3);
         if (var3) {
            var5.addProperty("vanillaBlendingColor", true);
         }

         CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5, "color", var2);
         CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5, "crosshairOutline", var1, "outline");
         CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5, "outlineColor", var1.COOIROCORRIHROOCCRCOIOCOHHRROO("outlineColor"));
         if ("circle".equals(var10)) {
            var5.addProperty("outlineThickness", 1.0F);
         } else if (var1.has("outlineThickness")) {
            var5.addProperty("outlineThickness", Math.min(1.0F, var1.CRRRICCRROCOHHOHIICIHORCOORRRH("outlineThickness", 1.0F) / 4.0F));
         }

         if (var1.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR("ignoreGuiScale", true)) {
            var5.addProperty("customScale", true);
            var5.addProperty("crosshairScale", "normal");
         }

         if (!var1.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR("disableBowZoom", false)) {
            var5.addProperty("crosshairDynamicBow", true);
            var5.addProperty("dynamicBowScale", CRRRICCRROCOHHOHIICIHORCOORRRH.clamp((var8 + 5.0F) / 2.0F, 1.0F, 10.0F));
            var5.addProperty("dynamicDot", false);
         }

         var4.add("options", var5);
         return var4;
      }

      private HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HRHRORCIRICHCCCCCHICOOICIRHRIO(String var1, String var2) {
         HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3 = this.CRIRCIHHRCIHRIOOCCRCCOHCCORRIR.CCRCCROHHIHRIIRHOROIOIRCRHHOHI(var2);
         if (var3 != null && !this.HHCORCHIOHCIICCCROCRCRHHCIICIC.has(var1)) {
            JsonObject var4 = new JsonObject();
            var4.addProperty("enabled", var3.OCRHORCRRHCRIORIOCIRHICIRHHCOR());
            var4.addProperty("seen", true);
            this.HHCORCHIOHCIICCCROCRCRHHCIICIC.add(var1, var4);
            this.RCCHHOOIRIHOHOORHORIHCCIIHICCC.add(var2);
            return var3;
         } else {
            return null;
         }
      }

      private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1, JsonObject var2, JsonObject var3) {
         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO var4 = CRRRICCRROCOHHOHIICIHORCOORRRH.RCHOHCHOICCORRROCRRRCOIHIROHOC(
            var1.ROCHCOOHRCROOOIHICOIIIOROCOHCO()
         );
         if (var4 != null) {
            var2.addProperty("position", var4.id());
         }

         float var5 = var1.HIHOOROORCHCROHHIHRHICICHIICRR();
         float var6 = var1.HROHOIHRICOOHHHIOHHOIIHCRRCIOH();
         if (var5 != 0.0F) {
            var2.addProperty("x", var5);
         }

         if (var6 != 0.0F) {
            var2.addProperty("y", var6);
         }

         float var7 = var1.IICOHOIHOCIIRRCRRHHICHHCIOHCRC();
         if (var7 != 1.0F) {
            var3.addProperty("scale", CRRRICCRROCOHHOHIICIHORCOORRRH.clamp(var7, 0.25F, 5.0F));
         }
      }

      private static void RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(JsonObject var0, JsonObject var1) {
         if (!var1.entrySet().isEmpty()) {
            var0.add("options", var1);
         }
      }

      private static JsonObject RRRHHIRORHCHHCOOCIHOICORHHCHHO(JsonObject var0) {
         JsonObject var1 = var0.has("options") ? var0.getAsJsonObject("options") : new JsonObject();
         var0.add("options", var1);
         return var1;
      }

      com.moonsworth.lunar.client.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH OORCROORCOCIORHHCIRICOOOOHRROH() {
         LinkedHashSet var1 = new LinkedHashSet<>(this.CRIRCIHHRCIHRIOOCCRCCOHCCORRIR.HHOCOCIHCOROOIOHOHCCHOIRIOHCOR());
         var1.removeAll(this.RCCHHOOIRIHOHOORHORIHCCIIHICCC);
         return new com.moonsworth.lunar.client.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            this.HHCORCHIOHCIICCCROCRCRHHCIICIC,
            CICHORHIHCCORHRHOORIRHIHHIICCR(),
            CICHORHIHCCORHRHOORIRHIHHIICCR(),
            CICHORHIHCCORHRHOORIRHIHHIICCR(),
            List.copyOf(this.RCCHHOOIRIHOHOORHORIHCCIIHICCC),
            List.copyOf(var1)
         );
      }

      private static JsonObject CICHORHIHCCORHRHOORIRHIHHIICCR() {
         JsonObject var0 = new JsonObject();
         var0.addProperty(
            "version",
            com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OCCRIIOROHCIIOROCCCHOCIHHOOCIH
         );
         return var0;
      }
   }
}
