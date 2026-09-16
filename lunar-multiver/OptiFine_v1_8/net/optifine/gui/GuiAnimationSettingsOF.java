package net.optifine.gui;

import avh.a;
import net.optifine.Lang;

public class GuiAnimationSettingsOF extends axu {
   private axu prevScreen;
   protected String title;
   private avh settings;
   private static a[] enumOptions = new a[]{
      a.ANIMATED_WATER,
      a.ANIMATED_LAVA,
      a.ANIMATED_FIRE,
      a.ANIMATED_PORTAL,
      a.ANIMATED_REDSTONE,
      a.ANIMATED_EXPLOSION,
      a.ANIMATED_FLAME,
      a.ANIMATED_SMOKE,
      a.VOID_PARTICLES,
      a.WATER_PARTICLES,
      a.RAIN_SPLASH,
      a.PORTAL_PARTICLES,
      a.POTION_PARTICLES,
      a.DRIPPING_WATER_LAVA,
      a.ANIMATED_TERRAIN,
      a.ANIMATED_TEXTURES,
      a.FIREWORK_PARTICLES,
      a.o
   };

   public GuiAnimationSettingsOF(axu guiscreen, avh gamesettings) {
      this.prevScreen = guiscreen;
      this.settings = gamesettings;
   }

   public void b() {
      this.title = bnq.a("of.options.animationsTitle", new Object[0]);
      this.n.clear();

      for (int i = 0; i < enumOptions.length; i++) {
         a opt = enumOptions[i];
         int x = this.l / 2 - 155 + i % 2 * 160;
         int y = this.m / 6 + 21 * (i / 2) - 12;
         if (!opt.a()) {
            this.n.add(new GuiOptionButtonOF(opt.c(), x, y, opt, this.settings.c(opt)));
         } else {
            this.n.add(new GuiOptionSliderOF(opt.c(), x, y, opt));
         }
      }

      this.n.add(new avs(210, this.l / 2 - 155, this.m / 6 + 168 + 11, 70, 20, Lang.get("of.options.animation.allOn")));
      this.n.add(new avs(211, this.l / 2 - 155 + 80, this.m / 6 + 168 + 11, 70, 20, Lang.get("of.options.animation.allOff")));
      this.n.add(new awe(200, this.l / 2 + 5, this.m / 6 + 168 + 11, bnq.a("gui.done", new Object[0])));
   }

   protected void a(avs guibutton) {
      if (guibutton.l) {
         if (guibutton.k < 200 && guibutton instanceof awe) {
            this.settings.a(((awe)guibutton).c(), 1);
            guibutton.j = this.settings.c(a.a(guibutton.k));
         }

         if (guibutton.k == 200) {
            this.j.t.b();
            this.j.a(this.prevScreen);
         }

         if (guibutton.k == 210) {
            this.j.t.setAllAnimations(true);
         }

         if (guibutton.k == 211) {
            this.j.t.setAllAnimations(false);
         }

         avr sr = new avr(this.j);
         this.a(this.j, sr.a(), sr.b());
      }
   }

   public void a(int x, int y, float f) {
      this.c();
      this.a(this.q, this.title, this.l / 2, 15, 16777215);
      super.a(x, y, f);
   }
}
