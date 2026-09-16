package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CIOHHCORHRCCRICCCORIHCRHCCCRRR;

import net.minecraft.network.ServerStatusResponse;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

@Mixin(ServerStatusResponse.class)
public abstract class CORCOCICIRIOHROHROIIOOHICCHCRR
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR {
   @Unique
   private String lunar$lunarServer;

   public String getLunarServer() {
      return this.lunar$lunarServer;
   }

   public void setLunarServer(String var1) {
      this.lunar$lunarServer = var1;
   }
}
