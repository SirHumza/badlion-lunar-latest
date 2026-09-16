package com.lunarclient.gameipc.browser.v1;

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

public final class OpenUrlResponse extends GeneratedMessageV3 implements OpenUrlResponseOrBuilder {
   private static final long serialVersionUID = 0L;
   private byte memoizedIsInitialized = -1;
   private static final OpenUrlResponse DEFAULT_INSTANCE = new OpenUrlResponse();
   private static final Parser<OpenUrlResponse> PARSER = new AbstractParser<OpenUrlResponse>() {
      public OpenUrlResponse parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         OpenUrlResponse.Builder var3 = OpenUrlResponse.newBuilder();

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

   private OpenUrlResponse(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private OpenUrlResponse() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new OpenUrlResponse();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_gameipc_browser_v1_OpenUrlResponse_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_gameipc_browser_v1_OpenUrlResponse_fieldAccessorTable
         .ensureFieldAccessorsInitialized(OpenUrlResponse.class, OpenUrlResponse.Builder.class);
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

      if (!(var1 instanceof OpenUrlResponse)) {
         return super.equals(var1);
      }

      OpenUrlResponse var2 = (OpenUrlResponse)var1;
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

   public static OpenUrlResponse parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static OpenUrlResponse parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OpenUrlResponse parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static OpenUrlResponse parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OpenUrlResponse parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static OpenUrlResponse parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OpenUrlResponse parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static OpenUrlResponse parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static OpenUrlResponse parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static OpenUrlResponse parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static OpenUrlResponse parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static OpenUrlResponse parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public OpenUrlResponse.Builder newBuilderForType() {
      return newBuilder();
   }

   public static OpenUrlResponse.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static OpenUrlResponse.Builder newBuilder(OpenUrlResponse var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public OpenUrlResponse.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new OpenUrlResponse.Builder() : new OpenUrlResponse.Builder().mergeFrom(this);
   }

   protected OpenUrlResponse.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new OpenUrlResponse.Builder(var1);
   }

   public static OpenUrlResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<OpenUrlResponse> parser() {
      return PARSER;
   }

   @Override
   public Parser<OpenUrlResponse> getParserForType() {
      return PARSER;
   }

   public OpenUrlResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<OpenUrlResponse.Builder> implements OpenUrlResponseOrBuilder {
      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_gameipc_browser_v1_OpenUrlResponse_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_gameipc_browser_v1_OpenUrlResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(OpenUrlResponse.class, OpenUrlResponse.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public OpenUrlResponse.Builder clear() {
         super.clear();
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_gameipc_browser_v1_OpenUrlResponse_descriptor;
      }

      public OpenUrlResponse getDefaultInstanceForType() {
         return OpenUrlResponse.getDefaultInstance();
      }

      public OpenUrlResponse build() {
         OpenUrlResponse var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public OpenUrlResponse buildPartial() {
         OpenUrlResponse var1 = new OpenUrlResponse(this);
         this.onBuilt();
         return var1;
      }

      public OpenUrlResponse.Builder clone() {
         return (OpenUrlResponse.Builder)super.clone();
      }

      public OpenUrlResponse.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (OpenUrlResponse.Builder)super.setField(var1, var2);
      }

      public OpenUrlResponse.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (OpenUrlResponse.Builder)super.clearField(var1);
      }

      public OpenUrlResponse.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (OpenUrlResponse.Builder)super.clearOneof(var1);
      }

      public OpenUrlResponse.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (OpenUrlResponse.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public OpenUrlResponse.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (OpenUrlResponse.Builder)super.addRepeatedField(var1, var2);
      }

      public OpenUrlResponse.Builder mergeFrom(Message var1) {
         if (var1 instanceof OpenUrlResponse) {
            return this.mergeFrom((OpenUrlResponse)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public OpenUrlResponse.Builder mergeFrom(OpenUrlResponse var1) {
         if (var1 == OpenUrlResponse.getDefaultInstance()) {
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

      public OpenUrlResponse.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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

      public final OpenUrlResponse.Builder setUnknownFields(UnknownFieldSet var1) {
         return (OpenUrlResponse.Builder)super.setUnknownFields(var1);
      }

      public final OpenUrlResponse.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (OpenUrlResponse.Builder)super.mergeUnknownFields(var1);
      }
   }
}
