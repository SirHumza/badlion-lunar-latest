package com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.moonsworth.webosr.handler.FileSystem;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   private final HttpServer HICIOHOIHHIHCOCIOCRHRRIRHHIIRO;
   private final FileSystem IOOIOHRRIHCIRCICIICICIRRROOOOI;

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH(FileSystem var1) {
      try {
         this.HICIOHOIHHIHCOCIOCRHRRIRHHIIRO = HttpServer.create(new InetSocketAddress(8222), 0);
         this.IOOIOHRRIHCIRCICIICICIRRROOOOI = var1;
         this.HICIOHOIHHIHCOCIOCRHRRIRHHIIRO.createContext("/", new IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH());
         this.HICIOHOIHHIHCOCIOCRHRRIRHHIIRO.setExecutor(null);
      } catch (Exception var3) {
         throw new RuntimeException(var3);
      }
   }

   public void start() {
      this.HICIOHOIHHIHCOCIOCRHRRIRHHIIRO.start();
      com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         "GameUI Asset", "Started on port " + this.HICIOHOIHHIHCOCIOCRHRRIRHHIIRO.getAddress().getPort()
      );
   }

   class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements HttpHandler {
      @Override
      public void handle(HttpExchange var1) {
         try {
            String var2 = var1.getRequestURI().getPath();
            if (var2 != null && !var2.isEmpty() && !var2.equals("/")) {
               if (!var2.startsWith("file:")) {
                  var2 = "file://" + var2;
               }

               if (IRCIIHHICIHRCOCRROCOICRIHHCCHH.this.IOOIOHRRIHCIRCICIICICIRRROOOOI.doesResourceExist(var2)) {
                  FileSystem.Payload var3 = IRCIIHHICIHRCOCRROCOICRIHHCCHH.this.IOOIOHRRIHCIRCICIICICIRRROOOOI.onRequest(var2);
                  if (var3.buffer() != null && var3.length() > 0) {
                     var1.getResponseHeaders().set("Content-Type", var3.mimeType());
                     var1.sendResponseHeaders(var3.statusCode(), var3.length());
                     ByteBuffer var4 = var3.buffer();
                     var4.rewind();
                     byte[] var5 = new byte[var4.remaining()];
                     var4.get(var5);

                     try (OutputStream var6 = var1.getResponseBody()) {
                        var6.write(var5);
                     }
                  } else {
                     var1.sendResponseHeaders(404, -1L);
                  }

                  return;
               } else {
                  com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
                     "GameUI Asset", "Could not find: " + var2
                  );
                  var1.sendResponseHeaders(404, -1L);
                  return;
               }
            }

            var1.sendResponseHeaders(404, -1L);
         } catch (Exception var16) {
            com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
               "GameUI Asset", "Failed to proxy request: " + var16.getMessage()
            );
            var1.sendResponseHeaders(500, -1L);
            return;
         } finally {
            var1.close();
         }
      }
   }
}
