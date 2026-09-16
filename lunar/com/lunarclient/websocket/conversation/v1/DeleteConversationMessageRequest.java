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
import com.lunarclient.common.v1.Uuid;
import com.lunarclient.common.v1.UuidOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class DeleteConversationMessageRequest extends GeneratedMessageV3 implements DeleteConversationMessageRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int MESSAGE_ID_FIELD_NUMBER = 1;
   private Uuid messageId_;
   public static final int CONVERSATION_REFERENCE_FIELD_NUMBER = 2;
   private ConversationReference conversationReference_;
   private byte memoizedIsInitialized = -1;
   private static final DeleteConversationMessageRequest DEFAULT_INSTANCE = new DeleteConversationMessageRequest();
   private static final Parser<DeleteConversationMessageRequest> PARSER = new AbstractParser<DeleteConversationMessageRequest>() {
      public DeleteConversationMessageRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         DeleteConversationMessageRequest.Builder var3 = DeleteConversationMessageRequest.newBuilder();

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

   private DeleteConversationMessageRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private DeleteConversationMessageRequest() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new DeleteConversationMessageRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_DeleteConversationMessageRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_DeleteConversationMessageRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(DeleteConversationMessageRequest.class, DeleteConversationMessageRequest.Builder.class);
   }

   @Override
   public boolean hasMessageId() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public Uuid getMessageId() {
      return this.messageId_ == null ? Uuid.getDefaultInstance() : this.messageId_;
   }

   @Override
   public UuidOrBuilder getMessageIdOrBuilder() {
      return this.messageId_ == null ? Uuid.getDefaultInstance() : this.messageId_;
   }

   @Override
   public boolean hasConversationReference() {
      return (this.bitField0_ & 2) != 0;
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
         var1.writeMessage(1, this.getMessageId());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1.writeMessage(2, this.getConversationReference());
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
         var1 += CodedOutputStream.computeMessageSize(1, this.getMessageId());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1 += CodedOutputStream.computeMessageSize(2, this.getConversationReference());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof DeleteConversationMessageRequest)) {
         return super.equals(var1);
      } else {
         DeleteConversationMessageRequest var2 = (DeleteConversationMessageRequest)var1;
         if (this.hasMessageId() != var2.hasMessageId()) {
            return false;
         } else if (this.hasMessageId() && !this.getMessageId().equals(var2.getMessageId())) {
            return false;
         } else if (this.hasConversationReference() != var2.hasConversationReference()) {
            return false;
         } else {
            return this.hasConversationReference() && !this.getConversationReference().equals(var2.getConversationReference())
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
      if (this.hasMessageId()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getMessageId().hashCode();
      }

      if (this.hasConversationReference()) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getConversationReference().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static DeleteConversationMessageRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static DeleteConversationMessageRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static DeleteConversationMessageRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static DeleteConversationMessageRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static DeleteConversationMessageRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static DeleteConversationMessageRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static DeleteConversationMessageRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static DeleteConversationMessageRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static DeleteConversationMessageRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static DeleteConversationMessageRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static DeleteConversationMessageRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static DeleteConversationMessageRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public DeleteConversationMessageRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static DeleteConversationMessageRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static DeleteConversationMessageRequest.Builder newBuilder(DeleteConversationMessageRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public DeleteConversationMessageRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new DeleteConversationMessageRequest.Builder() : new DeleteConversationMessageRequest.Builder().mergeFrom(this);
   }

   protected DeleteConversationMessageRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new DeleteConversationMessageRequest.Builder(var1);
   }

   public static DeleteConversationMessageRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<DeleteConversationMessageRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<DeleteConversationMessageRequest> getParserForType() {
      return PARSER;
   }

   public DeleteConversationMessageRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder
      extends GeneratedMessageV3.Builder<DeleteConversationMessageRequest.Builder>
      implements DeleteConversationMessageRequestOrBuilder {
      private int bitField0_;
      private Uuid messageId_;
      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> messageIdBuilder_;
      private ConversationReference conversationReference_;
      private SingleFieldBuilderV3<ConversationReference, ConversationReference.Builder, ConversationReferenceOrBuilder> conversationReferenceBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_DeleteConversationMessageRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_DeleteConversationMessageRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(DeleteConversationMessageRequest.class, DeleteConversationMessageRequest.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (DeleteConversationMessageRequest.alwaysUseFieldBuilders) {
            this.getMessageIdFieldBuilder();
            this.getConversationReferenceFieldBuilder();
         }
      }

      public DeleteConversationMessageRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.messageId_ = null;
         if (this.messageIdBuilder_ != null) {
            this.messageIdBuilder_.dispose();
            this.messageIdBuilder_ = null;
         }

         this.conversationReference_ = null;
         if (this.conversationReferenceBuilder_ != null) {
            this.conversationReferenceBuilder_.dispose();
            this.conversationReferenceBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_DeleteConversationMessageRequest_descriptor;
      }

      public DeleteConversationMessageRequest getDefaultInstanceForType() {
         return DeleteConversationMessageRequest.getDefaultInstance();
      }

      public DeleteConversationMessageRequest build() {
         DeleteConversationMessageRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public DeleteConversationMessageRequest buildPartial() {
         DeleteConversationMessageRequest var1 = new DeleteConversationMessageRequest(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(DeleteConversationMessageRequest var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.messageId_ = this.messageIdBuilder_ == null ? this.messageId_ : this.messageIdBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.conversationReference_ = this.conversationReferenceBuilder_ == null ? this.conversationReference_ : this.conversationReferenceBuilder_.build();
            var3 |= 2;
         }

         DeleteConversationMessageRequest var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public DeleteConversationMessageRequest.Builder clone() {
         return (DeleteConversationMessageRequest.Builder)super.clone();
      }

      public DeleteConversationMessageRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (DeleteConversationMessageRequest.Builder)super.setField(var1, var2);
      }

      public DeleteConversationMessageRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (DeleteConversationMessageRequest.Builder)super.clearField(var1);
      }

      public DeleteConversationMessageRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (DeleteConversationMessageRequest.Builder)super.clearOneof(var1);
      }

      public DeleteConversationMessageRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (DeleteConversationMessageRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public DeleteConversationMessageRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (DeleteConversationMessageRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public DeleteConversationMessageRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof DeleteConversationMessageRequest) {
            return this.mergeFrom((DeleteConversationMessageRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public DeleteConversationMessageRequest.Builder mergeFrom(DeleteConversationMessageRequest var1) {
         if (var1 == DeleteConversationMessageRequest.getDefaultInstance()) {
            return this;
         }

         if (var1.hasMessageId()) {
            this.mergeMessageId(var1.getMessageId());
         }

         if (var1.hasConversationReference()) {
            this.mergeConversationReference(var1.getConversationReference());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public DeleteConversationMessageRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getMessageIdFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     var1.readMessage(this.getConversationReferenceFieldBuilder().getBuilder(), var2);
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
      public boolean hasMessageId() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public Uuid getMessageId() {
         if (this.messageIdBuilder_ == null) {
            return this.messageId_ == null ? Uuid.getDefaultInstance() : this.messageId_;
         } else {
            return this.messageIdBuilder_.getMessage();
         }
      }

      public DeleteConversationMessageRequest.Builder setMessageId(Uuid var1) {
         if (this.messageIdBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.messageId_ = var1;
         } else {
            this.messageIdBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public DeleteConversationMessageRequest.Builder setMessageId(Uuid.Builder var1) {
         if (this.messageIdBuilder_ == null) {
            this.messageId_ = var1.build();
         } else {
            this.messageIdBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public DeleteConversationMessageRequest.Builder mergeMessageId(Uuid var1) {
         if (this.messageIdBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.messageId_ != null && this.messageId_ != Uuid.getDefaultInstance()) {
               this.getMessageIdBuilder().mergeFrom(var1);
            } else {
               this.messageId_ = var1;
            }
         } else {
            this.messageIdBuilder_.mergeFrom(var1);
         }

         if (this.messageId_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public DeleteConversationMessageRequest.Builder clearMessageId() {
         this.bitField0_ &= -2;
         this.messageId_ = null;
         if (this.messageIdBuilder_ != null) {
            this.messageIdBuilder_.dispose();
            this.messageIdBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Uuid.Builder getMessageIdBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getMessageIdFieldBuilder().getBuilder();
      }

      @Override
      public UuidOrBuilder getMessageIdOrBuilder() {
         if (this.messageIdBuilder_ != null) {
            return this.messageIdBuilder_.getMessageOrBuilder();
         } else {
            return this.messageId_ == null ? Uuid.getDefaultInstance() : this.messageId_;
         }
      }

      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> getMessageIdFieldBuilder() {
         if (this.messageIdBuilder_ == null) {
            this.messageIdBuilder_ = new SingleFieldBuilderV3<>(this.getMessageId(), this.getParentForChildren(), this.isClean());
            this.messageId_ = null;
         }

         return this.messageIdBuilder_;
      }

      @Override
      public boolean hasConversationReference() {
         return (this.bitField0_ & 2) != 0;
      }

      @Override
      public ConversationReference getConversationReference() {
         if (this.conversationReferenceBuilder_ == null) {
            return this.conversationReference_ == null ? ConversationReference.getDefaultInstance() : this.conversationReference_;
         } else {
            return this.conversationReferenceBuilder_.getMessage();
         }
      }

      public DeleteConversationMessageRequest.Builder setConversationReference(ConversationReference var1) {
         if (this.conversationReferenceBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.conversationReference_ = var1;
         } else {
            this.conversationReferenceBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public DeleteConversationMessageRequest.Builder setConversationReference(ConversationReference.Builder var1) {
         if (this.conversationReferenceBuilder_ == null) {
            this.conversationReference_ = var1.build();
         } else {
            this.conversationReferenceBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public DeleteConversationMessageRequest.Builder mergeConversationReference(ConversationReference var1) {
         if (this.conversationReferenceBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0 && this.conversationReference_ != null && this.conversationReference_ != ConversationReference.getDefaultInstance()) {
               this.getConversationReferenceBuilder().mergeFrom(var1);
            } else {
               this.conversationReference_ = var1;
            }
         } else {
            this.conversationReferenceBuilder_.mergeFrom(var1);
         }

         if (this.conversationReference_ != null) {
            this.bitField0_ |= 2;
            this.onChanged();
         }

         return this;
      }

      public DeleteConversationMessageRequest.Builder clearConversationReference() {
         this.bitField0_ &= -3;
         this.conversationReference_ = null;
         if (this.conversationReferenceBuilder_ != null) {
            this.conversationReferenceBuilder_.dispose();
            this.conversationReferenceBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public ConversationReference.Builder getConversationReferenceBuilder() {
         this.bitField0_ |= 2;
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

      public final DeleteConversationMessageRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (DeleteConversationMessageRequest.Builder)super.setUnknownFields(var1);
      }

      public final DeleteConversationMessageRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (DeleteConversationMessageRequest.Builder)super.mergeUnknownFields(var1);
      }
   }
}
