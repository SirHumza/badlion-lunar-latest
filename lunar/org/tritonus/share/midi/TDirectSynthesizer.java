package org.tritonus.share.midi;

import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiMessage;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.Synthesizer;
import javax.sound.midi.MidiDevice.Info;

public abstract class TDirectSynthesizer extends TMidiDevice implements Synthesizer {
   public TDirectSynthesizer(Info var1) {
      super(var1, false, true);
   }

   private MidiChannel getChannel(int var1) {
      return this.getChannels()[var1];
   }

   @Override
   protected void receive(MidiMessage var1, long var2) {
      if (var1 instanceof ShortMessage var4) {
         int var5 = var4.getChannel();
         int var6 = var4.getCommand();
         int var7 = var4.getData1();
         int var8 = var4.getData2();
         switch (var6) {
            case 128:
               this.getChannel(var5).noteOff(var7, var8);
               break;
            case 144:
               this.getChannel(var5).noteOn(var7, var8);
               break;
            case 160:
               this.getChannel(var5).setPolyPressure(var7, var8);
               break;
            case 176:
               this.getChannel(var5).controlChange(var7, var8);
               break;
            case 192:
               this.getChannel(var5).programChange(var7);
               break;
            case 208:
               this.getChannel(var5).setChannelPressure(var7);
               break;
            case 224:
               this.getChannel(var5).setPitchBend(var7 | var8 << 7);
         }
      }
   }
}
