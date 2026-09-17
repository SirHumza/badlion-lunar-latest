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

public final class CompleteJfrUploadRequest extends GeneratedMessageV3 implements CompleteJfrUploadRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int UPLOAD_ID_FIELD_NUMBER = 1;
   private volatile Object uploadId_ = "";
   private byte memoizedIsInitialized = -1;
   private static final CompleteJfrUploadRequest DEFAULT_INSTANCE = new CompleteJfrUploadRequest();
   private static final Parser<CompleteJfrUploadRequest> PARSER = new AbstractParser<CompleteJfrUploadRequest>() {
      public CompleteJfrUploadRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         CompleteJfrUploadRequest.Builder var3 = CompleteJfrUploadRequest.newBuilder();

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

   private CompleteJfrUploadRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private CompleteJfrUploadRequest() {
      this.uploadId_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new CompleteJfrUploadRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_performance_v1_CompleteJfrUploadRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_performance_v1_CompleteJfrUploadRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(CompleteJfrUploadRequest.class, CompleteJfrUploadRequest.Builder.class);
   }

   @Override
   public String getUploadId() {
      Object var1 = this.uploadId_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.uploadId_ = var3;
      return var3;
   }

   @Override
   public ByteString getUploadIdBytes() {
      Object var1 = this.uploadId_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.uploadId_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
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
      if (!GeneratedMessageV3.isStringEmpty(this.uploadId_)) {
         GeneratedMessageV3.writeString(var1, 1, this.uploadId_);
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
      if (!GeneratedMessageV3.isStringEmpty(this.uploadId_)) {
         var1 += GeneratedMessageV3.computeStringSize(1, this.uploadId_);
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

      if (!(var1 instanceof CompleteJfrUploadRequest)) {
         return super.equals(var1);
      }

      CompleteJfrUploadRequest var2 = (CompleteJfrUploadRequest)var1;
      return !this.getUploadId().equals(var2.getUploadId()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      var1 = 37 * var1 + 1;
      var1 = 53 * var1 + this.getUploadId().hashCode();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static CompleteJfrUploadRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static CompleteJfrUploadRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static CompleteJfrUploadRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static CompleteJfrUploadRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static CompleteJfrUploadRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static CompleteJfrUploadRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static CompleteJfrUploadRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static CompleteJfrUploadRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static CompleteJfrUploadRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static CompleteJfrUploadRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static CompleteJfrUploadRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static CompleteJfrUploadRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public CompleteJfrUploadRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static CompleteJfrUploadRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static CompleteJfrUploadRequest.Builder newBuilder(CompleteJfrUploadRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public CompleteJfrUploadRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new CompleteJfrUploadRequest.Builder() : new CompleteJfrUploadRequest.Builder().mergeFrom(this);
   }

   protected CompleteJfrUploadRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new CompleteJfrUploadRequest.Builder(var1);
   }

   public static CompleteJfrUploadRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<CompleteJfrUploadRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<CompleteJfrUploadRequest> getParserForType() {
      return PARSER;
   }

   public CompleteJfrUploadRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<CompleteJfrUploadRequest.Builder> implements CompleteJfrUploadRequestOrBuilder {
      private int bitField0_;
      private Object uploadId_ = "";

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_performance_v1_CompleteJfrUploadRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_performance_v1_CompleteJfrUploadRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(CompleteJfrUploadRequest.class, CompleteJfrUploadRequest.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public CompleteJfrUploadRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.uploadId_ = "";
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_performance_v1_CompleteJfrUploadRequest_descriptor;
      }

      public CompleteJfrUploadRequest getDefaultInstanceForType() {
         return CompleteJfrUploadRequest.getDefaultInstance();
      }

      public CompleteJfrUploadRequest build() {
         CompleteJfrUploadRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public CompleteJfrUploadRequest buildPartial() {
         CompleteJfrUploadRequest var1 = new CompleteJfrUploadRequest(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(CompleteJfrUploadRequest var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.uploadId_ = this.uploadId_;
         }
      }

      public CompleteJfrUploadRequest.Builder clone() {
         return (CompleteJfrUploadRequest.Builder)super.clone();
      }

      public CompleteJfrUploadRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (CompleteJfrUploadRequest.Builder)super.setField(var1, var2);
      }

      public CompleteJfrUploadRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (CompleteJfrUploadRequest.Builder)super.clearField(var1);
      }

      public CompleteJfrUploadRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (CompleteJfrUploadRequest.Builder)super.clearOneof(var1);
      }

      public CompleteJfrUploadRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (CompleteJfrUploadRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public CompleteJfrUploadRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (CompleteJfrUploadRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public CompleteJfrUploadRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof CompleteJfrUploadRequest) {
            return this.mergeFrom((CompleteJfrUploadRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public CompleteJfrUploadRequest.Builder mergeFrom(CompleteJfrUploadRequest var1) {
         if (var1 == CompleteJfrUploadRequest.getDefaultInstance()) {
            return this;
         }

         if (!var1.getUploadId().isEmpty()) {
            this.uploadId_ = var1.uploadId_;
            this.bitField0_ |= 1;
            this.onChanged();
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public CompleteJfrUploadRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                  case 10:
                     this.uploadId_ = var1.readStringRequireUtf8();
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
      public String getUploadId() {
         Object var1 = this.uploadId_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.uploadId_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getUploadIdBytes() {
         Object var1 = this.uploadId_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.uploadId_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public CompleteJfrUploadRequest.Builder setUploadId(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.uploadId_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public CompleteJfrUploadRequest.Builder clearUploadId() {
         this.uploadId_ = CompleteJfrUploadRequest.getDefaultInstance().getUploadId();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public CompleteJfrUploadRequest.Builder setUploadIdBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         CompleteJfrUploadRequest.checkByteStringIsUtf8(var1);
         this.uploadId_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public final CompleteJfrUploadRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (CompleteJfrUploadRequest.Builder)super.setUnknownFields(var1);
      }

      public final CompleteJfrUploadRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (CompleteJfrUploadRequest.Builder)super.mergeUnknownFields(var1);
      }
   }
}
