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

public final class BiomeTemperatureCondition extends GeneratedMessageV3 implements BiomeTemperatureConditionOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int TEMPERATURE_FIELD_NUMBER = 1;
   private int temperature_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final BiomeTemperatureCondition DEFAULT_INSTANCE = new BiomeTemperatureCondition();
   private static final Parser<BiomeTemperatureCondition> PARSER = new AbstractParser<BiomeTemperatureCondition>() {
      public BiomeTemperatureCondition parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         BiomeTemperatureCondition.Builder var3 = BiomeTemperatureCondition.newBuilder();

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

   private BiomeTemperatureCondition(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private BiomeTemperatureCondition() {
      this.temperature_ = 0;
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new BiomeTemperatureCondition();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_cosmetic_v2_BiomeTemperatureCondition_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_cosmetic_v2_BiomeTemperatureCondition_fieldAccessorTable
         .ensureFieldAccessorsInitialized(BiomeTemperatureCondition.class, BiomeTemperatureCondition.Builder.class);
   }

   @Override
   public int getTemperatureValue() {
      return this.temperature_;
   }

   @Override
   public BiomeTemperatureCondition.Temperature getTemperature() {
      BiomeTemperatureCondition.Temperature var1 = BiomeTemperatureCondition.Temperature.forNumber(this.temperature_);
      return var1 == null ? BiomeTemperatureCondition.Temperature.UNRECOGNIZED : var1;
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
      if (this.temperature_ != BiomeTemperatureCondition.Temperature.TEMPERATURE_UNSPECIFIED.getNumber()) {
         var1.writeEnum(1, this.temperature_);
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
      if (this.temperature_ != BiomeTemperatureCondition.Temperature.TEMPERATURE_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(1, this.temperature_);
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

      if (!(var1 instanceof BiomeTemperatureCondition)) {
         return super.equals(var1);
      }

      BiomeTemperatureCondition var2 = (BiomeTemperatureCondition)var1;
      return this.temperature_ != var2.temperature_ ? false : this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      var1 = 37 * var1 + 1;
      var1 = 53 * var1 + this.temperature_;
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static BiomeTemperatureCondition parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static BiomeTemperatureCondition parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static BiomeTemperatureCondition parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static BiomeTemperatureCondition parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static BiomeTemperatureCondition parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static BiomeTemperatureCondition parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static BiomeTemperatureCondition parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static BiomeTemperatureCondition parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static BiomeTemperatureCondition parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static BiomeTemperatureCondition parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static BiomeTemperatureCondition parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static BiomeTemperatureCondition parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public BiomeTemperatureCondition.Builder newBuilderForType() {
      return newBuilder();
   }

   public static BiomeTemperatureCondition.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static BiomeTemperatureCondition.Builder newBuilder(BiomeTemperatureCondition var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public BiomeTemperatureCondition.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new BiomeTemperatureCondition.Builder() : new BiomeTemperatureCondition.Builder().mergeFrom(this);
   }

   protected BiomeTemperatureCondition.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new BiomeTemperatureCondition.Builder(var1);
   }

   public static BiomeTemperatureCondition getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<BiomeTemperatureCondition> parser() {
      return PARSER;
   }

   @Override
   public Parser<BiomeTemperatureCondition> getParserForType() {
      return PARSER;
   }

   public BiomeTemperatureCondition getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<BiomeTemperatureCondition.Builder> implements BiomeTemperatureConditionOrBuilder {
      private int bitField0_;
      private int temperature_ = 0;

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_cosmetic_v2_BiomeTemperatureCondition_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_cosmetic_v2_BiomeTemperatureCondition_fieldAccessorTable
            .ensureFieldAccessorsInitialized(BiomeTemperatureCondition.class, BiomeTemperatureCondition.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public BiomeTemperatureCondition.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.temperature_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_cosmetic_v2_BiomeTemperatureCondition_descriptor;
      }

      public BiomeTemperatureCondition getDefaultInstanceForType() {
         return BiomeTemperatureCondition.getDefaultInstance();
      }

      public BiomeTemperatureCondition build() {
         BiomeTemperatureCondition var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public BiomeTemperatureCondition buildPartial() {
         BiomeTemperatureCondition var1 = new BiomeTemperatureCondition(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(BiomeTemperatureCondition var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.temperature_ = this.temperature_;
         }
      }

      public BiomeTemperatureCondition.Builder clone() {
         return (BiomeTemperatureCondition.Builder)super.clone();
      }

      public BiomeTemperatureCondition.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (BiomeTemperatureCondition.Builder)super.setField(var1, var2);
      }

      public BiomeTemperatureCondition.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (BiomeTemperatureCondition.Builder)super.clearField(var1);
      }

      public BiomeTemperatureCondition.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (BiomeTemperatureCondition.Builder)super.clearOneof(var1);
      }

      public BiomeTemperatureCondition.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (BiomeTemperatureCondition.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public BiomeTemperatureCondition.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (BiomeTemperatureCondition.Builder)super.addRepeatedField(var1, var2);
      }

      public BiomeTemperatureCondition.Builder mergeFrom(Message var1) {
         if (var1 instanceof BiomeTemperatureCondition) {
            return this.mergeFrom((BiomeTemperatureCondition)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public BiomeTemperatureCondition.Builder mergeFrom(BiomeTemperatureCondition var1) {
         if (var1 == BiomeTemperatureCondition.getDefaultInstance()) {
            return this;
         }

         if (var1.temperature_ != 0) {
            this.setTemperatureValue(var1.getTemperatureValue());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public BiomeTemperatureCondition.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.temperature_ = var1.readEnum();
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
      public int getTemperatureValue() {
         return this.temperature_;
      }

      public BiomeTemperatureCondition.Builder setTemperatureValue(int var1) {
         this.temperature_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public BiomeTemperatureCondition.Temperature getTemperature() {
         BiomeTemperatureCondition.Temperature var1 = BiomeTemperatureCondition.Temperature.forNumber(this.temperature_);
         return var1 == null ? BiomeTemperatureCondition.Temperature.UNRECOGNIZED : var1;
      }

      public BiomeTemperatureCondition.Builder setTemperature(BiomeTemperatureCondition.Temperature var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 1;
         this.temperature_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public BiomeTemperatureCondition.Builder clearTemperature() {
         this.bitField0_ &= -2;
         this.temperature_ = 0;
         this.onChanged();
         return this;
      }

      public final BiomeTemperatureCondition.Builder setUnknownFields(UnknownFieldSet var1) {
         return (BiomeTemperatureCondition.Builder)super.setUnknownFields(var1);
      }

      public final BiomeTemperatureCondition.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (BiomeTemperatureCondition.Builder)super.mergeUnknownFields(var1);
      }
   }

   public enum Temperature implements ProtocolMessageEnum {
      TEMPERATURE_UNSPECIFIED(0),
      TEMPERATURE_HOT(1),
      TEMPERATURE_COLD(2),
      UNRECOGNIZED(-1);

      public static final int TEMPERATURE_UNSPECIFIED_VALUE = 0;
      public static final int TEMPERATURE_HOT_VALUE = 1;
      public static final int TEMPERATURE_COLD_VALUE = 2;
      private static final Internal.EnumLiteMap<BiomeTemperatureCondition.Temperature> internalValueMap = new Internal.EnumLiteMap<BiomeTemperatureCondition.Temperature>() {
         public BiomeTemperatureCondition.Temperature findValueByNumber(int var1) {
            return BiomeTemperatureCondition.Temperature.forNumber(var1);
         }
      };
      private static final BiomeTemperatureCondition.Temperature[] VALUES = values();
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
      public static BiomeTemperatureCondition.Temperature valueOf(int var0) {
         return forNumber(var0);
      }

      public static BiomeTemperatureCondition.Temperature forNumber(int var0) {
         switch (var0) {
            case 0:
               return TEMPERATURE_UNSPECIFIED;
            case 1:
               return TEMPERATURE_HOT;
            case 2:
               return TEMPERATURE_COLD;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<BiomeTemperatureCondition.Temperature> internalGetValueMap() {
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
         return BiomeTemperatureCondition.getDescriptor().getEnumTypes().get(0);
      }

      public static BiomeTemperatureCondition.Temperature valueOf(Descriptors.EnumValueDescriptor var0) {
         if (var0.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
         }
      }

      Temperature(int var3) {
         this.value = var3;
      }
   }
}
