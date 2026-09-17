package com.lunarclient.websocket.friend.v1;

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
import com.lunarclient.common.v1.Color;
import com.lunarclient.common.v1.ColorOrBuilder;
import com.lunarclient.common.v1.UuidAndUsername;
import com.lunarclient.common.v1.UuidAndUsernameOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class SendFriendRequestResponse extends GeneratedMessageV3 implements SendFriendRequestResponseOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int STATUS_FIELD_NUMBER = 1;
   private int status_ = 0;
   public static final int TARGET_FIELD_NUMBER = 2;
   private UuidAndUsername target_;
   public static final int TARGET_LOGO_COLOR_FIELD_NUMBER = 3;
   private Color targetLogoColor_;
   public static final int TARGET_PLUS_COLOR_FIELD_NUMBER = 4;
   private Color targetPlusColor_;
   public static final int TARGET_RANK_NAME_FIELD_NUMBER = 5;
   private volatile Object targetRankName_ = "";
   public static final int TARGET_BADGE_ID_FIELD_NUMBER = 6;
   private int targetBadgeId_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final SendFriendRequestResponse DEFAULT_INSTANCE = new SendFriendRequestResponse();
   private static final Parser<SendFriendRequestResponse> PARSER = new AbstractParser<SendFriendRequestResponse>() {
      public SendFriendRequestResponse parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         SendFriendRequestResponse.Builder var3 = SendFriendRequestResponse.newBuilder();

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

   private SendFriendRequestResponse(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private SendFriendRequestResponse() {
      this.status_ = 0;
      this.targetRankName_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new SendFriendRequestResponse();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_friend_v1_SendFriendRequestResponse_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_friend_v1_SendFriendRequestResponse_fieldAccessorTable
         .ensureFieldAccessorsInitialized(SendFriendRequestResponse.class, SendFriendRequestResponse.Builder.class);
   }

   @Override
   public int getStatusValue() {
      return this.status_;
   }

   @Override
   public SendFriendRequestResponse.Status getStatus() {
      SendFriendRequestResponse.Status var1 = SendFriendRequestResponse.Status.forNumber(this.status_);
      return var1 == null ? SendFriendRequestResponse.Status.UNRECOGNIZED : var1;
   }

   @Override
   public boolean hasTarget() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public UuidAndUsername getTarget() {
      return this.target_ == null ? UuidAndUsername.getDefaultInstance() : this.target_;
   }

   @Override
   public UuidAndUsernameOrBuilder getTargetOrBuilder() {
      return this.target_ == null ? UuidAndUsername.getDefaultInstance() : this.target_;
   }

   @Override
   public boolean hasTargetLogoColor() {
      return (this.bitField0_ & 2) != 0;
   }

   @Override
   public Color getTargetLogoColor() {
      return this.targetLogoColor_ == null ? Color.getDefaultInstance() : this.targetLogoColor_;
   }

   @Override
   public ColorOrBuilder getTargetLogoColorOrBuilder() {
      return this.targetLogoColor_ == null ? Color.getDefaultInstance() : this.targetLogoColor_;
   }

   @Override
   public boolean hasTargetPlusColor() {
      return (this.bitField0_ & 4) != 0;
   }

   @Override
   public Color getTargetPlusColor() {
      return this.targetPlusColor_ == null ? Color.getDefaultInstance() : this.targetPlusColor_;
   }

   @Override
   public ColorOrBuilder getTargetPlusColorOrBuilder() {
      return this.targetPlusColor_ == null ? Color.getDefaultInstance() : this.targetPlusColor_;
   }

   @Override
   public String getTargetRankName() {
      Object var1 = this.targetRankName_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.targetRankName_ = var3;
      return var3;
   }

   @Override
   public ByteString getTargetRankNameBytes() {
      Object var1 = this.targetRankName_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.targetRankName_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public int getTargetBadgeId() {
      return this.targetBadgeId_;
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
      if (this.status_ != SendFriendRequestResponse.Status.STATUS_UNSPECIFIED.getNumber()) {
         var1.writeEnum(1, this.status_);
      }

      if ((this.bitField0_ & 1) != 0) {
         var1.writeMessage(2, this.getTarget());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1.writeMessage(3, this.getTargetLogoColor());
      }

      if ((this.bitField0_ & 4) != 0) {
         var1.writeMessage(4, this.getTargetPlusColor());
      }

      if (!GeneratedMessageV3.isStringEmpty(this.targetRankName_)) {
         GeneratedMessageV3.writeString(var1, 5, this.targetRankName_);
      }

      if (this.targetBadgeId_ != 0) {
         var1.writeInt32(6, this.targetBadgeId_);
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
      if (this.status_ != SendFriendRequestResponse.Status.STATUS_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(1, this.status_);
      }

      if ((this.bitField0_ & 1) != 0) {
         var1 += CodedOutputStream.computeMessageSize(2, this.getTarget());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1 += CodedOutputStream.computeMessageSize(3, this.getTargetLogoColor());
      }

      if ((this.bitField0_ & 4) != 0) {
         var1 += CodedOutputStream.computeMessageSize(4, this.getTargetPlusColor());
      }

      if (!GeneratedMessageV3.isStringEmpty(this.targetRankName_)) {
         var1 += GeneratedMessageV3.computeStringSize(5, this.targetRankName_);
      }

      if (this.targetBadgeId_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(6, this.targetBadgeId_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof SendFriendRequestResponse)) {
         return super.equals(var1);
      } else {
         SendFriendRequestResponse var2 = (SendFriendRequestResponse)var1;
         if (this.status_ != var2.status_) {
            return false;
         } else if (this.hasTarget() != var2.hasTarget()) {
            return false;
         } else if (this.hasTarget() && !this.getTarget().equals(var2.getTarget())) {
            return false;
         } else if (this.hasTargetLogoColor() != var2.hasTargetLogoColor()) {
            return false;
         } else if (this.hasTargetLogoColor() && !this.getTargetLogoColor().equals(var2.getTargetLogoColor())) {
            return false;
         } else if (this.hasTargetPlusColor() != var2.hasTargetPlusColor()) {
            return false;
         } else if (this.hasTargetPlusColor() && !this.getTargetPlusColor().equals(var2.getTargetPlusColor())) {
            return false;
         } else if (!this.getTargetRankName().equals(var2.getTargetRankName())) {
            return false;
         } else {
            return this.getTargetBadgeId() != var2.getTargetBadgeId() ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + this.status_;
      if (this.hasTarget()) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getTarget().hashCode();
      }

      if (this.hasTargetLogoColor()) {
         var1 = 37 * var1 + 3;
         var1 = 53 * var1 + this.getTargetLogoColor().hashCode();
      }

      if (this.hasTargetPlusColor()) {
         var1 = 37 * var1 + 4;
         var1 = 53 * var1 + this.getTargetPlusColor().hashCode();
      }

      var1 = 37 * var1 + 5;
      var1 = 53 * var1 + this.getTargetRankName().hashCode();
      var1 = 37 * var1 + 6;
      var1 = 53 * var1 + this.getTargetBadgeId();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static SendFriendRequestResponse parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static SendFriendRequestResponse parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SendFriendRequestResponse parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static SendFriendRequestResponse parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SendFriendRequestResponse parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static SendFriendRequestResponse parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SendFriendRequestResponse parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SendFriendRequestResponse parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static SendFriendRequestResponse parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static SendFriendRequestResponse parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static SendFriendRequestResponse parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SendFriendRequestResponse parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public SendFriendRequestResponse.Builder newBuilderForType() {
      return newBuilder();
   }

   public static SendFriendRequestResponse.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static SendFriendRequestResponse.Builder newBuilder(SendFriendRequestResponse var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public SendFriendRequestResponse.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new SendFriendRequestResponse.Builder() : new SendFriendRequestResponse.Builder().mergeFrom(this);
   }

   protected SendFriendRequestResponse.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new SendFriendRequestResponse.Builder(var1);
   }

   public static SendFriendRequestResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<SendFriendRequestResponse> parser() {
      return PARSER;
   }

   @Override
   public Parser<SendFriendRequestResponse> getParserForType() {
      return PARSER;
   }

   public SendFriendRequestResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<SendFriendRequestResponse.Builder> implements SendFriendRequestResponseOrBuilder {
      private int bitField0_;
      private int status_ = 0;
      private UuidAndUsername target_;
      private SingleFieldBuilderV3<UuidAndUsername, UuidAndUsername.Builder, UuidAndUsernameOrBuilder> targetBuilder_;
      private Color targetLogoColor_;
      private SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> targetLogoColorBuilder_;
      private Color targetPlusColor_;
      private SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> targetPlusColorBuilder_;
      private Object targetRankName_ = "";
      private int targetBadgeId_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_friend_v1_SendFriendRequestResponse_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_friend_v1_SendFriendRequestResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(SendFriendRequestResponse.class, SendFriendRequestResponse.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (SendFriendRequestResponse.alwaysUseFieldBuilders) {
            this.getTargetFieldBuilder();
            this.getTargetLogoColorFieldBuilder();
            this.getTargetPlusColorFieldBuilder();
         }
      }

      public SendFriendRequestResponse.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.status_ = 0;
         this.target_ = null;
         if (this.targetBuilder_ != null) {
            this.targetBuilder_.dispose();
            this.targetBuilder_ = null;
         }

         this.targetLogoColor_ = null;
         if (this.targetLogoColorBuilder_ != null) {
            this.targetLogoColorBuilder_.dispose();
            this.targetLogoColorBuilder_ = null;
         }

         this.targetPlusColor_ = null;
         if (this.targetPlusColorBuilder_ != null) {
            this.targetPlusColorBuilder_.dispose();
            this.targetPlusColorBuilder_ = null;
         }

         this.targetRankName_ = "";
         this.targetBadgeId_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_friend_v1_SendFriendRequestResponse_descriptor;
      }

      public SendFriendRequestResponse getDefaultInstanceForType() {
         return SendFriendRequestResponse.getDefaultInstance();
      }

      public SendFriendRequestResponse build() {
         SendFriendRequestResponse var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public SendFriendRequestResponse buildPartial() {
         SendFriendRequestResponse var1 = new SendFriendRequestResponse(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(SendFriendRequestResponse var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.status_ = this.status_;
         }

         byte var3 = 0;
         if ((var2 & 2) != 0) {
            var1.target_ = this.targetBuilder_ == null ? this.target_ : this.targetBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 4) != 0) {
            var1.targetLogoColor_ = this.targetLogoColorBuilder_ == null ? this.targetLogoColor_ : this.targetLogoColorBuilder_.build();
            var3 |= 2;
         }

         if ((var2 & 8) != 0) {
            var1.targetPlusColor_ = this.targetPlusColorBuilder_ == null ? this.targetPlusColor_ : this.targetPlusColorBuilder_.build();
            var3 |= 4;
         }

         if ((var2 & 16) != 0) {
            var1.targetRankName_ = this.targetRankName_;
         }

         if ((var2 & 32) != 0) {
            var1.targetBadgeId_ = this.targetBadgeId_;
         }

         SendFriendRequestResponse var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public SendFriendRequestResponse.Builder clone() {
         return (SendFriendRequestResponse.Builder)super.clone();
      }

      public SendFriendRequestResponse.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (SendFriendRequestResponse.Builder)super.setField(var1, var2);
      }

      public SendFriendRequestResponse.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (SendFriendRequestResponse.Builder)super.clearField(var1);
      }

      public SendFriendRequestResponse.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (SendFriendRequestResponse.Builder)super.clearOneof(var1);
      }

      public SendFriendRequestResponse.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (SendFriendRequestResponse.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public SendFriendRequestResponse.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (SendFriendRequestResponse.Builder)super.addRepeatedField(var1, var2);
      }

      public SendFriendRequestResponse.Builder mergeFrom(Message var1) {
         if (var1 instanceof SendFriendRequestResponse) {
            return this.mergeFrom((SendFriendRequestResponse)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public SendFriendRequestResponse.Builder mergeFrom(SendFriendRequestResponse var1) {
         if (var1 == SendFriendRequestResponse.getDefaultInstance()) {
            return this;
         }

         if (var1.status_ != 0) {
            this.setStatusValue(var1.getStatusValue());
         }

         if (var1.hasTarget()) {
            this.mergeTarget(var1.getTarget());
         }

         if (var1.hasTargetLogoColor()) {
            this.mergeTargetLogoColor(var1.getTargetLogoColor());
         }

         if (var1.hasTargetPlusColor()) {
            this.mergeTargetPlusColor(var1.getTargetPlusColor());
         }

         if (!var1.getTargetRankName().isEmpty()) {
            this.targetRankName_ = var1.targetRankName_;
            this.bitField0_ |= 16;
            this.onChanged();
         }

         if (var1.getTargetBadgeId() != 0) {
            this.setTargetBadgeId(var1.getTargetBadgeId());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public SendFriendRequestResponse.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.status_ = var1.readEnum();
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     var1.readMessage(this.getTargetFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 2;
                     break;
                  case 26:
                     var1.readMessage(this.getTargetLogoColorFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 4;
                     break;
                  case 34:
                     var1.readMessage(this.getTargetPlusColorFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 8;
                     break;
                  case 42:
                     this.targetRankName_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 16;
                     break;
                  case 48:
                     this.targetBadgeId_ = var1.readInt32();
                     this.bitField0_ |= 32;
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
      public int getStatusValue() {
         return this.status_;
      }

      public SendFriendRequestResponse.Builder setStatusValue(int var1) {
         this.status_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public SendFriendRequestResponse.Status getStatus() {
         SendFriendRequestResponse.Status var1 = SendFriendRequestResponse.Status.forNumber(this.status_);
         return var1 == null ? SendFriendRequestResponse.Status.UNRECOGNIZED : var1;
      }

      public SendFriendRequestResponse.Builder setStatus(SendFriendRequestResponse.Status var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 1;
         this.status_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public SendFriendRequestResponse.Builder clearStatus() {
         this.bitField0_ &= -2;
         this.status_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasTarget() {
         return (this.bitField0_ & 2) != 0;
      }

      @Override
      public UuidAndUsername getTarget() {
         if (this.targetBuilder_ == null) {
            return this.target_ == null ? UuidAndUsername.getDefaultInstance() : this.target_;
         } else {
            return this.targetBuilder_.getMessage();
         }
      }

      public SendFriendRequestResponse.Builder setTarget(UuidAndUsername var1) {
         if (this.targetBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.target_ = var1;
         } else {
            this.targetBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public SendFriendRequestResponse.Builder setTarget(UuidAndUsername.Builder var1) {
         if (this.targetBuilder_ == null) {
            this.target_ = var1.build();
         } else {
            this.targetBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public SendFriendRequestResponse.Builder mergeTarget(UuidAndUsername var1) {
         if (this.targetBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0 && this.target_ != null && this.target_ != UuidAndUsername.getDefaultInstance()) {
               this.getTargetBuilder().mergeFrom(var1);
            } else {
               this.target_ = var1;
            }
         } else {
            this.targetBuilder_.mergeFrom(var1);
         }

         if (this.target_ != null) {
            this.bitField0_ |= 2;
            this.onChanged();
         }

         return this;
      }

      public SendFriendRequestResponse.Builder clearTarget() {
         this.bitField0_ &= -3;
         this.target_ = null;
         if (this.targetBuilder_ != null) {
            this.targetBuilder_.dispose();
            this.targetBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public UuidAndUsername.Builder getTargetBuilder() {
         this.bitField0_ |= 2;
         this.onChanged();
         return this.getTargetFieldBuilder().getBuilder();
      }

      @Override
      public UuidAndUsernameOrBuilder getTargetOrBuilder() {
         if (this.targetBuilder_ != null) {
            return this.targetBuilder_.getMessageOrBuilder();
         } else {
            return this.target_ == null ? UuidAndUsername.getDefaultInstance() : this.target_;
         }
      }

      private SingleFieldBuilderV3<UuidAndUsername, UuidAndUsername.Builder, UuidAndUsernameOrBuilder> getTargetFieldBuilder() {
         if (this.targetBuilder_ == null) {
            this.targetBuilder_ = new SingleFieldBuilderV3<>(this.getTarget(), this.getParentForChildren(), this.isClean());
            this.target_ = null;
         }

         return this.targetBuilder_;
      }

      @Override
      public boolean hasTargetLogoColor() {
         return (this.bitField0_ & 4) != 0;
      }

      @Override
      public Color getTargetLogoColor() {
         if (this.targetLogoColorBuilder_ == null) {
            return this.targetLogoColor_ == null ? Color.getDefaultInstance() : this.targetLogoColor_;
         } else {
            return this.targetLogoColorBuilder_.getMessage();
         }
      }

      public SendFriendRequestResponse.Builder setTargetLogoColor(Color var1) {
         if (this.targetLogoColorBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.targetLogoColor_ = var1;
         } else {
            this.targetLogoColorBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public SendFriendRequestResponse.Builder setTargetLogoColor(Color.Builder var1) {
         if (this.targetLogoColorBuilder_ == null) {
            this.targetLogoColor_ = var1.build();
         } else {
            this.targetLogoColorBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public SendFriendRequestResponse.Builder mergeTargetLogoColor(Color var1) {
         if (this.targetLogoColorBuilder_ == null) {
            if ((this.bitField0_ & 4) != 0 && this.targetLogoColor_ != null && this.targetLogoColor_ != Color.getDefaultInstance()) {
               this.getTargetLogoColorBuilder().mergeFrom(var1);
            } else {
               this.targetLogoColor_ = var1;
            }
         } else {
            this.targetLogoColorBuilder_.mergeFrom(var1);
         }

         if (this.targetLogoColor_ != null) {
            this.bitField0_ |= 4;
            this.onChanged();
         }

         return this;
      }

      public SendFriendRequestResponse.Builder clearTargetLogoColor() {
         this.bitField0_ &= -5;
         this.targetLogoColor_ = null;
         if (this.targetLogoColorBuilder_ != null) {
            this.targetLogoColorBuilder_.dispose();
            this.targetLogoColorBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Color.Builder getTargetLogoColorBuilder() {
         this.bitField0_ |= 4;
         this.onChanged();
         return this.getTargetLogoColorFieldBuilder().getBuilder();
      }

      @Override
      public ColorOrBuilder getTargetLogoColorOrBuilder() {
         if (this.targetLogoColorBuilder_ != null) {
            return this.targetLogoColorBuilder_.getMessageOrBuilder();
         } else {
            return this.targetLogoColor_ == null ? Color.getDefaultInstance() : this.targetLogoColor_;
         }
      }

      private SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> getTargetLogoColorFieldBuilder() {
         if (this.targetLogoColorBuilder_ == null) {
            this.targetLogoColorBuilder_ = new SingleFieldBuilderV3<>(this.getTargetLogoColor(), this.getParentForChildren(), this.isClean());
            this.targetLogoColor_ = null;
         }

         return this.targetLogoColorBuilder_;
      }

      @Override
      public boolean hasTargetPlusColor() {
         return (this.bitField0_ & 8) != 0;
      }

      @Override
      public Color getTargetPlusColor() {
         if (this.targetPlusColorBuilder_ == null) {
            return this.targetPlusColor_ == null ? Color.getDefaultInstance() : this.targetPlusColor_;
         } else {
            return this.targetPlusColorBuilder_.getMessage();
         }
      }

      public SendFriendRequestResponse.Builder setTargetPlusColor(Color var1) {
         if (this.targetPlusColorBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.targetPlusColor_ = var1;
         } else {
            this.targetPlusColorBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public SendFriendRequestResponse.Builder setTargetPlusColor(Color.Builder var1) {
         if (this.targetPlusColorBuilder_ == null) {
            this.targetPlusColor_ = var1.build();
         } else {
            this.targetPlusColorBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public SendFriendRequestResponse.Builder mergeTargetPlusColor(Color var1) {
         if (this.targetPlusColorBuilder_ == null) {
            if ((this.bitField0_ & 8) != 0 && this.targetPlusColor_ != null && this.targetPlusColor_ != Color.getDefaultInstance()) {
               this.getTargetPlusColorBuilder().mergeFrom(var1);
            } else {
               this.targetPlusColor_ = var1;
            }
         } else {
            this.targetPlusColorBuilder_.mergeFrom(var1);
         }

         if (this.targetPlusColor_ != null) {
            this.bitField0_ |= 8;
            this.onChanged();
         }

         return this;
      }

      public SendFriendRequestResponse.Builder clearTargetPlusColor() {
         this.bitField0_ &= -9;
         this.targetPlusColor_ = null;
         if (this.targetPlusColorBuilder_ != null) {
            this.targetPlusColorBuilder_.dispose();
            this.targetPlusColorBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Color.Builder getTargetPlusColorBuilder() {
         this.bitField0_ |= 8;
         this.onChanged();
         return this.getTargetPlusColorFieldBuilder().getBuilder();
      }

      @Override
      public ColorOrBuilder getTargetPlusColorOrBuilder() {
         if (this.targetPlusColorBuilder_ != null) {
            return this.targetPlusColorBuilder_.getMessageOrBuilder();
         } else {
            return this.targetPlusColor_ == null ? Color.getDefaultInstance() : this.targetPlusColor_;
         }
      }

      private SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> getTargetPlusColorFieldBuilder() {
         if (this.targetPlusColorBuilder_ == null) {
            this.targetPlusColorBuilder_ = new SingleFieldBuilderV3<>(this.getTargetPlusColor(), this.getParentForChildren(), this.isClean());
            this.targetPlusColor_ = null;
         }

         return this.targetPlusColorBuilder_;
      }

      @Override
      public String getTargetRankName() {
         Object var1 = this.targetRankName_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.targetRankName_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getTargetRankNameBytes() {
         Object var1 = this.targetRankName_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.targetRankName_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public SendFriendRequestResponse.Builder setTargetRankName(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.targetRankName_ = var1;
         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      public SendFriendRequestResponse.Builder clearTargetRankName() {
         this.targetRankName_ = SendFriendRequestResponse.getDefaultInstance().getTargetRankName();
         this.bitField0_ &= -17;
         this.onChanged();
         return this;
      }

      public SendFriendRequestResponse.Builder setTargetRankNameBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         SendFriendRequestResponse.checkByteStringIsUtf8(var1);
         this.targetRankName_ = var1;
         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      @Override
      public int getTargetBadgeId() {
         return this.targetBadgeId_;
      }

      public SendFriendRequestResponse.Builder setTargetBadgeId(int var1) {
         this.targetBadgeId_ = var1;
         this.bitField0_ |= 32;
         this.onChanged();
         return this;
      }

      public SendFriendRequestResponse.Builder clearTargetBadgeId() {
         this.bitField0_ &= -33;
         this.targetBadgeId_ = 0;
         this.onChanged();
         return this;
      }

      public final SendFriendRequestResponse.Builder setUnknownFields(UnknownFieldSet var1) {
         return (SendFriendRequestResponse.Builder)super.setUnknownFields(var1);
      }

      public final SendFriendRequestResponse.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (SendFriendRequestResponse.Builder)super.mergeUnknownFields(var1);
      }
   }

   public enum Status implements ProtocolMessageEnum {
      STATUS_UNSPECIFIED(0),
      STATUS_OK(1),
      STATUS_TARGET_INVALID_USERNAME(2),
      STATUS_TARGET_NOT_FOUND(3),
      STATUS_TARGET_FRIEND_REQUESTS_DISABLED(4),
      STATUS_TARGET_IS_SENDER(5),
      STATUS_ALREADY_FRIENDS(6),
      STATUS_ALREADY_HAVE_INBOUND_REQUEST(7),
      STATUS_ALREADY_HAVE_OUTBOUND_REQUEST(8),
      UNRECOGNIZED(-1);

      public static final int STATUS_UNSPECIFIED_VALUE = 0;
      public static final int STATUS_OK_VALUE = 1;
      public static final int STATUS_TARGET_INVALID_USERNAME_VALUE = 2;
      public static final int STATUS_TARGET_NOT_FOUND_VALUE = 3;
      public static final int STATUS_TARGET_FRIEND_REQUESTS_DISABLED_VALUE = 4;
      public static final int STATUS_TARGET_IS_SENDER_VALUE = 5;
      public static final int STATUS_ALREADY_FRIENDS_VALUE = 6;
      public static final int STATUS_ALREADY_HAVE_INBOUND_REQUEST_VALUE = 7;
      public static final int STATUS_ALREADY_HAVE_OUTBOUND_REQUEST_VALUE = 8;
      private static final Internal.EnumLiteMap<SendFriendRequestResponse.Status> internalValueMap = new Internal.EnumLiteMap<SendFriendRequestResponse.Status>() {
         public SendFriendRequestResponse.Status findValueByNumber(int var1) {
            return SendFriendRequestResponse.Status.forNumber(var1);
         }
      };
      private static final SendFriendRequestResponse.Status[] VALUES = values();
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
      public static SendFriendRequestResponse.Status valueOf(int var0) {
         return forNumber(var0);
      }

      public static SendFriendRequestResponse.Status forNumber(int var0) {
         switch (var0) {
            case 0:
               return STATUS_UNSPECIFIED;
            case 1:
               return STATUS_OK;
            case 2:
               return STATUS_TARGET_INVALID_USERNAME;
            case 3:
               return STATUS_TARGET_NOT_FOUND;
            case 4:
               return STATUS_TARGET_FRIEND_REQUESTS_DISABLED;
            case 5:
               return STATUS_TARGET_IS_SENDER;
            case 6:
               return STATUS_ALREADY_FRIENDS;
            case 7:
               return STATUS_ALREADY_HAVE_INBOUND_REQUEST;
            case 8:
               return STATUS_ALREADY_HAVE_OUTBOUND_REQUEST;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<SendFriendRequestResponse.Status> internalGetValueMap() {
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
         return SendFriendRequestResponse.getDescriptor().getEnumTypes().get(0);
      }

      public static SendFriendRequestResponse.Status valueOf(Descriptors.EnumValueDescriptor var0) {
         if (var0.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
         }
      }

      Status(int var3) {
         this.value = var3;
      }
   }
}
