package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

public class CIOHHCORHRCCRICCCORIHCRHCCCRRR implements Serializable {
   private static final long RCROHORICHHIRCIOHOIHCCCHIOCOHO = 1L;
   public static final char IIIIOIHCHHHICCHORRHRHORHCHOROI = '/';
   protected static final CIOHHCORHRCCRICCCORIHCRHCCCRRR OHRRHCCRRCICHOHRRORHRCRIOROIIO = new CIOHHCORHRCCRICCCORIHCRHCCCRRR();
   protected final CIOHHCORHRCCRICCCORIHCRHCCCRRR COCHCROHICCRHHIIIOCCCCICRRHCII;
   protected volatile CIOHHCORHRCCRICCCORIHCRHCCCRRR HHCOHROIHRHHHRIIIRHCIRRRHCOCRR;
   protected final String RICCOIIIIRHCRCRRIRCIIRHRCCHHRC;
   protected final int ORHRIOOIHICICRRRHOORHICRCIOCOC;
   protected final String OHORHHCOOIRRRCOORHHRCOIHHRRHRO;
   protected final int CCHIICCOIOOCROHHCIORCOIRICOOCH;
   protected int HHHIORCIOCHROHOOIOHOHOIHCCRIIH;

   protected CIOHHCORHRCCRICCCORIHCRHCCCRRR() {
      this.COCHCROHICCRHHIIIOCCCCICRRHCII = null;
      this.OHORHHCOOIRRRCOORHHRCOIHHRRHRO = null;
      this.CCHIICCOIOOCROHHCIORCOIRICOOCH = -1;
      this.RICCOIIIIRHCRCRRIRCIIRHRCCHHRC = "";
      this.ORHRIOOIHICICRRRHOORHICRCIOCOC = 0;
   }

   protected CIOHHCORHRCCRICCCORIHCRHCCCRRR(String var1, int var2, String var3, CIOHHCORHRCCRICCCORIHCRHCCCRRR var4) {
      this.RICCOIIIIRHCRCRRIRCIIRHRCCHHRC = var1;
      this.ORHRIOOIHICICRRRHOORHICRCIOCOC = var2;
      this.COCHCROHICCRHHIIIOCCCCICRRHCII = var4;
      this.OHORHHCOOIRRRCOORHHRCOIHHRRHRO = var3;
      this.CCHIICCOIOOCROHHCIORCOIRICOOCH = HROOCOCCRIOCRCCCROOOCHCHIIHHOR(var3);
   }

   protected CIOHHCORHRCCRICCCORIHCRHCCCRRR(String var1, int var2, String var3, int var4, CIOHHCORHRCCRICCCORIHCRHCCCRRR var5) {
      this.RICCOIIIIRHCRCRRIRCIIRHRCCHHRC = var1;
      this.ORHRIOOIHICICRRRHOORHICRCIOCOC = var2;
      this.COCHCROHICCRHHIIIOCCCCICRRHCII = var5;
      this.OHORHHCOOIRRRCOORHHRCOIHHRRHRO = var3;
      this.CCHIICCOIOOCROHHCIORCOIRICOOCH = var4;
   }

   public static CIOHHCORHRCCRICCCORIHCRHCCCRRR RROOOHCORRIIHHCOOOCOCORRRRRHCO(String var0) {
      if (var0 != null && var0.length() != 0) {
         if (var0.charAt(0) != '/') {
            throw new IllegalArgumentException("Invalid input: JSON Pointer expression must start with '/': \"" + var0 + "\"");
         } else {
            return HIRROCORCHCHRORRHRIHCIHIHCCHIC(var0);
         }
      } else {
         return OHRRHCCRRCICHOHRRORHRCRIOROIIO;
      }
   }

   public static CIOHHCORHRCCRICCCORIHCRHCCCRRR OIOHRIHCIHHCOIRCCOIRIOOHOIOIOI(String var0) {
      return RROOOHCORRIIHHCOOOCOCORRRRRHCO(var0);
   }

   public static CIOHHCORHRCCRICCCORIHCRHCCCRRR CRRRRRCOOOCIRIRRIOOIIOHRIIHIII() {
      return OHRRHCCRRCICHOHRRORHRCRIOROIIO;
   }

   public static CIOHHCORHRCCRICCCORIHCRHCCCRRR RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IIRHCHHOICHRICOOCRORCCIOOIHOIR var0, boolean var1) {
      if (var0 == null) {
         return OHRRHCCRRCICHOHRRORHRCRIOROIIO;
      }

      if (!var0.ROROHCHOORHOHIIICOIRHRROIHRHHH() && (!var1 || !var0.IHIOORIIHRCOOIHCOORICORRCOOOIO() || !var0.CHIHCOORORCOCHIRIOOOHOHRIHCICH())) {
         var0 = var0.RHOOHRHOICCCORHOHCIRORICOCHIHC();
      }

      CIOHHCORHRCCRICCCORIHCRHCCCRRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2 = null;
      int var3 = 0;

      while (var0 != null) {
         if (var0.HROOCOCOCIRRHOCCOIHIIHOOOICOHO()) {
            String var4 = var0.CIOOORCHHCOOOOIIOOCIOICCRRORCH();
            if (var4 == null) {
               var4 = "";
            }

            var3 += 2 + var4.length();
            var2 = new CIOHHCORHRCCRICCCORIHCRHCCCRRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var2, var4, -1);
         } else if (var0.IICRICHRCOOHHCCOCIOOIIHROCRRRH() || var1) {
            int var10 = var0.CCRIOHCRRICIIIORCROOHCRCOIIORI();
            var3 += 6;
            var2 = new CIOHHCORHRCCRICCCORIHCRHCCCRRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var2, null, var10);
         }

         var0 = var0.RHOOHRHOICCCORHOHCIRORICOCHIHC();
      }

      if (var2 == null) {
         return OHRRHCCRRCICHOHRRORHRCRIOROIIO;
      }

      StringBuilder var11 = new StringBuilder(var3);
      CIOHHCORHRCCRICCCORIHCRHCCCRRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var5 = null;

      while (var2 != null) {
         var5 = var2;
         var2.CCOHIOHRICCOCIOCORCOORCCIRRIIH = var11.length();
         var11.append('/');
         if (var2.RRRHHHRORHOHHCOHOCIRCIIHICCOHI != null) {
            IRCIIHHICIHRCOCRROCOICRIHHCCHH(var11, var2.RRRHHHRORHOHHCOHOCIRCIIHICCOHI);
         } else {
            var11.append(var2.HRIRIOORRIICCRHIICRIOICRHHIIHO);
         }

         var2 = var2.OOIOIRHOCHIOHIOIIICIROCHHRHRIC;
      }

      String var6 = var11.toString();
      CIOHHCORHRCCRICCCORIHCRHCCCRRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var7 = var5;
      CIOHHCORHRCCRICCCORIHCRHCCCRRR var8 = OHRRHCCRRCICHOHRRORHRCRIOROIIO;

      while (var7 != null) {
         if (var7.RRRHHHRORHOHHCOHOCIRCIIHICCOHI != null) {
            var8 = new CIOHHCORHRCCRICCCORIHCRHCCCRRR(var6, var7.CCOHIOHRICCOCIOCORCOORCCIRRIIH, var7.RRRHHHRORHOHHCOHOCIRCIIHICCOHI, var8);
         } else {
            int var9 = var7.HRIRIOORRIICCRHIICRIOICRHHIIHO;
            var8 = new CIOHHCORHRCCRICCCORIHCRHCCCRRR(var6, var7.CCOHIOHRICCOCIOCORCOORCCIRRIIH, String.valueOf(var9), var9, var8);
         }

         var7 = var7.HCCROHRRCHICHOOCHOIOCOOHCOHOHO;
      }

      return var8;
   }

   private static void IRCIIHHICIHRCOCRROCOICRIHHCCHH(StringBuilder var0, String var1) {
      int var2 = 0;

      for (int var3 = var1.length(); var2 < var3; var2++) {
         char var4 = var1.charAt(var2);
         if (var4 == '/') {
            var0.append("~1");
         } else if (var4 == '~') {
            var0.append("~0");
         } else {
            var0.append(var4);
         }
      }
   }

   public int length() {
      return this.RICCOIIIIRHCRCRRIRCIIRHRCCHHRC.length() - this.ORHRIOOIHICICRRRHOORHICRCIOCOC;
   }

   public boolean matches() {
      return this.COCHCROHICCRHHIIIOCCCCICRRHCII == null;
   }

   public String IOCORRCHHCIOCCIIHRIHOIHICHHIHC() {
      return this.OHORHHCOOIRRRCOORHHRCOIHHRRHRO;
   }

   public int IOHIROCRHHCCOIIHHIOROCHCHHHROI() {
      return this.CCHIICCOIOOCROHHCIORCOIRICOOCH;
   }

   public boolean CHRHRIOIRROHIIIRHIROHICCOICCIR() {
      return this.OHORHHCOOIRRRCOORHHRCOIHHRRHRO != null;
   }

   public boolean ROIRCORCHCOCIROHICHORRIHCCHORH() {
      return this.CCHIICCOIOOCROHHCIORCOIRICOOCH >= 0;
   }

   public CIOHHCORHRCCRICCCORIHCRHCCCRRR HIHOCOCRICIRRRCCCRRRRIOHRCCOCI() {
      CIOHHCORHRCCRICCCORIHCRHCCCRRR var1 = this;
      if (var1 == OHRRHCCRRCICHOHRRORHRCRIOROIIO) {
         return null;
      }

      while (true) {
         CIOHHCORHRCCRICCCORIHCRHCCCRRR var2 = var1.COCHCROHICCRHHIIIOCCCCICRRHCII;
         if (var1.COCHCROHICCRHHIIIOCCCCICRRHCII == OHRRHCCRRCICHOHRRORHRCRIOROIIO) {
            return var1;
         }

         var1 = var2;
      }
   }

   public CIOHHCORHRCCRICCCORIHCRHCCCRRR RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CIOHHCORHRCCRICCCORIHCRHCCCRRR var1) {
      if (this == OHRRHCCRRCICHOHRRORHRCRIOROIIO) {
         return var1;
      }

      if (var1 == OHRRHCCRRCICHOHRRORHRCRIOROIIO) {
         return this;
      }

      String var2 = this.RICCOIIIIRHCRCRRIRCIIRHRCCHHRC;
      if (var2.endsWith("/")) {
         var2 = var2.substring(0, var2.length() - 1);
      }

      return RROOOHCORRIIHHCOOOCOCORRRRRHCO(var2 + var1.RICCOIIIIRHCRCRRIRCIIRHRCCHHRC);
   }

   public CIOHHCORHRCCRICCCORIHCRHCCCRRR IOOHRRHORIORHRROHHROIRIOOCCOCH(String var1) {
      if (var1 != null && !var1.isEmpty()) {
         if (var1.charAt(0) != '/') {
            var1 = '/' + var1;
         }

         String var2 = this.RICCOIIIIRHCRCRRIRCIIRHRCCHHRC;
         if (var2.endsWith("/")) {
            var2 = var2.substring(0, var2.length() - 1);
         }

         return RROOOHCORRIIHHCOOOCOCORRRRRHCO(var2 + var1);
      } else {
         return this;
      }
   }

   public CIOHHCORHRCCRICCCORIHCRHCCCRRR HRHIRIROOIHHCCCIHHRHIORHOIORCI(int var1) {
      if (var1 < 0) {
         throw new IllegalArgumentException("Negative index cannot be appended");
      }

      String var2 = this.RICCOIIIIRHCRCRRIRCIIRHRCCHHRC;
      if (var2.endsWith("/")) {
         var2 = var2.substring(0, var2.length() - 1);
      }

      return RROOOHCORRIIHHCOOOCOCORRRRRHCO(var2 + '/' + var1);
   }

   public boolean IOOIIROIIOOICHOCICCICHHIHICIOO(String var1) {
      return this.COCHCROHICCRHHIIIOCCCCICRRHCII != null && this.OHORHHCOOIRRRCOORHHRCOIHHRRHRO.equals(var1);
   }

   public CIOHHCORHRCCRICCCORIHCRHCCCRRR ROIHICOCOIRORRORIHRIHRIOHRRHHC(String var1) {
      return this.COCHCROHICCRHHIIIOCCCCICRRHCII != null && this.OHORHHCOOIRRRCOORHHRCOIHHRRHRO.equals(var1) ? this.COCHCROHICCRHHIIIOCCCCICRRHCII : null;
   }

   public boolean CIRCIICRRHROHHIHCRCHHHIRHIHHIC(int var1) {
      return var1 == this.CCHIICCOIOOCROHHCIORCOIRICOOCH && var1 >= 0;
   }

   public CIOHHCORHRCCRICCCORIHCRHCCCRRR CCIRCRIOOIIICIIRIIIOOCOIHOORIC(int var1) {
      return var1 == this.CCHIICCOIOOCROHHCIORCOIRICOOCH && var1 >= 0 ? this.COCHCROHICCRHHIIIOCCCCICRRHCII : null;
   }

   public CIOHHCORHRCCRICCCORIHCRHCCCRRR RHCHHHIHOORICOOIRHCHOCCCOHCRCH() {
      return this.COCHCROHICCRHHIIIOCCCCICRRHCII;
   }

   public CIOHHCORHRCCRICCCORIHCRHCCCRRR CHCICOOIIIHOOHOIORHHRHIIHOCCHO() {
      CIOHHCORHRCCRICCCORIHCRHCCCRRR var1 = this.HHCOHROIHRHHHRIIIRHCIRRRHCOCRR;
      if (var1 == null) {
         if (this != OHRRHCCRRCICHOHRRORHRCRIOROIIO) {
            var1 = this.CRRRIOCIHHHOICIRICCIHIHHHHHRCC();
         }

         this.HHCOHROIHRHHHRIIIRHCIRRRHCOCRR = var1;
      }

      return var1;
   }

   @Override
   public String toString() {
      return this.ORHRIOOIHICICRRRHOORHICRCIOCOC <= 0
         ? this.RICCOIIIIRHCRCRRIRCIIRHRCCHHRC
         : this.RICCOIIIIRHCRCRRIRCIIRHRCCHHRC.substring(this.ORHRIOOIHICICRRRHOORHICRCIOCOC);
   }

   @Override
   public int hashCode() {
      int var1 = this.HHHIORCIOCHROHOOIOHOHOIHCCRIIH;
      if (var1 == 0) {
         var1 = this.toString().hashCode();
         if (var1 == 0) {
            var1 = -1;
         }

         this.HHHIORCIOCHROHOOIOHOHOIHCCRIIH = var1;
      }

      return var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      }

      if (var1 == null) {
         return false;
      }

      if (!(var1 instanceof CIOHHCORHRCCRICCCORIHCRHCCCRRR)) {
         return false;
      }

      CIOHHCORHRCCRICCCORIHCRHCCCRRR var2 = (CIOHHCORHRCCRICCCORIHCRHCCCRRR)var1;
      return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         this.RICCOIIIIRHCRCRRIRCIIRHRCCHHRC, this.ORHRIOOIHICICRRRHOORHICRCIOCOC, var2.RICCOIIIIRHCRCRRIRCIIRHRCCHHRC, var2.ORHRIOOIHICICRRRHOORHICRCIOCOC
      );
   }

   private final boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, int var2, String var3, int var4) {
      int var5 = var1.length();
      if (var5 - var2 != var3.length() - var4) {
         return false;
      }

      while (var2 < var5) {
         if (var1.charAt(var2++) != var3.charAt(var4++)) {
            return false;
         }
      }

      return true;
   }

   private static final int HROOCOCCRIOCRCCCROOOCHCHIIHHOR(String var0) {
      int var1 = var0.length();
      if (var1 != 0 && var1 <= 10) {
         char var2 = var0.charAt(0);
         if (var2 <= '0') {
            return var1 == 1 && var2 == 48 ? 0 : -1;
         }

         if (var2 > '9') {
            return -1;
         }

         for (int var3 = 1; var3 < var1; var3++) {
            var2 = var0.charAt(var3);
            if (var2 > '9' || var2 < '0') {
               return -1;
            }
         }

         if (var1 == 10) {
            long var6 = com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IIHRRHORCRCROCHHOHORCHCROCIHRO.OOCIIHHOHROOROHHCCRCIIHOICCIHC(
               var0
            );
            if (var6 > 2147483647L) {
               return -1;
            }
         }

         return com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IIHRRHORCRCROCHHOHORCHCROCIHRO.parseInt(
            var0
         );
      } else {
         return -1;
      }
   }

   protected static CIOHHCORHRCCRICCCORIHCRHCCCRRR HIRROCORCHCHRORRHRIHCIHIHCCHIC(String var0) {
      CIOHHCORHRCCRICCCORIHCRHCCCRRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1 = null;
      int var8 = 1;
      int var3 = var0.length();
      int var4 = 0;

      while (var8 < var3) {
         char var5 = var0.charAt(var8);
         if (var5 == '/') {
            var1 = new CIOHHCORHRCCRICCCORIHCRHCCCRRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var4, var0.substring(var4 + 1, var8));
            var4 = var8++;
         } else if (var5 == '~' && ++var8 < var3) {
            StringBuilder var6 = new StringBuilder(32);
            var8 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var4 + 1, var8, var6);
            String var7 = var6.toString();
            if (var8 < 0) {
               return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var4, var7, var1);
            }

            var1 = new CIOHHCORHRCCRICCCORIHCRHCCCRRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var4, var7);
            var4 = var8++;
         }
      }

      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var4, var0.substring(var4 + 1), var1);
   }

   private static CIOHHCORHRCCRICCCORIHCRHCCCRRR RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      String var0, int var1, String var2, CIOHHCORHRCCRICCCORIHCRHCCCRRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3
   ) {
      CIOHHCORHRCCRICCCORIHCRHCCCRRR var4 = new CIOHHCORHRCCRICCCORIHCRHCCCRRR(var0, var1, var2, OHRRHCCRRCICHOHRRORHRCRIOROIIO);

      while (var3 != null) {
         var4 = new CIOHHCORHRCCRICCCORIHCRHCCCRRR(var0, var3.RRHCORCHROHCIHRHCIHHRIORCHOHCC, var3.segment, var4);
         var3 = var3.CHCOHORIICRHRHOIHIOCCHRIHOCCOR;
      }

      return var4;
   }

   protected static int RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var0, int var1, int var2, StringBuilder var3) {
      int var4 = var0.length();
      int var5 = var2 - 1 - var1;
      if (var5 > 0) {
         var3.append(var0, var1, var2 - 1);
      }

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3, var0.charAt(var2++));

      while (var2 < var4) {
         char var6 = var0.charAt(var2);
         if (var6 == '/') {
            return var2;
         }

         if (var6 == '~' && ++var2 < var4) {
            RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3, var0.charAt(var2++));
         } else {
            var3.append(var6);
         }
      }

      return -1;
   }

   private static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(StringBuilder var0, char var1) {
      if (var1 == '0') {
         var1 = '~';
      } else if (var1 == '1') {
         var1 = '/';
      } else {
         var0.append('~');
      }

      var0.append(var1);
   }

   protected CIOHHCORHRCCRICCCORIHCRHCCCRRR CRRRIOCIHHHOICIRICCIHIHHHHHRCC() {
      CIOHHCORHRCCRICCCORIHCRHCCCRRR var1 = this.HIHOCOCRICIRRRCCCRRRRIOHRCCOCI();
      if (var1 == this) {
         return OHRRHCCRRCICHOHRRORHRCRIOROIIO;
      }

      int var2 = var1.length();
      CIOHHCORHRCCRICCCORIHCRHCCCRRR var3 = this.COCHCROHICCRHHIIIOCCCCICRRHCII;
      String var4 = this.toString();
      return new CIOHHCORHRCCRICCCORIHCRHCCCRRR(
         var4.substring(0, var4.length() - var2),
         0,
         this.OHORHHCOOIRRRCOORHHRCOIHHRRHRO,
         this.CCHIICCOIOOCROHHCIORCOIRICOOCH,
         var3.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var1)
      );
   }

   protected CIOHHCORHRCCRICCCORIHCRHCCCRRR RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(int var1, CIOHHCORHRCCRICCCORIHCRHCCCRRR var2) {
      if (this == var2) {
         return OHRRHCCRRCICHOHRRORHRCRIOROIIO;
      }

      CIOHHCORHRCCRICCCORIHCRHCCCRRR var3 = this.COCHCROHICCRHHIIIOCCCCICRRHCII;
      String var4 = this.toString();
      return new CIOHHCORHRCCRICCCORIHCRHCCCRRR(
         var4.substring(0, var4.length() - var1),
         0,
         this.OHORHHCOOIRRRCOORHHRCOIHHRRHRO,
         this.CCHIICCOIOOCROHHCIORCOIRICOOCH,
         var3.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2)
      );
   }

   private Object writeReplace() {
      return new CIOHHCORHRCCRICCCORIHCRHCCCRRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH(this.toString());
   }

   static class HHCCIRHCCCIIRHCROHIORHIRHHIORH implements Externalizable {
      private String OROROHHOIRIROIIRIHORORHCROCOOH;

      public HHCCIRHCCCIIRHCROHIORHIRHHIORH() {
      }

      HHCCIRHCCCIIRHCROHIORHIRHHIORH(String var1) {
         this.OROROHHOIRIROIIRIHORORHCROCOOH = var1;
      }

      @Override
      public void writeExternal(ObjectOutput var1) {
         var1.writeUTF(this.OROROHHOIRIROIIRIHORORHCROCOOH);
      }

      @Override
      public void readExternal(ObjectInput var1) {
         this.OROROHHOIRIROIIRIHORORHCROCOOH = var1.readUTF();
      }

      private Object readResolve() {
         return CIOHHCORHRCCRICCCORIHCRHCCCRRR.RROOOHCORRIIHHCOOOCOCORRRRRHCO(this.OROROHHOIRIROIIRIHORORHCROCOOH);
      }
   }

   private static class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
      public final CIOHHCORHRCCRICCCORIHCRHCCCRRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH OOIOIRHOCHIOHIOIIICIROCHHRHRIC;
      public final String RRRHHHRORHOHHCOHOCIRCIIHICCOHI;
      public final int HRIRIOORRIICCRHIICRIOICRHHIIHO;
      public int CCOHIOHRICCOCIOCORCOORCCIRRIIH;
      public CIOHHCORHRCCRICCCORIHCRHCCCRRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH HCCROHRRCHICHOOCHOIOCOOHCOHOHO;

      public IRCIIHHICIHRCOCRROCOICRIHHCCHH(CIOHHCORHRCCRICCCORIHCRHCCCRRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1, String var2, int var3) {
         this.OOIOIRHOCHIOHIOIIICIROCHHRHRIC = var1;
         this.RRRHHHRORHOHHCOHOCIRCIIHICCOHI = var2;
         this.HRIRIOORRIICCRHIICRIOICRHHIIHO = var3;
         if (var1 != null) {
            var1.HCCROHRRCHICHOOCHOIOCOOHCOHOHO = this;
         }
      }
   }

   private static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      public final CIOHHCORHRCCRICCCORIHCRHCCCRRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH CHCOHORIICRHRHOIHIOCCHRIHOCCOR;
      public final int RRHCORCHROHCIHRHCIHHRIORCHOHCC;
      public final String segment;

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CIOHHCORHRCCRICCCORIHCRHCCCRRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1, int var2, String var3) {
         this.CHCOHORIICRHRHOIHIOCCHRIHOCCOR = var1;
         this.RRHCORCHROHCIHRHCIHHRIORCHOHCC = var2;
         this.segment = var3;
      }
   }
}
