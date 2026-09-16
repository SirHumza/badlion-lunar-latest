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
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class ToggleFriendRequestsRequest extends GeneratedMessageV3 implements ToggleFriendRequestsRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int ALLOW_FRIEND_REQUESTS_FIELD_NUMBER = 1;
   private boolean allowFriendRequests_ = false;
   private byte memoizedIsInitialized = -1;
   private static final ToggleFriendRequestsRequest DEFAULT_INSTANCE = new ToggleFriendRequestsRequest();
   private static final Parser<ToggleFriendRequestsRequest> PARSER = new AbstractParser<ToggleFriendRequestsRequest>() {
      public ToggleFriendRequestsRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         ToggleFriendRequestsRequest.Builder var3 = ToggleFriendRequestsRequest.newBuilder();

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

   private ToggleFriendRequestsRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private ToggleFriendRequestsRequest() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new ToggleFriendRequestsRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_friend_v1_ToggleFriendRequestsRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_friend_v1_ToggleFriendRequestsRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(ToggleFriendRequestsRequest.class, ToggleFriendRequestsRequest.Builder.class);
   }

   @Override
   public boolean getAllowFriendRequests() {
      return this.allowFriendRequests_;
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
      if (this.allowFriendRequests_) {
         var1.writeBool(1, this.allowFriendRequests_);
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
      if (this.allowFriendRequests_) {
         var1 += CodedOutputStream.computeBoolSize(1, this.allowFriendRequests_);
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

      if (!(var1 instanceof ToggleFriendRequestsRequest)) {
         return super.equals(var1);
      }

      ToggleFriendRequestsRequest var2 = (ToggleFriendRequestsRequest)var1;
      return this.getAllowFriendRequests() != var2.getAllowFriendRequests() ? false : this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      var1 = 37 * var1 + 1;
      var1 = 53 * var1 + Internal.hashBoolean(this.getAllowFriendRequests());
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static ToggleFriendRequestsRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static ToggleFriendRequestsRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ToggleFriendRequestsRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static ToggleFriendRequestsRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ToggleFriendRequestsRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static ToggleFriendRequestsRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ToggleFriendRequestsRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ToggleFriendRequestsRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ToggleFriendRequestsRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ToggleFriendRequestsRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ToggleFriendRequestsRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ToggleFriendRequestsRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public ToggleFriendRequestsRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static ToggleFriendRequestsRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ToggleFriendRequestsRequest.Builder newBuilder(ToggleFriendRequestsRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public ToggleFriendRequestsRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new ToggleFriendRequestsRequest.Builder() : new ToggleFriendRequestsRequest.Builder().mergeFrom(this);
   }

   protected ToggleFriendRequestsRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new ToggleFriendRequestsRequest.Builder(var1);
   }

   public static ToggleFriendRequestsRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<ToggleFriendRequestsRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<ToggleFriendRequestsRequest> getParserForType() {
      return PARSER;
   }

   public ToggleFriendRequestsRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<ToggleFriendRequestsRequest.Builder> implements ToggleFriendRequestsRequestOrBuilder {
      private int bitField0_;
      private boolean allowFriendRequests_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_friend_v1_ToggleFriendRequestsRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_friend_v1_ToggleFriendRequestsRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ToggleFriendRequestsRequest.class, ToggleFriendRequestsRequest.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public ToggleFriendRequestsRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.allowFriendRequests_ = false;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_friend_v1_ToggleFriendRequestsRequest_descriptor;
      }

      public ToggleFriendRequestsRequest getDefaultInstanceForType() {
         return ToggleFriendRequestsRequest.getDefaultInstance();
      }

      public ToggleFriendRequestsRequest build() {
         ToggleFriendRequestsRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public ToggleFriendRequestsRequest buildPartial() {
         ToggleFriendRequestsRequest var1 = new ToggleFriendRequestsRequest(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(ToggleFriendRequestsRequest var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.allowFriendRequests_ = this.allowFriendRequests_;
         }
      }

      public ToggleFriendRequestsRequest.Builder clone() {
         return (ToggleFriendRequestsRequest.Builder)super.clone();
      }

      public ToggleFriendRequestsRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ToggleFriendRequestsRequest.Builder)super.setField(var1, var2);
      }

      public ToggleFriendRequestsRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (ToggleFriendRequestsRequest.Builder)super.clearField(var1);
      }

      public ToggleFriendRequestsRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (ToggleFriendRequestsRequest.Builder)super.clearOneof(var1);
      }

      public ToggleFriendRequestsRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (ToggleFriendRequestsRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public ToggleFriendRequestsRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ToggleFriendRequestsRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public ToggleFriendRequestsRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof ToggleFriendRequestsRequest) {
            return this.mergeFrom((ToggleFriendRequestsRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public ToggleFriendRequestsRequest.Builder mergeFrom(ToggleFriendRequestsRequest var1) {
         if (var1 == ToggleFriendRequestsRequest.getDefaultInstance()) {
            return this;
         }

         if (var1.getAllowFriendRequests()) {
            this.setAllowFriendRequests(var1.getAllowFriendRequests());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public ToggleFriendRequestsRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.allowFriendRequests_ = var1.readBool();
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
      public boolean getAllowFriendRequests() {
         return this.allowFriendRequests_;
      }

      public ToggleFriendRequestsRequest.Builder setAllowFriendRequests(boolean var1) {
         this.allowFriendRequests_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public ToggleFriendRequestsRequest.Builder clearAllowFriendRequests() {
         this.bitField0_ &= -2;
         this.allowFriendRequests_ = false;
         this.onChanged();
         return this;
      }

      public final ToggleFriendRequestsRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (ToggleFriendRequestsRequest.Builder)super.setUnknownFields(var1);
      }

      public final ToggleFriendRequestsRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (ToggleFriendRequestsRequest.Builder)super.mergeUnknownFields(var1);
      }
   }
}
