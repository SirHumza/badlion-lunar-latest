package net.optifine.shaders;

import bmv.a;
import bmv.b;

public class SVertexFormat {
   public static final int vertexSizeBlock = 14;
   public static final int offsetMidTexCoord = 8;
   public static final int offsetTangent = 10;
   public static final int offsetEntity = 12;
   public static final bmu defVertexFormatTextured = makeDefVertexFormatTextured();

   public static bmu makeDefVertexFormatBlock() {
      bmu vf = new bmu();
      vf.a(new bmv(0, a.a, b.a, 3));
      vf.a(new bmv(0, a.b, b.c, 4));
      vf.a(new bmv(0, a.a, b.d, 2));
      vf.a(new bmv(1, a.e, b.d, 2));
      vf.a(new bmv(0, a.c, b.b, 3));
      vf.a(new bmv(0, a.c, b.g, 1));
      vf.a(new bmv(0, a.a, b.g, 2));
      vf.a(new bmv(0, a.e, b.g, 4));
      vf.a(new bmv(0, a.e, b.g, 4));
      return vf;
   }

   public static bmu makeDefVertexFormatItem() {
      bmu vf = new bmu();
      vf.a(new bmv(0, a.a, b.a, 3));
      vf.a(new bmv(0, a.b, b.c, 4));
      vf.a(new bmv(0, a.a, b.d, 2));
      vf.a(new bmv(0, a.e, b.g, 2));
      vf.a(new bmv(0, a.c, b.b, 3));
      vf.a(new bmv(0, a.c, b.g, 1));
      vf.a(new bmv(0, a.a, b.g, 2));
      vf.a(new bmv(0, a.e, b.g, 4));
      vf.a(new bmv(0, a.e, b.g, 4));
      return vf;
   }

   public static bmu makeDefVertexFormatTextured() {
      bmu vf = new bmu();
      vf.a(new bmv(0, a.a, b.a, 3));
      vf.a(new bmv(0, a.b, b.g, 4));
      vf.a(new bmv(0, a.a, b.d, 2));
      vf.a(new bmv(0, a.e, b.g, 2));
      vf.a(new bmv(0, a.c, b.b, 3));
      vf.a(new bmv(0, a.c, b.g, 1));
      vf.a(new bmv(0, a.a, b.g, 2));
      vf.a(new bmv(0, a.e, b.g, 4));
      vf.a(new bmv(0, a.e, b.g, 4));
      return vf;
   }

   public static void setDefBakedFormat(bmu vf) {
      if (vf != null) {
         vf.a();
         vf.a(new bmv(0, a.a, b.a, 3));
         vf.a(new bmv(0, a.b, b.c, 4));
         vf.a(new bmv(0, a.a, b.d, 2));
         vf.a(new bmv(0, a.e, b.g, 2));
         vf.a(new bmv(0, a.c, b.b, 3));
         vf.a(new bmv(0, a.c, b.g, 1));
         vf.a(new bmv(0, a.a, b.g, 2));
         vf.a(new bmv(0, a.e, b.g, 4));
         vf.a(new bmv(0, a.e, b.g, 4));
      }
   }

   public static bmu duplicate(bmu src) {
      if (src == null) {
         return null;
      }

      bmu dst = new bmu();
      copy(src, dst);
      return dst;
   }

   public static void copy(bmu src, bmu dst) {
      if (src != null && dst != null) {
         dst.a();

         for (int i = 0; i < src.i(); i++) {
            dst.a(src.c(i));
         }
      }
   }
}
