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

public final class LoadConversationRequest extends GeneratedMessageV3 implements LoadConversationRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int CONVERSATION_REFERENCE_FIELD_NUMBER = 1;
   private ConversationReference conversationReference_;
   public static final int BEFORE_MESSAGE_ID_FIELD_NUMBER = 2;
   private Uuid beforeMessageId_;
   public static final int AFTER_MESSAGE_ID_FIELD_NUMBER = 3;
   private Uuid afterMessageId_;
   public static final int ANCHOR_MESSAGE_ID_FIELD_NUMBER = 4;
   private Uuid anchorMessageId_;
   private byte memoizedIsInitialized = -1;
   private static final LoadConversationRequest DEFAULT_INSTANCE = new LoadConversationRequest();
   private static final Parser<LoadConversationRequest> PARSER = new AbstractParser<LoadConversationRequest>() {
      public LoadConversationRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         LoadConversationRequest.Builder var3 = LoadConversationRequest.newBuilder();

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

   private LoadConversationRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private LoadConversationRequest() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new LoadConversationRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_LoadConversationRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_LoadConversationRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(LoadConversationRequest.class, LoadConversationRequest.Builder.class);
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
   public boolean hasBeforeMessageId() {
      return (this.bitField0_ & 2) != 0;
   }

   @Override
   public Uuid getBeforeMessageId() {
      return this.beforeMessageId_ == null ? Uuid.getDefaultInstance() : this.beforeMessageId_;
   }

   @Override
   public UuidOrBuilder getBeforeMessageIdOrBuilder() {
      return this.beforeMessageId_ == null ? Uuid.getDefaultInstance() : this.beforeMessageId_;
   }

   @Override
   public boolean hasAfterMessageId() {
      return (this.bitField0_ & 4) != 0;
   }

   @Override
   public Uuid getAfterMessageId() {
      return this.afterMessageId_ == null ? Uuid.getDefaultInstance() : this.afterMessageId_;
   }

   @Override
   public UuidOrBuilder getAfterMessageIdOrBuilder() {
      return this.afterMessageId_ == null ? Uuid.getDefaultInstance() : this.afterMessageId_;
   }

   @Override
   public boolean hasAnchorMessageId() {
      return (this.bitField0_ & 8) != 0;
   }

   @Override
   public Uuid getAnchorMessageId() {
      return this.anchorMessageId_ == null ? Uuid.getDefaultInstance() : this.anchorMessageId_;
   }

   @Override
   public UuidOrBuilder getAnchorMessageIdOrBuilder() {
      return this.anchorMessageId_ == null ? Uuid.getDefaultInstance() : this.anchorMessageId_;
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
         var1.writeMessage(2, this.getBeforeMessageId());
      }

      if ((this.bitField0_ & 4) != 0) {
         var1.writeMessage(3, this.getAfterMessageId());
      }

      if ((this.bitField0_ & 8) != 0) {
         var1.writeMessage(4, this.getAnchorMessageId());
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
         var1 += CodedOutputStream.computeMessageSize(2, this.getBeforeMessageId());
      }

      if ((this.bitField0_ & 4) != 0) {
         var1 += CodedOutputStream.computeMessageSize(3, this.getAfterMessageId());
      }

      if ((this.bitField0_ & 8) != 0) {
         var1 += CodedOutputStream.computeMessageSize(4, this.getAnchorMessageId());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof LoadConversationRequest)) {
         return super.equals(var1);
      } else {
         LoadConversationRequest var2 = (LoadConversationRequest)var1;
         if (this.hasConversationReference() != var2.hasConversationReference()) {
            return false;
         } else if (this.hasConversationReference() && !this.getConversationReference().equals(var2.getConversationReference())) {
            return false;
         } else if (this.hasBeforeMessageId() != var2.hasBeforeMessageId()) {
            return false;
         } else if (this.hasBeforeMessageId() && !this.getBeforeMessageId().equals(var2.getBeforeMessageId())) {
            return false;
         } else if (this.hasAfterMessageId() != var2.hasAfterMessageId()) {
            return false;
         } else if (this.hasAfterMessageId() && !this.getAfterMessageId().equals(var2.getAfterMessageId())) {
            return false;
         } else if (this.hasAnchorMessageId() != var2.hasAnchorMessageId()) {
            return false;
         } else {
            return this.hasAnchorMessageId() && !this.getAnchorMessageId().equals(var2.getAnchorMessageId())
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

      if (this.hasBeforeMessageId()) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getBeforeMessageId().hashCode();
      }

      if (this.hasAfterMessageId()) {
         var1 = 37 * var1 + 3;
         var1 = 53 * var1 + this.getAfterMessageId().hashCode();
      }

      if (this.hasAnchorMessageId()) {
         var1 = 37 * var1 + 4;
         var1 = 53 * var1 + this.getAnchorMessageId().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static LoadConversationRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static LoadConversationRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LoadConversationRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static LoadConversationRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LoadConversationRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static LoadConversationRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LoadConversationRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static LoadConversationRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static LoadConversationRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static LoadConversationRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static LoadConversationRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static LoadConversationRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public LoadConversationRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static LoadConversationRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static LoadConversationRequest.Builder newBuilder(LoadConversationRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public LoadConversationRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new LoadConversationRequest.Builder() : new LoadConversationRequest.Builder().mergeFrom(this);
   }

   protected LoadConversationRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new LoadConversationRequest.Builder(var1);
   }

   public static LoadConversationRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<LoadConversationRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<LoadConversationRequest> getParserForType() {
      return PARSER;
   }

   public LoadConversationRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<LoadConversationRequest.Builder> implements LoadConversationRequestOrBuilder {
      private int bitField0_;
      private ConversationReference conversationReference_;
      private SingleFieldBuilderV3<ConversationReference, ConversationReference.Builder, ConversationReferenceOrBuilder> conversationReferenceBuilder_;
      private Uuid beforeMessageId_;
      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> beforeMessageIdBuilder_;
      private Uuid afterMessageId_;
      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> afterMessageIdBuilder_;
      private Uuid anchorMessageId_;
      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> anchorMessageIdBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_LoadConversationRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_LoadConversationRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(LoadConversationRequest.class, LoadConversationRequest.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (LoadConversationRequest.alwaysUseFieldBuilders) {
            this.getConversationReferenceFieldBuilder();
            this.getBeforeMessageIdFieldBuilder();
            this.getAfterMessageIdFieldBuilder();
            this.getAnchorMessageIdFieldBuilder();
         }
      }

      public LoadConversationRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.conversationReference_ = null;
         if (this.conversationReferenceBuilder_ != null) {
            this.conversationReferenceBuilder_.dispose();
            this.conversationReferenceBuilder_ = null;
         }

         this.beforeMessageId_ = null;
         if (this.beforeMessageIdBuilder_ != null) {
            this.beforeMessageIdBuilder_.dispose();
            this.beforeMessageIdBuilder_ = null;
         }

         this.afterMessageId_ = null;
         if (this.afterMessageIdBuilder_ != null) {
            this.afterMessageIdBuilder_.dispose();
            this.afterMessageIdBuilder_ = null;
         }

         this.anchorMessageId_ = null;
         if (this.anchorMessageIdBuilder_ != null) {
            this.anchorMessageIdBuilder_.dispose();
            this.anchorMessageIdBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_LoadConversationRequest_descriptor;
      }

      public LoadConversationRequest getDefaultInstanceForType() {
         return LoadConversationRequest.getDefaultInstance();
      }

      public LoadConversationRequest build() {
         LoadConversationRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public LoadConversationRequest buildPartial() {
         LoadConversationRequest var1 = new LoadConversationRequest(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(LoadConversationRequest var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.conversationReference_ = this.conversationReferenceBuilder_ == null ? this.conversationReference_ : this.conversationReferenceBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.beforeMessageId_ = this.beforeMessageIdBuilder_ == null ? this.beforeMessageId_ : this.beforeMessageIdBuilder_.build();
            var3 |= 2;
         }

         if ((var2 & 4) != 0) {
            var1.afterMessageId_ = this.afterMessageIdBuilder_ == null ? this.afterMessageId_ : this.afterMessageIdBuilder_.build();
            var3 |= 4;
         }

         if ((var2 & 8) != 0) {
            var1.anchorMessageId_ = this.anchorMessageIdBuilder_ == null ? this.anchorMessageId_ : this.anchorMessageIdBuilder_.build();
            var3 |= 8;
         }

         LoadConversationRequest var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public LoadConversationRequest.Builder clone() {
         return (LoadConversationRequest.Builder)super.clone();
      }

      public LoadConversationRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (LoadConversationRequest.Builder)super.setField(var1, var2);
      }

      public LoadConversationRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (LoadConversationRequest.Builder)super.clearField(var1);
      }

      public LoadConversationRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (LoadConversationRequest.Builder)super.clearOneof(var1);
      }

      public LoadConversationRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (LoadConversationRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public LoadConversationRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (LoadConversationRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public LoadConversationRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof LoadConversationRequest) {
            return this.mergeFrom((LoadConversationRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public LoadConversationRequest.Builder mergeFrom(LoadConversationRequest var1) {
         if (var1 == LoadConversationRequest.getDefaultInstance()) {
            return this;
         }

         if (var1.hasConversationReference()) {
            this.mergeConversationReference(var1.getConversationReference());
         }

         if (var1.hasBeforeMessageId()) {
            this.mergeBeforeMessageId(var1.getBeforeMessageId());
         }

         if (var1.hasAfterMessageId()) {
            this.mergeAfterMessageId(var1.getAfterMessageId());
         }

         if (var1.hasAnchorMessageId()) {
            this.mergeAnchorMessageId(var1.getAnchorMessageId());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public LoadConversationRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getBeforeMessageIdFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 2;
                     break;
                  case 26:
                     var1.readMessage(this.getAfterMessageIdFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 4;
                     break;
                  case 34:
                     var1.readMessage(this.getAnchorMessageIdFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 8;
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

      public LoadConversationRequest.Builder setConversationReference(ConversationReference var1) {
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

      public LoadConversationRequest.Builder setConversationReference(ConversationReference.Builder var1) {
         if (this.conversationReferenceBuilder_ == null) {
            this.conversationReference_ = var1.build();
         } else {
            this.conversationReferenceBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public LoadConversationRequest.Builder mergeConversationReference(ConversationReference var1) {
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

      public LoadConversationRequest.Builder clearConversationReference() {
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
      public boolean hasBeforeMessageId() {
         return (this.bitField0_ & 2) != 0;
      }

      @Override
      public Uuid getBeforeMessageId() {
         if (this.beforeMessageIdBuilder_ == null) {
            return this.beforeMessageId_ == null ? Uuid.getDefaultInstance() : this.beforeMessageId_;
         } else {
            return this.beforeMessageIdBuilder_.getMessage();
         }
      }

      public LoadConversationRequest.Builder setBeforeMessageId(Uuid var1) {
         if (this.beforeMessageIdBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.beforeMessageId_ = var1;
         } else {
            this.beforeMessageIdBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public LoadConversationRequest.Builder setBeforeMessageId(Uuid.Builder var1) {
         if (this.beforeMessageIdBuilder_ == null) {
            this.beforeMessageId_ = var1.build();
         } else {
            this.beforeMessageIdBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public LoadConversationRequest.Builder mergeBeforeMessageId(Uuid var1) {
         if (this.beforeMessageIdBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0 && this.beforeMessageId_ != null && this.beforeMessageId_ != Uuid.getDefaultInstance()) {
               this.getBeforeMessageIdBuilder().mergeFrom(var1);
            } else {
               this.beforeMessageId_ = var1;
            }
         } else {
            this.beforeMessageIdBuilder_.mergeFrom(var1);
         }

         if (this.beforeMessageId_ != null) {
            this.bitField0_ |= 2;
            this.onChanged();
         }

         return this;
      }

      public LoadConversationRequest.Builder clearBeforeMessageId() {
         this.bitField0_ &= -3;
         this.beforeMessageId_ = null;
         if (this.beforeMessageIdBuilder_ != null) {
            this.beforeMessageIdBuilder_.dispose();
            this.beforeMessageIdBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Uuid.Builder getBeforeMessageIdBuilder() {
         this.bitField0_ |= 2;
         this.onChanged();
         return this.getBeforeMessageIdFieldBuilder().getBuilder();
      }

      @Override
      public UuidOrBuilder getBeforeMessageIdOrBuilder() {
         if (this.beforeMessageIdBuilder_ != null) {
            return this.beforeMessageIdBuilder_.getMessageOrBuilder();
         } else {
            return this.beforeMessageId_ == null ? Uuid.getDefaultInstance() : this.beforeMessageId_;
         }
      }

      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> getBeforeMessageIdFieldBuilder() {
         if (this.beforeMessageIdBuilder_ == null) {
            this.beforeMessageIdBuilder_ = new SingleFieldBuilderV3<>(this.getBeforeMessageId(), this.getParentForChildren(), this.isClean());
            this.beforeMessageId_ = null;
         }

         return this.beforeMessageIdBuilder_;
      }

      @Override
      public boolean hasAfterMessageId() {
         return (this.bitField0_ & 4) != 0;
      }

      @Override
      public Uuid getAfterMessageId() {
         if (this.afterMessageIdBuilder_ == null) {
            return this.afterMessageId_ == null ? Uuid.getDefaultInstance() : this.afterMessageId_;
         } else {
            return this.afterMessageIdBuilder_.getMessage();
         }
      }

      public LoadConversationRequest.Builder setAfterMessageId(Uuid var1) {
         if (this.afterMessageIdBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.afterMessageId_ = var1;
         } else {
            this.afterMessageIdBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public LoadConversationRequest.Builder setAfterMessageId(Uuid.Builder var1) {
         if (this.afterMessageIdBuilder_ == null) {
            this.afterMessageId_ = var1.build();
         } else {
            this.afterMessageIdBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public LoadConversationRequest.Builder mergeAfterMessageId(Uuid var1) {
         if (this.afterMessageIdBuilder_ == null) {
            if ((this.bitField0_ & 4) != 0 && this.afterMessageId_ != null && this.afterMessageId_ != Uuid.getDefaultInstance()) {
               this.getAfterMessageIdBuilder().mergeFrom(var1);
            } else {
               this.afterMessageId_ = var1;
            }
         } else {
            this.afterMessageIdBuilder_.mergeFrom(var1);
         }

         if (this.afterMessageId_ != null) {
            this.bitField0_ |= 4;
            this.onChanged();
         }

         return this;
      }

      public LoadConversationRequest.Builder clearAfterMessageId() {
         this.bitField0_ &= -5;
         this.afterMessageId_ = null;
         if (this.afterMessageIdBuilder_ != null) {
            this.afterMessageIdBuilder_.dispose();
            this.afterMessageIdBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Uuid.Builder getAfterMessageIdBuilder() {
         this.bitField0_ |= 4;
         this.onChanged();
         return this.getAfterMessageIdFieldBuilder().getBuilder();
      }

      @Override
      public UuidOrBuilder getAfterMessageIdOrBuilder() {
         if (this.afterMessageIdBuilder_ != null) {
            return this.afterMessageIdBuilder_.getMessageOrBuilder();
         } else {
            return this.afterMessageId_ == null ? Uuid.getDefaultInstance() : this.afterMessageId_;
         }
      }

      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> getAfterMessageIdFieldBuilder() {
         if (this.afterMessageIdBuilder_ == null) {
            this.afterMessageIdBuilder_ = new SingleFieldBuilderV3<>(this.getAfterMessageId(), this.getParentForChildren(), this.isClean());
            this.afterMessageId_ = null;
         }

         return this.afterMessageIdBuilder_;
      }

      @Override
      public boolean hasAnchorMessageId() {
         return (this.bitField0_ & 8) != 0;
      }

      @Override
      public Uuid getAnchorMessageId() {
         if (this.anchorMessageIdBuilder_ == null) {
            return this.anchorMessageId_ == null ? Uuid.getDefaultInstance() : this.anchorMessageId_;
         } else {
            return this.anchorMessageIdBuilder_.getMessage();
         }
      }

      public LoadConversationRequest.Builder setAnchorMessageId(Uuid var1) {
         if (this.anchorMessageIdBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.anchorMessageId_ = var1;
         } else {
            this.anchorMessageIdBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public LoadConversationRequest.Builder setAnchorMessageId(Uuid.Builder var1) {
         if (this.anchorMessageIdBuilder_ == null) {
            this.anchorMessageId_ = var1.build();
         } else {
            this.anchorMessageIdBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public LoadConversationRequest.Builder mergeAnchorMessageId(Uuid var1) {
         if (this.anchorMessageIdBuilder_ == null) {
            if ((this.bitField0_ & 8) != 0 && this.anchorMessageId_ != null && this.anchorMessageId_ != Uuid.getDefaultInstance()) {
               this.getAnchorMessageIdBuilder().mergeFrom(var1);
            } else {
               this.anchorMessageId_ = var1;
            }
         } else {
            this.anchorMessageIdBuilder_.mergeFrom(var1);
         }

         if (this.anchorMessageId_ != null) {
            this.bitField0_ |= 8;
            this.onChanged();
         }

         return this;
      }

      public LoadConversationRequest.Builder clearAnchorMessageId() {
         this.bitField0_ &= -9;
         this.anchorMessageId_ = null;
         if (this.anchorMessageIdBuilder_ != null) {
            this.anchorMessageIdBuilder_.dispose();
            this.anchorMessageIdBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Uuid.Builder getAnchorMessageIdBuilder() {
         this.bitField0_ |= 8;
         this.onChanged();
         return this.getAnchorMessageIdFieldBuilder().getBuilder();
      }

      @Override
      public UuidOrBuilder getAnchorMessageIdOrBuilder() {
         if (this.anchorMessageIdBuilder_ != null) {
            return this.anchorMessageIdBuilder_.getMessageOrBuilder();
         } else {
            return this.anchorMessageId_ == null ? Uuid.getDefaultInstance() : this.anchorMessageId_;
         }
      }

      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> getAnchorMessageIdFieldBuilder() {
         if (this.anchorMessageIdBuilder_ == null) {
            this.anchorMessageIdBuilder_ = new SingleFieldBuilderV3<>(this.getAnchorMessageId(), this.getParentForChildren(), this.isClean());
            this.anchorMessageId_ = null;
         }

         return this.anchorMessageIdBuilder_;
      }

      public final LoadConversationRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (LoadConversationRequest.Builder)super.setUnknownFields(var1);
      }

      public final LoadConversationRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (LoadConversationRequest.Builder)super.mergeUnknownFields(var1);
      }
   }
}
