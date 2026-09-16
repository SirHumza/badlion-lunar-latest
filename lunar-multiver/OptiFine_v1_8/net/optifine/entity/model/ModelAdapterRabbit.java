package net.optifine.entity.model;

import java.util.HashMap;
import java.util.Map;
import net.optifine.reflect.Reflector;

public class ModelAdapterRabbit extends ModelAdapter {
   private static Map<String, Integer> mapPartFields = null;

   public ModelAdapterRabbit() {
      super(tu.class, "rabbit", 0.3F);
   }

   @Override
   public bbo makeModel() {
      return new bbu();
   }

   @Override
   public bct getModelRenderer(bbo model, String modelPart) {
      if (!(model instanceof bbu)) {
         return null;
      } else {
         bbu modelRabbit = (bbu)model;
         Map<String, Integer> mapParts = getMapPartFields();
         if (mapParts.containsKey(modelPart)) {
            int index = mapParts.get(modelPart);
            return (bct)Reflector.getFieldValue(modelRabbit, Reflector.ModelRabbit_renderers, index);
         } else {
            return null;
         }
      }
   }

   @Override
   public String[] getModelRendererNames() {
      return new String[]{
         "left_foot", "right_foot", "left_thigh", "right_thigh", "body", "left_arm", "right_arm", "head", "right_ear", "left_ear", "tail", "nose"
      };
   }

   private static Map<String, Integer> getMapPartFields() {
      if (mapPartFields != null) {
         return mapPartFields;
      }

      mapPartFields = new HashMap<>();
      mapPartFields.put("left_foot", 0);
      mapPartFields.put("right_foot", 1);
      mapPartFields.put("left_thigh", 2);
      mapPartFields.put("right_thigh", 3);
      mapPartFields.put("body", 4);
      mapPartFields.put("left_arm", 5);
      mapPartFields.put("right_arm", 6);
      mapPartFields.put("head", 7);
      mapPartFields.put("right_ear", 8);
      mapPartFields.put("left_ear", 9);
      mapPartFields.put("tail", 10);
      mapPartFields.put("nose", 11);
      return mapPartFields;
   }

   @Override
   public IEntityRenderer makeEntityRender(bbo modelBase, float shadowSize) {
      biu renderManager = ave.A().af();
      return new bju(renderManager, modelBase, shadowSize);
   }
}
