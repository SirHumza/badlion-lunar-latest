package com.moonsworth.lunar.lib.adventure.identity;

import com.moonsworth.lunar.lib.adventure.key.Key;
import com.moonsworth.lunar.lib.adventure.pointer.Pointer;
import com.moonsworth.lunar.lib.adventure.text.Component;
import java.util.Locale;
import java.util.UUID;
import java.util.stream.Stream;
import net.kyori.examination.Examinable;
import net.kyori.examination.ExaminableProperty;
import org.jetbrains.annotations.NotNull;

public interface Identity extends Identified, Examinable {
   Pointer<String> NAME = Pointer.pointer(String.class, Key.key("adventure", "name"));
   Pointer<UUID> UUID = Pointer.pointer(UUID.class, Key.key("adventure", "uuid"));
   Pointer<Component> DISPLAY_NAME = Pointer.pointer(Component.class, Key.key("adventure", "display_name"));
   Pointer<Locale> LOCALE = Pointer.pointer(Locale.class, Key.key("adventure", "locale"));

   @NotNull
   static Identity nil() {
      return NilIdentity.INSTANCE;
   }

   @NotNull
   static Identity identity(@NotNull UUID var0) {
      return var0.equals(NilIdentity.NIL_UUID) ? NilIdentity.INSTANCE : new IdentityImpl(var0);
   }

   @NotNull
   UUID uuid();

   @NotNull
   @Override
   default Identity identity() {
      return this;
   }

   @NotNull
   @Override
   default Stream<? extends ExaminableProperty> examinableProperties() {
      return Stream.of(ExaminableProperty.of("uuid", this.uuid()));
   }
}
