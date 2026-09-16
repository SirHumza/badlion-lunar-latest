package org.apache.commons.compress.archivers.sevenz;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class CLI {
   private static final byte[] BUF = new byte[8192];

   public static void main(String[] var0) {
      if (var0.length == 0) {
         usage();
      } else {
         CLI.Mode var1 = grabMode(var0);
         System.out.println(var1.getMessage() + " " + var0[0]);
         File var2 = new File(var0[0]);
         if (!var2.isFile()) {
            System.err.println(var2 + " doesn't exist or is a directory");
         }

         SevenZFile var3 = new SevenZFile(var2);

         SevenZArchiveEntry var4;
         try {
            while ((var4 = var3.getNextEntry()) != null) {
               var1.takeAction(var3, var4);
            }
         } finally {
            var3.close();
         }
      }
   }

   private static void usage() {
      System.out.println("Parameters: archive-name [list|extract]");
   }

   private static CLI.Mode grabMode(String[] var0) {
      return var0.length < 2 ? CLI.Mode.LIST : Enum.valueOf(CLI.Mode.class, var0[1].toUpperCase());
   }

   private enum Mode {
      LIST("Analysing") {
         @Override
         public void takeAction(SevenZFile var1, SevenZArchiveEntry var2) {
            System.out.print(var2.getName());
            if (var2.isDirectory()) {
               System.out.print(" dir");
            } else {
               System.out.print(" " + var2.getCompressedSize() + "/" + var2.getSize());
            }

            if (var2.getHasLastModifiedDate()) {
               System.out.print(" " + var2.getLastModifiedDate());
            } else {
               System.out.print(" no last modified date");
            }

            if (!var2.isDirectory()) {
               System.out.println(" " + this.getContentMethods(var2));
            } else {
               System.out.println("");
            }
         }

         private String getContentMethods(SevenZArchiveEntry var1) {
            StringBuilder var2 = new StringBuilder();
            boolean var3 = true;

            for (SevenZMethodConfiguration var5 : var1.getContentMethods()) {
               if (!var3) {
                  var2.append(", ");
               }

               var3 = false;
               var2.append(var5.getMethod());
               if (var5.getOptions() != null) {
                  var2.append("(" + var5.getOptions() + ")");
               }
            }

            return var2.toString();
         }
      },
      EXTRACT("Extracting") {
         @Override
         public void takeAction(SevenZFile var1, SevenZArchiveEntry var2) {
            File var3 = new File(var2.getName());
            if (var2.isDirectory()) {
               if (!var3.isDirectory() && !var3.mkdirs()) {
                  throw new IOException("Cannot create directory " + var3);
               }

               System.out.println("created directory " + var3);
            } else {
               System.out.println("extracting to " + var3);
               File var4 = var3.getParentFile();
               if (var4 != null && !var4.exists() && !var4.mkdirs()) {
                  throw new IOException("Cannot create " + var4);
               }

               FileOutputStream var5 = new FileOutputStream(var3);

               try {
                  long var6 = var2.getSize();
                  long var8 = 0L;

                  while (var8 < var6) {
                     int var10 = (int)Math.min(var6 - var8, CLI.BUF.length);
                     int var11 = var1.read(CLI.BUF, 0, var10);
                     if (var11 < 1) {
                        throw new IOException("reached end of entry " + var2.getName() + " after " + var8 + " bytes, expected " + var6);
                     }

                     var8 += var11;
                     var5.write(CLI.BUF, 0, var11);
                  }
               } finally {
                  var5.close();
               }
            }
         }
      };

      private final String message;

      Mode(String var3) {
         this.message = var3;
      }

      public String getMessage() {
         return this.message;
      }

      public abstract void takeAction(SevenZFile var1, SevenZArchiveEntry var2);
   }
}
