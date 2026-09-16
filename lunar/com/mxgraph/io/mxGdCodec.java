package com.mxgraph.io;

import com.mxgraph.model.mxGraphModel;
import com.mxgraph.view.mxGraph;
import java.io.BufferedReader;
import java.io.StringReader;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class mxGdCodec {
   private static final Logger log = Logger.getLogger(mxGdCodec.class.getName());
   protected static HashMap<String, Object> cellsMap = new HashMap<>();

   public static void decode(String var0, mxGraph var1) {
      BufferedReader var2 = new BufferedReader(new StringReader(var0));
      mxGdCodec.mxGDParseState var3 = mxGdCodec.mxGDParseState.START;
      Object var4 = var1.getDefaultParent();
      var1.getModel().beginUpdate();

      try {
         for (String var5 = var2.readLine().trim(); var5 != null; var5 = var2.readLine()) {
            switch (var3) {
               case START:
                  if (var5.startsWith("#")) {
                     break;
                  }

                  var3 = mxGdCodec.mxGDParseState.NUM_NODES;
               case NUM_NODES:
                  if (!var5.startsWith("#")) {
                     int var23 = Integer.valueOf(var5);

                     for (int var25 = 0; var25 < var23; var25++) {
                        String var26 = String.valueOf(var25);
                        Object var27 = var1.insertVertex(var4, var26, var26, 0.0, 0.0, 10.0, 10.0);
                        cellsMap.put(var26, var27);
                     }
                     break;
                  }

                  var3 = mxGdCodec.mxGDParseState.PARSING_EDGES;
                  break;
               case PARSING_NODES:
                  if (var5.startsWith("# Edges")) {
                     var3 = mxGdCodec.mxGDParseState.PARSING_EDGES;
                  } else if (!var5.equals("")) {
                     String[] var22 = var5.split(",");
                     if (var22.length != 5) {
                        throw new Exception("Error in parsing");
                     }

                     double var24 = Double.valueOf(var22[1]);
                     double var9 = Double.valueOf(var22[2]);
                     double var11 = Double.valueOf(var22[3]);
                     double var13 = Double.valueOf(var22[4]);
                     String var15 = var22[0];
                     Object var16 = var1.insertVertex(var4, var15, var15, var24 - var11 / 2.0, var9 - var13 / 2.0, var11, var13);
                     cellsMap.put(var15, var16);
                  }
                  break;
               case PARSING_EDGES:
                  if (!var5.equals("")) {
                     String[] var6 = var5.split(" ");
                     if (var6.length != 2) {
                        throw new Exception("Error in parsing");
                     }

                     Object var7 = cellsMap.get(var6[0]);
                     Object var8 = cellsMap.get(var6[1]);
                     var1.insertEdge(var4, null, "", var7, var8);
                  }
            }
         }
      } catch (Exception var20) {
         log.log(Level.FINEST, "Failed to decode", var20);
      } finally {
         var1.getModel().endUpdate();
      }
   }

   public static String encode(mxGraph var0) {
      StringBuilder var1 = new StringBuilder();
      Object var2 = var0.getDefaultParent();
      Object[] var3 = mxGraphModel.getChildCells(var0.getModel(), var2, true, false);
      var1.append("# Number of Nodes (0-" + String.valueOf(var3.length - 1) + ")");
      var1.append(String.valueOf(var3.length));
      return var1.toString();
   }

   public enum mxGDParseState {
      START,
      NUM_NODES,
      PARSING_NODES,
      PARSING_EDGES;
   }
}
