package com.lunarclient.apollo.mods.impl;

import com.lunarclient.apollo.option.SimpleOption;
import io.leangen.geantyref.TypeToken;
import java.awt.Color;

public final class ModTeamView {
   public static final SimpleOption<Boolean> ENABLED = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("team-view", "enabled"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(true))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> APOLLO_TEAMS = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                     .comment("On supported servers, use our Apollo plugin for team detection."))
                  .node("team-view", "apollo-teams"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(true))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> TEAMVIEW_HYPIXEL = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                     .comment(
                        "If you are in a lobby, or in a game where your party members can be shown without giving you an unfair advantage (e.g. Skyblock), show them. Otherwise, if you're in a team game, show your teammate(s)."
                     ))
                  .node("team-view", "teamview-hypixel"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(true))
         .notifyClient())
      .build();
   public static final SimpleOption<Color> HYPIXEL_TEAM_COLOR = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("team-view", "hypixel-team-color"))
               .type(TypeToken.get(Color.class)))
            .defaultValue(new Color(43, 255, 65)))
         .notifyClient())
      .build();
   public static final SimpleOption<Color> HYPIXEL_PARTY_COLOR = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)SimpleOption.builder()
                  .node("team-view", "hypixel-party-color"))
               .type(TypeToken.get(Color.class)))
            .defaultValue(new Color(246, 198, 52)))
         .notifyClient())
      .build();

   private ModTeamView() {
   }
}
