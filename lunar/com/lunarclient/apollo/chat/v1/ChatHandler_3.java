package com.lunarclient.apollo.chat.v1;

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

public final class RemoveLiveChatMessageMessage extends GeneratedMessageV3 implements RemoveLiveChatMessageMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int MESSAGE_ID_FIELD_NUMBER = 1;
   private int messageId_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final RemoveLiveChatMessageMessage DEFAULT_INSTANCE = new RemoveLiveChatMessageMessage();
   private static final Parser<RemoveLiveChatMessageMessage> PARSER = new AbstractParser<RemoveLiveChatMessageMessage>() {
      public RemoveLiveChatMessageMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         RemoveLiveChatMessageMessage.Builder var3 = RemoveLiveChatMessageMessage.newBuilder();

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

   private RemoveLiveChatMessageMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private RemoveLiveChatMessageMessage() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new RemoveLiveChatMessageMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return SchemaProto.internal_static_lunarclient_apollo_chat_v1_RemoveLiveChatMessageMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return SchemaProto.internal_static_lunarclient_apollo_chat_v1_RemoveLiveChatMessageMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(RemoveLiveChatMessageMessage.class, RemoveLiveChatMessageMessage.Builder.class);
   }

   @Override
   public int getMessageId() {
      return this.messageId_;
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
      if (this.messageId_ != 0) {
         var1.writeInt32(1, this.messageId_);
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
      if (this.messageId_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(1, this.messageId_);
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

      if (!(var1 instanceof RemoveLiveChatMessageMessage)) {
         return super.equals(var1);
      }

      RemoveLiveChatMessageMessage var2 = (RemoveLiveChatMessageMessage)var1;
      return this.getMessageId() != var2.getMessageId() ? false : this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      var1 = 37 * var1 + 1;
      var1 = 53 * var1 + this.getMessageId();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static RemoveLiveChatMessageMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static RemoveLiveChatMessageMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RemoveLiveChatMessageMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static RemoveLiveChatMessageMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RemoveLiveChatMessageMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static RemoveLiveChatMessageMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RemoveLiveChatMessageMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RemoveLiveChatMessageMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static RemoveLiveChatMessageMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static RemoveLiveChatMessageMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static RemoveLiveChatMessageMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RemoveLiveChatMessageMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public RemoveLiveChatMessageMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static RemoveLiveChatMessageMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static RemoveLiveChatMessageMessage.Builder newBuilder(RemoveLiveChatMessageMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public RemoveLiveChatMessageMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new RemoveLiveChatMessageMessage.Builder() : new RemoveLiveChatMessageMessage.Builder().mergeFrom(this);
   }

   protected RemoveLiveChatMessageMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new RemoveLiveChatMessageMessage.Builder(var1);
   }

   public static RemoveLiveChatMessageMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<RemoveLiveChatMessageMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<RemoveLiveChatMessageMessage> getParserForType() {
      return PARSER;
   }

   public RemoveLiveChatMessageMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<RemoveLiveChatMessageMessage.Builder> implements RemoveLiveChatMessageMessageOrBuilder {
      private int bitField0_;
      private int messageId_;

      public static final Descriptors.Descriptor getDescriptor() {
         return SchemaProto.internal_static_lunarclient_apollo_chat_v1_RemoveLiveChatMessageMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SchemaProto.internal_static_lunarclient_apollo_chat_v1_RemoveLiveChatMessageMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(RemoveLiveChatMessageMessage.class, RemoveLiveChatMessageMessage.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public RemoveLiveChatMessageMessage.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.messageId_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return SchemaProto.internal_static_lunarclient_apollo_chat_v1_RemoveLiveChatMessageMessage_descriptor;
      }

      public RemoveLiveChatMessageMessage getDefaultInstanceForType() {
         return RemoveLiveChatMessageMessage.getDefaultInstance();
      }

      public RemoveLiveChatMessageMessage build() {
         RemoveLiveChatMessageMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public RemoveLiveChatMessageMessage buildPartial() {
         RemoveLiveChatMessageMessage var1 = new RemoveLiveChatMessageMessage(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(RemoveLiveChatMessageMessage var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.messageId_ = this.messageId_;
         }
      }

      public RemoveLiveChatMessageMessage.Builder clone() {
         return (RemoveLiveChatMessageMessage.Builder)super.clone();
      }

      public RemoveLiveChatMessageMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (RemoveLiveChatMessageMessage.Builder)super.setField(var1, var2);
      }

      public RemoveLiveChatMessageMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (RemoveLiveChatMessageMessage.Builder)super.clearField(var1);
      }

      public RemoveLiveChatMessageMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (RemoveLiveChatMessageMessage.Builder)super.clearOneof(var1);
      }

      public RemoveLiveChatMessageMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (RemoveLiveChatMessageMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public RemoveLiveChatMessageMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (RemoveLiveChatMessageMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public RemoveLiveChatMessageMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof RemoveLiveChatMessageMessage) {
            return this.mergeFrom((RemoveLiveChatMessageMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public RemoveLiveChatMessageMessage.Builder mergeFrom(RemoveLiveChatMessageMessage var1) {
         if (var1 == RemoveLiveChatMessageMessage.getDefaultInstance()) {
            return this;
         }

         if (var1.getMessageId() != 0) {
            this.setMessageId(var1.getMessageId());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public RemoveLiveChatMessageMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.messageId_ = var1.readInt32();
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
      public int getMessageId() {
         return this.messageId_;
      }

      public RemoveLiveChatMessageMessage.Builder setMessageId(int var1) {
         this.messageId_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public RemoveLiveChatMessageMessage.Builder clearMessageId() {
         this.bitField0_ &= -2;
         this.messageId_ = 0;
         this.onChanged();
         return this;
      }

      public final RemoveLiveChatMessageMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (RemoveLiveChatMessageMessage.Builder)super.setUnknownFields(var1);
      }

      public final RemoveLiveChatMessageMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (RemoveLiveChatMessageMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
