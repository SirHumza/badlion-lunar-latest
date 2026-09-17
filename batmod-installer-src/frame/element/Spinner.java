package com.batmod.installer.frame.element;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JCheckBox;

public class Spinner extends JCheckBox {
   public Spinner(String var1) {
      super(var1);
      this.Logger();
   }

   public Spinner(
      String var1, ButtonAction var2
   ) {
      super(new Checkbox(var1, var2));
      this.Logger();
   }

   private void Logger() {
      this.setFont(
         IntegerSpinner.CustomSpinner
      );
      this.setBackground(Color.WHITE);
      this.setFocusPainted(false);
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
