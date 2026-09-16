package com.lunarclient.websocket.cosmetic.v2;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class DimensionCondition extends GeneratedMessageV3 implements DimensionConditionOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int DIMENSION_ID_FIELD_NUMBER = 1;
   private volatile Object dimensionId_ = "";
   private byte memoizedIsInitialized = -1;
   private static final DimensionCondition DEFAULT_INSTANCE = new DimensionCondition();
   private static final Parser<DimensionCondition> PARSER = new AbstractParser<DimensionCondition>() {
      public DimensionCondition parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         DimensionCondition.Builder var3 = DimensionCondition.newBuilder();

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

   private DimensionCondition(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private DimensionCondition() {
      this.dimensionId_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new DimensionCondition();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_cosmetic_v2_DimensionCondition_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_cosmetic_v2_DimensionCondition_fieldAccessorTable
         .ensureFieldAccessorsInitialized(DimensionCondition.class, DimensionCondition.Builder.class);
   }

   @Override
   public String getDimensionId() {
      Object var1 = this.dimensionId_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.dimensionId_ = var3;
      return var3;
   }

   @Override
   public ByteString getDimensionIdBytes() {
      Object var1 = this.dimensionId_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.dimensionId_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
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
      if (!GeneratedMessageV3.isStringEmpty(this.dimensionId_)) {
         GeneratedMessageV3.writeString(var1, 1, this.dimensionId_);
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
      if (!GeneratedMessageV3.isStringEmpty(this.dimensionId_)) {
         var1 += GeneratedMessageV3.computeStringSize(1, this.dimensionId_);
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

      if (!(var1 instanceof DimensionCondition)) {
         return super.equals(var1);
      }

      DimensionCondition var2 = (DimensionCondition)var1;
      return !this.getDimensionId().equals(var2.getDimensionId()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      var1 = 37 * var1 + 1;
      var1 = 53 * var1 + this.getDimensionId().hashCode();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static DimensionCondition parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static DimensionCondition parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static DimensionCondition parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static DimensionCondition parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static DimensionCondition parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static DimensionCondition parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static DimensionCondition parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static DimensionCondition parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static DimensionCondition parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static DimensionCondition parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static DimensionCondition parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static DimensionCondition parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public DimensionCondition.Builder newBuilderForType() {
      return newBuilder();
   }

   public static DimensionCondition.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static DimensionCondition.Builder newBuilder(DimensionCondition var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public DimensionCondition.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new DimensionCondition.Builder() : new DimensionCondition.Builder().mergeFrom(this);
   }

   protected DimensionCondition.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new DimensionCondition.Builder(var1);
   }

   public static DimensionCondition getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<DimensionCondition> parser() {
      return PARSER;
   }

   @Override
   public Parser<DimensionCondition> getParserForType() {
      return PARSER;
   }

   public DimensionCondition getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<DimensionCondition.Builder> implements DimensionConditionOrBuilder {
      private int bitField0_;
      private Object dimensionId_ = "";

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_cosmetic_v2_DimensionCondition_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_cosmetic_v2_DimensionCondition_fieldAccessorTable
            .ensureFieldAccessorsInitialized(DimensionCondition.class, DimensionCondition.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public DimensionCondition.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.dimensionId_ = "";
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_cosmetic_v2_DimensionCondition_descriptor;
      }

      public DimensionCondition getDefaultInstanceForType() {
         return DimensionCondition.getDefaultInstance();
      }

      public DimensionCondition build() {
         DimensionCondition var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public DimensionCondition buildPartial() {
         DimensionCondition var1 = new DimensionCondition(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(DimensionCondition var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.dimensionId_ = this.dimensionId_;
         }
      }

      public DimensionCondition.Builder clone() {
         return (DimensionCondition.Builder)super.clone();
      }

      public DimensionCondition.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (DimensionCondition.Builder)super.setField(var1, var2);
      }

      public DimensionCondition.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (DimensionCondition.Builder)super.clearField(var1);
      }

      public DimensionCondition.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (DimensionCondition.Builder)super.clearOneof(var1);
      }

      public DimensionCondition.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (DimensionCondition.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public DimensionCondition.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (DimensionCondition.Builder)super.addRepeatedField(var1, var2);
      }

      public DimensionCondition.Builder mergeFrom(Message var1) {
         if (var1 instanceof DimensionCondition) {
            return this.mergeFrom((DimensionCondition)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public DimensionCondition.Builder mergeFrom(DimensionCondition var1) {
         if (var1 == DimensionCondition.getDefaultInstance()) {
            return this;
         }

         if (!var1.getDimensionId().isEmpty()) {
            this.dimensionId_ = var1.dimensionId_;
            this.bitField0_ |= 1;
            this.onChanged();
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public DimensionCondition.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.dimensionId_ = var1.readStringRequireUtf8();
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
      public String getDimensionId() {
         Object var1 = this.dimensionId_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.dimensionId_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getDimensionIdBytes() {
         Object var1 = this.dimensionId_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.dimensionId_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public DimensionCondition.Builder setDimensionId(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.dimensionId_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public DimensionCondition.Builder clearDimensionId() {
         this.dimensionId_ = DimensionCondition.getDefaultInstance().getDimensionId();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public DimensionCondition.Builder setDimensionIdBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         DimensionCondition.checkByteStringIsUtf8(var1);
         this.dimensionId_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public final DimensionCondition.Builder setUnknownFields(UnknownFieldSet var1) {
         return (DimensionCondition.Builder)super.setUnknownFields(var1);
      }

      public final DimensionCondition.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (DimensionCondition.Builder)super.mergeUnknownFields(var1);
      }
   }
}
