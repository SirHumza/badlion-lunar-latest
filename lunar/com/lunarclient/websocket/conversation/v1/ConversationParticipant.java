package com.lunarclient.websocket.conversation.v1;

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
import com.lunarclient.common.v1.Color;
import com.lunarclient.common.v1.ColorOrBuilder;
import com.lunarclient.common.v1.UuidAndUsername;
import com.lunarclient.common.v1.UuidAndUsernameOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class ConversationParticipant extends GeneratedMessageV3 implements ConversationParticipantOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int PLAYER_FIELD_NUMBER = 1;
   private UuidAndUsername player_;
   public static final int LOGO_COLOR_FIELD_NUMBER = 2;
   private Color logoColor_;
   public static final int PLUS_COLOR_FIELD_NUMBER = 3;
   private Color plusColor_;
   public static final int RANK_NAME_FIELD_NUMBER = 4;
   private volatile Object rankName_ = "";
   public static final int IS_RADIO_PREMIUM_FIELD_NUMBER = 5;
   private boolean isRadioPremium_ = false;
   public static final int BADGE_ID_FIELD_NUMBER = 6;
   private int badgeId_ = 0;
   private byte memoizedIsInitialized = -1;
   private static final ConversationParticipant DEFAULT_INSTANCE = new ConversationParticipant();
   private static final Parser<ConversationParticipant> PARSER = new AbstractParser<ConversationParticipant>() {
      public ConversationParticipant parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         ConversationParticipant.Builder var3 = ConversationParticipant.newBuilder();

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

   private ConversationParticipant(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private ConversationParticipant() {
      this.rankName_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new ConversationParticipant();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_conversation_v1_ConversationParticipant_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_conversation_v1_ConversationParticipant_fieldAccessorTable
         .ensureFieldAccessorsInitialized(ConversationParticipant.class, ConversationParticipant.Builder.class);
   }

   @Override
   public boolean hasPlayer() {
      return (this.bitField0_ & 1) != 0;
   }

   @Override
   public UuidAndUsername getPlayer() {
      return this.player_ == null ? UuidAndUsername.getDefaultInstance() : this.player_;
   }

   @Override
   public UuidAndUsernameOrBuilder getPlayerOrBuilder() {
      return this.player_ == null ? UuidAndUsername.getDefaultInstance() : this.player_;
   }

   @Override
   public boolean hasLogoColor() {
      return (this.bitField0_ & 2) != 0;
   }

   @Override
   public Color getLogoColor() {
      return this.logoColor_ == null ? Color.getDefaultInstance() : this.logoColor_;
   }

   @Override
   public ColorOrBuilder getLogoColorOrBuilder() {
      return this.logoColor_ == null ? Color.getDefaultInstance() : this.logoColor_;
   }

   @Override
   public boolean hasPlusColor() {
      return (this.bitField0_ & 4) != 0;
   }

   @Override
   public Color getPlusColor() {
      return this.plusColor_ == null ? Color.getDefaultInstance() : this.plusColor_;
   }

   @Override
   public ColorOrBuilder getPlusColorOrBuilder() {
      return this.plusColor_ == null ? Color.getDefaultInstance() : this.plusColor_;
   }

   @Override
   public String getRankName() {
      Object var1 = this.rankName_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.rankName_ = var3;
      return var3;
   }

   @Override
   public ByteString getRankNameBytes() {
      Object var1 = this.rankName_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.rankName_ = var2;
         return var2;
      } else {
         return (ByteString)var1;
      }
   }

   @Override
   public boolean getIsRadioPremium() {
      return this.isRadioPremium_;
   }

   @Override
   public int getBadgeId() {
      return this.badgeId_;
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
         var1.writeMessage(1, this.getPlayer());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1.writeMessage(2, this.getLogoColor());
      }

      if ((this.bitField0_ & 4) != 0) {
         var1.writeMessage(3, this.getPlusColor());
      }

      if (!GeneratedMessageV3.isStringEmpty(this.rankName_)) {
         GeneratedMessageV3.writeString(var1, 4, this.rankName_);
      }

      if (this.isRadioPremium_) {
         var1.writeBool(5, this.isRadioPremium_);
      }

      if (this.badgeId_ != 0) {
         var1.writeInt32(6, this.badgeId_);
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
         var1 += CodedOutputStream.computeMessageSize(1, this.getPlayer());
      }

      if ((this.bitField0_ & 2) != 0) {
         var1 += CodedOutputStream.computeMessageSize(2, this.getLogoColor());
      }

      if ((this.bitField0_ & 4) != 0) {
         var1 += CodedOutputStream.computeMessageSize(3, this.getPlusColor());
      }

      if (!GeneratedMessageV3.isStringEmpty(this.rankName_)) {
         var1 += GeneratedMessageV3.computeStringSize(4, this.rankName_);
      }

      if (this.isRadioPremium_) {
         var1 += CodedOutputStream.computeBoolSize(5, this.isRadioPremium_);
      }

      if (this.badgeId_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(6, this.badgeId_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof ConversationParticipant)) {
         return super.equals(var1);
      } else {
         ConversationParticipant var2 = (ConversationParticipant)var1;
         if (this.hasPlayer() != var2.hasPlayer()) {
            return false;
         } else if (this.hasPlayer() && !this.getPlayer().equals(var2.getPlayer())) {
            return false;
         } else if (this.hasLogoColor() != var2.hasLogoColor()) {
            return false;
         } else if (this.hasLogoColor() && !this.getLogoColor().equals(var2.getLogoColor())) {
            return false;
         } else if (this.hasPlusColor() != var2.hasPlusColor()) {
            return false;
         } else if (this.hasPlusColor() && !this.getPlusColor().equals(var2.getPlusColor())) {
            return false;
         } else if (!this.getRankName().equals(var2.getRankName())) {
            return false;
         } else if (this.getIsRadioPremium() != var2.getIsRadioPremium()) {
            return false;
         } else {
            return this.getBadgeId() != var2.getBadgeId() ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.hasPlayer()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getPlayer().hashCode();
      }

      if (this.hasLogoColor()) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.getLogoColor().hashCode();
      }

      if (this.hasPlusColor()) {
         var1 = 37 * var1 + 3;
         var1 = 53 * var1 + this.getPlusColor().hashCode();
      }

      var1 = 37 * var1 + 4;
      var1 = 53 * var1 + this.getRankName().hashCode();
      var1 = 37 * var1 + 5;
      var1 = 53 * var1 + Internal.hashBoolean(this.getIsRadioPremium());
      var1 = 37 * var1 + 6;
      var1 = 53 * var1 + this.getBadgeId();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static ConversationParticipant parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static ConversationParticipant parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ConversationParticipant parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static ConversationParticipant parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ConversationParticipant parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static ConversationParticipant parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ConversationParticipant parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ConversationParticipant parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ConversationParticipant parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ConversationParticipant parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ConversationParticipant parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ConversationParticipant parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public ConversationParticipant.Builder newBuilderForType() {
      return newBuilder();
   }

   public static ConversationParticipant.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ConversationParticipant.Builder newBuilder(ConversationParticipant var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public ConversationParticipant.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new ConversationParticipant.Builder() : new ConversationParticipant.Builder().mergeFrom(this);
   }

   protected ConversationParticipant.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new ConversationParticipant.Builder(var1);
   }

   public static ConversationParticipant getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<ConversationParticipant> parser() {
      return PARSER;
   }

   @Override
   public Parser<ConversationParticipant> getParserForType() {
      return PARSER;
   }

   public ConversationParticipant getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<ConversationParticipant.Builder> implements ConversationParticipantOrBuilder {
      private int bitField0_;
      private UuidAndUsername player_;
      private SingleFieldBuilderV3<UuidAndUsername, UuidAndUsername.Builder, UuidAndUsernameOrBuilder> playerBuilder_;
      private Color logoColor_;
      private SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> logoColorBuilder_;
      private Color plusColor_;
      private SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> plusColorBuilder_;
      private Object rankName_ = "";
      private boolean isRadioPremium_;
      private int badgeId_;

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_conversation_v1_ConversationParticipant_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_conversation_v1_ConversationParticipant_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ConversationParticipant.class, ConversationParticipant.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (ConversationParticipant.alwaysUseFieldBuilders) {
            this.getPlayerFieldBuilder();
            this.getLogoColorFieldBuilder();
            this.getPlusColorFieldBuilder();
         }
      }

      public ConversationParticipant.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.player_ = null;
         if (this.playerBuilder_ != null) {
            this.playerBuilder_.dispose();
            this.playerBuilder_ = null;
         }

         this.logoColor_ = null;
         if (this.logoColorBuilder_ != null) {
            this.logoColorBuilder_.dispose();
            this.logoColorBuilder_ = null;
         }

         this.plusColor_ = null;
         if (this.plusColorBuilder_ != null) {
            this.plusColorBuilder_.dispose();
            this.plusColorBuilder_ = null;
         }

         this.rankName_ = "";
         this.isRadioPremium_ = false;
         this.badgeId_ = 0;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_conversation_v1_ConversationParticipant_descriptor;
      }

      public ConversationParticipant getDefaultInstanceForType() {
         return ConversationParticipant.getDefaultInstance();
      }

      public ConversationParticipant build() {
         ConversationParticipant var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public ConversationParticipant buildPartial() {
         ConversationParticipant var1 = new ConversationParticipant(this);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartial0(ConversationParticipant var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.player_ = this.playerBuilder_ == null ? this.player_ : this.playerBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.logoColor_ = this.logoColorBuilder_ == null ? this.logoColor_ : this.logoColorBuilder_.build();
            var3 |= 2;
         }

         if ((var2 & 4) != 0) {
            var1.plusColor_ = this.plusColorBuilder_ == null ? this.plusColor_ : this.plusColorBuilder_.build();
            var3 |= 4;
         }

         if ((var2 & 8) != 0) {
            var1.rankName_ = this.rankName_;
         }

         if ((var2 & 16) != 0) {
            var1.isRadioPremium_ = this.isRadioPremium_;
         }

         if ((var2 & 32) != 0) {
            var1.badgeId_ = this.badgeId_;
         }

         ConversationParticipant var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public ConversationParticipant.Builder clone() {
         return (ConversationParticipant.Builder)super.clone();
      }

      public ConversationParticipant.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ConversationParticipant.Builder)super.setField(var1, var2);
      }

      public ConversationParticipant.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (ConversationParticipant.Builder)super.clearField(var1);
      }

      public ConversationParticipant.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (ConversationParticipant.Builder)super.clearOneof(var1);
      }

      public ConversationParticipant.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (ConversationParticipant.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public ConversationParticipant.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ConversationParticipant.Builder)super.addRepeatedField(var1, var2);
      }

      public ConversationParticipant.Builder mergeFrom(Message var1) {
         if (var1 instanceof ConversationParticipant) {
            return this.mergeFrom((ConversationParticipant)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public ConversationParticipant.Builder mergeFrom(ConversationParticipant var1) {
         if (var1 == ConversationParticipant.getDefaultInstance()) {
            return this;
         }

         if (var1.hasPlayer()) {
            this.mergePlayer(var1.getPlayer());
         }

         if (var1.hasLogoColor()) {
            this.mergeLogoColor(var1.getLogoColor());
         }

         if (var1.hasPlusColor()) {
            this.mergePlusColor(var1.getPlusColor());
         }

         if (!var1.getRankName().isEmpty()) {
            this.rankName_ = var1.rankName_;
            this.bitField0_ |= 8;
            this.onChanged();
         }

         if (var1.getIsRadioPremium()) {
            this.setIsRadioPremium(var1.getIsRadioPremium());
         }

         if (var1.getBadgeId() != 0) {
            this.setBadgeId(var1.getBadgeId());
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public ConversationParticipant.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getPlayerFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 1;
                     break;
                  case 18:
                     var1.readMessage(this.getLogoColorFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 2;
                     break;
                  case 26:
                     var1.readMessage(this.getPlusColorFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 4;
                     break;
                  case 34:
                     this.rankName_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 8;
                     break;
                  case 40:
                     this.isRadioPremium_ = var1.readBool();
                     this.bitField0_ |= 16;
                     break;
                  case 48:
                     this.badgeId_ = var1.readInt32();
                     this.bitField0_ |= 32;
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
      public boolean hasPlayer() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public UuidAndUsername getPlayer() {
         if (this.playerBuilder_ == null) {
            return this.player_ == null ? UuidAndUsername.getDefaultInstance() : this.player_;
         } else {
            return this.playerBuilder_.getMessage();
         }
      }

      public ConversationParticipant.Builder setPlayer(UuidAndUsername var1) {
         if (this.playerBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.player_ = var1;
         } else {
            this.playerBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public ConversationParticipant.Builder setPlayer(UuidAndUsername.Builder var1) {
         if (this.playerBuilder_ == null) {
            this.player_ = var1.build();
         } else {
            this.playerBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public ConversationParticipant.Builder mergePlayer(UuidAndUsername var1) {
         if (this.playerBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.player_ != null && this.player_ != UuidAndUsername.getDefaultInstance()) {
               this.getPlayerBuilder().mergeFrom(var1);
            } else {
               this.player_ = var1;
            }
         } else {
            this.playerBuilder_.mergeFrom(var1);
         }

         if (this.player_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public ConversationParticipant.Builder clearPlayer() {
         this.bitField0_ &= -2;
         this.player_ = null;
         if (this.playerBuilder_ != null) {
            this.playerBuilder_.dispose();
            this.playerBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public UuidAndUsername.Builder getPlayerBuilder() {
         this.bitField0_ |= 1;
         this.onChanged();
         return this.getPlayerFieldBuilder().getBuilder();
      }

      @Override
      public UuidAndUsernameOrBuilder getPlayerOrBuilder() {
         if (this.playerBuilder_ != null) {
            return this.playerBuilder_.getMessageOrBuilder();
         } else {
            return this.player_ == null ? UuidAndUsername.getDefaultInstance() : this.player_;
         }
      }

      private SingleFieldBuilderV3<UuidAndUsername, UuidAndUsername.Builder, UuidAndUsernameOrBuilder> getPlayerFieldBuilder() {
         if (this.playerBuilder_ == null) {
            this.playerBuilder_ = new SingleFieldBuilderV3<>(this.getPlayer(), this.getParentForChildren(), this.isClean());
            this.player_ = null;
         }

         return this.playerBuilder_;
      }

      @Override
      public boolean hasLogoColor() {
         return (this.bitField0_ & 2) != 0;
      }

      @Override
      public Color getLogoColor() {
         if (this.logoColorBuilder_ == null) {
            return this.logoColor_ == null ? Color.getDefaultInstance() : this.logoColor_;
         } else {
            return this.logoColorBuilder_.getMessage();
         }
      }

      public ConversationParticipant.Builder setLogoColor(Color var1) {
         if (this.logoColorBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.logoColor_ = var1;
         } else {
            this.logoColorBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public ConversationParticipant.Builder setLogoColor(Color.Builder var1) {
         if (this.logoColorBuilder_ == null) {
            this.logoColor_ = var1.build();
         } else {
            this.logoColorBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public ConversationParticipant.Builder mergeLogoColor(Color var1) {
         if (this.logoColorBuilder_ == null) {
            if ((this.bitField0_ & 2) != 0 && this.logoColor_ != null && this.logoColor_ != Color.getDefaultInstance()) {
               this.getLogoColorBuilder().mergeFrom(var1);
            } else {
               this.logoColor_ = var1;
            }
         } else {
            this.logoColorBuilder_.mergeFrom(var1);
         }

         if (this.logoColor_ != null) {
            this.bitField0_ |= 2;
            this.onChanged();
         }

         return this;
      }

      public ConversationParticipant.Builder clearLogoColor() {
         this.bitField0_ &= -3;
         this.logoColor_ = null;
         if (this.logoColorBuilder_ != null) {
            this.logoColorBuilder_.dispose();
            this.logoColorBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Color.Builder getLogoColorBuilder() {
         this.bitField0_ |= 2;
         this.onChanged();
         return this.getLogoColorFieldBuilder().getBuilder();
      }

      @Override
      public ColorOrBuilder getLogoColorOrBuilder() {
         if (this.logoColorBuilder_ != null) {
            return this.logoColorBuilder_.getMessageOrBuilder();
         } else {
            return this.logoColor_ == null ? Color.getDefaultInstance() : this.logoColor_;
         }
      }

      private SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> getLogoColorFieldBuilder() {
         if (this.logoColorBuilder_ == null) {
            this.logoColorBuilder_ = new SingleFieldBuilderV3<>(this.getLogoColor(), this.getParentForChildren(), this.isClean());
            this.logoColor_ = null;
         }

         return this.logoColorBuilder_;
      }

      @Override
      public boolean hasPlusColor() {
         return (this.bitField0_ & 4) != 0;
      }

      @Override
      public Color getPlusColor() {
         if (this.plusColorBuilder_ == null) {
            return this.plusColor_ == null ? Color.getDefaultInstance() : this.plusColor_;
         } else {
            return this.plusColorBuilder_.getMessage();
         }
      }

      public ConversationParticipant.Builder setPlusColor(Color var1) {
         if (this.plusColorBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.plusColor_ = var1;
         } else {
            this.plusColorBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public ConversationParticipant.Builder setPlusColor(Color.Builder var1) {
         if (this.plusColorBuilder_ == null) {
            this.plusColor_ = var1.build();
         } else {
            this.plusColorBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public ConversationParticipant.Builder mergePlusColor(Color var1) {
         if (this.plusColorBuilder_ == null) {
            if ((this.bitField0_ & 4) != 0 && this.plusColor_ != null && this.plusColor_ != Color.getDefaultInstance()) {
               this.getPlusColorBuilder().mergeFrom(var1);
            } else {
               this.plusColor_ = var1;
            }
         } else {
            this.plusColorBuilder_.mergeFrom(var1);
         }

         if (this.plusColor_ != null) {
            this.bitField0_ |= 4;
            this.onChanged();
         }

         return this;
      }

      public ConversationParticipant.Builder clearPlusColor() {
         this.bitField0_ &= -5;
         this.plusColor_ = null;
         if (this.plusColorBuilder_ != null) {
            this.plusColorBuilder_.dispose();
            this.plusColorBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Color.Builder getPlusColorBuilder() {
         this.bitField0_ |= 4;
         this.onChanged();
         return this.getPlusColorFieldBuilder().getBuilder();
      }

      @Override
      public ColorOrBuilder getPlusColorOrBuilder() {
         if (this.plusColorBuilder_ != null) {
            return this.plusColorBuilder_.getMessageOrBuilder();
         } else {
            return this.plusColor_ == null ? Color.getDefaultInstance() : this.plusColor_;
         }
      }

      private SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> getPlusColorFieldBuilder() {
         if (this.plusColorBuilder_ == null) {
            this.plusColorBuilder_ = new SingleFieldBuilderV3<>(this.getPlusColor(), this.getParentForChildren(), this.isClean());
            this.plusColor_ = null;
         }

         return this.plusColorBuilder_;
      }

      @Override
      public String getRankName() {
         Object var1 = this.rankName_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.rankName_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getRankNameBytes() {
         Object var1 = this.rankName_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.rankName_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public ConversationParticipant.Builder setRankName(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.rankName_ = var1;
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public ConversationParticipant.Builder clearRankName() {
         this.rankName_ = ConversationParticipant.getDefaultInstance().getRankName();
         this.bitField0_ &= -9;
         this.onChanged();
         return this;
      }

      public ConversationParticipant.Builder setRankNameBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         ConversationParticipant.checkByteStringIsUtf8(var1);
         this.rankName_ = var1;
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      @Override
      public boolean getIsRadioPremium() {
         return this.isRadioPremium_;
      }

      public ConversationParticipant.Builder setIsRadioPremium(boolean var1) {
         this.isRadioPremium_ = var1;
         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      public ConversationParticipant.Builder clearIsRadioPremium() {
         this.bitField0_ &= -17;
         this.isRadioPremium_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public int getBadgeId() {
         return this.badgeId_;
      }

      public ConversationParticipant.Builder setBadgeId(int var1) {
         this.badgeId_ = var1;
         this.bitField0_ |= 32;
         this.onChanged();
         return this;
      }

      public ConversationParticipant.Builder clearBadgeId() {
         this.bitField0_ &= -33;
         this.badgeId_ = 0;
         this.onChanged();
         return this;
      }

      public final ConversationParticipant.Builder setUnknownFields(UnknownFieldSet var1) {
         return (ConversationParticipant.Builder)super.setUnknownFields(var1);
      }

      public final ConversationParticipant.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (ConversationParticipant.Builder)super.mergeUnknownFields(var1);
      }
   }
}
