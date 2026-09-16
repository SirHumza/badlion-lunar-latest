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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class LinkPreviewEmbed extends GeneratedMessageV3 implements LinkPreviewEmbedOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int RAW_URL_FIELD_NUMBER = 1;
   private volatile Object rawUrl_ = "";
   public static final int NORMALIZED_URL_FIELD_NUMBER = 2;
   private volatile Object normalizedUrl_ = "";
   public static final int PROXIED_URL_FIELD_NUMBER = 3;
   private volatile Object proxiedUrl_ = "";
   public static final int SITE_NAME_FIELD_NUMBER = 4;
   private volatile Object siteName_ = "";
   public static final int TITLE_FIELD_NUMBER = 5;
   private volatile Object title_ = "";
   public static final int DESCRIPTION_FIELD_NUMBER = 6;
   private volatile Object description_ = "";
   public static final int IMAGE_FIELD_NUMBER = 7;
   private OgImage image_;
   public static final int OG_TYPE_FIELD_NUMBER = 8;
   private volatile Object ogType_ = "";
   public static final int CONTENT_TYPE_FIELD_NUMBER = 9;
   private volatile Object contentType_ = "";
   private byte memoizedIsInitialized = -1;
   private static final LinkPreviewEmbed DEFAULT_INSTANCE = new LinkPreviewEmbed();
   private static final Parser<LinkPreviewEmbed> PARSER = new AbstractParser<LinkPreviewEmbed>() {
      public LinkPreviewEmbed parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         LinkPreviewEmbed.Builder var3 = LinkPreviewEmbed.newBuilder();

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

   private LinkPreviewEmbed(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private LinkPreviewEmbed() {
      this.rawUrl_ = "";
      this.normalizedUrl_ = "";
      this.proxiedUrl_ = "";
      this.siteName_ = "";
      this.title_ = "";
      this.description_ = "";
      this.ogType_ = "";
      this.contentType_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new LinkPreviewEmbed();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_conversation_v1_LinkPreviewEmbed_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_conversation_v1_LinkPreviewEmbed_fieldAccessorTable
         .ensureFieldAccessorsInitialized(LinkPreviewEmbed.class, LinkPreviewEmbed.Builder.class);
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
   public String getSiteName() {
      Object var1 = this.siteName_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.siteName_ = var3;
      return var3;
   }

   @Override
   public ByteString getSiteNameBytes() {
      Object var1 = this.siteName_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.siteName_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public String getTitle() {
      Object var1 = this.title_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.title_ = var3;
      return var3;
   }

   @Override
   public ByteString getTitleBytes() {
      Object var1 = this.title_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.title_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public String getDescription() {
      Object var1 = this.description_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.description_ = var3;
      return var3;
   }

   @Override
   public ByteString getDescriptionBytes() {
      Object var1 = this.description_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.description_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public boolean hasImage() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public OgImage getImage() {
      return this.image_ == null ? OgImage.getDefaultInstance() : this.image_;
   }

   @Override
   public OgImageOrBuilder getImageOrBuilder() {
      return this.image_ == null ? OgImage.getDefaultInstance() : this.image_;
   }

   @Override
   public String getOgType() {
      Object var1 = this.ogType_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.ogType_ = var3;
      return var3;
   }

   @Override
   public ByteString getOgTypeBytes() {
      Object var1 = this.ogType_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.ogType_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public String getContentType() {
      Object var1 = this.contentType_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.contentType_ = var3;
      return var3;
   }

   @Override
   public ByteString getContentTypeBytes() {
      Object var1 = this.contentType_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.contentType_ = var2;
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
      if (!GeneratedMessageV3.isStringEmpty(this.rawUrl_)) {
         GeneratedMessageV3.writeString(var1, 1, this.rawUrl_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.normalizedUrl_)) {
         GeneratedMessageV3.writeString(var1, 2, this.normalizedUrl_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.proxiedUrl_)) {
         GeneratedMessageV3.writeString(var1, 3, this.proxiedUrl_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.siteName_)) {
         GeneratedMessageV3.writeString(var1, 4, this.siteName_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.title_)) {
         GeneratedMessageV3.writeString(var1, 5, this.title_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.description_)) {
         GeneratedMessageV3.writeString(var1, 6, this.description_);
      }

      if ((this.bitField0_ & 1) != 0) {
         var1.writeMessage(7, this.getImage());
      }

      if (!GeneratedMessageV3.isStringEmpty(this.ogType_)) {
         GeneratedMessageV3.writeString(var1, 8, this.ogType_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.contentType_)) {
         GeneratedMessageV3.writeString(var1, 9, this.contentType_);
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

      if (!GeneratedMessageV3.isStringEmpty(this.siteName_)) {
         var1 += GeneratedMessageV3.computeStringSize(4, this.siteName_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.title_)) {
         var1 += GeneratedMessageV3.computeStringSize(5, this.title_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.description_)) {
         var1 += GeneratedMessageV3.computeStringSize(6, this.description_);
      }

      if ((this.bitField0_ & 1) != 0) {
         var1 += CodedOutputStream.computeMessageSize(7, this.getImage());
      }

      if (!GeneratedMessageV3.isStringEmpty(this.ogType_)) {
         var1 += GeneratedMessageV3.computeStringSize(8, this.ogType_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.contentType_)) {
         var1 += GeneratedMessageV3.computeStringSize(9, this.contentType_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof LinkPreviewEmbed)) {
         return super.equals(var1);
      } else {
         LinkPreviewEmbed var2 = (LinkPreviewEmbed)var1;
         if (!this.getRawUrl().equals(var2.getRawUrl())) {
            return false;
         } else if (!this.getNormalizedUrl().equals(var2.getNormalizedUrl())) {
            return false;
         } else if (!this.getProxiedUrl().equals(var2.getProxiedUrl())) {
            return false;
         } else if (!this.getSiteName().equals(var2.getSiteName())) {
            return false;
         } else if (!this.getTitle().equals(var2.getTitle())) {
            return false;
         } else if (!this.getDescription().equals(var2.getDescription())) {
            return false;
         } else if (this.hasImage() != var2.hasImage()) {
            return false;
         } else if (this.hasImage() && !this.getImage().equals(var2.getImage())) {
            return false;
         } else if (!this.getOgType().equals(var2.getOgType())) {
            return false;
         } else {
            return !this.getContentType().equals(var2.getContentType()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + this.getSiteName().hashCode();
      var1 = 37 * var1 + 5;
      var1 = 53 * var1 + this.getTitle().hashCode();
      var1 = 37 * var1 + 6;
      var1 = 53 * var1 + this.getDescription().hashCode();
      if (this.hasImage()) {
         var1 = 37 * var1 + 7;
         var1 = 53 * var1 + this.getImage().hashCode();
      }

      var1 = 37 * var1 + 8;
      var1 = 53 * var1 + this.getOgType().hashCode();
      var1 = 37 * var1 + 9;
      var1 = 53 * var1 + this.getContentType().hashCode();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static LinkPreviewEmbed parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static LinkPreviewEmbed parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LinkPreviewEmbed parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static LinkPreviewEmbed parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LinkPreviewEmbed parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static LinkPreviewEmbed parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LinkPreviewEmbed parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static LinkPreviewEmbed parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static LinkPreviewEmbed parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static LinkPreviewEmbed parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static LinkPreviewEmbed parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static LinkPreviewEmbed parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public LinkPreviewEmbed.Builder newBuilderForType() {
      return newBuilder();
   }

   public static LinkPreviewEmbed.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static LinkPreviewEmbed.Builder newBuilder(LinkPreviewEmbed var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public LinkPreviewEmbed.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new LinkPreviewEmbed.Builder() : new LinkPreviewEmbed.Builder().mergeFrom(this);
   }

   protected LinkPreviewEmbed.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new LinkPreviewEmbed.Builder(var1);
   }

   public static LinkPreviewEmbed getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<LinkPreviewEmbed> parser() {
      return PARSER;
   }

   @Override
   public Parser<LinkPreviewEmbed> getParserForType() {
      return PARSER;
   }

   public LinkPreviewEmbed getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<LinkPreviewEmbed.Builder> implements LinkPreviewEmbedOrBuilder {
      private int bitField0_;
      private Object rawUrl_ = "";
      private Object normalizedUrl_ = "";
      private Object proxiedUrl_ = "";
      private Object siteName_ = "";
      private Object title_ = "";
      private Object description_ = "";
      private OgImage image_;
      private SingleFieldBuilderV3<OgImage, OgImage.Builder, OgImageOrBuilder> imageBuilder_;
      private Object ogType_ = "";
      private Object contentType_ = "";

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_conversation_v1_LinkPreviewEmbed_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_conversation_v1_LinkPreviewEmbed_fieldAccessorTable
            .ensureFieldAccessorsInitialized(LinkPreviewEmbed.class, LinkPreviewEmbed.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (LinkPreviewEmbed.alwaysUseFieldBuilders) {
            this.getImageFieldBuilder();
         }
      }

      public LinkPreviewEmbed.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.rawUrl_ = "";
         this.normalizedUrl_ = "";
         this.proxiedUrl_ = "";
         this.siteName_ = "";
         this.title_ = "";
         this.description_ = "";
         this.image_ = null;
         if (this.imageBuilder_ != null) {
            this.imageBuilder_.dispose();
            this.imageBuilder_ = null;
         }

         this.ogType_ = "";
         this.contentType_ = "";
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_conversation_v1_LinkPreviewEmbed_descriptor;
      }

      public LinkPreviewEmbed getDefaultInstanceForType() {
         return LinkPreviewEmbed.getDefaultInstance();
      }

      public LinkPreviewEmbed build() {
         LinkPreviewEmbed var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public LinkPreviewEmbed buildPartial() {
         LinkPreviewEmbed var1 = new LinkPreviewEmbed(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(LinkPreviewEmbed var1) {
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
            var1.siteName_ = this.siteName_;
         }

         if ((var2 & 16) != 0) {
            var1.title_ = this.title_;
         }

         if ((var2 & 32) != 0) {
            var1.description_ = this.description_;
         }

         byte var3 = 0;
         if ((var2 & 64) != 0) {
            var1.image_ = this.imageBuilder_ == null ? this.image_ : this.imageBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 128) != 0) {
            var1.ogType_ = this.ogType_;
         }

         if ((var2 & 256) != 0) {
            var1.contentType_ = this.contentType_;
         }

         LinkPreviewEmbed var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public LinkPreviewEmbed.Builder clone() {
         return (LinkPreviewEmbed.Builder)super.clone();
      }

      public LinkPreviewEmbed.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (LinkPreviewEmbed.Builder)super.setField(var1, var2);
      }

      public LinkPreviewEmbed.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (LinkPreviewEmbed.Builder)super.clearField(var1);
      }

      public LinkPreviewEmbed.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (LinkPreviewEmbed.Builder)super.clearOneof(var1);
      }

      public LinkPreviewEmbed.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (LinkPreviewEmbed.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public LinkPreviewEmbed.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (LinkPreviewEmbed.Builder)super.addRepeatedField(var1, var2);
      }

      public LinkPreviewEmbed.Builder mergeFrom(Message var1) {
         if (var1 instanceof LinkPreviewEmbed) {
            return this.mergeFrom((LinkPreviewEmbed)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public LinkPreviewEmbed.Builder mergeFrom(LinkPreviewEmbed var1) {
         if (var1 == LinkPreviewEmbed.getDefaultInstance()) {
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

         if (!var1.getSiteName().isEmpty()) {
            this.siteName_ = var1.siteName_;
            this.bitField0_ |= 8;
            this.onChanged();
         }

         if (!var1.getTitle().isEmpty()) {
            this.title_ = var1.title_;
            this.bitField0_ |= 16;
            this.onChanged();
         }

         if (!var1.getDescription().isEmpty()) {
            this.description_ = var1.description_;
            this.bitField0_ |= 32;
            this.onChanged();
         }

         if (var1.hasImage()) {
            this.mergeImage(var1.getImage());
         }

         if (!var1.getOgType().isEmpty()) {
            this.ogType_ = var1.ogType_;
            this.bitField0_ |= 128;
            this.onChanged();
         }

         if (!var1.getContentType().isEmpty()) {
            this.contentType_ = var1.contentType_;
            this.bitField0_ |= 256;
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

      public LinkPreviewEmbed.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.siteName_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 8;
                     break;
                  case 42:
                     this.title_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 16;
                     break;
                  case 50:
                     this.description_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 32;
                     break;
                  case 58:
                     var1.readMessage(this.getImageFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 64;
                     break;
                  case 66:
                     this.ogType_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 128;
                     break;
                  case 74:
                     this.contentType_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 256;
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

      public LinkPreviewEmbed.Builder setRawUrl(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.rawUrl_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public LinkPreviewEmbed.Builder clearRawUrl() {
         this.rawUrl_ = LinkPreviewEmbed.getDefaultInstance().getRawUrl();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public LinkPreviewEmbed.Builder setRawUrlBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         LinkPreviewEmbed.checkByteStringIsUtf8(var1);
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

      public LinkPreviewEmbed.Builder setNormalizedUrl(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.normalizedUrl_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public LinkPreviewEmbed.Builder clearNormalizedUrl() {
         this.normalizedUrl_ = LinkPreviewEmbed.getDefaultInstance().getNormalizedUrl();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      public LinkPreviewEmbed.Builder setNormalizedUrlBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         LinkPreviewEmbed.checkByteStringIsUtf8(var1);
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

      public LinkPreviewEmbed.Builder setProxiedUrl(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.proxiedUrl_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public LinkPreviewEmbed.Builder clearProxiedUrl() {
         this.proxiedUrl_ = LinkPreviewEmbed.getDefaultInstance().getProxiedUrl();
         this.bitField0_ &= -5;
         this.onChanged();
         return this;
      }

      public LinkPreviewEmbed.Builder setProxiedUrlBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         LinkPreviewEmbed.checkByteStringIsUtf8(var1);
         this.proxiedUrl_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      @Override
      public String getSiteName() {
         Object var1 = this.siteName_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.siteName_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getSiteNameBytes() {
         Object var1 = this.siteName_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.siteName_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public LinkPreviewEmbed.Builder setSiteName(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.siteName_ = var1;
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public LinkPreviewEmbed.Builder clearSiteName() {
         this.siteName_ = LinkPreviewEmbed.getDefaultInstance().getSiteName();
         this.bitField0_ &= -9;
         this.onChanged();
         return this;
      }

      public LinkPreviewEmbed.Builder setSiteNameBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         LinkPreviewEmbed.checkByteStringIsUtf8(var1);
         this.siteName_ = var1;
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      @Override
      public String getTitle() {
         Object var1 = this.title_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.title_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getTitleBytes() {
         Object var1 = this.title_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.title_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public LinkPreviewEmbed.Builder setTitle(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.title_ = var1;
         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      public LinkPreviewEmbed.Builder clearTitle() {
         this.title_ = LinkPreviewEmbed.getDefaultInstance().getTitle();
         this.bitField0_ &= -17;
         this.onChanged();
         return this;
      }

      public LinkPreviewEmbed.Builder setTitleBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         LinkPreviewEmbed.checkByteStringIsUtf8(var1);
         this.title_ = var1;
         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      @Override
      public String getDescription() {
         Object var1 = this.description_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.description_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getDescriptionBytes() {
         Object var1 = this.description_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.description_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public LinkPreviewEmbed.Builder setDescription(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.description_ = var1;
         this.bitField0_ |= 32;
         this.onChanged();
         return this;
      }

      public LinkPreviewEmbed.Builder clearDescription() {
         this.description_ = LinkPreviewEmbed.getDefaultInstance().getDescription();
         this.bitField0_ &= -33;
         this.onChanged();
         return this;
      }

      public LinkPreviewEmbed.Builder setDescriptionBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         LinkPreviewEmbed.checkByteStringIsUtf8(var1);
         this.description_ = var1;
         this.bitField0_ |= 32;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasImage() {
         return (this.bitField0_ & 64) != 0;
      }

      @Override
      public OgImage getImage() {
         if (this.imageBuilder_ == null) {
            return this.image_ == null ? OgImage.getDefaultInstance() : this.image_;
         } else {
            return this.imageBuilder_.getMessage();
         }
      }

      public LinkPreviewEmbed.Builder setImage(OgImage var1) {
         if (this.imageBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.image_ = var1;
         } else {
            this.imageBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 64;
         this.onChanged();
         return this;
      }

      public LinkPreviewEmbed.Builder setImage(OgImage.Builder var1) {
         if (this.imageBuilder_ == null) {
            this.image_ = var1.build();
         } else {
            this.imageBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 64;
         this.onChanged();
         return this;
      }

      public LinkPreviewEmbed.Builder mergeImage(OgImage var1) {
         if (this.imageBuilder_ == null) {
            if ((this.bitField0_ & 64) != 0 && this.image_ != null && this.image_ != OgImage.getDefaultInstance()) {
               this.getImageBuilder().mergeFrom(var1);
            } else {
               this.image_ = var1;
            }
         } else {
            this.imageBuilder_.mergeFrom(var1);
         }

         if (this.image_ != null) {
            this.bitField0_ |= 64;
            this.onChanged();
         }

         return this;
      }

      public LinkPreviewEmbed.Builder clearImage() {
         this.bitField0_ &= -65;
         this.image_ = null;
         if (this.imageBuilder_ != null) {
            this.imageBuilder_.dispose();
            this.imageBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public OgImage.Builder getImageBuilder() {
         this.bitField0_ |= 64;
         this.onChanged();
         return this.getImageFieldBuilder().getBuilder();
      }

      @Override
      public OgImageOrBuilder getImageOrBuilder() {
         if (this.imageBuilder_ != null) {
            return this.imageBuilder_.getMessageOrBuilder();
         } else {
            return this.image_ == null ? OgImage.getDefaultInstance() : this.image_;
         }
      }

      private SingleFieldBuilderV3<OgImage, OgImage.Builder, OgImageOrBuilder> getImageFieldBuilder() {
         if (this.imageBuilder_ == null) {
            this.imageBuilder_ = new SingleFieldBuilderV3<>(this.getImage(), this.getParentForChildren(), this.isClean());
            this.image_ = null;
         }

         return this.imageBuilder_;
      }

      @Override
      public String getOgType() {
         Object var1 = this.ogType_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.ogType_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getOgTypeBytes() {
         Object var1 = this.ogType_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.ogType_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public LinkPreviewEmbed.Builder setOgType(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ogType_ = var1;
         this.bitField0_ |= 128;
         this.onChanged();
         return this;
      }

      public LinkPreviewEmbed.Builder clearOgType() {
         this.ogType_ = LinkPreviewEmbed.getDefaultInstance().getOgType();
         this.bitField0_ &= -129;
         this.onChanged();
         return this;
      }

      public LinkPreviewEmbed.Builder setOgTypeBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         LinkPreviewEmbed.checkByteStringIsUtf8(var1);
         this.ogType_ = var1;
         this.bitField0_ |= 128;
         this.onChanged();
         return this;
      }

      @Override
      public String getContentType() {
         Object var1 = this.contentType_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.contentType_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getContentTypeBytes() {
         Object var1 = this.contentType_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.contentType_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public LinkPreviewEmbed.Builder setContentType(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.contentType_ = var1;
         this.bitField0_ |= 256;
         this.onChanged();
         return this;
      }

      public LinkPreviewEmbed.Builder clearContentType() {
         this.contentType_ = LinkPreviewEmbed.getDefaultInstance().getContentType();
         this.bitField0_ &= -257;
         this.onChanged();
         return this;
      }

      public LinkPreviewEmbed.Builder setContentTypeBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         LinkPreviewEmbed.checkByteStringIsUtf8(var1);
         this.contentType_ = var1;
         this.bitField0_ |= 256;
         this.onChanged();
         return this;
      }

      public final LinkPreviewEmbed.Builder setUnknownFields(UnknownFieldSet var1) {
         return (LinkPreviewEmbed.Builder)super.setUnknownFields(var1);
      }

      public final LinkPreviewEmbed.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (LinkPreviewEmbed.Builder)super.mergeUnknownFields(var1);
      }
   }
}
