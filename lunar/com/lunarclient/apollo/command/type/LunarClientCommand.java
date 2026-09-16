package com.lunarclient.apollo.command.type;

import com.lunarclient.apollo.command.AbstractApolloCommand;
import com.moonsworth.lunar.lib.adventure.text.Component;
import java.util.function.BiConsumer;

public class LunarClientCommand<T> extends AbstractApolloCommand<T> {
   protected LunarClientCommand(BiConsumer<T, Component> var1) {
      super(var1);
   }
}
