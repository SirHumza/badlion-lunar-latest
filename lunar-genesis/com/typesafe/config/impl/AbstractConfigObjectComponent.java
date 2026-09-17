package com.typesafe.config.impl;

import com.typesafe.config.ConfigException;
import com.typesafe.config.ConfigList;
import com.typesafe.config.ConfigMergeable;
import com.typesafe.config.ConfigOrigin;
import com.typesafe.config.ConfigRenderOptions;
import com.typesafe.config.ConfigValue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

final class ConfigDelayedMergeObject extends AbstractConfigObject implements ReplaceableMergeStack, Unmergeable {
   private final List<AbstractConfigValue> stack;

   ConfigDelayedMergeObject(ConfigOrigin var1, List<AbstractConfigValue> var2) {
      super(var1);
      this.stack = var2;
      if (var2.isEmpty()) {
         throw new ConfigException.BugOrBroken("creating empty delayed merge object");
      }

      if (!(var2.get(0) instanceof AbstractConfigObject)) {
         throw new ConfigException.BugOrBroken("created a delayed merge object not guaranteed to be an object");
      }

      for (AbstractConfigValue var4 : var2) {
         if (var4 instanceof ConfigDelayedMerge || var4 instanceof ConfigDelayedMergeObject) {
            throw new ConfigException.BugOrBroken("placed nested DelayedMerge in a ConfigDelayedMergeObject, should have consolidated stack");
         }
      }
   }

   protected ConfigDelayedMergeObject newCopy(ResolveStatus var1, ConfigOrigin var2) {
      if (var1 != this.resolveStatus()) {
         throw new ConfigException.BugOrBroken("attempt to create resolved ConfigDelayedMergeObject");
      } else {
         return new ConfigDelayedMergeObject(var2, this.stack);
      }
   }

   @Override
   ResolveResult<? extends AbstractConfigObject> resolveSubstitutions(ResolveContext var1, ResolveSource var2) {
      ResolveResult var3 = ConfigDelayedMerge.resolveSubstitutions(this, this.stack, var1, var2);
      return var3.asObjectResult();
   }

   @Override
   public AbstractConfigValue makeReplacement(ResolveContext var1, int var2) {
      return ConfigDelayedMerge.makeReplacement(var1, this.stack, var2);
   }

   @Override
   ResolveStatus resolveStatus() {
      return ResolveStatus.UNRESOLVED;
   }

   @Override
   public AbstractConfigValue replaceChild(AbstractConfigValue var1, AbstractConfigValue var2) {
      List var3 = replaceChildInList(this.stack, var1, var2);
      return var3 == null ? null : new ConfigDelayedMergeObject(this.origin(), var3);
   }

   @Override
   public boolean hasDescendant(AbstractConfigValue var1) {
      return hasDescendantInList(this.stack, var1);
   }

   ConfigDelayedMergeObject relativized(Path var1) {
      ArrayList var2 = new ArrayList();

      for (AbstractConfigValue var4 : this.stack) {
         var2.add(var4.relativized(var1));
      }

      return new ConfigDelayedMergeObject(this.origin(), var2);
   }

   @Override
   protected boolean ignoresFallbacks() {
      return ConfigDelayedMerge.stackIgnoresFallbacks(this.stack);
   }

   protected final ConfigDelayedMergeObject mergedWithTheUnmergeable(Unmergeable var1) {
      this.requireNotIgnoringFallbacks();
      return (ConfigDelayedMergeObject)this.mergedWithTheUnmergeable(this.stack, var1);
   }

   protected final ConfigDelayedMergeObject mergedWithObject(AbstractConfigObject var1) {
      return this.mergedWithNonObject(var1);
   }

   protected final ConfigDelayedMergeObject mergedWithNonObject(AbstractConfigValue var1) {
      this.requireNotIgnoringFallbacks();
      return (ConfigDelayedMergeObject)this.mergedWithNonObject(this.stack, var1);
   }

   public ConfigDelayedMergeObject withFallback(ConfigMergeable var1) {
      return (ConfigDelayedMergeObject)super.withFallback(var1);
   }

   public ConfigDelayedMergeObject withOnlyKey(String var1) {
      throw notResolved();
   }

   public ConfigDelayedMergeObject withoutKey(String var1) {
      throw notResolved();
   }

   @Override
   protected AbstractConfigObject withOnlyPathOrNull(Path var1) {
      throw notResolved();
   }

   @Override
   AbstractConfigObject withOnlyPath(Path var1) {
      throw notResolved();
   }

   @Override
   AbstractConfigObject withoutPath(Path var1) {
      throw notResolved();
   }

   public ConfigDelayedMergeObject withValue(String var1, ConfigValue var2) {
      throw notResolved();
   }

   ConfigDelayedMergeObject withValue(Path var1, ConfigValue var2) {
      throw notResolved();
   }

   @Override
   public Collection<AbstractConfigValue> unmergedValues() {
      return this.stack;
   }

   @Override
   protected boolean canEqual(Object var1) {
      return var1 instanceof ConfigDelayedMergeObject;
   }

   @Override
   public boolean equals(Object var1) {
      return !(var1 instanceof ConfigDelayedMergeObject)
         ? false
         : this.canEqual(var1) && (this.stack == ((ConfigDelayedMergeObject)var1).stack || this.stack.equals(((ConfigDelayedMergeObject)var1).stack));
   }

   @Override
   public int hashCode() {
      return this.stack.hashCode();
   }

   @Override
   protected void render(StringBuilder var1, int var2, boolean var3, String var4, ConfigRenderOptions var5) {
      ConfigDelayedMerge.render(this.stack, var1, var2, var3, var4, var5);
   }

   @Override
   protected void render(StringBuilder var1, int var2, boolean var3, ConfigRenderOptions var4) {
      this.render(var1, var2, var3, null, var4);
   }

   private static ConfigException notResolved() {
      return new ConfigException.NotResolved("need to Config#resolve() before using this object, see the API docs for Config#resolve()");
   }

   @Override
   public Map<String, Object> unwrapped() {
      throw notResolved();
   }

   @Override
   public AbstractConfigValue get(Object var1) {
      throw notResolved();
   }

   @Override
   public boolean containsKey(Object var1) {
      throw notResolved();
   }

   @Override
   public boolean containsValue(Object var1) {
      throw notResolved();
   }

   @Override
   public Set<Entry<String, ConfigValue>> entrySet() {
      throw notResolved();
   }

   @Override
   public boolean isEmpty() {
      throw notResolved();
   }

   @Override
   public Set<String> keySet() {
      throw notResolved();
   }

   @Override
   public int size() {
      throw notResolved();
   }

   @Override
   public Collection<ConfigValue> values() {
      throw notResolved();
   }

   @Override
   protected AbstractConfigValue attemptPeekWithPartialResolve(String var1) {
      for (AbstractConfigValue var3 : this.stack) {
         if (!(var3 instanceof AbstractConfigObject)) {
            if (var3 instanceof Unmergeable) {
               throw new ConfigException.NotResolved(
                  "Key '"
                     + var1
                     + "' is not available at '"
                     + this.origin().description()
                     + "' because value at '"
                     + var3.origin().description()
                     + "' has not been resolved and may turn out to contain or hide '"
                     + var1
                     + "'. Be sure to Config#resolve() before using a config object."
               );
            }

            if (var3.resolveStatus() == ResolveStatus.UNRESOLVED) {
               if (!(var3 instanceof ConfigList)) {
                  throw new ConfigException.BugOrBroken("Expecting a list here, not " + var3);
               }

               return null;
            }

            if (!var3.ignoresFallbacks()) {
               throw new ConfigException.BugOrBroken("resolved non-object should ignore fallbacks");
            }

            return null;
         }

         AbstractConfigObject var4 = (AbstractConfigObject)var3;
         AbstractConfigValue var5 = var4.attemptPeekWithPartialResolve(var1);
         if (var5 != null) {
            if (var5.ignoresFallbacks()) {
               return var5;
            }
         } else if (var3 instanceof Unmergeable) {
            throw new ConfigException.BugOrBroken("should not be reached: unmergeable object returned null value");
         }
      }

      throw new ConfigException.BugOrBroken("Delayed merge stack does not contain any unmergeable values");
   }
}
