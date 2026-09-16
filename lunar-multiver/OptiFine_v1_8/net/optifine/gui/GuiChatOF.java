package net.optifine.gui;

import net.optifine.shaders.Shaders;

public class GuiChatOF extends awv {
   private static final String CMD_RELOAD_SHADERS = "/reloadShaders";
   private static final String CMD_RELOAD_CHUNKS = "/reloadChunks";

   public GuiChatOF(awv guiChat) {
      super(ayb.getGuiChatText(guiChat));
   }

   public void f(String msg) {
      if (this.checkCustomCommand(msg)) {
         this.j.q.d().a(msg);
      } else {
         super.f(msg);
      }
   }

   private boolean checkCustomCommand(String msg) {
      if (msg == null) {
         return false;
      }

      msg = msg.trim();
      if (msg.equals("/reloadShaders")) {
         if (Config.isShaders()) {
            Shaders.uninit();
            Shaders.loadShaderPack();
         }

         return true;
      } else if (msg.equals("/reloadChunks")) {
         this.j.g.a();
         return true;
      } else {
         return false;
      }
   }
}
