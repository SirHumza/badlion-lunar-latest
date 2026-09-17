package com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import java.util.ArrayList;
import java.util.List;

public class HHRIICOIOORCHCOIICOOIHIRHHICRI<T extends Number & Comparable<T>>
   extends ICICIOCHHHIHOCHCOHORIHRCOHHOCR<com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.IHICORCROOROHCIHIHCOIHRRHICICO<T>>
   implements com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CRRRICCRROCOHHOHIICIHORCOORRRH {
   private final List<RHRRHOHCRCHCCRRHOHHIRCCHOCICHC> OROHHRIICHCIOOOIOICCCOHROCHROH = new ArrayList<>();

   public HHRIICOIOORCHCOIICOOIHIRHHICRI(
      com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.IHICORCROOROHCIHIHCOIHRRHICICO<T> var1,
      com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2
   ) {
      super(var1, var2);

      for (int var3 = 0; var3 < ((List)var1.get()).size(); var3++) {
         RHRRHOHCRCHCCRRHOHHIRCCHOCICHC var4 = new RHRRHOHCRCHCCRRHOHHIRCCHOCICHC(this, this.option.RRICRRCHRHCCOOHCHHCRCCIRRICRHO(var3));
         var4.IIOCHOIICCIORCOROIROHICCHIOHIC(var4::getText);
         var4.IOHIHIIHCCCCCIHRORIOIOORCIOHII(
            var2x -> {
               int var3x = var2x.indexOf(46);
               if (var3x >= 0) {
                  int var4x = var2x.indexOf(46, var3x + 1);
                  if (var4x >= 0) {
                     return;
                  }
               }

               var2x = (var2x.startsWith("-") ? "-" : "") + var2x.replaceAll("[^0-9.]", "");
               var2x = com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CIOHHCORHRCCRICCCORIHCRHCCCRRR.OHOCCRHCROCIHHCRRRROOHROHOROIC
                  .IRCIIHHICIHRCOCRROCOICRIHHCCHH(var2x, 50.0);
               var4.HICRRICCHCCROOHHCHOCOCCHOIHHOC(var2x, true);
               this.CICCCORIIOOOIIHOHRICCIHRHHIHOH();
            }
         );
         var4.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR(var2x -> {
            if (!var2x) {
               try {
                  ArrayList var3x = new ArrayList();

                  for (RHRRHOHCRCHCCRRHOHHIRCCHOCICHC var5 : this.OROHHRIICHCIOOOIOICCCOHROCHROH) {
                     var3x.add(Double.parseDouble(var5.getText()));
                  }

                  var1.HCCCCIHIOIHCHCCHOOHHCIHRCRRRHH(var3x);
               } catch (NumberFormatException var6) {
               }
            }
         });
         this.OROHHRIICHCIOOOIOICCCOHROCHROH.add(var4);
      }

      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH((var2x, var3x) -> {
         int var4x = 0;

         for (RHRRHOHCRCHCCRRHOHHIRCCHOCICHC var6 : this.OROHHRIICHCIOOOIOICCCOHROCHROH) {
            if (var6.isActive()) {
               if (var6.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var2x)) {
                  var6.IHHCHHHCRIHOOCOIOOCRIIICIOROIR(var2x, var3x);
                  return true;
               }

               var6.RRCRRCORICCHOHHIRCHIROOHIIOHCO(() -> false);
               var6.RHCHICHORHCRCCRCIRCRCIHOOCIOHC().accept(false);
               return true;
            }

            if (var6.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var2x) && !var6.isActive()) {
               var6.HICRRICCHCCROOHHCHOCOCCHOIHHOC(var1.RRICRRCHRHCCOOHCHHCRCCIRRICRHO(var4x), true);
               var6.RHCHICHORHCRCCRCIRCRCIHOOCIOHC().accept(true);
               var6.RRCRRCORICCHOHHIRCHIROOHIIOHCO(() -> true);
               var6.setActive(true);
               return true;
            }

            var4x++;
         }

         return false;
      });
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH((var1x, var2x) -> {
         for (RHRRHOHCRCHCCRRHOHHIRCCHOCICHC var4x : this.OROHHRIICHCIOOOIOICCCOHROCHROH) {
            if (var4x.isActive() && !var4x.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1x)) {
               var4x.RRCRRCORICCHOHHIRCHIROOHIIOHCO(() -> false);
               var4x.RHCHICHORHCRCCRCIRCRCIHOOCIOHC().accept(false);
               return true;
            }
         }

         return false;
      });
   }

   @Override
   public void IRRCCOICORICIHCHRHIHIHROIRHOCR(float var1, float var2, float var3) {
      super.IRRCCOICORICIHCHRHIHIHROIRHOCR(var1, var2, var3);
      int var4 = Math.min((int)this.height, 12);

      for (RHRRHOHCRCHCCRRHOHHIRCCHOCICHC var6 : this.OROHHRIICHCIOOOIOICCCOHROCHROH) {
         var6.OHHRIOHROOIHOROCIRHCHORIHRRRRI(var1 + var3 / 3.0F, var2 + (this.height - var4) / 2.0F, 16.0F, var4);
         var1 += 20.0F;
      }

      this.CICCCORIIOOOIIHOHRICCIHRHHIHOH();
   }

   private void CICCCORIIOOOIIHOHRICCIHRHHIHOH() {
      int var1 = 0;

      for (RHRRHOHCRCHCCRRHOHHIRCCHOCICHC var3 : this.OROHHRIICHCIOOOIOICCCOHROCHROH) {
         float var4 = com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CIOHHCORHRCCRICCCORIHCRHCCCRRR.OHOCCRHCROCIHHCRRRROOHROHOROIC
               .IOOOHRRHCHICHHHCRIRHIICORRCIRO(var3.getText())
            + 12.0F;
         if (var4 < 16.0F) {
            var4 = 16.0F;
         }

         if (var4 > 60.0F) {
            var4 = 60.0F;
         }

         var3.IHRHHHORORIROOCORCIORRCOCHHHRI(var4);
         var3.setX(var1 + this.x + this.width / 3.0F);
         var3.OCICOOCOOOIRCCORCOCIRCCRRHIHRC().OIIHROORCRORRRCOICCCHIOIHIHHRC(0);
         var1 += (int)(var3.getWidth() + 4.0F);
      }
   }

   @Override
   public float getHeight() {
      return this.getOption().isHidden() ? 0.0F : 14.0F;
   }

   @Override
   public void update() {
      for (RHRRHOHCRCHCCRRHOHHIRCCHOCICHC var2 : this.OROHHRIICHCIOOOIOICCCOHROCHROH) {
         var2.update();
         if (var2.isActive() && !var2.OOIROOORICRIOHHROHORHIHCCRHORC().getAsBoolean()) {
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RHCICHRICRIIIHRRCICHOOOIOOOICH()
               .IHIRRIIORRHORHRORIHOROIRCORCOO(false);
            var2.setActive(false);
         }
      }
   }

   @Override
   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2,
      boolean var3
   ) {
      com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CIOHHCORHRCCRICCCORIHCRHCCCRRR.OHOIIIRRIHCRIRRCHHIRIOROHIIHIO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, this.option.getName(), this.x, this.y + 1.5F, -4079426);
      int var4 = 0;
      float var5 = this.x;

      for (RHRRHOHCRCHCCRRHOHHIRCCHOCICHC var7 : this.OROHHRIICHCIOOOIOICCCOHROCHROH) {
         if (var7.isActive()) {
            var7.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, var2, var3);
         } else {
            com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var8 = com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CIOHHCORHRCCRICCCORIHCRHCCCRRR.RORHCRCHOHHIRCCCICIIHIHCIORCHR();
            String var9 = this.option.RRICRRCHRHCCOOHCHHCRCCIRRICRHO(var4);
            float var10 = var8.IOOOHRRHCHICHHHCRIRHIICORRCIRO(var9);
            var8.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var9, var5 + this.width / 3.0F, this.y + this.height / 2.0F - var8.getHeight() / 2 - 2.0F, -1879048193);
            var5 += var10 + 10.0F;
         }

         var4++;
      }
   }

   @Override
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      char var1, com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2
   ) {
      for (RHRRHOHCRCHCCRRHOHHIRCCHOCICHC var4 : this.OROHHRIICHCIOOOIOICCCOHROCHROH) {
         var4.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2);
      }
   }

   @Override
   public boolean isEditing() {
      for (RHRRHOHCRCHCCRRHOHHIRCCHOCICHC var2 : this.OROHHRIICHCIOOOIOICCCOHROCHROH) {
         if (var2.isActive()) {
            return true;
         }
      }

      return false;
   }

   @Override
   public void close() {
   }
}
