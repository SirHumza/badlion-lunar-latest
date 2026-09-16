package com.lunarclient.apollo.module.serverlink;

import com.lunarclient.apollo.common.icon.ResourceLocationIcon;
import com.lunarclient.apollo.module.ApolloModule;
import com.lunarclient.apollo.module.ModuleDefinition;
import com.lunarclient.apollo.module.serverlink.pausemenu.LegacyServerLinkPlacement;
import com.lunarclient.apollo.module.serverlink.pausemenu.ModernServerLinkPlacement;
import com.lunarclient.apollo.option.EnumOption;
import com.lunarclient.apollo.option.Option;
import com.lunarclient.apollo.recipients.Recipients;
import io.leangen.geantyref.TypeToken;
import java.util.List;
import org.jetbrains.annotations.ApiStatus;

@ModuleDefinition(id = "server_link", name = "Server Link")
@ApiStatus.NonExtendable
public abstract class ServerLinkModule extends ApolloModule {
   public static final EnumOption<LegacyServerLinkPlacement> LEGACY_BUTTON_PLACEMENT = ((EnumOption.EnumOptionBuilder)((EnumOption.EnumOptionBuilder)((EnumOption.EnumOptionBuilder)Option.enumerator()
               .comment(
                  "Where the server links button appears in the pause menu (1.7-1.12), added on a new line by default.",
                  " 'NEW_ROW' adds a dedicated row.",
                  " 'REPLACE_ACHIEVEMENTS' reuses the achievements button.",
                  " 'REPLACE_STATISTICS' reuses the statistics button."
               ))
            .node("legacy-button-placement"))
         .type(TypeToken.get(LegacyServerLinkPlacement.class)))
      .defaultValue(LegacyServerLinkPlacement.NEW_ROW)
      .notifyClient()
      .build();
   public static final EnumOption<ModernServerLinkPlacement> MODERN_BUTTON_PLACEMENT = ((EnumOption.EnumOptionBuilder)((EnumOption.EnumOptionBuilder)((EnumOption.EnumOptionBuilder)Option.enumerator()
               .comment(
                  "Where the server links button appears in the pause menu (1.16.1+), replaces the existing report bugs button by default.",
                  " 'REPLACE_REPORT_BUGS' reuses the report bugs button.",
                  " 'REPLACE_ACHIEVEMENTS' reuses the advancements button.",
                  " 'REPLACE_STATISTICS' reuses the statistics button.",
                  "Has no effect on 1.21+ (handled natively)."
               ))
            .node("modern-button-placement"))
         .type(TypeToken.get(ModernServerLinkPlacement.class)))
      .defaultValue(ModernServerLinkPlacement.REPLACE_REPORT_BUGS)
      .notifyClient()
      .build();

   ServerLinkModule() {
      this.registerOptions(LEGACY_BUTTON_PLACEMENT, MODERN_BUTTON_PLACEMENT);
   }

   public abstract void overrideServerLinkResource(Recipients var1, ResourceLocationIcon var2);

   public abstract void resetServerLinkResource(Recipients var1);

   public abstract void addServerLink(Recipients var1, ServerLink var2);

   public abstract void addServerLink(Recipients var1, List<ServerLink> var2);

   public abstract void removeServerLink(Recipients var1, String var2);

   public abstract void removeServerLink(Recipients var1, ServerLink var2);

   public abstract void removeServerLink(Recipients var1, List<String> var2);

   public abstract void resetServerLinks(Recipients var1);
}
