package com.typesafe.config.impl;

import com.typesafe.config.ConfigException;
import com.typesafe.config.ConfigOrigin;
import com.typesafe.config.ConfigRenderOptions;
import com.typesafe.config.ConfigValueType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

final class ConfigDelayedMerge extends AbstractConfigValue implements ReplaceableMergeStack, Unmergeable {
   private final List<AbstractConfigValue> stack;

   ConfigDelayedMerge(ConfigOrigin var1, List<AbstractConfigValue> var2) {
      super(var1);
      this.stack = var2;
      if (var2.isEmpty()) {
         throw new ConfigException.BugOrBroken("creating empty delayed merge value");
      }

      for (AbstractConfigValue var4 : var2) {
         if (var4 instanceof ConfigDelayedMerge || var4 instanceof ConfigDelayedMergeObject) {
            throw new ConfigException.BugOrBroken("placed nested DelayedMerge in a ConfigDelayedMerge, should have consolidated stack");
         }
      }
   }

   @Override
   public ConfigValueType valueType() {
      throw new ConfigException.NotResolved("called valueType() on value with unresolved substitutions, need to Config#resolve() first, see API docs");
   }

   @Override
   public Object unwrapped() {
      throw new ConfigException.NotResolved("called unwrapped() on value with unresolved substitutions, need to Config#resolve() first, see API docs");
   }

   @Override
   ResolveResult<? extends AbstractConfigValue> resolveSubstitutions(ResolveContext var1, ResolveSource var2) {
      return resolveSubstitutions(this, this.stack, var1, var2);
   }

   static ResolveResult<? extends AbstractConfigValue> resolveSubstitutions(
      ReplaceableMergeStack var0, List<AbstractConfigValue> var1, ResolveContext var2, ResolveSource var3
   ) {
      if (ConfigImpl.traceSubstitutionsEnabled()) {
         ConfigImpl.trace(var2.depth(), "delayed merge stack has " + var1.size() + " items:");
         int var4 = 0;

         for (AbstractConfigValue var6 : var1) {
            ConfigImpl.trace(var2.depth() + 1, var4 + ": " + var6);
            var4++;
         }
      }

      ResolveContext var12 = var2;
      int var13 = 0;
      AbstractConfigValue var14 = null;

      for (AbstractConfigValue var8 : var1) {
         if (var8 instanceof ReplaceableMergeStack) {
            throw new ConfigException.BugOrBroken("A delayed merge should not contain another one: " + var0);
         }

         ResolveSource var15;
         if (var8 instanceof Unmergeable) {
            AbstractConfigValue var10 = var0.makeReplacement(var2, var13 + 1);
            if (ConfigImpl.traceSubstitutionsEnabled()) {
               ConfigImpl.trace(var12.depth(), "remainder portion: " + var10);
            }

            if (ConfigImpl.traceSubstitutionsEnabled()) {
               ConfigImpl.trace(var12.depth(), "building sourceForEnd");
            }

            var15 = var3.replaceWithinCurrentParent((AbstractConfigValue)var0, var10);
            if (ConfigImpl.traceSubstitutionsEnabled()) {
               ConfigImpl.trace(var12.depth(), "  sourceForEnd before reset parents but after replace: " + var15);
            }

            var15 = var15.resetParents();
         } else {
            if (ConfigImpl.traceSubstitutionsEnabled()) {
               ConfigImpl.trace(var12.depth(), "will resolve end against the original source with parent pushed");
            }

            var15 = var3.pushParent(var0);
         }

         if (ConfigImpl.traceSubstitutionsEnabled()) {
            ConfigImpl.trace(var12.depth(), "sourceForEnd      =" + var15);
         }

         if (ConfigImpl.traceSubstitutionsEnabled()) {
            ConfigImpl.trace(
               var12.depth(), "Resolving highest-priority item in delayed merge " + var8 + " against " + var15 + " endWasRemoved=" + (var3 != var15)
            );
         }

         ResolveResult var16 = var12.resolve(var8, var15);
         AbstractConfigValue var11 = var16.value;
         var12 = var16.context;
         if (var11 != null) {
            if (var14 == null) {
               var14 = var11;
            } else {
               if (ConfigImpl.traceSubstitutionsEnabled()) {
                  ConfigImpl.trace(var12.depth() + 1, "merging " + var14 + " with fallback " + var11);
               }

               var14 = var14.withFallback(var11);
            }
         }

         var13++;
         if (ConfigImpl.traceSubstitutionsEnabled()) {
            ConfigImpl.trace(var12.depth(), "stack merged, yielding: " + var14);
         }
      }

      return ResolveResult.make(var12, var14);
   }

   @Override
   public AbstractConfigValue makeReplacement(ResolveContext var1, int var2) {
      return makeReplacement(var1, this.stack, var2);
   }

   static AbstractConfigValue makeReplacement(ResolveContext var0, List<AbstractConfigValue> var1, int var2) {
      List var3 = var1.subList(var2, var1.size());
      if (var3.isEmpty()) {
         if (ConfigImpl.traceSubstitutionsEnabled()) {
            ConfigImpl.trace(var0.depth(), "Nothing else in the merge stack, replacing with null");
         }

         return null;
      } else {
         AbstractConfigValue var4 = null;

         for (AbstractConfigValue var6 : var3) {
            if (var4 == null) {
               var4 = var6;
            } else {
               var4 = var4.withFallback(var6);
            }
         }

         return var4;
      }
   }

   @Override
   ResolveStatus resolveStatus() {
      return ResolveStatus.UNRESOLVED;
   }

   @Override
   public AbstractConfigValue replaceChild(AbstractConfigValue var1, AbstractConfigValue var2) {
      List var3 = replaceChildInList(this.stack, var1, var2);
      return var3 == null ? null : new ConfigDelayedMerge(this.origin(), var3);
   }

   @Override
   public boolean hasDescendant(AbstractConfigValue var1) {
      return hasDescendantInList(this.stack, var1);
   }

   ConfigDelayedMerge relativized(Path var1) {
      ArrayList var2 = new ArrayList();

      for (AbstractConfigValue var4 : this.stack) {
         var2.add(var4.relativized(var1));
      }

      return new ConfigDelayedMerge(this.origin(), var2);
   }

   static boolean stackIgnoresFallbacks(List<AbstractConfigValue> var0) {
      AbstractConfigValue var1 = (AbstractConfigValue)var0.get(var0.size() - 1);
      return var1.ignoresFallbacks();
   }

   @Override
   protected boolean ignoresFallbacks() {
      return stackIgnoresFallbacks(this.stack);
   }

   @Override
   protected AbstractConfigValue newCopy(ConfigOrigin var1) {
      return new ConfigDelayedMerge(var1, this.stack);
   }

   protected final ConfigDelayedMerge mergedWithTheUnmergeable(Unmergeable var1) {
      return (ConfigDelayedMerge)this.mergedWithTheUnmergeable(this.stack, var1);
   }

   protected final ConfigDelayedMerge mergedWithObject(AbstractConfigObject var1) {
      return (ConfigDelayedMerge)this.mergedWithObject(this.stack, var1);
   }

   protected ConfigDelayedMerge mergedWithNonObject(AbstractConfigValue var1) {
      return (ConfigDelayedMerge)this.mergedWithNonObject(this.stack, var1);
   }

   @Override
   public Collection<AbstractConfigValue> unmergedValues() {
      return this.stack;
   }

   @Override
   protected boolean canEqual(Object var1) {
      return var1 instanceof ConfigDelayedMerge;
   }

   @Override
   public boolean equals(Object var1) {
      return !(var1 instanceof ConfigDelayedMerge)
         ? false
         : this.canEqual(var1) && (this.stack == ((ConfigDelayedMerge)var1).stack || this.stack.equals(((ConfigDelayedMerge)var1).stack));
   }

   @Override
   public int hashCode() {
      return this.stack.hashCode();
   }

   @Override
   protected void render(StringBuilder var1, int var2, boolean var3, String var4, ConfigRenderOptions var5) {
      render(this.stack, var1, var2, var3, var4, var5);
   }

   @Override
   protected void render(StringBuilder var1, int var2, boolean var3, ConfigRenderOptions var4) {
      this.render(var1, var2, var3, null, var4);
   }

   static void render(List<AbstractConfigValue> var0, StringBuilder var1, int var2, boolean var3, String var4, ConfigRenderOptions var5) {
      boolean var6 = var5.getComments();
      if (var6) {
         var1.append("# unresolved merge of " + var0.size() + " values follows (\n");
         if (var4 == null) {
            indent(var1, var2, var5);
            var1.append("# this unresolved merge will not be parseable because it's at the root of the object\n");
            indent(var1, var2, var5);
            var1.append("# the HOCON format has no way to list multiple root objects in a single file\n");
         }
      }

      ArrayList var7 = new ArrayList();
      var7.addAll(var0);
      Collections.reverse(var7);
      int var8 = 0;

      for (AbstractConfigValue var10 : var7) {
         if (var6) {
            indent(var1, var2, var5);
            if (var4 != null) {
               var1.append("#     unmerged value " + var8 + " for key " + ConfigImplUtil.renderJsonString(var4) + " from ");
            } else {
               var1.append("#     unmerged value " + var8 + " from ");
            }

            var8++;
            var1.append(var10.origin().description());
            var1.append("\n");

            for (String var12 : var10.origin().comments()) {
               indent(var1, var2, var5);
               var1.append("# ");
               var1.append(var12);
               var1.append("\n");
            }
         }

         indent(var1, var2, var5);
         if (var4 != null) {
            var1.append(ConfigImplUtil.renderJsonString(var4));
            if (var5.getFormatted()) {
               var1.append(" : ");
            } else {
               var1.append(":");
            }
         }

         var10.render(var1, var2, var3, var5);
         var1.append(",");
         if (var5.getFormatted()) {
            var1.append('\n');
         }
      }

      var1.setLength(var1.length() - 1);
      if (var5.getFormatted()) {
         var1.setLength(var1.length() - 1);
         var1.append("\n");
      }

      if (var6) {
         indent(var1, var2, var5);
         var1.append("# ) end of unresolved merge\n");
      }
   }
}
