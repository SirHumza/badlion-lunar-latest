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

public final class ConversationUpdateInvitePolicyPush extends GeneratedMessageV3 implements ConversationUpdateInvitePolicyPushOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int CONVERSATION_REFERENCE_FIELD_NUMBER = 1;
   private ConversationReference conversationReference_;
   public static final int POLICY_FIELD_NUMBER = 2;
   private int policy_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final ConversationUpdateInvitePolicyPush DEFAULT_INSTANCE = new ConversationUpdateInvitePolicyPush();
   private static final Parser<ConversationUpdateInvitePolicyPush> PARSER = new AbstractParser<ConversationUpdateInvitePolicyPush>() {
      public ConversationUpdateInvitePolicyPush parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         ConversationUpdateInvitePolicyPush.Builder var3 = ConversationUpdateInvitePolicyPush.newBuilder();

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

   private ConversationUpdateInvitePolicyPush(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private ConversationUpdateInvitePolicyPush() {
      this.policy_ = 0;
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new ConversationUpdateInvitePolicyPush();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return PushProto.internal_static_lunarclient_websocket_conversation_v1_ConversationUpdateInvitePolicyPush_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return PushProto.internal_static_lunarclient_websocket_conversation_v1_ConversationUpdateInvitePolicyPush_fieldAccessorTable
         .ensureFieldAccessorsInitialized(ConversationUpdateInvitePolicyPush.class, ConversationUpdateInvitePolicyPush.Builder.class);
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
   public int getPolicyValue() {
      return this.policy_;
   }

   @Override
   public InvitePolicy getPolicy() {
      InvitePolicy var1 = InvitePolicy.forNumber(this.policy_);
      return var1 == null ? InvitePolicy.UNRECOGNIZED : var1;
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

      if (this.policy_ != InvitePolicy.INVITE_POLICY_UNSPECIFIED.getNumber()) {
         var1.writeEnum(2, this.policy_);
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

      if (this.policy_ != InvitePolicy.INVITE_POLICY_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(2, this.policy_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof ConversationUpdateInvitePolicyPush)) {
         return super.equals(var1);
      } else {
         ConversationUpdateInvitePolicyPush var2 = (ConversationUpdateInvitePolicyPush)var1;
         if (this.hasConversationReference() != var2.hasConversationReference()) {
            return false;
         } else if (this.hasConversationReference() && !this.getConversationReference().equals(var2.getConversationReference())) {
            return false;
         } else {
            return this.policy_ != var2.policy_ ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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

      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.policy_;
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static ConversationUpdateInvitePolicyPush parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static ConversationUpdateInvitePolicyPush parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ConversationUpdateInvitePolicyPush parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static ConversationUpdateInvitePolicyPush parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ConversationUpdateInvitePolicyPush parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static ConversationUpdateInvitePolicyPush parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ConversationUpdateInvitePolicyPush parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ConversationUpdateInvitePolicyPush parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ConversationUpdateInvitePolicyPush parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ConversationUpdateInvitePolicyPush parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ConversationUpdateInvitePolicyPush parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ConversationUpdateInvitePolicyPush parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public ConversationUpdateInvitePolicyPush.Builder newBuilderForType() {
      return newBuilder();
   }

   public static ConversationUpdateInvitePolicyPush.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ConversationUpdateInvitePolicyPush.Builder newBuilder(ConversationUpdateInvitePolicyPush var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public ConversationUpdateInvitePolicyPush.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new ConversationUpdateInvitePolicyPush.Builder() : new ConversationUpdateInvitePolicyPush.Builder().mergeFrom(this);
   }

   protected ConversationUpdateInvitePolicyPush.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new ConversationUpdateInvitePolicyPush.Builder(var1);
   }

   public static ConversationUpdateInvitePolicyPush getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<ConversationUpdateInvitePolicyPush> parser() {
      return PARSER;
   }

   @Override
   public Parser<ConversationUpdateInvitePolicyPush> getParserForType() {
      return PARSER;
   }

   public ConversationUpdateInvitePolicyPush getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder
      extends GeneratedMessageV3.Builder<ConversationUpdateInvitePolicyPush.Builder>
      implements ConversationUpdateInvitePolicyPushOrBuilder {
      private int bitField0_;
      private ConversationReference conversationReference_;
      private SingleFieldBuilderV3<ConversationReference, ConversationReference.Builder, ConversationReferenceOrBuilder> conversationReferenceBuilder_;
      private int policy_ = 0;

      public static final Descriptors.Descriptor getDescriptor() {
         return PushProto.internal_static_lunarclient_websocket_conversation_v1_ConversationUpdateInvitePolicyPush_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PushProto.internal_static_lunarclient_websocket_conversation_v1_ConversationUpdateInvitePolicyPush_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ConversationUpdateInvitePolicyPush.class, ConversationUpdateInvitePolicyPush.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (ConversationUpdateInvitePolicyPush.alwaysUseFieldBuilders) {
            this.getConversationReferenceFieldBuilder();
         }
      }

      public ConversationUpdateInvitePolicyPush.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.conversationReference_ = null;
         if (this.conversationReferenceBuilder_ != null) {
            this.conversationReferenceBuilder_.dispose();
            this.conversationReferenceBuilder_ = null;
         }

         this.policy_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return PushProto.internal_static_lunarclient_websocket_conversation_v1_ConversationUpdateInvitePolicyPush_descriptor;
      }

      public ConversationUpdateInvitePolicyPush getDefaultInstanceForType() {
         return ConversationUpdateInvitePolicyPush.getDefaultInstance();
      }

      public ConversationUpdateInvitePolicyPush build() {
         ConversationUpdateInvitePolicyPush var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public ConversationUpdateInvitePolicyPush buildPartial() {
         ConversationUpdateInvitePolicyPush var1 = new ConversationUpdateInvitePolicyPush(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(ConversationUpdateInvitePolicyPush var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.conversationReference_ = this.conversationReferenceBuilder_ == null ? this.conversationReference_ : this.conversationReferenceBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.policy_ = this.policy_;
         }

         ConversationUpdateInvitePolicyPush var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public ConversationUpdateInvitePolicyPush.Builder clone() {
         return (ConversationUpdateInvitePolicyPush.Builder)super.clone();
      }

      public ConversationUpdateInvitePolicyPush.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ConversationUpdateInvitePolicyPush.Builder)super.setField(var1, var2);
      }

      public ConversationUpdateInvitePolicyPush.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (ConversationUpdateInvitePolicyPush.Builder)super.clearField(var1);
      }

      public ConversationUpdateInvitePolicyPush.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (ConversationUpdateInvitePolicyPush.Builder)super.clearOneof(var1);
      }

      public ConversationUpdateInvitePolicyPush.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (ConversationUpdateInvitePolicyPush.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public ConversationUpdateInvitePolicyPush.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ConversationUpdateInvitePolicyPush.Builder)super.addRepeatedField(var1, var2);
      }

      public ConversationUpdateInvitePolicyPush.Builder mergeFrom(Message var1) {
         if (var1 instanceof ConversationUpdateInvitePolicyPush) {
            return this.mergeFrom((ConversationUpdateInvitePolicyPush)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public ConversationUpdateInvitePolicyPush.Builder mergeFrom(ConversationUpdateInvitePolicyPush var1) {
         if (var1 == ConversationUpdateInvitePolicyPush.getDefaultInstance()) {
            return this;
         }

         if (var1.hasConversationReference()) {
            this.mergeConversationReference(var1.getConversationReference());
         }

         if (var1.policy_ != 0) {
            this.setPolicyValue(var1.getPolicyValue());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public ConversationUpdateInvitePolicyPush.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                  case 16:
                     this.policy_ = var1.readEnum();
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

      public ConversationUpdateInvitePolicyPush.Builder setConversationReference(ConversationReference var1) {
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

      public ConversationUpdateInvitePolicyPush.Builder setConversationReference(ConversationReference.Builder var1) {
         if (this.conversationReferenceBuilder_ == null) {
            this.conversationReference_ = var1.build();
         } else {
            this.conversationReferenceBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public ConversationUpdateInvitePolicyPush.Builder mergeConversationReference(ConversationReference var1) {
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

      public ConversationUpdateInvitePolicyPush.Builder clearConversationReference() {
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
      public int getPolicyValue() {
         return this.policy_;
      }

      public ConversationUpdateInvitePolicyPush.Builder setPolicyValue(int var1) {
         this.policy_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      @Override
      public InvitePolicy getPolicy() {
         InvitePolicy var1 = InvitePolicy.forNumber(this.policy_);
         return var1 == null ? InvitePolicy.UNRECOGNIZED : var1;
      }

      public ConversationUpdateInvitePolicyPush.Builder setPolicy(InvitePolicy var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 2;
         this.policy_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public ConversationUpdateInvitePolicyPush.Builder clearPolicy() {
         this.bitField0_ &= -3;
         this.policy_ = 0;
         this.onChanged();
         return this;
      }

      public final ConversationUpdateInvitePolicyPush.Builder setUnknownFields(UnknownFieldSet var1) {
         return (ConversationUpdateInvitePolicyPush.Builder)super.setUnknownFields(var1);
      }

      public final ConversationUpdateInvitePolicyPush.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (ConversationUpdateInvitePolicyPush.Builder)super.mergeUnknownFields(var1);
      }
   }
}
