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

public final class CheckTebexCapabilitiesResponse extends GeneratedMessageV3 implements CheckTebexCapabilitiesResponseOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int EMBEDDED_CHECKOUT_FIELD_NUMBER = 1;
   private int embeddedCheckout_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final CheckTebexCapabilitiesResponse DEFAULT_INSTANCE = new CheckTebexCapabilitiesResponse();
   private static final Parser<CheckTebexCapabilitiesResponse> PARSER = new AbstractParser<CheckTebexCapabilitiesResponse>() {
      public CheckTebexCapabilitiesResponse parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         CheckTebexCapabilitiesResponse.Builder var3 = CheckTebexCapabilitiesResponse.newBuilder();

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

   private CheckTebexCapabilitiesResponse(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private CheckTebexCapabilitiesResponse() {
      this.embeddedCheckout_ = 0;
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new CheckTebexCapabilitiesResponse();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_gameipc_tebex_v1_CheckTebexCapabilitiesResponse_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_gameipc_tebex_v1_CheckTebexCapabilitiesResponse_fieldAccessorTable
         .ensureFieldAccessorsInitialized(CheckTebexCapabilitiesResponse.class, CheckTebexCapabilitiesResponse.Builder.class);
   }

   @Override
   public int getEmbeddedCheckoutValue() {
      return this.embeddedCheckout_;
   }

   @Override
   public CheckTebexCapabilitiesResponse.EmbeddedCheckout getEmbeddedCheckout() {
      CheckTebexCapabilitiesResponse.EmbeddedCheckout var1 = CheckTebexCapabilitiesResponse.EmbeddedCheckout.forNumber(this.embeddedCheckout_);
      return var1 == null ? CheckTebexCapabilitiesResponse.EmbeddedCheckout.UNRECOGNIZED : var1;
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
      if (this.embeddedCheckout_ != CheckTebexCapabilitiesResponse.EmbeddedCheckout.EMBEDDED_CHECKOUT_UNSPECIFIED.getNumber()) {
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
      if (this.embeddedCheckout_ != CheckTebexCapabilitiesResponse.EmbeddedCheckout.EMBEDDED_CHECKOUT_UNSPECIFIED.getNumber()) {
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

      if (!(var1 instanceof CheckTebexCapabilitiesResponse)) {
         return super.equals(var1);
      }

      CheckTebexCapabilitiesResponse var2 = (CheckTebexCapabilitiesResponse)var1;
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

   public static CheckTebexCapabilitiesResponse parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static CheckTebexCapabilitiesResponse parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static CheckTebexCapabilitiesResponse parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static CheckTebexCapabilitiesResponse parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static CheckTebexCapabilitiesResponse parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static CheckTebexCapabilitiesResponse parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static CheckTebexCapabilitiesResponse parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static CheckTebexCapabilitiesResponse parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static CheckTebexCapabilitiesResponse parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static CheckTebexCapabilitiesResponse parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static CheckTebexCapabilitiesResponse parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static CheckTebexCapabilitiesResponse parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public CheckTebexCapabilitiesResponse.Builder newBuilderForType() {
      return newBuilder();
   }

   public static CheckTebexCapabilitiesResponse.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static CheckTebexCapabilitiesResponse.Builder newBuilder(CheckTebexCapabilitiesResponse var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public CheckTebexCapabilitiesResponse.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new CheckTebexCapabilitiesResponse.Builder() : new CheckTebexCapabilitiesResponse.Builder().mergeFrom(this);
   }

   protected CheckTebexCapabilitiesResponse.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new CheckTebexCapabilitiesResponse.Builder(var1);
   }

   public static CheckTebexCapabilitiesResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<CheckTebexCapabilitiesResponse> parser() {
      return PARSER;
   }

   @Override
   public Parser<CheckTebexCapabilitiesResponse> getParserForType() {
      return PARSER;
   }

   public CheckTebexCapabilitiesResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder
      extends GeneratedMessageV3.Builder<CheckTebexCapabilitiesResponse.Builder>
      implements CheckTebexCapabilitiesResponseOrBuilder {
      private int bitField0_;
      private int embeddedCheckout_ = 0;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_gameipc_tebex_v1_CheckTebexCapabilitiesResponse_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_gameipc_tebex_v1_CheckTebexCapabilitiesResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(CheckTebexCapabilitiesResponse.class, CheckTebexCapabilitiesResponse.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public CheckTebexCapabilitiesResponse.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.embeddedCheckout_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_gameipc_tebex_v1_CheckTebexCapabilitiesResponse_descriptor;
      }

      public CheckTebexCapabilitiesResponse getDefaultInstanceForType() {
         return CheckTebexCapabilitiesResponse.getDefaultInstance();
      }

      public CheckTebexCapabilitiesResponse build() {
         CheckTebexCapabilitiesResponse var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public CheckTebexCapabilitiesResponse buildPartial() {
         CheckTebexCapabilitiesResponse var1 = new CheckTebexCapabilitiesResponse(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(CheckTebexCapabilitiesResponse var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.embeddedCheckout_ = this.embeddedCheckout_;
         }
      }

      public CheckTebexCapabilitiesResponse.Builder clone() {
         return (CheckTebexCapabilitiesResponse.Builder)super.clone();
      }

      public CheckTebexCapabilitiesResponse.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (CheckTebexCapabilitiesResponse.Builder)super.setField(var1, var2);
      }

      public CheckTebexCapabilitiesResponse.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (CheckTebexCapabilitiesResponse.Builder)super.clearField(var1);
      }

      public CheckTebexCapabilitiesResponse.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (CheckTebexCapabilitiesResponse.Builder)super.clearOneof(var1);
      }

      public CheckTebexCapabilitiesResponse.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (CheckTebexCapabilitiesResponse.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public CheckTebexCapabilitiesResponse.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (CheckTebexCapabilitiesResponse.Builder)super.addRepeatedField(var1, var2);
      }

      public CheckTebexCapabilitiesResponse.Builder mergeFrom(Message var1) {
         if (var1 instanceof CheckTebexCapabilitiesResponse) {
            return this.mergeFrom((CheckTebexCapabilitiesResponse)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public CheckTebexCapabilitiesResponse.Builder mergeFrom(CheckTebexCapabilitiesResponse var1) {
         if (var1 == CheckTebexCapabilitiesResponse.getDefaultInstance()) {
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

      public CheckTebexCapabilitiesResponse.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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

      public CheckTebexCapabilitiesResponse.Builder setEmbeddedCheckoutValue(int var1) {
         this.embeddedCheckout_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public CheckTebexCapabilitiesResponse.EmbeddedCheckout getEmbeddedCheckout() {
         CheckTebexCapabilitiesResponse.EmbeddedCheckout var1 = CheckTebexCapabilitiesResponse.EmbeddedCheckout.forNumber(this.embeddedCheckout_);
         return var1 == null ? CheckTebexCapabilitiesResponse.EmbeddedCheckout.UNRECOGNIZED : var1;
      }

      public CheckTebexCapabilitiesResponse.Builder setEmbeddedCheckout(CheckTebexCapabilitiesResponse.EmbeddedCheckout var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 1;
         this.embeddedCheckout_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public CheckTebexCapabilitiesResponse.Builder clearEmbeddedCheckout() {
         this.bitField0_ &= -2;
         this.embeddedCheckout_ = 0;
         this.onChanged();
         return this;
      }

      public final CheckTebexCapabilitiesResponse.Builder setUnknownFields(UnknownFieldSet var1) {
         return (CheckTebexCapabilitiesResponse.Builder)super.setUnknownFields(var1);
      }

      public final CheckTebexCapabilitiesResponse.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (CheckTebexCapabilitiesResponse.Builder)super.mergeUnknownFields(var1);
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
      private static final Internal.EnumLiteMap<CheckTebexCapabilitiesResponse.EmbeddedCheckout> internalValueMap = new Internal.EnumLiteMap<CheckTebexCapabilitiesResponse.EmbeddedCheckout>() {
         public CheckTebexCapabilitiesResponse.EmbeddedCheckout findValueByNumber(int var1) {
            return CheckTebexCapabilitiesResponse.EmbeddedCheckout.forNumber(var1);
         }
      };
      private static final CheckTebexCapabilitiesResponse.EmbeddedCheckout[] VALUES = values();
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
      public static CheckTebexCapabilitiesResponse.EmbeddedCheckout valueOf(int var0) {
         return forNumber(var0);
      }

      public static CheckTebexCapabilitiesResponse.EmbeddedCheckout forNumber(int var0) {
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

      public static Internal.EnumLiteMap<CheckTebexCapabilitiesResponse.EmbeddedCheckout> internalGetValueMap() {
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
         return CheckTebexCapabilitiesResponse.getDescriptor().getEnumTypes().get(0);
      }

      public static CheckTebexCapabilitiesResponse.EmbeddedCheckout valueOf(Descriptors.EnumValueDescriptor var0) {
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
