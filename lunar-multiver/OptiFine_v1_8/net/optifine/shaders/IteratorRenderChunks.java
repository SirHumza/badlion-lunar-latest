package net.optifine.shaders;

import java.util.Iterator;
import net.optifine.BlockPosM;

public class IteratorRenderChunks implements Iterator<bht> {
   private bga viewFrustum;
   private Iterator3d Iterator3d;
   private BlockPosM posBlock = new BlockPosM(0, 0, 0);

   public IteratorRenderChunks(bga viewFrustum, cj posStart, cj posEnd, int width, int height) {
      this.viewFrustum = viewFrustum;
      this.Iterator3d = new Iterator3d(posStart, posEnd, width, height);
   }

   @Override
   public boolean hasNext() {
      return this.Iterator3d.hasNext();
   }

   public bht next() {
      cj pos = this.Iterator3d.next();
      this.posBlock.setXyz(pos.n() << 4, pos.o() << 4, pos.p() << 4);
      return this.viewFrustum.a(this.posBlock);
   }

   @Override
   public void remove() {
      throw new RuntimeException("Not implemented");
   }
}
