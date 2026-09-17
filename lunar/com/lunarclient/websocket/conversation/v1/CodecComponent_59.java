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
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class LoadConversationResponse extends GeneratedMessageV3 implements LoadConversationResponseOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int MESSAGES_FIELD_NUMBER = 1;
   private List<ConversationMessage> messages_;
   private byte memoizedIsInitialized = -1;
   private static final LoadConversationResponse DEFAULT_INSTANCE = new LoadConversationResponse();
   private static final Parser<LoadConversationResponse> PARSER = new AbstractParser<LoadConversationResponse>() {
      public LoadConversationResponse parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         LoadConversationResponse.Builder var3 = LoadConversationResponse.newBuilder();

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

   private LoadConversationResponse(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private LoadConversationResponse() {
      this.messages_ = Collections.emptyList();
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new LoadConversationResponse();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_LoadConversationResponse_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_LoadConversationResponse_fieldAccessorTable
         .ensureFieldAccessorsInitialized(LoadConversationResponse.class, LoadConversationResponse.Builder.class);
   }

   @Override
   public List<ConversationMessage> getMessagesList() {
      return this.messages_;
   }

   @Override
   public List<? extends ConversationMessageOrBuilder> getMessagesOrBuilderList() {
      return this.messages_;
   }

   @Override
   public int getMessagesCount() {
      return this.messages_.size();
   }

   @Override
   public ConversationMessage getMessages(int var1) {
      return this.messages_.get(var1);
   }

   @Override
   public ConversationMessageOrBuilder getMessagesOrBuilder(int var1) {
      return this.messages_.get(var1);
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
      for (int var2 = 0; var2 < this.messages_.size(); var2++) {
         var1.writeMessage(1, this.messages_.get(var2));
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

      for (int var2 = 0; var2 < this.messages_.size(); var2++) {
         var1 += CodedOutputStream.computeMessageSize(1, this.messages_.get(var2));
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      }

      if (!(var1 instanceof LoadConversationResponse)) {
         return super.equals(var1);
      }

      LoadConversationResponse var2 = (LoadConversationResponse)var1;
      return !this.getMessagesList().equals(var2.getMessagesList()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      if (this.getMessagesCount() > 0) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getMessagesList().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static LoadConversationResponse parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static LoadConversationResponse parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LoadConversationResponse parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static LoadConversationResponse parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LoadConversationResponse parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static LoadConversationResponse parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LoadConversationResponse parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static LoadConversationResponse parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static LoadConversationResponse parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static LoadConversationResponse parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static LoadConversationResponse parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static LoadConversationResponse parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public LoadConversationResponse.Builder newBuilderForType() {
      return newBuilder();
   }

   public static LoadConversationResponse.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static LoadConversationResponse.Builder newBuilder(LoadConversationResponse var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public LoadConversationResponse.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new LoadConversationResponse.Builder() : new LoadConversationResponse.Builder().mergeFrom(this);
   }

   protected LoadConversationResponse.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new LoadConversationResponse.Builder(var1);
   }

   public static LoadConversationResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<LoadConversationResponse> parser() {
      return PARSER;
   }

   @Override
   public Parser<LoadConversationResponse> getParserForType() {
      return PARSER;
   }

   public LoadConversationResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<LoadConversationResponse.Builder> implements LoadConversationResponseOrBuilder {
      private int bitField0_;
      private List<ConversationMessage> messages_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<ConversationMessage, ConversationMessage.Builder, ConversationMessageOrBuilder> messagesBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_LoadConversationResponse_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_LoadConversationResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(LoadConversationResponse.class, LoadConversationResponse.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public LoadConversationResponse.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         if (this.messagesBuilder_ == null) {
            this.messages_ = Collections.emptyList();
         } else {
            this.messages_ = null;
            this.messagesBuilder_.clear();
         }

         this.bitField0_ &= -2;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_LoadConversationResponse_descriptor;
      }

      public LoadConversationResponse getDefaultInstanceForType() {
         return LoadConversationResponse.getDefaultInstance();
      }

      public LoadConversationResponse build() {
         LoadConversationResponse var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public LoadConversationResponse buildPartial() {
         LoadConversationResponse var1 = new LoadConversationResponse(this);
         this.buildPartialRepeatedFields(var1);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartialRepeatedFields(LoadConversationResponse var1) {
         if (this.messagesBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0) {
               this.messages_ = Collections.unmodifiableList(this.messages_);
               this.bitField0_ &= -2;
            }

            var1.messages_ = this.messages_;
         } else {
            var1.messages_ = this.messagesBuilder_.build();
         }
      }

      private void buildPartial0(LoadConversationResponse var1) {
         int var2 = this.bitField0_;
      }

      public LoadConversationResponse.Builder clone() {
         return (LoadConversationResponse.Builder)super.clone();
      }

      public LoadConversationResponse.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (LoadConversationResponse.Builder)super.setField(var1, var2);
      }

      public LoadConversationResponse.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (LoadConversationResponse.Builder)super.clearField(var1);
      }

      public LoadConversationResponse.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (LoadConversationResponse.Builder)super.clearOneof(var1);
      }

      public LoadConversationResponse.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (LoadConversationResponse.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public LoadConversationResponse.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (LoadConversationResponse.Builder)super.addRepeatedField(var1, var2);
      }

      public LoadConversationResponse.Builder mergeFrom(Message var1) {
         if (var1 instanceof LoadConversationResponse) {
            return this.mergeFrom((LoadConversationResponse)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public LoadConversationResponse.Builder mergeFrom(LoadConversationResponse var1) {
         if (var1 == LoadConversationResponse.getDefaultInstance()) {
            return this;
         }

         if (this.messagesBuilder_ == null) {
            if (!var1.messages_.isEmpty()) {
               if (this.messages_.isEmpty()) {
                  this.messages_ = var1.messages_;
                  this.bitField0_ &= -2;
               } else {
                  this.ensureMessagesIsMutable();
                  this.messages_.addAll(var1.messages_);
               }

               this.onChanged();
            }
         } else if (!var1.messages_.isEmpty()) {
            if (this.messagesBuilder_.isEmpty()) {
               this.messagesBuilder_.dispose();
               this.messagesBuilder_ = null;
               this.messages_ = var1.messages_;
               this.bitField0_ &= -2;
               this.messagesBuilder_ = LoadConversationResponse.alwaysUseFieldBuilders ? this.getMessagesFieldBuilder() : null;
            } else {
               this.messagesBuilder_.addAllMessages(var1.messages_);
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

      public LoadConversationResponse.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     ConversationMessage var5 = var1.readMessage(ConversationMessage.parser(), var2);
                     if (this.messagesBuilder_ == null) {
                        this.ensureMessagesIsMutable();
                        this.messages_.add(var5);
                     } else {
                        this.messagesBuilder_.addMessage(var5);
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

      private void ensureMessagesIsMutable() {
         if ((this.bitField0_ & 1) == 0) {
            this.messages_ = new ArrayList<>(this.messages_);
            this.bitField0_ |= 1;
         }
      }

      @Override
      public List<ConversationMessage> getMessagesList() {
         return this.messagesBuilder_ == null ? Collections.unmodifiableList(this.messages_) : this.messagesBuilder_.getMessageList();
      }

      @Override
      public int getMessagesCount() {
         return this.messagesBuilder_ == null ? this.messages_.size() : this.messagesBuilder_.getCount();
      }

      @Override
      public ConversationMessage getMessages(int var1) {
         return this.messagesBuilder_ == null ? this.messages_.get(var1) : this.messagesBuilder_.getMessage(var1);
      }

      public LoadConversationResponse.Builder setMessages(int var1, ConversationMessage var2) {
         if (this.messagesBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureMessagesIsMutable();
            this.messages_.set(var1, var2);
            this.onChanged();
         } else {
            this.messagesBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public LoadConversationResponse.Builder setMessages(int var1, ConversationMessage.Builder var2) {
         if (this.messagesBuilder_ == null) {
            this.ensureMessagesIsMutable();
            this.messages_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.messagesBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public LoadConversationResponse.Builder addMessages(ConversationMessage var1) {
         if (this.messagesBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureMessagesIsMutable();
            this.messages_.add(var1);
            this.onChanged();
         } else {
            this.messagesBuilder_.addMessage(var1);
         }

         return this;
      }

      public LoadConversationResponse.Builder addMessages(int var1, ConversationMessage var2) {
         if (this.messagesBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureMessagesIsMutable();
            this.messages_.add(var1, var2);
            this.onChanged();
         } else {
            this.messagesBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public LoadConversationResponse.Builder addMessages(ConversationMessage.Builder var1) {
         if (this.messagesBuilder_ == null) {
            this.ensureMessagesIsMutable();
            this.messages_.add(var1.build());
            this.onChanged();
         } else {
            this.messagesBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public LoadConversationResponse.Builder addMessages(int var1, ConversationMessage.Builder var2) {
         if (this.messagesBuilder_ == null) {
            this.ensureMessagesIsMutable();
            this.messages_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.messagesBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public LoadConversationResponse.Builder addAllMessages(Iterable<? extends ConversationMessage> var1) {
         if (this.messagesBuilder_ == null) {
            this.ensureMessagesIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.messages_);
            this.onChanged();
         } else {
            this.messagesBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public LoadConversationResponse.Builder clearMessages() {
         if (this.messagesBuilder_ == null) {
            this.messages_ = Collections.emptyList();
            this.bitField0_ &= -2;
            this.onChanged();
         } else {
            this.messagesBuilder_.clear();
         }

         return this;
      }

      public LoadConversationResponse.Builder removeMessages(int var1) {
         if (this.messagesBuilder_ == null) {
            this.ensureMessagesIsMutable();
            this.messages_.remove(var1);
            this.onChanged();
         } else {
            this.messagesBuilder_.remove(var1);
         }

         return this;
      }

      public ConversationMessage.Builder getMessagesBuilder(int var1) {
         return this.getMessagesFieldBuilder().getBuilder(var1);
      }

      @Override
      public ConversationMessageOrBuilder getMessagesOrBuilder(int var1) {
         return this.messagesBuilder_ == null ? this.messages_.get(var1) : this.messagesBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends ConversationMessageOrBuilder> getMessagesOrBuilderList() {
         return this.messagesBuilder_ != null ? this.messagesBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.messages_);
      }

      public ConversationMessage.Builder addMessagesBuilder() {
         return this.getMessagesFieldBuilder().addBuilder(ConversationMessage.getDefaultInstance());
      }

      public ConversationMessage.Builder addMessagesBuilder(int var1) {
         return this.getMessagesFieldBuilder().addBuilder(var1, ConversationMessage.getDefaultInstance());
      }

      public List<ConversationMessage.Builder> getMessagesBuilderList() {
         return this.getMessagesFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<ConversationMessage, ConversationMessage.Builder, ConversationMessageOrBuilder> getMessagesFieldBuilder() {
         if (this.messagesBuilder_ == null) {
            this.messagesBuilder_ = new RepeatedFieldBuilderV3<>(this.messages_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean());
            this.messages_ = null;
         }

         return this.messagesBuilder_;
      }

      public final LoadConversationResponse.Builder setUnknownFields(UnknownFieldSet var1) {
         return (LoadConversationResponse.Builder)super.setUnknownFields(var1);
      }

      public final LoadConversationResponse.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (LoadConversationResponse.Builder)super.mergeUnknownFields(var1);
      }
   }
}
