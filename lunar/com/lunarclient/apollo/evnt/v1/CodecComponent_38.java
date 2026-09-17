package com.lunarclient.apollo.evnt.v1;

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
import com.lunarclient.apollo.common.v1.Uuid;
import com.lunarclient.apollo.common.v1.UuidOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class OverrideCharacterCosmeticMessage extends GeneratedMessageV3 implements OverrideCharacterCosmeticMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int PLAYER_UUID_FIELD_NUMBER = 1;
   private Uuid playerUuid_;
   public static final int CHARACTER_TYPE_FIELD_NUMBER = 2;
   private int characterType_ = 0;
   public static final int SUIT_NAME_FIELD_NUMBER = 3;
   private volatile Object suitName_ = "";
   private byte memoizedIsInitialized = -1;
   private static final OverrideCharacterCosmeticMessage DEFAULT_INSTANCE = new OverrideCharacterCosmeticMessage();
   private static final Parser<OverrideCharacterCosmeticMessage> PARSER = new AbstractParser<OverrideCharacterCosmeticMessage>() {
      public OverrideCharacterCosmeticMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         OverrideCharacterCosmeticMessage.Builder var3 = OverrideCharacterCosmeticMessage.newBuilder();

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

   private OverrideCharacterCosmeticMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private OverrideCharacterCosmeticMessage() {
      this.characterType_ = 0;
      this.suitName_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new OverrideCharacterCosmeticMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CharacterProto.internal_static_lunarclient_apollo_evnt_v1_OverrideCharacterCosmeticMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CharacterProto.internal_static_lunarclient_apollo_evnt_v1_OverrideCharacterCosmeticMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(OverrideCharacterCosmeticMessage.class, OverrideCharacterCosmeticMessage.Builder.class);
   }

   @Override
   public boolean hasPlayerUuid() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public Uuid getPlayerUuid() {
      return this.playerUuid_ == null ? Uuid.getDefaultInstance() : this.playerUuid_;
   }

   @Override
   public UuidOrBuilder getPlayerUuidOrBuilder() {
      return this.playerUuid_ == null ? Uuid.getDefaultInstance() : this.playerUuid_;
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

   @Override
   public String getSuitName() {
      Object var1 = this.suitName_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.suitName_ = var3;
      return var3;
   }

   @Override
   public ByteString getSuitNameBytes() {
      Object var1 = this.suitName_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.suitName_ = var2;
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
      if ((this.bitField0_ & 1) != 0) {
         var1.writeMessage(1, this.getPlayerUuid());
      }

      if (this.characterType_ != CharacterType.CHARACTER_TYPE_UNSPECIFIED.getNumber()) {
         var1.writeEnum(2, this.characterType_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.suitName_)) {
         GeneratedMessageV3.writeString(var1, 3, this.suitName_);
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
      if ((this.bitField0_ & 1) != 0) {
         var1 += CodedOutputStream.computeMessageSize(1, this.getPlayerUuid());
      }

      if (this.characterType_ != CharacterType.CHARACTER_TYPE_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(2, this.characterType_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.suitName_)) {
         var1 += GeneratedMessageV3.computeStringSize(3, this.suitName_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof OverrideCharacterCosmeticMessage)) {
         return super.equals(var1);
      } else {
         OverrideCharacterCosmeticMessage var2 = (OverrideCharacterCosmeticMessage)var1;
         if (this.hasPlayerUuid() != var2.hasPlayerUuid()) {
            return false;
         } else if (this.hasPlayerUuid() && !this.getPlayerUuid().equals(var2.getPlayerUuid())) {
            return false;
         } else if (this.characterType_ != var2.characterType_) {
            return false;
         } else {
            return !this.getSuitName().equals(var2.getSuitName()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.hasPlayerUuid()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getPlayerUuid().hashCode();
      }

      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + this.characterType_;
      var1 = 37 * var1 + 3;
      var1 = 53 * var1 + this.getSuitName().hashCode();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static OverrideCharacterCosmeticMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static OverrideCharacterCosmeticMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OverrideCharacterCosmeticMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static OverrideCharacterCosmeticMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OverrideCharacterCosmeticMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static OverrideCharacterCosmeticMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OverrideCharacterCosmeticMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static OverrideCharacterCosmeticMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static OverrideCharacterCosmeticMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static OverrideCharacterCosmeticMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static OverrideCharacterCosmeticMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static OverrideCharacterCosmeticMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public OverrideCharacterCosmeticMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static OverrideCharacterCosmeticMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static OverrideCharacterCosmeticMessage.Builder newBuilder(OverrideCharacterCosmeticMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public OverrideCharacterCosmeticMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new OverrideCharacterCosmeticMessage.Builder() : new OverrideCharacterCosmeticMessage.Builder().mergeFrom(this);
   }

   protected OverrideCharacterCosmeticMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new OverrideCharacterCosmeticMessage.Builder(var1);
   }

   public static OverrideCharacterCosmeticMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<OverrideCharacterCosmeticMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<OverrideCharacterCosmeticMessage> getParserForType() {
      return PARSER;
   }

   public OverrideCharacterCosmeticMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder
      extends GeneratedMessageV3.Builder<OverrideCharacterCosmeticMessage.Builder>
      implements OverrideCharacterCosmeticMessageOrBuilder {
      private int bitField0_;
      private Uuid playerUuid_;
      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> playerUuidBuilder_;
      private int characterType_ = 0;
      private Object suitName_ = "";

      public static final Descriptors.Descriptor getDescriptor() {
         return CharacterProto.internal_static_lunarclient_apollo_evnt_v1_OverrideCharacterCosmeticMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CharacterProto.internal_static_lunarclient_apollo_evnt_v1_OverrideCharacterCosmeticMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(OverrideCharacterCosmeticMessage.class, OverrideCharacterCosmeticMessage.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (OverrideCharacterCosmeticMessage.alwaysUseFieldBuilders) {
            this.getPlayerUuidFieldBuilder();
         }
      }

      public OverrideCharacterCosmeticMessage.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.playerUuid_ = null;
         if (this.playerUuidBuilder_ != null) {
            this.playerUuidBuilder_.dispose();
            this.playerUuidBuilder_ = null;
         }

         this.characterType_ = 0;
         this.suitName_ = "";
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CharacterProto.internal_static_lunarclient_apollo_evnt_v1_OverrideCharacterCosmeticMessage_descriptor;
      }

      public OverrideCharacterCosmeticMessage getDefaultInstanceForType() {
         return OverrideCharacterCosmeticMessage.getDefaultInstance();
      }

      public OverrideCharacterCosmeticMessage build() {
         OverrideCharacterCosmeticMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public OverrideCharacterCosmeticMessage buildPartial() {
         OverrideCharacterCosmeticMessage var1 = new OverrideCharacterCosmeticMessage(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(OverrideCharacterCosmeticMessage var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.playerUuid_ = this.playerUuidBuilder_ == null ? this.playerUuid_ : this.playerUuidBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.characterType_ = this.characterType_;
         }

         if ((var2 & 4) != 0) {
            var1.suitName_ = this.suitName_;
         }

         OverrideCharacterCosmeticMessage var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public OverrideCharacterCosmeticMessage.Builder clone() {
         return (OverrideCharacterCosmeticMessage.Builder)super.clone();
      }

      public OverrideCharacterCosmeticMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (OverrideCharacterCosmeticMessage.Builder)super.setField(var1, var2);
      }

      public OverrideCharacterCosmeticMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (OverrideCharacterCosmeticMessage.Builder)super.clearField(var1);
      }

      public OverrideCharacterCosmeticMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (OverrideCharacterCosmeticMessage.Builder)super.clearOneof(var1);
      }

      public OverrideCharacterCosmeticMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (OverrideCharacterCosmeticMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public OverrideCharacterCosmeticMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (OverrideCharacterCosmeticMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public OverrideCharacterCosmeticMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof OverrideCharacterCosmeticMessage) {
            return this.mergeFrom((OverrideCharacterCosmeticMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public OverrideCharacterCosmeticMessage.Builder mergeFrom(OverrideCharacterCosmeticMessage var1) {
         if (var1 == OverrideCharacterCosmeticMessage.getDefaultInstance()) {
            return this;
         }

         if (var1.hasPlayerUuid()) {
            this.mergePlayerUuid(var1.getPlayerUuid());
         }

         if (var1.characterType_ != 0) {
            this.setCharacterTypeValue(var1.getCharacterTypeValue());
         }

         if (!var1.getSuitName().isEmpty()) {
            this.suitName_ = var1.suitName_;
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

      public OverrideCharacterCosmeticMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getPlayerUuidFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 1;
                     break;
                  case 16:
                     this.characterType_ = var1.readEnum();
                     this.bitField0_ |= 2;
                     break;
                  case 26:
                     this.suitName_ = var1.readStringRequireUtf8();
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
      public boolean hasPlayerUuid() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public Uuid getPlayerUuid() {
         if (this.playerUuidBuilder_ == null) {
            return this.playerUuid_ == null ? Uuid.getDefaultInstance() : this.playerUuid_;
         } else {
            return this.playerUuidBuilder_.getMessage();
         }
      }

      public OverrideCharacterCosmeticMessage.Builder setPlayerUuid(Uuid var1) {
         if (this.playerUuidBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.playerUuid_ = var1;
         } else {
            this.playerUuidBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public OverrideCharacterCosmeticMessage.Builder setPlayerUuid(Uuid.Builder var1) {
         if (this.playerUuidBuilder_ == null) {
            this.playerUuid_ = var1.build();
         } else {
            this.playerUuidBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public OverrideCharacterCosmeticMessage.Builder mergePlayerUuid(Uuid var1) {
         if (this.playerUuidBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.playerUuid_ != null && this.playerUuid_ != Uuid.getDefaultInstance()) {
               this.getPlayerUuidBuilder().mergeFrom(var1);
            } else {
               this.playerUuid_ = var1;
            }
         } else {
            this.playerUuidBuilder_.mergeFrom(var1);
         }

         if (this.playerUuid_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public OverrideCharacterCosmeticMessage.Builder clearPlayerUuid() {
         this.bitField0_ &= -2;
         this.playerUuid_ = null;
         if (this.playerUuidBuilder_ != null) {
            this.playerUuidBuilder_.dispose();
            this.playerUuidBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Uuid.Builder getPlayerUuidBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getPlayerUuidFieldBuilder().getBuilder();
      }

      @Override
      public UuidOrBuilder getPlayerUuidOrBuilder() {
         if (this.playerUuidBuilder_ != null) {
            return this.playerUuidBuilder_.getMessageOrBuilder();
         } else {
            return this.playerUuid_ == null ? Uuid.getDefaultInstance() : this.playerUuid_;
         }
      }

      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> getPlayerUuidFieldBuilder() {
         if (this.playerUuidBuilder_ == null) {
            this.playerUuidBuilder_ = new SingleFieldBuilderV3<>(this.getPlayerUuid(), this.getParentForChildren(), this.isClean());
            this.playerUuid_ = null;
         }

         return this.playerUuidBuilder_;
      }

      @Override
      public int getCharacterTypeValue() {
         return this.characterType_;
      }

      public OverrideCharacterCosmeticMessage.Builder setCharacterTypeValue(int var1) {
         this.characterType_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      @Override
      public CharacterType getCharacterType() {
         CharacterType var1 = CharacterType.forNumber(this.characterType_);
         return var1 == null ? CharacterType.UNRECOGNIZED : var1;
      }

      public OverrideCharacterCosmeticMessage.Builder setCharacterType(CharacterType var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 2;
         this.characterType_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public OverrideCharacterCosmeticMessage.Builder clearCharacterType() {
         this.bitField0_ &= -3;
         this.characterType_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public String getSuitName() {
         Object var1 = this.suitName_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.suitName_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getSuitNameBytes() {
         Object var1 = this.suitName_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.suitName_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public OverrideCharacterCosmeticMessage.Builder setSuitName(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.suitName_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public OverrideCharacterCosmeticMessage.Builder clearSuitName() {
         this.suitName_ = OverrideCharacterCosmeticMessage.getDefaultInstance().getSuitName();
         this.bitField0_ &= -5;
         this.onChanged();
         return this;
      }

      public OverrideCharacterCosmeticMessage.Builder setSuitNameBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         OverrideCharacterCosmeticMessage.checkByteStringIsUtf8(var1);
         this.suitName_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public final OverrideCharacterCosmeticMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (OverrideCharacterCosmeticMessage.Builder)super.setUnknownFields(var1);
      }

      public final OverrideCharacterCosmeticMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (OverrideCharacterCosmeticMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
