package net.optifine.entity.model;

import net.optifine.reflect.Reflector;

public class ModelAdapterDragon extends ModelAdapter {
   public ModelAdapterDragon() {
      super(ug.class, "dragon", 0.5F);
   }

   @Override
   public bbo makeModel() {
      return new bco(0.0F);
   }

   @Override
   public bct getModelRenderer(bbo model, String modelPart) {
      if (!(model instanceof bco)) {
         return null;
      } else {
         bco modelDragon = (bco)model;
         if (modelPart.equals("head")) {
            return (bct)Reflector.getFieldValue(modelDragon, Reflector.ModelDragon_ModelRenderers, 0);
         } else if (modelPart.equals("spine")) {
            return (bct)Reflector.getFieldValue(modelDragon, Reflector.ModelDragon_ModelRenderers, 1);
         } else if (modelPart.equals("jaw")) {
            return (bct)Reflector.getFieldValue(modelDragon, Reflector.ModelDragon_ModelRenderers, 2);
         } else if (modelPart.equals("body")) {
            return (bct)Reflector.getFieldValue(modelDragon, Reflector.ModelDragon_ModelRenderers, 3);
         } else if (modelPart.equals("rear_leg")) {
            return (bct)Reflector.getFieldValue(modelDragon, Reflector.ModelDragon_ModelRenderers, 4);
         } else if (modelPart.equals("front_leg")) {
            return (bct)Reflector.getFieldValue(modelDragon, Reflector.ModelDragon_ModelRenderers, 5);
         } else if (modelPart.equals("rear_leg_tip")) {
            return (bct)Reflector.getFieldValue(modelDragon, Reflector.ModelDragon_ModelRenderers, 6);
         } else if (modelPart.equals("front_leg_tip")) {
            return (bct)Reflector.getFieldValue(modelDragon, Reflector.ModelDragon_ModelRenderers, 7);
         } else if (modelPart.equals("rear_foot")) {
            return (bct)Reflector.getFieldValue(modelDragon, Reflector.ModelDragon_ModelRenderers, 8);
         } else if (modelPart.equals("front_foot")) {
            return (bct)Reflector.getFieldValue(modelDragon, Reflector.ModelDragon_ModelRenderers, 9);
         } else if (modelPart.equals("wing")) {
            return (bct)Reflector.getFieldValue(modelDragon, Reflector.ModelDragon_ModelRenderers, 10);
         } else {
            return modelPart.equals("wing_tip") ? (bct)Reflector.getFieldValue(modelDragon, Reflector.ModelDragon_ModelRenderers, 11) : null;
         }
      }
   }

   @Override
   public String[] getModelRendererNames() {
      return new String[]{
         "head", "spine", "jaw", "body", "rear_leg", "front_leg", "rear_leg_tip", "front_leg_tip", "rear_foot", "front_foot", "wing", "wing_tip"
      };
   }

   @Override
   public IEntityRenderer makeEntityRender(bbo modelBase, float shadowSize) {
      biu renderManager = ave.A().af();
      bir render = new bir(renderManager);
      render.f = modelBase;
      render.c = shadowSize;
      return render;
   }
}
