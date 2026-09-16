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

public final class AddConversationParticipantsRequest extends GeneratedMessageV3 implements AddConversationParticipantsRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int CONVERSATION_REFERENCE_FIELD_NUMBER = 1;
   private ConversationReference conversationReference_;
   public static final int TARGETS_FIELD_NUMBER = 2;
   private List<UuidAndUsername> targets_;
   private byte memoizedIsInitialized = -1;
   private static final AddConversationParticipantsRequest DEFAULT_INSTANCE = new AddConversationParticipantsRequest();
   private static final Parser<AddConversationParticipantsRequest> PARSER = new AbstractParser<AddConversationParticipantsRequest>() {
      public AddConversationParticipantsRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         AddConversationParticipantsRequest.Builder var3 = AddConversationParticipantsRequest.newBuilder();

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

   private AddConversationParticipantsRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private AddConversationParticipantsRequest() {
      this.targets_ = Collections.emptyList();
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new AddConversationParticipantsRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_AddConversationParticipantsRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_AddConversationParticipantsRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(AddConversationParticipantsRequest.class, AddConversationParticipantsRequest.Builder.class);
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
   public List<UuidAndUsername> getTargetsList() {
      return this.targets_;
   }

   @Override
   public List<? extends UuidAndUsernameOrBuilder> getTargetsOrBuilderList() {
      return this.targets_;
   }

   @Override
   public int getTargetsCount() {
      return this.targets_.size();
   }

   @Override
   public UuidAndUsername getTargets(int var1) {
      return this.targets_.get(var1);
   }

   @Override
   public UuidAndUsernameOrBuilder getTargetsOrBuilder(int var1) {
      return this.targets_.get(var1);
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

      for (int var2 = 0; var2 < this.targets_.size(); var2++) {
         var1.writeMessage(2, this.targets_.get(var2));
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

      for (int var2 = 0; var2 < this.targets_.size(); var2++) {
         var1 += CodedOutputStream.computeMessageSize(2, this.targets_.get(var2));
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof AddConversationParticipantsRequest)) {
         return super.equals(var1);
      } else {
         AddConversationParticipantsRequest var2 = (AddConversationParticipantsRequest)var1;
         if (this.hasConversationReference() != var2.hasConversationReference()) {
            return false;
         } else if (this.hasConversationReference() && !this.getConversationReference().equals(var2.getConversationReference())) {
            return false;
         } else {
            return !this.getTargetsList().equals(var2.getTargetsList()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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

      if (this.getTargetsCount() > 0) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getTargetsList().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static AddConversationParticipantsRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static AddConversationParticipantsRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static AddConversationParticipantsRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static AddConversationParticipantsRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static AddConversationParticipantsRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static AddConversationParticipantsRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static AddConversationParticipantsRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static AddConversationParticipantsRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static AddConversationParticipantsRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static AddConversationParticipantsRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static AddConversationParticipantsRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static AddConversationParticipantsRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public AddConversationParticipantsRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static AddConversationParticipantsRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static AddConversationParticipantsRequest.Builder newBuilder(AddConversationParticipantsRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public AddConversationParticipantsRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new AddConversationParticipantsRequest.Builder() : new AddConversationParticipantsRequest.Builder().mergeFrom(this);
   }

   protected AddConversationParticipantsRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new AddConversationParticipantsRequest.Builder(var1);
   }

   public static AddConversationParticipantsRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<AddConversationParticipantsRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<AddConversationParticipantsRequest> getParserForType() {
      return PARSER;
   }

   public AddConversationParticipantsRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder
      extends GeneratedMessageV3.Builder<AddConversationParticipantsRequest.Builder>
      implements AddConversationParticipantsRequestOrBuilder {
      private int bitField0_;
      private ConversationReference conversationReference_;
      private SingleFieldBuilderV3<ConversationReference, ConversationReference.Builder, ConversationReferenceOrBuilder> conversationReferenceBuilder_;
      private List<UuidAndUsername> targets_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<UuidAndUsername, UuidAndUsername.Builder, UuidAndUsernameOrBuilder> targetsBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_AddConversationParticipantsRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_AddConversationParticipantsRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(AddConversationParticipantsRequest.class, AddConversationParticipantsRequest.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (AddConversationParticipantsRequest.alwaysUseFieldBuilders) {
            this.getConversationReferenceFieldBuilder();
            this.getTargetsFieldBuilder();
         }
      }

      public AddConversationParticipantsRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.conversationReference_ = null;
         if (this.conversationReferenceBuilder_ != null) {
            this.conversationReferenceBuilder_.dispose();
            this.conversationReferenceBuilder_ = null;
         }

         if (this.targetsBuilder_ == null) {
            this.targets_ = Collections.emptyList();
         } else {
            this.targets_ = null;
            this.targetsBuilder_.clear();
         }

         this.bitField0_ &= -3;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_AddConversationParticipantsRequest_descriptor;
      }

      public AddConversationParticipantsRequest getDefaultInstanceForType() {
         return AddConversationParticipantsRequest.getDefaultInstance();
      }

      public AddConversationParticipantsRequest build() {
         AddConversationParticipantsRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public AddConversationParticipantsRequest buildPartial() {
         AddConversationParticipantsRequest var1 = new AddConversationParticipantsRequest(this);
         this.buildPartialRepeatedFields(var1);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartialRepeatedFields(AddConversationParticipantsRequest var1) {
         if (this.targetsBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0) {
               this.targets_ = Collections.unmodifiableList(this.targets_);
               this.bitField0_ &= -3;
            }

            var1.targets_ = this.targets_;
         } else {
            var1.targets_ = this.targetsBuilder_.build();
         }
      }

      private void buildPartial0(AddConversationParticipantsRequest var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.conversationReference_ = this.conversationReferenceBuilder_ == null ? this.conversationReference_ : this.conversationReferenceBuilder_.build();
            var3 |= 1;
         }

         AddConversationParticipantsRequest var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public AddConversationParticipantsRequest.Builder clone() {
         return (AddConversationParticipantsRequest.Builder)super.clone();
      }

      public AddConversationParticipantsRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (AddConversationParticipantsRequest.Builder)super.setField(var1, var2);
      }

      public AddConversationParticipantsRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (AddConversationParticipantsRequest.Builder)super.clearField(var1);
      }

      public AddConversationParticipantsRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (AddConversationParticipantsRequest.Builder)super.clearOneof(var1);
      }

      public AddConversationParticipantsRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (AddConversationParticipantsRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public AddConversationParticipantsRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (AddConversationParticipantsRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public AddConversationParticipantsRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof AddConversationParticipantsRequest) {
            return this.mergeFrom((AddConversationParticipantsRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public AddConversationParticipantsRequest.Builder mergeFrom(AddConversationParticipantsRequest var1) {
         if (var1 == AddConversationParticipantsRequest.getDefaultInstance()) {
            return this;
         }

         if (var1.hasConversationReference()) {
            this.mergeConversationReference(var1.getConversationReference());
         }

         if (this.targetsBuilder_ == null) {
            if (!var1.targets_.isEmpty()) {
               if (this.targets_.isEmpty()) {
                  this.targets_ = var1.targets_;
                  this.bitField0_ &= -3;
               } else {
                  this.ensureTargetsIsMutable();
                  this.targets_.addAll(var1.targets_);
               }

               this.onChanged();
            }
         } else if (!var1.targets_.isEmpty()) {
            if (this.targetsBuilder_.isEmpty()) {
               this.targetsBuilder_.dispose();
               this.targetsBuilder_ = null;
               this.targets_ = var1.targets_;
               this.bitField0_ &= -3;
               this.targetsBuilder_ = AddConversationParticipantsRequest.alwaysUseFieldBuilders ? this.getTargetsFieldBuilder() : null;
            } else {
               this.targetsBuilder_.addAllMessages(var1.targets_);
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

      public AddConversationParticipantsRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     UuidAndUsername var5 = var1.readMessage(UuidAndUsername.parser(), var2);
                     if (this.targetsBuilder_ == null) {
                        this.ensureTargetsIsMutable();
                        this.targets_.add(var5);
                     } else {
                        this.targetsBuilder_.addMessage(var5);
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

      public AddConversationParticipantsRequest.Builder setConversationReference(ConversationReference var1) {
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

      public AddConversationParticipantsRequest.Builder setConversationReference(ConversationReference.Builder var1) {
         if (this.conversationReferenceBuilder_ == null) {
            this.conversationReference_ = var1.build();
         } else {
            this.conversationReferenceBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public AddConversationParticipantsRequest.Builder mergeConversationReference(ConversationReference var1) {
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

      public AddConversationParticipantsRequest.Builder clearConversationReference() {
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

      private void ensureTargetsIsMutable() {
         if ((this.bitField0_ & 2) == 0) {
            this.targets_ = new ArrayList<>(this.targets_);
            this.bitField0_ |= 2;
         }
      }

      @Override
      public List<UuidAndUsername> getTargetsList() {
         return this.targetsBuilder_ == null ? Collections.unmodifiableList(this.targets_) : this.targetsBuilder_.getMessageList();
      }

      @Override
      public int getTargetsCount() {
         return this.targetsBuilder_ == null ? this.targets_.size() : this.targetsBuilder_.getCount();
      }

      @Override
      public UuidAndUsername getTargets(int var1) {
         return this.targetsBuilder_ == null ? this.targets_.get(var1) : this.targetsBuilder_.getMessage(var1);
      }

      public AddConversationParticipantsRequest.Builder setTargets(int var1, UuidAndUsername var2) {
         if (this.targetsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureTargetsIsMutable();
            this.targets_.set(var1, var2);
            this.onChanged();
         } else {
            this.targetsBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public AddConversationParticipantsRequest.Builder setTargets(int var1, UuidAndUsername.Builder var2) {
         if (this.targetsBuilder_ == null) {
            this.ensureTargetsIsMutable();
            this.targets_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.targetsBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public AddConversationParticipantsRequest.Builder addTargets(UuidAndUsername var1) {
         if (this.targetsBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureTargetsIsMutable();
            this.targets_.add(var1);
            this.onChanged();
         } else {
            this.targetsBuilder_.addMessage(var1);
         }

         return this;
      }

      public AddConversationParticipantsRequest.Builder addTargets(int var1, UuidAndUsername var2) {
         if (this.targetsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureTargetsIsMutable();
            this.targets_.add(var1, var2);
            this.onChanged();
         } else {
            this.targetsBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public AddConversationParticipantsRequest.Builder addTargets(UuidAndUsername.Builder var1) {
         if (this.targetsBuilder_ == null) {
            this.ensureTargetsIsMutable();
            this.targets_.add(var1.build());
            this.onChanged();
         } else {
            this.targetsBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public AddConversationParticipantsRequest.Builder addTargets(int var1, UuidAndUsername.Builder var2) {
         if (this.targetsBuilder_ == null) {
            this.ensureTargetsIsMutable();
            this.targets_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.targetsBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public AddConversationParticipantsRequest.Builder addAllTargets(Iterable<? extends UuidAndUsername> var1) {
         if (this.targetsBuilder_ == null) {
            this.ensureTargetsIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.targets_);
            this.onChanged();
         } else {
            this.targetsBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public AddConversationParticipantsRequest.Builder clearTargets() {
         if (this.targetsBuilder_ == null) {
            this.targets_ = Collections.emptyList();
            this.bitField0_ &= -3;
            this.onChanged();
         } else {
            this.targetsBuilder_.clear();
         }

         return this;
      }

      public AddConversationParticipantsRequest.Builder removeTargets(int var1) {
         if (this.targetsBuilder_ == null) {
            this.ensureTargetsIsMutable();
            this.targets_.remove(var1);
            this.onChanged();
         } else {
            this.targetsBuilder_.remove(var1);
         }

         return this;
      }

      public UuidAndUsername.Builder getTargetsBuilder(int var1) {
         return this.getTargetsFieldBuilder().getBuilder(var1);
      }

      @Override
      public UuidAndUsernameOrBuilder getTargetsOrBuilder(int var1) {
         return this.targetsBuilder_ == null ? this.targets_.get(var1) : this.targetsBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends UuidAndUsernameOrBuilder> getTargetsOrBuilderList() {
         return this.targetsBuilder_ != null ? this.targetsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.targets_);
      }

      public UuidAndUsername.Builder addTargetsBuilder() {
         return this.getTargetsFieldBuilder().addBuilder(UuidAndUsername.getDefaultInstance());
      }

      public UuidAndUsername.Builder addTargetsBuilder(int var1) {
         return this.getTargetsFieldBuilder().addBuilder(var1, UuidAndUsername.getDefaultInstance());
      }

      public List<UuidAndUsername.Builder> getTargetsBuilderList() {
         return this.getTargetsFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<UuidAndUsername, UuidAndUsername.Builder, UuidAndUsernameOrBuilder> getTargetsFieldBuilder() {
         if (this.targetsBuilder_ == null) {
            this.targetsBuilder_ = new RepeatedFieldBuilderV3<>(this.targets_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
            this.targets_ = null;
         }

         return this.targetsBuilder_;
      }

      public final AddConversationParticipantsRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (AddConversationParticipantsRequest.Builder)super.setUnknownFields(var1);
      }

      public final AddConversationParticipantsRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (AddConversationParticipantsRequest.Builder)super.mergeUnknownFields(var1);
      }
   }
}
