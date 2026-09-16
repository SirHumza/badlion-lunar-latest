package org.spongepowered.asm.service.modlauncher;

import cpw.mods.modlauncher.Launcher;
import java.lang.reflect.Method;
import java.net.URL;
import org.spongepowered.asm.service.IClassProvider;

class ModLauncherClassProvider implements IClassProvider {
   @Deprecated
   @Override
   public URL[] getClassPath() {
      try {
         Class var1 = this.findClass("cpw.mods.gross.Java9ClassLoaderUtil");
         Method var2 = var1.getDeclaredMethod("getSystemClassPathURLs");
         return (URL[])var2.invoke(null);
      } catch (ReflectiveOperationException var3) {
         return new URL[0];
      }
   }

   @Override
   public Class<?> findClass(String var1) {
      return Class.forName(var1, true, Thread.currentThread().getContextClassLoader());
   }

   @Override
   public Class<?> findClass(String var1, boolean var2) {
      return Class.forName(var1, var2, Thread.currentThread().getContextClassLoader());
   }

   @Override
   public Class<?> findAgentClass(String var1, boolean var2) {
      return Class.forName(var1, var2, Launcher.class.getClassLoader());
   }
}
