package com.batmod.installer.frame.element;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFormattedTextField;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.JSpinner.ListEditor;

public class IntegerSpinner extends JSpinner {
   public IntegerSpinner(SpinnerListModel var1) {
      super(var1);
      this.Logger();
   }

   private void Logger() {
      this.setFont(
         IntegerSpinner.CustomSpinner
      );
      this.setForeground(Color.WHITE);
      this.setBackground(Color.WHITE);
   }

   public void Logger(int var1) {
      ListEditor var2 = new ListEditor(this);
      JFormattedTextField var3 = var2.getTextField();
      var3.setHorizontalAlignment(0);
      var3.setFont(
         new Font(
            IntegerSpinner.CustomSpinner
               .getName(),
            0,
            var1
         )
      );
      this.setEditor(var2);
   }

   public void Logger(Color var1) {
      this.setForeground(var1);
   }

   public void Button(Color var1) {
      this.setBackground(var1);
   }
}
