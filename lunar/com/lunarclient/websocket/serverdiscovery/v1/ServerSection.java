package com.lunarclient.websocket.serverdiscovery.v1;

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
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ServerSection extends GeneratedMessageV3 implements ServerSectionOrBuilder {
   private static final long serialVersionUID = 0L;
   public static final int ID_FIELD_NUMBER = 1;
   private volatile Object id_ = "";
   public static final int NAME_FIELD_NUMBER = 2;
   private volatile Object name_ = "";
   public static final int EMOJI_FIELD_NUMBER = 3;
   private volatile Object emoji_ = "";
   public static final int SHOW_NOT_INTERESTED_FIELD_NUMBER = 4;
   private boolean showNotInterested_ = false;
   public static final int CARD_SIZE_FIELD_NUMBER = 5;
   private int cardSize_ = 0;
   public static final int CARDS_FIELD_NUMBER = 6;
   private List<ServerCard> cards_;
   public static final int DESCRIPTION_FIELD_NUMBER = 7;
   private volatile Object description_ = "";
   private byte memoizedIsInitialized = -1;
   private static final ServerSection DEFAULT_INSTANCE = new ServerSection();
   private static final Parser<ServerSection> PARSER = new AbstractParser<ServerSection>() {
      public ServerSection parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         ServerSection.Builder var3 = ServerSection.newBuilder();

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

   private ServerSection(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private ServerSection() {
      this.id_ = "";
      this.name_ = "";
      this.emoji_ = "";
      this.cardSize_ = 0;
      this.cards_ = Collections.emptyList();
      this.description_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new ServerSection();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_serverdiscovery_v1_ServerSection_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_serverdiscovery_v1_ServerSection_fieldAccessorTable
         .ensureFieldAccessorsInitialized(ServerSection.class, ServerSection.Builder.class);
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
   public String getEmoji() {
      Object var1 = this.emoji_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.emoji_ = var3;
      return var3;
   }

   @Override
   public ByteString getEmojiBytes() {
      Object var1 = this.emoji_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.emoji_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public boolean getShowNotInterested() {
      return this.showNotInterested_;
   }

   @Override
   public int getCardSizeValue() {
      return this.cardSize_;
   }

   @Override
   public ServerSection.CardSize getCardSize() {
      ServerSection.CardSize var1 = ServerSection.CardSize.forNumber(this.cardSize_);
      return var1 == null ? ServerSection.CardSize.UNRECOGNIZED : var1;
   }

   @Override
   public List<ServerCard> getCardsList() {
      return this.cards_;
   }

   @Override
   public List<? extends ServerCardOrBuilder> getCardsOrBuilderList() {
      return this.cards_;
   }

   @Override
   public int getCardsCount() {
      return this.cards_.size();
   }

   @Override
   public ServerCard getCards(int var1) {
      return this.cards_.get(var1);
   }

   @Override
   public ServerCardOrBuilder getCardsOrBuilder(int var1) {
      return this.cards_.get(var1);
   }

   @Override
   public String getDescription() {
      Object var1 = this.description_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.description_ = var3;
      return var3;
   }

   @Override
   public ByteString getDescriptionBytes() {
      Object var1 = this.description_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.description_ = var2;
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

      if (!GeneratedMessageV3.isStringEmpty(this.name_)) {
         GeneratedMessageV3.writeString(var1, 2, this.name_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.emoji_)) {
         GeneratedMessageV3.writeString(var1, 3, this.emoji_);
      }

      if (this.showNotInterested_) {
         var1.writeBool(4, this.showNotInterested_);
      }

      if (this.cardSize_ != ServerSection.CardSize.CARD_SIZE_UNSPECIFIED.getNumber()) {
         var1.writeEnum(5, this.cardSize_);
      }

      for (int var2 = 0; var2 < this.cards_.size(); var2++) {
         var1.writeMessage(6, this.cards_.get(var2));
      }

      if (!GeneratedMessageV3.isStringEmpty(this.description_)) {
         GeneratedMessageV3.writeString(var1, 7, this.description_);
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

      if (!GeneratedMessageV3.isStringEmpty(this.emoji_)) {
         var1 += GeneratedMessageV3.computeStringSize(3, this.emoji_);
      }

      if (this.showNotInterested_) {
         var1 += CodedOutputStream.computeBoolSize(4, this.showNotInterested_);
      }

      if (this.cardSize_ != ServerSection.CardSize.CARD_SIZE_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(5, this.cardSize_);
      }

      for (int var2 = 0; var2 < this.cards_.size(); var2++) {
         var1 += CodedOutputStream.computeMessageSize(6, this.cards_.get(var2));
      }

      if (!GeneratedMessageV3.isStringEmpty(this.description_)) {
         var1 += GeneratedMessageV3.computeStringSize(7, this.description_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof ServerSection)) {
         return super.equals(var1);
      } else {
         ServerSection var2 = (ServerSection)var1;
         if (!this.getId().equals(var2.getId())) {
            return false;
         } else if (!this.getName().equals(var2.getName())) {
            return false;
         } else if (!this.getEmoji().equals(var2.getEmoji())) {
            return false;
         } else if (this.getShowNotInterested() != var2.getShowNotInterested()) {
            return false;
         } else if (this.cardSize_ != var2.cardSize_) {
            return false;
         } else if (!this.getCardsList().equals(var2.getCardsList())) {
            return false;
         } else {
            return !this.getDescription().equals(var2.getDescription()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      var1 = 53 * var1 + this.getEmoji().hashCode();
      var1 = 37 * var1 + 4;
      var1 = 53 * var1 + Internal.hashBoolean(this.getShowNotInterested());
      var1 = 37 * var1 + 5;
      var1 = 53 * var1 + this.cardSize_;
      if (this.getCardsCount() > 0) {
         var1 = 37 * var1 + 6;
         var1 = 53 * var1 + this.getCardsList().hashCode();
      }

      var1 = 37 * var1 + 7;
      var1 = 53 * var1 + this.getDescription().hashCode();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static ServerSection parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static ServerSection parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ServerSection parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static ServerSection parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ServerSection parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static ServerSection parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ServerSection parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ServerSection parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ServerSection parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ServerSection parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ServerSection parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ServerSection parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public ServerSection.Builder newBuilderForType() {
      return newBuilder();
   }

   public static ServerSection.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ServerSection.Builder newBuilder(ServerSection var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public ServerSection.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new ServerSection.Builder() : new ServerSection.Builder().mergeFrom(this);
   }

   protected ServerSection.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new ServerSection.Builder(var1);
   }

   public static ServerSection getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<ServerSection> parser() {
      return PARSER;
   }

   @Override
   public Parser<ServerSection> getParserForType() {
      return PARSER;
   }

   public ServerSection getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<ServerSection.Builder> implements ServerSectionOrBuilder {
      private int bitField0_;
      private Object id_ = "";
      private Object name_ = "";
      private Object emoji_ = "";
      private boolean showNotInterested_;
      private int cardSize_ = 0;
      private List<ServerCard> cards_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<ServerCard, ServerCard.Builder, ServerCardOrBuilder> cardsBuilder_;
      private Object description_ = "";

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_serverdiscovery_v1_ServerSection_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_serverdiscovery_v1_ServerSection_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ServerSection.class, ServerSection.Builder.class);
      }

      private Builder() {
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
      }

      public ServerSection.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.id_ = "";
         this.name_ = "";
         this.emoji_ = "";
         this.showNotInterested_ = false;
         this.cardSize_ = 0;
         if (this.cardsBuilder_ == null) {
            this.cards_ = Collections.emptyList();
         } else {
            this.cards_ = null;
            this.cardsBuilder_.clear();
         }

         this.bitField0_ &= -33;
         this.description_ = "";
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_serverdiscovery_v1_ServerSection_descriptor;
      }

      public ServerSection getDefaultInstanceForType() {
         return ServerSection.getDefaultInstance();
      }

      public ServerSection build() {
         ServerSection var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public ServerSection buildPartial() {
         ServerSection var1 = new ServerSection(this);
         this.buildPartialRepeatedFields(var1);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartialRepeatedFields(ServerSection var1) {
         if (this.cardsBuilder_ == null) {
            if ((this.bitField0_ & 32) != 0) {
               this.cards_ = Collections.unmodifiableList(this.cards_);
               this.bitField0_ &= -33;
            }

            var1.cards_ = this.cards_;
         } else {
            var1.cards_ = this.cardsBuilder_.build();
         }
      }

      private void buildPartial0(ServerSection var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            var1.id_ = this.id_;
         }

         if ((var2 & 2) != 0) {
            var1.name_ = this.name_;
         }

         if ((var2 & 4) != 0) {
            var1.emoji_ = this.emoji_;
         }

         if ((var2 & 8) != 0) {
            var1.showNotInterested_ = this.showNotInterested_;
         }

         if ((var2 & 16) != 0) {
            var1.cardSize_ = this.cardSize_;
         }

         if ((var2 & 64) != 0) {
            var1.description_ = this.description_;
         }
      }

      public ServerSection.Builder clone() {
         return (ServerSection.Builder)super.clone();
      }

      public ServerSection.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ServerSection.Builder)super.setField(var1, var2);
      }

      public ServerSection.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (ServerSection.Builder)super.clearField(var1);
      }

      public ServerSection.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (ServerSection.Builder)super.clearOneof(var1);
      }

      public ServerSection.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (ServerSection.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public ServerSection.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ServerSection.Builder)super.addRepeatedField(var1, var2);
      }

      public ServerSection.Builder mergeFrom(Message var1) {
         if (var1 instanceof ServerSection) {
            return this.mergeFrom((ServerSection)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public ServerSection.Builder mergeFrom(ServerSection var1) {
         if (var1 == ServerSection.getDefaultInstance()) {
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

         if (!var1.getEmoji().isEmpty()) {
            this.emoji_ = var1.emoji_;
            this.bitField0_ |= 4;
            this.onChanged();
         }

         if (var1.getShowNotInterested()) {
            this.setShowNotInterested(var1.getShowNotInterested());
         }

         if (var1.cardSize_ != 0) {
            this.setCardSizeValue(var1.getCardSizeValue());
         }

         if (this.cardsBuilder_ == null) {
            if (!var1.cards_.isEmpty()) {
               if (this.cards_.isEmpty()) {
                  this.cards_ = var1.cards_;
                  this.bitField0_ &= -33;
               } else {
                  this.ensureCardsIsMutable();
                  this.cards_.addAll(var1.cards_);
               }

               this.onChanged();
            }
         } else if (!var1.cards_.isEmpty()) {
            if (this.cardsBuilder_.isEmpty()) {
               this.cardsBuilder_.dispose();
               this.cardsBuilder_ = null;
               this.cards_ = var1.cards_;
               this.bitField0_ &= -33;
               this.cardsBuilder_ = ServerSection.alwaysUseFieldBuilders ? this.getCardsFieldBuilder() : null;
            } else {
               this.cardsBuilder_.addAllMessages(var1.cards_);
            }
         }

         if (!var1.getDescription().isEmpty()) {
            this.description_ = var1.description_;
            this.bitField0_ |= 64;
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

      public ServerSection.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     this.emoji_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 4;
                     break;
                  case 32:
                     this.showNotInterested_ = var1.readBool();
                     this.bitField0_ |= 8;
                     break;
                  case 40:
                     this.cardSize_ = var1.readEnum();
                     this.bitField0_ |= 16;
                     break;
                  case 50:
                     ServerCard var5 = var1.readMessage(ServerCard.parser(), var2);
                     if (this.cardsBuilder_ == null) {
                        this.ensureCardsIsMutable();
                        this.cards_.add(var5);
                     } else {
                        this.cardsBuilder_.addMessage(var5);
                     }
                     break;
                  case 58:
                     this.description_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 64;
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

      public ServerSection.Builder setId(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.id_ = var1;
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public ServerSection.Builder clearId() {
         this.id_ = ServerSection.getDefaultInstance().getId();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      public ServerSection.Builder setIdBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         ServerSection.checkByteStringIsUtf8(var1);
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

      public ServerSection.Builder setName(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.name_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public ServerSection.Builder clearName() {
         this.name_ = ServerSection.getDefaultInstance().getName();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      public ServerSection.Builder setNameBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         ServerSection.checkByteStringIsUtf8(var1);
         this.name_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      @Override
      public String getEmoji() {
         Object var1 = this.emoji_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.emoji_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getEmojiBytes() {
         Object var1 = this.emoji_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.emoji_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public ServerSection.Builder setEmoji(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.emoji_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public ServerSection.Builder clearEmoji() {
         this.emoji_ = ServerSection.getDefaultInstance().getEmoji();
         this.bitField0_ &= -5;
         this.onChanged();
         return this;
      }

      public ServerSection.Builder setEmojiBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         ServerSection.checkByteStringIsUtf8(var1);
         this.emoji_ = var1;
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      @Override
      public boolean getShowNotInterested() {
         return this.showNotInterested_;
      }

      public ServerSection.Builder setShowNotInterested(boolean var1) {
         this.showNotInterested_ = var1;
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public ServerSection.Builder clearShowNotInterested() {
         this.bitField0_ &= -9;
         this.showNotInterested_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public int getCardSizeValue() {
         return this.cardSize_;
      }

      public ServerSection.Builder setCardSizeValue(int var1) {
         this.cardSize_ = var1;
         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      @Override
      public ServerSection.CardSize getCardSize() {
         ServerSection.CardSize var1 = ServerSection.CardSize.forNumber(this.cardSize_);
         return var1 == null ? ServerSection.CardSize.UNRECOGNIZED : var1;
      }

      public ServerSection.Builder setCardSize(ServerSection.CardSize var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 16;
         this.cardSize_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public ServerSection.Builder clearCardSize() {
         this.bitField0_ &= -17;
         this.cardSize_ = 0;
         this.onChanged();
         return this;
      }

      private void ensureCardsIsMutable() {
         if ((this.bitField0_ & 32) == 0) {
            this.cards_ = new ArrayList<>(this.cards_);
            this.bitField0_ |= 32;
         }
      }

      @Override
      public List<ServerCard> getCardsList() {
         return this.cardsBuilder_ == null ? Collections.unmodifiableList(this.cards_) : this.cardsBuilder_.getMessageList();
      }

      @Override
      public int getCardsCount() {
         return this.cardsBuilder_ == null ? this.cards_.size() : this.cardsBuilder_.getCount();
      }

      @Override
      public ServerCard getCards(int var1) {
         return this.cardsBuilder_ == null ? this.cards_.get(var1) : this.cardsBuilder_.getMessage(var1);
      }

      public ServerSection.Builder setCards(int var1, ServerCard var2) {
         if (this.cardsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureCardsIsMutable();
            this.cards_.set(var1, var2);
            this.onChanged();
         } else {
            this.cardsBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public ServerSection.Builder setCards(int var1, ServerCard.Builder var2) {
         if (this.cardsBuilder_ == null) {
            this.ensureCardsIsMutable();
            this.cards_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.cardsBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public ServerSection.Builder addCards(ServerCard var1) {
         if (this.cardsBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureCardsIsMutable();
            this.cards_.add(var1);
            this.onChanged();
         } else {
            this.cardsBuilder_.addMessage(var1);
         }

         return this;
      }

      public ServerSection.Builder addCards(int var1, ServerCard var2) {
         if (this.cardsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureCardsIsMutable();
            this.cards_.add(var1, var2);
            this.onChanged();
         } else {
            this.cardsBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public ServerSection.Builder addCards(ServerCard.Builder var1) {
         if (this.cardsBuilder_ == null) {
            this.ensureCardsIsMutable();
            this.cards_.add(var1.build());
            this.onChanged();
         } else {
            this.cardsBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public ServerSection.Builder addCards(int var1, ServerCard.Builder var2) {
         if (this.cardsBuilder_ == null) {
            this.ensureCardsIsMutable();
            this.cards_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.cardsBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public ServerSection.Builder addAllCards(Iterable<? extends ServerCard> var1) {
         if (this.cardsBuilder_ == null) {
            this.ensureCardsIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.cards_);
            this.onChanged();
         } else {
            this.cardsBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public ServerSection.Builder clearCards() {
         if (this.cardsBuilder_ == null) {
            this.cards_ = Collections.emptyList();
            this.bitField0_ &= -33;
            this.onChanged();
         } else {
            this.cardsBuilder_.clear();
         }

         return this;
      }

      public ServerSection.Builder removeCards(int var1) {
         if (this.cardsBuilder_ == null) {
            this.ensureCardsIsMutable();
            this.cards_.remove(var1);
            this.onChanged();
         } else {
            this.cardsBuilder_.remove(var1);
         }

         return this;
      }

      public ServerCard.Builder getCardsBuilder(int var1) {
         return this.getCardsFieldBuilder().getBuilder(var1);
      }

      @Override
      public ServerCardOrBuilder getCardsOrBuilder(int var1) {
         return this.cardsBuilder_ == null ? this.cards_.get(var1) : this.cardsBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends ServerCardOrBuilder> getCardsOrBuilderList() {
         return this.cardsBuilder_ != null ? this.cardsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.cards_);
      }

      public ServerCard.Builder addCardsBuilder() {
         return this.getCardsFieldBuilder().addBuilder(ServerCard.getDefaultInstance());
      }

      public ServerCard.Builder addCardsBuilder(int var1) {
         return this.getCardsFieldBuilder().addBuilder(var1, ServerCard.getDefaultInstance());
      }

      public List<ServerCard.Builder> getCardsBuilderList() {
         return this.getCardsFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<ServerCard, ServerCard.Builder, ServerCardOrBuilder> getCardsFieldBuilder() {
         if (this.cardsBuilder_ == null) {
            this.cardsBuilder_ = new RepeatedFieldBuilderV3<>(this.cards_, (this.bitField0_ & 32) != 0, this.getParentForChildren(), this.isClean());
            this.cards_ = null;
         }

         return this.cardsBuilder_;
      }

      @Override
      public String getDescription() {
         Object var1 = this.description_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.description_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getDescriptionBytes() {
         Object var1 = this.description_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.description_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public ServerSection.Builder setDescription(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.description_ = var1;
         this.bitField0_ |= 64;
         this.onChanged();
         return this;
      }

      public ServerSection.Builder clearDescription() {
         this.description_ = ServerSection.getDefaultInstance().getDescription();
         this.bitField0_ &= -65;
         this.onChanged();
         return this;
      }

      public ServerSection.Builder setDescriptionBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         ServerSection.checkByteStringIsUtf8(var1);
         this.description_ = var1;
         this.bitField0_ |= 64;
         this.onChanged();
         return this;
      }

      public final ServerSection.Builder setUnknownFields(UnknownFieldSet var1) {
         return (ServerSection.Builder)super.setUnknownFields(var1);
      }

      public final ServerSection.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (ServerSection.Builder)super.mergeUnknownFields(var1);
      }
   }

   public enum CardSize implements ProtocolMessageEnum {
      CARD_SIZE_UNSPECIFIED(0),
      CARD_SIZE_SMALL(1),
      CARD_SIZE_MEDIUM(2),
      CARD_SIZE_LARGE(3),
      UNRECOGNIZED(-1);

      public static final int CARD_SIZE_UNSPECIFIED_VALUE = 0;
      public static final int CARD_SIZE_SMALL_VALUE = 1;
      public static final int CARD_SIZE_MEDIUM_VALUE = 2;
      public static final int CARD_SIZE_LARGE_VALUE = 3;
      private static final Internal.EnumLiteMap<ServerSection.CardSize> internalValueMap = new Internal.EnumLiteMap<ServerSection.CardSize>() {
         public ServerSection.CardSize findValueByNumber(int var1) {
            return ServerSection.CardSize.forNumber(var1);
         }
      };
      private static final ServerSection.CardSize[] VALUES = values();
      private final int value;

      @Override
      public final int getNumber() {
         if (this == UNRECOGNIZED) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
         } else {
            return this.value;
         }
      }

      @Deprecated
      public static ServerSection.CardSize valueOf(int var0) {
         return forNumber(var0);
      }

      public static ServerSection.CardSize forNumber(int var0) {
         switch (var0) {
            case 0:
               return CARD_SIZE_UNSPECIFIED;
            case 1:
               return CARD_SIZE_SMALL;
            case 2:
               return CARD_SIZE_MEDIUM;
            case 3:
               return CARD_SIZE_LARGE;
            default:
               return null;
         }
      }

      public static Internal.EnumLiteMap<ServerSection.CardSize> internalGetValueMap() {
         return internalValueMap;
      }

      @Override
      public final Descriptors.EnumValueDescriptor getValueDescriptor() {
         if (this == UNRECOGNIZED) {
            throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
         } else {
            return getDescriptor().getValues().get(this.ordinal());
         }
      }

      @Override
      public final Descriptors.EnumDescriptor getDescriptorForType() {
         return getDescriptor();
      }

      public static final Descriptors.EnumDescriptor getDescriptor() {
         return ServerSection.getDescriptor().getEnumTypes().get(0);
      }

      public static ServerSection.CardSize valueOf(Descriptors.EnumValueDescriptor var0) {
         if (var0.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
         } else {
            return var0.getIndex() == -1 ? UNRECOGNIZED : VALUES[var0.getIndex()];
         }
      }

      CardSize(int var3) {
         this.value = var3;
      }
   }
}
