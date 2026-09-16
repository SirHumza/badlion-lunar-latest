package com.llamalad7.mixinextras.lib.antlr.runtime;

import com.llamalad7.mixinextras.lib.antlr.runtime.misc.Interval;
import java.util.ArrayList;
import java.util.List;

public class BufferedTokenStream implements TokenStream {
   protected TokenSource tokenSource;
   protected List<Token> tokens = new ArrayList<>(100);
   protected int p = -1;
   protected boolean fetchedEOF;

   public BufferedTokenStream(TokenSource var1) {
      if (var1 == null) {
         throw new NullPointerException("tokenSource cannot be null");
      }

      this.tokenSource = var1;
   }

   @Override
   public TokenSource getTokenSource() {
      return this.tokenSource;
   }

   @Override
   public int index() {
      return this.p;
   }

   @Override
   public int mark() {
      return 0;
   }

   @Override
   public void release(int var1) {
   }

   @Override
   public void seek(int var1) {
      this.lazyInit();
      this.p = this.adjustSeekIndex(var1);
   }

   @Override
   public int size() {
      return this.tokens.size();
   }

   @Override
   public void consume() {
      boolean var1;
      if (this.p >= 0) {
         if (this.fetchedEOF) {
            var1 = this.p < this.tokens.size() - 1;
         } else {
            var1 = this.p < this.tokens.size();
         }
      } else {
         var1 = false;
      }

      if (!var1 && this.LA(1) == -1) {
         throw new IllegalStateException("cannot consume EOF");
      }

      if (this.sync(this.p + 1)) {
         this.p = this.adjustSeekIndex(this.p + 1);
      }
   }

   protected boolean sync(int var1) {
      assert var1 >= 0;
      int var2 = var1 - this.tokens.size() + 1;
      if (var2 > 0) {
         int var3 = this.fetch(var2);
         return var3 >= var2;
      } else {
         return true;
      }
   }

   protected int fetch(int var1) {
      if (this.fetchedEOF) {
         return 0;
      }

      for (int var2 = 0; var2 < var1; var2++) {
         Token var3 = this.tokenSource.nextToken();
         if (var3 instanceof WritableToken) {
            ((WritableToken)var3).setTokenIndex(this.tokens.size());
         }

         this.tokens.add(var3);
         if (var3.getType() == -1) {
            this.fetchedEOF = true;
            return var2 + 1;
         }
      }

      return var1;
   }

   @Override
   public Token get(int var1) {
      if (var1 >= 0 && var1 < this.tokens.size()) {
         return this.tokens.get(var1);
      } else {
         throw new IndexOutOfBoundsException("token index " + var1 + " out of range 0.." + (this.tokens.size() - 1));
      }
   }

   @Override
   public int LA(int var1) {
      return this.LT(var1).getType();
   }

   protected Token LB(int var1) {
      return this.p - var1 < 0 ? null : this.tokens.get(this.p - var1);
   }

   @Override
   public Token LT(int var1) {
      this.lazyInit();
      if (var1 == 0) {
         return null;
      }

      if (var1 < 0) {
         return this.LB(-var1);
      }

      int var2 = this.p + var1 - 1;
      this.sync(var2);
      return var2 >= this.tokens.size() ? this.tokens.get(this.tokens.size() - 1) : this.tokens.get(var2);
   }

   protected int adjustSeekIndex(int var1) {
      return var1;
   }

   protected final void lazyInit() {
      if (this.p == -1) {
         this.setup();
      }
   }

   protected void setup() {
      this.sync(0);
      this.p = this.adjustSeekIndex(0);
   }

   protected int nextTokenOnChannel(int var1, int var2) {
      this.sync(var1);
      if (var1 >= this.size()) {
         return this.size() - 1;
      }

      for (Token var3 = this.tokens.get(var1); var3.getChannel() != var2; var3 = this.tokens.get(var1)) {
         if (var3.getType() == -1) {
            return var1;
         }

         this.sync(++var1);
      }

      return var1;
   }

   protected int previousTokenOnChannel(int var1, int var2) {
      this.sync(var1);
      if (var1 >= this.size()) {
         return this.size() - 1;
      }

      while (var1 >= 0) {
         Token var3 = this.tokens.get(var1);
         if (var3.getType() == -1 || var3.getChannel() == var2) {
            return var1;
         }

         var1--;
      }

      return var1;
   }

   @Override
   public String getText(Interval var1) {
      int var2 = var1.a;
      int var3 = var1.b;
      if (var2 >= 0 && var3 >= 0) {
         this.sync(var3);
         if (var3 >= this.tokens.size()) {
            var3 = this.tokens.size() - 1;
         }

         StringBuilder var4 = new StringBuilder();

         for (int var5 = var2; var5 <= var3; var5++) {
            Token var6 = this.tokens.get(var5);
            if (var6.getType() == -1) {
               break;
            }

            var4.append(var6.getText());
         }

         return var4.toString();
      } else {
         return "";
      }
   }

   @Override
   public String getText(Token var1, Token var2) {
      return var1 != null && var2 != null ? this.getText(Interval.of(var1.getTokenIndex(), var2.getTokenIndex())) : "";
   }
}
