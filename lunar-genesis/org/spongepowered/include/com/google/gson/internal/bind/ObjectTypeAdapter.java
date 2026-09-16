package org.spongepowered.include.com.google.gson.internal.bind;

import java.util.ArrayList;
import org.spongepowered.include.com.google.gson.Gson;
import org.spongepowered.include.com.google.gson.TypeAdapter;
import org.spongepowered.include.com.google.gson.TypeAdapterFactory;
import org.spongepowered.include.com.google.gson.internal.LinkedTreeMap;
import org.spongepowered.include.com.google.gson.reflect.TypeToken;
import org.spongepowered.include.com.google.gson.stream.JsonReader;
import org.spongepowered.include.com.google.gson.stream.JsonToken;
import org.spongepowered.include.com.google.gson.stream.JsonWriter;

public final class ObjectTypeAdapter extends TypeAdapter<Object> {
   public static final TypeAdapterFactory FACTORY = new TypeAdapterFactory() {
      @Override
      public <T> TypeAdapter<T> create(Gson var1, TypeToken<T> var2) {
         return var2.getRawType() == Object.class ? new ObjectTypeAdapter(var1) : null;
      }
   };
   private final Gson gson;

   private ObjectTypeAdapter(Gson var1) {
      this.gson = var1;
   }

   @Override
   public Object read(JsonReader var1) {
      JsonToken var2 = var1.peek();
      switch (var2) {
         case BEGIN_ARRAY:
            ArrayList var3 = new ArrayList();
            var1.beginArray();

            while (var1.hasNext()) {
               var3.add(this.read(var1));
            }

            var1.endArray();
            return var3;
         case BEGIN_OBJECT:
            LinkedTreeMap var4 = new LinkedTreeMap();
            var1.beginObject();

            while (var1.hasNext()) {
               var4.put(var1.nextName(), this.read(var1));
            }

            var1.endObject();
            return var4;
         case STRING:
            return var1.nextString();
         case NUMBER:
            return var1.nextDouble();
         case BOOLEAN:
            return var1.nextBoolean();
         case NULL:
            var1.nextNull();
            return null;
         default:
            throw new IllegalStateException();
      }
   }

   @Override
   public void write(JsonWriter var1, Object var2) {
      if (var2 == null) {
         var1.nullValue();
      } else {
         TypeAdapter var3 = this.gson.getAdapter(var2.getClass());
         if (var3 instanceof ObjectTypeAdapter) {
            var1.beginObject();
            var1.endObject();
         } else {
            var3.write(var1, var2);
         }
      }
   }
}
