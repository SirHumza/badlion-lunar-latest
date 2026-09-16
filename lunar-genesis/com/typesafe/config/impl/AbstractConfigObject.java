package com.typesafe.config.impl;

import com.typesafe.config.ConfigException;
import com.typesafe.config.ConfigMergeable;
import com.typesafe.config.ConfigObject;
import com.typesafe.config.ConfigOrigin;
import com.typesafe.config.ConfigRenderOptions;
import com.typesafe.config.ConfigValue;
import com.typesafe.config.ConfigValueType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

abstract class AbstractConfigObject extends AbstractConfigValue implements ConfigObject, Container {
   private final SimpleConfig config = new SimpleConfig(this);

   protected AbstractConfigObject(ConfigOrigin var1) {
      super(var1);
   }

   public SimpleConfig toConfig() {
      return this.config;
   }

   public AbstractConfigObject toFallbackValue() {
      return this;
   }

   public abstract AbstractConfigObject withOnlyKey(String var1);

   public abstract AbstractConfigObject withoutKey(String var1);

   public abstract AbstractConfigObject withValue(String var1, ConfigValue var2);

   protected abstract AbstractConfigObject withOnlyPathOrNull(Path var1);

   abstract AbstractConfigObject withOnlyPath(Path var1);

   abstract AbstractConfigObject withoutPath(Path var1);

   abstract AbstractConfigObject withValue(Path var1, ConfigValue var2);

   protected final AbstractConfigValue peekAssumingResolved(String var1, Path var2) {
      try {
         return this.attemptPeekWithPartialResolve(var1);
      } catch (ConfigException.NotResolved var4) {
         throw ConfigImpl.improveNotResolved(var2, var4);
      }
   }

   abstract AbstractConfigValue attemptPeekWithPartialResolve(String var1);

   protected AbstractConfigValue peekPath(Path var1) {
      return peekPath(this, var1);
   }

   private static AbstractConfigValue peekPath(AbstractConfigObject var0, Path var1) {
      try {
         Path var2 = var1.remainder();
         AbstractConfigValue var3 = var0.attemptPeekWithPartialResolve(var1.first());
         if (var2 == null) {
            return var3;
         } else {
            return var3 instanceof AbstractConfigObject ? peekPath((AbstractConfigObject)var3, var2) : null;
         }
      } catch (ConfigException.NotResolved var4) {
         throw ConfigImpl.improveNotResolved(var1, var4);
      }
   }

   @Override
   public ConfigValueType valueType() {
      return ConfigValueType.OBJECT;
   }

   protected abstract AbstractConfigObject newCopy(ResolveStatus var1, ConfigOrigin var2);

   protected AbstractConfigObject newCopy(ConfigOrigin var1) {
      return this.newCopy(this.resolveStatus(), var1);
   }

   protected AbstractConfigObject constructDelayedMerge(ConfigOrigin var1, List<AbstractConfigValue> var2) {
      return new ConfigDelayedMergeObject(var1, var2);
   }

   protected abstract AbstractConfigObject mergedWithObject(AbstractConfigObject var1);

   public AbstractConfigObject withFallback(ConfigMergeable var1) {
      return (AbstractConfigObject)super.withFallback(var1);
   }

   static ConfigOrigin mergeOrigins(Collection<? extends AbstractConfigValue> var0) {
      if (var0.isEmpty()) {
         throw new ConfigException.BugOrBroken("can't merge origins on empty list");
      }

      ArrayList var1 = new ArrayList();
      SimpleConfigOrigin var2 = null;
      int var3 = 0;

      for (AbstractConfigValue var5 : var0) {
         if (var2 == null) {
            var2 = var5.origin();
         }

         if (!(var5 instanceof AbstractConfigObject)
            || ((AbstractConfigObject)var5).resolveStatus() != ResolveStatus.RESOLVED
            || !((ConfigObject)var5).isEmpty()) {
            var1.add(var5.origin());
            var3++;
         }
      }

      if (var3 == 0) {
         var1.add(var2);
      }

      return SimpleConfigOrigin.mergeOrigins(var1);
   }

   static ConfigOrigin mergeOrigins(AbstractConfigObject... var0) {
      return mergeOrigins(Arrays.asList(var0));
   }

   @Override
   abstract ResolveResult<? extends AbstractConfigObject> resolveSubstitutions(ResolveContext var1, ResolveSource var2);

   abstract AbstractConfigObject relativized(Path var1);

   public abstract AbstractConfigValue get(Object var1);

   @Override
   protected abstract void render(StringBuilder var1, int var2, boolean var3, ConfigRenderOptions var4);

   private static UnsupportedOperationException weAreImmutable(String var0) {
      return new UnsupportedOperationException("ConfigObject is immutable, you can't call Map." + var0);
   }

   @Override
   public void clear() {
      throw weAreImmutable("clear");
   }

   public ConfigValue put(String var1, ConfigValue var2) {
      throw weAreImmutable("put");
   }

   @Override
   public void putAll(Map<? extends String, ? extends ConfigValue> var1) {
      throw weAreImmutable("putAll");
   }

   public ConfigValue remove(Object var1) {
      throw weAreImmutable("remove");
   }

   public AbstractConfigObject withOrigin(ConfigOrigin var1) {
      return (AbstractConfigObject)super.withOrigin(var1);
   }
}
