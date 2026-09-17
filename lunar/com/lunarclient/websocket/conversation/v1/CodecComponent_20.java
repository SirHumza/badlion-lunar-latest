package com.lunarclient.websocket.conversation.v1;

import com.google.protobuf.AbstractMessageLite;
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
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class LoadPinnedMessagesResponse extends GeneratedMessageV3 implements LoadPinnedMessagesResponseOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int STATUS_FIELD_NUMBER = 1;
   private int status_ = 0;
   public static final int MESSAGES_FIELD_NUMBER = 2;
   private List<ConversationMessage> messages_;
   private byte memoizedIsInitialized = -1;
   private static final LoadPinnedMessagesResponse DEFAULT_INSTANCE = new LoadPinnedMessagesResponse();
   private static final Parser<LoadPinnedMessagesResponse> PARSER = new AbstractParser<LoadPinnedMessagesResponse>() {
      public LoadPinnedMessagesResponse parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         LoadPinnedMessagesResponse.Builder var3 = LoadPinnedMessagesResponse.newBuilder();

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

   private LoadPinnedMessagesResponse(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private LoadPinnedMessagesResponse() {
      this.status_ = 0;
      this.messages_ = Collections.emptyList();
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new LoadPinnedMessagesResponse();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_LoadPinnedMessagesResponse_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_LoadPinnedMessagesResponse_fieldAccessorTable
         .ensureFieldAccessorsInitialized(LoadPinnedMessagesResponse.class, LoadPinnedMessagesResponse.Builder.class);
   }

   @Override
   public int getStatusValue() {
      return this.status_;
   }

   @Override
   public LoadPinnedMessagesResponse.Status getStatus() {
      LoadPinnedMessagesResponse.Status var1 = LoadPinnedMessagesResponse.Status.forNumber(this.status_);
      return var1 == null ? LoadPinnedMessagesResponse.Status.UNRECOGNIZED : var1;
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
      if (this.status_ != LoadPinnedMessagesResponse.Status.STATUS_UNSPECIFIED.getNumber()) {
         var1.writeEnum(1, this.status_);
      }

      for (int var2 = 0; var2 < this.messages_.size(); var2++) {
         var1.writeMessage(2, this.messages_.get(var2));
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
      if (this.status_ != LoadPinnedMessagesResponse.Status.STATUS_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(1, this.status_);
      }

      for (int var2 = 0; var2 < this.messages_.size(); var2++) {
         var1 += CodedOutputStream.computeMessageSize(2, this.messages_.get(var2));
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof LoadPinnedMessagesResponse)) {
         return super.equals(var1);
      } else {
         LoadPinnedMessagesResponse var2 = (LoadPinnedMessagesResponse)var1;
         if (this.status_ != var2.status_) {
            return false;
         } else {
            return !this.getMessagesList().equals(var2.getMessagesList()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 37 * var1 + 1;
      var1 = 53 * var1 + this.status_;
      if (this.getMessagesCount() > 0) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getMessagesList().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static LoadPinnedMessagesResponse parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static LoadPinnedMessagesResponse parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LoadPinnedMessagesResponse parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static LoadPinnedMessagesResponse parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LoadPinnedMessagesResponse parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static LoadPinnedMessagesResponse parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LoadPinnedMessagesResponse parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static LoadPinnedMessagesResponse parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static LoadPinnedMessagesResponse parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static LoadPinnedMessagesResponse parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static LoadPinnedMessagesResponse parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static LoadPinnedMessagesResponse parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public LoadPinnedMessagesResponse.Builder newBuilderForType() {
      return newBuilder();
   }

   public static LoadPinnedMessagesResponse.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static LoadPinnedMessagesResponse.Builder newBuilder(LoadPinnedMessagesResponse var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public LoadPinnedMessagesResponse.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new LoadPinnedMessagesResponse.Builder() : new LoadPinnedMessagesResponse.Builder().mergeFrom(this);
   }

   protected LoadPinnedMessagesResponse.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new LoadPinnedMessagesResponse.Builder(var1);
   }

   public static LoadPinnedMessagesResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<LoadPinnedMessagesResponse> parser() {
      return PARSER;
   }

   @Override
   public Parser<LoadPinnedMessagesResponse> getParserForType() {
      return PARSER;
   }

   public LoadPinnedMessagesResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<LoadPinnedMessagesResponse.Builder> implements LoadPinnedMessagesResponseOrBuilder {
      private int bitField0_;
      private int status_ = 0;
      private List<ConversationMessage> messages_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<ConversationMessage, ConversationMessage.Builder, ConversationMessageOrBuilder> messagesBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_LoadPinnedMessagesResponse_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_LoadPinnedMessagesResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(LoadPinnedMessagesResponse.class, LoadPinnedMessagesResponse.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public LoadPinnedMessagesResponse.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.status_ = 0;
         if (this.messagesBuilder_ == null) {
            this.messages_ = Collections.emptyList();
         } else {
            this.messages_ = null;
            this.messagesBuilder_.clear();
         }

         this.bitField0_ &= -3;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_LoadPinnedMessagesResponse_descriptor;
      }

      public LoadPinnedMessagesResponse getDefaultInstanceForType() {
         return LoadPinnedMessagesResponse.getDefaultInstance();
      }

      public LoadPinnedMessagesResponse build() {
         LoadPinnedMessagesResponse var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public LoadPinnedMessagesResponse buildPartial() {
         LoadPinnedMessagesResponse var1 = new LoadPinnedMessagesResponse(this);
         this.buildPartialRepeatedFields(var1);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartialRepeatedFields(LoadPinnedMessagesResponse var1) {
         if (this.messagesBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0) {
               this.messages_ = Collections.unmodifiableList(this.messages_);
               this.bitField0_ &= -3;
            }

            var1.messages_ = this.messages_;
         } else {
            var1.messages_ = this.messagesBuilder_.build();
         }
      }

      private void buildPartial0(LoadPinnedMessagesResponse var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.status_ = this.status_;
         }
      }

      public LoadPinnedMessagesResponse.Builder clone() {
         return (LoadPinnedMessagesResponse.Builder)super.clone();
      }

      public LoadPinnedMessagesResponse.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (LoadPinnedMessagesResponse.Builder)super.setField(var1, var2);
      }

      public LoadPinnedMessagesResponse.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (LoadPinnedMessagesResponse.Builder)super.clearField(var1);
      }

      public LoadPinnedMessagesResponse.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (LoadPinnedMessagesResponse.Builder)super.clearOneof(var1);
      }

      public LoadPinnedMessagesResponse.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (LoadPinnedMessagesResponse.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public LoadPinnedMessagesResponse.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (LoadPinnedMessagesResponse.Builder)super.addRepeatedField(var1, var2);
      }

      public LoadPinnedMessagesResponse.Builder mergeFrom(Message var1) {
         if (var1 instanceof LoadPinnedMessagesResponse) {
            return this.mergeFrom((LoadPinnedMessagesResponse)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public LoadPinnedMessagesResponse.Builder mergeFrom(LoadPinnedMessagesResponse var1) {
         if (var1 == LoadPinnedMessagesResponse.getDefaultInstance()) {
            return this;
         }

         if (var1.status_ != 0) {
            this.setStatusValue(var1.getStatusValue());
         }

         if (this.messagesBuilder_ == null) {
            if (!var1.messages_.isEmpty()) {
               if (this.messages_.isEmpty()) {
                  this.messages_ = var1.messages_;
                  this.bitField0_ &= -3;
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
               this.bitField0_ &= -3;
               this.messagesBuilder_ = LoadPinnedMessagesResponse.alwaysUseFieldBuilders ? this.getMessagesFieldBuilder() : null;
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

      public LoadPinnedMessagesResponse.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.status_ = var1.readEnum();
                     this.bitField0_ |= 1;
                     break;
                  case 18:
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

      @Override
      public int getStatusValue() {
         return this.status_;
      }

      public LoadPinnedMessagesResponse.Builder setStatusValue(int var1) {
         this.status_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public LoadPinnedMessagesResponse.Status getStatus() {
         LoadPinnedMessagesResponse.Status var1 = LoadPinnedMessagesResponse.Status.forNumber(this.status_);
         return var1 == null ? LoadPinnedMessagesResponse.Status.UNRECOGNIZED : var1;
      }

      public LoadPinnedMessagesResponse.Builder setStatus(LoadPinnedMessagesResponse.Status var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 1;
         this.status_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public LoadPinnedMessagesResponse.Builder clearStatus() {
         this.bitField0_ &= -2;
         this.status_ = 0;
         this.onChanged();
         return this;
      }

      private void ensureMessagesIsMutable() {
         if ((this.bitField0_ & 2) == 0) {
            this.messages_ = new ArrayList<>(this.messages_);
            this.bitField0_ |= 2;
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

      public LoadPinnedMessagesResponse.Builder setMessages(int var1, ConversationMessage var2) {
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

      public LoadPinnedMessagesResponse.Builder setMessages(int var1, ConversationMessage.Builder var2) {
         if (this.messagesBuilder_ == null) {
            this.ensureMessagesIsMutable();
            this.messages_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.messagesBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public LoadPinnedMessagesResponse.Builder addMessages(ConversationMessage var1) {
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

      public LoadPinnedMessagesResponse.Builder addMessages(int var1, ConversationMessage var2) {
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

      public LoadPinnedMessagesResponse.Builder addMessages(ConversationMessage.Builder var1) {
         if (this.messagesBuilder_ == null) {
            this.ensureMessagesIsMutable();
            this.messages_.add(var1.build());
            this.onChanged();
         } else {
            this.messagesBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public LoadPinnedMessagesResponse.Builder addMessages(int var1, ConversationMessage.Builder var2) {
         if (this.messagesBuilder_ == null) {
            this.ensureMessagesIsMutable();
            this.messages_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.messagesBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public LoadPinnedMessagesResponse.Builder addAllMessages(Iterable<? extends ConversationMessage> var1) {
         if (this.messagesBuilder_ == null) {
            this.ensureMessagesIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.messages_);
            this.onChanged();
         } else {
            this.messagesBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public LoadPinnedMessagesResponse.Builder clearMessages() {
         if (this.messagesBuilder_ == null) {
            this.messages_ = Collections.emptyList();
            this.bitField0_ &= -3;
            this.onChanged();
         } else {
            this.messagesBuilder_.clear();
         }

         return this;
      }

      public LoadPinnedMessagesResponse.Builder removeMessages(int var1) {
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
            this.messagesBuilder_ = new RepeatedFieldBuilderV3<>(this.messages_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean());
            this.messages_ = null;
         }

         return this.messagesBuilder_;
      }

      public final LoadPinnedMessagesResponse.Builder setUnknownFields(UnknownFieldSet var1) {
         return (LoadPinnedMessagesResponse.Builder)super.setUnknownFields(var1);
      }

      public final LoadPinnedMessagesResponse.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (LoadPinnedMessagesResponse.Builder)super.mergeUnknownFields(var1);
      }
   }

   public enum Status implements ProtocolMessageEnum {
      STATUS_UNSPECIFIED(0),
      STATUS_OK(1),
      STATUS_NOT_IN_CONVERSATION(2),
      UNRECOGNIZED(-1);

      public static final int STATUS_UNSPECIFIED_VALUE = 0;
      public static final int STATUS_OK_VALUE = 1;
      public static final int STATUS_NOT_IN_CONVERSATION_VALUE = 2;
      private static final Internal.EnumLiteMap<LoadPinnedMessagesResponse.Status> internalValueMap = new Internal.EnumLiteMap<LoadPinnedMessagesResponse.Status>() {
         public LoadPinnedMessagesResponse.Status findValueByNumber(int var1) {
            return LoadPinnedMessagesResponse.Status.forNumber(var1);
         }
      };
      private static final LoadPinnedMessagesResponse.Status[] VALUES = values();
      private final int value;

      @Override
      public final int getNumber() {
         if (this == UNRECOGNIZED) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
         } else {
            return this.value;
         }
      }

      @Deprecated
      public static LoadPinnedMessagesResponse.Status valueOf(int var0) {
         return forNumber(var0);
      }

      public static LoadPinnedMessagesResponse.Status forNumber(int var0) {
         switch (var0) {
            case 0:
               return STATUS_UNSPECIFIED;
            case 1:
               return STATUS_OK;
            case 2:
               return STATUS_NOT_IN_CONVERSATION;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<LoadPinnedMessagesResponse.Status> internalGetValueMap() {
         return internalValueMap;
      }

      @Override
      public final Descriptors.EnumValueDescriptor getValueDescriptor() {
         if (this == UNRECOGNIZED) {
            throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
         } else {
            return getDescriptor().getValues().get(this.ordinal());
         }
      }

      @Override
      public final Descriptors.EnumDescriptor getDescriptorForType() {
         return getDescriptor();
      }

      public static final Descriptors.EnumDescriptor getDescriptor() {
         return LoadPinnedMessagesResponse.getDescriptor().getEnumTypes().get(0);
      }

      public static LoadPinnedMessagesResponse.Status valueOf(Descriptors.EnumValueDescriptor var0) {
         if (var0.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
         }
      }

      Status(int var3) {
         this.value = var3;
      }
   }
}
