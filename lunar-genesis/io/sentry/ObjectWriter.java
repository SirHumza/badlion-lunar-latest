package io.sentry;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface ObjectWriter {
   ObjectWriter beginArray();

   ObjectWriter endArray();

   ObjectWriter beginObject();

   ObjectWriter endObject();

   ObjectWriter name(@NotNull String var1);

   ObjectWriter value(@Nullable String var1);

   ObjectWriter jsonValue(@Nullable String var1);

   ObjectWriter nullValue();

   ObjectWriter value(boolean var1);

   ObjectWriter value(@Nullable Boolean var1);

   ObjectWriter value(double var1);

   ObjectWriter value(long var1);

   ObjectWriter value(@Nullable Number var1);

   ObjectWriter value(@NotNull ILogger var1, @Nullable Object var2);

   void setLenient(boolean var1);
}
