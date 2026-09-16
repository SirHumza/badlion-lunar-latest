package org.spongepowered.asm.mixin.injection.selectors;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public final class MemberMatcher implements ITargetSelector {
   private static final Pattern PATTERN = Pattern.compile("((owner|name|desc)\\s*=\\s*)?/(.*?)(?<!\\\\)/");
   private static final String[] PATTERN_SOURCE_NAMES = new String[]{"owner", "name", "desc"};
   private final Pattern[] patterns;
   private final Exception parseException;
   private final String input;

   private MemberMatcher(Pattern[] var1, Exception var2, String var3) {
      this.patterns = var1;
      this.parseException = var2;
      this.input = var3;
   }

   public static MemberMatcher parse(String var0, ISelectorContext var1) {
      Matcher var2 = PATTERN.matcher(var0);
      Pattern[] var3 = new Pattern[3];
      RuntimeException var4 = null;

      while (var2.find()) {
         Pattern var5;
         try {
            var5 = Pattern.compile(var2.group(3));
         } catch (PatternSyntaxException var7) {
            var4 = var7;
            var5 = Pattern.compile(".*");
            var7.printStackTrace();
         }

         int var6 = "owner".equals(var2.group(2)) ? 0 : ("desc".equals(var2.group(2)) ? 2 : 1);
         if (var3[var6] != null) {
            var4 = new InvalidSelectorException(
               "Pattern for '" + PATTERN_SOURCE_NAMES[var6] + "' specified multiple times: Old=/" + var3[var6].pattern() + "/ New=/" + var5.pattern() + "/"
            );
         }

         var3[var6] = var5;
      }

      return new MemberMatcher(var3, var4, var0);
   }

   @Override
   public ITargetSelector validate() {
      if (this.parseException != null) {
         if (this.parseException instanceof InvalidSelectorException) {
            throw (InvalidSelectorException)this.parseException;
         } else {
            throw new InvalidSelectorException("Error parsing regex selector", this.parseException);
         }
      } else {
         boolean var1 = false;

         for (Pattern var5 : this.patterns) {
            var1 |= var5 != null;
         }

         if (!var1) {
            throw new InvalidSelectorException("Error parsing regex selector, the input was in an unexpected format: " + this.input);
         } else {
            return this;
         }
      }
   }

   @Override
   public String toString() {
      return this.input;
   }

   @Override
   public ITargetSelector next() {
      return this;
   }

   @Override
   public ITargetSelector configure(ITargetSelector.Configure var1, String... var2) {
      var1.checkArgs(var2);
      return this;
   }

   @Override
   public ITargetSelector attach(ISelectorContext var1) {
      return this;
   }

   @Override
   public int getMinMatchCount() {
      return 0;
   }

   @Override
   public int getMaxMatchCount() {
      return Integer.MAX_VALUE;
   }

   @Override
   public <TNode> MatchResult match(ElementNode<TNode> var1) {
      return var1 == null ? MatchResult.NONE : this.matches(var1.getOwner(), var1.getName(), var1.getDesc());
   }

   private MatchResult matches(String... var1) {
      MatchResult var2 = MatchResult.NONE;

      for (int var3 = 0; var3 < this.patterns.length; var3++) {
         if (this.patterns[var3] != null && var1[var3] != null) {
            if (this.patterns[var3].matcher(var1[var3]).find()) {
               var2 = MatchResult.EXACT_MATCH;
            } else {
               var2 = MatchResult.NONE;
            }
         }
      }

      return var2;
   }
}
