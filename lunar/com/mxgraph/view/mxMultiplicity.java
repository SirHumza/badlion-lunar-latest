package com.mxgraph.view;

import com.mxgraph.model.mxIGraphModel;
import com.mxgraph.util.mxUtils;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.w3c.dom.Element;

public class mxMultiplicity {
   private static final Logger log = Logger.getLogger(mxMultiplicity.class.getName());
   protected String type;
   protected String attr;
   protected String value;
   protected boolean source;
   protected int min = 0;
   protected String max = "n";
   protected Collection<String> validNeighbors;
   protected boolean validNeighborsAllowed = true;
   protected String countError;
   protected String typeError;

   public mxMultiplicity(
      boolean var1, String var2, String var3, String var4, int var5, String var6, Collection<String> var7, String var8, String var9, boolean var10
   ) {
      this.source = var1;
      this.type = var2;
      this.attr = var3;
      this.value = var4;
      this.min = var5;
      this.max = var6;
      this.validNeighbors = var7;
      this.countError = var8;
      this.typeError = var9;
      this.validNeighborsAllowed = var10;
   }

   public String check(mxGraph var1, Object var2, Object var3, Object var4, int var5, int var6) {
      StringBuffer var7 = new StringBuffer();
      if (this.source && this.checkTerminal(var1, var3, var2) || !this.source && this.checkTerminal(var1, var4, var2)) {
         if (!this.isUnlimited()) {
            int var8 = this.getMaxValue();
            if (var8 == 0 || this.source && var5 >= var8 || !this.source && var6 >= var8) {
               var7.append(this.countError + "\n");
            }
         }

         if (this.validNeighbors != null && this.typeError != null && this.validNeighbors.size() > 0) {
            boolean var9 = this.checkNeighbors(var1, var2, var3, var4);
            if (!var9) {
               var7.append(this.typeError + "\n");
            }
         }
      }

      return var7.length() > 0 ? var7.toString() : null;
   }

   public boolean checkNeighbors(mxGraph var1, Object var2, Object var3, Object var4) {
      mxIGraphModel var5 = var1.getModel();
      Object var6 = var5.getValue(var3);
      Object var7 = var5.getValue(var4);
      boolean var8 = !this.validNeighborsAllowed;

      for (String var10 : this.validNeighbors) {
         if (this.source && this.checkType(var1, var7, var10)) {
            var8 = this.validNeighborsAllowed;
            break;
         }

         if (!this.source && this.checkType(var1, var6, var10)) {
            var8 = this.validNeighborsAllowed;
            break;
         }
      }

      return var8;
   }

   public boolean checkTerminal(mxGraph var1, Object var2, Object var3) {
      Object var4 = var1.getModel().getValue(var2);
      return this.checkType(var1, var4, this.type, this.attr, this.value);
   }

   public boolean checkType(mxGraph var1, Object var2, String var3) {
      return this.checkType(var1, var2, var3, null, null);
   }

   public boolean checkType(mxGraph var1, Object var2, String var3, String var4, String var5) {
      if (var2 != null) {
         return var2 instanceof Element ? mxUtils.isNode(var2, var3, var4, var5) : var2.equals(var3);
      } else {
         return false;
      }
   }

   public boolean isUnlimited() {
      return this.max == null || this.max == "n";
   }

   public int getMaxValue() {
      try {
         return Integer.parseInt(this.max);
      } catch (NumberFormatException var2) {
         log.log(Level.SEVERE, "Failed to parse max value " + this.max, var2);
         return 0;
      }
   }
}
