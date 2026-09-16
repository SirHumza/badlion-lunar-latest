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

public final class BroadcastStatusChangeResponse extends GeneratedMessageV3 implements BroadcastStatusChangeResponseOrBuilder {
   private static final long serialVersionUID = 0L;
   private byte memoizedIsInitialized = -1;
   private static final BroadcastStatusChangeResponse DEFAULT_INSTANCE = new BroadcastStatusChangeResponse();
   private static final Parser<BroadcastStatusChangeResponse> PARSER = new AbstractParser<BroadcastStatusChangeResponse>() {
      public BroadcastStatusChangeResponse parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         BroadcastStatusChangeResponse.Builder var3 = BroadcastStatusChangeResponse.newBuilder();

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

   private BroadcastStatusChangeResponse(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private BroadcastStatusChangeResponse() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new BroadcastStatusChangeResponse();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_friend_v1_BroadcastStatusChangeResponse_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_friend_v1_BroadcastStatusChangeResponse_fieldAccessorTable
         .ensureFieldAccessorsInitialized(BroadcastStatusChangeResponse.class, BroadcastStatusChangeResponse.Builder.class);
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
      this.getUnknownFields().writeTo(var1);
   }

   @Override
   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 != -1) {
         return var1;
      }

      int var2 = 0;
      var2 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var2;
      return var2;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      }

      if (!(var1 instanceof BroadcastStatusChangeResponse)) {
         return super.equals(var1);
      }

      BroadcastStatusChangeResponse var2 = (BroadcastStatusChangeResponse)var1;
      return this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static BroadcastStatusChangeResponse parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static BroadcastStatusChangeResponse parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static BroadcastStatusChangeResponse parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static BroadcastStatusChangeResponse parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static BroadcastStatusChangeResponse parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static BroadcastStatusChangeResponse parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static BroadcastStatusChangeResponse parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static BroadcastStatusChangeResponse parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static BroadcastStatusChangeResponse parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static BroadcastStatusChangeResponse parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static BroadcastStatusChangeResponse parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static BroadcastStatusChangeResponse parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public BroadcastStatusChangeResponse.Builder newBuilderForType() {
      return newBuilder();
   }

   public static BroadcastStatusChangeResponse.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static BroadcastStatusChangeResponse.Builder newBuilder(BroadcastStatusChangeResponse var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public BroadcastStatusChangeResponse.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new BroadcastStatusChangeResponse.Builder() : new BroadcastStatusChangeResponse.Builder().mergeFrom(this);
   }

   protected BroadcastStatusChangeResponse.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new BroadcastStatusChangeResponse.Builder(var1);
   }

   public static BroadcastStatusChangeResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<BroadcastStatusChangeResponse> parser() {
      return PARSER;
   }

   @Override
   public Parser<BroadcastStatusChangeResponse> getParserForType() {
      return PARSER;
   }

   public BroadcastStatusChangeResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder
      extends GeneratedMessageV3.Builder<BroadcastStatusChangeResponse.Builder>
      implements BroadcastStatusChangeResponseOrBuilder {
      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_friend_v1_BroadcastStatusChangeResponse_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_friend_v1_BroadcastStatusChangeResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(BroadcastStatusChangeResponse.class, BroadcastStatusChangeResponse.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public BroadcastStatusChangeResponse.Builder clear() {
         super.clear();
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_friend_v1_BroadcastStatusChangeResponse_descriptor;
      }

      public BroadcastStatusChangeResponse getDefaultInstanceForType() {
         return BroadcastStatusChangeResponse.getDefaultInstance();
      }

      public BroadcastStatusChangeResponse build() {
         BroadcastStatusChangeResponse var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public BroadcastStatusChangeResponse buildPartial() {
         BroadcastStatusChangeResponse var1 = new BroadcastStatusChangeResponse(this);
         this.onBuilt();
         return var1;
      }

      public BroadcastStatusChangeResponse.Builder clone() {
         return (BroadcastStatusChangeResponse.Builder)super.clone();
      }

      public BroadcastStatusChangeResponse.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (BroadcastStatusChangeResponse.Builder)super.setField(var1, var2);
      }

      public BroadcastStatusChangeResponse.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (BroadcastStatusChangeResponse.Builder)super.clearField(var1);
      }

      public BroadcastStatusChangeResponse.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (BroadcastStatusChangeResponse.Builder)super.clearOneof(var1);
      }

      public BroadcastStatusChangeResponse.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (BroadcastStatusChangeResponse.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public BroadcastStatusChangeResponse.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (BroadcastStatusChangeResponse.Builder)super.addRepeatedField(var1, var2);
      }

      public BroadcastStatusChangeResponse.Builder mergeFrom(Message var1) {
         if (var1 instanceof BroadcastStatusChangeResponse) {
            return this.mergeFrom((BroadcastStatusChangeResponse)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public BroadcastStatusChangeResponse.Builder mergeFrom(BroadcastStatusChangeResponse var1) {
         if (var1 == BroadcastStatusChangeResponse.getDefaultInstance()) {
            return this;
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public BroadcastStatusChangeResponse.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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

      public final BroadcastStatusChangeResponse.Builder setUnknownFields(UnknownFieldSet var1) {
         return (BroadcastStatusChangeResponse.Builder)super.setUnknownFields(var1);
      }

      public final BroadcastStatusChangeResponse.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (BroadcastStatusChangeResponse.Builder)super.mergeUnknownFields(var1);
      }
   }
}
