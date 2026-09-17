package com.lunarclient.websocket.screenshot.v1;

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

public final class RefreshScreenshotsPush extends GeneratedMessageV3 implements RefreshScreenshotsPushOrBuilder {
   private static final long serialVersionUID = 0L;
   private byte memoizedIsInitialized = -1;
   private static final RefreshScreenshotsPush DEFAULT_INSTANCE = new RefreshScreenshotsPush();
   private static final Parser<RefreshScreenshotsPush> PARSER = new AbstractParser<RefreshScreenshotsPush>() {
      public RefreshScreenshotsPush parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         RefreshScreenshotsPush.Builder var3 = RefreshScreenshotsPush.newBuilder();

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

   private RefreshScreenshotsPush(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private RefreshScreenshotsPush() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new RefreshScreenshotsPush();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return PushProto.internal_static_lunarclient_websocket_screenshot_v1_RefreshScreenshotsPush_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return PushProto.internal_static_lunarclient_websocket_screenshot_v1_RefreshScreenshotsPush_fieldAccessorTable
         .ensureFieldAccessorsInitialized(RefreshScreenshotsPush.class, RefreshScreenshotsPush.Builder.class);
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

      if (!(var1 instanceof RefreshScreenshotsPush)) {
         return super.equals(var1);
      }

      RefreshScreenshotsPush var2 = (RefreshScreenshotsPush)var1;
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

   public static RefreshScreenshotsPush parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static RefreshScreenshotsPush parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RefreshScreenshotsPush parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static RefreshScreenshotsPush parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RefreshScreenshotsPush parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static RefreshScreenshotsPush parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RefreshScreenshotsPush parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RefreshScreenshotsPush parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static RefreshScreenshotsPush parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static RefreshScreenshotsPush parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static RefreshScreenshotsPush parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RefreshScreenshotsPush parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public RefreshScreenshotsPush.Builder newBuilderForType() {
      return newBuilder();
   }

   public static RefreshScreenshotsPush.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static RefreshScreenshotsPush.Builder newBuilder(RefreshScreenshotsPush var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public RefreshScreenshotsPush.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new RefreshScreenshotsPush.Builder() : new RefreshScreenshotsPush.Builder().mergeFrom(this);
   }

   protected RefreshScreenshotsPush.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new RefreshScreenshotsPush.Builder(var1);
   }

   public static RefreshScreenshotsPush getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<RefreshScreenshotsPush> parser() {
      return PARSER;
   }

   @Override
   public Parser<RefreshScreenshotsPush> getParserForType() {
      return PARSER;
   }

   public RefreshScreenshotsPush getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<RefreshScreenshotsPush.Builder> implements RefreshScreenshotsPushOrBuilder {
      public static final Descriptors.Descriptor getDescriptor() {
         return PushProto.internal_static_lunarclient_websocket_screenshot_v1_RefreshScreenshotsPush_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PushProto.internal_static_lunarclient_websocket_screenshot_v1_RefreshScreenshotsPush_fieldAccessorTable
            .ensureFieldAccessorsInitialized(RefreshScreenshotsPush.class, RefreshScreenshotsPush.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public RefreshScreenshotsPush.Builder clear() {
         super.clear();
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return PushProto.internal_static_lunarclient_websocket_screenshot_v1_RefreshScreenshotsPush_descriptor;
      }

      public RefreshScreenshotsPush getDefaultInstanceForType() {
         return RefreshScreenshotsPush.getDefaultInstance();
      }

      public RefreshScreenshotsPush build() {
         RefreshScreenshotsPush var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public RefreshScreenshotsPush buildPartial() {
         RefreshScreenshotsPush var1 = new RefreshScreenshotsPush(this);
         this.onBuilt();
         return var1;
      }

      public RefreshScreenshotsPush.Builder clone() {
         return (RefreshScreenshotsPush.Builder)super.clone();
      }

      public RefreshScreenshotsPush.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (RefreshScreenshotsPush.Builder)super.setField(var1, var2);
      }

      public RefreshScreenshotsPush.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (RefreshScreenshotsPush.Builder)super.clearField(var1);
      }

      public RefreshScreenshotsPush.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (RefreshScreenshotsPush.Builder)super.clearOneof(var1);
      }

      public RefreshScreenshotsPush.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (RefreshScreenshotsPush.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public RefreshScreenshotsPush.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (RefreshScreenshotsPush.Builder)super.addRepeatedField(var1, var2);
      }

      public RefreshScreenshotsPush.Builder mergeFrom(Message var1) {
         if (var1 instanceof RefreshScreenshotsPush) {
            return this.mergeFrom((RefreshScreenshotsPush)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public RefreshScreenshotsPush.Builder mergeFrom(RefreshScreenshotsPush var1) {
         if (var1 == RefreshScreenshotsPush.getDefaultInstance()) {
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

      public RefreshScreenshotsPush.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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

      public final RefreshScreenshotsPush.Builder setUnknownFields(UnknownFieldSet var1) {
         return (RefreshScreenshotsPush.Builder)super.setUnknownFields(var1);
      }

      public final RefreshScreenshotsPush.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (RefreshScreenshotsPush.Builder)super.mergeUnknownFields(var1);
      }
   }
}
