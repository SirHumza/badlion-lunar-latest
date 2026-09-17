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
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ConversationMessageContents extends GeneratedMessageV3 implements ConversationMessageContentsOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   private int contentsCase_ = 0;
   private Object contents_;
   public static final int PLAIN_TEXT_FIELD_NUMBER = 1;
   public static final int STICKER_FIELD_NUMBER = 2;
   public static final int SYSTEM_FIELD_NUMBER = 5;
   public static final int IMAGES_FIELD_NUMBER = 3;
   private List<ConversationImage> images_;
   public static final int EMBED_FIELD_NUMBER = 4;
   private ConversationMessageEmbed embed_;
   private byte memoizedIsInitialized = -1;
   private static final ConversationMessageContents DEFAULT_INSTANCE = new ConversationMessageContents();
   private static final Parser<ConversationMessageContents> PARSER = new AbstractParser<ConversationMessageContents>() {
      public ConversationMessageContents parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         ConversationMessageContents.Builder var3 = ConversationMessageContents.newBuilder();

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

   private ConversationMessageContents(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private ConversationMessageContents() {
      this.images_ = Collections.emptyList();
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new ConversationMessageContents();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_conversation_v1_ConversationMessageContents_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_conversation_v1_ConversationMessageContents_fieldAccessorTable
         .ensureFieldAccessorsInitialized(ConversationMessageContents.class, ConversationMessageContents.Builder.class);
   }

   @Override
   public ConversationMessageContents.ContentsCase getContentsCase() {
      return ConversationMessageContents.ContentsCase.forNumber(this.contentsCase_);
   }

   @Override
   public boolean hasPlainText() {
      return this.contentsCase_ == 1;
   }

   @Override
   public String getPlainText() {
      Object var1 = "";
      if (this.contentsCase_ == 1) {
         var1 = this.contents_;
      }

      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      if (this.contentsCase_ == 1) {
         this.contents_ = var3;
      }

      return var3;
   }

   @Override
   public ByteString getPlainTextBytes() {
      Object var1 = "";
      if (this.contentsCase_ == 1) {
         var1 = this.contents_;
      }

      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         if (this.contentsCase_ == 1) {
            this.contents_ = var2;
         }

         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public boolean hasSticker() {
      return this.contentsCase_ == 2;
   }

   @Override
   public LunarSticker getSticker() {
      return this.contentsCase_ == 2 ? (LunarSticker)this.contents_ : LunarSticker.getDefaultInstance();
   }

   @Override
   public LunarStickerOrBuilder getStickerOrBuilder() {
      return this.contentsCase_ == 2 ? (LunarSticker)this.contents_ : LunarSticker.getDefaultInstance();
   }

   @Override
   public boolean hasSystem() {
      return this.contentsCase_ == 5;
   }

   @Override
   public SystemMessage getSystem() {
      return this.contentsCase_ == 5 ? (SystemMessage)this.contents_ : SystemMessage.getDefaultInstance();
   }

   @Override
   public SystemMessageOrBuilder getSystemOrBuilder() {
      return this.contentsCase_ == 5 ? (SystemMessage)this.contents_ : SystemMessage.getDefaultInstance();
   }

   @Override
   public List<ConversationImage> getImagesList() {
      return this.images_;
   }

   @Override
   public List<? extends ConversationImageOrBuilder> getImagesOrBuilderList() {
      return this.images_;
   }

   @Override
   public int getImagesCount() {
      return this.images_.size();
   }

   @Override
   public ConversationImage getImages(int var1) {
      return this.images_.get(var1);
   }

   @Override
   public ConversationImageOrBuilder getImagesOrBuilder(int var1) {
      return this.images_.get(var1);
   }

   @Override
   public boolean hasEmbed() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public ConversationMessageEmbed getEmbed() {
      return this.embed_ == null ? ConversationMessageEmbed.getDefaultInstance() : this.embed_;
   }

   @Override
   public ConversationMessageEmbedOrBuilder getEmbedOrBuilder() {
      return this.embed_ == null ? ConversationMessageEmbed.getDefaultInstance() : this.embed_;
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
      if (this.contentsCase_ == 1) {
         GeneratedMessageV3.writeString(var1, 1, this.contents_);
      }

      if (this.contentsCase_ == 2) {
         var1.writeMessage(2, (LunarSticker)this.contents_);
      }

      for (int var2 = 0; var2 < this.images_.size(); var2++) {
         var1.writeMessage(3, this.images_.get(var2));
      }

      if ((this.bitField0_ & 1) != 0) {
         var1.writeMessage(4, this.getEmbed());
      }

      if (this.contentsCase_ == 5) {
         var1.writeMessage(5, (SystemMessage)this.contents_);
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
      if (this.contentsCase_ == 1) {
         var1 += GeneratedMessageV3.computeStringSize(1, this.contents_);
      }

      if (this.contentsCase_ == 2) {
         var1 += CodedOutputStream.computeMessageSize(2, (LunarSticker)this.contents_);
      }

      for (int var2 = 0; var2 < this.images_.size(); var2++) {
         var1 += CodedOutputStream.computeMessageSize(3, this.images_.get(var2));
      }

      if ((this.bitField0_ & 1) != 0) {
         var1 += CodedOutputStream.computeMessageSize(4, this.getEmbed());
      }

      if (this.contentsCase_ == 5) {
         var1 += CodedOutputStream.computeMessageSize(5, (SystemMessage)this.contents_);
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

      if (!(var1 instanceof ConversationMessageContents)) {
         return super.equals(var1);
      }

      ConversationMessageContents var2 = (ConversationMessageContents)var1;
      if (!this.getImagesList().equals(var2.getImagesList())) {
         return false;
      }

      if (this.hasEmbed() != var2.hasEmbed()) {
         return false;
      }

      if (this.hasEmbed() && !this.getEmbed().equals(var2.getEmbed())) {
         return false;
      }

      if (!this.getContentsCase().equals(var2.getContentsCase())) {
         return false;
      }

      switch (this.contentsCase_) {
         case 0:
         case 3:
         case 4:
         default:
            break;
         case 1:
            if (!this.getPlainText().equals(var2.getPlainText())) {
               return false;
            }
            break;
         case 2:
            if (!this.getSticker().equals(var2.getSticker())) {
               return false;
            }
            break;
         case 5:
            if (!this.getSystem().equals(var2.getSystem())) {
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
      if (this.getImagesCount() > 0) {
         var1 = 37 * var1 + 3;
         var1 = 53 * var1 + this.getImagesList().hashCode();
      }

      if (this.hasEmbed()) {
         var1 = 37 * var1 + 4;
         var1 = 53 * var1 + this.getEmbed().hashCode();
      }

      switch (this.contentsCase_) {
         case 0:
         case 3:
         case 4:
         default:
            break;
         case 1:
            var1 = 37 * var1 + 1;
            var1 = 53 * var1 + this.getPlainText().hashCode();
            break;
         case 2:
            var1 = 37 * var1 + 2;
            var1 = 53 * var1 + this.getSticker().hashCode();
            break;
         case 5:
            var1 = 37 * var1 + 5;
            var1 = 53 * var1 + this.getSystem().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static ConversationMessageContents parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static ConversationMessageContents parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ConversationMessageContents parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static ConversationMessageContents parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ConversationMessageContents parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static ConversationMessageContents parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ConversationMessageContents parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ConversationMessageContents parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ConversationMessageContents parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ConversationMessageContents parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ConversationMessageContents parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ConversationMessageContents parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public ConversationMessageContents.Builder newBuilderForType() {
      return newBuilder();
   }

   public static ConversationMessageContents.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ConversationMessageContents.Builder newBuilder(ConversationMessageContents var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public ConversationMessageContents.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new ConversationMessageContents.Builder() : new ConversationMessageContents.Builder().mergeFrom(this);
   }

   protected ConversationMessageContents.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new ConversationMessageContents.Builder(var1);
   }

   public static ConversationMessageContents getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<ConversationMessageContents> parser() {
      return PARSER;
   }

   @Override
   public Parser<ConversationMessageContents> getParserForType() {
      return PARSER;
   }

   public ConversationMessageContents getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<ConversationMessageContents.Builder> implements ConversationMessageContentsOrBuilder {
      private int contentsCase_ = 0;
      private Object contents_;
      private int bitField0_;
      private SingleFieldBuilderV3<LunarSticker, LunarSticker.Builder, LunarStickerOrBuilder> stickerBuilder_;
      private SingleFieldBuilderV3<SystemMessage, SystemMessage.Builder, SystemMessageOrBuilder> systemBuilder_;
      private List<ConversationImage> images_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<ConversationImage, ConversationImage.Builder, ConversationImageOrBuilder> imagesBuilder_;
      private ConversationMessageEmbed embed_;
      private SingleFieldBuilderV3<ConversationMessageEmbed, ConversationMessageEmbed.Builder, ConversationMessageEmbedOrBuilder> embedBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_conversation_v1_ConversationMessageContents_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_conversation_v1_ConversationMessageContents_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ConversationMessageContents.class, ConversationMessageContents.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (ConversationMessageContents.alwaysUseFieldBuilders) {
            this.getImagesFieldBuilder();
            this.getEmbedFieldBuilder();
         }
      }

      public ConversationMessageContents.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         if (this.stickerBuilder_ != null) {
            this.stickerBuilder_.clear();
         }

         if (this.systemBuilder_ != null) {
            this.systemBuilder_.clear();
         }

         if (this.imagesBuilder_ == null) {
            this.images_ = Collections.emptyList();
         } else {
            this.images_ = null;
            this.imagesBuilder_.clear();
         }

         this.bitField0_ &= -9;
         this.embed_ = null;
         if (this.embedBuilder_ != null) {
            this.embedBuilder_.dispose();
            this.embedBuilder_ = null;
         }

         this.contentsCase_ = 0;
         this.contents_ = null;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_conversation_v1_ConversationMessageContents_descriptor;
      }

      public ConversationMessageContents getDefaultInstanceForType() {
         return ConversationMessageContents.getDefaultInstance();
      }

      public ConversationMessageContents build() {
         ConversationMessageContents var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public ConversationMessageContents buildPartial() {
         ConversationMessageContents var1 = new ConversationMessageContents(this);
         this.buildPartialRepeatedFields(var1);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.buildPartialOneofs(var1);
         this.onBuilt();
         return var1;
      }

      private void buildPartialRepeatedFields(ConversationMessageContents var1) {
         if (this.imagesBuilder_ == null) {
            if ((this.bitField0_ & 8) != 0) {
               this.images_ = Collections.unmodifiableList(this.images_);
               this.bitField0_ &= -9;
            }

            var1.images_ = this.images_;
         } else {
            var1.images_ = this.imagesBuilder_.build();
         }
      }

      private void buildPartial0(ConversationMessageContents var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 16) != 0) {
            var1.embed_ = this.embedBuilder_ == null ? this.embed_ : this.embedBuilder_.build();
            var3 |= 1;
         }

         ConversationMessageContents var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      private void buildPartialOneofs(ConversationMessageContents var1) {
         var1.contentsCase_ = this.contentsCase_;
         var1.contents_ = this.contents_;
         if (this.contentsCase_ == 2 && this.stickerBuilder_ != null) {
            var1.contents_ = this.stickerBuilder_.build();
         }

         if (this.contentsCase_ == 5 && this.systemBuilder_ != null) {
            var1.contents_ = this.systemBuilder_.build();
         }
      }

      public ConversationMessageContents.Builder clone() {
         return (ConversationMessageContents.Builder)super.clone();
      }

      public ConversationMessageContents.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ConversationMessageContents.Builder)super.setField(var1, var2);
      }

      public ConversationMessageContents.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (ConversationMessageContents.Builder)super.clearField(var1);
      }

      public ConversationMessageContents.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (ConversationMessageContents.Builder)super.clearOneof(var1);
      }

      public ConversationMessageContents.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (ConversationMessageContents.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public ConversationMessageContents.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ConversationMessageContents.Builder)super.addRepeatedField(var1, var2);
      }

      public ConversationMessageContents.Builder mergeFrom(Message var1) {
         if (var1 instanceof ConversationMessageContents) {
            return this.mergeFrom((ConversationMessageContents)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public ConversationMessageContents.Builder mergeFrom(ConversationMessageContents var1) {
         if (var1 == ConversationMessageContents.getDefaultInstance()) {
            return this;
         }

         if (this.imagesBuilder_ == null) {
            if (!var1.images_.isEmpty()) {
               if (this.images_.isEmpty()) {
                  this.images_ = var1.images_;
                  this.bitField0_ &= -9;
               } else {
                  this.ensureImagesIsMutable();
                  this.images_.addAll(var1.images_);
               }

               this.onChanged();
            }
         } else if (!var1.images_.isEmpty()) {
            if (this.imagesBuilder_.isEmpty()) {
               this.imagesBuilder_.dispose();
               this.imagesBuilder_ = null;
               this.images_ = var1.images_;
               this.bitField0_ &= -9;
               this.imagesBuilder_ = ConversationMessageContents.alwaysUseFieldBuilders ? this.getImagesFieldBuilder() : null;
            } else {
               this.imagesBuilder_.addAllMessages(var1.images_);
            }
         }

         if (var1.hasEmbed()) {
            this.mergeEmbed(var1.getEmbed());
         }

         switch (var1.getContentsCase()) {
            case PLAIN_TEXT:
               this.contentsCase_ = 1;
               this.contents_ = var1.contents_;
               this.onChanged();
               break;
            case STICKER:
               this.mergeSticker(var1.getSticker());
               break;
            case SYSTEM:
               this.mergeSystem(var1.getSystem());
            case CONTENTS_NOT_SET:
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public ConversationMessageContents.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     String var11 = var1.readStringRequireUtf8();
                     this.contentsCase_ = 1;
                     this.contents_ = var11;
                     break;
                  case 18:
                     var1.readMessage(this.getStickerFieldBuilder().getBuilder(), var2);
                     this.contentsCase_ = 2;
                     break;
                  case 26:
                     ConversationImage var5 = var1.readMessage(ConversationImage.parser(), var2);
                     if (this.imagesBuilder_ == null) {
                        this.ensureImagesIsMutable();
                        this.images_.add(var5);
                     } else {
                        this.imagesBuilder_.addMessage(var5);
                     }
                     break;
                  case 34:
                     var1.readMessage(this.getEmbedFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 16;
                     break;
                  case 42:
                     var1.readMessage(this.getSystemFieldBuilder().getBuilder(), var2);
                     this.contentsCase_ = 5;
                     break;
                  default:
                     if (!super.parseUnknownField(var1, var2, var4)) {
                        var3 = true;
                     }
               }
            }
         } catch (InvalidProtocolBufferException var9) {
            throw var9.unwrapIOException();
         } finally {
            this.onChanged();
         }

         return this;
      }

      @Override
      public ConversationMessageContents.ContentsCase getContentsCase() {
         return ConversationMessageContents.ContentsCase.forNumber(this.contentsCase_);
      }

      public ConversationMessageContents.Builder clearContents() {
         this.contentsCase_ = 0;
         this.contents_ = null;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasPlainText() {
         return this.contentsCase_ == 1;
      }

      @Override
      public String getPlainText() {
         Object var1 = "";
         if (this.contentsCase_ == 1) {
            var1 = this.contents_;
         }

         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            if (this.contentsCase_ == 1) {
               this.contents_ = var3;
            }

            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getPlainTextBytes() {
         Object var1 = "";
         if (this.contentsCase_ == 1) {
            var1 = this.contents_;
         }

         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            if (this.contentsCase_ == 1) {
               this.contents_ = var2;
            }

            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public ConversationMessageContents.Builder setPlainText(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.contentsCase_ = 1;
         this.contents_ = var1;
         this.onChanged();
         return this;
      }

      public ConversationMessageContents.Builder clearPlainText() {
         if (this.contentsCase_ == 1) {
            this.contentsCase_ = 0;
            this.contents_ = null;
            this.onChanged();
         }

         return this;
      }

      public ConversationMessageContents.Builder setPlainTextBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         ConversationMessageContents.checkByteStringIsUtf8(var1);
         this.contentsCase_ = 1;
         this.contents_ = var1;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasSticker() {
         return this.contentsCase_ == 2;
      }

      @Override
      public LunarSticker getSticker() {
         if (this.stickerBuilder_ == null) {
            return this.contentsCase_ == 2 ? (LunarSticker)this.contents_ : LunarSticker.getDefaultInstance();
         } else {
            return this.contentsCase_ == 2 ? this.stickerBuilder_.getMessage() : LunarSticker.getDefaultInstance();
         }
      }

      public ConversationMessageContents.Builder setSticker(LunarSticker var1) {
         if (this.stickerBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.contents_ = var1;
            this.onChanged();
         } else {
            this.stickerBuilder_.setMessage(var1);
         }

         this.contentsCase_ = 2;
         return this;
      }

      public ConversationMessageContents.Builder setSticker(LunarSticker.Builder var1) {
         if (this.stickerBuilder_ == null) {
            this.contents_ = var1.build();
            this.onChanged();
         } else {
            this.stickerBuilder_.setMessage(var1.build());
         }

         this.contentsCase_ = 2;
         return this;
      }

      public ConversationMessageContents.Builder mergeSticker(LunarSticker var1) {
         if (this.stickerBuilder_ == null) {
            if (this.contentsCase_ == 2 && this.contents_ != LunarSticker.getDefaultInstance()) {
               this.contents_ = LunarSticker.newBuilder((LunarSticker)this.contents_).mergeFrom(var1).buildPartial();
            } else {
               this.contents_ = var1;
            }

            this.onChanged();
         } else if (this.contentsCase_ == 2) {
            this.stickerBuilder_.mergeFrom(var1);
         } else {
            this.stickerBuilder_.setMessage(var1);
         }

         this.contentsCase_ = 2;
         return this;
      }

      public ConversationMessageContents.Builder clearSticker() {
         if (this.stickerBuilder_ == null) {
            if (this.contentsCase_ == 2) {
               this.contentsCase_ = 0;
               this.contents_ = null;
               this.onChanged();
            }
         } else {
            if (this.contentsCase_ == 2) {
               this.contentsCase_ = 0;
               this.contents_ = null;
            }

            this.stickerBuilder_.clear();
         }

         return this;
      }

      public LunarSticker.Builder getStickerBuilder() {
         return this.getStickerFieldBuilder().getBuilder();
      }

      @Override
      public LunarStickerOrBuilder getStickerOrBuilder() {
         if (this.contentsCase_ == 2 && this.stickerBuilder_ != null) {
            return this.stickerBuilder_.getMessageOrBuilder();
         } else {
            return this.contentsCase_ == 2 ? (LunarSticker)this.contents_ : LunarSticker.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<LunarSticker, LunarSticker.Builder, LunarStickerOrBuilder> getStickerFieldBuilder() {
         if (this.stickerBuilder_ == null) {
            if (this.contentsCase_ != 2) {
               this.contents_ = LunarSticker.getDefaultInstance();
            }

            this.stickerBuilder_ = new SingleFieldBuilderV3<>((LunarSticker)this.contents_, this.getParentForChildren(), this.isClean());
            this.contents_ = null;
         }

         this.contentsCase_ = 2;
         this.onChanged();
         return this.stickerBuilder_;
      }

      @Override
      public boolean hasSystem() {
         return this.contentsCase_ == 5;
      }

      @Override
      public SystemMessage getSystem() {
         if (this.systemBuilder_ == null) {
            return this.contentsCase_ == 5 ? (SystemMessage)this.contents_ : SystemMessage.getDefaultInstance();
         } else {
            return this.contentsCase_ == 5 ? this.systemBuilder_.getMessage() : SystemMessage.getDefaultInstance();
         }
      }

      public ConversationMessageContents.Builder setSystem(SystemMessage var1) {
         if (this.systemBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.contents_ = var1;
            this.onChanged();
         } else {
            this.systemBuilder_.setMessage(var1);
         }

         this.contentsCase_ = 5;
         return this;
      }

      public ConversationMessageContents.Builder setSystem(SystemMessage.Builder var1) {
         if (this.systemBuilder_ == null) {
            this.contents_ = var1.build();
            this.onChanged();
         } else {
            this.systemBuilder_.setMessage(var1.build());
         }

         this.contentsCase_ = 5;
         return this;
      }

      public ConversationMessageContents.Builder mergeSystem(SystemMessage var1) {
         if (this.systemBuilder_ == null) {
            if (this.contentsCase_ == 5 && this.contents_ != SystemMessage.getDefaultInstance()) {
               this.contents_ = SystemMessage.newBuilder((SystemMessage)this.contents_).mergeFrom(var1).buildPartial();
            } else {
               this.contents_ = var1;
            }

            this.onChanged();
         } else if (this.contentsCase_ == 5) {
            this.systemBuilder_.mergeFrom(var1);
         } else {
            this.systemBuilder_.setMessage(var1);
         }

         this.contentsCase_ = 5;
         return this;
      }

      public ConversationMessageContents.Builder clearSystem() {
         if (this.systemBuilder_ == null) {
            if (this.contentsCase_ == 5) {
               this.contentsCase_ = 0;
               this.contents_ = null;
               this.onChanged();
            }
         } else {
            if (this.contentsCase_ == 5) {
               this.contentsCase_ = 0;
               this.contents_ = null;
            }

            this.systemBuilder_.clear();
         }

         return this;
      }

      public SystemMessage.Builder getSystemBuilder() {
         return this.getSystemFieldBuilder().getBuilder();
      }

      @Override
      public SystemMessageOrBuilder getSystemOrBuilder() {
         if (this.contentsCase_ == 5 && this.systemBuilder_ != null) {
            return this.systemBuilder_.getMessageOrBuilder();
         } else {
            return this.contentsCase_ == 5 ? (SystemMessage)this.contents_ : SystemMessage.getDefaultInstance();
         }
      }

      private SingleFieldBuilderV3<SystemMessage, SystemMessage.Builder, SystemMessageOrBuilder> getSystemFieldBuilder() {
         if (this.systemBuilder_ == null) {
            if (this.contentsCase_ != 5) {
               this.contents_ = SystemMessage.getDefaultInstance();
            }

            this.systemBuilder_ = new SingleFieldBuilderV3<>((SystemMessage)this.contents_, this.getParentForChildren(), this.isClean());
            this.contents_ = null;
         }

         this.contentsCase_ = 5;
         this.onChanged();
         return this.systemBuilder_;
      }

      private void ensureImagesIsMutable() {
         if ((this.bitField0_ & 8) == 0) {
            this.images_ = new ArrayList<>(this.images_);
            this.bitField0_ |= 8;
         }
      }

      @Override
      public List<ConversationImage> getImagesList() {
         return this.imagesBuilder_ == null ? Collections.unmodifiableList(this.images_) : this.imagesBuilder_.getMessageList();
      }

      @Override
      public int getImagesCount() {
         return this.imagesBuilder_ == null ? this.images_.size() : this.imagesBuilder_.getCount();
      }

      @Override
      public ConversationImage getImages(int var1) {
         return this.imagesBuilder_ == null ? this.images_.get(var1) : this.imagesBuilder_.getMessage(var1);
      }

      public ConversationMessageContents.Builder setImages(int var1, ConversationImage var2) {
         if (this.imagesBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureImagesIsMutable();
            this.images_.set(var1, var2);
            this.onChanged();
         } else {
            this.imagesBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public ConversationMessageContents.Builder setImages(int var1, ConversationImage.Builder var2) {
         if (this.imagesBuilder_ == null) {
            this.ensureImagesIsMutable();
            this.images_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.imagesBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public ConversationMessageContents.Builder addImages(ConversationImage var1) {
         if (this.imagesBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureImagesIsMutable();
            this.images_.add(var1);
            this.onChanged();
         } else {
            this.imagesBuilder_.addMessage(var1);
         }

         return this;
      }

      public ConversationMessageContents.Builder addImages(int var1, ConversationImage var2) {
         if (this.imagesBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureImagesIsMutable();
            this.images_.add(var1, var2);
            this.onChanged();
         } else {
            this.imagesBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public ConversationMessageContents.Builder addImages(ConversationImage.Builder var1) {
         if (this.imagesBuilder_ == null) {
            this.ensureImagesIsMutable();
            this.images_.add(var1.build());
            this.onChanged();
         } else {
            this.imagesBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public ConversationMessageContents.Builder addImages(int var1, ConversationImage.Builder var2) {
         if (this.imagesBuilder_ == null) {
            this.ensureImagesIsMutable();
            this.images_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.imagesBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public ConversationMessageContents.Builder addAllImages(Iterable<? extends ConversationImage> var1) {
         if (this.imagesBuilder_ == null) {
            this.ensureImagesIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.images_);
            this.onChanged();
         } else {
            this.imagesBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public ConversationMessageContents.Builder clearImages() {
         if (this.imagesBuilder_ == null) {
            this.images_ = Collections.emptyList();
            this.bitField0_ &= -9;
            this.onChanged();
         } else {
            this.imagesBuilder_.clear();
         }

         return this;
      }

      public ConversationMessageContents.Builder removeImages(int var1) {
         if (this.imagesBuilder_ == null) {
            this.ensureImagesIsMutable();
            this.images_.remove(var1);
            this.onChanged();
         } else {
            this.imagesBuilder_.remove(var1);
         }

         return this;
      }

      public ConversationImage.Builder getImagesBuilder(int var1) {
         return this.getImagesFieldBuilder().getBuilder(var1);
      }

      @Override
      public ConversationImageOrBuilder getImagesOrBuilder(int var1) {
         return this.imagesBuilder_ == null ? this.images_.get(var1) : this.imagesBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends ConversationImageOrBuilder> getImagesOrBuilderList() {
         return this.imagesBuilder_ != null ? this.imagesBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.images_);
      }

      public ConversationImage.Builder addImagesBuilder() {
         return this.getImagesFieldBuilder().addBuilder(ConversationImage.getDefaultInstance());
      }

      public ConversationImage.Builder addImagesBuilder(int var1) {
         return this.getImagesFieldBuilder().addBuilder(var1, ConversationImage.getDefaultInstance());
      }

      public List<ConversationImage.Builder> getImagesBuilderList() {
         return this.getImagesFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<ConversationImage, ConversationImage.Builder, ConversationImageOrBuilder> getImagesFieldBuilder() {
         if (this.imagesBuilder_ == null) {
            this.imagesBuilder_ = new RepeatedFieldBuilderV3<>(this.images_, (this.bitField0_ & 8) != 0, this.getParentForChildren(), this.isClean());
            this.images_ = null;
         }

         return this.imagesBuilder_;
      }

      @Override
      public boolean hasEmbed() {
         return (this.bitField0_ & 16) != 0;
      }

      @Override
      public ConversationMessageEmbed getEmbed() {
         if (this.embedBuilder_ == null) {
            return this.embed_ == null ? ConversationMessageEmbed.getDefaultInstance() : this.embed_;
         } else {
            return this.embedBuilder_.getMessage();
         }
      }

      public ConversationMessageContents.Builder setEmbed(ConversationMessageEmbed var1) {
         if (this.embedBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.embed_ = var1;
         } else {
            this.embedBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      public ConversationMessageContents.Builder setEmbed(ConversationMessageEmbed.Builder var1) {
         if (this.embedBuilder_ == null) {
            this.embed_ = var1.build();
         } else {
            this.embedBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      public ConversationMessageContents.Builder mergeEmbed(ConversationMessageEmbed var1) {
         if (this.embedBuilder_ == null) {
            if ((this.bitField0_ & 16) != 0 && this.embed_ != null && this.embed_ != ConversationMessageEmbed.getDefaultInstance()) {
               this.getEmbedBuilder().mergeFrom(var1);
            } else {
               this.embed_ = var1;
            }
         } else {
            this.embedBuilder_.mergeFrom(var1);
         }

         if (this.embed_ != null) {
            this.bitField0_ |= 16;
            this.onChanged();
         }

         return this;
      }

      public ConversationMessageContents.Builder clearEmbed() {
         this.bitField0_ &= -17;
         this.embed_ = null;
         if (this.embedBuilder_ != null) {
            this.embedBuilder_.dispose();
            this.embedBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public ConversationMessageEmbed.Builder getEmbedBuilder() {
         this.bitField0_ |= 16;
         this.onChanged();
         return this.getEmbedFieldBuilder().getBuilder();
      }

      @Override
      public ConversationMessageEmbedOrBuilder getEmbedOrBuilder() {
         if (this.embedBuilder_ != null) {
            return this.embedBuilder_.getMessageOrBuilder();
         } else {
            return this.embed_ == null ? ConversationMessageEmbed.getDefaultInstance() : this.embed_;
         }
      }

      private SingleFieldBuilderV3<ConversationMessageEmbed, ConversationMessageEmbed.Builder, ConversationMessageEmbedOrBuilder> getEmbedFieldBuilder() {
         if (this.embedBuilder_ == null) {
            this.embedBuilder_ = new SingleFieldBuilderV3<>(this.getEmbed(), this.getParentForChildren(), this.isClean());
            this.embed_ = null;
         }

         return this.embedBuilder_;
      }

      public final ConversationMessageContents.Builder setUnknownFields(UnknownFieldSet var1) {
         return (ConversationMessageContents.Builder)super.setUnknownFields(var1);
      }

      public final ConversationMessageContents.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (ConversationMessageContents.Builder)super.mergeUnknownFields(var1);
      }
   }

   public enum ContentsCase implements AbstractMessageLite.InternalOneOfEnum, Internal.EnumLite {
      PLAIN_TEXT(1),
      STICKER(2),
      SYSTEM(5),
      CONTENTS_NOT_SET(0);

      private final int value;

      ContentsCase(int var3) {
         this.value = var3;
      }

      @Deprecated
      public static ConversationMessageContents.ContentsCase valueOf(int var0) {
         return forNumber(var0);
      }

      public static ConversationMessageContents.ContentsCase forNumber(int var0) {
         switch (var0) {
            case 0:
               return CONTENTS_NOT_SET;
            case 1:
               return PLAIN_TEXT;
            case 2:
               return STICKER;
            case 3:
            case 4:
            default:
               return null;
            case 5:
               return SYSTEM;
         }
      }

      @Override
      public int getNumber() {
         return this.value;
      }
   }
}
