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

public final class LunarEmojiCategory extends GeneratedMessageV3 implements LunarEmojiCategoryOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int ID_FIELD_NUMBER = 1;
   private volatile Object id_ = "";
   public static final int NAME_FIELD_NUMBER = 2;
   private volatile Object name_ = "";
   public static final int ICON_URL_FIELD_NUMBER = 3;
   private volatile Object iconUrl_ = "";
   public static final int EMOJIS_FIELD_NUMBER = 4;
   private List<LunarEmoji> emojis_;
   private byte memoizedIsInitialized = -1;
   private static final LunarEmojiCategory DEFAULT_INSTANCE = new LunarEmojiCategory();
   private static final Parser<LunarEmojiCategory> PARSER = new AbstractParser<LunarEmojiCategory>() {
      public LunarEmojiCategory parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         LunarEmojiCategory.Builder var3 = LunarEmojiCategory.newBuilder();

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

   private LunarEmojiCategory(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private LunarEmojiCategory() {
      this.id_ = "";
      this.name_ = "";
      this.iconUrl_ = "";
      this.emojis_ = Collections.emptyList();
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new LunarEmojiCategory();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_conversation_v1_LunarEmojiCategory_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_conversation_v1_LunarEmojiCategory_fieldAccessorTable
         .ensureFieldAccessorsInitialized(LunarEmojiCategory.class, LunarEmojiCategory.Builder.class);
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
   public List<LunarEmoji> getEmojisList() {
      return this.emojis_;
   }

   @Override
   public List<? extends LunarEmojiOrBuilder> getEmojisOrBuilderList() {
      return this.emojis_;
   }

   @Override
   public int getEmojisCount() {
      return this.emojis_.size();
   }

   @Override
   public LunarEmoji getEmojis(int var1) {
      return this.emojis_.get(var1);
   }

   @Override
   public LunarEmojiOrBuilder getEmojisOrBuilder(int var1) {
      return this.emojis_.get(var1);
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

      for (int var2 = 0; var2 < this.emojis_.size(); var2++) {
         var1.writeMessage(4, this.emojis_.get(var2));
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

      for (int var2 = 0; var2 < this.emojis_.size(); var2++) {
         var1 += CodedOutputStream.computeMessageSize(4, this.emojis_.get(var2));
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof LunarEmojiCategory)) {
         return super.equals(var1);
      } else {
         LunarEmojiCategory var2 = (LunarEmojiCategory)var1;
         if (!this.getId().equals(var2.getId())) {
            return false;
         } else if (!this.getName().equals(var2.getName())) {
            return false;
         } else if (!this.getIconUrl().equals(var2.getIconUrl())) {
            return false;
         } else {
            return !this.getEmojisList().equals(var2.getEmojisList()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.getEmojisCount() > 0) {
         var1 = 37 * var1 + 4;
         var1 = 53 * var1 + this.getEmojisList().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static LunarEmojiCategory parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static LunarEmojiCategory parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LunarEmojiCategory parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static LunarEmojiCategory parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LunarEmojiCategory parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static LunarEmojiCategory parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LunarEmojiCategory parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static LunarEmojiCategory parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static LunarEmojiCategory parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static LunarEmojiCategory parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static LunarEmojiCategory parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static LunarEmojiCategory parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public LunarEmojiCategory.Builder newBuilderForType() {
      return newBuilder();
   }

   public static LunarEmojiCategory.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static LunarEmojiCategory.Builder newBuilder(LunarEmojiCategory var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public LunarEmojiCategory.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new LunarEmojiCategory.Builder() : new LunarEmojiCategory.Builder().mergeFrom(this);
   }

   protected LunarEmojiCategory.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new LunarEmojiCategory.Builder(var1);
   }

   public static LunarEmojiCategory getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<LunarEmojiCategory> parser() {
      return PARSER;
   }

   @Override
   public Parser<LunarEmojiCategory> getParserForType() {
      return PARSER;
   }

   public LunarEmojiCategory getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<LunarEmojiCategory.Builder> implements LunarEmojiCategoryOrBuilder {
      private int bitField0_;
      private Object id_ = "";
      private Object name_ = "";
      private Object iconUrl_ = "";
      private List<LunarEmoji> emojis_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<LunarEmoji, LunarEmoji.Builder, LunarEmojiOrBuilder> emojisBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_conversation_v1_LunarEmojiCategory_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_conversation_v1_LunarEmojiCategory_fieldAccessorTable
            .ensureFieldAccessorsInitialized(LunarEmojiCategory.class, LunarEmojiCategory.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public LunarEmojiCategory.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.id_ = "";
         this.name_ = "";
         this.iconUrl_ = "";
         if (this.emojisBuilder_ == null) {
            this.emojis_ = Collections.emptyList();
         } else {
            this.emojis_ = null;
            this.emojisBuilder_.clear();
         }

         this.bitField0_ &= -9;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_conversation_v1_LunarEmojiCategory_descriptor;
      }

      public LunarEmojiCategory getDefaultInstanceForType() {
         return LunarEmojiCategory.getDefaultInstance();
      }

      public LunarEmojiCategory build() {
         LunarEmojiCategory var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public LunarEmojiCategory buildPartial() {
         LunarEmojiCategory var1 = new LunarEmojiCategory(this);
         this.buildPartialRepeatedFields(var1);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartialRepeatedFields(LunarEmojiCategory var1) {
         if (this.emojisBuilder_ == null) {
            if ((this.bitField0_ & 8) != 0) {
               this.emojis_ = Collections.unmodifiableList(this.emojis_);
               this.bitField0_ &= -9;
            }

            var1.emojis_ = this.emojis_;
         } else {
            var1.emojis_ = this.emojisBuilder_.build();
         }
      }

      private void buildPartial0(LunarEmojiCategory var1) {
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

      public LunarEmojiCategory.Builder clone() {
         return (LunarEmojiCategory.Builder)super.clone();
      }

      public LunarEmojiCategory.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (LunarEmojiCategory.Builder)super.setField(var1, var2);
      }

      public LunarEmojiCategory.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (LunarEmojiCategory.Builder)super.clearField(var1);
      }

      public LunarEmojiCategory.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (LunarEmojiCategory.Builder)super.clearOneof(var1);
      }

      public LunarEmojiCategory.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (LunarEmojiCategory.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public LunarEmojiCategory.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (LunarEmojiCategory.Builder)super.addRepeatedField(var1, var2);
      }

      public LunarEmojiCategory.Builder mergeFrom(Message var1) {
         if (var1 instanceof LunarEmojiCategory) {
            return this.mergeFrom((LunarEmojiCategory)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public LunarEmojiCategory.Builder mergeFrom(LunarEmojiCategory var1) {
         if (var1 == LunarEmojiCategory.getDefaultInstance()) {
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

         if (this.emojisBuilder_ == null) {
            if (!var1.emojis_.isEmpty()) {
               if (this.emojis_.isEmpty()) {
                  this.emojis_ = var1.emojis_;
                  this.bitField0_ &= -9;
               } else {
                  this.ensureEmojisIsMutable();
                  this.emojis_.addAll(var1.emojis_);
               }

               this.onChanged();
            }
         } else if (!var1.emojis_.isEmpty()) {
            if (this.emojisBuilder_.isEmpty()) {
               this.emojisBuilder_.dispose();
               this.emojisBuilder_ = null;
               this.emojis_ = var1.emojis_;
               this.bitField0_ &= -9;
               this.emojisBuilder_ = LunarEmojiCategory.alwaysUseFieldBuilders ? this.getEmojisFieldBuilder() : null;
            } else {
               this.emojisBuilder_.addAllMessages(var1.emojis_);
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

      public LunarEmojiCategory.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     LunarEmoji var5 = var1.readMessage(LunarEmoji.parser(), var2);
                     if (this.emojisBuilder_ == null) {
                        this.ensureEmojisIsMutable();
                        this.emojis_.add(var5);
                     } else {
                        this.emojisBuilder_.addMessage(var5);
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

      public LunarEmojiCategory.Builder setId(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.id_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public LunarEmojiCategory.Builder clearId() {
         this.id_ = LunarEmojiCategory.getDefaultInstance().getId();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public LunarEmojiCategory.Builder setIdBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         LunarEmojiCategory.checkByteStringIsUtf8(var1);
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

      public LunarEmojiCategory.Builder setName(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.name_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public LunarEmojiCategory.Builder clearName() {
         this.name_ = LunarEmojiCategory.getDefaultInstance().getName();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      public LunarEmojiCategory.Builder setNameBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         LunarEmojiCategory.checkByteStringIsUtf8(var1);
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

      public LunarEmojiCategory.Builder setIconUrl(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.iconUrl_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public LunarEmojiCategory.Builder clearIconUrl() {
         this.iconUrl_ = LunarEmojiCategory.getDefaultInstance().getIconUrl();
         this.bitField0_ &= -5;
         this.onChanged();
         return this;
      }

      public LunarEmojiCategory.Builder setIconUrlBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         LunarEmojiCategory.checkByteStringIsUtf8(var1);
         this.iconUrl_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      private void ensureEmojisIsMutable() {
         if ((this.bitField0_ & 8) == 0) {
            this.emojis_ = new ArrayList<>(this.emojis_);
            this.bitField0_ |= 8;
         }
      }

      @Override
      public List<LunarEmoji> getEmojisList() {
         return this.emojisBuilder_ == null ? Collections.unmodifiableList(this.emojis_) : this.emojisBuilder_.getMessageList();
      }

      @Override
      public int getEmojisCount() {
         return this.emojisBuilder_ == null ? this.emojis_.size() : this.emojisBuilder_.getCount();
      }

      @Override
      public LunarEmoji getEmojis(int var1) {
         return this.emojisBuilder_ == null ? this.emojis_.get(var1) : this.emojisBuilder_.getMessage(var1);
      }

      public LunarEmojiCategory.Builder setEmojis(int var1, LunarEmoji var2) {
         if (this.emojisBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureEmojisIsMutable();
            this.emojis_.set(var1, var2);
            this.onChanged();
         } else {
            this.emojisBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public LunarEmojiCategory.Builder setEmojis(int var1, LunarEmoji.Builder var2) {
         if (this.emojisBuilder_ == null) {
            this.ensureEmojisIsMutable();
            this.emojis_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.emojisBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public LunarEmojiCategory.Builder addEmojis(LunarEmoji var1) {
         if (this.emojisBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureEmojisIsMutable();
            this.emojis_.add(var1);
            this.onChanged();
         } else {
            this.emojisBuilder_.addMessage(var1);
         }

         return this;
      }

      public LunarEmojiCategory.Builder addEmojis(int var1, LunarEmoji var2) {
         if (this.emojisBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureEmojisIsMutable();
            this.emojis_.add(var1, var2);
            this.onChanged();
         } else {
            this.emojisBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public LunarEmojiCategory.Builder addEmojis(LunarEmoji.Builder var1) {
         if (this.emojisBuilder_ == null) {
            this.ensureEmojisIsMutable();
            this.emojis_.add(var1.build());
            this.onChanged();
         } else {
            this.emojisBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public LunarEmojiCategory.Builder addEmojis(int var1, LunarEmoji.Builder var2) {
         if (this.emojisBuilder_ == null) {
            this.ensureEmojisIsMutable();
            this.emojis_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.emojisBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public LunarEmojiCategory.Builder addAllEmojis(Iterable<? extends LunarEmoji> var1) {
         if (this.emojisBuilder_ == null) {
            this.ensureEmojisIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.emojis_);
            this.onChanged();
         } else {
            this.emojisBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public LunarEmojiCategory.Builder clearEmojis() {
         if (this.emojisBuilder_ == null) {
            this.emojis_ = Collections.emptyList();
            this.bitField0_ &= -9;
            this.onChanged();
         } else {
            this.emojisBuilder_.clear();
         }

         return this;
      }

      public LunarEmojiCategory.Builder removeEmojis(int var1) {
         if (this.emojisBuilder_ == null) {
            this.ensureEmojisIsMutable();
            this.emojis_.remove(var1);
            this.onChanged();
         } else {
            this.emojisBuilder_.remove(var1);
         }

         return this;
      }

      public LunarEmoji.Builder getEmojisBuilder(int var1) {
         return this.getEmojisFieldBuilder().getBuilder(var1);
      }

      @Override
      public LunarEmojiOrBuilder getEmojisOrBuilder(int var1) {
         return this.emojisBuilder_ == null ? this.emojis_.get(var1) : this.emojisBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends LunarEmojiOrBuilder> getEmojisOrBuilderList() {
         return this.emojisBuilder_ != null ? this.emojisBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.emojis_);
      }

      public LunarEmoji.Builder addEmojisBuilder() {
         return this.getEmojisFieldBuilder().addBuilder(LunarEmoji.getDefaultInstance());
      }

      public LunarEmoji.Builder addEmojisBuilder(int var1) {
         return this.getEmojisFieldBuilder().addBuilder(var1, LunarEmoji.getDefaultInstance());
      }

      public List<LunarEmoji.Builder> getEmojisBuilderList() {
         return this.getEmojisFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<LunarEmoji, LunarEmoji.Builder, LunarEmojiOrBuilder> getEmojisFieldBuilder() {
         if (this.emojisBuilder_ == null) {
            this.emojisBuilder_ = new RepeatedFieldBuilderV3<>(this.emojis_, (this.bitField0_ & 8) != 0, this.getParentForChildren(), this.isClean());
            this.emojis_ = null;
         }

         return this.emojisBuilder_;
      }

      public final LunarEmojiCategory.Builder setUnknownFields(UnknownFieldSet var1) {
         return (LunarEmojiCategory.Builder)super.setUnknownFields(var1);
      }

      public final LunarEmojiCategory.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (LunarEmojiCategory.Builder)super.mergeUnknownFields(var1);
      }
   }
}
