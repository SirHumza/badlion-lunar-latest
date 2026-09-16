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

public final class ConversationStub extends GeneratedMessageV3 implements ConversationStubOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int CONVERSATION_REFERENCE_FIELD_NUMBER = 1;
   private ConversationReference conversationReference_;
   public static final int USER_STATE_FIELD_NUMBER = 2;
   private UserConversationState userState_;
   private byte memoizedIsInitialized = -1;
   private static final ConversationStub DEFAULT_INSTANCE = new ConversationStub();
   private static final Parser<ConversationStub> PARSER = new AbstractParser<ConversationStub>() {
      public ConversationStub parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         ConversationStub.Builder var3 = ConversationStub.newBuilder();

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

   private ConversationStub(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private ConversationStub() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new ConversationStub();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_conversation_v1_ConversationStub_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_conversation_v1_ConversationStub_fieldAccessorTable
         .ensureFieldAccessorsInitialized(ConversationStub.class, ConversationStub.Builder.class);
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
   public boolean hasUserState() {
      return (this.bitField0_ & 2) != 0;
   }

   @Override
   public UserConversationState getUserState() {
      return this.userState_ == null ? UserConversationState.getDefaultInstance() : this.userState_;
   }

   @Override
   public UserConversationStateOrBuilder getUserStateOrBuilder() {
      return this.userState_ == null ? UserConversationState.getDefaultInstance() : this.userState_;
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
         var1.writeMessage(2, this.getUserState());
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
         var1 += CodedOutputStream.computeMessageSize(2, this.getUserState());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof ConversationStub)) {
         return super.equals(var1);
      } else {
         ConversationStub var2 = (ConversationStub)var1;
         if (this.hasConversationReference() != var2.hasConversationReference()) {
            return false;
         } else if (this.hasConversationReference() && !this.getConversationReference().equals(var2.getConversationReference())) {
            return false;
         } else if (this.hasUserState() != var2.hasUserState()) {
            return false;
         } else {
            return this.hasUserState() && !this.getUserState().equals(var2.getUserState()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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

      if (this.hasUserState()) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getUserState().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static ConversationStub parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static ConversationStub parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ConversationStub parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static ConversationStub parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ConversationStub parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static ConversationStub parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ConversationStub parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ConversationStub parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ConversationStub parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ConversationStub parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ConversationStub parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ConversationStub parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public ConversationStub.Builder newBuilderForType() {
      return newBuilder();
   }

   public static ConversationStub.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ConversationStub.Builder newBuilder(ConversationStub var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public ConversationStub.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new ConversationStub.Builder() : new ConversationStub.Builder().mergeFrom(this);
   }

   protected ConversationStub.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new ConversationStub.Builder(var1);
   }

   public static ConversationStub getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<ConversationStub> parser() {
      return PARSER;
   }

   @Override
   public Parser<ConversationStub> getParserForType() {
      return PARSER;
   }

   public ConversationStub getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<ConversationStub.Builder> implements ConversationStubOrBuilder {
      private int bitField0_;
      private ConversationReference conversationReference_;
      private SingleFieldBuilderV3<ConversationReference, ConversationReference.Builder, ConversationReferenceOrBuilder> conversationReferenceBuilder_;
      private UserConversationState userState_;
      private SingleFieldBuilderV3<UserConversationState, UserConversationState.Builder, UserConversationStateOrBuilder> userStateBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_conversation_v1_ConversationStub_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_conversation_v1_ConversationStub_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ConversationStub.class, ConversationStub.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (ConversationStub.alwaysUseFieldBuilders) {
            this.getConversationReferenceFieldBuilder();
            this.getUserStateFieldBuilder();
         }
      }

      public ConversationStub.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.conversationReference_ = null;
         if (this.conversationReferenceBuilder_ != null) {
            this.conversationReferenceBuilder_.dispose();
            this.conversationReferenceBuilder_ = null;
         }

         this.userState_ = null;
         if (this.userStateBuilder_ != null) {
            this.userStateBuilder_.dispose();
            this.userStateBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_conversation_v1_ConversationStub_descriptor;
      }

      public ConversationStub getDefaultInstanceForType() {
         return ConversationStub.getDefaultInstance();
      }

      public ConversationStub build() {
         ConversationStub var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public ConversationStub buildPartial() {
         ConversationStub var1 = new ConversationStub(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(ConversationStub var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.conversationReference_ = this.conversationReferenceBuilder_ == null ? this.conversationReference_ : this.conversationReferenceBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.userState_ = this.userStateBuilder_ == null ? this.userState_ : this.userStateBuilder_.build();
            var3 |= 2;
         }

         ConversationStub var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public ConversationStub.Builder clone() {
         return (ConversationStub.Builder)super.clone();
      }

      public ConversationStub.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ConversationStub.Builder)super.setField(var1, var2);
      }

      public ConversationStub.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (ConversationStub.Builder)super.clearField(var1);
      }

      public ConversationStub.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (ConversationStub.Builder)super.clearOneof(var1);
      }

      public ConversationStub.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (ConversationStub.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public ConversationStub.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ConversationStub.Builder)super.addRepeatedField(var1, var2);
      }

      public ConversationStub.Builder mergeFrom(Message var1) {
         if (var1 instanceof ConversationStub) {
            return this.mergeFrom((ConversationStub)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public ConversationStub.Builder mergeFrom(ConversationStub var1) {
         if (var1 == ConversationStub.getDefaultInstance()) {
            return this;
         }

         if (var1.hasConversationReference()) {
            this.mergeConversationReference(var1.getConversationReference());
         }

         if (var1.hasUserState()) {
            this.mergeUserState(var1.getUserState());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public ConversationStub.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getUserStateFieldBuilder().getBuilder(), var2);
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

      public ConversationStub.Builder setConversationReference(ConversationReference var1) {
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

      public ConversationStub.Builder setConversationReference(ConversationReference.Builder var1) {
         if (this.conversationReferenceBuilder_ == null) {
            this.conversationReference_ = var1.build();
         } else {
            this.conversationReferenceBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public ConversationStub.Builder mergeConversationReference(ConversationReference var1) {
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

      public ConversationStub.Builder clearConversationReference() {
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
      public boolean hasUserState() {
         return (this.bitField0_ & 2) != 0;
      }

      @Override
      public UserConversationState getUserState() {
         if (this.userStateBuilder_ == null) {
            return this.userState_ == null ? UserConversationState.getDefaultInstance() : this.userState_;
         } else {
            return this.userStateBuilder_.getMessage();
         }
      }

      public ConversationStub.Builder setUserState(UserConversationState var1) {
         if (this.userStateBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.userState_ = var1;
         } else {
            this.userStateBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public ConversationStub.Builder setUserState(UserConversationState.Builder var1) {
         if (this.userStateBuilder_ == null) {
            this.userState_ = var1.build();
         } else {
            this.userStateBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public ConversationStub.Builder mergeUserState(UserConversationState var1) {
         if (this.userStateBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0 && this.userState_ != null && this.userState_ != UserConversationState.getDefaultInstance()) {
               this.getUserStateBuilder().mergeFrom(var1);
            } else {
               this.userState_ = var1;
            }
         } else {
            this.userStateBuilder_.mergeFrom(var1);
         }

         if (this.userState_ != null) {
            this.bitField0_ |= 2;
            this.onChanged();
         }

         return this;
      }

      public ConversationStub.Builder clearUserState() {
         this.bitField0_ &= -3;
         this.userState_ = null;
         if (this.userStateBuilder_ != null) {
            this.userStateBuilder_.dispose();
            this.userStateBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public UserConversationState.Builder getUserStateBuilder() {
         this.bitField0_ |= 2;
         this.onChanged();
         return this.getUserStateFieldBuilder().getBuilder();
      }

      @Override
      public UserConversationStateOrBuilder getUserStateOrBuilder() {
         if (this.userStateBuilder_ != null) {
            return this.userStateBuilder_.getMessageOrBuilder();
         } else {
            return this.userState_ == null ? UserConversationState.getDefaultInstance() : this.userState_;
         }
      }

      private SingleFieldBuilderV3<UserConversationState, UserConversationState.Builder, UserConversationStateOrBuilder> getUserStateFieldBuilder() {
         if (this.userStateBuilder_ == null) {
            this.userStateBuilder_ = new SingleFieldBuilderV3<>(this.getUserState(), this.getParentForChildren(), this.isClean());
            this.userState_ = null;
         }

         return this.userStateBuilder_;
      }

      public final ConversationStub.Builder setUnknownFields(UnknownFieldSet var1) {
         return (ConversationStub.Builder)super.setUnknownFields(var1);
      }

      public final ConversationStub.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (ConversationStub.Builder)super.mergeUnknownFields(var1);
      }
   }
}
