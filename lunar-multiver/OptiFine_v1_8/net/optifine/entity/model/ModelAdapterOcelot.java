package net.optifine.entity.model;

import java.util.HashMap;
import java.util.Map;
import net.optifine.reflect.Reflector;

public class ModelAdapterOcelot extends ModelAdapter {
   private static Map<String, Integer> mapPartFields = null;

   public ModelAdapterOcelot() {
      super(ts.class, "ocelot", 0.4F);
   }

   @Override
   public bbo makeModel() {
      return new bbp();
   }

   @Override
   public bct getModelRenderer(bbo model, String modelPart) {
      if (!(model instanceof bbp)) {
         return null;
      } else {
         bbp modelOcelot = (bbp)model;
         Map<String, Integer> mapParts = getMapPartFields();
         if (mapParts.containsKey(modelPart)) {
            int index = mapParts.get(modelPart);
            return (bct)Reflector.getFieldValue(modelOcelot, Reflector.ModelOcelot_ModelRenderers, index);
         } else {
            return null;
         }
      }
   }

   @Override
   public String[] getModelRendererNames() {
      return new String[]{"back_left_leg", "back_right_leg", "front_left_leg", "front_right_leg", "tail", "tail2", "head", "body"};
   }

   private static Map<String, Integer> getMapPartFields() {
      if (mapPartFields != null) {
         return mapPartFields;
      }

      mapPartFields = new HashMap<>();
      mapPartFields.put("back_left_leg", 0);
      mapPartFields.put("back_right_leg", 1);
      mapPartFields.put("front_left_leg", 2);
      mapPartFields.put("front_right_leg", 3);
      mapPartFields.put("tail", 4);
      mapPartFields.put("tail2", 5);
      mapPartFields.put("head", 6);
      mapPartFields.put("body", 7);
      return mapPartFields;
   }

   @Override
   public IEntityRenderer makeEntityRender(bbo modelBase, float shadowSize) {
      biu renderManager = ave.A().af();
      return new bjq(renderManager, modelBase, shadowSize);
   }
}
