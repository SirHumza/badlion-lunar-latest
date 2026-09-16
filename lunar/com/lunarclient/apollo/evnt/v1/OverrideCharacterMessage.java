package com.lunarclient.apollo.evnt.v1;

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
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import com.lunarclient.apollo.common.v1.Color;
import com.lunarclient.apollo.common.v1.ColorOrBuilder;
import com.lunarclient.apollo.common.v1.Uuid;
import com.lunarclient.apollo.common.v1.UuidOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class OverrideCharacterMessage extends GeneratedMessageV3 implements OverrideCharacterMessageOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int CHARACTER_TYPE_FIELD_NUMBER = 1;
   private int characterType_ = 0;
   public static final int PLAYER_UUID_FIELD_NUMBER = 2;
   private Uuid playerUuid_;
   public static final int COLOR_FIELD_NUMBER = 3;
   private Color color_;
   public static final int EQUIPPED_FIELD_NUMBER = 4;
   private boolean equipped_ = false;
   public static final int SUIT_NAME_FIELD_NUMBER = 5;
   private volatile Object suitName_ = "";
   private byte memoizedIsInitialized = -1;
   private static final OverrideCharacterMessage DEFAULT_INSTANCE = new OverrideCharacterMessage();
   private static final Parser<OverrideCharacterMessage> PARSER = new AbstractParser<OverrideCharacterMessage>() {
      public OverrideCharacterMessage parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         OverrideCharacterMessage.Builder var3 = OverrideCharacterMessage.newBuilder();

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

   private OverrideCharacterMessage(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private OverrideCharacterMessage() {
      this.characterType_ = 0;
      this.suitName_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new OverrideCharacterMessage();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CharacterProto.internal_static_lunarclient_apollo_evnt_v1_OverrideCharacterMessage_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CharacterProto.internal_static_lunarclient_apollo_evnt_v1_OverrideCharacterMessage_fieldAccessorTable
         .ensureFieldAccessorsInitialized(OverrideCharacterMessage.class, OverrideCharacterMessage.Builder.class);
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
   public boolean hasColor() {
      return (this.bitField0_ & 2) != 0;
   }

   @Override
   public Color getColor() {
      return this.color_ == null ? Color.getDefaultInstance() : this.color_;
   }

   @Override
   public ColorOrBuilder getColorOrBuilder() {
      return this.color_ == null ? Color.getDefaultInstance() : this.color_;
   }

   @Override
   public boolean getEquipped() {
      return this.equipped_;
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
      if (this.characterType_ != CharacterType.CHARACTER_TYPE_UNSPECIFIED.getNumber()) {
         var1.writeEnum(1, this.characterType_);
      }

      if ((this.bitField0_ & 1) != 0) {
         var1.writeMessage(2, this.getPlayerUuid());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1.writeMessage(3, this.getColor());
      }

      if (this.equipped_) {
         var1.writeBool(4, this.equipped_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.suitName_)) {
         GeneratedMessageV3.writeString(var1, 5, this.suitName_);
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

      if ((this.bitField0_ & 1) != 0) {
         var1 += CodedOutputStream.computeMessageSize(2, this.getPlayerUuid());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1 += CodedOutputStream.computeMessageSize(3, this.getColor());
      }

      if (this.equipped_) {
         var1 += CodedOutputStream.computeBoolSize(4, this.equipped_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.suitName_)) {
         var1 += GeneratedMessageV3.computeStringSize(5, this.suitName_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof OverrideCharacterMessage)) {
         return super.equals(var1);
      } else {
         OverrideCharacterMessage var2 = (OverrideCharacterMessage)var1;
         if (this.characterType_ != var2.characterType_) {
            return false;
         } else if (this.hasPlayerUuid() != var2.hasPlayerUuid()) {
            return false;
         } else if (this.hasPlayerUuid() && !this.getPlayerUuid().equals(var2.getPlayerUuid())) {
            return false;
         } else if (this.hasColor() != var2.hasColor()) {
            return false;
         } else if (this.hasColor() && !this.getColor().equals(var2.getColor())) {
            return false;
         } else if (this.getEquipped() != var2.getEquipped()) {
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
      var1 = 37 * var1 + 1;
      var1 = 53 * var1 + this.characterType_;
      if (this.hasPlayerUuid()) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getPlayerUuid().hashCode();
      }

      if (this.hasColor()) {
         var1 = 37 * var1 + 3;
         var1 = 53 * var1 + this.getColor().hashCode();
      }

      var1 = 37 * var1 + 4;
      var1 = 53 * var1 + Internal.hashBoolean(this.getEquipped());
      var1 = 37 * var1 + 5;
      var1 = 53 * var1 + this.getSuitName().hashCode();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static OverrideCharacterMessage parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static OverrideCharacterMessage parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OverrideCharacterMessage parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static OverrideCharacterMessage parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OverrideCharacterMessage parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static OverrideCharacterMessage parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static OverrideCharacterMessage parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static OverrideCharacterMessage parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static OverrideCharacterMessage parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static OverrideCharacterMessage parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static OverrideCharacterMessage parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static OverrideCharacterMessage parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public OverrideCharacterMessage.Builder newBuilderForType() {
      return newBuilder();
   }

   public static OverrideCharacterMessage.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static OverrideCharacterMessage.Builder newBuilder(OverrideCharacterMessage var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public OverrideCharacterMessage.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new OverrideCharacterMessage.Builder() : new OverrideCharacterMessage.Builder().mergeFrom(this);
   }

   protected OverrideCharacterMessage.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new OverrideCharacterMessage.Builder(var1);
   }

   public static OverrideCharacterMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<OverrideCharacterMessage> parser() {
      return PARSER;
   }

   @Override
   public Parser<OverrideCharacterMessage> getParserForType() {
      return PARSER;
   }

   public OverrideCharacterMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<OverrideCharacterMessage.Builder> implements OverrideCharacterMessageOrBuilder {
      private int bitField0_;
      private int characterType_ = 0;
      private Uuid playerUuid_;
      private SingleFieldBuilderV3<Uuid, Uuid.Builder, UuidOrBuilder> playerUuidBuilder_;
      private Color color_;
      private SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> colorBuilder_;
      private boolean equipped_;
      private Object suitName_ = "";

      public static final Descriptors.Descriptor getDescriptor() {
         return CharacterProto.internal_static_lunarclient_apollo_evnt_v1_OverrideCharacterMessage_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CharacterProto.internal_static_lunarclient_apollo_evnt_v1_OverrideCharacterMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(OverrideCharacterMessage.class, OverrideCharacterMessage.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (OverrideCharacterMessage.alwaysUseFieldBuilders) {
            this.getPlayerUuidFieldBuilder();
            this.getColorFieldBuilder();
         }
      }

      public OverrideCharacterMessage.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.characterType_ = 0;
         this.playerUuid_ = null;
         if (this.playerUuidBuilder_ != null) {
            this.playerUuidBuilder_.dispose();
            this.playerUuidBuilder_ = null;
         }

         this.color_ = null;
         if (this.colorBuilder_ != null) {
            this.colorBuilder_.dispose();
            this.colorBuilder_ = null;
         }

         this.equipped_ = false;
         this.suitName_ = "";
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CharacterProto.internal_static_lunarclient_apollo_evnt_v1_OverrideCharacterMessage_descriptor;
      }

      public OverrideCharacterMessage getDefaultInstanceForType() {
         return OverrideCharacterMessage.getDefaultInstance();
      }

      public OverrideCharacterMessage build() {
         OverrideCharacterMessage var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public OverrideCharacterMessage buildPartial() {
         OverrideCharacterMessage var1 = new OverrideCharacterMessage(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(OverrideCharacterMessage var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.characterType_ = this.characterType_;
         }

         byte var3 = 0;
         if ((var2 & 2) != 0) {
            var1.playerUuid_ = this.playerUuidBuilder_ == null ? this.playerUuid_ : this.playerUuidBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 4) != 0) {
            var1.color_ = this.colorBuilder_ == null ? this.color_ : this.colorBuilder_.build();
            var3 |= 2;
         }

         if ((var2 & 8) != 0) {
            var1.equipped_ = this.equipped_;
         }

         if ((var2 & 16) != 0) {
            var1.suitName_ = this.suitName_;
         }

         OverrideCharacterMessage var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public OverrideCharacterMessage.Builder clone() {
         return (OverrideCharacterMessage.Builder)super.clone();
      }

      public OverrideCharacterMessage.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (OverrideCharacterMessage.Builder)super.setField(var1, var2);
      }

      public OverrideCharacterMessage.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (OverrideCharacterMessage.Builder)super.clearField(var1);
      }

      public OverrideCharacterMessage.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (OverrideCharacterMessage.Builder)super.clearOneof(var1);
      }

      public OverrideCharacterMessage.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (OverrideCharacterMessage.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public OverrideCharacterMessage.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (OverrideCharacterMessage.Builder)super.addRepeatedField(var1, var2);
      }

      public OverrideCharacterMessage.Builder mergeFrom(Message var1) {
         if (var1 instanceof OverrideCharacterMessage) {
            return this.mergeFrom((OverrideCharacterMessage)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public OverrideCharacterMessage.Builder mergeFrom(OverrideCharacterMessage var1) {
         if (var1 == OverrideCharacterMessage.getDefaultInstance()) {
            return this;
         }

         if (var1.characterType_ != 0) {
            this.setCharacterTypeValue(var1.getCharacterTypeValue());
         }

         if (var1.hasPlayerUuid()) {
            this.mergePlayerUuid(var1.getPlayerUuid());
         }

         if (var1.hasColor()) {
            this.mergeColor(var1.getColor());
         }

         if (var1.getEquipped()) {
            this.setEquipped(var1.getEquipped());
         }

         if (!var1.getSuitName().isEmpty()) {
            this.suitName_ = var1.suitName_;
            this.bitField0_ |= 16;
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

      public OverrideCharacterMessage.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getPlayerUuidFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 2;
                     break;
                  case 26:
                     var1.readMessage(this.getColorFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 4;
                     break;
                  case 32:
                     this.equipped_ = var1.readBool();
                     this.bitField0_ |= 8;
                     break;
                  case 42:
                     this.suitName_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 16;
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
      public int getCharacterTypeValue() {
         return this.characterType_;
      }

      public OverrideCharacterMessage.Builder setCharacterTypeValue(int var1) {
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

      public OverrideCharacterMessage.Builder setCharacterType(CharacterType var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 1;
         this.characterType_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public OverrideCharacterMessage.Builder clearCharacterType() {
         this.bitField0_ &= -2;
         this.characterType_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasPlayerUuid() {
         return (this.bitField0_ & 2) != 0;
      }

      @Override
      public Uuid getPlayerUuid() {
         if (this.playerUuidBuilder_ == null) {
            return this.playerUuid_ == null ? Uuid.getDefaultInstance() : this.playerUuid_;
         } else {
            return this.playerUuidBuilder_.getMessage();
         }
      }

      public OverrideCharacterMessage.Builder setPlayerUuid(Uuid var1) {
         if (this.playerUuidBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.playerUuid_ = var1;
         } else {
            this.playerUuidBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public OverrideCharacterMessage.Builder setPlayerUuid(Uuid.Builder var1) {
         if (this.playerUuidBuilder_ == null) {
            this.playerUuid_ = var1.build();
         } else {
            this.playerUuidBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public OverrideCharacterMessage.Builder mergePlayerUuid(Uuid var1) {
         if (this.playerUuidBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0 && this.playerUuid_ != null && this.playerUuid_ != Uuid.getDefaultInstance()) {
               this.getPlayerUuidBuilder().mergeFrom(var1);
            } else {
               this.playerUuid_ = var1;
            }
         } else {
            this.playerUuidBuilder_.mergeFrom(var1);
         }

         if (this.playerUuid_ != null) {
            this.bitField0_ |= 2;
            this.onChanged();
         }

         return this;
      }

      public OverrideCharacterMessage.Builder clearPlayerUuid() {
         this.bitField0_ &= -3;
         this.playerUuid_ = null;
         if (this.playerUuidBuilder_ != null) {
            this.playerUuidBuilder_.dispose();
            this.playerUuidBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Uuid.Builder getPlayerUuidBuilder() {
         this.bitField0_ |= 2;
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
      public boolean hasColor() {
         return (this.bitField0_ & 4) != 0;
      }

      @Override
      public Color getColor() {
         if (this.colorBuilder_ == null) {
            return this.color_ == null ? Color.getDefaultInstance() : this.color_;
         } else {
            return this.colorBuilder_.getMessage();
         }
      }

      public OverrideCharacterMessage.Builder setColor(Color var1) {
         if (this.colorBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.color_ = var1;
         } else {
            this.colorBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public OverrideCharacterMessage.Builder setColor(Color.Builder var1) {
         if (this.colorBuilder_ == null) {
            this.color_ = var1.build();
         } else {
            this.colorBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public OverrideCharacterMessage.Builder mergeColor(Color var1) {
         if (this.colorBuilder_ == null) {
            if ((this.bitField0_ & 4) != 0 && this.color_ != null && this.color_ != Color.getDefaultInstance()) {
               this.getColorBuilder().mergeFrom(var1);
            } else {
               this.color_ = var1;
            }
         } else {
            this.colorBuilder_.mergeFrom(var1);
         }

         if (this.color_ != null) {
            this.bitField0_ |= 4;
            this.onChanged();
         }

         return this;
      }

      public OverrideCharacterMessage.Builder clearColor() {
         this.bitField0_ &= -5;
         this.color_ = null;
         if (this.colorBuilder_ != null) {
            this.colorBuilder_.dispose();
            this.colorBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Color.Builder getColorBuilder() {
         this.bitField0_ |= 4;
         this.onChanged();
         return this.getColorFieldBuilder().getBuilder();
      }

      @Override
      public ColorOrBuilder getColorOrBuilder() {
         if (this.colorBuilder_ != null) {
            return this.colorBuilder_.getMessageOrBuilder();
         } else {
            return this.color_ == null ? Color.getDefaultInstance() : this.color_;
         }
      }

      private SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> getColorFieldBuilder() {
         if (this.colorBuilder_ == null) {
            this.colorBuilder_ = new SingleFieldBuilderV3<>(this.getColor(), this.getParentForChildren(), this.isClean());
            this.color_ = null;
         }

         return this.colorBuilder_;
      }

      @Override
      public boolean getEquipped() {
         return this.equipped_;
      }

      public OverrideCharacterMessage.Builder setEquipped(boolean var1) {
         this.equipped_ = var1;
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public OverrideCharacterMessage.Builder clearEquipped() {
         this.bitField0_ &= -9;
         this.equipped_ = false;
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

      public OverrideCharacterMessage.Builder setSuitName(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.suitName_ = var1;
         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      public OverrideCharacterMessage.Builder clearSuitName() {
         this.suitName_ = OverrideCharacterMessage.getDefaultInstance().getSuitName();
         this.bitField0_ &= -17;
         this.onChanged();
         return this;
      }

      public OverrideCharacterMessage.Builder setSuitNameBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         OverrideCharacterMessage.checkByteStringIsUtf8(var1);
         this.suitName_ = var1;
         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      public final OverrideCharacterMessage.Builder setUnknownFields(UnknownFieldSet var1) {
         return (OverrideCharacterMessage.Builder)super.setUnknownFields(var1);
      }

      public final OverrideCharacterMessage.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (OverrideCharacterMessage.Builder)super.mergeUnknownFields(var1);
      }
   }
}
