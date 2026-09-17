package com.lunarclient.websocket.protocol.v1;

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

public final class WebSocketRpcResponse extends GeneratedMessageV3 implements WebSocketRpcResponseOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int REQUEST_ID_FIELD_NUMBER = 1;
   private ByteString requestId_ = ByteString.EMPTY;
   public static final int OUTPUT_FIELD_NUMBER = 2;
   private ByteString output_ = ByteString.EMPTY;
   private byte memoizedIsInitialized = -1;
   private static final WebSocketRpcResponse DEFAULT_INSTANCE = new WebSocketRpcResponse();
   private static final Parser<WebSocketRpcResponse> PARSER = new AbstractParser<WebSocketRpcResponse>() {
      public WebSocketRpcResponse parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         WebSocketRpcResponse.Builder var3 = WebSocketRpcResponse.newBuilder();

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

   private WebSocketRpcResponse(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private WebSocketRpcResponse() {
      this.requestId_ = ByteString.EMPTY;
      this.output_ = ByteString.EMPTY;
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new WebSocketRpcResponse();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_protocol_v1_WebSocketRpcResponse_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_protocol_v1_WebSocketRpcResponse_fieldAccessorTable
         .ensureFieldAccessorsInitialized(WebSocketRpcResponse.class, WebSocketRpcResponse.Builder.class);
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
      } else if (!(var1 instanceof WebSocketRpcResponse)) {
         return super.equals(var1);
      } else {
         WebSocketRpcResponse var2 = (WebSocketRpcResponse)var1;
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

   public static WebSocketRpcResponse parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static WebSocketRpcResponse parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static WebSocketRpcResponse parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static WebSocketRpcResponse parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static WebSocketRpcResponse parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static WebSocketRpcResponse parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static WebSocketRpcResponse parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static WebSocketRpcResponse parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static WebSocketRpcResponse parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static WebSocketRpcResponse parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static WebSocketRpcResponse parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static WebSocketRpcResponse parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public WebSocketRpcResponse.Builder newBuilderForType() {
      return newBuilder();
   }

   public static WebSocketRpcResponse.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static WebSocketRpcResponse.Builder newBuilder(WebSocketRpcResponse var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public WebSocketRpcResponse.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new WebSocketRpcResponse.Builder() : new WebSocketRpcResponse.Builder().mergeFrom(this);
   }

   protected WebSocketRpcResponse.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new WebSocketRpcResponse.Builder(var1);
   }

   public static WebSocketRpcResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<WebSocketRpcResponse> parser() {
      return PARSER;
   }

   @Override
   public Parser<WebSocketRpcResponse> getParserForType() {
      return PARSER;
   }

   public WebSocketRpcResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<WebSocketRpcResponse.Builder> implements WebSocketRpcResponseOrBuilder {
      private int bitField0_;
      private ByteString requestId_ = ByteString.EMPTY;
      private ByteString output_ = ByteString.EMPTY;

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_protocol_v1_WebSocketRpcResponse_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_protocol_v1_WebSocketRpcResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(WebSocketRpcResponse.class, WebSocketRpcResponse.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public WebSocketRpcResponse.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.requestId_ = ByteString.EMPTY;
         this.output_ = ByteString.EMPTY;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_protocol_v1_WebSocketRpcResponse_descriptor;
      }

      public WebSocketRpcResponse getDefaultInstanceForType() {
         return WebSocketRpcResponse.getDefaultInstance();
      }

      public WebSocketRpcResponse build() {
         WebSocketRpcResponse var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public WebSocketRpcResponse buildPartial() {
         WebSocketRpcResponse var1 = new WebSocketRpcResponse(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(WebSocketRpcResponse var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.requestId_ = this.requestId_;
         }

         if ((var2 & 2) != 0) {
            var1.output_ = this.output_;
         }
      }

      public WebSocketRpcResponse.Builder clone() {
         return (WebSocketRpcResponse.Builder)super.clone();
      }

      public WebSocketRpcResponse.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (WebSocketRpcResponse.Builder)super.setField(var1, var2);
      }

      public WebSocketRpcResponse.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (WebSocketRpcResponse.Builder)super.clearField(var1);
      }

      public WebSocketRpcResponse.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (WebSocketRpcResponse.Builder)super.clearOneof(var1);
      }

      public WebSocketRpcResponse.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (WebSocketRpcResponse.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public WebSocketRpcResponse.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (WebSocketRpcResponse.Builder)super.addRepeatedField(var1, var2);
      }

      public WebSocketRpcResponse.Builder mergeFrom(Message var1) {
         if (var1 instanceof WebSocketRpcResponse) {
            return this.mergeFrom((WebSocketRpcResponse)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public WebSocketRpcResponse.Builder mergeFrom(WebSocketRpcResponse var1) {
         if (var1 == WebSocketRpcResponse.getDefaultInstance()) {
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

      public WebSocketRpcResponse.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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

      public WebSocketRpcResponse.Builder setRequestId(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.requestId_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public WebSocketRpcResponse.Builder clearRequestId() {
         this.bitField0_ &= -2;
         this.requestId_ = WebSocketRpcResponse.getDefaultInstance().getRequestId();
         this.onChanged();
         return this;
      }

      @Override
      public ByteString getOutput() {
         return this.output_;
      }

      public WebSocketRpcResponse.Builder setOutput(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.output_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public WebSocketRpcResponse.Builder clearOutput() {
         this.bitField0_ &= -3;
         this.output_ = WebSocketRpcResponse.getDefaultInstance().getOutput();
         this.onChanged();
         return this;
      }

      public final WebSocketRpcResponse.Builder setUnknownFields(UnknownFieldSet var1) {
         return (WebSocketRpcResponse.Builder)super.setUnknownFields(var1);
      }

      public final WebSocketRpcResponse.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (WebSocketRpcResponse.Builder)super.mergeUnknownFields(var1);
      }
   }
}
