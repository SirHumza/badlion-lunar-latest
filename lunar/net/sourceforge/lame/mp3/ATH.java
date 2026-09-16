package net.sourceforge.lame.mp3;

public class ATH {
   int useAdjust;
   float aaSensitivityP;
   float adjust;
   float adjustLimit;
   float decay;
   float floor;
   float[] l = new float[22];
   float[] s = new float[13];
   float[] psfb21 = new float[6];
   float[] psfb12 = new float[6];
   float[] cb_l = new float[64];
   float[] cb_s = new float[64];
   float[] eql_w = new float[512];
}
