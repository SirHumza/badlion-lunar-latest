package com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import lombok.Generated;

public class CRHROHHHCIHHCOHCOORCRIHHIICROR
   extends com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   private Runnable IIOHIHIIOOROOIRHRCCCICHIRRIHRR;
   private boolean state;
   private String text;

   public CRHROHHHCIHHCOHCOORCRIHHIICROR(
      com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1, boolean var2
   ) {
      this(var1, var2, "");
   }

   public CRHROHHHCIHHCOHCOORCRIHHIICROR(
      com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1, boolean var2, String var3
   ) {
      super(var1);
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH((var1x, var2x) -> {
         this.state = !this.state;
         if (this.IIOHIHIIOOROOIRHRCCCICHIRRIHRR != null) {
            this.IIOHIHIIOOROOIRHRCCCICHIRRIHRR.run();
         }

         return true;
      });
      this.state = var2;
      this.text = var3;
   }

   @Override
   public void update() {
   }

   @Override
   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2,
      boolean var3
   ) {
      com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CIOHHCORHRCCRICCCORIHCRHCCCRRR.IOIHCHOOHORCORHHHCHCORHORHCOOC()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, this.text, this.x + 13.0F, this.y + 1.5F, -4079426);
      com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         var1,
         this.x + 3.0F,
         this.y + 2.0F,
         8.0F,
         8.0F,
         4.0F,
         var3 && this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var2) ? -11561732 : -1437625092,
         true,
         true,
         true,
         true
      );
      com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var1, this.x + 4.0F, this.y + 3.0F, 6.0F, 6.0F, 2.0F, 905969663, true, true, true, true
      );
      if (this.state) {
         com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var1,
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.create(
               "lunar", "icons/settings/checked-14x14.png"
            ),
            3.0F,
            this.x + 4.0F,
            this.y + 2.6F,
            -1
         );
      }
   }

   @Override
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      char var1, com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2
   ) {
   }

   @Override
   public void close() {
   }

   @Generated
   public void ORHIOICIOCRRHOOCOHRORIHICHRCRR(Runnable var1) {
      this.IIOHIHIIOOROOIRHRCCCICHIRRIHRR = var1;
   }

   @Generated
   public boolean RROCCOHOIHHCCOHRHHOIRHIHOHOIIR() {
      return this.state;
   }
}
