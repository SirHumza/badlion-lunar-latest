package com.lunarclient.websocket.serverdiscovery.v1;

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
import com.google.protobuf.LazyStringArrayList;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.ProtocolStringList;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.Timestamp;
import com.google.protobuf.TimestampOrBuilder;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import com.lunarclient.common.v1.Color;
import com.lunarclient.common.v1.ColorOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ServerCard extends GeneratedMessageV3 implements ServerCardOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int RECOMMENDATION_ID_FIELD_NUMBER = 1;
   private volatile Object recommendationId_ = "";
   public static final int SERVER_MAPPINGS_ID_FIELD_NUMBER = 11;
   private volatile Object serverMappingsId_ = "";
   public static final int NAME_FIELD_NUMBER = 2;
   private volatile Object name_ = "";
   public static final int LOGO_URL_FIELD_NUMBER = 4;
   private volatile Object logoUrl_ = "";
   public static final int BACKGROUND_URL_FIELD_NUMBER = 5;
   private volatile Object backgroundUrl_ = "";
   public static final int PRIMARY_COLOR_FIELD_NUMBER = 6;
   private Color primaryColor_;
   public static final int PRIMARY_ADDRESS_FIELD_NUMBER = 7;
   private volatile Object primaryAddress_ = "";
   public static final int BADGE_FIELD_NUMBER = 8;
   private int badge_ = 0;
   public static final int LAST_JOINED_FIELD_NUMBER = 9;
   private Timestamp lastJoined_;
   public static final int GAME_MODES_FIELD_NUMBER = 10;
   private LazyStringArrayList gameModes_ = LazyStringArrayList.emptyList();
   public static final int ANNOUNCEMENT_FIELD_NUMBER = 12;
   private Announcement announcement_;
   public static final int REGION_CODES_FIELD_NUMBER = 13;
   private LazyStringArrayList regionCodes_ = LazyStringArrayList.emptyList();
   public static final int GAME_TYPES_FIELD_NUMBER = 14;
   private List<ServerGameType> gameTypes_;
   private byte memoizedIsInitialized = -1;
   private static final ServerCard DEFAULT_INSTANCE = new ServerCard();
   private static final Parser<ServerCard> PARSER = new AbstractParser<ServerCard>() {
      public ServerCard parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         ServerCard.Builder var3 = ServerCard.newBuilder();

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

   private ServerCard(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private ServerCard() {
      this.recommendationId_ = "";
      this.serverMappingsId_ = "";
      this.name_ = "";
      this.logoUrl_ = "";
      this.backgroundUrl_ = "";
      this.primaryAddress_ = "";
      this.badge_ = 0;
      this.gameModes_ = LazyStringArrayList.emptyList();
      this.regionCodes_ = LazyStringArrayList.emptyList();
      this.gameTypes_ = Collections.emptyList();
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new ServerCard();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_serverdiscovery_v1_ServerCard_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_serverdiscovery_v1_ServerCard_fieldAccessorTable
         .ensureFieldAccessorsInitialized(ServerCard.class, ServerCard.Builder.class);
   }

   @Override
   public String getRecommendationId() {
      Object var1 = this.recommendationId_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.recommendationId_ = var3;
      return var3;
   }

   @Override
   public ByteString getRecommendationIdBytes() {
      Object var1 = this.recommendationId_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.recommendationId_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public String getServerMappingsId() {
      Object var1 = this.serverMappingsId_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.serverMappingsId_ = var3;
      return var3;
   }

   @Override
   public ByteString getServerMappingsIdBytes() {
      Object var1 = this.serverMappingsId_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.serverMappingsId_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public String getName() {
      Object var1 = this.name_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.name_ = var3;
      return var3;
   }

   @Override
   public ByteString getNameBytes() {
      Object var1 = this.name_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.name_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public String getLogoUrl() {
      Object var1 = this.logoUrl_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.logoUrl_ = var3;
      return var3;
   }

   @Override
   public ByteString getLogoUrlBytes() {
      Object var1 = this.logoUrl_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.logoUrl_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public String getBackgroundUrl() {
      Object var1 = this.backgroundUrl_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.backgroundUrl_ = var3;
      return var3;
   }

   @Override
   public ByteString getBackgroundUrlBytes() {
      Object var1 = this.backgroundUrl_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.backgroundUrl_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public boolean hasPrimaryColor() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public Color getPrimaryColor() {
      return this.primaryColor_ == null ? Color.getDefaultInstance() : this.primaryColor_;
   }

   @Override
   public ColorOrBuilder getPrimaryColorOrBuilder() {
      return this.primaryColor_ == null ? Color.getDefaultInstance() : this.primaryColor_;
   }

   @Override
   public String getPrimaryAddress() {
      Object var1 = this.primaryAddress_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.primaryAddress_ = var3;
      return var3;
   }

   @Override
   public ByteString getPrimaryAddressBytes() {
      Object var1 = this.primaryAddress_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.primaryAddress_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public int getBadgeValue() {
      return this.badge_;
   }

   @Override
   public ServerCard.Badge getBadge() {
      ServerCard.Badge var1 = ServerCard.Badge.forNumber(this.badge_);
      return var1 == null ? ServerCard.Badge.UNRECOGNIZED : var1;
   }

   @Override
   public boolean hasLastJoined() {
      return (this.bitField0_ & 2) != 0;
   }

   @Override
   public Timestamp getLastJoined() {
      return this.lastJoined_ == null ? Timestamp.getDefaultInstance() : this.lastJoined_;
   }

   @Override
   public TimestampOrBuilder getLastJoinedOrBuilder() {
      return this.lastJoined_ == null ? Timestamp.getDefaultInstance() : this.lastJoined_;
   }

   @Deprecated
   public ProtocolStringList getGameModesList() {
      return this.gameModes_;
   }

   @Deprecated
   @Override
   public int getGameModesCount() {
      return this.gameModes_.size();
   }

   @Deprecated
   @Override
   public String getGameModes(int var1) {
      return this.gameModes_.get(var1);
   }

   @Deprecated
   @Override
   public ByteString getGameModesBytes(int var1) {
      return this.gameModes_.getByteString(var1);
   }

   @Override
   public boolean hasAnnouncement() {
      return (this.bitField0_ & 4) != 0;
   }

   @Override
   public Announcement getAnnouncement() {
      return this.announcement_ == null ? Announcement.getDefaultInstance() : this.announcement_;
   }

   @Override
   public AnnouncementOrBuilder getAnnouncementOrBuilder() {
      return this.announcement_ == null ? Announcement.getDefaultInstance() : this.announcement_;
   }

   public ProtocolStringList getRegionCodesList() {
      return this.regionCodes_;
   }

   @Override
   public int getRegionCodesCount() {
      return this.regionCodes_.size();
   }

   @Override
   public String getRegionCodes(int var1) {
      return this.regionCodes_.get(var1);
   }

   @Override
   public ByteString getRegionCodesBytes(int var1) {
      return this.regionCodes_.getByteString(var1);
   }

   @Override
   public List<ServerGameType> getGameTypesList() {
      return this.gameTypes_;
   }

   @Override
   public List<? extends ServerGameTypeOrBuilder> getGameTypesOrBuilderList() {
      return this.gameTypes_;
   }

   @Override
   public int getGameTypesCount() {
      return this.gameTypes_.size();
   }

   @Override
   public ServerGameType getGameTypes(int var1) {
      return this.gameTypes_.get(var1);
   }

   @Override
   public ServerGameTypeOrBuilder getGameTypesOrBuilder(int var1) {
      return this.gameTypes_.get(var1);
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
      if (!GeneratedMessageV3.isStringEmpty(this.recommendationId_)) {
         GeneratedMessageV3.writeString(var1, 1, this.recommendationId_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.name_)) {
         GeneratedMessageV3.writeString(var1, 2, this.name_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.logoUrl_)) {
         GeneratedMessageV3.writeString(var1, 4, this.logoUrl_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.backgroundUrl_)) {
         GeneratedMessageV3.writeString(var1, 5, this.backgroundUrl_);
      }

      if ((this.bitField0_ & 1) != 0) {
         var1.writeMessage(6, this.getPrimaryColor());
      }

      if (!GeneratedMessageV3.isStringEmpty(this.primaryAddress_)) {
         GeneratedMessageV3.writeString(var1, 7, this.primaryAddress_);
      }

      if (this.badge_ != ServerCard.Badge.BADGE_UNSPECIFIED.getNumber()) {
         var1.writeEnum(8, this.badge_);
      }

      if ((this.bitField0_ & 2) != 0) {
         var1.writeMessage(9, this.getLastJoined());
      }

      for (int var2 = 0; var2 < this.gameModes_.size(); var2++) {
         GeneratedMessageV3.writeString(var1, 10, this.gameModes_.getRaw(var2));
      }

      if (!GeneratedMessageV3.isStringEmpty(this.serverMappingsId_)) {
         GeneratedMessageV3.writeString(var1, 11, this.serverMappingsId_);
      }

      if ((this.bitField0_ & 4) != 0) {
         var1.writeMessage(12, this.getAnnouncement());
      }

      for (int var3 = 0; var3 < this.regionCodes_.size(); var3++) {
         GeneratedMessageV3.writeString(var1, 13, this.regionCodes_.getRaw(var3));
      }

      for (int var4 = 0; var4 < this.gameTypes_.size(); var4++) {
         var1.writeMessage(14, this.gameTypes_.get(var4));
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
      if (!GeneratedMessageV3.isStringEmpty(this.recommendationId_)) {
         var1 += GeneratedMessageV3.computeStringSize(1, this.recommendationId_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.name_)) {
         var1 += GeneratedMessageV3.computeStringSize(2, this.name_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.logoUrl_)) {
         var1 += GeneratedMessageV3.computeStringSize(4, this.logoUrl_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.backgroundUrl_)) {
         var1 += GeneratedMessageV3.computeStringSize(5, this.backgroundUrl_);
      }

      if ((this.bitField0_ & 1) != 0) {
         var1 += CodedOutputStream.computeMessageSize(6, this.getPrimaryColor());
      }

      if (!GeneratedMessageV3.isStringEmpty(this.primaryAddress_)) {
         var1 += GeneratedMessageV3.computeStringSize(7, this.primaryAddress_);
      }

      if (this.badge_ != ServerCard.Badge.BADGE_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(8, this.badge_);
      }

      if ((this.bitField0_ & 2) != 0) {
         var1 += CodedOutputStream.computeMessageSize(9, this.getLastJoined());
      }

      int var2 = 0;

      for (int var3 = 0; var3 < this.gameModes_.size(); var3++) {
         var2 += computeStringSizeNoTag(this.gameModes_.getRaw(var3));
      }

      var1 += var2;
      var1 += 1 * this.getGameModesList().size();
      if (!GeneratedMessageV3.isStringEmpty(this.serverMappingsId_)) {
         var1 += GeneratedMessageV3.computeStringSize(11, this.serverMappingsId_);
      }

      if ((this.bitField0_ & 4) != 0) {
         var1 += CodedOutputStream.computeMessageSize(12, this.getAnnouncement());
      }

      var2 = 0;

      for (int var12 = 0; var12 < this.regionCodes_.size(); var12++) {
         var2 += computeStringSizeNoTag(this.regionCodes_.getRaw(var12));
      }

      var1 += var2;
      var1 += 1 * this.getRegionCodesList().size();

      for (int var11 = 0; var11 < this.gameTypes_.size(); var11++) {
         var1 += CodedOutputStream.computeMessageSize(14, this.gameTypes_.get(var11));
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof ServerCard)) {
         return super.equals(var1);
      } else {
         ServerCard var2 = (ServerCard)var1;
         if (!this.getRecommendationId().equals(var2.getRecommendationId())) {
            return false;
         } else if (!this.getServerMappingsId().equals(var2.getServerMappingsId())) {
            return false;
         } else if (!this.getName().equals(var2.getName())) {
            return false;
         } else if (!this.getLogoUrl().equals(var2.getLogoUrl())) {
            return false;
         } else if (!this.getBackgroundUrl().equals(var2.getBackgroundUrl())) {
            return false;
         } else if (this.hasPrimaryColor() != var2.hasPrimaryColor()) {
            return false;
         } else if (this.hasPrimaryColor() && !this.getPrimaryColor().equals(var2.getPrimaryColor())) {
            return false;
         } else if (!this.getPrimaryAddress().equals(var2.getPrimaryAddress())) {
            return false;
         } else if (this.badge_ != var2.badge_) {
            return false;
         } else if (this.hasLastJoined() != var2.hasLastJoined()) {
            return false;
         } else if (this.hasLastJoined() && !this.getLastJoined().equals(var2.getLastJoined())) {
            return false;
         } else if (!this.getGameModesList().equals(var2.getGameModesList())) {
            return false;
         } else if (this.hasAnnouncement() != var2.hasAnnouncement()) {
            return false;
         } else if (this.hasAnnouncement() && !this.getAnnouncement().equals(var2.getAnnouncement())) {
            return false;
         } else if (!this.getRegionCodesList().equals(var2.getRegionCodesList())) {
            return false;
         } else {
            return !this.getGameTypesList().equals(var2.getGameTypesList()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + this.getRecommendationId().hashCode();
      var1 = 37 * var1 + 11;
      var1 = 53 * var1 + this.getServerMappingsId().hashCode();
      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.getName().hashCode();
      var1 = 37 * var1 + 4;
      var1 = 53 * var1 + this.getLogoUrl().hashCode();
      var1 = 37 * var1 + 5;
      var1 = 53 * var1 + this.getBackgroundUrl().hashCode();
      if (this.hasPrimaryColor()) {
         var1 = 37 * var1 + 6;
         var1 = 53 * var1 + this.getPrimaryColor().hashCode();
      }

      var1 = 37 * var1 + 7;
      var1 = 53 * var1 + this.getPrimaryAddress().hashCode();
      var1 = 37 * var1 + 8;
      var1 = 53 * var1 + this.badge_;
      if (this.hasLastJoined()) {
         var1 = 37 * var1 + 9;
         var1 = 53 * var1 + this.getLastJoined().hashCode();
      }

      if (this.getGameModesCount() > 0) {
         var1 = 37 * var1 + 10;
         var1 = 53 * var1 + this.getGameModesList().hashCode();
      }

      if (this.hasAnnouncement()) {
         var1 = 37 * var1 + 12;
         var1 = 53 * var1 + this.getAnnouncement().hashCode();
      }

      if (this.getRegionCodesCount() > 0) {
         var1 = 37 * var1 + 13;
         var1 = 53 * var1 + this.getRegionCodesList().hashCode();
      }

      if (this.getGameTypesCount() > 0) {
         var1 = 37 * var1 + 14;
         var1 = 53 * var1 + this.getGameTypesList().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static ServerCard parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static ServerCard parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ServerCard parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static ServerCard parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ServerCard parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static ServerCard parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ServerCard parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ServerCard parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ServerCard parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ServerCard parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ServerCard parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ServerCard parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public ServerCard.Builder newBuilderForType() {
      return newBuilder();
   }

   public static ServerCard.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ServerCard.Builder newBuilder(ServerCard var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public ServerCard.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new ServerCard.Builder() : new ServerCard.Builder().mergeFrom(this);
   }

   protected ServerCard.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new ServerCard.Builder(var1);
   }

   public static ServerCard getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<ServerCard> parser() {
      return PARSER;
   }

   @Override
   public Parser<ServerCard> getParserForType() {
      return PARSER;
   }

   public ServerCard getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public enum Badge implements ProtocolMessageEnum {
      BADGE_UNSPECIFIED(0),
      BADGE_LUNAR_CLIENT_PARTNER(1),
      BADGE_FEATURED(2),
      BADGE_OFFICIAL(3),
      UNRECOGNIZED(-1);

      public static final int BADGE_UNSPECIFIED_VALUE = 0;
      public static final int BADGE_LUNAR_CLIENT_PARTNER_VALUE = 1;
      public static final int BADGE_FEATURED_VALUE = 2;
      public static final int BADGE_OFFICIAL_VALUE = 3;
      private static final Internal.EnumLiteMap<ServerCard.Badge> internalValueMap = new Internal.EnumLiteMap<ServerCard.Badge>() {
         public ServerCard.Badge findValueByNumber(int var1) {
            return ServerCard.Badge.forNumber(var1);
         }
      };
      private static final ServerCard.Badge[] VALUES = values();
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
      public static ServerCard.Badge valueOf(int var0) {
         return forNumber(var0);
      }

      public static ServerCard.Badge forNumber(int var0) {
         switch (var0) {
            case 0:
               return BADGE_UNSPECIFIED;
            case 1:
               return BADGE_LUNAR_CLIENT_PARTNER;
            case 2:
               return BADGE_FEATURED;
            case 3:
               return BADGE_OFFICIAL;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<ServerCard.Badge> internalGetValueMap() {
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
         return ServerCard.getDescriptor().getEnumTypes().get(0);
      }

      public static ServerCard.Badge valueOf(Descriptors.EnumValueDescriptor var0) {
         if (var0.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
         }
      }

      Badge(int var3) {
         this.value = var3;
      }
   }

   public static final class Builder extends GeneratedMessageV3.Builder<ServerCard.Builder> implements ServerCardOrBuilder {
      private int bitField0_;
      private Object recommendationId_ = "";
      private Object serverMappingsId_ = "";
      private Object name_ = "";
      private Object logoUrl_ = "";
      private Object backgroundUrl_ = "";
      private Color primaryColor_;
      private SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> primaryColorBuilder_;
      private Object primaryAddress_ = "";
      private int badge_ = 0;
      private Timestamp lastJoined_;
      private SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> lastJoinedBuilder_;
      private LazyStringArrayList gameModes_ = LazyStringArrayList.emptyList();
      private Announcement announcement_;
      private SingleFieldBuilderV3<Announcement, Announcement.Builder, AnnouncementOrBuilder> announcementBuilder_;
      private LazyStringArrayList regionCodes_ = LazyStringArrayList.emptyList();
      private List<ServerGameType> gameTypes_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<ServerGameType, ServerGameType.Builder, ServerGameTypeOrBuilder> gameTypesBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_serverdiscovery_v1_ServerCard_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_serverdiscovery_v1_ServerCard_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ServerCard.class, ServerCard.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (ServerCard.alwaysUseFieldBuilders) {
            this.getPrimaryColorFieldBuilder();
            this.getLastJoinedFieldBuilder();
            this.getAnnouncementFieldBuilder();
            this.getGameTypesFieldBuilder();
         }
      }

      public ServerCard.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.recommendationId_ = "";
         this.serverMappingsId_ = "";
         this.name_ = "";
         this.logoUrl_ = "";
         this.backgroundUrl_ = "";
         this.primaryColor_ = null;
         if (this.primaryColorBuilder_ != null) {
            this.primaryColorBuilder_.dispose();
            this.primaryColorBuilder_ = null;
         }

         this.primaryAddress_ = "";
         this.badge_ = 0;
         this.lastJoined_ = null;
         if (this.lastJoinedBuilder_ != null) {
            this.lastJoinedBuilder_.dispose();
            this.lastJoinedBuilder_ = null;
         }

         this.gameModes_ = LazyStringArrayList.emptyList();
         this.announcement_ = null;
         if (this.announcementBuilder_ != null) {
            this.announcementBuilder_.dispose();
            this.announcementBuilder_ = null;
         }

         this.regionCodes_ = LazyStringArrayList.emptyList();
         if (this.gameTypesBuilder_ == null) {
            this.gameTypes_ = Collections.emptyList();
         } else {
            this.gameTypes_ = null;
            this.gameTypesBuilder_.clear();
         }

         this.bitField0_ &= -4097;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_serverdiscovery_v1_ServerCard_descriptor;
      }

      public ServerCard getDefaultInstanceForType() {
         return ServerCard.getDefaultInstance();
      }

      public ServerCard build() {
         ServerCard var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public ServerCard buildPartial() {
         ServerCard var1 = new ServerCard(this);
         this.buildPartialRepeatedFields(var1);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartialRepeatedFields(ServerCard var1) {
         if (this.gameTypesBuilder_ == null) {
            if ((this.bitField0_ & 4096) != 0) {
               this.gameTypes_ = Collections.unmodifiableList(this.gameTypes_);
               this.bitField0_ &= -4097;
            }

            var1.gameTypes_ = this.gameTypes_;
         } else {
            var1.gameTypes_ = this.gameTypesBuilder_.build();
         }
      }

      private void buildPartial0(ServerCard var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.recommendationId_ = this.recommendationId_;
         }

         if ((var2 & 2) != 0) {
            var1.serverMappingsId_ = this.serverMappingsId_;
         }

         if ((var2 & 4) != 0) {
            var1.name_ = this.name_;
         }

         if ((var2 & 8) != 0) {
            var1.logoUrl_ = this.logoUrl_;
         }

         if ((var2 & 16) != 0) {
            var1.backgroundUrl_ = this.backgroundUrl_;
         }

         byte var3 = 0;
         if ((var2 & 32) != 0) {
            var1.primaryColor_ = this.primaryColorBuilder_ == null ? this.primaryColor_ : this.primaryColorBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 64) != 0) {
            var1.primaryAddress_ = this.primaryAddress_;
         }

         if ((var2 & 128) != 0) {
            var1.badge_ = this.badge_;
         }

         if ((var2 & 256) != 0) {
            var1.lastJoined_ = this.lastJoinedBuilder_ == null ? this.lastJoined_ : this.lastJoinedBuilder_.build();
            var3 |= 2;
         }

         if ((var2 & 512) != 0) {
            this.gameModes_.makeImmutable();
            var1.gameModes_ = this.gameModes_;
         }

         if ((var2 & 1024) != 0) {
            var1.announcement_ = this.announcementBuilder_ == null ? this.announcement_ : this.announcementBuilder_.build();
            var3 |= 4;
         }

         if ((var2 & 2048) != 0) {
            this.regionCodes_.makeImmutable();
            var1.regionCodes_ = this.regionCodes_;
         }

         ServerCard var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public ServerCard.Builder clone() {
         return (ServerCard.Builder)super.clone();
      }

      public ServerCard.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ServerCard.Builder)super.setField(var1, var2);
      }

      public ServerCard.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (ServerCard.Builder)super.clearField(var1);
      }

      public ServerCard.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (ServerCard.Builder)super.clearOneof(var1);
      }

      public ServerCard.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (ServerCard.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public ServerCard.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ServerCard.Builder)super.addRepeatedField(var1, var2);
      }

      public ServerCard.Builder mergeFrom(Message var1) {
         if (var1 instanceof ServerCard) {
            return this.mergeFrom((ServerCard)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public ServerCard.Builder mergeFrom(ServerCard var1) {
         if (var1 == ServerCard.getDefaultInstance()) {
            return this;
         }

         if (!var1.getRecommendationId().isEmpty()) {
            this.recommendationId_ = var1.recommendationId_;
            this.bitField0_ |= 1;
            this.onChanged();
         }

         if (!var1.getServerMappingsId().isEmpty()) {
            this.serverMappingsId_ = var1.serverMappingsId_;
            this.bitField0_ |= 2;
            this.onChanged();
         }

         if (!var1.getName().isEmpty()) {
            this.name_ = var1.name_;
            this.bitField0_ |= 4;
            this.onChanged();
         }

         if (!var1.getLogoUrl().isEmpty()) {
            this.logoUrl_ = var1.logoUrl_;
            this.bitField0_ |= 8;
            this.onChanged();
         }

         if (!var1.getBackgroundUrl().isEmpty()) {
            this.backgroundUrl_ = var1.backgroundUrl_;
            this.bitField0_ |= 16;
            this.onChanged();
         }

         if (var1.hasPrimaryColor()) {
            this.mergePrimaryColor(var1.getPrimaryColor());
         }

         if (!var1.getPrimaryAddress().isEmpty()) {
            this.primaryAddress_ = var1.primaryAddress_;
            this.bitField0_ |= 64;
            this.onChanged();
         }

         if (var1.badge_ != 0) {
            this.setBadgeValue(var1.getBadgeValue());
         }

         if (var1.hasLastJoined()) {
            this.mergeLastJoined(var1.getLastJoined());
         }

         if (!var1.gameModes_.isEmpty()) {
            if (this.gameModes_.isEmpty()) {
               this.gameModes_ = var1.gameModes_;
               this.bitField0_ |= 512;
            } else {
               this.ensureGameModesIsMutable();
               this.gameModes_.addAll(var1.gameModes_);
            }

            this.onChanged();
         }

         if (var1.hasAnnouncement()) {
            this.mergeAnnouncement(var1.getAnnouncement());
         }

         if (!var1.regionCodes_.isEmpty()) {
            if (this.regionCodes_.isEmpty()) {
               this.regionCodes_ = var1.regionCodes_;
               this.bitField0_ |= 2048;
            } else {
               this.ensureRegionCodesIsMutable();
               this.regionCodes_.addAll(var1.regionCodes_);
            }

            this.onChanged();
         }

         if (this.gameTypesBuilder_ == null) {
            if (!var1.gameTypes_.isEmpty()) {
               if (this.gameTypes_.isEmpty()) {
                  this.gameTypes_ = var1.gameTypes_;
                  this.bitField0_ &= -4097;
               } else {
                  this.ensureGameTypesIsMutable();
                  this.gameTypes_.addAll(var1.gameTypes_);
               }

               this.onChanged();
            }
         } else if (!var1.gameTypes_.isEmpty()) {
            if (this.gameTypesBuilder_.isEmpty()) {
               this.gameTypesBuilder_.dispose();
               this.gameTypesBuilder_ = null;
               this.gameTypes_ = var1.gameTypes_;
               this.bitField0_ &= -4097;
               this.gameTypesBuilder_ = ServerCard.alwaysUseFieldBuilders ? this.getGameTypesFieldBuilder() : null;
            } else {
               this.gameTypesBuilder_.addAllMessages(var1.gameTypes_);
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

      public ServerCard.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.recommendationId_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     this.name_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 4;
                     break;
                  case 34:
                     this.logoUrl_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 8;
                     break;
                  case 42:
                     this.backgroundUrl_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 16;
                     break;
                  case 50:
                     var1.readMessage(this.getPrimaryColorFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 32;
                     break;
                  case 58:
                     this.primaryAddress_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 64;
                     break;
                  case 64:
                     this.badge_ = var1.readEnum();
                     this.bitField0_ |= 128;
                     break;
                  case 74:
                     var1.readMessage(this.getLastJoinedFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 256;
                     break;
                  case 82:
                     String var12 = var1.readStringRequireUtf8();
                     this.ensureGameModesIsMutable();
                     this.gameModes_.add(var12);
                     break;
                  case 90:
                     this.serverMappingsId_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 2;
                     break;
                  case 98:
                     var1.readMessage(this.getAnnouncementFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 1024;
                     break;
                  case 106:
                     String var11 = var1.readStringRequireUtf8();
                     this.ensureRegionCodesIsMutable();
                     this.regionCodes_.add(var11);
                     break;
                  case 114:
                     ServerGameType var5 = var1.readMessage(ServerGameType.parser(), var2);
                     if (this.gameTypesBuilder_ == null) {
                        this.ensureGameTypesIsMutable();
                        this.gameTypes_.add(var5);
                     } else {
                        this.gameTypesBuilder_.addMessage(var5);
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
      public String getRecommendationId() {
         Object var1 = this.recommendationId_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.recommendationId_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getRecommendationIdBytes() {
         Object var1 = this.recommendationId_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.recommendationId_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public ServerCard.Builder setRecommendationId(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.recommendationId_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public ServerCard.Builder clearRecommendationId() {
         this.recommendationId_ = ServerCard.getDefaultInstance().getRecommendationId();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public ServerCard.Builder setRecommendationIdBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         ServerCard.checkByteStringIsUtf8(var1);
         this.recommendationId_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public String getServerMappingsId() {
         Object var1 = this.serverMappingsId_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.serverMappingsId_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getServerMappingsIdBytes() {
         Object var1 = this.serverMappingsId_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.serverMappingsId_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public ServerCard.Builder setServerMappingsId(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.serverMappingsId_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public ServerCard.Builder clearServerMappingsId() {
         this.serverMappingsId_ = ServerCard.getDefaultInstance().getServerMappingsId();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      public ServerCard.Builder setServerMappingsIdBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         ServerCard.checkByteStringIsUtf8(var1);
         this.serverMappingsId_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      @Override
      public String getName() {
         Object var1 = this.name_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.name_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getNameBytes() {
         Object var1 = this.name_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.name_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public ServerCard.Builder setName(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.name_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public ServerCard.Builder clearName() {
         this.name_ = ServerCard.getDefaultInstance().getName();
         this.bitField0_ &= -5;
         this.onChanged();
         return this;
      }

      public ServerCard.Builder setNameBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         ServerCard.checkByteStringIsUtf8(var1);
         this.name_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      @Override
      public String getLogoUrl() {
         Object var1 = this.logoUrl_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.logoUrl_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getLogoUrlBytes() {
         Object var1 = this.logoUrl_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.logoUrl_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public ServerCard.Builder setLogoUrl(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.logoUrl_ = var1;
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public ServerCard.Builder clearLogoUrl() {
         this.logoUrl_ = ServerCard.getDefaultInstance().getLogoUrl();
         this.bitField0_ &= -9;
         this.onChanged();
         return this;
      }

      public ServerCard.Builder setLogoUrlBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         ServerCard.checkByteStringIsUtf8(var1);
         this.logoUrl_ = var1;
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      @Override
      public String getBackgroundUrl() {
         Object var1 = this.backgroundUrl_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.backgroundUrl_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getBackgroundUrlBytes() {
         Object var1 = this.backgroundUrl_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.backgroundUrl_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public ServerCard.Builder setBackgroundUrl(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.backgroundUrl_ = var1;
         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      public ServerCard.Builder clearBackgroundUrl() {
         this.backgroundUrl_ = ServerCard.getDefaultInstance().getBackgroundUrl();
         this.bitField0_ &= -17;
         this.onChanged();
         return this;
      }

      public ServerCard.Builder setBackgroundUrlBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         ServerCard.checkByteStringIsUtf8(var1);
         this.backgroundUrl_ = var1;
         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasPrimaryColor() {
         return (this.bitField0_ & 32) != 0;
      }

      @Override
      public Color getPrimaryColor() {
         if (this.primaryColorBuilder_ == null) {
            return this.primaryColor_ == null ? Color.getDefaultInstance() : this.primaryColor_;
         } else {
            return this.primaryColorBuilder_.getMessage();
         }
      }

      public ServerCard.Builder setPrimaryColor(Color var1) {
         if (this.primaryColorBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.primaryColor_ = var1;
         } else {
            this.primaryColorBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 32;
         this.onChanged();
         return this;
      }

      public ServerCard.Builder setPrimaryColor(Color.Builder var1) {
         if (this.primaryColorBuilder_ == null) {
            this.primaryColor_ = var1.build();
         } else {
            this.primaryColorBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 32;
         this.onChanged();
         return this;
      }

      public ServerCard.Builder mergePrimaryColor(Color var1) {
         if (this.primaryColorBuilder_ == null) {
            if ((this.bitField0_ & 32) != 0 && this.primaryColor_ != null && this.primaryColor_ != Color.getDefaultInstance()) {
               this.getPrimaryColorBuilder().mergeFrom(var1);
            } else {
               this.primaryColor_ = var1;
            }
         } else {
            this.primaryColorBuilder_.mergeFrom(var1);
         }

         if (this.primaryColor_ != null) {
            this.bitField0_ |= 32;
            this.onChanged();
         }

         return this;
      }

      public ServerCard.Builder clearPrimaryColor() {
         this.bitField0_ &= -33;
         this.primaryColor_ = null;
         if (this.primaryColorBuilder_ != null) {
            this.primaryColorBuilder_.dispose();
            this.primaryColorBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Color.Builder getPrimaryColorBuilder() {
         this.bitField0_ |= 32;
         this.onChanged();
         return this.getPrimaryColorFieldBuilder().getBuilder();
      }

      @Override
      public ColorOrBuilder getPrimaryColorOrBuilder() {
         if (this.primaryColorBuilder_ != null) {
            return this.primaryColorBuilder_.getMessageOrBuilder();
         } else {
            return this.primaryColor_ == null ? Color.getDefaultInstance() : this.primaryColor_;
         }
      }

      private SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> getPrimaryColorFieldBuilder() {
         if (this.primaryColorBuilder_ == null) {
            this.primaryColorBuilder_ = new SingleFieldBuilderV3<>(this.getPrimaryColor(), this.getParentForChildren(), this.isClean());
            this.primaryColor_ = null;
         }

         return this.primaryColorBuilder_;
      }

      @Override
      public String getPrimaryAddress() {
         Object var1 = this.primaryAddress_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.primaryAddress_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getPrimaryAddressBytes() {
         Object var1 = this.primaryAddress_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.primaryAddress_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public ServerCard.Builder setPrimaryAddress(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.primaryAddress_ = var1;
         this.bitField0_ |= 64;
         this.onChanged();
         return this;
      }

      public ServerCard.Builder clearPrimaryAddress() {
         this.primaryAddress_ = ServerCard.getDefaultInstance().getPrimaryAddress();
         this.bitField0_ &= -65;
         this.onChanged();
         return this;
      }

      public ServerCard.Builder setPrimaryAddressBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         ServerCard.checkByteStringIsUtf8(var1);
         this.primaryAddress_ = var1;
         this.bitField0_ |= 64;
         this.onChanged();
         return this;
      }

      @Override
      public int getBadgeValue() {
         return this.badge_;
      }

      public ServerCard.Builder setBadgeValue(int var1) {
         this.badge_ = var1;
         this.bitField0_ |= 128;
         this.onChanged();
         return this;
      }

      @Override
      public ServerCard.Badge getBadge() {
         ServerCard.Badge var1 = ServerCard.Badge.forNumber(this.badge_);
         return var1 == null ? ServerCard.Badge.UNRECOGNIZED : var1;
      }

      public ServerCard.Builder setBadge(ServerCard.Badge var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 128;
         this.badge_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public ServerCard.Builder clearBadge() {
         this.bitField0_ &= -129;
         this.badge_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasLastJoined() {
         return (this.bitField0_ & 256) != 0;
      }

      @Override
      public Timestamp getLastJoined() {
         if (this.lastJoinedBuilder_ == null) {
            return this.lastJoined_ == null ? Timestamp.getDefaultInstance() : this.lastJoined_;
         } else {
            return this.lastJoinedBuilder_.getMessage();
         }
      }

      public ServerCard.Builder setLastJoined(Timestamp var1) {
         if (this.lastJoinedBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.lastJoined_ = var1;
         } else {
            this.lastJoinedBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 256;
         this.onChanged();
         return this;
      }

      public ServerCard.Builder setLastJoined(Timestamp.Builder var1) {
         if (this.lastJoinedBuilder_ == null) {
            this.lastJoined_ = var1.build();
         } else {
            this.lastJoinedBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 256;
         this.onChanged();
         return this;
      }

      public ServerCard.Builder mergeLastJoined(Timestamp var1) {
         if (this.lastJoinedBuilder_ == null) {
            if ((this.bitField0_ & 256) != 0 && this.lastJoined_ != null && this.lastJoined_ != Timestamp.getDefaultInstance()) {
               this.getLastJoinedBuilder().mergeFrom(var1);
            } else {
               this.lastJoined_ = var1;
            }
         } else {
            this.lastJoinedBuilder_.mergeFrom(var1);
         }

         if (this.lastJoined_ != null) {
            this.bitField0_ |= 256;
            this.onChanged();
         }

         return this;
      }

      public ServerCard.Builder clearLastJoined() {
         this.bitField0_ &= -257;
         this.lastJoined_ = null;
         if (this.lastJoinedBuilder_ != null) {
            this.lastJoinedBuilder_.dispose();
            this.lastJoinedBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Timestamp.Builder getLastJoinedBuilder() {
         this.bitField0_ |= 256;
         this.onChanged();
         return this.getLastJoinedFieldBuilder().getBuilder();
      }

      @Override
      public TimestampOrBuilder getLastJoinedOrBuilder() {
         if (this.lastJoinedBuilder_ != null) {
            return this.lastJoinedBuilder_.getMessageOrBuilder();
         } else {
            return this.lastJoined_ == null ? Timestamp.getDefaultInstance() : this.lastJoined_;
         }
      }

      private SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> getLastJoinedFieldBuilder() {
         if (this.lastJoinedBuilder_ == null) {
            this.lastJoinedBuilder_ = new SingleFieldBuilderV3<>(this.getLastJoined(), this.getParentForChildren(), this.isClean());
            this.lastJoined_ = null;
         }

         return this.lastJoinedBuilder_;
      }

      private void ensureGameModesIsMutable() {
         if (!this.gameModes_.isModifiable()) {
            this.gameModes_ = new LazyStringArrayList(this.gameModes_);
         }

         this.bitField0_ |= 512;
      }

      @Deprecated
      public ProtocolStringList getGameModesList() {
         this.gameModes_.makeImmutable();
         return this.gameModes_;
      }

      @Deprecated
      @Override
      public int getGameModesCount() {
         return this.gameModes_.size();
      }

      @Deprecated
      @Override
      public String getGameModes(int var1) {
         return this.gameModes_.get(var1);
      }

      @Deprecated
      @Override
      public ByteString getGameModesBytes(int var1) {
         return this.gameModes_.getByteString(var1);
      }

      @Deprecated
      public ServerCard.Builder setGameModes(int var1, String var2) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureGameModesIsMutable();
         this.gameModes_.set(var1, var2);
         this.bitField0_ |= 512;
         this.onChanged();
         return this;
      }

      @Deprecated
      public ServerCard.Builder addGameModes(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ensureGameModesIsMutable();
         this.gameModes_.add(var1);
         this.bitField0_ |= 512;
         this.onChanged();
         return this;
      }

      @Deprecated
      public ServerCard.Builder addAllGameModes(Iterable<String> var1) {
         this.ensureGameModesIsMutable();
         AbstractMessageLite.Builder.addAll(var1, this.gameModes_);
         this.bitField0_ |= 512;
         this.onChanged();
         return this;
      }

      @Deprecated
      public ServerCard.Builder clearGameModes() {
         this.gameModes_ = LazyStringArrayList.emptyList();
         this.bitField0_ &= -513;
         this.onChanged();
         return this;
      }

      @Deprecated
      public ServerCard.Builder addGameModesBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         ServerCard.checkByteStringIsUtf8(var1);
         this.ensureGameModesIsMutable();
         this.gameModes_.add(var1);
         this.bitField0_ |= 512;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasAnnouncement() {
         return (this.bitField0_ & 1024) != 0;
      }

      @Override
      public Announcement getAnnouncement() {
         if (this.announcementBuilder_ == null) {
            return this.announcement_ == null ? Announcement.getDefaultInstance() : this.announcement_;
         } else {
            return this.announcementBuilder_.getMessage();
         }
      }

      public ServerCard.Builder setAnnouncement(Announcement var1) {
         if (this.announcementBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.announcement_ = var1;
         } else {
            this.announcementBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1024;
         this.onChanged();
         return this;
      }

      public ServerCard.Builder setAnnouncement(Announcement.Builder var1) {
         if (this.announcementBuilder_ == null) {
            this.announcement_ = var1.build();
         } else {
            this.announcementBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1024;
         this.onChanged();
         return this;
      }

      public ServerCard.Builder mergeAnnouncement(Announcement var1) {
         if (this.announcementBuilder_ == null) {
            if ((this.bitField0_ & 1024) != 0 && this.announcement_ != null && this.announcement_ != Announcement.getDefaultInstance()) {
               this.getAnnouncementBuilder().mergeFrom(var1);
            } else {
               this.announcement_ = var1;
            }
         } else {
            this.announcementBuilder_.mergeFrom(var1);
         }

         if (this.announcement_ != null) {
            this.bitField0_ |= 1024;
            this.onChanged();
         }

         return this;
      }

      public ServerCard.Builder clearAnnouncement() {
         this.bitField0_ &= -1025;
         this.announcement_ = null;
         if (this.announcementBuilder_ != null) {
            this.announcementBuilder_.dispose();
            this.announcementBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Announcement.Builder getAnnouncementBuilder() {
         this.bitField0_ |= 1024;
         this.onChanged();
         return this.getAnnouncementFieldBuilder().getBuilder();
      }

      @Override
      public AnnouncementOrBuilder getAnnouncementOrBuilder() {
         if (this.announcementBuilder_ != null) {
            return this.announcementBuilder_.getMessageOrBuilder();
         } else {
            return this.announcement_ == null ? Announcement.getDefaultInstance() : this.announcement_;
         }
      }

      private SingleFieldBuilderV3<Announcement, Announcement.Builder, AnnouncementOrBuilder> getAnnouncementFieldBuilder() {
         if (this.announcementBuilder_ == null) {
            this.announcementBuilder_ = new SingleFieldBuilderV3<>(this.getAnnouncement(), this.getParentForChildren(), this.isClean());
            this.announcement_ = null;
         }

         return this.announcementBuilder_;
      }

      private void ensureRegionCodesIsMutable() {
         if (!this.regionCodes_.isModifiable()) {
            this.regionCodes_ = new LazyStringArrayList(this.regionCodes_);
         }

         this.bitField0_ |= 2048;
      }

      public ProtocolStringList getRegionCodesList() {
         this.regionCodes_.makeImmutable();
         return this.regionCodes_;
      }

      @Override
      public int getRegionCodesCount() {
         return this.regionCodes_.size();
      }

      @Override
      public String getRegionCodes(int var1) {
         return this.regionCodes_.get(var1);
      }

      @Override
      public ByteString getRegionCodesBytes(int var1) {
         return this.regionCodes_.getByteString(var1);
      }

      public ServerCard.Builder setRegionCodes(int var1, String var2) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureRegionCodesIsMutable();
         this.regionCodes_.set(var1, var2);
         this.bitField0_ |= 2048;
         this.onChanged();
         return this;
      }

      public ServerCard.Builder addRegionCodes(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ensureRegionCodesIsMutable();
         this.regionCodes_.add(var1);
         this.bitField0_ |= 2048;
         this.onChanged();
         return this;
      }

      public ServerCard.Builder addAllRegionCodes(Iterable<String> var1) {
         this.ensureRegionCodesIsMutable();
         AbstractMessageLite.Builder.addAll(var1, this.regionCodes_);
         this.bitField0_ |= 2048;
         this.onChanged();
         return this;
      }

      public ServerCard.Builder clearRegionCodes() {
         this.regionCodes_ = LazyStringArrayList.emptyList();
         this.bitField0_ &= -2049;
         this.onChanged();
         return this;
      }

      public ServerCard.Builder addRegionCodesBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         ServerCard.checkByteStringIsUtf8(var1);
         this.ensureRegionCodesIsMutable();
         this.regionCodes_.add(var1);
         this.bitField0_ |= 2048;
         this.onChanged();
         return this;
      }

      private void ensureGameTypesIsMutable() {
         if ((this.bitField0_ & 4096) == 0) {
            this.gameTypes_ = new ArrayList<>(this.gameTypes_);
            this.bitField0_ |= 4096;
         }
      }

      @Override
      public List<ServerGameType> getGameTypesList() {
         return this.gameTypesBuilder_ == null ? Collections.unmodifiableList(this.gameTypes_) : this.gameTypesBuilder_.getMessageList();
      }

      @Override
      public int getGameTypesCount() {
         return this.gameTypesBuilder_ == null ? this.gameTypes_.size() : this.gameTypesBuilder_.getCount();
      }

      @Override
      public ServerGameType getGameTypes(int var1) {
         return this.gameTypesBuilder_ == null ? this.gameTypes_.get(var1) : this.gameTypesBuilder_.getMessage(var1);
      }

      public ServerCard.Builder setGameTypes(int var1, ServerGameType var2) {
         if (this.gameTypesBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureGameTypesIsMutable();
            this.gameTypes_.set(var1, var2);
            this.onChanged();
         } else {
            this.gameTypesBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public ServerCard.Builder setGameTypes(int var1, ServerGameType.Builder var2) {
         if (this.gameTypesBuilder_ == null) {
            this.ensureGameTypesIsMutable();
            this.gameTypes_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.gameTypesBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public ServerCard.Builder addGameTypes(ServerGameType var1) {
         if (this.gameTypesBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureGameTypesIsMutable();
            this.gameTypes_.add(var1);
            this.onChanged();
         } else {
            this.gameTypesBuilder_.addMessage(var1);
         }

         return this;
      }

      public ServerCard.Builder addGameTypes(int var1, ServerGameType var2) {
         if (this.gameTypesBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureGameTypesIsMutable();
            this.gameTypes_.add(var1, var2);
            this.onChanged();
         } else {
            this.gameTypesBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public ServerCard.Builder addGameTypes(ServerGameType.Builder var1) {
         if (this.gameTypesBuilder_ == null) {
            this.ensureGameTypesIsMutable();
            this.gameTypes_.add(var1.build());
            this.onChanged();
         } else {
            this.gameTypesBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public ServerCard.Builder addGameTypes(int var1, ServerGameType.Builder var2) {
         if (this.gameTypesBuilder_ == null) {
            this.ensureGameTypesIsMutable();
            this.gameTypes_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.gameTypesBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public ServerCard.Builder addAllGameTypes(Iterable<? extends ServerGameType> var1) {
         if (this.gameTypesBuilder_ == null) {
            this.ensureGameTypesIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.gameTypes_);
            this.onChanged();
         } else {
            this.gameTypesBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public ServerCard.Builder clearGameTypes() {
         if (this.gameTypesBuilder_ == null) {
            this.gameTypes_ = Collections.emptyList();
            this.bitField0_ &= -4097;
            this.onChanged();
         } else {
            this.gameTypesBuilder_.clear();
         }

         return this;
      }

      public ServerCard.Builder removeGameTypes(int var1) {
         if (this.gameTypesBuilder_ == null) {
            this.ensureGameTypesIsMutable();
            this.gameTypes_.remove(var1);
            this.onChanged();
         } else {
            this.gameTypesBuilder_.remove(var1);
         }

         return this;
      }

      public ServerGameType.Builder getGameTypesBuilder(int var1) {
         return this.getGameTypesFieldBuilder().getBuilder(var1);
      }

      @Override
      public ServerGameTypeOrBuilder getGameTypesOrBuilder(int var1) {
         return this.gameTypesBuilder_ == null ? this.gameTypes_.get(var1) : this.gameTypesBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends ServerGameTypeOrBuilder> getGameTypesOrBuilderList() {
         return this.gameTypesBuilder_ != null ? this.gameTypesBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.gameTypes_);
      }

      public ServerGameType.Builder addGameTypesBuilder() {
         return this.getGameTypesFieldBuilder().addBuilder(ServerGameType.getDefaultInstance());
      }

      public ServerGameType.Builder addGameTypesBuilder(int var1) {
         return this.getGameTypesFieldBuilder().addBuilder(var1, ServerGameType.getDefaultInstance());
      }

      public List<ServerGameType.Builder> getGameTypesBuilderList() {
         return this.getGameTypesFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<ServerGameType, ServerGameType.Builder, ServerGameTypeOrBuilder> getGameTypesFieldBuilder() {
         if (this.gameTypesBuilder_ == null) {
            this.gameTypesBuilder_ = new RepeatedFieldBuilderV3<>(this.gameTypes_, (this.bitField0_ & 4096) != 0, this.getParentForChildren(), this.isClean());
            this.gameTypes_ = null;
         }

         return this.gameTypesBuilder_;
      }

      public final ServerCard.Builder setUnknownFields(UnknownFieldSet var1) {
         return (ServerCard.Builder)super.setUnknownFields(var1);
      }

      public final ServerCard.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (ServerCard.Builder)super.mergeUnknownFields(var1);
      }
   }
}
