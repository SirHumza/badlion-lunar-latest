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
import com.lunarclient.common.v1.UuidAndUsername;
import com.lunarclient.common.v1.UuidAndUsernameOrBuilder;
import com.lunarclient.common.v1.UuidOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class FriendRequestAcceptedPush extends GeneratedMessageV3 implements FriendRequestAcceptedPushOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int NEW_FRIEND_UUID_FIELD_NUMBER = 1;
   private Uuid newFriendUuid_;
   public static final int NEW_FRIEND_FIELD_NUMBER = 2;
   private UuidAndUsername newFriend_;
   private byte memoizedIsInitialized = -1;
   private static final FriendRequestAcceptedPush DEFAULT_INSTANCE = new FriendRequestAcceptedPush();
   private static final Parser<FriendRequestAcceptedPush> PARSER = new AbstractParser<FriendRequestAcceptedPush>() {
      public FriendRequestAcceptedPush parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         FriendRequestAcceptedPush.Builder var3 = FriendRequestAcceptedPush.newBuilder();

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

   private FriendRequestAcceptedPush(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private FriendRequestAcceptedPush() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new FriendRequestAcceptedPush();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return PushProto.internal_static_lunarclient_websocket_friend_v1_FriendRequestAcceptedPush_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return PushProto.internal_static_lunarclient_websocket_friend_v1_FriendRequestAcceptedPush_fieldAccessorTable
         .ensureFieldAccessorsInitialized(FriendRequestAcceptedPush.class, FriendRequestAcceptedPush.Builder.class);
   }

   @Deprecated
   @Override
   public boolean hasNewFriendUuid() {
      return (this.bitField0_ & 1) != 0;
   }

   @Deprecated
   @Override
   public Uuid getNewFriendUuid() {
      return this.newFriendUuid_ == null ? Uuid.getDefaultInstance() : this.newFriendUuid_;
   }

   @Deprecated
   @Override
   public UuidOrBuilder getNewFriendUuidOrBuilder() {
      return this.newFriendUuid_ == null ? Uuid.getDefaultInstance() : this.newFriendUuid_;
   }

   @Override
   public boolean hasNewFriend() {
      return (this.bitField0_ & 2) != 0;
   }

   @Override
   public UuidAndUsername getNewFriend() {
      return this.newFriend_ == null ? UuidAndUsername.getDefaultInstance() : this.newFriend_;
   }

   @Override
   public UuidAndUsernameOrBuilder getNewFriendOrBuilder() {
      return this.newFriend_ == null ? UuidAndUsername.getDefaultInstance() : this.newFriend_;
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
         var1.writeMessage(1, this.getNewFriendUuid());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1.writeMessage(2, this.getNewFriend());
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
         var1 += CodedOutputStream.computeMessageSize(1, this.getNewFriendUuid());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1 += CodedOutputStream.computeMessageSize(2, this.getNewFriend());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof FriendRequestAcceptedPush)) {
         return super.equals(var1);
      } else {
         FriendRequestAcceptedPush var2 = (FriendRequestAcceptedPush)var1;
         if (this.hasNewFriendUuid() != var2.hasNewFriendUuid()) {
            return false;
         } else if (this.hasNewFriendUuid() && !this.getNewFriendUuid().equals(var2.getNewFriendUuid())) {
            return false;
         } else if (this.hasNewFriend() != var2.hasNewFriend()) {
            return false;
         } else {
            return this.hasNewFriend() && !this.getNewFriend().equals(var2.getNewFriend()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.hasNewFriendUuid()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getNewFriendUuid().hashCode();
      }

      if (this.hasNewFriend()) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getNewFriend().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static FriendRequestAcceptedPush parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static FriendRequestAcceptedPush parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static FriendRequestAcceptedPush parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static FriendRequestAcceptedPush parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static FriendRequestAcceptedPush parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static FriendRequestAcceptedPush parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static FriendRequestAcceptedPush parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static FriendRequestAcceptedPush parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static FriendRequestAcceptedPush parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static FriendRequestAcceptedPush parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static FriendRequestAcceptedPush parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static FriendRequestAcceptedPush parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public FriendRequestAcceptedPush.Builder newBuilderForType() {
      return newBuilder();
   }

   public static FriendRequestAcceptedPush.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static FriendRequestAcceptedPush.Builder newBuilder(FriendRequestAcceptedPush var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public FriendRequestAcceptedPush.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new FriendRequestAcceptedPush.Builder() : new FriendRequestAcceptedPush.Builder().mergeFrom(this);
   }

   protected FriendRequestAcceptedPush.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new FriendRequestAcceptedPush.Builder(var1);
   }

   public static FriendRequestAcceptedPush getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<FriendRequestAcceptedPush> parser() {
      return PARSER;
   }

   @Override
   public Parser<FriendRequestAcceptedPush> getParserForType() {
      return PARSER;
   }

   public FriendRequestAcceptedPush getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<FriendRequestAcceptedPush.Builder> implements FriendRequestAcceptedPushOrBuilder {
      private int bitField0_;
      private Uuid newFriendUuid_;
      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> newFriendUuidBuilder_;
      private UuidAndUsername newFriend_;
      private SingleFieldBuilderV3<UuidAndUsername, UuidAndUsername.Builder, UuidAndUsernameOrBuilder> newFriendBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return PushProto.internal_static_lunarclient_websocket_friend_v1_FriendRequestAcceptedPush_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PushProto.internal_static_lunarclient_websocket_friend_v1_FriendRequestAcceptedPush_fieldAccessorTable
            .ensureFieldAccessorsInitialized(FriendRequestAcceptedPush.class, FriendRequestAcceptedPush.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (FriendRequestAcceptedPush.alwaysUseFieldBuilders) {
            this.getNewFriendUuidFieldBuilder();
            this.getNewFriendFieldBuilder();
         }
      }

      public FriendRequestAcceptedPush.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.newFriendUuid_ = null;
         if (this.newFriendUuidBuilder_ != null) {
            this.newFriendUuidBuilder_.dispose();
            this.newFriendUuidBuilder_ = null;
         }

         this.newFriend_ = null;
         if (this.newFriendBuilder_ != null) {
            this.newFriendBuilder_.dispose();
            this.newFriendBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return PushProto.internal_static_lunarclient_websocket_friend_v1_FriendRequestAcceptedPush_descriptor;
      }

      public FriendRequestAcceptedPush getDefaultInstanceForType() {
         return FriendRequestAcceptedPush.getDefaultInstance();
      }

      public FriendRequestAcceptedPush build() {
         FriendRequestAcceptedPush var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public FriendRequestAcceptedPush buildPartial() {
         FriendRequestAcceptedPush var1 = new FriendRequestAcceptedPush(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(FriendRequestAcceptedPush var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.newFriendUuid_ = this.newFriendUuidBuilder_ == null ? this.newFriendUuid_ : this.newFriendUuidBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.newFriend_ = this.newFriendBuilder_ == null ? this.newFriend_ : this.newFriendBuilder_.build();
            var3 |= 2;
         }

         FriendRequestAcceptedPush var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public FriendRequestAcceptedPush.Builder clone() {
         return (FriendRequestAcceptedPush.Builder)super.clone();
      }

      public FriendRequestAcceptedPush.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (FriendRequestAcceptedPush.Builder)super.setField(var1, var2);
      }

      public FriendRequestAcceptedPush.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (FriendRequestAcceptedPush.Builder)super.clearField(var1);
      }

      public FriendRequestAcceptedPush.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (FriendRequestAcceptedPush.Builder)super.clearOneof(var1);
      }

      public FriendRequestAcceptedPush.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (FriendRequestAcceptedPush.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public FriendRequestAcceptedPush.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (FriendRequestAcceptedPush.Builder)super.addRepeatedField(var1, var2);
      }

      public FriendRequestAcceptedPush.Builder mergeFrom(Message var1) {
         if (var1 instanceof FriendRequestAcceptedPush) {
            return this.mergeFrom((FriendRequestAcceptedPush)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public FriendRequestAcceptedPush.Builder mergeFrom(FriendRequestAcceptedPush var1) {
         if (var1 == FriendRequestAcceptedPush.getDefaultInstance()) {
            return this;
         }

         if (var1.hasNewFriendUuid()) {
            this.mergeNewFriendUuid(var1.getNewFriendUuid());
         }

         if (var1.hasNewFriend()) {
            this.mergeNewFriend(var1.getNewFriend());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public FriendRequestAcceptedPush.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getNewFriendUuidFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     var1.readMessage(this.getNewFriendFieldBuilder().getBuilder(), var2);
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

      @Deprecated
      @Override
      public boolean hasNewFriendUuid() {
         return (this.bitField0_ & 1) != 0;
      }

      @Deprecated
      @Override
      public Uuid getNewFriendUuid() {
         if (this.newFriendUuidBuilder_ == null) {
            return this.newFriendUuid_ == null ? Uuid.getDefaultInstance() : this.newFriendUuid_;
         } else {
            return this.newFriendUuidBuilder_.getMessage();
         }
      }

      @Deprecated
      public FriendRequestAcceptedPush.Builder setNewFriendUuid(Uuid var1) {
         if (this.newFriendUuidBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.newFriendUuid_ = var1;
         } else {
            this.newFriendUuidBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Deprecated
      public FriendRequestAcceptedPush.Builder setNewFriendUuid(Uuid.Builder var1) {
         if (this.newFriendUuidBuilder_ == null) {
            this.newFriendUuid_ = var1.build();
         } else {
            this.newFriendUuidBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Deprecated
      public FriendRequestAcceptedPush.Builder mergeNewFriendUuid(Uuid var1) {
         if (this.newFriendUuidBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.newFriendUuid_ != null && this.newFriendUuid_ != Uuid.getDefaultInstance()) {
               this.getNewFriendUuidBuilder().mergeFrom(var1);
            } else {
               this.newFriendUuid_ = var1;
            }
         } else {
            this.newFriendUuidBuilder_.mergeFrom(var1);
         }

         if (this.newFriendUuid_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      @Deprecated
      public FriendRequestAcceptedPush.Builder clearNewFriendUuid() {
         this.bitField0_ &= -2;
         this.newFriendUuid_ = null;
         if (this.newFriendUuidBuilder_ != null) {
            this.newFriendUuidBuilder_.dispose();
            this.newFriendUuidBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      @Deprecated
      public Uuid.Builder getNewFriendUuidBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getNewFriendUuidFieldBuilder().getBuilder();
      }

      @Deprecated
      @Override
      public UuidOrBuilder getNewFriendUuidOrBuilder() {
         if (this.newFriendUuidBuilder_ != null) {
            return this.newFriendUuidBuilder_.getMessageOrBuilder();
         } else {
            return this.newFriendUuid_ == null ? Uuid.getDefaultInstance() : this.newFriendUuid_;
         }
      }

      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> getNewFriendUuidFieldBuilder() {
         if (this.newFriendUuidBuilder_ == null) {
            this.newFriendUuidBuilder_ = new SingleFieldBuilderV3<>(this.getNewFriendUuid(), this.getParentForChildren(), this.isClean());
            this.newFriendUuid_ = null;
         }

         return this.newFriendUuidBuilder_;
      }

      @Override
      public boolean hasNewFriend() {
         return (this.bitField0_ & 2) != 0;
      }

      @Override
      public UuidAndUsername getNewFriend() {
         if (this.newFriendBuilder_ == null) {
            return this.newFriend_ == null ? UuidAndUsername.getDefaultInstance() : this.newFriend_;
         } else {
            return this.newFriendBuilder_.getMessage();
         }
      }

      public FriendRequestAcceptedPush.Builder setNewFriend(UuidAndUsername var1) {
         if (this.newFriendBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.newFriend_ = var1;
         } else {
            this.newFriendBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public FriendRequestAcceptedPush.Builder setNewFriend(UuidAndUsername.Builder var1) {
         if (this.newFriendBuilder_ == null) {
            this.newFriend_ = var1.build();
         } else {
            this.newFriendBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public FriendRequestAcceptedPush.Builder mergeNewFriend(UuidAndUsername var1) {
         if (this.newFriendBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0 && this.newFriend_ != null && this.newFriend_ != UuidAndUsername.getDefaultInstance()) {
               this.getNewFriendBuilder().mergeFrom(var1);
            } else {
               this.newFriend_ = var1;
            }
         } else {
            this.newFriendBuilder_.mergeFrom(var1);
         }

         if (this.newFriend_ != null) {
            this.bitField0_ |= 2;
            this.onChanged();
         }

         return this;
      }

      public FriendRequestAcceptedPush.Builder clearNewFriend() {
         this.bitField0_ &= -3;
         this.newFriend_ = null;
         if (this.newFriendBuilder_ != null) {
            this.newFriendBuilder_.dispose();
            this.newFriendBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public UuidAndUsername.Builder getNewFriendBuilder() {
         this.bitField0_ |= 2;
         this.onChanged();
         return this.getNewFriendFieldBuilder().getBuilder();
      }

      @Override
      public UuidAndUsernameOrBuilder getNewFriendOrBuilder() {
         if (this.newFriendBuilder_ != null) {
            return this.newFriendBuilder_.getMessageOrBuilder();
         } else {
            return this.newFriend_ == null ? UuidAndUsername.getDefaultInstance() : this.newFriend_;
         }
      }

      private SingleFieldBuilderV3<UuidAndUsername, UuidAndUsername.Builder, UuidAndUsernameOrBuilder> getNewFriendFieldBuilder() {
         if (this.newFriendBuilder_ == null) {
            this.newFriendBuilder_ = new SingleFieldBuilderV3<>(this.getNewFriend(), this.getParentForChildren(), this.isClean());
            this.newFriend_ = null;
         }

         return this.newFriendBuilder_;
      }

      public final FriendRequestAcceptedPush.Builder setUnknownFields(UnknownFieldSet var1) {
         return (FriendRequestAcceptedPush.Builder)super.setUnknownFields(var1);
      }

      public final FriendRequestAcceptedPush.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (FriendRequestAcceptedPush.Builder)super.mergeUnknownFields(var1);
      }
   }
}
