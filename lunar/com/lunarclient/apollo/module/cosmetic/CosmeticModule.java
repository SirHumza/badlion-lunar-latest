package com.lunarclient.apollo.module.cosmetic;

import com.lunarclient.apollo.common.location.ApolloBlockLocation;
import com.lunarclient.apollo.module.ApolloModule;
import com.lunarclient.apollo.module.ModuleDefinition;
import com.lunarclient.apollo.recipients.Recipients;
import java.util.List;
import java.util.UUID;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

@ModuleDefinition(id = "cosmetic", name = "Cosmetic")
@ApiStatus.NonExtendable
public abstract class CosmeticModule extends ApolloModule {
   public abstract void equipNpcCosmetics(Recipients var1, UUID var2, List<Cosmetic> var3);

   public abstract void equipNpcCosmetics(Recipients var1, UUID var2, List<Cosmetic> var3, boolean var4);

   public abstract void unequipNpcCosmetics(Recipients var1, UUID var2, List<Integer> var3);

   public abstract void resetNpcCosmetics(Recipients var1, UUID var2);

   public abstract void startNpcEmote(Recipients var1, UUID var2, Emote var3);

   public abstract void stopNpcEmote(Recipients var1, UUID var2);

   public abstract void resetNpcEmotes(Recipients var1);

   public abstract void displaySpray(Recipients var1, Spray var2);

   public abstract void removeSpray(Recipients var1, @Range(from = 1L, to = 2147483647L) int var2);

   public abstract void removeSpray(Recipients var1, @Range(from = 1L, to = 2147483647L) int var2, @Nullable ApolloBlockLocation var3);

   public abstract void resetSprays(Recipients var1);
}
