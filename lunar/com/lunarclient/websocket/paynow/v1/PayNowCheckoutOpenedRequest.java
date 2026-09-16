package com.lunarclient.websocket.paynow.v1;

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
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class PayNowCheckoutOpenedRequest extends GeneratedMessageV3 implements PayNowCheckoutOpenedRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int CHECKOUT_TOKEN_FIELD_NUMBER = 1;
   private volatile Object checkoutToken_ = "";
   public static final int BACKEND_FIELD_NUMBER = 2;
   private int backend_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final PayNowCheckoutOpenedRequest DEFAULT_INSTANCE = new PayNowCheckoutOpenedRequest();
   private static final Parser<PayNowCheckoutOpenedRequest> PARSER = new AbstractParser<PayNowCheckoutOpenedRequest>() {
      public PayNowCheckoutOpenedRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         PayNowCheckoutOpenedRequest.Builder var3 = PayNowCheckoutOpenedRequest.newBuilder();

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

   private PayNowCheckoutOpenedRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private PayNowCheckoutOpenedRequest() {
      this.checkoutToken_ = "";
      this.backend_ = 0;
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new PayNowCheckoutOpenedRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_paynow_v1_PayNowCheckoutOpenedRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_paynow_v1_PayNowCheckoutOpenedRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(PayNowCheckoutOpenedRequest.class, PayNowCheckoutOpenedRequest.Builder.class);
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
   public int getBackendValue() {
      return this.backend_;
   }

   @Override
   public PayNowCheckoutOpenedRequest.Backend getBackend() {
      PayNowCheckoutOpenedRequest.Backend var1 = PayNowCheckoutOpenedRequest.Backend.forNumber(this.backend_);
      return var1 == null ? PayNowCheckoutOpenedRequest.Backend.UNRECOGNIZED : var1;
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

      if (this.backend_ != PayNowCheckoutOpenedRequest.Backend.BACKEND_UNSPECIFIED.getNumber()) {
         var1.writeEnum(2, this.backend_);
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

      if (this.backend_ != PayNowCheckoutOpenedRequest.Backend.BACKEND_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(2, this.backend_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof PayNowCheckoutOpenedRequest)) {
         return super.equals(var1);
      } else {
         PayNowCheckoutOpenedRequest var2 = (PayNowCheckoutOpenedRequest)var1;
         if (!this.getCheckoutToken().equals(var2.getCheckoutToken())) {
            return false;
         } else {
            return this.backend_ != var2.backend_ ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + this.getCheckoutToken().hashCode();
      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.backend_;
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static PayNowCheckoutOpenedRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static PayNowCheckoutOpenedRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static PayNowCheckoutOpenedRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static PayNowCheckoutOpenedRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static PayNowCheckoutOpenedRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static PayNowCheckoutOpenedRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static PayNowCheckoutOpenedRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PayNowCheckoutOpenedRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static PayNowCheckoutOpenedRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static PayNowCheckoutOpenedRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static PayNowCheckoutOpenedRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static PayNowCheckoutOpenedRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public PayNowCheckoutOpenedRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static PayNowCheckoutOpenedRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static PayNowCheckoutOpenedRequest.Builder newBuilder(PayNowCheckoutOpenedRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public PayNowCheckoutOpenedRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new PayNowCheckoutOpenedRequest.Builder() : new PayNowCheckoutOpenedRequest.Builder().mergeFrom(this);
   }

   protected PayNowCheckoutOpenedRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new PayNowCheckoutOpenedRequest.Builder(var1);
   }

   public static PayNowCheckoutOpenedRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<PayNowCheckoutOpenedRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<PayNowCheckoutOpenedRequest> getParserForType() {
      return PARSER;
   }

   public PayNowCheckoutOpenedRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public enum Backend implements ProtocolMessageEnum {
      BACKEND_UNSPECIFIED(0),
      BACKEND_OVERWOLF_OVERLAY(1),
      BACKEND_ELECTRON_WINDOW(2),
      UNRECOGNIZED(-1);

      public static final int BACKEND_UNSPECIFIED_VALUE = 0;
      public static final int BACKEND_OVERWOLF_OVERLAY_VALUE = 1;
      public static final int BACKEND_ELECTRON_WINDOW_VALUE = 2;
      private static final Internal.EnumLiteMap<PayNowCheckoutOpenedRequest.Backend> internalValueMap = new Internal.EnumLiteMap<PayNowCheckoutOpenedRequest.Backend>() {
         public PayNowCheckoutOpenedRequest.Backend findValueByNumber(int var1) {
            return PayNowCheckoutOpenedRequest.Backend.forNumber(var1);
         }
      };
      private static final PayNowCheckoutOpenedRequest.Backend[] VALUES = values();
      private final int value;

      @Override
      public final int getNumber() {
         if (this == UNRECOGNIZED) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
         } else {
            return this.value;
         }
      }

      @Deprecated
      public static PayNowCheckoutOpenedRequest.Backend valueOf(int var0) {
         return forNumber(var0);
      }

      public static PayNowCheckoutOpenedRequest.Backend forNumber(int var0) {
         switch (var0) {
            case 0:
               return BACKEND_UNSPECIFIED;
            case 1:
               return BACKEND_OVERWOLF_OVERLAY;
            case 2:
               return BACKEND_ELECTRON_WINDOW;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<PayNowCheckoutOpenedRequest.Backend> internalGetValueMap() {
         return internalValueMap;
      }

      @Override
      public final Descriptors.EnumValueDescriptor getValueDescriptor() {
         if (this == UNRECOGNIZED) {
            throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
         } else {
            return getDescriptor().getValues().get(this.ordinal());
         }
      }

      @Override
      public final Descriptors.EnumDescriptor getDescriptorForType() {
         return getDescriptor();
      }

      public static final Descriptors.EnumDescriptor getDescriptor() {
         return PayNowCheckoutOpenedRequest.getDescriptor().getEnumTypes().get(0);
      }

      public static PayNowCheckoutOpenedRequest.Backend valueOf(Descriptors.EnumValueDescriptor var0) {
         if (var0.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
         }
      }

      Backend(int var3) {
         this.value = var3;
      }
   }

   public static final class Builder extends GeneratedMessageV3.Builder<PayNowCheckoutOpenedRequest.Builder> implements PayNowCheckoutOpenedRequestOrBuilder {
      private int bitField0_;
      private Object checkoutToken_ = "";
      private int backend_ = 0;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_paynow_v1_PayNowCheckoutOpenedRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_paynow_v1_PayNowCheckoutOpenedRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(PayNowCheckoutOpenedRequest.class, PayNowCheckoutOpenedRequest.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public PayNowCheckoutOpenedRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.checkoutToken_ = "";
         this.backend_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_paynow_v1_PayNowCheckoutOpenedRequest_descriptor;
      }

      public PayNowCheckoutOpenedRequest getDefaultInstanceForType() {
         return PayNowCheckoutOpenedRequest.getDefaultInstance();
      }

      public PayNowCheckoutOpenedRequest build() {
         PayNowCheckoutOpenedRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public PayNowCheckoutOpenedRequest buildPartial() {
         PayNowCheckoutOpenedRequest var1 = new PayNowCheckoutOpenedRequest(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(PayNowCheckoutOpenedRequest var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.checkoutToken_ = this.checkoutToken_;
         }

         if ((var2 & 2) != 0) {
            var1.backend_ = this.backend_;
         }
      }

      public PayNowCheckoutOpenedRequest.Builder clone() {
         return (PayNowCheckoutOpenedRequest.Builder)super.clone();
      }

      public PayNowCheckoutOpenedRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (PayNowCheckoutOpenedRequest.Builder)super.setField(var1, var2);
      }

      public PayNowCheckoutOpenedRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (PayNowCheckoutOpenedRequest.Builder)super.clearField(var1);
      }

      public PayNowCheckoutOpenedRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (PayNowCheckoutOpenedRequest.Builder)super.clearOneof(var1);
      }

      public PayNowCheckoutOpenedRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (PayNowCheckoutOpenedRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public PayNowCheckoutOpenedRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (PayNowCheckoutOpenedRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public PayNowCheckoutOpenedRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof PayNowCheckoutOpenedRequest) {
            return this.mergeFrom((PayNowCheckoutOpenedRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public PayNowCheckoutOpenedRequest.Builder mergeFrom(PayNowCheckoutOpenedRequest var1) {
         if (var1 == PayNowCheckoutOpenedRequest.getDefaultInstance()) {
            return this;
         }

         if (!var1.getCheckoutToken().isEmpty()) {
            this.checkoutToken_ = var1.checkoutToken_;
            this.bitField0_ |= 1;
            this.onChanged();
         }

         if (var1.backend_ != 0) {
            this.setBackendValue(var1.getBackendValue());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public PayNowCheckoutOpenedRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                  case 16:
                     this.backend_ = var1.readEnum();
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

      public PayNowCheckoutOpenedRequest.Builder setCheckoutToken(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.checkoutToken_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public PayNowCheckoutOpenedRequest.Builder clearCheckoutToken() {
         this.checkoutToken_ = PayNowCheckoutOpenedRequest.getDefaultInstance().getCheckoutToken();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public PayNowCheckoutOpenedRequest.Builder setCheckoutTokenBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         PayNowCheckoutOpenedRequest.checkByteStringIsUtf8(var1);
         this.checkoutToken_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public int getBackendValue() {
         return this.backend_;
      }

      public PayNowCheckoutOpenedRequest.Builder setBackendValue(int var1) {
         this.backend_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      @Override
      public PayNowCheckoutOpenedRequest.Backend getBackend() {
         PayNowCheckoutOpenedRequest.Backend var1 = PayNowCheckoutOpenedRequest.Backend.forNumber(this.backend_);
         return var1 == null ? PayNowCheckoutOpenedRequest.Backend.UNRECOGNIZED : var1;
      }

      public PayNowCheckoutOpenedRequest.Builder setBackend(PayNowCheckoutOpenedRequest.Backend var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 2;
         this.backend_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public PayNowCheckoutOpenedRequest.Builder clearBackend() {
         this.bitField0_ &= -3;
         this.backend_ = 0;
         this.onChanged();
         return this;
      }

      public final PayNowCheckoutOpenedRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (PayNowCheckoutOpenedRequest.Builder)super.setUnknownFields(var1);
      }

      public final PayNowCheckoutOpenedRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (PayNowCheckoutOpenedRequest.Builder)super.mergeUnknownFields(var1);
      }
   }
}
