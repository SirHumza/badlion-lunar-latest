package com.lunarclient.websocket.cosmetic.v2;

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
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.RepeatedFieldBuilderV3;
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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class PlayerCosmeticsPushV2 extends GeneratedMessageV3 implements PlayerCosmeticsPushV2OrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int PLAYER_UUID_FIELD_NUMBER = 1;
   private Uuid playerUuid_;
   public static final int LOGO_COLOR_FIELD_NUMBER = 2;
   private Color logoColor_;
   public static final int LOGO_ALWAYS_SHOW_FIELD_NUMBER = 3;
   private boolean logoAlwaysShow_ = false;
   public static final int PLUS_COLOR_FIELD_NUMBER = 4;
   private Color plusColor_;
   public static final int CONDITIONAL_COSMETICS_FIELD_NUMBER = 5;
   private List<PlayerCosmeticsPushV2.ConditionalCosmetics> conditionalCosmetics_;
   public static final int DEFAULT_COSMETICS_FIELD_NUMBER = 6;
   private List<EquippedCosmetic> defaultCosmetics_;
   public static final int BADGE_ID_FIELD_NUMBER = 7;
   private int badgeId_ = 0;
   public static final int OUTFIT_UUID_FIELD_NUMBER = 8;
   private Uuid outfitUuid_;
   private byte memoizedIsInitialized = -1;
   private static final PlayerCosmeticsPushV2 DEFAULT_INSTANCE = new PlayerCosmeticsPushV2();
   private static final Parser<PlayerCosmeticsPushV2> PARSER = new AbstractParser<PlayerCosmeticsPushV2>() {
      public PlayerCosmeticsPushV2 parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         PlayerCosmeticsPushV2.Builder var3 = PlayerCosmeticsPushV2.newBuilder();

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

   private PlayerCosmeticsPushV2(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private PlayerCosmeticsPushV2() {
      this.conditionalCosmetics_ = Collections.emptyList();
      this.defaultCosmetics_ = Collections.emptyList();
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new PlayerCosmeticsPushV2();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return PushProto.internal_static_lunarclient_websocket_cosmetic_v2_PlayerCosmeticsPushV2_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return PushProto.internal_static_lunarclient_websocket_cosmetic_v2_PlayerCosmeticsPushV2_fieldAccessorTable
         .ensureFieldAccessorsInitialized(PlayerCosmeticsPushV2.class, PlayerCosmeticsPushV2.Builder.class);
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
   public boolean hasLogoColor() {
      return (this.bitField0_ & 2) != 0;
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
   public boolean hasPlusColor() {
      return (this.bitField0_ & 4) != 0;
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
   public List<PlayerCosmeticsPushV2.ConditionalCosmetics> getConditionalCosmeticsList() {
      return this.conditionalCosmetics_;
   }

   @Override
   public List<? extends PlayerCosmeticsPushV2.ConditionalCosmeticsOrBuilder> getConditionalCosmeticsOrBuilderList() {
      return this.conditionalCosmetics_;
   }

   @Override
   public int getConditionalCosmeticsCount() {
      return this.conditionalCosmetics_.size();
   }

   @Override
   public PlayerCosmeticsPushV2.ConditionalCosmetics getConditionalCosmetics(int var1) {
      return this.conditionalCosmetics_.get(var1);
   }

   @Override
   public PlayerCosmeticsPushV2.ConditionalCosmeticsOrBuilder getConditionalCosmeticsOrBuilder(int var1) {
      return this.conditionalCosmetics_.get(var1);
   }

   @Override
   public List<EquippedCosmetic> getDefaultCosmeticsList() {
      return this.defaultCosmetics_;
   }

   @Override
   public List<? extends EquippedCosmeticOrBuilder> getDefaultCosmeticsOrBuilderList() {
      return this.defaultCosmetics_;
   }

   @Override
   public int getDefaultCosmeticsCount() {
      return this.defaultCosmetics_.size();
   }

   @Override
   public EquippedCosmetic getDefaultCosmetics(int var1) {
      return this.defaultCosmetics_.get(var1);
   }

   @Override
   public EquippedCosmeticOrBuilder getDefaultCosmeticsOrBuilder(int var1) {
      return this.defaultCosmetics_.get(var1);
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
         var1.writeMessage(2, this.getLogoColor());
      }

      if (this.logoAlwaysShow_) {
         var1.writeBool(3, this.logoAlwaysShow_);
      }

      if ((this.bitField0_ & 4) != 0) {
         var1.writeMessage(4, this.getPlusColor());
      }

      for (int var2 = 0; var2 < this.conditionalCosmetics_.size(); var2++) {
         var1.writeMessage(5, this.conditionalCosmetics_.get(var2));
      }

      for (int var3 = 0; var3 < this.defaultCosmetics_.size(); var3++) {
         var1.writeMessage(6, this.defaultCosmetics_.get(var3));
      }

      if (this.badgeId_ != 0) {
         var1.writeInt32(7, this.badgeId_);
      }

      if ((this.bitField0_ & 8) != 0) {
         var1.writeMessage(8, this.getOutfitUuid());
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
         var1 += CodedOutputStream.computeMessageSize(2, this.getLogoColor());
      }

      if (this.logoAlwaysShow_) {
         var1 += CodedOutputStream.computeBoolSize(3, this.logoAlwaysShow_);
      }

      if ((this.bitField0_ & 4) != 0) {
         var1 += CodedOutputStream.computeMessageSize(4, this.getPlusColor());
      }

      for (int var2 = 0; var2 < this.conditionalCosmetics_.size(); var2++) {
         var1 += CodedOutputStream.computeMessageSize(5, this.conditionalCosmetics_.get(var2));
      }

      for (int var5 = 0; var5 < this.defaultCosmetics_.size(); var5++) {
         var1 += CodedOutputStream.computeMessageSize(6, this.defaultCosmetics_.get(var5));
      }

      if (this.badgeId_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(7, this.badgeId_);
      }

      if ((this.bitField0_ & 8) != 0) {
         var1 += CodedOutputStream.computeMessageSize(8, this.getOutfitUuid());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof PlayerCosmeticsPushV2)) {
         return super.equals(var1);
      } else {
         PlayerCosmeticsPushV2 var2 = (PlayerCosmeticsPushV2)var1;
         if (this.hasPlayerUuid() != var2.hasPlayerUuid()) {
            return false;
         } else if (this.hasPlayerUuid() && !this.getPlayerUuid().equals(var2.getPlayerUuid())) {
            return false;
         } else if (this.hasLogoColor() != var2.hasLogoColor()) {
            return false;
         } else if (this.hasLogoColor() && !this.getLogoColor().equals(var2.getLogoColor())) {
            return false;
         } else if (this.getLogoAlwaysShow() != var2.getLogoAlwaysShow()) {
            return false;
         } else if (this.hasPlusColor() != var2.hasPlusColor()) {
            return false;
         } else if (this.hasPlusColor() && !this.getPlusColor().equals(var2.getPlusColor())) {
            return false;
         } else if (!this.getConditionalCosmeticsList().equals(var2.getConditionalCosmeticsList())) {
            return false;
         } else if (!this.getDefaultCosmeticsList().equals(var2.getDefaultCosmeticsList())) {
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

      if (this.hasLogoColor()) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getLogoColor().hashCode();
      }

      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + Internal.hashBoolean(this.getLogoAlwaysShow());
      if (this.hasPlusColor()) {
         var1 = 37 * var1 + 4;
         var1 = 53 * var1 + this.getPlusColor().hashCode();
      }

      if (this.getConditionalCosmeticsCount() > 0) {
         var1 = 37 * var1 + 5;
         var1 = 53 * var1 + this.getConditionalCosmeticsList().hashCode();
      }

      if (this.getDefaultCosmeticsCount() > 0) {
         var1 = 37 * var1 + 6;
         var1 = 53 * var1 + this.getDefaultCosmeticsList().hashCode();
      }

      var1 = 37 * var1 + 7;
      var1 = 53 * var1 + this.getBadgeId();
      if (this.hasOutfitUuid()) {
         var1 = 37 * var1 + 8;
         var1 = 53 * var1 + this.getOutfitUuid().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static PlayerCosmeticsPushV2 parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static PlayerCosmeticsPushV2 parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static PlayerCosmeticsPushV2 parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static PlayerCosmeticsPushV2 parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static PlayerCosmeticsPushV2 parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static PlayerCosmeticsPushV2 parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static PlayerCosmeticsPushV2 parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PlayerCosmeticsPushV2 parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PlayerCosmeticsPushV2 parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static PlayerCosmeticsPushV2 parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static PlayerCosmeticsPushV2 parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PlayerCosmeticsPushV2 parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public PlayerCosmeticsPushV2.Builder newBuilderForType() {
      return newBuilder();
   }

   public static PlayerCosmeticsPushV2.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static PlayerCosmeticsPushV2.Builder newBuilder(PlayerCosmeticsPushV2 var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public PlayerCosmeticsPushV2.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new PlayerCosmeticsPushV2.Builder() : new PlayerCosmeticsPushV2.Builder().mergeFrom(this);
   }

   protected PlayerCosmeticsPushV2.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new PlayerCosmeticsPushV2.Builder(var1);
   }

   public static PlayerCosmeticsPushV2 getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<PlayerCosmeticsPushV2> parser() {
      return PARSER;
   }

   @Override
   public Parser<PlayerCosmeticsPushV2> getParserForType() {
      return PARSER;
   }

   public PlayerCosmeticsPushV2 getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<PlayerCosmeticsPushV2.Builder> implements PlayerCosmeticsPushV2OrBuilder {
      private int bitField0_;
      private Uuid playerUuid_;
      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> playerUuidBuilder_;
      private Color logoColor_;
      private SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> logoColorBuilder_;
      private boolean logoAlwaysShow_;
      private Color plusColor_;
      private SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> plusColorBuilder_;
      private List<PlayerCosmeticsPushV2.ConditionalCosmetics> conditionalCosmetics_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<PlayerCosmeticsPushV2.ConditionalCosmetics, PlayerCosmeticsPushV2.ConditionalCosmetics.Builder, PlayerCosmeticsPushV2.ConditionalCosmeticsOrBuilder> conditionalCosmeticsBuilder_;
      private List<EquippedCosmetic> defaultCosmetics_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<EquippedCosmetic, EquippedCosmetic.Builder, EquippedCosmeticOrBuilder> defaultCosmeticsBuilder_;
      private int badgeId_;
      private Uuid outfitUuid_;
      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> outfitUuidBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return PushProto.internal_static_lunarclient_websocket_cosmetic_v2_PlayerCosmeticsPushV2_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PushProto.internal_static_lunarclient_websocket_cosmetic_v2_PlayerCosmeticsPushV2_fieldAccessorTable
            .ensureFieldAccessorsInitialized(PlayerCosmeticsPushV2.class, PlayerCosmeticsPushV2.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (PlayerCosmeticsPushV2.alwaysUseFieldBuilders) {
            this.getPlayerUuidFieldBuilder();
            this.getLogoColorFieldBuilder();
            this.getPlusColorFieldBuilder();
            this.getConditionalCosmeticsFieldBuilder();
            this.getDefaultCosmeticsFieldBuilder();
            this.getOutfitUuidFieldBuilder();
         }
      }

      public PlayerCosmeticsPushV2.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.playerUuid_ = null;
         if (this.playerUuidBuilder_ != null) {
            this.playerUuidBuilder_.dispose();
            this.playerUuidBuilder_ = null;
         }

         this.logoColor_ = null;
         if (this.logoColorBuilder_ != null) {
            this.logoColorBuilder_.dispose();
            this.logoColorBuilder_ = null;
         }

         this.logoAlwaysShow_ = false;
         this.plusColor_ = null;
         if (this.plusColorBuilder_ != null) {
            this.plusColorBuilder_.dispose();
            this.plusColorBuilder_ = null;
         }

         if (this.conditionalCosmeticsBuilder_ == null) {
            this.conditionalCosmetics_ = Collections.emptyList();
         } else {
            this.conditionalCosmetics_ = null;
            this.conditionalCosmeticsBuilder_.clear();
         }

         this.bitField0_ &= -17;
         if (this.defaultCosmeticsBuilder_ == null) {
            this.defaultCosmetics_ = Collections.emptyList();
         } else {
            this.defaultCosmetics_ = null;
            this.defaultCosmeticsBuilder_.clear();
         }

         this.bitField0_ &= -33;
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
         return PushProto.internal_static_lunarclient_websocket_cosmetic_v2_PlayerCosmeticsPushV2_descriptor;
      }

      public PlayerCosmeticsPushV2 getDefaultInstanceForType() {
         return PlayerCosmeticsPushV2.getDefaultInstance();
      }

      public PlayerCosmeticsPushV2 build() {
         PlayerCosmeticsPushV2 var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public PlayerCosmeticsPushV2 buildPartial() {
         PlayerCosmeticsPushV2 var1 = new PlayerCosmeticsPushV2(this);
         this.buildPartialRepeatedFields(var1);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartialRepeatedFields(PlayerCosmeticsPushV2 var1) {
         if (this.conditionalCosmeticsBuilder_ == null) {
            if ((this.bitField0_ & 16) != 0) {
               this.conditionalCosmetics_ = Collections.unmodifiableList(this.conditionalCosmetics_);
               this.bitField0_ &= -17;
            }

            var1.conditionalCosmetics_ = this.conditionalCosmetics_;
         } else {
            var1.conditionalCosmetics_ = this.conditionalCosmeticsBuilder_.build();
         }

         if (this.defaultCosmeticsBuilder_ == null) {
            if ((this.bitField0_ & 32) != 0) {
               this.defaultCosmetics_ = Collections.unmodifiableList(this.defaultCosmetics_);
               this.bitField0_ &= -33;
            }

            var1.defaultCosmetics_ = this.defaultCosmetics_;
         } else {
            var1.defaultCosmetics_ = this.defaultCosmeticsBuilder_.build();
         }
      }

      private void buildPartial0(PlayerCosmeticsPushV2 var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.playerUuid_ = this.playerUuidBuilder_ == null ? this.playerUuid_ : this.playerUuidBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.logoColor_ = this.logoColorBuilder_ == null ? this.logoColor_ : this.logoColorBuilder_.build();
            var3 |= 2;
         }

         if ((var2 & 4) != 0) {
            var1.logoAlwaysShow_ = this.logoAlwaysShow_;
         }

         if ((var2 & 8) != 0) {
            var1.plusColor_ = this.plusColorBuilder_ == null ? this.plusColor_ : this.plusColorBuilder_.build();
            var3 |= 4;
         }

         if ((var2 & 64) != 0) {
            var1.badgeId_ = this.badgeId_;
         }

         if ((var2 & 128) != 0) {
            var1.outfitUuid_ = this.outfitUuidBuilder_ == null ? this.outfitUuid_ : this.outfitUuidBuilder_.build();
            var3 |= 8;
         }

         PlayerCosmeticsPushV2 var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public PlayerCosmeticsPushV2.Builder clone() {
         return (PlayerCosmeticsPushV2.Builder)super.clone();
      }

      public PlayerCosmeticsPushV2.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (PlayerCosmeticsPushV2.Builder)super.setField(var1, var2);
      }

      public PlayerCosmeticsPushV2.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (PlayerCosmeticsPushV2.Builder)super.clearField(var1);
      }

      public PlayerCosmeticsPushV2.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (PlayerCosmeticsPushV2.Builder)super.clearOneof(var1);
      }

      public PlayerCosmeticsPushV2.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (PlayerCosmeticsPushV2.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public PlayerCosmeticsPushV2.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (PlayerCosmeticsPushV2.Builder)super.addRepeatedField(var1, var2);
      }

      public PlayerCosmeticsPushV2.Builder mergeFrom(Message var1) {
         if (var1 instanceof PlayerCosmeticsPushV2) {
            return this.mergeFrom((PlayerCosmeticsPushV2)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public PlayerCosmeticsPushV2.Builder mergeFrom(PlayerCosmeticsPushV2 var1) {
         if (var1 == PlayerCosmeticsPushV2.getDefaultInstance()) {
            return this;
         }

         if (var1.hasPlayerUuid()) {
            this.mergePlayerUuid(var1.getPlayerUuid());
         }

         if (var1.hasLogoColor()) {
            this.mergeLogoColor(var1.getLogoColor());
         }

         if (var1.getLogoAlwaysShow()) {
            this.setLogoAlwaysShow(var1.getLogoAlwaysShow());
         }

         if (var1.hasPlusColor()) {
            this.mergePlusColor(var1.getPlusColor());
         }

         if (this.conditionalCosmeticsBuilder_ == null) {
            if (!var1.conditionalCosmetics_.isEmpty()) {
               if (this.conditionalCosmetics_.isEmpty()) {
                  this.conditionalCosmetics_ = var1.conditionalCosmetics_;
                  this.bitField0_ &= -17;
               } else {
                  this.ensureConditionalCosmeticsIsMutable();
                  this.conditionalCosmetics_.addAll(var1.conditionalCosmetics_);
               }

               this.onChanged();
            }
         } else if (!var1.conditionalCosmetics_.isEmpty()) {
            if (this.conditionalCosmeticsBuilder_.isEmpty()) {
               this.conditionalCosmeticsBuilder_.dispose();
               this.conditionalCosmeticsBuilder_ = null;
               this.conditionalCosmetics_ = var1.conditionalCosmetics_;
               this.bitField0_ &= -17;
               this.conditionalCosmeticsBuilder_ = PlayerCosmeticsPushV2.alwaysUseFieldBuilders ? this.getConditionalCosmeticsFieldBuilder() : null;
            } else {
               this.conditionalCosmeticsBuilder_.addAllMessages(var1.conditionalCosmetics_);
            }
         }

         if (this.defaultCosmeticsBuilder_ == null) {
            if (!var1.defaultCosmetics_.isEmpty()) {
               if (this.defaultCosmetics_.isEmpty()) {
                  this.defaultCosmetics_ = var1.defaultCosmetics_;
                  this.bitField0_ &= -33;
               } else {
                  this.ensureDefaultCosmeticsIsMutable();
                  this.defaultCosmetics_.addAll(var1.defaultCosmetics_);
               }

               this.onChanged();
            }
         } else if (!var1.defaultCosmetics_.isEmpty()) {
            if (this.defaultCosmeticsBuilder_.isEmpty()) {
               this.defaultCosmeticsBuilder_.dispose();
               this.defaultCosmeticsBuilder_ = null;
               this.defaultCosmetics_ = var1.defaultCosmetics_;
               this.bitField0_ &= -33;
               this.defaultCosmeticsBuilder_ = PlayerCosmeticsPushV2.alwaysUseFieldBuilders ? this.getDefaultCosmeticsFieldBuilder() : null;
            } else {
               this.defaultCosmeticsBuilder_.addAllMessages(var1.defaultCosmetics_);
            }
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

      public PlayerCosmeticsPushV2.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getLogoColorFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 2;
                     break;
                  case 24:
                     this.logoAlwaysShow_ = var1.readBool();
                     this.bitField0_ |= 4;
                     break;
                  case 34:
                     var1.readMessage(this.getPlusColorFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 8;
                     break;
                  case 42:
                     PlayerCosmeticsPushV2.ConditionalCosmetics var11 = var1.readMessage(PlayerCosmeticsPushV2.ConditionalCosmetics.parser(), var2);
                     if (this.conditionalCosmeticsBuilder_ == null) {
                        this.ensureConditionalCosmeticsIsMutable();
                        this.conditionalCosmetics_.add(var11);
                     } else {
                        this.conditionalCosmeticsBuilder_.addMessage(var11);
                     }
                     break;
                  case 50:
                     EquippedCosmetic var5 = var1.readMessage(EquippedCosmetic.parser(), var2);
                     if (this.defaultCosmeticsBuilder_ == null) {
                        this.ensureDefaultCosmeticsIsMutable();
                        this.defaultCosmetics_.add(var5);
                     } else {
                        this.defaultCosmeticsBuilder_.addMessage(var5);
                     }
                     break;
                  case 56:
                     this.badgeId_ = var1.readInt32();
                     this.bitField0_ |= 64;
                     break;
                  case 66:
                     var1.readMessage(this.getOutfitUuidFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 128;
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

      public PlayerCosmeticsPushV2.Builder setPlayerUuid(Uuid var1) {
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

      public PlayerCosmeticsPushV2.Builder setPlayerUuid(Uuid.Builder var1) {
         if (this.playerUuidBuilder_ == null) {
            this.playerUuid_ = var1.build();
         } else {
            this.playerUuidBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public PlayerCosmeticsPushV2.Builder mergePlayerUuid(Uuid var1) {
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

      public PlayerCosmeticsPushV2.Builder clearPlayerUuid() {
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
      public boolean hasLogoColor() {
         return (this.bitField0_ & 2) != 0;
      }

      @Override
      public Color getLogoColor() {
         if (this.logoColorBuilder_ == null) {
            return this.logoColor_ == null ? Color.getDefaultInstance() : this.logoColor_;
         } else {
            return this.logoColorBuilder_.getMessage();
         }
      }

      public PlayerCosmeticsPushV2.Builder setLogoColor(Color var1) {
         if (this.logoColorBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.logoColor_ = var1;
         } else {
            this.logoColorBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public PlayerCosmeticsPushV2.Builder setLogoColor(Color.Builder var1) {
         if (this.logoColorBuilder_ == null) {
            this.logoColor_ = var1.build();
         } else {
            this.logoColorBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public PlayerCosmeticsPushV2.Builder mergeLogoColor(Color var1) {
         if (this.logoColorBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0 && this.logoColor_ != null && this.logoColor_ != Color.getDefaultInstance()) {
               this.getLogoColorBuilder().mergeFrom(var1);
            } else {
               this.logoColor_ = var1;
            }
         } else {
            this.logoColorBuilder_.mergeFrom(var1);
         }

         if (this.logoColor_ != null) {
            this.bitField0_ |= 2;
            this.onChanged();
         }

         return this;
      }

      public PlayerCosmeticsPushV2.Builder clearLogoColor() {
         this.bitField0_ &= -3;
         this.logoColor_ = null;
         if (this.logoColorBuilder_ != null) {
            this.logoColorBuilder_.dispose();
            this.logoColorBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Color.Builder getLogoColorBuilder() {
         this.bitField0_ |= 2;
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

      public PlayerCosmeticsPushV2.Builder setLogoAlwaysShow(boolean var1) {
         this.logoAlwaysShow_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public PlayerCosmeticsPushV2.Builder clearLogoAlwaysShow() {
         this.bitField0_ &= -5;
         this.logoAlwaysShow_ = false;
         this.onChanged();
         return this;
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

      public PlayerCosmeticsPushV2.Builder setPlusColor(Color var1) {
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

      public PlayerCosmeticsPushV2.Builder setPlusColor(Color.Builder var1) {
         if (this.plusColorBuilder_ == null) {
            this.plusColor_ = var1.build();
         } else {
            this.plusColorBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public PlayerCosmeticsPushV2.Builder mergePlusColor(Color var1) {
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

      public PlayerCosmeticsPushV2.Builder clearPlusColor() {
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

      private void ensureConditionalCosmeticsIsMutable() {
         if ((this.bitField0_ & 16) == 0) {
            this.conditionalCosmetics_ = new ArrayList<>(this.conditionalCosmetics_);
            this.bitField0_ |= 16;
         }
      }

      @Override
      public List<PlayerCosmeticsPushV2.ConditionalCosmetics> getConditionalCosmeticsList() {
         return this.conditionalCosmeticsBuilder_ == null
            ? Collections.unmodifiableList(this.conditionalCosmetics_)
            : this.conditionalCosmeticsBuilder_.getMessageList();
      }

      @Override
      public int getConditionalCosmeticsCount() {
         return this.conditionalCosmeticsBuilder_ == null ? this.conditionalCosmetics_.size() : this.conditionalCosmeticsBuilder_.getCount();
      }

      @Override
      public PlayerCosmeticsPushV2.ConditionalCosmetics getConditionalCosmetics(int var1) {
         return this.conditionalCosmeticsBuilder_ == null ? this.conditionalCosmetics_.get(var1) : this.conditionalCosmeticsBuilder_.getMessage(var1);
      }

      public PlayerCosmeticsPushV2.Builder setConditionalCosmetics(int var1, PlayerCosmeticsPushV2.ConditionalCosmetics var2) {
         if (this.conditionalCosmeticsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureConditionalCosmeticsIsMutable();
            this.conditionalCosmetics_.set(var1, var2);
            this.onChanged();
         } else {
            this.conditionalCosmeticsBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public PlayerCosmeticsPushV2.Builder setConditionalCosmetics(int var1, PlayerCosmeticsPushV2.ConditionalCosmetics.Builder var2) {
         if (this.conditionalCosmeticsBuilder_ == null) {
            this.ensureConditionalCosmeticsIsMutable();
            this.conditionalCosmetics_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.conditionalCosmeticsBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public PlayerCosmeticsPushV2.Builder addConditionalCosmetics(PlayerCosmeticsPushV2.ConditionalCosmetics var1) {
         if (this.conditionalCosmeticsBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureConditionalCosmeticsIsMutable();
            this.conditionalCosmetics_.add(var1);
            this.onChanged();
         } else {
            this.conditionalCosmeticsBuilder_.addMessage(var1);
         }

         return this;
      }

      public PlayerCosmeticsPushV2.Builder addConditionalCosmetics(int var1, PlayerCosmeticsPushV2.ConditionalCosmetics var2) {
         if (this.conditionalCosmeticsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureConditionalCosmeticsIsMutable();
            this.conditionalCosmetics_.add(var1, var2);
            this.onChanged();
         } else {
            this.conditionalCosmeticsBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public PlayerCosmeticsPushV2.Builder addConditionalCosmetics(PlayerCosmeticsPushV2.ConditionalCosmetics.Builder var1) {
         if (this.conditionalCosmeticsBuilder_ == null) {
            this.ensureConditionalCosmeticsIsMutable();
            this.conditionalCosmetics_.add(var1.build());
            this.onChanged();
         } else {
            this.conditionalCosmeticsBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public PlayerCosmeticsPushV2.Builder addConditionalCosmetics(int var1, PlayerCosmeticsPushV2.ConditionalCosmetics.Builder var2) {
         if (this.conditionalCosmeticsBuilder_ == null) {
            this.ensureConditionalCosmeticsIsMutable();
            this.conditionalCosmetics_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.conditionalCosmeticsBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public PlayerCosmeticsPushV2.Builder addAllConditionalCosmetics(Iterable<? extends PlayerCosmeticsPushV2.ConditionalCosmetics> var1) {
         if (this.conditionalCosmeticsBuilder_ == null) {
            this.ensureConditionalCosmeticsIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.conditionalCosmetics_);
            this.onChanged();
         } else {
            this.conditionalCosmeticsBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public PlayerCosmeticsPushV2.Builder clearConditionalCosmetics() {
         if (this.conditionalCosmeticsBuilder_ == null) {
            this.conditionalCosmetics_ = Collections.emptyList();
            this.bitField0_ &= -17;
            this.onChanged();
         } else {
            this.conditionalCosmeticsBuilder_.clear();
         }

         return this;
      }

      public PlayerCosmeticsPushV2.Builder removeConditionalCosmetics(int var1) {
         if (this.conditionalCosmeticsBuilder_ == null) {
            this.ensureConditionalCosmeticsIsMutable();
            this.conditionalCosmetics_.remove(var1);
            this.onChanged();
         } else {
            this.conditionalCosmeticsBuilder_.remove(var1);
         }

         return this;
      }

      public PlayerCosmeticsPushV2.ConditionalCosmetics.Builder getConditionalCosmeticsBuilder(int var1) {
         return this.getConditionalCosmeticsFieldBuilder().getBuilder(var1);
      }

      @Override
      public PlayerCosmeticsPushV2.ConditionalCosmeticsOrBuilder getConditionalCosmeticsOrBuilder(int var1) {
         return this.conditionalCosmeticsBuilder_ == null ? this.conditionalCosmetics_.get(var1) : this.conditionalCosmeticsBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends PlayerCosmeticsPushV2.ConditionalCosmeticsOrBuilder> getConditionalCosmeticsOrBuilderList() {
         return this.conditionalCosmeticsBuilder_ != null
            ? this.conditionalCosmeticsBuilder_.getMessageOrBuilderList()
            : Collections.unmodifiableList(this.conditionalCosmetics_);
      }

      public PlayerCosmeticsPushV2.ConditionalCosmetics.Builder addConditionalCosmeticsBuilder() {
         return this.getConditionalCosmeticsFieldBuilder().addBuilder(PlayerCosmeticsPushV2.ConditionalCosmetics.getDefaultInstance());
      }

      public PlayerCosmeticsPushV2.ConditionalCosmetics.Builder addConditionalCosmeticsBuilder(int var1) {
         return this.getConditionalCosmeticsFieldBuilder().addBuilder(var1, PlayerCosmeticsPushV2.ConditionalCosmetics.getDefaultInstance());
      }

      public List<PlayerCosmeticsPushV2.ConditionalCosmetics.Builder> getConditionalCosmeticsBuilderList() {
         return this.getConditionalCosmeticsFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<PlayerCosmeticsPushV2.ConditionalCosmetics, PlayerCosmeticsPushV2.ConditionalCosmetics.Builder, PlayerCosmeticsPushV2.ConditionalCosmeticsOrBuilder> getConditionalCosmeticsFieldBuilder() {
         if (this.conditionalCosmeticsBuilder_ == null) {
            this.conditionalCosmeticsBuilder_ = new RepeatedFieldBuilderV3<>(
               this.conditionalCosmetics_, (this.bitField0_ & 16) != 0, this.getParentForChildren(), this.isClean()
            );
            this.conditionalCosmetics_ = null;
         }

         return this.conditionalCosmeticsBuilder_;
      }

      private void ensureDefaultCosmeticsIsMutable() {
         if ((this.bitField0_ & 32) == 0) {
            this.defaultCosmetics_ = new ArrayList<>(this.defaultCosmetics_);
            this.bitField0_ |= 32;
         }
      }

      @Override
      public List<EquippedCosmetic> getDefaultCosmeticsList() {
         return this.defaultCosmeticsBuilder_ == null ? Collections.unmodifiableList(this.defaultCosmetics_) : this.defaultCosmeticsBuilder_.getMessageList();
      }

      @Override
      public int getDefaultCosmeticsCount() {
         return this.defaultCosmeticsBuilder_ == null ? this.defaultCosmetics_.size() : this.defaultCosmeticsBuilder_.getCount();
      }

      @Override
      public EquippedCosmetic getDefaultCosmetics(int var1) {
         return this.defaultCosmeticsBuilder_ == null ? this.defaultCosmetics_.get(var1) : this.defaultCosmeticsBuilder_.getMessage(var1);
      }

      public PlayerCosmeticsPushV2.Builder setDefaultCosmetics(int var1, EquippedCosmetic var2) {
         if (this.defaultCosmeticsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureDefaultCosmeticsIsMutable();
            this.defaultCosmetics_.set(var1, var2);
            this.onChanged();
         } else {
            this.defaultCosmeticsBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public PlayerCosmeticsPushV2.Builder setDefaultCosmetics(int var1, EquippedCosmetic.Builder var2) {
         if (this.defaultCosmeticsBuilder_ == null) {
            this.ensureDefaultCosmeticsIsMutable();
            this.defaultCosmetics_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.defaultCosmeticsBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public PlayerCosmeticsPushV2.Builder addDefaultCosmetics(EquippedCosmetic var1) {
         if (this.defaultCosmeticsBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureDefaultCosmeticsIsMutable();
            this.defaultCosmetics_.add(var1);
            this.onChanged();
         } else {
            this.defaultCosmeticsBuilder_.addMessage(var1);
         }

         return this;
      }

      public PlayerCosmeticsPushV2.Builder addDefaultCosmetics(int var1, EquippedCosmetic var2) {
         if (this.defaultCosmeticsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureDefaultCosmeticsIsMutable();
            this.defaultCosmetics_.add(var1, var2);
            this.onChanged();
         } else {
            this.defaultCosmeticsBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public PlayerCosmeticsPushV2.Builder addDefaultCosmetics(EquippedCosmetic.Builder var1) {
         if (this.defaultCosmeticsBuilder_ == null) {
            this.ensureDefaultCosmeticsIsMutable();
            this.defaultCosmetics_.add(var1.build());
            this.onChanged();
         } else {
            this.defaultCosmeticsBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public PlayerCosmeticsPushV2.Builder addDefaultCosmetics(int var1, EquippedCosmetic.Builder var2) {
         if (this.defaultCosmeticsBuilder_ == null) {
            this.ensureDefaultCosmeticsIsMutable();
            this.defaultCosmetics_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.defaultCosmeticsBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public PlayerCosmeticsPushV2.Builder addAllDefaultCosmetics(Iterable<? extends EquippedCosmetic> var1) {
         if (this.defaultCosmeticsBuilder_ == null) {
            this.ensureDefaultCosmeticsIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.defaultCosmetics_);
            this.onChanged();
         } else {
            this.defaultCosmeticsBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public PlayerCosmeticsPushV2.Builder clearDefaultCosmetics() {
         if (this.defaultCosmeticsBuilder_ == null) {
            this.defaultCosmetics_ = Collections.emptyList();
            this.bitField0_ &= -33;
            this.onChanged();
         } else {
            this.defaultCosmeticsBuilder_.clear();
         }

         return this;
      }

      public PlayerCosmeticsPushV2.Builder removeDefaultCosmetics(int var1) {
         if (this.defaultCosmeticsBuilder_ == null) {
            this.ensureDefaultCosmeticsIsMutable();
            this.defaultCosmetics_.remove(var1);
            this.onChanged();
         } else {
            this.defaultCosmeticsBuilder_.remove(var1);
         }

         return this;
      }

      public EquippedCosmetic.Builder getDefaultCosmeticsBuilder(int var1) {
         return this.getDefaultCosmeticsFieldBuilder().getBuilder(var1);
      }

      @Override
      public EquippedCosmeticOrBuilder getDefaultCosmeticsOrBuilder(int var1) {
         return this.defaultCosmeticsBuilder_ == null ? this.defaultCosmetics_.get(var1) : this.defaultCosmeticsBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends EquippedCosmeticOrBuilder> getDefaultCosmeticsOrBuilderList() {
         return this.defaultCosmeticsBuilder_ != null
            ? this.defaultCosmeticsBuilder_.getMessageOrBuilderList()
            : Collections.unmodifiableList(this.defaultCosmetics_);
      }

      public EquippedCosmetic.Builder addDefaultCosmeticsBuilder() {
         return this.getDefaultCosmeticsFieldBuilder().addBuilder(EquippedCosmetic.getDefaultInstance());
      }

      public EquippedCosmetic.Builder addDefaultCosmeticsBuilder(int var1) {
         return this.getDefaultCosmeticsFieldBuilder().addBuilder(var1, EquippedCosmetic.getDefaultInstance());
      }

      public List<EquippedCosmetic.Builder> getDefaultCosmeticsBuilderList() {
         return this.getDefaultCosmeticsFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<EquippedCosmetic, EquippedCosmetic.Builder, EquippedCosmeticOrBuilder> getDefaultCosmeticsFieldBuilder() {
         if (this.defaultCosmeticsBuilder_ == null) {
            this.defaultCosmeticsBuilder_ = new RepeatedFieldBuilderV3<>(
               this.defaultCosmetics_, (this.bitField0_ & 32) != 0, this.getParentForChildren(), this.isClean()
            );
            this.defaultCosmetics_ = null;
         }

         return this.defaultCosmeticsBuilder_;
      }

      @Override
      public int getBadgeId() {
         return this.badgeId_;
      }

      public PlayerCosmeticsPushV2.Builder setBadgeId(int var1) {
         this.badgeId_ = var1;
         this.bitField0_ |= 64;
         this.onChanged();
         return this;
      }

      public PlayerCosmeticsPushV2.Builder clearBadgeId() {
         this.bitField0_ &= -65;
         this.badgeId_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasOutfitUuid() {
         return (this.bitField0_ & 128) != 0;
      }

      @Override
      public Uuid getOutfitUuid() {
         if (this.outfitUuidBuilder_ == null) {
            return this.outfitUuid_ == null ? Uuid.getDefaultInstance() : this.outfitUuid_;
         } else {
            return this.outfitUuidBuilder_.getMessage();
         }
      }

      public PlayerCosmeticsPushV2.Builder setOutfitUuid(Uuid var1) {
         if (this.outfitUuidBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.outfitUuid_ = var1;
         } else {
            this.outfitUuidBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 128;
         this.onChanged();
         return this;
      }

      public PlayerCosmeticsPushV2.Builder setOutfitUuid(Uuid.Builder var1) {
         if (this.outfitUuidBuilder_ == null) {
            this.outfitUuid_ = var1.build();
         } else {
            this.outfitUuidBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 128;
         this.onChanged();
         return this;
      }

      public PlayerCosmeticsPushV2.Builder mergeOutfitUuid(Uuid var1) {
         if (this.outfitUuidBuilder_ == null) {
            if ((this.bitField0_ & 128) != 0 && this.outfitUuid_ != null && this.outfitUuid_ != Uuid.getDefaultInstance()) {
               this.getOutfitUuidBuilder().mergeFrom(var1);
            } else {
               this.outfitUuid_ = var1;
            }
         } else {
            this.outfitUuidBuilder_.mergeFrom(var1);
         }

         if (this.outfitUuid_ != null) {
            this.bitField0_ |= 128;
            this.onChanged();
         }

         return this;
      }

      public PlayerCosmeticsPushV2.Builder clearOutfitUuid() {
         this.bitField0_ &= -129;
         this.outfitUuid_ = null;
         if (this.outfitUuidBuilder_ != null) {
            this.outfitUuidBuilder_.dispose();
            this.outfitUuidBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Uuid.Builder getOutfitUuidBuilder() {
         this.bitField0_ |= 128;
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

      public final PlayerCosmeticsPushV2.Builder setUnknownFields(UnknownFieldSet var1) {
         return (PlayerCosmeticsPushV2.Builder)super.setUnknownFields(var1);
      }

      public final PlayerCosmeticsPushV2.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (PlayerCosmeticsPushV2.Builder)super.mergeUnknownFields(var1);
      }
   }

   public static final class ConditionalCosmetics extends GeneratedMessageV3 implements PlayerCosmeticsPushV2.ConditionalCosmeticsOrBuilder {
      private static final long serialVersionUID = 0L;
      private int bitField0_;
      public static final int EQUIP_CONDITION_FIELD_NUMBER = 1;
      private EquipCondition equipCondition_;
      public static final int COSMETICS_FIELD_NUMBER = 2;
      private List<EquippedCosmetic> cosmetics_;
      private byte memoizedIsInitialized = -1;
      private static final PlayerCosmeticsPushV2.ConditionalCosmetics DEFAULT_INSTANCE = new PlayerCosmeticsPushV2.ConditionalCosmetics();
      private static final Parser<PlayerCosmeticsPushV2.ConditionalCosmetics> PARSER = new AbstractParser<PlayerCosmeticsPushV2.ConditionalCosmetics>() {
         public PlayerCosmeticsPushV2.ConditionalCosmetics parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
            PlayerCosmeticsPushV2.ConditionalCosmetics.Builder var3 = PlayerCosmeticsPushV2.ConditionalCosmetics.newBuilder();

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

      private ConditionalCosmetics(GeneratedMessageV3.Builder<?> var1) {
         super(var1);
      }

      private ConditionalCosmetics() {
         this.cosmetics_ = Collections.emptyList();
      }

      @Override
      protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
         return new PlayerCosmeticsPushV2.ConditionalCosmetics();
      }

      public static final Descriptors.Descriptor getDescriptor() {
         return PushProto.internal_static_lunarclient_websocket_cosmetic_v2_PlayerCosmeticsPushV2_ConditionalCosmetics_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PushProto.internal_static_lunarclient_websocket_cosmetic_v2_PlayerCosmeticsPushV2_ConditionalCosmetics_fieldAccessorTable
            .ensureFieldAccessorsInitialized(PlayerCosmeticsPushV2.ConditionalCosmetics.class, PlayerCosmeticsPushV2.ConditionalCosmetics.Builder.class);
      }

      @Override
      public boolean hasEquipCondition() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public EquipCondition getEquipCondition() {
         return this.equipCondition_ == null ? EquipCondition.getDefaultInstance() : this.equipCondition_;
      }

      @Override
      public EquipConditionOrBuilder getEquipConditionOrBuilder() {
         return this.equipCondition_ == null ? EquipCondition.getDefaultInstance() : this.equipCondition_;
      }

      @Override
      public List<EquippedCosmetic> getCosmeticsList() {
         return this.cosmetics_;
      }

      @Override
      public List<? extends EquippedCosmeticOrBuilder> getCosmeticsOrBuilderList() {
         return this.cosmetics_;
      }

      @Override
      public int getCosmeticsCount() {
         return this.cosmetics_.size();
      }

      @Override
      public EquippedCosmetic getCosmetics(int var1) {
         return this.cosmetics_.get(var1);
      }

      @Override
      public EquippedCosmeticOrBuilder getCosmeticsOrBuilder(int var1) {
         return this.cosmetics_.get(var1);
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
            var1.writeMessage(1, this.getEquipCondition());
         }

         for (int var2 = 0; var2 < this.cosmetics_.size(); var2++) {
            var1.writeMessage(2, this.cosmetics_.get(var2));
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
            var1 += CodedOutputStream.computeMessageSize(1, this.getEquipCondition());
         }

         for (int var2 = 0; var2 < this.cosmetics_.size(); var2++) {
            var1 += CodedOutputStream.computeMessageSize(2, this.cosmetics_.get(var2));
         }

         var1 += this.getUnknownFields().getSerializedSize();
         this.memoizedSize = var1;
         return var1;
      }

      @Override
      public boolean equals(Object var1) {
         if (var1 == this) {
            return true;
         } else if (!(var1 instanceof PlayerCosmeticsPushV2.ConditionalCosmetics)) {
            return super.equals(var1);
         } else {
            PlayerCosmeticsPushV2.ConditionalCosmetics var2 = (PlayerCosmeticsPushV2.ConditionalCosmetics)var1;
            if (this.hasEquipCondition() != var2.hasEquipCondition()) {
               return false;
            } else if (this.hasEquipCondition() && !this.getEquipCondition().equals(var2.getEquipCondition())) {
               return false;
            } else {
               return !this.getCosmeticsList().equals(var2.getCosmeticsList()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
         if (this.hasEquipCondition()) {
            var1 = 37 * var1 + 1;
            var1 = 53 * var1 + this.getEquipCondition().hashCode();
         }

         if (this.getCosmeticsCount() > 0) {
            var1 = 37 * var1 + 2;
            var1 = 53 * var1 + this.getCosmeticsList().hashCode();
         }

         var1 = 29 * var1 + this.getUnknownFields().hashCode();
         this.memoizedHashCode = var1;
         return var1;
      }

      public static PlayerCosmeticsPushV2.ConditionalCosmetics parseFrom(ByteBuffer var0) {
         return PARSER.parseFrom(var0);
      }

      public static PlayerCosmeticsPushV2.ConditionalCosmetics parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
         return PARSER.parseFrom(var0, var1);
      }

      public static PlayerCosmeticsPushV2.ConditionalCosmetics parseFrom(ByteString var0) {
         return PARSER.parseFrom(var0);
      }

      public static PlayerCosmeticsPushV2.ConditionalCosmetics parseFrom(ByteString var0, ExtensionRegistryLite var1) {
         return PARSER.parseFrom(var0, var1);
      }

      public static PlayerCosmeticsPushV2.ConditionalCosmetics parseFrom(byte[] var0) {
         return PARSER.parseFrom(var0);
      }

      public static PlayerCosmeticsPushV2.ConditionalCosmetics parseFrom(byte[] var0, ExtensionRegistryLite var1) {
         return PARSER.parseFrom(var0, var1);
      }

      public static PlayerCosmeticsPushV2.ConditionalCosmetics parseFrom(InputStream var0) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0);
      }

      public static PlayerCosmeticsPushV2.ConditionalCosmetics parseFrom(InputStream var0, ExtensionRegistryLite var1) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
      }

      public static PlayerCosmeticsPushV2.ConditionalCosmetics parseDelimitedFrom(InputStream var0) {
         return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
      }

      public static PlayerCosmeticsPushV2.ConditionalCosmetics parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
         return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
      }

      public static PlayerCosmeticsPushV2.ConditionalCosmetics parseFrom(CodedInputStream var0) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0);
      }

      public static PlayerCosmeticsPushV2.ConditionalCosmetics parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
         return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
      }

      public PlayerCosmeticsPushV2.ConditionalCosmetics.Builder newBuilderForType() {
         return newBuilder();
      }

      public static PlayerCosmeticsPushV2.ConditionalCosmetics.Builder newBuilder() {
         return DEFAULT_INSTANCE.toBuilder();
      }

      public static PlayerCosmeticsPushV2.ConditionalCosmetics.Builder newBuilder(PlayerCosmeticsPushV2.ConditionalCosmetics var0) {
         return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
      }

      public PlayerCosmeticsPushV2.ConditionalCosmetics.Builder toBuilder() {
         return this == DEFAULT_INSTANCE
            ? new PlayerCosmeticsPushV2.ConditionalCosmetics.Builder()
            : new PlayerCosmeticsPushV2.ConditionalCosmetics.Builder().mergeFrom(this);
      }

      protected PlayerCosmeticsPushV2.ConditionalCosmetics.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
         return new PlayerCosmeticsPushV2.ConditionalCosmetics.Builder(var1);
      }

      public static PlayerCosmeticsPushV2.ConditionalCosmetics getDefaultInstance() {
         return DEFAULT_INSTANCE;
      }

      public static Parser<PlayerCosmeticsPushV2.ConditionalCosmetics> parser() {
         return PARSER;
      }

      @Override
      public Parser<PlayerCosmeticsPushV2.ConditionalCosmetics> getParserForType() {
         return PARSER;
      }

      public PlayerCosmeticsPushV2.ConditionalCosmetics getDefaultInstanceForType() {
         return DEFAULT_INSTANCE;
      }

      public static final class Builder
         extends GeneratedMessageV3.Builder<PlayerCosmeticsPushV2.ConditionalCosmetics.Builder>
         implements PlayerCosmeticsPushV2.ConditionalCosmeticsOrBuilder {
         private int bitField0_;
         private EquipCondition equipCondition_;
         private SingleFieldBuilderV3<EquipCondition, EquipCondition.Builder, EquipConditionOrBuilder> equipConditionBuilder_;
         private List<EquippedCosmetic> cosmetics_ = Collections.emptyList();
         private RepeatedFieldBuilderV3<EquippedCosmetic, EquippedCosmetic.Builder, EquippedCosmeticOrBuilder> cosmeticsBuilder_;

         public static final Descriptors.Descriptor getDescriptor() {
            return PushProto.internal_static_lunarclient_websocket_cosmetic_v2_PlayerCosmeticsPushV2_ConditionalCosmetics_descriptor;
         }

         @Override
         protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PushProto.internal_static_lunarclient_websocket_cosmetic_v2_PlayerCosmeticsPushV2_ConditionalCosmetics_fieldAccessorTable
               .ensureFieldAccessorsInitialized(PlayerCosmeticsPushV2.ConditionalCosmetics.class, PlayerCosmeticsPushV2.ConditionalCosmetics.Builder.class);
         }

         private Builder() {
            this.maybeForceBuilderInitialization();
         }

         private Builder(GeneratedMessageV3.BuilderParent var1) {
            super(var1);
            this.maybeForceBuilderInitialization();
         }

         private void maybeForceBuilderInitialization() {
            if (PlayerCosmeticsPushV2.ConditionalCosmetics.alwaysUseFieldBuilders) {
               this.getEquipConditionFieldBuilder();
               this.getCosmeticsFieldBuilder();
            }
         }

         public PlayerCosmeticsPushV2.ConditionalCosmetics.Builder clear() {
            super.clear();
            this.bitField0_ = 0;
            this.equipCondition_ = null;
            if (this.equipConditionBuilder_ != null) {
               this.equipConditionBuilder_.dispose();
               this.equipConditionBuilder_ = null;
            }

            if (this.cosmeticsBuilder_ == null) {
               this.cosmetics_ = Collections.emptyList();
            } else {
               this.cosmetics_ = null;
               this.cosmeticsBuilder_.clear();
            }

            this.bitField0_ &= -3;
            return this;
         }

         @Override
         public Descriptors.Descriptor getDescriptorForType() {
            return PushProto.internal_static_lunarclient_websocket_cosmetic_v2_PlayerCosmeticsPushV2_ConditionalCosmetics_descriptor;
         }

         public PlayerCosmeticsPushV2.ConditionalCosmetics getDefaultInstanceForType() {
            return PlayerCosmeticsPushV2.ConditionalCosmetics.getDefaultInstance();
         }

         public PlayerCosmeticsPushV2.ConditionalCosmetics build() {
            PlayerCosmeticsPushV2.ConditionalCosmetics var1 = this.buildPartial();
            if (!var1.isInitialized()) {
               throw newUninitializedMessageException(var1);
            } else {
               return var1;
            }
         }

         public PlayerCosmeticsPushV2.ConditionalCosmetics buildPartial() {
            PlayerCosmeticsPushV2.ConditionalCosmetics var1 = new PlayerCosmeticsPushV2.ConditionalCosmetics(this);
            this.buildPartialRepeatedFields(var1);
            if (this.bitField0_ != 0) {
               this.buildPartial0(var1);
            }

            this.onBuilt();
            return var1;
         }

         private void buildPartialRepeatedFields(PlayerCosmeticsPushV2.ConditionalCosmetics var1) {
            if (this.cosmeticsBuilder_ == null) {
               if ((this.bitField0_ & 2) != 0) {
                  this.cosmetics_ = Collections.unmodifiableList(this.cosmetics_);
                  this.bitField0_ &= -3;
               }

               var1.cosmetics_ = this.cosmetics_;
            } else {
               var1.cosmetics_ = this.cosmeticsBuilder_.build();
            }
         }

         private void buildPartial0(PlayerCosmeticsPushV2.ConditionalCosmetics var1) {
            int var2 = this.bitField0_;
            byte var3 = 0;
            if ((var2 & 1) != 0) {
               var1.equipCondition_ = this.equipConditionBuilder_ == null ? this.equipCondition_ : this.equipConditionBuilder_.build();
               var3 |= 1;
            }

            PlayerCosmeticsPushV2.ConditionalCosmetics var4 = var1;
            var4.bitField0_ = var4.bitField0_ | var3;
         }

         public PlayerCosmeticsPushV2.ConditionalCosmetics.Builder clone() {
            return (PlayerCosmeticsPushV2.ConditionalCosmetics.Builder)super.clone();
         }

         public PlayerCosmeticsPushV2.ConditionalCosmetics.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
            return (PlayerCosmeticsPushV2.ConditionalCosmetics.Builder)super.setField(var1, var2);
         }

         public PlayerCosmeticsPushV2.ConditionalCosmetics.Builder clearField(Descriptors.FieldDescriptor var1) {
            return (PlayerCosmeticsPushV2.ConditionalCosmetics.Builder)super.clearField(var1);
         }

         public PlayerCosmeticsPushV2.ConditionalCosmetics.Builder clearOneof(Descriptors.OneofDescriptor var1) {
            return (PlayerCosmeticsPushV2.ConditionalCosmetics.Builder)super.clearOneof(var1);
         }

         public PlayerCosmeticsPushV2.ConditionalCosmetics.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
            return (PlayerCosmeticsPushV2.ConditionalCosmetics.Builder)super.setRepeatedField(var1, var2, var3);
         }

         public PlayerCosmeticsPushV2.ConditionalCosmetics.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
            return (PlayerCosmeticsPushV2.ConditionalCosmetics.Builder)super.addRepeatedField(var1, var2);
         }

         public PlayerCosmeticsPushV2.ConditionalCosmetics.Builder mergeFrom(Message var1) {
            if (var1 instanceof PlayerCosmeticsPushV2.ConditionalCosmetics) {
               return this.mergeFrom((PlayerCosmeticsPushV2.ConditionalCosmetics)var1);
            }

            super.mergeFrom(var1);
            return this;
         }

         public PlayerCosmeticsPushV2.ConditionalCosmetics.Builder mergeFrom(PlayerCosmeticsPushV2.ConditionalCosmetics var1) {
            if (var1 == PlayerCosmeticsPushV2.ConditionalCosmetics.getDefaultInstance()) {
               return this;
            }

            if (var1.hasEquipCondition()) {
               this.mergeEquipCondition(var1.getEquipCondition());
            }

            if (this.cosmeticsBuilder_ == null) {
               if (!var1.cosmetics_.isEmpty()) {
                  if (this.cosmetics_.isEmpty()) {
                     this.cosmetics_ = var1.cosmetics_;
                     this.bitField0_ &= -3;
                  } else {
                     this.ensureCosmeticsIsMutable();
                     this.cosmetics_.addAll(var1.cosmetics_);
                  }

                  this.onChanged();
               }
            } else if (!var1.cosmetics_.isEmpty()) {
               if (this.cosmeticsBuilder_.isEmpty()) {
                  this.cosmeticsBuilder_.dispose();
                  this.cosmeticsBuilder_ = null;
                  this.cosmetics_ = var1.cosmetics_;
                  this.bitField0_ &= -3;
                  this.cosmeticsBuilder_ = PlayerCosmeticsPushV2.ConditionalCosmetics.alwaysUseFieldBuilders ? this.getCosmeticsFieldBuilder() : null;
               } else {
                  this.cosmeticsBuilder_.addAllMessages(var1.cosmetics_);
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

         public PlayerCosmeticsPushV2.ConditionalCosmetics.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                        var1.readMessage(this.getEquipConditionFieldBuilder().getBuilder(), var2);
                        this.bitField0_ |= 1;
                        break;
                     case 18:
                        EquippedCosmetic var5 = var1.readMessage(EquippedCosmetic.parser(), var2);
                        if (this.cosmeticsBuilder_ == null) {
                           this.ensureCosmeticsIsMutable();
                           this.cosmetics_.add(var5);
                        } else {
                           this.cosmeticsBuilder_.addMessage(var5);
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
         public boolean hasEquipCondition() {
            return (this.bitField0_ & 1) != 0;
         }

         @Override
         public EquipCondition getEquipCondition() {
            if (this.equipConditionBuilder_ == null) {
               return this.equipCondition_ == null ? EquipCondition.getDefaultInstance() : this.equipCondition_;
            } else {
               return this.equipConditionBuilder_.getMessage();
            }
         }

         public PlayerCosmeticsPushV2.ConditionalCosmetics.Builder setEquipCondition(EquipCondition var1) {
            if (this.equipConditionBuilder_ == null) {
               if (var1 == null) {
                  throw new NullPointerException();
               }

               this.equipCondition_ = var1;
            } else {
               this.equipConditionBuilder_.setMessage(var1);
            }

            this.bitField0_ |= 1;
            this.onChanged();
            return this;
         }

         public PlayerCosmeticsPushV2.ConditionalCosmetics.Builder setEquipCondition(EquipCondition.Builder var1) {
            if (this.equipConditionBuilder_ == null) {
               this.equipCondition_ = var1.build();
            } else {
               this.equipConditionBuilder_.setMessage(var1.build());
            }

            this.bitField0_ |= 1;
            this.onChanged();
            return this;
         }

         public PlayerCosmeticsPushV2.ConditionalCosmetics.Builder mergeEquipCondition(EquipCondition var1) {
            if (this.equipConditionBuilder_ == null) {
               if ((this.bitField0_ & 1) != 0 && this.equipCondition_ != null && this.equipCondition_ != EquipCondition.getDefaultInstance()) {
                  this.getEquipConditionBuilder().mergeFrom(var1);
               } else {
                  this.equipCondition_ = var1;
               }
            } else {
               this.equipConditionBuilder_.mergeFrom(var1);
            }

            if (this.equipCondition_ != null) {
               this.bitField0_ |= 1;
               this.onChanged();
            }

            return this;
         }

         public PlayerCosmeticsPushV2.ConditionalCosmetics.Builder clearEquipCondition() {
            this.bitField0_ &= -2;
            this.equipCondition_ = null;
            if (this.equipConditionBuilder_ != null) {
               this.equipConditionBuilder_.dispose();
               this.equipConditionBuilder_ = null;
            }

            this.onChanged();
            return this;
         }

         public EquipCondition.Builder getEquipConditionBuilder() {
            this.bitField0_ |= 1;
            this.onChanged();
            return this.getEquipConditionFieldBuilder().getBuilder();
         }

         @Override
         public EquipConditionOrBuilder getEquipConditionOrBuilder() {
            if (this.equipConditionBuilder_ != null) {
               return this.equipConditionBuilder_.getMessageOrBuilder();
            } else {
               return this.equipCondition_ == null ? EquipCondition.getDefaultInstance() : this.equipCondition_;
            }
         }

         private SingleFieldBuilderV3<EquipCondition, EquipCondition.Builder, EquipConditionOrBuilder> getEquipConditionFieldBuilder() {
            if (this.equipConditionBuilder_ == null) {
               this.equipConditionBuilder_ = new SingleFieldBuilderV3<>(this.getEquipCondition(), this.getParentForChildren(), this.isClean());
               this.equipCondition_ = null;
            }

            return this.equipConditionBuilder_;
         }

         private void ensureCosmeticsIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
               this.cosmetics_ = new ArrayList<>(this.cosmetics_);
               this.bitField0_ |= 2;
            }
         }

         @Override
         public List<EquippedCosmetic> getCosmeticsList() {
            return this.cosmeticsBuilder_ == null ? Collections.unmodifiableList(this.cosmetics_) : this.cosmeticsBuilder_.getMessageList();
         }

         @Override
         public int getCosmeticsCount() {
            return this.cosmeticsBuilder_ == null ? this.cosmetics_.size() : this.cosmeticsBuilder_.getCount();
         }

         @Override
         public EquippedCosmetic getCosmetics(int var1) {
            return this.cosmeticsBuilder_ == null ? this.cosmetics_.get(var1) : this.cosmeticsBuilder_.getMessage(var1);
         }

         public PlayerCosmeticsPushV2.ConditionalCosmetics.Builder setCosmetics(int var1, EquippedCosmetic var2) {
            if (this.cosmeticsBuilder_ == null) {
               if (var2 == null) {
                  throw new NullPointerException();
               }

               this.ensureCosmeticsIsMutable();
               this.cosmetics_.set(var1, var2);
               this.onChanged();
            } else {
               this.cosmeticsBuilder_.setMessage(var1, var2);
            }

            return this;
         }

         public PlayerCosmeticsPushV2.ConditionalCosmetics.Builder setCosmetics(int var1, EquippedCosmetic.Builder var2) {
            if (this.cosmeticsBuilder_ == null) {
               this.ensureCosmeticsIsMutable();
               this.cosmetics_.set(var1, var2.build());
               this.onChanged();
            } else {
               this.cosmeticsBuilder_.setMessage(var1, var2.build());
            }

            return this;
         }

         public PlayerCosmeticsPushV2.ConditionalCosmetics.Builder addCosmetics(EquippedCosmetic var1) {
            if (this.cosmeticsBuilder_ == null) {
               if (var1 == null) {
                  throw new NullPointerException();
               }

               this.ensureCosmeticsIsMutable();
               this.cosmetics_.add(var1);
               this.onChanged();
            } else {
               this.cosmeticsBuilder_.addMessage(var1);
            }

            return this;
         }

         public PlayerCosmeticsPushV2.ConditionalCosmetics.Builder addCosmetics(int var1, EquippedCosmetic var2) {
            if (this.cosmeticsBuilder_ == null) {
               if (var2 == null) {
                  throw new NullPointerException();
               }

               this.ensureCosmeticsIsMutable();
               this.cosmetics_.add(var1, var2);
               this.onChanged();
            } else {
               this.cosmeticsBuilder_.addMessage(var1, var2);
            }

            return this;
         }

         public PlayerCosmeticsPushV2.ConditionalCosmetics.Builder addCosmetics(EquippedCosmetic.Builder var1) {
            if (this.cosmeticsBuilder_ == null) {
               this.ensureCosmeticsIsMutable();
               this.cosmetics_.add(var1.build());
               this.onChanged();
            } else {
               this.cosmeticsBuilder_.addMessage(var1.build());
            }

            return this;
         }

         public PlayerCosmeticsPushV2.ConditionalCosmetics.Builder addCosmetics(int var1, EquippedCosmetic.Builder var2) {
            if (this.cosmeticsBuilder_ == null) {
               this.ensureCosmeticsIsMutable();
               this.cosmetics_.add(var1, var2.build());
               this.onChanged();
            } else {
               this.cosmeticsBuilder_.addMessage(var1, var2.build());
            }

            return this;
         }

         public PlayerCosmeticsPushV2.ConditionalCosmetics.Builder addAllCosmetics(Iterable<? extends EquippedCosmetic> var1) {
            if (this.cosmeticsBuilder_ == null) {
               this.ensureCosmeticsIsMutable();
               AbstractMessageLite.Builder.addAll(var1, this.cosmetics_);
               this.onChanged();
            } else {
               this.cosmeticsBuilder_.addAllMessages(var1);
            }

            return this;
         }

         public PlayerCosmeticsPushV2.ConditionalCosmetics.Builder clearCosmetics() {
            if (this.cosmeticsBuilder_ == null) {
               this.cosmetics_ = Collections.emptyList();
               this.bitField0_ &= -3;
               this.onChanged();
            } else {
               this.cosmeticsBuilder_.clear();
            }

            return this;
         }

         public PlayerCosmeticsPushV2.ConditionalCosmetics.Builder removeCosmetics(int var1) {
            if (this.cosmeticsBuilder_ == null) {
               this.ensureCosmeticsIsMutable();
               this.cosmetics_.remove(var1);
               this.onChanged();
            } else {
               this.cosmeticsBuilder_.remove(var1);
            }

            return this;
         }

         public EquippedCosmetic.Builder getCosmeticsBuilder(int var1) {
            return this.getCosmeticsFieldBuilder().getBuilder(var1);
         }

         @Override
         public EquippedCosmeticOrBuilder getCosmeticsOrBuilder(int var1) {
            return this.cosmeticsBuilder_ == null ? this.cosmetics_.get(var1) : this.cosmeticsBuilder_.getMessageOrBuilder(var1);
         }

         @Override
         public List<? extends EquippedCosmeticOrBuilder> getCosmeticsOrBuilderList() {
            return this.cosmeticsBuilder_ != null ? this.cosmeticsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.cosmetics_);
         }

         public EquippedCosmetic.Builder addCosmeticsBuilder() {
            return this.getCosmeticsFieldBuilder().addBuilder(EquippedCosmetic.getDefaultInstance());
         }

         public EquippedCosmetic.Builder addCosmeticsBuilder(int var1) {
            return this.getCosmeticsFieldBuilder().addBuilder(var1, EquippedCosmetic.getDefaultInstance());
         }

         public List<EquippedCosmetic.Builder> getCosmeticsBuilderList() {
            return this.getCosmeticsFieldBuilder().getBuilderList();
         }

         private RepeatedFieldBuilderV3<EquippedCosmetic, EquippedCosmetic.Builder, EquippedCosmeticOrBuilder> getCosmeticsFieldBuilder() {
            if (this.cosmeticsBuilder_ == null) {
               this.cosmeticsBuilder_ = new RepeatedFieldBuilderV3<>(this.cosmetics_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
               this.cosmetics_ = null;
            }

            return this.cosmeticsBuilder_;
         }

         public final PlayerCosmeticsPushV2.ConditionalCosmetics.Builder setUnknownFields(UnknownFieldSet var1) {
            return (PlayerCosmeticsPushV2.ConditionalCosmetics.Builder)super.setUnknownFields(var1);
         }

         public final PlayerCosmeticsPushV2.ConditionalCosmetics.Builder mergeUnknownFields(UnknownFieldSet var1) {
            return (PlayerCosmeticsPushV2.ConditionalCosmetics.Builder)super.mergeUnknownFields(var1);
         }
      }
   }

   public interface ConditionalCosmeticsOrBuilder extends MessageOrBuilder {
      boolean hasEquipCondition();

      EquipCondition getEquipCondition();

      EquipConditionOrBuilder getEquipConditionOrBuilder();

      List<EquippedCosmetic> getCosmeticsList();

      EquippedCosmetic getCosmetics(int var1);

      int getCosmeticsCount();

      List<? extends EquippedCosmeticOrBuilder> getCosmeticsOrBuilderList();

      EquippedCosmeticOrBuilder getCosmeticsOrBuilder(int var1);
   }
}
