package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.moonsworth.lunar.ichor.util.CORCOCICIRIOHROHROIIOOHICCHCRR;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import lombok.Generated;
import org.joml.Vector3d;

@CORCOCICIRIOHROHROIIOOHICCHCRR
public class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   public static final IRCIIHHICIHRCOCRROCOICRIHHCCHH EMPTY = new IRCIIHHICIHRCOCRROCOICRIHHCCHH();
   public String swapOnLocked;
   public List<IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> textHolograms;
   private transient String swapOnLockedCache;
   private transient List<HHCCIRHCCCIIRHCROHIORHIRHHIORH> swapOnLockedCacheList;

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH(IRCIIHHICIHRCOCRROCOICRIHHCCHH var1) {
      this.swapOnLocked = var1.swapOnLocked;
      this.textHolograms = var1.textHolograms.stream().map(IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH::new).collect(Collectors.toList());
   }

   public List<HHCCIRHCCCIIRHCROHIORHIRHHIORH> getSwapOnLocked() {
      if (!Objects.equals(this.swapOnLockedCache, this.swapOnLocked)) {
         this.swapOnLockedCacheList = HHCCIRHCCCIIRHCROHIORHIRHHIORH.RHHIRORIIHOHRHIRHOHICHIIOCHCOR(this.swapOnLocked);
         this.swapOnLockedCache = this.swapOnLocked;
      }

      return this.swapOnLockedCacheList;
   }

   public List<IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> getTextHolograms() {
      if (this.textHolograms == null) {
         this.textHolograms = new ArrayList<>();
      }

      return this.textHolograms;
   }

   @Generated
   public IRCIIHHICIHRCOCRROCOICRIHHCCHH() {
   }

   @CORCOCICIRIOHROHROIIOOHICCHCRR
   public static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      public String text;
      public Vector3d pos;

      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
         this.text = var1.text;
         this.pos = new Vector3d(var1.pos);
      }

      @Generated
      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      }

      @Generated
      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var1, Vector3d var2) {
         this.text = var1;
         this.pos = var2;
      }
   }
}
