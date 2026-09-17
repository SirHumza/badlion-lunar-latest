package com.moonsworth.lunar.client.util.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;

import com.moonsworth.lunar.client.util.ORCOCORROHIROCCIORORRRRCHIOOCH;
import java.io.Closeable;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.nio.file.WatchEvent.Kind;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import lombok.Generated;
import org.jetbrains.annotations.Nullable;

public class HHCCIRHCCCIIRHCROHIORHIRHHIORH implements Closeable {
   private static final Kind<?>[] CICOHOOIHICIIHIIOCHIIORHHROOHO = new Kind[]{
      StandardWatchEventKinds.ENTRY_CREATE, StandardWatchEventKinds.ENTRY_DELETE, StandardWatchEventKinds.ENTRY_MODIFY, StandardWatchEventKinds.OVERFLOW
   };
   private final Path HRROCORIHOHICCHHIRHICOHOHROROI;
   private final Consumer<List<WatchEvent<?>>> ICRHIHOCIORIRRHRRHCCHCRHHHHIRC;
   @Nullable
   private WatchService IROIIOOCICHRIHCIOHCRCCCRICHIHC;
   @Nullable
   private ScheduledFuture<?> CCHRHHHOICRHRCHOCIOHCRHROOHORI;

   public HHCCIRHCCCIIRHCROHIORHIRHHIORH(Path var1, Consumer<List<WatchEvent<?>>> var2) {
      this(var1, var2, CICOHOOIHICIIHIIOCHIIORHHROOHO);
   }

   public HHCCIRHCCCIIRHCROHIORHIRHHIORH(Path var1, Consumer<List<WatchEvent<?>>> var2, Kind<?>... var3) {
      this.HRROCORIHOHICCHHIRHICOHOHROROI = var1;
      this.ICRHIHOCIORIRRHRRHCCHCRHHHHIRC = var2;

      try {
         this.IROIIOOCICHRIHCIOHCRCCCRICHIHC = FileSystems.getDefault().newWatchService();
         WatchKey var4 = var1.register(this.IROIIOOCICHRIHCIOHCRCCCRICHIHC, var3);
         this.CCHRHHHOICRHRCHOCIOHCRHROOHORI = ORCOCORROHIROCCIORORRRRCHIOOCH.RHHHOORICOOIRHCRIOIRRIHHIIOIRI()
            .scheduleAtFixedRate(() -> this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4), 0L, 1L, TimeUnit.SECONDS);
      } catch (Exception var5) {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
            "Could not create watch service!", var5.getMessage()
         );
      }
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(WatchKey var1) {
      List var2 = var1.pollEvents();
      if (!var2.isEmpty()) {
         this.ICRHIHOCIORIRRHRRHCCHCRHHHHIRC.accept(var2);
      }
   }

   @Override
   public void close() {
      if (this.CCHRHHHOICRHRCHOCIOHCRHROOHORI != null) {
         this.CCHRHHHOICRHRCHOCIOHCRHROOHORI.cancel(false);
      }

      if (this.IROIIOOCICHRIHCIOHCRCCCRICHIHC != null) {
         try {
            this.IROIIOOCICHRIHCIOHCRCCCRICHIHC.close();
         } catch (Exception var2) {
            com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
               "Could not close watch service!", var2.getMessage()
            );
         }
      }
   }

   @Generated
   public Path IICCHIHCRICCRHIRCICOORCHHIHIHC() {
      return this.HRROCORIHOHICCHHIRHICOHOHROROI;
   }

   @Generated
   public Consumer<List<WatchEvent<?>>> CRHRRCOCOORHHHIIIORIROHOIIIHIO() {
      return this.ICRHIHOCIORIRRHRRHCCHCRHHHHIRC;
   }

   @Nullable
   @Generated
   public WatchService IRICOCRROIIOCRIIOOCHHCRCCCRHIH() {
      return this.IROIIOOCICHRIHCIOHCRCCCRICHIHC;
   }

   @Nullable
   @Generated
   public ScheduledFuture<?> CCOCRCIHRICIRCOIHICHHIRCCCIOCI() {
      return this.CCHRHHHOICRHRCHOCIOHCRHROOHORI;
   }
}
