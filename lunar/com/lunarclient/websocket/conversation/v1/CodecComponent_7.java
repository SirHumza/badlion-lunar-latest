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

public final class ConversationUpdateNamePolicyPush extends GeneratedMessageV3 implements ConversationUpdateNamePolicyPushOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int CONVERSATION_REFERENCE_FIELD_NUMBER = 1;
   private ConversationReference conversationReference_;
   public static final int POLICY_FIELD_NUMBER = 2;
   private int policy_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final ConversationUpdateNamePolicyPush DEFAULT_INSTANCE = new ConversationUpdateNamePolicyPush();
   private static final Parser<ConversationUpdateNamePolicyPush> PARSER = new AbstractParser<ConversationUpdateNamePolicyPush>() {
      public ConversationUpdateNamePolicyPush parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         ConversationUpdateNamePolicyPush.Builder var3 = ConversationUpdateNamePolicyPush.newBuilder();

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

   private ConversationUpdateNamePolicyPush(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private ConversationUpdateNamePolicyPush() {
      this.policy_ = 0;
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new ConversationUpdateNamePolicyPush();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return PushProto.internal_static_lunarclient_websocket_conversation_v1_ConversationUpdateNamePolicyPush_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return PushProto.internal_static_lunarclient_websocket_conversation_v1_ConversationUpdateNamePolicyPush_fieldAccessorTable
         .ensureFieldAccessorsInitialized(ConversationUpdateNamePolicyPush.class, ConversationUpdateNamePolicyPush.Builder.class);
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
   public NamePolicy getPolicy() {
      NamePolicy var1 = NamePolicy.forNumber(this.policy_);
      return var1 == null ? NamePolicy.UNRECOGNIZED : var1;
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

      if (this.policy_ != NamePolicy.NAME_POLICY_UNSPECIFIED.getNumber()) {
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

      if (this.policy_ != NamePolicy.NAME_POLICY_UNSPECIFIED.getNumber()) {
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
      } else if (!(var1 instanceof ConversationUpdateNamePolicyPush)) {
         return super.equals(var1);
      } else {
         ConversationUpdateNamePolicyPush var2 = (ConversationUpdateNamePolicyPush)var1;
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

   public static ConversationUpdateNamePolicyPush parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static ConversationUpdateNamePolicyPush parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ConversationUpdateNamePolicyPush parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static ConversationUpdateNamePolicyPush parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ConversationUpdateNamePolicyPush parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static ConversationUpdateNamePolicyPush parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ConversationUpdateNamePolicyPush parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ConversationUpdateNamePolicyPush parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ConversationUpdateNamePolicyPush parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ConversationUpdateNamePolicyPush parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ConversationUpdateNamePolicyPush parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ConversationUpdateNamePolicyPush parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public ConversationUpdateNamePolicyPush.Builder newBuilderForType() {
      return newBuilder();
   }

   public static ConversationUpdateNamePolicyPush.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ConversationUpdateNamePolicyPush.Builder newBuilder(ConversationUpdateNamePolicyPush var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public ConversationUpdateNamePolicyPush.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new ConversationUpdateNamePolicyPush.Builder() : new ConversationUpdateNamePolicyPush.Builder().mergeFrom(this);
   }

   protected ConversationUpdateNamePolicyPush.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new ConversationUpdateNamePolicyPush.Builder(var1);
   }

   public static ConversationUpdateNamePolicyPush getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<ConversationUpdateNamePolicyPush> parser() {
      return PARSER;
   }

   @Override
   public Parser<ConversationUpdateNamePolicyPush> getParserForType() {
      return PARSER;
   }

   public ConversationUpdateNamePolicyPush getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder
      extends GeneratedMessageV3.Builder<ConversationUpdateNamePolicyPush.Builder>
      implements ConversationUpdateNamePolicyPushOrBuilder {
      private int bitField0_;
      private ConversationReference conversationReference_;
      private SingleFieldBuilderV3<ConversationReference, ConversationReference.Builder, ConversationReferenceOrBuilder> conversationReferenceBuilder_;
      private int policy_ = 0;

      public static final Descriptors.Descriptor getDescriptor() {
         return PushProto.internal_static_lunarclient_websocket_conversation_v1_ConversationUpdateNamePolicyPush_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PushProto.internal_static_lunarclient_websocket_conversation_v1_ConversationUpdateNamePolicyPush_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ConversationUpdateNamePolicyPush.class, ConversationUpdateNamePolicyPush.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (ConversationUpdateNamePolicyPush.alwaysUseFieldBuilders) {
            this.getConversationReferenceFieldBuilder();
         }
      }

      public ConversationUpdateNamePolicyPush.Builder clear() {
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
         return PushProto.internal_static_lunarclient_websocket_conversation_v1_ConversationUpdateNamePolicyPush_descriptor;
      }

      public ConversationUpdateNamePolicyPush getDefaultInstanceForType() {
         return ConversationUpdateNamePolicyPush.getDefaultInstance();
      }

      public ConversationUpdateNamePolicyPush build() {
         ConversationUpdateNamePolicyPush var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public ConversationUpdateNamePolicyPush buildPartial() {
         ConversationUpdateNamePolicyPush var1 = new ConversationUpdateNamePolicyPush(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(ConversationUpdateNamePolicyPush var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.conversationReference_ = this.conversationReferenceBuilder_ == null ? this.conversationReference_ : this.conversationReferenceBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.policy_ = this.policy_;
         }

         ConversationUpdateNamePolicyPush var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public ConversationUpdateNamePolicyPush.Builder clone() {
         return (ConversationUpdateNamePolicyPush.Builder)super.clone();
      }

      public ConversationUpdateNamePolicyPush.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ConversationUpdateNamePolicyPush.Builder)super.setField(var1, var2);
      }

      public ConversationUpdateNamePolicyPush.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (ConversationUpdateNamePolicyPush.Builder)super.clearField(var1);
      }

      public ConversationUpdateNamePolicyPush.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (ConversationUpdateNamePolicyPush.Builder)super.clearOneof(var1);
      }

      public ConversationUpdateNamePolicyPush.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (ConversationUpdateNamePolicyPush.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public ConversationUpdateNamePolicyPush.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ConversationUpdateNamePolicyPush.Builder)super.addRepeatedField(var1, var2);
      }

      public ConversationUpdateNamePolicyPush.Builder mergeFrom(Message var1) {
         if (var1 instanceof ConversationUpdateNamePolicyPush) {
            return this.mergeFrom((ConversationUpdateNamePolicyPush)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public ConversationUpdateNamePolicyPush.Builder mergeFrom(ConversationUpdateNamePolicyPush var1) {
         if (var1 == ConversationUpdateNamePolicyPush.getDefaultInstance()) {
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

      public ConversationUpdateNamePolicyPush.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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

      public ConversationUpdateNamePolicyPush.Builder setConversationReference(ConversationReference var1) {
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

      public ConversationUpdateNamePolicyPush.Builder setConversationReference(ConversationReference.Builder var1) {
         if (this.conversationReferenceBuilder_ == null) {
            this.conversationReference_ = var1.build();
         } else {
            this.conversationReferenceBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public ConversationUpdateNamePolicyPush.Builder mergeConversationReference(ConversationReference var1) {
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

      public ConversationUpdateNamePolicyPush.Builder clearConversationReference() {
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

      public ConversationUpdateNamePolicyPush.Builder setPolicyValue(int var1) {
         this.policy_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      @Override
      public NamePolicy getPolicy() {
         NamePolicy var1 = NamePolicy.forNumber(this.policy_);
         return var1 == null ? NamePolicy.UNRECOGNIZED : var1;
      }

      public ConversationUpdateNamePolicyPush.Builder setPolicy(NamePolicy var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 2;
         this.policy_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public ConversationUpdateNamePolicyPush.Builder clearPolicy() {
         this.bitField0_ &= -3;
         this.policy_ = 0;
         this.onChanged();
         return this;
      }

      public final ConversationUpdateNamePolicyPush.Builder setUnknownFields(UnknownFieldSet var1) {
         return (ConversationUpdateNamePolicyPush.Builder)super.setUnknownFields(var1);
      }

      public final ConversationUpdateNamePolicyPush.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (ConversationUpdateNamePolicyPush.Builder)super.mergeUnknownFields(var1);
      }
   }
}
