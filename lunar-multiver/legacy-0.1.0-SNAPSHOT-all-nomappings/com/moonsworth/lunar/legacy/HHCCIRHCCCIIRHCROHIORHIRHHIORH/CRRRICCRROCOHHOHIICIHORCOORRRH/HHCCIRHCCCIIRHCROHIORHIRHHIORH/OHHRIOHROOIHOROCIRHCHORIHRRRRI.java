package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.lunarclient.apollo.module.serverlink.ServerLinkModule;
import com.lunarclient.apollo.module.serverlink.pausemenu.LegacyServerLinkPlacement;
import com.lunarclient.gameipc.browser.v1.OpenUrlRequest.Initiator;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.ichor.api.IchorAPI;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiIngameMenu;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.client.gui.GuiMultiplayer;
import net.minecraft.client.gui.GuiScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(GuiIngameMenu.class)
public abstract class OHHRIOHROOIHOROCIRHCHORIHRRRRI
   extends GuiScreen
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO {
   @Unique
   private static final int VANILLA_ACHIEVEMENTS_BUTTON_ID = 5;
   @Unique
   private static final int VANILLA_STATISTICS_BUTTON_ID = 6;
   @Unique
   private static final int VANILLA_OPEN_TO_LAN_INDEX = 3;
   @Unique
   private static final int FORGE_OPEN_TO_LAN_INDEX = 4;
   @Unique
   private static final int FORGE_MOD_OPTIONS_INDEX = 3;
   @Unique
   private static final int LUNAR_OPTIONS_BUTTON_ID = 100;
   @Unique
   private static final int HOSTED_WORLDS_BUTTON_ID = 101;
   @Unique
   private static final int MULTIPLAYER_BUTTON_ID = 102;
   @Unique
   private static final int SERVER_LINKS_BUTTON_ID = 103;
   @Unique
   private static final int REPORT_BUG_BUTTON_ID = 104;
   @Unique
   private static final int DISCONNECT_BUTTON_ID = 1;

   @Inject(method = "initGui", at = @At("TAIL"))
   private void lunar$onInitGui(CallbackInfo var1) {
      boolean var2 = IchorAPI.getPipeline(com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class.getClassLoader())
         .map(var0 -> var0.hasModule("forge"))
         .orElse(false);
      boolean var3 = this.mc.isIntegratedServerRunning();
      String var4 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR().CCRHICOCOHIIRIHCOCIRCHHROHCCRR().IORRRROCRRCHCHHRCCOHCRRCRHCRHH() != null
         ? "World Options"
         : "Host World";
      GuiButton var5 = new GuiButton(101, this.width / 2 - 100, this.height / 4 + 56, 200, 20, var4);
      GuiButton var6 = new GuiButton(102, this.width / 2 - 100, this.height / 4 + 56, 200, 20, "Multiplayer");
      LegacyServerLinkPlacement var7 = this.lunar$activePlacement();
      boolean var8 = var7 == LegacyServerLinkPlacement.NEW_ROW;
      int var9 = var8 ? 24 : 0;
      GuiButton var10 = new GuiButton(103, this.width / 2 - 100, this.height / 4 + 80, 98, 20, "Server Links...");
      GuiButton var11 = new GuiButton(104, this.width / 2 + 2, this.height / 4 + 80, 98, 20, "Lunar Support...");
      GuiButton var12 = new GuiButton(100, this.width / 2 + 2, this.height / 4 + 80 + var9, 98, 20, "Lunar Options...");
      List var13 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? this.buttonList$v1_8 : this.buttonList$v1_7;
      if (!var2) {
         var13.remove(3);
      } else {
         var13.remove(4);
         var13.remove(3);
      }

      if (var3) {
         var13.add(var5);
      } else {
         var13.add(var6);
      }

      if (var8) {
         var13.add(var10);
         var13.add(var11);
      }

      var13.add(var12);
      if (var7 != null && !var8) {
         int var14 = this.lunar$replaceButtonId(var7);

         for (GuiButton var16 : var13) {
            if (var16.id == var14) {
               var16.displayString = var10.displayString;
               break;
            }
         }
      }
   }

   @Unique
   private LegacyServerLinkPlacement lunar$activePlacement() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .CIRCCCHCCCROROIIOIHIOROIHCHRCH()
         .OOROOCCIRCCRHOIOIORIHCHHOOCCOR(ServerLinkModule.class)
         .map(
            var0 -> (com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IHIRRIIORRHORHRORIHOROIRCORCOO)var0
         )
         .filter(var0 -> !var0.CICCCRHCRIOIRCCORORICCICICRCRO().isEmpty())
         .<LegacyServerLinkPlacement>map(
            com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IHIRRIIORRHORHRORIHOROIRCORCOO::RORHCHROOIOCCRRCOICHCIIRCHOIOI
         )
         .orElse(null);
   }

   @Unique
   private int lunar$replaceButtonId(LegacyServerLinkPlacement var1) {
      if (var1 == LegacyServerLinkPlacement.REPLACE_ACHIEVEMENTS) {
         return 5;
      } else {
         return var1 == LegacyServerLinkPlacement.REPLACE_STATISTICS ? 6 : -1;
      }
   }

   @Inject(method = "actionPerformed", at = @At("HEAD"), cancellable = true)
   private void lunar$onActionPerformed(GuiButton var1, CallbackInfo var2) {
      LegacyServerLinkPlacement var3 = this.lunar$activePlacement();
      if (var3 != null && var1.id == this.lunar$replaceButtonId(var3)) {
         IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
            .bridge$displayScreen(
               (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ORHIOICIOCRRHOOCOHRORIHICHRCRR)com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
                  .RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this)
            );
         var2.cancel();
      } else {
         if (var1.id == 100) {
            IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
               .bridge$displayScreen(
                  com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
                     .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                        new com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.CIOHHCORHRCCRICCCORIHCRHCCCRRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                           IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getCurrentScreen()
                        )
                     )
               );
            var2.cancel();
         } else if (var1.id == 102) {
            com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RHOCHHIRRCHHHOHOIRROIROHHHIHIO var4 = (com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RHOCHHIRRCHHHOHOIRROIROHHHIHIO)com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
               .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.class,
                  () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RHOCHHIRRCHHHOHOIRROIROHHHIHIO(
                     () -> this.mc.displayGuiScreen(new GuiMultiplayer(this.mc.currentScreen))
                  )
               );
            if (var4 == null || !var4.isCancelled()) {
               this.mc.displayGuiScreen(new GuiMultiplayer(this.mc.currentScreen));
            }

            var2.cancel();
         } else if (var1.id == 101) {
            IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
               .bridge$displayScreen(
                  com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
                     .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                        new com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
                           "hostedWorldSettings"
                        )
                     )
               );
            var2.cancel();
         } else if (var1.id == 1) {
            com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RHOCHHIRRCHHHOHOIRROIROHHHIHIO var8 = (com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RHOCHHIRRCHHHOHOIRROIROHHHIHIO)com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HCCOIRHHOOHICHHIOOOIRORRCRIRRO()
               .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.class,
                  () -> new com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RHOCHHIRRCHHHOHOIRROIROHHHIHIO(
                     () -> {
                        var1.enabled = false;
                        if (this.mc.world != null) {
                           this.mc.world.sendQuittingDisconnectingPacket();
                        }

                        this.mc.loadWorld(null);
                        this.mc.displayGuiScreen(new GuiMainMenu());
                     }
                  )
               );
            if (var8 != null && var8.isCancelled()) {
               var2.cancel();
            }
         } else if (var1.id == 103) {
            IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
               .bridge$displayScreen(
                  (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ORHIOICIOCRRHOOCOHRORIHICHRCRR)com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
                     .RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this)
               );
            var2.cancel();
         } else if (var1.id == 104) {
            URI var9;
            try {
               var9 = new URI("https://support.lunarclient.com");
            } catch (URISyntaxException var7) {
               return;
            }

            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO var5 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI();
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var6 = var5.bridge$getGameSettings();
            if (var6.bridge$isChatLinks()) {
               if (var6.bridge$isChatPromptLinks()) {
                  var5.bridge$displayScreen(
                     com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRRIHROCORIOOCHHCHCHOHCIOHHRRI()
                        .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this, var9.toString(), var9, false)
                  );
               } else {
                  com.moonsworth.lunar.client.util.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                     var9.toString(), Initiator.INITIATOR_UNSPECIFIED
                  );
               }
            }

            var2.cancel();
         }
      }
   }

   @ModifyConstant(method = "initGui", constant = {@Constant(intValue = 96), @Constant(intValue = 120)})
   private int lunar$shiftButtons(int var1) {
      boolean var2 = this.lunar$activePlacement() == LegacyServerLinkPlacement.NEW_ROW;
      int var3 = var2 ? 24 : 0;
      return var1 + var3;
   }
}
