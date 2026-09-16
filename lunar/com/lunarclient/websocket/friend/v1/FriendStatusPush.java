package com.lunarclient.websocket.friend.v1;

import com.google.protobuf.AbstractMessageLite;
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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class FriendStatusPush extends GeneratedMessageV3 implements FriendStatusPushOrBuilder {
   private static final long serialVersionUID = 0L;
   private int friendCase_ = 0;
   private Object friend_;
   public static final int ONLINE_FRIEND_FIELD_NUMBER = 1;
   public static final int OFFLINE_FRIEND_FIELD_NUMBER = 2;
   private byte memoizedIsInitialized = -1;
   private static final FriendStatusPush DEFAULT_INSTANCE = new FriendStatusPush();
   private static final Parser<FriendStatusPush> PARSER = new AbstractParser<FriendStatusPush>() {
      public FriendStatusPush parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         FriendStatusPush.Builder var3 = FriendStatusPush.newBuilder();

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

   private FriendStatusPush(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private FriendStatusPush() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new FriendStatusPush();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return PushProto.internal_static_lunarclient_websocket_friend_v1_FriendStatusPush_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return PushProto.internal_static_lunarclient_websocket_friend_v1_FriendStatusPush_fieldAccessorTable
         .ensureFieldAccessorsInitialized(FriendStatusPush.class, FriendStatusPush.Builder.class);
   }

   @Override
   public FriendStatusPush.FriendCase getFriendCase() {
      return FriendStatusPush.FriendCase.forNumber(this.friendCase_);
   }

   @Override
   public boolean hasOnlineFriend() {
      return this.friendCase_ == 1;
   }

   @Override
   public OnlineFriend getOnlineFriend() {
      return this.friendCase_ == 1 ? (OnlineFriend)this.friend_ : OnlineFriend.getDefaultInstance();
   }

   @Override
   public OnlineFriendOrBuilder getOnlineFriendOrBuilder() {
      return this.friendCase_ == 1 ? (OnlineFriend)this.friend_ : OnlineFriend.getDefaultInstance();
   }

   @Override
   public boolean hasOfflineFriend() {
      return this.friendCase_ == 2;
   }

   @Override
   public OfflineFriend getOfflineFriend() {
      return this.friendCase_ == 2 ? (OfflineFriend)this.friend_ : OfflineFriend.getDefaultInstance();
   }

   @Override
   public OfflineFriendOrBuilder getOfflineFriendOrBuilder() {
      return this.friendCase_ == 2 ? (OfflineFriend)this.friend_ : OfflineFriend.getDefaultInstance();
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
      if (this.friendCase_ == 1) {
         var1.writeMessage(1, (OnlineFriend)this.friend_);
      }

      if (this.friendCase_ == 2) {
         var1.writeMessage(2, (OfflineFriend)this.friend_);
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
      if (this.friendCase_ == 1) {
         var1 += CodedOutputStream.computeMessageSize(1, (OnlineFriend)this.friend_);
      }

      if (this.friendCase_ == 2) {
         var1 += CodedOutputStream.computeMessageSize(2, (OfflineFriend)this.friend_);
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

      if (!(var1 instanceof FriendStatusPush)) {
         return super.equals(var1);
      }

      FriendStatusPush var2 = (FriendStatusPush)var1;
      if (!this.getFriendCase().equals(var2.getFriendCase())) {
         return false;
      }

      switch (this.friendCase_) {
         case 0:
         default:
            break;
         case 1:
            if (!this.getOnlineFriend().equals(var2.getOnlineFriend())) {
               return false;
            }
            break;
         case 2:
            if (!this.getOfflineFriend().equals(var2.getOfflineFriend())) {
               return false;
            }
      }

      return this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      switch (this.friendCase_) {
         case 0:
         default:
            break;
         case 1:
            var1 = 37 * var1 + 1;
            var1 = 53 * var1 + this.getOnlineFriend().hashCode();
            break;
         case 2:
            var1 = 37 * var1 + 2;
            var1 = 53 * var1 + this.getOfflineFriend().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static FriendStatusPush parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static FriendStatusPush parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static FriendStatusPush parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static FriendStatusPush parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static FriendStatusPush parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static FriendStatusPush parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static FriendStatusPush parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static FriendStatusPush parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static FriendStatusPush parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static FriendStatusPush parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static FriendStatusPush parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static FriendStatusPush parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public FriendStatusPush.Builder newBuilderForType() {
      return newBuilder();
   }

   public static FriendStatusPush.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static FriendStatusPush.Builder newBuilder(FriendStatusPush var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public FriendStatusPush.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new FriendStatusPush.Builder() : new FriendStatusPush.Builder().mergeFrom(this);
   }

   protected FriendStatusPush.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new FriendStatusPush.Builder(var1);
   }

   public static FriendStatusPush getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<FriendStatusPush> parser() {
      return PARSER;
   }

   @Override
   public Parser<FriendStatusPush> getParserForType() {
      return PARSER;
   }

   public FriendStatusPush getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<FriendStatusPush.Builder> implements FriendStatusPushOrBuilder {
      private int friendCase_ = 0;
      private Object friend_;
      private int bitField0_;
      private SingleFieldBuilderV3<OnlineFriend, OnlineFriend.Builder, OnlineFriendOrBuilder> onlineFriendBuilder_;
      private SingleFieldBuilderV3<OfflineFriend, OfflineFriend.Builder, OfflineFriendOrBuilder> offlineFriendBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return PushProto.internal_static_lunarclient_websocket_friend_v1_FriendStatusPush_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PushProto.internal_static_lunarclient_websocket_friend_v1_FriendStatusPush_fieldAccessorTable
            .ensureFieldAccessorsInitialized(FriendStatusPush.class, FriendStatusPush.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public FriendStatusPush.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         if (this.onlineFriendBuilder_ != null) {
            this.onlineFriendBuilder_.clear();
         }

         if (this.offlineFriendBuilder_ != null) {
            this.offlineFriendBuilder_.clear();
         }

         this.friendCase_ = 0;
         this.friend_ = null;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return PushProto.internal_static_lunarclient_websocket_friend_v1_FriendStatusPush_descriptor;
      }

      public FriendStatusPush getDefaultInstanceForType() {
         return FriendStatusPush.getDefaultInstance();
      }

      public FriendStatusPush build() {
         FriendStatusPush var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public FriendStatusPush buildPartial() {
         FriendStatusPush var1 = new FriendStatusPush(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.buildPartialOneofs(var1);
         this.onBuilt();
         return var1;
      }

      private void buildPartial0(FriendStatusPush var1) {
         int var2 = this.bitField0_;
      }

      private void buildPartialOneofs(FriendStatusPush var1) {
         var1.friendCase_ = this.friendCase_;
         var1.friend_ = this.friend_;
         if (this.friendCase_ == 1 && this.onlineFriendBuilder_ != null) {
            var1.friend_ = this.onlineFriendBuilder_.build();
         }

         if (this.friendCase_ == 2 && this.offlineFriendBuilder_ != null) {
            var1.friend_ = this.offlineFriendBuilder_.build();
         }
      }

      public FriendStatusPush.Builder clone() {
         return (FriendStatusPush.Builder)super.clone();
      }

      public FriendStatusPush.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (FriendStatusPush.Builder)super.setField(var1, var2);
      }

      public FriendStatusPush.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (FriendStatusPush.Builder)super.clearField(var1);
      }

      public FriendStatusPush.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (FriendStatusPush.Builder)super.clearOneof(var1);
      }

      public FriendStatusPush.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (FriendStatusPush.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public FriendStatusPush.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (FriendStatusPush.Builder)super.addRepeatedField(var1, var2);
      }

      public FriendStatusPush.Builder mergeFrom(Message var1) {
         if (var1 instanceof FriendStatusPush) {
            return this.mergeFrom((FriendStatusPush)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public FriendStatusPush.Builder mergeFrom(FriendStatusPush var1) {
         if (var1 == FriendStatusPush.getDefaultInstance()) {
            return this;
         }

         switch (var1.getFriendCase()) {
            case ONLINE_FRIEND:
               this.mergeOnlineFriend(var1.getOnlineFriend());
               break;
            case OFFLINE_FRIEND:
               this.mergeOfflineFriend(var1.getOfflineFriend());
            case FRIEND_NOT_SET:
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public FriendStatusPush.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getOnlineFriendFieldBuilder().getBuilder(), var2);
                     this.friendCase_ = 1;
                     break;
                  case 18:
                     var1.readMessage(this.getOfflineFriendFieldBuilder().getBuilder(), var2);
                     this.friendCase_ = 2;
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
      public FriendStatusPush.FriendCase getFriendCase() {
         return FriendStatusPush.FriendCase.forNumber(this.friendCase_);
      }

      public FriendStatusPush.Builder clearFriend() {
         this.friendCase_ = 0;
         this.friend_ = null;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasOnlineFriend() {
         return this.friendCase_ == 1;
      }

      @Override
      public OnlineFriend getOnlineFriend() {
         if (this.onlineFriendBuilder_ == null) {
            return this.friendCase_ == 1 ? (OnlineFriend)this.friend_ : OnlineFriend.getDefaultInstance();
         } else {
            return this.friendCase_ == 1 ? this.onlineFriendBuilder_.getMessage() : OnlineFriend.getDefaultInstance();
         }
      }

      public FriendStatusPush.Builder setOnlineFriend(OnlineFriend var1) {
         if (this.onlineFriendBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.friend_ = var1;
            this.onChanged();
         } else {
            this.onlineFriendBuilder_.setMessage(var1);
         }

         this.friendCase_ = 1;
         return this;
      }

      public FriendStatusPush.Builder setOnlineFriend(OnlineFriend.Builder var1) {
         if (this.onlineFriendBuilder_ == null) {
            this.friend_ = var1.build();
            this.onChanged();
         } else {
            this.onlineFriendBuilder_.setMessage(var1.build());
         }

         this.friendCase_ = 1;
         return this;
      }

      public FriendStatusPush.Builder mergeOnlineFriend(OnlineFriend var1) {
         if (this.onlineFriendBuilder_ == null) {
            if (this.friendCase_ == 1 && this.friend_ != OnlineFriend.getDefaultInstance()) {
               this.friend_ = OnlineFriend.newBuilder((OnlineFriend)this.friend_).mergeFrom(var1).buildPartial();
            } else {
               this.friend_ = var1;
            }

            this.onChanged();
         } else if (this.friendCase_ == 1) {
            this.onlineFriendBuilder_.mergeFrom(var1);
         } else {
            this.onlineFriendBuilder_.setMessage(var1);
         }

         this.friendCase_ = 1;
         return this;
      }

      public FriendStatusPush.Builder clearOnlineFriend() {
         if (this.onlineFriendBuilder_ == null) {
            if (this.friendCase_ == 1) {
               this.friendCase_ = 0;
               this.friend_ = null;
               this.onChanged();
            }
         } else {
            if (this.friendCase_ == 1) {
               this.friendCase_ = 0;
               this.friend_ = null;
            }

            this.onlineFriendBuilder_.clear();
         }

         return this;
      }

      public OnlineFriend.Builder getOnlineFriendBuilder() {
         return this.getOnlineFriendFieldBuilder().getBuilder();
      }

      @Override
      public OnlineFriendOrBuilder getOnlineFriendOrBuilder() {
         if (this.friendCase_ == 1 && this.onlineFriendBuilder_ != null) {
            return this.onlineFriendBuilder_.getMessageOrBuilder();
         } else {
            return this.friendCase_ == 1 ? (OnlineFriend)this.friend_ : OnlineFriend.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<OnlineFriend, OnlineFriend.Builder, OnlineFriendOrBuilder> getOnlineFriendFieldBuilder() {
         if (this.onlineFriendBuilder_ == null) {
            if (this.friendCase_ != 1) {
               this.friend_ = OnlineFriend.getDefaultInstance();
            }

            this.onlineFriendBuilder_ = new SingleFieldBuilderV3<>((OnlineFriend)this.friend_, this.getParentForChildren(), this.isClean());
            this.friend_ = null;
         }

         this.friendCase_ = 1;
         this.onChanged();
         return this.onlineFriendBuilder_;
      }

      @Override
      public boolean hasOfflineFriend() {
         return this.friendCase_ == 2;
      }

      @Override
      public OfflineFriend getOfflineFriend() {
         if (this.offlineFriendBuilder_ == null) {
            return this.friendCase_ == 2 ? (OfflineFriend)this.friend_ : OfflineFriend.getDefaultInstance();
         } else {
            return this.friendCase_ == 2 ? this.offlineFriendBuilder_.getMessage() : OfflineFriend.getDefaultInstance();
         }
      }

      public FriendStatusPush.Builder setOfflineFriend(OfflineFriend var1) {
         if (this.offlineFriendBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.friend_ = var1;
            this.onChanged();
         } else {
            this.offlineFriendBuilder_.setMessage(var1);
         }

         this.friendCase_ = 2;
         return this;
      }

      public FriendStatusPush.Builder setOfflineFriend(OfflineFriend.Builder var1) {
         if (this.offlineFriendBuilder_ == null) {
            this.friend_ = var1.build();
            this.onChanged();
         } else {
            this.offlineFriendBuilder_.setMessage(var1.build());
         }

         this.friendCase_ = 2;
         return this;
      }

      public FriendStatusPush.Builder mergeOfflineFriend(OfflineFriend var1) {
         if (this.offlineFriendBuilder_ == null) {
            if (this.friendCase_ == 2 && this.friend_ != OfflineFriend.getDefaultInstance()) {
               this.friend_ = OfflineFriend.newBuilder((OfflineFriend)this.friend_).mergeFrom(var1).buildPartial();
            } else {
               this.friend_ = var1;
            }

            this.onChanged();
         } else if (this.friendCase_ == 2) {
            this.offlineFriendBuilder_.mergeFrom(var1);
         } else {
            this.offlineFriendBuilder_.setMessage(var1);
         }

         this.friendCase_ = 2;
         return this;
      }

      public FriendStatusPush.Builder clearOfflineFriend() {
         if (this.offlineFriendBuilder_ == null) {
            if (this.friendCase_ == 2) {
               this.friendCase_ = 0;
               this.friend_ = null;
               this.onChanged();
            }
         } else {
            if (this.friendCase_ == 2) {
               this.friendCase_ = 0;
               this.friend_ = null;
            }

            this.offlineFriendBuilder_.clear();
         }

         return this;
      }

      public OfflineFriend.Builder getOfflineFriendBuilder() {
         return this.getOfflineFriendFieldBuilder().getBuilder();
      }

      @Override
      public OfflineFriendOrBuilder getOfflineFriendOrBuilder() {
         if (this.friendCase_ == 2 && this.offlineFriendBuilder_ != null) {
            return this.offlineFriendBuilder_.getMessageOrBuilder();
         } else {
            return this.friendCase_ == 2 ? (OfflineFriend)this.friend_ : OfflineFriend.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<OfflineFriend, OfflineFriend.Builder, OfflineFriendOrBuilder> getOfflineFriendFieldBuilder() {
         if (this.offlineFriendBuilder_ == null) {
            if (this.friendCase_ != 2) {
               this.friend_ = OfflineFriend.getDefaultInstance();
            }

            this.offlineFriendBuilder_ = new SingleFieldBuilderV3<>((OfflineFriend)this.friend_, this.getParentForChildren(), this.isClean());
            this.friend_ = null;
         }

         this.friendCase_ = 2;
         this.onChanged();
         return this.offlineFriendBuilder_;
      }

      public final FriendStatusPush.Builder setUnknownFields(UnknownFieldSet var1) {
         return (FriendStatusPush.Builder)super.setUnknownFields(var1);
      }

      public final FriendStatusPush.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (FriendStatusPush.Builder)super.mergeUnknownFields(var1);
      }
   }

   public enum FriendCase implements AbstractMessageLite.InternalOneOfEnum, Internal.EnumLite {
      ONLINE_FRIEND(1),
      OFFLINE_FRIEND(2),
      FRIEND_NOT_SET(0);

      private final int value;

      FriendCase(int var3) {
         this.value = var3;
      }

      @Deprecated
      public static FriendStatusPush.FriendCase valueOf(int var0) {
         return forNumber(var0);
      }

      public static FriendStatusPush.FriendCase forNumber(int var0) {
         switch (var0) {
            case 0:
               return FRIEND_NOT_SET;
            case 1:
               return ONLINE_FRIEND;
            case 2:
               return OFFLINE_FRIEND;
            default:
               return null;
         }
      }

      @Override
      public int getNumber() {
         return this.value;
      }
   }
}
