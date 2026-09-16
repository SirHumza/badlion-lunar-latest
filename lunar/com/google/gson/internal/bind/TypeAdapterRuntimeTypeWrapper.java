package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

final class TypeAdapterRuntimeTypeWrapper<T> extends TypeAdapter<T> {
   private final Gson context;
   private final TypeAdapter<T> delegate;
   private final Type type;

   TypeAdapterRuntimeTypeWrapper(Gson var1, TypeAdapter<T> var2, Type var3) {
      this.context = var1;
      this.delegate = var2;
      this.type = var3;
   }

   @Override
   public T read(JsonReader var1) {
      return this.delegate.read(var1);
   }

   @Override
   public void write(JsonWriter var1, T var2) {
      TypeAdapter var3 = this.delegate;
      Type var4 = getRuntimeTypeIfMoreSpecific(this.type, var2);
      if (var4 != this.type) {
         TypeAdapter var5 = this.context.getAdapter(TypeToken.get(var4));
         if (!(var5 instanceof ReflectiveTypeAdapterFactory.Adapter)) {
            var3 = var5;
         } else if (!isReflective(this.delegate)) {
            var3 = this.delegate;
         } else {
            var3 = var5;
         }
      }

      var3.write(var1, var2);
   }

   private static boolean isReflective(TypeAdapter<?> var0) {
      while (var0 instanceof SerializationDelegatingTypeAdapter) {
         TypeAdapter var1 = ((SerializationDelegatingTypeAdapter)var0).getSerializationDelegate();
         if (var1 != var0) {
            var0 = var1;
            continue;
         }
         break;
      }

      return var0 instanceof ReflectiveTypeAdapterFactory.Adapter;
   }

   private static Type getRuntimeTypeIfMoreSpecific(Type var0, Object var1) {
      if (var1 != null && (var0 instanceof Class || var0 instanceof TypeVariable)) {
         var0 = var1.getClass();
      }

      return var0;
   }
}
