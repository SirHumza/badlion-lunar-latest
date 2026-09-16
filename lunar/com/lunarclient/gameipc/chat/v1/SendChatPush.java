package com.lunarclient.gameipc.chat.v1;

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
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class SendChatPush extends GeneratedMessageV3 implements SendChatPushOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int MESSAGE_FIELD_NUMBER = 1;
   private volatile Object message_ = "";
   private byte memoizedIsInitialized = -1;
   private static final SendChatPush DEFAULT_INSTANCE = new SendChatPush();
   private static final Parser<SendChatPush> PARSER = new AbstractParser<SendChatPush>() {
      public SendChatPush parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         SendChatPush.Builder var3 = SendChatPush.newBuilder();

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

   private SendChatPush(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private SendChatPush() {
      this.message_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new SendChatPush();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return PushProto.internal_static_lunarclient_gameipc_chat_v1_SendChatPush_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return PushProto.internal_static_lunarclient_gameipc_chat_v1_SendChatPush_fieldAccessorTable
         .ensureFieldAccessorsInitialized(SendChatPush.class, SendChatPush.Builder.class);
   }

   @Override
   public String getMessage() {
      Object var1 = this.message_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.message_ = var3;
      return var3;
   }

   @Override
   public ByteString getMessageBytes() {
      Object var1 = this.message_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.message_ = var2;
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
      if (!GeneratedMessageV3.isStringEmpty(this.message_)) {
         GeneratedMessageV3.writeString(var1, 1, this.message_);
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
      if (!GeneratedMessageV3.isStringEmpty(this.message_)) {
         var1 += GeneratedMessageV3.computeStringSize(1, this.message_);
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

      if (!(var1 instanceof SendChatPush)) {
         return super.equals(var1);
      }

      SendChatPush var2 = (SendChatPush)var1;
      return !this.getMessage().equals(var2.getMessage()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      var1 = 37 * var1 + 1;
      var1 = 53 * var1 + this.getMessage().hashCode();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static SendChatPush parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static SendChatPush parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SendChatPush parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static SendChatPush parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SendChatPush parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static SendChatPush parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SendChatPush parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SendChatPush parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static SendChatPush parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static SendChatPush parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static SendChatPush parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SendChatPush parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public SendChatPush.Builder newBuilderForType() {
      return newBuilder();
   }

   public static SendChatPush.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static SendChatPush.Builder newBuilder(SendChatPush var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public SendChatPush.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new SendChatPush.Builder() : new SendChatPush.Builder().mergeFrom(this);
   }

   protected SendChatPush.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new SendChatPush.Builder(var1);
   }

   public static SendChatPush getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<SendChatPush> parser() {
      return PARSER;
   }

   @Override
   public Parser<SendChatPush> getParserForType() {
      return PARSER;
   }

   public SendChatPush getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<SendChatPush.Builder> implements SendChatPushOrBuilder {
      private int bitField0_;
      private Object message_ = "";

      public static final Descriptors.Descriptor getDescriptor() {
         return PushProto.internal_static_lunarclient_gameipc_chat_v1_SendChatPush_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PushProto.internal_static_lunarclient_gameipc_chat_v1_SendChatPush_fieldAccessorTable
            .ensureFieldAccessorsInitialized(SendChatPush.class, SendChatPush.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public SendChatPush.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.message_ = "";
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return PushProto.internal_static_lunarclient_gameipc_chat_v1_SendChatPush_descriptor;
      }

      public SendChatPush getDefaultInstanceForType() {
         return SendChatPush.getDefaultInstance();
      }

      public SendChatPush build() {
         SendChatPush var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public SendChatPush buildPartial() {
         SendChatPush var1 = new SendChatPush(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(SendChatPush var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.message_ = this.message_;
         }
      }

      public SendChatPush.Builder clone() {
         return (SendChatPush.Builder)super.clone();
      }

      public SendChatPush.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (SendChatPush.Builder)super.setField(var1, var2);
      }

      public SendChatPush.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (SendChatPush.Builder)super.clearField(var1);
      }

      public SendChatPush.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (SendChatPush.Builder)super.clearOneof(var1);
      }

      public SendChatPush.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (SendChatPush.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public SendChatPush.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (SendChatPush.Builder)super.addRepeatedField(var1, var2);
      }

      public SendChatPush.Builder mergeFrom(Message var1) {
         if (var1 instanceof SendChatPush) {
            return this.mergeFrom((SendChatPush)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public SendChatPush.Builder mergeFrom(SendChatPush var1) {
         if (var1 == SendChatPush.getDefaultInstance()) {
            return this;
         }

         if (!var1.getMessage().isEmpty()) {
            this.message_ = var1.message_;
            this.bitField0_ |= 1;
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

      public SendChatPush.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.message_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 1;
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
      public String getMessage() {
         Object var1 = this.message_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.message_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getMessageBytes() {
         Object var1 = this.message_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.message_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public SendChatPush.Builder setMessage(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.message_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public SendChatPush.Builder clearMessage() {
         this.message_ = SendChatPush.getDefaultInstance().getMessage();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public SendChatPush.Builder setMessageBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         SendChatPush.checkByteStringIsUtf8(var1);
         this.message_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public final SendChatPush.Builder setUnknownFields(UnknownFieldSet var1) {
         return (SendChatPush.Builder)super.setUnknownFields(var1);
      }

      public final SendChatPush.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (SendChatPush.Builder)super.mergeUnknownFields(var1);
      }
   }
}
