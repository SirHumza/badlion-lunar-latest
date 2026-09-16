package net.optifine.entity.model;

import net.optifine.reflect.Reflector;

public class ModelAdapterWither extends ModelAdapter {
   public ModelAdapterWither() {
      super(uk.class, "wither", 0.5F);
   }

   @Override
   public bbo makeModel() {
      return new bcl(0.0F);
   }

   @Override
   public bct getModelRenderer(bbo model, String modelPart) {
      if (!(model instanceof bcl)) {
         return null;
      }

      bcl modelWither = (bcl)model;
      String PREFIX_BODY = "body";
      if (modelPart.startsWith(PREFIX_BODY)) {
         bct[] bodyParts = (bct[])Reflector.getFieldValue(modelWither, Reflector.ModelWither_bodyParts);
         if (bodyParts == null) {
            return null;
         }

         String numStr = modelPart.substring(PREFIX_BODY.length());
         int index = Config.parseInt(numStr, -1);
         index--;
         return index >= 0 && index < bodyParts.length ? bodyParts[index] : null;
      } else {
         String PREFIX_HEAD = "head";
         if (modelPart.startsWith(PREFIX_HEAD)) {
            bct[] heads = (bct[])Reflector.getFieldValue(modelWither, Reflector.ModelWither_heads);
            if (heads == null) {
               return null;
            }

            String numStr = modelPart.substring(PREFIX_HEAD.length());
            int index = Config.parseInt(numStr, -1);
            index--;
            return index >= 0 && index < heads.length ? heads[index] : null;
         } else {
            return null;
         }
      }
   }

   @Override
   public String[] getModelRendererNames() {
      return new String[]{"body1", "body2", "body3", "head1", "head2", "head3"};
   }

   @Override
   public IEntityRenderer makeEntityRender(bbo modelBase, float shadowSize) {
      biu renderManager = ave.A().af();
      bkj render = new bkj(renderManager);
      render.f = modelBase;
      render.c = shadowSize;
      return render;
   }
}
