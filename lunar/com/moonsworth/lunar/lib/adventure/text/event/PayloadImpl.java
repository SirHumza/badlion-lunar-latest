package com.moonsworth.lunar.lib.adventure.text.event;

import com.moonsworth.lunar.lib.adventure.dialog.DialogLike;
import com.moonsworth.lunar.lib.adventure.internal.Internals;
import com.moonsworth.lunar.lib.adventure.key.Key;
import com.moonsworth.lunar.lib.adventure.nbt.api.BinaryTagHolder;
import java.util.Objects;
import java.util.stream.Stream;
import net.kyori.examination.ExaminableProperty;
import org.jetbrains.annotations.NotNull;

abstract class PayloadImpl implements ClickEvent.Payload {
   @Override
   public String toString() {
      return Internals.toString(this);
   }

   static final class CustomImpl extends PayloadImpl implements ClickEvent.Payload.Custom {
      private final Key key;
      private final BinaryTagHolder nbt;

      CustomImpl(@NotNull Key var1, @NotNull BinaryTagHolder var2) {
         this.key = var1;
         this.nbt = var2;
      }

      @NotNull
      @Override
      public Key key() {
         return this.key;
      }

      @NotNull
      @Override
      public String data() {
         return this.nbt.string();
      }

      @NotNull
      @Override
      public BinaryTagHolder nbt() {
         return this.nbt;
      }

      @NotNull
      @Override
      public Stream<? extends ExaminableProperty> examinableProperties() {
         return Stream.of(ExaminableProperty.of("key", this.key), ExaminableProperty.of("nbt", this.nbt));
      }

      @Override
      public boolean equals(Object var1) {
         if (this == var1) {
            return true;
         } else if (var1 != null && this.getClass() == var1.getClass()) {
            PayloadImpl.CustomImpl var2 = (PayloadImpl.CustomImpl)var1;
            return Objects.equals(this.key, var2.key) && Objects.equals(this.nbt, var2.nbt);
         } else {
            return false;
         }
      }

      @Override
      public int hashCode() {
         int var1 = this.key.hashCode();
         return 31 * var1 + this.nbt.hashCode();
      }
   }

   static final class DialogImpl extends PayloadImpl implements ClickEvent.Payload.Dialog {
      private final DialogLike dialogLike;

      DialogImpl(@NotNull DialogLike var1) {
         this.dialogLike = var1;
      }

      @NotNull
      @Override
      public DialogLike dialog() {
         return this.dialogLike;
      }

      @NotNull
      @Override
      public Stream<? extends ExaminableProperty> examinableProperties() {
         return Stream.of(ExaminableProperty.of("dialog", this.dialogLike));
      }

      @Override
      public boolean equals(Object var1) {
         if (this == var1) {
            return true;
         } else if (var1 != null && this.getClass() == var1.getClass()) {
            PayloadImpl.DialogImpl var2 = (PayloadImpl.DialogImpl)var1;
            return Objects.equals(this.dialogLike, var2.dialogLike);
         } else {
            return false;
         }
      }

      @Override
      public int hashCode() {
         return this.dialogLike.hashCode();
      }
   }

   static final class IntImpl extends PayloadImpl implements ClickEvent.Payload.Int {
      private final int integer;

      IntImpl(int var1) {
         this.integer = var1;
      }

      @Override
      public int integer() {
         return this.integer;
      }

      @NotNull
      @Override
      public Stream<? extends ExaminableProperty> examinableProperties() {
         return Stream.of(ExaminableProperty.of("integer", this.integer));
      }

      @Override
      public boolean equals(Object var1) {
         if (this == var1) {
            return true;
         } else if (var1 != null && this.getClass() == var1.getClass()) {
            PayloadImpl.IntImpl var2 = (PayloadImpl.IntImpl)var1;
            return Objects.equals(this.integer, var2.integer);
         } else {
            return false;
         }
      }

      @Override
      public int hashCode() {
         return this.integer;
      }
   }

   static final class TextImpl extends PayloadImpl implements ClickEvent.Payload.Text {
      private final String value;

      TextImpl(@NotNull String var1) {
         this.value = var1;
      }

      @NotNull
      @Override
      public String value() {
         return this.value;
      }

      @NotNull
      @Override
      public Stream<? extends ExaminableProperty> examinableProperties() {
         return Stream.of(ExaminableProperty.of("value", this.value));
      }

      @Override
      public boolean equals(Object var1) {
         if (this == var1) {
            return true;
         } else if (var1 != null && this.getClass() == var1.getClass()) {
            PayloadImpl.TextImpl var2 = (PayloadImpl.TextImpl)var1;
            return Objects.equals(this.value, var2.value);
         } else {
            return false;
         }
      }

      @Override
      public int hashCode() {
         return this.value.hashCode();
      }
   }
}
