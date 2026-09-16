package net.optifine.model;

import java.util.ArrayList;
import java.util.List;

public class ModelUtils {
   public static void dbgModel(boq model) {
      if (model != null) {
         Config.dbg("Model: " + model + ", ao: " + model.b() + ", gui3d: " + model.c() + ", builtIn: " + model.d() + ", particle: " + model.e());
         cq[] faces = cq.n;

         for (int i = 0; i < faces.length; i++) {
            cq face = faces[i];
            List faceQuads = model.a(face);
            dbgQuads(face.l(), faceQuads, "  ");
         }

         List generalQuads = model.a();
         dbgQuads("General", generalQuads, "  ");
      }
   }

   private static void dbgQuads(String name, List quads, String prefix) {
      for (bgg quad : quads) {
         dbgQuad(name, quad, prefix);
      }
   }

   public static void dbgQuad(String name, bgg quad, String prefix) {
      Config.dbg(
         prefix + "Quad: " + quad.getClass().getName() + ", type: " + name + ", face: " + quad.d() + ", tint: " + quad.c() + ", sprite: " + quad.getSprite()
      );
      dbgVertexData(quad.a(), "  " + prefix);
   }

   public static void dbgVertexData(int[] vd, String prefix) {
      int step = vd.length / 4;
      Config.dbg(prefix + "Length: " + vd.length + ", step: " + step);

      for (int i = 0; i < 4; i++) {
         int pos = i * step;
         float x = Float.intBitsToFloat(vd[pos + 0]);
         float y = Float.intBitsToFloat(vd[pos + 1]);
         float z = Float.intBitsToFloat(vd[pos + 2]);
         int col = vd[pos + 3];
         float u = Float.intBitsToFloat(vd[pos + 4]);
         float v = Float.intBitsToFloat(vd[pos + 5]);
         Config.dbg(prefix + i + " xyz: " + x + "," + y + "," + z + " col: " + col + " u,v: " + u + "," + v);
      }
   }

   public static boq duplicateModel(boq model) {
      List generalQuads2 = duplicateQuadList(model.a());
      cq[] faces = cq.n;
      List faceQuads2 = new ArrayList();

      for (int i = 0; i < faces.length; i++) {
         cq face = faces[i];
         List quads = model.a(face);
         List quads2 = duplicateQuadList(quads);
         faceQuads2.add(quads2);
      }

      return new bow(generalQuads2, faceQuads2, model.b(), model.c(), model.e(), model.f());
   }

   public static List duplicateQuadList(List list) {
      List list2 = new ArrayList();

      for (bgg quad : list) {
         bgg quad2 = duplicateQuad(quad);
         list2.add(quad2);
      }

      return list2;
   }

   public static bgg duplicateQuad(bgg quad) {
      return new bgg((int[])quad.a().clone(), quad.c(), quad.d(), quad.getSprite());
   }
}
