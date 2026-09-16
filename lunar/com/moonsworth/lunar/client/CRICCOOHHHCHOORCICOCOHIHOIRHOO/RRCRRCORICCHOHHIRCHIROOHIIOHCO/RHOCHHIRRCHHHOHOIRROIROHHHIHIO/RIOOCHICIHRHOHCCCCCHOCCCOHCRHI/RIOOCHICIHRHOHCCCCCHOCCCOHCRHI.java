package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.function.Consumer;

public class RIOOCHICIHRHOHCCCCCHOCCCOHCRHI {
   private final Thread IROHRHHHROCRCHOOOORRRRRIHIIORH;
   private WatchService IROIIOOCICHRIHCIOHCRCCCRICHIHC;
   private volatile boolean shutdown = false;

   public RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(Path var1, Consumer<Path> var2) {
      try {
         this.IROIIOOCICHRIHCIOHCRCCCRICHIHC = FileSystems.getDefault().newWatchService();
      } catch (Exception var4) {
         this.shutdown = true;
         this.IROHRHHHROCRCHOOOORRRRRIHIIORH = null;
         return;
      }

      this.IROHRHHHROCRCHOOOORRRRRIHIIORH = new Thread(() -> {
         try {
            var1.register(this.IROIIOOCICHRIHCIOHCRCCCRICHIHC, StandardWatchEventKinds.ENTRY_MODIFY);

            while (!this.shutdown) {
               WatchKey var3 = this.IROIIOOCICHRIHCIOHCRCCCRICHIHC.take();

               for (WatchEvent var5 : var3.pollEvents()) {
                  Path var6 = (Path)var5.context();
                  var2.accept(var6);
               }

               var3.reset();
            }
         } catch (InterruptedException var7) {
            Thread.currentThread().interrupt();
         } catch (Exception var8) {
         }
      });
      this.IROHRHHHROCRCHOOOORRRRRIHIIORH.start();
   }

   public void shutdown() {
      if (!this.shutdown) {
         this.shutdown = true;
         if (this.IROIIOOCICHRIHCIOHCRCCCRICHIHC != null) {
            try {
               this.IROIIOOCICHRIHCIOHCRCCCRICHIHC.close();
            } catch (Exception var2) {
            }
         }

         if (this.IROHRHHHROCRCHOOOORRRRRIHIIORH != null) {
            this.IROHRHHHROCRCHOOOORRRRRIHIIORH.interrupt();
         }
      }
   }
}
