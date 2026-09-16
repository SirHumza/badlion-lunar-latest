package com.lunarclient.websocket.skyblock.v1;

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

public final class BroadcastDungeonUpdateResponse extends GeneratedMessageV3 implements BroadcastDungeonUpdateResponseOrBuilder {
   private static final long serialVersionUID = 0L;
   private byte memoizedIsInitialized = -1;
   private static final BroadcastDungeonUpdateResponse DEFAULT_INSTANCE = new BroadcastDungeonUpdateResponse();
   private static final Parser<BroadcastDungeonUpdateResponse> PARSER = new AbstractParser<BroadcastDungeonUpdateResponse>() {
      public BroadcastDungeonUpdateResponse parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         BroadcastDungeonUpdateResponse.Builder var3 = BroadcastDungeonUpdateResponse.newBuilder();

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

   private BroadcastDungeonUpdateResponse(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private BroadcastDungeonUpdateResponse() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new BroadcastDungeonUpdateResponse();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_skyblock_v1_BroadcastDungeonUpdateResponse_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_skyblock_v1_BroadcastDungeonUpdateResponse_fieldAccessorTable
         .ensureFieldAccessorsInitialized(BroadcastDungeonUpdateResponse.class, BroadcastDungeonUpdateResponse.Builder.class);
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

      if (!(var1 instanceof BroadcastDungeonUpdateResponse)) {
         return super.equals(var1);
      }

      BroadcastDungeonUpdateResponse var2 = (BroadcastDungeonUpdateResponse)var1;
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

   public static BroadcastDungeonUpdateResponse parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static BroadcastDungeonUpdateResponse parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static BroadcastDungeonUpdateResponse parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static BroadcastDungeonUpdateResponse parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static BroadcastDungeonUpdateResponse parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static BroadcastDungeonUpdateResponse parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static BroadcastDungeonUpdateResponse parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static BroadcastDungeonUpdateResponse parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static BroadcastDungeonUpdateResponse parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static BroadcastDungeonUpdateResponse parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static BroadcastDungeonUpdateResponse parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static BroadcastDungeonUpdateResponse parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public BroadcastDungeonUpdateResponse.Builder newBuilderForType() {
      return newBuilder();
   }

   public static BroadcastDungeonUpdateResponse.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static BroadcastDungeonUpdateResponse.Builder newBuilder(BroadcastDungeonUpdateResponse var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public BroadcastDungeonUpdateResponse.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new BroadcastDungeonUpdateResponse.Builder() : new BroadcastDungeonUpdateResponse.Builder().mergeFrom(this);
   }

   protected BroadcastDungeonUpdateResponse.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new BroadcastDungeonUpdateResponse.Builder(var1);
   }

   public static BroadcastDungeonUpdateResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<BroadcastDungeonUpdateResponse> parser() {
      return PARSER;
   }

   @Override
   public Parser<BroadcastDungeonUpdateResponse> getParserForType() {
      return PARSER;
   }

   public BroadcastDungeonUpdateResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder
      extends GeneratedMessageV3.Builder<BroadcastDungeonUpdateResponse.Builder>
      implements BroadcastDungeonUpdateResponseOrBuilder {
      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_skyblock_v1_BroadcastDungeonUpdateResponse_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_skyblock_v1_BroadcastDungeonUpdateResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(BroadcastDungeonUpdateResponse.class, BroadcastDungeonUpdateResponse.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public BroadcastDungeonUpdateResponse.Builder clear() {
         super.clear();
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_skyblock_v1_BroadcastDungeonUpdateResponse_descriptor;
      }

      public BroadcastDungeonUpdateResponse getDefaultInstanceForType() {
         return BroadcastDungeonUpdateResponse.getDefaultInstance();
      }

      public BroadcastDungeonUpdateResponse build() {
         BroadcastDungeonUpdateResponse var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public BroadcastDungeonUpdateResponse buildPartial() {
         BroadcastDungeonUpdateResponse var1 = new BroadcastDungeonUpdateResponse(this);
         this.onBuilt();
         return var1;
      }

      public BroadcastDungeonUpdateResponse.Builder clone() {
         return (BroadcastDungeonUpdateResponse.Builder)super.clone();
      }

      public BroadcastDungeonUpdateResponse.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (BroadcastDungeonUpdateResponse.Builder)super.setField(var1, var2);
      }

      public BroadcastDungeonUpdateResponse.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (BroadcastDungeonUpdateResponse.Builder)super.clearField(var1);
      }

      public BroadcastDungeonUpdateResponse.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (BroadcastDungeonUpdateResponse.Builder)super.clearOneof(var1);
      }

      public BroadcastDungeonUpdateResponse.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (BroadcastDungeonUpdateResponse.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public BroadcastDungeonUpdateResponse.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (BroadcastDungeonUpdateResponse.Builder)super.addRepeatedField(var1, var2);
      }

      public BroadcastDungeonUpdateResponse.Builder mergeFrom(Message var1) {
         if (var1 instanceof BroadcastDungeonUpdateResponse) {
            return this.mergeFrom((BroadcastDungeonUpdateResponse)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public BroadcastDungeonUpdateResponse.Builder mergeFrom(BroadcastDungeonUpdateResponse var1) {
         if (var1 == BroadcastDungeonUpdateResponse.getDefaultInstance()) {
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

      public BroadcastDungeonUpdateResponse.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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

      public final BroadcastDungeonUpdateResponse.Builder setUnknownFields(UnknownFieldSet var1) {
         return (BroadcastDungeonUpdateResponse.Builder)super.setUnknownFields(var1);
      }

      public final BroadcastDungeonUpdateResponse.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (BroadcastDungeonUpdateResponse.Builder)super.mergeUnknownFields(var1);
      }
   }
}
