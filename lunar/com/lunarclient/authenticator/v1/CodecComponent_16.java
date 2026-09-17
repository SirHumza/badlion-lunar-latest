package com.lunarclient.authenticator.v1;

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

public final class EncryptionResponseMessage extends GeneratedMessageV3 implements EncryptionResponseMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int SECRET_KEY_FIELD_NUMBER = 1;
   private ByteString secretKey_ = ByteString.EMPTY;
   public static final int PUBLIC_KEY_FIELD_NUMBER = 2;
   private ByteString publicKey_ = ByteString.EMPTY;
   private byte memoizedIsInitialized = -1;
   private static final EncryptionResponseMessage DEFAULT_INSTANCE = new EncryptionResponseMessage();
   private static final Parser<EncryptionResponseMessage> PARSER = new AbstractParser<EncryptionResponseMessage>() {
      public EncryptionResponseMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         EncryptionResponseMessage.Builder var3 = EncryptionResponseMessage.newBuilder();

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

   private EncryptionResponseMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private EncryptionResponseMessage() {
      this.secretKey_ = ByteString.EMPTY;
      this.publicKey_ = ByteString.EMPTY;
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new EncryptionResponseMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return MessageProto.internal_static_lunarclient_authenticator_v1_EncryptionResponseMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return MessageProto.internal_static_lunarclient_authenticator_v1_EncryptionResponseMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(EncryptionResponseMessage.class, EncryptionResponseMessage.Builder.class);
   }

   @Override
   public ByteString getSecretKey() {
      return this.secretKey_;
   }

   @Override
   public ByteString getPublicKey() {
      return this.publicKey_;
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
      if (!this.secretKey_.isEmpty()) {
         var1.writeBytes(1, this.secretKey_);
      }

      if (!this.publicKey_.isEmpty()) {
         var1.writeBytes(2, this.publicKey_);
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
      if (!this.secretKey_.isEmpty()) {
         var1 += CodedOutputStream.computeBytesSize(1, this.secretKey_);
      }

      if (!this.publicKey_.isEmpty()) {
         var1 += CodedOutputStream.computeBytesSize(2, this.publicKey_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof EncryptionResponseMessage)) {
         return super.equals(var1);
      } else {
         EncryptionResponseMessage var2 = (EncryptionResponseMessage)var1;
         if (!this.getSecretKey().equals(var2.getSecretKey())) {
            return false;
         } else {
            return !this.getPublicKey().equals(var2.getPublicKey()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + this.getSecretKey().hashCode();
      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.getPublicKey().hashCode();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static EncryptionResponseMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static EncryptionResponseMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static EncryptionResponseMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static EncryptionResponseMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static EncryptionResponseMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static EncryptionResponseMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static EncryptionResponseMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static EncryptionResponseMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static EncryptionResponseMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static EncryptionResponseMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static EncryptionResponseMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static EncryptionResponseMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public EncryptionResponseMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static EncryptionResponseMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static EncryptionResponseMessage.Builder newBuilder(EncryptionResponseMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public EncryptionResponseMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new EncryptionResponseMessage.Builder() : new EncryptionResponseMessage.Builder().mergeFrom(this);
   }

   protected EncryptionResponseMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new EncryptionResponseMessage.Builder(var1);
   }

   public static EncryptionResponseMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<EncryptionResponseMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<EncryptionResponseMessage> getParserForType() {
      return PARSER;
   }

   public EncryptionResponseMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<EncryptionResponseMessage.Builder> implements EncryptionResponseMessageOrBuilder {
      private int bitField0_;
      private ByteString secretKey_ = ByteString.EMPTY;
      private ByteString publicKey_ = ByteString.EMPTY;

      public static final Descriptors.Descriptor getDescriptor() {
         return MessageProto.internal_static_lunarclient_authenticator_v1_EncryptionResponseMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MessageProto.internal_static_lunarclient_authenticator_v1_EncryptionResponseMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(EncryptionResponseMessage.class, EncryptionResponseMessage.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public EncryptionResponseMessage.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.secretKey_ = ByteString.EMPTY;
         this.publicKey_ = ByteString.EMPTY;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return MessageProto.internal_static_lunarclient_authenticator_v1_EncryptionResponseMessage_descriptor;
      }

      public EncryptionResponseMessage getDefaultInstanceForType() {
         return EncryptionResponseMessage.getDefaultInstance();
      }

      public EncryptionResponseMessage build() {
         EncryptionResponseMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public EncryptionResponseMessage buildPartial() {
         EncryptionResponseMessage var1 = new EncryptionResponseMessage(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(EncryptionResponseMessage var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.secretKey_ = this.secretKey_;
         }

         if ((var2 & 2) != 0) {
            var1.publicKey_ = this.publicKey_;
         }
      }

      public EncryptionResponseMessage.Builder clone() {
         return (EncryptionResponseMessage.Builder)super.clone();
      }

      public EncryptionResponseMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (EncryptionResponseMessage.Builder)super.setField(var1, var2);
      }

      public EncryptionResponseMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (EncryptionResponseMessage.Builder)super.clearField(var1);
      }

      public EncryptionResponseMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (EncryptionResponseMessage.Builder)super.clearOneof(var1);
      }

      public EncryptionResponseMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (EncryptionResponseMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public EncryptionResponseMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (EncryptionResponseMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public EncryptionResponseMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof EncryptionResponseMessage) {
            return this.mergeFrom((EncryptionResponseMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public EncryptionResponseMessage.Builder mergeFrom(EncryptionResponseMessage var1) {
         if (var1 == EncryptionResponseMessage.getDefaultInstance()) {
            return this;
         }

         if (var1.getSecretKey() != ByteString.EMPTY) {
            this.setSecretKey(var1.getSecretKey());
         }

         if (var1.getPublicKey() != ByteString.EMPTY) {
            this.setPublicKey(var1.getPublicKey());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public EncryptionResponseMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.secretKey_ = var1.readBytes();
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     this.publicKey_ = var1.readBytes();
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
      public ByteString getSecretKey() {
         return this.secretKey_;
      }

      public EncryptionResponseMessage.Builder setSecretKey(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.secretKey_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public EncryptionResponseMessage.Builder clearSecretKey() {
         this.bitField0_ &= -2;
         this.secretKey_ = EncryptionResponseMessage.getDefaultInstance().getSecretKey();
         this.onChanged();
         return this;
      }

      @Override
      public ByteString getPublicKey() {
         return this.publicKey_;
      }

      public EncryptionResponseMessage.Builder setPublicKey(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.publicKey_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public EncryptionResponseMessage.Builder clearPublicKey() {
         this.bitField0_ &= -3;
         this.publicKey_ = EncryptionResponseMessage.getDefaultInstance().getPublicKey();
         this.onChanged();
         return this;
      }

      public final EncryptionResponseMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (EncryptionResponseMessage.Builder)super.setUnknownFields(var1);
      }

      public final EncryptionResponseMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (EncryptionResponseMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
