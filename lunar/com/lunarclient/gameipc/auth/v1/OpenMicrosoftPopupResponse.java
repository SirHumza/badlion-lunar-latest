package com.lunarclient.gameipc.auth.v1;

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

public final class OpenMicrosoftPopupResponse extends GeneratedMessageV3 implements OpenMicrosoftPopupResponseOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int STATUS_FIELD_NUMBER = 1;
   private int status_ = 0;
   public static final int URL_FIELD_NUMBER = 2;
   private volatile Object url_ = "";
   private byte memoizedIsInitialized = -1;
   private static final OpenMicrosoftPopupResponse DEFAULT_INSTANCE = new OpenMicrosoftPopupResponse();
   private static final Parser<OpenMicrosoftPopupResponse> PARSER = new AbstractParser<OpenMicrosoftPopupResponse>() {
      public OpenMicrosoftPopupResponse parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         OpenMicrosoftPopupResponse.Builder var3 = OpenMicrosoftPopupResponse.newBuilder();

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

   private OpenMicrosoftPopupResponse(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private OpenMicrosoftPopupResponse() {
      this.status_ = 0;
      this.url_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new OpenMicrosoftPopupResponse();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_gameipc_auth_v1_OpenMicrosoftPopupResponse_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_gameipc_auth_v1_OpenMicrosoftPopupResponse_fieldAccessorTable
         .ensureFieldAccessorsInitialized(OpenMicrosoftPopupResponse.class, OpenMicrosoftPopupResponse.Builder.class);
   }

   @Override
   public int getStatusValue() {
      return this.status_;
   }

   @Override
   public OpenMicrosoftPopupResponse.Status getStatus() {
      OpenMicrosoftPopupResponse.Status var1 = OpenMicrosoftPopupResponse.Status.forNumber(this.status_);
      return var1 == null ? OpenMicrosoftPopupResponse.Status.UNRECOGNIZED : var1;
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
      if (this.status_ != OpenMicrosoftPopupResponse.Status.STATUS_UNSPECIFIED.getNumber()) {
         var1.writeEnum(1, this.status_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.url_)) {
         GeneratedMessageV3.writeString(var1, 2, this.url_);
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
      if (this.status_ != OpenMicrosoftPopupResponse.Status.STATUS_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(1, this.status_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.url_)) {
         var1 += GeneratedMessageV3.computeStringSize(2, this.url_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof OpenMicrosoftPopupResponse)) {
         return super.equals(var1);
      } else {
         OpenMicrosoftPopupResponse var2 = (OpenMicrosoftPopupResponse)var1;
         if (this.status_ != var2.status_) {
            return false;
         } else {
            return !this.getUrl().equals(var2.getUrl()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + this.status_;
      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.getUrl().hashCode();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static OpenMicrosoftPopupResponse parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static OpenMicrosoftPopupResponse parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OpenMicrosoftPopupResponse parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static OpenMicrosoftPopupResponse parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OpenMicrosoftPopupResponse parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static OpenMicrosoftPopupResponse parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OpenMicrosoftPopupResponse parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static OpenMicrosoftPopupResponse parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static OpenMicrosoftPopupResponse parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static OpenMicrosoftPopupResponse parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static OpenMicrosoftPopupResponse parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static OpenMicrosoftPopupResponse parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public OpenMicrosoftPopupResponse.Builder newBuilderForType() {
      return newBuilder();
   }

   public static OpenMicrosoftPopupResponse.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static OpenMicrosoftPopupResponse.Builder newBuilder(OpenMicrosoftPopupResponse var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public OpenMicrosoftPopupResponse.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new OpenMicrosoftPopupResponse.Builder() : new OpenMicrosoftPopupResponse.Builder().mergeFrom(this);
   }

   protected OpenMicrosoftPopupResponse.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new OpenMicrosoftPopupResponse.Builder(var1);
   }

   public static OpenMicrosoftPopupResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<OpenMicrosoftPopupResponse> parser() {
      return PARSER;
   }

   @Override
   public Parser<OpenMicrosoftPopupResponse> getParserForType() {
      return PARSER;
   }

   public OpenMicrosoftPopupResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<OpenMicrosoftPopupResponse.Builder> implements OpenMicrosoftPopupResponseOrBuilder {
      private int bitField0_;
      private int status_ = 0;
      private Object url_ = "";

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_gameipc_auth_v1_OpenMicrosoftPopupResponse_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_gameipc_auth_v1_OpenMicrosoftPopupResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(OpenMicrosoftPopupResponse.class, OpenMicrosoftPopupResponse.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public OpenMicrosoftPopupResponse.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.status_ = 0;
         this.url_ = "";
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_gameipc_auth_v1_OpenMicrosoftPopupResponse_descriptor;
      }

      public OpenMicrosoftPopupResponse getDefaultInstanceForType() {
         return OpenMicrosoftPopupResponse.getDefaultInstance();
      }

      public OpenMicrosoftPopupResponse build() {
         OpenMicrosoftPopupResponse var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public OpenMicrosoftPopupResponse buildPartial() {
         OpenMicrosoftPopupResponse var1 = new OpenMicrosoftPopupResponse(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(OpenMicrosoftPopupResponse var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.status_ = this.status_;
         }

         if ((var2 & 2) != 0) {
            var1.url_ = this.url_;
         }
      }

      public OpenMicrosoftPopupResponse.Builder clone() {
         return (OpenMicrosoftPopupResponse.Builder)super.clone();
      }

      public OpenMicrosoftPopupResponse.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (OpenMicrosoftPopupResponse.Builder)super.setField(var1, var2);
      }

      public OpenMicrosoftPopupResponse.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (OpenMicrosoftPopupResponse.Builder)super.clearField(var1);
      }

      public OpenMicrosoftPopupResponse.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (OpenMicrosoftPopupResponse.Builder)super.clearOneof(var1);
      }

      public OpenMicrosoftPopupResponse.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (OpenMicrosoftPopupResponse.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public OpenMicrosoftPopupResponse.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (OpenMicrosoftPopupResponse.Builder)super.addRepeatedField(var1, var2);
      }

      public OpenMicrosoftPopupResponse.Builder mergeFrom(Message var1) {
         if (var1 instanceof OpenMicrosoftPopupResponse) {
            return this.mergeFrom((OpenMicrosoftPopupResponse)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public OpenMicrosoftPopupResponse.Builder mergeFrom(OpenMicrosoftPopupResponse var1) {
         if (var1 == OpenMicrosoftPopupResponse.getDefaultInstance()) {
            return this;
         }

         if (var1.status_ != 0) {
            this.setStatusValue(var1.getStatusValue());
         }

         if (!var1.getUrl().isEmpty()) {
            this.url_ = var1.url_;
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

      public OpenMicrosoftPopupResponse.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.status_ = var1.readEnum();
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     this.url_ = var1.readStringRequireUtf8();
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
      public int getStatusValue() {
         return this.status_;
      }

      public OpenMicrosoftPopupResponse.Builder setStatusValue(int var1) {
         this.status_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public OpenMicrosoftPopupResponse.Status getStatus() {
         OpenMicrosoftPopupResponse.Status var1 = OpenMicrosoftPopupResponse.Status.forNumber(this.status_);
         return var1 == null ? OpenMicrosoftPopupResponse.Status.UNRECOGNIZED : var1;
      }

      public OpenMicrosoftPopupResponse.Builder setStatus(OpenMicrosoftPopupResponse.Status var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 1;
         this.status_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public OpenMicrosoftPopupResponse.Builder clearStatus() {
         this.bitField0_ &= -2;
         this.status_ = 0;
         this.onChanged();
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

      public OpenMicrosoftPopupResponse.Builder setUrl(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.url_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public OpenMicrosoftPopupResponse.Builder clearUrl() {
         this.url_ = OpenMicrosoftPopupResponse.getDefaultInstance().getUrl();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      public OpenMicrosoftPopupResponse.Builder setUrlBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         OpenMicrosoftPopupResponse.checkByteStringIsUtf8(var1);
         this.url_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public final OpenMicrosoftPopupResponse.Builder setUnknownFields(UnknownFieldSet var1) {
         return (OpenMicrosoftPopupResponse.Builder)super.setUnknownFields(var1);
      }

      public final OpenMicrosoftPopupResponse.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (OpenMicrosoftPopupResponse.Builder)super.mergeUnknownFields(var1);
      }
   }

   public enum Status implements ProtocolMessageEnum {
      STATUS_UNSPECIFIED(0),
      STATUS_MATCHED_TARGET_URL(1),
      STATUS_CLOSED_WITH_NO_URL(2),
      UNRECOGNIZED(-1);

      public static final int STATUS_UNSPECIFIED_VALUE = 0;
      public static final int STATUS_MATCHED_TARGET_URL_VALUE = 1;
      public static final int STATUS_CLOSED_WITH_NO_URL_VALUE = 2;
      private static final Internal.EnumLiteMap<OpenMicrosoftPopupResponse.Status> internalValueMap = new Internal.EnumLiteMap<OpenMicrosoftPopupResponse.Status>() {
         public OpenMicrosoftPopupResponse.Status findValueByNumber(int var1) {
            return OpenMicrosoftPopupResponse.Status.forNumber(var1);
         }
      };
      private static final OpenMicrosoftPopupResponse.Status[] VALUES = values();
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
      public static OpenMicrosoftPopupResponse.Status valueOf(int var0) {
         return forNumber(var0);
      }

      public static OpenMicrosoftPopupResponse.Status forNumber(int var0) {
         switch (var0) {
            case 0:
               return STATUS_UNSPECIFIED;
            case 1:
               return STATUS_MATCHED_TARGET_URL;
            case 2:
               return STATUS_CLOSED_WITH_NO_URL;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<OpenMicrosoftPopupResponse.Status> internalGetValueMap() {
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
         return OpenMicrosoftPopupResponse.getDescriptor().getEnumTypes().get(0);
      }

      public static OpenMicrosoftPopupResponse.Status valueOf(Descriptors.EnumValueDescriptor var0) {
         if (var0.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
         }
      }

      Status(int var3) {
         this.value = var3;
      }
   }
}
