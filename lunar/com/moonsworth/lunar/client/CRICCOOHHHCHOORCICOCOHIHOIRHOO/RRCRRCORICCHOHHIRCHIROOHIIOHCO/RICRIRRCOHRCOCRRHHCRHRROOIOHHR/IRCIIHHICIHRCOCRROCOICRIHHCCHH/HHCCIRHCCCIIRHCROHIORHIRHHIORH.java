package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

public class HHCCIRHCCCIIRHCROHIORHIRHHIORH extends IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   private static final long HIIIRHIIIOHIHORIROOCCRHIIRRCOH = 50L;
   private int frames = 0;
   private long RROHOHHORRCCHCOCOCRHHRHHOOHCRO = 0L;

   public HHCCIRHCCCIIRHCROHIORHIRHHIORH() {
      super(240, "FPS");
      this.OIOROIRHRRIRCHIIORCCCCCCCHCHCO = 60;
   }

   @Override
   protected int[] RCRIOCHCIOHHRICORCOOOIHIIRCRRH() {
      int var1 = this.CHICIOOHIRRHRICHOOHCHOHOIHICRR();
      if (var1 > 1100) {
         return new int[]{1000};
      } else if (var1 > 600) {
         return new int[]{500};
      } else if (var1 > 300) {
         return new int[]{240};
      } else if (var1 > 240) {
         return new int[]{120};
      } else if (var1 > 120) {
         return new int[]{60};
      } else if (var1 > 90) {
         return new int[]{30, 60};
      } else if (var1 > 45) {
         return new int[]{30};
      } else if (var1 > 30) {
         return new int[]{15};
      } else {
         return var1 > 15 ? new int[]{10} : null;
      }
   }

   @Override
   public String IHROCRRIRIROCCCRCRRROCRRCRIIHH(int var1) {
      return var1 + " FPS";
   }

   public void OHIHCRCRCRRCCOCOHRCHRHRCIROOCC() {
      this.RROHOHHORRCCHCOCOCRHHRHHOOHCRO = 0L;
      this.frames = 0;
   }

   public void ORRIIRRIHIOOOOHROOHIRICHOOHRHC() {
      long var1 = System.currentTimeMillis();
      if (this.RROHOHHORRCCHCOCOCRHHRHHOOHCRO == 0L) {
         this.RROHOHHORRCCHCOCOCRHHRHHOOHCRO = var1;
      }

      this.frames++;
      long var3 = var1 - this.RROHOHHORRCCHCOCOCRHHRHHOOHCRO;
      if (var3 >= 50L) {
         float var5 = 1000.0F / (float)var3;
         int var6 = (int)(this.frames * var5);
         this.frames = 0;
         this.RROHOHHORRCCHCOCOCRHHRHHOOHCRO = var1;
         this.IOHOOIOHCHICOCHIICHCICCOHRCIII(var6);
      }
   }
}
