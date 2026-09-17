package com.moonsworth.lunar.client.util;

import com.google.common.collect.ImmutableList;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import lombok.Generated;

public class IIRHCHHOICHRICOOCRORCCIOOIHOIR {
   public static final String HIOCHICRIOCICHRCOOCOROIHIIHCHO = System.getProperty("os.name");
   public static final String OHCCRCCRIOHROIOOIIICORCHOHCOHH = System.getProperty("os.version");
   public static final String OCOIIIHIRRCCCCCHCHRIOCHHRHIICI = CIHCOICOOICHOCCHICIHRCOCIHRIOC.firstNonNull(
      System.getenv("PROCESSOR_ARCHITECTURE"), System.getProperty("os.arch")
   );
   public static final boolean ROICCHIORCHICRRCHIIHIHRCOOOORI = Objects.equals(System.getProperty("java.awt.headless"), "true");
   public static final long OHRHOHROOCCCHCOCIHOORCICHOIIHH = System.currentTimeMillis();
   public static final Path OOOOHICOOORRRIRHCCHIHICIICIROI = Paths.get(
      System.getProperty("lunar.dataDir", System.getProperty("user.home") + File.separator + ".lunarclient")
   );
   public static final Path CCOHHIHIIHCHIHCCOIOOHCRCCHIIOO = OOOOHICOOORRRIRHCCHIHICIICIROI.resolve("game-cache");
   public static final Path CRIRIRCRICOHRCRHHCICRHCOOIICCO = OOOOHICOOORRRIRHCCHIHICIICIROI.resolve("launcher-cache");
   public static final Path IIROHIIHCRORHOCHIOROCCICIORCOI = OOOOHICOOORRRIRHCCHIHICIICIROI.resolve("textures").resolve("assets").resolve("lunar");
   public static final Path HRCOCOHCHRIOIHIIROORORHORCCICR = IIROHIIHCRORHOCHIOROCCICIORCOI.resolve("dev_cosmetics");
   public static final Path ICRCICIOOCRIOHHCHOROOCRRORHCHC = OOOOHICOOORRRIRHCCHIHICIICIROI.resolve("jit").resolve("assets").resolve("lunar-jit");
   public static final Path HHIRHHICRHCCHRHIIIOIRRROCRHRIH = OOOOHICOOORRRIRHCCHIHICIICIROI.resolve("offline").resolve("multiver");
   public static final Path HIROCHRCIRCRHIORRHIHHRORCCRHOR = HHIRHHICRHCCHRHIIIOIRRROCRHRIH.resolve("hypixel").resolve("skyblock");
   public static final Path CRHIIROORHCIHCHRIHHROOHRRIOHIH = CCOHHIHIIHCHIHCCOIOOHCRCCHIIOO.resolve("blog-post-images");
   public static final Path RHOIRIICHCIRHHOORORIIRCRCRRIHH = CCOHHIHIIHCHIHCCOIOOHCRCCHIIOO.resolve("avatar");
   public static final Path HRICRRROHOHIOHHHORHORCOOCHIRIO = CCOHHIHIIHCHIHCCOIOOHCRCCHIIOO.resolve("covers");
   public static final Path CORRIIHRCIROOICRIOCCHCHIIHOHRC = CCOHHIHIIHCHIHCCOIOOHCRCCHIIOO.resolve("imgsrc");
   public static final String RCCRRCOIIORCICIOCHRHOIOCCIICCH = "RpEJNT11YK7VjO07Z75cV8iEybS1DXSnhbsIeGP84Azp7xMsAY9oxcS7ZuVhMISv";
   public static final String HIIOICRICCRROICRHCCHRHIIHCRCHR = "https://api.klipy.com/api/v1/RpEJNT11YK7VjO07Z75cV8iEybS1DXSnhbsIeGP84Azp7xMsAY9oxcS7ZuVhMISv/gifs";
   public static final int IRICCIHRIOCOORRRCOCCHHCIOCCHHI = 24;
   public static String HIIRIOIIIRICHRRRHCIRHRORCIIRIO = "https://resourcepacks.gg";
   public static final Gson ORHHIICRRIOIOHCHHCHHHRCIORCHRI = new GsonBuilder()
      .registerTypeAdapter(
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.class,
         new com.moonsworth.lunar.client.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR.IRCIIHHICIHRCOCRROCOICRIHHCCHH()
      )
      .registerTypeAdapter(
         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OIHCOHRCICCCRHRCROOCIOIRRHHHIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class,
         new com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OIHCOHRCICCCRHRCROOCIOIRRHHHIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH()
      )
      .registerTypeAdapter(LocalDate.class, new com.moonsworth.lunar.client.IHICORCROOROHCIHIHCOIHRRHICICO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH())
      .registerTypeAdapterFactory(new ORIOHRCIHRCOOHICCCRIIIHCRHHIHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH())
      .create();
   public static final Gson CRCCROROOHROIRIHCICROOIHHOOICI = new GsonBuilder()
      .setPrettyPrinting()
      .registerTypeAdapter(
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.class,
         new com.moonsworth.lunar.client.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR.IRCIIHHICIHRCOCRROCOICRIHHCCHH()
      )
      .registerTypeAdapter(
         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OIHCOHRCICCCRHRCROOCIOIRRHHHIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class,
         new com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OIHCOHRCICCCRHRCROOCIOIRRHHHIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH()
      )
      .registerTypeAdapter(LocalDate.class, new com.moonsworth.lunar.client.IHICORCROOROHCIHIHCOIHRRHICICO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH())
      .registerTypeAdapterFactory(new ORIOHRCIHRCOOHICCCRIIIHCRHHIHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH())
      .create();
   public static final Random HHHRRCCHRCHCRORIIRIHOHCCOIRIRH = ThreadLocalRandom.current();
   public static final File ROCIHIROIOOIHHHHIRIRCCIIOOHHHI;
   public static final File IHHOCHRHIHRHORHIOIIIHHCCIRIOCI;
   private static final List<String> RCHOIRCCOIIIIIROHCOCCORIHRRIOI = ImmutableList.of(
      "assets/lunar-jit/cosmetics/",
      "assets/lunar-jit/sprays/",
      "assets/lunar-jit/shaders/",
      "assets/lunar/jit_index",
      "assets/lunar/cosmetics.json",
      "assets/lunar/dev_cosmetics.json",
      "assets/lunar/sprays.json",
      "assets/lunar/jams",
      "assets/lunar/misc/",
      "assets/lunar/emotes/",
      "assets/lunar/sprays",
      "assets/lunar/particles/",
      new String[]{
         "assets/lunar/badges",
         "assets/lunar/geckolib_cosmetics/",
         "assets/lunar/cosmetics/",
         "assets/lunar/dev_cosmetics/",
         "assets/lunar/font/",
         "assets/lunar/textures/font/",
         "assets/lunar/icons/hypixel",
         "assets/lunar/icons/alerts",
         "assets/lunar/textures/bedwars_height_limit",
         "assets/lunar/textures/bedwars_coloured_beds",
         "assets/lunar/textures/height_limit"
      }
   );
   public static boolean RIOIHOIOIIHRRHIOIHHOICRHIRCHCO = com.moonsworth.lunar.client.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRIRIIICIRRIIRICRRORCCRCOHIHIO
      .equalsIgnoreCase("master");
   public static boolean OCIOHCIOHIOOICOHRRHCIRRRRIHCCR = com.moonsworth.lunar.client.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRIRIIICIRRIIRICRRORCCRCOHIHIO
      .equalsIgnoreCase("dev");
   public static boolean RCHOCOOROOICCIROHRIHCIICIHIHCH = com.moonsworth.lunar.client.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRIRIIICIRRIIRICRRORCCRCOHIHIO
      .equalsIgnoreCase("beta");
   public static boolean ROHCCHHHCCRCRHOHHHOICHCIOHRROO = !com.moonsworth.lunar.client.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHRRICCIOIHROCCOIIORROIROCIIOR
      || !RIOIHOIOIIHRRHIOIHHOICRHIRCHCO;
   public static String HOHHIIOOHRCIOCOHRIIOIIOIHCRRCC = "https://medal.tv/lunar";

   public static void bootstrap() {
   }

   @Generated
   public static List<String> CCOOHOOHHCOCHIHHCOIRCCHIRRIOCH() {
      return RCHOIRCCOIIIIIROHCOCCORIHRRIOI;
   }

   static {
      Path var0 = OOOOHICOOORRRIRHCCHIHICIICIROI.resolve("settings");
      ROCIHIROIOOIHHHHIRIRCCIIOOHHHI = var0.resolve("game").toFile();
      IHHOCHRHIHRHORHIOIIIHHCCIRIOCI = var0.resolve("game-backup").toFile();
   }
}
