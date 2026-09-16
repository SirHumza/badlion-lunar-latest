package com.mxgraph.io;

import java.util.Map;
import org.w3c.dom.Node;

public class mxGenericChangeCodec extends mxObjectCodec {
   protected String fieldname;

   public mxGenericChangeCodec(Object var1, String var2) {
      this(var1, new String[]{"model", "previous"}, new String[]{"cell"}, null, var2);
   }

   public mxGenericChangeCodec(Object var1, String[] var2, String[] var3, Map<String, String> var4, String var5) {
      super(var1, var2, var3, var4);
      this.fieldname = var5;
   }

   @Override
   public Object afterDecode(mxCodec var1, Node var2, Object var3) {
      Object var4 = this.getFieldValue(var3, "cell");
      if (var4 instanceof Node) {
         this.setFieldValue(var3, "cell", var1.decodeCell((Node)var4, false));
      }

      this.setFieldValue(var3, "previous", this.getFieldValue(var3, this.fieldname));
      return var3;
   }
}
