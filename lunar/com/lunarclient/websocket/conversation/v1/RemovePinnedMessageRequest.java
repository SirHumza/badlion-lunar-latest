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

public final class RemovePinnedMessageRequest extends GeneratedMessageV3 implements RemovePinnedMessageRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int CONVERSATION_REFERENCE_FIELD_NUMBER = 1;
   private ConversationReference conversationReference_;
   public static final int MESSAGE_ID_FIELD_NUMBER = 2;
   private Uuid messageId_;
   private byte memoizedIsInitialized = -1;
   private static final RemovePinnedMessageRequest DEFAULT_INSTANCE = new RemovePinnedMessageRequest();
   private static final Parser<RemovePinnedMessageRequest> PARSER = new AbstractParser<RemovePinnedMessageRequest>() {
      public RemovePinnedMessageRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         RemovePinnedMessageRequest.Builder var3 = RemovePinnedMessageRequest.newBuilder();

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

   private RemovePinnedMessageRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private RemovePinnedMessageRequest() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new RemovePinnedMessageRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_RemovePinnedMessageRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_RemovePinnedMessageRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(RemovePinnedMessageRequest.class, RemovePinnedMessageRequest.Builder.class);
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
   public boolean hasMessageId() {
      return (this.bitField0_ & 2) != 0;
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
         var1.writeMessage(2, this.getMessageId());
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
         var1 += CodedOutputStream.computeMessageSize(2, this.getMessageId());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof RemovePinnedMessageRequest)) {
         return super.equals(var1);
      } else {
         RemovePinnedMessageRequest var2 = (RemovePinnedMessageRequest)var1;
         if (this.hasConversationReference() != var2.hasConversationReference()) {
            return false;
         } else if (this.hasConversationReference() && !this.getConversationReference().equals(var2.getConversationReference())) {
            return false;
         } else if (this.hasMessageId() != var2.hasMessageId()) {
            return false;
         } else {
            return this.hasMessageId() && !this.getMessageId().equals(var2.getMessageId()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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

      if (this.hasMessageId()) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getMessageId().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static RemovePinnedMessageRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static RemovePinnedMessageRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RemovePinnedMessageRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static RemovePinnedMessageRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RemovePinnedMessageRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static RemovePinnedMessageRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RemovePinnedMessageRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RemovePinnedMessageRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static RemovePinnedMessageRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static RemovePinnedMessageRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static RemovePinnedMessageRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RemovePinnedMessageRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public RemovePinnedMessageRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static RemovePinnedMessageRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static RemovePinnedMessageRequest.Builder newBuilder(RemovePinnedMessageRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public RemovePinnedMessageRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new RemovePinnedMessageRequest.Builder() : new RemovePinnedMessageRequest.Builder().mergeFrom(this);
   }

   protected RemovePinnedMessageRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new RemovePinnedMessageRequest.Builder(var1);
   }

   public static RemovePinnedMessageRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<RemovePinnedMessageRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<RemovePinnedMessageRequest> getParserForType() {
      return PARSER;
   }

   public RemovePinnedMessageRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<RemovePinnedMessageRequest.Builder> implements RemovePinnedMessageRequestOrBuilder {
      private int bitField0_;
      private ConversationReference conversationReference_;
      private SingleFieldBuilderV3<ConversationReference, ConversationReference.Builder, ConversationReferenceOrBuilder> conversationReferenceBuilder_;
      private Uuid messageId_;
      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> messageIdBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_RemovePinnedMessageRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_RemovePinnedMessageRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(RemovePinnedMessageRequest.class, RemovePinnedMessageRequest.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (RemovePinnedMessageRequest.alwaysUseFieldBuilders) {
            this.getConversationReferenceFieldBuilder();
            this.getMessageIdFieldBuilder();
         }
      }

      public RemovePinnedMessageRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.conversationReference_ = null;
         if (this.conversationReferenceBuilder_ != null) {
            this.conversationReferenceBuilder_.dispose();
            this.conversationReferenceBuilder_ = null;
         }

         this.messageId_ = null;
         if (this.messageIdBuilder_ != null) {
            this.messageIdBuilder_.dispose();
            this.messageIdBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_RemovePinnedMessageRequest_descriptor;
      }

      public RemovePinnedMessageRequest getDefaultInstanceForType() {
         return RemovePinnedMessageRequest.getDefaultInstance();
      }

      public RemovePinnedMessageRequest build() {
         RemovePinnedMessageRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public RemovePinnedMessageRequest buildPartial() {
         RemovePinnedMessageRequest var1 = new RemovePinnedMessageRequest(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(RemovePinnedMessageRequest var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.conversationReference_ = this.conversationReferenceBuilder_ == null ? this.conversationReference_ : this.conversationReferenceBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.messageId_ = this.messageIdBuilder_ == null ? this.messageId_ : this.messageIdBuilder_.build();
            var3 |= 2;
         }

         RemovePinnedMessageRequest var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public RemovePinnedMessageRequest.Builder clone() {
         return (RemovePinnedMessageRequest.Builder)super.clone();
      }

      public RemovePinnedMessageRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (RemovePinnedMessageRequest.Builder)super.setField(var1, var2);
      }

      public RemovePinnedMessageRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (RemovePinnedMessageRequest.Builder)super.clearField(var1);
      }

      public RemovePinnedMessageRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (RemovePinnedMessageRequest.Builder)super.clearOneof(var1);
      }

      public RemovePinnedMessageRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (RemovePinnedMessageRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public RemovePinnedMessageRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (RemovePinnedMessageRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public RemovePinnedMessageRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof RemovePinnedMessageRequest) {
            return this.mergeFrom((RemovePinnedMessageRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public RemovePinnedMessageRequest.Builder mergeFrom(RemovePinnedMessageRequest var1) {
         if (var1 == RemovePinnedMessageRequest.getDefaultInstance()) {
            return this;
         }

         if (var1.hasConversationReference()) {
            this.mergeConversationReference(var1.getConversationReference());
         }

         if (var1.hasMessageId()) {
            this.mergeMessageId(var1.getMessageId());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public RemovePinnedMessageRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getMessageIdFieldBuilder().getBuilder(), var2);
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

      public RemovePinnedMessageRequest.Builder setConversationReference(ConversationReference var1) {
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

      public RemovePinnedMessageRequest.Builder setConversationReference(ConversationReference.Builder var1) {
         if (this.conversationReferenceBuilder_ == null) {
            this.conversationReference_ = var1.build();
         } else {
            this.conversationReferenceBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public RemovePinnedMessageRequest.Builder mergeConversationReference(ConversationReference var1) {
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

      public RemovePinnedMessageRequest.Builder clearConversationReference() {
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
      public boolean hasMessageId() {
         return (this.bitField0_ & 2) != 0;
      }

      @Override
      public Uuid getMessageId() {
         if (this.messageIdBuilder_ == null) {
            return this.messageId_ == null ? Uuid.getDefaultInstance() : this.messageId_;
         } else {
            return this.messageIdBuilder_.getMessage();
         }
      }

      public RemovePinnedMessageRequest.Builder setMessageId(Uuid var1) {
         if (this.messageIdBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.messageId_ = var1;
         } else {
            this.messageIdBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public RemovePinnedMessageRequest.Builder setMessageId(Uuid.Builder var1) {
         if (this.messageIdBuilder_ == null) {
            this.messageId_ = var1.build();
         } else {
            this.messageIdBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public RemovePinnedMessageRequest.Builder mergeMessageId(Uuid var1) {
         if (this.messageIdBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0 && this.messageId_ != null && this.messageId_ != Uuid.getDefaultInstance()) {
               this.getMessageIdBuilder().mergeFrom(var1);
            } else {
               this.messageId_ = var1;
            }
         } else {
            this.messageIdBuilder_.mergeFrom(var1);
         }

         if (this.messageId_ != null) {
            this.bitField0_ |= 2;
            this.onChanged();
         }

         return this;
      }

      public RemovePinnedMessageRequest.Builder clearMessageId() {
         this.bitField0_ &= -3;
         this.messageId_ = null;
         if (this.messageIdBuilder_ != null) {
            this.messageIdBuilder_.dispose();
            this.messageIdBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Uuid.Builder getMessageIdBuilder() {
         this.bitField0_ |= 2;
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

      public final RemovePinnedMessageRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (RemovePinnedMessageRequest.Builder)super.setUnknownFields(var1);
      }

      public final RemovePinnedMessageRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (RemovePinnedMessageRequest.Builder)super.mergeUnknownFields(var1);
      }
   }
}
