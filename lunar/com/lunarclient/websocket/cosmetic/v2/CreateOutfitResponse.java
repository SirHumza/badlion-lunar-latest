package com.lunarclient.websocket.cosmetic.v2;

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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class CreateOutfitResponse extends GeneratedMessageV3 implements CreateOutfitResponseOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int STATUS_FIELD_NUMBER = 1;
   private int status_ = 0;
   public static final int OUTFIT_FIELD_NUMBER = 2;
   private Outfit outfit_;
   private byte memoizedIsInitialized = -1;
   private static final CreateOutfitResponse DEFAULT_INSTANCE = new CreateOutfitResponse();
   private static final Parser<CreateOutfitResponse> PARSER = new AbstractParser<CreateOutfitResponse>() {
      public CreateOutfitResponse parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         CreateOutfitResponse.Builder var3 = CreateOutfitResponse.newBuilder();

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

   private CreateOutfitResponse(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private CreateOutfitResponse() {
      this.status_ = 0;
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new CreateOutfitResponse();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_cosmetic_v2_CreateOutfitResponse_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_cosmetic_v2_CreateOutfitResponse_fieldAccessorTable
         .ensureFieldAccessorsInitialized(CreateOutfitResponse.class, CreateOutfitResponse.Builder.class);
   }

   @Override
   public int getStatusValue() {
      return this.status_;
   }

   @Override
   public CreateOutfitResponse.Status getStatus() {
      CreateOutfitResponse.Status var1 = CreateOutfitResponse.Status.forNumber(this.status_);
      return var1 == null ? CreateOutfitResponse.Status.UNRECOGNIZED : var1;
   }

   @Override
   public boolean hasOutfit() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public Outfit getOutfit() {
      return this.outfit_ == null ? Outfit.getDefaultInstance() : this.outfit_;
   }

   @Override
   public OutfitOrBuilder getOutfitOrBuilder() {
      return this.outfit_ == null ? Outfit.getDefaultInstance() : this.outfit_;
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
      if (this.status_ != CreateOutfitResponse.Status.STATUS_UNSPECIFIED.getNumber()) {
         var1.writeEnum(1, this.status_);
      }

      if ((this.bitField0_ & 1) != 0) {
         var1.writeMessage(2, this.getOutfit());
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
      if (this.status_ != CreateOutfitResponse.Status.STATUS_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(1, this.status_);
      }

      if ((this.bitField0_ & 1) != 0) {
         var1 += CodedOutputStream.computeMessageSize(2, this.getOutfit());
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof CreateOutfitResponse)) {
         return super.equals(var1);
      } else {
         CreateOutfitResponse var2 = (CreateOutfitResponse)var1;
         if (this.status_ != var2.status_) {
            return false;
         } else if (this.hasOutfit() != var2.hasOutfit()) {
            return false;
         } else {
            return this.hasOutfit() && !this.getOutfit().equals(var2.getOutfit()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.hasOutfit()) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getOutfit().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static CreateOutfitResponse parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static CreateOutfitResponse parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static CreateOutfitResponse parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static CreateOutfitResponse parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static CreateOutfitResponse parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static CreateOutfitResponse parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static CreateOutfitResponse parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static CreateOutfitResponse parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static CreateOutfitResponse parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static CreateOutfitResponse parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static CreateOutfitResponse parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static CreateOutfitResponse parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public CreateOutfitResponse.Builder newBuilderForType() {
      return newBuilder();
   }

   public static CreateOutfitResponse.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static CreateOutfitResponse.Builder newBuilder(CreateOutfitResponse var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public CreateOutfitResponse.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new CreateOutfitResponse.Builder() : new CreateOutfitResponse.Builder().mergeFrom(this);
   }

   protected CreateOutfitResponse.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new CreateOutfitResponse.Builder(var1);
   }

   public static CreateOutfitResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<CreateOutfitResponse> parser() {
      return PARSER;
   }

   @Override
   public Parser<CreateOutfitResponse> getParserForType() {
      return PARSER;
   }

   public CreateOutfitResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<CreateOutfitResponse.Builder> implements CreateOutfitResponseOrBuilder {
      private int bitField0_;
      private int status_ = 0;
      private Outfit outfit_;
      private SingleFieldBuilderV3<Outfit, Outfit.Builder, OutfitOrBuilder> outfitBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_cosmetic_v2_CreateOutfitResponse_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_cosmetic_v2_CreateOutfitResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(CreateOutfitResponse.class, CreateOutfitResponse.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (CreateOutfitResponse.alwaysUseFieldBuilders) {
            this.getOutfitFieldBuilder();
         }
      }

      public CreateOutfitResponse.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.status_ = 0;
         this.outfit_ = null;
         if (this.outfitBuilder_ != null) {
            this.outfitBuilder_.dispose();
            this.outfitBuilder_ = null;
         }

         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_cosmetic_v2_CreateOutfitResponse_descriptor;
      }

      public CreateOutfitResponse getDefaultInstanceForType() {
         return CreateOutfitResponse.getDefaultInstance();
      }

      public CreateOutfitResponse build() {
         CreateOutfitResponse var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public CreateOutfitResponse buildPartial() {
         CreateOutfitResponse var1 = new CreateOutfitResponse(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(CreateOutfitResponse var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.status_ = this.status_;
         }

         byte var3 = 0;
         if ((var2 & 2) != 0) {
            var1.outfit_ = this.outfitBuilder_ == null ? this.outfit_ : this.outfitBuilder_.build();
            var3 |= 1;
         }

         CreateOutfitResponse var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public CreateOutfitResponse.Builder clone() {
         return (CreateOutfitResponse.Builder)super.clone();
      }

      public CreateOutfitResponse.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (CreateOutfitResponse.Builder)super.setField(var1, var2);
      }

      public CreateOutfitResponse.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (CreateOutfitResponse.Builder)super.clearField(var1);
      }

      public CreateOutfitResponse.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (CreateOutfitResponse.Builder)super.clearOneof(var1);
      }

      public CreateOutfitResponse.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (CreateOutfitResponse.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public CreateOutfitResponse.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (CreateOutfitResponse.Builder)super.addRepeatedField(var1, var2);
      }

      public CreateOutfitResponse.Builder mergeFrom(Message var1) {
         if (var1 instanceof CreateOutfitResponse) {
            return this.mergeFrom((CreateOutfitResponse)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public CreateOutfitResponse.Builder mergeFrom(CreateOutfitResponse var1) {
         if (var1 == CreateOutfitResponse.getDefaultInstance()) {
            return this;
         }

         if (var1.status_ != 0) {
            this.setStatusValue(var1.getStatusValue());
         }

         if (var1.hasOutfit()) {
            this.mergeOutfit(var1.getOutfit());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public CreateOutfitResponse.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getOutfitFieldBuilder().getBuilder(), var2);
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

      public CreateOutfitResponse.Builder setStatusValue(int var1) {
         this.status_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public CreateOutfitResponse.Status getStatus() {
         CreateOutfitResponse.Status var1 = CreateOutfitResponse.Status.forNumber(this.status_);
         return var1 == null ? CreateOutfitResponse.Status.UNRECOGNIZED : var1;
      }

      public CreateOutfitResponse.Builder setStatus(CreateOutfitResponse.Status var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 1;
         this.status_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public CreateOutfitResponse.Builder clearStatus() {
         this.bitField0_ &= -2;
         this.status_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasOutfit() {
         return (this.bitField0_ & 2) != 0;
      }

      @Override
      public Outfit getOutfit() {
         if (this.outfitBuilder_ == null) {
            return this.outfit_ == null ? Outfit.getDefaultInstance() : this.outfit_;
         } else {
            return this.outfitBuilder_.getMessage();
         }
      }

      public CreateOutfitResponse.Builder setOutfit(Outfit var1) {
         if (this.outfitBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.outfit_ = var1;
         } else {
            this.outfitBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public CreateOutfitResponse.Builder setOutfit(Outfit.Builder var1) {
         if (this.outfitBuilder_ == null) {
            this.outfit_ = var1.build();
         } else {
            this.outfitBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public CreateOutfitResponse.Builder mergeOutfit(Outfit var1) {
         if (this.outfitBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0 && this.outfit_ != null && this.outfit_ != Outfit.getDefaultInstance()) {
               this.getOutfitBuilder().mergeFrom(var1);
            } else {
               this.outfit_ = var1;
            }
         } else {
            this.outfitBuilder_.mergeFrom(var1);
         }

         if (this.outfit_ != null) {
            this.bitField0_ |= 2;
            this.onChanged();
         }

         return this;
      }

      public CreateOutfitResponse.Builder clearOutfit() {
         this.bitField0_ &= -3;
         this.outfit_ = null;
         if (this.outfitBuilder_ != null) {
            this.outfitBuilder_.dispose();
            this.outfitBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Outfit.Builder getOutfitBuilder() {
         this.bitField0_ |= 2;
         this.onChanged();
         return this.getOutfitFieldBuilder().getBuilder();
      }

      @Override
      public OutfitOrBuilder getOutfitOrBuilder() {
         if (this.outfitBuilder_ != null) {
            return this.outfitBuilder_.getMessageOrBuilder();
         } else {
            return this.outfit_ == null ? Outfit.getDefaultInstance() : this.outfit_;
         }
      }

      private SingleFieldBuilderV3<Outfit, Outfit.Builder, OutfitOrBuilder> getOutfitFieldBuilder() {
         if (this.outfitBuilder_ == null) {
            this.outfitBuilder_ = new SingleFieldBuilderV3<>(this.getOutfit(), this.getParentForChildren(), this.isClean());
            this.outfit_ = null;
         }

         return this.outfitBuilder_;
      }

      public final CreateOutfitResponse.Builder setUnknownFields(UnknownFieldSet var1) {
         return (CreateOutfitResponse.Builder)super.setUnknownFields(var1);
      }

      public final CreateOutfitResponse.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (CreateOutfitResponse.Builder)super.mergeUnknownFields(var1);
      }
   }

   public enum Status implements ProtocolMessageEnum {
      STATUS_UNSPECIFIED(0),
      STATUS_OK(1),
      STATUS_OUTFIT_LIMIT_REACHED(2),
      UNRECOGNIZED(-1);

      public static final int STATUS_UNSPECIFIED_VALUE = 0;
      public static final int STATUS_OK_VALUE = 1;
      public static final int STATUS_OUTFIT_LIMIT_REACHED_VALUE = 2;
      private static final Internal.EnumLiteMap<CreateOutfitResponse.Status> internalValueMap = new Internal.EnumLiteMap<CreateOutfitResponse.Status>() {
         public CreateOutfitResponse.Status findValueByNumber(int var1) {
            return CreateOutfitResponse.Status.forNumber(var1);
         }
      };
      private static final CreateOutfitResponse.Status[] VALUES = values();
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
      public static CreateOutfitResponse.Status valueOf(int var0) {
         return forNumber(var0);
      }

      public static CreateOutfitResponse.Status forNumber(int var0) {
         switch (var0) {
            case 0:
               return STATUS_UNSPECIFIED;
            case 1:
               return STATUS_OK;
            case 2:
               return STATUS_OUTFIT_LIMIT_REACHED;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<CreateOutfitResponse.Status> internalGetValueMap() {
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
         return CreateOutfitResponse.getDescriptor().getEnumTypes().get(0);
      }

      public static CreateOutfitResponse.Status valueOf(Descriptors.EnumValueDescriptor var0) {
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
