package com.typesafe.config.impl;

import com.typesafe.config.ConfigException;
import com.typesafe.config.ConfigObject;
import com.typesafe.config.ConfigOrigin;
import com.typesafe.config.ConfigRenderOptions;
import com.typesafe.config.ConfigValue;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.Map.Entry;

final class SimpleConfigObject extends AbstractConfigObject implements Serializable {
   private static final long serialVersionUID = 2L;
   private final Map<String, AbstractConfigValue> value;
   private final boolean resolved;
   private final boolean ignoresFallbacks;
   private static final String EMPTY_NAME = "empty config";
   private static final SimpleConfigObject emptyInstance = empty(SimpleConfigOrigin.newSimple("empty config"));

   SimpleConfigObject(ConfigOrigin var1, Map<String, AbstractConfigValue> var2, ResolveStatus var3, boolean var4) {
      super(var1);
      if (var2 == null) {
         throw new ConfigException.BugOrBroken("creating config object with null map");
      }

      this.value = var2;
      this.resolved = var3 == ResolveStatus.RESOLVED;
      this.ignoresFallbacks = var4;
      if (var3 != ResolveStatus.fromValues(var2.values())) {
         throw new ConfigException.BugOrBroken("Wrong resolved status on " + this);
      }
   }

   SimpleConfigObject(ConfigOrigin var1, Map<String, AbstractConfigValue> var2) {
      this(var1, var2, ResolveStatus.fromValues(var2.values()), false);
   }

   public SimpleConfigObject withOnlyKey(String var1) {
      return this.withOnlyPath(Path.newKey(var1));
   }

   public SimpleConfigObject withoutKey(String var1) {
      return this.withoutPath(Path.newKey(var1));
   }

   protected SimpleConfigObject withOnlyPathOrNull(Path var1) {
      String var2 = var1.first();
      Path var3 = var1.remainder();
      AbstractConfigValue var4 = this.value.get(var2);
      if (var3 != null) {
         if (var4 != null && var4 instanceof AbstractConfigObject) {
            var4 = ((AbstractConfigObject)var4).withOnlyPathOrNull(var3);
         } else {
            var4 = null;
         }
      }

      return var4 == null ? null : new SimpleConfigObject(this.origin(), Collections.singletonMap(var2, var4), var4.resolveStatus(), this.ignoresFallbacks);
   }

   SimpleConfigObject withOnlyPath(Path var1) {
      SimpleConfigObject var2 = this.withOnlyPathOrNull(var1);
      return var2 == null ? new SimpleConfigObject(this.origin(), Collections.emptyMap(), ResolveStatus.RESOLVED, this.ignoresFallbacks) : var2;
   }

   SimpleConfigObject withoutPath(Path var1) {
      String var2 = var1.first();
      Path var3 = var1.remainder();
      AbstractConfigValue var4 = this.value.get(var2);
      if (var4 != null && var3 != null && var4 instanceof AbstractConfigObject) {
         AbstractConfigObject var8 = ((AbstractConfigObject)var4).withoutPath(var3);
         HashMap var9 = new HashMap<>(this.value);
         var9.put(var2, var8);
         return new SimpleConfigObject(this.origin(), var9, ResolveStatus.fromValues(var9.values()), this.ignoresFallbacks);
      }

      if (var3 == null && var4 != null) {
         HashMap var5 = new HashMap(this.value.size() - 1);

         for (Entry var7 : this.value.entrySet()) {
            if (!((String)var7.getKey()).equals(var2)) {
               var5.put(var7.getKey(), var7.getValue());
            }
         }

         return new SimpleConfigObject(this.origin(), var5, ResolveStatus.fromValues(var5.values()), this.ignoresFallbacks);
      } else {
         return this;
      }
   }

   public SimpleConfigObject withValue(String var1, ConfigValue var2) {
      if (var2 == null) {
         throw new ConfigException.BugOrBroken("Trying to store null ConfigValue in a ConfigObject");
      }

      Map var3;
      if (this.value.isEmpty()) {
         var3 = Collections.singletonMap(var1, (AbstractConfigValue)var2);
      } else {
         var3 = new HashMap<>(this.value);
         var3.put(var1, (AbstractConfigValue)var2);
      }

      return new SimpleConfigObject(this.origin(), var3, ResolveStatus.fromValues(var3.values()), this.ignoresFallbacks);
   }

   SimpleConfigObject withValue(Path var1, ConfigValue var2) {
      String var3 = var1.first();
      Path var4 = var1.remainder();
      if (var4 == null) {
         return this.withValue(var3, var2);
      }

      AbstractConfigValue var5 = this.value.get(var3);
      if (var5 != null && var5 instanceof AbstractConfigObject) {
         return this.withValue(var3, ((AbstractConfigObject)var5).withValue(var4, var2));
      }

      SimpleConfig var6 = ((AbstractConfigValue)var2).atPath(SimpleConfigOrigin.newSimple("withValue(" + var4.render() + ")"), var4);
      return this.withValue(var3, var6.root());
   }

   @Override
   protected AbstractConfigValue attemptPeekWithPartialResolve(String var1) {
      return this.value.get(var1);
   }

   private SimpleConfigObject newCopy(ResolveStatus var1, ConfigOrigin var2, boolean var3) {
      return new SimpleConfigObject(var2, this.value, var1, var3);
   }

   protected SimpleConfigObject newCopy(ResolveStatus var1, ConfigOrigin var2) {
      return this.newCopy(var1, var2, this.ignoresFallbacks);
   }

   protected SimpleConfigObject withFallbacksIgnored() {
      return this.ignoresFallbacks ? this : this.newCopy(this.resolveStatus(), this.origin(), true);
   }

   @Override
   ResolveStatus resolveStatus() {
      return ResolveStatus.fromBoolean(this.resolved);
   }

   public SimpleConfigObject replaceChild(AbstractConfigValue var1, AbstractConfigValue var2) {
      HashMap var3 = new HashMap<>(this.value);

      for (Entry var5 : var3.entrySet()) {
         if (var5.getValue() == var1) {
            if (var2 != null) {
               var5.setValue(var2);
            } else {
               var3.remove(var5.getKey());
            }

            return new SimpleConfigObject(this.origin(), var3, ResolveStatus.fromValues(var3.values()), this.ignoresFallbacks);
         }
      }

      throw new ConfigException.BugOrBroken("SimpleConfigObject.replaceChild did not find " + var1 + " in " + this);
   }

   @Override
   public boolean hasDescendant(AbstractConfigValue var1) {
      for (AbstractConfigValue var3 : this.value.values()) {
         if (var3 == var1) {
            return true;
         }
      }

      for (AbstractConfigValue var5 : this.value.values()) {
         if (var5 instanceof Container && ((Container)var5).hasDescendant(var1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected boolean ignoresFallbacks() {
      return this.ignoresFallbacks;
   }

   @Override
   public Map<String, Object> unwrapped() {
      HashMap var1 = new HashMap();

      for (Entry var3 : this.value.entrySet()) {
         var1.put(var3.getKey(), ((AbstractConfigValue)var3.getValue()).unwrapped());
      }

      return var1;
   }

   protected SimpleConfigObject mergedWithObject(AbstractConfigObject var1) {
      this.requireNotIgnoringFallbacks();
      if (!(var1 instanceof SimpleConfigObject)) {
         throw new ConfigException.BugOrBroken("should not be reached (merging non-SimpleConfigObject)");
      }

      SimpleConfigObject var2 = (SimpleConfigObject)var1;
      boolean var3 = false;
      boolean var4 = true;
      HashMap var5 = new HashMap();
      HashSet var6 = new HashSet();
      var6.addAll(this.keySet());
      var6.addAll(var2.keySet());

      for (String var8 : var6) {
         AbstractConfigValue var9 = this.value.get(var8);
         AbstractConfigValue var10 = var2.value.get(var8);
         AbstractConfigValue var11;
         if (var9 == null) {
            var11 = var10;
         } else if (var10 == null) {
            var11 = var9;
         } else {
            var11 = var9.withFallback(var10);
         }

         var5.put(var8, var11);
         if (var9 != var11) {
            var3 = true;
         }

         if (var11.resolveStatus() == ResolveStatus.UNRESOLVED) {
            var4 = false;
         }
      }

      ResolveStatus var12 = ResolveStatus.fromBoolean(var4);
      boolean var13 = var2.ignoresFallbacks();
      if (var3) {
         return new SimpleConfigObject(mergeOrigins(this, var2), var5, var12, var13);
      } else {
         return var12 == this.resolveStatus() && var13 == this.ignoresFallbacks() ? this : this.newCopy(var12, this.origin(), var13);
      }
   }

   private SimpleConfigObject modify(AbstractConfigValue.NoExceptionsModifier var1) {
      try {
         return this.modifyMayThrow(var1);
      } catch (RuntimeException var3) {
         throw var3;
      } catch (Exception var4) {
         throw new ConfigException.BugOrBroken("unexpected checked exception", var4);
      }
   }

   private SimpleConfigObject modifyMayThrow(AbstractConfigValue.Modifier var1) {
      HashMap var2 = null;

      for (String var4 : this.keySet()) {
         AbstractConfigValue var5 = this.value.get(var4);
         AbstractConfigValue var6 = var1.modifyChildMayThrow(var4, var5);
         if (var6 != var5) {
            if (var2 == null) {
               var2 = new HashMap();
            }

            var2.put(var4, var6);
         }
      }

      if (var2 == null) {
         return this;
      }

      HashMap var8 = new HashMap();
      boolean var9 = false;

      for (String var11 : this.keySet()) {
         if (var2.containsKey(var11)) {
            AbstractConfigValue var7 = (AbstractConfigValue)var2.get(var11);
            if (var7 != null) {
               var8.put(var11, var7);
               if (var7.resolveStatus() == ResolveStatus.UNRESOLVED) {
                  var9 = true;
               }
            }
         } else {
            AbstractConfigValue var12 = this.value.get(var11);
            var8.put(var11, var12);
            if (var12.resolveStatus() == ResolveStatus.UNRESOLVED) {
               var9 = true;
            }
         }
      }

      return new SimpleConfigObject(this.origin(), var8, var9 ? ResolveStatus.UNRESOLVED : ResolveStatus.RESOLVED, this.ignoresFallbacks());
   }

   @Override
   ResolveResult<? extends AbstractConfigObject> resolveSubstitutions(ResolveContext var1, ResolveSource var2) {
      if (this.resolveStatus() == ResolveStatus.RESOLVED) {
         return ResolveResult.make(var1, this);
      }

      ResolveSource var3 = var2.pushParent(this);

      try {
         SimpleConfigObject.ResolveModifier var4 = new SimpleConfigObject.ResolveModifier(var1, var3);
         SimpleConfigObject var5 = this.modifyMayThrow(var4);
         return ResolveResult.make(var4.context, var5).asObjectResult();
      } catch (AbstractConfigValue.NotPossibleToResolve var6) {
         throw var6;
      } catch (RuntimeException var7) {
         throw var7;
      } catch (Exception var8) {
         throw new ConfigException.BugOrBroken("unexpected checked exception", var8);
      }
   }

   SimpleConfigObject relativized(final Path var1) {
      return this.modify(new AbstractConfigValue.NoExceptionsModifier() {
         @Override
         public AbstractConfigValue modifyChild(String var1x, AbstractConfigValue var2) {
            return var2.relativized(var1);
         }
      });
   }

   @Override
   protected void render(StringBuilder var1, int var2, boolean var3, ConfigRenderOptions var4) {
      if (this.isEmpty()) {
         var1.append("{}");
      } else {
         boolean var5 = var4.getJson() || !var3;
         int var6;
         if (var5) {
            var6 = var2 + 1;
            var1.append("{");
            if (var4.getFormatted()) {
               var1.append('\n');
            }
         } else {
            var6 = var2;
         }

         byte var7 = 0;
         String[] var8 = this.keySet().toArray(new String[this.size()]);
         Arrays.sort(var8, new SimpleConfigObject.RenderComparator());

         for (String var12 : var8) {
            AbstractConfigValue var13 = this.value.get(var12);
            if (var4.getOriginComments()) {
               String[] var14 = var13.origin().description().split("\n");

               for (String var18 : var14) {
                  indent(var1, var2 + 1, var4);
                  var1.append('#');
                  if (!var18.isEmpty()) {
                     var1.append(' ');
                  }

                  var1.append(var18);
                  var1.append("\n");
               }
            }

            if (var4.getComments()) {
               for (String var20 : var13.origin().comments()) {
                  indent(var1, var6, var4);
                  var1.append("#");
                  if (!var20.startsWith(" ")) {
                     var1.append(' ');
                  }

                  var1.append(var20);
                  var1.append("\n");
               }
            }

            indent(var1, var6, var4);
            var13.render(var1, var6, false, var12, var4);
            if (var4.getFormatted()) {
               if (var4.getJson()) {
                  var1.append(",");
                  var7 = 2;
               } else {
                  var7 = 1;
               }

               var1.append('\n');
            } else {
               var1.append(",");
               var7 = 1;
            }
         }

         var1.setLength(var1.length() - var7);
         if (var5) {
            if (var4.getFormatted()) {
               var1.append('\n');
               if (var5) {
                  indent(var1, var2, var4);
               }
            }

            var1.append("}");
         }
      }

      if (var3 && var4.getFormatted()) {
         var1.append('\n');
      }
   }

   @Override
   public AbstractConfigValue get(Object var1) {
      return this.value.get(var1);
   }

   private static boolean mapEquals(Map<String, ConfigValue> var0, Map<String, ConfigValue> var1) {
      if (var0 == var1) {
         return true;
      }

      Set var2 = var0.keySet();
      Set var3 = var1.keySet();
      if (!var2.equals(var3)) {
         return false;
      }

      for (String var5 : var2) {
         if (!((ConfigValue)var0.get(var5)).equals(var1.get(var5))) {
            return false;
         }
      }

      return true;
   }

   private static int mapHash(Map<String, ConfigValue> var0) {
      ArrayList var1 = new ArrayList();
      var1.addAll(var0.keySet());
      Collections.sort(var1);
      int var2 = 0;

      for (String var4 : var1) {
         var2 += ((ConfigValue)var0.get(var4)).hashCode();
      }

      return 41 * (41 + var1.hashCode()) + var2;
   }

   @Override
   protected boolean canEqual(Object var1) {
      return var1 instanceof ConfigObject;
   }

   @Override
   public boolean equals(Object var1) {
      return !(var1 instanceof ConfigObject) ? false : this.canEqual(var1) && mapEquals(this, (ConfigObject)var1);
   }

   @Override
   public int hashCode() {
      return mapHash(this);
   }

   @Override
   public boolean containsKey(Object var1) {
      return this.value.containsKey(var1);
   }

   @Override
   public Set<String> keySet() {
      return this.value.keySet();
   }

   @Override
   public boolean containsValue(Object var1) {
      return this.value.containsValue(var1);
   }

   @Override
   public Set<Entry<String, ConfigValue>> entrySet() {
      HashSet var1 = new HashSet();

      for (Entry var3 : this.value.entrySet()) {
         var1.add(new SimpleImmutableEntry<>(var3.getKey(), var3.getValue()));
      }

      return var1;
   }

   @Override
   public boolean isEmpty() {
      return this.value.isEmpty();
   }

   @Override
   public int size() {
      return this.value.size();
   }

   @Override
   public Collection<ConfigValue> values() {
      return new HashSet<>(this.value.values());
   }

   static final SimpleConfigObject empty() {
      return emptyInstance;
   }

   static final SimpleConfigObject empty(ConfigOrigin var0) {
      return var0 == null ? empty() : new SimpleConfigObject(var0, Collections.emptyMap());
   }

   static final SimpleConfigObject emptyMissing(ConfigOrigin var0) {
      return new SimpleConfigObject(SimpleConfigOrigin.newSimple(var0.description() + " (not found)"), Collections.emptyMap());
   }

   private Object writeReplace() {
      return new SerializedConfigValue(this);
   }

   private static final class RenderComparator implements Serializable, Comparator<String> {
      private static final long serialVersionUID = 1L;

      private RenderComparator() {
      }

      private static boolean isAllDigits(String var0) {
         int var1 = var0.length();
         if (var1 == 0) {
            return false;
         }

         for (int var2 = 0; var2 < var1; var2++) {
            char var3 = var0.charAt(var2);
            if (!Character.isDigit(var3)) {
               return false;
            }
         }

         return true;
      }

      public int compare(String var1, String var2) {
         boolean var3 = isAllDigits(var1);
         boolean var4 = isAllDigits(var2);
         if (var3 && var4) {
            return new BigInteger(var1).compareTo(new BigInteger(var2));
         } else if (var3) {
            return -1;
         } else {
            return var4 ? 1 : var1.compareTo(var2);
         }
      }
   }

   private static final class ResolveModifier implements AbstractConfigValue.Modifier {
      final Path originalRestrict;
      ResolveContext context;
      final ResolveSource source;

      ResolveModifier(ResolveContext var1, ResolveSource var2) {
         this.context = var1;
         this.source = var2;
         this.originalRestrict = var1.restrictToChild();
      }

      @Override
      public AbstractConfigValue modifyChildMayThrow(String var1, AbstractConfigValue var2) {
         if (this.context.isRestrictedToChild()) {
            if (var1.equals(this.context.restrictToChild().first())) {
               Path var5 = this.context.restrictToChild().remainder();
               if (var5 != null) {
                  ResolveResult var4 = this.context.restrict(var5).resolve(var2, this.source);
                  this.context = var4.context.unrestricted().restrict(this.originalRestrict);
                  return var4.value;
               } else {
                  return var2;
               }
            } else {
               return var2;
            }
         } else {
            ResolveResult var3 = this.context.unrestricted().resolve(var2, this.source);
            this.context = var3.context.unrestricted().restrict(this.originalRestrict);
            return var3.value;
         }
      }
   }
}
