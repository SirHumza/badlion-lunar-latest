package com.moonsworth.lunar.lib.adventure.text.serializer.gson;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.moonsworth.lunar.lib.adventure.internal.Internals;
import com.moonsworth.lunar.lib.adventure.text.event.DataComponentValue;
import java.util.Objects;
import java.util.stream.Stream;
import net.kyori.examination.ExaminableProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

class GsonDataComponentValueImpl implements GsonDataComponentValue {
   private final JsonElement element;

   GsonDataComponentValueImpl(@NotNull JsonElement var1) {
      this.element = var1;
   }

   @NotNull
   @Override
   public JsonElement element() {
      return this.element;
   }

   @NotNull
   @Override
   public Stream<? extends ExaminableProperty> examinableProperties() {
      return Stream.of(ExaminableProperty.of("element", this.element));
   }

   @Override
   public String toString() {
      return Internals.toString(this);
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         GsonDataComponentValueImpl var2 = (GsonDataComponentValueImpl)var1;
         return Objects.equals(this.element, var2.element);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hashCode(this.element);
   }

   static final class RemovedGsonComponentValueImpl extends GsonDataComponentValueImpl implements DataComponentValue.Removed {
      static final GsonDataComponentValueImpl.RemovedGsonComponentValueImpl INSTANCE = new GsonDataComponentValueImpl.RemovedGsonComponentValueImpl();

      private RemovedGsonComponentValueImpl() {
         super(JsonNull.INSTANCE);
      }
   }
}
