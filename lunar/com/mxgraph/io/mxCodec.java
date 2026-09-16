package com.mxgraph.io;

import com.mxgraph.model.mxCell;
import com.mxgraph.model.mxCellPath;
import com.mxgraph.model.mxICell;
import com.mxgraph.util.mxDomUtils;
import java.util.Hashtable;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class mxCodec {
   private static final Logger log = Logger.getLogger(mxCodec.class.getName());
   protected Document document;
   protected Map<String, Object> objects = new Hashtable<>();
   protected Map<String, Node> elements = null;
   protected boolean encodeDefaults = false;

   public mxCodec() {
      this(mxDomUtils.createDocument());
   }

   public mxCodec(Document var1) {
      if (var1 == null) {
         var1 = mxDomUtils.createDocument();
      }

      this.document = var1;
   }

   public Document getDocument() {
      return this.document;
   }

   public void setDocument(Document var1) {
      this.document = var1;
   }

   public boolean isEncodeDefaults() {
      return this.encodeDefaults;
   }

   public void setEncodeDefaults(boolean var1) {
      this.encodeDefaults = var1;
   }

   public Map<String, Object> getObjects() {
      return this.objects;
   }

   public Object putObject(String var1, Object var2) {
      return this.objects.put(var1, var2);
   }

   public Object getObject(String var1) {
      Object var2 = null;
      if (var1 != null) {
         var2 = this.objects.get(var1);
         if (var2 == null) {
            var2 = this.lookup(var1);
            if (var2 == null) {
               Node var3 = this.getElementById(var1);
               if (var3 != null) {
                  var2 = this.decode(var3);
               }
            }
         }
      }

      return var2;
   }

   public Object lookup(String var1) {
      return null;
   }

   public Node getElementById(String var1) {
      if (this.elements == null) {
         this.elements = new Hashtable<>();
         this.addElement(this.document.getDocumentElement());
      }

      return this.elements.get(var1);
   }

   protected void addElement(Node var1) {
      if (var1 instanceof Element) {
         String var2 = ((Element)var1).getAttribute("id");
         if (var2 != null && !this.elements.containsKey(var2)) {
            this.elements.put(var2, var1);
         }
      }

      for (Node var3 = var1.getFirstChild(); var3 != null; var3 = var3.getNextSibling()) {
         this.addElement(var3);
      }
   }

   public String getId(Object var1) {
      String var2 = null;
      if (var1 != null) {
         var2 = this.reference(var1);
         if (var2 == null && var1 instanceof mxICell) {
            var2 = ((mxICell)var1).getId();
            if (var2 == null) {
               var2 = mxCellPath.create((mxICell)var1);
               if (var2.length() == 0) {
                  var2 = "root";
               }
            }
         }
      }

      return var2;
   }

   public String reference(Object var1) {
      return null;
   }

   public Node encode(Object var1) {
      Node var2 = null;
      if (var1 != null) {
         String var3 = mxCodecRegistry.getName(var1);
         mxObjectCodec var4 = mxCodecRegistry.getCodec(var3);
         if (var4 != null) {
            var2 = var4.encode(this, var1);
         } else if (var1 instanceof Node) {
            var2 = ((Node)var1).cloneNode(true);
         } else {
            log.log(Level.FINEST, "No codec for " + var3);
         }
      }

      return var2;
   }

   public Object decode(Node var1) {
      return this.decode(var1, null);
   }

   public Object decode(Node var1, Object var2) {
      Object var3 = null;
      if (var1 != null && var1.getNodeType() == 1) {
         mxObjectCodec var4 = mxCodecRegistry.getCodec(var1.getNodeName());

         try {
            if (var4 != null) {
               var3 = var4.decode(this, var1, var2);
            } else {
               var3 = var1.cloneNode(true);
               ((Element)var3).removeAttribute("as");
            }
         } catch (Exception var6) {
            log.log(Level.FINEST, "Cannot decode " + var1.getNodeName(), var6);
         }
      }

      return var3;
   }

   public void encodeCell(mxICell var1, Node var2, boolean var3) {
      var2.appendChild(this.encode(var1));
      if (var3) {
         int var4 = var1.getChildCount();

         for (int var5 = 0; var5 < var4; var5++) {
            this.encodeCell(var1.getChildAt(var5), var2, var3);
         }
      }
   }

   public mxICell decodeCell(Node var1, boolean var2) {
      mxICell var3 = null;
      if (var1 != null && var1.getNodeType() == 1) {
         mxObjectCodec var4 = mxCodecRegistry.getCodec(var1.getNodeName());
         if (!(var4 instanceof mxCellCodec)) {
            for (Node var5 = var1.getFirstChild(); var5 != null && !(var4 instanceof mxCellCodec); var5 = var5.getNextSibling()) {
               var4 = mxCodecRegistry.getCodec(var5.getNodeName());
            }

            String var6 = mxCell.class.getSimpleName();
            var4 = mxCodecRegistry.getCodec(var6);
         }

         if (!(var4 instanceof mxCellCodec)) {
            String var7 = mxCell.class.getSimpleName();
            var4 = mxCodecRegistry.getCodec(var7);
         }

         var3 = (mxICell)var4.decode(this, var1);
         if (var2) {
            this.insertIntoGraph(var3);
         }
      }

      return var3;
   }

   public void insertIntoGraph(mxICell var1) {
      mxICell var2 = var1.getParent();
      mxICell var3 = var1.getTerminal(true);
      mxICell var4 = var1.getTerminal(false);
      var1.setTerminal(null, false);
      var1.setTerminal(null, true);
      var1.setParent(null);
      if (var2 != null) {
         var2.insert(var1);
      }

      if (var3 != null) {
         var3.insertEdge(var1, true);
      }

      if (var4 != null) {
         var4.insertEdge(var1, false);
      }
   }

   public static void setAttribute(Node var0, String var1, Object var2) {
      if (var0.getNodeType() == 1 && var1 != null && var2 != null) {
         ((Element)var0).setAttribute(var1, String.valueOf(var2));
      }
   }
}
