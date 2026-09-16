package net.optifine.entity.model;

import net.optifine.reflect.Reflector;

public class ModelAdapterSilverfish extends ModelAdapter {
   public ModelAdapterSilverfish() {
      super(vz.class, "silverfish", 0.3F);
   }

   @Override
   public bbo makeModel() {
      return new bby();
   }

   @Override
   public bct getModelRenderer(bbo model, String modelPart) {
      if (!(model instanceof bby)) {
         return null;
      }

      bby modelSilverfish = (bby)model;
      String PREFIX_BODY = "body";
      if (modelPart.startsWith(PREFIX_BODY)) {
         bct[] bodyParts = (bct[])Reflector.getFieldValue(modelSilverfish, Reflector.ModelSilverfish_bodyParts);
         if (bodyParts == null) {
            return null;
         }

         String numStr = modelPart.substring(PREFIX_BODY.length());
         int index = Config.parseInt(numStr, -1);
         index--;
         return index >= 0 && index < bodyParts.length ? bodyParts[index] : null;
      } else {
         String PREFIX_WINGS = "wing";
         if (modelPart.startsWith(PREFIX_WINGS)) {
            bct[] wings = (bct[])Reflector.getFieldValue(modelSilverfish, Reflector.ModelSilverfish_wingParts);
            if (wings == null) {
               return null;
            }

            String numStr = modelPart.substring(PREFIX_WINGS.length());
            int index = Config.parseInt(numStr, -1);
            index--;
            return index >= 0 && index < wings.length ? wings[index] : null;
         } else {
            return null;
         }
      }
   }

   @Override
   public String[] getModelRendererNames() {
      return new String[]{"body1", "body2", "body3", "body4", "body5", "body6", "body7", "wing1", "wing2", "wing3"};
   }

   @Override
   public IEntityRenderer makeEntityRender(bbo modelBase, float shadowSize) {
      biu renderManager = ave.A().af();
      bjw render = new bjw(renderManager);
      render.f = modelBase;
      render.c = shadowSize;
      return render;
   }
}
