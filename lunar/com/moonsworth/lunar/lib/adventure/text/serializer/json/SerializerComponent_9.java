package com.moonsworth.lunar.lib.adventure.text.serializer.json;

import com.moonsworth.lunar.lib.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.lib.adventure.text.Component;
import java.util.function.Consumer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class DummyJSONComponentSerializer implements JSONComponentSerializer {
   static final JSONComponentSerializer INSTANCE = new DummyJSONComponentSerializer();
   private static final String UNSUPPORTED_MESSAGE = "No JsonComponentSerializer implementation found\n\nAre you missing an implementation artifact like adventure-text-serializer-gson?\nIs your environment configured in a way that causes ServiceLoader to malfunction?";

   @NotNull
   public Component deserialize(@NotNull String var1) {
      throw new UnsupportedOperationException(
         "No JsonComponentSerializer implementation found\n\nAre you missing an implementation artifact like adventure-text-serializer-gson?\nIs your environment configured in a way that causes ServiceLoader to malfunction?"
      );
   }

   @NotNull
   public String serialize(@NotNull Component var1) {
      throw new UnsupportedOperationException(
         "No JsonComponentSerializer implementation found\n\nAre you missing an implementation artifact like adventure-text-serializer-gson?\nIs your environment configured in a way that causes ServiceLoader to malfunction?"
      );
   }

   static final class BuilderImpl implements JSONComponentSerializer.Builder {
      @NotNull
      @Override
      public JSONComponentSerializer.Builder options(@NotNull RRCRRCORICCHOHHIRCHIROOHIIOHCO var1) {
         return this;
      }

      @NotNull
      @Override
      public JSONComponentSerializer.Builder editOptions(@NotNull Consumer<RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> var1) {
         return this;
      }

      @Deprecated
      @NotNull
      @Override
      public JSONComponentSerializer.Builder downsampleColors() {
         return this;
      }

      @NotNull
      @Override
      public JSONComponentSerializer.Builder legacyHoverEventSerializer(@Nullable LegacyHoverEventSerializer var1) {
         return this;
      }

      @Deprecated
      @NotNull
      @Override
      public JSONComponentSerializer.Builder emitLegacyHoverEvent() {
         return this;
      }

      @NotNull
      @Override
      public JSONComponentSerializer build() {
         return DummyJSONComponentSerializer.INSTANCE;
      }
   }
}
