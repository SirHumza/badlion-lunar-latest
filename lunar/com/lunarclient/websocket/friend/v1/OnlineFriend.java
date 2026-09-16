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
import com.lunarclient.common.v1.Location;
import com.lunarclient.common.v1.LocationOrBuilder;
import com.lunarclient.common.v1.MinecraftVersion;
import com.lunarclient.common.v1.MinecraftVersionOrBuilder;
import com.lunarclient.common.v1.PlayerModpack;
import com.lunarclient.common.v1.PlayerModpackOrBuilder;
import com.lunarclient.common.v1.UuidAndUsername;
import com.lunarclient.common.v1.UuidAndUsernameOrBuilder;
import com.lunarclient.websocket.hostedworld.v1.Joinability;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class OnlineFriend extends GeneratedMessageV3 implements OnlineFriendOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int PLAYER_FIELD_NUMBER = 1;
   private UuidAndUsername player_;
   public static final int STATUS_FIELD_NUMBER = 2;
   private int status_ = 0;
   public static final int LOCATION_FIELD_NUMBER = 3;
   private Location location_;
   public static final int MINECRAFT_VERSION_FIELD_NUMBER = 4;
   private MinecraftVersion minecraftVersion_;
   public static final int JUST_CAME_ONLINE_FIELD_NUMBER = 5;
   private boolean justCameOnline_ = false;
   public static final int HOSTED_WORLD_JOINABILITY_FIELD_NUMBER = 6;
   private int hostedWorldJoinability_ = 0;
   public static final int LOGO_COLOR_FIELD_NUMBER = 7;
   private Color logoColor_;
   public static final int MODPACK_FIELD_NUMBER = 8;
   private PlayerModpack modpack_;
   public static final int PLUS_COLOR_FIELD_NUMBER = 9;
   private Color plusColor_;
   public static final int IS_RADIO_PREMIUM_FIELD_NUMBER = 10;
   private boolean isRadioPremium_ = false;
   public static final int FRIENDS_SINCE_FIELD_NUMBER = 11;
   private Timestamp friendsSince_;
   public static final int SOCIALS_FIELD_NUMBER = 12;
   private FriendSocials socials_;
   public static final int RANK_NAME_FIELD_NUMBER = 13;
   private volatile Object rankName_ = "";
   public static final int COUNTRY_CODE_FIELD_NUMBER = 14;
   private volatile Object countryCode_ = "";
   public static final int BADGE_ID_FIELD_NUMBER = 15;
   private int badgeId_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final OnlineFriend DEFAULT_INSTANCE = new OnlineFriend();
   private static final Parser<OnlineFriend> PARSER = new AbstractParser<OnlineFriend>() {
      public OnlineFriend parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         OnlineFriend.Builder var3 = OnlineFriend.newBuilder();

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

   private OnlineFriend(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private OnlineFriend() {
      this.status_ = 0;
      this.hostedWorldJoinability_ = 0;
      this.rankName_ = "";
      this.countryCode_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new OnlineFriend();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_friend_v1_OnlineFriend_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_friend_v1_OnlineFriend_fieldAccessorTable
         .ensureFieldAccessorsInitialized(OnlineFriend.class, OnlineFriend.Builder.class);
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
   public int getStatusValue() {
      return this.status_;
   }

   @Override
   public OnlineFriendStatus getStatus() {
      OnlineFriendStatus var1 = OnlineFriendStatus.forNumber(this.status_);
      return var1 == null ? OnlineFriendStatus.UNRECOGNIZED : var1;
   }

   @Override
   public boolean hasLocation() {
      return (this.bitField0_ & 2) != 0;
   }

   @Override
   public Location getLocation() {
      return this.location_ == null ? Location.getDefaultInstance() : this.location_;
   }

   @Override
   public LocationOrBuilder getLocationOrBuilder() {
      return this.location_ == null ? Location.getDefaultInstance() : this.location_;
   }

   @Override
   public boolean hasMinecraftVersion() {
      return (this.bitField0_ & 4) != 0;
   }

   @Override
   public MinecraftVersion getMinecraftVersion() {
      return this.minecraftVersion_ == null ? MinecraftVersion.getDefaultInstance() : this.minecraftVersion_;
   }

   @Override
   public MinecraftVersionOrBuilder getMinecraftVersionOrBuilder() {
      return this.minecraftVersion_ == null ? MinecraftVersion.getDefaultInstance() : this.minecraftVersion_;
   }

   @Override
   public boolean getJustCameOnline() {
      return this.justCameOnline_;
   }

   @Override
   public int getHostedWorldJoinabilityValue() {
      return this.hostedWorldJoinability_;
   }

   @Override
   public Joinability getHostedWorldJoinability() {
      Joinability var1 = Joinability.forNumber(this.hostedWorldJoinability_);
      return var1 == null ? Joinability.UNRECOGNIZED : var1;
   }

   @Override
   public boolean hasLogoColor() {
      return (this.bitField0_ & 8) != 0;
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
   public boolean hasModpack() {
      return (this.bitField0_ & 16) != 0;
   }

   @Override
   public PlayerModpack getModpack() {
      return this.modpack_ == null ? PlayerModpack.getDefaultInstance() : this.modpack_;
   }

   @Override
   public PlayerModpackOrBuilder getModpackOrBuilder() {
      return this.modpack_ == null ? PlayerModpack.getDefaultInstance() : this.modpack_;
   }

   @Override
   public boolean hasPlusColor() {
      return (this.bitField0_ & 32) != 0;
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
      return (this.bitField0_ & 64) != 0;
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
      return (this.bitField0_ & 128) != 0;
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

      if (this.status_ != OnlineFriendStatus.ONLINE_FRIEND_STATUS_UNSPECIFIED.getNumber()) {
         var1.writeEnum(2, this.status_);
      }

      if ((this.bitField0_ & 2) != 0) {
         var1.writeMessage(3, this.getLocation());
      }

      if ((this.bitField0_ & 4) != 0) {
         var1.writeMessage(4, this.getMinecraftVersion());
      }

      if (this.justCameOnline_) {
         var1.writeBool(5, this.justCameOnline_);
      }

      if (this.hostedWorldJoinability_ != Joinability.JOINABILITY_UNSPECIFIED.getNumber()) {
         var1.writeEnum(6, this.hostedWorldJoinability_);
      }

      if ((this.bitField0_ & 8) != 0) {
         var1.writeMessage(7, this.getLogoColor());
      }

      if ((this.bitField0_ & 16) != 0) {
         var1.writeMessage(8, this.getModpack());
      }

      if ((this.bitField0_ & 32) != 0) {
         var1.writeMessage(9, this.getPlusColor());
      }

      if (this.isRadioPremium_) {
         var1.writeBool(10, this.isRadioPremium_);
      }

      if ((this.bitField0_ & 64) != 0) {
         var1.writeMessage(11, this.getFriendsSince());
      }

      if ((this.bitField0_ & 128) != 0) {
         var1.writeMessage(12, this.getSocials());
      }

      if (!GeneratedMessageV3.isStringEmpty(this.rankName_)) {
         GeneratedMessageV3.writeString(var1, 13, this.rankName_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.countryCode_)) {
         GeneratedMessageV3.writeString(var1, 14, this.countryCode_);
      }

      if (this.badgeId_ != 0) {
         var1.writeInt32(15, this.badgeId_);
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

      if (this.status_ != OnlineFriendStatus.ONLINE_FRIEND_STATUS_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(2, this.status_);
      }

      if ((this.bitField0_ & 2) != 0) {
         var1 += CodedOutputStream.computeMessageSize(3, this.getLocation());
      }

      if ((this.bitField0_ & 4) != 0) {
         var1 += CodedOutputStream.computeMessageSize(4, this.getMinecraftVersion());
      }

      if (this.justCameOnline_) {
         var1 += CodedOutputStream.computeBoolSize(5, this.justCameOnline_);
      }

      if (this.hostedWorldJoinability_ != Joinability.JOINABILITY_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(6, this.hostedWorldJoinability_);
      }

      if ((this.bitField0_ & 8) != 0) {
         var1 += CodedOutputStream.computeMessageSize(7, this.getLogoColor());
      }

      if ((this.bitField0_ & 16) != 0) {
         var1 += CodedOutputStream.computeMessageSize(8, this.getModpack());
      }

      if ((this.bitField0_ & 32) != 0) {
         var1 += CodedOutputStream.computeMessageSize(9, this.getPlusColor());
      }

      if (this.isRadioPremium_) {
         var1 += CodedOutputStream.computeBoolSize(10, this.isRadioPremium_);
      }

      if ((this.bitField0_ & 64) != 0) {
         var1 += CodedOutputStream.computeMessageSize(11, this.getFriendsSince());
      }

      if ((this.bitField0_ & 128) != 0) {
         var1 += CodedOutputStream.computeMessageSize(12, this.getSocials());
      }

      if (!GeneratedMessageV3.isStringEmpty(this.rankName_)) {
         var1 += GeneratedMessageV3.computeStringSize(13, this.rankName_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.countryCode_)) {
         var1 += GeneratedMessageV3.computeStringSize(14, this.countryCode_);
      }

      if (this.badgeId_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(15, this.badgeId_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof OnlineFriend)) {
         return super.equals(var1);
      } else {
         OnlineFriend var2 = (OnlineFriend)var1;
         if (this.hasPlayer() != var2.hasPlayer()) {
            return false;
         } else if (this.hasPlayer() && !this.getPlayer().equals(var2.getPlayer())) {
            return false;
         } else if (this.status_ != var2.status_) {
            return false;
         } else if (this.hasLocation() != var2.hasLocation()) {
            return false;
         } else if (this.hasLocation() && !this.getLocation().equals(var2.getLocation())) {
            return false;
         } else if (this.hasMinecraftVersion() != var2.hasMinecraftVersion()) {
            return false;
         } else if (this.hasMinecraftVersion() && !this.getMinecraftVersion().equals(var2.getMinecraftVersion())) {
            return false;
         } else if (this.getJustCameOnline() != var2.getJustCameOnline()) {
            return false;
         } else if (this.hostedWorldJoinability_ != var2.hostedWorldJoinability_) {
            return false;
         } else if (this.hasLogoColor() != var2.hasLogoColor()) {
            return false;
         } else if (this.hasLogoColor() && !this.getLogoColor().equals(var2.getLogoColor())) {
            return false;
         } else if (this.hasModpack() != var2.hasModpack()) {
            return false;
         } else if (this.hasModpack() && !this.getModpack().equals(var2.getModpack())) {
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

      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.status_;
      if (this.hasLocation()) {
         var1 = 37 * var1 + 3;
         var1 = 53 * var1 + this.getLocation().hashCode();
      }

      if (this.hasMinecraftVersion()) {
         var1 = 37 * var1 + 4;
         var1 = 53 * var1 + this.getMinecraftVersion().hashCode();
      }

      var1 = 37 * var1 + 5;
      var1 = 53 * var1 + Internal.hashBoolean(this.getJustCameOnline());
      var1 = 37 * var1 + 6;
      var1 = 53 * var1 + this.hostedWorldJoinability_;
      if (this.hasLogoColor()) {
         var1 = 37 * var1 + 7;
         var1 = 53 * var1 + this.getLogoColor().hashCode();
      }

      if (this.hasModpack()) {
         var1 = 37 * var1 + 8;
         var1 = 53 * var1 + this.getModpack().hashCode();
      }

      if (this.hasPlusColor()) {
         var1 = 37 * var1 + 9;
         var1 = 53 * var1 + this.getPlusColor().hashCode();
      }

      var1 = 37 * var1 + 10;
      var1 = 53 * var1 + Internal.hashBoolean(this.getIsRadioPremium());
      if (this.hasFriendsSince()) {
         var1 = 37 * var1 + 11;
         var1 = 53 * var1 + this.getFriendsSince().hashCode();
      }

      if (this.hasSocials()) {
         var1 = 37 * var1 + 12;
         var1 = 53 * var1 + this.getSocials().hashCode();
      }

      var1 = 37 * var1 + 13;
      var1 = 53 * var1 + this.getRankName().hashCode();
      var1 = 37 * var1 + 14;
      var1 = 53 * var1 + this.getCountryCode().hashCode();
      var1 = 37 * var1 + 15;
      var1 = 53 * var1 + this.getBadgeId();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static OnlineFriend parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static OnlineFriend parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OnlineFriend parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static OnlineFriend parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OnlineFriend parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static OnlineFriend parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OnlineFriend parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static OnlineFriend parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static OnlineFriend parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static OnlineFriend parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static OnlineFriend parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static OnlineFriend parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public OnlineFriend.Builder newBuilderForType() {
      return newBuilder();
   }

   public static OnlineFriend.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static OnlineFriend.Builder newBuilder(OnlineFriend var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public OnlineFriend.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new OnlineFriend.Builder() : new OnlineFriend.Builder().mergeFrom(this);
   }

   protected OnlineFriend.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new OnlineFriend.Builder(var1);
   }

   public static OnlineFriend getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<OnlineFriend> parser() {
      return PARSER;
   }

   @Override
   public Parser<OnlineFriend> getParserForType() {
      return PARSER;
   }

   public OnlineFriend getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<OnlineFriend.Builder> implements OnlineFriendOrBuilder {
      private int bitField0_;
      private UuidAndUsername player_;
      private SingleFieldBuilderV3<UuidAndUsername, UuidAndUsername.Builder, UuidAndUsernameOrBuilder> playerBuilder_;
      private int status_ = 0;
      private Location location_;
      private SingleFieldBuilderV3<Location, Location.Builder, LocationOrBuilder> locationBuilder_;
      private MinecraftVersion minecraftVersion_;
      private SingleFieldBuilderV3<MinecraftVersion, MinecraftVersion.Builder, MinecraftVersionOrBuilder> minecraftVersionBuilder_;
      private boolean justCameOnline_;
      private int hostedWorldJoinability_ = 0;
      private Color logoColor_;
      private SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> logoColorBuilder_;
      private PlayerModpack modpack_;
      private SingleFieldBuilderV3<PlayerModpack, PlayerModpack.Builder, PlayerModpackOrBuilder> modpackBuilder_;
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
         return CommonProto.internal_static_lunarclient_websocket_friend_v1_OnlineFriend_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_friend_v1_OnlineFriend_fieldAccessorTable
            .ensureFieldAccessorsInitialized(OnlineFriend.class, OnlineFriend.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (OnlineFriend.alwaysUseFieldBuilders) {
            this.getPlayerFieldBuilder();
            this.getLocationFieldBuilder();
            this.getMinecraftVersionFieldBuilder();
            this.getLogoColorFieldBuilder();
            this.getModpackFieldBuilder();
            this.getPlusColorFieldBuilder();
            this.getFriendsSinceFieldBuilder();
            this.getSocialsFieldBuilder();
         }
      }

      public OnlineFriend.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.player_ = null;
         if (this.playerBuilder_ != null) {
            this.playerBuilder_.dispose();
            this.playerBuilder_ = null;
         }

         this.status_ = 0;
         this.location_ = null;
         if (this.locationBuilder_ != null) {
            this.locationBuilder_.dispose();
            this.locationBuilder_ = null;
         }

         this.minecraftVersion_ = null;
         if (this.minecraftVersionBuilder_ != null) {
            this.minecraftVersionBuilder_.dispose();
            this.minecraftVersionBuilder_ = null;
         }

         this.justCameOnline_ = false;
         this.hostedWorldJoinability_ = 0;
         this.logoColor_ = null;
         if (this.logoColorBuilder_ != null) {
            this.logoColorBuilder_.dispose();
            this.logoColorBuilder_ = null;
         }

         this.modpack_ = null;
         if (this.modpackBuilder_ != null) {
            this.modpackBuilder_.dispose();
            this.modpackBuilder_ = null;
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
         return CommonProto.internal_static_lunarclient_websocket_friend_v1_OnlineFriend_descriptor;
      }

      public OnlineFriend getDefaultInstanceForType() {
         return OnlineFriend.getDefaultInstance();
      }

      public OnlineFriend build() {
         OnlineFriend var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public OnlineFriend buildPartial() {
         OnlineFriend var1 = new OnlineFriend(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(OnlineFriend var1) {
         int var2 = this.bitField0_;
         short var3 = 0;
         if ((var2 & 1) != 0) {
            var1.player_ = this.playerBuilder_ == null ? this.player_ : this.playerBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.status_ = this.status_;
         }

         if ((var2 & 4) != 0) {
            var1.location_ = this.locationBuilder_ == null ? this.location_ : this.locationBuilder_.build();
            var3 |= 2;
         }

         if ((var2 & 8) != 0) {
            var1.minecraftVersion_ = this.minecraftVersionBuilder_ == null ? this.minecraftVersion_ : this.minecraftVersionBuilder_.build();
            var3 |= 4;
         }

         if ((var2 & 16) != 0) {
            var1.justCameOnline_ = this.justCameOnline_;
         }

         if ((var2 & 32) != 0) {
            var1.hostedWorldJoinability_ = this.hostedWorldJoinability_;
         }

         if ((var2 & 64) != 0) {
            var1.logoColor_ = this.logoColorBuilder_ == null ? this.logoColor_ : this.logoColorBuilder_.build();
            var3 |= 8;
         }

         if ((var2 & 128) != 0) {
            var1.modpack_ = this.modpackBuilder_ == null ? this.modpack_ : this.modpackBuilder_.build();
            var3 |= 16;
         }

         if ((var2 & 256) != 0) {
            var1.plusColor_ = this.plusColorBuilder_ == null ? this.plusColor_ : this.plusColorBuilder_.build();
            var3 |= 32;
         }

         if ((var2 & 512) != 0) {
            var1.isRadioPremium_ = this.isRadioPremium_;
         }

         if ((var2 & 1024) != 0) {
            var1.friendsSince_ = this.friendsSinceBuilder_ == null ? this.friendsSince_ : this.friendsSinceBuilder_.build();
            var3 |= 64;
         }

         if ((var2 & 2048) != 0) {
            var1.socials_ = this.socialsBuilder_ == null ? this.socials_ : this.socialsBuilder_.build();
            var3 |= 128;
         }

         if ((var2 & 4096) != 0) {
            var1.rankName_ = this.rankName_;
         }

         if ((var2 & 8192) != 0) {
            var1.countryCode_ = this.countryCode_;
         }

         if ((var2 & 16384) != 0) {
            var1.badgeId_ = this.badgeId_;
         }

         OnlineFriend var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public OnlineFriend.Builder clone() {
         return (OnlineFriend.Builder)super.clone();
      }

      public OnlineFriend.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (OnlineFriend.Builder)super.setField(var1, var2);
      }

      public OnlineFriend.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (OnlineFriend.Builder)super.clearField(var1);
      }

      public OnlineFriend.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (OnlineFriend.Builder)super.clearOneof(var1);
      }

      public OnlineFriend.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (OnlineFriend.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public OnlineFriend.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (OnlineFriend.Builder)super.addRepeatedField(var1, var2);
      }

      public OnlineFriend.Builder mergeFrom(Message var1) {
         if (var1 instanceof OnlineFriend) {
            return this.mergeFrom((OnlineFriend)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public OnlineFriend.Builder mergeFrom(OnlineFriend var1) {
         if (var1 == OnlineFriend.getDefaultInstance()) {
            return this;
         }

         if (var1.hasPlayer()) {
            this.mergePlayer(var1.getPlayer());
         }

         if (var1.status_ != 0) {
            this.setStatusValue(var1.getStatusValue());
         }

         if (var1.hasLocation()) {
            this.mergeLocation(var1.getLocation());
         }

         if (var1.hasMinecraftVersion()) {
            this.mergeMinecraftVersion(var1.getMinecraftVersion());
         }

         if (var1.getJustCameOnline()) {
            this.setJustCameOnline(var1.getJustCameOnline());
         }

         if (var1.hostedWorldJoinability_ != 0) {
            this.setHostedWorldJoinabilityValue(var1.getHostedWorldJoinabilityValue());
         }

         if (var1.hasLogoColor()) {
            this.mergeLogoColor(var1.getLogoColor());
         }

         if (var1.hasModpack()) {
            this.mergeModpack(var1.getModpack());
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
            this.bitField0_ |= 4096;
            this.onChanged();
         }

         if (!var1.getCountryCode().isEmpty()) {
            this.countryCode_ = var1.countryCode_;
            this.bitField0_ |= 8192;
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

      public OnlineFriend.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                  case 16:
                     this.status_ = var1.readEnum();
                     this.bitField0_ |= 2;
                     break;
                  case 26:
                     var1.readMessage(this.getLocationFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 4;
                     break;
                  case 34:
                     var1.readMessage(this.getMinecraftVersionFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 8;
                     break;
                  case 40:
                     this.justCameOnline_ = var1.readBool();
                     this.bitField0_ |= 16;
                     break;
                  case 48:
                     this.hostedWorldJoinability_ = var1.readEnum();
                     this.bitField0_ |= 32;
                     break;
                  case 58:
                     var1.readMessage(this.getLogoColorFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 64;
                     break;
                  case 66:
                     var1.readMessage(this.getModpackFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 128;
                     break;
                  case 74:
                     var1.readMessage(this.getPlusColorFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 256;
                     break;
                  case 80:
                     this.isRadioPremium_ = var1.readBool();
                     this.bitField0_ |= 512;
                     break;
                  case 90:
                     var1.readMessage(this.getFriendsSinceFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 1024;
                     break;
                  case 98:
                     var1.readMessage(this.getSocialsFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 2048;
                     break;
                  case 106:
                     this.rankName_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 4096;
                     break;
                  case 114:
                     this.countryCode_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 8192;
                     break;
                  case 120:
                     this.badgeId_ = var1.readInt32();
                     this.bitField0_ |= 16384;
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

      public OnlineFriend.Builder setPlayer(UuidAndUsername var1) {
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

      public OnlineFriend.Builder setPlayer(UuidAndUsername.Builder var1) {
         if (this.playerBuilder_ == null) {
            this.player_ = var1.build();
         } else {
            this.playerBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public OnlineFriend.Builder mergePlayer(UuidAndUsername var1) {
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

      public OnlineFriend.Builder clearPlayer() {
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
      public int getStatusValue() {
         return this.status_;
      }

      public OnlineFriend.Builder setStatusValue(int var1) {
         this.status_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      @Override
      public OnlineFriendStatus getStatus() {
         OnlineFriendStatus var1 = OnlineFriendStatus.forNumber(this.status_);
         return var1 == null ? OnlineFriendStatus.UNRECOGNIZED : var1;
      }

      public OnlineFriend.Builder setStatus(OnlineFriendStatus var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 2;
         this.status_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public OnlineFriend.Builder clearStatus() {
         this.bitField0_ &= -3;
         this.status_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasLocation() {
         return (this.bitField0_ & 4) != 0;
      }

      @Override
      public Location getLocation() {
         if (this.locationBuilder_ == null) {
            return this.location_ == null ? Location.getDefaultInstance() : this.location_;
         } else {
            return this.locationBuilder_.getMessage();
         }
      }

      public OnlineFriend.Builder setLocation(Location var1) {
         if (this.locationBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.location_ = var1;
         } else {
            this.locationBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public OnlineFriend.Builder setLocation(Location.Builder var1) {
         if (this.locationBuilder_ == null) {
            this.location_ = var1.build();
         } else {
            this.locationBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public OnlineFriend.Builder mergeLocation(Location var1) {
         if (this.locationBuilder_ == null) {
            if ((this.bitField0_ & 4) != 0 && this.location_ != null && this.location_ != Location.getDefaultInstance()) {
               this.getLocationBuilder().mergeFrom(var1);
            } else {
               this.location_ = var1;
            }
         } else {
            this.locationBuilder_.mergeFrom(var1);
         }

         if (this.location_ != null) {
            this.bitField0_ |= 4;
            this.onChanged();
         }

         return this;
      }

      public OnlineFriend.Builder clearLocation() {
         this.bitField0_ &= -5;
         this.location_ = null;
         if (this.locationBuilder_ != null) {
            this.locationBuilder_.dispose();
            this.locationBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Location.Builder getLocationBuilder() {
         this.bitField0_ |= 4;
         this.onChanged();
         return this.getLocationFieldBuilder().getBuilder();
      }

      @Override
      public LocationOrBuilder getLocationOrBuilder() {
         if (this.locationBuilder_ != null) {
            return this.locationBuilder_.getMessageOrBuilder();
         } else {
            return this.location_ == null ? Location.getDefaultInstance() : this.location_;
         }
      }

      private SingleFieldBuilderV3<Location, Location.Builder, LocationOrBuilder> getLocationFieldBuilder() {
         if (this.locationBuilder_ == null) {
            this.locationBuilder_ = new SingleFieldBuilderV3<>(this.getLocation(), this.getParentForChildren(), this.isClean());
            this.location_ = null;
         }

         return this.locationBuilder_;
      }

      @Override
      public boolean hasMinecraftVersion() {
         return (this.bitField0_ & 8) != 0;
      }

      @Override
      public MinecraftVersion getMinecraftVersion() {
         if (this.minecraftVersionBuilder_ == null) {
            return this.minecraftVersion_ == null ? MinecraftVersion.getDefaultInstance() : this.minecraftVersion_;
         } else {
            return this.minecraftVersionBuilder_.getMessage();
         }
      }

      public OnlineFriend.Builder setMinecraftVersion(MinecraftVersion var1) {
         if (this.minecraftVersionBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.minecraftVersion_ = var1;
         } else {
            this.minecraftVersionBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public OnlineFriend.Builder setMinecraftVersion(MinecraftVersion.Builder var1) {
         if (this.minecraftVersionBuilder_ == null) {
            this.minecraftVersion_ = var1.build();
         } else {
            this.minecraftVersionBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public OnlineFriend.Builder mergeMinecraftVersion(MinecraftVersion var1) {
         if (this.minecraftVersionBuilder_ == null) {
            if ((this.bitField0_ & 8) != 0 && this.minecraftVersion_ != null && this.minecraftVersion_ != MinecraftVersion.getDefaultInstance()) {
               this.getMinecraftVersionBuilder().mergeFrom(var1);
            } else {
               this.minecraftVersion_ = var1;
            }
         } else {
            this.minecraftVersionBuilder_.mergeFrom(var1);
         }

         if (this.minecraftVersion_ != null) {
            this.bitField0_ |= 8;
            this.onChanged();
         }

         return this;
      }

      public OnlineFriend.Builder clearMinecraftVersion() {
         this.bitField0_ &= -9;
         this.minecraftVersion_ = null;
         if (this.minecraftVersionBuilder_ != null) {
            this.minecraftVersionBuilder_.dispose();
            this.minecraftVersionBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public MinecraftVersion.Builder getMinecraftVersionBuilder() {
         this.bitField0_ |= 8;
         this.onChanged();
         return this.getMinecraftVersionFieldBuilder().getBuilder();
      }

      @Override
      public MinecraftVersionOrBuilder getMinecraftVersionOrBuilder() {
         if (this.minecraftVersionBuilder_ != null) {
            return this.minecraftVersionBuilder_.getMessageOrBuilder();
         } else {
            return this.minecraftVersion_ == null ? MinecraftVersion.getDefaultInstance() : this.minecraftVersion_;
         }
      }

      private SingleFieldBuilderV3<MinecraftVersion, MinecraftVersion.Builder, MinecraftVersionOrBuilder> getMinecraftVersionFieldBuilder() {
         if (this.minecraftVersionBuilder_ == null) {
            this.minecraftVersionBuilder_ = new SingleFieldBuilderV3<>(this.getMinecraftVersion(), this.getParentForChildren(), this.isClean());
            this.minecraftVersion_ = null;
         }

         return this.minecraftVersionBuilder_;
      }

      @Override
      public boolean getJustCameOnline() {
         return this.justCameOnline_;
      }

      public OnlineFriend.Builder setJustCameOnline(boolean var1) {
         this.justCameOnline_ = var1;
         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      public OnlineFriend.Builder clearJustCameOnline() {
         this.bitField0_ &= -17;
         this.justCameOnline_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public int getHostedWorldJoinabilityValue() {
         return this.hostedWorldJoinability_;
      }

      public OnlineFriend.Builder setHostedWorldJoinabilityValue(int var1) {
         this.hostedWorldJoinability_ = var1;
         this.bitField0_ |= 32;
         this.onChanged();
         return this;
      }

      @Override
      public Joinability getHostedWorldJoinability() {
         Joinability var1 = Joinability.forNumber(this.hostedWorldJoinability_);
         return var1 == null ? Joinability.UNRECOGNIZED : var1;
      }

      public OnlineFriend.Builder setHostedWorldJoinability(Joinability var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 32;
         this.hostedWorldJoinability_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public OnlineFriend.Builder clearHostedWorldJoinability() {
         this.bitField0_ &= -33;
         this.hostedWorldJoinability_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasLogoColor() {
         return (this.bitField0_ & 64) != 0;
      }

      @Override
      public Color getLogoColor() {
         if (this.logoColorBuilder_ == null) {
            return this.logoColor_ == null ? Color.getDefaultInstance() : this.logoColor_;
         } else {
            return this.logoColorBuilder_.getMessage();
         }
      }

      public OnlineFriend.Builder setLogoColor(Color var1) {
         if (this.logoColorBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.logoColor_ = var1;
         } else {
            this.logoColorBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 64;
         this.onChanged();
         return this;
      }

      public OnlineFriend.Builder setLogoColor(Color.Builder var1) {
         if (this.logoColorBuilder_ == null) {
            this.logoColor_ = var1.build();
         } else {
            this.logoColorBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 64;
         this.onChanged();
         return this;
      }

      public OnlineFriend.Builder mergeLogoColor(Color var1) {
         if (this.logoColorBuilder_ == null) {
            if ((this.bitField0_ & 64) != 0 && this.logoColor_ != null && this.logoColor_ != Color.getDefaultInstance()) {
               this.getLogoColorBuilder().mergeFrom(var1);
            } else {
               this.logoColor_ = var1;
            }
         } else {
            this.logoColorBuilder_.mergeFrom(var1);
         }

         if (this.logoColor_ != null) {
            this.bitField0_ |= 64;
            this.onChanged();
         }

         return this;
      }

      public OnlineFriend.Builder clearLogoColor() {
         this.bitField0_ &= -65;
         this.logoColor_ = null;
         if (this.logoColorBuilder_ != null) {
            this.logoColorBuilder_.dispose();
            this.logoColorBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Color.Builder getLogoColorBuilder() {
         this.bitField0_ |= 64;
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
      public boolean hasModpack() {
         return (this.bitField0_ & 128) != 0;
      }

      @Override
      public PlayerModpack getModpack() {
         if (this.modpackBuilder_ == null) {
            return this.modpack_ == null ? PlayerModpack.getDefaultInstance() : this.modpack_;
         } else {
            return this.modpackBuilder_.getMessage();
         }
      }

      public OnlineFriend.Builder setModpack(PlayerModpack var1) {
         if (this.modpackBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.modpack_ = var1;
         } else {
            this.modpackBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 128;
         this.onChanged();
         return this;
      }

      public OnlineFriend.Builder setModpack(PlayerModpack.Builder var1) {
         if (this.modpackBuilder_ == null) {
            this.modpack_ = var1.build();
         } else {
            this.modpackBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 128;
         this.onChanged();
         return this;
      }

      public OnlineFriend.Builder mergeModpack(PlayerModpack var1) {
         if (this.modpackBuilder_ == null) {
            if ((this.bitField0_ & 128) != 0 && this.modpack_ != null && this.modpack_ != PlayerModpack.getDefaultInstance()) {
               this.getModpackBuilder().mergeFrom(var1);
            } else {
               this.modpack_ = var1;
            }
         } else {
            this.modpackBuilder_.mergeFrom(var1);
         }

         if (this.modpack_ != null) {
            this.bitField0_ |= 128;
            this.onChanged();
         }

         return this;
      }

      public OnlineFriend.Builder clearModpack() {
         this.bitField0_ &= -129;
         this.modpack_ = null;
         if (this.modpackBuilder_ != null) {
            this.modpackBuilder_.dispose();
            this.modpackBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public PlayerModpack.Builder getModpackBuilder() {
         this.bitField0_ |= 128;
         this.onChanged();
         return this.getModpackFieldBuilder().getBuilder();
      }

      @Override
      public PlayerModpackOrBuilder getModpackOrBuilder() {
         if (this.modpackBuilder_ != null) {
            return this.modpackBuilder_.getMessageOrBuilder();
         } else {
            return this.modpack_ == null ? PlayerModpack.getDefaultInstance() : this.modpack_;
         }
      }

      private SingleFieldBuilderV3<PlayerModpack, PlayerModpack.Builder, PlayerModpackOrBuilder> getModpackFieldBuilder() {
         if (this.modpackBuilder_ == null) {
            this.modpackBuilder_ = new SingleFieldBuilderV3<>(this.getModpack(), this.getParentForChildren(), this.isClean());
            this.modpack_ = null;
         }

         return this.modpackBuilder_;
      }

      @Override
      public boolean hasPlusColor() {
         return (this.bitField0_ & 256) != 0;
      }

      @Override
      public Color getPlusColor() {
         if (this.plusColorBuilder_ == null) {
            return this.plusColor_ == null ? Color.getDefaultInstance() : this.plusColor_;
         } else {
            return this.plusColorBuilder_.getMessage();
         }
      }

      public OnlineFriend.Builder setPlusColor(Color var1) {
         if (this.plusColorBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.plusColor_ = var1;
         } else {
            this.plusColorBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 256;
         this.onChanged();
         return this;
      }

      public OnlineFriend.Builder setPlusColor(Color.Builder var1) {
         if (this.plusColorBuilder_ == null) {
            this.plusColor_ = var1.build();
         } else {
            this.plusColorBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 256;
         this.onChanged();
         return this;
      }

      public OnlineFriend.Builder mergePlusColor(Color var1) {
         if (this.plusColorBuilder_ == null) {
            if ((this.bitField0_ & 256) != 0 && this.plusColor_ != null && this.plusColor_ != Color.getDefaultInstance()) {
               this.getPlusColorBuilder().mergeFrom(var1);
            } else {
               this.plusColor_ = var1;
            }
         } else {
            this.plusColorBuilder_.mergeFrom(var1);
         }

         if (this.plusColor_ != null) {
            this.bitField0_ |= 256;
            this.onChanged();
         }

         return this;
      }

      public OnlineFriend.Builder clearPlusColor() {
         this.bitField0_ &= -257;
         this.plusColor_ = null;
         if (this.plusColorBuilder_ != null) {
            this.plusColorBuilder_.dispose();
            this.plusColorBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Color.Builder getPlusColorBuilder() {
         this.bitField0_ |= 256;
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

      public OnlineFriend.Builder setIsRadioPremium(boolean var1) {
         this.isRadioPremium_ = var1;
         this.bitField0_ |= 512;
         this.onChanged();
         return this;
      }

      public OnlineFriend.Builder clearIsRadioPremium() {
         this.bitField0_ &= -513;
         this.isRadioPremium_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasFriendsSince() {
         return (this.bitField0_ & 1024) != 0;
      }

      @Override
      public Timestamp getFriendsSince() {
         if (this.friendsSinceBuilder_ == null) {
            return this.friendsSince_ == null ? Timestamp.getDefaultInstance() : this.friendsSince_;
         } else {
            return this.friendsSinceBuilder_.getMessage();
         }
      }

      public OnlineFriend.Builder setFriendsSince(Timestamp var1) {
         if (this.friendsSinceBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.friendsSince_ = var1;
         } else {
            this.friendsSinceBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1024;
         this.onChanged();
         return this;
      }

      public OnlineFriend.Builder setFriendsSince(Timestamp.Builder var1) {
         if (this.friendsSinceBuilder_ == null) {
            this.friendsSince_ = var1.build();
         } else {
            this.friendsSinceBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1024;
         this.onChanged();
         return this;
      }

      public OnlineFriend.Builder mergeFriendsSince(Timestamp var1) {
         if (this.friendsSinceBuilder_ == null) {
            if ((this.bitField0_ & 1024) != 0 && this.friendsSince_ != null && this.friendsSince_ != Timestamp.getDefaultInstance()) {
               this.getFriendsSinceBuilder().mergeFrom(var1);
            } else {
               this.friendsSince_ = var1;
            }
         } else {
            this.friendsSinceBuilder_.mergeFrom(var1);
         }

         if (this.friendsSince_ != null) {
            this.bitField0_ |= 1024;
            this.onChanged();
         }

         return this;
      }

      public OnlineFriend.Builder clearFriendsSince() {
         this.bitField0_ &= -1025;
         this.friendsSince_ = null;
         if (this.friendsSinceBuilder_ != null) {
            this.friendsSinceBuilder_.dispose();
            this.friendsSinceBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Timestamp.Builder getFriendsSinceBuilder() {
         this.bitField0_ |= 1024;
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
         return (this.bitField0_ & 2048) != 0;
      }

      @Override
      public FriendSocials getSocials() {
         if (this.socialsBuilder_ == null) {
            return this.socials_ == null ? FriendSocials.getDefaultInstance() : this.socials_;
         } else {
            return this.socialsBuilder_.getMessage();
         }
      }

      public OnlineFriend.Builder setSocials(FriendSocials var1) {
         if (this.socialsBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.socials_ = var1;
         } else {
            this.socialsBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 2048;
         this.onChanged();
         return this;
      }

      public OnlineFriend.Builder setSocials(FriendSocials.Builder var1) {
         if (this.socialsBuilder_ == null) {
            this.socials_ = var1.build();
         } else {
            this.socialsBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2048;
         this.onChanged();
         return this;
      }

      public OnlineFriend.Builder mergeSocials(FriendSocials var1) {
         if (this.socialsBuilder_ == null) {
            if ((this.bitField0_ & 2048) != 0 && this.socials_ != null && this.socials_ != FriendSocials.getDefaultInstance()) {
               this.getSocialsBuilder().mergeFrom(var1);
            } else {
               this.socials_ = var1;
            }
         } else {
            this.socialsBuilder_.mergeFrom(var1);
         }

         if (this.socials_ != null) {
            this.bitField0_ |= 2048;
            this.onChanged();
         }

         return this;
      }

      public OnlineFriend.Builder clearSocials() {
         this.bitField0_ &= -2049;
         this.socials_ = null;
         if (this.socialsBuilder_ != null) {
            this.socialsBuilder_.dispose();
            this.socialsBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public FriendSocials.Builder getSocialsBuilder() {
         this.bitField0_ |= 2048;
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

      public OnlineFriend.Builder setRankName(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.rankName_ = var1;
         this.bitField0_ |= 4096;
         this.onChanged();
         return this;
      }

      public OnlineFriend.Builder clearRankName() {
         this.rankName_ = OnlineFriend.getDefaultInstance().getRankName();
         this.bitField0_ &= -4097;
         this.onChanged();
         return this;
      }

      public OnlineFriend.Builder setRankNameBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         OnlineFriend.checkByteStringIsUtf8(var1);
         this.rankName_ = var1;
         this.bitField0_ |= 4096;
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

      public OnlineFriend.Builder setCountryCode(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.countryCode_ = var1;
         this.bitField0_ |= 8192;
         this.onChanged();
         return this;
      }

      public OnlineFriend.Builder clearCountryCode() {
         this.countryCode_ = OnlineFriend.getDefaultInstance().getCountryCode();
         this.bitField0_ &= -8193;
         this.onChanged();
         return this;
      }

      public OnlineFriend.Builder setCountryCodeBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         OnlineFriend.checkByteStringIsUtf8(var1);
         this.countryCode_ = var1;
         this.bitField0_ |= 8192;
         this.onChanged();
         return this;
      }

      @Override
      public int getBadgeId() {
         return this.badgeId_;
      }

      public OnlineFriend.Builder setBadgeId(int var1) {
         this.badgeId_ = var1;
         this.bitField0_ |= 16384;
         this.onChanged();
         return this;
      }

      public OnlineFriend.Builder clearBadgeId() {
         this.bitField0_ &= -16385;
         this.badgeId_ = 0;
         this.onChanged();
         return this;
      }

      public final OnlineFriend.Builder setUnknownFields(UnknownFieldSet var1) {
         return (OnlineFriend.Builder)super.setUnknownFields(var1);
      }

      public final OnlineFriend.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (OnlineFriend.Builder)super.mergeUnknownFields(var1);
      }
   }
}
