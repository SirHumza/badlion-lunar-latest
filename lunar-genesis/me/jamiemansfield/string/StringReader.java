package me.jamiemansfield.string;

public class StringReader {
   private final String source;
   private int index = 0;

   public StringReader(String var1) {
      this.source = var1;
   }

   public int length() {
      return this.source.length();
   }

   public int remaining() {
      return this.source.length() - this.index;
   }

   public int index() {
      return this.index;
   }

   public boolean readable(int var1) {
      return this.index + var1 <= this.source.length();
   }

   public boolean available() {
      return this.readable(1);
   }

   public void skip(int var1) {
      this.index += var1;
   }

   public char peek() {
      return this.peek(0);
   }

   public char peek(int var1) {
      if (!this.readable(var1)) {
         throw new IllegalStateException("No character available to peek at!");
      } else {
         return this.source.charAt(this.index + var1);
      }
   }

   public char advance() {
      return this.advance(0);
   }

   public char advance(int var1) {
      if (!this.readable(var1)) {
         throw new IllegalStateException("No character available to advance to!");
      } else {
         return this.source.charAt((this.index += var1 + 1) - 1);
      }
   }

   public String substring(int var1, int var2) {
      return this.source.substring(var1, var2);
   }
}
