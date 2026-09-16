package com.moonsworth.lunar.client.util;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.image.BufferedImage;
import java.nio.file.Path;
import java.util.concurrent.TimeUnit;
import javax.imageio.ImageIO;
import org.apache.commons.lang3.StringUtils;
import org.jetbrains.annotations.Nullable;

public class IIHRRHORCRCROCHHOHORCHCROCIHRO {
   public static String CIOIIRIRCCOICRROOCHHCHRROORCOH() {
      if (IIRHCHHOICHRICOOCRORCCIOOIHOIR.ROICCHIORCHICRRCHIIHIHRCOOOORI) {
         return com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OICIRICHOHHIIHIRRRROORCRRRCORH()
            .RCIORHCHCIOIHIORRCRICCRIRRRROO();
      }

      try {
         Clipboard var0 = Toolkit.getDefaultToolkit().getSystemClipboard();
         if (var0.isDataFlavorAvailable(DataFlavor.stringFlavor)) {
            return (String)var0.getData(DataFlavor.stringFlavor);
         }
      } catch (Exception var1) {
      }

      return "";
   }

   public static void CROIHRIIRROCHORIIRIOCROOORRCCH(String var0) {
      if (!StringUtils.isEmpty(var0)) {
         if (IIRHCHHOICHRICOOCRORCCIOOIHOIR.ROICCHIORCHICRRCHIIHIHRCOOOORI) {
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OICIRICHOHHIIHIRRRROORCRRRCORH()
               .RCRCCORIIOICRIIRHCCIIOCICRHIOC(var0);
            return;
         }

         try {
            StringSelection var1 = new StringSelection(var0);
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(var1, null);
         } catch (Exception var2) {
         }
      }
   }

   public static boolean CICCIHICOCHHRCCHIOHOCICCOCIHRH() {
      return !IIRHCHHOICHRICOOCRORCCIOOIHOIR.ROICCHIORCHICRRCHIIHIHRCOOOORI || RIHOOCIHRICOCHRHCOOCCOIHOCHRCR.isMacos();
   }

   public static boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(@Nullable BufferedImage var0, Path var1) {
      if (!IIRHCHHOICHRICOOCRORCCIOOIHOIR.ROICCHIORCHICRRCHIIHIHRCOOOORI) {
         try {
            BufferedImage var2 = var0 != null ? var0 : ImageIO.read(var1.toFile());
            if (var2 == null) {
               return false;
            }

            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2), null);
            return true;
         } catch (Exception var3) {
            com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.warn("Couldn't copy image to the clipboard", var3);
            return false;
         }
      } else {
         return RIHOOCIHRICOCHRHCOOCCOIHOCHRCR.isMacos() ? RIROICHCRROROHCCROOCCCCOCHCCRI(var1) : false;
      }
   }

   private static boolean RIROICHCRROROHCCROOCCCCOCHCCRI(Path var0) {
      String var1 = var0.toAbsolutePath().toString().replace("\\", "\\\\").replace("\"", "\\\"");

      try {
         Process var2 = new ProcessBuilder("osascript", "-e", "set the clipboard to (read (POSIX file \"" + var1 + "\") as «class PNGf»)").start();
         if (!var2.waitFor(10L, TimeUnit.SECONDS)) {
            var2.destroyForcibly();
            return false;
         } else {
            return var2.exitValue() == 0;
         }
      } catch (Exception var3) {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.warn(
            "Couldn't copy image to the clipboard via osascript", var3
         );
         return false;
      }
   }

   private static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements Transferable {
      private final Image RCOCOIHOIHROIHRIIRCCHCOCCCOCRO;

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Image var1) {
         this.RCOCOIHOIHROIHRIIRCCHCOCCCOCRO = var1;
      }

      @Override
      public DataFlavor[] getTransferDataFlavors() {
         return new DataFlavor[]{DataFlavor.imageFlavor};
      }

      @Override
      public boolean isDataFlavorSupported(DataFlavor var1) {
         return DataFlavor.imageFlavor == var1;
      }

      @Override
      public Object getTransferData(DataFlavor var1) {
         if (DataFlavor.imageFlavor != var1) {
            throw new UnsupportedFlavorException(var1);
         } else {
            return this.RCOCOIHOIHROIHRIIRCCHCOCCCOCRO;
         }
      }
   }
}
