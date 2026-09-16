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

public final class ConversationImage extends GeneratedMessageV3 implements ConversationImageOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int URL_FIELD_NUMBER = 1;
   private volatile Object url_ = "";
   private byte memoizedIsInitialized = -1;
   private static final ConversationImage DEFAULT_INSTANCE = new ConversationImage();
   private static final Parser<ConversationImage> PARSER = new AbstractParser<ConversationImage>() {
      public ConversationImage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         ConversationImage.Builder var3 = ConversationImage.newBuilder();

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

   private ConversationImage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private ConversationImage() {
      this.url_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new ConversationImage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_conversation_v1_ConversationImage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_conversation_v1_ConversationImage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(ConversationImage.class, ConversationImage.Builder.class);
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

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      }

      if (!(var1 instanceof ConversationImage)) {
         return super.equals(var1);
      }

      ConversationImage var2 = (ConversationImage)var1;
      return !this.getUrl().equals(var2.getUrl()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static ConversationImage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static ConversationImage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ConversationImage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static ConversationImage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ConversationImage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static ConversationImage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ConversationImage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ConversationImage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ConversationImage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ConversationImage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ConversationImage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ConversationImage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public ConversationImage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static ConversationImage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ConversationImage.Builder newBuilder(ConversationImage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public ConversationImage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new ConversationImage.Builder() : new ConversationImage.Builder().mergeFrom(this);
   }

   protected ConversationImage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new ConversationImage.Builder(var1);
   }

   public static ConversationImage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<ConversationImage> parser() {
      return PARSER;
   }

   @Override
   public Parser<ConversationImage> getParserForType() {
      return PARSER;
   }

   public ConversationImage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<ConversationImage.Builder> implements ConversationImageOrBuilder {
      private int bitField0_;
      private Object url_ = "";

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_conversation_v1_ConversationImage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_conversation_v1_ConversationImage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ConversationImage.class, ConversationImage.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public ConversationImage.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.url_ = "";
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_conversation_v1_ConversationImage_descriptor;
      }

      public ConversationImage getDefaultInstanceForType() {
         return ConversationImage.getDefaultInstance();
      }

      public ConversationImage build() {
         ConversationImage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public ConversationImage buildPartial() {
         ConversationImage var1 = new ConversationImage(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(ConversationImage var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.url_ = this.url_;
         }
      }

      public ConversationImage.Builder clone() {
         return (ConversationImage.Builder)super.clone();
      }

      public ConversationImage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ConversationImage.Builder)super.setField(var1, var2);
      }

      public ConversationImage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (ConversationImage.Builder)super.clearField(var1);
      }

      public ConversationImage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (ConversationImage.Builder)super.clearOneof(var1);
      }

      public ConversationImage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (ConversationImage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public ConversationImage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ConversationImage.Builder)super.addRepeatedField(var1, var2);
      }

      public ConversationImage.Builder mergeFrom(Message var1) {
         if (var1 instanceof ConversationImage) {
            return this.mergeFrom((ConversationImage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public ConversationImage.Builder mergeFrom(ConversationImage var1) {
         if (var1 == ConversationImage.getDefaultInstance()) {
            return this;
         }

         if (!var1.getUrl().isEmpty()) {
            this.url_ = var1.url_;
            this.bitField0_ |= 1;
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

      public ConversationImage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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

      public ConversationImage.Builder setUrl(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.url_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public ConversationImage.Builder clearUrl() {
         this.url_ = ConversationImage.getDefaultInstance().getUrl();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public ConversationImage.Builder setUrlBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         ConversationImage.checkByteStringIsUtf8(var1);
         this.url_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public final ConversationImage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (ConversationImage.Builder)super.setUnknownFields(var1);
      }

      public final ConversationImage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (ConversationImage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
