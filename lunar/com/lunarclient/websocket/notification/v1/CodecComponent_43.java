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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import com.lunarclient.common.v1.Uuid;
import com.lunarclient.common.v1.UuidOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class OpenNotificationRequest extends GeneratedMessageV3 implements OpenNotificationRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int NOTIFICATION_ID_FIELD_NUMBER = 1;
   private Uuid notificationId_;
   private byte memoizedIsInitialized = -1;
   private static final OpenNotificationRequest DEFAULT_INSTANCE = new OpenNotificationRequest();
   private static final Parser<OpenNotificationRequest> PARSER = new AbstractParser<OpenNotificationRequest>() {
      public OpenNotificationRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         OpenNotificationRequest.Builder var3 = OpenNotificationRequest.newBuilder();

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

   private OpenNotificationRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private OpenNotificationRequest() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new OpenNotificationRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_notification_v1_OpenNotificationRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_notification_v1_OpenNotificationRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(OpenNotificationRequest.class, OpenNotificationRequest.Builder.class);
   }

   @Override
   public boolean hasNotificationId() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public Uuid getNotificationId() {
      return this.notificationId_ == null ? Uuid.getDefaultInstance() : this.notificationId_;
   }

   @Override
   public UuidOrBuilder getNotificationIdOrBuilder() {
      return this.notificationId_ == null ? Uuid.getDefaultInstance() : this.notificationId_;
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
      if ((this.bitField0_ & 1) != 0) {
         var1.writeMessage(1, this.getNotificationId());
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
      if ((this.bitField0_ & 1) != 0) {
         var1 += CodedOutputStream.computeMessageSize(1, this.getNotificationId());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof OpenNotificationRequest)) {
         return super.equals(var1);
      } else {
         OpenNotificationRequest var2 = (OpenNotificationRequest)var1;
         if (this.hasNotificationId() != var2.hasNotificationId()) {
            return false;
         } else {
            return this.hasNotificationId() && !this.getNotificationId().equals(var2.getNotificationId())
               ? false
               : this.getUnknownFields().equals(var2.getUnknownFields());
         }
      }
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      if (this.hasNotificationId()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getNotificationId().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static OpenNotificationRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static OpenNotificationRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OpenNotificationRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static OpenNotificationRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OpenNotificationRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static OpenNotificationRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OpenNotificationRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static OpenNotificationRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static OpenNotificationRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static OpenNotificationRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static OpenNotificationRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static OpenNotificationRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public OpenNotificationRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static OpenNotificationRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static OpenNotificationRequest.Builder newBuilder(OpenNotificationRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public OpenNotificationRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new OpenNotificationRequest.Builder() : new OpenNotificationRequest.Builder().mergeFrom(this);
   }

   protected OpenNotificationRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new OpenNotificationRequest.Builder(var1);
   }

   public static OpenNotificationRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<OpenNotificationRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<OpenNotificationRequest> getParserForType() {
      return PARSER;
   }

   public OpenNotificationRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<OpenNotificationRequest.Builder> implements OpenNotificationRequestOrBuilder {
      private int bitField0_;
      private Uuid notificationId_;
      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> notificationIdBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_notification_v1_OpenNotificationRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_notification_v1_OpenNotificationRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(OpenNotificationRequest.class, OpenNotificationRequest.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (OpenNotificationRequest.alwaysUseFieldBuilders) {
            this.getNotificationIdFieldBuilder();
         }
      }

      public OpenNotificationRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.notificationId_ = null;
         if (this.notificationIdBuilder_ != null) {
            this.notificationIdBuilder_.dispose();
            this.notificationIdBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_notification_v1_OpenNotificationRequest_descriptor;
      }

      public OpenNotificationRequest getDefaultInstanceForType() {
         return OpenNotificationRequest.getDefaultInstance();
      }

      public OpenNotificationRequest build() {
         OpenNotificationRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public OpenNotificationRequest buildPartial() {
         OpenNotificationRequest var1 = new OpenNotificationRequest(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(OpenNotificationRequest var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.notificationId_ = this.notificationIdBuilder_ == null ? this.notificationId_ : this.notificationIdBuilder_.build();
            var3 |= 1;
         }

         OpenNotificationRequest var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public OpenNotificationRequest.Builder clone() {
         return (OpenNotificationRequest.Builder)super.clone();
      }

      public OpenNotificationRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (OpenNotificationRequest.Builder)super.setField(var1, var2);
      }

      public OpenNotificationRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (OpenNotificationRequest.Builder)super.clearField(var1);
      }

      public OpenNotificationRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (OpenNotificationRequest.Builder)super.clearOneof(var1);
      }

      public OpenNotificationRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (OpenNotificationRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public OpenNotificationRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (OpenNotificationRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public OpenNotificationRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof OpenNotificationRequest) {
            return this.mergeFrom((OpenNotificationRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public OpenNotificationRequest.Builder mergeFrom(OpenNotificationRequest var1) {
         if (var1 == OpenNotificationRequest.getDefaultInstance()) {
            return this;
         }

         if (var1.hasNotificationId()) {
            this.mergeNotificationId(var1.getNotificationId());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public OpenNotificationRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getNotificationIdFieldBuilder().getBuilder(), var2);
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
      public boolean hasNotificationId() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public Uuid getNotificationId() {
         if (this.notificationIdBuilder_ == null) {
            return this.notificationId_ == null ? Uuid.getDefaultInstance() : this.notificationId_;
         } else {
            return this.notificationIdBuilder_.getMessage();
         }
      }

      public OpenNotificationRequest.Builder setNotificationId(Uuid var1) {
         if (this.notificationIdBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.notificationId_ = var1;
         } else {
            this.notificationIdBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public OpenNotificationRequest.Builder setNotificationId(Uuid.Builder var1) {
         if (this.notificationIdBuilder_ == null) {
            this.notificationId_ = var1.build();
         } else {
            this.notificationIdBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public OpenNotificationRequest.Builder mergeNotificationId(Uuid var1) {
         if (this.notificationIdBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.notificationId_ != null && this.notificationId_ != Uuid.getDefaultInstance()) {
               this.getNotificationIdBuilder().mergeFrom(var1);
            } else {
               this.notificationId_ = var1;
            }
         } else {
            this.notificationIdBuilder_.mergeFrom(var1);
         }

         if (this.notificationId_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public OpenNotificationRequest.Builder clearNotificationId() {
         this.bitField0_ &= -2;
         this.notificationId_ = null;
         if (this.notificationIdBuilder_ != null) {
            this.notificationIdBuilder_.dispose();
            this.notificationIdBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Uuid.Builder getNotificationIdBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getNotificationIdFieldBuilder().getBuilder();
      }

      @Override
      public UuidOrBuilder getNotificationIdOrBuilder() {
         if (this.notificationIdBuilder_ != null) {
            return this.notificationIdBuilder_.getMessageOrBuilder();
         } else {
            return this.notificationId_ == null ? Uuid.getDefaultInstance() : this.notificationId_;
         }
      }

      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> getNotificationIdFieldBuilder() {
         if (this.notificationIdBuilder_ == null) {
            this.notificationIdBuilder_ = new SingleFieldBuilderV3<>(this.getNotificationId(), this.getParentForChildren(), this.isClean());
            this.notificationId_ = null;
         }

         return this.notificationIdBuilder_;
      }

      public final OpenNotificationRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (OpenNotificationRequest.Builder)super.setUnknownFields(var1);
      }

      public final OpenNotificationRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (OpenNotificationRequest.Builder)super.mergeUnknownFields(var1);
      }
   }
}
