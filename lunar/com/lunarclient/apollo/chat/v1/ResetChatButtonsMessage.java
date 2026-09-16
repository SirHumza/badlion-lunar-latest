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

public final class ResetChatButtonsMessage extends GeneratedMessageV3 implements ResetChatButtonsMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   private byte memoizedIsInitialized = -1;
   private static final ResetChatButtonsMessage DEFAULT_INSTANCE = new ResetChatButtonsMessage();
   private static final Parser<ResetChatButtonsMessage> PARSER = new AbstractParser<ResetChatButtonsMessage>() {
      public ResetChatButtonsMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         ResetChatButtonsMessage.Builder var3 = ResetChatButtonsMessage.newBuilder();

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

   private ResetChatButtonsMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private ResetChatButtonsMessage() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new ResetChatButtonsMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return SchemaProto.internal_static_lunarclient_apollo_chat_v1_ResetChatButtonsMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return SchemaProto.internal_static_lunarclient_apollo_chat_v1_ResetChatButtonsMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(ResetChatButtonsMessage.class, ResetChatButtonsMessage.Builder.class);
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
      this.getUnknownFields().writeTo(var1);
   }

   @Override
   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 != -1) {
         return var1;
      }

      int var2 = 0;
      var2 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var2;
      return var2;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      }

      if (!(var1 instanceof ResetChatButtonsMessage)) {
         return super.equals(var1);
      }

      ResetChatButtonsMessage var2 = (ResetChatButtonsMessage)var1;
      return this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static ResetChatButtonsMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static ResetChatButtonsMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ResetChatButtonsMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static ResetChatButtonsMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ResetChatButtonsMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static ResetChatButtonsMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ResetChatButtonsMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ResetChatButtonsMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ResetChatButtonsMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ResetChatButtonsMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ResetChatButtonsMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ResetChatButtonsMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public ResetChatButtonsMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static ResetChatButtonsMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ResetChatButtonsMessage.Builder newBuilder(ResetChatButtonsMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public ResetChatButtonsMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new ResetChatButtonsMessage.Builder() : new ResetChatButtonsMessage.Builder().mergeFrom(this);
   }

   protected ResetChatButtonsMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new ResetChatButtonsMessage.Builder(var1);
   }

   public static ResetChatButtonsMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<ResetChatButtonsMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<ResetChatButtonsMessage> getParserForType() {
      return PARSER;
   }

   public ResetChatButtonsMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<ResetChatButtonsMessage.Builder> implements ResetChatButtonsMessageOrBuilder {
      public static final Descriptors.Descriptor getDescriptor() {
         return SchemaProto.internal_static_lunarclient_apollo_chat_v1_ResetChatButtonsMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SchemaProto.internal_static_lunarclient_apollo_chat_v1_ResetChatButtonsMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ResetChatButtonsMessage.class, ResetChatButtonsMessage.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public ResetChatButtonsMessage.Builder clear() {
         super.clear();
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return SchemaProto.internal_static_lunarclient_apollo_chat_v1_ResetChatButtonsMessage_descriptor;
      }

      public ResetChatButtonsMessage getDefaultInstanceForType() {
         return ResetChatButtonsMessage.getDefaultInstance();
      }

      public ResetChatButtonsMessage build() {
         ResetChatButtonsMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public ResetChatButtonsMessage buildPartial() {
         ResetChatButtonsMessage var1 = new ResetChatButtonsMessage(this);
         this.onBuilt();
         return var1;
      }

      public ResetChatButtonsMessage.Builder clone() {
         return (ResetChatButtonsMessage.Builder)super.clone();
      }

      public ResetChatButtonsMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ResetChatButtonsMessage.Builder)super.setField(var1, var2);
      }

      public ResetChatButtonsMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (ResetChatButtonsMessage.Builder)super.clearField(var1);
      }

      public ResetChatButtonsMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (ResetChatButtonsMessage.Builder)super.clearOneof(var1);
      }

      public ResetChatButtonsMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (ResetChatButtonsMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public ResetChatButtonsMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ResetChatButtonsMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public ResetChatButtonsMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof ResetChatButtonsMessage) {
            return this.mergeFrom((ResetChatButtonsMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public ResetChatButtonsMessage.Builder mergeFrom(ResetChatButtonsMessage var1) {
         if (var1 == ResetChatButtonsMessage.getDefaultInstance()) {
            return this;
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public ResetChatButtonsMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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

      public final ResetChatButtonsMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (ResetChatButtonsMessage.Builder)super.setUnknownFields(var1);
      }

      public final ResetChatButtonsMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (ResetChatButtonsMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
