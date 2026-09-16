package com.lunarclient.websocket.conversation.v1;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class SetConversationPinnedRequest extends GeneratedMessageV3 implements SetConversationPinnedRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int CONVERSATION_REFERENCE_FIELD_NUMBER = 1;
   private ConversationReference conversationReference_;
   public static final int PINNED_FIELD_NUMBER = 2;
   private boolean pinned_ = false;
   private byte memoizedIsInitialized = -1;
   private static final SetConversationPinnedRequest DEFAULT_INSTANCE = new SetConversationPinnedRequest();
   private static final Parser<SetConversationPinnedRequest> PARSER = new AbstractParser<SetConversationPinnedRequest>() {
      public SetConversationPinnedRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         SetConversationPinnedRequest.Builder var3 = SetConversationPinnedRequest.newBuilder();

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

   private SetConversationPinnedRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private SetConversationPinnedRequest() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new SetConversationPinnedRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_SetConversationPinnedRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_SetConversationPinnedRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(SetConversationPinnedRequest.class, SetConversationPinnedRequest.Builder.class);
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
   public boolean getPinned() {
      return this.pinned_;
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

      if (this.pinned_) {
         var1.writeBool(2, this.pinned_);
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

      if (this.pinned_) {
         var1 += CodedOutputStream.computeBoolSize(2, this.pinned_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof SetConversationPinnedRequest)) {
         return super.equals(var1);
      } else {
         SetConversationPinnedRequest var2 = (SetConversationPinnedRequest)var1;
         if (this.hasConversationReference() != var2.hasConversationReference()) {
            return false;
         } else if (this.hasConversationReference() && !this.getConversationReference().equals(var2.getConversationReference())) {
            return false;
         } else {
            return this.getPinned() != var2.getPinned() ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + Internal.hashBoolean(this.getPinned());
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static SetConversationPinnedRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static SetConversationPinnedRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SetConversationPinnedRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static SetConversationPinnedRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SetConversationPinnedRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static SetConversationPinnedRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SetConversationPinnedRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SetConversationPinnedRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static SetConversationPinnedRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static SetConversationPinnedRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static SetConversationPinnedRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SetConversationPinnedRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public SetConversationPinnedRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static SetConversationPinnedRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static SetConversationPinnedRequest.Builder newBuilder(SetConversationPinnedRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public SetConversationPinnedRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new SetConversationPinnedRequest.Builder() : new SetConversationPinnedRequest.Builder().mergeFrom(this);
   }

   protected SetConversationPinnedRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new SetConversationPinnedRequest.Builder(var1);
   }

   public static SetConversationPinnedRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<SetConversationPinnedRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<SetConversationPinnedRequest> getParserForType() {
      return PARSER;
   }

   public SetConversationPinnedRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<SetConversationPinnedRequest.Builder> implements SetConversationPinnedRequestOrBuilder {
      private int bitField0_;
      private ConversationReference conversationReference_;
      private SingleFieldBuilderV3<ConversationReference, ConversationReference.Builder, ConversationReferenceOrBuilder> conversationReferenceBuilder_;
      private boolean pinned_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_SetConversationPinnedRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_SetConversationPinnedRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(SetConversationPinnedRequest.class, SetConversationPinnedRequest.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (SetConversationPinnedRequest.alwaysUseFieldBuilders) {
            this.getConversationReferenceFieldBuilder();
         }
      }

      public SetConversationPinnedRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.conversationReference_ = null;
         if (this.conversationReferenceBuilder_ != null) {
            this.conversationReferenceBuilder_.dispose();
            this.conversationReferenceBuilder_ = null;
         }

         this.pinned_ = false;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_SetConversationPinnedRequest_descriptor;
      }

      public SetConversationPinnedRequest getDefaultInstanceForType() {
         return SetConversationPinnedRequest.getDefaultInstance();
      }

      public SetConversationPinnedRequest build() {
         SetConversationPinnedRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public SetConversationPinnedRequest buildPartial() {
         SetConversationPinnedRequest var1 = new SetConversationPinnedRequest(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(SetConversationPinnedRequest var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.conversationReference_ = this.conversationReferenceBuilder_ == null ? this.conversationReference_ : this.conversationReferenceBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.pinned_ = this.pinned_;
         }

         SetConversationPinnedRequest var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public SetConversationPinnedRequest.Builder clone() {
         return (SetConversationPinnedRequest.Builder)super.clone();
      }

      public SetConversationPinnedRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (SetConversationPinnedRequest.Builder)super.setField(var1, var2);
      }

      public SetConversationPinnedRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (SetConversationPinnedRequest.Builder)super.clearField(var1);
      }

      public SetConversationPinnedRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (SetConversationPinnedRequest.Builder)super.clearOneof(var1);
      }

      public SetConversationPinnedRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (SetConversationPinnedRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public SetConversationPinnedRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (SetConversationPinnedRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public SetConversationPinnedRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof SetConversationPinnedRequest) {
            return this.mergeFrom((SetConversationPinnedRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public SetConversationPinnedRequest.Builder mergeFrom(SetConversationPinnedRequest var1) {
         if (var1 == SetConversationPinnedRequest.getDefaultInstance()) {
            return this;
         }

         if (var1.hasConversationReference()) {
            this.mergeConversationReference(var1.getConversationReference());
         }

         if (var1.getPinned()) {
            this.setPinned(var1.getPinned());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public SetConversationPinnedRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.pinned_ = var1.readBool();
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

      public SetConversationPinnedRequest.Builder setConversationReference(ConversationReference var1) {
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

      public SetConversationPinnedRequest.Builder setConversationReference(ConversationReference.Builder var1) {
         if (this.conversationReferenceBuilder_ == null) {
            this.conversationReference_ = var1.build();
         } else {
            this.conversationReferenceBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public SetConversationPinnedRequest.Builder mergeConversationReference(ConversationReference var1) {
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

      public SetConversationPinnedRequest.Builder clearConversationReference() {
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
      public boolean getPinned() {
         return this.pinned_;
      }

      public SetConversationPinnedRequest.Builder setPinned(boolean var1) {
         this.pinned_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public SetConversationPinnedRequest.Builder clearPinned() {
         this.bitField0_ &= -3;
         this.pinned_ = false;
         this.onChanged();
         return this;
      }

      public final SetConversationPinnedRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (SetConversationPinnedRequest.Builder)super.setUnknownFields(var1);
      }

      public final SetConversationPinnedRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (SetConversationPinnedRequest.Builder)super.mergeUnknownFields(var1);
      }
   }
}
