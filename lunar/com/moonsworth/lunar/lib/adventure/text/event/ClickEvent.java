package com.moonsworth.lunar.lib.adventure.text.event;

import com.moonsworth.lunar.lib.adventure.audience.Audience;
import com.moonsworth.lunar.lib.adventure.builder.AbstractBuilder;
import com.moonsworth.lunar.lib.adventure.dialog.DialogLike;
import com.moonsworth.lunar.lib.adventure.internal.Internals;
import com.moonsworth.lunar.lib.adventure.key.Key;
import com.moonsworth.lunar.lib.adventure.key.Keyed;
import com.moonsworth.lunar.lib.adventure.nbt.api.BinaryTagHolder;
import com.moonsworth.lunar.lib.adventure.text.format.Style;
import com.moonsworth.lunar.lib.adventure.text.format.StyleBuilderApplicable;
import com.moonsworth.lunar.lib.adventure.util.Index;
import java.net.URL;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.stream.Stream;
import net.kyori.examination.Examinable;
import net.kyori.examination.ExaminableProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ClickEvent implements StyleBuilderApplicable, Examinable {
   private final ClickEvent.Action action;
   private final ClickEvent.Payload payload;

   @NotNull
   public static ClickEvent openUrl(@NotNull String var0) {
      return new ClickEvent(ClickEvent.Action.OPEN_URL, ClickEvent.Payload.string(var0));
   }

   @NotNull
   public static ClickEvent openUrl(@NotNull URL var0) {
      return openUrl(var0.toExternalForm());
   }

   @NotNull
   public static ClickEvent openFile(@NotNull String var0) {
      return new ClickEvent(ClickEvent.Action.OPEN_FILE, ClickEvent.Payload.string(var0));
   }

   @NotNull
   public static ClickEvent runCommand(@NotNull String var0) {
      return new ClickEvent(ClickEvent.Action.RUN_COMMAND, ClickEvent.Payload.string(var0));
   }

   @NotNull
   public static ClickEvent suggestCommand(@NotNull String var0) {
      return new ClickEvent(ClickEvent.Action.SUGGEST_COMMAND, ClickEvent.Payload.string(var0));
   }

   @Deprecated
   @NotNull
   public static ClickEvent changePage(@NotNull String var0) {
      Objects.requireNonNull(var0, "page");
      return new ClickEvent(ClickEvent.Action.CHANGE_PAGE, ClickEvent.Payload.integer(Integer.parseInt(var0)));
   }

   @NotNull
   public static ClickEvent changePage(int var0) {
      return new ClickEvent(ClickEvent.Action.CHANGE_PAGE, ClickEvent.Payload.integer(var0));
   }

   @NotNull
   public static ClickEvent copyToClipboard(@NotNull String var0) {
      return new ClickEvent(ClickEvent.Action.COPY_TO_CLIPBOARD, ClickEvent.Payload.string(var0));
   }

   @NotNull
   public static ClickEvent callback(@NotNull ClickCallback<Audience> var0) {
      return ClickCallbackInternals.PROVIDER.create(Objects.requireNonNull(var0, "function"), ClickCallbackOptionsImpl.DEFAULT);
   }

   @NotNull
   public static ClickEvent callback(@NotNull ClickCallback<Audience> var0, ClickCallback.@NotNull Options var1) {
      return ClickCallbackInternals.PROVIDER.create(Objects.requireNonNull(var0, "function"), Objects.requireNonNull(var1, "options"));
   }

   @NotNull
   public static ClickEvent callback(@NotNull ClickCallback<Audience> var0, @NotNull Consumer<ClickCallback.Options.Builder> var1) {
      return ClickCallbackInternals.PROVIDER
         .create(
            Objects.requireNonNull(var0, "function"),
            AbstractBuilder.configureAndBuild(ClickCallback.Options.builder(), Objects.requireNonNull(var1, "optionsBuilder"))
         );
   }

   @NotNull
   public static ClickEvent showDialog(@NotNull DialogLike var0) {
      Objects.requireNonNull(var0, "dialog");
      return new ClickEvent(ClickEvent.Action.SHOW_DIALOG, ClickEvent.Payload.dialog(var0));
   }

   @Deprecated
   @NotNull
   public static ClickEvent custom(@NotNull Key var0, @NotNull String var1) {
      return custom(var0, BinaryTagHolder.binaryTagHolder(var1));
   }

   @NotNull
   public static ClickEvent custom(@NotNull Key var0, @NotNull BinaryTagHolder var1) {
      Objects.requireNonNull(var0, "key");
      Objects.requireNonNull(var1, "nbt");
      return new ClickEvent(ClickEvent.Action.CUSTOM, ClickEvent.Payload.custom(var0, var1));
   }

   @Deprecated
   @NotNull
   public static ClickEvent clickEvent(@NotNull ClickEvent.Action var0, @NotNull String var1) {
      if (var0 == ClickEvent.Action.CHANGE_PAGE) {
         return changePage(var1);
      } else if (!var0.payloadType().equals(ClickEvent.Payload.Text.class)) {
         throw new IllegalArgumentException("Action " + var0 + " does not support string payloads");
      } else {
         return new ClickEvent(var0, ClickEvent.Payload.string(var1));
      }
   }

   @NotNull
   public static ClickEvent clickEvent(@NotNull ClickEvent.Action var0, @NotNull ClickEvent.Payload var1) {
      return new ClickEvent(var0, var1);
   }

   private ClickEvent(@NotNull ClickEvent.Action var1, @NotNull ClickEvent.Payload var2) {
      if (!var1.supports(var2)) {
         throw new IllegalArgumentException("Action " + var1 + " does not support payload " + var2);
      }

      this.action = Objects.requireNonNull(var1, "action");
      this.payload = Objects.requireNonNull(var2, "payload");
   }

   @NotNull
   public ClickEvent.Action action() {
      return this.action;
   }

   @Deprecated
   @NotNull
   public String value() {
      if (this.payload instanceof ClickEvent.Payload.Text) {
         return ((ClickEvent.Payload.Text)this.payload).value();
      } else if (this.action == ClickEvent.Action.CHANGE_PAGE) {
         return String.valueOf(((ClickEvent.Payload.Int)this.payload).integer());
      } else {
         throw new IllegalStateException("Payload is not a string payload, is " + this.payload);
      }
   }

   @NotNull
   public ClickEvent.Payload payload() {
      return this.payload;
   }

   @Override
   public void styleApply(Style.@NotNull Builder var1) {
      var1.clickEvent(this);
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         ClickEvent var2 = (ClickEvent)var1;
         return this.action == var2.action && Objects.equals(this.payload, var2.payload);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.action.hashCode();
      return 31 * var1 + this.payload.hashCode();
   }

   @NotNull
   @Override
   public Stream<? extends ExaminableProperty> examinableProperties() {
      return Stream.of(ExaminableProperty.of("action", this.action), ExaminableProperty.of("payload", this.payload));
   }

   @Override
   public String toString() {
      return Internals.toString(this);
   }

   public enum Action {
      OPEN_URL("open_url", true, ClickEvent.Payload.Text.class),
      OPEN_FILE("open_file", false, ClickEvent.Payload.Text.class),
      RUN_COMMAND("run_command", true, ClickEvent.Payload.Text.class),
      SUGGEST_COMMAND("suggest_command", true, ClickEvent.Payload.Text.class),
      CHANGE_PAGE("change_page", true, ClickEvent.Payload.Int.class),
      COPY_TO_CLIPBOARD("copy_to_clipboard", true, ClickEvent.Payload.Text.class),
      SHOW_DIALOG("show_dialog", false, ClickEvent.Payload.Dialog.class),
      CUSTOM("custom", true, ClickEvent.Payload.Custom.class);

      public static final Index<String, ClickEvent.Action> NAMES = Index.create(ClickEvent.Action.class, var0 -> var0.name);
      private final String name;
      private final boolean readable;
      private final Class<? extends ClickEvent.Payload> payloadType;

      Action(@NotNull String var3, boolean var4, @NotNull Class<? extends ClickEvent.Payload> var5) {
         this.name = var3;
         this.readable = var4;
         this.payloadType = var5;
      }

      public boolean readable() {
         return this.readable;
      }

      public boolean supports(@NotNull ClickEvent.Payload var1) {
         Objects.requireNonNull(var1, "payload");
         return this.payloadType.isAssignableFrom(var1.getClass());
      }

      @NotNull
      public Class<? extends ClickEvent.Payload> payloadType() {
         return this.payloadType;
      }

      @NotNull
      @Override
      public String toString() {
         return this.name;
      }
   }

   public interface Payload extends Examinable {
      static ClickEvent.Payload.@NotNull Text string(@NotNull String var0) {
         Objects.requireNonNull(var0, "value");
         return new PayloadImpl.TextImpl(var0);
      }

      static ClickEvent.Payload.@NotNull Int integer(int var0) {
         return new PayloadImpl.IntImpl(var0);
      }

      static ClickEvent.Payload.@NotNull Dialog dialog(@NotNull DialogLike var0) {
         Objects.requireNonNull(var0, "dialog");
         return new PayloadImpl.DialogImpl(var0);
      }

      @Deprecated
      static ClickEvent.Payload.@NotNull Custom custom(@NotNull Key var0, @NotNull String var1) {
         return custom(var0, BinaryTagHolder.binaryTagHolder(var1));
      }

      static ClickEvent.Payload.@NotNull Custom custom(@NotNull Key var0, @NotNull BinaryTagHolder var1) {
         Objects.requireNonNull(var0, "key");
         Objects.requireNonNull(var1, "nbt");
         return new PayloadImpl.CustomImpl(var0, var1);
      }

      interface Custom extends Keyed, ClickEvent.Payload {
         @Deprecated
         @NotNull
         String data();

         @NotNull
         BinaryTagHolder nbt();
      }

      interface Dialog extends ClickEvent.Payload {
         @NotNull
         DialogLike dialog();
      }

      interface Int extends ClickEvent.Payload {
         int integer();
      }

      interface Text extends ClickEvent.Payload {
         @NotNull
         String value();
      }
   }
}
