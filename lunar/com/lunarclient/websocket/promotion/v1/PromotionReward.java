package com.lunarclient.websocket.promotion.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class PromotionReward extends GeneratedMessageV3 implements PromotionRewardOrBuilder {
   private static final long serialVersionUID = 0L;
   private int rewardCase_ = 0;
   private Object reward_;
   public static final int COSMETIC_FIELD_NUMBER = 1;
   public static final int EMOTE_FIELD_NUMBER = 2;
   public static final int SPRAY_FIELD_NUMBER = 3;
   public static final int BADGE_FIELD_NUMBER = 4;
   private byte memoizedIsInitialized = -1;
   private static final PromotionReward DEFAULT_INSTANCE = new PromotionReward();
   private static final Parser<PromotionReward> PARSER = new AbstractParser<PromotionReward>() {
      public PromotionReward parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         PromotionReward.Builder var3 = PromotionReward.newBuilder();

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

   private PromotionReward(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private PromotionReward() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new PromotionReward();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_promotion_v1_PromotionReward_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_promotion_v1_PromotionReward_fieldAccessorTable
         .ensureFieldAccessorsInitialized(PromotionReward.class, PromotionReward.Builder.class);
   }

   @Override
   public PromotionReward.RewardCase getRewardCase() {
      return PromotionReward.RewardCase.forNumber(this.rewardCase_);
   }

   @Override
   public boolean hasCosmetic() {
      return this.rewardCase_ == 1;
   }

   @Override
   public CosmeticPromotionReward getCosmetic() {
      return this.rewardCase_ == 1 ? (CosmeticPromotionReward)this.reward_ : CosmeticPromotionReward.getDefaultInstance();
   }

   @Override
   public CosmeticPromotionRewardOrBuilder getCosmeticOrBuilder() {
      return this.rewardCase_ == 1 ? (CosmeticPromotionReward)this.reward_ : CosmeticPromotionReward.getDefaultInstance();
   }

   @Override
   public boolean hasEmote() {
      return this.rewardCase_ == 2;
   }

   @Override
   public EmotePromotionReward getEmote() {
      return this.rewardCase_ == 2 ? (EmotePromotionReward)this.reward_ : EmotePromotionReward.getDefaultInstance();
   }

   @Override
   public EmotePromotionRewardOrBuilder getEmoteOrBuilder() {
      return this.rewardCase_ == 2 ? (EmotePromotionReward)this.reward_ : EmotePromotionReward.getDefaultInstance();
   }

   @Override
   public boolean hasSpray() {
      return this.rewardCase_ == 3;
   }

   @Override
   public SprayPromotionReward getSpray() {
      return this.rewardCase_ == 3 ? (SprayPromotionReward)this.reward_ : SprayPromotionReward.getDefaultInstance();
   }

   @Override
   public SprayPromotionRewardOrBuilder getSprayOrBuilder() {
      return this.rewardCase_ == 3 ? (SprayPromotionReward)this.reward_ : SprayPromotionReward.getDefaultInstance();
   }

   @Override
   public boolean hasBadge() {
      return this.rewardCase_ == 4;
   }

   @Override
   public BadgePromotionReward getBadge() {
      return this.rewardCase_ == 4 ? (BadgePromotionReward)this.reward_ : BadgePromotionReward.getDefaultInstance();
   }

   @Override
   public BadgePromotionRewardOrBuilder getBadgeOrBuilder() {
      return this.rewardCase_ == 4 ? (BadgePromotionReward)this.reward_ : BadgePromotionReward.getDefaultInstance();
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
      if (this.rewardCase_ == 1) {
         var1.writeMessage(1, (CosmeticPromotionReward)this.reward_);
      }

      if (this.rewardCase_ == 2) {
         var1.writeMessage(2, (EmotePromotionReward)this.reward_);
      }

      if (this.rewardCase_ == 3) {
         var1.writeMessage(3, (SprayPromotionReward)this.reward_);
      }

      if (this.rewardCase_ == 4) {
         var1.writeMessage(4, (BadgePromotionReward)this.reward_);
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
      if (this.rewardCase_ == 1) {
         var1 += CodedOutputStream.computeMessageSize(1, (CosmeticPromotionReward)this.reward_);
      }

      if (this.rewardCase_ == 2) {
         var1 += CodedOutputStream.computeMessageSize(2, (EmotePromotionReward)this.reward_);
      }

      if (this.rewardCase_ == 3) {
         var1 += CodedOutputStream.computeMessageSize(3, (SprayPromotionReward)this.reward_);
      }

      if (this.rewardCase_ == 4) {
         var1 += CodedOutputStream.computeMessageSize(4, (BadgePromotionReward)this.reward_);
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

      if (!(var1 instanceof PromotionReward)) {
         return super.equals(var1);
      }

      PromotionReward var2 = (PromotionReward)var1;
      if (!this.getRewardCase().equals(var2.getRewardCase())) {
         return false;
      }

      switch (this.rewardCase_) {
         case 0:
         default:
            break;
         case 1:
            if (!this.getCosmetic().equals(var2.getCosmetic())) {
               return false;
            }
            break;
         case 2:
            if (!this.getEmote().equals(var2.getEmote())) {
               return false;
            }
            break;
         case 3:
            if (!this.getSpray().equals(var2.getSpray())) {
               return false;
            }
            break;
         case 4:
            if (!this.getBadge().equals(var2.getBadge())) {
               return false;
            }
      }

      return this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      switch (this.rewardCase_) {
         case 0:
         default:
            break;
         case 1:
            var1 = 37 * var1 + 1;
            var1 = 53 * var1 + this.getCosmetic().hashCode();
            break;
         case 2:
            var1 = 37 * var1 + 2;
            var1 = 53 * var1 + this.getEmote().hashCode();
            break;
         case 3:
            var1 = 37 * var1 + 3;
            var1 = 53 * var1 + this.getSpray().hashCode();
            break;
         case 4:
            var1 = 37 * var1 + 4;
            var1 = 53 * var1 + this.getBadge().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static PromotionReward parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static PromotionReward parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static PromotionReward parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static PromotionReward parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static PromotionReward parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static PromotionReward parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static PromotionReward parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PromotionReward parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PromotionReward parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static PromotionReward parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static PromotionReward parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PromotionReward parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public PromotionReward.Builder newBuilderForType() {
      return newBuilder();
   }

   public static PromotionReward.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static PromotionReward.Builder newBuilder(PromotionReward var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public PromotionReward.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new PromotionReward.Builder() : new PromotionReward.Builder().mergeFrom(this);
   }

   protected PromotionReward.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new PromotionReward.Builder(var1);
   }

   public static PromotionReward getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<PromotionReward> parser() {
      return PARSER;
   }

   @Override
   public Parser<PromotionReward> getParserForType() {
      return PARSER;
   }

   public PromotionReward getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<PromotionReward.Builder> implements PromotionRewardOrBuilder {
      private int rewardCase_ = 0;
      private Object reward_;
      private int bitField0_;
      private SingleFieldBuilderV3<CosmeticPromotionReward, CosmeticPromotionReward.Builder, CosmeticPromotionRewardOrBuilder> cosmeticBuilder_;
      private SingleFieldBuilderV3<EmotePromotionReward, EmotePromotionReward.Builder, EmotePromotionRewardOrBuilder> emoteBuilder_;
      private SingleFieldBuilderV3<SprayPromotionReward, SprayPromotionReward.Builder, SprayPromotionRewardOrBuilder> sprayBuilder_;
      private SingleFieldBuilderV3<BadgePromotionReward, BadgePromotionReward.Builder, BadgePromotionRewardOrBuilder> badgeBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_promotion_v1_PromotionReward_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_promotion_v1_PromotionReward_fieldAccessorTable
            .ensureFieldAccessorsInitialized(PromotionReward.class, PromotionReward.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public PromotionReward.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         if (this.cosmeticBuilder_ != null) {
            this.cosmeticBuilder_.clear();
         }

         if (this.emoteBuilder_ != null) {
            this.emoteBuilder_.clear();
         }

         if (this.sprayBuilder_ != null) {
            this.sprayBuilder_.clear();
         }

         if (this.badgeBuilder_ != null) {
            this.badgeBuilder_.clear();
         }

         this.rewardCase_ = 0;
         this.reward_ = null;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_promotion_v1_PromotionReward_descriptor;
      }

      public PromotionReward getDefaultInstanceForType() {
         return PromotionReward.getDefaultInstance();
      }

      public PromotionReward build() {
         PromotionReward var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public PromotionReward buildPartial() {
         PromotionReward var1 = new PromotionReward(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.buildPartialOneofs(var1);
         this.onBuilt();
         return var1;
      }

      private void buildPartial0(PromotionReward var1) {
         int var2 = this.bitField0_;
      }

      private void buildPartialOneofs(PromotionReward var1) {
         var1.rewardCase_ = this.rewardCase_;
         var1.reward_ = this.reward_;
         if (this.rewardCase_ == 1 && this.cosmeticBuilder_ != null) {
            var1.reward_ = this.cosmeticBuilder_.build();
         }

         if (this.rewardCase_ == 2 && this.emoteBuilder_ != null) {
            var1.reward_ = this.emoteBuilder_.build();
         }

         if (this.rewardCase_ == 3 && this.sprayBuilder_ != null) {
            var1.reward_ = this.sprayBuilder_.build();
         }

         if (this.rewardCase_ == 4 && this.badgeBuilder_ != null) {
            var1.reward_ = this.badgeBuilder_.build();
         }
      }

      public PromotionReward.Builder clone() {
         return (PromotionReward.Builder)super.clone();
      }

      public PromotionReward.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (PromotionReward.Builder)super.setField(var1, var2);
      }

      public PromotionReward.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (PromotionReward.Builder)super.clearField(var1);
      }

      public PromotionReward.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (PromotionReward.Builder)super.clearOneof(var1);
      }

      public PromotionReward.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (PromotionReward.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public PromotionReward.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (PromotionReward.Builder)super.addRepeatedField(var1, var2);
      }

      public PromotionReward.Builder mergeFrom(Message var1) {
         if (var1 instanceof PromotionReward) {
            return this.mergeFrom((PromotionReward)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public PromotionReward.Builder mergeFrom(PromotionReward var1) {
         if (var1 == PromotionReward.getDefaultInstance()) {
            return this;
         }

         switch (var1.getRewardCase()) {
            case COSMETIC:
               this.mergeCosmetic(var1.getCosmetic());
               break;
            case EMOTE:
               this.mergeEmote(var1.getEmote());
               break;
            case SPRAY:
               this.mergeSpray(var1.getSpray());
               break;
            case BADGE:
               this.mergeBadge(var1.getBadge());
            case REWARD_NOT_SET:
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public PromotionReward.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getCosmeticFieldBuilder().getBuilder(), var2);
                     this.rewardCase_ = 1;
                     break;
                  case 18:
                     var1.readMessage(this.getEmoteFieldBuilder().getBuilder(), var2);
                     this.rewardCase_ = 2;
                     break;
                  case 26:
                     var1.readMessage(this.getSprayFieldBuilder().getBuilder(), var2);
                     this.rewardCase_ = 3;
                     break;
                  case 34:
                     var1.readMessage(this.getBadgeFieldBuilder().getBuilder(), var2);
                     this.rewardCase_ = 4;
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
      public PromotionReward.RewardCase getRewardCase() {
         return PromotionReward.RewardCase.forNumber(this.rewardCase_);
      }

      public PromotionReward.Builder clearReward() {
         this.rewardCase_ = 0;
         this.reward_ = null;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasCosmetic() {
         return this.rewardCase_ == 1;
      }

      @Override
      public CosmeticPromotionReward getCosmetic() {
         if (this.cosmeticBuilder_ == null) {
            return this.rewardCase_ == 1 ? (CosmeticPromotionReward)this.reward_ : CosmeticPromotionReward.getDefaultInstance();
         } else {
            return this.rewardCase_ == 1 ? this.cosmeticBuilder_.getMessage() : CosmeticPromotionReward.getDefaultInstance();
         }
      }

      public PromotionReward.Builder setCosmetic(CosmeticPromotionReward var1) {
         if (this.cosmeticBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.reward_ = var1;
            this.onChanged();
         } else {
            this.cosmeticBuilder_.setMessage(var1);
         }

         this.rewardCase_ = 1;
         return this;
      }

      public PromotionReward.Builder setCosmetic(CosmeticPromotionReward.Builder var1) {
         if (this.cosmeticBuilder_ == null) {
            this.reward_ = var1.build();
            this.onChanged();
         } else {
            this.cosmeticBuilder_.setMessage(var1.build());
         }

         this.rewardCase_ = 1;
         return this;
      }

      public PromotionReward.Builder mergeCosmetic(CosmeticPromotionReward var1) {
         if (this.cosmeticBuilder_ == null) {
            if (this.rewardCase_ == 1 && this.reward_ != CosmeticPromotionReward.getDefaultInstance()) {
               this.reward_ = CosmeticPromotionReward.newBuilder((CosmeticPromotionReward)this.reward_).mergeFrom(var1).buildPartial();
            } else {
               this.reward_ = var1;
            }

            this.onChanged();
         } else if (this.rewardCase_ == 1) {
            this.cosmeticBuilder_.mergeFrom(var1);
         } else {
            this.cosmeticBuilder_.setMessage(var1);
         }

         this.rewardCase_ = 1;
         return this;
      }

      public PromotionReward.Builder clearCosmetic() {
         if (this.cosmeticBuilder_ == null) {
            if (this.rewardCase_ == 1) {
               this.rewardCase_ = 0;
               this.reward_ = null;
               this.onChanged();
            }
         } else {
            if (this.rewardCase_ == 1) {
               this.rewardCase_ = 0;
               this.reward_ = null;
            }

            this.cosmeticBuilder_.clear();
         }

         return this;
      }

      public CosmeticPromotionReward.Builder getCosmeticBuilder() {
         return this.getCosmeticFieldBuilder().getBuilder();
      }

      @Override
      public CosmeticPromotionRewardOrBuilder getCosmeticOrBuilder() {
         if (this.rewardCase_ == 1 && this.cosmeticBuilder_ != null) {
            return this.cosmeticBuilder_.getMessageOrBuilder();
         } else {
            return this.rewardCase_ == 1 ? (CosmeticPromotionReward)this.reward_ : CosmeticPromotionReward.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<CosmeticPromotionReward, CosmeticPromotionReward.Builder, CosmeticPromotionRewardOrBuilder> getCosmeticFieldBuilder() {
         if (this.cosmeticBuilder_ == null) {
            if (this.rewardCase_ != 1) {
               this.reward_ = CosmeticPromotionReward.getDefaultInstance();
            }

            this.cosmeticBuilder_ = new SingleFieldBuilderV3<>((CosmeticPromotionReward)this.reward_, this.getParentForChildren(), this.isClean());
            this.reward_ = null;
         }

         this.rewardCase_ = 1;
         this.onChanged();
         return this.cosmeticBuilder_;
      }

      @Override
      public boolean hasEmote() {
         return this.rewardCase_ == 2;
      }

      @Override
      public EmotePromotionReward getEmote() {
         if (this.emoteBuilder_ == null) {
            return this.rewardCase_ == 2 ? (EmotePromotionReward)this.reward_ : EmotePromotionReward.getDefaultInstance();
         } else {
            return this.rewardCase_ == 2 ? this.emoteBuilder_.getMessage() : EmotePromotionReward.getDefaultInstance();
         }
      }

      public PromotionReward.Builder setEmote(EmotePromotionReward var1) {
         if (this.emoteBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.reward_ = var1;
            this.onChanged();
         } else {
            this.emoteBuilder_.setMessage(var1);
         }

         this.rewardCase_ = 2;
         return this;
      }

      public PromotionReward.Builder setEmote(EmotePromotionReward.Builder var1) {
         if (this.emoteBuilder_ == null) {
            this.reward_ = var1.build();
            this.onChanged();
         } else {
            this.emoteBuilder_.setMessage(var1.build());
         }

         this.rewardCase_ = 2;
         return this;
      }

      public PromotionReward.Builder mergeEmote(EmotePromotionReward var1) {
         if (this.emoteBuilder_ == null) {
            if (this.rewardCase_ == 2 && this.reward_ != EmotePromotionReward.getDefaultInstance()) {
               this.reward_ = EmotePromotionReward.newBuilder((EmotePromotionReward)this.reward_).mergeFrom(var1).buildPartial();
            } else {
               this.reward_ = var1;
            }

            this.onChanged();
         } else if (this.rewardCase_ == 2) {
            this.emoteBuilder_.mergeFrom(var1);
         } else {
            this.emoteBuilder_.setMessage(var1);
         }

         this.rewardCase_ = 2;
         return this;
      }

      public PromotionReward.Builder clearEmote() {
         if (this.emoteBuilder_ == null) {
            if (this.rewardCase_ == 2) {
               this.rewardCase_ = 0;
               this.reward_ = null;
               this.onChanged();
            }
         } else {
            if (this.rewardCase_ == 2) {
               this.rewardCase_ = 0;
               this.reward_ = null;
            }

            this.emoteBuilder_.clear();
         }

         return this;
      }

      public EmotePromotionReward.Builder getEmoteBuilder() {
         return this.getEmoteFieldBuilder().getBuilder();
      }

      @Override
      public EmotePromotionRewardOrBuilder getEmoteOrBuilder() {
         if (this.rewardCase_ == 2 && this.emoteBuilder_ != null) {
            return this.emoteBuilder_.getMessageOrBuilder();
         } else {
            return this.rewardCase_ == 2 ? (EmotePromotionReward)this.reward_ : EmotePromotionReward.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<EmotePromotionReward, EmotePromotionReward.Builder, EmotePromotionRewardOrBuilder> getEmoteFieldBuilder() {
         if (this.emoteBuilder_ == null) {
            if (this.rewardCase_ != 2) {
               this.reward_ = EmotePromotionReward.getDefaultInstance();
            }

            this.emoteBuilder_ = new SingleFieldBuilderV3<>((EmotePromotionReward)this.reward_, this.getParentForChildren(), this.isClean());
            this.reward_ = null;
         }

         this.rewardCase_ = 2;
         this.onChanged();
         return this.emoteBuilder_;
      }

      @Override
      public boolean hasSpray() {
         return this.rewardCase_ == 3;
      }

      @Override
      public SprayPromotionReward getSpray() {
         if (this.sprayBuilder_ == null) {
            return this.rewardCase_ == 3 ? (SprayPromotionReward)this.reward_ : SprayPromotionReward.getDefaultInstance();
         } else {
            return this.rewardCase_ == 3 ? this.sprayBuilder_.getMessage() : SprayPromotionReward.getDefaultInstance();
         }
      }

      public PromotionReward.Builder setSpray(SprayPromotionReward var1) {
         if (this.sprayBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.reward_ = var1;
            this.onChanged();
         } else {
            this.sprayBuilder_.setMessage(var1);
         }

         this.rewardCase_ = 3;
         return this;
      }

      public PromotionReward.Builder setSpray(SprayPromotionReward.Builder var1) {
         if (this.sprayBuilder_ == null) {
            this.reward_ = var1.build();
            this.onChanged();
         } else {
            this.sprayBuilder_.setMessage(var1.build());
         }

         this.rewardCase_ = 3;
         return this;
      }

      public PromotionReward.Builder mergeSpray(SprayPromotionReward var1) {
         if (this.sprayBuilder_ == null) {
            if (this.rewardCase_ == 3 && this.reward_ != SprayPromotionReward.getDefaultInstance()) {
               this.reward_ = SprayPromotionReward.newBuilder((SprayPromotionReward)this.reward_).mergeFrom(var1).buildPartial();
            } else {
               this.reward_ = var1;
            }

            this.onChanged();
         } else if (this.rewardCase_ == 3) {
            this.sprayBuilder_.mergeFrom(var1);
         } else {
            this.sprayBuilder_.setMessage(var1);
         }

         this.rewardCase_ = 3;
         return this;
      }

      public PromotionReward.Builder clearSpray() {
         if (this.sprayBuilder_ == null) {
            if (this.rewardCase_ == 3) {
               this.rewardCase_ = 0;
               this.reward_ = null;
               this.onChanged();
            }
         } else {
            if (this.rewardCase_ == 3) {
               this.rewardCase_ = 0;
               this.reward_ = null;
            }

            this.sprayBuilder_.clear();
         }

         return this;
      }

      public SprayPromotionReward.Builder getSprayBuilder() {
         return this.getSprayFieldBuilder().getBuilder();
      }

      @Override
      public SprayPromotionRewardOrBuilder getSprayOrBuilder() {
         if (this.rewardCase_ == 3 && this.sprayBuilder_ != null) {
            return this.sprayBuilder_.getMessageOrBuilder();
         } else {
            return this.rewardCase_ == 3 ? (SprayPromotionReward)this.reward_ : SprayPromotionReward.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<SprayPromotionReward, SprayPromotionReward.Builder, SprayPromotionRewardOrBuilder> getSprayFieldBuilder() {
         if (this.sprayBuilder_ == null) {
            if (this.rewardCase_ != 3) {
               this.reward_ = SprayPromotionReward.getDefaultInstance();
            }

            this.sprayBuilder_ = new SingleFieldBuilderV3<>((SprayPromotionReward)this.reward_, this.getParentForChildren(), this.isClean());
            this.reward_ = null;
         }

         this.rewardCase_ = 3;
         this.onChanged();
         return this.sprayBuilder_;
      }

      @Override
      public boolean hasBadge() {
         return this.rewardCase_ == 4;
      }

      @Override
      public BadgePromotionReward getBadge() {
         if (this.badgeBuilder_ == null) {
            return this.rewardCase_ == 4 ? (BadgePromotionReward)this.reward_ : BadgePromotionReward.getDefaultInstance();
         } else {
            return this.rewardCase_ == 4 ? this.badgeBuilder_.getMessage() : BadgePromotionReward.getDefaultInstance();
         }
      }

      public PromotionReward.Builder setBadge(BadgePromotionReward var1) {
         if (this.badgeBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.reward_ = var1;
            this.onChanged();
         } else {
            this.badgeBuilder_.setMessage(var1);
         }

         this.rewardCase_ = 4;
         return this;
      }

      public PromotionReward.Builder setBadge(BadgePromotionReward.Builder var1) {
         if (this.badgeBuilder_ == null) {
            this.reward_ = var1.build();
            this.onChanged();
         } else {
            this.badgeBuilder_.setMessage(var1.build());
         }

         this.rewardCase_ = 4;
         return this;
      }

      public PromotionReward.Builder mergeBadge(BadgePromotionReward var1) {
         if (this.badgeBuilder_ == null) {
            if (this.rewardCase_ == 4 && this.reward_ != BadgePromotionReward.getDefaultInstance()) {
               this.reward_ = BadgePromotionReward.newBuilder((BadgePromotionReward)this.reward_).mergeFrom(var1).buildPartial();
            } else {
               this.reward_ = var1;
            }

            this.onChanged();
         } else if (this.rewardCase_ == 4) {
            this.badgeBuilder_.mergeFrom(var1);
         } else {
            this.badgeBuilder_.setMessage(var1);
         }

         this.rewardCase_ = 4;
         return this;
      }

      public PromotionReward.Builder clearBadge() {
         if (this.badgeBuilder_ == null) {
            if (this.rewardCase_ == 4) {
               this.rewardCase_ = 0;
               this.reward_ = null;
               this.onChanged();
            }
         } else {
            if (this.rewardCase_ == 4) {
               this.rewardCase_ = 0;
               this.reward_ = null;
            }

            this.badgeBuilder_.clear();
         }

         return this;
      }

      public BadgePromotionReward.Builder getBadgeBuilder() {
         return this.getBadgeFieldBuilder().getBuilder();
      }

      @Override
      public BadgePromotionRewardOrBuilder getBadgeOrBuilder() {
         if (this.rewardCase_ == 4 && this.badgeBuilder_ != null) {
            return this.badgeBuilder_.getMessageOrBuilder();
         } else {
            return this.rewardCase_ == 4 ? (BadgePromotionReward)this.reward_ : BadgePromotionReward.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<BadgePromotionReward, BadgePromotionReward.Builder, BadgePromotionRewardOrBuilder> getBadgeFieldBuilder() {
         if (this.badgeBuilder_ == null) {
            if (this.rewardCase_ != 4) {
               this.reward_ = BadgePromotionReward.getDefaultInstance();
            }

            this.badgeBuilder_ = new SingleFieldBuilderV3<>((BadgePromotionReward)this.reward_, this.getParentForChildren(), this.isClean());
            this.reward_ = null;
         }

         this.rewardCase_ = 4;
         this.onChanged();
         return this.badgeBuilder_;
      }

      public final PromotionReward.Builder setUnknownFields(UnknownFieldSet var1) {
         return (PromotionReward.Builder)super.setUnknownFields(var1);
      }

      public final PromotionReward.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (PromotionReward.Builder)super.mergeUnknownFields(var1);
      }
   }

   public enum RewardCase implements AbstractMessageLite.InternalOneOfEnum, Internal.EnumLite {
      COSMETIC(1),
      EMOTE(2),
      SPRAY(3),
      BADGE(4),
      REWARD_NOT_SET(0);

      private final int value;

      RewardCase(int var3) {
         this.value = var3;
      }

      @Deprecated
      public static PromotionReward.RewardCase valueOf(int var0) {
         return forNumber(var0);
      }

      public static PromotionReward.RewardCase forNumber(int var0) {
         switch (var0) {
            case 0:
               return REWARD_NOT_SET;
            case 1:
               return COSMETIC;
            case 2:
               return EMOTE;
            case 3:
               return SPRAY;
            case 4:
               return BADGE;
            default:
               return null;
         }
      }

      @Override
      public int getNumber() {
         return this.value;
      }
   }
}
