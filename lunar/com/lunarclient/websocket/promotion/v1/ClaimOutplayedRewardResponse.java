package com.lunarclient.websocket.promotion.v1;

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

public final class ClaimOutplayedRewardResponse extends GeneratedMessageV3 implements ClaimOutplayedRewardResponseOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int RESULT_FIELD_NUMBER = 1;
   private int result_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final ClaimOutplayedRewardResponse DEFAULT_INSTANCE = new ClaimOutplayedRewardResponse();
   private static final Parser<ClaimOutplayedRewardResponse> PARSER = new AbstractParser<ClaimOutplayedRewardResponse>() {
      public ClaimOutplayedRewardResponse parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         ClaimOutplayedRewardResponse.Builder var3 = ClaimOutplayedRewardResponse.newBuilder();

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

   private ClaimOutplayedRewardResponse(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private ClaimOutplayedRewardResponse() {
      this.result_ = 0;
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new ClaimOutplayedRewardResponse();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_promotion_v1_ClaimOutplayedRewardResponse_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_promotion_v1_ClaimOutplayedRewardResponse_fieldAccessorTable
         .ensureFieldAccessorsInitialized(ClaimOutplayedRewardResponse.class, ClaimOutplayedRewardResponse.Builder.class);
   }

   @Override
   public int getResultValue() {
      return this.result_;
   }

   @Override
   public ClaimOutplayedRewardResponse.Result getResult() {
      ClaimOutplayedRewardResponse.Result var1 = ClaimOutplayedRewardResponse.Result.forNumber(this.result_);
      return var1 == null ? ClaimOutplayedRewardResponse.Result.UNRECOGNIZED : var1;
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
      if (this.result_ != ClaimOutplayedRewardResponse.Result.RESULT_UNSPECIFIED.getNumber()) {
         var1.writeEnum(1, this.result_);
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
      if (this.result_ != ClaimOutplayedRewardResponse.Result.RESULT_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(1, this.result_);
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

      if (!(var1 instanceof ClaimOutplayedRewardResponse)) {
         return super.equals(var1);
      }

      ClaimOutplayedRewardResponse var2 = (ClaimOutplayedRewardResponse)var1;
      return this.result_ != var2.result_ ? false : this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      var1 = 37 * var1 + 1;
      var1 = 53 * var1 + this.result_;
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static ClaimOutplayedRewardResponse parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static ClaimOutplayedRewardResponse parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ClaimOutplayedRewardResponse parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static ClaimOutplayedRewardResponse parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ClaimOutplayedRewardResponse parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static ClaimOutplayedRewardResponse parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ClaimOutplayedRewardResponse parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ClaimOutplayedRewardResponse parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ClaimOutplayedRewardResponse parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ClaimOutplayedRewardResponse parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ClaimOutplayedRewardResponse parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ClaimOutplayedRewardResponse parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public ClaimOutplayedRewardResponse.Builder newBuilderForType() {
      return newBuilder();
   }

   public static ClaimOutplayedRewardResponse.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ClaimOutplayedRewardResponse.Builder newBuilder(ClaimOutplayedRewardResponse var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public ClaimOutplayedRewardResponse.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new ClaimOutplayedRewardResponse.Builder() : new ClaimOutplayedRewardResponse.Builder().mergeFrom(this);
   }

   protected ClaimOutplayedRewardResponse.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new ClaimOutplayedRewardResponse.Builder(var1);
   }

   public static ClaimOutplayedRewardResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<ClaimOutplayedRewardResponse> parser() {
      return PARSER;
   }

   @Override
   public Parser<ClaimOutplayedRewardResponse> getParserForType() {
      return PARSER;
   }

   public ClaimOutplayedRewardResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<ClaimOutplayedRewardResponse.Builder> implements ClaimOutplayedRewardResponseOrBuilder {
      private int bitField0_;
      private int result_ = 0;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_promotion_v1_ClaimOutplayedRewardResponse_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_promotion_v1_ClaimOutplayedRewardResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ClaimOutplayedRewardResponse.class, ClaimOutplayedRewardResponse.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public ClaimOutplayedRewardResponse.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.result_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_promotion_v1_ClaimOutplayedRewardResponse_descriptor;
      }

      public ClaimOutplayedRewardResponse getDefaultInstanceForType() {
         return ClaimOutplayedRewardResponse.getDefaultInstance();
      }

      public ClaimOutplayedRewardResponse build() {
         ClaimOutplayedRewardResponse var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public ClaimOutplayedRewardResponse buildPartial() {
         ClaimOutplayedRewardResponse var1 = new ClaimOutplayedRewardResponse(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(ClaimOutplayedRewardResponse var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.result_ = this.result_;
         }
      }

      public ClaimOutplayedRewardResponse.Builder clone() {
         return (ClaimOutplayedRewardResponse.Builder)super.clone();
      }

      public ClaimOutplayedRewardResponse.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ClaimOutplayedRewardResponse.Builder)super.setField(var1, var2);
      }

      public ClaimOutplayedRewardResponse.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (ClaimOutplayedRewardResponse.Builder)super.clearField(var1);
      }

      public ClaimOutplayedRewardResponse.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (ClaimOutplayedRewardResponse.Builder)super.clearOneof(var1);
      }

      public ClaimOutplayedRewardResponse.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (ClaimOutplayedRewardResponse.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public ClaimOutplayedRewardResponse.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ClaimOutplayedRewardResponse.Builder)super.addRepeatedField(var1, var2);
      }

      public ClaimOutplayedRewardResponse.Builder mergeFrom(Message var1) {
         if (var1 instanceof ClaimOutplayedRewardResponse) {
            return this.mergeFrom((ClaimOutplayedRewardResponse)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public ClaimOutplayedRewardResponse.Builder mergeFrom(ClaimOutplayedRewardResponse var1) {
         if (var1 == ClaimOutplayedRewardResponse.getDefaultInstance()) {
            return this;
         }

         if (var1.result_ != 0) {
            this.setResultValue(var1.getResultValue());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public ClaimOutplayedRewardResponse.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.result_ = var1.readEnum();
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
      public int getResultValue() {
         return this.result_;
      }

      public ClaimOutplayedRewardResponse.Builder setResultValue(int var1) {
         this.result_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public ClaimOutplayedRewardResponse.Result getResult() {
         ClaimOutplayedRewardResponse.Result var1 = ClaimOutplayedRewardResponse.Result.forNumber(this.result_);
         return var1 == null ? ClaimOutplayedRewardResponse.Result.UNRECOGNIZED : var1;
      }

      public ClaimOutplayedRewardResponse.Builder setResult(ClaimOutplayedRewardResponse.Result var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 1;
         this.result_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public ClaimOutplayedRewardResponse.Builder clearResult() {
         this.bitField0_ &= -2;
         this.result_ = 0;
         this.onChanged();
         return this;
      }

      public final ClaimOutplayedRewardResponse.Builder setUnknownFields(UnknownFieldSet var1) {
         return (ClaimOutplayedRewardResponse.Builder)super.setUnknownFields(var1);
      }

      public final ClaimOutplayedRewardResponse.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (ClaimOutplayedRewardResponse.Builder)super.mergeUnknownFields(var1);
      }
   }

   public enum Result implements ProtocolMessageEnum {
      RESULT_UNSPECIFIED(0),
      RESULT_SUCCESS(1),
      RESULT_PLAYER_ALREADY_CLAIMED(2),
      RESULT_OUTPLAYED_INSTALL_ALREADY_CLAIMED(3),
      RESULT_NOT_WINDOWS(4),
      RESULT_OUTPLAYED_NOT_INSTALLED(5),
      UNRECOGNIZED(-1);

      public static final int RESULT_UNSPECIFIED_VALUE = 0;
      public static final int RESULT_SUCCESS_VALUE = 1;
      public static final int RESULT_PLAYER_ALREADY_CLAIMED_VALUE = 2;
      public static final int RESULT_OUTPLAYED_INSTALL_ALREADY_CLAIMED_VALUE = 3;
      public static final int RESULT_NOT_WINDOWS_VALUE = 4;
      public static final int RESULT_OUTPLAYED_NOT_INSTALLED_VALUE = 5;
      private static final Internal.EnumLiteMap<ClaimOutplayedRewardResponse.Result> internalValueMap = new Internal.EnumLiteMap<ClaimOutplayedRewardResponse.Result>() {
         public ClaimOutplayedRewardResponse.Result findValueByNumber(int var1) {
            return ClaimOutplayedRewardResponse.Result.forNumber(var1);
         }
      };
      private static final ClaimOutplayedRewardResponse.Result[] VALUES = values();
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
      public static ClaimOutplayedRewardResponse.Result valueOf(int var0) {
         return forNumber(var0);
      }

      public static ClaimOutplayedRewardResponse.Result forNumber(int var0) {
         switch (var0) {
            case 0:
               return RESULT_UNSPECIFIED;
            case 1:
               return RESULT_SUCCESS;
            case 2:
               return RESULT_PLAYER_ALREADY_CLAIMED;
            case 3:
               return RESULT_OUTPLAYED_INSTALL_ALREADY_CLAIMED;
            case 4:
               return RESULT_NOT_WINDOWS;
            case 5:
               return RESULT_OUTPLAYED_NOT_INSTALLED;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<ClaimOutplayedRewardResponse.Result> internalGetValueMap() {
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
         return ClaimOutplayedRewardResponse.getDescriptor().getEnumTypes().get(0);
      }

      public static ClaimOutplayedRewardResponse.Result valueOf(Descriptors.EnumValueDescriptor var0) {
         if (var0.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
         }
      }

      Result(int var3) {
         this.value = var3;
      }
   }
}
