package com.moonsworth.lunar.v1_7.optifine.wrapper;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.CORCOCICIRIOHROHROIIOOHICCHCRR;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;
import com.moonsworth.lunar.v1_7.optifine.mixin.OCOHORHCROHICRRIHCIHHRRCIHICRI;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.Objects;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL30;
import shadersmod.client.EnumShaderOption;
import shadersmod.client.Shaders;

public class RIOOCHICIHRHOHCCCCCHOCCCOHCRHI implements CORCOCICIRIOHROHROIIOOHICCHCRR {
   private final IntList activeProgramList = new IntArrayList();

   public boolean hasShadowPass() {
      return Shaders.isShadowPass;
   }

   public String getShaderPack() {
      return Shaders.getShaderPackName();
   }

   public boolean setShaderPack(String var1) {
      if (!Objects.equals(Shaders.shadersConfig.getProperty(EnumShaderOption.SHADER_PACK.getPropertyKey()), var1)) {
         Shaders.setShaderPack(var1);
         return true;
      } else {
         return false;
      }
   }

   public String getPackNone() {
      return "OFF";
   }

   public String getPackDefault() {
      return "(internal)";
   }

   public OOROOCCIRCCRHOIOIORIHCHHOOCCOR getProgramBasic() {
      return new RRCRRCORICCHOHHIRCHIROOHIIOHCO(1);
   }

   public void pushUseProgram(OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1) {
      this.activeProgramList.add(Shaders.activeProgram);
      Shaders.useProgram(var1.getId());
   }

   public void popProgram() {
      int var1 = this.activeProgramList.removeInt(this.activeProgramList.size() - 1);
      Shaders.useProgram(var1);
   }

   public void bindTargetDfb() {
      GL30.glBindFramebuffer(36160, OCOHORHCROHICRRIHCIHHRRCIHICRI.dfb());
   }

   public boolean isRenderingDfb() {
      return Shaders.isRenderingDfb;
   }

   public void restoreViewport() {
      GL11.glViewport(0, 0, Shaders.renderWidth, Shaders.renderHeight);
   }

   public void beginEntitiesGlowing() {
      throw new com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH();
   }

   public void endEntitiesGlowing() {
      throw new com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH();
   }

   public void nextEntity(com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH var1) {
      Shaders.nextEntity((Entity)var1);
   }
}
