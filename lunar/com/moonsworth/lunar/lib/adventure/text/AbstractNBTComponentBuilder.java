package com.moonsworth.lunar.lib.adventure.text;

import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

abstract class AbstractNBTComponentBuilder<C extends NBTComponent<C, B>, B extends NBTComponentBuilder<C, B>>
   extends AbstractComponentBuilder<C, B>
   implements NBTComponentBuilder<C, B> {
   @Nullable
   protected String nbtPath;
   protected boolean interpret = false;
   @Nullable
   protected Component separator;

   AbstractNBTComponentBuilder() {
   }

   AbstractNBTComponentBuilder(@NotNull C var1) {
      super((C)var1);
      this.nbtPath = var1.nbtPath();
      this.interpret = var1.interpret();
      this.separator = var1.separator();
   }

   @NotNull
   @Override
   public B nbtPath(@NotNull String var1) {
      this.nbtPath = Objects.requireNonNull(var1, "nbtPath");
      return (B)this;
   }

   @NotNull
   @Override
   public B interpret(boolean var1) {
      this.interpret = var1;
      return (B)this;
   }

   @NotNull
   @Override
   public B separator(@Nullable ComponentLike var1) {
      this.separator = ComponentLike.unbox(var1);
      return (B)this;
   }
}
