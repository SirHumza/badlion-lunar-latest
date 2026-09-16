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
import com.lunarclient.common.v1.UuidAndUsername;
import com.lunarclient.common.v1.UuidAndUsernameOrBuilder;
import com.lunarclient.common.v1.UuidOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class ConversationOwnerUpdatePush extends GeneratedMessageV3 implements ConversationOwnerUpdatePushOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int CONVERSATION_REFERENCE_FIELD_NUMBER = 1;
   private ConversationReference conversationReference_;
   public static final int INVOKER_FIELD_NUMBER = 2;
   private UuidAndUsername invoker_;
   public static final int PREVIOUS_OWNER_UUID_FIELD_NUMBER = 3;
   private Uuid previousOwnerUuid_;
   public static final int OWNER_UUID_FIELD_NUMBER = 4;
   private Uuid ownerUuid_;
   private byte memoizedIsInitialized = -1;
   private static final ConversationOwnerUpdatePush DEFAULT_INSTANCE = new ConversationOwnerUpdatePush();
   private static final Parser<ConversationOwnerUpdatePush> PARSER = new AbstractParser<ConversationOwnerUpdatePush>() {
      public ConversationOwnerUpdatePush parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         ConversationOwnerUpdatePush.Builder var3 = ConversationOwnerUpdatePush.newBuilder();

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

   private ConversationOwnerUpdatePush(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private ConversationOwnerUpdatePush() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new ConversationOwnerUpdatePush();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return PushProto.internal_static_lunarclient_websocket_conversation_v1_ConversationOwnerUpdatePush_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return PushProto.internal_static_lunarclient_websocket_conversation_v1_ConversationOwnerUpdatePush_fieldAccessorTable
         .ensureFieldAccessorsInitialized(ConversationOwnerUpdatePush.class, ConversationOwnerUpdatePush.Builder.class);
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
   public boolean hasInvoker() {
      return (this.bitField0_ & 2) != 0;
   }

   @Override
   public UuidAndUsername getInvoker() {
      return this.invoker_ == null ? UuidAndUsername.getDefaultInstance() : this.invoker_;
   }

   @Override
   public UuidAndUsernameOrBuilder getInvokerOrBuilder() {
      return this.invoker_ == null ? UuidAndUsername.getDefaultInstance() : this.invoker_;
   }

   @Override
   public boolean hasPreviousOwnerUuid() {
      return (this.bitField0_ & 4) != 0;
   }

   @Override
   public Uuid getPreviousOwnerUuid() {
      return this.previousOwnerUuid_ == null ? Uuid.getDefaultInstance() : this.previousOwnerUuid_;
   }

   @Override
   public UuidOrBuilder getPreviousOwnerUuidOrBuilder() {
      return this.previousOwnerUuid_ == null ? Uuid.getDefaultInstance() : this.previousOwnerUuid_;
   }

   @Override
   public boolean hasOwnerUuid() {
      return (this.bitField0_ & 8) != 0;
   }

   @Override
   public Uuid getOwnerUuid() {
      return this.ownerUuid_ == null ? Uuid.getDefaultInstance() : this.ownerUuid_;
   }

   @Override
   public UuidOrBuilder getOwnerUuidOrBuilder() {
      return this.ownerUuid_ == null ? Uuid.getDefaultInstance() : this.ownerUuid_;
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
         var1.writeMessage(2, this.getInvoker());
      }

      if ((this.bitField0_ & 4) != 0) {
         var1.writeMessage(3, this.getPreviousOwnerUuid());
      }

      if ((this.bitField0_ & 8) != 0) {
         var1.writeMessage(4, this.getOwnerUuid());
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
         var1 += CodedOutputStream.computeMessageSize(2, this.getInvoker());
      }

      if ((this.bitField0_ & 4) != 0) {
         var1 += CodedOutputStream.computeMessageSize(3, this.getPreviousOwnerUuid());
      }

      if ((this.bitField0_ & 8) != 0) {
         var1 += CodedOutputStream.computeMessageSize(4, this.getOwnerUuid());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof ConversationOwnerUpdatePush)) {
         return super.equals(var1);
      } else {
         ConversationOwnerUpdatePush var2 = (ConversationOwnerUpdatePush)var1;
         if (this.hasConversationReference() != var2.hasConversationReference()) {
            return false;
         } else if (this.hasConversationReference() && !this.getConversationReference().equals(var2.getConversationReference())) {
            return false;
         } else if (this.hasInvoker() != var2.hasInvoker()) {
            return false;
         } else if (this.hasInvoker() && !this.getInvoker().equals(var2.getInvoker())) {
            return false;
         } else if (this.hasPreviousOwnerUuid() != var2.hasPreviousOwnerUuid()) {
            return false;
         } else if (this.hasPreviousOwnerUuid() && !this.getPreviousOwnerUuid().equals(var2.getPreviousOwnerUuid())) {
            return false;
         } else if (this.hasOwnerUuid() != var2.hasOwnerUuid()) {
            return false;
         } else {
            return this.hasOwnerUuid() && !this.getOwnerUuid().equals(var2.getOwnerUuid()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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

      if (this.hasInvoker()) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getInvoker().hashCode();
      }

      if (this.hasPreviousOwnerUuid()) {
         var1 = 37 * var1 + 3;
         var1 = 53 * var1 + this.getPreviousOwnerUuid().hashCode();
      }

      if (this.hasOwnerUuid()) {
         var1 = 37 * var1 + 4;
         var1 = 53 * var1 + this.getOwnerUuid().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static ConversationOwnerUpdatePush parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static ConversationOwnerUpdatePush parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ConversationOwnerUpdatePush parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static ConversationOwnerUpdatePush parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ConversationOwnerUpdatePush parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static ConversationOwnerUpdatePush parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ConversationOwnerUpdatePush parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ConversationOwnerUpdatePush parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ConversationOwnerUpdatePush parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ConversationOwnerUpdatePush parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ConversationOwnerUpdatePush parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ConversationOwnerUpdatePush parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public ConversationOwnerUpdatePush.Builder newBuilderForType() {
      return newBuilder();
   }

   public static ConversationOwnerUpdatePush.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ConversationOwnerUpdatePush.Builder newBuilder(ConversationOwnerUpdatePush var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public ConversationOwnerUpdatePush.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new ConversationOwnerUpdatePush.Builder() : new ConversationOwnerUpdatePush.Builder().mergeFrom(this);
   }

   protected ConversationOwnerUpdatePush.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new ConversationOwnerUpdatePush.Builder(var1);
   }

   public static ConversationOwnerUpdatePush getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<ConversationOwnerUpdatePush> parser() {
      return PARSER;
   }

   @Override
   public Parser<ConversationOwnerUpdatePush> getParserForType() {
      return PARSER;
   }

   public ConversationOwnerUpdatePush getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<ConversationOwnerUpdatePush.Builder> implements ConversationOwnerUpdatePushOrBuilder {
      private int bitField0_;
      private ConversationReference conversationReference_;
      private SingleFieldBuilderV3<ConversationReference, ConversationReference.Builder, ConversationReferenceOrBuilder> conversationReferenceBuilder_;
      private UuidAndUsername invoker_;
      private SingleFieldBuilderV3<UuidAndUsername, UuidAndUsername.Builder, UuidAndUsernameOrBuilder> invokerBuilder_;
      private Uuid previousOwnerUuid_;
      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> previousOwnerUuidBuilder_;
      private Uuid ownerUuid_;
      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> ownerUuidBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return PushProto.internal_static_lunarclient_websocket_conversation_v1_ConversationOwnerUpdatePush_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PushProto.internal_static_lunarclient_websocket_conversation_v1_ConversationOwnerUpdatePush_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ConversationOwnerUpdatePush.class, ConversationOwnerUpdatePush.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (ConversationOwnerUpdatePush.alwaysUseFieldBuilders) {
            this.getConversationReferenceFieldBuilder();
            this.getInvokerFieldBuilder();
            this.getPreviousOwnerUuidFieldBuilder();
            this.getOwnerUuidFieldBuilder();
         }
      }

      public ConversationOwnerUpdatePush.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.conversationReference_ = null;
         if (this.conversationReferenceBuilder_ != null) {
            this.conversationReferenceBuilder_.dispose();
            this.conversationReferenceBuilder_ = null;
         }

         this.invoker_ = null;
         if (this.invokerBuilder_ != null) {
            this.invokerBuilder_.dispose();
            this.invokerBuilder_ = null;
         }

         this.previousOwnerUuid_ = null;
         if (this.previousOwnerUuidBuilder_ != null) {
            this.previousOwnerUuidBuilder_.dispose();
            this.previousOwnerUuidBuilder_ = null;
         }

         this.ownerUuid_ = null;
         if (this.ownerUuidBuilder_ != null) {
            this.ownerUuidBuilder_.dispose();
            this.ownerUuidBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return PushProto.internal_static_lunarclient_websocket_conversation_v1_ConversationOwnerUpdatePush_descriptor;
      }

      public ConversationOwnerUpdatePush getDefaultInstanceForType() {
         return ConversationOwnerUpdatePush.getDefaultInstance();
      }

      public ConversationOwnerUpdatePush build() {
         ConversationOwnerUpdatePush var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public ConversationOwnerUpdatePush buildPartial() {
         ConversationOwnerUpdatePush var1 = new ConversationOwnerUpdatePush(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(ConversationOwnerUpdatePush var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.conversationReference_ = this.conversationReferenceBuilder_ == null ? this.conversationReference_ : this.conversationReferenceBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.invoker_ = this.invokerBuilder_ == null ? this.invoker_ : this.invokerBuilder_.build();
            var3 |= 2;
         }

         if ((var2 & 4) != 0) {
            var1.previousOwnerUuid_ = this.previousOwnerUuidBuilder_ == null ? this.previousOwnerUuid_ : this.previousOwnerUuidBuilder_.build();
            var3 |= 4;
         }

         if ((var2 & 8) != 0) {
            var1.ownerUuid_ = this.ownerUuidBuilder_ == null ? this.ownerUuid_ : this.ownerUuidBuilder_.build();
            var3 |= 8;
         }

         ConversationOwnerUpdatePush var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public ConversationOwnerUpdatePush.Builder clone() {
         return (ConversationOwnerUpdatePush.Builder)super.clone();
      }

      public ConversationOwnerUpdatePush.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ConversationOwnerUpdatePush.Builder)super.setField(var1, var2);
      }

      public ConversationOwnerUpdatePush.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (ConversationOwnerUpdatePush.Builder)super.clearField(var1);
      }

      public ConversationOwnerUpdatePush.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (ConversationOwnerUpdatePush.Builder)super.clearOneof(var1);
      }

      public ConversationOwnerUpdatePush.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (ConversationOwnerUpdatePush.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public ConversationOwnerUpdatePush.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ConversationOwnerUpdatePush.Builder)super.addRepeatedField(var1, var2);
      }

      public ConversationOwnerUpdatePush.Builder mergeFrom(Message var1) {
         if (var1 instanceof ConversationOwnerUpdatePush) {
            return this.mergeFrom((ConversationOwnerUpdatePush)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public ConversationOwnerUpdatePush.Builder mergeFrom(ConversationOwnerUpdatePush var1) {
         if (var1 == ConversationOwnerUpdatePush.getDefaultInstance()) {
            return this;
         }

         if (var1.hasConversationReference()) {
            this.mergeConversationReference(var1.getConversationReference());
         }

         if (var1.hasInvoker()) {
            this.mergeInvoker(var1.getInvoker());
         }

         if (var1.hasPreviousOwnerUuid()) {
            this.mergePreviousOwnerUuid(var1.getPreviousOwnerUuid());
         }

         if (var1.hasOwnerUuid()) {
            this.mergeOwnerUuid(var1.getOwnerUuid());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public ConversationOwnerUpdatePush.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getInvokerFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 2;
                     break;
                  case 26:
                     var1.readMessage(this.getPreviousOwnerUuidFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 4;
                     break;
                  case 34:
                     var1.readMessage(this.getOwnerUuidFieldBuilder().getBuilder(), var2);
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

      public ConversationOwnerUpdatePush.Builder setConversationReference(ConversationReference var1) {
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

      public ConversationOwnerUpdatePush.Builder setConversationReference(ConversationReference.Builder var1) {
         if (this.conversationReferenceBuilder_ == null) {
            this.conversationReference_ = var1.build();
         } else {
            this.conversationReferenceBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public ConversationOwnerUpdatePush.Builder mergeConversationReference(ConversationReference var1) {
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

      public ConversationOwnerUpdatePush.Builder clearConversationReference() {
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
      public boolean hasInvoker() {
         return (this.bitField0_ & 2) != 0;
      }

      @Override
      public UuidAndUsername getInvoker() {
         if (this.invokerBuilder_ == null) {
            return this.invoker_ == null ? UuidAndUsername.getDefaultInstance() : this.invoker_;
         } else {
            return this.invokerBuilder_.getMessage();
         }
      }

      public ConversationOwnerUpdatePush.Builder setInvoker(UuidAndUsername var1) {
         if (this.invokerBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.invoker_ = var1;
         } else {
            this.invokerBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public ConversationOwnerUpdatePush.Builder setInvoker(UuidAndUsername.Builder var1) {
         if (this.invokerBuilder_ == null) {
            this.invoker_ = var1.build();
         } else {
            this.invokerBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public ConversationOwnerUpdatePush.Builder mergeInvoker(UuidAndUsername var1) {
         if (this.invokerBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0 && this.invoker_ != null && this.invoker_ != UuidAndUsername.getDefaultInstance()) {
               this.getInvokerBuilder().mergeFrom(var1);
            } else {
               this.invoker_ = var1;
            }
         } else {
            this.invokerBuilder_.mergeFrom(var1);
         }

         if (this.invoker_ != null) {
            this.bitField0_ |= 2;
            this.onChanged();
         }

         return this;
      }

      public ConversationOwnerUpdatePush.Builder clearInvoker() {
         this.bitField0_ &= -3;
         this.invoker_ = null;
         if (this.invokerBuilder_ != null) {
            this.invokerBuilder_.dispose();
            this.invokerBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public UuidAndUsername.Builder getInvokerBuilder() {
         this.bitField0_ |= 2;
         this.onChanged();
         return this.getInvokerFieldBuilder().getBuilder();
      }

      @Override
      public UuidAndUsernameOrBuilder getInvokerOrBuilder() {
         if (this.invokerBuilder_ != null) {
            return this.invokerBuilder_.getMessageOrBuilder();
         } else {
            return this.invoker_ == null ? UuidAndUsername.getDefaultInstance() : this.invoker_;
         }
      }

      private SingleFieldBuilderV3<UuidAndUsername, UuidAndUsername.Builder, UuidAndUsernameOrBuilder> getInvokerFieldBuilder() {
         if (this.invokerBuilder_ == null) {
            this.invokerBuilder_ = new SingleFieldBuilderV3<>(this.getInvoker(), this.getParentForChildren(), this.isClean());
            this.invoker_ = null;
         }

         return this.invokerBuilder_;
      }

      @Override
      public boolean hasPreviousOwnerUuid() {
         return (this.bitField0_ & 4) != 0;
      }

      @Override
      public Uuid getPreviousOwnerUuid() {
         if (this.previousOwnerUuidBuilder_ == null) {
            return this.previousOwnerUuid_ == null ? Uuid.getDefaultInstance() : this.previousOwnerUuid_;
         } else {
            return this.previousOwnerUuidBuilder_.getMessage();
         }
      }

      public ConversationOwnerUpdatePush.Builder setPreviousOwnerUuid(Uuid var1) {
         if (this.previousOwnerUuidBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.previousOwnerUuid_ = var1;
         } else {
            this.previousOwnerUuidBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public ConversationOwnerUpdatePush.Builder setPreviousOwnerUuid(Uuid.Builder var1) {
         if (this.previousOwnerUuidBuilder_ == null) {
            this.previousOwnerUuid_ = var1.build();
         } else {
            this.previousOwnerUuidBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public ConversationOwnerUpdatePush.Builder mergePreviousOwnerUuid(Uuid var1) {
         if (this.previousOwnerUuidBuilder_ == null) {
            if ((this.bitField0_ & 4) != 0 && this.previousOwnerUuid_ != null && this.previousOwnerUuid_ != Uuid.getDefaultInstance()) {
               this.getPreviousOwnerUuidBuilder().mergeFrom(var1);
            } else {
               this.previousOwnerUuid_ = var1;
            }
         } else {
            this.previousOwnerUuidBuilder_.mergeFrom(var1);
         }

         if (this.previousOwnerUuid_ != null) {
            this.bitField0_ |= 4;
            this.onChanged();
         }

         return this;
      }

      public ConversationOwnerUpdatePush.Builder clearPreviousOwnerUuid() {
         this.bitField0_ &= -5;
         this.previousOwnerUuid_ = null;
         if (this.previousOwnerUuidBuilder_ != null) {
            this.previousOwnerUuidBuilder_.dispose();
            this.previousOwnerUuidBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Uuid.Builder getPreviousOwnerUuidBuilder() {
         this.bitField0_ |= 4;
         this.onChanged();
         return this.getPreviousOwnerUuidFieldBuilder().getBuilder();
      }

      @Override
      public UuidOrBuilder getPreviousOwnerUuidOrBuilder() {
         if (this.previousOwnerUuidBuilder_ != null) {
            return this.previousOwnerUuidBuilder_.getMessageOrBuilder();
         } else {
            return this.previousOwnerUuid_ == null ? Uuid.getDefaultInstance() : this.previousOwnerUuid_;
         }
      }

      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> getPreviousOwnerUuidFieldBuilder() {
         if (this.previousOwnerUuidBuilder_ == null) {
            this.previousOwnerUuidBuilder_ = new SingleFieldBuilderV3<>(this.getPreviousOwnerUuid(), this.getParentForChildren(), this.isClean());
            this.previousOwnerUuid_ = null;
         }

         return this.previousOwnerUuidBuilder_;
      }

      @Override
      public boolean hasOwnerUuid() {
         return (this.bitField0_ & 8) != 0;
      }

      @Override
      public Uuid getOwnerUuid() {
         if (this.ownerUuidBuilder_ == null) {
            return this.ownerUuid_ == null ? Uuid.getDefaultInstance() : this.ownerUuid_;
         } else {
            return this.ownerUuidBuilder_.getMessage();
         }
      }

      public ConversationOwnerUpdatePush.Builder setOwnerUuid(Uuid var1) {
         if (this.ownerUuidBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ownerUuid_ = var1;
         } else {
            this.ownerUuidBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public ConversationOwnerUpdatePush.Builder setOwnerUuid(Uuid.Builder var1) {
         if (this.ownerUuidBuilder_ == null) {
            this.ownerUuid_ = var1.build();
         } else {
            this.ownerUuidBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public ConversationOwnerUpdatePush.Builder mergeOwnerUuid(Uuid var1) {
         if (this.ownerUuidBuilder_ == null) {
            if ((this.bitField0_ & 8) != 0 && this.ownerUuid_ != null && this.ownerUuid_ != Uuid.getDefaultInstance()) {
               this.getOwnerUuidBuilder().mergeFrom(var1);
            } else {
               this.ownerUuid_ = var1;
            }
         } else {
            this.ownerUuidBuilder_.mergeFrom(var1);
         }

         if (this.ownerUuid_ != null) {
            this.bitField0_ |= 8;
            this.onChanged();
         }

         return this;
      }

      public ConversationOwnerUpdatePush.Builder clearOwnerUuid() {
         this.bitField0_ &= -9;
         this.ownerUuid_ = null;
         if (this.ownerUuidBuilder_ != null) {
            this.ownerUuidBuilder_.dispose();
            this.ownerUuidBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Uuid.Builder getOwnerUuidBuilder() {
         this.bitField0_ |= 8;
         this.onChanged();
         return this.getOwnerUuidFieldBuilder().getBuilder();
      }

      @Override
      public UuidOrBuilder getOwnerUuidOrBuilder() {
         if (this.ownerUuidBuilder_ != null) {
            return this.ownerUuidBuilder_.getMessageOrBuilder();
         } else {
            return this.ownerUuid_ == null ? Uuid.getDefaultInstance() : this.ownerUuid_;
         }
      }

      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> getOwnerUuidFieldBuilder() {
         if (this.ownerUuidBuilder_ == null) {
            this.ownerUuidBuilder_ = new SingleFieldBuilderV3<>(this.getOwnerUuid(), this.getParentForChildren(), this.isClean());
            this.ownerUuid_ = null;
         }

         return this.ownerUuidBuilder_;
      }

      public final ConversationOwnerUpdatePush.Builder setUnknownFields(UnknownFieldSet var1) {
         return (ConversationOwnerUpdatePush.Builder)super.setUnknownFields(var1);
      }

      public final ConversationOwnerUpdatePush.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (ConversationOwnerUpdatePush.Builder)super.mergeUnknownFields(var1);
      }
   }
}
