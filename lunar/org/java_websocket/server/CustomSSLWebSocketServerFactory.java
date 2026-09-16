package org.java_websocket.server;

import java.nio.channels.ByteChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import org.java_websocket.SSLSocketChannel2;

public class CustomSSLWebSocketServerFactory extends DefaultSSLWebSocketServerFactory {
   private final String[] enabledProtocols;
   private final String[] enabledCiphersuites;

   public CustomSSLWebSocketServerFactory(SSLContext var1, String[] var2, String[] var3) {
      this(var1, Executors.newSingleThreadScheduledExecutor(), var2, var3);
   }

   public CustomSSLWebSocketServerFactory(SSLContext var1, ExecutorService var2, String[] var3, String[] var4) {
      super(var1, var2);
      this.enabledProtocols = var3;
      this.enabledCiphersuites = var4;
   }

   @Override
   public ByteChannel wrapChannel(SocketChannel var1, SelectionKey var2) {
      SSLEngine var3 = this.sslcontext.createSSLEngine();
      if (this.enabledProtocols != null) {
         var3.setEnabledProtocols(this.enabledProtocols);
      }

      if (this.enabledCiphersuites != null) {
         var3.setEnabledCipherSuites(this.enabledCiphersuites);
      }

      var3.setUseClientMode(false);
      return new SSLSocketChannel2(var1, var3, this.exec, var2);
   }
}
