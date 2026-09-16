package io.sentry.internal.gestures;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface GestureTargetLocator {
   @Nullable
   UiElement locate(@NotNull Object var1, float var2, float var3, UiElement.Type var4);
}
