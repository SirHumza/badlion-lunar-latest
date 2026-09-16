package com.mxgraph.reader;

import com.mxgraph.canvas.mxICanvas2D;
import java.util.Hashtable;
import java.util.Map;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

public class mxSaxOutputHandler extends DefaultHandler {
   protected mxICanvas2D canvas;
   protected transient Map<String, mxSaxOutputHandler.IElementHandler> handlers = new Hashtable<>();

   public mxSaxOutputHandler(mxICanvas2D var1) {
      this.setCanvas(var1);
      this.initHandlers();
   }

   public void setCanvas(mxICanvas2D var1) {
      this.canvas = var1;
   }

   public mxICanvas2D getCanvas() {
      return this.canvas;
   }

   @Override
   public void startElement(String var1, String var2, String var3, Attributes var4) {
      mxSaxOutputHandler.IElementHandler var5 = this.handlers.get(var3.toLowerCase());
      if (var5 != null) {
         var5.parseElement(var4);
      }
   }

   protected void initHandlers() {
      this.handlers.put("save", new mxSaxOutputHandler.IElementHandler() {
         @Override
         public void parseElement(Attributes var1) {
            mxSaxOutputHandler.this.canvas.save();
         }
      });
      this.handlers.put("restore", new mxSaxOutputHandler.IElementHandler() {
         @Override
         public void parseElement(Attributes var1) {
            mxSaxOutputHandler.this.canvas.restore();
         }
      });
      this.handlers.put("scale", new mxSaxOutputHandler.IElementHandler() {
         @Override
         public void parseElement(Attributes var1) {
            mxSaxOutputHandler.this.canvas.scale(Double.parseDouble(var1.getValue("scale")));
         }
      });
      this.handlers.put("translate", new mxSaxOutputHandler.IElementHandler() {
         @Override
         public void parseElement(Attributes var1) {
            mxSaxOutputHandler.this.canvas.translate(Double.parseDouble(var1.getValue("dx")), Double.parseDouble(var1.getValue("dy")));
         }
      });
      this.handlers
         .put(
            "rotate",
            new mxSaxOutputHandler.IElementHandler() {
               @Override
               public void parseElement(Attributes var1) {
                  mxSaxOutputHandler.this.canvas
                     .rotate(
                        Double.parseDouble(var1.getValue("theta")),
                        var1.getValue("flipH").equals("1"),
                        var1.getValue("flipV").equals("1"),
                        Double.parseDouble(var1.getValue("cx")),
                        Double.parseDouble(var1.getValue("cy"))
                     );
               }
            }
         );
      this.handlers.put("strokewidth", new mxSaxOutputHandler.IElementHandler() {
         @Override
         public void parseElement(Attributes var1) {
            mxSaxOutputHandler.this.canvas.setStrokeWidth(Double.parseDouble(var1.getValue("width")));
         }
      });
      this.handlers.put("strokecolor", new mxSaxOutputHandler.IElementHandler() {
         @Override
         public void parseElement(Attributes var1) {
            mxSaxOutputHandler.this.canvas.setStrokeColor(var1.getValue("color"));
         }
      });
      this.handlers.put("dashed", new mxSaxOutputHandler.IElementHandler() {
         @Override
         public void parseElement(Attributes var1) {
            String var2 = var1.getValue("fixDash");
            boolean var3 = var2 != null && var2.equals("1");
            mxSaxOutputHandler.this.canvas.setDashed(var1.getValue("dashed").equals("1"), var3);
         }
      });
      this.handlers.put("dashpattern", new mxSaxOutputHandler.IElementHandler() {
         @Override
         public void parseElement(Attributes var1) {
            mxSaxOutputHandler.this.canvas.setDashPattern(var1.getValue("pattern"));
         }
      });
      this.handlers.put("linecap", new mxSaxOutputHandler.IElementHandler() {
         @Override
         public void parseElement(Attributes var1) {
            mxSaxOutputHandler.this.canvas.setLineCap(var1.getValue("cap"));
         }
      });
      this.handlers.put("linejoin", new mxSaxOutputHandler.IElementHandler() {
         @Override
         public void parseElement(Attributes var1) {
            mxSaxOutputHandler.this.canvas.setLineJoin(var1.getValue("join"));
         }
      });
      this.handlers.put("miterlimit", new mxSaxOutputHandler.IElementHandler() {
         @Override
         public void parseElement(Attributes var1) {
            mxSaxOutputHandler.this.canvas.setMiterLimit(Double.parseDouble(var1.getValue("limit")));
         }
      });
      this.handlers.put("fontsize", new mxSaxOutputHandler.IElementHandler() {
         @Override
         public void parseElement(Attributes var1) {
            mxSaxOutputHandler.this.canvas.setFontSize(Double.parseDouble(var1.getValue("size")));
         }
      });
      this.handlers.put("fontcolor", new mxSaxOutputHandler.IElementHandler() {
         @Override
         public void parseElement(Attributes var1) {
            mxSaxOutputHandler.this.canvas.setFontColor(var1.getValue("color"));
         }
      });
      this.handlers.put("fontbackgroundcolor", new mxSaxOutputHandler.IElementHandler() {
         @Override
         public void parseElement(Attributes var1) {
            mxSaxOutputHandler.this.canvas.setFontBackgroundColor(var1.getValue("color"));
         }
      });
      this.handlers.put("fontbordercolor", new mxSaxOutputHandler.IElementHandler() {
         @Override
         public void parseElement(Attributes var1) {
            mxSaxOutputHandler.this.canvas.setFontBorderColor(var1.getValue("color"));
         }
      });
      this.handlers.put("fontfamily", new mxSaxOutputHandler.IElementHandler() {
         @Override
         public void parseElement(Attributes var1) {
            mxSaxOutputHandler.this.canvas.setFontFamily(var1.getValue("family"));
         }
      });
      this.handlers.put("fontstyle", new mxSaxOutputHandler.IElementHandler() {
         @Override
         public void parseElement(Attributes var1) {
            mxSaxOutputHandler.this.canvas.setFontStyle(Integer.parseInt(var1.getValue("style")));
         }
      });
      this.handlers.put("alpha", new mxSaxOutputHandler.IElementHandler() {
         @Override
         public void parseElement(Attributes var1) {
            mxSaxOutputHandler.this.canvas.setAlpha(Double.parseDouble(var1.getValue("alpha")));
         }
      });
      this.handlers.put("fillalpha", new mxSaxOutputHandler.IElementHandler() {
         @Override
         public void parseElement(Attributes var1) {
            mxSaxOutputHandler.this.canvas.setFillAlpha(Double.parseDouble(var1.getValue("alpha")));
         }
      });
      this.handlers.put("strokealpha", new mxSaxOutputHandler.IElementHandler() {
         @Override
         public void parseElement(Attributes var1) {
            mxSaxOutputHandler.this.canvas.setStrokeAlpha(Double.parseDouble(var1.getValue("alpha")));
         }
      });
      this.handlers.put("fillcolor", new mxSaxOutputHandler.IElementHandler() {
         @Override
         public void parseElement(Attributes var1) {
            mxSaxOutputHandler.this.canvas.setFillColor(var1.getValue("color"));
         }
      });
      this.handlers.put("shadowcolor", new mxSaxOutputHandler.IElementHandler() {
         @Override
         public void parseElement(Attributes var1) {
            mxSaxOutputHandler.this.canvas.setShadowColor(var1.getValue("color"));
         }
      });
      this.handlers.put("shadowalpha", new mxSaxOutputHandler.IElementHandler() {
         @Override
         public void parseElement(Attributes var1) {
            mxSaxOutputHandler.this.canvas.setShadowAlpha(Double.parseDouble(var1.getValue("alpha")));
         }
      });
      this.handlers.put("shadowoffset", new mxSaxOutputHandler.IElementHandler() {
         @Override
         public void parseElement(Attributes var1) {
            mxSaxOutputHandler.this.canvas.setShadowOffset(Double.parseDouble(var1.getValue("dx")), Double.parseDouble(var1.getValue("dy")));
         }
      });
      this.handlers.put("shadow", new mxSaxOutputHandler.IElementHandler() {
         @Override
         public void parseElement(Attributes var1) {
            mxSaxOutputHandler.this.canvas.setShadow(mxSaxOutputHandler.this.getValue(var1, "enabled", "1").equals("1"));
         }
      });
      this.handlers
         .put(
            "gradient",
            new mxSaxOutputHandler.IElementHandler() {
               @Override
               public void parseElement(Attributes var1) {
                  mxSaxOutputHandler.this.canvas
                     .setGradient(
                        var1.getValue("c1"),
                        var1.getValue("c2"),
                        Double.parseDouble(var1.getValue("x")),
                        Double.parseDouble(var1.getValue("y")),
                        Double.parseDouble(var1.getValue("w")),
                        Double.parseDouble(var1.getValue("h")),
                        var1.getValue("direction"),
                        Double.parseDouble(mxSaxOutputHandler.this.getValue(var1, "alpha1", "1")),
                        Double.parseDouble(mxSaxOutputHandler.this.getValue(var1, "alpha2", "1"))
                     );
               }
            }
         );
      this.handlers
         .put(
            "rect",
            new mxSaxOutputHandler.IElementHandler() {
               @Override
               public void parseElement(Attributes var1) {
                  mxSaxOutputHandler.this.canvas
                     .rect(
                        Double.parseDouble(var1.getValue("x")),
                        Double.parseDouble(var1.getValue("y")),
                        Double.parseDouble(var1.getValue("w")),
                        Double.parseDouble(var1.getValue("h"))
                     );
               }
            }
         );
      this.handlers
         .put(
            "roundrect",
            new mxSaxOutputHandler.IElementHandler() {
               @Override
               public void parseElement(Attributes var1) {
                  mxSaxOutputHandler.this.canvas
                     .roundrect(
                        Double.parseDouble(var1.getValue("x")),
                        Double.parseDouble(var1.getValue("y")),
                        Double.parseDouble(var1.getValue("w")),
                        Double.parseDouble(var1.getValue("h")),
                        Double.parseDouble(var1.getValue("dx")),
                        Double.parseDouble(var1.getValue("dy"))
                     );
               }
            }
         );
      this.handlers
         .put(
            "ellipse",
            new mxSaxOutputHandler.IElementHandler() {
               @Override
               public void parseElement(Attributes var1) {
                  mxSaxOutputHandler.this.canvas
                     .ellipse(
                        Double.parseDouble(var1.getValue("x")),
                        Double.parseDouble(var1.getValue("y")),
                        Double.parseDouble(var1.getValue("w")),
                        Double.parseDouble(var1.getValue("h"))
                     );
               }
            }
         );
      this.handlers
         .put(
            "image",
            new mxSaxOutputHandler.IElementHandler() {
               @Override
               public void parseElement(Attributes var1) {
                  mxSaxOutputHandler.this.canvas
                     .image(
                        Double.parseDouble(var1.getValue("x")),
                        Double.parseDouble(var1.getValue("y")),
                        Double.parseDouble(var1.getValue("w")),
                        Double.parseDouble(var1.getValue("h")),
                        var1.getValue("src"),
                        var1.getValue("aspect").equals("1"),
                        var1.getValue("flipH").equals("1"),
                        var1.getValue("flipV").equals("1")
                     );
               }
            }
         );
      this.handlers
         .put(
            "text",
            new mxSaxOutputHandler.IElementHandler() {
               @Override
               public void parseElement(Attributes var1) {
                  mxSaxOutputHandler.this.canvas
                     .text(
                        Double.parseDouble(var1.getValue("x")),
                        Double.parseDouble(var1.getValue("y")),
                        Double.parseDouble(var1.getValue("w")),
                        Double.parseDouble(var1.getValue("h")),
                        var1.getValue("str"),
                        var1.getValue("align"),
                        var1.getValue("valign"),
                        mxSaxOutputHandler.this.getValue(var1, "wrap", "").equals("1"),
                        var1.getValue("format"),
                        var1.getValue("overflow"),
                        mxSaxOutputHandler.this.getValue(var1, "clip", "").equals("1"),
                        Double.parseDouble(mxSaxOutputHandler.this.getValue(var1, "rotation", "0")),
                        mxSaxOutputHandler.this.getValue(var1, "dir", null)
                     );
               }
            }
         );
      this.handlers.put("begin", new mxSaxOutputHandler.IElementHandler() {
         @Override
         public void parseElement(Attributes var1) {
            mxSaxOutputHandler.this.canvas.begin();
         }
      });
      this.handlers.put("move", new mxSaxOutputHandler.IElementHandler() {
         @Override
         public void parseElement(Attributes var1) {
            mxSaxOutputHandler.this.canvas.moveTo(Double.parseDouble(var1.getValue("x")), Double.parseDouble(var1.getValue("y")));
         }
      });
      this.handlers.put("line", new mxSaxOutputHandler.IElementHandler() {
         @Override
         public void parseElement(Attributes var1) {
            mxSaxOutputHandler.this.canvas.lineTo(Double.parseDouble(var1.getValue("x")), Double.parseDouble(var1.getValue("y")));
         }
      });
      this.handlers
         .put(
            "quad",
            new mxSaxOutputHandler.IElementHandler() {
               @Override
               public void parseElement(Attributes var1) {
                  mxSaxOutputHandler.this.canvas
                     .quadTo(
                        Double.parseDouble(var1.getValue("x1")),
                        Double.parseDouble(var1.getValue("y1")),
                        Double.parseDouble(var1.getValue("x2")),
                        Double.parseDouble(var1.getValue("y2"))
                     );
               }
            }
         );
      this.handlers
         .put(
            "curve",
            new mxSaxOutputHandler.IElementHandler() {
               @Override
               public void parseElement(Attributes var1) {
                  mxSaxOutputHandler.this.canvas
                     .curveTo(
                        Double.parseDouble(var1.getValue("x1")),
                        Double.parseDouble(var1.getValue("y1")),
                        Double.parseDouble(var1.getValue("x2")),
                        Double.parseDouble(var1.getValue("y2")),
                        Double.parseDouble(var1.getValue("x3")),
                        Double.parseDouble(var1.getValue("y3"))
                     );
               }
            }
         );
      this.handlers.put("close", new mxSaxOutputHandler.IElementHandler() {
         @Override
         public void parseElement(Attributes var1) {
            mxSaxOutputHandler.this.canvas.close();
         }
      });
      this.handlers.put("stroke", new mxSaxOutputHandler.IElementHandler() {
         @Override
         public void parseElement(Attributes var1) {
            mxSaxOutputHandler.this.canvas.stroke();
         }
      });
      this.handlers.put("fill", new mxSaxOutputHandler.IElementHandler() {
         @Override
         public void parseElement(Attributes var1) {
            mxSaxOutputHandler.this.canvas.fill();
         }
      });
      this.handlers.put("fillstroke", new mxSaxOutputHandler.IElementHandler() {
         @Override
         public void parseElement(Attributes var1) {
            mxSaxOutputHandler.this.canvas.fillAndStroke();
         }
      });
   }

   protected String getValue(Attributes var1, String var2, String var3) {
      String var4 = var1.getValue(var2);
      if (var4 == null) {
         var4 = var3;
      }

      return var4;
   }

   protected interface IElementHandler {
      void parseElement(Attributes var1);
   }
}
