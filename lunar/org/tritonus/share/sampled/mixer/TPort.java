package org.tritonus.share.sampled.mixer;

import java.util.Collection;
import javax.sound.sampled.Control;
import javax.sound.sampled.Port;
import javax.sound.sampled.Line.Info;

public class TPort extends TLine implements Port {
   public TPort(TMixer var1, Info var2) {
      super(var1, var2);
   }

   public TPort(TMixer var1, Info var2, Collection<Control> var3) {
      super(var1, var2, var3);
   }
}
