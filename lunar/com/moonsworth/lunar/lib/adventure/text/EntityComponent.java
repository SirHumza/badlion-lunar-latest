package com.moonsworth.lunar.lib.adventure.text;

import com.moonsworth.lunar.lib.adventure.text.event.HoverEvent;
import java.util.Deque;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

@FunctionalInterface
@ApiStatus.NonExtendable
public interface ComponentIteratorType {
   ComponentIteratorType DEPTH_FIRST = (var0, var1, var2) -> {
      if (var2.contains(ComponentIteratorFlag.INCLUDE_TRANSLATABLE_COMPONENT_ARGUMENTS) && var0 instanceof TranslatableComponent) {
         TranslatableComponent var3 = (TranslatableComponent)var0;
         List var4 = var3.arguments();

         for (int var5 = var4.size() - 1; var5 >= 0; var5--) {
            var1.addFirst(((ComponentLike)var4.get(var5)).asComponent());
         }
      }

      HoverEvent var6 = var0.hoverEvent();
      if (var6 != null) {
         HoverEvent.Action var7 = var6.action();
         if (var2.contains(ComponentIteratorFlag.INCLUDE_HOVER_SHOW_ENTITY_NAME) && var7 == HoverEvent.Action.SHOW_ENTITY) {
            var1.addFirst(((HoverEvent.ShowEntity)var6.value()).name());
         } else if (var2.contains(ComponentIteratorFlag.INCLUDE_HOVER_SHOW_TEXT_COMPONENT) && var7 == HoverEvent.Action.SHOW_TEXT) {
            var1.addFirst((Component)var6.value());
         }
      }

      List var8 = var0.children();

      for (int var9 = var8.size() - 1; var9 >= 0; var9--) {
         var1.addFirst((Component)var8.get(var9));
      }
   };
   ComponentIteratorType BREADTH_FIRST = (var0, var1, var2) -> {
      if (var2.contains(ComponentIteratorFlag.INCLUDE_TRANSLATABLE_COMPONENT_ARGUMENTS) && var0 instanceof TranslatableComponent) {
         for (TranslationArgument var4 : ((TranslatableComponent)var0).arguments()) {
            var1.add(var4.asComponent());
         }
      }

      HoverEvent var5 = var0.hoverEvent();
      if (var5 != null) {
         HoverEvent.Action var6 = var5.action();
         if (var2.contains(ComponentIteratorFlag.INCLUDE_HOVER_SHOW_ENTITY_NAME) && var6 == HoverEvent.Action.SHOW_ENTITY) {
            var1.addLast(((HoverEvent.ShowEntity)var5.value()).name());
         } else if (var2.contains(ComponentIteratorFlag.INCLUDE_HOVER_SHOW_TEXT_COMPONENT) && var6 == HoverEvent.Action.SHOW_TEXT) {
            var1.addLast((Component)var5.value());
         }
      }

      var1.addAll(var0.children());
   };

   void populate(@NotNull Component var1, @NotNull Deque<Component> var2, @NotNull Set<ComponentIteratorFlag> var3);
}
