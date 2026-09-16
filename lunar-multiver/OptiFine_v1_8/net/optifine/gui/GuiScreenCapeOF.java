package net.optifine.gui;

import com.mojang.authlib.exceptions.InvalidCredentialsException;
import java.math.BigInteger;
import java.net.URI;
import java.util.Random;
import net.optifine.Lang;

public class GuiScreenCapeOF extends GuiScreenOF {
   private final axu parentScreen;
   private String title;
   private String message;
   private long messageHideTimeMs;
   private String linkUrl;
   private GuiButtonOF buttonCopyLink;
   private avn fontRenderer = Config.getMinecraft().k;

   public GuiScreenCapeOF(axu parentScreenIn) {
      this.parentScreen = parentScreenIn;
   }

   public void b() {
      int i = 0;
      this.title = bnq.a("of.options.capeOF.title", new Object[0]);
      i += 2;
      this.n.add(new GuiButtonOF(210, this.l / 2 - 155, this.m / 6 + 24 * (i >> 1), 150, 20, bnq.a("of.options.capeOF.openEditor", new Object[0])));
      this.n.add(new GuiButtonOF(220, this.l / 2 - 155 + 160, this.m / 6 + 24 * (i >> 1), 150, 20, bnq.a("of.options.capeOF.reloadCape", new Object[0])));
      i += 6;
      this.buttonCopyLink = new GuiButtonOF(
         230, this.l / 2 - 100, this.m / 6 + 24 * (i >> 1), 200, 20, bnq.a("of.options.capeOF.copyEditorLink", new Object[0])
      );
      this.buttonCopyLink.m = this.linkUrl != null;
      this.n.add(this.buttonCopyLink);
      i += 4;
      this.n.add(new GuiButtonOF(200, this.l / 2 - 100, this.m / 6 + 24 * (i >> 1), bnq.a("gui.done", new Object[0])));
   }

   protected void a(avs button) {
      if (button.l) {
         if (button.k == 200) {
            this.j.a(this.parentScreen);
         }

         if (button.k == 210) {
            try {
               String userName = this.j.L().e().getName();
               String userId = this.j.L().e().getId().toString().replace("-", "");
               String accessToken = this.j.L().d();
               Random r1 = new Random();
               Random r2 = new Random(System.identityHashCode(new Object()));
               BigInteger random1Bi = new BigInteger(128, r1);
               BigInteger random2Bi = new BigInteger(128, r2);
               BigInteger serverBi = random1Bi.xor(random2Bi);
               String serverId = serverBi.toString(16);
               this.j.aa().joinServer(this.j.L().e(), accessToken, serverId);
               String urlStr = "https://optifine.net/capeChange?u=" + userId + "&n=" + userName + "&s=" + serverId;
               boolean opened = Config.openWebLink(new URI(urlStr));
               if (opened) {
                  this.showMessage(Lang.get("of.message.capeOF.openEditor"), 10000L);
               } else {
                  this.showMessage(Lang.get("of.message.capeOF.openEditorError"), 10000L);
                  this.setLinkUrl(urlStr);
               }
            } catch (InvalidCredentialsException e) {
               Config.showGuiMessage(bnq.a("of.message.capeOF.error1", new Object[0]), bnq.a("of.message.capeOF.error2", new Object[]{e.getMessage()}));
               Config.warn("Mojang authentication failed");
               Config.warn(e.getClass().getName() + ": " + e.getMessage());
            } catch (Exception e) {
               Config.warn("Error opening OptiFine cape link");
               Config.warn(e.getClass().getName() + ": " + e.getMessage());
            }
         }

         if (button.k == 220) {
            this.showMessage(Lang.get("of.message.capeOF.reloadCape"), 15000L);
            if (this.j.h != null) {
               long delayMs = 15000L;
               long reloadTimeMs = System.currentTimeMillis() + delayMs;
               this.j.h.setReloadCapeTimeMs(reloadTimeMs);
            }
         }

         if (button.k == 230 && this.linkUrl != null) {
            e(this.linkUrl);
         }
      }
   }

   private void showMessage(String msg, long timeMs) {
      this.message = msg;
      this.messageHideTimeMs = System.currentTimeMillis() + timeMs;
      this.setLinkUrl(null);
   }

   public void a(int mouseX, int mouseY, float partialTicks) {
      this.c();
      this.a(this.fontRenderer, this.title, this.l / 2, 20, 16777215);
      if (this.message != null) {
         this.a(this.fontRenderer, this.message, this.l / 2, this.m / 6 + 60, 16777215);
         if (System.currentTimeMillis() > this.messageHideTimeMs) {
            this.message = null;
            this.setLinkUrl(null);
         }
      }

      super.a(mouseX, mouseY, partialTicks);
   }

   public void setLinkUrl(String linkUrl) {
      this.linkUrl = linkUrl;
      this.buttonCopyLink.m = linkUrl != null;
   }
}
