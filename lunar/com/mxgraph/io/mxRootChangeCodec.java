package com.mxgraph.io;

import com.mxgraph.model.mxGraphModel;
import com.mxgraph.model.mxICell;
import java.util.Map;
import org.w3c.dom.Node;

public class mxRootChangeCodec extends mxObjectCodec {
   public mxRootChangeCodec() {
      this(new mxGraphModel.mxRootChange(), new String[]{"model", "previous", "root"}, null, null);
   }

   public mxRootChangeCodec(Object var1, String[] var2, String[] var3, Map<String, String> var4) {
      super(var1, var2, var3, var4);
   }

   @Override
   public Node afterEncode(mxCodec var1, Object var2, Node var3) {
      if (var2 instanceof mxGraphModel.mxRootChange) {
         var1.encodeCell((mxICell)((mxGraphModel.mxRootChange)var2).getRoot(), var3, true);
      }

      return var3;
   }

   @Override
   public Node beforeDecode(mxCodec var1, Node var2, Object var3) {
      if (var3 instanceof mxGraphModel.mxRootChange) {
         mxGraphModel.mxRootChange var4 = (mxGraphModel.mxRootChange)var3;
         if (var2.getFirstChild() != null && var2.getFirstChild().getNodeType() == 1) {
            var2 = var2.cloneNode(true);
            Node var5 = var2.getFirstChild();
            var4.setRoot(var1.decodeCell(var5, false));
            Node var6 = var5.getNextSibling();
            var5.getParentNode().removeChild(var5);
            var5 = var6;

            while (var5 != null) {
               var6 = var5.getNextSibling();
               if (var5.getNodeType() == 1) {
                  var1.decodeCell(var5, true);
               }

               var5.getParentNode().removeChild(var5);
               var5 = var6;
            }
         }
      }

      return var2;
   }

   @Override
   public Object afterDecode(mxCodec var1, Node var2, Object var3) {
      if (var3 instanceof mxGraphModel.mxRootChange) {
         mxGraphModel.mxRootChange var4 = (mxGraphModel.mxRootChange)var3;
         var4.setPrevious(var4.getRoot());
      }

      return var3;
   }
}
