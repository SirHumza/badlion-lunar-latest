package com.lunarclient.apollo.module.limb;

import com.lunarclient.apollo.module.ApolloModule;
import com.lunarclient.apollo.module.ModuleDefinition;
import com.lunarclient.apollo.recipients.Recipients;
import java.util.Collection;
import java.util.UUID;
import org.jetbrains.annotations.ApiStatus;

@ModuleDefinition(id = "limb", name = "Limb")
@ApiStatus.NonExtendable
public abstract class LimbModule extends ApolloModule {
   public abstract void hideArmorPieces(Recipients var1, UUID var2, Collection<ArmorPiece> var3);

   public abstract void resetArmorPieces(Recipients var1, UUID var2, Collection<ArmorPiece> var3);

   public abstract void hideBodyParts(Recipients var1, UUID var2, Collection<BodyPart> var3);

   public abstract void resetBodyParts(Recipients var1, UUID var2, Collection<BodyPart> var3);
}
