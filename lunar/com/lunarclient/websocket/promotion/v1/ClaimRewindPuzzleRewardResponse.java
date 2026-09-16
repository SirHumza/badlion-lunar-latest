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

public final class ClaimRewindPuzzleRewardResponse extends GeneratedMessageV3 implements ClaimRewindPuzzleRewardResponseOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int RESULT_FIELD_NUMBER = 1;
   private int result_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final ClaimRewindPuzzleRewardResponse DEFAULT_INSTANCE = new ClaimRewindPuzzleRewardResponse();
   private static final Parser<ClaimRewindPuzzleRewardResponse> PARSER = new AbstractParser<ClaimRewindPuzzleRewardResponse>() {
      public ClaimRewindPuzzleRewardResponse parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         ClaimRewindPuzzleRewardResponse.Builder var3 = ClaimRewindPuzzleRewardResponse.newBuilder();

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

   private ClaimRewindPuzzleRewardResponse(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private ClaimRewindPuzzleRewardResponse() {
      this.result_ = 0;
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new ClaimRewindPuzzleRewardResponse();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_promotion_v1_ClaimRewindPuzzleRewardResponse_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_promotion_v1_ClaimRewindPuzzleRewardResponse_fieldAccessorTable
         .ensureFieldAccessorsInitialized(ClaimRewindPuzzleRewardResponse.class, ClaimRewindPuzzleRewardResponse.Builder.class);
   }

   @Override
   public int getResultValue() {
      return this.result_;
   }

   @Override
   public ClaimRewindPuzzleRewardResponse.Result getResult() {
      ClaimRewindPuzzleRewardResponse.Result var1 = ClaimRewindPuzzleRewardResponse.Result.forNumber(this.result_);
      return var1 == null ? ClaimRewindPuzzleRewardResponse.Result.UNRECOGNIZED : var1;
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
      if (this.result_ != ClaimRewindPuzzleRewardResponse.Result.RESULT_UNSPECIFIED.getNumber()) {
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
      if (this.result_ != ClaimRewindPuzzleRewardResponse.Result.RESULT_UNSPECIFIED.getNumber()) {
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

      if (!(var1 instanceof ClaimRewindPuzzleRewardResponse)) {
         return super.equals(var1);
      }

      ClaimRewindPuzzleRewardResponse var2 = (ClaimRewindPuzzleRewardResponse)var1;
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

   public static ClaimRewindPuzzleRewardResponse parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static ClaimRewindPuzzleRewardResponse parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ClaimRewindPuzzleRewardResponse parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static ClaimRewindPuzzleRewardResponse parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ClaimRewindPuzzleRewardResponse parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static ClaimRewindPuzzleRewardResponse parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ClaimRewindPuzzleRewardResponse parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ClaimRewindPuzzleRewardResponse parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ClaimRewindPuzzleRewardResponse parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ClaimRewindPuzzleRewardResponse parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ClaimRewindPuzzleRewardResponse parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ClaimRewindPuzzleRewardResponse parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public ClaimRewindPuzzleRewardResponse.Builder newBuilderForType() {
      return newBuilder();
   }

   public static ClaimRewindPuzzleRewardResponse.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ClaimRewindPuzzleRewardResponse.Builder newBuilder(ClaimRewindPuzzleRewardResponse var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public ClaimRewindPuzzleRewardResponse.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new ClaimRewindPuzzleRewardResponse.Builder() : new ClaimRewindPuzzleRewardResponse.Builder().mergeFrom(this);
   }

   protected ClaimRewindPuzzleRewardResponse.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new ClaimRewindPuzzleRewardResponse.Builder(var1);
   }

   public static ClaimRewindPuzzleRewardResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<ClaimRewindPuzzleRewardResponse> parser() {
      return PARSER;
   }

   @Override
   public Parser<ClaimRewindPuzzleRewardResponse> getParserForType() {
      return PARSER;
   }

   public ClaimRewindPuzzleRewardResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder
      extends GeneratedMessageV3.Builder<ClaimRewindPuzzleRewardResponse.Builder>
      implements ClaimRewindPuzzleRewardResponseOrBuilder {
      private int bitField0_;
      private int result_ = 0;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_promotion_v1_ClaimRewindPuzzleRewardResponse_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_promotion_v1_ClaimRewindPuzzleRewardResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ClaimRewindPuzzleRewardResponse.class, ClaimRewindPuzzleRewardResponse.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public ClaimRewindPuzzleRewardResponse.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.result_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_promotion_v1_ClaimRewindPuzzleRewardResponse_descriptor;
      }

      public ClaimRewindPuzzleRewardResponse getDefaultInstanceForType() {
         return ClaimRewindPuzzleRewardResponse.getDefaultInstance();
      }

      public ClaimRewindPuzzleRewardResponse build() {
         ClaimRewindPuzzleRewardResponse var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public ClaimRewindPuzzleRewardResponse buildPartial() {
         ClaimRewindPuzzleRewardResponse var1 = new ClaimRewindPuzzleRewardResponse(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(ClaimRewindPuzzleRewardResponse var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.result_ = this.result_;
         }
      }

      public ClaimRewindPuzzleRewardResponse.Builder clone() {
         return (ClaimRewindPuzzleRewardResponse.Builder)super.clone();
      }

      public ClaimRewindPuzzleRewardResponse.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ClaimRewindPuzzleRewardResponse.Builder)super.setField(var1, var2);
      }

      public ClaimRewindPuzzleRewardResponse.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (ClaimRewindPuzzleRewardResponse.Builder)super.clearField(var1);
      }

      public ClaimRewindPuzzleRewardResponse.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (ClaimRewindPuzzleRewardResponse.Builder)super.clearOneof(var1);
      }

      public ClaimRewindPuzzleRewardResponse.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (ClaimRewindPuzzleRewardResponse.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public ClaimRewindPuzzleRewardResponse.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ClaimRewindPuzzleRewardResponse.Builder)super.addRepeatedField(var1, var2);
      }

      public ClaimRewindPuzzleRewardResponse.Builder mergeFrom(Message var1) {
         if (var1 instanceof ClaimRewindPuzzleRewardResponse) {
            return this.mergeFrom((ClaimRewindPuzzleRewardResponse)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public ClaimRewindPuzzleRewardResponse.Builder mergeFrom(ClaimRewindPuzzleRewardResponse var1) {
         if (var1 == ClaimRewindPuzzleRewardResponse.getDefaultInstance()) {
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

      public ClaimRewindPuzzleRewardResponse.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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

      public ClaimRewindPuzzleRewardResponse.Builder setResultValue(int var1) {
         this.result_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public ClaimRewindPuzzleRewardResponse.Result getResult() {
         ClaimRewindPuzzleRewardResponse.Result var1 = ClaimRewindPuzzleRewardResponse.Result.forNumber(this.result_);
         return var1 == null ? ClaimRewindPuzzleRewardResponse.Result.UNRECOGNIZED : var1;
      }

      public ClaimRewindPuzzleRewardResponse.Builder setResult(ClaimRewindPuzzleRewardResponse.Result var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 1;
         this.result_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public ClaimRewindPuzzleRewardResponse.Builder clearResult() {
         this.bitField0_ &= -2;
         this.result_ = 0;
         this.onChanged();
         return this;
      }

      public final ClaimRewindPuzzleRewardResponse.Builder setUnknownFields(UnknownFieldSet var1) {
         return (ClaimRewindPuzzleRewardResponse.Builder)super.setUnknownFields(var1);
      }

      public final ClaimRewindPuzzleRewardResponse.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (ClaimRewindPuzzleRewardResponse.Builder)super.mergeUnknownFields(var1);
      }
   }

   public enum Result implements ProtocolMessageEnum {
      RESULT_UNSPECIFIED(0),
      RESULT_SUCCESS(1),
      RESULT_INCORRECT_SOLUTION(2),
      RESULT_PLAYER_ALREADY_CLAIMED(3),
      RESULT_MAX_REWARDS_EXCEEDED(4),
      UNRECOGNIZED(-1);

      public static final int RESULT_UNSPECIFIED_VALUE = 0;
      public static final int RESULT_SUCCESS_VALUE = 1;
      public static final int RESULT_INCORRECT_SOLUTION_VALUE = 2;
      public static final int RESULT_PLAYER_ALREADY_CLAIMED_VALUE = 3;
      public static final int RESULT_MAX_REWARDS_EXCEEDED_VALUE = 4;
      private static final Internal.EnumLiteMap<ClaimRewindPuzzleRewardResponse.Result> internalValueMap = new Internal.EnumLiteMap<ClaimRewindPuzzleRewardResponse.Result>() {
         public ClaimRewindPuzzleRewardResponse.Result findValueByNumber(int var1) {
            return ClaimRewindPuzzleRewardResponse.Result.forNumber(var1);
         }
      };
      private static final ClaimRewindPuzzleRewardResponse.Result[] VALUES = values();
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
      public static ClaimRewindPuzzleRewardResponse.Result valueOf(int var0) {
         return forNumber(var0);
      }

      public static ClaimRewindPuzzleRewardResponse.Result forNumber(int var0) {
         switch (var0) {
            case 0:
               return RESULT_UNSPECIFIED;
            case 1:
               return RESULT_SUCCESS;
            case 2:
               return RESULT_INCORRECT_SOLUTION;
            case 3:
               return RESULT_PLAYER_ALREADY_CLAIMED;
            case 4:
               return RESULT_MAX_REWARDS_EXCEEDED;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<ClaimRewindPuzzleRewardResponse.Result> internalGetValueMap() {
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
         return ClaimRewindPuzzleRewardResponse.getDescriptor().getEnumTypes().get(0);
      }

      public static ClaimRewindPuzzleRewardResponse.Result valueOf(Descriptors.EnumValueDescriptor var0) {
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
