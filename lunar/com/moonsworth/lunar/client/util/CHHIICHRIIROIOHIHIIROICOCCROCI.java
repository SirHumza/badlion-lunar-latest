package com.moonsworth.lunar.client.util;

import java.awt.AWTException;
import java.awt.Image;
import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.awt.TrayIcon.MessageType;
import java.io.IOException;
import java.util.function.BooleanSupplier;
import javax.imageio.ImageIO;
import lombok.Generated;
import org.jetbrains.annotations.Nullable;

public class CHHIICHRIIROIOHIHIIROICOCCROCI {
   private static final CHHIICHRIIROIOHIHIIROICOCCROCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RORROHRCIIOOIHRCIIOOHHCIHCCOIC;
   private static final Image ROIROCHOROCHRIRIHHIIOIHRRICHHR;

   public static boolean RHIOHCICICCOCOHRRCICHRCIICHOCC() {
      return RORROHRCIIOOIHRCIIOOHHCIHCCOIC != CHHIICHRIIROIOHIHIIROICOCCROCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.NONE;
   }

   public static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var0, String var1, MessageType var2) {
      if (RORROHRCIIOOIHRCIIOOHHCIHCCOIC != CHHIICHRIIROIOHIHIIROICOCCROCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.NONE) {
         RORROHRCIIOOIHRCIIOOHHCIHCCOIC.runner.send(var0, var1, var2);
      }
   }

   @Nullable
   private static Image OCIHCOOHICCRCHHIOOORCHIHIORRHH() {
      try {
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CORCOCICIRIOHROHROIIOOHICCHCRR.RRCRRCORICCHOHHIRCHIROOHIIOHCO var0 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
            .bridge$getResourceManager()
            .bridge$getResource(
               com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.create(
                  "lunar", "logo/logo-64x64.png"
               )
            );
         return var0 == null ? null : ImageIO.read(var0.bridge$getInputStream());
      } catch (IOException var1) {
         return null;
      }
   }

   static {
      if (IIRHCHHOICHRICOOCRORCCIOOIHOIR.ROICCHIORCHICRRCHIIHIHRCOOOORI) {
         RORROHRCIIOOIHRCIIOOHHCIHCCOIC = CHHIICHRIIROIOHIHIIROICOCCROCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.NONE;
         ROIROCHOROCHRIRIHHIIOIHRRICHHR = null;
      } else {
         CHHIICHRIIROIOHIHIIROICOCCROCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var0 = CHHIICHRIIROIOHIHIIROICOCCROCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.NONE;
         Image var1 = null;

         for (CHHIICHRIIROIOHIHIIROICOCCROCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var5 : CHHIICHRIIROIOHIHIIROICOCCROCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.values()) {
            if (var5 != CHHIICHRIIROIOHIHIIROICOCCROCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.NONE) {
               if (var5.needsIcon) {
                  if (var1 == null) {
                     var1 = OCIHCOOHICCRCHHIOOORCHIHIORRHH();
                  }

                  if (var1 == null) {
                     continue;
                  }
               }

               if (var5.tester.getAsBoolean()) {
                  var0 = var5;
                  break;
               }
            }
         }

         RORROHRCIIOOIHRCIIOOHHCIHCCOIC = var0;
         ROIROCHOROCHRIRIHHIIOIHRRICHHR = RORROHRCIIOOIHRCIIOOHHCIHCCOIC.needsIcon ? var1 : null;
      }
   }

   @FunctionalInterface
   private interface IRCIIHHICIHRCOCRROCOICRIHHCCHH {
      void send(String var1, String var2, MessageType var3);
   }

   public enum RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      NONE(false, null, null),
      NOTIFY(false, () -> {
         if (!RIHOOCIHRICOCHRHCOOCCOIHOCHRCR.isLinux()) {
            return false;
         }

         try {
            return Runtime.getRuntime().exec(new String[]{"notify-send", "--help", ">", "nil"}).waitFor() == 0;
         } catch (Exception var1) {
            return false;
         }
      }, (var0, var1, var2) -> {
         String var3 = switch (var2) {
            case ERROR -> "critical";
            case WARNING -> "normal";
            default -> "low";
         };
         ProcessBuilder var4 = new ProcessBuilder("notify-send", "--app-name=Lunar Client", "--urgency=" + var3, "--", var0, var1);

         try {
            var4.start();
         } catch (IOException var6) {
            throw new RuntimeException(var6);
         }
      }),
      SYSTEM_TRAY(true, SystemTray::isSupported, (var0, var1, var2) -> {
         SystemTray var3 = SystemTray.getSystemTray();
         TrayIcon var4 = new TrayIcon(CHHIICHRIIROIOHIHIIROICOCCROCI.ROIROCHOROCHRIRIHHIIOIHRRICHHR, "Lunar Client");
         var4.setImageAutoSize(true);

         try {
            var3.add(var4);
            var4.displayMessage(var0, var1, var2);
         } catch (AWTException var6) {
            throw new RuntimeException(var6);
         }
      }),
      APPLE_SCRIPT(
         false,
         () -> {
            if (!RIHOOCIHRICOCHRHCOOCCOIHOCHRCR.isMacos()) {
               return false;
            }

            try {
               Process var0 = Runtime.getRuntime().exec(new String[]{"osascript", "-?"});
               return var0.waitFor() != 2 && var0.exitValue() != 0;
            } catch (Exception var1) {
               return false;
            }
         },
         (var0, var1, var2) -> {
            ProcessBuilder var3 = new ProcessBuilder(
               "osascript",
               "-e",
               "display notification (system attribute \"LUNAR_NOTIFICATION_MESSAGE\") with title (system attribute \"LUNAR_NOTIFICATION_TITLE\")"
            );
            var3.environment().put("LUNAR_NOTIFICATION_TITLE", var0);
            var3.environment().put("LUNAR_NOTIFICATION_MESSAGE", var1);

            try {
               var3.start();
            } catch (IOException var5) {
               throw new RuntimeException(var5);
            }
         }
      );

      private final boolean needsIcon;
      private final BooleanSupplier tester;
      private final CHHIICHRIIROIOHIHIIROICOCCROCI.IRCIIHHICIHRCOCRROCOICRIHHCCHH runner;

      @Generated
      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(boolean var3, BooleanSupplier var4, CHHIICHRIIROIOHIHIIROICOCCROCI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var5) {
         this.needsIcon = var3;
         this.tester = var4;
         this.runner = var5;
      }
   }
}
