package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.lunarclient.adventure.matcher.ComponentMatcher;
import com.lunarclient.adventure.pattern.ComponentPattern;
import com.lunarclient.adventure.pattern.StylePattern;
import com.moonsworth.lunar.lib.adventure.text.format.NamedTextColor;
import com.moonsworth.lunar.lib.adventure.text.format.TextDecoration;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import lombok.Generated;

public enum HRCHROOHRIHCRCRHRIIROCIRHOIRHH {
   ADMIN("ADMIN", NamedTextColor.DARK_RED, '4'),
   ULTIMATE("ULTIMATE", NamedTextColor.DARK_RED, '4'),
   VERY_SPECIAL("VERY SPECIAL", NamedTextColor.RED, 'c'),
   SPECIAL("SPECIAL", NamedTextColor.RED, 'c'),
   DIVINE("DIVINE", NamedTextColor.AQUA, 'b'),
   MYTHIC("MYTHIC", NamedTextColor.LIGHT_PURPLE, 'd'),
   LEGENDARY("LEGENDARY", NamedTextColor.GOLD, '6'),
   EPIC("EPIC", NamedTextColor.DARK_PURPLE, '5'),
   RARE("RARE", NamedTextColor.BLUE, '9'),
   UNCOMMON("UNCOMMON", NamedTextColor.GREEN, 'a'),
   COMMON("COMMON", NamedTextColor.WHITE, 'f'),
   NONE(null, null, null);

   private final String tag;
   private final String reverseTag;
   private final Character code;
   private final ComponentMatcher matcher;
   private final NamedTextColor namedTextColor;
   private final Pattern startsWithAnalyzer;

   HRCHROOHRIHCRCRHRIIROCIRHOIRHH(String var3, NamedTextColor var4, Character var5) {
      this.tag = var3;
      this.reverseTag = var3 != null ? new StringBuilder(var3).reverse().toString() : null;
      this.code = var5;
      String var6 = this.reverseTag != null ? "(" + var3 + "|" + this.reverseTag + ")" : var3;
      this.matcher = var3 == null
         ? null
         : ComponentMatcher.pattern(ComponentPattern.regex(var6, StylePattern.builder().color(var4).decoration(TextDecoration.BOLD)));
      this.startsWithAnalyzer = Pattern.compile("^(a )?(SHINY )?" + var6);
      this.namedTextColor = var4;
   }

   @Nullable
   public static HRCHROOHRIHCRCRHRIIROCIRHOIRHH fromRarity(@Nullable String var0) {
      if (var0 == null) {
         return null;
      }

      String var1 = var0.toUpperCase(Locale.ROOT);

      for (HRCHROOHRIHCRCRHRIIROCIRHOIRHH var5 : values()) {
         if (var5.getTag().equals(var1) || var5.getReverseTag().equals(var1)) {
            return var5;
         }
      }

      return null;
   }

   @Nullable
   public static HRCHROOHRIHCRCRHRIIROCIRHOIRHH fromCode(char var0) {
      for (HRCHROOHRIHCRCRHRIIROCIRHOIRHH var4 : values()) {
         if (var4.getCode() == var0) {
            return var4;
         }
      }

      return null;
   }

   @Generated
   public String getTag() {
      return this.tag;
   }

   @Generated
   public String getReverseTag() {
      return this.reverseTag;
   }

   @Generated
   public Character getCode() {
      return this.code;
   }

   @Generated
   public ComponentMatcher getMatcher() {
      return this.matcher;
   }

   @Generated
   public NamedTextColor getNamedTextColor() {
      return this.namedTextColor;
   }

   @Generated
   public Pattern getStartsWithAnalyzer() {
      return this.startsWithAnalyzer;
   }
}
