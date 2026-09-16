package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.mojang.text2speech.Narrator;
import com.mojang.text2speech.NarratorDummy;
import com.mojang.text2speech.NarratorLinux;
import com.mojang.text2speech.NarratorOSX;
import com.mojang.text2speech.NarratorWindows;
import com.moonsworth.lunar.client.util.IIRHCHHOICHRICOOCRORCCIOOIHOIR;
import java.util.Locale;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
@Mixin(Narrator.class)
public interface RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   @Overwrite
   static Narrator getNarrator() {
      Logger var0 = LogManager.getLogger();

      try {
         String var1 = IIRHCHHOICHRICOOCRORCCIOOIHOIR.HIOCHICRIOCICHRCOOCOROIHIIHCHO.toLowerCase(Locale.ROOT);
         if (var1.contains("linux")) {
            Narrator.setJNAPath(":");
            return new NarratorLinux();
         } else if (var1.contains("win")) {
            Narrator.setJNAPath(";");
            return new NarratorWindows();
         } else if (var1.contains("mac") && !System.getProperty("os.arch", "x86").equals("aarch64")) {
            Narrator.setJNAPath(":");
            return new NarratorOSX();
         } else {
            return new NarratorDummy();
         }
      } catch (Throwable var2) {
         var0.error(String.format("Error while loading the narrator : %s", var2));
         return new NarratorDummy();
      }
   }
}
