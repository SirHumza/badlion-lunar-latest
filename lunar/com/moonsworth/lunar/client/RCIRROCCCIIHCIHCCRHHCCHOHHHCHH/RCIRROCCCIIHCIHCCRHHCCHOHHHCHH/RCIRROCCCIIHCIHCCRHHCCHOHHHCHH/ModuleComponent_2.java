package com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.lunarclient.apollo.module.combat.CombatModule;
import com.lunarclient.apollo.option.Option;
import java.util.Collection;
import java.util.List;

public class RIOOCHICIHRHOHCCCCCHOCCCOHCRHI
   extends com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   public RIOOCHICIHRHOHCCCCCHOCCCOHCRHI() {
      super("combat", "Combat");
   }

   @Override
   public Collection<Option<?, ?, ?>> IOHHOCRCCCIRHRCORCRCCCOCIOCCRH() {
      return List.of(CombatModule.DISABLE_MISS_PENALTY, CombatModule.DISABLE_BLOCK_MISS_PENALTY, CombatModule.ALLOW_DIG_AND_USE);
   }
}
