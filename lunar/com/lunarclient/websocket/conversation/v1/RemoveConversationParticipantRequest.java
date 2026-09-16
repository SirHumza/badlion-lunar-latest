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
import com.lunarclient.common.v1.UuidAndUsername;
import com.lunarclient.common.v1.UuidAndUsernameOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class RemoveConversationParticipantRequest extends GeneratedMessageV3 implements RemoveConversationParticipantRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int CONVERSATION_REFERENCE_FIELD_NUMBER = 1;
   private ConversationReference conversationReference_;
   public static final int TARGET_FIELD_NUMBER = 2;
   private UuidAndUsername target_;
   private byte memoizedIsInitialized = -1;
   private static final RemoveConversationParticipantRequest DEFAULT_INSTANCE = new RemoveConversationParticipantRequest();
   private static final Parser<RemoveConversationParticipantRequest> PARSER = new AbstractParser<RemoveConversationParticipantRequest>() {
      public RemoveConversationParticipantRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         RemoveConversationParticipantRequest.Builder var3 = RemoveConversationParticipantRequest.newBuilder();

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

   private RemoveConversationParticipantRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private RemoveConversationParticipantRequest() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new RemoveConversationParticipantRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_RemoveConversationParticipantRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_RemoveConversationParticipantRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(RemoveConversationParticipantRequest.class, RemoveConversationParticipantRequest.Builder.class);
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
   public boolean hasTarget() {
      return (this.bitField0_ & 2) != 0;
   }

   @Override
   public UuidAndUsername getTarget() {
      return this.target_ == null ? UuidAndUsername.getDefaultInstance() : this.target_;
   }

   @Override
   public UuidAndUsernameOrBuilder getTargetOrBuilder() {
      return this.target_ == null ? UuidAndUsername.getDefaultInstance() : this.target_;
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
         var1.writeMessage(2, this.getTarget());
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
         var1 += CodedOutputStream.computeMessageSize(2, this.getTarget());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof RemoveConversationParticipantRequest)) {
         return super.equals(var1);
      } else {
         RemoveConversationParticipantRequest var2 = (RemoveConversationParticipantRequest)var1;
         if (this.hasConversationReference() != var2.hasConversationReference()) {
            return false;
         } else if (this.hasConversationReference() && !this.getConversationReference().equals(var2.getConversationReference())) {
            return false;
         } else if (this.hasTarget() != var2.hasTarget()) {
            return false;
         } else {
            return this.hasTarget() && !this.getTarget().equals(var2.getTarget()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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

      if (this.hasTarget()) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getTarget().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static RemoveConversationParticipantRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static RemoveConversationParticipantRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RemoveConversationParticipantRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static RemoveConversationParticipantRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RemoveConversationParticipantRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static RemoveConversationParticipantRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RemoveConversationParticipantRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RemoveConversationParticipantRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static RemoveConversationParticipantRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static RemoveConversationParticipantRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static RemoveConversationParticipantRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RemoveConversationParticipantRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public RemoveConversationParticipantRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static RemoveConversationParticipantRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static RemoveConversationParticipantRequest.Builder newBuilder(RemoveConversationParticipantRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public RemoveConversationParticipantRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new RemoveConversationParticipantRequest.Builder() : new RemoveConversationParticipantRequest.Builder().mergeFrom(this);
   }

   protected RemoveConversationParticipantRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new RemoveConversationParticipantRequest.Builder(var1);
   }

   public static RemoveConversationParticipantRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<RemoveConversationParticipantRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<RemoveConversationParticipantRequest> getParserForType() {
      return PARSER;
   }

   public RemoveConversationParticipantRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder
      extends GeneratedMessageV3.Builder<RemoveConversationParticipantRequest.Builder>
      implements RemoveConversationParticipantRequestOrBuilder {
      private int bitField0_;
      private ConversationReference conversationReference_;
      private SingleFieldBuilderV3<ConversationReference, ConversationReference.Builder, ConversationReferenceOrBuilder> conversationReferenceBuilder_;
      private UuidAndUsername target_;
      private SingleFieldBuilderV3<UuidAndUsername, UuidAndUsername.Builder, UuidAndUsernameOrBuilder> targetBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_RemoveConversationParticipantRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_RemoveConversationParticipantRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(RemoveConversationParticipantRequest.class, RemoveConversationParticipantRequest.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (RemoveConversationParticipantRequest.alwaysUseFieldBuilders) {
            this.getConversationReferenceFieldBuilder();
            this.getTargetFieldBuilder();
         }
      }

      public RemoveConversationParticipantRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.conversationReference_ = null;
         if (this.conversationReferenceBuilder_ != null) {
            this.conversationReferenceBuilder_.dispose();
            this.conversationReferenceBuilder_ = null;
         }

         this.target_ = null;
         if (this.targetBuilder_ != null) {
            this.targetBuilder_.dispose();
            this.targetBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_RemoveConversationParticipantRequest_descriptor;
      }

      public RemoveConversationParticipantRequest getDefaultInstanceForType() {
         return RemoveConversationParticipantRequest.getDefaultInstance();
      }

      public RemoveConversationParticipantRequest build() {
         RemoveConversationParticipantRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public RemoveConversationParticipantRequest buildPartial() {
         RemoveConversationParticipantRequest var1 = new RemoveConversationParticipantRequest(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(RemoveConversationParticipantRequest var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.conversationReference_ = this.conversationReferenceBuilder_ == null ? this.conversationReference_ : this.conversationReferenceBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.target_ = this.targetBuilder_ == null ? this.target_ : this.targetBuilder_.build();
            var3 |= 2;
         }

         RemoveConversationParticipantRequest var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public RemoveConversationParticipantRequest.Builder clone() {
         return (RemoveConversationParticipantRequest.Builder)super.clone();
      }

      public RemoveConversationParticipantRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (RemoveConversationParticipantRequest.Builder)super.setField(var1, var2);
      }

      public RemoveConversationParticipantRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (RemoveConversationParticipantRequest.Builder)super.clearField(var1);
      }

      public RemoveConversationParticipantRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (RemoveConversationParticipantRequest.Builder)super.clearOneof(var1);
      }

      public RemoveConversationParticipantRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (RemoveConversationParticipantRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public RemoveConversationParticipantRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (RemoveConversationParticipantRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public RemoveConversationParticipantRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof RemoveConversationParticipantRequest) {
            return this.mergeFrom((RemoveConversationParticipantRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public RemoveConversationParticipantRequest.Builder mergeFrom(RemoveConversationParticipantRequest var1) {
         if (var1 == RemoveConversationParticipantRequest.getDefaultInstance()) {
            return this;
         }

         if (var1.hasConversationReference()) {
            this.mergeConversationReference(var1.getConversationReference());
         }

         if (var1.hasTarget()) {
            this.mergeTarget(var1.getTarget());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public RemoveConversationParticipantRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getTargetFieldBuilder().getBuilder(), var2);
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

      public RemoveConversationParticipantRequest.Builder setConversationReference(ConversationReference var1) {
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

      public RemoveConversationParticipantRequest.Builder setConversationReference(ConversationReference.Builder var1) {
         if (this.conversationReferenceBuilder_ == null) {
            this.conversationReference_ = var1.build();
         } else {
            this.conversationReferenceBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public RemoveConversationParticipantRequest.Builder mergeConversationReference(ConversationReference var1) {
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

      public RemoveConversationParticipantRequest.Builder clearConversationReference() {
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
      public boolean hasTarget() {
         return (this.bitField0_ & 2) != 0;
      }

      @Override
      public UuidAndUsername getTarget() {
         if (this.targetBuilder_ == null) {
            return this.target_ == null ? UuidAndUsername.getDefaultInstance() : this.target_;
         } else {
            return this.targetBuilder_.getMessage();
         }
      }

      public RemoveConversationParticipantRequest.Builder setTarget(UuidAndUsername var1) {
         if (this.targetBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.target_ = var1;
         } else {
            this.targetBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public RemoveConversationParticipantRequest.Builder setTarget(UuidAndUsername.Builder var1) {
         if (this.targetBuilder_ == null) {
            this.target_ = var1.build();
         } else {
            this.targetBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public RemoveConversationParticipantRequest.Builder mergeTarget(UuidAndUsername var1) {
         if (this.targetBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0 && this.target_ != null && this.target_ != UuidAndUsername.getDefaultInstance()) {
               this.getTargetBuilder().mergeFrom(var1);
            } else {
               this.target_ = var1;
            }
         } else {
            this.targetBuilder_.mergeFrom(var1);
         }

         if (this.target_ != null) {
            this.bitField0_ |= 2;
            this.onChanged();
         }

         return this;
      }

      public RemoveConversationParticipantRequest.Builder clearTarget() {
         this.bitField0_ &= -3;
         this.target_ = null;
         if (this.targetBuilder_ != null) {
            this.targetBuilder_.dispose();
            this.targetBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public UuidAndUsername.Builder getTargetBuilder() {
         this.bitField0_ |= 2;
         this.onChanged();
         return this.getTargetFieldBuilder().getBuilder();
      }

      @Override
      public UuidAndUsernameOrBuilder getTargetOrBuilder() {
         if (this.targetBuilder_ != null) {
            return this.targetBuilder_.getMessageOrBuilder();
         } else {
            return this.target_ == null ? UuidAndUsername.getDefaultInstance() : this.target_;
         }
      }

      private SingleFieldBuilderV3<UuidAndUsername, UuidAndUsername.Builder, UuidAndUsernameOrBuilder> getTargetFieldBuilder() {
         if (this.targetBuilder_ == null) {
            this.targetBuilder_ = new SingleFieldBuilderV3<>(this.getTarget(), this.getParentForChildren(), this.isClean());
            this.target_ = null;
         }

         return this.targetBuilder_;
      }

      public final RemoveConversationParticipantRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (RemoveConversationParticipantRequest.Builder)super.setUnknownFields(var1);
      }

      public final RemoveConversationParticipantRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (RemoveConversationParticipantRequest.Builder)super.mergeUnknownFields(var1);
      }
   }
}
