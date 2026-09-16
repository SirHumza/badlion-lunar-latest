package org.fusesource.jansi;

import java.io.PrintStream;
import org.fusesource.jansi.io.AnsiOutputStream;

public class AnsiPrintStream extends PrintStream {
   public AnsiPrintStream(AnsiOutputStream var1, boolean var2) {
      super(var1, var2);
   }

   public AnsiPrintStream(AnsiOutputStream var1, boolean var2, String var3) {
      super(var1, var2, var3);
   }

   protected AnsiOutputStream getOut() {
      return (AnsiOutputStream)this.out;
   }

   public AnsiType getType() {
      return this.getOut().getType();
   }

   public AnsiColors getColors() {
      return this.getOut().getColors();
   }

   public AnsiMode getMode() {
      return this.getOut().getMode();
   }

   public void setMode(AnsiMode var1) {
      this.getOut().setMode(var1);
   }

   public boolean isResetAtUninstall() {
      return this.getOut().isResetAtUninstall();
   }

   public void setResetAtUninstall(boolean var1) {
      this.getOut().setResetAtUninstall(var1);
   }

   public int getTerminalWidth() {
      return this.getOut().getTerminalWidth();
   }

   public void install() {
      this.getOut().install();
   }

   public void uninstall() {
      AnsiOutputStream var1 = this.getOut();
      if (var1 != null) {
         var1.uninstall();
      }
   }

   @Override
   public String toString() {
      return "AnsiPrintStream{type="
         + this.getType()
         + ", colors="
         + this.getColors()
         + ", mode="
         + this.getMode()
         + ", resetAtUninstall="
         + this.isResetAtUninstall()
         + "}";
   }
}
