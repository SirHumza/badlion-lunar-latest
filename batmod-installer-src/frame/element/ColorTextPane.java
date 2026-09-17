package com.batmod.installer.frame.element;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextPane;

public class ColorTextPane extends JTextPane {
   public ColorTextPane() {
      this.Logger();
   }

   public ColorTextPane(String var1) {
      this();
      this.setText(var1);
   }

   private void Logger() {
      this.setFont(
         IntegerSpinner.CustomSpinner
      );
      this.setEditable(false);
   }

   public void Logger(int var1) {
      this.setFont(
         new Font(
            IntegerSpinner.CustomSpinner
               .getName(),
            0,
            var1
         )
      );
   }

   public void Logger(Color var1) {
      this.setForeground(var1);
   }

   public void Button(Color var1) {
      this.setBackground(var1);
   }
}
