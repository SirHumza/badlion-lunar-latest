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

public final class UpdateConversationIconRequest extends GeneratedMessageV3 implements UpdateConversationIconRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int CONVERSATION_REFERENCE_FIELD_NUMBER = 1;
   private ConversationReference conversationReference_;
   public static final int IMAGE_FIELD_NUMBER = 2;
   private ConversationImage image_;
   private byte memoizedIsInitialized = -1;
   private static final UpdateConversationIconRequest DEFAULT_INSTANCE = new UpdateConversationIconRequest();
   private static final Parser<UpdateConversationIconRequest> PARSER = new AbstractParser<UpdateConversationIconRequest>() {
      public UpdateConversationIconRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         UpdateConversationIconRequest.Builder var3 = UpdateConversationIconRequest.newBuilder();

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

   private UpdateConversationIconRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private UpdateConversationIconRequest() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new UpdateConversationIconRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_UpdateConversationIconRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_UpdateConversationIconRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(UpdateConversationIconRequest.class, UpdateConversationIconRequest.Builder.class);
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
   public boolean hasImage() {
      return (this.bitField0_ & 2) != 0;
   }

   @Override
   public ConversationImage getImage() {
      return this.image_ == null ? ConversationImage.getDefaultInstance() : this.image_;
   }

   @Override
   public ConversationImageOrBuilder getImageOrBuilder() {
      return this.image_ == null ? ConversationImage.getDefaultInstance() : this.image_;
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
         var1.writeMessage(2, this.getImage());
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
         var1 += CodedOutputStream.computeMessageSize(2, this.getImage());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof UpdateConversationIconRequest)) {
         return super.equals(var1);
      } else {
         UpdateConversationIconRequest var2 = (UpdateConversationIconRequest)var1;
         if (this.hasConversationReference() != var2.hasConversationReference()) {
            return false;
         } else if (this.hasConversationReference() && !this.getConversationReference().equals(var2.getConversationReference())) {
            return false;
         } else if (this.hasImage() != var2.hasImage()) {
            return false;
         } else {
            return this.hasImage() && !this.getImage().equals(var2.getImage()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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

      if (this.hasImage()) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getImage().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static UpdateConversationIconRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static UpdateConversationIconRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UpdateConversationIconRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static UpdateConversationIconRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UpdateConversationIconRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static UpdateConversationIconRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UpdateConversationIconRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UpdateConversationIconRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static UpdateConversationIconRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static UpdateConversationIconRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static UpdateConversationIconRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UpdateConversationIconRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public UpdateConversationIconRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static UpdateConversationIconRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static UpdateConversationIconRequest.Builder newBuilder(UpdateConversationIconRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public UpdateConversationIconRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new UpdateConversationIconRequest.Builder() : new UpdateConversationIconRequest.Builder().mergeFrom(this);
   }

   protected UpdateConversationIconRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new UpdateConversationIconRequest.Builder(var1);
   }

   public static UpdateConversationIconRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<UpdateConversationIconRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<UpdateConversationIconRequest> getParserForType() {
      return PARSER;
   }

   public UpdateConversationIconRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder
      extends GeneratedMessageV3.Builder<UpdateConversationIconRequest.Builder>
      implements UpdateConversationIconRequestOrBuilder {
      private int bitField0_;
      private ConversationReference conversationReference_;
      private SingleFieldBuilderV3<ConversationReference, ConversationReference.Builder, ConversationReferenceOrBuilder> conversationReferenceBuilder_;
      private ConversationImage image_;
      private SingleFieldBuilderV3<ConversationImage, ConversationImage.Builder, ConversationImageOrBuilder> imageBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_UpdateConversationIconRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_UpdateConversationIconRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(UpdateConversationIconRequest.class, UpdateConversationIconRequest.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (UpdateConversationIconRequest.alwaysUseFieldBuilders) {
            this.getConversationReferenceFieldBuilder();
            this.getImageFieldBuilder();
         }
      }

      public UpdateConversationIconRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.conversationReference_ = null;
         if (this.conversationReferenceBuilder_ != null) {
            this.conversationReferenceBuilder_.dispose();
            this.conversationReferenceBuilder_ = null;
         }

         this.image_ = null;
         if (this.imageBuilder_ != null) {
            this.imageBuilder_.dispose();
            this.imageBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_UpdateConversationIconRequest_descriptor;
      }

      public UpdateConversationIconRequest getDefaultInstanceForType() {
         return UpdateConversationIconRequest.getDefaultInstance();
      }

      public UpdateConversationIconRequest build() {
         UpdateConversationIconRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public UpdateConversationIconRequest buildPartial() {
         UpdateConversationIconRequest var1 = new UpdateConversationIconRequest(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(UpdateConversationIconRequest var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.conversationReference_ = this.conversationReferenceBuilder_ == null ? this.conversationReference_ : this.conversationReferenceBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.image_ = this.imageBuilder_ == null ? this.image_ : this.imageBuilder_.build();
            var3 |= 2;
         }

         UpdateConversationIconRequest var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public UpdateConversationIconRequest.Builder clone() {
         return (UpdateConversationIconRequest.Builder)super.clone();
      }

      public UpdateConversationIconRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (UpdateConversationIconRequest.Builder)super.setField(var1, var2);
      }

      public UpdateConversationIconRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (UpdateConversationIconRequest.Builder)super.clearField(var1);
      }

      public UpdateConversationIconRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (UpdateConversationIconRequest.Builder)super.clearOneof(var1);
      }

      public UpdateConversationIconRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (UpdateConversationIconRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public UpdateConversationIconRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (UpdateConversationIconRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public UpdateConversationIconRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof UpdateConversationIconRequest) {
            return this.mergeFrom((UpdateConversationIconRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public UpdateConversationIconRequest.Builder mergeFrom(UpdateConversationIconRequest var1) {
         if (var1 == UpdateConversationIconRequest.getDefaultInstance()) {
            return this;
         }

         if (var1.hasConversationReference()) {
            this.mergeConversationReference(var1.getConversationReference());
         }

         if (var1.hasImage()) {
            this.mergeImage(var1.getImage());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public UpdateConversationIconRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getImageFieldBuilder().getBuilder(), var2);
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

      public UpdateConversationIconRequest.Builder setConversationReference(ConversationReference var1) {
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

      public UpdateConversationIconRequest.Builder setConversationReference(ConversationReference.Builder var1) {
         if (this.conversationReferenceBuilder_ == null) {
            this.conversationReference_ = var1.build();
         } else {
            this.conversationReferenceBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public UpdateConversationIconRequest.Builder mergeConversationReference(ConversationReference var1) {
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

      public UpdateConversationIconRequest.Builder clearConversationReference() {
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
      public boolean hasImage() {
         return (this.bitField0_ & 2) != 0;
      }

      @Override
      public ConversationImage getImage() {
         if (this.imageBuilder_ == null) {
            return this.image_ == null ? ConversationImage.getDefaultInstance() : this.image_;
         } else {
            return this.imageBuilder_.getMessage();
         }
      }

      public UpdateConversationIconRequest.Builder setImage(ConversationImage var1) {
         if (this.imageBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.image_ = var1;
         } else {
            this.imageBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public UpdateConversationIconRequest.Builder setImage(ConversationImage.Builder var1) {
         if (this.imageBuilder_ == null) {
            this.image_ = var1.build();
         } else {
            this.imageBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public UpdateConversationIconRequest.Builder mergeImage(ConversationImage var1) {
         if (this.imageBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0 && this.image_ != null && this.image_ != ConversationImage.getDefaultInstance()) {
               this.getImageBuilder().mergeFrom(var1);
            } else {
               this.image_ = var1;
            }
         } else {
            this.imageBuilder_.mergeFrom(var1);
         }

         if (this.image_ != null) {
            this.bitField0_ |= 2;
            this.onChanged();
         }

         return this;
      }

      public UpdateConversationIconRequest.Builder clearImage() {
         this.bitField0_ &= -3;
         this.image_ = null;
         if (this.imageBuilder_ != null) {
            this.imageBuilder_.dispose();
            this.imageBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public ConversationImage.Builder getImageBuilder() {
         this.bitField0_ |= 2;
         this.onChanged();
         return this.getImageFieldBuilder().getBuilder();
      }

      @Override
      public ConversationImageOrBuilder getImageOrBuilder() {
         if (this.imageBuilder_ != null) {
            return this.imageBuilder_.getMessageOrBuilder();
         } else {
            return this.image_ == null ? ConversationImage.getDefaultInstance() : this.image_;
         }
      }

      private SingleFieldBuilderV3<ConversationImage, ConversationImage.Builder, ConversationImageOrBuilder> getImageFieldBuilder() {
         if (this.imageBuilder_ == null) {
            this.imageBuilder_ = new SingleFieldBuilderV3<>(this.getImage(), this.getParentForChildren(), this.isClean());
            this.image_ = null;
         }

         return this.imageBuilder_;
      }

      public final UpdateConversationIconRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (UpdateConversationIconRequest.Builder)super.setUnknownFields(var1);
      }

      public final UpdateConversationIconRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (UpdateConversationIconRequest.Builder)super.mergeUnknownFields(var1);
      }
   }
}
