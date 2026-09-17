package com.lunarclient.websocket.friend.v1;

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
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class AcceptFriendRequestResponse extends GeneratedMessageV3 implements AcceptFriendRequestResponseOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int STATUS_FIELD_NUMBER = 1;
   private int status_ = 0;
   public static final int OFFLINE_FRIEND_FIELD_NUMBER = 2;
   private OfflineFriend offlineFriend_;
   private byte memoizedIsInitialized = -1;
   private static final AcceptFriendRequestResponse DEFAULT_INSTANCE = new AcceptFriendRequestResponse();
   private static final Parser<AcceptFriendRequestResponse> PARSER = new AbstractParser<AcceptFriendRequestResponse>() {
      public AcceptFriendRequestResponse parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         AcceptFriendRequestResponse.Builder var3 = AcceptFriendRequestResponse.newBuilder();

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

   private AcceptFriendRequestResponse(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private AcceptFriendRequestResponse() {
      this.status_ = 0;
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new AcceptFriendRequestResponse();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_friend_v1_AcceptFriendRequestResponse_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_friend_v1_AcceptFriendRequestResponse_fieldAccessorTable
         .ensureFieldAccessorsInitialized(AcceptFriendRequestResponse.class, AcceptFriendRequestResponse.Builder.class);
   }

   @Override
   public int getStatusValue() {
      return this.status_;
   }

   @Override
   public AcceptFriendRequestResponse.Status getStatus() {
      AcceptFriendRequestResponse.Status var1 = AcceptFriendRequestResponse.Status.forNumber(this.status_);
      return var1 == null ? AcceptFriendRequestResponse.Status.UNRECOGNIZED : var1;
   }

   @Override
   public boolean hasOfflineFriend() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public OfflineFriend getOfflineFriend() {
      return this.offlineFriend_ == null ? OfflineFriend.getDefaultInstance() : this.offlineFriend_;
   }

   @Override
   public OfflineFriendOrBuilder getOfflineFriendOrBuilder() {
      return this.offlineFriend_ == null ? OfflineFriend.getDefaultInstance() : this.offlineFriend_;
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
      if (this.status_ != AcceptFriendRequestResponse.Status.STATUS_UNSPECIFIED.getNumber()) {
         var1.writeEnum(1, this.status_);
      }

      if ((this.bitField0_ & 1) != 0) {
         var1.writeMessage(2, this.getOfflineFriend());
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
      if (this.status_ != AcceptFriendRequestResponse.Status.STATUS_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(1, this.status_);
      }

      if ((this.bitField0_ & 1) != 0) {
         var1 += CodedOutputStream.computeMessageSize(2, this.getOfflineFriend());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof AcceptFriendRequestResponse)) {
         return super.equals(var1);
      } else {
         AcceptFriendRequestResponse var2 = (AcceptFriendRequestResponse)var1;
         if (this.status_ != var2.status_) {
            return false;
         } else if (this.hasOfflineFriend() != var2.hasOfflineFriend()) {
            return false;
         } else {
            return this.hasOfflineFriend() && !this.getOfflineFriend().equals(var2.getOfflineFriend())
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
      var1 = 37 * var1 + 1;
      var1 = 53 * var1 + this.status_;
      if (this.hasOfflineFriend()) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getOfflineFriend().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static AcceptFriendRequestResponse parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static AcceptFriendRequestResponse parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static AcceptFriendRequestResponse parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static AcceptFriendRequestResponse parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static AcceptFriendRequestResponse parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static AcceptFriendRequestResponse parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static AcceptFriendRequestResponse parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static AcceptFriendRequestResponse parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static AcceptFriendRequestResponse parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static AcceptFriendRequestResponse parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static AcceptFriendRequestResponse parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static AcceptFriendRequestResponse parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public AcceptFriendRequestResponse.Builder newBuilderForType() {
      return newBuilder();
   }

   public static AcceptFriendRequestResponse.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static AcceptFriendRequestResponse.Builder newBuilder(AcceptFriendRequestResponse var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public AcceptFriendRequestResponse.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new AcceptFriendRequestResponse.Builder() : new AcceptFriendRequestResponse.Builder().mergeFrom(this);
   }

   protected AcceptFriendRequestResponse.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new AcceptFriendRequestResponse.Builder(var1);
   }

   public static AcceptFriendRequestResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<AcceptFriendRequestResponse> parser() {
      return PARSER;
   }

   @Override
   public Parser<AcceptFriendRequestResponse> getParserForType() {
      return PARSER;
   }

   public AcceptFriendRequestResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<AcceptFriendRequestResponse.Builder> implements AcceptFriendRequestResponseOrBuilder {
      private int bitField0_;
      private int status_ = 0;
      private OfflineFriend offlineFriend_;
      private SingleFieldBuilderV3<OfflineFriend, OfflineFriend.Builder, OfflineFriendOrBuilder> offlineFriendBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_friend_v1_AcceptFriendRequestResponse_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_friend_v1_AcceptFriendRequestResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(AcceptFriendRequestResponse.class, AcceptFriendRequestResponse.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (AcceptFriendRequestResponse.alwaysUseFieldBuilders) {
            this.getOfflineFriendFieldBuilder();
         }
      }

      public AcceptFriendRequestResponse.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.status_ = 0;
         this.offlineFriend_ = null;
         if (this.offlineFriendBuilder_ != null) {
            this.offlineFriendBuilder_.dispose();
            this.offlineFriendBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_friend_v1_AcceptFriendRequestResponse_descriptor;
      }

      public AcceptFriendRequestResponse getDefaultInstanceForType() {
         return AcceptFriendRequestResponse.getDefaultInstance();
      }

      public AcceptFriendRequestResponse build() {
         AcceptFriendRequestResponse var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public AcceptFriendRequestResponse buildPartial() {
         AcceptFriendRequestResponse var1 = new AcceptFriendRequestResponse(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(AcceptFriendRequestResponse var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.status_ = this.status_;
         }

         byte var3 = 0;
         if ((var2 & 2) != 0) {
            var1.offlineFriend_ = this.offlineFriendBuilder_ == null ? this.offlineFriend_ : this.offlineFriendBuilder_.build();
            var3 |= 1;
         }

         AcceptFriendRequestResponse var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public AcceptFriendRequestResponse.Builder clone() {
         return (AcceptFriendRequestResponse.Builder)super.clone();
      }

      public AcceptFriendRequestResponse.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (AcceptFriendRequestResponse.Builder)super.setField(var1, var2);
      }

      public AcceptFriendRequestResponse.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (AcceptFriendRequestResponse.Builder)super.clearField(var1);
      }

      public AcceptFriendRequestResponse.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (AcceptFriendRequestResponse.Builder)super.clearOneof(var1);
      }

      public AcceptFriendRequestResponse.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (AcceptFriendRequestResponse.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public AcceptFriendRequestResponse.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (AcceptFriendRequestResponse.Builder)super.addRepeatedField(var1, var2);
      }

      public AcceptFriendRequestResponse.Builder mergeFrom(Message var1) {
         if (var1 instanceof AcceptFriendRequestResponse) {
            return this.mergeFrom((AcceptFriendRequestResponse)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public AcceptFriendRequestResponse.Builder mergeFrom(AcceptFriendRequestResponse var1) {
         if (var1 == AcceptFriendRequestResponse.getDefaultInstance()) {
            return this;
         }

         if (var1.status_ != 0) {
            this.setStatusValue(var1.getStatusValue());
         }

         if (var1.hasOfflineFriend()) {
            this.mergeOfflineFriend(var1.getOfflineFriend());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public AcceptFriendRequestResponse.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                  case 8:
                     this.status_ = var1.readEnum();
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     var1.readMessage(this.getOfflineFriendFieldBuilder().getBuilder(), var2);
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
      public int getStatusValue() {
         return this.status_;
      }

      public AcceptFriendRequestResponse.Builder setStatusValue(int var1) {
         this.status_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public AcceptFriendRequestResponse.Status getStatus() {
         AcceptFriendRequestResponse.Status var1 = AcceptFriendRequestResponse.Status.forNumber(this.status_);
         return var1 == null ? AcceptFriendRequestResponse.Status.UNRECOGNIZED : var1;
      }

      public AcceptFriendRequestResponse.Builder setStatus(AcceptFriendRequestResponse.Status var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 1;
         this.status_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public AcceptFriendRequestResponse.Builder clearStatus() {
         this.bitField0_ &= -2;
         this.status_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasOfflineFriend() {
         return (this.bitField0_ & 2) != 0;
      }

      @Override
      public OfflineFriend getOfflineFriend() {
         if (this.offlineFriendBuilder_ == null) {
            return this.offlineFriend_ == null ? OfflineFriend.getDefaultInstance() : this.offlineFriend_;
         } else {
            return this.offlineFriendBuilder_.getMessage();
         }
      }

      public AcceptFriendRequestResponse.Builder setOfflineFriend(OfflineFriend var1) {
         if (this.offlineFriendBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.offlineFriend_ = var1;
         } else {
            this.offlineFriendBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public AcceptFriendRequestResponse.Builder setOfflineFriend(OfflineFriend.Builder var1) {
         if (this.offlineFriendBuilder_ == null) {
            this.offlineFriend_ = var1.build();
         } else {
            this.offlineFriendBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public AcceptFriendRequestResponse.Builder mergeOfflineFriend(OfflineFriend var1) {
         if (this.offlineFriendBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0 && this.offlineFriend_ != null && this.offlineFriend_ != OfflineFriend.getDefaultInstance()) {
               this.getOfflineFriendBuilder().mergeFrom(var1);
            } else {
               this.offlineFriend_ = var1;
            }
         } else {
            this.offlineFriendBuilder_.mergeFrom(var1);
         }

         if (this.offlineFriend_ != null) {
            this.bitField0_ |= 2;
            this.onChanged();
         }

         return this;
      }

      public AcceptFriendRequestResponse.Builder clearOfflineFriend() {
         this.bitField0_ &= -3;
         this.offlineFriend_ = null;
         if (this.offlineFriendBuilder_ != null) {
            this.offlineFriendBuilder_.dispose();
            this.offlineFriendBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public OfflineFriend.Builder getOfflineFriendBuilder() {
         this.bitField0_ |= 2;
         this.onChanged();
         return this.getOfflineFriendFieldBuilder().getBuilder();
      }

      @Override
      public OfflineFriendOrBuilder getOfflineFriendOrBuilder() {
         if (this.offlineFriendBuilder_ != null) {
            return this.offlineFriendBuilder_.getMessageOrBuilder();
         } else {
            return this.offlineFriend_ == null ? OfflineFriend.getDefaultInstance() : this.offlineFriend_;
         }
      }

      private SingleFieldBuilderV3<OfflineFriend, OfflineFriend.Builder, OfflineFriendOrBuilder> getOfflineFriendFieldBuilder() {
         if (this.offlineFriendBuilder_ == null) {
            this.offlineFriendBuilder_ = new SingleFieldBuilderV3<>(this.getOfflineFriend(), this.getParentForChildren(), this.isClean());
            this.offlineFriend_ = null;
         }

         return this.offlineFriendBuilder_;
      }

      public final AcceptFriendRequestResponse.Builder setUnknownFields(UnknownFieldSet var1) {
         return (AcceptFriendRequestResponse.Builder)super.setUnknownFields(var1);
      }

      public final AcceptFriendRequestResponse.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (AcceptFriendRequestResponse.Builder)super.mergeUnknownFields(var1);
      }
   }

   public enum Status implements ProtocolMessageEnum {
      STATUS_UNSPECIFIED(0),
      STATUS_OK(1),
      STATUS_YOUR_FRIEND_LIST_FULL(2),
      STATUS_TARGET_FRIEND_LIST_FULL(3),
      STATUS_ALREADY_FRIENDS(4),
      STATUS_FRIEND_REQUEST_NOT_FOUND(5),
      UNRECOGNIZED(-1);

      public static final int STATUS_UNSPECIFIED_VALUE = 0;
      public static final int STATUS_OK_VALUE = 1;
      public static final int STATUS_YOUR_FRIEND_LIST_FULL_VALUE = 2;
      public static final int STATUS_TARGET_FRIEND_LIST_FULL_VALUE = 3;
      public static final int STATUS_ALREADY_FRIENDS_VALUE = 4;
      public static final int STATUS_FRIEND_REQUEST_NOT_FOUND_VALUE = 5;
      private static final Internal.EnumLiteMap<AcceptFriendRequestResponse.Status> internalValueMap = new Internal.EnumLiteMap<AcceptFriendRequestResponse.Status>() {
         public AcceptFriendRequestResponse.Status findValueByNumber(int var1) {
            return AcceptFriendRequestResponse.Status.forNumber(var1);
         }
      };
      private static final AcceptFriendRequestResponse.Status[] VALUES = values();
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
      public static AcceptFriendRequestResponse.Status valueOf(int var0) {
         return forNumber(var0);
      }

      public static AcceptFriendRequestResponse.Status forNumber(int var0) {
         switch (var0) {
            case 0:
               return STATUS_UNSPECIFIED;
            case 1:
               return STATUS_OK;
            case 2:
               return STATUS_YOUR_FRIEND_LIST_FULL;
            case 3:
               return STATUS_TARGET_FRIEND_LIST_FULL;
            case 4:
               return STATUS_ALREADY_FRIENDS;
            case 5:
               return STATUS_FRIEND_REQUEST_NOT_FOUND;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<AcceptFriendRequestResponse.Status> internalGetValueMap() {
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
         return AcceptFriendRequestResponse.getDescriptor().getEnumTypes().get(0);
      }

      public static AcceptFriendRequestResponse.Status valueOf(Descriptors.EnumValueDescriptor var0) {
         if (var0.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
         }
      }

      Status(int var3) {
         this.value = var3;
      }
   }
}
