package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.lib.adventure.text.Component;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.function.BiPredicate;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.client.util.ITooltipFlag.TooltipFlags;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemBanner;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemFireworkCharge;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemLingeringPotion;
import net.minecraft.item.ItemMonsterPlacer;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemPotion;
import net.minecraft.item.ItemShield;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSplashPotion;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTippedArrow;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTTagString;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;

@Mixin(ItemStack.class)
public abstract class CIOHHCORHRCCRICCCORIHCRHCCCRRR
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR {
   @Unique
   private static final ItemStack lunar$EMPTY = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5 ? ItemStack.EMPTY$v1_12 : new ItemStack(Blocks.AIR);
   @Final
   @Shadow
   public Item item;
   @Shadow
   public int stackSize;
   @Shadow
   public NBTTagCompound stackTagCompound;
   @Unique
   private com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI lunar$itemType = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.UNKNOWN;
   @Unique
   private com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RRCRRCORICCHOHHIRCHIROOHIIOHCO lunar$itemMaterial;
   @Unique
   private Item lunar$lastItemTypeCheck;
   @Unique
   private Boolean lunar$isCubeBlock = null;

   @Shadow
   public abstract NBTTagCompound getTagCompound();

   @Shadow
   public abstract String getDisplayName();

   @Shadow
   public abstract Item getItem();

   @Shadow
   public abstract boolean isItemDamaged();

   @Shadow
   public abstract int getMaxStackSize();

   @Shadow
   public abstract int getRepairCost();

   @Shadow
   public abstract boolean hasDisplayName();

   @Shadow
   public abstract boolean isItemStackDamageable();

   @Shadow
   public abstract ItemStack setStackDisplayName(String var1);

   @Shadow
   public abstract ItemStack copy();

   @Shadow
   public abstract void setRepairCost(int var1);

   @Shadow
   public abstract boolean isItemEqual(ItemStack var1);

   @Shadow
   public abstract EnumAction getItemUseAction();

   @Shadow
   public abstract int getMaxItemUseDuration();

   @Shadow
   public abstract int getMaxDamage$v1_8();

   @Shadow
   public abstract int getMaxDurability$v1_7();

   @Shadow
   public abstract int getItemDamage$v1_8();

   @Shadow
   public abstract int getCurrentDurability$v1_7();

   @Shadow
   public abstract void clearCustomName$v1_8();

   @Shadow
   public abstract void setItemDamage$v1_8(int var1);

   @Shadow
   public abstract void setMetadata$v1_7(int var1);

   @Shadow
   public abstract List<String> getTooltip$v1_12(EntityPlayer var1, ITooltipFlag var2);

   @Shadow
   public abstract List<String> getTooltip$v1_7(EntityPlayer var1, boolean var2);

   @Shadow
   public abstract String getTranslationKey$v1_12();

   @Shadow
   public abstract String getUnlocalizedName$v1_7();

   @Shadow
   public abstract boolean isItemEnchanted();

   @Shadow
   public abstract List<String> getTooltip$v1_8(EntityPlayer var1, boolean var2);

   @Shadow
   public abstract boolean isEmpty$v1_12();

   @Shadow
   public abstract NBTTagCompound getSubCompound$v1_8(String var1, boolean var2);

   @Shadow
   public abstract NBTTagCompound getSubCompound$v1_12(String var1);

   @Shadow
   public abstract void setTagInfo(String var1, NBTBase var2);

   @Shadow
   public abstract void setTagCompound(@Nullable NBTTagCompound var1);

   @Shadow
   public abstract NBTTagCompound writeToNBT(NBTTagCompound var1);

   @Shadow
   public abstract NBTTagCompound getOrCreateSubCompound$v1_12(String var1);

   @Shadow
   public abstract int getMetadata();

   public String bridge$getDisplayName() {
      return this.getDisplayName();
   }

   public String bridge$getRawDisplayName() {
      return this.getDisplayName().replaceAll("(?i)§[0-9A-FK-ORa-fk-or]", "");
   }

   public boolean bridge$hasCustomLore() {
      if (this.stackTagCompound == null) {
         return false;
      }

      if (this.stackTagCompound.hasKey("display", 10)) {
         NBTTagCompound var1 = this.stackTagCompound.getCompoundTag("display");
         if (var1.getTagId("Lore") == 9) {
            NBTTagList var2 = var1.getTagList("Lore", 8);
            return var2.tagCount() > 0;
         }
      }

      return false;
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH bridge$getItem() {
      return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH)this.getItem();
   }

   public int bridge$getStackSize() {
      return this.stackSize;
   }

   public int bridge$getMaxDamage() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? this.getMaxDamage$v1_8() : this.getMaxDurability$v1_7();
   }

   public boolean bridge$isItemDamaged() {
      return this.isItemDamaged();
   }

   public int bridge$getItemDamage() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? this.getItemDamage$v1_8() : this.getCurrentDurability$v1_7();
   }

   public void bridge$setCustomModelData(List<Float> var1, List<Boolean> var2, List<String> var3, List<Integer> var4) {
      this.bridge$setItemDamage((Integer)var4.get(0));
   }

   public int bridge$getCustomModelData() {
      return this.bridge$getItemDamage();
   }

   public int bridge$getMaxStackSize() {
      return this.getMaxStackSize();
   }

   public boolean bridge$isItemStackDamageableNoUnbr() {
      return this.item != null && (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? this.item.getMaxDamage$v1_8() : this.item.getMaxDurability$v1_7()) > 0;
   }

   public int bridge$getRepairCost() {
      return this.getRepairCost();
   }

   public boolean bridge$hasDisplayName() {
      return this.hasDisplayName();
   }

   public boolean bridge$isItemStackDamageable() {
      return this.isItemStackDamageable();
   }

   public void bridge$clearCustomName() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         this.clearCustomName$v1_8();
      }
   }

   public void bridge$setItemDamage(int var1) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         this.setItemDamage$v1_8(var1);
      } else {
         this.setMetadata$v1_7(var1);
      }
   }

   public void bridge$setStackDisplayName(Component var1) {
      this.setStackDisplayName(
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.asLegacyString(var1)
      );
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   public void bridge$setLore(List<Component> var1) {
      NBTTagList var2 = new NBTTagList();

      for (Component var4 : var1) {
         var2.appendTag(
            new NBTTagString(
               com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.asLegacyString(var4)
            )
         );
      }

      this.getOrCreateSubCompound$v1_12("display").setTag("Lore", var2);
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR bridge$copy() {
      return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR)this.copy();
   }

   public void bridge$setRepairCost(int var1) {
      this.setRepairCost(var1);
   }

   public Map<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH, Integer> bridge$getEnchantments() {
      Map var1;
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
         var1 = EnchantmentHelper.getEnchantments$v1_12((ItemStack)this);
      } else if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         var1 = EnchantmentHelper.getEnchantments$v1_8((ItemStack)this);
      } else {
         var1 = EnchantmentHelper.getEnchantments$v1_7((ItemStack)this);
      }

      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
         var1.remove(null);
         return var1;
      }

      HashMap var2 = new HashMap();

      for (Entry var4 : var1.entrySet()) {
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
            var2.put(
               (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)Enchantment.getEnchantmentById$v1_8(
                  (Integer)var4.getKey()
               ),
               (Integer)var4.getValue()
            );
         } else {
            var2.put(
               (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)Enchantment.enchantmentsList$v1_7[var4.getKey()],
               (Integer)var4.getValue()
            );
         }
      }

      var2.remove(null);
      return var2;
   }

   public void bridge$setEnchantments(
      Map<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH, Integer> var1
   ) {
      HashMap var2 = new HashMap();
      var1.forEach((var1x, var2x) -> {
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
            var2.put(var1x, var2x);
         } else {
            int var3 = ((Enchantment)var1x).effectId$v1_7;
            var2.put(var3, var2x);
         }
      });
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
         EnchantmentHelper.setEnchantments$v1_12(var2, (ItemStack)this);
      } else if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         EnchantmentHelper.setEnchantments$v1_8(var2, (ItemStack)this);
      } else {
         EnchantmentHelper.setEnchantments$v1_7(var2, (ItemStack)this);
      }
   }

   public void bridge$setPotionEffects(
      List<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HICRRICCHCCROOHHCHOCOCCHOIHHOC.IRCIIHHICIHRCOCRROCOICRIHHCCHH> var1
   ) {
      throw new com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH();
   }

   public void bridge$setProfile(@Nullable UUID var1, String var2, String var3) {
      NBTTagCompound var4 = this.getTagCompound();
      if (var4 == null) {
         var4 = new NBTTagCompound();
      }

      NBTTagCompound var5 = new NBTTagCompound();
      UUID var6 = var1 != null ? var1 : UUID.nameUUIDFromBytes(var2.getBytes(StandardCharsets.UTF_8));
      var5.setString("Id", var6.toString());
      NBTTagCompound var7 = new NBTTagCompound();
      NBTTagList var8 = new NBTTagList();
      NBTTagCompound var9 = new NBTTagCompound();
      var9.setString("Value", var2);
      var9.setString("Signature", var3);
      var8.appendTag(var9);
      var7.setTag("textures", var8);
      var5.setTag("Properties", var7);
      var4.setTag("SkullOwner", var5);
      this.setTagCompound(var4);
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   public void bridge$setArmorColor(int var1) {
      this.getOrCreateSubCompound$v1_12("display").setInteger("color", var1);
   }

   public boolean bridge$isEmpty() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5 ? this.isEmpty$v1_12() : this.isItemEqual(lunar$EMPTY);
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH bridge$getItemUseAction() {
      return com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.values()[this.getItemUseAction()
         .ordinal()];
   }

   public int bridge$getMaxItemUseDuration() {
      return this.getMaxItemUseDuration();
   }

   public boolean bridge$areItemsEqual(com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR var1) {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1
         ? ItemStack.areItemsEqual$v1_8((ItemStack)this, (ItemStack)var1)
         : ItemStack.areItemStacksEqual((ItemStack)this, (ItemStack)var1);
   }

   public boolean bridge$areItemsEqual(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR var1,
      BiPredicate<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR, com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR> var2
   ) {
      return var2.test(this, var1);
   }

   public List<String> bridge$getTooltip(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1,
      boolean var2
   ) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
         return this.getTooltip$v1_12((EntityPlayer)var1, var2 ? TooltipFlags.ADVANCED : TooltipFlags.NORMAL);
      } else {
         return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1
            ? this.getTooltip$v1_8((EntityPlayer)var1, var2)
            : this.getTooltip$v1_7((EntityPlayer)var1, var2);
      }
   }

   public List<Component> bridge$getTooltipComponents(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1,
      boolean var2
   ) {
      return this.bridge$getTooltip(var1, var2)
         .stream()
         .map(var0 -> com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.asAdventure(var0))
         .toList();
   }

   public void bridge$setStackSize(int var1) {
      this.stackSize = var1;
   }

   public String bridge$getUnlocalizedName() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5 ? this.getTranslationKey$v1_12() : this.getUnlocalizedName$v1_7();
   }

   public void bridge$setTagCompound(com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1) {
      this.stackTagCompound = (NBTTagCompound)var1;
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH bridge$getTagCompound() {
      return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH)this.getTagCompound();
   }

   public Optional<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH> bridge$saveTagCompound() {
      try {
         return Optional.ofNullable(
            (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH)this.writeToNBT(
               new NBTTagCompound()
            )
         );
      } catch (Exception var2) {
         return Optional.empty();
      }
   }

   public boolean bridge$isItemEnchanted() {
      return this.isItemEnchanted();
   }

   public boolean bridge$hasFoil() {
      return this.isItemEnchanted();
   }

   public Optional<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH> bridge$getFood() {
      return this.item instanceof com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
         ? Optional.of(var1)
         : Optional.empty();
   }

   public Optional<String> bridge$getBannerColor() {
      if (!(IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION != 0 && this.item instanceof ItemBanner var1)) {
         return Optional.empty();
      } else {
         return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 1
            ? Optional.of(var1.getBaseColor$v1_8((ItemStack)this).name)
            : Optional.of(ItemBanner.getBaseColor$v1_12((ItemStack)this).name);
      }
   }

   public void bridge$setBannerColor(String var1) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION != 0 && this.item instanceof ItemBanner) {
         Integer var2 = (Integer)com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHHOIIOCRHCHHCRORICCOHOHROOIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.ORRCOHRICOCORROIIOOCCOHIOORIHH
            .get(var1);
         if (var2 != null) {
            NBTTagCompound var3 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 5
               ? this.getSubCompound$v1_12("BlockEntityTag")
               : this.getSubCompound$v1_8("BlockEntityTag", true);
            if (var3 == null) {
               var3 = new NBTTagCompound();
               this.setTagInfo("BlockEntityTag", var3);
            }

            var3.setInteger("Base", var2);
            this.bridge$setItemDamage(var2);
         }
      }
   }

   public boolean bridge$isItemEqual(com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IIRHCHHOICHRICOOCRORCCIOOIHOIR var1) {
      return this.isItemEqual((ItemStack)var1);
   }

   public void bridge$sbHideTooltipComponents() {
      throw new com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH();
   }

   @Nullable
   public List<IIRHCHHOICHRICOOCRORCCIOOIHOIR> bridge$getContainerItems() {
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH var1 = (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH)this.bridge$getDataComponent(
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RROCOORHRROHIIOHOIRHCRIOCRRCIO
      );
      return var1 == null ? null : var1.bridge$items();
   }

   public boolean bridge$hasCustomModel() {
      return false;
   }

   public boolean bridge$isItemCubeBlock() {
      if (this.lunar$isCubeBlock == null) {
         this.lunar$isCubeBlock = this.bridge$getItem()
            .bridge$getBlockFromItem()
            .<Boolean>map(com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH::bridge$isCubeBlock)
            .orElse(false);
      }

      return this.lunar$isCubeBlock;
   }

   public boolean bridge$isCrossbowFullyCharged() {
      return false;
   }

   public boolean bridge$isItemSplashPotion() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 5 ? this.getItem() instanceof ItemSplashPotion : ItemPotion.isSplash$v1_7(this.getMetadata());
   }

   public void bridge$setDyedColor(int var1) {
      NBTTagCompound var2 = this.getTagCompound();
      if (var2 == null) {
         var2 = new NBTTagCompound();
      }

      NBTTagCompound var3 = var2.getCompoundTag("display");
      var3.setInteger("color", var1);
      var2.setTag("display", var3);
      this.setTagCompound(var2);
   }

   public boolean bridge$canElytraFly() {
      return this.bridge$getItem().bridge$isItemElytra();
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI bridge$getLunarItemType() {
      this.lunar$checkForItemUpdates();
      return this.lunar$itemType;
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RRCRRCORICCHOHHIRCHIROOHIIOHCO bridge$getLunarItemMaterial() {
      this.lunar$checkForItemUpdates();
      return this.lunar$itemMaterial;
   }

   @Unique
   private void lunar$checkForItemUpdates() {
      Item var1 = this.getItem();
      if (!Objects.equals(var1, this.lunar$lastItemTypeCheck)) {
         this.lunar$lastItemTypeCheck = var1;
         this.lunar$setItemType();
         this.lunar$setItemMaterial();
      }
   }

   public String bridge$getItemRegistryName() {
      return this.bridge$getItem().bridge$getRegistryName();
   }

   @Nullable
   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH bridge$getArmorState() {
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1 = (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH)this.getItem();
      if (var1.bridge$isArmor()) {
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.HHCCIRHCCCIIRHCROHIORHIRHHIORH var2 = (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.HHCCIRHCCCIIRHCROHIORHIRHHIORH)var1;
         boolean var3 = var2.bridge$hasColor(this);
         return new com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var3, var3 ? var2.bridge$getColor(this) : 0, var2.bridge$getResourcePath()
         );
      } else {
         return null;
      }
   }

   @Unique
   private void lunar$setItemType() {
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1 = (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH)this.item;
      if (var1 != null && (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION < 5 || this.item != ItemStack.EMPTY$v1_12.item && this.item != Items.AIR$v1_12)) {
         if (var1 instanceof ItemSword) {
            this.lunar$itemType = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.SWORD;
         } else if (var1 instanceof ItemPickaxe) {
            this.lunar$itemType = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.PICKAXE;
         } else if (var1 instanceof ItemAxe) {
            this.lunar$itemType = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.AXE;
         } else if (var1 instanceof ItemSpade) {
            this.lunar$itemType = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.SHOVEL;
         } else if (var1 instanceof ItemHoe) {
            this.lunar$itemType = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HOE;
         } else if (var1.bridge$isItemSkull()) {
            this.lunar$itemType = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.SKULL;
         } else if (var1.bridge$getRegistryName().contains("elytra")) {
            this.lunar$itemType = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.ELYTRA;
         } else if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5 && var1 instanceof ItemShield) {
            this.lunar$itemType = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.SHIELD;
         } else if (var1 instanceof ItemBlock) {
            this.lunar$itemType = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.BLOCK;
         } else if (var1 instanceof ItemArmor) {
            this.lunar$itemType = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.ARMOR;
         } else if (var1 instanceof ItemPotion) {
            if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5 && var1 instanceof ItemSplashPotion) {
               this.lunar$itemType = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.SPLASH_POTION;
            } else if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5 && var1 instanceof ItemLingeringPotion) {
               this.lunar$itemType = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.LINGERING_POTION;
            } else {
               this.lunar$itemType = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.POTION;
            }
         } else if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5 && var1 instanceof ItemTippedArrow) {
            this.lunar$itemType = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.TIPPED_ARROW;
         } else if (var1 instanceof ItemMonsterPlacer) {
            this.lunar$itemType = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.SPAWN_EGG;
         } else if (var1 instanceof ItemFireworkCharge) {
            this.lunar$itemType = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.FIREWORK_STAR;
         } else {
            this.lunar$itemType = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.UNKNOWN;
         }
      } else {
         this.lunar$itemType = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.EMPTY;
      }
   }

   @Unique
   private void lunar$setItemMaterial() {
      if (this.item instanceof ItemSword var1) {
         this.lunar$itemMaterial = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1
            ? com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RRCRRCORICCHOHHIRCHIROOHIIOHCO.fromMaterial(
               var1.material$v1_8.name()
            )
            : com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RRCRRCORICCHOHHIRCHIROOHIIOHCO.fromMaterial(
               var1.repairMaterial$v1_7.name()
            );
      } else if (this.item instanceof ItemPickaxe var2) {
         this.lunar$itemMaterial = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RRCRRCORICCHOHHIRCHIROOHIIOHCO.fromMaterial(
            var2.toolMaterial.name()
         );
      } else if (this.item instanceof ItemAxe var3) {
         this.lunar$itemMaterial = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RRCRRCORICCHOHHIRCHIROOHIIOHCO.fromMaterial(
            var3.toolMaterial.name()
         );
      } else if (this.item instanceof ItemSpade var4) {
         this.lunar$itemMaterial = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RRCRRCORICCHOHHIRCHIROOHIIOHCO.fromMaterial(
            var4.toolMaterial.name()
         );
      } else if (this.item instanceof ItemHoe var5) {
         this.lunar$itemMaterial = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 5
            ? com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RRCRRCORICCHOHHIRCHIROOHIIOHCO.fromMaterial(
               var5.toolMaterial$v1_12.name()
            )
            : com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RRCRRCORICCHOHHIRCHIROOHIIOHCO.fromMaterial(
               var5.theToolMaterial$v1_7.name()
            );
      } else {
         this.lunar$itemMaterial = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RRCRRCORICCHOHHIRCHIROOHIIOHCO.UNKNOWN;
      }
   }

   public Optional<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RHOCHHIRRCHHHOHOIRROIROHHHIHIO> bridge$getMaterial() {
      return this.getItem() instanceof IIRHCHHOICHRICOOCRORCCIOOIHOIR var1 ? Optional.of(var1.lunar$getMaterial()) : Optional.empty();
   }
}
