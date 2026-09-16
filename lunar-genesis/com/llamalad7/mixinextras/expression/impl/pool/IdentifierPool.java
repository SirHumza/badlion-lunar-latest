package com.llamalad7.mixinextras.expression.impl.pool;

import com.llamalad7.mixinextras.expression.impl.flow.FlowValue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.objectweb.asm.Type;

public class IdentifierPool {
   private final Map<String, List<MemberDefinition>> members = new HashMap<>();
   private final Map<String, List<TypeDefinition>> types = new HashMap<>();

   public IdentifierPool() {
      this.addType("byte", new ExactTypeDef(Type.BYTE_TYPE));
      this.addType("char", new ExactTypeDef(Type.CHAR_TYPE));
      this.addType("double", new ExactTypeDef(Type.DOUBLE_TYPE));
      this.addType("float", new ExactTypeDef(Type.FLOAT_TYPE));
      this.addType("int", new ExactTypeDef(Type.INT_TYPE));
      this.addType("long", new ExactTypeDef(Type.LONG_TYPE));
      this.addType("short", new ExactTypeDef(Type.SHORT_TYPE));
      this.addMember("length", new ArrayLengthDef());
   }

   public boolean matchesMember(String var1, FlowValue var2) {
      List var3 = this.members.get(var1);
      if (var3 == null) {
         throw new IllegalStateException("Use of undeclared identifier '" + var1 + '\'');
      } else {
         return var3.stream().anyMatch(var1x -> var1x.matches(var2));
      }
   }

   public boolean matchesType(String var1, Type var2) {
      List var3 = this.types.get(var1);
      if (var3 == null) {
         throw new IllegalStateException("Use of undeclared identifier '" + var1 + '\'');
      } else {
         return var3.stream().anyMatch(var1x -> var1x.matches(var2));
      }
   }

   public void addMember(String var1, MemberDefinition var2) {
      this.members.computeIfAbsent(var1, var0 -> new ArrayList<>()).add(var2);
   }

   public void addType(String var1, TypeDefinition var2) {
      this.types.computeIfAbsent(var1, var0 -> new ArrayList<>()).add(var2);
   }

   public boolean memberExists(String var1) {
      return this.members.containsKey(var1);
   }

   public boolean typeExists(String var1) {
      return this.types.containsKey(var1);
   }
}
