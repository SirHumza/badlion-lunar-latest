package com.lunarclient.apollo.packetenrichment.v1;

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
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class PlayerInventoryCloseMessage extends GeneratedMessageV3 implements PlayerInventoryCloseMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int PLAYER_INFO_FIELD_NUMBER = 1;
   private PlayerInfo playerInfo_;
   public static final int PACKET_INFO_FIELD_NUMBER = 2;
   private PacketInfo packetInfo_;
   private byte memoizedIsInitialized = -1;
   private static final PlayerInventoryCloseMessage DEFAULT_INSTANCE = new PlayerInventoryCloseMessage();
   private static final Parser<PlayerInventoryCloseMessage> PARSER = new AbstractParser<PlayerInventoryCloseMessage>() {
      public PlayerInventoryCloseMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         PlayerInventoryCloseMessage.Builder var3 = PlayerInventoryCloseMessage.newBuilder();

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

   private PlayerInventoryCloseMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private PlayerInventoryCloseMessage() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new PlayerInventoryCloseMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return InventoryProto.internal_static_lunarclient_apollo_packetenrichment_v1_PlayerInventoryCloseMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return InventoryProto.internal_static_lunarclient_apollo_packetenrichment_v1_PlayerInventoryCloseMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(PlayerInventoryCloseMessage.class, PlayerInventoryCloseMessage.Builder.class);
   }

   @Override
   public boolean hasPlayerInfo() {
      return (this.bitField0_ & 1) != 0;
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
   public boolean hasPacketInfo() {
      return (this.bitField0_ & 2) != 0;
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
         var1.writeMessage(1, this.getPlayerInfo());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1.writeMessage(2, this.getPacketInfo());
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
         var1 += CodedOutputStream.computeMessageSize(1, this.getPlayerInfo());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1 += CodedOutputStream.computeMessageSize(2, this.getPacketInfo());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof PlayerInventoryCloseMessage)) {
         return super.equals(var1);
      } else {
         PlayerInventoryCloseMessage var2 = (PlayerInventoryCloseMessage)var1;
         if (this.hasPlayerInfo() != var2.hasPlayerInfo()) {
            return false;
         } else if (this.hasPlayerInfo() && !this.getPlayerInfo().equals(var2.getPlayerInfo())) {
            return false;
         } else if (this.hasPacketInfo() != var2.hasPacketInfo()) {
            return false;
         } else {
            return this.hasPacketInfo() && !this.getPacketInfo().equals(var2.getPacketInfo()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.hasPlayerInfo()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getPlayerInfo().hashCode();
      }

      if (this.hasPacketInfo()) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getPacketInfo().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static PlayerInventoryCloseMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static PlayerInventoryCloseMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static PlayerInventoryCloseMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static PlayerInventoryCloseMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static PlayerInventoryCloseMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static PlayerInventoryCloseMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static PlayerInventoryCloseMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PlayerInventoryCloseMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PlayerInventoryCloseMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static PlayerInventoryCloseMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static PlayerInventoryCloseMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PlayerInventoryCloseMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public PlayerInventoryCloseMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static PlayerInventoryCloseMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static PlayerInventoryCloseMessage.Builder newBuilder(PlayerInventoryCloseMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public PlayerInventoryCloseMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new PlayerInventoryCloseMessage.Builder() : new PlayerInventoryCloseMessage.Builder().mergeFrom(this);
   }

   protected PlayerInventoryCloseMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new PlayerInventoryCloseMessage.Builder(var1);
   }

   public static PlayerInventoryCloseMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<PlayerInventoryCloseMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<PlayerInventoryCloseMessage> getParserForType() {
      return PARSER;
   }

   public PlayerInventoryCloseMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<PlayerInventoryCloseMessage.Builder> implements PlayerInventoryCloseMessageOrBuilder {
      private int bitField0_;
      private PlayerInfo playerInfo_;
      private SingleFieldBuilderV3<PlayerInfo, PlayerInfo.Builder, PlayerInfoOrBuilder> playerInfoBuilder_;
      private PacketInfo packetInfo_;
      private SingleFieldBuilderV3<PacketInfo, PacketInfo.Builder, PacketInfoOrBuilder> packetInfoBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return InventoryProto.internal_static_lunarclient_apollo_packetenrichment_v1_PlayerInventoryCloseMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return InventoryProto.internal_static_lunarclient_apollo_packetenrichment_v1_PlayerInventoryCloseMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(PlayerInventoryCloseMessage.class, PlayerInventoryCloseMessage.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (PlayerInventoryCloseMessage.alwaysUseFieldBuilders) {
            this.getPlayerInfoFieldBuilder();
            this.getPacketInfoFieldBuilder();
         }
      }

      public PlayerInventoryCloseMessage.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.playerInfo_ = null;
         if (this.playerInfoBuilder_ != null) {
            this.playerInfoBuilder_.dispose();
            this.playerInfoBuilder_ = null;
         }

         this.packetInfo_ = null;
         if (this.packetInfoBuilder_ != null) {
            this.packetInfoBuilder_.dispose();
            this.packetInfoBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return InventoryProto.internal_static_lunarclient_apollo_packetenrichment_v1_PlayerInventoryCloseMessage_descriptor;
      }

      public PlayerInventoryCloseMessage getDefaultInstanceForType() {
         return PlayerInventoryCloseMessage.getDefaultInstance();
      }

      public PlayerInventoryCloseMessage build() {
         PlayerInventoryCloseMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public PlayerInventoryCloseMessage buildPartial() {
         PlayerInventoryCloseMessage var1 = new PlayerInventoryCloseMessage(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(PlayerInventoryCloseMessage var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.playerInfo_ = this.playerInfoBuilder_ == null ? this.playerInfo_ : this.playerInfoBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.packetInfo_ = this.packetInfoBuilder_ == null ? this.packetInfo_ : this.packetInfoBuilder_.build();
            var3 |= 2;
         }

         PlayerInventoryCloseMessage var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public PlayerInventoryCloseMessage.Builder clone() {
         return (PlayerInventoryCloseMessage.Builder)super.clone();
      }

      public PlayerInventoryCloseMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (PlayerInventoryCloseMessage.Builder)super.setField(var1, var2);
      }

      public PlayerInventoryCloseMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (PlayerInventoryCloseMessage.Builder)super.clearField(var1);
      }

      public PlayerInventoryCloseMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (PlayerInventoryCloseMessage.Builder)super.clearOneof(var1);
      }

      public PlayerInventoryCloseMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (PlayerInventoryCloseMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public PlayerInventoryCloseMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (PlayerInventoryCloseMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public PlayerInventoryCloseMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof PlayerInventoryCloseMessage) {
            return this.mergeFrom((PlayerInventoryCloseMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public PlayerInventoryCloseMessage.Builder mergeFrom(PlayerInventoryCloseMessage var1) {
         if (var1 == PlayerInventoryCloseMessage.getDefaultInstance()) {
            return this;
         }

         if (var1.hasPlayerInfo()) {
            this.mergePlayerInfo(var1.getPlayerInfo());
         }

         if (var1.hasPacketInfo()) {
            this.mergePacketInfo(var1.getPacketInfo());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public PlayerInventoryCloseMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getPlayerInfoFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     var1.readMessage(this.getPacketInfoFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 2;
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
      public boolean hasPlayerInfo() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public PlayerInfo getPlayerInfo() {
         if (this.playerInfoBuilder_ == null) {
            return this.playerInfo_ == null ? PlayerInfo.getDefaultInstance() : this.playerInfo_;
         } else {
            return this.playerInfoBuilder_.getMessage();
         }
      }

      public PlayerInventoryCloseMessage.Builder setPlayerInfo(PlayerInfo var1) {
         if (this.playerInfoBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.playerInfo_ = var1;
         } else {
            this.playerInfoBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public PlayerInventoryCloseMessage.Builder setPlayerInfo(PlayerInfo.Builder var1) {
         if (this.playerInfoBuilder_ == null) {
            this.playerInfo_ = var1.build();
         } else {
            this.playerInfoBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public PlayerInventoryCloseMessage.Builder mergePlayerInfo(PlayerInfo var1) {
         if (this.playerInfoBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.playerInfo_ != null && this.playerInfo_ != PlayerInfo.getDefaultInstance()) {
               this.getPlayerInfoBuilder().mergeFrom(var1);
            } else {
               this.playerInfo_ = var1;
            }
         } else {
            this.playerInfoBuilder_.mergeFrom(var1);
         }

         if (this.playerInfo_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public PlayerInventoryCloseMessage.Builder clearPlayerInfo() {
         this.bitField0_ &= -2;
         this.playerInfo_ = null;
         if (this.playerInfoBuilder_ != null) {
            this.playerInfoBuilder_.dispose();
            this.playerInfoBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public PlayerInfo.Builder getPlayerInfoBuilder() {
         this.bitField0_ |= 1;
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
      public boolean hasPacketInfo() {
         return (this.bitField0_ & 2) != 0;
      }

      @Override
      public PacketInfo getPacketInfo() {
         if (this.packetInfoBuilder_ == null) {
            return this.packetInfo_ == null ? PacketInfo.getDefaultInstance() : this.packetInfo_;
         } else {
            return this.packetInfoBuilder_.getMessage();
         }
      }

      public PlayerInventoryCloseMessage.Builder setPacketInfo(PacketInfo var1) {
         if (this.packetInfoBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.packetInfo_ = var1;
         } else {
            this.packetInfoBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public PlayerInventoryCloseMessage.Builder setPacketInfo(PacketInfo.Builder var1) {
         if (this.packetInfoBuilder_ == null) {
            this.packetInfo_ = var1.build();
         } else {
            this.packetInfoBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public PlayerInventoryCloseMessage.Builder mergePacketInfo(PacketInfo var1) {
         if (this.packetInfoBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0 && this.packetInfo_ != null && this.packetInfo_ != PacketInfo.getDefaultInstance()) {
               this.getPacketInfoBuilder().mergeFrom(var1);
            } else {
               this.packetInfo_ = var1;
            }
         } else {
            this.packetInfoBuilder_.mergeFrom(var1);
         }

         if (this.packetInfo_ != null) {
            this.bitField0_ |= 2;
            this.onChanged();
         }

         return this;
      }

      public PlayerInventoryCloseMessage.Builder clearPacketInfo() {
         this.bitField0_ &= -3;
         this.packetInfo_ = null;
         if (this.packetInfoBuilder_ != null) {
            this.packetInfoBuilder_.dispose();
            this.packetInfoBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public PacketInfo.Builder getPacketInfoBuilder() {
         this.bitField0_ |= 2;
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

      public final PlayerInventoryCloseMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (PlayerInventoryCloseMessage.Builder)super.setUnknownFields(var1);
      }

      public final PlayerInventoryCloseMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (PlayerInventoryCloseMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
