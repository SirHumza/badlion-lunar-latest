package com.lunarclient.websocket.conversation.v1;

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
import com.google.protobuf.Parser;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class SystemMessage extends GeneratedMessageV3 implements SystemMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private int eventCase_ = 0;
   private Object event_;
   public static final int ACTOR_FIELD_NUMBER = 1;
   private ConversationSender actor_;
   public static final int PINNED_FIELD_NUMBER = 2;
   public static final int INVITE_FIELD_NUMBER = 3;
   public static final int LEAVE_FIELD_NUMBER = 4;
   public static final int NAME_CHANGE_FIELD_NUMBER = 5;
   public static final int ICON_CHANGE_FIELD_NUMBER = 6;
   private byte memoizedIsInitialized = -1;
   private static final SystemMessage DEFAULT_INSTANCE = new SystemMessage();
   private static final Parser<SystemMessage> PARSER = new AbstractParser<SystemMessage>() {
      public SystemMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         SystemMessage.Builder var3 = SystemMessage.newBuilder();

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

   private SystemMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private SystemMessage() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new SystemMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_conversation_v1_SystemMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_conversation_v1_SystemMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(SystemMessage.class, SystemMessage.Builder.class);
   }

   @Override
   public SystemMessage.EventCase getEventCase() {
      return SystemMessage.EventCase.forNumber(this.eventCase_);
   }

   @Override
   public boolean hasActor() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public ConversationSender getActor() {
      return this.actor_ == null ? ConversationSender.getDefaultInstance() : this.actor_;
   }

   @Override
   public ConversationSenderOrBuilder getActorOrBuilder() {
      return this.actor_ == null ? ConversationSender.getDefaultInstance() : this.actor_;
   }

   @Override
   public boolean hasPinned() {
      return this.eventCase_ == 2;
   }

   @Override
   public SystemPinnedMessageEvent getPinned() {
      return this.eventCase_ == 2 ? (SystemPinnedMessageEvent)this.event_ : SystemPinnedMessageEvent.getDefaultInstance();
   }

   @Override
   public SystemPinnedMessageEventOrBuilder getPinnedOrBuilder() {
      return this.eventCase_ == 2 ? (SystemPinnedMessageEvent)this.event_ : SystemPinnedMessageEvent.getDefaultInstance();
   }

   @Override
   public boolean hasInvite() {
      return this.eventCase_ == 3;
   }

   @Override
   public SystemInviteEvent getInvite() {
      return this.eventCase_ == 3 ? (SystemInviteEvent)this.event_ : SystemInviteEvent.getDefaultInstance();
   }

   @Override
   public SystemInviteEventOrBuilder getInviteOrBuilder() {
      return this.eventCase_ == 3 ? (SystemInviteEvent)this.event_ : SystemInviteEvent.getDefaultInstance();
   }

   @Override
   public boolean hasLeave() {
      return this.eventCase_ == 4;
   }

   @Override
   public SystemLeaveEvent getLeave() {
      return this.eventCase_ == 4 ? (SystemLeaveEvent)this.event_ : SystemLeaveEvent.getDefaultInstance();
   }

   @Override
   public SystemLeaveEventOrBuilder getLeaveOrBuilder() {
      return this.eventCase_ == 4 ? (SystemLeaveEvent)this.event_ : SystemLeaveEvent.getDefaultInstance();
   }

   @Override
   public boolean hasNameChange() {
      return this.eventCase_ == 5;
   }

   @Override
   public SystemNameChangeEvent getNameChange() {
      return this.eventCase_ == 5 ? (SystemNameChangeEvent)this.event_ : SystemNameChangeEvent.getDefaultInstance();
   }

   @Override
   public SystemNameChangeEventOrBuilder getNameChangeOrBuilder() {
      return this.eventCase_ == 5 ? (SystemNameChangeEvent)this.event_ : SystemNameChangeEvent.getDefaultInstance();
   }

   @Override
   public boolean hasIconChange() {
      return this.eventCase_ == 6;
   }

   @Override
   public SystemIconChangeEvent getIconChange() {
      return this.eventCase_ == 6 ? (SystemIconChangeEvent)this.event_ : SystemIconChangeEvent.getDefaultInstance();
   }

   @Override
   public SystemIconChangeEventOrBuilder getIconChangeOrBuilder() {
      return this.eventCase_ == 6 ? (SystemIconChangeEvent)this.event_ : SystemIconChangeEvent.getDefaultInstance();
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
         var1.writeMessage(1, this.getActor());
      }

      if (this.eventCase_ == 2) {
         var1.writeMessage(2, (SystemPinnedMessageEvent)this.event_);
      }

      if (this.eventCase_ == 3) {
         var1.writeMessage(3, (SystemInviteEvent)this.event_);
      }

      if (this.eventCase_ == 4) {
         var1.writeMessage(4, (SystemLeaveEvent)this.event_);
      }

      if (this.eventCase_ == 5) {
         var1.writeMessage(5, (SystemNameChangeEvent)this.event_);
      }

      if (this.eventCase_ == 6) {
         var1.writeMessage(6, (SystemIconChangeEvent)this.event_);
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
         var1 += CodedOutputStream.computeMessageSize(1, this.getActor());
      }

      if (this.eventCase_ == 2) {
         var1 += CodedOutputStream.computeMessageSize(2, (SystemPinnedMessageEvent)this.event_);
      }

      if (this.eventCase_ == 3) {
         var1 += CodedOutputStream.computeMessageSize(3, (SystemInviteEvent)this.event_);
      }

      if (this.eventCase_ == 4) {
         var1 += CodedOutputStream.computeMessageSize(4, (SystemLeaveEvent)this.event_);
      }

      if (this.eventCase_ == 5) {
         var1 += CodedOutputStream.computeMessageSize(5, (SystemNameChangeEvent)this.event_);
      }

      if (this.eventCase_ == 6) {
         var1 += CodedOutputStream.computeMessageSize(6, (SystemIconChangeEvent)this.event_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      }

      if (!(var1 instanceof SystemMessage)) {
         return super.equals(var1);
      }

      SystemMessage var2 = (SystemMessage)var1;
      if (this.hasActor() != var2.hasActor()) {
         return false;
      }

      if (this.hasActor() && !this.getActor().equals(var2.getActor())) {
         return false;
      }

      if (!this.getEventCase().equals(var2.getEventCase())) {
         return false;
      }

      switch (this.eventCase_) {
         case 0:
         case 1:
         default:
            break;
         case 2:
            if (!this.getPinned().equals(var2.getPinned())) {
               return false;
            }
            break;
         case 3:
            if (!this.getInvite().equals(var2.getInvite())) {
               return false;
            }
            break;
         case 4:
            if (!this.getLeave().equals(var2.getLeave())) {
               return false;
            }
            break;
         case 5:
            if (!this.getNameChange().equals(var2.getNameChange())) {
               return false;
            }
            break;
         case 6:
            if (!this.getIconChange().equals(var2.getIconChange())) {
               return false;
            }
      }

      return this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      if (this.hasActor()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getActor().hashCode();
      }

      switch (this.eventCase_) {
         case 0:
         case 1:
         default:
            break;
         case 2:
            var1 = 37 * var1 + 2;
            var1 = 53 * var1 + this.getPinned().hashCode();
            break;
         case 3:
            var1 = 37 * var1 + 3;
            var1 = 53 * var1 + this.getInvite().hashCode();
            break;
         case 4:
            var1 = 37 * var1 + 4;
            var1 = 53 * var1 + this.getLeave().hashCode();
            break;
         case 5:
            var1 = 37 * var1 + 5;
            var1 = 53 * var1 + this.getNameChange().hashCode();
            break;
         case 6:
            var1 = 37 * var1 + 6;
            var1 = 53 * var1 + this.getIconChange().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static SystemMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static SystemMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SystemMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static SystemMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SystemMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static SystemMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SystemMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SystemMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static SystemMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static SystemMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static SystemMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SystemMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public SystemMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static SystemMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static SystemMessage.Builder newBuilder(SystemMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public SystemMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new SystemMessage.Builder() : new SystemMessage.Builder().mergeFrom(this);
   }

   protected SystemMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new SystemMessage.Builder(var1);
   }

   public static SystemMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<SystemMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<SystemMessage> getParserForType() {
      return PARSER;
   }

   public SystemMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<SystemMessage.Builder> implements SystemMessageOrBuilder {
      private int eventCase_ = 0;
      private Object event_;
      private int bitField0_;
      private ConversationSender actor_;
      private SingleFieldBuilderV3<ConversationSender, ConversationSender.Builder, ConversationSenderOrBuilder> actorBuilder_;
      private SingleFieldBuilderV3<SystemPinnedMessageEvent, SystemPinnedMessageEvent.Builder, SystemPinnedMessageEventOrBuilder> pinnedBuilder_;
      private SingleFieldBuilderV3<SystemInviteEvent, SystemInviteEvent.Builder, SystemInviteEventOrBuilder> inviteBuilder_;
      private SingleFieldBuilderV3<SystemLeaveEvent, SystemLeaveEvent.Builder, SystemLeaveEventOrBuilder> leaveBuilder_;
      private SingleFieldBuilderV3<SystemNameChangeEvent, SystemNameChangeEvent.Builder, SystemNameChangeEventOrBuilder> nameChangeBuilder_;
      private SingleFieldBuilderV3<SystemIconChangeEvent, SystemIconChangeEvent.Builder, SystemIconChangeEventOrBuilder> iconChangeBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_conversation_v1_SystemMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_conversation_v1_SystemMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(SystemMessage.class, SystemMessage.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (SystemMessage.alwaysUseFieldBuilders) {
            this.getActorFieldBuilder();
         }
      }

      public SystemMessage.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.actor_ = null;
         if (this.actorBuilder_ != null) {
            this.actorBuilder_.dispose();
            this.actorBuilder_ = null;
         }

         if (this.pinnedBuilder_ != null) {
            this.pinnedBuilder_.clear();
         }

         if (this.inviteBuilder_ != null) {
            this.inviteBuilder_.clear();
         }

         if (this.leaveBuilder_ != null) {
            this.leaveBuilder_.clear();
         }

         if (this.nameChangeBuilder_ != null) {
            this.nameChangeBuilder_.clear();
         }

         if (this.iconChangeBuilder_ != null) {
            this.iconChangeBuilder_.clear();
         }

         this.eventCase_ = 0;
         this.event_ = null;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_conversation_v1_SystemMessage_descriptor;
      }

      public SystemMessage getDefaultInstanceForType() {
         return SystemMessage.getDefaultInstance();
      }

      public SystemMessage build() {
         SystemMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public SystemMessage buildPartial() {
         SystemMessage var1 = new SystemMessage(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.buildPartialOneofs(var1);
         this.onBuilt();
         return var1;
      }

      private void buildPartial0(SystemMessage var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.actor_ = this.actorBuilder_ == null ? this.actor_ : this.actorBuilder_.build();
            var3 |= 1;
         }

         SystemMessage var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      private void buildPartialOneofs(SystemMessage var1) {
         var1.eventCase_ = this.eventCase_;
         var1.event_ = this.event_;
         if (this.eventCase_ == 2 && this.pinnedBuilder_ != null) {
            var1.event_ = this.pinnedBuilder_.build();
         }

         if (this.eventCase_ == 3 && this.inviteBuilder_ != null) {
            var1.event_ = this.inviteBuilder_.build();
         }

         if (this.eventCase_ == 4 && this.leaveBuilder_ != null) {
            var1.event_ = this.leaveBuilder_.build();
         }

         if (this.eventCase_ == 5 && this.nameChangeBuilder_ != null) {
            var1.event_ = this.nameChangeBuilder_.build();
         }

         if (this.eventCase_ == 6 && this.iconChangeBuilder_ != null) {
            var1.event_ = this.iconChangeBuilder_.build();
         }
      }

      public SystemMessage.Builder clone() {
         return (SystemMessage.Builder)super.clone();
      }

      public SystemMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (SystemMessage.Builder)super.setField(var1, var2);
      }

      public SystemMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (SystemMessage.Builder)super.clearField(var1);
      }

      public SystemMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (SystemMessage.Builder)super.clearOneof(var1);
      }

      public SystemMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (SystemMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public SystemMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (SystemMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public SystemMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof SystemMessage) {
            return this.mergeFrom((SystemMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public SystemMessage.Builder mergeFrom(SystemMessage var1) {
         if (var1 == SystemMessage.getDefaultInstance()) {
            return this;
         }

         if (var1.hasActor()) {
            this.mergeActor(var1.getActor());
         }

         switch (var1.getEventCase()) {
            case PINNED:
               this.mergePinned(var1.getPinned());
               break;
            case INVITE:
               this.mergeInvite(var1.getInvite());
               break;
            case LEAVE:
               this.mergeLeave(var1.getLeave());
               break;
            case NAME_CHANGE:
               this.mergeNameChange(var1.getNameChange());
               break;
            case ICON_CHANGE:
               this.mergeIconChange(var1.getIconChange());
            case EVENT_NOT_SET:
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public SystemMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getActorFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     var1.readMessage(this.getPinnedFieldBuilder().getBuilder(), var2);
                     this.eventCase_ = 2;
                     break;
                  case 26:
                     var1.readMessage(this.getInviteFieldBuilder().getBuilder(), var2);
                     this.eventCase_ = 3;
                     break;
                  case 34:
                     var1.readMessage(this.getLeaveFieldBuilder().getBuilder(), var2);
                     this.eventCase_ = 4;
                     break;
                  case 42:
                     var1.readMessage(this.getNameChangeFieldBuilder().getBuilder(), var2);
                     this.eventCase_ = 5;
                     break;
                  case 50:
                     var1.readMessage(this.getIconChangeFieldBuilder().getBuilder(), var2);
                     this.eventCase_ = 6;
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
      public SystemMessage.EventCase getEventCase() {
         return SystemMessage.EventCase.forNumber(this.eventCase_);
      }

      public SystemMessage.Builder clearEvent() {
         this.eventCase_ = 0;
         this.event_ = null;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasActor() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public ConversationSender getActor() {
         if (this.actorBuilder_ == null) {
            return this.actor_ == null ? ConversationSender.getDefaultInstance() : this.actor_;
         } else {
            return this.actorBuilder_.getMessage();
         }
      }

      public SystemMessage.Builder setActor(ConversationSender var1) {
         if (this.actorBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.actor_ = var1;
         } else {
            this.actorBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public SystemMessage.Builder setActor(ConversationSender.Builder var1) {
         if (this.actorBuilder_ == null) {
            this.actor_ = var1.build();
         } else {
            this.actorBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public SystemMessage.Builder mergeActor(ConversationSender var1) {
         if (this.actorBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.actor_ != null && this.actor_ != ConversationSender.getDefaultInstance()) {
               this.getActorBuilder().mergeFrom(var1);
            } else {
               this.actor_ = var1;
            }
         } else {
            this.actorBuilder_.mergeFrom(var1);
         }

         if (this.actor_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public SystemMessage.Builder clearActor() {
         this.bitField0_ &= -2;
         this.actor_ = null;
         if (this.actorBuilder_ != null) {
            this.actorBuilder_.dispose();
            this.actorBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public ConversationSender.Builder getActorBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getActorFieldBuilder().getBuilder();
      }

      @Override
      public ConversationSenderOrBuilder getActorOrBuilder() {
         if (this.actorBuilder_ != null) {
            return this.actorBuilder_.getMessageOrBuilder();
         } else {
            return this.actor_ == null ? ConversationSender.getDefaultInstance() : this.actor_;
         }
      }

      private SingleFieldBuilderV3<ConversationSender, ConversationSender.Builder, ConversationSenderOrBuilder> getActorFieldBuilder() {
         if (this.actorBuilder_ == null) {
            this.actorBuilder_ = new SingleFieldBuilderV3<>(this.getActor(), this.getParentForChildren(), this.isClean());
            this.actor_ = null;
         }

         return this.actorBuilder_;
      }

      @Override
      public boolean hasPinned() {
         return this.eventCase_ == 2;
      }

      @Override
      public SystemPinnedMessageEvent getPinned() {
         if (this.pinnedBuilder_ == null) {
            return this.eventCase_ == 2 ? (SystemPinnedMessageEvent)this.event_ : SystemPinnedMessageEvent.getDefaultInstance();
         } else {
            return this.eventCase_ == 2 ? this.pinnedBuilder_.getMessage() : SystemPinnedMessageEvent.getDefaultInstance();
         }
      }

      public SystemMessage.Builder setPinned(SystemPinnedMessageEvent var1) {
         if (this.pinnedBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.event_ = var1;
            this.onChanged();
         } else {
            this.pinnedBuilder_.setMessage(var1);
         }

         this.eventCase_ = 2;
         return this;
      }

      public SystemMessage.Builder setPinned(SystemPinnedMessageEvent.Builder var1) {
         if (this.pinnedBuilder_ == null) {
            this.event_ = var1.build();
            this.onChanged();
         } else {
            this.pinnedBuilder_.setMessage(var1.build());
         }

         this.eventCase_ = 2;
         return this;
      }

      public SystemMessage.Builder mergePinned(SystemPinnedMessageEvent var1) {
         if (this.pinnedBuilder_ == null) {
            if (this.eventCase_ == 2 && this.event_ != SystemPinnedMessageEvent.getDefaultInstance()) {
               this.event_ = SystemPinnedMessageEvent.newBuilder((SystemPinnedMessageEvent)this.event_).mergeFrom(var1).buildPartial();
            } else {
               this.event_ = var1;
            }

            this.onChanged();
         } else if (this.eventCase_ == 2) {
            this.pinnedBuilder_.mergeFrom(var1);
         } else {
            this.pinnedBuilder_.setMessage(var1);
         }

         this.eventCase_ = 2;
         return this;
      }

      public SystemMessage.Builder clearPinned() {
         if (this.pinnedBuilder_ == null) {
            if (this.eventCase_ == 2) {
               this.eventCase_ = 0;
               this.event_ = null;
               this.onChanged();
            }
         } else {
            if (this.eventCase_ == 2) {
               this.eventCase_ = 0;
               this.event_ = null;
            }

            this.pinnedBuilder_.clear();
         }

         return this;
      }

      public SystemPinnedMessageEvent.Builder getPinnedBuilder() {
         return this.getPinnedFieldBuilder().getBuilder();
      }

      @Override
      public SystemPinnedMessageEventOrBuilder getPinnedOrBuilder() {
         if (this.eventCase_ == 2 && this.pinnedBuilder_ != null) {
            return this.pinnedBuilder_.getMessageOrBuilder();
         } else {
            return this.eventCase_ == 2 ? (SystemPinnedMessageEvent)this.event_ : SystemPinnedMessageEvent.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<SystemPinnedMessageEvent, SystemPinnedMessageEvent.Builder, SystemPinnedMessageEventOrBuilder> getPinnedFieldBuilder() {
         if (this.pinnedBuilder_ == null) {
            if (this.eventCase_ != 2) {
               this.event_ = SystemPinnedMessageEvent.getDefaultInstance();
            }

            this.pinnedBuilder_ = new SingleFieldBuilderV3<>((SystemPinnedMessageEvent)this.event_, this.getParentForChildren(), this.isClean());
            this.event_ = null;
         }

         this.eventCase_ = 2;
         this.onChanged();
         return this.pinnedBuilder_;
      }

      @Override
      public boolean hasInvite() {
         return this.eventCase_ == 3;
      }

      @Override
      public SystemInviteEvent getInvite() {
         if (this.inviteBuilder_ == null) {
            return this.eventCase_ == 3 ? (SystemInviteEvent)this.event_ : SystemInviteEvent.getDefaultInstance();
         } else {
            return this.eventCase_ == 3 ? this.inviteBuilder_.getMessage() : SystemInviteEvent.getDefaultInstance();
         }
      }

      public SystemMessage.Builder setInvite(SystemInviteEvent var1) {
         if (this.inviteBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.event_ = var1;
            this.onChanged();
         } else {
            this.inviteBuilder_.setMessage(var1);
         }

         this.eventCase_ = 3;
         return this;
      }

      public SystemMessage.Builder setInvite(SystemInviteEvent.Builder var1) {
         if (this.inviteBuilder_ == null) {
            this.event_ = var1.build();
            this.onChanged();
         } else {
            this.inviteBuilder_.setMessage(var1.build());
         }

         this.eventCase_ = 3;
         return this;
      }

      public SystemMessage.Builder mergeInvite(SystemInviteEvent var1) {
         if (this.inviteBuilder_ == null) {
            if (this.eventCase_ == 3 && this.event_ != SystemInviteEvent.getDefaultInstance()) {
               this.event_ = SystemInviteEvent.newBuilder((SystemInviteEvent)this.event_).mergeFrom(var1).buildPartial();
            } else {
               this.event_ = var1;
            }

            this.onChanged();
         } else if (this.eventCase_ == 3) {
            this.inviteBuilder_.mergeFrom(var1);
         } else {
            this.inviteBuilder_.setMessage(var1);
         }

         this.eventCase_ = 3;
         return this;
      }

      public SystemMessage.Builder clearInvite() {
         if (this.inviteBuilder_ == null) {
            if (this.eventCase_ == 3) {
               this.eventCase_ = 0;
               this.event_ = null;
               this.onChanged();
            }
         } else {
            if (this.eventCase_ == 3) {
               this.eventCase_ = 0;
               this.event_ = null;
            }

            this.inviteBuilder_.clear();
         }

         return this;
      }

      public SystemInviteEvent.Builder getInviteBuilder() {
         return this.getInviteFieldBuilder().getBuilder();
      }

      @Override
      public SystemInviteEventOrBuilder getInviteOrBuilder() {
         if (this.eventCase_ == 3 && this.inviteBuilder_ != null) {
            return this.inviteBuilder_.getMessageOrBuilder();
         } else {
            return this.eventCase_ == 3 ? (SystemInviteEvent)this.event_ : SystemInviteEvent.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<SystemInviteEvent, SystemInviteEvent.Builder, SystemInviteEventOrBuilder> getInviteFieldBuilder() {
         if (this.inviteBuilder_ == null) {
            if (this.eventCase_ != 3) {
               this.event_ = SystemInviteEvent.getDefaultInstance();
            }

            this.inviteBuilder_ = new SingleFieldBuilderV3<>((SystemInviteEvent)this.event_, this.getParentForChildren(), this.isClean());
            this.event_ = null;
         }

         this.eventCase_ = 3;
         this.onChanged();
         return this.inviteBuilder_;
      }

      @Override
      public boolean hasLeave() {
         return this.eventCase_ == 4;
      }

      @Override
      public SystemLeaveEvent getLeave() {
         if (this.leaveBuilder_ == null) {
            return this.eventCase_ == 4 ? (SystemLeaveEvent)this.event_ : SystemLeaveEvent.getDefaultInstance();
         } else {
            return this.eventCase_ == 4 ? this.leaveBuilder_.getMessage() : SystemLeaveEvent.getDefaultInstance();
         }
      }

      public SystemMessage.Builder setLeave(SystemLeaveEvent var1) {
         if (this.leaveBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.event_ = var1;
            this.onChanged();
         } else {
            this.leaveBuilder_.setMessage(var1);
         }

         this.eventCase_ = 4;
         return this;
      }

      public SystemMessage.Builder setLeave(SystemLeaveEvent.Builder var1) {
         if (this.leaveBuilder_ == null) {
            this.event_ = var1.build();
            this.onChanged();
         } else {
            this.leaveBuilder_.setMessage(var1.build());
         }

         this.eventCase_ = 4;
         return this;
      }

      public SystemMessage.Builder mergeLeave(SystemLeaveEvent var1) {
         if (this.leaveBuilder_ == null) {
            if (this.eventCase_ == 4 && this.event_ != SystemLeaveEvent.getDefaultInstance()) {
               this.event_ = SystemLeaveEvent.newBuilder((SystemLeaveEvent)this.event_).mergeFrom(var1).buildPartial();
            } else {
               this.event_ = var1;
            }

            this.onChanged();
         } else if (this.eventCase_ == 4) {
            this.leaveBuilder_.mergeFrom(var1);
         } else {
            this.leaveBuilder_.setMessage(var1);
         }

         this.eventCase_ = 4;
         return this;
      }

      public SystemMessage.Builder clearLeave() {
         if (this.leaveBuilder_ == null) {
            if (this.eventCase_ == 4) {
               this.eventCase_ = 0;
               this.event_ = null;
               this.onChanged();
            }
         } else {
            if (this.eventCase_ == 4) {
               this.eventCase_ = 0;
               this.event_ = null;
            }

            this.leaveBuilder_.clear();
         }

         return this;
      }

      public SystemLeaveEvent.Builder getLeaveBuilder() {
         return this.getLeaveFieldBuilder().getBuilder();
      }

      @Override
      public SystemLeaveEventOrBuilder getLeaveOrBuilder() {
         if (this.eventCase_ == 4 && this.leaveBuilder_ != null) {
            return this.leaveBuilder_.getMessageOrBuilder();
         } else {
            return this.eventCase_ == 4 ? (SystemLeaveEvent)this.event_ : SystemLeaveEvent.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<SystemLeaveEvent, SystemLeaveEvent.Builder, SystemLeaveEventOrBuilder> getLeaveFieldBuilder() {
         if (this.leaveBuilder_ == null) {
            if (this.eventCase_ != 4) {
               this.event_ = SystemLeaveEvent.getDefaultInstance();
            }

            this.leaveBuilder_ = new SingleFieldBuilderV3<>((SystemLeaveEvent)this.event_, this.getParentForChildren(), this.isClean());
            this.event_ = null;
         }

         this.eventCase_ = 4;
         this.onChanged();
         return this.leaveBuilder_;
      }

      @Override
      public boolean hasNameChange() {
         return this.eventCase_ == 5;
      }

      @Override
      public SystemNameChangeEvent getNameChange() {
         if (this.nameChangeBuilder_ == null) {
            return this.eventCase_ == 5 ? (SystemNameChangeEvent)this.event_ : SystemNameChangeEvent.getDefaultInstance();
         } else {
            return this.eventCase_ == 5 ? this.nameChangeBuilder_.getMessage() : SystemNameChangeEvent.getDefaultInstance();
         }
      }

      public SystemMessage.Builder setNameChange(SystemNameChangeEvent var1) {
         if (this.nameChangeBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.event_ = var1;
            this.onChanged();
         } else {
            this.nameChangeBuilder_.setMessage(var1);
         }

         this.eventCase_ = 5;
         return this;
      }

      public SystemMessage.Builder setNameChange(SystemNameChangeEvent.Builder var1) {
         if (this.nameChangeBuilder_ == null) {
            this.event_ = var1.build();
            this.onChanged();
         } else {
            this.nameChangeBuilder_.setMessage(var1.build());
         }

         this.eventCase_ = 5;
         return this;
      }

      public SystemMessage.Builder mergeNameChange(SystemNameChangeEvent var1) {
         if (this.nameChangeBuilder_ == null) {
            if (this.eventCase_ == 5 && this.event_ != SystemNameChangeEvent.getDefaultInstance()) {
               this.event_ = SystemNameChangeEvent.newBuilder((SystemNameChangeEvent)this.event_).mergeFrom(var1).buildPartial();
            } else {
               this.event_ = var1;
            }

            this.onChanged();
         } else if (this.eventCase_ == 5) {
            this.nameChangeBuilder_.mergeFrom(var1);
         } else {
            this.nameChangeBuilder_.setMessage(var1);
         }

         this.eventCase_ = 5;
         return this;
      }

      public SystemMessage.Builder clearNameChange() {
         if (this.nameChangeBuilder_ == null) {
            if (this.eventCase_ == 5) {
               this.eventCase_ = 0;
               this.event_ = null;
               this.onChanged();
            }
         } else {
            if (this.eventCase_ == 5) {
               this.eventCase_ = 0;
               this.event_ = null;
            }

            this.nameChangeBuilder_.clear();
         }

         return this;
      }

      public SystemNameChangeEvent.Builder getNameChangeBuilder() {
         return this.getNameChangeFieldBuilder().getBuilder();
      }

      @Override
      public SystemNameChangeEventOrBuilder getNameChangeOrBuilder() {
         if (this.eventCase_ == 5 && this.nameChangeBuilder_ != null) {
            return this.nameChangeBuilder_.getMessageOrBuilder();
         } else {
            return this.eventCase_ == 5 ? (SystemNameChangeEvent)this.event_ : SystemNameChangeEvent.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<SystemNameChangeEvent, SystemNameChangeEvent.Builder, SystemNameChangeEventOrBuilder> getNameChangeFieldBuilder() {
         if (this.nameChangeBuilder_ == null) {
            if (this.eventCase_ != 5) {
               this.event_ = SystemNameChangeEvent.getDefaultInstance();
            }

            this.nameChangeBuilder_ = new SingleFieldBuilderV3<>((SystemNameChangeEvent)this.event_, this.getParentForChildren(), this.isClean());
            this.event_ = null;
         }

         this.eventCase_ = 5;
         this.onChanged();
         return this.nameChangeBuilder_;
      }

      @Override
      public boolean hasIconChange() {
         return this.eventCase_ == 6;
      }

      @Override
      public SystemIconChangeEvent getIconChange() {
         if (this.iconChangeBuilder_ == null) {
            return this.eventCase_ == 6 ? (SystemIconChangeEvent)this.event_ : SystemIconChangeEvent.getDefaultInstance();
         } else {
            return this.eventCase_ == 6 ? this.iconChangeBuilder_.getMessage() : SystemIconChangeEvent.getDefaultInstance();
         }
      }

      public SystemMessage.Builder setIconChange(SystemIconChangeEvent var1) {
         if (this.iconChangeBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.event_ = var1;
            this.onChanged();
         } else {
            this.iconChangeBuilder_.setMessage(var1);
         }

         this.eventCase_ = 6;
         return this;
      }

      public SystemMessage.Builder setIconChange(SystemIconChangeEvent.Builder var1) {
         if (this.iconChangeBuilder_ == null) {
            this.event_ = var1.build();
            this.onChanged();
         } else {
            this.iconChangeBuilder_.setMessage(var1.build());
         }

         this.eventCase_ = 6;
         return this;
      }

      public SystemMessage.Builder mergeIconChange(SystemIconChangeEvent var1) {
         if (this.iconChangeBuilder_ == null) {
            if (this.eventCase_ == 6 && this.event_ != SystemIconChangeEvent.getDefaultInstance()) {
               this.event_ = SystemIconChangeEvent.newBuilder((SystemIconChangeEvent)this.event_).mergeFrom(var1).buildPartial();
            } else {
               this.event_ = var1;
            }

            this.onChanged();
         } else if (this.eventCase_ == 6) {
            this.iconChangeBuilder_.mergeFrom(var1);
         } else {
            this.iconChangeBuilder_.setMessage(var1);
         }

         this.eventCase_ = 6;
         return this;
      }

      public SystemMessage.Builder clearIconChange() {
         if (this.iconChangeBuilder_ == null) {
            if (this.eventCase_ == 6) {
               this.eventCase_ = 0;
               this.event_ = null;
               this.onChanged();
            }
         } else {
            if (this.eventCase_ == 6) {
               this.eventCase_ = 0;
               this.event_ = null;
            }

            this.iconChangeBuilder_.clear();
         }

         return this;
      }

      public SystemIconChangeEvent.Builder getIconChangeBuilder() {
         return this.getIconChangeFieldBuilder().getBuilder();
      }

      @Override
      public SystemIconChangeEventOrBuilder getIconChangeOrBuilder() {
         if (this.eventCase_ == 6 && this.iconChangeBuilder_ != null) {
            return this.iconChangeBuilder_.getMessageOrBuilder();
         } else {
            return this.eventCase_ == 6 ? (SystemIconChangeEvent)this.event_ : SystemIconChangeEvent.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<SystemIconChangeEvent, SystemIconChangeEvent.Builder, SystemIconChangeEventOrBuilder> getIconChangeFieldBuilder() {
         if (this.iconChangeBuilder_ == null) {
            if (this.eventCase_ != 6) {
               this.event_ = SystemIconChangeEvent.getDefaultInstance();
            }

            this.iconChangeBuilder_ = new SingleFieldBuilderV3<>((SystemIconChangeEvent)this.event_, this.getParentForChildren(), this.isClean());
            this.event_ = null;
         }

         this.eventCase_ = 6;
         this.onChanged();
         return this.iconChangeBuilder_;
      }

      public final SystemMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (SystemMessage.Builder)super.setUnknownFields(var1);
      }

      public final SystemMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (SystemMessage.Builder)super.mergeUnknownFields(var1);
      }
   }

   public enum EventCase implements AbstractMessageLite.InternalOneOfEnum, Internal.EnumLite {
      PINNED(2),
      INVITE(3),
      LEAVE(4),
      NAME_CHANGE(5),
      ICON_CHANGE(6),
      EVENT_NOT_SET(0);

      private final int value;

      EventCase(int var3) {
         this.value = var3;
      }

      @Deprecated
      public static SystemMessage.EventCase valueOf(int var0) {
         return forNumber(var0);
      }

      public static SystemMessage.EventCase forNumber(int var0) {
         switch (var0) {
            case 0:
               return EVENT_NOT_SET;
            case 1:
            default:
               return null;
            case 2:
               return PINNED;
            case 3:
               return INVITE;
            case 4:
               return LEAVE;
            case 5:
               return NAME_CHANGE;
            case 6:
               return ICON_CHANGE;
         }
      }

      @Override
      public int getNumber() {
         return this.value;
      }
   }
}
