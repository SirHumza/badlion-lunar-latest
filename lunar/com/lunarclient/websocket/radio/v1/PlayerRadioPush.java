package com.lunarclient.websocket.radio.v1;

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
import com.lunarclient.common.v1.Uuid;
import com.lunarclient.common.v1.UuidOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class PlayerRadioPush extends GeneratedMessageV3 implements PlayerRadioPushOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int PLAYER_UUID_FIELD_NUMBER = 1;
   private Uuid playerUuid_;
   public static final int RADIO_PLAYING_FIELD_NUMBER = 2;
   private boolean radioPlaying_ = false;
   private byte memoizedIsInitialized = -1;
   private static final PlayerRadioPush DEFAULT_INSTANCE = new PlayerRadioPush();
   private static final Parser<PlayerRadioPush> PARSER = new AbstractParser<PlayerRadioPush>() {
      public PlayerRadioPush parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         PlayerRadioPush.Builder var3 = PlayerRadioPush.newBuilder();

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

   private PlayerRadioPush(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private PlayerRadioPush() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new PlayerRadioPush();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return PushProto.internal_static_lunarclient_websocket_radio_v1_PlayerRadioPush_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return PushProto.internal_static_lunarclient_websocket_radio_v1_PlayerRadioPush_fieldAccessorTable
         .ensureFieldAccessorsInitialized(PlayerRadioPush.class, PlayerRadioPush.Builder.class);
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
   public boolean getRadioPlaying() {
      return this.radioPlaying_;
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

      if (this.radioPlaying_) {
         var1.writeBool(2, this.radioPlaying_);
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

      if (this.radioPlaying_) {
         var1 += CodedOutputStream.computeBoolSize(2, this.radioPlaying_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof PlayerRadioPush)) {
         return super.equals(var1);
      } else {
         PlayerRadioPush var2 = (PlayerRadioPush)var1;
         if (this.hasPlayerUuid() != var2.hasPlayerUuid()) {
            return false;
         } else if (this.hasPlayerUuid() && !this.getPlayerUuid().equals(var2.getPlayerUuid())) {
            return false;
         } else {
            return this.getRadioPlaying() != var2.getRadioPlaying() ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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

      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + Internal.hashBoolean(this.getRadioPlaying());
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static PlayerRadioPush parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static PlayerRadioPush parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static PlayerRadioPush parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static PlayerRadioPush parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static PlayerRadioPush parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static PlayerRadioPush parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static PlayerRadioPush parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PlayerRadioPush parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PlayerRadioPush parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static PlayerRadioPush parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static PlayerRadioPush parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PlayerRadioPush parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public PlayerRadioPush.Builder newBuilderForType() {
      return newBuilder();
   }

   public static PlayerRadioPush.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static PlayerRadioPush.Builder newBuilder(PlayerRadioPush var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public PlayerRadioPush.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new PlayerRadioPush.Builder() : new PlayerRadioPush.Builder().mergeFrom(this);
   }

   protected PlayerRadioPush.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new PlayerRadioPush.Builder(var1);
   }

   public static PlayerRadioPush getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<PlayerRadioPush> parser() {
      return PARSER;
   }

   @Override
   public Parser<PlayerRadioPush> getParserForType() {
      return PARSER;
   }

   public PlayerRadioPush getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<PlayerRadioPush.Builder> implements PlayerRadioPushOrBuilder {
      private int bitField0_;
      private Uuid playerUuid_;
      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> playerUuidBuilder_;
      private boolean radioPlaying_;

      public static final Descriptors.Descriptor getDescriptor() {
         return PushProto.internal_static_lunarclient_websocket_radio_v1_PlayerRadioPush_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PushProto.internal_static_lunarclient_websocket_radio_v1_PlayerRadioPush_fieldAccessorTable
            .ensureFieldAccessorsInitialized(PlayerRadioPush.class, PlayerRadioPush.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (PlayerRadioPush.alwaysUseFieldBuilders) {
            this.getPlayerUuidFieldBuilder();
         }
      }

      public PlayerRadioPush.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.playerUuid_ = null;
         if (this.playerUuidBuilder_ != null) {
            this.playerUuidBuilder_.dispose();
            this.playerUuidBuilder_ = null;
         }

         this.radioPlaying_ = false;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return PushProto.internal_static_lunarclient_websocket_radio_v1_PlayerRadioPush_descriptor;
      }

      public PlayerRadioPush getDefaultInstanceForType() {
         return PlayerRadioPush.getDefaultInstance();
      }

      public PlayerRadioPush build() {
         PlayerRadioPush var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public PlayerRadioPush buildPartial() {
         PlayerRadioPush var1 = new PlayerRadioPush(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(PlayerRadioPush var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.playerUuid_ = this.playerUuidBuilder_ == null ? this.playerUuid_ : this.playerUuidBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.radioPlaying_ = this.radioPlaying_;
         }

         PlayerRadioPush var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public PlayerRadioPush.Builder clone() {
         return (PlayerRadioPush.Builder)super.clone();
      }

      public PlayerRadioPush.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (PlayerRadioPush.Builder)super.setField(var1, var2);
      }

      public PlayerRadioPush.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (PlayerRadioPush.Builder)super.clearField(var1);
      }

      public PlayerRadioPush.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (PlayerRadioPush.Builder)super.clearOneof(var1);
      }

      public PlayerRadioPush.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (PlayerRadioPush.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public PlayerRadioPush.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (PlayerRadioPush.Builder)super.addRepeatedField(var1, var2);
      }

      public PlayerRadioPush.Builder mergeFrom(Message var1) {
         if (var1 instanceof PlayerRadioPush) {
            return this.mergeFrom((PlayerRadioPush)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public PlayerRadioPush.Builder mergeFrom(PlayerRadioPush var1) {
         if (var1 == PlayerRadioPush.getDefaultInstance()) {
            return this;
         }

         if (var1.hasPlayerUuid()) {
            this.mergePlayerUuid(var1.getPlayerUuid());
         }

         if (var1.getRadioPlaying()) {
            this.setRadioPlaying(var1.getRadioPlaying());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public PlayerRadioPush.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                  case 16:
                     this.radioPlaying_ = var1.readBool();
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

      public PlayerRadioPush.Builder setPlayerUuid(Uuid var1) {
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

      public PlayerRadioPush.Builder setPlayerUuid(Uuid.Builder var1) {
         if (this.playerUuidBuilder_ == null) {
            this.playerUuid_ = var1.build();
         } else {
            this.playerUuidBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public PlayerRadioPush.Builder mergePlayerUuid(Uuid var1) {
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

      public PlayerRadioPush.Builder clearPlayerUuid() {
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
      public boolean getRadioPlaying() {
         return this.radioPlaying_;
      }

      public PlayerRadioPush.Builder setRadioPlaying(boolean var1) {
         this.radioPlaying_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public PlayerRadioPush.Builder clearRadioPlaying() {
         this.bitField0_ &= -3;
         this.radioPlaying_ = false;
         this.onChanged();
         return this;
      }

      public final PlayerRadioPush.Builder setUnknownFields(UnknownFieldSet var1) {
         return (PlayerRadioPush.Builder)super.setUnknownFields(var1);
      }

      public final PlayerRadioPush.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (PlayerRadioPush.Builder)super.mergeUnknownFields(var1);
      }
   }
}
