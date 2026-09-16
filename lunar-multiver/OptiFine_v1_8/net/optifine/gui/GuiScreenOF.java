package net.optifine.gui;

import java.io.IOException;
import java.util.List;

public class GuiScreenOF extends axu {
   protected void actionPerformedRightClick(avs button) throws IOException {
   }

   protected void a(int mouseX, int mouseY, int mouseButton) throws IOException {
      super.a(mouseX, mouseY, mouseButton);
      if (mouseButton == 1) {
         avs btn = getSelectedButton(mouseX, mouseY, this.n);
         if (btn != null && btn.l) {
            btn.a(this.j.W());
            this.actionPerformedRightClick(btn);
         }
      }
   }

   public static avs getSelectedButton(int x, int y, List<avs> listButtons) {
      for (int i = 0; i < listButtons.size(); i++) {
         avs btn = listButtons.get(i);
         if (btn.m) {
            int btnWidth = ayb.getButtonWidth(btn);
            int btnHeight = ayb.getButtonHeight(btn);
            if (x >= btn.h && y >= btn.i && x < btn.h + btnWidth && y < btn.i + btnHeight) {
               return btn;
            }
         }
      }

      return null;
   }
}
