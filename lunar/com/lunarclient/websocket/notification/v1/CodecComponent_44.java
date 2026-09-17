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

public final class MarkAllNotificationsAsReadRequest extends GeneratedMessageV3 implements MarkAllNotificationsAsReadRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   private byte memoizedIsInitialized = -1;
   private static final MarkAllNotificationsAsReadRequest DEFAULT_INSTANCE = new MarkAllNotificationsAsReadRequest();
   private static final Parser<MarkAllNotificationsAsReadRequest> PARSER = new AbstractParser<MarkAllNotificationsAsReadRequest>() {
      public MarkAllNotificationsAsReadRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         MarkAllNotificationsAsReadRequest.Builder var3 = MarkAllNotificationsAsReadRequest.newBuilder();

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

   private MarkAllNotificationsAsReadRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private MarkAllNotificationsAsReadRequest() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new MarkAllNotificationsAsReadRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_notification_v1_MarkAllNotificationsAsReadRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_notification_v1_MarkAllNotificationsAsReadRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(MarkAllNotificationsAsReadRequest.class, MarkAllNotificationsAsReadRequest.Builder.class);
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

      if (!(var1 instanceof MarkAllNotificationsAsReadRequest)) {
         return super.equals(var1);
      }

      MarkAllNotificationsAsReadRequest var2 = (MarkAllNotificationsAsReadRequest)var1;
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

   public static MarkAllNotificationsAsReadRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static MarkAllNotificationsAsReadRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static MarkAllNotificationsAsReadRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static MarkAllNotificationsAsReadRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static MarkAllNotificationsAsReadRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static MarkAllNotificationsAsReadRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static MarkAllNotificationsAsReadRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static MarkAllNotificationsAsReadRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static MarkAllNotificationsAsReadRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static MarkAllNotificationsAsReadRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static MarkAllNotificationsAsReadRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static MarkAllNotificationsAsReadRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public MarkAllNotificationsAsReadRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static MarkAllNotificationsAsReadRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static MarkAllNotificationsAsReadRequest.Builder newBuilder(MarkAllNotificationsAsReadRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public MarkAllNotificationsAsReadRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new MarkAllNotificationsAsReadRequest.Builder() : new MarkAllNotificationsAsReadRequest.Builder().mergeFrom(this);
   }

   protected MarkAllNotificationsAsReadRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new MarkAllNotificationsAsReadRequest.Builder(var1);
   }

   public static MarkAllNotificationsAsReadRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<MarkAllNotificationsAsReadRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<MarkAllNotificationsAsReadRequest> getParserForType() {
      return PARSER;
   }

   public MarkAllNotificationsAsReadRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder
      extends GeneratedMessageV3.Builder<MarkAllNotificationsAsReadRequest.Builder>
      implements MarkAllNotificationsAsReadRequestOrBuilder {
      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_notification_v1_MarkAllNotificationsAsReadRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_notification_v1_MarkAllNotificationsAsReadRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(MarkAllNotificationsAsReadRequest.class, MarkAllNotificationsAsReadRequest.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public MarkAllNotificationsAsReadRequest.Builder clear() {
         super.clear();
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_notification_v1_MarkAllNotificationsAsReadRequest_descriptor;
      }

      public MarkAllNotificationsAsReadRequest getDefaultInstanceForType() {
         return MarkAllNotificationsAsReadRequest.getDefaultInstance();
      }

      public MarkAllNotificationsAsReadRequest build() {
         MarkAllNotificationsAsReadRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public MarkAllNotificationsAsReadRequest buildPartial() {
         MarkAllNotificationsAsReadRequest var1 = new MarkAllNotificationsAsReadRequest(this);
         this.onBuilt();
         return var1;
      }

      public MarkAllNotificationsAsReadRequest.Builder clone() {
         return (MarkAllNotificationsAsReadRequest.Builder)super.clone();
      }

      public MarkAllNotificationsAsReadRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (MarkAllNotificationsAsReadRequest.Builder)super.setField(var1, var2);
      }

      public MarkAllNotificationsAsReadRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (MarkAllNotificationsAsReadRequest.Builder)super.clearField(var1);
      }

      public MarkAllNotificationsAsReadRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (MarkAllNotificationsAsReadRequest.Builder)super.clearOneof(var1);
      }

      public MarkAllNotificationsAsReadRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (MarkAllNotificationsAsReadRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public MarkAllNotificationsAsReadRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (MarkAllNotificationsAsReadRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public MarkAllNotificationsAsReadRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof MarkAllNotificationsAsReadRequest) {
            return this.mergeFrom((MarkAllNotificationsAsReadRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public MarkAllNotificationsAsReadRequest.Builder mergeFrom(MarkAllNotificationsAsReadRequest var1) {
         if (var1 == MarkAllNotificationsAsReadRequest.getDefaultInstance()) {
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

      public MarkAllNotificationsAsReadRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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

      public final MarkAllNotificationsAsReadRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (MarkAllNotificationsAsReadRequest.Builder)super.setUnknownFields(var1);
      }

      public final MarkAllNotificationsAsReadRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (MarkAllNotificationsAsReadRequest.Builder)super.mergeUnknownFields(var1);
      }
   }
}
