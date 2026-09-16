package com.lunarclient.apollo.module.chat;

import com.lunarclient.apollo.common.button.ApolloButton;
import com.lunarclient.apollo.module.button.ApolloButtonSerializer;
import java.awt.Color;
import org.spongepowered.configurate.ConfigurationNode;

public final class ChatButtonSerializer extends ApolloButtonSerializer<ChatButton> {
   @Override
   protected ApolloButton.ApolloButtonBuilder<? extends ChatButton, ?> createBuilder(ConfigurationNode var1) {
      ChatButton.ChatButtonBuilder var2 = ChatButton.builder();
      Color var3 = (Color)var1.node(new Object[]{"background-color"}).get(Color.class);
      if (var3 != null) {
         var2.backgroundColor(var3);
      }

      Color var4 = (Color)var1.node(new Object[]{"border-color"}).get(Color.class);
      if (var4 != null) {
         var2.borderColor(var4);
      }

      return var2;
   }
}
