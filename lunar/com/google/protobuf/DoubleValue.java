package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class DoubleValue extends GeneratedMessageV3 implements DoubleValueOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int VALUE_FIELD_NUMBER = 1;
   private double value_ = 0.0;
   private byte memoizedIsInitialized = -1;
   private static final DoubleValue DEFAULT_INSTANCE = new DoubleValue();
   private static final Parser<DoubleValue> PARSER = new AbstractParser<DoubleValue>() {
      public DoubleValue parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         DoubleValue.Builder var3 = DoubleValue.newBuilder();

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

   private DoubleValue(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private DoubleValue() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new DoubleValue();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return WrappersProto.internal_static_google_protobuf_DoubleValue_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return WrappersProto.internal_static_google_protobuf_DoubleValue_fieldAccessorTable
         .ensureFieldAccessorsInitialized(DoubleValue.class, DoubleValue.Builder.class);
   }

   @Override
   public double getValue() {
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
      if (Double.doubleToRawLongBits(this.value_) != 0L) {
         var1.writeDouble(1, this.value_);
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
      if (Double.doubleToRawLongBits(this.value_) != 0L) {
         var1 += CodedOutputStream.computeDoubleSize(1, this.value_);
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

      if (!(var1 instanceof DoubleValue)) {
         return super.equals(var1);
      }

      DoubleValue var2 = (DoubleValue)var1;
      return Double.doubleToLongBits(this.getValue()) != Double.doubleToLongBits(var2.getValue())
         ? false
         : this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      var1 = 37 * var1 + 1;
      var1 = 53 * var1 + Internal.hashLong(Double.doubleToLongBits(this.getValue()));
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static DoubleValue parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static DoubleValue parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static DoubleValue parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static DoubleValue parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static DoubleValue parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static DoubleValue parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static DoubleValue parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static DoubleValue parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static DoubleValue parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static DoubleValue parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static DoubleValue parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static DoubleValue parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public DoubleValue.Builder newBuilderForType() {
      return newBuilder();
   }

   public static DoubleValue.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static DoubleValue.Builder newBuilder(DoubleValue var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public DoubleValue.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new DoubleValue.Builder() : new DoubleValue.Builder().mergeFrom(this);
   }

   protected DoubleValue.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new DoubleValue.Builder(var1);
   }

   public static DoubleValue getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static DoubleValue of(double var0) {
      return newBuilder().setValue(var0).build();
   }

   public static Parser<DoubleValue> parser() {
      return PARSER;
   }

   @Override
   public Parser<DoubleValue> getParserForType() {
      return PARSER;
   }

   public DoubleValue getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<DoubleValue.Builder> implements DoubleValueOrBuilder {
      private int bitField0_;
      private double value_;

      public static final Descriptors.Descriptor getDescriptor() {
         return WrappersProto.internal_static_google_protobuf_DoubleValue_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WrappersProto.internal_static_google_protobuf_DoubleValue_fieldAccessorTable
            .ensureFieldAccessorsInitialized(DoubleValue.class, DoubleValue.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public DoubleValue.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.value_ = 0.0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return WrappersProto.internal_static_google_protobuf_DoubleValue_descriptor;
      }

      public DoubleValue getDefaultInstanceForType() {
         return DoubleValue.getDefaultInstance();
      }

      public DoubleValue build() {
         DoubleValue var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public DoubleValue buildPartial() {
         DoubleValue var1 = new DoubleValue(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(DoubleValue var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.value_ = this.value_;
         }
      }

      public DoubleValue.Builder clone() {
         return (DoubleValue.Builder)super.clone();
      }

      public DoubleValue.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (DoubleValue.Builder)super.setField(var1, var2);
      }

      public DoubleValue.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (DoubleValue.Builder)super.clearField(var1);
      }

      public DoubleValue.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (DoubleValue.Builder)super.clearOneof(var1);
      }

      public DoubleValue.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (DoubleValue.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public DoubleValue.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (DoubleValue.Builder)super.addRepeatedField(var1, var2);
      }

      public DoubleValue.Builder mergeFrom(Message var1) {
         if (var1 instanceof DoubleValue) {
            return this.mergeFrom((DoubleValue)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public DoubleValue.Builder mergeFrom(DoubleValue var1) {
         if (var1 == DoubleValue.getDefaultInstance()) {
            return this;
         }

         if (var1.getValue() != 0.0) {
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

      public DoubleValue.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                  case 9:
                     this.value_ = var1.readDouble();
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
      public double getValue() {
         return this.value_;
      }

      public DoubleValue.Builder setValue(double var1) {
         this.value_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public DoubleValue.Builder clearValue() {
         this.bitField0_ &= -2;
         this.value_ = 0.0;
         this.onChanged();
         return this;
      }

      public final DoubleValue.Builder setUnknownFields(UnknownFieldSet var1) {
         return (DoubleValue.Builder)super.setUnknownFields(var1);
      }

      public final DoubleValue.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (DoubleValue.Builder)super.mergeUnknownFields(var1);
      }
   }
}
