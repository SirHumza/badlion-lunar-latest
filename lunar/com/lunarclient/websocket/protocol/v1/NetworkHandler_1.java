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

public final class ServerboundWebSocketMessage extends GeneratedMessageV3 implements ServerboundWebSocketMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int REQUEST_ID_FIELD_NUMBER = 1;
   private ByteString requestId_ = ByteString.EMPTY;
   public static final int SERVICE_FIELD_NUMBER = 2;
   private volatile Object service_ = "";
   public static final int METHOD_FIELD_NUMBER = 3;
   private volatile Object method_ = "";
   public static final int INPUT_FIELD_NUMBER = 4;
   private ByteString input_ = ByteString.EMPTY;
   private byte memoizedIsInitialized = -1;
   private static final ServerboundWebSocketMessage DEFAULT_INSTANCE = new ServerboundWebSocketMessage();
   private static final Parser<ServerboundWebSocketMessage> PARSER = new AbstractParser<ServerboundWebSocketMessage>() {
      public ServerboundWebSocketMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         ServerboundWebSocketMessage.Builder var3 = ServerboundWebSocketMessage.newBuilder();

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

   private ServerboundWebSocketMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private ServerboundWebSocketMessage() {
      this.requestId_ = ByteString.EMPTY;
      this.service_ = "";
      this.method_ = "";
      this.input_ = ByteString.EMPTY;
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new ServerboundWebSocketMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_protocol_v1_ServerboundWebSocketMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_protocol_v1_ServerboundWebSocketMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(ServerboundWebSocketMessage.class, ServerboundWebSocketMessage.Builder.class);
   }

   @Override
   public ByteString getRequestId() {
      return this.requestId_;
   }

   @Override
   public String getService() {
      Object var1 = this.service_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.service_ = var3;
      return var3;
   }

   @Override
   public ByteString getServiceBytes() {
      Object var1 = this.service_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.service_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public String getMethod() {
      Object var1 = this.method_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.method_ = var3;
      return var3;
   }

   @Override
   public ByteString getMethodBytes() {
      Object var1 = this.method_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.method_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public ByteString getInput() {
      return this.input_;
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

      if (!GeneratedMessageV3.isStringEmpty(this.service_)) {
         GeneratedMessageV3.writeString(var1, 2, this.service_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.method_)) {
         GeneratedMessageV3.writeString(var1, 3, this.method_);
      }

      if (!this.input_.isEmpty()) {
         var1.writeBytes(4, this.input_);
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

      if (!GeneratedMessageV3.isStringEmpty(this.service_)) {
         var1 += GeneratedMessageV3.computeStringSize(2, this.service_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.method_)) {
         var1 += GeneratedMessageV3.computeStringSize(3, this.method_);
      }

      if (!this.input_.isEmpty()) {
         var1 += CodedOutputStream.computeBytesSize(4, this.input_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof ServerboundWebSocketMessage)) {
         return super.equals(var1);
      } else {
         ServerboundWebSocketMessage var2 = (ServerboundWebSocketMessage)var1;
         if (!this.getRequestId().equals(var2.getRequestId())) {
            return false;
         } else if (!this.getService().equals(var2.getService())) {
            return false;
         } else if (!this.getMethod().equals(var2.getMethod())) {
            return false;
         } else {
            return !this.getInput().equals(var2.getInput()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + this.getService().hashCode();
      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + this.getMethod().hashCode();
      var1 = 37 * var1 + 4;
      var1 = 53 * var1 + this.getInput().hashCode();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static ServerboundWebSocketMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static ServerboundWebSocketMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ServerboundWebSocketMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static ServerboundWebSocketMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ServerboundWebSocketMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static ServerboundWebSocketMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ServerboundWebSocketMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ServerboundWebSocketMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ServerboundWebSocketMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ServerboundWebSocketMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ServerboundWebSocketMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ServerboundWebSocketMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public ServerboundWebSocketMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static ServerboundWebSocketMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ServerboundWebSocketMessage.Builder newBuilder(ServerboundWebSocketMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public ServerboundWebSocketMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new ServerboundWebSocketMessage.Builder() : new ServerboundWebSocketMessage.Builder().mergeFrom(this);
   }

   protected ServerboundWebSocketMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new ServerboundWebSocketMessage.Builder(var1);
   }

   public static ServerboundWebSocketMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<ServerboundWebSocketMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<ServerboundWebSocketMessage> getParserForType() {
      return PARSER;
   }

   public ServerboundWebSocketMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<ServerboundWebSocketMessage.Builder> implements ServerboundWebSocketMessageOrBuilder {
      private int bitField0_;
      private ByteString requestId_ = ByteString.EMPTY;
      private Object service_ = "";
      private Object method_ = "";
      private ByteString input_ = ByteString.EMPTY;

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_protocol_v1_ServerboundWebSocketMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_protocol_v1_ServerboundWebSocketMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ServerboundWebSocketMessage.class, ServerboundWebSocketMessage.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public ServerboundWebSocketMessage.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.requestId_ = ByteString.EMPTY;
         this.service_ = "";
         this.method_ = "";
         this.input_ = ByteString.EMPTY;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_protocol_v1_ServerboundWebSocketMessage_descriptor;
      }

      public ServerboundWebSocketMessage getDefaultInstanceForType() {
         return ServerboundWebSocketMessage.getDefaultInstance();
      }

      public ServerboundWebSocketMessage build() {
         ServerboundWebSocketMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public ServerboundWebSocketMessage buildPartial() {
         ServerboundWebSocketMessage var1 = new ServerboundWebSocketMessage(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(ServerboundWebSocketMessage var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.requestId_ = this.requestId_;
         }

         if ((var2 & 2) != 0) {
            var1.service_ = this.service_;
         }

         if ((var2 & 4) != 0) {
            var1.method_ = this.method_;
         }

         if ((var2 & 8) != 0) {
            var1.input_ = this.input_;
         }
      }

      public ServerboundWebSocketMessage.Builder clone() {
         return (ServerboundWebSocketMessage.Builder)super.clone();
      }

      public ServerboundWebSocketMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ServerboundWebSocketMessage.Builder)super.setField(var1, var2);
      }

      public ServerboundWebSocketMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (ServerboundWebSocketMessage.Builder)super.clearField(var1);
      }

      public ServerboundWebSocketMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (ServerboundWebSocketMessage.Builder)super.clearOneof(var1);
      }

      public ServerboundWebSocketMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (ServerboundWebSocketMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public ServerboundWebSocketMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ServerboundWebSocketMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public ServerboundWebSocketMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof ServerboundWebSocketMessage) {
            return this.mergeFrom((ServerboundWebSocketMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public ServerboundWebSocketMessage.Builder mergeFrom(ServerboundWebSocketMessage var1) {
         if (var1 == ServerboundWebSocketMessage.getDefaultInstance()) {
            return this;
         }

         if (var1.getRequestId() != ByteString.EMPTY) {
            this.setRequestId(var1.getRequestId());
         }

         if (!var1.getService().isEmpty()) {
            this.service_ = var1.service_;
            this.bitField0_ |= 2;
            this.onChanged();
         }

         if (!var1.getMethod().isEmpty()) {
            this.method_ = var1.method_;
            this.bitField0_ |= 4;
            this.onChanged();
         }

         if (var1.getInput() != ByteString.EMPTY) {
            this.setInput(var1.getInput());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public ServerboundWebSocketMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.service_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 2;
                     break;
                  case 26:
                     this.method_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 4;
                     break;
                  case 34:
                     this.input_ = var1.readBytes();
                     this.bitField0_ |= 8;
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

      public ServerboundWebSocketMessage.Builder setRequestId(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.requestId_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public ServerboundWebSocketMessage.Builder clearRequestId() {
         this.bitField0_ &= -2;
         this.requestId_ = ServerboundWebSocketMessage.getDefaultInstance().getRequestId();
         this.onChanged();
         return this;
      }

      @Override
      public String getService() {
         Object var1 = this.service_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.service_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getServiceBytes() {
         Object var1 = this.service_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.service_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public ServerboundWebSocketMessage.Builder setService(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.service_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public ServerboundWebSocketMessage.Builder clearService() {
         this.service_ = ServerboundWebSocketMessage.getDefaultInstance().getService();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      public ServerboundWebSocketMessage.Builder setServiceBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         ServerboundWebSocketMessage.checkByteStringIsUtf8(var1);
         this.service_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      @Override
      public String getMethod() {
         Object var1 = this.method_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.method_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getMethodBytes() {
         Object var1 = this.method_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.method_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public ServerboundWebSocketMessage.Builder setMethod(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.method_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public ServerboundWebSocketMessage.Builder clearMethod() {
         this.method_ = ServerboundWebSocketMessage.getDefaultInstance().getMethod();
         this.bitField0_ &= -5;
         this.onChanged();
         return this;
      }

      public ServerboundWebSocketMessage.Builder setMethodBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         ServerboundWebSocketMessage.checkByteStringIsUtf8(var1);
         this.method_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      @Override
      public ByteString getInput() {
         return this.input_;
      }

      public ServerboundWebSocketMessage.Builder setInput(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.input_ = var1;
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public ServerboundWebSocketMessage.Builder clearInput() {
         this.bitField0_ &= -9;
         this.input_ = ServerboundWebSocketMessage.getDefaultInstance().getInput();
         this.onChanged();
         return this;
      }

      public final ServerboundWebSocketMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (ServerboundWebSocketMessage.Builder)super.setUnknownFields(var1);
      }

      public final ServerboundWebSocketMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (ServerboundWebSocketMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
