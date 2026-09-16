package org.spongepowered.include.com.google.gson.internal;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;
import org.spongepowered.include.com.google.gson.ExclusionStrategy;
import org.spongepowered.include.com.google.gson.FieldAttributes;
import org.spongepowered.include.com.google.gson.Gson;
import org.spongepowered.include.com.google.gson.TypeAdapter;
import org.spongepowered.include.com.google.gson.TypeAdapterFactory;
import org.spongepowered.include.com.google.gson.annotations.Expose;
import org.spongepowered.include.com.google.gson.annotations.Since;
import org.spongepowered.include.com.google.gson.annotations.Until;
import org.spongepowered.include.com.google.gson.reflect.TypeToken;
import org.spongepowered.include.com.google.gson.stream.JsonReader;
import org.spongepowered.include.com.google.gson.stream.JsonWriter;

public final class Excluder implements Cloneable, TypeAdapterFactory {
   public static final Excluder DEFAULT = new Excluder();
   private double version = -1.0;
   private int modifiers = 136;
   private boolean serializeInnerClasses = true;
   private boolean requireExpose;
   private List<ExclusionStrategy> serializationStrategies = Collections.emptyList();
   private List<ExclusionStrategy> deserializationStrategies = Collections.emptyList();

   protected Excluder clone() {
      try {
         return (Excluder)super.clone();
      } catch (CloneNotSupportedException var2) {
         throw new AssertionError();
      }
   }

   @Override
   public <T> TypeAdapter<T> create(final Gson var1, final TypeToken<T> var2) {
      Class var3 = var2.getRawType();
      final boolean var4 = this.excludeClass(var3, true);
      final boolean var5 = this.excludeClass(var3, false);
      return !var4 && !var5 ? null : new TypeAdapter<T>() {
         private TypeAdapter<T> delegate;

         @Override
         public T read(JsonReader var1x) {
            if (var5) {
               var1x.skipValue();
               return null;
            } else {
               return (T)this.delegate().read(var1x);
            }
         }

         @Override
         public void write(JsonWriter var1x, T var2x) {
            if (var4) {
               var1x.nullValue();
            } else {
               this.delegate().write(var1x, var2x);
            }
         }

         private TypeAdapter<T> delegate() {
            TypeAdapter var1x = this.delegate;
            return var1x != null ? var1x : (this.delegate = var1.getDelegateAdapter(Excluder.this, var2));
         }
      };
   }

   public boolean excludeField(Field var1, boolean var2) {
      if ((this.modifiers & var1.getModifiers()) != 0) {
         return true;
      }

      if (this.version != -1.0 && !this.isValidVersion(var1.getAnnotation(Since.class), var1.getAnnotation(Until.class))) {
         return true;
      }

      if (var1.isSynthetic()) {
         return true;
      }

      if (this.requireExpose) {
         Expose var3 = var1.getAnnotation(Expose.class);
         if (var3 == null || (var2 ? !var3.serialize() : !var3.deserialize())) {
            return true;
         }
      }

      if (!this.serializeInnerClasses && this.isInnerClass(var1.getType())) {
         return true;
      }

      if (this.isAnonymousOrLocal(var1.getType())) {
         return true;
      }

      List var7 = var2 ? this.serializationStrategies : this.deserializationStrategies;
      if (!var7.isEmpty()) {
         FieldAttributes var4 = new FieldAttributes(var1);

         for (ExclusionStrategy var6 : var7) {
            if (var6.shouldSkipField(var4)) {
               return true;
            }
         }
      }

      return false;
   }

   public boolean excludeClass(Class<?> var1, boolean var2) {
      if (this.version != -1.0 && !this.isValidVersion(var1.getAnnotation(Since.class), var1.getAnnotation(Until.class))) {
         return true;
      }

      if (!this.serializeInnerClasses && this.isInnerClass(var1)) {
         return true;
      }

      if (this.isAnonymousOrLocal(var1)) {
         return true;
      }

      for (ExclusionStrategy var5 : var2 ? this.serializationStrategies : this.deserializationStrategies) {
         if (var5.shouldSkipClass(var1)) {
            return true;
         }
      }

      return false;
   }

   private boolean isAnonymousOrLocal(Class<?> var1) {
      return !Enum.class.isAssignableFrom(var1) && (var1.isAnonymousClass() || var1.isLocalClass());
   }

   private boolean isInnerClass(Class<?> var1) {
      return var1.isMemberClass() && !this.isStatic(var1);
   }

   private boolean isStatic(Class<?> var1) {
      return (var1.getModifiers() & 8) != 0;
   }

   private boolean isValidVersion(Since var1, Until var2) {
      return this.isValidSince(var1) && this.isValidUntil(var2);
   }

   private boolean isValidSince(Since var1) {
      if (var1 != null) {
         double var2 = var1.value();
         if (var2 > this.version) {
            return false;
         }
      }

      return true;
   }

   private boolean isValidUntil(Until var1) {
      if (var1 != null) {
         double var2 = var1.value();
         if (var2 <= this.version) {
            return false;
         }
      }

      return true;
   }
}
