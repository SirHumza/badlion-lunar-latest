package com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import java.util.function.Function;
import lombok.Generated;
import org.apache.commons.lang3.StringUtils;

public abstract class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   extends com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH
   implements com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CRRRICCRROCOHHOHIICIHORCOORRRH {
   private final com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH OHOORCHRCRHCIRICCHHRCHCICRHICR;
   private String text = "";
   private final String RCCOOIIICOIIRHIROHRIIOROHHHRCO;
   private int color;
   private int OORHHIIORHRCRHOICORCOIICCIIHIH;
   private int IIIOOICOHRRCRCCCROHHOOIORICICH;
   private int ROHRIRHHHRCORCIRCHCICIHCRICIHR = 256;
   private int IRCHOCHCRIOORIOOHCHOIOCHOHRROR;
   private int RHCRCHICRORHICCHIRROIHIHOCHHRR;
   private int ORHOOHRCIHIORCCRCOOOOCIROHRHCO;
   private int CIRCOOHCIRCCIOHRCOROCHOCCOCHCO;
   private boolean IHOIRIIICHICHORORIOCHHHCCHRHOO;
   private boolean HICHIIIIIHOIOIIOIICRHCHOHOIHIH = true;
   private boolean visible = true;
   private boolean IRHORCRHIRIORIRCIRIRIRIORICRRR = true;
   private boolean OOOOCOOIRIOCCOCIIOHRIIRRRRCHRR = true;
   private boolean isEnabled = true;
   private boolean IHCROCCROHRIHHCHRCRHRHORIRORCR = false;
   private Function<String, String> CIOCRCRRRHHCRHOCORCCHIICRHRROR = var0 -> var0;
   private boolean RIOOCIRIHOCHRRORIICOIICCCIHRRC;
   private Runnable ROIIHOOHIHHIHIHOOCHHHICRCHCHCI;
   private Runnable HIRCHIIHIHCOHHHOIRIHOIHRCCCRRR;
   public Runnable RICICOCICOHORICIOHCRCOROOCHHCH;
   private com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC OOIOHHIRCRHCHHOOICOCORRIIROHIH = null;

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC var2,
      com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3,
      String var4,
      int var5,
      int var6
   ) {
      this(var1, var3, var4, var5, var6);
      this.OOIOHHIRCRHCHHOOICOCORRIIROHIH = var2;
   }

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2,
      String var3,
      int var4,
      int var5
   ) {
      super(var1);
      this.OHOORCHRCRHCIRICCHHRCHCICRHICR = var2;
      this.RCCOOIIICOIIRHIROHRIIOROHHHRCO = var3;
      this.color = var4;
      this.IIIOOICOHRRCRCCCROHHOOIORICICH = 0;
      this.OORHHIIORHRCRHOICORCOIICCIIHIH = var5;
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         (var1x, var2x) -> {
            boolean var3x = this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1x);
            if (this.HICHIIIIIHOIOIIOIICRHCHOHOIHIH && var2x == 1 && var3x) {
               this.setText("");
            }

            if (this.OOOOCOOIRIOCCOCIIOHRIIRRRRCHRR) {
               this.CHIIIIIHRCROHOHHHRRIHHRIIICIIC(var3x);
            }

            if (this.RIOOCIRIHOCHRRORIICOIICCCIHRRC && var2x == 0) {
               float var4x = var1x.COCCOIROHORRRHIHICORRHRRORIIIH() - this.x;
               if (this.IRHORCRHIRIORIRCIRIRIRIORICRRR) {
                  var4x -= 4.0F;
               }

               if (this.OOIOHHIRCRHCHHOOICOCORRIIROHIH != null) {
                  var4x -= 12.0F;
               }

               String var5x = this.OHOORCHRCRHCIRICCHHRCHCICRHICR
                  .IRCIIHHICIHRCOCRROCOICRIHHCCHH(this.text.substring(this.ORHOOHRCIHIORCCRCOOOOCIROHRHCO), this.HIORICOHCICCORCHRRIIOOORHHCRRC());
               this.HHCCIOOCCCOCCIHCIIHHRRCIICOIHO(
                  this.OHOORCHRCRHCIRICCHHRCHCICRHICR.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var5x, var4x).length() + this.ORHOOHRCIHIORCCRCOOOOCIROHRHCO
               );
            }

            return true;
         }
      );
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH((var1x, var2x) -> {
         if (this.OIIHORORCCOHIICOHRRORHRIIOHIHH()) {
            this.CHIIIIIHRCROHOHHHRRIHHRIIICIIC(false);
         }

         return false;
      });
   }

   public void OIORIRCHRIIIICHOHOHRHIOHHOICRO() {
      this.CIRCOOHCIRCCIOHRCOROCHOCCOCHCO++;
   }

   public void setText(String var1) {
      if (var1.length() > this.ROHRIRHHHRCORCIRCHCICIHCRICIHR) {
         this.text = var1.substring(0, this.ROHRIRHHHRCORCIRCHCICIHCRICIHR);
      } else {
         this.text = var1;
      }

      this.RHOIRHOIOORCCIIHIIHHOHIHIOHIOI();
   }

   public String getText() {
      return this.text;
   }

   public String HICCCCHHCRHCOCOOICIHCCCROOIIIO() {
      int var1 = Math.min(this.IRCHOCHCRIOORIOOHCHOIOCHOHRROR, this.RHCRCHICRORHICCHIRROIHIHOCHHRR);
      int var2 = Math.max(this.IRCHOCHCRIOORIOOHCHOIOCHOHRROR, this.RHCRCHICRORHICCHIRROIHIHOCHHRR);
      return this.text.substring(var1, var2);
   }

   public void OCCHCOCHHRORORHICHRRHCCICCIIIH(String var1) {
      String var2 = "";
      String var3 = com.moonsworth.lunar.client.util.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.ORIRHOCICIIRCRHCHHRHOHIIHRHOCI(var1);
      var3 = this.CIOCRCRRRHHCRHOCORCCHIICRHRROR.apply(var3);
      int var4 = Math.min(this.IRCHOCHCRIOORIOOHCHOIOCHOHRROR, this.RHCRCHICRORHICCHIRROIHIHOCHHRR);
      int var5 = Math.max(this.IRCHOCHCRIOORIOOHCHOIOCHOHRROR, this.RHCRCHICRORHICCHIRROIHIHOCHHRR);
      int var6 = this.ROHRIRHHHRCORCIRCHCICIHCRICIHR - this.text.length() - (var4 - this.RHCRCHICRORHICCHIRROIHIHOCHHRR);
      if (this.text.length() > 0) {
         var2 = var2 + this.text.substring(0, var4);
      }

      int var7;
      if (var6 < var3.length()) {
         var2 = var2 + var3.substring(0, var6);
         var7 = var6;
      } else {
         var2 = var2 + var3;
         var7 = var3.length();
      }

      if (this.text.length() > 0 && var5 <= this.text.length()) {
         var2 = var2 + this.text.substring(var5);
      }

      this.text = var2;
      this.RHHHCHOOIIHHICCROOHOOIRIIIHHOC(var4 - this.RHCRCHICRORHICCHIRROIHIHOCHHRR + var7);
   }

   public void RICRHCHRRCCIICRCHICCIHHHCIICOH(int var1) {
      if (!this.text.isEmpty()) {
         if (this.RHCRCHICRORHICCHIRROIHIHOCHHRR != this.IRCHOCHCRIOORIOOHCHOIOCHOHRROR) {
            this.OCCHCOCHHRORORHICHRRHCCICCIIIH("");
         } else {
            this.ORHOOCIRIHHOCHHRIRIOIIICHOORCR(this.HRHRIHCHOHOOHHOOIOORHRRICHHCHI(var1) - this.IRCHOCHCRIOORIOOHCHOIOCHOHRROR);
         }
      }
   }

   public void ORHOOCIRIHHOCHHRIRIOIIICHOORCR(int var1) {
      if (!this.text.isEmpty()) {
         if (this.RHCRCHICRORHICCHIRROIHIHOCHHRR != this.IRCHOCHCRIOORIOOHCHOIOCHOHRROR) {
            this.OCCHCOCHHRORORHICHRRHCCICCIIIH("");
         } else {
            boolean var2 = var1 < 0;
            int var3 = var2 ? this.IRCHOCHCRIOORIOOHCHOIOCHOHRROR + var1 : this.IRCHOCHCRIOORIOOHCHOIOCHOHRROR;
            int var4 = var2 ? this.IRCHOCHCRIOORIOOHCHOIOCHOHRROR : this.IRCHOCHCRIOORIOOHCHOIOCHOHRROR + var1;
            String var5 = "";
            if (var3 >= 0) {
               var5 = this.text.substring(0, var3);
            }

            if (var4 < this.text.length()) {
               var5 = var5 + this.text.substring(var4);
            }

            this.text = var5;
            if (var2) {
               this.RHHHCHOOIIHHICCROOHOOIRIIIHHOC(var1);
            }
         }
      }
   }

   public int HRHRIHCHOHOOHHOOIOORHRRICHHCHI(int var1) {
      return this.RCOCRROHHROHHOCRCCCHCIROIIOORC(var1, this.HHHHIHCCCHCOCIHIHRHHCIRRHCICOC());
   }

   public int RCOCRROHHROHHOCRCCCHCIROIIOORC(int var1, int var2) {
      return this.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var1, var2, true);
   }

   public int HRCHROOHRIHCRCRHRIIROCIRHOIRHH(int var1, int var2, boolean var3) {
      boolean var4 = var1 < 0;
      int var5 = Math.abs(var1);

      for (int var6 = 0; var6 < var5; var6++) {
         if (!var4) {
            int var7 = this.text.length();
            var2 = this.text.indexOf(32, var2);
            if (var2 == -1) {
               var2 = var7;
            } else {
               while (var3 && var2 < var7 && this.text.charAt(var2) == ' ') {
                  var2++;
               }
            }
         } else {
            while (var3 && var2 > 0 && this.text.charAt(var2 - 1) == ' ') {
               var2--;
            }

            while (var2 > 0 && this.text.charAt(var2 - 1) != ' ') {
               var2--;
            }
         }
      }

      return var2;
   }

   public void RHHHCHOOIIHHICCROOHOOIRIIIHHOC(int var1) {
      this.HHCCIOOCCCOCCIHCIIHHRRCIICOIHO(this.RHCRCHICRORHICCHIRROIHIHOCHHRR + var1);
   }

   public void HHCCIOOCCCOCCIHCIIHHRRCIICOIHO(int var1) {
      this.IRCHOCHCRIOORIOOHCHOIOCHOHRROR = var1;
      int var2 = this.text.length();
      if (this.IRCHOCHCRIOORIOOHCHOIOCHOHRROR < 0) {
         this.IRCHOCHCRIOORIOOHCHOIOCHOHRROR = 0;
      }

      if (this.IRCHOCHCRIOORIOOHCHOIOCHOHRROR > var2) {
         this.IRCHOCHCRIOORIOOHCHOIOCHOHRROR = var2;
      }

      this.RRIOHRHHRHORRROIIRHRHROICRHCRO(this.IRCHOCHCRIOORIOOHCHOIOCHOHRROR);
      if (this.RICICOCICOHORICIOHCRCOROOCHHCH != null) {
         this.RICICOCICOHORICIOHCRCOROOCHHCH.run();
      }
   }

   public void HCRRCOIRRIHCICOROIRHRRIIHCHORC() {
      this.HHCCIOOCCCOCCIHCIIHHRRCIICOIHO(0);
   }

   public void RHOIRHOIOORCCIIHIIHHOHIHIOHIOI() {
      this.HHCCIOOCCCOCCIHCIIHHRRCIICOIHO(this.text.length());
   }

   public boolean HHCCIRHCCCIIRHCROHIORHIRHHIORH(
      char var1, com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2
   ) {
      if (!this.RIOOCIRIHOCHRRORIICOIICCCIHRRC) {
         return false;
      }

      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var3 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OICIRICHOHHIIHIRRRROORCRRRCORH();
      switch (var1) {
         case '\u0001':
            this.RHOIRHOIOORCCIIHIIHHOHIHIOHIOI();
            this.RRIOHRHHRHORRROIIRHRHROICRHCRO(0);
            return true;
         case '\u0003':
            var3.RCRCCORIIOICRIIRHCCIIOCICRHIOC(this.HICCCCHHCRHCOCOOICIHCCCROOIIIO());
            return true;
         case '\u0016':
            if (this.isEnabled) {
               this.OCCHCOCHHRORORHICHRRHCCICCIIIH(var3.RCIORHCHCIOIHIORRCRICCRIRRRROO());
            }

            return true;
         case '\u0018':
            var3.RCRCCORIIOICRIIRHCCIIOCICRHIOC(this.HICCCCHHCRHCOCOOICIHCCCROOIIIO());
            if (this.isEnabled) {
               this.OCCHCOCHHRORORHICHRRHCCICCIIIH("");
            }

            return true;
         default:
            switch (var2) {
               case KEY_BACK:
                  if (com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.isCtrlKeyDown()) {
                     if (this.isEnabled) {
                        this.RICRHCHRRCCIICRCHICCIHHHCIICOH(-1);
                     }
                  } else if (this.isEnabled) {
                     this.ORHOOCIRIHHOCHHRIRIOIIICHOORCR(-1);
                  }

                  return true;
               case KEY_HOME:
                  if (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RHCICHRICRIIIHRRCICHOOOIOOOICH()
                     .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                        com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.KEY_LSHIFT
                     )) {
                     this.RRIOHRHHRHORRROIIRHRHROICRHCRO(0);
                  } else {
                     this.HCRRCOIRRIHCICOROIRHRRIIHCHORC();
                  }

                  return true;
               case KEY_LEFT:
                  if (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RHCICHRICRIIIHRRCICHOOOIOOOICH()
                     .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                        com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.KEY_LSHIFT
                     )) {
                     if (com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.isCtrlKeyDown()
                        )
                      {
                        this.RRIOHRHHRHORRROIIRHRHROICRHCRO(this.RCOCRROHHROHHOCRCCCHCIROIIOORC(-1, this.OCIHCCOOROHOOOIIOIOHOHCHORIICH()));
                     } else {
                        this.RRIOHRHHRHORRROIIRHRHROICRHCRO(this.OCIHCCOOROHOOOIIOIOHOHCHORIICH() - 1);
                     }
                  } else if (com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.isCtrlKeyDown()
                     )
                   {
                     this.HHCCIOOCCCOCCIHCIIHHRRCIICOIHO(this.HRHRIHCHOHOOHHOOIOORHRRICHHCHI(-1));
                  } else {
                     this.RHHHCHOOIIHHICCROOHOOIRIIIHHOC(-1);
                  }

                  return true;
               case KEY_RIGHT:
                  if (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RHCICHRICRIIIHRRCICHOOOIOOOICH()
                     .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                        com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.KEY_LSHIFT
                     )) {
                     if (com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.isCtrlKeyDown()
                        )
                      {
                        this.RRIOHRHHRHORRROIIRHRHROICRHCRO(this.RCOCRROHHROHHOCRCCCHCIROIIOORC(1, this.OCIHCCOOROHOOOIIOIOHOHCHORIICH()));
                     } else {
                        this.RRIOHRHHRHORRROIIRHRHROICRHCRO(this.OCIHCCOOROHOOOIIOIOHOHCHORIICH() + 1);
                     }
                  } else if (com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.isCtrlKeyDown()
                     )
                   {
                     this.HHCCIOOCCCOCCIHCIIHHRRCIICOIHO(this.HRHRIHCHOHOOHHOOIOORHRRICHHCHI(1));
                  } else {
                     this.RHHHCHOOIIHHICCROOHOOIRIIIHHOC(1);
                  }

                  return true;
               case KEY_END:
                  if (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RHCICHRICRIIIHRRCICHOOOIOOOICH()
                     .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                        com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.KEY_LSHIFT
                     )) {
                     this.RRIOHRHHRHORRROIIRHRHROICRHCRO(this.text.length());
                  } else {
                     this.RHOIRHOIOORCCIIHIIHHOHIHIOHIOI();
                  }

                  return true;
               case KEY_DELETE:
                  if (com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.isCtrlKeyDown()) {
                     if (this.isEnabled) {
                        this.RICRHCHRRCCIICRCHICCIHHHCIICOH(1);
                     }
                  } else if (this.isEnabled) {
                     this.ORHOOCIRIHHOCHHRIRIOIIICHOORCR(1);
                  }

                  return true;
               case KEY_RETURN:
                  if (this.HIRCHIIHIHCOHHHOIRIHOIHRCCCRRR != null) {
                     this.HIRCHIIHIHCOHHHOIRIHOIHRCCCRRR.run();
                  }

                  return true;
               default:
                  boolean var4 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RHCICHRICRIIIHRRCICHOOOIOOOICH()
                        .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                           com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.KEY_LMENU
                        )
                     || com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RHCICHRICRIIIHRRCICHOOOIOOOICH()
                        .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                           com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.KEY_RMENU
                        );
                  if (com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.isCtrlKeyDown()
                     && !var4
                     && !com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.isShiftKeyDown()
                     )
                   {
                     switch (var2) {
                        case KEY_A:
                           this.RHOIRHOIOORCCIIHIIHHOHIHIOHIOI();
                           this.RRIOHRHHRHORRROIIRHRHROICRHCRO(0);
                           return true;
                        case KEY_C:
                           var3.RCRCCORIIOICRIIRHCCIIOCICRHIOC(this.HICCCCHHCRHCOCOOICIHCCCROOIIIO());
                           return true;
                        case KEY_X:
                           var3.RCRCCORIIOICRIIRHCCIIOCICRHIOC(this.HICCCCHHCRHCOCOOICIHCCCROOIIIO());
                           if (this.isEnabled) {
                              this.OCCHCOCHHRORORHICHRRHCCICCIIIH("");
                           }

                           return true;
                        case KEY_V:
                           if (this.isEnabled) {
                              this.OCCHCOCHHRORORHICHRRHCCICCIIIH(var3.RCIORHCHCIOIHIORRCRICCRIRRRROO());
                           }

                           return true;
                     }
                  }

                  String var5 = String.valueOf(var1);
                  String var6 = this.CIOCRCRRRHHCRHOCORCCHIICRHRROR.apply(var5);
                  if (!var6.equals(var5) && !com.moonsworth.lunar.client.util.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.HICHRCOHCCRHOHCICOOCHOIHCCHIRI(var1)) {
                     return false;
                  } else {
                     if (this.isEnabled) {
                        this.OCCHCOCHHRORORHICHRRHCCICCIIIH(Character.toString(var1));
                     }

                     return true;
                  }
            }
      }
   }

   public abstract void CRRRICCRROCOHHOHIICIHORCOORRRH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
   );

   public void RHOCHHIRRCHHHOHOIRROIROHHHIHIO(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
   ) {
      if (this.isVisible()) {
         if (this.IIROOHRRCROCCHRCROORIHIHIIRORI()) {
            this.CRRRICCRROCOHHOHIICIHORCOORRRH(var1);
         }

         int var2 = this.IRCHOCHCRIOORIOOHCHOIOCHOHRROR - this.ORHOOHRCIHIORCCRCOOOOCIROHRHCO;
         int var3 = this.RHCRCHICRORHICCHIRROIHIHOCHHRR - this.ORHOOHRCIHIORCCRCOOOOCIROHRHCO;
         String var4 = this.OHOORCHRCRHCIRICCHHRCHCICRHICR
            .IRCIIHHICIHRCOCRROCOICRIHHCCHH(this.text.substring(this.ORHOOHRCIHIORCCRCOOOOCIROHRHCO), this.HIORICOHCICCORCHRRIIOOORHHCRRC());
         boolean var5 = var2 >= 0 && var2 <= var4.length();
         boolean var6 = this.RIOOCIRIHOCHRRORIICOIICCCIHRRC && this.CIRCOOHCIRCCIOHRCOROCHOCCOCHCO / 6 % 2 == 0 && var5;
         float var7 = this.IRHORCRHIRIORIRCIRIRIRIORICRRR ? this.x + 4.0F + (this.OOIOHHIRCRHCHHOOICOCORRIIROHIH != null ? 12 : 0) : this.x;
         float var8 = this.IRHORCRHIRIORIRCIRIRIRIORICRRR ? this.y + (this.height - 8.0F) / 2.0F : this.y;
         float var9 = var7;
         if (var3 > var4.length()) {
            var3 = var4.length();
         }

         if (this.OOIOHHIRCRHCHHOOICOCORRIIROHIH != null) {
            com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               var1, this.OOIOHHIRCRHCHHOOICOCORRIIROHIH, 2.75F, this.x + 7.0F, this.y + 4.5F, 872415231
            );
         }

         if (var4.length() > 0) {
            String var10 = var5 ? var4.substring(0, var2) : var4;
            var9 = this.OHOORCHRCRHCIRICCHHRCHCICRHICR
               .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  var1, this.IHCROCCROHRIHHCHRCRHRHORIRORCR ? StringUtils.repeat('*', var10.length()) : var10, var7, var8, -1862270977
               );
         } else if (!this.OIIHORORCCOHIICOHRRORHRIIOHIHH()) {
            this.OHOORCHRCRHCIRICCHHRCHCICRHICR
               .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.RCCOOIIICOIIRHIROHRIIOROHHHRCO), var7, var8, 822083583);
         }

         boolean var13 = this.IRCHOCHCRIOORIOOHCHOIOCHOHRROR < this.text.length() || this.text.length() >= this.getMaxStringLength();
         float var11 = var9;
         if (!var5) {
            var11 = var2 > 0 ? var7 + this.width - 8.0F : var7;
         } else if (var13) {
            var11 = var9 - 1.0F;
            var9--;
         }

         if (var4.length() > 0 && var5 && var2 < var4.length()) {
            String var12 = var4.substring(var2);
            this.OHOORCHRCRHCIRICCHHRCHCICRHICR
               .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  var1, this.IHCROCCROHRIHHCHRCRHRHORIRORCR ? StringUtils.repeat('*', var12.length()) : var12, var9 + 2.0F, var8, -1862270977
               );
         }

         if (var6) {
            if (var13) {
               com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                  var1, var11 + 1.5F, var8 + 1.0F, var11 + 2.0F, var8 + 3.0F + this.OHOORCHRCRHCIRICCHHRCHCICRHICR.getHeight(), -3092272
               );
            } else {
               this.OHOORCHRCRHCIRICCHHRCHCICRHICR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, "_", var11, var8, -1862270977);
            }
         }

         if (var3 != var2) {
            float var14 = var7 + this.OHOORCHRCRHCIRICCHHRCHCICRHICR.IOOOHRRHCHICHHHCRIRHIICORRCIRO(var4.substring(0, var3));
            this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
               var1, var11, var8 - 1.0F + 2.0F, var14 - 1.0F, var8 + 1.0F + this.OHOORCHRCRHCIRICCHHRCHCICRHICR.getHeight() + 2.0F
            );
         }
      }
   }

   private void HHCCIRHCCCIIRHCROHIORHIRHHIORH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      float var2,
      float var3,
      float var4,
      float var5
   ) {
      if (var2 < var4) {
         float var6 = var2;
         var2 = var4;
         var4 = var6;
      }

      if (var3 < var5) {
         float var7 = var3;
         var3 = var5;
         var5 = var7;
      }

      if (var4 > this.x + this.width) {
         var4 = this.x + this.width;
      }

      if (var2 > this.x + this.width) {
         var2 = this.x + this.width;
      }

      com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CRRRICCRROCOHHOHIICIHORCOORRRH(
         var1, var2, var3, var4 - var2, var5 - var3, -16776961
      );
   }

   public void CHIIIIIHRCROHOHHHRRIHHRIIICIIC(boolean var1) {
      if (var1 && !this.RIOOCIRIHOCHRRORIICOIICCCIHRRC) {
         this.CIRCOOHCIRCCIOHRCOROCHOCCOCHCO = 0;
      }

      if (var1 && this.ROIIHOOHIHHIHIHOOCHHHICRCHCHCI != null) {
         this.ROIIHOOHIHHIHIHOOCHHHICRCHCHCI.run();
      }

      this.RIOOCIRIHOCHRRORIICOIICCCIHRRC = var1;
   }

   public boolean OIIHORORCCOHIICOHRRORHRIIOHIHH() {
      return this.RIOOCIRIHOCHRRORIICOIICCCIHRRC;
   }

   public float HIORICOHCICCORCHRRIIOOORHHCRRC() {
      return this.IIROOHRRCROCCHRCROORIHIHIIRORI()
         ? this.width - 8.0F - (this.OOIOHHIRCRHCHHOOICOCORRIIROHIH != null ? 12 : 0)
         : this.width - 6.0F - (this.OOIOHHIRCRHCHHOOICOCORRIIROHIH != null ? 18 : 0);
   }

   public void RRIOHRHHRHORRROIIRHRHROICRHCRO(int var1) {
      int var2 = this.text.length();
      if (var1 > var2) {
         var1 = var2;
      }

      if (var1 < 0) {
         var1 = 0;
      }

      this.RHCRCHICRORHICCHIRROIHIHOCHHRR = var1;
      if (this.OHOORCHRCRHCIRICCHHRCHCICRHICR != null) {
         if (this.ORHOOHRCIHIORCCRCOOOOCIROHRHCO > var2) {
            this.ORHOOHRCIHIORCCRCOOOOCIROHRHCO = var2;
         }

         float var3 = this.HIORICOHCICCORCHRRIIOOORHHCRRC();
         String var4 = this.OHOORCHRCRHCIRICCHHRCHCICRHICR.IRCIIHHICIHRCOCRROCOICRIHHCCHH(this.text.substring(this.ORHOOHRCIHIORCCRCOOOOCIROHRHCO), var3);
         int var5 = var4.length() + this.ORHOOHRCIHIORCCRCOOOOCIROHRHCO;
         if (var1 == this.ORHOOHRCIHIORCCRCOOOOCIROHRHCO) {
            this.ORHOOHRCIHIORCCRCOOOOCIROHRHCO = this.ORHOOHRCIHIORCCRCOOOOCIROHRHCO
               - this.OHOORCHRCRHCIRICCHHRCHCICRHICR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.text, var3, true).length();
         }

         if (var1 > var5) {
            this.ORHOOHRCIHIORCCRCOOOOCIROHRHCO += var1 - var5;
         } else if (var1 <= this.ORHOOHRCIHIORCCRCOOOOCIROHRHCO) {
            this.ORHOOHRCIHIORCCRCOOOOCIROHRHCO = this.ORHOOHRCIHIORCCRCOOOOCIROHRHCO - (this.ORHOOHRCIHIORCCRCOOOOCIROHRHCO - var1);
         }

         if (this.ORHOOHRCIHIORCCRCOOOOCIROHRHCO < 0) {
            this.ORHOOHRCIHIORCCRCOOOOCIROHRHCO = 0;
         }

         if (this.ORHOOHRCIHIORCCRCOOOOCIROHRHCO > var2) {
            this.ORHOOHRCIHIORCCRCOOOOCIROHRHCO = var2;
         }
      }
   }

   @Override
   public void update() {
      this.OIORIRCHRIIIICHOHOHRHIOHHOICRO();
   }

   @Override
   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2,
      boolean var3
   ) {
      this.RHOCHHIRRCHHHOHOIRROIROHHHIHIO(var1);
      if (this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var2)) {
         com.moonsworth.lunar.client.util.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.client.util.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IBEAM
         );
      }
   }

   @Override
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      char var1, com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2
   ) {
      if (var2 == com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.KEY_ESCAPE) {
         this.CHIIIIIHRCROHOHHHRRIHHRIIICIIC(false);
      }

      this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1, var2);
   }

   @Override
   public void close() {
   }

   @Override
   public boolean isEditing() {
      return this.RIOOCIRIHOCHRRORIICOIICCCIHRRC;
   }

   @Generated
   public void CORCOCICIRIOHROHROIIOOHICCHCRR(int var1) {
      this.color = var1;
   }

   @Generated
   public void HIRRICOIICIHRRICIOCOOOCOCHHORR(int var1) {
      this.OORHHIIORHRCRHOICORCOIICCIIHIH = var1;
   }

   @Generated
   public void ROHOOHRICIROORROHCROCCOHHCORRI(int var1) {
      this.IIIOOICOHRRCRCCCROHHOOIORICICH = var1;
   }

   @Generated
   public int getColor() {
      return this.color;
   }

   @Generated
   public int ICHRROCOOCIICHHCRICCHRRRHROIIO() {
      return this.OORHHIIORHRCRHOICORCOIICCIIHIH;
   }

   @Generated
   public int OICHRHIOICRRCIHIHRCIIIRRCICOCR() {
      return this.IIIOOICOHRRCRCCCROHHOOIORICICH;
   }

   @Generated
   public void CCCCCHHRHOIHHORCHHOCIHHRCHOCRC(int var1) {
      this.ROHRIRHHHRCORCIRCHCICIHCRICIHR = var1;
   }

   @Generated
   public int getMaxStringLength() {
      return this.ROHRIRHHHRCORCIRCHCICIHCRICIHR;
   }

   @Generated
   public int HHHHIHCCCHCOCIHIHRHHCIRRHCICOC() {
      return this.IRCHOCHCRIOORIOOHCHOIOCHOHRROR;
   }

   @Generated
   public int OCIHCCOOROHOOOIIOIOHOHCHORIICH() {
      return this.RHCRCHICRORHICCHIRROIHIHOCHHRR;
   }

   @Generated
   public void OIIHROORCRORRRCOICCCHIOIHIHHRC(int var1) {
      this.ORHOOHRCIHIORCCRCOOOOCIROHRHCO = var1;
   }

   @Generated
   public boolean CCOOHCHORCCRHROOCHIOHRIICORCIH() {
      return this.IHOIRIIICHICHORORIOCHHHCCHRHOO;
   }

   @Generated
   public void IRICRCROHROOORCOOHHCOCOCCHHOCI(boolean var1) {
      this.IHOIRIIICHICHORORIOCHHHCCHRHOO = var1;
   }

   @Generated
   public boolean HRHHOCHCOHCOHOICIHHHIHCIORCOCO() {
      return this.HICHIIIIIHOIOIIOIICRHCHOHOIHIH;
   }

   @Generated
   public void HORRRHCCICIOCOOOCIHCCRCRIOCCHR(boolean var1) {
      this.HICHIIIIIHOIOIIOIICRHCHOHOIHIH = var1;
   }

   @Generated
   public boolean isVisible() {
      return this.visible;
   }

   @Generated
   public void setVisible(boolean var1) {
      this.visible = var1;
   }

   @Generated
   public boolean IIROOHRRCROCCHRCROORIHIHIIRORI() {
      return this.IRHORCRHIRIORIRCIRIRIRIORICRRR;
   }

   @Generated
   public boolean COOIHHHCHOCCRRCOROHOHHHCHCOORC() {
      return this.OOOOCOOIRIOCCOCIIOHRIIRRRRCHRR;
   }

   @Generated
   public void setEnabled(boolean var1) {
      this.isEnabled = var1;
   }

   @Generated
   public void IRCHOIROHOHHOIHCICOROOOHIOOIIR(boolean var1) {
      this.IHCROCCROHRIHHCHRCRHRHORIRORCR = var1;
   }

   @Generated
   public void CORCOCICIRIOHROHROIIOOHICCHCRR(Function<String, String> var1) {
      this.CIOCRCRRRHHCRHOCORCCHIICRHRROR = var1;
   }

   @Generated
   public void IOIICIRIICICIIOORHCIIIIRRIHRHI(Runnable var1) {
      this.ROIIHOOHIHHIHIHOOCHHHICRCHCHCI = var1;
   }

   @Generated
   public void HHRIICOIOORCHCOIICOOIHIRHHICRI(Runnable var1) {
      this.HIRCHIIHIHCOHHHOIRIHOIHRCCCRRR = var1;
   }
}
