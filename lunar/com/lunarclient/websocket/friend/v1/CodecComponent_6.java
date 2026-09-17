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
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class SendFriendRequestRequest extends GeneratedMessageV3 implements SendFriendRequestRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int TARGET_USERNAME_FIELD_NUMBER = 1;
   private volatile Object targetUsername_ = "";
   private byte memoizedIsInitialized = -1;
   private static final SendFriendRequestRequest DEFAULT_INSTANCE = new SendFriendRequestRequest();
   private static final Parser<SendFriendRequestRequest> PARSER = new AbstractParser<SendFriendRequestRequest>() {
      public SendFriendRequestRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         SendFriendRequestRequest.Builder var3 = SendFriendRequestRequest.newBuilder();

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

   private SendFriendRequestRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private SendFriendRequestRequest() {
      this.targetUsername_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new SendFriendRequestRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_friend_v1_SendFriendRequestRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_friend_v1_SendFriendRequestRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(SendFriendRequestRequest.class, SendFriendRequestRequest.Builder.class);
   }

   @Override
   public String getTargetUsername() {
      Object var1 = this.targetUsername_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.targetUsername_ = var3;
      return var3;
   }

   @Override
   public ByteString getTargetUsernameBytes() {
      Object var1 = this.targetUsername_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.targetUsername_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
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
      if (!GeneratedMessageV3.isStringEmpty(this.targetUsername_)) {
         GeneratedMessageV3.writeString(var1, 1, this.targetUsername_);
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
      if (!GeneratedMessageV3.isStringEmpty(this.targetUsername_)) {
         var1 += GeneratedMessageV3.computeStringSize(1, this.targetUsername_);
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

      if (!(var1 instanceof SendFriendRequestRequest)) {
         return super.equals(var1);
      }

      SendFriendRequestRequest var2 = (SendFriendRequestRequest)var1;
      return !this.getTargetUsername().equals(var2.getTargetUsername()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      var1 = 37 * var1 + 1;
      var1 = 53 * var1 + this.getTargetUsername().hashCode();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static SendFriendRequestRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static SendFriendRequestRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SendFriendRequestRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static SendFriendRequestRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SendFriendRequestRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static SendFriendRequestRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SendFriendRequestRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SendFriendRequestRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static SendFriendRequestRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static SendFriendRequestRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static SendFriendRequestRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SendFriendRequestRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public SendFriendRequestRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static SendFriendRequestRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static SendFriendRequestRequest.Builder newBuilder(SendFriendRequestRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public SendFriendRequestRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new SendFriendRequestRequest.Builder() : new SendFriendRequestRequest.Builder().mergeFrom(this);
   }

   protected SendFriendRequestRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new SendFriendRequestRequest.Builder(var1);
   }

   public static SendFriendRequestRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<SendFriendRequestRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<SendFriendRequestRequest> getParserForType() {
      return PARSER;
   }

   public SendFriendRequestRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<SendFriendRequestRequest.Builder> implements SendFriendRequestRequestOrBuilder {
      private int bitField0_;
      private Object targetUsername_ = "";

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_friend_v1_SendFriendRequestRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_friend_v1_SendFriendRequestRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(SendFriendRequestRequest.class, SendFriendRequestRequest.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public SendFriendRequestRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.targetUsername_ = "";
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_friend_v1_SendFriendRequestRequest_descriptor;
      }

      public SendFriendRequestRequest getDefaultInstanceForType() {
         return SendFriendRequestRequest.getDefaultInstance();
      }

      public SendFriendRequestRequest build() {
         SendFriendRequestRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public SendFriendRequestRequest buildPartial() {
         SendFriendRequestRequest var1 = new SendFriendRequestRequest(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(SendFriendRequestRequest var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.targetUsername_ = this.targetUsername_;
         }
      }

      public SendFriendRequestRequest.Builder clone() {
         return (SendFriendRequestRequest.Builder)super.clone();
      }

      public SendFriendRequestRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (SendFriendRequestRequest.Builder)super.setField(var1, var2);
      }

      public SendFriendRequestRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (SendFriendRequestRequest.Builder)super.clearField(var1);
      }

      public SendFriendRequestRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (SendFriendRequestRequest.Builder)super.clearOneof(var1);
      }

      public SendFriendRequestRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (SendFriendRequestRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public SendFriendRequestRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (SendFriendRequestRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public SendFriendRequestRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof SendFriendRequestRequest) {
            return this.mergeFrom((SendFriendRequestRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public SendFriendRequestRequest.Builder mergeFrom(SendFriendRequestRequest var1) {
         if (var1 == SendFriendRequestRequest.getDefaultInstance()) {
            return this;
         }

         if (!var1.getTargetUsername().isEmpty()) {
            this.targetUsername_ = var1.targetUsername_;
            this.bitField0_ |= 1;
            this.onChanged();
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public SendFriendRequestRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.targetUsername_ = var1.readStringRequireUtf8();
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
      public String getTargetUsername() {
         Object var1 = this.targetUsername_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.targetUsername_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getTargetUsernameBytes() {
         Object var1 = this.targetUsername_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.targetUsername_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public SendFriendRequestRequest.Builder setTargetUsername(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.targetUsername_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public SendFriendRequestRequest.Builder clearTargetUsername() {
         this.targetUsername_ = SendFriendRequestRequest.getDefaultInstance().getTargetUsername();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public SendFriendRequestRequest.Builder setTargetUsernameBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         SendFriendRequestRequest.checkByteStringIsUtf8(var1);
         this.targetUsername_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public final SendFriendRequestRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (SendFriendRequestRequest.Builder)super.setUnknownFields(var1);
      }

      public final SendFriendRequestRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (SendFriendRequestRequest.Builder)super.mergeUnknownFields(var1);
      }
   }
}
