package org.jgrapht.alg.drawing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.jgrapht.alg.drawing.model.Box2D;
import org.jgrapht.alg.drawing.model.Boxes;
import org.jgrapht.alg.drawing.model.Point2D;
import org.jgrapht.alg.util.Pair;

class FRQuadTree {
   private static final int NW = 0;
   private static final int NE = 1;
   private static final int SW = 2;
   private static final int SE = 3;
   private FRQuadTree.Node root;

   public FRQuadTree(Box2D var1) {
      this.root = new FRQuadTree.Node(var1);
   }

   public void insert(Point2D var1) {
      FRQuadTree.Node var2 = this.root;

      while (true) {
         if (var2.isLeaf()) {
            if (var2.points.size() == 0) {
               var2.points.add(var1);
               return;
            }

            Box2D var3 = var2.getBox();
            Pair var4 = Boxes.splitAlongXAxis(var3);
            Pair var5 = Boxes.splitAlongYAxis((Box2D)var4.getFirst());
            Pair var6 = Boxes.splitAlongYAxis((Box2D)var4.getSecond());
            var2.children = new FRQuadTree.Node[4];
            var2.children[0] = new FRQuadTree.Node((Box2D)var5.getSecond());
            var2.children[1] = new FRQuadTree.Node((Box2D)var6.getSecond());
            var2.children[2] = new FRQuadTree.Node((Box2D)var5.getFirst());
            var2.children[3] = new FRQuadTree.Node((Box2D)var6.getFirst());
            double var7 = 0.0;
            double var9 = 0.0;

            for (Point2D var12 : var2.points) {
               if (Boxes.containsPoint(var2.children[0].getBox(), var12)) {
                  var2.children[0].points.add(var12);
               } else if (Boxes.containsPoint(var2.children[1].getBox(), var12)) {
                  var2.children[1].points.add(var12);
               } else if (Boxes.containsPoint(var2.children[2].getBox(), var12)) {
                  var2.children[2].points.add(var12);
               } else if (Boxes.containsPoint(var2.children[3].getBox(), var12)) {
                  var2.children[3].points.add(var12);
               }

               var7 += var12.getX();
               var9 += var12.getY();
            }

            var2.totalPoints = var2.points.size();
            var2.centroid = Point2D.of(var7 / var2.totalPoints, var9 / var2.totalPoints);
            var2.points = null;
         }

         var2.totalPoints++;
         var2.centroid = Point2D.of(
            (var2.centroid.getX() * (var2.totalPoints - 1) + var1.getX()) / var2.totalPoints,
            (var2.centroid.getY() * (var2.totalPoints - 1) + var1.getY()) / var2.totalPoints
         );
         if (Boxes.containsPoint(var2.children[0].getBox(), var1)) {
            var2 = var2.children[0];
         } else if (Boxes.containsPoint(var2.children[1].getBox(), var1)) {
            var2 = var2.children[1];
         } else if (Boxes.containsPoint(var2.children[2].getBox(), var1)) {
            var2 = var2.children[2];
         } else {
            if (!Boxes.containsPoint(var2.children[3].getBox(), var1)) {
               throw new IllegalArgumentException();
            }

            var2 = var2.children[3];
         }
      }
   }

   public FRQuadTree.Node getRoot() {
      return this.root;
   }

   public class Node {
      Box2D box;
      int totalPoints;
      Point2D centroid;
      FRQuadTree.Node[] children;
      List<Point2D> points;

      public Node(Box2D var2) {
         this.box = Objects.requireNonNull(var2);
         this.points = new ArrayList<>();
      }

      public boolean isLeaf() {
         return this.points != null;
      }

      public List<Point2D> getPoints() {
         if (this.points != null) {
            return this.points;
         }

         ArrayList var1 = new ArrayList();
         this.getChildren().forEach(var1x -> var1.addAll(var1x.getPoints()));
         return var1;
      }

      public boolean hasPoints() {
         return this.points != null ? this.points.size() != 0 : this.totalPoints != 0;
      }

      public Box2D getBox() {
         return this.box;
      }

      public int getNumberOfPoints() {
         return this.points != null ? this.points.size() : this.totalPoints;
      }

      public Point2D getCentroid() {
         if (this.points == null) {
            return this.centroid;
         }

         int var1 = this.points.size();
         if (var1 == 0) {
            throw new IllegalArgumentException("No points");
         }

         double var2 = 0.0;
         double var4 = 0.0;

         for (Point2D var7 : this.points) {
            var2 += var7.getX();
            var4 += var7.getY();
         }

         return Point2D.of(var2 / var1, var4 / var1);
      }

      public List<FRQuadTree.Node> getChildren() {
         return this.children == null ? Collections.emptyList() : Arrays.asList(this.children);
      }
   }
}
