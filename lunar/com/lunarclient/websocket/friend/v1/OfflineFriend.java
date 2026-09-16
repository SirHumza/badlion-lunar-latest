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

public final class OfflineFriend extends GeneratedMessageV3 implements OfflineFriendOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int PLAYER_FIELD_NUMBER = 1;
   private UuidAndUsername player_;
   public static final int LAST_VISIBLE_ONLINE_FIELD_NUMBER = 2;
   private Timestamp lastVisibleOnline_;
   public static final int LOGO_COLOR_FIELD_NUMBER = 3;
   private Color logoColor_;
   public static final int PLUS_COLOR_FIELD_NUMBER = 4;
   private Color plusColor_;
   public static final int IS_RADIO_PREMIUM_FIELD_NUMBER = 5;
   private boolean isRadioPremium_ = false;
   public static final int FRIENDS_SINCE_FIELD_NUMBER = 6;
   private Timestamp friendsSince_;
   public static final int SOCIALS_FIELD_NUMBER = 7;
   private FriendSocials socials_;
   public static final int RANK_NAME_FIELD_NUMBER = 8;
   private volatile Object rankName_ = "";
   public static final int COUNTRY_CODE_FIELD_NUMBER = 9;
   private volatile Object countryCode_ = "";
   public static final int BADGE_ID_FIELD_NUMBER = 10;
   private int badgeId_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final OfflineFriend DEFAULT_INSTANCE = new OfflineFriend();
   private static final Parser<OfflineFriend> PARSER = new AbstractParser<OfflineFriend>() {
      public OfflineFriend parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         OfflineFriend.Builder var3 = OfflineFriend.newBuilder();

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

   private OfflineFriend(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private OfflineFriend() {
      this.rankName_ = "";
      this.countryCode_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new OfflineFriend();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_friend_v1_OfflineFriend_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_friend_v1_OfflineFriend_fieldAccessorTable
         .ensureFieldAccessorsInitialized(OfflineFriend.class, OfflineFriend.Builder.class);
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
   public boolean hasLastVisibleOnline() {
      return (this.bitField0_ & 2) != 0;
   }

   @Override
   public Timestamp getLastVisibleOnline() {
      return this.lastVisibleOnline_ == null ? Timestamp.getDefaultInstance() : this.lastVisibleOnline_;
   }

   @Override
   public TimestampOrBuilder getLastVisibleOnlineOrBuilder() {
      return this.lastVisibleOnline_ == null ? Timestamp.getDefaultInstance() : this.lastVisibleOnline_;
   }

   @Override
   public boolean hasLogoColor() {
      return (this.bitField0_ & 4) != 0;
   }

   @Override
   public Color getLogoColor() {
      return this.logoColor_ == null ? Color.getDefaultInstance() : this.logoColor_;
   }

   @Override
   public ColorOrBuilder getLogoColorOrBuilder() {
      return this.logoColor_ == null ? Color.getDefaultInstance() : this.logoColor_;
   }

   @Override
   public boolean hasPlusColor() {
      return (this.bitField0_ & 8) != 0;
   }

   @Override
   public Color getPlusColor() {
      return this.plusColor_ == null ? Color.getDefaultInstance() : this.plusColor_;
   }

   @Override
   public ColorOrBuilder getPlusColorOrBuilder() {
      return this.plusColor_ == null ? Color.getDefaultInstance() : this.plusColor_;
   }

   @Override
   public boolean getIsRadioPremium() {
      return this.isRadioPremium_;
   }

   @Override
   public boolean hasFriendsSince() {
      return (this.bitField0_ & 16) != 0;
   }

   @Override
   public Timestamp getFriendsSince() {
      return this.friendsSince_ == null ? Timestamp.getDefaultInstance() : this.friendsSince_;
   }

   @Override
   public TimestampOrBuilder getFriendsSinceOrBuilder() {
      return this.friendsSince_ == null ? Timestamp.getDefaultInstance() : this.friendsSince_;
   }

   @Override
   public boolean hasSocials() {
      return (this.bitField0_ & 32) != 0;
   }

   @Override
   public FriendSocials getSocials() {
      return this.socials_ == null ? FriendSocials.getDefaultInstance() : this.socials_;
   }

   @Override
   public FriendSocialsOrBuilder getSocialsOrBuilder() {
      return this.socials_ == null ? FriendSocials.getDefaultInstance() : this.socials_;
   }

   @Override
   public String getRankName() {
      Object var1 = this.rankName_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.rankName_ = var3;
      return var3;
   }

   @Override
   public ByteString getRankNameBytes() {
      Object var1 = this.rankName_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.rankName_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public String getCountryCode() {
      Object var1 = this.countryCode_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.countryCode_ = var3;
      return var3;
   }

   @Override
   public ByteString getCountryCodeBytes() {
      Object var1 = this.countryCode_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.countryCode_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public int getBadgeId() {
      return this.badgeId_;
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
         var1.writeMessage(2, this.getLastVisibleOnline());
      }

      if ((this.bitField0_ & 4) != 0) {
         var1.writeMessage(3, this.getLogoColor());
      }

      if ((this.bitField0_ & 8) != 0) {
         var1.writeMessage(4, this.getPlusColor());
      }

      if (this.isRadioPremium_) {
         var1.writeBool(5, this.isRadioPremium_);
      }

      if ((this.bitField0_ & 16) != 0) {
         var1.writeMessage(6, this.getFriendsSince());
      }

      if ((this.bitField0_ & 32) != 0) {
         var1.writeMessage(7, this.getSocials());
      }

      if (!GeneratedMessageV3.isStringEmpty(this.rankName_)) {
         GeneratedMessageV3.writeString(var1, 8, this.rankName_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.countryCode_)) {
         GeneratedMessageV3.writeString(var1, 9, this.countryCode_);
      }

      if (this.badgeId_ != 0) {
         var1.writeInt32(10, this.badgeId_);
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
         var1 += CodedOutputStream.computeMessageSize(2, this.getLastVisibleOnline());
      }

      if ((this.bitField0_ & 4) != 0) {
         var1 += CodedOutputStream.computeMessageSize(3, this.getLogoColor());
      }

      if ((this.bitField0_ & 8) != 0) {
         var1 += CodedOutputStream.computeMessageSize(4, this.getPlusColor());
      }

      if (this.isRadioPremium_) {
         var1 += CodedOutputStream.computeBoolSize(5, this.isRadioPremium_);
      }

      if ((this.bitField0_ & 16) != 0) {
         var1 += CodedOutputStream.computeMessageSize(6, this.getFriendsSince());
      }

      if ((this.bitField0_ & 32) != 0) {
         var1 += CodedOutputStream.computeMessageSize(7, this.getSocials());
      }

      if (!GeneratedMessageV3.isStringEmpty(this.rankName_)) {
         var1 += GeneratedMessageV3.computeStringSize(8, this.rankName_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.countryCode_)) {
         var1 += GeneratedMessageV3.computeStringSize(9, this.countryCode_);
      }

      if (this.badgeId_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(10, this.badgeId_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof OfflineFriend)) {
         return super.equals(var1);
      } else {
         OfflineFriend var2 = (OfflineFriend)var1;
         if (this.hasPlayer() != var2.hasPlayer()) {
            return false;
         } else if (this.hasPlayer() && !this.getPlayer().equals(var2.getPlayer())) {
            return false;
         } else if (this.hasLastVisibleOnline() != var2.hasLastVisibleOnline()) {
            return false;
         } else if (this.hasLastVisibleOnline() && !this.getLastVisibleOnline().equals(var2.getLastVisibleOnline())) {
            return false;
         } else if (this.hasLogoColor() != var2.hasLogoColor()) {
            return false;
         } else if (this.hasLogoColor() && !this.getLogoColor().equals(var2.getLogoColor())) {
            return false;
         } else if (this.hasPlusColor() != var2.hasPlusColor()) {
            return false;
         } else if (this.hasPlusColor() && !this.getPlusColor().equals(var2.getPlusColor())) {
            return false;
         } else if (this.getIsRadioPremium() != var2.getIsRadioPremium()) {
            return false;
         } else if (this.hasFriendsSince() != var2.hasFriendsSince()) {
            return false;
         } else if (this.hasFriendsSince() && !this.getFriendsSince().equals(var2.getFriendsSince())) {
            return false;
         } else if (this.hasSocials() != var2.hasSocials()) {
            return false;
         } else if (this.hasSocials() && !this.getSocials().equals(var2.getSocials())) {
            return false;
         } else if (!this.getRankName().equals(var2.getRankName())) {
            return false;
         } else if (!this.getCountryCode().equals(var2.getCountryCode())) {
            return false;
         } else {
            return this.getBadgeId() != var2.getBadgeId() ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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

      if (this.hasLastVisibleOnline()) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getLastVisibleOnline().hashCode();
      }

      if (this.hasLogoColor()) {
         var1 = 37 * var1 + 3;
         var1 = 53 * var1 + this.getLogoColor().hashCode();
      }

      if (this.hasPlusColor()) {
         var1 = 37 * var1 + 4;
         var1 = 53 * var1 + this.getPlusColor().hashCode();
      }

      var1 = 37 * var1 + 5;
      var1 = 53 * var1 + Internal.hashBoolean(this.getIsRadioPremium());
      if (this.hasFriendsSince()) {
         var1 = 37 * var1 + 6;
         var1 = 53 * var1 + this.getFriendsSince().hashCode();
      }

      if (this.hasSocials()) {
         var1 = 37 * var1 + 7;
         var1 = 53 * var1 + this.getSocials().hashCode();
      }

      var1 = 37 * var1 + 8;
      var1 = 53 * var1 + this.getRankName().hashCode();
      var1 = 37 * var1 + 9;
      var1 = 53 * var1 + this.getCountryCode().hashCode();
      var1 = 37 * var1 + 10;
      var1 = 53 * var1 + this.getBadgeId();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static OfflineFriend parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static OfflineFriend parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OfflineFriend parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static OfflineFriend parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OfflineFriend parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static OfflineFriend parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OfflineFriend parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static OfflineFriend parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static OfflineFriend parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static OfflineFriend parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static OfflineFriend parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static OfflineFriend parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public OfflineFriend.Builder newBuilderForType() {
      return newBuilder();
   }

   public static OfflineFriend.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static OfflineFriend.Builder newBuilder(OfflineFriend var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public OfflineFriend.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new OfflineFriend.Builder() : new OfflineFriend.Builder().mergeFrom(this);
   }

   protected OfflineFriend.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new OfflineFriend.Builder(var1);
   }

   public static OfflineFriend getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<OfflineFriend> parser() {
      return PARSER;
   }

   @Override
   public Parser<OfflineFriend> getParserForType() {
      return PARSER;
   }

   public OfflineFriend getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<OfflineFriend.Builder> implements OfflineFriendOrBuilder {
      private int bitField0_;
      private UuidAndUsername player_;
      private SingleFieldBuilderV3<UuidAndUsername, UuidAndUsername.Builder, UuidAndUsernameOrBuilder> playerBuilder_;
      private Timestamp lastVisibleOnline_;
      private SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> lastVisibleOnlineBuilder_;
      private Color logoColor_;
      private SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> logoColorBuilder_;
      private Color plusColor_;
      private SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> plusColorBuilder_;
      private boolean isRadioPremium_;
      private Timestamp friendsSince_;
      private SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> friendsSinceBuilder_;
      private FriendSocials socials_;
      private SingleFieldBuilderV3<FriendSocials, FriendSocials.Builder, FriendSocialsOrBuilder> socialsBuilder_;
      private Object rankName_ = "";
      private Object countryCode_ = "";
      private int badgeId_;

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_friend_v1_OfflineFriend_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_friend_v1_OfflineFriend_fieldAccessorTable
            .ensureFieldAccessorsInitialized(OfflineFriend.class, OfflineFriend.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (OfflineFriend.alwaysUseFieldBuilders) {
            this.getPlayerFieldBuilder();
            this.getLastVisibleOnlineFieldBuilder();
            this.getLogoColorFieldBuilder();
            this.getPlusColorFieldBuilder();
            this.getFriendsSinceFieldBuilder();
            this.getSocialsFieldBuilder();
         }
      }

      public OfflineFriend.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.player_ = null;
         if (this.playerBuilder_ != null) {
            this.playerBuilder_.dispose();
            this.playerBuilder_ = null;
         }

         this.lastVisibleOnline_ = null;
         if (this.lastVisibleOnlineBuilder_ != null) {
            this.lastVisibleOnlineBuilder_.dispose();
            this.lastVisibleOnlineBuilder_ = null;
         }

         this.logoColor_ = null;
         if (this.logoColorBuilder_ != null) {
            this.logoColorBuilder_.dispose();
            this.logoColorBuilder_ = null;
         }

         this.plusColor_ = null;
         if (this.plusColorBuilder_ != null) {
            this.plusColorBuilder_.dispose();
            this.plusColorBuilder_ = null;
         }

         this.isRadioPremium_ = false;
         this.friendsSince_ = null;
         if (this.friendsSinceBuilder_ != null) {
            this.friendsSinceBuilder_.dispose();
            this.friendsSinceBuilder_ = null;
         }

         this.socials_ = null;
         if (this.socialsBuilder_ != null) {
            this.socialsBuilder_.dispose();
            this.socialsBuilder_ = null;
         }

         this.rankName_ = "";
         this.countryCode_ = "";
         this.badgeId_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_friend_v1_OfflineFriend_descriptor;
      }

      public OfflineFriend getDefaultInstanceForType() {
         return OfflineFriend.getDefaultInstance();
      }

      public OfflineFriend build() {
         OfflineFriend var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public OfflineFriend buildPartial() {
         OfflineFriend var1 = new OfflineFriend(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(OfflineFriend var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.player_ = this.playerBuilder_ == null ? this.player_ : this.playerBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.lastVisibleOnline_ = this.lastVisibleOnlineBuilder_ == null ? this.lastVisibleOnline_ : this.lastVisibleOnlineBuilder_.build();
            var3 |= 2;
         }

         if ((var2 & 4) != 0) {
            var1.logoColor_ = this.logoColorBuilder_ == null ? this.logoColor_ : this.logoColorBuilder_.build();
            var3 |= 4;
         }

         if ((var2 & 8) != 0) {
            var1.plusColor_ = this.plusColorBuilder_ == null ? this.plusColor_ : this.plusColorBuilder_.build();
            var3 |= 8;
         }

         if ((var2 & 16) != 0) {
            var1.isRadioPremium_ = this.isRadioPremium_;
         }

         if ((var2 & 32) != 0) {
            var1.friendsSince_ = this.friendsSinceBuilder_ == null ? this.friendsSince_ : this.friendsSinceBuilder_.build();
            var3 |= 16;
         }

         if ((var2 & 64) != 0) {
            var1.socials_ = this.socialsBuilder_ == null ? this.socials_ : this.socialsBuilder_.build();
            var3 |= 32;
         }

         if ((var2 & 128) != 0) {
            var1.rankName_ = this.rankName_;
         }

         if ((var2 & 256) != 0) {
            var1.countryCode_ = this.countryCode_;
         }

         if ((var2 & 512) != 0) {
            var1.badgeId_ = this.badgeId_;
         }

         OfflineFriend var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public OfflineFriend.Builder clone() {
         return (OfflineFriend.Builder)super.clone();
      }

      public OfflineFriend.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (OfflineFriend.Builder)super.setField(var1, var2);
      }

      public OfflineFriend.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (OfflineFriend.Builder)super.clearField(var1);
      }

      public OfflineFriend.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (OfflineFriend.Builder)super.clearOneof(var1);
      }

      public OfflineFriend.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (OfflineFriend.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public OfflineFriend.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (OfflineFriend.Builder)super.addRepeatedField(var1, var2);
      }

      public OfflineFriend.Builder mergeFrom(Message var1) {
         if (var1 instanceof OfflineFriend) {
            return this.mergeFrom((OfflineFriend)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public OfflineFriend.Builder mergeFrom(OfflineFriend var1) {
         if (var1 == OfflineFriend.getDefaultInstance()) {
            return this;
         }

         if (var1.hasPlayer()) {
            this.mergePlayer(var1.getPlayer());
         }

         if (var1.hasLastVisibleOnline()) {
            this.mergeLastVisibleOnline(var1.getLastVisibleOnline());
         }

         if (var1.hasLogoColor()) {
            this.mergeLogoColor(var1.getLogoColor());
         }

         if (var1.hasPlusColor()) {
            this.mergePlusColor(var1.getPlusColor());
         }

         if (var1.getIsRadioPremium()) {
            this.setIsRadioPremium(var1.getIsRadioPremium());
         }

         if (var1.hasFriendsSince()) {
            this.mergeFriendsSince(var1.getFriendsSince());
         }

         if (var1.hasSocials()) {
            this.mergeSocials(var1.getSocials());
         }

         if (!var1.getRankName().isEmpty()) {
            this.rankName_ = var1.rankName_;
            this.bitField0_ |= 128;
            this.onChanged();
         }

         if (!var1.getCountryCode().isEmpty()) {
            this.countryCode_ = var1.countryCode_;
            this.bitField0_ |= 256;
            this.onChanged();
         }

         if (var1.getBadgeId() != 0) {
            this.setBadgeId(var1.getBadgeId());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public OfflineFriend.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getLastVisibleOnlineFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 2;
                     break;
                  case 26:
                     var1.readMessage(this.getLogoColorFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 4;
                     break;
                  case 34:
                     var1.readMessage(this.getPlusColorFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 8;
                     break;
                  case 40:
                     this.isRadioPremium_ = var1.readBool();
                     this.bitField0_ |= 16;
                     break;
                  case 50:
                     var1.readMessage(this.getFriendsSinceFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 32;
                     break;
                  case 58:
                     var1.readMessage(this.getSocialsFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 64;
                     break;
                  case 66:
                     this.rankName_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 128;
                     break;
                  case 74:
                     this.countryCode_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 256;
                     break;
                  case 80:
                     this.badgeId_ = var1.readInt32();
                     this.bitField0_ |= 512;
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

      public OfflineFriend.Builder setPlayer(UuidAndUsername var1) {
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

      public OfflineFriend.Builder setPlayer(UuidAndUsername.Builder var1) {
         if (this.playerBuilder_ == null) {
            this.player_ = var1.build();
         } else {
            this.playerBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public OfflineFriend.Builder mergePlayer(UuidAndUsername var1) {
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

      public OfflineFriend.Builder clearPlayer() {
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
      public boolean hasLastVisibleOnline() {
         return (this.bitField0_ & 2) != 0;
      }

      @Override
      public Timestamp getLastVisibleOnline() {
         if (this.lastVisibleOnlineBuilder_ == null) {
            return this.lastVisibleOnline_ == null ? Timestamp.getDefaultInstance() : this.lastVisibleOnline_;
         } else {
            return this.lastVisibleOnlineBuilder_.getMessage();
         }
      }

      public OfflineFriend.Builder setLastVisibleOnline(Timestamp var1) {
         if (this.lastVisibleOnlineBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.lastVisibleOnline_ = var1;
         } else {
            this.lastVisibleOnlineBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public OfflineFriend.Builder setLastVisibleOnline(Timestamp.Builder var1) {
         if (this.lastVisibleOnlineBuilder_ == null) {
            this.lastVisibleOnline_ = var1.build();
         } else {
            this.lastVisibleOnlineBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public OfflineFriend.Builder mergeLastVisibleOnline(Timestamp var1) {
         if (this.lastVisibleOnlineBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0 && this.lastVisibleOnline_ != null && this.lastVisibleOnline_ != Timestamp.getDefaultInstance()) {
               this.getLastVisibleOnlineBuilder().mergeFrom(var1);
            } else {
               this.lastVisibleOnline_ = var1;
            }
         } else {
            this.lastVisibleOnlineBuilder_.mergeFrom(var1);
         }

         if (this.lastVisibleOnline_ != null) {
            this.bitField0_ |= 2;
            this.onChanged();
         }

         return this;
      }

      public OfflineFriend.Builder clearLastVisibleOnline() {
         this.bitField0_ &= -3;
         this.lastVisibleOnline_ = null;
         if (this.lastVisibleOnlineBuilder_ != null) {
            this.lastVisibleOnlineBuilder_.dispose();
            this.lastVisibleOnlineBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Timestamp.Builder getLastVisibleOnlineBuilder() {
         this.bitField0_ |= 2;
         this.onChanged();
         return this.getLastVisibleOnlineFieldBuilder().getBuilder();
      }

      @Override
      public TimestampOrBuilder getLastVisibleOnlineOrBuilder() {
         if (this.lastVisibleOnlineBuilder_ != null) {
            return this.lastVisibleOnlineBuilder_.getMessageOrBuilder();
         } else {
            return this.lastVisibleOnline_ == null ? Timestamp.getDefaultInstance() : this.lastVisibleOnline_;
         }
      }

      private SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> getLastVisibleOnlineFieldBuilder() {
         if (this.lastVisibleOnlineBuilder_ == null) {
            this.lastVisibleOnlineBuilder_ = new SingleFieldBuilderV3<>(this.getLastVisibleOnline(), this.getParentForChildren(), this.isClean());
            this.lastVisibleOnline_ = null;
         }

         return this.lastVisibleOnlineBuilder_;
      }

      @Override
      public boolean hasLogoColor() {
         return (this.bitField0_ & 4) != 0;
      }

      @Override
      public Color getLogoColor() {
         if (this.logoColorBuilder_ == null) {
            return this.logoColor_ == null ? Color.getDefaultInstance() : this.logoColor_;
         } else {
            return this.logoColorBuilder_.getMessage();
         }
      }

      public OfflineFriend.Builder setLogoColor(Color var1) {
         if (this.logoColorBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.logoColor_ = var1;
         } else {
            this.logoColorBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public OfflineFriend.Builder setLogoColor(Color.Builder var1) {
         if (this.logoColorBuilder_ == null) {
            this.logoColor_ = var1.build();
         } else {
            this.logoColorBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public OfflineFriend.Builder mergeLogoColor(Color var1) {
         if (this.logoColorBuilder_ == null) {
            if ((this.bitField0_ & 4) != 0 && this.logoColor_ != null && this.logoColor_ != Color.getDefaultInstance()) {
               this.getLogoColorBuilder().mergeFrom(var1);
            } else {
               this.logoColor_ = var1;
            }
         } else {
            this.logoColorBuilder_.mergeFrom(var1);
         }

         if (this.logoColor_ != null) {
            this.bitField0_ |= 4;
            this.onChanged();
         }

         return this;
      }

      public OfflineFriend.Builder clearLogoColor() {
         this.bitField0_ &= -5;
         this.logoColor_ = null;
         if (this.logoColorBuilder_ != null) {
            this.logoColorBuilder_.dispose();
            this.logoColorBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Color.Builder getLogoColorBuilder() {
         this.bitField0_ |= 4;
         this.onChanged();
         return this.getLogoColorFieldBuilder().getBuilder();
      }

      @Override
      public ColorOrBuilder getLogoColorOrBuilder() {
         if (this.logoColorBuilder_ != null) {
            return this.logoColorBuilder_.getMessageOrBuilder();
         } else {
            return this.logoColor_ == null ? Color.getDefaultInstance() : this.logoColor_;
         }
      }

      private SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> getLogoColorFieldBuilder() {
         if (this.logoColorBuilder_ == null) {
            this.logoColorBuilder_ = new SingleFieldBuilderV3<>(this.getLogoColor(), this.getParentForChildren(), this.isClean());
            this.logoColor_ = null;
         }

         return this.logoColorBuilder_;
      }

      @Override
      public boolean hasPlusColor() {
         return (this.bitField0_ & 8) != 0;
      }

      @Override
      public Color getPlusColor() {
         if (this.plusColorBuilder_ == null) {
            return this.plusColor_ == null ? Color.getDefaultInstance() : this.plusColor_;
         } else {
            return this.plusColorBuilder_.getMessage();
         }
      }

      public OfflineFriend.Builder setPlusColor(Color var1) {
         if (this.plusColorBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.plusColor_ = var1;
         } else {
            this.plusColorBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public OfflineFriend.Builder setPlusColor(Color.Builder var1) {
         if (this.plusColorBuilder_ == null) {
            this.plusColor_ = var1.build();
         } else {
            this.plusColorBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public OfflineFriend.Builder mergePlusColor(Color var1) {
         if (this.plusColorBuilder_ == null) {
            if ((this.bitField0_ & 8) != 0 && this.plusColor_ != null && this.plusColor_ != Color.getDefaultInstance()) {
               this.getPlusColorBuilder().mergeFrom(var1);
            } else {
               this.plusColor_ = var1;
            }
         } else {
            this.plusColorBuilder_.mergeFrom(var1);
         }

         if (this.plusColor_ != null) {
            this.bitField0_ |= 8;
            this.onChanged();
         }

         return this;
      }

      public OfflineFriend.Builder clearPlusColor() {
         this.bitField0_ &= -9;
         this.plusColor_ = null;
         if (this.plusColorBuilder_ != null) {
            this.plusColorBuilder_.dispose();
            this.plusColorBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Color.Builder getPlusColorBuilder() {
         this.bitField0_ |= 8;
         this.onChanged();
         return this.getPlusColorFieldBuilder().getBuilder();
      }

      @Override
      public ColorOrBuilder getPlusColorOrBuilder() {
         if (this.plusColorBuilder_ != null) {
            return this.plusColorBuilder_.getMessageOrBuilder();
         } else {
            return this.plusColor_ == null ? Color.getDefaultInstance() : this.plusColor_;
         }
      }

      private SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> getPlusColorFieldBuilder() {
         if (this.plusColorBuilder_ == null) {
            this.plusColorBuilder_ = new SingleFieldBuilderV3<>(this.getPlusColor(), this.getParentForChildren(), this.isClean());
            this.plusColor_ = null;
         }

         return this.plusColorBuilder_;
      }

      @Override
      public boolean getIsRadioPremium() {
         return this.isRadioPremium_;
      }

      public OfflineFriend.Builder setIsRadioPremium(boolean var1) {
         this.isRadioPremium_ = var1;
         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      public OfflineFriend.Builder clearIsRadioPremium() {
         this.bitField0_ &= -17;
         this.isRadioPremium_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasFriendsSince() {
         return (this.bitField0_ & 32) != 0;
      }

      @Override
      public Timestamp getFriendsSince() {
         if (this.friendsSinceBuilder_ == null) {
            return this.friendsSince_ == null ? Timestamp.getDefaultInstance() : this.friendsSince_;
         } else {
            return this.friendsSinceBuilder_.getMessage();
         }
      }

      public OfflineFriend.Builder setFriendsSince(Timestamp var1) {
         if (this.friendsSinceBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.friendsSince_ = var1;
         } else {
            this.friendsSinceBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 32;
         this.onChanged();
         return this;
      }

      public OfflineFriend.Builder setFriendsSince(Timestamp.Builder var1) {
         if (this.friendsSinceBuilder_ == null) {
            this.friendsSince_ = var1.build();
         } else {
            this.friendsSinceBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 32;
         this.onChanged();
         return this;
      }

      public OfflineFriend.Builder mergeFriendsSince(Timestamp var1) {
         if (this.friendsSinceBuilder_ == null) {
            if ((this.bitField0_ & 32) != 0 && this.friendsSince_ != null && this.friendsSince_ != Timestamp.getDefaultInstance()) {
               this.getFriendsSinceBuilder().mergeFrom(var1);
            } else {
               this.friendsSince_ = var1;
            }
         } else {
            this.friendsSinceBuilder_.mergeFrom(var1);
         }

         if (this.friendsSince_ != null) {
            this.bitField0_ |= 32;
            this.onChanged();
         }

         return this;
      }

      public OfflineFriend.Builder clearFriendsSince() {
         this.bitField0_ &= -33;
         this.friendsSince_ = null;
         if (this.friendsSinceBuilder_ != null) {
            this.friendsSinceBuilder_.dispose();
            this.friendsSinceBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Timestamp.Builder getFriendsSinceBuilder() {
         this.bitField0_ |= 32;
         this.onChanged();
         return this.getFriendsSinceFieldBuilder().getBuilder();
      }

      @Override
      public TimestampOrBuilder getFriendsSinceOrBuilder() {
         if (this.friendsSinceBuilder_ != null) {
            return this.friendsSinceBuilder_.getMessageOrBuilder();
         } else {
            return this.friendsSince_ == null ? Timestamp.getDefaultInstance() : this.friendsSince_;
         }
      }

      private SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> getFriendsSinceFieldBuilder() {
         if (this.friendsSinceBuilder_ == null) {
            this.friendsSinceBuilder_ = new SingleFieldBuilderV3<>(this.getFriendsSince(), this.getParentForChildren(), this.isClean());
            this.friendsSince_ = null;
         }

         return this.friendsSinceBuilder_;
      }

      @Override
      public boolean hasSocials() {
         return (this.bitField0_ & 64) != 0;
      }

      @Override
      public FriendSocials getSocials() {
         if (this.socialsBuilder_ == null) {
            return this.socials_ == null ? FriendSocials.getDefaultInstance() : this.socials_;
         } else {
            return this.socialsBuilder_.getMessage();
         }
      }

      public OfflineFriend.Builder setSocials(FriendSocials var1) {
         if (this.socialsBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.socials_ = var1;
         } else {
            this.socialsBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 64;
         this.onChanged();
         return this;
      }

      public OfflineFriend.Builder setSocials(FriendSocials.Builder var1) {
         if (this.socialsBuilder_ == null) {
            this.socials_ = var1.build();
         } else {
            this.socialsBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 64;
         this.onChanged();
         return this;
      }

      public OfflineFriend.Builder mergeSocials(FriendSocials var1) {
         if (this.socialsBuilder_ == null) {
            if ((this.bitField0_ & 64) != 0 && this.socials_ != null && this.socials_ != FriendSocials.getDefaultInstance()) {
               this.getSocialsBuilder().mergeFrom(var1);
            } else {
               this.socials_ = var1;
            }
         } else {
            this.socialsBuilder_.mergeFrom(var1);
         }

         if (this.socials_ != null) {
            this.bitField0_ |= 64;
            this.onChanged();
         }

         return this;
      }

      public OfflineFriend.Builder clearSocials() {
         this.bitField0_ &= -65;
         this.socials_ = null;
         if (this.socialsBuilder_ != null) {
            this.socialsBuilder_.dispose();
            this.socialsBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public FriendSocials.Builder getSocialsBuilder() {
         this.bitField0_ |= 64;
         this.onChanged();
         return this.getSocialsFieldBuilder().getBuilder();
      }

      @Override
      public FriendSocialsOrBuilder getSocialsOrBuilder() {
         if (this.socialsBuilder_ != null) {
            return this.socialsBuilder_.getMessageOrBuilder();
         } else {
            return this.socials_ == null ? FriendSocials.getDefaultInstance() : this.socials_;
         }
      }

      private SingleFieldBuilderV3<FriendSocials, FriendSocials.Builder, FriendSocialsOrBuilder> getSocialsFieldBuilder() {
         if (this.socialsBuilder_ == null) {
            this.socialsBuilder_ = new SingleFieldBuilderV3<>(this.getSocials(), this.getParentForChildren(), this.isClean());
            this.socials_ = null;
         }

         return this.socialsBuilder_;
      }

      @Override
      public String getRankName() {
         Object var1 = this.rankName_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.rankName_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getRankNameBytes() {
         Object var1 = this.rankName_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.rankName_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public OfflineFriend.Builder setRankName(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.rankName_ = var1;
         this.bitField0_ |= 128;
         this.onChanged();
         return this;
      }

      public OfflineFriend.Builder clearRankName() {
         this.rankName_ = OfflineFriend.getDefaultInstance().getRankName();
         this.bitField0_ &= -129;
         this.onChanged();
         return this;
      }

      public OfflineFriend.Builder setRankNameBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         OfflineFriend.checkByteStringIsUtf8(var1);
         this.rankName_ = var1;
         this.bitField0_ |= 128;
         this.onChanged();
         return this;
      }

      @Override
      public String getCountryCode() {
         Object var1 = this.countryCode_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.countryCode_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getCountryCodeBytes() {
         Object var1 = this.countryCode_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.countryCode_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public OfflineFriend.Builder setCountryCode(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.countryCode_ = var1;
         this.bitField0_ |= 256;
         this.onChanged();
         return this;
      }

      public OfflineFriend.Builder clearCountryCode() {
         this.countryCode_ = OfflineFriend.getDefaultInstance().getCountryCode();
         this.bitField0_ &= -257;
         this.onChanged();
         return this;
      }

      public OfflineFriend.Builder setCountryCodeBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         OfflineFriend.checkByteStringIsUtf8(var1);
         this.countryCode_ = var1;
         this.bitField0_ |= 256;
         this.onChanged();
         return this;
      }

      @Override
      public int getBadgeId() {
         return this.badgeId_;
      }

      public OfflineFriend.Builder setBadgeId(int var1) {
         this.badgeId_ = var1;
         this.bitField0_ |= 512;
         this.onChanged();
         return this;
      }

      public OfflineFriend.Builder clearBadgeId() {
         this.bitField0_ &= -513;
         this.badgeId_ = 0;
         this.onChanged();
         return this;
      }

      public final OfflineFriend.Builder setUnknownFields(UnknownFieldSet var1) {
         return (OfflineFriend.Builder)super.setUnknownFields(var1);
      }

      public final OfflineFriend.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (OfflineFriend.Builder)super.mergeUnknownFields(var1);
      }
   }
}
