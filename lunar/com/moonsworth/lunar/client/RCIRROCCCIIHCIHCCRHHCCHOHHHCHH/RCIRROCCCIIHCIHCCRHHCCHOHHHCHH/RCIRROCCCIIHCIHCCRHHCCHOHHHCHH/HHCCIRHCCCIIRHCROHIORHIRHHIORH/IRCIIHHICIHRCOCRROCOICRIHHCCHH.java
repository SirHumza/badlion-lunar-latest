package com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.google.common.base.CaseFormat;
import com.google.protobuf.Value;
import com.lunarclient.apollo.configurable.v1.ConfigurableSettings;
import com.lunarclient.apollo.mods.ApolloModsManager;
import com.lunarclient.apollo.network.NetworkOptions;
import com.lunarclient.apollo.option.Option;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.CORCOCICIRIOHROHROIIOOHICCHCRR;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HICRRICCHCCROOHHCHOCOCCHOIHHOC;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IHHCHHHCRIHOOCOIOOCRIIICIOROIR;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.HCHRIROHHHCORIOCROOCHRCIOROOCI;
import com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH.CRICCOOHHHCHOORCICOCOHIHOIRHOO;
import com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.HashMap;
import java.util.Map;
import org.jspecify.annotations.Nullable;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   public static ApolloModsManager.Container OROOOOIRRCHIOROCROIOOOIROOICIO;

   public Map<String, Value> OCCHIHRHRHIROIOCOCICRRRHIORRRH() {
      HashMap var1 = new HashMap();

      for (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 : IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .OHHRCRIOOCIORORHIOHRICRHHORCIH()) {
         if (var3 instanceof com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4) {
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var4, var1);
         }
      }

      return var1;
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HCHRIROHHHCORIOCROOCHRCIOROOCI<?> var1, Object var2) {
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var1.IHCRORHRORIICHRHRCHRRIRRHHOCOO(CRICCOOHHHCHOORCICOCOHIHOIRHOO.IOCCCOOCOOHOCIRRHCCIOHRHIOHCCH), var2);
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HCHRIROHHHCORIOCROOCHRCIOROOCI<?> var1, @Nullable String var2, Object var3) {
      if (var2 != null) {
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.RHRIRROIOROICIOOCCOHOOROHHCOCO() != null) {
            if (IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR() != null) {
               if (OROOOOIRRCHIOROCROIOOOIROOICIO != null) {
                  HHCCIRHCCCIIRHCROHIORHIRHHIORH var4 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().CIRCCCHCCCROROIIOIHIOROIHCHRCH();
                  if (var4.HRHCCCCCIRCHIRHROIRROCHOOIIIOI()) {
                     if (!IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
                        .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
                        .IOIOHOOCRRORCCCOCIRROHCOCCCRCO()
                        .HRIICOIOIIIIRIHHOICRHOIIRCIRIC()) {
                        String var5 = CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.LOWER_HYPHEN, var2);
                        String var6 = var1.IHORCCORHOCIHHIHRRHOOHHOIRORRH();
                        String var7 = var5 + "." + var6;
                        Option var8 = OROOOOIRRCHIOROCROIOOOIROOICIO.getModStatusOptions().get(var7);
                        if (var8 != null) {
                           Value var9;
                           try {
                              var9 = NetworkOptions.wrapValue(Value.newBuilder(), var8.getTypeToken().getType(), var3);
                           } catch (ClassCastException var12) {
                              String var11 = String.format(
                                 "Failed to wrap option '%s'. The provided value '%s' (Type: %s) could not be converted.",
                                 var7,
                                 var3,
                                 var3.getClass().getSimpleName()
                              );
                              com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                                 "Apollo", var11
                              );
                              return;
                           }

                           ConfigurableSettings var10 = ConfigurableSettings.newBuilder().setApolloModule("mod_setting").putProperties(var7, var9).build();
                           var4.sendPacket(var10);
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HCHRIROHHHCORIOCROOCHRCIOROOCI<?> var1) {
      return !var1.isDefault() && RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1);
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1, Map<String, Value> var2
   ) {
      String var3 = var1.IHORCCORHOCIHHIHRRHOOHHOIRORRH();
      var1.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH(HICRRICCHCCROOHHCHOCOCCHOIHHOC.IRIIIRORRHRROOOIRHROOOIIHIHIRH)
         .flatMap(CORCOCICIRIOHROHROIIOOHICCHCRR::OCIOICIOHHHIRIOCIHCHHCCHRRRIHI)
         .filter(var0 -> !var0.isDefault())
         .ifPresent(var3x -> this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3, (HCHRIROHHHCORIOCROOCHRCIOROOCI<?>)var3x, var2, var3x.get()));
      IHHCHHHCRIHOOCOIOOCRIIICIOROIR var4 = var1.IHCRORHRORIICHRHRCHRRIRRHHOCOO(HICRRICCHCCROOHHCHOCOCCHOIHHOC.IRHCCHCRHIHOCRICOHOIICHCHOHICC);
      if (var4 != null) {
         var4.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var3x -> {
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3, var3x, var2, var3x.get());
            return false;
         });
      }
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, HCHRIROHHHCORIOCROOCHRCIOROOCI<?> var2, Map<String, Value> var3, Object var4) {
      if (this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2)) {
         String var5 = var1 + "." + var2.IHORCCORHOCIHHIHRRHOOHHOIRORRH();
         Option var6 = OROOOOIRRCHIOROCROIOOOIROOICIO.getModStatusOptions().get(var5);
         if (var6 != null) {
            Value var7;
            try {
               var7 = NetworkOptions.wrapValue(Value.newBuilder(), var6.getTypeToken().getType(), var4);
            } catch (ClassCastException var10) {
               String var9 = String.format(
                  "Failed to wrap option '%s'. The provided value '%s' (Type: %s) could not be converted.", var5, var4, var4.getClass().getSimpleName()
               );
               com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH("Apollo", var9);
               return;
            }

            var3.put(var5, var7);
         }
      }
   }

   static {
      com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIORCRHCIOIHCOCORCIHIOROCOOCR
         .submit(() -> OROOOOIRRCHIOROCROIOOOIROOICIO = ApolloModsManager.loadModOptions());
   }
}
