package com.lunarclient.websocket.conversation.v1;

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
import com.google.protobuf.Timestamp;
import com.google.protobuf.TimestampOrBuilder;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import com.lunarclient.common.v1.UuidAndUsername;
import com.lunarclient.common.v1.UuidAndUsernameOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class ConversationAddedPush extends GeneratedMessageV3 implements ConversationAddedPushOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int CONVERSATION_FIELD_NUMBER = 1;
   private Conversation conversation_;
   public static final int SENDER_FIELD_NUMBER = 2;
   private UuidAndUsername sender_;
   public static final int ADDED_AT_FIELD_NUMBER = 3;
   private Timestamp addedAt_;
   private byte memoizedIsInitialized = -1;
   private static final ConversationAddedPush DEFAULT_INSTANCE = new ConversationAddedPush();
   private static final Parser<ConversationAddedPush> PARSER = new AbstractParser<ConversationAddedPush>() {
      public ConversationAddedPush parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         ConversationAddedPush.Builder var3 = ConversationAddedPush.newBuilder();

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

   private ConversationAddedPush(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private ConversationAddedPush() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new ConversationAddedPush();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return PushProto.internal_static_lunarclient_websocket_conversation_v1_ConversationAddedPush_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return PushProto.internal_static_lunarclient_websocket_conversation_v1_ConversationAddedPush_fieldAccessorTable
         .ensureFieldAccessorsInitialized(ConversationAddedPush.class, ConversationAddedPush.Builder.class);
   }

   @Override
   public boolean hasConversation() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public Conversation getConversation() {
      return this.conversation_ == null ? Conversation.getDefaultInstance() : this.conversation_;
   }

   @Override
   public ConversationOrBuilder getConversationOrBuilder() {
      return this.conversation_ == null ? Conversation.getDefaultInstance() : this.conversation_;
   }

   @Override
   public boolean hasSender() {
      return (this.bitField0_ & 2) != 0;
   }

   @Override
   public UuidAndUsername getSender() {
      return this.sender_ == null ? UuidAndUsername.getDefaultInstance() : this.sender_;
   }

   @Override
   public UuidAndUsernameOrBuilder getSenderOrBuilder() {
      return this.sender_ == null ? UuidAndUsername.getDefaultInstance() : this.sender_;
   }

   @Override
   public boolean hasAddedAt() {
      return (this.bitField0_ & 4) != 0;
   }

   @Override
   public Timestamp getAddedAt() {
      return this.addedAt_ == null ? Timestamp.getDefaultInstance() : this.addedAt_;
   }

   @Override
   public TimestampOrBuilder getAddedAtOrBuilder() {
      return this.addedAt_ == null ? Timestamp.getDefaultInstance() : this.addedAt_;
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
         var1.writeMessage(1, this.getConversation());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1.writeMessage(2, this.getSender());
      }

      if ((this.bitField0_ & 4) != 0) {
         var1.writeMessage(3, this.getAddedAt());
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
         var1 += CodedOutputStream.computeMessageSize(1, this.getConversation());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1 += CodedOutputStream.computeMessageSize(2, this.getSender());
      }

      if ((this.bitField0_ & 4) != 0) {
         var1 += CodedOutputStream.computeMessageSize(3, this.getAddedAt());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof ConversationAddedPush)) {
         return super.equals(var1);
      } else {
         ConversationAddedPush var2 = (ConversationAddedPush)var1;
         if (this.hasConversation() != var2.hasConversation()) {
            return false;
         } else if (this.hasConversation() && !this.getConversation().equals(var2.getConversation())) {
            return false;
         } else if (this.hasSender() != var2.hasSender()) {
            return false;
         } else if (this.hasSender() && !this.getSender().equals(var2.getSender())) {
            return false;
         } else if (this.hasAddedAt() != var2.hasAddedAt()) {
            return false;
         } else {
            return this.hasAddedAt() && !this.getAddedAt().equals(var2.getAddedAt()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.hasConversation()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getConversation().hashCode();
      }

      if (this.hasSender()) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getSender().hashCode();
      }

      if (this.hasAddedAt()) {
         var1 = 37 * var1 + 3;
         var1 = 53 * var1 + this.getAddedAt().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static ConversationAddedPush parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static ConversationAddedPush parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ConversationAddedPush parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static ConversationAddedPush parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ConversationAddedPush parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static ConversationAddedPush parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ConversationAddedPush parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ConversationAddedPush parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ConversationAddedPush parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ConversationAddedPush parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ConversationAddedPush parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ConversationAddedPush parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public ConversationAddedPush.Builder newBuilderForType() {
      return newBuilder();
   }

   public static ConversationAddedPush.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ConversationAddedPush.Builder newBuilder(ConversationAddedPush var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public ConversationAddedPush.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new ConversationAddedPush.Builder() : new ConversationAddedPush.Builder().mergeFrom(this);
   }

   protected ConversationAddedPush.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new ConversationAddedPush.Builder(var1);
   }

   public static ConversationAddedPush getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<ConversationAddedPush> parser() {
      return PARSER;
   }

   @Override
   public Parser<ConversationAddedPush> getParserForType() {
      return PARSER;
   }

   public ConversationAddedPush getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<ConversationAddedPush.Builder> implements ConversationAddedPushOrBuilder {
      private int bitField0_;
      private Conversation conversation_;
      private SingleFieldBuilderV3<Conversation, Conversation.Builder, ConversationOrBuilder> conversationBuilder_;
      private UuidAndUsername sender_;
      private SingleFieldBuilderV3<UuidAndUsername, UuidAndUsername.Builder, UuidAndUsernameOrBuilder> senderBuilder_;
      private Timestamp addedAt_;
      private SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> addedAtBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return PushProto.internal_static_lunarclient_websocket_conversation_v1_ConversationAddedPush_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PushProto.internal_static_lunarclient_websocket_conversation_v1_ConversationAddedPush_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ConversationAddedPush.class, ConversationAddedPush.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (ConversationAddedPush.alwaysUseFieldBuilders) {
            this.getConversationFieldBuilder();
            this.getSenderFieldBuilder();
            this.getAddedAtFieldBuilder();
         }
      }

      public ConversationAddedPush.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.conversation_ = null;
         if (this.conversationBuilder_ != null) {
            this.conversationBuilder_.dispose();
            this.conversationBuilder_ = null;
         }

         this.sender_ = null;
         if (this.senderBuilder_ != null) {
            this.senderBuilder_.dispose();
            this.senderBuilder_ = null;
         }

         this.addedAt_ = null;
         if (this.addedAtBuilder_ != null) {
            this.addedAtBuilder_.dispose();
            this.addedAtBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return PushProto.internal_static_lunarclient_websocket_conversation_v1_ConversationAddedPush_descriptor;
      }

      public ConversationAddedPush getDefaultInstanceForType() {
         return ConversationAddedPush.getDefaultInstance();
      }

      public ConversationAddedPush build() {
         ConversationAddedPush var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public ConversationAddedPush buildPartial() {
         ConversationAddedPush var1 = new ConversationAddedPush(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(ConversationAddedPush var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.conversation_ = this.conversationBuilder_ == null ? this.conversation_ : this.conversationBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.sender_ = this.senderBuilder_ == null ? this.sender_ : this.senderBuilder_.build();
            var3 |= 2;
         }

         if ((var2 & 4) != 0) {
            var1.addedAt_ = this.addedAtBuilder_ == null ? this.addedAt_ : this.addedAtBuilder_.build();
            var3 |= 4;
         }

         ConversationAddedPush var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public ConversationAddedPush.Builder clone() {
         return (ConversationAddedPush.Builder)super.clone();
      }

      public ConversationAddedPush.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ConversationAddedPush.Builder)super.setField(var1, var2);
      }

      public ConversationAddedPush.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (ConversationAddedPush.Builder)super.clearField(var1);
      }

      public ConversationAddedPush.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (ConversationAddedPush.Builder)super.clearOneof(var1);
      }

      public ConversationAddedPush.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (ConversationAddedPush.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public ConversationAddedPush.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ConversationAddedPush.Builder)super.addRepeatedField(var1, var2);
      }

      public ConversationAddedPush.Builder mergeFrom(Message var1) {
         if (var1 instanceof ConversationAddedPush) {
            return this.mergeFrom((ConversationAddedPush)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public ConversationAddedPush.Builder mergeFrom(ConversationAddedPush var1) {
         if (var1 == ConversationAddedPush.getDefaultInstance()) {
            return this;
         }

         if (var1.hasConversation()) {
            this.mergeConversation(var1.getConversation());
         }

         if (var1.hasSender()) {
            this.mergeSender(var1.getSender());
         }

         if (var1.hasAddedAt()) {
            this.mergeAddedAt(var1.getAddedAt());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public ConversationAddedPush.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getConversationFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     var1.readMessage(this.getSenderFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 2;
                     break;
                  case 26:
                     var1.readMessage(this.getAddedAtFieldBuilder().getBuilder(), var2);
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
      public boolean hasConversation() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public Conversation getConversation() {
         if (this.conversationBuilder_ == null) {
            return this.conversation_ == null ? Conversation.getDefaultInstance() : this.conversation_;
         } else {
            return this.conversationBuilder_.getMessage();
         }
      }

      public ConversationAddedPush.Builder setConversation(Conversation var1) {
         if (this.conversationBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.conversation_ = var1;
         } else {
            this.conversationBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public ConversationAddedPush.Builder setConversation(Conversation.Builder var1) {
         if (this.conversationBuilder_ == null) {
            this.conversation_ = var1.build();
         } else {
            this.conversationBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public ConversationAddedPush.Builder mergeConversation(Conversation var1) {
         if (this.conversationBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.conversation_ != null && this.conversation_ != Conversation.getDefaultInstance()) {
               this.getConversationBuilder().mergeFrom(var1);
            } else {
               this.conversation_ = var1;
            }
         } else {
            this.conversationBuilder_.mergeFrom(var1);
         }

         if (this.conversation_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public ConversationAddedPush.Builder clearConversation() {
         this.bitField0_ &= -2;
         this.conversation_ = null;
         if (this.conversationBuilder_ != null) {
            this.conversationBuilder_.dispose();
            this.conversationBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Conversation.Builder getConversationBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getConversationFieldBuilder().getBuilder();
      }

      @Override
      public ConversationOrBuilder getConversationOrBuilder() {
         if (this.conversationBuilder_ != null) {
            return this.conversationBuilder_.getMessageOrBuilder();
         } else {
            return this.conversation_ == null ? Conversation.getDefaultInstance() : this.conversation_;
         }
      }

      private SingleFieldBuilderV3<Conversation, Conversation.Builder, ConversationOrBuilder> getConversationFieldBuilder() {
         if (this.conversationBuilder_ == null) {
            this.conversationBuilder_ = new SingleFieldBuilderV3<>(this.getConversation(), this.getParentForChildren(), this.isClean());
            this.conversation_ = null;
         }

         return this.conversationBuilder_;
      }

      @Override
      public boolean hasSender() {
         return (this.bitField0_ & 2) != 0;
      }

      @Override
      public UuidAndUsername getSender() {
         if (this.senderBuilder_ == null) {
            return this.sender_ == null ? UuidAndUsername.getDefaultInstance() : this.sender_;
         } else {
            return this.senderBuilder_.getMessage();
         }
      }

      public ConversationAddedPush.Builder setSender(UuidAndUsername var1) {
         if (this.senderBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.sender_ = var1;
         } else {
            this.senderBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public ConversationAddedPush.Builder setSender(UuidAndUsername.Builder var1) {
         if (this.senderBuilder_ == null) {
            this.sender_ = var1.build();
         } else {
            this.senderBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public ConversationAddedPush.Builder mergeSender(UuidAndUsername var1) {
         if (this.senderBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0 && this.sender_ != null && this.sender_ != UuidAndUsername.getDefaultInstance()) {
               this.getSenderBuilder().mergeFrom(var1);
            } else {
               this.sender_ = var1;
            }
         } else {
            this.senderBuilder_.mergeFrom(var1);
         }

         if (this.sender_ != null) {
            this.bitField0_ |= 2;
            this.onChanged();
         }

         return this;
      }

      public ConversationAddedPush.Builder clearSender() {
         this.bitField0_ &= -3;
         this.sender_ = null;
         if (this.senderBuilder_ != null) {
            this.senderBuilder_.dispose();
            this.senderBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public UuidAndUsername.Builder getSenderBuilder() {
         this.bitField0_ |= 2;
         this.onChanged();
         return this.getSenderFieldBuilder().getBuilder();
      }

      @Override
      public UuidAndUsernameOrBuilder getSenderOrBuilder() {
         if (this.senderBuilder_ != null) {
            return this.senderBuilder_.getMessageOrBuilder();
         } else {
            return this.sender_ == null ? UuidAndUsername.getDefaultInstance() : this.sender_;
         }
      }

      private SingleFieldBuilderV3<UuidAndUsername, UuidAndUsername.Builder, UuidAndUsernameOrBuilder> getSenderFieldBuilder() {
         if (this.senderBuilder_ == null) {
            this.senderBuilder_ = new SingleFieldBuilderV3<>(this.getSender(), this.getParentForChildren(), this.isClean());
            this.sender_ = null;
         }

         return this.senderBuilder_;
      }

      @Override
      public boolean hasAddedAt() {
         return (this.bitField0_ & 4) != 0;
      }

      @Override
      public Timestamp getAddedAt() {
         if (this.addedAtBuilder_ == null) {
            return this.addedAt_ == null ? Timestamp.getDefaultInstance() : this.addedAt_;
         } else {
            return this.addedAtBuilder_.getMessage();
         }
      }

      public ConversationAddedPush.Builder setAddedAt(Timestamp var1) {
         if (this.addedAtBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.addedAt_ = var1;
         } else {
            this.addedAtBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public ConversationAddedPush.Builder setAddedAt(Timestamp.Builder var1) {
         if (this.addedAtBuilder_ == null) {
            this.addedAt_ = var1.build();
         } else {
            this.addedAtBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public ConversationAddedPush.Builder mergeAddedAt(Timestamp var1) {
         if (this.addedAtBuilder_ == null) {
            if ((this.bitField0_ & 4) != 0 && this.addedAt_ != null && this.addedAt_ != Timestamp.getDefaultInstance()) {
               this.getAddedAtBuilder().mergeFrom(var1);
            } else {
               this.addedAt_ = var1;
            }
         } else {
            this.addedAtBuilder_.mergeFrom(var1);
         }

         if (this.addedAt_ != null) {
            this.bitField0_ |= 4;
            this.onChanged();
         }

         return this;
      }

      public ConversationAddedPush.Builder clearAddedAt() {
         this.bitField0_ &= -5;
         this.addedAt_ = null;
         if (this.addedAtBuilder_ != null) {
            this.addedAtBuilder_.dispose();
            this.addedAtBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Timestamp.Builder getAddedAtBuilder() {
         this.bitField0_ |= 4;
         this.onChanged();
         return this.getAddedAtFieldBuilder().getBuilder();
      }

      @Override
      public TimestampOrBuilder getAddedAtOrBuilder() {
         if (this.addedAtBuilder_ != null) {
            return this.addedAtBuilder_.getMessageOrBuilder();
         } else {
            return this.addedAt_ == null ? Timestamp.getDefaultInstance() : this.addedAt_;
         }
      }

      private SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> getAddedAtFieldBuilder() {
         if (this.addedAtBuilder_ == null) {
            this.addedAtBuilder_ = new SingleFieldBuilderV3<>(this.getAddedAt(), this.getParentForChildren(), this.isClean());
            this.addedAt_ = null;
         }

         return this.addedAtBuilder_;
      }

      public final ConversationAddedPush.Builder setUnknownFields(UnknownFieldSet var1) {
         return (ConversationAddedPush.Builder)super.setUnknownFields(var1);
      }

      public final ConversationAddedPush.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (ConversationAddedPush.Builder)super.mergeUnknownFields(var1);
      }
   }
}
