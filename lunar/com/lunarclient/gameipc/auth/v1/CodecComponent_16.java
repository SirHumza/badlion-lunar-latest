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

public final class RefreshAccountResponse extends GeneratedMessageV3 implements RefreshAccountResponseOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int SUCCESS_FIELD_NUMBER = 1;
   private boolean success_ = false;
   public static final int ERROR_FIELD_NUMBER = 2;
   private int error_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final RefreshAccountResponse DEFAULT_INSTANCE = new RefreshAccountResponse();
   private static final Parser<RefreshAccountResponse> PARSER = new AbstractParser<RefreshAccountResponse>() {
      public RefreshAccountResponse parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         RefreshAccountResponse.Builder var3 = RefreshAccountResponse.newBuilder();

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

   private RefreshAccountResponse(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private RefreshAccountResponse() {
      this.error_ = 0;
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new RefreshAccountResponse();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_gameipc_auth_v1_RefreshAccountResponse_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_gameipc_auth_v1_RefreshAccountResponse_fieldAccessorTable
         .ensureFieldAccessorsInitialized(RefreshAccountResponse.class, RefreshAccountResponse.Builder.class);
   }

   @Override
   public boolean getSuccess() {
      return this.success_;
   }

   @Override
   public int getErrorValue() {
      return this.error_;
   }

   @Override
   public RefreshAccountResponse.AccountError getError() {
      RefreshAccountResponse.AccountError var1 = RefreshAccountResponse.AccountError.forNumber(this.error_);
      return var1 == null ? RefreshAccountResponse.AccountError.UNRECOGNIZED : var1;
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
      if (this.success_) {
         var1.writeBool(1, this.success_);
      }

      if (this.error_ != RefreshAccountResponse.AccountError.ACCOUNT_ERROR_UNSPECIFIED.getNumber()) {
         var1.writeEnum(2, this.error_);
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
      if (this.success_) {
         var1 += CodedOutputStream.computeBoolSize(1, this.success_);
      }

      if (this.error_ != RefreshAccountResponse.AccountError.ACCOUNT_ERROR_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(2, this.error_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof RefreshAccountResponse)) {
         return super.equals(var1);
      } else {
         RefreshAccountResponse var2 = (RefreshAccountResponse)var1;
         if (this.getSuccess() != var2.getSuccess()) {
            return false;
         } else {
            return this.error_ != var2.error_ ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + Internal.hashBoolean(this.getSuccess());
      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.error_;
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static RefreshAccountResponse parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static RefreshAccountResponse parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RefreshAccountResponse parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static RefreshAccountResponse parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RefreshAccountResponse parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static RefreshAccountResponse parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static RefreshAccountResponse parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RefreshAccountResponse parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static RefreshAccountResponse parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static RefreshAccountResponse parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static RefreshAccountResponse parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static RefreshAccountResponse parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public RefreshAccountResponse.Builder newBuilderForType() {
      return newBuilder();
   }

   public static RefreshAccountResponse.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static RefreshAccountResponse.Builder newBuilder(RefreshAccountResponse var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public RefreshAccountResponse.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new RefreshAccountResponse.Builder() : new RefreshAccountResponse.Builder().mergeFrom(this);
   }

   protected RefreshAccountResponse.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new RefreshAccountResponse.Builder(var1);
   }

   public static RefreshAccountResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<RefreshAccountResponse> parser() {
      return PARSER;
   }

   @Override
   public Parser<RefreshAccountResponse> getParserForType() {
      return PARSER;
   }

   public RefreshAccountResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public enum AccountError implements ProtocolMessageEnum {
      ACCOUNT_ERROR_UNSPECIFIED(0),
      ACCOUNT_ERROR_ACCOUNTS_FILE_EMPTY(1),
      ACCOUNT_ERROR_NOT_PURCHASED_MINECRAFT(2),
      ACCOUNT_ERROR_MISSING_REFRESH_TOKEN(3),
      ACCOUNT_ERROR_ALREADY_REFRESHING(4),
      UNRECOGNIZED(-1);

      public static final int ACCOUNT_ERROR_UNSPECIFIED_VALUE = 0;
      public static final int ACCOUNT_ERROR_ACCOUNTS_FILE_EMPTY_VALUE = 1;
      public static final int ACCOUNT_ERROR_NOT_PURCHASED_MINECRAFT_VALUE = 2;
      public static final int ACCOUNT_ERROR_MISSING_REFRESH_TOKEN_VALUE = 3;
      public static final int ACCOUNT_ERROR_ALREADY_REFRESHING_VALUE = 4;
      private static final Internal.EnumLiteMap<RefreshAccountResponse.AccountError> internalValueMap = new Internal.EnumLiteMap<RefreshAccountResponse.AccountError>() {
         public RefreshAccountResponse.AccountError findValueByNumber(int var1) {
            return RefreshAccountResponse.AccountError.forNumber(var1);
         }
      };
      private static final RefreshAccountResponse.AccountError[] VALUES = values();
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
      public static RefreshAccountResponse.AccountError valueOf(int var0) {
         return forNumber(var0);
      }

      public static RefreshAccountResponse.AccountError forNumber(int var0) {
         switch (var0) {
            case 0:
               return ACCOUNT_ERROR_UNSPECIFIED;
            case 1:
               return ACCOUNT_ERROR_ACCOUNTS_FILE_EMPTY;
            case 2:
               return ACCOUNT_ERROR_NOT_PURCHASED_MINECRAFT;
            case 3:
               return ACCOUNT_ERROR_MISSING_REFRESH_TOKEN;
            case 4:
               return ACCOUNT_ERROR_ALREADY_REFRESHING;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<RefreshAccountResponse.AccountError> internalGetValueMap() {
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
         return RefreshAccountResponse.getDescriptor().getEnumTypes().get(0);
      }

      public static RefreshAccountResponse.AccountError valueOf(Descriptors.EnumValueDescriptor var0) {
         if (var0.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
         }
      }

      AccountError(int var3) {
         this.value = var3;
      }
   }

   public static final class Builder extends GeneratedMessageV3.Builder<RefreshAccountResponse.Builder> implements RefreshAccountResponseOrBuilder {
      private int bitField0_;
      private boolean success_;
      private int error_ = 0;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_gameipc_auth_v1_RefreshAccountResponse_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_gameipc_auth_v1_RefreshAccountResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(RefreshAccountResponse.class, RefreshAccountResponse.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public RefreshAccountResponse.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.success_ = false;
         this.error_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_gameipc_auth_v1_RefreshAccountResponse_descriptor;
      }

      public RefreshAccountResponse getDefaultInstanceForType() {
         return RefreshAccountResponse.getDefaultInstance();
      }

      public RefreshAccountResponse build() {
         RefreshAccountResponse var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public RefreshAccountResponse buildPartial() {
         RefreshAccountResponse var1 = new RefreshAccountResponse(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(RefreshAccountResponse var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.success_ = this.success_;
         }

         if ((var2 & 2) != 0) {
            var1.error_ = this.error_;
         }
      }

      public RefreshAccountResponse.Builder clone() {
         return (RefreshAccountResponse.Builder)super.clone();
      }

      public RefreshAccountResponse.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (RefreshAccountResponse.Builder)super.setField(var1, var2);
      }

      public RefreshAccountResponse.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (RefreshAccountResponse.Builder)super.clearField(var1);
      }

      public RefreshAccountResponse.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (RefreshAccountResponse.Builder)super.clearOneof(var1);
      }

      public RefreshAccountResponse.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (RefreshAccountResponse.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public RefreshAccountResponse.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (RefreshAccountResponse.Builder)super.addRepeatedField(var1, var2);
      }

      public RefreshAccountResponse.Builder mergeFrom(Message var1) {
         if (var1 instanceof RefreshAccountResponse) {
            return this.mergeFrom((RefreshAccountResponse)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public RefreshAccountResponse.Builder mergeFrom(RefreshAccountResponse var1) {
         if (var1 == RefreshAccountResponse.getDefaultInstance()) {
            return this;
         }

         if (var1.getSuccess()) {
            this.setSuccess(var1.getSuccess());
         }

         if (var1.error_ != 0) {
            this.setErrorValue(var1.getErrorValue());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public RefreshAccountResponse.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.success_ = var1.readBool();
                     this.bitField0_ |= 1;
                     break;
                  case 16:
                     this.error_ = var1.readEnum();
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
      public boolean getSuccess() {
         return this.success_;
      }

      public RefreshAccountResponse.Builder setSuccess(boolean var1) {
         this.success_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public RefreshAccountResponse.Builder clearSuccess() {
         this.bitField0_ &= -2;
         this.success_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public int getErrorValue() {
         return this.error_;
      }

      public RefreshAccountResponse.Builder setErrorValue(int var1) {
         this.error_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      @Override
      public RefreshAccountResponse.AccountError getError() {
         RefreshAccountResponse.AccountError var1 = RefreshAccountResponse.AccountError.forNumber(this.error_);
         return var1 == null ? RefreshAccountResponse.AccountError.UNRECOGNIZED : var1;
      }

      public RefreshAccountResponse.Builder setError(RefreshAccountResponse.AccountError var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 2;
         this.error_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public RefreshAccountResponse.Builder clearError() {
         this.bitField0_ &= -3;
         this.error_ = 0;
         this.onChanged();
         return this;
      }

      public final RefreshAccountResponse.Builder setUnknownFields(UnknownFieldSet var1) {
         return (RefreshAccountResponse.Builder)super.setUnknownFields(var1);
      }

      public final RefreshAccountResponse.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (RefreshAccountResponse.Builder)super.mergeUnknownFields(var1);
      }
   }
}
