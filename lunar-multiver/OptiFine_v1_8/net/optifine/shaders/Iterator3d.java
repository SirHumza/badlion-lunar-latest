package net.optifine.shaders;

import java.util.Iterator;
import net.optifine.BlockPosM;

public class Iterator3d implements Iterator<cj> {
   private IteratorAxis iteratorAxis;
   private BlockPosM blockPos = new BlockPosM(0, 0, 0);
   private int axis = 0;
   private int kX;
   private int kY;
   private int kZ;
   private static final int AXIS_X = 0;
   private static final int AXIS_Y = 1;
   private static final int AXIS_Z = 2;

   public Iterator3d(cj posStart, cj posEnd, int width, int height) {
      boolean revX = posStart.n() > posEnd.n();
      boolean revY = posStart.o() > posEnd.o();
      boolean revZ = posStart.p() > posEnd.p();
      posStart = this.reverseCoord(posStart, revX, revY, revZ);
      posEnd = this.reverseCoord(posEnd, revX, revY, revZ);
      this.kX = revX ? -1 : 1;
      this.kY = revY ? -1 : 1;
      this.kZ = revZ ? -1 : 1;
      aui vec = new aui(posEnd.n() - posStart.n(), posEnd.o() - posStart.o(), posEnd.p() - posStart.p());
      aui vecN = vec.a();
      aui vecX = new aui(1.0, 0.0, 0.0);
      double dotX = vecN.b(vecX);
      double dotXabs = Math.abs(dotX);
      aui vecY = new aui(0.0, 1.0, 0.0);
      double dotY = vecN.b(vecY);
      double dotYabs = Math.abs(dotY);
      aui vecZ = new aui(0.0, 0.0, 1.0);
      double dotZ = vecN.b(vecZ);
      double dotZabs = Math.abs(dotZ);
      if (dotZabs >= dotYabs && dotZabs >= dotXabs) {
         this.axis = 2;
         cj pos1 = new cj(posStart.p(), posStart.o() - width, posStart.n() - height);
         cj pos2 = new cj(posEnd.p(), posStart.o() + width + 1, posStart.n() + height + 1);
         int countX = posEnd.p() - posStart.p();
         double deltaY = (posEnd.o() - posStart.o()) / (1.0 * countX);
         double deltaZ = (posEnd.n() - posStart.n()) / (1.0 * countX);
         this.iteratorAxis = new IteratorAxis(pos1, pos2, deltaY, deltaZ);
      } else if (dotYabs >= dotXabs && dotYabs >= dotZabs) {
         this.axis = 1;
         cj pos1 = new cj(posStart.o(), posStart.n() - width, posStart.p() - height);
         cj pos2 = new cj(posEnd.o(), posStart.n() + width + 1, posStart.p() + height + 1);
         int countX = posEnd.o() - posStart.o();
         double deltaY = (posEnd.n() - posStart.n()) / (1.0 * countX);
         double deltaZ = (posEnd.p() - posStart.p()) / (1.0 * countX);
         this.iteratorAxis = new IteratorAxis(pos1, pos2, deltaY, deltaZ);
      } else {
         this.axis = 0;
         cj pos1 = new cj(posStart.n(), posStart.o() - width, posStart.p() - height);
         cj pos2 = new cj(posEnd.n(), posStart.o() + width + 1, posStart.p() + height + 1);
         int countX = posEnd.n() - posStart.n();
         double deltaY = (posEnd.o() - posStart.o()) / (1.0 * countX);
         double deltaZ = (posEnd.p() - posStart.p()) / (1.0 * countX);
         this.iteratorAxis = new IteratorAxis(pos1, pos2, deltaY, deltaZ);
      }
   }

   private cj reverseCoord(cj pos, boolean revX, boolean revY, boolean revZ) {
      if (revX) {
         pos = new cj(-pos.n(), pos.o(), pos.p());
      }

      if (revY) {
         pos = new cj(pos.n(), -pos.o(), pos.p());
      }

      if (revZ) {
         pos = new cj(pos.n(), pos.o(), -pos.p());
      }

      return pos;
   }

   @Override
   public boolean hasNext() {
      return this.iteratorAxis.hasNext();
   }

   public cj next() {
      cj pos = this.iteratorAxis.next();
      switch (this.axis) {
         case 0:
            this.blockPos.setXyz(pos.n() * this.kX, pos.o() * this.kY, pos.p() * this.kZ);
            return this.blockPos;
         case 1:
            this.blockPos.setXyz(pos.o() * this.kX, pos.n() * this.kY, pos.p() * this.kZ);
            return this.blockPos;
         case 2:
            this.blockPos.setXyz(pos.p() * this.kX, pos.o() * this.kY, pos.n() * this.kZ);
            return this.blockPos;
         default:
            this.blockPos.setXyz(pos.n() * this.kX, pos.o() * this.kY, pos.p() * this.kZ);
            return this.blockPos;
      }
   }

   @Override
   public void remove() {
      throw new RuntimeException("Not supported");
   }

   public static void main(String[] args) {
      cj posStart = new cj(10, 20, 30);
      cj posEnd = new cj(30, 40, 20);
      Iterator3d it = new Iterator3d(posStart, posEnd, 1, 1);

      while (it.hasNext()) {
         cj blockPos = it.next();
         System.out.println("" + blockPos);
      }
   }
}
