package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RIHOOCIHRICOCHRHCOOCCOIHOCHRCR;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IHIRRIIORRHORHRORIHOROIRCORCOO;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CIOHHCORHRCCRICCCORIHCRHCCCRRR.CORCOCICIRIOHROHROIIOOHICCHCRR;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CIOHHCORHRCCRICCCORIHCRHCCCRRR.HICRRICCHCCROOHHCHOCOCCHOIHHOC;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CIOHHCORHRCCRICCCORIHCRHCCCRRR.IRRCCOICORICIHCHRHIHIHROIRHOCR;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CIOHHCORHRCCRICCCORIHCRHCCCRRR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.function.Function;
import org.jetbrains.annotations.NotNull;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<T> {
   private final ConcurrentHashMap<RCIROOOOICRHCCRRCIORHHIRCOIIIC, CompletableFuture<T>> HIOHHHCHORHRCHHRIRHIOIIRHORROC;
   private final ConcurrentHashMap<RCIROOOOICRHCCRRCIORHHIRCOIIIC, T> ORRCRIRCHIICHIRRHCRRCOIIOCIHOR;
   private final int ROIICHORCRRROOORHIHIIIRCOROCRR;
   private final int HHIOOCCHHCCHOOOIRRHIIOIRHRRRHO;

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(int var1, int var2) {
      this.ROIICHORCRRROOORHIHIIIRCOROCRR = var1;
      this.HHIOOCCHHCCHOOOIRRHIIOIRHRRRHO = var2;
      this.HIOHHHCHORHRCHHRIRHIOIIRHORROC = new ConcurrentHashMap<>();
      this.ORRCRIRCHIICHIRRHCRRCOIIOCIHOR = new ConcurrentHashMap<>();
   }

   public Optional<T> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1,
      Function<OOROOCCIRCCRHOIOIORIHCHHOOCCOR, T> var2
   ) {
      if (var1.bridge$isSkinTextureUploaded() && !HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var1)) {
         RCIROOOOICRHCCRRCIORHHIRCOIIIC var3 = var1.bridge$getLocationSkin();
         return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3, var2);
      } else {
         return Optional.empty();
      }
   }

   public Optional<T> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(@NotNull GameProfile var1, Function<OOROOCCIRCCRHOIOIORIHCHHOOCCOR, T> var2) {
      Optional var3 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getSkinManager().bridge$getSkinLocation(var1, Type.SKIN);
      return var3.isEmpty() ? Optional.empty() : this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH((RCIROOOOICRHCCRRCIORHHIRCOIIIC)var3.get(), var2);
   }

   public Optional<T> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RCIROOOOICRHCCRRCIORHHIRCOIIIC var1, Function<OOROOCCIRCCRHOIOIORIHCHHOOCCOR, T> var2) {
      Object var3 = this.ORRCRIRCHIICHIRRHCRRCOIIOCIHOR.get(var1);
      if (var3 != null) {
         return Optional.of((T)var3);
      }

      CompletableFuture var4 = this.HIOHHHCHORHRCHHRIRHIOIIRHORROC.get(var1);
      if (var4 != null) {
         return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var4);
      }

      HICRRICCHCCROOHHCHOCOCCHOIHHOC var5 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getTextureManager();
      IRRCCOICORICIHCHRHIHIHROIRHOCR var6 = var5.bridge$getTexture(var1);
      if (var6 == null) {
         return Optional.empty();
      }

      if (var6 instanceof IHIRRIIORRHORHRORIHOROIRCORCOO var8) {
         CompletableFuture var9 = var8.bridge$requestContent();
         if (var9 == null) {
            return Optional.empty();
         }

         var4 = var9.exceptionallyCompose(
               var2x -> {
                  CompletableFuture var3x = new CompletableFuture();
                  IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
                     .bridge$submit(
                        () -> com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
                           .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                              var8,
                              0,
                              0,
                              this.ROIICHORCRRROOORHIHIIIRCOROCRR,
                              this.HHIOOCCHHCCHOOOIRRHIIOIRHRRRHO,
                              com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RGBA8,
                              var2xxx -> var3x.complete(
                                 OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                                    this.ROIICHORCRRROOORHIHIIIRCOROCRR, this.HHIOOCCHHCCHOOOIRRHIIOIRHRRRHO, var2xxx.asIntBuffer()
                                 )
                              )
                           )
                     );
                  return var3x;
               }
            )
            .thenApply(var2);
         this.HIOHHHCHORHRCHHRIRHIOIIRHORROC.put(var1, var4);
      } else {
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION < 6 || !(var6 instanceof CORCOCICIRIOHROHROIIOOHICCHCRR var7)) {
            return Optional.empty();
         }

         var4 = CompletableFuture.completedFuture(
            var2.apply(
               com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
                  .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var7.bridge$getNativeImage())
            )
         );
      }

      return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var4);
   }

   private Optional<T> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RCIROOOOICRHCCRRCIORHHIRCOIIIC var1, CompletableFuture<T> var2) {
      if (var2.isDone()) {
         try {
            Object var3 = var2.get();
            this.HIOHHHCHORHRCHHRIRHIOIIRHORROC.remove(var1);
            this.ORRCRIRCHIICHIRRHCRRCOIIOCIHOR.put(var1, (T)var3);
            return Optional.of((T)var3);
         } catch (ExecutionException var4) {
            com.moonsworth.lunar.client.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               var4, "pollFuture SkinDataCache"
            );
            return Optional.empty();
         } catch (InterruptedException var5) {
         }
      }

      return Optional.empty();
   }

   public void clear() {
      this.HIOHHHCHORHRCHHRIRHIOIIRHORROC.clear();
      this.ORRCRIRCHIICHIRRHCRRCOIIOCIHOR.clear();
   }

   public void RORCHCIIICOHIRROOORHOCCCCIOCCI(RCIROOOOICRHCCRRCIORHHIRCOIIIC var1) {
      CompletableFuture var2 = this.HIOHHHCHORHRCHHRIRHIOIIRHORROC.get(var1);
      this.HIOHHHCHORHRCHHRIRHIOIIRHORROC.clear();
      if (var2 != null) {
         this.HIOHHHCHORHRCHHRIRHIOIIRHORROC.put(var1, var2);
      }

      Object var3 = this.ORRCRIRCHIICHIRRHCRRCOIIOCIHOR.get(var1);
      this.ORRCRIRCHIICHIRRHCRRCOIIOCIHOR.clear();
      if (var3 != null) {
         this.ORRCRIRCHIICHIRRHCRRCOIIOCIHOR.put(var1, (T)var3);
      }
   }

   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1
   ) {
      this.IOHHOIIOCRHCHHCRORICCOHOHROOIH(var1.bridge$getLocationSkin());
   }

   public void IOHHOIIOCRHCHHCRORICCOHOHROOIH(RCIROOOOICRHCCRRCIORHHIRCOIIIC var1) {
      this.HIOHHHCHORHRCHHRIRHIOIIRHORROC.remove(var1);
      this.ORRCRIRCHIICHIRRHCRRCOIIOCIHOR.remove(var1);
   }
}
