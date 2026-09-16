package com.typesafe.config.impl;

import com.typesafe.config.ConfigException;
import com.typesafe.config.ConfigList;
import com.typesafe.config.ConfigOrigin;
import com.typesafe.config.ConfigRenderOptions;
import com.typesafe.config.ConfigValue;
import com.typesafe.config.ConfigValueType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

final class SimpleConfigList extends AbstractConfigValue implements ConfigList, Container, Serializable {
   private static final long serialVersionUID = 2L;
   private final List<AbstractConfigValue> value;
   private final boolean resolved;

   SimpleConfigList(ConfigOrigin var1, List<AbstractConfigValue> var2) {
      this(var1, var2, ResolveStatus.fromValues(var2));
   }

   SimpleConfigList(ConfigOrigin var1, List<AbstractConfigValue> var2, ResolveStatus var3) {
      super(var1);
      this.value = var2;
      this.resolved = var3 == ResolveStatus.RESOLVED;
      if (var3 != ResolveStatus.fromValues(var2)) {
         throw new ConfigException.BugOrBroken("SimpleConfigList created with wrong resolve status: " + this);
      }
   }

   @Override
   public ConfigValueType valueType() {
      return ConfigValueType.LIST;
   }

   @Override
   public List<Object> unwrapped() {
      ArrayList var1 = new ArrayList();

      for (AbstractConfigValue var3 : this.value) {
         var1.add(var3.unwrapped());
      }

      return var1;
   }

   @Override
   ResolveStatus resolveStatus() {
      return ResolveStatus.fromBoolean(this.resolved);
   }

   public SimpleConfigList replaceChild(AbstractConfigValue var1, AbstractConfigValue var2) {
      List var3 = replaceChildInList(this.value, var1, var2);
      return var3 == null ? null : new SimpleConfigList(this.origin(), var3);
   }

   @Override
   public boolean hasDescendant(AbstractConfigValue var1) {
      return hasDescendantInList(this.value, var1);
   }

   private SimpleConfigList modify(AbstractConfigValue.NoExceptionsModifier var1, ResolveStatus var2) {
      try {
         return this.modifyMayThrow(var1, var2);
      } catch (RuntimeException var4) {
         throw var4;
      } catch (Exception var5) {
         throw new ConfigException.BugOrBroken("unexpected checked exception", var5);
      }
   }

   private SimpleConfigList modifyMayThrow(AbstractConfigValue.Modifier var1, ResolveStatus var2) {
      ArrayList var3 = null;
      int var4 = 0;

      for (AbstractConfigValue var6 : this.value) {
         AbstractConfigValue var7 = var1.modifyChildMayThrow(null, var6);
         if (var3 == null && var7 != var6) {
            var3 = new ArrayList();

            for (int var8 = 0; var8 < var4; var8++) {
               var3.add(this.value.get(var8));
            }
         }

         if (var3 != null && var7 != null) {
            var3.add(var7);
         }

         var4++;
      }

      if (var3 == null) {
         return this;
      } else {
         return var2 != null ? new SimpleConfigList(this.origin(), var3, var2) : new SimpleConfigList(this.origin(), var3);
      }
   }

   @Override
   ResolveResult<? extends SimpleConfigList> resolveSubstitutions(ResolveContext var1, ResolveSource var2) {
      if (this.resolved) {
         return ResolveResult.make(var1, this);
      }

      if (var1.isRestrictedToChild()) {
         return ResolveResult.make(var1, this);
      }

      try {
         SimpleConfigList.ResolveModifier var3 = new SimpleConfigList.ResolveModifier(var1, var2.pushParent(this));
         SimpleConfigList var4 = this.modifyMayThrow(var3, var1.options().getAllowUnresolved() ? null : ResolveStatus.RESOLVED);
         return ResolveResult.make(var3.context, var4);
      } catch (AbstractConfigValue.NotPossibleToResolve var5) {
         throw var5;
      } catch (RuntimeException var6) {
         throw var6;
      } catch (Exception var7) {
         throw new ConfigException.BugOrBroken("unexpected checked exception", var7);
      }
   }

   SimpleConfigList relativized(final Path var1) {
      return this.modify(new AbstractConfigValue.NoExceptionsModifier() {
         @Override
         public AbstractConfigValue modifyChild(String var1x, AbstractConfigValue var2) {
            return var2.relativized(var1);
         }
      }, this.resolveStatus());
   }

   @Override
   protected boolean canEqual(Object var1) {
      return var1 instanceof SimpleConfigList;
   }

   @Override
   public boolean equals(Object var1) {
      return !(var1 instanceof SimpleConfigList)
         ? false
         : this.canEqual(var1) && (this.value == ((SimpleConfigList)var1).value || this.value.equals(((SimpleConfigList)var1).value));
   }

   @Override
   public int hashCode() {
      return this.value.hashCode();
   }

   @Override
   protected void render(StringBuilder var1, int var2, boolean var3, ConfigRenderOptions var4) {
      if (this.value.isEmpty()) {
         var1.append("[]");
      } else {
         var1.append("[");
         if (var4.getFormatted()) {
            var1.append('\n');
         }

         for (AbstractConfigValue var6 : this.value) {
            if (var4.getOriginComments()) {
               String[] var7 = var6.origin().description().split("\n");

               for (String var11 : var7) {
                  indent(var1, var2 + 1, var4);
                  var1.append('#');
                  if (!var11.isEmpty()) {
                     var1.append(' ');
                  }

                  var1.append(var11);
                  var1.append("\n");
               }
            }

            if (var4.getComments()) {
               for (String var13 : var6.origin().comments()) {
                  indent(var1, var2 + 1, var4);
                  var1.append("# ");
                  var1.append(var13);
                  var1.append("\n");
               }
            }

            indent(var1, var2 + 1, var4);
            var6.render(var1, var2 + 1, var3, var4);
            var1.append(",");
            if (var4.getFormatted()) {
               var1.append('\n');
            }
         }

         var1.setLength(var1.length() - 1);
         if (var4.getFormatted()) {
            var1.setLength(var1.length() - 1);
            var1.append('\n');
            indent(var1, var2, var4);
         }

         var1.append("]");
      }
   }

   @Override
   public boolean contains(Object var1) {
      return this.value.contains(var1);
   }

   @Override
   public boolean containsAll(Collection<?> var1) {
      return this.value.containsAll(var1);
   }

   public AbstractConfigValue get(int var1) {
      return this.value.get(var1);
   }

   @Override
   public int indexOf(Object var1) {
      return this.value.indexOf(var1);
   }

   @Override
   public boolean isEmpty() {
      return this.value.isEmpty();
   }

   @Override
   public Iterator<ConfigValue> iterator() {
      final Iterator var1 = this.value.iterator();
      return new Iterator<ConfigValue>() {
         @Override
         public boolean hasNext() {
            return var1.hasNext();
         }

         public ConfigValue next() {
            return (ConfigValue)var1.next();
         }

         @Override
         public void remove() {
            throw SimpleConfigList.weAreImmutable("iterator().remove");
         }
      };
   }

   @Override
   public int lastIndexOf(Object var1) {
      return this.value.lastIndexOf(var1);
   }

   private static ListIterator<ConfigValue> wrapListIterator(final ListIterator<AbstractConfigValue> var0) {
      return new ListIterator<ConfigValue>() {
         @Override
         public boolean hasNext() {
            return var0.hasNext();
         }

         public ConfigValue next() {
            return (ConfigValue)var0.next();
         }

         @Override
         public void remove() {
            throw SimpleConfigList.weAreImmutable("listIterator().remove");
         }

         public void add(ConfigValue var1) {
            throw SimpleConfigList.weAreImmutable("listIterator().add");
         }

         @Override
         public boolean hasPrevious() {
            return var0.hasPrevious();
         }

         @Override
         public int nextIndex() {
            return var0.nextIndex();
         }

         public ConfigValue previous() {
            return (ConfigValue)var0.previous();
         }

         @Override
         public int previousIndex() {
            return var0.previousIndex();
         }

         public void set(ConfigValue var1) {
            throw SimpleConfigList.weAreImmutable("listIterator().set");
         }
      };
   }

   @Override
   public ListIterator<ConfigValue> listIterator() {
      return wrapListIterator(this.value.listIterator());
   }

   @Override
   public ListIterator<ConfigValue> listIterator(int var1) {
      return wrapListIterator(this.value.listIterator(var1));
   }

   @Override
   public int size() {
      return this.value.size();
   }

   @Override
   public List<ConfigValue> subList(int var1, int var2) {
      ArrayList var3 = new ArrayList();

      for (AbstractConfigValue var5 : this.value.subList(var1, var2)) {
         var3.add(var5);
      }

      return var3;
   }

   @Override
   public Object[] toArray() {
      return this.value.toArray();
   }

   @Override
   public <T> T[] toArray(T[] var1) {
      return (T[])this.value.toArray(var1);
   }

   private static UnsupportedOperationException weAreImmutable(String var0) {
      return new UnsupportedOperationException("ConfigList is immutable, you can't call List.'" + var0 + "'");
   }

   public boolean add(ConfigValue var1) {
      throw weAreImmutable("add");
   }

   public void add(int var1, ConfigValue var2) {
      throw weAreImmutable("add");
   }

   @Override
   public boolean addAll(Collection<? extends ConfigValue> var1) {
      throw weAreImmutable("addAll");
   }

   @Override
   public boolean addAll(int var1, Collection<? extends ConfigValue> var2) {
      throw weAreImmutable("addAll");
   }

   @Override
   public void clear() {
      throw weAreImmutable("clear");
   }

   @Override
   public boolean remove(Object var1) {
      throw weAreImmutable("remove");
   }

   public ConfigValue remove(int var1) {
      throw weAreImmutable("remove");
   }

   @Override
   public boolean removeAll(Collection<?> var1) {
      throw weAreImmutable("removeAll");
   }

   @Override
   public boolean retainAll(Collection<?> var1) {
      throw weAreImmutable("retainAll");
   }

   public ConfigValue set(int var1, ConfigValue var2) {
      throw weAreImmutable("set");
   }

   protected SimpleConfigList newCopy(ConfigOrigin var1) {
      return new SimpleConfigList(var1, this.value);
   }

   final SimpleConfigList concatenate(SimpleConfigList var1) {
      ConfigOrigin var2 = SimpleConfigOrigin.mergeOrigins(this.origin(), var1.origin());
      ArrayList var3 = new ArrayList(this.value.size() + var1.value.size());
      var3.addAll(this.value);
      var3.addAll(var1.value);
      return new SimpleConfigList(var2, var3);
   }

   private Object writeReplace() {
      return new SerializedConfigValue(this);
   }

   public SimpleConfigList withOrigin(ConfigOrigin var1) {
      return (SimpleConfigList)super.withOrigin(var1);
   }

   private static class ResolveModifier implements AbstractConfigValue.Modifier {
      ResolveContext context;
      final ResolveSource source;

      ResolveModifier(ResolveContext var1, ResolveSource var2) {
         this.context = var1;
         this.source = var2;
      }

      @Override
      public AbstractConfigValue modifyChildMayThrow(String var1, AbstractConfigValue var2) {
         ResolveResult var3 = this.context.resolve(var2, this.source);
         this.context = var3.context;
         return var3.value;
      }
   }
}
