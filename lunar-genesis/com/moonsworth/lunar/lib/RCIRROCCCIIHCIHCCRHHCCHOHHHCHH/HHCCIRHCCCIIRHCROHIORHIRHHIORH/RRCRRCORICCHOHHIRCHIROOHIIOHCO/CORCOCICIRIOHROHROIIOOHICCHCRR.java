package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;

import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR;
import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystemNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.spi.FileSystemProvider;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;

public class CORCOCICIRIOHROHROIIOOHICCHCRR extends ROOCOCCCIRHHHIRIOIHHHHRHIICHHR<Path> {
   private static final long OICCIORCRHROOCHORRRHIOHCIHRORC = 1L;
   private static final boolean CRIROICROCCOCCCHRHIRRRRRHRROII;

   public CORCOCICIRIOHROHROIIOOHICCHCRR() {
      super(Path.class);
   }

   public Path IRRCHICCRHCHRRCHIOHIIRIORIRHRI(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var2
   ) {
      if (!var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(OHHRIOHROOIHOROCIRHCHORIHRRRRI.VALUE_STRING)) {
         return (Path)var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Path.class, var1);
      }

      String var3 = var1.getText();
      if (var3.indexOf(58) < 0) {
         return Paths.get(var3);
      }

      if (CRIROICROCCOCCCHRHIRRRRRHRROII && var3.length() >= 2 && Character.isLetter(var3.charAt(0)) && var3.charAt(1) == ':') {
         return Paths.get(var3);
      }

      URI var4;
      try {
         var4 = new URI(var3);
      } catch (URISyntaxException var12) {
         return (Path)var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.handledType(), var3, var12);
      }

      try {
         return Paths.get(var4);
      } catch (FileSystemNotFoundException var10) {
         FileSystemNotFoundException var5 = var10;

         try {
            String var6 = var4.getScheme();

            for (FileSystemProvider var8 : ServiceLoader.load(FileSystemProvider.class)) {
               if (var8.getScheme().equalsIgnoreCase(var6)) {
                  return var8.getPath(var4);
               }
            }

            return (Path)var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.handledType(), var3, var5);
         } catch (ServiceConfigurationError var9) {
            var9.addSuppressed(var10);
            return (Path)var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.handledType(), var3, var9);
         }
      } catch (Exception var11) {
         return (Path)var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.handledType(), var3, var11);
      }
   }

   static {
      boolean var0 = false;

      for (File var4 : File.listRoots()) {
         String var5 = var4.getPath();
         if (var5.length() >= 2 && Character.isLetter(var5.charAt(0)) && var5.charAt(1) == ':') {
            var0 = true;
            break;
         }
      }

      CRIROICROCCOCCCHRHIRRRRRHRROII = var0;
   }
}
