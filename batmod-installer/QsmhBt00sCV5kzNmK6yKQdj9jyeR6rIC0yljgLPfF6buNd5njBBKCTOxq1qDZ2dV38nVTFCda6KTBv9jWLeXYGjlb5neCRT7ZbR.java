import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;

public final class QsmhBt00sCV5kzNmK6yKQdj9jyeR6rIC0yljgLPfF6buNd5njBBKCTOxq1qDZ2dV38nVTFCda6KTBv9jWLeXYGjlb5neCRT7ZbR {
   static final Type[] Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I = new Type[0];

   private QsmhBt00sCV5kzNmK6yKQdj9jyeR6rIC0yljgLPfF6buNd5njBBKCTOxq1qDZ2dV38nVTFCda6KTBv9jWLeXYGjlb5neCRT7ZbR() {
      throw new UnsupportedOperationException();
   }

   public static ParameterizedType Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      Type var0, Type var1, Type... var2
   ) {
      return new Qqr1wus4DMJMtY0SHbOSyZFbRmrQkiBGvDwS3UVZHcdpq1DpARO92IFlUiat7fDj0pklK0cuhadwn1flTSUxGSkzgb7QmGQs7d1o(var0, var1, var2);
   }

   public static GenericArrayType Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(Type var0) {
      return new jnCis9uEMIJZ4LbcTWwzvNFcfAAQmKbr9Emwb0P9A3l7dJFPYTlXePtRtSEtG9LkNhbL6vucUprNYzqcrc7GaplIkT1KqhS8UUG2(var0);
   }

   public static WildcardType BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(Type var0) {
      Type[] var1;
      if (var0 instanceof WildcardType) {
         var1 = ((WildcardType)var0).getUpperBounds();
      } else {
         var1 = new Type[]{var0};
      }

      return new nuWP3Bei4rUZ6VCX2iWCHlHKiAsicTC9Ae69Jpwv4oZQMYPCTjiB0SikRnqAxZeaL93OS1vPuNC116DLDmI1tI2KbykrrH2Hg5n(
         var1, Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I
      );
   }

   public static WildcardType vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(Type var0) {
      Type[] var1;
      if (var0 instanceof WildcardType) {
         var1 = ((WildcardType)var0).getLowerBounds();
      } else {
         var1 = new Type[]{var0};
      }

      return new nuWP3Bei4rUZ6VCX2iWCHlHKiAsicTC9Ae69Jpwv4oZQMYPCTjiB0SikRnqAxZeaL93OS1vPuNC116DLDmI1tI2KbykrrH2Hg5n(new Type[]{Object.class}, var1);
   }

   public static Type PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u(Type var0) {
      if (var0 instanceof Class) {
         Class var4 = (Class)var0;
         return (Type)(
            var4.isArray()
               ? new jnCis9uEMIJZ4LbcTWwzvNFcfAAQmKbr9Emwb0P9A3l7dJFPYTlXePtRtSEtG9LkNhbL6vucUprNYzqcrc7GaplIkT1KqhS8UUG2(
                  PMXj5cVzikOoAj6rXar9iuqRUvVsGZW5QkewwwasFBwKChzIbRifUEsJ1VyOgk4IaXktI6jr1braKR7tmjxMnghfQfQ7P5LNjT4u(var4.getComponentType())
               )
               : var4
         );
      } else if (var0 instanceof ParameterizedType) {
         ParameterizedType var3 = (ParameterizedType)var0;
         return new Qqr1wus4DMJMtY0SHbOSyZFbRmrQkiBGvDwS3UVZHcdpq1DpARO92IFlUiat7fDj0pklK0cuhadwn1flTSUxGSkzgb7QmGQs7d1o(
            var3.getOwnerType(), var3.getRawType(), var3.getActualTypeArguments()
         );
      } else if (var0 instanceof GenericArrayType) {
         GenericArrayType var2 = (GenericArrayType)var0;
         return new jnCis9uEMIJZ4LbcTWwzvNFcfAAQmKbr9Emwb0P9A3l7dJFPYTlXePtRtSEtG9LkNhbL6vucUprNYzqcrc7GaplIkT1KqhS8UUG2(var2.getGenericComponentType());
      } else if (var0 instanceof WildcardType) {
         WildcardType var1 = (WildcardType)var0;
         return new nuWP3Bei4rUZ6VCX2iWCHlHKiAsicTC9Ae69Jpwv4oZQMYPCTjiB0SikRnqAxZeaL93OS1vPuNC116DLDmI1tI2KbykrrH2Hg5n(
            var1.getUpperBounds(), var1.getLowerBounds()
         );
      } else {
         return var0;
      }
   }

   public static Class uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590(Type var0) {
      if (var0 instanceof Class) {
         return (Class)var0;
      }

      if (var0 instanceof ParameterizedType) {
         ParameterizedType var4 = (ParameterizedType)var0;
         Type var2 = var4.getRawType();
         Xn1geDAY7a5uhS0abBLl94FsGYb6NwbYPkpDe8KgAH2GTmN8jQtQksXRYtjayIMujK3Yrf6WJpclcS3a0uvPszzCylhP8dnIAxtE.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
            var2 instanceof Class
         );
         return (Class)var2;
      }

      if (var0 instanceof GenericArrayType) {
         Type var3 = ((GenericArrayType)var0).getGenericComponentType();
         return Array.newInstance(uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590(var3), 0).getClass();
      }

      if (var0 instanceof TypeVariable) {
         return Object.class;
      }

      if (var0 instanceof WildcardType) {
         return uOh7QdAMca8nwYb0DkRvlOJ7ff6bkSfOnIYPiKRRS86HCLi5NONDp2LRBNxM7xnBSZGJJ08MXuR6ibgCZ3WlRP15xmemY7XgO590(((WildcardType)var0).getUpperBounds()[0]);
      }

      String var1 = var0 == null ? "null" : var0.getClass().getName();
      throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + var0 + "> is of type " + var1);
   }

   static boolean Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(Object var0, Object var1) {
      return var0 == var1 || var0 != null && var0.equals(var1);
   }

   public static boolean Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(Type var0, Type var1) {
      if (var0 == var1) {
         return true;
      }

      if (var0 instanceof Class) {
         return var0.equals(var1);
      }

      if (var0 instanceof ParameterizedType) {
         if (!(var1 instanceof ParameterizedType)) {
            return false;
         }

         ParameterizedType var6 = (ParameterizedType)var0;
         ParameterizedType var9 = (ParameterizedType)var1;
         return Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
               (Object)var6.getOwnerType(), (Object)var9.getOwnerType()
            )
            && var6.getRawType().equals(var9.getRawType())
            && Arrays.equals(var6.getActualTypeArguments(), var9.getActualTypeArguments());
      } else if (var0 instanceof GenericArrayType) {
         if (!(var1 instanceof GenericArrayType)) {
            return false;
         }

         GenericArrayType var5 = (GenericArrayType)var0;
         GenericArrayType var8 = (GenericArrayType)var1;
         return Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
            var5.getGenericComponentType(), var8.getGenericComponentType()
         );
      } else if (var0 instanceof WildcardType) {
         if (!(var1 instanceof WildcardType)) {
            return false;
         }

         WildcardType var4 = (WildcardType)var0;
         WildcardType var7 = (WildcardType)var1;
         return Arrays.equals(var4.getUpperBounds(), var7.getUpperBounds()) && Arrays.equals(var4.getLowerBounds(), var7.getLowerBounds());
      } else if (var0 instanceof TypeVariable) {
         if (!(var1 instanceof TypeVariable)) {
            return false;
         }

         TypeVariable var2 = (TypeVariable)var0;
         TypeVariable var3 = (TypeVariable)var1;
         return var2.getGenericDeclaration() == var3.getGenericDeclaration() && var2.getName().equals(var3.getName());
      } else {
         return false;
      }
   }

   static int Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(Object var0) {
      return var0 != null ? var0.hashCode() : 0;
   }

   public static String QcHYSL1fJpPwS8I6lDMqHeG0PpI9KENOilkz5Zn7Mesbj9VY4zckGxbjAEO8XHoUDZ8CippSgxILNeARjCg07BQVJdCIm7SIrBC0(Type var0) {
      return var0 instanceof Class ? ((Class)var0).getName() : var0.toString();
   }

   static Type Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(Type var0, Class var1, Class var2) {
      if (var2 == var1) {
         return var0;
      }

      if (var2.isInterface()) {
         Class[] var3 = var1.getInterfaces();
         int var4 = 0;

         for (int var5 = var3.length; var4 < var5; var4++) {
            if (var3[var4] == var2) {
               return var1.getGenericInterfaces()[var4];
            }

            if (var2.isAssignableFrom(var3[var4])) {
               return Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                  var1.getGenericInterfaces()[var4], var3[var4], var2
               );
            }
         }
      }

      if (!var1.isInterface()) {
         while (var1 != Object.class) {
            Class var6 = var1.getSuperclass();
            if (var6 == var2) {
               return var1.getGenericSuperclass();
            }

            if (var2.isAssignableFrom(var6)) {
               return Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
                  var1.getGenericSuperclass(), var6, var2
               );
            }

            var1 = var6;
         }
      }

      return var2;
   }

   static Type BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(Type var0, Class var1, Class var2) {
      if (var0 instanceof WildcardType) {
         var0 = ((WildcardType)var0).getUpperBounds()[0];
      }

      Xn1geDAY7a5uhS0abBLl94FsGYb6NwbYPkpDe8KgAH2GTmN8jQtQksXRYtjayIMujK3Yrf6WJpclcS3a0uvPszzCylhP8dnIAxtE.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
         var2.isAssignableFrom(var1)
      );
      return Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
         var0, var1, Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var0, var1, var2)
      );
   }

   public static Type kpjeuvirVi401rGj4cseffd4WxtSSMZm3fFgpSU28wbJZ50n48BdWMQa6TLB5qajxzarOlQ9OP0uFpV2DZPAvWuKoICgD6I2s6EQ(Type var0) {
      return var0 instanceof GenericArrayType ? ((GenericArrayType)var0).getGenericComponentType() : ((Class)var0).getComponentType();
   }

   public static Type Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(Type var0, Class var1) {
      Type var2 = BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(var0, var1, Collection.class);
      if (var2 instanceof WildcardType) {
         var2 = ((WildcardType)var2).getUpperBounds()[0];
      }

      return var2 instanceof ParameterizedType ? ((ParameterizedType)var2).getActualTypeArguments()[0] : Object.class;
   }

   public static Type[] BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(Type var0, Class var1) {
      if (var0 == Properties.class) {
         return new Type[]{String.class, String.class};
      } else {
         Type var2 = BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(var0, var1, Map.class);
         if (var2 instanceof ParameterizedType) {
            ParameterizedType var3 = (ParameterizedType)var2;
            return var3.getActualTypeArguments();
         } else {
            return new Type[]{Object.class, Object.class};
         }
      }
   }

   public static Type Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(Type var0, Class var1, Type var2) {
      return Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var0, var1, var2, new HashSet());
   }

   private static Type Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
      Type var0, Class var1, Type var2, Collection var3
   ) {
      while (var2 instanceof TypeVariable) {
         TypeVariable var15 = (TypeVariable)var2;
         if (var3.contains(var15)) {
            return var2;
         }

         var3.add(var15);
         var2 = Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var0, var1, var15);
         if (var2 == var15) {
            return var2;
         }
      }

      if (var2 instanceof Class && ((Class)var2).isArray()) {
         Class var14 = (Class)var2;
         Class var18 = var14.getComponentType();
         Type var21 = Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var0, var1, var18, var3);
         return var18 == var21 ? var14 : Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var21);
      }

      if (var2 instanceof GenericArrayType) {
         GenericArrayType var13 = (GenericArrayType)var2;
         Type var17 = var13.getGenericComponentType();
         Type var20 = Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var0, var1, var17, var3);
         return var17 == var20 ? var13 : Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var20);
      }

      if (var2 instanceof ParameterizedType) {
         ParameterizedType var12 = (ParameterizedType)var2;
         Type var16 = var12.getOwnerType();
         Type var19 = Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var0, var1, var16, var3);
         boolean var23 = var19 != var16;
         Type[] var8 = var12.getActualTypeArguments();
         int var9 = 0;

         for (int var10 = var8.length; var9 < var10; var9++) {
            Type var11 = Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var0, var1, var8[var9], var3);
            if (var11 != var8[var9]) {
               if (!var23) {
                  var8 = (Type[])var8.clone();
                  var23 = true;
               }

               var8[var9] = var11;
            }
         }

         return var23
            ? Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var19, var12.getRawType(), var8)
            : var12;
      } else if (var2 instanceof WildcardType) {
         WildcardType var4 = (WildcardType)var2;
         Type[] var5 = var4.getLowerBounds();
         Type[] var6 = var4.getUpperBounds();
         if (var5.length == 1) {
            Type var7 = Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var0, var1, var5[0], var3);
            if (var7 != var5[0]) {
               return vjMnoQVt4KJAEVp97lU0HwLdy7vI4r5MxmeNwfyffktlSR8NdvLwWLz0si8lv3Mt2ZhfNkL73F1wQaifmFL7M5A4n7UNhBMXtDb5(var7);
            }
         } else if (var6.length == 1) {
            Type var22 = Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var0, var1, var6[0], var3);
            if (var22 != var6[0]) {
               return BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(var22);
            }
         }

         return var4;
      } else {
         return var2;
      }
   }

   static Type Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(Type var0, Class var1, TypeVariable var2) {
      Class var3 = Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var2);
      if (var3 == null) {
         return var2;
      } else {
         Type var4 = Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var0, var1, var3);
         if (var4 instanceof ParameterizedType) {
            int var5 = Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(var3.getTypeParameters(), var2);
            return ((ParameterizedType)var4).getActualTypeArguments()[var5];
         } else {
            return var2;
         }
      }
   }

   private static int Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(Object[] var0, Object var1) {
      int var2 = 0;

      for (int var3 = var0.length; var2 < var3; var2++) {
         if (var1.equals(var0[var2])) {
            return var2;
         }
      }

      throw new NoSuchElementException();
   }

   private static Class Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(TypeVariable var0) {
      GenericDeclaration var1 = var0.getGenericDeclaration();
      return var1 instanceof Class ? (Class)var1 : null;
   }

   static void y2krNqENIwvcAQpC7aEZZ39q1S0nt5TPQuQs5bZxt0oeE16df8TYXqOZWIMyXeuEAGix695aR2FH6YmGaAGEtKDfXbNRd8Gf2KuY(Type var0) {
      Xn1geDAY7a5uhS0abBLl94FsGYb6NwbYPkpDe8KgAH2GTmN8jQtQksXRYtjayIMujK3Yrf6WJpclcS3a0uvPszzCylhP8dnIAxtE.Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(
         !(var0 instanceof Class) || !((Class)var0).isPrimitive()
      );
   }
}
