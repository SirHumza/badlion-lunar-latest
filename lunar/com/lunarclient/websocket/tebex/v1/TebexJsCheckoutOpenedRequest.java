package com.lunarclient.websocket.tebex.v1;

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

public final class TebexJsCheckoutOpenedRequest extends GeneratedMessageV3 implements TebexJsCheckoutOpenedRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int BASKET_IDENT_FIELD_NUMBER = 1;
   private volatile Object basketIdent_ = "";
   public static final int BACKEND_FIELD_NUMBER = 2;
   private int backend_ = 0;
   public static final int LOCALE_FIELD_NUMBER = 3;
   private volatile Object locale_ = "";
   private byte memoizedIsInitialized = -1;
   private static final TebexJsCheckoutOpenedRequest DEFAULT_INSTANCE = new TebexJsCheckoutOpenedRequest();
   private static final Parser<TebexJsCheckoutOpenedRequest> PARSER = new AbstractParser<TebexJsCheckoutOpenedRequest>() {
      public TebexJsCheckoutOpenedRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         TebexJsCheckoutOpenedRequest.Builder var3 = TebexJsCheckoutOpenedRequest.newBuilder();

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

   private TebexJsCheckoutOpenedRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private TebexJsCheckoutOpenedRequest() {
      this.basketIdent_ = "";
      this.backend_ = 0;
      this.locale_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new TebexJsCheckoutOpenedRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_tebex_v1_TebexJsCheckoutOpenedRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_tebex_v1_TebexJsCheckoutOpenedRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(TebexJsCheckoutOpenedRequest.class, TebexJsCheckoutOpenedRequest.Builder.class);
   }

   @Override
   public String getBasketIdent() {
      Object var1 = this.basketIdent_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.basketIdent_ = var3;
      return var3;
   }

   @Override
   public ByteString getBasketIdentBytes() {
      Object var1 = this.basketIdent_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.basketIdent_ = var2;
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
   public TebexJsCheckoutOpenedRequest.Backend getBackend() {
      TebexJsCheckoutOpenedRequest.Backend var1 = TebexJsCheckoutOpenedRequest.Backend.forNumber(this.backend_);
      return var1 == null ? TebexJsCheckoutOpenedRequest.Backend.UNRECOGNIZED : var1;
   }

   @Override
   public String getLocale() {
      Object var1 = this.locale_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.locale_ = var3;
      return var3;
   }

   @Override
   public ByteString getLocaleBytes() {
      Object var1 = this.locale_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.locale_ = var2;
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
      if (!GeneratedMessageV3.isStringEmpty(this.basketIdent_)) {
         GeneratedMessageV3.writeString(var1, 1, this.basketIdent_);
      }

      if (this.backend_ != TebexJsCheckoutOpenedRequest.Backend.BACKEND_UNSPECIFIED.getNumber()) {
         var1.writeEnum(2, this.backend_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.locale_)) {
         GeneratedMessageV3.writeString(var1, 3, this.locale_);
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
      if (!GeneratedMessageV3.isStringEmpty(this.basketIdent_)) {
         var1 += GeneratedMessageV3.computeStringSize(1, this.basketIdent_);
      }

      if (this.backend_ != TebexJsCheckoutOpenedRequest.Backend.BACKEND_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(2, this.backend_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.locale_)) {
         var1 += GeneratedMessageV3.computeStringSize(3, this.locale_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof TebexJsCheckoutOpenedRequest)) {
         return super.equals(var1);
      } else {
         TebexJsCheckoutOpenedRequest var2 = (TebexJsCheckoutOpenedRequest)var1;
         if (!this.getBasketIdent().equals(var2.getBasketIdent())) {
            return false;
         } else if (this.backend_ != var2.backend_) {
            return false;
         } else {
            return !this.getLocale().equals(var2.getLocale()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + this.getBasketIdent().hashCode();
      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.backend_;
      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + this.getLocale().hashCode();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static TebexJsCheckoutOpenedRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static TebexJsCheckoutOpenedRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static TebexJsCheckoutOpenedRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static TebexJsCheckoutOpenedRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static TebexJsCheckoutOpenedRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static TebexJsCheckoutOpenedRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static TebexJsCheckoutOpenedRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static TebexJsCheckoutOpenedRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static TebexJsCheckoutOpenedRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static TebexJsCheckoutOpenedRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static TebexJsCheckoutOpenedRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static TebexJsCheckoutOpenedRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public TebexJsCheckoutOpenedRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static TebexJsCheckoutOpenedRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static TebexJsCheckoutOpenedRequest.Builder newBuilder(TebexJsCheckoutOpenedRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public TebexJsCheckoutOpenedRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new TebexJsCheckoutOpenedRequest.Builder() : new TebexJsCheckoutOpenedRequest.Builder().mergeFrom(this);
   }

   protected TebexJsCheckoutOpenedRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new TebexJsCheckoutOpenedRequest.Builder(var1);
   }

   public static TebexJsCheckoutOpenedRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<TebexJsCheckoutOpenedRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<TebexJsCheckoutOpenedRequest> getParserForType() {
      return PARSER;
   }

   public TebexJsCheckoutOpenedRequest getDefaultInstanceForType() {
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
      private static final Internal.EnumLiteMap<TebexJsCheckoutOpenedRequest.Backend> internalValueMap = new Internal.EnumLiteMap<TebexJsCheckoutOpenedRequest.Backend>() {
         public TebexJsCheckoutOpenedRequest.Backend findValueByNumber(int var1) {
            return TebexJsCheckoutOpenedRequest.Backend.forNumber(var1);
         }
      };
      private static final TebexJsCheckoutOpenedRequest.Backend[] VALUES = values();
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
      public static TebexJsCheckoutOpenedRequest.Backend valueOf(int var0) {
         return forNumber(var0);
      }

      public static TebexJsCheckoutOpenedRequest.Backend forNumber(int var0) {
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

      public static Internal.EnumLiteMap<TebexJsCheckoutOpenedRequest.Backend> internalGetValueMap() {
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
         return TebexJsCheckoutOpenedRequest.getDescriptor().getEnumTypes().get(0);
      }

      public static TebexJsCheckoutOpenedRequest.Backend valueOf(Descriptors.EnumValueDescriptor var0) {
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

   public static final class Builder extends GeneratedMessageV3.Builder<TebexJsCheckoutOpenedRequest.Builder> implements TebexJsCheckoutOpenedRequestOrBuilder {
      private int bitField0_;
      private Object basketIdent_ = "";
      private int backend_ = 0;
      private Object locale_ = "";

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_tebex_v1_TebexJsCheckoutOpenedRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_tebex_v1_TebexJsCheckoutOpenedRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(TebexJsCheckoutOpenedRequest.class, TebexJsCheckoutOpenedRequest.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public TebexJsCheckoutOpenedRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.basketIdent_ = "";
         this.backend_ = 0;
         this.locale_ = "";
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_tebex_v1_TebexJsCheckoutOpenedRequest_descriptor;
      }

      public TebexJsCheckoutOpenedRequest getDefaultInstanceForType() {
         return TebexJsCheckoutOpenedRequest.getDefaultInstance();
      }

      public TebexJsCheckoutOpenedRequest build() {
         TebexJsCheckoutOpenedRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public TebexJsCheckoutOpenedRequest buildPartial() {
         TebexJsCheckoutOpenedRequest var1 = new TebexJsCheckoutOpenedRequest(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(TebexJsCheckoutOpenedRequest var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.basketIdent_ = this.basketIdent_;
         }

         if ((var2 & 2) != 0) {
            var1.backend_ = this.backend_;
         }

         if ((var2 & 4) != 0) {
            var1.locale_ = this.locale_;
         }
      }

      public TebexJsCheckoutOpenedRequest.Builder clone() {
         return (TebexJsCheckoutOpenedRequest.Builder)super.clone();
      }

      public TebexJsCheckoutOpenedRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (TebexJsCheckoutOpenedRequest.Builder)super.setField(var1, var2);
      }

      public TebexJsCheckoutOpenedRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (TebexJsCheckoutOpenedRequest.Builder)super.clearField(var1);
      }

      public TebexJsCheckoutOpenedRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (TebexJsCheckoutOpenedRequest.Builder)super.clearOneof(var1);
      }

      public TebexJsCheckoutOpenedRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (TebexJsCheckoutOpenedRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public TebexJsCheckoutOpenedRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (TebexJsCheckoutOpenedRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public TebexJsCheckoutOpenedRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof TebexJsCheckoutOpenedRequest) {
            return this.mergeFrom((TebexJsCheckoutOpenedRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public TebexJsCheckoutOpenedRequest.Builder mergeFrom(TebexJsCheckoutOpenedRequest var1) {
         if (var1 == TebexJsCheckoutOpenedRequest.getDefaultInstance()) {
            return this;
         }

         if (!var1.getBasketIdent().isEmpty()) {
            this.basketIdent_ = var1.basketIdent_;
            this.bitField0_ |= 1;
            this.onChanged();
         }

         if (var1.backend_ != 0) {
            this.setBackendValue(var1.getBackendValue());
         }

         if (!var1.getLocale().isEmpty()) {
            this.locale_ = var1.locale_;
            this.bitField0_ |= 4;
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

      public TebexJsCheckoutOpenedRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.basketIdent_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 1;
                     break;
                  case 16:
                     this.backend_ = var1.readEnum();
                     this.bitField0_ |= 2;
                     break;
                  case 26:
                     this.locale_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 4;
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
      public String getBasketIdent() {
         Object var1 = this.basketIdent_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.basketIdent_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getBasketIdentBytes() {
         Object var1 = this.basketIdent_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.basketIdent_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public TebexJsCheckoutOpenedRequest.Builder setBasketIdent(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.basketIdent_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public TebexJsCheckoutOpenedRequest.Builder clearBasketIdent() {
         this.basketIdent_ = TebexJsCheckoutOpenedRequest.getDefaultInstance().getBasketIdent();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public TebexJsCheckoutOpenedRequest.Builder setBasketIdentBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         TebexJsCheckoutOpenedRequest.checkByteStringIsUtf8(var1);
         this.basketIdent_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public int getBackendValue() {
         return this.backend_;
      }

      public TebexJsCheckoutOpenedRequest.Builder setBackendValue(int var1) {
         this.backend_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      @Override
      public TebexJsCheckoutOpenedRequest.Backend getBackend() {
         TebexJsCheckoutOpenedRequest.Backend var1 = TebexJsCheckoutOpenedRequest.Backend.forNumber(this.backend_);
         return var1 == null ? TebexJsCheckoutOpenedRequest.Backend.UNRECOGNIZED : var1;
      }

      public TebexJsCheckoutOpenedRequest.Builder setBackend(TebexJsCheckoutOpenedRequest.Backend var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 2;
         this.backend_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public TebexJsCheckoutOpenedRequest.Builder clearBackend() {
         this.bitField0_ &= -3;
         this.backend_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public String getLocale() {
         Object var1 = this.locale_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.locale_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getLocaleBytes() {
         Object var1 = this.locale_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.locale_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public TebexJsCheckoutOpenedRequest.Builder setLocale(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.locale_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public TebexJsCheckoutOpenedRequest.Builder clearLocale() {
         this.locale_ = TebexJsCheckoutOpenedRequest.getDefaultInstance().getLocale();
         this.bitField0_ &= -5;
         this.onChanged();
         return this;
      }

      public TebexJsCheckoutOpenedRequest.Builder setLocaleBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         TebexJsCheckoutOpenedRequest.checkByteStringIsUtf8(var1);
         this.locale_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public final TebexJsCheckoutOpenedRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (TebexJsCheckoutOpenedRequest.Builder)super.setUnknownFields(var1);
      }

      public final TebexJsCheckoutOpenedRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (TebexJsCheckoutOpenedRequest.Builder)super.mergeUnknownFields(var1);
      }
   }
}
