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

public final class EventPlayerMessage extends GeneratedMessageV3 implements EventPlayerMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int PLAYER_UUID_FIELD_NUMBER = 1;
   private Uuid playerUuid_;
   public static final int PLAYER_NAME_ADVENTURE_FIELD_NUMBER = 2;
   private volatile Object playerNameAdventure_ = "";
   public static final int CHARACTER_TYPE_FIELD_NUMBER = 3;
   private int characterType_ = 0;
   public static final int TEAM_ONE_FIELD_NUMBER = 4;
   private boolean teamOne_ = false;
   private byte memoizedIsInitialized = -1;
   private static final EventPlayerMessage DEFAULT_INSTANCE = new EventPlayerMessage();
   private static final Parser<EventPlayerMessage> PARSER = new AbstractParser<EventPlayerMessage>() {
      public EventPlayerMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         EventPlayerMessage.Builder var3 = EventPlayerMessage.newBuilder();

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

   private EventPlayerMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private EventPlayerMessage() {
      this.playerNameAdventure_ = "";
      this.characterType_ = 0;
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new EventPlayerMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return EventProto.internal_static_lunarclient_apollo_evnt_v1_EventPlayerMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return EventProto.internal_static_lunarclient_apollo_evnt_v1_EventPlayerMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(EventPlayerMessage.class, EventPlayerMessage.Builder.class);
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
   public String getPlayerNameAdventure() {
      Object var1 = this.playerNameAdventure_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.playerNameAdventure_ = var3;
      return var3;
   }

   @Override
   public ByteString getPlayerNameAdventureBytes() {
      Object var1 = this.playerNameAdventure_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.playerNameAdventure_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public int getCharacterTypeValue() {
      return this.characterType_;
   }

   @Override
   public CharacterType getCharacterType() {
      CharacterType var1 = CharacterType.forNumber(this.characterType_);
      return var1 == null ? CharacterType.UNRECOGNIZED : var1;
   }

   @Override
   public boolean getTeamOne() {
      return this.teamOne_;
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

      if (!GeneratedMessageV3.isStringEmpty(this.playerNameAdventure_)) {
         GeneratedMessageV3.writeString(var1, 2, this.playerNameAdventure_);
      }

      if (this.characterType_ != CharacterType.CHARACTER_TYPE_UNSPECIFIED.getNumber()) {
         var1.writeEnum(3, this.characterType_);
      }

      if (this.teamOne_) {
         var1.writeBool(4, this.teamOne_);
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

      if (!GeneratedMessageV3.isStringEmpty(this.playerNameAdventure_)) {
         var1 += GeneratedMessageV3.computeStringSize(2, this.playerNameAdventure_);
      }

      if (this.characterType_ != CharacterType.CHARACTER_TYPE_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(3, this.characterType_);
      }

      if (this.teamOne_) {
         var1 += CodedOutputStream.computeBoolSize(4, this.teamOne_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof EventPlayerMessage)) {
         return super.equals(var1);
      } else {
         EventPlayerMessage var2 = (EventPlayerMessage)var1;
         if (this.hasPlayerUuid() != var2.hasPlayerUuid()) {
            return false;
         } else if (this.hasPlayerUuid() && !this.getPlayerUuid().equals(var2.getPlayerUuid())) {
            return false;
         } else if (!this.getPlayerNameAdventure().equals(var2.getPlayerNameAdventure())) {
            return false;
         } else if (this.characterType_ != var2.characterType_) {
            return false;
         } else {
            return this.getTeamOne() != var2.getTeamOne() ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + this.getPlayerNameAdventure().hashCode();
      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + this.characterType_;
      var1 = 37 * var1 + 4;
      var1 = 53 * var1 + Internal.hashBoolean(this.getTeamOne());
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static EventPlayerMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static EventPlayerMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static EventPlayerMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static EventPlayerMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static EventPlayerMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static EventPlayerMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static EventPlayerMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static EventPlayerMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static EventPlayerMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static EventPlayerMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static EventPlayerMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static EventPlayerMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public EventPlayerMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static EventPlayerMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static EventPlayerMessage.Builder newBuilder(EventPlayerMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public EventPlayerMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new EventPlayerMessage.Builder() : new EventPlayerMessage.Builder().mergeFrom(this);
   }

   protected EventPlayerMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new EventPlayerMessage.Builder(var1);
   }

   public static EventPlayerMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<EventPlayerMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<EventPlayerMessage> getParserForType() {
      return PARSER;
   }

   public EventPlayerMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<EventPlayerMessage.Builder> implements EventPlayerMessageOrBuilder {
      private int bitField0_;
      private Uuid playerUuid_;
      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> playerUuidBuilder_;
      private Object playerNameAdventure_ = "";
      private int characterType_ = 0;
      private boolean teamOne_;

      public static final Descriptors.Descriptor getDescriptor() {
         return EventProto.internal_static_lunarclient_apollo_evnt_v1_EventPlayerMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return EventProto.internal_static_lunarclient_apollo_evnt_v1_EventPlayerMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(EventPlayerMessage.class, EventPlayerMessage.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (EventPlayerMessage.alwaysUseFieldBuilders) {
            this.getPlayerUuidFieldBuilder();
         }
      }

      public EventPlayerMessage.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.playerUuid_ = null;
         if (this.playerUuidBuilder_ != null) {
            this.playerUuidBuilder_.dispose();
            this.playerUuidBuilder_ = null;
         }

         this.playerNameAdventure_ = "";
         this.characterType_ = 0;
         this.teamOne_ = false;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return EventProto.internal_static_lunarclient_apollo_evnt_v1_EventPlayerMessage_descriptor;
      }

      public EventPlayerMessage getDefaultInstanceForType() {
         return EventPlayerMessage.getDefaultInstance();
      }

      public EventPlayerMessage build() {
         EventPlayerMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public EventPlayerMessage buildPartial() {
         EventPlayerMessage var1 = new EventPlayerMessage(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(EventPlayerMessage var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.playerUuid_ = this.playerUuidBuilder_ == null ? this.playerUuid_ : this.playerUuidBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.playerNameAdventure_ = this.playerNameAdventure_;
         }

         if ((var2 & 4) != 0) {
            var1.characterType_ = this.characterType_;
         }

         if ((var2 & 8) != 0) {
            var1.teamOne_ = this.teamOne_;
         }

         EventPlayerMessage var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public EventPlayerMessage.Builder clone() {
         return (EventPlayerMessage.Builder)super.clone();
      }

      public EventPlayerMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (EventPlayerMessage.Builder)super.setField(var1, var2);
      }

      public EventPlayerMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (EventPlayerMessage.Builder)super.clearField(var1);
      }

      public EventPlayerMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (EventPlayerMessage.Builder)super.clearOneof(var1);
      }

      public EventPlayerMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (EventPlayerMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public EventPlayerMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (EventPlayerMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public EventPlayerMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof EventPlayerMessage) {
            return this.mergeFrom((EventPlayerMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public EventPlayerMessage.Builder mergeFrom(EventPlayerMessage var1) {
         if (var1 == EventPlayerMessage.getDefaultInstance()) {
            return this;
         }

         if (var1.hasPlayerUuid()) {
            this.mergePlayerUuid(var1.getPlayerUuid());
         }

         if (!var1.getPlayerNameAdventure().isEmpty()) {
            this.playerNameAdventure_ = var1.playerNameAdventure_;
            this.bitField0_ |= 2;
            this.onChanged();
         }

         if (var1.characterType_ != 0) {
            this.setCharacterTypeValue(var1.getCharacterTypeValue());
         }

         if (var1.getTeamOne()) {
            this.setTeamOne(var1.getTeamOne());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public EventPlayerMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.playerNameAdventure_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 2;
                     break;
                  case 24:
                     this.characterType_ = var1.readEnum();
                     this.bitField0_ |= 4;
                     break;
                  case 32:
                     this.teamOne_ = var1.readBool();
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

      public EventPlayerMessage.Builder setPlayerUuid(Uuid var1) {
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

      public EventPlayerMessage.Builder setPlayerUuid(Uuid.Builder var1) {
         if (this.playerUuidBuilder_ == null) {
            this.playerUuid_ = var1.build();
         } else {
            this.playerUuidBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public EventPlayerMessage.Builder mergePlayerUuid(Uuid var1) {
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

      public EventPlayerMessage.Builder clearPlayerUuid() {
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
      public String getPlayerNameAdventure() {
         Object var1 = this.playerNameAdventure_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.playerNameAdventure_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getPlayerNameAdventureBytes() {
         Object var1 = this.playerNameAdventure_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.playerNameAdventure_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public EventPlayerMessage.Builder setPlayerNameAdventure(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.playerNameAdventure_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public EventPlayerMessage.Builder clearPlayerNameAdventure() {
         this.playerNameAdventure_ = EventPlayerMessage.getDefaultInstance().getPlayerNameAdventure();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      public EventPlayerMessage.Builder setPlayerNameAdventureBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         EventPlayerMessage.checkByteStringIsUtf8(var1);
         this.playerNameAdventure_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      @Override
      public int getCharacterTypeValue() {
         return this.characterType_;
      }

      public EventPlayerMessage.Builder setCharacterTypeValue(int var1) {
         this.characterType_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      @Override
      public CharacterType getCharacterType() {
         CharacterType var1 = CharacterType.forNumber(this.characterType_);
         return var1 == null ? CharacterType.UNRECOGNIZED : var1;
      }

      public EventPlayerMessage.Builder setCharacterType(CharacterType var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 4;
         this.characterType_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public EventPlayerMessage.Builder clearCharacterType() {
         this.bitField0_ &= -5;
         this.characterType_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public boolean getTeamOne() {
         return this.teamOne_;
      }

      public EventPlayerMessage.Builder setTeamOne(boolean var1) {
         this.teamOne_ = var1;
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public EventPlayerMessage.Builder clearTeamOne() {
         this.bitField0_ &= -9;
         this.teamOne_ = false;
         this.onChanged();
         return this;
      }

      public final EventPlayerMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (EventPlayerMessage.Builder)super.setUnknownFields(var1);
      }

      public final EventPlayerMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (EventPlayerMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
