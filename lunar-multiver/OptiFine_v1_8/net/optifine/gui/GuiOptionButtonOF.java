package net.optifine.gui;

import avh.a;

public class GuiOptionButtonOF extends awe implements IOptionControl {
   private a option = null;

   public GuiOptionButtonOF(int id, int x, int y, a option, String text) {
      super(id, x, y, option, text);
      this.option = option;
   }

   @Override
   public a getOption() {
      return this.option;
   }
}
