package org.spongepowered.include.com.google.gson;

import java.io.IOException;
import org.spongepowered.include.com.google.gson.internal.bind.JsonTreeWriter;
import org.spongepowered.include.com.google.gson.stream.JsonReader;
import org.spongepowered.include.com.google.gson.stream.JsonWriter;

public abstract class TypeAdapter<T> {
   public abstract void write(JsonWriter var1, T var2);

   public final JsonElement toJsonTree(T var1) {
      try {
         JsonTreeWriter var2 = new JsonTreeWriter();
         this.write(var2, (T)var1);
         return var2.get();
      } catch (IOException var3) {
         throw new JsonIOException(var3);
      }
   }

   public abstract T read(JsonReader var1);
}
