package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.RIHOOCIHRICOCHRHCOOCCOIHOCHRCR;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import lombok.Generated;

public class HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   private final com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH CIORHHHRCHHHRIRHORHHICRHOCIRRR;
   private final Object IHRHCOIIORHORICORRROCCHCOCOOIC = new Object();
   private final Set<String> IROHCHRRRHOCRROHHRHIIHRRCRRCHR = new HashSet<>();
   private final Map<String, Boolean> ROCOIHOICIRRIRRHIOHRIRCHOHOORC = new ConcurrentHashMap<>();
   private volatile boolean IHRHOCHOOIHORHRCRROORRRIIRCCCH = false;
   private volatile boolean OHOIRHHIOOIRHIOCRIIOCCHICRIOCH = false;
   private volatile boolean done = false;
   private final List<CRRRICCRROCOHHOHIICIHORCOORRRH> HHCCIIIOOICRCOOCHCRCIIHOHCOOHC = Collections.synchronizedList(new ArrayList<>());

   public HHCCIRHCCCIIRHCROHIORHIRHHIORH(
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
   ) {
      this.CIORHHHRCHHHRIRHORHHICRHOCIRRR = var1;
   }

   public void OCIRRCHORHIHICORIRCCICIRIOCOCI() {
      if (this.CIORHHHRCHHHRIRHORHHICRHOCIRRR.RCIIIOCRRROCRCRROOIOOCCCHCCHCO()) {
         this.ICHRHHCHROOICORHHRRHCHRHICOCOO();
         this.CHIOICRORHOCOROOIHRRHCHIIHCHII();
      }
   }

   private void ICHRHHCHROOICORHHRRHCHRHICOCOO() {
      synchronized (this.IHRHCOIIORHORICORRROCCHCOCOOIC) {
         if (!this.IHRHOCHOOIHORHRCRROORRRIIRCCCH) {
            try {
               ProcessBuilder var2 = new ProcessBuilder(this.CIORHHHRCHHHRIRHORHHICRHOCIRRR.HHCOROHRRORHRIOIOOHCIOHRROHCRI().getAbsolutePath(), "-encoders");
               var2.redirectErrorStream(true);
               Process var3 = var2.start();

               try (BufferedReader var4 = new BufferedReader(new InputStreamReader(var3.getInputStream()))) {
                  boolean var6 = false;
                  boolean var7 = false;

                  String var5;
                  while ((var5 = var4.readLine()) != null) {
                     if (!var6) {
                        if (var5.trim().equals("Encoders:")) {
                           var6 = true;
                        }
                     } else if (!var7) {
                        if (var5.trim().startsWith("------")) {
                           var7 = true;
                        }
                     } else {
                        String var8 = var5.trim();
                        if (!var8.isEmpty()) {
                           String[] var9 = var8.split("\\s+", 3);
                           if (var9.length >= 2 && var9[0].startsWith("V")) {
                              this.IROHCHRRRHOCRROHHRHIIHRRCRRCHR.add(var9[1]);
                           }
                        }
                     }
                  }
               }

               var3.waitFor();
            } catch (Exception var19) {
               com.moonsworth.lunar.client.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var19, "RewindEncoders");
            } finally {
               this.IHRHOCHOOIHORHRCRROORRRIIRCCCH = true;
            }
         }
      }
   }

   private boolean HHCCIRHCCCIIRHCROHIORHIRHHIORH(CRRRICCRROCOHHOHIICIHORCOORRRH var1) {
      if (!var1.isHardware()) {
         return true;
      }

      String var2 = var1.getId();
      String var3 = var2 + ":" + String.join("|", var1.getArguments(1000));
      if (this.ROCOIHOICIRRIRRHIOHRIRCHOHOORC.containsKey(var3)) {
         Boolean var4 = this.ROCOIHOICIRRIRRHIOHRIRCHOHOORC.get(var3);
         if (var4 != null) {
            return var4;
         }
      }

      ArrayList var25 = new ArrayList();
      var25.add(this.CIORHHHRCHHHRIRHORHHICRHOCIRRR.HHCOROHRRORHRIOIOOHCIOHRROHCRI().getAbsolutePath());
      var25.add("-loglevel");
      var25.add("error");
      var25.add("-f");
      var25.add("lavfi");
      var25.add("-i");
      var25.add("testsrc=size=320x240:rate=10:duration=0.2");
      var25.addAll(var1.getArguments(1000));
      var25.add("-f");
      var25.add("null");
      var25.add("-");
      Process var5 = null;
      boolean var6 = false;
      StringBuilder var7 = new StringBuilder();

      try {
         ProcessBuilder var8 = new ProcessBuilder(var25);
         var5 = var8.start();

         String var10;
         try (BufferedReader var9 = new BufferedReader(new InputStreamReader(var5.getErrorStream()))) {
            while ((var10 = var9.readLine()) != null) {
               var7.append(var10).append(System.lineSeparator());
            }
         }

         try (InputStream var26 = var5.getInputStream()) {
            var26.readAllBytes();
         }

         if (!var5.waitFor(10L, TimeUnit.SECONDS)) {
            var5.destroyForcibly();
         } else {
            String var27 = var7.toString().toLowerCase();
            if (var5.exitValue() == 0) {
               boolean var28 = var27.contains("driver does not support the required nvenc api version")
                  || var27.contains("cannot create a cuda context")
                  || var27.contains("no nvenc capable devices found")
                  || var2.contains("videotoolbox")
                     && (
                        var27.contains("error initializing videotoolbox") || var27.contains("failed to create compression session") || var27.contains("-12905")
                     )
                  || var2.contains("qsv") && (var27.contains("initialize failed") || var27.contains("error creating a mfx session"))
                  || var2.contains("amf")
                     && (var27.contains("amf function failed") || var27.contains("no amd amf capable device found") || var27.contains("encoder->init() failed"));
               var6 = !var28;
            }
         }
      } catch (Exception var23) {
         if (var23 instanceof InterruptedException) {
            Thread.currentThread().interrupt();
         }

         com.moonsworth.lunar.client.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var23, "RewindEncoders");
      } finally {
         if (var5 != null && var5.isAlive()) {
            var5.destroyForcibly();
         }
      }

      this.ROCOIHOICIRRIRRHIOHRIRCHOHOORC.put(var3, var6);
      return var6;
   }

   private synchronized void CHIOICRORHOCOROOIHRRHCHIIHCHII() {
      if (!this.OHOIRHHIOOIRHIOCRIIOCCHICRIOCH) {
         this.OHOIRHHIOOIRHIOCRIIOCCHICRIOCH = true;
         new Thread(
               () -> {
                  this.HHCCIIIOOICRCOOCHCRCIIHOHCOOHC.clear();

                  for (CRRRICCRROCOHHOHIICIHORCOORRRH var4 : CRRRICCRROCOHHOHIICIHORCOORRRH.values()) {
                     if (this.IROHCHRRRHOCRROHHRHIIHRRCRRCHR.contains(var4.getId())
                        && this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var4)
                        && (!var4.isMacOS() || RIHOOCIHRICOCHRHCOOCCOIHOCHRCR.isMacos())) {
                        this.HHCCIIIOOICRCOOCHCRCIIHOHCOOHC.add(var4);
                     }
                  }

                  this.done = true;
                  IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
                     .bridge$submit(
                        com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HIHHOCRHHRORRHHRORRRIIHHORIHOC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OCOHORHCROHICRRIHCIHHRRCIHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH::CRCOCRCOCHRROIROHRCRRIHIIRCCCH
                     );
               },
               "RewindEncoderProbeThread"
            )
            .start();
      }
   }

   public CRRRICCRROCOHHOHIICIHORCOORRRH HHCCIRHCCCIIRHCROHIORHIRHHIORH(RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      for (CRRRICCRROCOHHOHIICIHORCOORRRH var3 : var1.getEncoders()) {
         if (this.HHCCIIIOOICRCOOCHCRCIIHOHCOOHC.contains(var3)) {
            return var3;
         }
      }

      return null;
   }

   @Generated
   public boolean isDone() {
      return this.done;
   }

   @Generated
   public List<CRRRICCRROCOHHOHIICIHORCOORRRH> HOHICRCICIIHCOCRRIHHOHHCIHRCHC() {
      return this.HHCCIIIOOICRCOOCHCRCIIHOHCOOHC;
   }
}
