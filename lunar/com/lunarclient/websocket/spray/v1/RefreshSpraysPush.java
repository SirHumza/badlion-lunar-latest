package com.lunarclient.websocket.spray.v1;

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

public final class RefreshSpraysPush extends GeneratedMessageV3 implements RefreshSpraysPushOrBuilder {
   private static final long serialVersionUID = 0L;
   private byte memoizedIsInitialized = -1;
   private static final RefreshSpraysPush DEFAULT_INSTANCE = new RefreshSpraysPush();
   private static final Parser<RefreshSpraysPush> PARSER = new AbstractParser<RefreshSpraysPush>() {
      public RefreshSpraysPush parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         RefreshSpraysPush.Builder var3 = RefreshSpraysPush.newBuilder();

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

   private RefreshSpraysPush(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private RefreshSpraysPush() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new RefreshSpraysPush();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return PushProto.internal_static_lunarclient_websocket_spray_v1_RefreshSpraysPush_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return PushProto.internal_static_lunarclient_websocket_spray_v1_RefreshSpraysPush_fieldAccessorTable
         .ensureFieldAccessorsInitialized(RefreshSpraysPush.class, RefreshSpraysPush.Builder.class);
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

      if (!(var1 instanceof RefreshSpraysPush)) {
         return super.equals(var1);
      }

      RefreshSpraysPush var2 = (RefreshSpraysPush)var1;
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

   public static RefreshSpraysPush parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static RefreshSpraysPush parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RefreshSpraysPush parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static RefreshSpraysPush parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RefreshSpraysPush parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static RefreshSpraysPush parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RefreshSpraysPush parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RefreshSpraysPush parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static RefreshSpraysPush parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static RefreshSpraysPush parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static RefreshSpraysPush parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RefreshSpraysPush parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public RefreshSpraysPush.Builder newBuilderForType() {
      return newBuilder();
   }

   public static RefreshSpraysPush.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static RefreshSpraysPush.Builder newBuilder(RefreshSpraysPush var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public RefreshSpraysPush.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new RefreshSpraysPush.Builder() : new RefreshSpraysPush.Builder().mergeFrom(this);
   }

   protected RefreshSpraysPush.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new RefreshSpraysPush.Builder(var1);
   }

   public static RefreshSpraysPush getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<RefreshSpraysPush> parser() {
      return PARSER;
   }

   @Override
   public Parser<RefreshSpraysPush> getParserForType() {
      return PARSER;
   }

   public RefreshSpraysPush getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<RefreshSpraysPush.Builder> implements RefreshSpraysPushOrBuilder {
      public static final Descriptors.Descriptor getDescriptor() {
         return PushProto.internal_static_lunarclient_websocket_spray_v1_RefreshSpraysPush_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PushProto.internal_static_lunarclient_websocket_spray_v1_RefreshSpraysPush_fieldAccessorTable
            .ensureFieldAccessorsInitialized(RefreshSpraysPush.class, RefreshSpraysPush.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public RefreshSpraysPush.Builder clear() {
         super.clear();
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return PushProto.internal_static_lunarclient_websocket_spray_v1_RefreshSpraysPush_descriptor;
      }

      public RefreshSpraysPush getDefaultInstanceForType() {
         return RefreshSpraysPush.getDefaultInstance();
      }

      public RefreshSpraysPush build() {
         RefreshSpraysPush var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public RefreshSpraysPush buildPartial() {
         RefreshSpraysPush var1 = new RefreshSpraysPush(this);
         this.onBuilt();
         return var1;
      }

      public RefreshSpraysPush.Builder clone() {
         return (RefreshSpraysPush.Builder)super.clone();
      }

      public RefreshSpraysPush.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (RefreshSpraysPush.Builder)super.setField(var1, var2);
      }

      public RefreshSpraysPush.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (RefreshSpraysPush.Builder)super.clearField(var1);
      }

      public RefreshSpraysPush.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (RefreshSpraysPush.Builder)super.clearOneof(var1);
      }

      public RefreshSpraysPush.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (RefreshSpraysPush.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public RefreshSpraysPush.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (RefreshSpraysPush.Builder)super.addRepeatedField(var1, var2);
      }

      public RefreshSpraysPush.Builder mergeFrom(Message var1) {
         if (var1 instanceof RefreshSpraysPush) {
            return this.mergeFrom((RefreshSpraysPush)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public RefreshSpraysPush.Builder mergeFrom(RefreshSpraysPush var1) {
         if (var1 == RefreshSpraysPush.getDefaultInstance()) {
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

      public RefreshSpraysPush.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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

      public final RefreshSpraysPush.Builder setUnknownFields(UnknownFieldSet var1) {
         return (RefreshSpraysPush.Builder)super.setUnknownFields(var1);
      }

      public final RefreshSpraysPush.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (RefreshSpraysPush.Builder)super.mergeUnknownFields(var1);
      }
   }
}
