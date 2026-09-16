package org.cadixdev.bombe.type;

import me.jamiemansfield.string.StringReader;

public class TypeReader extends StringReader {
   public TypeReader(String var1) {
      super(var1);
   }

   public Type readType() {
      if (this.peek() == 'V') {
         this.advance();
         return VoidType.INSTANCE;
      } else {
         return this.readFieldType();
      }
   }

   public FieldType readFieldType() {
      if (this.peek() == '[') {
         return this.readArrayType();
      } else if (BaseType.isValidBase(this.peek())) {
         return this.readBaseType();
      } else if (this.peek() == 'L') {
         return this.readObjectType();
      } else {
         throw new IllegalStateException("Invalid descriptor provided!");
      }
   }

   public ArrayType readArrayType() {
      int var1;
      for (var1 = 0; this.available() && this.peek() == '['; var1++) {
         this.advance();
      }

      return new ArrayType(var1, this.readFieldType());
   }

   public BaseType readBaseType() {
      return BaseType.getFromKey(this.advance());
   }

   public ObjectType readObjectType() {
      int var1 = this.index();
      if (this.peek() != 'L') {
         throw new IllegalStateException("Incomplete descriptor provided!");
      }

      this.advance();

      while (this.available() && this.peek() != ';') {
         this.advance();
      }

      if (this.available() && this.peek() == ';') {
         this.advance();
         return new ObjectType(this.substring(var1 + 1, this.index() - 1));
      } else {
         throw new IllegalStateException("Incomplete descriptor provided!");
      }
   }

   public PrimitiveType readPrimitiveType() {
      if (this.peek() == 'V') {
         this.advance();
         return VoidType.INSTANCE;
      } else if (BaseType.isValidBase(this.peek())) {
         return this.readBaseType();
      } else {
         throw new IllegalStateException("Invalid descriptor provided!");
      }
   }
}
