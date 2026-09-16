package org.spongepowered.asm.service.modlauncher;

import cpw.mods.modlauncher.serviceapi.ILaunchPluginService.Phase;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.launch.IClassProcessor;
import org.spongepowered.asm.launch.Phases;
import org.spongepowered.asm.service.IClassTracker;

public class ModLauncherClassTracker implements IClassProcessor, IClassTracker {
   private final Set<String> invalidClasses = new HashSet<>();
   private final Set<String> loadedClasses = new HashSet<>();

   @Override
   public void registerInvalidClass(String var1) {
      synchronized (this.invalidClasses) {
         this.invalidClasses.add(var1);
      }
   }

   @Override
   public boolean isClassLoaded(String var1) {
      synchronized (this.loadedClasses) {
         return this.loadedClasses.contains(var1);
      }
   }

   @Override
   public String getClassRestrictions(String var1) {
      return "";
   }

   @Override
   public EnumSet<Phase> handlesClass(Type var1, boolean var2, String var3) {
      String var4 = var1.getClassName();
      synchronized (this.invalidClasses) {
         if (this.invalidClasses.contains(var4)) {
            throw new NoClassDefFoundError(String.format("%s is invalid", var4));
         }
      }

      return Phases.AFTER_ONLY;
   }

   @Override
   public boolean processClass(Phase var1, ClassNode var2, Type var3, String var4) {
      if ("classloading".equals(var4)) {
         synchronized (this.loadedClasses) {
            this.loadedClasses.add(var3.getClassName());
         }
      }

      return false;
   }

   @Override
   public boolean generatesClass(Type var1) {
      return false;
   }

   @Override
   public boolean generateClass(Type var1, ClassNode var2) {
      return false;
   }
}
