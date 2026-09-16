package com.lunarclient.websocket.serverdiscovery.v1;

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

public final class DiscoverServersRequest extends GeneratedMessageV3 implements DiscoverServersRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   private byte memoizedIsInitialized = -1;
   private static final DiscoverServersRequest DEFAULT_INSTANCE = new DiscoverServersRequest();
   private static final Parser<DiscoverServersRequest> PARSER = new AbstractParser<DiscoverServersRequest>() {
      public DiscoverServersRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         DiscoverServersRequest.Builder var3 = DiscoverServersRequest.newBuilder();

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

   private DiscoverServersRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private DiscoverServersRequest() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new DiscoverServersRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_serverdiscovery_v1_DiscoverServersRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_serverdiscovery_v1_DiscoverServersRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(DiscoverServersRequest.class, DiscoverServersRequest.Builder.class);
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

      if (!(var1 instanceof DiscoverServersRequest)) {
         return super.equals(var1);
      }

      DiscoverServersRequest var2 = (DiscoverServersRequest)var1;
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

   public static DiscoverServersRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static DiscoverServersRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static DiscoverServersRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static DiscoverServersRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static DiscoverServersRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static DiscoverServersRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static DiscoverServersRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static DiscoverServersRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static DiscoverServersRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static DiscoverServersRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static DiscoverServersRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static DiscoverServersRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public DiscoverServersRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static DiscoverServersRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static DiscoverServersRequest.Builder newBuilder(DiscoverServersRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public DiscoverServersRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new DiscoverServersRequest.Builder() : new DiscoverServersRequest.Builder().mergeFrom(this);
   }

   protected DiscoverServersRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new DiscoverServersRequest.Builder(var1);
   }

   public static DiscoverServersRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<DiscoverServersRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<DiscoverServersRequest> getParserForType() {
      return PARSER;
   }

   public DiscoverServersRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<DiscoverServersRequest.Builder> implements DiscoverServersRequestOrBuilder {
      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_serverdiscovery_v1_DiscoverServersRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_serverdiscovery_v1_DiscoverServersRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(DiscoverServersRequest.class, DiscoverServersRequest.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public DiscoverServersRequest.Builder clear() {
         super.clear();
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_serverdiscovery_v1_DiscoverServersRequest_descriptor;
      }

      public DiscoverServersRequest getDefaultInstanceForType() {
         return DiscoverServersRequest.getDefaultInstance();
      }

      public DiscoverServersRequest build() {
         DiscoverServersRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public DiscoverServersRequest buildPartial() {
         DiscoverServersRequest var1 = new DiscoverServersRequest(this);
         this.onBuilt();
         return var1;
      }

      public DiscoverServersRequest.Builder clone() {
         return (DiscoverServersRequest.Builder)super.clone();
      }

      public DiscoverServersRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (DiscoverServersRequest.Builder)super.setField(var1, var2);
      }

      public DiscoverServersRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (DiscoverServersRequest.Builder)super.clearField(var1);
      }

      public DiscoverServersRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (DiscoverServersRequest.Builder)super.clearOneof(var1);
      }

      public DiscoverServersRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (DiscoverServersRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public DiscoverServersRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (DiscoverServersRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public DiscoverServersRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof DiscoverServersRequest) {
            return this.mergeFrom((DiscoverServersRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public DiscoverServersRequest.Builder mergeFrom(DiscoverServersRequest var1) {
         if (var1 == DiscoverServersRequest.getDefaultInstance()) {
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

      public DiscoverServersRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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

      public final DiscoverServersRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (DiscoverServersRequest.Builder)super.setUnknownFields(var1);
      }

      public final DiscoverServersRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (DiscoverServersRequest.Builder)super.mergeUnknownFields(var1);
      }
   }
}
