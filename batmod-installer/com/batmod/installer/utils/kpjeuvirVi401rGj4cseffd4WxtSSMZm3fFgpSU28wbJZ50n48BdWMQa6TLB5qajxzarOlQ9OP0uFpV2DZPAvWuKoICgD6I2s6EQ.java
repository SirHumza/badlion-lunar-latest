package com.batmod.installer.utils;

import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;

public class kpjeuvirVi401rGj4cseffd4WxtSSMZm3fFgpSU28wbJZ50n48BdWMQa6TLB5qajxzarOlQ9OP0uFpV2DZPAvWuKoICgD6I2s6EQ {
   public static void Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(String var0) {
      Desktop var1 = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
      if (var1 != null && var1.isSupported(Action.BROWSE)) {
         try {
            var1.browse(new URI(var0));
         } catch (Exception var3) {
            var3.printStackTrace();
         }
      }
   }
}
