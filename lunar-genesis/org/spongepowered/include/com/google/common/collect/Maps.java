package org.spongepowered.include.com.google.common.collect;

import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import org.spongepowered.include.com.google.common.base.Function;
import org.spongepowered.include.com.google.common.base.Joiner;
import org.spongepowered.include.com.google.common.base.Objects;
import org.spongepowered.include.com.google.common.base.Preconditions;
import org.spongepowered.include.com.google.j2objc.annotations.Weak;

public final class Maps {
   static final Joiner.MapJoiner STANDARD_JOINER = Collections2.STANDARD_JOINER.withKeyValueSeparator("=");

   static <K> Function<Entry<K, ?>, K> keyFunction() {
      return Maps.EntryFunction.KEY;
   }

   static <V> Function<Entry<?, V>, V> valueFunction() {
      return Maps.EntryFunction.VALUE;
   }

   static <K, V> Iterator<K> keyIterator(Iterator<Entry<K, V>> var0) {
      return Iterators.transform(var0, keyFunction());
   }

   static <K, V> Iterator<V> valueIterator(Iterator<Entry<K, V>> var0) {
      return Iterators.transform(var0, valueFunction());
   }

   static int capacity(int var0) {
      if (var0 < 3) {
         CollectPreconditions.checkNonnegative(var0, "expectedSize");
         return var0 + 1;
      } else {
         return var0 < 1073741824 ? (int)(var0 / 0.75F + 1.0F) : Integer.MAX_VALUE;
      }
   }

   public static <K extends Comparable, V> TreeMap<K, V> newTreeMap() {
      return new TreeMap<>();
   }

   public static <K, V> Entry<K, V> immutableEntry(@Nullable K var0, @Nullable V var1) {
      return new ImmutableEntry<>((K)var0, (V)var1);
   }

   static <V> V safeGet(Map<?, V> var0, @Nullable Object var1) {
      Preconditions.checkNotNull(var0);

      try {
         return (V)var0.get(var1);
      } catch (ClassCastException var3) {
         return null;
      } catch (NullPointerException var4) {
         return null;
      }
   }

   static boolean safeContainsKey(Map<?, ?> var0, Object var1) {
      Preconditions.checkNotNull(var0);

      try {
         return var0.containsKey(var1);
      } catch (ClassCastException var3) {
         return false;
      } catch (NullPointerException var4) {
         return false;
      }
   }

   static <V> V safeRemove(Map<?, V> var0, Object var1) {
      Preconditions.checkNotNull(var0);

      try {
         return (V)var0.remove(var1);
      } catch (ClassCastException var3) {
         return null;
      } catch (NullPointerException var4) {
         return null;
      }
   }

   static boolean equalsImpl(Map<?, ?> var0, Object var1) {
      if (var0 == var1) {
         return true;
      } else if (var1 instanceof Map) {
         Map var2 = (Map)var1;
         return var0.entrySet().equals(var2.entrySet());
      } else {
         return false;
      }
   }

   static String toStringImpl(Map<?, ?> var0) {
      StringBuilder var1 = Collections2.newStringBuilderForCollection(var0.size()).append('{');
      STANDARD_JOINER.appendTo(var1, var0);
      return var1.append('}').toString();
   }

   @Nullable
   static <K> K keyOrNull(@Nullable Entry<K, ?> var0) {
      return (K)(var0 == null ? null : var0.getKey());
   }

   @Nullable
   static <V> V valueOrNull(@Nullable Entry<?, V> var0) {
      return (V)(var0 == null ? null : var0.getValue());
   }

   private enum EntryFunction implements Function<Entry<?, ?>, Object> {
      KEY {
         @Nullable
         public Object apply(Entry<?, ?> var1) {
            return var1.getKey();
         }
      },
      VALUE {
         @Nullable
         public Object apply(Entry<?, ?> var1) {
            return var1.getValue();
         }
      };

      EntryFunction() {
      }
   }

   abstract static class EntrySet<K, V> extends Sets.ImprovedAbstractSet<Entry<K, V>> {
      abstract Map<K, V> map();

      @Override
      public int size() {
         return this.map().size();
      }

      @Override
      public void clear() {
         this.map().clear();
      }

      @Override
      public boolean contains(Object var1) {
         if (!(var1 instanceof Entry)) {
            return false;
         }

         Entry var2 = (Entry)var1;
         Object var3 = var2.getKey();
         Object var4 = Maps.safeGet(this.map(), var3);
         return Objects.equal(var4, var2.getValue()) && (var4 != null || this.map().containsKey(var3));
      }

      @Override
      public boolean isEmpty() {
         return this.map().isEmpty();
      }

      @Override
      public boolean remove(Object var1) {
         if (this.contains(var1)) {
            Entry var2 = (Entry)var1;
            return this.map().keySet().remove(var2.getKey());
         } else {
            return false;
         }
      }

      @Override
      public boolean removeAll(Collection<?> var1) {
         try {
            return super.removeAll(Preconditions.checkNotNull(var1));
         } catch (UnsupportedOperationException var3) {
            return Sets.removeAllImpl(this, var1.iterator());
         }
      }

      @Override
      public boolean retainAll(Collection<?> var1) {
         try {
            return super.retainAll(Preconditions.checkNotNull(var1));
         } catch (UnsupportedOperationException var7) {
            HashSet var3 = Sets.newHashSetWithExpectedSize(var1.size());

            for (Object var5 : var1) {
               if (this.contains(var5)) {
                  Entry var6 = (Entry)var5;
                  var3.add(var6.getKey());
               }
            }

            return this.map().keySet().retainAll(var3);
         }
      }
   }

   abstract static class IteratorBasedAbstractMap<K, V> extends AbstractMap<K, V> {
      @Override
      public abstract int size();

      abstract Iterator<Entry<K, V>> entryIterator();

      Spliterator<Entry<K, V>> entrySpliterator() {
         return Spliterators.spliterator(this.entryIterator(), this.size(), 65);
      }

      @Override
      public Set<Entry<K, V>> entrySet() {
         return new Maps.EntrySet<K, V>() {
            @Override
            Map<K, V> map() {
               return IteratorBasedAbstractMap.this;
            }

            @Override
            public Iterator<Entry<K, V>> iterator() {
               return IteratorBasedAbstractMap.this.entryIterator();
            }

            @Override
            public Spliterator<Entry<K, V>> spliterator() {
               return IteratorBasedAbstractMap.this.entrySpliterator();
            }

            @Override
            public void forEach(Consumer<? super Entry<K, V>> var1) {
               IteratorBasedAbstractMap.this.forEachEntry(var1);
            }
         };
      }

      void forEachEntry(Consumer<? super Entry<K, V>> var1) {
         this.entryIterator().forEachRemaining(var1);
      }

      @Override
      public void clear() {
         Iterators.clear(this.entryIterator());
      }
   }

   static class KeySet<K, V> extends Sets.ImprovedAbstractSet<K> {
      @Weak
      final Map<K, V> map;

      KeySet(Map<K, V> var1) {
         this.map = Preconditions.checkNotNull(var1);
      }

      Map<K, V> map() {
         return this.map;
      }

      @Override
      public Iterator<K> iterator() {
         return Maps.keyIterator(this.map().entrySet().iterator());
      }

      @Override
      public void forEach(Consumer<? super K> var1) {
         Preconditions.checkNotNull(var1);
         this.map.forEach((var1x, var2) -> var1.accept(var1x));
      }

      @Override
      public int size() {
         return this.map().size();
      }

      @Override
      public boolean isEmpty() {
         return this.map().isEmpty();
      }

      @Override
      public boolean contains(Object var1) {
         return this.map().containsKey(var1);
      }

      @Override
      public boolean remove(Object var1) {
         if (this.contains(var1)) {
            this.map().remove(var1);
            return true;
         } else {
            return false;
         }
      }

      @Override
      public void clear() {
         this.map().clear();
      }
   }

   static class Values<K, V> extends AbstractCollection<V> {
      @Weak
      final Map<K, V> map;

      Values(Map<K, V> var1) {
         this.map = Preconditions.checkNotNull(var1);
      }

      final Map<K, V> map() {
         return this.map;
      }

      @Override
      public Iterator<V> iterator() {
         return Maps.valueIterator(this.map().entrySet().iterator());
      }

      @Override
      public void forEach(Consumer<? super V> var1) {
         Preconditions.checkNotNull(var1);
         this.map.forEach((var1x, var2) -> var1.accept(var2));
      }

      @Override
      public boolean remove(Object var1) {
         try {
            return super.remove(var1);
         } catch (UnsupportedOperationException var5) {
            for (Entry var4 : this.map().entrySet()) {
               if (Objects.equal(var1, var4.getValue())) {
                  this.map().remove(var4.getKey());
                  return true;
               }
            }

            return false;
         }
      }

      @Override
      public boolean removeAll(Collection<?> var1) {
         try {
            return super.removeAll(Preconditions.checkNotNull(var1));
         } catch (UnsupportedOperationException var6) {
            HashSet var3 = Sets.newHashSet();

            for (Entry var5 : this.map().entrySet()) {
               if (var1.contains(var5.getValue())) {
                  var3.add(var5.getKey());
               }
            }

            return this.map().keySet().removeAll(var3);
         }
      }

      @Override
      public boolean retainAll(Collection<?> var1) {
         try {
            return super.retainAll(Preconditions.checkNotNull(var1));
         } catch (UnsupportedOperationException var6) {
            HashSet var3 = Sets.newHashSet();

            for (Entry var5 : this.map().entrySet()) {
               if (var1.contains(var5.getValue())) {
                  var3.add(var5.getKey());
               }
            }

            return this.map().keySet().retainAll(var3);
         }
      }

      @Override
      public int size() {
         return this.map().size();
      }

      @Override
      public boolean isEmpty() {
         return this.map().isEmpty();
      }

      @Override
      public boolean contains(@Nullable Object var1) {
         return this.map().containsValue(var1);
      }

      @Override
      public void clear() {
         this.map().clear();
      }
   }

   abstract static class ViewCachingAbstractMap<K, V> extends AbstractMap<K, V> {
      private transient Set<Entry<K, V>> entrySet;
      private transient Set<K> keySet;
      private transient Collection<V> values;

      abstract Set<Entry<K, V>> createEntrySet();

      @Override
      public Set<Entry<K, V>> entrySet() {
         Set var1 = this.entrySet;
         return var1 == null ? (this.entrySet = this.createEntrySet()) : var1;
      }

      @Override
      public Set<K> keySet() {
         Set var1 = this.keySet;
         return var1 == null ? (this.keySet = this.createKeySet()) : var1;
      }

      Set<K> createKeySet() {
         return new Maps.KeySet<>(this);
      }

      @Override
      public Collection<V> values() {
         Collection var1 = this.values;
         return var1 == null ? (this.values = this.createValues()) : var1;
      }

      Collection<V> createValues() {
         return new Maps.Values<>(this);
      }
   }
}
