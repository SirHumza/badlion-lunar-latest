package at.spardat.xma.xdelta;

import com.moonsworth.lunar.forge.lib.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;
import com.moonsworth.lunar.forge.lib.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;
import com.moonsworth.lunar.forge.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.CORCOCICIRIOHROHROIIOOHICCHCRR;
import com.moonsworth.lunar.forge.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.HCHRIROHHHCORIOCROOCHRCIOROOCI;
import com.moonsworth.lunar.forge.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.IIHRHCCOOHOOOOCHRRCOROOIOHCOOO;
import com.moonsworth.lunar.forge.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RHOORRIIOCHIRRHOHOOHIROHCRICRO;
import com.moonsworth.lunar.forge.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.regex.Pattern;

public class JarDelta {
   public static final Pattern zipFilesPattern = Pattern.compile(".*?\\.zip$|.*?\\.jar$|.*?\\.war$|.*?\\.ear$", 2);
   private static final int BUFFER_LEN = 8192;
   private final byte[] buffer = new byte[8192];
   private byte[] calculatedDelta = null;

   public void computeDelta(
      String var1, String var2, RHOORRIIOCHIRRHOHOOHIROHCRICRO var3, RHOORRIIOCHIRRHOHOOHIROHCRICRO var4, IIHRHCCOOHOOOOCHRRCOROOIOHCOOO var5
   ) {
      ByteArrayOutputStream var6 = new ByteArrayOutputStream();
      PrintWriter var7 = new PrintWriter(new OutputStreamWriter(var6));
      var7.println(var1);
      var7.println(var2);
      this.computeDelta(var3, var4, var5, var7, "");
      var7.close();
      HCHRIROHHHCORIOCROOCHRCIOROOCI var8 = new HCHRIROHHHCORIOCROOCHRCIOROOCI("META-INF/file.list");
      var5.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var8);
      var5.write(var6.toByteArray());
      var5.closeArchiveEntry();
      var5.finish();
      var5.flush();
   }

   public void computeDelta(
      RHOORRIIOCHIRRHOHOOHIROHCRICRO var1, RHOORRIIOCHIRRHOHOOHIROHCRICRO var2, IIHRHCCOOHOOOOCHRRCOROOIOHCOOO var3, PrintWriter var4, String var5
   ) {
      try {
         Enumeration var6 = var2.getEntries();

         while (var6.hasMoreElements()) {
            this.calculatedDelta = null;
            HCHRIROHHHCORIOCROOCHRCIOROOCI var7 = (HCHRIROHHHCORIOCROOCHRCIOROOCI)var6.nextElement();
            HCHRIROHHHCORIOCROOCHRCIOROOCI var8 = this.findBestSource(var1, var2, var7);
            String var9 = var5 + var7.getName();
            if (var8 != null && zipFilesPattern.matcher(var8.getName()).matches() && !this.equal(var8, var7)) {
               var9 = var9 + "!";
            }

            var9 = var9 + "|" + Long.toHexString(var7.getCrc());
            if (var8 != null) {
               var9 = var9 + ":" + Long.toHexString(var8.getCrc());
            } else {
               var9 = var9 + ":0";
            }

            var4.println(var9);
            if (var7.isDirectory()) {
               if (var8 == null) {
                  HCHRIROHHHCORIOCROOCHRCIOROOCI var308 = entryToNewName(var7, var5 + var7.getName());
                  var3.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var308);
                  var3.closeArchiveEntry();
               }
            } else if (var8 != null && var8.getSize() > 16L && var7.getSize() > 16L) {
               if (!this.equal(var8, var7)) {
                  if (zipFilesPattern.matcher(var8.getName()).matches()) {
                     File var307 = File.createTempFile("jardelta-tmp", ".zip");
                     File var310 = File.createTempFile("jardelta-tmp", ".zip");

                     try (
                        FileOutputStream var312 = new FileOutputStream(var310);
                        InputStream var316 = var1.RHOCHHIRRCHHHOHOIRROIROHHHIHIO(var8);
                        FileOutputStream var318 = new FileOutputStream(var307);
                        InputStream var320 = var2.RHOCHHIRRCHHHOHOIRROIROHHHIHIO(var7);
                     ) {
                        int var20 = 0;

                        while (-1 < (var20 = var316.read(this.buffer))) {
                           var312.write(this.buffer, 0, var20);
                        }

                        var312.flush();
                        int var323 = 0;

                        while (-1 < (var323 = var320.read(this.buffer))) {
                           var318.write(this.buffer, 0, var323);
                        }

                        var318.flush();
                        this.computeDelta(
                           new RHOORRIIOCHIRRHOHOOHIROHCRICRO(var310), new RHOORRIIOCHIRRHOHOOHIROHCRICRO(var307), var3, var4, var5 + var8.getName() + "!"
                        );
                     } finally {
                        var310.delete();
                        var307.delete();
                     }
                  } else {
                     HCHRIROHHHCORIOCROOCHRCIOROOCI var306 = new HCHRIROHHHCORIOCROOCHRCIOROOCI(var5 + var7.getName() + ".gdiff");
                     var306.setTime(var7.getTime());
                     var306.setComment("" + var7.getCrc());
                     var3.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var306);
                     if (this.calculatedDelta != null) {
                        var3.write(this.calculatedDelta);
                        var3.flush();
                     } else {
                        try (ByteArrayOutputStream var309 = new ByteArrayOutputStream()) {
                           CRRRICCRROCOHHOHIICIHORCOORRRH var314 = new CRRRICCRROCOHHOHIICIHORCOORRRH();
                           HRCHROOHRIHCRCRHRIIROCIRHOIRHH var14 = new HRCHROOHRIHCRCRHRIIROCIRHOIRHH(new DataOutputStream(var309));
                           int var15 = (int)var8.getSize();
                           byte[] var16 = new byte[var15];

                           try (InputStream var17 = var1.RHOCHHIRRCHHHOHOIRROIROHHHIHIO(var8)) {
                              int var19 = var17.read(var16);

                              while (var19 < var16.length) {
                                 var19 += var17.read(var16, var19, var16.length - var19);
                              }
                           }

                           var314.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var16, var2.RHOCHHIRRCHHHOHOIRROIROHHHIHIO(var7), var14);
                           var3.write(var309.toByteArray());
                        }
                     }

                     var3.closeArchiveEntry();
                  }
               }
            } else {
               HCHRIROHHHCORIOCROOCHRCIOROOCI var10 = entryToNewName(var7, var5 + var7.getName());
               var3.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var10);

               try (InputStream var11 = var2.RHOCHHIRRCHHHOHOIRROIROHHHIHIO(var7)) {
                  int var13 = 0;

                  while (-1 < (var13 = var11.read(this.buffer))) {
                     var3.write(this.buffer, 0, var13);
                  }

                  var3.flush();
               }

               var3.closeArchiveEntry();
            }
         }
      } finally {
         var1.close();
         var2.close();
      }
   }

   public boolean equal(HCHRIROHHHCORIOCROOCHRCIOROOCI var1, HCHRIROHHHCORIOCROOCHRCIOROOCI var2) {
      return var1.getSize() == var2.getSize() && var1.getCrc() == var2.getCrc();
   }

   public HCHRIROHHHCORIOCROOCHRCIOROOCI findBestSource(
      RHOORRIIOCHIRRHOHOOHIROHCRICRO var1, RHOORRIIOCHIRRHOHOOHIROHCRICRO var2, HCHRIROHHHCORIOCROOCHRCIOROOCI var3
   ) {
      ArrayList var4 = new ArrayList();

      for (HCHRIROHHHCORIOCROOCHRCIOROOCI var6 : var1.getEntries(var3.getName())) {
         if (var6.getCrc() == var3.getCrc()) {
            return var6;
         }

         var4.add(var6);
      }

      if (var4.size() == 0) {
         return null;
      }

      if (var4.size() != 1 && !var3.isDirectory()) {
         HCHRIROHHHCORIOCROOCHRCIOROOCI var42 = null;

         for (HCHRIROHHHCORIOCROOCHRCIOROOCI var7 : var4) {
            try (ByteArrayOutputStream var8 = new ByteArrayOutputStream()) {
               CRRRICCRROCOHHOHIICIHORCOORRRH var10 = new CRRRICCRROCOHHOHIICIHORCOORRRH();
               HRCHROOHRIHCRCRHRIIROCIRHOIRHH var11 = new HRCHROOHRIHCRCRHRIIROCIRHOIRHH(new DataOutputStream(var8));
               int var12 = (int)var7.getSize();
               byte[] var13 = new byte[var12];

               try (InputStream var14 = var1.RHOCHHIRRCHHHOHOIRROIROHHHIHIO(var7)) {
                  int var16 = var14.read(var13);

                  while (var16 < var13.length) {
                     var16 += var14.read(var13, var16, var13.length - var16);
                  }
               }

               var10.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var13, var2.RHOCHHIRRCHHHOHOIRROIROHHHIHIO(var3), var11);
               byte[] var44 = var8.toByteArray();
               if (this.calculatedDelta == null || this.calculatedDelta.length > var44.length) {
                  var42 = var7;
                  this.calculatedDelta = var44;
               }
            }
         }

         return var42;
      } else {
         return (HCHRIROHHHCORIOCROOCHRCIOROOCI)var4.get(0);
      }
   }

   public static void main(String[] var0) {
      if (var0.length != 3) {
         System.err.println("usage JarDelta source target output");
      } else {
         IIHRHCCOOHOOOOCHRRCOROOIOHCOOO var1 = new IIHRHCCOOHOOOOCHRRCOROOIOHCOOO(new FileOutputStream(var0[2]));
         Throwable var2 = null;

         try {
            new JarDelta().computeDelta(var0[0], var0[1], new RHOORRIIOCHIRRHOHOOHIROHCRICRO(var0[0]), new RHOORRIIOCHIRRHOHOOHIROHCRICRO(var0[1]), var1);
         } catch (Throwable var11) {
            var2 = var11;
            throw var11;
         } finally {
            if (var1 != null) {
               if (var2 != null) {
                  try {
                     var1.close();
                  } catch (Throwable var10) {
                     var2.addSuppressed(var10);
                  }
               } else {
                  var1.close();
               }
            }
         }
      }
   }

   public static HCHRIROHHHCORIOCROOCHRCIOROOCI entryToNewName(HCHRIROHHHCORIOCROOCHRCIOROOCI var0, String var1) {
      if (var0.getName().equals(var1)) {
         return new HCHRIROHHHCORIOCROOCHRCIOROOCI(var0);
      }

      HCHRIROHHHCORIOCROOCHRCIOROOCI var2 = new HCHRIROHHHCORIOCROOCHRCIOROOCI(var1);
      byte[] var3 = var0.getExtra();
      if (var3 != null) {
         var2.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
            CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3, true, RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CHICOICRIHORRHHCICCCOROROHCHHI)
         );
      } else {
         var2.setExtra(CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0.HOHOCIRCROOOROIOOHOHICORHIIOII(true)));
      }

      var2.setInternalAttributes(var0.getInternalAttributes());
      var2.setExternalAttributes(var0.getExternalAttributes());
      var2.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var0.HOHOCIRCROOOROIOOHOHICORHIIOII(true));
      var2.setCrc(var0.getCrc());
      var2.setMethod(var0.getMethod());
      var2.setSize(var0.getSize());
      return var2;
   }
}
