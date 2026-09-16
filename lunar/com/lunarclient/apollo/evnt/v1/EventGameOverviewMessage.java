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
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class EventGameOverviewMessage extends GeneratedMessageV3 implements EventGameOverviewMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int TEAM_ONE_STATUS_FIELD_NUMBER = 1;
   private EventTeamStatusMessage teamOneStatus_;
   public static final int TEAM_TWO_STATUS_FIELD_NUMBER = 2;
   private EventTeamStatusMessage teamTwoStatus_;
   public static final int TIER_THREE_HEALTH_FIELD_NUMBER = 3;
   private float tierThreeHealth_ = 0.0F;
   public static final int GAME_START_TIME_FIELD_NUMBER = 4;
   private long gameStartTime_ = 0L;
   public static final int WITHER_SHIELDS_FIELD_NUMBER = 5;
   private boolean witherShields_ = false;
   public static final int LOCK_GAME_TIME_FIELD_NUMBER = 6;
   private boolean lockGameTime_ = false;
   public static final int MID_RESPAWN_TIME_FIELD_NUMBER = 7;
   private long midRespawnTime_ = 0L;
   private byte memoizedIsInitialized = -1;
   private static final EventGameOverviewMessage DEFAULT_INSTANCE = new EventGameOverviewMessage();
   private static final Parser<EventGameOverviewMessage> PARSER = new AbstractParser<EventGameOverviewMessage>() {
      public EventGameOverviewMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         EventGameOverviewMessage.Builder var3 = EventGameOverviewMessage.newBuilder();

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

   private EventGameOverviewMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private EventGameOverviewMessage() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new EventGameOverviewMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return EventProto.internal_static_lunarclient_apollo_evnt_v1_EventGameOverviewMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return EventProto.internal_static_lunarclient_apollo_evnt_v1_EventGameOverviewMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(EventGameOverviewMessage.class, EventGameOverviewMessage.Builder.class);
   }

   @Override
   public boolean hasTeamOneStatus() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public EventTeamStatusMessage getTeamOneStatus() {
      return this.teamOneStatus_ == null ? EventTeamStatusMessage.getDefaultInstance() : this.teamOneStatus_;
   }

   @Override
   public EventTeamStatusMessageOrBuilder getTeamOneStatusOrBuilder() {
      return this.teamOneStatus_ == null ? EventTeamStatusMessage.getDefaultInstance() : this.teamOneStatus_;
   }

   @Override
   public boolean hasTeamTwoStatus() {
      return (this.bitField0_ & 2) != 0;
   }

   @Override
   public EventTeamStatusMessage getTeamTwoStatus() {
      return this.teamTwoStatus_ == null ? EventTeamStatusMessage.getDefaultInstance() : this.teamTwoStatus_;
   }

   @Override
   public EventTeamStatusMessageOrBuilder getTeamTwoStatusOrBuilder() {
      return this.teamTwoStatus_ == null ? EventTeamStatusMessage.getDefaultInstance() : this.teamTwoStatus_;
   }

   @Override
   public float getTierThreeHealth() {
      return this.tierThreeHealth_;
   }

   @Override
   public long getGameStartTime() {
      return this.gameStartTime_;
   }

   @Override
   public boolean getWitherShields() {
      return this.witherShields_;
   }

   @Override
   public boolean getLockGameTime() {
      return this.lockGameTime_;
   }

   @Override
   public long getMidRespawnTime() {
      return this.midRespawnTime_;
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
         var1.writeMessage(1, this.getTeamOneStatus());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1.writeMessage(2, this.getTeamTwoStatus());
      }

      if (Float.floatToRawIntBits(this.tierThreeHealth_) != 0) {
         var1.writeFloat(3, this.tierThreeHealth_);
      }

      if (this.gameStartTime_ != 0L) {
         var1.writeInt64(4, this.gameStartTime_);
      }

      if (this.witherShields_) {
         var1.writeBool(5, this.witherShields_);
      }

      if (this.lockGameTime_) {
         var1.writeBool(6, this.lockGameTime_);
      }

      if (this.midRespawnTime_ != 0L) {
         var1.writeInt64(7, this.midRespawnTime_);
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
         var1 += CodedOutputStream.computeMessageSize(1, this.getTeamOneStatus());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1 += CodedOutputStream.computeMessageSize(2, this.getTeamTwoStatus());
      }

      if (Float.floatToRawIntBits(this.tierThreeHealth_) != 0) {
         var1 += CodedOutputStream.computeFloatSize(3, this.tierThreeHealth_);
      }

      if (this.gameStartTime_ != 0L) {
         var1 += CodedOutputStream.computeInt64Size(4, this.gameStartTime_);
      }

      if (this.witherShields_) {
         var1 += CodedOutputStream.computeBoolSize(5, this.witherShields_);
      }

      if (this.lockGameTime_) {
         var1 += CodedOutputStream.computeBoolSize(6, this.lockGameTime_);
      }

      if (this.midRespawnTime_ != 0L) {
         var1 += CodedOutputStream.computeInt64Size(7, this.midRespawnTime_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof EventGameOverviewMessage)) {
         return super.equals(var1);
      } else {
         EventGameOverviewMessage var2 = (EventGameOverviewMessage)var1;
         if (this.hasTeamOneStatus() != var2.hasTeamOneStatus()) {
            return false;
         } else if (this.hasTeamOneStatus() && !this.getTeamOneStatus().equals(var2.getTeamOneStatus())) {
            return false;
         } else if (this.hasTeamTwoStatus() != var2.hasTeamTwoStatus()) {
            return false;
         } else if (this.hasTeamTwoStatus() && !this.getTeamTwoStatus().equals(var2.getTeamTwoStatus())) {
            return false;
         } else if (Float.floatToIntBits(this.getTierThreeHealth()) != Float.floatToIntBits(var2.getTierThreeHealth())) {
            return false;
         } else if (this.getGameStartTime() != var2.getGameStartTime()) {
            return false;
         } else if (this.getWitherShields() != var2.getWitherShields()) {
            return false;
         } else if (this.getLockGameTime() != var2.getLockGameTime()) {
            return false;
         } else {
            return this.getMidRespawnTime() != var2.getMidRespawnTime() ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.hasTeamOneStatus()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getTeamOneStatus().hashCode();
      }

      if (this.hasTeamTwoStatus()) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getTeamTwoStatus().hashCode();
      }

      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + Float.floatToIntBits(this.getTierThreeHealth());
      var1 = 37 * var1 + 4;
      var1 = 53 * var1 + Internal.hashLong(this.getGameStartTime());
      var1 = 37 * var1 + 5;
      var1 = 53 * var1 + Internal.hashBoolean(this.getWitherShields());
      var1 = 37 * var1 + 6;
      var1 = 53 * var1 + Internal.hashBoolean(this.getLockGameTime());
      var1 = 37 * var1 + 7;
      var1 = 53 * var1 + Internal.hashLong(this.getMidRespawnTime());
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static EventGameOverviewMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static EventGameOverviewMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static EventGameOverviewMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static EventGameOverviewMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static EventGameOverviewMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static EventGameOverviewMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static EventGameOverviewMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static EventGameOverviewMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static EventGameOverviewMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static EventGameOverviewMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static EventGameOverviewMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static EventGameOverviewMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public EventGameOverviewMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static EventGameOverviewMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static EventGameOverviewMessage.Builder newBuilder(EventGameOverviewMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public EventGameOverviewMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new EventGameOverviewMessage.Builder() : new EventGameOverviewMessage.Builder().mergeFrom(this);
   }

   protected EventGameOverviewMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new EventGameOverviewMessage.Builder(var1);
   }

   public static EventGameOverviewMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<EventGameOverviewMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<EventGameOverviewMessage> getParserForType() {
      return PARSER;
   }

   public EventGameOverviewMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<EventGameOverviewMessage.Builder> implements EventGameOverviewMessageOrBuilder {
      private int bitField0_;
      private EventTeamStatusMessage teamOneStatus_;
      private SingleFieldBuilderV3<EventTeamStatusMessage, EventTeamStatusMessage.Builder, EventTeamStatusMessageOrBuilder> teamOneStatusBuilder_;
      private EventTeamStatusMessage teamTwoStatus_;
      private SingleFieldBuilderV3<EventTeamStatusMessage, EventTeamStatusMessage.Builder, EventTeamStatusMessageOrBuilder> teamTwoStatusBuilder_;
      private float tierThreeHealth_;
      private long gameStartTime_;
      private boolean witherShields_;
      private boolean lockGameTime_;
      private long midRespawnTime_;

      public static final Descriptors.Descriptor getDescriptor() {
         return EventProto.internal_static_lunarclient_apollo_evnt_v1_EventGameOverviewMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return EventProto.internal_static_lunarclient_apollo_evnt_v1_EventGameOverviewMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(EventGameOverviewMessage.class, EventGameOverviewMessage.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (EventGameOverviewMessage.alwaysUseFieldBuilders) {
            this.getTeamOneStatusFieldBuilder();
            this.getTeamTwoStatusFieldBuilder();
         }
      }

      public EventGameOverviewMessage.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.teamOneStatus_ = null;
         if (this.teamOneStatusBuilder_ != null) {
            this.teamOneStatusBuilder_.dispose();
            this.teamOneStatusBuilder_ = null;
         }

         this.teamTwoStatus_ = null;
         if (this.teamTwoStatusBuilder_ != null) {
            this.teamTwoStatusBuilder_.dispose();
            this.teamTwoStatusBuilder_ = null;
         }

         this.tierThreeHealth_ = 0.0F;
         this.gameStartTime_ = 0L;
         this.witherShields_ = false;
         this.lockGameTime_ = false;
         this.midRespawnTime_ = 0L;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return EventProto.internal_static_lunarclient_apollo_evnt_v1_EventGameOverviewMessage_descriptor;
      }

      public EventGameOverviewMessage getDefaultInstanceForType() {
         return EventGameOverviewMessage.getDefaultInstance();
      }

      public EventGameOverviewMessage build() {
         EventGameOverviewMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public EventGameOverviewMessage buildPartial() {
         EventGameOverviewMessage var1 = new EventGameOverviewMessage(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(EventGameOverviewMessage var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.teamOneStatus_ = this.teamOneStatusBuilder_ == null ? this.teamOneStatus_ : this.teamOneStatusBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.teamTwoStatus_ = this.teamTwoStatusBuilder_ == null ? this.teamTwoStatus_ : this.teamTwoStatusBuilder_.build();
            var3 |= 2;
         }

         if ((var2 & 4) != 0) {
            var1.tierThreeHealth_ = this.tierThreeHealth_;
         }

         if ((var2 & 8) != 0) {
            var1.gameStartTime_ = this.gameStartTime_;
         }

         if ((var2 & 16) != 0) {
            var1.witherShields_ = this.witherShields_;
         }

         if ((var2 & 32) != 0) {
            var1.lockGameTime_ = this.lockGameTime_;
         }

         if ((var2 & 64) != 0) {
            var1.midRespawnTime_ = this.midRespawnTime_;
         }

         EventGameOverviewMessage var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public EventGameOverviewMessage.Builder clone() {
         return (EventGameOverviewMessage.Builder)super.clone();
      }

      public EventGameOverviewMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (EventGameOverviewMessage.Builder)super.setField(var1, var2);
      }

      public EventGameOverviewMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (EventGameOverviewMessage.Builder)super.clearField(var1);
      }

      public EventGameOverviewMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (EventGameOverviewMessage.Builder)super.clearOneof(var1);
      }

      public EventGameOverviewMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (EventGameOverviewMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public EventGameOverviewMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (EventGameOverviewMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public EventGameOverviewMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof EventGameOverviewMessage) {
            return this.mergeFrom((EventGameOverviewMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public EventGameOverviewMessage.Builder mergeFrom(EventGameOverviewMessage var1) {
         if (var1 == EventGameOverviewMessage.getDefaultInstance()) {
            return this;
         }

         if (var1.hasTeamOneStatus()) {
            this.mergeTeamOneStatus(var1.getTeamOneStatus());
         }

         if (var1.hasTeamTwoStatus()) {
            this.mergeTeamTwoStatus(var1.getTeamTwoStatus());
         }

         if (var1.getTierThreeHealth() != 0.0F) {
            this.setTierThreeHealth(var1.getTierThreeHealth());
         }

         if (var1.getGameStartTime() != 0L) {
            this.setGameStartTime(var1.getGameStartTime());
         }

         if (var1.getWitherShields()) {
            this.setWitherShields(var1.getWitherShields());
         }

         if (var1.getLockGameTime()) {
            this.setLockGameTime(var1.getLockGameTime());
         }

         if (var1.getMidRespawnTime() != 0L) {
            this.setMidRespawnTime(var1.getMidRespawnTime());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public EventGameOverviewMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getTeamOneStatusFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     var1.readMessage(this.getTeamTwoStatusFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 2;
                     break;
                  case 29:
                     this.tierThreeHealth_ = var1.readFloat();
                     this.bitField0_ |= 4;
                     break;
                  case 32:
                     this.gameStartTime_ = var1.readInt64();
                     this.bitField0_ |= 8;
                     break;
                  case 40:
                     this.witherShields_ = var1.readBool();
                     this.bitField0_ |= 16;
                     break;
                  case 48:
                     this.lockGameTime_ = var1.readBool();
                     this.bitField0_ |= 32;
                     break;
                  case 56:
                     this.midRespawnTime_ = var1.readInt64();
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
      public boolean hasTeamOneStatus() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public EventTeamStatusMessage getTeamOneStatus() {
         if (this.teamOneStatusBuilder_ == null) {
            return this.teamOneStatus_ == null ? EventTeamStatusMessage.getDefaultInstance() : this.teamOneStatus_;
         } else {
            return this.teamOneStatusBuilder_.getMessage();
         }
      }

      public EventGameOverviewMessage.Builder setTeamOneStatus(EventTeamStatusMessage var1) {
         if (this.teamOneStatusBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.teamOneStatus_ = var1;
         } else {
            this.teamOneStatusBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public EventGameOverviewMessage.Builder setTeamOneStatus(EventTeamStatusMessage.Builder var1) {
         if (this.teamOneStatusBuilder_ == null) {
            this.teamOneStatus_ = var1.build();
         } else {
            this.teamOneStatusBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public EventGameOverviewMessage.Builder mergeTeamOneStatus(EventTeamStatusMessage var1) {
         if (this.teamOneStatusBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.teamOneStatus_ != null && this.teamOneStatus_ != EventTeamStatusMessage.getDefaultInstance()) {
               this.getTeamOneStatusBuilder().mergeFrom(var1);
            } else {
               this.teamOneStatus_ = var1;
            }
         } else {
            this.teamOneStatusBuilder_.mergeFrom(var1);
         }

         if (this.teamOneStatus_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public EventGameOverviewMessage.Builder clearTeamOneStatus() {
         this.bitField0_ &= -2;
         this.teamOneStatus_ = null;
         if (this.teamOneStatusBuilder_ != null) {
            this.teamOneStatusBuilder_.dispose();
            this.teamOneStatusBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public EventTeamStatusMessage.Builder getTeamOneStatusBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getTeamOneStatusFieldBuilder().getBuilder();
      }

      @Override
      public EventTeamStatusMessageOrBuilder getTeamOneStatusOrBuilder() {
         if (this.teamOneStatusBuilder_ != null) {
            return this.teamOneStatusBuilder_.getMessageOrBuilder();
         } else {
            return this.teamOneStatus_ == null ? EventTeamStatusMessage.getDefaultInstance() : this.teamOneStatus_;
         }
      }

      private SingleFieldBuilderV3<EventTeamStatusMessage, EventTeamStatusMessage.Builder, EventTeamStatusMessageOrBuilder> getTeamOneStatusFieldBuilder() {
         if (this.teamOneStatusBuilder_ == null) {
            this.teamOneStatusBuilder_ = new SingleFieldBuilderV3<>(this.getTeamOneStatus(), this.getParentForChildren(), this.isClean());
            this.teamOneStatus_ = null;
         }

         return this.teamOneStatusBuilder_;
      }

      @Override
      public boolean hasTeamTwoStatus() {
         return (this.bitField0_ & 2) != 0;
      }

      @Override
      public EventTeamStatusMessage getTeamTwoStatus() {
         if (this.teamTwoStatusBuilder_ == null) {
            return this.teamTwoStatus_ == null ? EventTeamStatusMessage.getDefaultInstance() : this.teamTwoStatus_;
         } else {
            return this.teamTwoStatusBuilder_.getMessage();
         }
      }

      public EventGameOverviewMessage.Builder setTeamTwoStatus(EventTeamStatusMessage var1) {
         if (this.teamTwoStatusBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.teamTwoStatus_ = var1;
         } else {
            this.teamTwoStatusBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public EventGameOverviewMessage.Builder setTeamTwoStatus(EventTeamStatusMessage.Builder var1) {
         if (this.teamTwoStatusBuilder_ == null) {
            this.teamTwoStatus_ = var1.build();
         } else {
            this.teamTwoStatusBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public EventGameOverviewMessage.Builder mergeTeamTwoStatus(EventTeamStatusMessage var1) {
         if (this.teamTwoStatusBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0 && this.teamTwoStatus_ != null && this.teamTwoStatus_ != EventTeamStatusMessage.getDefaultInstance()) {
               this.getTeamTwoStatusBuilder().mergeFrom(var1);
            } else {
               this.teamTwoStatus_ = var1;
            }
         } else {
            this.teamTwoStatusBuilder_.mergeFrom(var1);
         }

         if (this.teamTwoStatus_ != null) {
            this.bitField0_ |= 2;
            this.onChanged();
         }

         return this;
      }

      public EventGameOverviewMessage.Builder clearTeamTwoStatus() {
         this.bitField0_ &= -3;
         this.teamTwoStatus_ = null;
         if (this.teamTwoStatusBuilder_ != null) {
            this.teamTwoStatusBuilder_.dispose();
            this.teamTwoStatusBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public EventTeamStatusMessage.Builder getTeamTwoStatusBuilder() {
         this.bitField0_ |= 2;
         this.onChanged();
         return this.getTeamTwoStatusFieldBuilder().getBuilder();
      }

      @Override
      public EventTeamStatusMessageOrBuilder getTeamTwoStatusOrBuilder() {
         if (this.teamTwoStatusBuilder_ != null) {
            return this.teamTwoStatusBuilder_.getMessageOrBuilder();
         } else {
            return this.teamTwoStatus_ == null ? EventTeamStatusMessage.getDefaultInstance() : this.teamTwoStatus_;
         }
      }

      private SingleFieldBuilderV3<EventTeamStatusMessage, EventTeamStatusMessage.Builder, EventTeamStatusMessageOrBuilder> getTeamTwoStatusFieldBuilder() {
         if (this.teamTwoStatusBuilder_ == null) {
            this.teamTwoStatusBuilder_ = new SingleFieldBuilderV3<>(this.getTeamTwoStatus(), this.getParentForChildren(), this.isClean());
            this.teamTwoStatus_ = null;
         }

         return this.teamTwoStatusBuilder_;
      }

      @Override
      public float getTierThreeHealth() {
         return this.tierThreeHealth_;
      }

      public EventGameOverviewMessage.Builder setTierThreeHealth(float var1) {
         this.tierThreeHealth_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public EventGameOverviewMessage.Builder clearTierThreeHealth() {
         this.bitField0_ &= -5;
         this.tierThreeHealth_ = 0.0F;
         this.onChanged();
         return this;
      }

      @Override
      public long getGameStartTime() {
         return this.gameStartTime_;
      }

      public EventGameOverviewMessage.Builder setGameStartTime(long var1) {
         this.gameStartTime_ = var1;
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public EventGameOverviewMessage.Builder clearGameStartTime() {
         this.bitField0_ &= -9;
         this.gameStartTime_ = 0L;
         this.onChanged();
         return this;
      }

      @Override
      public boolean getWitherShields() {
         return this.witherShields_;
      }

      public EventGameOverviewMessage.Builder setWitherShields(boolean var1) {
         this.witherShields_ = var1;
         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      public EventGameOverviewMessage.Builder clearWitherShields() {
         this.bitField0_ &= -17;
         this.witherShields_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public boolean getLockGameTime() {
         return this.lockGameTime_;
      }

      public EventGameOverviewMessage.Builder setLockGameTime(boolean var1) {
         this.lockGameTime_ = var1;
         this.bitField0_ |= 32;
         this.onChanged();
         return this;
      }

      public EventGameOverviewMessage.Builder clearLockGameTime() {
         this.bitField0_ &= -33;
         this.lockGameTime_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public long getMidRespawnTime() {
         return this.midRespawnTime_;
      }

      public EventGameOverviewMessage.Builder setMidRespawnTime(long var1) {
         this.midRespawnTime_ = var1;
         this.bitField0_ |= 64;
         this.onChanged();
         return this;
      }

      public EventGameOverviewMessage.Builder clearMidRespawnTime() {
         this.bitField0_ &= -65;
         this.midRespawnTime_ = 0L;
         this.onChanged();
         return this;
      }

      public final EventGameOverviewMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (EventGameOverviewMessage.Builder)super.setUnknownFields(var1);
      }

      public final EventGameOverviewMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (EventGameOverviewMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
