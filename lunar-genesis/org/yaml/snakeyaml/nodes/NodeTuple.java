package org.yaml.snakeyaml.nodes;

public final class NodeTuple {
   private final Node keyNode;
   private final Node valueNode;

   public NodeTuple(Node var1, Node var2) {
      if (var1 != null && var2 != null) {
         this.keyNode = var1;
         this.valueNode = var2;
      } else {
         throw new NullPointerException("Nodes must be provided.");
      }
   }

   public Node getKeyNode() {
      return this.keyNode;
   }

   public Node getValueNode() {
      return this.valueNode;
   }

   @Override
   public String toString() {
      return "<NodeTuple keyNode=" + this.keyNode + "; valueNode=" + this.valueNode + ">";
   }
}
