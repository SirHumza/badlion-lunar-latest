package net.optifine.model;

import afh.a;
import java.util.ArrayList;
import java.util.List;
import org.lwjgl.util.vector.Vector3f;

public class BlockModelUtils {
   private static final float VERTEX_COORD_ACCURACY = 1.0E-6F;

   public static boq makeModelCube(String spriteName, int tintIndex) {
      bmi sprite = Config.getMinecraft().T().a(spriteName);
      return makeModelCube(sprite, tintIndex);
   }

   public static boq makeModelCube(bmi sprite, int tintIndex) {
      List generalQuads = new ArrayList();
      cq[] facings = cq.n;
      List<List<bgg>> faceQuads = new ArrayList<>();

      for (int i = 0; i < facings.length; i++) {
         cq facing = facings[i];
         List quads = new ArrayList();
         quads.add(makeBakedQuad(facing, sprite, tintIndex));
         faceQuads.add(quads);
      }

      boq bakedModel = new bow(generalQuads, faceQuads, true, true, sprite, bgr.a);
      return bakedModel;
   }

   public static boq joinModelsCube(boq modelBase, boq modelAdd) {
      List<bgg> generalQuads = new ArrayList<>();
      generalQuads.addAll(modelBase.a());
      generalQuads.addAll(modelAdd.a());
      cq[] facings = cq.n;
      List faceQuads = new ArrayList();

      for (int i = 0; i < facings.length; i++) {
         cq facing = facings[i];
         List quads = new ArrayList();
         quads.addAll(modelBase.a(facing));
         quads.addAll(modelAdd.a(facing));
         faceQuads.add(quads);
      }

      boolean ao = modelBase.b();
      boolean builtIn = modelBase.d();
      bmi sprite = modelBase.e();
      bgr transforms = modelBase.f();
      boq bakedModel = new bow(generalQuads, faceQuads, ao, builtIn, sprite, transforms);
      return bakedModel;
   }

   public static bgg makeBakedQuad(cq facing, bmi sprite, int tintIndex) {
      Vector3f posFrom = new Vector3f(0.0F, 0.0F, 0.0F);
      Vector3f posTo = new Vector3f(16.0F, 16.0F, 16.0F);
      bgk uv = new bgk(new float[]{0.0F, 0.0F, 16.0F, 16.0F}, 0);
      bgi face = new bgi(facing, tintIndex, "#" + facing.l(), uv);
      bor modelRotation = bor.a;
      bgj partRotation = null;
      boolean uvLocked = false;
      boolean shade = true;
      bgo faceBakery = new bgo();
      return faceBakery.a(posFrom, posTo, face, sprite, facing, modelRotation, partRotation, uvLocked, shade);
   }

   public static boq makeModel(String modelName, String spriteOldName, String spriteNewName) {
      bmh textureMap = Config.getMinecraft().T();
      bmi spriteOld = textureMap.getSpriteSafe(spriteOldName);
      bmi spriteNew = textureMap.getSpriteSafe(spriteNewName);
      return makeModel(modelName, spriteOld, spriteNew);
   }

   public static boq makeModel(String modelName, bmi spriteOld, bmi spriteNew) {
      if (spriteOld != null && spriteNew != null) {
         bou modelManager = Config.getModelManager();
         if (modelManager == null) {
            return null;
         }

         bov mrl = new bov(modelName, "normal");
         boq model = modelManager.a(mrl);
         if (model != null && model != modelManager.a()) {
            boq modelNew = ModelUtils.duplicateModel(model);
            cq[] faces = cq.n;

            for (int i = 0; i < faces.length; i++) {
               cq face = faces[i];
               List<bgg> quads = modelNew.a(face);
               replaceTexture(quads, spriteOld, spriteNew);
            }

            List<bgg> quadsGeneral = modelNew.a();
            replaceTexture(quadsGeneral, spriteOld, spriteNew);
            return modelNew;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   private static void replaceTexture(List<bgg> quads, bmi spriteOld, bmi spriteNew) {
      List<bgg> quadsNew = new ArrayList<>();

      for (bgg quad : quads) {
         if (quad.getSprite() == spriteOld) {
            quad = new bgn(quad, spriteNew);
         }

         quadsNew.add(quad);
      }

      quads.clear();
      quads.addAll(quadsNew);
   }

   public static void snapVertexPosition(Vector3f pos) {
      pos.setX(snapVertexCoord(pos.getX()));
      pos.setY(snapVertexCoord(pos.getY()));
      pos.setZ(snapVertexCoord(pos.getZ()));
   }

   private static float snapVertexCoord(float x) {
      if (x > -1.0E-6F && x < 1.0E-6F) {
         return 0.0F;
      } else {
         return x > 0.999999F && x < 1.000001F ? 1.0F : x;
      }
   }

   public static aug getOffsetBoundingBox(aug aabb, a offsetType, cj pos) {
      int x = pos.n();
      int z = pos.p();
      long k = x * 3129871 ^ z * 116129781L;
      k = k * k * 42317861L + k * 11L;
      double dx = ((float)(k >> 16 & 15L) / 15.0F - 0.5) * 0.5;
      double dz = ((float)(k >> 24 & 15L) / 15.0F - 0.5) * 0.5;
      double dy = 0.0;
      if (offsetType == a.c) {
         dy = ((float)(k >> 20 & 15L) / 15.0F - 1.0) * 0.2;
      }

      return aabb.c(dx, dy, dz);
   }
}
