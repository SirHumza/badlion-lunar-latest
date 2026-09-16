package com.lunarclient.websocket.chat.v1;

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
import com.lunarclient.common.v1.Uuid;
import com.lunarclient.common.v1.UuidOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class SendChatRequest extends GeneratedMessageV3 implements SendChatRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int TARGET_UUID_FIELD_NUMBER = 1;
   private Uuid targetUuid_;
   public static final int CHAT_MESSAGE_FIELD_NUMBER = 2;
   private volatile Object chatMessage_ = "";
   private byte memoizedIsInitialized = -1;
   private static final SendChatRequest DEFAULT_INSTANCE = new SendChatRequest();
   private static final Parser<SendChatRequest> PARSER = new AbstractParser<SendChatRequest>() {
      public SendChatRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         SendChatRequest.Builder var3 = SendChatRequest.newBuilder();

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

   private SendChatRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private SendChatRequest() {
      this.chatMessage_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new SendChatRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_chat_v1_SendChatRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_chat_v1_SendChatRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(SendChatRequest.class, SendChatRequest.Builder.class);
   }

   @Override
   public boolean hasTargetUuid() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public Uuid getTargetUuid() {
      return this.targetUuid_ == null ? Uuid.getDefaultInstance() : this.targetUuid_;
   }

   @Override
   public UuidOrBuilder getTargetUuidOrBuilder() {
      return this.targetUuid_ == null ? Uuid.getDefaultInstance() : this.targetUuid_;
   }

   @Override
   public String getChatMessage() {
      Object var1 = this.chatMessage_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.chatMessage_ = var3;
      return var3;
   }

   @Override
   public ByteString getChatMessageBytes() {
      Object var1 = this.chatMessage_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.chatMessage_ = var2;
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
         var1.writeMessage(1, this.getTargetUuid());
      }

      if (!GeneratedMessageV3.isStringEmpty(this.chatMessage_)) {
         GeneratedMessageV3.writeString(var1, 2, this.chatMessage_);
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
         var1 += CodedOutputStream.computeMessageSize(1, this.getTargetUuid());
      }

      if (!GeneratedMessageV3.isStringEmpty(this.chatMessage_)) {
         var1 += GeneratedMessageV3.computeStringSize(2, this.chatMessage_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof SendChatRequest)) {
         return super.equals(var1);
      } else {
         SendChatRequest var2 = (SendChatRequest)var1;
         if (this.hasTargetUuid() != var2.hasTargetUuid()) {
            return false;
         } else if (this.hasTargetUuid() && !this.getTargetUuid().equals(var2.getTargetUuid())) {
            return false;
         } else {
            return !this.getChatMessage().equals(var2.getChatMessage()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.hasTargetUuid()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getTargetUuid().hashCode();
      }

      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.getChatMessage().hashCode();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static SendChatRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static SendChatRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SendChatRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static SendChatRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SendChatRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static SendChatRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SendChatRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SendChatRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static SendChatRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static SendChatRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static SendChatRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SendChatRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public SendChatRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static SendChatRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static SendChatRequest.Builder newBuilder(SendChatRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public SendChatRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new SendChatRequest.Builder() : new SendChatRequest.Builder().mergeFrom(this);
   }

   protected SendChatRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new SendChatRequest.Builder(var1);
   }

   public static SendChatRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<SendChatRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<SendChatRequest> getParserForType() {
      return PARSER;
   }

   public SendChatRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<SendChatRequest.Builder> implements SendChatRequestOrBuilder {
      private int bitField0_;
      private Uuid targetUuid_;
      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> targetUuidBuilder_;
      private Object chatMessage_ = "";

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_chat_v1_SendChatRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_chat_v1_SendChatRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(SendChatRequest.class, SendChatRequest.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (SendChatRequest.alwaysUseFieldBuilders) {
            this.getTargetUuidFieldBuilder();
         }
      }

      public SendChatRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.targetUuid_ = null;
         if (this.targetUuidBuilder_ != null) {
            this.targetUuidBuilder_.dispose();
            this.targetUuidBuilder_ = null;
         }

         this.chatMessage_ = "";
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_chat_v1_SendChatRequest_descriptor;
      }

      public SendChatRequest getDefaultInstanceForType() {
         return SendChatRequest.getDefaultInstance();
      }

      public SendChatRequest build() {
         SendChatRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public SendChatRequest buildPartial() {
         SendChatRequest var1 = new SendChatRequest(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(SendChatRequest var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.targetUuid_ = this.targetUuidBuilder_ == null ? this.targetUuid_ : this.targetUuidBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.chatMessage_ = this.chatMessage_;
         }

         SendChatRequest var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public SendChatRequest.Builder clone() {
         return (SendChatRequest.Builder)super.clone();
      }

      public SendChatRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (SendChatRequest.Builder)super.setField(var1, var2);
      }

      public SendChatRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (SendChatRequest.Builder)super.clearField(var1);
      }

      public SendChatRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (SendChatRequest.Builder)super.clearOneof(var1);
      }

      public SendChatRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (SendChatRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public SendChatRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (SendChatRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public SendChatRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof SendChatRequest) {
            return this.mergeFrom((SendChatRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public SendChatRequest.Builder mergeFrom(SendChatRequest var1) {
         if (var1 == SendChatRequest.getDefaultInstance()) {
            return this;
         }

         if (var1.hasTargetUuid()) {
            this.mergeTargetUuid(var1.getTargetUuid());
         }

         if (!var1.getChatMessage().isEmpty()) {
            this.chatMessage_ = var1.chatMessage_;
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

      public SendChatRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getTargetUuidFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     this.chatMessage_ = var1.readStringRequireUtf8();
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
      public boolean hasTargetUuid() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public Uuid getTargetUuid() {
         if (this.targetUuidBuilder_ == null) {
            return this.targetUuid_ == null ? Uuid.getDefaultInstance() : this.targetUuid_;
         } else {
            return this.targetUuidBuilder_.getMessage();
         }
      }

      public SendChatRequest.Builder setTargetUuid(Uuid var1) {
         if (this.targetUuidBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.targetUuid_ = var1;
         } else {
            this.targetUuidBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public SendChatRequest.Builder setTargetUuid(Uuid.Builder var1) {
         if (this.targetUuidBuilder_ == null) {
            this.targetUuid_ = var1.build();
         } else {
            this.targetUuidBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public SendChatRequest.Builder mergeTargetUuid(Uuid var1) {
         if (this.targetUuidBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.targetUuid_ != null && this.targetUuid_ != Uuid.getDefaultInstance()) {
               this.getTargetUuidBuilder().mergeFrom(var1);
            } else {
               this.targetUuid_ = var1;
            }
         } else {
            this.targetUuidBuilder_.mergeFrom(var1);
         }

         if (this.targetUuid_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public SendChatRequest.Builder clearTargetUuid() {
         this.bitField0_ &= -2;
         this.targetUuid_ = null;
         if (this.targetUuidBuilder_ != null) {
            this.targetUuidBuilder_.dispose();
            this.targetUuidBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Uuid.Builder getTargetUuidBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getTargetUuidFieldBuilder().getBuilder();
      }

      @Override
      public UuidOrBuilder getTargetUuidOrBuilder() {
         if (this.targetUuidBuilder_ != null) {
            return this.targetUuidBuilder_.getMessageOrBuilder();
         } else {
            return this.targetUuid_ == null ? Uuid.getDefaultInstance() : this.targetUuid_;
         }
      }

      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> getTargetUuidFieldBuilder() {
         if (this.targetUuidBuilder_ == null) {
            this.targetUuidBuilder_ = new SingleFieldBuilderV3<>(this.getTargetUuid(), this.getParentForChildren(), this.isClean());
            this.targetUuid_ = null;
         }

         return this.targetUuidBuilder_;
      }

      @Override
      public String getChatMessage() {
         Object var1 = this.chatMessage_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.chatMessage_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getChatMessageBytes() {
         Object var1 = this.chatMessage_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.chatMessage_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public SendChatRequest.Builder setChatMessage(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.chatMessage_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public SendChatRequest.Builder clearChatMessage() {
         this.chatMessage_ = SendChatRequest.getDefaultInstance().getChatMessage();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      public SendChatRequest.Builder setChatMessageBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         SendChatRequest.checkByteStringIsUtf8(var1);
         this.chatMessage_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public final SendChatRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (SendChatRequest.Builder)super.setUnknownFields(var1);
      }

      public final SendChatRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (SendChatRequest.Builder)super.mergeUnknownFields(var1);
      }
   }
}
