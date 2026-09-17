package com.lunarclient.gameipc.protocol.v1;

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

public final class IPCRpcResponse extends GeneratedMessageV3 implements IPCRpcResponseOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int REQUEST_ID_FIELD_NUMBER = 1;
   private ByteString requestId_ = ByteString.EMPTY;
   public static final int OUTPUT_FIELD_NUMBER = 2;
   private ByteString output_ = ByteString.EMPTY;
   private byte memoizedIsInitialized = -1;
   private static final IPCRpcResponse DEFAULT_INSTANCE = new IPCRpcResponse();
   private static final Parser<IPCRpcResponse> PARSER = new AbstractParser<IPCRpcResponse>() {
      public IPCRpcResponse parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         IPCRpcResponse.Builder var3 = IPCRpcResponse.newBuilder();

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

   private IPCRpcResponse(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private IPCRpcResponse() {
      this.requestId_ = ByteString.EMPTY;
      this.output_ = ByteString.EMPTY;
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new IPCRpcResponse();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_gameipc_protocol_v1_IPCRpcResponse_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_gameipc_protocol_v1_IPCRpcResponse_fieldAccessorTable
         .ensureFieldAccessorsInitialized(IPCRpcResponse.class, IPCRpcResponse.Builder.class);
   }

   @Override
   public ByteString getRequestId() {
      return this.requestId_;
   }

   @Override
   public ByteString getOutput() {
      return this.output_;
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

      if (!this.output_.isEmpty()) {
         var1.writeBytes(2, this.output_);
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

      if (!this.output_.isEmpty()) {
         var1 += CodedOutputStream.computeBytesSize(2, this.output_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof IPCRpcResponse)) {
         return super.equals(var1);
      } else {
         IPCRpcResponse var2 = (IPCRpcResponse)var1;
         if (!this.getRequestId().equals(var2.getRequestId())) {
            return false;
         } else {
            return !this.getOutput().equals(var2.getOutput()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + this.getOutput().hashCode();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static IPCRpcResponse parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static IPCRpcResponse parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static IPCRpcResponse parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static IPCRpcResponse parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static IPCRpcResponse parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static IPCRpcResponse parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static IPCRpcResponse parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static IPCRpcResponse parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static IPCRpcResponse parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static IPCRpcResponse parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static IPCRpcResponse parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static IPCRpcResponse parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public IPCRpcResponse.Builder newBuilderForType() {
      return newBuilder();
   }

   public static IPCRpcResponse.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static IPCRpcResponse.Builder newBuilder(IPCRpcResponse var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public IPCRpcResponse.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new IPCRpcResponse.Builder() : new IPCRpcResponse.Builder().mergeFrom(this);
   }

   protected IPCRpcResponse.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new IPCRpcResponse.Builder(var1);
   }

   public static IPCRpcResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<IPCRpcResponse> parser() {
      return PARSER;
   }

   @Override
   public Parser<IPCRpcResponse> getParserForType() {
      return PARSER;
   }

   public IPCRpcResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<IPCRpcResponse.Builder> implements IPCRpcResponseOrBuilder {
      private int bitField0_;
      private ByteString requestId_ = ByteString.EMPTY;
      private ByteString output_ = ByteString.EMPTY;

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_gameipc_protocol_v1_IPCRpcResponse_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_gameipc_protocol_v1_IPCRpcResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(IPCRpcResponse.class, IPCRpcResponse.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public IPCRpcResponse.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.requestId_ = ByteString.EMPTY;
         this.output_ = ByteString.EMPTY;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_gameipc_protocol_v1_IPCRpcResponse_descriptor;
      }

      public IPCRpcResponse getDefaultInstanceForType() {
         return IPCRpcResponse.getDefaultInstance();
      }

      public IPCRpcResponse build() {
         IPCRpcResponse var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public IPCRpcResponse buildPartial() {
         IPCRpcResponse var1 = new IPCRpcResponse(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(IPCRpcResponse var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.requestId_ = this.requestId_;
         }

         if ((var2 & 2) != 0) {
            var1.output_ = this.output_;
         }
      }

      public IPCRpcResponse.Builder clone() {
         return (IPCRpcResponse.Builder)super.clone();
      }

      public IPCRpcResponse.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (IPCRpcResponse.Builder)super.setField(var1, var2);
      }

      public IPCRpcResponse.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (IPCRpcResponse.Builder)super.clearField(var1);
      }

      public IPCRpcResponse.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (IPCRpcResponse.Builder)super.clearOneof(var1);
      }

      public IPCRpcResponse.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (IPCRpcResponse.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public IPCRpcResponse.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (IPCRpcResponse.Builder)super.addRepeatedField(var1, var2);
      }

      public IPCRpcResponse.Builder mergeFrom(Message var1) {
         if (var1 instanceof IPCRpcResponse) {
            return this.mergeFrom((IPCRpcResponse)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public IPCRpcResponse.Builder mergeFrom(IPCRpcResponse var1) {
         if (var1 == IPCRpcResponse.getDefaultInstance()) {
            return this;
         }

         if (var1.getRequestId() != ByteString.EMPTY) {
            this.setRequestId(var1.getRequestId());
         }

         if (var1.getOutput() != ByteString.EMPTY) {
            this.setOutput(var1.getOutput());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public IPCRpcResponse.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.output_ = var1.readBytes();
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

      public IPCRpcResponse.Builder setRequestId(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.requestId_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public IPCRpcResponse.Builder clearRequestId() {
         this.bitField0_ &= -2;
         this.requestId_ = IPCRpcResponse.getDefaultInstance().getRequestId();
         this.onChanged();
         return this;
      }

      @Override
      public ByteString getOutput() {
         return this.output_;
      }

      public IPCRpcResponse.Builder setOutput(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.output_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public IPCRpcResponse.Builder clearOutput() {
         this.bitField0_ &= -3;
         this.output_ = IPCRpcResponse.getDefaultInstance().getOutput();
         this.onChanged();
         return this;
      }

      public final IPCRpcResponse.Builder setUnknownFields(UnknownFieldSet var1) {
         return (IPCRpcResponse.Builder)super.setUnknownFields(var1);
      }

      public final IPCRpcResponse.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (IPCRpcResponse.Builder)super.mergeUnknownFields(var1);
      }
   }
}
