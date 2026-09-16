package com.lunarclient.adventure.viewer;

import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.format.TextColor;
import com.moonsworth.lunar.lib.adventure.text.serializer.plain.PlainTextComponentSerializer;
import com.moonsworth.lunar.lib.adventure.util.HSVLike;
import com.mxgraph.layout.hierarchical.mxHierarchicalLayout;
import com.mxgraph.model.mxGeometry;
import com.mxgraph.model.mxICell;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.util.mxConstants;
import com.mxgraph.view.mxStylesheet;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicInteger;
import javax.swing.JFrame;
import lombok.Generated;
import org.jetbrains.annotations.NotNull;
import org.jgrapht.Graph;
import org.jgrapht.Graphs;
import org.jgrapht.ext.JGraphXAdapter;
import org.jgrapht.graph.AbstractBaseGraph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleDirectedGraph;
import org.jgrapht.traverse.DepthFirstIterator;

public class ComponentGraphViewer extends JFrame {
   private static final Dimension DEFAULT_SIZE = new Dimension(1000, 600);
   private final AtomicInteger idCounter = new AtomicInteger();
   private boolean closed = false;

   public ComponentGraphViewer(@NotNull Component var1) {
      this.addWindowListener(new WindowAdapter() {
         @Override
         public void windowClosing(WindowEvent var1) {
            ComponentGraphViewer.this.closed = true;
         }
      });
      this.setTitle("Component Graph Viewer");
      this.setDefaultCloseOperation(2);
      this.pack();
      this.setVisible(true);
      this.setPreferredSize(DEFAULT_SIZE);
      this.setSize(DEFAULT_SIZE);
      SimpleDirectedGraph var2 = new SimpleDirectedGraph<>(DefaultEdge.class);
      this.populateComponent(var2, var1);
      this.setGraph(var2);
   }

   private ComponentCarry createCarry(Component var1) {
      return new ComponentCarry(this.idCounter.getAndIncrement(), var1.children(List.of()));
   }

   private ComponentCarry populateComponent(Graph<ComponentCarry, DefaultEdge> var1, Component var2) {
      ComponentCarry var3 = this.createCarry(var2);
      var1.addVertex(var3);
      this.populateComponentChildren(var1, var3, var2.children());
      return var3;
   }

   private void populateComponentChildren(Graph<ComponentCarry, DefaultEdge> var1, ComponentCarry var2, List<Component> var3) {
      for (Component var5 : var3) {
         ComponentCarry var6 = this.createCarry(var5);
         var1.addVertex(var6);
         var1.addEdge(var2, var6);
         this.populateComponentChildren(var1, var6, var5.children());
      }
   }

   public void pauseExecution() {
      while (true) {
         try {
            Thread.sleep(200L);
            if (!this.closed) {
               continue;
            }
         } catch (InterruptedException var2) {
         }

         return;
      }
   }

   private void setGraph(AbstractBaseGraph<ComponentCarry, DefaultEdge> var1) {
      this.changeGraph(var1);
      JGraphXAdapter var2 = new JGraphXAdapter(var1);
      mxStylesheet var3 = var2.getStylesheet();
      Map var4 = var3.getDefaultVertexStyle();
      var4.put(mxConstants.STYLE_SHAPE, "rectangle");
      var4.put(mxConstants.STYLE_ROUNDED, 0.4);
      var4.put(mxConstants.STYLE_STROKEWIDTH, 3);
      var4.put(mxConstants.STYLE_FONTCOLOR, "#ffffff");
      var4.put(mxConstants.STYLE_FILLCOLOR, "#616161");
      var4.put(mxConstants.STYLE_STROKECOLOR, "#999999");
      var4.put(mxConstants.STYLE_SPACING, 5);
      var4.put(mxConstants.STYLE_ALIGN, "center");
      var3.getCellStyle("VERTEX", var4);
      var3.setDefaultVertexStyle(var4);
      Map var5 = var3.getDefaultEdgeStyle();
      var5.put(mxConstants.STYLE_ROUNDED, 0.25);
      var5.put(mxConstants.STYLE_STROKEWIDTH, 2);
      var5.put(mxConstants.STYLE_STROKECOLOR, "#ff2e2e");
      var5.put(mxConstants.STYLE_FONTCOLOR, "#000000");
      var3.getCellStyle("EDGE", var5);
      var3.setDefaultEdgeStyle(var5);

      for (Entry var7 : var2.getCellToVertexMap().entrySet()) {
         mxICell var8 = (mxICell)var7.getKey();
         Component var9 = ((ComponentCarry)var7.getValue()).getDelegate();
         if (var9.hasStyling()) {
            TextColor var10 = var9.color();
            if (var10 != null) {
               HSVLike var11 = var10.asHSV();
               ComponentGraphViewer.HSV var12 = new ComponentGraphViewer.HSV(var11.h(), var11.s(), var11.v());
               var2.setCellStyle(
                  "VERTEX;strokeColor=" + var10.asHexString() + ";fillColor=" + TextColor.color(var12).asHexString() + ";labelPadding=10", new Object[]{var8}
               );
            }
         }

         mxGeometry var16 = var8.getGeometry();
         var16.setWidth(var16.getWidth() + 10.0);
         var16.setHeight(var16.getHeight() + 10.0);
         var8.setGeometry(var16);
      }

      mxGraphComponent var13 = new mxGraphComponent(var2);
      var13.setConnectable(false);
      var13.getGraph().setAllowDanglingEdges(false);
      var13.setSize(DEFAULT_SIZE);
      Container var14 = this.getContentPane();
      var14.add(var13);
      var14.setBounds(10, 10, var14.getWidth() - 20, var14.getHeight() - 20);
      mxHierarchicalLayout var15 = new mxHierarchicalLayout(var2);
      var15.execute(var2.getDefaultParent());
   }

   private void changeGraph(AbstractBaseGraph<ComponentCarry, DefaultEdge> var1) {
      var1 = (AbstractBaseGraph)var1.clone();
      DepthFirstIterator var2 = new DepthFirstIterator(var1);

      while (var2.hasNext()) {
         ComponentCarry var3 = (ComponentCarry)var2.next();
         ComponentGraphViewer.VisualComponent var4 = new ComponentGraphViewer.VisualComponent(var3.getId(), var3.getDelegate());
         this.replaceVertex(var1, var3, var4);
         var4.setName(PlainTextComponentSerializer.plainText().serialize(var3.getDelegate()));
      }
   }

   private <V, E> void replaceVertex(Graph<V, E> var1, V var2, V var3) {
      var1.addVertex(var3);
      List var4 = Graphs.successorListOf(var1, var2);

      for (int var5 = 0; var5 < var4.size(); var5++) {
         Object var6 = var4.get(var5);
         final String var7 = var5 + "";
         DefaultEdge var8 = new DefaultEdge() {
            @Override
            public String toString() {
               return var7;
            }
         };
         var1.addEdge(var3, var6, var8);
      }

      for (Object var14 : Graphs.predecessorListOf(var1, var2)) {
         int var15 = 0;
         List var9 = Graphs.successorListOf(var1, var14);

         for (int var10 = 0; var10 < var9.size(); var10++) {
            Object var11 = var9.get(var10);
            if (var11.equals(var2)) {
               var15 += var10;
               break;
            }
         }

         final String var16 = var15 + "";
         DefaultEdge var17 = new DefaultEdge() {
            @Override
            public String toString() {
               return var16;
            }
         };
         var1.addEdge(var14, var3, var17);
      }

      var1.removeVertex(var2);
   }

   private record HSV() implements HSVLike {
      private final float h;
      private final float s;
      private final float v;

      private HSV(float var1, float var2, float var3) {
         this.h = var1;
         this.s = var2;
         this.v = var3;
      }
   }

   private static class VisualComponent extends ComponentCarry {
      private String name = "";

      public VisualComponent(int var1, Component var2) {
         super(var1, var2);
      }

      @Override
      public String toString() {
         return this.name;
      }

      @Generated
      public void setName(String var1) {
         this.name = var1;
      }
   }
}
