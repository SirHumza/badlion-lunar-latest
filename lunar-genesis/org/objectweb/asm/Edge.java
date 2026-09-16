package org.objectweb.asm;

final class Edge {
   static final int JUMP = 0;
   static final int EXCEPTION = Integer.MAX_VALUE;
   final int info;
   final Label successor;
   Edge nextEdge;

   Edge(int var1, Label var2, Edge var3) {
      this.info = var1;
      this.successor = var2;
      this.nextEdge = var3;
   }
}
