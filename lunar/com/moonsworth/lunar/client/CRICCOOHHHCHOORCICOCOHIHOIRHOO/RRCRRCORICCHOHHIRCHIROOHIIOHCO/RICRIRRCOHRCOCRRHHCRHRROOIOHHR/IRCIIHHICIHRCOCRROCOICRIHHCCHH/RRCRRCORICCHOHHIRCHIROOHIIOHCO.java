package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;

public class RRCRRCORICCHOHHIRCHIROOHIIOHCO extends IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   public RRCRRCORICCHOHHIRCHIROOHIIOHCO() {
      super(OIHCCCHCIOIRROOIHIIRCRCCCCCOCI(), "Ping");
      this.OIOROIRHRRIRCHIIORCCCCCCCHCHCO = 250;
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(19, "1.20.2");
   }

   @Override
   public String IHROCRRIRIROCCCRCRRROCRRCRIIHH(int var1) {
      return var1 + "ms";
   }

   @Override
   protected int[] RCRIOCHCIOHHRICORCOOOIHIIRCRRH() {
      int var1 = this.CHICIOOHIRRHRICHOOHCHOHOIHICRR();
      if (var1 > 4000) {
         return new int[]{var1 / 2};
      } else if (var1 > 2000) {
         return new int[]{1000};
      } else if (var1 > 1300) {
         return new int[]{500, 1000};
      } else {
         return var1 > 600 ? new int[]{500} : new int[]{100};
      }
   }

   public static int OIHCCCHCIOIRROOIHIIRCRCCCCCOCI() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 19 ? 240 : 12;
   }
}
