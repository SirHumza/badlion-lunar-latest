package com.lunarclient.apollo.network;

import com.google.protobuf.ListValue;
import com.google.protobuf.NullValue;
import com.google.protobuf.Value;
import com.lunarclient.apollo.ApolloManager;
import com.lunarclient.apollo.configurable.v1.ConfigurableSettings;
import com.lunarclient.apollo.configurable.v1.OverrideConfigurableSettingsMessage;
import com.lunarclient.apollo.module.ApolloModule;
import com.lunarclient.apollo.option.Option;
import com.lunarclient.apollo.option.Options;
import com.lunarclient.apollo.recipients.Recipients;
import io.leangen.geantyref.GenericTypeReflector;
import java.awt.Color;
import java.lang.reflect.AnnotatedParameterizedType;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.jetbrains.annotations.Nullable;

public final class NetworkOptions {
   public static void sendOption(@Nullable ApolloModule var0, Option<?, ?, ?> var1, Value var2, Recipients var3) {
      if (var1.isNotify()) {
         OverrideConfigurableSettingsMessage.Builder var4 = OverrideConfigurableSettingsMessage.newBuilder();
         ConfigurableSettings.Builder var5 = module(var0);
         var5.putProperties(var1.getKey(), var2);
         var4.addConfigurableSettings(var5.build());
         ApolloManager.getNetworkManager().sendPacket(var3, var4.build());
      }
   }

   public static void sendOptions(Iterable<ApolloModule> var0, boolean var1, Recipients var2) {
      OverrideConfigurableSettingsMessage.Builder var3 = OverrideConfigurableSettingsMessage.newBuilder();

      for (ApolloModule var5 : var0) {
         var3.addConfigurableSettings(moduleWithOptions(var5, var1).build());
      }

      ApolloManager.getNetworkManager().sendPacket(var2, var3.build());
   }

   public static Value wrapValue(Value.Builder var0, Type var1, @Nullable Object var2) {
      if (var2 == null) {
         return var0.setNullValue(NullValue.NULL_VALUE).build();
      }

      Type var3 = GenericTypeReflector.box(var1);
      Class var4 = GenericTypeReflector.erase(var3);
      if (var4.isEnum()) {
         return var0.setStringValue(((Enum)var2).name()).build();
      }

      if (Number.class.isAssignableFrom(var4)) {
         return var0.setNumberValue(((Number)var2).doubleValue()).build();
      }

      if (String.class.isAssignableFrom(var4)) {
         return var0.setStringValue((String)var2).build();
      }

      if (Boolean.class.isAssignableFrom(var4)) {
         return var0.setBoolValue((Boolean)var2).build();
      }

      if (!List.class.isAssignableFrom(var4)) {
         if (Color.class.isAssignableFrom(var4)) {
            if (var2 instanceof String) {
               String var11 = (String)var2;
               return var0.setStringValue(var11).build();
            } else if (var2 instanceof Color) {
               Color var10 = (Color)var2;
               return var0.setStringValue(Integer.toHexString(var10.getRGB())).build();
            } else if (var2 instanceof Integer) {
               int var9 = (Integer)var2;
               return var0.setStringValue(Integer.toHexString(var9)).build();
            } else {
               throw new RuntimeException("Unable to wrap Color value of type '" + var4.getSimpleName() + "'!");
            }
         } else {
            throw new RuntimeException("Unable to wrap value of type '" + var4.getSimpleName() + "'!");
         }
      } else {
         AnnotatedType var5 = elementType(var3);
         ListValue.Builder var6 = ListValue.newBuilder();

         for (Object var8 : (List)var2) {
            var6.addValues(wrapValue(Value.newBuilder(), var5.getType(), var8));
         }

         return var0.setListValue(var6.build()).build();
      }
   }

   @Nullable
   public static Object unwrapValue(Value var0, Type var1) {
      if (var0.hasNullValue()) {
         return null;
      }

      Type var2 = GenericTypeReflector.box(var1);
      Class var3 = GenericTypeReflector.erase(var2);
      if (var3.isEnum() && var0.hasStringValue()) {
         return Enum.valueOf(var3, var0.getStringValue());
      }

      if (Number.class.isAssignableFrom(var3) && var0.hasNumberValue()) {
         return var0.getNumberValue();
      }

      if (String.class.isAssignableFrom(var3) && var0.hasStringValue()) {
         return var0.getStringValue();
      }

      if (Boolean.class.isAssignableFrom(var3) && var0.hasBoolValue()) {
         return var0.getBoolValue();
      }

      if (List.class.isAssignableFrom(var3) && var0.hasListValue()) {
         AnnotatedType var4 = elementType(var2);
         ListValue var5 = var0.getListValue();
         ArrayList var6 = new ArrayList(var5.getValuesCount());

         for (int var7 = 0; var7 < var5.getValuesCount(); var7++) {
            var6.add(unwrapValue(var5.getValues(var7), var4.getType()));
         }

         return Collections.unmodifiableList(var6);
      } else if (Color.class.isAssignableFrom(var3) && var0.hasStringValue()) {
         return var0.getStringValue();
      } else {
         throw new RuntimeException("Unable to unwrap value of type '" + var3.getSimpleName() + "'!");
      }
   }

   private static ConfigurableSettings.Builder moduleWithOptions(ApolloModule var0, boolean var1) {
      ConfigurableSettings.Builder var2 = module(var0);
      Options var3 = var0.getOptions();

      for (Option var5 : var3) {
         if (var5.isNotify()) {
            Value.Builder var6 = Value.newBuilder();
            Object var7 = var3.get(var5);
            if (var7 != null || !var1) {
               Value var8 = wrapValue(var6, var5.getTypeToken().getType(), var7);
               var2.putProperties(var5.getKey(), var8);
            }
         }
      }

      return var2;
   }

   private static AnnotatedType elementType(Type var0) {
      AnnotatedType var1 = GenericTypeReflector.annotate(var0);
      if (!(var1 instanceof AnnotatedParameterizedType)) {
         throw new RuntimeException("Raw types for lists are not supported!");
      } else {
         return ((AnnotatedParameterizedType)var1).getAnnotatedActualTypeArguments()[0];
      }
   }

   private static ConfigurableSettings.Builder module(@Nullable ApolloModule var0) {
      return ConfigurableSettings.newBuilder().setApolloModule(var0 == null ? "apollo" : var0.getId()).setEnable(var0 == null || var0.isEnabled());
   }

   private NetworkOptions() {
   }
}
