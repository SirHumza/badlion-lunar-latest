package org.openapitools.jackson.nullable;

import java.io.Serializable;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.function.Consumer;

public class JsonNullable<T> implements Serializable {
   private static final long serialVersionUID = 1L;
   private static final JsonNullable<?> UNDEFINED = new JsonNullable(null, false);
   private final T value;
   private final boolean isPresent;

   private JsonNullable(T var1, boolean var2) {
      this.value = (T)var1;
      this.isPresent = var2;
   }

   public static <T> JsonNullable<T> undefined() {
      return (JsonNullable<T>)UNDEFINED;
   }

   public static <T> JsonNullable<T> of(T var0) {
      return new JsonNullable<>((T)var0, true);
   }

   public T get() {
      if (!this.isPresent) {
         throw new NoSuchElementException("Value is undefined");
      } else {
         return this.value;
      }
   }

   public T orElse(T var1) {
      return (T)(this.isPresent ? this.value : var1);
   }

   public boolean isPresent() {
      return this.isPresent;
   }

   public void ifPresent(Consumer<? super T> var1) {
      if (this.isPresent) {
         var1.accept(this.value);
      }
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      }

      if (!(var1 instanceof JsonNullable)) {
         return false;
      }

      JsonNullable var2 = (JsonNullable)var1;
      return Objects.equals(this.value, var2.value) && this.isPresent == var2.isPresent;
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.value, this.isPresent);
   }

   @Override
   public String toString() {
      return this.isPresent ? String.format("JsonNullable[%s]", this.value) : "JsonNullable.undefined";
   }
}
