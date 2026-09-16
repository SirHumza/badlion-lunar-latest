package com.lunarclient.apollo.module.heightlimit;

import com.lunarclient.apollo.module.ApolloModule;
import com.lunarclient.apollo.module.ModuleDefinition;
import com.lunarclient.apollo.option.ListOption;
import com.lunarclient.apollo.option.Option;
import com.lunarclient.apollo.recipients.Recipients;
import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.format.NamedTextColor;
import io.leangen.geantyref.TypeToken;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.jetbrains.annotations.ApiStatus;

@ModuleDefinition(id = "height_limit", name = "Height Limit")
@ApiStatus.NonExtendable
public abstract class HeightLimitModule extends ApolloModule {
   private static final HeightLimit OVERWORLD_HEIGHT_LIMIT = HeightLimit.builder()
      .world("world")
      .limit(200)
      .displayName(Component.text("Overworld", NamedTextColor.GOLD))
      .build();
   public static final ListOption<HeightLimit> DEFAULT_HEIGHT_LIMITS = ((ListOption.ListOptionBuilder)((ListOption.ListOptionBuilder)((ListOption.ListOptionBuilder)((ListOption.ListOptionBuilder)Option.list()
                  .comment("Sets the default height limits to send to the player."))
               .node("default-height-limits"))
            .type(new TypeToken<List<HeightLimit>>() {}))
         .defaultValue(new ArrayList<>(Collections.singletonList(OVERWORLD_HEIGHT_LIMIT))))
      .build();

   protected HeightLimitModule() {
      this.registerOptions(ApolloModule.ENABLE_OPTION_OFF, DEFAULT_HEIGHT_LIMITS);
   }

   public abstract void overrideHeightLimit(Recipients var1, HeightLimit var2);

   public abstract void removeHeightLimit(Recipients var1, String var2);

   public abstract void removeHeightLimit(Recipients var1, HeightLimit var2);

   public abstract void resetHeightLimits(Recipients var1);
}
