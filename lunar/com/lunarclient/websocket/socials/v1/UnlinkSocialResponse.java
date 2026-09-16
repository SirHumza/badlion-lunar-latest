package com.lunarclient.websocket.socials.v1;

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
import com.lunarclient.common.v1.UserSocialPlatform;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class UnlinkSocialResponse extends GeneratedMessageV3 implements UnlinkSocialResponseOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int STATUS_FIELD_NUMBER = 1;
   private int status_ = 0;
   public static final int PLATFORM_FIELD_NUMBER = 2;
   private int platform_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final UnlinkSocialResponse DEFAULT_INSTANCE = new UnlinkSocialResponse();
   private static final Parser<UnlinkSocialResponse> PARSER = new AbstractParser<UnlinkSocialResponse>() {
      public UnlinkSocialResponse parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         UnlinkSocialResponse.Builder var3 = UnlinkSocialResponse.newBuilder();

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

   private UnlinkSocialResponse(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private UnlinkSocialResponse() {
      this.status_ = 0;
      this.platform_ = 0;
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new UnlinkSocialResponse();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_socials_v1_UnlinkSocialResponse_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_socials_v1_UnlinkSocialResponse_fieldAccessorTable
         .ensureFieldAccessorsInitialized(UnlinkSocialResponse.class, UnlinkSocialResponse.Builder.class);
   }

   @Override
   public int getStatusValue() {
      return this.status_;
   }

   @Override
   public UnlinkSocialResponse.Status getStatus() {
      UnlinkSocialResponse.Status var1 = UnlinkSocialResponse.Status.forNumber(this.status_);
      return var1 == null ? UnlinkSocialResponse.Status.UNRECOGNIZED : var1;
   }

   @Override
   public int getPlatformValue() {
      return this.platform_;
   }

   @Override
   public UserSocialPlatform getPlatform() {
      UserSocialPlatform var1 = UserSocialPlatform.forNumber(this.platform_);
      return var1 == null ? UserSocialPlatform.UNRECOGNIZED : var1;
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
      if (this.status_ != UnlinkSocialResponse.Status.STATUS_UNSPECIFIED.getNumber()) {
         var1.writeEnum(1, this.status_);
      }

      if (this.platform_ != UserSocialPlatform.USER_SOCIAL_PLATFORM_UNSPECIFIED.getNumber()) {
         var1.writeEnum(2, this.platform_);
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
      if (this.status_ != UnlinkSocialResponse.Status.STATUS_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(1, this.status_);
      }

      if (this.platform_ != UserSocialPlatform.USER_SOCIAL_PLATFORM_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(2, this.platform_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof UnlinkSocialResponse)) {
         return super.equals(var1);
      } else {
         UnlinkSocialResponse var2 = (UnlinkSocialResponse)var1;
         if (this.status_ != var2.status_) {
            return false;
         } else {
            return this.platform_ != var2.platform_ ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + this.platform_;
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static UnlinkSocialResponse parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static UnlinkSocialResponse parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UnlinkSocialResponse parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static UnlinkSocialResponse parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UnlinkSocialResponse parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static UnlinkSocialResponse parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UnlinkSocialResponse parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UnlinkSocialResponse parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static UnlinkSocialResponse parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static UnlinkSocialResponse parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static UnlinkSocialResponse parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UnlinkSocialResponse parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public UnlinkSocialResponse.Builder newBuilderForType() {
      return newBuilder();
   }

   public static UnlinkSocialResponse.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static UnlinkSocialResponse.Builder newBuilder(UnlinkSocialResponse var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public UnlinkSocialResponse.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new UnlinkSocialResponse.Builder() : new UnlinkSocialResponse.Builder().mergeFrom(this);
   }

   protected UnlinkSocialResponse.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new UnlinkSocialResponse.Builder(var1);
   }

   public static UnlinkSocialResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<UnlinkSocialResponse> parser() {
      return PARSER;
   }

   @Override
   public Parser<UnlinkSocialResponse> getParserForType() {
      return PARSER;
   }

   public UnlinkSocialResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<UnlinkSocialResponse.Builder> implements UnlinkSocialResponseOrBuilder {
      private int bitField0_;
      private int status_ = 0;
      private int platform_ = 0;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_socials_v1_UnlinkSocialResponse_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_socials_v1_UnlinkSocialResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(UnlinkSocialResponse.class, UnlinkSocialResponse.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public UnlinkSocialResponse.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.status_ = 0;
         this.platform_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_socials_v1_UnlinkSocialResponse_descriptor;
      }

      public UnlinkSocialResponse getDefaultInstanceForType() {
         return UnlinkSocialResponse.getDefaultInstance();
      }

      public UnlinkSocialResponse build() {
         UnlinkSocialResponse var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public UnlinkSocialResponse buildPartial() {
         UnlinkSocialResponse var1 = new UnlinkSocialResponse(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(UnlinkSocialResponse var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.status_ = this.status_;
         }

         if ((var2 & 2) != 0) {
            var1.platform_ = this.platform_;
         }
      }

      public UnlinkSocialResponse.Builder clone() {
         return (UnlinkSocialResponse.Builder)super.clone();
      }

      public UnlinkSocialResponse.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (UnlinkSocialResponse.Builder)super.setField(var1, var2);
      }

      public UnlinkSocialResponse.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (UnlinkSocialResponse.Builder)super.clearField(var1);
      }

      public UnlinkSocialResponse.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (UnlinkSocialResponse.Builder)super.clearOneof(var1);
      }

      public UnlinkSocialResponse.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (UnlinkSocialResponse.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public UnlinkSocialResponse.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (UnlinkSocialResponse.Builder)super.addRepeatedField(var1, var2);
      }

      public UnlinkSocialResponse.Builder mergeFrom(Message var1) {
         if (var1 instanceof UnlinkSocialResponse) {
            return this.mergeFrom((UnlinkSocialResponse)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public UnlinkSocialResponse.Builder mergeFrom(UnlinkSocialResponse var1) {
         if (var1 == UnlinkSocialResponse.getDefaultInstance()) {
            return this;
         }

         if (var1.status_ != 0) {
            this.setStatusValue(var1.getStatusValue());
         }

         if (var1.platform_ != 0) {
            this.setPlatformValue(var1.getPlatformValue());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public UnlinkSocialResponse.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.platform_ = var1.readEnum();
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

      public UnlinkSocialResponse.Builder setStatusValue(int var1) {
         this.status_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public UnlinkSocialResponse.Status getStatus() {
         UnlinkSocialResponse.Status var1 = UnlinkSocialResponse.Status.forNumber(this.status_);
         return var1 == null ? UnlinkSocialResponse.Status.UNRECOGNIZED : var1;
      }

      public UnlinkSocialResponse.Builder setStatus(UnlinkSocialResponse.Status var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 1;
         this.status_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public UnlinkSocialResponse.Builder clearStatus() {
         this.bitField0_ &= -2;
         this.status_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public int getPlatformValue() {
         return this.platform_;
      }

      public UnlinkSocialResponse.Builder setPlatformValue(int var1) {
         this.platform_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      @Override
      public UserSocialPlatform getPlatform() {
         UserSocialPlatform var1 = UserSocialPlatform.forNumber(this.platform_);
         return var1 == null ? UserSocialPlatform.UNRECOGNIZED : var1;
      }

      public UnlinkSocialResponse.Builder setPlatform(UserSocialPlatform var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 2;
         this.platform_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public UnlinkSocialResponse.Builder clearPlatform() {
         this.bitField0_ &= -3;
         this.platform_ = 0;
         this.onChanged();
         return this;
      }

      public final UnlinkSocialResponse.Builder setUnknownFields(UnknownFieldSet var1) {
         return (UnlinkSocialResponse.Builder)super.setUnknownFields(var1);
      }

      public final UnlinkSocialResponse.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (UnlinkSocialResponse.Builder)super.mergeUnknownFields(var1);
      }
   }

   public enum Status implements ProtocolMessageEnum {
      STATUS_UNSPECIFIED(0),
      STATUS_OK(1),
      STATUS_TARGET_NOT_LINKED(2),
      UNRECOGNIZED(-1);

      public static final int STATUS_UNSPECIFIED_VALUE = 0;
      public static final int STATUS_OK_VALUE = 1;
      public static final int STATUS_TARGET_NOT_LINKED_VALUE = 2;
      private static final Internal.EnumLiteMap<UnlinkSocialResponse.Status> internalValueMap = new Internal.EnumLiteMap<UnlinkSocialResponse.Status>() {
         public UnlinkSocialResponse.Status findValueByNumber(int var1) {
            return UnlinkSocialResponse.Status.forNumber(var1);
         }
      };
      private static final UnlinkSocialResponse.Status[] VALUES = values();
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
      public static UnlinkSocialResponse.Status valueOf(int var0) {
         return forNumber(var0);
      }

      public static UnlinkSocialResponse.Status forNumber(int var0) {
         switch (var0) {
            case 0:
               return STATUS_UNSPECIFIED;
            case 1:
               return STATUS_OK;
            case 2:
               return STATUS_TARGET_NOT_LINKED;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<UnlinkSocialResponse.Status> internalGetValueMap() {
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
         return UnlinkSocialResponse.getDescriptor().getEnumTypes().get(0);
      }

      public static UnlinkSocialResponse.Status valueOf(Descriptors.EnumValueDescriptor var0) {
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
