package net.optifine.entity.model;

import net.optifine.reflect.Reflector;

public class ModelAdapterBlaze extends ModelAdapter {
   public ModelAdapterBlaze() {
      super(vl.class, "blaze", 0.5F);
   }

   @Override
   public bbo makeModel() {
      return new baw();
   }

   @Override
   public bct getModelRenderer(bbo model, String modelPart) {
      if (!(model instanceof baw)) {
         return null;
      }

      baw modelBlaze = (baw)model;
      if (modelPart.equals("head")) {
         return (bct)Reflector.getFieldValue(modelBlaze, Reflector.ModelBlaze_blazeHead);
      }

      String PREFIX_STICK = "stick";
      if (modelPart.startsWith(PREFIX_STICK)) {
         bct[] sticks = (bct[])Reflector.getFieldValue(modelBlaze, Reflector.ModelBlaze_blazeSticks);
         if (sticks == null) {
            return null;
         }

         String numStr = modelPart.substring(PREFIX_STICK.length());
         int index = Config.parseInt(numStr, -1);
         index--;
         return index >= 0 && index < sticks.length ? sticks[index] : null;
      } else {
         return null;
      }
   }

   @Override
   public String[] getModelRendererNames() {
      return new String[]{"head", "stick1", "stick2", "stick3", "stick4", "stick5", "stick6", "stick7", "stick8", "stick9", "stick10", "stick11", "stick12"};
   }

   @Override
   public IEntityRenderer makeEntityRender(bbo modelBase, float shadowSize) {
      biu renderManager = ave.A().af();
      bij render = new bij(renderManager);
      render.f = modelBase;
      render.c = shadowSize;
      return render;
   }
}
