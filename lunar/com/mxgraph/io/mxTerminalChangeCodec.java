package com.mxgraph.io;

import com.mxgraph.model.mxGraphModel;
import java.util.Map;
import org.w3c.dom.Node;

public class mxTerminalChangeCodec extends mxObjectCodec {
   public mxTerminalChangeCodec() {
      this(new mxGraphModel.mxTerminalChange(), new String[]{"model", "previous"}, new String[]{"cell", "terminal"}, null);
   }

   public mxTerminalChangeCodec(Object var1, String[] var2, String[] var3, Map<String, String> var4) {
      super(var1, var2, var3, var4);
   }

   @Override
   public Object afterDecode(mxCodec var1, Node var2, Object var3) {
      if (var3 instanceof mxGraphModel.mxTerminalChange) {
         mxGraphModel.mxTerminalChange var4 = (mxGraphModel.mxTerminalChange)var3;
         var4.setPrevious(var4.getTerminal());
      }

      return var3;
   }
}
