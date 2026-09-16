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

public final class FriendRequestDeniedPush extends GeneratedMessageV3 implements FriendRequestDeniedPushOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int DENIER_UUID_FIELD_NUMBER = 1;
   private Uuid denierUuid_;
   private byte memoizedIsInitialized = -1;
   private static final FriendRequestDeniedPush DEFAULT_INSTANCE = new FriendRequestDeniedPush();
   private static final Parser<FriendRequestDeniedPush> PARSER = new AbstractParser<FriendRequestDeniedPush>() {
      public FriendRequestDeniedPush parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         FriendRequestDeniedPush.Builder var3 = FriendRequestDeniedPush.newBuilder();

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

   private FriendRequestDeniedPush(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private FriendRequestDeniedPush() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new FriendRequestDeniedPush();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return PushProto.internal_static_lunarclient_websocket_friend_v1_FriendRequestDeniedPush_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return PushProto.internal_static_lunarclient_websocket_friend_v1_FriendRequestDeniedPush_fieldAccessorTable
         .ensureFieldAccessorsInitialized(FriendRequestDeniedPush.class, FriendRequestDeniedPush.Builder.class);
   }

   @Override
   public boolean hasDenierUuid() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public Uuid getDenierUuid() {
      return this.denierUuid_ == null ? Uuid.getDefaultInstance() : this.denierUuid_;
   }

   @Override
   public UuidOrBuilder getDenierUuidOrBuilder() {
      return this.denierUuid_ == null ? Uuid.getDefaultInstance() : this.denierUuid_;
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
         var1.writeMessage(1, this.getDenierUuid());
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
         var1 += CodedOutputStream.computeMessageSize(1, this.getDenierUuid());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof FriendRequestDeniedPush)) {
         return super.equals(var1);
      } else {
         FriendRequestDeniedPush var2 = (FriendRequestDeniedPush)var1;
         if (this.hasDenierUuid() != var2.hasDenierUuid()) {
            return false;
         } else {
            return this.hasDenierUuid() && !this.getDenierUuid().equals(var2.getDenierUuid()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.hasDenierUuid()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getDenierUuid().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static FriendRequestDeniedPush parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static FriendRequestDeniedPush parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static FriendRequestDeniedPush parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static FriendRequestDeniedPush parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static FriendRequestDeniedPush parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static FriendRequestDeniedPush parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static FriendRequestDeniedPush parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static FriendRequestDeniedPush parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static FriendRequestDeniedPush parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static FriendRequestDeniedPush parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static FriendRequestDeniedPush parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static FriendRequestDeniedPush parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public FriendRequestDeniedPush.Builder newBuilderForType() {
      return newBuilder();
   }

   public static FriendRequestDeniedPush.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static FriendRequestDeniedPush.Builder newBuilder(FriendRequestDeniedPush var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public FriendRequestDeniedPush.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new FriendRequestDeniedPush.Builder() : new FriendRequestDeniedPush.Builder().mergeFrom(this);
   }

   protected FriendRequestDeniedPush.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new FriendRequestDeniedPush.Builder(var1);
   }

   public static FriendRequestDeniedPush getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<FriendRequestDeniedPush> parser() {
      return PARSER;
   }

   @Override
   public Parser<FriendRequestDeniedPush> getParserForType() {
      return PARSER;
   }

   public FriendRequestDeniedPush getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<FriendRequestDeniedPush.Builder> implements FriendRequestDeniedPushOrBuilder {
      private int bitField0_;
      private Uuid denierUuid_;
      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> denierUuidBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return PushProto.internal_static_lunarclient_websocket_friend_v1_FriendRequestDeniedPush_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PushProto.internal_static_lunarclient_websocket_friend_v1_FriendRequestDeniedPush_fieldAccessorTable
            .ensureFieldAccessorsInitialized(FriendRequestDeniedPush.class, FriendRequestDeniedPush.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (FriendRequestDeniedPush.alwaysUseFieldBuilders) {
            this.getDenierUuidFieldBuilder();
         }
      }

      public FriendRequestDeniedPush.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.denierUuid_ = null;
         if (this.denierUuidBuilder_ != null) {
            this.denierUuidBuilder_.dispose();
            this.denierUuidBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return PushProto.internal_static_lunarclient_websocket_friend_v1_FriendRequestDeniedPush_descriptor;
      }

      public FriendRequestDeniedPush getDefaultInstanceForType() {
         return FriendRequestDeniedPush.getDefaultInstance();
      }

      public FriendRequestDeniedPush build() {
         FriendRequestDeniedPush var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public FriendRequestDeniedPush buildPartial() {
         FriendRequestDeniedPush var1 = new FriendRequestDeniedPush(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(FriendRequestDeniedPush var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.denierUuid_ = this.denierUuidBuilder_ == null ? this.denierUuid_ : this.denierUuidBuilder_.build();
            var3 |= 1;
         }

         FriendRequestDeniedPush var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public FriendRequestDeniedPush.Builder clone() {
         return (FriendRequestDeniedPush.Builder)super.clone();
      }

      public FriendRequestDeniedPush.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (FriendRequestDeniedPush.Builder)super.setField(var1, var2);
      }

      public FriendRequestDeniedPush.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (FriendRequestDeniedPush.Builder)super.clearField(var1);
      }

      public FriendRequestDeniedPush.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (FriendRequestDeniedPush.Builder)super.clearOneof(var1);
      }

      public FriendRequestDeniedPush.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (FriendRequestDeniedPush.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public FriendRequestDeniedPush.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (FriendRequestDeniedPush.Builder)super.addRepeatedField(var1, var2);
      }

      public FriendRequestDeniedPush.Builder mergeFrom(Message var1) {
         if (var1 instanceof FriendRequestDeniedPush) {
            return this.mergeFrom((FriendRequestDeniedPush)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public FriendRequestDeniedPush.Builder mergeFrom(FriendRequestDeniedPush var1) {
         if (var1 == FriendRequestDeniedPush.getDefaultInstance()) {
            return this;
         }

         if (var1.hasDenierUuid()) {
            this.mergeDenierUuid(var1.getDenierUuid());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public FriendRequestDeniedPush.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getDenierUuidFieldBuilder().getBuilder(), var2);
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
      public boolean hasDenierUuid() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public Uuid getDenierUuid() {
         if (this.denierUuidBuilder_ == null) {
            return this.denierUuid_ == null ? Uuid.getDefaultInstance() : this.denierUuid_;
         } else {
            return this.denierUuidBuilder_.getMessage();
         }
      }

      public FriendRequestDeniedPush.Builder setDenierUuid(Uuid var1) {
         if (this.denierUuidBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.denierUuid_ = var1;
         } else {
            this.denierUuidBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public FriendRequestDeniedPush.Builder setDenierUuid(Uuid.Builder var1) {
         if (this.denierUuidBuilder_ == null) {
            this.denierUuid_ = var1.build();
         } else {
            this.denierUuidBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public FriendRequestDeniedPush.Builder mergeDenierUuid(Uuid var1) {
         if (this.denierUuidBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.denierUuid_ != null && this.denierUuid_ != Uuid.getDefaultInstance()) {
               this.getDenierUuidBuilder().mergeFrom(var1);
            } else {
               this.denierUuid_ = var1;
            }
         } else {
            this.denierUuidBuilder_.mergeFrom(var1);
         }

         if (this.denierUuid_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public FriendRequestDeniedPush.Builder clearDenierUuid() {
         this.bitField0_ &= -2;
         this.denierUuid_ = null;
         if (this.denierUuidBuilder_ != null) {
            this.denierUuidBuilder_.dispose();
            this.denierUuidBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Uuid.Builder getDenierUuidBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getDenierUuidFieldBuilder().getBuilder();
      }

      @Override
      public UuidOrBuilder getDenierUuidOrBuilder() {
         if (this.denierUuidBuilder_ != null) {
            return this.denierUuidBuilder_.getMessageOrBuilder();
         } else {
            return this.denierUuid_ == null ? Uuid.getDefaultInstance() : this.denierUuid_;
         }
      }

      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> getDenierUuidFieldBuilder() {
         if (this.denierUuidBuilder_ == null) {
            this.denierUuidBuilder_ = new SingleFieldBuilderV3<>(this.getDenierUuid(), this.getParentForChildren(), this.isClean());
            this.denierUuid_ = null;
         }

         return this.denierUuidBuilder_;
      }

      public final FriendRequestDeniedPush.Builder setUnknownFields(UnknownFieldSet var1) {
         return (FriendRequestDeniedPush.Builder)super.setUnknownFields(var1);
      }

      public final FriendRequestDeniedPush.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (FriendRequestDeniedPush.Builder)super.mergeUnknownFields(var1);
      }
   }
}
