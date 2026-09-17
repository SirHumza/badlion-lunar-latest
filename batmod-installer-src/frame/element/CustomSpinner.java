package com.batmod.installer.frame.element;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Icon;

class CustomSpinner extends AbstractAction {
   CustomSpinner(
      String var1, Icon var2, ButtonAction var3
   ) {
      super(var1, var2);
      this.Logger = var3;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.Logger
         .Logger(var1);
   }
}
