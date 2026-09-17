package com.lunarclient.websocket.conversation.v1;

import com.google.protobuf.AbstractMessageLite;
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
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import com.lunarclient.common.v1.UuidAndUsername;
import com.lunarclient.common.v1.UuidAndUsernameOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ConversationAddParticipantsPush extends GeneratedMessageV3 implements ConversationAddParticipantsPushOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int CONVERSATION_REFERENCE_FIELD_NUMBER = 1;
   private ConversationReference conversationReference_;
   public static final int INVOKER_FIELD_NUMBER = 2;
   private UuidAndUsername invoker_;
   public static final int PARTICIPANTS_FIELD_NUMBER = 3;
   private List<ConversationParticipant> participants_;
   private byte memoizedIsInitialized = -1;
   private static final ConversationAddParticipantsPush DEFAULT_INSTANCE = new ConversationAddParticipantsPush();
   private static final Parser<ConversationAddParticipantsPush> PARSER = new AbstractParser<ConversationAddParticipantsPush>() {
      public ConversationAddParticipantsPush parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         ConversationAddParticipantsPush.Builder var3 = ConversationAddParticipantsPush.newBuilder();

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

   private ConversationAddParticipantsPush(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private ConversationAddParticipantsPush() {
      this.participants_ = Collections.emptyList();
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new ConversationAddParticipantsPush();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return PushProto.internal_static_lunarclient_websocket_conversation_v1_ConversationAddParticipantsPush_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return PushProto.internal_static_lunarclient_websocket_conversation_v1_ConversationAddParticipantsPush_fieldAccessorTable
         .ensureFieldAccessorsInitialized(ConversationAddParticipantsPush.class, ConversationAddParticipantsPush.Builder.class);
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
   public List<ConversationParticipant> getParticipantsList() {
      return this.participants_;
   }

   @Override
   public List<? extends ConversationParticipantOrBuilder> getParticipantsOrBuilderList() {
      return this.participants_;
   }

   @Override
   public int getParticipantsCount() {
      return this.participants_.size();
   }

   @Override
   public ConversationParticipant getParticipants(int var1) {
      return this.participants_.get(var1);
   }

   @Override
   public ConversationParticipantOrBuilder getParticipantsOrBuilder(int var1) {
      return this.participants_.get(var1);
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

      for (int var2 = 0; var2 < this.participants_.size(); var2++) {
         var1.writeMessage(3, this.participants_.get(var2));
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

      for (int var2 = 0; var2 < this.participants_.size(); var2++) {
         var1 += CodedOutputStream.computeMessageSize(3, this.participants_.get(var2));
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof ConversationAddParticipantsPush)) {
         return super.equals(var1);
      } else {
         ConversationAddParticipantsPush var2 = (ConversationAddParticipantsPush)var1;
         if (this.hasConversationReference() != var2.hasConversationReference()) {
            return false;
         } else if (this.hasConversationReference() && !this.getConversationReference().equals(var2.getConversationReference())) {
            return false;
         } else if (this.hasInvoker() != var2.hasInvoker()) {
            return false;
         } else if (this.hasInvoker() && !this.getInvoker().equals(var2.getInvoker())) {
            return false;
         } else {
            return !this.getParticipantsList().equals(var2.getParticipantsList()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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

      if (this.getParticipantsCount() > 0) {
         var1 = 37 * var1 + 3;
         var1 = 53 * var1 + this.getParticipantsList().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static ConversationAddParticipantsPush parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static ConversationAddParticipantsPush parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ConversationAddParticipantsPush parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static ConversationAddParticipantsPush parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ConversationAddParticipantsPush parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static ConversationAddParticipantsPush parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ConversationAddParticipantsPush parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ConversationAddParticipantsPush parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ConversationAddParticipantsPush parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ConversationAddParticipantsPush parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ConversationAddParticipantsPush parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ConversationAddParticipantsPush parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public ConversationAddParticipantsPush.Builder newBuilderForType() {
      return newBuilder();
   }

   public static ConversationAddParticipantsPush.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ConversationAddParticipantsPush.Builder newBuilder(ConversationAddParticipantsPush var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public ConversationAddParticipantsPush.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new ConversationAddParticipantsPush.Builder() : new ConversationAddParticipantsPush.Builder().mergeFrom(this);
   }

   protected ConversationAddParticipantsPush.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new ConversationAddParticipantsPush.Builder(var1);
   }

   public static ConversationAddParticipantsPush getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<ConversationAddParticipantsPush> parser() {
      return PARSER;
   }

   @Override
   public Parser<ConversationAddParticipantsPush> getParserForType() {
      return PARSER;
   }

   public ConversationAddParticipantsPush getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder
      extends GeneratedMessageV3.Builder<ConversationAddParticipantsPush.Builder>
      implements ConversationAddParticipantsPushOrBuilder {
      private int bitField0_;
      private ConversationReference conversationReference_;
      private SingleFieldBuilderV3<ConversationReference, ConversationReference.Builder, ConversationReferenceOrBuilder> conversationReferenceBuilder_;
      private UuidAndUsername invoker_;
      private SingleFieldBuilderV3<UuidAndUsername, UuidAndUsername.Builder, UuidAndUsernameOrBuilder> invokerBuilder_;
      private List<ConversationParticipant> participants_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<ConversationParticipant, ConversationParticipant.Builder, ConversationParticipantOrBuilder> participantsBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return PushProto.internal_static_lunarclient_websocket_conversation_v1_ConversationAddParticipantsPush_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PushProto.internal_static_lunarclient_websocket_conversation_v1_ConversationAddParticipantsPush_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ConversationAddParticipantsPush.class, ConversationAddParticipantsPush.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (ConversationAddParticipantsPush.alwaysUseFieldBuilders) {
            this.getConversationReferenceFieldBuilder();
            this.getInvokerFieldBuilder();
            this.getParticipantsFieldBuilder();
         }
      }

      public ConversationAddParticipantsPush.Builder clear() {
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

         if (this.participantsBuilder_ == null) {
            this.participants_ = Collections.emptyList();
         } else {
            this.participants_ = null;
            this.participantsBuilder_.clear();
         }

         this.bitField0_ &= -5;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return PushProto.internal_static_lunarclient_websocket_conversation_v1_ConversationAddParticipantsPush_descriptor;
      }

      public ConversationAddParticipantsPush getDefaultInstanceForType() {
         return ConversationAddParticipantsPush.getDefaultInstance();
      }

      public ConversationAddParticipantsPush build() {
         ConversationAddParticipantsPush var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public ConversationAddParticipantsPush buildPartial() {
         ConversationAddParticipantsPush var1 = new ConversationAddParticipantsPush(this);
         this.buildPartialRepeatedFields(var1);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartialRepeatedFields(ConversationAddParticipantsPush var1) {
         if (this.participantsBuilder_ == null) {
            if ((this.bitField0_ & 4) != 0) {
               this.participants_ = Collections.unmodifiableList(this.participants_);
               this.bitField0_ &= -5;
            }

            var1.participants_ = this.participants_;
         } else {
            var1.participants_ = this.participantsBuilder_.build();
         }
      }

      private void buildPartial0(ConversationAddParticipantsPush var1) {
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

         ConversationAddParticipantsPush var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public ConversationAddParticipantsPush.Builder clone() {
         return (ConversationAddParticipantsPush.Builder)super.clone();
      }

      public ConversationAddParticipantsPush.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ConversationAddParticipantsPush.Builder)super.setField(var1, var2);
      }

      public ConversationAddParticipantsPush.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (ConversationAddParticipantsPush.Builder)super.clearField(var1);
      }

      public ConversationAddParticipantsPush.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (ConversationAddParticipantsPush.Builder)super.clearOneof(var1);
      }

      public ConversationAddParticipantsPush.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (ConversationAddParticipantsPush.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public ConversationAddParticipantsPush.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ConversationAddParticipantsPush.Builder)super.addRepeatedField(var1, var2);
      }

      public ConversationAddParticipantsPush.Builder mergeFrom(Message var1) {
         if (var1 instanceof ConversationAddParticipantsPush) {
            return this.mergeFrom((ConversationAddParticipantsPush)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public ConversationAddParticipantsPush.Builder mergeFrom(ConversationAddParticipantsPush var1) {
         if (var1 == ConversationAddParticipantsPush.getDefaultInstance()) {
            return this;
         }

         if (var1.hasConversationReference()) {
            this.mergeConversationReference(var1.getConversationReference());
         }

         if (var1.hasInvoker()) {
            this.mergeInvoker(var1.getInvoker());
         }

         if (this.participantsBuilder_ == null) {
            if (!var1.participants_.isEmpty()) {
               if (this.participants_.isEmpty()) {
                  this.participants_ = var1.participants_;
                  this.bitField0_ &= -5;
               } else {
                  this.ensureParticipantsIsMutable();
                  this.participants_.addAll(var1.participants_);
               }

               this.onChanged();
            }
         } else if (!var1.participants_.isEmpty()) {
            if (this.participantsBuilder_.isEmpty()) {
               this.participantsBuilder_.dispose();
               this.participantsBuilder_ = null;
               this.participants_ = var1.participants_;
               this.bitField0_ &= -5;
               this.participantsBuilder_ = ConversationAddParticipantsPush.alwaysUseFieldBuilders ? this.getParticipantsFieldBuilder() : null;
            } else {
               this.participantsBuilder_.addAllMessages(var1.participants_);
            }
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public ConversationAddParticipantsPush.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     ConversationParticipant var5 = var1.readMessage(ConversationParticipant.parser(), var2);
                     if (this.participantsBuilder_ == null) {
                        this.ensureParticipantsIsMutable();
                        this.participants_.add(var5);
                     } else {
                        this.participantsBuilder_.addMessage(var5);
                     }
                     break;
                  default:
                     if (!super.parseUnknownField(var1, var2, var4)) {
                        var3 = true;
                     }
               }
            }
         } catch (InvalidProtocolBufferException var9) {
            throw var9.unwrapIOException();
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

      public ConversationAddParticipantsPush.Builder setConversationReference(ConversationReference var1) {
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

      public ConversationAddParticipantsPush.Builder setConversationReference(ConversationReference.Builder var1) {
         if (this.conversationReferenceBuilder_ == null) {
            this.conversationReference_ = var1.build();
         } else {
            this.conversationReferenceBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public ConversationAddParticipantsPush.Builder mergeConversationReference(ConversationReference var1) {
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

      public ConversationAddParticipantsPush.Builder clearConversationReference() {
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

      public ConversationAddParticipantsPush.Builder setInvoker(UuidAndUsername var1) {
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

      public ConversationAddParticipantsPush.Builder setInvoker(UuidAndUsername.Builder var1) {
         if (this.invokerBuilder_ == null) {
            this.invoker_ = var1.build();
         } else {
            this.invokerBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public ConversationAddParticipantsPush.Builder mergeInvoker(UuidAndUsername var1) {
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

      public ConversationAddParticipantsPush.Builder clearInvoker() {
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

      private void ensureParticipantsIsMutable() {
         if ((this.bitField0_ & 4) == 0) {
            this.participants_ = new ArrayList<>(this.participants_);
            this.bitField0_ |= 4;
         }
      }

      @Override
      public List<ConversationParticipant> getParticipantsList() {
         return this.participantsBuilder_ == null ? Collections.unmodifiableList(this.participants_) : this.participantsBuilder_.getMessageList();
      }

      @Override
      public int getParticipantsCount() {
         return this.participantsBuilder_ == null ? this.participants_.size() : this.participantsBuilder_.getCount();
      }

      @Override
      public ConversationParticipant getParticipants(int var1) {
         return this.participantsBuilder_ == null ? this.participants_.get(var1) : this.participantsBuilder_.getMessage(var1);
      }

      public ConversationAddParticipantsPush.Builder setParticipants(int var1, ConversationParticipant var2) {
         if (this.participantsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureParticipantsIsMutable();
            this.participants_.set(var1, var2);
            this.onChanged();
         } else {
            this.participantsBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public ConversationAddParticipantsPush.Builder setParticipants(int var1, ConversationParticipant.Builder var2) {
         if (this.participantsBuilder_ == null) {
            this.ensureParticipantsIsMutable();
            this.participants_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.participantsBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public ConversationAddParticipantsPush.Builder addParticipants(ConversationParticipant var1) {
         if (this.participantsBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureParticipantsIsMutable();
            this.participants_.add(var1);
            this.onChanged();
         } else {
            this.participantsBuilder_.addMessage(var1);
         }

         return this;
      }

      public ConversationAddParticipantsPush.Builder addParticipants(int var1, ConversationParticipant var2) {
         if (this.participantsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureParticipantsIsMutable();
            this.participants_.add(var1, var2);
            this.onChanged();
         } else {
            this.participantsBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public ConversationAddParticipantsPush.Builder addParticipants(ConversationParticipant.Builder var1) {
         if (this.participantsBuilder_ == null) {
            this.ensureParticipantsIsMutable();
            this.participants_.add(var1.build());
            this.onChanged();
         } else {
            this.participantsBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public ConversationAddParticipantsPush.Builder addParticipants(int var1, ConversationParticipant.Builder var2) {
         if (this.participantsBuilder_ == null) {
            this.ensureParticipantsIsMutable();
            this.participants_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.participantsBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public ConversationAddParticipantsPush.Builder addAllParticipants(Iterable<? extends ConversationParticipant> var1) {
         if (this.participantsBuilder_ == null) {
            this.ensureParticipantsIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.participants_);
            this.onChanged();
         } else {
            this.participantsBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public ConversationAddParticipantsPush.Builder clearParticipants() {
         if (this.participantsBuilder_ == null) {
            this.participants_ = Collections.emptyList();
            this.bitField0_ &= -5;
            this.onChanged();
         } else {
            this.participantsBuilder_.clear();
         }

         return this;
      }

      public ConversationAddParticipantsPush.Builder removeParticipants(int var1) {
         if (this.participantsBuilder_ == null) {
            this.ensureParticipantsIsMutable();
            this.participants_.remove(var1);
            this.onChanged();
         } else {
            this.participantsBuilder_.remove(var1);
         }

         return this;
      }

      public ConversationParticipant.Builder getParticipantsBuilder(int var1) {
         return this.getParticipantsFieldBuilder().getBuilder(var1);
      }

      @Override
      public ConversationParticipantOrBuilder getParticipantsOrBuilder(int var1) {
         return this.participantsBuilder_ == null ? this.participants_.get(var1) : this.participantsBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends ConversationParticipantOrBuilder> getParticipantsOrBuilderList() {
         return this.participantsBuilder_ != null ? this.participantsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.participants_);
      }

      public ConversationParticipant.Builder addParticipantsBuilder() {
         return this.getParticipantsFieldBuilder().addBuilder(ConversationParticipant.getDefaultInstance());
      }

      public ConversationParticipant.Builder addParticipantsBuilder(int var1) {
         return this.getParticipantsFieldBuilder().addBuilder(var1, ConversationParticipant.getDefaultInstance());
      }

      public List<ConversationParticipant.Builder> getParticipantsBuilderList() {
         return this.getParticipantsFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<ConversationParticipant, ConversationParticipant.Builder, ConversationParticipantOrBuilder> getParticipantsFieldBuilder() {
         if (this.participantsBuilder_ == null) {
            this.participantsBuilder_ = new RepeatedFieldBuilderV3<>(
               this.participants_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean()
            );
            this.participants_ = null;
         }

         return this.participantsBuilder_;
      }

      public final ConversationAddParticipantsPush.Builder setUnknownFields(UnknownFieldSet var1) {
         return (ConversationAddParticipantsPush.Builder)super.setUnknownFields(var1);
      }

      public final ConversationAddParticipantsPush.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (ConversationAddParticipantsPush.Builder)super.mergeUnknownFields(var1);
      }
   }
}
