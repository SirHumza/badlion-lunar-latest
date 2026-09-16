package net.optifine.entity.model;

import net.optifine.reflect.Reflector;

public class ModelAdapterSquid extends ModelAdapter {
   public ModelAdapterSquid() {
      super(tx.class, "squid", 0.7F);
   }

   @Override
   public bbo makeModel() {
      return new bcf();
   }

   @Override
   public bct getModelRenderer(bbo model, String modelPart) {
      if (!(model instanceof bcf)) {
         return null;
      }

      bcf modelSquid = (bcf)model;
      if (modelPart.equals("body")) {
         return (bct)Reflector.getFieldValue(modelSquid, Reflector.ModelSquid_body);
      }

      String PREFIX_TENTACLE = "tentacle";
      if (modelPart.startsWith(PREFIX_TENTACLE)) {
         bct[] tentacles = (bct[])Reflector.getFieldValue(modelSquid, Reflector.ModelSquid_tentacles);
         if (tentacles == null) {
            return null;
         }

         String numStr = modelPart.substring(PREFIX_TENTACLE.length());
         int index = Config.parseInt(numStr, -1);
         index--;
         return index >= 0 && index < tentacles.length ? tentacles[index] : null;
      } else {
         return null;
      }
   }

   @Override
   public String[] getModelRendererNames() {
      return new String[]{"body", "tentacle1", "tentacle2", "tentacle3", "tentacle4", "tentacle5", "tentacle6", "tentacle7", "tentacle8"};
   }

   @Override
   public IEntityRenderer makeEntityRender(bbo modelBase, float shadowSize) {
      biu renderManager = ave.A().af();
      return new bkb(renderManager, modelBase, shadowSize);
   }
}
