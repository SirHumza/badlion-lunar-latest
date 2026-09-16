package com.lunarclient.websocket.promotion.v1;

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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class ClaimPendingRewardRequest extends GeneratedMessageV3 implements ClaimPendingRewardRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int INITIATOR_FIELD_NUMBER = 1;
   private int initiator_ = 0;
   public static final int TYPE_FIELD_NUMBER = 2;
   private int type_ = 0;
   public static final int REWARD_FIELD_NUMBER = 3;
   private PromotionReward reward_;
   private byte memoizedIsInitialized = -1;
   private static final ClaimPendingRewardRequest DEFAULT_INSTANCE = new ClaimPendingRewardRequest();
   private static final Parser<ClaimPendingRewardRequest> PARSER = new AbstractParser<ClaimPendingRewardRequest>() {
      public ClaimPendingRewardRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         ClaimPendingRewardRequest.Builder var3 = ClaimPendingRewardRequest.newBuilder();

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

   private ClaimPendingRewardRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private ClaimPendingRewardRequest() {
      this.initiator_ = 0;
      this.type_ = 0;
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new ClaimPendingRewardRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_promotion_v1_ClaimPendingRewardRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_promotion_v1_ClaimPendingRewardRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(ClaimPendingRewardRequest.class, ClaimPendingRewardRequest.Builder.class);
   }

   @Override
   public int getInitiatorValue() {
      return this.initiator_;
   }

   @Override
   public ClaimPendingRewardRequest.Initiator getInitiator() {
      ClaimPendingRewardRequest.Initiator var1 = ClaimPendingRewardRequest.Initiator.forNumber(this.initiator_);
      return var1 == null ? ClaimPendingRewardRequest.Initiator.UNRECOGNIZED : var1;
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
   public boolean hasReward() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public PromotionReward getReward() {
      return this.reward_ == null ? PromotionReward.getDefaultInstance() : this.reward_;
   }

   @Override
   public PromotionRewardOrBuilder getRewardOrBuilder() {
      return this.reward_ == null ? PromotionReward.getDefaultInstance() : this.reward_;
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
      if (this.initiator_ != ClaimPendingRewardRequest.Initiator.INITIATOR_UNSPECIFIED.getNumber()) {
         var1.writeEnum(1, this.initiator_);
      }

      if (this.type_ != PendingRewardType.PENDING_REWARD_TYPE_UNSPECIFIED.getNumber()) {
         var1.writeEnum(2, this.type_);
      }

      if ((this.bitField0_ & 1) != 0) {
         var1.writeMessage(3, this.getReward());
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
      if (this.initiator_ != ClaimPendingRewardRequest.Initiator.INITIATOR_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(1, this.initiator_);
      }

      if (this.type_ != PendingRewardType.PENDING_REWARD_TYPE_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(2, this.type_);
      }

      if ((this.bitField0_ & 1) != 0) {
         var1 += CodedOutputStream.computeMessageSize(3, this.getReward());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof ClaimPendingRewardRequest)) {
         return super.equals(var1);
      } else {
         ClaimPendingRewardRequest var2 = (ClaimPendingRewardRequest)var1;
         if (this.initiator_ != var2.initiator_) {
            return false;
         } else if (this.type_ != var2.type_) {
            return false;
         } else if (this.hasReward() != var2.hasReward()) {
            return false;
         } else {
            return this.hasReward() && !this.getReward().equals(var2.getReward()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + this.initiator_;
      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.type_;
      if (this.hasReward()) {
         var1 = 37 * var1 + 3;
         var1 = 53 * var1 + this.getReward().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static ClaimPendingRewardRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static ClaimPendingRewardRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ClaimPendingRewardRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static ClaimPendingRewardRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ClaimPendingRewardRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static ClaimPendingRewardRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ClaimPendingRewardRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ClaimPendingRewardRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ClaimPendingRewardRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ClaimPendingRewardRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ClaimPendingRewardRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ClaimPendingRewardRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public ClaimPendingRewardRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static ClaimPendingRewardRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ClaimPendingRewardRequest.Builder newBuilder(ClaimPendingRewardRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public ClaimPendingRewardRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new ClaimPendingRewardRequest.Builder() : new ClaimPendingRewardRequest.Builder().mergeFrom(this);
   }

   protected ClaimPendingRewardRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new ClaimPendingRewardRequest.Builder(var1);
   }

   public static ClaimPendingRewardRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<ClaimPendingRewardRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<ClaimPendingRewardRequest> getParserForType() {
      return PARSER;
   }

   public ClaimPendingRewardRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<ClaimPendingRewardRequest.Builder> implements ClaimPendingRewardRequestOrBuilder {
      private int bitField0_;
      private int initiator_ = 0;
      private int type_ = 0;
      private PromotionReward reward_;
      private SingleFieldBuilderV3<PromotionReward, PromotionReward.Builder, PromotionRewardOrBuilder> rewardBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_promotion_v1_ClaimPendingRewardRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_promotion_v1_ClaimPendingRewardRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ClaimPendingRewardRequest.class, ClaimPendingRewardRequest.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (ClaimPendingRewardRequest.alwaysUseFieldBuilders) {
            this.getRewardFieldBuilder();
         }
      }

      public ClaimPendingRewardRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.initiator_ = 0;
         this.type_ = 0;
         this.reward_ = null;
         if (this.rewardBuilder_ != null) {
            this.rewardBuilder_.dispose();
            this.rewardBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_promotion_v1_ClaimPendingRewardRequest_descriptor;
      }

      public ClaimPendingRewardRequest getDefaultInstanceForType() {
         return ClaimPendingRewardRequest.getDefaultInstance();
      }

      public ClaimPendingRewardRequest build() {
         ClaimPendingRewardRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public ClaimPendingRewardRequest buildPartial() {
         ClaimPendingRewardRequest var1 = new ClaimPendingRewardRequest(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(ClaimPendingRewardRequest var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.initiator_ = this.initiator_;
         }

         if ((var2 & 2) != 0) {
            var1.type_ = this.type_;
         }

         byte var3 = 0;
         if ((var2 & 4) != 0) {
            var1.reward_ = this.rewardBuilder_ == null ? this.reward_ : this.rewardBuilder_.build();
            var3 |= 1;
         }

         ClaimPendingRewardRequest var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public ClaimPendingRewardRequest.Builder clone() {
         return (ClaimPendingRewardRequest.Builder)super.clone();
      }

      public ClaimPendingRewardRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ClaimPendingRewardRequest.Builder)super.setField(var1, var2);
      }

      public ClaimPendingRewardRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (ClaimPendingRewardRequest.Builder)super.clearField(var1);
      }

      public ClaimPendingRewardRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (ClaimPendingRewardRequest.Builder)super.clearOneof(var1);
      }

      public ClaimPendingRewardRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (ClaimPendingRewardRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public ClaimPendingRewardRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ClaimPendingRewardRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public ClaimPendingRewardRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof ClaimPendingRewardRequest) {
            return this.mergeFrom((ClaimPendingRewardRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public ClaimPendingRewardRequest.Builder mergeFrom(ClaimPendingRewardRequest var1) {
         if (var1 == ClaimPendingRewardRequest.getDefaultInstance()) {
            return this;
         }

         if (var1.initiator_ != 0) {
            this.setInitiatorValue(var1.getInitiatorValue());
         }

         if (var1.type_ != 0) {
            this.setTypeValue(var1.getTypeValue());
         }

         if (var1.hasReward()) {
            this.mergeReward(var1.getReward());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public ClaimPendingRewardRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.initiator_ = var1.readEnum();
                     this.bitField0_ |= 1;
                     break;
                  case 16:
                     this.type_ = var1.readEnum();
                     this.bitField0_ |= 2;
                     break;
                  case 26:
                     var1.readMessage(this.getRewardFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 4;
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
      public int getInitiatorValue() {
         return this.initiator_;
      }

      public ClaimPendingRewardRequest.Builder setInitiatorValue(int var1) {
         this.initiator_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public ClaimPendingRewardRequest.Initiator getInitiator() {
         ClaimPendingRewardRequest.Initiator var1 = ClaimPendingRewardRequest.Initiator.forNumber(this.initiator_);
         return var1 == null ? ClaimPendingRewardRequest.Initiator.UNRECOGNIZED : var1;
      }

      public ClaimPendingRewardRequest.Builder setInitiator(ClaimPendingRewardRequest.Initiator var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 1;
         this.initiator_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public ClaimPendingRewardRequest.Builder clearInitiator() {
         this.bitField0_ &= -2;
         this.initiator_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public int getTypeValue() {
         return this.type_;
      }

      public ClaimPendingRewardRequest.Builder setTypeValue(int var1) {
         this.type_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      @Override
      public PendingRewardType getType() {
         PendingRewardType var1 = PendingRewardType.forNumber(this.type_);
         return var1 == null ? PendingRewardType.UNRECOGNIZED : var1;
      }

      public ClaimPendingRewardRequest.Builder setType(PendingRewardType var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 2;
         this.type_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public ClaimPendingRewardRequest.Builder clearType() {
         this.bitField0_ &= -3;
         this.type_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasReward() {
         return (this.bitField0_ & 4) != 0;
      }

      @Override
      public PromotionReward getReward() {
         if (this.rewardBuilder_ == null) {
            return this.reward_ == null ? PromotionReward.getDefaultInstance() : this.reward_;
         } else {
            return this.rewardBuilder_.getMessage();
         }
      }

      public ClaimPendingRewardRequest.Builder setReward(PromotionReward var1) {
         if (this.rewardBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.reward_ = var1;
         } else {
            this.rewardBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public ClaimPendingRewardRequest.Builder setReward(PromotionReward.Builder var1) {
         if (this.rewardBuilder_ == null) {
            this.reward_ = var1.build();
         } else {
            this.rewardBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public ClaimPendingRewardRequest.Builder mergeReward(PromotionReward var1) {
         if (this.rewardBuilder_ == null) {
            if ((this.bitField0_ & 4) != 0 && this.reward_ != null && this.reward_ != PromotionReward.getDefaultInstance()) {
               this.getRewardBuilder().mergeFrom(var1);
            } else {
               this.reward_ = var1;
            }
         } else {
            this.rewardBuilder_.mergeFrom(var1);
         }

         if (this.reward_ != null) {
            this.bitField0_ |= 4;
            this.onChanged();
         }

         return this;
      }

      public ClaimPendingRewardRequest.Builder clearReward() {
         this.bitField0_ &= -5;
         this.reward_ = null;
         if (this.rewardBuilder_ != null) {
            this.rewardBuilder_.dispose();
            this.rewardBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public PromotionReward.Builder getRewardBuilder() {
         this.bitField0_ |= 4;
         this.onChanged();
         return this.getRewardFieldBuilder().getBuilder();
      }

      @Override
      public PromotionRewardOrBuilder getRewardOrBuilder() {
         if (this.rewardBuilder_ != null) {
            return this.rewardBuilder_.getMessageOrBuilder();
         } else {
            return this.reward_ == null ? PromotionReward.getDefaultInstance() : this.reward_;
         }
      }

      private SingleFieldBuilderV3<PromotionReward, PromotionReward.Builder, PromotionRewardOrBuilder> getRewardFieldBuilder() {
         if (this.rewardBuilder_ == null) {
            this.rewardBuilder_ = new SingleFieldBuilderV3<>(this.getReward(), this.getParentForChildren(), this.isClean());
            this.reward_ = null;
         }

         return this.rewardBuilder_;
      }

      public final ClaimPendingRewardRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (ClaimPendingRewardRequest.Builder)super.setUnknownFields(var1);
      }

      public final ClaimPendingRewardRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (ClaimPendingRewardRequest.Builder)super.mergeUnknownFields(var1);
      }
   }

   public enum Initiator implements ProtocolMessageEnum {
      INITIATOR_UNSPECIFIED(0),
      INITIATOR_GAME_HOME(1),
      UNRECOGNIZED(-1);

      public static final int INITIATOR_UNSPECIFIED_VALUE = 0;
      public static final int INITIATOR_GAME_HOME_VALUE = 1;
      private static final Internal.EnumLiteMap<ClaimPendingRewardRequest.Initiator> internalValueMap = new Internal.EnumLiteMap<ClaimPendingRewardRequest.Initiator>() {
         public ClaimPendingRewardRequest.Initiator findValueByNumber(int var1) {
            return ClaimPendingRewardRequest.Initiator.forNumber(var1);
         }
      };
      private static final ClaimPendingRewardRequest.Initiator[] VALUES = values();
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
      public static ClaimPendingRewardRequest.Initiator valueOf(int var0) {
         return forNumber(var0);
      }

      public static ClaimPendingRewardRequest.Initiator forNumber(int var0) {
         switch (var0) {
            case 0:
               return INITIATOR_UNSPECIFIED;
            case 1:
               return INITIATOR_GAME_HOME;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<ClaimPendingRewardRequest.Initiator> internalGetValueMap() {
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
         return ClaimPendingRewardRequest.getDescriptor().getEnumTypes().get(0);
      }

      public static ClaimPendingRewardRequest.Initiator valueOf(Descriptors.EnumValueDescriptor var0) {
         if (var0.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
         }
      }

      Initiator(int var3) {
         this.value = var3;
      }
   }
}
