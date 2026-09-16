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

public final class ConversationUpdateIconPush extends GeneratedMessageV3 implements ConversationUpdateIconPushOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int CONVERSATION_REFERENCE_FIELD_NUMBER = 1;
   private ConversationReference conversationReference_;
   public static final int INVOKER_FIELD_NUMBER = 2;
   private UuidAndUsername invoker_;
   public static final int IMAGE_URL_FIELD_NUMBER = 3;
   private volatile Object imageUrl_ = "";
   private byte memoizedIsInitialized = -1;
   private static final ConversationUpdateIconPush DEFAULT_INSTANCE = new ConversationUpdateIconPush();
   private static final Parser<ConversationUpdateIconPush> PARSER = new AbstractParser<ConversationUpdateIconPush>() {
      public ConversationUpdateIconPush parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         ConversationUpdateIconPush.Builder var3 = ConversationUpdateIconPush.newBuilder();

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

   private ConversationUpdateIconPush(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private ConversationUpdateIconPush() {
      this.imageUrl_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new ConversationUpdateIconPush();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return PushProto.internal_static_lunarclient_websocket_conversation_v1_ConversationUpdateIconPush_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return PushProto.internal_static_lunarclient_websocket_conversation_v1_ConversationUpdateIconPush_fieldAccessorTable
         .ensureFieldAccessorsInitialized(ConversationUpdateIconPush.class, ConversationUpdateIconPush.Builder.class);
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
   public String getImageUrl() {
      Object var1 = this.imageUrl_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.imageUrl_ = var3;
      return var3;
   }

   @Override
   public ByteString getImageUrlBytes() {
      Object var1 = this.imageUrl_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.imageUrl_ = var2;
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

      if (!GeneratedMessageV3.isStringEmpty(this.imageUrl_)) {
         GeneratedMessageV3.writeString(var1, 3, this.imageUrl_);
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

      if (!GeneratedMessageV3.isStringEmpty(this.imageUrl_)) {
         var1 += GeneratedMessageV3.computeStringSize(3, this.imageUrl_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof ConversationUpdateIconPush)) {
         return super.equals(var1);
      } else {
         ConversationUpdateIconPush var2 = (ConversationUpdateIconPush)var1;
         if (this.hasConversationReference() != var2.hasConversationReference()) {
            return false;
         } else if (this.hasConversationReference() && !this.getConversationReference().equals(var2.getConversationReference())) {
            return false;
         } else if (this.hasInvoker() != var2.hasInvoker()) {
            return false;
         } else if (this.hasInvoker() && !this.getInvoker().equals(var2.getInvoker())) {
            return false;
         } else {
            return !this.getImageUrl().equals(var2.getImageUrl()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + this.getImageUrl().hashCode();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static ConversationUpdateIconPush parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static ConversationUpdateIconPush parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ConversationUpdateIconPush parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static ConversationUpdateIconPush parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ConversationUpdateIconPush parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static ConversationUpdateIconPush parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ConversationUpdateIconPush parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ConversationUpdateIconPush parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ConversationUpdateIconPush parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ConversationUpdateIconPush parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ConversationUpdateIconPush parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ConversationUpdateIconPush parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public ConversationUpdateIconPush.Builder newBuilderForType() {
      return newBuilder();
   }

   public static ConversationUpdateIconPush.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ConversationUpdateIconPush.Builder newBuilder(ConversationUpdateIconPush var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public ConversationUpdateIconPush.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new ConversationUpdateIconPush.Builder() : new ConversationUpdateIconPush.Builder().mergeFrom(this);
   }

   protected ConversationUpdateIconPush.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new ConversationUpdateIconPush.Builder(var1);
   }

   public static ConversationUpdateIconPush getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<ConversationUpdateIconPush> parser() {
      return PARSER;
   }

   @Override
   public Parser<ConversationUpdateIconPush> getParserForType() {
      return PARSER;
   }

   public ConversationUpdateIconPush getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<ConversationUpdateIconPush.Builder> implements ConversationUpdateIconPushOrBuilder {
      private int bitField0_;
      private ConversationReference conversationReference_;
      private SingleFieldBuilderV3<ConversationReference, ConversationReference.Builder, ConversationReferenceOrBuilder> conversationReferenceBuilder_;
      private UuidAndUsername invoker_;
      private SingleFieldBuilderV3<UuidAndUsername, UuidAndUsername.Builder, UuidAndUsernameOrBuilder> invokerBuilder_;
      private Object imageUrl_ = "";

      public static final Descriptors.Descriptor getDescriptor() {
         return PushProto.internal_static_lunarclient_websocket_conversation_v1_ConversationUpdateIconPush_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PushProto.internal_static_lunarclient_websocket_conversation_v1_ConversationUpdateIconPush_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ConversationUpdateIconPush.class, ConversationUpdateIconPush.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (ConversationUpdateIconPush.alwaysUseFieldBuilders) {
            this.getConversationReferenceFieldBuilder();
            this.getInvokerFieldBuilder();
         }
      }

      public ConversationUpdateIconPush.Builder clear() {
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

         this.imageUrl_ = "";
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return PushProto.internal_static_lunarclient_websocket_conversation_v1_ConversationUpdateIconPush_descriptor;
      }

      public ConversationUpdateIconPush getDefaultInstanceForType() {
         return ConversationUpdateIconPush.getDefaultInstance();
      }

      public ConversationUpdateIconPush build() {
         ConversationUpdateIconPush var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public ConversationUpdateIconPush buildPartial() {
         ConversationUpdateIconPush var1 = new ConversationUpdateIconPush(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(ConversationUpdateIconPush var1) {
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
            var1.imageUrl_ = this.imageUrl_;
         }

         ConversationUpdateIconPush var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public ConversationUpdateIconPush.Builder clone() {
         return (ConversationUpdateIconPush.Builder)super.clone();
      }

      public ConversationUpdateIconPush.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ConversationUpdateIconPush.Builder)super.setField(var1, var2);
      }

      public ConversationUpdateIconPush.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (ConversationUpdateIconPush.Builder)super.clearField(var1);
      }

      public ConversationUpdateIconPush.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (ConversationUpdateIconPush.Builder)super.clearOneof(var1);
      }

      public ConversationUpdateIconPush.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (ConversationUpdateIconPush.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public ConversationUpdateIconPush.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ConversationUpdateIconPush.Builder)super.addRepeatedField(var1, var2);
      }

      public ConversationUpdateIconPush.Builder mergeFrom(Message var1) {
         if (var1 instanceof ConversationUpdateIconPush) {
            return this.mergeFrom((ConversationUpdateIconPush)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public ConversationUpdateIconPush.Builder mergeFrom(ConversationUpdateIconPush var1) {
         if (var1 == ConversationUpdateIconPush.getDefaultInstance()) {
            return this;
         }

         if (var1.hasConversationReference()) {
            this.mergeConversationReference(var1.getConversationReference());
         }

         if (var1.hasInvoker()) {
            this.mergeInvoker(var1.getInvoker());
         }

         if (!var1.getImageUrl().isEmpty()) {
            this.imageUrl_ = var1.imageUrl_;
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

      public ConversationUpdateIconPush.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.imageUrl_ = var1.readStringRequireUtf8();
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

      public ConversationUpdateIconPush.Builder setConversationReference(ConversationReference var1) {
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

      public ConversationUpdateIconPush.Builder setConversationReference(ConversationReference.Builder var1) {
         if (this.conversationReferenceBuilder_ == null) {
            this.conversationReference_ = var1.build();
         } else {
            this.conversationReferenceBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public ConversationUpdateIconPush.Builder mergeConversationReference(ConversationReference var1) {
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

      public ConversationUpdateIconPush.Builder clearConversationReference() {
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

      public ConversationUpdateIconPush.Builder setInvoker(UuidAndUsername var1) {
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

      public ConversationUpdateIconPush.Builder setInvoker(UuidAndUsername.Builder var1) {
         if (this.invokerBuilder_ == null) {
            this.invoker_ = var1.build();
         } else {
            this.invokerBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public ConversationUpdateIconPush.Builder mergeInvoker(UuidAndUsername var1) {
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

      public ConversationUpdateIconPush.Builder clearInvoker() {
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
      public String getImageUrl() {
         Object var1 = this.imageUrl_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.imageUrl_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getImageUrlBytes() {
         Object var1 = this.imageUrl_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.imageUrl_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public ConversationUpdateIconPush.Builder setImageUrl(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.imageUrl_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public ConversationUpdateIconPush.Builder clearImageUrl() {
         this.imageUrl_ = ConversationUpdateIconPush.getDefaultInstance().getImageUrl();
         this.bitField0_ &= -5;
         this.onChanged();
         return this;
      }

      public ConversationUpdateIconPush.Builder setImageUrlBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         ConversationUpdateIconPush.checkByteStringIsUtf8(var1);
         this.imageUrl_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public final ConversationUpdateIconPush.Builder setUnknownFields(UnknownFieldSet var1) {
         return (ConversationUpdateIconPush.Builder)super.setUnknownFields(var1);
      }

      public final ConversationUpdateIconPush.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (ConversationUpdateIconPush.Builder)super.mergeUnknownFields(var1);
      }
   }
}
