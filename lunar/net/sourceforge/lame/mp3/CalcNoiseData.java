package net.sourceforge.lame.mp3;

public class CalcNoiseData {
   int global_gain;
   int sfb_count1;
   int[] step = new int[39];
   float[] noise = new float[39];
   float[] noise_log = new float[39];
}
