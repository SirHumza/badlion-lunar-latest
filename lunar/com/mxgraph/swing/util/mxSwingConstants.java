package com.mxgraph.swing.util;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.image.BufferedImage;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class mxSwingConstants {
   private static final Logger log = Logger.getLogger(mxSwingConstants.class.getName());
   public static BufferedImage EMPTY_IMAGE;
   public static Color SHADOW_COLOR;
   public static Color DEFAULT_VALID_COLOR;
   public static Color DEFAULT_INVALID_COLOR;
   public static Color RUBBERBAND_BORDERCOLOR;
   public static Color RUBBERBAND_FILLCOLOR;
   public static Color HANDLE_BORDERCOLOR;
   public static Color HANDLE_FILLCOLOR;
   public static Color LABEL_HANDLE_FILLCOLOR;
   public static Color CONNECT_HANDLE_FILLCOLOR;
   public static Color LOCKED_HANDLE_FILLCOLOR;
   public static Color EDGE_SELECTION_COLOR;
   public static Color VERTEX_SELECTION_COLOR;
   public static Stroke EDGE_SELECTION_STROKE;
   public static Stroke VERTEX_SELECTION_STROKE;
   public static Stroke PREVIEW_STROKE;
   public static Border PREVIEW_BORDER;

   static {
      try {
         EMPTY_IMAGE = new BufferedImage(1, 1, 1);
      } catch (Exception var2) {
         log.log(Level.FINE, "Failed to initialize EMPTY_IMAGE", var2);
         EMPTY_IMAGE = null;
      }

      try {
         SHADOW_COLOR = Color.gray;
         DEFAULT_VALID_COLOR = Color.GREEN;
         DEFAULT_INVALID_COLOR = Color.RED;
         RUBBERBAND_BORDERCOLOR = new Color(51, 153, 255);
         RUBBERBAND_FILLCOLOR = new Color(51, 153, 255, 80);
         HANDLE_BORDERCOLOR = Color.black;
         HANDLE_FILLCOLOR = Color.green;
         LABEL_HANDLE_FILLCOLOR = Color.yellow;
         LOCKED_HANDLE_FILLCOLOR = Color.red;
         CONNECT_HANDLE_FILLCOLOR = Color.blue;
         EDGE_SELECTION_COLOR = Color.green;
         VERTEX_SELECTION_COLOR = Color.green;
      } catch (Exception var1) {
         log.log(Level.FINE, "Failed to initialize color constants", var1);
         SHADOW_COLOR = null;
         DEFAULT_VALID_COLOR = null;
         DEFAULT_INVALID_COLOR = null;
         RUBBERBAND_BORDERCOLOR = null;
         RUBBERBAND_FILLCOLOR = null;
         HANDLE_BORDERCOLOR = null;
         HANDLE_FILLCOLOR = null;
         LABEL_HANDLE_FILLCOLOR = null;
         LOCKED_HANDLE_FILLCOLOR = null;
         CONNECT_HANDLE_FILLCOLOR = null;
         EDGE_SELECTION_COLOR = null;
         VERTEX_SELECTION_COLOR = null;
      }

      EDGE_SELECTION_STROKE = new BasicStroke(1.0F, 0, 0, 10.0F, new float[]{3.0F, 3.0F}, 0.0F);
      VERTEX_SELECTION_STROKE = new BasicStroke(1.0F, 0, 0, 10.0F, new float[]{3.0F, 3.0F}, 0.0F);
      PREVIEW_STROKE = new BasicStroke(1.0F, 0, 0, 10.0F, new float[]{3.0F, 3.0F}, 0.0F);
      PREVIEW_BORDER = new LineBorder(HANDLE_BORDERCOLOR) {
         private static final long serialVersionUID = 1348016511717964310L;

         @Override
         public void paintBorder(Component var1, Graphics var2, int var3, int var4, int var5, int var6) {
            ((Graphics2D)var2).setStroke(mxSwingConstants.VERTEX_SELECTION_STROKE);
            super.paintBorder(var1, var2, var3, var4, var5, var6);
         }
      };
   }
}
