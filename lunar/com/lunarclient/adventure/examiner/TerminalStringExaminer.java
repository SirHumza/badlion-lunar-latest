package com.lunarclient.adventure.examiner;

import com.lunarclient.adventure.utils.AdventureUtils;
import com.moonsworth.lunar.lib.adventure.text.format.TextColor;
import com.moonsworth.lunar.lib.adventure.util.HSVLike;
import java.awt.Color;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import net.kyori.ansi.ColorLevel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.TestOnly;

@TestOnly
public class TerminalStringExaminer extends CompactStringExaminer {
   private static final ColorLevel COLOR_LEVEL = ColorLevel.compute();
   private static final String RESET_CODE = "\u001b[0m";
   private static final int COLOR_AMOUNT = 6;
   private static final String[] COLOR_CODES = createColors();
   private static final String FIELD_COLOR = COLOR_LEVEL.determineEscape(new Color(124, 92, 144).getRGB());
   private static final String NUMBER_COLOR = COLOR_LEVEL.determineEscape(new Color(104, 151, 187).getRGB());
   private static final String BOOLEAN_COLOR = COLOR_LEVEL.determineEscape(new Color(204, 120, 50).getRGB());
   private int depth = -1;
   private int lastBracketSize = 2;

   public TerminalStringExaminer() {
      this(AdventureUtils.DEFAULT_ESCAPER, false);
   }

   public TerminalStringExaminer(@NotNull Function<String, String> var1, boolean var2) {
      super(var1, var2);
   }

   @Override
   protected void increaseDepth() {
      this.depth++;
   }

   @Override
   protected void decreaseDepth() {
      this.depth--;
   }

   @Override
   protected int bracketSize() {
      return this.lastBracketSize;
   }

   @Override
   protected String modifyField(String var1) {
      return "\u001b[" + FIELD_COLOR + "m" + var1 + "\u001b[0m";
   }

   @Override
   protected String modifyValue(String var1) {
      try {
         int var2 = Integer.parseInt(var1);
         return var2 >= 0 ? "\u001b[" + NUMBER_COLOR + "m" + var2 + "\u001b[0m" : "-\u001b[" + NUMBER_COLOR + "m" + Math.abs(var2) + "\u001b[0m";
      } catch (NumberFormatException var3) {
         return !var1.equals("true") && !var1.equals("false") ? var1 : "\u001b[" + BOOLEAN_COLOR + "m" + var1 + "\u001b[0m";
      }
   }

   @Override
   protected Collector<CharSequence, ?, String> getCommaCurly() {
      String var1 = "\u001b[" + this.getColor() + "m";
      this.lastBracketSize = var1.length() * 2 + "\u001b[0m".length() * 2 + 2;
      return Collectors.joining(", ", var1 + "{\u001b[0m", var1 + "}\u001b[0m");
   }

   @Override
   protected Collector<CharSequence, ?, String> getCommaSquare() {
      String var1 = "\u001b[" + this.getColor() + "m";
      this.lastBracketSize = var1.length() * 2 + "\u001b[0m".length() * 2 + 2;
      return Collectors.joining(", ", var1 + "[\u001b[0m", var1 + "]\u001b[0m");
   }

   @NotNull
   public String examine(TextColor var1) {
      return "\u001b[" + COLOR_LEVEL.determineEscape(var1.value()) + "m⬛\u001b[0m";
   }

   @NotNull
   public String examine(@Nullable Object var1) {
      return var1 instanceof TextColor var2 ? this.examine(var2) : super.examine(var1);
   }

   private String getColor() {
      return COLOR_CODES[this.depth % 6];
   }

   private static String[] createColors() {
      String[] var0 = new String[6];

      for (int var1 = 0; var1 < 6; var1++) {
         TerminalStringExaminer.HSV var2 = new TerminalStringExaminer.HSV(0.16666667F * var1, 1.0F, 1.0F);
         TextColor var3 = TextColor.color(var2);
         var0[var1] = COLOR_LEVEL.determineEscape(var3.value());
      }

      return var0;
   }

   private record HSV() implements HSVLike {
      private final float h;
      private final float s;
      private final float v;

      private HSV(float var1, float var2, float var3) {
         this.h = var1;
         this.s = var2;
         this.v = var3;
      }
   }
}
