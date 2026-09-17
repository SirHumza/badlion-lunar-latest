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

public final class UnfavoriteCosmeticRequest extends GeneratedMessageV3 implements UnfavoriteCosmeticRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int COSMETIC_ID_FIELD_NUMBER = 1;
   private int cosmeticId_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final UnfavoriteCosmeticRequest DEFAULT_INSTANCE = new UnfavoriteCosmeticRequest();
   private static final Parser<UnfavoriteCosmeticRequest> PARSER = new AbstractParser<UnfavoriteCosmeticRequest>() {
      public UnfavoriteCosmeticRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         UnfavoriteCosmeticRequest.Builder var3 = UnfavoriteCosmeticRequest.newBuilder();

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

   private UnfavoriteCosmeticRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private UnfavoriteCosmeticRequest() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new UnfavoriteCosmeticRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_cosmetic_v2_UnfavoriteCosmeticRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_cosmetic_v2_UnfavoriteCosmeticRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(UnfavoriteCosmeticRequest.class, UnfavoriteCosmeticRequest.Builder.class);
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

      if (!(var1 instanceof UnfavoriteCosmeticRequest)) {
         return super.equals(var1);
      }

      UnfavoriteCosmeticRequest var2 = (UnfavoriteCosmeticRequest)var1;
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

   public static UnfavoriteCosmeticRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static UnfavoriteCosmeticRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UnfavoriteCosmeticRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static UnfavoriteCosmeticRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UnfavoriteCosmeticRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static UnfavoriteCosmeticRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UnfavoriteCosmeticRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UnfavoriteCosmeticRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static UnfavoriteCosmeticRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static UnfavoriteCosmeticRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static UnfavoriteCosmeticRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UnfavoriteCosmeticRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public UnfavoriteCosmeticRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static UnfavoriteCosmeticRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static UnfavoriteCosmeticRequest.Builder newBuilder(UnfavoriteCosmeticRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public UnfavoriteCosmeticRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new UnfavoriteCosmeticRequest.Builder() : new UnfavoriteCosmeticRequest.Builder().mergeFrom(this);
   }

   protected UnfavoriteCosmeticRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new UnfavoriteCosmeticRequest.Builder(var1);
   }

   public static UnfavoriteCosmeticRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<UnfavoriteCosmeticRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<UnfavoriteCosmeticRequest> getParserForType() {
      return PARSER;
   }

   public UnfavoriteCosmeticRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<UnfavoriteCosmeticRequest.Builder> implements UnfavoriteCosmeticRequestOrBuilder {
      private int bitField0_;
      private int cosmeticId_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_cosmetic_v2_UnfavoriteCosmeticRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_cosmetic_v2_UnfavoriteCosmeticRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(UnfavoriteCosmeticRequest.class, UnfavoriteCosmeticRequest.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public UnfavoriteCosmeticRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.cosmeticId_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_cosmetic_v2_UnfavoriteCosmeticRequest_descriptor;
      }

      public UnfavoriteCosmeticRequest getDefaultInstanceForType() {
         return UnfavoriteCosmeticRequest.getDefaultInstance();
      }

      public UnfavoriteCosmeticRequest build() {
         UnfavoriteCosmeticRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public UnfavoriteCosmeticRequest buildPartial() {
         UnfavoriteCosmeticRequest var1 = new UnfavoriteCosmeticRequest(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(UnfavoriteCosmeticRequest var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.cosmeticId_ = this.cosmeticId_;
         }
      }

      public UnfavoriteCosmeticRequest.Builder clone() {
         return (UnfavoriteCosmeticRequest.Builder)super.clone();
      }

      public UnfavoriteCosmeticRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (UnfavoriteCosmeticRequest.Builder)super.setField(var1, var2);
      }

      public UnfavoriteCosmeticRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (UnfavoriteCosmeticRequest.Builder)super.clearField(var1);
      }

      public UnfavoriteCosmeticRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (UnfavoriteCosmeticRequest.Builder)super.clearOneof(var1);
      }

      public UnfavoriteCosmeticRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (UnfavoriteCosmeticRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public UnfavoriteCosmeticRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (UnfavoriteCosmeticRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public UnfavoriteCosmeticRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof UnfavoriteCosmeticRequest) {
            return this.mergeFrom((UnfavoriteCosmeticRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public UnfavoriteCosmeticRequest.Builder mergeFrom(UnfavoriteCosmeticRequest var1) {
         if (var1 == UnfavoriteCosmeticRequest.getDefaultInstance()) {
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

      public UnfavoriteCosmeticRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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

      public UnfavoriteCosmeticRequest.Builder setCosmeticId(int var1) {
         this.cosmeticId_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public UnfavoriteCosmeticRequest.Builder clearCosmeticId() {
         this.bitField0_ &= -2;
         this.cosmeticId_ = 0;
         this.onChanged();
         return this;
      }

      public final UnfavoriteCosmeticRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (UnfavoriteCosmeticRequest.Builder)super.setUnknownFields(var1);
      }

      public final UnfavoriteCosmeticRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (UnfavoriteCosmeticRequest.Builder)super.mergeUnknownFields(var1);
      }
   }
}
