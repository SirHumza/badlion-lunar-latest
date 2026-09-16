package com.lunarclient.websocket.conversation.v1;

import com.google.protobuf.AbstractMessageLite;
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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.Timestamp;
import com.google.protobuf.TimestampOrBuilder;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class ConversationMessageEmbed extends GeneratedMessageV3 implements ConversationMessageEmbedOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private int embedCase_ = 0;
   private Object embed_;
   public static final int IMAGE_FIELD_NUMBER = 1;
   public static final int LINK_PREVIEW_FIELD_NUMBER = 2;
   public static final int CAPTURED_AT_FIELD_NUMBER = 3;
   private Timestamp capturedAt_;
   private byte memoizedIsInitialized = -1;
   private static final ConversationMessageEmbed DEFAULT_INSTANCE = new ConversationMessageEmbed();
   private static final Parser<ConversationMessageEmbed> PARSER = new AbstractParser<ConversationMessageEmbed>() {
      public ConversationMessageEmbed parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         ConversationMessageEmbed.Builder var3 = ConversationMessageEmbed.newBuilder();

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

   private ConversationMessageEmbed(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private ConversationMessageEmbed() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new ConversationMessageEmbed();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_conversation_v1_ConversationMessageEmbed_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_conversation_v1_ConversationMessageEmbed_fieldAccessorTable
         .ensureFieldAccessorsInitialized(ConversationMessageEmbed.class, ConversationMessageEmbed.Builder.class);
   }

   @Override
   public ConversationMessageEmbed.EmbedCase getEmbedCase() {
      return ConversationMessageEmbed.EmbedCase.forNumber(this.embedCase_);
   }

   @Override
   public boolean hasImage() {
      return this.embedCase_ == 1;
   }

   @Override
   public ImageEmbed getImage() {
      return this.embedCase_ == 1 ? (ImageEmbed)this.embed_ : ImageEmbed.getDefaultInstance();
   }

   @Override
   public ImageEmbedOrBuilder getImageOrBuilder() {
      return this.embedCase_ == 1 ? (ImageEmbed)this.embed_ : ImageEmbed.getDefaultInstance();
   }

   @Override
   public boolean hasLinkPreview() {
      return this.embedCase_ == 2;
   }

   @Override
   public LinkPreviewEmbed getLinkPreview() {
      return this.embedCase_ == 2 ? (LinkPreviewEmbed)this.embed_ : LinkPreviewEmbed.getDefaultInstance();
   }

   @Override
   public LinkPreviewEmbedOrBuilder getLinkPreviewOrBuilder() {
      return this.embedCase_ == 2 ? (LinkPreviewEmbed)this.embed_ : LinkPreviewEmbed.getDefaultInstance();
   }

   @Override
   public boolean hasCapturedAt() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public Timestamp getCapturedAt() {
      return this.capturedAt_ == null ? Timestamp.getDefaultInstance() : this.capturedAt_;
   }

   @Override
   public TimestampOrBuilder getCapturedAtOrBuilder() {
      return this.capturedAt_ == null ? Timestamp.getDefaultInstance() : this.capturedAt_;
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
      if (this.embedCase_ == 1) {
         var1.writeMessage(1, (ImageEmbed)this.embed_);
      }

      if (this.embedCase_ == 2) {
         var1.writeMessage(2, (LinkPreviewEmbed)this.embed_);
      }

      if ((this.bitField0_ & 1) != 0) {
         var1.writeMessage(3, this.getCapturedAt());
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
      if (this.embedCase_ == 1) {
         var1 += CodedOutputStream.computeMessageSize(1, (ImageEmbed)this.embed_);
      }

      if (this.embedCase_ == 2) {
         var1 += CodedOutputStream.computeMessageSize(2, (LinkPreviewEmbed)this.embed_);
      }

      if ((this.bitField0_ & 1) != 0) {
         var1 += CodedOutputStream.computeMessageSize(3, this.getCapturedAt());
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

      if (!(var1 instanceof ConversationMessageEmbed)) {
         return super.equals(var1);
      }

      ConversationMessageEmbed var2 = (ConversationMessageEmbed)var1;
      if (this.hasCapturedAt() != var2.hasCapturedAt()) {
         return false;
      }

      if (this.hasCapturedAt() && !this.getCapturedAt().equals(var2.getCapturedAt())) {
         return false;
      }

      if (!this.getEmbedCase().equals(var2.getEmbedCase())) {
         return false;
      }

      switch (this.embedCase_) {
         case 0:
         default:
            break;
         case 1:
            if (!this.getImage().equals(var2.getImage())) {
               return false;
            }
            break;
         case 2:
            if (!this.getLinkPreview().equals(var2.getLinkPreview())) {
               return false;
            }
      }

      return this.getUnknownFields().equals(var2.getUnknownFields());
   }

   @Override
   public int hashCode() {
      if (this.memoizedHashCode != 0) {
         return this.memoizedHashCode;
      }

      int var1 = 41;
      var1 = 19 * var1 + getDescriptor().hashCode();
      if (this.hasCapturedAt()) {
         var1 = 37 * var1 + 3;
         var1 = 53 * var1 + this.getCapturedAt().hashCode();
      }

      switch (this.embedCase_) {
         case 0:
         default:
            break;
         case 1:
            var1 = 37 * var1 + 1;
            var1 = 53 * var1 + this.getImage().hashCode();
            break;
         case 2:
            var1 = 37 * var1 + 2;
            var1 = 53 * var1 + this.getLinkPreview().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static ConversationMessageEmbed parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static ConversationMessageEmbed parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ConversationMessageEmbed parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static ConversationMessageEmbed parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ConversationMessageEmbed parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static ConversationMessageEmbed parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ConversationMessageEmbed parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ConversationMessageEmbed parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ConversationMessageEmbed parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ConversationMessageEmbed parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ConversationMessageEmbed parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ConversationMessageEmbed parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public ConversationMessageEmbed.Builder newBuilderForType() {
      return newBuilder();
   }

   public static ConversationMessageEmbed.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ConversationMessageEmbed.Builder newBuilder(ConversationMessageEmbed var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public ConversationMessageEmbed.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new ConversationMessageEmbed.Builder() : new ConversationMessageEmbed.Builder().mergeFrom(this);
   }

   protected ConversationMessageEmbed.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new ConversationMessageEmbed.Builder(var1);
   }

   public static ConversationMessageEmbed getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<ConversationMessageEmbed> parser() {
      return PARSER;
   }

   @Override
   public Parser<ConversationMessageEmbed> getParserForType() {
      return PARSER;
   }

   public ConversationMessageEmbed getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<ConversationMessageEmbed.Builder> implements ConversationMessageEmbedOrBuilder {
      private int embedCase_ = 0;
      private Object embed_;
      private int bitField0_;
      private SingleFieldBuilderV3<ImageEmbed, ImageEmbed.Builder, ImageEmbedOrBuilder> imageBuilder_;
      private SingleFieldBuilderV3<LinkPreviewEmbed, LinkPreviewEmbed.Builder, LinkPreviewEmbedOrBuilder> linkPreviewBuilder_;
      private Timestamp capturedAt_;
      private SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> capturedAtBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_conversation_v1_ConversationMessageEmbed_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_conversation_v1_ConversationMessageEmbed_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ConversationMessageEmbed.class, ConversationMessageEmbed.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (ConversationMessageEmbed.alwaysUseFieldBuilders) {
            this.getCapturedAtFieldBuilder();
         }
      }

      public ConversationMessageEmbed.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         if (this.imageBuilder_ != null) {
            this.imageBuilder_.clear();
         }

         if (this.linkPreviewBuilder_ != null) {
            this.linkPreviewBuilder_.clear();
         }

         this.capturedAt_ = null;
         if (this.capturedAtBuilder_ != null) {
            this.capturedAtBuilder_.dispose();
            this.capturedAtBuilder_ = null;
         }

         this.embedCase_ = 0;
         this.embed_ = null;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_conversation_v1_ConversationMessageEmbed_descriptor;
      }

      public ConversationMessageEmbed getDefaultInstanceForType() {
         return ConversationMessageEmbed.getDefaultInstance();
      }

      public ConversationMessageEmbed build() {
         ConversationMessageEmbed var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public ConversationMessageEmbed buildPartial() {
         ConversationMessageEmbed var1 = new ConversationMessageEmbed(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.buildPartialOneofs(var1);
         this.onBuilt();
         return var1;
      }

      private void buildPartial0(ConversationMessageEmbed var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 4) != 0) {
            var1.capturedAt_ = this.capturedAtBuilder_ == null ? this.capturedAt_ : this.capturedAtBuilder_.build();
            var3 |= 1;
         }

         ConversationMessageEmbed var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      private void buildPartialOneofs(ConversationMessageEmbed var1) {
         var1.embedCase_ = this.embedCase_;
         var1.embed_ = this.embed_;
         if (this.embedCase_ == 1 && this.imageBuilder_ != null) {
            var1.embed_ = this.imageBuilder_.build();
         }

         if (this.embedCase_ == 2 && this.linkPreviewBuilder_ != null) {
            var1.embed_ = this.linkPreviewBuilder_.build();
         }
      }

      public ConversationMessageEmbed.Builder clone() {
         return (ConversationMessageEmbed.Builder)super.clone();
      }

      public ConversationMessageEmbed.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ConversationMessageEmbed.Builder)super.setField(var1, var2);
      }

      public ConversationMessageEmbed.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (ConversationMessageEmbed.Builder)super.clearField(var1);
      }

      public ConversationMessageEmbed.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (ConversationMessageEmbed.Builder)super.clearOneof(var1);
      }

      public ConversationMessageEmbed.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (ConversationMessageEmbed.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public ConversationMessageEmbed.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ConversationMessageEmbed.Builder)super.addRepeatedField(var1, var2);
      }

      public ConversationMessageEmbed.Builder mergeFrom(Message var1) {
         if (var1 instanceof ConversationMessageEmbed) {
            return this.mergeFrom((ConversationMessageEmbed)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public ConversationMessageEmbed.Builder mergeFrom(ConversationMessageEmbed var1) {
         if (var1 == ConversationMessageEmbed.getDefaultInstance()) {
            return this;
         }

         if (var1.hasCapturedAt()) {
            this.mergeCapturedAt(var1.getCapturedAt());
         }

         switch (var1.getEmbedCase()) {
            case IMAGE:
               this.mergeImage(var1.getImage());
               break;
            case LINK_PREVIEW:
               this.mergeLinkPreview(var1.getLinkPreview());
            case EMBED_NOT_SET:
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public ConversationMessageEmbed.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getImageFieldBuilder().getBuilder(), var2);
                     this.embedCase_ = 1;
                     break;
                  case 18:
                     var1.readMessage(this.getLinkPreviewFieldBuilder().getBuilder(), var2);
                     this.embedCase_ = 2;
                     break;
                  case 26:
                     var1.readMessage(this.getCapturedAtFieldBuilder().getBuilder(), var2);
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
      public ConversationMessageEmbed.EmbedCase getEmbedCase() {
         return ConversationMessageEmbed.EmbedCase.forNumber(this.embedCase_);
      }

      public ConversationMessageEmbed.Builder clearEmbed() {
         this.embedCase_ = 0;
         this.embed_ = null;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasImage() {
         return this.embedCase_ == 1;
      }

      @Override
      public ImageEmbed getImage() {
         if (this.imageBuilder_ == null) {
            return this.embedCase_ == 1 ? (ImageEmbed)this.embed_ : ImageEmbed.getDefaultInstance();
         } else {
            return this.embedCase_ == 1 ? this.imageBuilder_.getMessage() : ImageEmbed.getDefaultInstance();
         }
      }

      public ConversationMessageEmbed.Builder setImage(ImageEmbed var1) {
         if (this.imageBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.embed_ = var1;
            this.onChanged();
         } else {
            this.imageBuilder_.setMessage(var1);
         }

         this.embedCase_ = 1;
         return this;
      }

      public ConversationMessageEmbed.Builder setImage(ImageEmbed.Builder var1) {
         if (this.imageBuilder_ == null) {
            this.embed_ = var1.build();
            this.onChanged();
         } else {
            this.imageBuilder_.setMessage(var1.build());
         }

         this.embedCase_ = 1;
         return this;
      }

      public ConversationMessageEmbed.Builder mergeImage(ImageEmbed var1) {
         if (this.imageBuilder_ == null) {
            if (this.embedCase_ == 1 && this.embed_ != ImageEmbed.getDefaultInstance()) {
               this.embed_ = ImageEmbed.newBuilder((ImageEmbed)this.embed_).mergeFrom(var1).buildPartial();
            } else {
               this.embed_ = var1;
            }

            this.onChanged();
         } else if (this.embedCase_ == 1) {
            this.imageBuilder_.mergeFrom(var1);
         } else {
            this.imageBuilder_.setMessage(var1);
         }

         this.embedCase_ = 1;
         return this;
      }

      public ConversationMessageEmbed.Builder clearImage() {
         if (this.imageBuilder_ == null) {
            if (this.embedCase_ == 1) {
               this.embedCase_ = 0;
               this.embed_ = null;
               this.onChanged();
            }
         } else {
            if (this.embedCase_ == 1) {
               this.embedCase_ = 0;
               this.embed_ = null;
            }

            this.imageBuilder_.clear();
         }

         return this;
      }

      public ImageEmbed.Builder getImageBuilder() {
         return this.getImageFieldBuilder().getBuilder();
      }

      @Override
      public ImageEmbedOrBuilder getImageOrBuilder() {
         if (this.embedCase_ == 1 && this.imageBuilder_ != null) {
            return this.imageBuilder_.getMessageOrBuilder();
         } else {
            return this.embedCase_ == 1 ? (ImageEmbed)this.embed_ : ImageEmbed.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<ImageEmbed, ImageEmbed.Builder, ImageEmbedOrBuilder> getImageFieldBuilder() {
         if (this.imageBuilder_ == null) {
            if (this.embedCase_ != 1) {
               this.embed_ = ImageEmbed.getDefaultInstance();
            }

            this.imageBuilder_ = new SingleFieldBuilderV3<>((ImageEmbed)this.embed_, this.getParentForChildren(), this.isClean());
            this.embed_ = null;
         }

         this.embedCase_ = 1;
         this.onChanged();
         return this.imageBuilder_;
      }

      @Override
      public boolean hasLinkPreview() {
         return this.embedCase_ == 2;
      }

      @Override
      public LinkPreviewEmbed getLinkPreview() {
         if (this.linkPreviewBuilder_ == null) {
            return this.embedCase_ == 2 ? (LinkPreviewEmbed)this.embed_ : LinkPreviewEmbed.getDefaultInstance();
         } else {
            return this.embedCase_ == 2 ? this.linkPreviewBuilder_.getMessage() : LinkPreviewEmbed.getDefaultInstance();
         }
      }

      public ConversationMessageEmbed.Builder setLinkPreview(LinkPreviewEmbed var1) {
         if (this.linkPreviewBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.embed_ = var1;
            this.onChanged();
         } else {
            this.linkPreviewBuilder_.setMessage(var1);
         }

         this.embedCase_ = 2;
         return this;
      }

      public ConversationMessageEmbed.Builder setLinkPreview(LinkPreviewEmbed.Builder var1) {
         if (this.linkPreviewBuilder_ == null) {
            this.embed_ = var1.build();
            this.onChanged();
         } else {
            this.linkPreviewBuilder_.setMessage(var1.build());
         }

         this.embedCase_ = 2;
         return this;
      }

      public ConversationMessageEmbed.Builder mergeLinkPreview(LinkPreviewEmbed var1) {
         if (this.linkPreviewBuilder_ == null) {
            if (this.embedCase_ == 2 && this.embed_ != LinkPreviewEmbed.getDefaultInstance()) {
               this.embed_ = LinkPreviewEmbed.newBuilder((LinkPreviewEmbed)this.embed_).mergeFrom(var1).buildPartial();
            } else {
               this.embed_ = var1;
            }

            this.onChanged();
         } else if (this.embedCase_ == 2) {
            this.linkPreviewBuilder_.mergeFrom(var1);
         } else {
            this.linkPreviewBuilder_.setMessage(var1);
         }

         this.embedCase_ = 2;
         return this;
      }

      public ConversationMessageEmbed.Builder clearLinkPreview() {
         if (this.linkPreviewBuilder_ == null) {
            if (this.embedCase_ == 2) {
               this.embedCase_ = 0;
               this.embed_ = null;
               this.onChanged();
            }
         } else {
            if (this.embedCase_ == 2) {
               this.embedCase_ = 0;
               this.embed_ = null;
            }

            this.linkPreviewBuilder_.clear();
         }

         return this;
      }

      public LinkPreviewEmbed.Builder getLinkPreviewBuilder() {
         return this.getLinkPreviewFieldBuilder().getBuilder();
      }

      @Override
      public LinkPreviewEmbedOrBuilder getLinkPreviewOrBuilder() {
         if (this.embedCase_ == 2 && this.linkPreviewBuilder_ != null) {
            return this.linkPreviewBuilder_.getMessageOrBuilder();
         } else {
            return this.embedCase_ == 2 ? (LinkPreviewEmbed)this.embed_ : LinkPreviewEmbed.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<LinkPreviewEmbed, LinkPreviewEmbed.Builder, LinkPreviewEmbedOrBuilder> getLinkPreviewFieldBuilder() {
         if (this.linkPreviewBuilder_ == null) {
            if (this.embedCase_ != 2) {
               this.embed_ = LinkPreviewEmbed.getDefaultInstance();
            }

            this.linkPreviewBuilder_ = new SingleFieldBuilderV3<>((LinkPreviewEmbed)this.embed_, this.getParentForChildren(), this.isClean());
            this.embed_ = null;
         }

         this.embedCase_ = 2;
         this.onChanged();
         return this.linkPreviewBuilder_;
      }

      @Override
      public boolean hasCapturedAt() {
         return (this.bitField0_ & 4) != 0;
      }

      @Override
      public Timestamp getCapturedAt() {
         if (this.capturedAtBuilder_ == null) {
            return this.capturedAt_ == null ? Timestamp.getDefaultInstance() : this.capturedAt_;
         } else {
            return this.capturedAtBuilder_.getMessage();
         }
      }

      public ConversationMessageEmbed.Builder setCapturedAt(Timestamp var1) {
         if (this.capturedAtBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.capturedAt_ = var1;
         } else {
            this.capturedAtBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public ConversationMessageEmbed.Builder setCapturedAt(Timestamp.Builder var1) {
         if (this.capturedAtBuilder_ == null) {
            this.capturedAt_ = var1.build();
         } else {
            this.capturedAtBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public ConversationMessageEmbed.Builder mergeCapturedAt(Timestamp var1) {
         if (this.capturedAtBuilder_ == null) {
            if ((this.bitField0_ & 4) != 0 && this.capturedAt_ != null && this.capturedAt_ != Timestamp.getDefaultInstance()) {
               this.getCapturedAtBuilder().mergeFrom(var1);
            } else {
               this.capturedAt_ = var1;
            }
         } else {
            this.capturedAtBuilder_.mergeFrom(var1);
         }

         if (this.capturedAt_ != null) {
            this.bitField0_ |= 4;
            this.onChanged();
         }

         return this;
      }

      public ConversationMessageEmbed.Builder clearCapturedAt() {
         this.bitField0_ &= -5;
         this.capturedAt_ = null;
         if (this.capturedAtBuilder_ != null) {
            this.capturedAtBuilder_.dispose();
            this.capturedAtBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Timestamp.Builder getCapturedAtBuilder() {
         this.bitField0_ |= 4;
         this.onChanged();
         return this.getCapturedAtFieldBuilder().getBuilder();
      }

      @Override
      public TimestampOrBuilder getCapturedAtOrBuilder() {
         if (this.capturedAtBuilder_ != null) {
            return this.capturedAtBuilder_.getMessageOrBuilder();
         } else {
            return this.capturedAt_ == null ? Timestamp.getDefaultInstance() : this.capturedAt_;
         }
      }

      private SingleFieldBuilderV3<Timestamp, Timestamp.Builder, TimestampOrBuilder> getCapturedAtFieldBuilder() {
         if (this.capturedAtBuilder_ == null) {
            this.capturedAtBuilder_ = new SingleFieldBuilderV3<>(this.getCapturedAt(), this.getParentForChildren(), this.isClean());
            this.capturedAt_ = null;
         }

         return this.capturedAtBuilder_;
      }

      public final ConversationMessageEmbed.Builder setUnknownFields(UnknownFieldSet var1) {
         return (ConversationMessageEmbed.Builder)super.setUnknownFields(var1);
      }

      public final ConversationMessageEmbed.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (ConversationMessageEmbed.Builder)super.mergeUnknownFields(var1);
      }
   }

   public enum EmbedCase implements AbstractMessageLite.InternalOneOfEnum, Internal.EnumLite {
      IMAGE(1),
      LINK_PREVIEW(2),
      EMBED_NOT_SET(0);

      private final int value;

      EmbedCase(int var3) {
         this.value = var3;
      }

      @Deprecated
      public static ConversationMessageEmbed.EmbedCase valueOf(int var0) {
         return forNumber(var0);
      }

      public static ConversationMessageEmbed.EmbedCase forNumber(int var0) {
         switch (var0) {
            case 0:
               return EMBED_NOT_SET;
            case 1:
               return IMAGE;
            case 2:
               return LINK_PREVIEW;
            default:
               return null;
         }
      }

      @Override
      public int getNumber() {
         return this.value;
      }
   }
}
