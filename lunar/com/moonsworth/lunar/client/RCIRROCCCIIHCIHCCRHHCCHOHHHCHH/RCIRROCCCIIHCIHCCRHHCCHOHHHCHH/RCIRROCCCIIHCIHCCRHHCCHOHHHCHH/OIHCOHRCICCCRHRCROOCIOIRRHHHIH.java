package com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.protobuf.Message;
import com.lunarclient.apollo.common.v1.BlockLocation;
import com.lunarclient.apollo.waypoint.v1.DisplayWaypointMessage;
import com.lunarclient.apollo.waypoint.v1.HideWaypointMessage;
import com.lunarclient.apollo.waypoint.v1.RemoveWaypointMessage;
import com.lunarclient.apollo.waypoint.v1.ResetWaypointsMessage;
import com.lunarclient.apollo.waypoint.v1.ShowWaypointMessage;
import com.lunarclient.apollo.waypoint.v1.WaypointTextStyle;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.CRHROHHHCIHHCOHCOORCRIHHIICROR;
import com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IIHRHCCOOHOOOOCHRRCOROOIOHCOOO;
import java.util.Set;

public class OIHCOHRCICCCRHRCROOCIOIRRHHHIH
   extends com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   public OIHCOHRCICCCRHRCROOCIOIRRHHHIH() {
      super("waypoint", "Waypoint");
   }

   @Override
   public Set<Class<? extends Message>> CRCHOOOCICHCRCCCCRORHRICCOCHCI() {
      return Set.of(
         DisplayWaypointMessage.class, RemoveWaypointMessage.class, ResetWaypointsMessage.class, ShowWaypointMessage.class, HideWaypointMessage.class
      );
   }

   @Override
   protected void onEnable() {
      this.IORCIIIOOOOICRIIHICHHCHHIOROHC();
   }

   @Override
   protected void onDisable() {
      this.IORCIIIOOOOICRIIHICHHCHHIOROHC();
   }

   @Override
   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         DisplayWaypointMessage.class,
         var0 -> {
            if (var0.hasLocation()) {
               BlockLocation var1x = var0.getLocation();
               CRHROHHHCIHHCOHCOORCRIHHIICROR var2 = CRHROHHHCIHHCOHCOORCRIHHIICROR.IHHCHHHCRIHOOCOIOOCRIIICIOROIR(
                  var1x.getX() + 0.5, var1x.getY(), var1x.getZ() + 0.5
               );
               WaypointTextStyle var3 = var0.getStyle();
               com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.CRRRICCRROCOHHOHIICIHORCOORRRH var4 = new com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.CRRRICCRROCOHHOHIICIHORCOORRRH();
               var4.CHIHRIROCCRICOHIRCRIOOHOHRRCHC().OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(var0.getColor().getColor());
               var4.OCRRIOHCHCCRRHRCCOHCIORRRORCRH(var0.getShowBeam());
               var4.RICRHCHRRCCIICRCHICCIHHHCIICOH(var0.getHighlightBlock());
               float var5 = var0.getHighlightBlockLineWidth();
               if (var5 != 0.0F) {
                  var4.IIHRRHORCRCROCHHOHORCHCROCIHRO(var5);
               }

               if (var0.hasStyle()) {
                  var4.ORHOOCIRIHHOCHHRIRIOIIICHOORCR(var3.getShowText());
                  var4.HRHRIHCHOHOOHHOOIOORHRRICHHCHI(var3.getShowDistance());
                  com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var6 = new com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                     var3.getOnlyShowTextWhenLookingNear(),
                     var3.getShowIcons(),
                     var3.getTextIconScale(),
                     var3.getLabelScale(),
                     var3.getBoxPadding(),
                     var3.getBoxBorders(),
                     var3.getTextShadow()
                  );
                  var4.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var6);
               }

               com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var7 = com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CIROORIICIROCCOIROCRIRCCRHCIOI()
                  .RRHCHIHOIRICOICHIHOIRIOHHRHOOI(var0.getName())
                  .OCOHORHCROHICRRIHCIHHRRCIHICRI(var2)
                  .ICOHOCROHOHHHCCOCIHHRHOCOOCOCC(var1x.getWorld())
                  .RRROCCOIROROHIRRHOHIRRIHOCIIRO(!var0.getHidden())
                  .OHRCIORHOCHOORCRHHOHRRRCCOICCO(var0.getPreventRemoval())
                  .HRIOHRORCHIICCICIHRIIHHCHHOHHO(IIHRHCCOOHOOOOCHRRCOROOIOHCOOO.HIRHRIOCOCCCORCRICIICOIIIOCOHI())
                  .IRCIIHHICIHRCOCRROCOICRIHHCCHH(var4)
                  .OIHHRHHICRCHRIORRIHHOICCHCCRRR();
               com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
                  .HOHHHORIIORRRROHRIIRCHCCICHHCI()
                  .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var7, false);
            }
         }
      );
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         RemoveWaypointMessage.class,
         var0 -> com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
            .HOHHHORIIORRRROHRIIRCHCCICHHCI()
            .removeIf(var1x -> var1x.OHOHROCCIROORCCCIOOOIOIIHORHOC() && var1x.getName().equals(var0.getName()))
      );
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ResetWaypointsMessage.class, var1x -> this.IORCIIIOOOOICRIIHICHHCHHIOROHC());
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ShowWaypointMessage.class, var1x -> this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1x.getName(), true));
      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HideWaypointMessage.class, var1x -> this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1x.getName(), false));
   }

   private void IRCIIHHICIHRCOCRROCOICRIHHCCHH(String var1, boolean var2) {
      IIHRHCCOOHOOOOCHRRCOROOIOHCOOO var3 = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
         .HOHHHORIIORRRROHRIIRCHCCICHHCI();

      for (com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var5 : var3.OHHRCRIOOCIORORHIOHRICRHHORCIH()) {
         if (var5.OHOHROCCIROORCCCIOOOIOIIHORHOC() && var5.getName().equals(var1)) {
            var5.setVisible(var2);
            var3.ROOCCICICICIRCOHOHCOCIHHCCHRII();
            return;
         }
      }
   }

   private void IORCIIIOOOOICRIIHICHHCHHIOROHC() {
      IIHRHCCOOHOOOOCHRRCOROOIOHCOOO var1 = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
         .HOHHHORIIORRRROHRIIRCHCCICHHCI();
      var1.OHHRCRIOOCIORORHIOHRICRHHORCIH()
         .removeIf(
            com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHOOIOHCHICOCHIICHCICCOHRCIII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH::OHOHROCCIROORCCCIOOOIOIIHORHOC
         );
      var1.ROOCCICICICIRCOHOHCOCIHHCCHRII();
   }
}
