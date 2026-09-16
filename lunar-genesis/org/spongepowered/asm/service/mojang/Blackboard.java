package org.spongepowered.asm.service.mojang;

import net.minecraft.launchwrapper.Launch;
import org.spongepowered.asm.service.IGlobalPropertyService;
import org.spongepowered.asm.service.IPropertyKey;

public class Blackboard implements IGlobalPropertyService {
   public Blackboard() {
      Launch.classLoader.hashCode();
   }

   @Override
   public IPropertyKey resolveKey(String var1) {
      return new Blackboard.Key(var1);
   }

   @Override
   public final <T> T getProperty(IPropertyKey var1) {
      return (T)Launch.blackboard.get(var1.toString());
   }

   @Override
   public final void setProperty(IPropertyKey var1, Object var2) {
      Launch.blackboard.put(var1.toString(), var2);
   }

   @Override
   public final <T> T getProperty(IPropertyKey var1, T var2) {
      Object var3 = Launch.blackboard.get(var1.toString());
      return (T)(var3 != null ? var3 : var2);
   }

   @Override
   public final String getPropertyString(IPropertyKey var1, String var2) {
      Object var3 = Launch.blackboard.get(var1.toString());
      return var3 != null ? var3.toString() : var2;
   }

   class Key implements IPropertyKey {
      private final String key;

      Key(String var2) {
         this.key = var2;
      }

      @Override
      public String toString() {
         return this.key;
      }
   }
}
