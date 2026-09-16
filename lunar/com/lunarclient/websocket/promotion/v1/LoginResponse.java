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
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class LoginResponse extends GeneratedMessageV3 implements LoginResponseOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int CORNER_EXEMPT_FIELD_NUMBER = 1;
   private boolean cornerExempt_ = false;
   public static final int SHOW_ADS_FIELD_NUMBER = 2;
   private boolean showAds_ = false;
   public static final int OUTPLAYED_PROMOTION_STATE_FIELD_NUMBER = 3;
   private int outplayedPromotionState_ = 0;
   public static final int PENDING_REWARDS_FIELD_NUMBER = 4;
   private List<PendingReward> pendingRewards_;
   public static final int MEDAL_PROMOTION_STATE_FIELD_NUMBER = 5;
   private int medalPromotionState_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final LoginResponse DEFAULT_INSTANCE = new LoginResponse();
   private static final Parser<LoginResponse> PARSER = new AbstractParser<LoginResponse>() {
      public LoginResponse parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         LoginResponse.Builder var3 = LoginResponse.newBuilder();

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

   private LoginResponse(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private LoginResponse() {
      this.outplayedPromotionState_ = 0;
      this.pendingRewards_ = Collections.emptyList();
      this.medalPromotionState_ = 0;
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new LoginResponse();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_promotion_v1_LoginResponse_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_promotion_v1_LoginResponse_fieldAccessorTable
         .ensureFieldAccessorsInitialized(LoginResponse.class, LoginResponse.Builder.class);
   }

   @Deprecated
   @Override
   public boolean getCornerExempt() {
      return this.cornerExempt_;
   }

   @Override
   public boolean getShowAds() {
      return this.showAds_;
   }

   @Override
   public int getOutplayedPromotionStateValue() {
      return this.outplayedPromotionState_;
   }

   @Override
   public LoginResponse.OutplayedPromotionState getOutplayedPromotionState() {
      LoginResponse.OutplayedPromotionState var1 = LoginResponse.OutplayedPromotionState.forNumber(this.outplayedPromotionState_);
      return var1 == null ? LoginResponse.OutplayedPromotionState.UNRECOGNIZED : var1;
   }

   @Override
   public List<PendingReward> getPendingRewardsList() {
      return this.pendingRewards_;
   }

   @Override
   public List<? extends PendingRewardOrBuilder> getPendingRewardsOrBuilderList() {
      return this.pendingRewards_;
   }

   @Override
   public int getPendingRewardsCount() {
      return this.pendingRewards_.size();
   }

   @Override
   public PendingReward getPendingRewards(int var1) {
      return this.pendingRewards_.get(var1);
   }

   @Override
   public PendingRewardOrBuilder getPendingRewardsOrBuilder(int var1) {
      return this.pendingRewards_.get(var1);
   }

   @Override
   public int getMedalPromotionStateValue() {
      return this.medalPromotionState_;
   }

   @Override
   public LoginResponse.MedalPromotionState getMedalPromotionState() {
      LoginResponse.MedalPromotionState var1 = LoginResponse.MedalPromotionState.forNumber(this.medalPromotionState_);
      return var1 == null ? LoginResponse.MedalPromotionState.UNRECOGNIZED : var1;
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
      if (this.cornerExempt_) {
         var1.writeBool(1, this.cornerExempt_);
      }

      if (this.showAds_) {
         var1.writeBool(2, this.showAds_);
      }

      if (this.outplayedPromotionState_ != LoginResponse.OutplayedPromotionState.OUTPLAYED_PROMOTION_STATE_UNSPECIFIED.getNumber()) {
         var1.writeEnum(3, this.outplayedPromotionState_);
      }

      for (int var2 = 0; var2 < this.pendingRewards_.size(); var2++) {
         var1.writeMessage(4, this.pendingRewards_.get(var2));
      }

      if (this.medalPromotionState_ != LoginResponse.MedalPromotionState.MEDAL_PROMOTION_STATE_UNSPECIFIED.getNumber()) {
         var1.writeEnum(5, this.medalPromotionState_);
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
      if (this.cornerExempt_) {
         var1 += CodedOutputStream.computeBoolSize(1, this.cornerExempt_);
      }

      if (this.showAds_) {
         var1 += CodedOutputStream.computeBoolSize(2, this.showAds_);
      }

      if (this.outplayedPromotionState_ != LoginResponse.OutplayedPromotionState.OUTPLAYED_PROMOTION_STATE_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(3, this.outplayedPromotionState_);
      }

      for (int var2 = 0; var2 < this.pendingRewards_.size(); var2++) {
         var1 += CodedOutputStream.computeMessageSize(4, this.pendingRewards_.get(var2));
      }

      if (this.medalPromotionState_ != LoginResponse.MedalPromotionState.MEDAL_PROMOTION_STATE_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(5, this.medalPromotionState_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof LoginResponse)) {
         return super.equals(var1);
      } else {
         LoginResponse var2 = (LoginResponse)var1;
         if (this.getCornerExempt() != var2.getCornerExempt()) {
            return false;
         } else if (this.getShowAds() != var2.getShowAds()) {
            return false;
         } else if (this.outplayedPromotionState_ != var2.outplayedPromotionState_) {
            return false;
         } else if (!this.getPendingRewardsList().equals(var2.getPendingRewardsList())) {
            return false;
         } else {
            return this.medalPromotionState_ != var2.medalPromotionState_ ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + Internal.hashBoolean(this.getCornerExempt());
      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + Internal.hashBoolean(this.getShowAds());
      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + this.outplayedPromotionState_;
      if (this.getPendingRewardsCount() > 0) {
         var1 = 37 * var1 + 4;
         var1 = 53 * var1 + this.getPendingRewardsList().hashCode();
      }

      var1 = 37 * var1 + 5;
      var1 = 53 * var1 + this.medalPromotionState_;
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static LoginResponse parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static LoginResponse parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LoginResponse parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static LoginResponse parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LoginResponse parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static LoginResponse parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LoginResponse parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static LoginResponse parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static LoginResponse parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static LoginResponse parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static LoginResponse parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static LoginResponse parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public LoginResponse.Builder newBuilderForType() {
      return newBuilder();
   }

   public static LoginResponse.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static LoginResponse.Builder newBuilder(LoginResponse var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public LoginResponse.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new LoginResponse.Builder() : new LoginResponse.Builder().mergeFrom(this);
   }

   protected LoginResponse.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new LoginResponse.Builder(var1);
   }

   public static LoginResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<LoginResponse> parser() {
      return PARSER;
   }

   @Override
   public Parser<LoginResponse> getParserForType() {
      return PARSER;
   }

   public LoginResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<LoginResponse.Builder> implements LoginResponseOrBuilder {
      private int bitField0_;
      private boolean cornerExempt_;
      private boolean showAds_;
      private int outplayedPromotionState_ = 0;
      private List<PendingReward> pendingRewards_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<PendingReward, PendingReward.Builder, PendingRewardOrBuilder> pendingRewardsBuilder_;
      private int medalPromotionState_ = 0;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_promotion_v1_LoginResponse_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_promotion_v1_LoginResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(LoginResponse.class, LoginResponse.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public LoginResponse.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.cornerExempt_ = false;
         this.showAds_ = false;
         this.outplayedPromotionState_ = 0;
         if (this.pendingRewardsBuilder_ == null) {
            this.pendingRewards_ = Collections.emptyList();
         } else {
            this.pendingRewards_ = null;
            this.pendingRewardsBuilder_.clear();
         }

         this.bitField0_ &= -9;
         this.medalPromotionState_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_promotion_v1_LoginResponse_descriptor;
      }

      public LoginResponse getDefaultInstanceForType() {
         return LoginResponse.getDefaultInstance();
      }

      public LoginResponse build() {
         LoginResponse var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public LoginResponse buildPartial() {
         LoginResponse var1 = new LoginResponse(this);
         this.buildPartialRepeatedFields(var1);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartialRepeatedFields(LoginResponse var1) {
         if (this.pendingRewardsBuilder_ == null) {
            if ((this.bitField0_ & 8) != 0) {
               this.pendingRewards_ = Collections.unmodifiableList(this.pendingRewards_);
               this.bitField0_ &= -9;
            }

            var1.pendingRewards_ = this.pendingRewards_;
         } else {
            var1.pendingRewards_ = this.pendingRewardsBuilder_.build();
         }
      }

      private void buildPartial0(LoginResponse var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.cornerExempt_ = this.cornerExempt_;
         }

         if ((var2 & 2) != 0) {
            var1.showAds_ = this.showAds_;
         }

         if ((var2 & 4) != 0) {
            var1.outplayedPromotionState_ = this.outplayedPromotionState_;
         }

         if ((var2 & 16) != 0) {
            var1.medalPromotionState_ = this.medalPromotionState_;
         }
      }

      public LoginResponse.Builder clone() {
         return (LoginResponse.Builder)super.clone();
      }

      public LoginResponse.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (LoginResponse.Builder)super.setField(var1, var2);
      }

      public LoginResponse.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (LoginResponse.Builder)super.clearField(var1);
      }

      public LoginResponse.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (LoginResponse.Builder)super.clearOneof(var1);
      }

      public LoginResponse.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (LoginResponse.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public LoginResponse.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (LoginResponse.Builder)super.addRepeatedField(var1, var2);
      }

      public LoginResponse.Builder mergeFrom(Message var1) {
         if (var1 instanceof LoginResponse) {
            return this.mergeFrom((LoginResponse)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public LoginResponse.Builder mergeFrom(LoginResponse var1) {
         if (var1 == LoginResponse.getDefaultInstance()) {
            return this;
         }

         if (var1.getCornerExempt()) {
            this.setCornerExempt(var1.getCornerExempt());
         }

         if (var1.getShowAds()) {
            this.setShowAds(var1.getShowAds());
         }

         if (var1.outplayedPromotionState_ != 0) {
            this.setOutplayedPromotionStateValue(var1.getOutplayedPromotionStateValue());
         }

         if (this.pendingRewardsBuilder_ == null) {
            if (!var1.pendingRewards_.isEmpty()) {
               if (this.pendingRewards_.isEmpty()) {
                  this.pendingRewards_ = var1.pendingRewards_;
                  this.bitField0_ &= -9;
               } else {
                  this.ensurePendingRewardsIsMutable();
                  this.pendingRewards_.addAll(var1.pendingRewards_);
               }

               this.onChanged();
            }
         } else if (!var1.pendingRewards_.isEmpty()) {
            if (this.pendingRewardsBuilder_.isEmpty()) {
               this.pendingRewardsBuilder_.dispose();
               this.pendingRewardsBuilder_ = null;
               this.pendingRewards_ = var1.pendingRewards_;
               this.bitField0_ &= -9;
               this.pendingRewardsBuilder_ = LoginResponse.alwaysUseFieldBuilders ? this.getPendingRewardsFieldBuilder() : null;
            } else {
               this.pendingRewardsBuilder_.addAllMessages(var1.pendingRewards_);
            }
         }

         if (var1.medalPromotionState_ != 0) {
            this.setMedalPromotionStateValue(var1.getMedalPromotionStateValue());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public LoginResponse.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.cornerExempt_ = var1.readBool();
                     this.bitField0_ |= 1;
                     break;
                  case 16:
                     this.showAds_ = var1.readBool();
                     this.bitField0_ |= 2;
                     break;
                  case 24:
                     this.outplayedPromotionState_ = var1.readEnum();
                     this.bitField0_ |= 4;
                     break;
                  case 34:
                     PendingReward var5 = var1.readMessage(PendingReward.parser(), var2);
                     if (this.pendingRewardsBuilder_ == null) {
                        this.ensurePendingRewardsIsMutable();
                        this.pendingRewards_.add(var5);
                     } else {
                        this.pendingRewardsBuilder_.addMessage(var5);
                     }
                     break;
                  case 40:
                     this.medalPromotionState_ = var1.readEnum();
                     this.bitField0_ |= 16;
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

      @Deprecated
      @Override
      public boolean getCornerExempt() {
         return this.cornerExempt_;
      }

      @Deprecated
      public LoginResponse.Builder setCornerExempt(boolean var1) {
         this.cornerExempt_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Deprecated
      public LoginResponse.Builder clearCornerExempt() {
         this.bitField0_ &= -2;
         this.cornerExempt_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public boolean getShowAds() {
         return this.showAds_;
      }

      public LoginResponse.Builder setShowAds(boolean var1) {
         this.showAds_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public LoginResponse.Builder clearShowAds() {
         this.bitField0_ &= -3;
         this.showAds_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public int getOutplayedPromotionStateValue() {
         return this.outplayedPromotionState_;
      }

      public LoginResponse.Builder setOutplayedPromotionStateValue(int var1) {
         this.outplayedPromotionState_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      @Override
      public LoginResponse.OutplayedPromotionState getOutplayedPromotionState() {
         LoginResponse.OutplayedPromotionState var1 = LoginResponse.OutplayedPromotionState.forNumber(this.outplayedPromotionState_);
         return var1 == null ? LoginResponse.OutplayedPromotionState.UNRECOGNIZED : var1;
      }

      public LoginResponse.Builder setOutplayedPromotionState(LoginResponse.OutplayedPromotionState var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 4;
         this.outplayedPromotionState_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public LoginResponse.Builder clearOutplayedPromotionState() {
         this.bitField0_ &= -5;
         this.outplayedPromotionState_ = 0;
         this.onChanged();
         return this;
      }

      private void ensurePendingRewardsIsMutable() {
         if ((this.bitField0_ & 8) == 0) {
            this.pendingRewards_ = new ArrayList<>(this.pendingRewards_);
            this.bitField0_ |= 8;
         }
      }

      @Override
      public List<PendingReward> getPendingRewardsList() {
         return this.pendingRewardsBuilder_ == null ? Collections.unmodifiableList(this.pendingRewards_) : this.pendingRewardsBuilder_.getMessageList();
      }

      @Override
      public int getPendingRewardsCount() {
         return this.pendingRewardsBuilder_ == null ? this.pendingRewards_.size() : this.pendingRewardsBuilder_.getCount();
      }

      @Override
      public PendingReward getPendingRewards(int var1) {
         return this.pendingRewardsBuilder_ == null ? this.pendingRewards_.get(var1) : this.pendingRewardsBuilder_.getMessage(var1);
      }

      public LoginResponse.Builder setPendingRewards(int var1, PendingReward var2) {
         if (this.pendingRewardsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensurePendingRewardsIsMutable();
            this.pendingRewards_.set(var1, var2);
            this.onChanged();
         } else {
            this.pendingRewardsBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public LoginResponse.Builder setPendingRewards(int var1, PendingReward.Builder var2) {
         if (this.pendingRewardsBuilder_ == null) {
            this.ensurePendingRewardsIsMutable();
            this.pendingRewards_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.pendingRewardsBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public LoginResponse.Builder addPendingRewards(PendingReward var1) {
         if (this.pendingRewardsBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensurePendingRewardsIsMutable();
            this.pendingRewards_.add(var1);
            this.onChanged();
         } else {
            this.pendingRewardsBuilder_.addMessage(var1);
         }

         return this;
      }

      public LoginResponse.Builder addPendingRewards(int var1, PendingReward var2) {
         if (this.pendingRewardsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensurePendingRewardsIsMutable();
            this.pendingRewards_.add(var1, var2);
            this.onChanged();
         } else {
            this.pendingRewardsBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public LoginResponse.Builder addPendingRewards(PendingReward.Builder var1) {
         if (this.pendingRewardsBuilder_ == null) {
            this.ensurePendingRewardsIsMutable();
            this.pendingRewards_.add(var1.build());
            this.onChanged();
         } else {
            this.pendingRewardsBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public LoginResponse.Builder addPendingRewards(int var1, PendingReward.Builder var2) {
         if (this.pendingRewardsBuilder_ == null) {
            this.ensurePendingRewardsIsMutable();
            this.pendingRewards_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.pendingRewardsBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public LoginResponse.Builder addAllPendingRewards(Iterable<? extends PendingReward> var1) {
         if (this.pendingRewardsBuilder_ == null) {
            this.ensurePendingRewardsIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.pendingRewards_);
            this.onChanged();
         } else {
            this.pendingRewardsBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public LoginResponse.Builder clearPendingRewards() {
         if (this.pendingRewardsBuilder_ == null) {
            this.pendingRewards_ = Collections.emptyList();
            this.bitField0_ &= -9;
            this.onChanged();
         } else {
            this.pendingRewardsBuilder_.clear();
         }

         return this;
      }

      public LoginResponse.Builder removePendingRewards(int var1) {
         if (this.pendingRewardsBuilder_ == null) {
            this.ensurePendingRewardsIsMutable();
            this.pendingRewards_.remove(var1);
            this.onChanged();
         } else {
            this.pendingRewardsBuilder_.remove(var1);
         }

         return this;
      }

      public PendingReward.Builder getPendingRewardsBuilder(int var1) {
         return this.getPendingRewardsFieldBuilder().getBuilder(var1);
      }

      @Override
      public PendingRewardOrBuilder getPendingRewardsOrBuilder(int var1) {
         return this.pendingRewardsBuilder_ == null ? this.pendingRewards_.get(var1) : this.pendingRewardsBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends PendingRewardOrBuilder> getPendingRewardsOrBuilderList() {
         return this.pendingRewardsBuilder_ != null
            ? this.pendingRewardsBuilder_.getMessageOrBuilderList()
            : Collections.unmodifiableList(this.pendingRewards_);
      }

      public PendingReward.Builder addPendingRewardsBuilder() {
         return this.getPendingRewardsFieldBuilder().addBuilder(PendingReward.getDefaultInstance());
      }

      public PendingReward.Builder addPendingRewardsBuilder(int var1) {
         return this.getPendingRewardsFieldBuilder().addBuilder(var1, PendingReward.getDefaultInstance());
      }

      public List<PendingReward.Builder> getPendingRewardsBuilderList() {
         return this.getPendingRewardsFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<PendingReward, PendingReward.Builder, PendingRewardOrBuilder> getPendingRewardsFieldBuilder() {
         if (this.pendingRewardsBuilder_ == null) {
            this.pendingRewardsBuilder_ = new RepeatedFieldBuilderV3<>(
               this.pendingRewards_, (this.bitField0_ & 8) != 0, this.getParentForChildren(), this.isClean()
            );
            this.pendingRewards_ = null;
         }

         return this.pendingRewardsBuilder_;
      }

      @Override
      public int getMedalPromotionStateValue() {
         return this.medalPromotionState_;
      }

      public LoginResponse.Builder setMedalPromotionStateValue(int var1) {
         this.medalPromotionState_ = var1;
         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      @Override
      public LoginResponse.MedalPromotionState getMedalPromotionState() {
         LoginResponse.MedalPromotionState var1 = LoginResponse.MedalPromotionState.forNumber(this.medalPromotionState_);
         return var1 == null ? LoginResponse.MedalPromotionState.UNRECOGNIZED : var1;
      }

      public LoginResponse.Builder setMedalPromotionState(LoginResponse.MedalPromotionState var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 16;
         this.medalPromotionState_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public LoginResponse.Builder clearMedalPromotionState() {
         this.bitField0_ &= -17;
         this.medalPromotionState_ = 0;
         this.onChanged();
         return this;
      }

      public final LoginResponse.Builder setUnknownFields(UnknownFieldSet var1) {
         return (LoginResponse.Builder)super.setUnknownFields(var1);
      }

      public final LoginResponse.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (LoginResponse.Builder)super.mergeUnknownFields(var1);
      }
   }

   public enum MedalPromotionState implements ProtocolMessageEnum {
      MEDAL_PROMOTION_STATE_UNSPECIFIED(0),
      MEDAL_PROMOTION_STATE_UNAVAILABLE(1),
      MEDAL_PROMOTION_STATE_AVAILABLE(2),
      MEDAL_PROMOTION_STATE_CLAIMED(3),
      UNRECOGNIZED(-1);

      public static final int MEDAL_PROMOTION_STATE_UNSPECIFIED_VALUE = 0;
      public static final int MEDAL_PROMOTION_STATE_UNAVAILABLE_VALUE = 1;
      public static final int MEDAL_PROMOTION_STATE_AVAILABLE_VALUE = 2;
      public static final int MEDAL_PROMOTION_STATE_CLAIMED_VALUE = 3;
      private static final Internal.EnumLiteMap<LoginResponse.MedalPromotionState> internalValueMap = new Internal.EnumLiteMap<LoginResponse.MedalPromotionState>() {
         public LoginResponse.MedalPromotionState findValueByNumber(int var1) {
            return LoginResponse.MedalPromotionState.forNumber(var1);
         }
      };
      private static final LoginResponse.MedalPromotionState[] VALUES = values();
      private final int value;

      @Override
      public final int getNumber() {
         if (this == UNRECOGNIZED) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
         } else {
            return this.value;
         }
      }

      @Deprecated
      public static LoginResponse.MedalPromotionState valueOf(int var0) {
         return forNumber(var0);
      }

      public static LoginResponse.MedalPromotionState forNumber(int var0) {
         switch (var0) {
            case 0:
               return MEDAL_PROMOTION_STATE_UNSPECIFIED;
            case 1:
               return MEDAL_PROMOTION_STATE_UNAVAILABLE;
            case 2:
               return MEDAL_PROMOTION_STATE_AVAILABLE;
            case 3:
               return MEDAL_PROMOTION_STATE_CLAIMED;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<LoginResponse.MedalPromotionState> internalGetValueMap() {
         return internalValueMap;
      }

      @Override
      public final Descriptors.EnumValueDescriptor getValueDescriptor() {
         if (this == UNRECOGNIZED) {
            throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
         } else {
            return getDescriptor().getValues().get(this.ordinal());
         }
      }

      @Override
      public final Descriptors.EnumDescriptor getDescriptorForType() {
         return getDescriptor();
      }

      public static final Descriptors.EnumDescriptor getDescriptor() {
         return LoginResponse.getDescriptor().getEnumTypes().get(1);
      }

      public static LoginResponse.MedalPromotionState valueOf(Descriptors.EnumValueDescriptor var0) {
         if (var0.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
         }
      }

      MedalPromotionState(int var3) {
         this.value = var3;
      }
   }

   public enum OutplayedPromotionState implements ProtocolMessageEnum {
      OUTPLAYED_PROMOTION_STATE_UNSPECIFIED(0),
      OUTPLAYED_PROMOTION_STATE_UNAVAILABLE(1),
      OUTPLAYED_PROMOTION_STATE_AVAILABLE(2),
      OUTPLAYED_PROMOTION_STATE_CLAIMED(3),
      UNRECOGNIZED(-1);

      public static final int OUTPLAYED_PROMOTION_STATE_UNSPECIFIED_VALUE = 0;
      public static final int OUTPLAYED_PROMOTION_STATE_UNAVAILABLE_VALUE = 1;
      public static final int OUTPLAYED_PROMOTION_STATE_AVAILABLE_VALUE = 2;
      public static final int OUTPLAYED_PROMOTION_STATE_CLAIMED_VALUE = 3;
      private static final Internal.EnumLiteMap<LoginResponse.OutplayedPromotionState> internalValueMap = new Internal.EnumLiteMap<LoginResponse.OutplayedPromotionState>() {
         public LoginResponse.OutplayedPromotionState findValueByNumber(int var1) {
            return LoginResponse.OutplayedPromotionState.forNumber(var1);
         }
      };
      private static final LoginResponse.OutplayedPromotionState[] VALUES = values();
      private final int value;

      @Override
      public final int getNumber() {
         if (this == UNRECOGNIZED) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
         } else {
            return this.value;
         }
      }

      @Deprecated
      public static LoginResponse.OutplayedPromotionState valueOf(int var0) {
         return forNumber(var0);
      }

      public static LoginResponse.OutplayedPromotionState forNumber(int var0) {
         switch (var0) {
            case 0:
               return OUTPLAYED_PROMOTION_STATE_UNSPECIFIED;
            case 1:
               return OUTPLAYED_PROMOTION_STATE_UNAVAILABLE;
            case 2:
               return OUTPLAYED_PROMOTION_STATE_AVAILABLE;
            case 3:
               return OUTPLAYED_PROMOTION_STATE_CLAIMED;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<LoginResponse.OutplayedPromotionState> internalGetValueMap() {
         return internalValueMap;
      }

      @Override
      public final Descriptors.EnumValueDescriptor getValueDescriptor() {
         if (this == UNRECOGNIZED) {
            throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
         } else {
            return getDescriptor().getValues().get(this.ordinal());
         }
      }

      @Override
      public final Descriptors.EnumDescriptor getDescriptorForType() {
         return getDescriptor();
      }

      public static final Descriptors.EnumDescriptor getDescriptor() {
         return LoginResponse.getDescriptor().getEnumTypes().get(0);
      }

      public static LoginResponse.OutplayedPromotionState valueOf(Descriptors.EnumValueDescriptor var0) {
         if (var0.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
         }
      }

      OutplayedPromotionState(int var3) {
         this.value = var3;
      }
   }
}
