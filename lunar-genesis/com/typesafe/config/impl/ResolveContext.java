package com.typesafe.config.impl;

import com.typesafe.config.ConfigException;
import com.typesafe.config.ConfigResolveOptions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;

final class ResolveContext {
   private final ResolveMemos memos;
   private final ConfigResolveOptions options;
   private final Path restrictToChild;
   private final List<AbstractConfigValue> resolveStack;
   private final Set<AbstractConfigValue> cycleMarkers;

   ResolveContext(ResolveMemos var1, ConfigResolveOptions var2, Path var3, List<AbstractConfigValue> var4, Set<AbstractConfigValue> var5) {
      this.memos = var1;
      this.options = var2;
      this.restrictToChild = var3;
      this.resolveStack = var4;
      this.cycleMarkers = var5;
   }

   private static Set<AbstractConfigValue> newCycleMarkers() {
      return Collections.newSetFromMap(new IdentityHashMap<>());
   }

   ResolveContext(ConfigResolveOptions var1, Path var2) {
      this(new ResolveMemos(), var1, var2, new ArrayList<>(), newCycleMarkers());
      if (ConfigImpl.traceSubstitutionsEnabled()) {
         ConfigImpl.trace(this.depth(), "ResolveContext restrict to child " + var2);
      }
   }

   ResolveContext addCycleMarker(AbstractConfigValue var1) {
      if (ConfigImpl.traceSubstitutionsEnabled()) {
         ConfigImpl.trace(this.depth(), "++ Cycle marker " + var1 + "@" + System.identityHashCode(var1));
      }

      if (this.cycleMarkers.contains(var1)) {
         throw new ConfigException.BugOrBroken("Added cycle marker twice " + var1);
      }

      Set var2 = newCycleMarkers();
      var2.addAll(this.cycleMarkers);
      var2.add(var1);
      return new ResolveContext(this.memos, this.options, this.restrictToChild, this.resolveStack, var2);
   }

   ResolveContext removeCycleMarker(AbstractConfigValue var1) {
      if (ConfigImpl.traceSubstitutionsEnabled()) {
         ConfigImpl.trace(this.depth(), "-- Cycle marker " + var1 + "@" + System.identityHashCode(var1));
      }

      Set var2 = newCycleMarkers();
      var2.addAll(this.cycleMarkers);
      var2.remove(var1);
      return new ResolveContext(this.memos, this.options, this.restrictToChild, this.resolveStack, var2);
   }

   private ResolveContext memoize(MemoKey var1, AbstractConfigValue var2) {
      ResolveMemos var3 = this.memos.put(var1, var2);
      return new ResolveContext(var3, this.options, this.restrictToChild, this.resolveStack, this.cycleMarkers);
   }

   ConfigResolveOptions options() {
      return this.options;
   }

   boolean isRestrictedToChild() {
      return this.restrictToChild != null;
   }

   Path restrictToChild() {
      return this.restrictToChild;
   }

   ResolveContext restrict(Path var1) {
      return var1 == this.restrictToChild ? this : new ResolveContext(this.memos, this.options, var1, this.resolveStack, this.cycleMarkers);
   }

   ResolveContext unrestricted() {
      return this.restrict(null);
   }

   String traceString() {
      String var1 = ", ";
      StringBuilder var2 = new StringBuilder();

      for (AbstractConfigValue var4 : this.resolveStack) {
         if (var4 instanceof ConfigReference) {
            var2.append(((ConfigReference)var4).expression().toString());
            var2.append(var1);
         }
      }

      if (var2.length() > 0) {
         var2.setLength(var2.length() - var1.length());
      }

      return var2.toString();
   }

   private ResolveContext pushTrace(AbstractConfigValue var1) {
      if (ConfigImpl.traceSubstitutionsEnabled()) {
         ConfigImpl.trace(this.depth(), "pushing trace " + var1);
      }

      ArrayList var2 = new ArrayList<>(this.resolveStack);
      var2.add(var1);
      return new ResolveContext(this.memos, this.options, this.restrictToChild, var2, this.cycleMarkers);
   }

   ResolveContext popTrace() {
      ArrayList var1 = new ArrayList<>(this.resolveStack);
      AbstractConfigValue var2 = (AbstractConfigValue)var1.remove(this.resolveStack.size() - 1);
      if (ConfigImpl.traceSubstitutionsEnabled()) {
         ConfigImpl.trace(this.depth() - 1, "popped trace " + var2);
      }

      return new ResolveContext(this.memos, this.options, this.restrictToChild, var1, this.cycleMarkers);
   }

   int depth() {
      if (this.resolveStack.size() > 30) {
         throw new ConfigException.BugOrBroken("resolve getting too deep");
      } else {
         return this.resolveStack.size();
      }
   }

   ResolveResult<? extends AbstractConfigValue> resolve(AbstractConfigValue var1, ResolveSource var2) {
      if (ConfigImpl.traceSubstitutionsEnabled()) {
         ConfigImpl.trace(this.depth(), "resolving " + var1 + " restrictToChild=" + this.restrictToChild + " in " + var2);
      }

      return this.pushTrace(var1).realResolve(var1, var2).popTrace();
   }

   private ResolveResult<? extends AbstractConfigValue> realResolve(AbstractConfigValue var1, ResolveSource var2) {
      MemoKey var3 = new MemoKey(var1, null);
      MemoKey var4 = null;
      AbstractConfigValue var5 = this.memos.get(var3);
      if (var5 == null && this.isRestrictedToChild()) {
         var4 = new MemoKey(var1, this.restrictToChild());
         var5 = this.memos.get(var4);
      }

      if (var5 != null) {
         if (ConfigImpl.traceSubstitutionsEnabled()) {
            ConfigImpl.trace(this.depth(), "using cached resolution " + var5 + " for " + var1 + " restrictToChild " + this.restrictToChild());
         }

         return ResolveResult.make(this, var5);
      } else {
         if (ConfigImpl.traceSubstitutionsEnabled()) {
            ConfigImpl.trace(this.depth(), "not found in cache, resolving " + var1 + "@" + System.identityHashCode(var1));
         }

         if (this.cycleMarkers.contains(var1)) {
            if (ConfigImpl.traceSubstitutionsEnabled()) {
               ConfigImpl.trace(this.depth(), "Cycle detected, can't resolve; " + var1 + "@" + System.identityHashCode(var1));
            }

            throw new AbstractConfigValue.NotPossibleToResolve(this);
         } else {
            ResolveResult var6 = var1.resolveSubstitutions(this, var2);
            AbstractConfigValue var7 = var6.value;
            if (ConfigImpl.traceSubstitutionsEnabled()) {
               ConfigImpl.trace(
                  this.depth(), "resolved to " + var7 + "@" + System.identityHashCode(var7) + " from " + var1 + "@" + System.identityHashCode(var7)
               );
            }

            ResolveContext var8 = var6.context;
            if (var7 != null && var7.resolveStatus() != ResolveStatus.RESOLVED) {
               if (this.isRestrictedToChild()) {
                  if (var4 == null) {
                     throw new ConfigException.BugOrBroken("restrictedKey should not be null here");
                  }

                  if (ConfigImpl.traceSubstitutionsEnabled()) {
                     ConfigImpl.trace(this.depth(), "caching " + var4 + " result " + var7);
                  }

                  var8 = var8.memoize(var4, var7);
               } else {
                  if (!this.options().getAllowUnresolved()) {
                     throw new ConfigException.BugOrBroken("resolveSubstitutions() did not give us a resolved object");
                  }

                  if (ConfigImpl.traceSubstitutionsEnabled()) {
                     ConfigImpl.trace(this.depth(), "caching " + var3 + " result " + var7);
                  }

                  var8 = var8.memoize(var3, var7);
               }
            } else {
               if (ConfigImpl.traceSubstitutionsEnabled()) {
                  ConfigImpl.trace(this.depth(), "caching " + var3 + " result " + var7);
               }

               var8 = var8.memoize(var3, var7);
            }

            return ResolveResult.make(var8, var7);
         }
      }
   }

   static AbstractConfigValue resolve(AbstractConfigValue var0, AbstractConfigObject var1, ConfigResolveOptions var2) {
      ResolveSource var3 = new ResolveSource(var1);
      ResolveContext var4 = new ResolveContext(var2, null);

      try {
         return var4.resolve(var0, var3).value;
      } catch (AbstractConfigValue.NotPossibleToResolve var6) {
         throw new ConfigException.BugOrBroken("NotPossibleToResolve was thrown from an outermost resolve", var6);
      }
   }
}
