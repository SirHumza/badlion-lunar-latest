package com.moonsworth.lunar.client.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;

import javax.vecmath.Matrix4f;
import javax.vecmath.Vector3f;
import mchorse.emoticons.morph.Morph;

public class RIOOCHICIHRHOHCCCCCHOCCCOHCRHI {
   private final float[] IORIIICHRRRHORHCHHHCRIORIOOOOR;
   private final float[] rotation;
   private final float[] scale;
   public static final RIOOCHICIHRHOHCCCCCHOCCCOHCRHI HROCHOOIHOCIIIOOCRCRICHORIRHHC = new RIOOCHICIHRHOHCCCCCHOCCCOHCRHI();
   private static final Matrix4f OHHHCIIHROIIIRCCHOCROHORIICOCC = new Matrix4f();

   private RIOOCHICIHRHOHCCCCCHOCCCOHCRHI() {
      this.IORIIICHRRRHORHCHHHCRIORIOOOOR = null;
      this.rotation = null;
      this.scale = null;
   }

   public RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(Morph var1) {
      this.IORIIICHRRRHORHCHHHCRIORIOOOOR = var1.getTranslate();
      this.rotation = var1.getRotation();
      this.scale = var1.getScale();
   }

   public void HHCCIRHCCCIIRHCROHIORHIRHHIORH(Matrix4f var1) {
      if (this.IORIIICHRRRHORHCHHHCRIORIOOOOR != null && this.IORIIICHRRRHORHCHHHCRIORIOOOOR.length == 3) {
         OHHHCIIHROIIIRCCHOCROHORIICOCC.setIdentity();
         OHHHCIIHROIIIRCCHOCROHORIICOCC.setTranslation(
            new Vector3f(this.IORIIICHRRRHORHCHHHCRIORIOOOOR[0], this.IORIIICHRRRHORHCHHHCRIORIOOOOR[1], this.IORIIICHRRRHORHCHHHCRIORIOOOOR[2])
         );
         var1.mul(OHHHCIIHROIIIRCCHOCROHORIICOCC);
      }

      if (this.rotation != null && this.rotation.length == 3) {
         OHHHCIIHROIIIRCCHOCROHORIICOCC.rotX((float)Math.toRadians(this.rotation[0]));
         var1.mul(OHHHCIIHROIIIRCCHOCROHORIICOCC);
         OHHHCIIHROIIIRCCHOCROHORIICOCC.rotY((float)Math.toRadians(this.rotation[1]));
         var1.mul(OHHHCIIHROIIIRCCHOCROHORIICOCC);
         OHHHCIIHROIIIRCCHOCROHORIICOCC.rotZ((float)Math.toRadians(this.rotation[2]));
         var1.mul(OHHHCIIHROIIIRCCHOCROHORIICOCC);
      }

      if (this.scale != null && this.scale.length == 3) {
         OHHHCIIHROIIIRCCHOCROHORIICOCC.setIdentity();
         OHHHCIIHROIIIRCCHOCROHORIICOCC.setM00(this.scale[0]);
         OHHHCIIHROIIIRCCHOCROHORIICOCC.setM11(this.scale[1]);
         OHHHCIIHROIIIRCCHOCROHORIICOCC.setM22(this.scale[2]);
         var1.mul(OHHHCIIHROIIIRCCHOCROHORIICOCC);
      }
   }
}
