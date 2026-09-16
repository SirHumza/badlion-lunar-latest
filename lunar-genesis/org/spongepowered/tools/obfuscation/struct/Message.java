package org.spongepowered.tools.obfuscation.struct;

import javax.annotation.processing.Messager;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.AnnotationValue;
import javax.lang.model.element.Element;
import javax.tools.Diagnostic.Kind;
import org.spongepowered.tools.obfuscation.interfaces.IMessagerEx;
import org.spongepowered.tools.obfuscation.mirror.AnnotationHandle;

public class Message {
   private Kind kind;
   private CharSequence msg;
   private final Element element;
   private final AnnotationMirror annotation;
   private final AnnotationValue value;

   public Message(IMessagerEx.MessageType var1, CharSequence var2) {
      this(var1.getKind(), var1.decorate(var2), null, (AnnotationMirror)null, null);
   }

   public Message(Kind var1, CharSequence var2) {
      this(var1, var2, null, (AnnotationMirror)null, null);
   }

   public Message(IMessagerEx.MessageType var1, CharSequence var2, Element var3) {
      this(var1.getKind(), var1.decorate(var2), var3, (AnnotationMirror)null, null);
   }

   public Message(Kind var1, CharSequence var2, Element var3) {
      this(var1, var2, var3, (AnnotationMirror)null, null);
   }

   public Message(IMessagerEx.MessageType var1, CharSequence var2, Element var3, AnnotationHandle var4) {
      this(var1.getKind(), var1.decorate(var2), var3, var4.asMirror(), null);
   }

   public Message(Kind var1, CharSequence var2, Element var3, AnnotationHandle var4) {
      this(var1, var2, var3, var4.asMirror(), null);
   }

   public Message(IMessagerEx.MessageType var1, CharSequence var2, Element var3, AnnotationMirror var4) {
      this(var1.getKind(), var1.decorate(var2), var3, var4, null);
   }

   public Message(Kind var1, CharSequence var2, Element var3, AnnotationMirror var4) {
      this(var1, var2, var3, var4, null);
   }

   public Message(IMessagerEx.MessageType var1, CharSequence var2, Element var3, AnnotationHandle var4, AnnotationValue var5) {
      this(var1.getKind(), var1.decorate(var2), var3, var4.asMirror(), var5);
   }

   public Message(Kind var1, CharSequence var2, Element var3, AnnotationHandle var4, AnnotationValue var5) {
      this(var1, var2, var3, var4.asMirror(), var5);
   }

   public Message(IMessagerEx.MessageType var1, CharSequence var2, Element var3, AnnotationMirror var4, AnnotationValue var5) {
      this(var1.getKind(), var1.decorate(var2), var3, var4, var5);
   }

   public Message(Kind var1, CharSequence var2, Element var3, AnnotationMirror var4, AnnotationValue var5) {
      this.kind = var1;
      this.msg = var2;
      this.element = var3;
      this.annotation = var4;
      this.value = var5;
   }

   public Message sendTo(Messager var1) {
      if (this.value != null) {
         var1.printMessage(this.kind, this.msg, this.element, this.annotation, this.value);
      } else if (this.annotation != null) {
         var1.printMessage(this.kind, this.msg, this.element, this.annotation);
      } else if (this.element != null) {
         var1.printMessage(this.kind, this.msg, this.element);
      } else {
         var1.printMessage(this.kind, this.msg);
      }

      return this;
   }

   public Kind getKind() {
      return this.kind;
   }

   public Message setKind(Kind var1) {
      this.kind = var1;
      return this;
   }

   public CharSequence getMsg() {
      return this.msg;
   }

   public Message setMsg(CharSequence var1) {
      this.msg = var1;
      return this;
   }

   public Element getElement() {
      return this.element;
   }

   public AnnotationMirror getAnnotation() {
      return this.annotation;
   }

   public AnnotationValue getValue() {
      return this.value;
   }
}
