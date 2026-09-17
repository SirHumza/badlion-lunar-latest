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

public final class DeleteNotificationRequest extends GeneratedMessageV3 implements DeleteNotificationRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int NOTIFICATION_ID_FIELD_NUMBER = 1;
   private Uuid notificationId_;
   private byte memoizedIsInitialized = -1;
   private static final DeleteNotificationRequest DEFAULT_INSTANCE = new DeleteNotificationRequest();
   private static final Parser<DeleteNotificationRequest> PARSER = new AbstractParser<DeleteNotificationRequest>() {
      public DeleteNotificationRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         DeleteNotificationRequest.Builder var3 = DeleteNotificationRequest.newBuilder();

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

   private DeleteNotificationRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private DeleteNotificationRequest() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new DeleteNotificationRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_notification_v1_DeleteNotificationRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_notification_v1_DeleteNotificationRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(DeleteNotificationRequest.class, DeleteNotificationRequest.Builder.class);
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
      } else if (!(var1 instanceof DeleteNotificationRequest)) {
         return super.equals(var1);
      } else {
         DeleteNotificationRequest var2 = (DeleteNotificationRequest)var1;
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

   public static DeleteNotificationRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static DeleteNotificationRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static DeleteNotificationRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static DeleteNotificationRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static DeleteNotificationRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static DeleteNotificationRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static DeleteNotificationRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static DeleteNotificationRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static DeleteNotificationRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static DeleteNotificationRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static DeleteNotificationRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static DeleteNotificationRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public DeleteNotificationRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static DeleteNotificationRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static DeleteNotificationRequest.Builder newBuilder(DeleteNotificationRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public DeleteNotificationRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new DeleteNotificationRequest.Builder() : new DeleteNotificationRequest.Builder().mergeFrom(this);
   }

   protected DeleteNotificationRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new DeleteNotificationRequest.Builder(var1);
   }

   public static DeleteNotificationRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<DeleteNotificationRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<DeleteNotificationRequest> getParserForType() {
      return PARSER;
   }

   public DeleteNotificationRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<DeleteNotificationRequest.Builder> implements DeleteNotificationRequestOrBuilder {
      private int bitField0_;
      private Uuid notificationId_;
      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> notificationIdBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_notification_v1_DeleteNotificationRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_notification_v1_DeleteNotificationRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(DeleteNotificationRequest.class, DeleteNotificationRequest.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (DeleteNotificationRequest.alwaysUseFieldBuilders) {
            this.getNotificationIdFieldBuilder();
         }
      }

      public DeleteNotificationRequest.Builder clear() {
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
         return ServiceProto.internal_static_lunarclient_websocket_notification_v1_DeleteNotificationRequest_descriptor;
      }

      public DeleteNotificationRequest getDefaultInstanceForType() {
         return DeleteNotificationRequest.getDefaultInstance();
      }

      public DeleteNotificationRequest build() {
         DeleteNotificationRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public DeleteNotificationRequest buildPartial() {
         DeleteNotificationRequest var1 = new DeleteNotificationRequest(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(DeleteNotificationRequest var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.notificationId_ = this.notificationIdBuilder_ == null ? this.notificationId_ : this.notificationIdBuilder_.build();
            var3 |= 1;
         }

         DeleteNotificationRequest var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public DeleteNotificationRequest.Builder clone() {
         return (DeleteNotificationRequest.Builder)super.clone();
      }

      public DeleteNotificationRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (DeleteNotificationRequest.Builder)super.setField(var1, var2);
      }

      public DeleteNotificationRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (DeleteNotificationRequest.Builder)super.clearField(var1);
      }

      public DeleteNotificationRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (DeleteNotificationRequest.Builder)super.clearOneof(var1);
      }

      public DeleteNotificationRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (DeleteNotificationRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public DeleteNotificationRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (DeleteNotificationRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public DeleteNotificationRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof DeleteNotificationRequest) {
            return this.mergeFrom((DeleteNotificationRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public DeleteNotificationRequest.Builder mergeFrom(DeleteNotificationRequest var1) {
         if (var1 == DeleteNotificationRequest.getDefaultInstance()) {
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

      public DeleteNotificationRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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

      public DeleteNotificationRequest.Builder setNotificationId(Uuid var1) {
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

      public DeleteNotificationRequest.Builder setNotificationId(Uuid.Builder var1) {
         if (this.notificationIdBuilder_ == null) {
            this.notificationId_ = var1.build();
         } else {
            this.notificationIdBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public DeleteNotificationRequest.Builder mergeNotificationId(Uuid var1) {
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

      public DeleteNotificationRequest.Builder clearNotificationId() {
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

      public final DeleteNotificationRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (DeleteNotificationRequest.Builder)super.setUnknownFields(var1);
      }

      public final DeleteNotificationRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (DeleteNotificationRequest.Builder)super.mergeUnknownFields(var1);
      }
   }
}
