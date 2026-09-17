package com.lunarclient.websocket.notification.v1;

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

public final class OpenNotificationResponse extends GeneratedMessageV3 implements OpenNotificationResponseOrBuilder {
   private static final long serialVersionUID = 0L;
   private byte memoizedIsInitialized = -1;
   private static final OpenNotificationResponse DEFAULT_INSTANCE = new OpenNotificationResponse();
   private static final Parser<OpenNotificationResponse> PARSER = new AbstractParser<OpenNotificationResponse>() {
      public OpenNotificationResponse parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         OpenNotificationResponse.Builder var3 = OpenNotificationResponse.newBuilder();

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

   private OpenNotificationResponse(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private OpenNotificationResponse() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new OpenNotificationResponse();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_notification_v1_OpenNotificationResponse_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_notification_v1_OpenNotificationResponse_fieldAccessorTable
         .ensureFieldAccessorsInitialized(OpenNotificationResponse.class, OpenNotificationResponse.Builder.class);
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

      if (!(var1 instanceof OpenNotificationResponse)) {
         return super.equals(var1);
      }

      OpenNotificationResponse var2 = (OpenNotificationResponse)var1;
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

   public static OpenNotificationResponse parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static OpenNotificationResponse parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OpenNotificationResponse parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static OpenNotificationResponse parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OpenNotificationResponse parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static OpenNotificationResponse parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OpenNotificationResponse parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static OpenNotificationResponse parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static OpenNotificationResponse parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static OpenNotificationResponse parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static OpenNotificationResponse parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static OpenNotificationResponse parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public OpenNotificationResponse.Builder newBuilderForType() {
      return newBuilder();
   }

   public static OpenNotificationResponse.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static OpenNotificationResponse.Builder newBuilder(OpenNotificationResponse var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public OpenNotificationResponse.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new OpenNotificationResponse.Builder() : new OpenNotificationResponse.Builder().mergeFrom(this);
   }

   protected OpenNotificationResponse.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new OpenNotificationResponse.Builder(var1);
   }

   public static OpenNotificationResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<OpenNotificationResponse> parser() {
      return PARSER;
   }

   @Override
   public Parser<OpenNotificationResponse> getParserForType() {
      return PARSER;
   }

   public OpenNotificationResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<OpenNotificationResponse.Builder> implements OpenNotificationResponseOrBuilder {
      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_notification_v1_OpenNotificationResponse_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_notification_v1_OpenNotificationResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(OpenNotificationResponse.class, OpenNotificationResponse.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public OpenNotificationResponse.Builder clear() {
         super.clear();
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_notification_v1_OpenNotificationResponse_descriptor;
      }

      public OpenNotificationResponse getDefaultInstanceForType() {
         return OpenNotificationResponse.getDefaultInstance();
      }

      public OpenNotificationResponse build() {
         OpenNotificationResponse var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public OpenNotificationResponse buildPartial() {
         OpenNotificationResponse var1 = new OpenNotificationResponse(this);
         this.onBuilt();
         return var1;
      }

      public OpenNotificationResponse.Builder clone() {
         return (OpenNotificationResponse.Builder)super.clone();
      }

      public OpenNotificationResponse.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (OpenNotificationResponse.Builder)super.setField(var1, var2);
      }

      public OpenNotificationResponse.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (OpenNotificationResponse.Builder)super.clearField(var1);
      }

      public OpenNotificationResponse.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (OpenNotificationResponse.Builder)super.clearOneof(var1);
      }

      public OpenNotificationResponse.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (OpenNotificationResponse.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public OpenNotificationResponse.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (OpenNotificationResponse.Builder)super.addRepeatedField(var1, var2);
      }

      public OpenNotificationResponse.Builder mergeFrom(Message var1) {
         if (var1 instanceof OpenNotificationResponse) {
            return this.mergeFrom((OpenNotificationResponse)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public OpenNotificationResponse.Builder mergeFrom(OpenNotificationResponse var1) {
         if (var1 == OpenNotificationResponse.getDefaultInstance()) {
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

      public OpenNotificationResponse.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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

      public final OpenNotificationResponse.Builder setUnknownFields(UnknownFieldSet var1) {
         return (OpenNotificationResponse.Builder)super.setUnknownFields(var1);
      }

      public final OpenNotificationResponse.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (OpenNotificationResponse.Builder)super.mergeUnknownFields(var1);
      }
   }
}
