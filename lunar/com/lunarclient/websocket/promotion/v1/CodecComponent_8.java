package com.lunarclient.websocket.promotion.v1;

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

public final class CosmeticPromotionReward extends GeneratedMessageV3 implements CosmeticPromotionRewardOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int COSMETIC_ID_FIELD_NUMBER = 1;
   private int cosmeticId_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final CosmeticPromotionReward DEFAULT_INSTANCE = new CosmeticPromotionReward();
   private static final Parser<CosmeticPromotionReward> PARSER = new AbstractParser<CosmeticPromotionReward>() {
      public CosmeticPromotionReward parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         CosmeticPromotionReward.Builder var3 = CosmeticPromotionReward.newBuilder();

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

   private CosmeticPromotionReward(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private CosmeticPromotionReward() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new CosmeticPromotionReward();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_promotion_v1_CosmeticPromotionReward_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_promotion_v1_CosmeticPromotionReward_fieldAccessorTable
         .ensureFieldAccessorsInitialized(CosmeticPromotionReward.class, CosmeticPromotionReward.Builder.class);
   }

   @Override
   public int getCosmeticId() {
      return this.cosmeticId_;
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

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      }

      if (!(var1 instanceof CosmeticPromotionReward)) {
         return super.equals(var1);
      }

      CosmeticPromotionReward var2 = (CosmeticPromotionReward)var1;
      return this.getCosmeticId() != var2.getCosmeticId() ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static CosmeticPromotionReward parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static CosmeticPromotionReward parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static CosmeticPromotionReward parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static CosmeticPromotionReward parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static CosmeticPromotionReward parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static CosmeticPromotionReward parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static CosmeticPromotionReward parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static CosmeticPromotionReward parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static CosmeticPromotionReward parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static CosmeticPromotionReward parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static CosmeticPromotionReward parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static CosmeticPromotionReward parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public CosmeticPromotionReward.Builder newBuilderForType() {
      return newBuilder();
   }

   public static CosmeticPromotionReward.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static CosmeticPromotionReward.Builder newBuilder(CosmeticPromotionReward var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public CosmeticPromotionReward.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new CosmeticPromotionReward.Builder() : new CosmeticPromotionReward.Builder().mergeFrom(this);
   }

   protected CosmeticPromotionReward.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new CosmeticPromotionReward.Builder(var1);
   }

   public static CosmeticPromotionReward getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<CosmeticPromotionReward> parser() {
      return PARSER;
   }

   @Override
   public Parser<CosmeticPromotionReward> getParserForType() {
      return PARSER;
   }

   public CosmeticPromotionReward getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<CosmeticPromotionReward.Builder> implements CosmeticPromotionRewardOrBuilder {
      private int bitField0_;
      private int cosmeticId_;

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_promotion_v1_CosmeticPromotionReward_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_promotion_v1_CosmeticPromotionReward_fieldAccessorTable
            .ensureFieldAccessorsInitialized(CosmeticPromotionReward.class, CosmeticPromotionReward.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public CosmeticPromotionReward.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.cosmeticId_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_promotion_v1_CosmeticPromotionReward_descriptor;
      }

      public CosmeticPromotionReward getDefaultInstanceForType() {
         return CosmeticPromotionReward.getDefaultInstance();
      }

      public CosmeticPromotionReward build() {
         CosmeticPromotionReward var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public CosmeticPromotionReward buildPartial() {
         CosmeticPromotionReward var1 = new CosmeticPromotionReward(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(CosmeticPromotionReward var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.cosmeticId_ = this.cosmeticId_;
         }
      }

      public CosmeticPromotionReward.Builder clone() {
         return (CosmeticPromotionReward.Builder)super.clone();
      }

      public CosmeticPromotionReward.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (CosmeticPromotionReward.Builder)super.setField(var1, var2);
      }

      public CosmeticPromotionReward.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (CosmeticPromotionReward.Builder)super.clearField(var1);
      }

      public CosmeticPromotionReward.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (CosmeticPromotionReward.Builder)super.clearOneof(var1);
      }

      public CosmeticPromotionReward.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (CosmeticPromotionReward.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public CosmeticPromotionReward.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (CosmeticPromotionReward.Builder)super.addRepeatedField(var1, var2);
      }

      public CosmeticPromotionReward.Builder mergeFrom(Message var1) {
         if (var1 instanceof CosmeticPromotionReward) {
            return this.mergeFrom((CosmeticPromotionReward)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public CosmeticPromotionReward.Builder mergeFrom(CosmeticPromotionReward var1) {
         if (var1 == CosmeticPromotionReward.getDefaultInstance()) {
            return this;
         }

         if (var1.getCosmeticId() != 0) {
            this.setCosmeticId(var1.getCosmeticId());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public CosmeticPromotionReward.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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

      public CosmeticPromotionReward.Builder setCosmeticId(int var1) {
         this.cosmeticId_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public CosmeticPromotionReward.Builder clearCosmeticId() {
         this.bitField0_ &= -2;
         this.cosmeticId_ = 0;
         this.onChanged();
         return this;
      }

      public final CosmeticPromotionReward.Builder setUnknownFields(UnknownFieldSet var1) {
         return (CosmeticPromotionReward.Builder)super.setUnknownFields(var1);
      }

      public final CosmeticPromotionReward.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (CosmeticPromotionReward.Builder)super.mergeUnknownFields(var1);
      }
   }
}
