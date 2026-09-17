package com.lunarclient.adventure.transform.transformable;

import com.lunarclient.adventure.transform.renderer.ComponentTransformRenderer;
import com.lunarclient.adventure.transform.transformation.Transformation;
import com.moonsworth.lunar.lib.adventure.text.Component;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface ComponentTransformable {
   @Nullable
   <S extends ComponentTransformRenderer.State> ComponentTransformRenderer.TransformableResult renderSelf(
      @NotNull ComponentTransformRenderer<S> var1, @NotNull Component var2, @Nullable List<Transformation<?, ?>> var3, @NotNull S var4
   );
}
