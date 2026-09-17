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
import com.google.protobuf.Timestamp;
import com.google.protobuf.TimestampOrBuilder;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import com.lunarclient.common.v1.Color;
import com.lunarclient.common.v1.ColorOrBuilder;
import com.lunarclient.common.v1.UuidAndUsername;
import com.lunarclient.common.v1.UuidAndUsernameOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class FriendRequest extends GeneratedMessageV3 implements FriendRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int PLAYER_FIELD_NUMBER = 1;
   private UuidAndUsername player_;
   public static final int SENT_AT_FIELD_NUMBER = 2;
   private Timestamp sentAt_;
   public static final int PLAYER_LOGO_COLOR_FIELD_NUMBER = 3;
   private Color playerLogoColor_;
   public static final int PLAYER_PLUS_COLOR_FIELD_NUMBER = 4;
   private Color playerPlusColor_;
   public static final int PLAYER_RANK_NAME_FIELD_NUMBER = 5;
   private volatile Object playerRankName_ = "";
   public static final int PLAYER_BADGE_ID_FIELD_NUMBER = 6;
   private int playerBadgeId_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final FriendRequest DEFAULT_INSTANCE = new FriendRequest();
   private static final Parser<FriendRequest> PARSER = new AbstractParser<FriendRequest>() {
      public FriendRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         FriendRequest.Builder var3 = FriendRequest.newBuilder();

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

   private FriendRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private FriendRequest() {
      this.playerRankName_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new FriendRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_friend_v1_FriendRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_friend_v1_FriendRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(FriendRequest.class, FriendRequest.Builder.class);
   }

   @Override
   public boolean hasPlayer() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public UuidAndUsername getPlayer() {
      return this.player_ == null ? UuidAndUsername.getDefaultInstance() : this.player_;
   }

   @Override
   public UuidAndUsernameOrBuilder getPlayerOrBuilder() {
      return this.player_ == null ? UuidAndUsername.getDefaultInstance() : this.player_;
   }

   @Override
   public boolean hasSentAt() {
      return (this.bitField0_ & 2) != 0;
   }

   @Override
   public Timestamp getSentAt() {
      return this.sentAt_ == null ? Timestamp.getDefaultInstance() : this.sentAt_;
   }

   @Override
   public TimestampOrBuilder getSentAtOrBuilder() {
      return this.sentAt_ == null ? Timestamp.getDefaultInstance() : this.sentAt_;
   }

   @Override
   public boolean hasPlayerLogoColor() {
      return (this.bitField0_ & 4) != 0;
   }

   @Override
   public Color getPlayerLogoColor() {
      return this.playerLogoColor_ == null ? Color.getDefaultInstance() : this.playerLogoColor_;
   }

   @Override
   public ColorOrBuilder getPlayerLogoColorOrBuilder() {
      return this.playerLogoColor_ == null ? Color.getDefaultInstance() : this.playerLogoColor_;
   }

   @Override
   public boolean hasPlayerPlusColor() {
      return (this.bitField0_ & 8) != 0;
   }

   @Override
   public Color getPlayerPlusColor() {
      return this.playerPlusColor_ == null ? Color.getDefaultInstance() : this.playerPlusColor_;
   }

   @Override
   public ColorOrBuilder getPlayerPlusColorOrBuilder() {
      return this.playerPlusColor_ == null ? Color.getDefaultInstance() : this.playerPlusColor_;
   }

   @Override
   public String getPlayerRankName() {
      Object var1 = this.playerRankName_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.playerRankName_ = var3;
      return var3;
   }

   @Override
   public ByteString getPlayerRankNameBytes() {
      Object var1 = this.playerRankName_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.playerRankName_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public int getPlayerBadgeId() {
      return this.playerBadgeId_;
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
         var1.writeMessage(1, this.getPlayer());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1.writeMessage(2, this.getSentAt());
      }

      if ((this.bitField0_ & 4) != 0) {
         var1.writeMessage(3, this.getPlayerLogoColor());
      }

      if ((this.bitField0_ & 8) != 0) {
         var1.writeMessage(4, this.getPlayerPlusColor());
      }

      if (!GeneratedMessageV3.isStringEmpty(this.playerRankName_)) {
         GeneratedMessageV3.writeString(var1, 5, this.playerRankName_);
      }

      if (this.playerBadgeId_ != 0) {
         var1.writeInt32(6, this.playerBadgeId_);
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
         var1 += CodedOutputStream.computeMessageSize(1, this.getPlayer());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1 += CodedOutputStream.computeMessageSize(2, this.getSentAt());
      }

      if ((this.bitField0_ & 4) != 0) {
         var1 += CodedOutputStream.computeMessageSize(3, this.getPlayerLogoColor());
      }

      if ((this.bitField0_ & 8) != 0) {
         var1 += CodedOutputStream.computeMessageSize(4, this.getPlayerPlusColor());
      }

      if (!GeneratedMessageV3.isStringEmpty(this.playerRankName_)) {
         var1 += GeneratedMessageV3.computeStringSize(5, this.playerRankName_);
      }

      if (this.playerBadgeId_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(6, this.playerBadgeId_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof FriendRequest)) {
         return super.equals(var1);
      } else {
         FriendRequest var2 = (FriendRequest)var1;
         if (this.hasPlayer() != var2.hasPlayer()) {
            return false;
         } else if (this.hasPlayer() && !this.getPlayer().equals(var2.getPlayer())) {
            return false;
         } else if (this.hasSentAt() != var2.hasSentAt()) {
            return false;
         } else if (this.hasSentAt() && !this.getSentAt().equals(var2.getSentAt())) {
            return false;
         } else if (this.hasPlayerLogoColor() != var2.hasPlayerLogoColor()) {
            return false;
         } else if (this.hasPlayerLogoColor() && !this.getPlayerLogoColor().equals(var2.getPlayerLogoColor())) {
            return false;
         } else if (this.hasPlayerPlusColor() != var2.hasPlayerPlusColor()) {
            return false;
         } else if (this.hasPlayerPlusColor() && !this.getPlayerPlusColor().equals(var2.getPlayerPlusColor())) {
            return false;
         } else if (!this.getPlayerRankName().equals(var2.getPlayerRankName())) {
            return false;
         } else {
            return this.getPlayerBadgeId() != var2.getPlayerBadgeId() ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.hasPlayer()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getPlayer().hashCode();
      }

      if (this.hasSentAt()) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getSentAt().hashCode();
      }

      if (this.hasPlayerLogoColor()) {
         var1 = 37 * var1 + 3;
         var1 = 53 * var1 + this.getPlayerLogoColor().hashCode();
      }

      if (this.hasPlayerPlusColor()) {
         var1 = 37 * var1 + 4;
         var1 = 53 * var1 + this.getPlayerPlusColor().hashCode();
      }

      var1 = 37 * var1 + 5;
      var1 = 53 * var1 + this.getPlayerRankName().hashCode();
      var1 = 37 * var1 + 6;
      var1 = 53 * var1 + this.getPlayerBadgeId();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static FriendRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static FriendRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static FriendRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static FriendRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static FriendRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static FriendRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static FriendRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static FriendRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static FriendRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static FriendRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static FriendRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static FriendRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public FriendRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static FriendRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static FriendRequest.Builder newBuilder(FriendRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public FriendRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new FriendRequest.Builder() : new FriendRequest.Builder().mergeFrom(this);
   }

   protected FriendRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new FriendRequest.Builder(var1);
   }

   public static FriendRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<FriendRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<FriendRequest> getParserForType() {
      return PARSER;
   }

   public FriendRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<FriendRequest.Builder> implements FriendRequestOrBuilder {
      private int bitField0_;
      private UuidAndUsername player_;
      private SingleFieldBuilderV3<UuidAndUsername, UuidAndUsername.Builder, UuidAndUsernameOrBuilder> playerBuilder_;
      private Timestamp sentAt_;
      private SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> sentAtBuilder_;
      private Color playerLogoColor_;
      private SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> playerLogoColorBuilder_;
      private Color playerPlusColor_;
      private SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> playerPlusColorBuilder_;
      private Object playerRankName_ = "";
      private int playerBadgeId_;

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_friend_v1_FriendRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_friend_v1_FriendRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(FriendRequest.class, FriendRequest.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (FriendRequest.alwaysUseFieldBuilders) {
            this.getPlayerFieldBuilder();
            this.getSentAtFieldBuilder();
            this.getPlayerLogoColorFieldBuilder();
            this.getPlayerPlusColorFieldBuilder();
         }
      }

      public FriendRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.player_ = null;
         if (this.playerBuilder_ != null) {
            this.playerBuilder_.dispose();
            this.playerBuilder_ = null;
         }

         this.sentAt_ = null;
         if (this.sentAtBuilder_ != null) {
            this.sentAtBuilder_.dispose();
            this.sentAtBuilder_ = null;
         }

         this.playerLogoColor_ = null;
         if (this.playerLogoColorBuilder_ != null) {
            this.playerLogoColorBuilder_.dispose();
            this.playerLogoColorBuilder_ = null;
         }

         this.playerPlusColor_ = null;
         if (this.playerPlusColorBuilder_ != null) {
            this.playerPlusColorBuilder_.dispose();
            this.playerPlusColorBuilder_ = null;
         }

         this.playerRankName_ = "";
         this.playerBadgeId_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_friend_v1_FriendRequest_descriptor;
      }

      public FriendRequest getDefaultInstanceForType() {
         return FriendRequest.getDefaultInstance();
      }

      public FriendRequest build() {
         FriendRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public FriendRequest buildPartial() {
         FriendRequest var1 = new FriendRequest(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(FriendRequest var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.player_ = this.playerBuilder_ == null ? this.player_ : this.playerBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.sentAt_ = this.sentAtBuilder_ == null ? this.sentAt_ : this.sentAtBuilder_.build();
            var3 |= 2;
         }

         if ((var2 & 4) != 0) {
            var1.playerLogoColor_ = this.playerLogoColorBuilder_ == null ? this.playerLogoColor_ : this.playerLogoColorBuilder_.build();
            var3 |= 4;
         }

         if ((var2 & 8) != 0) {
            var1.playerPlusColor_ = this.playerPlusColorBuilder_ == null ? this.playerPlusColor_ : this.playerPlusColorBuilder_.build();
            var3 |= 8;
         }

         if ((var2 & 16) != 0) {
            var1.playerRankName_ = this.playerRankName_;
         }

         if ((var2 & 32) != 0) {
            var1.playerBadgeId_ = this.playerBadgeId_;
         }

         FriendRequest var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public FriendRequest.Builder clone() {
         return (FriendRequest.Builder)super.clone();
      }

      public FriendRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (FriendRequest.Builder)super.setField(var1, var2);
      }

      public FriendRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (FriendRequest.Builder)super.clearField(var1);
      }

      public FriendRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (FriendRequest.Builder)super.clearOneof(var1);
      }

      public FriendRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (FriendRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public FriendRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (FriendRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public FriendRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof FriendRequest) {
            return this.mergeFrom((FriendRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public FriendRequest.Builder mergeFrom(FriendRequest var1) {
         if (var1 == FriendRequest.getDefaultInstance()) {
            return this;
         }

         if (var1.hasPlayer()) {
            this.mergePlayer(var1.getPlayer());
         }

         if (var1.hasSentAt()) {
            this.mergeSentAt(var1.getSentAt());
         }

         if (var1.hasPlayerLogoColor()) {
            this.mergePlayerLogoColor(var1.getPlayerLogoColor());
         }

         if (var1.hasPlayerPlusColor()) {
            this.mergePlayerPlusColor(var1.getPlayerPlusColor());
         }

         if (!var1.getPlayerRankName().isEmpty()) {
            this.playerRankName_ = var1.playerRankName_;
            this.bitField0_ |= 16;
            this.onChanged();
         }

         if (var1.getPlayerBadgeId() != 0) {
            this.setPlayerBadgeId(var1.getPlayerBadgeId());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public FriendRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getPlayerFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     var1.readMessage(this.getSentAtFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 2;
                     break;
                  case 26:
                     var1.readMessage(this.getPlayerLogoColorFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 4;
                     break;
                  case 34:
                     var1.readMessage(this.getPlayerPlusColorFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 8;
                     break;
                  case 42:
                     this.playerRankName_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 16;
                     break;
                  case 48:
                     this.playerBadgeId_ = var1.readInt32();
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
      public boolean hasPlayer() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public UuidAndUsername getPlayer() {
         if (this.playerBuilder_ == null) {
            return this.player_ == null ? UuidAndUsername.getDefaultInstance() : this.player_;
         } else {
            return this.playerBuilder_.getMessage();
         }
      }

      public FriendRequest.Builder setPlayer(UuidAndUsername var1) {
         if (this.playerBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.player_ = var1;
         } else {
            this.playerBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public FriendRequest.Builder setPlayer(UuidAndUsername.Builder var1) {
         if (this.playerBuilder_ == null) {
            this.player_ = var1.build();
         } else {
            this.playerBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public FriendRequest.Builder mergePlayer(UuidAndUsername var1) {
         if (this.playerBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.player_ != null && this.player_ != UuidAndUsername.getDefaultInstance()) {
               this.getPlayerBuilder().mergeFrom(var1);
            } else {
               this.player_ = var1;
            }
         } else {
            this.playerBuilder_.mergeFrom(var1);
         }

         if (this.player_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public FriendRequest.Builder clearPlayer() {
         this.bitField0_ &= -2;
         this.player_ = null;
         if (this.playerBuilder_ != null) {
            this.playerBuilder_.dispose();
            this.playerBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public UuidAndUsername.Builder getPlayerBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getPlayerFieldBuilder().getBuilder();
      }

      @Override
      public UuidAndUsernameOrBuilder getPlayerOrBuilder() {
         if (this.playerBuilder_ != null) {
            return this.playerBuilder_.getMessageOrBuilder();
         } else {
            return this.player_ == null ? UuidAndUsername.getDefaultInstance() : this.player_;
         }
      }

      private SingleFieldBuilderV3<UuidAndUsername, UuidAndUsername.Builder, UuidAndUsernameOrBuilder> getPlayerFieldBuilder() {
         if (this.playerBuilder_ == null) {
            this.playerBuilder_ = new SingleFieldBuilderV3<>(this.getPlayer(), this.getParentForChildren(), this.isClean());
            this.player_ = null;
         }

         return this.playerBuilder_;
      }

      @Override
      public boolean hasSentAt() {
         return (this.bitField0_ & 2) != 0;
      }

      @Override
      public Timestamp getSentAt() {
         if (this.sentAtBuilder_ == null) {
            return this.sentAt_ == null ? Timestamp.getDefaultInstance() : this.sentAt_;
         } else {
            return this.sentAtBuilder_.getMessage();
         }
      }

      public FriendRequest.Builder setSentAt(Timestamp var1) {
         if (this.sentAtBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.sentAt_ = var1;
         } else {
            this.sentAtBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public FriendRequest.Builder setSentAt(Timestamp.Builder var1) {
         if (this.sentAtBuilder_ == null) {
            this.sentAt_ = var1.build();
         } else {
            this.sentAtBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public FriendRequest.Builder mergeSentAt(Timestamp var1) {
         if (this.sentAtBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0 && this.sentAt_ != null && this.sentAt_ != Timestamp.getDefaultInstance()) {
               this.getSentAtBuilder().mergeFrom(var1);
            } else {
               this.sentAt_ = var1;
            }
         } else {
            this.sentAtBuilder_.mergeFrom(var1);
         }

         if (this.sentAt_ != null) {
            this.bitField0_ |= 2;
            this.onChanged();
         }

         return this;
      }

      public FriendRequest.Builder clearSentAt() {
         this.bitField0_ &= -3;
         this.sentAt_ = null;
         if (this.sentAtBuilder_ != null) {
            this.sentAtBuilder_.dispose();
            this.sentAtBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Timestamp.Builder getSentAtBuilder() {
         this.bitField0_ |= 2;
         this.onChanged();
         return this.getSentAtFieldBuilder().getBuilder();
      }

      @Override
      public TimestampOrBuilder getSentAtOrBuilder() {
         if (this.sentAtBuilder_ != null) {
            return this.sentAtBuilder_.getMessageOrBuilder();
         } else {
            return this.sentAt_ == null ? Timestamp.getDefaultInstance() : this.sentAt_;
         }
      }

      private SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> getSentAtFieldBuilder() {
         if (this.sentAtBuilder_ == null) {
            this.sentAtBuilder_ = new SingleFieldBuilderV3<>(this.getSentAt(), this.getParentForChildren(), this.isClean());
            this.sentAt_ = null;
         }

         return this.sentAtBuilder_;
      }

      @Override
      public boolean hasPlayerLogoColor() {
         return (this.bitField0_ & 4) != 0;
      }

      @Override
      public Color getPlayerLogoColor() {
         if (this.playerLogoColorBuilder_ == null) {
            return this.playerLogoColor_ == null ? Color.getDefaultInstance() : this.playerLogoColor_;
         } else {
            return this.playerLogoColorBuilder_.getMessage();
         }
      }

      public FriendRequest.Builder setPlayerLogoColor(Color var1) {
         if (this.playerLogoColorBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.playerLogoColor_ = var1;
         } else {
            this.playerLogoColorBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public FriendRequest.Builder setPlayerLogoColor(Color.Builder var1) {
         if (this.playerLogoColorBuilder_ == null) {
            this.playerLogoColor_ = var1.build();
         } else {
            this.playerLogoColorBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public FriendRequest.Builder mergePlayerLogoColor(Color var1) {
         if (this.playerLogoColorBuilder_ == null) {
            if ((this.bitField0_ & 4) != 0 && this.playerLogoColor_ != null && this.playerLogoColor_ != Color.getDefaultInstance()) {
               this.getPlayerLogoColorBuilder().mergeFrom(var1);
            } else {
               this.playerLogoColor_ = var1;
            }
         } else {
            this.playerLogoColorBuilder_.mergeFrom(var1);
         }

         if (this.playerLogoColor_ != null) {
            this.bitField0_ |= 4;
            this.onChanged();
         }

         return this;
      }

      public FriendRequest.Builder clearPlayerLogoColor() {
         this.bitField0_ &= -5;
         this.playerLogoColor_ = null;
         if (this.playerLogoColorBuilder_ != null) {
            this.playerLogoColorBuilder_.dispose();
            this.playerLogoColorBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Color.Builder getPlayerLogoColorBuilder() {
         this.bitField0_ |= 4;
         this.onChanged();
         return this.getPlayerLogoColorFieldBuilder().getBuilder();
      }

      @Override
      public ColorOrBuilder getPlayerLogoColorOrBuilder() {
         if (this.playerLogoColorBuilder_ != null) {
            return this.playerLogoColorBuilder_.getMessageOrBuilder();
         } else {
            return this.playerLogoColor_ == null ? Color.getDefaultInstance() : this.playerLogoColor_;
         }
      }

      private SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> getPlayerLogoColorFieldBuilder() {
         if (this.playerLogoColorBuilder_ == null) {
            this.playerLogoColorBuilder_ = new SingleFieldBuilderV3<>(this.getPlayerLogoColor(), this.getParentForChildren(), this.isClean());
            this.playerLogoColor_ = null;
         }

         return this.playerLogoColorBuilder_;
      }

      @Override
      public boolean hasPlayerPlusColor() {
         return (this.bitField0_ & 8) != 0;
      }

      @Override
      public Color getPlayerPlusColor() {
         if (this.playerPlusColorBuilder_ == null) {
            return this.playerPlusColor_ == null ? Color.getDefaultInstance() : this.playerPlusColor_;
         } else {
            return this.playerPlusColorBuilder_.getMessage();
         }
      }

      public FriendRequest.Builder setPlayerPlusColor(Color var1) {
         if (this.playerPlusColorBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.playerPlusColor_ = var1;
         } else {
            this.playerPlusColorBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public FriendRequest.Builder setPlayerPlusColor(Color.Builder var1) {
         if (this.playerPlusColorBuilder_ == null) {
            this.playerPlusColor_ = var1.build();
         } else {
            this.playerPlusColorBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public FriendRequest.Builder mergePlayerPlusColor(Color var1) {
         if (this.playerPlusColorBuilder_ == null) {
            if ((this.bitField0_ & 8) != 0 && this.playerPlusColor_ != null && this.playerPlusColor_ != Color.getDefaultInstance()) {
               this.getPlayerPlusColorBuilder().mergeFrom(var1);
            } else {
               this.playerPlusColor_ = var1;
            }
         } else {
            this.playerPlusColorBuilder_.mergeFrom(var1);
         }

         if (this.playerPlusColor_ != null) {
            this.bitField0_ |= 8;
            this.onChanged();
         }

         return this;
      }

      public FriendRequest.Builder clearPlayerPlusColor() {
         this.bitField0_ &= -9;
         this.playerPlusColor_ = null;
         if (this.playerPlusColorBuilder_ != null) {
            this.playerPlusColorBuilder_.dispose();
            this.playerPlusColorBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Color.Builder getPlayerPlusColorBuilder() {
         this.bitField0_ |= 8;
         this.onChanged();
         return this.getPlayerPlusColorFieldBuilder().getBuilder();
      }

      @Override
      public ColorOrBuilder getPlayerPlusColorOrBuilder() {
         if (this.playerPlusColorBuilder_ != null) {
            return this.playerPlusColorBuilder_.getMessageOrBuilder();
         } else {
            return this.playerPlusColor_ == null ? Color.getDefaultInstance() : this.playerPlusColor_;
         }
      }

      private SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> getPlayerPlusColorFieldBuilder() {
         if (this.playerPlusColorBuilder_ == null) {
            this.playerPlusColorBuilder_ = new SingleFieldBuilderV3<>(this.getPlayerPlusColor(), this.getParentForChildren(), this.isClean());
            this.playerPlusColor_ = null;
         }

         return this.playerPlusColorBuilder_;
      }

      @Override
      public String getPlayerRankName() {
         Object var1 = this.playerRankName_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.playerRankName_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getPlayerRankNameBytes() {
         Object var1 = this.playerRankName_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.playerRankName_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public FriendRequest.Builder setPlayerRankName(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.playerRankName_ = var1;
         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      public FriendRequest.Builder clearPlayerRankName() {
         this.playerRankName_ = FriendRequest.getDefaultInstance().getPlayerRankName();
         this.bitField0_ &= -17;
         this.onChanged();
         return this;
      }

      public FriendRequest.Builder setPlayerRankNameBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         FriendRequest.checkByteStringIsUtf8(var1);
         this.playerRankName_ = var1;
         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      @Override
      public int getPlayerBadgeId() {
         return this.playerBadgeId_;
      }

      public FriendRequest.Builder setPlayerBadgeId(int var1) {
         this.playerBadgeId_ = var1;
         this.bitField0_ |= 32;
         this.onChanged();
         return this;
      }

      public FriendRequest.Builder clearPlayerBadgeId() {
         this.bitField0_ &= -33;
         this.playerBadgeId_ = 0;
         this.onChanged();
         return this;
      }

      public final FriendRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (FriendRequest.Builder)super.setUnknownFields(var1);
      }

      public final FriendRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (FriendRequest.Builder)super.mergeUnknownFields(var1);
      }
   }
}
