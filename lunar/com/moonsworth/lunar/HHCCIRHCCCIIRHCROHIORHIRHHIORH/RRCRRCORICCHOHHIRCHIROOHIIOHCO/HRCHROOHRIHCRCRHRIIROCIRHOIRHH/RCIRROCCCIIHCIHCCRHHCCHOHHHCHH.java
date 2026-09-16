package com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.CRHROHHHCIHHCOHCOORCRIHHIICROR;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import java.util.Optional;
import org.jetbrains.annotations.Nullable;
import org.joml.Vector3d;

public interface RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   extends com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   @Nullable
   RCIROOOOICRHCCRRCIORHHIRCOIIIC bridge$getCapeLocation();

   void bridge$setCapeLocation(RCIROOOOICRHCCRRCIORHHIRCOIIIC var1);

   void bridge$setSkinLocation(RCIROOOOICRHCCRRCIORHHIRCOIIIC var1, String var2);

   void bridge$setCapeLocationOverride(RCIROOOOICRHCCRRCIORHHIRCOIIIC var1);

   default boolean bridge$isOptifineCape() {
      return false;
   }

   Optional<String> bridge$loadAndGetRealSkinType();

   float bridge$getSwingProgress(float var1);

   void bridge$setSkinLocationOverride(@Nullable RCIROOOOICRHCCRRCIORHHIRCOIIIC var1, String var2);

   RCIROOOOICRHCCRRCIORHHIRCOIIIC bridge$getLocationSkinDefault();

   @Override
   Optional<String> bridge$getTeamName();

   default CRHROHHHCIHHCOHCOORCRIHHIICROR bridge$getLastReportedLookAngle() {
      return this.RCRCIHCOCOOORIRCOHHOIOHROOOHOC();
   }

   default Vector3d bridge$getLastReportedPos() {
      return this.bridge$getPosition();
   }
}
