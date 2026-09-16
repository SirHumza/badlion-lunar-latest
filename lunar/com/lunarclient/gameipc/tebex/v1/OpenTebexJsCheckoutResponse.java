package com.lunarclient.gameipc.tebex.v1;

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

public final class OpenTebexJsCheckoutResponse extends GeneratedMessageV3 implements OpenTebexJsCheckoutResponseOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int STATUS_FIELD_NUMBER = 1;
   private int status_ = 0;
   public static final int OPEN_MINECRAFT_SCREEN_FIELD_NUMBER = 2;
   private boolean openMinecraftScreen_ = false;
   private byte memoizedIsInitialized = -1;
   private static final OpenTebexJsCheckoutResponse DEFAULT_INSTANCE = new OpenTebexJsCheckoutResponse();
   private static final Parser<OpenTebexJsCheckoutResponse> PARSER = new AbstractParser<OpenTebexJsCheckoutResponse>() {
      public OpenTebexJsCheckoutResponse parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         OpenTebexJsCheckoutResponse.Builder var3 = OpenTebexJsCheckoutResponse.newBuilder();

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

   private OpenTebexJsCheckoutResponse(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private OpenTebexJsCheckoutResponse() {
      this.status_ = 0;
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new OpenTebexJsCheckoutResponse();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_gameipc_tebex_v1_OpenTebexJsCheckoutResponse_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_gameipc_tebex_v1_OpenTebexJsCheckoutResponse_fieldAccessorTable
         .ensureFieldAccessorsInitialized(OpenTebexJsCheckoutResponse.class, OpenTebexJsCheckoutResponse.Builder.class);
   }

   @Override
   public int getStatusValue() {
      return this.status_;
   }

   @Override
   public OpenTebexJsCheckoutResponse.Status getStatus() {
      OpenTebexJsCheckoutResponse.Status var1 = OpenTebexJsCheckoutResponse.Status.forNumber(this.status_);
      return var1 == null ? OpenTebexJsCheckoutResponse.Status.UNRECOGNIZED : var1;
   }

   @Override
   public boolean getOpenMinecraftScreen() {
      return this.openMinecraftScreen_;
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
      if (this.status_ != OpenTebexJsCheckoutResponse.Status.STATUS_UNSPECIFIED.getNumber()) {
         var1.writeEnum(1, this.status_);
      }

      if (this.openMinecraftScreen_) {
         var1.writeBool(2, this.openMinecraftScreen_);
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
      if (this.status_ != OpenTebexJsCheckoutResponse.Status.STATUS_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(1, this.status_);
      }

      if (this.openMinecraftScreen_) {
         var1 += CodedOutputStream.computeBoolSize(2, this.openMinecraftScreen_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof OpenTebexJsCheckoutResponse)) {
         return super.equals(var1);
      } else {
         OpenTebexJsCheckoutResponse var2 = (OpenTebexJsCheckoutResponse)var1;
         if (this.status_ != var2.status_) {
            return false;
         } else {
            return this.getOpenMinecraftScreen() != var2.getOpenMinecraftScreen() ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + Internal.hashBoolean(this.getOpenMinecraftScreen());
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static OpenTebexJsCheckoutResponse parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static OpenTebexJsCheckoutResponse parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OpenTebexJsCheckoutResponse parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static OpenTebexJsCheckoutResponse parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OpenTebexJsCheckoutResponse parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static OpenTebexJsCheckoutResponse parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OpenTebexJsCheckoutResponse parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static OpenTebexJsCheckoutResponse parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static OpenTebexJsCheckoutResponse parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static OpenTebexJsCheckoutResponse parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static OpenTebexJsCheckoutResponse parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static OpenTebexJsCheckoutResponse parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public OpenTebexJsCheckoutResponse.Builder newBuilderForType() {
      return newBuilder();
   }

   public static OpenTebexJsCheckoutResponse.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static OpenTebexJsCheckoutResponse.Builder newBuilder(OpenTebexJsCheckoutResponse var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public OpenTebexJsCheckoutResponse.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new OpenTebexJsCheckoutResponse.Builder() : new OpenTebexJsCheckoutResponse.Builder().mergeFrom(this);
   }

   protected OpenTebexJsCheckoutResponse.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new OpenTebexJsCheckoutResponse.Builder(var1);
   }

   public static OpenTebexJsCheckoutResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<OpenTebexJsCheckoutResponse> parser() {
      return PARSER;
   }

   @Override
   public Parser<OpenTebexJsCheckoutResponse> getParserForType() {
      return PARSER;
   }

   public OpenTebexJsCheckoutResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<OpenTebexJsCheckoutResponse.Builder> implements OpenTebexJsCheckoutResponseOrBuilder {
      private int bitField0_;
      private int status_ = 0;
      private boolean openMinecraftScreen_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_gameipc_tebex_v1_OpenTebexJsCheckoutResponse_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_gameipc_tebex_v1_OpenTebexJsCheckoutResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(OpenTebexJsCheckoutResponse.class, OpenTebexJsCheckoutResponse.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public OpenTebexJsCheckoutResponse.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.status_ = 0;
         this.openMinecraftScreen_ = false;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_gameipc_tebex_v1_OpenTebexJsCheckoutResponse_descriptor;
      }

      public OpenTebexJsCheckoutResponse getDefaultInstanceForType() {
         return OpenTebexJsCheckoutResponse.getDefaultInstance();
      }

      public OpenTebexJsCheckoutResponse build() {
         OpenTebexJsCheckoutResponse var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public OpenTebexJsCheckoutResponse buildPartial() {
         OpenTebexJsCheckoutResponse var1 = new OpenTebexJsCheckoutResponse(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(OpenTebexJsCheckoutResponse var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.status_ = this.status_;
         }

         if ((var2 & 2) != 0) {
            var1.openMinecraftScreen_ = this.openMinecraftScreen_;
         }
      }

      public OpenTebexJsCheckoutResponse.Builder clone() {
         return (OpenTebexJsCheckoutResponse.Builder)super.clone();
      }

      public OpenTebexJsCheckoutResponse.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (OpenTebexJsCheckoutResponse.Builder)super.setField(var1, var2);
      }

      public OpenTebexJsCheckoutResponse.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (OpenTebexJsCheckoutResponse.Builder)super.clearField(var1);
      }

      public OpenTebexJsCheckoutResponse.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (OpenTebexJsCheckoutResponse.Builder)super.clearOneof(var1);
      }

      public OpenTebexJsCheckoutResponse.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (OpenTebexJsCheckoutResponse.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public OpenTebexJsCheckoutResponse.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (OpenTebexJsCheckoutResponse.Builder)super.addRepeatedField(var1, var2);
      }

      public OpenTebexJsCheckoutResponse.Builder mergeFrom(Message var1) {
         if (var1 instanceof OpenTebexJsCheckoutResponse) {
            return this.mergeFrom((OpenTebexJsCheckoutResponse)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public OpenTebexJsCheckoutResponse.Builder mergeFrom(OpenTebexJsCheckoutResponse var1) {
         if (var1 == OpenTebexJsCheckoutResponse.getDefaultInstance()) {
            return this;
         }

         if (var1.status_ != 0) {
            this.setStatusValue(var1.getStatusValue());
         }

         if (var1.getOpenMinecraftScreen()) {
            this.setOpenMinecraftScreen(var1.getOpenMinecraftScreen());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public OpenTebexJsCheckoutResponse.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                  case 16:
                     this.openMinecraftScreen_ = var1.readBool();
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

      public OpenTebexJsCheckoutResponse.Builder setStatusValue(int var1) {
         this.status_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public OpenTebexJsCheckoutResponse.Status getStatus() {
         OpenTebexJsCheckoutResponse.Status var1 = OpenTebexJsCheckoutResponse.Status.forNumber(this.status_);
         return var1 == null ? OpenTebexJsCheckoutResponse.Status.UNRECOGNIZED : var1;
      }

      public OpenTebexJsCheckoutResponse.Builder setStatus(OpenTebexJsCheckoutResponse.Status var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 1;
         this.status_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public OpenTebexJsCheckoutResponse.Builder clearStatus() {
         this.bitField0_ &= -2;
         this.status_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public boolean getOpenMinecraftScreen() {
         return this.openMinecraftScreen_;
      }

      public OpenTebexJsCheckoutResponse.Builder setOpenMinecraftScreen(boolean var1) {
         this.openMinecraftScreen_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public OpenTebexJsCheckoutResponse.Builder clearOpenMinecraftScreen() {
         this.bitField0_ &= -3;
         this.openMinecraftScreen_ = false;
         this.onChanged();
         return this;
      }

      public final OpenTebexJsCheckoutResponse.Builder setUnknownFields(UnknownFieldSet var1) {
         return (OpenTebexJsCheckoutResponse.Builder)super.setUnknownFields(var1);
      }

      public final OpenTebexJsCheckoutResponse.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (OpenTebexJsCheckoutResponse.Builder)super.mergeUnknownFields(var1);
      }
   }

   public enum Status implements ProtocolMessageEnum {
      STATUS_UNSPECIFIED(0),
      STATUS_OK(1),
      STATUS_INTERNAL_ERROR(2),
      STATUS_SERVER_NOT_ALLOWED(3),
      UNRECOGNIZED(-1);

      public static final int STATUS_UNSPECIFIED_VALUE = 0;
      public static final int STATUS_OK_VALUE = 1;
      public static final int STATUS_INTERNAL_ERROR_VALUE = 2;
      public static final int STATUS_SERVER_NOT_ALLOWED_VALUE = 3;
      private static final Internal.EnumLiteMap<OpenTebexJsCheckoutResponse.Status> internalValueMap = new Internal.EnumLiteMap<OpenTebexJsCheckoutResponse.Status>() {
         public OpenTebexJsCheckoutResponse.Status findValueByNumber(int var1) {
            return OpenTebexJsCheckoutResponse.Status.forNumber(var1);
         }
      };
      private static final OpenTebexJsCheckoutResponse.Status[] VALUES = values();
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
      public static OpenTebexJsCheckoutResponse.Status valueOf(int var0) {
         return forNumber(var0);
      }

      public static OpenTebexJsCheckoutResponse.Status forNumber(int var0) {
         switch (var0) {
            case 0:
               return STATUS_UNSPECIFIED;
            case 1:
               return STATUS_OK;
            case 2:
               return STATUS_INTERNAL_ERROR;
            case 3:
               return STATUS_SERVER_NOT_ALLOWED;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<OpenTebexJsCheckoutResponse.Status> internalGetValueMap() {
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
         return OpenTebexJsCheckoutResponse.getDescriptor().getEnumTypes().get(0);
      }

      public static OpenTebexJsCheckoutResponse.Status valueOf(Descriptors.EnumValueDescriptor var0) {
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
