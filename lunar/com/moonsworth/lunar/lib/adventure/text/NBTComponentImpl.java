package com.moonsworth.lunar.lib.adventure.text;

import com.moonsworth.lunar.lib.adventure.text.format.Style;
import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

abstract class NBTComponentImpl<C extends NBTComponent<C, B>, B extends NBTComponentBuilder<C, B>> extends AbstractComponent implements NBTComponent<C, B> {
   static final boolean INTERPRET_DEFAULT = false;
   final String nbtPath;
   final boolean interpret;
   @Nullable
   final Component separator;

   NBTComponentImpl(@NotNull List<Component> var1, @NotNull Style var2, String var3, boolean var4, @Nullable Component var5) {
      super(var1, var2);
      this.nbtPath = var3;
      this.interpret = var4;
      this.separator = var5;
   }

   @NotNull
   @Override
   public String nbtPath() {
      return this.nbtPath;
   }

   @Override
   public boolean interpret() {
      return this.interpret;
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      if (this == var1) {
         return true;
      }

      if (!(var1 instanceof NBTComponent)) {
         return false;
      }

      if (!super.equals(var1)) {
         return false;
      }

      NBTComponent var2 = (NBTComponent)var1;
      return Objects.equals(this.nbtPath, var2.nbtPath()) && this.interpret == var2.interpret() && Objects.equals(this.separator, var2.separator());
   }

   @Override
   public int hashCode() {
      int var1 = super.hashCode();
      var1 = 31 * var1 + this.nbtPath.hashCode();
      var1 = 31 * var1 + Boolean.hashCode(this.interpret);
      return 31 * var1 + Objects.hashCode(this.separator);
   }
}
