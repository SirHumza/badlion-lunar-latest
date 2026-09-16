package org.fusesource.jansi.io;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class AnsiProcessor {
   protected final OutputStream os;
   protected static final int ERASE_SCREEN_TO_END = 0;
   protected static final int ERASE_SCREEN_TO_BEGINING = 1;
   protected static final int ERASE_SCREEN = 2;
   protected static final int ERASE_LINE_TO_END = 0;
   protected static final int ERASE_LINE_TO_BEGINING = 1;
   protected static final int ERASE_LINE = 2;
   protected static final int ATTRIBUTE_INTENSITY_BOLD = 1;
   protected static final int ATTRIBUTE_INTENSITY_FAINT = 2;
   protected static final int ATTRIBUTE_ITALIC = 3;
   protected static final int ATTRIBUTE_UNDERLINE = 4;
   protected static final int ATTRIBUTE_BLINK_SLOW = 5;
   protected static final int ATTRIBUTE_BLINK_FAST = 6;
   protected static final int ATTRIBUTE_NEGATIVE_ON = 7;
   protected static final int ATTRIBUTE_CONCEAL_ON = 8;
   protected static final int ATTRIBUTE_UNDERLINE_DOUBLE = 21;
   protected static final int ATTRIBUTE_INTENSITY_NORMAL = 22;
   protected static final int ATTRIBUTE_UNDERLINE_OFF = 24;
   protected static final int ATTRIBUTE_BLINK_OFF = 25;
   protected static final int ATTRIBUTE_NEGATIVE_OFF = 27;
   protected static final int ATTRIBUTE_CONCEAL_OFF = 28;
   protected static final int BLACK = 0;
   protected static final int RED = 1;
   protected static final int GREEN = 2;
   protected static final int YELLOW = 3;
   protected static final int BLUE = 4;
   protected static final int MAGENTA = 5;
   protected static final int CYAN = 6;
   protected static final int WHITE = 7;

   public AnsiProcessor(OutputStream var1) {
      this.os = var1;
   }

   protected int getNextOptionInt(Iterator<Object> var1) {
      while (var1.hasNext()) {
         Object var2 = var1.next();
         if (var2 != null) {
            return (Integer)var2;
         }
      }

      throw new IllegalArgumentException();
   }

   protected boolean processEscapeCommand(ArrayList<Object> var1, int var2) {
      try {
         switch (var2) {
            case 65:
               this.processCursorUp(this.optionInt(var1, 0, 1));
               return true;
            case 66:
               this.processCursorDown(this.optionInt(var1, 0, 1));
               return true;
            case 67:
               this.processCursorRight(this.optionInt(var1, 0, 1));
               return true;
            case 68:
               this.processCursorLeft(this.optionInt(var1, 0, 1));
               return true;
            case 69:
               this.processCursorDownLine(this.optionInt(var1, 0, 1));
               return true;
            case 70:
               this.processCursorUpLine(this.optionInt(var1, 0, 1));
               return true;
            case 71:
               this.processCursorToColumn(this.optionInt(var1, 0));
               return true;
            case 72:
            case 102:
               this.processCursorTo(this.optionInt(var1, 0, 1), this.optionInt(var1, 1, 1));
               return true;
            case 73:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
            case 103:
            case 104:
            case 105:
            case 106:
            case 107:
            case 108:
            case 110:
            case 111:
            case 112:
            case 113:
            case 114:
            case 116:
            default:
               if (97 <= var2 && var2 <= 122) {
                  this.processUnknownExtension(var1, var2);
                  return true;
               } else {
                  if (65 <= var2 && var2 <= 90) {
                     this.processUnknownExtension(var1, var2);
                     return true;
                  }

                  return false;
               }
            case 74:
               this.processEraseScreen(this.optionInt(var1, 0, 0));
               return true;
            case 75:
               this.processEraseLine(this.optionInt(var1, 0, 0));
               return true;
            case 76:
               this.processInsertLine(this.optionInt(var1, 0, 1));
               return true;
            case 77:
               this.processDeleteLine(this.optionInt(var1, 0, 1));
               return true;
            case 83:
               this.processScrollUp(this.optionInt(var1, 0, 1));
               return true;
            case 84:
               this.processScrollDown(this.optionInt(var1, 0, 1));
               return true;
            case 109:
               for (Object var4 : var1) {
                  if (var4 != null && var4.getClass() != Integer.class) {
                     throw new IllegalArgumentException();
                  }
               }

               int var12 = 0;
               Iterator var13 = var1.iterator();

               while (var13.hasNext()) {
                  Object var5 = var13.next();
                  if (var5 != null) {
                     var12++;
                     int var6 = (Integer)var5;
                     if (30 <= var6 && var6 <= 37) {
                        this.processSetForegroundColor(var6 - 30);
                     } else if (40 <= var6 && var6 <= 47) {
                        this.processSetBackgroundColor(var6 - 40);
                     } else if (90 <= var6 && var6 <= 97) {
                        this.processSetForegroundColor(var6 - 90, true);
                     } else if (100 <= var6 && var6 <= 107) {
                        this.processSetBackgroundColor(var6 - 100, true);
                     } else if (var6 != 38 && var6 != 48) {
                        switch (var6) {
                           case 0:
                              this.processAttributeReset();
                              break;
                           case 39:
                              this.processDefaultTextColor();
                              break;
                           case 49:
                              this.processDefaultBackgroundColor();
                              break;
                           default:
                              this.processSetAttribute(var6);
                        }
                     } else if (var13.hasNext()) {
                        int var7 = this.getNextOptionInt(var13);
                        if (var7 == 2) {
                           int var14 = this.getNextOptionInt(var13);
                           int var9 = this.getNextOptionInt(var13);
                           int var10 = this.getNextOptionInt(var13);
                           if (var14 < 0 || var14 > 255 || var9 < 0 || var9 > 255 || var10 < 0 || var10 > 255) {
                              throw new IllegalArgumentException();
                           }

                           if (var6 == 38) {
                              this.processSetForegroundColorExt(var14, var9, var10);
                           } else {
                              this.processSetBackgroundColorExt(var14, var9, var10);
                           }
                        } else {
                           if (var7 != 5) {
                              throw new IllegalArgumentException();
                           }

                           int var8 = this.getNextOptionInt(var13);
                           if (var8 < 0 || var8 > 255) {
                              throw new IllegalArgumentException();
                           }

                           if (var6 == 38) {
                              this.processSetForegroundColorExt(var8);
                           } else {
                              this.processSetBackgroundColorExt(var8);
                           }
                        }
                     }
                  }
               }

               if (var12 == 0) {
                  this.processAttributeReset();
               }

               return true;
            case 115:
               this.processSaveCursorPosition();
               return true;
            case 117:
               this.processRestoreCursorPosition();
               return true;
         }
      } catch (IllegalArgumentException var11) {
         return false;
      }
   }

   protected boolean processOperatingSystemCommand(ArrayList<Object> var1) {
      int var2 = this.optionInt(var1, 0);
      String var3 = (String)var1.get(1);

      try {
         switch (var2) {
            case 0:
               this.processChangeIconNameAndWindowTitle(var3);
               return true;
            case 1:
               this.processChangeIconName(var3);
               return true;
            case 2:
               this.processChangeWindowTitle(var3);
               return true;
            default:
               this.processUnknownOperatingSystemCommand(var2, var3);
               return true;
         }
      } catch (IllegalArgumentException var5) {
         return false;
      }
   }

   protected boolean processCharsetSelect(ArrayList<Object> var1) {
      int var2 = this.optionInt(var1, 0);
      char var3 = (Character)var1.get(1);
      this.processCharsetSelect(var2, var3);
      return true;
   }

   private int optionInt(ArrayList<Object> var1, int var2) {
      if (var1.size() <= var2) {
         throw new IllegalArgumentException();
      } else {
         Object var3 = var1.get(var2);
         if (var3 == null) {
            throw new IllegalArgumentException();
         } else if (!var3.getClass().equals(Integer.class)) {
            throw new IllegalArgumentException();
         } else {
            return (Integer)var3;
         }
      }
   }

   private int optionInt(ArrayList<Object> var1, int var2, int var3) {
      if (var1.size() > var2) {
         Object var4 = var1.get(var2);
         return var4 == null ? var3 : (Integer)var4;
      } else {
         return var3;
      }
   }

   protected void processRestoreCursorPosition() {
   }

   protected void processSaveCursorPosition() {
   }

   protected void processInsertLine(int var1) {
   }

   protected void processDeleteLine(int var1) {
   }

   protected void processScrollDown(int var1) {
   }

   protected void processScrollUp(int var1) {
   }

   protected void processEraseScreen(int var1) {
   }

   protected void processEraseLine(int var1) {
   }

   protected void processSetAttribute(int var1) {
   }

   protected void processSetForegroundColor(int var1) {
      this.processSetForegroundColor(var1, false);
   }

   protected void processSetForegroundColor(int var1, boolean var2) {
   }

   protected void processSetForegroundColorExt(int var1) {
   }

   protected void processSetForegroundColorExt(int var1, int var2, int var3) {
   }

   protected void processSetBackgroundColor(int var1) {
      this.processSetBackgroundColor(var1, false);
   }

   protected void processSetBackgroundColor(int var1, boolean var2) {
   }

   protected void processSetBackgroundColorExt(int var1) {
   }

   protected void processSetBackgroundColorExt(int var1, int var2, int var3) {
   }

   protected void processDefaultTextColor() {
   }

   protected void processDefaultBackgroundColor() {
   }

   protected void processAttributeReset() {
   }

   protected void processCursorTo(int var1, int var2) {
   }

   protected void processCursorToColumn(int var1) {
   }

   protected void processCursorUpLine(int var1) {
   }

   protected void processCursorDownLine(int var1) {
      for (int var2 = 0; var2 < var1; var2++) {
         this.os.write(10);
      }
   }

   protected void processCursorLeft(int var1) {
   }

   protected void processCursorRight(int var1) {
      for (int var2 = 0; var2 < var1; var2++) {
         this.os.write(32);
      }
   }

   protected void processCursorDown(int var1) {
   }

   protected void processCursorUp(int var1) {
   }

   protected void processUnknownExtension(ArrayList<Object> var1, int var2) {
   }

   protected void processChangeIconNameAndWindowTitle(String var1) {
      this.processChangeIconName(var1);
      this.processChangeWindowTitle(var1);
   }

   protected void processChangeIconName(String var1) {
   }

   protected void processChangeWindowTitle(String var1) {
   }

   protected void processUnknownOperatingSystemCommand(int var1, String var2) {
   }

   protected void processCharsetSelect(int var1, char var2) {
   }
}
