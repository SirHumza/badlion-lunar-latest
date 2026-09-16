package com.typesafe.config.impl;

import com.typesafe.config.ConfigException;
import com.typesafe.config.ConfigObject;
import com.typesafe.config.ConfigOrigin;
import com.typesafe.config.ConfigRenderOptions;
import com.typesafe.config.ConfigValueType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

final class ConfigConcatenation extends AbstractConfigValue implements Container, Unmergeable {
   private final List<AbstractConfigValue> pieces;

   ConfigConcatenation(ConfigOrigin var1, List<AbstractConfigValue> var2) {
      super(var1);
      this.pieces = var2;
      if (var2.size() < 2) {
         throw new ConfigException.BugOrBroken("Created concatenation with less than 2 items: " + this);
      }

      boolean var3 = false;

      for (AbstractConfigValue var5 : var2) {
         if (var5 instanceof ConfigConcatenation) {
            throw new ConfigException.BugOrBroken("ConfigConcatenation should never be nested: " + this);
         }

         if (var5 instanceof Unmergeable) {
            var3 = true;
         }
      }

      if (!var3) {
         throw new ConfigException.BugOrBroken("Created concatenation without an unmergeable in it: " + this);
      }
   }

   private ConfigException.NotResolved notResolved() {
      return new ConfigException.NotResolved("need to Config#resolve(), see the API docs for Config#resolve(); substitution not resolved: " + this);
   }

   @Override
   public ConfigValueType valueType() {
      throw this.notResolved();
   }

   @Override
   public Object unwrapped() {
      throw this.notResolved();
   }

   protected ConfigConcatenation newCopy(ConfigOrigin var1) {
      return new ConfigConcatenation(var1, this.pieces);
   }

   @Override
   protected boolean ignoresFallbacks() {
      return false;
   }

   @Override
   public Collection<ConfigConcatenation> unmergedValues() {
      return Collections.singleton(this);
   }

   private static boolean isIgnoredWhitespace(AbstractConfigValue var0) {
      return var0 instanceof ConfigString && !((ConfigString)var0).wasQuoted();
   }

   private static void join(ArrayList<AbstractConfigValue> var0, AbstractConfigValue var1) {
      AbstractConfigValue var2 = (AbstractConfigValue)var0.get(var0.size() - 1);
      AbstractConfigValue var3 = var1;
      if (var2 instanceof ConfigObject && var3 instanceof SimpleConfigList) {
         var2 = DefaultTransformer.transform(var2, ConfigValueType.LIST);
      } else if (var2 instanceof SimpleConfigList && var3 instanceof ConfigObject) {
         var3 = DefaultTransformer.transform(var3, ConfigValueType.LIST);
      }

      AbstractConfigValue var4 = null;
      if (var2 instanceof ConfigObject && var3 instanceof ConfigObject) {
         var4 = var3.withFallback(var2);
      } else if (var2 instanceof SimpleConfigList && var3 instanceof SimpleConfigList) {
         var4 = ((SimpleConfigList)var2).concatenate((SimpleConfigList)var3);
      } else if ((var2 instanceof SimpleConfigList || var2 instanceof ConfigObject) && isIgnoredWhitespace(var3)) {
         var4 = var2;
      } else {
         if (var2 instanceof ConfigConcatenation || var3 instanceof ConfigConcatenation) {
            throw new ConfigException.BugOrBroken("unflattened ConfigConcatenation");
         }

         if (!(var2 instanceof Unmergeable) && !(var3 instanceof Unmergeable)) {
            String var5 = var2.transformToString();
            String var6 = var3.transformToString();
            if (var5 == null || var6 == null) {
               throw new ConfigException.WrongType(
                  var2.origin(), "Cannot concatenate object or list with a non-object-or-list, " + var2 + " and " + var3 + " are not compatible"
               );
            }

            ConfigOrigin var7 = SimpleConfigOrigin.mergeOrigins(var2.origin(), var3.origin());
            var4 = new ConfigString.Quoted(var7, var5 + var6);
         }
      }

      if (var4 == null) {
         var0.add(var3);
      } else {
         var0.remove(var0.size() - 1);
         var0.add(var4);
      }
   }

   static List<AbstractConfigValue> consolidate(List<AbstractConfigValue> var0) {
      if (var0.size() < 2) {
         return var0;
      }

      ArrayList var1 = new ArrayList(var0.size());

      for (AbstractConfigValue var3 : var0) {
         if (var3 instanceof ConfigConcatenation) {
            var1.addAll(((ConfigConcatenation)var3).pieces);
         } else {
            var1.add(var3);
         }
      }

      ArrayList var5 = new ArrayList(var1.size());

      for (AbstractConfigValue var4 : var1) {
         if (var5.isEmpty()) {
            var5.add(var4);
         } else {
            join(var5, var4);
         }
      }

      return var5;
   }

   static AbstractConfigValue concatenate(List<AbstractConfigValue> var0) {
      List var1 = consolidate(var0);
      if (var1.isEmpty()) {
         return null;
      }

      if (var1.size() == 1) {
         return (AbstractConfigValue)var1.get(0);
      }

      ConfigOrigin var2 = SimpleConfigOrigin.mergeOrigins(var1);
      return new ConfigConcatenation(var2, var1);
   }

   @Override
   ResolveResult<? extends AbstractConfigValue> resolveSubstitutions(ResolveContext var1, ResolveSource var2) {
      if (ConfigImpl.traceSubstitutionsEnabled()) {
         int var3 = var1.depth() + 2;
         ConfigImpl.trace(var3 - 1, "concatenation has " + this.pieces.size() + " pieces:");
         int var4 = 0;

         for (AbstractConfigValue var6 : this.pieces) {
            ConfigImpl.trace(var3, var4 + ": " + var6);
            var4++;
         }
      }

      ResolveSource var11 = var2;
      ResolveContext var12 = var1;
      ArrayList var13 = new ArrayList(this.pieces.size());

      for (AbstractConfigValue var7 : this.pieces) {
         Path var8 = var12.restrictToChild();
         ResolveResult var9 = var12.unrestricted().resolve(var7, var11);
         AbstractConfigValue var10 = var9.value;
         var12 = var9.context.restrict(var8);
         if (ConfigImpl.traceSubstitutionsEnabled()) {
            ConfigImpl.trace(var1.depth(), "resolved concat piece to " + var10);
         }

         if (var10 != null) {
            var13.add(var10);
         }
      }

      List var15 = consolidate(var13);
      if (var15.size() > 1 && var1.options().getAllowUnresolved()) {
         return ResolveResult.make(var12, new ConfigConcatenation(this.origin(), var15));
      } else if (var15.isEmpty()) {
         return ResolveResult.make(var12, null);
      } else if (var15.size() == 1) {
         return ResolveResult.make(var12, (AbstractConfigValue)var15.get(0));
      } else {
         throw new ConfigException.BugOrBroken("Bug in the library; resolved list was joined to too many values: " + var15);
      }
   }

   @Override
   ResolveStatus resolveStatus() {
      return ResolveStatus.UNRESOLVED;
   }

   public ConfigConcatenation replaceChild(AbstractConfigValue var1, AbstractConfigValue var2) {
      List var3 = replaceChildInList(this.pieces, var1, var2);
      return var3 == null ? null : new ConfigConcatenation(this.origin(), var3);
   }

   @Override
   public boolean hasDescendant(AbstractConfigValue var1) {
      return hasDescendantInList(this.pieces, var1);
   }

   ConfigConcatenation relativized(Path var1) {
      ArrayList var2 = new ArrayList();

      for (AbstractConfigValue var4 : this.pieces) {
         var2.add(var4.relativized(var1));
      }

      return new ConfigConcatenation(this.origin(), var2);
   }

   @Override
   protected boolean canEqual(Object var1) {
      return var1 instanceof ConfigConcatenation;
   }

   @Override
   public boolean equals(Object var1) {
      return !(var1 instanceof ConfigConcatenation) ? false : this.canEqual(var1) && this.pieces.equals(((ConfigConcatenation)var1).pieces);
   }

   @Override
   public int hashCode() {
      return this.pieces.hashCode();
   }

   @Override
   protected void render(StringBuilder var1, int var2, boolean var3, ConfigRenderOptions var4) {
      for (AbstractConfigValue var6 : this.pieces) {
         var6.render(var1, var2, var3, var4);
      }
   }
}
