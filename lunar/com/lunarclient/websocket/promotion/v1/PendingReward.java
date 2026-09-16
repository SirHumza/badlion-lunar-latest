package com.lunarclient.websocket.promotion.v1;

import com.google.protobuf.AbstractMessageLite;
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
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class PendingReward extends GeneratedMessageV3 implements PendingRewardOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int TYPE_FIELD_NUMBER = 1;
   private int type_ = 0;
   public static final int REWARDS_FIELD_NUMBER = 2;
   private List<PromotionReward> rewards_;
   private byte memoizedIsInitialized = -1;
   private static final PendingReward DEFAULT_INSTANCE = new PendingReward();
   private static final Parser<PendingReward> PARSER = new AbstractParser<PendingReward>() {
      public PendingReward parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         PendingReward.Builder var3 = PendingReward.newBuilder();

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

   private PendingReward(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private PendingReward() {
      this.type_ = 0;
      this.rewards_ = Collections.emptyList();
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new PendingReward();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_promotion_v1_PendingReward_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_promotion_v1_PendingReward_fieldAccessorTable
         .ensureFieldAccessorsInitialized(PendingReward.class, PendingReward.Builder.class);
   }

   @Override
   public int getTypeValue() {
      return this.type_;
   }

   @Override
   public PendingRewardType getType() {
      PendingRewardType var1 = PendingRewardType.forNumber(this.type_);
      return var1 == null ? PendingRewardType.UNRECOGNIZED : var1;
   }

   @Override
   public List<PromotionReward> getRewardsList() {
      return this.rewards_;
   }

   @Override
   public List<? extends PromotionRewardOrBuilder> getRewardsOrBuilderList() {
      return this.rewards_;
   }

   @Override
   public int getRewardsCount() {
      return this.rewards_.size();
   }

   @Override
   public PromotionReward getRewards(int var1) {
      return this.rewards_.get(var1);
   }

   @Override
   public PromotionRewardOrBuilder getRewardsOrBuilder(int var1) {
      return this.rewards_.get(var1);
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
      if (this.type_ != PendingRewardType.PENDING_REWARD_TYPE_UNSPECIFIED.getNumber()) {
         var1.writeEnum(1, this.type_);
      }

      for (int var2 = 0; var2 < this.rewards_.size(); var2++) {
         var1.writeMessage(2, this.rewards_.get(var2));
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
      if (this.type_ != PendingRewardType.PENDING_REWARD_TYPE_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(1, this.type_);
      }

      for (int var2 = 0; var2 < this.rewards_.size(); var2++) {
         var1 += CodedOutputStream.computeMessageSize(2, this.rewards_.get(var2));
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof PendingReward)) {
         return super.equals(var1);
      } else {
         PendingReward var2 = (PendingReward)var1;
         if (this.type_ != var2.type_) {
            return false;
         } else {
            return !this.getRewardsList().equals(var2.getRewardsList()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + this.type_;
      if (this.getRewardsCount() > 0) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getRewardsList().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static PendingReward parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static PendingReward parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static PendingReward parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static PendingReward parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static PendingReward parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static PendingReward parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static PendingReward parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PendingReward parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PendingReward parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static PendingReward parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static PendingReward parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PendingReward parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public PendingReward.Builder newBuilderForType() {
      return newBuilder();
   }

   public static PendingReward.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static PendingReward.Builder newBuilder(PendingReward var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public PendingReward.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new PendingReward.Builder() : new PendingReward.Builder().mergeFrom(this);
   }

   protected PendingReward.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new PendingReward.Builder(var1);
   }

   public static PendingReward getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<PendingReward> parser() {
      return PARSER;
   }

   @Override
   public Parser<PendingReward> getParserForType() {
      return PARSER;
   }

   public PendingReward getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<PendingReward.Builder> implements PendingRewardOrBuilder {
      private int bitField0_;
      private int type_ = 0;
      private List<PromotionReward> rewards_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<PromotionReward, PromotionReward.Builder, PromotionRewardOrBuilder> rewardsBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_promotion_v1_PendingReward_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_promotion_v1_PendingReward_fieldAccessorTable
            .ensureFieldAccessorsInitialized(PendingReward.class, PendingReward.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public PendingReward.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.type_ = 0;
         if (this.rewardsBuilder_ == null) {
            this.rewards_ = Collections.emptyList();
         } else {
            this.rewards_ = null;
            this.rewardsBuilder_.clear();
         }

         this.bitField0_ &= -3;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_promotion_v1_PendingReward_descriptor;
      }

      public PendingReward getDefaultInstanceForType() {
         return PendingReward.getDefaultInstance();
      }

      public PendingReward build() {
         PendingReward var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public PendingReward buildPartial() {
         PendingReward var1 = new PendingReward(this);
         this.buildPartialRepeatedFields(var1);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartialRepeatedFields(PendingReward var1) {
         if (this.rewardsBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0) {
               this.rewards_ = Collections.unmodifiableList(this.rewards_);
               this.bitField0_ &= -3;
            }

            var1.rewards_ = this.rewards_;
         } else {
            var1.rewards_ = this.rewardsBuilder_.build();
         }
      }

      private void buildPartial0(PendingReward var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.type_ = this.type_;
         }
      }

      public PendingReward.Builder clone() {
         return (PendingReward.Builder)super.clone();
      }

      public PendingReward.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (PendingReward.Builder)super.setField(var1, var2);
      }

      public PendingReward.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (PendingReward.Builder)super.clearField(var1);
      }

      public PendingReward.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (PendingReward.Builder)super.clearOneof(var1);
      }

      public PendingReward.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (PendingReward.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public PendingReward.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (PendingReward.Builder)super.addRepeatedField(var1, var2);
      }

      public PendingReward.Builder mergeFrom(Message var1) {
         if (var1 instanceof PendingReward) {
            return this.mergeFrom((PendingReward)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public PendingReward.Builder mergeFrom(PendingReward var1) {
         if (var1 == PendingReward.getDefaultInstance()) {
            return this;
         }

         if (var1.type_ != 0) {
            this.setTypeValue(var1.getTypeValue());
         }

         if (this.rewardsBuilder_ == null) {
            if (!var1.rewards_.isEmpty()) {
               if (this.rewards_.isEmpty()) {
                  this.rewards_ = var1.rewards_;
                  this.bitField0_ &= -3;
               } else {
                  this.ensureRewardsIsMutable();
                  this.rewards_.addAll(var1.rewards_);
               }

               this.onChanged();
            }
         } else if (!var1.rewards_.isEmpty()) {
            if (this.rewardsBuilder_.isEmpty()) {
               this.rewardsBuilder_.dispose();
               this.rewardsBuilder_ = null;
               this.rewards_ = var1.rewards_;
               this.bitField0_ &= -3;
               this.rewardsBuilder_ = PendingReward.alwaysUseFieldBuilders ? this.getRewardsFieldBuilder() : null;
            } else {
               this.rewardsBuilder_.addAllMessages(var1.rewards_);
            }
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public PendingReward.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                  case 18:
                     PromotionReward var5 = var1.readMessage(PromotionReward.parser(), var2);
                     if (this.rewardsBuilder_ == null) {
                        this.ensureRewardsIsMutable();
                        this.rewards_.add(var5);
                     } else {
                        this.rewardsBuilder_.addMessage(var5);
                     }
                     break;
                  default:
                     if (!super.parseUnknownField(var1, var2, var4)) {
                        var3 = true;
                     }
               }
            }
         } catch (InvalidProtocolBufferException var9) {
            throw var9.unwrapIOException();
         } finally {
            this.onChanged();
         }

         return this;
      }

      @Override
      public int getTypeValue() {
         return this.type_;
      }

      public PendingReward.Builder setTypeValue(int var1) {
         this.type_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public PendingRewardType getType() {
         PendingRewardType var1 = PendingRewardType.forNumber(this.type_);
         return var1 == null ? PendingRewardType.UNRECOGNIZED : var1;
      }

      public PendingReward.Builder setType(PendingRewardType var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 1;
         this.type_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public PendingReward.Builder clearType() {
         this.bitField0_ &= -2;
         this.type_ = 0;
         this.onChanged();
         return this;
      }

      private void ensureRewardsIsMutable() {
         if ((this.bitField0_ & 2) == 0) {
            this.rewards_ = new ArrayList<>(this.rewards_);
            this.bitField0_ |= 2;
         }
      }

      @Override
      public List<PromotionReward> getRewardsList() {
         return this.rewardsBuilder_ == null ? Collections.unmodifiableList(this.rewards_) : this.rewardsBuilder_.getMessageList();
      }

      @Override
      public int getRewardsCount() {
         return this.rewardsBuilder_ == null ? this.rewards_.size() : this.rewardsBuilder_.getCount();
      }

      @Override
      public PromotionReward getRewards(int var1) {
         return this.rewardsBuilder_ == null ? this.rewards_.get(var1) : this.rewardsBuilder_.getMessage(var1);
      }

      public PendingReward.Builder setRewards(int var1, PromotionReward var2) {
         if (this.rewardsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureRewardsIsMutable();
            this.rewards_.set(var1, var2);
            this.onChanged();
         } else {
            this.rewardsBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public PendingReward.Builder setRewards(int var1, PromotionReward.Builder var2) {
         if (this.rewardsBuilder_ == null) {
            this.ensureRewardsIsMutable();
            this.rewards_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.rewardsBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public PendingReward.Builder addRewards(PromotionReward var1) {
         if (this.rewardsBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureRewardsIsMutable();
            this.rewards_.add(var1);
            this.onChanged();
         } else {
            this.rewardsBuilder_.addMessage(var1);
         }

         return this;
      }

      public PendingReward.Builder addRewards(int var1, PromotionReward var2) {
         if (this.rewardsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureRewardsIsMutable();
            this.rewards_.add(var1, var2);
            this.onChanged();
         } else {
            this.rewardsBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public PendingReward.Builder addRewards(PromotionReward.Builder var1) {
         if (this.rewardsBuilder_ == null) {
            this.ensureRewardsIsMutable();
            this.rewards_.add(var1.build());
            this.onChanged();
         } else {
            this.rewardsBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public PendingReward.Builder addRewards(int var1, PromotionReward.Builder var2) {
         if (this.rewardsBuilder_ == null) {
            this.ensureRewardsIsMutable();
            this.rewards_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.rewardsBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public PendingReward.Builder addAllRewards(Iterable<? extends PromotionReward> var1) {
         if (this.rewardsBuilder_ == null) {
            this.ensureRewardsIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.rewards_);
            this.onChanged();
         } else {
            this.rewardsBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public PendingReward.Builder clearRewards() {
         if (this.rewardsBuilder_ == null) {
            this.rewards_ = Collections.emptyList();
            this.bitField0_ &= -3;
            this.onChanged();
         } else {
            this.rewardsBuilder_.clear();
         }

         return this;
      }

      public PendingReward.Builder removeRewards(int var1) {
         if (this.rewardsBuilder_ == null) {
            this.ensureRewardsIsMutable();
            this.rewards_.remove(var1);
            this.onChanged();
         } else {
            this.rewardsBuilder_.remove(var1);
         }

         return this;
      }

      public PromotionReward.Builder getRewardsBuilder(int var1) {
         return this.getRewardsFieldBuilder().getBuilder(var1);
      }

      @Override
      public PromotionRewardOrBuilder getRewardsOrBuilder(int var1) {
         return this.rewardsBuilder_ == null ? this.rewards_.get(var1) : this.rewardsBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends PromotionRewardOrBuilder> getRewardsOrBuilderList() {
         return this.rewardsBuilder_ != null ? this.rewardsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.rewards_);
      }

      public PromotionReward.Builder addRewardsBuilder() {
         return this.getRewardsFieldBuilder().addBuilder(PromotionReward.getDefaultInstance());
      }

      public PromotionReward.Builder addRewardsBuilder(int var1) {
         return this.getRewardsFieldBuilder().addBuilder(var1, PromotionReward.getDefaultInstance());
      }

      public List<PromotionReward.Builder> getRewardsBuilderList() {
         return this.getRewardsFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<PromotionReward, PromotionReward.Builder, PromotionRewardOrBuilder> getRewardsFieldBuilder() {
         if (this.rewardsBuilder_ == null) {
            this.rewardsBuilder_ = new RepeatedFieldBuilderV3<>(this.rewards_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
            this.rewards_ = null;
         }

         return this.rewardsBuilder_;
      }

      public final PendingReward.Builder setUnknownFields(UnknownFieldSet var1) {
         return (PendingReward.Builder)super.setUnknownFields(var1);
      }

      public final PendingReward.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (PendingReward.Builder)super.mergeUnknownFields(var1);
      }
   }
}
