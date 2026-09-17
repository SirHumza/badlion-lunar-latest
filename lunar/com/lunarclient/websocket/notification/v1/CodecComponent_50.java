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

public final class DisplayNotificationPush extends GeneratedMessageV3 implements DisplayNotificationPushOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int NOTIFICATION_TITLE_FIELD_NUMBER = 1;
   private volatile Object notificationTitle_ = "";
   public static final int NOTIFICATION_MESSAGE_FIELD_NUMBER = 2;
   private volatile Object notificationMessage_ = "";
   private byte memoizedIsInitialized = -1;
   private static final DisplayNotificationPush DEFAULT_INSTANCE = new DisplayNotificationPush();
   private static final Parser<DisplayNotificationPush> PARSER = new AbstractParser<DisplayNotificationPush>() {
      public DisplayNotificationPush parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         DisplayNotificationPush.Builder var3 = DisplayNotificationPush.newBuilder();

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

   private DisplayNotificationPush(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private DisplayNotificationPush() {
      this.notificationTitle_ = "";
      this.notificationMessage_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new DisplayNotificationPush();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return PushProto.internal_static_lunarclient_websocket_notification_v1_DisplayNotificationPush_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return PushProto.internal_static_lunarclient_websocket_notification_v1_DisplayNotificationPush_fieldAccessorTable
         .ensureFieldAccessorsInitialized(DisplayNotificationPush.class, DisplayNotificationPush.Builder.class);
   }

   @Override
   public String getNotificationTitle() {
      Object var1 = this.notificationTitle_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.notificationTitle_ = var3;
      return var3;
   }

   @Override
   public ByteString getNotificationTitleBytes() {
      Object var1 = this.notificationTitle_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.notificationTitle_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public String getNotificationMessage() {
      Object var1 = this.notificationMessage_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.notificationMessage_ = var3;
      return var3;
   }

   @Override
   public ByteString getNotificationMessageBytes() {
      Object var1 = this.notificationMessage_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.notificationMessage_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
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
      if (!GeneratedMessageV3.isStringEmpty(this.notificationTitle_)) {
         GeneratedMessageV3.writeString(var1, 1, this.notificationTitle_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.notificationMessage_)) {
         GeneratedMessageV3.writeString(var1, 2, this.notificationMessage_);
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
      if (!GeneratedMessageV3.isStringEmpty(this.notificationTitle_)) {
         var1 += GeneratedMessageV3.computeStringSize(1, this.notificationTitle_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.notificationMessage_)) {
         var1 += GeneratedMessageV3.computeStringSize(2, this.notificationMessage_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof DisplayNotificationPush)) {
         return super.equals(var1);
      } else {
         DisplayNotificationPush var2 = (DisplayNotificationPush)var1;
         if (!this.getNotificationTitle().equals(var2.getNotificationTitle())) {
            return false;
         } else {
            return !this.getNotificationMessage().equals(var2.getNotificationMessage()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 37 * var1 + 1;
      var1 = 53 * var1 + this.getNotificationTitle().hashCode();
      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.getNotificationMessage().hashCode();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static DisplayNotificationPush parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static DisplayNotificationPush parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static DisplayNotificationPush parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static DisplayNotificationPush parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static DisplayNotificationPush parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static DisplayNotificationPush parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static DisplayNotificationPush parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static DisplayNotificationPush parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static DisplayNotificationPush parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static DisplayNotificationPush parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static DisplayNotificationPush parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static DisplayNotificationPush parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public DisplayNotificationPush.Builder newBuilderForType() {
      return newBuilder();
   }

   public static DisplayNotificationPush.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static DisplayNotificationPush.Builder newBuilder(DisplayNotificationPush var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public DisplayNotificationPush.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new DisplayNotificationPush.Builder() : new DisplayNotificationPush.Builder().mergeFrom(this);
   }

   protected DisplayNotificationPush.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new DisplayNotificationPush.Builder(var1);
   }

   public static DisplayNotificationPush getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<DisplayNotificationPush> parser() {
      return PARSER;
   }

   @Override
   public Parser<DisplayNotificationPush> getParserForType() {
      return PARSER;
   }

   public DisplayNotificationPush getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<DisplayNotificationPush.Builder> implements DisplayNotificationPushOrBuilder {
      private int bitField0_;
      private Object notificationTitle_ = "";
      private Object notificationMessage_ = "";

      public static final Descriptors.Descriptor getDescriptor() {
         return PushProto.internal_static_lunarclient_websocket_notification_v1_DisplayNotificationPush_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PushProto.internal_static_lunarclient_websocket_notification_v1_DisplayNotificationPush_fieldAccessorTable
            .ensureFieldAccessorsInitialized(DisplayNotificationPush.class, DisplayNotificationPush.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public DisplayNotificationPush.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.notificationTitle_ = "";
         this.notificationMessage_ = "";
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return PushProto.internal_static_lunarclient_websocket_notification_v1_DisplayNotificationPush_descriptor;
      }

      public DisplayNotificationPush getDefaultInstanceForType() {
         return DisplayNotificationPush.getDefaultInstance();
      }

      public DisplayNotificationPush build() {
         DisplayNotificationPush var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public DisplayNotificationPush buildPartial() {
         DisplayNotificationPush var1 = new DisplayNotificationPush(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(DisplayNotificationPush var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.notificationTitle_ = this.notificationTitle_;
         }

         if ((var2 & 2) != 0) {
            var1.notificationMessage_ = this.notificationMessage_;
         }
      }

      public DisplayNotificationPush.Builder clone() {
         return (DisplayNotificationPush.Builder)super.clone();
      }

      public DisplayNotificationPush.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (DisplayNotificationPush.Builder)super.setField(var1, var2);
      }

      public DisplayNotificationPush.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (DisplayNotificationPush.Builder)super.clearField(var1);
      }

      public DisplayNotificationPush.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (DisplayNotificationPush.Builder)super.clearOneof(var1);
      }

      public DisplayNotificationPush.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (DisplayNotificationPush.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public DisplayNotificationPush.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (DisplayNotificationPush.Builder)super.addRepeatedField(var1, var2);
      }

      public DisplayNotificationPush.Builder mergeFrom(Message var1) {
         if (var1 instanceof DisplayNotificationPush) {
            return this.mergeFrom((DisplayNotificationPush)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public DisplayNotificationPush.Builder mergeFrom(DisplayNotificationPush var1) {
         if (var1 == DisplayNotificationPush.getDefaultInstance()) {
            return this;
         }

         if (!var1.getNotificationTitle().isEmpty()) {
            this.notificationTitle_ = var1.notificationTitle_;
            this.bitField0_ |= 1;
            this.onChanged();
         }

         if (!var1.getNotificationMessage().isEmpty()) {
            this.notificationMessage_ = var1.notificationMessage_;
            this.bitField0_ |= 2;
            this.onChanged();
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public DisplayNotificationPush.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.notificationTitle_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     this.notificationMessage_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 2;
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
      public String getNotificationTitle() {
         Object var1 = this.notificationTitle_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.notificationTitle_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getNotificationTitleBytes() {
         Object var1 = this.notificationTitle_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.notificationTitle_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public DisplayNotificationPush.Builder setNotificationTitle(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.notificationTitle_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public DisplayNotificationPush.Builder clearNotificationTitle() {
         this.notificationTitle_ = DisplayNotificationPush.getDefaultInstance().getNotificationTitle();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public DisplayNotificationPush.Builder setNotificationTitleBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         DisplayNotificationPush.checkByteStringIsUtf8(var1);
         this.notificationTitle_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public String getNotificationMessage() {
         Object var1 = this.notificationMessage_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.notificationMessage_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getNotificationMessageBytes() {
         Object var1 = this.notificationMessage_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.notificationMessage_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public DisplayNotificationPush.Builder setNotificationMessage(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.notificationMessage_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public DisplayNotificationPush.Builder clearNotificationMessage() {
         this.notificationMessage_ = DisplayNotificationPush.getDefaultInstance().getNotificationMessage();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      public DisplayNotificationPush.Builder setNotificationMessageBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         DisplayNotificationPush.checkByteStringIsUtf8(var1);
         this.notificationMessage_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public final DisplayNotificationPush.Builder setUnknownFields(UnknownFieldSet var1) {
         return (DisplayNotificationPush.Builder)super.setUnknownFields(var1);
      }

      public final DisplayNotificationPush.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (DisplayNotificationPush.Builder)super.mergeUnknownFields(var1);
      }
   }
}
