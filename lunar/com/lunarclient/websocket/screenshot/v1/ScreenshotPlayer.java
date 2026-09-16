package com.lunarclient.websocket.screenshot.v1;

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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import com.lunarclient.common.v1.MinecraftSkin;
import com.lunarclient.common.v1.MinecraftSkinOrBuilder;
import com.lunarclient.common.v1.UuidAndUsername;
import com.lunarclient.common.v1.UuidAndUsernameOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ScreenshotPlayer extends GeneratedMessageV3 implements ScreenshotPlayerOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int PLAYER_FIELD_NUMBER = 1;
   private UuidAndUsername player_;
   public static final int STATES_FIELD_NUMBER = 2;
   private List<Integer> states_;
   private static final Internal.ListAdapter.Converter<Integer, PlayerState> states_converter_ = new Internal.ListAdapter.Converter<Integer, PlayerState>() {
      public PlayerState convert(Integer var1) {
         PlayerState var2 = PlayerState.forNumber(var1);
         return var2 == null ? PlayerState.UNRECOGNIZED : var2;
      }
   };
   private int statesMemoizedSerializedSize;
   public static final int COSMETICS_FIELD_NUMBER = 3;
   private Internal.IntList cosmetics_ = emptyIntList();
   private int cosmeticsMemoizedSerializedSize = -1;
   public static final int EMOTE_FIELD_NUMBER = 4;
   private int emote_ = 0;
   public static final int EMOTE_JAM_FIELD_NUMBER = 5;
   private int emoteJam_ = 0;
   public static final int SKIN_FIELD_NUMBER = 6;
   private MinecraftSkin skin_;
   public static final int CAPE_FIELD_NUMBER = 7;
   private volatile Object cape_ = "";
   private byte memoizedIsInitialized = -1;
   private static final ScreenshotPlayer DEFAULT_INSTANCE = new ScreenshotPlayer();
   private static final Parser<ScreenshotPlayer> PARSER = new AbstractParser<ScreenshotPlayer>() {
      public ScreenshotPlayer parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         ScreenshotPlayer.Builder var3 = ScreenshotPlayer.newBuilder();

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

   private ScreenshotPlayer(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private ScreenshotPlayer() {
      this.states_ = Collections.emptyList();
      this.cosmetics_ = emptyIntList();
      this.cape_ = "";
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new ScreenshotPlayer();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_screenshot_v1_ScreenshotPlayer_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_screenshot_v1_ScreenshotPlayer_fieldAccessorTable
         .ensureFieldAccessorsInitialized(ScreenshotPlayer.class, ScreenshotPlayer.Builder.class);
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
   public List<PlayerState> getStatesList() {
      return new Internal.ListAdapter<>(this.states_, states_converter_);
   }

   @Override
   public int getStatesCount() {
      return this.states_.size();
   }

   @Override
   public PlayerState getStates(int var1) {
      return states_converter_.convert(this.states_.get(var1));
   }

   @Override
   public List<Integer> getStatesValueList() {
      return this.states_;
   }

   @Override
   public int getStatesValue(int var1) {
      return this.states_.get(var1);
   }

   @Override
   public List<Integer> getCosmeticsList() {
      return this.cosmetics_;
   }

   @Override
   public int getCosmeticsCount() {
      return this.cosmetics_.size();
   }

   @Override
   public int getCosmetics(int var1) {
      return this.cosmetics_.getInt(var1);
   }

   @Override
   public int getEmote() {
      return this.emote_;
   }

   @Override
   public int getEmoteJam() {
      return this.emoteJam_;
   }

   @Override
   public boolean hasSkin() {
      return (this.bitField0_ & 2) != 0;
   }

   @Override
   public MinecraftSkin getSkin() {
      return this.skin_ == null ? MinecraftSkin.getDefaultInstance() : this.skin_;
   }

   @Override
   public MinecraftSkinOrBuilder getSkinOrBuilder() {
      return this.skin_ == null ? MinecraftSkin.getDefaultInstance() : this.skin_;
   }

   @Override
   public String getCape() {
      Object var1 = this.cape_;
      if (var1 instanceof String) {
         return (String)var1;
      }

      ByteString var2 = (ByteString)var1;
      String var3 = var2.toStringUtf8();
      this.cape_ = var3;
      return var3;
   }

   @Override
   public ByteString getCapeBytes() {
      Object var1 = this.cape_;
      if (var1 instanceof String) {
         ByteString var2 = ByteString.copyFromUtf8((String)var1);
         this.cape_ = var2;
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
      this.getSerializedSize();
      if ((this.bitField0_ & 1) != 0) {
         var1.writeMessage(1, this.getPlayer());
      }

      if (this.getStatesList().size() > 0) {
         var1.writeUInt32NoTag(18);
         var1.writeUInt32NoTag(this.statesMemoizedSerializedSize);
      }

      for (int var2 = 0; var2 < this.states_.size(); var2++) {
         var1.writeEnumNoTag(this.states_.get(var2));
      }

      if (this.getCosmeticsList().size() > 0) {
         var1.writeUInt32NoTag(26);
         var1.writeUInt32NoTag(this.cosmeticsMemoizedSerializedSize);
      }

      for (int var3 = 0; var3 < this.cosmetics_.size(); var3++) {
         var1.writeInt32NoTag(this.cosmetics_.getInt(var3));
      }

      if (this.emote_ != 0) {
         var1.writeInt32(4, this.emote_);
      }

      if (this.emoteJam_ != 0) {
         var1.writeInt32(5, this.emoteJam_);
      }

      if ((this.bitField0_ & 2) != 0) {
         var1.writeMessage(6, this.getSkin());
      }

      if (!GeneratedMessageV3.isStringEmpty(this.cape_)) {
         GeneratedMessageV3.writeString(var1, 7, this.cape_);
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

      int var2 = 0;

      for (int var3 = 0; var3 < this.states_.size(); var3++) {
         var2 += CodedOutputStream.computeEnumSizeNoTag(this.states_.get(var3));
      }

      var1 += var2;
      if (!this.getStatesList().isEmpty()) {
         var1 = ++var1 + CodedOutputStream.computeUInt32SizeNoTag(var2);
      }

      this.statesMemoizedSerializedSize = var2;
      var2 = 0;

      for (int var11 = 0; var11 < this.cosmetics_.size(); var11++) {
         var2 += CodedOutputStream.computeInt32SizeNoTag(this.cosmetics_.getInt(var11));
      }

      var1 += var2;
      if (!this.getCosmeticsList().isEmpty()) {
         var1 = ++var1 + CodedOutputStream.computeInt32SizeNoTag(var2);
      }

      this.cosmeticsMemoizedSerializedSize = var2;
      if (this.emote_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(4, this.emote_);
      }

      if (this.emoteJam_ != 0) {
         var1 += CodedOutputStream.computeInt32Size(5, this.emoteJam_);
      }

      if ((this.bitField0_ & 2) != 0) {
         var1 += CodedOutputStream.computeMessageSize(6, this.getSkin());
      }

      if (!GeneratedMessageV3.isStringEmpty(this.cape_)) {
         var1 += GeneratedMessageV3.computeStringSize(7, this.cape_);
      }

      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof ScreenshotPlayer)) {
         return super.equals(var1);
      } else {
         ScreenshotPlayer var2 = (ScreenshotPlayer)var1;
         if (this.hasPlayer() != var2.hasPlayer()) {
            return false;
         } else if (this.hasPlayer() && !this.getPlayer().equals(var2.getPlayer())) {
            return false;
         } else if (!this.states_.equals(var2.states_)) {
            return false;
         } else if (!this.getCosmeticsList().equals(var2.getCosmeticsList())) {
            return false;
         } else if (this.getEmote() != var2.getEmote()) {
            return false;
         } else if (this.getEmoteJam() != var2.getEmoteJam()) {
            return false;
         } else if (this.hasSkin() != var2.hasSkin()) {
            return false;
         } else if (this.hasSkin() && !this.getSkin().equals(var2.getSkin())) {
            return false;
         } else {
            return !this.getCape().equals(var2.getCape()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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

      if (this.getStatesCount() > 0) {
         var1 = 37 * var1 + 2;
         var1 = 53 * var1 + this.states_.hashCode();
      }

      if (this.getCosmeticsCount() > 0) {
         var1 = 37 * var1 + 3;
         var1 = 53 * var1 + this.getCosmeticsList().hashCode();
      }

      var1 = 37 * var1 + 4;
      var1 = 53 * var1 + this.getEmote();
      var1 = 37 * var1 + 5;
      var1 = 53 * var1 + this.getEmoteJam();
      if (this.hasSkin()) {
         var1 = 37 * var1 + 6;
         var1 = 53 * var1 + this.getSkin().hashCode();
      }

      var1 = 37 * var1 + 7;
      var1 = 53 * var1 + this.getCape().hashCode();
      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static ScreenshotPlayer parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static ScreenshotPlayer parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ScreenshotPlayer parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static ScreenshotPlayer parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ScreenshotPlayer parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static ScreenshotPlayer parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static ScreenshotPlayer parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ScreenshotPlayer parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static ScreenshotPlayer parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static ScreenshotPlayer parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static ScreenshotPlayer parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static ScreenshotPlayer parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public ScreenshotPlayer.Builder newBuilderForType() {
      return newBuilder();
   }

   public static ScreenshotPlayer.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static ScreenshotPlayer.Builder newBuilder(ScreenshotPlayer var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public ScreenshotPlayer.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new ScreenshotPlayer.Builder() : new ScreenshotPlayer.Builder().mergeFrom(this);
   }

   protected ScreenshotPlayer.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new ScreenshotPlayer.Builder(var1);
   }

   public static ScreenshotPlayer getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<ScreenshotPlayer> parser() {
      return PARSER;
   }

   @Override
   public Parser<ScreenshotPlayer> getParserForType() {
      return PARSER;
   }

   public ScreenshotPlayer getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<ScreenshotPlayer.Builder> implements ScreenshotPlayerOrBuilder {
      private int bitField0_;
      private UuidAndUsername player_;
      private SingleFieldBuilderV3<UuidAndUsername, UuidAndUsername.Builder, UuidAndUsernameOrBuilder> playerBuilder_;
      private List<Integer> states_ = Collections.emptyList();
      private Internal.IntList cosmetics_ = ScreenshotPlayer.emptyIntList();
      private int emote_;
      private int emoteJam_;
      private MinecraftSkin skin_;
      private SingleFieldBuilderV3<MinecraftSkin, MinecraftSkin.Builder, MinecraftSkinOrBuilder> skinBuilder_;
      private Object cape_ = "";

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_screenshot_v1_ScreenshotPlayer_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_screenshot_v1_ScreenshotPlayer_fieldAccessorTable
            .ensureFieldAccessorsInitialized(ScreenshotPlayer.class, ScreenshotPlayer.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (ScreenshotPlayer.alwaysUseFieldBuilders) {
            this.getPlayerFieldBuilder();
            this.getSkinFieldBuilder();
         }
      }

      public ScreenshotPlayer.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.player_ = null;
         if (this.playerBuilder_ != null) {
            this.playerBuilder_.dispose();
            this.playerBuilder_ = null;
         }

         this.states_ = Collections.emptyList();
         this.bitField0_ &= -3;
         this.cosmetics_ = ScreenshotPlayer.emptyIntList();
         this.emote_ = 0;
         this.emoteJam_ = 0;
         this.skin_ = null;
         if (this.skinBuilder_ != null) {
            this.skinBuilder_.dispose();
            this.skinBuilder_ = null;
         }

         this.cape_ = "";
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_screenshot_v1_ScreenshotPlayer_descriptor;
      }

      public ScreenshotPlayer getDefaultInstanceForType() {
         return ScreenshotPlayer.getDefaultInstance();
      }

      public ScreenshotPlayer build() {
         ScreenshotPlayer var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public ScreenshotPlayer buildPartial() {
         ScreenshotPlayer var1 = new ScreenshotPlayer(this);
         this.buildPartialRepeatedFields(var1);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartialRepeatedFields(ScreenshotPlayer var1) {
         if ((this.bitField0_ & 2) != 0) {
            this.states_ = Collections.unmodifiableList(this.states_);
            this.bitField0_ &= -3;
         }

         var1.states_ = this.states_;
      }

      private void buildPartial0(ScreenshotPlayer var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.player_ = this.playerBuilder_ == null ? this.player_ : this.playerBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 4) != 0) {
            this.cosmetics_.makeImmutable();
            var1.cosmetics_ = this.cosmetics_;
         }

         if ((var2 & 8) != 0) {
            var1.emote_ = this.emote_;
         }

         if ((var2 & 16) != 0) {
            var1.emoteJam_ = this.emoteJam_;
         }

         if ((var2 & 32) != 0) {
            var1.skin_ = this.skinBuilder_ == null ? this.skin_ : this.skinBuilder_.build();
            var3 |= 2;
         }

         if ((var2 & 64) != 0) {
            var1.cape_ = this.cape_;
         }

         ScreenshotPlayer var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public ScreenshotPlayer.Builder clone() {
         return (ScreenshotPlayer.Builder)super.clone();
      }

      public ScreenshotPlayer.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ScreenshotPlayer.Builder)super.setField(var1, var2);
      }

      public ScreenshotPlayer.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (ScreenshotPlayer.Builder)super.clearField(var1);
      }

      public ScreenshotPlayer.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (ScreenshotPlayer.Builder)super.clearOneof(var1);
      }

      public ScreenshotPlayer.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (ScreenshotPlayer.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public ScreenshotPlayer.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (ScreenshotPlayer.Builder)super.addRepeatedField(var1, var2);
      }

      public ScreenshotPlayer.Builder mergeFrom(Message var1) {
         if (var1 instanceof ScreenshotPlayer) {
            return this.mergeFrom((ScreenshotPlayer)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public ScreenshotPlayer.Builder mergeFrom(ScreenshotPlayer var1) {
         if (var1 == ScreenshotPlayer.getDefaultInstance()) {
            return this;
         }

         if (var1.hasPlayer()) {
            this.mergePlayer(var1.getPlayer());
         }

         if (!var1.states_.isEmpty()) {
            if (this.states_.isEmpty()) {
               this.states_ = var1.states_;
               this.bitField0_ &= -3;
            } else {
               this.ensureStatesIsMutable();
               this.states_.addAll(var1.states_);
            }

            this.onChanged();
         }

         if (!var1.cosmetics_.isEmpty()) {
            if (this.cosmetics_.isEmpty()) {
               this.cosmetics_ = var1.cosmetics_;
               this.cosmetics_.makeImmutable();
               this.bitField0_ |= 4;
            } else {
               this.ensureCosmeticsIsMutable();
               this.cosmetics_.addAll(var1.cosmetics_);
            }

            this.onChanged();
         }

         if (var1.getEmote() != 0) {
            this.setEmote(var1.getEmote());
         }

         if (var1.getEmoteJam() != 0) {
            this.setEmoteJam(var1.getEmoteJam());
         }

         if (var1.hasSkin()) {
            this.mergeSkin(var1.getSkin());
         }

         if (!var1.getCape().isEmpty()) {
            this.cape_ = var1.cape_;
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

      public ScreenshotPlayer.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                  case 16:
                     int var15 = var1.readEnum();
                     this.ensureStatesIsMutable();
                     this.states_.add(var15);
                     break;
                  case 18:
                     int var14 = var1.readRawVarint32();
                     int var16 = var1.pushLimit(var14);

                     while (var1.getBytesUntilLimit() > 0) {
                        int var7 = var1.readEnum();
                        this.ensureStatesIsMutable();
                        this.states_.add(var7);
                     }

                     var1.popLimit(var16);
                     break;
                  case 24:
                     int var13 = var1.readInt32();
                     this.ensureCosmeticsIsMutable();
                     this.cosmetics_.addInt(var13);
                     break;
                  case 26:
                     int var5 = var1.readRawVarint32();
                     int var6 = var1.pushLimit(var5);
                     this.ensureCosmeticsIsMutable();

                     while (var1.getBytesUntilLimit() > 0) {
                        this.cosmetics_.addInt(var1.readInt32());
                     }

                     var1.popLimit(var6);
                     break;
                  case 32:
                     this.emote_ = var1.readInt32();
                     this.bitField0_ |= 8;
                     break;
                  case 40:
                     this.emoteJam_ = var1.readInt32();
                     this.bitField0_ |= 16;
                     break;
                  case 50:
                     var1.readMessage(this.getSkinFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 32;
                     break;
                  case 58:
                     this.cape_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 64;
                     break;
                  default:
                     if (!super.parseUnknownField(var1, var2, var4)) {
                        var3 = true;
                     }
               }
            }
         } catch (InvalidProtocolBufferException var11) {
            throw var11.unwrapIOException();
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

      public ScreenshotPlayer.Builder setPlayer(UuidAndUsername var1) {
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

      public ScreenshotPlayer.Builder setPlayer(UuidAndUsername.Builder var1) {
         if (this.playerBuilder_ == null) {
            this.player_ = var1.build();
         } else {
            this.playerBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public ScreenshotPlayer.Builder mergePlayer(UuidAndUsername var1) {
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

      public ScreenshotPlayer.Builder clearPlayer() {
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

      private void ensureStatesIsMutable() {
         if ((this.bitField0_ & 2) == 0) {
            this.states_ = new ArrayList<>(this.states_);
            this.bitField0_ |= 2;
         }
      }

      @Override
      public List<PlayerState> getStatesList() {
         return new Internal.ListAdapter<>(this.states_, ScreenshotPlayer.states_converter_);
      }

      @Override
      public int getStatesCount() {
         return this.states_.size();
      }

      @Override
      public PlayerState getStates(int var1) {
         return ScreenshotPlayer.states_converter_.convert(this.states_.get(var1));
      }

      public ScreenshotPlayer.Builder setStates(int var1, PlayerState var2) {
         if (var2 == null) {
            throw new NullPointerException();
         }

         this.ensureStatesIsMutable();
         this.states_.set(var1, var2.getNumber());
         this.onChanged();
         return this;
      }

      public ScreenshotPlayer.Builder addStates(PlayerState var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.ensureStatesIsMutable();
         this.states_.add(var1.getNumber());
         this.onChanged();
         return this;
      }

      public ScreenshotPlayer.Builder addAllStates(Iterable<? extends PlayerState> var1) {
         this.ensureStatesIsMutable();

         for (PlayerState var3 : var1) {
            this.states_.add(var3.getNumber());
         }

         this.onChanged();
         return this;
      }

      public ScreenshotPlayer.Builder clearStates() {
         this.states_ = Collections.emptyList();
         this.bitField0_ &= -3;
         this.onChanged();
         return this;
      }

      @Override
      public List<Integer> getStatesValueList() {
         return Collections.unmodifiableList(this.states_);
      }

      @Override
      public int getStatesValue(int var1) {
         return this.states_.get(var1);
      }

      public ScreenshotPlayer.Builder setStatesValue(int var1, int var2) {
         this.ensureStatesIsMutable();
         this.states_.set(var1, var2);
         this.onChanged();
         return this;
      }

      public ScreenshotPlayer.Builder addStatesValue(int var1) {
         this.ensureStatesIsMutable();
         this.states_.add(var1);
         this.onChanged();
         return this;
      }

      public ScreenshotPlayer.Builder addAllStatesValue(Iterable<Integer> var1) {
         this.ensureStatesIsMutable();

         for (int var3 : var1) {
            this.states_.add(var3);
         }

         this.onChanged();
         return this;
      }

      private void ensureCosmeticsIsMutable() {
         if (!this.cosmetics_.isModifiable()) {
            this.cosmetics_ = ScreenshotPlayer.makeMutableCopy(this.cosmetics_);
         }

         this.bitField0_ |= 4;
      }

      @Override
      public List<Integer> getCosmeticsList() {
         this.cosmetics_.makeImmutable();
         return this.cosmetics_;
      }

      @Override
      public int getCosmeticsCount() {
         return this.cosmetics_.size();
      }

      @Override
      public int getCosmetics(int var1) {
         return this.cosmetics_.getInt(var1);
      }

      public ScreenshotPlayer.Builder setCosmetics(int var1, int var2) {
         this.ensureCosmeticsIsMutable();
         this.cosmetics_.setInt(var1, var2);
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public ScreenshotPlayer.Builder addCosmetics(int var1) {
         this.ensureCosmeticsIsMutable();
         this.cosmetics_.addInt(var1);
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public ScreenshotPlayer.Builder addAllCosmetics(Iterable<? extends Integer> var1) {
         this.ensureCosmeticsIsMutable();
         AbstractMessageLite.Builder.addAll(var1, this.cosmetics_);
         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public ScreenshotPlayer.Builder clearCosmetics() {
         this.cosmetics_ = ScreenshotPlayer.emptyIntList();
         this.bitField0_ &= -5;
         this.onChanged();
         return this;
      }

      @Override
      public int getEmote() {
         return this.emote_;
      }

      public ScreenshotPlayer.Builder setEmote(int var1) {
         this.emote_ = var1;
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public ScreenshotPlayer.Builder clearEmote() {
         this.bitField0_ &= -9;
         this.emote_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public int getEmoteJam() {
         return this.emoteJam_;
      }

      public ScreenshotPlayer.Builder setEmoteJam(int var1) {
         this.emoteJam_ = var1;
         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      public ScreenshotPlayer.Builder clearEmoteJam() {
         this.bitField0_ &= -17;
         this.emoteJam_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public boolean hasSkin() {
         return (this.bitField0_ & 32) != 0;
      }

      @Override
      public MinecraftSkin getSkin() {
         if (this.skinBuilder_ == null) {
            return this.skin_ == null ? MinecraftSkin.getDefaultInstance() : this.skin_;
         } else {
            return this.skinBuilder_.getMessage();
         }
      }

      public ScreenshotPlayer.Builder setSkin(MinecraftSkin var1) {
         if (this.skinBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.skin_ = var1;
         } else {
            this.skinBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 32;
         this.onChanged();
         return this;
      }

      public ScreenshotPlayer.Builder setSkin(MinecraftSkin.Builder var1) {
         if (this.skinBuilder_ == null) {
            this.skin_ = var1.build();
         } else {
            this.skinBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 32;
         this.onChanged();
         return this;
      }

      public ScreenshotPlayer.Builder mergeSkin(MinecraftSkin var1) {
         if (this.skinBuilder_ == null) {
            if ((this.bitField0_ & 32) != 0 && this.skin_ != null && this.skin_ != MinecraftSkin.getDefaultInstance()) {
               this.getSkinBuilder().mergeFrom(var1);
            } else {
               this.skin_ = var1;
            }
         } else {
            this.skinBuilder_.mergeFrom(var1);
         }

         if (this.skin_ != null) {
            this.bitField0_ |= 32;
            this.onChanged();
         }

         return this;
      }

      public ScreenshotPlayer.Builder clearSkin() {
         this.bitField0_ &= -33;
         this.skin_ = null;
         if (this.skinBuilder_ != null) {
            this.skinBuilder_.dispose();
            this.skinBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public MinecraftSkin.Builder getSkinBuilder() {
         this.bitField0_ |= 32;
         this.onChanged();
         return this.getSkinFieldBuilder().getBuilder();
      }

      @Override
      public MinecraftSkinOrBuilder getSkinOrBuilder() {
         if (this.skinBuilder_ != null) {
            return this.skinBuilder_.getMessageOrBuilder();
         } else {
            return this.skin_ == null ? MinecraftSkin.getDefaultInstance() : this.skin_;
         }
      }

      private SingleFieldBuilderV3<MinecraftSkin, MinecraftSkin.Builder, MinecraftSkinOrBuilder> getSkinFieldBuilder() {
         if (this.skinBuilder_ == null) {
            this.skinBuilder_ = new SingleFieldBuilderV3<>(this.getSkin(), this.getParentForChildren(), this.isClean());
            this.skin_ = null;
         }

         return this.skinBuilder_;
      }

      @Override
      public String getCape() {
         Object var1 = this.cape_;
         if (!(var1 instanceof String)) {
            ByteString var2 = (ByteString)var1;
            String var3 = var2.toStringUtf8();
            this.cape_ = var3;
            return var3;
         } else {
            return (String)var1;
         }
      }

      @Override
      public ByteString getCapeBytes() {
         Object var1 = this.cape_;
         if (var1 instanceof String) {
            ByteString var2 = ByteString.copyFromUtf8((String)var1);
            this.cape_ = var2;
            return var2;
         } else {
            return (ByteString)var1;
         }
      }

      public ScreenshotPlayer.Builder setCape(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.cape_ = var1;
         this.bitField0_ |= 64;
         this.onChanged();
         return this;
      }

      public ScreenshotPlayer.Builder clearCape() {
         this.cape_ = ScreenshotPlayer.getDefaultInstance().getCape();
         this.bitField0_ &= -65;
         this.onChanged();
         return this;
      }

      public ScreenshotPlayer.Builder setCapeBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         ScreenshotPlayer.checkByteStringIsUtf8(var1);
         this.cape_ = var1;
         this.bitField0_ |= 64;
         this.onChanged();
         return this;
      }

      public final ScreenshotPlayer.Builder setUnknownFields(UnknownFieldSet var1) {
         return (ScreenshotPlayer.Builder)super.setUnknownFields(var1);
      }

      public final ScreenshotPlayer.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (ScreenshotPlayer.Builder)super.mergeUnknownFields(var1);
      }
   }
}
