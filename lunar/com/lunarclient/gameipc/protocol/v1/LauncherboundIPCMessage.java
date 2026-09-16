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

public final class LauncherboundIPCMessage extends GeneratedMessageV3 implements LauncherboundIPCMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int REQUEST_ID_FIELD_NUMBER = 1;
   private ByteString requestId_ = ByteString.EMPTY;
   public static final int SERVICE_FIELD_NUMBER = 2;
   private volatile Object service_ = "";
   public static final int METHOD_FIELD_NUMBER = 3;
   private volatile Object method_ = "";
   public static final int INPUT_FIELD_NUMBER = 4;
   private ByteString input_ = ByteString.EMPTY;
   public static final int FULL_METHOD_FIELD_NUMBER = 6;
   private volatile Object fullMethod_ = "";
   public static final int INPUT_NAME_FIELD_NUMBER = 7;
   private volatile Object inputName_ = "";
   public static final int INPUT_FULL_NAME_FIELD_NUMBER = 8;
   private volatile Object inputFullName_ = "";
   private byte memoizedIsInitialized = -1;
   private static final LauncherboundIPCMessage DEFAULT_INSTANCE = new LauncherboundIPCMessage();
   private static final Parser<LauncherboundIPCMessage> PARSER = new AbstractParser<LauncherboundIPCMessage>() {
      public LauncherboundIPCMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         LauncherboundIPCMessage.Builder var3 = LauncherboundIPCMessage.newBuilder();

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

   private LauncherboundIPCMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private LauncherboundIPCMessage() {
      this.requestId_ = ByteString.EMPTY;
      this.service_ = "";
      this.method_ = "";
      this.input_ = ByteString.EMPTY;
      this.fullMethod_ = "";
      this.inputName_ = "";
      this.inputFullName_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new LauncherboundIPCMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_gameipc_protocol_v1_LauncherboundIPCMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_gameipc_protocol_v1_LauncherboundIPCMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(LauncherboundIPCMessage.class, LauncherboundIPCMessage.Builder.class);
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
   public String getFullMethod() {
      Object var1 = this.fullMethod_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.fullMethod_ = var3;
      return var3;
   }

   @Override
   public ByteString getFullMethodBytes() {
      Object var1 = this.fullMethod_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.fullMethod_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public String getInputName() {
      Object var1 = this.inputName_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.inputName_ = var3;
      return var3;
   }

   @Override
   public ByteString getInputNameBytes() {
      Object var1 = this.inputName_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.inputName_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public String getInputFullName() {
      Object var1 = this.inputFullName_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.inputFullName_ = var3;
      return var3;
   }

   @Override
   public ByteString getInputFullNameBytes() {
      Object var1 = this.inputFullName_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.inputFullName_ = var2;
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

      if (!GeneratedMessageV3.isStringEmpty(this.service_)) {
         GeneratedMessageV3.writeString(var1, 2, this.service_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.method_)) {
         GeneratedMessageV3.writeString(var1, 3, this.method_);
      }

      if (!this.input_.isEmpty()) {
         var1.writeBytes(4, this.input_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.fullMethod_)) {
         GeneratedMessageV3.writeString(var1, 6, this.fullMethod_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.inputName_)) {
         GeneratedMessageV3.writeString(var1, 7, this.inputName_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.inputFullName_)) {
         GeneratedMessageV3.writeString(var1, 8, this.inputFullName_);
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

      if (!GeneratedMessageV3.isStringEmpty(this.fullMethod_)) {
         var1 += GeneratedMessageV3.computeStringSize(6, this.fullMethod_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.inputName_)) {
         var1 += GeneratedMessageV3.computeStringSize(7, this.inputName_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.inputFullName_)) {
         var1 += GeneratedMessageV3.computeStringSize(8, this.inputFullName_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof LauncherboundIPCMessage)) {
         return super.equals(var1);
      } else {
         LauncherboundIPCMessage var2 = (LauncherboundIPCMessage)var1;
         if (!this.getRequestId().equals(var2.getRequestId())) {
            return false;
         } else if (!this.getService().equals(var2.getService())) {
            return false;
         } else if (!this.getMethod().equals(var2.getMethod())) {
            return false;
         } else if (!this.getInput().equals(var2.getInput())) {
            return false;
         } else if (!this.getFullMethod().equals(var2.getFullMethod())) {
            return false;
         } else if (!this.getInputName().equals(var2.getInputName())) {
            return false;
         } else {
            return !this.getInputFullName().equals(var2.getInputFullName()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 37 * var1 + 6;
      var1 = 53 * var1 + this.getFullMethod().hashCode();
      var1 = 37 * var1 + 7;
      var1 = 53 * var1 + this.getInputName().hashCode();
      var1 = 37 * var1 + 8;
      var1 = 53 * var1 + this.getInputFullName().hashCode();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static LauncherboundIPCMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static LauncherboundIPCMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LauncherboundIPCMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static LauncherboundIPCMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LauncherboundIPCMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static LauncherboundIPCMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LauncherboundIPCMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static LauncherboundIPCMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static LauncherboundIPCMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static LauncherboundIPCMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static LauncherboundIPCMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static LauncherboundIPCMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public LauncherboundIPCMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static LauncherboundIPCMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static LauncherboundIPCMessage.Builder newBuilder(LauncherboundIPCMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public LauncherboundIPCMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new LauncherboundIPCMessage.Builder() : new LauncherboundIPCMessage.Builder().mergeFrom(this);
   }

   protected LauncherboundIPCMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new LauncherboundIPCMessage.Builder(var1);
   }

   public static LauncherboundIPCMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<LauncherboundIPCMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<LauncherboundIPCMessage> getParserForType() {
      return PARSER;
   }

   public LauncherboundIPCMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<LauncherboundIPCMessage.Builder> implements LauncherboundIPCMessageOrBuilder {
      private int bitField0_;
      private ByteString requestId_ = ByteString.EMPTY;
      private Object service_ = "";
      private Object method_ = "";
      private ByteString input_ = ByteString.EMPTY;
      private Object fullMethod_ = "";
      private Object inputName_ = "";
      private Object inputFullName_ = "";

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_gameipc_protocol_v1_LauncherboundIPCMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_gameipc_protocol_v1_LauncherboundIPCMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(LauncherboundIPCMessage.class, LauncherboundIPCMessage.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public LauncherboundIPCMessage.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.requestId_ = ByteString.EMPTY;
         this.service_ = "";
         this.method_ = "";
         this.input_ = ByteString.EMPTY;
         this.fullMethod_ = "";
         this.inputName_ = "";
         this.inputFullName_ = "";
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_gameipc_protocol_v1_LauncherboundIPCMessage_descriptor;
      }

      public LauncherboundIPCMessage getDefaultInstanceForType() {
         return LauncherboundIPCMessage.getDefaultInstance();
      }

      public LauncherboundIPCMessage build() {
         LauncherboundIPCMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public LauncherboundIPCMessage buildPartial() {
         LauncherboundIPCMessage var1 = new LauncherboundIPCMessage(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(LauncherboundIPCMessage var1) {
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

         if ((var2 & 16) != 0) {
            var1.fullMethod_ = this.fullMethod_;
         }

         if ((var2 & 32) != 0) {
            var1.inputName_ = this.inputName_;
         }

         if ((var2 & 64) != 0) {
            var1.inputFullName_ = this.inputFullName_;
         }
      }

      public LauncherboundIPCMessage.Builder clone() {
         return (LauncherboundIPCMessage.Builder)super.clone();
      }

      public LauncherboundIPCMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (LauncherboundIPCMessage.Builder)super.setField(var1, var2);
      }

      public LauncherboundIPCMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (LauncherboundIPCMessage.Builder)super.clearField(var1);
      }

      public LauncherboundIPCMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (LauncherboundIPCMessage.Builder)super.clearOneof(var1);
      }

      public LauncherboundIPCMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (LauncherboundIPCMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public LauncherboundIPCMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (LauncherboundIPCMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public LauncherboundIPCMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof LauncherboundIPCMessage) {
            return this.mergeFrom((LauncherboundIPCMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public LauncherboundIPCMessage.Builder mergeFrom(LauncherboundIPCMessage var1) {
         if (var1 == LauncherboundIPCMessage.getDefaultInstance()) {
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

         if (!var1.getFullMethod().isEmpty()) {
            this.fullMethod_ = var1.fullMethod_;
            this.bitField0_ |= 16;
            this.onChanged();
         }

         if (!var1.getInputName().isEmpty()) {
            this.inputName_ = var1.inputName_;
            this.bitField0_ |= 32;
            this.onChanged();
         }

         if (!var1.getInputFullName().isEmpty()) {
            this.inputFullName_ = var1.inputFullName_;
            this.bitField0_ |= 64;
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

      public LauncherboundIPCMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                  case 50:
                     this.fullMethod_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 16;
                     break;
                  case 58:
                     this.inputName_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 32;
                     break;
                  case 66:
                     this.inputFullName_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 64;
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

      public LauncherboundIPCMessage.Builder setRequestId(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.requestId_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public LauncherboundIPCMessage.Builder clearRequestId() {
         this.bitField0_ &= -2;
         this.requestId_ = LauncherboundIPCMessage.getDefaultInstance().getRequestId();
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

      public LauncherboundIPCMessage.Builder setService(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.service_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public LauncherboundIPCMessage.Builder clearService() {
         this.service_ = LauncherboundIPCMessage.getDefaultInstance().getService();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      public LauncherboundIPCMessage.Builder setServiceBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         LauncherboundIPCMessage.checkByteStringIsUtf8(var1);
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

      public LauncherboundIPCMessage.Builder setMethod(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.method_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public LauncherboundIPCMessage.Builder clearMethod() {
         this.method_ = LauncherboundIPCMessage.getDefaultInstance().getMethod();
         this.bitField0_ &= -5;
         this.onChanged();
         return this;
      }

      public LauncherboundIPCMessage.Builder setMethodBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         LauncherboundIPCMessage.checkByteStringIsUtf8(var1);
         this.method_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      @Override
      public ByteString getInput() {
         return this.input_;
      }

      public LauncherboundIPCMessage.Builder setInput(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.input_ = var1;
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public LauncherboundIPCMessage.Builder clearInput() {
         this.bitField0_ &= -9;
         this.input_ = LauncherboundIPCMessage.getDefaultInstance().getInput();
         this.onChanged();
         return this;
      }

      @Override
      public String getFullMethod() {
         Object var1 = this.fullMethod_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.fullMethod_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getFullMethodBytes() {
         Object var1 = this.fullMethod_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.fullMethod_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public LauncherboundIPCMessage.Builder setFullMethod(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.fullMethod_ = var1;
         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      public LauncherboundIPCMessage.Builder clearFullMethod() {
         this.fullMethod_ = LauncherboundIPCMessage.getDefaultInstance().getFullMethod();
         this.bitField0_ &= -17;
         this.onChanged();
         return this;
      }

      public LauncherboundIPCMessage.Builder setFullMethodBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         LauncherboundIPCMessage.checkByteStringIsUtf8(var1);
         this.fullMethod_ = var1;
         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      @Override
      public String getInputName() {
         Object var1 = this.inputName_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.inputName_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getInputNameBytes() {
         Object var1 = this.inputName_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.inputName_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public LauncherboundIPCMessage.Builder setInputName(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.inputName_ = var1;
         this.bitField0_ |= 32;
         this.onChanged();
         return this;
      }

      public LauncherboundIPCMessage.Builder clearInputName() {
         this.inputName_ = LauncherboundIPCMessage.getDefaultInstance().getInputName();
         this.bitField0_ &= -33;
         this.onChanged();
         return this;
      }

      public LauncherboundIPCMessage.Builder setInputNameBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         LauncherboundIPCMessage.checkByteStringIsUtf8(var1);
         this.inputName_ = var1;
         this.bitField0_ |= 32;
         this.onChanged();
         return this;
      }

      @Override
      public String getInputFullName() {
         Object var1 = this.inputFullName_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.inputFullName_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getInputFullNameBytes() {
         Object var1 = this.inputFullName_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.inputFullName_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public LauncherboundIPCMessage.Builder setInputFullName(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.inputFullName_ = var1;
         this.bitField0_ |= 64;
         this.onChanged();
         return this;
      }

      public LauncherboundIPCMessage.Builder clearInputFullName() {
         this.inputFullName_ = LauncherboundIPCMessage.getDefaultInstance().getInputFullName();
         this.bitField0_ &= -65;
         this.onChanged();
         return this;
      }

      public LauncherboundIPCMessage.Builder setInputFullNameBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         LauncherboundIPCMessage.checkByteStringIsUtf8(var1);
         this.inputFullName_ = var1;
         this.bitField0_ |= 64;
         this.onChanged();
         return this;
      }

      public final LauncherboundIPCMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (LauncherboundIPCMessage.Builder)super.setUnknownFields(var1);
      }

      public final LauncherboundIPCMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (LauncherboundIPCMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
