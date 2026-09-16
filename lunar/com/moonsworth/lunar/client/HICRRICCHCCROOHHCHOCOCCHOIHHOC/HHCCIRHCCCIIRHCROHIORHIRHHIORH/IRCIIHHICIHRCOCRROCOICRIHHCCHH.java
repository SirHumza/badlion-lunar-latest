package com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.lunarclient.websocket.performance.v1.RecordPerfSnapshotRequest;
import it.unimi.dsi.fastutil.longs.LongArrayList;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.longs.LongList;
import java.io.File;
import jdk.jfr.consumer.RecordingStream;
import org.apache.commons.io.FileUtils;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   private static final IRCIIHHICIHRCOCRROCOICRIHHCCHH IIIRCHOOOIIRRRCHORCICCOCOIICCH = new IRCIIHHICIHRCOCRROCOICRIHHCCHH();
   private final LongList HCOCICHHCRIHHOOHRHCRHHIRHOIROC = new LongArrayList();

   public void init() {
      try {
         FileUtils.deleteDirectory(new File("jfr"));
      } catch (Throwable var2) {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.error("Failed to delete jfr directory", var2);
      }

      RecordingStream var1 = new RecordingStream();
      var1.enable("jdk.GarbageCollection");
      var1.onEvent("jdk.GarbageCollection", var1x -> {
         long var2x = var1x.getDuration("sumOfPauses").toNanos() / 1000L;
         this.HCOCICHHCRIHHOOHRHCRHHIRHOIROC.add(var2x);
      });
      var1.startAsync();
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RecordPerfSnapshotRequest.Builder var1) {
      if (!this.HCOCICHHCRIHHOOHRHCRHHIRHOIROC.isEmpty()) {
         long var2 = Long.MIN_VALUE;
         long var4 = Long.MAX_VALUE;
         long var6 = 0L;
         LongIterator var8 = this.HCOCICHHCRIHHOOHRHCRHHIRHOIROC.longIterator();

         while (var8.hasNext()) {
            long var9 = var8.nextLong();
            var2 = Math.max(var2, var9);
            var4 = Math.min(var4, var9);
            var6 += var9;
         }

         long var11 = this.HCOCICHHCRIHHOOHRHCRHHIRHOIROC.getLong(this.HCOCICHHCRIHHOOHRHCRHHIRHOIROC.size() / 2);
         var1.setGcCycles(this.HCOCICHHCRIHHOOHRHCRHHIRHOIROC.size());
         var1.setLongestGcMicro((int)var2);
         var1.setShortestGcMicro((int)var4);
         var1.setAvgGcMicro((int)(var6 / this.HCOCICHHCRIHHOOHRHCRHHIRHOIROC.size()));
         var1.setMedianGcMicro((int)var11);
         this.HCOCICHHCRIHHOOHRHCRHHIRHOIROC.clear();
      }
   }

   public static IRCIIHHICIHRCOCRROCOICRIHHCCHH OCIRHORHIRCHOORHHOHIROROOCIHOR() {
      return IIIRCHOOOIIRRRCHORCICCOCOIICCH;
   }
}
