package net.optifine.gui;

import avh.a;

public class GuiPerformanceSettingsOF extends axu {
   private axu prevScreen;
   protected String title;
   private avh settings;
   private static a[] enumOptions = new a[]{
      a.SMOOTH_FPS,
      a.SMOOTH_WORLD,
      a.FAST_RENDER,
      a.FAST_MATH,
      a.CHUNK_UPDATES,
      a.CHUNK_UPDATES_DYNAMIC,
      a.RENDER_REGIONS,
      a.LAZY_CHUNK_LOADING,
      a.SMART_ANIMATIONS
   };
   private TooltipManager tooltipManager = new TooltipManager(this, new TooltipProviderOptions());

   public GuiPerformanceSettingsOF(axu guiscreen, avh gamesettings) {
      this.prevScreen = guiscreen;
      this.settings = gamesettings;
   }

   public void b() {
      this.title = bnq.a("of.options.performanceTitle", new Object[0]);
      this.n.clear();

      for (int i = 0; i < enumOptions.length; i++) {
         a enumoptions = enumOptions[i];
         int x = this.l / 2 - 155 + i % 2 * 160;
         int y = this.m / 6 + 21 * (i / 2) - 12;
         if (!enumoptions.a()) {
            this.n.add(new GuiOptionButtonOF(enumoptions.c(), x, y, enumoptions, this.settings.c(enumoptions)));
         } else {
            this.n.add(new GuiOptionSliderOF(enumoptions.c(), x, y, enumoptions));
         }
      }

      this.n.add(new avs(200, this.l / 2 - 100, this.m / 6 + 168 + 11, bnq.a("gui.done", new Object[0])));
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
      }
   }

   public void a(int x, int y, float f) {
      this.c();
      this.a(this.q, this.title, this.l / 2, 15, 16777215);
      super.a(x, y, f);
      this.tooltipManager.drawTooltips(x, y, this.n);
   }
}
