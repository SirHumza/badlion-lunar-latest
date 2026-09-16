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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import com.lunarclient.common.v1.UuidAndUsername;
import com.lunarclient.common.v1.UuidAndUsernameOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class HelloMessage extends GeneratedMessageV3 implements HelloMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int IDENTITY_FIELD_NUMBER = 1;
   private UuidAndUsername identity_;
   public static final int INITIATOR_FIELD_NUMBER = 2;
   private volatile Object initiator_ = "";
   private byte memoizedIsInitialized = -1;
   private static final HelloMessage DEFAULT_INSTANCE = new HelloMessage();
   private static final Parser<HelloMessage> PARSER = new AbstractParser<HelloMessage>() {
      public HelloMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         HelloMessage.Builder var3 = HelloMessage.newBuilder();

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

   private HelloMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private HelloMessage() {
      this.initiator_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new HelloMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return MessageProto.internal_static_lunarclient_authenticator_v1_HelloMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return MessageProto.internal_static_lunarclient_authenticator_v1_HelloMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(HelloMessage.class, HelloMessage.Builder.class);
   }

   @Override
   public boolean hasIdentity() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public UuidAndUsername getIdentity() {
      return this.identity_ == null ? UuidAndUsername.getDefaultInstance() : this.identity_;
   }

   @Override
   public UuidAndUsernameOrBuilder getIdentityOrBuilder() {
      return this.identity_ == null ? UuidAndUsername.getDefaultInstance() : this.identity_;
   }

   @Override
   public String getInitiator() {
      Object var1 = this.initiator_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.initiator_ = var3;
      return var3;
   }

   @Override
   public ByteString getInitiatorBytes() {
      Object var1 = this.initiator_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.initiator_ = var2;
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
      if ((this.bitField0_ & 1) != 0) {
         var1.writeMessage(1, this.getIdentity());
      }

      if (!GeneratedMessageV3.isStringEmpty(this.initiator_)) {
         GeneratedMessageV3.writeString(var1, 2, this.initiator_);
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
      if ((this.bitField0_ & 1) != 0) {
         var1 += CodedOutputStream.computeMessageSize(1, this.getIdentity());
      }

      if (!GeneratedMessageV3.isStringEmpty(this.initiator_)) {
         var1 += GeneratedMessageV3.computeStringSize(2, this.initiator_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof HelloMessage)) {
         return super.equals(var1);
      } else {
         HelloMessage var2 = (HelloMessage)var1;
         if (this.hasIdentity() != var2.hasIdentity()) {
            return false;
         } else if (this.hasIdentity() && !this.getIdentity().equals(var2.getIdentity())) {
            return false;
         } else {
            return !this.getInitiator().equals(var2.getInitiator()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.hasIdentity()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getIdentity().hashCode();
      }

      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.getInitiator().hashCode();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static HelloMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static HelloMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static HelloMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static HelloMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static HelloMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static HelloMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static HelloMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static HelloMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static HelloMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static HelloMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static HelloMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static HelloMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public HelloMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static HelloMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static HelloMessage.Builder newBuilder(HelloMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public HelloMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new HelloMessage.Builder() : new HelloMessage.Builder().mergeFrom(this);
   }

   protected HelloMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new HelloMessage.Builder(var1);
   }

   public static HelloMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<HelloMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<HelloMessage> getParserForType() {
      return PARSER;
   }

   public HelloMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<HelloMessage.Builder> implements HelloMessageOrBuilder {
      private int bitField0_;
      private UuidAndUsername identity_;
      private SingleFieldBuilderV3<UuidAndUsername, UuidAndUsername.Builder, UuidAndUsernameOrBuilder> identityBuilder_;
      private Object initiator_ = "";

      public static final Descriptors.Descriptor getDescriptor() {
         return MessageProto.internal_static_lunarclient_authenticator_v1_HelloMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return MessageProto.internal_static_lunarclient_authenticator_v1_HelloMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(HelloMessage.class, HelloMessage.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (HelloMessage.alwaysUseFieldBuilders) {
            this.getIdentityFieldBuilder();
         }
      }

      public HelloMessage.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.identity_ = null;
         if (this.identityBuilder_ != null) {
            this.identityBuilder_.dispose();
            this.identityBuilder_ = null;
         }

         this.initiator_ = "";
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return MessageProto.internal_static_lunarclient_authenticator_v1_HelloMessage_descriptor;
      }

      public HelloMessage getDefaultInstanceForType() {
         return HelloMessage.getDefaultInstance();
      }

      public HelloMessage build() {
         HelloMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public HelloMessage buildPartial() {
         HelloMessage var1 = new HelloMessage(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(HelloMessage var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.identity_ = this.identityBuilder_ == null ? this.identity_ : this.identityBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.initiator_ = this.initiator_;
         }

         HelloMessage var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public HelloMessage.Builder clone() {
         return (HelloMessage.Builder)super.clone();
      }

      public HelloMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (HelloMessage.Builder)super.setField(var1, var2);
      }

      public HelloMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (HelloMessage.Builder)super.clearField(var1);
      }

      public HelloMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (HelloMessage.Builder)super.clearOneof(var1);
      }

      public HelloMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (HelloMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public HelloMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (HelloMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public HelloMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof HelloMessage) {
            return this.mergeFrom((HelloMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public HelloMessage.Builder mergeFrom(HelloMessage var1) {
         if (var1 == HelloMessage.getDefaultInstance()) {
            return this;
         }

         if (var1.hasIdentity()) {
            this.mergeIdentity(var1.getIdentity());
         }

         if (!var1.getInitiator().isEmpty()) {
            this.initiator_ = var1.initiator_;
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

      public HelloMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getIdentityFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     this.initiator_ = var1.readStringRequireUtf8();
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
      public boolean hasIdentity() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public UuidAndUsername getIdentity() {
         if (this.identityBuilder_ == null) {
            return this.identity_ == null ? UuidAndUsername.getDefaultInstance() : this.identity_;
         } else {
            return this.identityBuilder_.getMessage();
         }
      }

      public HelloMessage.Builder setIdentity(UuidAndUsername var1) {
         if (this.identityBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.identity_ = var1;
         } else {
            this.identityBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public HelloMessage.Builder setIdentity(UuidAndUsername.Builder var1) {
         if (this.identityBuilder_ == null) {
            this.identity_ = var1.build();
         } else {
            this.identityBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public HelloMessage.Builder mergeIdentity(UuidAndUsername var1) {
         if (this.identityBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.identity_ != null && this.identity_ != UuidAndUsername.getDefaultInstance()) {
               this.getIdentityBuilder().mergeFrom(var1);
            } else {
               this.identity_ = var1;
            }
         } else {
            this.identityBuilder_.mergeFrom(var1);
         }

         if (this.identity_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public HelloMessage.Builder clearIdentity() {
         this.bitField0_ &= -2;
         this.identity_ = null;
         if (this.identityBuilder_ != null) {
            this.identityBuilder_.dispose();
            this.identityBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public UuidAndUsername.Builder getIdentityBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getIdentityFieldBuilder().getBuilder();
      }

      @Override
      public UuidAndUsernameOrBuilder getIdentityOrBuilder() {
         if (this.identityBuilder_ != null) {
            return this.identityBuilder_.getMessageOrBuilder();
         } else {
            return this.identity_ == null ? UuidAndUsername.getDefaultInstance() : this.identity_;
         }
      }

      private SingleFieldBuilderV3<UuidAndUsername, UuidAndUsername.Builder, UuidAndUsernameOrBuilder> getIdentityFieldBuilder() {
         if (this.identityBuilder_ == null) {
            this.identityBuilder_ = new SingleFieldBuilderV3<>(this.getIdentity(), this.getParentForChildren(), this.isClean());
            this.identity_ = null;
         }

         return this.identityBuilder_;
      }

      @Override
      public String getInitiator() {
         Object var1 = this.initiator_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.initiator_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getInitiatorBytes() {
         Object var1 = this.initiator_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.initiator_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public HelloMessage.Builder setInitiator(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.initiator_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public HelloMessage.Builder clearInitiator() {
         this.initiator_ = HelloMessage.getDefaultInstance().getInitiator();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      public HelloMessage.Builder setInitiatorBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         HelloMessage.checkByteStringIsUtf8(var1);
         this.initiator_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public final HelloMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (HelloMessage.Builder)super.setUnknownFields(var1);
      }

      public final HelloMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (HelloMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
