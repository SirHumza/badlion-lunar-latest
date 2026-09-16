package com.mxgraph.analysis;

import com.mxgraph.util.mxUtils;
import java.util.Map;

public class mxGraphProperties {
   public static String TRAVERSE_VISIBLE = "traverseVisible";
   public static boolean DEFAULT_TRAVERSE_VISIBLE = false;
   public static String DIRECTED = "directed";
   public static boolean DEFAULT_DIRECTED = false;

   public static boolean isTraverseVisible(Map<String, Object> var0, boolean var1) {
      return var0 != null ? mxUtils.isTrue(var0, TRAVERSE_VISIBLE, var1) : false;
   }

   public static void setTraverseVisible(Map<String, Object> var0, boolean var1) {
      if (var0 != null) {
         var0.put(TRAVERSE_VISIBLE, var1);
      }
   }

   public static boolean isDirected(Map<String, Object> var0, boolean var1) {
      return var0 != null ? mxUtils.isTrue(var0, DIRECTED, var1) : false;
   }

   public static void setDirected(Map<String, Object> var0, boolean var1) {
      if (var0 != null) {
         var0.put(DIRECTED, var1);
      }
   }

   public enum GraphType {
      FULLY_CONNECTED,
      RANDOM_CONNECTED,
      TREE,
      FLOW,
      NULL,
      COMPLETE,
      NREGULAR,
      GRID,
      BIPARTITE,
      COMPLETE_BIPARTITE,
      BASIC_TREE,
      SIMPLE_RANDOM,
      BFS_DIR,
      BFS_UNDIR,
      DFS_DIR,
      DFS_UNDIR,
      DIJKSTRA,
      MAKE_TREE_DIRECTED,
      SIMPLE_RANDOM_TREE,
      KNIGHT_TOUR,
      KNIGHT,
      GET_ADJ_MATRIX,
      FROM_ADJ_MATRIX,
      PETERSEN,
      WHEEL,
      STAR,
      PATH,
      FRIENDSHIP_WINDMILL,
      FULL_WINDMILL,
      INDEGREE,
      OUTDEGREE,
      IS_CUT_VERTEX,
      IS_CUT_EDGE,
      RESET_STYLE,
      KING,
      BELLMAN_FORD;
   }
}
