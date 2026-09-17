package com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import com.moonsworth.lunar.lib.adventure.text.Component;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.function.BiPredicate;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

public interface IIRHCHHOICHRICOOCRORCCIOOIHOIR
   extends com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   String bridge$getRawDisplayName();

   boolean bridge$hasCustomLore();

   HRCHROOHRIHCRCRHRIIROCIRHOIRHH bridge$getItem();

   void bridge$setStackSize(int var1);

   int bridge$getMaxDamage();

   boolean bridge$isItemDamaged();

   int bridge$getItemDamage();

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 6)
   double bridge$getAttackDamage();

   void bridge$setCustomModelData(List<Float> var1, List<Boolean> var2, List<String> var3, List<Integer> var4);

   int bridge$getCustomModelData();

   int bridge$getStackSize();

   int bridge$getMaxStackSize();

   boolean bridge$isItemStackDamageableNoUnbr();

   int bridge$getRepairCost();

   boolean bridge$hasDisplayName();

   boolean bridge$isItemStackDamageable();

   void bridge$clearCustomName();

   void bridge$setItemDamage(int var1);

   void bridge$setStackDisplayName(Component var1);

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   void bridge$setLore(List<Component> var1);

   IIRHCHHOICHRICOOCRORCCIOOIHOIR bridge$copy();

   void bridge$setRepairCost(int var1);

   Map<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH, Integer> bridge$getEnchantments();

   void bridge$setEnchantments(
      Map<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH, Integer> var1
   );

   default @Range(from = 0L, to = 255L) int RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1
   ) {
      for (Entry var3 : this.bridge$getEnchantments().entrySet()) {
         if (((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var3.getKey())
            .bridge$isEnchantment(var1)) {
            return (Integer)var3.getValue();
         }
      }

      return 0;
   }

   void bridge$setProfile(@Nullable UUID var1, String var2, String var3);

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 6)
   void bridge$setPotionEffects(List<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HICRRICCHCCROOHHCHOCOCCHOIHHOC.IRCIIHHICIHRCOCRROCOICRIHHCCHH> var1);

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 26)
   void bridge$setItemModel(RCIROOOOICRHCCRRCIORHHIRCOIIIC var1);

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
   void bridge$setArmorColor(int var1);

   IIRHCHHOICHRICOOCRORCCIOOIHOIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH bridge$getItemUseAction();

   int bridge$getMaxItemUseDuration();

   boolean bridge$areItemsEqual(IIRHCHHOICHRICOOCRORCCIOOIHOIR var1);

   boolean bridge$areItemsEqual(IIRHCHHOICHRICOOCRORCCIOOIHOIR var1, BiPredicate<IIRHCHHOICHRICOOCRORCCIOOIHOIR, IIRHCHHOICHRICOOCRORCCIOOIHOIR> var2);

   String bridge$getUnlocalizedName();

   List<String> bridge$getTooltip(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1,
      boolean var2
   );

   List<Component> bridge$getTooltipComponents(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1,
      boolean var2
   );

   void bridge$setTagCompound(com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1);

   com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH bridge$getTagCompound();

   Optional<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH> bridge$saveTagCompound();

   @Nullable
   default <T> T bridge$getDataComponent(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH<T> var1
   ) {
      return (T)var1.bridge$get(this);
   }

   @Nullable
   default <T> T bridge$getPatchedDataComponent(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH<T> var1
   ) {
      return (T)var1.bridge$get(this);
   }

   boolean bridge$isItemEnchanted();

   boolean bridge$hasFoil();

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 22)
   void bridge$setFoil(boolean var1);

   Optional<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH> bridge$getFood();

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 25)
   Optional<RHOCHHIRRCHHHOHOIRROIROHHHIHIO> bridge$getMaterial();

   Optional<String> bridge$getBannerColor();

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1, max = 5)
   void bridge$setBannerColor(String var1);

   boolean bridge$isItemEqual(IIRHCHHOICHRICOOCRORCCIOOIHOIR var1);

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 33)
   void bridge$setSkyBlockExtraAttributes(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
   );

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 33)
   void bridge$sbHideTooltipComponents();

   @Nullable
   List<IIRHCHHOICHRICOOCRORCCIOOIHOIR> bridge$getContainerItems();

   boolean bridge$isItemCubeBlock();

   boolean bridge$isCrossbowFullyCharged();

   boolean bridge$isItemSplashPotion();

   void bridge$setDyedColor(int var1);

   boolean bridge$canElytraFly();

   @Nullable
   default RIOOCHICIHRHOHCCCCCHOCCCOHCRHI bridge$getKineticWeaponPhases() {
      return null;
   }

   enum RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      NONE,
      EAT,
      DRINK,
      BLOCK,
      BOW,
      SPEAR,
      CROSSBOW,
      SPYGLASS,
      TOOT_HORN,
      BRUSH,
      BUNDLE,
      TRIDENT;

      public boolean isConsumable() {
         return this == EAT || this == DRINK;
      }
   }
}
