package com.lunarclient.apollo.paynow.v1;

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

public final class OpenPayNowEmbeddedCheckoutMessage extends GeneratedMessageV3 implements OpenPayNowEmbeddedCheckoutMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int CHECKOUT_TOKEN_FIELD_NUMBER = 1;
   private volatile Object checkoutToken_ = "";
   private byte memoizedIsInitialized = -1;
   private static final OpenPayNowEmbeddedCheckoutMessage DEFAULT_INSTANCE = new OpenPayNowEmbeddedCheckoutMessage();
   private static final Parser<OpenPayNowEmbeddedCheckoutMessage> PARSER = new AbstractParser<OpenPayNowEmbeddedCheckoutMessage>() {
      public OpenPayNowEmbeddedCheckoutMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         OpenPayNowEmbeddedCheckoutMessage.Builder var3 = OpenPayNowEmbeddedCheckoutMessage.newBuilder();

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

   private OpenPayNowEmbeddedCheckoutMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private OpenPayNowEmbeddedCheckoutMessage() {
      this.checkoutToken_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new OpenPayNowEmbeddedCheckoutMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return SchemaProto.internal_static_lunarclient_apollo_paynow_v1_OpenPayNowEmbeddedCheckoutMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return SchemaProto.internal_static_lunarclient_apollo_paynow_v1_OpenPayNowEmbeddedCheckoutMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(OpenPayNowEmbeddedCheckoutMessage.class, OpenPayNowEmbeddedCheckoutMessage.Builder.class);
   }

   @Override
   public String getCheckoutToken() {
      Object var1 = this.checkoutToken_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.checkoutToken_ = var3;
      return var3;
   }

   @Override
   public ByteString getCheckoutTokenBytes() {
      Object var1 = this.checkoutToken_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.checkoutToken_ = var2;
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
      if (!GeneratedMessageV3.isStringEmpty(this.checkoutToken_)) {
         GeneratedMessageV3.writeString(var1, 1, this.checkoutToken_);
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
      if (!GeneratedMessageV3.isStringEmpty(this.checkoutToken_)) {
         var1 += GeneratedMessageV3.computeStringSize(1, this.checkoutToken_);
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

      if (!(var1 instanceof OpenPayNowEmbeddedCheckoutMessage)) {
         return super.equals(var1);
      }

      OpenPayNowEmbeddedCheckoutMessage var2 = (OpenPayNowEmbeddedCheckoutMessage)var1;
      return !this.getCheckoutToken().equals(var2.getCheckoutToken()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      var1 = 37 * var1 + 1;
      var1 = 53 * var1 + this.getCheckoutToken().hashCode();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static OpenPayNowEmbeddedCheckoutMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static OpenPayNowEmbeddedCheckoutMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OpenPayNowEmbeddedCheckoutMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static OpenPayNowEmbeddedCheckoutMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OpenPayNowEmbeddedCheckoutMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static OpenPayNowEmbeddedCheckoutMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OpenPayNowEmbeddedCheckoutMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static OpenPayNowEmbeddedCheckoutMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static OpenPayNowEmbeddedCheckoutMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static OpenPayNowEmbeddedCheckoutMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static OpenPayNowEmbeddedCheckoutMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static OpenPayNowEmbeddedCheckoutMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public OpenPayNowEmbeddedCheckoutMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static OpenPayNowEmbeddedCheckoutMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static OpenPayNowEmbeddedCheckoutMessage.Builder newBuilder(OpenPayNowEmbeddedCheckoutMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public OpenPayNowEmbeddedCheckoutMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new OpenPayNowEmbeddedCheckoutMessage.Builder() : new OpenPayNowEmbeddedCheckoutMessage.Builder().mergeFrom(this);
   }

   protected OpenPayNowEmbeddedCheckoutMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new OpenPayNowEmbeddedCheckoutMessage.Builder(var1);
   }

   public static OpenPayNowEmbeddedCheckoutMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<OpenPayNowEmbeddedCheckoutMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<OpenPayNowEmbeddedCheckoutMessage> getParserForType() {
      return PARSER;
   }

   public OpenPayNowEmbeddedCheckoutMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder
      extends GeneratedMessageV3.Builder<OpenPayNowEmbeddedCheckoutMessage.Builder>
      implements OpenPayNowEmbeddedCheckoutMessageOrBuilder {
      private int bitField0_;
      private Object checkoutToken_ = "";

      public static final Descriptors.Descriptor getDescriptor() {
         return SchemaProto.internal_static_lunarclient_apollo_paynow_v1_OpenPayNowEmbeddedCheckoutMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return SchemaProto.internal_static_lunarclient_apollo_paynow_v1_OpenPayNowEmbeddedCheckoutMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(OpenPayNowEmbeddedCheckoutMessage.class, OpenPayNowEmbeddedCheckoutMessage.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public OpenPayNowEmbeddedCheckoutMessage.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.checkoutToken_ = "";
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return SchemaProto.internal_static_lunarclient_apollo_paynow_v1_OpenPayNowEmbeddedCheckoutMessage_descriptor;
      }

      public OpenPayNowEmbeddedCheckoutMessage getDefaultInstanceForType() {
         return OpenPayNowEmbeddedCheckoutMessage.getDefaultInstance();
      }

      public OpenPayNowEmbeddedCheckoutMessage build() {
         OpenPayNowEmbeddedCheckoutMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public OpenPayNowEmbeddedCheckoutMessage buildPartial() {
         OpenPayNowEmbeddedCheckoutMessage var1 = new OpenPayNowEmbeddedCheckoutMessage(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(OpenPayNowEmbeddedCheckoutMessage var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.checkoutToken_ = this.checkoutToken_;
         }
      }

      public OpenPayNowEmbeddedCheckoutMessage.Builder clone() {
         return (OpenPayNowEmbeddedCheckoutMessage.Builder)super.clone();
      }

      public OpenPayNowEmbeddedCheckoutMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (OpenPayNowEmbeddedCheckoutMessage.Builder)super.setField(var1, var2);
      }

      public OpenPayNowEmbeddedCheckoutMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (OpenPayNowEmbeddedCheckoutMessage.Builder)super.clearField(var1);
      }

      public OpenPayNowEmbeddedCheckoutMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (OpenPayNowEmbeddedCheckoutMessage.Builder)super.clearOneof(var1);
      }

      public OpenPayNowEmbeddedCheckoutMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (OpenPayNowEmbeddedCheckoutMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public OpenPayNowEmbeddedCheckoutMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (OpenPayNowEmbeddedCheckoutMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public OpenPayNowEmbeddedCheckoutMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof OpenPayNowEmbeddedCheckoutMessage) {
            return this.mergeFrom((OpenPayNowEmbeddedCheckoutMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public OpenPayNowEmbeddedCheckoutMessage.Builder mergeFrom(OpenPayNowEmbeddedCheckoutMessage var1) {
         if (var1 == OpenPayNowEmbeddedCheckoutMessage.getDefaultInstance()) {
            return this;
         }

         if (!var1.getCheckoutToken().isEmpty()) {
            this.checkoutToken_ = var1.checkoutToken_;
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

      public OpenPayNowEmbeddedCheckoutMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.checkoutToken_ = var1.readStringRequireUtf8();
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
      public String getCheckoutToken() {
         Object var1 = this.checkoutToken_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.checkoutToken_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getCheckoutTokenBytes() {
         Object var1 = this.checkoutToken_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.checkoutToken_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public OpenPayNowEmbeddedCheckoutMessage.Builder setCheckoutToken(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.checkoutToken_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public OpenPayNowEmbeddedCheckoutMessage.Builder clearCheckoutToken() {
         this.checkoutToken_ = OpenPayNowEmbeddedCheckoutMessage.getDefaultInstance().getCheckoutToken();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public OpenPayNowEmbeddedCheckoutMessage.Builder setCheckoutTokenBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         OpenPayNowEmbeddedCheckoutMessage.checkByteStringIsUtf8(var1);
         this.checkoutToken_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public final OpenPayNowEmbeddedCheckoutMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (OpenPayNowEmbeddedCheckoutMessage.Builder)super.setUnknownFields(var1);
      }

      public final OpenPayNowEmbeddedCheckoutMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (OpenPayNowEmbeddedCheckoutMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
