package com.lunarclient.websocket.emote.v1;

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

public final class UseEmoteResponse extends GeneratedMessageV3 implements UseEmoteResponseOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int STATUS_FIELD_NUMBER = 1;
   private int status_ = 0;
   public static final int EMOTE_ID_FIELD_NUMBER = 2;
   private int emoteId_ = 0;
   public static final int EMOTE_METADATA_FIELD_NUMBER = 3;
   private int emoteMetadata_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final UseEmoteResponse DEFAULT_INSTANCE = new UseEmoteResponse();
   private static final Parser<UseEmoteResponse> PARSER = new AbstractParser<UseEmoteResponse>() {
      public UseEmoteResponse parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         UseEmoteResponse.Builder var3 = UseEmoteResponse.newBuilder();

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

   private UseEmoteResponse(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private UseEmoteResponse() {
      this.status_ = 0;
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new UseEmoteResponse();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_emote_v1_UseEmoteResponse_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_emote_v1_UseEmoteResponse_fieldAccessorTable
         .ensureFieldAccessorsInitialized(UseEmoteResponse.class, UseEmoteResponse.Builder.class);
   }

   @Override
   public int getStatusValue() {
      return this.status_;
   }

   @Override
   public UseEmoteResponse.Status getStatus() {
      UseEmoteResponse.Status var1 = UseEmoteResponse.Status.forNumber(this.status_);
      return var1 == null ? UseEmoteResponse.Status.UNRECOGNIZED : var1;
   }

   @Override
   public int getEmoteId() {
      return this.emoteId_;
   }

   @Override
   public int getEmoteMetadata() {
      return this.emoteMetadata_;
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
      if (this.status_ != UseEmoteResponse.Status.STATUS_UNSPECIFIED.getNumber()) {
         var1.writeEnum(1, this.status_);
      }

      if (this.emoteId_ != 0) {
         var1.writeInt32(2, this.emoteId_);
      }

      if (this.emoteMetadata_ != 0) {
         var1.writeInt32(3, this.emoteMetadata_);
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
      if (this.status_ != UseEmoteResponse.Status.STATUS_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(1, this.status_);
      }

      if (this.emoteId_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(2, this.emoteId_);
      }

      if (this.emoteMetadata_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(3, this.emoteMetadata_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof UseEmoteResponse)) {
         return super.equals(var1);
      } else {
         UseEmoteResponse var2 = (UseEmoteResponse)var1;
         if (this.status_ != var2.status_) {
            return false;
         } else if (this.getEmoteId() != var2.getEmoteId()) {
            return false;
         } else {
            return this.getEmoteMetadata() != var2.getEmoteMetadata() ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + this.getEmoteId();
      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + this.getEmoteMetadata();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static UseEmoteResponse parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static UseEmoteResponse parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UseEmoteResponse parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static UseEmoteResponse parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UseEmoteResponse parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static UseEmoteResponse parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UseEmoteResponse parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UseEmoteResponse parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static UseEmoteResponse parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static UseEmoteResponse parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static UseEmoteResponse parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UseEmoteResponse parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public UseEmoteResponse.Builder newBuilderForType() {
      return newBuilder();
   }

   public static UseEmoteResponse.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static UseEmoteResponse.Builder newBuilder(UseEmoteResponse var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public UseEmoteResponse.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new UseEmoteResponse.Builder() : new UseEmoteResponse.Builder().mergeFrom(this);
   }

   protected UseEmoteResponse.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new UseEmoteResponse.Builder(var1);
   }

   public static UseEmoteResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<UseEmoteResponse> parser() {
      return PARSER;
   }

   @Override
   public Parser<UseEmoteResponse> getParserForType() {
      return PARSER;
   }

   public UseEmoteResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<UseEmoteResponse.Builder> implements UseEmoteResponseOrBuilder {
      private int bitField0_;
      private int status_ = 0;
      private int emoteId_;
      private int emoteMetadata_;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_emote_v1_UseEmoteResponse_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_emote_v1_UseEmoteResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(UseEmoteResponse.class, UseEmoteResponse.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public UseEmoteResponse.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.status_ = 0;
         this.emoteId_ = 0;
         this.emoteMetadata_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_emote_v1_UseEmoteResponse_descriptor;
      }

      public UseEmoteResponse getDefaultInstanceForType() {
         return UseEmoteResponse.getDefaultInstance();
      }

      public UseEmoteResponse build() {
         UseEmoteResponse var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public UseEmoteResponse buildPartial() {
         UseEmoteResponse var1 = new UseEmoteResponse(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(UseEmoteResponse var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.status_ = this.status_;
         }

         if ((var2 & 2) != 0) {
            var1.emoteId_ = this.emoteId_;
         }

         if ((var2 & 4) != 0) {
            var1.emoteMetadata_ = this.emoteMetadata_;
         }
      }

      public UseEmoteResponse.Builder clone() {
         return (UseEmoteResponse.Builder)super.clone();
      }

      public UseEmoteResponse.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (UseEmoteResponse.Builder)super.setField(var1, var2);
      }

      public UseEmoteResponse.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (UseEmoteResponse.Builder)super.clearField(var1);
      }

      public UseEmoteResponse.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (UseEmoteResponse.Builder)super.clearOneof(var1);
      }

      public UseEmoteResponse.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (UseEmoteResponse.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public UseEmoteResponse.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (UseEmoteResponse.Builder)super.addRepeatedField(var1, var2);
      }

      public UseEmoteResponse.Builder mergeFrom(Message var1) {
         if (var1 instanceof UseEmoteResponse) {
            return this.mergeFrom((UseEmoteResponse)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public UseEmoteResponse.Builder mergeFrom(UseEmoteResponse var1) {
         if (var1 == UseEmoteResponse.getDefaultInstance()) {
            return this;
         }

         if (var1.status_ != 0) {
            this.setStatusValue(var1.getStatusValue());
         }

         if (var1.getEmoteId() != 0) {
            this.setEmoteId(var1.getEmoteId());
         }

         if (var1.getEmoteMetadata() != 0) {
            this.setEmoteMetadata(var1.getEmoteMetadata());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public UseEmoteResponse.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.emoteId_ = var1.readInt32();
                     this.bitField0_ |= 2;
                     break;
                  case 24:
                     this.emoteMetadata_ = var1.readInt32();
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
      public int getStatusValue() {
         return this.status_;
      }

      public UseEmoteResponse.Builder setStatusValue(int var1) {
         this.status_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public UseEmoteResponse.Status getStatus() {
         UseEmoteResponse.Status var1 = UseEmoteResponse.Status.forNumber(this.status_);
         return var1 == null ? UseEmoteResponse.Status.UNRECOGNIZED : var1;
      }

      public UseEmoteResponse.Builder setStatus(UseEmoteResponse.Status var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 1;
         this.status_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public UseEmoteResponse.Builder clearStatus() {
         this.bitField0_ &= -2;
         this.status_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public int getEmoteId() {
         return this.emoteId_;
      }

      public UseEmoteResponse.Builder setEmoteId(int var1) {
         this.emoteId_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public UseEmoteResponse.Builder clearEmoteId() {
         this.bitField0_ &= -3;
         this.emoteId_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public int getEmoteMetadata() {
         return this.emoteMetadata_;
      }

      public UseEmoteResponse.Builder setEmoteMetadata(int var1) {
         this.emoteMetadata_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public UseEmoteResponse.Builder clearEmoteMetadata() {
         this.bitField0_ &= -5;
         this.emoteMetadata_ = 0;
         this.onChanged();
         return this;
      }

      public final UseEmoteResponse.Builder setUnknownFields(UnknownFieldSet var1) {
         return (UseEmoteResponse.Builder)super.setUnknownFields(var1);
      }

      public final UseEmoteResponse.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (UseEmoteResponse.Builder)super.mergeUnknownFields(var1);
      }
   }

   public enum Status implements ProtocolMessageEnum {
      STATUS_UNSPECIFIED(0),
      STATUS_OK(1),
      STATUS_EMOTE_NOT_OWNED(2),
      STATUS_ILLEGAL_SOUNDTRACK(3),
      STATUS_RATE_LIMITED(4),
      UNRECOGNIZED(-1);

      public static final int STATUS_UNSPECIFIED_VALUE = 0;
      public static final int STATUS_OK_VALUE = 1;
      public static final int STATUS_EMOTE_NOT_OWNED_VALUE = 2;
      public static final int STATUS_ILLEGAL_SOUNDTRACK_VALUE = 3;
      public static final int STATUS_RATE_LIMITED_VALUE = 4;
      private static final Internal.EnumLiteMap<UseEmoteResponse.Status> internalValueMap = new Internal.EnumLiteMap<UseEmoteResponse.Status>() {
         public UseEmoteResponse.Status findValueByNumber(int var1) {
            return UseEmoteResponse.Status.forNumber(var1);
         }
      };
      private static final UseEmoteResponse.Status[] VALUES = values();
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
      public static UseEmoteResponse.Status valueOf(int var0) {
         return forNumber(var0);
      }

      public static UseEmoteResponse.Status forNumber(int var0) {
         switch (var0) {
            case 0:
               return STATUS_UNSPECIFIED;
            case 1:
               return STATUS_OK;
            case 2:
               return STATUS_EMOTE_NOT_OWNED;
            case 3:
               return STATUS_ILLEGAL_SOUNDTRACK;
            case 4:
               return STATUS_RATE_LIMITED;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<UseEmoteResponse.Status> internalGetValueMap() {
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
         return UseEmoteResponse.getDescriptor().getEnumTypes().get(0);
      }

      public static UseEmoteResponse.Status valueOf(Descriptors.EnumValueDescriptor var0) {
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
