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

public final class AcceptFriendRequestRequest extends GeneratedMessageV3 implements AcceptFriendRequestRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int SENDER_UUID_FIELD_NUMBER = 1;
   private Uuid senderUuid_;
   private byte memoizedIsInitialized = -1;
   private static final AcceptFriendRequestRequest DEFAULT_INSTANCE = new AcceptFriendRequestRequest();
   private static final Parser<AcceptFriendRequestRequest> PARSER = new AbstractParser<AcceptFriendRequestRequest>() {
      public AcceptFriendRequestRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         AcceptFriendRequestRequest.Builder var3 = AcceptFriendRequestRequest.newBuilder();

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

   private AcceptFriendRequestRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private AcceptFriendRequestRequest() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new AcceptFriendRequestRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_friend_v1_AcceptFriendRequestRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_friend_v1_AcceptFriendRequestRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(AcceptFriendRequestRequest.class, AcceptFriendRequestRequest.Builder.class);
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
      } else if (!(var1 instanceof AcceptFriendRequestRequest)) {
         return super.equals(var1);
      } else {
         AcceptFriendRequestRequest var2 = (AcceptFriendRequestRequest)var1;
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

   public static AcceptFriendRequestRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static AcceptFriendRequestRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static AcceptFriendRequestRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static AcceptFriendRequestRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static AcceptFriendRequestRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static AcceptFriendRequestRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static AcceptFriendRequestRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static AcceptFriendRequestRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static AcceptFriendRequestRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static AcceptFriendRequestRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static AcceptFriendRequestRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static AcceptFriendRequestRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public AcceptFriendRequestRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static AcceptFriendRequestRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static AcceptFriendRequestRequest.Builder newBuilder(AcceptFriendRequestRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public AcceptFriendRequestRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new AcceptFriendRequestRequest.Builder() : new AcceptFriendRequestRequest.Builder().mergeFrom(this);
   }

   protected AcceptFriendRequestRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new AcceptFriendRequestRequest.Builder(var1);
   }

   public static AcceptFriendRequestRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<AcceptFriendRequestRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<AcceptFriendRequestRequest> getParserForType() {
      return PARSER;
   }

   public AcceptFriendRequestRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<AcceptFriendRequestRequest.Builder> implements AcceptFriendRequestRequestOrBuilder {
      private int bitField0_;
      private Uuid senderUuid_;
      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> senderUuidBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_friend_v1_AcceptFriendRequestRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_friend_v1_AcceptFriendRequestRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(AcceptFriendRequestRequest.class, AcceptFriendRequestRequest.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (AcceptFriendRequestRequest.alwaysUseFieldBuilders) {
            this.getSenderUuidFieldBuilder();
         }
      }

      public AcceptFriendRequestRequest.Builder clear() {
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
         return ServiceProto.internal_static_lunarclient_websocket_friend_v1_AcceptFriendRequestRequest_descriptor;
      }

      public AcceptFriendRequestRequest getDefaultInstanceForType() {
         return AcceptFriendRequestRequest.getDefaultInstance();
      }

      public AcceptFriendRequestRequest build() {
         AcceptFriendRequestRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public AcceptFriendRequestRequest buildPartial() {
         AcceptFriendRequestRequest var1 = new AcceptFriendRequestRequest(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(AcceptFriendRequestRequest var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.senderUuid_ = this.senderUuidBuilder_ == null ? this.senderUuid_ : this.senderUuidBuilder_.build();
            var3 |= 1;
         }

         AcceptFriendRequestRequest var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public AcceptFriendRequestRequest.Builder clone() {
         return (AcceptFriendRequestRequest.Builder)super.clone();
      }

      public AcceptFriendRequestRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (AcceptFriendRequestRequest.Builder)super.setField(var1, var2);
      }

      public AcceptFriendRequestRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (AcceptFriendRequestRequest.Builder)super.clearField(var1);
      }

      public AcceptFriendRequestRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (AcceptFriendRequestRequest.Builder)super.clearOneof(var1);
      }

      public AcceptFriendRequestRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (AcceptFriendRequestRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public AcceptFriendRequestRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (AcceptFriendRequestRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public AcceptFriendRequestRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof AcceptFriendRequestRequest) {
            return this.mergeFrom((AcceptFriendRequestRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public AcceptFriendRequestRequest.Builder mergeFrom(AcceptFriendRequestRequest var1) {
         if (var1 == AcceptFriendRequestRequest.getDefaultInstance()) {
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

      public AcceptFriendRequestRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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

      public AcceptFriendRequestRequest.Builder setSenderUuid(Uuid var1) {
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

      public AcceptFriendRequestRequest.Builder setSenderUuid(Uuid.Builder var1) {
         if (this.senderUuidBuilder_ == null) {
            this.senderUuid_ = var1.build();
         } else {
            this.senderUuidBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public AcceptFriendRequestRequest.Builder mergeSenderUuid(Uuid var1) {
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

      public AcceptFriendRequestRequest.Builder clearSenderUuid() {
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

      public final AcceptFriendRequestRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (AcceptFriendRequestRequest.Builder)super.setUnknownFields(var1);
      }

      public final AcceptFriendRequestRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (AcceptFriendRequestRequest.Builder)super.mergeUnknownFields(var1);
      }
   }
}
