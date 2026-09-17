package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;

import java.io.IOException;
import java.util.Arrays;

public final class CRICCOOHHHCHOORCICOCOHIHOIRHOO {
   private static final char[] RCROROIIOHCCICHHHRHHROORCOCHCR = HHCCIRHCCCIIRHCROHIORHIRHHIORH.CCOICRIIHHOCCHCHCCIIHCORIRCOCO(true);
   private static final byte[] RCCIIRIOCRHIHIRCHHRCCRHOOIRIOI = HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRRHOORORIIIORRICHHHRCIOIIOROO(true);
   private static final int RCCHHCCIIIRHHIRORCOCHORCOOHHRR = 55296;
   private static final int RRIOIHHOOHCCCCIOIOCOIRHICHRRRI = 56319;
   private static final int HIRHCOIOICCOIRHCRRIIOROHRCCHCI = 56320;
   private static final int HOHOIRRCRCIRIRRRIOCCRRHOHRHHCC = 57343;
   static final int ROIOHRCCCHRIRRRIHHOHCRRHHIRCRC = 16;
   static final int ICORORHOOHIHRICORICOCIRIIIIRHI = 32000;
   static final int IHRHHHHHROOOCHIROIIIROCCCROCCO = 24;
   static final int OHHRORRCORHIRRRIOORRRRCOHRRIRR = 32000;
   private static final CRICCOOHHHCHOORCICOCOHIHOIRHOO OOHIRCIOIIHHRHIRHOIOHHIIRHOIHO = new CRICCOOHHHCHOORCICOCOHIHOIRHOO();

   public static CRICCOOHHHCHOORCICOCOHIHOIRHOO CICIHRHCIHOROOIHHCRHIIOHRIRRII() {
      return OOHIRCIOIIHHRHIRHOIOHHIIRHOIHO;
   }

   public char[] HCHROROOIIORIORRIOHOIROCHORCRO(String var1) {
      int var2 = var1.length();
      char[] var3 = new char[OOCCCHRCIRHCRCIRHRHHCRIOHICRRC(var2)];
      int[] var4 = HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHIHCOHOIRHRRIHHHCCIROICIRIHHR();
      int var5 = var4.length;
      int var6 = 0;
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.OHHRIOHROOIHOROCIRHCHORIHRRRRI var7 = null;
      int var8 = 0;
      char[] var9 = null;

      label76:
      while (var6 < var2) {
         while (true) {
            char var10 = var1.charAt(var6);
            if (var10 < var5 && var4[var10] != 0) {
               if (var9 == null) {
                  var9 = this.IOCRRHRCCRCOROOHCCRIOICCCCOCCC();
               }

               var10 = var1.charAt(var6++);
               int var11 = var4[var10];
               int var12 = var11 < 0 ? this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var10, var9) : this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var11, var9);
               if (var8 + var12 > var3.length) {
                  int var13 = var3.length - var8;
                  if (var13 > 0) {
                     System.arraycopy(var9, 0, var3, var8, var13);
                  }

                  if (var7 == null) {
                     var7 = com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.OHHRIOHROOIHOROCIRHCHORIHRRRRI.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(
                        var3
                     );
                  }

                  try {
                     var3 = var7.CRROICHHIOIHORHRHROHRCCOROHICO();
                  } catch (IOException var16) {
                     throw new IllegalStateException(var16);
                  }

                  int var14 = var12 - var13;
                  System.arraycopy(var9, var13, var3, 0, var14);
                  var8 = var14;
               } else {
                  System.arraycopy(var9, 0, var3, var8, var12);
                  var8 += var12;
               }
               break;
            }

            if (var8 >= var3.length) {
               if (var7 == null) {
                  var7 = com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.OHHRIOHROOIHOROCIRHCHORIHRRRRI.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(
                     var3
                  );
               }

               try {
                  var3 = var7.CRROICHHIOIHORHRHROHRCCOROHICO();
               } catch (IOException var17) {
                  throw new IllegalStateException(var17);
               }

               var8 = 0;
            }

            var3[var8++] = var10;
            if (++var6 >= var2) {
               break label76;
            }
         }
      }

      if (var7 == null) {
         return Arrays.copyOfRange(var3, 0, var8);
      }

      var7.ICOCCCOCHIHIOOCOORRRICIOCOICRR(var8);

      try {
         return var7.CIHOIOIRRRIICRROIHIOIOORHCCOOI();
      } catch (IOException var15) {
         throw new IllegalStateException(var15);
      }
   }

   public char[] OCOHORHCROHICRRIHCIHHRRCIHICRI(CharSequence var1) {
      if (var1 instanceof String) {
         return this.HCHROROOIIORIORRIOHOIROCHORCRO((String)var1);
      }

      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.OHHRIOHROOIHOROCIRHCHORIHRRRRI var2 = null;
      int var3 = var1.length();
      char[] var4 = new char[OOCCCHRCIRHCRCIRHRHHCRIOHICRRC(var3)];
      int[] var5 = HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHIHCOHOIRHRRIHHHCCIROICIRIHHR();
      int var6 = var5.length;
      int var7 = 0;
      int var8 = 0;
      char[] var9 = null;

      label80:
      while (var7 < var3) {
         while (true) {
            char var10 = var1.charAt(var7);
            if (var10 < var6 && var5[var10] != 0) {
               if (var9 == null) {
                  var9 = this.IOCRRHRCCRCOROOHCCRIOICCCCOCCC();
               }

               var10 = var1.charAt(var7++);
               int var11 = var5[var10];
               int var12 = var11 < 0 ? this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var10, var9) : this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var11, var9);
               if (var8 + var12 > var4.length) {
                  int var13 = var4.length - var8;
                  if (var13 > 0) {
                     System.arraycopy(var9, 0, var4, var8, var13);
                  }

                  if (var2 == null) {
                     var2 = com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.OHHRIOHROOIHOROCIRHCHORIHRRRRI.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(
                        var4
                     );
                  }

                  try {
                     var4 = var2.CRROICHHIOIHORHRHROHRCCOROHICO();
                  } catch (IOException var16) {
                     throw new IllegalStateException(var16);
                  }

                  int var14 = var12 - var13;
                  System.arraycopy(var9, var13, var4, 0, var14);
                  var8 = var14;
               } else {
                  System.arraycopy(var9, 0, var4, var8, var12);
                  var8 += var12;
               }
               break;
            }

            if (var8 >= var4.length) {
               if (var2 == null) {
                  var2 = com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.OHHRIOHROOIHOROCIRHCHORIHRRRRI.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(
                     var4
                  );
               }

               try {
                  var4 = var2.CRROICHHIOIHORHRHROHRCCOROHICO();
               } catch (IOException var17) {
                  throw new IllegalStateException(var17);
               }

               var8 = 0;
            }

            var4[var8++] = var10;
            if (++var7 >= var3) {
               break label80;
            }
         }
      }

      if (var2 == null) {
         return Arrays.copyOfRange(var4, 0, var8);
      }

      var2.ICOCCCOCHIHIOOCOORRRICIOCOICRR(var8);

      try {
         return var2.CIHOIOIRRRIICRROIHIOIOORHCCOOI();
      } catch (IOException var15) {
         throw new IllegalStateException(var15);
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CharSequence var1, StringBuilder var2) {
      int[] var3 = HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHIHCOHOIRHRRIHHHCCIROICIRIHHR();
      int var4 = var3.length;
      int var5 = 0;
      int var6 = var1.length();
      char[] var7 = null;

      label31:
      while (var5 < var6) {
         do {
            char var8 = var1.charAt(var5);
            if (var8 < var4 && var3[var8] != 0) {
               if (var7 == null) {
                  var7 = this.IOCRRHRCCRCOROOHCCRIOICCCCOCCC();
               }

               var8 = var1.charAt(var5++);
               int var9 = var3[var8];
               int var10 = var9 < 0 ? this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var8, var7) : this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var9, var7);
               var2.append(var7, 0, var10);
               continue label31;
            }

            var2.append(var8);
         } while (++var5 < var6);

         return;
      }
   }

   public byte[] OORRIHOOCIIOHROHCIIRCROOHIIRCH(String var1) {
      int var2 = 0;
      int var3 = var1.length();
      int var4 = 0;
      byte[] var5 = new byte[CIOICHOCCRHORIRHHOOHHOROCCCIOR(var3)];
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH var6 = null;

      label91:
      while (var2 < var3) {
         int[] var7 = HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHIHCOHOIRHRRIHHHCCIROICIRIHHR();

         do {
            int var8 = var1.charAt(var2);
            if (var8 > 127 || var7[var8] != 0) {
               if (var6 == null) {
                  var6 = com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHIRRIIORRHORHRORIHOROIRCORCOO(
                     var5, var4
                  );
               }

               if (var4 >= var5.length) {
                  var5 = var6.OIIIHIIHHRIRICIIOCCCCRRRRHROCR();
                  var4 = 0;
               }

               var8 = var1.charAt(var2++);
               if (var8 <= 127) {
                  int var9 = var7[var8];
                  var4 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var8, var9, var6, var4);
                  var5 = var6.OHHOIOIIICHIOHOROHOROOIORHIRCC();
               } else {
                  if (var8 <= 2047) {
                     var5[var4++] = (byte)(192 | var8 >> 6);
                     var8 = 128 | var8 & '?';
                  } else if (var8 >= '\ud800' && var8 <= '\udfff') {
                     if (var8 > '\udbff') {
                        IHHHRIICRCOOIOCOHICOCROCOHROOO(var8);
                     }

                     if (var2 >= var3) {
                        IHHHRIICRCOOIOCOHICOCROCOHROOO(var8);
                     }

                     var8 = CCRIHCIIOOIOHIRCCHIICCRHIROORC(var8, var1.charAt(var2++));
                     if (var8 > 1114111) {
                        IHHHRIICRCOOIOCOHICOCROCOHROOO(var8);
                     }

                     var5[var4++] = (byte)(240 | var8 >> 18);
                     if (var4 >= var5.length) {
                        var5 = var6.OIIIHIIHHRIRICIIOCCCCRRRRHROCR();
                        var4 = 0;
                     }

                     var5[var4++] = (byte)(128 | var8 >> 12 & 63);
                     if (var4 >= var5.length) {
                        var5 = var6.OIIIHIIHHRIRICIIOCCCCRRRRHROCR();
                        var4 = 0;
                     }

                     var5[var4++] = (byte)(128 | var8 >> 6 & 63);
                     var8 = 128 | var8 & 63;
                  } else {
                     var5[var4++] = (byte)(224 | var8 >> '\f');
                     if (var4 >= var5.length) {
                        var5 = var6.OIIIHIIHHRIRICIIOCCCCRRRRHROCR();
                        var4 = 0;
                     }

                     var5[var4++] = (byte)(128 | var8 >> 6 & 63);
                     var8 = 128 | var8 & '?';
                  }

                  if (var4 >= var5.length) {
                     var5 = var6.OIIIHIIHHRIRICIIOCCCCRRRRHROCR();
                     var4 = 0;
                  }

                  var5[var4++] = (byte)var8;
               }
               continue label91;
            }

            if (var4 >= var5.length) {
               if (var6 == null) {
                  var6 = com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHIRRIIORRHORHRORIHOROIRCORCOO(
                     var5, var4
                  );
               }

               var5 = var6.OIIIHIIHHRIRICIIOCCCCRRRRHROCR();
               var4 = 0;
            }

            var5[var4++] = (byte)var8;
         } while (++var2 < var3);

         return var6 == null ? Arrays.copyOfRange(var5, 0, var4) : var6.OIOICHRCCHCCICORRCCRCHRORIRHRI(var4);
      }

      return var6 == null ? Arrays.copyOfRange(var5, 0, var4) : var6.OIOICHRCCHCCICORRCCRCHRORIRHRI(var4);
   }

   public byte[] COCHRHOIROOOHHROCCIICHCOCOCCHH(String var1) {
      int var2 = 0;
      int var3 = var1.length();
      int var4 = 0;
      byte[] var5 = new byte[CIOICHOCCRHORIRHHOOHHOROCCCIOR(var3)];
      int var6 = var5.length;
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH var7 = null;

      while (var2 < var3) {
         int var8;
         for (var8 = var1.charAt(var2++); var8 <= 127; var8 = var1.charAt(var2++)) {
            if (var4 >= var6) {
               if (var7 == null) {
                  var7 = com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHIRRIIORRHORHRORIHOROIRCORCOO(
                     var5, var4
                  );
               }

               var5 = var7.OIIIHIIHHRIRICIIOCCCCRRRRHROCR();
               var6 = var5.length;
               var4 = 0;
            }

            var5[var4++] = (byte)var8;
            if (var2 >= var3) {
               return var7 == null ? Arrays.copyOfRange(var5, 0, var4) : var7.OIOICHRCCHCCICORRCCRCHRORIRHRI(var4);
            }
         }

         if (var7 == null) {
            var7 = com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHIRRIIORRHORHRORIHOROIRCORCOO(
               var5, var4
            );
         }

         if (var4 >= var6) {
            var5 = var7.OIIIHIIHHRIRICIIOCCCCRRRRHROCR();
            var6 = var5.length;
            var4 = 0;
         }

         if (var8 < 2048) {
            var5[var4++] = (byte)(192 | var8 >> 6);
         } else if (var8 >= 55296 && var8 <= 57343) {
            if (var8 > 56319) {
               IHHHRIICRCOOIOCOHICOCROCOHROOO(var8);
            }

            if (var2 >= var3) {
               IHHHRIICRCOOIOCOHICOCROCOHROOO(var8);
            }

            var8 = CCRIHCIIOOIOHIRCCHIICCRHIROORC(var8, var1.charAt(var2++));
            if (var8 > 1114111) {
               IHHHRIICRCOOIOCOHICOCROCOHROOO(var8);
            }

            var5[var4++] = (byte)(240 | var8 >> 18);
            if (var4 >= var6) {
               var5 = var7.OIIIHIIHHRIRICIIOCCCCRRRRHROCR();
               var6 = var5.length;
               var4 = 0;
            }

            var5[var4++] = (byte)(128 | var8 >> 12 & 63);
            if (var4 >= var6) {
               var5 = var7.OIIIHIIHHRIRICIIOCCCCRRRRHROCR();
               var6 = var5.length;
               var4 = 0;
            }

            var5[var4++] = (byte)(128 | var8 >> 6 & 63);
         } else {
            var5[var4++] = (byte)(224 | var8 >> 12);
            if (var4 >= var6) {
               var5 = var7.OIIIHIIHHRIRICIIOCCCCRRRRHROCR();
               var6 = var5.length;
               var4 = 0;
            }

            var5[var4++] = (byte)(128 | var8 >> 6 & 63);
         }

         if (var4 >= var6) {
            var5 = var7.OIIIHIIHHRIRICIIOCCCCRRRRHROCR();
            var6 = var5.length;
            var4 = 0;
         }

         var5[var4++] = (byte)(128 | var8 & 63);
      }

      return var7 == null ? Arrays.copyOfRange(var5, 0, var4) : var7.OIOICHRCCHCCICORRCCRCHRORIRHRI(var4);
   }

   public byte[] CIOHHCORHRCCRICCCORIHCRHCCCRRR(CharSequence var1) {
      int var2 = 0;
      int var3 = var1.length();
      int var4 = 0;
      byte[] var5 = new byte[CIOICHOCCRHORIRHHOOHHOROCCCIOR(var3)];
      int var6 = var5.length;
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH var7 = null;

      while (var2 < var3) {
         int var8;
         for (var8 = var1.charAt(var2++); var8 <= 127; var8 = var1.charAt(var2++)) {
            if (var4 >= var6) {
               if (var7 == null) {
                  var7 = com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHIRRIIORRHORHRORIHOROIRCORCOO(
                     var5, var4
                  );
               }

               var5 = var7.OIIIHIIHHRIRICIIOCCCCRRRRHROCR();
               var6 = var5.length;
               var4 = 0;
            }

            var5[var4++] = (byte)var8;
            if (var2 >= var3) {
               return var7 == null ? Arrays.copyOfRange(var5, 0, var4) : var7.OIOICHRCCHCCICORRCCRCHRORIRHRI(var4);
            }
         }

         if (var7 == null) {
            var7 = com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHIRRIIORRHORHRORIHOROIRCORCOO(
               var5, var4
            );
         }

         if (var4 >= var6) {
            var5 = var7.OIIIHIIHHRIRICIIOCCCCRRRRHROCR();
            var6 = var5.length;
            var4 = 0;
         }

         if (var8 < 2048) {
            var5[var4++] = (byte)(192 | var8 >> 6);
         } else if (var8 >= 55296 && var8 <= 57343) {
            if (var8 > 56319) {
               IHHHRIICRCOOIOCOHICOCROCOHROOO(var8);
            }

            if (var2 >= var3) {
               IHHHRIICRCOOIOCOHICOCROCOHROOO(var8);
            }

            var8 = CCRIHCIIOOIOHIRCCHIICCRHIROORC(var8, var1.charAt(var2++));
            if (var8 > 1114111) {
               IHHHRIICRCOOIOCOHICOCROCOHROOO(var8);
            }

            var5[var4++] = (byte)(240 | var8 >> 18);
            if (var4 >= var6) {
               var5 = var7.OIIIHIIHHRIRICIIOCCCCRRRRHROCR();
               var6 = var5.length;
               var4 = 0;
            }

            var5[var4++] = (byte)(128 | var8 >> 12 & 63);
            if (var4 >= var6) {
               var5 = var7.OIIIHIIHHRIRICIIOCCCCRRRRHROCR();
               var6 = var5.length;
               var4 = 0;
            }

            var5[var4++] = (byte)(128 | var8 >> 6 & 63);
         } else {
            var5[var4++] = (byte)(224 | var8 >> 12);
            if (var4 >= var6) {
               var5 = var7.OIIIHIIHHRIRICIIOCCCCRRRRHROCR();
               var6 = var5.length;
               var4 = 0;
            }

            var5[var4++] = (byte)(128 | var8 >> 6 & 63);
         }

         if (var4 >= var6) {
            var5 = var7.OIIIHIIHHRIRICIIOCCCCRRRRHROCR();
            var6 = var5.length;
            var4 = 0;
         }

         var5[var4++] = (byte)(128 | var8 & 63);
      }

      return var7 == null ? Arrays.copyOfRange(var5, 0, var4) : var7.OIOICHRCCHCCICORRCCRCHRORIRHRI(var4);
   }

   private char[] IOCRRHRCCRCOROOHCCRIOICCCCOCCC() {
      return new char[]{'\\', '\u0000', '0', '0', '\u0000', '\u0000'};
   }

   private int RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(int var1, char[] var2) {
      var2[1] = 'u';
      var2[4] = RCROROIIOHCCICHHHRHHROORCOCHCR[var1 >> 4];
      var2[5] = RCROROIIOHCCICHHHRHHROORCOCHCR[var1 & 15];
      return 6;
   }

   private int IRCIIHHICIHRCOCRROCOICRIHHCCHH(int var1, char[] var2) {
      var2[1] = (char)var1;
      return 2;
   }

   private int RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      int var1,
      int var2,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HHCCIRHCCCIIRHCROHIORHIRHHIORH var3,
      int var4
   ) {
      var3.OHOIIICHHOHCOOIOOCCHOCRHOCCIRI(var4);
      var3.RIRRCRCICIHOHCOCRICHIROHRRHIRO(92);
      if (var2 < 0) {
         var3.RIRRCRCICIHOHCOCRICHIROHRRHIRO(117);
         if (var1 > 255) {
            int var5 = var1 >> 8;
            var3.RIRRCRCICIHOHCOCRICHIROHRRHIRO(RCCIIRIOCRHIHIRCHHRCCRHOOIRIOI[var5 >> 4]);
            var3.RIRRCRCICIHOHCOCRICHIROHRRHIRO(RCCIIRIOCRHIHIRCHHRCCRHOOIRIOI[var5 & 15]);
            var1 &= 255;
         } else {
            var3.RIRRCRCICIHOHCOCRICHIROHRRHIRO(48);
            var3.RIRRCRCICIHOHCOCRICHIROHRRHIRO(48);
         }

         var3.RIRRCRCICIHOHCOCRICHIROHRRHIRO(RCCIIRIOCRHIHIRCHHRCCRHOOIRIOI[var1 >> 4]);
         var3.RIRRCRCICIHOHCOCRICHIROHRRHIRO(RCCIIRIOCRHIHIRCHHRCCRHOOIRIOI[var1 & 15]);
      } else {
         var3.RIRRCRCICIHOHCOCRICHIROHRRHIRO((byte)var2);
      }

      return var3.IIRIHOICOHCHHCRRHRROCIRROROCRR();
   }

   private static int CCRIHCIIOOIOHIRCCHIICCRHIROORC(int var0, int var1) {
      if (var1 >= 56320 && var1 <= 57343) {
         return 65536 + (var0 - 55296 << 10) + (var1 - 56320);
      } else {
         throw new IllegalArgumentException(
            "Broken surrogate pair: first char 0x" + Integer.toHexString(var0) + ", second 0x" + Integer.toHexString(var1) + "; illegal combination"
         );
      }
   }

   private static void IHHHRIICRCOOIOCOHICOCROCOHROOO(int var0) {
      throw new IllegalArgumentException(RHOCHHIRRCHHHOHOIRROIROHHHIHIO.ORIIHHHCORIRHRRHHIIHORHIRRCRHH(var0));
   }

   static int OOCCCHRCIRHCRCIRHRHHCRIOHICRRC(int var0) {
      int var1 = Math.max(16, var0 + Math.min(6 + (var0 >> 3), 1000));
      return Math.min(var1, 32000);
   }

   static int CIOICHOCCRHORIRHHOOHHOROCCCIOR(int var0) {
      int var1 = Math.max(24, var0 + 6 + (var0 >> 1));
      return Math.min(var1, 32000);
   }
}
