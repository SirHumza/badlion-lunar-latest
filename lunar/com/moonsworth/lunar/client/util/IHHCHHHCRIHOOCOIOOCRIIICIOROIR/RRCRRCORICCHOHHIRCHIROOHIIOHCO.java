package com.moonsworth.lunar.client.util.IHHCHHHCRIHOOCOIOOCRIIICIOROIR;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CIOHHCORHRCCRICCCORIHCRHCCCRRR.RHOCHHIRRCHHHOHOIRROIROHHHIHIO;
import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRRCCOICORICIHCHRHIHIHROIRHOCR;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import org.jetbrains.annotations.Nullable;

public class RRCRRCORICCHOHHIRCHIROOHIIOHCO extends com.moonsworth.lunar.client.IRRCCOICORICIHCHRHIHIHROIRHOCR.CRRRICCRROCOHHOHIICIHORCOORRRH {
   private Map<String, RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> RHOOHCHRHHCRRCICHHHCHOORCIHROC = null;

   private RRCRRCORICCHOHHIRCHIROOHIIOHCO() {
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         IRRCCOICORICIHCHRHIHIHROIRHOCR.class,
         var1 -> var1.CCRIIHHOROCCHCCCCHRCCOROIHICIO()
            .thenRun(() -> IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$submit(this::update)),
         Integer.MAX_VALUE
      );
   }

   public Optional<RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RHOCHHIRRCHHHOHOIRROIROHHHIHIO var1) {
      return this.RHOOHCHRHHCRRCICHHHCHOORCIHROC == null
         ? Optional.empty()
         : Optional.ofNullable(this.RHOOHCHRHHCRRCICHHHCHOORCIHROC.get(var1.bridge$getName()));
   }

   public Optional<RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> CHIROHOORHIRORIORHOHORHOHHHOOH(String var1) {
      return this.RHOOHCHRHHCRRCICHHHCHOORCIHROC == null ? Optional.empty() : Optional.ofNullable(this.RHOOHCHRHHCRRCICHHHCHOORCIHROC.get(var1));
   }

   @Override
   protected void onEnable() {
      this.RHOOHCHRHHCRRCICHHHCHOORCIHROC = new HashMap<>();
      this.update();
   }

   @Override
   protected void onDisable() {
      if (this.RHOOHCHRHHCRRCICHHHCHOORCIHROC != null) {
         this.RHOOHCHRHHCRRCICHHHCHOORCIHROC.clear();
         this.RHOOHCHRHHCRRCICHHHCHOORCIHROC = null;
      }
   }

   @Override
   protected boolean isEnabled() {
      return com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HRICIORORHCRHCCCIIIHRRHCICOHOR().isPresent();
   }

   private void update() {
      if (this.RHOOHCHRHHCRRCICHHHCHOORCIHROC != null) {
         this.RHOOHCHRHHCRRCICHHHCHOORCIHROC.clear();
         Optional var1 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HRICIORORHCRHCCCIIIHRRHCICOHOR();
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION < 1
            || ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.HHCCIRHCCCIIRHCROHIORHIRHHIORH)var1.get())
               .getConfig()
               .hasConnectedTextures()) {
            HashMap var2 = new HashMap();
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.IRCIIHHICIHRCOCRROCOICRIHHCCHH[][] var3 = ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.HHCCIRHCCCIIRHCROHIORHIRHHIORH)var1.get())
               .getConnectedTextures()
               .getTileProperties();
            if (var3 != null) {
               for (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.IRCIIHHICIHRCOCRROCOICRIHHCCHH[] var7 : var3) {
                  if (var7 != null) {
                     this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var7, var2);
                  }
               }
            }

            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.IRCIIHHICIHRCOCRROCOICRIHHCCHH[][] var9 = ((com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.HHCCIRHCCCIIRHCROHIORHIRHHIORH)var1.get())
               .getConnectedTextures()
               .getBlockProperties();
            if (var9 != null) {
               for (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.IRCIIHHICIHRCOCRROCOICRIHHCCHH[] var8 : var9) {
                  if (var8 != null) {
                     this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var8, var2);
                  }
               }
            }
         }
      }
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.IRCIIHHICIHRCOCRROCOICRIHHCCHH[] var1,
      Map<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.IRCIIHHICIHRCOCRROCOICRIHHCCHH, RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH> var2
   ) {
      for (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var6 : var1) {
         if (var6 != null) {
            RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var7 = var2.computeIfAbsent(
               var6, var0 -> new RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH()
            );
            Set var8 = var7.CHRRIOHICRRRRHORCRICORRIOIIHIO;
            if (var8 == null) {
               var8 = var7.CHRRIOHICRRRRHORCRICORRIOIIHIO = new HashSet<>();
               this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var6.bridge$getMatchTiles(), var8, null);
               this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var6.bridge$parseMatchBlocks(), var8, null);
            }

            for (String var10 : var8) {
               LinkedHashSet var11 = var7.CCHIIOCHHIHOIRIOCOCCHCHCRICHOH;
               if (var11 == null) {
                  var11 = var7.CCHIIOCHHIHOIRIOCOCCHCHCRICHOH = new LinkedHashSet<>();
                  this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                     var6.bridge$getTiles(),
                     var11,
                     var0 -> {
                        var0 = var0.toLowerCase(Locale.ROOT);
                        return !var0.endsWith("<default>")
                           && !var0.endsWith("<skip>")
                           && var0.contains("ctm/")
                           && (var0.contains("optifine") || var0.contains("mcpatcher"));
                     }
                  );
               }

               if (!var11.isEmpty()) {
                  RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var12 = this.RHOOHCHRHHCRRCICHHHCHOORCIHROC
                     .computeIfAbsent(var10, var0 -> new RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH());
                  int var13 = 0;

                  for (String var15 : var11) {
                     if (!var12.ROHCCIOCCRCRHICCOIIHORHIROIHCH.containsKey(var15)) {
                        var12.ROHCCIOCCRCRHICCOIIHORHIROIHCH
                           .put(
                              var15,
                              new RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var6.bridge$getMethod(), var13)
                           );
                     }

                     var13++;
                  }
               }
            }
         }
      }
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String[] var1, Set<String> var2, @Nullable Predicate<String> var3) {
      if (var1 != null) {
         for (String var7 : var1) {
            if (var7 != null && (var3 == null || var3.test(var7))) {
               if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
                  RCIROOOOICRHCCRRCIORHHIRCOIIIC var8 = RCIROOOOICRHCCRRCIORHHIRCOIIIC.create(var7);
                  String var9 = var8.bridge$getPath();
                  if (var9.startsWith("textures/")) {
                     var9 = var9.substring("textures/".length());
                  }

                  if (!var9.contains("/")) {
                     var9 = (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION > 5 ? "block/" : "blocks/") + var9;
                  }

                  if (var9.endsWith(".png")) {
                     var9 = var9.substring(0, var9.length() - ".png".length());
                  }

                  var7 = var8.bridge$getDomain() + ":" + var9;
               }

               var2.add(var7);
            }
         }
      }
   }

   private static class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
      private LinkedHashSet<String> CCHIIOCHHIHOIRIOCOCCHCHCRICHOH = null;
      private Set<String> CHRRIOHICRRRRHORCRICORRIOIIHIO = null;
   }

   public static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      private final Map<String, RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> ROHCCIOCCRCRHICCOIIHORHIROIHCH = new HashMap<>();

      public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH IIORRHCROCRRCCIIOHOICORIROIOCH(
         String var1
      ) {
         RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = this.ROHCCIOCCRCRHICCOIIHORHIROIHCH.get(var1);
         return var2 == null
            ? com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.NONE
            : var2.HIRCIHIOOIRCRCCRHRCCIHRIOHHOOO;
      }

      public boolean HCCHICOOHHCOOIRCHRCRICOCRIHHHC(String var1) {
         return this.ROHCCIOCCRCRHICCOIIHORHIROIHCH.containsKey(var1);
      }

      public int HHCHCOIHCIIROIOIOCHOOORRCOIHCI(String var1) {
         RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = this.ROHCCIOCCRCRHICCOIIHORHIROIHCH.get(var1);
         return var2 == null ? -1 : var2.OIHORORCIIRIRHOCHRIIIIRIICIHOI;
      }

      public Set<String> OOHROHROHCOOHOCHOHCOIHCRROHCII() {
         return this.ROHCCIOCCRCRHICCOIIHORHIROIHCH.keySet();
      }

      private record RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
         private final com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HIRCIHIOOIRCRCCRHRCCIHRIOHHOOO;
         private final int OIHORORCIIRIRHOCHRIIIIRIICIHOI;

         private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1, int var2
         ) {
            this.HIRCIHIOOIRCRCCRHRCCIHRIOHHOOO = var1;
            this.OIHORORCIIRIRHOCHRIIIIRIICIHOI = var2;
         }

         public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HRRHHOHHICRCIHIHORCCOOHICRRIIC() {
            return this.HIRCIHIOOIRCRCCRHRCCIHRIOHHOOO;
         }

         public int IICICOCRICCCRRICIHOIIRCICRRCOC() {
            return this.OIHORORCIIRIRHOCHRIIIIRIICIHOI;
         }
      }
   }
}
