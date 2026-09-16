package com.lunarclient.apollo.module.entity;

import com.lunarclient.apollo.common.ApolloEntity;
import com.lunarclient.apollo.module.ApolloModule;
import com.lunarclient.apollo.module.ModuleDefinition;
import com.lunarclient.apollo.recipients.Recipients;
import java.util.List;
import org.jetbrains.annotations.ApiStatus;

@ModuleDefinition(id = "entity", name = "Entity")
@ApiStatus.NonExtendable
public abstract class EntityModule extends ApolloModule {
   public abstract void overrideRainbowSheep(Recipients var1, List<ApolloEntity> var2);

   public abstract void resetRainbowSheep(Recipients var1, List<ApolloEntity> var2);

   public abstract void flipEntity(Recipients var1, List<ApolloEntity> var2);

   public abstract void resetFlippedEntity(Recipients var1, List<ApolloEntity> var2);
}
