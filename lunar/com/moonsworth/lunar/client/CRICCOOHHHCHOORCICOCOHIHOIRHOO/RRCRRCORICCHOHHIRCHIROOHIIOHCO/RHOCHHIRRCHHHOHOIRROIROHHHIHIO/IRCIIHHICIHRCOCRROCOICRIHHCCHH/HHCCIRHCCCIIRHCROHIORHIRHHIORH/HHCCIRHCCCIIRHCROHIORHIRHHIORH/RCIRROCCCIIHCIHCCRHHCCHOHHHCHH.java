package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpRequest.BodyPublisher;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.Flow.Publisher;
import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.LockSupport;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private static final String CIROCRCHROOROIRIRHOOCCHCOHOHIH = "http://soopy.dev:25561/";
   private static final long OOHCOCRIHHRRIOORHCIOICRCRHHCOI = 524288L;
   private static final int ICOHCCIHIRHCRHHOOHRRHRHRIORHHO = 8192;

   public static boolean shouldProfile() {
      return false;
   }

   public static void IRCIIHHICIHRCOCRROCOICRIHHCCHH(byte[] var0) {
      String var1 = com.moonsworth.lunar.client.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRIRIIICIRRIIRICRRORCCRCOHIHIO;
      String var2 = com.moonsworth.lunar.client.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCICHOOCICHRIIIHHROHCRHHROOHIO;
      String var3 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.getMinecraftVersion().getDisplayName();
      String var4 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .RROHIIOHORHICRHIHCCRRRHIHCHRCC()
         .HRIOHCCIOOIORHRHCIRCRRIIOHCHHI()
         .toString();
      String var5 = "branch="
         + URLEncoder.encode(var1, StandardCharsets.UTF_8)
         + "&hash="
         + URLEncoder.encode(var2, StandardCharsets.UTF_8)
         + "&mcVersion="
         + URLEncoder.encode(var3, StandardCharsets.UTF_8)
         + "&uuid="
         + URLEncoder.encode(var4, StandardCharsets.UTF_8);
      HttpRequest var6 = HttpRequest.newBuilder()
         .uri(URI.create("http://soopy.dev:25561/uploadProfile?" + var5))
         .header("Content-Type", "application/octet-stream")
         .POST(RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, 524288L, 8192))
         .build();
      HttpResponse var7 = HttpClient.newHttpClient().send(var6, BodyHandlers.ofString());
   }

   private static BodyPublisher RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(byte[] var0, long var1, int var3) {
      Publisher var4 = var4x -> var4x.onSubscribe(
         new com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var4x, var0, var1, var3
         )
      );
      return BodyPublishers.fromPublisher(var4, var0.length);
   }

   private static final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements Subscription {
      private final Subscriber<? super ByteBuffer> CRHCCRCRICIHOCOOCIRRIHHIHOOCOI;
      private final byte[] IIIOHOIHRRIOHHIRHRRHRHCOCROIRC;
      private final long RRICHORHOCICIOHHOICIOCOCHIRCIO;
      private final int HIHIICCHORORIHRHIRIIIOCIOORIHO;
      private final AtomicLong OCCRRHHHOOIHRHIHIOIIIORIRCIORO = new AtomicLong();
      private final AtomicBoolean IIIOIORROHCRHCHHHOCOOCHOROIROH = new AtomicBoolean();
      private volatile boolean cancelled;
      private int offset;

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Subscriber<? super ByteBuffer> var1, byte[] var2, long var3, int var5) {
         this.CRHCCRCRICIHOCOOCIRRIHHIHOOCOI = var1;
         this.IIIOHOIHRRIOHHIRHRRHRHCOCROIRC = var2;
         this.RRICHORHOCICIOHHOICIOCOCHIRCIO = var3;
         this.HIHIICCHORORIHRHIRIIIOCIOORIHO = var5;
      }

      @Override
      public void request(long var1) {
         if (var1 > 0L && !this.cancelled) {
            this.OCCRRHHHOOIHRHIHIOIIIORIRCIORO.addAndGet(var1);
            if (this.IIIOIORROHCRHCHHHOCOOCHOROIROH.compareAndSet(false, true)) {
               Thread var3 = new Thread(this::run, "ProfileUpload-Throttle");
               var3.setDaemon(true);
               var3.start();
            }
         }
      }

      @Override
      public void cancel() {
         this.cancelled = true;
      }

      private void run() {
         try {
            long var1 = Math.round(1.0E9 * this.HIHIICCHORORIHRHIRIIIOCIOORIHO / this.RRICHORHOCICIOHHOICIOCOCHIRCIO);
            long var3 = System.nanoTime();

            while (!this.cancelled && this.offset < this.IIIOHOIHRRIOHHIRHRRHRHCOCROIRC.length) {
               while (this.OCCRRHHHOOIHRHIHIOIIIORIRCIORO.get() == 0L) {
                  if (this.cancelled) {
                     return;
                  }

                  LockSupport.parkNanos(1000000L);
               }

               int var5 = Math.min(this.HIHIICCHORORIHRHIRIIIOCIOORIHO, this.IIIOHOIHRRIOHHIRHRRHRHCOCROIRC.length - this.offset);
               ByteBuffer var6 = ByteBuffer.wrap(this.IIIOHOIHRRIOHHIRHRRHRHCOCROIRC, this.offset, var5);
               this.offset += var5;
               this.OCCRRHHHOOIHRHIHIOIIIORIRCIORO.decrementAndGet();
               this.CRHCCRCRICIHOCOOCIRRIHHIHOOCOI.onNext(var6);
               var3 += var1;
               long var7 = var3 - System.nanoTime();
               if (var7 > 0L) {
                  LockSupport.parkNanos(var7);
               }
            }

            if (!this.cancelled) {
               this.CRHCCRCRICIHOCOOCIRRIHHIHOOCOI.onComplete();
            }
         } catch (Throwable var9) {
            if (!this.cancelled) {
               this.CRHCCRCRICIHOCOOCIRRIHHIHOOCOI.onError(var9);
            }
         }
      }
   }
}
