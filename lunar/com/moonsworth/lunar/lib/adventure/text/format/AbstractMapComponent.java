package com.moonsworth.lunar.lib.adventure.text.format;

import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import java.util.Spliterators;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.Map.Entry;
import java.util.stream.Stream;
import net.kyori.examination.Examinable;
import net.kyori.examination.ExaminableProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Unmodifiable;

@Unmodifiable
final class DecorationMap extends AbstractMap<TextDecoration, TextDecoration.State> implements Examinable {
   static final TextDecoration[] DECORATIONS = TextDecoration.values();
   private static final TextDecoration.State[] STATES = TextDecoration.State.values();
   private static final int MAP_SIZE = DECORATIONS.length;
   private static final TextDecoration.State[] EMPTY_STATE_ARRAY = new TextDecoration.State[0];
   static final DecorationMap EMPTY = new DecorationMap(0);
   private static final DecorationMap.KeySet KEY_SET = new DecorationMap.KeySet();
   private final int bitSet;
   private volatile DecorationMap.EntrySet entrySet = null;
   private volatile DecorationMap.Values values = null;

   static DecorationMap fromMap(Map<TextDecoration, TextDecoration.State> var0) {
      if (var0 instanceof DecorationMap) {
         return (DecorationMap)var0;
      }

      int var1 = 0;

      for (TextDecoration var5 : DECORATIONS) {
         var1 |= var0.getOrDefault(var5, TextDecoration.State.NOT_SET).ordinal() * offset(var5);
      }

      return withBitSet(var1);
   }

   static DecorationMap merge(Map<TextDecoration, TextDecoration.State> var0, Map<TextDecoration, TextDecoration.State> var1) {
      int var2 = 0;

      for (TextDecoration var6 : DECORATIONS) {
         var2 |= var0.getOrDefault(var6, var1.getOrDefault(var6, TextDecoration.State.NOT_SET)).ordinal() * offset(var6);
      }

      return withBitSet(var2);
   }

   private static DecorationMap withBitSet(int var0) {
      return var0 == 0 ? EMPTY : new DecorationMap(var0);
   }

   private static int offset(TextDecoration var0) {
      return 1 << var0.ordinal() * 2;
   }

   private DecorationMap(int var1) {
      this.bitSet = var1;
   }

   @NotNull
   public DecorationMap with(@NotNull TextDecoration var1, TextDecoration.@NotNull State var2) {
      Objects.requireNonNull(var2, "state");
      Objects.requireNonNull(var1, "decoration");
      int var3 = offset(var1);
      return withBitSet(this.bitSet & ~(3 * var3) | var2.ordinal() * var3);
   }

   @NotNull
   @Override
   public Stream<? extends ExaminableProperty> examinableProperties() {
      return Arrays.stream(DECORATIONS).map(var1 -> ExaminableProperty.of(var1.toString(), this.get(var1)));
   }

   public TextDecoration.State get(Object var1) {
      return var1 instanceof TextDecoration ? STATES[this.bitSet >> ((TextDecoration)var1).ordinal() * 2 & 3] : null;
   }

   @Override
   public boolean containsKey(Object var1) {
      return var1 instanceof TextDecoration;
   }

   @Override
   public int size() {
      return MAP_SIZE;
   }

   @Override
   public boolean isEmpty() {
      return false;
   }

   @NotNull
   @Override
   public Set<Entry<TextDecoration, TextDecoration.State>> entrySet() {
      if (this.entrySet == null) {
         synchronized (this) {
            if (this.entrySet == null) {
               this.entrySet = new DecorationMap.EntrySet();
            }
         }
      }

      return this.entrySet;
   }

   @NotNull
   @Override
   public Set<TextDecoration> keySet() {
      return KEY_SET;
   }

   @NotNull
   @Override
   public Collection<TextDecoration.State> values() {
      if (this.values == null) {
         synchronized (this) {
            if (this.values == null) {
               this.values = new DecorationMap.Values();
            }
         }
      }

      return this.values;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else {
         return var1 != null && var1.getClass() == DecorationMap.class ? this.bitSet == ((DecorationMap)var1).bitSet : false;
      }
   }

   @Override
   public int hashCode() {
      return this.bitSet;
   }

   final class EntrySet extends AbstractSet<Entry<TextDecoration, TextDecoration.State>> {
      @NotNull
      @Override
      public Iterator<Entry<TextDecoration, TextDecoration.State>> iterator() {
         return new Iterator<Entry<TextDecoration, TextDecoration.State>>() {
            private final Iterator<TextDecoration> decorations = DecorationMap.KEY_SET.iterator();
            private final Iterator<TextDecoration.State> states = DecorationMap.this.values().iterator();

            @Override
            public boolean hasNext() {
               return this.decorations.hasNext() && this.states.hasNext();
            }

            public Entry<TextDecoration, TextDecoration.State> next() {
               if (this.hasNext()) {
                  return new SimpleImmutableEntry<>(this.decorations.next(), this.states.next());
               } else {
                  throw new NoSuchElementException();
               }
            }
         };
      }

      @Override
      public int size() {
         return DecorationMap.MAP_SIZE;
      }
   }

   static final class KeySet extends AbstractSet<TextDecoration> {
      @Override
      public boolean contains(Object var1) {
         return var1 instanceof TextDecoration;
      }

      @Override
      public boolean isEmpty() {
         return false;
      }

      @Override
      public Object @NotNull [] toArray() {
         return Arrays.copyOf(DecorationMap.DECORATIONS, DecorationMap.MAP_SIZE, Object[].class);
      }

      @Override
      public <T> T @NotNull [] toArray(T @NotNull [] var1) {
         if (var1.length < DecorationMap.MAP_SIZE) {
            return (T[])Arrays.copyOf(DecorationMap.DECORATIONS, DecorationMap.MAP_SIZE, (Class<? extends T[]>)var1.getClass());
         }

         System.arraycopy(DecorationMap.DECORATIONS, 0, var1, 0, DecorationMap.MAP_SIZE);
         if (var1.length > DecorationMap.MAP_SIZE) {
            var1[DecorationMap.MAP_SIZE] = null;
         }

         return (T[])var1;
      }

      @NotNull
      @Override
      public Iterator<TextDecoration> iterator() {
         return Spliterators.iterator(Arrays.spliterator(DecorationMap.DECORATIONS));
      }

      @Override
      public int size() {
         return DecorationMap.MAP_SIZE;
      }
   }

   final class Values extends AbstractCollection<TextDecoration.State> {
      @NotNull
      @Override
      public Iterator<TextDecoration.State> iterator() {
         return Spliterators.iterator(Arrays.spliterator(this.toArray(DecorationMap.EMPTY_STATE_ARRAY)));
      }

      @Override
      public boolean isEmpty() {
         return false;
      }

      @Override
      public Object @NotNull [] toArray() {
         Object[] var1 = new Object[DecorationMap.MAP_SIZE];

         for (int var2 = 0; var2 < DecorationMap.MAP_SIZE; var2++) {
            var1[var2] = DecorationMap.this.get(DecorationMap.DECORATIONS[var2]);
         }

         return var1;
      }

      @Override
      public <T> T @NotNull [] toArray(T @NotNull [] var1) {
         if (var1.length < DecorationMap.MAP_SIZE) {
            return (T[])Arrays.copyOf(this.toArray(), DecorationMap.MAP_SIZE, (Class<? extends T[]>)var1.getClass());
         }

         System.arraycopy(this.toArray(), 0, var1, 0, DecorationMap.MAP_SIZE);
         if (var1.length > DecorationMap.MAP_SIZE) {
            var1[DecorationMap.MAP_SIZE] = null;
         }

         return (T[])var1;
      }

      @Override
      public boolean contains(Object var1) {
         return var1 instanceof TextDecoration.State && super.contains(var1);
      }

      @Override
      public int size() {
         return DecorationMap.MAP_SIZE;
      }
   }
}
