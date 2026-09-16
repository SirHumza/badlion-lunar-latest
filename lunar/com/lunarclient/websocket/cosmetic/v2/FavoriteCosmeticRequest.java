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

public final class FavoriteCosmeticRequest extends GeneratedMessageV3 implements FavoriteCosmeticRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int COSMETIC_ID_FIELD_NUMBER = 1;
   private int cosmeticId_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final FavoriteCosmeticRequest DEFAULT_INSTANCE = new FavoriteCosmeticRequest();
   private static final Parser<FavoriteCosmeticRequest> PARSER = new AbstractParser<FavoriteCosmeticRequest>() {
      public FavoriteCosmeticRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         FavoriteCosmeticRequest.Builder var3 = FavoriteCosmeticRequest.newBuilder();

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

   private FavoriteCosmeticRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private FavoriteCosmeticRequest() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new FavoriteCosmeticRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_cosmetic_v2_FavoriteCosmeticRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_cosmetic_v2_FavoriteCosmeticRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(FavoriteCosmeticRequest.class, FavoriteCosmeticRequest.Builder.class);
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

      if (!(var1 instanceof FavoriteCosmeticRequest)) {
         return super.equals(var1);
      }

      FavoriteCosmeticRequest var2 = (FavoriteCosmeticRequest)var1;
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

   public static FavoriteCosmeticRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static FavoriteCosmeticRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static FavoriteCosmeticRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static FavoriteCosmeticRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static FavoriteCosmeticRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static FavoriteCosmeticRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static FavoriteCosmeticRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static FavoriteCosmeticRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static FavoriteCosmeticRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static FavoriteCosmeticRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static FavoriteCosmeticRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static FavoriteCosmeticRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public FavoriteCosmeticRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static FavoriteCosmeticRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static FavoriteCosmeticRequest.Builder newBuilder(FavoriteCosmeticRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public FavoriteCosmeticRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new FavoriteCosmeticRequest.Builder() : new FavoriteCosmeticRequest.Builder().mergeFrom(this);
   }

   protected FavoriteCosmeticRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new FavoriteCosmeticRequest.Builder(var1);
   }

   public static FavoriteCosmeticRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<FavoriteCosmeticRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<FavoriteCosmeticRequest> getParserForType() {
      return PARSER;
   }

   public FavoriteCosmeticRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<FavoriteCosmeticRequest.Builder> implements FavoriteCosmeticRequestOrBuilder {
      private int bitField0_;
      private int cosmeticId_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_cosmetic_v2_FavoriteCosmeticRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_cosmetic_v2_FavoriteCosmeticRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(FavoriteCosmeticRequest.class, FavoriteCosmeticRequest.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public FavoriteCosmeticRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.cosmeticId_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_cosmetic_v2_FavoriteCosmeticRequest_descriptor;
      }

      public FavoriteCosmeticRequest getDefaultInstanceForType() {
         return FavoriteCosmeticRequest.getDefaultInstance();
      }

      public FavoriteCosmeticRequest build() {
         FavoriteCosmeticRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public FavoriteCosmeticRequest buildPartial() {
         FavoriteCosmeticRequest var1 = new FavoriteCosmeticRequest(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(FavoriteCosmeticRequest var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.cosmeticId_ = this.cosmeticId_;
         }
      }

      public FavoriteCosmeticRequest.Builder clone() {
         return (FavoriteCosmeticRequest.Builder)super.clone();
      }

      public FavoriteCosmeticRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (FavoriteCosmeticRequest.Builder)super.setField(var1, var2);
      }

      public FavoriteCosmeticRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (FavoriteCosmeticRequest.Builder)super.clearField(var1);
      }

      public FavoriteCosmeticRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (FavoriteCosmeticRequest.Builder)super.clearOneof(var1);
      }

      public FavoriteCosmeticRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (FavoriteCosmeticRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public FavoriteCosmeticRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (FavoriteCosmeticRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public FavoriteCosmeticRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof FavoriteCosmeticRequest) {
            return this.mergeFrom((FavoriteCosmeticRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public FavoriteCosmeticRequest.Builder mergeFrom(FavoriteCosmeticRequest var1) {
         if (var1 == FavoriteCosmeticRequest.getDefaultInstance()) {
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

      public FavoriteCosmeticRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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

      public FavoriteCosmeticRequest.Builder setCosmeticId(int var1) {
         this.cosmeticId_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public FavoriteCosmeticRequest.Builder clearCosmeticId() {
         this.bitField0_ &= -2;
         this.cosmeticId_ = 0;
         this.onChanged();
         return this;
      }

      public final FavoriteCosmeticRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (FavoriteCosmeticRequest.Builder)super.setUnknownFields(var1);
      }

      public final FavoriteCosmeticRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (FavoriteCosmeticRequest.Builder)super.mergeUnknownFields(var1);
      }
   }
}
