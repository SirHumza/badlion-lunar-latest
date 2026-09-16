package net.optifine.entity.model;

import net.optifine.reflect.Reflector;

public class ModelAdapterGhast extends ModelAdapter {
   public ModelAdapterGhast() {
      super(vr.class, "ghast", 0.5F);
   }

   @Override
   public bbo makeModel() {
      return new bbf();
   }

   @Override
   public bct getModelRenderer(bbo model, String modelPart) {
      if (!(model instanceof bbf)) {
         return null;
      }

      bbf modelGhast = (bbf)model;
      if (modelPart.equals("body")) {
         return (bct)Reflector.getFieldValue(modelGhast, Reflector.ModelGhast_body);
      }

      String PREFIX_TENTACLE = "tentacle";
      if (modelPart.startsWith(PREFIX_TENTACLE)) {
         bct[] tentacles = (bct[])Reflector.getFieldValue(modelGhast, Reflector.ModelGhast_tentacles);
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
      return new String[]{"body", "tentacle1", "tentacle2", "tentacle3", "tentacle4", "tentacle5", "tentacle6", "tentacle7", "tentacle8", "tentacle9"};
   }

   @Override
   public IEntityRenderer makeEntityRender(bbo modelBase, float shadowSize) {
      biu renderManager = ave.A().af();
      bja render = new bja(renderManager);
      render.f = modelBase;
      render.c = shadowSize;
      return render;
   }
}
