package io.sentry;

import io.sentry.vendor.gson.stream.JsonWriter;
import java.io.Writer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class JsonObjectWriter implements ObjectWriter {
   @NotNull
   private final JsonWriter jsonWriter;
   @NotNull
   private final JsonObjectSerializer jsonObjectSerializer;

   public JsonObjectWriter(@NotNull Writer var1, int var2) {
      this.jsonWriter = new JsonWriter(var1);
      this.jsonObjectSerializer = new JsonObjectSerializer(var2);
   }

   public JsonObjectWriter beginArray() {
      this.jsonWriter.beginArray();
      return this;
   }

   public JsonObjectWriter endArray() {
      this.jsonWriter.endArray();
      return this;
   }

   public JsonObjectWriter beginObject() {
      this.jsonWriter.beginObject();
      return this;
   }

   public JsonObjectWriter endObject() {
      this.jsonWriter.endObject();
      return this;
   }

   public JsonObjectWriter name(@NotNull String var1) {
      this.jsonWriter.name(var1);
      return this;
   }

   public JsonObjectWriter value(@Nullable String var1) {
      this.jsonWriter.value(var1);
      return this;
   }

   @Override
   public ObjectWriter jsonValue(@Nullable String var1) {
      this.jsonWriter.jsonValue(var1);
      return this;
   }

   public JsonObjectWriter nullValue() {
      this.jsonWriter.nullValue();
      return this;
   }

   public JsonObjectWriter value(boolean var1) {
      this.jsonWriter.value(var1);
      return this;
   }

   public JsonObjectWriter value(@Nullable Boolean var1) {
      this.jsonWriter.value(var1);
      return this;
   }

   public JsonObjectWriter value(double var1) {
      this.jsonWriter.value(var1);
      return this;
   }

   public JsonObjectWriter value(long var1) {
      this.jsonWriter.value(var1);
      return this;
   }

   public JsonObjectWriter value(@Nullable Number var1) {
      this.jsonWriter.value(var1);
      return this;
   }

   public JsonObjectWriter value(@NotNull ILogger var1, @Nullable Object var2) {
      this.jsonObjectSerializer.serialize(this, var1, var2);
      return this;
   }

   @Override
   public void setLenient(boolean var1) {
      this.jsonWriter.setLenient(var1);
   }

   public void setIndent(@NotNull String var1) {
      this.jsonWriter.setIndent(var1);
   }
}
