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
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class CreateConversationResponse extends GeneratedMessageV3 implements CreateConversationResponseOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int STATUS_FIELD_NUMBER = 1;
   private int status_ = 0;
   public static final int CONVERSATION_FIELD_NUMBER = 2;
   private Conversation conversation_;
   private byte memoizedIsInitialized = -1;
   private static final CreateConversationResponse DEFAULT_INSTANCE = new CreateConversationResponse();
   private static final Parser<CreateConversationResponse> PARSER = new AbstractParser<CreateConversationResponse>() {
      public CreateConversationResponse parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         CreateConversationResponse.Builder var3 = CreateConversationResponse.newBuilder();

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

   private CreateConversationResponse(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private CreateConversationResponse() {
      this.status_ = 0;
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new CreateConversationResponse();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_CreateConversationResponse_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_CreateConversationResponse_fieldAccessorTable
         .ensureFieldAccessorsInitialized(CreateConversationResponse.class, CreateConversationResponse.Builder.class);
   }

   @Override
   public int getStatusValue() {
      return this.status_;
   }

   @Override
   public CreateConversationResponse.Status getStatus() {
      CreateConversationResponse.Status var1 = CreateConversationResponse.Status.forNumber(this.status_);
      return var1 == null ? CreateConversationResponse.Status.UNRECOGNIZED : var1;
   }

   @Override
   public boolean hasConversation() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public Conversation getConversation() {
      return this.conversation_ == null ? Conversation.getDefaultInstance() : this.conversation_;
   }

   @Override
   public ConversationOrBuilder getConversationOrBuilder() {
      return this.conversation_ == null ? Conversation.getDefaultInstance() : this.conversation_;
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
      if (this.status_ != CreateConversationResponse.Status.STATUS_UNSPECIFIED.getNumber()) {
         var1.writeEnum(1, this.status_);
      }

      if ((this.bitField0_ & 1) != 0) {
         var1.writeMessage(2, this.getConversation());
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
      if (this.status_ != CreateConversationResponse.Status.STATUS_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(1, this.status_);
      }

      if ((this.bitField0_ & 1) != 0) {
         var1 += CodedOutputStream.computeMessageSize(2, this.getConversation());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof CreateConversationResponse)) {
         return super.equals(var1);
      } else {
         CreateConversationResponse var2 = (CreateConversationResponse)var1;
         if (this.status_ != var2.status_) {
            return false;
         } else if (this.hasConversation() != var2.hasConversation()) {
            return false;
         } else {
            return this.hasConversation() && !this.getConversation().equals(var2.getConversation())
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
      var1 = 37 * var1 + 1;
      var1 = 53 * var1 + this.status_;
      if (this.hasConversation()) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getConversation().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static CreateConversationResponse parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static CreateConversationResponse parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static CreateConversationResponse parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static CreateConversationResponse parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static CreateConversationResponse parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static CreateConversationResponse parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static CreateConversationResponse parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static CreateConversationResponse parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static CreateConversationResponse parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static CreateConversationResponse parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static CreateConversationResponse parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static CreateConversationResponse parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public CreateConversationResponse.Builder newBuilderForType() {
      return newBuilder();
   }

   public static CreateConversationResponse.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static CreateConversationResponse.Builder newBuilder(CreateConversationResponse var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public CreateConversationResponse.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new CreateConversationResponse.Builder() : new CreateConversationResponse.Builder().mergeFrom(this);
   }

   protected CreateConversationResponse.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new CreateConversationResponse.Builder(var1);
   }

   public static CreateConversationResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<CreateConversationResponse> parser() {
      return PARSER;
   }

   @Override
   public Parser<CreateConversationResponse> getParserForType() {
      return PARSER;
   }

   public CreateConversationResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<CreateConversationResponse.Builder> implements CreateConversationResponseOrBuilder {
      private int bitField0_;
      private int status_ = 0;
      private Conversation conversation_;
      private SingleFieldBuilderV3<Conversation, Conversation.Builder, ConversationOrBuilder> conversationBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_CreateConversationResponse_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_CreateConversationResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(CreateConversationResponse.class, CreateConversationResponse.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (CreateConversationResponse.alwaysUseFieldBuilders) {
            this.getConversationFieldBuilder();
         }
      }

      public CreateConversationResponse.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.status_ = 0;
         this.conversation_ = null;
         if (this.conversationBuilder_ != null) {
            this.conversationBuilder_.dispose();
            this.conversationBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_CreateConversationResponse_descriptor;
      }

      public CreateConversationResponse getDefaultInstanceForType() {
         return CreateConversationResponse.getDefaultInstance();
      }

      public CreateConversationResponse build() {
         CreateConversationResponse var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public CreateConversationResponse buildPartial() {
         CreateConversationResponse var1 = new CreateConversationResponse(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(CreateConversationResponse var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.status_ = this.status_;
         }

         byte var3 = 0;
         if ((var2 & 2) != 0) {
            var1.conversation_ = this.conversationBuilder_ == null ? this.conversation_ : this.conversationBuilder_.build();
            var3 |= 1;
         }

         CreateConversationResponse var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public CreateConversationResponse.Builder clone() {
         return (CreateConversationResponse.Builder)super.clone();
      }

      public CreateConversationResponse.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (CreateConversationResponse.Builder)super.setField(var1, var2);
      }

      public CreateConversationResponse.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (CreateConversationResponse.Builder)super.clearField(var1);
      }

      public CreateConversationResponse.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (CreateConversationResponse.Builder)super.clearOneof(var1);
      }

      public CreateConversationResponse.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (CreateConversationResponse.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public CreateConversationResponse.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (CreateConversationResponse.Builder)super.addRepeatedField(var1, var2);
      }

      public CreateConversationResponse.Builder mergeFrom(Message var1) {
         if (var1 instanceof CreateConversationResponse) {
            return this.mergeFrom((CreateConversationResponse)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public CreateConversationResponse.Builder mergeFrom(CreateConversationResponse var1) {
         if (var1 == CreateConversationResponse.getDefaultInstance()) {
            return this;
         }

         if (var1.status_ != 0) {
            this.setStatusValue(var1.getStatusValue());
         }

         if (var1.hasConversation()) {
            this.mergeConversation(var1.getConversation());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public CreateConversationResponse.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getConversationFieldBuilder().getBuilder(), var2);
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
      public int getStatusValue() {
         return this.status_;
      }

      public CreateConversationResponse.Builder setStatusValue(int var1) {
         this.status_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public CreateConversationResponse.Status getStatus() {
         CreateConversationResponse.Status var1 = CreateConversationResponse.Status.forNumber(this.status_);
         return var1 == null ? CreateConversationResponse.Status.UNRECOGNIZED : var1;
      }

      public CreateConversationResponse.Builder setStatus(CreateConversationResponse.Status var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 1;
         this.status_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public CreateConversationResponse.Builder clearStatus() {
         this.bitField0_ &= -2;
         this.status_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasConversation() {
         return (this.bitField0_ & 2) != 0;
      }

      @Override
      public Conversation getConversation() {
         if (this.conversationBuilder_ == null) {
            return this.conversation_ == null ? Conversation.getDefaultInstance() : this.conversation_;
         } else {
            return this.conversationBuilder_.getMessage();
         }
      }

      public CreateConversationResponse.Builder setConversation(Conversation var1) {
         if (this.conversationBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.conversation_ = var1;
         } else {
            this.conversationBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public CreateConversationResponse.Builder setConversation(Conversation.Builder var1) {
         if (this.conversationBuilder_ == null) {
            this.conversation_ = var1.build();
         } else {
            this.conversationBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public CreateConversationResponse.Builder mergeConversation(Conversation var1) {
         if (this.conversationBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0 && this.conversation_ != null && this.conversation_ != Conversation.getDefaultInstance()) {
               this.getConversationBuilder().mergeFrom(var1);
            } else {
               this.conversation_ = var1;
            }
         } else {
            this.conversationBuilder_.mergeFrom(var1);
         }

         if (this.conversation_ != null) {
            this.bitField0_ |= 2;
            this.onChanged();
         }

         return this;
      }

      public CreateConversationResponse.Builder clearConversation() {
         this.bitField0_ &= -3;
         this.conversation_ = null;
         if (this.conversationBuilder_ != null) {
            this.conversationBuilder_.dispose();
            this.conversationBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Conversation.Builder getConversationBuilder() {
         this.bitField0_ |= 2;
         this.onChanged();
         return this.getConversationFieldBuilder().getBuilder();
      }

      @Override
      public ConversationOrBuilder getConversationOrBuilder() {
         if (this.conversationBuilder_ != null) {
            return this.conversationBuilder_.getMessageOrBuilder();
         } else {
            return this.conversation_ == null ? Conversation.getDefaultInstance() : this.conversation_;
         }
      }

      private SingleFieldBuilderV3<Conversation, Conversation.Builder, ConversationOrBuilder> getConversationFieldBuilder() {
         if (this.conversationBuilder_ == null) {
            this.conversationBuilder_ = new SingleFieldBuilderV3<>(this.getConversation(), this.getParentForChildren(), this.isClean());
            this.conversation_ = null;
         }

         return this.conversationBuilder_;
      }

      public final CreateConversationResponse.Builder setUnknownFields(UnknownFieldSet var1) {
         return (CreateConversationResponse.Builder)super.setUnknownFields(var1);
      }

      public final CreateConversationResponse.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (CreateConversationResponse.Builder)super.mergeUnknownFields(var1);
      }
   }

   public enum Status implements ProtocolMessageEnum {
      STATUS_UNSPECIFIED(0),
      STATUS_OK(1),
      STATUS_LIMIT_REACHED(2),
      STATUS_INVALID_PARTICIPANTS(3),
      STATUS_CONVERSATION_ALREADY_EXISTS(4),
      UNRECOGNIZED(-1);

      public static final int STATUS_UNSPECIFIED_VALUE = 0;
      public static final int STATUS_OK_VALUE = 1;
      public static final int STATUS_LIMIT_REACHED_VALUE = 2;
      public static final int STATUS_INVALID_PARTICIPANTS_VALUE = 3;
      public static final int STATUS_CONVERSATION_ALREADY_EXISTS_VALUE = 4;
      private static final Internal.EnumLiteMap<CreateConversationResponse.Status> internalValueMap = new Internal.EnumLiteMap<CreateConversationResponse.Status>() {
         public CreateConversationResponse.Status findValueByNumber(int var1) {
            return CreateConversationResponse.Status.forNumber(var1);
         }
      };
      private static final CreateConversationResponse.Status[] VALUES = values();
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
      public static CreateConversationResponse.Status valueOf(int var0) {
         return forNumber(var0);
      }

      public static CreateConversationResponse.Status forNumber(int var0) {
         switch (var0) {
            case 0:
               return STATUS_UNSPECIFIED;
            case 1:
               return STATUS_OK;
            case 2:
               return STATUS_LIMIT_REACHED;
            case 3:
               return STATUS_INVALID_PARTICIPANTS;
            case 4:
               return STATUS_CONVERSATION_ALREADY_EXISTS;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<CreateConversationResponse.Status> internalGetValueMap() {
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
         return CreateConversationResponse.getDescriptor().getEnumTypes().get(0);
      }

      public static CreateConversationResponse.Status valueOf(Descriptors.EnumValueDescriptor var0) {
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
