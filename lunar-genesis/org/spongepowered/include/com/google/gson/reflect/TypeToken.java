package org.spongepowered.include.com.google.gson.reflect;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import org.spongepowered.include.com.google.gson.internal.$Gson$Preconditions;
import org.spongepowered.include.com.google.gson.internal.$Gson$Types;

public class TypeToken<T> {
   final Class<? super T> rawType;
   final Type type;
   final int hashCode;

   protected TypeToken() {
      this.type = getSuperclassTypeParameter(this.getClass());
      this.rawType = (Class<? super T>)$Gson$Types.getRawType(this.type);
      this.hashCode = this.type.hashCode();
   }

   TypeToken(Type var1) {
      this.type = $Gson$Types.canonicalize($Gson$Preconditions.checkNotNull(var1));
      this.rawType = (Class<? super T>)$Gson$Types.getRawType(this.type);
      this.hashCode = this.type.hashCode();
   }

   static Type getSuperclassTypeParameter(Class<?> var0) {
      Type var1 = var0.getGenericSuperclass();
      if (var1 instanceof Class) {
         throw new RuntimeException("Missing type parameter.");
      }

      ParameterizedType var2 = (ParameterizedType)var1;
      return $Gson$Types.canonicalize(var2.getActualTypeArguments()[0]);
   }

   public final Class<? super T> getRawType() {
      return this.rawType;
   }

   public final Type getType() {
      return this.type;
   }

   @Override
   public final int hashCode() {
      return this.hashCode;
   }

   @Override
   public final boolean equals(Object var1) {
      return var1 instanceof TypeToken && $Gson$Types.equals(this.type, ((TypeToken)var1).type);
   }

   @Override
   public final String toString() {
      return $Gson$Types.typeToString(this.type);
   }

   public static TypeToken<?> get(Type var0) {
      return new TypeToken(var0);
   }

   public static <T> TypeToken<T> get(Class<T> var0) {
      return new TypeToken<>(var0);
   }
}
