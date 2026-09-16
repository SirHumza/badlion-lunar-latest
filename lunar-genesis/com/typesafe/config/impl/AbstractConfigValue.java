package com.typesafe.config.impl;

import com.typesafe.config.ConfigException;
import com.typesafe.config.ConfigMergeable;
import com.typesafe.config.ConfigObject;
import com.typesafe.config.ConfigOrigin;
import com.typesafe.config.ConfigRenderOptions;
import com.typesafe.config.ConfigValue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

abstract class AbstractConfigValue implements ConfigValue, MergeableValue {
   private final SimpleConfigOrigin origin;

   AbstractConfigValue(ConfigOrigin var1) {
      this.origin = (SimpleConfigOrigin)var1;
   }

   public SimpleConfigOrigin origin() {
      return this.origin;
   }

   ResolveResult<? extends AbstractConfigValue> resolveSubstitutions(ResolveContext var1, ResolveSource var2) {
      return ResolveResult.make(var1, this);
   }

   ResolveStatus resolveStatus() {
      return ResolveStatus.RESOLVED;
   }

   protected static List<AbstractConfigValue> replaceChildInList(List<AbstractConfigValue> var0, AbstractConfigValue var1, AbstractConfigValue var2) {
      int var3 = 0;

      while (var3 < var0.size() && var0.get(var3) != var1) {
         var3++;
      }

      if (var3 == var0.size()) {
         throw new ConfigException.BugOrBroken("tried to replace " + var1 + " which is not in " + var0);
      }

      ArrayList var4 = new ArrayList(var0);
      if (var2 != null) {
         var4.set(var3, var2);
      } else {
         var4.remove(var3);
      }

      return var4.isEmpty() ? null : var4;
   }

   protected static boolean hasDescendantInList(List<AbstractConfigValue> var0, AbstractConfigValue var1) {
      for (AbstractConfigValue var3 : var0) {
         if (var3 == var1) {
            return true;
         }
      }

      for (AbstractConfigValue var5 : var0) {
         if (var5 instanceof Container && ((Container)var5).hasDescendant(var1)) {
            return true;
         }
      }

      return false;
   }

   AbstractConfigValue relativized(Path var1) {
      return this;
   }

   public AbstractConfigValue toFallbackValue() {
      return this;
   }

   protected abstract AbstractConfigValue newCopy(ConfigOrigin var1);

   protected boolean ignoresFallbacks() {
      return this.resolveStatus() == ResolveStatus.RESOLVED;
   }

   protected AbstractConfigValue withFallbacksIgnored() {
      if (this.ignoresFallbacks()) {
         return this;
      } else {
         throw new ConfigException.BugOrBroken("value class doesn't implement forced fallback-ignoring " + this);
      }
   }

   protected final void requireNotIgnoringFallbacks() {
      if (this.ignoresFallbacks()) {
         throw new ConfigException.BugOrBroken("method should not have been called with ignoresFallbacks=true " + this.getClass().getSimpleName());
      }
   }

   protected AbstractConfigValue constructDelayedMerge(ConfigOrigin var1, List<AbstractConfigValue> var2) {
      return new ConfigDelayedMerge(var1, var2);
   }

   protected final AbstractConfigValue mergedWithTheUnmergeable(Collection<AbstractConfigValue> var1, Unmergeable var2) {
      this.requireNotIgnoringFallbacks();
      ArrayList var3 = new ArrayList();
      var3.addAll(var1);
      var3.addAll(var2.unmergedValues());
      return this.constructDelayedMerge(AbstractConfigObject.mergeOrigins(var3), var3);
   }

   private final AbstractConfigValue delayMerge(Collection<AbstractConfigValue> var1, AbstractConfigValue var2) {
      ArrayList var3 = new ArrayList();
      var3.addAll(var1);
      var3.add(var2);
      return this.constructDelayedMerge(AbstractConfigObject.mergeOrigins(var3), var3);
   }

   protected final AbstractConfigValue mergedWithObject(Collection<AbstractConfigValue> var1, AbstractConfigObject var2) {
      this.requireNotIgnoringFallbacks();
      if (this instanceof AbstractConfigObject) {
         throw new ConfigException.BugOrBroken("Objects must reimplement mergedWithObject");
      } else {
         return this.mergedWithNonObject(var1, var2);
      }
   }

   protected final AbstractConfigValue mergedWithNonObject(Collection<AbstractConfigValue> var1, AbstractConfigValue var2) {
      this.requireNotIgnoringFallbacks();
      return this.resolveStatus() == ResolveStatus.RESOLVED ? this.withFallbacksIgnored() : this.delayMerge(var1, var2);
   }

   protected AbstractConfigValue mergedWithTheUnmergeable(Unmergeable var1) {
      this.requireNotIgnoringFallbacks();
      return this.mergedWithTheUnmergeable(Collections.singletonList(this), var1);
   }

   protected AbstractConfigValue mergedWithObject(AbstractConfigObject var1) {
      this.requireNotIgnoringFallbacks();
      return this.mergedWithObject(Collections.singletonList(this), var1);
   }

   protected AbstractConfigValue mergedWithNonObject(AbstractConfigValue var1) {
      this.requireNotIgnoringFallbacks();
      return this.mergedWithNonObject(Collections.singletonList(this), var1);
   }

   public AbstractConfigValue withOrigin(ConfigOrigin var1) {
      return this.origin == var1 ? this : this.newCopy(var1);
   }

   public AbstractConfigValue withFallback(ConfigMergeable var1) {
      if (this.ignoresFallbacks()) {
         return this;
      } else {
         ConfigValue var2 = ((MergeableValue)var1).toFallbackValue();
         if (var2 instanceof Unmergeable) {
            return this.mergedWithTheUnmergeable((Unmergeable)var2);
         } else {
            return var2 instanceof AbstractConfigObject
               ? this.mergedWithObject((AbstractConfigObject)var2)
               : this.mergedWithNonObject((AbstractConfigValue)var2);
         }
      }
   }

   protected boolean canEqual(Object var1) {
      return var1 instanceof ConfigValue;
   }

   @Override
   public boolean equals(Object var1) {
      return !(var1 instanceof ConfigValue)
         ? false
         : this.canEqual(var1)
            && this.valueType() == ((ConfigValue)var1).valueType()
            && ConfigImplUtil.equalsHandlingNull(this.unwrapped(), ((ConfigValue)var1).unwrapped());
   }

   @Override
   public int hashCode() {
      Object var1 = this.unwrapped();
      return var1 == null ? 0 : var1.hashCode();
   }

   @Override
   public String toString() {
      StringBuilder var1 = new StringBuilder();
      this.render(var1, 0, true, null, ConfigRenderOptions.concise());
      return this.getClass().getSimpleName() + "(" + var1.toString() + ")";
   }

   protected static void indent(StringBuilder var0, int var1, ConfigRenderOptions var2) {
      if (var2.getFormatted()) {
         for (int var3 = var1; var3 > 0; var3--) {
            var0.append("    ");
         }
      }
   }

   protected void render(StringBuilder var1, int var2, boolean var3, String var4, ConfigRenderOptions var5) {
      if (var4 != null) {
         String var6;
         if (var5.getJson()) {
            var6 = ConfigImplUtil.renderJsonString(var4);
         } else {
            var6 = ConfigImplUtil.renderStringUnquotedIfPossible(var4);
         }

         var1.append(var6);
         if (var5.getJson()) {
            if (var5.getFormatted()) {
               var1.append(" : ");
            } else {
               var1.append(":");
            }
         } else if (this instanceof ConfigObject) {
            if (var5.getFormatted()) {
               var1.append(' ');
            }
         } else {
            var1.append("=");
         }
      }

      this.render(var1, var2, var3, var5);
   }

   protected void render(StringBuilder var1, int var2, boolean var3, ConfigRenderOptions var4) {
      Object var5 = this.unwrapped();
      var1.append(var5.toString());
   }

   @Override
   public final String render() {
      return this.render(ConfigRenderOptions.defaults());
   }

   @Override
   public final String render(ConfigRenderOptions var1) {
      StringBuilder var2 = new StringBuilder();
      this.render(var2, 0, true, null, var1);
      return var2.toString();
   }

   String transformToString() {
      return null;
   }

   SimpleConfig atKey(ConfigOrigin var1, String var2) {
      Map var3 = Collections.singletonMap(var2, this);
      return new SimpleConfigObject(var1, var3).toConfig();
   }

   public SimpleConfig atKey(String var1) {
      return this.atKey(SimpleConfigOrigin.newSimple("atKey(" + var1 + ")"), var1);
   }

   SimpleConfig atPath(ConfigOrigin var1, Path var2) {
      Path var3 = var2.parent();
      SimpleConfig var4 = this.atKey(var1, var2.last());

      while (var3 != null) {
         String var5 = var3.last();
         var4 = var4.atKey(var1, var5);
         var3 = var3.parent();
      }

      return var4;
   }

   public SimpleConfig atPath(String var1) {
      SimpleConfigOrigin var2 = SimpleConfigOrigin.newSimple("atPath(" + var1 + ")");
      return this.atPath(var2, Path.newPath(var1));
   }

   protected interface Modifier {
      AbstractConfigValue modifyChildMayThrow(String var1, AbstractConfigValue var2);
   }

   protected abstract class NoExceptionsModifier implements AbstractConfigValue.Modifier {
      @Override
      public final AbstractConfigValue modifyChildMayThrow(String var1, AbstractConfigValue var2) {
         try {
            return this.modifyChild(var1, var2);
         } catch (RuntimeException var4) {
            throw var4;
         } catch (Exception var5) {
            throw new ConfigException.BugOrBroken("Unexpected exception", var5);
         }
      }

      abstract AbstractConfigValue modifyChild(String var1, AbstractConfigValue var2);
   }

   static class NotPossibleToResolve extends Exception {
      private static final long serialVersionUID = 1L;
      private final String traceString;

      NotPossibleToResolve(ResolveContext var1) {
         super("was not possible to resolve");
         this.traceString = var1.traceString();
      }

      String traceString() {
         return this.traceString;
      }
   }
}
