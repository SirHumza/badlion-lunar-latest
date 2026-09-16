package org.tritonus.share.midi;

import javax.sound.midi.MidiChannel;

public abstract class TMidiChannel implements MidiChannel {
   private int m_nChannel;

   protected TMidiChannel(int var1) {
      this.m_nChannel = var1;
   }

   protected int getChannel() {
      return this.m_nChannel;
   }

   @Override
   public void noteOff(int var1) {
      this.noteOff(var1, 0);
   }

   @Override
   public void programChange(int var1, int var2) {
      int var3 = var1 >> 7;
      int var4 = var1 & 127;
      this.controlChange(0, var3);
      this.controlChange(32, var4);
      this.programChange(var2);
   }

   @Override
   public void resetAllControllers() {
      this.controlChange(121, 0);
   }

   @Override
   public void allNotesOff() {
      this.controlChange(123, 0);
   }

   @Override
   public void allSoundOff() {
      this.controlChange(120, 0);
   }

   @Override
   public boolean localControl(boolean var1) {
      this.controlChange(122, var1 ? 127 : 0);
      return this.getController(122) >= 64;
   }

   @Override
   public void setMono(boolean var1) {
      this.controlChange(var1 ? 126 : 127, 0);
   }

   @Override
   public boolean getMono() {
      return this.getController(126) == 0;
   }

   @Override
   public void setOmni(boolean var1) {
      this.controlChange(var1 ? 125 : 124, 0);
   }

   @Override
   public boolean getOmni() {
      return this.getController(125) == 0;
   }
}
