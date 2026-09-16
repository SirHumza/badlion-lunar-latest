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

public final class LunarEmoji extends GeneratedMessageV3 implements LunarEmojiOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int ID_FIELD_NUMBER = 1;
   private volatile Object id_ = "";
   public static final int URL_FIELD_NUMBER = 2;
   private volatile Object url_ = "";
   public static final int NAME_FIELD_NUMBER = 3;
   private volatile Object name_ = "";
   private byte memoizedIsInitialized = -1;
   private static final LunarEmoji DEFAULT_INSTANCE = new LunarEmoji();
   private static final Parser<LunarEmoji> PARSER = new AbstractParser<LunarEmoji>() {
      public LunarEmoji parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         LunarEmoji.Builder var3 = LunarEmoji.newBuilder();

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

   private LunarEmoji(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private LunarEmoji() {
      this.id_ = "";
      this.url_ = "";
      this.name_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new LunarEmoji();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_conversation_v1_LunarEmoji_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_conversation_v1_LunarEmoji_fieldAccessorTable
         .ensureFieldAccessorsInitialized(LunarEmoji.class, LunarEmoji.Builder.class);
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

      if (!GeneratedMessageV3.isStringEmpty(this.url_)) {
         GeneratedMessageV3.writeString(var1, 2, this.url_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.name_)) {
         GeneratedMessageV3.writeString(var1, 3, this.name_);
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

      if (!GeneratedMessageV3.isStringEmpty(this.url_)) {
         var1 += GeneratedMessageV3.computeStringSize(2, this.url_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.name_)) {
         var1 += GeneratedMessageV3.computeStringSize(3, this.name_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof LunarEmoji)) {
         return super.equals(var1);
      } else {
         LunarEmoji var2 = (LunarEmoji)var1;
         if (!this.getId().equals(var2.getId())) {
            return false;
         } else if (!this.getUrl().equals(var2.getUrl())) {
            return false;
         } else {
            return !this.getName().equals(var2.getName()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + this.getUrl().hashCode();
      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + this.getName().hashCode();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static LunarEmoji parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static LunarEmoji parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LunarEmoji parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static LunarEmoji parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LunarEmoji parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static LunarEmoji parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LunarEmoji parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static LunarEmoji parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static LunarEmoji parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static LunarEmoji parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static LunarEmoji parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static LunarEmoji parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public LunarEmoji.Builder newBuilderForType() {
      return newBuilder();
   }

   public static LunarEmoji.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static LunarEmoji.Builder newBuilder(LunarEmoji var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public LunarEmoji.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new LunarEmoji.Builder() : new LunarEmoji.Builder().mergeFrom(this);
   }

   protected LunarEmoji.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new LunarEmoji.Builder(var1);
   }

   public static LunarEmoji getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<LunarEmoji> parser() {
      return PARSER;
   }

   @Override
   public Parser<LunarEmoji> getParserForType() {
      return PARSER;
   }

   public LunarEmoji getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<LunarEmoji.Builder> implements LunarEmojiOrBuilder {
      private int bitField0_;
      private Object id_ = "";
      private Object url_ = "";
      private Object name_ = "";

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_conversation_v1_LunarEmoji_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_conversation_v1_LunarEmoji_fieldAccessorTable
            .ensureFieldAccessorsInitialized(LunarEmoji.class, LunarEmoji.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public LunarEmoji.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.id_ = "";
         this.url_ = "";
         this.name_ = "";
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_conversation_v1_LunarEmoji_descriptor;
      }

      public LunarEmoji getDefaultInstanceForType() {
         return LunarEmoji.getDefaultInstance();
      }

      public LunarEmoji build() {
         LunarEmoji var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public LunarEmoji buildPartial() {
         LunarEmoji var1 = new LunarEmoji(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(LunarEmoji var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.id_ = this.id_;
         }

         if ((var2 & 2) != 0) {
            var1.url_ = this.url_;
         }

         if ((var2 & 4) != 0) {
            var1.name_ = this.name_;
         }
      }

      public LunarEmoji.Builder clone() {
         return (LunarEmoji.Builder)super.clone();
      }

      public LunarEmoji.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (LunarEmoji.Builder)super.setField(var1, var2);
      }

      public LunarEmoji.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (LunarEmoji.Builder)super.clearField(var1);
      }

      public LunarEmoji.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (LunarEmoji.Builder)super.clearOneof(var1);
      }

      public LunarEmoji.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (LunarEmoji.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public LunarEmoji.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (LunarEmoji.Builder)super.addRepeatedField(var1, var2);
      }

      public LunarEmoji.Builder mergeFrom(Message var1) {
         if (var1 instanceof LunarEmoji) {
            return this.mergeFrom((LunarEmoji)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public LunarEmoji.Builder mergeFrom(LunarEmoji var1) {
         if (var1 == LunarEmoji.getDefaultInstance()) {
            return this;
         }

         if (!var1.getId().isEmpty()) {
            this.id_ = var1.id_;
            this.bitField0_ |= 1;
            this.onChanged();
         }

         if (!var1.getUrl().isEmpty()) {
            this.url_ = var1.url_;
            this.bitField0_ |= 2;
            this.onChanged();
         }

         if (!var1.getName().isEmpty()) {
            this.name_ = var1.name_;
            this.bitField0_ |= 4;
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

      public LunarEmoji.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.url_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 2;
                     break;
                  case 26:
                     this.name_ = var1.readStringRequireUtf8();
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

      public LunarEmoji.Builder setId(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.id_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public LunarEmoji.Builder clearId() {
         this.id_ = LunarEmoji.getDefaultInstance().getId();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public LunarEmoji.Builder setIdBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         LunarEmoji.checkByteStringIsUtf8(var1);
         this.id_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
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

      public LunarEmoji.Builder setUrl(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.url_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public LunarEmoji.Builder clearUrl() {
         this.url_ = LunarEmoji.getDefaultInstance().getUrl();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      public LunarEmoji.Builder setUrlBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         LunarEmoji.checkByteStringIsUtf8(var1);
         this.url_ = var1;
         this.bitField0_ |= 2;
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

      public LunarEmoji.Builder setName(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.name_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public LunarEmoji.Builder clearName() {
         this.name_ = LunarEmoji.getDefaultInstance().getName();
         this.bitField0_ &= -5;
         this.onChanged();
         return this;
      }

      public LunarEmoji.Builder setNameBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         LunarEmoji.checkByteStringIsUtf8(var1);
         this.name_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public final LunarEmoji.Builder setUnknownFields(UnknownFieldSet var1) {
         return (LunarEmoji.Builder)super.setUnknownFields(var1);
      }

      public final LunarEmoji.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (LunarEmoji.Builder)super.mergeUnknownFields(var1);
      }
   }
}
