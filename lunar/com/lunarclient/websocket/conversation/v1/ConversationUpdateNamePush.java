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

public final class ConversationUpdateNamePush extends GeneratedMessageV3 implements ConversationUpdateNamePushOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int CONVERSATION_REFERENCE_FIELD_NUMBER = 1;
   private ConversationReference conversationReference_;
   public static final int INVOKER_FIELD_NUMBER = 2;
   private UuidAndUsername invoker_;
   public static final int NAME_FIELD_NUMBER = 3;
   private volatile Object name_ = "";
   private byte memoizedIsInitialized = -1;
   private static final ConversationUpdateNamePush DEFAULT_INSTANCE = new ConversationUpdateNamePush();
   private static final Parser<ConversationUpdateNamePush> PARSER = new AbstractParser<ConversationUpdateNamePush>() {
      public ConversationUpdateNamePush parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         ConversationUpdateNamePush.Builder var3 = ConversationUpdateNamePush.newBuilder();

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

   private ConversationUpdateNamePush(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private ConversationUpdateNamePush() {
      this.name_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new ConversationUpdateNamePush();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return PushProto.internal_static_lunarclient_websocket_conversation_v1_ConversationUpdateNamePush_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return PushProto.internal_static_lunarclient_websocket_conversation_v1_ConversationUpdateNamePush_fieldAccessorTable
         .ensureFieldAccessorsInitialized(ConversationUpdateNamePush.class, ConversationUpdateNamePush.Builder.class);
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
   public String getName() {
      Object var1 = this.name_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.name_ = var3;
      return var3;
   }

   @Override
   public ByteString getNameBytes() {
      Object var1 = this.name_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.name_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
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

      if (!GeneratedMessageV3.isStringEmpty(this.name_)) {
         GeneratedMessageV3.writeString(var1, 3, this.name_);
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

      if (!GeneratedMessageV3.isStringEmpty(this.name_)) {
         var1 += GeneratedMessageV3.computeStringSize(3, this.name_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof ConversationUpdateNamePush)) {
         return super.equals(var1);
      } else {
         ConversationUpdateNamePush var2 = (ConversationUpdateNamePush)var1;
         if (this.hasConversationReference() != var2.hasConversationReference()) {
            return false;
         } else if (this.hasConversationReference() && !this.getConversationReference().equals(var2.getConversationReference())) {
            return false;
         } else if (this.hasInvoker() != var2.hasInvoker()) {
            return false;
         } else if (this.hasInvoker() && !this.getInvoker().equals(var2.getInvoker())) {
            return false;
         } else {
            return !this.getName().equals(var2.getName()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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

      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + this.getName().hashCode();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static ConversationUpdateNamePush parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static ConversationUpdateNamePush parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ConversationUpdateNamePush parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static ConversationUpdateNamePush parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ConversationUpdateNamePush parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static ConversationUpdateNamePush parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ConversationUpdateNamePush parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ConversationUpdateNamePush parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ConversationUpdateNamePush parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ConversationUpdateNamePush parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ConversationUpdateNamePush parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ConversationUpdateNamePush parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public ConversationUpdateNamePush.Builder newBuilderForType() {
      return newBuilder();
   }

   public static ConversationUpdateNamePush.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ConversationUpdateNamePush.Builder newBuilder(ConversationUpdateNamePush var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public ConversationUpdateNamePush.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new ConversationUpdateNamePush.Builder() : new ConversationUpdateNamePush.Builder().mergeFrom(this);
   }

   protected ConversationUpdateNamePush.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new ConversationUpdateNamePush.Builder(var1);
   }

   public static ConversationUpdateNamePush getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<ConversationUpdateNamePush> parser() {
      return PARSER;
   }

   @Override
   public Parser<ConversationUpdateNamePush> getParserForType() {
      return PARSER;
   }

   public ConversationUpdateNamePush getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<ConversationUpdateNamePush.Builder> implements ConversationUpdateNamePushOrBuilder {
      private int bitField0_;
      private ConversationReference conversationReference_;
      private SingleFieldBuilderV3<ConversationReference, ConversationReference.Builder, ConversationReferenceOrBuilder> conversationReferenceBuilder_;
      private UuidAndUsername invoker_;
      private SingleFieldBuilderV3<UuidAndUsername, UuidAndUsername.Builder, UuidAndUsernameOrBuilder> invokerBuilder_;
      private Object name_ = "";

      public static final Descriptors.Descriptor getDescriptor() {
         return PushProto.internal_static_lunarclient_websocket_conversation_v1_ConversationUpdateNamePush_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PushProto.internal_static_lunarclient_websocket_conversation_v1_ConversationUpdateNamePush_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ConversationUpdateNamePush.class, ConversationUpdateNamePush.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (ConversationUpdateNamePush.alwaysUseFieldBuilders) {
            this.getConversationReferenceFieldBuilder();
            this.getInvokerFieldBuilder();
         }
      }

      public ConversationUpdateNamePush.Builder clear() {
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

         this.name_ = "";
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return PushProto.internal_static_lunarclient_websocket_conversation_v1_ConversationUpdateNamePush_descriptor;
      }

      public ConversationUpdateNamePush getDefaultInstanceForType() {
         return ConversationUpdateNamePush.getDefaultInstance();
      }

      public ConversationUpdateNamePush build() {
         ConversationUpdateNamePush var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public ConversationUpdateNamePush buildPartial() {
         ConversationUpdateNamePush var1 = new ConversationUpdateNamePush(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(ConversationUpdateNamePush var1) {
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
            var1.name_ = this.name_;
         }

         ConversationUpdateNamePush var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public ConversationUpdateNamePush.Builder clone() {
         return (ConversationUpdateNamePush.Builder)super.clone();
      }

      public ConversationUpdateNamePush.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ConversationUpdateNamePush.Builder)super.setField(var1, var2);
      }

      public ConversationUpdateNamePush.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (ConversationUpdateNamePush.Builder)super.clearField(var1);
      }

      public ConversationUpdateNamePush.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (ConversationUpdateNamePush.Builder)super.clearOneof(var1);
      }

      public ConversationUpdateNamePush.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (ConversationUpdateNamePush.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public ConversationUpdateNamePush.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ConversationUpdateNamePush.Builder)super.addRepeatedField(var1, var2);
      }

      public ConversationUpdateNamePush.Builder mergeFrom(Message var1) {
         if (var1 instanceof ConversationUpdateNamePush) {
            return this.mergeFrom((ConversationUpdateNamePush)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public ConversationUpdateNamePush.Builder mergeFrom(ConversationUpdateNamePush var1) {
         if (var1 == ConversationUpdateNamePush.getDefaultInstance()) {
            return this;
         }

         if (var1.hasConversationReference()) {
            this.mergeConversationReference(var1.getConversationReference());
         }

         if (var1.hasInvoker()) {
            this.mergeInvoker(var1.getInvoker());
         }

         if (!var1.getName().isEmpty()) {
            this.name_ = var1.name_;
            this.bitField0_ |= 4;
            this.onChanged();
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public ConversationUpdateNamePush.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.name_ = var1.readStringRequireUtf8();
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

      public ConversationUpdateNamePush.Builder setConversationReference(ConversationReference var1) {
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

      public ConversationUpdateNamePush.Builder setConversationReference(ConversationReference.Builder var1) {
         if (this.conversationReferenceBuilder_ == null) {
            this.conversationReference_ = var1.build();
         } else {
            this.conversationReferenceBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public ConversationUpdateNamePush.Builder mergeConversationReference(ConversationReference var1) {
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

      public ConversationUpdateNamePush.Builder clearConversationReference() {
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

      public ConversationUpdateNamePush.Builder setInvoker(UuidAndUsername var1) {
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

      public ConversationUpdateNamePush.Builder setInvoker(UuidAndUsername.Builder var1) {
         if (this.invokerBuilder_ == null) {
            this.invoker_ = var1.build();
         } else {
            this.invokerBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public ConversationUpdateNamePush.Builder mergeInvoker(UuidAndUsername var1) {
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

      public ConversationUpdateNamePush.Builder clearInvoker() {
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
      public String getName() {
         Object var1 = this.name_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.name_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getNameBytes() {
         Object var1 = this.name_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.name_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public ConversationUpdateNamePush.Builder setName(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.name_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public ConversationUpdateNamePush.Builder clearName() {
         this.name_ = ConversationUpdateNamePush.getDefaultInstance().getName();
         this.bitField0_ &= -5;
         this.onChanged();
         return this;
      }

      public ConversationUpdateNamePush.Builder setNameBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         ConversationUpdateNamePush.checkByteStringIsUtf8(var1);
         this.name_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public final ConversationUpdateNamePush.Builder setUnknownFields(UnknownFieldSet var1) {
         return (ConversationUpdateNamePush.Builder)super.setUnknownFields(var1);
      }

      public final ConversationUpdateNamePush.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (ConversationUpdateNamePush.Builder)super.mergeUnknownFields(var1);
      }
   }
}
