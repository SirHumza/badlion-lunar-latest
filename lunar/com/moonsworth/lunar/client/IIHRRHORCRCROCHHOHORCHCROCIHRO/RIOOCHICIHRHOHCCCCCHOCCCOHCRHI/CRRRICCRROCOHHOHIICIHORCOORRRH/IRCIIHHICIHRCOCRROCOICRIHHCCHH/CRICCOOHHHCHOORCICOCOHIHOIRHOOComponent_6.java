package com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import java.util.List;

public class RIOOCHICIHRHOHCCCCCHOCCCOHCRHI implements CRICCOOHHHCHOORCICOCOHIHOIRHOO {
   @Override
   public RCIROOOOICRHCCRRCIORHHIRCOIIIC HOCROCHROIIRROICRICOICHOIICRHH() {
      return RCIROOOOICRHCCRRCIORHHIRCOIIIC.create("lunar", "backgrounds/japan/splash.png");
   }

   @Override
   public RCIROOOOICRHCCRRCIORHHIRCOIIIC CRCCOCCHOIOOORRCHCCORCHOIICCCC() {
      return RCIROOOOICRHCCRRCIORHHIRCOIIIC.create("lunar", "backgrounds/japan/panorama");
   }

   @Override
   public String name() {
      return "japan";
   }

   @Override
   public List<String> additions() {
      return List.of("cherry-blossom");
   }
}
