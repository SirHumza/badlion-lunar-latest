package com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import java.util.List;

public class HICHRCOHCCRHOHCICOOCHOIHCCHIRI
   extends ICICIOCHHHIHOCHCOHORIHRCOHHOCR<com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HICRRICCHCCROOHHCHOCOCCHOIHHOC> {
   private final ROOCOCCCIRHHHIRIOIHHHHRHIICHHR HCCROIHIROOHRCCCHHOIHHOHRRHCHI = new ROOCOCCCIRHHHIRIOIHHHHRHIICHHR(
      this,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.create(
         "lunar", "icons/settings/arrow-left-18x18.png"
      ),
      4.5F
   );
   private final ROOCOCCCIRHHHIRIOIHHHHRHIICHHR RORRIRCRCOOCOOIOORROHRHOCOIORC = new ROOCOCCCIRHHHIRIOIHHHHRHIICHHR(
      this,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC.create(
         "lunar", "icons/settings/arrow-right-18x18.png"
      ),
      4.5F
   );

   public HICHRCOHCCRHOHCICOOCHOIHCCHIRI(
      com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HICRRICCHCCROOHHCHOCOCCHOIHHOC var1,
      com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2
   ) {
      super(var1, var2);
      this.HCCROIHIROOHRCCCHHOIHHOHRRHCHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH((var1x, var2x) -> {
         List var3;
         try {
            var3 = var1.CCCIIICOHOOCCCHCHCOCROCOOHRIRR().call();
         } catch (Exception var5) {
            throw new RuntimeException(var5);
         }

         if (var3.isEmpty()) {
            return true;
         }

         int var4 = Math.max(0, var3.indexOf(var1.get()));
         if (var4 - 1 < 0) {
            var1.RHRIIOOOCRHIIOORCOCRCHRCCRRCIH((String)var3.get(var3.size() - 1));
         } else {
            var1.RHRIIOOOCRHIIOORCOCRCHRCCRRCIH((String)var3.get(var4 - 1));
         }

         return true;
      });
      this.RORRIRCRCOOCOOIOORROHRHOCOIORC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH((var1x, var2x) -> {
         List var3;
         try {
            var3 = var1.CCCIIICOHOOCCCHCHCOCROCOOHRIRR().call();
         } catch (Exception var5) {
            throw new RuntimeException(var5);
         }

         if (var3.isEmpty()) {
            return true;
         }

         int var4 = Math.max(0, var3.indexOf(var1.get()));
         if (var4 + 1 >= var3.size()) {
            var1.RHRIIOOOCRHIIOORCOCRCHRCCRRCIH((String)var3.get(0));
         } else {
            var1.RHRIIOOOCRHIIOORCOCRCHRCCRRCIH((String)var3.get(var4 + 1));
         }

         return true;
      });
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         (var1x, var2x) -> {
            if (this.HCCROIHIROOHRCCCHHOIHHOHRRHCHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1x)) {
               return this.HCCROIHIROOHRCCCHHOIHHOHRRHCHI.IHHCHHHCRIHOOCOIOOCRIIICIOROIR(var1x, var2x);
            } else {
               return this.RORRIRCRCOOCOOIOORROHRHOCOIORC.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1x)
                  ? this.RORRIRCRCOOCOOIOORROHRHOCOIORC.IHHCHHHCRIHOOCOIOOCRIIICIOROIR(var1x, var2x)
                  : false;
            }
         }
      );
   }

   @Override
   public void IRRCCOICORICIHCHRHIHIHROIRHOCR(float var1, float var2, float var3) {
      super.OHHRIOHROOIHOROCIRHCHORIHRRRRI(var1, var2, var3, this.getHeight());
      this.HCCROIHIROOHRCCCHHOIHHOHRRHCHI.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH(var1 + var3 - 155.0F, var2);
      this.RORRIRCRCOOCOOIOORROHRHOCOIORC.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH(var1 + var3 - 30.0F, var2);
   }

   @Override
   public float getHeight() {
      return this.getOption().isHidden() ? 0.0F : 14.0F;
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
      com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CIOHHCORHRCCRICCCORIHCRHCCCRRR.OHOIIIRRIHCRIRRCHHIRIOROHIIHIO()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, this.option.getName(), this.x, this.y + 1.5F, -4079426);
      this.HCCROIHIROOHRCCCHHOIHHOHRRHCHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, var2, var3);
      this.RORRIRCRCOOCOOIOORROHRHOCOIORC.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, var2, var3);
      String var4 = this.option.RROHIRHRIHOOHOHOICCROIOHOOOOIH() != null
         ? this.option.RROHIRHRIHOOHOHOICCROIOHOOOOIH().apply(this.option.get())
         : this.option.get();
      if (com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CIOHHCORHRCCRICCCORIHCRHCCCRRR.IOIHCHOOHORCORHHHCHCORHORHCOOC()
            .IOOOHRRHCHICHHHCRIRHIICORRCIRO(var4)
         > 110.0F) {
         var4 = com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CIOHHCORHRCCRICCCORIHCRHCCCRRR.IOIHCHOOHORCORHHHCHCORHORHCOOC()
               .IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                  var4,
                  110.0F
                     - com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CIOHHCORHRCCRICCCORIHCRHCCCRRR.IOIHCHOOHORCORHHHCHCORHORHCOOC()
                        .IOOOHRRHCHICHHHCRIRHIICORRCIRO("...")
               )
            + "...";
      }

      com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CIOHHCORHRCCRICCCORIHCRHCCCRRR.IOIHCHOOHORCORHHHCHCORHORHCOOC()
         .IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, var4, this.x + this.width - 84.0F, this.y + 2.5F, -1346256706);
   }

   @Override
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      char var1, com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2
   ) {
   }

   @Override
   public void close() {
   }

   @Override
   public boolean RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
      com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
   ) {
      return this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1) && var1.ICORIROICCORCRROCRCIRRRHHHOOIR() < this.HCCROIHIROOHRCCCHHOIHHOHRRHCHI.getX() - 5.0F;
   }
}
