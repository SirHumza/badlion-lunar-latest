package com.moonsworth.lunar.ichor.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import java.net.URL;
import org.spongepowered.asm.launch.MixinBootstrap;
import org.spongepowered.asm.service.IClassProvider;

public class HHCCIRHCCCIIRHCROHIORHIRHHIORH implements IClassProvider {
   @Deprecated
   @Override
   public URL[] getClassPath() {
      return new URL[0];
   }

   @Override
   public Class<?> findClass(String var1) {
      return this.findClass(var1, true);
   }

   @Override
   public Class<?> findClass(String var1, boolean var2) {
      ClassLoader var3 = MixinBootstrap.class.getClassLoader();
      if (var3 instanceof com.moonsworth.lunar.ichor.api.IRCIIHHICIHRCOCRROCOICRIHHCCHH) {
         return Class.forName(var1, var2, var3);
      } else {
         throw new IllegalStateException("Loaded Mixin from " + var3.getName());
      }
   }

   @Override
   public Class<?> findAgentClass(String var1, boolean var2) {
      throw new ClassNotFoundException("Ichor doesn't support Mixin Agent Classes. Tried to find " + var1);
   }
}
