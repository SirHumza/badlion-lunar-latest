package com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.IIRHCHHOICHRICOOCRORCCIOOIHOIR;
import com.moonsworth.lunar.client.util.IRRCHICCRHCHRRCHIOHIIRIORIRHRI;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.file.Files;
import java.time.Duration;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import lombok.Generated;
import org.apache.commons.io.FileUtils;
import org.jetbrains.annotations.Nullable;

public abstract class IRCIIHHICIHRCOCRROCOICRIHHCCHH<T> {
   private static final Executor ROCOCIHCICROCOIRHRHRCOIOCICHHR = Executors.newCachedThreadPool(
      new ThreadFactoryBuilder().setNameFormat("jit-http-thread-%d").setDaemon(true).build()
   );
   private static final HttpClient OHCRRHOOHHHHRHHRRRHRIOHIHCHICH = HttpClient.newBuilder()
      .executor(ROCOCIHCICROCOIRHRHRCOIOCICHHR)
      .connectTimeout(Duration.ofSeconds(10L))
      .build();
   protected final com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH RCOIIROHCCHICCCCHOHHCRRORHRCHI;
   protected final IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RHCHIRCHOIIOIHHOIHRHCIICIRCCCI;
   protected final AtomicBoolean CCOHOCHIORIRHIRROHCORROCRHRIRO = new AtomicBoolean();
   @Nullable
   protected volatile T value;
   private volatile int RICRROROHRRIOHHHIHRCCCCCHHIIHO;

   protected IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1,
      IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2
   ) {
      this.RCOIIROHCCHICCCCHOHHCRRORHRCHI = var1;
      this.RHCHIRCHOIIOIHHOIHRHCIICIRCCCI = var2;
   }

   public Optional<T> RCRCHRIOOIOICHIIOCCOHCICIRIHRC() {
      this.HICCORIOHCOHCRRHHCIOIIIRCCROOC();
      return this.OHHRRIICHORCORCHHIOCCCIHORIIOH();
   }

   public Optional<T> OHHRRIICHORCORCHHIOCCCIHORIIOH() {
      return Optional.ofNullable(this.value);
   }

   @CanIgnoreReturnValue
   public boolean HICCORIOHCOHCRRHHCIOIIIRCCROOC() {
      if (this.CCOHOCHIORIRHIRROHCORROCRHRIRO.compareAndSet(false, true)) {
         CompletableFuture var1;
         if (this.COHCRCIIORICCHCHIRIORIIOIHRICC()) {
            var1 = this.OOIRCHROROORHICIIHCCRCOCHCOOIO().thenCompose(var1x -> this.HCICIHIOHOIOHROIIHCIOOCRROHRCR());
         } else {
            var1 = this.HCICIHIOHOIOHROIIHCIOOCRROHRCR();
         }

         var1.thenAccept(var1x -> this.value = (T)var1x)
            .exceptionally(
               var1x -> {
                  com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
                     "JIT", "Failed to compute JIT resource value for '%s': %s", this.RCOIIROHCCHICCCCHOHHCRRORHRCHI, var1x.getMessage()
                  );
                  var1x.printStackTrace();
                  return null;
               }
            );
      }

      return this.value != null;
   }

   public void OCOIHIICRCOIHHROICIIOOHRRHORIH(int var1) {
      this.RICRROROHRRIOHHHIHRCCCCCHHIIHO = var1;
      com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .CHIROHOORHIRORIORHOHORHOHHHOOH();
      var2.HCOCCOCCHIIICOOROOOICCOCHOORRI().RRCRRCORICCHOHHIRCHIROOHIIOHCO(this.RCOIIROHCCHICCCCHOHHCRRORHRCHI);
   }

   private boolean COHCRCIIORICCHCHIRIORIIOIHRICC() {
      if (!this.RHCHIRCHOIIOIHHOIHRHCIICIRCCCI.ICRORCOIIOROIOOICHOHRIHOORROHI()) {
         return false;
      } else if (!CRRRICCRROCOHHOHIICIHORCOORRRH.HOIHOROOIOOCOIHCRIRIRIRRICIIHC(this.RCOIIROHCCHICCCCHOHHCRRORHRCHI.RRCCCRRROOIIRHCROOROOIHHHRIRCH())) {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
            "JIT", "Cannot download resource with invalid domain: %s", this.RCOIIROHCCHICCCCHOHHCRRORHRCHI.RRCCCRRROOIIRHCROOROOIHHHRIRCH()
         );
         return false;
      } else {
         String var1 = this.RCOIIROHCCHICCCCHOHHCRRORHRCHI.RRCCCRRROOIIRHCROOROOIHHHRIRCH().bridge$getPath();
         return !Files.exists(IIRHCHHOICHRICOOCRORCCIOOIHOIR.ICRCICIOOCRIOHHCHOROOCRRORHCHC.resolve(var1));
      }
   }

   private CompletableFuture<Void> OOIRCHROROORHICIIHCCRCOCHCOOIO() {
      CompletableFuture var1 = this.RORHHOOCRCHHCORIROOIRRCORIRRCO(false);
      if (this.RHCHIRCHOIIOIHHOIHRHCIICIRCCCI.hasMetadata()) {
         CompletableFuture var2 = this.RORHHOOCRCHHCORIROOIRRCORIRRCO(true);
         return var1.thenCombine(var2, (var0, var1x) -> null);
      } else {
         return var1;
      }
   }

   private CompletableFuture<Void> RORHHOOCRCHHCORIROOIRRCORIRRCO(boolean var1) {
      com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .CHIROHOORHIRORIORHOHORHOHHHOOH();
      Optional var3 = var2.IRCIIHHICIHRCOCRROCOICRIHHCCHH(this.RCOIIROHCCHICCCCHOHHCRRORHRCHI.RRCCCRRROOIIRHCROOROOIHHHRIRCH(), var1);
      if (var3.isEmpty()) {
         return CompletableFuture.completedFuture(null);
      }

      HttpRequest var4 = HttpRequest.newBuilder()
         .uri((URI)var3.get())
         .header(
            "User-Agent",
            "LunarClient/" + com.moonsworth.lunar.client.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOCRRHCRORRCCCIRHOIORIHRIIHOOC
         )
         .header("X-Installation-Id", IRRCHICCRHCHRRCHIOHIIRIORIRHRI.CIIRORRIRORRRHCROCICCCHIHOHRCR)
         .GET()
         .build();
      CompletableFuture var5 = OHCRRHOOHHHHRHHRRRHRIOHIHCHICH.sendAsync(var4, BodyHandlers.ofInputStream());
      return var5.thenAccept(
         var3x -> {
            if (var3x.statusCode() != 200) {
               com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                  "Failed to locate asset: " + this.RCOIIROHCCHICCCCHOHHCRRORHRCHI.RRCCCRRROOIIRHCROOROOIHHHRIRCH() + " - status: " + var3x.statusCode()
               );
            } else {
               try (InputStream var4x = (InputStream)var3x.body()) {
                  String var5x = this.RCOIIROHCCHICCCCHOHHCRRORHRCHI.RRCCCRRROOIIRHCROOROOIHHHRIRCH().bridge$getPath();
                  if (var1) {
                     var5x = var5x + ".mcmeta";
                  }

                  FileUtils.copyInputStreamToFile(var4x, IIRHCHHOICHRICOOCRORCCIOOIHOIR.ICRCICIOOCRIOHHCHOROOCRRORHCHC.resolve(var5x).toFile());
                  var2.ROCCHHRICCHIRIOOICRRIOIOOIIOHC()
                     .CRRRICCRROCOHHOHIICIHORCOORRRH(this.RCOIIROHCCHICCCCHOHHCRRORHRCHI.RRCCCRRROOIIRHCROOROOIHHHRIRCH(), var1);
               } catch (IOException var9) {
                  com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
                     "Failed to download JIT resource: " + this.RCOIIROHCCHICCCCHOHHCRRORHRCHI.RRCCCRRROOIIRHCROOROOIHHHRIRCH()
                  );
                  throw new RuntimeException(var9);
               }
            }
         }
      );
   }

   public void tick() {
   }

   public void cleanUp() {
   }

   protected abstract CompletableFuture<T> HCICIHIOHOIOHROIIHCIOOCRROHRCR();

   @Generated
   public com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH OOIIHCRRHRICRROOHCHIHCOHRHHOII() {
      return this.RCOIIROHCCHICCCCHOHHCRRORHRCHI;
   }

   @Generated
   public IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH CIHHCCHRIRCRRIOOOOIIOOIHICHOIC() {
      return this.RHCHIRCHOIIOIHHOIHRHCIICIRCCCI;
   }

   @Generated
   public int OCIRRRHCRCIIIHHRRCHOCHIOCOOCOI() {
      return this.RICRROROHRRIOHHHIHRCCCCCHHIIHO;
   }

   public record RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      private final boolean RRIHOHHOHROOIHCCCRRROICIRORHOR;
      private final boolean COHOIOROIIOOHCHCHIROIHOCICOOOC;
      private final boolean CRHIOOORRHOHIRRORICIIICRHCICRH;

      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(boolean var1, boolean var2, boolean var3) {
         this.RRIHOHHOHROOIHCCCRRROICIRORHOR = var1;
         this.COHOIOROIIOOHCHCHIROIHOCICOOOC = var2;
         this.CRHIOOORRHOHIRRORICIIICRHCICRH = var3;
      }

      public static IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH ICIOCCHCCOIIRRRCOOHRIIIHROIRIC() {
         return new IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(false, false, true);
      }

      public boolean hasMetadata() {
         return this.RRIHOHHOHROOIHCCCRRROICIRORHOR;
      }

      public boolean HIRICCIHCICHCIOHCIRICCCORIICRI() {
         return this.COHOIOROIIOOHCHCHIROIHOCICOOOC;
      }

      public boolean ICRORCOIIOROIOOICHOHRIHOORROHI() {
         return this.CRHIOOORRHOHIRRORICIIICRHCICRH;
      }
   }
}
