package com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.OpenGlHelper;
import org.lwjgl.opengl.ContextCapabilities;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;
import org.lwjgl.opengl.GLContext;

public class CRRRICCRROCOHHOHIICIHORCOORRRH
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR {
   public boolean CCCCCHHRHOIHHORCHHOCIHHRCHOCRC() {
      return OpenGlHelper.isFramebufferEnabled();
   }

   public boolean OIIHROORCRORRRCOICCCHIOIHIHHRC() {
      return OpenGlHelper.framebufferSupported;
   }

   public boolean HCRCROOHOHOHOHCOCRCCHRIHCORRIO() {
      return OpenGlHelper.framebufferSupported;
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(int var1, float var2, float var3) {
      OpenGlHelper.setLightmapTextureCoords(var1, var2, var3);
   }

   public int ICRICIRRROOICOCHOHICCOHIRCHIOR() {
      return OpenGlHelper.lightmapTexUnit;
   }

   public int CIHOOHCHOCIIHRIORCRCHHOOCRIRHH() {
      return OpenGlHelper.defaultTexUnit;
   }

   public float IORCORRCHCOIRCIRRIIOOHHIORRHIO() {
      return 240.0F;
   }

   public float ICIHRRIOHOHRCRCHRIHOOOCOHOIHCI() {
      return 240.0F;
   }

   public String ROHHCOIHHRHOICCCRCCRRRHHHOIHCI() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? OpenGlHelper.getCpu$v1_8() : "unknown";
   }

   public void COOCCCHCCRCCORRICRHCRROIOCOOIH() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         Minecraft.getMinecraft().entityRenderer.enableLightmap$v1_8();
      } else {
         Minecraft.getMinecraft().entityRenderer.enableLightmap$v1_7(0.0);
      }
   }

   public void CCRCIRCCOCHRCROCCOIORCIOHROCRH() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         Minecraft.getMinecraft().entityRenderer.disableLightmap$v1_8();
      } else {
         Minecraft.getMinecraft().entityRenderer.disableLightmap$v1_7(0.0);
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(int var1, ByteBuffer var2) {
      GL11.glGetBoolean(var1, var2);
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(int var1, IntBuffer var2) {
      GL11.glGetInteger(var1, var2);
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(int var1, FloatBuffer var2) {
      GL11.glGetFloat(var1, var2);
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(int var1, DoubleBuffer var2) {
      GL11.glGetDouble(var1, var2);
   }

   public boolean ORRICCOCRHRHRHOOIROHRHIHROOROH() {
      return GLContext.getCapabilities().OpenGL30;
   }

   public boolean CHIIIIIHRCROHOHHHRRIHHRIIICIIC() {
      return GLContext.getCapabilities().OpenGL33;
   }

   public boolean IRICRCROHROOORCOOHHCOCOCCHHOCI() {
      return GLContext.getCapabilities().OpenGL44;
   }

   public boolean HORRRHCCICIOCOOOCIHCCRCRIOCCHR() {
      return GLContext.getCapabilities().GL_ARB_buffer_storage;
   }

   public boolean IRCHOIROHOHHOIHCICOROOOHIOOIIR() {
      return GLContext.getCapabilities().GL_ARB_framebuffer_object;
   }

   public boolean CROORRIIIHICOIHOOCRRHRCOIHHHCO() {
      return GLContext.getCapabilities().GL_ARB_map_buffer_range;
   }

   public boolean HHRIOOHIOOHHICRRCRIHCHORORRIRI() {
      return GLContext.getCapabilities().GL_ARB_vertex_array_object;
   }

   public boolean IOICHOCIHIIRROOHHRIHOCHOROOCCI() {
      return GLContext.getCapabilities().GL_EXT_framebuffer_object;
   }

   public boolean ICRCOOIHHHRCCROCCRIRCIOCIRIHIH() {
      return GLContext.getCapabilities().OpenGL43;
   }

   public List<String> IIRIIICCOORHIRHCIIROIHOROCICCC() {
      ArrayList var1 = new ArrayList();

      try {
         ContextCapabilities var2 = GLContext.getCapabilities();
         if (var2.OpenGL30) {
            int var3 = GL11.glGetInteger(33309);

            for (int var4 = 0; var4 < var3; var4++) {
               var1.add(GL30.glGetStringi(7939, var4));
            }
         } else {
            String var6 = GL11.glGetString(7939);
            if (var6 != null) {
               var1.addAll(List.of(var6.split(" ")));
            }
         }
      } catch (Exception var5) {
         var5.printStackTrace();
      }

      return var1;
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HCCICIIIHORIIRRCIRRIHORHOHIHCH() {
      int var1;
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
         var1 = OpenGlHelper.framebufferType$v1_12.ordinal();
      } else if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 1) {
         var1 = OpenGlHelper.framebufferType$v1_8;
      } else {
         var1 = OpenGlHelper.field_153212_w$v1_7;
      }

      switch (var1) {
         case 0:
            return com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.BASE;
         case 1:
            return com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.ARB;
         case 2:
            return com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.EXT;
         default:
            throw new RuntimeException("Missing framebuffer support unexpected");
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(int var1, String var2) {
      GL20.glShaderSource(var1, var2);
   }
}
