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

public final class GetConversationsResponse extends GeneratedMessageV3 implements GetConversationsResponseOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int STATUS_FIELD_NUMBER = 1;
   private int status_ = 0;
   public static final int CONVERSATIONS_FIELD_NUMBER = 2;
   private List<Conversation> conversations_;
   public static final int TOTAL_CONVERSATIONS_FIELD_NUMBER = 3;
   private int totalConversations_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final GetConversationsResponse DEFAULT_INSTANCE = new GetConversationsResponse();
   private static final Parser<GetConversationsResponse> PARSER = new AbstractParser<GetConversationsResponse>() {
      public GetConversationsResponse parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         GetConversationsResponse.Builder var3 = GetConversationsResponse.newBuilder();

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

   private GetConversationsResponse(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private GetConversationsResponse() {
      this.status_ = 0;
      this.conversations_ = Collections.emptyList();
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new GetConversationsResponse();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_GetConversationsResponse_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_GetConversationsResponse_fieldAccessorTable
         .ensureFieldAccessorsInitialized(GetConversationsResponse.class, GetConversationsResponse.Builder.class);
   }

   @Override
   public int getStatusValue() {
      return this.status_;
   }

   @Override
   public GetConversationsResponse.Status getStatus() {
      GetConversationsResponse.Status var1 = GetConversationsResponse.Status.forNumber(this.status_);
      return var1 == null ? GetConversationsResponse.Status.UNRECOGNIZED : var1;
   }

   @Override
   public List<Conversation> getConversationsList() {
      return this.conversations_;
   }

   @Override
   public List<? extends ConversationOrBuilder> getConversationsOrBuilderList() {
      return this.conversations_;
   }

   @Override
   public int getConversationsCount() {
      return this.conversations_.size();
   }

   @Override
   public Conversation getConversations(int var1) {
      return this.conversations_.get(var1);
   }

   @Override
   public ConversationOrBuilder getConversationsOrBuilder(int var1) {
      return this.conversations_.get(var1);
   }

   @Override
   public int getTotalConversations() {
      return this.totalConversations_;
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
      if (this.status_ != GetConversationsResponse.Status.STATUS_UNSPECIFIED.getNumber()) {
         var1.writeEnum(1, this.status_);
      }

      for (int var2 = 0; var2 < this.conversations_.size(); var2++) {
         var1.writeMessage(2, this.conversations_.get(var2));
      }

      if (this.totalConversations_ != 0) {
         var1.writeInt32(3, this.totalConversations_);
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
      if (this.status_ != GetConversationsResponse.Status.STATUS_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(1, this.status_);
      }

      for (int var2 = 0; var2 < this.conversations_.size(); var2++) {
         var1 += CodedOutputStream.computeMessageSize(2, this.conversations_.get(var2));
      }

      if (this.totalConversations_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(3, this.totalConversations_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof GetConversationsResponse)) {
         return super.equals(var1);
      } else {
         GetConversationsResponse var2 = (GetConversationsResponse)var1;
         if (this.status_ != var2.status_) {
            return false;
         } else if (!this.getConversationsList().equals(var2.getConversationsList())) {
            return false;
         } else {
            return this.getTotalConversations() != var2.getTotalConversations() ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.getConversationsCount() > 0) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getConversationsList().hashCode();
      }

      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + this.getTotalConversations();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static GetConversationsResponse parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static GetConversationsResponse parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static GetConversationsResponse parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static GetConversationsResponse parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static GetConversationsResponse parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static GetConversationsResponse parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static GetConversationsResponse parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static GetConversationsResponse parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static GetConversationsResponse parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static GetConversationsResponse parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static GetConversationsResponse parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static GetConversationsResponse parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public GetConversationsResponse.Builder newBuilderForType() {
      return newBuilder();
   }

   public static GetConversationsResponse.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static GetConversationsResponse.Builder newBuilder(GetConversationsResponse var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public GetConversationsResponse.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new GetConversationsResponse.Builder() : new GetConversationsResponse.Builder().mergeFrom(this);
   }

   protected GetConversationsResponse.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new GetConversationsResponse.Builder(var1);
   }

   public static GetConversationsResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<GetConversationsResponse> parser() {
      return PARSER;
   }

   @Override
   public Parser<GetConversationsResponse> getParserForType() {
      return PARSER;
   }

   public GetConversationsResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<GetConversationsResponse.Builder> implements GetConversationsResponseOrBuilder {
      private int bitField0_;
      private int status_ = 0;
      private List<Conversation> conversations_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<Conversation, Conversation.Builder, ConversationOrBuilder> conversationsBuilder_;
      private int totalConversations_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_GetConversationsResponse_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_GetConversationsResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(GetConversationsResponse.class, GetConversationsResponse.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public GetConversationsResponse.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.status_ = 0;
         if (this.conversationsBuilder_ == null) {
            this.conversations_ = Collections.emptyList();
         } else {
            this.conversations_ = null;
            this.conversationsBuilder_.clear();
         }

         this.bitField0_ &= -3;
         this.totalConversations_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_GetConversationsResponse_descriptor;
      }

      public GetConversationsResponse getDefaultInstanceForType() {
         return GetConversationsResponse.getDefaultInstance();
      }

      public GetConversationsResponse build() {
         GetConversationsResponse var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public GetConversationsResponse buildPartial() {
         GetConversationsResponse var1 = new GetConversationsResponse(this);
         this.buildPartialRepeatedFields(var1);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartialRepeatedFields(GetConversationsResponse var1) {
         if (this.conversationsBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0) {
               this.conversations_ = Collections.unmodifiableList(this.conversations_);
               this.bitField0_ &= -3;
            }

            var1.conversations_ = this.conversations_;
         } else {
            var1.conversations_ = this.conversationsBuilder_.build();
         }
      }

      private void buildPartial0(GetConversationsResponse var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.status_ = this.status_;
         }

         if ((var2 & 4) != 0) {
            var1.totalConversations_ = this.totalConversations_;
         }
      }

      public GetConversationsResponse.Builder clone() {
         return (GetConversationsResponse.Builder)super.clone();
      }

      public GetConversationsResponse.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (GetConversationsResponse.Builder)super.setField(var1, var2);
      }

      public GetConversationsResponse.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (GetConversationsResponse.Builder)super.clearField(var1);
      }

      public GetConversationsResponse.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (GetConversationsResponse.Builder)super.clearOneof(var1);
      }

      public GetConversationsResponse.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (GetConversationsResponse.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public GetConversationsResponse.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (GetConversationsResponse.Builder)super.addRepeatedField(var1, var2);
      }

      public GetConversationsResponse.Builder mergeFrom(Message var1) {
         if (var1 instanceof GetConversationsResponse) {
            return this.mergeFrom((GetConversationsResponse)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public GetConversationsResponse.Builder mergeFrom(GetConversationsResponse var1) {
         if (var1 == GetConversationsResponse.getDefaultInstance()) {
            return this;
         }

         if (var1.status_ != 0) {
            this.setStatusValue(var1.getStatusValue());
         }

         if (this.conversationsBuilder_ == null) {
            if (!var1.conversations_.isEmpty()) {
               if (this.conversations_.isEmpty()) {
                  this.conversations_ = var1.conversations_;
                  this.bitField0_ &= -3;
               } else {
                  this.ensureConversationsIsMutable();
                  this.conversations_.addAll(var1.conversations_);
               }

               this.onChanged();
            }
         } else if (!var1.conversations_.isEmpty()) {
            if (this.conversationsBuilder_.isEmpty()) {
               this.conversationsBuilder_.dispose();
               this.conversationsBuilder_ = null;
               this.conversations_ = var1.conversations_;
               this.bitField0_ &= -3;
               this.conversationsBuilder_ = GetConversationsResponse.alwaysUseFieldBuilders ? this.getConversationsFieldBuilder() : null;
            } else {
               this.conversationsBuilder_.addAllMessages(var1.conversations_);
            }
         }

         if (var1.getTotalConversations() != 0) {
            this.setTotalConversations(var1.getTotalConversations());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public GetConversationsResponse.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     Conversation var5 = var1.readMessage(Conversation.parser(), var2);
                     if (this.conversationsBuilder_ == null) {
                        this.ensureConversationsIsMutable();
                        this.conversations_.add(var5);
                     } else {
                        this.conversationsBuilder_.addMessage(var5);
                     }
                     break;
                  case 24:
                     this.totalConversations_ = var1.readInt32();
                     this.bitField0_ |= 4;
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

      public GetConversationsResponse.Builder setStatusValue(int var1) {
         this.status_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public GetConversationsResponse.Status getStatus() {
         GetConversationsResponse.Status var1 = GetConversationsResponse.Status.forNumber(this.status_);
         return var1 == null ? GetConversationsResponse.Status.UNRECOGNIZED : var1;
      }

      public GetConversationsResponse.Builder setStatus(GetConversationsResponse.Status var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 1;
         this.status_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public GetConversationsResponse.Builder clearStatus() {
         this.bitField0_ &= -2;
         this.status_ = 0;
         this.onChanged();
         return this;
      }

      private void ensureConversationsIsMutable() {
         if ((this.bitField0_ & 2) == 0) {
            this.conversations_ = new ArrayList<>(this.conversations_);
            this.bitField0_ |= 2;
         }
      }

      @Override
      public List<Conversation> getConversationsList() {
         return this.conversationsBuilder_ == null ? Collections.unmodifiableList(this.conversations_) : this.conversationsBuilder_.getMessageList();
      }

      @Override
      public int getConversationsCount() {
         return this.conversationsBuilder_ == null ? this.conversations_.size() : this.conversationsBuilder_.getCount();
      }

      @Override
      public Conversation getConversations(int var1) {
         return this.conversationsBuilder_ == null ? this.conversations_.get(var1) : this.conversationsBuilder_.getMessage(var1);
      }

      public GetConversationsResponse.Builder setConversations(int var1, Conversation var2) {
         if (this.conversationsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureConversationsIsMutable();
            this.conversations_.set(var1, var2);
            this.onChanged();
         } else {
            this.conversationsBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public GetConversationsResponse.Builder setConversations(int var1, Conversation.Builder var2) {
         if (this.conversationsBuilder_ == null) {
            this.ensureConversationsIsMutable();
            this.conversations_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.conversationsBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public GetConversationsResponse.Builder addConversations(Conversation var1) {
         if (this.conversationsBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureConversationsIsMutable();
            this.conversations_.add(var1);
            this.onChanged();
         } else {
            this.conversationsBuilder_.addMessage(var1);
         }

         return this;
      }

      public GetConversationsResponse.Builder addConversations(int var1, Conversation var2) {
         if (this.conversationsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureConversationsIsMutable();
            this.conversations_.add(var1, var2);
            this.onChanged();
         } else {
            this.conversationsBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public GetConversationsResponse.Builder addConversations(Conversation.Builder var1) {
         if (this.conversationsBuilder_ == null) {
            this.ensureConversationsIsMutable();
            this.conversations_.add(var1.build());
            this.onChanged();
         } else {
            this.conversationsBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public GetConversationsResponse.Builder addConversations(int var1, Conversation.Builder var2) {
         if (this.conversationsBuilder_ == null) {
            this.ensureConversationsIsMutable();
            this.conversations_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.conversationsBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public GetConversationsResponse.Builder addAllConversations(Iterable<? extends Conversation> var1) {
         if (this.conversationsBuilder_ == null) {
            this.ensureConversationsIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.conversations_);
            this.onChanged();
         } else {
            this.conversationsBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public GetConversationsResponse.Builder clearConversations() {
         if (this.conversationsBuilder_ == null) {
            this.conversations_ = Collections.emptyList();
            this.bitField0_ &= -3;
            this.onChanged();
         } else {
            this.conversationsBuilder_.clear();
         }

         return this;
      }

      public GetConversationsResponse.Builder removeConversations(int var1) {
         if (this.conversationsBuilder_ == null) {
            this.ensureConversationsIsMutable();
            this.conversations_.remove(var1);
            this.onChanged();
         } else {
            this.conversationsBuilder_.remove(var1);
         }

         return this;
      }

      public Conversation.Builder getConversationsBuilder(int var1) {
         return this.getConversationsFieldBuilder().getBuilder(var1);
      }

      @Override
      public ConversationOrBuilder getConversationsOrBuilder(int var1) {
         return this.conversationsBuilder_ == null ? this.conversations_.get(var1) : this.conversationsBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends ConversationOrBuilder> getConversationsOrBuilderList() {
         return this.conversationsBuilder_ != null ? this.conversationsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.conversations_);
      }

      public Conversation.Builder addConversationsBuilder() {
         return this.getConversationsFieldBuilder().addBuilder(Conversation.getDefaultInstance());
      }

      public Conversation.Builder addConversationsBuilder(int var1) {
         return this.getConversationsFieldBuilder().addBuilder(var1, Conversation.getDefaultInstance());
      }

      public List<Conversation.Builder> getConversationsBuilderList() {
         return this.getConversationsFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<Conversation, Conversation.Builder, ConversationOrBuilder> getConversationsFieldBuilder() {
         if (this.conversationsBuilder_ == null) {
            this.conversationsBuilder_ = new RepeatedFieldBuilderV3<>(
               this.conversations_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean()
            );
            this.conversations_ = null;
         }

         return this.conversationsBuilder_;
      }

      @Override
      public int getTotalConversations() {
         return this.totalConversations_;
      }

      public GetConversationsResponse.Builder setTotalConversations(int var1) {
         this.totalConversations_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public GetConversationsResponse.Builder clearTotalConversations() {
         this.bitField0_ &= -5;
         this.totalConversations_ = 0;
         this.onChanged();
         return this;
      }

      public final GetConversationsResponse.Builder setUnknownFields(UnknownFieldSet var1) {
         return (GetConversationsResponse.Builder)super.setUnknownFields(var1);
      }

      public final GetConversationsResponse.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (GetConversationsResponse.Builder)super.mergeUnknownFields(var1);
      }
   }

   public enum Status implements ProtocolMessageEnum {
      STATUS_UNSPECIFIED(0),
      STATUS_OK(1),
      STATUS_CONVERSATION_NOT_FOUND(2),
      STATUS_NOT_IN_CONVERSATION(3),
      UNRECOGNIZED(-1);

      public static final int STATUS_UNSPECIFIED_VALUE = 0;
      public static final int STATUS_OK_VALUE = 1;
      public static final int STATUS_CONVERSATION_NOT_FOUND_VALUE = 2;
      public static final int STATUS_NOT_IN_CONVERSATION_VALUE = 3;
      private static final Internal.EnumLiteMap<GetConversationsResponse.Status> internalValueMap = new Internal.EnumLiteMap<GetConversationsResponse.Status>() {
         public GetConversationsResponse.Status findValueByNumber(int var1) {
            return GetConversationsResponse.Status.forNumber(var1);
         }
      };
      private static final GetConversationsResponse.Status[] VALUES = values();
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
      public static GetConversationsResponse.Status valueOf(int var0) {
         return forNumber(var0);
      }

      public static GetConversationsResponse.Status forNumber(int var0) {
         switch (var0) {
            case 0:
               return STATUS_UNSPECIFIED;
            case 1:
               return STATUS_OK;
            case 2:
               return STATUS_CONVERSATION_NOT_FOUND;
            case 3:
               return STATUS_NOT_IN_CONVERSATION;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<GetConversationsResponse.Status> internalGetValueMap() {
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
         return GetConversationsResponse.getDescriptor().getEnumTypes().get(0);
      }

      public static GetConversationsResponse.Status valueOf(Descriptors.EnumValueDescriptor var0) {
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
