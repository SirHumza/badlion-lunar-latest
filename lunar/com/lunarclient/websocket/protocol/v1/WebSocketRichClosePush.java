package com.lunarclient.websocket.protocol.v1;

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

public final class WebSocketRichClosePush extends GeneratedMessageV3 implements WebSocketRichClosePushOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int RECONNECT_DELAY_FIELD_NUMBER = 1;
   private int reconnectDelay_ = 0;
   public static final int REASON_FIELD_NUMBER = 2;
   private volatile Object reason_ = "";
   public static final int RECONNECT_AUTHENTICATOR_JWT_FIELD_NUMBER = 3;
   private volatile Object reconnectAuthenticatorJwt_ = "";
   private byte memoizedIsInitialized = -1;
   private static final WebSocketRichClosePush DEFAULT_INSTANCE = new WebSocketRichClosePush();
   private static final Parser<WebSocketRichClosePush> PARSER = new AbstractParser<WebSocketRichClosePush>() {
      public WebSocketRichClosePush parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         WebSocketRichClosePush.Builder var3 = WebSocketRichClosePush.newBuilder();

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

   private WebSocketRichClosePush(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private WebSocketRichClosePush() {
      this.reconnectDelay_ = 0;
      this.reason_ = "";
      this.reconnectAuthenticatorJwt_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new WebSocketRichClosePush();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return PushProto.internal_static_lunarclient_websocket_protocol_v1_WebSocketRichClosePush_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return PushProto.internal_static_lunarclient_websocket_protocol_v1_WebSocketRichClosePush_fieldAccessorTable
         .ensureFieldAccessorsInitialized(WebSocketRichClosePush.class, WebSocketRichClosePush.Builder.class);
   }

   @Override
   public int getReconnectDelayValue() {
      return this.reconnectDelay_;
   }

   @Override
   public WebSocketRichClosePush.ReconnectDelay getReconnectDelay() {
      WebSocketRichClosePush.ReconnectDelay var1 = WebSocketRichClosePush.ReconnectDelay.forNumber(this.reconnectDelay_);
      return var1 == null ? WebSocketRichClosePush.ReconnectDelay.UNRECOGNIZED : var1;
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
   public String getReconnectAuthenticatorJwt() {
      Object var1 = this.reconnectAuthenticatorJwt_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.reconnectAuthenticatorJwt_ = var3;
      return var3;
   }

   @Override
   public ByteString getReconnectAuthenticatorJwtBytes() {
      Object var1 = this.reconnectAuthenticatorJwt_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.reconnectAuthenticatorJwt_ = var2;
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
      if (this.reconnectDelay_ != WebSocketRichClosePush.ReconnectDelay.RECONNECT_DELAY_UNSPECIFIED.getNumber()) {
         var1.writeEnum(1, this.reconnectDelay_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.reason_)) {
         GeneratedMessageV3.writeString(var1, 2, this.reason_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.reconnectAuthenticatorJwt_)) {
         GeneratedMessageV3.writeString(var1, 3, this.reconnectAuthenticatorJwt_);
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
      if (this.reconnectDelay_ != WebSocketRichClosePush.ReconnectDelay.RECONNECT_DELAY_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(1, this.reconnectDelay_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.reason_)) {
         var1 += GeneratedMessageV3.computeStringSize(2, this.reason_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.reconnectAuthenticatorJwt_)) {
         var1 += GeneratedMessageV3.computeStringSize(3, this.reconnectAuthenticatorJwt_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof WebSocketRichClosePush)) {
         return super.equals(var1);
      } else {
         WebSocketRichClosePush var2 = (WebSocketRichClosePush)var1;
         if (this.reconnectDelay_ != var2.reconnectDelay_) {
            return false;
         } else if (!this.getReason().equals(var2.getReason())) {
            return false;
         } else {
            return !this.getReconnectAuthenticatorJwt().equals(var2.getReconnectAuthenticatorJwt())
               ? false
               : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + this.reconnectDelay_;
      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.getReason().hashCode();
      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + this.getReconnectAuthenticatorJwt().hashCode();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static WebSocketRichClosePush parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static WebSocketRichClosePush parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static WebSocketRichClosePush parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static WebSocketRichClosePush parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static WebSocketRichClosePush parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static WebSocketRichClosePush parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static WebSocketRichClosePush parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static WebSocketRichClosePush parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static WebSocketRichClosePush parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static WebSocketRichClosePush parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static WebSocketRichClosePush parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static WebSocketRichClosePush parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public WebSocketRichClosePush.Builder newBuilderForType() {
      return newBuilder();
   }

   public static WebSocketRichClosePush.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static WebSocketRichClosePush.Builder newBuilder(WebSocketRichClosePush var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public WebSocketRichClosePush.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new WebSocketRichClosePush.Builder() : new WebSocketRichClosePush.Builder().mergeFrom(this);
   }

   protected WebSocketRichClosePush.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new WebSocketRichClosePush.Builder(var1);
   }

   public static WebSocketRichClosePush getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<WebSocketRichClosePush> parser() {
      return PARSER;
   }

   @Override
   public Parser<WebSocketRichClosePush> getParserForType() {
      return PARSER;
   }

   public WebSocketRichClosePush getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<WebSocketRichClosePush.Builder> implements WebSocketRichClosePushOrBuilder {
      private int bitField0_;
      private int reconnectDelay_ = 0;
      private Object reason_ = "";
      private Object reconnectAuthenticatorJwt_ = "";

      public static final Descriptors.Descriptor getDescriptor() {
         return PushProto.internal_static_lunarclient_websocket_protocol_v1_WebSocketRichClosePush_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return PushProto.internal_static_lunarclient_websocket_protocol_v1_WebSocketRichClosePush_fieldAccessorTable
            .ensureFieldAccessorsInitialized(WebSocketRichClosePush.class, WebSocketRichClosePush.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public WebSocketRichClosePush.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.reconnectDelay_ = 0;
         this.reason_ = "";
         this.reconnectAuthenticatorJwt_ = "";
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return PushProto.internal_static_lunarclient_websocket_protocol_v1_WebSocketRichClosePush_descriptor;
      }

      public WebSocketRichClosePush getDefaultInstanceForType() {
         return WebSocketRichClosePush.getDefaultInstance();
      }

      public WebSocketRichClosePush build() {
         WebSocketRichClosePush var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public WebSocketRichClosePush buildPartial() {
         WebSocketRichClosePush var1 = new WebSocketRichClosePush(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(WebSocketRichClosePush var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.reconnectDelay_ = this.reconnectDelay_;
         }

         if ((var2 & 2) != 0) {
            var1.reason_ = this.reason_;
         }

         if ((var2 & 4) != 0) {
            var1.reconnectAuthenticatorJwt_ = this.reconnectAuthenticatorJwt_;
         }
      }

      public WebSocketRichClosePush.Builder clone() {
         return (WebSocketRichClosePush.Builder)super.clone();
      }

      public WebSocketRichClosePush.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (WebSocketRichClosePush.Builder)super.setField(var1, var2);
      }

      public WebSocketRichClosePush.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (WebSocketRichClosePush.Builder)super.clearField(var1);
      }

      public WebSocketRichClosePush.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (WebSocketRichClosePush.Builder)super.clearOneof(var1);
      }

      public WebSocketRichClosePush.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (WebSocketRichClosePush.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public WebSocketRichClosePush.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (WebSocketRichClosePush.Builder)super.addRepeatedField(var1, var2);
      }

      public WebSocketRichClosePush.Builder mergeFrom(Message var1) {
         if (var1 instanceof WebSocketRichClosePush) {
            return this.mergeFrom((WebSocketRichClosePush)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public WebSocketRichClosePush.Builder mergeFrom(WebSocketRichClosePush var1) {
         if (var1 == WebSocketRichClosePush.getDefaultInstance()) {
            return this;
         }

         if (var1.reconnectDelay_ != 0) {
            this.setReconnectDelayValue(var1.getReconnectDelayValue());
         }

         if (!var1.getReason().isEmpty()) {
            this.reason_ = var1.reason_;
            this.bitField0_ |= 2;
            this.onChanged();
         }

         if (!var1.getReconnectAuthenticatorJwt().isEmpty()) {
            this.reconnectAuthenticatorJwt_ = var1.reconnectAuthenticatorJwt_;
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

      public WebSocketRichClosePush.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                  case 8:
                     this.reconnectDelay_ = var1.readEnum();
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     this.reason_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 2;
                     break;
                  case 26:
                     this.reconnectAuthenticatorJwt_ = var1.readStringRequireUtf8();
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
      public int getReconnectDelayValue() {
         return this.reconnectDelay_;
      }

      public WebSocketRichClosePush.Builder setReconnectDelayValue(int var1) {
         this.reconnectDelay_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public WebSocketRichClosePush.ReconnectDelay getReconnectDelay() {
         WebSocketRichClosePush.ReconnectDelay var1 = WebSocketRichClosePush.ReconnectDelay.forNumber(this.reconnectDelay_);
         return var1 == null ? WebSocketRichClosePush.ReconnectDelay.UNRECOGNIZED : var1;
      }

      public WebSocketRichClosePush.Builder setReconnectDelay(WebSocketRichClosePush.ReconnectDelay var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 1;
         this.reconnectDelay_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public WebSocketRichClosePush.Builder clearReconnectDelay() {
         this.bitField0_ &= -2;
         this.reconnectDelay_ = 0;
         this.onChanged();
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

      public WebSocketRichClosePush.Builder setReason(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.reason_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public WebSocketRichClosePush.Builder clearReason() {
         this.reason_ = WebSocketRichClosePush.getDefaultInstance().getReason();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      public WebSocketRichClosePush.Builder setReasonBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         WebSocketRichClosePush.checkByteStringIsUtf8(var1);
         this.reason_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      @Override
      public String getReconnectAuthenticatorJwt() {
         Object var1 = this.reconnectAuthenticatorJwt_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.reconnectAuthenticatorJwt_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getReconnectAuthenticatorJwtBytes() {
         Object var1 = this.reconnectAuthenticatorJwt_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.reconnectAuthenticatorJwt_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public WebSocketRichClosePush.Builder setReconnectAuthenticatorJwt(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.reconnectAuthenticatorJwt_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public WebSocketRichClosePush.Builder clearReconnectAuthenticatorJwt() {
         this.reconnectAuthenticatorJwt_ = WebSocketRichClosePush.getDefaultInstance().getReconnectAuthenticatorJwt();
         this.bitField0_ &= -5;
         this.onChanged();
         return this;
      }

      public WebSocketRichClosePush.Builder setReconnectAuthenticatorJwtBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         WebSocketRichClosePush.checkByteStringIsUtf8(var1);
         this.reconnectAuthenticatorJwt_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public final WebSocketRichClosePush.Builder setUnknownFields(UnknownFieldSet var1) {
         return (WebSocketRichClosePush.Builder)super.setUnknownFields(var1);
      }

      public final WebSocketRichClosePush.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (WebSocketRichClosePush.Builder)super.mergeUnknownFields(var1);
      }
   }

   public enum ReconnectDelay implements ProtocolMessageEnum {
      RECONNECT_DELAY_UNSPECIFIED(0),
      RECONNECT_DELAY_IMMEDIATE(1),
      RECONNECT_DELAY_NORMAL(2),
      UNRECOGNIZED(-1);

      public static final int RECONNECT_DELAY_UNSPECIFIED_VALUE = 0;
      public static final int RECONNECT_DELAY_IMMEDIATE_VALUE = 1;
      public static final int RECONNECT_DELAY_NORMAL_VALUE = 2;
      private static final Internal.EnumLiteMap<WebSocketRichClosePush.ReconnectDelay> internalValueMap = new Internal.EnumLiteMap<WebSocketRichClosePush.ReconnectDelay>() {
         public WebSocketRichClosePush.ReconnectDelay findValueByNumber(int var1) {
            return WebSocketRichClosePush.ReconnectDelay.forNumber(var1);
         }
      };
      private static final WebSocketRichClosePush.ReconnectDelay[] VALUES = values();
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
      public static WebSocketRichClosePush.ReconnectDelay valueOf(int var0) {
         return forNumber(var0);
      }

      public static WebSocketRichClosePush.ReconnectDelay forNumber(int var0) {
         switch (var0) {
            case 0:
               return RECONNECT_DELAY_UNSPECIFIED;
            case 1:
               return RECONNECT_DELAY_IMMEDIATE;
            case 2:
               return RECONNECT_DELAY_NORMAL;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<WebSocketRichClosePush.ReconnectDelay> internalGetValueMap() {
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
         return WebSocketRichClosePush.getDescriptor().getEnumTypes().get(0);
      }

      public static WebSocketRichClosePush.ReconnectDelay valueOf(Descriptors.EnumValueDescriptor var0) {
         if (var0.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
         }
      }

      ReconnectDelay(int var3) {
         this.value = var3;
      }
   }
}
