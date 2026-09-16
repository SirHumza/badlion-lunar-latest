package com.lunarclient.websocket.friend.v1;

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

public final class FriendRequestCanceledPush extends GeneratedMessageV3 implements FriendRequestCanceledPushOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int SENDER_UUID_FIELD_NUMBER = 1;
   private Uuid senderUuid_;
   private byte memoizedIsInitialized = -1;
   private static final FriendRequestCanceledPush DEFAULT_INSTANCE = new FriendRequestCanceledPush();
   private static final Parser<FriendRequestCanceledPush> PARSER = new AbstractParser<FriendRequestCanceledPush>() {
      public FriendRequestCanceledPush parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         FriendRequestCanceledPush.Builder var3 = FriendRequestCanceledPush.newBuilder();

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

   private FriendRequestCanceledPush(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private FriendRequestCanceledPush() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new FriendRequestCanceledPush();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return PushProto.internal_static_lunarclient_websocket_friend_v1_FriendRequestCanceledPush_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return PushProto.internal_static_lunarclient_websocket_friend_v1_FriendRequestCanceledPush_fieldAccessorTable
         .ensureFieldAccessorsInitialized(FriendRequestCanceledPush.class, FriendRequestCanceledPush.Builder.class);
   }

   @Override
   public boolean hasSenderUuid() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public Uuid getSenderUuid() {
      return this.senderUuid_ == null ? Uuid.getDefaultInstance() : this.senderUuid_;
   }

   @Override
   public UuidOrBuilder getSenderUuidOrBuilder() {
      return this.senderUuid_ == null ? Uuid.getDefaultInstance() : this.senderUuid_;
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
         var1.writeMessage(1, this.getSenderUuid());
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
         var1 += CodedOutputStream.computeMessageSize(1, this.getSenderUuid());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof FriendRequestCanceledPush)) {
         return super.equals(var1);
      } else {
         FriendRequestCanceledPush var2 = (FriendRequestCanceledPush)var1;
         if (this.hasSenderUuid() != var2.hasSenderUuid()) {
            return false;
         } else {
            return this.hasSenderUuid() && !this.getSenderUuid().equals(var2.getSenderUuid()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.hasSenderUuid()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getSenderUuid().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static FriendRequestCanceledPush parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static FriendRequestCanceledPush parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static FriendRequestCanceledPush parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static FriendRequestCanceledPush parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static FriendRequestCanceledPush parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static FriendRequestCanceledPush parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static FriendRequestCanceledPush parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static FriendRequestCanceledPush parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static FriendRequestCanceledPush parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static FriendRequestCanceledPush parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static FriendRequestCanceledPush parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static FriendRequestCanceledPush parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public FriendRequestCanceledPush.Builder newBuilderForType() {
      return newBuilder();
   }

   public static FriendRequestCanceledPush.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static FriendRequestCanceledPush.Builder newBuilder(FriendRequestCanceledPush var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public FriendRequestCanceledPush.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new FriendRequestCanceledPush.Builder() : new FriendRequestCanceledPush.Builder().mergeFrom(this);
   }

   protected FriendRequestCanceledPush.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new FriendRequestCanceledPush.Builder(var1);
   }

   public static FriendRequestCanceledPush getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<FriendRequestCanceledPush> parser() {
      return PARSER;
   }

   @Override
   public Parser<FriendRequestCanceledPush> getParserForType() {
      return PARSER;
   }

   public FriendRequestCanceledPush getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<FriendRequestCanceledPush.Builder> implements FriendRequestCanceledPushOrBuilder {
      private int bitField0_;
      private Uuid senderUuid_;
      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> senderUuidBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return PushProto.internal_static_lunarclient_websocket_friend_v1_FriendRequestCanceledPush_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PushProto.internal_static_lunarclient_websocket_friend_v1_FriendRequestCanceledPush_fieldAccessorTable
            .ensureFieldAccessorsInitialized(FriendRequestCanceledPush.class, FriendRequestCanceledPush.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (FriendRequestCanceledPush.alwaysUseFieldBuilders) {
            this.getSenderUuidFieldBuilder();
         }
      }

      public FriendRequestCanceledPush.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.senderUuid_ = null;
         if (this.senderUuidBuilder_ != null) {
            this.senderUuidBuilder_.dispose();
            this.senderUuidBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return PushProto.internal_static_lunarclient_websocket_friend_v1_FriendRequestCanceledPush_descriptor;
      }

      public FriendRequestCanceledPush getDefaultInstanceForType() {
         return FriendRequestCanceledPush.getDefaultInstance();
      }

      public FriendRequestCanceledPush build() {
         FriendRequestCanceledPush var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public FriendRequestCanceledPush buildPartial() {
         FriendRequestCanceledPush var1 = new FriendRequestCanceledPush(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(FriendRequestCanceledPush var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.senderUuid_ = this.senderUuidBuilder_ == null ? this.senderUuid_ : this.senderUuidBuilder_.build();
            var3 |= 1;
         }

         FriendRequestCanceledPush var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public FriendRequestCanceledPush.Builder clone() {
         return (FriendRequestCanceledPush.Builder)super.clone();
      }

      public FriendRequestCanceledPush.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (FriendRequestCanceledPush.Builder)super.setField(var1, var2);
      }

      public FriendRequestCanceledPush.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (FriendRequestCanceledPush.Builder)super.clearField(var1);
      }

      public FriendRequestCanceledPush.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (FriendRequestCanceledPush.Builder)super.clearOneof(var1);
      }

      public FriendRequestCanceledPush.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (FriendRequestCanceledPush.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public FriendRequestCanceledPush.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (FriendRequestCanceledPush.Builder)super.addRepeatedField(var1, var2);
      }

      public FriendRequestCanceledPush.Builder mergeFrom(Message var1) {
         if (var1 instanceof FriendRequestCanceledPush) {
            return this.mergeFrom((FriendRequestCanceledPush)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public FriendRequestCanceledPush.Builder mergeFrom(FriendRequestCanceledPush var1) {
         if (var1 == FriendRequestCanceledPush.getDefaultInstance()) {
            return this;
         }

         if (var1.hasSenderUuid()) {
            this.mergeSenderUuid(var1.getSenderUuid());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public FriendRequestCanceledPush.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getSenderUuidFieldBuilder().getBuilder(), var2);
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
      public boolean hasSenderUuid() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public Uuid getSenderUuid() {
         if (this.senderUuidBuilder_ == null) {
            return this.senderUuid_ == null ? Uuid.getDefaultInstance() : this.senderUuid_;
         } else {
            return this.senderUuidBuilder_.getMessage();
         }
      }

      public FriendRequestCanceledPush.Builder setSenderUuid(Uuid var1) {
         if (this.senderUuidBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.senderUuid_ = var1;
         } else {
            this.senderUuidBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public FriendRequestCanceledPush.Builder setSenderUuid(Uuid.Builder var1) {
         if (this.senderUuidBuilder_ == null) {
            this.senderUuid_ = var1.build();
         } else {
            this.senderUuidBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public FriendRequestCanceledPush.Builder mergeSenderUuid(Uuid var1) {
         if (this.senderUuidBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.senderUuid_ != null && this.senderUuid_ != Uuid.getDefaultInstance()) {
               this.getSenderUuidBuilder().mergeFrom(var1);
            } else {
               this.senderUuid_ = var1;
            }
         } else {
            this.senderUuidBuilder_.mergeFrom(var1);
         }

         if (this.senderUuid_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public FriendRequestCanceledPush.Builder clearSenderUuid() {
         this.bitField0_ &= -2;
         this.senderUuid_ = null;
         if (this.senderUuidBuilder_ != null) {
            this.senderUuidBuilder_.dispose();
            this.senderUuidBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Uuid.Builder getSenderUuidBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getSenderUuidFieldBuilder().getBuilder();
      }

      @Override
      public UuidOrBuilder getSenderUuidOrBuilder() {
         if (this.senderUuidBuilder_ != null) {
            return this.senderUuidBuilder_.getMessageOrBuilder();
         } else {
            return this.senderUuid_ == null ? Uuid.getDefaultInstance() : this.senderUuid_;
         }
      }

      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> getSenderUuidFieldBuilder() {
         if (this.senderUuidBuilder_ == null) {
            this.senderUuidBuilder_ = new SingleFieldBuilderV3<>(this.getSenderUuid(), this.getParentForChildren(), this.isClean());
            this.senderUuid_ = null;
         }

         return this.senderUuidBuilder_;
      }

      public final FriendRequestCanceledPush.Builder setUnknownFields(UnknownFieldSet var1) {
         return (FriendRequestCanceledPush.Builder)super.setUnknownFields(var1);
      }

      public final FriendRequestCanceledPush.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (FriendRequestCanceledPush.Builder)super.mergeUnknownFields(var1);
      }
   }
}
