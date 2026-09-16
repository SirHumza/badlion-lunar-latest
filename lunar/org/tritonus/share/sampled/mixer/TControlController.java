package org.tritonus.share.sampled.mixer;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;

public class TControlController implements TControllable {
   private static final Logger logger = System.getLogger("org.tritonus.TraceControl");
   private TCompoundControl m_parentControl;

   @Override
   public void setParentControl(TCompoundControl var1) {
      this.m_parentControl = var1;
   }

   @Override
   public TCompoundControl getParentControl() {
      return this.m_parentControl;
   }

   @Override
   public void commit() {
      logger.log(Level.TRACE, "TControlController.commit(): called [" + this.getClass().getName() + "]");
      if (this.getParentControl() != null) {
         this.getParentControl().commit();
      }
   }
}
