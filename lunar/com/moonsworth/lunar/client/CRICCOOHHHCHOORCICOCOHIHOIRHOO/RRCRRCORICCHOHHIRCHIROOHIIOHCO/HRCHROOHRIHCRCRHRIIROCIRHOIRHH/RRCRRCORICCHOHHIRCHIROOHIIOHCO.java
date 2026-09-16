package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.collect.ImmutableList;
import com.google.common.net.InternetDomainName;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IHIRRIIORRHORHRORIHOROIRCORCOO;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ORHIOICIOCRRHOOCOHRORIHICHRCRR;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CIOHHCORHRCCRICCCORIHCRHCCCRRR.CORCOCICIRIOHROHROIIOOHICCHCRR;
import com.moonsworth.lunar.client.util.CRHHOOCRCOHHRHOOOCHCROOHIOOCOH;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.IIHHICHCCCOHCHROIRIHICCHHOROCR;
import com.moonsworth.lunar.client.util.OCOHORHCROHICRRIHCIHHRRCIHICRI;
import com.moonsworth.lunar.lib.adventure.text.Component;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import javax.imageio.ImageIO;
import org.jetbrains.annotations.NotNull;

public class RRCRRCORICCHOHHIRCHIROOHIIOHCO {
   private static final ExecutorService HIIHOHIIRHRRIRCRIICCRRRCRIHHRI = Executors.newFixedThreadPool(
      1, new ThreadFactoryBuilder().setNameFormat("Hover Image Preview Downloader #%d").setDaemon(true).build()
   );
   private final LoadingCache<String, Future<BufferedImage>> RIRRCORROOHICCHOHOORICRRCHRCOR = CacheBuilder.newBuilder()
      .maximumSize(10L)
      .expireAfterAccess(5L, TimeUnit.MINUTES)
      .softValues()
      .build(new CacheLoader<String, Future<BufferedImage>>() {
         public Future<BufferedImage> IOICHOCIHIIRROOHHRIHOCHOROOCCI(String var1) {
            return RRCRRCORICCHOHHIRCHIROOHIIOHCO.this.HORRRHCCICIOCOOOCIHCCRCRIOCCHR(var1);
         }
      });
   private static final RCIROOOOICRHCCRRCIORHHIRCOIIIC RHCIIHIRORCCOOOHOIHCHIROCIHOIR = RCIROOOOICRHCCRRCIORHHIRCOIIIC.create("lunar", "hover_image");
   private static final List<String> HRHOICCRIICOCIICHOCRIHCRRIIHOO = ImmutableList.of(
      "lunr.pics",
      "imgur.com",
      "i.imgur.com",
      "discordapp.com",
      "discordapp.net",
      "media.discordapp.net",
      "hypixel.net",
      "prnt.sc",
      "ibb.co",
      "wixmp.com",
      "fbcdn.net",
      "cdninstagram.com",
      new String[]{"redd.it", "gyazo.com", "twimg.com", "mcstats.com", "lunarclientcdn.com", "moonsworth.store"}
   );
   private static final Pattern HRCHCHICHCROOOIROIIRIHORIRHIRH = Pattern.compile("https://[^\\s\"']+");
   private CORCOCICIRIOHROHROIIOOHICCHCRR RRCOOOOOOCIIHCICIICHIHRCRIRIHI = null;
   private boolean RCCIIROIHCCRRIICRIHHCRCCIRIOIC = false;
   private String OHRROHOHCHRCIHOROORHICHIIIRRRI;
   private Future<BufferedImage> OHHCIRIOROOHCHIICIHHIIIHHHCOHH;
   private final com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI RIROHROOOIRICCCIORCORRHHRCOHII;
   private final List<String> IOCRIHORCRHHHRCCRCCHROOOCCIRIR = new ArrayList<>();
   private List<String> urls = new ArrayList<>(2);
   private int ICOCIIORRIICHOHORHORIIRHCRCOIH;

   protected RRCRRCORICCHOHHIRCHIROOHIIOHCO() {
      this.RIROHROOOIRICCCIORCORRHHRCOHII = new com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
         250L
      );
   }

   protected void CIOHHCORHRCCRICCCORIHCRHCCCRRR(String[] var1) {
      this.IOCRIHORCRHHHRCCRCCHROOOCCIRIR.clear();
      Arrays.stream(var1).map(var0 -> var0.toLowerCase(Locale.ROOT)).forEach(this.IOCRIHORCRHHHRCCRCCHROOOCCIRIR::add);
   }

   protected void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1
   ) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION < 24) {
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.RCHHRIOCRHHIHIROCIRCRHRIOOOCOO(), var1.HIHOHOHORCOIRRCHOORHORCIORRRHH());
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.CRRRICCRROCOHHOHIICIHORCOORRRH<?> var2
   ) {
      HHCCIRHCCCIIRHCROHIORHIRHHIORH var3 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .CCHCOOORHCOICHOCCOCOIIHIICHCHC();
      if (var3.CRORCRRHRRIRIIIRHIOOIOOHCIIIRR().get()) {
         if (this.RCCIIROIHCCRRIICRIHHCRCCIRIOIC && this.OHHCIRIOROOHCHIICIHHIIIHHHCOHH != null && this.OHHCIRIOROOHCHIICIHHIIIHHHCOHH.isDone()) {
            ORHIOICIOCRRHOOCOHRORIHICHRCRR var4 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getCurrentScreenOrRewind();
            if (!(var4 instanceof HICHRCOHCCRHOHCICOOCHOIHCCHIRI) && !(var4 instanceof IHIRRIIORRHORHRORIHOROIRCORCOO)) {
               this.OIHRHIRRHRRIRHROORRROCOHOIHCRC();
            } else {
               try {
                  BufferedImage var5 = this.OHHCIRIOROOHCHIICIHHIIIHHHCOHH.get();
                  if (var5 == null) {
                     return;
                  }

                  com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var6 = IIHHICHCCCOHCHROIRIHICCHHOROCR.OHIRHORHHORIHRHIHOHIIIRCRORIRO()
                     .HOCIOROHHCIHORHHCHRRICIRHOCCRC();
                  com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var7 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                     .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
                     .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
                     .HOROHROIORRIRIIIOOCCIROCRCROHI();
                  if (var7 != null) {
                     com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var8 = var7.COICHIOIHHOHRHRHCIOICORCRORIIR()
                        .get()
                        .HHOHIHRCICOIICIIOHHHRHROHCHICI();
                     CRHHOOCRCOHHRHOOOCHCROOHIOOCOH var9 = com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.ROHHOOHOHCHRIICCCHCOHCORROHRIH();
                     var6 = new com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                        var8.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                           IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getTimer().RIRIOIIHRIRRHRROHRORICOHOIOHHH(),
                           var9.getScaledWidth()
                        ),
                        var8.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                           IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getTimer().RIRIOIIHRIRRHRROHRORICOHOIOHHH(),
                           var9.getScaledHeight()
                        )
                     );
                  }

                  double var27 = var5.getHeight();
                  double var10 = var5.getWidth();
                  double var12 = var3.RIIOIHRCIIOHHOCHROIOCROIOHHIHO().get();
                  double var14 = var3.ICORORHCOHICROROOHIOOHOCOIHRCI().get();
                  if (var3.RORRICHRHOCHRORCCRRIIRIOIHHIHO().get() && var14 < 100.0) {
                     if (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RHCICHRICRIIIHRRCICHOOOIOOOICH()
                           .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                              com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.KEY_LSHIFT
                           )
                        && !this.RIROHROOOIRICCCIORCORRHHRCOHII.HROOIHCCIIORCIHIORHCOROHIROICH()) {
                        if (!this.RIROHROOOIRICCCIORCORRHHRCOHII.RCICROORIIICORORIRRCRHHCRICIOI()) {
                           this.RIROHROOOIRICCCIORCORRHHRCOHII.ROHHCOIHHRHOICCCRCCRRRHHHOIHCI(false);
                           this.RIROHROOOIRICCCIORCORRHHRCOHII.start();
                        } else if (this.RIROHROOOIRICCCIORCORRHHRCOHII.CCHRRRORHHCHCOIIORCCRICOHICOHI()) {
                           this.RIROHROOOIRICCCIORCORRHHRCOHII.stop();
                           this.RIROHROOOIRICCCIORCORRHHRCOHII
                              .ROHHCOIHHRHOICCCRCCRRRHHHOIHCI(!this.RIROHROOOIRICCCIORCORRHHRCOHII.RIIRIHIHRIICCICOOCRCRRCROHIIIO());
                           this.RIROHROOOIRICCCIORCORRHHRCOHII.start();
                        }
                     }

                     var14 += (100.0 - var14) * this.RIROHROOOIRICCCIORCORRHHRCOHII.OICICHCIIHCIHHRRROIIIIHIIICCRI();
                  }

                  double var16 = var10 / var27;
                  double var18 = var2.ICORIROICCORCRROCRCIRRRHHHOOIR();
                  double var20 = var2.OICOHRRRRCOICCHOIOROHOCOORCHII();
                  if (var27 / var20 > var10 / var18) {
                     var27 = com.moonsworth.lunar.client.ORHIOICIOCRRHOOCOHRORIHICHRCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.clamp(
                        var27, var12 / 100.0 * var20, var14 / 100.0 * var20
                     );
                     var10 = var27 * var16;
                  } else {
                     var10 = com.moonsworth.lunar.client.ORHIOICIOCRRHOOCOHRORIHICHRCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.clamp(
                        var10, var12 / 100.0 * var18, var14 / 100.0 * var18
                     );
                     var27 = var10 / var16;
                  }

                  double var22 = var6.ICORIROICCORCRROCRCIRRRHHHOOIR();
                  double var24 = var6.OICOHRRRRCOICCHOIOROHOCOORCHII() - var27;
                  if (var24 < 0.0 || var24 + var27 > var20) {
                     var24 = 0.0;
                  }

                  if (var22 + var10 > var18) {
                     var22 = var18 - var10;
                  }

                  if (this.RRCOOOOOOCIIHCICIICHIHRCRIRIHI == null) {
                     this.RRCOOOOOOCIIHCICIICHIHRCRIRIHI = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
                        .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5);
                     IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
                        .bridge$getTextureManager()
                        .bridge$deleteTexture(RHCIIHIRORCCOOOHOIHCHIROCIHOIR);
                     IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
                        .bridge$getTextureManager()
                        .bridge$loadTexture(RHCIIHIRORCCOOOHOIHCHIROCIHOIR, this.RRCOOOOOOCIIHCICIICHIHRCRIRIHI);
                  }

                  var1.CRICCOOHHHCHOORCICOCOHIHOIRHOO(0.0F, 0.0F, 200.0F);
                  com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                     var1, RHCIIHIRORCCOOOHOIHCHIROCIHOIR, (float)var22, (float)var24, (float)var10, (float)var27, -1
                  );
               } catch (Exception var26) {
                  var26.printStackTrace();
               }
            }
         }
      }
   }

   private Future<BufferedImage> HORRRHCCICIOCOOOCIHCCRCRIOCCHR(String var1) {
      URL var2;
      String var3;
      try {
         var2 = new URL(var1);
         var3 = InternetDomainName.from(var2.getHost()).topPrivateDomain().toString();
      } catch (Exception var5) {
         return Futures.immediateFuture(null);
      }

      if (!HRHOICCRIICOCIICHOCRIHCRRIIHOO.contains(var3) && !this.IOCRIHORCRHHHRCCRCCHROOOCCIRIR.contains(var3)) {
         return Futures.immediateFuture(null);
      }

      Callable var4 = () -> {
         HttpURLConnection var1x = null;

         try {
            var1x = (HttpURLConnection)var2.openConnection();
            var1x.setRequestMethod("GET");
            var1x.addRequestProperty("Accept", "image/*");
            var1x.addRequestProperty("User-Agent", "LunarClient-Java");

            try (InputStream var2x = var1x.getInputStream()) {
               BufferedImage var3x = ImageIO.read(var2x);
               if (var3x == null) {
                  return null;
               }

               if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 6) {
                  int[] var4x = var3x.getRGB(0, 0, var3x.getWidth(), var3x.getHeight(), null, 0, var3x.getWidth());

                  for (int var5x = 0; var5x < var4x.length; var5x++) {
                     var4x[var5x] = OCOHORHCROHICRRIHCIHHRRCIHICRI.OCOHIOCHOCHRCCROORRIIIHIOHOIIR(var4x[var5x]);
                  }

                  var3x.setRGB(0, 0, var3x.getWidth(), var3x.getHeight(), var4x, 0, var3x.getWidth());
               }

               return var3x;
            }
         } catch (Throwable var13) {
            if (!(var13 instanceof IOException)) {
               var13.printStackTrace();
            }

            return null;
         } finally {
            if (var1x != null) {
               var1x.disconnect();
            }
         }
      };
      return HIIHOHIIRHRRIRCRIICCRRRCRIHHRI.submit(var4);
   }

   @NotNull
   private String IRCHOIROHOHHOIHCICOROOOHIOOIIR(@NotNull String var1) {
      if (var1.startsWith("https://lunr.pics/")) {
         return var1.replace("https://lunr.pics/", "https://lunr.pics/i/") + ".png";
      }

      if (var1.startsWith("https://imgur.com/")) {
         var1 = var1.replace("https://imgur.com/", "https://i.imgur.com/") + ".png";
      }

      return var1;
   }

   public boolean CROORRIIIHICOIHOOCRRHRCOIHHHCO(@Nullable String var1) {
      HHCCIRHCCCIIRHCROHIORHIRHHIORH var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .CCHCOOORHCOICHOCCOCOIIHIICHCHC();
      if (!var2.CRORCRRHRRIRIIIRHIOOIOOHCIIIRR().get()) {
         return false;
      }

      this.urls.clear();
      if (var1 != null) {
         this.urls.add(var1);
      } else {
         Component var3 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
            .bridge$getGuiIngame()
            .bridge$getChatGUI()
            .bridge$getMessageContentByLunarId(HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCIHHIRIIRCHHRIIRHHHRHHIROHCOO());
         if (var3 == null) {
            return false;
         }

         String var4 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.getTextWithoutFormattingCodes(
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.getTextContent(var3)
         );
         Matcher var5 = HRCHCHICHCROOOIROIIRIHORIRHIRH.matcher(var4);

         while (var5.find()) {
            this.urls.add(this.IRCHOIROHOHHOIHCICOROOOHIOOIIR(var5.group()));
         }
      }

      if (this.urls.isEmpty()) {
         return false;
      }

      int var7 = this.ICOCIIORRIICHOHORHORIIRHCRCOIH % this.urls.size();
      String var8 = this.urls.get(var7);
      if (this.RCCIIROIHCCRRIICRIHHCRCCIRIOIC && var8.equals(this.OHRROHOHCHRCIHOROORHICHIIIRRRI)) {
         return true;
      }

      try {
         Future var9 = (Future)this.RIRRCORROOHICCHOHOORICRRCHRCOR.get(var8);
         if (this.urls.size() > 1
            && this.RCCIIROIHCCRRIICRIHHCRCCIRIOIC
            && this.OHHCIRIOROOHCHIICIHHIIIHHHCOHH != null
            && this.OHHCIRIOROOHCHIICIHHIIIHHHCOHH.isDone()
            && !var9.isDone()) {
            return true;
         }

         this.OHHCIRIOROOHCHIICIHHIIIHHHCOHH = var9;
         this.RCCIIROIHCCRRIICRIHHCRCCIRIOIC = true;
         this.OHRROHOHCHRCIHOROORHICHIIIRRRI = var8;
         this.RRCOOOOOOCIIHCICIICHIHRCRIRIHI = null;
         return true;
      } catch (ExecutionException var6) {
         var6.printStackTrace();
         return false;
      }
   }

   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
   ) {
      if (!var1.OOHCOIRICORORHOHHORCICOOICIORO()
         && var1.COCHHOHRHIHICIHOHHHHICHRIIHCRI()
            == com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.DOWN
         && var1.CCICCIOCIHOOIHCIRCHHHRROHIHHIH()
            == com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.KEY_LCONTROL) {
         this.ICOCIIORRIICHOHORHORIIRHCRCOIH++;
      }
   }

   public boolean CRHOOHHCIOOCCHRCRICCIICIOHHCRR() {
      return this.RCCIIROIHCCRRIICRIHHCRCCIRIOIC && this.OHHCIRIOROOHCHIICIHHIIIHHHCOHH != null && this.OHHCIRIOROOHCHIICIHHIIIHHHCOHH.isDone();
   }

   public void OIHRHIRRHRRIRHROORRROCOHOIHCRC() {
      this.RCCIIROIHCCRRIICRIHHCRCCIRIOIC = false;
      this.OHHCIRIOROOHCHIICIHHIIIHHHCOHH = null;
      this.RRCOOOOOOCIIHCICIICHIHRCRIRIHI = null;
      this.RIROHROOOIRICCCIORCORRHHRCOHII.stop();
      this.RIROHROOOIRICCCIORCORRHHRCOHII.ROHHCOIHHRHOICCCRCCRRRHHHOIHCI(false);
   }

   protected void clearCache() {
      this.RIRRCORROOHICCHOHOORICRRCHRCOR.invalidateAll();
   }
}
