package com.lunarclient.websocket.tebex.v1;

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

public final class OpenTebexJsCheckoutPush extends GeneratedMessageV3 implements OpenTebexJsCheckoutPushOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int BASKET_IDENT_FIELD_NUMBER = 1;
   private volatile Object basketIdent_ = "";
   public static final int LOCALE_FIELD_NUMBER = 2;
   private volatile Object locale_ = "";
   private byte memoizedIsInitialized = -1;
   private static final OpenTebexJsCheckoutPush DEFAULT_INSTANCE = new OpenTebexJsCheckoutPush();
   private static final Parser<OpenTebexJsCheckoutPush> PARSER = new AbstractParser<OpenTebexJsCheckoutPush>() {
      public OpenTebexJsCheckoutPush parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         OpenTebexJsCheckoutPush.Builder var3 = OpenTebexJsCheckoutPush.newBuilder();

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

   private OpenTebexJsCheckoutPush(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private OpenTebexJsCheckoutPush() {
      this.basketIdent_ = "";
      this.locale_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new OpenTebexJsCheckoutPush();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return PushProto.internal_static_lunarclient_websocket_tebex_v1_OpenTebexJsCheckoutPush_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return PushProto.internal_static_lunarclient_websocket_tebex_v1_OpenTebexJsCheckoutPush_fieldAccessorTable
         .ensureFieldAccessorsInitialized(OpenTebexJsCheckoutPush.class, OpenTebexJsCheckoutPush.Builder.class);
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

      if (!GeneratedMessageV3.isStringEmpty(this.locale_)) {
         GeneratedMessageV3.writeString(var1, 2, this.locale_);
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

      if (!GeneratedMessageV3.isStringEmpty(this.locale_)) {
         var1 += GeneratedMessageV3.computeStringSize(2, this.locale_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof OpenTebexJsCheckoutPush)) {
         return super.equals(var1);
      } else {
         OpenTebexJsCheckoutPush var2 = (OpenTebexJsCheckoutPush)var1;
         if (!this.getBasketIdent().equals(var2.getBasketIdent())) {
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
      var1 = 53 * var1 + this.getLocale().hashCode();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static OpenTebexJsCheckoutPush parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static OpenTebexJsCheckoutPush parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OpenTebexJsCheckoutPush parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static OpenTebexJsCheckoutPush parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OpenTebexJsCheckoutPush parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static OpenTebexJsCheckoutPush parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OpenTebexJsCheckoutPush parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static OpenTebexJsCheckoutPush parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static OpenTebexJsCheckoutPush parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static OpenTebexJsCheckoutPush parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static OpenTebexJsCheckoutPush parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static OpenTebexJsCheckoutPush parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public OpenTebexJsCheckoutPush.Builder newBuilderForType() {
      return newBuilder();
   }

   public static OpenTebexJsCheckoutPush.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static OpenTebexJsCheckoutPush.Builder newBuilder(OpenTebexJsCheckoutPush var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public OpenTebexJsCheckoutPush.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new OpenTebexJsCheckoutPush.Builder() : new OpenTebexJsCheckoutPush.Builder().mergeFrom(this);
   }

   protected OpenTebexJsCheckoutPush.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new OpenTebexJsCheckoutPush.Builder(var1);
   }

   public static OpenTebexJsCheckoutPush getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<OpenTebexJsCheckoutPush> parser() {
      return PARSER;
   }

   @Override
   public Parser<OpenTebexJsCheckoutPush> getParserForType() {
      return PARSER;
   }

   public OpenTebexJsCheckoutPush getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<OpenTebexJsCheckoutPush.Builder> implements OpenTebexJsCheckoutPushOrBuilder {
      private int bitField0_;
      private Object basketIdent_ = "";
      private Object locale_ = "";

      public static final Descriptors.Descriptor getDescriptor() {
         return PushProto.internal_static_lunarclient_websocket_tebex_v1_OpenTebexJsCheckoutPush_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PushProto.internal_static_lunarclient_websocket_tebex_v1_OpenTebexJsCheckoutPush_fieldAccessorTable
            .ensureFieldAccessorsInitialized(OpenTebexJsCheckoutPush.class, OpenTebexJsCheckoutPush.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public OpenTebexJsCheckoutPush.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.basketIdent_ = "";
         this.locale_ = "";
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return PushProto.internal_static_lunarclient_websocket_tebex_v1_OpenTebexJsCheckoutPush_descriptor;
      }

      public OpenTebexJsCheckoutPush getDefaultInstanceForType() {
         return OpenTebexJsCheckoutPush.getDefaultInstance();
      }

      public OpenTebexJsCheckoutPush build() {
         OpenTebexJsCheckoutPush var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public OpenTebexJsCheckoutPush buildPartial() {
         OpenTebexJsCheckoutPush var1 = new OpenTebexJsCheckoutPush(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(OpenTebexJsCheckoutPush var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.basketIdent_ = this.basketIdent_;
         }

         if ((var2 & 2) != 0) {
            var1.locale_ = this.locale_;
         }
      }

      public OpenTebexJsCheckoutPush.Builder clone() {
         return (OpenTebexJsCheckoutPush.Builder)super.clone();
      }

      public OpenTebexJsCheckoutPush.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (OpenTebexJsCheckoutPush.Builder)super.setField(var1, var2);
      }

      public OpenTebexJsCheckoutPush.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (OpenTebexJsCheckoutPush.Builder)super.clearField(var1);
      }

      public OpenTebexJsCheckoutPush.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (OpenTebexJsCheckoutPush.Builder)super.clearOneof(var1);
      }

      public OpenTebexJsCheckoutPush.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (OpenTebexJsCheckoutPush.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public OpenTebexJsCheckoutPush.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (OpenTebexJsCheckoutPush.Builder)super.addRepeatedField(var1, var2);
      }

      public OpenTebexJsCheckoutPush.Builder mergeFrom(Message var1) {
         if (var1 instanceof OpenTebexJsCheckoutPush) {
            return this.mergeFrom((OpenTebexJsCheckoutPush)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public OpenTebexJsCheckoutPush.Builder mergeFrom(OpenTebexJsCheckoutPush var1) {
         if (var1 == OpenTebexJsCheckoutPush.getDefaultInstance()) {
            return this;
         }

         if (!var1.getBasketIdent().isEmpty()) {
            this.basketIdent_ = var1.basketIdent_;
            this.bitField0_ |= 1;
            this.onChanged();
         }

         if (!var1.getLocale().isEmpty()) {
            this.locale_ = var1.locale_;
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

      public OpenTebexJsCheckoutPush.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                  case 18:
                     this.locale_ = var1.readStringRequireUtf8();
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

      public OpenTebexJsCheckoutPush.Builder setBasketIdent(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.basketIdent_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public OpenTebexJsCheckoutPush.Builder clearBasketIdent() {
         this.basketIdent_ = OpenTebexJsCheckoutPush.getDefaultInstance().getBasketIdent();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public OpenTebexJsCheckoutPush.Builder setBasketIdentBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         OpenTebexJsCheckoutPush.checkByteStringIsUtf8(var1);
         this.basketIdent_ = var1;
         this.bitField0_ |= 1;
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

      public OpenTebexJsCheckoutPush.Builder setLocale(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.locale_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public OpenTebexJsCheckoutPush.Builder clearLocale() {
         this.locale_ = OpenTebexJsCheckoutPush.getDefaultInstance().getLocale();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      public OpenTebexJsCheckoutPush.Builder setLocaleBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         OpenTebexJsCheckoutPush.checkByteStringIsUtf8(var1);
         this.locale_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public final OpenTebexJsCheckoutPush.Builder setUnknownFields(UnknownFieldSet var1) {
         return (OpenTebexJsCheckoutPush.Builder)super.setUnknownFields(var1);
      }

      public final OpenTebexJsCheckoutPush.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (OpenTebexJsCheckoutPush.Builder)super.mergeUnknownFields(var1);
      }
   }
}
