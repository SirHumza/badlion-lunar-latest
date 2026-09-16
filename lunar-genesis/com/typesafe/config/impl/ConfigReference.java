package com.typesafe.config.impl;

import com.typesafe.config.ConfigException;
import com.typesafe.config.ConfigOrigin;
import com.typesafe.config.ConfigRenderOptions;
import com.typesafe.config.ConfigValue;
import com.typesafe.config.ConfigValueType;
import java.util.Collection;
import java.util.Collections;

final class ConfigReference extends AbstractConfigValue implements Unmergeable {
   private final SubstitutionExpression expr;
   private final int prefixLength;

   ConfigReference(ConfigOrigin var1, SubstitutionExpression var2) {
      this(var1, var2, 0);
   }

   private ConfigReference(ConfigOrigin var1, SubstitutionExpression var2, int var3) {
      super(var1);
      this.expr = var2;
      this.prefixLength = var3;
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

   protected ConfigReference newCopy(ConfigOrigin var1) {
      return new ConfigReference(var1, this.expr, this.prefixLength);
   }

   @Override
   protected boolean ignoresFallbacks() {
      return false;
   }

   @Override
   public Collection<ConfigReference> unmergedValues() {
      return Collections.singleton(this);
   }

   @Override
   ResolveResult<? extends AbstractConfigValue> resolveSubstitutions(ResolveContext var1, ResolveSource var2) {
      ResolveContext var3 = var1.addCycleMarker(this);

      AbstractConfigValue var4;
      try {
         ResolveSource.ResultWithPath var5 = var2.lookupSubst(var3, this.expr, this.prefixLength);
         var3 = var5.result.context;
         if (var5.result.value != null) {
            if (ConfigImpl.traceSubstitutionsEnabled()) {
               ConfigImpl.trace(var3.depth(), "recursively resolving " + var5 + " which was the resolution of " + this.expr + " against " + var2);
            }

            ResolveSource var6 = new ResolveSource((AbstractConfigObject)var5.pathFromRoot.last(), var5.pathFromRoot);
            if (ConfigImpl.traceSubstitutionsEnabled()) {
               ConfigImpl.trace(var3.depth(), "will recursively resolve against " + var6);
            }

            ResolveResult var7 = var3.resolve(var5.result.value, var6);
            var4 = var7.value;
            var3 = var7.context;
         } else {
            ConfigValue var9 = var1.options().getResolver().lookup(this.expr.path().render());
            var4 = (AbstractConfigValue)var9;
         }
      } catch (AbstractConfigValue.NotPossibleToResolve var8) {
         if (ConfigImpl.traceSubstitutionsEnabled()) {
            ConfigImpl.trace(var3.depth(), "not possible to resolve " + this.expr + ", cycle involved: " + var8.traceString());
         }

         if (!this.expr.optional()) {
            throw new ConfigException.UnresolvedSubstitution(
               this.origin(), this.expr + " was part of a cycle of substitutions involving " + var8.traceString(), var8
            );
         }

         var4 = null;
      }

      if (var4 != null || this.expr.optional()) {
         return ResolveResult.make(var3.removeCycleMarker(this), var4);
      } else if (var3.options().getAllowUnresolved()) {
         return ResolveResult.make(var3.removeCycleMarker(this), this);
      } else {
         throw new ConfigException.UnresolvedSubstitution(this.origin(), this.expr.toString());
      }
   }

   @Override
   ResolveStatus resolveStatus() {
      return ResolveStatus.UNRESOLVED;
   }

   ConfigReference relativized(Path var1) {
      SubstitutionExpression var2 = this.expr.changePath(this.expr.path().prepend(var1));
      return new ConfigReference(this.origin(), var2, this.prefixLength + var1.length());
   }

   @Override
   protected boolean canEqual(Object var1) {
      return var1 instanceof ConfigReference;
   }

   @Override
   public boolean equals(Object var1) {
      return !(var1 instanceof ConfigReference) ? false : this.canEqual(var1) && this.expr.equals(((ConfigReference)var1).expr);
   }

   @Override
   public int hashCode() {
      return this.expr.hashCode();
   }

   @Override
   protected void render(StringBuilder var1, int var2, boolean var3, ConfigRenderOptions var4) {
      var1.append(this.expr.toString());
   }

   SubstitutionExpression expression() {
      return this.expr;
   }
}
