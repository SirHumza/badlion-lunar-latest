package com.lunarclient.authenticator.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class ServerboundWebSocketMessage extends GeneratedMessageV3 implements ServerboundWebSocketMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   private int contentsCase_ = 0;
   private Object contents_;
   public static final int HELLO_FIELD_NUMBER = 1;
   public static final int ENCRYPTION_RESPONSE_FIELD_NUMBER = 2;
   public static final int ENCRYPTION_FAIL_FIELD_NUMBER = 3;
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
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new ServerboundWebSocketMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ProtocolProto.internal_static_lunarclient_authenticator_v1_ServerboundWebSocketMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ProtocolProto.internal_static_lunarclient_authenticator_v1_ServerboundWebSocketMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(ServerboundWebSocketMessage.class, ServerboundWebSocketMessage.Builder.class);
   }

   @Override
   public ServerboundWebSocketMessage.ContentsCase getContentsCase() {
      return ServerboundWebSocketMessage.ContentsCase.forNumber(this.contentsCase_);
   }

   @Override
   public boolean hasHello() {
      return this.contentsCase_ == 1;
   }

   @Override
   public HelloMessage getHello() {
      return this.contentsCase_ == 1 ? (HelloMessage)this.contents_ : HelloMessage.getDefaultInstance();
   }

   @Override
   public HelloMessageOrBuilder getHelloOrBuilder() {
      return this.contentsCase_ == 1 ? (HelloMessage)this.contents_ : HelloMessage.getDefaultInstance();
   }

   @Override
   public boolean hasEncryptionResponse() {
      return this.contentsCase_ == 2;
   }

   @Override
   public EncryptionResponseMessage getEncryptionResponse() {
      return this.contentsCase_ == 2 ? (EncryptionResponseMessage)this.contents_ : EncryptionResponseMessage.getDefaultInstance();
   }

   @Override
   public EncryptionResponseMessageOrBuilder getEncryptionResponseOrBuilder() {
      return this.contentsCase_ == 2 ? (EncryptionResponseMessage)this.contents_ : EncryptionResponseMessage.getDefaultInstance();
   }

   @Override
   public boolean hasEncryptionFail() {
      return this.contentsCase_ == 3;
   }

   @Override
   public EncryptionFailMessage getEncryptionFail() {
      return this.contentsCase_ == 3 ? (EncryptionFailMessage)this.contents_ : EncryptionFailMessage.getDefaultInstance();
   }

   @Override
   public EncryptionFailMessageOrBuilder getEncryptionFailOrBuilder() {
      return this.contentsCase_ == 3 ? (EncryptionFailMessage)this.contents_ : EncryptionFailMessage.getDefaultInstance();
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
      if (this.contentsCase_ == 1) {
         var1.writeMessage(1, (HelloMessage)this.contents_);
      }

      if (this.contentsCase_ == 2) {
         var1.writeMessage(2, (EncryptionResponseMessage)this.contents_);
      }

      if (this.contentsCase_ == 3) {
         var1.writeMessage(3, (EncryptionFailMessage)this.contents_);
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
      if (this.contentsCase_ == 1) {
         var1 += CodedOutputStream.computeMessageSize(1, (HelloMessage)this.contents_);
      }

      if (this.contentsCase_ == 2) {
         var1 += CodedOutputStream.computeMessageSize(2, (EncryptionResponseMessage)this.contents_);
      }

      if (this.contentsCase_ == 3) {
         var1 += CodedOutputStream.computeMessageSize(3, (EncryptionFailMessage)this.contents_);
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

      if (!(var1 instanceof ServerboundWebSocketMessage)) {
         return super.equals(var1);
      }

      ServerboundWebSocketMessage var2 = (ServerboundWebSocketMessage)var1;
      if (!this.getContentsCase().equals(var2.getContentsCase())) {
         return false;
      }

      switch (this.contentsCase_) {
         case 0:
         default:
            break;
         case 1:
            if (!this.getHello().equals(var2.getHello())) {
               return false;
            }
            break;
         case 2:
            if (!this.getEncryptionResponse().equals(var2.getEncryptionResponse())) {
               return false;
            }
            break;
         case 3:
            if (!this.getEncryptionFail().equals(var2.getEncryptionFail())) {
               return false;
            }
      }

      return this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      switch (this.contentsCase_) {
         case 0:
         default:
            break;
         case 1:
            var1 = 37 * var1 + 1;
            var1 = 53 * var1 + this.getHello().hashCode();
            break;
         case 2:
            var1 = 37 * var1 + 2;
            var1 = 53 * var1 + this.getEncryptionResponse().hashCode();
            break;
         case 3:
            var1 = 37 * var1 + 3;
            var1 = 53 * var1 + this.getEncryptionFail().hashCode();
      }

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
      private int contentsCase_ = 0;
      private Object contents_;
      private int bitField0_;
      private SingleFieldBuilderV3<HelloMessage, HelloMessage.Builder, HelloMessageOrBuilder> helloBuilder_;
      private SingleFieldBuilderV3<EncryptionResponseMessage, EncryptionResponseMessage.Builder, EncryptionResponseMessageOrBuilder> encryptionResponseBuilder_;
      private SingleFieldBuilderV3<EncryptionFailMessage, EncryptionFailMessage.Builder, EncryptionFailMessageOrBuilder> encryptionFailBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ProtocolProto.internal_static_lunarclient_authenticator_v1_ServerboundWebSocketMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ProtocolProto.internal_static_lunarclient_authenticator_v1_ServerboundWebSocketMessage_fieldAccessorTable
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
         if (this.helloBuilder_ != null) {
            this.helloBuilder_.clear();
         }

         if (this.encryptionResponseBuilder_ != null) {
            this.encryptionResponseBuilder_.clear();
         }

         if (this.encryptionFailBuilder_ != null) {
            this.encryptionFailBuilder_.clear();
         }

         this.contentsCase_ = 0;
         this.contents_ = null;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ProtocolProto.internal_static_lunarclient_authenticator_v1_ServerboundWebSocketMessage_descriptor;
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

         this.buildPartialOneofs(var1);
         this.onBuilt();
         return var1;
      }

      private void buildPartial0(ServerboundWebSocketMessage var1) {
         int var2 = this.bitField0_;
      }

      private void buildPartialOneofs(ServerboundWebSocketMessage var1) {
         var1.contentsCase_ = this.contentsCase_;
         var1.contents_ = this.contents_;
         if (this.contentsCase_ == 1 && this.helloBuilder_ != null) {
            var1.contents_ = this.helloBuilder_.build();
         }

         if (this.contentsCase_ == 2 && this.encryptionResponseBuilder_ != null) {
            var1.contents_ = this.encryptionResponseBuilder_.build();
         }

         if (this.contentsCase_ == 3 && this.encryptionFailBuilder_ != null) {
            var1.contents_ = this.encryptionFailBuilder_.build();
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

         switch (var1.getContentsCase()) {
            case HELLO:
               this.mergeHello(var1.getHello());
               break;
            case ENCRYPTION_RESPONSE:
               this.mergeEncryptionResponse(var1.getEncryptionResponse());
               break;
            case ENCRYPTION_FAIL:
               this.mergeEncryptionFail(var1.getEncryptionFail());
            case CONTENTS_NOT_SET:
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
                     var1.readMessage(this.getHelloFieldBuilder().getBuilder(), var2);
                     this.contentsCase_ = 1;
                     break;
                  case 18:
                     var1.readMessage(this.getEncryptionResponseFieldBuilder().getBuilder(), var2);
                     this.contentsCase_ = 2;
                     break;
                  case 26:
                     var1.readMessage(this.getEncryptionFailFieldBuilder().getBuilder(), var2);
                     this.contentsCase_ = 3;
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
      public ServerboundWebSocketMessage.ContentsCase getContentsCase() {
         return ServerboundWebSocketMessage.ContentsCase.forNumber(this.contentsCase_);
      }

      public ServerboundWebSocketMessage.Builder clearContents() {
         this.contentsCase_ = 0;
         this.contents_ = null;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasHello() {
         return this.contentsCase_ == 1;
      }

      @Override
      public HelloMessage getHello() {
         if (this.helloBuilder_ == null) {
            return this.contentsCase_ == 1 ? (HelloMessage)this.contents_ : HelloMessage.getDefaultInstance();
         } else {
            return this.contentsCase_ == 1 ? this.helloBuilder_.getMessage() : HelloMessage.getDefaultInstance();
         }
      }

      public ServerboundWebSocketMessage.Builder setHello(HelloMessage var1) {
         if (this.helloBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.contents_ = var1;
            this.onChanged();
         } else {
            this.helloBuilder_.setMessage(var1);
         }

         this.contentsCase_ = 1;
         return this;
      }

      public ServerboundWebSocketMessage.Builder setHello(HelloMessage.Builder var1) {
         if (this.helloBuilder_ == null) {
            this.contents_ = var1.build();
            this.onChanged();
         } else {
            this.helloBuilder_.setMessage(var1.build());
         }

         this.contentsCase_ = 1;
         return this;
      }

      public ServerboundWebSocketMessage.Builder mergeHello(HelloMessage var1) {
         if (this.helloBuilder_ == null) {
            if (this.contentsCase_ == 1 && this.contents_ != HelloMessage.getDefaultInstance()) {
               this.contents_ = HelloMessage.newBuilder((HelloMessage)this.contents_).mergeFrom(var1).buildPartial();
            } else {
               this.contents_ = var1;
            }

            this.onChanged();
         } else if (this.contentsCase_ == 1) {
            this.helloBuilder_.mergeFrom(var1);
         } else {
            this.helloBuilder_.setMessage(var1);
         }

         this.contentsCase_ = 1;
         return this;
      }

      public ServerboundWebSocketMessage.Builder clearHello() {
         if (this.helloBuilder_ == null) {
            if (this.contentsCase_ == 1) {
               this.contentsCase_ = 0;
               this.contents_ = null;
               this.onChanged();
            }
         } else {
            if (this.contentsCase_ == 1) {
               this.contentsCase_ = 0;
               this.contents_ = null;
            }

            this.helloBuilder_.clear();
         }

         return this;
      }

      public HelloMessage.Builder getHelloBuilder() {
         return this.getHelloFieldBuilder().getBuilder();
      }

      @Override
      public HelloMessageOrBuilder getHelloOrBuilder() {
         if (this.contentsCase_ == 1 && this.helloBuilder_ != null) {
            return this.helloBuilder_.getMessageOrBuilder();
         } else {
            return this.contentsCase_ == 1 ? (HelloMessage)this.contents_ : HelloMessage.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<HelloMessage, HelloMessage.Builder, HelloMessageOrBuilder> getHelloFieldBuilder() {
         if (this.helloBuilder_ == null) {
            if (this.contentsCase_ != 1) {
               this.contents_ = HelloMessage.getDefaultInstance();
            }

            this.helloBuilder_ = new SingleFieldBuilderV3<>((HelloMessage)this.contents_, this.getParentForChildren(), this.isClean());
            this.contents_ = null;
         }

         this.contentsCase_ = 1;
         this.onChanged();
         return this.helloBuilder_;
      }

      @Override
      public boolean hasEncryptionResponse() {
         return this.contentsCase_ == 2;
      }

      @Override
      public EncryptionResponseMessage getEncryptionResponse() {
         if (this.encryptionResponseBuilder_ == null) {
            return this.contentsCase_ == 2 ? (EncryptionResponseMessage)this.contents_ : EncryptionResponseMessage.getDefaultInstance();
         } else {
            return this.contentsCase_ == 2 ? this.encryptionResponseBuilder_.getMessage() : EncryptionResponseMessage.getDefaultInstance();
         }
      }

      public ServerboundWebSocketMessage.Builder setEncryptionResponse(EncryptionResponseMessage var1) {
         if (this.encryptionResponseBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.contents_ = var1;
            this.onChanged();
         } else {
            this.encryptionResponseBuilder_.setMessage(var1);
         }

         this.contentsCase_ = 2;
         return this;
      }

      public ServerboundWebSocketMessage.Builder setEncryptionResponse(EncryptionResponseMessage.Builder var1) {
         if (this.encryptionResponseBuilder_ == null) {
            this.contents_ = var1.build();
            this.onChanged();
         } else {
            this.encryptionResponseBuilder_.setMessage(var1.build());
         }

         this.contentsCase_ = 2;
         return this;
      }

      public ServerboundWebSocketMessage.Builder mergeEncryptionResponse(EncryptionResponseMessage var1) {
         if (this.encryptionResponseBuilder_ == null) {
            if (this.contentsCase_ == 2 && this.contents_ != EncryptionResponseMessage.getDefaultInstance()) {
               this.contents_ = EncryptionResponseMessage.newBuilder((EncryptionResponseMessage)this.contents_).mergeFrom(var1).buildPartial();
            } else {
               this.contents_ = var1;
            }

            this.onChanged();
         } else if (this.contentsCase_ == 2) {
            this.encryptionResponseBuilder_.mergeFrom(var1);
         } else {
            this.encryptionResponseBuilder_.setMessage(var1);
         }

         this.contentsCase_ = 2;
         return this;
      }

      public ServerboundWebSocketMessage.Builder clearEncryptionResponse() {
         if (this.encryptionResponseBuilder_ == null) {
            if (this.contentsCase_ == 2) {
               this.contentsCase_ = 0;
               this.contents_ = null;
               this.onChanged();
            }
         } else {
            if (this.contentsCase_ == 2) {
               this.contentsCase_ = 0;
               this.contents_ = null;
            }

            this.encryptionResponseBuilder_.clear();
         }

         return this;
      }

      public EncryptionResponseMessage.Builder getEncryptionResponseBuilder() {
         return this.getEncryptionResponseFieldBuilder().getBuilder();
      }

      @Override
      public EncryptionResponseMessageOrBuilder getEncryptionResponseOrBuilder() {
         if (this.contentsCase_ == 2 && this.encryptionResponseBuilder_ != null) {
            return this.encryptionResponseBuilder_.getMessageOrBuilder();
         } else {
            return this.contentsCase_ == 2 ? (EncryptionResponseMessage)this.contents_ : EncryptionResponseMessage.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<EncryptionResponseMessage, EncryptionResponseMessage.Builder, EncryptionResponseMessageOrBuilder> getEncryptionResponseFieldBuilder() {
         if (this.encryptionResponseBuilder_ == null) {
            if (this.contentsCase_ != 2) {
               this.contents_ = EncryptionResponseMessage.getDefaultInstance();
            }

            this.encryptionResponseBuilder_ = new SingleFieldBuilderV3<>((EncryptionResponseMessage)this.contents_, this.getParentForChildren(), this.isClean());
            this.contents_ = null;
         }

         this.contentsCase_ = 2;
         this.onChanged();
         return this.encryptionResponseBuilder_;
      }

      @Override
      public boolean hasEncryptionFail() {
         return this.contentsCase_ == 3;
      }

      @Override
      public EncryptionFailMessage getEncryptionFail() {
         if (this.encryptionFailBuilder_ == null) {
            return this.contentsCase_ == 3 ? (EncryptionFailMessage)this.contents_ : EncryptionFailMessage.getDefaultInstance();
         } else {
            return this.contentsCase_ == 3 ? this.encryptionFailBuilder_.getMessage() : EncryptionFailMessage.getDefaultInstance();
         }
      }

      public ServerboundWebSocketMessage.Builder setEncryptionFail(EncryptionFailMessage var1) {
         if (this.encryptionFailBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.contents_ = var1;
            this.onChanged();
         } else {
            this.encryptionFailBuilder_.setMessage(var1);
         }

         this.contentsCase_ = 3;
         return this;
      }

      public ServerboundWebSocketMessage.Builder setEncryptionFail(EncryptionFailMessage.Builder var1) {
         if (this.encryptionFailBuilder_ == null) {
            this.contents_ = var1.build();
            this.onChanged();
         } else {
            this.encryptionFailBuilder_.setMessage(var1.build());
         }

         this.contentsCase_ = 3;
         return this;
      }

      public ServerboundWebSocketMessage.Builder mergeEncryptionFail(EncryptionFailMessage var1) {
         if (this.encryptionFailBuilder_ == null) {
            if (this.contentsCase_ == 3 && this.contents_ != EncryptionFailMessage.getDefaultInstance()) {
               this.contents_ = EncryptionFailMessage.newBuilder((EncryptionFailMessage)this.contents_).mergeFrom(var1).buildPartial();
            } else {
               this.contents_ = var1;
            }

            this.onChanged();
         } else if (this.contentsCase_ == 3) {
            this.encryptionFailBuilder_.mergeFrom(var1);
         } else {
            this.encryptionFailBuilder_.setMessage(var1);
         }

         this.contentsCase_ = 3;
         return this;
      }

      public ServerboundWebSocketMessage.Builder clearEncryptionFail() {
         if (this.encryptionFailBuilder_ == null) {
            if (this.contentsCase_ == 3) {
               this.contentsCase_ = 0;
               this.contents_ = null;
               this.onChanged();
            }
         } else {
            if (this.contentsCase_ == 3) {
               this.contentsCase_ = 0;
               this.contents_ = null;
            }

            this.encryptionFailBuilder_.clear();
         }

         return this;
      }

      public EncryptionFailMessage.Builder getEncryptionFailBuilder() {
         return this.getEncryptionFailFieldBuilder().getBuilder();
      }

      @Override
      public EncryptionFailMessageOrBuilder getEncryptionFailOrBuilder() {
         if (this.contentsCase_ == 3 && this.encryptionFailBuilder_ != null) {
            return this.encryptionFailBuilder_.getMessageOrBuilder();
         } else {
            return this.contentsCase_ == 3 ? (EncryptionFailMessage)this.contents_ : EncryptionFailMessage.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<EncryptionFailMessage, EncryptionFailMessage.Builder, EncryptionFailMessageOrBuilder> getEncryptionFailFieldBuilder() {
         if (this.encryptionFailBuilder_ == null) {
            if (this.contentsCase_ != 3) {
               this.contents_ = EncryptionFailMessage.getDefaultInstance();
            }

            this.encryptionFailBuilder_ = new SingleFieldBuilderV3<>((EncryptionFailMessage)this.contents_, this.getParentForChildren(), this.isClean());
            this.contents_ = null;
         }

         this.contentsCase_ = 3;
         this.onChanged();
         return this.encryptionFailBuilder_;
      }

      public final ServerboundWebSocketMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (ServerboundWebSocketMessage.Builder)super.setUnknownFields(var1);
      }

      public final ServerboundWebSocketMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (ServerboundWebSocketMessage.Builder)super.mergeUnknownFields(var1);
      }
   }

   public enum ContentsCase implements AbstractMessageLite.InternalOneOfEnum, Internal.EnumLite {
      HELLO(1),
      ENCRYPTION_RESPONSE(2),
      ENCRYPTION_FAIL(3),
      CONTENTS_NOT_SET(0);

      private final int value;

      ContentsCase(int var3) {
         this.value = var3;
      }

      @Deprecated
      public static ServerboundWebSocketMessage.ContentsCase valueOf(int var0) {
         return forNumber(var0);
      }

      public static ServerboundWebSocketMessage.ContentsCase forNumber(int var0) {
         switch (var0) {
            case 0:
               return CONTENTS_NOT_SET;
            case 1:
               return HELLO;
            case 2:
               return ENCRYPTION_RESPONSE;
            case 3:
               return ENCRYPTION_FAIL;
            default:
               return null;
         }
      }

      @Override
      public int getNumber() {
         return this.value;
      }
   }
}
