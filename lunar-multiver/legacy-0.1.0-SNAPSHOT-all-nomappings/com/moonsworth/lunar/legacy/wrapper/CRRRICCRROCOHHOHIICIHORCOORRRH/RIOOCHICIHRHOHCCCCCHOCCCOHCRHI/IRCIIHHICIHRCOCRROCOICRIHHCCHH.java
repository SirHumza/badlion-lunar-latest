package com.moonsworth.lunar.legacy.wrapper.CRRRICCRROCOHHOHIICIHORCOORRRH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GLAllocation;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;
import org.lwjgl.util.glu.GLU;
import org.lwjgl.util.glu.Project;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   public static com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IIRHCHHOICHRICOOCRORCCIOOIHOIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH ICCOIHIOHCIRRCIIRCCHIHROHCHOOH;

   public boolean ICCIRICOHOCCCICROHCRCIOHOIRIIC() {
      return Minecraft.instance.isCallingFromMinecraftThread();
   }

   public boolean RIHCIRRIOICHROIOROIIIRIHORRRIR() {
      return this.ICCIRICOHOCCCICROHCRCIOHOIRIIC() ? true : this.RRIIRIHICIRHHCCRCHIHICOCRRORHI();
   }

   public boolean RRIIRIHICIRHHCCRCHIHICOCRRORHI() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5 ? Minecraft.instance.debugRenderer$v1_12 == null : Minecraft.instance.loadingScreen == null;
   }

   public void HHIHIIOICHCCHIIRRCCRHHHOOCOOCO() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         GlStateManager.pushMatrix();
      } else {
         GL11.glPushMatrix();
      }
   }

   public void HROOORICCCOROOORORCORRHRHORIRC() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         GlStateManager.popMatrix();
      } else {
         GL11.glPopMatrix();
      }
   }

   public void bridge$scale(float var1, float var2, float var3) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         GlStateManager.scale(var1, var2, var3);
      } else {
         GL11.glScaled(var1, var2, var3);
      }
   }

   public void OCOHORHCROHICRRIHCIHHRRCIHICRI(int var1) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         GlStateManager.bindTexture(var1);
      } else {
         GL11.glBindTexture(3553, var1);
      }
   }

   public int HRCOHHCIOHCHRHHCOCHOCIHROOIRIH() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1
         ? GlStateManager.textureState[GlStateManager.activeTextureUnit].textureName
         : GL11.glGetInteger(3553);
   }

   public int IOICICOROHHHOHROOOHCRCCOIRIOHO() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         return GlStateManager.activeTextureUnit;
      } else {
         throw new RuntimeException("getActiveTexture() isn't supported in 1.7");
      }
   }

   public void CRICCOOHHHCHOORCICOCOHIHOIRHOO(float var1, float var2, float var3, float var4) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         GlStateManager.color(var1, var2, var3, var4);
      } else {
         GL11.glColor4f(var1, var2, var3, var4);
      }
   }

   public void RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(float var1, float var2, float var3) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         GlStateManager.color(var1, var2, var3);
      } else {
         GL11.glColor3f(var1, var2, var3);
      }
   }

   public void RRIRHIRRCRIIHCCIOORCCIOCICOCHI() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         GlStateManager.enableBlend();
      } else {
         GL11.glEnable(3042);
      }
   }

   public boolean IOOORHIIOIRRCRIHHCHIRCCHCRRCCR() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? GlStateManager.blendState.blend.currentState : GL11.glGetBoolean(3042);
   }

   public void OIOROIIOROCRCRHROCOHOOIHCIIHOI() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         GlStateManager.enableTexture2D();
      } else {
         GL11.glEnable(3553);
      }
   }

   public void RHRHIHHRHRHRIIRCCOCIHHHOHCIOCH() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         GlStateManager.disableBlend();
      } else {
         GL11.glDisable(3042);
      }
   }

   public void OICRCOIIRHIOHIOCOCOOIHRCORHOIO() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         GlStateManager.disableTexture2D();
      } else {
         GL11.glDisable(3553);
      }
   }

   public boolean ICRIROCRHORHCHHOHRIORRIROCOOIR() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1
         ? GlStateManager.textureState[GlStateManager.activeTextureUnit].texture2DState.currentState
         : GL11.glGetBoolean(3553);
   }

   public void RRCRRCORICCHOHHIRCHIROOHIIOHCO(int var1, int var2) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         GlStateManager.blendFunc(var1, var2);
      } else {
         GL11.glBlendFunc(var1, var2);
      }
   }

   public void HROROOHRCIHHOIOHIOOHCORHHRCCIH() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         GlStateManager.disableAlpha();
      } else {
         GL11.glDisable(3008);
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(int var1, float var2) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         GlStateManager.alphaFunc(var1, var2);
      } else {
         GL11.glAlphaFunc(var1, var2);
      }
   }

   public int RCCOIIHIHORORRRIRROICICOROOCCO() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? GlStateManager.alphaState.func : GL11.glGetInteger(3009);
   }

   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(int var1, int var2, int var3, int var4) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         GlStateManager.tryBlendFuncSeparate(var1, var2, var3, var4);
      } else {
         OpenGlHelper.glBlendFunc(var1, var2, var3, var4);
      }
   }

   public void IIRHCHHOICHRICOOCRORCCIOOIHOIR(int var1) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         GlStateManager.shadeModel(var1);
      } else {
         GL11.glShadeModel(var1);
      }
   }

   public int RHOIRCHRIHOORCICHIRHCORCIORRRR() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? GlStateManager.activeShadeModel : GL11.glGetInteger(2900);
   }

   public void HOHCOOORCOCOCIIOIORHCRCRCRHOOI() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         GlStateManager.enableAlpha();
      } else {
         GL11.glEnable(3008);
      }
   }

   public boolean RROIHOHRRCRICIIRHCCHOCOROOCOOR() {
      return com.moonsworth.lunar.legacy.wrapper.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIRHCOCHCRIHRRRCOCOOHOOHRORHHH.CHIIRROIHRICHCOROCOOCOIIHRRROR;
   }

   public void bridge$translate(float var1, float var2, float var3) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         GlStateManager.translate(var1, var2, var3);
      } else {
         GL11.glTranslatef(var1, var2, var3);
      }
   }

   public void CORCOCICIRIOHROHROIIOOHICCHCRR(float var1, float var2, float var3, float var4) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         GlStateManager.rotate(var1, var2, var3, var4);
      } else {
         GL11.glRotatef(var1, var2, var3, var4);
      }
   }

   public boolean[] HHOOIRORCCOOORRIIIOCRCRHIICOCH() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         return new boolean[]{
            GlStateManager.colorMaskState.red, GlStateManager.colorMaskState.green, GlStateManager.colorMaskState.blue, GlStateManager.colorMaskState.alpha
         };
      } else {
         throw new com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH();
      }
   }

   public void CORCOCICIRIOHROHROIIOOHICCHCRR(boolean var1) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         GlStateManager.depthMask(var1);
      } else {
         GL11.glDepthMask(var1);
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(boolean var1, boolean var2, boolean var3, boolean var4) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         GlStateManager.colorMask(var1, var2, var3, var4);
      } else {
         GL11.glColorMask(var1, var2, var3, var4);
      }
   }

   public boolean HIRHCRIHHRCCIICCRHRHRCRRRCRIOC() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? GlStateManager.depthState.maskEnabled : GL11.glGetBoolean(2930);
   }

   public void CIOHHCORHRCCRICCCORIHCRHCCCRRR(int var1) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         GlStateManager.depthFunc(var1);
      } else {
         GL11.glDepthFunc(var1);
      }
   }

   public void HCOOCHIICIIHIHHOHOORCHOIRRIRIO() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         GlStateManager.disableLighting();
      } else {
         GL11.glDisable(2896);
      }
   }

   public void OOIRIOIHHIOOIHIHHIHROCIHHIRCHI() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         GlStateManager.enableLighting();
      } else {
         GL11.glEnable(2896);
      }
   }

   public boolean HOHHCRCHCORRIOHROCIOOHOOROIRCI() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? GlStateManager.lightingState.currentState : GL11.glGetBoolean(2896);
   }

   public void IHHCHHHCRIHOOCOIOOCRIIICIOROIR(int var1) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         GlStateManager.matrixMode(var1);
      } else {
         GL11.glMatrixMode(var1);
      }
   }

   public int RHIHOOOHCIRRIOCRRRHRIHIORICOHI() {
      return GL11.glGetInteger(2976);
   }

   public void IOIIROROOICRCHCOHHIIHRCRIOIOOH() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         GlStateManager.disableDepth();
      } else {
         GL11.glDisable(2929);
      }
   }

   public void IHCRHHHRRRRHICCHOROCRHHCRCRHOO() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         GlStateManager.enableDepth();
      } else {
         GL11.glEnable(2929);
      }
   }

   public boolean IOCCIOHHRCIOHOHOHCOHCRHCCRIIOI() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? GlStateManager.depthState.depthTest.currentState : GL11.glGetBoolean(2929);
   }

   public void IHCOIHIICIIHOOIICCHHCRORHORHCI() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         GlStateManager.enableRescaleNormal();
      } else {
         GL11.glEnable(32826);
      }
   }

   public void HOHROOIORCHOIIOOIIHHIHRCOCHIRO() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         GlStateManager.disableRescaleNormal();
      } else {
         GL11.glDisable(32826);
      }
   }

   public boolean RCHRHOCCORRRCRORCHIIRRIIIRRCRR() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? GlStateManager.rescaleNormalState.currentState : GL11.glGetBoolean(32826);
   }

   public void OHORCCHOIOCRHROIRRHICHCIIOCRCH() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         GlStateManager.enableCull();
      } else {
         GL11.glEnable(2884);
      }
   }

   public void OICIOHIRRIIOIHOOHOCHIIOHHIRCCO() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         GlStateManager.disableCull();
      } else {
         GL11.glDisable(2884);
      }
   }

   public boolean IHHOOOHOIIOHRROCHCOOIIHHCOIHII() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? GlStateManager.cullState.cullFace.currentState : GL11.glGetBoolean(2884);
   }

   public int IOOHCHIHOOIROCCIRCCORRRHCCHHRO() {
      return GLAllocation.generateDisplayLists(1);
   }

   public void IRRCCOICORICIHCHRHIHIHROIRHOCR(int var1) {
      GL11.glNewList(var1, 4864);
   }

   public void RICRIRRCOHRCOCRRHHCRHRROOIOHHR(int var1) {
      GL11.glEndList();
   }

   public void RHOCHHIRRCHHHOHOIRROIROHHHIHIO(int var1) {
      GL11.glCallList(var1);
   }

   public void RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(int var1, int var2) {
      GL11.glDeleteLists(var1, var2);
   }

   public boolean HRHRIHRROHHORROCHCOHICRROHRRIO() {
      return false;
   }

   public void HRHICOCCOOHROCCIHHOHORHIHHHHOO() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         GlStateManager.enableColorMaterial();
      } else {
         GL11.glEnable(2903);
      }
   }

   public void OHHRIOHROOIHOROCIRHCHORIHRRRRI(int var1) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         GlStateManager.setActiveTexture(var1);
      } else {
         OpenGlHelper.setActiveTexture(var1);
      }
   }

   public void HOHHRHCIOCRCHCOOOHORROICORCCCC() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         GlStateManager.enablePolygonOffset();
      } else {
         GL11.glEnable(32823);
      }
   }

   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(float var1, float var2) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         GlStateManager.doPolygonOffset(var1, var2);
      } else {
         GL11.glPolygonOffset(var1, var2);
      }
   }

   public void RICIORHICRROHOCHRRCRIHCROOCIIC() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         GlStateManager.disablePolygonOffset();
      } else {
         GL11.glDisable(32823);
      }
   }

   public boolean HRCRHOOIROHCIIRHIIROHHROHRHHCR() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? GlStateManager.polygonOffsetState.polygonOffsetFill.currentState : GL11.glGetBoolean(32823);
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(FloatBuffer var1) {
      GL11.glMultMatrix(var1);
   }

   public void HRCHROOHRIHCRCRHRIIROCIRHOIRHH(float var1) {
      GL11.glLineWidth(var1);
   }

   public void CRICCOOHHHCHOORCICOCOHIHOIRHOO(boolean var1) {
      if (var1) {
         GL11.glEnable(2848);
      } else {
         GL11.glDisable(2848);
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(int var1, int var2, FloatBuffer var3) {
      switch (var2) {
         case 2:
            GL20.glUniformMatrix2(var1, false, var3);
            break;
         case 3:
            GL20.glUniformMatrix3(var1, false, var3);
            break;
         case 4:
            GL20.glUniformMatrix4(var1, false, var3);
      }
   }

   public void HHCCIRHCCCIIRHCROHIORHIRHHIORH(int var1, int var2, int var3, int var4) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         GlStateManager.viewport(var1, var2, var3, var4);
      } else {
         GL11.glViewport(var1, var2, var3, var4);
      }
   }

   public void bridge$loadIdentity() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         GlStateManager.loadIdentity();
      } else {
         GL11.glLoadIdentity();
      }
   }

   public void IIHRRHORCRCROCHHOHORCHCROCIHRO(float var1, float var2, float var3, float var4) {
      Project.gluPerspective(var1, var2, var3, var4);
   }

   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(float var1, float var2, float var3, FloatBuffer var4, FloatBuffer var5, IntBuffer var6, FloatBuffer var7) {
      GLU.gluProject(var1, var2, var3, var4, var5, var6, var7);
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1
   ) {
   }

   public void CCHHIOROOICROROOCOHHCRRICCOCRO() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         GlStateManager.disableColorMaterial();
      } else {
         GL11.glDisable(2903);
      }
   }

   public boolean HOCHCOORIOCIICCIRCCHCCOCOIRHRC() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? GlStateManager.colorMaterialState.colorMaterial.currentState : GL11.glGetBoolean(2903);
   }

   public void RRCRRCORICCHOHHIRCHIROOHIIOHCO(double var1, double var3, double var5, double var7, double var9, double var11) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         GlStateManager.ortho(var1, var3, var5, var7, var9, var11);
      } else {
         GL11.glOrtho(var1, var3, var5, var7, var9, var11);
      }
   }

   public boolean OCOHIOCHOCHRCCROORRIIIHIOHOIIR() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? GlStateManager.fogState.fog.currentState : GL11.glGetBoolean(2912);
   }

   public void HCOCHRHICOOCHHIHOHIRRHOIRHCHHH() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         GlStateManager.enableFog();
      } else {
         GL11.glEnable(2912);
      }
   }

   public void CHCCIROOIHCCRCIHCIOIHRIIHROIRO() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         GlStateManager.disableFog();
      } else {
         GL11.glDisable(2912);
      }
   }

   public float ICORRRIOCIIRICCCOIHCRRIORHOIIC() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? GlStateManager.fogState.start : GL11.glGetFloat(2915);
   }

   public float RCRICHOCHHHCRCORROOIHCROOIICOC() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? GlStateManager.fogState.end : GL11.glGetFloat(2916);
   }

   public void RRCRRCORICCHOHHIRCHIROOHIIOHCO(float var1) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         GlStateManager.setFogStart(var1);
      } else {
         GL11.glFogf(2915, var1);
      }
   }

   public void RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(float var1) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         GlStateManager.setFogEnd(var1);
      } else {
         GL11.glFogf(2916, var1);
      }
   }

   public void CRRRICCRROCOHHOHIICIHORCOORRRH(float var1) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         GlStateManager.setFogDensity(var1);
      } else {
         GL11.glFogf(2914, var1);
      }
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IIRHCHHOICHRICOOCRORCCIOOIHOIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH IRHOCOORCOORCHCIICCOHHHOICHCCR() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 0) {
         return null;
      }

      if (ICCOIHIOHCIRRCIIRCCHIHROHCHOOH == null) {
         ICCOIHIOHCIRRCIIRCCHIHROHCHOOH = new com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IIRHCHHOICHRICOOCRORCCIOOIHOIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();
      }

      return ICCOIHIOHCIRRCIIRCCHIHROHCHOOH;
   }

   public void RICOIROIIOCOHICCHOHOICRHRCROHC() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         ICCOIHIOHCIRRCIIRCCHIHROHCHOOH = null;
      }
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH IIIORCCOIHHRCIRHOCIIICOHOOCHIH() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
         String var6 = GlStateManager.glGetString$v1_12(7936);
         String var7 = "OpenGL";
         String var8 = GlStateManager.glGetString$v1_12(7938);
         String var9 = GlStateManager.glGetString$v1_12(7937);
         int var10 = GL11.glGetInteger(3379);
         return new com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
            var6, var7, var8, var9, var10
         );
      } else {
         String var1 = GL11.glGetString(7936);
         String var2 = "OpenGL";
         String var3 = GL11.glGetString(7938);
         String var4 = GL11.glGetString(7937);
         int var5 = GL11.glGetInteger(3379);
         return new com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
            var1, var2, var3, var4, var5
         );
      }
   }

   public void IIHRRHORCRCROCHHOHORCHCROCIHRO(boolean var1) {
      if (var1) {
         GL11.glEnable(3089);
      } else {
         GL11.glDisable(3089);
      }
   }

   public void CRRRICCRROCOHHOHIICIHORCOORRRH(int var1, int var2, int var3, int var4) {
      GL11.glScissor(var1, var2, var3, var4);
   }
}
