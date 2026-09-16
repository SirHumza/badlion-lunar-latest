package org.objectweb.asm;

final class SymbolTable {
   final ClassWriter classWriter;
   private final ClassReader sourceClassReader;
   private int majorVersion;
   private String className;
   private int entryCount;
   private SymbolTable.Entry[] entries;
   private int constantPoolCount;
   private ByteVector constantPool;
   private int bootstrapMethodCount;
   private ByteVector bootstrapMethods;
   private int typeCount;
   private SymbolTable.Entry[] typeTable;
   private int labelCount;
   private SymbolTable.LabelEntry[] labelTable;
   private SymbolTable.LabelEntry[] labelEntries;

   SymbolTable(ClassWriter var1) {
      this.classWriter = var1;
      this.sourceClassReader = null;
      this.entries = new SymbolTable.Entry[256];
      this.constantPoolCount = 1;
      this.constantPool = new ByteVector();
   }

   SymbolTable(ClassWriter var1, ClassReader var2) {
      this.classWriter = var1;
      this.sourceClassReader = var2;
      byte[] var3 = var2.classFileBuffer;
      int var4 = var2.getItem(1) - 1;
      int var5 = var2.header - var4;
      this.constantPoolCount = var2.getItemCount();
      this.constantPool = new ByteVector(var5);
      this.constantPool.putByteArray(var3, var4, var5);
      this.entries = new SymbolTable.Entry[this.constantPoolCount * 2];
      char[] var6 = new char[var2.getMaxStringLength()];
      boolean var7 = false;
      byte var8 = 1;

      while (var8 < this.constantPoolCount) {
         int var9 = var2.getItem(var8);
         byte var10 = var3[var9 - 1];
         switch (var10) {
            case 1:
               this.addConstantUtf8(var8, var2.readUtf(var8, var6));
               break;
            case 2:
            case 13:
            case 14:
            default:
               throw new IllegalArgumentException();
            case 3:
            case 4:
               this.addConstantIntegerOrFloat(var8, var10, var2.readInt(var9));
               break;
            case 5:
            case 6:
               this.addConstantLongOrDouble(var8, var10, var2.readLong(var9));
               break;
            case 7:
            case 8:
            case 16:
            case 19:
            case 20:
               this.addConstantUtf8Reference(var8, var10, var2.readUTF8(var9, var6));
               break;
            case 9:
            case 10:
            case 11:
               int var14 = var2.getItem(var2.readUnsignedShort(var9 + 2));
               this.addConstantMemberReference(var8, var10, var2.readClass(var9, var6), var2.readUTF8(var14, var6), var2.readUTF8(var14 + 2, var6));
               break;
            case 12:
               this.addConstantNameAndType(var8, var2.readUTF8(var9, var6), var2.readUTF8(var9 + 2, var6));
               break;
            case 15:
               int var12 = var2.getItem(var2.readUnsignedShort(var9 + 1));
               int var13 = var2.getItem(var2.readUnsignedShort(var12 + 2));
               this.addConstantMethodHandle(
                  var8,
                  var2.readByte(var9),
                  var2.readClass(var12, var6),
                  var2.readUTF8(var13, var6),
                  var2.readUTF8(var13 + 2, var6),
                  var2.readByte(var12 - 1) == 11
               );
               break;
            case 17:
            case 18:
               var7 = true;
               int var11 = var2.getItem(var2.readUnsignedShort(var9 + 2));
               this.addConstantDynamicOrInvokeDynamicReference(
                  var10, var8, var2.readUTF8(var11, var6), var2.readUTF8(var11 + 2, var6), var2.readUnsignedShort(var9)
               );
         }

         var8 += var10 != 5 && var10 != 6 ? 1 : 2;
      }

      if (var7) {
         this.copyBootstrapMethods(var2, var6);
      }
   }

   private void copyBootstrapMethods(ClassReader var1, char[] var2) {
      byte[] var3 = var1.classFileBuffer;
      int var4 = var1.getFirstAttributeOffset();

      for (int var5 = var1.readUnsignedShort(var4 - 2); var5 > 0; var5--) {
         String var6 = var1.readUTF8(var4, var2);
         if ("BootstrapMethods".equals(var6)) {
            this.bootstrapMethodCount = var1.readUnsignedShort(var4 + 6);
            break;
         }

         var4 += 6 + var1.readInt(var4 + 2);
      }

      if (this.bootstrapMethodCount > 0) {
         int var14 = var4 + 8;
         int var15 = var1.readInt(var4 + 2) - 2;
         this.bootstrapMethods = new ByteVector(var15);
         this.bootstrapMethods.putByteArray(var3, var14, var15);
         int var7 = var14;

         for (int var8 = 0; var8 < this.bootstrapMethodCount; var8++) {
            int var9 = var7 - var14;
            int var10 = var1.readUnsignedShort(var7);
            var7 += 2;
            int var11 = var1.readUnsignedShort(var7);
            var7 += 2;
            int var12 = var1.readConst(var10, var2).hashCode();

            while (var11-- > 0) {
               int var13 = var1.readUnsignedShort(var7);
               var7 += 2;
               var12 ^= var1.readConst(var13, var2).hashCode();
            }

            this.add(new SymbolTable.Entry(var8, 64, var9, var12 & 2147483647));
         }
      }
   }

   ClassReader getSource() {
      return this.sourceClassReader;
   }

   int getMajorVersion() {
      return this.majorVersion;
   }

   String getClassName() {
      return this.className;
   }

   int setMajorVersionAndClassName(int var1, String var2) {
      this.majorVersion = var1;
      this.className = var2;
      return this.addConstantClass(var2).index;
   }

   int getConstantPoolCount() {
      return this.constantPoolCount;
   }

   int getConstantPoolLength() {
      return this.constantPool.length;
   }

   void putConstantPool(ByteVector var1) {
      var1.putShort(this.constantPoolCount).putByteArray(this.constantPool.data, 0, this.constantPool.length);
   }

   int computeBootstrapMethodsSize() {
      if (this.bootstrapMethods != null) {
         this.addConstantUtf8("BootstrapMethods");
         return 8 + this.bootstrapMethods.length;
      } else {
         return 0;
      }
   }

   void putBootstrapMethods(ByteVector var1) {
      if (this.bootstrapMethods != null) {
         var1.putShort(this.addConstantUtf8("BootstrapMethods"))
            .putInt(this.bootstrapMethods.length + 2)
            .putShort(this.bootstrapMethodCount)
            .putByteArray(this.bootstrapMethods.data, 0, this.bootstrapMethods.length);
      }
   }

   private SymbolTable.Entry get(int var1) {
      return this.entries[var1 % this.entries.length];
   }

   private SymbolTable.Entry put(SymbolTable.Entry var1) {
      if (this.entryCount > this.entries.length * 3 / 4) {
         int var2 = this.entries.length;
         int var3 = var2 * 2 + 1;
         SymbolTable.Entry[] var4 = new SymbolTable.Entry[var3];

         for (int var5 = var2 - 1; var5 >= 0; var5--) {
            SymbolTable.Entry var6 = this.entries[var5];

            while (var6 != null) {
               int var7 = var6.hashCode % var3;
               SymbolTable.Entry var8 = var6.next;
               var6.next = var4[var7];
               var4[var7] = var6;
               var6 = var8;
            }
         }

         this.entries = var4;
      }

      this.entryCount++;
      int var9 = var1.hashCode % this.entries.length;
      var1.next = this.entries[var9];
      return this.entries[var9] = var1;
   }

   private void add(SymbolTable.Entry var1) {
      this.entryCount++;
      int var2 = var1.hashCode % this.entries.length;
      var1.next = this.entries[var2];
      this.entries[var2] = var1;
   }

   Symbol addConstant(Object var1) {
      if (var1 instanceof Integer) {
         return this.addConstantInteger((Integer)var1);
      }

      if (var1 instanceof Byte) {
         return this.addConstantInteger(((Byte)var1).intValue());
      }

      if (var1 instanceof Character) {
         return this.addConstantInteger((Character)var1);
      }

      if (var1 instanceof Short) {
         return this.addConstantInteger(((Short)var1).intValue());
      }

      if (var1 instanceof Boolean) {
         return this.addConstantInteger((Boolean)var1 ? 1 : 0);
      }

      if (var1 instanceof Float) {
         return this.addConstantFloat((Float)var1);
      }

      if (var1 instanceof Long) {
         return this.addConstantLong((Long)var1);
      }

      if (var1 instanceof Double) {
         return this.addConstantDouble((Double)var1);
      }

      if (var1 instanceof String) {
         return this.addConstantString((String)var1);
      }

      if (var1 instanceof Type) {
         Type var5 = (Type)var1;
         int var3 = var5.getSort();
         if (var3 == 10) {
            return this.addConstantClass(var5.getInternalName());
         } else {
            return var3 == 11 ? this.addConstantMethodType(var5.getDescriptor()) : this.addConstantClass(var5.getDescriptor());
         }
      } else if (var1 instanceof Handle) {
         Handle var4 = (Handle)var1;
         return this.addConstantMethodHandle(var4.getTag(), var4.getOwner(), var4.getName(), var4.getDesc(), var4.isInterface());
      } else if (var1 instanceof ConstantDynamic) {
         ConstantDynamic var2 = (ConstantDynamic)var1;
         return this.addConstantDynamic(var2.getName(), var2.getDescriptor(), var2.getBootstrapMethod(), var2.getBootstrapMethodArgumentsUnsafe());
      } else {
         throw new IllegalArgumentException(stringConcat$0(String.valueOf(var1)));
      }
   }

   Symbol addConstantClass(String var1) {
      return this.addConstantUtf8Reference(7, var1);
   }

   Symbol addConstantFieldref(String var1, String var2, String var3) {
      return this.addConstantMemberReference(9, var1, var2, var3);
   }

   Symbol addConstantMethodref(String var1, String var2, String var3, boolean var4) {
      int var5 = var4 ? 11 : 10;
      return this.addConstantMemberReference(var5, var1, var2, var3);
   }

   private SymbolTable.Entry addConstantMemberReference(int var1, String var2, String var3, String var4) {
      int var5 = hash(var1, var2, var3, var4);

      for (SymbolTable.Entry var6 = this.get(var5); var6 != null; var6 = var6.next) {
         if (var6.tag == var1 && var6.hashCode == var5 && var6.owner.equals(var2) && var6.name.equals(var3) && var6.value.equals(var4)) {
            return var6;
         }
      }

      this.constantPool.put122(var1, this.addConstantClass(var2).index, this.addConstantNameAndType(var3, var4));
      return this.put(new SymbolTable.Entry(this.constantPoolCount++, var1, var2, var3, var4, 0L, var5));
   }

   private void addConstantMemberReference(int var1, int var2, String var3, String var4, String var5) {
      this.add(new SymbolTable.Entry(var1, var2, var3, var4, var5, 0L, hash(var2, var3, var4, var5)));
   }

   Symbol addConstantString(String var1) {
      return this.addConstantUtf8Reference(8, var1);
   }

   Symbol addConstantInteger(int var1) {
      return this.addConstantIntegerOrFloat(3, var1);
   }

   Symbol addConstantFloat(float var1) {
      return this.addConstantIntegerOrFloat(4, Float.floatToRawIntBits(var1));
   }

   private Symbol addConstantIntegerOrFloat(int var1, int var2) {
      int var3 = hash(var1, var2);

      for (SymbolTable.Entry var4 = this.get(var3); var4 != null; var4 = var4.next) {
         if (var4.tag == var1 && var4.hashCode == var3 && var4.data == var2) {
            return var4;
         }
      }

      this.constantPool.putByte(var1).putInt(var2);
      return this.put(new SymbolTable.Entry(this.constantPoolCount++, var1, var2, var3));
   }

   private void addConstantIntegerOrFloat(int var1, int var2, int var3) {
      this.add(new SymbolTable.Entry(var1, var2, var3, hash(var2, var3)));
   }

   Symbol addConstantLong(long var1) {
      return this.addConstantLongOrDouble(5, var1);
   }

   Symbol addConstantDouble(double var1) {
      return this.addConstantLongOrDouble(6, Double.doubleToRawLongBits(var1));
   }

   private Symbol addConstantLongOrDouble(int var1, long var2) {
      int var4 = hash(var1, var2);

      for (SymbolTable.Entry var5 = this.get(var4); var5 != null; var5 = var5.next) {
         if (var5.tag == var1 && var5.hashCode == var4 && var5.data == var2) {
            return var5;
         }
      }

      int var6 = this.constantPoolCount;
      this.constantPool.putByte(var1).putLong(var2);
      this.constantPoolCount += 2;
      return this.put(new SymbolTable.Entry(var6, var1, var2, var4));
   }

   private void addConstantLongOrDouble(int var1, int var2, long var3) {
      this.add(new SymbolTable.Entry(var1, var2, var3, hash(var2, var3)));
   }

   int addConstantNameAndType(String var1, String var2) {
      byte var3 = 12;
      int var4 = hash(12, var1, var2);

      for (SymbolTable.Entry var5 = this.get(var4); var5 != null; var5 = var5.next) {
         if (var5.tag == 12 && var5.hashCode == var4 && var5.name.equals(var1) && var5.value.equals(var2)) {
            return var5.index;
         }
      }

      this.constantPool.put122(12, this.addConstantUtf8(var1), this.addConstantUtf8(var2));
      return this.put(new SymbolTable.Entry(this.constantPoolCount++, 12, var1, var2, var4)).index;
   }

   private void addConstantNameAndType(int var1, String var2, String var3) {
      byte var4 = 12;
      this.add(new SymbolTable.Entry(var1, 12, var2, var3, hash(12, var2, var3)));
   }

   int addConstantUtf8(String var1) {
      int var2 = hash(1, var1);

      for (SymbolTable.Entry var3 = this.get(var2); var3 != null; var3 = var3.next) {
         if (var3.tag == 1 && var3.hashCode == var2 && var3.value.equals(var1)) {
            return var3.index;
         }
      }

      this.constantPool.putByte(1).putUTF8(var1);
      return this.put(new SymbolTable.Entry(this.constantPoolCount++, 1, var1, var2)).index;
   }

   private void addConstantUtf8(int var1, String var2) {
      this.add(new SymbolTable.Entry(var1, 1, var2, hash(1, var2)));
   }

   Symbol addConstantMethodHandle(int var1, String var2, String var3, String var4, boolean var5) {
      byte var6 = 15;
      int var7 = getConstantMethodHandleSymbolData(var1, var5);
      int var8 = hash(15, var2, var3, var4, var7);

      for (SymbolTable.Entry var9 = this.get(var8); var9 != null; var9 = var9.next) {
         if (var9.tag == 15 && var9.hashCode == var8 && var9.data == var7 && var9.owner.equals(var2) && var9.name.equals(var3) && var9.value.equals(var4)) {
            return var9;
         }
      }

      if (var1 <= 4) {
         this.constantPool.put112(15, var1, this.addConstantFieldref(var2, var3, var4).index);
      } else {
         this.constantPool.put112(15, var1, this.addConstantMethodref(var2, var3, var4, var5).index);
      }

      return this.put(new SymbolTable.Entry(this.constantPoolCount++, 15, var2, var3, var4, var7, var8));
   }

   private void addConstantMethodHandle(int var1, int var2, String var3, String var4, String var5, boolean var6) {
      byte var7 = 15;
      int var8 = getConstantMethodHandleSymbolData(var2, var6);
      int var9 = hash(15, var3, var4, var5, var8);
      this.add(new SymbolTable.Entry(var1, 15, var3, var4, var5, var8, var9));
   }

   private static int getConstantMethodHandleSymbolData(int var0, boolean var1) {
      return var0 > 4 && var1 ? var0 << 8 : var0;
   }

   Symbol addConstantMethodType(String var1) {
      return this.addConstantUtf8Reference(16, var1);
   }

   Symbol addConstantDynamic(String var1, String var2, Handle var3, Object... var4) {
      Symbol var5 = this.addBootstrapMethod(var3, var4);
      return this.addConstantDynamicOrInvokeDynamicReference(17, var1, var2, var5.index);
   }

   Symbol addConstantInvokeDynamic(String var1, String var2, Handle var3, Object... var4) {
      Symbol var5 = this.addBootstrapMethod(var3, var4);
      return this.addConstantDynamicOrInvokeDynamicReference(18, var1, var2, var5.index);
   }

   private Symbol addConstantDynamicOrInvokeDynamicReference(int var1, String var2, String var3, int var4) {
      int var5 = hash(var1, var2, var3, var4);

      for (SymbolTable.Entry var6 = this.get(var5); var6 != null; var6 = var6.next) {
         if (var6.tag == var1 && var6.hashCode == var5 && var6.data == var4 && var6.name.equals(var2) && var6.value.equals(var3)) {
            return var6;
         }
      }

      this.constantPool.put122(var1, var4, this.addConstantNameAndType(var2, var3));
      return this.put(new SymbolTable.Entry(this.constantPoolCount++, var1, null, var2, var3, var4, var5));
   }

   private void addConstantDynamicOrInvokeDynamicReference(int var1, int var2, String var3, String var4, int var5) {
      int var6 = hash(var1, var3, var4, var5);
      this.add(new SymbolTable.Entry(var2, var1, null, var3, var4, var5, var6));
   }

   Symbol addConstantModule(String var1) {
      return this.addConstantUtf8Reference(19, var1);
   }

   Symbol addConstantPackage(String var1) {
      return this.addConstantUtf8Reference(20, var1);
   }

   private Symbol addConstantUtf8Reference(int var1, String var2) {
      int var3 = hash(var1, var2);

      for (SymbolTable.Entry var4 = this.get(var3); var4 != null; var4 = var4.next) {
         if (var4.tag == var1 && var4.hashCode == var3 && var4.value.equals(var2)) {
            return var4;
         }
      }

      this.constantPool.put12(var1, this.addConstantUtf8(var2));
      return this.put(new SymbolTable.Entry(this.constantPoolCount++, var1, var2, var3));
   }

   private void addConstantUtf8Reference(int var1, int var2, String var3) {
      this.add(new SymbolTable.Entry(var1, var2, var3, hash(var2, var3)));
   }

   Symbol addBootstrapMethod(Handle var1, Object... var2) {
      ByteVector var3 = this.bootstrapMethods;
      if (var3 == null) {
         var3 = this.bootstrapMethods = new ByteVector();
      }

      int var4 = var2.length;
      int[] var5 = new int[var4];

      for (int var6 = 0; var6 < var4; var6++) {
         var5[var6] = this.addConstant(var2[var6]).index;
      }

      int var13 = var3.length;
      var3.putShort(this.addConstantMethodHandle(var1.getTag(), var1.getOwner(), var1.getName(), var1.getDesc(), var1.isInterface()).index);
      var3.putShort(var4);

      for (int var7 = 0; var7 < var4; var7++) {
         var3.putShort(var5[var7]);
      }

      int var14 = var3.length - var13;
      int var8 = var1.hashCode();

      for (Object var12 : var2) {
         var8 ^= var12.hashCode();
      }

      var8 &= Integer.MAX_VALUE;
      return this.addBootstrapMethod(var13, var14, var8);
   }

   private Symbol addBootstrapMethod(int var1, int var2, int var3) {
      byte[] var4 = this.bootstrapMethods.data;

      for (SymbolTable.Entry var5 = this.get(var3); var5 != null; var5 = var5.next) {
         if (var5.tag == 64 && var5.hashCode == var3) {
            int var6 = (int)var5.data;
            boolean var7 = true;

            for (int var8 = 0; var8 < var2; var8++) {
               if (var4[var1 + var8] != var4[var6 + var8]) {
                  var7 = false;
                  break;
               }
            }

            if (var7) {
               this.bootstrapMethods.length = var1;
               return var5;
            }
         }
      }

      return this.put(new SymbolTable.Entry(this.bootstrapMethodCount++, 64, var1, var3));
   }

   Symbol getType(int var1) {
      return this.typeTable[var1];
   }

   Label getForwardUninitializedLabel(int var1) {
      return this.labelTable[(int)this.typeTable[var1].data].label;
   }

   int addType(String var1) {
      int var2 = hash(128, var1);

      for (SymbolTable.Entry var3 = this.get(var2); var3 != null; var3 = var3.next) {
         if (var3.tag == 128 && var3.hashCode == var2 && var3.value.equals(var1)) {
            return var3.index;
         }
      }

      return this.addTypeInternal(new SymbolTable.Entry(this.typeCount, 128, var1, var2));
   }

   int addUninitializedType(String var1, int var2) {
      int var3 = hash(129, var1, var2);

      for (SymbolTable.Entry var4 = this.get(var3); var4 != null; var4 = var4.next) {
         if (var4.tag == 129 && var4.hashCode == var3 && var4.data == var2 && var4.value.equals(var1)) {
            return var4.index;
         }
      }

      return this.addTypeInternal(new SymbolTable.Entry(this.typeCount, 129, var1, var2, var3));
   }

   int addForwardUninitializedType(String var1, Label var2) {
      int var3 = this.getOrAddLabelEntry(var2).index;
      int var4 = hash(130, var1, var3);

      for (SymbolTable.Entry var5 = this.get(var4); var5 != null; var5 = var5.next) {
         if (var5.tag == 130 && var5.hashCode == var4 && var5.data == var3 && var5.value.equals(var1)) {
            return var5.index;
         }
      }

      return this.addTypeInternal(new SymbolTable.Entry(this.typeCount, 130, var1, var3, var4));
   }

   int addMergedType(int var1, int var2) {
      long var3 = var1 < var2 ? var1 | (long)var2 << 32 : var2 | (long)var1 << 32;
      int var5 = hash(131, var1 + var2);

      for (SymbolTable.Entry var6 = this.get(var5); var6 != null; var6 = var6.next) {
         if (var6.tag == 131 && var6.hashCode == var5 && var6.data == var3) {
            return var6.info;
         }
      }

      String var7 = this.typeTable[var1].value;
      String var8 = this.typeTable[var2].value;
      int var9 = this.addType(this.classWriter.getCommonSuperClass(var7, var8));
      this.put(new SymbolTable.Entry(this.typeCount, 131, var3, var5)).info = var9;
      return var9;
   }

   private int addTypeInternal(SymbolTable.Entry var1) {
      if (this.typeTable == null) {
         this.typeTable = new SymbolTable.Entry[16];
      }

      if (this.typeCount == this.typeTable.length) {
         SymbolTable.Entry[] var2 = new SymbolTable.Entry[2 * this.typeTable.length];
         System.arraycopy(this.typeTable, 0, var2, 0, this.typeTable.length);
         this.typeTable = var2;
      }

      this.typeTable[this.typeCount++] = var1;
      return this.put(var1).index;
   }

   private SymbolTable.LabelEntry getOrAddLabelEntry(Label var1) {
      if (this.labelEntries == null) {
         this.labelEntries = new SymbolTable.LabelEntry[16];
         this.labelTable = new SymbolTable.LabelEntry[16];
      }

      int var2 = System.identityHashCode(var1);
      SymbolTable.LabelEntry var3 = this.labelEntries[var2 % this.labelEntries.length];

      while (var3 != null && var3.label != var1) {
         var3 = var3.next;
      }

      if (var3 != null) {
         return var3;
      }

      if (this.labelCount > this.labelEntries.length * 3 / 4) {
         int var4 = this.labelEntries.length;
         int var5 = var4 * 2 + 1;
         SymbolTable.LabelEntry[] var6 = new SymbolTable.LabelEntry[var5];

         for (int var7 = var4 - 1; var7 >= 0; var7--) {
            SymbolTable.LabelEntry var8 = this.labelEntries[var7];

            while (var8 != null) {
               int var9 = System.identityHashCode(var8.label) % var5;
               SymbolTable.LabelEntry var10 = var8.next;
               var8.next = var6[var9];
               var6[var9] = var8;
               var8 = var10;
            }
         }

         this.labelEntries = var6;
      }

      if (this.labelCount == this.labelTable.length) {
         SymbolTable.LabelEntry[] var12 = new SymbolTable.LabelEntry[2 * this.labelTable.length];
         System.arraycopy(this.labelTable, 0, var12, 0, this.labelTable.length);
         this.labelTable = var12;
      }

      var3 = new SymbolTable.LabelEntry(this.labelCount, var1);
      int var13 = var2 % this.labelEntries.length;
      var3.next = this.labelEntries[var13];
      this.labelEntries[var13] = var3;
      this.labelTable[this.labelCount++] = var3;
      return var3;
   }

   private static int hash(int var0, int var1) {
      return 2147483647 & var0 + var1;
   }

   private static int hash(int var0, long var1) {
      return 2147483647 & var0 + (int)var1 + (int)(var1 >>> 32);
   }

   private static int hash(int var0, String var1) {
      return 2147483647 & var0 + var1.hashCode();
   }

   private static int hash(int var0, String var1, int var2) {
      return 2147483647 & var0 + var1.hashCode() + var2;
   }

   private static int hash(int var0, String var1, String var2) {
      return 2147483647 & var0 + var1.hashCode() * var2.hashCode();
   }

   private static int hash(int var0, String var1, String var2, int var3) {
      return 2147483647 & var0 + var1.hashCode() * var2.hashCode() * (var3 + 1);
   }

   private static int hash(int var0, String var1, String var2, String var3) {
      return 2147483647 & var0 + var1.hashCode() * var2.hashCode() * var3.hashCode();
   }

   private static int hash(int var0, String var1, String var2, String var3, int var4) {
      return 2147483647 & var0 + var1.hashCode() * var2.hashCode() * var3.hashCode() * var4;
   }

   private static final class Entry extends Symbol {
      final int hashCode;
      SymbolTable.Entry next;

      Entry(int var1, int var2, String var3, String var4, String var5, long var6, int var8) {
         super(var1, var2, var3, var4, var5, var6);
         this.hashCode = var8;
      }

      Entry(int var1, int var2, String var3, int var4) {
         super(var1, var2, null, null, var3, 0L);
         this.hashCode = var4;
      }

      Entry(int var1, int var2, String var3, long var4, int var6) {
         super(var1, var2, null, null, var3, var4);
         this.hashCode = var6;
      }

      Entry(int var1, int var2, String var3, String var4, int var5) {
         super(var1, var2, null, var3, var4, 0L);
         this.hashCode = var5;
      }

      Entry(int var1, int var2, long var3, int var5) {
         super(var1, var2, null, null, null, var3);
         this.hashCode = var5;
      }
   }

   private static final class LabelEntry {
      final int index;
      final Label label;
      SymbolTable.LabelEntry next;

      LabelEntry(int var1, Label var2) {
         this.index = var1;
         this.label = var2;
      }
   }
}
