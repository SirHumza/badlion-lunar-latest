package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.authlib.GameProfile;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.IIIIRHIHROIRCROHHROIHIIHRCRRHO;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import org.jetbrains.annotations.NotNull;

public class HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   private static final Map<com.moonsworth.lunar.client.HCHRIROHHHCORIOCROOCHRCIOROOCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH, CRRRICCRROCOHHOHIICIHORCOORRRH> HRRCHIRHIIOCCICCOHOCRIOICHCOIH = new Builder()
      .put(
         com.moonsworth.lunar.client.HCHRIROHHHCORIOCROOCHRCIOROOCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HYPIXEL,
         (CRRRICCRROCOHHOHIICIHORCOORRRH)(var0, var1, var2) -> Objects.equals(
            com.moonsworth.lunar.client.IRRCCOICORICIHCHRHIHIHROIRHOCR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IOHHHHCRRIRRCHHICHOHHIRCIOORRH
               .RRRCHORHHHIHOCIOCRICCOIOOHHCOO()
               .IHRRHOIOOCRCCCRHCOIORCRHHHOOHC,
            var2.IIOHHORCHRCRCHIICIORICHIHRRHIC()
         )
      )
      .build();
   private final Set<IRCIIHHICIHRCOCRROCOICRIHHCCHH> CORIIOOCOIOOOORIRHHIIOHOOHIRRO = new HashSet<>();

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IRCIIHHICIHRCOCRROCOICRIHHCCHH var1, boolean var2) {
      if (var2) {
         this.CORIIOOCOIOOOORIRHHIIOHOOHIRRO.add(var1);
      } else {
         this.CORIIOOCOIOOOORIRHHIIOHOOHIRRO.remove(var1);
      }

      if (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHHOIIOCRHCHHCRORICCOHOHROOIH.CRRRICCRROCOHHOHIICIHORCOORRRH.ORHOIIHOCCIHHCRIHICOIRIOOHRIOR
         )
       {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            "[Markers] Setting team " + var1.id() + ": " + var2
         );
      }
   }

   @NotNull
   public List<UUID> IHRICIIOIHRRCCICRRHIRICOCIHOCH() {
      if (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHHOIIOCRHCHHCRORICCOHOHROOIH.CRRRICCRROCOHHOHIICIHORCOORRRH.ORHOIIHOCCIHHCRIHICOIRIOOHRIOR
         )
       {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            "[Markers] Active teams: " + this.CORIIOOCOIOOOORIRHHIIOHOOHIRRO.stream().map(IRCIIHHICIHRCOCRROCOICRIHHCCHH::id).collect(Collectors.joining(","))
         );
      }

      if (!this.CORIIOOCOIOOOORIRHHIIOHOOHIRRO.isEmpty() && IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH() != null) {
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
            .bridge$getClientPacketListener();
         if (var1 == null) {
            return Collections.emptyList();
         }

         ArrayList var2 = new ArrayList();

         for (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH var4 : var1.bridge$getPlayerInfoMap()) {
            GameProfile var5 = var4.bridge$getGameProfile();
            if (var5 != null) {
               String var6 = var5.getName();
               UUID var7 = var5.getId();
               if (!var7.equals(IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH().bridge$getUniqueID())) {
                  if (IIIIRHIHROIRCROHHROIHIIHRCRRHO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                     var6,
                     var7,
                     com.moonsworth.lunar.client.HCHRIROHHHCORIOCROOCHRCIOROOCI.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                        com.moonsworth.lunar.client.HCHRIROHHHCORIOCROOCHRCIOROOCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HYPIXEL
                     )
                  )) {
                     if (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHHOIIOCRHCHHCRORICCOHOHROOIH.CRRRICCRROCOHHOHIICIHORCOORRRH.ORHOIIHOCCIHHCRIHICOIRIOOHRIOR
                        )
                      {
                        com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                           "[MarkersBroadcast] %s marked as NPC, skipping", var7
                        );
                     }
                  } else if (IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                        .HOOCCHIIOIRIIRRIRHRROHOHHRHROI()
                        .ROCRHIOCHIIOCROIHHOHHROCHCIHCH(var7)
                     == null) {
                     if (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHHOIIOCRHCHHCRORICCOHOHROOIH.CRRRICCRROCOHHOHIICIHORCOORRRH.ORHOIIHOCCIHHCRIHICOIRIOOHRIOR
                        )
                      {
                        com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                           "[MarkersBroadcast] %s not on lunar, skipping", var7
                        );
                     }
                  } else {
                     for (IRCIIHHICIHRCOCRROCOICRIHHCCHH var9 : this.CORIIOOCOIOOOORIRHHIIOHOOHIRRO) {
                        if (var9.getDetectionFunction().check(var4, var5, null)) {
                           if (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHHOIIOCRHCHHCRORICCOHOHROOIH.CRRRICCRROCOHHOHIICIHORCOORRRH.ORHOIIHOCCIHHCRIHICOIRIOOHRIOR
                              )
                            {
                              com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                                 "[Markers] Receiver check success %s %s %s", var9, var7, var6
                              );
                           }

                           var2.add(var7);
                           break;
                        }
                     }
                  }
               }
            } else if (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHHOIIOCRHCHHCRORICCOHOHROOIH.CRRRICCRROCOHHOHIICIHORCOORRRH.ORHOIIHOCCIHHCRIHICOIRIOOHRIOR
               )
             {
               com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                  "[Markers] Marker receivers collection skipped (game profile is null) %s",
                  RRCRRCORICCHOHHIRCHIROOHIIOHCO.getTextContent(var4.bridge$getDisplayName())
               );
            }
         }

         return var2;
      } else {
         return Collections.emptyList();
      }
   }

   public boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1, UUID var2) {
      if (!this.CORIIOOCOIOOOORIRHHIIOHOOHIRRO.isEmpty() && IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH() != null) {
         if (var1.dimension() != this.getDimension()) {
            if (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHHOIIOCRHCHHCRORICCOHOHROOIH.CRRRICCRROCOHHOHIICIHORCOORRRH.ORHOIIHOCCIHHCRIHICOIRIOOHRIOR
               )
             {
               com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                  "[Markers] Marker source dimension check for %s failed! %s, %s", var2, var1.dimension(), this.getDimension()
               );
            }

            return false;
         } else {
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
               .bridge$getClientPacketListener();
            if (var3 == null) {
               return false;
            }

            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH var4 = var3.bridge$getPlayerInfo(
               var2
            );
            if (var4 == null) {
               if (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHHOIIOCRHCHHCRORICCOHOHROOIH.CRRRICCRROCOHHOHIICIHORCOORRRH.ORHOIIHOCCIHHCRIHICOIRIOOHRIOR
                  )
                {
                  com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                     "[Markers] Marker source check failed (player info) %s", var2
                  );
               }

               return false;
            } else {
               GameProfile var5 = var4.bridge$getGameProfile();
               if (var5 == null) {
                  if (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHHOIIOCRHCHHCRORICCOHOHROOIH.CRRRICCRROCOHHOHIICIHORCOORRRH.ORHOIIHOCCIHHCRIHICOIRIOOHRIOR
                     )
                   {
                     com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                        "[Markers] Marker source check failed (game profile) %s", var2
                     );
                  }

                  return false;
               } else {
                  IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().ORHHIORCCIOHCRRHOCHCHORIHHROOO();
                  com.moonsworth.lunar.client.HCHRIROHHHCORIOCROOCHRCIOROOCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var6 = com.moonsworth.lunar.client.HCHRIROHHHCORIOCROOCHRCIOROOCI.CRRRICCRROCOHHOHIICIHORCOORRRH.HCOORICOHCCRCCHCRCOCORIOCCIRIC();
                  if (var6 != null) {
                     CRRRICCRROCOHHOHIICIHORCOORRRH var7 = HRRCHIRHIIOCCICCOHOCRIOICHCOIH.get(var6);
                     if (var7 != null && !var7.check(var4, var5, var1)) {
                        if (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHHOIIOCRHCHHCRORICCOHOHROOIH.CRRRICCRROCOHHOHIICIHORCOORRRH.ORHOIIHOCCIHHCRIHICOIRIOOHRIOR
                           )
                         {
                           com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                              "[Markers] Extra check for %s failed! %s, %s", var6, var2, var1.IOHOOIOHCHICOCHIICHCICCOHRCIII()
                           );
                        }

                        return false;
                     }
                  }

                  for (IRCIIHHICIHRCOCRROCOICRIHHCCHH var8 : var1.CHRRHRHRIROHIHRRCCHRIHHCIHIIRO()) {
                     if (var8.getDetectionFunction().check(var4, var5, var1)) {
                        if (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHHOIIOCRHCHHCRORICCOHOHROOIH.CRRRICCRROCOHHOHIICIHORCOORRRH.ORHOIIHOCCIHHCRIHICOIRIOOHRIOR
                           )
                         {
                           com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                              "[Markers] Team check %s success %s, %s", var8.name(), var2, var1.IOHOOIOHCHICOCHIICHCICCOHRCIII()
                           );
                        }

                        return true;
                     }
                  }

                  if (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHHOIIOCRHCHHCRORICCOHOHROOIH.CRRRICCRROCOHHOHIICIHORCOORRRH.ORHOIIHOCCIHHCRIHICOIRIOOHRIOR
                     )
                   {
                     com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                        "[Markers] All %s team checks failed for %s, %s",
                        var1.CHRRHRHRIROHIHRRCCHRIHHCIHIIRO().size(),
                        var2,
                        var1.IOHOOIOHCHICOCHIICHCICCOHRCIII()
                     );
                  }

                  return false;
               }
            }
         }
      } else {
         return false;
      }
   }

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH IRHCCRHIRHOIICICRCOHROIHRRHHHO() {
      String var1 = null;
      if (com.moonsworth.lunar.client.HCHRIROHHHCORIOCROOCHRCIOROOCI.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
         com.moonsworth.lunar.client.HCHRIROHHHCORIOCROOCHRCIOROOCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HYPIXEL
      )) {
         var1 = com.moonsworth.lunar.client.IRRCCOICORICIHCHRHIHIHROIRHOCR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IOHHHHCRRIRRCHHICHOHHIRCIOORRH
            .RRRCHORHHHIHOCIOCRICCOIOOHHCOO()
            .IHRRHOIOOCRCCCRHCOIORCRHHHOOHC;
      }

      return new RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.CORIIOOCOIOOOORIRHHIIOHOOHIRRO, IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION, this.getDimension(), var1);
   }

   private int getDimension() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH().bridge$getDimension();
   }
}
