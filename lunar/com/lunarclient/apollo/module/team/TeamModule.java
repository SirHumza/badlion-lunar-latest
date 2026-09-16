package com.lunarclient.apollo.module.team;

import com.lunarclient.apollo.module.ApolloModule;
import com.lunarclient.apollo.module.ModuleDefinition;
import com.lunarclient.apollo.recipients.Recipients;
import java.util.List;
import org.jetbrains.annotations.ApiStatus;

@ModuleDefinition(id = "team", name = "Team")
@ApiStatus.NonExtendable
public abstract class TeamModule extends ApolloModule {
   public abstract void updateTeamMembers(Recipients var1, List<TeamMember> var2);

   public abstract void resetTeamMembers(Recipients var1);
}
