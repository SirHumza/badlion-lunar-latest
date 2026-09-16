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

public final class ReceiveChatPush extends GeneratedMessageV3 implements ReceiveChatPushOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int SENDER_UUID_FIELD_NUMBER = 1;
   private Uuid senderUuid_;
   public static final int CHAT_MESSAGE_FIELD_NUMBER = 2;
   private volatile Object chatMessage_ = "";
   private byte memoizedIsInitialized = -1;
   private static final ReceiveChatPush DEFAULT_INSTANCE = new ReceiveChatPush();
   private static final Parser<ReceiveChatPush> PARSER = new AbstractParser<ReceiveChatPush>() {
      public ReceiveChatPush parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         ReceiveChatPush.Builder var3 = ReceiveChatPush.newBuilder();

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

   private ReceiveChatPush(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private ReceiveChatPush() {
      this.chatMessage_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new ReceiveChatPush();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return PushProto.internal_static_lunarclient_websocket_chat_v1_ReceiveChatPush_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return PushProto.internal_static_lunarclient_websocket_chat_v1_ReceiveChatPush_fieldAccessorTable
         .ensureFieldAccessorsInitialized(ReceiveChatPush.class, ReceiveChatPush.Builder.class);
   }

   @Override
   public boolean hasSenderUuid() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public Uuid getSenderUuid() {
      return this.senderUuid_ == null ? Uuid.getDefaultInstance() : this.senderUuid_;
   }

   @Override
   public UuidOrBuilder getSenderUuidOrBuilder() {
      return this.senderUuid_ == null ? Uuid.getDefaultInstance() : this.senderUuid_;
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
         var1.writeMessage(1, this.getSenderUuid());
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
         var1 += CodedOutputStream.computeMessageSize(1, this.getSenderUuid());
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
      } else if (!(var1 instanceof ReceiveChatPush)) {
         return super.equals(var1);
      } else {
         ReceiveChatPush var2 = (ReceiveChatPush)var1;
         if (this.hasSenderUuid() != var2.hasSenderUuid()) {
            return false;
         } else if (this.hasSenderUuid() && !this.getSenderUuid().equals(var2.getSenderUuid())) {
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
      if (this.hasSenderUuid()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getSenderUuid().hashCode();
      }

      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.getChatMessage().hashCode();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static ReceiveChatPush parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static ReceiveChatPush parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ReceiveChatPush parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static ReceiveChatPush parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ReceiveChatPush parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static ReceiveChatPush parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ReceiveChatPush parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ReceiveChatPush parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ReceiveChatPush parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ReceiveChatPush parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ReceiveChatPush parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ReceiveChatPush parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public ReceiveChatPush.Builder newBuilderForType() {
      return newBuilder();
   }

   public static ReceiveChatPush.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ReceiveChatPush.Builder newBuilder(ReceiveChatPush var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public ReceiveChatPush.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new ReceiveChatPush.Builder() : new ReceiveChatPush.Builder().mergeFrom(this);
   }

   protected ReceiveChatPush.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new ReceiveChatPush.Builder(var1);
   }

   public static ReceiveChatPush getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<ReceiveChatPush> parser() {
      return PARSER;
   }

   @Override
   public Parser<ReceiveChatPush> getParserForType() {
      return PARSER;
   }

   public ReceiveChatPush getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<ReceiveChatPush.Builder> implements ReceiveChatPushOrBuilder {
      private int bitField0_;
      private Uuid senderUuid_;
      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> senderUuidBuilder_;
      private Object chatMessage_ = "";

      public static final Descriptors.Descriptor getDescriptor() {
         return PushProto.internal_static_lunarclient_websocket_chat_v1_ReceiveChatPush_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PushProto.internal_static_lunarclient_websocket_chat_v1_ReceiveChatPush_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ReceiveChatPush.class, ReceiveChatPush.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (ReceiveChatPush.alwaysUseFieldBuilders) {
            this.getSenderUuidFieldBuilder();
         }
      }

      public ReceiveChatPush.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.senderUuid_ = null;
         if (this.senderUuidBuilder_ != null) {
            this.senderUuidBuilder_.dispose();
            this.senderUuidBuilder_ = null;
         }

         this.chatMessage_ = "";
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return PushProto.internal_static_lunarclient_websocket_chat_v1_ReceiveChatPush_descriptor;
      }

      public ReceiveChatPush getDefaultInstanceForType() {
         return ReceiveChatPush.getDefaultInstance();
      }

      public ReceiveChatPush build() {
         ReceiveChatPush var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public ReceiveChatPush buildPartial() {
         ReceiveChatPush var1 = new ReceiveChatPush(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(ReceiveChatPush var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.senderUuid_ = this.senderUuidBuilder_ == null ? this.senderUuid_ : this.senderUuidBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.chatMessage_ = this.chatMessage_;
         }

         ReceiveChatPush var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public ReceiveChatPush.Builder clone() {
         return (ReceiveChatPush.Builder)super.clone();
      }

      public ReceiveChatPush.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ReceiveChatPush.Builder)super.setField(var1, var2);
      }

      public ReceiveChatPush.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (ReceiveChatPush.Builder)super.clearField(var1);
      }

      public ReceiveChatPush.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (ReceiveChatPush.Builder)super.clearOneof(var1);
      }

      public ReceiveChatPush.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (ReceiveChatPush.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public ReceiveChatPush.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ReceiveChatPush.Builder)super.addRepeatedField(var1, var2);
      }

      public ReceiveChatPush.Builder mergeFrom(Message var1) {
         if (var1 instanceof ReceiveChatPush) {
            return this.mergeFrom((ReceiveChatPush)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public ReceiveChatPush.Builder mergeFrom(ReceiveChatPush var1) {
         if (var1 == ReceiveChatPush.getDefaultInstance()) {
            return this;
         }

         if (var1.hasSenderUuid()) {
            this.mergeSenderUuid(var1.getSenderUuid());
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

      public ReceiveChatPush.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getSenderUuidFieldBuilder().getBuilder(), var2);
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
      public boolean hasSenderUuid() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public Uuid getSenderUuid() {
         if (this.senderUuidBuilder_ == null) {
            return this.senderUuid_ == null ? Uuid.getDefaultInstance() : this.senderUuid_;
         } else {
            return this.senderUuidBuilder_.getMessage();
         }
      }

      public ReceiveChatPush.Builder setSenderUuid(Uuid var1) {
         if (this.senderUuidBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.senderUuid_ = var1;
         } else {
            this.senderUuidBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public ReceiveChatPush.Builder setSenderUuid(Uuid.Builder var1) {
         if (this.senderUuidBuilder_ == null) {
            this.senderUuid_ = var1.build();
         } else {
            this.senderUuidBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public ReceiveChatPush.Builder mergeSenderUuid(Uuid var1) {
         if (this.senderUuidBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.senderUuid_ != null && this.senderUuid_ != Uuid.getDefaultInstance()) {
               this.getSenderUuidBuilder().mergeFrom(var1);
            } else {
               this.senderUuid_ = var1;
            }
         } else {
            this.senderUuidBuilder_.mergeFrom(var1);
         }

         if (this.senderUuid_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public ReceiveChatPush.Builder clearSenderUuid() {
         this.bitField0_ &= -2;
         this.senderUuid_ = null;
         if (this.senderUuidBuilder_ != null) {
            this.senderUuidBuilder_.dispose();
            this.senderUuidBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Uuid.Builder getSenderUuidBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getSenderUuidFieldBuilder().getBuilder();
      }

      @Override
      public UuidOrBuilder getSenderUuidOrBuilder() {
         if (this.senderUuidBuilder_ != null) {
            return this.senderUuidBuilder_.getMessageOrBuilder();
         } else {
            return this.senderUuid_ == null ? Uuid.getDefaultInstance() : this.senderUuid_;
         }
      }

      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> getSenderUuidFieldBuilder() {
         if (this.senderUuidBuilder_ == null) {
            this.senderUuidBuilder_ = new SingleFieldBuilderV3<>(this.getSenderUuid(), this.getParentForChildren(), this.isClean());
            this.senderUuid_ = null;
         }

         return this.senderUuidBuilder_;
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

      public ReceiveChatPush.Builder setChatMessage(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.chatMessage_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public ReceiveChatPush.Builder clearChatMessage() {
         this.chatMessage_ = ReceiveChatPush.getDefaultInstance().getChatMessage();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      public ReceiveChatPush.Builder setChatMessageBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         ReceiveChatPush.checkByteStringIsUtf8(var1);
         this.chatMessage_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public final ReceiveChatPush.Builder setUnknownFields(UnknownFieldSet var1) {
         return (ReceiveChatPush.Builder)super.setUnknownFields(var1);
      }

      public final ReceiveChatPush.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (ReceiveChatPush.Builder)super.mergeUnknownFields(var1);
      }
   }
}
