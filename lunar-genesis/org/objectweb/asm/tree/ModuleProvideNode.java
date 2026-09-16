package org.objectweb.asm.tree;

import java.util.List;
import org.objectweb.asm.ModuleVisitor;

public class ModuleProvideNode {
   public String service;
   public List<String> providers;

   public ModuleProvideNode(String var1, List<String> var2) {
      this.service = var1;
      this.providers = var2;
   }

   public void accept(ModuleVisitor var1) {
      var1.visitProvide(this.service, this.providers.toArray(new String[0]));
   }
}
