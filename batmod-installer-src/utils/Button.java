package com.batmod.installer.utils;

import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

class Button implements X509TrustManager {
   private final X509TrustManager Logger;
   private X509Certificate[] Button;

   Button(X509TrustManager var1) {
      this.Logger = var1;
   }

   @Override
   public X509Certificate[] getAcceptedIssuers() {
      return new X509Certificate[0];
   }

   @Override
   public void checkClientTrusted(X509Certificate[] var1, String var2) {
      throw new UnsupportedOperationException();
   }

   @Override
   public void checkServerTrusted(X509Certificate[] var1, String var2) {
      this.Button = var1;
      this.Logger.checkServerTrusted(var1, var2);
   }
}
