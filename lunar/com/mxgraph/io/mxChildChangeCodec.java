package com.mxgraph.io;

import com.mxgraph.model.mxGraphModel;
import com.mxgraph.model.mxICell;
import java.util.Map;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class mxChildChangeCodec extends mxObjectCodec {
   public mxChildChangeCodec() {
      this(new mxGraphModel.mxChildChange(), new String[]{"model", "child", "previousIndex"}, new String[]{"parent", "previous"}, null);
   }

   public mxChildChangeCodec(Object var1, String[] var2, String[] var3, Map<String, String> var4) {
      super(var1, var2, var3, var4);
   }

   @Override
   public boolean isReference(Object var1, String var2, Object var3, boolean var4) {
      return !var2.equals("child") || !(var1 instanceof mxGraphModel.mxChildChange) || ((mxGraphModel.mxChildChange)var1).getPrevious() == null && var4
         ? this.idrefs.contains(var2)
         : true;
   }

   @Override
   public Node afterEncode(mxCodec var1, Object var2, Node var3) {
      if (var2 instanceof mxGraphModel.mxChildChange) {
         mxGraphModel.mxChildChange var4 = (mxGraphModel.mxChildChange)var2;
         Object var5 = var4.getChild();
         if (this.isReference(var2, "child", var5, true)) {
            mxCodec.setAttribute(var3, "child", var1.getId(var5));
         } else {
            var1.encodeCell((mxICell)var5, var3, true);
         }
      }

      return var3;
   }

   @Override
   public Node beforeDecode(mxCodec var1, Node var2, Object var3) {
      if (var3 instanceof mxGraphModel.mxChildChange) {
         mxGraphModel.mxChildChange var4 = (mxGraphModel.mxChildChange)var3;
         if (var2.getFirstChild() != null && var2.getFirstChild().getNodeType() == 1) {
            var2 = var2.cloneNode(true);
            Node var8 = var2.getFirstChild();
            var4.setChild(var1.decodeCell(var8, false));
            Node var6 = var8.getNextSibling();
            var8.getParentNode().removeChild(var8);
            var8 = var6;

            while (var8 != null) {
               var6 = var8.getNextSibling();
               if (var8.getNodeType() == 1) {
                  String var7 = ((Element)var8).getAttribute("id");
                  if (var1.lookup(var7) == null) {
                     var1.decodeCell(var8, true);
                  }
               }

               var8.getParentNode().removeChild(var8);
               var8 = var6;
            }
         } else {
            String var5 = ((Element)var2).getAttribute("child");
            var4.setChild((mxICell)var1.getObject(var5));
         }
      }

      return var2;
   }

   @Override
   public Object afterDecode(mxCodec var1, Node var2, Object var3) {
      if (var3 instanceof mxGraphModel.mxChildChange) {
         mxGraphModel.mxChildChange var4 = (mxGraphModel.mxChildChange)var3;
         ((mxICell)var4.getChild()).setParent((mxICell)var4.getPrevious());
         var4.setPrevious(var4.getParent());
         var4.setPreviousIndex(var4.getIndex());
      }

      return var3;
   }
}
