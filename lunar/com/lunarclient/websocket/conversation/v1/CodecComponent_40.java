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
import com.google.protobuf.Timestamp;
import com.google.protobuf.TimestampOrBuilder;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class GetConversationsRequest extends GeneratedMessageV3 implements GetConversationsRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int LIMIT_FIELD_NUMBER = 1;
   private int limit_ = 0;
   public static final int CURSOR_FIELD_NUMBER = 2;
   private Timestamp cursor_;
   public static final int CONVERSATION_REFERENCE_FIELD_NUMBER = 3;
   private ConversationReference conversationReference_;
   private byte memoizedIsInitialized = -1;
   private static final GetConversationsRequest DEFAULT_INSTANCE = new GetConversationsRequest();
   private static final Parser<GetConversationsRequest> PARSER = new AbstractParser<GetConversationsRequest>() {
      public GetConversationsRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         GetConversationsRequest.Builder var3 = GetConversationsRequest.newBuilder();

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

   private GetConversationsRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private GetConversationsRequest() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new GetConversationsRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_GetConversationsRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_GetConversationsRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(GetConversationsRequest.class, GetConversationsRequest.Builder.class);
   }

   @Override
   public boolean hasLimit() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public int getLimit() {
      return this.limit_;
   }

   @Override
   public boolean hasCursor() {
      return (this.bitField0_ & 2) != 0;
   }

   @Override
   public Timestamp getCursor() {
      return this.cursor_ == null ? Timestamp.getDefaultInstance() : this.cursor_;
   }

   @Override
   public TimestampOrBuilder getCursorOrBuilder() {
      return this.cursor_ == null ? Timestamp.getDefaultInstance() : this.cursor_;
   }

   @Override
   public boolean hasConversationReference() {
      return (this.bitField0_ & 4) != 0;
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
         var1.writeInt32(1, this.limit_);
      }

      if ((this.bitField0_ & 2) != 0) {
         var1.writeMessage(2, this.getCursor());
      }

      if ((this.bitField0_ & 4) != 0) {
         var1.writeMessage(3, this.getConversationReference());
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
         var1 += CodedOutputStream.computeInt32Size(1, this.limit_);
      }

      if ((this.bitField0_ & 2) != 0) {
         var1 += CodedOutputStream.computeMessageSize(2, this.getCursor());
      }

      if ((this.bitField0_ & 4) != 0) {
         var1 += CodedOutputStream.computeMessageSize(3, this.getConversationReference());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof GetConversationsRequest)) {
         return super.equals(var1);
      } else {
         GetConversationsRequest var2 = (GetConversationsRequest)var1;
         if (this.hasLimit() != var2.hasLimit()) {
            return false;
         } else if (this.hasLimit() && this.getLimit() != var2.getLimit()) {
            return false;
         } else if (this.hasCursor() != var2.hasCursor()) {
            return false;
         } else if (this.hasCursor() && !this.getCursor().equals(var2.getCursor())) {
            return false;
         } else if (this.hasConversationReference() != var2.hasConversationReference()) {
            return false;
         } else {
            return this.hasConversationReference() && !this.getConversationReference().equals(var2.getConversationReference())
               ? false
               : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.hasLimit()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getLimit();
      }

      if (this.hasCursor()) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getCursor().hashCode();
      }

      if (this.hasConversationReference()) {
         var1 = 37 * var1 + 3;
         var1 = 53 * var1 + this.getConversationReference().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static GetConversationsRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static GetConversationsRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static GetConversationsRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static GetConversationsRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static GetConversationsRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static GetConversationsRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static GetConversationsRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static GetConversationsRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static GetConversationsRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static GetConversationsRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static GetConversationsRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static GetConversationsRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public GetConversationsRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static GetConversationsRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static GetConversationsRequest.Builder newBuilder(GetConversationsRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public GetConversationsRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new GetConversationsRequest.Builder() : new GetConversationsRequest.Builder().mergeFrom(this);
   }

   protected GetConversationsRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new GetConversationsRequest.Builder(var1);
   }

   public static GetConversationsRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<GetConversationsRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<GetConversationsRequest> getParserForType() {
      return PARSER;
   }

   public GetConversationsRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<GetConversationsRequest.Builder> implements GetConversationsRequestOrBuilder {
      private int bitField0_;
      private int limit_;
      private Timestamp cursor_;
      private SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> cursorBuilder_;
      private ConversationReference conversationReference_;
      private SingleFieldBuilderV3<ConversationReference, ConversationReference.Builder, ConversationReferenceOrBuilder> conversationReferenceBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_GetConversationsRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_GetConversationsRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(GetConversationsRequest.class, GetConversationsRequest.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (GetConversationsRequest.alwaysUseFieldBuilders) {
            this.getCursorFieldBuilder();
            this.getConversationReferenceFieldBuilder();
         }
      }

      public GetConversationsRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.limit_ = 0;
         this.cursor_ = null;
         if (this.cursorBuilder_ != null) {
            this.cursorBuilder_.dispose();
            this.cursorBuilder_ = null;
         }

         this.conversationReference_ = null;
         if (this.conversationReferenceBuilder_ != null) {
            this.conversationReferenceBuilder_.dispose();
            this.conversationReferenceBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_GetConversationsRequest_descriptor;
      }

      public GetConversationsRequest getDefaultInstanceForType() {
         return GetConversationsRequest.getDefaultInstance();
      }

      public GetConversationsRequest build() {
         GetConversationsRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public GetConversationsRequest buildPartial() {
         GetConversationsRequest var1 = new GetConversationsRequest(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(GetConversationsRequest var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.limit_ = this.limit_;
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.cursor_ = this.cursorBuilder_ == null ? this.cursor_ : this.cursorBuilder_.build();
            var3 |= 2;
         }

         if ((var2 & 4) != 0) {
            var1.conversationReference_ = this.conversationReferenceBuilder_ == null ? this.conversationReference_ : this.conversationReferenceBuilder_.build();
            var3 |= 4;
         }

         GetConversationsRequest var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public GetConversationsRequest.Builder clone() {
         return (GetConversationsRequest.Builder)super.clone();
      }

      public GetConversationsRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (GetConversationsRequest.Builder)super.setField(var1, var2);
      }

      public GetConversationsRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (GetConversationsRequest.Builder)super.clearField(var1);
      }

      public GetConversationsRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (GetConversationsRequest.Builder)super.clearOneof(var1);
      }

      public GetConversationsRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (GetConversationsRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public GetConversationsRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (GetConversationsRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public GetConversationsRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof GetConversationsRequest) {
            return this.mergeFrom((GetConversationsRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public GetConversationsRequest.Builder mergeFrom(GetConversationsRequest var1) {
         if (var1 == GetConversationsRequest.getDefaultInstance()) {
            return this;
         }

         if (var1.hasLimit()) {
            this.setLimit(var1.getLimit());
         }

         if (var1.hasCursor()) {
            this.mergeCursor(var1.getCursor());
         }

         if (var1.hasConversationReference()) {
            this.mergeConversationReference(var1.getConversationReference());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public GetConversationsRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                  case 8:
                     this.limit_ = var1.readInt32();
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     var1.readMessage(this.getCursorFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 2;
                     break;
                  case 26:
                     var1.readMessage(this.getConversationReferenceFieldBuilder().getBuilder(), var2);
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
      public boolean hasLimit() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public int getLimit() {
         return this.limit_;
      }

      public GetConversationsRequest.Builder setLimit(int var1) {
         this.limit_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public GetConversationsRequest.Builder clearLimit() {
         this.bitField0_ &= -2;
         this.limit_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasCursor() {
         return (this.bitField0_ & 2) != 0;
      }

      @Override
      public Timestamp getCursor() {
         if (this.cursorBuilder_ == null) {
            return this.cursor_ == null ? Timestamp.getDefaultInstance() : this.cursor_;
         } else {
            return this.cursorBuilder_.getMessage();
         }
      }

      public GetConversationsRequest.Builder setCursor(Timestamp var1) {
         if (this.cursorBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.cursor_ = var1;
         } else {
            this.cursorBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public GetConversationsRequest.Builder setCursor(Timestamp.Builder var1) {
         if (this.cursorBuilder_ == null) {
            this.cursor_ = var1.build();
         } else {
            this.cursorBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public GetConversationsRequest.Builder mergeCursor(Timestamp var1) {
         if (this.cursorBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0 && this.cursor_ != null && this.cursor_ != Timestamp.getDefaultInstance()) {
               this.getCursorBuilder().mergeFrom(var1);
            } else {
               this.cursor_ = var1;
            }
         } else {
            this.cursorBuilder_.mergeFrom(var1);
         }

         if (this.cursor_ != null) {
            this.bitField0_ |= 2;
            this.onChanged();
         }

         return this;
      }

      public GetConversationsRequest.Builder clearCursor() {
         this.bitField0_ &= -3;
         this.cursor_ = null;
         if (this.cursorBuilder_ != null) {
            this.cursorBuilder_.dispose();
            this.cursorBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Timestamp.Builder getCursorBuilder() {
         this.bitField0_ |= 2;
         this.onChanged();
         return this.getCursorFieldBuilder().getBuilder();
      }

      @Override
      public TimestampOrBuilder getCursorOrBuilder() {
         if (this.cursorBuilder_ != null) {
            return this.cursorBuilder_.getMessageOrBuilder();
         } else {
            return this.cursor_ == null ? Timestamp.getDefaultInstance() : this.cursor_;
         }
      }

      private SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> getCursorFieldBuilder() {
         if (this.cursorBuilder_ == null) {
            this.cursorBuilder_ = new SingleFieldBuilderV3<>(this.getCursor(), this.getParentForChildren(), this.isClean());
            this.cursor_ = null;
         }

         return this.cursorBuilder_;
      }

      @Override
      public boolean hasConversationReference() {
         return (this.bitField0_ & 4) != 0;
      }

      @Override
      public ConversationReference getConversationReference() {
         if (this.conversationReferenceBuilder_ == null) {
            return this.conversationReference_ == null ? ConversationReference.getDefaultInstance() : this.conversationReference_;
         } else {
            return this.conversationReferenceBuilder_.getMessage();
         }
      }

      public GetConversationsRequest.Builder setConversationReference(ConversationReference var1) {
         if (this.conversationReferenceBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.conversationReference_ = var1;
         } else {
            this.conversationReferenceBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public GetConversationsRequest.Builder setConversationReference(ConversationReference.Builder var1) {
         if (this.conversationReferenceBuilder_ == null) {
            this.conversationReference_ = var1.build();
         } else {
            this.conversationReferenceBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public GetConversationsRequest.Builder mergeConversationReference(ConversationReference var1) {
         if (this.conversationReferenceBuilder_ == null) {
            if ((this.bitField0_ & 4) != 0 && this.conversationReference_ != null && this.conversationReference_ != ConversationReference.getDefaultInstance()) {
               this.getConversationReferenceBuilder().mergeFrom(var1);
            } else {
               this.conversationReference_ = var1;
            }
         } else {
            this.conversationReferenceBuilder_.mergeFrom(var1);
         }

         if (this.conversationReference_ != null) {
            this.bitField0_ |= 4;
            this.onChanged();
         }

         return this;
      }

      public GetConversationsRequest.Builder clearConversationReference() {
         this.bitField0_ &= -5;
         this.conversationReference_ = null;
         if (this.conversationReferenceBuilder_ != null) {
            this.conversationReferenceBuilder_.dispose();
            this.conversationReferenceBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public ConversationReference.Builder getConversationReferenceBuilder() {
         this.bitField0_ |= 4;
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

      public final GetConversationsRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (GetConversationsRequest.Builder)super.setUnknownFields(var1);
      }

      public final GetConversationsRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (GetConversationsRequest.Builder)super.mergeUnknownFields(var1);
      }
   }
}
