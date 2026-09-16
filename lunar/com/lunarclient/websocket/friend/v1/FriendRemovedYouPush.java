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

public final class FriendRemovedYouPush extends GeneratedMessageV3 implements FriendRemovedYouPushOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int FRIEND_UUID_FIELD_NUMBER = 1;
   private Uuid friendUuid_;
   private byte memoizedIsInitialized = -1;
   private static final FriendRemovedYouPush DEFAULT_INSTANCE = new FriendRemovedYouPush();
   private static final Parser<FriendRemovedYouPush> PARSER = new AbstractParser<FriendRemovedYouPush>() {
      public FriendRemovedYouPush parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         FriendRemovedYouPush.Builder var3 = FriendRemovedYouPush.newBuilder();

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

   private FriendRemovedYouPush(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private FriendRemovedYouPush() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new FriendRemovedYouPush();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return PushProto.internal_static_lunarclient_websocket_friend_v1_FriendRemovedYouPush_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return PushProto.internal_static_lunarclient_websocket_friend_v1_FriendRemovedYouPush_fieldAccessorTable
         .ensureFieldAccessorsInitialized(FriendRemovedYouPush.class, FriendRemovedYouPush.Builder.class);
   }

   @Override
   public boolean hasFriendUuid() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public Uuid getFriendUuid() {
      return this.friendUuid_ == null ? Uuid.getDefaultInstance() : this.friendUuid_;
   }

   @Override
   public UuidOrBuilder getFriendUuidOrBuilder() {
      return this.friendUuid_ == null ? Uuid.getDefaultInstance() : this.friendUuid_;
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
         var1.writeMessage(1, this.getFriendUuid());
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
         var1 += CodedOutputStream.computeMessageSize(1, this.getFriendUuid());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof FriendRemovedYouPush)) {
         return super.equals(var1);
      } else {
         FriendRemovedYouPush var2 = (FriendRemovedYouPush)var1;
         if (this.hasFriendUuid() != var2.hasFriendUuid()) {
            return false;
         } else {
            return this.hasFriendUuid() && !this.getFriendUuid().equals(var2.getFriendUuid()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.hasFriendUuid()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getFriendUuid().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static FriendRemovedYouPush parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static FriendRemovedYouPush parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static FriendRemovedYouPush parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static FriendRemovedYouPush parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static FriendRemovedYouPush parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static FriendRemovedYouPush parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static FriendRemovedYouPush parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static FriendRemovedYouPush parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static FriendRemovedYouPush parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static FriendRemovedYouPush parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static FriendRemovedYouPush parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static FriendRemovedYouPush parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public FriendRemovedYouPush.Builder newBuilderForType() {
      return newBuilder();
   }

   public static FriendRemovedYouPush.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static FriendRemovedYouPush.Builder newBuilder(FriendRemovedYouPush var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public FriendRemovedYouPush.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new FriendRemovedYouPush.Builder() : new FriendRemovedYouPush.Builder().mergeFrom(this);
   }

   protected FriendRemovedYouPush.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new FriendRemovedYouPush.Builder(var1);
   }

   public static FriendRemovedYouPush getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<FriendRemovedYouPush> parser() {
      return PARSER;
   }

   @Override
   public Parser<FriendRemovedYouPush> getParserForType() {
      return PARSER;
   }

   public FriendRemovedYouPush getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<FriendRemovedYouPush.Builder> implements FriendRemovedYouPushOrBuilder {
      private int bitField0_;
      private Uuid friendUuid_;
      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> friendUuidBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return PushProto.internal_static_lunarclient_websocket_friend_v1_FriendRemovedYouPush_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PushProto.internal_static_lunarclient_websocket_friend_v1_FriendRemovedYouPush_fieldAccessorTable
            .ensureFieldAccessorsInitialized(FriendRemovedYouPush.class, FriendRemovedYouPush.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (FriendRemovedYouPush.alwaysUseFieldBuilders) {
            this.getFriendUuidFieldBuilder();
         }
      }

      public FriendRemovedYouPush.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.friendUuid_ = null;
         if (this.friendUuidBuilder_ != null) {
            this.friendUuidBuilder_.dispose();
            this.friendUuidBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return PushProto.internal_static_lunarclient_websocket_friend_v1_FriendRemovedYouPush_descriptor;
      }

      public FriendRemovedYouPush getDefaultInstanceForType() {
         return FriendRemovedYouPush.getDefaultInstance();
      }

      public FriendRemovedYouPush build() {
         FriendRemovedYouPush var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public FriendRemovedYouPush buildPartial() {
         FriendRemovedYouPush var1 = new FriendRemovedYouPush(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(FriendRemovedYouPush var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.friendUuid_ = this.friendUuidBuilder_ == null ? this.friendUuid_ : this.friendUuidBuilder_.build();
            var3 |= 1;
         }

         FriendRemovedYouPush var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public FriendRemovedYouPush.Builder clone() {
         return (FriendRemovedYouPush.Builder)super.clone();
      }

      public FriendRemovedYouPush.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (FriendRemovedYouPush.Builder)super.setField(var1, var2);
      }

      public FriendRemovedYouPush.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (FriendRemovedYouPush.Builder)super.clearField(var1);
      }

      public FriendRemovedYouPush.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (FriendRemovedYouPush.Builder)super.clearOneof(var1);
      }

      public FriendRemovedYouPush.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (FriendRemovedYouPush.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public FriendRemovedYouPush.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (FriendRemovedYouPush.Builder)super.addRepeatedField(var1, var2);
      }

      public FriendRemovedYouPush.Builder mergeFrom(Message var1) {
         if (var1 instanceof FriendRemovedYouPush) {
            return this.mergeFrom((FriendRemovedYouPush)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public FriendRemovedYouPush.Builder mergeFrom(FriendRemovedYouPush var1) {
         if (var1 == FriendRemovedYouPush.getDefaultInstance()) {
            return this;
         }

         if (var1.hasFriendUuid()) {
            this.mergeFriendUuid(var1.getFriendUuid());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public FriendRemovedYouPush.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getFriendUuidFieldBuilder().getBuilder(), var2);
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
      public boolean hasFriendUuid() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public Uuid getFriendUuid() {
         if (this.friendUuidBuilder_ == null) {
            return this.friendUuid_ == null ? Uuid.getDefaultInstance() : this.friendUuid_;
         } else {
            return this.friendUuidBuilder_.getMessage();
         }
      }

      public FriendRemovedYouPush.Builder setFriendUuid(Uuid var1) {
         if (this.friendUuidBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.friendUuid_ = var1;
         } else {
            this.friendUuidBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public FriendRemovedYouPush.Builder setFriendUuid(Uuid.Builder var1) {
         if (this.friendUuidBuilder_ == null) {
            this.friendUuid_ = var1.build();
         } else {
            this.friendUuidBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public FriendRemovedYouPush.Builder mergeFriendUuid(Uuid var1) {
         if (this.friendUuidBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.friendUuid_ != null && this.friendUuid_ != Uuid.getDefaultInstance()) {
               this.getFriendUuidBuilder().mergeFrom(var1);
            } else {
               this.friendUuid_ = var1;
            }
         } else {
            this.friendUuidBuilder_.mergeFrom(var1);
         }

         if (this.friendUuid_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public FriendRemovedYouPush.Builder clearFriendUuid() {
         this.bitField0_ &= -2;
         this.friendUuid_ = null;
         if (this.friendUuidBuilder_ != null) {
            this.friendUuidBuilder_.dispose();
            this.friendUuidBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Uuid.Builder getFriendUuidBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getFriendUuidFieldBuilder().getBuilder();
      }

      @Override
      public UuidOrBuilder getFriendUuidOrBuilder() {
         if (this.friendUuidBuilder_ != null) {
            return this.friendUuidBuilder_.getMessageOrBuilder();
         } else {
            return this.friendUuid_ == null ? Uuid.getDefaultInstance() : this.friendUuid_;
         }
      }

      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> getFriendUuidFieldBuilder() {
         if (this.friendUuidBuilder_ == null) {
            this.friendUuidBuilder_ = new SingleFieldBuilderV3<>(this.getFriendUuid(), this.getParentForChildren(), this.isClean());
            this.friendUuid_ = null;
         }

         return this.friendUuidBuilder_;
      }

      public final FriendRemovedYouPush.Builder setUnknownFields(UnknownFieldSet var1) {
         return (FriendRemovedYouPush.Builder)super.setUnknownFields(var1);
      }

      public final FriendRemovedYouPush.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (FriendRemovedYouPush.Builder)super.mergeUnknownFields(var1);
      }
   }
}
