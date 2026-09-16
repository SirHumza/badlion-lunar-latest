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

public final class ConversationMessageHistoryDeletedPush extends GeneratedMessageV3 implements ConversationMessageHistoryDeletedPushOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int CONVERSATION_REFERENCE_FIELD_NUMBER = 1;
   private ConversationReference conversationReference_;
   public static final int SENDER_UUID_FIELD_NUMBER = 2;
   private Uuid senderUuid_;
   private byte memoizedIsInitialized = -1;
   private static final ConversationMessageHistoryDeletedPush DEFAULT_INSTANCE = new ConversationMessageHistoryDeletedPush();
   private static final Parser<ConversationMessageHistoryDeletedPush> PARSER = new AbstractParser<ConversationMessageHistoryDeletedPush>() {
      public ConversationMessageHistoryDeletedPush parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         ConversationMessageHistoryDeletedPush.Builder var3 = ConversationMessageHistoryDeletedPush.newBuilder();

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

   private ConversationMessageHistoryDeletedPush(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private ConversationMessageHistoryDeletedPush() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new ConversationMessageHistoryDeletedPush();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return PushProto.internal_static_lunarclient_websocket_conversation_v1_ConversationMessageHistoryDeletedPush_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return PushProto.internal_static_lunarclient_websocket_conversation_v1_ConversationMessageHistoryDeletedPush_fieldAccessorTable
         .ensureFieldAccessorsInitialized(ConversationMessageHistoryDeletedPush.class, ConversationMessageHistoryDeletedPush.Builder.class);
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
   public boolean hasSenderUuid() {
      return (this.bitField0_ & 2) != 0;
   }

   @Override
   public Uuid getSenderUuid() {
      return this.senderUuid_ == null ? Uuid.getDefaultInstance() : this.senderUuid_;
   }

   @Override
   public UuidOrBuilder getSenderUuidOrBuilder() {
      return this.senderUuid_ == null ? Uuid.getDefaultInstance() : this.senderUuid_;
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
         var1.writeMessage(2, this.getSenderUuid());
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
         var1 += CodedOutputStream.computeMessageSize(2, this.getSenderUuid());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof ConversationMessageHistoryDeletedPush)) {
         return super.equals(var1);
      } else {
         ConversationMessageHistoryDeletedPush var2 = (ConversationMessageHistoryDeletedPush)var1;
         if (this.hasConversationReference() != var2.hasConversationReference()) {
            return false;
         } else if (this.hasConversationReference() && !this.getConversationReference().equals(var2.getConversationReference())) {
            return false;
         } else if (this.hasSenderUuid() != var2.hasSenderUuid()) {
            return false;
         } else {
            return this.hasSenderUuid() && !this.getSenderUuid().equals(var2.getSenderUuid()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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

      if (this.hasSenderUuid()) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getSenderUuid().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static ConversationMessageHistoryDeletedPush parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static ConversationMessageHistoryDeletedPush parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ConversationMessageHistoryDeletedPush parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static ConversationMessageHistoryDeletedPush parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ConversationMessageHistoryDeletedPush parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static ConversationMessageHistoryDeletedPush parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ConversationMessageHistoryDeletedPush parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ConversationMessageHistoryDeletedPush parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ConversationMessageHistoryDeletedPush parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ConversationMessageHistoryDeletedPush parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ConversationMessageHistoryDeletedPush parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ConversationMessageHistoryDeletedPush parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public ConversationMessageHistoryDeletedPush.Builder newBuilderForType() {
      return newBuilder();
   }

   public static ConversationMessageHistoryDeletedPush.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ConversationMessageHistoryDeletedPush.Builder newBuilder(ConversationMessageHistoryDeletedPush var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public ConversationMessageHistoryDeletedPush.Builder toBuilder() {
      return this == DEFAULT_INSTANCE
         ? new ConversationMessageHistoryDeletedPush.Builder()
         : new ConversationMessageHistoryDeletedPush.Builder().mergeFrom(this);
   }

   protected ConversationMessageHistoryDeletedPush.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new ConversationMessageHistoryDeletedPush.Builder(var1);
   }

   public static ConversationMessageHistoryDeletedPush getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<ConversationMessageHistoryDeletedPush> parser() {
      return PARSER;
   }

   @Override
   public Parser<ConversationMessageHistoryDeletedPush> getParserForType() {
      return PARSER;
   }

   public ConversationMessageHistoryDeletedPush getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder
      extends GeneratedMessageV3.Builder<ConversationMessageHistoryDeletedPush.Builder>
      implements ConversationMessageHistoryDeletedPushOrBuilder {
      private int bitField0_;
      private ConversationReference conversationReference_;
      private SingleFieldBuilderV3<ConversationReference, ConversationReference.Builder, ConversationReferenceOrBuilder> conversationReferenceBuilder_;
      private Uuid senderUuid_;
      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> senderUuidBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return PushProto.internal_static_lunarclient_websocket_conversation_v1_ConversationMessageHistoryDeletedPush_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PushProto.internal_static_lunarclient_websocket_conversation_v1_ConversationMessageHistoryDeletedPush_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ConversationMessageHistoryDeletedPush.class, ConversationMessageHistoryDeletedPush.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (ConversationMessageHistoryDeletedPush.alwaysUseFieldBuilders) {
            this.getConversationReferenceFieldBuilder();
            this.getSenderUuidFieldBuilder();
         }
      }

      public ConversationMessageHistoryDeletedPush.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.conversationReference_ = null;
         if (this.conversationReferenceBuilder_ != null) {
            this.conversationReferenceBuilder_.dispose();
            this.conversationReferenceBuilder_ = null;
         }

         this.senderUuid_ = null;
         if (this.senderUuidBuilder_ != null) {
            this.senderUuidBuilder_.dispose();
            this.senderUuidBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return PushProto.internal_static_lunarclient_websocket_conversation_v1_ConversationMessageHistoryDeletedPush_descriptor;
      }

      public ConversationMessageHistoryDeletedPush getDefaultInstanceForType() {
         return ConversationMessageHistoryDeletedPush.getDefaultInstance();
      }

      public ConversationMessageHistoryDeletedPush build() {
         ConversationMessageHistoryDeletedPush var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public ConversationMessageHistoryDeletedPush buildPartial() {
         ConversationMessageHistoryDeletedPush var1 = new ConversationMessageHistoryDeletedPush(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(ConversationMessageHistoryDeletedPush var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.conversationReference_ = this.conversationReferenceBuilder_ == null ? this.conversationReference_ : this.conversationReferenceBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.senderUuid_ = this.senderUuidBuilder_ == null ? this.senderUuid_ : this.senderUuidBuilder_.build();
            var3 |= 2;
         }

         ConversationMessageHistoryDeletedPush var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public ConversationMessageHistoryDeletedPush.Builder clone() {
         return (ConversationMessageHistoryDeletedPush.Builder)super.clone();
      }

      public ConversationMessageHistoryDeletedPush.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ConversationMessageHistoryDeletedPush.Builder)super.setField(var1, var2);
      }

      public ConversationMessageHistoryDeletedPush.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (ConversationMessageHistoryDeletedPush.Builder)super.clearField(var1);
      }

      public ConversationMessageHistoryDeletedPush.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (ConversationMessageHistoryDeletedPush.Builder)super.clearOneof(var1);
      }

      public ConversationMessageHistoryDeletedPush.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (ConversationMessageHistoryDeletedPush.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public ConversationMessageHistoryDeletedPush.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ConversationMessageHistoryDeletedPush.Builder)super.addRepeatedField(var1, var2);
      }

      public ConversationMessageHistoryDeletedPush.Builder mergeFrom(Message var1) {
         if (var1 instanceof ConversationMessageHistoryDeletedPush) {
            return this.mergeFrom((ConversationMessageHistoryDeletedPush)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public ConversationMessageHistoryDeletedPush.Builder mergeFrom(ConversationMessageHistoryDeletedPush var1) {
         if (var1 == ConversationMessageHistoryDeletedPush.getDefaultInstance()) {
            return this;
         }

         if (var1.hasConversationReference()) {
            this.mergeConversationReference(var1.getConversationReference());
         }

         if (var1.hasSenderUuid()) {
            this.mergeSenderUuid(var1.getSenderUuid());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public ConversationMessageHistoryDeletedPush.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getSenderUuidFieldBuilder().getBuilder(), var2);
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

      public ConversationMessageHistoryDeletedPush.Builder setConversationReference(ConversationReference var1) {
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

      public ConversationMessageHistoryDeletedPush.Builder setConversationReference(ConversationReference.Builder var1) {
         if (this.conversationReferenceBuilder_ == null) {
            this.conversationReference_ = var1.build();
         } else {
            this.conversationReferenceBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public ConversationMessageHistoryDeletedPush.Builder mergeConversationReference(ConversationReference var1) {
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

      public ConversationMessageHistoryDeletedPush.Builder clearConversationReference() {
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
      public boolean hasSenderUuid() {
         return (this.bitField0_ & 2) != 0;
      }

      @Override
      public Uuid getSenderUuid() {
         if (this.senderUuidBuilder_ == null) {
            return this.senderUuid_ == null ? Uuid.getDefaultInstance() : this.senderUuid_;
         } else {
            return this.senderUuidBuilder_.getMessage();
         }
      }

      public ConversationMessageHistoryDeletedPush.Builder setSenderUuid(Uuid var1) {
         if (this.senderUuidBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.senderUuid_ = var1;
         } else {
            this.senderUuidBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public ConversationMessageHistoryDeletedPush.Builder setSenderUuid(Uuid.Builder var1) {
         if (this.senderUuidBuilder_ == null) {
            this.senderUuid_ = var1.build();
         } else {
            this.senderUuidBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public ConversationMessageHistoryDeletedPush.Builder mergeSenderUuid(Uuid var1) {
         if (this.senderUuidBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0 && this.senderUuid_ != null && this.senderUuid_ != Uuid.getDefaultInstance()) {
               this.getSenderUuidBuilder().mergeFrom(var1);
            } else {
               this.senderUuid_ = var1;
            }
         } else {
            this.senderUuidBuilder_.mergeFrom(var1);
         }

         if (this.senderUuid_ != null) {
            this.bitField0_ |= 2;
            this.onChanged();
         }

         return this;
      }

      public ConversationMessageHistoryDeletedPush.Builder clearSenderUuid() {
         this.bitField0_ &= -3;
         this.senderUuid_ = null;
         if (this.senderUuidBuilder_ != null) {
            this.senderUuidBuilder_.dispose();
            this.senderUuidBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Uuid.Builder getSenderUuidBuilder() {
         this.bitField0_ |= 2;
         this.onChanged();
         return this.getSenderUuidFieldBuilder().getBuilder();
      }

      @Override
      public UuidOrBuilder getSenderUuidOrBuilder() {
         if (this.senderUuidBuilder_ != null) {
            return this.senderUuidBuilder_.getMessageOrBuilder();
         } else {
            return this.senderUuid_ == null ? Uuid.getDefaultInstance() : this.senderUuid_;
         }
      }

      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> getSenderUuidFieldBuilder() {
         if (this.senderUuidBuilder_ == null) {
            this.senderUuidBuilder_ = new SingleFieldBuilderV3<>(this.getSenderUuid(), this.getParentForChildren(), this.isClean());
            this.senderUuid_ = null;
         }

         return this.senderUuidBuilder_;
      }

      public final ConversationMessageHistoryDeletedPush.Builder setUnknownFields(UnknownFieldSet var1) {
         return (ConversationMessageHistoryDeletedPush.Builder)super.setUnknownFields(var1);
      }

      public final ConversationMessageHistoryDeletedPush.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (ConversationMessageHistoryDeletedPush.Builder)super.mergeUnknownFields(var1);
      }
   }
}
