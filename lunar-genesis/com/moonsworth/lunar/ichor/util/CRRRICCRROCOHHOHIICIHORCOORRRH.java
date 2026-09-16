package com.moonsworth.lunar.ichor.util;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.tree.ClassNode;

public class CRRRICCRROCOHHOHIICIHORCOORRRH {
   private ClassNode classNode;
   private byte[] OHIRHCICIIHICHCOOICCOHOCCHIHHR;
   private String className;

   public CRRRICCRROCOHHOHIICIHORCOORRRH(byte[] var1) {
      this.OHIRHCICIIHICHCOOICCOHOCCHIHHR = var1;
      ClassReader var2 = new ClassReader(this.OHIRHCICIIHICHCOOICCOHOCCHIHHR);
      this.className = var2.readClass(var2.header + 2, new char[var2.getMaxStringLength()]);
   }

   public CRRRICCRROCOHHOHIICIHORCOORRRH(ClassNode var1) {
      this.classNode = var1;
   }

   public ClassNode getClassNode() {
      if (this.classNode == null) {
         throw new IllegalStateException("Trying to get class node too early");
      } else {
         return this.classNode;
      }
   }

   public byte[] getClassBytes() {
      if (this.OHIRHCICIIHICHCOOICCOHOCCHIHHR == null) {
         throw new IllegalStateException("Trying to get class node too late");
      } else {
         return this.OHIRHCICIIHICHCOOICCOHOCCHIHHR;
      }
   }

   public boolean IHCIIRORHIHHCIROOHHROCCHRIOHCR() {
      return this.classNode != null;
   }

   public void IOIICIRIICICIIOORHCIIIIRRIHRHI(ClassNode var1) {
      this.classNode = var1;
      this.OHIRHCICIIHICHCOOICCOHOCCHIHHR = null;
      this.className = null;
   }

   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(byte[] var1, String var2) {
      this.OHIRHCICIIHICHCOOICCOHOCCHIHHR = var1;
      this.className = var2;
      this.classNode = null;
   }

   public void CIHCCCOIHHCIOCIOCORRIHROROIIOI(int var1) {
      if (this.OHIRHCICIIHICHCOOICCOHOCCHIHHR == null) {
         throw new IllegalStateException("Trying to parse class node too late");
      }

      this.classNode = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO(this.OHIRHCICIIHICHCOOICCOHOCCHIHHR, var1);
      this.OHIRHCICIIHICHCOOICCOHOCCHIHHR = null;
      this.className = null;
   }

   public String getClassName() {
      return this.className == null ? this.classNode.name : this.className;
   }
}
