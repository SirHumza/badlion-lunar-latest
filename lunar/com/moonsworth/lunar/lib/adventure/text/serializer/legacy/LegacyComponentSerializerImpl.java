package com.moonsworth.lunar.lib.adventure.text.serializer.legacy;

import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.TextComponent;
import com.moonsworth.lunar.lib.adventure.text.TextReplacementConfig;
import com.moonsworth.lunar.lib.adventure.text.event.ClickEvent;
import com.moonsworth.lunar.lib.adventure.text.flattener.ComponentFlattener;
import com.moonsworth.lunar.lib.adventure.text.flattener.FlattenerListener;
import com.moonsworth.lunar.lib.adventure.text.format.NamedTextColor;
import com.moonsworth.lunar.lib.adventure.text.format.Style;
import com.moonsworth.lunar.lib.adventure.text.format.TextColor;
import com.moonsworth.lunar.lib.adventure.text.format.TextDecoration;
import com.moonsworth.lunar.lib.adventure.text.format.TextFormat;
import com.moonsworth.lunar.lib.adventure.util.Services;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class LegacyComponentSerializerImpl implements LegacyComponentSerializer {
   static final Pattern DEFAULT_URL_PATTERN = Pattern.compile("(?:(https?)://)?([-\\w_.]+\\.\\w{2,})(/([A-Za-z0-9\\-._~!$&'()*+,;=:@/]|%[0-9A-Fa-f]{2})*)?");
   static final Pattern URL_SCHEME_PATTERN = Pattern.compile("^[a-z][a-z0-9+\\-.]*:");
   private static final TextDecoration[] DECORATIONS = TextDecoration.values();
   private static final char LEGACY_BUNGEE_HEX_CHAR = 'x';
   private static final Optional<LegacyComponentSerializer.Provider> SERVICE = Services.service(LegacyComponentSerializer.Provider.class);
   static final Consumer<LegacyComponentSerializer.Builder> BUILDER = SERVICE.map(LegacyComponentSerializer.Provider::legacy).orElseGet(() -> var0 -> {});
   private final char character;
   private final char hexCharacter;
   @Nullable
   private final TextReplacementConfig urlReplacementConfig;
   private final boolean hexColours;
   private final boolean useTerriblyStupidHexFormat;
   private final ComponentFlattener flattener;
   private final CharacterAndFormatSet formats;

   LegacyComponentSerializerImpl(
      char var1, char var2, @Nullable TextReplacementConfig var3, boolean var4, boolean var5, ComponentFlattener var6, CharacterAndFormatSet var7
   ) {
      this.character = var1;
      this.hexCharacter = var2;
      this.urlReplacementConfig = var3;
      this.hexColours = var4;
      this.useTerriblyStupidHexFormat = var5;
      this.flattener = var6;
      this.formats = var7;
   }

   @Nullable
   private LegacyComponentSerializerImpl.FormatCodeType determineFormatType(char var1, String var2, int var3) {
      if (var3 >= 14) {
         int var4 = var3 - 14;
         int var5 = var3 - 13;
         if (var2.charAt(var4) == this.character && var2.charAt(var5) == 'x') {
            return LegacyComponentSerializerImpl.FormatCodeType.BUNGEECORD_UNUSUAL_HEX;
         }
      }

      if (var1 == this.hexCharacter && var2.length() - var3 >= 6) {
         return LegacyComponentSerializerImpl.FormatCodeType.KYORI_HEX;
      } else {
         return this.formats.characters.indexOf(var1) != -1 ? LegacyComponentSerializerImpl.FormatCodeType.MOJANG_LEGACY : null;
      }
   }

   @Nullable
   static LegacyFormat legacyFormat(char var0) {
      int var1 = CharacterAndFormatSet.DEFAULT.characters.indexOf(var0);
      if (var1 != -1) {
         TextFormat var2 = CharacterAndFormatSet.DEFAULT.formats.get(var1);
         if (var2 instanceof NamedTextColor) {
            return new LegacyFormat((NamedTextColor)var2);
         }

         if (var2 instanceof TextDecoration) {
            return new LegacyFormat((TextDecoration)var2);
         }

         if (var2 instanceof Reset) {
            return LegacyFormat.RESET;
         }
      }

      return null;
   }

   @Nullable
   private LegacyComponentSerializerImpl.DecodedFormat decodeTextFormat(char var1, String var2, int var3) {
      LegacyComponentSerializerImpl.FormatCodeType var4 = this.determineFormatType(var1, var2, var3);
      if (var4 == null) {
         return null;
      }

      if (var4 == LegacyComponentSerializerImpl.FormatCodeType.KYORI_HEX) {
         TextColor var5 = tryParseHexColor(var2.substring(var3, var3 + 6));
         if (var5 != null) {
            return new LegacyComponentSerializerImpl.DecodedFormat(var4, var5);
         }
      } else {
         if (var4 == LegacyComponentSerializerImpl.FormatCodeType.MOJANG_LEGACY) {
            return new LegacyComponentSerializerImpl.DecodedFormat(var4, this.formats.formats.get(this.formats.characters.indexOf(var1)));
         }

         if (var4 == LegacyComponentSerializerImpl.FormatCodeType.BUNGEECORD_UNUSUAL_HEX) {
            StringBuilder var7 = new StringBuilder(6);

            for (int var6 = var3 - 1; var6 >= var3 - 11; var6 -= 2) {
               var7.append(var2.charAt(var6));
            }

            TextColor var8 = tryParseHexColor(var7.reverse().toString());
            if (var8 != null) {
               return new LegacyComponentSerializerImpl.DecodedFormat(var4, var8);
            }
         }
      }

      return null;
   }

   @Nullable
   private static TextColor tryParseHexColor(String var0) {
      try {
         int var1 = Integer.parseInt(var0, 16);
         return TextColor.color(var1);
      } catch (NumberFormatException var2) {
         return null;
      }
   }

   private static boolean isHexTextColor(TextFormat var0) {
      return var0 instanceof TextColor && !(var0 instanceof NamedTextColor);
   }

   @Nullable
   private String toLegacyCode(TextFormat var1) {
      if (isHexTextColor(var1)) {
         TextColor var2 = (TextColor)var1;
         if (this.hexColours) {
            String var3 = String.format("%06x", var2.value());
            if (!this.useTerriblyStupidHexFormat) {
               return this.hexCharacter + var3;
            }

            StringBuilder var4 = new StringBuilder(String.valueOf('x'));
            int var5 = 0;

            for (int var6 = var3.length(); var5 < var6; var5++) {
               var4.append(this.character).append(var3.charAt(var5));
            }

            return var4.toString();
         }

         if (!(var2 instanceof NamedTextColor)) {
            var1 = TextColor.nearestColorTo(this.formats.colors, var2);
         }
      }

      int var7 = this.formats.formats.indexOf(var1);
      return var7 == -1 ? null : Character.toString(this.formats.characters.charAt(var7));
   }

   private TextComponent extractUrl(TextComponent var1) {
      if (this.urlReplacementConfig == null) {
         return var1;
      }

      Component var2 = var1.replaceText(this.urlReplacementConfig);
      return var2 instanceof TextComponent ? (TextComponent)var2 : Component.text().append(var2).build();
   }

   @NotNull
   @Override
   public TextComponent deserialize(@NotNull String var1) {
      int var2 = var1.lastIndexOf(this.character, var1.length() - 2);
      if (var2 == -1) {
         return this.extractUrl(Component.text(var1));
      }

      ArrayList var3 = new ArrayList();
      TextComponent.Builder var4 = null;
      boolean var5 = false;
      int var6 = var1.length();

      do {
         LegacyComponentSerializerImpl.DecodedFormat var7 = this.decodeTextFormat(var1.charAt(var2 + 1), var1, var2 + 2);
         if (var7 != null) {
            int var8 = var2 + (var7.encodedFormat == LegacyComponentSerializerImpl.FormatCodeType.KYORI_HEX ? 8 : 2);
            if (var8 != var6) {
               if (var4 != null) {
                  if (var5) {
                     var3.add(var4.build());
                     var5 = false;
                     var4 = Component.text();
                  } else {
                     var4 = Component.text().append(var4.build());
                  }
               } else {
                  var4 = Component.text();
               }

               var4.content(var1.substring(var8, var6));
            } else if (var4 == null) {
               var4 = Component.text();
            }

            if (!var5) {
               var5 = applyFormat(var4, var7.format);
            }

            if (var7.encodedFormat == LegacyComponentSerializerImpl.FormatCodeType.BUNGEECORD_UNUSUAL_HEX) {
               var2 -= 12;
            }

            var6 = var2;
         }

         var2 = var1.lastIndexOf(this.character, var2 - 1);
      } while (var2 != -1);

      if (var4 != null) {
         var3.add(var4.build());
      }

      String var9 = var6 > 0 ? var1.substring(0, var6) : "";
      if (var3.size() == 1 && var9.isEmpty()) {
         return this.extractUrl((TextComponent)var3.get(0));
      }

      Collections.reverse(var3);
      return this.extractUrl(Component.text().content(var9).append(var3).build());
   }

   @NotNull
   @Override
   public String serialize(@NotNull Component var1) {
      LegacyComponentSerializerImpl.Cereal var2 = new LegacyComponentSerializerImpl.Cereal();
      this.flattener.flatten(var1, var2);
      return var2.toString();
   }

   private static boolean applyFormat(TextComponent.@NotNull Builder var0, @NotNull TextFormat var1) {
      if (var1 instanceof TextColor) {
         var0.colorIfAbsent((TextColor)var1);
         return true;
      } else if (var1 instanceof TextDecoration) {
         var0.decoration((TextDecoration)var1, TextDecoration.State.TRUE);
         return false;
      } else if (var1 instanceof Reset) {
         return true;
      } else {
         throw new IllegalArgumentException(String.format("unknown format '%s'", var1.getClass()));
      }
   }

   @NotNull
   public LegacyComponentSerializer.Builder toBuilder() {
      return new LegacyComponentSerializerImpl.BuilderImpl(this);
   }

   static final class BuilderImpl implements LegacyComponentSerializer.Builder {
      private char character = 167;
      private char hexCharacter = '#';
      private TextReplacementConfig urlReplacementConfig = null;
      private boolean hexColours = false;
      private boolean useTerriblyStupidHexFormat = false;
      private ComponentFlattener flattener = ComponentFlattener.basic();
      private CharacterAndFormatSet formats = CharacterAndFormatSet.DEFAULT;

      BuilderImpl() {
         LegacyComponentSerializerImpl.BUILDER.accept(this);
      }

      BuilderImpl(@NotNull LegacyComponentSerializerImpl var1) {
         this();
         this.character = var1.character;
         this.hexCharacter = var1.hexCharacter;
         this.urlReplacementConfig = var1.urlReplacementConfig;
         this.hexColours = var1.hexColours;
         this.useTerriblyStupidHexFormat = var1.useTerriblyStupidHexFormat;
         this.flattener = var1.flattener;
         this.formats = var1.formats;
      }

      @NotNull
      @Override
      public LegacyComponentSerializer.Builder character(char var1) {
         this.character = var1;
         return this;
      }

      @NotNull
      @Override
      public LegacyComponentSerializer.Builder hexCharacter(char var1) {
         this.hexCharacter = var1;
         return this;
      }

      @NotNull
      @Override
      public LegacyComponentSerializer.Builder extractUrls() {
         return this.extractUrls(LegacyComponentSerializerImpl.DEFAULT_URL_PATTERN, null);
      }

      @NotNull
      @Override
      public LegacyComponentSerializer.Builder extractUrls(@NotNull Pattern var1) {
         return this.extractUrls(var1, null);
      }

      @NotNull
      @Override
      public LegacyComponentSerializer.Builder extractUrls(@Nullable Style var1) {
         return this.extractUrls(LegacyComponentSerializerImpl.DEFAULT_URL_PATTERN, var1);
      }

      @NotNull
      @Override
      public LegacyComponentSerializer.Builder extractUrls(@NotNull Pattern var1, @Nullable Style var2) {
         Objects.requireNonNull(var1, "pattern");
         this.urlReplacementConfig = TextReplacementConfig.builder().match(var1).replacement(var1x -> {
            String var2x = var1x.content();
            if (!LegacyComponentSerializerImpl.URL_SCHEME_PATTERN.matcher(var2x).find()) {
               var2x = "http://" + var2x;
            }

            try {
               new URI(var2x);
               return (var2 == null ? var1x : var1x.style(var2)).clickEvent(ClickEvent.openUrl(var2x));
            } catch (URISyntaxException var4) {
               return var1x;
            }
         }).build();
         return this;
      }

      @NotNull
      @Override
      public LegacyComponentSerializer.Builder hexColors() {
         this.hexColours = true;
         return this;
      }

      @NotNull
      @Override
      public LegacyComponentSerializer.Builder useUnusualXRepeatedCharacterHexFormat() {
         this.useTerriblyStupidHexFormat = true;
         return this;
      }

      @NotNull
      @Override
      public LegacyComponentSerializer.Builder flattener(@NotNull ComponentFlattener var1) {
         this.flattener = Objects.requireNonNull(var1, "flattener");
         return this;
      }

      @NotNull
      @Override
      public LegacyComponentSerializer.Builder formats(@NotNull List<CharacterAndFormat> var1) {
         this.formats = CharacterAndFormatSet.of(var1);
         return this;
      }

      @NotNull
      @Override
      public LegacyComponentSerializer build() {
         return new LegacyComponentSerializerImpl(
            this.character, this.hexCharacter, this.urlReplacementConfig, this.hexColours, this.useTerriblyStupidHexFormat, this.flattener, this.formats
         );
      }
   }

   private final class Cereal implements FlattenerListener {
      private final StringBuilder sb = new StringBuilder();
      private final LegacyComponentSerializerImpl.Cereal.StyleState style = new LegacyComponentSerializerImpl.Cereal.StyleState();
      @Nullable
      private TextFormat lastWritten;
      private LegacyComponentSerializerImpl.Cereal.StyleState[] styles = new LegacyComponentSerializerImpl.Cereal.StyleState[8];
      private int head = -1;

      private Cereal() {
      }

      @Override
      public void pushStyle(@NotNull Style var1) {
         int var2 = ++this.head;
         if (var2 >= this.styles.length) {
            this.styles = Arrays.copyOf(this.styles, this.styles.length * 2);
         }

         LegacyComponentSerializerImpl.Cereal.StyleState var3 = this.styles[var2];
         if (var3 == null) {
            this.styles[var2] = var3 = new LegacyComponentSerializerImpl.Cereal.StyleState();
         }

         if (var2 > 0) {
            var3.set(this.styles[var2 - 1]);
         } else {
            var3.clear();
         }

         var3.apply(var1);
      }

      @Override
      public void component(@NotNull String var1) {
         if (!var1.isEmpty()) {
            if (this.head < 0) {
               throw new IllegalStateException("No style has been pushed!");
            }

            this.styles[this.head].applyFormat();
            this.sb.append(var1);
         }
      }

      @Override
      public void popStyle(@NotNull Style var1) {
         if (this.head-- < 0) {
            throw new IllegalStateException("Tried to pop beyond what was pushed!");
         }
      }

      void append(@NotNull TextFormat var1) {
         if (this.lastWritten != var1) {
            String var2 = LegacyComponentSerializerImpl.this.toLegacyCode(var1);
            if (var2 == null) {
               return;
            }

            this.sb.append(LegacyComponentSerializerImpl.this.character).append(var2);
         }

         this.lastWritten = var1;
      }

      @Override
      public String toString() {
         return this.sb.toString();
      }

      private final class StyleState {
         @Nullable
         private TextColor color;
         private final Set<TextDecoration> decorations = EnumSet.noneOf(TextDecoration.class);
         private boolean needsReset;

         StyleState() {
         }

         void set(@NotNull LegacyComponentSerializerImpl.Cereal.StyleState var1) {
            this.color = var1.color;
            this.decorations.clear();
            this.decorations.addAll(var1.decorations);
         }

         public void clear() {
            this.color = null;
            this.decorations.clear();
         }

         void apply(@NotNull Style var1) {
            TextColor var2 = var1.color();
            if (var2 != null) {
               this.color = var2;
            }

            int var3 = 0;

            for (int var4 = LegacyComponentSerializerImpl.DECORATIONS.length; var3 < var4; var3++) {
               TextDecoration var5 = LegacyComponentSerializerImpl.DECORATIONS[var3];
               switch (var1.decoration(var5)) {
                  case TRUE:
                     this.decorations.add(var5);
                     break;
                  case FALSE:
                     if (this.decorations.remove(var5)) {
                        this.needsReset = true;
                     }
               }
            }
         }

         void applyFormat() {
            boolean var1 = this.color != Cereal.this.style.color;
            if (this.needsReset) {
               if (!var1) {
                  Cereal.this.append(Reset.INSTANCE);
               }

               this.needsReset = false;
            }

            if (!var1 && Cereal.this.lastWritten != Reset.INSTANCE) {
               if (!this.decorations.containsAll(Cereal.this.style.decorations)) {
                  this.applyFullFormat();
               } else {
                  for (TextDecoration var3 : this.decorations) {
                     if (Cereal.this.style.decorations.add(var3)) {
                        Cereal.this.append(var3);
                     }
                  }
               }
            } else {
               this.applyFullFormat();
            }
         }

         private void applyFullFormat() {
            if (this.color != null) {
               Cereal.this.append(this.color);
            } else {
               Cereal.this.append(Reset.INSTANCE);
            }

            Cereal.this.style.color = this.color;

            for (TextDecoration var2 : this.decorations) {
               Cereal.this.append(var2);
            }

            Cereal.this.style.decorations.clear();
            Cereal.this.style.decorations.addAll(this.decorations);
         }
      }
   }

   static final class DecodedFormat {
      final LegacyComponentSerializerImpl.FormatCodeType encodedFormat;
      final TextFormat format;

      private DecodedFormat(LegacyComponentSerializerImpl.FormatCodeType var1, TextFormat var2) {
         if (var2 == null) {
            throw new IllegalStateException("No format found");
         }

         this.encodedFormat = var1;
         this.format = var2;
      }
   }

   enum FormatCodeType {
      MOJANG_LEGACY,
      KYORI_HEX,
      BUNGEECORD_UNUSUAL_HEX;
   }

   static final class Instances {
      static final LegacyComponentSerializer SECTION = LegacyComponentSerializerImpl.SERVICE
         .map(LegacyComponentSerializer.Provider::legacySection)
         .orElseGet(() -> new LegacyComponentSerializerImpl('§', '#', null, false, false, ComponentFlattener.basic(), CharacterAndFormatSet.DEFAULT));
      static final LegacyComponentSerializer AMPERSAND = LegacyComponentSerializerImpl.SERVICE
         .map(LegacyComponentSerializer.Provider::legacyAmpersand)
         .orElseGet(() -> new LegacyComponentSerializerImpl('&', '#', null, false, false, ComponentFlattener.basic(), CharacterAndFormatSet.DEFAULT));
   }
}
