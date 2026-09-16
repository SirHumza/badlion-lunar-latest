package com.typesafe.config.impl;

import com.typesafe.config.ConfigException;
import java.util.Stack;

final class PathBuilder {
   private final Stack<String> keys = new Stack<>();
   private Path result;

   private void checkCanAppend() {
      if (this.result != null) {
         throw new ConfigException.BugOrBroken("Adding to PathBuilder after getting result");
      }
   }

   void appendKey(String var1) {
      this.checkCanAppend();
      this.keys.push(var1);
   }

   void appendPath(Path var1) {
      this.checkCanAppend();
      String var2 = var1.first();
      Path var3 = var1.remainder();

      while (true) {
         this.keys.push(var2);
         if (var3 == null) {
            return;
         }

         var2 = var3.first();
         var3 = var3.remainder();
      }
   }

   Path result() {
      if (this.result == null) {
         Path var1 = null;

         while (!this.keys.isEmpty()) {
            String var2 = this.keys.pop();
            var1 = new Path(var2, var1);
         }

         this.result = var1;
      }

      return this.result;
   }
}
