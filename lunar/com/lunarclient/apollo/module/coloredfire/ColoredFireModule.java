package com.lunarclient.apollo.module.coloredfire;

import com.lunarclient.apollo.module.ApolloModule;
import com.lunarclient.apollo.module.ModuleDefinition;
import com.lunarclient.apollo.option.Option;
import com.lunarclient.apollo.option.SimpleOption;
import com.lunarclient.apollo.recipients.Recipients;
import io.leangen.geantyref.TypeToken;
import java.awt.Color;
import java.util.UUID;
import org.jetbrains.annotations.ApiStatus;

@ModuleDefinition(id = "colored_fire", name = "Colored Fire")
@ApiStatus.NonExtendable
public abstract class ColoredFireModule extends ApolloModule {
   public static final SimpleOption<Boolean> PERSIST_COLORS_ON_UNLOAD = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)Option.builder()
                     .comment("Set to 'true' to keep fire colors when players unload from the tracker, otherwise 'false'."))
                  .node("persist-colors-on-unload"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();

   ColoredFireModule() {
      this.registerOptions(PERSIST_COLORS_ON_UNLOAD);
   }

   @Override
   public boolean isClientNotify() {
      return true;
   }

   public abstract void overrideColoredFire(Recipients var1, UUID var2, Color var3);

   public abstract void resetColoredFire(Recipients var1, UUID var2);

   public abstract void resetColoredFires(Recipients var1);
}
