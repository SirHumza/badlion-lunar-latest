package com.lunarclient.apollo.transfer.v1;

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

public final class TransferRequest extends GeneratedMessageV3 implements TransferRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int REQUEST_ID_FIELD_NUMBER = 1;
   private ByteString requestId_ = ByteString.EMPTY;
   public static final int SERVER_IP_FIELD_NUMBER = 2;
   private volatile Object serverIp_ = "";
   private byte memoizedIsInitialized = -1;
   private static final TransferRequest DEFAULT_INSTANCE = new TransferRequest();
   private static final Parser<TransferRequest> PARSER = new AbstractParser<TransferRequest>() {
      public TransferRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         TransferRequest.Builder var3 = TransferRequest.newBuilder();

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

   private TransferRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private TransferRequest() {
      this.requestId_ = ByteString.EMPTY;
      this.serverIp_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new TransferRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return SchemaProto.internal_static_lunarclient_apollo_transfer_v1_TransferRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return SchemaProto.internal_static_lunarclient_apollo_transfer_v1_TransferRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(TransferRequest.class, TransferRequest.Builder.class);
   }

   @Override
   public ByteString getRequestId() {
      return this.requestId_;
   }

   @Override
   public String getServerIp() {
      Object var1 = this.serverIp_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.serverIp_ = var3;
      return var3;
   }

   @Override
   public ByteString getServerIpBytes() {
      Object var1 = this.serverIp_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.serverIp_ = var2;
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
      if (!this.requestId_.isEmpty()) {
         var1.writeBytes(1, this.requestId_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.serverIp_)) {
         GeneratedMessageV3.writeString(var1, 2, this.serverIp_);
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
      if (!this.requestId_.isEmpty()) {
         var1 += CodedOutputStream.computeBytesSize(1, this.requestId_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.serverIp_)) {
         var1 += GeneratedMessageV3.computeStringSize(2, this.serverIp_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof TransferRequest)) {
         return super.equals(var1);
      } else {
         TransferRequest var2 = (TransferRequest)var1;
         if (!this.getRequestId().equals(var2.getRequestId())) {
            return false;
         } else {
            return !this.getServerIp().equals(var2.getServerIp()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
         }
      }
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      var1 = 37 * var1 + 1;
      var1 = 53 * var1 + this.getRequestId().hashCode();
      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.getServerIp().hashCode();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static TransferRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static TransferRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static TransferRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static TransferRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static TransferRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static TransferRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static TransferRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static TransferRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static TransferRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static TransferRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static TransferRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static TransferRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public TransferRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static TransferRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static TransferRequest.Builder newBuilder(TransferRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public TransferRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new TransferRequest.Builder() : new TransferRequest.Builder().mergeFrom(this);
   }

   protected TransferRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new TransferRequest.Builder(var1);
   }

   public static TransferRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<TransferRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<TransferRequest> getParserForType() {
      return PARSER;
   }

   public TransferRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<TransferRequest.Builder> implements TransferRequestOrBuilder {
      private int bitField0_;
      private ByteString requestId_ = ByteString.EMPTY;
      private Object serverIp_ = "";

      public static final Descriptors.Descriptor getDescriptor() {
         return SchemaProto.internal_static_lunarclient_apollo_transfer_v1_TransferRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SchemaProto.internal_static_lunarclient_apollo_transfer_v1_TransferRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(TransferRequest.class, TransferRequest.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public TransferRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.requestId_ = ByteString.EMPTY;
         this.serverIp_ = "";
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return SchemaProto.internal_static_lunarclient_apollo_transfer_v1_TransferRequest_descriptor;
      }

      public TransferRequest getDefaultInstanceForType() {
         return TransferRequest.getDefaultInstance();
      }

      public TransferRequest build() {
         TransferRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public TransferRequest buildPartial() {
         TransferRequest var1 = new TransferRequest(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(TransferRequest var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.requestId_ = this.requestId_;
         }

         if ((var2 & 2) != 0) {
            var1.serverIp_ = this.serverIp_;
         }
      }

      public TransferRequest.Builder clone() {
         return (TransferRequest.Builder)super.clone();
      }

      public TransferRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (TransferRequest.Builder)super.setField(var1, var2);
      }

      public TransferRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (TransferRequest.Builder)super.clearField(var1);
      }

      public TransferRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (TransferRequest.Builder)super.clearOneof(var1);
      }

      public TransferRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (TransferRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public TransferRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (TransferRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public TransferRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof TransferRequest) {
            return this.mergeFrom((TransferRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public TransferRequest.Builder mergeFrom(TransferRequest var1) {
         if (var1 == TransferRequest.getDefaultInstance()) {
            return this;
         }

         if (var1.getRequestId() != ByteString.EMPTY) {
            this.setRequestId(var1.getRequestId());
         }

         if (!var1.getServerIp().isEmpty()) {
            this.serverIp_ = var1.serverIp_;
            this.bitField0_ |= 2;
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

      public TransferRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.requestId_ = var1.readBytes();
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     this.serverIp_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 2;
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
      public ByteString getRequestId() {
         return this.requestId_;
      }

      public TransferRequest.Builder setRequestId(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.requestId_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public TransferRequest.Builder clearRequestId() {
         this.bitField0_ &= -2;
         this.requestId_ = TransferRequest.getDefaultInstance().getRequestId();
         this.onChanged();
         return this;
      }

      @Override
      public String getServerIp() {
         Object var1 = this.serverIp_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.serverIp_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getServerIpBytes() {
         Object var1 = this.serverIp_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.serverIp_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public TransferRequest.Builder setServerIp(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.serverIp_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public TransferRequest.Builder clearServerIp() {
         this.serverIp_ = TransferRequest.getDefaultInstance().getServerIp();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      public TransferRequest.Builder setServerIpBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         TransferRequest.checkByteStringIsUtf8(var1);
         this.serverIp_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public final TransferRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (TransferRequest.Builder)super.setUnknownFields(var1);
      }

      public final TransferRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (TransferRequest.Builder)super.mergeUnknownFields(var1);
      }
   }
}
