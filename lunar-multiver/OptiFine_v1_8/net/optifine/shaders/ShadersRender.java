package net.optifine.shaders;

import java.nio.IntBuffer;
import net.optifine.reflect.Reflector;
import org.lwjgl.opengl.EXTFramebufferObject;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;

public class ShadersRender {
   private static final jy END_PORTAL_TEXTURE = new jy("textures/entity/end_portal.png");

   public static void setFrustrumPosition(bia frustum, double x, double y, double z) {
      frustum.a(x, y, z);
   }

   public static void setupTerrain(bfr renderGlobal, pk viewEntity, double partialTicks, bia camera, int frameCount, boolean playerSpectator) {
      renderGlobal.a(viewEntity, partialTicks, camera, frameCount, playerSpectator);
   }

   public static void beginTerrainSolid() {
      if (Shaders.isRenderingWorld) {
         Shaders.fogEnabled = true;
         Shaders.useProgram(Shaders.ProgramTerrain);
      }
   }

   public static void beginTerrainCutoutMipped() {
      if (Shaders.isRenderingWorld) {
         Shaders.useProgram(Shaders.ProgramTerrain);
      }
   }

   public static void beginTerrainCutout() {
      if (Shaders.isRenderingWorld) {
         Shaders.useProgram(Shaders.ProgramTerrain);
      }
   }

   public static void endTerrain() {
      if (Shaders.isRenderingWorld) {
         Shaders.useProgram(Shaders.ProgramTexturedLit);
      }
   }

   public static void beginTranslucent() {
      if (Shaders.isRenderingWorld) {
         if (Shaders.usedDepthBuffers >= 2) {
            bfl.g(33995);
            Shaders.checkGLError("pre copy depth");
            GL11.glCopyTexSubImage2D(3553, 0, 0, 0, 0, 0, Shaders.renderWidth, Shaders.renderHeight);
            Shaders.checkGLError("copy depth");
            bfl.g(33984);
         }

         Shaders.useProgram(Shaders.ProgramWater);
      }
   }

   public static void endTranslucent() {
      if (Shaders.isRenderingWorld) {
         Shaders.useProgram(Shaders.ProgramTexturedLit);
      }
   }

   public static void renderHand0(bfk er, float par1, int par2) {
      if (!Shaders.isShadowPass) {
         boolean blockTranslucentMain = Shaders.isItemToRenderMainTranslucent();
         boolean blockTranslucentOff = Shaders.isItemToRenderOffTranslucent();
         if (!blockTranslucentMain || !blockTranslucentOff) {
            Shaders.readCenterDepth();
            Shaders.beginHand(false);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            Shaders.setSkipRenderHands(blockTranslucentMain, blockTranslucentOff);
            er.renderHand(par1, par2, true, false, false);
            Shaders.endHand();
            Shaders.setHandsRendered(!blockTranslucentMain, !blockTranslucentOff);
            Shaders.setSkipRenderHands(false, false);
         }
      }
   }

   public static void renderHand1(bfk er, float par1, int par2) {
      if (!Shaders.isShadowPass && !Shaders.isBothHandsRendered()) {
         Shaders.readCenterDepth();
         bfl.l();
         Shaders.beginHand(true);
         GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
         Shaders.setSkipRenderHands(Shaders.isHandRenderedMain(), Shaders.isHandRenderedOff());
         er.renderHand(par1, par2, true, false, true);
         Shaders.endHand();
         Shaders.setHandsRendered(true, true);
         Shaders.setSkipRenderHands(false, false);
      }
   }

   public static void renderItemFP(bfn itemRenderer, float par1, boolean renderTranslucent) {
      Shaders.setRenderingFirstPersonHand(true);
      bfl.a(true);
      if (renderTranslucent) {
         bfl.c(519);
         GL11.glPushMatrix();
         IntBuffer drawBuffers = Shaders.activeDrawBuffers;
         Shaders.setDrawBuffers(Shaders.drawBuffersNone);
         Shaders.renderItemKeepDepthMask = true;
         itemRenderer.a(par1);
         Shaders.renderItemKeepDepthMask = false;
         Shaders.setDrawBuffers(drawBuffers);
         GL11.glPopMatrix();
      }

      bfl.c(515);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      itemRenderer.a(par1);
      Shaders.setRenderingFirstPersonHand(false);
   }

   public static void renderFPOverlay(bfk er, float par1, int par2) {
      if (!Shaders.isShadowPass) {
         Shaders.beginFPOverlay();
         er.renderHand(par1, par2, false, true, false);
         Shaders.endFPOverlay();
      }
   }

   public static void beginBlockDamage() {
      if (Shaders.isRenderingWorld) {
         Shaders.useProgram(Shaders.ProgramDamagedBlock);
         if (Shaders.ProgramDamagedBlock.getId() == Shaders.ProgramTerrain.getId()) {
            Shaders.setDrawBuffers(Shaders.drawBuffersColorAtt0);
            bfl.a(false);
         }
      }
   }

   public static void endBlockDamage() {
      if (Shaders.isRenderingWorld) {
         bfl.a(true);
         Shaders.useProgram(Shaders.ProgramTexturedLit);
      }
   }

   public static void renderShadowMap(bfk entityRenderer, int pass, float partialTicks, long finishTimeNano) {
      if (Shaders.usedShadowDepthBuffers > 0 && --Shaders.shadowPassCounter <= 0) {
         ave mc = ave.A();
         mc.A.c("shadow pass");
         bfr renderGlobal = mc.g;
         Shaders.isShadowPass = true;
         Shaders.shadowPassCounter = Shaders.shadowPassInterval;
         Shaders.preShadowPassThirdPersonView = mc.t.aB;
         mc.t.aB = 1;
         Shaders.checkGLError("pre shadow");
         GL11.glMatrixMode(5889);
         GL11.glPushMatrix();
         GL11.glMatrixMode(5888);
         GL11.glPushMatrix();
         mc.A.c("shadow clear");
         EXTFramebufferObject.glBindFramebufferEXT(36160, Shaders.sfb);
         Shaders.checkGLError("shadow bind sfb");
         mc.A.c("shadow camera");
         entityRenderer.a(partialTicks, 2);
         Shaders.setCameraShadow(partialTicks);
         Shaders.checkGLError("shadow camera");
         Shaders.useProgram(Shaders.ProgramShadow);
         GL20.glDrawBuffers(Shaders.sfbDrawBuffers);
         Shaders.checkGLError("shadow drawbuffers");
         GL11.glReadBuffer(0);
         Shaders.checkGLError("shadow readbuffer");
         EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36096, 3553, Shaders.sfbDepthTextures.get(0), 0);
         if (Shaders.usedShadowColorBuffers != 0) {
            EXTFramebufferObject.glFramebufferTexture2DEXT(36160, 36064, 3553, Shaders.sfbColorTextures.get(0), 0);
         }

         Shaders.checkFramebufferStatus("shadow fb");
         GL11.glClearColor(1.0F, 1.0F, 1.0F, 1.0F);
         GL11.glClear(Shaders.usedShadowColorBuffers != 0 ? 16640 : 256);
         Shaders.checkGLError("shadow clear");
         mc.A.c("shadow frustum");
         bid clippingHelper = ClippingHelperShadow.getInstance();
         mc.A.c("shadow culling");
         bic frustum = new bic(clippingHelper);
         pk viewEntity = mc.ac();
         double viewPosX = viewEntity.P + (viewEntity.s - viewEntity.P) * partialTicks;
         double viewPosY = viewEntity.Q + (viewEntity.t - viewEntity.Q) * partialTicks;
         double viewPosZ = viewEntity.R + (viewEntity.u - viewEntity.R) * partialTicks;
         frustum.a(viewPosX, viewPosY, viewPosZ);
         bfl.j(7425);
         bfl.j();
         bfl.c(515);
         bfl.a(true);
         bfl.a(true, true, true, true);
         bfl.p();
         mc.A.c("shadow prepareterrain");
         mc.P().a(bmh.g);
         mc.A.c("shadow setupterrain");
         int frameCount = 0;
         frameCount = entityRenderer.ae++;
         renderGlobal.a(viewEntity, partialTicks, frustum, frameCount, mc.h.v());
         mc.A.c("shadow updatechunks");
         mc.A.c("shadow terrain");
         bfl.n(5888);
         bfl.E();
         bfl.c();
         renderGlobal.a(adf.a, partialTicks, 2, viewEntity);
         Shaders.checkGLError("shadow terrain solid");
         bfl.d();
         renderGlobal.a(adf.b, partialTicks, 2, viewEntity);
         Shaders.checkGLError("shadow terrain cutoutmipped");
         mc.P().b(bmh.g).b(false, false);
         renderGlobal.a(adf.c, partialTicks, 2, viewEntity);
         Shaders.checkGLError("shadow terrain cutout");
         mc.P().b(bmh.g).a();
         bfl.j(7424);
         bfl.a(516, 0.1F);
         bfl.n(5888);
         bfl.F();
         bfl.E();
         mc.A.c("shadow entities");
         if (Reflector.ForgeHooksClient_setRenderPass.exists()) {
            Reflector.callVoid(Reflector.ForgeHooksClient_setRenderPass, 0);
         }

         renderGlobal.a(viewEntity, frustum, partialTicks);
         Shaders.checkGLError("shadow entities");
         bfl.n(5888);
         bfl.F();
         bfl.a(true);
         bfl.k();
         bfl.o();
         bfl.a(770, 771, 1, 0);
         bfl.a(516, 0.1F);
         if (Shaders.usedShadowDepthBuffers >= 2) {
            bfl.g(33989);
            Shaders.checkGLError("pre copy shadow depth");
            GL11.glCopyTexSubImage2D(3553, 0, 0, 0, 0, 0, Shaders.shadowMapWidth, Shaders.shadowMapHeight);
            Shaders.checkGLError("copy shadow depth");
            bfl.g(33984);
         }

         bfl.k();
         bfl.a(true);
         mc.P().a(bmh.g);
         bfl.j(7425);
         Shaders.checkGLError("shadow pre-translucent");
         GL20.glDrawBuffers(Shaders.sfbDrawBuffers);
         Shaders.checkGLError("shadow drawbuffers pre-translucent");
         Shaders.checkFramebufferStatus("shadow pre-translucent");
         if (Shaders.isRenderShadowTranslucent()) {
            mc.A.c("shadow translucent");
            renderGlobal.a(adf.d, partialTicks, 2, viewEntity);
            Shaders.checkGLError("shadow translucent");
         }

         if (Reflector.ForgeHooksClient_setRenderPass.exists()) {
            avc.b();
            Reflector.call(Reflector.ForgeHooksClient_setRenderPass, 1);
            renderGlobal.a(viewEntity, frustum, partialTicks);
            Reflector.call(Reflector.ForgeHooksClient_setRenderPass, -1);
            avc.a();
            Shaders.checkGLError("shadow entities 1");
         }

         bfl.j(7424);
         bfl.a(true);
         bfl.o();
         bfl.k();
         GL11.glFlush();
         Shaders.checkGLError("shadow flush");
         Shaders.isShadowPass = false;
         mc.t.aB = Shaders.preShadowPassThirdPersonView;
         mc.A.c("shadow postprocess");
         if (Shaders.hasGlGenMipmap) {
            if (Shaders.usedShadowDepthBuffers >= 1) {
               if (Shaders.shadowMipmapEnabled[0]) {
                  bfl.g(33988);
                  bfl.i(Shaders.sfbDepthTextures.get(0));
                  GL30.glGenerateMipmap(3553);
                  GL11.glTexParameteri(3553, 10241, Shaders.shadowFilterNearest[0] ? 9984 : 9987);
               }

               if (Shaders.usedShadowDepthBuffers >= 2 && Shaders.shadowMipmapEnabled[1]) {
                  bfl.g(33989);
                  bfl.i(Shaders.sfbDepthTextures.get(1));
                  GL30.glGenerateMipmap(3553);
                  GL11.glTexParameteri(3553, 10241, Shaders.shadowFilterNearest[1] ? 9984 : 9987);
               }

               bfl.g(33984);
            }

            if (Shaders.usedShadowColorBuffers >= 1) {
               if (Shaders.shadowColorMipmapEnabled[0]) {
                  bfl.g(33997);
                  bfl.i(Shaders.sfbColorTextures.get(0));
                  GL30.glGenerateMipmap(3553);
                  GL11.glTexParameteri(3553, 10241, Shaders.shadowColorFilterNearest[0] ? 9984 : 9987);
               }

               if (Shaders.usedShadowColorBuffers >= 2 && Shaders.shadowColorMipmapEnabled[1]) {
                  bfl.g(33998);
                  bfl.i(Shaders.sfbColorTextures.get(1));
                  GL30.glGenerateMipmap(3553);
                  GL11.glTexParameteri(3553, 10241, Shaders.shadowColorFilterNearest[1] ? 9984 : 9987);
               }

               bfl.g(33984);
            }
         }

         Shaders.checkGLError("shadow postprocess");
         EXTFramebufferObject.glBindFramebufferEXT(36160, Shaders.dfb);
         GL11.glViewport(0, 0, Shaders.renderWidth, Shaders.renderHeight);
         Shaders.activeDrawBuffers = null;
         mc.P().a(bmh.g);
         Shaders.useProgram(Shaders.ProgramTerrain);
         GL11.glMatrixMode(5888);
         GL11.glPopMatrix();
         GL11.glMatrixMode(5889);
         GL11.glPopMatrix();
         GL11.glMatrixMode(5888);
         Shaders.checkGLError("shadow end");
      }
   }

   public static void preRenderChunkLayer(adf blockLayerIn) {
      if (Shaders.isRenderBackFace(blockLayerIn)) {
         bfl.p();
      }

      if (bqs.f()) {
         GL11.glEnableClientState(32885);
         GL20.glEnableVertexAttribArray(Shaders.midTexCoordAttrib);
         GL20.glEnableVertexAttribArray(Shaders.tangentAttrib);
         GL20.glEnableVertexAttribArray(Shaders.entityAttrib);
      }
   }

   public static void postRenderChunkLayer(adf blockLayerIn) {
      if (bqs.f()) {
         GL11.glDisableClientState(32885);
         GL20.glDisableVertexAttribArray(Shaders.midTexCoordAttrib);
         GL20.glDisableVertexAttribArray(Shaders.tangentAttrib);
         GL20.glDisableVertexAttribArray(Shaders.entityAttrib);
      }

      if (Shaders.isRenderBackFace(blockLayerIn)) {
         bfl.o();
      }
   }

   public static void setupArrayPointersVbo() {
      int vertexSizeI = 14;
      GL11.glVertexPointer(3, 5126, 56, 0L);
      GL11.glColorPointer(4, 5121, 56, 12L);
      GL11.glTexCoordPointer(2, 5126, 56, 16L);
      bqs.l(bqs.r);
      GL11.glTexCoordPointer(2, 5122, 56, 24L);
      bqs.l(bqs.q);
      GL11.glNormalPointer(5120, 56, 28L);
      GL20.glVertexAttribPointer(Shaders.midTexCoordAttrib, 2, 5126, false, 56, 32L);
      GL20.glVertexAttribPointer(Shaders.tangentAttrib, 4, 5122, false, 56, 40L);
      GL20.glVertexAttribPointer(Shaders.entityAttrib, 3, 5122, false, 56, 48L);
   }

   public static void beaconBeamBegin() {
      Shaders.useProgram(Shaders.ProgramBeaconBeam);
   }

   public static void beaconBeamStartQuad1() {
   }

   public static void beaconBeamStartQuad2() {
   }

   public static void beaconBeamDraw1() {
   }

   public static void beaconBeamDraw2() {
      bfl.k();
   }

   public static void renderEnchantedGlintBegin() {
      Shaders.useProgram(Shaders.ProgramArmorGlint);
   }

   public static void renderEnchantedGlintEnd() {
      if (Shaders.isRenderingWorld) {
         if (Shaders.isRenderingFirstPersonHand() && Shaders.isRenderBothHands()) {
            Shaders.useProgram(Shaders.ProgramHand);
         } else {
            Shaders.useProgram(Shaders.ProgramEntities);
         }
      } else {
         Shaders.useProgram(Shaders.ProgramNone);
      }
   }

   public static boolean renderEndPortal(alp te, double x, double y, double z, float partialTicks, int destroyStage, float offset) {
      if (!Shaders.isShadowPass && Shaders.activeProgram.getId() == 0) {
         return false;
      }

      bfl.f();
      Config.getTextureManager().a(END_PORTAL_TEXTURE);
      bfx tessellator = bfx.a();
      bfd vertexbuffer = tessellator.c();
      vertexbuffer.a(7, bms.a);
      float col = 0.5F;
      float r = col * 0.15F;
      float g = col * 0.3F;
      float b = col * 0.4F;
      float u0 = 0.0F;
      float u1 = 0.2F;
      float v0 = u0;
      float v1 = u1;
      float du = (float)(System.currentTimeMillis() % 100000L) / 100000.0F;
      float dv = du;
      float dy = offset;
      int lu = 240;
      int lv = lu;
      vertexbuffer.b(x, y + dy, z + 1.0).a(r, g, b, 1.0F).a(u0 + du, v0 + dv).a(lu, lv).d();
      vertexbuffer.b(x + 1.0, y + dy, z + 1.0).a(r, g, b, 1.0F).a(u0 + du, v1 + dv).a(lu, lv).d();
      vertexbuffer.b(x + 1.0, y + dy, z).a(r, g, b, 1.0F).a(u1 + du, v1 + dv).a(lu, lv).d();
      vertexbuffer.b(x, y + dy, z).a(r, g, b, 1.0F).a(u1 + du, v0 + dv).a(lu, lv).d();
      tessellator.b();
      bfl.e();
      return true;
   }
}
