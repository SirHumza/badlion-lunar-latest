package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CORCOCICIRIOHROHROIIOOHICCHCRR;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.lwjgl.actually3.BufferUtils;
import org.lwjgl.util.opus.Opus;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends CRRRICCRROCOHHOHIICIHORCOORRRH {
   private static final com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH OIIIOCICICCCCHCHRIIOIIIOCCORCC = com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.MONO16;
   private static final int CCHRRIRCROIORCHCIIHRCHOCROOCCC = 48000;
   private Process HROOIHCCIIORCIHIORHCOROHIROICH;

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      this.ROCHHROOIOHHRCRICIRCHRHCRCCIOH.HIRIHCORIRIORCCHCOORIHIOIICOIH(OIIIOCICICCCCHCHRIIOIIIOCCORCC.getChannels());
      this.ROCHHROOIOHHRCRICIRCHRHCRCCIOH.CRIHRCICOICHCHCHIHRHROCCHCCCII(48000);
      this.ROCHHROOIOHHRCRICIRCHRHCRCCIOH.setFrameSize((int)(this.ROCHHROOIOHHRCRICIRCHRHCRCCIOH.getFrequency() * 0.02));
      this.ROCHHROOIOHHRCRICIRCHRHCRCCIOH.HORCRRHOCRRICHROCIOOIORIOHCIHH(OIIIOCICICCCCHCHRIIOIIIOCCORCC.getBytesPerSample());
      this.HRCRRCRCCRCOHCOHCROHIRIHRIHRRO();
   }

   @Override
   public void start() {
      int var1 = this.ROCHHROOIOHHRCRICIRCHRHCRCCIOH.getFrameSize() * this.ROCHHROOIOHHRCRICIRCHRHCRCCIOH.getChannels();
      int var2 = var1 * this.ROCHHROOIOHHRCRICIRCHRHCRCCIOH.getBytesPerSample();
      ByteBuffer var3 = BufferUtils.createByteBuffer(var2).order(ByteOrder.LITTLE_ENDIAN);
      ByteBuffer var4 = BufferUtils.createByteBuffer(var2).order(ByteOrder.LITTLE_ENDIAN);
      byte[] var5 = new byte[var2];
      ShortBuffer var6 = var3.asShortBuffer();
      ByteBuffer var7 = ByteBuffer.allocate(var2 * 3).order(ByteOrder.LITTLE_ENDIAN);
      this.IIRHCHHOICHRICOOCRORCCIOOIHOIR(() -> {
         try {
            if (!this.RIICRCOHIRHRIROIIRORCRICRHOOOI() && !this.OHRHOCCCORORROIOIIOROIOCOIHCCR() && !this.RCCCIICIHRHOIHORCHRIHIOHCOICHO()) {
               throw new RuntimeException("Failed to start audio capture");
            }

            byte[] var7x = new byte[var2];

            while (!Thread.currentThread().isInterrupted() && this.HROOIHCCIIORCIHIORHCOROHIROICH != null && this.HROOIHCCIIORCIHIORHCOROHIROICH.isAlive()) {
               int var8 = 0;

               try {
                  var8 = this.HROOIHCCIIORCIHIORHCOROHIROICH.getInputStream().read(var7x);
               } catch (IOException var16) {
               }

               if (var8 < 0) {
                  break;
               }

               if (!this.CHRHOHORRICRRHRCRCICOORCHHCIOH()) {
                  var7.put(var7x, 0, var8);
               }

               while (var7.position() >= var2) {
                  var7.flip();
                  var3.clear().put(var7.array(), 0, var2).flip();
                  var7.position(var2).compact();
                  var4.clear();
                  int var9 = Opus.opus_encode(this.HCCOHRHCICCCHOOHCHORIIICOHORHR, var6, this.ROCHHROOIOHHRCRICIRCHRHCRCCIOH.getFrameSize(), var4);
                  var4.get(var5, 0, var9);

                  for (DataOutputStream var11 : this.HCIRHIORRHORHIHHORCICRROORHIHO) {
                     CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var11, var9);
                     var11.write(var5, 0, var9);
                  }
               }
            }
         } catch (IOException var17) {
            com.moonsworth.lunar.client.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var17, "Rewind");
         } finally {
            if (this.HROOIHCCIIORCIHIORHCOROHIROICH != null) {
               this.HROOIHCCIIORCIHIORHCOROHIROICH.destroy();
            }
         }
      });
   }

   private boolean OHRHOCCCORORROIOIIOROIOCOIHCCR() {
      try {
         if (!this.HRHICOCCOOHROCCIHHOHORHIHHHHOO("pw-record")) {
            return false;
         }

         String var1 = this.ICOHCHRCIORHICCCIOROHIRCOCHOOR();
         ProcessBuilder var2;
         if (var1 != null) {
            var2 = new ProcessBuilder(
               "pw-record",
               "--raw",
               "--format=s16",
               "--rate=48000",
               "--channels=" + OIIIOCICICCCCHCHRIIOIIIOCCORCC.getChannels(),
               "--latency=20",
               "-d",
               var1,
               "-"
            );
         } else {
            var2 = new ProcessBuilder(
               "pw-record",
               "--raw",
               "--format=s16",
               "--rate=48000",
               "--channels=" + OIIIOCICICCCCHCHRIIOIIIOCCORCC.getChannels(),
               "--latency=20",
               "-P",
               "{ stream.capture.sink=true }",
               "-"
            );
         }

         this.HROOIHCCIIORCIHIORHCOROHIROICH = var2.start();
         return true;
      } catch (IOException var3) {
         return false;
      }
   }

   private String ICOHCHRCIORHICCCIOROHIRCOCHOOR() {
      try {
         if (this.HRHICOCCOOHROCCIHHOHORHIHHHHOO("pactl")) {
            String var1 = this.RHOCHHIRRCHHHOHOIRROIROHHHIHIO("pactl", "get-default-sink");
            if (var1 != null && !var1.isBlank()) {
               return var1.trim() + ".monitor";
            }
         }

         List var8 = this.IRRCCOICORICIHCHRHIHIHROIRHOCR("pw-record", "--list-targets");
         Pattern var2 = Pattern.compile(".*\\b([\\w.-]+\\.monitor)\\b.*");

         for (String var4 : var8) {
            Matcher var5 = var2.matcher(var4);
            if (var5.matches()) {
               return var5.group(1);
            }
         }

         Pattern var9 = Pattern.compile(".*monitor.*\\b([\\w.-]+\\.monitor)\\b.*", 2);

         for (String var11 : var8) {
            Matcher var6 = var9.matcher(var11);
            if (var6.matches()) {
               return var6.group(1);
            }
         }
      } catch (Exception var7) {
      }

      return null;
   }

   private boolean RIICRCOHIRHRIROIIRORCRICRHOOOI() {
      try {
         if (!this.HRHICOCCOOHROCCIHHOHORHIHHHHOO("parec")) {
            return false;
         }

         ProcessBuilder var1 = new ProcessBuilder(
            "parec",
            "--format=s16le",
            "--rate=48000",
            "--channels=" + OIIIOCICICCCCHCHRIIOIIIOCCORCC.getChannels(),
            "--latency-msec=20",
            "--device=@DEFAULT_MONITOR@"
         );
         this.HROOIHCCIIORCIHIORHCOROHIROICH = var1.start();
         return true;
      } catch (IOException var2) {
         return false;
      }
   }

   private boolean RCCCIICIHRHOIHORCHRIHIOHCOICHO() {
      try {
         if (!this.HRHICOCCOOHROCCIHHOHORHIHHHHOO("arecord")) {
            return false;
         } else {
            String var1 = this.HORIRCOHCROCORRHCORRCRIRCCRORO();
            if (var1 == null) {
               System.err.println("ALSA capture failed. No suitable loopback/monitor device found.");
               return false;
            } else {
               ProcessBuilder var2 = new ProcessBuilder(
                  "arecord", "-f", "S16_LE", "-r", String.valueOf(48000), "-c", String.valueOf(OIIIOCICICCCCHCHRIIOIIIOCCORCC.getChannels()), "-D", var1
               );
               this.HROOIHCCIIORCIHIORHCOROHIROICH = var2.start();
               return true;
            }
         }
      } catch (IOException var3) {
         return false;
      }
   }

   private String HORIRCOHCROCORRHCORRCRIRCCRORO() {
      try {
         Process var1 = new ProcessBuilder("arecord", "-L").start();
         Scanner var2 = new Scanner(var1.getInputStream()).useDelimiter("\\A");
         String var3 = var2.hasNext() ? var2.next() : "";
         var2.close();
         String var4 = null;

         for (String var8 : var3.split("\n")) {
            var8 = var8.trim();
            if (var8.toLowerCase().startsWith("hw:loopback")) {
               return var8.split(",")[0];
            }

            if (var8.toLowerCase().contains("monitor")) {
               var4 = var8;
            }
         }

         return var4;
      } catch (IOException var9) {
         return null;
      }
   }

   private boolean HRHICOCCOOHROCCIHHOHORHIHHHHOO(String var1) {
      try {
         Process var2 = new ProcessBuilder("which", var1).start();
         return var2.waitFor() == 0;
      } catch (IOException | InterruptedException var3) {
         return false;
      }
   }

   private String RHOCHHIRRCHHHOHOIRROIROHHHIHIO(String... var1) {
      Process var2 = new ProcessBuilder(var1).start();

      String var4;
      try (BufferedReader var3 = new BufferedReader(new InputStreamReader(var2.getInputStream()))) {
         while ((var4 = var3.readLine()) != null) {
            if (!var4.isBlank()) {
               var2.waitFor();
               return var4.trim();
            }
         }
      }

      var2.waitFor();
      return null;
   }

   private List<String> IRRCCOICORICIHCHRHIHIHROIRHOCR(String... var1) {
      Process var2 = new ProcessBuilder(var1).start();
      ArrayList var3 = new ArrayList();

      String var5;
      try (BufferedReader var4 = new BufferedReader(new InputStreamReader(var2.getInputStream()))) {
         while ((var5 = var4.readLine()) != null) {
            var3.add(var5);
         }
      }

      var2.waitFor();
      return var3;
   }

   @Override
   public void stop() {
      if (this.HROOIHCCIIORCIHIORHCOROHIROICH != null) {
         this.HROOIHCCIIORCIHIORHCOROHIROICH.destroy();
      }

      super.stop();
   }
}
