package com.moonsworth.lunar.legacy;

import com.moonsworth.lunar.ichor.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;
import com.moonsworth.lunar.ichor.api.IchorAPI;
import com.moonsworth.lunar.ichor.util.OCOHORHCROHICRRIHCIHHRRCIHICRI;
import java.util.ServiceLoader;

public abstract class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   private static IRCIIHHICIHRCOCRROCOICRIHHCCHH instance;

   public static IRCIIHHICIHRCOCRROCOICRIHHCCHH getInstance() {
      if (instance == null) {
         OOROOCCIRCCRHOIOIORIHCHHOOCCOR var0 = (OOROOCCIRCCRHOIOIORIHCHHOOCCOR)IchorAPI.getPipeline(
               com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class
            )
            .orElseThrow();
         com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1 = com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCIIROIOORRIOIIIRHIRRCCIIRRROH(
            var0.ICRROHROHHOHRRRIIHORIRICHRCOIC().OIIOOOICRROIHRIROICHOCOHIHHRHH()
         );
         ClassLoader var2 = IRCIIHHICIHRCOCRROCOICRIHHCCHH.class.getClassLoader();

         for (IRCIIHHICIHRCOCRROCOICRIHHCCHH var5 : ServiceLoader.load(IRCIIHHICIHRCOCRROCOICRIHHCCHH.class, var2)) {
            if (var5.getMinecraftVersion().equals(var1)) {
               instance = var5;
               break;
            }
         }

         if (instance == null) {
            throw new IllegalStateException("No MultiBridge found for Minecraft version " + var1);
         }

         OCOHORHCROHICRRIHCIHHRRCIHICRI.IRRCCOICORICIHCHRHIHIHROIRHOCR
            .info("Creating MultiBridgeLegacy instance: " + instance.getClass().getSimpleName(), new Object[0]);
      }

      return instance;
   }

   public abstract com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH getMinecraftVersion();
}
