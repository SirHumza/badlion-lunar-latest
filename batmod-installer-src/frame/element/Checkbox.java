package com.batmod.installer.frame.element;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

class Checkbox extends AbstractAction {
   Checkbox(
      String var1, ButtonAction var2
   ) {
      super(var1);
      this.Logger = var2;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      this.Logger
         .Logger(var1);
   }
}
