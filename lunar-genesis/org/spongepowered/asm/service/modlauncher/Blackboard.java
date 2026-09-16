package org.spongepowered.asm.service.modlauncher;

import cpw.mods.modlauncher.Launcher;
import cpw.mods.modlauncher.api.TypesafeMap;
import java.util.HashMap;
import java.util.Map;
import org.spongepowered.asm.service.IGlobalPropertyService;
import org.spongepowered.asm.service.IPropertyKey;

public class Blackboard implements IGlobalPropertyService {
   private final Map<String, IPropertyKey> keys = new HashMap<>();
   private final TypesafeMap blackboard = Launcher.INSTANCE.blackboard();

   @Override
   public IPropertyKey resolveKey(String var1) {
      return this.keys.computeIfAbsent(var1, var1x -> new Blackboard.Key<>(this.blackboard, var1x, Object.class));
   }

   @Override
   public <T> T getProperty(IPropertyKey var1) {
      return this.getProperty(var1, null);
   }

   @Override
   public void setProperty(IPropertyKey var1, Object var2) {
      this.blackboard.computeIfAbsent(((Blackboard.Key)var1).key, var1x -> var2);
   }

   @Override
   public String getPropertyString(IPropertyKey var1, String var2) {
      return this.getProperty(var1, var2);
   }

   @Override
   public <T> T getProperty(IPropertyKey var1, T var2) {
      return (T)this.blackboard.get(((Blackboard.Key)var1).key).orElse(var2);
   }

   class Key<V> implements IPropertyKey {
      final cpw.mods.modlauncher.api.TypesafeMap.Key<V> key;

      public Key(TypesafeMap var2, String var3, Class<V> var4) {
         this.key = cpw.mods.modlauncher.api.TypesafeMap.Key.getOrCreate(var2, var3, var4);
      }
   }
}
