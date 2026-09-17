package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

public class RIOOCHICIHRHOHCCCCCHOCCCOHCRHI extends IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   public long CIHHHCICOIROOCOIIOIICCIHICCHOO = 0L;

   public RIOOCHICIHRHOHCCCCCHOCCCOHCRHI() {
      super(240, "RAM");
      this.CRHHOOCRCOHHRHOOOCHCROOHIOOCOH(false);
   }

   @Override
   protected int[] RCRIOCHCIOHHRICORCOOOIHIIRCRRH() {
      int var1 = this.CHICIOOHIRRHRICHOOHCHOHOIHICRR();
      int var2 = var1 / 1024;
      if (var2 == 0) {
         if (var1 >= 800) {
            return new int[]{512};
         }

         if (var1 >= 512) {
            return new int[]{256};
         }
      }

      int var3 = 0;
      if (var2 >= 16) {
         var3 = var2 / 2;
      } else if (var2 >= 12) {
         var3 = 8;
      } else if (var2 >= 8) {
         var3 = 6;
      } else if (var2 >= 6) {
         var3 = 4;
      } else if (var2 >= 4) {
         var3 = 2;
      } else if (var2 >= 2) {
         var3 = 1;
      }

      return var3 == 0 ? null : new int[]{var3 * 1024};
   }

   @Override
   public String IHROCRRIRIROCCCRCRRROCRRCRIIHH(int var1) {
      if (var1 < 1024) {
         return var1 + " MB";
      }

      double var2 = var1 / 1024.0;
      double var4 = (int)(var2 * 10.0) / 10.0;
      return var4 + " GB";
   }

   public void RHOOOOHOIOCIROHHCCRIHOIORROIOC() {
      long var1 = System.currentTimeMillis();
      if (var1 - this.CIHHHCICOIROOCOIIOIICCIHICCHOO >= 100L) {
         this.CIHHHCICOIROOCOIIOIICCIHICCHOO = var1;
         Runtime var3 = Runtime.getRuntime();
         long var4 = var3.totalMemory() - var3.freeMemory();
         int var6 = Math.toIntExact(var4 / 1048576L);
         this.IOHOOIOHCHICOCHIICHCICCOHRCIII(var6);
      }
   }

   public void CRHHOOCRCOHHRHOOOCHCROOHIOOCOH(boolean var1) {
      if (var1) {
         this.OIOROIRHRRIRCHIIORCCCCCCCHCHCO = Math.toIntExact(Runtime.getRuntime().maxMemory() / 1048576L);
      } else {
         this.OIOROIRHRRIRCHIIORCCCCCCCHCHCO = 256;
      }
   }
}
