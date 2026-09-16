package io.sentry;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class NoOpSerializer implements ISerializer {
   private static final NoOpSerializer instance = new NoOpSerializer();

   public static NoOpSerializer getInstance() {
      return instance;
   }

   private NoOpSerializer() {
   }

   @Nullable
   @Override
   public <T, R> T deserializeCollection(@NotNull Reader var1, @NotNull Class<T> var2, @Nullable JsonDeserializer<R> var3) {
      return null;
   }

   @Nullable
   @Override
   public <T> T deserialize(@NotNull Reader var1, @NotNull Class<T> var2) {
      return null;
   }

   @Nullable
   @Override
   public SentryEnvelope deserializeEnvelope(@NotNull InputStream var1) {
      return null;
   }

   @Override
   public <T> void serialize(@NotNull T var1, @NotNull Writer var2) {
   }

   @Override
   public void serialize(@NotNull SentryEnvelope var1, @NotNull OutputStream var2) {
   }

   @NotNull
   @Override
   public String serialize(@NotNull Map<String, Object> var1) {
      return "";
   }
}
