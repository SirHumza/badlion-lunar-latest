package com.lunarclient.websocket.conversation.v1;

import com.google.protobuf.AbstractMessageLite;
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
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class LunarStickerPack extends GeneratedMessageV3 implements LunarStickerPackOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int ID_FIELD_NUMBER = 1;
   private volatile Object id_ = "";
   public static final int NAME_FIELD_NUMBER = 2;
   private volatile Object name_ = "";
   public static final int ICON_URL_FIELD_NUMBER = 3;
   private volatile Object iconUrl_ = "";
   public static final int STICKERS_FIELD_NUMBER = 4;
   private List<LunarSticker> stickers_;
   private byte memoizedIsInitialized = -1;
   private static final LunarStickerPack DEFAULT_INSTANCE = new LunarStickerPack();
   private static final Parser<LunarStickerPack> PARSER = new AbstractParser<LunarStickerPack>() {
      public LunarStickerPack parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         LunarStickerPack.Builder var3 = LunarStickerPack.newBuilder();

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

   private LunarStickerPack(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private LunarStickerPack() {
      this.id_ = "";
      this.name_ = "";
      this.iconUrl_ = "";
      this.stickers_ = Collections.emptyList();
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new LunarStickerPack();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_conversation_v1_LunarStickerPack_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_conversation_v1_LunarStickerPack_fieldAccessorTable
         .ensureFieldAccessorsInitialized(LunarStickerPack.class, LunarStickerPack.Builder.class);
   }

   @Override
   public String getId() {
      Object var1 = this.id_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.id_ = var3;
      return var3;
   }

   @Override
   public ByteString getIdBytes() {
      Object var1 = this.id_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.id_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public String getName() {
      Object var1 = this.name_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.name_ = var3;
      return var3;
   }

   @Override
   public ByteString getNameBytes() {
      Object var1 = this.name_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.name_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public String getIconUrl() {
      Object var1 = this.iconUrl_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.iconUrl_ = var3;
      return var3;
   }

   @Override
   public ByteString getIconUrlBytes() {
      Object var1 = this.iconUrl_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.iconUrl_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public List<LunarSticker> getStickersList() {
      return this.stickers_;
   }

   @Override
   public List<? extends LunarStickerOrBuilder> getStickersOrBuilderList() {
      return this.stickers_;
   }

   @Override
   public int getStickersCount() {
      return this.stickers_.size();
   }

   @Override
   public LunarSticker getStickers(int var1) {
      return this.stickers_.get(var1);
   }

   @Override
   public LunarStickerOrBuilder getStickersOrBuilder(int var1) {
      return this.stickers_.get(var1);
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
      if (!GeneratedMessageV3.isStringEmpty(this.id_)) {
         GeneratedMessageV3.writeString(var1, 1, this.id_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.name_)) {
         GeneratedMessageV3.writeString(var1, 2, this.name_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.iconUrl_)) {
         GeneratedMessageV3.writeString(var1, 3, this.iconUrl_);
      }

      for (int var2 = 0; var2 < this.stickers_.size(); var2++) {
         var1.writeMessage(4, this.stickers_.get(var2));
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
      if (!GeneratedMessageV3.isStringEmpty(this.id_)) {
         var1 += GeneratedMessageV3.computeStringSize(1, this.id_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.name_)) {
         var1 += GeneratedMessageV3.computeStringSize(2, this.name_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.iconUrl_)) {
         var1 += GeneratedMessageV3.computeStringSize(3, this.iconUrl_);
      }

      for (int var2 = 0; var2 < this.stickers_.size(); var2++) {
         var1 += CodedOutputStream.computeMessageSize(4, this.stickers_.get(var2));
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof LunarStickerPack)) {
         return super.equals(var1);
      } else {
         LunarStickerPack var2 = (LunarStickerPack)var1;
         if (!this.getId().equals(var2.getId())) {
            return false;
         } else if (!this.getName().equals(var2.getName())) {
            return false;
         } else if (!this.getIconUrl().equals(var2.getIconUrl())) {
            return false;
         } else {
            return !this.getStickersList().equals(var2.getStickersList()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + this.getId().hashCode();
      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.getName().hashCode();
      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + this.getIconUrl().hashCode();
      if (this.getStickersCount() > 0) {
         var1 = 37 * var1 + 4;
         var1 = 53 * var1 + this.getStickersList().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static LunarStickerPack parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static LunarStickerPack parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LunarStickerPack parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static LunarStickerPack parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LunarStickerPack parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static LunarStickerPack parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LunarStickerPack parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static LunarStickerPack parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static LunarStickerPack parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static LunarStickerPack parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static LunarStickerPack parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static LunarStickerPack parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public LunarStickerPack.Builder newBuilderForType() {
      return newBuilder();
   }

   public static LunarStickerPack.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static LunarStickerPack.Builder newBuilder(LunarStickerPack var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public LunarStickerPack.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new LunarStickerPack.Builder() : new LunarStickerPack.Builder().mergeFrom(this);
   }

   protected LunarStickerPack.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new LunarStickerPack.Builder(var1);
   }

   public static LunarStickerPack getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<LunarStickerPack> parser() {
      return PARSER;
   }

   @Override
   public Parser<LunarStickerPack> getParserForType() {
      return PARSER;
   }

   public LunarStickerPack getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<LunarStickerPack.Builder> implements LunarStickerPackOrBuilder {
      private int bitField0_;
      private Object id_ = "";
      private Object name_ = "";
      private Object iconUrl_ = "";
      private List<LunarSticker> stickers_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<LunarSticker, LunarSticker.Builder, LunarStickerOrBuilder> stickersBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_conversation_v1_LunarStickerPack_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_conversation_v1_LunarStickerPack_fieldAccessorTable
            .ensureFieldAccessorsInitialized(LunarStickerPack.class, LunarStickerPack.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public LunarStickerPack.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.id_ = "";
         this.name_ = "";
         this.iconUrl_ = "";
         if (this.stickersBuilder_ == null) {
            this.stickers_ = Collections.emptyList();
         } else {
            this.stickers_ = null;
            this.stickersBuilder_.clear();
         }

         this.bitField0_ &= -9;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_conversation_v1_LunarStickerPack_descriptor;
      }

      public LunarStickerPack getDefaultInstanceForType() {
         return LunarStickerPack.getDefaultInstance();
      }

      public LunarStickerPack build() {
         LunarStickerPack var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public LunarStickerPack buildPartial() {
         LunarStickerPack var1 = new LunarStickerPack(this);
         this.buildPartialRepeatedFields(var1);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartialRepeatedFields(LunarStickerPack var1) {
         if (this.stickersBuilder_ == null) {
            if ((this.bitField0_ & 8) != 0) {
               this.stickers_ = Collections.unmodifiableList(this.stickers_);
               this.bitField0_ &= -9;
            }

            var1.stickers_ = this.stickers_;
         } else {
            var1.stickers_ = this.stickersBuilder_.build();
         }
      }

      private void buildPartial0(LunarStickerPack var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.id_ = this.id_;
         }

         if ((var2 & 2) != 0) {
            var1.name_ = this.name_;
         }

         if ((var2 & 4) != 0) {
            var1.iconUrl_ = this.iconUrl_;
         }
      }

      public LunarStickerPack.Builder clone() {
         return (LunarStickerPack.Builder)super.clone();
      }

      public LunarStickerPack.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (LunarStickerPack.Builder)super.setField(var1, var2);
      }

      public LunarStickerPack.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (LunarStickerPack.Builder)super.clearField(var1);
      }

      public LunarStickerPack.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (LunarStickerPack.Builder)super.clearOneof(var1);
      }

      public LunarStickerPack.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (LunarStickerPack.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public LunarStickerPack.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (LunarStickerPack.Builder)super.addRepeatedField(var1, var2);
      }

      public LunarStickerPack.Builder mergeFrom(Message var1) {
         if (var1 instanceof LunarStickerPack) {
            return this.mergeFrom((LunarStickerPack)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public LunarStickerPack.Builder mergeFrom(LunarStickerPack var1) {
         if (var1 == LunarStickerPack.getDefaultInstance()) {
            return this;
         }

         if (!var1.getId().isEmpty()) {
            this.id_ = var1.id_;
            this.bitField0_ |= 1;
            this.onChanged();
         }

         if (!var1.getName().isEmpty()) {
            this.name_ = var1.name_;
            this.bitField0_ |= 2;
            this.onChanged();
         }

         if (!var1.getIconUrl().isEmpty()) {
            this.iconUrl_ = var1.iconUrl_;
            this.bitField0_ |= 4;
            this.onChanged();
         }

         if (this.stickersBuilder_ == null) {
            if (!var1.stickers_.isEmpty()) {
               if (this.stickers_.isEmpty()) {
                  this.stickers_ = var1.stickers_;
                  this.bitField0_ &= -9;
               } else {
                  this.ensureStickersIsMutable();
                  this.stickers_.addAll(var1.stickers_);
               }

               this.onChanged();
            }
         } else if (!var1.stickers_.isEmpty()) {
            if (this.stickersBuilder_.isEmpty()) {
               this.stickersBuilder_.dispose();
               this.stickersBuilder_ = null;
               this.stickers_ = var1.stickers_;
               this.bitField0_ &= -9;
               this.stickersBuilder_ = LunarStickerPack.alwaysUseFieldBuilders ? this.getStickersFieldBuilder() : null;
            } else {
               this.stickersBuilder_.addAllMessages(var1.stickers_);
            }
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public LunarStickerPack.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.id_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     this.name_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 2;
                     break;
                  case 26:
                     this.iconUrl_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 4;
                     break;
                  case 34:
                     LunarSticker var5 = var1.readMessage(LunarSticker.parser(), var2);
                     if (this.stickersBuilder_ == null) {
                        this.ensureStickersIsMutable();
                        this.stickers_.add(var5);
                     } else {
                        this.stickersBuilder_.addMessage(var5);
                     }
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
      public String getId() {
         Object var1 = this.id_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.id_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getIdBytes() {
         Object var1 = this.id_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.id_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public LunarStickerPack.Builder setId(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.id_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public LunarStickerPack.Builder clearId() {
         this.id_ = LunarStickerPack.getDefaultInstance().getId();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public LunarStickerPack.Builder setIdBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         LunarStickerPack.checkByteStringIsUtf8(var1);
         this.id_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public String getName() {
         Object var1 = this.name_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.name_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getNameBytes() {
         Object var1 = this.name_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.name_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public LunarStickerPack.Builder setName(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.name_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public LunarStickerPack.Builder clearName() {
         this.name_ = LunarStickerPack.getDefaultInstance().getName();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      public LunarStickerPack.Builder setNameBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         LunarStickerPack.checkByteStringIsUtf8(var1);
         this.name_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      @Override
      public String getIconUrl() {
         Object var1 = this.iconUrl_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.iconUrl_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getIconUrlBytes() {
         Object var1 = this.iconUrl_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.iconUrl_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public LunarStickerPack.Builder setIconUrl(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.iconUrl_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public LunarStickerPack.Builder clearIconUrl() {
         this.iconUrl_ = LunarStickerPack.getDefaultInstance().getIconUrl();
         this.bitField0_ &= -5;
         this.onChanged();
         return this;
      }

      public LunarStickerPack.Builder setIconUrlBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         LunarStickerPack.checkByteStringIsUtf8(var1);
         this.iconUrl_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      private void ensureStickersIsMutable() {
         if ((this.bitField0_ & 8) == 0) {
            this.stickers_ = new ArrayList<>(this.stickers_);
            this.bitField0_ |= 8;
         }
      }

      @Override
      public List<LunarSticker> getStickersList() {
         return this.stickersBuilder_ == null ? Collections.unmodifiableList(this.stickers_) : this.stickersBuilder_.getMessageList();
      }

      @Override
      public int getStickersCount() {
         return this.stickersBuilder_ == null ? this.stickers_.size() : this.stickersBuilder_.getCount();
      }

      @Override
      public LunarSticker getStickers(int var1) {
         return this.stickersBuilder_ == null ? this.stickers_.get(var1) : this.stickersBuilder_.getMessage(var1);
      }

      public LunarStickerPack.Builder setStickers(int var1, LunarSticker var2) {
         if (this.stickersBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureStickersIsMutable();
            this.stickers_.set(var1, var2);
            this.onChanged();
         } else {
            this.stickersBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public LunarStickerPack.Builder setStickers(int var1, LunarSticker.Builder var2) {
         if (this.stickersBuilder_ == null) {
            this.ensureStickersIsMutable();
            this.stickers_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.stickersBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public LunarStickerPack.Builder addStickers(LunarSticker var1) {
         if (this.stickersBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureStickersIsMutable();
            this.stickers_.add(var1);
            this.onChanged();
         } else {
            this.stickersBuilder_.addMessage(var1);
         }

         return this;
      }

      public LunarStickerPack.Builder addStickers(int var1, LunarSticker var2) {
         if (this.stickersBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureStickersIsMutable();
            this.stickers_.add(var1, var2);
            this.onChanged();
         } else {
            this.stickersBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public LunarStickerPack.Builder addStickers(LunarSticker.Builder var1) {
         if (this.stickersBuilder_ == null) {
            this.ensureStickersIsMutable();
            this.stickers_.add(var1.build());
            this.onChanged();
         } else {
            this.stickersBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public LunarStickerPack.Builder addStickers(int var1, LunarSticker.Builder var2) {
         if (this.stickersBuilder_ == null) {
            this.ensureStickersIsMutable();
            this.stickers_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.stickersBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public LunarStickerPack.Builder addAllStickers(Iterable<? extends LunarSticker> var1) {
         if (this.stickersBuilder_ == null) {
            this.ensureStickersIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.stickers_);
            this.onChanged();
         } else {
            this.stickersBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public LunarStickerPack.Builder clearStickers() {
         if (this.stickersBuilder_ == null) {
            this.stickers_ = Collections.emptyList();
            this.bitField0_ &= -9;
            this.onChanged();
         } else {
            this.stickersBuilder_.clear();
         }

         return this;
      }

      public LunarStickerPack.Builder removeStickers(int var1) {
         if (this.stickersBuilder_ == null) {
            this.ensureStickersIsMutable();
            this.stickers_.remove(var1);
            this.onChanged();
         } else {
            this.stickersBuilder_.remove(var1);
         }

         return this;
      }

      public LunarSticker.Builder getStickersBuilder(int var1) {
         return this.getStickersFieldBuilder().getBuilder(var1);
      }

      @Override
      public LunarStickerOrBuilder getStickersOrBuilder(int var1) {
         return this.stickersBuilder_ == null ? this.stickers_.get(var1) : this.stickersBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends LunarStickerOrBuilder> getStickersOrBuilderList() {
         return this.stickersBuilder_ != null ? this.stickersBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.stickers_);
      }

      public LunarSticker.Builder addStickersBuilder() {
         return this.getStickersFieldBuilder().addBuilder(LunarSticker.getDefaultInstance());
      }

      public LunarSticker.Builder addStickersBuilder(int var1) {
         return this.getStickersFieldBuilder().addBuilder(var1, LunarSticker.getDefaultInstance());
      }

      public List<LunarSticker.Builder> getStickersBuilderList() {
         return this.getStickersFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<LunarSticker, LunarSticker.Builder, LunarStickerOrBuilder> getStickersFieldBuilder() {
         if (this.stickersBuilder_ == null) {
            this.stickersBuilder_ = new RepeatedFieldBuilderV3<>(this.stickers_, (this.bitField0_ & 8) != 0, this.getParentForChildren(), this.isClean());
            this.stickers_ = null;
         }

         return this.stickersBuilder_;
      }

      public final LunarStickerPack.Builder setUnknownFields(UnknownFieldSet var1) {
         return (LunarStickerPack.Builder)super.setUnknownFields(var1);
      }

      public final LunarStickerPack.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (LunarStickerPack.Builder)super.mergeUnknownFields(var1);
      }
   }
}
