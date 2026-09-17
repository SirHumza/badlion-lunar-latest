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

public final class AuthSuccessMessage extends GeneratedMessageV3 implements AuthSuccessMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int JWT_FIELD_NUMBER = 1;
   private volatile Object jwt_ = "";
   private byte memoizedIsInitialized = -1;
   private static final AuthSuccessMessage DEFAULT_INSTANCE = new AuthSuccessMessage();
   private static final Parser<AuthSuccessMessage> PARSER = new AbstractParser<AuthSuccessMessage>() {
      public AuthSuccessMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         AuthSuccessMessage.Builder var3 = AuthSuccessMessage.newBuilder();

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

   private AuthSuccessMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private AuthSuccessMessage() {
      this.jwt_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new AuthSuccessMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return MessageProto.internal_static_lunarclient_authenticator_v1_AuthSuccessMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return MessageProto.internal_static_lunarclient_authenticator_v1_AuthSuccessMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(AuthSuccessMessage.class, AuthSuccessMessage.Builder.class);
   }

   @Override
   public String getJwt() {
      Object var1 = this.jwt_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.jwt_ = var3;
      return var3;
   }

   @Override
   public ByteString getJwtBytes() {
      Object var1 = this.jwt_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.jwt_ = var2;
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
      if (!GeneratedMessageV3.isStringEmpty(this.jwt_)) {
         GeneratedMessageV3.writeString(var1, 1, this.jwt_);
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
      if (!GeneratedMessageV3.isStringEmpty(this.jwt_)) {
         var1 += GeneratedMessageV3.computeStringSize(1, this.jwt_);
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

      if (!(var1 instanceof AuthSuccessMessage)) {
         return super.equals(var1);
      }

      AuthSuccessMessage var2 = (AuthSuccessMessage)var1;
      return !this.getJwt().equals(var2.getJwt()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      var1 = 37 * var1 + 1;
      var1 = 53 * var1 + this.getJwt().hashCode();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static AuthSuccessMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static AuthSuccessMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static AuthSuccessMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static AuthSuccessMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static AuthSuccessMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static AuthSuccessMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static AuthSuccessMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static AuthSuccessMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static AuthSuccessMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static AuthSuccessMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static AuthSuccessMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static AuthSuccessMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public AuthSuccessMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static AuthSuccessMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static AuthSuccessMessage.Builder newBuilder(AuthSuccessMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public AuthSuccessMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new AuthSuccessMessage.Builder() : new AuthSuccessMessage.Builder().mergeFrom(this);
   }

   protected AuthSuccessMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new AuthSuccessMessage.Builder(var1);
   }

   public static AuthSuccessMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<AuthSuccessMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<AuthSuccessMessage> getParserForType() {
      return PARSER;
   }

   public AuthSuccessMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<AuthSuccessMessage.Builder> implements AuthSuccessMessageOrBuilder {
      private int bitField0_;
      private Object jwt_ = "";

      public static final Descriptors.Descriptor getDescriptor() {
         return MessageProto.internal_static_lunarclient_authenticator_v1_AuthSuccessMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MessageProto.internal_static_lunarclient_authenticator_v1_AuthSuccessMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(AuthSuccessMessage.class, AuthSuccessMessage.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public AuthSuccessMessage.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.jwt_ = "";
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return MessageProto.internal_static_lunarclient_authenticator_v1_AuthSuccessMessage_descriptor;
      }

      public AuthSuccessMessage getDefaultInstanceForType() {
         return AuthSuccessMessage.getDefaultInstance();
      }

      public AuthSuccessMessage build() {
         AuthSuccessMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public AuthSuccessMessage buildPartial() {
         AuthSuccessMessage var1 = new AuthSuccessMessage(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(AuthSuccessMessage var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.jwt_ = this.jwt_;
         }
      }

      public AuthSuccessMessage.Builder clone() {
         return (AuthSuccessMessage.Builder)super.clone();
      }

      public AuthSuccessMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (AuthSuccessMessage.Builder)super.setField(var1, var2);
      }

      public AuthSuccessMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (AuthSuccessMessage.Builder)super.clearField(var1);
      }

      public AuthSuccessMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (AuthSuccessMessage.Builder)super.clearOneof(var1);
      }

      public AuthSuccessMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (AuthSuccessMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public AuthSuccessMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (AuthSuccessMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public AuthSuccessMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof AuthSuccessMessage) {
            return this.mergeFrom((AuthSuccessMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public AuthSuccessMessage.Builder mergeFrom(AuthSuccessMessage var1) {
         if (var1 == AuthSuccessMessage.getDefaultInstance()) {
            return this;
         }

         if (!var1.getJwt().isEmpty()) {
            this.jwt_ = var1.jwt_;
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

      public AuthSuccessMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.jwt_ = var1.readStringRequireUtf8();
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
      public String getJwt() {
         Object var1 = this.jwt_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.jwt_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getJwtBytes() {
         Object var1 = this.jwt_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.jwt_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public AuthSuccessMessage.Builder setJwt(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.jwt_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public AuthSuccessMessage.Builder clearJwt() {
         this.jwt_ = AuthSuccessMessage.getDefaultInstance().getJwt();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public AuthSuccessMessage.Builder setJwtBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         AuthSuccessMessage.checkByteStringIsUtf8(var1);
         this.jwt_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public final AuthSuccessMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (AuthSuccessMessage.Builder)super.setUnknownFields(var1);
      }

      public final AuthSuccessMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (AuthSuccessMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
