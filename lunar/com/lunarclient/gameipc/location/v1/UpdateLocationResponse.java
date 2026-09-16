package com.lunarclient.gameipc.location.v1;

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

public final class UpdateLocationResponse extends GeneratedMessageV3 implements UpdateLocationResponseOrBuilder {
   private static final long serialVersionUID = 0L;
   private byte memoizedIsInitialized = -1;
   private static final UpdateLocationResponse DEFAULT_INSTANCE = new UpdateLocationResponse();
   private static final Parser<UpdateLocationResponse> PARSER = new AbstractParser<UpdateLocationResponse>() {
      public UpdateLocationResponse parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         UpdateLocationResponse.Builder var3 = UpdateLocationResponse.newBuilder();

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

   private UpdateLocationResponse(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private UpdateLocationResponse() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new UpdateLocationResponse();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_gameipc_location_v1_UpdateLocationResponse_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_gameipc_location_v1_UpdateLocationResponse_fieldAccessorTable
         .ensureFieldAccessorsInitialized(UpdateLocationResponse.class, UpdateLocationResponse.Builder.class);
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

      if (!(var1 instanceof UpdateLocationResponse)) {
         return super.equals(var1);
      }

      UpdateLocationResponse var2 = (UpdateLocationResponse)var1;
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

   public static UpdateLocationResponse parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static UpdateLocationResponse parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UpdateLocationResponse parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static UpdateLocationResponse parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UpdateLocationResponse parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static UpdateLocationResponse parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UpdateLocationResponse parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UpdateLocationResponse parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static UpdateLocationResponse parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static UpdateLocationResponse parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static UpdateLocationResponse parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UpdateLocationResponse parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public UpdateLocationResponse.Builder newBuilderForType() {
      return newBuilder();
   }

   public static UpdateLocationResponse.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static UpdateLocationResponse.Builder newBuilder(UpdateLocationResponse var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public UpdateLocationResponse.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new UpdateLocationResponse.Builder() : new UpdateLocationResponse.Builder().mergeFrom(this);
   }

   protected UpdateLocationResponse.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new UpdateLocationResponse.Builder(var1);
   }

   public static UpdateLocationResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<UpdateLocationResponse> parser() {
      return PARSER;
   }

   @Override
   public Parser<UpdateLocationResponse> getParserForType() {
      return PARSER;
   }

   public UpdateLocationResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<UpdateLocationResponse.Builder> implements UpdateLocationResponseOrBuilder {
      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_gameipc_location_v1_UpdateLocationResponse_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_gameipc_location_v1_UpdateLocationResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(UpdateLocationResponse.class, UpdateLocationResponse.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public UpdateLocationResponse.Builder clear() {
         super.clear();
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_gameipc_location_v1_UpdateLocationResponse_descriptor;
      }

      public UpdateLocationResponse getDefaultInstanceForType() {
         return UpdateLocationResponse.getDefaultInstance();
      }

      public UpdateLocationResponse build() {
         UpdateLocationResponse var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public UpdateLocationResponse buildPartial() {
         UpdateLocationResponse var1 = new UpdateLocationResponse(this);
         this.onBuilt();
         return var1;
      }

      public UpdateLocationResponse.Builder clone() {
         return (UpdateLocationResponse.Builder)super.clone();
      }

      public UpdateLocationResponse.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (UpdateLocationResponse.Builder)super.setField(var1, var2);
      }

      public UpdateLocationResponse.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (UpdateLocationResponse.Builder)super.clearField(var1);
      }

      public UpdateLocationResponse.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (UpdateLocationResponse.Builder)super.clearOneof(var1);
      }

      public UpdateLocationResponse.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (UpdateLocationResponse.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public UpdateLocationResponse.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (UpdateLocationResponse.Builder)super.addRepeatedField(var1, var2);
      }

      public UpdateLocationResponse.Builder mergeFrom(Message var1) {
         if (var1 instanceof UpdateLocationResponse) {
            return this.mergeFrom((UpdateLocationResponse)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public UpdateLocationResponse.Builder mergeFrom(UpdateLocationResponse var1) {
         if (var1 == UpdateLocationResponse.getDefaultInstance()) {
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

      public UpdateLocationResponse.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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

      public final UpdateLocationResponse.Builder setUnknownFields(UnknownFieldSet var1) {
         return (UpdateLocationResponse.Builder)super.setUnknownFields(var1);
      }

      public final UpdateLocationResponse.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (UpdateLocationResponse.Builder)super.mergeUnknownFields(var1);
      }
   }
}
