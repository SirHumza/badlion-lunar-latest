package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR;

import java.util.Map;
import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Scoreboard;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(Scoreboard.class)
public interface CRRRICCRROCOHHOHIICIHORCOORRRH {
   @Mutable
   @Accessor("objectiveDisplaySlots")
   void bridge$setObjectiveDisplaySlots(ScoreObjective[] var1);

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Mutable
   @Accessor("field_96544_c$v1_7")
   void bridge$setField96544c$v1_7(Map var1);

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Mutable
   @Accessor("entitiesScoreObjectives$v1_8")
   void bridge$setEntitiesScoreObjectives$v1_8(Map<String, Map<ScoreObjective, Score>> var1);
}
