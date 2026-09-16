package com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.google.common.base.CaseFormat;
import com.google.protobuf.Message;
import com.lunarclient.apollo.modsetting.v1.InstalledModsRequest;
import com.lunarclient.apollo.modsetting.v1.InstalledModsResponse;
import com.lunarclient.apollo.modsetting.v1.Mod;
import com.lunarclient.apollo.modsetting.v1.ModGroup;
import com.lunarclient.apollo.option.Option;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.CORCOCICIRIOHROHROIIOOHICCHCRR;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HICRRICCHCCROOHHCHOCOCCHOIHHOC;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IHHCHHHCRIHOOCOIOOCRIIICIOROIR;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HCHRIROHHHCORIOCROOCHRCIOROOCI;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.OHHRIOHROOIHOROCIRHCHORIHRRRRI;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.CRICCOOHHHCHOORCICOCOHIHOIRHOO;
import com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.IOIICIRIICICIIOORHCIIIIRRIHRHI;
import com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;
import com.moonsworth.lunar.client.OHHRIOHROOIHOROCIRHCHORIHRRRRI.CRRRICCRROCOHHOHIICIHORCOORRRH;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.ichor.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;
import com.moonsworth.lunar.ichor.api.IchorAPI;
import io.leangen.geantyref.GenericTypeReflector;
import java.awt.Color;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import lombok.Generated;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.VisibleForTesting;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   extends com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   implements CRRRICCRROCOHHOHIICIHORCOORRRH {
   private Set<com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH> RHCIOICOCCCHCRICOCOOCIHHHHRRCO;
   private Set<com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH> RCCHCOHCIIHRIHCIROHOCRRRRCOHOH;
   private int RORRRCRCRHOROCOOCRCIIHOIIOHOHO = 20;
   private final IRCIIHHICIHRCOCRROCOICRIHHCCHH IIRROICRRIIIIHICIHIOOHIOOOHIRI = new IRCIIHHICIHRCOCRROCOICRIHHCCHH();

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      super("mod_setting", "Mod Setting");
      this.handle(
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class,
         this::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
      );
      this.handle(IOIICIRIICICIIOORHCIIIIRRIHRHI.class, this::IRCIIHHICIHRCOCRROCOICRIHHCCHH);
      this.handle(
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRRRICCRROCOHHOHIICIHORCOORRRH.class,
         this::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
      );
   }

   @Override
   public Collection<Option<?, ?, ?>> IOHHOCRCCCIRHRCORCRCCCOCIOCCRH() {
      return IRCIIHHICIHRCOCRROCOICRIHHCCHH.OROOOOIRRCHIOROCROIOOOIROOICIO.getModSettingsOptions();
   }

   @Override
   public Set<Class<? extends Message>> CRCHOOOCICHCRCCCCRORHRICCOCHCI() {
      return Set.of(InstalledModsRequest.class);
   }

   @Override
   protected void onDisable() {
      this.CCIOHRRCIROCHOORCRCRHRORIOOOOO();
   }

   @Override
   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(InstalledModsRequest.class, this::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH);
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(InstalledModsRequest var1) {
      List var2 = ((OOROOCCIRCCRHOIOIORIHCHHOOCCOR)IchorAPI.getPipeline(com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class).orElseThrow())
         .OICHHOCICHCIIOCHRIIRRHRHRIIIIR()
         .toList();
      byte var3 = 100;
      int var4 = Math.max(1, (int)Math.ceil((double)var2.size() / var3));

      for (int var5 = 0; var5 < var4; var5++) {
         int var6 = var5 * var3;
         int var7 = Math.min(var6 + var3, var2.size());
         List var8 = var2.subList(var6, var7);
         Map var9 = var8.stream()
            .collect(
               Collectors.groupingBy(
                  this::CRRRICCRROCOHHOHIICIHORCOORRRH, LinkedHashMap::new, Collectors.mapping(this::RRCRRCORICCHOHHIRCHIROOHIIOHCO, Collectors.toList())
               )
            );
         List var10 = var9.entrySet()
            .stream()
            .map(var0 -> ModGroup.newBuilder().setType((ModGroup.Type)var0.getKey()).addAllMods((Iterable<? extends Mod>)var0.getValue()).build())
            .toList();
         InstalledModsResponse var11 = InstalledModsResponse.newBuilder()
            .setRequestId(var1.getRequestId())
            .setPage(var5)
            .setTotalPages(var4)
            .addAllModGroups(var10)
            .build();
         this.sendPacket(var11);
      }
   }

   private ModGroup.Type CRRRICCRROCOHHOHIICIHORCOORRRH(com.moonsworth.lunar.ichor.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1) {
      boolean var2 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.getMinecraftVersion().OOICHHIHHIHROCCRRRIIIIRIRICCIH();
      if (var2) {
         return var1.CRICCOOHHHCHOORCICOCOHIHOIRHOO() ? ModGroup.Type.TYPE_FABRIC_INTERNAL : ModGroup.Type.TYPE_FABRIC_EXTERNAL;
      } else {
         return var1.CRICCOOHHHCHOORCICOCOHIHOIRHOO() ? ModGroup.Type.TYPE_FORGE_INTERNAL : ModGroup.Type.TYPE_FORGE_EXTERNAL;
      }
   }

   private Mod RRCRRCORICCHOHHIRCHIROOHIIOHCO(com.moonsworth.lunar.ichor.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1) {
      Mod.Builder var2 = Mod.newBuilder().setId(var1.getId());
      if (var1.getVersion() != null) {
         var2.setVersion(var1.getVersion());
      }

      return var2.build();
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1
   ) {
      Option var2 = var1.getOption();
      Object var3 = var1.getValue();
      if (!(
         this.getOptions() instanceof com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4
            && var4.OICIRICHOHHIIHIRRRROORCRRRCORH(var2.getKey()).isEmpty()
      )) {
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var3);
      }
   }

   private void IRCIIHHICIHRCOCRROCOICRIHHCCHH(IOIICIRIICICIIOORHCIIIIRRIHRHI var1) {
      if (this.RCCHCOHCIIHRIHCIROHOCRRRRCOHOH != null) {
         if (this.RHCIOICOCCCHCRICOCOOCIHHHHRRCO != null && this.RCCHCOHCIIHRIHCIROHOCRRRRCOHOH.containsAll(this.RHCIOICOCCCHCRICOCOOCIHHHHRRCO)) {
            this.RCCHCOHCIIHRIHCIROHOCRRRRCOHOH = null;
         } else if (this.RORRRCRCRHOROCOOCRCIIHOIIOHOHO > 0) {
            this.RORRRCRCRHOROCOOCRCIIHOIIOHOHO--;
         } else {
            Set var2 = this.RCCHCOHCIIHRIHCIROHOCRRRRCOHOH;
            this.CCIOHRRCIROCHOORCRCRHRORIOOOOO();
            if (!IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
               .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
               .HRIICOIOIIIIRIHHOICRHOIIRCIRIC()) {
               List var3 = var2.stream().filter(var0 -> {
                  CORCOCICIRIOHROHROIIOOHICCHCRR var1x = var0.IHCRORHRORIICHRHRCHRRIRRHHOCOO(HICRRICCHCCROOHHCHOCOCCHOIHHOC.IRIIIRORRHRROOOIRHROOOIIHIHIRH);
                  return var1x == null ? true : var1x.OCIOICIOHHHIRIOCIHCHHCCHRRRIHI().map(HCHRIROHHHCORIOCROOCHRCIOROOCI::get).orElse(true);
               }).map(var0 -> {
                  RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var1x = var0.IHCRORHRORIICHRHRCHRRIRRHHOCOO(HICRRICCHCCROOHHCHOCOCCHOIHHOC.RRIIOCRCRHHRORCROHRRIOCCHROORO);
                  return var1x != null ? var1x.getName() : var0.getId();
               }).toList();
               Serializable var4 = String.join(", ", var3);
               if (!var4.isEmpty()) {
                  String var5 = this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI("mods-disabled-message", RRCRRCORICCHOHHIRCHIROOHIIOHCO.RED + var4);
                  HRCHROOHRIHCRCRHRIIROCIRHOIRHH var6 = new HRCHROOHRIHCRCRHRIIROCIRHOIRHH(
                     com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CORCOCICIRIOHROHROIIOOHICCHCRR.HRHHRRCOCICRHCICOOCORCORIIRRHO,
                     RRCRRCORICCHOHHIRCHIROOHIIOHCO.RED + "Mods Disabled",
                     var5
                  );
                  var6.ORCOCORROHIROCCIORORRRRCHIOOCH(5000L);
                  IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
                     .bridge$submit(
                        () -> IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                           .IHCHHRRIIIORORCHIICIIOORCOIOIO()
                           .IRCIIHHICIHRCOCRROCOICRIHHCCHH(var6)
                     );
               }
            }
         }
      }
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRRRICCRROCOHHOHIICIHORCOORRRH var1
   ) {
      this.RHCIOICOCCCHCRICOCOOCIHHHHRRCO = null;
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Option<?, ?, ?> var1, Object var2) {
      String[] var3 = var1.getPath();
      String var4 = var3[0];
      String var5 = var3[1];
      Object var6 = var2 instanceof String var7 ? RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var7) : var2;
      IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .OHHRCRIOOCIORORHIOHRICRHHORCIH()
         .stream()
         .filter(var1x -> var4.equalsIgnoreCase(CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.LOWER_HYPHEN, var1x.getId())))
         .forEach(
            var5x -> {
               if (var5.equalsIgnoreCase("ENABLED")) {
                  this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5x, var6);
               } else {
                  this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5x, var5, var6);
               }

               com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                  "[Apollo] [Mod Settings] %s.%s updated to '%s'", var4, var5, var2
               );
            }
         );
      IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .CIRCCCHCCCROROIIOIHIOROIHCHRCH()
         .OOROOCCIRCCRHOIOIORIHCHHOOCCOR(this.getId(), var5 + ":" + var2);
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1, Object var2) {
      com.moonsworth.lunar.client.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH var3 = var1.IHCRORHRORIICHRHRCHRRIRRHHOCOO(
         HICRRICCHCCROOHHCHOCOCCHOIHHOC.IOCHHHIIRIHOIRHHICHICCRIHOIOHC
      );
      if (var3 != null) {
         var3.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var1,
            com.moonsworth.lunar.client.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.SERVER,
            (Boolean)var2
         );
      }

      if (var2 == Boolean.FALSE) {
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1);
      }
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1, String var2, Object var3
   ) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO var4 = var1.IHCRORHRORIICHRHRCHRRIRRHHOCOO(
         HICRRICCHCCROOHHCHOCOCCHOIHHOC.IICCRHIHRIHOHICHCRIROICOICROOR
      );
      if (var4 != null) {
         for (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var6 : var4.getChildren()) {
            if (var2.equalsIgnoreCase(CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_HYPHEN, var6.getId()))) {
               HCHRIROHHHCORIOCROOCHRCIOROOCI var7 = var6.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH(HICRRICCHCCROOHHCHOCOCCHOIHHOC.IRIIIRORRHRROOOIRHROOOIIHIHIRH)
                  .flatMap(CORCOCICIRIOHROHROIIOOHICCHCRR::OCIOICIOHHHIRIOCIHCHHCCHRRRIHI)
                  .orElse(null);
               this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  var6, var7, var6.IHCRORHRORIICHRHRCHRRIRRHHOCOO(HICRRICCHCCROOHHCHOCOCCHOIHHOC.IOCHHHIIRIHOIRHHICHICCRIHOIOHC), var3
               );
            }
         }
      }

      IHHCHHHCRIHOOCOIOOCRIIICIOROIR var8 = var1.IHCRORHRORIICHRHRCHRRIRRHHOCOO(HICRRICCHCCROOHHCHOCOCCHOIHHOC.IRHCCHCRHIHOCRICOHOIICHCHOHICC);
      if (var8 != null) {
         var8.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            var3x -> {
               com.moonsworth.lunar.client.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH var4x = var3x.IHCRORHRORIICHRHRCHRRIRRHHOCOO(
                  CRICCOOHHHCHOORCICOCOHIHOIRHOO.COIIHHRHOCRHHHCICCIHOHHOCICORR
               );
               if (var4x != null && !var3x.ICICIOCHHHIHOCHCOHORIHRCOHHOCR(CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRROHCRHORRICIOHCIIHHHORHHHHHH)) {
                  String var5 = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_HYPHEN, var3x.getId());
                  if (var2.equalsIgnoreCase(var5)) {
                     this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3x, var3x, var4x, var3);
                  }
               }

               return false;
            }
         );
      }
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      Object var1, @Nullable HCHRIROHHHCORIOCROOCHRCIOROOCI var2, @Nullable CRRRICCRROCOHHOHIICIHORCOORRRH var3, Object var4
   ) {
      if (var3 != null) {
         if (var4 == null) {
            var3.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               var1, com.moonsworth.lunar.client.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.SERVER, null
            );
         } else {
            if (var2 != null) {
               var3.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  var1, com.moonsworth.lunar.client.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.SERVER, var4
               );
            }
         }
      }
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1) {
      Set var2 = this.RCCHCOHCIIHRIHCIROHOCRRRRCOHOH == null ? new HashSet() : this.RCCHCOHCIIHRIHCIROHOCRRRRCOHOH;
      if (var2.add(var1)) {
         this.RCCHCOHCIIHRIHCIROHOCRRRRCOHOH = var2;
      }
   }

   private void CCIOHRRCIROCHOORCRCRHRORIOOOOO() {
      if (this.RCCHCOHCIIHRIHCIROHOCRRRRCOHOH != null && !this.RCCHCOHCIIHRIHCIROHOCRRRRCOHOH.isEmpty()) {
         this.RHCIOICOCCCHCRICOCOOCIHHHHRRCO = this.RCCHCOHCIIHRIHCIROHOCRRRRCOHOH;
      }

      this.RCCHCOHCIIHRIHCIROHOCRRRRCOHOH = null;
      this.RORRRCRCRHOROCOOCRCIIHOIIOHOHO = 20;
   }

   @Override
   public String getLanguagePath() {
      return "settings";
   }

   @VisibleForTesting
   public static Object RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Option<?, ?, ?> var0, String var1) {
      if (!Color.class.isAssignableFrom(GenericTypeReflector.erase(var0.getTypeToken().getType()))) {
         return var1;
      }

      try {
         return OHHRIOHROOIHOROCIRHCHORIHRRRRI.ORIIHHHCORIRHRRHHIIHORHIRRCRHH(var1);
      } catch (NumberFormatException var3) {
         return var1;
      }
   }

   @Generated
   public IRCIIHHICIHRCOCRROCOICRIHHCCHH ORRIOOIROHHROIRCIIHIOOCIOOIIOO() {
      return this.IIRROICRRIIIIHICIHIOOHIOOOHIRI;
   }
}
