package com.lunarclient.apollo.module.combat;

import com.lunarclient.apollo.module.ApolloModule;
import com.lunarclient.apollo.module.ModuleDefinition;
import com.lunarclient.apollo.option.Option;
import com.lunarclient.apollo.option.SimpleOption;
import io.leangen.geantyref.TypeToken;

@ModuleDefinition(id = "combat", name = "Combat")
public final class CombatModule extends ApolloModule {
   public static final SimpleOption<Boolean> DISABLE_MISS_PENALTY = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)Option.builder()
                     .comment(
                        "Set to 'true' to remove the miss penalty on all versions 1.8 and above, otherwise 'false'.",
                        "Enabling this option may cause compatibility issues with anti-cheats."
                     ))
                  .node("disable-miss-penalty"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> DISABLE_BLOCK_MISS_PENALTY = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)Option.builder()
                     .comment(
                        "Set to 'true' to remove the miss penalty when targeting a block on all versions 1.8 and above, otherwise 'false'.",
                        "Enabling this option may cause compatibility issues with anti-cheats."
                     ))
                  .node("disable-block-miss-penalty"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> ALLOW_DIG_AND_USE = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)Option.builder()
                     .comment(
                        "Set to 'true' to allow digging and using an item at the same time on all versions 1.8 and above, otherwise 'false'.",
                        "Enabling this option may cause compatibility issues with anti-cheats."
                     ))
                  .node("allow-dig-and-use"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();

   CombatModule() {
      this.registerOptions(DISABLE_MISS_PENALTY, DISABLE_BLOCK_MISS_PENALTY, ALLOW_DIG_AND_USE);
   }

   @Override
   public boolean isClientNotify() {
      return true;
   }
}
