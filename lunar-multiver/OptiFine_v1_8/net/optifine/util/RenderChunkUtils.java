package net.optifine.util;

public class RenderChunkUtils {
   public static int getCountBlocks(bht renderChunk) {
      amz[] ebss = renderChunk.getChunk().h();
      if (ebss == null) {
         return 0;
      }

      int indexEbs = renderChunk.j().o() >> 4;
      amz ebs = ebss[indexEbs];
      return ebs == null ? 0 : ebs.getBlockRefCount();
   }

   public static double getRelativeBufferSize(bht renderChunk) {
      int blockCount = getCountBlocks(renderChunk);
      return getRelativeBufferSize(blockCount);
   }

   public static double getRelativeBufferSize(int blockCount) {
      double countRel = blockCount / 4096.0;
      countRel *= 0.995;
      double weight = countRel * 2.0 - 1.0;
      weight = ns.a(weight, -1.0, 1.0);
      return ns.a(1.0 - weight * weight);
   }
}
