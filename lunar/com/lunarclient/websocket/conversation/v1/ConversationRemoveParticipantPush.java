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

public final class ConversationRemoveParticipantPush extends GeneratedMessageV3 implements ConversationRemoveParticipantPushOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int CONVERSATION_REFERENCE_FIELD_NUMBER = 1;
   private ConversationReference conversationReference_;
   public static final int INVOKER_FIELD_NUMBER = 2;
   private UuidAndUsername invoker_;
   public static final int PARTICIPANT_FIELD_NUMBER = 3;
   private UuidAndUsername participant_;
   private byte memoizedIsInitialized = -1;
   private static final ConversationRemoveParticipantPush DEFAULT_INSTANCE = new ConversationRemoveParticipantPush();
   private static final Parser<ConversationRemoveParticipantPush> PARSER = new AbstractParser<ConversationRemoveParticipantPush>() {
      public ConversationRemoveParticipantPush parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         ConversationRemoveParticipantPush.Builder var3 = ConversationRemoveParticipantPush.newBuilder();

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

   private ConversationRemoveParticipantPush(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private ConversationRemoveParticipantPush() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new ConversationRemoveParticipantPush();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return PushProto.internal_static_lunarclient_websocket_conversation_v1_ConversationRemoveParticipantPush_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return PushProto.internal_static_lunarclient_websocket_conversation_v1_ConversationRemoveParticipantPush_fieldAccessorTable
         .ensureFieldAccessorsInitialized(ConversationRemoveParticipantPush.class, ConversationRemoveParticipantPush.Builder.class);
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
   public boolean hasParticipant() {
      return (this.bitField0_ & 4) != 0;
   }

   @Override
   public UuidAndUsername getParticipant() {
      return this.participant_ == null ? UuidAndUsername.getDefaultInstance() : this.participant_;
   }

   @Override
   public UuidAndUsernameOrBuilder getParticipantOrBuilder() {
      return this.participant_ == null ? UuidAndUsername.getDefaultInstance() : this.participant_;
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
         var1.writeMessage(3, this.getParticipant());
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
         var1 += CodedOutputStream.computeMessageSize(3, this.getParticipant());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof ConversationRemoveParticipantPush)) {
         return super.equals(var1);
      } else {
         ConversationRemoveParticipantPush var2 = (ConversationRemoveParticipantPush)var1;
         if (this.hasConversationReference() != var2.hasConversationReference()) {
            return false;
         } else if (this.hasConversationReference() && !this.getConversationReference().equals(var2.getConversationReference())) {
            return false;
         } else if (this.hasInvoker() != var2.hasInvoker()) {
            return false;
         } else if (this.hasInvoker() && !this.getInvoker().equals(var2.getInvoker())) {
            return false;
         } else if (this.hasParticipant() != var2.hasParticipant()) {
            return false;
         } else {
            return this.hasParticipant() && !this.getParticipant().equals(var2.getParticipant())
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

      if (this.hasInvoker()) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getInvoker().hashCode();
      }

      if (this.hasParticipant()) {
         var1 = 37 * var1 + 3;
         var1 = 53 * var1 + this.getParticipant().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static ConversationRemoveParticipantPush parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static ConversationRemoveParticipantPush parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ConversationRemoveParticipantPush parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static ConversationRemoveParticipantPush parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ConversationRemoveParticipantPush parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static ConversationRemoveParticipantPush parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ConversationRemoveParticipantPush parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ConversationRemoveParticipantPush parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ConversationRemoveParticipantPush parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ConversationRemoveParticipantPush parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ConversationRemoveParticipantPush parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ConversationRemoveParticipantPush parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public ConversationRemoveParticipantPush.Builder newBuilderForType() {
      return newBuilder();
   }

   public static ConversationRemoveParticipantPush.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ConversationRemoveParticipantPush.Builder newBuilder(ConversationRemoveParticipantPush var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public ConversationRemoveParticipantPush.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new ConversationRemoveParticipantPush.Builder() : new ConversationRemoveParticipantPush.Builder().mergeFrom(this);
   }

   protected ConversationRemoveParticipantPush.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new ConversationRemoveParticipantPush.Builder(var1);
   }

   public static ConversationRemoveParticipantPush getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<ConversationRemoveParticipantPush> parser() {
      return PARSER;
   }

   @Override
   public Parser<ConversationRemoveParticipantPush> getParserForType() {
      return PARSER;
   }

   public ConversationRemoveParticipantPush getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder
      extends GeneratedMessageV3.Builder<ConversationRemoveParticipantPush.Builder>
      implements ConversationRemoveParticipantPushOrBuilder {
      private int bitField0_;
      private ConversationReference conversationReference_;
      private SingleFieldBuilderV3<ConversationReference, ConversationReference.Builder, ConversationReferenceOrBuilder> conversationReferenceBuilder_;
      private UuidAndUsername invoker_;
      private SingleFieldBuilderV3<UuidAndUsername, UuidAndUsername.Builder, UuidAndUsernameOrBuilder> invokerBuilder_;
      private UuidAndUsername participant_;
      private SingleFieldBuilderV3<UuidAndUsername, UuidAndUsername.Builder, UuidAndUsernameOrBuilder> participantBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return PushProto.internal_static_lunarclient_websocket_conversation_v1_ConversationRemoveParticipantPush_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PushProto.internal_static_lunarclient_websocket_conversation_v1_ConversationRemoveParticipantPush_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ConversationRemoveParticipantPush.class, ConversationRemoveParticipantPush.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (ConversationRemoveParticipantPush.alwaysUseFieldBuilders) {
            this.getConversationReferenceFieldBuilder();
            this.getInvokerFieldBuilder();
            this.getParticipantFieldBuilder();
         }
      }

      public ConversationRemoveParticipantPush.Builder clear() {
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

         this.participant_ = null;
         if (this.participantBuilder_ != null) {
            this.participantBuilder_.dispose();
            this.participantBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return PushProto.internal_static_lunarclient_websocket_conversation_v1_ConversationRemoveParticipantPush_descriptor;
      }

      public ConversationRemoveParticipantPush getDefaultInstanceForType() {
         return ConversationRemoveParticipantPush.getDefaultInstance();
      }

      public ConversationRemoveParticipantPush build() {
         ConversationRemoveParticipantPush var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public ConversationRemoveParticipantPush buildPartial() {
         ConversationRemoveParticipantPush var1 = new ConversationRemoveParticipantPush(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(ConversationRemoveParticipantPush var1) {
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
            var1.participant_ = this.participantBuilder_ == null ? this.participant_ : this.participantBuilder_.build();
            var3 |= 4;
         }

         ConversationRemoveParticipantPush var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public ConversationRemoveParticipantPush.Builder clone() {
         return (ConversationRemoveParticipantPush.Builder)super.clone();
      }

      public ConversationRemoveParticipantPush.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ConversationRemoveParticipantPush.Builder)super.setField(var1, var2);
      }

      public ConversationRemoveParticipantPush.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (ConversationRemoveParticipantPush.Builder)super.clearField(var1);
      }

      public ConversationRemoveParticipantPush.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (ConversationRemoveParticipantPush.Builder)super.clearOneof(var1);
      }

      public ConversationRemoveParticipantPush.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (ConversationRemoveParticipantPush.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public ConversationRemoveParticipantPush.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ConversationRemoveParticipantPush.Builder)super.addRepeatedField(var1, var2);
      }

      public ConversationRemoveParticipantPush.Builder mergeFrom(Message var1) {
         if (var1 instanceof ConversationRemoveParticipantPush) {
            return this.mergeFrom((ConversationRemoveParticipantPush)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public ConversationRemoveParticipantPush.Builder mergeFrom(ConversationRemoveParticipantPush var1) {
         if (var1 == ConversationRemoveParticipantPush.getDefaultInstance()) {
            return this;
         }

         if (var1.hasConversationReference()) {
            this.mergeConversationReference(var1.getConversationReference());
         }

         if (var1.hasInvoker()) {
            this.mergeInvoker(var1.getInvoker());
         }

         if (var1.hasParticipant()) {
            this.mergeParticipant(var1.getParticipant());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public ConversationRemoveParticipantPush.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getParticipantFieldBuilder().getBuilder(), var2);
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

      public ConversationRemoveParticipantPush.Builder setConversationReference(ConversationReference var1) {
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

      public ConversationRemoveParticipantPush.Builder setConversationReference(ConversationReference.Builder var1) {
         if (this.conversationReferenceBuilder_ == null) {
            this.conversationReference_ = var1.build();
         } else {
            this.conversationReferenceBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public ConversationRemoveParticipantPush.Builder mergeConversationReference(ConversationReference var1) {
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

      public ConversationRemoveParticipantPush.Builder clearConversationReference() {
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

      public ConversationRemoveParticipantPush.Builder setInvoker(UuidAndUsername var1) {
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

      public ConversationRemoveParticipantPush.Builder setInvoker(UuidAndUsername.Builder var1) {
         if (this.invokerBuilder_ == null) {
            this.invoker_ = var1.build();
         } else {
            this.invokerBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public ConversationRemoveParticipantPush.Builder mergeInvoker(UuidAndUsername var1) {
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

      public ConversationRemoveParticipantPush.Builder clearInvoker() {
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
      public boolean hasParticipant() {
         return (this.bitField0_ & 4) != 0;
      }

      @Override
      public UuidAndUsername getParticipant() {
         if (this.participantBuilder_ == null) {
            return this.participant_ == null ? UuidAndUsername.getDefaultInstance() : this.participant_;
         } else {
            return this.participantBuilder_.getMessage();
         }
      }

      public ConversationRemoveParticipantPush.Builder setParticipant(UuidAndUsername var1) {
         if (this.participantBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.participant_ = var1;
         } else {
            this.participantBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public ConversationRemoveParticipantPush.Builder setParticipant(UuidAndUsername.Builder var1) {
         if (this.participantBuilder_ == null) {
            this.participant_ = var1.build();
         } else {
            this.participantBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public ConversationRemoveParticipantPush.Builder mergeParticipant(UuidAndUsername var1) {
         if (this.participantBuilder_ == null) {
            if ((this.bitField0_ & 4) != 0 && this.participant_ != null && this.participant_ != UuidAndUsername.getDefaultInstance()) {
               this.getParticipantBuilder().mergeFrom(var1);
            } else {
               this.participant_ = var1;
            }
         } else {
            this.participantBuilder_.mergeFrom(var1);
         }

         if (this.participant_ != null) {
            this.bitField0_ |= 4;
            this.onChanged();
         }

         return this;
      }

      public ConversationRemoveParticipantPush.Builder clearParticipant() {
         this.bitField0_ &= -5;
         this.participant_ = null;
         if (this.participantBuilder_ != null) {
            this.participantBuilder_.dispose();
            this.participantBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public UuidAndUsername.Builder getParticipantBuilder() {
         this.bitField0_ |= 4;
         this.onChanged();
         return this.getParticipantFieldBuilder().getBuilder();
      }

      @Override
      public UuidAndUsernameOrBuilder getParticipantOrBuilder() {
         if (this.participantBuilder_ != null) {
            return this.participantBuilder_.getMessageOrBuilder();
         } else {
            return this.participant_ == null ? UuidAndUsername.getDefaultInstance() : this.participant_;
         }
      }

      private SingleFieldBuilderV3<UuidAndUsername, UuidAndUsername.Builder, UuidAndUsernameOrBuilder> getParticipantFieldBuilder() {
         if (this.participantBuilder_ == null) {
            this.participantBuilder_ = new SingleFieldBuilderV3<>(this.getParticipant(), this.getParentForChildren(), this.isClean());
            this.participant_ = null;
         }

         return this.participantBuilder_;
      }

      public final ConversationRemoveParticipantPush.Builder setUnknownFields(UnknownFieldSet var1) {
         return (ConversationRemoveParticipantPush.Builder)super.setUnknownFields(var1);
      }

      public final ConversationRemoveParticipantPush.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (ConversationRemoveParticipantPush.Builder)super.mergeUnknownFields(var1);
      }
   }
}
