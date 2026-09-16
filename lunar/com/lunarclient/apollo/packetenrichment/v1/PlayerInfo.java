package com.lunarclient.apollo.packetenrichment.v1;

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
import com.lunarclient.apollo.common.v1.PlayerLocation;
import com.lunarclient.apollo.common.v1.PlayerLocationOrBuilder;
import com.lunarclient.apollo.common.v1.Uuid;
import com.lunarclient.apollo.common.v1.UuidOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class PlayerInfo extends GeneratedMessageV3 implements PlayerInfoOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int PLAYER_UUID_FIELD_NUMBER = 1;
   private Uuid playerUuid_;
   public static final int LOCATION_FIELD_NUMBER = 2;
   private PlayerLocation location_;
   public static final int SNEAKING_FIELD_NUMBER = 3;
   private boolean sneaking_ = false;
   public static final int SPRINTING_FIELD_NUMBER = 4;
   private boolean sprinting_ = false;
   public static final int JUMPING_FIELD_NUMBER = 5;
   private boolean jumping_ = false;
   public static final int FORWARD_SPEED_FIELD_NUMBER = 6;
   private float forwardSpeed_ = 0.0F;
   public static final int STRAFE_SPEED_FIELD_NUMBER = 7;
   private float strafeSpeed_ = 0.0F;
   private byte memoizedIsInitialized = -1;
   private static final PlayerInfo DEFAULT_INSTANCE = new PlayerInfo();
   private static final Parser<PlayerInfo> PARSER = new AbstractParser<PlayerInfo>() {
      public PlayerInfo parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         PlayerInfo.Builder var3 = PlayerInfo.newBuilder();

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

   private PlayerInfo(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private PlayerInfo() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new PlayerInfo();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return PlayerProto.internal_static_lunarclient_apollo_packetenrichment_v1_PlayerInfo_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return PlayerProto.internal_static_lunarclient_apollo_packetenrichment_v1_PlayerInfo_fieldAccessorTable
         .ensureFieldAccessorsInitialized(PlayerInfo.class, PlayerInfo.Builder.class);
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
   public boolean hasLocation() {
      return (this.bitField0_ & 2) != 0;
   }

   @Override
   public PlayerLocation getLocation() {
      return this.location_ == null ? PlayerLocation.getDefaultInstance() : this.location_;
   }

   @Override
   public PlayerLocationOrBuilder getLocationOrBuilder() {
      return this.location_ == null ? PlayerLocation.getDefaultInstance() : this.location_;
   }

   @Override
   public boolean getSneaking() {
      return this.sneaking_;
   }

   @Override
   public boolean getSprinting() {
      return this.sprinting_;
   }

   @Override
   public boolean getJumping() {
      return this.jumping_;
   }

   @Override
   public float getForwardSpeed() {
      return this.forwardSpeed_;
   }

   @Override
   public float getStrafeSpeed() {
      return this.strafeSpeed_;
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
         var1.writeMessage(2, this.getLocation());
      }

      if (this.sneaking_) {
         var1.writeBool(3, this.sneaking_);
      }

      if (this.sprinting_) {
         var1.writeBool(4, this.sprinting_);
      }

      if (this.jumping_) {
         var1.writeBool(5, this.jumping_);
      }

      if (Float.floatToRawIntBits(this.forwardSpeed_) != 0) {
         var1.writeFloat(6, this.forwardSpeed_);
      }

      if (Float.floatToRawIntBits(this.strafeSpeed_) != 0) {
         var1.writeFloat(7, this.strafeSpeed_);
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
         var1 += CodedOutputStream.computeMessageSize(2, this.getLocation());
      }

      if (this.sneaking_) {
         var1 += CodedOutputStream.computeBoolSize(3, this.sneaking_);
      }

      if (this.sprinting_) {
         var1 += CodedOutputStream.computeBoolSize(4, this.sprinting_);
      }

      if (this.jumping_) {
         var1 += CodedOutputStream.computeBoolSize(5, this.jumping_);
      }

      if (Float.floatToRawIntBits(this.forwardSpeed_) != 0) {
         var1 += CodedOutputStream.computeFloatSize(6, this.forwardSpeed_);
      }

      if (Float.floatToRawIntBits(this.strafeSpeed_) != 0) {
         var1 += CodedOutputStream.computeFloatSize(7, this.strafeSpeed_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof PlayerInfo)) {
         return super.equals(var1);
      } else {
         PlayerInfo var2 = (PlayerInfo)var1;
         if (this.hasPlayerUuid() != var2.hasPlayerUuid()) {
            return false;
         } else if (this.hasPlayerUuid() && !this.getPlayerUuid().equals(var2.getPlayerUuid())) {
            return false;
         } else if (this.hasLocation() != var2.hasLocation()) {
            return false;
         } else if (this.hasLocation() && !this.getLocation().equals(var2.getLocation())) {
            return false;
         } else if (this.getSneaking() != var2.getSneaking()) {
            return false;
         } else if (this.getSprinting() != var2.getSprinting()) {
            return false;
         } else if (this.getJumping() != var2.getJumping()) {
            return false;
         } else if (Float.floatToIntBits(this.getForwardSpeed()) != Float.floatToIntBits(var2.getForwardSpeed())) {
            return false;
         } else {
            return Float.floatToIntBits(this.getStrafeSpeed()) != Float.floatToIntBits(var2.getStrafeSpeed())
               ? false
               : this.getUnknownFields().equals(var2.getUnknownFields());
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

      if (this.hasLocation()) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getLocation().hashCode();
      }

      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + Internal.hashBoolean(this.getSneaking());
      var1 = 37 * var1 + 4;
      var1 = 53 * var1 + Internal.hashBoolean(this.getSprinting());
      var1 = 37 * var1 + 5;
      var1 = 53 * var1 + Internal.hashBoolean(this.getJumping());
      var1 = 37 * var1 + 6;
      var1 = 53 * var1 + Float.floatToIntBits(this.getForwardSpeed());
      var1 = 37 * var1 + 7;
      var1 = 53 * var1 + Float.floatToIntBits(this.getStrafeSpeed());
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static PlayerInfo parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static PlayerInfo parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static PlayerInfo parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static PlayerInfo parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static PlayerInfo parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static PlayerInfo parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static PlayerInfo parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PlayerInfo parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PlayerInfo parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static PlayerInfo parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static PlayerInfo parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PlayerInfo parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public PlayerInfo.Builder newBuilderForType() {
      return newBuilder();
   }

   public static PlayerInfo.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static PlayerInfo.Builder newBuilder(PlayerInfo var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public PlayerInfo.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new PlayerInfo.Builder() : new PlayerInfo.Builder().mergeFrom(this);
   }

   protected PlayerInfo.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new PlayerInfo.Builder(var1);
   }

   public static PlayerInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<PlayerInfo> parser() {
      return PARSER;
   }

   @Override
   public Parser<PlayerInfo> getParserForType() {
      return PARSER;
   }

   public PlayerInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<PlayerInfo.Builder> implements PlayerInfoOrBuilder {
      private int bitField0_;
      private Uuid playerUuid_;
      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> playerUuidBuilder_;
      private PlayerLocation location_;
      private SingleFieldBuilderV3<PlayerLocation, PlayerLocation.Builder, PlayerLocationOrBuilder> locationBuilder_;
      private boolean sneaking_;
      private boolean sprinting_;
      private boolean jumping_;
      private float forwardSpeed_;
      private float strafeSpeed_;

      public static final Descriptors.Descriptor getDescriptor() {
         return PlayerProto.internal_static_lunarclient_apollo_packetenrichment_v1_PlayerInfo_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PlayerProto.internal_static_lunarclient_apollo_packetenrichment_v1_PlayerInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(PlayerInfo.class, PlayerInfo.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (PlayerInfo.alwaysUseFieldBuilders) {
            this.getPlayerUuidFieldBuilder();
            this.getLocationFieldBuilder();
         }
      }

      public PlayerInfo.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.playerUuid_ = null;
         if (this.playerUuidBuilder_ != null) {
            this.playerUuidBuilder_.dispose();
            this.playerUuidBuilder_ = null;
         }

         this.location_ = null;
         if (this.locationBuilder_ != null) {
            this.locationBuilder_.dispose();
            this.locationBuilder_ = null;
         }

         this.sneaking_ = false;
         this.sprinting_ = false;
         this.jumping_ = false;
         this.forwardSpeed_ = 0.0F;
         this.strafeSpeed_ = 0.0F;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return PlayerProto.internal_static_lunarclient_apollo_packetenrichment_v1_PlayerInfo_descriptor;
      }

      public PlayerInfo getDefaultInstanceForType() {
         return PlayerInfo.getDefaultInstance();
      }

      public PlayerInfo build() {
         PlayerInfo var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public PlayerInfo buildPartial() {
         PlayerInfo var1 = new PlayerInfo(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(PlayerInfo var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.playerUuid_ = this.playerUuidBuilder_ == null ? this.playerUuid_ : this.playerUuidBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.location_ = this.locationBuilder_ == null ? this.location_ : this.locationBuilder_.build();
            var3 |= 2;
         }

         if ((var2 & 4) != 0) {
            var1.sneaking_ = this.sneaking_;
         }

         if ((var2 & 8) != 0) {
            var1.sprinting_ = this.sprinting_;
         }

         if ((var2 & 16) != 0) {
            var1.jumping_ = this.jumping_;
         }

         if ((var2 & 32) != 0) {
            var1.forwardSpeed_ = this.forwardSpeed_;
         }

         if ((var2 & 64) != 0) {
            var1.strafeSpeed_ = this.strafeSpeed_;
         }

         PlayerInfo var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public PlayerInfo.Builder clone() {
         return (PlayerInfo.Builder)super.clone();
      }

      public PlayerInfo.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (PlayerInfo.Builder)super.setField(var1, var2);
      }

      public PlayerInfo.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (PlayerInfo.Builder)super.clearField(var1);
      }

      public PlayerInfo.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (PlayerInfo.Builder)super.clearOneof(var1);
      }

      public PlayerInfo.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (PlayerInfo.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public PlayerInfo.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (PlayerInfo.Builder)super.addRepeatedField(var1, var2);
      }

      public PlayerInfo.Builder mergeFrom(Message var1) {
         if (var1 instanceof PlayerInfo) {
            return this.mergeFrom((PlayerInfo)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public PlayerInfo.Builder mergeFrom(PlayerInfo var1) {
         if (var1 == PlayerInfo.getDefaultInstance()) {
            return this;
         }

         if (var1.hasPlayerUuid()) {
            this.mergePlayerUuid(var1.getPlayerUuid());
         }

         if (var1.hasLocation()) {
            this.mergeLocation(var1.getLocation());
         }

         if (var1.getSneaking()) {
            this.setSneaking(var1.getSneaking());
         }

         if (var1.getSprinting()) {
            this.setSprinting(var1.getSprinting());
         }

         if (var1.getJumping()) {
            this.setJumping(var1.getJumping());
         }

         if (var1.getForwardSpeed() != 0.0F) {
            this.setForwardSpeed(var1.getForwardSpeed());
         }

         if (var1.getStrafeSpeed() != 0.0F) {
            this.setStrafeSpeed(var1.getStrafeSpeed());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public PlayerInfo.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getLocationFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 2;
                     break;
                  case 24:
                     this.sneaking_ = var1.readBool();
                     this.bitField0_ |= 4;
                     break;
                  case 32:
                     this.sprinting_ = var1.readBool();
                     this.bitField0_ |= 8;
                     break;
                  case 40:
                     this.jumping_ = var1.readBool();
                     this.bitField0_ |= 16;
                     break;
                  case 53:
                     this.forwardSpeed_ = var1.readFloat();
                     this.bitField0_ |= 32;
                     break;
                  case 61:
                     this.strafeSpeed_ = var1.readFloat();
                     this.bitField0_ |= 64;
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

      public PlayerInfo.Builder setPlayerUuid(Uuid var1) {
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

      public PlayerInfo.Builder setPlayerUuid(Uuid.Builder var1) {
         if (this.playerUuidBuilder_ == null) {
            this.playerUuid_ = var1.build();
         } else {
            this.playerUuidBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public PlayerInfo.Builder mergePlayerUuid(Uuid var1) {
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

      public PlayerInfo.Builder clearPlayerUuid() {
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
      public boolean hasLocation() {
         return (this.bitField0_ & 2) != 0;
      }

      @Override
      public PlayerLocation getLocation() {
         if (this.locationBuilder_ == null) {
            return this.location_ == null ? PlayerLocation.getDefaultInstance() : this.location_;
         } else {
            return this.locationBuilder_.getMessage();
         }
      }

      public PlayerInfo.Builder setLocation(PlayerLocation var1) {
         if (this.locationBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.location_ = var1;
         } else {
            this.locationBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public PlayerInfo.Builder setLocation(PlayerLocation.Builder var1) {
         if (this.locationBuilder_ == null) {
            this.location_ = var1.build();
         } else {
            this.locationBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public PlayerInfo.Builder mergeLocation(PlayerLocation var1) {
         if (this.locationBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0 && this.location_ != null && this.location_ != PlayerLocation.getDefaultInstance()) {
               this.getLocationBuilder().mergeFrom(var1);
            } else {
               this.location_ = var1;
            }
         } else {
            this.locationBuilder_.mergeFrom(var1);
         }

         if (this.location_ != null) {
            this.bitField0_ |= 2;
            this.onChanged();
         }

         return this;
      }

      public PlayerInfo.Builder clearLocation() {
         this.bitField0_ &= -3;
         this.location_ = null;
         if (this.locationBuilder_ != null) {
            this.locationBuilder_.dispose();
            this.locationBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public PlayerLocation.Builder getLocationBuilder() {
         this.bitField0_ |= 2;
         this.onChanged();
         return this.getLocationFieldBuilder().getBuilder();
      }

      @Override
      public PlayerLocationOrBuilder getLocationOrBuilder() {
         if (this.locationBuilder_ != null) {
            return this.locationBuilder_.getMessageOrBuilder();
         } else {
            return this.location_ == null ? PlayerLocation.getDefaultInstance() : this.location_;
         }
      }

      private SingleFieldBuilderV3<PlayerLocation, PlayerLocation.Builder, PlayerLocationOrBuilder> getLocationFieldBuilder() {
         if (this.locationBuilder_ == null) {
            this.locationBuilder_ = new SingleFieldBuilderV3<>(this.getLocation(), this.getParentForChildren(), this.isClean());
            this.location_ = null;
         }

         return this.locationBuilder_;
      }

      @Override
      public boolean getSneaking() {
         return this.sneaking_;
      }

      public PlayerInfo.Builder setSneaking(boolean var1) {
         this.sneaking_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public PlayerInfo.Builder clearSneaking() {
         this.bitField0_ &= -5;
         this.sneaking_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public boolean getSprinting() {
         return this.sprinting_;
      }

      public PlayerInfo.Builder setSprinting(boolean var1) {
         this.sprinting_ = var1;
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public PlayerInfo.Builder clearSprinting() {
         this.bitField0_ &= -9;
         this.sprinting_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public boolean getJumping() {
         return this.jumping_;
      }

      public PlayerInfo.Builder setJumping(boolean var1) {
         this.jumping_ = var1;
         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      public PlayerInfo.Builder clearJumping() {
         this.bitField0_ &= -17;
         this.jumping_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public float getForwardSpeed() {
         return this.forwardSpeed_;
      }

      public PlayerInfo.Builder setForwardSpeed(float var1) {
         this.forwardSpeed_ = var1;
         this.bitField0_ |= 32;
         this.onChanged();
         return this;
      }

      public PlayerInfo.Builder clearForwardSpeed() {
         this.bitField0_ &= -33;
         this.forwardSpeed_ = 0.0F;
         this.onChanged();
         return this;
      }

      @Override
      public float getStrafeSpeed() {
         return this.strafeSpeed_;
      }

      public PlayerInfo.Builder setStrafeSpeed(float var1) {
         this.strafeSpeed_ = var1;
         this.bitField0_ |= 64;
         this.onChanged();
         return this;
      }

      public PlayerInfo.Builder clearStrafeSpeed() {
         this.bitField0_ &= -65;
         this.strafeSpeed_ = 0.0F;
         this.onChanged();
         return this;
      }

      public final PlayerInfo.Builder setUnknownFields(UnknownFieldSet var1) {
         return (PlayerInfo.Builder)super.setUnknownFields(var1);
      }

      public final PlayerInfo.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (PlayerInfo.Builder)super.mergeUnknownFields(var1);
      }
   }
}
