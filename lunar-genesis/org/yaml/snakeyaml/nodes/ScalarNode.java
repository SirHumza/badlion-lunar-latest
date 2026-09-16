package org.yaml.snakeyaml.nodes;

import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.error.Mark;

public class ScalarNode extends Node {
   private final DumperOptions.ScalarStyle style;
   private final String value;

   public ScalarNode(Tag var1, String var2, Mark var3, Mark var4, DumperOptions.ScalarStyle var5) {
      this(var1, true, var2, var3, var4, var5);
   }

   public ScalarNode(Tag var1, boolean var2, String var3, Mark var4, Mark var5, DumperOptions.ScalarStyle var6) {
      super(var1, var4, var5);
      if (var3 == null) {
         throw new NullPointerException("value in a Node is required.");
      }

      this.value = var3;
      if (var6 == null) {
         throw new NullPointerException("Scalar style must be provided.");
      }

      this.style = var6;
      this.resolved = var2;
   }

   public DumperOptions.ScalarStyle getScalarStyle() {
      return this.style;
   }

   @Override
   public NodeId getNodeId() {
      return NodeId.scalar;
   }

   public String getValue() {
      return this.value;
   }

   @Override
   public String toString() {
      return "<" + this.getClass().getName() + " (tag=" + this.getTag() + ", value=" + this.getValue() + ")>";
   }

   public boolean isPlain() {
      return this.style == DumperOptions.ScalarStyle.PLAIN;
   }
}
