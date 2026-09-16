package com.lunarclient.websocket.notification.v1;

import com.google.protobuf.AbstractMessageLite;
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
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class LoginResponse extends GeneratedMessageV3 implements LoginResponseOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int NOTIFICATIONS_FIELD_NUMBER = 1;
   private List<Notification> notifications_;
   private byte memoizedIsInitialized = -1;
   private static final LoginResponse DEFAULT_INSTANCE = new LoginResponse();
   private static final Parser<LoginResponse> PARSER = new AbstractParser<LoginResponse>() {
      public LoginResponse parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         LoginResponse.Builder var3 = LoginResponse.newBuilder();

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

   private LoginResponse(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private LoginResponse() {
      this.notifications_ = Collections.emptyList();
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new LoginResponse();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_notification_v1_LoginResponse_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_notification_v1_LoginResponse_fieldAccessorTable
         .ensureFieldAccessorsInitialized(LoginResponse.class, LoginResponse.Builder.class);
   }

   @Override
   public List<Notification> getNotificationsList() {
      return this.notifications_;
   }

   @Override
   public List<? extends NotificationOrBuilder> getNotificationsOrBuilderList() {
      return this.notifications_;
   }

   @Override
   public int getNotificationsCount() {
      return this.notifications_.size();
   }

   @Override
   public Notification getNotifications(int var1) {
      return this.notifications_.get(var1);
   }

   @Override
   public NotificationOrBuilder getNotificationsOrBuilder(int var1) {
      return this.notifications_.get(var1);
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
      for (int var2 = 0; var2 < this.notifications_.size(); var2++) {
         var1.writeMessage(1, this.notifications_.get(var2));
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

      for (int var2 = 0; var2 < this.notifications_.size(); var2++) {
         var1 += CodedOutputStream.computeMessageSize(1, this.notifications_.get(var2));
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      }

      if (!(var1 instanceof LoginResponse)) {
         return super.equals(var1);
      }

      LoginResponse var2 = (LoginResponse)var1;
      return !this.getNotificationsList().equals(var2.getNotificationsList()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      if (this.getNotificationsCount() > 0) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getNotificationsList().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static LoginResponse parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static LoginResponse parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LoginResponse parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static LoginResponse parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LoginResponse parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static LoginResponse parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LoginResponse parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static LoginResponse parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static LoginResponse parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static LoginResponse parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static LoginResponse parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static LoginResponse parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public LoginResponse.Builder newBuilderForType() {
      return newBuilder();
   }

   public static LoginResponse.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static LoginResponse.Builder newBuilder(LoginResponse var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public LoginResponse.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new LoginResponse.Builder() : new LoginResponse.Builder().mergeFrom(this);
   }

   protected LoginResponse.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new LoginResponse.Builder(var1);
   }

   public static LoginResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<LoginResponse> parser() {
      return PARSER;
   }

   @Override
   public Parser<LoginResponse> getParserForType() {
      return PARSER;
   }

   public LoginResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<LoginResponse.Builder> implements LoginResponseOrBuilder {
      private int bitField0_;
      private List<Notification> notifications_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<Notification, Notification.Builder, NotificationOrBuilder> notificationsBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_notification_v1_LoginResponse_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_notification_v1_LoginResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(LoginResponse.class, LoginResponse.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public LoginResponse.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         if (this.notificationsBuilder_ == null) {
            this.notifications_ = Collections.emptyList();
         } else {
            this.notifications_ = null;
            this.notificationsBuilder_.clear();
         }

         this.bitField0_ &= -2;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_notification_v1_LoginResponse_descriptor;
      }

      public LoginResponse getDefaultInstanceForType() {
         return LoginResponse.getDefaultInstance();
      }

      public LoginResponse build() {
         LoginResponse var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public LoginResponse buildPartial() {
         LoginResponse var1 = new LoginResponse(this);
         this.buildPartialRepeatedFields(var1);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartialRepeatedFields(LoginResponse var1) {
         if (this.notificationsBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0) {
               this.notifications_ = Collections.unmodifiableList(this.notifications_);
               this.bitField0_ &= -2;
            }

            var1.notifications_ = this.notifications_;
         } else {
            var1.notifications_ = this.notificationsBuilder_.build();
         }
      }

      private void buildPartial0(LoginResponse var1) {
         int var2 = this.bitField0_;
      }

      public LoginResponse.Builder clone() {
         return (LoginResponse.Builder)super.clone();
      }

      public LoginResponse.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (LoginResponse.Builder)super.setField(var1, var2);
      }

      public LoginResponse.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (LoginResponse.Builder)super.clearField(var1);
      }

      public LoginResponse.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (LoginResponse.Builder)super.clearOneof(var1);
      }

      public LoginResponse.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (LoginResponse.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public LoginResponse.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (LoginResponse.Builder)super.addRepeatedField(var1, var2);
      }

      public LoginResponse.Builder mergeFrom(Message var1) {
         if (var1 instanceof LoginResponse) {
            return this.mergeFrom((LoginResponse)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public LoginResponse.Builder mergeFrom(LoginResponse var1) {
         if (var1 == LoginResponse.getDefaultInstance()) {
            return this;
         }

         if (this.notificationsBuilder_ == null) {
            if (!var1.notifications_.isEmpty()) {
               if (this.notifications_.isEmpty()) {
                  this.notifications_ = var1.notifications_;
                  this.bitField0_ &= -2;
               } else {
                  this.ensureNotificationsIsMutable();
                  this.notifications_.addAll(var1.notifications_);
               }

               this.onChanged();
            }
         } else if (!var1.notifications_.isEmpty()) {
            if (this.notificationsBuilder_.isEmpty()) {
               this.notificationsBuilder_.dispose();
               this.notificationsBuilder_ = null;
               this.notifications_ = var1.notifications_;
               this.bitField0_ &= -2;
               this.notificationsBuilder_ = LoginResponse.alwaysUseFieldBuilders ? this.getNotificationsFieldBuilder() : null;
            } else {
               this.notificationsBuilder_.addAllMessages(var1.notifications_);
            }
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public LoginResponse.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     Notification var5 = var1.readMessage(Notification.parser(), var2);
                     if (this.notificationsBuilder_ == null) {
                        this.ensureNotificationsIsMutable();
                        this.notifications_.add(var5);
                     } else {
                        this.notificationsBuilder_.addMessage(var5);
                     }
                     break;
                  default:
                     if (!super.parseUnknownField(var1, var2, var4)) {
                        var3 = true;
                     }
               }
            }
         } catch (InvalidProtocolBufferException var9) {
            throw var9.unwrapIOException();
         } finally {
            this.onChanged();
         }

         return this;
      }

      private void ensureNotificationsIsMutable() {
         if ((this.bitField0_ & 1) == 0) {
            this.notifications_ = new ArrayList<>(this.notifications_);
            this.bitField0_ |= 1;
         }
      }

      @Override
      public List<Notification> getNotificationsList() {
         return this.notificationsBuilder_ == null ? Collections.unmodifiableList(this.notifications_) : this.notificationsBuilder_.getMessageList();
      }

      @Override
      public int getNotificationsCount() {
         return this.notificationsBuilder_ == null ? this.notifications_.size() : this.notificationsBuilder_.getCount();
      }

      @Override
      public Notification getNotifications(int var1) {
         return this.notificationsBuilder_ == null ? this.notifications_.get(var1) : this.notificationsBuilder_.getMessage(var1);
      }

      public LoginResponse.Builder setNotifications(int var1, Notification var2) {
         if (this.notificationsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureNotificationsIsMutable();
            this.notifications_.set(var1, var2);
            this.onChanged();
         } else {
            this.notificationsBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public LoginResponse.Builder setNotifications(int var1, Notification.Builder var2) {
         if (this.notificationsBuilder_ == null) {
            this.ensureNotificationsIsMutable();
            this.notifications_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.notificationsBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public LoginResponse.Builder addNotifications(Notification var1) {
         if (this.notificationsBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureNotificationsIsMutable();
            this.notifications_.add(var1);
            this.onChanged();
         } else {
            this.notificationsBuilder_.addMessage(var1);
         }

         return this;
      }

      public LoginResponse.Builder addNotifications(int var1, Notification var2) {
         if (this.notificationsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureNotificationsIsMutable();
            this.notifications_.add(var1, var2);
            this.onChanged();
         } else {
            this.notificationsBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public LoginResponse.Builder addNotifications(Notification.Builder var1) {
         if (this.notificationsBuilder_ == null) {
            this.ensureNotificationsIsMutable();
            this.notifications_.add(var1.build());
            this.onChanged();
         } else {
            this.notificationsBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public LoginResponse.Builder addNotifications(int var1, Notification.Builder var2) {
         if (this.notificationsBuilder_ == null) {
            this.ensureNotificationsIsMutable();
            this.notifications_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.notificationsBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public LoginResponse.Builder addAllNotifications(Iterable<? extends Notification> var1) {
         if (this.notificationsBuilder_ == null) {
            this.ensureNotificationsIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.notifications_);
            this.onChanged();
         } else {
            this.notificationsBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public LoginResponse.Builder clearNotifications() {
         if (this.notificationsBuilder_ == null) {
            this.notifications_ = Collections.emptyList();
            this.bitField0_ &= -2;
            this.onChanged();
         } else {
            this.notificationsBuilder_.clear();
         }

         return this;
      }

      public LoginResponse.Builder removeNotifications(int var1) {
         if (this.notificationsBuilder_ == null) {
            this.ensureNotificationsIsMutable();
            this.notifications_.remove(var1);
            this.onChanged();
         } else {
            this.notificationsBuilder_.remove(var1);
         }

         return this;
      }

      public Notification.Builder getNotificationsBuilder(int var1) {
         return this.getNotificationsFieldBuilder().getBuilder(var1);
      }

      @Override
      public NotificationOrBuilder getNotificationsOrBuilder(int var1) {
         return this.notificationsBuilder_ == null ? this.notifications_.get(var1) : this.notificationsBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends NotificationOrBuilder> getNotificationsOrBuilderList() {
         return this.notificationsBuilder_ != null ? this.notificationsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.notifications_);
      }

      public Notification.Builder addNotificationsBuilder() {
         return this.getNotificationsFieldBuilder().addBuilder(Notification.getDefaultInstance());
      }

      public Notification.Builder addNotificationsBuilder(int var1) {
         return this.getNotificationsFieldBuilder().addBuilder(var1, Notification.getDefaultInstance());
      }

      public List<Notification.Builder> getNotificationsBuilderList() {
         return this.getNotificationsFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<Notification, Notification.Builder, NotificationOrBuilder> getNotificationsFieldBuilder() {
         if (this.notificationsBuilder_ == null) {
            this.notificationsBuilder_ = new RepeatedFieldBuilderV3<>(
               this.notifications_, (this.bitField0_ & 1) != 0, this.getParentForChildren(), this.isClean()
            );
            this.notifications_ = null;
         }

         return this.notificationsBuilder_;
      }

      public final LoginResponse.Builder setUnknownFields(UnknownFieldSet var1) {
         return (LoginResponse.Builder)super.setUnknownFields(var1);
      }

      public final LoginResponse.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (LoginResponse.Builder)super.mergeUnknownFields(var1);
      }
   }
}
