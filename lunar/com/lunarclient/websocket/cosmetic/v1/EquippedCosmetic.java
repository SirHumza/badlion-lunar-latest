package com.lunarclient.websocket.cosmetic.v1;

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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.Struct;
import com.google.protobuf.StructOrBuilder;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class EquippedCosmetic extends GeneratedMessageV3 implements EquippedCosmeticOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int COSMETIC_ID_FIELD_NUMBER = 1;
   private int cosmeticId_ = 0;
   public static final int METADATA_FIELD_NUMBER = 2;
   private Struct metadata_;
   private byte memoizedIsInitialized = -1;
   private static final EquippedCosmetic DEFAULT_INSTANCE = new EquippedCosmetic();
   private static final Parser<EquippedCosmetic> PARSER = new AbstractParser<EquippedCosmetic>() {
      public EquippedCosmetic parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         EquippedCosmetic.Builder var3 = EquippedCosmetic.newBuilder();

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

   private EquippedCosmetic(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private EquippedCosmetic() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new EquippedCosmetic();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_cosmetic_v1_EquippedCosmetic_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_cosmetic_v1_EquippedCosmetic_fieldAccessorTable
         .ensureFieldAccessorsInitialized(EquippedCosmetic.class, EquippedCosmetic.Builder.class);
   }

   @Override
   public int getCosmeticId() {
      return this.cosmeticId_;
   }

   @Override
   public boolean hasMetadata() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public Struct getMetadata() {
      return this.metadata_ == null ? Struct.getDefaultInstance() : this.metadata_;
   }

   @Override
   public StructOrBuilder getMetadataOrBuilder() {
      return this.metadata_ == null ? Struct.getDefaultInstance() : this.metadata_;
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
      if (this.cosmeticId_ != 0) {
         var1.writeInt32(1, this.cosmeticId_);
      }

      if ((this.bitField0_ & 1) != 0) {
         var1.writeMessage(2, this.getMetadata());
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
      if (this.cosmeticId_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(1, this.cosmeticId_);
      }

      if ((this.bitField0_ & 1) != 0) {
         var1 += CodedOutputStream.computeMessageSize(2, this.getMetadata());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof EquippedCosmetic)) {
         return super.equals(var1);
      } else {
         EquippedCosmetic var2 = (EquippedCosmetic)var1;
         if (this.getCosmeticId() != var2.getCosmeticId()) {
            return false;
         } else if (this.hasMetadata() != var2.hasMetadata()) {
            return false;
         } else {
            return this.hasMetadata() && !this.getMetadata().equals(var2.getMetadata()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
         }
      }
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      var1 = 37 * var1 + 1;
      var1 = 53 * var1 + this.getCosmeticId();
      if (this.hasMetadata()) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getMetadata().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static EquippedCosmetic parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static EquippedCosmetic parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static EquippedCosmetic parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static EquippedCosmetic parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static EquippedCosmetic parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static EquippedCosmetic parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static EquippedCosmetic parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static EquippedCosmetic parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static EquippedCosmetic parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static EquippedCosmetic parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static EquippedCosmetic parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static EquippedCosmetic parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public EquippedCosmetic.Builder newBuilderForType() {
      return newBuilder();
   }

   public static EquippedCosmetic.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static EquippedCosmetic.Builder newBuilder(EquippedCosmetic var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public EquippedCosmetic.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new EquippedCosmetic.Builder() : new EquippedCosmetic.Builder().mergeFrom(this);
   }

   protected EquippedCosmetic.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new EquippedCosmetic.Builder(var1);
   }

   public static EquippedCosmetic getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<EquippedCosmetic> parser() {
      return PARSER;
   }

   @Override
   public Parser<EquippedCosmetic> getParserForType() {
      return PARSER;
   }

   public EquippedCosmetic getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<EquippedCosmetic.Builder> implements EquippedCosmeticOrBuilder {
      private int bitField0_;
      private int cosmeticId_;
      private Struct metadata_;
      private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> metadataBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_cosmetic_v1_EquippedCosmetic_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_cosmetic_v1_EquippedCosmetic_fieldAccessorTable
            .ensureFieldAccessorsInitialized(EquippedCosmetic.class, EquippedCosmetic.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (EquippedCosmetic.alwaysUseFieldBuilders) {
            this.getMetadataFieldBuilder();
         }
      }

      public EquippedCosmetic.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.cosmeticId_ = 0;
         this.metadata_ = null;
         if (this.metadataBuilder_ != null) {
            this.metadataBuilder_.dispose();
            this.metadataBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_cosmetic_v1_EquippedCosmetic_descriptor;
      }

      public EquippedCosmetic getDefaultInstanceForType() {
         return EquippedCosmetic.getDefaultInstance();
      }

      public EquippedCosmetic build() {
         EquippedCosmetic var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public EquippedCosmetic buildPartial() {
         EquippedCosmetic var1 = new EquippedCosmetic(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(EquippedCosmetic var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.cosmeticId_ = this.cosmeticId_;
         }

         byte var3 = 0;
         if ((var2 & 2) != 0) {
            var1.metadata_ = this.metadataBuilder_ == null ? this.metadata_ : this.metadataBuilder_.build();
            var3 |= 1;
         }

         EquippedCosmetic var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public EquippedCosmetic.Builder clone() {
         return (EquippedCosmetic.Builder)super.clone();
      }

      public EquippedCosmetic.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (EquippedCosmetic.Builder)super.setField(var1, var2);
      }

      public EquippedCosmetic.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (EquippedCosmetic.Builder)super.clearField(var1);
      }

      public EquippedCosmetic.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (EquippedCosmetic.Builder)super.clearOneof(var1);
      }

      public EquippedCosmetic.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (EquippedCosmetic.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public EquippedCosmetic.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (EquippedCosmetic.Builder)super.addRepeatedField(var1, var2);
      }

      public EquippedCosmetic.Builder mergeFrom(Message var1) {
         if (var1 instanceof EquippedCosmetic) {
            return this.mergeFrom((EquippedCosmetic)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public EquippedCosmetic.Builder mergeFrom(EquippedCosmetic var1) {
         if (var1 == EquippedCosmetic.getDefaultInstance()) {
            return this;
         }

         if (var1.getCosmeticId() != 0) {
            this.setCosmeticId(var1.getCosmeticId());
         }

         if (var1.hasMetadata()) {
            this.mergeMetadata(var1.getMetadata());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public EquippedCosmetic.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.cosmeticId_ = var1.readInt32();
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     var1.readMessage(this.getMetadataFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 2;
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
      public int getCosmeticId() {
         return this.cosmeticId_;
      }

      public EquippedCosmetic.Builder setCosmeticId(int var1) {
         this.cosmeticId_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public EquippedCosmetic.Builder clearCosmeticId() {
         this.bitField0_ &= -2;
         this.cosmeticId_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasMetadata() {
         return (this.bitField0_ & 2) != 0;
      }

      @Override
      public Struct getMetadata() {
         if (this.metadataBuilder_ == null) {
            return this.metadata_ == null ? Struct.getDefaultInstance() : this.metadata_;
         } else {
            return this.metadataBuilder_.getMessage();
         }
      }

      public EquippedCosmetic.Builder setMetadata(Struct var1) {
         if (this.metadataBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.metadata_ = var1;
         } else {
            this.metadataBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public EquippedCosmetic.Builder setMetadata(Struct.Builder var1) {
         if (this.metadataBuilder_ == null) {
            this.metadata_ = var1.build();
         } else {
            this.metadataBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public EquippedCosmetic.Builder mergeMetadata(Struct var1) {
         if (this.metadataBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0 && this.metadata_ != null && this.metadata_ != Struct.getDefaultInstance()) {
               this.getMetadataBuilder().mergeFrom(var1);
            } else {
               this.metadata_ = var1;
            }
         } else {
            this.metadataBuilder_.mergeFrom(var1);
         }

         if (this.metadata_ != null) {
            this.bitField0_ |= 2;
            this.onChanged();
         }

         return this;
      }

      public EquippedCosmetic.Builder clearMetadata() {
         this.bitField0_ &= -3;
         this.metadata_ = null;
         if (this.metadataBuilder_ != null) {
            this.metadataBuilder_.dispose();
            this.metadataBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Struct.Builder getMetadataBuilder() {
         this.bitField0_ |= 2;
         this.onChanged();
         return this.getMetadataFieldBuilder().getBuilder();
      }

      @Override
      public StructOrBuilder getMetadataOrBuilder() {
         if (this.metadataBuilder_ != null) {
            return this.metadataBuilder_.getMessageOrBuilder();
         } else {
            return this.metadata_ == null ? Struct.getDefaultInstance() : this.metadata_;
         }
      }

      private SingleFieldBuilderV3<Struct, Struct.Builder, StructOrBuilder> getMetadataFieldBuilder() {
         if (this.metadataBuilder_ == null) {
            this.metadataBuilder_ = new SingleFieldBuilderV3<>(this.getMetadata(), this.getParentForChildren(), this.isClean());
            this.metadata_ = null;
         }

         return this.metadataBuilder_;
      }

      public final EquippedCosmetic.Builder setUnknownFields(UnknownFieldSet var1) {
         return (EquippedCosmetic.Builder)super.setUnknownFields(var1);
      }

      public final EquippedCosmetic.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (EquippedCosmetic.Builder)super.mergeUnknownFields(var1);
      }
   }
}
