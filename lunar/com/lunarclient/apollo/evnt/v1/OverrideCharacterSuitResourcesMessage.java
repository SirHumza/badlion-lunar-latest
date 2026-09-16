package com.lunarclient.apollo.evnt.v1;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.LazyStringArrayList;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolStringList;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class OverrideCharacterSuitResourcesMessage extends GeneratedMessageV3 implements OverrideCharacterSuitResourcesMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int CHARACTER_TYPE_FIELD_NUMBER = 1;
   private int characterType_ = 0;
   public static final int SUIT_NAMES_FIELD_NUMBER = 2;
   private LazyStringArrayList suitNames_ = LazyStringArrayList.emptyList();
   private byte memoizedIsInitialized = -1;
   private static final OverrideCharacterSuitResourcesMessage DEFAULT_INSTANCE = new OverrideCharacterSuitResourcesMessage();
   private static final Parser<OverrideCharacterSuitResourcesMessage> PARSER = new AbstractParser<OverrideCharacterSuitResourcesMessage>() {
      public OverrideCharacterSuitResourcesMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         OverrideCharacterSuitResourcesMessage.Builder var3 = OverrideCharacterSuitResourcesMessage.newBuilder();

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

   private OverrideCharacterSuitResourcesMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private OverrideCharacterSuitResourcesMessage() {
      this.characterType_ = 0;
      this.suitNames_ = LazyStringArrayList.emptyList();
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new OverrideCharacterSuitResourcesMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CosmeticsProto.internal_static_lunarclient_apollo_evnt_v1_OverrideCharacterSuitResourcesMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CosmeticsProto.internal_static_lunarclient_apollo_evnt_v1_OverrideCharacterSuitResourcesMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(OverrideCharacterSuitResourcesMessage.class, OverrideCharacterSuitResourcesMessage.Builder.class);
   }

   @Override
   public int getCharacterTypeValue() {
      return this.characterType_;
   }

   @Override
   public CharacterType getCharacterType() {
      CharacterType var1 = CharacterType.forNumber(this.characterType_);
      return var1 == null ? CharacterType.UNRECOGNIZED : var1;
   }

   public ProtocolStringList getSuitNamesList() {
      return this.suitNames_;
   }

   @Override
   public int getSuitNamesCount() {
      return this.suitNames_.size();
   }

   @Override
   public String getSuitNames(int var1) {
      return this.suitNames_.get(var1);
   }

   @Override
   public ByteString getSuitNamesBytes(int var1) {
      return this.suitNames_.getByteString(var1);
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
      if (this.characterType_ != CharacterType.CHARACTER_TYPE_UNSPECIFIED.getNumber()) {
         var1.writeEnum(1, this.characterType_);
      }

      for (int var2 = 0; var2 < this.suitNames_.size(); var2++) {
         GeneratedMessageV3.writeString(var1, 2, this.suitNames_.getRaw(var2));
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
      if (this.characterType_ != CharacterType.CHARACTER_TYPE_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(1, this.characterType_);
      }

      int var2 = 0;

      for (int var3 = 0; var3 < this.suitNames_.size(); var3++) {
         var2 += computeStringSizeNoTag(this.suitNames_.getRaw(var3));
      }

      var1 += var2;
      var1 += 1 * this.getSuitNamesList().size();
      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof OverrideCharacterSuitResourcesMessage)) {
         return super.equals(var1);
      } else {
         OverrideCharacterSuitResourcesMessage var2 = (OverrideCharacterSuitResourcesMessage)var1;
         if (this.characterType_ != var2.characterType_) {
            return false;
         } else {
            return !this.getSuitNamesList().equals(var2.getSuitNamesList()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + this.characterType_;
      if (this.getSuitNamesCount() > 0) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getSuitNamesList().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static OverrideCharacterSuitResourcesMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static OverrideCharacterSuitResourcesMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OverrideCharacterSuitResourcesMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static OverrideCharacterSuitResourcesMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OverrideCharacterSuitResourcesMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static OverrideCharacterSuitResourcesMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OverrideCharacterSuitResourcesMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static OverrideCharacterSuitResourcesMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static OverrideCharacterSuitResourcesMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static OverrideCharacterSuitResourcesMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static OverrideCharacterSuitResourcesMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static OverrideCharacterSuitResourcesMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public OverrideCharacterSuitResourcesMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static OverrideCharacterSuitResourcesMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static OverrideCharacterSuitResourcesMessage.Builder newBuilder(OverrideCharacterSuitResourcesMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public OverrideCharacterSuitResourcesMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE
         ? new OverrideCharacterSuitResourcesMessage.Builder()
         : new OverrideCharacterSuitResourcesMessage.Builder().mergeFrom(this);
   }

   protected OverrideCharacterSuitResourcesMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new OverrideCharacterSuitResourcesMessage.Builder(var1);
   }

   public static OverrideCharacterSuitResourcesMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<OverrideCharacterSuitResourcesMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<OverrideCharacterSuitResourcesMessage> getParserForType() {
      return PARSER;
   }

   public OverrideCharacterSuitResourcesMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder
      extends GeneratedMessageV3.Builder<OverrideCharacterSuitResourcesMessage.Builder>
      implements OverrideCharacterSuitResourcesMessageOrBuilder {
      private int bitField0_;
      private int characterType_ = 0;
      private LazyStringArrayList suitNames_ = LazyStringArrayList.emptyList();

      public static final Descriptors.Descriptor getDescriptor() {
         return CosmeticsProto.internal_static_lunarclient_apollo_evnt_v1_OverrideCharacterSuitResourcesMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CosmeticsProto.internal_static_lunarclient_apollo_evnt_v1_OverrideCharacterSuitResourcesMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(OverrideCharacterSuitResourcesMessage.class, OverrideCharacterSuitResourcesMessage.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public OverrideCharacterSuitResourcesMessage.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.characterType_ = 0;
         this.suitNames_ = LazyStringArrayList.emptyList();
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CosmeticsProto.internal_static_lunarclient_apollo_evnt_v1_OverrideCharacterSuitResourcesMessage_descriptor;
      }

      public OverrideCharacterSuitResourcesMessage getDefaultInstanceForType() {
         return OverrideCharacterSuitResourcesMessage.getDefaultInstance();
      }

      public OverrideCharacterSuitResourcesMessage build() {
         OverrideCharacterSuitResourcesMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public OverrideCharacterSuitResourcesMessage buildPartial() {
         OverrideCharacterSuitResourcesMessage var1 = new OverrideCharacterSuitResourcesMessage(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(OverrideCharacterSuitResourcesMessage var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.characterType_ = this.characterType_;
         }

         if ((var2 & 2) != 0) {
            this.suitNames_.makeImmutable();
            var1.suitNames_ = this.suitNames_;
         }
      }

      public OverrideCharacterSuitResourcesMessage.Builder clone() {
         return (OverrideCharacterSuitResourcesMessage.Builder)super.clone();
      }

      public OverrideCharacterSuitResourcesMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (OverrideCharacterSuitResourcesMessage.Builder)super.setField(var1, var2);
      }

      public OverrideCharacterSuitResourcesMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (OverrideCharacterSuitResourcesMessage.Builder)super.clearField(var1);
      }

      public OverrideCharacterSuitResourcesMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (OverrideCharacterSuitResourcesMessage.Builder)super.clearOneof(var1);
      }

      public OverrideCharacterSuitResourcesMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (OverrideCharacterSuitResourcesMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public OverrideCharacterSuitResourcesMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (OverrideCharacterSuitResourcesMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public OverrideCharacterSuitResourcesMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof OverrideCharacterSuitResourcesMessage) {
            return this.mergeFrom((OverrideCharacterSuitResourcesMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public OverrideCharacterSuitResourcesMessage.Builder mergeFrom(OverrideCharacterSuitResourcesMessage var1) {
         if (var1 == OverrideCharacterSuitResourcesMessage.getDefaultInstance()) {
            return this;
         }

         if (var1.characterType_ != 0) {
            this.setCharacterTypeValue(var1.getCharacterTypeValue());
         }

         if (!var1.suitNames_.isEmpty()) {
            if (this.suitNames_.isEmpty()) {
               this.suitNames_ = var1.suitNames_;
               this.bitField0_ |= 2;
            } else {
               this.ensureSuitNamesIsMutable();
               this.suitNames_.addAll(var1.suitNames_);
            }

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

      public OverrideCharacterSuitResourcesMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                  case 8:
                     this.characterType_ = var1.readEnum();
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     String var5 = var1.readStringRequireUtf8();
                     this.ensureSuitNamesIsMutable();
                     this.suitNames_.add(var5);
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
      public int getCharacterTypeValue() {
         return this.characterType_;
      }

      public OverrideCharacterSuitResourcesMessage.Builder setCharacterTypeValue(int var1) {
         this.characterType_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Override
      public CharacterType getCharacterType() {
         CharacterType var1 = CharacterType.forNumber(this.characterType_);
         return var1 == null ? CharacterType.UNRECOGNIZED : var1;
      }

      public OverrideCharacterSuitResourcesMessage.Builder setCharacterType(CharacterType var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 1;
         this.characterType_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public OverrideCharacterSuitResourcesMessage.Builder clearCharacterType() {
         this.bitField0_ &= -2;
         this.characterType_ = 0;
         this.onChanged();
         return this;
      }

      private void ensureSuitNamesIsMutable() {
         if (!this.suitNames_.isModifiable()) {
            this.suitNames_ = new LazyStringArrayList(this.suitNames_);
         }

         this.bitField0_ |= 2;
      }

      public ProtocolStringList getSuitNamesList() {
         this.suitNames_.makeImmutable();
         return this.suitNames_;
      }

      @Override
      public int getSuitNamesCount() {
         return this.suitNames_.size();
      }

      @Override
      public String getSuitNames(int var1) {
         return this.suitNames_.get(var1);
      }

      @Override
      public ByteString getSuitNamesBytes(int var1) {
         return this.suitNames_.getByteString(var1);
      }

      public OverrideCharacterSuitResourcesMessage.Builder setSuitNames(int var1, String var2) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureSuitNamesIsMutable();
         this.suitNames_.set(var1, var2);
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public OverrideCharacterSuitResourcesMessage.Builder addSuitNames(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ensureSuitNamesIsMutable();
         this.suitNames_.add(var1);
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public OverrideCharacterSuitResourcesMessage.Builder addAllSuitNames(Iterable<String> var1) {
         this.ensureSuitNamesIsMutable();
         AbstractMessageLite.Builder.addAll(var1, this.suitNames_);
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public OverrideCharacterSuitResourcesMessage.Builder clearSuitNames() {
         this.suitNames_ = LazyStringArrayList.emptyList();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      public OverrideCharacterSuitResourcesMessage.Builder addSuitNamesBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         OverrideCharacterSuitResourcesMessage.checkByteStringIsUtf8(var1);
         this.ensureSuitNamesIsMutable();
         this.suitNames_.add(var1);
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public final OverrideCharacterSuitResourcesMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (OverrideCharacterSuitResourcesMessage.Builder)super.setUnknownFields(var1);
      }

      public final OverrideCharacterSuitResourcesMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (OverrideCharacterSuitResourcesMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
