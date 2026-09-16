package io.sigpipe.jbsdiff.sort;

public class SearchResult {
   private int length;
   private int position;

   public SearchResult(int var1, int var2) {
      this.length = var1;
      this.position = var2;
   }

   @Override
   public String toString() {
      return new String("length = " + this.length + ", position = " + this.position);
   }

   public int getLength() {
      return this.length;
   }

   public int getPosition() {
      return this.position;
   }
}
