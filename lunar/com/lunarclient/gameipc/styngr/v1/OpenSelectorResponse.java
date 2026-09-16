package com.lunarclient.gameipc.styngr.v1;

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

public final class OpenSelectorResponse extends GeneratedMessageV3 implements OpenSelectorResponseOrBuilder {
   private static final long serialVersionUID = 0L;
   private byte memoizedIsInitialized = -1;
   private static final OpenSelectorResponse DEFAULT_INSTANCE = new OpenSelectorResponse();
   private static final Parser<OpenSelectorResponse> PARSER = new AbstractParser<OpenSelectorResponse>() {
      public OpenSelectorResponse parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         OpenSelectorResponse.Builder var3 = OpenSelectorResponse.newBuilder();

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

   private OpenSelectorResponse(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private OpenSelectorResponse() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new OpenSelectorResponse();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_gameipc_styngr_v1_OpenSelectorResponse_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_gameipc_styngr_v1_OpenSelectorResponse_fieldAccessorTable
         .ensureFieldAccessorsInitialized(OpenSelectorResponse.class, OpenSelectorResponse.Builder.class);
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

      if (!(var1 instanceof OpenSelectorResponse)) {
         return super.equals(var1);
      }

      OpenSelectorResponse var2 = (OpenSelectorResponse)var1;
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

   public static OpenSelectorResponse parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static OpenSelectorResponse parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OpenSelectorResponse parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static OpenSelectorResponse parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OpenSelectorResponse parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static OpenSelectorResponse parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OpenSelectorResponse parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static OpenSelectorResponse parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static OpenSelectorResponse parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static OpenSelectorResponse parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static OpenSelectorResponse parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static OpenSelectorResponse parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public OpenSelectorResponse.Builder newBuilderForType() {
      return newBuilder();
   }

   public static OpenSelectorResponse.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static OpenSelectorResponse.Builder newBuilder(OpenSelectorResponse var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public OpenSelectorResponse.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new OpenSelectorResponse.Builder() : new OpenSelectorResponse.Builder().mergeFrom(this);
   }

   protected OpenSelectorResponse.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new OpenSelectorResponse.Builder(var1);
   }

   public static OpenSelectorResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<OpenSelectorResponse> parser() {
      return PARSER;
   }

   @Override
   public Parser<OpenSelectorResponse> getParserForType() {
      return PARSER;
   }

   public OpenSelectorResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<OpenSelectorResponse.Builder> implements OpenSelectorResponseOrBuilder {
      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_gameipc_styngr_v1_OpenSelectorResponse_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_gameipc_styngr_v1_OpenSelectorResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(OpenSelectorResponse.class, OpenSelectorResponse.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public OpenSelectorResponse.Builder clear() {
         super.clear();
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_gameipc_styngr_v1_OpenSelectorResponse_descriptor;
      }

      public OpenSelectorResponse getDefaultInstanceForType() {
         return OpenSelectorResponse.getDefaultInstance();
      }

      public OpenSelectorResponse build() {
         OpenSelectorResponse var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public OpenSelectorResponse buildPartial() {
         OpenSelectorResponse var1 = new OpenSelectorResponse(this);
         this.onBuilt();
         return var1;
      }

      public OpenSelectorResponse.Builder clone() {
         return (OpenSelectorResponse.Builder)super.clone();
      }

      public OpenSelectorResponse.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (OpenSelectorResponse.Builder)super.setField(var1, var2);
      }

      public OpenSelectorResponse.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (OpenSelectorResponse.Builder)super.clearField(var1);
      }

      public OpenSelectorResponse.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (OpenSelectorResponse.Builder)super.clearOneof(var1);
      }

      public OpenSelectorResponse.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (OpenSelectorResponse.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public OpenSelectorResponse.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (OpenSelectorResponse.Builder)super.addRepeatedField(var1, var2);
      }

      public OpenSelectorResponse.Builder mergeFrom(Message var1) {
         if (var1 instanceof OpenSelectorResponse) {
            return this.mergeFrom((OpenSelectorResponse)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public OpenSelectorResponse.Builder mergeFrom(OpenSelectorResponse var1) {
         if (var1 == OpenSelectorResponse.getDefaultInstance()) {
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

      public OpenSelectorResponse.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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

      public final OpenSelectorResponse.Builder setUnknownFields(UnknownFieldSet var1) {
         return (OpenSelectorResponse.Builder)super.setUnknownFields(var1);
      }

      public final OpenSelectorResponse.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (OpenSelectorResponse.Builder)super.mergeUnknownFields(var1);
      }
   }
}
