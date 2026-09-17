package com.batmod.installer.frame.element;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JProgressBar;
import javax.swing.border.LineBorder;

public class BatModProgressBar extends JProgressBar {
   public BatModProgressBar(int var1, int var2) {
      super(var1, var2);
      this.Logger();
   }

   private void Logger() {
      this.setFont(
         IntegerSpinner.CustomSpinner
      );
      this.setForeground(
         Logger.ButtonAction
      );
      this.setBackground(Color.WHITE);
      this.setOpaque(true);
      this.setBorder(
         new LineBorder(
            Logger.ButtonAction
         )
      );
      this.setBorderPainted(true);
      this.setUI(new ProgressBar$1(this));
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
