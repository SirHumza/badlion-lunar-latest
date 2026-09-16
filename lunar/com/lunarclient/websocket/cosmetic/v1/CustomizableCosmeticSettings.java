package com.lunarclient.websocket.cosmetic.v1;

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
import com.google.protobuf.MapEntry;
import com.google.protobuf.MapField;
import com.google.protobuf.MapFieldReflectionAccessor;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import com.google.protobuf.WireFormat;
import com.lunarclient.common.v1.Color;
import com.lunarclient.common.v1.ColorOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public final class CustomizableCosmeticSettings extends GeneratedMessageV3 implements CustomizableCosmeticSettingsOrBuilder {
   private static final long serialVersionUID = 0L;
   private int bitField0_;
   public static final int ACTIVE_COSMETIC_IDS_FIELD_NUMBER = 1;
   private Internal.IntList activeCosmeticIds_ = emptyIntList();
   private int activeCosmeticIdsMemoizedSerializedSize = -1;
   public static final int CLOTH_CLOAK_FIELD_NUMBER = 2;
   private boolean clothCloak_ = false;
   public static final int PLUS_COLOR_FIELD_NUMBER = 3;
   private Color plusColor_;
   public static final int SHOW_HATS_OVER_HELMET_FIELD_NUMBER = 4;
   private boolean showHatsOverHelmet_ = false;
   public static final int SHOW_HATS_OVER_SKIN_LAYER_FIELD_NUMBER = 5;
   private boolean showHatsOverSkinLayer_ = false;
   public static final int SHOW_OVER_CHESTPLATE_FIELD_NUMBER = 6;
   private boolean showOverChestplate_ = false;
   public static final int SHOW_OVER_LEGGINGS_FIELD_NUMBER = 7;
   private boolean showOverLeggings_ = false;
   public static final int SHOW_OVER_BOOTS_FIELD_NUMBER = 8;
   private boolean showOverBoots_ = false;
   public static final int HAT_HEIGHT_OFFSET_FIELD_NUMBER = 9;
   private MapField<Integer, Float> hatHeightOffset_;
   public static final int FLIP_SHOULDER_PET_FIELD_NUMBER = 10;
   private boolean flipShoulderPet_ = false;
   public static final int EQUIPPED_COSMETICS_FIELD_NUMBER = 11;
   private List<EquippedCosmetic> equippedCosmetics_;
   private byte memoizedIsInitialized = -1;
   private static final CustomizableCosmeticSettings DEFAULT_INSTANCE = new CustomizableCosmeticSettings();
   private static final Parser<CustomizableCosmeticSettings> PARSER = new AbstractParser<CustomizableCosmeticSettings>() {
      public CustomizableCosmeticSettings parsePartialFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
         CustomizableCosmeticSettings.Builder var3 = CustomizableCosmeticSettings.newBuilder();

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

   private CustomizableCosmeticSettings(GeneratedMessageV3.Builder<?> var1) {
      super(var1);
   }

   private CustomizableCosmeticSettings() {
      this.activeCosmeticIds_ = emptyIntList();
      this.equippedCosmetics_ = Collections.emptyList();
   }

   @Override
   protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter var1) {
      return new CustomizableCosmeticSettings();
   }

   public static final Descriptors.Descriptor getDescriptor() {
      return CommonProto.internal_static_lunarclient_websocket_cosmetic_v1_CustomizableCosmeticSettings_descriptor;
   }

   @Override
   protected MapFieldReflectionAccessor internalGetMapFieldReflection(int var1) {
      switch (var1) {
         case 9:
            return this.internalGetHatHeightOffset();
         default:
            throw new RuntimeException("Invalid map field number: " + var1);
      }
   }

   @Override
   protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
      return CommonProto.internal_static_lunarclient_websocket_cosmetic_v1_CustomizableCosmeticSettings_fieldAccessorTable
         .ensureFieldAccessorsInitialized(CustomizableCosmeticSettings.class, CustomizableCosmeticSettings.Builder.class);
   }

   @Deprecated
   @Override
   public List<Integer> getActiveCosmeticIdsList() {
      return this.activeCosmeticIds_;
   }

   @Deprecated
   @Override
   public int getActiveCosmeticIdsCount() {
      return this.activeCosmeticIds_.size();
   }

   @Deprecated
   @Override
   public int getActiveCosmeticIds(int var1) {
      return this.activeCosmeticIds_.getInt(var1);
   }

   @Override
   public boolean getClothCloak() {
      return this.clothCloak_;
   }

   @Override
   public boolean hasPlusColor() {
      return (this.bitField0_ & 1) != 0;
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
   public boolean getShowHatsOverHelmet() {
      return this.showHatsOverHelmet_;
   }

   @Override
   public boolean getShowHatsOverSkinLayer() {
      return this.showHatsOverSkinLayer_;
   }

   @Override
   public boolean getShowOverChestplate() {
      return this.showOverChestplate_;
   }

   @Override
   public boolean getShowOverLeggings() {
      return this.showOverLeggings_;
   }

   @Override
   public boolean getShowOverBoots() {
      return this.showOverBoots_;
   }

   private MapField<Integer, Float> internalGetHatHeightOffset() {
      return this.hatHeightOffset_ == null
         ? MapField.emptyMapField(CustomizableCosmeticSettings.HatHeightOffsetDefaultEntryHolder.defaultEntry)
         : this.hatHeightOffset_;
   }

   @Override
   public int getHatHeightOffsetCount() {
      return this.internalGetHatHeightOffset().getMap().size();
   }

   @Override
   public boolean containsHatHeightOffset(int var1) {
      return this.internalGetHatHeightOffset().getMap().containsKey(var1);
   }

   @Deprecated
   @Override
   public Map<Integer, Float> getHatHeightOffset() {
      return this.getHatHeightOffsetMap();
   }

   @Override
   public Map<Integer, Float> getHatHeightOffsetMap() {
      return this.internalGetHatHeightOffset().getMap();
   }

   @Override
   public float getHatHeightOffsetOrDefault(int var1, float var2) {
      Map var3 = this.internalGetHatHeightOffset().getMap();
      return var3.containsKey(var1) ? (Float)var3.get(var1) : var2;
   }

   @Override
   public float getHatHeightOffsetOrThrow(int var1) {
      Map var2 = this.internalGetHatHeightOffset().getMap();
      if (!var2.containsKey(var1)) {
         throw new IllegalArgumentException();
      } else {
         return (Float)var2.get(var1);
      }
   }

   @Override
   public boolean getFlipShoulderPet() {
      return this.flipShoulderPet_;
   }

   @Override
   public List<EquippedCosmetic> getEquippedCosmeticsList() {
      return this.equippedCosmetics_;
   }

   @Override
   public List<? extends EquippedCosmeticOrBuilder> getEquippedCosmeticsOrBuilderList() {
      return this.equippedCosmetics_;
   }

   @Override
   public int getEquippedCosmeticsCount() {
      return this.equippedCosmetics_.size();
   }

   @Override
   public EquippedCosmetic getEquippedCosmetics(int var1) {
      return this.equippedCosmetics_.get(var1);
   }

   @Override
   public EquippedCosmeticOrBuilder getEquippedCosmeticsOrBuilder(int var1) {
      return this.equippedCosmetics_.get(var1);
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
      if (this.getActiveCosmeticIdsList().size() > 0) {
         var1.writeUInt32NoTag(10);
         var1.writeUInt32NoTag(this.activeCosmeticIdsMemoizedSerializedSize);
      }

      for (int var2 = 0; var2 < this.activeCosmeticIds_.size(); var2++) {
         var1.writeInt32NoTag(this.activeCosmeticIds_.getInt(var2));
      }

      if (this.clothCloak_) {
         var1.writeBool(2, this.clothCloak_);
      }

      if ((this.bitField0_ & 1) != 0) {
         var1.writeMessage(3, this.getPlusColor());
      }

      if (this.showHatsOverHelmet_) {
         var1.writeBool(4, this.showHatsOverHelmet_);
      }

      if (this.showHatsOverSkinLayer_) {
         var1.writeBool(5, this.showHatsOverSkinLayer_);
      }

      if (this.showOverChestplate_) {
         var1.writeBool(6, this.showOverChestplate_);
      }

      if (this.showOverLeggings_) {
         var1.writeBool(7, this.showOverLeggings_);
      }

      if (this.showOverBoots_) {
         var1.writeBool(8, this.showOverBoots_);
      }

      GeneratedMessageV3.serializeIntegerMapTo(
         var1, this.internalGetHatHeightOffset(), CustomizableCosmeticSettings.HatHeightOffsetDefaultEntryHolder.defaultEntry, 9
      );
      if (this.flipShoulderPet_) {
         var1.writeBool(10, this.flipShoulderPet_);
      }

      for (int var3 = 0; var3 < this.equippedCosmetics_.size(); var3++) {
         var1.writeMessage(11, this.equippedCosmetics_.get(var3));
      }

      this.getUnknownFields().writeTo(var1);
   }

   @Override
   public int getSerializedSize() {
      int var1 = this.memoizedSize;
      if (var1 != -1) {
         return var1;
      }

      int var5 = 0;
      int var2 = 0;

      for (int var3 = 0; var3 < this.activeCosmeticIds_.size(); var3++) {
         var2 += CodedOutputStream.computeInt32SizeNoTag(this.activeCosmeticIds_.getInt(var3));
      }

      var5 += var2;
      if (!this.getActiveCosmeticIdsList().isEmpty()) {
         var5 = ++var5 + CodedOutputStream.computeInt32SizeNoTag(var2);
      }

      this.activeCosmeticIdsMemoizedSerializedSize = var2;
      if (this.clothCloak_) {
         var5 += CodedOutputStream.computeBoolSize(2, this.clothCloak_);
      }

      if ((this.bitField0_ & 1) != 0) {
         var5 += CodedOutputStream.computeMessageSize(3, this.getPlusColor());
      }

      if (this.showHatsOverHelmet_) {
         var5 += CodedOutputStream.computeBoolSize(4, this.showHatsOverHelmet_);
      }

      if (this.showHatsOverSkinLayer_) {
         var5 += CodedOutputStream.computeBoolSize(5, this.showHatsOverSkinLayer_);
      }

      if (this.showOverChestplate_) {
         var5 += CodedOutputStream.computeBoolSize(6, this.showOverChestplate_);
      }

      if (this.showOverLeggings_) {
         var5 += CodedOutputStream.computeBoolSize(7, this.showOverLeggings_);
      }

      if (this.showOverBoots_) {
         var5 += CodedOutputStream.computeBoolSize(8, this.showOverBoots_);
      }

      for (Entry var11 : this.internalGetHatHeightOffset().getMap().entrySet()) {
         MapEntry var4 = CustomizableCosmeticSettings.HatHeightOffsetDefaultEntryHolder.defaultEntry
            .newBuilderForType()
            .setKey((Integer)var11.getKey())
            .setValue((Float)var11.getValue())
            .build();
         var5 += CodedOutputStream.computeMessageSize(9, var4);
      }

      if (this.flipShoulderPet_) {
         var5 += CodedOutputStream.computeBoolSize(10, this.flipShoulderPet_);
      }

      for (int var10 = 0; var10 < this.equippedCosmetics_.size(); var10++) {
         var5 += CodedOutputStream.computeMessageSize(11, this.equippedCosmetics_.get(var10));
      }

      var5 += this.getUnknownFields().getSerializedSize();
      this.memoizedSize = var5;
      return var5;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof CustomizableCosmeticSettings)) {
         return super.equals(var1);
      } else {
         CustomizableCosmeticSettings var2 = (CustomizableCosmeticSettings)var1;
         if (!this.getActiveCosmeticIdsList().equals(var2.getActiveCosmeticIdsList())) {
            return false;
         } else if (this.getClothCloak() != var2.getClothCloak()) {
            return false;
         } else if (this.hasPlusColor() != var2.hasPlusColor()) {
            return false;
         } else if (this.hasPlusColor() && !this.getPlusColor().equals(var2.getPlusColor())) {
            return false;
         } else if (this.getShowHatsOverHelmet() != var2.getShowHatsOverHelmet()) {
            return false;
         } else if (this.getShowHatsOverSkinLayer() != var2.getShowHatsOverSkinLayer()) {
            return false;
         } else if (this.getShowOverChestplate() != var2.getShowOverChestplate()) {
            return false;
         } else if (this.getShowOverLeggings() != var2.getShowOverLeggings()) {
            return false;
         } else if (this.getShowOverBoots() != var2.getShowOverBoots()) {
            return false;
         } else if (!this.internalGetHatHeightOffset().equals(var2.internalGetHatHeightOffset())) {
            return false;
         } else if (this.getFlipShoulderPet() != var2.getFlipShoulderPet()) {
            return false;
         } else {
            return !this.getEquippedCosmeticsList().equals(var2.getEquippedCosmeticsList()) ? false : this.getUnknownFields().equals(var2.getUnknownFields());
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
      if (this.getActiveCosmeticIdsCount() > 0) {
         var1 = 37 * var1 + 1;
         var1 = 53 * var1 + this.getActiveCosmeticIdsList().hashCode();
      }

      var1 = 37 * var1 + 2;
      var1 = 53 * var1 + Internal.hashBoolean(this.getClothCloak());
      if (this.hasPlusColor()) {
         var1 = 37 * var1 + 3;
         var1 = 53 * var1 + this.getPlusColor().hashCode();
      }

      var1 = 37 * var1 + 4;
      var1 = 53 * var1 + Internal.hashBoolean(this.getShowHatsOverHelmet());
      var1 = 37 * var1 + 5;
      var1 = 53 * var1 + Internal.hashBoolean(this.getShowHatsOverSkinLayer());
      var1 = 37 * var1 + 6;
      var1 = 53 * var1 + Internal.hashBoolean(this.getShowOverChestplate());
      var1 = 37 * var1 + 7;
      var1 = 53 * var1 + Internal.hashBoolean(this.getShowOverLeggings());
      var1 = 37 * var1 + 8;
      var1 = 53 * var1 + Internal.hashBoolean(this.getShowOverBoots());
      if (!this.internalGetHatHeightOffset().getMap().isEmpty()) {
         var1 = 37 * var1 + 9;
         var1 = 53 * var1 + this.internalGetHatHeightOffset().hashCode();
      }

      var1 = 37 * var1 + 10;
      var1 = 53 * var1 + Internal.hashBoolean(this.getFlipShoulderPet());
      if (this.getEquippedCosmeticsCount() > 0) {
         var1 = 37 * var1 + 11;
         var1 = 53 * var1 + this.getEquippedCosmeticsList().hashCode();
      }

      var1 = 29 * var1 + this.getUnknownFields().hashCode();
      this.memoizedHashCode = var1;
      return var1;
   }

   public static CustomizableCosmeticSettings parseFrom(ByteBuffer var0) {
      return PARSER.parseFrom(var0);
   }

   public static CustomizableCosmeticSettings parseFrom(ByteBuffer var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static CustomizableCosmeticSettings parseFrom(ByteString var0) {
      return PARSER.parseFrom(var0);
   }

   public static CustomizableCosmeticSettings parseFrom(ByteString var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static CustomizableCosmeticSettings parseFrom(byte[] var0) {
      return PARSER.parseFrom(var0);
   }

   public static CustomizableCosmeticSettings parseFrom(byte[] var0, ExtensionRegistryLite var1) {
      return PARSER.parseFrom(var0, var1);
   }

   public static CustomizableCosmeticSettings parseFrom(InputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static CustomizableCosmeticSettings parseFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public static CustomizableCosmeticSettings parseDelimitedFrom(InputStream var0) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0);
   }

   public static CustomizableCosmeticSettings parseDelimitedFrom(InputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, var0, var1);
   }

   public static CustomizableCosmeticSettings parseFrom(CodedInputStream var0) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0);
   }

   public static CustomizableCosmeticSettings parseFrom(CodedInputStream var0, ExtensionRegistryLite var1) {
      return GeneratedMessageV3.parseWithIOException(PARSER, var0, var1);
   }

   public CustomizableCosmeticSettings.Builder newBuilderForType() {
      return newBuilder();
   }

   public static CustomizableCosmeticSettings.Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
   }

   public static CustomizableCosmeticSettings.Builder newBuilder(CustomizableCosmeticSettings var0) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(var0);
   }

   public CustomizableCosmeticSettings.Builder toBuilder() {
      return this == DEFAULT_INSTANCE ? new CustomizableCosmeticSettings.Builder() : new CustomizableCosmeticSettings.Builder().mergeFrom(this);
   }

   protected CustomizableCosmeticSettings.Builder newBuilderForType(GeneratedMessageV3.BuilderParent var1) {
      return new CustomizableCosmeticSettings.Builder(var1);
   }

   public static CustomizableCosmeticSettings getDefaultInstance() {
      return DEFAULT_INSTANCE;
   }

   public static Parser<CustomizableCosmeticSettings> parser() {
      return PARSER;
   }

   @Override
   public Parser<CustomizableCosmeticSettings> getParserForType() {
      return PARSER;
   }

   public CustomizableCosmeticSettings getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
   }

   public static final class Builder extends GeneratedMessageV3.Builder<CustomizableCosmeticSettings.Builder> implements CustomizableCosmeticSettingsOrBuilder {
      private int bitField0_;
      private Internal.IntList activeCosmeticIds_ = CustomizableCosmeticSettings.emptyIntList();
      private boolean clothCloak_;
      private Color plusColor_;
      private SingleFieldBuilderV3<Color, Color.Builder, ColorOrBuilder> plusColorBuilder_;
      private boolean showHatsOverHelmet_;
      private boolean showHatsOverSkinLayer_;
      private boolean showOverChestplate_;
      private boolean showOverLeggings_;
      private boolean showOverBoots_;
      private MapField<Integer, Float> hatHeightOffset_;
      private boolean flipShoulderPet_;
      private List<EquippedCosmetic> equippedCosmetics_ = Collections.emptyList();
      private RepeatedFieldBuilderV3<EquippedCosmetic, EquippedCosmetic.Builder, EquippedCosmeticOrBuilder> equippedCosmeticsBuilder_;

      public static final Descriptors.Descriptor getDescriptor() {
         return CommonProto.internal_static_lunarclient_websocket_cosmetic_v1_CustomizableCosmeticSettings_descriptor;
      }

      @Override
      protected MapFieldReflectionAccessor internalGetMapFieldReflection(int var1) {
         switch (var1) {
            case 9:
               return this.internalGetHatHeightOffset();
            default:
               throw new RuntimeException("Invalid map field number: " + var1);
         }
      }

      @Override
      protected MapFieldReflectionAccessor internalGetMutableMapFieldReflection(int var1) {
         switch (var1) {
            case 9:
               return this.internalGetMutableHatHeightOffset();
            default:
               throw new RuntimeException("Invalid map field number: " + var1);
         }
      }

      @Override
      protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
         return CommonProto.internal_static_lunarclient_websocket_cosmetic_v1_CustomizableCosmeticSettings_fieldAccessorTable
            .ensureFieldAccessorsInitialized(CustomizableCosmeticSettings.class, CustomizableCosmeticSettings.Builder.class);
      }

      private Builder() {
         this.maybeForceBuilderInitialization();
      }

      private Builder(GeneratedMessageV3.BuilderParent var1) {
         super(var1);
         this.maybeForceBuilderInitialization();
      }

      private void maybeForceBuilderInitialization() {
         if (CustomizableCosmeticSettings.alwaysUseFieldBuilders) {
            this.getPlusColorFieldBuilder();
            this.getEquippedCosmeticsFieldBuilder();
         }
      }

      public CustomizableCosmeticSettings.Builder clear() {
         super.clear();
         this.bitField0_ = 0;
         this.activeCosmeticIds_ = CustomizableCosmeticSettings.emptyIntList();
         this.clothCloak_ = false;
         this.plusColor_ = null;
         if (this.plusColorBuilder_ != null) {
            this.plusColorBuilder_.dispose();
            this.plusColorBuilder_ = null;
         }

         this.showHatsOverHelmet_ = false;
         this.showHatsOverSkinLayer_ = false;
         this.showOverChestplate_ = false;
         this.showOverLeggings_ = false;
         this.showOverBoots_ = false;
         this.internalGetMutableHatHeightOffset().clear();
         this.flipShoulderPet_ = false;
         if (this.equippedCosmeticsBuilder_ == null) {
            this.equippedCosmetics_ = Collections.emptyList();
         } else {
            this.equippedCosmetics_ = null;
            this.equippedCosmeticsBuilder_.clear();
         }

         this.bitField0_ &= -1025;
         return this;
      }

      @Override
      public Descriptors.Descriptor getDescriptorForType() {
         return CommonProto.internal_static_lunarclient_websocket_cosmetic_v1_CustomizableCosmeticSettings_descriptor;
      }

      public CustomizableCosmeticSettings getDefaultInstanceForType() {
         return CustomizableCosmeticSettings.getDefaultInstance();
      }

      public CustomizableCosmeticSettings build() {
         CustomizableCosmeticSettings var1 = this.buildPartial();
         if (!var1.isInitialized()) {
            throw newUninitializedMessageException(var1);
         } else {
            return var1;
         }
      }

      public CustomizableCosmeticSettings buildPartial() {
         CustomizableCosmeticSettings var1 = new CustomizableCosmeticSettings(this);
         this.buildPartialRepeatedFields(var1);
         if (this.bitField0_ != 0) {
            this.buildPartial0(var1);
         }

         this.onBuilt();
         return var1;
      }

      private void buildPartialRepeatedFields(CustomizableCosmeticSettings var1) {
         if (this.equippedCosmeticsBuilder_ == null) {
            if ((this.bitField0_ & 1024) != 0) {
               this.equippedCosmetics_ = Collections.unmodifiableList(this.equippedCosmetics_);
               this.bitField0_ &= -1025;
            }

            var1.equippedCosmetics_ = this.equippedCosmetics_;
         } else {
            var1.equippedCosmetics_ = this.equippedCosmeticsBuilder_.build();
         }
      }

      private void buildPartial0(CustomizableCosmeticSettings var1) {
         int var2 = this.bitField0_;
         if ((var2 & 1) != 0) {
            this.activeCosmeticIds_.makeImmutable();
            var1.activeCosmeticIds_ = this.activeCosmeticIds_;
         }

         if ((var2 & 2) != 0) {
            var1.clothCloak_ = this.clothCloak_;
         }

         byte var3 = 0;
         if ((var2 & 4) != 0) {
            var1.plusColor_ = this.plusColorBuilder_ == null ? this.plusColor_ : this.plusColorBuilder_.build();
            var3 |= 1;
         }

         if ((var2 & 8) != 0) {
            var1.showHatsOverHelmet_ = this.showHatsOverHelmet_;
         }

         if ((var2 & 16) != 0) {
            var1.showHatsOverSkinLayer_ = this.showHatsOverSkinLayer_;
         }

         if ((var2 & 32) != 0) {
            var1.showOverChestplate_ = this.showOverChestplate_;
         }

         if ((var2 & 64) != 0) {
            var1.showOverLeggings_ = this.showOverLeggings_;
         }

         if ((var2 & 128) != 0) {
            var1.showOverBoots_ = this.showOverBoots_;
         }

         if ((var2 & 256) != 0) {
            var1.hatHeightOffset_ = this.internalGetHatHeightOffset();
            var1.hatHeightOffset_.makeImmutable();
         }

         if ((var2 & 512) != 0) {
            var1.flipShoulderPet_ = this.flipShoulderPet_;
         }

         CustomizableCosmeticSettings var4 = var1;
         var4.bitField0_ = var4.bitField0_ | var3;
      }

      public CustomizableCosmeticSettings.Builder clone() {
         return (CustomizableCosmeticSettings.Builder)super.clone();
      }

      public CustomizableCosmeticSettings.Builder setField(Descriptors.FieldDescriptor var1, Object var2) {
         return (CustomizableCosmeticSettings.Builder)super.setField(var1, var2);
      }

      public CustomizableCosmeticSettings.Builder clearField(Descriptors.FieldDescriptor var1) {
         return (CustomizableCosmeticSettings.Builder)super.clearField(var1);
      }

      public CustomizableCosmeticSettings.Builder clearOneof(Descriptors.OneofDescriptor var1) {
         return (CustomizableCosmeticSettings.Builder)super.clearOneof(var1);
      }

      public CustomizableCosmeticSettings.Builder setRepeatedField(Descriptors.FieldDescriptor var1, int var2, Object var3) {
         return (CustomizableCosmeticSettings.Builder)super.setRepeatedField(var1, var2, var3);
      }

      public CustomizableCosmeticSettings.Builder addRepeatedField(Descriptors.FieldDescriptor var1, Object var2) {
         return (CustomizableCosmeticSettings.Builder)super.addRepeatedField(var1, var2);
      }

      public CustomizableCosmeticSettings.Builder mergeFrom(Message var1) {
         if (var1 instanceof CustomizableCosmeticSettings) {
            return this.mergeFrom((CustomizableCosmeticSettings)var1);
         }

         super.mergeFrom(var1);
         return this;
      }

      public CustomizableCosmeticSettings.Builder mergeFrom(CustomizableCosmeticSettings var1) {
         if (var1 == CustomizableCosmeticSettings.getDefaultInstance()) {
            return this;
         }

         if (!var1.activeCosmeticIds_.isEmpty()) {
            if (this.activeCosmeticIds_.isEmpty()) {
               this.activeCosmeticIds_ = var1.activeCosmeticIds_;
               this.activeCosmeticIds_.makeImmutable();
               this.bitField0_ |= 1;
            } else {
               this.ensureActiveCosmeticIdsIsMutable();
               this.activeCosmeticIds_.addAll(var1.activeCosmeticIds_);
            }

            this.onChanged();
         }

         if (var1.getClothCloak()) {
            this.setClothCloak(var1.getClothCloak());
         }

         if (var1.hasPlusColor()) {
            this.mergePlusColor(var1.getPlusColor());
         }

         if (var1.getShowHatsOverHelmet()) {
            this.setShowHatsOverHelmet(var1.getShowHatsOverHelmet());
         }

         if (var1.getShowHatsOverSkinLayer()) {
            this.setShowHatsOverSkinLayer(var1.getShowHatsOverSkinLayer());
         }

         if (var1.getShowOverChestplate()) {
            this.setShowOverChestplate(var1.getShowOverChestplate());
         }

         if (var1.getShowOverLeggings()) {
            this.setShowOverLeggings(var1.getShowOverLeggings());
         }

         if (var1.getShowOverBoots()) {
            this.setShowOverBoots(var1.getShowOverBoots());
         }

         this.internalGetMutableHatHeightOffset().mergeFrom(var1.internalGetHatHeightOffset());
         this.bitField0_ |= 256;
         if (var1.getFlipShoulderPet()) {
            this.setFlipShoulderPet(var1.getFlipShoulderPet());
         }

         if (this.equippedCosmeticsBuilder_ == null) {
            if (!var1.equippedCosmetics_.isEmpty()) {
               if (this.equippedCosmetics_.isEmpty()) {
                  this.equippedCosmetics_ = var1.equippedCosmetics_;
                  this.bitField0_ &= -1025;
               } else {
                  this.ensureEquippedCosmeticsIsMutable();
                  this.equippedCosmetics_.addAll(var1.equippedCosmetics_);
               }

               this.onChanged();
            }
         } else if (!var1.equippedCosmetics_.isEmpty()) {
            if (this.equippedCosmeticsBuilder_.isEmpty()) {
               this.equippedCosmeticsBuilder_.dispose();
               this.equippedCosmeticsBuilder_ = null;
               this.equippedCosmetics_ = var1.equippedCosmetics_;
               this.bitField0_ &= -1025;
               this.equippedCosmeticsBuilder_ = CustomizableCosmeticSettings.alwaysUseFieldBuilders ? this.getEquippedCosmeticsFieldBuilder() : null;
            } else {
               this.equippedCosmeticsBuilder_.addAllMessages(var1.equippedCosmetics_);
            }
         }

         this.mergeUnknownFields(var1.getUnknownFields());
         this.onChanged();
         return this;
      }

      @Override
      public final boolean isInitialized() {
         return true;
      }

      public CustomizableCosmeticSettings.Builder mergeFrom(CodedInputStream var1, ExtensionRegistryLite var2) {
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
                     int var14 = var1.readInt32();
                     this.ensureActiveCosmeticIdsIsMutable();
                     this.activeCosmeticIds_.addInt(var14);
                     break;
                  case 10:
                     int var13 = var1.readRawVarint32();
                     int var6 = var1.pushLimit(var13);
                     this.ensureActiveCosmeticIdsIsMutable();

                     while (var1.getBytesUntilLimit() > 0) {
                        this.activeCosmeticIds_.addInt(var1.readInt32());
                     }

                     var1.popLimit(var6);
                     break;
                  case 16:
                     this.clothCloak_ = var1.readBool();
                     this.bitField0_ |= 2;
                     break;
                  case 26:
                     var1.readMessage(this.getPlusColorFieldBuilder().getBuilder(), var2);
                     this.bitField0_ |= 4;
                     break;
                  case 32:
                     this.showHatsOverHelmet_ = var1.readBool();
                     this.bitField0_ |= 8;
                     break;
                  case 40:
                     this.showHatsOverSkinLayer_ = var1.readBool();
                     this.bitField0_ |= 16;
                     break;
                  case 48:
                     this.showOverChestplate_ = var1.readBool();
                     this.bitField0_ |= 32;
                     break;
                  case 56:
                     this.showOverLeggings_ = var1.readBool();
                     this.bitField0_ |= 64;
                     break;
                  case 64:
                     this.showOverBoots_ = var1.readBool();
                     this.bitField0_ |= 128;
                     break;
                  case 74:
                     MapEntry var12 = var1.readMessage(CustomizableCosmeticSettings.HatHeightOffsetDefaultEntryHolder.defaultEntry.getParserForType(), var2);
                     this.internalGetMutableHatHeightOffset().getMutableMap().put((Integer)var12.getKey(), (Float)var12.getValue());
                     this.bitField0_ |= 256;
                     break;
                  case 80:
                     this.flipShoulderPet_ = var1.readBool();
                     this.bitField0_ |= 512;
                     break;
                  case 90:
                     EquippedCosmetic var5 = var1.readMessage(EquippedCosmetic.parser(), var2);
                     if (this.equippedCosmeticsBuilder_ == null) {
                        this.ensureEquippedCosmeticsIsMutable();
                        this.equippedCosmetics_.add(var5);
                     } else {
                        this.equippedCosmeticsBuilder_.addMessage(var5);
                     }
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

      private void ensureActiveCosmeticIdsIsMutable() {
         if (!this.activeCosmeticIds_.isModifiable()) {
            this.activeCosmeticIds_ = CustomizableCosmeticSettings.makeMutableCopy(this.activeCosmeticIds_);
         }

         this.bitField0_ |= 1;
      }

      @Deprecated
      @Override
      public List<Integer> getActiveCosmeticIdsList() {
         this.activeCosmeticIds_.makeImmutable();
         return this.activeCosmeticIds_;
      }

      @Deprecated
      @Override
      public int getActiveCosmeticIdsCount() {
         return this.activeCosmeticIds_.size();
      }

      @Deprecated
      @Override
      public int getActiveCosmeticIds(int var1) {
         return this.activeCosmeticIds_.getInt(var1);
      }

      @Deprecated
      public CustomizableCosmeticSettings.Builder setActiveCosmeticIds(int var1, int var2) {
         this.ensureActiveCosmeticIdsIsMutable();
         this.activeCosmeticIds_.setInt(var1, var2);
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Deprecated
      public CustomizableCosmeticSettings.Builder addActiveCosmeticIds(int var1) {
         this.ensureActiveCosmeticIdsIsMutable();
         this.activeCosmeticIds_.addInt(var1);
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Deprecated
      public CustomizableCosmeticSettings.Builder addAllActiveCosmeticIds(Iterable<? extends Integer> var1) {
         this.ensureActiveCosmeticIdsIsMutable();
         AbstractMessageLite.Builder.addAll(var1, this.activeCosmeticIds_);
         this.bitField0_ |= 1;
         this.onChanged();
         return this;
      }

      @Deprecated
      public CustomizableCosmeticSettings.Builder clearActiveCosmeticIds() {
         this.activeCosmeticIds_ = CustomizableCosmeticSettings.emptyIntList();
         this.bitField0_ &= -2;
         this.onChanged();
         return this;
      }

      @Override
      public boolean getClothCloak() {
         return this.clothCloak_;
      }

      public CustomizableCosmeticSettings.Builder setClothCloak(boolean var1) {
         this.clothCloak_ = var1;
         this.bitField0_ |= 2;
         this.onChanged();
         return this;
      }

      public CustomizableCosmeticSettings.Builder clearClothCloak() {
         this.bitField0_ &= -3;
         this.clothCloak_ = false;
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

      public CustomizableCosmeticSettings.Builder setPlusColor(Color var1) {
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

      public CustomizableCosmeticSettings.Builder setPlusColor(Color.Builder var1) {
         if (this.plusColorBuilder_ == null) {
            this.plusColor_ = var1.build();
         } else {
            this.plusColorBuilder_.setMessage(var1.build());
         }

         this.bitField0_ |= 4;
         this.onChanged();
         return this;
      }

      public CustomizableCosmeticSettings.Builder mergePlusColor(Color var1) {
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

      public CustomizableCosmeticSettings.Builder clearPlusColor() {
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
      public boolean getShowHatsOverHelmet() {
         return this.showHatsOverHelmet_;
      }

      public CustomizableCosmeticSettings.Builder setShowHatsOverHelmet(boolean var1) {
         this.showHatsOverHelmet_ = var1;
         this.bitField0_ |= 8;
         this.onChanged();
         return this;
      }

      public CustomizableCosmeticSettings.Builder clearShowHatsOverHelmet() {
         this.bitField0_ &= -9;
         this.showHatsOverHelmet_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public boolean getShowHatsOverSkinLayer() {
         return this.showHatsOverSkinLayer_;
      }

      public CustomizableCosmeticSettings.Builder setShowHatsOverSkinLayer(boolean var1) {
         this.showHatsOverSkinLayer_ = var1;
         this.bitField0_ |= 16;
         this.onChanged();
         return this;
      }

      public CustomizableCosmeticSettings.Builder clearShowHatsOverSkinLayer() {
         this.bitField0_ &= -17;
         this.showHatsOverSkinLayer_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public boolean getShowOverChestplate() {
         return this.showOverChestplate_;
      }

      public CustomizableCosmeticSettings.Builder setShowOverChestplate(boolean var1) {
         this.showOverChestplate_ = var1;
         this.bitField0_ |= 32;
         this.onChanged();
         return this;
      }

      public CustomizableCosmeticSettings.Builder clearShowOverChestplate() {
         this.bitField0_ &= -33;
         this.showOverChestplate_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public boolean getShowOverLeggings() {
         return this.showOverLeggings_;
      }

      public CustomizableCosmeticSettings.Builder setShowOverLeggings(boolean var1) {
         this.showOverLeggings_ = var1;
         this.bitField0_ |= 64;
         this.onChanged();
         return this;
      }

      public CustomizableCosmeticSettings.Builder clearShowOverLeggings() {
         this.bitField0_ &= -65;
         this.showOverLeggings_ = false;
         this.onChanged();
         return this;
      }

      @Override
      public boolean getShowOverBoots() {
         return this.showOverBoots_;
      }

      public CustomizableCosmeticSettings.Builder setShowOverBoots(boolean var1) {
         this.showOverBoots_ = var1;
         this.bitField0_ |= 128;
         this.onChanged();
         return this;
      }

      public CustomizableCosmeticSettings.Builder clearShowOverBoots() {
         this.bitField0_ &= -129;
         this.showOverBoots_ = false;
         this.onChanged();
         return this;
      }

      private MapField<Integer, Float> internalGetHatHeightOffset() {
         return this.hatHeightOffset_ == null
            ? MapField.emptyMapField(CustomizableCosmeticSettings.HatHeightOffsetDefaultEntryHolder.defaultEntry)
            : this.hatHeightOffset_;
      }

      private MapField<Integer, Float> internalGetMutableHatHeightOffset() {
         if (this.hatHeightOffset_ == null) {
            this.hatHeightOffset_ = MapField.newMapField(CustomizableCosmeticSettings.HatHeightOffsetDefaultEntryHolder.defaultEntry);
         }

         if (!this.hatHeightOffset_.isMutable()) {
            this.hatHeightOffset_ = this.hatHeightOffset_.copy();
         }

         this.bitField0_ |= 256;
         this.onChanged();
         return this.hatHeightOffset_;
      }

      @Override
      public int getHatHeightOffsetCount() {
         return this.internalGetHatHeightOffset().getMap().size();
      }

      @Override
      public boolean containsHatHeightOffset(int var1) {
         return this.internalGetHatHeightOffset().getMap().containsKey(var1);
      }

      @Deprecated
      @Override
      public Map<Integer, Float> getHatHeightOffset() {
         return this.getHatHeightOffsetMap();
      }

      @Override
      public Map<Integer, Float> getHatHeightOffsetMap() {
         return this.internalGetHatHeightOffset().getMap();
      }

      @Override
      public float getHatHeightOffsetOrDefault(int var1, float var2) {
         Map var3 = this.internalGetHatHeightOffset().getMap();
         return var3.containsKey(var1) ? (Float)var3.get(var1) : var2;
      }

      @Override
      public float getHatHeightOffsetOrThrow(int var1) {
         Map var2 = this.internalGetHatHeightOffset().getMap();
         if (!var2.containsKey(var1)) {
            throw new IllegalArgumentException();
         } else {
            return (Float)var2.get(var1);
         }
      }

      public CustomizableCosmeticSettings.Builder clearHatHeightOffset() {
         this.bitField0_ &= -257;
         this.internalGetMutableHatHeightOffset().getMutableMap().clear();
         return this;
      }

      public CustomizableCosmeticSettings.Builder removeHatHeightOffset(int var1) {
         this.internalGetMutableHatHeightOffset().getMutableMap().remove(var1);
         return this;
      }

      @Deprecated
      public Map<Integer, Float> getMutableHatHeightOffset() {
         this.bitField0_ |= 256;
         return this.internalGetMutableHatHeightOffset().getMutableMap();
      }

      public CustomizableCosmeticSettings.Builder putHatHeightOffset(int var1, float var2) {
         this.internalGetMutableHatHeightOffset().getMutableMap().put(var1, var2);
         this.bitField0_ |= 256;
         return this;
      }

      public CustomizableCosmeticSettings.Builder putAllHatHeightOffset(Map<Integer, Float> var1) {
         this.internalGetMutableHatHeightOffset().getMutableMap().putAll(var1);
         this.bitField0_ |= 256;
         return this;
      }

      @Override
      public boolean getFlipShoulderPet() {
         return this.flipShoulderPet_;
      }

      public CustomizableCosmeticSettings.Builder setFlipShoulderPet(boolean var1) {
         this.flipShoulderPet_ = var1;
         this.bitField0_ |= 512;
         this.onChanged();
         return this;
      }

      public CustomizableCosmeticSettings.Builder clearFlipShoulderPet() {
         this.bitField0_ &= -513;
         this.flipShoulderPet_ = false;
         this.onChanged();
         return this;
      }

      private void ensureEquippedCosmeticsIsMutable() {
         if ((this.bitField0_ & 1024) == 0) {
            this.equippedCosmetics_ = new ArrayList<>(this.equippedCosmetics_);
            this.bitField0_ |= 1024;
         }
      }

      @Override
      public List<EquippedCosmetic> getEquippedCosmeticsList() {
         return this.equippedCosmeticsBuilder_ == null
            ? Collections.unmodifiableList(this.equippedCosmetics_)
            : this.equippedCosmeticsBuilder_.getMessageList();
      }

      @Override
      public int getEquippedCosmeticsCount() {
         return this.equippedCosmeticsBuilder_ == null ? this.equippedCosmetics_.size() : this.equippedCosmeticsBuilder_.getCount();
      }

      @Override
      public EquippedCosmetic getEquippedCosmetics(int var1) {
         return this.equippedCosmeticsBuilder_ == null ? this.equippedCosmetics_.get(var1) : this.equippedCosmeticsBuilder_.getMessage(var1);
      }

      public CustomizableCosmeticSettings.Builder setEquippedCosmetics(int var1, EquippedCosmetic var2) {
         if (this.equippedCosmeticsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureEquippedCosmeticsIsMutable();
            this.equippedCosmetics_.set(var1, var2);
            this.onChanged();
         } else {
            this.equippedCosmeticsBuilder_.setMessage(var1, var2);
         }

         return this;
      }

      public CustomizableCosmeticSettings.Builder setEquippedCosmetics(int var1, EquippedCosmetic.Builder var2) {
         if (this.equippedCosmeticsBuilder_ == null) {
            this.ensureEquippedCosmeticsIsMutable();
            this.equippedCosmetics_.set(var1, var2.build());
            this.onChanged();
         } else {
            this.equippedCosmeticsBuilder_.setMessage(var1, var2.build());
         }

         return this;
      }

      public CustomizableCosmeticSettings.Builder addEquippedCosmetics(EquippedCosmetic var1) {
         if (this.equippedCosmeticsBuilder_ == null) {
            if (var1 == null) {
               throw new NullPointerException();
            }

            this.ensureEquippedCosmeticsIsMutable();
            this.equippedCosmetics_.add(var1);
            this.onChanged();
         } else {
            this.equippedCosmeticsBuilder_.addMessage(var1);
         }

         return this;
      }

      public CustomizableCosmeticSettings.Builder addEquippedCosmetics(int var1, EquippedCosmetic var2) {
         if (this.equippedCosmeticsBuilder_ == null) {
            if (var2 == null) {
               throw new NullPointerException();
            }

            this.ensureEquippedCosmeticsIsMutable();
            this.equippedCosmetics_.add(var1, var2);
            this.onChanged();
         } else {
            this.equippedCosmeticsBuilder_.addMessage(var1, var2);
         }

         return this;
      }

      public CustomizableCosmeticSettings.Builder addEquippedCosmetics(EquippedCosmetic.Builder var1) {
         if (this.equippedCosmeticsBuilder_ == null) {
            this.ensureEquippedCosmeticsIsMutable();
            this.equippedCosmetics_.add(var1.build());
            this.onChanged();
         } else {
            this.equippedCosmeticsBuilder_.addMessage(var1.build());
         }

         return this;
      }

      public CustomizableCosmeticSettings.Builder addEquippedCosmetics(int var1, EquippedCosmetic.Builder var2) {
         if (this.equippedCosmeticsBuilder_ == null) {
            this.ensureEquippedCosmeticsIsMutable();
            this.equippedCosmetics_.add(var1, var2.build());
            this.onChanged();
         } else {
            this.equippedCosmeticsBuilder_.addMessage(var1, var2.build());
         }

         return this;
      }

      public CustomizableCosmeticSettings.Builder addAllEquippedCosmetics(Iterable<? extends EquippedCosmetic> var1) {
         if (this.equippedCosmeticsBuilder_ == null) {
            this.ensureEquippedCosmeticsIsMutable();
            AbstractMessageLite.Builder.addAll(var1, this.equippedCosmetics_);
            this.onChanged();
         } else {
            this.equippedCosmeticsBuilder_.addAllMessages(var1);
         }

         return this;
      }

      public CustomizableCosmeticSettings.Builder clearEquippedCosmetics() {
         if (this.equippedCosmeticsBuilder_ == null) {
            this.equippedCosmetics_ = Collections.emptyList();
            this.bitField0_ &= -1025;
            this.onChanged();
         } else {
            this.equippedCosmeticsBuilder_.clear();
         }

         return this;
      }

      public CustomizableCosmeticSettings.Builder removeEquippedCosmetics(int var1) {
         if (this.equippedCosmeticsBuilder_ == null) {
            this.ensureEquippedCosmeticsIsMutable();
            this.equippedCosmetics_.remove(var1);
            this.onChanged();
         } else {
            this.equippedCosmeticsBuilder_.remove(var1);
         }

         return this;
      }

      public EquippedCosmetic.Builder getEquippedCosmeticsBuilder(int var1) {
         return this.getEquippedCosmeticsFieldBuilder().getBuilder(var1);
      }

      @Override
      public EquippedCosmeticOrBuilder getEquippedCosmeticsOrBuilder(int var1) {
         return this.equippedCosmeticsBuilder_ == null ? this.equippedCosmetics_.get(var1) : this.equippedCosmeticsBuilder_.getMessageOrBuilder(var1);
      }

      @Override
      public List<? extends EquippedCosmeticOrBuilder> getEquippedCosmeticsOrBuilderList() {
         return this.equippedCosmeticsBuilder_ != null
            ? this.equippedCosmeticsBuilder_.getMessageOrBuilderList()
            : Collections.unmodifiableList(this.equippedCosmetics_);
      }

      public EquippedCosmetic.Builder addEquippedCosmeticsBuilder() {
         return this.getEquippedCosmeticsFieldBuilder().addBuilder(EquippedCosmetic.getDefaultInstance());
      }

      public EquippedCosmetic.Builder addEquippedCosmeticsBuilder(int var1) {
         return this.getEquippedCosmeticsFieldBuilder().addBuilder(var1, EquippedCosmetic.getDefaultInstance());
      }

      public List<EquippedCosmetic.Builder> getEquippedCosmeticsBuilderList() {
         return this.getEquippedCosmeticsFieldBuilder().getBuilderList();
      }

      private RepeatedFieldBuilderV3<EquippedCosmetic, EquippedCosmetic.Builder, EquippedCosmeticOrBuilder> getEquippedCosmeticsFieldBuilder() {
         if (this.equippedCosmeticsBuilder_ == null) {
            this.equippedCosmeticsBuilder_ = new RepeatedFieldBuilderV3<>(
               this.equippedCosmetics_, (this.bitField0_ & 1024) != 0, this.getParentForChildren(), this.isClean()
            );
            this.equippedCosmetics_ = null;
         }

         return this.equippedCosmeticsBuilder_;
      }

      public final CustomizableCosmeticSettings.Builder setUnknownFields(UnknownFieldSet var1) {
         return (CustomizableCosmeticSettings.Builder)super.setUnknownFields(var1);
      }

      public final CustomizableCosmeticSettings.Builder mergeUnknownFields(UnknownFieldSet var1) {
         return (CustomizableCosmeticSettings.Builder)super.mergeUnknownFields(var1);
      }
   }

   private static final class HatHeightOffsetDefaultEntryHolder {
      static final MapEntry<Integer, Float> defaultEntry = MapEntry.newDefaultInstance(
         CommonProto.internal_static_lunarclient_websocket_cosmetic_v1_CustomizableCosmeticSettings_HatHeightOffsetEntry_descriptor,
         WireFormat.FieldType.INT32,
         0,
         WireFormat.FieldType.FLOAT,
         0.0F
      );
   }
}
