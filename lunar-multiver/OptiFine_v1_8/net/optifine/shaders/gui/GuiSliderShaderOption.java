package net.optifine.shaders.gui;

import net.optifine.shaders.config.ShaderOption;

public class GuiSliderShaderOption extends GuiButtonShaderOption {
   private float sliderValue;
   public boolean dragging;
   private ShaderOption shaderOption = null;

   public GuiSliderShaderOption(int buttonId, int x, int y, int w, int h, ShaderOption shaderOption, String text) {
      super(buttonId, x, y, w, h, shaderOption, text);
      this.sliderValue = 1.0F;
      this.shaderOption = shaderOption;
      this.sliderValue = shaderOption.getIndexNormalized();
      this.j = GuiShaderOptions.getButtonText(shaderOption, this.f);
   }

   protected int a(boolean mouseOver) {
      return 0;
   }

   protected void b(ave mc, int mouseX, int mouseY) {
      if (this.m) {
         if (this.dragging && !axu.r()) {
            this.sliderValue = (float)(mouseX - (this.h + 4)) / (this.f - 8);
            this.sliderValue = ns.a(this.sliderValue, 0.0F, 1.0F);
            this.shaderOption.setIndexNormalized(this.sliderValue);
            this.sliderValue = this.shaderOption.getIndexNormalized();
            this.j = GuiShaderOptions.getButtonText(this.shaderOption, this.f);
         }

         mc.P().a(a);
         bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
         this.b(this.h + (int)(this.sliderValue * (this.f - 8)), this.i, 0, 66, 4, 20);
         this.b(this.h + (int)(this.sliderValue * (this.f - 8)) + 4, this.i, 196, 66, 4, 20);
      }
   }

   public boolean c(ave mc, int mouseX, int mouseY) {
      if (super.c(mc, mouseX, mouseY)) {
         this.sliderValue = (float)(mouseX - (this.h + 4)) / (this.f - 8);
         this.sliderValue = ns.a(this.sliderValue, 0.0F, 1.0F);
         this.shaderOption.setIndexNormalized(this.sliderValue);
         this.j = GuiShaderOptions.getButtonText(this.shaderOption, this.f);
         this.dragging = true;
         return true;
      } else {
         return false;
      }
   }

   public void a(int mouseX, int mouseY) {
      this.dragging = false;
   }

   @Override
   public void valueChanged() {
      this.sliderValue = this.shaderOption.getIndexNormalized();
   }

   @Override
   public boolean isSwitchable() {
      return false;
   }
}
