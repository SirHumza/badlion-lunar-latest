package com.lunarclient.websocket.heartbeat.v1;

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

public final class RefreshMetadataPush extends GeneratedMessageV3 implements RefreshMetadataPushOrBuilder {
   private static final long serialVersionUID = 0L;
   private byte memoizedIsInitialized = -1;
   private static final RefreshMetadataPush DEFAULT_INSTANCE = new RefreshMetadataPush();
   private static final Parser<RefreshMetadataPush> PARSER = new AbstractParser<RefreshMetadataPush>() {
      public RefreshMetadataPush parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         RefreshMetadataPush.Builder var3 = RefreshMetadataPush.newBuilder();

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

   private RefreshMetadataPush(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private RefreshMetadataPush() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new RefreshMetadataPush();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return PushProto.internal_static_lunarclient_websocket_heartbeat_v1_RefreshMetadataPush_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return PushProto.internal_static_lunarclient_websocket_heartbeat_v1_RefreshMetadataPush_fieldAccessorTable
         .ensureFieldAccessorsInitialized(RefreshMetadataPush.class, RefreshMetadataPush.Builder.class);
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

      if (!(var1 instanceof RefreshMetadataPush)) {
         return super.equals(var1);
      }

      RefreshMetadataPush var2 = (RefreshMetadataPush)var1;
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

   public static RefreshMetadataPush parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static RefreshMetadataPush parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RefreshMetadataPush parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static RefreshMetadataPush parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RefreshMetadataPush parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static RefreshMetadataPush parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RefreshMetadataPush parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RefreshMetadataPush parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static RefreshMetadataPush parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static RefreshMetadataPush parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static RefreshMetadataPush parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RefreshMetadataPush parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public RefreshMetadataPush.Builder newBuilderForType() {
      return newBuilder();
   }

   public static RefreshMetadataPush.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static RefreshMetadataPush.Builder newBuilder(RefreshMetadataPush var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public RefreshMetadataPush.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new RefreshMetadataPush.Builder() : new RefreshMetadataPush.Builder().mergeFrom(this);
   }

   protected RefreshMetadataPush.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new RefreshMetadataPush.Builder(var1);
   }

   public static RefreshMetadataPush getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<RefreshMetadataPush> parser() {
      return PARSER;
   }

   @Override
   public Parser<RefreshMetadataPush> getParserForType() {
      return PARSER;
   }

   public RefreshMetadataPush getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<RefreshMetadataPush.Builder> implements RefreshMetadataPushOrBuilder {
      public static final Descriptors.Descriptor getDescriptor() {
         return PushProto.internal_static_lunarclient_websocket_heartbeat_v1_RefreshMetadataPush_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PushProto.internal_static_lunarclient_websocket_heartbeat_v1_RefreshMetadataPush_fieldAccessorTable
            .ensureFieldAccessorsInitialized(RefreshMetadataPush.class, RefreshMetadataPush.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public RefreshMetadataPush.Builder clear() {
         super.clear();
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return PushProto.internal_static_lunarclient_websocket_heartbeat_v1_RefreshMetadataPush_descriptor;
      }

      public RefreshMetadataPush getDefaultInstanceForType() {
         return RefreshMetadataPush.getDefaultInstance();
      }

      public RefreshMetadataPush build() {
         RefreshMetadataPush var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public RefreshMetadataPush buildPartial() {
         RefreshMetadataPush var1 = new RefreshMetadataPush(this);
         this.onBuilt();
         return var1;
      }

      public RefreshMetadataPush.Builder clone() {
         return (RefreshMetadataPush.Builder)super.clone();
      }

      public RefreshMetadataPush.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (RefreshMetadataPush.Builder)super.setField(var1, var2);
      }

      public RefreshMetadataPush.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (RefreshMetadataPush.Builder)super.clearField(var1);
      }

      public RefreshMetadataPush.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (RefreshMetadataPush.Builder)super.clearOneof(var1);
      }

      public RefreshMetadataPush.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (RefreshMetadataPush.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public RefreshMetadataPush.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (RefreshMetadataPush.Builder)super.addRepeatedField(var1, var2);
      }

      public RefreshMetadataPush.Builder mergeFrom(Message var1) {
         if (var1 instanceof RefreshMetadataPush) {
            return this.mergeFrom((RefreshMetadataPush)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public RefreshMetadataPush.Builder mergeFrom(RefreshMetadataPush var1) {
         if (var1 == RefreshMetadataPush.getDefaultInstance()) {
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

      public RefreshMetadataPush.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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

      public final RefreshMetadataPush.Builder setUnknownFields(UnknownFieldSet var1) {
         return (RefreshMetadataPush.Builder)super.setUnknownFields(var1);
      }

      public final RefreshMetadataPush.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (RefreshMetadataPush.Builder)super.mergeUnknownFields(var1);
      }
   }
}
