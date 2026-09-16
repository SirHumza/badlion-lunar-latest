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

public final class CharacterAbilityMessage extends GeneratedMessageV3 implements CharacterAbilityMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int CHARACTER_TYPE_FIELD_NUMBER = 1;
   private int characterType_ = 0;
   public static final int ABILITIES_ADVENTURE_FIELD_NUMBER = 2;
   private LazyStringArrayList abilitiesAdventure_ = LazyStringArrayList.emptyList();
   private byte memoizedIsInitialized = -1;
   private static final CharacterAbilityMessage DEFAULT_INSTANCE = new CharacterAbilityMessage();
   private static final Parser<CharacterAbilityMessage> PARSER = new AbstractParser<CharacterAbilityMessage>() {
      public CharacterAbilityMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         CharacterAbilityMessage.Builder var3 = CharacterAbilityMessage.newBuilder();

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

   private CharacterAbilityMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private CharacterAbilityMessage() {
      this.characterType_ = 0;
      this.abilitiesAdventure_ = LazyStringArrayList.emptyList();
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new CharacterAbilityMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CharacterProto.internal_static_lunarclient_apollo_evnt_v1_CharacterAbilityMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CharacterProto.internal_static_lunarclient_apollo_evnt_v1_CharacterAbilityMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(CharacterAbilityMessage.class, CharacterAbilityMessage.Builder.class);
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

   public ProtocolStringList getAbilitiesAdventureList() {
      return this.abilitiesAdventure_;
   }

   @Override
   public int getAbilitiesAdventureCount() {
      return this.abilitiesAdventure_.size();
   }

   @Override
   public String getAbilitiesAdventure(int var1) {
      return this.abilitiesAdventure_.get(var1);
   }

   @Override
   public ByteString getAbilitiesAdventureBytes(int var1) {
      return this.abilitiesAdventure_.getByteString(var1);
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

      for (int var2 = 0; var2 < this.abilitiesAdventure_.size(); var2++) {
         GeneratedMessageV3.writeString(var1, 2, this.abilitiesAdventure_.getRaw(var2));
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

      for (int var3 = 0; var3 < this.abilitiesAdventure_.size(); var3++) {
         var2 += computeStringSizeNoTag(this.abilitiesAdventure_.getRaw(var3));
      }

      var1 += var2;
      var1 += 1 * this.getAbilitiesAdventureList().size();
      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof CharacterAbilityMessage)) {
         return super.equals(var1);
      } else {
         CharacterAbilityMessage var2 = (CharacterAbilityMessage)var1;
         if (this.characterType_ != var2.characterType_) {
            return false;
         } else {
            return !this.getAbilitiesAdventureList().equals(var2.getAbilitiesAdventureList()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.getAbilitiesAdventureCount() > 0) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getAbilitiesAdventureList().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static CharacterAbilityMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static CharacterAbilityMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static CharacterAbilityMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static CharacterAbilityMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static CharacterAbilityMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static CharacterAbilityMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static CharacterAbilityMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static CharacterAbilityMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static CharacterAbilityMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static CharacterAbilityMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static CharacterAbilityMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static CharacterAbilityMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public CharacterAbilityMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static CharacterAbilityMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static CharacterAbilityMessage.Builder newBuilder(CharacterAbilityMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public CharacterAbilityMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new CharacterAbilityMessage.Builder() : new CharacterAbilityMessage.Builder().mergeFrom(this);
   }

   protected CharacterAbilityMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new CharacterAbilityMessage.Builder(var1);
   }

   public static CharacterAbilityMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<CharacterAbilityMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<CharacterAbilityMessage> getParserForType() {
      return PARSER;
   }

   public CharacterAbilityMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<CharacterAbilityMessage.Builder> implements CharacterAbilityMessageOrBuilder {
      private int bitField0_;
      private int characterType_ = 0;
      private LazyStringArrayList abilitiesAdventure_ = LazyStringArrayList.emptyList();

      public static final Descriptors.Descriptor getDescriptor() {
         return CharacterProto.internal_static_lunarclient_apollo_evnt_v1_CharacterAbilityMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CharacterProto.internal_static_lunarclient_apollo_evnt_v1_CharacterAbilityMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(CharacterAbilityMessage.class, CharacterAbilityMessage.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public CharacterAbilityMessage.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.characterType_ = 0;
         this.abilitiesAdventure_ = LazyStringArrayList.emptyList();
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CharacterProto.internal_static_lunarclient_apollo_evnt_v1_CharacterAbilityMessage_descriptor;
      }

      public CharacterAbilityMessage getDefaultInstanceForType() {
         return CharacterAbilityMessage.getDefaultInstance();
      }

      public CharacterAbilityMessage build() {
         CharacterAbilityMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public CharacterAbilityMessage buildPartial() {
         CharacterAbilityMessage var1 = new CharacterAbilityMessage(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(CharacterAbilityMessage var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.characterType_ = this.characterType_;
         }

         if ((var2 & 2) != 0) {
            this.abilitiesAdventure_.makeImmutable();
            var1.abilitiesAdventure_ = this.abilitiesAdventure_;
         }
      }

      public CharacterAbilityMessage.Builder clone() {
         return (CharacterAbilityMessage.Builder)super.clone();
      }

      public CharacterAbilityMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (CharacterAbilityMessage.Builder)super.setField(var1, var2);
      }

      public CharacterAbilityMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (CharacterAbilityMessage.Builder)super.clearField(var1);
      }

      public CharacterAbilityMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (CharacterAbilityMessage.Builder)super.clearOneof(var1);
      }

      public CharacterAbilityMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (CharacterAbilityMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public CharacterAbilityMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (CharacterAbilityMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public CharacterAbilityMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof CharacterAbilityMessage) {
            return this.mergeFrom((CharacterAbilityMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public CharacterAbilityMessage.Builder mergeFrom(CharacterAbilityMessage var1) {
         if (var1 == CharacterAbilityMessage.getDefaultInstance()) {
            return this;
         }

         if (var1.characterType_ != 0) {
            this.setCharacterTypeValue(var1.getCharacterTypeValue());
         }

         if (!var1.abilitiesAdventure_.isEmpty()) {
            if (this.abilitiesAdventure_.isEmpty()) {
               this.abilitiesAdventure_ = var1.abilitiesAdventure_;
               this.bitField0_ |= 2;
            } else {
               this.ensureAbilitiesAdventureIsMutable();
               this.abilitiesAdventure_.addAll(var1.abilitiesAdventure_);
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

      public CharacterAbilityMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.ensureAbilitiesAdventureIsMutable();
                     this.abilitiesAdventure_.add(var5);
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

      public CharacterAbilityMessage.Builder setCharacterTypeValue(int var1) {
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

      public CharacterAbilityMessage.Builder setCharacterType(CharacterType var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 1;
         this.characterType_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public CharacterAbilityMessage.Builder clearCharacterType() {
         this.bitField0_ &= -2;
         this.characterType_ = 0;
         this.onChanged();
         return this;
      }

      private void ensureAbilitiesAdventureIsMutable() {
         if (!this.abilitiesAdventure_.isModifiable()) {
            this.abilitiesAdventure_ = new LazyStringArrayList(this.abilitiesAdventure_);
         }

         this.bitField0_ |= 2;
      }

      public ProtocolStringList getAbilitiesAdventureList() {
         this.abilitiesAdventure_.makeImmutable();
         return this.abilitiesAdventure_;
      }

      @Override
      public int getAbilitiesAdventureCount() {
         return this.abilitiesAdventure_.size();
      }

      @Override
      public String getAbilitiesAdventure(int var1) {
         return this.abilitiesAdventure_.get(var1);
      }

      @Override
      public ByteString getAbilitiesAdventureBytes(int var1) {
         return this.abilitiesAdventure_.getByteString(var1);
      }

      public CharacterAbilityMessage.Builder setAbilitiesAdventure(int var1, String var2) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureAbilitiesAdventureIsMutable();
         this.abilitiesAdventure_.set(var1, var2);
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public CharacterAbilityMessage.Builder addAbilitiesAdventure(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ensureAbilitiesAdventureIsMutable();
         this.abilitiesAdventure_.add(var1);
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public CharacterAbilityMessage.Builder addAllAbilitiesAdventure(Iterable<String> var1) {
         this.ensureAbilitiesAdventureIsMutable();
         AbstractMessageLite.Builder.addAll(var1, this.abilitiesAdventure_);
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public CharacterAbilityMessage.Builder clearAbilitiesAdventure() {
         this.abilitiesAdventure_ = LazyStringArrayList.emptyList();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      public CharacterAbilityMessage.Builder addAbilitiesAdventureBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         CharacterAbilityMessage.checkByteStringIsUtf8(var1);
         this.ensureAbilitiesAdventureIsMutable();
         this.abilitiesAdventure_.add(var1);
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public final CharacterAbilityMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (CharacterAbilityMessage.Builder)super.setUnknownFields(var1);
      }

      public final CharacterAbilityMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (CharacterAbilityMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
