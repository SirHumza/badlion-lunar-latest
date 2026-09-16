package com.mxgraph.io;

import com.mxgraph.model.mxCell;
import java.util.Map;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class mxCellCodec extends mxObjectCodec {
   public mxCellCodec() {
      this(new mxCell(), null, new String[]{"parent", "source", "target"}, null);
   }

   public mxCellCodec(Object var1) {
      this(var1, null, null, null);
   }

   public mxCellCodec(Object var1, String[] var2, String[] var3, Map<String, String> var4) {
      super(var1, var2, var3, var4);
   }

   @Override
   public boolean isExcluded(Object var1, String var2, Object var3, boolean var4) {
      return this.exclude.contains(var2) || var4 && var2.equals("value") && var3 instanceof Node && ((Node)var3).getNodeType() == 1;
   }

   @Override
   public Node afterEncode(mxCodec var1, Object var2, Node var3) {
      if (var2 instanceof mxCell) {
         mxCell var4 = (mxCell)var2;
         if (var4.getValue() instanceof Node) {
            Element var5 = (Element)var3;
            var3 = var1.getDocument().importNode((Node)var4.getValue(), true);
            var3.appendChild(var5);
            String var6 = var5.getAttribute("id");
            ((Element)var3).setAttribute("id", var6);
            var5.removeAttribute("id");
         }
      }

      return var3;
   }

   @Override
   public Node beforeDecode(mxCodec var1, Node var2, Object var3) {
      Element var4 = (Element)var2;
      if (var3 instanceof mxCell) {
         mxCell var5 = (mxCell)var3;
         String var6 = this.getName();
         String var7 = var2.getNodeName();
         if (!var7.equals(var6)) {
            String var8 = mxCodecRegistry.aliases.get(var7);
            if (var8 != null) {
               var7 = var8;
            }
         }

         if (var7.equals(var6)) {
            var5.setId(((Element)var2).getAttribute("id"));
         } else {
            Node var14 = var4.getElementsByTagName(var6).item(0);
            if (var14 != null && var14.getParentNode() == var2) {
               var4 = (Element)var14;
               Node var9 = var14.getPreviousSibling();

               while (var9 != null && var9.getNodeType() == 3) {
                  Node var10 = var9.getPreviousSibling();
                  if (var9.getTextContent().trim().length() == 0) {
                     var9.getParentNode().removeChild(var9);
                  }

                  var9 = var10;
               }

               var9 = var14.getNextSibling();

               while (var9 != null && var9.getNodeType() == 3) {
                  Node var19 = var9.getPreviousSibling();
                  if (var9.getTextContent().trim().length() == 0) {
                     var9.getParentNode().removeChild(var9);
                  }

                  var9 = var19;
               }

               var14.getParentNode().removeChild(var14);
            } else {
               var4 = null;
            }

            Element var17 = (Element)var2.cloneNode(true);
            var5.setValue(var17);
            String var20 = var17.getAttribute("id");
            if (var20 != null) {
               var5.setId(var20);
               var17.removeAttribute("id");
            }
         }

         if (var4 != null && this.idrefs != null) {
            for (String var18 : this.idrefs) {
               String var21 = var4.getAttribute(var18);
               if (var21 != null && var21.length() > 0) {
                  var4.removeAttribute(var18);
                  Object var11 = var1.objects.get(var21);
                  if (var11 == null) {
                     var11 = var1.lookup(var21);
                  }

                  if (var11 == null) {
                     Node var12 = var1.getElementById(var21);
                     if (var12 != null) {
                        mxObjectCodec var13 = mxCodecRegistry.getCodec(var12.getNodeName());
                        if (var13 == null) {
                           var13 = this;
                        }

                        var11 = var13.decode(var1, var12);
                     }
                  }

                  this.setFieldValue(var3, var18, var11);
               }
            }
         }
      }

      return var4;
   }
}
