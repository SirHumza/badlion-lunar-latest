package org.java_websocket;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.java_websocket.util.NamedThreadFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractWebSocket extends WebSocketAdapter {
   private final Logger log = LoggerFactory.getLogger(AbstractWebSocket.class);
   private boolean tcpNoDelay;
   private boolean reuseAddr;
   private ScheduledExecutorService connectionLostCheckerService;
   private ScheduledFuture connectionLostCheckerFuture;
   private long connectionLostTimeout = TimeUnit.SECONDS.toNanos(60L);
   private boolean websocketRunning = false;
   private final Object syncConnectionLost = new Object();

   public int getConnectionLostTimeout() {
      synchronized (this.syncConnectionLost) {
         return (int)TimeUnit.NANOSECONDS.toSeconds(this.connectionLostTimeout);
      }
   }

   public void setConnectionLostTimeout(int var1) {
      synchronized (this.syncConnectionLost) {
         this.connectionLostTimeout = TimeUnit.SECONDS.toNanos(var1);
         if (this.connectionLostTimeout <= 0L) {
            this.log.trace("Connection lost timer stopped");
            this.cancelConnectionLostTimer();
         } else {
            if (this.websocketRunning) {
               this.log.trace("Connection lost timer restarted");

               try {
                  for (WebSocket var6 : new ArrayList<>(this.getConnections())) {
                     if (var6 instanceof WebSocketImpl) {
                        WebSocketImpl var4 = (WebSocketImpl)var6;
                        var4.updateLastPong();
                     }
                  }
               } catch (Exception var8) {
                  this.log.error("Exception during connection lost restart", var8);
               }

               this.restartConnectionLostTimer();
            }
         }
      }
   }

   protected void stopConnectionLostTimer() {
      synchronized (this.syncConnectionLost) {
         if (this.connectionLostCheckerService != null || this.connectionLostCheckerFuture != null) {
            this.websocketRunning = false;
            this.log.trace("Connection lost timer stopped");
            this.cancelConnectionLostTimer();
         }
      }
   }

   protected void startConnectionLostTimer() {
      synchronized (this.syncConnectionLost) {
         if (this.connectionLostTimeout <= 0L) {
            this.log.trace("Connection lost timer deactivated");
         } else {
            this.log.trace("Connection lost timer started");
            this.websocketRunning = true;
            this.restartConnectionLostTimer();
         }
      }
   }

   private void restartConnectionLostTimer() {
      this.cancelConnectionLostTimer();
      this.connectionLostCheckerService = Executors.newSingleThreadScheduledExecutor(new NamedThreadFactory("connectionLostChecker"));
      Runnable var1 = new Runnable() {
         private ArrayList<WebSocket> connections = new ArrayList<>();

         @Override
         public void run() {
            this.connections.clear();

            try {
               this.connections.addAll(AbstractWebSocket.this.getConnections());
               long var1x = (long)(System.nanoTime() - AbstractWebSocket.this.connectionLostTimeout * 1.5);

               for (WebSocket var4 : this.connections) {
                  AbstractWebSocket.this.executeConnectionLostDetection(var4, var1x);
               }
            } catch (Exception var5) {
            }

            this.connections.clear();
         }
      };
      this.connectionLostCheckerFuture = this.connectionLostCheckerService
         .scheduleAtFixedRate(var1, this.connectionLostTimeout, this.connectionLostTimeout, TimeUnit.NANOSECONDS);
   }

   private void executeConnectionLostDetection(WebSocket var1, long var2) {
      if (var1 instanceof WebSocketImpl) {
         WebSocketImpl var4 = (WebSocketImpl)var1;
         if (var4.getLastPong() < var2) {
            this.log.trace("Closing connection due to no pong received: {}", var4);
            var4.closeConnection(
               1006,
               "The connection was closed because the other endpoint did not respond with a pong in time. For more information check: https://github.com/TooTallNate/Java-WebSocket/wiki/Lost-connection-detection"
            );
         } else if (var4.isOpen()) {
            var4.sendPing();
         } else {
            this.log.trace("Trying to ping a non open connection: {}", var4);
         }
      }
   }

   protected abstract Collection<WebSocket> getConnections();

   private void cancelConnectionLostTimer() {
      if (this.connectionLostCheckerService != null) {
         this.connectionLostCheckerService.shutdownNow();
         this.connectionLostCheckerService = null;
      }

      if (this.connectionLostCheckerFuture != null) {
         this.connectionLostCheckerFuture.cancel(false);
         this.connectionLostCheckerFuture = null;
      }
   }

   public boolean isTcpNoDelay() {
      return this.tcpNoDelay;
   }

   public void setTcpNoDelay(boolean var1) {
      this.tcpNoDelay = var1;
   }

   public boolean isReuseAddr() {
      return this.reuseAddr;
   }

   public void setReuseAddr(boolean var1) {
      this.reuseAddr = var1;
   }
}
