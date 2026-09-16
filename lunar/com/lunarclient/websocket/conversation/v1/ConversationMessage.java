package com.lunarclient.websocket.conversation.v1;

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
import com.google.protobuf.Timestamp;
import com.google.protobuf.TimestampOrBuilder;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import com.lunarclient.common.v1.Uuid;
import com.lunarclient.common.v1.UuidOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class ConversationMessage extends GeneratedMessageV3 implements ConversationMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int ID_FIELD_NUMBER = 1;
   private Uuid id_;
   public static final int SENT_AT_FIELD_NUMBER = 2;
   private Timestamp sentAt_;
   public static final int SENDER_FIELD_NUMBER = 3;
   private ConversationSender sender_;
   public static final int CONTENTS_FIELD_NUMBER = 4;
   private ConversationMessageContents contents_;
   public static final int KIND_FIELD_NUMBER = 5;
   private int kind_ = 0;
   public static final int PINNED_FIELD_NUMBER = 6;
   private boolean pinned_ = false;
   private byte memoizedIsInitialized = -1;
   private static final ConversationMessage DEFAULT_INSTANCE = new ConversationMessage();
   private static final Parser<ConversationMessage> PARSER = new AbstractParser<ConversationMessage>() {
      public ConversationMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         ConversationMessage.Builder var3 = ConversationMessage.newBuilder();

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

   private ConversationMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private ConversationMessage() {
      this.kind_ = 0;
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new ConversationMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_conversation_v1_ConversationMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_conversation_v1_ConversationMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(ConversationMessage.class, ConversationMessage.Builder.class);
   }

   @Override
   public boolean hasId() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public Uuid getId() {
      return this.id_ == null ? Uuid.getDefaultInstance() : this.id_;
   }

   @Override
   public UuidOrBuilder getIdOrBuilder() {
      return this.id_ == null ? Uuid.getDefaultInstance() : this.id_;
   }

   @Override
   public boolean hasSentAt() {
      return (this.bitField0_ & 2) != 0;
   }

   @Override
   public Timestamp getSentAt() {
      return this.sentAt_ == null ? Timestamp.getDefaultInstance() : this.sentAt_;
   }

   @Override
   public TimestampOrBuilder getSentAtOrBuilder() {
      return this.sentAt_ == null ? Timestamp.getDefaultInstance() : this.sentAt_;
   }

   @Override
   public boolean hasSender() {
      return (this.bitField0_ & 4) != 0;
   }

   @Override
   public ConversationSender getSender() {
      return this.sender_ == null ? ConversationSender.getDefaultInstance() : this.sender_;
   }

   @Override
   public ConversationSenderOrBuilder getSenderOrBuilder() {
      return this.sender_ == null ? ConversationSender.getDefaultInstance() : this.sender_;
   }

   @Override
   public boolean hasContents() {
      return (this.bitField0_ & 8) != 0;
   }

   @Override
   public ConversationMessageContents getContents() {
      return this.contents_ == null ? ConversationMessageContents.getDefaultInstance() : this.contents_;
   }

   @Override
   public ConversationMessageContentsOrBuilder getContentsOrBuilder() {
      return this.contents_ == null ? ConversationMessageContents.getDefaultInstance() : this.contents_;
   }

   @Override
   public int getKindValue() {
      return this.kind_;
   }

   @Override
   public ConversationMessageKind getKind() {
      ConversationMessageKind var1 = ConversationMessageKind.forNumber(this.kind_);
      return var1 == null ? ConversationMessageKind.UNRECOGNIZED : var1;
   }

   @Override
   public boolean getPinned() {
      return this.pinned_;
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
         var1.writeMessage(1, this.getId());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1.writeMessage(2, this.getSentAt());
      }

      if ((this.bitField0_ & 4) != 0) {
         var1.writeMessage(3, this.getSender());
      }

      if ((this.bitField0_ & 8) != 0) {
         var1.writeMessage(4, this.getContents());
      }

      if (this.kind_ != ConversationMessageKind.CONVERSATION_MESSAGE_KIND_UNSPECIFIED.getNumber()) {
         var1.writeEnum(5, this.kind_);
      }

      if (this.pinned_) {
         var1.writeBool(6, this.pinned_);
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
         var1 += CodedOutputStream.computeMessageSize(1, this.getId());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1 += CodedOutputStream.computeMessageSize(2, this.getSentAt());
      }

      if ((this.bitField0_ & 4) != 0) {
         var1 += CodedOutputStream.computeMessageSize(3, this.getSender());
      }

      if ((this.bitField0_ & 8) != 0) {
         var1 += CodedOutputStream.computeMessageSize(4, this.getContents());
      }

      if (this.kind_ != ConversationMessageKind.CONVERSATION_MESSAGE_KIND_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(5, this.kind_);
      }

      if (this.pinned_) {
         var1 += CodedOutputStream.computeBoolSize(6, this.pinned_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof ConversationMessage)) {
         return super.equals(var1);
      } else {
         ConversationMessage var2 = (ConversationMessage)var1;
         if (this.hasId() != var2.hasId()) {
            return false;
         } else if (this.hasId() && !this.getId().equals(var2.getId())) {
            return false;
         } else if (this.hasSentAt() != var2.hasSentAt()) {
            return false;
         } else if (this.hasSentAt() && !this.getSentAt().equals(var2.getSentAt())) {
            return false;
         } else if (this.hasSender() != var2.hasSender()) {
            return false;
         } else if (this.hasSender() && !this.getSender().equals(var2.getSender())) {
            return false;
         } else if (this.hasContents() != var2.hasContents()) {
            return false;
         } else if (this.hasContents() && !this.getContents().equals(var2.getContents())) {
            return false;
         } else if (this.kind_ != var2.kind_) {
            return false;
         } else {
            return this.getPinned() != var2.getPinned() ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.hasId()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getId().hashCode();
      }

      if (this.hasSentAt()) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getSentAt().hashCode();
      }

      if (this.hasSender()) {
         var1 = 37 * var1 + 3;
         var1 = 53 * var1 + this.getSender().hashCode();
      }

      if (this.hasContents()) {
         var1 = 37 * var1 + 4;
         var1 = 53 * var1 + this.getContents().hashCode();
      }

      var1 = 37 * var1 + 5;
      var1 = 53 * var1 + this.kind_;
      var1 = 37 * var1 + 6;
      var1 = 53 * var1 + Internal.hashBoolean(this.getPinned());
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static ConversationMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static ConversationMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ConversationMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static ConversationMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ConversationMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static ConversationMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ConversationMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ConversationMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ConversationMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ConversationMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ConversationMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ConversationMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public ConversationMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static ConversationMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ConversationMessage.Builder newBuilder(ConversationMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public ConversationMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new ConversationMessage.Builder() : new ConversationMessage.Builder().mergeFrom(this);
   }

   protected ConversationMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new ConversationMessage.Builder(var1);
   }

   public static ConversationMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<ConversationMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<ConversationMessage> getParserForType() {
      return PARSER;
   }

   public ConversationMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<ConversationMessage.Builder> implements ConversationMessageOrBuilder {
      private int bitField0_;
      private Uuid id_;
      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> idBuilder_;
      private Timestamp sentAt_;
      private SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> sentAtBuilder_;
      private ConversationSender sender_;
      private SingleFieldBuilderV3<ConversationSender, ConversationSender.Builder, ConversationSenderOrBuilder> senderBuilder_;
      private ConversationMessageContents contents_;
      private SingleFieldBuilderV3<ConversationMessageContents, ConversationMessageContents.Builder, ConversationMessageContentsOrBuilder> contentsBuilder_;
      private int kind_ = 0;
      private boolean pinned_;

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_conversation_v1_ConversationMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_conversation_v1_ConversationMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ConversationMessage.class, ConversationMessage.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (ConversationMessage.alwaysUseFieldBuilders) {
            this.getIdFieldBuilder();
            this.getSentAtFieldBuilder();
            this.getSenderFieldBuilder();
            this.getContentsFieldBuilder();
         }
      }

      public ConversationMessage.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.id_ = null;
         if (this.idBuilder_ != null) {
            this.idBuilder_.dispose();
            this.idBuilder_ = null;
         }

         this.sentAt_ = null;
         if (this.sentAtBuilder_ != null) {
            this.sentAtBuilder_.dispose();
            this.sentAtBuilder_ = null;
         }

         this.sender_ = null;
         if (this.senderBuilder_ != null) {
            this.senderBuilder_.dispose();
            this.senderBuilder_ = null;
         }

         this.contents_ = null;
         if (this.contentsBuilder_ != null) {
            this.contentsBuilder_.dispose();
            this.contentsBuilder_ = null;
         }

         this.kind_ = 0;
         this.pinned_ = false;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_conversation_v1_ConversationMessage_descriptor;
      }

      public ConversationMessage getDefaultInstanceForType() {
         return ConversationMessage.getDefaultInstance();
      }

      public ConversationMessage build() {
         ConversationMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public ConversationMessage buildPartial() {
         ConversationMessage var1 = new ConversationMessage(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(ConversationMessage var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.id_ = this.idBuilder_ == null ? this.id_ : this.idBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.sentAt_ = this.sentAtBuilder_ == null ? this.sentAt_ : this.sentAtBuilder_.build();
            var3 |= 2;
         }

         if ((var2 & 4) != 0) {
            var1.sender_ = this.senderBuilder_ == null ? this.sender_ : this.senderBuilder_.build();
            var3 |= 4;
         }

         if ((var2 & 8) != 0) {
            var1.contents_ = this.contentsBuilder_ == null ? this.contents_ : this.contentsBuilder_.build();
            var3 |= 8;
         }

         if ((var2 & 16) != 0) {
            var1.kind_ = this.kind_;
         }

         if ((var2 & 32) != 0) {
            var1.pinned_ = this.pinned_;
         }

         ConversationMessage var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public ConversationMessage.Builder clone() {
         return (ConversationMessage.Builder)super.clone();
      }

      public ConversationMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ConversationMessage.Builder)super.setField(var1, var2);
      }

      public ConversationMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (ConversationMessage.Builder)super.clearField(var1);
      }

      public ConversationMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (ConversationMessage.Builder)super.clearOneof(var1);
      }

      public ConversationMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (ConversationMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public ConversationMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ConversationMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public ConversationMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof ConversationMessage) {
            return this.mergeFrom((ConversationMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public ConversationMessage.Builder mergeFrom(ConversationMessage var1) {
         if (var1 == ConversationMessage.getDefaultInstance()) {
            return this;
         }

         if (var1.hasId()) {
            this.mergeId(var1.getId());
         }

         if (var1.hasSentAt()) {
            this.mergeSentAt(var1.getSentAt());
         }

         if (var1.hasSender()) {
            this.mergeSender(var1.getSender());
         }

         if (var1.hasContents()) {
            this.mergeContents(var1.getContents());
         }

         if (var1.kind_ != 0) {
            this.setKindValue(var1.getKindValue());
         }

         if (var1.getPinned()) {
            this.setPinned(var1.getPinned());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public ConversationMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getIdFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     var1.readMessage(this.getSentAtFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 2;
                     break;
                  case 26:
                     var1.readMessage(this.getSenderFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 4;
                     break;
                  case 34:
                     var1.readMessage(this.getContentsFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 8;
                     break;
                  case 40:
                     this.kind_ = var1.readEnum();
                     this.bitField0_ |= 16;
                     break;
                  case 48:
                     this.pinned_ = var1.readBool();
                     this.bitField0_ |= 32;
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
      public boolean hasId() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public Uuid getId() {
         if (this.idBuilder_ == null) {
            return this.id_ == null ? Uuid.getDefaultInstance() : this.id_;
         } else {
            return this.idBuilder_.getMessage();
         }
      }

      public ConversationMessage.Builder setId(Uuid var1) {
         if (this.idBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.id_ = var1;
         } else {
            this.idBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public ConversationMessage.Builder setId(Uuid.Builder var1) {
         if (this.idBuilder_ == null) {
            this.id_ = var1.build();
         } else {
            this.idBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public ConversationMessage.Builder mergeId(Uuid var1) {
         if (this.idBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.id_ != null && this.id_ != Uuid.getDefaultInstance()) {
               this.getIdBuilder().mergeFrom(var1);
            } else {
               this.id_ = var1;
            }
         } else {
            this.idBuilder_.mergeFrom(var1);
         }

         if (this.id_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public ConversationMessage.Builder clearId() {
         this.bitField0_ &= -2;
         this.id_ = null;
         if (this.idBuilder_ != null) {
            this.idBuilder_.dispose();
            this.idBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Uuid.Builder getIdBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getIdFieldBuilder().getBuilder();
      }

      @Override
      public UuidOrBuilder getIdOrBuilder() {
         if (this.idBuilder_ != null) {
            return this.idBuilder_.getMessageOrBuilder();
         } else {
            return this.id_ == null ? Uuid.getDefaultInstance() : this.id_;
         }
      }

      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> getIdFieldBuilder() {
         if (this.idBuilder_ == null) {
            this.idBuilder_ = new SingleFieldBuilderV3<>(this.getId(), this.getParentForChildren(), this.isClean());
            this.id_ = null;
         }

         return this.idBuilder_;
      }

      @Override
      public boolean hasSentAt() {
         return (this.bitField0_ & 2) != 0;
      }

      @Override
      public Timestamp getSentAt() {
         if (this.sentAtBuilder_ == null) {
            return this.sentAt_ == null ? Timestamp.getDefaultInstance() : this.sentAt_;
         } else {
            return this.sentAtBuilder_.getMessage();
         }
      }

      public ConversationMessage.Builder setSentAt(Timestamp var1) {
         if (this.sentAtBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.sentAt_ = var1;
         } else {
            this.sentAtBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public ConversationMessage.Builder setSentAt(Timestamp.Builder var1) {
         if (this.sentAtBuilder_ == null) {
            this.sentAt_ = var1.build();
         } else {
            this.sentAtBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public ConversationMessage.Builder mergeSentAt(Timestamp var1) {
         if (this.sentAtBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0 && this.sentAt_ != null && this.sentAt_ != Timestamp.getDefaultInstance()) {
               this.getSentAtBuilder().mergeFrom(var1);
            } else {
               this.sentAt_ = var1;
            }
         } else {
            this.sentAtBuilder_.mergeFrom(var1);
         }

         if (this.sentAt_ != null) {
            this.bitField0_ |= 2;
            this.onChanged();
         }

         return this;
      }

      public ConversationMessage.Builder clearSentAt() {
         this.bitField0_ &= -3;
         this.sentAt_ = null;
         if (this.sentAtBuilder_ != null) {
            this.sentAtBuilder_.dispose();
            this.sentAtBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Timestamp.Builder getSentAtBuilder() {
         this.bitField0_ |= 2;
         this.onChanged();
         return this.getSentAtFieldBuilder().getBuilder();
      }

      @Override
      public TimestampOrBuilder getSentAtOrBuilder() {
         if (this.sentAtBuilder_ != null) {
            return this.sentAtBuilder_.getMessageOrBuilder();
         } else {
            return this.sentAt_ == null ? Timestamp.getDefaultInstance() : this.sentAt_;
         }
      }

      private SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> getSentAtFieldBuilder() {
         if (this.sentAtBuilder_ == null) {
            this.sentAtBuilder_ = new SingleFieldBuilderV3<>(this.getSentAt(), this.getParentForChildren(), this.isClean());
            this.sentAt_ = null;
         }

         return this.sentAtBuilder_;
      }

      @Override
      public boolean hasSender() {
         return (this.bitField0_ & 4) != 0;
      }

      @Override
      public ConversationSender getSender() {
         if (this.senderBuilder_ == null) {
            return this.sender_ == null ? ConversationSender.getDefaultInstance() : this.sender_;
         } else {
            return this.senderBuilder_.getMessage();
         }
      }

      public ConversationMessage.Builder setSender(ConversationSender var1) {
         if (this.senderBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.sender_ = var1;
         } else {
            this.senderBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public ConversationMessage.Builder setSender(ConversationSender.Builder var1) {
         if (this.senderBuilder_ == null) {
            this.sender_ = var1.build();
         } else {
            this.senderBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public ConversationMessage.Builder mergeSender(ConversationSender var1) {
         if (this.senderBuilder_ == null) {
            if ((this.bitField0_ & 4) != 0 && this.sender_ != null && this.sender_ != ConversationSender.getDefaultInstance()) {
               this.getSenderBuilder().mergeFrom(var1);
            } else {
               this.sender_ = var1;
            }
         } else {
            this.senderBuilder_.mergeFrom(var1);
         }

         if (this.sender_ != null) {
            this.bitField0_ |= 4;
            this.onChanged();
         }

         return this;
      }

      public ConversationMessage.Builder clearSender() {
         this.bitField0_ &= -5;
         this.sender_ = null;
         if (this.senderBuilder_ != null) {
            this.senderBuilder_.dispose();
            this.senderBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public ConversationSender.Builder getSenderBuilder() {
         this.bitField0_ |= 4;
         this.onChanged();
         return this.getSenderFieldBuilder().getBuilder();
      }

      @Override
      public ConversationSenderOrBuilder getSenderOrBuilder() {
         if (this.senderBuilder_ != null) {
            return this.senderBuilder_.getMessageOrBuilder();
         } else {
            return this.sender_ == null ? ConversationSender.getDefaultInstance() : this.sender_;
         }
      }

      private SingleFieldBuilderV3<ConversationSender, ConversationSender.Builder, ConversationSenderOrBuilder> getSenderFieldBuilder() {
         if (this.senderBuilder_ == null) {
            this.senderBuilder_ = new SingleFieldBuilderV3<>(this.getSender(), this.getParentForChildren(), this.isClean());
            this.sender_ = null;
         }

         return this.senderBuilder_;
      }

      @Override
      public boolean hasContents() {
         return (this.bitField0_ & 8) != 0;
      }

      @Override
      public ConversationMessageContents getContents() {
         if (this.contentsBuilder_ == null) {
            return this.contents_ == null ? ConversationMessageContents.getDefaultInstance() : this.contents_;
         } else {
            return this.contentsBuilder_.getMessage();
         }
      }

      public ConversationMessage.Builder setContents(ConversationMessageContents var1) {
         if (this.contentsBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.contents_ = var1;
         } else {
            this.contentsBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public ConversationMessage.Builder setContents(ConversationMessageContents.Builder var1) {
         if (this.contentsBuilder_ == null) {
            this.contents_ = var1.build();
         } else {
            this.contentsBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public ConversationMessage.Builder mergeContents(ConversationMessageContents var1) {
         if (this.contentsBuilder_ == null) {
            if ((this.bitField0_ & 8) != 0 && this.contents_ != null && this.contents_ != ConversationMessageContents.getDefaultInstance()) {
               this.getContentsBuilder().mergeFrom(var1);
            } else {
               this.contents_ = var1;
            }
         } else {
            this.contentsBuilder_.mergeFrom(var1);
         }

         if (this.contents_ != null) {
            this.bitField0_ |= 8;
            this.onChanged();
         }

         return this;
      }

      public ConversationMessage.Builder clearContents() {
         this.bitField0_ &= -9;
         this.contents_ = null;
         if (this.contentsBuilder_ != null) {
            this.contentsBuilder_.dispose();
            this.contentsBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public ConversationMessageContents.Builder getContentsBuilder() {
         this.bitField0_ |= 8;
         this.onChanged();
         return this.getContentsFieldBuilder().getBuilder();
      }

      @Override
      public ConversationMessageContentsOrBuilder getContentsOrBuilder() {
         if (this.contentsBuilder_ != null) {
            return this.contentsBuilder_.getMessageOrBuilder();
         } else {
            return this.contents_ == null ? ConversationMessageContents.getDefaultInstance() : this.contents_;
         }
      }

      private SingleFieldBuilderV3<ConversationMessageContents, ConversationMessageContents.Builder, ConversationMessageContentsOrBuilder> getContentsFieldBuilder() {
         if (this.contentsBuilder_ == null) {
            this.contentsBuilder_ = new SingleFieldBuilderV3<>(this.getContents(), this.getParentForChildren(), this.isClean());
            this.contents_ = null;
         }

         return this.contentsBuilder_;
      }

      @Override
      public int getKindValue() {
         return this.kind_;
      }

      public ConversationMessage.Builder setKindValue(int var1) {
         this.kind_ = var1;
         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      @Override
      public ConversationMessageKind getKind() {
         ConversationMessageKind var1 = ConversationMessageKind.forNumber(this.kind_);
         return var1 == null ? ConversationMessageKind.UNRECOGNIZED : var1;
      }

      public ConversationMessage.Builder setKind(ConversationMessageKind var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 16;
         this.kind_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public ConversationMessage.Builder clearKind() {
         this.bitField0_ &= -17;
         this.kind_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public boolean getPinned() {
         return this.pinned_;
      }

      public ConversationMessage.Builder setPinned(boolean var1) {
         this.pinned_ = var1;
         this.bitField0_ |= 32;
         this.onChanged();
         return this;
      }

      public ConversationMessage.Builder clearPinned() {
         this.bitField0_ &= -33;
         this.pinned_ = false;
         this.onChanged();
         return this;
      }

      public final ConversationMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (ConversationMessage.Builder)super.setUnknownFields(var1);
      }

      public final ConversationMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (ConversationMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
