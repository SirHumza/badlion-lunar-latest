package net.optifine;

import aio.a;
import java.util.ArrayList;
import java.util.List;
import net.optifine.model.ModelUtils;

public class SmartLeaves {
   private static boq modelLeavesCullAcacia = null;
   private static boq modelLeavesCullBirch = null;
   private static boq modelLeavesCullDarkOak = null;
   private static boq modelLeavesCullJungle = null;
   private static boq modelLeavesCullOak = null;
   private static boq modelLeavesCullSpruce = null;
   private static List generalQuadsCullAcacia = null;
   private static List generalQuadsCullBirch = null;
   private static List generalQuadsCullDarkOak = null;
   private static List generalQuadsCullJungle = null;
   private static List generalQuadsCullOak = null;
   private static List generalQuadsCullSpruce = null;
   private static boq modelLeavesDoubleAcacia = null;
   private static boq modelLeavesDoubleBirch = null;
   private static boq modelLeavesDoubleDarkOak = null;
   private static boq modelLeavesDoubleJungle = null;
   private static boq modelLeavesDoubleOak = null;
   private static boq modelLeavesDoubleSpruce = null;

   public static boq getLeavesModel(boq model, alz stateIn) {
      if (!Config.isTreesSmart()) {
         return model;
      } else {
         List generalQuads = model.a();
         if (generalQuads == generalQuadsCullAcacia) {
            return modelLeavesDoubleAcacia;
         } else if (generalQuads == generalQuadsCullBirch) {
            return modelLeavesDoubleBirch;
         } else if (generalQuads == generalQuadsCullDarkOak) {
            return modelLeavesDoubleDarkOak;
         } else if (generalQuads == generalQuadsCullJungle) {
            return modelLeavesDoubleJungle;
         } else if (generalQuads == generalQuadsCullOak) {
            return modelLeavesDoubleOak;
         } else {
            return generalQuads == generalQuadsCullSpruce ? modelLeavesDoubleSpruce : model;
         }
      }
   }

   public static boolean isSameLeaves(alz state1, alz state2) {
      if (state1 == state2) {
         return true;
      } else {
         afh block1 = state1.c();
         afh block2 = state2.c();
         if (block1 != block2) {
            return false;
         } else if (block1 instanceof aik) {
            return ((a)state1.b(aik.Q)).equals(state2.b(aik.Q));
         } else {
            return block1 instanceof aif ? ((a)state1.b(aif.Q)).equals(state2.b(aif.Q)) : false;
         }
      }
   }

   public static void updateLeavesModels() {
      List updatedTypes = new ArrayList();
      modelLeavesCullAcacia = getModelCull("acacia", updatedTypes);
      modelLeavesCullBirch = getModelCull("birch", updatedTypes);
      modelLeavesCullDarkOak = getModelCull("dark_oak", updatedTypes);
      modelLeavesCullJungle = getModelCull("jungle", updatedTypes);
      modelLeavesCullOak = getModelCull("oak", updatedTypes);
      modelLeavesCullSpruce = getModelCull("spruce", updatedTypes);
      generalQuadsCullAcacia = getGeneralQuadsSafe(modelLeavesCullAcacia);
      generalQuadsCullBirch = getGeneralQuadsSafe(modelLeavesCullBirch);
      generalQuadsCullDarkOak = getGeneralQuadsSafe(modelLeavesCullDarkOak);
      generalQuadsCullJungle = getGeneralQuadsSafe(modelLeavesCullJungle);
      generalQuadsCullOak = getGeneralQuadsSafe(modelLeavesCullOak);
      generalQuadsCullSpruce = getGeneralQuadsSafe(modelLeavesCullSpruce);
      modelLeavesDoubleAcacia = getModelDoubleFace(modelLeavesCullAcacia);
      modelLeavesDoubleBirch = getModelDoubleFace(modelLeavesCullBirch);
      modelLeavesDoubleDarkOak = getModelDoubleFace(modelLeavesCullDarkOak);
      modelLeavesDoubleJungle = getModelDoubleFace(modelLeavesCullJungle);
      modelLeavesDoubleOak = getModelDoubleFace(modelLeavesCullOak);
      modelLeavesDoubleSpruce = getModelDoubleFace(modelLeavesCullSpruce);
      if (updatedTypes.size() > 0) {
         Config.dbg("Enable face culling: " + Config.arrayToString(updatedTypes.toArray()));
      }
   }

   private static List getGeneralQuadsSafe(boq model) {
      return model == null ? null : model.a();
   }

   static boq getModelCull(String type, List updatedTypes) {
      bou modelManager = Config.getModelManager();
      if (modelManager == null) {
         return null;
      }

      jy locState = new jy("blockstates/" + type + "_leaves.json");
      if (Config.getDefiningResourcePack(locState) != Config.getDefaultResourcePack()) {
         return null;
      }

      jy locModel = new jy("models/block/" + type + "_leaves.json");
      if (Config.getDefiningResourcePack(locModel) != Config.getDefaultResourcePack()) {
         return null;
      }

      bov mrl = new bov(type + "_leaves", "normal");
      boq model = modelManager.a(mrl);
      if (model != null && model != modelManager.a()) {
         List listGeneral = model.a();
         if (listGeneral.size() == 0) {
            return model;
         }

         if (listGeneral.size() != 6) {
            return null;
         }

         for (bgg quad : listGeneral) {
            List listFace = model.a(quad.d());
            if (listFace.size() > 0) {
               return null;
            }

            listFace.add(quad);
         }

         listGeneral.clear();
         updatedTypes.add(type + "_leaves");
         return model;
      } else {
         return null;
      }
   }

   private static boq getModelDoubleFace(boq model) {
      if (model == null) {
         return null;
      }

      if (model.a().size() > 0) {
         Config.warn("SmartLeaves: Model is not cube, general quads: " + model.a().size() + ", model: " + model);
         return model;
      }

      cq[] faces = cq.n;

      for (int i = 0; i < faces.length; i++) {
         cq face = faces[i];
         List<bgg> quads = model.a(face);
         if (quads.size() != 1) {
            Config.warn("SmartLeaves: Model is not cube, side: " + face + ", quads: " + quads.size() + ", model: " + model);
            return model;
         }
      }

      boq model2 = ModelUtils.duplicateModel(model);
      List[] faceQuads = new List[faces.length];

      for (int i = 0; i < faces.length; i++) {
         cq face = faces[i];
         List<bgg> quads = model2.a(face);
         bgg quad = quads.get(0);
         bgg quad2 = new bgg((int[])quad.a().clone(), quad.c(), quad.d(), quad.getSprite());
         int[] vd = quad2.a();
         int[] vd2 = (int[])vd.clone();
         int step = vd.length / 4;
         System.arraycopy(vd, 0 * step, vd2, 3 * step, step);
         System.arraycopy(vd, 1 * step, vd2, 2 * step, step);
         System.arraycopy(vd, 2 * step, vd2, 1 * step, step);
         System.arraycopy(vd, 3 * step, vd2, 0 * step, step);
         System.arraycopy(vd2, 0, vd, 0, vd2.length);
         quads.add(quad2);
      }

      return model2;
   }
}
