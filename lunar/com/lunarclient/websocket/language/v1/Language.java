package com.lunarclient.websocket.language.v1;

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
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class Language extends GeneratedMessageV3 implements LanguageOrBuilder {
   private static final long serialVersionUID = 0L;
   private int languageCase_ = 0;
   private Object language_;
   public static final int ISO_639_3_CODE_FIELD_NUMBER = 1;
   public static final int MINECRAFT_CODE_FIELD_NUMBER = 2;
   private byte memoizedIsInitialized = -1;
   private static final Language DEFAULT_INSTANCE = new Language();
   private static final Parser<Language> PARSER = new AbstractParser<Language>() {
      public Language parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         Language.Builder var3 = Language.newBuilder();

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

   private Language(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private Language() {
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new Language();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_language_v1_Language_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_language_v1_Language_fieldAccessorTable
         .ensureFieldAccessorsInitialized(Language.class, Language.Builder.class);
   }

   @Override
   public Language.LanguageCase getLanguageCase() {
      return Language.LanguageCase.forNumber(this.languageCase_);
   }

   @Override
   public boolean hasIso6393Code() {
      return this.languageCase_ == 1;
   }

   @Override
   public String getIso6393Code() {
      Object var1 = "";
      if (this.languageCase_ == 1) {
         var1 = this.language_;
      }

      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      if (this.languageCase_ == 1) {
         this.language_ = var3;
      }

      return var3;
   }

   @Override
   public ByteString getIso6393CodeBytes() {
      Object var1 = "";
      if (this.languageCase_ == 1) {
         var1 = this.language_;
      }

      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         if (this.languageCase_ == 1) {
            this.language_ = var2;
         }

         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public boolean hasMinecraftCode() {
      return this.languageCase_ == 2;
   }

   @Override
   public String getMinecraftCode() {
      Object var1 = "";
      if (this.languageCase_ == 2) {
         var1 = this.language_;
      }

      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      if (this.languageCase_ == 2) {
         this.language_ = var3;
      }

      return var3;
   }

   @Override
   public ByteString getMinecraftCodeBytes() {
      Object var1 = "";
      if (this.languageCase_ == 2) {
         var1 = this.language_;
      }

      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         if (this.languageCase_ == 2) {
            this.language_ = var2;
         }

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
      if (this.languageCase_ == 1) {
         GeneratedMessageV3.writeString(var1, 1, this.language_);
      }

      if (this.languageCase_ == 2) {
         GeneratedMessageV3.writeString(var1, 2, this.language_);
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
      if (this.languageCase_ == 1) {
         var1 += GeneratedMessageV3.computeStringSize(1, this.language_);
      }

      if (this.languageCase_ == 2) {
         var1 += GeneratedMessageV3.computeStringSize(2, this.language_);
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

      if (!(var1 instanceof Language)) {
         return super.equals(var1);
      }

      Language var2 = (Language)var1;
      if (!this.getLanguageCase().equals(var2.getLanguageCase())) {
         return false;
      }

      switch (this.languageCase_) {
         case 0:
         default:
            break;
         case 1:
            if (!this.getIso6393Code().equals(var2.getIso6393Code())) {
               return false;
            }
            break;
         case 2:
            if (!this.getMinecraftCode().equals(var2.getMinecraftCode())) {
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
      switch (this.languageCase_) {
         case 0:
         default:
            break;
         case 1:
            var1 = 37 * var1 + 1;
            var1 = 53 * var1 + this.getIso6393Code().hashCode();
            break;
         case 2:
            var1 = 37 * var1 + 2;
            var1 = 53 * var1 + this.getMinecraftCode().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static Language parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static Language parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Language parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static Language parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Language parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static Language parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static Language parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Language parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static Language parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static Language parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static Language parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static Language parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public Language.Builder newBuilderForType() {
      return newBuilder();
   }

   public static Language.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static Language.Builder newBuilder(Language var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public Language.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new Language.Builder() : new Language.Builder().mergeFrom(this);
   }

   protected Language.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new Language.Builder(var1);
   }

   public static Language getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<Language> parser() {
      return PARSER;
   }

   @Override
   public Parser<Language> getParserForType() {
      return PARSER;
   }

   public Language getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<Language.Builder> implements LanguageOrBuilder {
      private int languageCase_ = 0;
      private Object language_;
      private int bitField0_;

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_language_v1_Language_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_language_v1_Language_fieldAccessorTable
            .ensureFieldAccessorsInitialized(Language.class, Language.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public Language.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.languageCase_ = 0;
         this.language_ = null;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_language_v1_Language_descriptor;
      }

      public Language getDefaultInstanceForType() {
         return Language.getDefaultInstance();
      }

      public Language build() {
         Language var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public Language buildPartial() {
         Language var1 = new Language(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.buildPartialOneofs(var1);
         this.onBuilt();
         return var1;
      }

      private void buildPartial0(Language var1) {
         int var2 = this.bitField0_;
      }

      private void buildPartialOneofs(Language var1) {
         var1.languageCase_ = this.languageCase_;
         var1.language_ = this.language_;
      }

      public Language.Builder clone() {
         return (Language.Builder)super.clone();
      }

      public Language.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (Language.Builder)super.setField(var1, var2);
      }

      public Language.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (Language.Builder)super.clearField(var1);
      }

      public Language.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (Language.Builder)super.clearOneof(var1);
      }

      public Language.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (Language.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public Language.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (Language.Builder)super.addRepeatedField(var1, var2);
      }

      public Language.Builder mergeFrom(Message var1) {
         if (var1 instanceof Language) {
            return this.mergeFrom((Language)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public Language.Builder mergeFrom(Language var1) {
         if (var1 == Language.getDefaultInstance()) {
            return this;
         }

         switch (var1.getLanguageCase()) {
            case ISO_639_3_CODE:
               this.languageCase_ = 1;
               this.language_ = var1.language_;
               this.onChanged();
               break;
            case MINECRAFT_CODE:
               this.languageCase_ = 2;
               this.language_ = var1.language_;
               this.onChanged();
            case LANGUAGE_NOT_SET:
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public Language.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.languageCase_ = 1;
                     this.language_ = var11;
                     break;
                  case 18:
                     String var5 = var1.readStringRequireUtf8();
                     this.languageCase_ = 2;
                     this.language_ = var5;
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
      public Language.LanguageCase getLanguageCase() {
         return Language.LanguageCase.forNumber(this.languageCase_);
      }

      public Language.Builder clearLanguage() {
         this.languageCase_ = 0;
         this.language_ = null;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasIso6393Code() {
         return this.languageCase_ == 1;
      }

      @Override
      public String getIso6393Code() {
         Object var1 = "";
         if (this.languageCase_ == 1) {
            var1 = this.language_;
         }

         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            if (this.languageCase_ == 1) {
               this.language_ = var3;
            }

            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getIso6393CodeBytes() {
         Object var1 = "";
         if (this.languageCase_ == 1) {
            var1 = this.language_;
         }

         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            if (this.languageCase_ == 1) {
               this.language_ = var2;
            }

            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public Language.Builder setIso6393Code(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.languageCase_ = 1;
         this.language_ = var1;
         this.onChanged();
         return this;
      }

      public Language.Builder clearIso6393Code() {
         if (this.languageCase_ == 1) {
            this.languageCase_ = 0;
            this.language_ = null;
            this.onChanged();
         }

         return this;
      }

      public Language.Builder setIso6393CodeBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         Language.checkByteStringIsUtf8(var1);
         this.languageCase_ = 1;
         this.language_ = var1;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasMinecraftCode() {
         return this.languageCase_ == 2;
      }

      @Override
      public String getMinecraftCode() {
         Object var1 = "";
         if (this.languageCase_ == 2) {
            var1 = this.language_;
         }

         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            if (this.languageCase_ == 2) {
               this.language_ = var3;
            }

            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getMinecraftCodeBytes() {
         Object var1 = "";
         if (this.languageCase_ == 2) {
            var1 = this.language_;
         }

         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            if (this.languageCase_ == 2) {
               this.language_ = var2;
            }

            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public Language.Builder setMinecraftCode(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.languageCase_ = 2;
         this.language_ = var1;
         this.onChanged();
         return this;
      }

      public Language.Builder clearMinecraftCode() {
         if (this.languageCase_ == 2) {
            this.languageCase_ = 0;
            this.language_ = null;
            this.onChanged();
         }

         return this;
      }

      public Language.Builder setMinecraftCodeBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         Language.checkByteStringIsUtf8(var1);
         this.languageCase_ = 2;
         this.language_ = var1;
         this.onChanged();
         return this;
      }

      public final Language.Builder setUnknownFields(UnknownFieldSet var1) {
         return (Language.Builder)super.setUnknownFields(var1);
      }

      public final Language.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (Language.Builder)super.mergeUnknownFields(var1);
      }
   }

   public enum LanguageCase implements AbstractMessageLite.InternalOneOfEnum, Internal.EnumLite {
      ISO_639_3_CODE(1),
      MINECRAFT_CODE(2),
      LANGUAGE_NOT_SET(0);

      private final int value;

      LanguageCase(int var3) {
         this.value = var3;
      }

      @Deprecated
      public static Language.LanguageCase valueOf(int var0) {
         return forNumber(var0);
      }

      public static Language.LanguageCase forNumber(int var0) {
         switch (var0) {
            case 0:
               return LANGUAGE_NOT_SET;
            case 1:
               return ISO_639_3_CODE;
            case 2:
               return MINECRAFT_CODE;
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
