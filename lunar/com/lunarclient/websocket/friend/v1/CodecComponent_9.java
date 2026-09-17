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
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class RemoveFriendPinResponse extends GeneratedMessageV3 implements RemoveFriendPinResponseOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int STATUS_FIELD_NUMBER = 1;
   private int status_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final RemoveFriendPinResponse DEFAULT_INSTANCE = new RemoveFriendPinResponse();
   private static final Parser<RemoveFriendPinResponse> PARSER = new AbstractParser<RemoveFriendPinResponse>() {
      public RemoveFriendPinResponse parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         RemoveFriendPinResponse.Builder var3 = RemoveFriendPinResponse.newBuilder();

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

   private RemoveFriendPinResponse(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private RemoveFriendPinResponse() {
      this.status_ = 0;
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new RemoveFriendPinResponse();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_friend_v1_RemoveFriendPinResponse_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_friend_v1_RemoveFriendPinResponse_fieldAccessorTable
         .ensureFieldAccessorsInitialized(RemoveFriendPinResponse.class, RemoveFriendPinResponse.Builder.class);
   }

   @Override
   public int getStatusValue() {
      return this.status_;
   }

   @Override
   public RemoveFriendPinResponse.Status getStatus() {
      RemoveFriendPinResponse.Status var1 = RemoveFriendPinResponse.Status.forNumber(this.status_);
      return var1 == null ? RemoveFriendPinResponse.Status.UNRECOGNIZED : var1;
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
      if (this.status_ != RemoveFriendPinResponse.Status.STATUS_UNSPECIFIED.getNumber()) {
         var1.writeEnum(1, this.status_);
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
      if (this.status_ != RemoveFriendPinResponse.Status.STATUS_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(1, this.status_);
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

      if (!(var1 instanceof RemoveFriendPinResponse)) {
         return super.equals(var1);
      }

      RemoveFriendPinResponse var2 = (RemoveFriendPinResponse)var1;
      return this.status_ != var2.status_ ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static RemoveFriendPinResponse parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static RemoveFriendPinResponse parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RemoveFriendPinResponse parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static RemoveFriendPinResponse parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RemoveFriendPinResponse parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static RemoveFriendPinResponse parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RemoveFriendPinResponse parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RemoveFriendPinResponse parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static RemoveFriendPinResponse parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static RemoveFriendPinResponse parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static RemoveFriendPinResponse parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RemoveFriendPinResponse parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public RemoveFriendPinResponse.Builder newBuilderForType() {
      return newBuilder();
   }

   public static RemoveFriendPinResponse.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static RemoveFriendPinResponse.Builder newBuilder(RemoveFriendPinResponse var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public RemoveFriendPinResponse.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new RemoveFriendPinResponse.Builder() : new RemoveFriendPinResponse.Builder().mergeFrom(this);
   }

   protected RemoveFriendPinResponse.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new RemoveFriendPinResponse.Builder(var1);
   }

   public static RemoveFriendPinResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<RemoveFriendPinResponse> parser() {
      return PARSER;
   }

   @Override
   public Parser<RemoveFriendPinResponse> getParserForType() {
      return PARSER;
   }

   public RemoveFriendPinResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<RemoveFriendPinResponse.Builder> implements RemoveFriendPinResponseOrBuilder {
      private int bitField0_;
      private int status_ = 0;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_friend_v1_RemoveFriendPinResponse_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_friend_v1_RemoveFriendPinResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(RemoveFriendPinResponse.class, RemoveFriendPinResponse.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public RemoveFriendPinResponse.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.status_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_friend_v1_RemoveFriendPinResponse_descriptor;
      }

      public RemoveFriendPinResponse getDefaultInstanceForType() {
         return RemoveFriendPinResponse.getDefaultInstance();
      }

      public RemoveFriendPinResponse build() {
         RemoveFriendPinResponse var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public RemoveFriendPinResponse buildPartial() {
         RemoveFriendPinResponse var1 = new RemoveFriendPinResponse(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(RemoveFriendPinResponse var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.status_ = this.status_;
         }
      }

      public RemoveFriendPinResponse.Builder clone() {
         return (RemoveFriendPinResponse.Builder)super.clone();
      }

      public RemoveFriendPinResponse.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (RemoveFriendPinResponse.Builder)super.setField(var1, var2);
      }

      public RemoveFriendPinResponse.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (RemoveFriendPinResponse.Builder)super.clearField(var1);
      }

      public RemoveFriendPinResponse.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (RemoveFriendPinResponse.Builder)super.clearOneof(var1);
      }

      public RemoveFriendPinResponse.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (RemoveFriendPinResponse.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public RemoveFriendPinResponse.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (RemoveFriendPinResponse.Builder)super.addRepeatedField(var1, var2);
      }

      public RemoveFriendPinResponse.Builder mergeFrom(Message var1) {
         if (var1 instanceof RemoveFriendPinResponse) {
            return this.mergeFrom((RemoveFriendPinResponse)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public RemoveFriendPinResponse.Builder mergeFrom(RemoveFriendPinResponse var1) {
         if (var1 == RemoveFriendPinResponse.getDefaultInstance()) {
            return this;
         }

         if (var1.status_ != 0) {
            this.setStatusValue(var1.getStatusValue());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public RemoveFriendPinResponse.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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

      public RemoveFriendPinResponse.Builder setStatusValue(int var1) {
         this.status_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public RemoveFriendPinResponse.Status getStatus() {
         RemoveFriendPinResponse.Status var1 = RemoveFriendPinResponse.Status.forNumber(this.status_);
         return var1 == null ? RemoveFriendPinResponse.Status.UNRECOGNIZED : var1;
      }

      public RemoveFriendPinResponse.Builder setStatus(RemoveFriendPinResponse.Status var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 1;
         this.status_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public RemoveFriendPinResponse.Builder clearStatus() {
         this.bitField0_ &= -2;
         this.status_ = 0;
         this.onChanged();
         return this;
      }

      public final RemoveFriendPinResponse.Builder setUnknownFields(UnknownFieldSet var1) {
         return (RemoveFriendPinResponse.Builder)super.setUnknownFields(var1);
      }

      public final RemoveFriendPinResponse.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (RemoveFriendPinResponse.Builder)super.mergeUnknownFields(var1);
      }
   }

   public enum Status implements ProtocolMessageEnum {
      STATUS_UNSPECIFIED(0),
      STATUS_OK(1),
      STATUS_FRIEND_NOT_PINNED(2),
      STATUS_TARGET_IS_NOT_FRIEND(3),
      STATUS_TARGET_NOT_FOUND(4),
      UNRECOGNIZED(-1);

      public static final int STATUS_UNSPECIFIED_VALUE = 0;
      public static final int STATUS_OK_VALUE = 1;
      public static final int STATUS_FRIEND_NOT_PINNED_VALUE = 2;
      public static final int STATUS_TARGET_IS_NOT_FRIEND_VALUE = 3;
      public static final int STATUS_TARGET_NOT_FOUND_VALUE = 4;
      private static final Internal.EnumLiteMap<RemoveFriendPinResponse.Status> internalValueMap = new Internal.EnumLiteMap<RemoveFriendPinResponse.Status>() {
         public RemoveFriendPinResponse.Status findValueByNumber(int var1) {
            return RemoveFriendPinResponse.Status.forNumber(var1);
         }
      };
      private static final RemoveFriendPinResponse.Status[] VALUES = values();
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
      public static RemoveFriendPinResponse.Status valueOf(int var0) {
         return forNumber(var0);
      }

      public static RemoveFriendPinResponse.Status forNumber(int var0) {
         switch (var0) {
            case 0:
               return STATUS_UNSPECIFIED;
            case 1:
               return STATUS_OK;
            case 2:
               return STATUS_FRIEND_NOT_PINNED;
            case 3:
               return STATUS_TARGET_IS_NOT_FRIEND;
            case 4:
               return STATUS_TARGET_NOT_FOUND;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<RemoveFriendPinResponse.Status> internalGetValueMap() {
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
         return RemoveFriendPinResponse.getDescriptor().getEnumTypes().get(0);
      }

      public static RemoveFriendPinResponse.Status valueOf(Descriptors.EnumValueDescriptor var0) {
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
