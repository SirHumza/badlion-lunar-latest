package net.optifine.entity.model;

import net.optifine.reflect.Reflector;

public class ModelAdapterSlime extends ModelAdapter {
   public ModelAdapterSlime() {
      super(wb.class, "slime", 0.25F);
   }

   @Override
   public bbo makeModel() {
      return new bcc(16);
   }

   @Override
   public bct getModelRenderer(bbo model, String modelPart) {
      if (!(model instanceof bcc)) {
         return null;
      } else {
         bcc modelSlime = (bcc)model;
         if (modelPart.equals("body")) {
            return (bct)Reflector.getFieldValue(modelSlime, Reflector.ModelSlime_ModelRenderers, 0);
         } else if (modelPart.equals("left_eye")) {
            return (bct)Reflector.getFieldValue(modelSlime, Reflector.ModelSlime_ModelRenderers, 1);
         } else if (modelPart.equals("right_eye")) {
            return (bct)Reflector.getFieldValue(modelSlime, Reflector.ModelSlime_ModelRenderers, 2);
         } else {
            return modelPart.equals("mouth") ? (bct)Reflector.getFieldValue(modelSlime, Reflector.ModelSlime_ModelRenderers, 3) : null;
         }
      }
   }

   @Override
   public String[] getModelRendererNames() {
      return new String[]{"body", "left_eye", "right_eye", "mouth"};
   }

   @Override
   public IEntityRenderer makeEntityRender(bbo modelBase, float shadowSize) {
      biu renderManager = ave.A().af();
      return new bjy(renderManager, modelBase, shadowSize);
   }
}
