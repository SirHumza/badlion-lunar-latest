package com.batmod.installer.frame.element;

import java.awt.Color;
import javax.swing.plaf.basic.BasicProgressBarUI;

class ProgressBar$1 extends BasicProgressBarUI {
   ProgressBar$1(BatModProgressBar var1) {
      this.Logger = var1;
   }

   @Override
   protected Color getSelectionBackground() {
      return Logger.ButtonAction;
   }

   @Override
   protected Color getSelectionForeground() {
      return Color.WHITE;
   }
}
