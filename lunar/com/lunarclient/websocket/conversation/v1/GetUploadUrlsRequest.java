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
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class GetUploadUrlsRequest extends GeneratedMessageV3 implements GetUploadUrlsRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int CONVERSATION_REFERENCE_FIELD_NUMBER = 1;
   private ConversationReference conversationReference_;
   public static final int USAGE_FIELD_NUMBER = 2;
   private int usage_ = 0;
   public static final int ITEMS_FIELD_NUMBER = 3;
   private List<UploadRequestItem> items_;
   private byte memoizedIsInitialized = -1;
   private static final GetUploadUrlsRequest DEFAULT_INSTANCE = new GetUploadUrlsRequest();
   private static final Parser<GetUploadUrlsRequest> PARSER = new AbstractParser<GetUploadUrlsRequest>() {
      public GetUploadUrlsRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         GetUploadUrlsRequest.Builder var3 = GetUploadUrlsRequest.newBuilder();

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

   private GetUploadUrlsRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private GetUploadUrlsRequest() {
      this.usage_ = 0;
      this.items_ = Collections.emptyList();
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new GetUploadUrlsRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_GetUploadUrlsRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_GetUploadUrlsRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(GetUploadUrlsRequest.class, GetUploadUrlsRequest.Builder.class);
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
   public int getUsageValue() {
      return this.usage_;
   }

   @Override
   public UploadUsage getUsage() {
      UploadUsage var1 = UploadUsage.forNumber(this.usage_);
      return var1 == null ? UploadUsage.UNRECOGNIZED : var1;
   }

   @Override
   public List<UploadRequestItem> getItemsList() {
      return this.items_;
   }

   @Override
   public List<? extends UploadRequestItemOrBuilder> getItemsOrBuilderList() {
      return this.items_;
   }

   @Override
   public int getItemsCount() {
      return this.items_.size();
   }

   @Override
   public UploadRequestItem getItems(int var1) {
      return this.items_.get(var1);
   }

   @Override
   public UploadRequestItemOrBuilder getItemsOrBuilder(int var1) {
      return this.items_.get(var1);
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

      if (this.usage_ != UploadUsage.UPLOAD_USAGE_UNSPECIFIED.getNumber()) {
         var1.writeEnum(2, this.usage_);
      }

      for (int var2 = 0; var2 < this.items_.size(); var2++) {
         var1.writeMessage(3, this.items_.get(var2));
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

      if (this.usage_ != UploadUsage.UPLOAD_USAGE_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(2, this.usage_);
      }

      for (int var2 = 0; var2 < this.items_.size(); var2++) {
         var1 += CodedOutputStream.computeMessageSize(3, this.items_.get(var2));
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof GetUploadUrlsRequest)) {
         return super.equals(var1);
      } else {
         GetUploadUrlsRequest var2 = (GetUploadUrlsRequest)var1;
         if (this.hasConversationReference() != var2.hasConversationReference()) {
            return false;
         } else if (this.hasConversationReference() && !this.getConversationReference().equals(var2.getConversationReference())) {
            return false;
         } else if (this.usage_ != var2.usage_) {
            return false;
         } else {
            return !this.getItemsList().equals(var2.getItemsList()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + this.usage_;
      if (this.getItemsCount() > 0) {
         var1 = 37 * var1 + 3;
         var1 = 53 * var1 + this.getItemsList().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static GetUploadUrlsRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static GetUploadUrlsRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static GetUploadUrlsRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static GetUploadUrlsRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static GetUploadUrlsRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static GetUploadUrlsRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static GetUploadUrlsRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static GetUploadUrlsRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static GetUploadUrlsRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static GetUploadUrlsRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static GetUploadUrlsRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static GetUploadUrlsRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public GetUploadUrlsRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static GetUploadUrlsRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static GetUploadUrlsRequest.Builder newBuilder(GetUploadUrlsRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public GetUploadUrlsRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new GetUploadUrlsRequest.Builder() : new GetUploadUrlsRequest.Builder().mergeFrom(this);
   }

   protected GetUploadUrlsRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new GetUploadUrlsRequest.Builder(var1);
   }

   public static GetUploadUrlsRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<GetUploadUrlsRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<GetUploadUrlsRequest> getParserForType() {
      return PARSER;
   }

   public GetUploadUrlsRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<GetUploadUrlsRequest.Builder> implements GetUploadUrlsRequestOrBuilder {
      private int bitField0_;
      private ConversationReference conversationReference_;
      private SingleFieldBuilderV3<ConversationReference, ConversationReference.Builder, ConversationReferenceOrBuilder> conversationReferenceBuilder_;
      private int usage_ = 0;
      private List<UploadRequestItem> items_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<UploadRequestItem, UploadRequestItem.Builder, UploadRequestItemOrBuilder> itemsBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_GetUploadUrlsRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_GetUploadUrlsRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(GetUploadUrlsRequest.class, GetUploadUrlsRequest.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (GetUploadUrlsRequest.alwaysUseFieldBuilders) {
            this.getConversationReferenceFieldBuilder();
            this.getItemsFieldBuilder();
         }
      }

      public GetUploadUrlsRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.conversationReference_ = null;
         if (this.conversationReferenceBuilder_ != null) {
            this.conversationReferenceBuilder_.dispose();
            this.conversationReferenceBuilder_ = null;
         }

         this.usage_ = 0;
         if (this.itemsBuilder_ == null) {
            this.items_ = Collections.emptyList();
         } else {
            this.items_ = null;
            this.itemsBuilder_.clear();
         }

         this.bitField0_ &= -5;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_GetUploadUrlsRequest_descriptor;
      }

      public GetUploadUrlsRequest getDefaultInstanceForType() {
         return GetUploadUrlsRequest.getDefaultInstance();
      }

      public GetUploadUrlsRequest build() {
         GetUploadUrlsRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public GetUploadUrlsRequest buildPartial() {
         GetUploadUrlsRequest var1 = new GetUploadUrlsRequest(this);
         this.buildPartialRepeatedFields(var1);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartialRepeatedFields(GetUploadUrlsRequest var1) {
         if (this.itemsBuilder_ == null) {
            if ((this.bitField0_ & 4) != 0) {
               this.items_ = Collections.unmodifiableList(this.items_);
               this.bitField0_ &= -5;
            }

            var1.items_ = this.items_;
         } else {
            var1.items_ = this.itemsBuilder_.build();
         }
      }

      private void buildPartial0(GetUploadUrlsRequest var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.conversationReference_ = this.conversationReferenceBuilder_ == null ? this.conversationReference_ : this.conversationReferenceBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.usage_ = this.usage_;
         }

         GetUploadUrlsRequest var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public GetUploadUrlsRequest.Builder clone() {
         return (GetUploadUrlsRequest.Builder)super.clone();
      }

      public GetUploadUrlsRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (GetUploadUrlsRequest.Builder)super.setField(var1, var2);
      }

      public GetUploadUrlsRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (GetUploadUrlsRequest.Builder)super.clearField(var1);
      }

      public GetUploadUrlsRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (GetUploadUrlsRequest.Builder)super.clearOneof(var1);
      }

      public GetUploadUrlsRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (GetUploadUrlsRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public GetUploadUrlsRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (GetUploadUrlsRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public GetUploadUrlsRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof GetUploadUrlsRequest) {
            return this.mergeFrom((GetUploadUrlsRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public GetUploadUrlsRequest.Builder mergeFrom(GetUploadUrlsRequest var1) {
         if (var1 == GetUploadUrlsRequest.getDefaultInstance()) {
            return this;
         }

         if (var1.hasConversationReference()) {
            this.mergeConversationReference(var1.getConversationReference());
         }

         if (var1.usage_ != 0) {
            this.setUsageValue(var1.getUsageValue());
         }

         if (this.itemsBuilder_ == null) {
            if (!var1.items_.isEmpty()) {
               if (this.items_.isEmpty()) {
                  this.items_ = var1.items_;
                  this.bitField0_ &= -5;
               } else {
                  this.ensureItemsIsMutable();
                  this.items_.addAll(var1.items_);
               }

               this.onChanged();
            }
         } else if (!var1.items_.isEmpty()) {
            if (this.itemsBuilder_.isEmpty()) {
               this.itemsBuilder_.dispose();
               this.itemsBuilder_ = null;
               this.items_ = var1.items_;
               this.bitField0_ &= -5;
               this.itemsBuilder_ = GetUploadUrlsRequest.alwaysUseFieldBuilders ? this.getItemsFieldBuilder() : null;
            } else {
               this.itemsBuilder_.addAllMessages(var1.items_);
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

      public GetUploadUrlsRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.usage_ = var1.readEnum();
                     this.bitField0_ |= 2;
                     break;
                  case 26:
                     UploadRequestItem var5 = var1.readMessage(UploadRequestItem.parser(), var2);
                     if (this.itemsBuilder_ == null) {
                        this.ensureItemsIsMutable();
                        this.items_.add(var5);
                     } else {
                        this.itemsBuilder_.addMessage(var5);
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

      public GetUploadUrlsRequest.Builder setConversationReference(ConversationReference var1) {
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

      public GetUploadUrlsRequest.Builder setConversationReference(ConversationReference.Builder var1) {
         if (this.conversationReferenceBuilder_ == null) {
            this.conversationReference_ = var1.build();
         } else {
            this.conversationReferenceBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public GetUploadUrlsRequest.Builder mergeConversationReference(ConversationReference var1) {
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

      public GetUploadUrlsRequest.Builder clearConversationReference() {
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
      public int getUsageValue() {
         return this.usage_;
      }

      public GetUploadUrlsRequest.Builder setUsageValue(int var1) {
         this.usage_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      @Override
      public UploadUsage getUsage() {
         UploadUsage var1 = UploadUsage.forNumber(this.usage_);
         return var1 == null ? UploadUsage.UNRECOGNIZED : var1;
      }

      public GetUploadUrlsRequest.Builder setUsage(UploadUsage var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 2;
         this.usage_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public GetUploadUrlsRequest.Builder clearUsage() {
         this.bitField0_ &= -3;
         this.usage_ = 0;
         this.onChanged();
         return this;
      }

      private void ensureItemsIsMutable() {
         if ((this.bitField0_ & 4) == 0) {
            this.items_ = new ArrayList<>(this.items_);
            this.bitField0_ |= 4;
         }
      }

      @Override
      public List<UploadRequestItem> getItemsList() {
         return this.itemsBuilder_ == null ? Collections.unmodifiableList(this.items_) : this.itemsBuilder_.getMessageList();
      }

      @Override
      public int getItemsCount() {
         return this.itemsBuilder_ == null ? this.items_.size() : this.itemsBuilder_.getCount();
      }

      @Override
      public UploadRequestItem getItems(int var1) {
         return this.itemsBuilder_ == null ? this.items_.get(var1) : this.itemsBuilder_.getMessage(var1);
      }

      public GetUploadUrlsRequest.Builder setItems(int var1, UploadRequestItem var2) {
         if (this.itemsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureItemsIsMutable();
            this.items_.set(var1, var2);
            this.onChanged();
         } else {
            this.itemsBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public GetUploadUrlsRequest.Builder setItems(int var1, UploadRequestItem.Builder var2) {
         if (this.itemsBuilder_ == null) {
            this.ensureItemsIsMutable();
            this.items_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.itemsBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public GetUploadUrlsRequest.Builder addItems(UploadRequestItem var1) {
         if (this.itemsBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureItemsIsMutable();
            this.items_.add(var1);
            this.onChanged();
         } else {
            this.itemsBuilder_.addMessage(var1);
         }

         return this;
      }

      public GetUploadUrlsRequest.Builder addItems(int var1, UploadRequestItem var2) {
         if (this.itemsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureItemsIsMutable();
            this.items_.add(var1, var2);
            this.onChanged();
         } else {
            this.itemsBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public GetUploadUrlsRequest.Builder addItems(UploadRequestItem.Builder var1) {
         if (this.itemsBuilder_ == null) {
            this.ensureItemsIsMutable();
            this.items_.add(var1.build());
            this.onChanged();
         } else {
            this.itemsBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public GetUploadUrlsRequest.Builder addItems(int var1, UploadRequestItem.Builder var2) {
         if (this.itemsBuilder_ == null) {
            this.ensureItemsIsMutable();
            this.items_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.itemsBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public GetUploadUrlsRequest.Builder addAllItems(Iterable<? extends UploadRequestItem> var1) {
         if (this.itemsBuilder_ == null) {
            this.ensureItemsIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.items_);
            this.onChanged();
         } else {
            this.itemsBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public GetUploadUrlsRequest.Builder clearItems() {
         if (this.itemsBuilder_ == null) {
            this.items_ = Collections.emptyList();
            this.bitField0_ &= -5;
            this.onChanged();
         } else {
            this.itemsBuilder_.clear();
         }

         return this;
      }

      public GetUploadUrlsRequest.Builder removeItems(int var1) {
         if (this.itemsBuilder_ == null) {
            this.ensureItemsIsMutable();
            this.items_.remove(var1);
            this.onChanged();
         } else {
            this.itemsBuilder_.remove(var1);
         }

         return this;
      }

      public UploadRequestItem.Builder getItemsBuilder(int var1) {
         return this.getItemsFieldBuilder().getBuilder(var1);
      }

      @Override
      public UploadRequestItemOrBuilder getItemsOrBuilder(int var1) {
         return this.itemsBuilder_ == null ? this.items_.get(var1) : this.itemsBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends UploadRequestItemOrBuilder> getItemsOrBuilderList() {
         return this.itemsBuilder_ != null ? this.itemsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.items_);
      }

      public UploadRequestItem.Builder addItemsBuilder() {
         return this.getItemsFieldBuilder().addBuilder(UploadRequestItem.getDefaultInstance());
      }

      public UploadRequestItem.Builder addItemsBuilder(int var1) {
         return this.getItemsFieldBuilder().addBuilder(var1, UploadRequestItem.getDefaultInstance());
      }

      public List<UploadRequestItem.Builder> getItemsBuilderList() {
         return this.getItemsFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<UploadRequestItem, UploadRequestItem.Builder, UploadRequestItemOrBuilder> getItemsFieldBuilder() {
         if (this.itemsBuilder_ == null) {
            this.itemsBuilder_ = new RepeatedFieldBuilderV3<>(this.items_, (this.bitField0_ & 4) != 0, this.getParentForChildren(), this.isClean());
            this.items_ = null;
         }

         return this.itemsBuilder_;
      }

      public final GetUploadUrlsRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (GetUploadUrlsRequest.Builder)super.setUnknownFields(var1);
      }

      public final GetUploadUrlsRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (GetUploadUrlsRequest.Builder)super.mergeUnknownFields(var1);
      }
   }
}
