package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.moonsworth.lunar.ichor.util.CORCOCICIRIOHROHROIIOOHICCHCRR;
import java.util.List;
import java.util.Objects;
import lombok.Generated;
import org.jetbrains.annotations.Nullable;

@CORCOCICIRIOHROHROIIOOHICCHCRR
public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   public boolean hidden;
   public String swapOnComplete;
   private transient String swapOnCompleteCache;
   private transient List<HHCCIRHCCCIIRHCROHIORHIRHHIORH> swapOnCompleteCacheList;

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      this.hidden = var1.hidden;
      this.swapOnComplete = var1.swapOnComplete;
   }

   @Nullable
   public List<HHCCIRHCCCIIRHCROHIORHIRHHIORH> getSwapOnComplete() {
      if (!Objects.equals(this.swapOnCompleteCache, this.swapOnComplete)) {
         this.swapOnCompleteCacheList = HHCCIRHCCCIIRHCROHIORHIRHHIORH.RHHIRORIIHOHRHIRHOHICHIIOCHCOR(this.swapOnComplete);
         this.swapOnCompleteCache = this.swapOnComplete;
      }

      return this.swapOnCompleteCacheList;
   }

   @Generated
   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
   }
}
