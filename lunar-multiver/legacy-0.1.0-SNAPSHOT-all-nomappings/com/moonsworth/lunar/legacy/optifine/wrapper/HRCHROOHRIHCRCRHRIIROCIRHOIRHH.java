package com.moonsworth.lunar.legacy.optifine.wrapper;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.CORCOCICIRIOHROHROIIOOHICCHCRR;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;
import java.util.Objects;
import net.minecraft.entity.Entity;
import net.optifine.shaders.Program;
import net.optifine.shaders.SVertexFormat;
import net.optifine.shaders.Shaders;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL30;

public class HRCHROOHRIHCRCRHRIIROCIRHOIRHH implements CORCOCICIRIOHROHROIIOOHICCHCRR {
   public boolean hasShadowPass() {
      return Shaders.isShadowPass;
   }

   public String getShaderPack() {
      return Shaders.getShaderPackName();
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OHHRIOHROOIHOROCIRHCHORIHRRRRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH getEntityModelVertexFormat() {
      return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OHHRIOHROOIHOROCIRHCHORIHRRRRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH)SVertexFormat.defVertexFormatTextured;
   }

   public boolean setShaderPack(String var1) {
      if (!Objects.equals(Shaders.currentShaderName, var1)) {
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
      return (OOROOCCIRCCRHOIOIORIHCHHOOCCOR)Shaders.ProgramBasic;
   }

   public void pushUseProgram(OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1) {
      Shaders.pushProgram();
      Shaders.useProgram((Program)var1);
   }

   public void popProgram() {
      Shaders.popProgram();
   }

   public void bindTargetDfb() {
      GL30.glBindFramebuffer(36160, Shaders.dfb);
   }

   public boolean isRenderingDfb() {
      return Shaders.isRenderingDfb;
   }

   public void restoreViewport() {
      GL11.glViewport(0, 0, Shaders.renderWidth, Shaders.renderHeight);
   }

   public void beginEntitiesGlowing() {
      Shaders.beginEntitiesGlowing();
   }

   public void endEntitiesGlowing() {
      Shaders.endEntitiesGlowing();
   }

   public void nextEntity(com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR.CRRRICCRROCOHHOHIICIHORCOORRRH var1) {
      Shaders.nextEntity((Entity)var1);
   }
}
