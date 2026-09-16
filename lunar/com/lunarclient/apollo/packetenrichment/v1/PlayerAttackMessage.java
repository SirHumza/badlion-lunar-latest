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
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class PlayerAttackMessage extends GeneratedMessageV3 implements PlayerAttackMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int PACKET_INFO_FIELD_NUMBER = 1;
   private PacketInfo packetInfo_;
   public static final int TARGET_INFO_FIELD_NUMBER = 2;
   private PlayerInfo targetInfo_;
   public static final int ATTACKER_INFO_FIELD_NUMBER = 3;
   private PlayerInfo attackerInfo_;
   public static final int DISTANCE_FIELD_NUMBER = 4;
   private double distance_ = 0.0;
   private byte memoizedIsInitialized = -1;
   private static final PlayerAttackMessage DEFAULT_INSTANCE = new PlayerAttackMessage();
   private static final Parser<PlayerAttackMessage> PARSER = new AbstractParser<PlayerAttackMessage>() {
      public PlayerAttackMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         PlayerAttackMessage.Builder var3 = PlayerAttackMessage.newBuilder();

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

   private PlayerAttackMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private PlayerAttackMessage() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new PlayerAttackMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return MeleeProto.internal_static_lunarclient_apollo_packetenrichment_v1_PlayerAttackMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return MeleeProto.internal_static_lunarclient_apollo_packetenrichment_v1_PlayerAttackMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(PlayerAttackMessage.class, PlayerAttackMessage.Builder.class);
   }

   @Override
   public boolean hasPacketInfo() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public PacketInfo getPacketInfo() {
      return this.packetInfo_ == null ? PacketInfo.getDefaultInstance() : this.packetInfo_;
   }

   @Override
   public PacketInfoOrBuilder getPacketInfoOrBuilder() {
      return this.packetInfo_ == null ? PacketInfo.getDefaultInstance() : this.packetInfo_;
   }

   @Override
   public boolean hasTargetInfo() {
      return (this.bitField0_ & 2) != 0;
   }

   @Override
   public PlayerInfo getTargetInfo() {
      return this.targetInfo_ == null ? PlayerInfo.getDefaultInstance() : this.targetInfo_;
   }

   @Override
   public PlayerInfoOrBuilder getTargetInfoOrBuilder() {
      return this.targetInfo_ == null ? PlayerInfo.getDefaultInstance() : this.targetInfo_;
   }

   @Override
   public boolean hasAttackerInfo() {
      return (this.bitField0_ & 4) != 0;
   }

   @Override
   public PlayerInfo getAttackerInfo() {
      return this.attackerInfo_ == null ? PlayerInfo.getDefaultInstance() : this.attackerInfo_;
   }

   @Override
   public PlayerInfoOrBuilder getAttackerInfoOrBuilder() {
      return this.attackerInfo_ == null ? PlayerInfo.getDefaultInstance() : this.attackerInfo_;
   }

   @Override
   public double getDistance() {
      return this.distance_;
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
         var1.writeMessage(1, this.getPacketInfo());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1.writeMessage(2, this.getTargetInfo());
      }

      if ((this.bitField0_ & 4) != 0) {
         var1.writeMessage(3, this.getAttackerInfo());
      }

      if (Double.doubleToRawLongBits(this.distance_) != 0L) {
         var1.writeDouble(4, this.distance_);
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
         var1 += CodedOutputStream.computeMessageSize(1, this.getPacketInfo());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1 += CodedOutputStream.computeMessageSize(2, this.getTargetInfo());
      }

      if ((this.bitField0_ & 4) != 0) {
         var1 += CodedOutputStream.computeMessageSize(3, this.getAttackerInfo());
      }

      if (Double.doubleToRawLongBits(this.distance_) != 0L) {
         var1 += CodedOutputStream.computeDoubleSize(4, this.distance_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof PlayerAttackMessage)) {
         return super.equals(var1);
      } else {
         PlayerAttackMessage var2 = (PlayerAttackMessage)var1;
         if (this.hasPacketInfo() != var2.hasPacketInfo()) {
            return false;
         } else if (this.hasPacketInfo() && !this.getPacketInfo().equals(var2.getPacketInfo())) {
            return false;
         } else if (this.hasTargetInfo() != var2.hasTargetInfo()) {
            return false;
         } else if (this.hasTargetInfo() && !this.getTargetInfo().equals(var2.getTargetInfo())) {
            return false;
         } else if (this.hasAttackerInfo() != var2.hasAttackerInfo()) {
            return false;
         } else if (this.hasAttackerInfo() && !this.getAttackerInfo().equals(var2.getAttackerInfo())) {
            return false;
         } else {
            return Double.doubleToLongBits(this.getDistance()) != Double.doubleToLongBits(var2.getDistance())
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
      if (this.hasPacketInfo()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getPacketInfo().hashCode();
      }

      if (this.hasTargetInfo()) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getTargetInfo().hashCode();
      }

      if (this.hasAttackerInfo()) {
         var1 = 37 * var1 + 3;
         var1 = 53 * var1 + this.getAttackerInfo().hashCode();
      }

      var1 = 37 * var1 + 4;
      var1 = 53 * var1 + Internal.hashLong(Double.doubleToLongBits(this.getDistance()));
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static PlayerAttackMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static PlayerAttackMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static PlayerAttackMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static PlayerAttackMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static PlayerAttackMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static PlayerAttackMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static PlayerAttackMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PlayerAttackMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PlayerAttackMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static PlayerAttackMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static PlayerAttackMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PlayerAttackMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public PlayerAttackMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static PlayerAttackMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static PlayerAttackMessage.Builder newBuilder(PlayerAttackMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public PlayerAttackMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new PlayerAttackMessage.Builder() : new PlayerAttackMessage.Builder().mergeFrom(this);
   }

   protected PlayerAttackMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new PlayerAttackMessage.Builder(var1);
   }

   public static PlayerAttackMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<PlayerAttackMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<PlayerAttackMessage> getParserForType() {
      return PARSER;
   }

   public PlayerAttackMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<PlayerAttackMessage.Builder> implements PlayerAttackMessageOrBuilder {
      private int bitField0_;
      private PacketInfo packetInfo_;
      private SingleFieldBuilderV3<PacketInfo, PacketInfo.Builder, PacketInfoOrBuilder> packetInfoBuilder_;
      private PlayerInfo targetInfo_;
      private SingleFieldBuilderV3<PlayerInfo, PlayerInfo.Builder, PlayerInfoOrBuilder> targetInfoBuilder_;
      private PlayerInfo attackerInfo_;
      private SingleFieldBuilderV3<PlayerInfo, PlayerInfo.Builder, PlayerInfoOrBuilder> attackerInfoBuilder_;
      private double distance_;

      public static final Descriptors.Descriptor getDescriptor() {
         return MeleeProto.internal_static_lunarclient_apollo_packetenrichment_v1_PlayerAttackMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MeleeProto.internal_static_lunarclient_apollo_packetenrichment_v1_PlayerAttackMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(PlayerAttackMessage.class, PlayerAttackMessage.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (PlayerAttackMessage.alwaysUseFieldBuilders) {
            this.getPacketInfoFieldBuilder();
            this.getTargetInfoFieldBuilder();
            this.getAttackerInfoFieldBuilder();
         }
      }

      public PlayerAttackMessage.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.packetInfo_ = null;
         if (this.packetInfoBuilder_ != null) {
            this.packetInfoBuilder_.dispose();
            this.packetInfoBuilder_ = null;
         }

         this.targetInfo_ = null;
         if (this.targetInfoBuilder_ != null) {
            this.targetInfoBuilder_.dispose();
            this.targetInfoBuilder_ = null;
         }

         this.attackerInfo_ = null;
         if (this.attackerInfoBuilder_ != null) {
            this.attackerInfoBuilder_.dispose();
            this.attackerInfoBuilder_ = null;
         }

         this.distance_ = 0.0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return MeleeProto.internal_static_lunarclient_apollo_packetenrichment_v1_PlayerAttackMessage_descriptor;
      }

      public PlayerAttackMessage getDefaultInstanceForType() {
         return PlayerAttackMessage.getDefaultInstance();
      }

      public PlayerAttackMessage build() {
         PlayerAttackMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public PlayerAttackMessage buildPartial() {
         PlayerAttackMessage var1 = new PlayerAttackMessage(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(PlayerAttackMessage var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.packetInfo_ = this.packetInfoBuilder_ == null ? this.packetInfo_ : this.packetInfoBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.targetInfo_ = this.targetInfoBuilder_ == null ? this.targetInfo_ : this.targetInfoBuilder_.build();
            var3 |= 2;
         }

         if ((var2 & 4) != 0) {
            var1.attackerInfo_ = this.attackerInfoBuilder_ == null ? this.attackerInfo_ : this.attackerInfoBuilder_.build();
            var3 |= 4;
         }

         if ((var2 & 8) != 0) {
            var1.distance_ = this.distance_;
         }

         PlayerAttackMessage var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public PlayerAttackMessage.Builder clone() {
         return (PlayerAttackMessage.Builder)super.clone();
      }

      public PlayerAttackMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (PlayerAttackMessage.Builder)super.setField(var1, var2);
      }

      public PlayerAttackMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (PlayerAttackMessage.Builder)super.clearField(var1);
      }

      public PlayerAttackMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (PlayerAttackMessage.Builder)super.clearOneof(var1);
      }

      public PlayerAttackMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (PlayerAttackMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public PlayerAttackMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (PlayerAttackMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public PlayerAttackMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof PlayerAttackMessage) {
            return this.mergeFrom((PlayerAttackMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public PlayerAttackMessage.Builder mergeFrom(PlayerAttackMessage var1) {
         if (var1 == PlayerAttackMessage.getDefaultInstance()) {
            return this;
         }

         if (var1.hasPacketInfo()) {
            this.mergePacketInfo(var1.getPacketInfo());
         }

         if (var1.hasTargetInfo()) {
            this.mergeTargetInfo(var1.getTargetInfo());
         }

         if (var1.hasAttackerInfo()) {
            this.mergeAttackerInfo(var1.getAttackerInfo());
         }

         if (var1.getDistance() != 0.0) {
            this.setDistance(var1.getDistance());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public PlayerAttackMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getPacketInfoFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     var1.readMessage(this.getTargetInfoFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 2;
                     break;
                  case 26:
                     var1.readMessage(this.getAttackerInfoFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 4;
                     break;
                  case 33:
                     this.distance_ = var1.readDouble();
                     this.bitField0_ |= 8;
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
      public boolean hasPacketInfo() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public PacketInfo getPacketInfo() {
         if (this.packetInfoBuilder_ == null) {
            return this.packetInfo_ == null ? PacketInfo.getDefaultInstance() : this.packetInfo_;
         } else {
            return this.packetInfoBuilder_.getMessage();
         }
      }

      public PlayerAttackMessage.Builder setPacketInfo(PacketInfo var1) {
         if (this.packetInfoBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.packetInfo_ = var1;
         } else {
            this.packetInfoBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public PlayerAttackMessage.Builder setPacketInfo(PacketInfo.Builder var1) {
         if (this.packetInfoBuilder_ == null) {
            this.packetInfo_ = var1.build();
         } else {
            this.packetInfoBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public PlayerAttackMessage.Builder mergePacketInfo(PacketInfo var1) {
         if (this.packetInfoBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.packetInfo_ != null && this.packetInfo_ != PacketInfo.getDefaultInstance()) {
               this.getPacketInfoBuilder().mergeFrom(var1);
            } else {
               this.packetInfo_ = var1;
            }
         } else {
            this.packetInfoBuilder_.mergeFrom(var1);
         }

         if (this.packetInfo_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public PlayerAttackMessage.Builder clearPacketInfo() {
         this.bitField0_ &= -2;
         this.packetInfo_ = null;
         if (this.packetInfoBuilder_ != null) {
            this.packetInfoBuilder_.dispose();
            this.packetInfoBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public PacketInfo.Builder getPacketInfoBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getPacketInfoFieldBuilder().getBuilder();
      }

      @Override
      public PacketInfoOrBuilder getPacketInfoOrBuilder() {
         if (this.packetInfoBuilder_ != null) {
            return this.packetInfoBuilder_.getMessageOrBuilder();
         } else {
            return this.packetInfo_ == null ? PacketInfo.getDefaultInstance() : this.packetInfo_;
         }
      }

      private SingleFieldBuilderV3<PacketInfo, PacketInfo.Builder, PacketInfoOrBuilder> getPacketInfoFieldBuilder() {
         if (this.packetInfoBuilder_ == null) {
            this.packetInfoBuilder_ = new SingleFieldBuilderV3<>(this.getPacketInfo(), this.getParentForChildren(), this.isClean());
            this.packetInfo_ = null;
         }

         return this.packetInfoBuilder_;
      }

      @Override
      public boolean hasTargetInfo() {
         return (this.bitField0_ & 2) != 0;
      }

      @Override
      public PlayerInfo getTargetInfo() {
         if (this.targetInfoBuilder_ == null) {
            return this.targetInfo_ == null ? PlayerInfo.getDefaultInstance() : this.targetInfo_;
         } else {
            return this.targetInfoBuilder_.getMessage();
         }
      }

      public PlayerAttackMessage.Builder setTargetInfo(PlayerInfo var1) {
         if (this.targetInfoBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.targetInfo_ = var1;
         } else {
            this.targetInfoBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public PlayerAttackMessage.Builder setTargetInfo(PlayerInfo.Builder var1) {
         if (this.targetInfoBuilder_ == null) {
            this.targetInfo_ = var1.build();
         } else {
            this.targetInfoBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public PlayerAttackMessage.Builder mergeTargetInfo(PlayerInfo var1) {
         if (this.targetInfoBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0 && this.targetInfo_ != null && this.targetInfo_ != PlayerInfo.getDefaultInstance()) {
               this.getTargetInfoBuilder().mergeFrom(var1);
            } else {
               this.targetInfo_ = var1;
            }
         } else {
            this.targetInfoBuilder_.mergeFrom(var1);
         }

         if (this.targetInfo_ != null) {
            this.bitField0_ |= 2;
            this.onChanged();
         }

         return this;
      }

      public PlayerAttackMessage.Builder clearTargetInfo() {
         this.bitField0_ &= -3;
         this.targetInfo_ = null;
         if (this.targetInfoBuilder_ != null) {
            this.targetInfoBuilder_.dispose();
            this.targetInfoBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public PlayerInfo.Builder getTargetInfoBuilder() {
         this.bitField0_ |= 2;
         this.onChanged();
         return this.getTargetInfoFieldBuilder().getBuilder();
      }

      @Override
      public PlayerInfoOrBuilder getTargetInfoOrBuilder() {
         if (this.targetInfoBuilder_ != null) {
            return this.targetInfoBuilder_.getMessageOrBuilder();
         } else {
            return this.targetInfo_ == null ? PlayerInfo.getDefaultInstance() : this.targetInfo_;
         }
      }

      private SingleFieldBuilderV3<PlayerInfo, PlayerInfo.Builder, PlayerInfoOrBuilder> getTargetInfoFieldBuilder() {
         if (this.targetInfoBuilder_ == null) {
            this.targetInfoBuilder_ = new SingleFieldBuilderV3<>(this.getTargetInfo(), this.getParentForChildren(), this.isClean());
            this.targetInfo_ = null;
         }

         return this.targetInfoBuilder_;
      }

      @Override
      public boolean hasAttackerInfo() {
         return (this.bitField0_ & 4) != 0;
      }

      @Override
      public PlayerInfo getAttackerInfo() {
         if (this.attackerInfoBuilder_ == null) {
            return this.attackerInfo_ == null ? PlayerInfo.getDefaultInstance() : this.attackerInfo_;
         } else {
            return this.attackerInfoBuilder_.getMessage();
         }
      }

      public PlayerAttackMessage.Builder setAttackerInfo(PlayerInfo var1) {
         if (this.attackerInfoBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.attackerInfo_ = var1;
         } else {
            this.attackerInfoBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public PlayerAttackMessage.Builder setAttackerInfo(PlayerInfo.Builder var1) {
         if (this.attackerInfoBuilder_ == null) {
            this.attackerInfo_ = var1.build();
         } else {
            this.attackerInfoBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public PlayerAttackMessage.Builder mergeAttackerInfo(PlayerInfo var1) {
         if (this.attackerInfoBuilder_ == null) {
            if ((this.bitField0_ & 4) != 0 && this.attackerInfo_ != null && this.attackerInfo_ != PlayerInfo.getDefaultInstance()) {
               this.getAttackerInfoBuilder().mergeFrom(var1);
            } else {
               this.attackerInfo_ = var1;
            }
         } else {
            this.attackerInfoBuilder_.mergeFrom(var1);
         }

         if (this.attackerInfo_ != null) {
            this.bitField0_ |= 4;
            this.onChanged();
         }

         return this;
      }

      public PlayerAttackMessage.Builder clearAttackerInfo() {
         this.bitField0_ &= -5;
         this.attackerInfo_ = null;
         if (this.attackerInfoBuilder_ != null) {
            this.attackerInfoBuilder_.dispose();
            this.attackerInfoBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public PlayerInfo.Builder getAttackerInfoBuilder() {
         this.bitField0_ |= 4;
         this.onChanged();
         return this.getAttackerInfoFieldBuilder().getBuilder();
      }

      @Override
      public PlayerInfoOrBuilder getAttackerInfoOrBuilder() {
         if (this.attackerInfoBuilder_ != null) {
            return this.attackerInfoBuilder_.getMessageOrBuilder();
         } else {
            return this.attackerInfo_ == null ? PlayerInfo.getDefaultInstance() : this.attackerInfo_;
         }
      }

      private SingleFieldBuilderV3<PlayerInfo, PlayerInfo.Builder, PlayerInfoOrBuilder> getAttackerInfoFieldBuilder() {
         if (this.attackerInfoBuilder_ == null) {
            this.attackerInfoBuilder_ = new SingleFieldBuilderV3<>(this.getAttackerInfo(), this.getParentForChildren(), this.isClean());
            this.attackerInfo_ = null;
         }

         return this.attackerInfoBuilder_;
      }

      @Override
      public double getDistance() {
         return this.distance_;
      }

      public PlayerAttackMessage.Builder setDistance(double var1) {
         this.distance_ = var1;
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public PlayerAttackMessage.Builder clearDistance() {
         this.bitField0_ &= -9;
         this.distance_ = 0.0;
         this.onChanged();
         return this;
      }

      public final PlayerAttackMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (PlayerAttackMessage.Builder)super.setUnknownFields(var1);
      }

      public final PlayerAttackMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (PlayerAttackMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
