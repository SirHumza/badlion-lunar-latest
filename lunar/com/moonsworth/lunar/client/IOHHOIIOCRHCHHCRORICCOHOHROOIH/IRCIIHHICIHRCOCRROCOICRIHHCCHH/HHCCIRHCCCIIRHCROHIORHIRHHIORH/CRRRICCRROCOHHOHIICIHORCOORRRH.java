package com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.moonsworth.webosr.handler.Logger;
import com.moonsworth.webosr.wrappers.Browser;

public class CRRRICCRROCOHHOHIICIHORCOORRRH implements Logger {
   @Override
   public void onBrowserMessage(Browser var1, Logger.Level var2, String var3, String var4, int var5) {
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var4);
   }

   @Override
   public void onStandardOut(Logger.Level var1, String var2) {
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2);
   }

   @Override
   public void onStandardErr(Logger.Level var1, String var2) {
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2);
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Logger.Level var1, String var2) {
      if (com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.isDebug()
         || var1 == Logger.Level.ERROR) {
         String var3 = "[%s] %s";
         switch (var1) {
            case DEBUG:
               com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                  "GameUI Debug", var3, var1.name(), var2
               );
               break;
            case INFO:
               com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                  "GameUI", var3, var1.name(), var2
               );
               break;
            case WARNING:
               com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                  "GameUI", var3, var1.name(), var2
               );
               break;
            case ERROR:
               com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
                  "GameUI", var3, var1.name(), var2
               );
         }
      }
   }
}
