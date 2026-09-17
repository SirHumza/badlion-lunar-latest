package com.lunarclient.websocket.conversation.v1;

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

public final class RefreshConversationsPush extends GeneratedMessageV3 implements RefreshConversationsPushOrBuilder {
   private static final long serialVersionUID = 0L;
   private byte memoizedIsInitialized = -1;
   private static final RefreshConversationsPush DEFAULT_INSTANCE = new RefreshConversationsPush();
   private static final Parser<RefreshConversationsPush> PARSER = new AbstractParser<RefreshConversationsPush>() {
      public RefreshConversationsPush parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         RefreshConversationsPush.Builder var3 = RefreshConversationsPush.newBuilder();

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

   private RefreshConversationsPush(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private RefreshConversationsPush() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new RefreshConversationsPush();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return PushProto.internal_static_lunarclient_websocket_conversation_v1_RefreshConversationsPush_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return PushProto.internal_static_lunarclient_websocket_conversation_v1_RefreshConversationsPush_fieldAccessorTable
         .ensureFieldAccessorsInitialized(RefreshConversationsPush.class, RefreshConversationsPush.Builder.class);
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

      if (!(var1 instanceof RefreshConversationsPush)) {
         return super.equals(var1);
      }

      RefreshConversationsPush var2 = (RefreshConversationsPush)var1;
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

   public static RefreshConversationsPush parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static RefreshConversationsPush parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RefreshConversationsPush parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static RefreshConversationsPush parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RefreshConversationsPush parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static RefreshConversationsPush parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RefreshConversationsPush parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RefreshConversationsPush parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static RefreshConversationsPush parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static RefreshConversationsPush parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static RefreshConversationsPush parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RefreshConversationsPush parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public RefreshConversationsPush.Builder newBuilderForType() {
      return newBuilder();
   }

   public static RefreshConversationsPush.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static RefreshConversationsPush.Builder newBuilder(RefreshConversationsPush var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public RefreshConversationsPush.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new RefreshConversationsPush.Builder() : new RefreshConversationsPush.Builder().mergeFrom(this);
   }

   protected RefreshConversationsPush.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new RefreshConversationsPush.Builder(var1);
   }

   public static RefreshConversationsPush getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<RefreshConversationsPush> parser() {
      return PARSER;
   }

   @Override
   public Parser<RefreshConversationsPush> getParserForType() {
      return PARSER;
   }

   public RefreshConversationsPush getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<RefreshConversationsPush.Builder> implements RefreshConversationsPushOrBuilder {
      public static final Descriptors.Descriptor getDescriptor() {
         return PushProto.internal_static_lunarclient_websocket_conversation_v1_RefreshConversationsPush_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PushProto.internal_static_lunarclient_websocket_conversation_v1_RefreshConversationsPush_fieldAccessorTable
            .ensureFieldAccessorsInitialized(RefreshConversationsPush.class, RefreshConversationsPush.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public RefreshConversationsPush.Builder clear() {
         super.clear();
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return PushProto.internal_static_lunarclient_websocket_conversation_v1_RefreshConversationsPush_descriptor;
      }

      public RefreshConversationsPush getDefaultInstanceForType() {
         return RefreshConversationsPush.getDefaultInstance();
      }

      public RefreshConversationsPush build() {
         RefreshConversationsPush var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public RefreshConversationsPush buildPartial() {
         RefreshConversationsPush var1 = new RefreshConversationsPush(this);
         this.onBuilt();
         return var1;
      }

      public RefreshConversationsPush.Builder clone() {
         return (RefreshConversationsPush.Builder)super.clone();
      }

      public RefreshConversationsPush.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (RefreshConversationsPush.Builder)super.setField(var1, var2);
      }

      public RefreshConversationsPush.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (RefreshConversationsPush.Builder)super.clearField(var1);
      }

      public RefreshConversationsPush.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (RefreshConversationsPush.Builder)super.clearOneof(var1);
      }

      public RefreshConversationsPush.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (RefreshConversationsPush.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public RefreshConversationsPush.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (RefreshConversationsPush.Builder)super.addRepeatedField(var1, var2);
      }

      public RefreshConversationsPush.Builder mergeFrom(Message var1) {
         if (var1 instanceof RefreshConversationsPush) {
            return this.mergeFrom((RefreshConversationsPush)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public RefreshConversationsPush.Builder mergeFrom(RefreshConversationsPush var1) {
         if (var1 == RefreshConversationsPush.getDefaultInstance()) {
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

      public RefreshConversationsPush.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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

      public final RefreshConversationsPush.Builder setUnknownFields(UnknownFieldSet var1) {
         return (RefreshConversationsPush.Builder)super.setUnknownFields(var1);
      }

      public final RefreshConversationsPush.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (RefreshConversationsPush.Builder)super.mergeUnknownFields(var1);
      }
   }
}
