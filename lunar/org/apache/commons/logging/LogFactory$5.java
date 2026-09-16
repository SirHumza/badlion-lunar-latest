package org.apache.commons.logging;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.security.PrivilegedAction;
import java.util.Properties;

class LogFactory$5 implements PrivilegedAction {
   private final URL val$url;

   LogFactory$5(URL var1) {
      this.val$url = var1;
   }

   public Object run() {
      try {
         InputStream var1 = this.val$url.openStream();
         if (var1 != null) {
            Properties var2 = new Properties();
            var2.load(var1);
            var1.close();
            return var2;
         }
      } catch (IOException var3) {
         if (LogFactory.isDiagnosticsEnabled()) {
            LogFactory.access$000("Unable to read URL " + this.val$url);
         }
      }

      return null;
   }
}
