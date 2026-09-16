package org.objectweb.asm;

public class Label {
   static final int FLAG_DEBUG_ONLY = 1;
   static final int FLAG_JUMP_TARGET = 2;
   static final int FLAG_RESOLVED = 4;
   static final int FLAG_REACHABLE = 8;
   static final int FLAG_SUBROUTINE_CALLER = 16;
   static final int FLAG_SUBROUTINE_START = 32;
   static final int FLAG_SUBROUTINE_END = 64;
   static final int FLAG_LINE_NUMBER = 128;
   static final int LINE_NUMBERS_CAPACITY_INCREMENT = 4;
   static final int FORWARD_REFERENCES_CAPACITY_INCREMENT = 6;
   static final int FORWARD_REFERENCE_TYPE_MASK = -268435456;
   static final int FORWARD_REFERENCE_TYPE_SHORT = 268435456;
   static final int FORWARD_REFERENCE_TYPE_WIDE = 536870912;
   static final int FORWARD_REFERENCE_TYPE_STACK_MAP = 805306368;
   static final int FORWARD_REFERENCE_HANDLE_MASK = 268435455;
   static final Label EMPTY_LIST = new Label();
   public Object info;
   short flags;
   private short lineNumber;
   private int[] otherLineNumbers;
   int bytecodeOffset;
   private int[] forwardReferences;
   short inputStackSize;
   short outputStackSize;
   short outputStackMax;
   short subroutineId;
   Frame frame;
   Label nextBasicBlock;
   Edge outgoingEdges;
   Label nextListElement;

   public int getOffset() {
      if ((this.flags & 4) == 0) {
         throw new IllegalStateException("Label offset position has not been resolved yet");
      } else {
         return this.bytecodeOffset;
      }
   }

   final Label getCanonicalInstance() {
      return this.frame == null ? this : this.frame.owner;
   }

   final void addLineNumber(int var1) {
      if ((this.flags & 128) == 0) {
         this.flags = (short)(this.flags | 128);
         this.lineNumber = (short)var1;
      } else {
         if (this.otherLineNumbers == null) {
            this.otherLineNumbers = new int[4];
         }

         int var2 = ++this.otherLineNumbers[0];
         if (var2 >= this.otherLineNumbers.length) {
            int[] var3 = new int[this.otherLineNumbers.length + 4];
            System.arraycopy(this.otherLineNumbers, 0, var3, 0, this.otherLineNumbers.length);
            this.otherLineNumbers = var3;
         }

         this.otherLineNumbers[var2] = var1;
      }
   }

   final void accept(MethodVisitor var1, boolean var2) {
      var1.visitLabel(this);
      if (var2 && (this.flags & 128) != 0) {
         var1.visitLineNumber(this.lineNumber & 65535, this);
         if (this.otherLineNumbers != null) {
            for (int var3 = 1; var3 <= this.otherLineNumbers[0]; var3++) {
               var1.visitLineNumber(this.otherLineNumbers[var3], this);
            }
         }
      }
   }

   final void put(ByteVector var1, int var2, boolean var3) {
      if ((this.flags & 4) == 0) {
         if (var3) {
            this.addForwardReference(var2, 536870912, var1.length);
            var1.putInt(-1);
         } else {
            this.addForwardReference(var2, 268435456, var1.length);
            var1.putShort(-1);
         }
      } else if (var3) {
         var1.putInt(this.bytecodeOffset - var2);
      } else {
         var1.putShort(this.bytecodeOffset - var2);
      }
   }

   final void put(ByteVector var1) {
      if ((this.flags & 4) == 0) {
         this.addForwardReference(0, 805306368, var1.length);
      }

      var1.putShort(this.bytecodeOffset);
   }

   private void addForwardReference(int var1, int var2, int var3) {
      if (this.forwardReferences == null) {
         this.forwardReferences = new int[6];
      }

      int var4 = this.forwardReferences[0];
      if (var4 + 2 >= this.forwardReferences.length) {
         int[] var5 = new int[this.forwardReferences.length + 6];
         System.arraycopy(this.forwardReferences, 0, var5, 0, this.forwardReferences.length);
         this.forwardReferences = var5;
      }

      this.forwardReferences[++var4] = var1;
      this.forwardReferences[++var4] = var2 | var3;
      this.forwardReferences[0] = var4;
   }

   final boolean resolve(byte[] var1, ByteVector var2, int var3) {
      this.flags = (short)(this.flags | 4);
      this.bytecodeOffset = var3;
      if (this.forwardReferences == null) {
         return false;
      }

      boolean var4 = false;

      for (int var5 = this.forwardReferences[0]; var5 > 0; var5 -= 2) {
         int var6 = this.forwardReferences[var5 - 1];
         int var7 = this.forwardReferences[var5];
         int var8 = var3 - var6;
         int var9 = var7 & 268435455;
         if ((var7 & -268435456) == 268435456) {
            if (var8 < -32768 || var8 > 32767) {
               int var10 = var1[var6] & 255;
               if (var10 < 198) {
                  var1[var6] = (byte)(var10 + 49);
               } else {
                  var1[var6] = (byte)(var10 + 20);
               }

               var4 = true;
            }

            var1[var9++] = (byte)(var8 >>> 8);
            var1[var9] = (byte)var8;
         } else if ((var7 & -268435456) == 536870912) {
            var1[var9++] = (byte)(var8 >>> 24);
            var1[var9++] = (byte)(var8 >>> 16);
            var1[var9++] = (byte)(var8 >>> 8);
            var1[var9] = (byte)var8;
         } else {
            var2.data[var9++] = (byte)(var3 >>> 8);
            var2.data[var9] = (byte)var3;
         }
      }

      return var4;
   }

   final void markSubroutine(short var1) {
      Label var2 = this;
      var2.nextListElement = EMPTY_LIST;

      while (var2 != EMPTY_LIST) {
         Label var3 = var2;
         var2 = var2.nextListElement;
         var3.nextListElement = null;
         if (var3.subroutineId == 0) {
            var3.subroutineId = var1;
            var2 = var3.pushSuccessors(var2);
         }
      }
   }

   final void addSubroutineRetSuccessors(Label var1) {
      Label var2 = EMPTY_LIST;
      Label var3 = this;
      var3.nextListElement = EMPTY_LIST;

      while (var3 != EMPTY_LIST) {
         Label var4 = var3;
         var3 = var4.nextListElement;
         var4.nextListElement = var2;
         var2 = var4;
         if ((var4.flags & 64) != 0 && var4.subroutineId != var1.subroutineId) {
            var4.outgoingEdges = new Edge(var4.outputStackSize, var1.outgoingEdges.successor, var4.outgoingEdges);
         }

         var3 = var4.pushSuccessors(var3);
      }

      while (var2 != EMPTY_LIST) {
         Label var6 = var2.nextListElement;
         var2.nextListElement = null;
         var2 = var6;
      }
   }

   private Label pushSuccessors(Label var1) {
      Label var2 = var1;

      for (Edge var3 = this.outgoingEdges; var3 != null; var3 = var3.nextEdge) {
         boolean var4 = (this.flags & 16) != 0 && var3 == this.outgoingEdges.nextEdge;
         if (!var4 && var3.successor.nextListElement == null) {
            var3.successor.nextListElement = var2;
            var2 = var3.successor;
         }
      }

      return var2;
   }

   @Override
   public String toString() {
      return stringConcat$0(System.identityHashCode(this));
   }
}
