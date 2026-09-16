package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HOHCCHOIOHOHHOROHOIIHOOHORRHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.github.benmanes.caffeine.cache.Caffeine;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.moonsworth.lunar.client.util.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;
import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpRequest.Builder;
import java.net.http.HttpResponse.BodyHandlers;
import java.time.Duration;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private OOROOCCIRCCRHOIOIORIHCHHOOCCOR<UUID, CRRRICCRROCOHHOHIICIHORCOORRRH> CICRHHHROHRRCCHRHCCCOOIHHIHCRO;

   @NotNull
   public abstract RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH OROCCHOOOIIOHCIRIRROOCHHIOICRC();

   @Nullable
   protected abstract CRRRICCRROCOHHOHIICIHORCOORRRH RRORCOIRRIICOOICOIOCORHORCHCOC(UUID var1);

   @NotNull
   public abstract List<IRCIIHHICIHRCOCRROCOICRIHHCCHH> OCRIOCRIHRIRCCOHOOOHOCHHHOORRR();

   @Nullable
   public CRRRICCRROCOHHOHIICIHORCOORRRH RHRIIOOOCRHIIOORCOCRCHRCCRRCIH(UUID var1) {
      if (this.CICRHHHROHRRCCHRHCCCOOIHHIHCRO == null) {
         this.CICRHHHROHRRCCHRHCCCOOIHHIHCRO = new OOROOCCIRCCRHOIOIORIHCHHOOCCOR<>(
               com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HOHCCHOIOHOHHOROHOIIHOOHORRHRO.CRRRICCRROCOHHOHIICIHORCOORRRH.CICIHRHCIHOROOIHHCRHIIOHRIRRII,
               150L,
               2,
               this::RRORCOIRRIICOOICOIOCORHORCHCOC,
               Caffeine.newBuilder().expireAfterWrite(15L, TimeUnit.MINUTES).initialCapacity(150).maximumSize(650L)
            )
            .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(7, TimeUnit.SECONDS);
         this.CICRHHHROHRRCCHRHCCCOOIHHIHCRO.setName(this.HRCOORIIIRROIORCCIIOCRCCRCCRRH() + " Fetch Thread");
         this.CICRHHHROHRRCCHRHCCCOOIHHIHCRO.start();
      }

      return this.CICRHHHROHRRCCHRHCCCOOIHHIHCRO.get(var1);
   }

   @Nullable
   public CRRRICCRROCOHHOHIICIHORCOORRRH RRHOOOORORHHOOIHRCCHIIHHIIIIOH(UUID var1) {
      return this.RRORCOIRRIICOOICOIOCORHORCHCOC(var1);
   }

   public void clearCache() {
      if (this.CICRHHHROHRRCCHRHCCCOOIHHIHCRO != null) {
         this.CICRHHHROHRRCCHRHCCCOOIHHIHCRO.invalidateAll();
      }
   }

   public void IIOROOHCCHOIOHCOCIOHIHIIRRHIIR() {
      if (this.CICRHHHROHRRCCHRHCCCOOIHHIHCRO != null) {
         this.CICRHHHROHRRCCHRHCCCOOIHHIHCRO.HIIHCCOCRHHIHOICRHIICHIRCCRCIC();
      }
   }

   public String CHOOICOOCIOHRORICOHORHRIRRRCHI() {
      return this.CICRHHHROHRRCCHRHCCCOOIHHIHCRO == null ? "N/A" : this.CICRHHHROHRRCCHRHCCCOOIHHIHCRO.getInfo();
   }

   protected String userAgent() {
      return "LunarClient/" + com.moonsworth.lunar.client.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOCRRHCRORRCCCIRHOIORIHRIIHOOC;
   }

   protected String HRCOORIIIRROIORCCIIOCRCCRCCRRH() {
      String var1 = URI.create(this.OROCCHOOOIIOHCIRIRROOCHHIOICRC().OIICOIRRRCOICHCHCHRICOIOHHOOCR()).getHost();
      return var1 == null ? "Tier" : var1;
   }

   public final Optional<IRCIIHHICIHRCOCRROCOICRIHHCCHH> ROICOCHCIHIRICHOOCHHCRHCHOORIR(String var1) {
      return this.OCRIOCRIHRIRCCOHOOOHOCHHHOORRR().stream().filter(var1x -> var1x.apiName().equalsIgnoreCase(var1)).findFirst();
   }

   public final CompletableFuture<Optional<JsonElement>> RHOCHHIRRCHHHOHOIRROIROHHHIHIO(String var1, boolean var2) {
      if (var1.endsWith("/")) {
         var1 = var1.substring(0, var1.length() - 1);
      }

      String var3 = var1;
      Builder var4 = HttpRequest.newBuilder().uri(URI.create(var3)).timeout(Duration.ofSeconds(10L)).header("User-Agent", this.userAgent());
      Function var5 = var1x -> {
         if (var1x == null) {
            com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
               "httpGet failed: %s (null response)", var3
            );
            return Optional.empty();
         }

         int var2x = var1x.statusCode();
         if (var2x != 200) {
            if (var2x != 404 && var2x != 400) {
               com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                  "httpGet failed: %s (status %s)", var3, var2x
               );
            }

            return var2x != 404 && var2x != 422 && var2x != 400 ? Optional.empty() : Optional.of(new JsonObject());
         } else {
            try {
               return Optional.of(JsonParser.parseString((String)var1x.body()));
            } catch (Exception var4x) {
               com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  var4x, "httpGet json parse failed %s: %s", var3, var1x.body()
               );
               return Optional.of(new JsonObject());
            }
         }
      };
      if (var2) {
         return com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HOHCCHOIOHOHHOROHOIIHOOHORRHRO.CRRRICCRROCOHHOHIICIHORCOORRRH.IOCRRHRCCRCOROOHCCRIOICCCCOCCC
            .sendAsync(var4.GET().build(), BodyHandlers.ofString())
            .<Optional<JsonElement>>thenApply(var5)
            .orTimeout(10L, TimeUnit.SECONDS)
            .exceptionally(
               var1x -> {
                  com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                     var1x, "httpGet exception %s", var3
                  );
                  return Optional.empty();
               }
            );
      }

      CompletableFuture var6 = new CompletableFuture();

      try {
         HttpResponse var7 = com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HOHCCHOIOHOHHOROHOIIHOOHORRHRO.CRRRICCRROCOHHOHIICIHORCOORRRH.IOCRRHRCCRCOROOHCCRIOICCCCOCCC
            .send(var4.GET().build(), BodyHandlers.ofString());
         var6.complete((Optional)var5.apply(var7));
      } catch (Exception var8) {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var8, "httpGet exception %s", var3
         );
         var6.complete(Optional.empty());
      }

      return var6;
   }

   public record RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      private final String OIRHRIHICHRRHRCICIRROORRCCOOCH;
      private final List<RIOOCHICIHRHOHCCCCCHOCCCOHCRHI> OHRICORRHORORCHOHCRCOORCICRIII;
      private final boolean HCORRHORIIIHICCCHCRCIORHOORRIO;
      private final boolean ICOIOCHRICIHCIOHCHIOORHCROROHI;

      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, List<RIOOCHICIHRHOHCCCCCHOCCCOHCRHI> var2, boolean var3, boolean var4) {
         this.OIRHRIHICHRRHRCICIRROORRCCOOCH = var1;
         this.OHRICORRHORORCHOHCRCOORCICRIII = var2;
         this.HCORRHORIIIHICCCHCRCIORHOORRIO = var3;
         this.ICOIOCHRICIHCIOHCHIOORHCROROHI = var4;
      }

      public boolean CCOCOOICORRRHIICOORCOCICHRROCO() {
         return this.OHRICORRHORORCHOHCRCOORCICRIII.stream().anyMatch(var0 -> var0.OCOIRHHHHIOCRICORCORRRHCIIROII() == 2);
      }

      public String OIICOIRRRCOICHCHCHRICOIOHHOOCR() {
         return this.OIRHRIHICHRRHRCICIRROORRCCOOCH;
      }

      public List<RIOOCHICIHRHOHCCCCCHOCCCOHCRHI> ICOOHIOOIHCROHCHIORHCCCCHICCRH() {
         return this.OHRICORRHORORCHOHCRCOORCICRIII;
      }

      public boolean OOOCCHHCIICOIOHIRHOIRIRROOIICH() {
         return this.HCORRHORIIIHICCCHCRCIORHOORRIO;
      }

      public boolean ROHHOOCRHRIRCHOOIHHIORCCIICRHR() {
         return this.ICOIOCHRICIHCIOHCHIOORHCROROHI;
      }
   }
}
