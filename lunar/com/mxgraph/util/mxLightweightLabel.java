package com.mxgraph.util;

import java.awt.Font;
import java.awt.Rectangle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

public class mxLightweightLabel extends JLabel {
   private static final Logger log = Logger.getLogger(mxLightweightLabel.class.getName());
   private static final long serialVersionUID = -6771477489533614010L;
   protected static mxLightweightLabel sharedInstance;

   public static mxLightweightLabel getSharedInstance() {
      return sharedInstance;
   }

   public mxLightweightLabel() {
      this.setFont(new Font(mxConstants.DEFAULT_FONTFAMILY, 0, mxConstants.DEFAULT_FONTSIZE));
      this.setVerticalAlignment(1);
   }

   @Override
   public void validate() {
   }

   @Override
   public void revalidate() {
   }

   @Override
   public void repaint(long var1, int var3, int var4, int var5, int var6) {
   }

   @Override
   public void repaint(Rectangle var1) {
   }

   @Override
   protected void firePropertyChange(String var1, Object var2, Object var3) {
      if (var1 == "text" || var1 == "font") {
         super.firePropertyChange(var1, var2, var3);
      }
   }

   @Override
   public void firePropertyChange(String var1, byte var2, byte var3) {
   }

   @Override
   public void firePropertyChange(String var1, char var2, char var3) {
   }

   @Override
   public void firePropertyChange(String var1, short var2, short var3) {
   }

   @Override
   public void firePropertyChange(String var1, int var2, int var3) {
   }

   @Override
   public void firePropertyChange(String var1, long var2, long var4) {
   }

   @Override
   public void firePropertyChange(String var1, float var2, float var3) {
   }

   @Override
   public void firePropertyChange(String var1, double var2, double var4) {
   }

   @Override
   public void firePropertyChange(String var1, boolean var2, boolean var3) {
   }

   static {
      try {
         sharedInstance = new mxLightweightLabel();
      } catch (Exception var1) {
         log.log(Level.SEVERE, "Failed to initialize the shared instance", var1);
      }
   }
}
