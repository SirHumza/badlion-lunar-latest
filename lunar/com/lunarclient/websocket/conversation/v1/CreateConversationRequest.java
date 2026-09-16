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
import com.lunarclient.common.v1.Uuid;
import com.lunarclient.common.v1.UuidOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class CreateConversationRequest extends GeneratedMessageV3 implements CreateConversationRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int TYPE_FIELD_NUMBER = 1;
   private int type_ = 0;
   public static final int PARTICIPANT_UUIDS_FIELD_NUMBER = 2;
   private List<Uuid> participantUuids_;
   private byte memoizedIsInitialized = -1;
   private static final CreateConversationRequest DEFAULT_INSTANCE = new CreateConversationRequest();
   private static final Parser<CreateConversationRequest> PARSER = new AbstractParser<CreateConversationRequest>() {
      public CreateConversationRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         CreateConversationRequest.Builder var3 = CreateConversationRequest.newBuilder();

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

   private CreateConversationRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private CreateConversationRequest() {
      this.type_ = 0;
      this.participantUuids_ = Collections.emptyList();
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new CreateConversationRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_CreateConversationRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_CreateConversationRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(CreateConversationRequest.class, CreateConversationRequest.Builder.class);
   }

   @Override
   public int getTypeValue() {
      return this.type_;
   }

   @Override
   public ConversationType getType() {
      ConversationType var1 = ConversationType.forNumber(this.type_);
      return var1 == null ? ConversationType.UNRECOGNIZED : var1;
   }

   @Override
   public List<Uuid> getParticipantUuidsList() {
      return this.participantUuids_;
   }

   @Override
   public List<? extends UuidOrBuilder> getParticipantUuidsOrBuilderList() {
      return this.participantUuids_;
   }

   @Override
   public int getParticipantUuidsCount() {
      return this.participantUuids_.size();
   }

   @Override
   public Uuid getParticipantUuids(int var1) {
      return this.participantUuids_.get(var1);
   }

   @Override
   public UuidOrBuilder getParticipantUuidsOrBuilder(int var1) {
      return this.participantUuids_.get(var1);
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
      if (this.type_ != ConversationType.CONVERSATION_TYPE_UNSPECIFIED.getNumber()) {
         var1.writeEnum(1, this.type_);
      }

      for (int var2 = 0; var2 < this.participantUuids_.size(); var2++) {
         var1.writeMessage(2, this.participantUuids_.get(var2));
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
      if (this.type_ != ConversationType.CONVERSATION_TYPE_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(1, this.type_);
      }

      for (int var2 = 0; var2 < this.participantUuids_.size(); var2++) {
         var1 += CodedOutputStream.computeMessageSize(2, this.participantUuids_.get(var2));
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof CreateConversationRequest)) {
         return super.equals(var1);
      } else {
         CreateConversationRequest var2 = (CreateConversationRequest)var1;
         if (this.type_ != var2.type_) {
            return false;
         } else {
            return !this.getParticipantUuidsList().equals(var2.getParticipantUuidsList()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + this.type_;
      if (this.getParticipantUuidsCount() > 0) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getParticipantUuidsList().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static CreateConversationRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static CreateConversationRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static CreateConversationRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static CreateConversationRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static CreateConversationRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static CreateConversationRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static CreateConversationRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static CreateConversationRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static CreateConversationRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static CreateConversationRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static CreateConversationRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static CreateConversationRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public CreateConversationRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static CreateConversationRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static CreateConversationRequest.Builder newBuilder(CreateConversationRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public CreateConversationRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new CreateConversationRequest.Builder() : new CreateConversationRequest.Builder().mergeFrom(this);
   }

   protected CreateConversationRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new CreateConversationRequest.Builder(var1);
   }

   public static CreateConversationRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<CreateConversationRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<CreateConversationRequest> getParserForType() {
      return PARSER;
   }

   public CreateConversationRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<CreateConversationRequest.Builder> implements CreateConversationRequestOrBuilder {
      private int bitField0_;
      private int type_ = 0;
      private List<Uuid> participantUuids_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> participantUuidsBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_CreateConversationRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_CreateConversationRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(CreateConversationRequest.class, CreateConversationRequest.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public CreateConversationRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.type_ = 0;
         if (this.participantUuidsBuilder_ == null) {
            this.participantUuids_ = Collections.emptyList();
         } else {
            this.participantUuids_ = null;
            this.participantUuidsBuilder_.clear();
         }

         this.bitField0_ &= -3;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_conversation_v1_CreateConversationRequest_descriptor;
      }

      public CreateConversationRequest getDefaultInstanceForType() {
         return CreateConversationRequest.getDefaultInstance();
      }

      public CreateConversationRequest build() {
         CreateConversationRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public CreateConversationRequest buildPartial() {
         CreateConversationRequest var1 = new CreateConversationRequest(this);
         this.buildPartialRepeatedFields(var1);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartialRepeatedFields(CreateConversationRequest var1) {
         if (this.participantUuidsBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0) {
               this.participantUuids_ = Collections.unmodifiableList(this.participantUuids_);
               this.bitField0_ &= -3;
            }

            var1.participantUuids_ = this.participantUuids_;
         } else {
            var1.participantUuids_ = this.participantUuidsBuilder_.build();
         }
      }

      private void buildPartial0(CreateConversationRequest var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.type_ = this.type_;
         }
      }

      public CreateConversationRequest.Builder clone() {
         return (CreateConversationRequest.Builder)super.clone();
      }

      public CreateConversationRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (CreateConversationRequest.Builder)super.setField(var1, var2);
      }

      public CreateConversationRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (CreateConversationRequest.Builder)super.clearField(var1);
      }

      public CreateConversationRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (CreateConversationRequest.Builder)super.clearOneof(var1);
      }

      public CreateConversationRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (CreateConversationRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public CreateConversationRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (CreateConversationRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public CreateConversationRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof CreateConversationRequest) {
            return this.mergeFrom((CreateConversationRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public CreateConversationRequest.Builder mergeFrom(CreateConversationRequest var1) {
         if (var1 == CreateConversationRequest.getDefaultInstance()) {
            return this;
         }

         if (var1.type_ != 0) {
            this.setTypeValue(var1.getTypeValue());
         }

         if (this.participantUuidsBuilder_ == null) {
            if (!var1.participantUuids_.isEmpty()) {
               if (this.participantUuids_.isEmpty()) {
                  this.participantUuids_ = var1.participantUuids_;
                  this.bitField0_ &= -3;
               } else {
                  this.ensureParticipantUuidsIsMutable();
                  this.participantUuids_.addAll(var1.participantUuids_);
               }

               this.onChanged();
            }
         } else if (!var1.participantUuids_.isEmpty()) {
            if (this.participantUuidsBuilder_.isEmpty()) {
               this.participantUuidsBuilder_.dispose();
               this.participantUuidsBuilder_ = null;
               this.participantUuids_ = var1.participantUuids_;
               this.bitField0_ &= -3;
               this.participantUuidsBuilder_ = CreateConversationRequest.alwaysUseFieldBuilders ? this.getParticipantUuidsFieldBuilder() : null;
            } else {
               this.participantUuidsBuilder_.addAllMessages(var1.participantUuids_);
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

      public CreateConversationRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.type_ = var1.readEnum();
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     Uuid var5 = var1.readMessage(Uuid.parser(), var2);
                     if (this.participantUuidsBuilder_ == null) {
                        this.ensureParticipantUuidsIsMutable();
                        this.participantUuids_.add(var5);
                     } else {
                        this.participantUuidsBuilder_.addMessage(var5);
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
      public int getTypeValue() {
         return this.type_;
      }

      public CreateConversationRequest.Builder setTypeValue(int var1) {
         this.type_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public ConversationType getType() {
         ConversationType var1 = ConversationType.forNumber(this.type_);
         return var1 == null ? ConversationType.UNRECOGNIZED : var1;
      }

      public CreateConversationRequest.Builder setType(ConversationType var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 1;
         this.type_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public CreateConversationRequest.Builder clearType() {
         this.bitField0_ &= -2;
         this.type_ = 0;
         this.onChanged();
         return this;
      }

      private void ensureParticipantUuidsIsMutable() {
         if ((this.bitField0_ & 2) == 0) {
            this.participantUuids_ = new ArrayList<>(this.participantUuids_);
            this.bitField0_ |= 2;
         }
      }

      @Override
      public List<Uuid> getParticipantUuidsList() {
         return this.participantUuidsBuilder_ == null ? Collections.unmodifiableList(this.participantUuids_) : this.participantUuidsBuilder_.getMessageList();
      }

      @Override
      public int getParticipantUuidsCount() {
         return this.participantUuidsBuilder_ == null ? this.participantUuids_.size() : this.participantUuidsBuilder_.getCount();
      }

      @Override
      public Uuid getParticipantUuids(int var1) {
         return this.participantUuidsBuilder_ == null ? this.participantUuids_.get(var1) : this.participantUuidsBuilder_.getMessage(var1);
      }

      public CreateConversationRequest.Builder setParticipantUuids(int var1, Uuid var2) {
         if (this.participantUuidsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureParticipantUuidsIsMutable();
            this.participantUuids_.set(var1, var2);
            this.onChanged();
         } else {
            this.participantUuidsBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public CreateConversationRequest.Builder setParticipantUuids(int var1, Uuid.Builder var2) {
         if (this.participantUuidsBuilder_ == null) {
            this.ensureParticipantUuidsIsMutable();
            this.participantUuids_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.participantUuidsBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public CreateConversationRequest.Builder addParticipantUuids(Uuid var1) {
         if (this.participantUuidsBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureParticipantUuidsIsMutable();
            this.participantUuids_.add(var1);
            this.onChanged();
         } else {
            this.participantUuidsBuilder_.addMessage(var1);
         }

         return this;
      }

      public CreateConversationRequest.Builder addParticipantUuids(int var1, Uuid var2) {
         if (this.participantUuidsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureParticipantUuidsIsMutable();
            this.participantUuids_.add(var1, var2);
            this.onChanged();
         } else {
            this.participantUuidsBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public CreateConversationRequest.Builder addParticipantUuids(Uuid.Builder var1) {
         if (this.participantUuidsBuilder_ == null) {
            this.ensureParticipantUuidsIsMutable();
            this.participantUuids_.add(var1.build());
            this.onChanged();
         } else {
            this.participantUuidsBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public CreateConversationRequest.Builder addParticipantUuids(int var1, Uuid.Builder var2) {
         if (this.participantUuidsBuilder_ == null) {
            this.ensureParticipantUuidsIsMutable();
            this.participantUuids_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.participantUuidsBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public CreateConversationRequest.Builder addAllParticipantUuids(Iterable<? extends Uuid> var1) {
         if (this.participantUuidsBuilder_ == null) {
            this.ensureParticipantUuidsIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.participantUuids_);
            this.onChanged();
         } else {
            this.participantUuidsBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public CreateConversationRequest.Builder clearParticipantUuids() {
         if (this.participantUuidsBuilder_ == null) {
            this.participantUuids_ = Collections.emptyList();
            this.bitField0_ &= -3;
            this.onChanged();
         } else {
            this.participantUuidsBuilder_.clear();
         }

         return this;
      }

      public CreateConversationRequest.Builder removeParticipantUuids(int var1) {
         if (this.participantUuidsBuilder_ == null) {
            this.ensureParticipantUuidsIsMutable();
            this.participantUuids_.remove(var1);
            this.onChanged();
         } else {
            this.participantUuidsBuilder_.remove(var1);
         }

         return this;
      }

      public Uuid.Builder getParticipantUuidsBuilder(int var1) {
         return this.getParticipantUuidsFieldBuilder().getBuilder(var1);
      }

      @Override
      public UuidOrBuilder getParticipantUuidsOrBuilder(int var1) {
         return this.participantUuidsBuilder_ == null ? this.participantUuids_.get(var1) : this.participantUuidsBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends UuidOrBuilder> getParticipantUuidsOrBuilderList() {
         return this.participantUuidsBuilder_ != null
            ? this.participantUuidsBuilder_.getMessageOrBuilderList()
            : Collections.unmodifiableList(this.participantUuids_);
      }

      public Uuid.Builder addParticipantUuidsBuilder() {
         return this.getParticipantUuidsFieldBuilder().addBuilder(Uuid.getDefaultInstance());
      }

      public Uuid.Builder addParticipantUuidsBuilder(int var1) {
         return this.getParticipantUuidsFieldBuilder().addBuilder(var1, Uuid.getDefaultInstance());
      }

      public List<Uuid.Builder> getParticipantUuidsBuilderList() {
         return this.getParticipantUuidsFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> getParticipantUuidsFieldBuilder() {
         if (this.participantUuidsBuilder_ == null) {
            this.participantUuidsBuilder_ = new RepeatedFieldBuilderV3<>(
               this.participantUuids_, (this.bitField0_ & 2) != 0, this.getParentForChildren(), this.isClean()
            );
            this.participantUuids_ = null;
         }

         return this.participantUuidsBuilder_;
      }

      public final CreateConversationRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (CreateConversationRequest.Builder)super.setUnknownFields(var1);
      }

      public final CreateConversationRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (CreateConversationRequest.Builder)super.mergeUnknownFields(var1);
      }
   }
}
