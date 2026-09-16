package com.lunarclient.apollo.module.title;

import com.lunarclient.apollo.module.ApolloModule;
import com.lunarclient.apollo.module.ModuleDefinition;
import com.lunarclient.apollo.option.Option;
import com.lunarclient.apollo.option.SimpleOption;
import com.lunarclient.apollo.recipients.Recipients;
import io.leangen.geantyref.TypeToken;
import org.jetbrains.annotations.ApiStatus;

@ModuleDefinition(id = "title", name = "Title")
@ApiStatus.NonExtendable
public abstract class TitleModule extends ApolloModule {
   public static final SimpleOption<Boolean> CLEAR_TITLE_ON_SERVER_SWITCH = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)Option.builder()
                     .comment("Set to 'true' to clear the shown title when changing servers, otherwise 'false'."))
                  .node("clear-title-on-server-switch"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();

   TitleModule() {
      this.registerOptions(CLEAR_TITLE_ON_SERVER_SWITCH);
   }

   @Override
   public boolean isClientNotify() {
      return true;
   }

   public abstract void displayTitle(Recipients var1, Title var2);

   public abstract void resetTitles(Recipients var1);
}
