package org.spongepowered.asm.service;

import org.objectweb.asm.tree.ClassNode;

public interface IClassBytecodeProvider {
   ClassNode getClassNode(String var1);

   ClassNode getClassNode(String var1, boolean var2);

   ClassNode getClassNode(String var1, boolean var2, int var3);
}
