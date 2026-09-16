package com.lunarclient.websocket.conversation.v1;

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
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class ImageEmbed extends GeneratedMessageV3 implements ImageEmbedOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int RAW_URL_FIELD_NUMBER = 1;
   private volatile Object rawUrl_ = "";
   public static final int NORMALIZED_URL_FIELD_NUMBER = 2;
   private volatile Object normalizedUrl_ = "";
   public static final int PROXIED_URL_FIELD_NUMBER = 3;
   private volatile Object proxiedUrl_ = "";
   public static final int MIME_TYPE_FIELD_NUMBER = 4;
   private volatile Object mimeType_ = "";
   public static final int WIDTH_FIELD_NUMBER = 5;
   private int width_ = 0;
   public static final int HEIGHT_FIELD_NUMBER = 6;
   private int height_ = 0;
   public static final int CONTENT_LENGTH_FIELD_NUMBER = 7;
   private long contentLength_ = 0L;
   private byte memoizedIsInitialized = -1;
   private static final ImageEmbed DEFAULT_INSTANCE = new ImageEmbed();
   private static final Parser<ImageEmbed> PARSER = new AbstractParser<ImageEmbed>() {
      public ImageEmbed parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         ImageEmbed.Builder var3 = ImageEmbed.newBuilder();

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

   private ImageEmbed(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private ImageEmbed() {
      this.rawUrl_ = "";
      this.normalizedUrl_ = "";
      this.proxiedUrl_ = "";
      this.mimeType_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new ImageEmbed();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_conversation_v1_ImageEmbed_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_conversation_v1_ImageEmbed_fieldAccessorTable
         .ensureFieldAccessorsInitialized(ImageEmbed.class, ImageEmbed.Builder.class);
   }

   @Override
   public String getRawUrl() {
      Object var1 = this.rawUrl_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.rawUrl_ = var3;
      return var3;
   }

   @Override
   public ByteString getRawUrlBytes() {
      Object var1 = this.rawUrl_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.rawUrl_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public String getNormalizedUrl() {
      Object var1 = this.normalizedUrl_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.normalizedUrl_ = var3;
      return var3;
   }

   @Override
   public ByteString getNormalizedUrlBytes() {
      Object var1 = this.normalizedUrl_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.normalizedUrl_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public String getProxiedUrl() {
      Object var1 = this.proxiedUrl_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.proxiedUrl_ = var3;
      return var3;
   }

   @Override
   public ByteString getProxiedUrlBytes() {
      Object var1 = this.proxiedUrl_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.proxiedUrl_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
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
   public boolean hasContentLength() {
      return (this.bitField0_ & 4) != 0;
   }

   @Override
   public long getContentLength() {
      return this.contentLength_;
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
      if (!GeneratedMessageV3.isStringEmpty(this.rawUrl_)) {
         GeneratedMessageV3.writeString(var1, 1, this.rawUrl_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.normalizedUrl_)) {
         GeneratedMessageV3.writeString(var1, 2, this.normalizedUrl_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.proxiedUrl_)) {
         GeneratedMessageV3.writeString(var1, 3, this.proxiedUrl_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.mimeType_)) {
         GeneratedMessageV3.writeString(var1, 4, this.mimeType_);
      }

      if ((this.bitField0_ & 1) != 0) {
         var1.writeUInt32(5, this.width_);
      }

      if ((this.bitField0_ & 2) != 0) {
         var1.writeUInt32(6, this.height_);
      }

      if ((this.bitField0_ & 4) != 0) {
         var1.writeUInt64(7, this.contentLength_);
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
      if (!GeneratedMessageV3.isStringEmpty(this.rawUrl_)) {
         var1 += GeneratedMessageV3.computeStringSize(1, this.rawUrl_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.normalizedUrl_)) {
         var1 += GeneratedMessageV3.computeStringSize(2, this.normalizedUrl_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.proxiedUrl_)) {
         var1 += GeneratedMessageV3.computeStringSize(3, this.proxiedUrl_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.mimeType_)) {
         var1 += GeneratedMessageV3.computeStringSize(4, this.mimeType_);
      }

      if ((this.bitField0_ & 1) != 0) {
         var1 += CodedOutputStream.computeUInt32Size(5, this.width_);
      }

      if ((this.bitField0_ & 2) != 0) {
         var1 += CodedOutputStream.computeUInt32Size(6, this.height_);
      }

      if ((this.bitField0_ & 4) != 0) {
         var1 += CodedOutputStream.computeUInt64Size(7, this.contentLength_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof ImageEmbed)) {
         return super.equals(var1);
      } else {
         ImageEmbed var2 = (ImageEmbed)var1;
         if (!this.getRawUrl().equals(var2.getRawUrl())) {
            return false;
         } else if (!this.getNormalizedUrl().equals(var2.getNormalizedUrl())) {
            return false;
         } else if (!this.getProxiedUrl().equals(var2.getProxiedUrl())) {
            return false;
         } else if (!this.getMimeType().equals(var2.getMimeType())) {
            return false;
         } else if (this.hasWidth() != var2.hasWidth()) {
            return false;
         } else if (this.hasWidth() && this.getWidth() != var2.getWidth()) {
            return false;
         } else if (this.hasHeight() != var2.hasHeight()) {
            return false;
         } else if (this.hasHeight() && this.getHeight() != var2.getHeight()) {
            return false;
         } else if (this.hasContentLength() != var2.hasContentLength()) {
            return false;
         } else {
            return this.hasContentLength() && this.getContentLength() != var2.getContentLength()
               ? false
               : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + this.getRawUrl().hashCode();
      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.getNormalizedUrl().hashCode();
      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + this.getProxiedUrl().hashCode();
      var1 = 37 * var1 + 4;
      var1 = 53 * var1 + this.getMimeType().hashCode();
      if (this.hasWidth()) {
         var1 = 37 * var1 + 5;
         var1 = 53 * var1 + this.getWidth();
      }

      if (this.hasHeight()) {
         var1 = 37 * var1 + 6;
         var1 = 53 * var1 + this.getHeight();
      }

      if (this.hasContentLength()) {
         var1 = 37 * var1 + 7;
         var1 = 53 * var1 + Internal.hashLong(this.getContentLength());
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static ImageEmbed parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static ImageEmbed parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ImageEmbed parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static ImageEmbed parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ImageEmbed parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static ImageEmbed parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ImageEmbed parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ImageEmbed parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ImageEmbed parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ImageEmbed parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ImageEmbed parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ImageEmbed parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public ImageEmbed.Builder newBuilderForType() {
      return newBuilder();
   }

   public static ImageEmbed.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ImageEmbed.Builder newBuilder(ImageEmbed var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public ImageEmbed.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new ImageEmbed.Builder() : new ImageEmbed.Builder().mergeFrom(this);
   }

   protected ImageEmbed.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new ImageEmbed.Builder(var1);
   }

   public static ImageEmbed getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<ImageEmbed> parser() {
      return PARSER;
   }

   @Override
   public Parser<ImageEmbed> getParserForType() {
      return PARSER;
   }

   public ImageEmbed getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<ImageEmbed.Builder> implements ImageEmbedOrBuilder {
      private int bitField0_;
      private Object rawUrl_ = "";
      private Object normalizedUrl_ = "";
      private Object proxiedUrl_ = "";
      private Object mimeType_ = "";
      private int width_;
      private int height_;
      private long contentLength_;

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_conversation_v1_ImageEmbed_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_conversation_v1_ImageEmbed_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ImageEmbed.class, ImageEmbed.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public ImageEmbed.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.rawUrl_ = "";
         this.normalizedUrl_ = "";
         this.proxiedUrl_ = "";
         this.mimeType_ = "";
         this.width_ = 0;
         this.height_ = 0;
         this.contentLength_ = 0L;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_conversation_v1_ImageEmbed_descriptor;
      }

      public ImageEmbed getDefaultInstanceForType() {
         return ImageEmbed.getDefaultInstance();
      }

      public ImageEmbed build() {
         ImageEmbed var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public ImageEmbed buildPartial() {
         ImageEmbed var1 = new ImageEmbed(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(ImageEmbed var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.rawUrl_ = this.rawUrl_;
         }

         if ((var2 & 2) != 0) {
            var1.normalizedUrl_ = this.normalizedUrl_;
         }

         if ((var2 & 4) != 0) {
            var1.proxiedUrl_ = this.proxiedUrl_;
         }

         if ((var2 & 8) != 0) {
            var1.mimeType_ = this.mimeType_;
         }

         byte var3 = 0;
         if ((var2 & 16) != 0) {
            var1.width_ = this.width_;
            var3 |= 1;
         }

         if ((var2 & 32) != 0) {
            var1.height_ = this.height_;
            var3 |= 2;
         }

         if ((var2 & 64) != 0) {
            var1.contentLength_ = this.contentLength_;
            var3 |= 4;
         }

         ImageEmbed var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public ImageEmbed.Builder clone() {
         return (ImageEmbed.Builder)super.clone();
      }

      public ImageEmbed.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ImageEmbed.Builder)super.setField(var1, var2);
      }

      public ImageEmbed.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (ImageEmbed.Builder)super.clearField(var1);
      }

      public ImageEmbed.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (ImageEmbed.Builder)super.clearOneof(var1);
      }

      public ImageEmbed.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (ImageEmbed.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public ImageEmbed.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ImageEmbed.Builder)super.addRepeatedField(var1, var2);
      }

      public ImageEmbed.Builder mergeFrom(Message var1) {
         if (var1 instanceof ImageEmbed) {
            return this.mergeFrom((ImageEmbed)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public ImageEmbed.Builder mergeFrom(ImageEmbed var1) {
         if (var1 == ImageEmbed.getDefaultInstance()) {
            return this;
         }

         if (!var1.getRawUrl().isEmpty()) {
            this.rawUrl_ = var1.rawUrl_;
            this.bitField0_ |= 1;
            this.onChanged();
         }

         if (!var1.getNormalizedUrl().isEmpty()) {
            this.normalizedUrl_ = var1.normalizedUrl_;
            this.bitField0_ |= 2;
            this.onChanged();
         }

         if (!var1.getProxiedUrl().isEmpty()) {
            this.proxiedUrl_ = var1.proxiedUrl_;
            this.bitField0_ |= 4;
            this.onChanged();
         }

         if (!var1.getMimeType().isEmpty()) {
            this.mimeType_ = var1.mimeType_;
            this.bitField0_ |= 8;
            this.onChanged();
         }

         if (var1.hasWidth()) {
            this.setWidth(var1.getWidth());
         }

         if (var1.hasHeight()) {
            this.setHeight(var1.getHeight());
         }

         if (var1.hasContentLength()) {
            this.setContentLength(var1.getContentLength());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public ImageEmbed.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.rawUrl_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     this.normalizedUrl_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 2;
                     break;
                  case 26:
                     this.proxiedUrl_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 4;
                     break;
                  case 34:
                     this.mimeType_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 8;
                     break;
                  case 40:
                     this.width_ = var1.readUInt32();
                     this.bitField0_ |= 16;
                     break;
                  case 48:
                     this.height_ = var1.readUInt32();
                     this.bitField0_ |= 32;
                     break;
                  case 56:
                     this.contentLength_ = var1.readUInt64();
                     this.bitField0_ |= 64;
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
      public String getRawUrl() {
         Object var1 = this.rawUrl_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.rawUrl_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getRawUrlBytes() {
         Object var1 = this.rawUrl_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.rawUrl_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public ImageEmbed.Builder setRawUrl(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.rawUrl_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public ImageEmbed.Builder clearRawUrl() {
         this.rawUrl_ = ImageEmbed.getDefaultInstance().getRawUrl();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public ImageEmbed.Builder setRawUrlBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         ImageEmbed.checkByteStringIsUtf8(var1);
         this.rawUrl_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public String getNormalizedUrl() {
         Object var1 = this.normalizedUrl_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.normalizedUrl_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getNormalizedUrlBytes() {
         Object var1 = this.normalizedUrl_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.normalizedUrl_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public ImageEmbed.Builder setNormalizedUrl(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.normalizedUrl_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public ImageEmbed.Builder clearNormalizedUrl() {
         this.normalizedUrl_ = ImageEmbed.getDefaultInstance().getNormalizedUrl();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      public ImageEmbed.Builder setNormalizedUrlBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         ImageEmbed.checkByteStringIsUtf8(var1);
         this.normalizedUrl_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      @Override
      public String getProxiedUrl() {
         Object var1 = this.proxiedUrl_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.proxiedUrl_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getProxiedUrlBytes() {
         Object var1 = this.proxiedUrl_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.proxiedUrl_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public ImageEmbed.Builder setProxiedUrl(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.proxiedUrl_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public ImageEmbed.Builder clearProxiedUrl() {
         this.proxiedUrl_ = ImageEmbed.getDefaultInstance().getProxiedUrl();
         this.bitField0_ &= -5;
         this.onChanged();
         return this;
      }

      public ImageEmbed.Builder setProxiedUrlBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         ImageEmbed.checkByteStringIsUtf8(var1);
         this.proxiedUrl_ = var1;
         this.bitField0_ |= 4;
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

      public ImageEmbed.Builder setMimeType(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.mimeType_ = var1;
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public ImageEmbed.Builder clearMimeType() {
         this.mimeType_ = ImageEmbed.getDefaultInstance().getMimeType();
         this.bitField0_ &= -9;
         this.onChanged();
         return this;
      }

      public ImageEmbed.Builder setMimeTypeBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         ImageEmbed.checkByteStringIsUtf8(var1);
         this.mimeType_ = var1;
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasWidth() {
         return (this.bitField0_ & 16) != 0;
      }

      @Override
      public int getWidth() {
         return this.width_;
      }

      public ImageEmbed.Builder setWidth(int var1) {
         this.width_ = var1;
         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      public ImageEmbed.Builder clearWidth() {
         this.bitField0_ &= -17;
         this.width_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasHeight() {
         return (this.bitField0_ & 32) != 0;
      }

      @Override
      public int getHeight() {
         return this.height_;
      }

      public ImageEmbed.Builder setHeight(int var1) {
         this.height_ = var1;
         this.bitField0_ |= 32;
         this.onChanged();
         return this;
      }

      public ImageEmbed.Builder clearHeight() {
         this.bitField0_ &= -33;
         this.height_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasContentLength() {
         return (this.bitField0_ & 64) != 0;
      }

      @Override
      public long getContentLength() {
         return this.contentLength_;
      }

      public ImageEmbed.Builder setContentLength(long var1) {
         this.contentLength_ = var1;
         this.bitField0_ |= 64;
         this.onChanged();
         return this;
      }

      public ImageEmbed.Builder clearContentLength() {
         this.bitField0_ &= -65;
         this.contentLength_ = 0L;
         this.onChanged();
         return this;
      }

      public final ImageEmbed.Builder setUnknownFields(UnknownFieldSet var1) {
         return (ImageEmbed.Builder)super.setUnknownFields(var1);
      }

      public final ImageEmbed.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (ImageEmbed.Builder)super.mergeUnknownFields(var1);
      }
   }
}
