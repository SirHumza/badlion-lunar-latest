package com.lunarclient.gameipc.paynow.v1;

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

public final class OpenPayNowJsCheckoutRequest extends GeneratedMessageV3 implements OpenPayNowJsCheckoutRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int CHECKOUT_TOKEN_FIELD_NUMBER = 1;
   private volatile Object checkoutToken_ = "";
   private byte memoizedIsInitialized = -1;
   private static final OpenPayNowJsCheckoutRequest DEFAULT_INSTANCE = new OpenPayNowJsCheckoutRequest();
   private static final Parser<OpenPayNowJsCheckoutRequest> PARSER = new AbstractParser<OpenPayNowJsCheckoutRequest>() {
      public OpenPayNowJsCheckoutRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         OpenPayNowJsCheckoutRequest.Builder var3 = OpenPayNowJsCheckoutRequest.newBuilder();

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

   private OpenPayNowJsCheckoutRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private OpenPayNowJsCheckoutRequest() {
      this.checkoutToken_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new OpenPayNowJsCheckoutRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_gameipc_paynow_v1_OpenPayNowJsCheckoutRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_gameipc_paynow_v1_OpenPayNowJsCheckoutRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(OpenPayNowJsCheckoutRequest.class, OpenPayNowJsCheckoutRequest.Builder.class);
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

      if (!(var1 instanceof OpenPayNowJsCheckoutRequest)) {
         return super.equals(var1);
      }

      OpenPayNowJsCheckoutRequest var2 = (OpenPayNowJsCheckoutRequest)var1;
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

   public static OpenPayNowJsCheckoutRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static OpenPayNowJsCheckoutRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OpenPayNowJsCheckoutRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static OpenPayNowJsCheckoutRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OpenPayNowJsCheckoutRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static OpenPayNowJsCheckoutRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OpenPayNowJsCheckoutRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static OpenPayNowJsCheckoutRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static OpenPayNowJsCheckoutRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static OpenPayNowJsCheckoutRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static OpenPayNowJsCheckoutRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static OpenPayNowJsCheckoutRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public OpenPayNowJsCheckoutRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static OpenPayNowJsCheckoutRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static OpenPayNowJsCheckoutRequest.Builder newBuilder(OpenPayNowJsCheckoutRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public OpenPayNowJsCheckoutRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new OpenPayNowJsCheckoutRequest.Builder() : new OpenPayNowJsCheckoutRequest.Builder().mergeFrom(this);
   }

   protected OpenPayNowJsCheckoutRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new OpenPayNowJsCheckoutRequest.Builder(var1);
   }

   public static OpenPayNowJsCheckoutRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<OpenPayNowJsCheckoutRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<OpenPayNowJsCheckoutRequest> getParserForType() {
      return PARSER;
   }

   public OpenPayNowJsCheckoutRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<OpenPayNowJsCheckoutRequest.Builder> implements OpenPayNowJsCheckoutRequestOrBuilder {
      private int bitField0_;
      private Object checkoutToken_ = "";

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_gameipc_paynow_v1_OpenPayNowJsCheckoutRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_gameipc_paynow_v1_OpenPayNowJsCheckoutRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(OpenPayNowJsCheckoutRequest.class, OpenPayNowJsCheckoutRequest.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public OpenPayNowJsCheckoutRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.checkoutToken_ = "";
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_gameipc_paynow_v1_OpenPayNowJsCheckoutRequest_descriptor;
      }

      public OpenPayNowJsCheckoutRequest getDefaultInstanceForType() {
         return OpenPayNowJsCheckoutRequest.getDefaultInstance();
      }

      public OpenPayNowJsCheckoutRequest build() {
         OpenPayNowJsCheckoutRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public OpenPayNowJsCheckoutRequest buildPartial() {
         OpenPayNowJsCheckoutRequest var1 = new OpenPayNowJsCheckoutRequest(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(OpenPayNowJsCheckoutRequest var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.checkoutToken_ = this.checkoutToken_;
         }
      }

      public OpenPayNowJsCheckoutRequest.Builder clone() {
         return (OpenPayNowJsCheckoutRequest.Builder)super.clone();
      }

      public OpenPayNowJsCheckoutRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (OpenPayNowJsCheckoutRequest.Builder)super.setField(var1, var2);
      }

      public OpenPayNowJsCheckoutRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (OpenPayNowJsCheckoutRequest.Builder)super.clearField(var1);
      }

      public OpenPayNowJsCheckoutRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (OpenPayNowJsCheckoutRequest.Builder)super.clearOneof(var1);
      }

      public OpenPayNowJsCheckoutRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (OpenPayNowJsCheckoutRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public OpenPayNowJsCheckoutRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (OpenPayNowJsCheckoutRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public OpenPayNowJsCheckoutRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof OpenPayNowJsCheckoutRequest) {
            return this.mergeFrom((OpenPayNowJsCheckoutRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public OpenPayNowJsCheckoutRequest.Builder mergeFrom(OpenPayNowJsCheckoutRequest var1) {
         if (var1 == OpenPayNowJsCheckoutRequest.getDefaultInstance()) {
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

      public OpenPayNowJsCheckoutRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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

      public OpenPayNowJsCheckoutRequest.Builder setCheckoutToken(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.checkoutToken_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public OpenPayNowJsCheckoutRequest.Builder clearCheckoutToken() {
         this.checkoutToken_ = OpenPayNowJsCheckoutRequest.getDefaultInstance().getCheckoutToken();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public OpenPayNowJsCheckoutRequest.Builder setCheckoutTokenBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         OpenPayNowJsCheckoutRequest.checkByteStringIsUtf8(var1);
         this.checkoutToken_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public final OpenPayNowJsCheckoutRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (OpenPayNowJsCheckoutRequest.Builder)super.setUnknownFields(var1);
      }

      public final OpenPayNowJsCheckoutRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (OpenPayNowJsCheckoutRequest.Builder)super.mergeUnknownFields(var1);
      }
   }
}
