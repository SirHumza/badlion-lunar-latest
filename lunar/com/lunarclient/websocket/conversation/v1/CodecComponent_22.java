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
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class ConversationPreSendActionPush extends GeneratedMessageV3 implements ConversationPreSendActionPushOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int CONVERSATION_REFERENCE_FIELD_NUMBER = 1;
   private ConversationReference conversationReference_;
   public static final int ACTION_FIELD_NUMBER = 2;
   private int action_ = 0;
   public static final int SENDER_FIELD_NUMBER = 3;
   private ConversationSender sender_;
   private byte memoizedIsInitialized = -1;
   private static final ConversationPreSendActionPush DEFAULT_INSTANCE = new ConversationPreSendActionPush();
   private static final Parser<ConversationPreSendActionPush> PARSER = new AbstractParser<ConversationPreSendActionPush>() {
      public ConversationPreSendActionPush parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         ConversationPreSendActionPush.Builder var3 = ConversationPreSendActionPush.newBuilder();

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

   private ConversationPreSendActionPush(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private ConversationPreSendActionPush() {
      this.action_ = 0;
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new ConversationPreSendActionPush();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return PushProto.internal_static_lunarclient_websocket_conversation_v1_ConversationPreSendActionPush_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return PushProto.internal_static_lunarclient_websocket_conversation_v1_ConversationPreSendActionPush_fieldAccessorTable
         .ensureFieldAccessorsInitialized(ConversationPreSendActionPush.class, ConversationPreSendActionPush.Builder.class);
   }

   @Override
   public boolean hasConversationReference() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public ConversationReference getConversationReference() {
      return this.conversationReference_ == null ? ConversationReference.getDefaultInstance() : this.conversationReference_;
   }

   @Override
   public ConversationReferenceOrBuilder getConversationReferenceOrBuilder() {
      return this.conversationReference_ == null ? ConversationReference.getDefaultInstance() : this.conversationReference_;
   }

   @Override
   public int getActionValue() {
      return this.action_;
   }

   @Override
   public PreSendAction getAction() {
      PreSendAction var1 = PreSendAction.forNumber(this.action_);
      return var1 == null ? PreSendAction.UNRECOGNIZED : var1;
   }

   @Override
   public boolean hasSender() {
      return (this.bitField0_ & 2) != 0;
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
         var1.writeMessage(1, this.getConversationReference());
      }

      if (this.action_ != PreSendAction.PRE_SEND_ACTION_UNSPECIFIED.getNumber()) {
         var1.writeEnum(2, this.action_);
      }

      if ((this.bitField0_ & 2) != 0) {
         var1.writeMessage(3, this.getSender());
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
         var1 += CodedOutputStream.computeMessageSize(1, this.getConversationReference());
      }

      if (this.action_ != PreSendAction.PRE_SEND_ACTION_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(2, this.action_);
      }

      if ((this.bitField0_ & 2) != 0) {
         var1 += CodedOutputStream.computeMessageSize(3, this.getSender());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof ConversationPreSendActionPush)) {
         return super.equals(var1);
      } else {
         ConversationPreSendActionPush var2 = (ConversationPreSendActionPush)var1;
         if (this.hasConversationReference() != var2.hasConversationReference()) {
            return false;
         } else if (this.hasConversationReference() && !this.getConversationReference().equals(var2.getConversationReference())) {
            return false;
         } else if (this.action_ != var2.action_) {
            return false;
         } else if (this.hasSender() != var2.hasSender()) {
            return false;
         } else {
            return this.hasSender() && !this.getSender().equals(var2.getSender()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.hasConversationReference()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getConversationReference().hashCode();
      }

      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.action_;
      if (this.hasSender()) {
         var1 = 37 * var1 + 3;
         var1 = 53 * var1 + this.getSender().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static ConversationPreSendActionPush parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static ConversationPreSendActionPush parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ConversationPreSendActionPush parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static ConversationPreSendActionPush parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ConversationPreSendActionPush parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static ConversationPreSendActionPush parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ConversationPreSendActionPush parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ConversationPreSendActionPush parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ConversationPreSendActionPush parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ConversationPreSendActionPush parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ConversationPreSendActionPush parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ConversationPreSendActionPush parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public ConversationPreSendActionPush.Builder newBuilderForType() {
      return newBuilder();
   }

   public static ConversationPreSendActionPush.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ConversationPreSendActionPush.Builder newBuilder(ConversationPreSendActionPush var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public ConversationPreSendActionPush.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new ConversationPreSendActionPush.Builder() : new ConversationPreSendActionPush.Builder().mergeFrom(this);
   }

   protected ConversationPreSendActionPush.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new ConversationPreSendActionPush.Builder(var1);
   }

   public static ConversationPreSendActionPush getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<ConversationPreSendActionPush> parser() {
      return PARSER;
   }

   @Override
   public Parser<ConversationPreSendActionPush> getParserForType() {
      return PARSER;
   }

   public ConversationPreSendActionPush getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder
      extends GeneratedMessageV3.Builder<ConversationPreSendActionPush.Builder>
      implements ConversationPreSendActionPushOrBuilder {
      private int bitField0_;
      private ConversationReference conversationReference_;
      private SingleFieldBuilderV3<ConversationReference, ConversationReference.Builder, ConversationReferenceOrBuilder> conversationReferenceBuilder_;
      private int action_ = 0;
      private ConversationSender sender_;
      private SingleFieldBuilderV3<ConversationSender, ConversationSender.Builder, ConversationSenderOrBuilder> senderBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return PushProto.internal_static_lunarclient_websocket_conversation_v1_ConversationPreSendActionPush_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PushProto.internal_static_lunarclient_websocket_conversation_v1_ConversationPreSendActionPush_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ConversationPreSendActionPush.class, ConversationPreSendActionPush.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (ConversationPreSendActionPush.alwaysUseFieldBuilders) {
            this.getConversationReferenceFieldBuilder();
            this.getSenderFieldBuilder();
         }
      }

      public ConversationPreSendActionPush.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.conversationReference_ = null;
         if (this.conversationReferenceBuilder_ != null) {
            this.conversationReferenceBuilder_.dispose();
            this.conversationReferenceBuilder_ = null;
         }

         this.action_ = 0;
         this.sender_ = null;
         if (this.senderBuilder_ != null) {
            this.senderBuilder_.dispose();
            this.senderBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return PushProto.internal_static_lunarclient_websocket_conversation_v1_ConversationPreSendActionPush_descriptor;
      }

      public ConversationPreSendActionPush getDefaultInstanceForType() {
         return ConversationPreSendActionPush.getDefaultInstance();
      }

      public ConversationPreSendActionPush build() {
         ConversationPreSendActionPush var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public ConversationPreSendActionPush buildPartial() {
         ConversationPreSendActionPush var1 = new ConversationPreSendActionPush(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(ConversationPreSendActionPush var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.conversationReference_ = this.conversationReferenceBuilder_ == null ? this.conversationReference_ : this.conversationReferenceBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.action_ = this.action_;
         }

         if ((var2 & 4) != 0) {
            var1.sender_ = this.senderBuilder_ == null ? this.sender_ : this.senderBuilder_.build();
            var3 |= 2;
         }

         ConversationPreSendActionPush var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public ConversationPreSendActionPush.Builder clone() {
         return (ConversationPreSendActionPush.Builder)super.clone();
      }

      public ConversationPreSendActionPush.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ConversationPreSendActionPush.Builder)super.setField(var1, var2);
      }

      public ConversationPreSendActionPush.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (ConversationPreSendActionPush.Builder)super.clearField(var1);
      }

      public ConversationPreSendActionPush.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (ConversationPreSendActionPush.Builder)super.clearOneof(var1);
      }

      public ConversationPreSendActionPush.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (ConversationPreSendActionPush.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public ConversationPreSendActionPush.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ConversationPreSendActionPush.Builder)super.addRepeatedField(var1, var2);
      }

      public ConversationPreSendActionPush.Builder mergeFrom(Message var1) {
         if (var1 instanceof ConversationPreSendActionPush) {
            return this.mergeFrom((ConversationPreSendActionPush)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public ConversationPreSendActionPush.Builder mergeFrom(ConversationPreSendActionPush var1) {
         if (var1 == ConversationPreSendActionPush.getDefaultInstance()) {
            return this;
         }

         if (var1.hasConversationReference()) {
            this.mergeConversationReference(var1.getConversationReference());
         }

         if (var1.action_ != 0) {
            this.setActionValue(var1.getActionValue());
         }

         if (var1.hasSender()) {
            this.mergeSender(var1.getSender());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public ConversationPreSendActionPush.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getConversationReferenceFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 1;
                     break;
                  case 16:
                     this.action_ = var1.readEnum();
                     this.bitField0_ |= 2;
                     break;
                  case 26:
                     var1.readMessage(this.getSenderFieldBuilder().getBuilder(), var2);
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
      public boolean hasConversationReference() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public ConversationReference getConversationReference() {
         if (this.conversationReferenceBuilder_ == null) {
            return this.conversationReference_ == null ? ConversationReference.getDefaultInstance() : this.conversationReference_;
         } else {
            return this.conversationReferenceBuilder_.getMessage();
         }
      }

      public ConversationPreSendActionPush.Builder setConversationReference(ConversationReference var1) {
         if (this.conversationReferenceBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.conversationReference_ = var1;
         } else {
            this.conversationReferenceBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public ConversationPreSendActionPush.Builder setConversationReference(ConversationReference.Builder var1) {
         if (this.conversationReferenceBuilder_ == null) {
            this.conversationReference_ = var1.build();
         } else {
            this.conversationReferenceBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public ConversationPreSendActionPush.Builder mergeConversationReference(ConversationReference var1) {
         if (this.conversationReferenceBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.conversationReference_ != null && this.conversationReference_ != ConversationReference.getDefaultInstance()) {
               this.getConversationReferenceBuilder().mergeFrom(var1);
            } else {
               this.conversationReference_ = var1;
            }
         } else {
            this.conversationReferenceBuilder_.mergeFrom(var1);
         }

         if (this.conversationReference_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public ConversationPreSendActionPush.Builder clearConversationReference() {
         this.bitField0_ &= -2;
         this.conversationReference_ = null;
         if (this.conversationReferenceBuilder_ != null) {
            this.conversationReferenceBuilder_.dispose();
            this.conversationReferenceBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public ConversationReference.Builder getConversationReferenceBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getConversationReferenceFieldBuilder().getBuilder();
      }

      @Override
      public ConversationReferenceOrBuilder getConversationReferenceOrBuilder() {
         if (this.conversationReferenceBuilder_ != null) {
            return this.conversationReferenceBuilder_.getMessageOrBuilder();
         } else {
            return this.conversationReference_ == null ? ConversationReference.getDefaultInstance() : this.conversationReference_;
         }
      }

      private SingleFieldBuilderV3<ConversationReference, ConversationReference.Builder, ConversationReferenceOrBuilder> getConversationReferenceFieldBuilder() {
         if (this.conversationReferenceBuilder_ == null) {
            this.conversationReferenceBuilder_ = new SingleFieldBuilderV3<>(this.getConversationReference(), this.getParentForChildren(), this.isClean());
            this.conversationReference_ = null;
         }

         return this.conversationReferenceBuilder_;
      }

      @Override
      public int getActionValue() {
         return this.action_;
      }

      public ConversationPreSendActionPush.Builder setActionValue(int var1) {
         this.action_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      @Override
      public PreSendAction getAction() {
         PreSendAction var1 = PreSendAction.forNumber(this.action_);
         return var1 == null ? PreSendAction.UNRECOGNIZED : var1;
      }

      public ConversationPreSendActionPush.Builder setAction(PreSendAction var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 2;
         this.action_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public ConversationPreSendActionPush.Builder clearAction() {
         this.bitField0_ &= -3;
         this.action_ = 0;
         this.onChanged();
         return this;
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

      public ConversationPreSendActionPush.Builder setSender(ConversationSender var1) {
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

      public ConversationPreSendActionPush.Builder setSender(ConversationSender.Builder var1) {
         if (this.senderBuilder_ == null) {
            this.sender_ = var1.build();
         } else {
            this.senderBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public ConversationPreSendActionPush.Builder mergeSender(ConversationSender var1) {
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

      public ConversationPreSendActionPush.Builder clearSender() {
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

      public final ConversationPreSendActionPush.Builder setUnknownFields(UnknownFieldSet var1) {
         return (ConversationPreSendActionPush.Builder)super.setUnknownFields(var1);
      }

      public final ConversationPreSendActionPush.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (ConversationPreSendActionPush.Builder)super.mergeUnknownFields(var1);
      }
   }
}
