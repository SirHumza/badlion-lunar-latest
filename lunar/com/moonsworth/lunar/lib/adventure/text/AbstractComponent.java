package com.moonsworth.lunar.lib.adventure.text;

import com.moonsworth.lunar.lib.adventure.text.format.Style;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import net.kyori.examination.string.StringExaminer;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Debug;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Deprecated
@ApiStatus.ScheduledForRemoval(inVersion = "5.0.0")
@Debug.Renderer(text = "this.debuggerString()", childrenArray = "this.children().toArray()", hasChildren = "!this.children().isEmpty()")
public abstract class AbstractComponent implements Component {
   protected final List<Component> children;
   protected final Style style;

   protected AbstractComponent(@NotNull List<? extends ComponentLike> var1, @NotNull Style var2) {
      this.children = ComponentLike.asComponents(var1, IS_NOT_EMPTY);
      this.style = var2;
   }

   @NotNull
   @Override
   public final List<Component> children() {
      return this.children;
   }

   @NotNull
   @Override
   public final Style style() {
      return this.style;
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      if (this == var1) {
         return true;
      }

      if (!(var1 instanceof AbstractComponent)) {
         return false;
      }

      AbstractComponent var2 = (AbstractComponent)var1;
      return Objects.equals(this.children, var2.children) && Objects.equals(this.style, var2.style);
   }

   @Override
   public int hashCode() {
      int var1 = this.children.hashCode();
      return 31 * var1 + this.style.hashCode();
   }

   @Override
   public abstract String toString();

   private String debuggerString() {
      Stream var1 = this.examinableProperties().filter(var0 -> !var0.name().equals("children"));
      return StringExaminer.simpleEscaping().examine(this.examinableName(), var1);
   }
}
