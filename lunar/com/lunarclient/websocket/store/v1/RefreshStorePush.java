package com.lunarclient.websocket.store.v1;

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

public final class RefreshStorePush extends GeneratedMessageV3 implements RefreshStorePushOrBuilder {
   private static final long serialVersionUID = 0L;
   private byte memoizedIsInitialized = -1;
   private static final RefreshStorePush DEFAULT_INSTANCE = new RefreshStorePush();
   private static final Parser<RefreshStorePush> PARSER = new AbstractParser<RefreshStorePush>() {
      public RefreshStorePush parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         RefreshStorePush.Builder var3 = RefreshStorePush.newBuilder();

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

   private RefreshStorePush(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private RefreshStorePush() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new RefreshStorePush();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return PushProto.internal_static_lunarclient_websocket_store_v1_RefreshStorePush_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return PushProto.internal_static_lunarclient_websocket_store_v1_RefreshStorePush_fieldAccessorTable
         .ensureFieldAccessorsInitialized(RefreshStorePush.class, RefreshStorePush.Builder.class);
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

      if (!(var1 instanceof RefreshStorePush)) {
         return super.equals(var1);
      }

      RefreshStorePush var2 = (RefreshStorePush)var1;
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

   public static RefreshStorePush parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static RefreshStorePush parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RefreshStorePush parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static RefreshStorePush parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RefreshStorePush parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static RefreshStorePush parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RefreshStorePush parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RefreshStorePush parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static RefreshStorePush parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static RefreshStorePush parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static RefreshStorePush parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RefreshStorePush parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public RefreshStorePush.Builder newBuilderForType() {
      return newBuilder();
   }

   public static RefreshStorePush.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static RefreshStorePush.Builder newBuilder(RefreshStorePush var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public RefreshStorePush.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new RefreshStorePush.Builder() : new RefreshStorePush.Builder().mergeFrom(this);
   }

   protected RefreshStorePush.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new RefreshStorePush.Builder(var1);
   }

   public static RefreshStorePush getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<RefreshStorePush> parser() {
      return PARSER;
   }

   @Override
   public Parser<RefreshStorePush> getParserForType() {
      return PARSER;
   }

   public RefreshStorePush getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<RefreshStorePush.Builder> implements RefreshStorePushOrBuilder {
      public static final Descriptors.Descriptor getDescriptor() {
         return PushProto.internal_static_lunarclient_websocket_store_v1_RefreshStorePush_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PushProto.internal_static_lunarclient_websocket_store_v1_RefreshStorePush_fieldAccessorTable
            .ensureFieldAccessorsInitialized(RefreshStorePush.class, RefreshStorePush.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public RefreshStorePush.Builder clear() {
         super.clear();
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return PushProto.internal_static_lunarclient_websocket_store_v1_RefreshStorePush_descriptor;
      }

      public RefreshStorePush getDefaultInstanceForType() {
         return RefreshStorePush.getDefaultInstance();
      }

      public RefreshStorePush build() {
         RefreshStorePush var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public RefreshStorePush buildPartial() {
         RefreshStorePush var1 = new RefreshStorePush(this);
         this.onBuilt();
         return var1;
      }

      public RefreshStorePush.Builder clone() {
         return (RefreshStorePush.Builder)super.clone();
      }

      public RefreshStorePush.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (RefreshStorePush.Builder)super.setField(var1, var2);
      }

      public RefreshStorePush.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (RefreshStorePush.Builder)super.clearField(var1);
      }

      public RefreshStorePush.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (RefreshStorePush.Builder)super.clearOneof(var1);
      }

      public RefreshStorePush.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (RefreshStorePush.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public RefreshStorePush.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (RefreshStorePush.Builder)super.addRepeatedField(var1, var2);
      }

      public RefreshStorePush.Builder mergeFrom(Message var1) {
         if (var1 instanceof RefreshStorePush) {
            return this.mergeFrom((RefreshStorePush)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public RefreshStorePush.Builder mergeFrom(RefreshStorePush var1) {
         if (var1 == RefreshStorePush.getDefaultInstance()) {
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

      public RefreshStorePush.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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

      public final RefreshStorePush.Builder setUnknownFields(UnknownFieldSet var1) {
         return (RefreshStorePush.Builder)super.setUnknownFields(var1);
      }

      public final RefreshStorePush.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (RefreshStorePush.Builder)super.mergeUnknownFields(var1);
      }
   }
}
