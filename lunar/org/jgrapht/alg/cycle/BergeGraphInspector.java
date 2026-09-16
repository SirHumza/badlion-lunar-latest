package org.jgrapht.alg.cycle;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import org.jgrapht.Graph;
import org.jgrapht.GraphPath;
import org.jgrapht.GraphTests;
import org.jgrapht.alg.connectivity.ConnectivityInspector;
import org.jgrapht.alg.shortestpath.DijkstraShortestPath;
import org.jgrapht.generate.ComplementGraphGenerator;
import org.jgrapht.graph.AbstractBaseGraph;
import org.jgrapht.graph.AsSubgraph;
import org.jgrapht.graph.GraphWalk;
import org.jgrapht.graph.Multigraph;
import org.jgrapht.graph.SimpleGraph;

public class BergeGraphInspector<V, E> {
   private GraphPath<V, E> certificate = null;
   private boolean certify = false;

   private List<V> intersectGraphPaths(GraphPath<V, E> var1, GraphPath<V, E> var2) {
      LinkedList var3 = new LinkedList();
      var3.addAll(var1.getVertexList());
      var3.retainAll(var2.getVertexList());
      return var3;
   }

   private GraphPath<V, E> P(Graph<V, E> var1, GraphPath<V, E> var2, GraphPath<V, E> var3, V var4, V var5, V var6, V var7, V var8, V var9, V var10) {
      if (var8 == var5) {
         if (var5 == var4) {
            LinkedList var15 = new LinkedList();
            return new GraphWalk<>(var1, (V)var8, (V)var5, var15, 0.0);
         } else {
            return null;
         }
      } else {
         if (var5 == var4) {
            return null;
         }

         if (!var1.containsEdge(var4, var6)
            && !var1.containsEdge(var4, var7)
            && !var1.containsEdge(var4, var9)
            && !var1.containsEdge(var4, var10)
            && var2 != null
            && var3 != null) {
            if (!var2.getVertexList()
                  .stream()
                  .anyMatch(
                     var5x -> var1.containsEdge(var5x, var6)
                        || var1.containsEdge(var5x, var7)
                        || var1.containsEdge(var5x, var9)
                        || var1.containsEdge(var5x, var10)
                  )
               && !var3.getVertexList()
                  .stream()
                  .anyMatch(
                     var6x -> var6x != var5
                        && (
                           var1.containsEdge(var6x, var6)
                              || var1.containsEdge(var6x, var7)
                              || var1.containsEdge(var6x, var9)
                              || var1.containsEdge(var6x, var10)
                        )
                  )) {
               List var11 = this.intersectGraphPaths(var2, var3);
               if (var11.size() != 1 || !var11.contains(var4)) {
                  return null;
               }

               if (var2.getVertexList()
                  .stream()
                  .anyMatch(var3x -> var3x != var4 && var3.getVertexList().stream().anyMatch(var3xx -> var3xx != var4 && var1.containsEdge(var3x, var3xx)))) {
                  return null;
               }

               LinkedList var12 = new LinkedList();
               var12.addAll(var3.getEdgeList());
               var12.addAll(var2.getEdgeList());
               double var13 = var12.stream().mapToDouble(var1::getEdgeWeight).sum();
               return new GraphWalk<>(var1, (V)var5, (V)var8, var12, var13);
            } else {
               return null;
            }
         } else {
            return null;
         }
      }
   }

   private void BFOddHoleCertificate(Graph<V, E> var1) {
      for (Object var3 : var1.vertexSet()) {
         if (var1.degreeOf(var3) >= 2) {
            HashSet var4 = new HashSet();
            var4.addAll(var1.vertexSet());
            Iterator var5 = var1.vertexSet().iterator();

            while (true) {
               if (var5.hasNext()) {
                  Object var6 = var5.next();
                  if (var6 == var3 || !var1.containsEdge(var3, var6) || var1.degreeOf(var6) != 2) {
                     continue;
                  }

                  var4.remove(var6);
                  AsSubgraph var7 = new AsSubgraph<>(var1, var4);

                  for (Object var9 : var1.vertexSet()) {
                     if (var9 != var3 && var9 != var6 && var1.containsEdge(var9, var6) && !var1.containsEdge(var9, var3) && var1.degreeOf(var9) >= 2) {
                        GraphPath var10 = new DijkstraShortestPath<>(var7).getPath((V)var3, (V)var9);
                        if (var10 != null && var10.getLength() >= 3 && var10.getLength() % 2 != 0) {
                           LinkedList var11 = new LinkedList();
                           var11.addAll(var10.getEdgeList());
                           var11.add(var1.getEdge(var9, var6));
                           var11.add(var1.getEdge(var6, var3));
                           double var12 = var11.stream().mapToDouble(var1::getEdgeWeight).sum();
                           this.certificate = new GraphWalk<>(var1, (V)var3, (V)var3, var11, var12);
                           break;
                        }
                     }
                  }

                  if (this.certificate == null) {
                     continue;
                  }
               }

               if (this.certificate != null) {
                  return;
               }
               break;
            }
         }
      }
   }

   boolean containsPyramid(Graph<V, E> var1) {
      HashSet var2 = new HashSet();

      for (Object var4 : var1.vertexSet()) {
         for (Object var6 : var1.vertexSet()) {
            if (var4 != var6 && var1.containsEdge(var4, var6)) {
               for (Object var8 : var1.vertexSet()) {
                  if (var8 != var4 && var8 != var6 && var1.containsEdge(var6, var8) && var1.containsEdge(var4, var8)) {
                     HashSet var9 = new HashSet();
                     var9.add(var4);
                     var9.add(var6);
                     var9.add(var8);
                     if (!var2.contains(var9)) {
                        var2.add(var9);

                        for (Object var11 : var1.vertexSet()) {
                           if (var11 != var4
                              && var11 != var6
                              && var11 != var8
                              && (!var1.containsEdge(var11, var4) || !var1.containsEdge(var11, var6))
                              && (!var1.containsEdge(var11, var6) || !var1.containsEdge(var11, var8))
                              && (!var1.containsEdge(var11, var4) || !var1.containsEdge(var11, var8))) {
                              for (Object var13 : var1.vertexSet()) {
                                 if (var13 != var11
                                    && var1.containsEdge(var13, var11)
                                    && var13 != var6
                                    && var13 != var8
                                    && (var13 == var4 || !var1.containsEdge(var13, var6) && !var1.containsEdge(var13, var8))) {
                                    for (Object var15 : var1.vertexSet()) {
                                       if (var15 != var11
                                          && var1.containsEdge(var15, var11)
                                          && !var1.containsEdge(var13, var15)
                                          && var13 != var15
                                          && var15 != var4
                                          && var15 != var8
                                          && (var15 == var6 || !var1.containsEdge(var15, var4) && !var1.containsEdge(var15, var8))) {
                                          for (Object var17 : var1.vertexSet()) {
                                             if (var17 != var11
                                                && var1.containsEdge(var17, var11)
                                                && !var1.containsEdge(var17, var15)
                                                && var13 != var17
                                                && var17 != var15
                                                && !var1.containsEdge(var13, var17)
                                                && var17 != var4
                                                && var17 != var6
                                                && (var17 == var8 || !var1.containsEdge(var17, var4) && !var1.containsEdge(var17, var6))) {
                                                HashSet var18 = new HashSet();
                                                var18.addAll(var1.vertexSet());
                                                var18.remove(var4);
                                                var18.remove(var6);
                                                var18.remove(var8);
                                                var18.remove(var13);
                                                var18.remove(var15);
                                                var18.remove(var17);
                                                HashMap var19 = new HashMap();
                                                HashMap var20 = new HashMap();
                                                HashMap var21 = new HashMap();
                                                HashMap var22 = new HashMap();
                                                HashMap var23 = new HashMap();
                                                HashMap var24 = new HashMap();

                                                for (Object var26 : var18) {
                                                   HashSet var27 = new HashSet();
                                                   var27.addAll(var18);
                                                   var27.removeIf(
                                                      var5 -> var1.containsEdge(var5, var6)
                                                         || var1.containsEdge(var5, var15)
                                                         || var1.containsEdge(var5, var8)
                                                         || var1.containsEdge(var5, var17)
                                                   );
                                                   var27.add(var26);
                                                   var27.add(var13);
                                                   AsSubgraph var28 = new AsSubgraph<>(var1, var27);
                                                   var19.put(var26, new DijkstraShortestPath<>(var28).getPath((V)var26, (V)var13));
                                                   var27.remove(var13);
                                                   var27.add(var4);
                                                   var28 = new AsSubgraph<>(var1, var27);
                                                   var22.put(var26, new DijkstraShortestPath<>(var28).getPath((V)var4, (V)var26));
                                                }

                                                for (Object var41 : var18) {
                                                   HashSet var44 = new HashSet();
                                                   var44.addAll(var18);
                                                   var44.removeIf(
                                                      var5 -> var1.containsEdge(var5, var4)
                                                         || var1.containsEdge(var5, var13)
                                                         || var1.containsEdge(var5, var8)
                                                         || var1.containsEdge(var5, var17)
                                                   );
                                                   var44.add(var41);
                                                   var44.add(var15);
                                                   AsSubgraph var48 = new AsSubgraph<>(var1, var44);
                                                   var20.put(var41, new DijkstraShortestPath<>(var48).getPath((V)var41, (V)var15));
                                                   var44.remove(var15);
                                                   var44.add(var6);
                                                   var48 = new AsSubgraph<>(var1, var44);
                                                   var23.put(var41, new DijkstraShortestPath<>(var48).getPath((V)var6, (V)var41));
                                                }

                                                for (Object var42 : var18) {
                                                   HashSet var45 = new HashSet();
                                                   var45.addAll(var18);
                                                   var45.removeIf(
                                                      var5 -> var1.containsEdge(var5, var4)
                                                         || var1.containsEdge(var5, var13)
                                                         || var1.containsEdge(var5, var6)
                                                         || var1.containsEdge(var5, var15)
                                                   );
                                                   var45.add(var42);
                                                   var45.add(var17);
                                                   AsSubgraph var50 = new AsSubgraph<>(var1, var45);
                                                   var21.put(var42, new DijkstraShortestPath<>(var50).getPath((V)var42, (V)var17));
                                                   var45.remove(var17);
                                                   var45.add(var8);
                                                   var50 = new AsSubgraph<>(var1, var45, null);
                                                   var24.put(var42, new DijkstraShortestPath<>(var50).getPath((V)var8, (V)var42));
                                                }

                                                HashSet var40 = new HashSet();
                                                var40.addAll(var18);
                                                var40.add(var4);

                                                for (Object var46 : var40) {
                                                   GraphPath var52 = this.P(
                                                      var1,
                                                      (GraphPath<V, E>)var19.get(var46),
                                                      (GraphPath<V, E>)var22.get(var46),
                                                      (V)var46,
                                                      (V)var4,
                                                      (V)var6,
                                                      (V)var8,
                                                      (V)var13,
                                                      (V)var15,
                                                      (V)var17
                                                   );
                                                   if (var52 != null) {
                                                      HashSet var29 = new HashSet();
                                                      var29.addAll(var18);
                                                      var29.add(var6);

                                                      for (Object var31 : var18) {
                                                         GraphPath var32 = this.P(
                                                            var1,
                                                            (GraphPath<V, E>)var20.get(var31),
                                                            (GraphPath<V, E>)var23.get(var31),
                                                            (V)var31,
                                                            (V)var6,
                                                            (V)var4,
                                                            (V)var8,
                                                            (V)var15,
                                                            (V)var13,
                                                            (V)var17
                                                         );
                                                         if (var32 != null) {
                                                            HashSet var33 = new HashSet();
                                                            var33.addAll(var18);
                                                            var33.add(var8);

                                                            for (Object var35 : var33) {
                                                               GraphPath var36 = this.P(
                                                                  var1,
                                                                  (GraphPath<V, E>)var21.get(var35),
                                                                  (GraphPath<V, E>)var24.get(var35),
                                                                  (V)var35,
                                                                  (V)var8,
                                                                  (V)var4,
                                                                  (V)var6,
                                                                  (V)var17,
                                                                  (V)var13,
                                                                  (V)var15
                                                               );
                                                               if (var36 != null) {
                                                                  if (this.certify) {
                                                                     if ((var52.getLength() + var32.getLength()) % 2 == 0) {
                                                                        HashSet var37 = new HashSet();
                                                                        var37.addAll(var52.getVertexList());
                                                                        var37.addAll(var32.getVertexList());
                                                                        var37.add(var11);
                                                                        this.BFOddHoleCertificate(new AsSubgraph<>(var1, var37));
                                                                     } else if ((var52.getLength() + var36.getLength()) % 2 == 0) {
                                                                        HashSet var53 = new HashSet();
                                                                        var53.addAll(var52.getVertexList());
                                                                        var53.addAll(var36.getVertexList());
                                                                        var53.add(var11);
                                                                        this.BFOddHoleCertificate(new AsSubgraph<>(var1, var53));
                                                                     } else {
                                                                        HashSet var54 = new HashSet();
                                                                        var54.addAll(var36.getVertexList());
                                                                        var54.addAll(var32.getVertexList());
                                                                        var54.add(var11);
                                                                        this.BFOddHoleCertificate(new AsSubgraph<>(var1, var54));
                                                                     }
                                                                  }

                                                                  return true;
                                                               }
                                                            }
                                                         }
                                                      }
                                                   }
                                                }
                                             }
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }

      return false;
   }

   private List<Set<V>> findAllComponents(Graph<V, E> var1, Set<V> var2) {
      return new ConnectivityInspector<>(new AsSubgraph<>(var1, var2)).connectedSets();
   }

   boolean containsJewel(Graph<V, E> var1) {
      for (Object var3 : var1.vertexSet()) {
         for (Object var5 : var1.vertexSet()) {
            if (var3 != var5 && var1.containsEdge(var3, var5)) {
               for (Object var7 : var1.vertexSet()) {
                  if (var3 != var7 && var5 != var7) {
                     HashSet var8 = new HashSet();

                     for (Object var10 : var1.vertexSet()) {
                        if (var10 != var3
                           && var10 != var5
                           && var10 != var7
                           && !var1.containsEdge(var10, var3)
                           && !var1.containsEdge(var10, var5)
                           && !var1.containsEdge(var10, var7)) {
                           var8.add(var10);
                        }
                     }

                     List var23 = this.findAllComponents(var1, var8);
                     HashSet var24 = new HashSet();

                     for (Object var12 : var1.vertexSet()) {
                        if (var12 != var3
                           && var12 != var5
                           && var12 != var7
                           && var1.containsEdge(var12, var3)
                           && var1.containsEdge(var12, var7)
                           && !var1.containsEdge(var12, var5)) {
                           var24.add(var12);
                        }
                     }

                     HashSet var25 = new HashSet();

                     for (Object var13 : var1.vertexSet()) {
                        if (var13 != var3
                           && var13 != var5
                           && var13 != var7
                           && !var1.containsEdge(var13, var3)
                           && var1.containsEdge(var13, var7)
                           && var1.containsEdge(var13, var5)) {
                           var25.add(var13);
                        }
                     }

                     for (Object var28 : var24) {
                        if (!var1.containsEdge(var28, var5)) {
                           for (Object var15 : var25) {
                              if (var28 != var15 && !var1.containsEdge(var28, var15) && !var1.containsEdge(var3, var15)) {
                                 for (Set var17 : var23) {
                                    if (this.hasANeighbour(var1, var17, (V)var28) && this.hasANeighbour(var1, var17, (V)var15)) {
                                       if (this.certify) {
                                          HashSet var18 = new HashSet();
                                          var18.addAll(var17);
                                          var18.add(var28);
                                          var18.add(var15);
                                          GraphPath var19 = new DijkstraShortestPath<>(new AsSubgraph<>(var1, var18)).getPath((E)var28, (E)var15);
                                          LinkedList var20 = new LinkedList();
                                          var20.addAll(var19.getEdgeList());
                                          if (var19.getLength() % 2 == 1) {
                                             var20.add(var1.getEdge(var15, var7));
                                             var20.add(var1.getEdge(var7, var28));
                                          } else {
                                             var20.add(var1.getEdge(var15, var5));
                                             var20.add(var1.getEdge(var5, var3));
                                             var20.add(var1.getEdge(var3, var28));
                                          }

                                          double var21 = var20.stream().mapToDouble(var1::getEdgeWeight).sum();
                                          this.certificate = new GraphWalk<>(var1, (V)var28, (V)var28, var20, var21);
                                       }

                                       return true;
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }

      return false;
   }

   boolean containsCleanShortestOddHole(Graph<V, E> var1) {
      for (Object var3 : var1.vertexSet()) {
         for (Object var5 : var1.vertexSet()) {
            if (var3 != var5 && !var1.containsEdge(var3, var5)) {
               GraphPath var6 = new DijkstraShortestPath<Object, E>(var1).getPath(var3, var5);
               if (var6 != null) {
                  for (Object var8 : var1.vertexSet()) {
                     if (var8 != var3 && var8 != var5 && !var1.containsEdge(var8, var3) && !var1.containsEdge(var8, var5)) {
                        GraphPath var9 = new DijkstraShortestPath<Object, E>(var1).getPath(var5, var8);
                        if (var9 != null) {
                           GraphPath var10 = new DijkstraShortestPath<Object, E>(var1).getPath(var8, var3);
                           if (var10 != null) {
                              HashSet var11 = new HashSet();
                              var11.addAll(var6.getVertexList());
                              var11.addAll(var9.getVertexList());
                              var11.addAll(var10.getVertexList());
                              AsSubgraph var12 = new AsSubgraph<>(var1, var11);
                              if (var11.size() >= 7
                                 && var12.vertexSet().size() == var11.size()
                                 && var12.edgeSet().size() == var12.vertexSet().size()
                                 && var12.vertexSet().size() % 2 != 0
                                 && !var12.vertexSet().stream().anyMatch(var1x -> var12.degreeOf(var1x) != 2)) {
                                 if (this.certify) {
                                    LinkedList var13 = new LinkedList();
                                    var13.addAll(var6.getEdgeList());
                                    var13.addAll(var9.getEdgeList());
                                    var13.addAll(var10.getEdgeList());
                                    double var14 = var13.stream().mapToDouble(var1::getEdgeWeight).sum();
                                    this.certificate = new GraphWalk<>(var1, (V)var3, (V)var3, var13, var14);
                                 }

                                 return true;
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }

      return false;
   }

   private GraphPath<V, E> getPathAvoidingX(Graph<V, E> var1, V var2, V var3, Set<V> var4) {
      HashSet var5 = new HashSet();
      var5.addAll(var1.vertexSet());
      var5.removeAll(var4);
      var5.add(var2);
      var5.add(var3);
      AsSubgraph var6 = new AsSubgraph<>(var1, var5, null);
      return new DijkstraShortestPath<>(var6).getPath((V)var2, (V)var3);
   }

   private boolean containsShortestOddHole(Graph<V, E> var1, Set<V> var2) {
      for (Object var4 : var1.vertexSet()) {
         if (!var2.contains(var4)) {
            for (Object var6 : var1.vertexSet()) {
               if (var6 != var4) {
                  GraphPath var7 = this.getPathAvoidingX(var1, (V)var6, (V)var4, var2);

                  for (Object var9 : var1.vertexSet()) {
                     if (var9 != var6 && var9 != var4 && var1.containsEdge(var6, var9)) {
                        for (Object var11 : var1.vertexSet()) {
                           if (var11 != var9 && var11 != var6 && var11 != var4 && !var1.containsEdge(var11, var6) && var1.containsEdge(var9, var11)) {
                              GraphPath var12 = this.getPathAvoidingX(var1, (V)var11, (V)var4, var2);
                              if (var7 != null && var12 != null) {
                                 Object var15 = null;

                                 for (Object var17 : var12.getVertexList()) {
                                    if (var1.containsEdge(var4, var17) && var17 != var6 && var17 != var11 && var17 != var9 && var17 != var4) {
                                       var15 = var17;
                                       break;
                                    }
                                 }

                                 if (var15 != null) {
                                    GraphPath var22 = this.getPathAvoidingX(var1, (V)var9, (V)var4, var2);
                                    GraphPath var23 = this.getPathAvoidingX(var1, (V)var9, (V)var15, var2);
                                    GraphPath var18 = this.getPathAvoidingX(var1, (V)var6, (V)var15, var2);
                                    double var13;
                                    if (var22 != null
                                       && var23 != null
                                       && var18 != null
                                       && var12.getLength() == (var13 = var7.getLength() + 1)
                                       && var13 == var18.getLength()
                                       && var22.getLength() >= var13
                                       && var23.getLength() >= var13) {
                                       if (this.certify) {
                                          LinkedList var19 = new LinkedList();
                                          var19.addAll(var7.getEdgeList());

                                          for (int var20 = var12.getLength() - 1; var20 >= 0; var20--) {
                                             var19.add(var12.getEdgeList().get(var20));
                                          }

                                          var19.add(var1.getEdge(var11, var9));
                                          var19.add(var1.getEdge(var9, var6));
                                          double var24 = var19.stream().mapToDouble(var1::getEdgeWeight).sum();
                                          this.certificate = new GraphWalk<>(var1, (V)var6, (V)var6, var19, var24);
                                       }

                                       return true;
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }

      return false;
   }

   private boolean routine1(Graph<V, E> var1, Set<V> var2) {
      return this.containsCleanShortestOddHole(var1) || this.containsShortestOddHole(var1, var2);
   }

   private boolean hasConfigurationType1(Graph<V, E> var1) {
      for (Object var3 : var1.vertexSet()) {
         Set var4 = new ConnectivityInspector<Object, E>(var1).connectedSetOf(var3);

         for (Object var6 : var4) {
            if (var3 != var6 && var1.containsEdge(var3, var6)) {
               for (Object var8 : var4) {
                  if (var8 != var3 && var8 != var6 && var1.containsEdge(var6, var8) && !var1.containsEdge(var3, var8)) {
                     for (Object var10 : var4) {
                        if (var10 != var3
                           && var10 != var6
                           && var10 != var8
                           && !var1.containsEdge(var3, var10)
                           && !var1.containsEdge(var6, var10)
                           && var1.containsEdge(var8, var10)) {
                           for (Object var12 : var4) {
                              if (var12 != var3
                                 && var12 != var6
                                 && var12 != var8
                                 && var12 != var10
                                 && !var1.containsEdge(var6, var12)
                                 && !var1.containsEdge(var8, var12)
                                 && var1.containsEdge(var3, var12)
                                 && var1.containsEdge(var10, var12)) {
                                 if (this.certify) {
                                    LinkedList var13 = new LinkedList();
                                    var13.add(var1.getEdge(var3, var6));
                                    var13.add(var1.getEdge(var6, var8));
                                    var13.add(var1.getEdge(var8, var10));
                                    var13.add(var1.getEdge(var10, var12));
                                    var13.add(var1.getEdge(var12, var3));
                                    double var14 = var13.stream().mapToDouble(var1::getEdgeWeight).sum();
                                    this.certificate = new GraphWalk<>(var1, (V)var3, (V)var3, var13, var14);
                                 }

                                 return true;
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }

      return false;
   }

   boolean isYXComplete(Graph<V, E> var1, V var2, Set<V> var3) {
      return var3.stream().allMatch(var2x -> var1.containsEdge(var2x, var2));
   }

   private List<Set<V>> findAllAnticomponentsOfY(Graph<V, E> var1, Set<V> var2) {
      AbstractBaseGraph var3;
      if (var1.getType().isSimple()) {
         var3 = new SimpleGraph(var1.getVertexSupplier(), var1.getEdgeSupplier(), var1.getType().isWeighted());
      } else {
         var3 = new Multigraph(var1.getVertexSupplier(), var1.getEdgeSupplier(), var1.getType().isWeighted());
      }

      new ComplementGraphGenerator<V, E>(var1).generateGraph(var3);
      return this.findAllComponents(var3, var2);
   }

   boolean hasConfigurationType2(Graph<V, E> var1) {
      for (Object var3 : var1.vertexSet()) {
         for (Object var5 : var1.vertexSet()) {
            if (var3 != var5 && var1.containsEdge(var3, var5)) {
               for (Object var7 : var1.vertexSet()) {
                  if (var7 != var5 && var3 != var7 && !var1.containsEdge(var3, var7) && var1.containsEdge(var5, var7)) {
                     for (Object var9 : var1.vertexSet()) {
                        if (var9 != var3
                           && var9 != var5
                           && var9 != var7
                           && !var1.containsEdge(var9, var5)
                           && !var1.containsEdge(var9, var3)
                           && var1.containsEdge(var7, var9)) {
                           HashSet var10 = new HashSet();
                           var10.add(var3);
                           var10.add(var5);
                           var10.add(var9);
                           HashSet var11 = new HashSet();

                           for (Object var13 : var1.vertexSet()) {
                              if (this.isYXComplete(var1, (V)var13, var10)) {
                                 var11.add(var13);
                              }
                           }

                           for (Set var14 : this.findAllAnticomponentsOfY(var1, var11)) {
                              HashSet var15 = new HashSet();
                              var15.addAll(var1.vertexSet());
                              var15.remove(var5);
                              var15.remove(var7);
                              var15.removeAll(var14);
                              if (var15.contains(var3) && var15.contains(var9)) {
                                 GraphPath var16 = new DijkstraShortestPath<>(new AsSubgraph<>(var1, var15)).getPath((E)var3, (E)var9);
                                 if (var16 != null) {
                                    List var17 = var16.getVertexList();
                                    if (var17.contains(var3) && var17.contains(var9)) {
                                       boolean var18 = true;

                                       for (Object var20 : var17) {
                                          if (var20 != var3
                                             && var20 != var9
                                             && (var1.containsEdge(var20, var5) || var1.containsEdge(var20, var7) || this.isYXComplete(var1, (V)var20, var14))) {
                                             var18 = false;
                                             break;
                                          }
                                       }

                                       if (var18) {
                                          if (this.certify) {
                                             LinkedList var24 = new LinkedList();
                                             if (var16.getLength() % 2 == 0) {
                                                var24.add(var1.getEdge(var3, var5));
                                                var24.add(var1.getEdge(var5, var7));
                                                var24.add(var1.getEdge(var7, var9));
                                                var24.addAll(var16.getEdgeList());
                                             } else {
                                                var24.addAll(var16.getEdgeList());
                                                Object var25 = var14.iterator().next();
                                                var24.add(var1.getEdge(var9, var25));
                                                var24.add(var1.getEdge(var25, var3));
                                             }

                                             double var26 = var24.stream().mapToDouble(var1::getEdgeWeight).sum();
                                             this.certificate = new GraphWalk<>(var1, (V)var3, (V)var3, var24, var26);
                                          }

                                          return true;
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }

      return false;
   }

   private boolean hasANeighbour(Graph<V, E> var1, Set<V> var2, V var3) {
      return var2.stream().anyMatch(var2x -> var1.containsEdge(var2x, var3));
   }

   private Set<V> findMaximalConnectedSubset(Graph<V, E> var1, Set<V> var2, V var3, V var4, V var5) {
      Set var6 = new ConnectivityInspector<Object, E>(var1).connectedSetOf(var5);
      var6.removeIf(
         var6x -> var6x != var5 && this.isYXComplete(var1, (V)var6x, var2)
            || var3 == var6x
            || var4 == var6x
            || var1.containsEdge(var3, var6x)
            || var1.containsEdge(var4, var6x)
      );
      return var6;
   }

   private boolean hasANonneighbourInX(Graph<V, E> var1, V var2, Set<V> var3) {
      return var3.stream().anyMatch(var2x -> !var1.containsEdge(var2, var2x));
   }

   boolean hasConfigurationType3(Graph<V, E> var1) {
      for (Object var3 : var1.vertexSet()) {
         for (Object var5 : var1.vertexSet()) {
            if (var3 != var5 && var1.containsEdge(var3, var5)) {
               for (Object var7 : var1.vertexSet()) {
                  if (var3 != var7 && var5 != var7 && !var1.containsEdge(var3, var7) && !var1.containsEdge(var5, var7)) {
                     HashSet var8 = new HashSet();
                     var8.add(var3);
                     var8.add(var5);
                     var8.add(var7);
                     HashSet var9 = new HashSet();

                     for (Object var11 : var1.vertexSet()) {
                        if (this.isYXComplete(var1, (V)var11, var8)) {
                           var9.add(var11);
                        }
                     }

                     for (Set var12 : this.findAllAnticomponentsOfY(var1, var9)) {
                        Set var13 = this.findMaximalConnectedSubset(var1, var12, (V)var3, (V)var5, (V)var7);
                        HashSet var14 = new HashSet();
                        var14.addAll(var13);

                        for (Object var16 : var12) {
                           if (!var1.containsEdge(var16, var3)
                              && !var1.containsEdge(var16, var5)
                              && !var1.containsEdge(var16, var7)
                              && this.hasANeighbour(var1, var13, (V)var16)) {
                              var14.add(var16);
                           }
                        }

                        for (Object var29 : var1.vertexSet()) {
                           if (var29 != var3
                              && var29 != var5
                              && var29 != var7
                              && !var1.containsEdge(var5, var29)
                              && !var1.containsEdge(var7, var29)
                              && var1.containsEdge(var3, var29)
                              && this.hasANeighbour(var1, var14, (V)var29)
                              && this.hasANonneighbourInX(var1, (V)var29, var12)
                              && !this.isYXComplete(var1, (V)var29, var12)) {
                              for (Object var18 : var1.vertexSet()) {
                                 if (var18 != var3
                                    && var18 != var5
                                    && var18 != var29
                                    && var18 != var7
                                    && var1.containsEdge(var5, var18)
                                    && var1.containsEdge(var18, var29)
                                    && var1.containsEdge(var7, var18)
                                    && !var1.containsEdge(var3, var18)
                                    && this.hasANonneighbourInX(var1, (V)var18, var12)
                                    && !this.isYXComplete(var1, (V)var18, var12)) {
                                    for (Object var20 : var14) {
                                       if (var20 != var3
                                          && var20 != var5
                                          && var20 != var18
                                          && var20 != var29
                                          && var20 != var7
                                          && var1.containsEdge(var29, var20)
                                          && !var1.containsEdge(var3, var20)
                                          && !var1.containsEdge(var5, var20)
                                          && (!var1.containsEdge(var7, var20) || this.isYXComplete(var1, (V)var20, var12))) {
                                          HashSet var21 = new HashSet();
                                          var21.addAll(var13);
                                          var21.add(var7);
                                          var21.add(var20);
                                          var21.remove(var3);
                                          var21.remove(var5);
                                          var21.remove(var18);
                                          var21.remove(var29);
                                          if (new ConnectivityInspector<>(new AsSubgraph<>(var1, var21)).pathExists((E)var20, (E)var7)) {
                                             if (this.certify) {
                                                LinkedList var22 = new LinkedList();
                                                var22.add(var1.getEdge(var3, var29));
                                                var22.add(var1.getEdge(var29, var20));
                                                GraphPath var23 = new DijkstraShortestPath<Object, E>(var1).getPath(var20, var7);
                                                var22.addAll(var23.getEdgeList());
                                                if (var23.getLength() % 2 == 1) {
                                                   Object var24 = var12.iterator().next();
                                                   var22.add(var1.getEdge(var7, var24));
                                                   var22.add(var1.getEdge(var24, var3));
                                                } else {
                                                   var22.add(var1.getEdge(var7, var18));
                                                   var22.add(var1.getEdge(var18, var29));
                                                   var22.add(var1.getEdge(var29, var3));
                                                }

                                                double var30 = var22.stream().mapToDouble(var1::getEdgeWeight).sum();
                                                this.certificate = new GraphWalk<>(var1, (V)var3, (V)var3, var22, var30);
                                             }

                                             return true;
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }

      return false;
   }

   private boolean routine2(Graph<V, E> var1) {
      return this.containsPyramid(var1)
         || this.containsJewel(var1)
         || this.hasConfigurationType1(var1)
         || this.hasConfigurationType2(var1)
         || this.hasConfigurationType3(var1);
   }

   private Set<V> N(Graph<V, E> var1, V var2, V var3) {
      return var1.vertexSet().stream().filter(var3x -> var1.containsEdge(var3x, var2) && var1.containsEdge(var3x, var3)).collect(Collectors.toSet());
   }

   private int r(Graph<V, E> var1, Set<V> var2, V var3) {
      if (this.isYXComplete(var1, (V)var3, var2)) {
         return 0;
      }

      List var4 = this.findAllAnticomponentsOfY(var1, var2);
      return var4.stream().mapToInt(Set::size).max().getAsInt();
   }

   private Set<V> Y(Graph<V, E> var1, Set<V> var2, V var3) {
      int var4 = this.r(var1, var2, (V)var3);
      List var5 = this.findAllAnticomponentsOfY(var1, var2);
      HashSet var6 = new HashSet();

      for (Set var8 : var5) {
         if (var8.size() > var4) {
            var6.addAll(var8);
         }
      }

      return var6;
   }

   private Set<V> W(Graph<V, E> var1, Set<V> var2, V var3) {
      HashSet var4 = new HashSet();
      var4.addAll(var2);
      var4.add(var3);

      for (Set var7 : this.findAllAnticomponentsOfY(var1, var4)) {
         if (var7.contains(var3)) {
            return var7;
         }
      }

      return null;
   }

   private Set<V> Z(Graph<V, E> var1, Set<V> var2, V var3) {
      HashSet var4 = new HashSet();
      var4.addAll(this.Y(var1, var2, (V)var3));
      var4.addAll(this.W(var1, var2, (V)var3));
      HashSet var5 = new HashSet();

      for (Object var7 : var1.vertexSet()) {
         if (this.isYXComplete(var1, (V)var7, var4)) {
            var5.add(var7);
         }
      }

      return var5;
   }

   private Set<V> X(Graph<V, E> var1, Set<V> var2, V var3) {
      HashSet var4 = new HashSet();
      var4.addAll(this.Y(var1, var2, (V)var3));
      var4.addAll(this.Z(var1, var2, (V)var3));
      return var4;
   }

   private boolean isTripleRelevant(Graph<V, E> var1, V var2, V var3, V var4) {
      return var2 != var3 && !var1.containsEdge(var2, var3) && !this.N(var1, (V)var2, (V)var3).contains(var4);
   }

   Set<Set<V>> routine3(Graph<V, E> var1) {
      HashSet var2 = new HashSet();

      for (Object var4 : var1.vertexSet()) {
         for (Object var6 : var1.vertexSet()) {
            if (var4 != var6 && var1.containsEdge(var4, var6)) {
               var2.add(this.N(var1, (V)var4, (V)var6));
            }
         }
      }

      HashSet var11 = new HashSet();

      for (Object var14 : var1.vertexSet()) {
         for (Object var7 : var1.vertexSet()) {
            if (var14 != var7 && !var1.containsEdge(var14, var7)) {
               Set var8 = this.N(var1, (V)var14, (V)var7);

               for (Object var10 : var1.vertexSet()) {
                  if (this.isTripleRelevant(var1, (V)var14, (V)var7, (V)var10)) {
                     var11.add(this.X(var1, var8, (V)var10));
                  }
               }
            }
         }
      }

      HashSet var13 = new HashSet();

      for (Set var17 : var2) {
         for (Set var19 : var11) {
            HashSet var20 = new HashSet();
            var20.addAll(var17);
            var20.addAll(var19);
            var13.add(var20);
         }
      }

      return var13;
   }

   public boolean isBerge(Graph<V, E> var1, boolean var2) {
      GraphTests.requireDirectedOrUndirected(var1);
      AbstractBaseGraph var3;
      if (var1.getType().isSimple()) {
         var3 = new SimpleGraph(var1.getVertexSupplier(), var1.getEdgeSupplier(), var1.getType().isWeighted());
      } else {
         var3 = new Multigraph(var1.getVertexSupplier(), var1.getEdgeSupplier(), var1.getType().isWeighted());
      }

      new ComplementGraphGenerator<V, E>(var1).generateGraph(var3);
      this.certify = var2;
      if (!this.routine2(var1) && !this.routine2(var3)) {
         for (Set var5 : this.routine3(var1)) {
            if (this.routine1(var1, var5)) {
               this.certify = false;
               return false;
            }
         }

         for (Set var7 : this.routine3(var3)) {
            if (this.routine1(var3, var7)) {
               this.certify = false;
               return false;
            }
         }

         this.certify = false;
         return true;
      } else {
         this.certify = false;
         return false;
      }
   }

   public boolean isBerge(Graph<V, E> var1) {
      return this.isBerge(var1, false);
   }

   public GraphPath<V, E> getCertificate() {
      return this.certificate;
   }
}
