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

public final class AddFriendPinRequest extends GeneratedMessageV3 implements AddFriendPinRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int TARGET_UUID_FIELD_NUMBER = 1;
   private Uuid targetUuid_;
   private byte memoizedIsInitialized = -1;
   private static final AddFriendPinRequest DEFAULT_INSTANCE = new AddFriendPinRequest();
   private static final Parser<AddFriendPinRequest> PARSER = new AbstractParser<AddFriendPinRequest>() {
      public AddFriendPinRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         AddFriendPinRequest.Builder var3 = AddFriendPinRequest.newBuilder();

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

   private AddFriendPinRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private AddFriendPinRequest() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new AddFriendPinRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_friend_v1_AddFriendPinRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_friend_v1_AddFriendPinRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(AddFriendPinRequest.class, AddFriendPinRequest.Builder.class);
   }

   @Override
   public boolean hasTargetUuid() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public Uuid getTargetUuid() {
      return this.targetUuid_ == null ? Uuid.getDefaultInstance() : this.targetUuid_;
   }

   @Override
   public UuidOrBuilder getTargetUuidOrBuilder() {
      return this.targetUuid_ == null ? Uuid.getDefaultInstance() : this.targetUuid_;
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
         var1.writeMessage(1, this.getTargetUuid());
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
         var1 += CodedOutputStream.computeMessageSize(1, this.getTargetUuid());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof AddFriendPinRequest)) {
         return super.equals(var1);
      } else {
         AddFriendPinRequest var2 = (AddFriendPinRequest)var1;
         if (this.hasTargetUuid() != var2.hasTargetUuid()) {
            return false;
         } else {
            return this.hasTargetUuid() && !this.getTargetUuid().equals(var2.getTargetUuid()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.hasTargetUuid()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getTargetUuid().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static AddFriendPinRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static AddFriendPinRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static AddFriendPinRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static AddFriendPinRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static AddFriendPinRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static AddFriendPinRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static AddFriendPinRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static AddFriendPinRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static AddFriendPinRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static AddFriendPinRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static AddFriendPinRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static AddFriendPinRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public AddFriendPinRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static AddFriendPinRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static AddFriendPinRequest.Builder newBuilder(AddFriendPinRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public AddFriendPinRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new AddFriendPinRequest.Builder() : new AddFriendPinRequest.Builder().mergeFrom(this);
   }

   protected AddFriendPinRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new AddFriendPinRequest.Builder(var1);
   }

   public static AddFriendPinRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<AddFriendPinRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<AddFriendPinRequest> getParserForType() {
      return PARSER;
   }

   public AddFriendPinRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<AddFriendPinRequest.Builder> implements AddFriendPinRequestOrBuilder {
      private int bitField0_;
      private Uuid targetUuid_;
      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> targetUuidBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_friend_v1_AddFriendPinRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_friend_v1_AddFriendPinRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(AddFriendPinRequest.class, AddFriendPinRequest.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (AddFriendPinRequest.alwaysUseFieldBuilders) {
            this.getTargetUuidFieldBuilder();
         }
      }

      public AddFriendPinRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.targetUuid_ = null;
         if (this.targetUuidBuilder_ != null) {
            this.targetUuidBuilder_.dispose();
            this.targetUuidBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_friend_v1_AddFriendPinRequest_descriptor;
      }

      public AddFriendPinRequest getDefaultInstanceForType() {
         return AddFriendPinRequest.getDefaultInstance();
      }

      public AddFriendPinRequest build() {
         AddFriendPinRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public AddFriendPinRequest buildPartial() {
         AddFriendPinRequest var1 = new AddFriendPinRequest(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(AddFriendPinRequest var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.targetUuid_ = this.targetUuidBuilder_ == null ? this.targetUuid_ : this.targetUuidBuilder_.build();
            var3 |= 1;
         }

         AddFriendPinRequest var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public AddFriendPinRequest.Builder clone() {
         return (AddFriendPinRequest.Builder)super.clone();
      }

      public AddFriendPinRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (AddFriendPinRequest.Builder)super.setField(var1, var2);
      }

      public AddFriendPinRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (AddFriendPinRequest.Builder)super.clearField(var1);
      }

      public AddFriendPinRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (AddFriendPinRequest.Builder)super.clearOneof(var1);
      }

      public AddFriendPinRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (AddFriendPinRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public AddFriendPinRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (AddFriendPinRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public AddFriendPinRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof AddFriendPinRequest) {
            return this.mergeFrom((AddFriendPinRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public AddFriendPinRequest.Builder mergeFrom(AddFriendPinRequest var1) {
         if (var1 == AddFriendPinRequest.getDefaultInstance()) {
            return this;
         }

         if (var1.hasTargetUuid()) {
            this.mergeTargetUuid(var1.getTargetUuid());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public AddFriendPinRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getTargetUuidFieldBuilder().getBuilder(), var2);
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
      public boolean hasTargetUuid() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public Uuid getTargetUuid() {
         if (this.targetUuidBuilder_ == null) {
            return this.targetUuid_ == null ? Uuid.getDefaultInstance() : this.targetUuid_;
         } else {
            return this.targetUuidBuilder_.getMessage();
         }
      }

      public AddFriendPinRequest.Builder setTargetUuid(Uuid var1) {
         if (this.targetUuidBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.targetUuid_ = var1;
         } else {
            this.targetUuidBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public AddFriendPinRequest.Builder setTargetUuid(Uuid.Builder var1) {
         if (this.targetUuidBuilder_ == null) {
            this.targetUuid_ = var1.build();
         } else {
            this.targetUuidBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public AddFriendPinRequest.Builder mergeTargetUuid(Uuid var1) {
         if (this.targetUuidBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.targetUuid_ != null && this.targetUuid_ != Uuid.getDefaultInstance()) {
               this.getTargetUuidBuilder().mergeFrom(var1);
            } else {
               this.targetUuid_ = var1;
            }
         } else {
            this.targetUuidBuilder_.mergeFrom(var1);
         }

         if (this.targetUuid_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public AddFriendPinRequest.Builder clearTargetUuid() {
         this.bitField0_ &= -2;
         this.targetUuid_ = null;
         if (this.targetUuidBuilder_ != null) {
            this.targetUuidBuilder_.dispose();
            this.targetUuidBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Uuid.Builder getTargetUuidBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getTargetUuidFieldBuilder().getBuilder();
      }

      @Override
      public UuidOrBuilder getTargetUuidOrBuilder() {
         if (this.targetUuidBuilder_ != null) {
            return this.targetUuidBuilder_.getMessageOrBuilder();
         } else {
            return this.targetUuid_ == null ? Uuid.getDefaultInstance() : this.targetUuid_;
         }
      }

      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> getTargetUuidFieldBuilder() {
         if (this.targetUuidBuilder_ == null) {
            this.targetUuidBuilder_ = new SingleFieldBuilderV3<>(this.getTargetUuid(), this.getParentForChildren(), this.isClean());
            this.targetUuid_ = null;
         }

         return this.targetUuidBuilder_;
      }

      public final AddFriendPinRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (AddFriendPinRequest.Builder)super.setUnknownFields(var1);
      }

      public final AddFriendPinRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (AddFriendPinRequest.Builder)super.mergeUnknownFields(var1);
      }
   }
}
