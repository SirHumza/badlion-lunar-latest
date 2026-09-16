package com.lunarclient.websocket.cosmetic.v2;

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
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import com.lunarclient.common.v1.Color;
import com.lunarclient.common.v1.ColorOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class LoginResponse extends GeneratedMessageV3 implements LoginResponseOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int LOGO_COLOR_FIELD_NUMBER = 1;
   private Color logoColor_;
   public static final int LOGO_ALWAYS_SHOW_FIELD_NUMBER = 2;
   private boolean logoAlwaysShow_ = false;
   public static final int PLUS_COLOR_FIELD_NUMBER = 3;
   private Color plusColor_;
   public static final int AVAILABLE_LUNAR_PLUS_COLORS_FIELD_NUMBER = 4;
   private List<Color> availableLunarPlusColors_;
   public static final int LUNAR_PLUS_FREE_COSMETIC_IDS_FIELD_NUMBER = 5;
   private Internal.IntList lunarPlusFreeCosmeticIds_ = emptyIntList();
   private int lunarPlusFreeCosmeticIdsMemoizedSerializedSize = -1;
   public static final int OWNED_COSMETICS_FIELD_NUMBER = 6;
   private List<OwnedCosmetic> ownedCosmetics_;
   public static final int HAS_ALL_COSMETICS_FLAG_FIELD_NUMBER = 7;
   private boolean hasAllCosmeticsFlag_ = false;
   public static final int RANK_NAME_FIELD_NUMBER = 8;
   private volatile Object rankName_ = "";
   public static final int FAVORITE_COSMETIC_IDS_FIELD_NUMBER = 9;
   private Internal.IntList favoriteCosmeticIds_ = emptyIntList();
   private int favoriteCosmeticIdsMemoizedSerializedSize = -1;
   public static final int OUTFITS_FIELD_NUMBER = 10;
   private List<Outfit> outfits_;
   public static final int OUTFIT_TREE_FIELD_NUMBER = 11;
   private OutfitTree outfitTree_;
   public static final int ARTIST_TOOLS_FIELD_NUMBER = 12;
   private boolean artistTools_ = false;
   public static final int COSMETIC_OWNERSHIP_VISIBILITY_FIELD_NUMBER = 13;
   private int cosmeticOwnershipVisibility_ = 0;
   public static final int TESTER_TOOLS_FIELD_NUMBER = 14;
   private boolean testerTools_ = false;
   public static final int DISCORD_REWARDS_FIELD_NUMBER = 15;
   private Internal.IntList discordRewards_ = emptyIntList();
   private int discordRewardsMemoizedSerializedSize = -1;
   public static final int DISCORD_TAG_REWARDS_FIELD_NUMBER = 16;
   private Internal.IntList discordTagRewards_ = emptyIntList();
   private int discordTagRewardsMemoizedSerializedSize = -1;
   private byte memoizedIsInitialized = -1;
   private static final LoginResponse DEFAULT_INSTANCE = new LoginResponse();
   private static final Parser<LoginResponse> PARSER = new AbstractParser<LoginResponse>() {
      public LoginResponse parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         LoginResponse.Builder var3 = LoginResponse.newBuilder();

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

   private LoginResponse(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private LoginResponse() {
      this.availableLunarPlusColors_ = Collections.emptyList();
      this.lunarPlusFreeCosmeticIds_ = emptyIntList();
      this.ownedCosmetics_ = Collections.emptyList();
      this.rankName_ = "";
      this.favoriteCosmeticIds_ = emptyIntList();
      this.outfits_ = Collections.emptyList();
      this.cosmeticOwnershipVisibility_ = 0;
      this.discordRewards_ = emptyIntList();
      this.discordTagRewards_ = emptyIntList();
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new LoginResponse();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return ServiceProto.internal_static_lunarclient_websocket_cosmetic_v2_LoginResponse_descriptor;
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return ServiceProto.internal_static_lunarclient_websocket_cosmetic_v2_LoginResponse_fieldAccessorTable
         .ensureFieldAccessorsInitialized(LoginResponse.class, LoginResponse.Builder.class);
   }

   @Override
   public boolean hasLogoColor() {
      return (this.bitField0_ & 1) != 0;
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
   public boolean getLogoAlwaysShow() {
      return this.logoAlwaysShow_;
   }

   @Override
   public boolean hasPlusColor() {
      return (this.bitField0_ & 2) != 0;
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
   public List<Color> getAvailableLunarPlusColorsList() {
      return this.availableLunarPlusColors_;
   }

   @Override
   public List<? extends ColorOrBuilder> getAvailableLunarPlusColorsOrBuilderList() {
      return this.availableLunarPlusColors_;
   }

   @Override
   public int getAvailableLunarPlusColorsCount() {
      return this.availableLunarPlusColors_.size();
   }

   @Override
   public Color getAvailableLunarPlusColors(int var1) {
      return this.availableLunarPlusColors_.get(var1);
   }

   @Override
   public ColorOrBuilder getAvailableLunarPlusColorsOrBuilder(int var1) {
      return this.availableLunarPlusColors_.get(var1);
   }

   @Override
   public List<Integer> getLunarPlusFreeCosmeticIdsList() {
      return this.lunarPlusFreeCosmeticIds_;
   }

   @Override
   public int getLunarPlusFreeCosmeticIdsCount() {
      return this.lunarPlusFreeCosmeticIds_.size();
   }

   @Override
   public int getLunarPlusFreeCosmeticIds(int var1) {
      return this.lunarPlusFreeCosmeticIds_.getInt(var1);
   }

   @Override
   public List<OwnedCosmetic> getOwnedCosmeticsList() {
      return this.ownedCosmetics_;
   }

   @Override
   public List<? extends OwnedCosmeticOrBuilder> getOwnedCosmeticsOrBuilderList() {
      return this.ownedCosmetics_;
   }

   @Override
   public int getOwnedCosmeticsCount() {
      return this.ownedCosmetics_.size();
   }

   @Override
   public OwnedCosmetic getOwnedCosmetics(int var1) {
      return this.ownedCosmetics_.get(var1);
   }

   @Override
   public OwnedCosmeticOrBuilder getOwnedCosmeticsOrBuilder(int var1) {
      return this.ownedCosmetics_.get(var1);
   }

   @Override
   public boolean getHasAllCosmeticsFlag() {
      return this.hasAllCosmeticsFlag_;
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
   public List<Integer> getFavoriteCosmeticIdsList() {
      return this.favoriteCosmeticIds_;
   }

   @Override
   public int getFavoriteCosmeticIdsCount() {
      return this.favoriteCosmeticIds_.size();
   }

   @Override
   public int getFavoriteCosmeticIds(int var1) {
      return this.favoriteCosmeticIds_.getInt(var1);
   }

   @Override
   public List<Outfit> getOutfitsList() {
      return this.outfits_;
   }

   @Override
   public List<? extends OutfitOrBuilder> getOutfitsOrBuilderList() {
      return this.outfits_;
   }

   @Override
   public int getOutfitsCount() {
      return this.outfits_.size();
   }

   @Override
   public Outfit getOutfits(int var1) {
      return this.outfits_.get(var1);
   }

   @Override
   public OutfitOrBuilder getOutfitsOrBuilder(int var1) {
      return this.outfits_.get(var1);
   }

   @Override
   public boolean hasOutfitTree() {
      return (this.bitField0_ & 4) != 0;
   }

   @Override
   public OutfitTree getOutfitTree() {
      return this.outfitTree_ == null ? OutfitTree.getDefaultInstance() : this.outfitTree_;
   }

   @Override
   public OutfitTreeOrBuilder getOutfitTreeOrBuilder() {
      return this.outfitTree_ == null ? OutfitTree.getDefaultInstance() : this.outfitTree_;
   }

   @Override
   public boolean getArtistTools() {
      return this.artistTools_;
   }

   @Override
   public int getCosmeticOwnershipVisibilityValue() {
      return this.cosmeticOwnershipVisibility_;
   }

   @Override
   public CosmeticOwnershipVisibility getCosmeticOwnershipVisibility() {
      CosmeticOwnershipVisibility var1 = CosmeticOwnershipVisibility.forNumber(this.cosmeticOwnershipVisibility_);
      return var1 == null ? CosmeticOwnershipVisibility.UNRECOGNIZED : var1;
   }

   @Override
   public boolean getTesterTools() {
      return this.testerTools_;
   }

   @Override
   public List<Integer> getDiscordRewardsList() {
      return this.discordRewards_;
   }

   @Override
   public int getDiscordRewardsCount() {
      return this.discordRewards_.size();
   }

   @Override
   public int getDiscordRewards(int var1) {
      return this.discordRewards_.getInt(var1);
   }

   @Override
   public List<Integer> getDiscordTagRewardsList() {
      return this.discordTagRewards_;
   }

   @Override
   public int getDiscordTagRewardsCount() {
      return this.discordTagRewards_.size();
   }

   @Override
   public int getDiscordTagRewards(int var1) {
      return this.discordTagRewards_.getInt(var1);
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
         var1.writeMessage(1, this.getLogoColor());
      }

      if (this.logoAlwaysShow_) {
         var1.writeBool(2, this.logoAlwaysShow_);
      }

      if ((this.bitField0_ & 2) != 0) {
         var1.writeMessage(3, this.getPlusColor());
      }

      for (int var2 = 0; var2 < this.availableLunarPlusColors_.size(); var2++) {
         var1.writeMessage(4, this.availableLunarPlusColors_.get(var2));
      }

      if (this.getLunarPlusFreeCosmeticIdsList().size() > 0) {
         var1.writeUInt32NoTag(42);
         var1.writeUInt32NoTag(this.lunarPlusFreeCosmeticIdsMemoizedSerializedSize);
      }

      for (int var3 = 0; var3 < this.lunarPlusFreeCosmeticIds_.size(); var3++) {
         var1.writeInt32NoTag(this.lunarPlusFreeCosmeticIds_.getInt(var3));
      }

      for (int var4 = 0; var4 < this.ownedCosmetics_.size(); var4++) {
         var1.writeMessage(6, this.ownedCosmetics_.get(var4));
      }

      if (this.hasAllCosmeticsFlag_) {
         var1.writeBool(7, this.hasAllCosmeticsFlag_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.rankName_)) {
         GeneratedMessageV3.writeString(var1, 8, this.rankName_);
      }

      if (this.getFavoriteCosmeticIdsList().size() > 0) {
         var1.writeUInt32NoTag(74);
         var1.writeUInt32NoTag(this.favoriteCosmeticIdsMemoizedSerializedSize);
      }

      for (int var5 = 0; var5 < this.favoriteCosmeticIds_.size(); var5++) {
         var1.writeInt32NoTag(this.favoriteCosmeticIds_.getInt(var5));
      }

      for (int var6 = 0; var6 < this.outfits_.size(); var6++) {
         var1.writeMessage(10, this.outfits_.get(var6));
      }

      if ((this.bitField0_ & 4) != 0) {
         var1.writeMessage(11, this.getOutfitTree());
      }

      if (this.artistTools_) {
         var1.writeBool(12, this.artistTools_);
      }

      if (this.cosmeticOwnershipVisibility_ != CosmeticOwnershipVisibility.COSMETIC_OWNERSHIP_VISIBILITY_UNSPECIFIED.getNumber()) {
         var1.writeEnum(13, this.cosmeticOwnershipVisibility_);
      }

      if (this.testerTools_) {
         var1.writeBool(14, this.testerTools_);
      }

      if (this.getDiscordRewardsList().size() > 0) {
         var1.writeUInt32NoTag(122);
         var1.writeUInt32NoTag(this.discordRewardsMemoizedSerializedSize);
      }

      for (int var7 = 0; var7 < this.discordRewards_.size(); var7++) {
         var1.writeInt32NoTag(this.discordRewards_.getInt(var7));
      }

      if (this.getDiscordTagRewardsList().size() > 0) {
         var1.writeUInt32NoTag(130);
         var1.writeUInt32NoTag(this.discordTagRewardsMemoizedSerializedSize);
      }

      for (int var8 = 0; var8 < this.discordTagRewards_.size(); var8++) {
         var1.writeInt32NoTag(this.discordTagRewards_.getInt(var8));
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
         var1 += CodedOutputStream.computeMessageSize(1, this.getLogoColor());
      }

      if (this.logoAlwaysShow_) {
         var1 += CodedOutputStream.computeBoolSize(2, this.logoAlwaysShow_);
      }

      if ((this.bitField0_ & 2) != 0) {
         var1 += CodedOutputStream.computeMessageSize(3, this.getPlusColor());
      }

      for (int var2 = 0; var2 < this.availableLunarPlusColors_.size(); var2++) {
         var1 += CodedOutputStream.computeMessageSize(4, this.availableLunarPlusColors_.get(var2));
      }

      int var14 = 0;

      for (int var3 = 0; var3 < this.lunarPlusFreeCosmeticIds_.size(); var3++) {
         var14 += CodedOutputStream.computeInt32SizeNoTag(this.lunarPlusFreeCosmeticIds_.getInt(var3));
      }

      var1 += var14;
      if (!this.getLunarPlusFreeCosmeticIdsList().isEmpty()) {
         var1 = ++var1 + CodedOutputStream.computeInt32SizeNoTag(var14);
      }

      this.lunarPlusFreeCosmeticIdsMemoizedSerializedSize = var14;

      for (int var15 = 0; var15 < this.ownedCosmetics_.size(); var15++) {
         var1 += CodedOutputStream.computeMessageSize(6, this.ownedCosmetics_.get(var15));
      }

      if (this.hasAllCosmeticsFlag_) {
         var1 += CodedOutputStream.computeBoolSize(7, this.hasAllCosmeticsFlag_);
      }

      if (!GeneratedMessageV3.isStringEmpty(this.rankName_)) {
         var1 += GeneratedMessageV3.computeStringSize(8, this.rankName_);
      }

      var14 = 0;

      for (int var20 = 0; var20 < this.favoriteCosmeticIds_.size(); var20++) {
         var14 += CodedOutputStream.computeInt32SizeNoTag(this.favoriteCosmeticIds_.getInt(var20));
      }

      var1 += var14;
      if (!this.getFavoriteCosmeticIdsList().isEmpty()) {
         var1 = ++var1 + CodedOutputStream.computeInt32SizeNoTag(var14);
      }

      this.favoriteCosmeticIdsMemoizedSerializedSize = var14;

      for (int var17 = 0; var17 < this.outfits_.size(); var17++) {
         var1 += CodedOutputStream.computeMessageSize(10, this.outfits_.get(var17));
      }

      if ((this.bitField0_ & 4) != 0) {
         var1 += CodedOutputStream.computeMessageSize(11, this.getOutfitTree());
      }

      if (this.artistTools_) {
         var1 += CodedOutputStream.computeBoolSize(12, this.artistTools_);
      }

      if (this.cosmeticOwnershipVisibility_ != CosmeticOwnershipVisibility.COSMETIC_OWNERSHIP_VISIBILITY_UNSPECIFIED.getNumber()) {
         var1 += CodedOutputStream.computeEnumSize(13, this.cosmeticOwnershipVisibility_);
      }

      if (this.testerTools_) {
         var1 += CodedOutputStream.computeBoolSize(14, this.testerTools_);
      }

      var14 = 0;

      for (int var21 = 0; var21 < this.discordRewards_.size(); var21++) {
         var14 += CodedOutputStream.computeInt32SizeNoTag(this.discordRewards_.getInt(var21));
      }

      var1 += var14;
      if (!this.getDiscordRewardsList().isEmpty()) {
         var1 = ++var1 + CodedOutputStream.computeInt32SizeNoTag(var14);
      }

      this.discordRewardsMemoizedSerializedSize = var14;
      var14 = 0;

      for (int var22 = 0; var22 < this.discordTagRewards_.size(); var22++) {
         var14 += CodedOutputStream.computeInt32SizeNoTag(this.discordTagRewards_.getInt(var22));
      }

      var1 += var14;
      if (!this.getDiscordTagRewardsList().isEmpty()) {
         var1 += 2;
         var1 += CodedOutputStream.computeInt32SizeNoTag(var14);
      }

      this.discordTagRewardsMemoizedSerializedSize = var14;
      var1 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var1;
      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof LoginResponse)) {
         return super.equals(var1);
      } else {
         LoginResponse var2 = (LoginResponse)var1;
         if (this.hasLogoColor() != var2.hasLogoColor()) {
            return false;
         } else if (this.hasLogoColor() && !this.getLogoColor().equals(var2.getLogoColor())) {
            return false;
         } else if (this.getLogoAlwaysShow() != var2.getLogoAlwaysShow()) {
            return false;
         } else if (this.hasPlusColor() != var2.hasPlusColor()) {
            return false;
         } else if (this.hasPlusColor() && !this.getPlusColor().equals(var2.getPlusColor())) {
            return false;
         } else if (!this.getAvailableLunarPlusColorsList().equals(var2.getAvailableLunarPlusColorsList())) {
            return false;
         } else if (!this.getLunarPlusFreeCosmeticIdsList().equals(var2.getLunarPlusFreeCosmeticIdsList())) {
            return false;
         } else if (!this.getOwnedCosmeticsList().equals(var2.getOwnedCosmeticsList())) {
            return false;
         } else if (this.getHasAllCosmeticsFlag() != var2.getHasAllCosmeticsFlag()) {
            return false;
         } else if (!this.getRankName().equals(var2.getRankName())) {
            return false;
         } else if (!this.getFavoriteCosmeticIdsList().equals(var2.getFavoriteCosmeticIdsList())) {
            return false;
         } else if (!this.getOutfitsList().equals(var2.getOutfitsList())) {
            return false;
         } else if (this.hasOutfitTree() != var2.hasOutfitTree()) {
            return false;
         } else if (this.hasOutfitTree() && !this.getOutfitTree().equals(var2.getOutfitTree())) {
            return false;
         } else if (this.getArtistTools() != var2.getArtistTools()) {
            return false;
         } else if (this.cosmeticOwnershipVisibility_ != var2.cosmeticOwnershipVisibility_) {
            return false;
         } else if (this.getTesterTools() != var2.getTesterTools()) {
            return false;
         } else if (!this.getDiscordRewardsList().equals(var2.getDiscordRewardsList())) {
            return false;
         } else {
            return !this.getDiscordTagRewardsList().equals(var2.getDiscordTagRewardsList()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.hasLogoColor()) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getLogoColor().hashCode();
      }

      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + Internal.hashBoolean(this.getLogoAlwaysShow());
      if (this.hasPlusColor()) {
         var1 = 37 * var1 + 3;
         var1 = 53 * var1 + this.getPlusColor().hashCode();
      }

      if (this.getAvailableLunarPlusColorsCount() > 0) {
         var1 = 37 * var1 + 4;
         var1 = 53 * var1 + this.getAvailableLunarPlusColorsList().hashCode();
      }

      if (this.getLunarPlusFreeCosmeticIdsCount() > 0) {
         var1 = 37 * var1 + 5;
         var1 = 53 * var1 + this.getLunarPlusFreeCosmeticIdsList().hashCode();
      }

      if (this.getOwnedCosmeticsCount() > 0) {
         var1 = 37 * var1 + 6;
         var1 = 53 * var1 + this.getOwnedCosmeticsList().hashCode();
      }

      var1 = 37 * var1 + 7;
      var1 = 53 * var1 + Internal.hashBoolean(this.getHasAllCosmeticsFlag());
      var1 = 37 * var1 + 8;
      var1 = 53 * var1 + this.getRankName().hashCode();
      if (this.getFavoriteCosmeticIdsCount() > 0) {
         var1 = 37 * var1 + 9;
         var1 = 53 * var1 + this.getFavoriteCosmeticIdsList().hashCode();
      }

      if (this.getOutfitsCount() > 0) {
         var1 = 37 * var1 + 10;
         var1 = 53 * var1 + this.getOutfitsList().hashCode();
      }

      if (this.hasOutfitTree()) {
         var1 = 37 * var1 + 11;
         var1 = 53 * var1 + this.getOutfitTree().hashCode();
      }

      var1 = 37 * var1 + 12;
      var1 = 53 * var1 + Internal.hashBoolean(this.getArtistTools());
      var1 = 37 * var1 + 13;
      var1 = 53 * var1 + this.cosmeticOwnershipVisibility_;
      var1 = 37 * var1 + 14;
      var1 = 53 * var1 + Internal.hashBoolean(this.getTesterTools());
      if (this.getDiscordRewardsCount() > 0) {
         var1 = 37 * var1 + 15;
         var1 = 53 * var1 + this.getDiscordRewardsList().hashCode();
      }

      if (this.getDiscordTagRewardsCount() > 0) {
         var1 = 37 * var1 + 16;
         var1 = 53 * var1 + this.getDiscordTagRewardsList().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static LoginResponse parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static LoginResponse parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LoginResponse parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static LoginResponse parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LoginResponse parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static LoginResponse parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static LoginResponse parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static LoginResponse parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static LoginResponse parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static LoginResponse parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static LoginResponse parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static LoginResponse parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public LoginResponse.Builder newBuilderForType() {
      return newBuilder();
   }

   public static LoginResponse.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static LoginResponse.Builder newBuilder(LoginResponse var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public LoginResponse.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new LoginResponse.Builder() : new LoginResponse.Builder().mergeFrom(this);
   }

   protected LoginResponse.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new LoginResponse.Builder(var1);
   }

   public static LoginResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<LoginResponse> parser() {
      return PARSER;
   }

   @Override
   public Parser<LoginResponse> getParserForType() {
      return PARSER;
   }

   public LoginResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<LoginResponse.Builder> implements LoginResponseOrBuilder {
      private int bitField0_;
      private Color logoColor_;
      private SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> logoColorBuilder_;
      private boolean logoAlwaysShow_;
      private Color plusColor_;
      private SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> plusColorBuilder_;
      private List<Color> availableLunarPlusColors_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> availableLunarPlusColorsBuilder_;
      private Internal.IntList lunarPlusFreeCosmeticIds_ = LoginResponse.emptyIntList();
      private List<OwnedCosmetic> ownedCosmetics_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<OwnedCosmetic, OwnedCosmetic.Builder, OwnedCosmeticOrBuilder> ownedCosmeticsBuilder_;
      private boolean hasAllCosmeticsFlag_;
      private Object rankName_ = "";
      private Internal.IntList favoriteCosmeticIds_ = LoginResponse.emptyIntList();
      private List<Outfit> outfits_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<Outfit, Outfit.Builder, OutfitOrBuilder> outfitsBuilder_;
      private OutfitTree outfitTree_;
      private SingleFieldBuilderV3<OutfitTree, OutfitTree.Builder, OutfitTreeOrBuilder> outfitTreeBuilder_;
      private boolean artistTools_;
      private int cosmeticOwnershipVisibility_ = 0;
      private boolean testerTools_;
      private Internal.IntList discordRewards_ = LoginResponse.emptyIntList();
      private Internal.IntList discordTagRewards_ = LoginResponse.emptyIntList();

      public static final Descriptors.Descriptor getDescriptor() {
         return ServiceProto.internal_static_lunarclient_websocket_cosmetic_v2_LoginResponse_descriptor;
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return ServiceProto.internal_static_lunarclient_websocket_cosmetic_v2_LoginResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(LoginResponse.class, LoginResponse.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (LoginResponse.alwaysUseFieldBuilders) {
            this.getLogoColorFieldBuilder();
            this.getPlusColorFieldBuilder();
            this.getAvailableLunarPlusColorsFieldBuilder();
            this.getOwnedCosmeticsFieldBuilder();
            this.getOutfitsFieldBuilder();
            this.getOutfitTreeFieldBuilder();
         }
      }

      public LoginResponse.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.logoColor_ = null;
         if (this.logoColorBuilder_ != null) {
            this.logoColorBuilder_.dispose();
            this.logoColorBuilder_ = null;
         }

         this.logoAlwaysShow_ = false;
         this.plusColor_ = null;
         if (this.plusColorBuilder_ != null) {
            this.plusColorBuilder_.dispose();
            this.plusColorBuilder_ = null;
         }

         if (this.availableLunarPlusColorsBuilder_ == null) {
            this.availableLunarPlusColors_ = Collections.emptyList();
         } else {
            this.availableLunarPlusColors_ = null;
            this.availableLunarPlusColorsBuilder_.clear();
         }

         this.bitField0_ &= -9;
         this.lunarPlusFreeCosmeticIds_ = LoginResponse.emptyIntList();
         if (this.ownedCosmeticsBuilder_ == null) {
            this.ownedCosmetics_ = Collections.emptyList();
         } else {
            this.ownedCosmetics_ = null;
            this.ownedCosmeticsBuilder_.clear();
         }

         this.bitField0_ &= -33;
         this.hasAllCosmeticsFlag_ = false;
         this.rankName_ = "";
         this.favoriteCosmeticIds_ = LoginResponse.emptyIntList();
         if (this.outfitsBuilder_ == null) {
            this.outfits_ = Collections.emptyList();
         } else {
            this.outfits_ = null;
            this.outfitsBuilder_.clear();
         }

         this.bitField0_ &= -513;
         this.outfitTree_ = null;
         if (this.outfitTreeBuilder_ != null) {
            this.outfitTreeBuilder_.dispose();
            this.outfitTreeBuilder_ = null;
         }

         this.artistTools_ = false;
         this.cosmeticOwnershipVisibility_ = 0;
         this.testerTools_ = false;
         this.discordRewards_ = LoginResponse.emptyIntList();
         this.discordTagRewards_ = LoginResponse.emptyIntList();
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return ServiceProto.internal_static_lunarclient_websocket_cosmetic_v2_LoginResponse_descriptor;
      }

      public LoginResponse getDefaultInstanceForType() {
         return LoginResponse.getDefaultInstance();
      }

      public LoginResponse build() {
         LoginResponse var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public LoginResponse buildPartial() {
         LoginResponse var1 = new LoginResponse(this);
         this.buildPartialRepeatedFields(var1);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartialRepeatedFields(LoginResponse var1) {
         if (this.availableLunarPlusColorsBuilder_ == null) {
            if ((this.bitField0_ & 8) != 0) {
               this.availableLunarPlusColors_ = Collections.unmodifiableList(this.availableLunarPlusColors_);
               this.bitField0_ &= -9;
            }

            var1.availableLunarPlusColors_ = this.availableLunarPlusColors_;
         } else {
            var1.availableLunarPlusColors_ = this.availableLunarPlusColorsBuilder_.build();
         }

         if (this.ownedCosmeticsBuilder_ == null) {
            if ((this.bitField0_ & 32) != 0) {
               this.ownedCosmetics_ = Collections.unmodifiableList(this.ownedCosmetics_);
               this.bitField0_ &= -33;
            }

            var1.ownedCosmetics_ = this.ownedCosmetics_;
         } else {
            var1.ownedCosmetics_ = this.ownedCosmeticsBuilder_.build();
         }

         if (this.outfitsBuilder_ == null) {
            if ((this.bitField0_ & 512) != 0) {
               this.outfits_ = Collections.unmodifiableList(this.outfits_);
               this.bitField0_ &= -513;
            }

            var1.outfits_ = this.outfits_;
         } else {
            var1.outfits_ = this.outfitsBuilder_.build();
         }
      }

      private void buildPartial0(LoginResponse var1) {
         int var2 = this.bitField0_;
         byte var3 = 0;
         if ((var2 & 1) != 0) {
            var1.logoColor_ = this.logoColorBuilder_ == null ? this.logoColor_ : this.logoColorBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 2) != 0) {
            var1.logoAlwaysShow_ = this.logoAlwaysShow_;
         }

         if ((var2 & 4) != 0) {
            var1.plusColor_ = this.plusColorBuilder_ == null ? this.plusColor_ : this.plusColorBuilder_.build();
            var3 |= 2;
         }

         if ((var2 & 16) != 0) {
            this.lunarPlusFreeCosmeticIds_.makeImmutable();
            var1.lunarPlusFreeCosmeticIds_ = this.lunarPlusFreeCosmeticIds_;
         }

         if ((var2 & 64) != 0) {
            var1.hasAllCosmeticsFlag_ = this.hasAllCosmeticsFlag_;
         }

         if ((var2 & 128) != 0) {
            var1.rankName_ = this.rankName_;
         }

         if ((var2 & 256) != 0) {
            this.favoriteCosmeticIds_.makeImmutable();
            var1.favoriteCosmeticIds_ = this.favoriteCosmeticIds_;
         }

         if ((var2 & 1024) != 0) {
            var1.outfitTree_ = this.outfitTreeBuilder_ == null ? this.outfitTree_ : this.outfitTreeBuilder_.build();
            var3 |= 4;
         }

         if ((var2 & 2048) != 0) {
            var1.artistTools_ = this.artistTools_;
         }

         if ((var2 & 4096) != 0) {
            var1.cosmeticOwnershipVisibility_ = this.cosmeticOwnershipVisibility_;
         }

         if ((var2 & 8192) != 0) {
            var1.testerTools_ = this.testerTools_;
         }

         if ((var2 & 16384) != 0) {
            this.discordRewards_.makeImmutable();
            var1.discordRewards_ = this.discordRewards_;
         }

         if ((var2 & 32768) != 0) {
            this.discordTagRewards_.makeImmutable();
            var1.discordTagRewards_ = this.discordTagRewards_;
         }

         LoginResponse var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public LoginResponse.Builder clone() {
         return (LoginResponse.Builder)super.clone();
      }

      public LoginResponse.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (LoginResponse.Builder)super.setField(var1, var2);
      }

      public LoginResponse.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (LoginResponse.Builder)super.clearField(var1);
      }

      public LoginResponse.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (LoginResponse.Builder)super.clearOneof(var1);
      }

      public LoginResponse.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (LoginResponse.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public LoginResponse.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (LoginResponse.Builder)super.addRepeatedField(var1, var2);
      }

      public LoginResponse.Builder mergeFrom(Message var1) {
         if (var1 instanceof LoginResponse) {
            return this.mergeFrom((LoginResponse)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public LoginResponse.Builder mergeFrom(LoginResponse var1) {
         if (var1 == LoginResponse.getDefaultInstance()) {
            return this;
         }

         if (var1.hasLogoColor()) {
            this.mergeLogoColor(var1.getLogoColor());
         }

         if (var1.getLogoAlwaysShow()) {
            this.setLogoAlwaysShow(var1.getLogoAlwaysShow());
         }

         if (var1.hasPlusColor()) {
            this.mergePlusColor(var1.getPlusColor());
         }

         if (this.availableLunarPlusColorsBuilder_ == null) {
            if (!var1.availableLunarPlusColors_.isEmpty()) {
               if (this.availableLunarPlusColors_.isEmpty()) {
                  this.availableLunarPlusColors_ = var1.availableLunarPlusColors_;
                  this.bitField0_ &= -9;
               } else {
                  this.ensureAvailableLunarPlusColorsIsMutable();
                  this.availableLunarPlusColors_.addAll(var1.availableLunarPlusColors_);
               }

               this.onChanged();
            }
         } else if (!var1.availableLunarPlusColors_.isEmpty()) {
            if (this.availableLunarPlusColorsBuilder_.isEmpty()) {
               this.availableLunarPlusColorsBuilder_.dispose();
               this.availableLunarPlusColorsBuilder_ = null;
               this.availableLunarPlusColors_ = var1.availableLunarPlusColors_;
               this.bitField0_ &= -9;
               this.availableLunarPlusColorsBuilder_ = LoginResponse.alwaysUseFieldBuilders ? this.getAvailableLunarPlusColorsFieldBuilder() : null;
            } else {
               this.availableLunarPlusColorsBuilder_.addAllMessages(var1.availableLunarPlusColors_);
            }
         }

         if (!var1.lunarPlusFreeCosmeticIds_.isEmpty()) {
            if (this.lunarPlusFreeCosmeticIds_.isEmpty()) {
               this.lunarPlusFreeCosmeticIds_ = var1.lunarPlusFreeCosmeticIds_;
               this.lunarPlusFreeCosmeticIds_.makeImmutable();
               this.bitField0_ |= 16;
            } else {
               this.ensureLunarPlusFreeCosmeticIdsIsMutable();
               this.lunarPlusFreeCosmeticIds_.addAll(var1.lunarPlusFreeCosmeticIds_);
            }

            this.onChanged();
         }

         if (this.ownedCosmeticsBuilder_ == null) {
            if (!var1.ownedCosmetics_.isEmpty()) {
               if (this.ownedCosmetics_.isEmpty()) {
                  this.ownedCosmetics_ = var1.ownedCosmetics_;
                  this.bitField0_ &= -33;
               } else {
                  this.ensureOwnedCosmeticsIsMutable();
                  this.ownedCosmetics_.addAll(var1.ownedCosmetics_);
               }

               this.onChanged();
            }
         } else if (!var1.ownedCosmetics_.isEmpty()) {
            if (this.ownedCosmeticsBuilder_.isEmpty()) {
               this.ownedCosmeticsBuilder_.dispose();
               this.ownedCosmeticsBuilder_ = null;
               this.ownedCosmetics_ = var1.ownedCosmetics_;
               this.bitField0_ &= -33;
               this.ownedCosmeticsBuilder_ = LoginResponse.alwaysUseFieldBuilders ? this.getOwnedCosmeticsFieldBuilder() : null;
            } else {
               this.ownedCosmeticsBuilder_.addAllMessages(var1.ownedCosmetics_);
            }
         }

         if (var1.getHasAllCosmeticsFlag()) {
            this.setHasAllCosmeticsFlag(var1.getHasAllCosmeticsFlag());
         }

         if (!var1.getRankName().isEmpty()) {
            this.rankName_ = var1.rankName_;
            this.bitField0_ |= 128;
            this.onChanged();
         }

         if (!var1.favoriteCosmeticIds_.isEmpty()) {
            if (this.favoriteCosmeticIds_.isEmpty()) {
               this.favoriteCosmeticIds_ = var1.favoriteCosmeticIds_;
               this.favoriteCosmeticIds_.makeImmutable();
               this.bitField0_ |= 256;
            } else {
               this.ensureFavoriteCosmeticIdsIsMutable();
               this.favoriteCosmeticIds_.addAll(var1.favoriteCosmeticIds_);
            }

            this.onChanged();
         }

         if (this.outfitsBuilder_ == null) {
            if (!var1.outfits_.isEmpty()) {
               if (this.outfits_.isEmpty()) {
                  this.outfits_ = var1.outfits_;
                  this.bitField0_ &= -513;
               } else {
                  this.ensureOutfitsIsMutable();
                  this.outfits_.addAll(var1.outfits_);
               }

               this.onChanged();
            }
         } else if (!var1.outfits_.isEmpty()) {
            if (this.outfitsBuilder_.isEmpty()) {
               this.outfitsBuilder_.dispose();
               this.outfitsBuilder_ = null;
               this.outfits_ = var1.outfits_;
               this.bitField0_ &= -513;
               this.outfitsBuilder_ = LoginResponse.alwaysUseFieldBuilders ? this.getOutfitsFieldBuilder() : null;
            } else {
               this.outfitsBuilder_.addAllMessages(var1.outfits_);
            }
         }

         if (var1.hasOutfitTree()) {
            this.mergeOutfitTree(var1.getOutfitTree());
         }

         if (var1.getArtistTools()) {
            this.setArtistTools(var1.getArtistTools());
         }

         if (var1.cosmeticOwnershipVisibility_ != 0) {
            this.setCosmeticOwnershipVisibilityValue(var1.getCosmeticOwnershipVisibilityValue());
         }

         if (var1.getTesterTools()) {
            this.setTesterTools(var1.getTesterTools());
         }

         if (!var1.discordRewards_.isEmpty()) {
            if (this.discordRewards_.isEmpty()) {
               this.discordRewards_ = var1.discordRewards_;
               this.discordRewards_.makeImmutable();
               this.bitField0_ |= 16384;
            } else {
               this.ensureDiscordRewardsIsMutable();
               this.discordRewards_.addAll(var1.discordRewards_);
            }

            this.onChanged();
         }

         if (!var1.discordTagRewards_.isEmpty()) {
            if (this.discordTagRewards_.isEmpty()) {
               this.discordTagRewards_ = var1.discordTagRewards_;
               this.discordTagRewards_.makeImmutable();
               this.bitField0_ |= 32768;
            } else {
               this.ensureDiscordTagRewardsIsMutable();
               this.discordTagRewards_.addAll(var1.discordTagRewards_);
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

      public LoginResponse.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     var1.readMessage(this.getLogoColorFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 1;
                     break;
                  case 16:
                     this.logoAlwaysShow_ = var1.readBool();
                     this.bitField0_ |= 2;
                     break;
                  case 26:
                     var1.readMessage(this.getPlusColorFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 4;
                     break;
                  case 34:
                     Color var21 = var1.readMessage(Color.parser(), var2);
                     if (this.availableLunarPlusColorsBuilder_ == null) {
                        this.ensureAvailableLunarPlusColorsIsMutable();
                        this.availableLunarPlusColors_.add(var21);
                     } else {
                        this.availableLunarPlusColorsBuilder_.addMessage(var21);
                     }
                     break;
                  case 40:
                     int var20 = var1.readInt32();
                     this.ensureLunarPlusFreeCosmeticIdsIsMutable();
                     this.lunarPlusFreeCosmeticIds_.addInt(var20);
                     break;
                  case 42:
                     int var19 = var1.readRawVarint32();
                     int var24 = var1.pushLimit(var19);
                     this.ensureLunarPlusFreeCosmeticIdsIsMutable();

                     while (var1.getBytesUntilLimit() > 0) {
                        this.lunarPlusFreeCosmeticIds_.addInt(var1.readInt32());
                     }

                     var1.popLimit(var24);
                     break;
                  case 50:
                     OwnedCosmetic var18 = var1.readMessage(OwnedCosmetic.parser(), var2);
                     if (this.ownedCosmeticsBuilder_ == null) {
                        this.ensureOwnedCosmeticsIsMutable();
                        this.ownedCosmetics_.add(var18);
                     } else {
                        this.ownedCosmeticsBuilder_.addMessage(var18);
                     }
                     break;
                  case 56:
                     this.hasAllCosmeticsFlag_ = var1.readBool();
                     this.bitField0_ |= 64;
                     break;
                  case 66:
                     this.rankName_ = var1.readStringRequireUtf8();
                     this.bitField0_ |= 128;
                     break;
                  case 72:
                     int var17 = var1.readInt32();
                     this.ensureFavoriteCosmeticIdsIsMutable();
                     this.favoriteCosmeticIds_.addInt(var17);
                     break;
                  case 74:
                     int var16 = var1.readRawVarint32();
                     int var23 = var1.pushLimit(var16);
                     this.ensureFavoriteCosmeticIdsIsMutable();

                     while (var1.getBytesUntilLimit() > 0) {
                        this.favoriteCosmeticIds_.addInt(var1.readInt32());
                     }

                     var1.popLimit(var23);
                     break;
                  case 82:
                     Outfit var15 = var1.readMessage(Outfit.parser(), var2);
                     if (this.outfitsBuilder_ == null) {
                        this.ensureOutfitsIsMutable();
                        this.outfits_.add(var15);
                     } else {
                        this.outfitsBuilder_.addMessage(var15);
                     }
                     break;
                  case 90:
                     var1.readMessage(this.getOutfitTreeFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 1024;
                     break;
                  case 96:
                     this.artistTools_ = var1.readBool();
                     this.bitField0_ |= 2048;
                     break;
                  case 104:
                     this.cosmeticOwnershipVisibility_ = var1.readEnum();
                     this.bitField0_ |= 4096;
                     break;
                  case 112:
                     this.testerTools_ = var1.readBool();
                     this.bitField0_ |= 8192;
                     break;
                  case 120:
                     int var14 = var1.readInt32();
                     this.ensureDiscordRewardsIsMutable();
                     this.discordRewards_.addInt(var14);
                     break;
                  case 122:
                     int var13 = var1.readRawVarint32();
                     int var22 = var1.pushLimit(var13);
                     this.ensureDiscordRewardsIsMutable();

                     while (var1.getBytesUntilLimit() > 0) {
                        this.discordRewards_.addInt(var1.readInt32());
                     }

                     var1.popLimit(var22);
                     break;
                  case 128:
                     int var12 = var1.readInt32();
                     this.ensureDiscordTagRewardsIsMutable();
                     this.discordTagRewards_.addInt(var12);
                     break;
                  case 130:
                     int var5 = var1.readRawVarint32();
                     int var6 = var1.pushLimit(var5);
                     this.ensureDiscordTagRewardsIsMutable();

                     while (var1.getBytesUntilLimit() > 0) {
                        this.discordTagRewards_.addInt(var1.readInt32());
                     }

                     var1.popLimit(var6);
                     break;
                  default:
                     if (!super.parseUnknownField(var1, var2, var4)) {
                        var3 = true;
                     }
               }
            }
         } catch (InvalidProtocolBufferException var10) {
            throw var10.unwrapIOException();
         } finally {
            this.onChanged();
         }

         return this;
      }

      @Override
      public boolean hasLogoColor() {
         return (this.bitField0_ & 1) != 0;
      }

      @Override
      public Color getLogoColor() {
         if (this.logoColorBuilder_ == null) {
            return this.logoColor_ == null ? Color.getDefaultInstance() : this.logoColor_;
         } else {
            return this.logoColorBuilder_.getMessage();
         }
      }

      public LoginResponse.Builder setLogoColor(Color var1) {
         if (this.logoColorBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.logoColor_ = var1;
         } else {
            this.logoColorBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public LoginResponse.Builder setLogoColor(Color.Builder var1) {
         if (this.logoColorBuilder_ == null) {
            this.logoColor_ = var1.build();
         } else {
            this.logoColorBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      public LoginResponse.Builder mergeLogoColor(Color var1) {
         if (this.logoColorBuilder_ == null) {
            if ((this.bitField0_ & 1) != 0 && this.logoColor_ != null && this.logoColor_ != Color.getDefaultInstance()) {
               this.getLogoColorBuilder().mergeFrom(var1);
            } else {
               this.logoColor_ = var1;
            }
         } else {
            this.logoColorBuilder_.mergeFrom(var1);
         }

         if (this.logoColor_ != null) {
            this.bitField0_ |= 1;
            this.onChanged();
         }

         return this;
      }

      public LoginResponse.Builder clearLogoColor() {
         this.bitField0_ &= -2;
         this.logoColor_ = null;
         if (this.logoColorBuilder_ != null) {
            this.logoColorBuilder_.dispose();
            this.logoColorBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public Color.Builder getLogoColorBuilder() {
         this.bitField0_ |= 1;
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
      public boolean getLogoAlwaysShow() {
         return this.logoAlwaysShow_;
      }

      public LoginResponse.Builder setLogoAlwaysShow(boolean var1) {
         this.logoAlwaysShow_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public LoginResponse.Builder clearLogoAlwaysShow() {
         this.bitField0_ &= -3;
         this.logoAlwaysShow_ = false;
         this.onChanged();
         return this;
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

      public LoginResponse.Builder setPlusColor(Color var1) {
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

      public LoginResponse.Builder setPlusColor(Color.Builder var1) {
         if (this.plusColorBuilder_ == null) {
            this.plusColor_ = var1.build();
         } else {
            this.plusColorBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public LoginResponse.Builder mergePlusColor(Color var1) {
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

      public LoginResponse.Builder clearPlusColor() {
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

      private void ensureAvailableLunarPlusColorsIsMutable() {
         if ((this.bitField0_ & 8) == 0) {
            this.availableLunarPlusColors_ = new ArrayList<>(this.availableLunarPlusColors_);
            this.bitField0_ |= 8;
         }
      }

      @Override
      public List<Color> getAvailableLunarPlusColorsList() {
         return this.availableLunarPlusColorsBuilder_ == null
            ? Collections.unmodifiableList(this.availableLunarPlusColors_)
            : this.availableLunarPlusColorsBuilder_.getMessageList();
      }

      @Override
      public int getAvailableLunarPlusColorsCount() {
         return this.availableLunarPlusColorsBuilder_ == null ? this.availableLunarPlusColors_.size() : this.availableLunarPlusColorsBuilder_.getCount();
      }

      @Override
      public Color getAvailableLunarPlusColors(int var1) {
         return this.availableLunarPlusColorsBuilder_ == null
            ? this.availableLunarPlusColors_.get(var1)
            : this.availableLunarPlusColorsBuilder_.getMessage(var1);
      }

      public LoginResponse.Builder setAvailableLunarPlusColors(int var1, Color var2) {
         if (this.availableLunarPlusColorsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureAvailableLunarPlusColorsIsMutable();
            this.availableLunarPlusColors_.set(var1, var2);
            this.onChanged();
         } else {
            this.availableLunarPlusColorsBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public LoginResponse.Builder setAvailableLunarPlusColors(int var1, Color.Builder var2) {
         if (this.availableLunarPlusColorsBuilder_ == null) {
            this.ensureAvailableLunarPlusColorsIsMutable();
            this.availableLunarPlusColors_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.availableLunarPlusColorsBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public LoginResponse.Builder addAvailableLunarPlusColors(Color var1) {
         if (this.availableLunarPlusColorsBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureAvailableLunarPlusColorsIsMutable();
            this.availableLunarPlusColors_.add(var1);
            this.onChanged();
         } else {
            this.availableLunarPlusColorsBuilder_.addMessage(var1);
         }

         return this;
      }

      public LoginResponse.Builder addAvailableLunarPlusColors(int var1, Color var2) {
         if (this.availableLunarPlusColorsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureAvailableLunarPlusColorsIsMutable();
            this.availableLunarPlusColors_.add(var1, var2);
            this.onChanged();
         } else {
            this.availableLunarPlusColorsBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public LoginResponse.Builder addAvailableLunarPlusColors(Color.Builder var1) {
         if (this.availableLunarPlusColorsBuilder_ == null) {
            this.ensureAvailableLunarPlusColorsIsMutable();
            this.availableLunarPlusColors_.add(var1.build());
            this.onChanged();
         } else {
            this.availableLunarPlusColorsBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public LoginResponse.Builder addAvailableLunarPlusColors(int var1, Color.Builder var2) {
         if (this.availableLunarPlusColorsBuilder_ == null) {
            this.ensureAvailableLunarPlusColorsIsMutable();
            this.availableLunarPlusColors_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.availableLunarPlusColorsBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public LoginResponse.Builder addAllAvailableLunarPlusColors(Iterable<? extends Color> var1) {
         if (this.availableLunarPlusColorsBuilder_ == null) {
            this.ensureAvailableLunarPlusColorsIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.availableLunarPlusColors_);
            this.onChanged();
         } else {
            this.availableLunarPlusColorsBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public LoginResponse.Builder clearAvailableLunarPlusColors() {
         if (this.availableLunarPlusColorsBuilder_ == null) {
            this.availableLunarPlusColors_ = Collections.emptyList();
            this.bitField0_ &= -9;
            this.onChanged();
         } else {
            this.availableLunarPlusColorsBuilder_.clear();
         }

         return this;
      }

      public LoginResponse.Builder removeAvailableLunarPlusColors(int var1) {
         if (this.availableLunarPlusColorsBuilder_ == null) {
            this.ensureAvailableLunarPlusColorsIsMutable();
            this.availableLunarPlusColors_.remove(var1);
            this.onChanged();
         } else {
            this.availableLunarPlusColorsBuilder_.remove(var1);
         }

         return this;
      }

      public Color.Builder getAvailableLunarPlusColorsBuilder(int var1) {
         return this.getAvailableLunarPlusColorsFieldBuilder().getBuilder(var1);
      }

      @Override
      public ColorOrBuilder getAvailableLunarPlusColorsOrBuilder(int var1) {
         return this.availableLunarPlusColorsBuilder_ == null
            ? this.availableLunarPlusColors_.get(var1)
            : this.availableLunarPlusColorsBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends ColorOrBuilder> getAvailableLunarPlusColorsOrBuilderList() {
         return this.availableLunarPlusColorsBuilder_ != null
            ? this.availableLunarPlusColorsBuilder_.getMessageOrBuilderList()
            : Collections.unmodifiableList(this.availableLunarPlusColors_);
      }

      public Color.Builder addAvailableLunarPlusColorsBuilder() {
         return this.getAvailableLunarPlusColorsFieldBuilder().addBuilder(Color.getDefaultInstance());
      }

      public Color.Builder addAvailableLunarPlusColorsBuilder(int var1) {
         return this.getAvailableLunarPlusColorsFieldBuilder().addBuilder(var1, Color.getDefaultInstance());
      }

      public List<Color.Builder> getAvailableLunarPlusColorsBuilderList() {
         return this.getAvailableLunarPlusColorsFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> getAvailableLunarPlusColorsFieldBuilder() {
         if (this.availableLunarPlusColorsBuilder_ == null) {
            this.availableLunarPlusColorsBuilder_ = new RepeatedFieldBuilderV3<>(
               this.availableLunarPlusColors_, (this.bitField0_ & 8) != 0, this.getParentForChildren(), this.isClean()
            );
            this.availableLunarPlusColors_ = null;
         }

         return this.availableLunarPlusColorsBuilder_;
      }

      private void ensureLunarPlusFreeCosmeticIdsIsMutable() {
         if (!this.lunarPlusFreeCosmeticIds_.isModifiable()) {
            this.lunarPlusFreeCosmeticIds_ = LoginResponse.makeMutableCopy(this.lunarPlusFreeCosmeticIds_);
         }

         this.bitField0_ |= 16;
      }

      @Override
      public List<Integer> getLunarPlusFreeCosmeticIdsList() {
         this.lunarPlusFreeCosmeticIds_.makeImmutable();
         return this.lunarPlusFreeCosmeticIds_;
      }

      @Override
      public int getLunarPlusFreeCosmeticIdsCount() {
         return this.lunarPlusFreeCosmeticIds_.size();
      }

      @Override
      public int getLunarPlusFreeCosmeticIds(int var1) {
         return this.lunarPlusFreeCosmeticIds_.getInt(var1);
      }

      public LoginResponse.Builder setLunarPlusFreeCosmeticIds(int var1, int var2) {
         this.ensureLunarPlusFreeCosmeticIdsIsMutable();
         this.lunarPlusFreeCosmeticIds_.setInt(var1, var2);
         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      public LoginResponse.Builder addLunarPlusFreeCosmeticIds(int var1) {
         this.ensureLunarPlusFreeCosmeticIdsIsMutable();
         this.lunarPlusFreeCosmeticIds_.addInt(var1);
         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      public LoginResponse.Builder addAllLunarPlusFreeCosmeticIds(Iterable<? extends Integer> var1) {
         this.ensureLunarPlusFreeCosmeticIdsIsMutable();
         AbstractMessageLite.Builder.addAll(var1, this.lunarPlusFreeCosmeticIds_);
         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      public LoginResponse.Builder clearLunarPlusFreeCosmeticIds() {
         this.lunarPlusFreeCosmeticIds_ = LoginResponse.emptyIntList();
         this.bitField0_ &= -17;
         this.onChanged();
         return this;
      }

      private void ensureOwnedCosmeticsIsMutable() {
         if ((this.bitField0_ & 32) == 0) {
            this.ownedCosmetics_ = new ArrayList<>(this.ownedCosmetics_);
            this.bitField0_ |= 32;
         }
      }

      @Override
      public List<OwnedCosmetic> getOwnedCosmeticsList() {
         return this.ownedCosmeticsBuilder_ == null ? Collections.unmodifiableList(this.ownedCosmetics_) : this.ownedCosmeticsBuilder_.getMessageList();
      }

      @Override
      public int getOwnedCosmeticsCount() {
         return this.ownedCosmeticsBuilder_ == null ? this.ownedCosmetics_.size() : this.ownedCosmeticsBuilder_.getCount();
      }

      @Override
      public OwnedCosmetic getOwnedCosmetics(int var1) {
         return this.ownedCosmeticsBuilder_ == null ? this.ownedCosmetics_.get(var1) : this.ownedCosmeticsBuilder_.getMessage(var1);
      }

      public LoginResponse.Builder setOwnedCosmetics(int var1, OwnedCosmetic var2) {
         if (this.ownedCosmeticsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureOwnedCosmeticsIsMutable();
            this.ownedCosmetics_.set(var1, var2);
            this.onChanged();
         } else {
            this.ownedCosmeticsBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public LoginResponse.Builder setOwnedCosmetics(int var1, OwnedCosmetic.Builder var2) {
         if (this.ownedCosmeticsBuilder_ == null) {
            this.ensureOwnedCosmeticsIsMutable();
            this.ownedCosmetics_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.ownedCosmeticsBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public LoginResponse.Builder addOwnedCosmetics(OwnedCosmetic var1) {
         if (this.ownedCosmeticsBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureOwnedCosmeticsIsMutable();
            this.ownedCosmetics_.add(var1);
            this.onChanged();
         } else {
            this.ownedCosmeticsBuilder_.addMessage(var1);
         }

         return this;
      }

      public LoginResponse.Builder addOwnedCosmetics(int var1, OwnedCosmetic var2) {
         if (this.ownedCosmeticsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureOwnedCosmeticsIsMutable();
            this.ownedCosmetics_.add(var1, var2);
            this.onChanged();
         } else {
            this.ownedCosmeticsBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public LoginResponse.Builder addOwnedCosmetics(OwnedCosmetic.Builder var1) {
         if (this.ownedCosmeticsBuilder_ == null) {
            this.ensureOwnedCosmeticsIsMutable();
            this.ownedCosmetics_.add(var1.build());
            this.onChanged();
         } else {
            this.ownedCosmeticsBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public LoginResponse.Builder addOwnedCosmetics(int var1, OwnedCosmetic.Builder var2) {
         if (this.ownedCosmeticsBuilder_ == null) {
            this.ensureOwnedCosmeticsIsMutable();
            this.ownedCosmetics_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.ownedCosmeticsBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public LoginResponse.Builder addAllOwnedCosmetics(Iterable<? extends OwnedCosmetic> var1) {
         if (this.ownedCosmeticsBuilder_ == null) {
            this.ensureOwnedCosmeticsIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.ownedCosmetics_);
            this.onChanged();
         } else {
            this.ownedCosmeticsBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public LoginResponse.Builder clearOwnedCosmetics() {
         if (this.ownedCosmeticsBuilder_ == null) {
            this.ownedCosmetics_ = Collections.emptyList();
            this.bitField0_ &= -33;
            this.onChanged();
         } else {
            this.ownedCosmeticsBuilder_.clear();
         }

         return this;
      }

      public LoginResponse.Builder removeOwnedCosmetics(int var1) {
         if (this.ownedCosmeticsBuilder_ == null) {
            this.ensureOwnedCosmeticsIsMutable();
            this.ownedCosmetics_.remove(var1);
            this.onChanged();
         } else {
            this.ownedCosmeticsBuilder_.remove(var1);
         }

         return this;
      }

      public OwnedCosmetic.Builder getOwnedCosmeticsBuilder(int var1) {
         return this.getOwnedCosmeticsFieldBuilder().getBuilder(var1);
      }

      @Override
      public OwnedCosmeticOrBuilder getOwnedCosmeticsOrBuilder(int var1) {
         return this.ownedCosmeticsBuilder_ == null ? this.ownedCosmetics_.get(var1) : this.ownedCosmeticsBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends OwnedCosmeticOrBuilder> getOwnedCosmeticsOrBuilderList() {
         return this.ownedCosmeticsBuilder_ != null
            ? this.ownedCosmeticsBuilder_.getMessageOrBuilderList()
            : Collections.unmodifiableList(this.ownedCosmetics_);
      }

      public OwnedCosmetic.Builder addOwnedCosmeticsBuilder() {
         return this.getOwnedCosmeticsFieldBuilder().addBuilder(OwnedCosmetic.getDefaultInstance());
      }

      public OwnedCosmetic.Builder addOwnedCosmeticsBuilder(int var1) {
         return this.getOwnedCosmeticsFieldBuilder().addBuilder(var1, OwnedCosmetic.getDefaultInstance());
      }

      public List<OwnedCosmetic.Builder> getOwnedCosmeticsBuilderList() {
         return this.getOwnedCosmeticsFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<OwnedCosmetic, OwnedCosmetic.Builder, OwnedCosmeticOrBuilder> getOwnedCosmeticsFieldBuilder() {
         if (this.ownedCosmeticsBuilder_ == null) {
            this.ownedCosmeticsBuilder_ = new RepeatedFieldBuilderV3<>(
               this.ownedCosmetics_, (this.bitField0_ & 32) != 0, this.getParentForChildren(), this.isClean()
            );
            this.ownedCosmetics_ = null;
         }

         return this.ownedCosmeticsBuilder_;
      }

      @Override
      public boolean getHasAllCosmeticsFlag() {
         return this.hasAllCosmeticsFlag_;
      }

      public LoginResponse.Builder setHasAllCosmeticsFlag(boolean var1) {
         this.hasAllCosmeticsFlag_ = var1;
         this.bitField0_ |= 64;
         this.onChanged();
         return this;
      }

      public LoginResponse.Builder clearHasAllCosmeticsFlag() {
         this.bitField0_ &= -65;
         this.hasAllCosmeticsFlag_ = false;
         this.onChanged();
         return this;
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

      public LoginResponse.Builder setRankName(String var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.rankName_ = var1;
         this.bitField0_ |= 128;
         this.onChanged();
         return this;
      }

      public LoginResponse.Builder clearRankName() {
         this.rankName_ = LoginResponse.getDefaultInstance().getRankName();
         this.bitField0_ &= -129;
         this.onChanged();
         return this;
      }

      public LoginResponse.Builder setRankNameBytes(ByteString var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         LoginResponse.checkByteStringIsUtf8(var1);
         this.rankName_ = var1;
         this.bitField0_ |= 128;
         this.onChanged();
         return this;
      }

      private void ensureFavoriteCosmeticIdsIsMutable() {
         if (!this.favoriteCosmeticIds_.isModifiable()) {
            this.favoriteCosmeticIds_ = LoginResponse.makeMutableCopy(this.favoriteCosmeticIds_);
         }

         this.bitField0_ |= 256;
      }

      @Override
      public List<Integer> getFavoriteCosmeticIdsList() {
         this.favoriteCosmeticIds_.makeImmutable();
         return this.favoriteCosmeticIds_;
      }

      @Override
      public int getFavoriteCosmeticIdsCount() {
         return this.favoriteCosmeticIds_.size();
      }

      @Override
      public int getFavoriteCosmeticIds(int var1) {
         return this.favoriteCosmeticIds_.getInt(var1);
      }

      public LoginResponse.Builder setFavoriteCosmeticIds(int var1, int var2) {
         this.ensureFavoriteCosmeticIdsIsMutable();
         this.favoriteCosmeticIds_.setInt(var1, var2);
         this.bitField0_ |= 256;
         this.onChanged();
         return this;
      }

      public LoginResponse.Builder addFavoriteCosmeticIds(int var1) {
         this.ensureFavoriteCosmeticIdsIsMutable();
         this.favoriteCosmeticIds_.addInt(var1);
         this.bitField0_ |= 256;
         this.onChanged();
         return this;
      }

      public LoginResponse.Builder addAllFavoriteCosmeticIds(Iterable<? extends Integer> var1) {
         this.ensureFavoriteCosmeticIdsIsMutable();
         AbstractMessageLite.Builder.addAll(var1, this.favoriteCosmeticIds_);
         this.bitField0_ |= 256;
         this.onChanged();
         return this;
      }

      public LoginResponse.Builder clearFavoriteCosmeticIds() {
         this.favoriteCosmeticIds_ = LoginResponse.emptyIntList();
         this.bitField0_ &= -257;
         this.onChanged();
         return this;
      }

      private void ensureOutfitsIsMutable() {
         if ((this.bitField0_ & 512) == 0) {
            this.outfits_ = new ArrayList<>(this.outfits_);
            this.bitField0_ |= 512;
         }
      }

      @Override
      public List<Outfit> getOutfitsList() {
         return this.outfitsBuilder_ == null ? Collections.unmodifiableList(this.outfits_) : this.outfitsBuilder_.getMessageList();
      }

      @Override
      public int getOutfitsCount() {
         return this.outfitsBuilder_ == null ? this.outfits_.size() : this.outfitsBuilder_.getCount();
      }

      @Override
      public Outfit getOutfits(int var1) {
         return this.outfitsBuilder_ == null ? this.outfits_.get(var1) : this.outfitsBuilder_.getMessage(var1);
      }

      public LoginResponse.Builder setOutfits(int var1, Outfit var2) {
         if (this.outfitsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureOutfitsIsMutable();
            this.outfits_.set(var1, var2);
            this.onChanged();
         } else {
            this.outfitsBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public LoginResponse.Builder setOutfits(int var1, Outfit.Builder var2) {
         if (this.outfitsBuilder_ == null) {
            this.ensureOutfitsIsMutable();
            this.outfits_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.outfitsBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public LoginResponse.Builder addOutfits(Outfit var1) {
         if (this.outfitsBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureOutfitsIsMutable();
            this.outfits_.add(var1);
            this.onChanged();
         } else {
            this.outfitsBuilder_.addMessage(var1);
         }

         return this;
      }

      public LoginResponse.Builder addOutfits(int var1, Outfit var2) {
         if (this.outfitsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureOutfitsIsMutable();
            this.outfits_.add(var1, var2);
            this.onChanged();
         } else {
            this.outfitsBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public LoginResponse.Builder addOutfits(Outfit.Builder var1) {
         if (this.outfitsBuilder_ == null) {
            this.ensureOutfitsIsMutable();
            this.outfits_.add(var1.build());
            this.onChanged();
         } else {
            this.outfitsBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public LoginResponse.Builder addOutfits(int var1, Outfit.Builder var2) {
         if (this.outfitsBuilder_ == null) {
            this.ensureOutfitsIsMutable();
            this.outfits_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.outfitsBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public LoginResponse.Builder addAllOutfits(Iterable<? extends Outfit> var1) {
         if (this.outfitsBuilder_ == null) {
            this.ensureOutfitsIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.outfits_);
            this.onChanged();
         } else {
            this.outfitsBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public LoginResponse.Builder clearOutfits() {
         if (this.outfitsBuilder_ == null) {
            this.outfits_ = Collections.emptyList();
            this.bitField0_ &= -513;
            this.onChanged();
         } else {
            this.outfitsBuilder_.clear();
         }

         return this;
      }

      public LoginResponse.Builder removeOutfits(int var1) {
         if (this.outfitsBuilder_ == null) {
            this.ensureOutfitsIsMutable();
            this.outfits_.remove(var1);
            this.onChanged();
         } else {
            this.outfitsBuilder_.remove(var1);
         }

         return this;
      }

      public Outfit.Builder getOutfitsBuilder(int var1) {
         return this.getOutfitsFieldBuilder().getBuilder(var1);
      }

      @Override
      public OutfitOrBuilder getOutfitsOrBuilder(int var1) {
         return this.outfitsBuilder_ == null ? this.outfits_.get(var1) : this.outfitsBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends OutfitOrBuilder> getOutfitsOrBuilderList() {
         return this.outfitsBuilder_ != null ? this.outfitsBuilder_.getMessageOrBuilderList() : Collections.unmodifiableList(this.outfits_);
      }

      public Outfit.Builder addOutfitsBuilder() {
         return this.getOutfitsFieldBuilder().addBuilder(Outfit.getDefaultInstance());
      }

      public Outfit.Builder addOutfitsBuilder(int var1) {
         return this.getOutfitsFieldBuilder().addBuilder(var1, Outfit.getDefaultInstance());
      }

      public List<Outfit.Builder> getOutfitsBuilderList() {
         return this.getOutfitsFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<Outfit, Outfit.Builder, OutfitOrBuilder> getOutfitsFieldBuilder() {
         if (this.outfitsBuilder_ == null) {
            this.outfitsBuilder_ = new RepeatedFieldBuilderV3<>(this.outfits_, (this.bitField0_ & 512) != 0, this.getParentForChildren(), this.isClean());
            this.outfits_ = null;
         }

         return this.outfitsBuilder_;
      }

      @Override
      public boolean hasOutfitTree() {
         return (this.bitField0_ & 1024) != 0;
      }

      @Override
      public OutfitTree getOutfitTree() {
         if (this.outfitTreeBuilder_ == null) {
            return this.outfitTree_ == null ? OutfitTree.getDefaultInstance() : this.outfitTree_;
         } else {
            return this.outfitTreeBuilder_.getMessage();
         }
      }

      public LoginResponse.Builder setOutfitTree(OutfitTree var1) {
         if (this.outfitTreeBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.outfitTree_ = var1;
         } else {
            this.outfitTreeBuilder_.setMessage(var1);
         }

         this.bitField0_ |= 1024;
         this.onChanged();
         return this;
      }

      public LoginResponse.Builder setOutfitTree(OutfitTree.Builder var1) {
         if (this.outfitTreeBuilder_ == null) {
            this.outfitTree_ = var1.build();
         } else {
            this.outfitTreeBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 1024;
         this.onChanged();
         return this;
      }

      public LoginResponse.Builder mergeOutfitTree(OutfitTree var1) {
         if (this.outfitTreeBuilder_ == null) {
            if ((this.bitField0_ & 1024) != 0 && this.outfitTree_ != null && this.outfitTree_ != OutfitTree.getDefaultInstance()) {
               this.getOutfitTreeBuilder().mergeFrom(var1);
            } else {
               this.outfitTree_ = var1;
            }
         } else {
            this.outfitTreeBuilder_.mergeFrom(var1);
         }

         if (this.outfitTree_ != null) {
            this.bitField0_ |= 1024;
            this.onChanged();
         }

         return this;
      }

      public LoginResponse.Builder clearOutfitTree() {
         this.bitField0_ &= -1025;
         this.outfitTree_ = null;
         if (this.outfitTreeBuilder_ != null) {
            this.outfitTreeBuilder_.dispose();
            this.outfitTreeBuilder_ = null;
         }

         this.onChanged();
         return this;
      }

      public OutfitTree.Builder getOutfitTreeBuilder() {
         this.bitField0_ |= 1024;
         this.onChanged();
         return this.getOutfitTreeFieldBuilder().getBuilder();
      }

      @Override
      public OutfitTreeOrBuilder getOutfitTreeOrBuilder() {
         if (this.outfitTreeBuilder_ != null) {
            return this.outfitTreeBuilder_.getMessageOrBuilder();
         } else {
            return this.outfitTree_ == null ? OutfitTree.getDefaultInstance() : this.outfitTree_;
         }
      }

      private SingleFieldBuilderV3<OutfitTree, OutfitTree.Builder, OutfitTreeOrBuilder> getOutfitTreeFieldBuilder() {
         if (this.outfitTreeBuilder_ == null) {
            this.outfitTreeBuilder_ = new SingleFieldBuilderV3<>(this.getOutfitTree(), this.getParentForChildren(), this.isClean());
            this.outfitTree_ = null;
         }

         return this.outfitTreeBuilder_;
      }

      @Override
      public boolean getArtistTools() {
         return this.artistTools_;
      }

      public LoginResponse.Builder setArtistTools(boolean var1) {
         this.artistTools_ = var1;
         this.bitField0_ |= 2048;
         this.onChanged();
         return this;
      }

      public LoginResponse.Builder clearArtistTools() {
         this.bitField0_ &= -2049;
         this.artistTools_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public int getCosmeticOwnershipVisibilityValue() {
         return this.cosmeticOwnershipVisibility_;
      }

      public LoginResponse.Builder setCosmeticOwnershipVisibilityValue(int var1) {
         this.cosmeticOwnershipVisibility_ = var1;
         this.bitField0_ |= 4096;
         this.onChanged();
         return this;
      }

      @Override
      public CosmeticOwnershipVisibility getCosmeticOwnershipVisibility() {
         CosmeticOwnershipVisibility var1 = CosmeticOwnershipVisibility.forNumber(this.cosmeticOwnershipVisibility_);
         return var1 == null ? CosmeticOwnershipVisibility.UNRECOGNIZED : var1;
      }

      public LoginResponse.Builder setCosmeticOwnershipVisibility(CosmeticOwnershipVisibility var1) {
         if (var1 == null) {
            throw new NullPointerException();
         }

         this.bitField0_ |= 4096;
         this.cosmeticOwnershipVisibility_ = var1.getNumber();
         this.onChanged();
         return this;
      }

      public LoginResponse.Builder clearCosmeticOwnershipVisibility() {
         this.bitField0_ &= -4097;
         this.cosmeticOwnershipVisibility_ = 0;
         this.onChanged();
         return this;
      }

      @Override
      public boolean getTesterTools() {
         return this.testerTools_;
      }

      public LoginResponse.Builder setTesterTools(boolean var1) {
         this.testerTools_ = var1;
         this.bitField0_ |= 8192;
         this.onChanged();
         return this;
      }

      public LoginResponse.Builder clearTesterTools() {
         this.bitField0_ &= -8193;
         this.testerTools_ = false;
         this.onChanged();
         return this;
      }

      private void ensureDiscordRewardsIsMutable() {
         if (!this.discordRewards_.isModifiable()) {
            this.discordRewards_ = LoginResponse.makeMutableCopy(this.discordRewards_);
         }

         this.bitField0_ |= 16384;
      }

      @Override
      public List<Integer> getDiscordRewardsList() {
         this.discordRewards_.makeImmutable();
         return this.discordRewards_;
      }

      @Override
      public int getDiscordRewardsCount() {
         return this.discordRewards_.size();
      }

      @Override
      public int getDiscordRewards(int var1) {
         return this.discordRewards_.getInt(var1);
      }

      public LoginResponse.Builder setDiscordRewards(int var1, int var2) {
         this.ensureDiscordRewardsIsMutable();
         this.discordRewards_.setInt(var1, var2);
         this.bitField0_ |= 16384;
         this.onChanged();
         return this;
      }

      public LoginResponse.Builder addDiscordRewards(int var1) {
         this.ensureDiscordRewardsIsMutable();
         this.discordRewards_.addInt(var1);
         this.bitField0_ |= 16384;
         this.onChanged();
         return this;
      }

      public LoginResponse.Builder addAllDiscordRewards(Iterable<? extends Integer> var1) {
         this.ensureDiscordRewardsIsMutable();
         AbstractMessageLite.Builder.addAll(var1, this.discordRewards_);
         this.bitField0_ |= 16384;
         this.onChanged();
         return this;
      }

      public LoginResponse.Builder clearDiscordRewards() {
         this.discordRewards_ = LoginResponse.emptyIntList();
         this.bitField0_ &= -16385;
         this.onChanged();
         return this;
      }

      private void ensureDiscordTagRewardsIsMutable() {
         if (!this.discordTagRewards_.isModifiable()) {
            this.discordTagRewards_ = LoginResponse.makeMutableCopy(this.discordTagRewards_);
         }

         this.bitField0_ |= 32768;
      }

      @Override
      public List<Integer> getDiscordTagRewardsList() {
         this.discordTagRewards_.makeImmutable();
         return this.discordTagRewards_;
      }

      @Override
      public int getDiscordTagRewardsCount() {
         return this.discordTagRewards_.size();
      }

      @Override
      public int getDiscordTagRewards(int var1) {
         return this.discordTagRewards_.getInt(var1);
      }

      public LoginResponse.Builder setDiscordTagRewards(int var1, int var2) {
         this.ensureDiscordTagRewardsIsMutable();
         this.discordTagRewards_.setInt(var1, var2);
         this.bitField0_ |= 32768;
         this.onChanged();
         return this;
      }

      public LoginResponse.Builder addDiscordTagRewards(int var1) {
         this.ensureDiscordTagRewardsIsMutable();
         this.discordTagRewards_.addInt(var1);
         this.bitField0_ |= 32768;
         this.onChanged();
         return this;
      }

      public LoginResponse.Builder addAllDiscordTagRewards(Iterable<? extends Integer> var1) {
         this.ensureDiscordTagRewardsIsMutable();
         AbstractMessageLite.Builder.addAll(var1, this.discordTagRewards_);
         this.bitField0_ |= 32768;
         this.onChanged();
         return this;
      }

      public LoginResponse.Builder clearDiscordTagRewards() {
         this.discordTagRewards_ = LoginResponse.emptyIntList();
         this.bitField0_ &= -32769;
         this.onChanged();
         return this;
      }

      public final LoginResponse.Builder setUnknownFields(UnknownFieldSet var1) {
         return (LoginResponse.Builder)super.setUnknownFields(var1);
      }

      public final LoginResponse.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (LoginResponse.Builder)super.mergeUnknownFields(var1);
      }
   }
}
