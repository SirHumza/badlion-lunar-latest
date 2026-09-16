package org.tritonus.share.sampled.mixer;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import javax.sound.sampled.CompoundControl;
import javax.sound.sampled.Control;

public class TCompoundControl extends CompoundControl implements TControllable {
   private static final Logger logger = System.getLogger("org.tritonus.TraceControl");
   private final TControlController m_controller;

   public TCompoundControl(CompoundControl.Type var1, Control[] var2) {
      super(var1, var2);
      logger.log(Level.TRACE, "TCompoundControl.<init>: begin");
      this.m_controller = new TControlController();
      logger.log(Level.TRACE, "TCompoundControl.<init>: end");
   }

   @Override
   public void setParentControl(TCompoundControl var1) {
      this.m_controller.setParentControl(var1);
   }

   @Override
   public TCompoundControl getParentControl() {
      return this.m_controller.getParentControl();
   }

   @Override
   public void commit() {
      this.m_controller.commit();
   }
}
