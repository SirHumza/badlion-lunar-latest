package com.google.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Int32Value extends GeneratedMessageV3 implements Int32ValueOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int VALUE_FIELD_NUMBER = 1;
   private int value_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final Int32Value DEFAULT_INSTANCE = new Int32Value();
   private static final Parser<Int32Value> PARSER = new AbstractParser<Int32Value>() {
      public Int32Value parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         Int32Value.Builder var3 = Int32Value.newBuilder();

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

   private Int32Value(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private Int32Value() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new Int32Value();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return WrappersProto.internal_static_google_protobuf_Int32Value_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return WrappersProto.internal_static_google_protobuf_Int32Value_fieldAccessorTable
         .ensureFieldAccessorsInitialized(Int32Value.class, Int32Value.Builder.class);
   }

   @Override
   public int getValue() {
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
      if (this.value_ != 0) {
         var1.writeInt32(1, this.value_);
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
      if (this.value_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(1, this.value_);
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

      if (!(var1 instanceof Int32Value)) {
         return super.equals(var1);
      }

      Int32Value var2 = (Int32Value)var1;
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
      var1 = 53 * var1 + this.getValue();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static Int32Value parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static Int32Value parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Int32Value parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static Int32Value parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Int32Value parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static Int32Value parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Int32Value parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Int32Value parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Int32Value parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static Int32Value parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static Int32Value parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Int32Value parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public Int32Value.Builder newBuilderForType() {
      return newBuilder();
   }

   public static Int32Value.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static Int32Value.Builder newBuilder(Int32Value var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public Int32Value.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Int32Value.Builder() : new Int32Value.Builder().mergeFrom(this);
   }

   protected Int32Value.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new Int32Value.Builder(var1);
   }

   public static Int32Value getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Int32Value of(int var0) {
      return newBuilder().setValue(var0).build();
   }

   public static Parser<Int32Value> parser() {
      return PARSER;
   }

   @Override
   public Parser<Int32Value> getParserForType() {
      return PARSER;
   }

   public Int32Value getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<Int32Value.Builder> implements Int32ValueOrBuilder {
      private int bitField0_;
      private int value_;

      public static final Descriptors.Descriptor getDescriptor() {
         return WrappersProto.internal_static_google_protobuf_Int32Value_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WrappersProto.internal_static_google_protobuf_Int32Value_fieldAccessorTable
            .ensureFieldAccessorsInitialized(Int32Value.class, Int32Value.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public Int32Value.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.value_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return WrappersProto.internal_static_google_protobuf_Int32Value_descriptor;
      }

      public Int32Value getDefaultInstanceForType() {
         return Int32Value.getDefaultInstance();
      }

      public Int32Value build() {
         Int32Value var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public Int32Value buildPartial() {
         Int32Value var1 = new Int32Value(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(Int32Value var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.value_ = this.value_;
         }
      }

      public Int32Value.Builder clone() {
         return (Int32Value.Builder)super.clone();
      }

      public Int32Value.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (Int32Value.Builder)super.setField(var1, var2);
      }

      public Int32Value.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (Int32Value.Builder)super.clearField(var1);
      }

      public Int32Value.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (Int32Value.Builder)super.clearOneof(var1);
      }

      public Int32Value.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (Int32Value.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public Int32Value.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (Int32Value.Builder)super.addRepeatedField(var1, var2);
      }

      public Int32Value.Builder mergeFrom(Message var1) {
         if (var1 instanceof Int32Value) {
            return this.mergeFrom((Int32Value)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public Int32Value.Builder mergeFrom(Int32Value var1) {
         if (var1 == Int32Value.getDefaultInstance()) {
            return this;
         }

         if (var1.getValue() != 0) {
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

      public Int32Value.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.value_ = var1.readInt32();
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
      public int getValue() {
         return this.value_;
      }

      public Int32Value.Builder setValue(int var1) {
         this.value_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public Int32Value.Builder clearValue() {
         this.bitField0_ &= -2;
         this.value_ = 0;
         this.onChanged();
         return this;
      }

      public final Int32Value.Builder setUnknownFields(UnknownFieldSet var1) {
         return (Int32Value.Builder)super.setUnknownFields(var1);
      }

      public final Int32Value.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (Int32Value.Builder)super.mergeUnknownFields(var1);
      }
   }
}
