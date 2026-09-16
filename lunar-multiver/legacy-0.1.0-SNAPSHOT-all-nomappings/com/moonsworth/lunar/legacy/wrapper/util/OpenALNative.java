package com.moonsworth.lunar.legacy.wrapper.util;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Platform;
import com.sun.jna.Pointer;
import java.nio.ByteBuffer;

@com.moonsworth.lunar.ichor.util.OOROOCCIRCCRHOIOIORIHCHHOOCCOR
public interface OpenALNative extends Library {
   OpenALNative INSTANCE = (OpenALNative)Native.load(getLibName(), OpenALNative.class);

   private static String getLibName() {
      if (Platform.isWindows()) {
         return Platform.is64Bit() ? "OpenAL64" : "OpenAL32";
      } else if (Platform.isLinux()
         && Platform.is64Bit()
         && com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.getMinecraftVersion().OCICRRCHRIRORHIRHIHOIRCCIHCHRH()) {
         return "openal64";
      } else {
         return Platform.isMac()
               && com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.getMinecraftVersion().OCICRRCHRIRORHIRHIHOIRCCIHCHRH()
            ? "openalsoft"
            : "openal";
      }
   }

   long alcLoopbackOpenDeviceSOFT(String var1);

   boolean alcIsRenderFormatSupportedSOFT(long var1, int var3, int var4, int var5);

   void alcRenderSamplesSOFT(long var1, ByteBuffer var3, int var4);

   Pointer alcGetString(long var1, int var3);

   boolean alcIsExtensionPresent(long var1, String var3);
}
