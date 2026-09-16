package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class FloatValue extends GeneratedMessageV3 implements FloatValueOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int VALUE_FIELD_NUMBER = 1;
   private float value_ = 0.0F;
   private byte memoizedIsInitialized = -1;
   private static final FloatValue DEFAULT_INSTANCE = new FloatValue();
   private static final Parser<FloatValue> PARSER = new AbstractParser<FloatValue>() {
      public FloatValue parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         FloatValue.Builder var3 = FloatValue.newBuilder();

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

   private FloatValue(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private FloatValue() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new FloatValue();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return WrappersProto.internal_static_google_protobuf_FloatValue_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return WrappersProto.internal_static_google_protobuf_FloatValue_fieldAccessorTable
         .ensureFieldAccessorsInitialized(FloatValue.class, FloatValue.Builder.class);
   }

   @Override
   public float getValue() {
      return this.value_;
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
      if (Float.floatToRawIntBits(this.value_) != 0) {
         var1.writeFloat(1, this.value_);
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
      if (Float.floatToRawIntBits(this.value_) != 0) {
         var1 += CodedOutputStream.computeFloatSize(1, this.value_);
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

      if (!(var1 instanceof FloatValue)) {
         return super.equals(var1);
      }

      FloatValue var2 = (FloatValue)var1;
      return Float.floatToIntBits(this.getValue()) != Float.floatToIntBits(var2.getValue()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      var1 = 37 * var1 + 1;
      var1 = 53 * var1 + Float.floatToIntBits(this.getValue());
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static FloatValue parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static FloatValue parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static FloatValue parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static FloatValue parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static FloatValue parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static FloatValue parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static FloatValue parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static FloatValue parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static FloatValue parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static FloatValue parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static FloatValue parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static FloatValue parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public FloatValue.Builder newBuilderForType() {
      return newBuilder();
   }

   public static FloatValue.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static FloatValue.Builder newBuilder(FloatValue var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public FloatValue.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new FloatValue.Builder() : new FloatValue.Builder().mergeFrom(this);
   }

   protected FloatValue.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new FloatValue.Builder(var1);
   }

   public static FloatValue getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static FloatValue of(float var0) {
      return newBuilder().setValue(var0).build();
   }

   public static Parser<FloatValue> parser() {
      return PARSER;
   }

   @Override
   public Parser<FloatValue> getParserForType() {
      return PARSER;
   }

   public FloatValue getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<FloatValue.Builder> implements FloatValueOrBuilder {
      private int bitField0_;
      private float value_;

      public static final Descriptors.Descriptor getDescriptor() {
         return WrappersProto.internal_static_google_protobuf_FloatValue_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WrappersProto.internal_static_google_protobuf_FloatValue_fieldAccessorTable
            .ensureFieldAccessorsInitialized(FloatValue.class, FloatValue.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public FloatValue.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.value_ = 0.0F;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return WrappersProto.internal_static_google_protobuf_FloatValue_descriptor;
      }

      public FloatValue getDefaultInstanceForType() {
         return FloatValue.getDefaultInstance();
      }

      public FloatValue build() {
         FloatValue var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public FloatValue buildPartial() {
         FloatValue var1 = new FloatValue(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(FloatValue var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.value_ = this.value_;
         }
      }

      public FloatValue.Builder clone() {
         return (FloatValue.Builder)super.clone();
      }

      public FloatValue.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (FloatValue.Builder)super.setField(var1, var2);
      }

      public FloatValue.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (FloatValue.Builder)super.clearField(var1);
      }

      public FloatValue.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (FloatValue.Builder)super.clearOneof(var1);
      }

      public FloatValue.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (FloatValue.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public FloatValue.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (FloatValue.Builder)super.addRepeatedField(var1, var2);
      }

      public FloatValue.Builder mergeFrom(Message var1) {
         if (var1 instanceof FloatValue) {
            return this.mergeFrom((FloatValue)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public FloatValue.Builder mergeFrom(FloatValue var1) {
         if (var1 == FloatValue.getDefaultInstance()) {
            return this;
         }

         if (var1.getValue() != 0.0F) {
            this.setValue(var1.getValue());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public FloatValue.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                  case 13:
                     this.value_ = var1.readFloat();
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
      public float getValue() {
         return this.value_;
      }

      public FloatValue.Builder setValue(float var1) {
         this.value_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public FloatValue.Builder clearValue() {
         this.bitField0_ &= -2;
         this.value_ = 0.0F;
         this.onChanged();
         return this;
      }

      public final FloatValue.Builder setUnknownFields(UnknownFieldSet var1) {
         return (FloatValue.Builder)super.setUnknownFields(var1);
      }

      public final FloatValue.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (FloatValue.Builder)super.mergeUnknownFields(var1);
      }
   }
}
