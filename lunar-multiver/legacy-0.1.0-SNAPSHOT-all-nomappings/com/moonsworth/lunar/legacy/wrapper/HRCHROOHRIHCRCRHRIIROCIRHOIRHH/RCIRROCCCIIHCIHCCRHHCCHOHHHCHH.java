package com.moonsworth.lunar.legacy.wrapper.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;

import com.moonsworth.lunar.client.util.IHIRRIIORRHORHRORIHOROIRCORCOO;
import com.moonsworth.lunar.ichor.api.IchorAPI;
import com.moonsworth.lunar.ichor.util.OCOHORHCROHICRRIHCIHHRRCIHICRI;
import java.util.ServiceLoader;
import net.minecraft.client.Minecraft;
import net.minecraft.world.World;

public abstract class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private static RCIRROCCCIIHCIHCCRHHCCHOHHHCHH instance;

   public static RCIRROCCCIIHCIHCCRHHCCHOHHHCHH getInstance() {
      if (instance == null) {
         com.moonsworth.lunar.ichor.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var0 = (com.moonsworth.lunar.ichor.OOROOCCIRCCRHOIOIORIHCHHOOCCOR)IchorAPI.getPipeline(
               com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class
            )
            .orElseThrow();
         com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1 = com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OCIIROIOORRIOIIIRHIRRCCIIRRROH(
            var0.ICRROHROHHOHRRRIIHORIRICHRCOIC().OIIOOOICRROIHRIROICHOCOHIHHRHH()
         );
         ClassLoader var2 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class.getClassLoader();

         for (RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var5 : ServiceLoader.load(RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class, var2)) {
            if (var5.getMinecraftVersion().equals(var1)) {
               instance = var5;
               break;
            }
         }

         if (instance == null) {
            throw new IllegalStateException("No AncientDummyPlayer found for Minecraft version " + var1);
         }

         OCOHORHCROHICRRIHCIHHRRCIHICRI.IRRCCOICORICIHCHRHIHIHROIRHOCR
            .info("Creating AncientDummyPlayer instance: " + instance.getClass().getSimpleName(), new Object[0]);
      }

      return instance;
   }

   public abstract IHIRRIIORRHORHRORIHOROIRCORCOO createDummyPlayer(Minecraft var1, World var2);

   public abstract com.moonsworth.lunar.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH getMinecraftVersion();
}
