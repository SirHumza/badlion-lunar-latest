package com.lunarclient.websocket.conversation.v1;

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

public final class OgImage extends GeneratedMessageV3 implements OgImageOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int URL_FIELD_NUMBER = 1;
   private volatile Object url_ = "";
   public static final int WIDTH_FIELD_NUMBER = 2;
   private int width_ = 0;
   public static final int HEIGHT_FIELD_NUMBER = 3;
   private int height_ = 0;
   public static final int MIME_TYPE_FIELD_NUMBER = 4;
   private volatile Object mimeType_ = "";
   private byte memoizedIsInitialized = -1;
   private static final OgImage DEFAULT_INSTANCE = new OgImage();
   private static final Parser<OgImage> PARSER = new AbstractParser<OgImage>() {
      public OgImage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         OgImage.Builder var3 = OgImage.newBuilder();

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

   private OgImage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private OgImage() {
      this.url_ = "";
      this.mimeType_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new OgImage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_conversation_v1_OgImage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_conversation_v1_OgImage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(OgImage.class, OgImage.Builder.class);
   }

   @Override
   public String getUrl() {
      Object var1 = this.url_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.url_ = var3;
      return var3;
   }

   @Override
   public ByteString getUrlBytes() {
      Object var1 = this.url_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.url_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public boolean hasWidth() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public int getWidth() {
      return this.width_;
   }

   @Override
   public boolean hasHeight() {
      return (this.bitField0_ & 2) != 0;
   }

   @Override
   public int getHeight() {
      return this.height_;
   }

   @Override
   public String getMimeType() {
      Object var1 = this.mimeType_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.mimeType_ = var3;
      return var3;
   }

   @Override
   public ByteString getMimeTypeBytes() {
      Object var1 = this.mimeType_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.mimeType_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
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
      if (!GeneratedMessageV3.isStringEmpty(this.url_)) {
         GeneratedMessageV3.writeString(var1, 1, this.url_);
      }

      if ((this.bitField0_ & 1) != 0) {
         var1.writeUInt32(2, this.width_);
      }

      if ((this.bitField0_ & 2) != 0) {
         var1.writeUInt32(3, this.height_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.mimeType_)) {
         GeneratedMessageV3.writeString(var1, 4, this.mimeType_);
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
      if (!GeneratedMessageV3.isStringEmpty(this.url_)) {
         var1 += GeneratedMessageV3.computeStringSize(1, this.url_);
      }

      if ((this.bitField0_ & 1) != 0) {
         var1 += CodedOutputStream.computeUInt32Size(2, this.width_);
      }

      if ((this.bitField0_ & 2) != 0) {
         var1 += CodedOutputStream.computeUInt32Size(3, this.height_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.mimeType_)) {
         var1 += GeneratedMessageV3.computeStringSize(4, this.mimeType_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof OgImage)) {
         return super.equals(var1);
      } else {
         OgImage var2 = (OgImage)var1;
         if (!this.getUrl().equals(var2.getUrl())) {
            return false;
         } else if (this.hasWidth() != var2.hasWidth()) {
            return false;
         } else if (this.hasWidth() && this.getWidth() != var2.getWidth()) {
            return false;
         } else if (this.hasHeight() != var2.hasHeight()) {
            return false;
         } else if (this.hasHeight() && this.getHeight() != var2.getHeight()) {
            return false;
         } else {
            return !this.getMimeType().equals(var2.getMimeType()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + this.getUrl().hashCode();
      if (this.hasWidth()) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getWidth();
      }

      if (this.hasHeight()) {
         var1 = 37 * var1 + 3;
         var1 = 53 * var1 + this.getHeight();
      }

      var1 = 37 * var1 + 4;
      var1 = 53 * var1 + this.getMimeType().hashCode();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static OgImage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static OgImage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OgImage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static OgImage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OgImage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static OgImage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OgImage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static OgImage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static OgImage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static OgImage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static OgImage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static OgImage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public OgImage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static OgImage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static OgImage.Builder newBuilder(OgImage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public OgImage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new OgImage.Builder() : new OgImage.Builder().mergeFrom(this);
   }

   protected OgImage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new OgImage.Builder(var1);
   }

   public static OgImage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<OgImage> parser() {
      return PARSER;
   }

   @Override
   public Parser<OgImage> getParserForType() {
      return PARSER;
   }

   public OgImage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<OgImage.Builder> implements OgImageOrBuilder {
      private int bitField0_;
      private Object url_ = "";
      private int width_;
      private int height_;
      private Object mimeType_ = "";

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_conversation_v1_OgImage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_conversation_v1_OgImage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(OgImage.class, OgImage.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public OgImage.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.url_ = "";
         this.width_ = 0;
         this.height_ = 0;
         this.mimeType_ = "";
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_conversation_v1_OgImage_descriptor;
      }

      public OgImage getDefaultInstanceForType() {
         return OgImage.getDefaultInstance();
      }

      public OgImage build() {
         OgImage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public OgImage buildPartial() {
         OgImage var1 = new OgImage(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(OgImage var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.url_ = this.url_;
         }

         byte var3 = 0;
         if ((var2 & 2) != 0) {
            var1.width_ = this.width_;
            var3 |= 1;
         }

         if ((var2 & 4) != 0) {
            var1.height_ = this.height_;
            var3 |= 2;
         }

         if ((var2 & 8) != 0) {
            var1.mimeType_ = this.mimeType_;
         }

         OgImage var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public OgImage.Builder clone() {
         return (OgImage.Builder)super.clone();
      }

      public OgImage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (OgImage.Builder)super.setField(var1, var2);
      }

      public OgImage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (OgImage.Builder)super.clearField(var1);
      }

      public OgImage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (OgImage.Builder)super.clearOneof(var1);
      }

      public OgImage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (OgImage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public OgImage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (OgImage.Builder)super.addRepeatedField(var1, var2);
      }

      public OgImage.Builder mergeFrom(Message var1) {
         if (var1 instanceof OgImage) {
            return this.mergeFrom((OgImage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public OgImage.Builder mergeFrom(OgImage var1) {
         if (var1 == OgImage.getDefaultInstance()) {
            return this;
         }

         if (!var1.getUrl().isEmpty()) {
            this.url_ = var1.url_;
            this.bitField0_ |= 1;
            this.onChanged();
         }

         if (var1.hasWidth()) {
            this.setWidth(var1.getWidth());
         }

         if (var1.hasHeight()) {
            this.setHeight(var1.getHeight());
         }

         if (!var1.getMimeType().isEmpty()) {
            this.mimeType_ = var1.mimeType_;
            this.bitField0_ |= 8;
            this.onChanged();
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public OgImage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                  case 10:
                     this.url_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 1;
                     break;
                  case 16:
                     this.width_ = var1.readUInt32();
                     this.bitField0_ |= 2;
                     break;
                  case 24:
                     this.height_ = var1.readUInt32();
                     this.bitField0_ |= 4;
                     break;
                  case 34:
                     this.mimeType_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 8;
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
      public String getUrl() {
         Object var1 = this.url_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.url_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getUrlBytes() {
         Object var1 = this.url_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.url_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public OgImage.Builder setUrl(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.url_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public OgImage.Builder clearUrl() {
         this.url_ = OgImage.getDefaultInstance().getUrl();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public OgImage.Builder setUrlBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         OgImage.checkByteStringIsUtf8(var1);
         this.url_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasWidth() {
         return (this.bitField0_ & 2) != 0;
      }

      @Override
      public int getWidth() {
         return this.width_;
      }

      public OgImage.Builder setWidth(int var1) {
         this.width_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public OgImage.Builder clearWidth() {
         this.bitField0_ &= -3;
         this.width_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasHeight() {
         return (this.bitField0_ & 4) != 0;
      }

      @Override
      public int getHeight() {
         return this.height_;
      }

      public OgImage.Builder setHeight(int var1) {
         this.height_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public OgImage.Builder clearHeight() {
         this.bitField0_ &= -5;
         this.height_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public String getMimeType() {
         Object var1 = this.mimeType_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.mimeType_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getMimeTypeBytes() {
         Object var1 = this.mimeType_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.mimeType_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public OgImage.Builder setMimeType(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.mimeType_ = var1;
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public OgImage.Builder clearMimeType() {
         this.mimeType_ = OgImage.getDefaultInstance().getMimeType();
         this.bitField0_ &= -9;
         this.onChanged();
         return this;
      }

      public OgImage.Builder setMimeTypeBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         OgImage.checkByteStringIsUtf8(var1);
         this.mimeType_ = var1;
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public final OgImage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (OgImage.Builder)super.setUnknownFields(var1);
      }

      public final OgImage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (OgImage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
