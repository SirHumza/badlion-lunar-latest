package com.llamalad7.mixinextras.ap;

import javax.annotation.processing.Messager;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.AnnotationValue;
import javax.lang.model.element.Element;
import javax.tools.Diagnostic.Kind;

public class StdoutMessager implements Messager {
   @Override
   public void printMessage(Kind var1, CharSequence var2) {
      System.out.printf("[%s] %s%n", var1.name(), var2);
   }

   @Override
   public void printMessage(Kind var1, CharSequence var2, Element var3) {
      this.printMessage(var1, var2);
   }

   @Override
   public void printMessage(Kind var1, CharSequence var2, Element var3, AnnotationMirror var4) {
      this.printMessage(var1, var2);
   }

   @Override
   public void printMessage(Kind var1, CharSequence var2, Element var3, AnnotationMirror var4, AnnotationValue var5) {
      this.printMessage(var1, var2);
   }
}
