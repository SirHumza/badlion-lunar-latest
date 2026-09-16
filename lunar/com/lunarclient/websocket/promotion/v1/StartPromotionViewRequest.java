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

public final class StartPromotionViewRequest extends GeneratedMessageV3 implements StartPromotionViewRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int PROMOTION_ID_FIELD_NUMBER = 1;
   private volatile Object promotionId_ = "";
   private byte memoizedIsInitialized = -1;
   private static final StartPromotionViewRequest DEFAULT_INSTANCE = new StartPromotionViewRequest();
   private static final Parser<StartPromotionViewRequest> PARSER = new AbstractParser<StartPromotionViewRequest>() {
      public StartPromotionViewRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         StartPromotionViewRequest.Builder var3 = StartPromotionViewRequest.newBuilder();

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

   private StartPromotionViewRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private StartPromotionViewRequest() {
      this.promotionId_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new StartPromotionViewRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_promotion_v1_StartPromotionViewRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_promotion_v1_StartPromotionViewRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(StartPromotionViewRequest.class, StartPromotionViewRequest.Builder.class);
   }

   @Override
   public String getPromotionId() {
      Object var1 = this.promotionId_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.promotionId_ = var3;
      return var3;
   }

   @Override
   public ByteString getPromotionIdBytes() {
      Object var1 = this.promotionId_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.promotionId_ = var2;
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
      if (!GeneratedMessageV3.isStringEmpty(this.promotionId_)) {
         GeneratedMessageV3.writeString(var1, 1, this.promotionId_);
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
      if (!GeneratedMessageV3.isStringEmpty(this.promotionId_)) {
         var1 += GeneratedMessageV3.computeStringSize(1, this.promotionId_);
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

      if (!(var1 instanceof StartPromotionViewRequest)) {
         return super.equals(var1);
      }

      StartPromotionViewRequest var2 = (StartPromotionViewRequest)var1;
      return !this.getPromotionId().equals(var2.getPromotionId()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      var1 = 37 * var1 + 1;
      var1 = 53 * var1 + this.getPromotionId().hashCode();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static StartPromotionViewRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static StartPromotionViewRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static StartPromotionViewRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static StartPromotionViewRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static StartPromotionViewRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static StartPromotionViewRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static StartPromotionViewRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static StartPromotionViewRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static StartPromotionViewRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static StartPromotionViewRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static StartPromotionViewRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static StartPromotionViewRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public StartPromotionViewRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static StartPromotionViewRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static StartPromotionViewRequest.Builder newBuilder(StartPromotionViewRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public StartPromotionViewRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new StartPromotionViewRequest.Builder() : new StartPromotionViewRequest.Builder().mergeFrom(this);
   }

   protected StartPromotionViewRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new StartPromotionViewRequest.Builder(var1);
   }

   public static StartPromotionViewRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<StartPromotionViewRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<StartPromotionViewRequest> getParserForType() {
      return PARSER;
   }

   public StartPromotionViewRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<StartPromotionViewRequest.Builder> implements StartPromotionViewRequestOrBuilder {
      private int bitField0_;
      private Object promotionId_ = "";

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_promotion_v1_StartPromotionViewRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_promotion_v1_StartPromotionViewRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(StartPromotionViewRequest.class, StartPromotionViewRequest.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public StartPromotionViewRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.promotionId_ = "";
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_promotion_v1_StartPromotionViewRequest_descriptor;
      }

      public StartPromotionViewRequest getDefaultInstanceForType() {
         return StartPromotionViewRequest.getDefaultInstance();
      }

      public StartPromotionViewRequest build() {
         StartPromotionViewRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public StartPromotionViewRequest buildPartial() {
         StartPromotionViewRequest var1 = new StartPromotionViewRequest(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(StartPromotionViewRequest var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.promotionId_ = this.promotionId_;
         }
      }

      public StartPromotionViewRequest.Builder clone() {
         return (StartPromotionViewRequest.Builder)super.clone();
      }

      public StartPromotionViewRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (StartPromotionViewRequest.Builder)super.setField(var1, var2);
      }

      public StartPromotionViewRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (StartPromotionViewRequest.Builder)super.clearField(var1);
      }

      public StartPromotionViewRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (StartPromotionViewRequest.Builder)super.clearOneof(var1);
      }

      public StartPromotionViewRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (StartPromotionViewRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public StartPromotionViewRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (StartPromotionViewRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public StartPromotionViewRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof StartPromotionViewRequest) {
            return this.mergeFrom((StartPromotionViewRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public StartPromotionViewRequest.Builder mergeFrom(StartPromotionViewRequest var1) {
         if (var1 == StartPromotionViewRequest.getDefaultInstance()) {
            return this;
         }

         if (!var1.getPromotionId().isEmpty()) {
            this.promotionId_ = var1.promotionId_;
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

      public StartPromotionViewRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.promotionId_ = var1.readStringRequireUtf8();
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
      public String getPromotionId() {
         Object var1 = this.promotionId_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.promotionId_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getPromotionIdBytes() {
         Object var1 = this.promotionId_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.promotionId_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public StartPromotionViewRequest.Builder setPromotionId(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.promotionId_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public StartPromotionViewRequest.Builder clearPromotionId() {
         this.promotionId_ = StartPromotionViewRequest.getDefaultInstance().getPromotionId();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public StartPromotionViewRequest.Builder setPromotionIdBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         StartPromotionViewRequest.checkByteStringIsUtf8(var1);
         this.promotionId_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public final StartPromotionViewRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (StartPromotionViewRequest.Builder)super.setUnknownFields(var1);
      }

      public final StartPromotionViewRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (StartPromotionViewRequest.Builder)super.mergeUnknownFields(var1);
      }
   }
}
