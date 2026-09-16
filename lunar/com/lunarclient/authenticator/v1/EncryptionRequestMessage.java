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

public final class EncryptionRequestMessage extends GeneratedMessageV3 implements EncryptionRequestMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int PUBLIC_KEY_FIELD_NUMBER = 1;
   private ByteString publicKey_ = ByteString.EMPTY;
   public static final int RANDOM_BYTES_FIELD_NUMBER = 2;
   private ByteString randomBytes_ = ByteString.EMPTY;
   private byte memoizedIsInitialized = -1;
   private static final EncryptionRequestMessage DEFAULT_INSTANCE = new EncryptionRequestMessage();
   private static final Parser<EncryptionRequestMessage> PARSER = new AbstractParser<EncryptionRequestMessage>() {
      public EncryptionRequestMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         EncryptionRequestMessage.Builder var3 = EncryptionRequestMessage.newBuilder();

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

   private EncryptionRequestMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private EncryptionRequestMessage() {
      this.publicKey_ = ByteString.EMPTY;
      this.randomBytes_ = ByteString.EMPTY;
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new EncryptionRequestMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return MessageProto.internal_static_lunarclient_authenticator_v1_EncryptionRequestMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return MessageProto.internal_static_lunarclient_authenticator_v1_EncryptionRequestMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(EncryptionRequestMessage.class, EncryptionRequestMessage.Builder.class);
   }

   @Override
   public ByteString getPublicKey() {
      return this.publicKey_;
   }

   @Override
   public ByteString getRandomBytes() {
      return this.randomBytes_;
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
      if (!this.publicKey_.isEmpty()) {
         var1.writeBytes(1, this.publicKey_);
      }

      if (!this.randomBytes_.isEmpty()) {
         var1.writeBytes(2, this.randomBytes_);
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
      if (!this.publicKey_.isEmpty()) {
         var1 += CodedOutputStream.computeBytesSize(1, this.publicKey_);
      }

      if (!this.randomBytes_.isEmpty()) {
         var1 += CodedOutputStream.computeBytesSize(2, this.randomBytes_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof EncryptionRequestMessage)) {
         return super.equals(var1);
      } else {
         EncryptionRequestMessage var2 = (EncryptionRequestMessage)var1;
         if (!this.getPublicKey().equals(var2.getPublicKey())) {
            return false;
         } else {
            return !this.getRandomBytes().equals(var2.getRandomBytes()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + this.getPublicKey().hashCode();
      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.getRandomBytes().hashCode();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static EncryptionRequestMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static EncryptionRequestMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static EncryptionRequestMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static EncryptionRequestMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static EncryptionRequestMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static EncryptionRequestMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static EncryptionRequestMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static EncryptionRequestMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static EncryptionRequestMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static EncryptionRequestMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static EncryptionRequestMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static EncryptionRequestMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public EncryptionRequestMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static EncryptionRequestMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static EncryptionRequestMessage.Builder newBuilder(EncryptionRequestMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public EncryptionRequestMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new EncryptionRequestMessage.Builder() : new EncryptionRequestMessage.Builder().mergeFrom(this);
   }

   protected EncryptionRequestMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new EncryptionRequestMessage.Builder(var1);
   }

   public static EncryptionRequestMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<EncryptionRequestMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<EncryptionRequestMessage> getParserForType() {
      return PARSER;
   }

   public EncryptionRequestMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<EncryptionRequestMessage.Builder> implements EncryptionRequestMessageOrBuilder {
      private int bitField0_;
      private ByteString publicKey_ = ByteString.EMPTY;
      private ByteString randomBytes_ = ByteString.EMPTY;

      public static final Descriptors.Descriptor getDescriptor() {
         return MessageProto.internal_static_lunarclient_authenticator_v1_EncryptionRequestMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MessageProto.internal_static_lunarclient_authenticator_v1_EncryptionRequestMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(EncryptionRequestMessage.class, EncryptionRequestMessage.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public EncryptionRequestMessage.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.publicKey_ = ByteString.EMPTY;
         this.randomBytes_ = ByteString.EMPTY;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return MessageProto.internal_static_lunarclient_authenticator_v1_EncryptionRequestMessage_descriptor;
      }

      public EncryptionRequestMessage getDefaultInstanceForType() {
         return EncryptionRequestMessage.getDefaultInstance();
      }

      public EncryptionRequestMessage build() {
         EncryptionRequestMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public EncryptionRequestMessage buildPartial() {
         EncryptionRequestMessage var1 = new EncryptionRequestMessage(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(EncryptionRequestMessage var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.publicKey_ = this.publicKey_;
         }

         if ((var2 & 2) != 0) {
            var1.randomBytes_ = this.randomBytes_;
         }
      }

      public EncryptionRequestMessage.Builder clone() {
         return (EncryptionRequestMessage.Builder)super.clone();
      }

      public EncryptionRequestMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (EncryptionRequestMessage.Builder)super.setField(var1, var2);
      }

      public EncryptionRequestMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (EncryptionRequestMessage.Builder)super.clearField(var1);
      }

      public EncryptionRequestMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (EncryptionRequestMessage.Builder)super.clearOneof(var1);
      }

      public EncryptionRequestMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (EncryptionRequestMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public EncryptionRequestMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (EncryptionRequestMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public EncryptionRequestMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof EncryptionRequestMessage) {
            return this.mergeFrom((EncryptionRequestMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public EncryptionRequestMessage.Builder mergeFrom(EncryptionRequestMessage var1) {
         if (var1 == EncryptionRequestMessage.getDefaultInstance()) {
            return this;
         }

         if (var1.getPublicKey() != ByteString.EMPTY) {
            this.setPublicKey(var1.getPublicKey());
         }

         if (var1.getRandomBytes() != ByteString.EMPTY) {
            this.setRandomBytes(var1.getRandomBytes());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public EncryptionRequestMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.publicKey_ = var1.readBytes();
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     this.randomBytes_ = var1.readBytes();
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
      public ByteString getPublicKey() {
         return this.publicKey_;
      }

      public EncryptionRequestMessage.Builder setPublicKey(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.publicKey_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public EncryptionRequestMessage.Builder clearPublicKey() {
         this.bitField0_ &= -2;
         this.publicKey_ = EncryptionRequestMessage.getDefaultInstance().getPublicKey();
         this.onChanged();
         return this;
      }

      @Override
      public ByteString getRandomBytes() {
         return this.randomBytes_;
      }

      public EncryptionRequestMessage.Builder setRandomBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.randomBytes_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public EncryptionRequestMessage.Builder clearRandomBytes() {
         this.bitField0_ &= -3;
         this.randomBytes_ = EncryptionRequestMessage.getDefaultInstance().getRandomBytes();
         this.onChanged();
         return this;
      }

      public final EncryptionRequestMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (EncryptionRequestMessage.Builder)super.setUnknownFields(var1);
      }

      public final EncryptionRequestMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (EncryptionRequestMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
