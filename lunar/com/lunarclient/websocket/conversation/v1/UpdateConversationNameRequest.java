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

public final class UpdateConversationNameRequest extends GeneratedMessageV3 implements UpdateConversationNameRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int CONVERSATION_REFERENCE_FIELD_NUMBER = 1;
   private ConversationReference conversationReference_;
   public static final int NAME_FIELD_NUMBER = 2;
   private volatile Object name_ = "";
   private byte memoizedIsInitialized = -1;
   private static final UpdateConversationNameRequest DEFAULT_INSTANCE = new UpdateConversationNameRequest();
   private static final Parser<UpdateConversationNameRequest> PARSER = new AbstractParser<UpdateConversationNameRequest>() {
      public UpdateConversationNameRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         UpdateConversationNameRequest.Builder var3 = UpdateConversationNameRequest.newBuilder();

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

   private UpdateConversationNameRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private UpdateConversationNameRequest() {
      this.name_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new UpdateConversationNameRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_UpdateConversationNameRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_UpdateConversationNameRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(UpdateConversationNameRequest.class, UpdateConversationNameRequest.Builder.class);
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

      if (!GeneratedMessageV3.isStringEmpty(this.name_)) {
         GeneratedMessageV3.writeString(var1, 2, this.name_);
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

      if (!GeneratedMessageV3.isStringEmpty(this.name_)) {
         var1 += GeneratedMessageV3.computeStringSize(2, this.name_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof UpdateConversationNameRequest)) {
         return super.equals(var1);
      } else {
         UpdateConversationNameRequest var2 = (UpdateConversationNameRequest)var1;
         if (this.hasConversationReference() != var2.hasConversationReference()) {
            return false;
         } else if (this.hasConversationReference() && !this.getConversationReference().equals(var2.getConversationReference())) {
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

      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.getName().hashCode();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static UpdateConversationNameRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static UpdateConversationNameRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UpdateConversationNameRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static UpdateConversationNameRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UpdateConversationNameRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static UpdateConversationNameRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UpdateConversationNameRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UpdateConversationNameRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static UpdateConversationNameRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static UpdateConversationNameRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static UpdateConversationNameRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UpdateConversationNameRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public UpdateConversationNameRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static UpdateConversationNameRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static UpdateConversationNameRequest.Builder newBuilder(UpdateConversationNameRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public UpdateConversationNameRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new UpdateConversationNameRequest.Builder() : new UpdateConversationNameRequest.Builder().mergeFrom(this);
   }

   protected UpdateConversationNameRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new UpdateConversationNameRequest.Builder(var1);
   }

   public static UpdateConversationNameRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<UpdateConversationNameRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<UpdateConversationNameRequest> getParserForType() {
      return PARSER;
   }

   public UpdateConversationNameRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder
      extends GeneratedMessageV3.Builder<UpdateConversationNameRequest.Builder>
      implements UpdateConversationNameRequestOrBuilder {
      private int bitField0_;
      private ConversationReference conversationReference_;
      private SingleFieldBuilderV3<ConversationReference, ConversationReference.Builder, ConversationReferenceOrBuilder> conversationReferenceBuilder_;
      private Object name_ = "";

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_UpdateConversationNameRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_UpdateConversationNameRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(UpdateConversationNameRequest.class, UpdateConversationNameRequest.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (UpdateConversationNameRequest.alwaysUseFieldBuilders) {
            this.getConversationReferenceFieldBuilder();
         }
      }

      public UpdateConversationNameRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.conversationReference_ = null;
         if (this.conversationReferenceBuilder_ != null) {
            this.conversationReferenceBuilder_.dispose();
            this.conversationReferenceBuilder_ = null;
         }

         this.name_ = "";
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_UpdateConversationNameRequest_descriptor;
      }

      public UpdateConversationNameRequest getDefaultInstanceForType() {
         return UpdateConversationNameRequest.getDefaultInstance();
      }

      public UpdateConversationNameRequest build() {
         UpdateConversationNameRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public UpdateConversationNameRequest buildPartial() {
         UpdateConversationNameRequest var1 = new UpdateConversationNameRequest(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(UpdateConversationNameRequest var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.conversationReference_ = this.conversationReferenceBuilder_ == null ? this.conversationReference_ : this.conversationReferenceBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.name_ = this.name_;
         }

         UpdateConversationNameRequest var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public UpdateConversationNameRequest.Builder clone() {
         return (UpdateConversationNameRequest.Builder)super.clone();
      }

      public UpdateConversationNameRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (UpdateConversationNameRequest.Builder)super.setField(var1, var2);
      }

      public UpdateConversationNameRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (UpdateConversationNameRequest.Builder)super.clearField(var1);
      }

      public UpdateConversationNameRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (UpdateConversationNameRequest.Builder)super.clearOneof(var1);
      }

      public UpdateConversationNameRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (UpdateConversationNameRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public UpdateConversationNameRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (UpdateConversationNameRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public UpdateConversationNameRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof UpdateConversationNameRequest) {
            return this.mergeFrom((UpdateConversationNameRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public UpdateConversationNameRequest.Builder mergeFrom(UpdateConversationNameRequest var1) {
         if (var1 == UpdateConversationNameRequest.getDefaultInstance()) {
            return this;
         }

         if (var1.hasConversationReference()) {
            this.mergeConversationReference(var1.getConversationReference());
         }

         if (!var1.getName().isEmpty()) {
            this.name_ = var1.name_;
            this.bitField0_ |= 2;
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

      public UpdateConversationNameRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.name_ = var1.readStringRequireUtf8();
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

      public UpdateConversationNameRequest.Builder setConversationReference(ConversationReference var1) {
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

      public UpdateConversationNameRequest.Builder setConversationReference(ConversationReference.Builder var1) {
         if (this.conversationReferenceBuilder_ == null) {
            this.conversationReference_ = var1.build();
         } else {
            this.conversationReferenceBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public UpdateConversationNameRequest.Builder mergeConversationReference(ConversationReference var1) {
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

      public UpdateConversationNameRequest.Builder clearConversationReference() {
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

      public UpdateConversationNameRequest.Builder setName(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.name_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public UpdateConversationNameRequest.Builder clearName() {
         this.name_ = UpdateConversationNameRequest.getDefaultInstance().getName();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      public UpdateConversationNameRequest.Builder setNameBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         UpdateConversationNameRequest.checkByteStringIsUtf8(var1);
         this.name_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public final UpdateConversationNameRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (UpdateConversationNameRequest.Builder)super.setUnknownFields(var1);
      }

      public final UpdateConversationNameRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (UpdateConversationNameRequest.Builder)super.mergeUnknownFields(var1);
      }
   }
}
