package com.lunarclient.websocket.cosmetic.v2;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class WeatherCondition extends GeneratedMessageV3 implements WeatherConditionOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int WEATHER_FIELD_NUMBER = 1;
   private int weather_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final WeatherCondition DEFAULT_INSTANCE = new WeatherCondition();
   private static final Parser<WeatherCondition> PARSER = new AbstractParser<WeatherCondition>() {
      public WeatherCondition parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         WeatherCondition.Builder var3 = WeatherCondition.newBuilder();

         try {
            var3.mergeFrom(var1, var2);
         } catch (InvalidProtocolBufferException var5) {
            throw var5.setUnfinishedMessage(var3.buildPartial());
         } catch (UninitializedMessageException var6) {
            throw var6.asInvalidProtocolBufferException().setUnfinishedMessage(var3.buildPartial());
         } catch (IOException var7) {
            throw new InvalidProtocolBufferException(var7).setUnfinishedMessage(var3.buildPartial());
         }

         return var3.buildPartial();
      }
   };

   private WeatherCondition(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private WeatherCondition() {
      this.weather_ = 0;
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new WeatherCondition();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_cosmetic_v2_WeatherCondition_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_cosmetic_v2_WeatherCondition_fieldAccessorTable
         .ensureFieldAccessorsInitialized(WeatherCondition.class, WeatherCondition.Builder.class);
   }

   @Override
   public int getWeatherValue() {
      return this.weather_;
   }

   @Override
   public WeatherCondition.Weather getWeather() {
      WeatherCondition.Weather var1 = WeatherCondition.Weather.forNumber(this.weather_);
      return var1 == null ? WeatherCondition.Weather.UNRECOGNIZED : var1;
   }

   @Override
   public final boolean isInitialized() {
      byte var1 = this.memoizedIsInitialized;
      if (var1 == 1) {
         return true;
      }

      if (var1 == 0) {
         return false;
      }

      this.memoizedIsInitialized = 1;
      return true;
   }

   @Override
   public void writeTo(CodedOutputStream var1) {
      if (this.weather_ != WeatherCondition.Weather.WEATHER_UNSPECIFIED.getNumber()) {
         var1.writeEnum(1, this.weather_);
      }

      this.getUnknownFields().writeTo(var1);
   }

   @Override
   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 != -1) {
         return var1;
      }

      var1 = 0;
      if (this.weather_ != WeatherCondition.Weather.WEATHER_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(1, this.weather_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      }

      if (!(var1 instanceof WeatherCondition)) {
         return super.equals(var1);
      }

      WeatherCondition var2 = (WeatherCondition)var1;
      return this.weather_ != var2.weather_ ? false : this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      var1 = 37 * var1 + 1;
      var1 = 53 * var1 + this.weather_;
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static WeatherCondition parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static WeatherCondition parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static WeatherCondition parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static WeatherCondition parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static WeatherCondition parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static WeatherCondition parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static WeatherCondition parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static WeatherCondition parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static WeatherCondition parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static WeatherCondition parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static WeatherCondition parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static WeatherCondition parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public WeatherCondition.Builder newBuilderForType() {
      return newBuilder();
   }

   public static WeatherCondition.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static WeatherCondition.Builder newBuilder(WeatherCondition var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public WeatherCondition.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new WeatherCondition.Builder() : new WeatherCondition.Builder().mergeFrom(this);
   }

   protected WeatherCondition.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new WeatherCondition.Builder(var1);
   }

   public static WeatherCondition getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<WeatherCondition> parser() {
      return PARSER;
   }

   @Override
   public Parser<WeatherCondition> getParserForType() {
      return PARSER;
   }

   public WeatherCondition getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<WeatherCondition.Builder> implements WeatherConditionOrBuilder {
      private int bitField0_;
      private int weather_ = 0;

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_cosmetic_v2_WeatherCondition_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_cosmetic_v2_WeatherCondition_fieldAccessorTable
            .ensureFieldAccessorsInitialized(WeatherCondition.class, WeatherCondition.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public WeatherCondition.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.weather_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_cosmetic_v2_WeatherCondition_descriptor;
      }

      public WeatherCondition getDefaultInstanceForType() {
         return WeatherCondition.getDefaultInstance();
      }

      public WeatherCondition build() {
         WeatherCondition var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public WeatherCondition buildPartial() {
         WeatherCondition var1 = new WeatherCondition(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(WeatherCondition var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.weather_ = this.weather_;
         }
      }

      public WeatherCondition.Builder clone() {
         return (WeatherCondition.Builder)super.clone();
      }

      public WeatherCondition.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (WeatherCondition.Builder)super.setField(var1, var2);
      }

      public WeatherCondition.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (WeatherCondition.Builder)super.clearField(var1);
      }

      public WeatherCondition.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (WeatherCondition.Builder)super.clearOneof(var1);
      }

      public WeatherCondition.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (WeatherCondition.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public WeatherCondition.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (WeatherCondition.Builder)super.addRepeatedField(var1, var2);
      }

      public WeatherCondition.Builder mergeFrom(Message var1) {
         if (var1 instanceof WeatherCondition) {
            return this.mergeFrom((WeatherCondition)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public WeatherCondition.Builder mergeFrom(WeatherCondition var1) {
         if (var1 == WeatherCondition.getDefaultInstance()) {
            return this;
         }

         if (var1.weather_ != 0) {
            this.setWeatherValue(var1.getWeatherValue());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public WeatherCondition.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         try {
            boolean var3 = false;

            while (!var3) {
               int var4 = var1.readTag();
               switch (var4) {
                  case 0:
                     var3 = true;
                     break;
                  case 8:
                     this.weather_ = var1.readEnum();
                     this.bitField0_ |= 1;
                     break;
                  default:
                     if (!super.parseUnknownField(var1, var2, var4)) {
                        var3 = true;
                     }
               }
            }
         } catch (InvalidProtocolBufferException var8) {
            throw var8.unwrapIOException();
         } finally {
            this.onChanged();
         }

         return this;
      }

      @Override
      public int getWeatherValue() {
         return this.weather_;
      }

      public WeatherCondition.Builder setWeatherValue(int var1) {
         this.weather_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public WeatherCondition.Weather getWeather() {
         WeatherCondition.Weather var1 = WeatherCondition.Weather.forNumber(this.weather_);
         return var1 == null ? WeatherCondition.Weather.UNRECOGNIZED : var1;
      }

      public WeatherCondition.Builder setWeather(WeatherCondition.Weather var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 1;
         this.weather_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public WeatherCondition.Builder clearWeather() {
         this.bitField0_ &= -2;
         this.weather_ = 0;
         this.onChanged();
         return this;
      }

      public final WeatherCondition.Builder setUnknownFields(UnknownFieldSet var1) {
         return (WeatherCondition.Builder)super.setUnknownFields(var1);
      }

      public final WeatherCondition.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (WeatherCondition.Builder)super.mergeUnknownFields(var1);
      }
   }

   public enum Weather implements ProtocolMessageEnum {
      WEATHER_UNSPECIFIED(0),
      WEATHER_RAIN(1),
      WEATHER_SNOW(2),
      WEATHER_THUNDERSTORM(3),
      WEATHER_CLEAR(4),
      UNRECOGNIZED(-1);

      public static final int WEATHER_UNSPECIFIED_VALUE = 0;
      public static final int WEATHER_RAIN_VALUE = 1;
      public static final int WEATHER_SNOW_VALUE = 2;
      public static final int WEATHER_THUNDERSTORM_VALUE = 3;
      public static final int WEATHER_CLEAR_VALUE = 4;
      private static final Internal.EnumLiteMap<WeatherCondition.Weather> internalValueMap = new Internal.EnumLiteMap<WeatherCondition.Weather>() {
         public WeatherCondition.Weather findValueByNumber(int var1) {
            return WeatherCondition.Weather.forNumber(var1);
         }
      };
      private static final WeatherCondition.Weather[] VALUES = values();
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
      public static WeatherCondition.Weather valueOf(int var0) {
         return forNumber(var0);
      }

      public static WeatherCondition.Weather forNumber(int var0) {
         switch (var0) {
            case 0:
               return WEATHER_UNSPECIFIED;
            case 1:
               return WEATHER_RAIN;
            case 2:
               return WEATHER_SNOW;
            case 3:
               return WEATHER_THUNDERSTORM;
            case 4:
               return WEATHER_CLEAR;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<WeatherCondition.Weather> internalGetValueMap() {
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
         return WeatherCondition.getDescriptor().getEnumTypes().get(0);
      }

      public static WeatherCondition.Weather valueOf(Descriptors.EnumValueDescriptor var0) {
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
}
