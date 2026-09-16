package com.lunarclient.websocket.screenshot.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;

public enum Weather implements ProtocolMessageEnum {
   WEATHER_UNSPECIFIED(0),
   WEATHER_CLEAR(1),
   WEATHER_RAIN(2),
   WEATHER_SNOW(3),
   WEATHER_THUNDER(4),
   UNRECOGNIZED(-1);

   public static final int WEATHER_UNSPECIFIED_VALUE = 0;
   public static final int WEATHER_CLEAR_VALUE = 1;
   public static final int WEATHER_RAIN_VALUE = 2;
   public static final int WEATHER_SNOW_VALUE = 3;
   public static final int WEATHER_THUNDER_VALUE = 4;
   private static final Internal.EnumLiteMap<Weather> internalValueMap = new Internal.EnumLiteMap<Weather>() {
      public Weather findValueByNumber(int var1) {
         return Weather.forNumber(var1);
      }
   };
   private static final Weather[] VALUES = values();
   private final int value;

   @Override
   public final int getNumber() {
      if (this == UNRECOGNIZED) {
         throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
      } else {
         return this.value;
      }
   }

   @Deprecated
   public static Weather valueOf(int var0) {
      return forNumber(var0);
   }

   public static Weather forNumber(int var0) {
      switch (var0) {
         case 0:
            return WEATHER_UNSPECIFIED;
         case 1:
            return WEATHER_CLEAR;
         case 2:
            return WEATHER_RAIN;
         case 3:
            return WEATHER_SNOW;
         case 4:
            return WEATHER_THUNDER;
         default:
            return null;
      }
   }

   public static Internal.EnumLiteMap<Weather> internalGetValueMap() {
      return internalValueMap;
   }

   @Override
   public final Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
         throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
      } else {
         return getDescriptor().getValues().get(this.ordinal());
      }
   }

   @Override
   public final Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
   }

   public static final Descriptors.EnumDescriptor getDescriptor() {
      return CommonProto.getDescriptor().getEnumTypes().get(2);
   }

   public static Weather valueOf(Descriptors.EnumValueDescriptor var0) {
      if (var0.getType() != getDescriptor()) {
         throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
      } else {
         return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
      }
   }

   Weather(int var3) {
      this.value = var3;
   }
}
