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
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class ConversationMessagePush extends GeneratedMessageV3 implements ConversationMessagePushOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int CONVERSATION_REFERENCE_FIELD_NUMBER = 1;
   private ConversationReference conversationReference_;
   public static final int MESSAGE_FIELD_NUMBER = 2;
   private ConversationMessage message_;
   public static final int UPDATED_FIELD_NUMBER = 3;
   private boolean updated_ = false;
   private byte memoizedIsInitialized = -1;
   private static final ConversationMessagePush DEFAULT_INSTANCE = new ConversationMessagePush();
   private static final Parser<ConversationMessagePush> PARSER = new AbstractParser<ConversationMessagePush>() {
      public ConversationMessagePush parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         ConversationMessagePush.Builder var3 = ConversationMessagePush.newBuilder();

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

   private ConversationMessagePush(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private ConversationMessagePush() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new ConversationMessagePush();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return PushProto.internal_static_lunarclient_websocket_conversation_v1_ConversationMessagePush_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return PushProto.internal_static_lunarclient_websocket_conversation_v1_ConversationMessagePush_fieldAccessorTable
         .ensureFieldAccessorsInitialized(ConversationMessagePush.class, ConversationMessagePush.Builder.class);
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
   public boolean hasMessage() {
      return (this.bitField0_ & 2) != 0;
   }

   @Override
   public ConversationMessage getMessage() {
      return this.message_ == null ? ConversationMessage.getDefaultInstance() : this.message_;
   }

   @Override
   public ConversationMessageOrBuilder getMessageOrBuilder() {
      return this.message_ == null ? ConversationMessage.getDefaultInstance() : this.message_;
   }

   @Override
   public boolean hasUpdated() {
      return (this.bitField0_ & 4) != 0;
   }

   @Override
   public boolean getUpdated() {
      return this.updated_;
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

      if ((this.bitField0_ & 2) != 0) {
         var1.writeMessage(2, this.getMessage());
      }

      if ((this.bitField0_ & 4) != 0) {
         var1.writeBool(3, this.updated_);
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

      if ((this.bitField0_ & 2) != 0) {
         var1 += CodedOutputStream.computeMessageSize(2, this.getMessage());
      }

      if ((this.bitField0_ & 4) != 0) {
         var1 += CodedOutputStream.computeBoolSize(3, this.updated_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof ConversationMessagePush)) {
         return super.equals(var1);
      } else {
         ConversationMessagePush var2 = (ConversationMessagePush)var1;
         if (this.hasConversationReference() != var2.hasConversationReference()) {
            return false;
         } else if (this.hasConversationReference() && !this.getConversationReference().equals(var2.getConversationReference())) {
            return false;
         } else if (this.hasMessage() != var2.hasMessage()) {
            return false;
         } else if (this.hasMessage() && !this.getMessage().equals(var2.getMessage())) {
            return false;
         } else if (this.hasUpdated() != var2.hasUpdated()) {
            return false;
         } else {
            return this.hasUpdated() && this.getUpdated() != var2.getUpdated() ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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

      if (this.hasMessage()) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getMessage().hashCode();
      }

      if (this.hasUpdated()) {
         var1 = 37 * var1 + 3;
         var1 = 53 * var1 + Internal.hashBoolean(this.getUpdated());
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static ConversationMessagePush parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static ConversationMessagePush parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ConversationMessagePush parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static ConversationMessagePush parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ConversationMessagePush parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static ConversationMessagePush parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ConversationMessagePush parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ConversationMessagePush parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ConversationMessagePush parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ConversationMessagePush parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ConversationMessagePush parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ConversationMessagePush parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public ConversationMessagePush.Builder newBuilderForType() {
      return newBuilder();
   }

   public static ConversationMessagePush.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ConversationMessagePush.Builder newBuilder(ConversationMessagePush var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public ConversationMessagePush.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new ConversationMessagePush.Builder() : new ConversationMessagePush.Builder().mergeFrom(this);
   }

   protected ConversationMessagePush.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new ConversationMessagePush.Builder(var1);
   }

   public static ConversationMessagePush getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<ConversationMessagePush> parser() {
      return PARSER;
   }

   @Override
   public Parser<ConversationMessagePush> getParserForType() {
      return PARSER;
   }

   public ConversationMessagePush getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<ConversationMessagePush.Builder> implements ConversationMessagePushOrBuilder {
      private int bitField0_;
      private ConversationReference conversationReference_;
      private SingleFieldBuilderV3<ConversationReference, ConversationReference.Builder, ConversationReferenceOrBuilder> conversationReferenceBuilder_;
      private ConversationMessage message_;
      private SingleFieldBuilderV3<ConversationMessage, ConversationMessage.Builder, ConversationMessageOrBuilder> messageBuilder_;
      private boolean updated_;

      public static final Descriptors.Descriptor getDescriptor() {
         return PushProto.internal_static_lunarclient_websocket_conversation_v1_ConversationMessagePush_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PushProto.internal_static_lunarclient_websocket_conversation_v1_ConversationMessagePush_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ConversationMessagePush.class, ConversationMessagePush.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (ConversationMessagePush.alwaysUseFieldBuilders) {
            this.getConversationReferenceFieldBuilder();
            this.getMessageFieldBuilder();
         }
      }

      public ConversationMessagePush.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.conversationReference_ = null;
         if (this.conversationReferenceBuilder_ != null) {
            this.conversationReferenceBuilder_.dispose();
            this.conversationReferenceBuilder_ = null;
         }

         this.message_ = null;
         if (this.messageBuilder_ != null) {
            this.messageBuilder_.dispose();
            this.messageBuilder_ = null;
         }

         this.updated_ = false;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return PushProto.internal_static_lunarclient_websocket_conversation_v1_ConversationMessagePush_descriptor;
      }

      public ConversationMessagePush getDefaultInstanceForType() {
         return ConversationMessagePush.getDefaultInstance();
      }

      public ConversationMessagePush build() {
         ConversationMessagePush var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public ConversationMessagePush buildPartial() {
         ConversationMessagePush var1 = new ConversationMessagePush(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(ConversationMessagePush var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.conversationReference_ = this.conversationReferenceBuilder_ == null ? this.conversationReference_ : this.conversationReferenceBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.message_ = this.messageBuilder_ == null ? this.message_ : this.messageBuilder_.build();
            var3 |= 2;
         }

         if ((var2 & 4) != 0) {
            var1.updated_ = this.updated_;
            var3 |= 4;
         }

         ConversationMessagePush var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public ConversationMessagePush.Builder clone() {
         return (ConversationMessagePush.Builder)super.clone();
      }

      public ConversationMessagePush.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ConversationMessagePush.Builder)super.setField(var1, var2);
      }

      public ConversationMessagePush.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (ConversationMessagePush.Builder)super.clearField(var1);
      }

      public ConversationMessagePush.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (ConversationMessagePush.Builder)super.clearOneof(var1);
      }

      public ConversationMessagePush.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (ConversationMessagePush.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public ConversationMessagePush.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ConversationMessagePush.Builder)super.addRepeatedField(var1, var2);
      }

      public ConversationMessagePush.Builder mergeFrom(Message var1) {
         if (var1 instanceof ConversationMessagePush) {
            return this.mergeFrom((ConversationMessagePush)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public ConversationMessagePush.Builder mergeFrom(ConversationMessagePush var1) {
         if (var1 == ConversationMessagePush.getDefaultInstance()) {
            return this;
         }

         if (var1.hasConversationReference()) {
            this.mergeConversationReference(var1.getConversationReference());
         }

         if (var1.hasMessage()) {
            this.mergeMessage(var1.getMessage());
         }

         if (var1.hasUpdated()) {
            this.setUpdated(var1.getUpdated());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public ConversationMessagePush.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                  case 18:
                     var1.readMessage(this.getMessageFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 2;
                     break;
                  case 24:
                     this.updated_ = var1.readBool();
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

      public ConversationMessagePush.Builder setConversationReference(ConversationReference var1) {
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

      public ConversationMessagePush.Builder setConversationReference(ConversationReference.Builder var1) {
         if (this.conversationReferenceBuilder_ == null) {
            this.conversationReference_ = var1.build();
         } else {
            this.conversationReferenceBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public ConversationMessagePush.Builder mergeConversationReference(ConversationReference var1) {
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

      public ConversationMessagePush.Builder clearConversationReference() {
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
      public boolean hasMessage() {
         return (this.bitField0_ & 2) != 0;
      }

      @Override
      public ConversationMessage getMessage() {
         if (this.messageBuilder_ == null) {
            return this.message_ == null ? ConversationMessage.getDefaultInstance() : this.message_;
         } else {
            return this.messageBuilder_.getMessage();
         }
      }

      public ConversationMessagePush.Builder setMessage(ConversationMessage var1) {
         if (this.messageBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.message_ = var1;
         } else {
            this.messageBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public ConversationMessagePush.Builder setMessage(ConversationMessage.Builder var1) {
         if (this.messageBuilder_ == null) {
            this.message_ = var1.build();
         } else {
            this.messageBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public ConversationMessagePush.Builder mergeMessage(ConversationMessage var1) {
         if (this.messageBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0 && this.message_ != null && this.message_ != ConversationMessage.getDefaultInstance()) {
               this.getMessageBuilder().mergeFrom(var1);
            } else {
               this.message_ = var1;
            }
         } else {
            this.messageBuilder_.mergeFrom(var1);
         }

         if (this.message_ != null) {
            this.bitField0_ |= 2;
            this.onChanged();
         }

         return this;
      }

      public ConversationMessagePush.Builder clearMessage() {
         this.bitField0_ &= -3;
         this.message_ = null;
         if (this.messageBuilder_ != null) {
            this.messageBuilder_.dispose();
            this.messageBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public ConversationMessage.Builder getMessageBuilder() {
         this.bitField0_ |= 2;
         this.onChanged();
         return this.getMessageFieldBuilder().getBuilder();
      }

      @Override
      public ConversationMessageOrBuilder getMessageOrBuilder() {
         if (this.messageBuilder_ != null) {
            return this.messageBuilder_.getMessageOrBuilder();
         } else {
            return this.message_ == null ? ConversationMessage.getDefaultInstance() : this.message_;
         }
      }

      private SingleFieldBuilderV3<ConversationMessage, ConversationMessage.Builder, ConversationMessageOrBuilder> getMessageFieldBuilder() {
         if (this.messageBuilder_ == null) {
            this.messageBuilder_ = new SingleFieldBuilderV3<>(this.getMessage(), this.getParentForChildren(), this.isClean());
            this.message_ = null;
         }

         return this.messageBuilder_;
      }

      @Override
      public boolean hasUpdated() {
         return (this.bitField0_ & 4) != 0;
      }

      @Override
      public boolean getUpdated() {
         return this.updated_;
      }

      public ConversationMessagePush.Builder setUpdated(boolean var1) {
         this.updated_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public ConversationMessagePush.Builder clearUpdated() {
         this.bitField0_ &= -5;
         this.updated_ = false;
         this.onChanged();
         return this;
      }

      public final ConversationMessagePush.Builder setUnknownFields(UnknownFieldSet var1) {
         return (ConversationMessagePush.Builder)super.setUnknownFields(var1);
      }

      public final ConversationMessagePush.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (ConversationMessagePush.Builder)super.mergeUnknownFields(var1);
      }
   }
}
