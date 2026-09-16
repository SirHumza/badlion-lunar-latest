package at.spardat.xma.xdelta;

import com.moonsworth.lunar.forge.lib.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;
import com.moonsworth.lunar.forge.lib.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;
import com.moonsworth.lunar.forge.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.CORCOCICIRIOHROHROIIOOHICCHCRR;
import com.moonsworth.lunar.forge.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.HCHRIROHHHCORIOCROOCHRCIOROOCI;
import com.moonsworth.lunar.forge.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.IIHRHCCOOHOOOOCHRRCOROOIOHCOOO;
import com.moonsworth.lunar.forge.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.RHOORRIIOCHIRRHOHOOHIROHCRICRO;
import com.moonsworth.lunar.forge.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JarPatcher {
   private final String patchName;
   private final String sourceName;
   private final byte[] buffer = new byte[8192];
   private String next = null;

   public void applyDelta(RHOORRIIOCHIRRHOHOOHIROHCRICRO var1, RHOORRIIOCHIRRHOHOOHIROHCRICRO var2, IIHRHCCOOHOOOOCHRRCOROOIOHCOOO var3, BufferedReader var4) {
      this.applyDelta(var1, var2, var3, var4, "");
      var1.close();
   }

   public void applyDelta(
      RHOORRIIOCHIRRHOHOOHIROHCRICRO var1, RHOORRIIOCHIRRHOHOOHIROHCRICRO var2, IIHRHCCOOHOOOOCHRRCOROOIOHCOOO var3, BufferedReader var4, String var5
   ) {
      String var6 = null;

      try {
         for (var6 = this.next == null ? var4.readLine() : this.next; var6 != null; var6 = this.next == null ? var4.readLine() : this.next) {
            if (this.next != null) {
               this.next = null;
            }

            if (!var6.startsWith(var5)) {
               this.next = var6;
               return;
            }

            int var7 = var6.lastIndexOf(58);
            int var8 = var6.lastIndexOf(124);
            long var9 = Long.valueOf(var6.substring(var8 + 1, var7), 16);
            long var11 = Long.valueOf(var6.substring(var7 + 1), 16);
            var6 = var6.substring(var5.length(), var8);
            if (!"META-INF/file.list".equalsIgnoreCase(var6)) {
               if (var6.contains("!")) {
                  String[] var13 = var6.split("\\!");
                  HCHRIROHHHCORIOCROOCHRCIOROOCI var14 = this.getEntry(var2, var13[0], var11);
                  File var15 = File.createTempFile("jardelta-tmp-origin-", ".zip");
                  File var16 = File.createTempFile("jardelta-tmp-output-", ".zip");
                  Exception var17 = null;

                  try (
                     FileOutputStream var18 = new FileOutputStream(var15);
                     InputStream var20 = var2.RHOCHHIRRCHHHOHOIRROIROHHHIHIO(var14);
                  ) {
                     int var22 = 0;

                     while (-1 < (var22 = var20.read(this.buffer))) {
                        var18.write(this.buffer, 0, var22);
                     }

                     var18.flush();
                     this.applyDelta(var1, new RHOORRIIOCHIRRHOHOOHIROHCRICRO(var15), new IIHRHCCOOHOOOOCHRRCOROOIOHCOOO(var16), var4, var5 + var13[0] + "!");
                  } catch (Exception var409) {
                     var17 = var409;
                     throw var409;
                  } finally {
                     var15.delete();

                     try (FileInputStream var31 = new FileInputStream(var16)) {
                        if (var17 == null) {
                           HCHRIROHHHCORIOCROOCHRCIOROOCI var33 = this.copyEntry(var14);
                           var3.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var33);
                           int var34 = 0;

                           while (-1 < (var34 = var31.read(this.buffer))) {
                              var3.write(this.buffer, 0, var34);
                           }

                           var3.flush();
                           var3.closeArchiveEntry();
                        }
                     } finally {
                        var16.delete();
                     }
                  }
               } else {
                  try {
                     HCHRIROHHHCORIOCROOCHRCIOROOCI var413 = this.getEntry(var1, var5 + var6, var9);
                     if (var413 != null) {
                        HCHRIROHHHCORIOCROOCHRCIOROOCI var416 = JarDelta.entryToNewName(var413, var6);
                        var3.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var416);
                        if (!var413.isDirectory()) {
                           try (InputStream var418 = var1.RHOCHHIRRCHHHOHOIRROIROHHHIHIO(var413)) {
                              int var425 = 0;

                              while (-1 < (var425 = var418.read(this.buffer))) {
                                 var3.write(this.buffer, 0, var425);
                              }
                           }
                        }

                        this.closeEntry(var3, var416, var9);
                     } else {
                        HCHRIROHHHCORIOCROOCHRCIOROOCI var417 = this.getEntry(var2, var6, var11);
                        if (var417 == null) {
                           throw new FileNotFoundException(var6 + " not found in " + this.sourceName + " or " + this.patchName);
                        }

                        if (var417.isDirectory()) {
                           HCHRIROHHHCORIOCROOCHRCIOROOCI var419 = new HCHRIROHHHCORIOCROOCHRCIOROOCI(var417);
                           var3.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var419);
                           this.closeEntry(var3, var419, var9);
                        } else {
                           var413 = this.getPatchEntry(var1, var5 + var6 + ".gdiff", var9);
                           if (var413 != null) {
                              HCHRIROHHHCORIOCROOCHRCIOROOCI var420 = new HCHRIROHHHCORIOCROOCHRCIOROOCI(var417);
                              var420.setTime(var413.getTime());
                              var3.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var420);
                              byte[] var423 = new byte[(int)var417.getSize()];

                              try (InputStream var427 = var2.RHOCHHIRRCHHHOHOIRROIROHHHIHIO(var417)) {
                                 int var434 = var427.read(var423);

                                 while (var434 < var423.length) {
                                    var434 += var427.read(var423, var434, var423.length - var434);
                                 }
                              }

                              InputStream var428 = var1.RHOCHHIRRCHHHOHOIRROIROHHHIHIO(var413);
                              RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var431 = new RIOOCHICIHRHOHCCCCCHOCCCOHCRHI();
                              var431.patch(var423, var428, var3);
                              var428.close();
                              var420.setCrc(var9);
                              this.closeEntry(var3, var420, var9);
                           } else {
                              HCHRIROHHHCORIOCROOCHRCIOROOCI var421 = new HCHRIROHHHCORIOCROOCHRCIOROOCI(var417);
                              if (JarDelta.zipFilesPattern.matcher(var417.getName()).matches()) {
                                 var9 = var417.getCrc();
                              }

                              var3.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var421);

                              try (InputStream var424 = var2.RHOCHHIRRCHHHOHOIRROIROHHHIHIO(var417)) {
                                 int var432 = 0;

                                 while (-1 < (var432 = var424.read(this.buffer))) {
                                    var3.write(this.buffer, 0, var432);
                                 }
                              }

                              var3.flush();
                              this.closeEntry(var3, var421, var9);
                           }
                        }
                     }
                  } catch (OOROOCCIRCCRHOIOIORIHCHHOOCCOR var404) {
                     IOException var415 = new IOException();
                     var415.initCause(var404);
                     throw var415;
                  }
               }
            }
         }
      } catch (Exception var411) {
         System.err.println(var5 + var6);
         throw var411;
      } finally {
         var2.close();
         var3.close();
      }
   }

   private HCHRIROHHHCORIOCROOCHRCIOROOCI getEntry(RHOORRIIOCHIRRHOHOOHIROHCRICRO var1, String var2, long var3) {
      for (HCHRIROHHHCORIOCROOCHRCIOROOCI var6 : var1.getEntries(var2)) {
         if (var6.getCrc() == var3) {
            return var6;
         }
      }

      return !JarDelta.zipFilesPattern.matcher(var2).matches() ? null : var1.OROIICHIOHCOCHRHCHRIRRHHRCCHHR(var2);
   }

   private HCHRIROHHHCORIOCROOCHRCIOROOCI getPatchEntry(RHOORRIIOCHIRRHOHOOHIROHCRICRO var1, String var2, long var3) {
      for (HCHRIROHHHCORIOCROOCHRCIOROOCI var6 : var1.getEntries(var2)) {
         long var7 = Long.parseLong(var6.getComment());
         if (var7 == var3) {
            return var6;
         }
      }

      return null;
   }

   private void closeEntry(IIHRHCCOOHOOOOCHRRCOROOIOHCOOO var1, HCHRIROHHHCORIOCROOCHRCIOROOCI var2, long var3) {
      var1.flush();
      var1.closeArchiveEntry();
      if (var2.getCrc() != var3) {
         throw new IOException("CRC mismatch for " + var2.getName());
      }
   }

   public JarPatcher(String var1, String var2) {
      this.patchName = var1;
      this.sourceName = var2;
   }

   public static void main(String[] var0) {
      String var1 = null;
      String var2 = null;
      String var3 = null;
      if (var0.length == 0) {
         System.err.println("usage JarPatcher patch [output [source]]");
         System.exit(1);
      } else {
         var1 = var0[0];
         if (var0.length > 1) {
            var2 = var0[1];
            if (var0.length > 2) {
               var3 = var0[2];
            }
         }
      }

      RHOORRIIOCHIRRHOHOOHIROHCRICRO var4 = new RHOORRIIOCHIRRHOHOOHIROHCRICRO(var1);
      HCHRIROHHHCORIOCROOCHRCIOROOCI var5 = var4.OROIICHIOHCOCHRHCHRIRRHHRCCHHR("META-INF/file.list");
      if (var5 == null) {
         System.err.println("Invalid patch - list entry 'META-INF/file.list' not found");
         System.exit(2);
      }

      BufferedReader var6 = new BufferedReader(new InputStreamReader(var4.RHOCHHIRRCHHHOHOIRROIROHHHIHIO(var5)));
      String var7 = var6.readLine();
      if (var3 == null) {
         var3 = var7;
      }

      var7 = var6.readLine();
      if (var2 == null) {
         var2 = var7;
      }

      int var8 = Integer.parseInt(System.getProperty("patcher.ignoreSourcePathElements", "0"));
      int var9 = Integer.parseInt(System.getProperty("patcher.ignoreOutputPathElements", "0"));
      Path var10 = Paths.get(var3);
      Path var11 = Paths.get(var2);
      if (var9 >= var11.getNameCount()) {
         var4.close();
         StringBuilder var16 = new StringBuilder()
            .append("Not enough path elements to ignore in output (")
            .append(var9)
            .append(" in ")
            .append(var2)
            .append(")");
         throw new IOException(var16.toString());
      }

      if (var8 >= var10.getNameCount()) {
         var4.close();
         StringBuilder var15 = new StringBuilder()
            .append("Not enough path elements to ignore in source (")
            .append(var10)
            .append(" in ")
            .append(var3)
            .append(")");
         throw new IOException(var15.toString());
      }

      if (var8 > 0) {
         var10 = var10.subpath(var8, var10.getNameCount());
      }

      if (var9 > 0) {
         var11 = var11.subpath(var9, var11.getNameCount());
      }

      File var12 = var10.toFile();
      File var13 = var11.toFile();
      if (!var13.getAbsoluteFile().getParentFile().mkdirs() && !var13.getAbsoluteFile().getParentFile().exists()) {
         var4.close();
         throw new IOException("Failed to create " + var13.getAbsolutePath());
      }

      new JarPatcher(var1, var12.getName())
         .applyDelta(var4, new RHOORRIIOCHIRRHOHOOHIROHCRICRO(var12), new IIHRHCCOOHOOOOCHRRCOROOIOHCOOO(new FileOutputStream(var13)), var6);
      var6.close();
   }

   private HCHRIROHHHCORIOCROOCHRCIOROOCI copyEntry(HCHRIROHHHCORIOCROOCHRCIOROOCI var1) {
      HCHRIROHHHCORIOCROOCHRCIOROOCI var2 = new HCHRIROHHHCORIOCROOCHRCIOROOCI(var1.getName());
      byte[] var3 = var1.getExtra();
      if (var3 != null) {
         var2.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
            CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3, true, RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CHICOICRIHORRHHCICCCOROROHCHHI)
         );
      } else {
         var2.setExtra(CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.HOHOCIRCROOOROIOOHOHICORHIIOII(true)));
      }

      var2.setInternalAttributes(var1.getInternalAttributes());
      var2.setExternalAttributes(var1.getExternalAttributes());
      var2.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1.HOHOCIRCROOOROIOOHOHICORHIIOII(true));
      return var2;
   }
}
