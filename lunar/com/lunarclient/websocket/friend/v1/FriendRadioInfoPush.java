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
import com.lunarclient.common.v1.RadioInfo;
import com.lunarclient.common.v1.RadioInfoOrBuilder;
import com.lunarclient.common.v1.Uuid;
import com.lunarclient.common.v1.UuidOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class FriendRadioInfoPush extends GeneratedMessageV3 implements FriendRadioInfoPushOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int FRIEND_UUID_FIELD_NUMBER = 1;
   private Uuid friendUuid_;
   public static final int RADIO_INFO_FIELD_NUMBER = 2;
   private RadioInfo radioInfo_;
   private byte memoizedIsInitialized = -1;
   private static final FriendRadioInfoPush DEFAULT_INSTANCE = new FriendRadioInfoPush();
   private static final Parser<FriendRadioInfoPush> PARSER = new AbstractParser<FriendRadioInfoPush>() {
      public FriendRadioInfoPush parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         FriendRadioInfoPush.Builder var3 = FriendRadioInfoPush.newBuilder();

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

   private FriendRadioInfoPush(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private FriendRadioInfoPush() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new FriendRadioInfoPush();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return PushProto.internal_static_lunarclient_websocket_friend_v1_FriendRadioInfoPush_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return PushProto.internal_static_lunarclient_websocket_friend_v1_FriendRadioInfoPush_fieldAccessorTable
         .ensureFieldAccessorsInitialized(FriendRadioInfoPush.class, FriendRadioInfoPush.Builder.class);
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
   public boolean hasRadioInfo() {
      return (this.bitField0_ & 2) != 0;
   }

   @Override
   public RadioInfo getRadioInfo() {
      return this.radioInfo_ == null ? RadioInfo.getDefaultInstance() : this.radioInfo_;
   }

   @Override
   public RadioInfoOrBuilder getRadioInfoOrBuilder() {
      return this.radioInfo_ == null ? RadioInfo.getDefaultInstance() : this.radioInfo_;
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

      if ((this.bitField0_ & 2) != 0) {
         var1.writeMessage(2, this.getRadioInfo());
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

      if ((this.bitField0_ & 2) != 0) {
         var1 += CodedOutputStream.computeMessageSize(2, this.getRadioInfo());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof FriendRadioInfoPush)) {
         return super.equals(var1);
      } else {
         FriendRadioInfoPush var2 = (FriendRadioInfoPush)var1;
         if (this.hasFriendUuid() != var2.hasFriendUuid()) {
            return false;
         } else if (this.hasFriendUuid() && !this.getFriendUuid().equals(var2.getFriendUuid())) {
            return false;
         } else if (this.hasRadioInfo() != var2.hasRadioInfo()) {
            return false;
         } else {
            return this.hasRadioInfo() && !this.getRadioInfo().equals(var2.getRadioInfo()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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

      if (this.hasRadioInfo()) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getRadioInfo().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static FriendRadioInfoPush parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static FriendRadioInfoPush parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static FriendRadioInfoPush parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static FriendRadioInfoPush parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static FriendRadioInfoPush parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static FriendRadioInfoPush parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static FriendRadioInfoPush parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static FriendRadioInfoPush parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static FriendRadioInfoPush parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static FriendRadioInfoPush parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static FriendRadioInfoPush parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static FriendRadioInfoPush parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public FriendRadioInfoPush.Builder newBuilderForType() {
      return newBuilder();
   }

   public static FriendRadioInfoPush.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static FriendRadioInfoPush.Builder newBuilder(FriendRadioInfoPush var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public FriendRadioInfoPush.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new FriendRadioInfoPush.Builder() : new FriendRadioInfoPush.Builder().mergeFrom(this);
   }

   protected FriendRadioInfoPush.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new FriendRadioInfoPush.Builder(var1);
   }

   public static FriendRadioInfoPush getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<FriendRadioInfoPush> parser() {
      return PARSER;
   }

   @Override
   public Parser<FriendRadioInfoPush> getParserForType() {
      return PARSER;
   }

   public FriendRadioInfoPush getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<FriendRadioInfoPush.Builder> implements FriendRadioInfoPushOrBuilder {
      private int bitField0_;
      private Uuid friendUuid_;
      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> friendUuidBuilder_;
      private RadioInfo radioInfo_;
      private SingleFieldBuilderV3<RadioInfo, RadioInfo.Builder, RadioInfoOrBuilder> radioInfoBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return PushProto.internal_static_lunarclient_websocket_friend_v1_FriendRadioInfoPush_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PushProto.internal_static_lunarclient_websocket_friend_v1_FriendRadioInfoPush_fieldAccessorTable
            .ensureFieldAccessorsInitialized(FriendRadioInfoPush.class, FriendRadioInfoPush.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (FriendRadioInfoPush.alwaysUseFieldBuilders) {
            this.getFriendUuidFieldBuilder();
            this.getRadioInfoFieldBuilder();
         }
      }

      public FriendRadioInfoPush.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.friendUuid_ = null;
         if (this.friendUuidBuilder_ != null) {
            this.friendUuidBuilder_.dispose();
            this.friendUuidBuilder_ = null;
         }

         this.radioInfo_ = null;
         if (this.radioInfoBuilder_ != null) {
            this.radioInfoBuilder_.dispose();
            this.radioInfoBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return PushProto.internal_static_lunarclient_websocket_friend_v1_FriendRadioInfoPush_descriptor;
      }

      public FriendRadioInfoPush getDefaultInstanceForType() {
         return FriendRadioInfoPush.getDefaultInstance();
      }

      public FriendRadioInfoPush build() {
         FriendRadioInfoPush var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public FriendRadioInfoPush buildPartial() {
         FriendRadioInfoPush var1 = new FriendRadioInfoPush(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(FriendRadioInfoPush var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.friendUuid_ = this.friendUuidBuilder_ == null ? this.friendUuid_ : this.friendUuidBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.radioInfo_ = this.radioInfoBuilder_ == null ? this.radioInfo_ : this.radioInfoBuilder_.build();
            var3 |= 2;
         }

         FriendRadioInfoPush var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public FriendRadioInfoPush.Builder clone() {
         return (FriendRadioInfoPush.Builder)super.clone();
      }

      public FriendRadioInfoPush.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (FriendRadioInfoPush.Builder)super.setField(var1, var2);
      }

      public FriendRadioInfoPush.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (FriendRadioInfoPush.Builder)super.clearField(var1);
      }

      public FriendRadioInfoPush.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (FriendRadioInfoPush.Builder)super.clearOneof(var1);
      }

      public FriendRadioInfoPush.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (FriendRadioInfoPush.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public FriendRadioInfoPush.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (FriendRadioInfoPush.Builder)super.addRepeatedField(var1, var2);
      }

      public FriendRadioInfoPush.Builder mergeFrom(Message var1) {
         if (var1 instanceof FriendRadioInfoPush) {
            return this.mergeFrom((FriendRadioInfoPush)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public FriendRadioInfoPush.Builder mergeFrom(FriendRadioInfoPush var1) {
         if (var1 == FriendRadioInfoPush.getDefaultInstance()) {
            return this;
         }

         if (var1.hasFriendUuid()) {
            this.mergeFriendUuid(var1.getFriendUuid());
         }

         if (var1.hasRadioInfo()) {
            this.mergeRadioInfo(var1.getRadioInfo());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public FriendRadioInfoPush.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                  case 18:
                     var1.readMessage(this.getRadioInfoFieldBuilder().getBuilder(), var2);
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

      public FriendRadioInfoPush.Builder setFriendUuid(Uuid var1) {
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

      public FriendRadioInfoPush.Builder setFriendUuid(Uuid.Builder var1) {
         if (this.friendUuidBuilder_ == null) {
            this.friendUuid_ = var1.build();
         } else {
            this.friendUuidBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public FriendRadioInfoPush.Builder mergeFriendUuid(Uuid var1) {
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

      public FriendRadioInfoPush.Builder clearFriendUuid() {
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

      @Override
      public boolean hasRadioInfo() {
         return (this.bitField0_ & 2) != 0;
      }

      @Override
      public RadioInfo getRadioInfo() {
         if (this.radioInfoBuilder_ == null) {
            return this.radioInfo_ == null ? RadioInfo.getDefaultInstance() : this.radioInfo_;
         } else {
            return this.radioInfoBuilder_.getMessage();
         }
      }

      public FriendRadioInfoPush.Builder setRadioInfo(RadioInfo var1) {
         if (this.radioInfoBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.radioInfo_ = var1;
         } else {
            this.radioInfoBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public FriendRadioInfoPush.Builder setRadioInfo(RadioInfo.Builder var1) {
         if (this.radioInfoBuilder_ == null) {
            this.radioInfo_ = var1.build();
         } else {
            this.radioInfoBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public FriendRadioInfoPush.Builder mergeRadioInfo(RadioInfo var1) {
         if (this.radioInfoBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0 && this.radioInfo_ != null && this.radioInfo_ != RadioInfo.getDefaultInstance()) {
               this.getRadioInfoBuilder().mergeFrom(var1);
            } else {
               this.radioInfo_ = var1;
            }
         } else {
            this.radioInfoBuilder_.mergeFrom(var1);
         }

         if (this.radioInfo_ != null) {
            this.bitField0_ |= 2;
            this.onChanged();
         }

         return this;
      }

      public FriendRadioInfoPush.Builder clearRadioInfo() {
         this.bitField0_ &= -3;
         this.radioInfo_ = null;
         if (this.radioInfoBuilder_ != null) {
            this.radioInfoBuilder_.dispose();
            this.radioInfoBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public RadioInfo.Builder getRadioInfoBuilder() {
         this.bitField0_ |= 2;
         this.onChanged();
         return this.getRadioInfoFieldBuilder().getBuilder();
      }

      @Override
      public RadioInfoOrBuilder getRadioInfoOrBuilder() {
         if (this.radioInfoBuilder_ != null) {
            return this.radioInfoBuilder_.getMessageOrBuilder();
         } else {
            return this.radioInfo_ == null ? RadioInfo.getDefaultInstance() : this.radioInfo_;
         }
      }

      private SingleFieldBuilderV3<RadioInfo, RadioInfo.Builder, RadioInfoOrBuilder> getRadioInfoFieldBuilder() {
         if (this.radioInfoBuilder_ == null) {
            this.radioInfoBuilder_ = new SingleFieldBuilderV3<>(this.getRadioInfo(), this.getParentForChildren(), this.isClean());
            this.radioInfo_ = null;
         }

         return this.radioInfoBuilder_;
      }

      public final FriendRadioInfoPush.Builder setUnknownFields(UnknownFieldSet var1) {
         return (FriendRadioInfoPush.Builder)super.setUnknownFields(var1);
      }

      public final FriendRadioInfoPush.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (FriendRadioInfoPush.Builder)super.mergeUnknownFields(var1);
      }
   }
}
