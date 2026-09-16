package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import java.net.URL;

public abstract class ICICIOCHHHIHOCHCOHORIHRCOHHOCR implements ROOCOCCCIRHHHIRIOIHHHHRHIICHHR, Serializable {
   private static final long OHORHHOHOCRCRHRHRIICRCHRRRIIRH = 2L;

   public abstract boolean HHRCCRRIHCIIIIHCRROOHOIHOICIHR();

   public abstract boolean HHCOROICIHHOIIHCRHORCHCCHRHHRI();

   public abstract boolean HROIHRHHHIHICCHHICIHIORRHIRORO();

   public abstract Class<? extends HHCCIRHCCCIIRHCROHIORHIRHHIORH> ROHCIHHRHHRCORRRCCIIROICIIIHRH();

   public abstract Class<? extends HHCCIRHCCCIIRHCROHIORHIRHHIORH> OORCCHCHCIHRIHIHRCOOROORROCCOH();

   public abstract boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CRRRICCRROCOHHOHIICIHORCOORRRH var1);

   public abstract String CIIOHHIHHRRRHOCIRHHOOIHHCCOCRO();

   public abstract boolean HHCCIRHCCCIIRHCROHIORHIRHHIORH(OCOHORHCROHICRRIHCIHHRRCIHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1);

   public abstract boolean HHCCIRHCCCIIRHCROHIORHIRHHIORH(CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1);

   public abstract int IOORROICIICRCHCIHCIICOHORRIHRI();

   public abstract int ROOCIRROICOOICRIOOOCHCHRIOHCHC();

   public abstract int CCORRRCRRHOIOOCCRIORORCIRCRIRC();

   public abstract int IHRHHCCCOIRIIOHRHCCHHHCIRCRIOO();

   public abstract IOIICIRIICICIIOORHCIIIIRRIHRHI CROCCHHIOHOCHHCOHHCCHRCIROIOIR();

   public abstract OCOHORHCROHICRRIHCIHHRRCIHICRI HHIRHRHHRHIHRHOHCHRHIORRHIIHOR(byte[] var1);

   public abstract OCOHORHCROHICRRIHCIHHRRCIHICRI OIHCOHRCICCCRHRCROOCIOIRRHHHIH(byte[] var1, int var2, int var3);

   public abstract OCOHORHCROHICRRIHCIHHRRCIHICRI HHCCIRHCCCIIRHCROHIORHIRHHIORH(char[] var1);

   public abstract OCOHORHCROHICRRIHCIHHRRCIHICRI RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(char[] var1, int var2, int var3);

   public abstract OCOHORHCROHICRRIHCIHHRRCIHICRI IRCIIHHICIHRCOCRROCOICRIHHCCHH(DataInput var1);

   public abstract OCOHORHCROHICRRIHCIHHRRCIHICRI OHCIIOCHHOHOHCOHHCRRHHCRHOIICC(File var1);

   public abstract OCOHORHCROHICRRIHCIHHRRCIHICRI IIOIROIHIHHCCRICRCOOCHIICHRCOI(InputStream var1);

   public abstract OCOHORHCROHICRRIHCIHHRRCIHICRI RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Reader var1);

   public abstract OCOHORHCROHICRRIHCIHHRRCIHICRI CRCHORHCICOCRCCHOOCICICRIOCOIC(String var1);

   public abstract OCOHORHCROHICRRIHCIHHRRCIHICRI HRCHROOHRIHCRCRHRIIROCIRHOIRHH(URL var1);

   public abstract OCOHORHCROHICRRIHCIHHRRCIHICRI CIOCRRRHIRRIICHRHRCHIHROHHIORC();

   public abstract OCOHORHCROHICRRIHCIHHRRCIHICRI CHOIOCCRRCHCHIOIHOCHCIORICOIHC();

   public abstract CRICCOOHHHCHOORCICOCOHIHOIRHOO RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(DataOutput var1, RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var2);

   public abstract CRICCOOHHHCHOORCICOCOHIHOIRHOO RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(DataOutput var1);

   public abstract CRICCOOHHHCHOORCICOCOHIHOIRHOO RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(File var1, RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var2);

   public abstract CRICCOOHHHCHOORCICOCOHIHOIRHOO IHIRRIIORRHORHRORIHOROIRCORCOO(OutputStream var1);

   public abstract CRICCOOHHHCHOORCICOCOHIHOIRHOO RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(OutputStream var1, RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var2);

   public abstract CRICCOOHHHCHOORCICOCOHIHOIRHOO RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Writer var1);

   protected OutputStream IRCIIHHICIHRCOCRROCOICRIHHCCHH(DataOutput var1) {
      return new com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
         var1
      );
   }

   protected InputStream CORCOCICIRIOHROHROIIOOHICCHCRR(URL var1) {
      if ("file".equals(var1.getProtocol())) {
         String var2 = var1.getHost();
         if (var2 == null || var2.length() == 0) {
            String var3 = var1.getPath();
            if (var3.indexOf(37) < 0) {
               return new FileInputStream(var1.getPath());
            }
         }
      }

      return var1.openStream();
   }

   protected InputStream IIOCHOIICCIORCOROIROHICCHIOHIC(File var1) {
      return new FileInputStream(var1);
   }

   protected OutputStream RICRIHOOHROHICCHHIIHRHCORHIOHR(File var1) {
      return new FileOutputStream(var1);
   }

   protected void OHIIIOHIRIRCCRRIOIICCHHIORRHOH(byte[] var1, int var2, int var3) {
      if (var1 == null) {
         this.RICHIIORICCHROCCRIORORHOOIRIRH("Invalid `byte[]` argument: `null`");
      }

      int var4 = var1.length;
      int var5 = var2 + var3;
      int var6 = var2 | var3 | var5 | var4 - var5;
      if (var6 < 0) {
         this.RICHIIORICCHROCCRIORORHOOIRIRH(String.format("Invalid 'offset' (%d) and/or 'len' (%d) arguments for `byte[]` of length %d", var2, var3, var4));
      }
   }

   protected void RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(char[] var1, int var2, int var3) {
      if (var1 == null) {
         this.RICHIIORICCHROCCRIORORHOOIRIRH("Invalid `char[]` argument: `null`");
      }

      int var4 = var1.length;
      int var5 = var2 + var3;
      int var6 = var2 | var3 | var5 | var4 - var5;
      if (var6 < 0) {
         this.RICHIIORICCHROCCRIORORHOOIRIRH(String.format("Invalid 'offset' (%d) and/or 'len' (%d) arguments for `char[]` of length %d", var2, var3, var4));
      }
   }

   protected <T> T RICHIIORICCHROCCRIORORHOOIRIRH(String var1) {
      throw new IllegalArgumentException(var1);
   }
}
