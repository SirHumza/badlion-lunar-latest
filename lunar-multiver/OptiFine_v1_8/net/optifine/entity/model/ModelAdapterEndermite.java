package net.optifine.entity.model;

import net.optifine.reflect.Reflector;

public class ModelAdapterEndermite extends ModelAdapter {
   public ModelAdapterEndermite() {
      super(vp.class, "endermite", 0.3F);
   }

   @Override
   public bbo makeModel() {
      return new bbe();
   }

   @Override
   public bct getModelRenderer(bbo model, String modelPart) {
      if (!(model instanceof bbe)) {
         return null;
      }

      bbe modelEnderMite = (bbe)model;
      String PREFIX_BODY = "body";
      if (modelPart.startsWith(PREFIX_BODY)) {
         bct[] bodyParts = (bct[])Reflector.getFieldValue(modelEnderMite, Reflector.ModelEnderMite_bodyParts);
         if (bodyParts == null) {
            return null;
         }

         String numStr = modelPart.substring(PREFIX_BODY.length());
         int index = Config.parseInt(numStr, -1);
         index--;
         return index >= 0 && index < bodyParts.length ? bodyParts[index] : null;
      } else {
         return null;
      }
   }

   @Override
   public String[] getModelRendererNames() {
      return new String[]{"body1", "body2", "body3", "body4"};
   }

   @Override
   public IEntityRenderer makeEntityRender(bbo modelBase, float shadowSize) {
      biu renderManager = ave.A().af();
      bit render = new bit(renderManager);
      render.f = modelBase;
      render.c = shadowSize;
      return render;
   }
}
