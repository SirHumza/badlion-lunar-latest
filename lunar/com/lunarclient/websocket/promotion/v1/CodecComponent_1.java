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

public final class EndPromotionViewResponse extends GeneratedMessageV3 implements EndPromotionViewResponseOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int REWARDS_FIELD_NUMBER = 1;
   private List<PromotionReward> rewards_;
   private byte memoizedIsInitialized = -1;
   private static final EndPromotionViewResponse DEFAULT_INSTANCE = new EndPromotionViewResponse();
   private static final Parser<EndPromotionViewResponse> PARSER = new AbstractParser<EndPromotionViewResponse>() {
      public EndPromotionViewResponse parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         EndPromotionViewResponse.Builder var3 = EndPromotionViewResponse.newBuilder();

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

   private EndPromotionViewResponse(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private EndPromotionViewResponse() {
      this.rewards_ = Collections.emptyList();
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new EndPromotionViewResponse();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_promotion_v1_EndPromotionViewResponse_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_promotion_v1_EndPromotionViewResponse_fieldAccessorTable
         .ensureFieldAccessorsInitialized(EndPromotionViewResponse.class, EndPromotionViewResponse.Builder.class);
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
      for (int var2 = 0; var2 < this.rewards_.size(); var2++) {
         var1.writeMessage(1, this.rewards_.get(var2));
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

      for (int var2 = 0; var2 < this.rewards_.size(); var2++) {
         var1 += CodedOutputStream.computeMessageSize(1, this.rewards_.get(var2));
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

      if (!(var1 instanceof EndPromotionViewResponse)) {
         return super.equals(var1);
      }

      EndPromotionViewResponse var2 = (EndPromotionViewResponse)var1;
      return !this.getRewardsList().equals(var2.getRewardsList()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      if (this.getRewardsCount() > 0) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getRewardsList().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static EndPromotionViewResponse parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static EndPromotionViewResponse parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static EndPromotionViewResponse parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static EndPromotionViewResponse parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static EndPromotionViewResponse parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static EndPromotionViewResponse parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static EndPromotionViewResponse parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static EndPromotionViewResponse parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static EndPromotionViewResponse parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static EndPromotionViewResponse parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static EndPromotionViewResponse parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static EndPromotionViewResponse parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public EndPromotionViewResponse.Builder newBuilderForType() {
      return newBuilder();
   }

   public static EndPromotionViewResponse.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static EndPromotionViewResponse.Builder newBuilder(EndPromotionViewResponse var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public EndPromotionViewResponse.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new EndPromotionViewResponse.Builder() : new EndPromotionViewResponse.Builder().mergeFrom(this);
   }

   protected EndPromotionViewResponse.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new EndPromotionViewResponse.Builder(var1);
   }

   public static EndPromotionViewResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<EndPromotionViewResponse> parser() {
      return PARSER;
   }

   @Override
   public Parser<EndPromotionViewResponse> getParserForType() {
      return PARSER;
   }

   public EndPromotionViewResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<EndPromotionViewResponse.Builder> implements EndPromotionViewResponseOrBuilder {
      private int bitField0_;
      private List<PromotionReward> rewards_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<PromotionReward, PromotionReward.Builder, PromotionRewardOrBuilder> rewardsBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_promotion_v1_EndPromotionViewResponse_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_promotion_v1_EndPromotionViewResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(EndPromotionViewResponse.class, EndPromotionViewResponse.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public EndPromotionViewResponse.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         if (this.rewardsBuilder_ == null) {
            this.rewards_ = Collections.emptyList();
         } else {
            this.rewards_ = null;
            this.rewardsBuilder_.clear();
         }

         this.bitField0_ &= -2;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_promotion_v1_EndPromotionViewResponse_descriptor;
      }

      public EndPromotionViewResponse getDefaultInstanceForType() {
         return EndPromotionViewResponse.getDefaultInstance();
      }

      public EndPromotionViewResponse build() {
         EndPromotionViewResponse var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public EndPromotionViewResponse buildPartial() {
         EndPromotionViewResponse var1 = new EndPromotionViewResponse(this);
         this.buildPartialRepeatedFields(var1);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartialRepeatedFields(EndPromotionViewResponse var1) {
         if (this.rewardsBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0) {
               this.rewards_ = Collections.unmodifiableList(this.rewards_);
               this.bitField0_ &= -2;
            }

            var1.rewards_ = this.rewards_;
         } else {
            var1.rewards_ = this.rewardsBuilder_.build();
         }
      }

      private void buildPartial0(EndPromotionViewResponse var1) {
         int var2 = this.bitField0_;
      }

      public EndPromotionViewResponse.Builder clone() {
         return (EndPromotionViewResponse.Builder)super.clone();
      }

      public EndPromotionViewResponse.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (EndPromotionViewResponse.Builder)super.setField(var1, var2);
      }

      public EndPromotionViewResponse.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (EndPromotionViewResponse.Builder)super.clearField(var1);
      }

      public EndPromotionViewResponse.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (EndPromotionViewResponse.Builder)super.clearOneof(var1);
      }

      public EndPromotionViewResponse.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (EndPromotionViewResponse.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public EndPromotionViewResponse.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (EndPromotionViewResponse.Builder)super.addRepeatedField(var1, var2);
      }

      public EndPromotionViewResponse.Builder mergeFrom(Message var1) {
         if (var1 instanceof EndPromotionViewResponse) {
            return this.mergeFrom((EndPromotionViewResponse)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public EndPromotionViewResponse.Builder mergeFrom(EndPromotionViewResponse var1) {
         if (var1 == EndPromotionViewResponse.getDefaultInstance()) {
            return this;
         }

         if (this.rewardsBuilder_ == null) {
            if (!var1.rewards_.isEmpty()) {
               if (this.rewards_.isEmpty()) {
                  this.rewards_ = var1.rewards_;
                  this.bitField0_ &= -2;
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
               this.bitField0_ &= -2;
               this.rewardsBuilder_ = EndPromotionViewResponse.alwaysUseFieldBuilders ? this.getRewardsFieldBuilder() : null;
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

      public EndPromotionViewResponse.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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

      private void ensureRewardsIsMutable() {
         if ((this.bitField0_ & 1) == 0) {
            this.rewards_ = new ArrayList<>(this.rewards_);
            this.bitField0_ |= 1;
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

      public EndPromotionViewResponse.Builder setRewards(int var1, PromotionReward var2) {
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

      public EndPromotionViewResponse.Builder setRewards(int var1, PromotionReward.Builder var2) {
         if (this.rewardsBuilder_ == null) {
            this.ensureRewardsIsMutable();
            this.rewards_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.rewardsBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public EndPromotionViewResponse.Builder addRewards(PromotionReward var1) {
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

      public EndPromotionViewResponse.Builder addRewards(int var1, PromotionReward var2) {
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

      public EndPromotionViewResponse.Builder addRewards(PromotionReward.Builder var1) {
         if (this.rewardsBuilder_ == null) {
            this.ensureRewardsIsMutable();
            this.rewards_.add(var1.build());
            this.onChanged();
         } else {
            this.rewardsBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public EndPromotionViewResponse.Builder addRewards(int var1, PromotionReward.Builder var2) {
         if (this.rewardsBuilder_ == null) {
            this.ensureRewardsIsMutable();
            this.rewards_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.rewardsBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public EndPromotionViewResponse.Builder addAllRewards(Iterable<? extends PromotionReward> var1) {
         if (this.rewardsBuilder_ == null) {
            this.ensureRewardsIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.rewards_);
            this.onChanged();
         } else {
            this.rewardsBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public EndPromotionViewResponse.Builder clearRewards() {
         if (this.rewardsBuilder_ == null) {
            this.rewards_ = Collections.emptyList();
            this.bitField0_ &= -2;
            this.onChanged();
         } else {
            this.rewardsBuilder_.clear();
         }

         return this;
      }

      public EndPromotionViewResponse.Builder removeRewards(int var1) {
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
            this.rewardsBuilder_ = new RepeatedFieldBuilderV3<>(this.rewards_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
            this.rewards_ = null;
         }

         return this.rewardsBuilder_;
      }

      public final EndPromotionViewResponse.Builder setUnknownFields(UnknownFieldSet var1) {
         return (EndPromotionViewResponse.Builder)super.setUnknownFields(var1);
      }

      public final EndPromotionViewResponse.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (EndPromotionViewResponse.Builder)super.mergeUnknownFields(var1);
      }
   }
}
