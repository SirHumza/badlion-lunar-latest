import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public abstract class v7cT5jwe3CDhSR6PvmTscnh4fKeCoybYJhwbl8BXoZJ3ZQnp4u21FDCwEpcuCkdxkxTivz8JHVObGIt7QwTcoFx1wS7IMhVuTtIZ {
   public abstract Object Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I(Class var1);

   public static v7cT5jwe3CDhSR6PvmTscnh4fKeCoybYJhwbl8BXoZJ3ZQnp4u21FDCwEpcuCkdxkxTivz8JHVObGIt7QwTcoFx1wS7IMhVuTtIZ Vv68OIsnGeRqNfkWrhZ5USpiBlL6J6vQzYtytK46tvCioEQQMZcScI0HTaPI2crSli4YOR7j9Ki8oHHVOSkyhwKiCE22LhzzQg9I() {
      try {
         Class var8 = Class.forName("sun.misc.Unsafe");
         Field var9 = var8.getDeclaredField("theUnsafe");
         var9.setAccessible(true);
         Object var10 = var9.get(null);
         Method var3 = var8.getMethod("allocateInstance", Class.class);
         return new YO7NWhkMEs26GWxR0q5bIKbXkMOQDIYZ8jdKlWNrIFfzPk4j1o1GI2eIIeGJxtdmxUVwcMMMBnevAdYbwuILDpk3CFsgHZHkdyCf(var3, var10);
      } catch (Exception var6) {
         try {
            Method var7 = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
            var7.setAccessible(true);
            int var1 = (Integer)var7.invoke(null, Object.class);
            Method var2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, int.class);
            var2.setAccessible(true);
            return new TvZIMYwqw3yjasBzQ9ZwRvgYZoo4laZ1aQTJrq6NGrdjcTGU2XZVytTR39ogDLPht5kUAdtBEaT5CtVp2vaewHlLBE0MRC5jQ0kJ(var2, var1);
         } catch (Exception var5) {
            try {
               Method var0 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
               var0.setAccessible(true);
               return new QZCLBEZBTLsbLUd3zB2t57lnpOrYe8aAY4AI0gPec3WhEKwDjkRyXpRcPQffnVLEaP1wBversrAEEjPHnXHzoLQHfELg9FELYq6(var0);
            } catch (Exception var4) {
               return new BgLZ5zHeWwcDTctlJHUZWUvZpbHLmQPNlxaXPIa1kwxXEnUcICmIR8C1c8jQNCVQ9WAo9Rdqnn4SoACt8wTd51g6yUFD8qTsI1fb();
            }
         }
      }
   }

   static void BCAr50JktY88bne3gKpPhCi2ojs9Qz9CtuZ5qY1yf6DHnlHQpJN8xerjZR0doZLmrPDpizrnL5MVJWMiFh9rjXh2hU5qvQF1gSfW(Class var0) {
      int var1 = var0.getModifiers();
      if (Modifier.isInterface(var1)) {
         throw new UnsupportedOperationException("Interface can't be instantiated! Interface name: " + var0.getName());
      }

      if (Modifier.isAbstract(var1)) {
         throw new UnsupportedOperationException("Abstract class can't be instantiated! Class name: " + var0.getName());
      }
   }
}
