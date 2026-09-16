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

public final class PlayerUseItemMessage extends GeneratedMessageV3 implements PlayerUseItemMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int PACKET_INFO_FIELD_NUMBER = 1;
   private PacketInfo packetInfo_;
   public static final int PLAYER_INFO_FIELD_NUMBER = 2;
   private PlayerInfo playerInfo_;
   public static final int MAIN_HAND_FIELD_NUMBER = 3;
   private boolean mainHand_ = false;
   private byte memoizedIsInitialized = -1;
   private static final PlayerUseItemMessage DEFAULT_INSTANCE = new PlayerUseItemMessage();
   private static final Parser<PlayerUseItemMessage> PARSER = new AbstractParser<PlayerUseItemMessage>() {
      public PlayerUseItemMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         PlayerUseItemMessage.Builder var3 = PlayerUseItemMessage.newBuilder();

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

   private PlayerUseItemMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private PlayerUseItemMessage() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new PlayerUseItemMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return WorldProto.internal_static_lunarclient_apollo_packetenrichment_v1_PlayerUseItemMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return WorldProto.internal_static_lunarclient_apollo_packetenrichment_v1_PlayerUseItemMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(PlayerUseItemMessage.class, PlayerUseItemMessage.Builder.class);
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
   public boolean hasPlayerInfo() {
      return (this.bitField0_ & 2) != 0;
   }

   @Override
   public PlayerInfo getPlayerInfo() {
      return this.playerInfo_ == null ? PlayerInfo.getDefaultInstance() : this.playerInfo_;
   }

   @Override
   public PlayerInfoOrBuilder getPlayerInfoOrBuilder() {
      return this.playerInfo_ == null ? PlayerInfo.getDefaultInstance() : this.playerInfo_;
   }

   @Override
   public boolean getMainHand() {
      return this.mainHand_;
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
         var1.writeMessage(2, this.getPlayerInfo());
      }

      if (this.mainHand_) {
         var1.writeBool(3, this.mainHand_);
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
         var1 += CodedOutputStream.computeMessageSize(2, this.getPlayerInfo());
      }

      if (this.mainHand_) {
         var1 += CodedOutputStream.computeBoolSize(3, this.mainHand_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof PlayerUseItemMessage)) {
         return super.equals(var1);
      } else {
         PlayerUseItemMessage var2 = (PlayerUseItemMessage)var1;
         if (this.hasPacketInfo() != var2.hasPacketInfo()) {
            return false;
         } else if (this.hasPacketInfo() && !this.getPacketInfo().equals(var2.getPacketInfo())) {
            return false;
         } else if (this.hasPlayerInfo() != var2.hasPlayerInfo()) {
            return false;
         } else if (this.hasPlayerInfo() && !this.getPlayerInfo().equals(var2.getPlayerInfo())) {
            return false;
         } else {
            return this.getMainHand() != var2.getMainHand() ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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

      if (this.hasPlayerInfo()) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getPlayerInfo().hashCode();
      }

      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + Internal.hashBoolean(this.getMainHand());
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static PlayerUseItemMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static PlayerUseItemMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static PlayerUseItemMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static PlayerUseItemMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static PlayerUseItemMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static PlayerUseItemMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static PlayerUseItemMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PlayerUseItemMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PlayerUseItemMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static PlayerUseItemMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static PlayerUseItemMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PlayerUseItemMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public PlayerUseItemMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static PlayerUseItemMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static PlayerUseItemMessage.Builder newBuilder(PlayerUseItemMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public PlayerUseItemMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new PlayerUseItemMessage.Builder() : new PlayerUseItemMessage.Builder().mergeFrom(this);
   }

   protected PlayerUseItemMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new PlayerUseItemMessage.Builder(var1);
   }

   public static PlayerUseItemMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<PlayerUseItemMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<PlayerUseItemMessage> getParserForType() {
      return PARSER;
   }

   public PlayerUseItemMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<PlayerUseItemMessage.Builder> implements PlayerUseItemMessageOrBuilder {
      private int bitField0_;
      private PacketInfo packetInfo_;
      private SingleFieldBuilderV3<PacketInfo, PacketInfo.Builder, PacketInfoOrBuilder> packetInfoBuilder_;
      private PlayerInfo playerInfo_;
      private SingleFieldBuilderV3<PlayerInfo, PlayerInfo.Builder, PlayerInfoOrBuilder> playerInfoBuilder_;
      private boolean mainHand_;

      public static final Descriptors.Descriptor getDescriptor() {
         return WorldProto.internal_static_lunarclient_apollo_packetenrichment_v1_PlayerUseItemMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return WorldProto.internal_static_lunarclient_apollo_packetenrichment_v1_PlayerUseItemMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(PlayerUseItemMessage.class, PlayerUseItemMessage.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (PlayerUseItemMessage.alwaysUseFieldBuilders) {
            this.getPacketInfoFieldBuilder();
            this.getPlayerInfoFieldBuilder();
         }
      }

      public PlayerUseItemMessage.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.packetInfo_ = null;
         if (this.packetInfoBuilder_ != null) {
            this.packetInfoBuilder_.dispose();
            this.packetInfoBuilder_ = null;
         }

         this.playerInfo_ = null;
         if (this.playerInfoBuilder_ != null) {
            this.playerInfoBuilder_.dispose();
            this.playerInfoBuilder_ = null;
         }

         this.mainHand_ = false;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return WorldProto.internal_static_lunarclient_apollo_packetenrichment_v1_PlayerUseItemMessage_descriptor;
      }

      public PlayerUseItemMessage getDefaultInstanceForType() {
         return PlayerUseItemMessage.getDefaultInstance();
      }

      public PlayerUseItemMessage build() {
         PlayerUseItemMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public PlayerUseItemMessage buildPartial() {
         PlayerUseItemMessage var1 = new PlayerUseItemMessage(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(PlayerUseItemMessage var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.packetInfo_ = this.packetInfoBuilder_ == null ? this.packetInfo_ : this.packetInfoBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.playerInfo_ = this.playerInfoBuilder_ == null ? this.playerInfo_ : this.playerInfoBuilder_.build();
            var3 |= 2;
         }

         if ((var2 & 4) != 0) {
            var1.mainHand_ = this.mainHand_;
         }

         PlayerUseItemMessage var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public PlayerUseItemMessage.Builder clone() {
         return (PlayerUseItemMessage.Builder)super.clone();
      }

      public PlayerUseItemMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (PlayerUseItemMessage.Builder)super.setField(var1, var2);
      }

      public PlayerUseItemMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (PlayerUseItemMessage.Builder)super.clearField(var1);
      }

      public PlayerUseItemMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (PlayerUseItemMessage.Builder)super.clearOneof(var1);
      }

      public PlayerUseItemMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (PlayerUseItemMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public PlayerUseItemMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (PlayerUseItemMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public PlayerUseItemMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof PlayerUseItemMessage) {
            return this.mergeFrom((PlayerUseItemMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public PlayerUseItemMessage.Builder mergeFrom(PlayerUseItemMessage var1) {
         if (var1 == PlayerUseItemMessage.getDefaultInstance()) {
            return this;
         }

         if (var1.hasPacketInfo()) {
            this.mergePacketInfo(var1.getPacketInfo());
         }

         if (var1.hasPlayerInfo()) {
            this.mergePlayerInfo(var1.getPlayerInfo());
         }

         if (var1.getMainHand()) {
            this.setMainHand(var1.getMainHand());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public PlayerUseItemMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getPlayerInfoFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 2;
                     break;
                  case 24:
                     this.mainHand_ = var1.readBool();
                     this.bitField0_ |= 4;
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

      public PlayerUseItemMessage.Builder setPacketInfo(PacketInfo var1) {
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

      public PlayerUseItemMessage.Builder setPacketInfo(PacketInfo.Builder var1) {
         if (this.packetInfoBuilder_ == null) {
            this.packetInfo_ = var1.build();
         } else {
            this.packetInfoBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public PlayerUseItemMessage.Builder mergePacketInfo(PacketInfo var1) {
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

      public PlayerUseItemMessage.Builder clearPacketInfo() {
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
      public boolean hasPlayerInfo() {
         return (this.bitField0_ & 2) != 0;
      }

      @Override
      public PlayerInfo getPlayerInfo() {
         if (this.playerInfoBuilder_ == null) {
            return this.playerInfo_ == null ? PlayerInfo.getDefaultInstance() : this.playerInfo_;
         } else {
            return this.playerInfoBuilder_.getMessage();
         }
      }

      public PlayerUseItemMessage.Builder setPlayerInfo(PlayerInfo var1) {
         if (this.playerInfoBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.playerInfo_ = var1;
         } else {
            this.playerInfoBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public PlayerUseItemMessage.Builder setPlayerInfo(PlayerInfo.Builder var1) {
         if (this.playerInfoBuilder_ == null) {
            this.playerInfo_ = var1.build();
         } else {
            this.playerInfoBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public PlayerUseItemMessage.Builder mergePlayerInfo(PlayerInfo var1) {
         if (this.playerInfoBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0 && this.playerInfo_ != null && this.playerInfo_ != PlayerInfo.getDefaultInstance()) {
               this.getPlayerInfoBuilder().mergeFrom(var1);
            } else {
               this.playerInfo_ = var1;
            }
         } else {
            this.playerInfoBuilder_.mergeFrom(var1);
         }

         if (this.playerInfo_ != null) {
            this.bitField0_ |= 2;
            this.onChanged();
         }

         return this;
      }

      public PlayerUseItemMessage.Builder clearPlayerInfo() {
         this.bitField0_ &= -3;
         this.playerInfo_ = null;
         if (this.playerInfoBuilder_ != null) {
            this.playerInfoBuilder_.dispose();
            this.playerInfoBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public PlayerInfo.Builder getPlayerInfoBuilder() {
         this.bitField0_ |= 2;
         this.onChanged();
         return this.getPlayerInfoFieldBuilder().getBuilder();
      }

      @Override
      public PlayerInfoOrBuilder getPlayerInfoOrBuilder() {
         if (this.playerInfoBuilder_ != null) {
            return this.playerInfoBuilder_.getMessageOrBuilder();
         } else {
            return this.playerInfo_ == null ? PlayerInfo.getDefaultInstance() : this.playerInfo_;
         }
      }

      private SingleFieldBuilderV3<PlayerInfo, PlayerInfo.Builder, PlayerInfoOrBuilder> getPlayerInfoFieldBuilder() {
         if (this.playerInfoBuilder_ == null) {
            this.playerInfoBuilder_ = new SingleFieldBuilderV3<>(this.getPlayerInfo(), this.getParentForChildren(), this.isClean());
            this.playerInfo_ = null;
         }

         return this.playerInfoBuilder_;
      }

      @Override
      public boolean getMainHand() {
         return this.mainHand_;
      }

      public PlayerUseItemMessage.Builder setMainHand(boolean var1) {
         this.mainHand_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public PlayerUseItemMessage.Builder clearMainHand() {
         this.bitField0_ &= -5;
         this.mainHand_ = false;
         this.onChanged();
         return this;
      }

      public final PlayerUseItemMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (PlayerUseItemMessage.Builder)super.setUnknownFields(var1);
      }

      public final PlayerUseItemMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (PlayerUseItemMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
