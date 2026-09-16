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

public final class InLiquidCondition extends GeneratedMessageV3 implements InLiquidConditionOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int LIQUID_FIELD_NUMBER = 1;
   private int liquid_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final InLiquidCondition DEFAULT_INSTANCE = new InLiquidCondition();
   private static final Parser<InLiquidCondition> PARSER = new AbstractParser<InLiquidCondition>() {
      public InLiquidCondition parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         InLiquidCondition.Builder var3 = InLiquidCondition.newBuilder();

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

   private InLiquidCondition(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private InLiquidCondition() {
      this.liquid_ = 0;
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new InLiquidCondition();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_cosmetic_v2_InLiquidCondition_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_cosmetic_v2_InLiquidCondition_fieldAccessorTable
         .ensureFieldAccessorsInitialized(InLiquidCondition.class, InLiquidCondition.Builder.class);
   }

   @Override
   public int getLiquidValue() {
      return this.liquid_;
   }

   @Override
   public InLiquidCondition.Liquid getLiquid() {
      InLiquidCondition.Liquid var1 = InLiquidCondition.Liquid.forNumber(this.liquid_);
      return var1 == null ? InLiquidCondition.Liquid.UNRECOGNIZED : var1;
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
      if (this.liquid_ != InLiquidCondition.Liquid.LIQUID_UNSPECIFIED.getNumber()) {
         var1.writeEnum(1, this.liquid_);
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
      if (this.liquid_ != InLiquidCondition.Liquid.LIQUID_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(1, this.liquid_);
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

      if (!(var1 instanceof InLiquidCondition)) {
         return super.equals(var1);
      }

      InLiquidCondition var2 = (InLiquidCondition)var1;
      return this.liquid_ != var2.liquid_ ? false : this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      var1 = 37 * var1 + 1;
      var1 = 53 * var1 + this.liquid_;
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static InLiquidCondition parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static InLiquidCondition parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static InLiquidCondition parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static InLiquidCondition parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static InLiquidCondition parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static InLiquidCondition parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static InLiquidCondition parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static InLiquidCondition parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static InLiquidCondition parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static InLiquidCondition parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static InLiquidCondition parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static InLiquidCondition parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public InLiquidCondition.Builder newBuilderForType() {
      return newBuilder();
   }

   public static InLiquidCondition.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static InLiquidCondition.Builder newBuilder(InLiquidCondition var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public InLiquidCondition.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new InLiquidCondition.Builder() : new InLiquidCondition.Builder().mergeFrom(this);
   }

   protected InLiquidCondition.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new InLiquidCondition.Builder(var1);
   }

   public static InLiquidCondition getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<InLiquidCondition> parser() {
      return PARSER;
   }

   @Override
   public Parser<InLiquidCondition> getParserForType() {
      return PARSER;
   }

   public InLiquidCondition getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<InLiquidCondition.Builder> implements InLiquidConditionOrBuilder {
      private int bitField0_;
      private int liquid_ = 0;

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_cosmetic_v2_InLiquidCondition_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_cosmetic_v2_InLiquidCondition_fieldAccessorTable
            .ensureFieldAccessorsInitialized(InLiquidCondition.class, InLiquidCondition.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public InLiquidCondition.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.liquid_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_cosmetic_v2_InLiquidCondition_descriptor;
      }

      public InLiquidCondition getDefaultInstanceForType() {
         return InLiquidCondition.getDefaultInstance();
      }

      public InLiquidCondition build() {
         InLiquidCondition var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public InLiquidCondition buildPartial() {
         InLiquidCondition var1 = new InLiquidCondition(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(InLiquidCondition var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.liquid_ = this.liquid_;
         }
      }

      public InLiquidCondition.Builder clone() {
         return (InLiquidCondition.Builder)super.clone();
      }

      public InLiquidCondition.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (InLiquidCondition.Builder)super.setField(var1, var2);
      }

      public InLiquidCondition.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (InLiquidCondition.Builder)super.clearField(var1);
      }

      public InLiquidCondition.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (InLiquidCondition.Builder)super.clearOneof(var1);
      }

      public InLiquidCondition.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (InLiquidCondition.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public InLiquidCondition.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (InLiquidCondition.Builder)super.addRepeatedField(var1, var2);
      }

      public InLiquidCondition.Builder mergeFrom(Message var1) {
         if (var1 instanceof InLiquidCondition) {
            return this.mergeFrom((InLiquidCondition)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public InLiquidCondition.Builder mergeFrom(InLiquidCondition var1) {
         if (var1 == InLiquidCondition.getDefaultInstance()) {
            return this;
         }

         if (var1.liquid_ != 0) {
            this.setLiquidValue(var1.getLiquidValue());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public InLiquidCondition.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.liquid_ = var1.readEnum();
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
      public int getLiquidValue() {
         return this.liquid_;
      }

      public InLiquidCondition.Builder setLiquidValue(int var1) {
         this.liquid_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public InLiquidCondition.Liquid getLiquid() {
         InLiquidCondition.Liquid var1 = InLiquidCondition.Liquid.forNumber(this.liquid_);
         return var1 == null ? InLiquidCondition.Liquid.UNRECOGNIZED : var1;
      }

      public InLiquidCondition.Builder setLiquid(InLiquidCondition.Liquid var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 1;
         this.liquid_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public InLiquidCondition.Builder clearLiquid() {
         this.bitField0_ &= -2;
         this.liquid_ = 0;
         this.onChanged();
         return this;
      }

      public final InLiquidCondition.Builder setUnknownFields(UnknownFieldSet var1) {
         return (InLiquidCondition.Builder)super.setUnknownFields(var1);
      }

      public final InLiquidCondition.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (InLiquidCondition.Builder)super.mergeUnknownFields(var1);
      }
   }

   public enum Liquid implements ProtocolMessageEnum {
      LIQUID_UNSPECIFIED(0),
      LIQUID_WATER(1),
      LIQUID_LAVA(2),
      UNRECOGNIZED(-1);

      public static final int LIQUID_UNSPECIFIED_VALUE = 0;
      public static final int LIQUID_WATER_VALUE = 1;
      public static final int LIQUID_LAVA_VALUE = 2;
      private static final Internal.EnumLiteMap<InLiquidCondition.Liquid> internalValueMap = new Internal.EnumLiteMap<InLiquidCondition.Liquid>() {
         public InLiquidCondition.Liquid findValueByNumber(int var1) {
            return InLiquidCondition.Liquid.forNumber(var1);
         }
      };
      private static final InLiquidCondition.Liquid[] VALUES = values();
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
      public static InLiquidCondition.Liquid valueOf(int var0) {
         return forNumber(var0);
      }

      public static InLiquidCondition.Liquid forNumber(int var0) {
         switch (var0) {
            case 0:
               return LIQUID_UNSPECIFIED;
            case 1:
               return LIQUID_WATER;
            case 2:
               return LIQUID_LAVA;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<InLiquidCondition.Liquid> internalGetValueMap() {
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
         return InLiquidCondition.getDescriptor().getEnumTypes().get(0);
      }

      public static InLiquidCondition.Liquid valueOf(Descriptors.EnumValueDescriptor var0) {
         if (var0.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
         }
      }

      Liquid(int var3) {
         this.value = var3;
      }
   }
}
