package org.apache.commons.cli;

import java.util.ArrayList;

public class GnuParser extends Parser {
   protected String[] flatten(Options var1, String[] var2, boolean var3) {
      ArrayList var4 = new ArrayList();
      boolean var5 = false;

      for (int var6 = 0; var6 < var2.length; var6++) {
         String var7 = var2[var6];
         if ("--".equals(var7)) {
            var5 = true;
            var4.add("--");
         } else if ("-".equals(var7)) {
            var4.add("-");
         } else if (var7.startsWith("-")) {
            String var8 = Util.stripLeadingHyphens(var7);
            if (var1.hasOption(var8)) {
               var4.add(var7);
            } else if (var8.indexOf(61) != -1 && var1.hasOption(var8.substring(0, var8.indexOf(61)))) {
               var4.add(var7.substring(0, var7.indexOf(61)));
               var4.add(var7.substring(var7.indexOf(61) + 1));
            } else if (var1.hasOption(var7.substring(0, 2))) {
               var4.add(var7.substring(0, 2));
               var4.add(var7.substring(2));
            } else {
               var5 = var3;
               var4.add(var7);
            }
         } else {
            var4.add(var7);
         }

         if (var5) {
            var6++;

            while (var6 < var2.length) {
               var4.add(var2[var6]);
               var6++;
            }
         }
      }

      return var4.toArray(new String[var4.size()]);
   }
}
