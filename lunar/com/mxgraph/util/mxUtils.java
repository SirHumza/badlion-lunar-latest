package com.mxgraph.util;

import com.mxgraph.io.mxCodecRegistry;
import com.mxgraph.model.mxCellPath;
import com.mxgraph.model.mxICell;
import com.mxgraph.model.mxIGraphModel;
import com.mxgraph.view.mxCellState;
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.font.FontRenderContext;
import java.awt.font.TextAttribute;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.text.html.HTMLDocument;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

public class mxUtils {
   private static final Logger log = Logger.getLogger(mxUtils.class.getName());
   public static boolean IS_MAC = System.getProperty("os.name").toLowerCase().indexOf("mac") >= 0;
   public static boolean IS_LINUX = System.getProperty("os.name").toLowerCase().indexOf("linux") >= 0;
   protected static transient Graphics fontGraphics;

   public static mxRectangle getLabelSize(String var0, Map<String, Object> var1, boolean var2, double var3) {
      return getLabelSize(var0, var1, var2, var3, 0.0);
   }

   public static mxRectangle getLabelSize(String var0, Map<String, Object> var1, boolean var2, double var3, double var5) {
      mxRectangle var7;
      if (var2) {
         var7 = getSizeForHtml(getBodyMarkup(var0, true), var1, var3, var5);
      } else {
         var7 = getSizeForString(var0, getFont(var1), var3);
      }

      return var7;
   }

   public static String getBodyMarkup(String var0, boolean var1) {
      String var2 = var0.toLowerCase();
      int var3 = var2.indexOf("<body>");
      if (var3 >= 0) {
         var3 += 7;
         int var4 = var2.lastIndexOf("</body>");
         if (var4 > var3) {
            var0 = var0.substring(var3, var4).trim();
         }
      }

      if (var1) {
         var0 = var0.replaceAll("\n", "<br>");
      }

      return var0;
   }

   public static mxRectangle getLabelPaintBounds(String var0, Map<String, Object> var1, boolean var2, mxPoint var3, mxRectangle var4, double var5) {
      return getLabelPaintBounds(var0, var1, var2, var3, var4, var5, false);
   }

   public static mxRectangle getLabelPaintBounds(String var0, Map<String, Object> var1, boolean var2, mxPoint var3, mxRectangle var4, double var5, boolean var7) {
      double var8 = 0.0;
      if (var2 && var4 != null && getString(var1, mxConstants.STYLE_WHITE_SPACE, "nowrap").equals("wrap")) {
         var8 = var4.getWidth();
      }

      mxRectangle var10 = getLabelSize(var0, var1, var2, var5, var8);
      var10.setWidth(var10.getWidth() / var5);
      var10.setHeight(var10.getHeight() / var5);
      double var11 = var3.getX();
      double var13 = var3.getY();
      double var15 = 0.0;
      double var17 = 0.0;
      if (var4 != null) {
         var11 += var4.getX();
         var13 += var4.getY();
         if (getString(var1, mxConstants.STYLE_SHAPE, "").equals("swimlane")) {
            boolean var19 = isTrue(var1, mxConstants.STYLE_HORIZONTAL, true);
            double var20 = getDouble(var1, mxConstants.STYLE_STARTSIZE, mxConstants.DEFAULT_STARTSIZE) * var5;
            if (var19) {
               var15 += var4.getWidth();
               var17 += var20;
            } else {
               var15 += var20;
               var17 += var4.getHeight();
            }
         } else {
            var15 += var7 ? 0.0 : var4.getWidth();
            var17 += var4.getHeight();
         }
      }

      return getScaledLabelBounds(var11, var13, var10, var15, var17, var1, var5);
   }

   public static mxRectangle getScaledLabelBounds(double var0, double var2, mxRectangle var4, double var5, double var7, Map<String, Object> var9, double var10) {
      double var12 = mxConstants.LABEL_INSET * var10;
      double var14 = var4.getWidth() * var10 + 2.0 * var12;
      double var16 = var4.getHeight() * var10 + 2.0 * var12;
      boolean var18 = isTrue(var9, mxConstants.STYLE_HORIZONTAL, true);
      int var19 = (int)(getInt(var9, mxConstants.STYLE_SPACING) * var10);
      String var20 = getString(var9, mxConstants.STYLE_ALIGN, "center");
      String var21 = getString(var9, mxConstants.STYLE_VERTICAL_ALIGN, "middle");
      int var22 = (int)(getInt(var9, mxConstants.STYLE_SPACING_TOP) * var10);
      int var23 = (int)(getInt(var9, mxConstants.STYLE_SPACING_BOTTOM) * var10);
      int var24 = (int)(getInt(var9, mxConstants.STYLE_SPACING_LEFT) * var10);
      int var25 = (int)(getInt(var9, mxConstants.STYLE_SPACING_RIGHT) * var10);
      if (!var18) {
         int var26 = var22;
         var22 = var25;
         var25 = var23;
         var23 = var24;
         var24 = var26;
         double var27 = var14;
         var14 = var16;
         var16 = var27;
      }

      if ((!var18 || !var20.equals("center")) && (var18 || !var21.equals("middle"))) {
         if ((!var18 || !var20.equals("right")) && (var18 || !var21.equals("bottom"))) {
            var0 += var19 + var24;
         } else {
            var0 += var5 - var14 - var19 - var25;
         }
      } else {
         var0 += (var5 - var14) / 2.0 + var24 - var25;
      }

      if ((var18 || !var20.equals("center")) && (!var18 || !var21.equals("middle"))) {
         if ((var18 || !var20.equals("left")) && (!var18 || !var21.equals("bottom"))) {
            var2 += var19 + var22;
         } else {
            var2 += var7 - var16 - var19 - var23;
         }
      } else {
         var2 += (var7 - var16) / 2.0 + var22 - var23;
      }

      return new mxRectangle(var0, var2, var14, var16);
   }

   public static FontMetrics getFontMetrics(Font var0) {
      return fontGraphics != null ? fontGraphics.getFontMetrics(var0) : null;
   }

   public static mxRectangle getSizeForString(String var0, Font var1, double var2) {
      FontRenderContext var4 = new FontRenderContext(null, false, false);
      var1 = var1.deriveFont((float)(var1.getSize2D() * var2));
      FontMetrics var5 = null;
      if (fontGraphics != null) {
         var5 = fontGraphics.getFontMetrics(var1);
      }

      double var6 = mxConstants.LINESPACING;
      if (var5 != null) {
         var6 += var5.getHeight();
      } else {
         var6 += var1.getSize2D() * 1.27;
      }

      String[] var8 = var0.split("\n");
      Rectangle2D var9 = null;
      if (var8.length == 0) {
         var9 = var1.getStringBounds("", var4);
      } else {
         for (int var10 = 0; var10 < var8.length; var10++) {
            Rectangle2D var11 = var1.getStringBounds(var8[var10], var4);
            if (var9 == null) {
               var9 = var11;
            } else {
               var9.setFrame(0.0, 0.0, Math.max(var9.getWidth(), var11.getWidth()), var9.getHeight() + var6);
            }
         }
      }

      return new mxRectangle(var9);
   }

   public static String[] wordWrap(String var0, FontMetrics var1, double var2) {
      ArrayList var4 = new ArrayList();
      String[] var5 = var0.split("\n");

      for (int var6 = 0; var6 < var5.length; var6++) {
         int var7 = 0;
         int var8 = 0;
         StringBuilder var9 = new StringBuilder();
         String[] var10 = var5[var6].split("\\s+");
         Stack var11 = new Stack();

         for (int var12 = var10.length - 1; var12 >= 0; var12--) {
            var11.push(var10[var12]);
         }

         while (!var11.isEmpty()) {
            String var19 = (String)var11.pop();
            int var13 = 0;
            if (var19.length() > 0) {
               char var14 = var19.charAt(0);
               int var15 = var5[var6].indexOf(var14, var8);
               String var16 = var5[var6].substring(var8, var15);
               var13 = var16.length();
               var19 = var16.concat(var19);
            }

            double var22;
            if (var7 > 0) {
               var22 = var1.stringWidth(var19);
            } else {
               var22 = var1.stringWidth(var19.trim());
            }

            if (var7 + var22 > var2) {
               if (var7 > 0) {
                  var4.add(var9.toString());
                  var9 = new StringBuilder();
                  var11.push(var19.trim());
                  var7 = 0;
               } else if (mxConstants.SPLIT_WORDS) {
                  var19 = var19.trim();

                  for (int var24 = 1; var24 <= var19.length(); var24++) {
                     var22 = var1.stringWidth(var19.substring(0, var24));
                     if (var7 + var22 > var2) {
                        var24 = var24 > 1 ? var24 - 1 : var24;
                        String var17 = var19.substring(0, var24);
                        var9 = var9.append(var17);
                        var11.push(var19.substring(var24, var19.length()));
                        var4.add(var9.toString());
                        var9 = new StringBuilder();
                        var7 = 0;
                        var8 = var8 + var17.length() + var13;
                        break;
                     }
                  }
               } else {
                  var19 = var19.trim();
                  var4.add(var19);
                  var9 = new StringBuilder();
                  var7 = 0;
                  var8 = var19.length() + var13;
               }
            } else {
               if (var7 > 0) {
                  var9 = var9.append(var19);
               } else {
                  var9 = var9.append(var19.trim());
               }

               var7 = (int)(var7 + var22);
               var8 += var19.length();
            }
         }

         var4.add(var9.toString());
      }

      return var4.toArray(new String[var4.size()]);
   }

   public static mxRectangle getSizeForHtml(String var0, Map<String, Object> var1, double var2, double var4) {
      mxLightweightLabel var6 = mxLightweightLabel.getSharedInstance();
      if (var6 != null) {
         var6.setText(createHtmlDocument(var1, var0));
         Dimension var7 = var6.getPreferredSize();
         if (var4 > 0.0) {
            var6.setText(createHtmlDocument(var1, var0, 1.0, (int)Math.ceil(var4 - mxConstants.LABEL_INSET * var2)));
            Dimension var8 = var6.getPreferredSize();
            if (var8.width < var7.width) {
               var7 = var8;
            }
         }

         return new mxRectangle(0.0, 0.0, var7.width * var2, var7.height * var2);
      } else {
         return getSizeForString(var0, getFont(var1), var2);
      }
   }

   public static double[] arcToCurves(double var0, double var2, double var4, double var6, double var8, double var10, double var12, double var14, double var16) {
      var14 -= var0;
      var16 -= var2;
      if (var4 != 0.0 && var6 != 0.0) {
         double var18 = var12;
         double var20 = var8;
         var4 = Math.abs(var4);
         var6 = Math.abs(var6);
         double var22 = -var14 / 2.0;
         double var24 = -var16 / 2.0;
         double var26 = Math.cos(var20 * Math.PI / 180.0);
         double var28 = Math.sin(var20 * Math.PI / 180.0);
         double var30 = var26 * var22 + var28 * var24;
         double var32 = -1.0 * var28 * var22 + var26 * var24;
         double var34 = var30 * var30;
         double var36 = var32 * var32;
         double var38 = var4 * var4;
         double var40 = var6 * var6;
         double var42 = var34 / var38 + var36 / var40;
         double var44;
         if (var42 > 1.0) {
            var4 = Math.sqrt(var42) * var4;
            var6 = Math.sqrt(var42) * var6;
            var44 = 0.0;
         } else {
            double var46 = 1.0;
            if (var10 == var18) {
               var46 = -1.0;
            }

            var44 = var46 * Math.sqrt((var38 * var40 - var38 * var36 - var40 * var34) / (var38 * var36 + var40 * var34));
         }

         double var98 = var44 * var4 * var32 / var6;
         double var48 = -1.0 * var44 * var6 * var30 / var4;
         double var50 = var26 * var98 - var28 * var48 + var14 / 2.0;
         double var52 = var28 * var98 + var26 * var48 + var16 / 2.0;
         double var54 = Math.atan2((var32 - var48) / var6, (var30 - var98) / var4) - Math.atan2(0.0, 1.0);
         double var56 = var54 >= 0.0 ? var54 : (Math.PI * 2) + var54;
         var54 = Math.atan2((-var32 - var48) / var6, (-var30 - var98) / var4) - Math.atan2((var32 - var48) / var6, (var30 - var98) / var4);
         double var58 = var54 >= 0.0 ? var54 : (Math.PI * 2) + var54;
         if (var18 == 0.0 && var58 > 0.0) {
            var58 -= Math.PI * 2;
         } else if (var18 != 0.0 && var58 < 0.0) {
            var58 += Math.PI * 2;
         }

         double var60 = var58 * 2.0 / Math.PI;
         int var62 = (int)Math.ceil(var60 < 0.0 ? -1.0 * var60 : var60);
         double var63 = var58 / var62;
         double var65 = 2.0 * Math.sin(var63 / 4.0) * Math.sin(var63 / 4.0) / Math.sin(var63 / 2.0);
         double var67 = var26 * var4;
         double var69 = var26 * var6;
         double var71 = var28 * var4;
         double var73 = var28 * var6;
         double var75 = Math.cos(var56);
         double var77 = Math.sin(var56);
         double var79 = -var65 * (var67 * var77 + var73 * var75);
         double var81 = -var65 * (var71 * var77 - var69 * var75);
         double var83 = 0.0;
         double var85 = 0.0;
         double[] var87 = new double[var62 * 6];

         for (int var88 = 0; var88 < var62; var88++) {
            var56 += var63;
            var75 = Math.cos(var56);
            var77 = Math.sin(var56);
            var83 = var67 * var75 - var73 * var77 + var50;
            var85 = var71 * var75 + var69 * var77 + var52;
            double var89 = -var65 * (var67 * var77 + var73 * var75);
            double var91 = -var65 * (var71 * var77 - var69 * var75);
            int var93 = var88 * 6;
            var87[var93] = var79 + var0;
            var87[var93 + 1] = var81 + var2;
            var87[var93 + 2] = var83 - var89 + var0;
            var87[var93 + 3] = var85 - var91 + var2;
            var87[var93 + 4] = var83 + var0;
            var87[var93 + 5] = var85 + var2;
            var79 = var83 + var89;
            var81 = var85 + var91;
         }

         return var87;
      } else {
         return new double[0];
      }
   }

   public static mxRectangle getBoundingBox(mxRectangle var0, double var1) {
      mxRectangle var3 = null;
      if (var0 != null && var1 != 0.0) {
         double var4 = Math.toRadians(var1);
         double var6 = Math.cos(var4);
         double var8 = Math.sin(var4);
         mxPoint var10 = new mxPoint(var0.getX() + var0.getWidth() / 2.0, var0.getY() + var0.getHeight() / 2.0);
         mxPoint var11 = new mxPoint(var0.getX(), var0.getY());
         mxPoint var12 = new mxPoint(var0.getX() + var0.getWidth(), var0.getY());
         mxPoint var13 = new mxPoint(var12.getX(), var0.getY() + var0.getHeight());
         mxPoint var14 = new mxPoint(var0.getX(), var13.getY());
         var11 = getRotatedPoint(var11, var6, var8, var10);
         var12 = getRotatedPoint(var12, var6, var8, var10);
         var13 = getRotatedPoint(var13, var6, var8, var10);
         var14 = getRotatedPoint(var14, var6, var8, var10);
         Rectangle var15 = new Rectangle((int)var11.getX(), (int)var11.getY(), 0, 0);
         var15.add(var12.getPoint());
         var15.add(var13.getPoint());
         var15.add(var14.getPoint());
         var3 = new mxRectangle(var15);
      } else if (var0 != null) {
         var3 = (mxRectangle)var0.clone();
      }

      return var3;
   }

   public static int firstCharAt(String var0, int var1, int var2) {
      int var3 = 0;

      while (var3 >= 0) {
         var3 = var0.indexOf(var1, var2);
         if (var3 == 0) {
            return var3;
         }

         if (var3 > 0) {
            if (!Character.isLetter(var0.codePointAt(var3 - 1))) {
               return var3;
            }

            if (++var2 >= var0.length()) {
               return -1;
            }

            var3 = var0.indexOf(var1, var2);
         }
      }

      return var3;
   }

   public static mxPoint getRotatedPoint(mxPoint var0, double var1, double var3) {
      return getRotatedPoint(var0, var1, var3, new mxPoint());
   }

   public static int findNearestSegment(mxCellState var0, double var1, double var3) {
      int var5 = -1;
      if (var0.getAbsolutePointCount() > 0) {
         mxPoint var6 = var0.getAbsolutePoint(0);
         double var7 = Double.MAX_VALUE;

         for (int var9 = 1; var9 < var0.getAbsolutePointCount(); var9++) {
            mxPoint var10 = var0.getAbsolutePoint(var9);
            double var11 = new java.awt.geom.Line2D.Double(var6.x, var6.y, var10.x, var10.y).ptSegDistSq(var1, var3);
            if (var11 < var7) {
               var7 = var11;
               var5 = var9 - 1;
            }

            var6 = var10;
         }
      }

      return var5;
   }

   public static mxPoint getRotatedPoint(mxPoint var0, double var1, double var3, mxPoint var5) {
      double var6 = var0.getX() - var5.getX();
      double var8 = var0.getY() - var5.getY();
      double var10 = var6 * var1 - var8 * var3;
      double var12 = var8 * var1 + var6 * var3;
      return new mxPoint(var10 + var5.getX(), var12 + var5.getY());
   }

   public static int getPortConstraints(mxCellState var0, mxCellState var1, boolean var2) {
      return getPortConstraints(var0, var1, var2, 15);
   }

   public static int getPortConstraints(mxCellState var0, mxCellState var1, boolean var2, int var3) {
      Object var4 = var0.getStyle().get(mxConstants.STYLE_PORT_CONSTRAINT);
      if (var4 == null) {
         return var3;
      }

      String var5 = var4.toString();
      byte var6 = 0;
      if (var5.indexOf("north") >= 0) {
         var6 |= 2;
      }

      if (var5.indexOf("west") >= 0) {
         var6 |= 1;
      }

      if (var5.indexOf("south") >= 0) {
         var6 |= 4;
      }

      if (var5.indexOf("east") >= 0) {
         var6 |= 8;
      }

      return var6;
   }

   public static int reversePortConstraints(int var0) {
      int var1 = 0;
      var1 = (var0 & 1) << 3;
      var1 |= (var0 & 2) << 1;
      var1 |= (var0 & 4) >> 1;
      return var1 | (var0 & 8) >> 3;
   }

   public static void drawImageClip(Graphics var0, BufferedImage var1, ImageObserver var2) {
      Rectangle var3 = var0.getClipBounds();
      if (var3 != null) {
         int var4 = var1.getWidth();
         int var5 = var1.getHeight();
         int var6 = Math.max(0, Math.min(var3.x, var4));
         int var7 = Math.max(0, Math.min(var3.y, var5));
         var4 = Math.min(var3.width, var4 - var6);
         var5 = Math.min(var3.height, var5 - var7);
         if (var4 > 0 && var5 > 0) {
            var0.drawImage(var1.getSubimage(var6, var7, var4, var5), var3.x, var3.y, var2);
         }
      } else {
         var0.drawImage(var1, 0, 0, var2);
      }
   }

   public static void fillClippedRect(Graphics var0, int var1, int var2, int var3, int var4) {
      Rectangle var5 = new Rectangle(var1, var2, var3, var4);

      try {
         if (var0.getClipBounds() != null) {
            var5 = var5.intersection(var0.getClipBounds());
         }
      } catch (Exception var7) {
         log.log(Level.SEVERE, "Failed to compute intersection", var7);
      }

      var0.fillRect(var5.x, var5.y, var5.width, var5.height);
   }

   public static List<mxPoint> translatePoints(List<mxPoint> var0, double var1, double var3) {
      ArrayList var5 = null;
      if (var0 != null) {
         var5 = new ArrayList(var0.size());
         Iterator var6 = var0.iterator();

         while (var6.hasNext()) {
            mxPoint var7 = (mxPoint)((mxPoint)var6.next()).clone();
            var7.setX(var7.getX() + var1);
            var7.setY(var7.getY() + var3);
            var5.add(var7);
         }
      }

      return var5;
   }

   public static mxPoint intersection(double var0, double var2, double var4, double var6, double var8, double var10, double var12, double var14) {
      double var16 = (var14 - var10) * (var4 - var0) - (var12 - var8) * (var6 - var2);
      double var18 = (var12 - var8) * (var2 - var10) - (var14 - var10) * (var0 - var8);
      double var20 = (var4 - var0) * (var2 - var10) - (var6 - var2) * (var0 - var8);
      double var22 = var18 / var16;
      double var24 = var20 / var16;
      if (var22 >= 0.0 && var22 <= 1.0 && var24 >= 0.0 && var24 <= 1.0) {
         double var26 = var0 + var22 * (var4 - var0);
         double var28 = var2 + var22 * (var6 - var2);
         return new mxPoint(var26, var28);
      } else {
         return null;
      }
   }

   public static Object[] sortCells(Object[] var0, boolean var1) {
      return sortCells(Arrays.asList(var0), var1).toArray();
   }

   public static Collection<Object> sortCells(Collection<Object> var0, final boolean var1) {
      TreeSet var2 = new TreeSet<>(new Comparator<Object>() {
         @Override
         public int compare(Object var1x, Object var2x) {
            int var3 = mxCellPath.compare(mxCellPath.create((mxICell)var1x), mxCellPath.create((mxICell)var2x));
            return var3 == 0 ? 0 : (var3 > 0 == var1 ? 1 : -1);
         }
      });
      var2.addAll(var0);
      return var2;
   }

   public static boolean contains(Object[] var0, Object var1) {
      return indexOf(var0, var1) >= 0;
   }

   public static int indexOf(Object[] var0, Object var1) {
      if (var1 != null && var0 != null) {
         for (int var2 = 0; var2 < var0.length; var2++) {
            if (var0[var2] == var1) {
               return var2;
            }
         }
      }

      return -1;
   }

   public static String getStylename(String var0) {
      return mxStyleUtils.getStylename(var0);
   }

   public static String[] getStylenames(String var0) {
      return mxStyleUtils.getStylenames(var0);
   }

   public static int indexOfStylename(String var0, String var1) {
      return mxStyleUtils.indexOfStylename(var0, var1);
   }

   public static String removeAllStylenames(String var0) {
      return mxStyleUtils.removeAllStylenames(var0);
   }

   public static void setCellStyles(mxIGraphModel var0, Object[] var1, String var2, String var3) {
      mxStyleUtils.setCellStyles(var0, var1, var2, var3);
   }

   public static String setStyle(String var0, String var1, String var2) {
      return mxStyleUtils.setStyle(var0, var1, var2);
   }

   public static void setCellStyleFlags(mxIGraphModel var0, Object[] var1, String var2, int var3, Boolean var4) {
      mxStyleUtils.setCellStyleFlags(var0, var1, var2, var3, var4);
   }

   public static String setStyleFlag(String var0, String var1, int var2, Boolean var3) {
      return mxStyleUtils.setStyleFlag(var0, var1, var2, var3);
   }

   public static boolean intersectsHotspot(mxCellState var0, int var1, int var2, double var3) {
      return intersectsHotspot(var0, var1, var2, var3, 0, 0);
   }

   public static boolean intersectsHotspot(mxCellState var0, int var1, int var2, double var3, int var5, int var6) {
      if (var3 > 0.0) {
         int var7 = (int)Math.round(var0.getCenterX());
         int var8 = (int)Math.round(var0.getCenterY());
         int var9 = (int)Math.round(var0.getWidth());
         int var10 = (int)Math.round(var0.getHeight());
         if (getString(var0.getStyle(), mxConstants.STYLE_SHAPE, "").equals("swimlane")) {
            int var11 = getInt(var0.getStyle(), mxConstants.STYLE_STARTSIZE, mxConstants.DEFAULT_STARTSIZE);
            if (isTrue(var0.getStyle(), mxConstants.STYLE_HORIZONTAL, true)) {
               var8 = (int)Math.round(var0.getY() + var11 / 2);
               var10 = var11;
            } else {
               var7 = (int)Math.round(var0.getX() + var11 / 2);
               var9 = var11;
            }
         }

         int var14 = (int)Math.max(var5, var9 * var3);
         int var12 = (int)Math.max(var5, var10 * var3);
         if (var6 > 0) {
            var14 = Math.min(var14, var6);
            var12 = Math.min(var12, var6);
         }

         Rectangle var13 = new Rectangle(Math.round(var7 - var14 / 2), Math.round(var8 - var12 / 2), var14, var12);
         return var13.contains(var1, var2);
      } else {
         return true;
      }
   }

   public static boolean isTrue(Map<String, Object> var0, String var1) {
      return isTrue(var0, var1, false);
   }

   public static boolean isTrue(Map<String, Object> var0, String var1, boolean var2) {
      Object var3 = var0.get(var1);
      return var3 == null ? var2 : var3.equals("1") || var3.toString().toLowerCase().equals("true");
   }

   public static int getInt(Map<String, Object> var0, String var1) {
      return getInt(var0, var1, 0);
   }

   public static int getInt(Map<String, Object> var0, String var1, int var2) {
      Object var3 = var0.get(var1);
      return var3 == null ? var2 : (int)Float.parseFloat(var3.toString());
   }

   public static float getFloat(Map<String, Object> var0, String var1) {
      return getFloat(var0, var1, 0.0F);
   }

   public static float getFloat(Map<String, Object> var0, String var1, float var2) {
      Object var3 = var0.get(var1);
      return var3 == null ? var2 : Float.parseFloat(var3.toString());
   }

   public static float[] getFloatArray(Map<String, Object> var0, String var1, float[] var2) {
      return getFloatArray(var0, var1, var2, ",");
   }

   public static float[] getFloatArray(Map<String, Object> var0, String var1, float[] var2, String var3) {
      Object var4 = var0.get(var1);
      if (var4 == null) {
         return var2;
      }

      String[] var5 = var4.toString().split(var3);
      float[] var6 = new float[var5.length];

      for (int var7 = 0; var7 < var5.length; var7++) {
         var6[var7] = Float.parseFloat(var5[var7]);
      }

      return var6;
   }

   public static double getDouble(Map<String, Object> var0, String var1) {
      return getDouble(var0, var1, 0.0);
   }

   public static double getDouble(Map<String, Object> var0, String var1, double var2) {
      Object var4 = var0.get(var1);
      return var4 == null ? var2 : Double.parseDouble(var4.toString());
   }

   public static String getString(Map<String, Object> var0, String var1) {
      return getString(var0, var1, null);
   }

   public static String getString(Map<String, Object> var0, String var1, String var2) {
      Object var3 = var0.get(var1);
      return var3 == null ? var2 : var3.toString();
   }

   public static Color getColor(Map<String, Object> var0, String var1) {
      return getColor(var0, var1, null);
   }

   public static Color getColor(Map<String, Object> var0, String var1, Color var2) {
      Object var3 = var0.get(var1);
      return var3 == null ? var2 : parseColor(var3.toString());
   }

   public static Font getFont(Map<String, Object> var0) {
      return getFont(var0, 1.0);
   }

   public static Font getFont(Map<String, Object> var0, double var1) {
      String var3 = getString(var0, mxConstants.STYLE_FONTFAMILY, mxConstants.DEFAULT_FONTFAMILY);
      int var4 = getInt(var0, mxConstants.STYLE_FONTSIZE, mxConstants.DEFAULT_FONTSIZE);
      int var5 = getInt(var0, mxConstants.STYLE_FONTSTYLE);
      int var6 = (var5 & 1) == 1 ? 1 : 0;
      var6 += (var5 & 2) == 2 ? 2 : 0;
      HashMap var7 = new HashMap();
      if ((var5 & 4) == 4) {
         var7.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
      }

      if ((var5 & 8) == 8) {
         var7.put(TextAttribute.STRIKETHROUGH, TextAttribute.STRIKETHROUGH_ON);
      }

      return new Font(var3, var6, (int)(var4 * var1)).deriveFont(var7);
   }

   public static String hexString(Color var0) {
      return mxHtmlColor.hexString(var0);
   }

   public static Color parseColor(String var0) {
      return mxHtmlColor.parseColor(var0);
   }

   public static Color parseColor(String var0, double var1) {
      return mxHtmlColor.parseColor(var0, var1);
   }

   public static String getHexColorString(Color var0) {
      return mxHtmlColor.getHexColorString(var0);
   }

   public static float[] parseDashPattern(String var0) {
      if (var0 != null && var0.length() > 0) {
         String[] var1 = var0.split(" ");
         float[] var2 = new float[var1.length];

         for (int var4 = 0; var4 < var1.length; var4++) {
            float var3 = Float.parseFloat(var1[var4]);
            if (!(var3 > 0.0F)) {
               throw new NumberFormatException("Dash width must be positive");
            }

            var2[var4] = var3;
         }

         return var2;
      } else {
         return null;
      }
   }

   public static String readFile(String var0) {
      return readInputStream(new FileInputStream(var0));
   }

   public static String readInputStream(InputStream var0) {
      BufferedReader var1 = new BufferedReader(new InputStreamReader(var0));
      StringBuffer var2 = new StringBuffer();

      for (String var3 = var1.readLine(); var3 != null; var3 = var1.readLine()) {
         var2.append(var3 + "\n");
      }

      var1.close();
      return var2.toString();
   }

   public static void writeFile(String var0, String var1) {
      FileWriter var2 = new FileWriter(var1);
      var2.write(var0);
      var2.flush();
      var2.close();
   }

   public static String getMd5Hash(String var0) {
      StringBuffer var1 = new StringBuffer(32);

      try {
         MessageDigest var2 = MessageDigest.getInstance("MD5");
         var2.update(var0.getBytes());
         Formatter var3 = new Formatter(var1);
         byte[] var4 = var2.digest();

         for (int var5 = 0; var5 < var4.length; var5++) {
            var3.format("%02x", new Byte(var4[var5]));
         }

         var3.close();
      } catch (NoSuchAlgorithmException var6) {
         log.log(Level.SEVERE, "Failed to compute MD5 hash", var6);
      }

      return var1.toString();
   }

   public static boolean isNode(Object var0, String var1) {
      return isNode(var0, var1, null, null);
   }

   public static boolean isNode(Object var0, String var1, String var2, String var3) {
      if (var0 instanceof Element) {
         Element var4 = (Element)var0;
         if (var1 == null || var4.getNodeName().equalsIgnoreCase(var1)) {
            String var5 = var2 != null ? var4.getAttribute(var2) : null;
            return var2 == null || var5 != null && var5.equals(var3);
         }
      }

      return false;
   }

   public static void setAntiAlias(Graphics2D var0, boolean var1, boolean var2) {
      var0.setRenderingHint(RenderingHints.KEY_RENDERING, var1 ? RenderingHints.VALUE_RENDER_QUALITY : RenderingHints.VALUE_RENDER_SPEED);
      var0.setRenderingHint(RenderingHints.KEY_ANTIALIASING, var1 ? RenderingHints.VALUE_ANTIALIAS_ON : RenderingHints.VALUE_ANTIALIAS_OFF);
      var0.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, var2 ? RenderingHints.VALUE_TEXT_ANTIALIAS_ON : RenderingHints.VALUE_TEXT_ANTIALIAS_OFF);
   }

   public static void clearRect(Graphics2D var0, Rectangle var1, Color var2) {
      if (var2 != null) {
         var0.setColor(var2);
         var0.fillRect(var1.x, var1.y, var1.width, var1.height);
      } else {
         var0.setComposite(AlphaComposite.getInstance(1, 0.0F));
         var0.fillRect(var1.x, var1.y, var1.width, var1.height);
         var0.setComposite(AlphaComposite.SrcOver);
      }
   }

   public static BufferedImage createBufferedImage(int var0, int var1, Color var2) {
      return createBufferedImage(var0, var1, var2, var2 != null ? 1 : 2);
   }

   public static BufferedImage createBufferedImage(int var0, int var1, Color var2, int var3) {
      BufferedImage var4 = null;
      if (var0 > 0 && var1 > 0) {
         var4 = new BufferedImage(var0, var1, var3);
         if (var2 != null) {
            Graphics2D var5 = var4.createGraphics();
            clearRect(var5, new Rectangle(var0, var1), var2);
            var5.dispose();
         }
      }

      return var4;
   }

   public static BufferedImage loadImage(String var0) {
      BufferedImage var1 = null;
      if (var0 != null) {
         if (var0.startsWith("data:image/")) {
            try {
               int var2 = var0.indexOf(44);
               byte[] var3 = mxBase64.decode(var0.substring(var2 + 1));
               ByteArrayInputStream var4 = new ByteArrayInputStream(var3);
               var1 = ImageIO.read(var4);
            } catch (Exception var7) {
               log.log(Level.SEVERE, "Failed to load a data URI image", var7);
            }
         } else {
            URL var8 = null;

            try {
               var8 = new URL(var0);
            } catch (Exception var6) {
               var8 = mxUtils.class.getResource(var0);
            }

            if (var8 != null) {
               try {
                  var1 = ImageIO.read(var8);
               } catch (Exception var5) {
                  log.log(Level.SEVERE, "Failed to read the image from " + var8, var5);
               }
            } else {
               log.log(Level.SEVERE, "Failed to load image from " + var0);
            }
         }
      }

      return var1;
   }

   public static Element createTable(Document var0, String var1, int var2, int var3, int var4, int var5, double var6, Map<String, Object> var8) {
      Element var9 = var0.createElement("table");
      if (var1 != null && var1.length() > 0) {
         Element var10 = var0.createElement("tr");
         Element var11 = var0.createElement("td");
         var9.setAttribute("cellspacing", "0");
         var9.setAttribute("border", "0");
         var11.setAttribute("align", getString(var8, mxConstants.STYLE_ALIGN, "center"));
         String var12 = getString(var8, mxConstants.STYLE_FONTCOLOR, "black");
         String var13 = getString(var8, mxConstants.STYLE_FONTFAMILY, mxConstants.DEFAULT_FONTFAMILIES);
         int var14 = (int)(getInt(var8, mxConstants.STYLE_FONTSIZE, mxConstants.DEFAULT_FONTSIZE) * var6);
         String var15 = "position:absolute;left:"
            + String.valueOf(var2)
            + "px;top:"
            + var3
            + "px;width:"
            + var4
            + "px;height:"
            + var5
            + "px;font-size:"
            + var14
            + "px;font-family:"
            + var13
            + ";color:"
            + var12
            + ";";
         if (getString(var8, mxConstants.STYLE_WHITE_SPACE, "nowrap").equals("wrap")) {
            var15 = var15 + "white-space:normal;";
         }

         String var16 = getString(var8, mxConstants.STYLE_LABEL_BACKGROUNDCOLOR);
         if (var16 != null) {
            var15 = var15 + "background:" + var16 + ";";
         }

         String var17 = getString(var8, mxConstants.STYLE_LABEL_BORDERCOLOR);
         if (var17 != null) {
            var15 = var15 + "border:" + var17 + " solid 1pt;";
         }

         float var18 = getFloat(var8, mxConstants.STYLE_TEXT_OPACITY, 100.0F);
         if (var18 < 100.0F) {
            var15 = var15 + "filter:alpha(opacity=" + var18 + ");";
            var15 = var15 + "opacity:" + var18 / 100.0F + ";";
         }

         var11.setAttribute("style", var15);
         String[] var19 = var1.split("\n");

         for (int var20 = 0; var20 < var19.length; var20++) {
            var11.appendChild(var0.createTextNode(var19[var20]));
            var11.appendChild(var0.createElement("br"));
         }

         var10.appendChild(var11);
         var9.appendChild(var10);
      }

      return var9;
   }

   public static Document createDocument() {
      return mxDomUtils.createDocument();
   }

   public static Document createSvgDocument(int var0, int var1) {
      return mxDomUtils.createSvgDocument(var0, var1);
   }

   public static Document createVmlDocument() {
      return mxDomUtils.createVmlDocument();
   }

   public static Document createHtmlDocument() {
      return mxDomUtils.createHtmlDocument();
   }

   public static String createHtmlDocument(Map<String, Object> var0, String var1) {
      return createHtmlDocument(var0, var1, 1.0, 0);
   }

   public static String createHtmlDocument(Map<String, Object> var0, String var1, double var2) {
      return createHtmlDocument(var0, var1, var2, 0);
   }

   public static String createHtmlDocument(Map<String, Object> var0, String var1, double var2, int var4) {
      return createHtmlDocument(var0, var1, var2, var4, null);
   }

   public static String createHtmlDocument(Map<String, Object> var0, String var1, double var2, int var4, String var5) {
      return createHtmlDocument(var0, var1, var2, var4, null, null);
   }

   public static String createHtmlDocument(Map<String, Object> var0, String var1, double var2, int var4, String var5, String var6) {
      StringBuffer var7 = var6 != null ? new StringBuffer(var6) : new StringBuffer();
      var7.append("font-family:" + getString(var0, mxConstants.STYLE_FONTFAMILY, mxConstants.DEFAULT_FONTFAMILIES) + ";");
      var7.append("font-size:" + (int)(getInt(var0, mxConstants.STYLE_FONTSIZE, mxConstants.DEFAULT_FONTSIZE) * var2) + "pt;");
      String var8 = getString(var0, mxConstants.STYLE_FONTCOLOR);
      if (var8 != null) {
         var7.append("color:" + var8 + ";");
      }

      int var9 = getInt(var0, mxConstants.STYLE_FONTSTYLE);
      if ((var9 & 1) == 1) {
         var7.append("font-weight:bold;");
      }

      if ((var9 & 2) == 2) {
         var7.append("font-style:italic;");
      }

      String var10 = "";
      if ((var9 & 4) == 4) {
         var10 = "underline";
      }

      if ((var9 & 8) == 8) {
         var10 = var10 + " line-through";
      }

      if (var10.length() > 0) {
         var7.append("text-decoration: " + var10 + ";");
      }

      String var11 = getString(var0, mxConstants.STYLE_ALIGN, "left");
      if (var11.equals("center")) {
         var7.append("text-align:center;");
      } else if (var11.equals("right")) {
         var7.append("text-align:right;");
      }

      if (var4 > 0) {
         var7.append("width:" + var4 + "pt;");
      }

      String var12 = "<html>";
      if (var5 != null) {
         var12 = var12 + "<head>" + var5 + "</head>";
      }

      return var12 + "<body style=\"" + var7.toString() + "\">" + var1 + "</body></html>";
   }

   public static HTMLDocument createHtmlDocumentObject(Map<String, Object> var0, double var1) {
      HTMLDocument var3 = new HTMLDocument();
      StringBuffer var4 = new StringBuffer("body {");
      var4.append("font-family:" + getString(var0, mxConstants.STYLE_FONTFAMILY, mxConstants.DEFAULT_FONTFAMILIES) + ";");
      var4.append("font-size:" + (int)(getInt(var0, mxConstants.STYLE_FONTSIZE, mxConstants.DEFAULT_FONTSIZE) * var1) + "pt;");
      String var5 = getString(var0, mxConstants.STYLE_FONTCOLOR);
      if (var5 != null) {
         var4.append("color:" + var5 + ";");
      }

      int var6 = getInt(var0, mxConstants.STYLE_FONTSTYLE);
      if ((var6 & 1) == 1) {
         var4.append("font-weight:bold;");
      }

      if ((var6 & 2) == 2) {
         var4.append("font-style:italic;");
      }

      String var7 = "";
      if ((var6 & 4) == 4) {
         var7 = "underline";
      }

      if ((var6 & 8) == 8) {
         var7 = var7 + " line-through";
      }

      if (var7.length() > 0) {
         var4.append("text-decoration: " + var7 + ";");
      }

      String var8 = getString(var0, mxConstants.STYLE_ALIGN, "left");
      if (var8.equals("center")) {
         var4.append("text-align:center;");
      } else if (var8.equals("right")) {
         var4.append("text-align:right;");
      }

      var4.append("}");
      var3.getStyleSheet().addRule(var4.toString());
      return var3;
   }

   public static Document loadDocument(String var0) {
      try {
         return mxXmlUtils.getDocumentBuilder().parse(var0);
      } catch (Exception var2) {
         log.log(Level.SEVERE, "Failed to load the document from " + var0, var2);
         return null;
      }
   }

   public static Document parseXml(String var0) {
      return mxXmlUtils.parseXml(var0);
   }

   public static Object eval(String var0) {
      int var1 = var0.lastIndexOf(".");
      if (var1 > 0) {
         Class var2 = mxCodecRegistry.getClassForName(var0.substring(0, var1));
         if (var2 != null) {
            try {
               return var2.getField(var0.substring(var1 + 1)).get(null);
            } catch (Exception var4) {
               log.log(Level.SEVERE, "Failed to eval expression: " + var0, var4);
            }
         }
      }

      return var0;
   }

   public static Node findNode(Node var0, String var1, String var2) {
      String var3 = var0 instanceof Element ? ((Element)var0).getAttribute(var1) : null;
      if (var3 != null && var3.equals(var2)) {
         return var0;
      }

      for (Node var5 = var0.getFirstChild(); var5 != null; var5 = var5.getNextSibling()) {
         Node var4 = findNode(var5, var1, var2);
         if (var4 != null) {
            return var4;
         }
      }

      return null;
   }

   public static String htmlEntities(String var0) {
      return var0.replaceAll("&", "&amp;").replaceAll("\"", "&quot;").replaceAll("'", "&prime;").replaceAll("<", "&lt;").replaceAll(">", "&gt;");
   }

   public static String getXml(Node var0) {
      return mxXmlUtils.getXml(var0);
   }

   public static String getPrettyXml(Node var0) {
      return getPrettyXml(var0, "  ", "");
   }

   public static String getPrettyXml(Node var0, String var1, String var2) {
      StringBuffer var3 = new StringBuffer();
      if (var0 != null) {
         if (var0.getNodeType() == 3) {
            var3.append(var0.getNodeValue());
         } else {
            var3.append(var2 + "<" + var0.getNodeName());
            NamedNodeMap var4 = var0.getAttributes();
            if (var4 != null) {
               for (int var5 = 0; var5 < var4.getLength(); var5++) {
                  String var6 = var4.item(var5).getNodeValue();
                  var6 = htmlEntities(var6);
                  var3.append(" " + var4.item(var5).getNodeName() + "=\"" + var6 + "\"");
               }
            }

            Node var7 = var0.getFirstChild();
            if (var7 != null) {
               var3.append(">\n");

               while (var7 != null) {
                  var3.append(getPrettyXml(var7, var1, var2 + var1));
                  var7 = var7.getNextSibling();
               }

               var3.append(var2 + "</" + var0.getNodeName() + ">\n");
            } else {
               var3.append("/>\n");
            }
         }
      }

      return var3.toString();
   }

   static {
      try {
         fontGraphics = new BufferedImage(1, 1, 1).getGraphics();
      } catch (Exception var1) {
         log.log(Level.WARNING, "Failed to initialize font graphics", var1);
      }
   }
}
