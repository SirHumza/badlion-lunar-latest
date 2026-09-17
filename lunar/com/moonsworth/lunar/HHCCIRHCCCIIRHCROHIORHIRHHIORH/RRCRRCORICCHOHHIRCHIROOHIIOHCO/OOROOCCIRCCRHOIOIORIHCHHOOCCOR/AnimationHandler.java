package com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.OHIIIOHIRIRCCRRIOIICCHHIORRHOH;
import java.util.List;
import org.jetbrains.annotations.Nullable;

public interface RIOOCHICIHRHOHCCCCCHOCCCOHCRHI {
   int bridge$getMaximumRenderCount();

   int bridge$getUnculledRenderCount();

   int bridge$getRenderedEntityCount();

   int bridge$getRenderedBlockEntityCount();

   int bridge$getRenderedPlayersCount();

   void bridge$setNeedsFullRenderChunkUpdate(boolean var1);

   void bridge$reloadChunks();

   default boolean bridge$hasRenderedAllChunks() {
      return true;
   }

   List<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO> bridge$getRenderChunks();

   boolean bridge$isVisible(com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1);

   boolean bridge$isBlockVisible(int var1, int var2, int var3);

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   default void bridge$makeEntityOutlineShader() {
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   default void bridge$renderEntityOutlineFramebuffer() {
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   default void bridge$bindEntityOutlineFbs(int var1, int var2) {
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 5)
   @Nullable
   default HHCCIRHCCCIIRHCROHIORHIRHHIORH bridge$entityTarget() {
      throw new com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH();
   }

   boolean bridge$isInViewDistance(OHIIIOHIRIRCCRRIOIICCHHIORRHOH var1, OHIIIOHIRIRCCRRIOIICCHHIORRHOH var2);

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 6)
   default boolean bridge$hasDestroyProgress(int var1, int var2, int var3) {
      throw new com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH();
   }
}
