package com.lunarclient.websocket.friend.v1;

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

public final class FriendRequestReceivedPush extends GeneratedMessageV3 implements FriendRequestReceivedPushOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int SENDER_FIELD_NUMBER = 1;
   private UuidAndUsername sender_;
   public static final int SENDER_LOGO_COLOR_FIELD_NUMBER = 3;
   private Color senderLogoColor_;
   public static final int SENDER_PLUS_COLOR_FIELD_NUMBER = 4;
   private Color senderPlusColor_;
   public static final int SENDER_RANK_NAME_FIELD_NUMBER = 5;
   private volatile Object senderRankName_ = "";
   public static final int SENDER_BADGE_ID_FIELD_NUMBER = 6;
   private int senderBadgeId_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final FriendRequestReceivedPush DEFAULT_INSTANCE = new FriendRequestReceivedPush();
   private static final Parser<FriendRequestReceivedPush> PARSER = new AbstractParser<FriendRequestReceivedPush>() {
      public FriendRequestReceivedPush parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         FriendRequestReceivedPush.Builder var3 = FriendRequestReceivedPush.newBuilder();

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

   private FriendRequestReceivedPush(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private FriendRequestReceivedPush() {
      this.senderRankName_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new FriendRequestReceivedPush();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return PushProto.internal_static_lunarclient_websocket_friend_v1_FriendRequestReceivedPush_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return PushProto.internal_static_lunarclient_websocket_friend_v1_FriendRequestReceivedPush_fieldAccessorTable
         .ensureFieldAccessorsInitialized(FriendRequestReceivedPush.class, FriendRequestReceivedPush.Builder.class);
   }

   @Override
   public boolean hasSender() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public UuidAndUsername getSender() {
      return this.sender_ == null ? UuidAndUsername.getDefaultInstance() : this.sender_;
   }

   @Override
   public UuidAndUsernameOrBuilder getSenderOrBuilder() {
      return this.sender_ == null ? UuidAndUsername.getDefaultInstance() : this.sender_;
   }

   @Override
   public boolean hasSenderLogoColor() {
      return (this.bitField0_ & 2) != 0;
   }

   @Override
   public Color getSenderLogoColor() {
      return this.senderLogoColor_ == null ? Color.getDefaultInstance() : this.senderLogoColor_;
   }

   @Override
   public ColorOrBuilder getSenderLogoColorOrBuilder() {
      return this.senderLogoColor_ == null ? Color.getDefaultInstance() : this.senderLogoColor_;
   }

   @Override
   public boolean hasSenderPlusColor() {
      return (this.bitField0_ & 4) != 0;
   }

   @Override
   public Color getSenderPlusColor() {
      return this.senderPlusColor_ == null ? Color.getDefaultInstance() : this.senderPlusColor_;
   }

   @Override
   public ColorOrBuilder getSenderPlusColorOrBuilder() {
      return this.senderPlusColor_ == null ? Color.getDefaultInstance() : this.senderPlusColor_;
   }

   @Override
   public String getSenderRankName() {
      Object var1 = this.senderRankName_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.senderRankName_ = var3;
      return var3;
   }

   @Override
   public ByteString getSenderRankNameBytes() {
      Object var1 = this.senderRankName_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.senderRankName_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public int getSenderBadgeId() {
      return this.senderBadgeId_;
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
      if ((this.bitField0_ & 1) != 0) {
         var1.writeMessage(1, this.getSender());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1.writeMessage(3, this.getSenderLogoColor());
      }

      if ((this.bitField0_ & 4) != 0) {
         var1.writeMessage(4, this.getSenderPlusColor());
      }

      if (!GeneratedMessageV3.isStringEmpty(this.senderRankName_)) {
         GeneratedMessageV3.writeString(var1, 5, this.senderRankName_);
      }

      if (this.senderBadgeId_ != 0) {
         var1.writeInt32(6, this.senderBadgeId_);
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
      if ((this.bitField0_ & 1) != 0) {
         var1 += CodedOutputStream.computeMessageSize(1, this.getSender());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1 += CodedOutputStream.computeMessageSize(3, this.getSenderLogoColor());
      }

      if ((this.bitField0_ & 4) != 0) {
         var1 += CodedOutputStream.computeMessageSize(4, this.getSenderPlusColor());
      }

      if (!GeneratedMessageV3.isStringEmpty(this.senderRankName_)) {
         var1 += GeneratedMessageV3.computeStringSize(5, this.senderRankName_);
      }

      if (this.senderBadgeId_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(6, this.senderBadgeId_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof FriendRequestReceivedPush)) {
         return super.equals(var1);
      } else {
         FriendRequestReceivedPush var2 = (FriendRequestReceivedPush)var1;
         if (this.hasSender() != var2.hasSender()) {
            return false;
         } else if (this.hasSender() && !this.getSender().equals(var2.getSender())) {
            return false;
         } else if (this.hasSenderLogoColor() != var2.hasSenderLogoColor()) {
            return false;
         } else if (this.hasSenderLogoColor() && !this.getSenderLogoColor().equals(var2.getSenderLogoColor())) {
            return false;
         } else if (this.hasSenderPlusColor() != var2.hasSenderPlusColor()) {
            return false;
         } else if (this.hasSenderPlusColor() && !this.getSenderPlusColor().equals(var2.getSenderPlusColor())) {
            return false;
         } else if (!this.getSenderRankName().equals(var2.getSenderRankName())) {
            return false;
         } else {
            return this.getSenderBadgeId() != var2.getSenderBadgeId() ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.hasSender()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getSender().hashCode();
      }

      if (this.hasSenderLogoColor()) {
         var1 = 37 * var1 + 3;
         var1 = 53 * var1 + this.getSenderLogoColor().hashCode();
      }

      if (this.hasSenderPlusColor()) {
         var1 = 37 * var1 + 4;
         var1 = 53 * var1 + this.getSenderPlusColor().hashCode();
      }

      var1 = 37 * var1 + 5;
      var1 = 53 * var1 + this.getSenderRankName().hashCode();
      var1 = 37 * var1 + 6;
      var1 = 53 * var1 + this.getSenderBadgeId();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static FriendRequestReceivedPush parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static FriendRequestReceivedPush parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static FriendRequestReceivedPush parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static FriendRequestReceivedPush parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static FriendRequestReceivedPush parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static FriendRequestReceivedPush parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static FriendRequestReceivedPush parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static FriendRequestReceivedPush parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static FriendRequestReceivedPush parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static FriendRequestReceivedPush parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static FriendRequestReceivedPush parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static FriendRequestReceivedPush parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public FriendRequestReceivedPush.Builder newBuilderForType() {
      return newBuilder();
   }

   public static FriendRequestReceivedPush.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static FriendRequestReceivedPush.Builder newBuilder(FriendRequestReceivedPush var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public FriendRequestReceivedPush.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new FriendRequestReceivedPush.Builder() : new FriendRequestReceivedPush.Builder().mergeFrom(this);
   }

   protected FriendRequestReceivedPush.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new FriendRequestReceivedPush.Builder(var1);
   }

   public static FriendRequestReceivedPush getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<FriendRequestReceivedPush> parser() {
      return PARSER;
   }

   @Override
   public Parser<FriendRequestReceivedPush> getParserForType() {
      return PARSER;
   }

   public FriendRequestReceivedPush getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<FriendRequestReceivedPush.Builder> implements FriendRequestReceivedPushOrBuilder {
      private int bitField0_;
      private UuidAndUsername sender_;
      private SingleFieldBuilderV3<UuidAndUsername, UuidAndUsername.Builder, UuidAndUsernameOrBuilder> senderBuilder_;
      private Color senderLogoColor_;
      private SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> senderLogoColorBuilder_;
      private Color senderPlusColor_;
      private SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> senderPlusColorBuilder_;
      private Object senderRankName_ = "";
      private int senderBadgeId_;

      public static final Descriptors.Descriptor getDescriptor() {
         return PushProto.internal_static_lunarclient_websocket_friend_v1_FriendRequestReceivedPush_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PushProto.internal_static_lunarclient_websocket_friend_v1_FriendRequestReceivedPush_fieldAccessorTable
            .ensureFieldAccessorsInitialized(FriendRequestReceivedPush.class, FriendRequestReceivedPush.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (FriendRequestReceivedPush.alwaysUseFieldBuilders) {
            this.getSenderFieldBuilder();
            this.getSenderLogoColorFieldBuilder();
            this.getSenderPlusColorFieldBuilder();
         }
      }

      public FriendRequestReceivedPush.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.sender_ = null;
         if (this.senderBuilder_ != null) {
            this.senderBuilder_.dispose();
            this.senderBuilder_ = null;
         }

         this.senderLogoColor_ = null;
         if (this.senderLogoColorBuilder_ != null) {
            this.senderLogoColorBuilder_.dispose();
            this.senderLogoColorBuilder_ = null;
         }

         this.senderPlusColor_ = null;
         if (this.senderPlusColorBuilder_ != null) {
            this.senderPlusColorBuilder_.dispose();
            this.senderPlusColorBuilder_ = null;
         }

         this.senderRankName_ = "";
         this.senderBadgeId_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return PushProto.internal_static_lunarclient_websocket_friend_v1_FriendRequestReceivedPush_descriptor;
      }

      public FriendRequestReceivedPush getDefaultInstanceForType() {
         return FriendRequestReceivedPush.getDefaultInstance();
      }

      public FriendRequestReceivedPush build() {
         FriendRequestReceivedPush var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public FriendRequestReceivedPush buildPartial() {
         FriendRequestReceivedPush var1 = new FriendRequestReceivedPush(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(FriendRequestReceivedPush var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.sender_ = this.senderBuilder_ == null ? this.sender_ : this.senderBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.senderLogoColor_ = this.senderLogoColorBuilder_ == null ? this.senderLogoColor_ : this.senderLogoColorBuilder_.build();
            var3 |= 2;
         }

         if ((var2 & 4) != 0) {
            var1.senderPlusColor_ = this.senderPlusColorBuilder_ == null ? this.senderPlusColor_ : this.senderPlusColorBuilder_.build();
            var3 |= 4;
         }

         if ((var2 & 8) != 0) {
            var1.senderRankName_ = this.senderRankName_;
         }

         if ((var2 & 16) != 0) {
            var1.senderBadgeId_ = this.senderBadgeId_;
         }

         FriendRequestReceivedPush var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public FriendRequestReceivedPush.Builder clone() {
         return (FriendRequestReceivedPush.Builder)super.clone();
      }

      public FriendRequestReceivedPush.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (FriendRequestReceivedPush.Builder)super.setField(var1, var2);
      }

      public FriendRequestReceivedPush.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (FriendRequestReceivedPush.Builder)super.clearField(var1);
      }

      public FriendRequestReceivedPush.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (FriendRequestReceivedPush.Builder)super.clearOneof(var1);
      }

      public FriendRequestReceivedPush.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (FriendRequestReceivedPush.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public FriendRequestReceivedPush.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (FriendRequestReceivedPush.Builder)super.addRepeatedField(var1, var2);
      }

      public FriendRequestReceivedPush.Builder mergeFrom(Message var1) {
         if (var1 instanceof FriendRequestReceivedPush) {
            return this.mergeFrom((FriendRequestReceivedPush)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public FriendRequestReceivedPush.Builder mergeFrom(FriendRequestReceivedPush var1) {
         if (var1 == FriendRequestReceivedPush.getDefaultInstance()) {
            return this;
         }

         if (var1.hasSender()) {
            this.mergeSender(var1.getSender());
         }

         if (var1.hasSenderLogoColor()) {
            this.mergeSenderLogoColor(var1.getSenderLogoColor());
         }

         if (var1.hasSenderPlusColor()) {
            this.mergeSenderPlusColor(var1.getSenderPlusColor());
         }

         if (!var1.getSenderRankName().isEmpty()) {
            this.senderRankName_ = var1.senderRankName_;
            this.bitField0_ |= 8;
            this.onChanged();
         }

         if (var1.getSenderBadgeId() != 0) {
            this.setSenderBadgeId(var1.getSenderBadgeId());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public FriendRequestReceivedPush.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getSenderFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 1;
                     break;
                  case 26:
                     var1.readMessage(this.getSenderLogoColorFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 2;
                     break;
                  case 34:
                     var1.readMessage(this.getSenderPlusColorFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 4;
                     break;
                  case 42:
                     this.senderRankName_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 8;
                     break;
                  case 48:
                     this.senderBadgeId_ = var1.readInt32();
                     this.bitField0_ |= 16;
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
      public boolean hasSender() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public UuidAndUsername getSender() {
         if (this.senderBuilder_ == null) {
            return this.sender_ == null ? UuidAndUsername.getDefaultInstance() : this.sender_;
         } else {
            return this.senderBuilder_.getMessage();
         }
      }

      public FriendRequestReceivedPush.Builder setSender(UuidAndUsername var1) {
         if (this.senderBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.sender_ = var1;
         } else {
            this.senderBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public FriendRequestReceivedPush.Builder setSender(UuidAndUsername.Builder var1) {
         if (this.senderBuilder_ == null) {
            this.sender_ = var1.build();
         } else {
            this.senderBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public FriendRequestReceivedPush.Builder mergeSender(UuidAndUsername var1) {
         if (this.senderBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.sender_ != null && this.sender_ != UuidAndUsername.getDefaultInstance()) {
               this.getSenderBuilder().mergeFrom(var1);
            } else {
               this.sender_ = var1;
            }
         } else {
            this.senderBuilder_.mergeFrom(var1);
         }

         if (this.sender_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public FriendRequestReceivedPush.Builder clearSender() {
         this.bitField0_ &= -2;
         this.sender_ = null;
         if (this.senderBuilder_ != null) {
            this.senderBuilder_.dispose();
            this.senderBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public UuidAndUsername.Builder getSenderBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getSenderFieldBuilder().getBuilder();
      }

      @Override
      public UuidAndUsernameOrBuilder getSenderOrBuilder() {
         if (this.senderBuilder_ != null) {
            return this.senderBuilder_.getMessageOrBuilder();
         } else {
            return this.sender_ == null ? UuidAndUsername.getDefaultInstance() : this.sender_;
         }
      }

      private SingleFieldBuilderV3<UuidAndUsername, UuidAndUsername.Builder, UuidAndUsernameOrBuilder> getSenderFieldBuilder() {
         if (this.senderBuilder_ == null) {
            this.senderBuilder_ = new SingleFieldBuilderV3<>(this.getSender(), this.getParentForChildren(), this.isClean());
            this.sender_ = null;
         }

         return this.senderBuilder_;
      }

      @Override
      public boolean hasSenderLogoColor() {
         return (this.bitField0_ & 2) != 0;
      }

      @Override
      public Color getSenderLogoColor() {
         if (this.senderLogoColorBuilder_ == null) {
            return this.senderLogoColor_ == null ? Color.getDefaultInstance() : this.senderLogoColor_;
         } else {
            return this.senderLogoColorBuilder_.getMessage();
         }
      }

      public FriendRequestReceivedPush.Builder setSenderLogoColor(Color var1) {
         if (this.senderLogoColorBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.senderLogoColor_ = var1;
         } else {
            this.senderLogoColorBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public FriendRequestReceivedPush.Builder setSenderLogoColor(Color.Builder var1) {
         if (this.senderLogoColorBuilder_ == null) {
            this.senderLogoColor_ = var1.build();
         } else {
            this.senderLogoColorBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public FriendRequestReceivedPush.Builder mergeSenderLogoColor(Color var1) {
         if (this.senderLogoColorBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0 && this.senderLogoColor_ != null && this.senderLogoColor_ != Color.getDefaultInstance()) {
               this.getSenderLogoColorBuilder().mergeFrom(var1);
            } else {
               this.senderLogoColor_ = var1;
            }
         } else {
            this.senderLogoColorBuilder_.mergeFrom(var1);
         }

         if (this.senderLogoColor_ != null) {
            this.bitField0_ |= 2;
            this.onChanged();
         }

         return this;
      }

      public FriendRequestReceivedPush.Builder clearSenderLogoColor() {
         this.bitField0_ &= -3;
         this.senderLogoColor_ = null;
         if (this.senderLogoColorBuilder_ != null) {
            this.senderLogoColorBuilder_.dispose();
            this.senderLogoColorBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Color.Builder getSenderLogoColorBuilder() {
         this.bitField0_ |= 2;
         this.onChanged();
         return this.getSenderLogoColorFieldBuilder().getBuilder();
      }

      @Override
      public ColorOrBuilder getSenderLogoColorOrBuilder() {
         if (this.senderLogoColorBuilder_ != null) {
            return this.senderLogoColorBuilder_.getMessageOrBuilder();
         } else {
            return this.senderLogoColor_ == null ? Color.getDefaultInstance() : this.senderLogoColor_;
         }
      }

      private SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> getSenderLogoColorFieldBuilder() {
         if (this.senderLogoColorBuilder_ == null) {
            this.senderLogoColorBuilder_ = new SingleFieldBuilderV3<>(this.getSenderLogoColor(), this.getParentForChildren(), this.isClean());
            this.senderLogoColor_ = null;
         }

         return this.senderLogoColorBuilder_;
      }

      @Override
      public boolean hasSenderPlusColor() {
         return (this.bitField0_ & 4) != 0;
      }

      @Override
      public Color getSenderPlusColor() {
         if (this.senderPlusColorBuilder_ == null) {
            return this.senderPlusColor_ == null ? Color.getDefaultInstance() : this.senderPlusColor_;
         } else {
            return this.senderPlusColorBuilder_.getMessage();
         }
      }

      public FriendRequestReceivedPush.Builder setSenderPlusColor(Color var1) {
         if (this.senderPlusColorBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.senderPlusColor_ = var1;
         } else {
            this.senderPlusColorBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public FriendRequestReceivedPush.Builder setSenderPlusColor(Color.Builder var1) {
         if (this.senderPlusColorBuilder_ == null) {
            this.senderPlusColor_ = var1.build();
         } else {
            this.senderPlusColorBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public FriendRequestReceivedPush.Builder mergeSenderPlusColor(Color var1) {
         if (this.senderPlusColorBuilder_ == null) {
            if ((this.bitField0_ & 4) != 0 && this.senderPlusColor_ != null && this.senderPlusColor_ != Color.getDefaultInstance()) {
               this.getSenderPlusColorBuilder().mergeFrom(var1);
            } else {
               this.senderPlusColor_ = var1;
            }
         } else {
            this.senderPlusColorBuilder_.mergeFrom(var1);
         }

         if (this.senderPlusColor_ != null) {
            this.bitField0_ |= 4;
            this.onChanged();
         }

         return this;
      }

      public FriendRequestReceivedPush.Builder clearSenderPlusColor() {
         this.bitField0_ &= -5;
         this.senderPlusColor_ = null;
         if (this.senderPlusColorBuilder_ != null) {
            this.senderPlusColorBuilder_.dispose();
            this.senderPlusColorBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Color.Builder getSenderPlusColorBuilder() {
         this.bitField0_ |= 4;
         this.onChanged();
         return this.getSenderPlusColorFieldBuilder().getBuilder();
      }

      @Override
      public ColorOrBuilder getSenderPlusColorOrBuilder() {
         if (this.senderPlusColorBuilder_ != null) {
            return this.senderPlusColorBuilder_.getMessageOrBuilder();
         } else {
            return this.senderPlusColor_ == null ? Color.getDefaultInstance() : this.senderPlusColor_;
         }
      }

      private SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> getSenderPlusColorFieldBuilder() {
         if (this.senderPlusColorBuilder_ == null) {
            this.senderPlusColorBuilder_ = new SingleFieldBuilderV3<>(this.getSenderPlusColor(), this.getParentForChildren(), this.isClean());
            this.senderPlusColor_ = null;
         }

         return this.senderPlusColorBuilder_;
      }

      @Override
      public String getSenderRankName() {
         Object var1 = this.senderRankName_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.senderRankName_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getSenderRankNameBytes() {
         Object var1 = this.senderRankName_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.senderRankName_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public FriendRequestReceivedPush.Builder setSenderRankName(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.senderRankName_ = var1;
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public FriendRequestReceivedPush.Builder clearSenderRankName() {
         this.senderRankName_ = FriendRequestReceivedPush.getDefaultInstance().getSenderRankName();
         this.bitField0_ &= -9;
         this.onChanged();
         return this;
      }

      public FriendRequestReceivedPush.Builder setSenderRankNameBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         FriendRequestReceivedPush.checkByteStringIsUtf8(var1);
         this.senderRankName_ = var1;
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      @Override
      public int getSenderBadgeId() {
         return this.senderBadgeId_;
      }

      public FriendRequestReceivedPush.Builder setSenderBadgeId(int var1) {
         this.senderBadgeId_ = var1;
         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      public FriendRequestReceivedPush.Builder clearSenderBadgeId() {
         this.bitField0_ &= -17;
         this.senderBadgeId_ = 0;
         this.onChanged();
         return this;
      }

      public final FriendRequestReceivedPush.Builder setUnknownFields(UnknownFieldSet var1) {
         return (FriendRequestReceivedPush.Builder)super.setUnknownFields(var1);
      }

      public final FriendRequestReceivedPush.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (FriendRequestReceivedPush.Builder)super.mergeUnknownFields(var1);
      }
   }
}
