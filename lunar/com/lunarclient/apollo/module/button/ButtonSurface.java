package com.lunarclient.apollo.module.button;

import com.google.protobuf.Message;
import com.lunarclient.apollo.button.v1.ButtonUpdate;
import com.lunarclient.apollo.common.button.ApolloButton;
import com.lunarclient.apollo.player.ApolloPlayer;
import java.util.List;
import org.jetbrains.annotations.Nullable;

public interface ButtonSurface<B extends ApolloButton, P extends Message> {
   void validate(B var1);

   P toDisplayElement(B var1, @Nullable ApolloPlayer var2);

   Message createDisplay(List<P> var1);

   Message createUpdate(String var1, ButtonUpdate var2);

   Message createRemove(String var1);

   Message createReset();

   boolean isOpenTrackingActive();
}
