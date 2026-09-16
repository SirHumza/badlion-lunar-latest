package org.tritonus.share.sampled.mixer;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import javax.sound.sampled.EnumControl;

public class TEnumControl extends EnumControl implements TControllable {
   private static final Logger logger = System.getLogger("org.tritonus.TraceControl");
   private final TControlController m_controller;

   public TEnumControl(EnumControl.Type var1, Object[] var2, Object var3) {
      super(var1, var2, var3);
      logger.log(Level.TRACE, "TEnumControl.<init>: begin");
      this.m_controller = new TControlController();
      logger.log(Level.TRACE, "TEnumControl.<init>: end");
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
