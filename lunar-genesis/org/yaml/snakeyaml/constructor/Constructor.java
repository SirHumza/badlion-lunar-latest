package org.yaml.snakeyaml.constructor;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.yaml.snakeyaml.LoaderOptions;
import org.yaml.snakeyaml.TypeDescription;
import org.yaml.snakeyaml.error.YAMLException;
import org.yaml.snakeyaml.introspector.Property;
import org.yaml.snakeyaml.nodes.MappingNode;
import org.yaml.snakeyaml.nodes.Node;
import org.yaml.snakeyaml.nodes.NodeId;
import org.yaml.snakeyaml.nodes.NodeTuple;
import org.yaml.snakeyaml.nodes.ScalarNode;
import org.yaml.snakeyaml.nodes.SequenceNode;
import org.yaml.snakeyaml.nodes.Tag;
import org.yaml.snakeyaml.util.EnumUtils;

public class Constructor extends SafeConstructor {
   public Constructor(LoaderOptions var1) {
      this(Object.class, var1);
   }

   public Constructor(Class<? extends Object> var1, LoaderOptions var2) {
      this(new TypeDescription(checkRoot(var1)), null, var2);
   }

   private static Class<? extends Object> checkRoot(Class<? extends Object> var0) {
      if (var0 == null) {
         throw new NullPointerException("Root class must be provided.");
      } else {
         return var0;
      }
   }

   public Constructor(TypeDescription var1, LoaderOptions var2) {
      this(var1, null, var2);
   }

   public Constructor(TypeDescription var1, Collection<TypeDescription> var2, LoaderOptions var3) {
      super(var3);
      if (var1 == null) {
         throw new NullPointerException("Root type must be provided.");
      }

      this.yamlConstructors.put(null, new Constructor.ConstructYamlObject());
      if (!Object.class.equals(var1.getType())) {
         this.rootTag = new Tag(var1.getType());
      }

      this.yamlClassConstructors.put(NodeId.scalar, new Constructor.ConstructScalar());
      this.yamlClassConstructors.put(NodeId.mapping, new Constructor.ConstructMapping());
      this.yamlClassConstructors.put(NodeId.sequence, new Constructor.ConstructSequence());
      this.addTypeDescription(var1);
      if (var2 != null) {
         for (TypeDescription var5 : var2) {
            this.addTypeDescription(var5);
         }
      }
   }

   public Constructor(String var1, LoaderOptions var2) {
      this((Class<? extends Object>)Class.forName(check(var1)), var2);
   }

   private static String check(String var0) {
      if (var0 == null) {
         throw new NullPointerException("Root type must be provided.");
      } else if (var0.trim().length() == 0) {
         throw new YAMLException("Root type must be provided.");
      } else {
         return var0;
      }
   }

   protected Class<?> getClassForNode(Node var1) {
      Class var2 = this.typeTags.get(var1.getTag());
      if (var2 == null) {
         String var3 = var1.getTag().getClassName();

         Class var4;
         try {
            var4 = this.getClassForName(var3);
         } catch (ClassNotFoundException var6) {
            throw new YAMLException("Class not found: " + var3);
         }

         this.typeTags.put(var1.getTag(), var4);
         return var4;
      } else {
         return var2;
      }
   }

   protected Class<?> getClassForName(String var1) {
      try {
         return Class.forName(var1, true, Thread.currentThread().getContextClassLoader());
      } catch (ClassNotFoundException var3) {
         return Class.forName(var1);
      }
   }

   protected class ConstructMapping implements Construct {
      @Override
      public Object construct(Node var1) {
         MappingNode var2 = (MappingNode)var1;
         if (Map.class.isAssignableFrom(var1.getType())) {
            return var1.isTwoStepsConstruction() ? Constructor.this.newMap(var2) : Constructor.this.constructMapping(var2);
         } else if (Collection.class.isAssignableFrom(var1.getType())) {
            return var1.isTwoStepsConstruction() ? Constructor.this.newSet(var2) : Constructor.this.constructSet(var2);
         } else {
            Object var3 = Constructor.this.newInstance(var2);
            if (var3 != BaseConstructor.NOT_INSTANTIATED_OBJECT) {
               return var1.isTwoStepsConstruction() ? var3 : this.constructJavaBean2ndStep(var2, var3);
            } else {
               throw new ConstructorException(null, null, "Can't create an instance for " + var2.getTag(), var1.getStartMark());
            }
         }
      }

      @Override
      public void construct2ndStep(Node var1, Object var2) {
         if (Map.class.isAssignableFrom(var1.getType())) {
            Constructor.this.constructMapping2ndStep((MappingNode)var1, (Map<Object, Object>)var2);
         } else if (Set.class.isAssignableFrom(var1.getType())) {
            Constructor.this.constructSet2ndStep((MappingNode)var1, (Set<Object>)var2);
         } else {
            this.constructJavaBean2ndStep((MappingNode)var1, var2);
         }
      }

      protected Object constructJavaBean2ndStep(MappingNode var1, Object var2) {
         Constructor.this.flattenMapping(var1, true);
         Class var3 = var1.getType();

         for (NodeTuple var6 : var1.getValue()) {
            Node var7 = var6.getValueNode();
            String var8 = (String)Constructor.this.constructObject(var6.getKeyNode());

            try {
               TypeDescription var9 = Constructor.this.typeDefinitions.get(var3);
               Property var10 = var9 == null ? this.getProperty(var3, var8) : var9.getProperty(var8);
               if (!var10.isWritable()) {
                  throw new YAMLException("No writable property '" + var8 + "' on class: " + var3.getName());
               }

               var7.setType((Class<? extends Object>)var10.getType());
               boolean var11 = var9 != null && var9.setupPropertyType(var8, var7);
               if (!var11 && var7.getNodeId() != NodeId.scalar) {
                  Class[] var12 = var10.getActualTypeArguments();
                  if (var12 != null && var12.length > 0) {
                     if (var7.getNodeId() == NodeId.sequence) {
                        Class var13 = var12[0];
                        SequenceNode var14 = (SequenceNode)var7;
                        var14.setListType(var13);
                     } else if (Map.class.isAssignableFrom(var7.getType())) {
                        Class var19 = var12[0];
                        Class var21 = var12[1];
                        MappingNode var15 = (MappingNode)var7;
                        var15.setTypes(var19, var21);
                        var15.setUseClassConstructor(true);
                     } else if (Collection.class.isAssignableFrom(var7.getType())) {
                        Class var20 = var12[0];
                        MappingNode var22 = (MappingNode)var7;
                        var22.setOnlyKeyType(var20);
                        var22.setUseClassConstructor(true);
                     }
                  }
               }

               Object var18 = var9 != null ? this.newInstance(var9, var8, var7) : Constructor.this.constructObject(var7);
               if ((var10.getType() == float.class || var10.getType() == Float.class) && var18 instanceof Double) {
                  var18 = ((Double)var18).floatValue();
               }

               if (var10.getType() == String.class && Tag.BINARY.equals(var7.getTag()) && var18 instanceof byte[]) {
                  var18 = new String((byte[])var18);
               }

               if (var9 == null || !var9.setProperty(var2, var8, var18)) {
                  var10.set(var2, var18);
               }
            } catch (DuplicateKeyException var16) {
               throw var16;
            } catch (Exception var17) {
               throw new ConstructorException(
                  "Cannot create property=" + var8 + " for JavaBean=" + var2, var1.getStartMark(), var17.getMessage(), var7.getStartMark(), var17
               );
            }
         }

         return var2;
      }

      private Object newInstance(TypeDescription var1, String var2, Node var3) {
         Object var4 = var1.newInstance(var2, var3);
         if (var4 != null) {
            Constructor.this.constructedObjects.put(var3, var4);
            return Constructor.this.constructObjectNoCheck(var3);
         } else {
            return Constructor.this.constructObject(var3);
         }
      }

      protected Property getProperty(Class<? extends Object> var1, String var2) {
         return Constructor.this.getPropertyUtils().getProperty(var1, var2);
      }
   }

   protected class ConstructScalar extends AbstractConstruct {
      @Override
      public Object construct(Node var1) {
         ScalarNode var2 = (ScalarNode)var1;
         Class var3 = var2.getType();
         Object var4 = Constructor.this.newInstance(var3, var2, false);
         if (var4 != BaseConstructor.NOT_INSTANTIATED_OBJECT) {
            return var4;
         }

         Object var5;
         if (!var3.isPrimitive()
            && var3 != String.class
            && !Number.class.isAssignableFrom(var3)
            && var3 != Boolean.class
            && !Date.class.isAssignableFrom(var3)
            && var3 != Character.class
            && var3 != BigInteger.class
            && var3 != BigDecimal.class
            && !Enum.class.isAssignableFrom(var3)
            && !Tag.BINARY.equals(var2.getTag())
            && !Calendar.class.isAssignableFrom(var3)
            && var3 != UUID.class) {
            java.lang.reflect.Constructor[] var6 = var3.getDeclaredConstructors();
            int var7 = 0;
            java.lang.reflect.Constructor var8 = null;

            for (java.lang.reflect.Constructor var12 : var6) {
               if (var12.getParameterTypes().length == 1) {
                  var7++;
                  var8 = var12;
               }
            }

            if (var8 == null) {
               throw new YAMLException("No single argument constructor found for " + var3);
            }

            Object var15;
            if (var7 == 1) {
               var15 = this.constructStandardJavaInstance(var8.getParameterTypes()[0], var2);
            } else {
               var15 = Constructor.this.constructScalar(var2);

               try {
                  var8 = var3.getDeclaredConstructor(String.class);
               } catch (Exception var14) {
                  throw new YAMLException(
                     "Can't construct a java object for scalar " + var2.getTag() + "; No String constructor found. Exception=" + var14.getMessage(), var14
                  );
               }
            }

            try {
               var8.setAccessible(true);
               var5 = var8.newInstance(var15);
            } catch (Exception var13) {
               throw new ConstructorException(
                  null, null, "Can't construct a java object for scalar " + var2.getTag() + "; exception=" + var13.getMessage(), var2.getStartMark(), var13
               );
            }
         } else {
            var5 = this.constructStandardJavaInstance(var3, var2);
         }

         return var5;
      }

      private Object constructStandardJavaInstance(Class var1, ScalarNode var2) {
         Object var3;
         if (var1 == String.class) {
            Construct var4 = Constructor.this.yamlConstructors.get(Tag.STR);
            var3 = var4.construct(var2);
         } else if (var1 == Boolean.class || var1 == boolean.class) {
            Construct var18 = Constructor.this.yamlConstructors.get(Tag.BOOL);
            var3 = var18.construct(var2);
         } else if (var1 == Character.class || var1 == char.class) {
            Construct var17 = Constructor.this.yamlConstructors.get(Tag.STR);
            String var19 = (String)var17.construct(var2);
            if (var19.length() == 0) {
               var3 = null;
            } else {
               if (var19.length() != 1) {
                  throw new YAMLException("Invalid node Character: '" + var19 + "'; length: " + var19.length());
               }

               var3 = var19.charAt(0);
            }
         } else if (Date.class.isAssignableFrom(var1)) {
            Construct var11 = Constructor.this.yamlConstructors.get(Tag.TIMESTAMP);
            Date var5 = (Date)var11.construct(var2);
            if (var1 == Date.class) {
               var3 = var5;
            } else {
               try {
                  java.lang.reflect.Constructor var6 = var1.getConstructor(long.class);
                  var3 = var6.newInstance(var5.getTime());
               } catch (RuntimeException var8) {
                  throw var8;
               } catch (Exception var9) {
                  throw new YAMLException("Cannot construct: '" + var1 + "'");
               }
            }
         } else if (var1 != Float.class && var1 != Double.class && var1 != float.class && var1 != double.class && var1 != BigDecimal.class) {
            if (var1 == Byte.class
               || var1 == Short.class
               || var1 == Integer.class
               || var1 == Long.class
               || var1 == BigInteger.class
               || var1 == byte.class
               || var1 == short.class
               || var1 == int.class
               || var1 == long.class) {
               Construct var16 = Constructor.this.yamlConstructors.get(Tag.INT);
               var3 = var16.construct(var2);
               if (var1 == Byte.class || var1 == byte.class) {
                  var3 = Integer.valueOf(var3.toString()).byteValue();
               } else if (var1 == Short.class || var1 == short.class) {
                  var3 = Integer.valueOf(var3.toString()).shortValue();
               } else if (var1 == Integer.class || var1 == int.class) {
                  var3 = Integer.parseInt(var3.toString());
               } else if (var1 != Long.class && var1 != long.class) {
                  var3 = new BigInteger(var3.toString());
               } else {
                  var3 = Long.valueOf(var3.toString());
               }
            } else if (Enum.class.isAssignableFrom(var1)) {
               String var13 = var2.getValue();

               try {
                  if (Constructor.this.loadingConfig.isEnumCaseSensitive()) {
                     var3 = Enum.valueOf(var1, var13);
                  } else {
                     var3 = EnumUtils.findEnumInsensitiveCase(var1, var13);
                  }
               } catch (Exception var7) {
                  throw new YAMLException("Unable to find enum value '" + var13 + "' for enum class: " + var1.getName());
               }
            } else if (Calendar.class.isAssignableFrom(var1)) {
               SafeConstructor.ConstructYamlTimestamp var14 = new SafeConstructor.ConstructYamlTimestamp();
               var14.construct(var2);
               var3 = var14.getCalendar();
            } else if (Number.class.isAssignableFrom(var1)) {
               SafeConstructor.ConstructYamlFloat var15 = Constructor.this.new ConstructYamlFloat();
               var3 = var15.construct(var2);
            } else if (UUID.class == var1) {
               var3 = UUID.fromString(var2.getValue());
            } else {
               if (!Constructor.this.yamlConstructors.containsKey(var2.getTag())) {
                  throw new YAMLException("Unsupported class: " + var1);
               }

               var3 = Constructor.this.yamlConstructors.get(var2.getTag()).construct(var2);
            }
         } else if (var1 == BigDecimal.class) {
            var3 = new BigDecimal(var2.getValue());
         } else {
            Construct var12 = Constructor.this.yamlConstructors.get(Tag.FLOAT);
            var3 = var12.construct(var2);
            if (var1 == Float.class || var1 == float.class) {
               var3 = ((Double)var3).floatValue();
            }
         }

         return var3;
      }
   }

   protected class ConstructSequence implements Construct {
      @Override
      public Object construct(Node var1) {
         SequenceNode var2 = (SequenceNode)var1;
         if (Set.class.isAssignableFrom(var1.getType())) {
            if (var1.isTwoStepsConstruction()) {
               throw new YAMLException("Set cannot be recursive.");
            } else {
               return Constructor.this.constructSet(var2);
            }
         } else {
            if (Collection.class.isAssignableFrom(var1.getType())) {
               return var1.isTwoStepsConstruction() ? Constructor.this.newList(var2) : Constructor.this.constructSequence(var2);
            }

            if (var1.getType().isArray()) {
               return var1.isTwoStepsConstruction()
                  ? Constructor.this.createArray(var1.getType(), var2.getValue().size())
                  : Constructor.this.constructArray(var2);
            }

            ArrayList var3 = new ArrayList(var2.getValue().size());

            for (java.lang.reflect.Constructor var7 : var1.getType().getDeclaredConstructors()) {
               if (var2.getValue().size() == var7.getParameterTypes().length) {
                  var3.add(var7);
               }
            }

            if (!var3.isEmpty()) {
               if (var3.size() == 1) {
                  Object[] var15 = new Object[var2.getValue().size()];
                  java.lang.reflect.Constructor var17 = (java.lang.reflect.Constructor)var3.get(0);
                  int var19 = 0;

                  for (Node var24 : var2.getValue()) {
                     Class var25 = var17.getParameterTypes()[var19];
                     var24.setType(var25);
                     var15[var19++] = Constructor.this.constructObject(var24);
                  }

                  try {
                     var17.setAccessible(true);
                     return var17.newInstance(var15);
                  } catch (Exception var12) {
                     throw new YAMLException(var12);
                  }
               }

               List var14 = Constructor.this.constructSequence(var2);
               Class[] var16 = new Class[var14.size()];
               int var18 = 0;

               for (Object var8 : var14) {
                  var16[var18] = var8.getClass();
                  var18++;
               }

               for (java.lang.reflect.Constructor var23 : var3) {
                  Class[] var9 = var23.getParameterTypes();
                  boolean var10 = true;

                  for (int var11 = 0; var11 < var9.length; var11++) {
                     if (!this.wrapIfPrimitive(var9[var11]).isAssignableFrom(var16[var11])) {
                        var10 = false;
                        break;
                     }
                  }

                  if (var10) {
                     try {
                        var23.setAccessible(true);
                        return var23.newInstance(var14.toArray());
                     } catch (Exception var13) {
                        throw new YAMLException(var13);
                     }
                  }
               }
            }

            throw new YAMLException("No suitable constructor with " + var2.getValue().size() + " arguments found for " + var1.getType());
         }
      }

      private Class<? extends Object> wrapIfPrimitive(Class<?> var1) {
         if (!var1.isPrimitive()) {
            return var1;
         } else if (var1 == int.class) {
            return Integer.class;
         } else if (var1 == float.class) {
            return Float.class;
         } else if (var1 == double.class) {
            return Double.class;
         } else if (var1 == boolean.class) {
            return Boolean.class;
         } else if (var1 == long.class) {
            return Long.class;
         } else if (var1 == char.class) {
            return Character.class;
         } else if (var1 == short.class) {
            return Short.class;
         } else if (var1 == byte.class) {
            return Byte.class;
         } else {
            throw new YAMLException("Unexpected primitive " + var1);
         }
      }

      @Override
      public void construct2ndStep(Node var1, Object var2) {
         SequenceNode var3 = (SequenceNode)var1;
         if (List.class.isAssignableFrom(var1.getType())) {
            List var4 = (List)var2;
            Constructor.this.constructSequenceStep2(var3, var4);
         } else {
            if (!var1.getType().isArray()) {
               throw new YAMLException("Immutable objects cannot be recursive.");
            }

            Constructor.this.constructArrayStep2(var3, var2);
         }
      }
   }

   protected class ConstructYamlObject implements Construct {
      private Construct getConstructor(Node var1) {
         Class var2 = Constructor.this.getClassForNode(var1);
         var1.setType(var2);
         return Constructor.this.yamlClassConstructors.get(var1.getNodeId());
      }

      @Override
      public Object construct(Node var1) {
         try {
            return this.getConstructor(var1).construct(var1);
         } catch (ConstructorException var3) {
            throw var3;
         } catch (Exception var4) {
            throw new ConstructorException(
               null, null, "Can't construct a java object for " + var1.getTag() + "; exception=" + var4.getMessage(), var1.getStartMark(), var4
            );
         }
      }

      @Override
      public void construct2ndStep(Node var1, Object var2) {
         try {
            this.getConstructor(var1).construct2ndStep(var1, var2);
         } catch (Exception var4) {
            throw new ConstructorException(
               null,
               null,
               "Can't construct a second step for a java object for " + var1.getTag() + "; exception=" + var4.getMessage(),
               var1.getStartMark(),
               var4
            );
         }
      }
   }
}
