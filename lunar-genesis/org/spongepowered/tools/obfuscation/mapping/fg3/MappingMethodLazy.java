package org.spongepowered.tools.obfuscation.mapping.fg3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.spongepowered.asm.obfuscation.mapping.common.MappingMethod;
import org.spongepowered.tools.obfuscation.mapping.IMappingProvider;

public class MappingMethodLazy extends MappingMethod {
   private static final Pattern PATTERN_CLASSNAME = Pattern.compile("L([^;]+);");
   private final String originalDesc;
   private final IMappingProvider mappingProvider;
   private String newDesc;

   public MappingMethodLazy(String var1, String var2, String var3, IMappingProvider var4) {
      super(var1, var2, "{" + var3 + "}");
      this.originalDesc = var3;
      this.mappingProvider = var4;
   }

   @Override
   public String getDesc() {
      if (this.newDesc == null) {
         this.newDesc = this.generateDescriptor();
      }

      return this.newDesc;
   }

   @Override
   public String toString() {
      String var1 = this.getDesc();
      return String.format("%s%s%s", this.getName(), var1 != null ? " " : "", var1 != null ? var1 : "");
   }

   private String generateDescriptor() {
      StringBuffer var1 = new StringBuffer();
      Matcher var2 = PATTERN_CLASSNAME.matcher(this.originalDesc);

      while (var2.find()) {
         String var3 = this.mappingProvider.getClassMapping(var2.group(1));
         if (var3 != null) {
            var2.appendReplacement(var1, Matcher.quoteReplacement("L" + var3 + ";"));
         } else {
            var2.appendReplacement(var1, Matcher.quoteReplacement("L" + var2.group(1) + ";"));
         }
      }

      var2.appendTail(var1);
      return var1.toString();
   }
}
