package com.lunarclient.websocket.cosmetic.v1;

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
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import com.lunarclient.common.v1.Color;
import com.lunarclient.common.v1.ColorOrBuilder;
import com.lunarclient.common.v1.Uuid;
import com.lunarclient.common.v1.UuidOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class PlayerCosmeticsPush extends GeneratedMessageV3 implements PlayerCosmeticsPushOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int PLAYER_UUID_FIELD_NUMBER = 1;
   private Uuid playerUuid_;
   public static final int SETTINGS_FIELD_NUMBER = 2;
   private CustomizableCosmeticSettings settings_;
   public static final int LOGO_COLOR_FIELD_NUMBER = 3;
   private Color logoColor_;
   public static final int LOGO_ALWAYS_SHOW_FIELD_NUMBER = 4;
   private boolean logoAlwaysShow_ = false;
   public static final int BADGE_ID_FIELD_NUMBER = 5;
   private int badgeId_ = 0;
   public static final int OUTFIT_UUID_FIELD_NUMBER = 6;
   private Uuid outfitUuid_;
   private byte memoizedIsInitialized = -1;
   private static final PlayerCosmeticsPush DEFAULT_INSTANCE = new PlayerCosmeticsPush();
   private static final Parser<PlayerCosmeticsPush> PARSER = new AbstractParser<PlayerCosmeticsPush>() {
      public PlayerCosmeticsPush parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         PlayerCosmeticsPush.Builder var3 = PlayerCosmeticsPush.newBuilder();

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

   private PlayerCosmeticsPush(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private PlayerCosmeticsPush() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new PlayerCosmeticsPush();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return PushProto.internal_static_lunarclient_websocket_cosmetic_v1_PlayerCosmeticsPush_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return PushProto.internal_static_lunarclient_websocket_cosmetic_v1_PlayerCosmeticsPush_fieldAccessorTable
         .ensureFieldAccessorsInitialized(PlayerCosmeticsPush.class, PlayerCosmeticsPush.Builder.class);
   }

   @Override
   public boolean hasPlayerUuid() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public Uuid getPlayerUuid() {
      return this.playerUuid_ == null ? Uuid.getDefaultInstance() : this.playerUuid_;
   }

   @Override
   public UuidOrBuilder getPlayerUuidOrBuilder() {
      return this.playerUuid_ == null ? Uuid.getDefaultInstance() : this.playerUuid_;
   }

   @Override
   public boolean hasSettings() {
      return (this.bitField0_ & 2) != 0;
   }

   @Override
   public CustomizableCosmeticSettings getSettings() {
      return this.settings_ == null ? CustomizableCosmeticSettings.getDefaultInstance() : this.settings_;
   }

   @Override
   public CustomizableCosmeticSettingsOrBuilder getSettingsOrBuilder() {
      return this.settings_ == null ? CustomizableCosmeticSettings.getDefaultInstance() : this.settings_;
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
   public boolean getLogoAlwaysShow() {
      return this.logoAlwaysShow_;
   }

   @Override
   public int getBadgeId() {
      return this.badgeId_;
   }

   @Override
   public boolean hasOutfitUuid() {
      return (this.bitField0_ & 8) != 0;
   }

   @Override
   public Uuid getOutfitUuid() {
      return this.outfitUuid_ == null ? Uuid.getDefaultInstance() : this.outfitUuid_;
   }

   @Override
   public UuidOrBuilder getOutfitUuidOrBuilder() {
      return this.outfitUuid_ == null ? Uuid.getDefaultInstance() : this.outfitUuid_;
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
         var1.writeMessage(1, this.getPlayerUuid());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1.writeMessage(2, this.getSettings());
      }

      if ((this.bitField0_ & 4) != 0) {
         var1.writeMessage(3, this.getLogoColor());
      }

      if (this.logoAlwaysShow_) {
         var1.writeBool(4, this.logoAlwaysShow_);
      }

      if (this.badgeId_ != 0) {
         var1.writeInt32(5, this.badgeId_);
      }

      if ((this.bitField0_ & 8) != 0) {
         var1.writeMessage(6, this.getOutfitUuid());
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
         var1 += CodedOutputStream.computeMessageSize(1, this.getPlayerUuid());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1 += CodedOutputStream.computeMessageSize(2, this.getSettings());
      }

      if ((this.bitField0_ & 4) != 0) {
         var1 += CodedOutputStream.computeMessageSize(3, this.getLogoColor());
      }

      if (this.logoAlwaysShow_) {
         var1 += CodedOutputStream.computeBoolSize(4, this.logoAlwaysShow_);
      }

      if (this.badgeId_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(5, this.badgeId_);
      }

      if ((this.bitField0_ & 8) != 0) {
         var1 += CodedOutputStream.computeMessageSize(6, this.getOutfitUuid());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof PlayerCosmeticsPush)) {
         return super.equals(var1);
      } else {
         PlayerCosmeticsPush var2 = (PlayerCosmeticsPush)var1;
         if (this.hasPlayerUuid() != var2.hasPlayerUuid()) {
            return false;
         } else if (this.hasPlayerUuid() && !this.getPlayerUuid().equals(var2.getPlayerUuid())) {
            return false;
         } else if (this.hasSettings() != var2.hasSettings()) {
            return false;
         } else if (this.hasSettings() && !this.getSettings().equals(var2.getSettings())) {
            return false;
         } else if (this.hasLogoColor() != var2.hasLogoColor()) {
            return false;
         } else if (this.hasLogoColor() && !this.getLogoColor().equals(var2.getLogoColor())) {
            return false;
         } else if (this.getLogoAlwaysShow() != var2.getLogoAlwaysShow()) {
            return false;
         } else if (this.getBadgeId() != var2.getBadgeId()) {
            return false;
         } else if (this.hasOutfitUuid() != var2.hasOutfitUuid()) {
            return false;
         } else {
            return this.hasOutfitUuid() && !this.getOutfitUuid().equals(var2.getOutfitUuid()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.hasPlayerUuid()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getPlayerUuid().hashCode();
      }

      if (this.hasSettings()) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getSettings().hashCode();
      }

      if (this.hasLogoColor()) {
         var1 = 37 * var1 + 3;
         var1 = 53 * var1 + this.getLogoColor().hashCode();
      }

      var1 = 37 * var1 + 4;
      var1 = 53 * var1 + Internal.hashBoolean(this.getLogoAlwaysShow());
      var1 = 37 * var1 + 5;
      var1 = 53 * var1 + this.getBadgeId();
      if (this.hasOutfitUuid()) {
         var1 = 37 * var1 + 6;
         var1 = 53 * var1 + this.getOutfitUuid().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static PlayerCosmeticsPush parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static PlayerCosmeticsPush parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static PlayerCosmeticsPush parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static PlayerCosmeticsPush parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static PlayerCosmeticsPush parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static PlayerCosmeticsPush parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static PlayerCosmeticsPush parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PlayerCosmeticsPush parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PlayerCosmeticsPush parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static PlayerCosmeticsPush parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static PlayerCosmeticsPush parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PlayerCosmeticsPush parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public PlayerCosmeticsPush.Builder newBuilderForType() {
      return newBuilder();
   }

   public static PlayerCosmeticsPush.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static PlayerCosmeticsPush.Builder newBuilder(PlayerCosmeticsPush var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public PlayerCosmeticsPush.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new PlayerCosmeticsPush.Builder() : new PlayerCosmeticsPush.Builder().mergeFrom(this);
   }

   protected PlayerCosmeticsPush.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new PlayerCosmeticsPush.Builder(var1);
   }

   public static PlayerCosmeticsPush getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<PlayerCosmeticsPush> parser() {
      return PARSER;
   }

   @Override
   public Parser<PlayerCosmeticsPush> getParserForType() {
      return PARSER;
   }

   public PlayerCosmeticsPush getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<PlayerCosmeticsPush.Builder> implements PlayerCosmeticsPushOrBuilder {
      private int bitField0_;
      private Uuid playerUuid_;
      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> playerUuidBuilder_;
      private CustomizableCosmeticSettings settings_;
      private SingleFieldBuilderV3<CustomizableCosmeticSettings, CustomizableCosmeticSettings.Builder, CustomizableCosmeticSettingsOrBuilder> settingsBuilder_;
      private Color logoColor_;
      private SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> logoColorBuilder_;
      private boolean logoAlwaysShow_;
      private int badgeId_;
      private Uuid outfitUuid_;
      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> outfitUuidBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return PushProto.internal_static_lunarclient_websocket_cosmetic_v1_PlayerCosmeticsPush_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PushProto.internal_static_lunarclient_websocket_cosmetic_v1_PlayerCosmeticsPush_fieldAccessorTable
            .ensureFieldAccessorsInitialized(PlayerCosmeticsPush.class, PlayerCosmeticsPush.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (PlayerCosmeticsPush.alwaysUseFieldBuilders) {
            this.getPlayerUuidFieldBuilder();
            this.getSettingsFieldBuilder();
            this.getLogoColorFieldBuilder();
            this.getOutfitUuidFieldBuilder();
         }
      }

      public PlayerCosmeticsPush.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.playerUuid_ = null;
         if (this.playerUuidBuilder_ != null) {
            this.playerUuidBuilder_.dispose();
            this.playerUuidBuilder_ = null;
         }

         this.settings_ = null;
         if (this.settingsBuilder_ != null) {
            this.settingsBuilder_.dispose();
            this.settingsBuilder_ = null;
         }

         this.logoColor_ = null;
         if (this.logoColorBuilder_ != null) {
            this.logoColorBuilder_.dispose();
            this.logoColorBuilder_ = null;
         }

         this.logoAlwaysShow_ = false;
         this.badgeId_ = 0;
         this.outfitUuid_ = null;
         if (this.outfitUuidBuilder_ != null) {
            this.outfitUuidBuilder_.dispose();
            this.outfitUuidBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return PushProto.internal_static_lunarclient_websocket_cosmetic_v1_PlayerCosmeticsPush_descriptor;
      }

      public PlayerCosmeticsPush getDefaultInstanceForType() {
         return PlayerCosmeticsPush.getDefaultInstance();
      }

      public PlayerCosmeticsPush build() {
         PlayerCosmeticsPush var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public PlayerCosmeticsPush buildPartial() {
         PlayerCosmeticsPush var1 = new PlayerCosmeticsPush(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(PlayerCosmeticsPush var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.playerUuid_ = this.playerUuidBuilder_ == null ? this.playerUuid_ : this.playerUuidBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.settings_ = this.settingsBuilder_ == null ? this.settings_ : this.settingsBuilder_.build();
            var3 |= 2;
         }

         if ((var2 & 4) != 0) {
            var1.logoColor_ = this.logoColorBuilder_ == null ? this.logoColor_ : this.logoColorBuilder_.build();
            var3 |= 4;
         }

         if ((var2 & 8) != 0) {
            var1.logoAlwaysShow_ = this.logoAlwaysShow_;
         }

         if ((var2 & 16) != 0) {
            var1.badgeId_ = this.badgeId_;
         }

         if ((var2 & 32) != 0) {
            var1.outfitUuid_ = this.outfitUuidBuilder_ == null ? this.outfitUuid_ : this.outfitUuidBuilder_.build();
            var3 |= 8;
         }

         PlayerCosmeticsPush var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public PlayerCosmeticsPush.Builder clone() {
         return (PlayerCosmeticsPush.Builder)super.clone();
      }

      public PlayerCosmeticsPush.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (PlayerCosmeticsPush.Builder)super.setField(var1, var2);
      }

      public PlayerCosmeticsPush.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (PlayerCosmeticsPush.Builder)super.clearField(var1);
      }

      public PlayerCosmeticsPush.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (PlayerCosmeticsPush.Builder)super.clearOneof(var1);
      }

      public PlayerCosmeticsPush.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (PlayerCosmeticsPush.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public PlayerCosmeticsPush.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (PlayerCosmeticsPush.Builder)super.addRepeatedField(var1, var2);
      }

      public PlayerCosmeticsPush.Builder mergeFrom(Message var1) {
         if (var1 instanceof PlayerCosmeticsPush) {
            return this.mergeFrom((PlayerCosmeticsPush)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public PlayerCosmeticsPush.Builder mergeFrom(PlayerCosmeticsPush var1) {
         if (var1 == PlayerCosmeticsPush.getDefaultInstance()) {
            return this;
         }

         if (var1.hasPlayerUuid()) {
            this.mergePlayerUuid(var1.getPlayerUuid());
         }

         if (var1.hasSettings()) {
            this.mergeSettings(var1.getSettings());
         }

         if (var1.hasLogoColor()) {
            this.mergeLogoColor(var1.getLogoColor());
         }

         if (var1.getLogoAlwaysShow()) {
            this.setLogoAlwaysShow(var1.getLogoAlwaysShow());
         }

         if (var1.getBadgeId() != 0) {
            this.setBadgeId(var1.getBadgeId());
         }

         if (var1.hasOutfitUuid()) {
            this.mergeOutfitUuid(var1.getOutfitUuid());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public PlayerCosmeticsPush.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getPlayerUuidFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     var1.readMessage(this.getSettingsFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 2;
                     break;
                  case 26:
                     var1.readMessage(this.getLogoColorFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 4;
                     break;
                  case 32:
                     this.logoAlwaysShow_ = var1.readBool();
                     this.bitField0_ |= 8;
                     break;
                  case 40:
                     this.badgeId_ = var1.readInt32();
                     this.bitField0_ |= 16;
                     break;
                  case 50:
                     var1.readMessage(this.getOutfitUuidFieldBuilder().getBuilder(), var2);
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
      public boolean hasPlayerUuid() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public Uuid getPlayerUuid() {
         if (this.playerUuidBuilder_ == null) {
            return this.playerUuid_ == null ? Uuid.getDefaultInstance() : this.playerUuid_;
         } else {
            return this.playerUuidBuilder_.getMessage();
         }
      }

      public PlayerCosmeticsPush.Builder setPlayerUuid(Uuid var1) {
         if (this.playerUuidBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.playerUuid_ = var1;
         } else {
            this.playerUuidBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public PlayerCosmeticsPush.Builder setPlayerUuid(Uuid.Builder var1) {
         if (this.playerUuidBuilder_ == null) {
            this.playerUuid_ = var1.build();
         } else {
            this.playerUuidBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public PlayerCosmeticsPush.Builder mergePlayerUuid(Uuid var1) {
         if (this.playerUuidBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.playerUuid_ != null && this.playerUuid_ != Uuid.getDefaultInstance()) {
               this.getPlayerUuidBuilder().mergeFrom(var1);
            } else {
               this.playerUuid_ = var1;
            }
         } else {
            this.playerUuidBuilder_.mergeFrom(var1);
         }

         if (this.playerUuid_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public PlayerCosmeticsPush.Builder clearPlayerUuid() {
         this.bitField0_ &= -2;
         this.playerUuid_ = null;
         if (this.playerUuidBuilder_ != null) {
            this.playerUuidBuilder_.dispose();
            this.playerUuidBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Uuid.Builder getPlayerUuidBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getPlayerUuidFieldBuilder().getBuilder();
      }

      @Override
      public UuidOrBuilder getPlayerUuidOrBuilder() {
         if (this.playerUuidBuilder_ != null) {
            return this.playerUuidBuilder_.getMessageOrBuilder();
         } else {
            return this.playerUuid_ == null ? Uuid.getDefaultInstance() : this.playerUuid_;
         }
      }

      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> getPlayerUuidFieldBuilder() {
         if (this.playerUuidBuilder_ == null) {
            this.playerUuidBuilder_ = new SingleFieldBuilderV3<>(this.getPlayerUuid(), this.getParentForChildren(), this.isClean());
            this.playerUuid_ = null;
         }

         return this.playerUuidBuilder_;
      }

      @Override
      public boolean hasSettings() {
         return (this.bitField0_ & 2) != 0;
      }

      @Override
      public CustomizableCosmeticSettings getSettings() {
         if (this.settingsBuilder_ == null) {
            return this.settings_ == null ? CustomizableCosmeticSettings.getDefaultInstance() : this.settings_;
         } else {
            return this.settingsBuilder_.getMessage();
         }
      }

      public PlayerCosmeticsPush.Builder setSettings(CustomizableCosmeticSettings var1) {
         if (this.settingsBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.settings_ = var1;
         } else {
            this.settingsBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public PlayerCosmeticsPush.Builder setSettings(CustomizableCosmeticSettings.Builder var1) {
         if (this.settingsBuilder_ == null) {
            this.settings_ = var1.build();
         } else {
            this.settingsBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public PlayerCosmeticsPush.Builder mergeSettings(CustomizableCosmeticSettings var1) {
         if (this.settingsBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0 && this.settings_ != null && this.settings_ != CustomizableCosmeticSettings.getDefaultInstance()) {
               this.getSettingsBuilder().mergeFrom(var1);
            } else {
               this.settings_ = var1;
            }
         } else {
            this.settingsBuilder_.mergeFrom(var1);
         }

         if (this.settings_ != null) {
            this.bitField0_ |= 2;
            this.onChanged();
         }

         return this;
      }

      public PlayerCosmeticsPush.Builder clearSettings() {
         this.bitField0_ &= -3;
         this.settings_ = null;
         if (this.settingsBuilder_ != null) {
            this.settingsBuilder_.dispose();
            this.settingsBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public CustomizableCosmeticSettings.Builder getSettingsBuilder() {
         this.bitField0_ |= 2;
         this.onChanged();
         return this.getSettingsFieldBuilder().getBuilder();
      }

      @Override
      public CustomizableCosmeticSettingsOrBuilder getSettingsOrBuilder() {
         if (this.settingsBuilder_ != null) {
            return this.settingsBuilder_.getMessageOrBuilder();
         } else {
            return this.settings_ == null ? CustomizableCosmeticSettings.getDefaultInstance() : this.settings_;
         }
      }

      private SingleFieldBuilderV3<CustomizableCosmeticSettings, CustomizableCosmeticSettings.Builder, CustomizableCosmeticSettingsOrBuilder> getSettingsFieldBuilder() {
         if (this.settingsBuilder_ == null) {
            this.settingsBuilder_ = new SingleFieldBuilderV3<>(this.getSettings(), this.getParentForChildren(), this.isClean());
            this.settings_ = null;
         }

         return this.settingsBuilder_;
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

      public PlayerCosmeticsPush.Builder setLogoColor(Color var1) {
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

      public PlayerCosmeticsPush.Builder setLogoColor(Color.Builder var1) {
         if (this.logoColorBuilder_ == null) {
            this.logoColor_ = var1.build();
         } else {
            this.logoColorBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public PlayerCosmeticsPush.Builder mergeLogoColor(Color var1) {
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

      public PlayerCosmeticsPush.Builder clearLogoColor() {
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
      public boolean getLogoAlwaysShow() {
         return this.logoAlwaysShow_;
      }

      public PlayerCosmeticsPush.Builder setLogoAlwaysShow(boolean var1) {
         this.logoAlwaysShow_ = var1;
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public PlayerCosmeticsPush.Builder clearLogoAlwaysShow() {
         this.bitField0_ &= -9;
         this.logoAlwaysShow_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public int getBadgeId() {
         return this.badgeId_;
      }

      public PlayerCosmeticsPush.Builder setBadgeId(int var1) {
         this.badgeId_ = var1;
         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      public PlayerCosmeticsPush.Builder clearBadgeId() {
         this.bitField0_ &= -17;
         this.badgeId_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasOutfitUuid() {
         return (this.bitField0_ & 32) != 0;
      }

      @Override
      public Uuid getOutfitUuid() {
         if (this.outfitUuidBuilder_ == null) {
            return this.outfitUuid_ == null ? Uuid.getDefaultInstance() : this.outfitUuid_;
         } else {
            return this.outfitUuidBuilder_.getMessage();
         }
      }

      public PlayerCosmeticsPush.Builder setOutfitUuid(Uuid var1) {
         if (this.outfitUuidBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.outfitUuid_ = var1;
         } else {
            this.outfitUuidBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 32;
         this.onChanged();
         return this;
      }

      public PlayerCosmeticsPush.Builder setOutfitUuid(Uuid.Builder var1) {
         if (this.outfitUuidBuilder_ == null) {
            this.outfitUuid_ = var1.build();
         } else {
            this.outfitUuidBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 32;
         this.onChanged();
         return this;
      }

      public PlayerCosmeticsPush.Builder mergeOutfitUuid(Uuid var1) {
         if (this.outfitUuidBuilder_ == null) {
            if ((this.bitField0_ & 32) != 0 && this.outfitUuid_ != null && this.outfitUuid_ != Uuid.getDefaultInstance()) {
               this.getOutfitUuidBuilder().mergeFrom(var1);
            } else {
               this.outfitUuid_ = var1;
            }
         } else {
            this.outfitUuidBuilder_.mergeFrom(var1);
         }

         if (this.outfitUuid_ != null) {
            this.bitField0_ |= 32;
            this.onChanged();
         }

         return this;
      }

      public PlayerCosmeticsPush.Builder clearOutfitUuid() {
         this.bitField0_ &= -33;
         this.outfitUuid_ = null;
         if (this.outfitUuidBuilder_ != null) {
            this.outfitUuidBuilder_.dispose();
            this.outfitUuidBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Uuid.Builder getOutfitUuidBuilder() {
         this.bitField0_ |= 32;
         this.onChanged();
         return this.getOutfitUuidFieldBuilder().getBuilder();
      }

      @Override
      public UuidOrBuilder getOutfitUuidOrBuilder() {
         if (this.outfitUuidBuilder_ != null) {
            return this.outfitUuidBuilder_.getMessageOrBuilder();
         } else {
            return this.outfitUuid_ == null ? Uuid.getDefaultInstance() : this.outfitUuid_;
         }
      }

      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> getOutfitUuidFieldBuilder() {
         if (this.outfitUuidBuilder_ == null) {
            this.outfitUuidBuilder_ = new SingleFieldBuilderV3<>(this.getOutfitUuid(), this.getParentForChildren(), this.isClean());
            this.outfitUuid_ = null;
         }

         return this.outfitUuidBuilder_;
      }

      public final PlayerCosmeticsPush.Builder setUnknownFields(UnknownFieldSet var1) {
         return (PlayerCosmeticsPush.Builder)super.setUnknownFields(var1);
      }

      public final PlayerCosmeticsPush.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (PlayerCosmeticsPush.Builder)super.mergeUnknownFields(var1);
      }
   }
}
