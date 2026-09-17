package com.lunarclient.websocket.socials.v1;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import com.lunarclient.common.v1.UserSocialPlatform;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class UnlinkSocialRequest extends GeneratedMessageV3 implements UnlinkSocialRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int PLATFORM_FIELD_NUMBER = 1;
   private int platform_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final UnlinkSocialRequest DEFAULT_INSTANCE = new UnlinkSocialRequest();
   private static final Parser<UnlinkSocialRequest> PARSER = new AbstractParser<UnlinkSocialRequest>() {
      public UnlinkSocialRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         UnlinkSocialRequest.Builder var3 = UnlinkSocialRequest.newBuilder();

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

   private UnlinkSocialRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private UnlinkSocialRequest() {
      this.platform_ = 0;
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new UnlinkSocialRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_socials_v1_UnlinkSocialRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_socials_v1_UnlinkSocialRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(UnlinkSocialRequest.class, UnlinkSocialRequest.Builder.class);
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
      if (this.platform_ != UserSocialPlatform.USER_SOCIAL_PLATFORM_UNSPECIFIED.getNumber()) {
         var1.writeEnum(1, this.platform_);
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
      if (this.platform_ != UserSocialPlatform.USER_SOCIAL_PLATFORM_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(1, this.platform_);
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

      if (!(var1 instanceof UnlinkSocialRequest)) {
         return super.equals(var1);
      }

      UnlinkSocialRequest var2 = (UnlinkSocialRequest)var1;
      return this.platform_ != var2.platform_ ? false : this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      var1 = 37 * var1 + 1;
      var1 = 53 * var1 + this.platform_;
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static UnlinkSocialRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static UnlinkSocialRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UnlinkSocialRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static UnlinkSocialRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UnlinkSocialRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static UnlinkSocialRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static UnlinkSocialRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UnlinkSocialRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static UnlinkSocialRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static UnlinkSocialRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static UnlinkSocialRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static UnlinkSocialRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public UnlinkSocialRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static UnlinkSocialRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static UnlinkSocialRequest.Builder newBuilder(UnlinkSocialRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public UnlinkSocialRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new UnlinkSocialRequest.Builder() : new UnlinkSocialRequest.Builder().mergeFrom(this);
   }

   protected UnlinkSocialRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new UnlinkSocialRequest.Builder(var1);
   }

   public static UnlinkSocialRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<UnlinkSocialRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<UnlinkSocialRequest> getParserForType() {
      return PARSER;
   }

   public UnlinkSocialRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<UnlinkSocialRequest.Builder> implements UnlinkSocialRequestOrBuilder {
      private int bitField0_;
      private int platform_ = 0;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_socials_v1_UnlinkSocialRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_socials_v1_UnlinkSocialRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(UnlinkSocialRequest.class, UnlinkSocialRequest.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public UnlinkSocialRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.platform_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_socials_v1_UnlinkSocialRequest_descriptor;
      }

      public UnlinkSocialRequest getDefaultInstanceForType() {
         return UnlinkSocialRequest.getDefaultInstance();
      }

      public UnlinkSocialRequest build() {
         UnlinkSocialRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public UnlinkSocialRequest buildPartial() {
         UnlinkSocialRequest var1 = new UnlinkSocialRequest(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(UnlinkSocialRequest var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.platform_ = this.platform_;
         }
      }

      public UnlinkSocialRequest.Builder clone() {
         return (UnlinkSocialRequest.Builder)super.clone();
      }

      public UnlinkSocialRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (UnlinkSocialRequest.Builder)super.setField(var1, var2);
      }

      public UnlinkSocialRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (UnlinkSocialRequest.Builder)super.clearField(var1);
      }

      public UnlinkSocialRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (UnlinkSocialRequest.Builder)super.clearOneof(var1);
      }

      public UnlinkSocialRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (UnlinkSocialRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public UnlinkSocialRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (UnlinkSocialRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public UnlinkSocialRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof UnlinkSocialRequest) {
            return this.mergeFrom((UnlinkSocialRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public UnlinkSocialRequest.Builder mergeFrom(UnlinkSocialRequest var1) {
         if (var1 == UnlinkSocialRequest.getDefaultInstance()) {
            return this;
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

      public UnlinkSocialRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.platform_ = var1.readEnum();
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
      public int getPlatformValue() {
         return this.platform_;
      }

      public UnlinkSocialRequest.Builder setPlatformValue(int var1) {
         this.platform_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public UserSocialPlatform getPlatform() {
         UserSocialPlatform var1 = UserSocialPlatform.forNumber(this.platform_);
         return var1 == null ? UserSocialPlatform.UNRECOGNIZED : var1;
      }

      public UnlinkSocialRequest.Builder setPlatform(UserSocialPlatform var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 1;
         this.platform_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public UnlinkSocialRequest.Builder clearPlatform() {
         this.bitField0_ &= -2;
         this.platform_ = 0;
         this.onChanged();
         return this;
      }

      public final UnlinkSocialRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (UnlinkSocialRequest.Builder)super.setUnknownFields(var1);
      }

      public final UnlinkSocialRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (UnlinkSocialRequest.Builder)super.mergeUnknownFields(var1);
      }
   }
}
