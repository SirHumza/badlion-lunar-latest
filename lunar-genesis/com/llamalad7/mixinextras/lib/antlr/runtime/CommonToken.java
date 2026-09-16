package com.llamalad7.mixinextras.lib.antlr.runtime;

import com.llamalad7.mixinextras.lib.antlr.runtime.misc.Interval;
import com.llamalad7.mixinextras.lib.antlr.runtime.misc.Pair;
import java.io.Serializable;

public class CommonToken implements WritableToken, Serializable {
   protected static final Pair<TokenSource, CharStream> EMPTY_SOURCE = new Pair<>(null, null);
   protected int type;
   protected int line;
   protected int charPositionInLine = -1;
   protected int channel = 0;
   protected Pair<TokenSource, CharStream> source;
   protected String text;
   protected int index = -1;
   protected int start;
   protected int stop;

   public CommonToken(Pair<TokenSource, CharStream> var1, int var2, int var3, int var4, int var5) {
      this.source = var1;
      this.type = var2;
      this.channel = var3;
      this.start = var4;
      this.stop = var5;
      if (var1.a != null) {
         this.line = ((TokenSource)var1.a).getLine();
         this.charPositionInLine = ((TokenSource)var1.a).getCharPositionInLine();
      }
   }

   @Override
   public int getType() {
      return this.type;
   }

   public void setLine(int var1) {
      this.line = var1;
   }

   @Override
   public String getText() {
      if (this.text != null) {
         return this.text;
      }

      CharStream var1 = this.getInputStream();
      if (var1 == null) {
         return null;
      }

      int var2 = var1.size();
      return this.start < var2 && this.stop < var2 ? var1.getText(Interval.of(this.start, this.stop)) : "<EOF>";
   }

   public void setText(String var1) {
      this.text = var1;
   }

   @Override
   public int getLine() {
      return this.line;
   }

   @Override
   public int getCharPositionInLine() {
      return this.charPositionInLine;
   }

   public void setCharPositionInLine(int var1) {
      this.charPositionInLine = var1;
   }

   @Override
   public int getChannel() {
      return this.channel;
   }

   @Override
   public int getStartIndex() {
      return this.start;
   }

   @Override
   public int getStopIndex() {
      return this.stop;
   }

   @Override
   public int getTokenIndex() {
      return this.index;
   }

   @Override
   public void setTokenIndex(int var1) {
      this.index = var1;
   }

   @Override
   public TokenSource getTokenSource() {
      return this.source.a;
   }

   public CharStream getInputStream() {
      return this.source.b;
   }

   @Override
   public String toString() {
      return this.toString(null);
   }

   public String toString(Recognizer<?, ?> var1) {
      String var2 = "";
      if (this.channel > 0) {
         var2 = ",channel=" + this.channel;
      }

      String var3 = this.getText();
      if (var3 != null) {
         var3 = var3.replace("\n", "\\n");
         var3 = var3.replace("\r", "\\r");
         var3 = var3.replace("\t", "\\t");
      } else {
         var3 = "<no text>";
      }

      String var4 = String.valueOf(this.type);
      if (var1 != null) {
         var4 = var1.getVocabulary().getDisplayName(this.type);
      }

      return "[@"
         + this.getTokenIndex()
         + ","
         + this.start
         + ":"
         + this.stop
         + "='"
         + var3
         + "',<"
         + var4
         + ">"
         + var2
         + ","
         + this.line
         + ":"
         + this.getCharPositionInLine()
         + "]";
   }
}
