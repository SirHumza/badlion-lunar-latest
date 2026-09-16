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

public final class DeleteConversationMessageHistoryRequest extends GeneratedMessageV3 implements DeleteConversationMessageHistoryRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int CONVERSATION_REFERENCE_FIELD_NUMBER = 1;
   private ConversationReference conversationReference_;
   private byte memoizedIsInitialized = -1;
   private static final DeleteConversationMessageHistoryRequest DEFAULT_INSTANCE = new DeleteConversationMessageHistoryRequest();
   private static final Parser<DeleteConversationMessageHistoryRequest> PARSER = new AbstractParser<DeleteConversationMessageHistoryRequest>() {
      public DeleteConversationMessageHistoryRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         DeleteConversationMessageHistoryRequest.Builder var3 = DeleteConversationMessageHistoryRequest.newBuilder();

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

   private DeleteConversationMessageHistoryRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private DeleteConversationMessageHistoryRequest() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new DeleteConversationMessageHistoryRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_DeleteConversationMessageHistoryRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_DeleteConversationMessageHistoryRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(DeleteConversationMessageHistoryRequest.class, DeleteConversationMessageHistoryRequest.Builder.class);
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

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof DeleteConversationMessageHistoryRequest)) {
         return super.equals(var1);
      } else {
         DeleteConversationMessageHistoryRequest var2 = (DeleteConversationMessageHistoryRequest)var1;
         if (this.hasConversationReference() != var2.hasConversationReference()) {
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
      if (this.hasConversationReference()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getConversationReference().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static DeleteConversationMessageHistoryRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static DeleteConversationMessageHistoryRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static DeleteConversationMessageHistoryRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static DeleteConversationMessageHistoryRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static DeleteConversationMessageHistoryRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static DeleteConversationMessageHistoryRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static DeleteConversationMessageHistoryRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static DeleteConversationMessageHistoryRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static DeleteConversationMessageHistoryRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static DeleteConversationMessageHistoryRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static DeleteConversationMessageHistoryRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static DeleteConversationMessageHistoryRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public DeleteConversationMessageHistoryRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static DeleteConversationMessageHistoryRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static DeleteConversationMessageHistoryRequest.Builder newBuilder(DeleteConversationMessageHistoryRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public DeleteConversationMessageHistoryRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE
         ? new DeleteConversationMessageHistoryRequest.Builder()
         : new DeleteConversationMessageHistoryRequest.Builder().mergeFrom(this);
   }

   protected DeleteConversationMessageHistoryRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new DeleteConversationMessageHistoryRequest.Builder(var1);
   }

   public static DeleteConversationMessageHistoryRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<DeleteConversationMessageHistoryRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<DeleteConversationMessageHistoryRequest> getParserForType() {
      return PARSER;
   }

   public DeleteConversationMessageHistoryRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder
      extends GeneratedMessageV3.Builder<DeleteConversationMessageHistoryRequest.Builder>
      implements DeleteConversationMessageHistoryRequestOrBuilder {
      private int bitField0_;
      private ConversationReference conversationReference_;
      private SingleFieldBuilderV3<ConversationReference, ConversationReference.Builder, ConversationReferenceOrBuilder> conversationReferenceBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_DeleteConversationMessageHistoryRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_DeleteConversationMessageHistoryRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(DeleteConversationMessageHistoryRequest.class, DeleteConversationMessageHistoryRequest.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (DeleteConversationMessageHistoryRequest.alwaysUseFieldBuilders) {
            this.getConversationReferenceFieldBuilder();
         }
      }

      public DeleteConversationMessageHistoryRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.conversationReference_ = null;
         if (this.conversationReferenceBuilder_ != null) {
            this.conversationReferenceBuilder_.dispose();
            this.conversationReferenceBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_DeleteConversationMessageHistoryRequest_descriptor;
      }

      public DeleteConversationMessageHistoryRequest getDefaultInstanceForType() {
         return DeleteConversationMessageHistoryRequest.getDefaultInstance();
      }

      public DeleteConversationMessageHistoryRequest build() {
         DeleteConversationMessageHistoryRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public DeleteConversationMessageHistoryRequest buildPartial() {
         DeleteConversationMessageHistoryRequest var1 = new DeleteConversationMessageHistoryRequest(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(DeleteConversationMessageHistoryRequest var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.conversationReference_ = this.conversationReferenceBuilder_ == null ? this.conversationReference_ : this.conversationReferenceBuilder_.build();
            var3 |= 1;
         }

         DeleteConversationMessageHistoryRequest var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public DeleteConversationMessageHistoryRequest.Builder clone() {
         return (DeleteConversationMessageHistoryRequest.Builder)super.clone();
      }

      public DeleteConversationMessageHistoryRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (DeleteConversationMessageHistoryRequest.Builder)super.setField(var1, var2);
      }

      public DeleteConversationMessageHistoryRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (DeleteConversationMessageHistoryRequest.Builder)super.clearField(var1);
      }

      public DeleteConversationMessageHistoryRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (DeleteConversationMessageHistoryRequest.Builder)super.clearOneof(var1);
      }

      public DeleteConversationMessageHistoryRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (DeleteConversationMessageHistoryRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public DeleteConversationMessageHistoryRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (DeleteConversationMessageHistoryRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public DeleteConversationMessageHistoryRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof DeleteConversationMessageHistoryRequest) {
            return this.mergeFrom((DeleteConversationMessageHistoryRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public DeleteConversationMessageHistoryRequest.Builder mergeFrom(DeleteConversationMessageHistoryRequest var1) {
         if (var1 == DeleteConversationMessageHistoryRequest.getDefaultInstance()) {
            return this;
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

      public DeleteConversationMessageHistoryRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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

      public DeleteConversationMessageHistoryRequest.Builder setConversationReference(ConversationReference var1) {
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

      public DeleteConversationMessageHistoryRequest.Builder setConversationReference(ConversationReference.Builder var1) {
         if (this.conversationReferenceBuilder_ == null) {
            this.conversationReference_ = var1.build();
         } else {
            this.conversationReferenceBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public DeleteConversationMessageHistoryRequest.Builder mergeConversationReference(ConversationReference var1) {
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

      public DeleteConversationMessageHistoryRequest.Builder clearConversationReference() {
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

      public final DeleteConversationMessageHistoryRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (DeleteConversationMessageHistoryRequest.Builder)super.setUnknownFields(var1);
      }

      public final DeleteConversationMessageHistoryRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (DeleteConversationMessageHistoryRequest.Builder)super.mergeUnknownFields(var1);
      }
   }
}
