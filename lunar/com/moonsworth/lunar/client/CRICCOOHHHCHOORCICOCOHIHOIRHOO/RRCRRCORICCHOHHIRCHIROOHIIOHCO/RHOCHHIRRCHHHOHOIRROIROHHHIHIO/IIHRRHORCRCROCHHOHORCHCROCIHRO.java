package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHOCHHIRRCHHHOHOIRROIROHHHIHIO;

import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HICRRICCHCCROOHHCHOCOCCHOIHHOC;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HCHRIROHHHCORIOCROOCHRCIOROOCI;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.IOHHOIIOCRHCHHCRORICCOHOHROOIH;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.OHHRIOHROOIHOROCIRHCHORIHRRRRI;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map.Entry;

public class IIHRRHORCRCROCHHOHORCHCROCIHRO extends com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   public IIHRRHORCRCROCHHOHORCHCROCIHRO() {
      super(false);
   }

   @Override
   public String getId() {
      return "OPTION_DUMP_MOD";
   }

   @Override
   protected com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI ORIRHOHRHHROCHHRRIOOCRIHRIIIOC() {
      return com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CIICCCRRHHCHRRHRIRCHOICCHROHCR()
         .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CCCIRORHIRRORROOOOCCHCRIORHOIC
         )
         .OOROOCCIRCCRHOIOIORIHCHHOOCCOR("FX")
         .RRCRRCORICCHOHHIRCHIROOHIIOHCO(this);
   }

   @Override
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
   ) {
      var1.CRRRICCRROCOHHOHIICIHORCOORRRH(
         IOHHOIIOCRHCHHCRORICCOHOHROOIH.OHCIIRROIRICICHOIORRIIHICCCRCH("dumpAllOptionManagerStructures")
            .RCIROOOOICRHCCRRCIORHHIRCOIIIC(this::CCHHHOIICIRCIICIIRORIOOOICRHHO)
            .CIOORRCRICOIICROHRHRHHOHRCCRII(200.0F),
         IOHHOIIOCRHCHHCRORICCOHOHROOIH.OHCIIRROIRICICHOIORRIIHICCCRCH("dumpAllFeatureStructures")
            .RCIROOOOICRHCCRRCIORHHIRCOIIIC(this::HCCRHCICRHRCCRICCIRRROHHRCOROH)
            .CIOORRCRICOIICROHRHRHHOHRCCRII(200.0F)
      );
   }

   private void CCHHHOIICIRCIICIIRORIOOOICRHHO() {
      Path var1 = Paths.get("./optionManagerStructure_dump.txt");

      try (FileWriter var2 = new FileWriter(var1.toFile())) {
         for (Entry var4 : IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHHIHROORHHOOCCOOCHRIRHRHCRHIH()
            .RHHCIRRROCHIIHOCRIIHIHOOCCCRCR()
            .entrySet()) {
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;

            for (HCHRIROHHHCORIOCROOCHRCIOROOCI var10 : ((com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.CRRRICCRROCOHHOHIICIHORCOORRRH)var4.getValue())
               .OHHRCRIOOCIORORHIOHRICRHHORCIH()) {
               if (!var10.getId().isEmpty()) {
                  if (var10 instanceof ROOCOCCCIRHHHIRIOIHHHHRHIICHHR) {
                     var6++;
                  } else if (var10 instanceof OHHRIOHROOIHOROCIRHCHORIHRRRRI) {
                     var7++;
                  } else if (var10.ICICIOCHHHIHOCHCOHORIHRCOHHOCR(
                     com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.CHOCCRCCIRIHOROCHHICOHHHOICHHH
                  )) {
                     var5++;
                  }

                  var8++;
               }
            }

            var2.write(
               ((com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CIOHHCORHRCCRICCCORIHCRHCCCRRR)var4.getKey()).name()
                  + "(categories: "
                  + var6
                  + ", options: "
                  + var8
                  + ", sliders: "
                  + var5
                  + ", colors: "
                  + var7
                  + ")\n"
            );

            for (HCHRIROHHHCORIOCROOCHRCIOROOCI var15 : ((com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.CRRRICCRROCOHHOHIICIHORCOORRRH)var4.getValue())
               .OORCORROHROCOROORCCHIHIOIIHCOO()) {
               this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, 1, var15);
            }
         }
      } catch (IOException var13) {
         System.out.println("An error occurred while writing to the file: " + var13.getMessage());
      }
   }

   private void HCCRHCICRHRCCRICCIRRROHHRCOROH() {
      Path var1 = Paths.get("./featureStructure_dump.txt");

      try (FileWriter var2 = new FileWriter(var1.toFile())) {
         for (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4 : IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
            .OHHRCRIOOCIORORHIOHRICRHHORCIH()) {
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, 0, var4);
         }
      } catch (IOException var7) {
         System.out.println("An error occurred while writing to the file: " + var7.getMessage());
      }
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      FileWriter var1, int var2, com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3
   ) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO var4 = var3.IHCRORHRORIICHRHRCHRRIRRHHOCOO(
         HICRRICCHCCROOHHCHOCOCCHOIHHOC.IICCRHIHRIHOHICHCRIROICOICROOR
      );
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IHHCHHHCRIHOOCOIOOCRIIICIOROIR var5 = var3.IHCRORHRORIICHRHRCHRRIRRHHOCOO(
         HICRRICCHCCROOHHCHOCOCCHOIHHOC.IRHCCHCRHIHOCRICOHOIICHCHOHICC
      );
      int var6 = 0;
      int var7 = 0;
      int var8 = 0;
      int var9 = 0;
      if (var5 != null) {
         for (HCHRIROHHHCORIOCROOCHRCIOROOCI var11 : var5.CRCOOHOOOCRICHRCCIOCCIRCCOHCRO()) {
            if (!var11.getId().isEmpty()) {
               if (var11 instanceof ROOCOCCCIRHHHIRIOIHHHHRHIICHHR) {
                  var7++;
               } else if (var11 instanceof OHHRIOHROOIHOROCIRHCHORIHRRRRI) {
                  var8++;
               } else if (var11.ICICIOCHHHIHOCHCOHORIHRCOHHOCR(
                  com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.CHOCCRCCIRIHOROCHHICOHHHOICHHH
               )) {
                  var6++;
               }

               var9++;
            }
         }
      }

      var1.write(
         "  ".repeat(var2)
            + var3.getId()
            + " (children: "
            + (var4 != null ? var4.getChildren().size() : 0)
            + ", categories: "
            + var7
            + ", options: "
            + var9
            + ", sliders: "
            + var6
            + ", colors: "
            + var8
            + ")\n"
      );
      if (var4 != null) {
         for (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var14 : var4.getChildren()) {
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2 + 2, var14);
         }
      }

      if (var5 != null) {
         for (HCHRIROHHHCORIOCROOCHRCIOROOCI var15 : var5.HHCIIIIRHRRCHOOCOIRRIROIOOOOOH()) {
            if (!var15.getId().isEmpty()) {
               this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2 + 1, var15);
            }
         }
      }
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(FileWriter var1, int var2, HCHRIROHHHCORIOCROOCHRCIOROOCI<?> var3) {
      var1.write(
         "  ".repeat(var2)
            + "- "
            + var3.getId()
            + (
               var3 instanceof ROOCOCCCIRHHHIRIOIHHHHRHIICHHR
                  ? " Category"
                  : (
                     var3.ICICIOCHHHIHOCHCOHORIHRCOHHOCR(
                           com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.CHOCCRCCIRIHOROCHHICOHHHOICHHH
                        )
                        ? " Slider"
                        : ""
                  )
            )
            + "\n"
      );

      for (HCHRIROHHHCORIOCROOCHRCIOROOCI var5 : var3.getChildren()) {
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2 + 1, var5);
      }
   }
}
