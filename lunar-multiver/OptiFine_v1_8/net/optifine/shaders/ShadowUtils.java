package net.optifine.shaders;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ShadowUtils {
   public static Iterator<bht> makeShadowChunkIterator(bdb world, double partialTicks, pk viewEntity, int renderDistanceChunks, bga viewFrustum) {
      float shadowRenderDistance = Shaders.getShadowRenderDistance();
      if (!(shadowRenderDistance <= 0.0F) && !(shadowRenderDistance >= (renderDistanceChunks - 1) * 16)) {
         int shadowDistanceChunks = ns.f(shadowRenderDistance / 16.0F) + 1;
         float car = world.d((float)partialTicks);
         float sunTiltRad = Shaders.sunPathRotation * ns.deg2Rad;
         float sar = car > ns.PId2 && car < 3.0F * ns.PId2 ? car + ns.PI : car;
         float dx = -ns.a(sar);
         float dy = ns.b(sar) * ns.b(sunTiltRad);
         float dz = -ns.b(sar) * ns.a(sunTiltRad);
         cj posEntity = new cj(ns.c(viewEntity.s) >> 4, ns.c(viewEntity.t) >> 4, ns.c(viewEntity.u) >> 4);
         cj posStart = posEntity.a(-dx * shadowDistanceChunks, -dy * shadowDistanceChunks, -dz * shadowDistanceChunks);
         cj posEnd = posEntity.a(dx * renderDistanceChunks, dy * renderDistanceChunks, dz * renderDistanceChunks);
         return new IteratorRenderChunks(viewFrustum, posStart, posEnd, shadowDistanceChunks, shadowDistanceChunks);
      } else {
         List<bht> listChunks = Arrays.asList(viewFrustum.f);
         return listChunks.iterator();
      }
   }
}
