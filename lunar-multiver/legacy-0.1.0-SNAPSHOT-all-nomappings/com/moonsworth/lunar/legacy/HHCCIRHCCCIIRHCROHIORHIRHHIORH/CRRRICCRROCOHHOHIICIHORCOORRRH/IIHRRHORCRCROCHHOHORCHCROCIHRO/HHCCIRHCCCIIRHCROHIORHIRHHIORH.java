package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.IIHRRHORCRCROCHHOHORCHCROCIHRO;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CIOHHCORHRCCRICCCORIHCRHCCCRRR.IIHRRHORCRCROCHHOHORCHCROCIHRO;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CIOHHCORHRCCRICCCORIHCRHCCCRRR.IIRHCHHOICHRICOOCRORCCIOOIHOIR;
import net.minecraft.client.shader.ShaderManager;
import net.minecraft.client.shader.ShaderUniform;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(ShaderManager.class)
public abstract class HHCCIRHCCCIIRHCROHIORHIRHHIORH implements HRCHROOHRIHCRCRHRIIROCIRHOIRHH {
   @Final
   @Shadow
   public int program;

   @Shadow
   public abstract ShaderUniform getShaderUniform(String var1);

   @Shadow
   public abstract void addSamplerTexture(String var1, Object var2);

   @Shadow
   public abstract void useShader();

   @Shadow
   public abstract void endShader();

   public RIOOCHICIHRHOHCCCCCHOCCCOHCRHI bridge$getShaderUniform(String var1) {
      return (RIOOCHICIHRHOHCCCCCHOCCCOHCRHI)this.getShaderUniform(var1);
   }

   public void bridge$bindSampler(String var1, IIRHCHHOICHRICOOCRORCCIOOIHOIR var2) {
      IIHRRHORCRCROCHHOHORCHCROCIHRO var3 = (IIHRRHORCRCROCHHOHORCHCROCIHRO)var2;
      this.addSamplerTexture(var1, var3.lunar$getHandle());
   }

   public int bridge$getProgram() {
      return this.program;
   }

   public void bridge$apply() {
      this.useShader();
   }

   public void bridge$clear() {
      this.endShader();
   }
}
