package com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import java.util.List;
import java.util.UUID;
import org.jetbrains.annotations.Nullable;

public interface HRCHROOHRIHCRCRHRIIROCIRHOIRHH extends CRRRICCRROCOHHOHIICIHORCOORRRH {
   default String bridge$getSkinType() {
      return "default";
   }

   boolean bridge$isSpectator();

   @Override
   int bridge$getEntityId();

   String bridge$getName();

   boolean bridge$isUsingItem();

   boolean bridge$isRiding();

   boolean bridge$showHat();

   boolean bridge$showJacket();

   boolean bridge$showLeftPants();

   boolean bridge$showRightPants();

   boolean bridge$showLeftSleeve();

   boolean bridge$showRightSleeve();

   boolean bridge$showCape();

   HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH bridge$getPlayerType();

   UUID bridge$getUniqueID();

   com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH bridge$getBoundingBox();

   boolean bridge$isSkinTextureUploaded();

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 26)
   default void bridge$setSkinTextureUploaded(boolean var1) {
   }

   default RCIROOOOICRHCCRRCIORHHIRCOIIIC bridge$getLocationSkin() {
      return null;
   }

   default RCIROOOOICRHCCRRCIORHHIRCOIIIC bridge$getLocationSkinNoOverride() {
      return null;
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 26)
   default void bridge$setLocationSkin(RCIROOOOICRHCCRRCIORHHIRCOIIIC var1) {
   }

   boolean bridge$isEmoting();

   @Nullable
   <C> C bridge$getEmoteController();

   @Nullable
   <C> List<C> bridge$getWornCosmetics();

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 26)
   @Nullable
   RCIRROCCCIIHCIHCCRHHCCHOHHHCHH bridge$getClothCloakState();

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 6)
   @Nullable
   RCIRROCCCIIHCIHCCRHHCCHOHHHCHH bridge$getBakedHelmetModel();

   default boolean bridge$isSelf() {
      return this.bridge$getPlayerType() == HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.SELF;
   }

   default boolean IHHRIHOOOHHHROCIHOCCRHIIIIOHRH() {
      return this.bridge$isDummySelf() || this.bridge$isDummyMannequin();
   }

   default boolean bridge$isDummySelf() {
      return this.bridge$getPlayerType() == HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.DUMMY_SELF;
   }

   default boolean bridge$isDummyMannequin() {
      return this.bridge$getPlayerType() == HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.DUMMY_MANNEQUIN;
   }

   default void bridge$setLunarLogoNameTagWorkaround(boolean var1) {
   }

   default void bridge$setLunarBadgeNameTagWorkaround(boolean var1) {
   }

   default boolean bridge$isMainHandSwapped() {
      return false;
   }

   enum RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      DUMMY_SELF,
      DUMMY_MANNEQUIN,
      MANNEQUIN,
      SELF,
      OTHER;
   }
}
