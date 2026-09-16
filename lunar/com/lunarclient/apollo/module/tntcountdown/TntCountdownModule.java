package com.lunarclient.apollo.module.tntcountdown;

import com.lunarclient.apollo.common.ApolloEntity;
import com.lunarclient.apollo.module.ApolloModule;
import com.lunarclient.apollo.module.ModuleDefinition;
import com.lunarclient.apollo.option.NumberOption;
import com.lunarclient.apollo.option.SimpleOption;
import com.lunarclient.apollo.recipients.Recipients;
import io.leangen.geantyref.TypeToken;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Range;

@ModuleDefinition(id = "tnt_countdown", name = "TNT Countdown")
@ApiStatus.NonExtendable
public abstract class TntCountdownModule extends ApolloModule {
   public static final NumberOption<Integer> TNT_TICKS = ((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)NumberOption.number()
               .comment("Set the amount of ticks before the TNT explodes."))
            .node("tnt-ticks"))
         .type(TypeToken.get(Integer.class)))
      .defaultValue(80)
      .min(1)
      .max(Integer.MAX_VALUE)
      .notifyClient()
      .build();
   public static final SimpleOption<Boolean> OVERRIDE_CUSTOM_TICKS = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                     .comment("Whether to override custom TNT explosion ticks."))
                  .node("override-custom-ticks"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();

   TntCountdownModule() {
      this.registerOptions(TNT_TICKS, OVERRIDE_CUSTOM_TICKS);
   }

   @Override
   public boolean isClientNotify() {
      return true;
   }

   public abstract void setTntCountdown(ApolloEntity var1, @Range(from = 0L, to = 2147483647L) int var2);

   public abstract void setTntCountdown(Recipients var1, ApolloEntity var2, @Range(from = 0L, to = 2147483647L) int var3);
}
