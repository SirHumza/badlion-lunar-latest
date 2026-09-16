package com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import java.util.List;

public class HRCHROOHRIHCRCRHRIIROCIRHOIRHH implements CRICCOOHHHCHOORCICOCOHIHOIRHOO {
   @Override
   public RCIROOOOICRHCCRRCIORHHIRCOIIIC HOCROCHROIIRROICRICOICHOIICRHH() {
      return RCIROOOOICRHCCRRCIORHHIRCOIIIC.create("lunar", "backgrounds/new_year/splash.png");
   }

   @Override
   public RCIROOOOICRHCCRRCIORHHIRCOIIIC CRCCOCCHOIOOORRCHCCORCHOIICCCC() {
      return RCIROOOOICRHCCRRCIORHHIRCOIIIC.create("lunar", "backgrounds/new_year/panorama");
   }

   @Override
   public String name() {
      return "new_year";
   }

   @Override
   public List<String> additions() {
      return List.of("fireworks", "countdown");
   }
}
