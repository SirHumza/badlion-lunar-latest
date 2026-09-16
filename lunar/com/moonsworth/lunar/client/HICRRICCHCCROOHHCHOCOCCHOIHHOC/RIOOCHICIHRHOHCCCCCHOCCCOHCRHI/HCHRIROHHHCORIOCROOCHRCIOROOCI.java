package com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.RIHOOCIHRICOCHRHCOOCCOIHOCHRCR;
import io.netty.util.concurrent.DefaultThreadFactory;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import lombok.Generated;

public class HCHRIROHHHCORIOCROOCHRCIOROOCI {
   private static final ExecutorService COOIHCIHHIROROOHOHRRIRHRCRROCO = Executors.newSingleThreadExecutor(
      new DefaultThreadFactory("lunar-streamer-mode-thread", true)
   );
   private final HCHRIROHHHCORIOCROOCHRCIOROOCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH IRROCCOCOCHOIHCHOHHOIICCICCCIR = new HCHRIROHHHCORIOCROOCHRCIOROOCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();
   private boolean OOOCOROHHOIORRRHRCORHRHORIHIRO = false;
   private long IOHIRCCROHIRHHHOCROHCCRIRCRCRI = 0L;

   public HCHRIROHHHCORIOCROOCHRCIOROOCI() {
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
         .HHCCIRHCCCIIRHCROHIORHIRHHIORH(
            com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIROICHCRROROHCCROOCCCCOCHCCRI.class,
            this::CIOHHCORHRCCRICCCORIHCRHCCCRRR
         );
   }

   public boolean HRIIOOOROORRCHOHROCHHRCRIHHCOO() {
      com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHHIHROORHHOOCCOOCHRIRHRHCRHIH()
         .OHOHCHORHIIHCCOIHOHCCICRHHICIR();
      if (var1.OOICIIRIOHIIICHCIRIIRRIRORCCRH().get()) {
         return var1.HOHHCCCCHOOOOCRRIORRROCHIIHHCI().get() == HCHRIROHHHCORIOCROOCHRCIOROOCI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ALWAYS_ON
            ? true
            : this.OOOCOROHHOIORRRHRCORHRHORIHIRO;
      } else {
         return false;
      }
   }

   private void CIOHHCORHRCCRICCCORIHCRHCCCRRR(
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIROICHCRROROHCCROOCCCCOCHCCRI var1
   ) {
      if (System.currentTimeMillis() - this.IOHIRCCROHIRHHHOCROHCCRIRCRCRI >= 10000L) {
         this.IOHIRCCROHIRHHHOCROHCCRIRCRCRI = System.currentTimeMillis();
         if (!IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
            .HHHIHROORHHOOCCOOCHRIRHRHCRHIH()
            .OHOHCHORHIIHCCOIHOHCCICRHHICIR()
            .OOICIIRIOHIIICHCIRIIRRIRORCCRH()
            .get()) {
            this.OOOCOROHHOIORRRHRCORHRHORIHIRO = false;
         } else {
            COOIHCIHHIROROOHOHRRIRHRCRROCO.submit(
               () -> this.OOOCOROHHOIORRRHRCORHRHORIHIRO = this.IRROCCOCOCHOIHCHOHHOIICCICCCIR.HRIOOHCRHHOROIIROCHRHRHCHHCCOR()
            );
         }
      }
   }

   @Generated
   public boolean HRIOOHCRHHOROIIROCHRHRHCHHCCOR() {
      return this.OOOCOROHHOIORRRHRCORHRHORIHIRO;
   }

   public enum IRCIIHHICIHRCOCRROCOICRIHHCCHH
      implements com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.ORHIOICIOCRRHOOCOHRORIHICHRCRR,
      com.moonsworth.lunar.client.OHHRIOHROOIHOROCIRHCHORIHRRRRI.CRRRICCRROCOHHOHIICIHORCOORRRH {
      AUTOMATIC("automatic", "streamerModeAutomatic"),
      ALWAYS_ON("alwaysOn", "streamerModeAlwaysOn");

      private final String id;
      private final String description;

      @Override
      public String id() {
         return this.id;
      }

      @Override
      public String toString() {
         return this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.id);
      }

      @Override
      public String description() {
         return this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.description);
      }

      @Override
      public String getLanguagePath() {
         return "settings";
      }

      @Generated
      IRCIIHHICIHRCOCRROCOICRIHHCCHH(String var3, String var4) {
         this.id = var3;
         this.description = var4;
      }
   }

   static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      private final List<String> HRHIIRCHOCRIIOCOHRHIRIIRRIHRRH = List.of(
         "obs64.exe",
         "obs32.exe",
         "obs-studio.exe",
         "StreamlabsDesktop.exe",
         "XSplit.Core.exe",
         "xsplitcore.exe",
         "TwitchStudio.exe",
         "vMix.exe",
         "Wirecast.exe"
      );
      private final List<String> CIRCRRHRHRHHCROOCIIHOIRCRICHHH = List.of("OBS", "Wirecast", "Ecamm Live");
      private final List<String> RHOOCIOOHOIOOHROORIRCCCHIHCHRO = List.of("obs");

      public boolean HRIOOHCRHHOROIIROCHRHRHCHHCCOR() {
         List var1;
         if (RIHOOCIHRICOCHRHCOOCCOIHOCHRCR.isWindows()) {
            var1 = this.HRHIIRCHOCRIIOCOHRHIRIIRRIHRRH;
         } else if (RIHOOCIHRICOCHRHCOOCCOIHOCHRCR.isMacos()) {
            var1 = this.CIRCRRHRHRHHCROOCIIHOIRCRICHHH;
         } else {
            var1 = this.RHOOCIOOHOIOOHROORIRCCCHIHCHRO;
         }

         return ProcessHandle.allProcesses().anyMatch(var1x -> {
            Optional var2 = var1x.info().command();
            if (var2.isEmpty()) {
               return false;
            }

            for (String var4 : var1) {
               if (((String)var2.get()).toLowerCase().contains(var4.toLowerCase())) {
                  return true;
               }
            }

            return false;
         });
      }
   }
}
