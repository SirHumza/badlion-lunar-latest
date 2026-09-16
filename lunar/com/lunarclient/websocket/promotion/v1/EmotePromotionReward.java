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

public final class EmotePromotionReward extends GeneratedMessageV3 implements EmotePromotionRewardOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int EMOTE_ID_FIELD_NUMBER = 1;
   private int emoteId_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final EmotePromotionReward DEFAULT_INSTANCE = new EmotePromotionReward();
   private static final Parser<EmotePromotionReward> PARSER = new AbstractParser<EmotePromotionReward>() {
      public EmotePromotionReward parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         EmotePromotionReward.Builder var3 = EmotePromotionReward.newBuilder();

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

   private EmotePromotionReward(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private EmotePromotionReward() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new EmotePromotionReward();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_promotion_v1_EmotePromotionReward_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_promotion_v1_EmotePromotionReward_fieldAccessorTable
         .ensureFieldAccessorsInitialized(EmotePromotionReward.class, EmotePromotionReward.Builder.class);
   }

   @Override
   public int getEmoteId() {
      return this.emoteId_;
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
      if (this.emoteId_ != 0) {
         var1.writeInt32(1, this.emoteId_);
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
      if (this.emoteId_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(1, this.emoteId_);
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

      if (!(var1 instanceof EmotePromotionReward)) {
         return super.equals(var1);
      }

      EmotePromotionReward var2 = (EmotePromotionReward)var1;
      return this.getEmoteId() != var2.getEmoteId() ? false : this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      var1 = 37 * var1 + 1;
      var1 = 53 * var1 + this.getEmoteId();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static EmotePromotionReward parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static EmotePromotionReward parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static EmotePromotionReward parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static EmotePromotionReward parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static EmotePromotionReward parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static EmotePromotionReward parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static EmotePromotionReward parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static EmotePromotionReward parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static EmotePromotionReward parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static EmotePromotionReward parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static EmotePromotionReward parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static EmotePromotionReward parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public EmotePromotionReward.Builder newBuilderForType() {
      return newBuilder();
   }

   public static EmotePromotionReward.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static EmotePromotionReward.Builder newBuilder(EmotePromotionReward var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public EmotePromotionReward.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new EmotePromotionReward.Builder() : new EmotePromotionReward.Builder().mergeFrom(this);
   }

   protected EmotePromotionReward.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new EmotePromotionReward.Builder(var1);
   }

   public static EmotePromotionReward getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<EmotePromotionReward> parser() {
      return PARSER;
   }

   @Override
   public Parser<EmotePromotionReward> getParserForType() {
      return PARSER;
   }

   public EmotePromotionReward getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<EmotePromotionReward.Builder> implements EmotePromotionRewardOrBuilder {
      private int bitField0_;
      private int emoteId_;

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_promotion_v1_EmotePromotionReward_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_promotion_v1_EmotePromotionReward_fieldAccessorTable
            .ensureFieldAccessorsInitialized(EmotePromotionReward.class, EmotePromotionReward.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public EmotePromotionReward.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.emoteId_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_promotion_v1_EmotePromotionReward_descriptor;
      }

      public EmotePromotionReward getDefaultInstanceForType() {
         return EmotePromotionReward.getDefaultInstance();
      }

      public EmotePromotionReward build() {
         EmotePromotionReward var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public EmotePromotionReward buildPartial() {
         EmotePromotionReward var1 = new EmotePromotionReward(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(EmotePromotionReward var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.emoteId_ = this.emoteId_;
         }
      }

      public EmotePromotionReward.Builder clone() {
         return (EmotePromotionReward.Builder)super.clone();
      }

      public EmotePromotionReward.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (EmotePromotionReward.Builder)super.setField(var1, var2);
      }

      public EmotePromotionReward.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (EmotePromotionReward.Builder)super.clearField(var1);
      }

      public EmotePromotionReward.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (EmotePromotionReward.Builder)super.clearOneof(var1);
      }

      public EmotePromotionReward.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (EmotePromotionReward.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public EmotePromotionReward.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (EmotePromotionReward.Builder)super.addRepeatedField(var1, var2);
      }

      public EmotePromotionReward.Builder mergeFrom(Message var1) {
         if (var1 instanceof EmotePromotionReward) {
            return this.mergeFrom((EmotePromotionReward)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public EmotePromotionReward.Builder mergeFrom(EmotePromotionReward var1) {
         if (var1 == EmotePromotionReward.getDefaultInstance()) {
            return this;
         }

         if (var1.getEmoteId() != 0) {
            this.setEmoteId(var1.getEmoteId());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public EmotePromotionReward.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.emoteId_ = var1.readInt32();
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
      public int getEmoteId() {
         return this.emoteId_;
      }

      public EmotePromotionReward.Builder setEmoteId(int var1) {
         this.emoteId_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public EmotePromotionReward.Builder clearEmoteId() {
         this.bitField0_ &= -2;
         this.emoteId_ = 0;
         this.onChanged();
         return this;
      }

      public final EmotePromotionReward.Builder setUnknownFields(UnknownFieldSet var1) {
         return (EmotePromotionReward.Builder)super.setUnknownFields(var1);
      }

      public final EmotePromotionReward.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (EmotePromotionReward.Builder)super.mergeUnknownFields(var1);
      }
   }
}
