package com.lunarclient.websocket.notification.v1;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.Timestamp;
import com.google.protobuf.TimestampOrBuilder;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import com.lunarclient.common.v1.Uuid;
import com.lunarclient.common.v1.UuidOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Notification extends GeneratedMessageV3 implements NotificationOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int ID_FIELD_NUMBER = 1;
   private Uuid id_;
   public static final int TITLE_FIELD_NUMBER = 2;
   private volatile Object title_ = "";
   public static final int TYPE_FIELD_NUMBER = 3;
   private int type_ = 0;
   public static final int SENT_AT_FIELD_NUMBER = 4;
   private Timestamp sentAt_;
   public static final int READ_AT_FIELD_NUMBER = 5;
   private Timestamp readAt_;
   public static final int METADATA_FIELD_NUMBER = 6;
   private volatile Object metadata_ = "";
   private byte memoizedIsInitialized = -1;
   private static final Notification DEFAULT_INSTANCE = new Notification();
   private static final Parser<Notification> PARSER = new AbstractParser<Notification>() {
      public Notification parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         Notification.Builder var3 = Notification.newBuilder();

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

   private Notification(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private Notification() {
      this.title_ = "";
      this.type_ = 0;
      this.metadata_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new Notification();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_notification_v1_Notification_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_notification_v1_Notification_fieldAccessorTable
         .ensureFieldAccessorsInitialized(Notification.class, Notification.Builder.class);
   }

   @Override
   public boolean hasId() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public Uuid getId() {
      return this.id_ == null ? Uuid.getDefaultInstance() : this.id_;
   }

   @Override
   public UuidOrBuilder getIdOrBuilder() {
      return this.id_ == null ? Uuid.getDefaultInstance() : this.id_;
   }

   @Override
   public String getTitle() {
      Object var1 = this.title_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.title_ = var3;
      return var3;
   }

   @Override
   public ByteString getTitleBytes() {
      Object var1 = this.title_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.title_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public int getTypeValue() {
      return this.type_;
   }

   @Override
   public Notification.NotificationType getType() {
      Notification.NotificationType var1 = Notification.NotificationType.forNumber(this.type_);
      return var1 == null ? Notification.NotificationType.UNRECOGNIZED : var1;
   }

   @Override
   public boolean hasSentAt() {
      return (this.bitField0_ & 2) != 0;
   }

   @Override
   public Timestamp getSentAt() {
      return this.sentAt_ == null ? Timestamp.getDefaultInstance() : this.sentAt_;
   }

   @Override
   public TimestampOrBuilder getSentAtOrBuilder() {
      return this.sentAt_ == null ? Timestamp.getDefaultInstance() : this.sentAt_;
   }

   @Override
   public boolean hasReadAt() {
      return (this.bitField0_ & 4) != 0;
   }

   @Override
   public Timestamp getReadAt() {
      return this.readAt_ == null ? Timestamp.getDefaultInstance() : this.readAt_;
   }

   @Override
   public TimestampOrBuilder getReadAtOrBuilder() {
      return this.readAt_ == null ? Timestamp.getDefaultInstance() : this.readAt_;
   }

   @Override
   public String getMetadata() {
      Object var1 = this.metadata_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.metadata_ = var3;
      return var3;
   }

   @Override
   public ByteString getMetadataBytes() {
      Object var1 = this.metadata_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.metadata_ = var2;
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
      if ((this.bitField0_ & 1) != 0) {
         var1.writeMessage(1, this.getId());
      }

      if (!GeneratedMessageV3.isStringEmpty(this.title_)) {
         GeneratedMessageV3.writeString(var1, 2, this.title_);
      }

      if (this.type_ != Notification.NotificationType.NOTIFICATION_TYPE_UNSPECIFIED.getNumber()) {
         var1.writeEnum(3, this.type_);
      }

      if ((this.bitField0_ & 2) != 0) {
         var1.writeMessage(4, this.getSentAt());
      }

      if ((this.bitField0_ & 4) != 0) {
         var1.writeMessage(5, this.getReadAt());
      }

      if (!GeneratedMessageV3.isStringEmpty(this.metadata_)) {
         GeneratedMessageV3.writeString(var1, 6, this.metadata_);
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
         var1 += CodedOutputStream.computeMessageSize(1, this.getId());
      }

      if (!GeneratedMessageV3.isStringEmpty(this.title_)) {
         var1 += GeneratedMessageV3.computeStringSize(2, this.title_);
      }

      if (this.type_ != Notification.NotificationType.NOTIFICATION_TYPE_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(3, this.type_);
      }

      if ((this.bitField0_ & 2) != 0) {
         var1 += CodedOutputStream.computeMessageSize(4, this.getSentAt());
      }

      if ((this.bitField0_ & 4) != 0) {
         var1 += CodedOutputStream.computeMessageSize(5, this.getReadAt());
      }

      if (!GeneratedMessageV3.isStringEmpty(this.metadata_)) {
         var1 += GeneratedMessageV3.computeStringSize(6, this.metadata_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof Notification)) {
         return super.equals(var1);
      } else {
         Notification var2 = (Notification)var1;
         if (this.hasId() != var2.hasId()) {
            return false;
         } else if (this.hasId() && !this.getId().equals(var2.getId())) {
            return false;
         } else if (!this.getTitle().equals(var2.getTitle())) {
            return false;
         } else if (this.type_ != var2.type_) {
            return false;
         } else if (this.hasSentAt() != var2.hasSentAt()) {
            return false;
         } else if (this.hasSentAt() && !this.getSentAt().equals(var2.getSentAt())) {
            return false;
         } else if (this.hasReadAt() != var2.hasReadAt()) {
            return false;
         } else if (this.hasReadAt() && !this.getReadAt().equals(var2.getReadAt())) {
            return false;
         } else {
            return !this.getMetadata().equals(var2.getMetadata()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.hasId()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getId().hashCode();
      }

      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.getTitle().hashCode();
      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + this.type_;
      if (this.hasSentAt()) {
         var1 = 37 * var1 + 4;
         var1 = 53 * var1 + this.getSentAt().hashCode();
      }

      if (this.hasReadAt()) {
         var1 = 37 * var1 + 5;
         var1 = 53 * var1 + this.getReadAt().hashCode();
      }

      var1 = 37 * var1 + 6;
      var1 = 53 * var1 + this.getMetadata().hashCode();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static Notification parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static Notification parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Notification parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static Notification parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Notification parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static Notification parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Notification parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Notification parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Notification parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static Notification parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static Notification parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Notification parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public Notification.Builder newBuilderForType() {
      return newBuilder();
   }

   public static Notification.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static Notification.Builder newBuilder(Notification var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public Notification.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Notification.Builder() : new Notification.Builder().mergeFrom(this);
   }

   protected Notification.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new Notification.Builder(var1);
   }

   public static Notification getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<Notification> parser() {
      return PARSER;
   }

   @Override
   public Parser<Notification> getParserForType() {
      return PARSER;
   }

   public Notification getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<Notification.Builder> implements NotificationOrBuilder {
      private int bitField0_;
      private Uuid id_;
      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> idBuilder_;
      private Object title_ = "";
      private int type_ = 0;
      private Timestamp sentAt_;
      private SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> sentAtBuilder_;
      private Timestamp readAt_;
      private SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> readAtBuilder_;
      private Object metadata_ = "";

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_notification_v1_Notification_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_notification_v1_Notification_fieldAccessorTable
            .ensureFieldAccessorsInitialized(Notification.class, Notification.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (Notification.alwaysUseFieldBuilders) {
            this.getIdFieldBuilder();
            this.getSentAtFieldBuilder();
            this.getReadAtFieldBuilder();
         }
      }

      public Notification.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.id_ = null;
         if (this.idBuilder_ != null) {
            this.idBuilder_.dispose();
            this.idBuilder_ = null;
         }

         this.title_ = "";
         this.type_ = 0;
         this.sentAt_ = null;
         if (this.sentAtBuilder_ != null) {
            this.sentAtBuilder_.dispose();
            this.sentAtBuilder_ = null;
         }

         this.readAt_ = null;
         if (this.readAtBuilder_ != null) {
            this.readAtBuilder_.dispose();
            this.readAtBuilder_ = null;
         }

         this.metadata_ = "";
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_notification_v1_Notification_descriptor;
      }

      public Notification getDefaultInstanceForType() {
         return Notification.getDefaultInstance();
      }

      public Notification build() {
         Notification var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public Notification buildPartial() {
         Notification var1 = new Notification(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(Notification var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.id_ = this.idBuilder_ == null ? this.id_ : this.idBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.title_ = this.title_;
         }

         if ((var2 & 4) != 0) {
            var1.type_ = this.type_;
         }

         if ((var2 & 8) != 0) {
            var1.sentAt_ = this.sentAtBuilder_ == null ? this.sentAt_ : this.sentAtBuilder_.build();
            var3 |= 2;
         }

         if ((var2 & 16) != 0) {
            var1.readAt_ = this.readAtBuilder_ == null ? this.readAt_ : this.readAtBuilder_.build();
            var3 |= 4;
         }

         if ((var2 & 32) != 0) {
            var1.metadata_ = this.metadata_;
         }

         Notification var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public Notification.Builder clone() {
         return (Notification.Builder)super.clone();
      }

      public Notification.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (Notification.Builder)super.setField(var1, var2);
      }

      public Notification.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (Notification.Builder)super.clearField(var1);
      }

      public Notification.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (Notification.Builder)super.clearOneof(var1);
      }

      public Notification.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (Notification.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public Notification.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (Notification.Builder)super.addRepeatedField(var1, var2);
      }

      public Notification.Builder mergeFrom(Message var1) {
         if (var1 instanceof Notification) {
            return this.mergeFrom((Notification)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public Notification.Builder mergeFrom(Notification var1) {
         if (var1 == Notification.getDefaultInstance()) {
            return this;
         }

         if (var1.hasId()) {
            this.mergeId(var1.getId());
         }

         if (!var1.getTitle().isEmpty()) {
            this.title_ = var1.title_;
            this.bitField0_ |= 2;
            this.onChanged();
         }

         if (var1.type_ != 0) {
            this.setTypeValue(var1.getTypeValue());
         }

         if (var1.hasSentAt()) {
            this.mergeSentAt(var1.getSentAt());
         }

         if (var1.hasReadAt()) {
            this.mergeReadAt(var1.getReadAt());
         }

         if (!var1.getMetadata().isEmpty()) {
            this.metadata_ = var1.metadata_;
            this.bitField0_ |= 32;
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

      public Notification.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getIdFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     this.title_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 2;
                     break;
                  case 24:
                     this.type_ = var1.readEnum();
                     this.bitField0_ |= 4;
                     break;
                  case 34:
                     var1.readMessage(this.getSentAtFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 8;
                     break;
                  case 42:
                     var1.readMessage(this.getReadAtFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 16;
                     break;
                  case 50:
                     this.metadata_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 32;
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
      public boolean hasId() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public Uuid getId() {
         if (this.idBuilder_ == null) {
            return this.id_ == null ? Uuid.getDefaultInstance() : this.id_;
         } else {
            return this.idBuilder_.getMessage();
         }
      }

      public Notification.Builder setId(Uuid var1) {
         if (this.idBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.id_ = var1;
         } else {
            this.idBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public Notification.Builder setId(Uuid.Builder var1) {
         if (this.idBuilder_ == null) {
            this.id_ = var1.build();
         } else {
            this.idBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public Notification.Builder mergeId(Uuid var1) {
         if (this.idBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.id_ != null && this.id_ != Uuid.getDefaultInstance()) {
               this.getIdBuilder().mergeFrom(var1);
            } else {
               this.id_ = var1;
            }
         } else {
            this.idBuilder_.mergeFrom(var1);
         }

         if (this.id_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public Notification.Builder clearId() {
         this.bitField0_ &= -2;
         this.id_ = null;
         if (this.idBuilder_ != null) {
            this.idBuilder_.dispose();
            this.idBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Uuid.Builder getIdBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getIdFieldBuilder().getBuilder();
      }

      @Override
      public UuidOrBuilder getIdOrBuilder() {
         if (this.idBuilder_ != null) {
            return this.idBuilder_.getMessageOrBuilder();
         } else {
            return this.id_ == null ? Uuid.getDefaultInstance() : this.id_;
         }
      }

      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> getIdFieldBuilder() {
         if (this.idBuilder_ == null) {
            this.idBuilder_ = new SingleFieldBuilderV3<>(this.getId(), this.getParentForChildren(), this.isClean());
            this.id_ = null;
         }

         return this.idBuilder_;
      }

      @Override
      public String getTitle() {
         Object var1 = this.title_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.title_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getTitleBytes() {
         Object var1 = this.title_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.title_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public Notification.Builder setTitle(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.title_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public Notification.Builder clearTitle() {
         this.title_ = Notification.getDefaultInstance().getTitle();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      public Notification.Builder setTitleBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         Notification.checkByteStringIsUtf8(var1);
         this.title_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      @Override
      public int getTypeValue() {
         return this.type_;
      }

      public Notification.Builder setTypeValue(int var1) {
         this.type_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      @Override
      public Notification.NotificationType getType() {
         Notification.NotificationType var1 = Notification.NotificationType.forNumber(this.type_);
         return var1 == null ? Notification.NotificationType.UNRECOGNIZED : var1;
      }

      public Notification.Builder setType(Notification.NotificationType var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 4;
         this.type_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public Notification.Builder clearType() {
         this.bitField0_ &= -5;
         this.type_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasSentAt() {
         return (this.bitField0_ & 8) != 0;
      }

      @Override
      public Timestamp getSentAt() {
         if (this.sentAtBuilder_ == null) {
            return this.sentAt_ == null ? Timestamp.getDefaultInstance() : this.sentAt_;
         } else {
            return this.sentAtBuilder_.getMessage();
         }
      }

      public Notification.Builder setSentAt(Timestamp var1) {
         if (this.sentAtBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.sentAt_ = var1;
         } else {
            this.sentAtBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public Notification.Builder setSentAt(Timestamp.Builder var1) {
         if (this.sentAtBuilder_ == null) {
            this.sentAt_ = var1.build();
         } else {
            this.sentAtBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public Notification.Builder mergeSentAt(Timestamp var1) {
         if (this.sentAtBuilder_ == null) {
            if ((this.bitField0_ & 8) != 0 && this.sentAt_ != null && this.sentAt_ != Timestamp.getDefaultInstance()) {
               this.getSentAtBuilder().mergeFrom(var1);
            } else {
               this.sentAt_ = var1;
            }
         } else {
            this.sentAtBuilder_.mergeFrom(var1);
         }

         if (this.sentAt_ != null) {
            this.bitField0_ |= 8;
            this.onChanged();
         }

         return this;
      }

      public Notification.Builder clearSentAt() {
         this.bitField0_ &= -9;
         this.sentAt_ = null;
         if (this.sentAtBuilder_ != null) {
            this.sentAtBuilder_.dispose();
            this.sentAtBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Timestamp.Builder getSentAtBuilder() {
         this.bitField0_ |= 8;
         this.onChanged();
         return this.getSentAtFieldBuilder().getBuilder();
      }

      @Override
      public TimestampOrBuilder getSentAtOrBuilder() {
         if (this.sentAtBuilder_ != null) {
            return this.sentAtBuilder_.getMessageOrBuilder();
         } else {
            return this.sentAt_ == null ? Timestamp.getDefaultInstance() : this.sentAt_;
         }
      }

      private SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> getSentAtFieldBuilder() {
         if (this.sentAtBuilder_ == null) {
            this.sentAtBuilder_ = new SingleFieldBuilderV3<>(this.getSentAt(), this.getParentForChildren(), this.isClean());
            this.sentAt_ = null;
         }

         return this.sentAtBuilder_;
      }

      @Override
      public boolean hasReadAt() {
         return (this.bitField0_ & 16) != 0;
      }

      @Override
      public Timestamp getReadAt() {
         if (this.readAtBuilder_ == null) {
            return this.readAt_ == null ? Timestamp.getDefaultInstance() : this.readAt_;
         } else {
            return this.readAtBuilder_.getMessage();
         }
      }

      public Notification.Builder setReadAt(Timestamp var1) {
         if (this.readAtBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.readAt_ = var1;
         } else {
            this.readAtBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      public Notification.Builder setReadAt(Timestamp.Builder var1) {
         if (this.readAtBuilder_ == null) {
            this.readAt_ = var1.build();
         } else {
            this.readAtBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      public Notification.Builder mergeReadAt(Timestamp var1) {
         if (this.readAtBuilder_ == null) {
            if ((this.bitField0_ & 16) != 0 && this.readAt_ != null && this.readAt_ != Timestamp.getDefaultInstance()) {
               this.getReadAtBuilder().mergeFrom(var1);
            } else {
               this.readAt_ = var1;
            }
         } else {
            this.readAtBuilder_.mergeFrom(var1);
         }

         if (this.readAt_ != null) {
            this.bitField0_ |= 16;
            this.onChanged();
         }

         return this;
      }

      public Notification.Builder clearReadAt() {
         this.bitField0_ &= -17;
         this.readAt_ = null;
         if (this.readAtBuilder_ != null) {
            this.readAtBuilder_.dispose();
            this.readAtBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Timestamp.Builder getReadAtBuilder() {
         this.bitField0_ |= 16;
         this.onChanged();
         return this.getReadAtFieldBuilder().getBuilder();
      }

      @Override
      public TimestampOrBuilder getReadAtOrBuilder() {
         if (this.readAtBuilder_ != null) {
            return this.readAtBuilder_.getMessageOrBuilder();
         } else {
            return this.readAt_ == null ? Timestamp.getDefaultInstance() : this.readAt_;
         }
      }

      private SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> getReadAtFieldBuilder() {
         if (this.readAtBuilder_ == null) {
            this.readAtBuilder_ = new SingleFieldBuilderV3<>(this.getReadAt(), this.getParentForChildren(), this.isClean());
            this.readAt_ = null;
         }

         return this.readAtBuilder_;
      }

      @Override
      public String getMetadata() {
         Object var1 = this.metadata_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.metadata_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getMetadataBytes() {
         Object var1 = this.metadata_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.metadata_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public Notification.Builder setMetadata(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.metadata_ = var1;
         this.bitField0_ |= 32;
         this.onChanged();
         return this;
      }

      public Notification.Builder clearMetadata() {
         this.metadata_ = Notification.getDefaultInstance().getMetadata();
         this.bitField0_ &= -33;
         this.onChanged();
         return this;
      }

      public Notification.Builder setMetadataBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         Notification.checkByteStringIsUtf8(var1);
         this.metadata_ = var1;
         this.bitField0_ |= 32;
         this.onChanged();
         return this;
      }

      public final Notification.Builder setUnknownFields(UnknownFieldSet var1) {
         return (Notification.Builder)super.setUnknownFields(var1);
      }

      public final Notification.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (Notification.Builder)super.mergeUnknownFields(var1);
      }
   }

   public enum NotificationType implements ProtocolMessageEnum {
      NOTIFICATION_TYPE_UNSPECIFIED(0),
      NOTIFICATION_TYPE_ANNOUNCEMENT(1),
      NOTIFICATION_TYPE_FRIEND_REQUEST(2),
      NOTIFICATION_TYPE_PURCHASE(3),
      NOTIFICATION_TYPE_GIFT(4),
      NOTIFICATION_TYPE_GENERAL(5),
      NOTIFICATION_TYPE_NOW_FRIENDS(6),
      NOTIFICATION_TYPE_PROMOTION(7),
      UNRECOGNIZED(-1);

      public static final int NOTIFICATION_TYPE_UNSPECIFIED_VALUE = 0;
      public static final int NOTIFICATION_TYPE_ANNOUNCEMENT_VALUE = 1;
      public static final int NOTIFICATION_TYPE_FRIEND_REQUEST_VALUE = 2;
      public static final int NOTIFICATION_TYPE_PURCHASE_VALUE = 3;
      public static final int NOTIFICATION_TYPE_GIFT_VALUE = 4;
      public static final int NOTIFICATION_TYPE_GENERAL_VALUE = 5;
      public static final int NOTIFICATION_TYPE_NOW_FRIENDS_VALUE = 6;
      public static final int NOTIFICATION_TYPE_PROMOTION_VALUE = 7;
      private static final Internal.EnumLiteMap<Notification.NotificationType> internalValueMap = new Internal.EnumLiteMap<Notification.NotificationType>() {
         public Notification.NotificationType findValueByNumber(int var1) {
            return Notification.NotificationType.forNumber(var1);
         }
      };
      private static final Notification.NotificationType[] VALUES = values();
      private final int value;

      @Override
      public final int getNumber() {
         if (this == UNRECOGNIZED) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
         } else {
            return this.value;
         }
      }

      @Deprecated
      public static Notification.NotificationType valueOf(int var0) {
         return forNumber(var0);
      }

      public static Notification.NotificationType forNumber(int var0) {
         switch (var0) {
            case 0:
               return NOTIFICATION_TYPE_UNSPECIFIED;
            case 1:
               return NOTIFICATION_TYPE_ANNOUNCEMENT;
            case 2:
               return NOTIFICATION_TYPE_FRIEND_REQUEST;
            case 3:
               return NOTIFICATION_TYPE_PURCHASE;
            case 4:
               return NOTIFICATION_TYPE_GIFT;
            case 5:
               return NOTIFICATION_TYPE_GENERAL;
            case 6:
               return NOTIFICATION_TYPE_NOW_FRIENDS;
            case 7:
               return NOTIFICATION_TYPE_PROMOTION;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<Notification.NotificationType> internalGetValueMap() {
         return internalValueMap;
      }

      @Override
      public final Descriptors.EnumValueDescriptor getValueDescriptor() {
         if (this == UNRECOGNIZED) {
            throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
         } else {
            return getDescriptor().getValues().get(this.ordinal());
         }
      }

      @Override
      public final Descriptors.EnumDescriptor getDescriptorForType() {
         return getDescriptor();
      }

      public static final Descriptors.EnumDescriptor getDescriptor() {
         return Notification.getDescriptor().getEnumTypes().get(0);
      }

      public static Notification.NotificationType valueOf(Descriptors.EnumValueDescriptor var0) {
         if (var0.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
         }
      }

      NotificationType(int var3) {
         this.value = var3;
      }
   }
}
