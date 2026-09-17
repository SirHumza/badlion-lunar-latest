package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO;

import java.util.concurrent.ConcurrentHashMap;

public final class HRCHROOHRIHCRCRHRIIROCIRHOIRHH extends ConcurrentHashMap<String, String> {
   private static final long IOIIHCHICCHOIHRICIICHCRHRRORRC = 1L;
   private static final int ICORORHOCOHIROIHIHOIOCRIIOIICR = 180;
   public static final HRCHROOHRIHCRCRHRIIROCIRHOIRHH HHRHCOCIHRCOICHRHCIHRIOOHHRRIR = new HRCHROOHRIHCRCRHRIIROCIRHOIRHH();
   private final Object RIOCOHICOICCIIRCHOCRIIIRIIIICR = new Object();

   private HRCHROOHRIHCRCRHRIIROCIRHOIRHH() {
      super(180, 0.8F, 4);
   }

   public String CRHRCIRIOHCRRHIIOIOCRHCRRRIORR(String var1) {
      String var2 = this.get(var1);
      if (var2 != null) {
         return var2;
      }

      if (this.size() >= 180) {
         synchronized (this.RIOCOHICOICCIIRCHOCRIIIRIIIICR) {
            if (this.size() >= 180) {
               this.clear();
            }
         }
      }

      var2 = var1.intern();
      this.put(var2, var2);
      return var2;
   }
}
