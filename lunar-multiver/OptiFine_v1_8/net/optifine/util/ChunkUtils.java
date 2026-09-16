package net.optifine.util;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import net.optifine.reflect.Reflector;
import net.optifine.reflect.ReflectorClass;
import net.optifine.reflect.ReflectorField;

public class ChunkUtils {
   private static ReflectorClass chunkClass = new ReflectorClass(amy.class);
   private static ReflectorField fieldHasEntities = findFieldHasEntities();
   private static ReflectorField fieldPrecipitationHeightMap = new ReflectorField(chunkClass, int[].class, 0);

   public static boolean hasEntities(amy chunk) {
      return Reflector.getFieldValueBoolean(chunk, fieldHasEntities, true);
   }

   public static int getPrecipitationHeight(amy chunk, cj pos) {
      int[] precipitationHeightMap = (int[])Reflector.getFieldValue(chunk, fieldPrecipitationHeightMap);
      if (precipitationHeightMap != null && precipitationHeightMap.length == 256) {
         int cx = pos.n() & 15;
         int cz = pos.p() & 15;
         int ix = cx | cz << 4;
         int y = precipitationHeightMap[ix];
         if (y >= 0) {
            return y;
         }

         cj posPrep = chunk.h(pos);
         return posPrep.o();
      } else {
         return -1;
      }
   }

   private static ReflectorField findFieldHasEntities() {
      try {
         amy chunk = new amy(null, 0, 0);
         List listBoolFields = new ArrayList();
         List listBoolValuesPre = new ArrayList();
         Field[] fields = amy.class.getDeclaredFields();

         for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            if (field.getType() == boolean.class) {
               field.setAccessible(true);
               listBoolFields.add(field);
               listBoolValuesPre.add(field.get(chunk));
            }
         }

         chunk.g(false);
         List listBoolValuesFalse = new ArrayList();

         for (Field field : listBoolFields) {
            listBoolValuesFalse.add(field.get(chunk));
         }

         chunk.g(true);
         List listBoolValuesTrue = new ArrayList();

         for (Field field : listBoolFields) {
            listBoolValuesTrue.add(field.get(chunk));
         }

         List listMatchingFields = new ArrayList();

         for (int i = 0; i < listBoolFields.size(); i++) {
            Field field = (Field)listBoolFields.get(i);
            Boolean valFalse = (Boolean)listBoolValuesFalse.get(i);
            Boolean valTrue = (Boolean)listBoolValuesTrue.get(i);
            if (!valFalse && valTrue) {
               listMatchingFields.add(field);
               Boolean valPre = (Boolean)listBoolValuesPre.get(i);
               field.set(chunk, valPre);
            }
         }

         if (listMatchingFields.size() == 1) {
            Field field = (Field)listMatchingFields.get(0);
            return new ReflectorField(field);
         }
      } catch (Exception e) {
         Config.warn(e.getClass().getName() + " " + e.getMessage());
      }

      Config.warn("Error finding Chunk.hasEntities");
      return new ReflectorField(new ReflectorClass(amy.class), "hasEntities");
   }
}
