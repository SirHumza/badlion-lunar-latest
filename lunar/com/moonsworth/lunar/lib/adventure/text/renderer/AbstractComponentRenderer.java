package com.moonsworth.lunar.lib.adventure.text.renderer;

import com.moonsworth.lunar.lib.adventure.text.BlockNBTComponent;
import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.EntityNBTComponent;
import com.moonsworth.lunar.lib.adventure.text.KeybindComponent;
import com.moonsworth.lunar.lib.adventure.text.NBTComponent;
import com.moonsworth.lunar.lib.adventure.text.ScoreComponent;
import com.moonsworth.lunar.lib.adventure.text.SelectorComponent;
import com.moonsworth.lunar.lib.adventure.text.StorageNBTComponent;
import com.moonsworth.lunar.lib.adventure.text.TextComponent;
import com.moonsworth.lunar.lib.adventure.text.TranslatableComponent;
import com.moonsworth.lunar.lib.adventure.text.VirtualComponent;
import org.jetbrains.annotations.NotNull;

public abstract class AbstractComponentRenderer<C> implements ComponentRenderer<C> {
   @NotNull
   @Override
   public Component render(@NotNull Component var1, @NotNull C var2) {
      if (var1 instanceof VirtualComponent) {
         var1 = this.renderVirtual((VirtualComponent)var1, (C)var2);
      }

      if (var1 instanceof TextComponent) {
         return this.renderText((TextComponent)var1, (C)var2);
      }

      if (var1 instanceof TranslatableComponent) {
         return this.renderTranslatable((TranslatableComponent)var1, (C)var2);
      }

      if (var1 instanceof KeybindComponent) {
         return this.renderKeybind((KeybindComponent)var1, (C)var2);
      }

      if (var1 instanceof ScoreComponent) {
         return this.renderScore((ScoreComponent)var1, (C)var2);
      }

      if (var1 instanceof SelectorComponent) {
         return this.renderSelector((SelectorComponent)var1, (C)var2);
      }

      if (var1 instanceof NBTComponent) {
         if (var1 instanceof BlockNBTComponent) {
            return this.renderBlockNbt((BlockNBTComponent)var1, (C)var2);
         }

         if (var1 instanceof EntityNBTComponent) {
            return this.renderEntityNbt((EntityNBTComponent)var1, (C)var2);
         }

         if (var1 instanceof StorageNBTComponent) {
            return this.renderStorageNbt((StorageNBTComponent)var1, (C)var2);
         }
      }

      return var1;
   }

   @NotNull
   protected abstract Component renderBlockNbt(@NotNull BlockNBTComponent var1, @NotNull C var2);

   @NotNull
   protected abstract Component renderEntityNbt(@NotNull EntityNBTComponent var1, @NotNull C var2);

   @NotNull
   protected abstract Component renderStorageNbt(@NotNull StorageNBTComponent var1, @NotNull C var2);

   @NotNull
   protected abstract Component renderKeybind(@NotNull KeybindComponent var1, @NotNull C var2);

   @NotNull
   protected abstract Component renderScore(@NotNull ScoreComponent var1, @NotNull C var2);

   @NotNull
   protected abstract Component renderSelector(@NotNull SelectorComponent var1, @NotNull C var2);

   @NotNull
   protected abstract Component renderText(@NotNull TextComponent var1, @NotNull C var2);

   @NotNull
   protected Component renderVirtual(@NotNull VirtualComponent var1, @NotNull C var2) {
      return var1;
   }

   @NotNull
   protected abstract Component renderTranslatable(@NotNull TranslatableComponent var1, @NotNull C var2);
}
