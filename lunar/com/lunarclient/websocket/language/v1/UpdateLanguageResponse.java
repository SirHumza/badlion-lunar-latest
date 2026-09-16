package com.lunarclient.websocket.language.v1;

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

public final class UpdateLanguageResponse extends GeneratedMessageV3 implements UpdateLanguageResponseOrBuilder {
   private static final long serialVersionUID = 0L;
   private byte memoizedIsInitialized = -1;
   private static final UpdateLanguageResponse DEFAULT_INSTANCE = new UpdateLanguageResponse();
   private static final Parser<UpdateLanguageResponse> PARSER = new AbstractParser<UpdateLanguageResponse>() {
      public UpdateLanguageResponse parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         UpdateLanguageResponse.Builder var3 = UpdateLanguageResponse.newBuilder();

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

   private UpdateLanguageResponse(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private UpdateLanguageResponse() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new UpdateLanguageResponse();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_language_v1_UpdateLanguageResponse_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_language_v1_UpdateLanguageResponse_fieldAccessorTable
         .ensureFieldAccessorsInitialized(UpdateLanguageResponse.class, UpdateLanguageResponse.Builder.class);
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

      if (!(var1 instanceof UpdateLanguageResponse)) {
         return super.equals(var1);
      }

      UpdateLanguageResponse var2 = (UpdateLanguageResponse)var1;
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

   public static UpdateLanguageResponse parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static UpdateLanguageResponse parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UpdateLanguageResponse parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static UpdateLanguageResponse parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UpdateLanguageResponse parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static UpdateLanguageResponse parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UpdateLanguageResponse parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UpdateLanguageResponse parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static UpdateLanguageResponse parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static UpdateLanguageResponse parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static UpdateLanguageResponse parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UpdateLanguageResponse parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public UpdateLanguageResponse.Builder newBuilderForType() {
      return newBuilder();
   }

   public static UpdateLanguageResponse.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static UpdateLanguageResponse.Builder newBuilder(UpdateLanguageResponse var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public UpdateLanguageResponse.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new UpdateLanguageResponse.Builder() : new UpdateLanguageResponse.Builder().mergeFrom(this);
   }

   protected UpdateLanguageResponse.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new UpdateLanguageResponse.Builder(var1);
   }

   public static UpdateLanguageResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<UpdateLanguageResponse> parser() {
      return PARSER;
   }

   @Override
   public Parser<UpdateLanguageResponse> getParserForType() {
      return PARSER;
   }

   public UpdateLanguageResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<UpdateLanguageResponse.Builder> implements UpdateLanguageResponseOrBuilder {
      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_language_v1_UpdateLanguageResponse_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_language_v1_UpdateLanguageResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(UpdateLanguageResponse.class, UpdateLanguageResponse.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public UpdateLanguageResponse.Builder clear() {
         super.clear();
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_language_v1_UpdateLanguageResponse_descriptor;
      }

      public UpdateLanguageResponse getDefaultInstanceForType() {
         return UpdateLanguageResponse.getDefaultInstance();
      }

      public UpdateLanguageResponse build() {
         UpdateLanguageResponse var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public UpdateLanguageResponse buildPartial() {
         UpdateLanguageResponse var1 = new UpdateLanguageResponse(this);
         this.onBuilt();
         return var1;
      }

      public UpdateLanguageResponse.Builder clone() {
         return (UpdateLanguageResponse.Builder)super.clone();
      }

      public UpdateLanguageResponse.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (UpdateLanguageResponse.Builder)super.setField(var1, var2);
      }

      public UpdateLanguageResponse.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (UpdateLanguageResponse.Builder)super.clearField(var1);
      }

      public UpdateLanguageResponse.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (UpdateLanguageResponse.Builder)super.clearOneof(var1);
      }

      public UpdateLanguageResponse.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (UpdateLanguageResponse.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public UpdateLanguageResponse.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (UpdateLanguageResponse.Builder)super.addRepeatedField(var1, var2);
      }

      public UpdateLanguageResponse.Builder mergeFrom(Message var1) {
         if (var1 instanceof UpdateLanguageResponse) {
            return this.mergeFrom((UpdateLanguageResponse)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public UpdateLanguageResponse.Builder mergeFrom(UpdateLanguageResponse var1) {
         if (var1 == UpdateLanguageResponse.getDefaultInstance()) {
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

      public UpdateLanguageResponse.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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

      public final UpdateLanguageResponse.Builder setUnknownFields(UnknownFieldSet var1) {
         return (UpdateLanguageResponse.Builder)super.setUnknownFields(var1);
      }

      public final UpdateLanguageResponse.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (UpdateLanguageResponse.Builder)super.mergeUnknownFields(var1);
      }
   }
}
