package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class BoolValue extends GeneratedMessageV3 implements BoolValueOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int VALUE_FIELD_NUMBER = 1;
   private boolean value_ = false;
   private byte memoizedIsInitialized = -1;
   private static final BoolValue DEFAULT_INSTANCE = new BoolValue();
   private static final Parser<BoolValue> PARSER = new AbstractParser<BoolValue>() {
      public BoolValue parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         BoolValue.Builder var3 = BoolValue.newBuilder();

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

   private BoolValue(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private BoolValue() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new BoolValue();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return WrappersProto.internal_static_google_protobuf_BoolValue_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return WrappersProto.internal_static_google_protobuf_BoolValue_fieldAccessorTable
         .ensureFieldAccessorsInitialized(BoolValue.class, BoolValue.Builder.class);
   }

   @Override
   public boolean getValue() {
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
      if (this.value_) {
         var1.writeBool(1, this.value_);
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
      if (this.value_) {
         var1 += CodedOutputStream.computeBoolSize(1, this.value_);
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

      if (!(var1 instanceof BoolValue)) {
         return super.equals(var1);
      }

      BoolValue var2 = (BoolValue)var1;
      return this.getValue() != var2.getValue() ? false : this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      var1 = 37 * var1 + 1;
      var1 = 53 * var1 + Internal.hashBoolean(this.getValue());
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static BoolValue parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static BoolValue parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static BoolValue parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static BoolValue parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static BoolValue parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static BoolValue parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static BoolValue parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static BoolValue parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static BoolValue parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static BoolValue parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static BoolValue parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static BoolValue parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public BoolValue.Builder newBuilderForType() {
      return newBuilder();
   }

   public static BoolValue.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static BoolValue.Builder newBuilder(BoolValue var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public BoolValue.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new BoolValue.Builder() : new BoolValue.Builder().mergeFrom(this);
   }

   protected BoolValue.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new BoolValue.Builder(var1);
   }

   public static BoolValue getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static BoolValue of(boolean var0) {
      return newBuilder().setValue(var0).build();
   }

   public static Parser<BoolValue> parser() {
      return PARSER;
   }

   @Override
   public Parser<BoolValue> getParserForType() {
      return PARSER;
   }

   public BoolValue getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<BoolValue.Builder> implements BoolValueOrBuilder {
      private int bitField0_;
      private boolean value_;

      public static final Descriptors.Descriptor getDescriptor() {
         return WrappersProto.internal_static_google_protobuf_BoolValue_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WrappersProto.internal_static_google_protobuf_BoolValue_fieldAccessorTable
            .ensureFieldAccessorsInitialized(BoolValue.class, BoolValue.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public BoolValue.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.value_ = false;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return WrappersProto.internal_static_google_protobuf_BoolValue_descriptor;
      }

      public BoolValue getDefaultInstanceForType() {
         return BoolValue.getDefaultInstance();
      }

      public BoolValue build() {
         BoolValue var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public BoolValue buildPartial() {
         BoolValue var1 = new BoolValue(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(BoolValue var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.value_ = this.value_;
         }
      }

      public BoolValue.Builder clone() {
         return (BoolValue.Builder)super.clone();
      }

      public BoolValue.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (BoolValue.Builder)super.setField(var1, var2);
      }

      public BoolValue.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (BoolValue.Builder)super.clearField(var1);
      }

      public BoolValue.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (BoolValue.Builder)super.clearOneof(var1);
      }

      public BoolValue.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (BoolValue.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public BoolValue.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (BoolValue.Builder)super.addRepeatedField(var1, var2);
      }

      public BoolValue.Builder mergeFrom(Message var1) {
         if (var1 instanceof BoolValue) {
            return this.mergeFrom((BoolValue)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public BoolValue.Builder mergeFrom(BoolValue var1) {
         if (var1 == BoolValue.getDefaultInstance()) {
            return this;
         }

         if (var1.getValue()) {
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

      public BoolValue.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.value_ = var1.readBool();
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
      public boolean getValue() {
         return this.value_;
      }

      public BoolValue.Builder setValue(boolean var1) {
         this.value_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public BoolValue.Builder clearValue() {
         this.bitField0_ &= -2;
         this.value_ = false;
         this.onChanged();
         return this;
      }

      public final BoolValue.Builder setUnknownFields(UnknownFieldSet var1) {
         return (BoolValue.Builder)super.setUnknownFields(var1);
      }

      public final BoolValue.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (BoolValue.Builder)super.mergeUnknownFields(var1);
      }
   }
}
