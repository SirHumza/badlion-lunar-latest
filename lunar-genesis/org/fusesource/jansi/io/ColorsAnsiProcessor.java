package org.fusesource.jansi.io;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import org.fusesource.jansi.AnsiColors;

public class ColorsAnsiProcessor extends AnsiProcessor {
   private final AnsiColors colors;

   public ColorsAnsiProcessor(OutputStream var1, AnsiColors var2) {
      super(var1);
      this.colors = var2;
   }

   @Override
   protected boolean processEscapeCommand(ArrayList<Object> var1, int var2) {
      if (var2 == 109 && (this.colors == AnsiColors.Colors256 || this.colors == AnsiColors.Colors16)) {
         boolean var3 = false;

         for (Object var5 : var1) {
            if (var5 != null && var5.getClass() != Integer.class) {
               throw new IllegalArgumentException();
            }

            Integer var6 = (Integer)var5;
            var3 |= var6 == 38 || var6 == 48;
         }

         if (!var3) {
            return false;
         }

         StringBuilder var14 = new StringBuilder(32);
         var14.append('\u001b').append('[');
         boolean var15 = true;
         Iterator var16 = var1.iterator();

         while (var16.hasNext()) {
            Object var7 = var16.next();
            if (var7 != null) {
               int var8 = (Integer)var7;
               if (var8 != 38 && var8 != 48) {
                  if (!var15) {
                     var14.append(';');
                  }

                  var15 = false;
                  var14.append(var8);
               } else {
                  int var9 = this.getNextOptionInt(var16);
                  if (var9 == 2) {
                     int var10 = this.getNextOptionInt(var16);
                     int var11 = this.getNextOptionInt(var16);
                     int var12 = this.getNextOptionInt(var16);
                     if (this.colors == AnsiColors.Colors256) {
                        int var13 = Colors.roundRgbColor(var10, var11, var12, 256);
                        if (!var15) {
                           var14.append(';');
                        }

                        var15 = false;
                        var14.append(var8);
                        var14.append(';');
                        var14.append(5);
                        var14.append(';');
                        var14.append(var13);
                     } else {
                        int var19 = Colors.roundRgbColor(var10, var11, var12, 16);
                        if (!var15) {
                           var14.append(';');
                        }

                        var15 = false;
                        var14.append(var8 == 38 ? (var19 >= 8 ? 90 + var19 - 8 : 30 + var19) : (var19 >= 8 ? 100 + var19 - 8 : 40 + var19));
                     }
                  } else {
                     if (var9 != 5) {
                        throw new IllegalArgumentException();
                     }

                     int var17 = this.getNextOptionInt(var16);
                     if (this.colors == AnsiColors.Colors256) {
                        if (!var15) {
                           var14.append(';');
                        }

                        var15 = false;
                        var14.append(var8);
                        var14.append(';');
                        var14.append(5);
                        var14.append(';');
                        var14.append(var17);
                     } else {
                        int var18 = Colors.roundColor(var17, 16);
                        if (!var15) {
                           var14.append(';');
                        }

                        var15 = false;
                        var14.append(var8 == 38 ? (var18 >= 8 ? 90 + var18 - 8 : 30 + var18) : (var18 >= 8 ? 100 + var18 - 8 : 40 + var18));
                     }
                  }
               }
            }
         }

         var14.append('m');
         this.os.write(var14.toString().getBytes());
         return true;
      } else {
         return false;
      }
   }

   @Override
   protected boolean processOperatingSystemCommand(ArrayList<Object> var1) {
      return false;
   }

   @Override
   protected boolean processCharsetSelect(ArrayList<Object> var1) {
      return false;
   }
}
