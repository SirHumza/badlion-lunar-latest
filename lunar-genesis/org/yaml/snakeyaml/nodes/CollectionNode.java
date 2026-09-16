package org.yaml.snakeyaml.nodes;

import java.util.List;
import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.error.Mark;

public abstract class CollectionNode<T> extends Node {
   private DumperOptions.FlowStyle flowStyle;

   public CollectionNode(Tag var1, Mark var2, Mark var3, DumperOptions.FlowStyle var4) {
      super(var1, var2, var3);
      this.setFlowStyle(var4);
   }

   public abstract List<T> getValue();

   public DumperOptions.FlowStyle getFlowStyle() {
      return this.flowStyle;
   }

   public void setFlowStyle(DumperOptions.FlowStyle var1) {
      if (var1 == null) {
         throw new NullPointerException("Flow style must be provided.");
      }

      this.flowStyle = var1;
   }

   public void setEndMark(Mark var1) {
      this.endMark = var1;
   }
}
