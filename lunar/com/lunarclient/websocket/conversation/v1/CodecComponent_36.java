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

public final class SendConversationMessageRequest extends GeneratedMessageV3 implements SendConversationMessageRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int CONVERSATION_REFERENCE_FIELD_NUMBER = 1;
   private ConversationReference conversationReference_;
   public static final int MESSAGE_CONTENTS_FIELD_NUMBER = 2;
   private ConversationMessageContents messageContents_;
   private byte memoizedIsInitialized = -1;
   private static final SendConversationMessageRequest DEFAULT_INSTANCE = new SendConversationMessageRequest();
   private static final Parser<SendConversationMessageRequest> PARSER = new AbstractParser<SendConversationMessageRequest>() {
      public SendConversationMessageRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         SendConversationMessageRequest.Builder var3 = SendConversationMessageRequest.newBuilder();

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

   private SendConversationMessageRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private SendConversationMessageRequest() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new SendConversationMessageRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_SendConversationMessageRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_SendConversationMessageRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(SendConversationMessageRequest.class, SendConversationMessageRequest.Builder.class);
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
   public boolean hasMessageContents() {
      return (this.bitField0_ & 2) != 0;
   }

   @Override
   public ConversationMessageContents getMessageContents() {
      return this.messageContents_ == null ? ConversationMessageContents.getDefaultInstance() : this.messageContents_;
   }

   @Override
   public ConversationMessageContentsOrBuilder getMessageContentsOrBuilder() {
      return this.messageContents_ == null ? ConversationMessageContents.getDefaultInstance() : this.messageContents_;
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
         var1.writeMessage(2, this.getMessageContents());
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
         var1 += CodedOutputStream.computeMessageSize(2, this.getMessageContents());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof SendConversationMessageRequest)) {
         return super.equals(var1);
      } else {
         SendConversationMessageRequest var2 = (SendConversationMessageRequest)var1;
         if (this.hasConversationReference() != var2.hasConversationReference()) {
            return false;
         } else if (this.hasConversationReference() && !this.getConversationReference().equals(var2.getConversationReference())) {
            return false;
         } else if (this.hasMessageContents() != var2.hasMessageContents()) {
            return false;
         } else {
            return this.hasMessageContents() && !this.getMessageContents().equals(var2.getMessageContents())
               ? false
               : this.getUnknownFields().equals(var2.getUnknownFields());
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

      if (this.hasMessageContents()) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getMessageContents().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static SendConversationMessageRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static SendConversationMessageRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SendConversationMessageRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static SendConversationMessageRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SendConversationMessageRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static SendConversationMessageRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SendConversationMessageRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SendConversationMessageRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static SendConversationMessageRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static SendConversationMessageRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static SendConversationMessageRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SendConversationMessageRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public SendConversationMessageRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static SendConversationMessageRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static SendConversationMessageRequest.Builder newBuilder(SendConversationMessageRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public SendConversationMessageRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new SendConversationMessageRequest.Builder() : new SendConversationMessageRequest.Builder().mergeFrom(this);
   }

   protected SendConversationMessageRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new SendConversationMessageRequest.Builder(var1);
   }

   public static SendConversationMessageRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<SendConversationMessageRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<SendConversationMessageRequest> getParserForType() {
      return PARSER;
   }

   public SendConversationMessageRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder
      extends GeneratedMessageV3.Builder<SendConversationMessageRequest.Builder>
      implements SendConversationMessageRequestOrBuilder {
      private int bitField0_;
      private ConversationReference conversationReference_;
      private SingleFieldBuilderV3<ConversationReference, ConversationReference.Builder, ConversationReferenceOrBuilder> conversationReferenceBuilder_;
      private ConversationMessageContents messageContents_;
      private SingleFieldBuilderV3<ConversationMessageContents, ConversationMessageContents.Builder, ConversationMessageContentsOrBuilder> messageContentsBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_SendConversationMessageRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_SendConversationMessageRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(SendConversationMessageRequest.class, SendConversationMessageRequest.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (SendConversationMessageRequest.alwaysUseFieldBuilders) {
            this.getConversationReferenceFieldBuilder();
            this.getMessageContentsFieldBuilder();
         }
      }

      public SendConversationMessageRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.conversationReference_ = null;
         if (this.conversationReferenceBuilder_ != null) {
            this.conversationReferenceBuilder_.dispose();
            this.conversationReferenceBuilder_ = null;
         }

         this.messageContents_ = null;
         if (this.messageContentsBuilder_ != null) {
            this.messageContentsBuilder_.dispose();
            this.messageContentsBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_SendConversationMessageRequest_descriptor;
      }

      public SendConversationMessageRequest getDefaultInstanceForType() {
         return SendConversationMessageRequest.getDefaultInstance();
      }

      public SendConversationMessageRequest build() {
         SendConversationMessageRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public SendConversationMessageRequest buildPartial() {
         SendConversationMessageRequest var1 = new SendConversationMessageRequest(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(SendConversationMessageRequest var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.conversationReference_ = this.conversationReferenceBuilder_ == null ? this.conversationReference_ : this.conversationReferenceBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.messageContents_ = this.messageContentsBuilder_ == null ? this.messageContents_ : this.messageContentsBuilder_.build();
            var3 |= 2;
         }

         SendConversationMessageRequest var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public SendConversationMessageRequest.Builder clone() {
         return (SendConversationMessageRequest.Builder)super.clone();
      }

      public SendConversationMessageRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (SendConversationMessageRequest.Builder)super.setField(var1, var2);
      }

      public SendConversationMessageRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (SendConversationMessageRequest.Builder)super.clearField(var1);
      }

      public SendConversationMessageRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (SendConversationMessageRequest.Builder)super.clearOneof(var1);
      }

      public SendConversationMessageRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (SendConversationMessageRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public SendConversationMessageRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (SendConversationMessageRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public SendConversationMessageRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof SendConversationMessageRequest) {
            return this.mergeFrom((SendConversationMessageRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public SendConversationMessageRequest.Builder mergeFrom(SendConversationMessageRequest var1) {
         if (var1 == SendConversationMessageRequest.getDefaultInstance()) {
            return this;
         }

         if (var1.hasConversationReference()) {
            this.mergeConversationReference(var1.getConversationReference());
         }

         if (var1.hasMessageContents()) {
            this.mergeMessageContents(var1.getMessageContents());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public SendConversationMessageRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getMessageContentsFieldBuilder().getBuilder(), var2);
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

      public SendConversationMessageRequest.Builder setConversationReference(ConversationReference var1) {
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

      public SendConversationMessageRequest.Builder setConversationReference(ConversationReference.Builder var1) {
         if (this.conversationReferenceBuilder_ == null) {
            this.conversationReference_ = var1.build();
         } else {
            this.conversationReferenceBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public SendConversationMessageRequest.Builder mergeConversationReference(ConversationReference var1) {
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

      public SendConversationMessageRequest.Builder clearConversationReference() {
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
      public boolean hasMessageContents() {
         return (this.bitField0_ & 2) != 0;
      }

      @Override
      public ConversationMessageContents getMessageContents() {
         if (this.messageContentsBuilder_ == null) {
            return this.messageContents_ == null ? ConversationMessageContents.getDefaultInstance() : this.messageContents_;
         } else {
            return this.messageContentsBuilder_.getMessage();
         }
      }

      public SendConversationMessageRequest.Builder setMessageContents(ConversationMessageContents var1) {
         if (this.messageContentsBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.messageContents_ = var1;
         } else {
            this.messageContentsBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public SendConversationMessageRequest.Builder setMessageContents(ConversationMessageContents.Builder var1) {
         if (this.messageContentsBuilder_ == null) {
            this.messageContents_ = var1.build();
         } else {
            this.messageContentsBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public SendConversationMessageRequest.Builder mergeMessageContents(ConversationMessageContents var1) {
         if (this.messageContentsBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0 && this.messageContents_ != null && this.messageContents_ != ConversationMessageContents.getDefaultInstance()) {
               this.getMessageContentsBuilder().mergeFrom(var1);
            } else {
               this.messageContents_ = var1;
            }
         } else {
            this.messageContentsBuilder_.mergeFrom(var1);
         }

         if (this.messageContents_ != null) {
            this.bitField0_ |= 2;
            this.onChanged();
         }

         return this;
      }

      public SendConversationMessageRequest.Builder clearMessageContents() {
         this.bitField0_ &= -3;
         this.messageContents_ = null;
         if (this.messageContentsBuilder_ != null) {
            this.messageContentsBuilder_.dispose();
            this.messageContentsBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public ConversationMessageContents.Builder getMessageContentsBuilder() {
         this.bitField0_ |= 2;
         this.onChanged();
         return this.getMessageContentsFieldBuilder().getBuilder();
      }

      @Override
      public ConversationMessageContentsOrBuilder getMessageContentsOrBuilder() {
         if (this.messageContentsBuilder_ != null) {
            return this.messageContentsBuilder_.getMessageOrBuilder();
         } else {
            return this.messageContents_ == null ? ConversationMessageContents.getDefaultInstance() : this.messageContents_;
         }
      }

      private SingleFieldBuilderV3<ConversationMessageContents, ConversationMessageContents.Builder, ConversationMessageContentsOrBuilder> getMessageContentsFieldBuilder() {
         if (this.messageContentsBuilder_ == null) {
            this.messageContentsBuilder_ = new SingleFieldBuilderV3<>(this.getMessageContents(), this.getParentForChildren(), this.isClean());
            this.messageContents_ = null;
         }

         return this.messageContentsBuilder_;
      }

      public final SendConversationMessageRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (SendConversationMessageRequest.Builder)super.setUnknownFields(var1);
      }

      public final SendConversationMessageRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (SendConversationMessageRequest.Builder)super.mergeUnknownFields(var1);
      }
   }
}
