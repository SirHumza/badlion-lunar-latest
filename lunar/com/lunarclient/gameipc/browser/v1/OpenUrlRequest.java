package com.lunarclient.gameipc.browser.v1;

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

public final class OpenUrlRequest extends GeneratedMessageV3 implements OpenUrlRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int URL_FIELD_NUMBER = 1;
   private volatile Object url_ = "";
   public static final int INITIATOR_FIELD_NUMBER = 2;
   private int initiator_ = 0;
   public static final int OPEN_TYPE_FIELD_NUMBER = 3;
   private int openType_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final OpenUrlRequest DEFAULT_INSTANCE = new OpenUrlRequest();
   private static final Parser<OpenUrlRequest> PARSER = new AbstractParser<OpenUrlRequest>() {
      public OpenUrlRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         OpenUrlRequest.Builder var3 = OpenUrlRequest.newBuilder();

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

   private OpenUrlRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private OpenUrlRequest() {
      this.url_ = "";
      this.initiator_ = 0;
      this.openType_ = 0;
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new OpenUrlRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_gameipc_browser_v1_OpenUrlRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_gameipc_browser_v1_OpenUrlRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(OpenUrlRequest.class, OpenUrlRequest.Builder.class);
   }

   @Override
   public String getUrl() {
      Object var1 = this.url_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.url_ = var3;
      return var3;
   }

   @Override
   public ByteString getUrlBytes() {
      Object var1 = this.url_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.url_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public int getInitiatorValue() {
      return this.initiator_;
   }

   @Override
   public OpenUrlRequest.Initiator getInitiator() {
      OpenUrlRequest.Initiator var1 = OpenUrlRequest.Initiator.forNumber(this.initiator_);
      return var1 == null ? OpenUrlRequest.Initiator.UNRECOGNIZED : var1;
   }

   @Override
   public int getOpenTypeValue() {
      return this.openType_;
   }

   @Override
   public OpenUrlRequest.OpenType getOpenType() {
      OpenUrlRequest.OpenType var1 = OpenUrlRequest.OpenType.forNumber(this.openType_);
      return var1 == null ? OpenUrlRequest.OpenType.UNRECOGNIZED : var1;
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
      if (!GeneratedMessageV3.isStringEmpty(this.url_)) {
         GeneratedMessageV3.writeString(var1, 1, this.url_);
      }

      if (this.initiator_ != OpenUrlRequest.Initiator.INITIATOR_UNSPECIFIED.getNumber()) {
         var1.writeEnum(2, this.initiator_);
      }

      if (this.openType_ != OpenUrlRequest.OpenType.OPEN_TYPE_UNSPECIFIED.getNumber()) {
         var1.writeEnum(3, this.openType_);
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
      if (!GeneratedMessageV3.isStringEmpty(this.url_)) {
         var1 += GeneratedMessageV3.computeStringSize(1, this.url_);
      }

      if (this.initiator_ != OpenUrlRequest.Initiator.INITIATOR_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(2, this.initiator_);
      }

      if (this.openType_ != OpenUrlRequest.OpenType.OPEN_TYPE_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(3, this.openType_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof OpenUrlRequest)) {
         return super.equals(var1);
      } else {
         OpenUrlRequest var2 = (OpenUrlRequest)var1;
         if (!this.getUrl().equals(var2.getUrl())) {
            return false;
         } else if (this.initiator_ != var2.initiator_) {
            return false;
         } else {
            return this.openType_ != var2.openType_ ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + this.getUrl().hashCode();
      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.initiator_;
      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + this.openType_;
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static OpenUrlRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static OpenUrlRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OpenUrlRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static OpenUrlRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OpenUrlRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static OpenUrlRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OpenUrlRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static OpenUrlRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static OpenUrlRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static OpenUrlRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static OpenUrlRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static OpenUrlRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public OpenUrlRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static OpenUrlRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static OpenUrlRequest.Builder newBuilder(OpenUrlRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public OpenUrlRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new OpenUrlRequest.Builder() : new OpenUrlRequest.Builder().mergeFrom(this);
   }

   protected OpenUrlRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new OpenUrlRequest.Builder(var1);
   }

   public static OpenUrlRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<OpenUrlRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<OpenUrlRequest> getParserForType() {
      return PARSER;
   }

   public OpenUrlRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<OpenUrlRequest.Builder> implements OpenUrlRequestOrBuilder {
      private int bitField0_;
      private Object url_ = "";
      private int initiator_ = 0;
      private int openType_ = 0;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_gameipc_browser_v1_OpenUrlRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_gameipc_browser_v1_OpenUrlRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(OpenUrlRequest.class, OpenUrlRequest.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public OpenUrlRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.url_ = "";
         this.initiator_ = 0;
         this.openType_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_gameipc_browser_v1_OpenUrlRequest_descriptor;
      }

      public OpenUrlRequest getDefaultInstanceForType() {
         return OpenUrlRequest.getDefaultInstance();
      }

      public OpenUrlRequest build() {
         OpenUrlRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public OpenUrlRequest buildPartial() {
         OpenUrlRequest var1 = new OpenUrlRequest(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(OpenUrlRequest var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.url_ = this.url_;
         }

         if ((var2 & 2) != 0) {
            var1.initiator_ = this.initiator_;
         }

         if ((var2 & 4) != 0) {
            var1.openType_ = this.openType_;
         }
      }

      public OpenUrlRequest.Builder clone() {
         return (OpenUrlRequest.Builder)super.clone();
      }

      public OpenUrlRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (OpenUrlRequest.Builder)super.setField(var1, var2);
      }

      public OpenUrlRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (OpenUrlRequest.Builder)super.clearField(var1);
      }

      public OpenUrlRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (OpenUrlRequest.Builder)super.clearOneof(var1);
      }

      public OpenUrlRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (OpenUrlRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public OpenUrlRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (OpenUrlRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public OpenUrlRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof OpenUrlRequest) {
            return this.mergeFrom((OpenUrlRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public OpenUrlRequest.Builder mergeFrom(OpenUrlRequest var1) {
         if (var1 == OpenUrlRequest.getDefaultInstance()) {
            return this;
         }

         if (!var1.getUrl().isEmpty()) {
            this.url_ = var1.url_;
            this.bitField0_ |= 1;
            this.onChanged();
         }

         if (var1.initiator_ != 0) {
            this.setInitiatorValue(var1.getInitiatorValue());
         }

         if (var1.openType_ != 0) {
            this.setOpenTypeValue(var1.getOpenTypeValue());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public OpenUrlRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.url_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 1;
                     break;
                  case 16:
                     this.initiator_ = var1.readEnum();
                     this.bitField0_ |= 2;
                     break;
                  case 24:
                     this.openType_ = var1.readEnum();
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
      public String getUrl() {
         Object var1 = this.url_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.url_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getUrlBytes() {
         Object var1 = this.url_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.url_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public OpenUrlRequest.Builder setUrl(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.url_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public OpenUrlRequest.Builder clearUrl() {
         this.url_ = OpenUrlRequest.getDefaultInstance().getUrl();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public OpenUrlRequest.Builder setUrlBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         OpenUrlRequest.checkByteStringIsUtf8(var1);
         this.url_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public int getInitiatorValue() {
         return this.initiator_;
      }

      public OpenUrlRequest.Builder setInitiatorValue(int var1) {
         this.initiator_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      @Override
      public OpenUrlRequest.Initiator getInitiator() {
         OpenUrlRequest.Initiator var1 = OpenUrlRequest.Initiator.forNumber(this.initiator_);
         return var1 == null ? OpenUrlRequest.Initiator.UNRECOGNIZED : var1;
      }

      public OpenUrlRequest.Builder setInitiator(OpenUrlRequest.Initiator var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 2;
         this.initiator_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public OpenUrlRequest.Builder clearInitiator() {
         this.bitField0_ &= -3;
         this.initiator_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public int getOpenTypeValue() {
         return this.openType_;
      }

      public OpenUrlRequest.Builder setOpenTypeValue(int var1) {
         this.openType_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      @Override
      public OpenUrlRequest.OpenType getOpenType() {
         OpenUrlRequest.OpenType var1 = OpenUrlRequest.OpenType.forNumber(this.openType_);
         return var1 == null ? OpenUrlRequest.OpenType.UNRECOGNIZED : var1;
      }

      public OpenUrlRequest.Builder setOpenType(OpenUrlRequest.OpenType var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 4;
         this.openType_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public OpenUrlRequest.Builder clearOpenType() {
         this.bitField0_ &= -5;
         this.openType_ = 0;
         this.onChanged();
         return this;
      }

      public final OpenUrlRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (OpenUrlRequest.Builder)super.setUnknownFields(var1);
      }

      public final OpenUrlRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (OpenUrlRequest.Builder)super.mergeUnknownFields(var1);
      }
   }

   public enum Initiator implements ProtocolMessageEnum {
      INITIATOR_UNSPECIFIED(0),
      INITIATOR_COSMETICS(1),
      INITIATOR_ALERT(2),
      INITIATOR_AUTH(3),
      INITIATOR_BLOG(4),
      INITIATOR_SOCIAL_LINK(5),
      INITIATOR_HOME_BUTTON(6),
      INITIATOR_LINK_CONFIRM(7),
      INITIATOR_SCREENSHOT_UPLOAD(8),
      INITIATOR_HOME_CTA(9),
      INITIATOR_STORE_PREVIEW(10),
      UNRECOGNIZED(-1);

      public static final int INITIATOR_UNSPECIFIED_VALUE = 0;
      public static final int INITIATOR_COSMETICS_VALUE = 1;
      public static final int INITIATOR_ALERT_VALUE = 2;
      public static final int INITIATOR_AUTH_VALUE = 3;
      public static final int INITIATOR_BLOG_VALUE = 4;
      public static final int INITIATOR_SOCIAL_LINK_VALUE = 5;
      public static final int INITIATOR_HOME_BUTTON_VALUE = 6;
      public static final int INITIATOR_LINK_CONFIRM_VALUE = 7;
      public static final int INITIATOR_SCREENSHOT_UPLOAD_VALUE = 8;
      public static final int INITIATOR_HOME_CTA_VALUE = 9;
      public static final int INITIATOR_STORE_PREVIEW_VALUE = 10;
      private static final Internal.EnumLiteMap<OpenUrlRequest.Initiator> internalValueMap = new Internal.EnumLiteMap<OpenUrlRequest.Initiator>() {
         public OpenUrlRequest.Initiator findValueByNumber(int var1) {
            return OpenUrlRequest.Initiator.forNumber(var1);
         }
      };
      private static final OpenUrlRequest.Initiator[] VALUES = values();
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
      public static OpenUrlRequest.Initiator valueOf(int var0) {
         return forNumber(var0);
      }

      public static OpenUrlRequest.Initiator forNumber(int var0) {
         switch (var0) {
            case 0:
               return INITIATOR_UNSPECIFIED;
            case 1:
               return INITIATOR_COSMETICS;
            case 2:
               return INITIATOR_ALERT;
            case 3:
               return INITIATOR_AUTH;
            case 4:
               return INITIATOR_BLOG;
            case 5:
               return INITIATOR_SOCIAL_LINK;
            case 6:
               return INITIATOR_HOME_BUTTON;
            case 7:
               return INITIATOR_LINK_CONFIRM;
            case 8:
               return INITIATOR_SCREENSHOT_UPLOAD;
            case 9:
               return INITIATOR_HOME_CTA;
            case 10:
               return INITIATOR_STORE_PREVIEW;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<OpenUrlRequest.Initiator> internalGetValueMap() {
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
         return OpenUrlRequest.getDescriptor().getEnumTypes().get(0);
      }

      public static OpenUrlRequest.Initiator valueOf(Descriptors.EnumValueDescriptor var0) {
         if (var0.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
         }
      }

      Initiator(int var3) {
         this.value = var3;
      }
   }

   public enum OpenType implements ProtocolMessageEnum {
      OPEN_TYPE_UNSPECIFIED(0),
      OPEN_TYPE_FORCE_EMBEDDED(1),
      OPEN_TYPE_FORCE_EXTERNAL(2),
      UNRECOGNIZED(-1);

      public static final int OPEN_TYPE_UNSPECIFIED_VALUE = 0;
      public static final int OPEN_TYPE_FORCE_EMBEDDED_VALUE = 1;
      public static final int OPEN_TYPE_FORCE_EXTERNAL_VALUE = 2;
      private static final Internal.EnumLiteMap<OpenUrlRequest.OpenType> internalValueMap = new Internal.EnumLiteMap<OpenUrlRequest.OpenType>() {
         public OpenUrlRequest.OpenType findValueByNumber(int var1) {
            return OpenUrlRequest.OpenType.forNumber(var1);
         }
      };
      private static final OpenUrlRequest.OpenType[] VALUES = values();
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
      public static OpenUrlRequest.OpenType valueOf(int var0) {
         return forNumber(var0);
      }

      public static OpenUrlRequest.OpenType forNumber(int var0) {
         switch (var0) {
            case 0:
               return OPEN_TYPE_UNSPECIFIED;
            case 1:
               return OPEN_TYPE_FORCE_EMBEDDED;
            case 2:
               return OPEN_TYPE_FORCE_EXTERNAL;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<OpenUrlRequest.OpenType> internalGetValueMap() {
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
         return OpenUrlRequest.getDescriptor().getEnumTypes().get(1);
      }

      public static OpenUrlRequest.OpenType valueOf(Descriptors.EnumValueDescriptor var0) {
         if (var0.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
         }
      }

      OpenType(int var3) {
         this.value = var3;
      }
   }
}
