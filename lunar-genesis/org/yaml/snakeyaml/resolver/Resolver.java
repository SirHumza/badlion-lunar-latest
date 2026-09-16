package org.yaml.snakeyaml.resolver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.yaml.snakeyaml.nodes.NodeId;
import org.yaml.snakeyaml.nodes.Tag;

public class Resolver {
   public static final Pattern BOOL = Pattern.compile("^(?:yes|Yes|YES|no|No|NO|true|True|TRUE|false|False|FALSE|on|On|ON|off|Off|OFF)$");
   public static final Pattern FLOAT = Pattern.compile(
      "^([-+]?(?:[0-9][0-9_]*)\\.[0-9_]*(?:[eE][-+]?[0-9]+)?|[-+]?(?:[0-9][0-9_]*)(?:[eE][-+]?[0-9]+)|[-+]?\\.[0-9_]+(?:[eE][-+]?[0-9]+)?|[-+]?[0-9][0-9_]*(?::[0-5]?[0-9])+\\.[0-9_]*|[-+]?\\.(?:inf|Inf|INF)|\\.(?:nan|NaN|NAN))$"
   );
   public static final Pattern INT = Pattern.compile(
      "^(?:[-+]?0b_*[0-1][0-1_]*|[-+]?0_*[0-7][0-7_]*|[-+]?(?:0|[1-9][0-9_]*)|[-+]?0x_*[0-9a-fA-F][0-9a-fA-F_]*|[-+]?[1-9][0-9_]*(?::[0-5]?[0-9])+)$"
   );
   public static final Pattern MERGE = Pattern.compile("^(?:<<)$");
   public static final Pattern NULL = Pattern.compile("^(?:~|null|Null|NULL| )$");
   public static final Pattern EMPTY = Pattern.compile("^$");
   public static final Pattern TIMESTAMP = Pattern.compile(
      "^(?:[0-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]|[0-9][0-9][0-9][0-9]-[0-9][0-9]?-[0-9][0-9]?(?:[Tt]|[ \t]+)[0-9][0-9]?:[0-9][0-9]:[0-9][0-9](?:\\.[0-9]*)?(?:[ \t]*(?:Z|[-+][0-9][0-9]?(?::[0-9][0-9])?))?)$"
   );
   public static final Pattern VALUE = Pattern.compile("^(?:=)$");
   public static final Pattern YAML = Pattern.compile("^(?:!|&|\\*)$");
   protected Map<Character, List<ResolverTuple>> yamlImplicitResolvers = new HashMap<>();

   protected void addImplicitResolvers() {
      this.addImplicitResolver(Tag.BOOL, BOOL, "yYnNtTfFoO", 10);
      this.addImplicitResolver(Tag.INT, INT, "-+0123456789");
      this.addImplicitResolver(Tag.FLOAT, FLOAT, "-+0123456789.");
      this.addImplicitResolver(Tag.MERGE, MERGE, "<", 10);
      this.addImplicitResolver(Tag.NULL, NULL, "~nN\u0000", 10);
      this.addImplicitResolver(Tag.NULL, EMPTY, null, 10);
      this.addImplicitResolver(Tag.TIMESTAMP, TIMESTAMP, "0123456789", 50);
      this.addImplicitResolver(Tag.YAML, YAML, "!&*", 10);
   }

   public Resolver() {
      this.addImplicitResolvers();
   }

   public void addImplicitResolver(Tag var1, Pattern var2, String var3) {
      this.addImplicitResolver(var1, var2, var3, 1024);
   }

   public void addImplicitResolver(Tag var1, Pattern var2, String var3, int var4) {
      if (var3 == null) {
         List var5 = this.yamlImplicitResolvers.get(null);
         if (var5 == null) {
            var5 = new ArrayList();
            this.yamlImplicitResolvers.put(null, var5);
         }

         var5.add(new ResolverTuple(var1, var2, var4));
      } else {
         char[] var10 = var3.toCharArray();
         int var6 = 0;

         for (int var7 = var10.length; var6 < var7; var6++) {
            Character var8 = var10[var6];
            if (var8 == 0) {
               var8 = null;
            }

            List var9 = this.yamlImplicitResolvers.get(var8);
            if (var9 == null) {
               var9 = new ArrayList();
               this.yamlImplicitResolvers.put(var8, var9);
            }

            var9.add(new ResolverTuple(var1, var2, var4));
         }
      }
   }

   public Tag resolve(NodeId var1, String var2, boolean var3) {
      if (var1 == NodeId.scalar && var3) {
         List var4;
         if (var2.length() == 0) {
            var4 = this.yamlImplicitResolvers.get('\u0000');
         } else {
            var4 = this.yamlImplicitResolvers.get(var2.charAt(0));
         }

         if (var4 != null) {
            for (ResolverTuple var6 : var4) {
               Tag var7 = var6.getTag();
               Pattern var8 = var6.getRegexp();
               if (var2.length() <= var6.getLimit() && var8.matcher(var2).matches()) {
                  return var7;
               }
            }
         }

         if (this.yamlImplicitResolvers.containsKey(null)) {
            for (ResolverTuple var10 : this.yamlImplicitResolvers.get(null)) {
               Tag var11 = var10.getTag();
               Pattern var12 = var10.getRegexp();
               if (var2.length() <= var10.getLimit() && var12.matcher(var2).matches()) {
                  return var11;
               }
            }
         }
      }

      switch (var1) {
         case scalar:
            return Tag.STR;
         case sequence:
            return Tag.SEQ;
         default:
            return Tag.MAP;
      }
   }
}
