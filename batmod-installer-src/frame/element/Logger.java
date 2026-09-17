package com.batmod.installer.frame.element;

import java.awt.Color;
import java.awt.Font;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.border.LineBorder;

public class Logger extends JButton {
   public Logger(String var1) {
      super(var1);
      this.Logger();
   }

   public Logger(
      String var1, ButtonAction var2
   ) {
      super(new Button(var1, var2));
      this.Logger();
   }

   public Logger(Icon var1) {
      super(var1);
      this.Logger();
   }

   public Logger(
      Icon var1, ButtonAction var2
   ) {
      super(new CustomSpinner(null, var1, var2));
      this.Logger();
   }

   private void Logger() {
      this.setFont(
         IntegerSpinner.CustomSpinner
      );
      this.setForeground(Color.WHITE);
      this.setBackground(
         Logger.ButtonAction
      );
      this.setOpaque(true);
      this.setFocusPainted(false);
      this.setBorder(
         new LineBorder(
            Logger.ButtonAction
         )
      );
      this.setBorderPainted(true);
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
