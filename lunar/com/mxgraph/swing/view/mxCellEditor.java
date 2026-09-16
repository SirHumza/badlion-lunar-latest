package com.mxgraph.swing.view;

import com.mxgraph.model.mxGeometry;
import com.mxgraph.model.mxIGraphModel;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.util.mxConstants;
import com.mxgraph.util.mxUtils;
import com.mxgraph.view.mxCellState;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.io.Writer;
import java.util.EventObject;
import javax.swing.AbstractAction;
import javax.swing.BorderFactory;
import javax.swing.InputMap;
import javax.swing.JEditorPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import javax.swing.text.Document;
import javax.swing.text.JTextComponent;
import javax.swing.text.StyledDocument;
import javax.swing.text.html.HTMLDocument;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.HTMLWriter;
import javax.swing.text.html.MinimalHTMLWriter;

public class mxCellEditor implements mxICellEditor {
   private static final String CANCEL_EDITING = "cancel-editing";
   private static final String INSERT_BREAK = "insert-break";
   private static final String SUBMIT_TEXT = "submit-text";
   public static int DEFAULT_MIN_WIDTH = 100;
   public static int DEFAULT_MIN_HEIGHT = 60;
   public static double DEFAULT_MINIMUM_EDITOR_SCALE = 1.0;
   protected mxGraphComponent graphComponent;
   protected double minimumEditorScale = DEFAULT_MINIMUM_EDITOR_SCALE;
   protected int minimumWidth = DEFAULT_MIN_WIDTH;
   protected int minimumHeight = DEFAULT_MIN_HEIGHT;
   protected transient Object editingCell;
   protected transient EventObject trigger;
   protected transient JScrollPane scrollPane;
   protected transient JTextArea textArea;
   protected transient JEditorPane editorPane;
   protected boolean extractHtmlBody = true;
   protected boolean replaceLinefeeds = true;
   protected boolean shiftEnterSubmitsText = false;
   transient Object editorEnterActionMapKey;
   transient Object textEnterActionMapKey;
   transient KeyStroke escapeKeystroke = KeyStroke.getKeyStroke("ESCAPE");
   transient KeyStroke enterKeystroke = KeyStroke.getKeyStroke("ENTER");
   transient KeyStroke shiftEnterKeystroke = KeyStroke.getKeyStroke("shift ENTER");
   protected AbstractAction cancelEditingAction = new AbstractAction() {
      @Override
      public void actionPerformed(ActionEvent var1) {
         mxCellEditor.this.stopEditing(true);
      }
   };
   protected AbstractAction textSubmitAction = new AbstractAction() {
      @Override
      public void actionPerformed(ActionEvent var1) {
         mxCellEditor.this.stopEditing(false);
      }
   };

   public mxCellEditor(mxGraphComponent var1) {
      this.graphComponent = var1;
      this.textArea = new JTextArea();
      this.textArea.setBorder(BorderFactory.createEmptyBorder(3, 3, 3, 3));
      this.textArea.setOpaque(false);
      this.editorPane = new JEditorPane();
      this.editorPane.setOpaque(false);
      this.editorPane.setBackground(new Color(0, 0, 0, 0));
      this.editorPane.setContentType("text/html");
      this.editorPane.setEditorKit(new mxCellEditor.NoLinefeedHtmlEditorKit());
      this.scrollPane = new JScrollPane();
      this.scrollPane.setBorder(BorderFactory.createEmptyBorder());
      this.scrollPane.getViewport().setOpaque(false);
      this.scrollPane.setVisible(false);
      this.scrollPane.setOpaque(false);
      this.editorPane.getActionMap().put("cancel-editing", this.cancelEditingAction);
      this.textArea.getActionMap().put("cancel-editing", this.cancelEditingAction);
      this.editorPane.getActionMap().put("submit-text", this.textSubmitAction);
      this.textArea.getActionMap().put("submit-text", this.textSubmitAction);
      this.editorEnterActionMapKey = this.editorPane.getInputMap().get(this.enterKeystroke);
      this.textEnterActionMapKey = this.editorPane.getInputMap().get(this.enterKeystroke);
   }

   public boolean isExtractHtmlBody() {
      return this.extractHtmlBody;
   }

   public void setExtractHtmlBody(boolean var1) {
      this.extractHtmlBody = var1;
   }

   public boolean isReplaceHtmlLinefeeds() {
      return this.replaceLinefeeds;
   }

   public void setReplaceHtmlLinefeeds(boolean var1) {
      this.replaceLinefeeds = var1;
   }

   public boolean isShiftEnterSubmitsText() {
      return this.shiftEnterSubmitsText;
   }

   public void setShiftEnterSubmitsText(boolean var1) {
      this.shiftEnterSubmitsText = var1;
   }

   protected void configureActionMaps() {
      InputMap var1 = this.editorPane.getInputMap();
      InputMap var2 = this.textArea.getInputMap();
      var1.put(this.escapeKeystroke, this.cancelEditingAction);
      var2.put(this.escapeKeystroke, this.cancelEditingAction);
      if (this.graphComponent.isEnterStopsCellEditing()) {
         var1.put(this.shiftEnterKeystroke, this.editorEnterActionMapKey);
         var2.put(this.shiftEnterKeystroke, this.textEnterActionMapKey);
         var1.put(this.enterKeystroke, "submit-text");
         var2.put(this.enterKeystroke, "submit-text");
      } else {
         var1.put(this.enterKeystroke, this.editorEnterActionMapKey);
         var2.put(this.enterKeystroke, this.textEnterActionMapKey);
         if (this.isShiftEnterSubmitsText()) {
            var1.put(this.shiftEnterKeystroke, "submit-text");
            var2.put(this.shiftEnterKeystroke, "submit-text");
         } else {
            var1.remove(this.shiftEnterKeystroke);
            var2.remove(this.shiftEnterKeystroke);
         }
      }
   }

   public Component getEditor() {
      if (this.textArea.getParent() != null) {
         return this.textArea;
      } else {
         return this.editingCell != null ? this.editorPane : null;
      }
   }

   protected boolean useLabelBounds(mxCellState var1) {
      mxIGraphModel var2 = var1.getView().getGraph().getModel();
      mxGeometry var3 = var2.getGeometry(var1.getCell());
      return var3 != null && var3.getOffset() != null && !var3.isRelative() && (var3.getOffset().getX() != 0.0 || var3.getOffset().getY() != 0.0)
         || var2.isEdge(var1.getCell());
   }

   public Rectangle getEditorBounds(mxCellState var1, double var2) {
      mxIGraphModel var4 = var1.getView().getGraph().getModel();
      Rectangle var5 = null;
      if (this.useLabelBounds(var1)) {
         var5 = var1.getLabelBounds().getRectangle();
         var5.height += 10;
      } else {
         var5 = var1.getRectangle();
      }

      if (var4.isVertex(var1.getCell())) {
         String var6 = mxUtils.getString(var1.getStyle(), mxConstants.STYLE_LABEL_POSITION, "center");
         if (var6.equals("left")) {
            var5.x = (int)(var5.x - var1.getWidth());
         } else if (var6.equals("right")) {
            var5.x = (int)(var5.x + var1.getWidth());
         }

         String var7 = mxUtils.getString(var1.getStyle(), mxConstants.STYLE_VERTICAL_LABEL_POSITION, "middle");
         if (var7.equals("top")) {
            var5.y = (int)(var5.y - var1.getHeight());
         } else if (var7.equals("bottom")) {
            var5.y = (int)(var5.y + var1.getHeight());
         }
      }

      var5.setSize((int)Math.max(var5.getWidth(), Math.round(this.minimumWidth * var2)), (int)Math.max(var5.getHeight(), Math.round(this.minimumHeight * var2)));
      return var5;
   }

   @Override
   public void startEditing(Object var1, EventObject var2) {
      if (this.editingCell != null) {
         this.stopEditing(true);
      }

      mxCellState var3 = this.graphComponent.getGraph().getView().getState(var1);
      if (var3 != null) {
         this.editingCell = var1;
         this.trigger = var2;
         double var4 = Math.max(this.minimumEditorScale, this.graphComponent.getGraph().getView().getScale());
         this.scrollPane.setBounds(this.getEditorBounds(var3, var4));
         this.scrollPane.setVisible(true);
         String var6 = this.getInitialValue(var3, var2);
         JTextComponent var7 = null;
         if (this.graphComponent.getGraph().isHtmlLabel(var1)) {
            if (this.isExtractHtmlBody()) {
               var6 = mxUtils.getBodyMarkup(var6, this.isReplaceHtmlLinefeeds());
            }

            this.editorPane.setDocument(mxUtils.createHtmlDocumentObject(var3.getStyle(), var4));
            this.editorPane.setText(var6);
            JPanel var8 = new JPanel(new BorderLayout());
            var8.setOpaque(false);
            var8.add(this.editorPane, "Center");
            this.scrollPane.setViewportView(var8);
            var7 = this.editorPane;
         } else {
            this.textArea.setFont(mxUtils.getFont(var3.getStyle(), var4));
            Color var10 = mxUtils.getColor(var3.getStyle(), mxConstants.STYLE_FONTCOLOR, Color.black);
            this.textArea.setForeground(var10);
            this.textArea.setText(var6);
            this.scrollPane.setViewportView(this.textArea);
            var7 = this.textArea;
         }

         this.graphComponent.getGraphControl().add(this.scrollPane, 0);
         if (this.isHideLabel(var3)) {
            this.graphComponent.redraw(var3);
         }

         var7.revalidate();
         var7.requestFocusInWindow();
         var7.selectAll();
         this.configureActionMaps();
      }
   }

   protected boolean isHideLabel(mxCellState var1) {
      return true;
   }

   @Override
   public void stopEditing(boolean var1) {
      if (this.editingCell != null) {
         this.scrollPane.transferFocusUpCycle();
         Object var2 = this.editingCell;
         this.editingCell = null;
         if (!var1) {
            EventObject var3 = this.trigger;
            this.trigger = null;
            this.graphComponent.labelChanged(var2, this.getCurrentValue(), var3);
         } else {
            mxCellState var4 = this.graphComponent.getGraph().getView().getState(var2);
            this.graphComponent.redraw(var4);
         }

         if (this.scrollPane.getParent() != null) {
            this.scrollPane.setVisible(false);
            this.scrollPane.getParent().remove(this.scrollPane);
         }

         this.graphComponent.requestFocusInWindow();
      }
   }

   protected String getInitialValue(mxCellState var1, EventObject var2) {
      return this.graphComponent.getEditingValue(var1.getCell(), var2);
   }

   public String getCurrentValue() {
      String var1;
      if (this.textArea.getParent() != null) {
         var1 = this.textArea.getText();
      } else {
         var1 = this.editorPane.getText();
         if (this.isExtractHtmlBody()) {
            var1 = mxUtils.getBodyMarkup(var1, this.isReplaceHtmlLinefeeds());
         }
      }

      return var1;
   }

   @Override
   public Object getEditingCell() {
      return this.editingCell;
   }

   public double getMinimumEditorScale() {
      return this.minimumEditorScale;
   }

   public void setMinimumEditorScale(double var1) {
      this.minimumEditorScale = var1;
   }

   public int getMinimumWidth() {
      return this.minimumWidth;
   }

   public void setMinimumWidth(int var1) {
      this.minimumWidth = var1;
   }

   public int getMinimumHeight() {
      return this.minimumHeight;
   }

   public void setMinimumHeight(int var1) {
      this.minimumHeight = var1;
   }

   class NoLinefeedHtmlEditorKit extends HTMLEditorKit {
      @Override
      public void write(Writer var1, Document var2, int var3, int var4) {
         if (var2 instanceof HTMLDocument) {
            mxCellEditor.NoLinefeedHtmlWriter var5 = mxCellEditor.this.new NoLinefeedHtmlWriter(var1, (HTMLDocument)var2, var3, var4);
            var5.setLineLength(Integer.MAX_VALUE);
            var5.write();
         } else if (var2 instanceof StyledDocument) {
            MinimalHTMLWriter var6 = new MinimalHTMLWriter(var1, (StyledDocument)var2, var3, var4);
            var6.write();
         } else {
            super.write(var1, var2, var3, var4);
         }
      }
   }

   class NoLinefeedHtmlWriter extends HTMLWriter {
      public NoLinefeedHtmlWriter(Writer var2, HTMLDocument var3, int var4, int var5) {
         super(var2, var3, var4, var5);
      }

      @Override
      protected void setLineLength(int var1) {
         super.setLineLength(var1);
      }
   }
}
