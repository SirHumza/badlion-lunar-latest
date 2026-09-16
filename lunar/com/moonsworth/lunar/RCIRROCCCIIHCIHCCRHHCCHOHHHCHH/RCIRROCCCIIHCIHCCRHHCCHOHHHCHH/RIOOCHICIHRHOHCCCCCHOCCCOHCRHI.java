package com.moonsworth.lunar.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.Interceptor.Chain;
import okio.Buffer;
import okio.BufferedSink;
import okio.GzipSink;
import okio.Okio;

class RIOOCHICIHRHOHCCCCCHOCCCOHCRHI implements Interceptor {
   public Response intercept(Chain var1) {
      Request var2 = var1.request();
      if (var2.body() != null && var2.header("Content-Encoding") == null) {
         Request var3 = var2.newBuilder()
            .header("Content-Encoding", "gzip")
            .method(var2.method(), this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var2.body())))
            .build();
         return var1.proceed(var3);
      } else {
         return var1.proceed(var2);
      }
   }

   private RequestBody IRCIIHHICIHRCOCRROCOICRIHHCCHH(final RequestBody var1) {
      final Buffer var2 = new Buffer();
      var1.writeTo(var2);
      return new RequestBody() {
         public MediaType contentType() {
            return var1.contentType();
         }

         public long contentLength() {
            return var2.size();
         }

         public void writeTo(BufferedSink var1x) {
            var1x.write(var2.snapshot());
         }
      };
   }

   private RequestBody HHCCIRHCCCIIRHCROHIORHIRHHIORH(final RequestBody var1) {
      return new RequestBody() {
         public MediaType contentType() {
            return var1.contentType();
         }

         public long contentLength() {
            return -1L;
         }

         public void writeTo(BufferedSink var1x) {
            BufferedSink var2 = Okio.buffer(new GzipSink(var1x));
            var1.writeTo(var2);
            var2.close();
         }
      };
   }
}
