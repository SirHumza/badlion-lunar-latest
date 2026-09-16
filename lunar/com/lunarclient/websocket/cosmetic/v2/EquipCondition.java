package com.lunarclient.websocket.cosmetic.v2;

import com.google.protobuf.AbstractMessageLite;
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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class EquipCondition extends GeneratedMessageV3 implements EquipConditionOrBuilder {
   private static final long serialVersionUID = 0L;
   private int conditionCase_ = 0;
   private Object condition_;
   public static final int DIMENSION_FIELD_NUMBER = 1;
   public static final int WEATHER_FIELD_NUMBER = 2;
   public static final int BIOME_TEMPERATURE_FIELD_NUMBER = 3;
   public static final int PASSENGER_OF_ENTITY_FIELD_NUMBER = 4;
   public static final int MOVEMENT_STATE_FIELD_NUMBER = 5;
   public static final int IN_LIQUID_FIELD_NUMBER = 6;
   public static final int RADIO_PLAYING_FIELD_NUMBER = 7;
   public static final int ON_FIRE_FIELD_NUMBER = 8;
   public static final int SERVER_FIELD_NUMBER = 9;
   public static final int TIME_FIELD_NUMBER = 10;
   private byte memoizedIsInitialized = -1;
   private static final EquipCondition DEFAULT_INSTANCE = new EquipCondition();
   private static final Parser<EquipCondition> PARSER = new AbstractParser<EquipCondition>() {
      public EquipCondition parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         EquipCondition.Builder var3 = EquipCondition.newBuilder();

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

   private EquipCondition(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private EquipCondition() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new EquipCondition();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_cosmetic_v2_EquipCondition_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_cosmetic_v2_EquipCondition_fieldAccessorTable
         .ensureFieldAccessorsInitialized(EquipCondition.class, EquipCondition.Builder.class);
   }

   @Override
   public EquipCondition.ConditionCase getConditionCase() {
      return EquipCondition.ConditionCase.forNumber(this.conditionCase_);
   }

   @Override
   public boolean hasDimension() {
      return this.conditionCase_ == 1;
   }

   @Override
   public DimensionCondition getDimension() {
      return this.conditionCase_ == 1 ? (DimensionCondition)this.condition_ : DimensionCondition.getDefaultInstance();
   }

   @Override
   public DimensionConditionOrBuilder getDimensionOrBuilder() {
      return this.conditionCase_ == 1 ? (DimensionCondition)this.condition_ : DimensionCondition.getDefaultInstance();
   }

   @Override
   public boolean hasWeather() {
      return this.conditionCase_ == 2;
   }

   @Override
   public WeatherCondition getWeather() {
      return this.conditionCase_ == 2 ? (WeatherCondition)this.condition_ : WeatherCondition.getDefaultInstance();
   }

   @Override
   public WeatherConditionOrBuilder getWeatherOrBuilder() {
      return this.conditionCase_ == 2 ? (WeatherCondition)this.condition_ : WeatherCondition.getDefaultInstance();
   }

   @Override
   public boolean hasBiomeTemperature() {
      return this.conditionCase_ == 3;
   }

   @Override
   public BiomeTemperatureCondition getBiomeTemperature() {
      return this.conditionCase_ == 3 ? (BiomeTemperatureCondition)this.condition_ : BiomeTemperatureCondition.getDefaultInstance();
   }

   @Override
   public BiomeTemperatureConditionOrBuilder getBiomeTemperatureOrBuilder() {
      return this.conditionCase_ == 3 ? (BiomeTemperatureCondition)this.condition_ : BiomeTemperatureCondition.getDefaultInstance();
   }

   @Override
   public boolean hasPassengerOfEntity() {
      return this.conditionCase_ == 4;
   }

   @Override
   public PassengerOfEntityCondition getPassengerOfEntity() {
      return this.conditionCase_ == 4 ? (PassengerOfEntityCondition)this.condition_ : PassengerOfEntityCondition.getDefaultInstance();
   }

   @Override
   public PassengerOfEntityConditionOrBuilder getPassengerOfEntityOrBuilder() {
      return this.conditionCase_ == 4 ? (PassengerOfEntityCondition)this.condition_ : PassengerOfEntityCondition.getDefaultInstance();
   }

   @Override
   public boolean hasMovementState() {
      return this.conditionCase_ == 5;
   }

   @Override
   public MovementStateCondition getMovementState() {
      return this.conditionCase_ == 5 ? (MovementStateCondition)this.condition_ : MovementStateCondition.getDefaultInstance();
   }

   @Override
   public MovementStateConditionOrBuilder getMovementStateOrBuilder() {
      return this.conditionCase_ == 5 ? (MovementStateCondition)this.condition_ : MovementStateCondition.getDefaultInstance();
   }

   @Override
   public boolean hasInLiquid() {
      return this.conditionCase_ == 6;
   }

   @Override
   public InLiquidCondition getInLiquid() {
      return this.conditionCase_ == 6 ? (InLiquidCondition)this.condition_ : InLiquidCondition.getDefaultInstance();
   }

   @Override
   public InLiquidConditionOrBuilder getInLiquidOrBuilder() {
      return this.conditionCase_ == 6 ? (InLiquidCondition)this.condition_ : InLiquidCondition.getDefaultInstance();
   }

   @Override
   public boolean hasRadioPlaying() {
      return this.conditionCase_ == 7;
   }

   @Override
   public RadioPlayingCondition getRadioPlaying() {
      return this.conditionCase_ == 7 ? (RadioPlayingCondition)this.condition_ : RadioPlayingCondition.getDefaultInstance();
   }

   @Override
   public RadioPlayingConditionOrBuilder getRadioPlayingOrBuilder() {
      return this.conditionCase_ == 7 ? (RadioPlayingCondition)this.condition_ : RadioPlayingCondition.getDefaultInstance();
   }

   @Override
   public boolean hasOnFire() {
      return this.conditionCase_ == 8;
   }

   @Override
   public OnFireCondition getOnFire() {
      return this.conditionCase_ == 8 ? (OnFireCondition)this.condition_ : OnFireCondition.getDefaultInstance();
   }

   @Override
   public OnFireConditionOrBuilder getOnFireOrBuilder() {
      return this.conditionCase_ == 8 ? (OnFireCondition)this.condition_ : OnFireCondition.getDefaultInstance();
   }

   @Override
   public boolean hasServer() {
      return this.conditionCase_ == 9;
   }

   @Override
   public ServerCondition getServer() {
      return this.conditionCase_ == 9 ? (ServerCondition)this.condition_ : ServerCondition.getDefaultInstance();
   }

   @Override
   public ServerConditionOrBuilder getServerOrBuilder() {
      return this.conditionCase_ == 9 ? (ServerCondition)this.condition_ : ServerCondition.getDefaultInstance();
   }

   @Override
   public boolean hasTime() {
      return this.conditionCase_ == 10;
   }

   @Override
   public TimeCondition getTime() {
      return this.conditionCase_ == 10 ? (TimeCondition)this.condition_ : TimeCondition.getDefaultInstance();
   }

   @Override
   public TimeConditionOrBuilder getTimeOrBuilder() {
      return this.conditionCase_ == 10 ? (TimeCondition)this.condition_ : TimeCondition.getDefaultInstance();
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
      if (this.conditionCase_ == 1) {
         var1.writeMessage(1, (DimensionCondition)this.condition_);
      }

      if (this.conditionCase_ == 2) {
         var1.writeMessage(2, (WeatherCondition)this.condition_);
      }

      if (this.conditionCase_ == 3) {
         var1.writeMessage(3, (BiomeTemperatureCondition)this.condition_);
      }

      if (this.conditionCase_ == 4) {
         var1.writeMessage(4, (PassengerOfEntityCondition)this.condition_);
      }

      if (this.conditionCase_ == 5) {
         var1.writeMessage(5, (MovementStateCondition)this.condition_);
      }

      if (this.conditionCase_ == 6) {
         var1.writeMessage(6, (InLiquidCondition)this.condition_);
      }

      if (this.conditionCase_ == 7) {
         var1.writeMessage(7, (RadioPlayingCondition)this.condition_);
      }

      if (this.conditionCase_ == 8) {
         var1.writeMessage(8, (OnFireCondition)this.condition_);
      }

      if (this.conditionCase_ == 9) {
         var1.writeMessage(9, (ServerCondition)this.condition_);
      }

      if (this.conditionCase_ == 10) {
         var1.writeMessage(10, (TimeCondition)this.condition_);
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
      if (this.conditionCase_ == 1) {
         var1 += CodedOutputStream.computeMessageSize(1, (DimensionCondition)this.condition_);
      }

      if (this.conditionCase_ == 2) {
         var1 += CodedOutputStream.computeMessageSize(2, (WeatherCondition)this.condition_);
      }

      if (this.conditionCase_ == 3) {
         var1 += CodedOutputStream.computeMessageSize(3, (BiomeTemperatureCondition)this.condition_);
      }

      if (this.conditionCase_ == 4) {
         var1 += CodedOutputStream.computeMessageSize(4, (PassengerOfEntityCondition)this.condition_);
      }

      if (this.conditionCase_ == 5) {
         var1 += CodedOutputStream.computeMessageSize(5, (MovementStateCondition)this.condition_);
      }

      if (this.conditionCase_ == 6) {
         var1 += CodedOutputStream.computeMessageSize(6, (InLiquidCondition)this.condition_);
      }

      if (this.conditionCase_ == 7) {
         var1 += CodedOutputStream.computeMessageSize(7, (RadioPlayingCondition)this.condition_);
      }

      if (this.conditionCase_ == 8) {
         var1 += CodedOutputStream.computeMessageSize(8, (OnFireCondition)this.condition_);
      }

      if (this.conditionCase_ == 9) {
         var1 += CodedOutputStream.computeMessageSize(9, (ServerCondition)this.condition_);
      }

      if (this.conditionCase_ == 10) {
         var1 += CodedOutputStream.computeMessageSize(10, (TimeCondition)this.condition_);
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

      if (!(var1 instanceof EquipCondition)) {
         return super.equals(var1);
      }

      EquipCondition var2 = (EquipCondition)var1;
      if (!this.getConditionCase().equals(var2.getConditionCase())) {
         return false;
      }

      switch (this.conditionCase_) {
         case 0:
         default:
            break;
         case 1:
            if (!this.getDimension().equals(var2.getDimension())) {
               return false;
            }
            break;
         case 2:
            if (!this.getWeather().equals(var2.getWeather())) {
               return false;
            }
            break;
         case 3:
            if (!this.getBiomeTemperature().equals(var2.getBiomeTemperature())) {
               return false;
            }
            break;
         case 4:
            if (!this.getPassengerOfEntity().equals(var2.getPassengerOfEntity())) {
               return false;
            }
            break;
         case 5:
            if (!this.getMovementState().equals(var2.getMovementState())) {
               return false;
            }
            break;
         case 6:
            if (!this.getInLiquid().equals(var2.getInLiquid())) {
               return false;
            }
            break;
         case 7:
            if (!this.getRadioPlaying().equals(var2.getRadioPlaying())) {
               return false;
            }
            break;
         case 8:
            if (!this.getOnFire().equals(var2.getOnFire())) {
               return false;
            }
            break;
         case 9:
            if (!this.getServer().equals(var2.getServer())) {
               return false;
            }
            break;
         case 10:
            if (!this.getTime().equals(var2.getTime())) {
               return false;
            }
      }

      return this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      switch (this.conditionCase_) {
         case 0:
         default:
            break;
         case 1:
            var1 = 37 * var1 + 1;
            var1 = 53 * var1 + this.getDimension().hashCode();
            break;
         case 2:
            var1 = 37 * var1 + 2;
            var1 = 53 * var1 + this.getWeather().hashCode();
            break;
         case 3:
            var1 = 37 * var1 + 3;
            var1 = 53 * var1 + this.getBiomeTemperature().hashCode();
            break;
         case 4:
            var1 = 37 * var1 + 4;
            var1 = 53 * var1 + this.getPassengerOfEntity().hashCode();
            break;
         case 5:
            var1 = 37 * var1 + 5;
            var1 = 53 * var1 + this.getMovementState().hashCode();
            break;
         case 6:
            var1 = 37 * var1 + 6;
            var1 = 53 * var1 + this.getInLiquid().hashCode();
            break;
         case 7:
            var1 = 37 * var1 + 7;
            var1 = 53 * var1 + this.getRadioPlaying().hashCode();
            break;
         case 8:
            var1 = 37 * var1 + 8;
            var1 = 53 * var1 + this.getOnFire().hashCode();
            break;
         case 9:
            var1 = 37 * var1 + 9;
            var1 = 53 * var1 + this.getServer().hashCode();
            break;
         case 10:
            var1 = 37 * var1 + 10;
            var1 = 53 * var1 + this.getTime().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static EquipCondition parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static EquipCondition parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static EquipCondition parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static EquipCondition parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static EquipCondition parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static EquipCondition parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static EquipCondition parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static EquipCondition parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static EquipCondition parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static EquipCondition parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static EquipCondition parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static EquipCondition parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public EquipCondition.Builder newBuilderForType() {
      return newBuilder();
   }

   public static EquipCondition.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static EquipCondition.Builder newBuilder(EquipCondition var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public EquipCondition.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new EquipCondition.Builder() : new EquipCondition.Builder().mergeFrom(this);
   }

   protected EquipCondition.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new EquipCondition.Builder(var1);
   }

   public static EquipCondition getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<EquipCondition> parser() {
      return PARSER;
   }

   @Override
   public Parser<EquipCondition> getParserForType() {
      return PARSER;
   }

   public EquipCondition getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<EquipCondition.Builder> implements EquipConditionOrBuilder {
      private int conditionCase_ = 0;
      private Object condition_;
      private int bitField0_;
      private SingleFieldBuilderV3<DimensionCondition, DimensionCondition.Builder, DimensionConditionOrBuilder> dimensionBuilder_;
      private SingleFieldBuilderV3<WeatherCondition, WeatherCondition.Builder, WeatherConditionOrBuilder> weatherBuilder_;
      private SingleFieldBuilderV3<BiomeTemperatureCondition, BiomeTemperatureCondition.Builder, BiomeTemperatureConditionOrBuilder> biomeTemperatureBuilder_;
      private SingleFieldBuilderV3<PassengerOfEntityCondition, PassengerOfEntityCondition.Builder, PassengerOfEntityConditionOrBuilder> passengerOfEntityBuilder_;
      private SingleFieldBuilderV3<MovementStateCondition, MovementStateCondition.Builder, MovementStateConditionOrBuilder> movementStateBuilder_;
      private SingleFieldBuilderV3<InLiquidCondition, InLiquidCondition.Builder, InLiquidConditionOrBuilder> inLiquidBuilder_;
      private SingleFieldBuilderV3<RadioPlayingCondition, RadioPlayingCondition.Builder, RadioPlayingConditionOrBuilder> radioPlayingBuilder_;
      private SingleFieldBuilderV3<OnFireCondition, OnFireCondition.Builder, OnFireConditionOrBuilder> onFireBuilder_;
      private SingleFieldBuilderV3<ServerCondition, ServerCondition.Builder, ServerConditionOrBuilder> serverBuilder_;
      private SingleFieldBuilderV3<TimeCondition, TimeCondition.Builder, TimeConditionOrBuilder> timeBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_cosmetic_v2_EquipCondition_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_cosmetic_v2_EquipCondition_fieldAccessorTable
            .ensureFieldAccessorsInitialized(EquipCondition.class, EquipCondition.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public EquipCondition.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         if (this.dimensionBuilder_ != null) {
            this.dimensionBuilder_.clear();
         }

         if (this.weatherBuilder_ != null) {
            this.weatherBuilder_.clear();
         }

         if (this.biomeTemperatureBuilder_ != null) {
            this.biomeTemperatureBuilder_.clear();
         }

         if (this.passengerOfEntityBuilder_ != null) {
            this.passengerOfEntityBuilder_.clear();
         }

         if (this.movementStateBuilder_ != null) {
            this.movementStateBuilder_.clear();
         }

         if (this.inLiquidBuilder_ != null) {
            this.inLiquidBuilder_.clear();
         }

         if (this.radioPlayingBuilder_ != null) {
            this.radioPlayingBuilder_.clear();
         }

         if (this.onFireBuilder_ != null) {
            this.onFireBuilder_.clear();
         }

         if (this.serverBuilder_ != null) {
            this.serverBuilder_.clear();
         }

         if (this.timeBuilder_ != null) {
            this.timeBuilder_.clear();
         }

         this.conditionCase_ = 0;
         this.condition_ = null;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_cosmetic_v2_EquipCondition_descriptor;
      }

      public EquipCondition getDefaultInstanceForType() {
         return EquipCondition.getDefaultInstance();
      }

      public EquipCondition build() {
         EquipCondition var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public EquipCondition buildPartial() {
         EquipCondition var1 = new EquipCondition(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.buildPartialOneofs(var1);
         this.onBuilt();
         return var1;
      }

      private void buildPartial0(EquipCondition var1) {
         int var2 = this.bitField0_;
      }

      private void buildPartialOneofs(EquipCondition var1) {
         var1.conditionCase_ = this.conditionCase_;
         var1.condition_ = this.condition_;
         if (this.conditionCase_ == 1 && this.dimensionBuilder_ != null) {
            var1.condition_ = this.dimensionBuilder_.build();
         }

         if (this.conditionCase_ == 2 && this.weatherBuilder_ != null) {
            var1.condition_ = this.weatherBuilder_.build();
         }

         if (this.conditionCase_ == 3 && this.biomeTemperatureBuilder_ != null) {
            var1.condition_ = this.biomeTemperatureBuilder_.build();
         }

         if (this.conditionCase_ == 4 && this.passengerOfEntityBuilder_ != null) {
            var1.condition_ = this.passengerOfEntityBuilder_.build();
         }

         if (this.conditionCase_ == 5 && this.movementStateBuilder_ != null) {
            var1.condition_ = this.movementStateBuilder_.build();
         }

         if (this.conditionCase_ == 6 && this.inLiquidBuilder_ != null) {
            var1.condition_ = this.inLiquidBuilder_.build();
         }

         if (this.conditionCase_ == 7 && this.radioPlayingBuilder_ != null) {
            var1.condition_ = this.radioPlayingBuilder_.build();
         }

         if (this.conditionCase_ == 8 && this.onFireBuilder_ != null) {
            var1.condition_ = this.onFireBuilder_.build();
         }

         if (this.conditionCase_ == 9 && this.serverBuilder_ != null) {
            var1.condition_ = this.serverBuilder_.build();
         }

         if (this.conditionCase_ == 10 && this.timeBuilder_ != null) {
            var1.condition_ = this.timeBuilder_.build();
         }
      }

      public EquipCondition.Builder clone() {
         return (EquipCondition.Builder)super.clone();
      }

      public EquipCondition.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (EquipCondition.Builder)super.setField(var1, var2);
      }

      public EquipCondition.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (EquipCondition.Builder)super.clearField(var1);
      }

      public EquipCondition.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (EquipCondition.Builder)super.clearOneof(var1);
      }

      public EquipCondition.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (EquipCondition.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public EquipCondition.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (EquipCondition.Builder)super.addRepeatedField(var1, var2);
      }

      public EquipCondition.Builder mergeFrom(Message var1) {
         if (var1 instanceof EquipCondition) {
            return this.mergeFrom((EquipCondition)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public EquipCondition.Builder mergeFrom(EquipCondition var1) {
         if (var1 == EquipCondition.getDefaultInstance()) {
            return this;
         }

         switch (var1.getConditionCase()) {
            case DIMENSION:
               this.mergeDimension(var1.getDimension());
               break;
            case WEATHER:
               this.mergeWeather(var1.getWeather());
               break;
            case BIOME_TEMPERATURE:
               this.mergeBiomeTemperature(var1.getBiomeTemperature());
               break;
            case PASSENGER_OF_ENTITY:
               this.mergePassengerOfEntity(var1.getPassengerOfEntity());
               break;
            case MOVEMENT_STATE:
               this.mergeMovementState(var1.getMovementState());
               break;
            case IN_LIQUID:
               this.mergeInLiquid(var1.getInLiquid());
               break;
            case RADIO_PLAYING:
               this.mergeRadioPlaying(var1.getRadioPlaying());
               break;
            case ON_FIRE:
               this.mergeOnFire(var1.getOnFire());
               break;
            case SERVER:
               this.mergeServer(var1.getServer());
               break;
            case TIME:
               this.mergeTime(var1.getTime());
            case CONDITION_NOT_SET:
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public EquipCondition.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                  case 10:
                     var1.readMessage(this.getDimensionFieldBuilder().getBuilder(), var2);
                     this.conditionCase_ = 1;
                     break;
                  case 18:
                     var1.readMessage(this.getWeatherFieldBuilder().getBuilder(), var2);
                     this.conditionCase_ = 2;
                     break;
                  case 26:
                     var1.readMessage(this.getBiomeTemperatureFieldBuilder().getBuilder(), var2);
                     this.conditionCase_ = 3;
                     break;
                  case 34:
                     var1.readMessage(this.getPassengerOfEntityFieldBuilder().getBuilder(), var2);
                     this.conditionCase_ = 4;
                     break;
                  case 42:
                     var1.readMessage(this.getMovementStateFieldBuilder().getBuilder(), var2);
                     this.conditionCase_ = 5;
                     break;
                  case 50:
                     var1.readMessage(this.getInLiquidFieldBuilder().getBuilder(), var2);
                     this.conditionCase_ = 6;
                     break;
                  case 58:
                     var1.readMessage(this.getRadioPlayingFieldBuilder().getBuilder(), var2);
                     this.conditionCase_ = 7;
                     break;
                  case 66:
                     var1.readMessage(this.getOnFireFieldBuilder().getBuilder(), var2);
                     this.conditionCase_ = 8;
                     break;
                  case 74:
                     var1.readMessage(this.getServerFieldBuilder().getBuilder(), var2);
                     this.conditionCase_ = 9;
                     break;
                  case 82:
                     var1.readMessage(this.getTimeFieldBuilder().getBuilder(), var2);
                     this.conditionCase_ = 10;
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
      public EquipCondition.ConditionCase getConditionCase() {
         return EquipCondition.ConditionCase.forNumber(this.conditionCase_);
      }

      public EquipCondition.Builder clearCondition() {
         this.conditionCase_ = 0;
         this.condition_ = null;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasDimension() {
         return this.conditionCase_ == 1;
      }

      @Override
      public DimensionCondition getDimension() {
         if (this.dimensionBuilder_ == null) {
            return this.conditionCase_ == 1 ? (DimensionCondition)this.condition_ : DimensionCondition.getDefaultInstance();
         } else {
            return this.conditionCase_ == 1 ? this.dimensionBuilder_.getMessage() : DimensionCondition.getDefaultInstance();
         }
      }

      public EquipCondition.Builder setDimension(DimensionCondition var1) {
         if (this.dimensionBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.condition_ = var1;
            this.onChanged();
         } else {
            this.dimensionBuilder_.setMessage(var1);
         }

         this.conditionCase_ = 1;
         return this;
      }

      public EquipCondition.Builder setDimension(DimensionCondition.Builder var1) {
         if (this.dimensionBuilder_ == null) {
            this.condition_ = var1.build();
            this.onChanged();
         } else {
            this.dimensionBuilder_.setMessage(var1.build());
         }

         this.conditionCase_ = 1;
         return this;
      }

      public EquipCondition.Builder mergeDimension(DimensionCondition var1) {
         if (this.dimensionBuilder_ == null) {
            if (this.conditionCase_ == 1 && this.condition_ != DimensionCondition.getDefaultInstance()) {
               this.condition_ = DimensionCondition.newBuilder((DimensionCondition)this.condition_).mergeFrom(var1).buildPartial();
            } else {
               this.condition_ = var1;
            }

            this.onChanged();
         } else if (this.conditionCase_ == 1) {
            this.dimensionBuilder_.mergeFrom(var1);
         } else {
            this.dimensionBuilder_.setMessage(var1);
         }

         this.conditionCase_ = 1;
         return this;
      }

      public EquipCondition.Builder clearDimension() {
         if (this.dimensionBuilder_ == null) {
            if (this.conditionCase_ == 1) {
               this.conditionCase_ = 0;
               this.condition_ = null;
               this.onChanged();
            }
         } else {
            if (this.conditionCase_ == 1) {
               this.conditionCase_ = 0;
               this.condition_ = null;
            }

            this.dimensionBuilder_.clear();
         }

         return this;
      }

      public DimensionCondition.Builder getDimensionBuilder() {
         return this.getDimensionFieldBuilder().getBuilder();
      }

      @Override
      public DimensionConditionOrBuilder getDimensionOrBuilder() {
         if (this.conditionCase_ == 1 && this.dimensionBuilder_ != null) {
            return this.dimensionBuilder_.getMessageOrBuilder();
         } else {
            return this.conditionCase_ == 1 ? (DimensionCondition)this.condition_ : DimensionCondition.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<DimensionCondition, DimensionCondition.Builder, DimensionConditionOrBuilder> getDimensionFieldBuilder() {
         if (this.dimensionBuilder_ == null) {
            if (this.conditionCase_ != 1) {
               this.condition_ = DimensionCondition.getDefaultInstance();
            }

            this.dimensionBuilder_ = new SingleFieldBuilderV3<>((DimensionCondition)this.condition_, this.getParentForChildren(), this.isClean());
            this.condition_ = null;
         }

         this.conditionCase_ = 1;
         this.onChanged();
         return this.dimensionBuilder_;
      }

      @Override
      public boolean hasWeather() {
         return this.conditionCase_ == 2;
      }

      @Override
      public WeatherCondition getWeather() {
         if (this.weatherBuilder_ == null) {
            return this.conditionCase_ == 2 ? (WeatherCondition)this.condition_ : WeatherCondition.getDefaultInstance();
         } else {
            return this.conditionCase_ == 2 ? this.weatherBuilder_.getMessage() : WeatherCondition.getDefaultInstance();
         }
      }

      public EquipCondition.Builder setWeather(WeatherCondition var1) {
         if (this.weatherBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.condition_ = var1;
            this.onChanged();
         } else {
            this.weatherBuilder_.setMessage(var1);
         }

         this.conditionCase_ = 2;
         return this;
      }

      public EquipCondition.Builder setWeather(WeatherCondition.Builder var1) {
         if (this.weatherBuilder_ == null) {
            this.condition_ = var1.build();
            this.onChanged();
         } else {
            this.weatherBuilder_.setMessage(var1.build());
         }

         this.conditionCase_ = 2;
         return this;
      }

      public EquipCondition.Builder mergeWeather(WeatherCondition var1) {
         if (this.weatherBuilder_ == null) {
            if (this.conditionCase_ == 2 && this.condition_ != WeatherCondition.getDefaultInstance()) {
               this.condition_ = WeatherCondition.newBuilder((WeatherCondition)this.condition_).mergeFrom(var1).buildPartial();
            } else {
               this.condition_ = var1;
            }

            this.onChanged();
         } else if (this.conditionCase_ == 2) {
            this.weatherBuilder_.mergeFrom(var1);
         } else {
            this.weatherBuilder_.setMessage(var1);
         }

         this.conditionCase_ = 2;
         return this;
      }

      public EquipCondition.Builder clearWeather() {
         if (this.weatherBuilder_ == null) {
            if (this.conditionCase_ == 2) {
               this.conditionCase_ = 0;
               this.condition_ = null;
               this.onChanged();
            }
         } else {
            if (this.conditionCase_ == 2) {
               this.conditionCase_ = 0;
               this.condition_ = null;
            }

            this.weatherBuilder_.clear();
         }

         return this;
      }

      public WeatherCondition.Builder getWeatherBuilder() {
         return this.getWeatherFieldBuilder().getBuilder();
      }

      @Override
      public WeatherConditionOrBuilder getWeatherOrBuilder() {
         if (this.conditionCase_ == 2 && this.weatherBuilder_ != null) {
            return this.weatherBuilder_.getMessageOrBuilder();
         } else {
            return this.conditionCase_ == 2 ? (WeatherCondition)this.condition_ : WeatherCondition.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<WeatherCondition, WeatherCondition.Builder, WeatherConditionOrBuilder> getWeatherFieldBuilder() {
         if (this.weatherBuilder_ == null) {
            if (this.conditionCase_ != 2) {
               this.condition_ = WeatherCondition.getDefaultInstance();
            }

            this.weatherBuilder_ = new SingleFieldBuilderV3<>((WeatherCondition)this.condition_, this.getParentForChildren(), this.isClean());
            this.condition_ = null;
         }

         this.conditionCase_ = 2;
         this.onChanged();
         return this.weatherBuilder_;
      }

      @Override
      public boolean hasBiomeTemperature() {
         return this.conditionCase_ == 3;
      }

      @Override
      public BiomeTemperatureCondition getBiomeTemperature() {
         if (this.biomeTemperatureBuilder_ == null) {
            return this.conditionCase_ == 3 ? (BiomeTemperatureCondition)this.condition_ : BiomeTemperatureCondition.getDefaultInstance();
         } else {
            return this.conditionCase_ == 3 ? this.biomeTemperatureBuilder_.getMessage() : BiomeTemperatureCondition.getDefaultInstance();
         }
      }

      public EquipCondition.Builder setBiomeTemperature(BiomeTemperatureCondition var1) {
         if (this.biomeTemperatureBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.condition_ = var1;
            this.onChanged();
         } else {
            this.biomeTemperatureBuilder_.setMessage(var1);
         }

         this.conditionCase_ = 3;
         return this;
      }

      public EquipCondition.Builder setBiomeTemperature(BiomeTemperatureCondition.Builder var1) {
         if (this.biomeTemperatureBuilder_ == null) {
            this.condition_ = var1.build();
            this.onChanged();
         } else {
            this.biomeTemperatureBuilder_.setMessage(var1.build());
         }

         this.conditionCase_ = 3;
         return this;
      }

      public EquipCondition.Builder mergeBiomeTemperature(BiomeTemperatureCondition var1) {
         if (this.biomeTemperatureBuilder_ == null) {
            if (this.conditionCase_ == 3 && this.condition_ != BiomeTemperatureCondition.getDefaultInstance()) {
               this.condition_ = BiomeTemperatureCondition.newBuilder((BiomeTemperatureCondition)this.condition_).mergeFrom(var1).buildPartial();
            } else {
               this.condition_ = var1;
            }

            this.onChanged();
         } else if (this.conditionCase_ == 3) {
            this.biomeTemperatureBuilder_.mergeFrom(var1);
         } else {
            this.biomeTemperatureBuilder_.setMessage(var1);
         }

         this.conditionCase_ = 3;
         return this;
      }

      public EquipCondition.Builder clearBiomeTemperature() {
         if (this.biomeTemperatureBuilder_ == null) {
            if (this.conditionCase_ == 3) {
               this.conditionCase_ = 0;
               this.condition_ = null;
               this.onChanged();
            }
         } else {
            if (this.conditionCase_ == 3) {
               this.conditionCase_ = 0;
               this.condition_ = null;
            }

            this.biomeTemperatureBuilder_.clear();
         }

         return this;
      }

      public BiomeTemperatureCondition.Builder getBiomeTemperatureBuilder() {
         return this.getBiomeTemperatureFieldBuilder().getBuilder();
      }

      @Override
      public BiomeTemperatureConditionOrBuilder getBiomeTemperatureOrBuilder() {
         if (this.conditionCase_ == 3 && this.biomeTemperatureBuilder_ != null) {
            return this.biomeTemperatureBuilder_.getMessageOrBuilder();
         } else {
            return this.conditionCase_ == 3 ? (BiomeTemperatureCondition)this.condition_ : BiomeTemperatureCondition.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<BiomeTemperatureCondition, BiomeTemperatureCondition.Builder, BiomeTemperatureConditionOrBuilder> getBiomeTemperatureFieldBuilder() {
         if (this.biomeTemperatureBuilder_ == null) {
            if (this.conditionCase_ != 3) {
               this.condition_ = BiomeTemperatureCondition.getDefaultInstance();
            }

            this.biomeTemperatureBuilder_ = new SingleFieldBuilderV3<>((BiomeTemperatureCondition)this.condition_, this.getParentForChildren(), this.isClean());
            this.condition_ = null;
         }

         this.conditionCase_ = 3;
         this.onChanged();
         return this.biomeTemperatureBuilder_;
      }

      @Override
      public boolean hasPassengerOfEntity() {
         return this.conditionCase_ == 4;
      }

      @Override
      public PassengerOfEntityCondition getPassengerOfEntity() {
         if (this.passengerOfEntityBuilder_ == null) {
            return this.conditionCase_ == 4 ? (PassengerOfEntityCondition)this.condition_ : PassengerOfEntityCondition.getDefaultInstance();
         } else {
            return this.conditionCase_ == 4 ? this.passengerOfEntityBuilder_.getMessage() : PassengerOfEntityCondition.getDefaultInstance();
         }
      }

      public EquipCondition.Builder setPassengerOfEntity(PassengerOfEntityCondition var1) {
         if (this.passengerOfEntityBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.condition_ = var1;
            this.onChanged();
         } else {
            this.passengerOfEntityBuilder_.setMessage(var1);
         }

         this.conditionCase_ = 4;
         return this;
      }

      public EquipCondition.Builder setPassengerOfEntity(PassengerOfEntityCondition.Builder var1) {
         if (this.passengerOfEntityBuilder_ == null) {
            this.condition_ = var1.build();
            this.onChanged();
         } else {
            this.passengerOfEntityBuilder_.setMessage(var1.build());
         }

         this.conditionCase_ = 4;
         return this;
      }

      public EquipCondition.Builder mergePassengerOfEntity(PassengerOfEntityCondition var1) {
         if (this.passengerOfEntityBuilder_ == null) {
            if (this.conditionCase_ == 4 && this.condition_ != PassengerOfEntityCondition.getDefaultInstance()) {
               this.condition_ = PassengerOfEntityCondition.newBuilder((PassengerOfEntityCondition)this.condition_).mergeFrom(var1).buildPartial();
            } else {
               this.condition_ = var1;
            }

            this.onChanged();
         } else if (this.conditionCase_ == 4) {
            this.passengerOfEntityBuilder_.mergeFrom(var1);
         } else {
            this.passengerOfEntityBuilder_.setMessage(var1);
         }

         this.conditionCase_ = 4;
         return this;
      }

      public EquipCondition.Builder clearPassengerOfEntity() {
         if (this.passengerOfEntityBuilder_ == null) {
            if (this.conditionCase_ == 4) {
               this.conditionCase_ = 0;
               this.condition_ = null;
               this.onChanged();
            }
         } else {
            if (this.conditionCase_ == 4) {
               this.conditionCase_ = 0;
               this.condition_ = null;
            }

            this.passengerOfEntityBuilder_.clear();
         }

         return this;
      }

      public PassengerOfEntityCondition.Builder getPassengerOfEntityBuilder() {
         return this.getPassengerOfEntityFieldBuilder().getBuilder();
      }

      @Override
      public PassengerOfEntityConditionOrBuilder getPassengerOfEntityOrBuilder() {
         if (this.conditionCase_ == 4 && this.passengerOfEntityBuilder_ != null) {
            return this.passengerOfEntityBuilder_.getMessageOrBuilder();
         } else {
            return this.conditionCase_ == 4 ? (PassengerOfEntityCondition)this.condition_ : PassengerOfEntityCondition.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<PassengerOfEntityCondition, PassengerOfEntityCondition.Builder, PassengerOfEntityConditionOrBuilder> getPassengerOfEntityFieldBuilder() {
         if (this.passengerOfEntityBuilder_ == null) {
            if (this.conditionCase_ != 4) {
               this.condition_ = PassengerOfEntityCondition.getDefaultInstance();
            }

            this.passengerOfEntityBuilder_ = new SingleFieldBuilderV3<>(
               (PassengerOfEntityCondition)this.condition_, this.getParentForChildren(), this.isClean()
            );
            this.condition_ = null;
         }

         this.conditionCase_ = 4;
         this.onChanged();
         return this.passengerOfEntityBuilder_;
      }

      @Override
      public boolean hasMovementState() {
         return this.conditionCase_ == 5;
      }

      @Override
      public MovementStateCondition getMovementState() {
         if (this.movementStateBuilder_ == null) {
            return this.conditionCase_ == 5 ? (MovementStateCondition)this.condition_ : MovementStateCondition.getDefaultInstance();
         } else {
            return this.conditionCase_ == 5 ? this.movementStateBuilder_.getMessage() : MovementStateCondition.getDefaultInstance();
         }
      }

      public EquipCondition.Builder setMovementState(MovementStateCondition var1) {
         if (this.movementStateBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.condition_ = var1;
            this.onChanged();
         } else {
            this.movementStateBuilder_.setMessage(var1);
         }

         this.conditionCase_ = 5;
         return this;
      }

      public EquipCondition.Builder setMovementState(MovementStateCondition.Builder var1) {
         if (this.movementStateBuilder_ == null) {
            this.condition_ = var1.build();
            this.onChanged();
         } else {
            this.movementStateBuilder_.setMessage(var1.build());
         }

         this.conditionCase_ = 5;
         return this;
      }

      public EquipCondition.Builder mergeMovementState(MovementStateCondition var1) {
         if (this.movementStateBuilder_ == null) {
            if (this.conditionCase_ == 5 && this.condition_ != MovementStateCondition.getDefaultInstance()) {
               this.condition_ = MovementStateCondition.newBuilder((MovementStateCondition)this.condition_).mergeFrom(var1).buildPartial();
            } else {
               this.condition_ = var1;
            }

            this.onChanged();
         } else if (this.conditionCase_ == 5) {
            this.movementStateBuilder_.mergeFrom(var1);
         } else {
            this.movementStateBuilder_.setMessage(var1);
         }

         this.conditionCase_ = 5;
         return this;
      }

      public EquipCondition.Builder clearMovementState() {
         if (this.movementStateBuilder_ == null) {
            if (this.conditionCase_ == 5) {
               this.conditionCase_ = 0;
               this.condition_ = null;
               this.onChanged();
            }
         } else {
            if (this.conditionCase_ == 5) {
               this.conditionCase_ = 0;
               this.condition_ = null;
            }

            this.movementStateBuilder_.clear();
         }

         return this;
      }

      public MovementStateCondition.Builder getMovementStateBuilder() {
         return this.getMovementStateFieldBuilder().getBuilder();
      }

      @Override
      public MovementStateConditionOrBuilder getMovementStateOrBuilder() {
         if (this.conditionCase_ == 5 && this.movementStateBuilder_ != null) {
            return this.movementStateBuilder_.getMessageOrBuilder();
         } else {
            return this.conditionCase_ == 5 ? (MovementStateCondition)this.condition_ : MovementStateCondition.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<MovementStateCondition, MovementStateCondition.Builder, MovementStateConditionOrBuilder> getMovementStateFieldBuilder() {
         if (this.movementStateBuilder_ == null) {
            if (this.conditionCase_ != 5) {
               this.condition_ = MovementStateCondition.getDefaultInstance();
            }

            this.movementStateBuilder_ = new SingleFieldBuilderV3<>((MovementStateCondition)this.condition_, this.getParentForChildren(), this.isClean());
            this.condition_ = null;
         }

         this.conditionCase_ = 5;
         this.onChanged();
         return this.movementStateBuilder_;
      }

      @Override
      public boolean hasInLiquid() {
         return this.conditionCase_ == 6;
      }

      @Override
      public InLiquidCondition getInLiquid() {
         if (this.inLiquidBuilder_ == null) {
            return this.conditionCase_ == 6 ? (InLiquidCondition)this.condition_ : InLiquidCondition.getDefaultInstance();
         } else {
            return this.conditionCase_ == 6 ? this.inLiquidBuilder_.getMessage() : InLiquidCondition.getDefaultInstance();
         }
      }

      public EquipCondition.Builder setInLiquid(InLiquidCondition var1) {
         if (this.inLiquidBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.condition_ = var1;
            this.onChanged();
         } else {
            this.inLiquidBuilder_.setMessage(var1);
         }

         this.conditionCase_ = 6;
         return this;
      }

      public EquipCondition.Builder setInLiquid(InLiquidCondition.Builder var1) {
         if (this.inLiquidBuilder_ == null) {
            this.condition_ = var1.build();
            this.onChanged();
         } else {
            this.inLiquidBuilder_.setMessage(var1.build());
         }

         this.conditionCase_ = 6;
         return this;
      }

      public EquipCondition.Builder mergeInLiquid(InLiquidCondition var1) {
         if (this.inLiquidBuilder_ == null) {
            if (this.conditionCase_ == 6 && this.condition_ != InLiquidCondition.getDefaultInstance()) {
               this.condition_ = InLiquidCondition.newBuilder((InLiquidCondition)this.condition_).mergeFrom(var1).buildPartial();
            } else {
               this.condition_ = var1;
            }

            this.onChanged();
         } else if (this.conditionCase_ == 6) {
            this.inLiquidBuilder_.mergeFrom(var1);
         } else {
            this.inLiquidBuilder_.setMessage(var1);
         }

         this.conditionCase_ = 6;
         return this;
      }

      public EquipCondition.Builder clearInLiquid() {
         if (this.inLiquidBuilder_ == null) {
            if (this.conditionCase_ == 6) {
               this.conditionCase_ = 0;
               this.condition_ = null;
               this.onChanged();
            }
         } else {
            if (this.conditionCase_ == 6) {
               this.conditionCase_ = 0;
               this.condition_ = null;
            }

            this.inLiquidBuilder_.clear();
         }

         return this;
      }

      public InLiquidCondition.Builder getInLiquidBuilder() {
         return this.getInLiquidFieldBuilder().getBuilder();
      }

      @Override
      public InLiquidConditionOrBuilder getInLiquidOrBuilder() {
         if (this.conditionCase_ == 6 && this.inLiquidBuilder_ != null) {
            return this.inLiquidBuilder_.getMessageOrBuilder();
         } else {
            return this.conditionCase_ == 6 ? (InLiquidCondition)this.condition_ : InLiquidCondition.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<InLiquidCondition, InLiquidCondition.Builder, InLiquidConditionOrBuilder> getInLiquidFieldBuilder() {
         if (this.inLiquidBuilder_ == null) {
            if (this.conditionCase_ != 6) {
               this.condition_ = InLiquidCondition.getDefaultInstance();
            }

            this.inLiquidBuilder_ = new SingleFieldBuilderV3<>((InLiquidCondition)this.condition_, this.getParentForChildren(), this.isClean());
            this.condition_ = null;
         }

         this.conditionCase_ = 6;
         this.onChanged();
         return this.inLiquidBuilder_;
      }

      @Override
      public boolean hasRadioPlaying() {
         return this.conditionCase_ == 7;
      }

      @Override
      public RadioPlayingCondition getRadioPlaying() {
         if (this.radioPlayingBuilder_ == null) {
            return this.conditionCase_ == 7 ? (RadioPlayingCondition)this.condition_ : RadioPlayingCondition.getDefaultInstance();
         } else {
            return this.conditionCase_ == 7 ? this.radioPlayingBuilder_.getMessage() : RadioPlayingCondition.getDefaultInstance();
         }
      }

      public EquipCondition.Builder setRadioPlaying(RadioPlayingCondition var1) {
         if (this.radioPlayingBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.condition_ = var1;
            this.onChanged();
         } else {
            this.radioPlayingBuilder_.setMessage(var1);
         }

         this.conditionCase_ = 7;
         return this;
      }

      public EquipCondition.Builder setRadioPlaying(RadioPlayingCondition.Builder var1) {
         if (this.radioPlayingBuilder_ == null) {
            this.condition_ = var1.build();
            this.onChanged();
         } else {
            this.radioPlayingBuilder_.setMessage(var1.build());
         }

         this.conditionCase_ = 7;
         return this;
      }

      public EquipCondition.Builder mergeRadioPlaying(RadioPlayingCondition var1) {
         if (this.radioPlayingBuilder_ == null) {
            if (this.conditionCase_ == 7 && this.condition_ != RadioPlayingCondition.getDefaultInstance()) {
               this.condition_ = RadioPlayingCondition.newBuilder((RadioPlayingCondition)this.condition_).mergeFrom(var1).buildPartial();
            } else {
               this.condition_ = var1;
            }

            this.onChanged();
         } else if (this.conditionCase_ == 7) {
            this.radioPlayingBuilder_.mergeFrom(var1);
         } else {
            this.radioPlayingBuilder_.setMessage(var1);
         }

         this.conditionCase_ = 7;
         return this;
      }

      public EquipCondition.Builder clearRadioPlaying() {
         if (this.radioPlayingBuilder_ == null) {
            if (this.conditionCase_ == 7) {
               this.conditionCase_ = 0;
               this.condition_ = null;
               this.onChanged();
            }
         } else {
            if (this.conditionCase_ == 7) {
               this.conditionCase_ = 0;
               this.condition_ = null;
            }

            this.radioPlayingBuilder_.clear();
         }

         return this;
      }

      public RadioPlayingCondition.Builder getRadioPlayingBuilder() {
         return this.getRadioPlayingFieldBuilder().getBuilder();
      }

      @Override
      public RadioPlayingConditionOrBuilder getRadioPlayingOrBuilder() {
         if (this.conditionCase_ == 7 && this.radioPlayingBuilder_ != null) {
            return this.radioPlayingBuilder_.getMessageOrBuilder();
         } else {
            return this.conditionCase_ == 7 ? (RadioPlayingCondition)this.condition_ : RadioPlayingCondition.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<RadioPlayingCondition, RadioPlayingCondition.Builder, RadioPlayingConditionOrBuilder> getRadioPlayingFieldBuilder() {
         if (this.radioPlayingBuilder_ == null) {
            if (this.conditionCase_ != 7) {
               this.condition_ = RadioPlayingCondition.getDefaultInstance();
            }

            this.radioPlayingBuilder_ = new SingleFieldBuilderV3<>((RadioPlayingCondition)this.condition_, this.getParentForChildren(), this.isClean());
            this.condition_ = null;
         }

         this.conditionCase_ = 7;
         this.onChanged();
         return this.radioPlayingBuilder_;
      }

      @Override
      public boolean hasOnFire() {
         return this.conditionCase_ == 8;
      }

      @Override
      public OnFireCondition getOnFire() {
         if (this.onFireBuilder_ == null) {
            return this.conditionCase_ == 8 ? (OnFireCondition)this.condition_ : OnFireCondition.getDefaultInstance();
         } else {
            return this.conditionCase_ == 8 ? this.onFireBuilder_.getMessage() : OnFireCondition.getDefaultInstance();
         }
      }

      public EquipCondition.Builder setOnFire(OnFireCondition var1) {
         if (this.onFireBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.condition_ = var1;
            this.onChanged();
         } else {
            this.onFireBuilder_.setMessage(var1);
         }

         this.conditionCase_ = 8;
         return this;
      }

      public EquipCondition.Builder setOnFire(OnFireCondition.Builder var1) {
         if (this.onFireBuilder_ == null) {
            this.condition_ = var1.build();
            this.onChanged();
         } else {
            this.onFireBuilder_.setMessage(var1.build());
         }

         this.conditionCase_ = 8;
         return this;
      }

      public EquipCondition.Builder mergeOnFire(OnFireCondition var1) {
         if (this.onFireBuilder_ == null) {
            if (this.conditionCase_ == 8 && this.condition_ != OnFireCondition.getDefaultInstance()) {
               this.condition_ = OnFireCondition.newBuilder((OnFireCondition)this.condition_).mergeFrom(var1).buildPartial();
            } else {
               this.condition_ = var1;
            }

            this.onChanged();
         } else if (this.conditionCase_ == 8) {
            this.onFireBuilder_.mergeFrom(var1);
         } else {
            this.onFireBuilder_.setMessage(var1);
         }

         this.conditionCase_ = 8;
         return this;
      }

      public EquipCondition.Builder clearOnFire() {
         if (this.onFireBuilder_ == null) {
            if (this.conditionCase_ == 8) {
               this.conditionCase_ = 0;
               this.condition_ = null;
               this.onChanged();
            }
         } else {
            if (this.conditionCase_ == 8) {
               this.conditionCase_ = 0;
               this.condition_ = null;
            }

            this.onFireBuilder_.clear();
         }

         return this;
      }

      public OnFireCondition.Builder getOnFireBuilder() {
         return this.getOnFireFieldBuilder().getBuilder();
      }

      @Override
      public OnFireConditionOrBuilder getOnFireOrBuilder() {
         if (this.conditionCase_ == 8 && this.onFireBuilder_ != null) {
            return this.onFireBuilder_.getMessageOrBuilder();
         } else {
            return this.conditionCase_ == 8 ? (OnFireCondition)this.condition_ : OnFireCondition.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<OnFireCondition, OnFireCondition.Builder, OnFireConditionOrBuilder> getOnFireFieldBuilder() {
         if (this.onFireBuilder_ == null) {
            if (this.conditionCase_ != 8) {
               this.condition_ = OnFireCondition.getDefaultInstance();
            }

            this.onFireBuilder_ = new SingleFieldBuilderV3<>((OnFireCondition)this.condition_, this.getParentForChildren(), this.isClean());
            this.condition_ = null;
         }

         this.conditionCase_ = 8;
         this.onChanged();
         return this.onFireBuilder_;
      }

      @Override
      public boolean hasServer() {
         return this.conditionCase_ == 9;
      }

      @Override
      public ServerCondition getServer() {
         if (this.serverBuilder_ == null) {
            return this.conditionCase_ == 9 ? (ServerCondition)this.condition_ : ServerCondition.getDefaultInstance();
         } else {
            return this.conditionCase_ == 9 ? this.serverBuilder_.getMessage() : ServerCondition.getDefaultInstance();
         }
      }

      public EquipCondition.Builder setServer(ServerCondition var1) {
         if (this.serverBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.condition_ = var1;
            this.onChanged();
         } else {
            this.serverBuilder_.setMessage(var1);
         }

         this.conditionCase_ = 9;
         return this;
      }

      public EquipCondition.Builder setServer(ServerCondition.Builder var1) {
         if (this.serverBuilder_ == null) {
            this.condition_ = var1.build();
            this.onChanged();
         } else {
            this.serverBuilder_.setMessage(var1.build());
         }

         this.conditionCase_ = 9;
         return this;
      }

      public EquipCondition.Builder mergeServer(ServerCondition var1) {
         if (this.serverBuilder_ == null) {
            if (this.conditionCase_ == 9 && this.condition_ != ServerCondition.getDefaultInstance()) {
               this.condition_ = ServerCondition.newBuilder((ServerCondition)this.condition_).mergeFrom(var1).buildPartial();
            } else {
               this.condition_ = var1;
            }

            this.onChanged();
         } else if (this.conditionCase_ == 9) {
            this.serverBuilder_.mergeFrom(var1);
         } else {
            this.serverBuilder_.setMessage(var1);
         }

         this.conditionCase_ = 9;
         return this;
      }

      public EquipCondition.Builder clearServer() {
         if (this.serverBuilder_ == null) {
            if (this.conditionCase_ == 9) {
               this.conditionCase_ = 0;
               this.condition_ = null;
               this.onChanged();
            }
         } else {
            if (this.conditionCase_ == 9) {
               this.conditionCase_ = 0;
               this.condition_ = null;
            }

            this.serverBuilder_.clear();
         }

         return this;
      }

      public ServerCondition.Builder getServerBuilder() {
         return this.getServerFieldBuilder().getBuilder();
      }

      @Override
      public ServerConditionOrBuilder getServerOrBuilder() {
         if (this.conditionCase_ == 9 && this.serverBuilder_ != null) {
            return this.serverBuilder_.getMessageOrBuilder();
         } else {
            return this.conditionCase_ == 9 ? (ServerCondition)this.condition_ : ServerCondition.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<ServerCondition, ServerCondition.Builder, ServerConditionOrBuilder> getServerFieldBuilder() {
         if (this.serverBuilder_ == null) {
            if (this.conditionCase_ != 9) {
               this.condition_ = ServerCondition.getDefaultInstance();
            }

            this.serverBuilder_ = new SingleFieldBuilderV3<>((ServerCondition)this.condition_, this.getParentForChildren(), this.isClean());
            this.condition_ = null;
         }

         this.conditionCase_ = 9;
         this.onChanged();
         return this.serverBuilder_;
      }

      @Override
      public boolean hasTime() {
         return this.conditionCase_ == 10;
      }

      @Override
      public TimeCondition getTime() {
         if (this.timeBuilder_ == null) {
            return this.conditionCase_ == 10 ? (TimeCondition)this.condition_ : TimeCondition.getDefaultInstance();
         } else {
            return this.conditionCase_ == 10 ? this.timeBuilder_.getMessage() : TimeCondition.getDefaultInstance();
         }
      }

      public EquipCondition.Builder setTime(TimeCondition var1) {
         if (this.timeBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.condition_ = var1;
            this.onChanged();
         } else {
            this.timeBuilder_.setMessage(var1);
         }

         this.conditionCase_ = 10;
         return this;
      }

      public EquipCondition.Builder setTime(TimeCondition.Builder var1) {
         if (this.timeBuilder_ == null) {
            this.condition_ = var1.build();
            this.onChanged();
         } else {
            this.timeBuilder_.setMessage(var1.build());
         }

         this.conditionCase_ = 10;
         return this;
      }

      public EquipCondition.Builder mergeTime(TimeCondition var1) {
         if (this.timeBuilder_ == null) {
            if (this.conditionCase_ == 10 && this.condition_ != TimeCondition.getDefaultInstance()) {
               this.condition_ = TimeCondition.newBuilder((TimeCondition)this.condition_).mergeFrom(var1).buildPartial();
            } else {
               this.condition_ = var1;
            }

            this.onChanged();
         } else if (this.conditionCase_ == 10) {
            this.timeBuilder_.mergeFrom(var1);
         } else {
            this.timeBuilder_.setMessage(var1);
         }

         this.conditionCase_ = 10;
         return this;
      }

      public EquipCondition.Builder clearTime() {
         if (this.timeBuilder_ == null) {
            if (this.conditionCase_ == 10) {
               this.conditionCase_ = 0;
               this.condition_ = null;
               this.onChanged();
            }
         } else {
            if (this.conditionCase_ == 10) {
               this.conditionCase_ = 0;
               this.condition_ = null;
            }

            this.timeBuilder_.clear();
         }

         return this;
      }

      public TimeCondition.Builder getTimeBuilder() {
         return this.getTimeFieldBuilder().getBuilder();
      }

      @Override
      public TimeConditionOrBuilder getTimeOrBuilder() {
         if (this.conditionCase_ == 10 && this.timeBuilder_ != null) {
            return this.timeBuilder_.getMessageOrBuilder();
         } else {
            return this.conditionCase_ == 10 ? (TimeCondition)this.condition_ : TimeCondition.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<TimeCondition, TimeCondition.Builder, TimeConditionOrBuilder> getTimeFieldBuilder() {
         if (this.timeBuilder_ == null) {
            if (this.conditionCase_ != 10) {
               this.condition_ = TimeCondition.getDefaultInstance();
            }

            this.timeBuilder_ = new SingleFieldBuilderV3<>((TimeCondition)this.condition_, this.getParentForChildren(), this.isClean());
            this.condition_ = null;
         }

         this.conditionCase_ = 10;
         this.onChanged();
         return this.timeBuilder_;
      }

      public final EquipCondition.Builder setUnknownFields(UnknownFieldSet var1) {
         return (EquipCondition.Builder)super.setUnknownFields(var1);
      }

      public final EquipCondition.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (EquipCondition.Builder)super.mergeUnknownFields(var1);
      }
   }

   public enum ConditionCase implements AbstractMessageLite.InternalOneOfEnum, Internal.EnumLite {
      DIMENSION(1),
      WEATHER(2),
      BIOME_TEMPERATURE(3),
      PASSENGER_OF_ENTITY(4),
      MOVEMENT_STATE(5),
      IN_LIQUID(6),
      RADIO_PLAYING(7),
      ON_FIRE(8),
      SERVER(9),
      TIME(10),
      CONDITION_NOT_SET(0);

      private final int value;

      ConditionCase(int var3) {
         this.value = var3;
      }

      @Deprecated
      public static EquipCondition.ConditionCase valueOf(int var0) {
         return forNumber(var0);
      }

      public static EquipCondition.ConditionCase forNumber(int var0) {
         switch (var0) {
            case 0:
               return CONDITION_NOT_SET;
            case 1:
               return DIMENSION;
            case 2:
               return WEATHER;
            case 3:
               return BIOME_TEMPERATURE;
            case 4:
               return PASSENGER_OF_ENTITY;
            case 5:
               return MOVEMENT_STATE;
            case 6:
               return IN_LIQUID;
            case 7:
               return RADIO_PLAYING;
            case 8:
               return ON_FIRE;
            case 9:
               return SERVER;
            case 10:
               return TIME;
            default:
               return null;
         }
      }

      @Override
      public int getNumber() {
         return this.value;
      }
   }
}
