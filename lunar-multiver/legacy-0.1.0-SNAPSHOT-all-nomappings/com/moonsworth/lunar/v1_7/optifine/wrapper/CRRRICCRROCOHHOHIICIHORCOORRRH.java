package com.moonsworth.lunar.v1_7.optifine.wrapper;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.CORCOCICIRIOHROHROIIOOHICCHCRR;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CIOHHCORHRCCRICCCORIHCRHCCCRRR.RHOCHHIRRCHHHOHOIRROIROHHHIHIO;
import java.util.Optional;
import lombok.Generated;
import net.optifine.Config;

public class CRRRICCRROCOHHOHIICIHORCOORRRH
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   private final com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.CRRRICCRROCOHHOHIICIHORCOORRRH config;
   private final CORCOCICIRIOHROHROIIOOHICCHCRR shaders;
   private final HRCHROOHRIHCRCRHRIIROCIRHOIRHH customItems;
   private final com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RRCRRCORICCHOHHIRCHIROOHIIOHCO connectedTextures;
   private boolean reloading;

   public CRRRICCRROCOHHOHIICIHORCOORRRH() {
      try {
         Class.forName("net.optifine.Config");
      } catch (ClassNotFoundException var2) {
         Class.forName("Config");
      }

      this.config = new RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();
      this.shaders = new RIOOCHICIHRHOHCCCCCHOCCCOHCRHI();
      this.customItems = new HHCCIRHCCCIIRHCROHIORHIRHHIORH();
      this.connectedTextures = new IRCIIHHICIHRCOCRROCOICRIHHCCHH();
   }

   public Optional<HRCHROOHRIHCRCRHRIIROCIRHOIRHH> getCustomItems() {
      return Config.isCustomItems() ? Optional.of(this.customItems) : Optional.empty();
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RRCRRCORICCHOHHIRCHIROOHIIOHCO getConnectedTextures() {
      return this.connectedTextures;
   }

   public void waitOnAllChunksRendering(com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO var1) {
   }

   public void callSpriteUpdate(RHOCHHIRRCHHHOHOIRROIROHHHIHIO var1) {
   }

   public void updateMultiTextureSprite(RHOCHHIRRCHHHOHOIRROIROHHHIHIO var1) {
   }

   @Generated
   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.CRRRICCRROCOHHOHIICIHORCOORRRH getConfig() {
      return this.config;
   }

   @Generated
   public CORCOCICIRIOHROHROIIOOHICCHCRR getShaders() {
      return this.shaders;
   }

   @Generated
   public boolean isReloading() {
      return this.reloading;
   }

   @Generated
   public void setReloading(boolean var1) {
      this.reloading = var1;
   }
}
