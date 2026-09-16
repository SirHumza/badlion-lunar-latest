package com.mxgraph.io;

import com.mxgraph.util.mxUtils;
import com.mxgraph.view.mxStylesheet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class mxStylesheetCodec extends mxObjectCodec {
   public mxStylesheetCodec() {
      this(new mxStylesheet());
   }

   public mxStylesheetCodec(Object var1) {
      this(var1, null, null, null);
   }

   public mxStylesheetCodec(Object var1, String[] var2, String[] var3, Map<String, String> var4) {
      super(var1, var2, var3, var4);
   }

   @Override
   public Node encode(mxCodec var1, Object var2) {
      Element var3 = var1.document.createElement(this.getName());
      if (var2 instanceof mxStylesheet) {
         mxStylesheet var4 = (mxStylesheet)var2;

         for (Entry var6 : var4.getStyles().entrySet()) {
            Element var7 = var1.document.createElement("add");
            String var8 = (String)var6.getKey();
            var7.setAttribute("as", var8);
            Map var9 = (Map)var6.getValue();

            for (Entry var11 : var9.entrySet()) {
               Element var12 = var1.document.createElement("add");
               var12.setAttribute("as", String.valueOf(var11.getKey()));
               var12.setAttribute("value", this.getStringValue(var11));
               var7.appendChild(var12);
            }

            if (var7.getChildNodes().getLength() > 0) {
               var3.appendChild(var7);
            }
         }
      }

      return var3;
   }

   protected String getStringValue(Entry<String, Object> var1) {
      if (var1.getValue() instanceof Boolean) {
         return var1.getValue() ? "1" : "0";
      } else {
         return var1.getValue().toString();
      }
   }

   @Override
   public Object decode(mxCodec var1, Node var2, Object var3) {
      Object var4 = null;
      if (var2 instanceof Element) {
         String var5 = ((Element)var2).getAttribute("id");
         var4 = var1.objects.get(var5);
         if (var4 == null) {
            var4 = var3;
            if (var4 == null) {
               var4 = this.cloneTemplate(var2);
            }

            if (var5 != null && var5.length() > 0) {
               var1.putObject(var5, var4);
            }
         }

         for (Node var14 = var2.getFirstChild(); var14 != null; var14 = var14.getNextSibling()) {
            if (!this.processInclude(var1, var14, var4) && var14.getNodeName().equals("add") && var14 instanceof Element) {
               String var6 = ((Element)var14).getAttribute("as");
               if (var6 != null && var6.length() > 0) {
                  String var7 = ((Element)var14).getAttribute("extend");
                  Hashtable var8 = var7 != null ? (Map)((mxStylesheet)var4).getStyles().get(var7) : null;
                  if (var8 == null) {
                     var8 = new Hashtable();
                  } else {
                     var8 = new Hashtable(var8);
                  }

                  for (Node var9 = var14.getFirstChild(); var9 != null; var9 = var9.getNextSibling()) {
                     if (var9 instanceof Element) {
                        Element var10 = (Element)var9;
                        String var11 = var10.getAttribute("as");
                        if (var9.getNodeName().equals("add")) {
                           String var12 = var9.getTextContent();
                           Object var13 = null;
                           if (var12 != null && var12.length() > 0) {
                              var13 = mxUtils.eval(var12);
                           } else {
                              var13 = var10.getAttribute("value");
                           }

                           if (var13 != null) {
                              var8.put(var11, var13);
                           }
                        } else if (var9.getNodeName().equals("remove")) {
                           var8.remove(var11);
                        }
                     }
                  }

                  ((mxStylesheet)var4).putCellStyle(var6, var8);
               }
            }
         }
      }

      return var4;
   }
}
