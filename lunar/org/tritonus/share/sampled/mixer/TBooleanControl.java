package org.tritonus.share.sampled.mixer;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import javax.sound.sampled.BooleanControl;

public class TBooleanControl extends BooleanControl implements TControllable {
   private static final Logger logger = System.getLogger(TBooleanControl.class.getName());
   private final TControlController m_controller;

   public TBooleanControl(BooleanControl.Type var1, boolean var2) {
      this(var1, var2, null);
   }

   public TBooleanControl(BooleanControl.Type var1, boolean var2, TCompoundControl var3) {
      super(var1, var2);
      logger.log(Level.TRACE, "TBooleanControl.<init>: begin");
      this.m_controller = new TControlController();
      logger.log(Level.TRACE, "TBooleanControl.<init>: end");
   }

   public TBooleanControl(BooleanControl.Type var1, boolean var2, String var3, String var4) {
      this(var1, var2, var3, var4, null);
   }

   public TBooleanControl(BooleanControl.Type var1, boolean var2, String var3, String var4, TCompoundControl var5) {
      super(var1, var2, var3, var4);
      logger.log(Level.TRACE, "TBooleanControl.<init>: begin");
      this.m_controller = new TControlController();
      logger.log(Level.TRACE, "TBooleanControl.<init>: end");
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
