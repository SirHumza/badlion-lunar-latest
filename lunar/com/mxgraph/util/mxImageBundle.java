package com.mxgraph.util;

import java.util.Hashtable;
import java.util.Map;

public class mxImageBundle {
   protected Map<String, String> images = new Hashtable<>();

   public Map<String, String> getImages() {
      return this.images;
   }

   public void putImage(String var1, String var2) {
      this.images.put(var1, var2);
   }

   public String getImage(String var1) {
      return var1 != null ? this.images.get(var1) : null;
   }
}
