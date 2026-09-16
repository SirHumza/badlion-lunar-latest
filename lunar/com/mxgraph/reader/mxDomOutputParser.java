package com.mxgraph.reader;

import com.mxgraph.canvas.mxICanvas2D;
import java.util.Hashtable;
import java.util.Map;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class mxDomOutputParser {
   protected mxICanvas2D canvas;
   protected transient Map<String, mxDomOutputParser.IElementHandler> handlers = new Hashtable<>();

   public mxDomOutputParser(mxICanvas2D var1) {
      this.canvas = var1;
      this.initHandlers();
   }

   public void read(Node var1) {
      while (var1 != null) {
         if (var1 instanceof Element) {
            Element var2 = (Element)var1;
            mxDomOutputParser.IElementHandler var3 = this.handlers.get(var2.getNodeName());
            if (var3 != null) {
               var3.parseElement(var2);
            }
         }

         var1 = var1.getNextSibling();
      }
   }

   protected void initHandlers() {
      this.handlers.put("save", new mxDomOutputParser.IElementHandler() {
         @Override
         public void parseElement(Element var1) {
            mxDomOutputParser.this.canvas.save();
         }
      });
      this.handlers.put("restore", new mxDomOutputParser.IElementHandler() {
         @Override
         public void parseElement(Element var1) {
            mxDomOutputParser.this.canvas.restore();
         }
      });
      this.handlers.put("scale", new mxDomOutputParser.IElementHandler() {
         @Override
         public void parseElement(Element var1) {
            mxDomOutputParser.this.canvas.scale(Double.parseDouble(var1.getAttribute("scale")));
         }
      });
      this.handlers.put("translate", new mxDomOutputParser.IElementHandler() {
         @Override
         public void parseElement(Element var1) {
            mxDomOutputParser.this.canvas.translate(Double.parseDouble(var1.getAttribute("dx")), Double.parseDouble(var1.getAttribute("dy")));
         }
      });
      this.handlers
         .put(
            "rotate",
            new mxDomOutputParser.IElementHandler() {
               @Override
               public void parseElement(Element var1) {
                  mxDomOutputParser.this.canvas
                     .rotate(
                        Double.parseDouble(var1.getAttribute("theta")),
                        var1.getAttribute("flipH").equals("1"),
                        var1.getAttribute("flipV").equals("1"),
                        Double.parseDouble(var1.getAttribute("cx")),
                        Double.parseDouble(var1.getAttribute("cy"))
                     );
               }
            }
         );
      this.handlers.put("strokewidth", new mxDomOutputParser.IElementHandler() {
         @Override
         public void parseElement(Element var1) {
            mxDomOutputParser.this.canvas.setStrokeWidth(Double.parseDouble(var1.getAttribute("width")));
         }
      });
      this.handlers.put("strokecolor", new mxDomOutputParser.IElementHandler() {
         @Override
         public void parseElement(Element var1) {
            mxDomOutputParser.this.canvas.setStrokeColor(var1.getAttribute("color"));
         }
      });
      this.handlers.put("dashed", new mxDomOutputParser.IElementHandler() {
         @Override
         public void parseElement(Element var1) {
            String var2 = var1.getAttribute("fixDash");
            boolean var3 = var2 != null && var2.equals("1");
            mxDomOutputParser.this.canvas.setDashed(var1.getAttribute("dashed").equals("1"), var3);
         }
      });
      this.handlers.put("dashpattern", new mxDomOutputParser.IElementHandler() {
         @Override
         public void parseElement(Element var1) {
            mxDomOutputParser.this.canvas.setDashPattern(var1.getAttribute("pattern"));
         }
      });
      this.handlers.put("linecap", new mxDomOutputParser.IElementHandler() {
         @Override
         public void parseElement(Element var1) {
            mxDomOutputParser.this.canvas.setLineCap(var1.getAttribute("cap"));
         }
      });
      this.handlers.put("linejoin", new mxDomOutputParser.IElementHandler() {
         @Override
         public void parseElement(Element var1) {
            mxDomOutputParser.this.canvas.setLineJoin(var1.getAttribute("join"));
         }
      });
      this.handlers.put("miterlimit", new mxDomOutputParser.IElementHandler() {
         @Override
         public void parseElement(Element var1) {
            mxDomOutputParser.this.canvas.setMiterLimit(Double.parseDouble(var1.getAttribute("limit")));
         }
      });
      this.handlers.put("fontsize", new mxDomOutputParser.IElementHandler() {
         @Override
         public void parseElement(Element var1) {
            mxDomOutputParser.this.canvas.setFontSize(Double.parseDouble(var1.getAttribute("size")));
         }
      });
      this.handlers.put("fontcolor", new mxDomOutputParser.IElementHandler() {
         @Override
         public void parseElement(Element var1) {
            mxDomOutputParser.this.canvas.setFontColor(var1.getAttribute("color"));
         }
      });
      this.handlers.put("fontbackgroundcolor", new mxDomOutputParser.IElementHandler() {
         @Override
         public void parseElement(Element var1) {
            mxDomOutputParser.this.canvas.setFontBackgroundColor(var1.getAttribute("color"));
         }
      });
      this.handlers.put("fontbordercolor", new mxDomOutputParser.IElementHandler() {
         @Override
         public void parseElement(Element var1) {
            mxDomOutputParser.this.canvas.setFontBorderColor(var1.getAttribute("color"));
         }
      });
      this.handlers.put("fontfamily", new mxDomOutputParser.IElementHandler() {
         @Override
         public void parseElement(Element var1) {
            mxDomOutputParser.this.canvas.setFontFamily(var1.getAttribute("family"));
         }
      });
      this.handlers.put("fontstyle", new mxDomOutputParser.IElementHandler() {
         @Override
         public void parseElement(Element var1) {
            mxDomOutputParser.this.canvas.setFontStyle(Integer.parseInt(var1.getAttribute("style")));
         }
      });
      this.handlers.put("alpha", new mxDomOutputParser.IElementHandler() {
         @Override
         public void parseElement(Element var1) {
            mxDomOutputParser.this.canvas.setAlpha(Double.parseDouble(var1.getAttribute("alpha")));
         }
      });
      this.handlers.put("fillalpha", new mxDomOutputParser.IElementHandler() {
         @Override
         public void parseElement(Element var1) {
            mxDomOutputParser.this.canvas.setFillAlpha(Double.parseDouble(var1.getAttribute("alpha")));
         }
      });
      this.handlers.put("strokealpha", new mxDomOutputParser.IElementHandler() {
         @Override
         public void parseElement(Element var1) {
            mxDomOutputParser.this.canvas.setStrokeAlpha(Double.parseDouble(var1.getAttribute("alpha")));
         }
      });
      this.handlers.put("fillcolor", new mxDomOutputParser.IElementHandler() {
         @Override
         public void parseElement(Element var1) {
            mxDomOutputParser.this.canvas.setFillColor(var1.getAttribute("color"));
         }
      });
      this.handlers.put("shadowcolor", new mxDomOutputParser.IElementHandler() {
         @Override
         public void parseElement(Element var1) {
            mxDomOutputParser.this.canvas.setShadowColor(var1.getAttribute("color"));
         }
      });
      this.handlers.put("shadowalpha", new mxDomOutputParser.IElementHandler() {
         @Override
         public void parseElement(Element var1) {
            mxDomOutputParser.this.canvas.setShadowAlpha(Double.parseDouble(var1.getAttribute("alpha")));
         }
      });
      this.handlers.put("shadowoffset", new mxDomOutputParser.IElementHandler() {
         @Override
         public void parseElement(Element var1) {
            mxDomOutputParser.this.canvas.setShadowOffset(Double.parseDouble(var1.getAttribute("dx")), Double.parseDouble(var1.getAttribute("dy")));
         }
      });
      this.handlers.put("shadow", new mxDomOutputParser.IElementHandler() {
         @Override
         public void parseElement(Element var1) {
            mxDomOutputParser.this.canvas.setShadow(var1.getAttribute("enabled").equals("1"));
         }
      });
      this.handlers
         .put(
            "gradient",
            new mxDomOutputParser.IElementHandler() {
               @Override
               public void parseElement(Element var1) {
                  mxDomOutputParser.this.canvas
                     .setGradient(
                        var1.getAttribute("c1"),
                        var1.getAttribute("c2"),
                        Double.parseDouble(var1.getAttribute("x")),
                        Double.parseDouble(var1.getAttribute("y")),
                        Double.parseDouble(var1.getAttribute("w")),
                        Double.parseDouble(var1.getAttribute("h")),
                        var1.getAttribute("direction"),
                        Double.parseDouble(mxDomOutputParser.this.getValue(var1, "alpha1", "1")),
                        Double.parseDouble(mxDomOutputParser.this.getValue(var1, "alpha2", "1"))
                     );
               }
            }
         );
      this.handlers
         .put(
            "rect",
            new mxDomOutputParser.IElementHandler() {
               @Override
               public void parseElement(Element var1) {
                  mxDomOutputParser.this.canvas
                     .rect(
                        Double.parseDouble(var1.getAttribute("x")),
                        Double.parseDouble(var1.getAttribute("y")),
                        Double.parseDouble(var1.getAttribute("w")),
                        Double.parseDouble(var1.getAttribute("h"))
                     );
               }
            }
         );
      this.handlers
         .put(
            "roundrect",
            new mxDomOutputParser.IElementHandler() {
               @Override
               public void parseElement(Element var1) {
                  mxDomOutputParser.this.canvas
                     .roundrect(
                        Double.parseDouble(var1.getAttribute("x")),
                        Double.parseDouble(var1.getAttribute("y")),
                        Double.parseDouble(var1.getAttribute("w")),
                        Double.parseDouble(var1.getAttribute("h")),
                        Double.parseDouble(var1.getAttribute("dx")),
                        Double.parseDouble(var1.getAttribute("dy"))
                     );
               }
            }
         );
      this.handlers
         .put(
            "ellipse",
            new mxDomOutputParser.IElementHandler() {
               @Override
               public void parseElement(Element var1) {
                  mxDomOutputParser.this.canvas
                     .ellipse(
                        Double.parseDouble(var1.getAttribute("x")),
                        Double.parseDouble(var1.getAttribute("y")),
                        Double.parseDouble(var1.getAttribute("w")),
                        Double.parseDouble(var1.getAttribute("h"))
                     );
               }
            }
         );
      this.handlers
         .put(
            "image",
            new mxDomOutputParser.IElementHandler() {
               @Override
               public void parseElement(Element var1) {
                  mxDomOutputParser.this.canvas
                     .image(
                        Double.parseDouble(var1.getAttribute("x")),
                        Double.parseDouble(var1.getAttribute("y")),
                        Double.parseDouble(var1.getAttribute("w")),
                        Double.parseDouble(var1.getAttribute("h")),
                        var1.getAttribute("src"),
                        var1.getAttribute("aspect").equals("1"),
                        var1.getAttribute("flipH").equals("1"),
                        var1.getAttribute("flipV").equals("1")
                     );
               }
            }
         );
      this.handlers
         .put(
            "text",
            new mxDomOutputParser.IElementHandler() {
               @Override
               public void parseElement(Element var1) {
                  mxDomOutputParser.this.canvas
                     .text(
                        Double.parseDouble(var1.getAttribute("x")),
                        Double.parseDouble(var1.getAttribute("y")),
                        Double.parseDouble(var1.getAttribute("w")),
                        Double.parseDouble(var1.getAttribute("h")),
                        var1.getAttribute("str"),
                        var1.getAttribute("align"),
                        var1.getAttribute("valign"),
                        mxDomOutputParser.this.getValue(var1, "wrap", "").equals("1"),
                        var1.getAttribute("format"),
                        var1.getAttribute("overflow"),
                        mxDomOutputParser.this.getValue(var1, "clip", "").equals("1"),
                        Double.parseDouble(mxDomOutputParser.this.getValue(var1, "rotation", "0")),
                        var1.getAttribute("dir")
                     );
               }
            }
         );
      this.handlers.put("begin", new mxDomOutputParser.IElementHandler() {
         @Override
         public void parseElement(Element var1) {
            mxDomOutputParser.this.canvas.begin();
         }
      });
      this.handlers.put("move", new mxDomOutputParser.IElementHandler() {
         @Override
         public void parseElement(Element var1) {
            mxDomOutputParser.this.canvas.moveTo(Double.parseDouble(var1.getAttribute("x")), Double.parseDouble(var1.getAttribute("y")));
         }
      });
      this.handlers.put("line", new mxDomOutputParser.IElementHandler() {
         @Override
         public void parseElement(Element var1) {
            mxDomOutputParser.this.canvas.lineTo(Double.parseDouble(var1.getAttribute("x")), Double.parseDouble(var1.getAttribute("y")));
         }
      });
      this.handlers
         .put(
            "quad",
            new mxDomOutputParser.IElementHandler() {
               @Override
               public void parseElement(Element var1) {
                  mxDomOutputParser.this.canvas
                     .quadTo(
                        Double.parseDouble(var1.getAttribute("x1")),
                        Double.parseDouble(var1.getAttribute("y1")),
                        Double.parseDouble(var1.getAttribute("x2")),
                        Double.parseDouble(var1.getAttribute("y2"))
                     );
               }
            }
         );
      this.handlers
         .put(
            "curve",
            new mxDomOutputParser.IElementHandler() {
               @Override
               public void parseElement(Element var1) {
                  mxDomOutputParser.this.canvas
                     .curveTo(
                        Double.parseDouble(var1.getAttribute("x1")),
                        Double.parseDouble(var1.getAttribute("y1")),
                        Double.parseDouble(var1.getAttribute("x2")),
                        Double.parseDouble(var1.getAttribute("y2")),
                        Double.parseDouble(var1.getAttribute("x3")),
                        Double.parseDouble(var1.getAttribute("y3"))
                     );
               }
            }
         );
      this.handlers.put("close", new mxDomOutputParser.IElementHandler() {
         @Override
         public void parseElement(Element var1) {
            mxDomOutputParser.this.canvas.close();
         }
      });
      this.handlers.put("stroke", new mxDomOutputParser.IElementHandler() {
         @Override
         public void parseElement(Element var1) {
            mxDomOutputParser.this.canvas.stroke();
         }
      });
      this.handlers.put("fill", new mxDomOutputParser.IElementHandler() {
         @Override
         public void parseElement(Element var1) {
            mxDomOutputParser.this.canvas.fill();
         }
      });
      this.handlers.put("fillstroke", new mxDomOutputParser.IElementHandler() {
         @Override
         public void parseElement(Element var1) {
            mxDomOutputParser.this.canvas.fillAndStroke();
         }
      });
   }

   protected String getValue(Element var1, String var2, String var3) {
      String var4 = var1.getAttribute(var2);
      if (var4 == null) {
         var4 = var3;
      }

      return var4;
   }

   protected interface IElementHandler {
      void parseElement(Element var1);
   }
}
