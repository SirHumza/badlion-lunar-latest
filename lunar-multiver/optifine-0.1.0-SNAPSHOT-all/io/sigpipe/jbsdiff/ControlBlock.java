package io.sigpipe.jbsdiff;

import java.io.InputStream;
import java.io.OutputStream;

class ControlBlock {
   private int diffLength;
   private int extraLength;
   private int seekLength;

   public ControlBlock() {
   }

   public ControlBlock(InputStream var1) {
      this.diffLength = Offset.readOffset(var1);
      this.extraLength = Offset.readOffset(var1);
      this.seekLength = Offset.readOffset(var1);
   }

   public ControlBlock(int var1, int var2, int var3) {
      this.diffLength = var1;
      this.extraLength = var2;
      this.seekLength = var3;
   }

   public void write(OutputStream var1) {
      Offset.writeOffset(this.diffLength, var1);
      Offset.writeOffset(this.extraLength, var1);
      Offset.writeOffset(this.seekLength, var1);
   }

   @Override
   public String toString() {
      return this.diffLength + ", " + this.extraLength + ", " + this.seekLength;
   }

   public int getDiffLength() {
      return this.diffLength;
   }

   public void setDiffLength(int var1) {
      this.diffLength = var1;
   }

   public int getExtraLength() {
      return this.extraLength;
   }

   public void setExtraLength(int var1) {
      this.extraLength = var1;
   }

   public int getSeekLength() {
      return this.seekLength;
   }

   public void setSeekLength(int var1) {
      this.seekLength = var1;
   }
}
