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

public final class EncryptionFailMessage extends GeneratedMessageV3 implements EncryptionFailMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int REASON_FIELD_NUMBER = 1;
   private volatile Object reason_ = "";
   private byte memoizedIsInitialized = -1;
   private static final EncryptionFailMessage DEFAULT_INSTANCE = new EncryptionFailMessage();
   private static final Parser<EncryptionFailMessage> PARSER = new AbstractParser<EncryptionFailMessage>() {
      public EncryptionFailMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         EncryptionFailMessage.Builder var3 = EncryptionFailMessage.newBuilder();

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

   private EncryptionFailMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private EncryptionFailMessage() {
      this.reason_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new EncryptionFailMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return MessageProto.internal_static_lunarclient_authenticator_v1_EncryptionFailMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return MessageProto.internal_static_lunarclient_authenticator_v1_EncryptionFailMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(EncryptionFailMessage.class, EncryptionFailMessage.Builder.class);
   }

   @Override
   public String getReason() {
      Object var1 = this.reason_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.reason_ = var3;
      return var3;
   }

   @Override
   public ByteString getReasonBytes() {
      Object var1 = this.reason_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.reason_ = var2;
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
      if (!GeneratedMessageV3.isStringEmpty(this.reason_)) {
         GeneratedMessageV3.writeString(var1, 1, this.reason_);
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
      if (!GeneratedMessageV3.isStringEmpty(this.reason_)) {
         var1 += GeneratedMessageV3.computeStringSize(1, this.reason_);
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

      if (!(var1 instanceof EncryptionFailMessage)) {
         return super.equals(var1);
      }

      EncryptionFailMessage var2 = (EncryptionFailMessage)var1;
      return !this.getReason().equals(var2.getReason()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      var1 = 37 * var1 + 1;
      var1 = 53 * var1 + this.getReason().hashCode();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static EncryptionFailMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static EncryptionFailMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static EncryptionFailMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static EncryptionFailMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static EncryptionFailMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static EncryptionFailMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static EncryptionFailMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static EncryptionFailMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static EncryptionFailMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static EncryptionFailMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static EncryptionFailMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static EncryptionFailMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public EncryptionFailMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static EncryptionFailMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static EncryptionFailMessage.Builder newBuilder(EncryptionFailMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public EncryptionFailMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new EncryptionFailMessage.Builder() : new EncryptionFailMessage.Builder().mergeFrom(this);
   }

   protected EncryptionFailMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new EncryptionFailMessage.Builder(var1);
   }

   public static EncryptionFailMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<EncryptionFailMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<EncryptionFailMessage> getParserForType() {
      return PARSER;
   }

   public EncryptionFailMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<EncryptionFailMessage.Builder> implements EncryptionFailMessageOrBuilder {
      private int bitField0_;
      private Object reason_ = "";

      public static final Descriptors.Descriptor getDescriptor() {
         return MessageProto.internal_static_lunarclient_authenticator_v1_EncryptionFailMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MessageProto.internal_static_lunarclient_authenticator_v1_EncryptionFailMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(EncryptionFailMessage.class, EncryptionFailMessage.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public EncryptionFailMessage.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.reason_ = "";
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return MessageProto.internal_static_lunarclient_authenticator_v1_EncryptionFailMessage_descriptor;
      }

      public EncryptionFailMessage getDefaultInstanceForType() {
         return EncryptionFailMessage.getDefaultInstance();
      }

      public EncryptionFailMessage build() {
         EncryptionFailMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public EncryptionFailMessage buildPartial() {
         EncryptionFailMessage var1 = new EncryptionFailMessage(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(EncryptionFailMessage var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.reason_ = this.reason_;
         }
      }

      public EncryptionFailMessage.Builder clone() {
         return (EncryptionFailMessage.Builder)super.clone();
      }

      public EncryptionFailMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (EncryptionFailMessage.Builder)super.setField(var1, var2);
      }

      public EncryptionFailMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (EncryptionFailMessage.Builder)super.clearField(var1);
      }

      public EncryptionFailMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (EncryptionFailMessage.Builder)super.clearOneof(var1);
      }

      public EncryptionFailMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (EncryptionFailMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public EncryptionFailMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (EncryptionFailMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public EncryptionFailMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof EncryptionFailMessage) {
            return this.mergeFrom((EncryptionFailMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public EncryptionFailMessage.Builder mergeFrom(EncryptionFailMessage var1) {
         if (var1 == EncryptionFailMessage.getDefaultInstance()) {
            return this;
         }

         if (!var1.getReason().isEmpty()) {
            this.reason_ = var1.reason_;
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

      public EncryptionFailMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.reason_ = var1.readStringRequireUtf8();
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
      public String getReason() {
         Object var1 = this.reason_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.reason_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getReasonBytes() {
         Object var1 = this.reason_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.reason_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public EncryptionFailMessage.Builder setReason(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.reason_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public EncryptionFailMessage.Builder clearReason() {
         this.reason_ = EncryptionFailMessage.getDefaultInstance().getReason();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public EncryptionFailMessage.Builder setReasonBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         EncryptionFailMessage.checkByteStringIsUtf8(var1);
         this.reason_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public final EncryptionFailMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (EncryptionFailMessage.Builder)super.setUnknownFields(var1);
      }

      public final EncryptionFailMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (EncryptionFailMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
