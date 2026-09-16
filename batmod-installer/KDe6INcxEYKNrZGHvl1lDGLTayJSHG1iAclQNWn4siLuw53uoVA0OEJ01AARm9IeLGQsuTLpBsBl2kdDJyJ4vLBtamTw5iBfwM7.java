import java.lang.reflect.Type;

public final class KDe6INcxEYKNrZGHvl1lDGLTayJSHG1iAclQNWn4siLuw53uoVA0OEJ01AARm9IeLGQsuTLpBsBl2kdDJyJ4vLBtamTw5iBfwM7 {
   private KDe6INcxEYKNrZGHvl1lDGLTayJSHG1iAclQNWn4siLuw53uoVA0OEJ01AARm9IeLGQsuTLpBsBl2kdDJyJ4vLBtamTw5iBfwM7() {
   }

   public static boolean Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(Type var0) {
      return var0 instanceof Class && ((Class)var0).isPrimitive();
   }

   public static boolean BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(Type var0) {
      return var0 == Integer.class
         || var0 == Float.class
         || var0 == Byte.class
         || var0 == Double.class
         || var0 == Long.class
         || var0 == Character.class
         || var0 == Boolean.class
         || var0 == Short.class
         || var0 == Void.class;
   }

   public static Class Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(Class var0) {
      if (var0 == int.class) {
         return Integer.class;
      } else if (var0 == float.class) {
         return Float.class;
      } else if (var0 == byte.class) {
         return Byte.class;
      } else if (var0 == double.class) {
         return Double.class;
      } else if (var0 == long.class) {
         return Long.class;
      } else if (var0 == char.class) {
         return Character.class;
      } else if (var0 == boolean.class) {
         return Boolean.class;
      } else if (var0 == short.class) {
         return Short.class;
      } else {
         return var0 == void.class ? Void.class : var0;
      }
   }

   public static Class BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(Class var0) {
      if (var0 == Integer.class) {
         return int.class;
      } else if (var0 == Float.class) {
         return float.class;
      } else if (var0 == Byte.class) {
         return byte.class;
      } else if (var0 == Double.class) {
         return double.class;
      } else if (var0 == Long.class) {
         return long.class;
      } else if (var0 == Character.class) {
         return char.class;
      } else if (var0 == Boolean.class) {
         return boolean.class;
      } else if (var0 == Short.class) {
         return short.class;
      } else {
         return var0 == Void.class ? void.class : var0;
      }
   }
}
