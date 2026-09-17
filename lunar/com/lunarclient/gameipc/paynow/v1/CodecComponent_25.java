package com.lunarclient.gameipc.paynow.v1;

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

public final class CheckPayNowCapabilitiesResponse extends GeneratedMessageV3 implements CheckPayNowCapabilitiesResponseOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int EMBEDDED_CHECKOUT_FIELD_NUMBER = 1;
   private int embeddedCheckout_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final CheckPayNowCapabilitiesResponse DEFAULT_INSTANCE = new CheckPayNowCapabilitiesResponse();
   private static final Parser<CheckPayNowCapabilitiesResponse> PARSER = new AbstractParser<CheckPayNowCapabilitiesResponse>() {
      public CheckPayNowCapabilitiesResponse parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         CheckPayNowCapabilitiesResponse.Builder var3 = CheckPayNowCapabilitiesResponse.newBuilder();

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

   private CheckPayNowCapabilitiesResponse(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private CheckPayNowCapabilitiesResponse() {
      this.embeddedCheckout_ = 0;
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new CheckPayNowCapabilitiesResponse();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_gameipc_paynow_v1_CheckPayNowCapabilitiesResponse_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_gameipc_paynow_v1_CheckPayNowCapabilitiesResponse_fieldAccessorTable
         .ensureFieldAccessorsInitialized(CheckPayNowCapabilitiesResponse.class, CheckPayNowCapabilitiesResponse.Builder.class);
   }

   @Override
   public int getEmbeddedCheckoutValue() {
      return this.embeddedCheckout_;
   }

   @Override
   public CheckPayNowCapabilitiesResponse.EmbeddedCheckout getEmbeddedCheckout() {
      CheckPayNowCapabilitiesResponse.EmbeddedCheckout var1 = CheckPayNowCapabilitiesResponse.EmbeddedCheckout.forNumber(this.embeddedCheckout_);
      return var1 == null ? CheckPayNowCapabilitiesResponse.EmbeddedCheckout.UNRECOGNIZED : var1;
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
      if (this.embeddedCheckout_ != CheckPayNowCapabilitiesResponse.EmbeddedCheckout.EMBEDDED_CHECKOUT_UNSPECIFIED.getNumber()) {
         var1.writeEnum(1, this.embeddedCheckout_);
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
      if (this.embeddedCheckout_ != CheckPayNowCapabilitiesResponse.EmbeddedCheckout.EMBEDDED_CHECKOUT_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(1, this.embeddedCheckout_);
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

      if (!(var1 instanceof CheckPayNowCapabilitiesResponse)) {
         return super.equals(var1);
      }

      CheckPayNowCapabilitiesResponse var2 = (CheckPayNowCapabilitiesResponse)var1;
      return this.embeddedCheckout_ != var2.embeddedCheckout_ ? false : this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      var1 = 37 * var1 + 1;
      var1 = 53 * var1 + this.embeddedCheckout_;
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static CheckPayNowCapabilitiesResponse parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static CheckPayNowCapabilitiesResponse parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static CheckPayNowCapabilitiesResponse parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static CheckPayNowCapabilitiesResponse parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static CheckPayNowCapabilitiesResponse parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static CheckPayNowCapabilitiesResponse parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static CheckPayNowCapabilitiesResponse parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static CheckPayNowCapabilitiesResponse parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static CheckPayNowCapabilitiesResponse parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static CheckPayNowCapabilitiesResponse parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static CheckPayNowCapabilitiesResponse parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static CheckPayNowCapabilitiesResponse parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public CheckPayNowCapabilitiesResponse.Builder newBuilderForType() {
      return newBuilder();
   }

   public static CheckPayNowCapabilitiesResponse.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static CheckPayNowCapabilitiesResponse.Builder newBuilder(CheckPayNowCapabilitiesResponse var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public CheckPayNowCapabilitiesResponse.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new CheckPayNowCapabilitiesResponse.Builder() : new CheckPayNowCapabilitiesResponse.Builder().mergeFrom(this);
   }

   protected CheckPayNowCapabilitiesResponse.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new CheckPayNowCapabilitiesResponse.Builder(var1);
   }

   public static CheckPayNowCapabilitiesResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<CheckPayNowCapabilitiesResponse> parser() {
      return PARSER;
   }

   @Override
   public Parser<CheckPayNowCapabilitiesResponse> getParserForType() {
      return PARSER;
   }

   public CheckPayNowCapabilitiesResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder
      extends GeneratedMessageV3.Builder<CheckPayNowCapabilitiesResponse.Builder>
      implements CheckPayNowCapabilitiesResponseOrBuilder {
      private int bitField0_;
      private int embeddedCheckout_ = 0;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_gameipc_paynow_v1_CheckPayNowCapabilitiesResponse_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_gameipc_paynow_v1_CheckPayNowCapabilitiesResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(CheckPayNowCapabilitiesResponse.class, CheckPayNowCapabilitiesResponse.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public CheckPayNowCapabilitiesResponse.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.embeddedCheckout_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_gameipc_paynow_v1_CheckPayNowCapabilitiesResponse_descriptor;
      }

      public CheckPayNowCapabilitiesResponse getDefaultInstanceForType() {
         return CheckPayNowCapabilitiesResponse.getDefaultInstance();
      }

      public CheckPayNowCapabilitiesResponse build() {
         CheckPayNowCapabilitiesResponse var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public CheckPayNowCapabilitiesResponse buildPartial() {
         CheckPayNowCapabilitiesResponse var1 = new CheckPayNowCapabilitiesResponse(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(CheckPayNowCapabilitiesResponse var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.embeddedCheckout_ = this.embeddedCheckout_;
         }
      }

      public CheckPayNowCapabilitiesResponse.Builder clone() {
         return (CheckPayNowCapabilitiesResponse.Builder)super.clone();
      }

      public CheckPayNowCapabilitiesResponse.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (CheckPayNowCapabilitiesResponse.Builder)super.setField(var1, var2);
      }

      public CheckPayNowCapabilitiesResponse.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (CheckPayNowCapabilitiesResponse.Builder)super.clearField(var1);
      }

      public CheckPayNowCapabilitiesResponse.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (CheckPayNowCapabilitiesResponse.Builder)super.clearOneof(var1);
      }

      public CheckPayNowCapabilitiesResponse.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (CheckPayNowCapabilitiesResponse.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public CheckPayNowCapabilitiesResponse.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (CheckPayNowCapabilitiesResponse.Builder)super.addRepeatedField(var1, var2);
      }

      public CheckPayNowCapabilitiesResponse.Builder mergeFrom(Message var1) {
         if (var1 instanceof CheckPayNowCapabilitiesResponse) {
            return this.mergeFrom((CheckPayNowCapabilitiesResponse)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public CheckPayNowCapabilitiesResponse.Builder mergeFrom(CheckPayNowCapabilitiesResponse var1) {
         if (var1 == CheckPayNowCapabilitiesResponse.getDefaultInstance()) {
            return this;
         }

         if (var1.embeddedCheckout_ != 0) {
            this.setEmbeddedCheckoutValue(var1.getEmbeddedCheckoutValue());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public CheckPayNowCapabilitiesResponse.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.embeddedCheckout_ = var1.readEnum();
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
      public int getEmbeddedCheckoutValue() {
         return this.embeddedCheckout_;
      }

      public CheckPayNowCapabilitiesResponse.Builder setEmbeddedCheckoutValue(int var1) {
         this.embeddedCheckout_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public CheckPayNowCapabilitiesResponse.EmbeddedCheckout getEmbeddedCheckout() {
         CheckPayNowCapabilitiesResponse.EmbeddedCheckout var1 = CheckPayNowCapabilitiesResponse.EmbeddedCheckout.forNumber(this.embeddedCheckout_);
         return var1 == null ? CheckPayNowCapabilitiesResponse.EmbeddedCheckout.UNRECOGNIZED : var1;
      }

      public CheckPayNowCapabilitiesResponse.Builder setEmbeddedCheckout(CheckPayNowCapabilitiesResponse.EmbeddedCheckout var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 1;
         this.embeddedCheckout_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public CheckPayNowCapabilitiesResponse.Builder clearEmbeddedCheckout() {
         this.bitField0_ &= -2;
         this.embeddedCheckout_ = 0;
         this.onChanged();
         return this;
      }

      public final CheckPayNowCapabilitiesResponse.Builder setUnknownFields(UnknownFieldSet var1) {
         return (CheckPayNowCapabilitiesResponse.Builder)super.setUnknownFields(var1);
      }

      public final CheckPayNowCapabilitiesResponse.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (CheckPayNowCapabilitiesResponse.Builder)super.mergeUnknownFields(var1);
      }
   }

   public enum EmbeddedCheckout implements ProtocolMessageEnum {
      EMBEDDED_CHECKOUT_UNSPECIFIED(0),
      EMBEDDED_CHECKOUT_OVERWOLF_OVERLAY(1),
      EMBEDDED_CHECKOUT_ELECTRON_WINDOW(2),
      UNRECOGNIZED(-1);

      public static final int EMBEDDED_CHECKOUT_UNSPECIFIED_VALUE = 0;
      public static final int EMBEDDED_CHECKOUT_OVERWOLF_OVERLAY_VALUE = 1;
      public static final int EMBEDDED_CHECKOUT_ELECTRON_WINDOW_VALUE = 2;
      private static final Internal.EnumLiteMap<CheckPayNowCapabilitiesResponse.EmbeddedCheckout> internalValueMap = new Internal.EnumLiteMap<CheckPayNowCapabilitiesResponse.EmbeddedCheckout>() {
         public CheckPayNowCapabilitiesResponse.EmbeddedCheckout findValueByNumber(int var1) {
            return CheckPayNowCapabilitiesResponse.EmbeddedCheckout.forNumber(var1);
         }
      };
      private static final CheckPayNowCapabilitiesResponse.EmbeddedCheckout[] VALUES = values();
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
      public static CheckPayNowCapabilitiesResponse.EmbeddedCheckout valueOf(int var0) {
         return forNumber(var0);
      }

      public static CheckPayNowCapabilitiesResponse.EmbeddedCheckout forNumber(int var0) {
         switch (var0) {
            case 0:
               return EMBEDDED_CHECKOUT_UNSPECIFIED;
            case 1:
               return EMBEDDED_CHECKOUT_OVERWOLF_OVERLAY;
            case 2:
               return EMBEDDED_CHECKOUT_ELECTRON_WINDOW;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<CheckPayNowCapabilitiesResponse.EmbeddedCheckout> internalGetValueMap() {
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
         return CheckPayNowCapabilitiesResponse.getDescriptor().getEnumTypes().get(0);
      }

      public static CheckPayNowCapabilitiesResponse.EmbeddedCheckout valueOf(Descriptors.EnumValueDescriptor var0) {
         if (var0.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
         }
      }

      EmbeddedCheckout(int var3) {
         this.value = var3;
      }
   }
}
