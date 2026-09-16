package com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CIOHHCORHRCCRICCCORIHCRHCCCRRR.IIHRRHORCRCROCHHOHORCHCROCIHRO;
import net.minecraft.client.shader.Framebuffer;
import org.lwjgl.opengl.GL11;

public class HHCCIRHCCCIIRHCROHIORHIRHHIORH extends Framebuffer {
   private final boolean ICOOHCHCOIOOCRCCHCIHHHROCIIHOO;
   private boolean OOIIIOCHORCCCHORHIHIROOOHRCIHR = false;
   private boolean OCHOCHRIOCCHRCHOCROICCRRCIHIOC;
   private boolean initialized = false;

   public HHCCIRHCCCIIRHCROHIORHIRHHIORH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
   ) {
      super(var1.width, var1.height, var1.useDepth);
      this.OCHOCHRIOCCHRCHOCROICCRRCIHIOC = var1.OCHOCHRIOCCHRCHOCROICCRRCIHIOC;
      this.ICOOHCHCOIOOCRCCHCIHHHROCIIHOO = var1.CIOICIOOROIHHHCOIHOIIRHCCIORCI;
      this.framebufferTexture = var1.RIRRRCRIRIHCHIICHROROIOIOIOIRR == null
         ? GL11.glGenTextures()
         : ((IIHRRHORCRCROCHHOHORCHCROCIHRO)var1.RIRRRCRIRIHCHIICHROROIOIOIOIRR).lunar$getHandle();
      this.initialized = true;
      this.createBindFramebuffer(var1.width, var1.height);
   }

   public void createBindFramebuffer(int var1, int var2) {
      if (this.initialized) {
         super.createBindFramebuffer(var1, var2);
      }
   }

   public boolean IIRHHCRHORHOCRIOIRIIRHCHCOORRI() {
      return this.OCHOCHRIOCCHRCHOCROICCRRCIHIOC ? false : this.OOIIIOCHORCCCHORHIHIROOOHRCIHR || this.ICOOHCHCOIOOCRCCHCIHHHROCIIHOO;
   }

   public void HHHORCOOROCOHOIHRRORHOIOROCOIO() {
      this.OOIIIOCHORCCCHORHIHIROOOHRCIHR = true;
   }
}
