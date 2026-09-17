package com.lunarclient.apollo.evnt.v1;

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
import com.lunarclient.apollo.common.v1.Uuid;
import com.lunarclient.apollo.common.v1.UuidOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class EventPlayerStatusMessage extends GeneratedMessageV3 implements EventPlayerStatusMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int PLAYER_UUID_FIELD_NUMBER = 1;
   private Uuid playerUuid_;
   public static final int HEALTH_FIELD_NUMBER = 2;
   private float health_ = 0.0F;
   public static final int ULTIMATE_PERCENTAGE_FIELD_NUMBER = 3;
   private float ultimatePercentage_ = 0.0F;
   public static final int RESPAWN_AT_FIELD_NUMBER = 4;
   private long respawnAt_ = 0L;
   private byte memoizedIsInitialized = -1;
   private static final EventPlayerStatusMessage DEFAULT_INSTANCE = new EventPlayerStatusMessage();
   private static final Parser<EventPlayerStatusMessage> PARSER = new AbstractParser<EventPlayerStatusMessage>() {
      public EventPlayerStatusMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         EventPlayerStatusMessage.Builder var3 = EventPlayerStatusMessage.newBuilder();

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

   private EventPlayerStatusMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private EventPlayerStatusMessage() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new EventPlayerStatusMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return EventProto.internal_static_lunarclient_apollo_evnt_v1_EventPlayerStatusMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return EventProto.internal_static_lunarclient_apollo_evnt_v1_EventPlayerStatusMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(EventPlayerStatusMessage.class, EventPlayerStatusMessage.Builder.class);
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
   public float getHealth() {
      return this.health_;
   }

   @Override
   public float getUltimatePercentage() {
      return this.ultimatePercentage_;
   }

   @Override
   public long getRespawnAt() {
      return this.respawnAt_;
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

      if (Float.floatToRawIntBits(this.health_) != 0) {
         var1.writeFloat(2, this.health_);
      }

      if (Float.floatToRawIntBits(this.ultimatePercentage_) != 0) {
         var1.writeFloat(3, this.ultimatePercentage_);
      }

      if (this.respawnAt_ != 0L) {
         var1.writeInt64(4, this.respawnAt_);
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

      if (Float.floatToRawIntBits(this.health_) != 0) {
         var1 += CodedOutputStream.computeFloatSize(2, this.health_);
      }

      if (Float.floatToRawIntBits(this.ultimatePercentage_) != 0) {
         var1 += CodedOutputStream.computeFloatSize(3, this.ultimatePercentage_);
      }

      if (this.respawnAt_ != 0L) {
         var1 += CodedOutputStream.computeInt64Size(4, this.respawnAt_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof EventPlayerStatusMessage)) {
         return super.equals(var1);
      } else {
         EventPlayerStatusMessage var2 = (EventPlayerStatusMessage)var1;
         if (this.hasPlayerUuid() != var2.hasPlayerUuid()) {
            return false;
         } else if (this.hasPlayerUuid() && !this.getPlayerUuid().equals(var2.getPlayerUuid())) {
            return false;
         } else if (Float.floatToIntBits(this.getHealth()) != Float.floatToIntBits(var2.getHealth())) {
            return false;
         } else if (Float.floatToIntBits(this.getUltimatePercentage()) != Float.floatToIntBits(var2.getUltimatePercentage())) {
            return false;
         } else {
            return this.getRespawnAt() != var2.getRespawnAt() ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + Float.floatToIntBits(this.getHealth());
      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + Float.floatToIntBits(this.getUltimatePercentage());
      var1 = 37 * var1 + 4;
      var1 = 53 * var1 + Internal.hashLong(this.getRespawnAt());
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static EventPlayerStatusMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static EventPlayerStatusMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static EventPlayerStatusMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static EventPlayerStatusMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static EventPlayerStatusMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static EventPlayerStatusMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static EventPlayerStatusMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static EventPlayerStatusMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static EventPlayerStatusMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static EventPlayerStatusMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static EventPlayerStatusMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static EventPlayerStatusMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public EventPlayerStatusMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static EventPlayerStatusMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static EventPlayerStatusMessage.Builder newBuilder(EventPlayerStatusMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public EventPlayerStatusMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new EventPlayerStatusMessage.Builder() : new EventPlayerStatusMessage.Builder().mergeFrom(this);
   }

   protected EventPlayerStatusMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new EventPlayerStatusMessage.Builder(var1);
   }

   public static EventPlayerStatusMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<EventPlayerStatusMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<EventPlayerStatusMessage> getParserForType() {
      return PARSER;
   }

   public EventPlayerStatusMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<EventPlayerStatusMessage.Builder> implements EventPlayerStatusMessageOrBuilder {
      private int bitField0_;
      private Uuid playerUuid_;
      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> playerUuidBuilder_;
      private float health_;
      private float ultimatePercentage_;
      private long respawnAt_;

      public static final Descriptors.Descriptor getDescriptor() {
         return EventProto.internal_static_lunarclient_apollo_evnt_v1_EventPlayerStatusMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return EventProto.internal_static_lunarclient_apollo_evnt_v1_EventPlayerStatusMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(EventPlayerStatusMessage.class, EventPlayerStatusMessage.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (EventPlayerStatusMessage.alwaysUseFieldBuilders) {
            this.getPlayerUuidFieldBuilder();
         }
      }

      public EventPlayerStatusMessage.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.playerUuid_ = null;
         if (this.playerUuidBuilder_ != null) {
            this.playerUuidBuilder_.dispose();
            this.playerUuidBuilder_ = null;
         }

         this.health_ = 0.0F;
         this.ultimatePercentage_ = 0.0F;
         this.respawnAt_ = 0L;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return EventProto.internal_static_lunarclient_apollo_evnt_v1_EventPlayerStatusMessage_descriptor;
      }

      public EventPlayerStatusMessage getDefaultInstanceForType() {
         return EventPlayerStatusMessage.getDefaultInstance();
      }

      public EventPlayerStatusMessage build() {
         EventPlayerStatusMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public EventPlayerStatusMessage buildPartial() {
         EventPlayerStatusMessage var1 = new EventPlayerStatusMessage(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(EventPlayerStatusMessage var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.playerUuid_ = this.playerUuidBuilder_ == null ? this.playerUuid_ : this.playerUuidBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.health_ = this.health_;
         }

         if ((var2 & 4) != 0) {
            var1.ultimatePercentage_ = this.ultimatePercentage_;
         }

         if ((var2 & 8) != 0) {
            var1.respawnAt_ = this.respawnAt_;
         }

         EventPlayerStatusMessage var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public EventPlayerStatusMessage.Builder clone() {
         return (EventPlayerStatusMessage.Builder)super.clone();
      }

      public EventPlayerStatusMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (EventPlayerStatusMessage.Builder)super.setField(var1, var2);
      }

      public EventPlayerStatusMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (EventPlayerStatusMessage.Builder)super.clearField(var1);
      }

      public EventPlayerStatusMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (EventPlayerStatusMessage.Builder)super.clearOneof(var1);
      }

      public EventPlayerStatusMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (EventPlayerStatusMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public EventPlayerStatusMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (EventPlayerStatusMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public EventPlayerStatusMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof EventPlayerStatusMessage) {
            return this.mergeFrom((EventPlayerStatusMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public EventPlayerStatusMessage.Builder mergeFrom(EventPlayerStatusMessage var1) {
         if (var1 == EventPlayerStatusMessage.getDefaultInstance()) {
            return this;
         }

         if (var1.hasPlayerUuid()) {
            this.mergePlayerUuid(var1.getPlayerUuid());
         }

         if (var1.getHealth() != 0.0F) {
            this.setHealth(var1.getHealth());
         }

         if (var1.getUltimatePercentage() != 0.0F) {
            this.setUltimatePercentage(var1.getUltimatePercentage());
         }

         if (var1.getRespawnAt() != 0L) {
            this.setRespawnAt(var1.getRespawnAt());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public EventPlayerStatusMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                  case 21:
                     this.health_ = var1.readFloat();
                     this.bitField0_ |= 2;
                     break;
                  case 29:
                     this.ultimatePercentage_ = var1.readFloat();
                     this.bitField0_ |= 4;
                     break;
                  case 32:
                     this.respawnAt_ = var1.readInt64();
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

      public EventPlayerStatusMessage.Builder setPlayerUuid(Uuid var1) {
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

      public EventPlayerStatusMessage.Builder setPlayerUuid(Uuid.Builder var1) {
         if (this.playerUuidBuilder_ == null) {
            this.playerUuid_ = var1.build();
         } else {
            this.playerUuidBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public EventPlayerStatusMessage.Builder mergePlayerUuid(Uuid var1) {
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

      public EventPlayerStatusMessage.Builder clearPlayerUuid() {
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
      public float getHealth() {
         return this.health_;
      }

      public EventPlayerStatusMessage.Builder setHealth(float var1) {
         this.health_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public EventPlayerStatusMessage.Builder clearHealth() {
         this.bitField0_ &= -3;
         this.health_ = 0.0F;
         this.onChanged();
         return this;
      }

      @Override
      public float getUltimatePercentage() {
         return this.ultimatePercentage_;
      }

      public EventPlayerStatusMessage.Builder setUltimatePercentage(float var1) {
         this.ultimatePercentage_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public EventPlayerStatusMessage.Builder clearUltimatePercentage() {
         this.bitField0_ &= -5;
         this.ultimatePercentage_ = 0.0F;
         this.onChanged();
         return this;
      }

      @Override
      public long getRespawnAt() {
         return this.respawnAt_;
      }

      public EventPlayerStatusMessage.Builder setRespawnAt(long var1) {
         this.respawnAt_ = var1;
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public EventPlayerStatusMessage.Builder clearRespawnAt() {
         this.bitField0_ &= -9;
         this.respawnAt_ = 0L;
         this.onChanged();
         return this;
      }

      public final EventPlayerStatusMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (EventPlayerStatusMessage.Builder)super.setUnknownFields(var1);
      }

      public final EventPlayerStatusMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (EventPlayerStatusMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
