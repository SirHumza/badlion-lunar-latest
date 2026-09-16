package net.sourceforge.lame.mp3;

public class VBRTagData {
   public int frames;
   public int headersize;
   public int encDelay;
   public int encPadding;
   protected int hId;
   protected int samprate;
   protected int flags;
   protected int bytes;
   protected int vbrScale;
   protected byte[] toc = new byte[100];
}
