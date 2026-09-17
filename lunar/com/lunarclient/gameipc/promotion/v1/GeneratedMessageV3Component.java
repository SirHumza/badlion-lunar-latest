package com.lunarclient.gameipc.promotion.v1;

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

public final class PlayPromotionRequest extends GeneratedMessageV3 implements PlayPromotionRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int TYPE_FIELD_NUMBER = 1;
   private int type_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final PlayPromotionRequest DEFAULT_INSTANCE = new PlayPromotionRequest();
   private static final Parser<PlayPromotionRequest> PARSER = new AbstractParser<PlayPromotionRequest>() {
      public PlayPromotionRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         PlayPromotionRequest.Builder var3 = PlayPromotionRequest.newBuilder();

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

   private PlayPromotionRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private PlayPromotionRequest() {
      this.type_ = 0;
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new PlayPromotionRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_gameipc_promotion_v1_PlayPromotionRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_gameipc_promotion_v1_PlayPromotionRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(PlayPromotionRequest.class, PlayPromotionRequest.Builder.class);
   }

   @Override
   public int getTypeValue() {
      return this.type_;
   }

   @Override
   public PromotionType getType() {
      PromotionType var1 = PromotionType.forNumber(this.type_);
      return var1 == null ? PromotionType.UNRECOGNIZED : var1;
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
      if (this.type_ != PromotionType.PROMOTION_TYPE_UNSPECIFIED.getNumber()) {
         var1.writeEnum(1, this.type_);
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
      if (this.type_ != PromotionType.PROMOTION_TYPE_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(1, this.type_);
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

      if (!(var1 instanceof PlayPromotionRequest)) {
         return super.equals(var1);
      }

      PlayPromotionRequest var2 = (PlayPromotionRequest)var1;
      return this.type_ != var2.type_ ? false : this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      var1 = 37 * var1 + 1;
      var1 = 53 * var1 + this.type_;
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static PlayPromotionRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static PlayPromotionRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static PlayPromotionRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static PlayPromotionRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static PlayPromotionRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static PlayPromotionRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static PlayPromotionRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PlayPromotionRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PlayPromotionRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static PlayPromotionRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static PlayPromotionRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PlayPromotionRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public PlayPromotionRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static PlayPromotionRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static PlayPromotionRequest.Builder newBuilder(PlayPromotionRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public PlayPromotionRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new PlayPromotionRequest.Builder() : new PlayPromotionRequest.Builder().mergeFrom(this);
   }

   protected PlayPromotionRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new PlayPromotionRequest.Builder(var1);
   }

   public static PlayPromotionRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<PlayPromotionRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<PlayPromotionRequest> getParserForType() {
      return PARSER;
   }

   public PlayPromotionRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<PlayPromotionRequest.Builder> implements PlayPromotionRequestOrBuilder {
      private int bitField0_;
      private int type_ = 0;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_gameipc_promotion_v1_PlayPromotionRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_gameipc_promotion_v1_PlayPromotionRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(PlayPromotionRequest.class, PlayPromotionRequest.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public PlayPromotionRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.type_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_gameipc_promotion_v1_PlayPromotionRequest_descriptor;
      }

      public PlayPromotionRequest getDefaultInstanceForType() {
         return PlayPromotionRequest.getDefaultInstance();
      }

      public PlayPromotionRequest build() {
         PlayPromotionRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public PlayPromotionRequest buildPartial() {
         PlayPromotionRequest var1 = new PlayPromotionRequest(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(PlayPromotionRequest var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.type_ = this.type_;
         }
      }

      public PlayPromotionRequest.Builder clone() {
         return (PlayPromotionRequest.Builder)super.clone();
      }

      public PlayPromotionRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (PlayPromotionRequest.Builder)super.setField(var1, var2);
      }

      public PlayPromotionRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (PlayPromotionRequest.Builder)super.clearField(var1);
      }

      public PlayPromotionRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (PlayPromotionRequest.Builder)super.clearOneof(var1);
      }

      public PlayPromotionRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (PlayPromotionRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public PlayPromotionRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (PlayPromotionRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public PlayPromotionRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof PlayPromotionRequest) {
            return this.mergeFrom((PlayPromotionRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public PlayPromotionRequest.Builder mergeFrom(PlayPromotionRequest var1) {
         if (var1 == PlayPromotionRequest.getDefaultInstance()) {
            return this;
         }

         if (var1.type_ != 0) {
            this.setTypeValue(var1.getTypeValue());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public PlayPromotionRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.type_ = var1.readEnum();
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
      public int getTypeValue() {
         return this.type_;
      }

      public PlayPromotionRequest.Builder setTypeValue(int var1) {
         this.type_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public PromotionType getType() {
         PromotionType var1 = PromotionType.forNumber(this.type_);
         return var1 == null ? PromotionType.UNRECOGNIZED : var1;
      }

      public PlayPromotionRequest.Builder setType(PromotionType var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 1;
         this.type_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public PlayPromotionRequest.Builder clearType() {
         this.bitField0_ &= -2;
         this.type_ = 0;
         this.onChanged();
         return this;
      }

      public final PlayPromotionRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (PlayPromotionRequest.Builder)super.setUnknownFields(var1);
      }

      public final PlayPromotionRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (PlayPromotionRequest.Builder)super.mergeUnknownFields(var1);
      }
   }
}
