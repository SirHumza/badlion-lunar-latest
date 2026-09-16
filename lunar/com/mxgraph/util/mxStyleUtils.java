package com.mxgraph.util;

import com.mxgraph.model.mxIGraphModel;
import java.util.ArrayList;

public class mxStyleUtils {
   public static String getStylename(String var0) {
      if (var0 != null) {
         String[] var1 = var0.split(";");
         String var2 = var1[0];
         if (var2.indexOf("=") < 0) {
            return var2;
         }
      }

      return "";
   }

   public static String[] getStylenames(String var0) {
      ArrayList var1 = new ArrayList();
      if (var0 != null) {
         String[] var2 = var0.split(";");

         for (int var3 = 0; var3 < var2.length; var3++) {
            if (var2[var3].indexOf("=") < 0) {
               var1.add(var2[var3]);
            }
         }
      }

      return var1.toArray(new String[var1.size()]);
   }

   public static int indexOfStylename(String var0, String var1) {
      if (var0 != null && var1 != null) {
         String[] var2 = var0.split(";");
         int var3 = 0;

         for (int var4 = 0; var4 < var2.length; var4++) {
            if (var2[var4].equals(var1)) {
               return var3;
            }

            var3 += var2[var4].length() + 1;
         }
      }

      return -1;
   }

   public static String addStylename(String var0, String var1) {
      if (indexOfStylename(var0, var1) < 0) {
         if (var0 == null) {
            var0 = "";
         } else if (var0.length() > 0 && var0.charAt(var0.length() - 1) != ';') {
            var0 = var0 + ';';
         }

         var0 = var0 + var1;
      }

      return var0;
   }

   public static String removeStylename(String var0, String var1) {
      StringBuffer var2 = new StringBuffer();
      if (var0 != null) {
         String[] var3 = var0.split(";");

         for (int var4 = 0; var4 < var3.length; var4++) {
            if (!var3[var4].equals(var1)) {
               var2.append(var3[var4] + ";");
            }
         }
      }

      return var2.length() > 1 ? var2.substring(0, var2.length() - 1) : var2.toString();
   }

   public static String removeAllStylenames(String var0) {
      StringBuffer var1 = new StringBuffer();
      if (var0 != null) {
         String[] var2 = var0.split(";");

         for (int var3 = 0; var3 < var2.length; var3++) {
            if (var2[var3].indexOf(61) >= 0) {
               var1.append(var2[var3] + ";");
            }
         }
      }

      return var1.length() > 1 ? var1.substring(0, var1.length() - 1) : var1.toString();
   }

   public static void setCellStyles(mxIGraphModel var0, Object[] var1, String var2, String var3) {
      if (var1 != null && var1.length > 0) {
         var0.beginUpdate();

         try {
            for (int var4 = 0; var4 < var1.length; var4++) {
               if (var1[var4] != null) {
                  String var5 = setStyle(var0.getStyle(var1[var4]), var2, var3);
                  var0.setStyle(var1[var4], var5);
               }
            }
         } finally {
            var0.endUpdate();
         }
      }
   }

   public static String setStyle(String var0, String var1, String var2) {
      boolean var3 = var2 != null && var2.length() > 0;
      if (var0 != null && var0.length() != 0) {
         int var4 = var0.indexOf(var1 + "=");
         if (var4 < 0) {
            if (var3) {
               String var5 = var0.endsWith(";") ? "" : ";";
               var0 = var0 + var5 + var1 + '=' + var2;
            }
         } else {
            String var7 = var3 ? var1 + "=" + var2 : "";
            int var6 = var0.indexOf(";", var4);
            if (!var3) {
               var6++;
            }

            var0 = var0.substring(0, var4) + var7 + (var6 > var4 ? var0.substring(var6) : "");
         }
      } else if (var3) {
         var0 = var1 + "=" + var2;
      }

      return var0;
   }

   public static void setCellStyleFlags(mxIGraphModel var0, Object[] var1, String var2, int var3, Boolean var4) {
      if (var1 != null && var1.length > 0) {
         var0.beginUpdate();

         try {
            for (int var5 = 0; var5 < var1.length; var5++) {
               if (var1[var5] != null) {
                  String var6 = setStyleFlag(var0.getStyle(var1[var5]), var2, var3, var4);
                  var0.setStyle(var1[var5], var6);
               }
            }
         } finally {
            var0.endUpdate();
         }
      }
   }

   public static String setStyleFlag(String var0, String var1, int var2, Boolean var3) {
      if (var0 != null && var0.length() != 0) {
         int var4 = var0.indexOf(var1 + "=");
         if (var4 < 0) {
            String var5 = var0.endsWith(";") ? "" : ";";
            if (var3 != null && !var3) {
               var0 = var0 + var5 + var1 + "=0";
            } else {
               var0 = var0 + var5 + var1 + "=" + var2;
            }
         } else {
            int var9 = var0.indexOf(";", var4);
            String var6 = "";
            int var7 = 0;
            if (var9 < 0) {
               var6 = var0.substring(var4 + var1.length() + 1);
            } else {
               var6 = var0.substring(var4 + var1.length() + 1, var9);
            }

            if (var3 == null) {
               var7 = Integer.parseInt(var6) ^ var2;
            } else if (var3) {
               var7 = Integer.parseInt(var6) | var2;
            } else {
               var7 = Integer.parseInt(var6) & ~var2;
            }

            var0 = var0.substring(0, var4) + var1 + "=" + var7 + (var9 >= 0 ? var0.substring(var9) : "");
         }
      } else if (var3 != null && !var3) {
         var0 = var1 + "=0";
      } else {
         var0 = var1 + "=" + var2;
      }

      return var0;
   }
}
