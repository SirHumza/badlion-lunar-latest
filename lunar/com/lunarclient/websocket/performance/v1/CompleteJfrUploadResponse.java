package com.lunarclient.websocket.performance.v1;

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

public final class CompleteJfrUploadResponse extends GeneratedMessageV3 implements CompleteJfrUploadResponseOrBuilder {
   private static final long serialVersionUID = 0L;
   private byte memoizedIsInitialized = -1;
   private static final CompleteJfrUploadResponse DEFAULT_INSTANCE = new CompleteJfrUploadResponse();
   private static final Parser<CompleteJfrUploadResponse> PARSER = new AbstractParser<CompleteJfrUploadResponse>() {
      public CompleteJfrUploadResponse parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         CompleteJfrUploadResponse.Builder var3 = CompleteJfrUploadResponse.newBuilder();

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

   private CompleteJfrUploadResponse(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private CompleteJfrUploadResponse() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new CompleteJfrUploadResponse();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_performance_v1_CompleteJfrUploadResponse_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_performance_v1_CompleteJfrUploadResponse_fieldAccessorTable
         .ensureFieldAccessorsInitialized(CompleteJfrUploadResponse.class, CompleteJfrUploadResponse.Builder.class);
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

      if (!(var1 instanceof CompleteJfrUploadResponse)) {
         return super.equals(var1);
      }

      CompleteJfrUploadResponse var2 = (CompleteJfrUploadResponse)var1;
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

   public static CompleteJfrUploadResponse parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static CompleteJfrUploadResponse parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static CompleteJfrUploadResponse parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static CompleteJfrUploadResponse parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static CompleteJfrUploadResponse parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static CompleteJfrUploadResponse parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static CompleteJfrUploadResponse parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static CompleteJfrUploadResponse parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static CompleteJfrUploadResponse parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static CompleteJfrUploadResponse parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static CompleteJfrUploadResponse parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static CompleteJfrUploadResponse parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public CompleteJfrUploadResponse.Builder newBuilderForType() {
      return newBuilder();
   }

   public static CompleteJfrUploadResponse.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static CompleteJfrUploadResponse.Builder newBuilder(CompleteJfrUploadResponse var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public CompleteJfrUploadResponse.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new CompleteJfrUploadResponse.Builder() : new CompleteJfrUploadResponse.Builder().mergeFrom(this);
   }

   protected CompleteJfrUploadResponse.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new CompleteJfrUploadResponse.Builder(var1);
   }

   public static CompleteJfrUploadResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<CompleteJfrUploadResponse> parser() {
      return PARSER;
   }

   @Override
   public Parser<CompleteJfrUploadResponse> getParserForType() {
      return PARSER;
   }

   public CompleteJfrUploadResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<CompleteJfrUploadResponse.Builder> implements CompleteJfrUploadResponseOrBuilder {
      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_performance_v1_CompleteJfrUploadResponse_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_performance_v1_CompleteJfrUploadResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(CompleteJfrUploadResponse.class, CompleteJfrUploadResponse.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public CompleteJfrUploadResponse.Builder clear() {
         super.clear();
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_performance_v1_CompleteJfrUploadResponse_descriptor;
      }

      public CompleteJfrUploadResponse getDefaultInstanceForType() {
         return CompleteJfrUploadResponse.getDefaultInstance();
      }

      public CompleteJfrUploadResponse build() {
         CompleteJfrUploadResponse var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public CompleteJfrUploadResponse buildPartial() {
         CompleteJfrUploadResponse var1 = new CompleteJfrUploadResponse(this);
         this.onBuilt();
         return var1;
      }

      public CompleteJfrUploadResponse.Builder clone() {
         return (CompleteJfrUploadResponse.Builder)super.clone();
      }

      public CompleteJfrUploadResponse.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (CompleteJfrUploadResponse.Builder)super.setField(var1, var2);
      }

      public CompleteJfrUploadResponse.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (CompleteJfrUploadResponse.Builder)super.clearField(var1);
      }

      public CompleteJfrUploadResponse.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (CompleteJfrUploadResponse.Builder)super.clearOneof(var1);
      }

      public CompleteJfrUploadResponse.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (CompleteJfrUploadResponse.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public CompleteJfrUploadResponse.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (CompleteJfrUploadResponse.Builder)super.addRepeatedField(var1, var2);
      }

      public CompleteJfrUploadResponse.Builder mergeFrom(Message var1) {
         if (var1 instanceof CompleteJfrUploadResponse) {
            return this.mergeFrom((CompleteJfrUploadResponse)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public CompleteJfrUploadResponse.Builder mergeFrom(CompleteJfrUploadResponse var1) {
         if (var1 == CompleteJfrUploadResponse.getDefaultInstance()) {
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

      public CompleteJfrUploadResponse.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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

      public final CompleteJfrUploadResponse.Builder setUnknownFields(UnknownFieldSet var1) {
         return (CompleteJfrUploadResponse.Builder)super.setUnknownFields(var1);
      }

      public final CompleteJfrUploadResponse.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (CompleteJfrUploadResponse.Builder)super.mergeUnknownFields(var1);
      }
   }
}
