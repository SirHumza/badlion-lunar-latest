package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import java.util.Arrays;

abstract class RRCRRCORICCHOHHIRCHIROOHIIOHCO {
   public static final String OOCORHHRRHCHRHOOOHCOCHCRIHCHCO = "offset < 0 or length > str.length";
   public static final String HRHHRCRCIRRIIHHRCCHORCORRCOHHO = "illegal syntax";
   public static final String IRHOHHCOOOICRIOCROOORCRHCCRIII = "value exceeds limits";
   static final byte RIIICCOORIHIIIORCIHCCROOCIOORC = -4;
   static final byte ORRICHICIIIICIIROROIRRCICHCRCO = -1;
   static final byte[] HCOHICHIIHRHRRHHORRCHOHRHCROCI = new byte[256];

   protected static byte charAt(byte[] var0, int var1, int var2) {
      return var1 < var2 ? var0[var1] : 0;
   }

   protected static char charAt(char[] var0, int var1, int var2) {
      return var1 < var2 ? var0[var1] : '\u0000';
   }

   protected static char charAt(CharSequence var0, int var1, int var2) {
      return var1 < var2 ? var0.charAt(var1) : '\u0000';
   }

   protected static int lookupHex(byte var0) {
      return HCOHICHIIHRHRRHHORRCHOHRHCROCI[var0 & 0xFF];
   }

   protected static int lookupHex(char var0) {
      return var0 < 128 ? HCOHICHIIHRHRRHHORRCHOHRHCROCI[var0] : -1;
   }

   static {
      Arrays.fill(HCOHICHIIHRHRRHHORRCHOHRHCROCI, (byte)-1);

      for (char var0 = '0'; var0 <= '9'; var0++) {
         HCOHICHIIHRHRRHHORRCHOHRHCROCI[var0] = (byte)(var0 - '0');
      }

      for (char var1 = 'A'; var1 <= 'F'; var1++) {
         HCOHICHIIHRHRRHHORRCHOHRHCROCI[var1] = (byte)(var1 - 'A' + 10);
      }

      for (char var2 = 'a'; var2 <= 'f'; var2++) {
         HCOHICHIIHRHRRHHORRCHOHRHCROCI[var2] = (byte)(var2 - 'a' + 10);
      }

      for (char var3 = '.'; var3 <= '.'; var3++) {
         HCOHICHIIHRHRRHHORRCHOHRHCROCI[var3] = -4;
      }
   }
}
