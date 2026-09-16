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

public final class UpdateConversationOwnerRequest extends GeneratedMessageV3 implements UpdateConversationOwnerRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int CONVERSATION_REFERENCE_FIELD_NUMBER = 1;
   private ConversationReference conversationReference_;
   public static final int TARGET_UUID_FIELD_NUMBER = 2;
   private Uuid targetUuid_;
   private byte memoizedIsInitialized = -1;
   private static final UpdateConversationOwnerRequest DEFAULT_INSTANCE = new UpdateConversationOwnerRequest();
   private static final Parser<UpdateConversationOwnerRequest> PARSER = new AbstractParser<UpdateConversationOwnerRequest>() {
      public UpdateConversationOwnerRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         UpdateConversationOwnerRequest.Builder var3 = UpdateConversationOwnerRequest.newBuilder();

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

   private UpdateConversationOwnerRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private UpdateConversationOwnerRequest() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new UpdateConversationOwnerRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_UpdateConversationOwnerRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_UpdateConversationOwnerRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(UpdateConversationOwnerRequest.class, UpdateConversationOwnerRequest.Builder.class);
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
   public boolean hasTargetUuid() {
      return (this.bitField0_ & 2) != 0;
   }

   @Override
   public Uuid getTargetUuid() {
      return this.targetUuid_ == null ? Uuid.getDefaultInstance() : this.targetUuid_;
   }

   @Override
   public UuidOrBuilder getTargetUuidOrBuilder() {
      return this.targetUuid_ == null ? Uuid.getDefaultInstance() : this.targetUuid_;
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
         var1.writeMessage(2, this.getTargetUuid());
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
         var1 += CodedOutputStream.computeMessageSize(2, this.getTargetUuid());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof UpdateConversationOwnerRequest)) {
         return super.equals(var1);
      } else {
         UpdateConversationOwnerRequest var2 = (UpdateConversationOwnerRequest)var1;
         if (this.hasConversationReference() != var2.hasConversationReference()) {
            return false;
         } else if (this.hasConversationReference() && !this.getConversationReference().equals(var2.getConversationReference())) {
            return false;
         } else if (this.hasTargetUuid() != var2.hasTargetUuid()) {
            return false;
         } else {
            return this.hasTargetUuid() && !this.getTargetUuid().equals(var2.getTargetUuid()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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

      if (this.hasTargetUuid()) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getTargetUuid().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static UpdateConversationOwnerRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static UpdateConversationOwnerRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UpdateConversationOwnerRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static UpdateConversationOwnerRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UpdateConversationOwnerRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static UpdateConversationOwnerRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UpdateConversationOwnerRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UpdateConversationOwnerRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static UpdateConversationOwnerRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static UpdateConversationOwnerRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static UpdateConversationOwnerRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UpdateConversationOwnerRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public UpdateConversationOwnerRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static UpdateConversationOwnerRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static UpdateConversationOwnerRequest.Builder newBuilder(UpdateConversationOwnerRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public UpdateConversationOwnerRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new UpdateConversationOwnerRequest.Builder() : new UpdateConversationOwnerRequest.Builder().mergeFrom(this);
   }

   protected UpdateConversationOwnerRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new UpdateConversationOwnerRequest.Builder(var1);
   }

   public static UpdateConversationOwnerRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<UpdateConversationOwnerRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<UpdateConversationOwnerRequest> getParserForType() {
      return PARSER;
   }

   public UpdateConversationOwnerRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder
      extends GeneratedMessageV3.Builder<UpdateConversationOwnerRequest.Builder>
      implements UpdateConversationOwnerRequestOrBuilder {
      private int bitField0_;
      private ConversationReference conversationReference_;
      private SingleFieldBuilderV3<ConversationReference, ConversationReference.Builder, ConversationReferenceOrBuilder> conversationReferenceBuilder_;
      private Uuid targetUuid_;
      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> targetUuidBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_UpdateConversationOwnerRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_UpdateConversationOwnerRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(UpdateConversationOwnerRequest.class, UpdateConversationOwnerRequest.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (UpdateConversationOwnerRequest.alwaysUseFieldBuilders) {
            this.getConversationReferenceFieldBuilder();
            this.getTargetUuidFieldBuilder();
         }
      }

      public UpdateConversationOwnerRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.conversationReference_ = null;
         if (this.conversationReferenceBuilder_ != null) {
            this.conversationReferenceBuilder_.dispose();
            this.conversationReferenceBuilder_ = null;
         }

         this.targetUuid_ = null;
         if (this.targetUuidBuilder_ != null) {
            this.targetUuidBuilder_.dispose();
            this.targetUuidBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_UpdateConversationOwnerRequest_descriptor;
      }

      public UpdateConversationOwnerRequest getDefaultInstanceForType() {
         return UpdateConversationOwnerRequest.getDefaultInstance();
      }

      public UpdateConversationOwnerRequest build() {
         UpdateConversationOwnerRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public UpdateConversationOwnerRequest buildPartial() {
         UpdateConversationOwnerRequest var1 = new UpdateConversationOwnerRequest(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(UpdateConversationOwnerRequest var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.conversationReference_ = this.conversationReferenceBuilder_ == null ? this.conversationReference_ : this.conversationReferenceBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.targetUuid_ = this.targetUuidBuilder_ == null ? this.targetUuid_ : this.targetUuidBuilder_.build();
            var3 |= 2;
         }

         UpdateConversationOwnerRequest var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public UpdateConversationOwnerRequest.Builder clone() {
         return (UpdateConversationOwnerRequest.Builder)super.clone();
      }

      public UpdateConversationOwnerRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (UpdateConversationOwnerRequest.Builder)super.setField(var1, var2);
      }

      public UpdateConversationOwnerRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (UpdateConversationOwnerRequest.Builder)super.clearField(var1);
      }

      public UpdateConversationOwnerRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (UpdateConversationOwnerRequest.Builder)super.clearOneof(var1);
      }

      public UpdateConversationOwnerRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (UpdateConversationOwnerRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public UpdateConversationOwnerRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (UpdateConversationOwnerRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public UpdateConversationOwnerRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof UpdateConversationOwnerRequest) {
            return this.mergeFrom((UpdateConversationOwnerRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public UpdateConversationOwnerRequest.Builder mergeFrom(UpdateConversationOwnerRequest var1) {
         if (var1 == UpdateConversationOwnerRequest.getDefaultInstance()) {
            return this;
         }

         if (var1.hasConversationReference()) {
            this.mergeConversationReference(var1.getConversationReference());
         }

         if (var1.hasTargetUuid()) {
            this.mergeTargetUuid(var1.getTargetUuid());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public UpdateConversationOwnerRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getTargetUuidFieldBuilder().getBuilder(), var2);
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

      public UpdateConversationOwnerRequest.Builder setConversationReference(ConversationReference var1) {
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

      public UpdateConversationOwnerRequest.Builder setConversationReference(ConversationReference.Builder var1) {
         if (this.conversationReferenceBuilder_ == null) {
            this.conversationReference_ = var1.build();
         } else {
            this.conversationReferenceBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public UpdateConversationOwnerRequest.Builder mergeConversationReference(ConversationReference var1) {
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

      public UpdateConversationOwnerRequest.Builder clearConversationReference() {
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
      public boolean hasTargetUuid() {
         return (this.bitField0_ & 2) != 0;
      }

      @Override
      public Uuid getTargetUuid() {
         if (this.targetUuidBuilder_ == null) {
            return this.targetUuid_ == null ? Uuid.getDefaultInstance() : this.targetUuid_;
         } else {
            return this.targetUuidBuilder_.getMessage();
         }
      }

      public UpdateConversationOwnerRequest.Builder setTargetUuid(Uuid var1) {
         if (this.targetUuidBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.targetUuid_ = var1;
         } else {
            this.targetUuidBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public UpdateConversationOwnerRequest.Builder setTargetUuid(Uuid.Builder var1) {
         if (this.targetUuidBuilder_ == null) {
            this.targetUuid_ = var1.build();
         } else {
            this.targetUuidBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public UpdateConversationOwnerRequest.Builder mergeTargetUuid(Uuid var1) {
         if (this.targetUuidBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0 && this.targetUuid_ != null && this.targetUuid_ != Uuid.getDefaultInstance()) {
               this.getTargetUuidBuilder().mergeFrom(var1);
            } else {
               this.targetUuid_ = var1;
            }
         } else {
            this.targetUuidBuilder_.mergeFrom(var1);
         }

         if (this.targetUuid_ != null) {
            this.bitField0_ |= 2;
            this.onChanged();
         }

         return this;
      }

      public UpdateConversationOwnerRequest.Builder clearTargetUuid() {
         this.bitField0_ &= -3;
         this.targetUuid_ = null;
         if (this.targetUuidBuilder_ != null) {
            this.targetUuidBuilder_.dispose();
            this.targetUuidBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Uuid.Builder getTargetUuidBuilder() {
         this.bitField0_ |= 2;
         this.onChanged();
         return this.getTargetUuidFieldBuilder().getBuilder();
      }

      @Override
      public UuidOrBuilder getTargetUuidOrBuilder() {
         if (this.targetUuidBuilder_ != null) {
            return this.targetUuidBuilder_.getMessageOrBuilder();
         } else {
            return this.targetUuid_ == null ? Uuid.getDefaultInstance() : this.targetUuid_;
         }
      }

      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> getTargetUuidFieldBuilder() {
         if (this.targetUuidBuilder_ == null) {
            this.targetUuidBuilder_ = new SingleFieldBuilderV3<>(this.getTargetUuid(), this.getParentForChildren(), this.isClean());
            this.targetUuid_ = null;
         }

         return this.targetUuidBuilder_;
      }

      public final UpdateConversationOwnerRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (UpdateConversationOwnerRequest.Builder)super.setUnknownFields(var1);
      }

      public final UpdateConversationOwnerRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (UpdateConversationOwnerRequest.Builder)super.mergeUnknownFields(var1);
      }
   }
}
