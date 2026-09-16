package net.sourceforge.lame.mp3;

public final class ReplayGain {
   float[] linprebuf = new float[20];
   int linpre;
   float[] lstepbuf = new float[2411];
   int lstep;
   float[] loutbuf = new float[2411];
   int lout;
   float[] rinprebuf = new float[20];
   int rinpre;
   float[] rstepbuf = new float[2411];
   int rstep;
   float[] routbuf = new float[2411];
   int rout;
   int sampleWindow;
   int totsamp;
   double lsum;
   double rsum;
   int freqindex;
   int first;
   int[] A = new int[12000];
   int[] B = new int[12000];
}
