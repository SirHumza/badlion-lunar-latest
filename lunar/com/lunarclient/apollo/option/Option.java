package com.lunarclient.apollo.option;

import io.leangen.geantyref.TypeToken;
import java.util.Arrays;
import java.util.Objects;
import lombok.Generated;
import org.jetbrains.annotations.Nullable;

public abstract class Option<V, M extends OptionBuilder<V, M, I>, I extends Option<V, M, I>> implements Cloneable {
   private final String[] path;
   private final TypeToken<V> typeToken;
   @Nullable
   private final String comment;
   @Nullable
   private final V defaultValue;
   private final boolean notify;
   private final String key;

   public static <V> SimpleOption.SimpleOptionBuilder<V> builder() {
      return new SimpleOption.SimpleOptionBuilder<>();
   }

   public static <V extends Number & Comparable<V>> NumberOption.NumberOptionBuilder<V> number() {
      return new NumberOption.NumberOptionBuilder<>();
   }

   public static <T> ListOption.ListOptionBuilder<T> list() {
      return new ListOption.ListOptionBuilder<>();
   }

   public static <T extends Enum<T>> EnumOption.EnumOptionBuilder<T> enumerator() {
      return new EnumOption.EnumOptionBuilder<>();
   }

   Option(M var1) {
      this.path = Objects.requireNonNull(var1.node, "node");
      this.typeToken = Objects.requireNonNull(var1.typeToken, "typeToken");
      this.comment = var1.comment;
      this.defaultValue = var1.defaultValue;
      this.notify = var1.notify;
      this.key = String.join(".", this.path);
   }

   public Option<V, M, I> clone() {
      try {
         return (Option<V, M, I>)super.clone();
      } catch (CloneNotSupportedException var2) {
         throw new AssertionError(var2);
      }
   }

   @Generated
   public String[] getPath() {
      return this.path;
   }

   @Generated
   public TypeToken<V> getTypeToken() {
      return this.typeToken;
   }

   @Nullable
   @Generated
   public String getComment() {
      return this.comment;
   }

   @Nullable
   @Generated
   public V getDefaultValue() {
      return this.defaultValue;
   }

   @Generated
   public boolean isNotify() {
      return this.notify;
   }

   @Generated
   public String getKey() {
      return this.key;
   }

   @Generated
   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      }

      if (!(var1 instanceof Option)) {
         return false;
      }

      Option var2 = (Option)var1;
      if (!var2.canEqual(this)) {
         return false;
      }

      if (this.isNotify() != var2.isNotify()) {
         return false;
      }

      if (!Arrays.deepEquals(this.getPath(), var2.getPath())) {
         return false;
      }

      TypeToken var3 = this.getTypeToken();
      TypeToken var4 = var2.getTypeToken();
      if (var3 == null ? var4 == null : var3.equals(var4)) {
         String var5 = this.getComment();
         String var6 = var2.getComment();
         if (var5 == null ? var6 == null : var5.equals(var6)) {
            Object var7 = this.getDefaultValue();
            Object var8 = var2.getDefaultValue();
            return var7 == null ? var8 == null : var7.equals(var8);
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @Generated
   protected boolean canEqual(Object var1) {
      return var1 instanceof Option;
   }

   @Generated
   @Override
   public int hashCode() {
      byte var1 = 59;
      int var2 = 1;
      var2 = var2 * 59 + (this.isNotify() ? 79 : 97);
      var2 = var2 * 59 + Arrays.deepHashCode(this.getPath());
      TypeToken var3 = this.getTypeToken();
      var2 = var2 * 59 + (var3 == null ? 43 : var3.hashCode());
      String var4 = this.getComment();
      var2 = var2 * 59 + (var4 == null ? 43 : var4.hashCode());
      Object var5 = this.getDefaultValue();
      return var2 * 59 + (var5 == null ? 43 : var5.hashCode());
   }
}
