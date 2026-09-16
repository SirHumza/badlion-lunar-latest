package net.optifine.reflect;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FieldLocatorActionKeyF3 implements IFieldLocator {
   @Override
   public Field getField() {
      Class mcClass = ave.class;
      Field fieldRenderChunksMany = this.getFieldRenderChunksMany();
      if (fieldRenderChunksMany == null) {
         Config.log("(Reflector) Field not present: " + mcClass.getName() + ".actionKeyF3 (field renderChunksMany not found)");
         return null;
      } else {
         Field fieldActionkeyF3 = ReflectorRaw.getFieldAfter(ave.class, fieldRenderChunksMany, boolean.class, 0);
         if (fieldActionkeyF3 == null) {
            Config.log("(Reflector) Field not present: " + mcClass.getName() + ".actionKeyF3");
            return null;
         } else {
            return fieldActionkeyF3;
         }
      }
   }

   private Field getFieldRenderChunksMany() {
      ave mc = ave.A();
      boolean oldRenderChunksMany = mc.G;
      Field[] fields = ave.class.getDeclaredFields();
      mc.G = true;
      Field[] fieldsTrue = ReflectorRaw.getFields(mc, fields, boolean.class, Boolean.TRUE);
      mc.G = false;
      Field[] fieldsFalse = ReflectorRaw.getFields(mc, fields, boolean.class, Boolean.FALSE);
      mc.G = oldRenderChunksMany;
      Set<Field> setTrue = new HashSet<>(Arrays.asList(fieldsTrue));
      Set<Field> setFalse = new HashSet<>(Arrays.asList(fieldsFalse));
      Set<Field> setFields = new HashSet<>(setTrue);
      setFields.retainAll(setFalse);
      Field[] fs = setFields.toArray(new Field[setFields.size()]);
      return fs.length != 1 ? null : fs[0];
   }
}
