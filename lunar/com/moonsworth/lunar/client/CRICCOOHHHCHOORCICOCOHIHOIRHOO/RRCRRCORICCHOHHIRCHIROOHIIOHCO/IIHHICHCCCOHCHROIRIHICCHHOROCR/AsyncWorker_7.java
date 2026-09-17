package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IIHHICHCCCOHCHROIRIHICCHHOROCR;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.IIHRRHORCRCROCHHOHORCHCROCIHRO;
import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.TextComponent;
import com.moonsworth.lunar.lib.adventure.text.event.ClickEvent;
import com.moonsworth.lunar.lib.adventure.text.event.HoverEvent;
import com.moonsworth.lunar.lib.adventure.text.format.NamedTextColor;
import com.moonsworth.lunar.lib.adventure.text.format.TextDecoration;
import java.awt.image.BufferedImage;
import java.io.File;
import java.nio.IntBuffer;
import java.util.UUID;
import java.util.function.Function;
import javax.annotation.Nullable;

public class HRCHROOHRIHCRCRHRIIROCIRHOIRHH {
   private IntBuffer ICOCCICORCOCIROIROIHHHOORCCHCO;
   private int[] CCRIOHHCOCHCRRRHOIIORHRRHIICHC;

   public static void IRCIIHHICIHRCOCRROCOICRIHHCCHH(int[] var0, int var1, int var2) {
      int[] var3 = new int[var1];
      int var4 = var2 / 2;

      for (int var5 = 0; var5 < var4; var5++) {
         System.arraycopy(var0, var5 * var1, var3, 0, var1);
         System.arraycopy(var0, (var2 - 1 - var5) * var1, var0, var5 * var1, var1);
         System.arraycopy(var3, 0, var0, (var2 - 1 - var5) * var1, var1);
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CRRRICCRROCOHHOHIICIHORCOORRRH var1, File var2) {
      File var3 = new File(var2, "screenshots");
      if (!var3.exists()) {
         var3.mkdir();
      }

      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var1,
         CRRRICCRROCOHHOHIICIHORCOORRRH.IIRHCHHOICHRICOOCRORCCIOOIHOIR(var3),
         IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$displayWidth(),
         IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$displayHeight(),
         IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getMainRenderTarget()
      );
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      @Nullable CRRRICCRROCOHHOHIICIHORCOORRRH var1,
      File var2,
      int var3,
      int var4,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var5,
      boolean var6
   ) {
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2, var3, var4, var5, var6, null, () -> {});
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      @Nullable CRRRICCRROCOHHOHIICIHORCOORRRH var1,
      File var2,
      int var3,
      int var4,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var5
   ) {
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2, var3, var4, var5, true, null, () -> {});
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      @Nullable CRRRICCRROCOHHOHIICIHORCOORRRH var1,
      File var2,
      int var3,
      int var4,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var5,
      boolean var6,
      Function<int[], BufferedImage> var7,
      Runnable var8
   ) {
      if (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RHCHHROCORIHCIORRRIIOHIRHCRIOH().CCCCCHHRHOIHHORCHHOCIHHRCHOCRC()) {
         var3 = var5.bridge$framebufferTextureWidth();
         var4 = var5.bridge$framebufferTextureHeight();
      }

      int var9 = var3;
      int var10 = var4;
      HHCCIRHCCCIIRHCROHIORHIRHHIORH var11 = var6 ? HHCCIRHCCCIIRHCROHIORHIRHHIORH.IOHIRRHCOICRCRROCCOOHIOICCCICO() : null;
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var5.bridge$getColorTexture(false),
            0,
            0,
            var3,
            var4,
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RGBA8,
            var8x -> {
               int[] var9x = new int[var8x.remaining() / 4];
               var8x.asIntBuffer().get(var9x);
               new IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, var9x, var9, var10, var5, var2, var11, var7, var8).start();
            }
         );
   }

   public static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CRRRICCRROCOHHOHIICIHORCOORRRH var0, File var1, BufferedImage var2, UUID var3, boolean var4) {
      String var6 = var1.getName();
      String var5;
      if (var0.ICCCROIRHIHIIHRICOHHIOROIIICHH().get() && IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var1.toPath())) {
         var5 = var0.IRCIIHHICIHRCOCRROCOICRIHHCCHH("savedAndCopiedScreenshot");
      } else {
         var5 = var0.IRCIIHHICIHRCOCRROCOICRIHHCCHH("savedScreenshot");
      }

      TextComponent.Builder var7 = Component.text();
      var7.append(Component.text(var5).decorate(TextDecoration.UNDERLINED));
      TextComponent.Builder var8 = Component.text()
         .decorate(TextDecoration.BOLD)
         .color(NamedTextColor.GOLD)
         .content(" [" + var0.IRCIIHHICIHRCOCRROCOICRIHHCCHH("open") + "]")
         .clickEvent(ClickEvent.openFile(var1.getCanonicalPath()))
         .hoverEvent(HoverEvent.showText(Component.text(var6)));
      var7.append(var8);
      if (IIHRRHORCRCROCHHOHORCHCROCIHRO.CICCIHICOCHHRCCHIOHOCICCOCIHRH() && var0.CHIHIOCCCOHCOIHOIRCIIRHRORRRHO().get()) {
         TextComponent.Builder var9 = Component.text()
            .decorate(TextDecoration.BOLD)
            .color(NamedTextColor.BLUE)
            .content(" [" + var0.IRCIIHHICIHRCOCRROCOICRIHHCCHH("copy") + "]")
            .clickEvent(ClickEvent.runCommand(var0.OORICCIROCHCRHRICRHIHCIOCCOIII() + "_copy " + var6))
            .hoverEvent(HoverEvent.showText(Component.text(var0.IRCIIHHICIHRCOCRROCOICRIHHCCHH("copyTheScreenshot"))));
         var7.append(var9);
      }

      if (var4 && var0.CIRHRCCIRCORIRIRRCIORRHRRHOIHR().get()) {
         TextComponent.Builder var10 = Component.text()
            .decorate(TextDecoration.BOLD)
            .color(NamedTextColor.GREEN)
            .content(" [" + var0.IRCIIHHICIHRCOCRROCOICRIHHCCHH("upload") + "]")
            .clickEvent(ClickEvent.runCommand(var0.OORICCIROCHCRHRICRHIHCIOCCOIII() + " " + var6 + " " + var3))
            .hoverEvent(
               HoverEvent.showText(
                  Component.text(var0.IRCIIHHICIHRCOCRROCOICRIHHCCHH("uploadTo"))
                     .append(Component.text(var0.IRCIIHHICIHRCOCRROCOICRIHHCCHH("uploadToOpen"), NamedTextColor.GREEN))
               )
            );
         var7.append(var10);
      }

      if (var4 && var0.IOCORIICCHCRHOHCHCCRCHHRICRCCI().get()) {
         TextComponent.Builder var11 = Component.text()
            .decorate(TextDecoration.BOLD)
            .color(NamedTextColor.AQUA)
            .content(" [" + var0.IRCIIHHICIHRCOCRROCOICRIHHCCHH("tweet") + "]")
            .clickEvent(ClickEvent.runCommand(var0.OORICCIROCHCRHRICRHIHCIOCCOIII() + "_tweet " + var6))
            .hoverEvent(
               HoverEvent.showText(
                  Component.text(var0.IRCIIHHICIHRCOCRROCOICRIHHCCHH("uploadTo"))
                     .append(Component.text(var0.IRCIIHHICIHRCOCRROCOICRIHHCCHH("uploadToTweet"), NamedTextColor.AQUA))
               )
            );
         var7.append(var11);
      }

      if (var0.CICROIIORORRIHHCCCRIHHHCCRCCHO().get()) {
         TextComponent.Builder var12 = Component.text()
            .decorate(TextDecoration.BOLD)
            .color(NamedTextColor.RED)
            .content(" [" + var0.IRCIIHHICIHRCOCRROCOICRIHHCCHH("delete") + "]")
            .clickEvent(ClickEvent.runCommand(var0.OORICCIROCHCRHRICRHIHCIOCCOIII() + "_delete " + var6))
            .hoverEvent(HoverEvent.showText(Component.text(var0.IRCIIHHICIHRCOCRROCOICRIHHCCHH("deleteTheScreenshot"))));
         var7.append(var12);
      }

      IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
         .bridge$submit(
            () -> IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
               .bridge$getGuiIngame()
               .bridge$getChatGUI()
               .bridge$addMessage(
                  com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.asBridge(var7.build())
               )
         );
   }
}
