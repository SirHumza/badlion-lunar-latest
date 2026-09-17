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
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class NewNotificationPush extends GeneratedMessageV3 implements NewNotificationPushOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int NOTIFICATION_FIELD_NUMBER = 1;
   private Notification notification_;
   private byte memoizedIsInitialized = -1;
   private static final NewNotificationPush DEFAULT_INSTANCE = new NewNotificationPush();
   private static final Parser<NewNotificationPush> PARSER = new AbstractParser<NewNotificationPush>() {
      public NewNotificationPush parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         NewNotificationPush.Builder var3 = NewNotificationPush.newBuilder();

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

   private NewNotificationPush(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private NewNotificationPush() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new NewNotificationPush();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return PushProto.internal_static_lunarclient_websocket_notification_v1_NewNotificationPush_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return PushProto.internal_static_lunarclient_websocket_notification_v1_NewNotificationPush_fieldAccessorTable
         .ensureFieldAccessorsInitialized(NewNotificationPush.class, NewNotificationPush.Builder.class);
   }

   @Override
   public boolean hasNotification() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public Notification getNotification() {
      return this.notification_ == null ? Notification.getDefaultInstance() : this.notification_;
   }

   @Override
   public NotificationOrBuilder getNotificationOrBuilder() {
      return this.notification_ == null ? Notification.getDefaultInstance() : this.notification_;
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
         var1.writeMessage(1, this.getNotification());
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
         var1 += CodedOutputStream.computeMessageSize(1, this.getNotification());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof NewNotificationPush)) {
         return super.equals(var1);
      } else {
         NewNotificationPush var2 = (NewNotificationPush)var1;
         if (this.hasNotification() != var2.hasNotification()) {
            return false;
         } else {
            return this.hasNotification() && !this.getNotification().equals(var2.getNotification())
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
      if (this.hasNotification()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getNotification().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static NewNotificationPush parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static NewNotificationPush parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static NewNotificationPush parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static NewNotificationPush parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static NewNotificationPush parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static NewNotificationPush parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static NewNotificationPush parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static NewNotificationPush parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static NewNotificationPush parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static NewNotificationPush parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static NewNotificationPush parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static NewNotificationPush parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public NewNotificationPush.Builder newBuilderForType() {
      return newBuilder();
   }

   public static NewNotificationPush.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static NewNotificationPush.Builder newBuilder(NewNotificationPush var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public NewNotificationPush.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new NewNotificationPush.Builder() : new NewNotificationPush.Builder().mergeFrom(this);
   }

   protected NewNotificationPush.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new NewNotificationPush.Builder(var1);
   }

   public static NewNotificationPush getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<NewNotificationPush> parser() {
      return PARSER;
   }

   @Override
   public Parser<NewNotificationPush> getParserForType() {
      return PARSER;
   }

   public NewNotificationPush getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<NewNotificationPush.Builder> implements NewNotificationPushOrBuilder {
      private int bitField0_;
      private Notification notification_;
      private SingleFieldBuilderV3<Notification, Notification.Builder, NotificationOrBuilder> notificationBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return PushProto.internal_static_lunarclient_websocket_notification_v1_NewNotificationPush_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PushProto.internal_static_lunarclient_websocket_notification_v1_NewNotificationPush_fieldAccessorTable
            .ensureFieldAccessorsInitialized(NewNotificationPush.class, NewNotificationPush.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (NewNotificationPush.alwaysUseFieldBuilders) {
            this.getNotificationFieldBuilder();
         }
      }

      public NewNotificationPush.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.notification_ = null;
         if (this.notificationBuilder_ != null) {
            this.notificationBuilder_.dispose();
            this.notificationBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return PushProto.internal_static_lunarclient_websocket_notification_v1_NewNotificationPush_descriptor;
      }

      public NewNotificationPush getDefaultInstanceForType() {
         return NewNotificationPush.getDefaultInstance();
      }

      public NewNotificationPush build() {
         NewNotificationPush var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public NewNotificationPush buildPartial() {
         NewNotificationPush var1 = new NewNotificationPush(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(NewNotificationPush var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.notification_ = this.notificationBuilder_ == null ? this.notification_ : this.notificationBuilder_.build();
            var3 |= 1;
         }

         NewNotificationPush var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public NewNotificationPush.Builder clone() {
         return (NewNotificationPush.Builder)super.clone();
      }

      public NewNotificationPush.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (NewNotificationPush.Builder)super.setField(var1, var2);
      }

      public NewNotificationPush.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (NewNotificationPush.Builder)super.clearField(var1);
      }

      public NewNotificationPush.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (NewNotificationPush.Builder)super.clearOneof(var1);
      }

      public NewNotificationPush.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (NewNotificationPush.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public NewNotificationPush.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (NewNotificationPush.Builder)super.addRepeatedField(var1, var2);
      }

      public NewNotificationPush.Builder mergeFrom(Message var1) {
         if (var1 instanceof NewNotificationPush) {
            return this.mergeFrom((NewNotificationPush)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public NewNotificationPush.Builder mergeFrom(NewNotificationPush var1) {
         if (var1 == NewNotificationPush.getDefaultInstance()) {
            return this;
         }

         if (var1.hasNotification()) {
            this.mergeNotification(var1.getNotification());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public NewNotificationPush.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getNotificationFieldBuilder().getBuilder(), var2);
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
      public boolean hasNotification() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public Notification getNotification() {
         if (this.notificationBuilder_ == null) {
            return this.notification_ == null ? Notification.getDefaultInstance() : this.notification_;
         } else {
            return this.notificationBuilder_.getMessage();
         }
      }

      public NewNotificationPush.Builder setNotification(Notification var1) {
         if (this.notificationBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.notification_ = var1;
         } else {
            this.notificationBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public NewNotificationPush.Builder setNotification(Notification.Builder var1) {
         if (this.notificationBuilder_ == null) {
            this.notification_ = var1.build();
         } else {
            this.notificationBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public NewNotificationPush.Builder mergeNotification(Notification var1) {
         if (this.notificationBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.notification_ != null && this.notification_ != Notification.getDefaultInstance()) {
               this.getNotificationBuilder().mergeFrom(var1);
            } else {
               this.notification_ = var1;
            }
         } else {
            this.notificationBuilder_.mergeFrom(var1);
         }

         if (this.notification_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public NewNotificationPush.Builder clearNotification() {
         this.bitField0_ &= -2;
         this.notification_ = null;
         if (this.notificationBuilder_ != null) {
            this.notificationBuilder_.dispose();
            this.notificationBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Notification.Builder getNotificationBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getNotificationFieldBuilder().getBuilder();
      }

      @Override
      public NotificationOrBuilder getNotificationOrBuilder() {
         if (this.notificationBuilder_ != null) {
            return this.notificationBuilder_.getMessageOrBuilder();
         } else {
            return this.notification_ == null ? Notification.getDefaultInstance() : this.notification_;
         }
      }

      private SingleFieldBuilderV3<Notification, Notification.Builder, NotificationOrBuilder> getNotificationFieldBuilder() {
         if (this.notificationBuilder_ == null) {
            this.notificationBuilder_ = new SingleFieldBuilderV3<>(this.getNotification(), this.getParentForChildren(), this.isClean());
            this.notification_ = null;
         }

         return this.notificationBuilder_;
      }

      public final NewNotificationPush.Builder setUnknownFields(UnknownFieldSet var1) {
         return (NewNotificationPush.Builder)super.setUnknownFields(var1);
      }

      public final NewNotificationPush.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (NewNotificationPush.Builder)super.mergeUnknownFields(var1);
      }
   }
}
