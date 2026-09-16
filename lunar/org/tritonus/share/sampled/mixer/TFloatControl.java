package org.tritonus.share.sampled.mixer;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import javax.sound.sampled.FloatControl;

public class TFloatControl extends FloatControl implements TControllable {
   private static final Logger logger = System.getLogger("org.tritonus.TraceControl");
   private TControlController m_controller;

   public TFloatControl(FloatControl.Type var1, float var2, float var3, float var4, int var5, float var6, String var7) {
      super(var1, var2, var3, var4, var5, var6, var7);
      logger.log(Level.TRACE, "TFloatControl.<init>: begin");
      this.m_controller = new TControlController();
      logger.log(Level.TRACE, "TFloatControl.<init>: end");
   }

   public TFloatControl(FloatControl.Type var1, float var2, float var3, float var4, int var5, float var6, String var7, String var8, String var9, String var10) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
      logger.log(Level.TRACE, "TFloatControl.<init>: begin");
      this.m_controller = new TControlController();
      logger.log(Level.TRACE, "TFloatControl.<init>: end");
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
