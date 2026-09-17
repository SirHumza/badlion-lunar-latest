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

public final class BroadcastStatusChangeRequest extends GeneratedMessageV3 implements BroadcastStatusChangeRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int NEW_STATUS_FIELD_NUMBER = 1;
   private int newStatus_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final BroadcastStatusChangeRequest DEFAULT_INSTANCE = new BroadcastStatusChangeRequest();
   private static final Parser<BroadcastStatusChangeRequest> PARSER = new AbstractParser<BroadcastStatusChangeRequest>() {
      public BroadcastStatusChangeRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         BroadcastStatusChangeRequest.Builder var3 = BroadcastStatusChangeRequest.newBuilder();

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

   private BroadcastStatusChangeRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private BroadcastStatusChangeRequest() {
      this.newStatus_ = 0;
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new BroadcastStatusChangeRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_friend_v1_BroadcastStatusChangeRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_friend_v1_BroadcastStatusChangeRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(BroadcastStatusChangeRequest.class, BroadcastStatusChangeRequest.Builder.class);
   }

   @Override
   public int getNewStatusValue() {
      return this.newStatus_;
   }

   @Override
   public OnlineFriendStatus getNewStatus() {
      OnlineFriendStatus var1 = OnlineFriendStatus.forNumber(this.newStatus_);
      return var1 == null ? OnlineFriendStatus.UNRECOGNIZED : var1;
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
      if (this.newStatus_ != OnlineFriendStatus.ONLINE_FRIEND_STATUS_UNSPECIFIED.getNumber()) {
         var1.writeEnum(1, this.newStatus_);
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
      if (this.newStatus_ != OnlineFriendStatus.ONLINE_FRIEND_STATUS_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(1, this.newStatus_);
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

      if (!(var1 instanceof BroadcastStatusChangeRequest)) {
         return super.equals(var1);
      }

      BroadcastStatusChangeRequest var2 = (BroadcastStatusChangeRequest)var1;
      return this.newStatus_ != var2.newStatus_ ? false : this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      var1 = 37 * var1 + 1;
      var1 = 53 * var1 + this.newStatus_;
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static BroadcastStatusChangeRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static BroadcastStatusChangeRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static BroadcastStatusChangeRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static BroadcastStatusChangeRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static BroadcastStatusChangeRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static BroadcastStatusChangeRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static BroadcastStatusChangeRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static BroadcastStatusChangeRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static BroadcastStatusChangeRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static BroadcastStatusChangeRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static BroadcastStatusChangeRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static BroadcastStatusChangeRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public BroadcastStatusChangeRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static BroadcastStatusChangeRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static BroadcastStatusChangeRequest.Builder newBuilder(BroadcastStatusChangeRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public BroadcastStatusChangeRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new BroadcastStatusChangeRequest.Builder() : new BroadcastStatusChangeRequest.Builder().mergeFrom(this);
   }

   protected BroadcastStatusChangeRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new BroadcastStatusChangeRequest.Builder(var1);
   }

   public static BroadcastStatusChangeRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<BroadcastStatusChangeRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<BroadcastStatusChangeRequest> getParserForType() {
      return PARSER;
   }

   public BroadcastStatusChangeRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<BroadcastStatusChangeRequest.Builder> implements BroadcastStatusChangeRequestOrBuilder {
      private int bitField0_;
      private int newStatus_ = 0;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_friend_v1_BroadcastStatusChangeRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_friend_v1_BroadcastStatusChangeRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(BroadcastStatusChangeRequest.class, BroadcastStatusChangeRequest.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public BroadcastStatusChangeRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.newStatus_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_friend_v1_BroadcastStatusChangeRequest_descriptor;
      }

      public BroadcastStatusChangeRequest getDefaultInstanceForType() {
         return BroadcastStatusChangeRequest.getDefaultInstance();
      }

      public BroadcastStatusChangeRequest build() {
         BroadcastStatusChangeRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public BroadcastStatusChangeRequest buildPartial() {
         BroadcastStatusChangeRequest var1 = new BroadcastStatusChangeRequest(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(BroadcastStatusChangeRequest var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.newStatus_ = this.newStatus_;
         }
      }

      public BroadcastStatusChangeRequest.Builder clone() {
         return (BroadcastStatusChangeRequest.Builder)super.clone();
      }

      public BroadcastStatusChangeRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (BroadcastStatusChangeRequest.Builder)super.setField(var1, var2);
      }

      public BroadcastStatusChangeRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (BroadcastStatusChangeRequest.Builder)super.clearField(var1);
      }

      public BroadcastStatusChangeRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (BroadcastStatusChangeRequest.Builder)super.clearOneof(var1);
      }

      public BroadcastStatusChangeRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (BroadcastStatusChangeRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public BroadcastStatusChangeRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (BroadcastStatusChangeRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public BroadcastStatusChangeRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof BroadcastStatusChangeRequest) {
            return this.mergeFrom((BroadcastStatusChangeRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public BroadcastStatusChangeRequest.Builder mergeFrom(BroadcastStatusChangeRequest var1) {
         if (var1 == BroadcastStatusChangeRequest.getDefaultInstance()) {
            return this;
         }

         if (var1.newStatus_ != 0) {
            this.setNewStatusValue(var1.getNewStatusValue());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public BroadcastStatusChangeRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.newStatus_ = var1.readEnum();
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
      public int getNewStatusValue() {
         return this.newStatus_;
      }

      public BroadcastStatusChangeRequest.Builder setNewStatusValue(int var1) {
         this.newStatus_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public OnlineFriendStatus getNewStatus() {
         OnlineFriendStatus var1 = OnlineFriendStatus.forNumber(this.newStatus_);
         return var1 == null ? OnlineFriendStatus.UNRECOGNIZED : var1;
      }

      public BroadcastStatusChangeRequest.Builder setNewStatus(OnlineFriendStatus var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 1;
         this.newStatus_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public BroadcastStatusChangeRequest.Builder clearNewStatus() {
         this.bitField0_ &= -2;
         this.newStatus_ = 0;
         this.onChanged();
         return this;
      }

      public final BroadcastStatusChangeRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (BroadcastStatusChangeRequest.Builder)super.setUnknownFields(var1);
      }

      public final BroadcastStatusChangeRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (BroadcastStatusChangeRequest.Builder)super.mergeUnknownFields(var1);
      }
   }
}
