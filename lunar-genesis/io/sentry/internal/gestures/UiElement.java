package io.sentry.internal.gestures;

import io.sentry.util.Objects;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class UiElement {
   @NotNull
   final WeakReference<Object> viewRef;
   @Nullable
   final String className;
   @Nullable
   final String resourceName;
   @Nullable
   final String tag;
   @NotNull
   final String origin;

   public UiElement(@Nullable Object var1, @Nullable String var2, @Nullable String var3, @Nullable String var4, @NotNull String var5) {
      this.viewRef = new WeakReference<>(var1);
      this.className = var2;
      this.resourceName = var3;
      this.tag = var4;
      this.origin = var5;
   }

   @Nullable
   public String getClassName() {
      return this.className;
   }

   @Nullable
   public String getResourceName() {
      return this.resourceName;
   }

   @Nullable
   public String getTag() {
      return this.tag;
   }

   @NotNull
   public String getOrigin() {
      return this.origin;
   }

   @NotNull
   public String getIdentifier() {
      return this.resourceName != null ? this.resourceName : Objects.requireNonNull(this.tag, "UiElement.tag can't be null");
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         UiElement var2 = (UiElement)var1;
         return Objects.equals(this.className, var2.className) && Objects.equals(this.resourceName, var2.resourceName) && Objects.equals(this.tag, var2.tag);
      } else {
         return false;
      }
   }

   @Nullable
   public Object getView() {
      return this.viewRef.get();
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.viewRef, this.resourceName, this.tag);
   }

   public enum Type {
      CLICKABLE,
      SCROLLABLE;
   }
}
