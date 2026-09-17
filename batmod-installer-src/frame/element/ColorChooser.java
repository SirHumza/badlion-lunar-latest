package com.batmod.installer.frame.element;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JScrollPane;

public class ColorChooser extends JScrollPane {
   public ColorChooser(Component var1) {
      super(var1);
      this.Logger();
   }

   private void Logger() {
      this.setFont(
         IntegerSpinner.CustomSpinner
      );
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
