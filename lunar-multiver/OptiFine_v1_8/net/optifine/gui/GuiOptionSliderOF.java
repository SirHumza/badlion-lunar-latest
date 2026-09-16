package net.optifine.gui;

import avh.a;

public class GuiOptionSliderOF extends awj implements IOptionControl {
   private a option = null;

   public GuiOptionSliderOF(int id, int x, int y, a option) {
      super(id, x, y, option);
      this.option = option;
   }

   @Override
   public a getOption() {
      return this.option;
   }
}
