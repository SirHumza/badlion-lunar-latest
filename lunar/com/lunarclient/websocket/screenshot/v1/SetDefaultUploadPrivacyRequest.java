package com.lunarclient.websocket.screenshot.v1;

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
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class SetDefaultUploadPrivacyRequest extends GeneratedMessageV3 implements SetDefaultUploadPrivacyRequestOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int DEFAULT_UPLOAD_PRIVACY_FIELD_NUMBER = 1;
   private int defaultUploadPrivacy_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final SetDefaultUploadPrivacyRequest DEFAULT_INSTANCE = new SetDefaultUploadPrivacyRequest();
   private static final Parser<SetDefaultUploadPrivacyRequest> PARSER = new AbstractParser<SetDefaultUploadPrivacyRequest>() {
      public SetDefaultUploadPrivacyRequest parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         SetDefaultUploadPrivacyRequest.Builder var3 = SetDefaultUploadPrivacyRequest.newBuilder();

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

   private SetDefaultUploadPrivacyRequest(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private SetDefaultUploadPrivacyRequest() {
      this.defaultUploadPrivacy_ = 0;
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new SetDefaultUploadPrivacyRequest();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_screenshot_v1_SetDefaultUploadPrivacyRequest_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_screenshot_v1_SetDefaultUploadPrivacyRequest_fieldAccessorTable
         .ensureFieldAccessorsInitialized(SetDefaultUploadPrivacyRequest.class, SetDefaultUploadPrivacyRequest.Builder.class);
   }

   @Override
   public int getDefaultUploadPrivacyValue() {
      return this.defaultUploadPrivacy_;
   }

   @Override
   public ScreenshotPrivacy getDefaultUploadPrivacy() {
      ScreenshotPrivacy var1 = ScreenshotPrivacy.forNumber(this.defaultUploadPrivacy_);
      return var1 == null ? ScreenshotPrivacy.UNRECOGNIZED : var1;
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
      if (this.defaultUploadPrivacy_ != ScreenshotPrivacy.SCREENSHOT_PRIVACY_UNSPECIFIED.getNumber()) {
         var1.writeEnum(1, this.defaultUploadPrivacy_);
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
      if (this.defaultUploadPrivacy_ != ScreenshotPrivacy.SCREENSHOT_PRIVACY_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(1, this.defaultUploadPrivacy_);
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

      if (!(var1 instanceof SetDefaultUploadPrivacyRequest)) {
         return super.equals(var1);
      }

      SetDefaultUploadPrivacyRequest var2 = (SetDefaultUploadPrivacyRequest)var1;
      return this.defaultUploadPrivacy_ != var2.defaultUploadPrivacy_ ? false : this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      var1 = 37 * var1 + 1;
      var1 = 53 * var1 + this.defaultUploadPrivacy_;
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static SetDefaultUploadPrivacyRequest parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static SetDefaultUploadPrivacyRequest parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SetDefaultUploadPrivacyRequest parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static SetDefaultUploadPrivacyRequest parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SetDefaultUploadPrivacyRequest parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static SetDefaultUploadPrivacyRequest parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static SetDefaultUploadPrivacyRequest parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SetDefaultUploadPrivacyRequest parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static SetDefaultUploadPrivacyRequest parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static SetDefaultUploadPrivacyRequest parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static SetDefaultUploadPrivacyRequest parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static SetDefaultUploadPrivacyRequest parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public SetDefaultUploadPrivacyRequest.Builder newBuilderForType() {
      return newBuilder();
   }

   public static SetDefaultUploadPrivacyRequest.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static SetDefaultUploadPrivacyRequest.Builder newBuilder(SetDefaultUploadPrivacyRequest var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public SetDefaultUploadPrivacyRequest.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new SetDefaultUploadPrivacyRequest.Builder() : new SetDefaultUploadPrivacyRequest.Builder().mergeFrom(this);
   }

   protected SetDefaultUploadPrivacyRequest.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new SetDefaultUploadPrivacyRequest.Builder(var1);
   }

   public static SetDefaultUploadPrivacyRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<SetDefaultUploadPrivacyRequest> parser() {
      return PARSER;
   }

   @Override
   public Parser<SetDefaultUploadPrivacyRequest> getParserForType() {
      return PARSER;
   }

   public SetDefaultUploadPrivacyRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder
      extends GeneratedMessageV3.Builder<SetDefaultUploadPrivacyRequest.Builder>
      implements SetDefaultUploadPrivacyRequestOrBuilder {
      private int bitField0_;
      private int defaultUploadPrivacy_ = 0;

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_screenshot_v1_SetDefaultUploadPrivacyRequest_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_screenshot_v1_SetDefaultUploadPrivacyRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(SetDefaultUploadPrivacyRequest.class, SetDefaultUploadPrivacyRequest.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public SetDefaultUploadPrivacyRequest.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.defaultUploadPrivacy_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_screenshot_v1_SetDefaultUploadPrivacyRequest_descriptor;
      }

      public SetDefaultUploadPrivacyRequest getDefaultInstanceForType() {
         return SetDefaultUploadPrivacyRequest.getDefaultInstance();
      }

      public SetDefaultUploadPrivacyRequest build() {
         SetDefaultUploadPrivacyRequest var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public SetDefaultUploadPrivacyRequest buildPartial() {
         SetDefaultUploadPrivacyRequest var1 = new SetDefaultUploadPrivacyRequest(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(SetDefaultUploadPrivacyRequest var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.defaultUploadPrivacy_ = this.defaultUploadPrivacy_;
         }
      }

      public SetDefaultUploadPrivacyRequest.Builder clone() {
         return (SetDefaultUploadPrivacyRequest.Builder)super.clone();
      }

      public SetDefaultUploadPrivacyRequest.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (SetDefaultUploadPrivacyRequest.Builder)super.setField(var1, var2);
      }

      public SetDefaultUploadPrivacyRequest.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (SetDefaultUploadPrivacyRequest.Builder)super.clearField(var1);
      }

      public SetDefaultUploadPrivacyRequest.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (SetDefaultUploadPrivacyRequest.Builder)super.clearOneof(var1);
      }

      public SetDefaultUploadPrivacyRequest.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (SetDefaultUploadPrivacyRequest.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public SetDefaultUploadPrivacyRequest.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (SetDefaultUploadPrivacyRequest.Builder)super.addRepeatedField(var1, var2);
      }

      public SetDefaultUploadPrivacyRequest.Builder mergeFrom(Message var1) {
         if (var1 instanceof SetDefaultUploadPrivacyRequest) {
            return this.mergeFrom((SetDefaultUploadPrivacyRequest)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public SetDefaultUploadPrivacyRequest.Builder mergeFrom(SetDefaultUploadPrivacyRequest var1) {
         if (var1 == SetDefaultUploadPrivacyRequest.getDefaultInstance()) {
            return this;
         }

         if (var1.defaultUploadPrivacy_ != 0) {
            this.setDefaultUploadPrivacyValue(var1.getDefaultUploadPrivacyValue());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public SetDefaultUploadPrivacyRequest.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.defaultUploadPrivacy_ = var1.readEnum();
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
      public int getDefaultUploadPrivacyValue() {
         return this.defaultUploadPrivacy_;
      }

      public SetDefaultUploadPrivacyRequest.Builder setDefaultUploadPrivacyValue(int var1) {
         this.defaultUploadPrivacy_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public ScreenshotPrivacy getDefaultUploadPrivacy() {
         ScreenshotPrivacy var1 = ScreenshotPrivacy.forNumber(this.defaultUploadPrivacy_);
         return var1 == null ? ScreenshotPrivacy.UNRECOGNIZED : var1;
      }

      public SetDefaultUploadPrivacyRequest.Builder setDefaultUploadPrivacy(ScreenshotPrivacy var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 1;
         this.defaultUploadPrivacy_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public SetDefaultUploadPrivacyRequest.Builder clearDefaultUploadPrivacy() {
         this.bitField0_ &= -2;
         this.defaultUploadPrivacy_ = 0;
         this.onChanged();
         return this;
      }

      public final SetDefaultUploadPrivacyRequest.Builder setUnknownFields(UnknownFieldSet var1) {
         return (SetDefaultUploadPrivacyRequest.Builder)super.setUnknownFields(var1);
      }

      public final SetDefaultUploadPrivacyRequest.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (SetDefaultUploadPrivacyRequest.Builder)super.mergeUnknownFields(var1);
      }
   }
}
