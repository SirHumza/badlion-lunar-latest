package com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.ImmutableList;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.lunarclient.adventure.pattern.ComponentPattern;
import com.lunarclient.adventure.transform.ComponentTransform;
import com.lunarclient.adventure.transform.ComponentTransformer;
import com.lunarclient.adventure.transform.transformation.TransformationAction;
import com.lunarclient.adventure.transform.transformation.TransformationFunctor;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.event.ClickEvent;
import com.moonsworth.lunar.lib.adventure.text.event.HoverEvent;
import io.netty.util.internal.ConcurrentSet;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lombok.Generated;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class IIHRHCCOOHOOOOCHRRCOROOIOHCOOO
   extends com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.IRCIIHHICIHRCOCRROCOICRIHHCCHH<com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH>
   implements com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH,
   com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH,
   com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private static final String RIIRCIRCRHHCRRRHIHRORRIOHOHIRH = "waypoint-patterns.json";
   private static final String OOHCRIIRORHHIRIOIIIHCROHRCOOHC = "/lc_waypoint_chat";
   private final List<com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> decoders = ImmutableList.of(
      new com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         "Badlion Client", "logo/badlion-logo-32x32.png"
      ),
      new com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         "JourneyMap"
      ),
      new com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         "VoxelMap"
      ),
      new com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         "Xaero's Minimap"
      ),
      new com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         "Skytils", "logo/skytils-logo-32x32.png"
      ),
      new com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         "Coleweight"
      )
   );
   private int RORRRHIIHIOHHIIRCICIHHORCHOIOH = 0;
   private static final ComponentTransform IICCHCHOHHOOIOCRHHOCOOICHHOIRH = ComponentTransform.builder()
      .textTransformation(
         new TransformationFunctor(
            TransformationAction.MODIFY,
            (var0, var1) -> var0 != null
               ? var1.hoverEvent(
                     HoverEvent.showText(
                        Component.text(
                           IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                              .CCHHHHCICRCCCIOOIOICOOCRCRHCCR()
                              .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("features.WAYPOINTS.info", "clickToCreate")
                        )
                     )
                  )
                  .clickEvent(ClickEvent.runCommand("/lc_waypoint_chat [" + var0.group(1) + ", " + var0.group(2) + ", " + var0.group(3) + "]"))
               : var1
         )
      )
      .build();
   private final com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH ICHIRIIHIICRRRIIRRRRICCHIOCOIC = new com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH();
   private final List<ComponentTransformer> IRCOCHCIHCIRHICHHOCOIOOOIOHHHH = new ArrayList<>();
   private final List<Pattern> ICOIROHIIOCCRCHRRORHHRCHIOOORC = new ArrayList<>();
   private final BiMap<String, Integer> CICORRCHIIHIHIHCICHOHIHRICRRHC = HashBiMap.create(4);
   private final AtomicInteger OHCOOICHCCOROCCHCIRCORIOIICOIR = new AtomicInteger(1);
   private final Set<com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.IRCIIHHICIHRCOCRROCOICRIHHCCHH> IOICRHOHRIOIROHRHORRICOOHRRRIO = new ConcurrentSet();
   private String OORCOIOCOIROHROHHRHCIIRCIOOOCR;

   @Override
   protected Set<com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> ORRHHOHHRICCROHHICIOOHOOCRRRCC() {
      return new ConcurrentSet();
   }

   @Override
   public String OCHOCOHHHIOCRIOIOOIHOHRIIIHHOC() {
      return "waypoints.json";
   }

   @Override
   public void init() {
      super.init();
      this.OHRRCRHHCOHOHHCORRROHROOCOCCHH();
      this.handle(
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.class,
         var0 -> {
            if (IICCOOCHCHROORHHIIHROHCCRHRCOR.RIIOCICROIOIORIIRIICORCHHRIIRH() != null
               && var0.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                     .HHHIHROORHHOOCCOOCHRIRHRHCRHIH()
                     .IICHHHOHHCOHRCHHRICRHRHCCCIHCR()
                     .RCHOCHHRCIHIRCOHICICROOIHIIIRI()
               )) {
               com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ROCOCHICHORROOHCHOCIIICOHCHIOC()
                  .IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                     com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIORCOORRIOCRORCRCCOHRIHHHOOH
                  );
            }
         }
      );
      this.handle(
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CORCOCICIRIOHROHROIIOOHICCHCRR.CIOHHCORHRCCRICCCORIHCRHCCCRRR.class,
         var1 -> {
            this.OORCOIOCOIROHROHHRHCIIRCIOOOCR = var1.OCHHROCHHOCHCCCHRHICROHCHROCCC();
            this.ROCICHCCIOIRRROHCCOORRCIHOCCHH();
         }
      );
      this.handle(
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.class,
         var1 -> this.ROCICHCCIOIRRROHCCOORRCIHOCCHH()
      );
      this.handle(
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRRRICCRROCOHHOHIICIHORCOORRRH.class,
         var1 -> this.ROCICHCCIOIRRROHCCOORRCIHOCCHH()
      );
      this.handle(
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.class,
         var1 -> this.ROCICHCCIOIRRROHCCOORRCIHOCCHH()
      );
      this.handle(
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.class,
         this::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
      );
      this.handle(
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class,
         this::IRCIIHHICIHRCOCRROCOICRIHHCCHH
      );
      this.handle(
         com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.class,
         var1 -> {
            com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.HHCCIRHCCCIIRHCROHIORHIRHHIORH var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
               .IHCOOOOCIIRCCCCCOCCHICRHCRICIO();
            if (var2.isEnabled() && var2.ROHCCOIHHICOOHHOHOCRIRIHIHOCHC().get()) {
               Component var3 = var1.OIOORCCOCHRRIRRORRICOCOCROICII();

               for (ComponentTransformer var5 : this.IRCOCHCIHCIRHICHHOCOIOOOIOHHHH) {
                  var3 = var5.transform(var3);
               }

               var1.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var3);
            }
         }
      );
      this.HIIROCRCCHRRCIOHIIICROOHICOIHI();
   }

   private void ROCICHCCIOIRRROHCCOORRCIHOCCHH() {
      this.CICORRCHIIHIHIHCICHOHIHRICRRHC.clear();
      this.CICORRCHIIHIHIHCICHOHIHRICRRHC.putIfAbsent("minecraft:overworld", 0);
      this.CICORRCHIIHIHIHCICHOHIHRICRRHC.putIfAbsent("minecraft:the_nether", -1);
      this.CICORRCHIIHIHIHCICHOHIHRICRRHC.putIfAbsent("minecraft:the_end", 1);
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.RIIOCICROIOIORIIRIICORCHHRIIRH() != null) {
         int var1 = IICCOOCHCHROORHHIIHROHCCRHRCOR.RIIOCICROIOIORIIRIICORCHHRIIRH().bridge$getDimensionId();
         if (var1 < -1 || var1 > 1) {
            this.CICORRCHIIHIHIHCICHOHIHRICRRHC.putIfAbsent(IICCOOCHCHROORHHIIHROHCCRHRCOR.RIIOCICROIOIORIIRIICORCHHRIIRH().bridge$getDimensionKey(), var1);
         }
      }

      this.ICHIRIIHIICRRRIIRRRRICCHIOCOIC.IIHRRHORCRCROCHHOHORCHCROCIHRO("server", HIRHRIOCOCCCORCRICIICOIIIOCOHI());
      this.ICHIRIIHIICRRRIIRRRRICCHIOCOIC.IIHRRHORCRCROCHHOHORCHCROCIHRO("loadedWorld", this.OORCOIOCOIROHROHHRHCIIRCIOOOCR);
      JsonObject var4 = new JsonObject();

      for (Entry var3 : this.CICORRCHIIHIHIHCICHOHIHRICRRHC.entrySet()) {
         var4.addProperty((String)var3.getKey(), (Number)var3.getValue());
      }

      this.ICHIRIIHIICRRRIIRRRRICCHIOCOIC.IIHRRHORCRCROCHHOHORCHCROCIHRO("knownDimensions", var4);
   }

   private void HIIROCRCCHRRCIOHIIICROOHICOIHI() {
      JsonObject var1 = this.HHCCIRHCCCIIRHCROHIORHIRHHIORH("waypoint-patterns.json", JsonObject.class);
      if (var1 != null) {
         for (Entry var3 : var1.entrySet()) {
            Pattern var4 = Pattern.compile(((JsonElement)var3.getValue()).getAsString(), 2);
            this.ICOIROHIIOCCRCHRRORHHRCHIOOORC.add(var4);
            this.IRCOCHCIHCIRHICHHOCOIOOOIOHHHH
               .add(
                  ComponentTransformer.of(
                     ComponentPattern.builder().componentPredicate(var0 -> var0.clickEvent() == null).pattern(var4).build(), IICCHCHOHHOOIOCRHHOCOOICHHOIRH
                  )
               );
         }
      }
   }

   @Override
   public void close() {
      this.HRIIIOIIRHOHORIRICIOIORRIRCHHO();
   }

   public boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1,
      boolean var2
   ) {
      for (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 : this.OHHRCRIOOCIORORHIOHRICRHHORCIH()) {
         if (var1.getName().equals(var4.getName()) && var1.getServer().equals(var4.getServer()) && var1.HRICIORORHCRHCCCIIIHRRHCICOHOR(var4.getWorld())) {
            return false;
         }
      }

      this.OHHRCRIOOCIORORHIOHRICRHHORCIH().add(var1);
      if (var1.OROOCROHOROOHHICIHIRHCOCRORIHR() != null && !var1.OROOCROHOROOHHICIHIRHCOCRORIHR().isEmpty()) {
         this.CICORRCHIIHIHIHCICHOHIHRICRRHC.putIfAbsent(var1.OROOCROHOROOHHICIHIRHCOCRORIHR(), var1.getDimension());
      }

      if (var1.OHOHROCCIROORCCCIOOOIOIIHORHOC()) {
         if (var2) {
            this.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var1);
         }
      } else {
         this.HRIIIOIIRHOHORIRICIOIORRIRCHHO();
      }

      this.ROOCCICICICIRCOHOHCOCIHHCCHRII();
      return true;
   }

   public boolean CRRRICCRROCOHHOHIICIHORCOORRRH(
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1
   ) {
      return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, true);
   }

   public void RRCRRCORICCHOHHIRCHIROOHIIOHCO(
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1
   ) {
   }

   public void RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1
   ) {
   }

   public boolean removeIf(
      Predicate<com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> var1
   ) {
      if (this.OHHRCRIOOCIORORHIOHRICRHHORCIH().removeIf(var1)) {
         this.ROOCCICICICIRCOHOHCOCIHHCCHRII();
         return true;
      } else {
         return false;
      }
   }

   public boolean HRCHROOHRIHCRCRHRIIROCIRHOIRHH(@NotNull RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      if (var1.COCHHHRROIHIRCRIOHHIIOCRIIROIR()) {
         return false;
      }

      if (var1.OHOHROCCIROORCCCIOOOIOIIHORHOC()) {
         this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var1);
      }

      return this.removeIf(var1x -> var1x.equals(var1));
   }

   public Optional<IIHRHCCOOHOOOOCHRRCOROOIOHCOOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> IOIHHCIHRHHCIOCROCHCHRHIOHOOIO(String var1) {
      for (Pattern var3 : this.ICOIROHIIOCCRCHRRORHHRCHIOOORC) {
         Matcher var4 = var3.matcher(var1);
         if (var4.matches()) {
            return Optional.of(new IIHRHCCOOHOOOOCHRRCOROOIOHCOOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4.group(1), var4.group(2), var4.group(3)));
         }
      }

      return Optional.empty();
   }

   private void IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1
   ) {
      if (var1.IRCRIHCRIRIRICRCRCROHORIROOOIO("/lc_waypoint_chat")) {
         var1.OHCOROOHHRHOIOCHIOOHIIOHROOCCO();
      }
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH var1
   ) {
      if (var1.IRCRIHCRIRIRICRCRCROHORIROOOIO("/lc_waypoint_chat")) {
         var1.cancel();

         try {
            double var2;
            double var4;
            double var6;
            if (var1.get(0).contains("[")) {
               var2 = Double.parseDouble(var1.get(0).substring(1, var1.get(0).length() - 1));
               var4 = Double.parseDouble(var1.get(1).substring(0, var1.get(1).length() - 1));
               var6 = Double.parseDouble(var1.get(2).substring(0, var1.get(2).length() - 1));
            } else {
               var2 = Double.parseDouble(var1.get(1));
               var4 = Double.parseDouble(var1.get(3));
               var6 = Double.parseDouble(var1.get(5));
            }

            com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ROCOCHICHORROOHCHOCIIICOHCHIOC()
               .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHHICHHOOCORIIICIIHCORRRHCRIC,
                  com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIHRICICCICOROHIHCIIOCOIRRHIH()
                     .IIHRRHORCRCROCHHOHORCHCROCIHRO(var2)
                     .OCOHORHCROHICRRIHCIHHRRCIHICRI(var4)
                     .CIOHHCORHRCCRICCCORIHCRHCCCRRR(var6)
                     .IRIOHIOCOCOICCOICOHROORHOIRHII()
               );
         } catch (Exception var8) {
         }
      }
   }

   @Override
   public void load(JsonObject var1) {
      this.OHHRCRIOOCIORORHIOHRICRHHORCIH().clear();
      this.IOICRHOHRIOIROHRHORRICOOHRRRIO.clear();
      boolean var2 = com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            this, var1
         )
         && this.RROCHHOICHHIRRHICHORHRCOHCROHI();
      if (var1.has("sortIndex")) {
         this.OCRHORIRHHHIIOCOOCHICOOCIHORCC(var1.get("sortIndex").getAsInt());
      }

      if (var1.has("totalDeaths")) {
         this.OHCOOICHCCOROCCHCIRCORIOIICOIR.set(var1.get("totalDeaths").getAsInt());
      }

      if (var1.has("groups")) {
         this.OHRRHHOCROROCCIRROIHOCCHCIHCIR(var1.getAsJsonObject("groups"));
      }

      if (var1.has("waypoints")) {
         for (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 : this.HRRHRCCOOIOIIIRORIOOORORHOORIH(
            var1
         )) {
            this.CRRRICCRROCOHHOHIICIHORCOORRRH(var4);
         }

         if (var2) {
            this.RHHIIRORCOIORHIOHRHCIHRHHIRCRH(true);
         }

         this.ROOCCICICICIRCOHOHCOCIHHCCHRII();
      }
   }

   public List<com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> HRRHRCCOOIOIIIRORIOOORORHOORIH(
      JsonObject var1
   ) {
      ArrayList var2 = new ArrayList();

      try {
         for (Entry var4 : var1.get("waypoints").getAsJsonObject().entrySet()) {
            String var5 = (String)var4.getKey();
            JsonObject var6 = ((JsonElement)var4.getValue()).getAsJsonObject();

            for (Entry var8 : var6.entrySet()) {
               String var9 = (String)var8.getKey();
               JsonObject var10 = ((JsonElement)var8.getValue()).getAsJsonObject();

               for (Entry var12 : var10.entrySet()) {
                  JsonObject var13 = ((JsonElement)var12.getValue()).getAsJsonObject();
                  JsonObject var14 = var13.getAsJsonObject("location");
                  JsonElement var15 = var13.get("addedAtMs");
                  JsonElement var16 = var13.get("isSkyBlockWaypoint");
                  JsonElement var17 = var13.get("isDeathWaypoint");
                  JsonElement var18 = var13.get("skyBlockLocation");
                  JsonElement var19 = var13.get("sortIndex");
                  JsonElement var20 = var13.get("groupIndex");
                  JsonElement var21 = var13.get("groupId");
                  com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.CRRRICCRROCOHHOHIICIHORCOORRRH var22 = new com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.CRRRICCRROCOHHOHIICIHORCOORRRH();
                  var22.load(var13.get("renderConfig").getAsJsonObject());
                  com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var23 = com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CIROORIICIROCCOIROCRIRCCRHCIOI()
                     .RICRIHOOHROHICCHHIIHRHCORHIOHR(var15 == null ? 0L : var15.getAsLong())
                     .RRHCHIHOIRICOICHIHOIRIOHHRHOOI((String)var12.getKey())
                     .OCOHORHCROHICRRIHCIHHRRCIHICRI(
                        com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.CRHROHHHCIHHCOHCOORCRIHHIICROR.IHHCHHHCRIHOOCOIOOCRIIICIOROIR(
                           var14.get("x").getAsDouble(), var14.get("y").getAsDouble(), var14.get("z").getAsDouble()
                        )
                     )
                     .ICOHOCROHOHHHCCOCIHHRHOCOOCOCC(var9)
                     .RCOROOHHCORIRCRHOHRCCIHRCORCHH(var13.get("dimension").getAsInt())
                     .RICCICOHIICIIORHCHCRCRHOOOCHIC(var16 != null && var16.getAsBoolean())
                     .RCOROOHHCORIRCRHOHRCCIHRCORCHH(var17 != null && var17.getAsBoolean())
                     .RRCRRCORICCHOHHIRCHIROOHIIOHCO(
                        var18 != null
                           ? com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.CRRRICCRROCOHHOHIICIHORCOORRRH.getByMapValue(
                              var13.get("skyBlockLocation").getAsString()
                           )
                           : com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.CRRRICCRROCOHHOHIICIHORCOORRRH.NONE
                     )
                     .RRROCCOIROROHIRRHOHIRRIHOCIIRO(var19 == null ? -1 : var19.getAsInt())
                     .RRROCCOIROROHIRRHOHIRRIHOCIIRO(var13.get("visible").getAsBoolean())
                     .HRIOHRORCHIICCICIHRIIHHCHHOHHO(var5)
                     .OOCHIIROORIOCCCCCOORRIRIOHOORH(false)
                     .IRCIIHHICIHRCOCRROCOICRIHHCCHH(var22)
                     .OIHHRHHICRCHRIORRIHHOICCHCCRRR();
                  if (var21 != null) {
                     this.OCRCHRHOCCHCHRCORHIHRRRRHCHHCH(UUID.fromString(var21.getAsString())).ifPresent(var23::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH);
                  }

                  if (var20 != null) {
                     var23.RICCICOHIICIIORHCHCRCRHOOOCHIC(var20.getAsInt());
                  }

                  if (var13.has("dimensionKey")) {
                     var23.HCOIIHHORCOIHOICRIRICICHICOCCI(var13.get("dimensionKey").getAsString());
                  }

                  var2.add(var23);
               }
            }
         }
      } catch (Exception var24) {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
            "Error while loading waypoints: " + var24
         );
         var24.printStackTrace();
      }

      return var2;
   }

   public void OHRRHHOCROROCCIRROIHOCCHCIHCIR(JsonObject var1) {
      try {
         for (Entry var3 : var1.entrySet()) {
            String var4 = (String)var3.getKey();
            JsonObject var5 = ((JsonElement)var3.getValue()).getAsJsonObject();
            com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.IRCIIHHICIHRCOCRROCOICRIHHCCHH var6 = com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
               var4, var5
            );
            this.IOICRHOHRIOIROHRHORRICOOHRRRIO.add(var6);
         }
      } catch (Exception var7) {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
            "Error while loading waypoint groups: " + var7
         );
         var7.printStackTrace();
      }
   }

   public void RCOCRROHHROHHOCRCCCHCIROIIOORC(JsonObject var1) {
      JsonObject var2 = new JsonObject();

      for (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4 : this.IOICRHOHRIOIROHRHORRICOOHRRRIO) {
         JsonObject var5 = new JsonObject();
         var4.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var5);
         var2.add(var4.getId().toString(), var5);
      }

      var1.add("groups", var2);
   }

   @Override
   public void HHCCIRHCCCIIRHCROHIORHIRHHIORH(JsonObject var1) {
      var1.addProperty(
         "version",
         com.moonsworth.lunar.client.CCIHHRIOOOOCOHRCIHOHROOICIORCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OCCRIIOROHCIIOROCCCHOCIHHOOCIH
      );
      var1.addProperty("totalDeaths", this.OHCOOICHCCOROCCHCIRCORIOIICOIR.get());
      var1.addProperty("sortIndex", this.RORRRHIIHIOHHIIRCICIHHORCHOIOH);
      this.RCOCRROHHROHHOCRCCCHCIROIIOORC(var1);
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, this.OHHRCRIOOCIORORHIOHRICRHHORCIH());
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      JsonObject var1,
      Collection<com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> var2
   ) {
      JsonObject var3 = new JsonObject();

      for (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var5 : var2) {
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3, var5);
      }

      var1.add("waypoints", var3);
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      JsonObject var1,
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2
   ) {
      try {
         if (var2.OHOHROCCIROORCCCIOOOIOIIHORHOC()) {
            return;
         }

         JsonObject var3;
         if (!var1.has(var2.getServer())) {
            var3 = new JsonObject();
            var1.add(var2.getServer(), var3);
         } else {
            var3 = var1.get(var2.getServer()).getAsJsonObject();
         }

         JsonObject var4;
         if (!var3.has(var2.getWorld())) {
            var4 = new JsonObject();
            var3.add(var2.getWorld(), var4);
         } else {
            var4 = var3.get(var2.getWorld()).getAsJsonObject();
         }

         JsonObject var5 = new JsonObject();
         JsonObject var6 = new JsonObject();
         var6.addProperty("x", var2.IIHOCOIHHIROCHIHHCCCORRCOHCHRC().bridge$xCoord());
         var6.addProperty("y", var2.IIHOCOIHHIROCHIHHCCCORRCOHCHRC().bridge$yCoord());
         var6.addProperty("z", var2.IIHOCOIHHIROCHIHHCCCORRCOHCHRC().bridge$zCoord());
         var5.add("location", var6);
         var5.addProperty("icon", var2.HOHOIICHHIRIOIIIOHRHOCCRRRRIHR().getIcon().name());
         var5.addProperty("addedAtMs", var2.OHRCHRHOCOOOCOCOICIROHRHOOCOOR());
         var5.addProperty("isDeathWaypoint", var2.CIHCIHRCIHRORRRCHIHHOICIIRRCCC());
         var5.addProperty("visible", var2.isVisible());
         var5.addProperty("dimension", var2.getDimension());
         var5.addProperty("isSkyBlockWaypoint", var2.HOCHOIRIHHHIHIIICOHCOCCOIRCORH());
         var5.addProperty("skyBlockLocation", var2.IICICROIHIRIHRIHROOCORROCCCHRH().getMapValue());
         var5.addProperty("sortIndex", var2.IRIHRHCIRORRRHOHCOICRIOOIOIOIC());
         if (var2.ICOCHHRRHIIHCCOORIOIHCIOCRIICR() != -1) {
            var5.addProperty("groupIndex", var2.ICOCHHRRHIIHCCOORIOIHCIOCRIICR());
         }

         if (var2.OROOCROHOROOHHICIHIRHCOCRORIHR() != null && !var2.OROOCROHOROOHHICIHIRHCOCRORIHR().isEmpty()) {
            var5.addProperty("dimensionKey", var2.OROOCROHOROOHHICIHIRHCOCRORIHR());
         }

         JsonObject var7 = new JsonObject();
         com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.CRRRICCRROCOHHOHIICIHORCOORRRH var8 = var2.HOHOIICHHIRIOIIIOHRHOCCRRRRIHR();
         var8.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var7);
         var5.add("renderConfig", var7);
         if (var2.OROCOOCORHHHRCOHRORIOORCHRHCRR() != null) {
            var5.addProperty("groupId", var2.OROCOOCORHHHRCOHRORIOORCHRHCRR().getId().toString());
         }

         var4.add(var2.getName(), var5);
      } catch (Exception var9) {
      }
   }

   public static String HIRHRIOCOCCCORCRICIICOIIIOCOHI() {
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO var0 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI();
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1 = var0.bridge$getCurrentServerData();
      String var2 = "";
      if (var0.bridge$getWorld() != null && var1 == null) {
         var2 = var2 + "sp:" + IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().HOHHHORIIORRRROHRIIRCHCCICHHCI().OORCOIOCOIROHROHHRHCIIRCIOOOCR;
      } else if (var0.bridge$isConnectedToRealms()) {
         var2 = var2 + "realms";
         if (var1 != null) {
            var2 = var2 + ": " + var1.bridge$getServerName();
         }
      } else if (var0.bridge$getWorld() != null
         && IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().CCRHICOCOHIIRIHCOCIRCHHROHCCRR().OOIRIHORHICIIOIIIRCOROROICCICR()) {
         var2 = var2 + "hostedworld:" + var0.bridge$getWorld().bridge$getWorldId();
      } else if (var1 != null) {
         var2 = var2 + "mp:" + var1.bridge$serverIP();
      }

      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.HHCCIRHCCCIIRHCROHIORHIRHHIORH var3 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .IHCOOOOCIIRCCCCCOCCHICRHCRICIO();
      return var3.HRHOCRICHORRROCRRCIHROHRRCOCRH().RRCRRCORICCHOHHIRCHIROOHIIOHCO("server", var2);
   }

   public void ROOCCICICICIRCOHOHCOCIHHCCHRII() {
      this.ICHIRIIHIICRRRIIRRRRICCHIOCOIC
         .IIHRRHORCRCROCHHOHORCHCROCIHRO("waypoints", this.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(this.OHHRCRIOOCIORORHIOHRICRHHORCIH()));
      JsonArray var1 = new JsonArray();

      for (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 : this.IOICRHOHRIOIROHRHORRICOOHRRRIO) {
         var1.add(var3.HRRORHCRHHRROHIOROOOORRIRRCCIC());
      }

      this.ICHIRIIHIICRRRIIRRRRICCHIOCOIC.IIHRRHORCRCROCHHOHORCHCROCIHRO("groups", var1);
   }

   public JsonObject HRCHROOHRIHCRCRHRIIROCIRHOIRHH(
      Collection<com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> var1
   ) {
      JsonObject var2 = new JsonObject();

      for (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 : var1) {
         try {
            JsonObject var5;
            if (!var2.has(var4.getServer())) {
               var5 = new JsonObject();
               var2.add(var4.getServer(), var5);
            } else {
               var5 = var2.get(var4.getServer()).getAsJsonObject();
            }

            JsonObject var6;
            if (!var5.has(var4.getWorld())) {
               var6 = new JsonObject();
               var5.add(var4.getWorld(), var6);
            } else {
               var6 = var5.get(var4.getWorld()).getAsJsonObject();
            }

            var6.add(var4.getName(), var4.HRRORHCRHHRROHIOROOOORRIRRCCIC());
         } catch (Exception var7) {
         }
      }

      return var2;
   }

   @Nullable
   private <T> T HHCCIRHCCCIIRHCROHIORHIRHHIORH(String var1, Class<T> var2) {
      Path var3 = com.moonsworth.lunar.client.util.IIRHCHHOICHRICOOCRORCCIOOIHOIR.HHIRHHICRHCCHRHIIIOIRRROCRHRIH.resolve(var1);
      if (!var3.toFile().exists()) {
         return null;
      }

      try {
         String var4 = Files.readString(var3);
         return com.moonsworth.lunar.client.util.IIRHCHHOICHRICOOCRORCCIOOIHOIR.ORHHIICRRIOIOHCHHCHHHRCIORCHRI.fromJson(var4, var2);
      } catch (Exception var5) {
         com.moonsworth.lunar.client.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5, "Loading " + var1);
         return null;
      }
   }

   public void OCRHORIRHHHIIOCOOCHICOOCIHORCC(int var1) {
      this.RORRRHIIHIOHHIIRCICIHHORCHOIOH = var1;
      this.ICHIRIIHIICRRRIIRRRRICCHIOCOIC.IIHRRHORCRCROCHHOHORCHCROCIHRO("activeSortIndex", var1);
   }

   public Optional<com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> CRICCOOHHHCHOORCICOCOHIHOIRHOO(
      String var1, String var2, String var3
   ) {
      return this.OHHRCRIOOCIORORHIOHRICRHHORCIH()
         .stream()
         .filter(var3x -> var3x.getName().equals(var3) && var3x.getServer().equals(var1) && var3x.getWorld().equals(var2))
         .findFirst();
   }

   public boolean HHCCIRHCCCIIRHCROHIORHIRHHIORH(
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
   ) {
      if (this.IOICRHOHRIOIROHRHORRICOOHRRRIO.stream().anyMatch(var1x -> var1x.getId().equals(var1.getId()))) {
         return false;
      }

      this.IOICRHOHRIOIROHRHORRICOOHRRRIO.add(var1);
      this.ROOCCICICICIRCOHOHCOCIHHCCHRII();
      this.HRIIIOIIRHOHORIRICIOIORRIRCHHO();
      return true;
   }

   public boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(UUID var1, boolean var2) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 = this.IOICRHOHRIOIROHRHORRICOOHRRRIO
         .stream()
         .filter(var1x -> var1x.getId().equals(var1))
         .findFirst()
         .orElse(null);
      if (var3 == null) {
         return false;
      }

      if (var2) {
         this.OHHRCRIOOCIORORHIOHRICRHHORCIH()
            .removeIf(var1x -> var1x.OROCOOCORHHHRCOHRORIOORCHRHCRR() != null && var1.equals(var1x.OROCOOCORHHHRCOHRORIOORCHRHCRR().getId()));
      } else {
         this.OHHRCRIOOCIORORHIOHRICRHHORCIH()
            .stream()
            .filter(var1x -> var1x.OROCOOCORHHHRCOHRORIOORCHRHCRR() != null && var1.equals(var1x.OROCOOCORHHHRCOHRORIOORCHRHCRR().getId()))
            .forEach(
               var0 -> var0.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.IRCIIHHICIHRCOCRROCOICRIHHCCHH)null
               )
            );
      }

      this.IOICRHOHRIOIROHRHORRICOOHRRRIO.remove(var3);
      this.ROOCCICICICIRCOHOHCOCIHHCCHRII();
      return true;
   }

   public Optional<com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.IRCIIHHICIHRCOCRROCOICRIHHCCHH> OCRCHRHOCCHCHRCORHIHRRRRHCHHCH(
      UUID var1
   ) {
      return this.IOICRHOHRIOIROHRHORRICOOHRRRIO.stream().filter(var1x -> var1x.getId().equals(var1)).findFirst();
   }

   @Generated
   public List<com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> IOCICCICOCORRIOCHHORCHCRCOHHHR() {
      return this.decoders;
   }

   @Generated
   @Override
   public com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH CORROIRHRRIHCRHIROHHORCCHIIRCO() {
      return this.ICHIRIIHIICRRRIIRRRRICCHIOCOIC;
   }

   @Generated
   public BiMap<String, Integer> RCRRICICOOHIROHCIICCIIHOHHCCHC() {
      return this.CICORRCHIIHIHIHCICHOHIHRICRRHC;
   }

   @Generated
   public AtomicInteger CIRORCOCOCIOOIOCOCHRCHHROICORO() {
      return this.OHCOOICHCCOROCCHCIRCORIOIICOIR;
   }

   @Generated
   public Set<com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.IRCIIHHICIHRCOCRROCOICRIHHCCHH> RRRIICCRCRIOHIRIOOCORHCCOHOICR() {
      return this.IOICRHOHRIOIROHRHORRICOOHRRRIO;
   }

   public record RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      private final String RCIRRORHRHRCCCHHRHROICORHRROHH;
      private final String HRORORHOHIHRROICHOOIRHRCHICOOR;
      private final String OOOIHIRIHIRCOHHCICOORRHRCOHORI;

      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, String var2, String var3) {
         this.RCIRRORHRHRCCCHHRHROICORHRROHH = var1;
         this.HRORORHOHIHRROICHOOIRHRCHICOOR = var2;
         this.OOOIHIRIHIRCOHHCICOORRHRCOHORI = var3;
      }

      public String COIIRHIIROIHIIRCCOHROOIHOIIIOR() {
         return this.RCIRRORHRHRCCCHHRHROICORHRROHH;
      }

      public String RCIORIIIOIOOIOHHCOORICRHHIIICH() {
         return this.HRORORHOHIHRROICHOOIRHRCHICOOR;
      }

      public String IHHICHRRHCOROOOIHCHROHIORIOOHR() {
         return this.OOOIHIRIHIRCOHHCICOORRHRCOHORI;
      }
   }
}
