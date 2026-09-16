package com.moonsworth.lunar.lib.adventure.audience;

import com.moonsworth.lunar.lib.adventure.resource.ResourcePackCallback;
import com.moonsworth.lunar.lib.adventure.text.ComponentLike;
import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Consumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import org.jetbrains.annotations.NotNull;

public final class Audiences {
   static final Collector<? super Audience, ?, ForwardingAudience> COLLECTOR = Collectors.collectingAndThen(
      Collectors.toCollection(ArrayList::new), var0 -> Audience.audience(Collections.unmodifiableCollection(var0))
   );

   private Audiences() {
   }

   @NotNull
   public static Consumer<? super Audience> sendingMessage(@NotNull ComponentLike var0) {
      return var1 -> var1.sendMessage(var0);
   }

   @NotNull
   static ResourcePackCallback unwrapCallback(Audience var0, Audience var1, @NotNull ResourcePackCallback var2) {
      return var2 == ResourcePackCallback.noOp() ? var2 : (var3, var4, var5) -> var2.packEventReceived(var3, var4, var5 == var1 ? var0 : var5);
   }
}
