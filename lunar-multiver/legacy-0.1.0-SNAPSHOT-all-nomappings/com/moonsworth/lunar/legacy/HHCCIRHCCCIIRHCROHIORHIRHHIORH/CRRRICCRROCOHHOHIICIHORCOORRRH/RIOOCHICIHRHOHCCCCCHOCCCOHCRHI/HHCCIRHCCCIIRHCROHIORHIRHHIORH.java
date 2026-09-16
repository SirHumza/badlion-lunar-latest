package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;

import com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.ICICIOCHHHIHOCHCOHORIHRCOHHOCR;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.function.LongConsumer;
import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.client.multiplayer.ServerData.ServerResourceMode;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ServerData.class)
public abstract class HHCCIRHCCCIIRHCROHIORHIRHHIORH
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   @Shadow
   public String serverIP;
   @Shadow
   public long pingToServer;
   @Shadow
   public String serverIcon;
   @Shadow
   public String serverName;
   @Shadow
   public String populationInfo;
   @Unique
   private String lunar$lunarServer;
   @Unique
   private LongConsumer lunar$callback;
   @Unique
   private boolean lunar$pinnedClicked;
   @Unique
   boolean lunar$pinned;

   @Shadow
   public abstract void setResourceMode(ServerResourceMode var1);

   @Shadow
   public abstract boolean isLanServer$v1_7();

   @Shadow
   public abstract boolean isOnLAN$v1_8();

   public String bridge$serverIP() {
      return this.serverIP;
   }

   public void bridge$setPingToServer(long var1) {
      this.pingToServer = var1;
   }

   public long bridge$getPingToServer() {
      return this.pingToServer;
   }

   public String getLunarServer() {
      return this.lunar$lunarServer;
   }

   public String bridge$getServerName() {
      return this.serverName;
   }

   public void setLunarServer(String var1) {
      this.lunar$lunarServer = var1;
   }

   public String bridge$getBase64Icon() {
      return this.serverIcon;
   }

   public String bridge$getPopulationInfo() {
      return this.populationInfo;
   }

   public void bridge$setPingCallback(LongConsumer var1) {
      this.lunar$callback = var1;
   }

   public LongConsumer bridge$getPingCallback() {
      return this.lunar$callback;
   }

   public void bridge$disableResourcePack() {
      this.setResourceMode(ServerResourceMode.DISABLED);
   }

   public void bridge$enableResourcePack() {
      this.setResourceMode(ServerResourceMode.ENABLED);
   }

   @Inject(method = "setResourceMode", at = @At("HEAD"))
   private void lunar$savePinnedPackChoice(ServerResourceMode var1, CallbackInfo var2) {
      if (this.lunar$pinned && com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR() != null) {
         ICICIOCHHHIHOCHCOHORIHRCOHHOCR var3 = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CCIHHCIOHIHIRHICIHROCOOCCCCCCR()
            .OORRROHOHHOOROORRRCCCOCCOOCCHI();
         switch (var1) {
            case ENABLED:
               var3.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  this.serverIP,
                  com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.ICICIOCHHHIHOCHCOHORIHRCOHHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.ENABLED
               );
               break;
            case DISABLED:
               var3.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  this.serverIP,
                  com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.ICICIOCHHHIHOCHCOHORIHRCOHHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.DISABLED
               );
               break;
            default:
               var3.OOHRICHCIIIICRCOOHCORHHIHICOHO(this.serverIP);
         }
      }
   }

   public boolean bridge$wasPinnedClicked() {
      return this.lunar$pinnedClicked;
   }

   public void bridge$setPinnedClicked(boolean var1) {
      this.lunar$pinnedClicked = var1;
   }

   public boolean bridge$isPinned() {
      return this.lunar$pinned;
   }

   public void bridge$setIsPinned(boolean var1) {
      this.lunar$pinned = var1;
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH bridge$init(
      String var1
   ) {
      return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH)(
         new ServerData(this.serverName, var1, IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 0 ? this.isLanServer$v1_7() : this.isOnLAN$v1_8())
      );
   }
}
