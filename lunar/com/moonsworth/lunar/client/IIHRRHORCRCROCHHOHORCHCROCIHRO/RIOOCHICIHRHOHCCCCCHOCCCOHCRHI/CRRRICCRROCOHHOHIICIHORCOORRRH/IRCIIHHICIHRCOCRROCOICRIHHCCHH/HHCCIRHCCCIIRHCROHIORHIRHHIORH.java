package com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import java.util.List;

public class HHCCIRHCCCIIRHCROHIORHIRHHIORH implements CRICCOOHHHCHOORCICOCOHIHOIRHOO {
   @Override
   public RCIROOOOICRHCCRRCIORHHIRCOIIIC HOCROCHROIIRROICRICOICHOIICRHH() {
      return RCIROOOOICRHCCRRCIORHHIRCOIIIC.create("lunar", "backgrounds/christmas/splash.png");
   }

   @Override
   public RCIROOOOICRHCCRRCIORHHIRCOIIIC CRCCOCCHOIOOORRCHCCORCHOIICCCC() {
      return RCIROOOOICRHCCRRCIORHHIRCOIIIC.create("lunar", "backgrounds/christmas/panorama");
   }

   @Override
   public String name() {
      return "christmas";
   }

   @Override
   public List<String> additions() {
      return List.of("santaHat", "snow", "radio");
   }
}
