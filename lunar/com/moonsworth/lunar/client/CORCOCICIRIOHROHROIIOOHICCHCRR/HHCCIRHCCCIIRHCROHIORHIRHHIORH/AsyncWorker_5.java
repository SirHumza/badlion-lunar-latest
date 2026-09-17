package com.moonsworth.lunar.client.CORCOCICIRIOHROHROIIOOHICCHCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.lunarclient.apollo.module.serverrule.ServerRuleModule;
import com.lunarclient.apollo.option.SimpleOption;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ORHIOICIOCRRHOOCOHRORIHICHRCRR;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.HICRRICCHCCROOHHCHOCOCCHOIHHOC;
import com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRRCCOICORICIHCHRHIHIHROIRHOCR;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.Objects;
import org.jspecify.annotations.Nullable;

public interface RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends com.moonsworth.lunar.client.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   String IICCOCIOOCCCCHORCHIOOOICRIRORR = "(off)";

   default void beforeOBJMeshRender() {
   }

   default void beginBeacon() {
   }

   default void endBeacon() {
   }

   default boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Runnable var1, Runnable var2) {
      RRCRRCORICCHOHHIRCHIROOHIIOHCO var3 = Objects.requireNonNull(IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI());
      ORHIOICIOCRRHOOCOHRORIHICHRCRR var4 = var3.bridge$getCurrentScreen();
      return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2, var4);
   }

   default boolean IRCIIHHICIHRCOCRROCOICRIHHCCHH(Runnable var1, Runnable var2) {
      return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2, null);
   }

   default boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Runnable var1, Runnable var2, ORHIOICIOCRRHOOCOHRORIHICHRCRR var3) {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHRIICOIOORCHCOIICOOIHIRHHICRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .HHCRORCOROHHHRRIICHHROOOCHHIIH();
      IRRCCOICORICIHCHRHIHIHROIRHOCR var5 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().CCHHHHCICRCCCIOOIOICOOCRCRHCCR();
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var6 = IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI();
      RRCRRCORICCHOHHIRCHIROOHIIOHCO var7 = Objects.requireNonNull(IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI());
      boolean var8 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .CIRCCCHCCCROROIIOIHIOROIHCHRCH()
         .<com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH>OOROOCCIRCCRHOIOIORIHCHHOOCCOR(
            ServerRuleModule.class
         )
         .filter(var0 -> var0.getOptions().<Boolean, SimpleOption<Boolean>>get(ServerRuleModule.DISABLE_SHADERS))
         .isPresent();
      if (var8) {
         var7.bridge$displayScreen(
            var6.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               () -> var7.bridge$displayScreen(var3), "", var5.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("gui.apollo", "disabledShadersServerRule")
            )
         );
         var1.run();
         return true;
      } else if (var4.isEnabled()) {
         String var9 = "gui.lightingMod.mod_enabled_cannot_enable_shaders";
         var7.bridge$displayScreen(
            var6.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               var5.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var9, "header"),
               var5.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var9, "warning"),
               var5.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var9, "confirmButton"),
               var5.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var9, "denyButton"),
               () -> {
                  var4.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH(HICRRICCHCCROOHHCHOCOCCHOIHHOC.IRIIIRORRHRROOOIRHROOOIIHIHIRH).setEnabled(false);
                  var7.bridge$displayScreen(var3);
                  var2.run();
               },
               () -> var7.bridge$displayScreen(var3)
            )
         );
         var1.run();
         return true;
      } else {
         return false;
      }
   }

   boolean lunar$areShadersEnabledInConfig();

   boolean lunar$isShadowPass();

   String lunar$getShaderPack();

   boolean lunar$setShaderPack(String var1);

   void lunar$toggleShaders(boolean var1);

   boolean lunar$isUsingExtendedVertexFormat();

   default boolean lunar$isRenderingLevel() {
      return true;
   }

   com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OHHRIOHROOIHOROCIRHCHORIHRRRRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH lunar$getExtendedEntityVertexFormat();

   @Nullable IRCIIHHICIHRCOCRROCOICRIHHCCHH lunar$getTransparencyType(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IRRCCOICORICIHCHRHIHIHROIRHOCR var1
   );

   com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IRRCCOICORICIHCHRHIHIHROIRHOCR lunar$unwrapRenderType(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IRRCCOICORICIHCHRHIHIHROIRHOCR var1
   );

   default HRCHROOHRIHCRCRHRIIROCIRHOIRHH lunar$unwrapMultiBufferSource(HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1) {
      return var1;
   }

   default @Nullable HRCHROOHRIHCRCRHRIIROCIRHOIRHH lunar$getHandBufferSource() {
      return null;
   }
}
