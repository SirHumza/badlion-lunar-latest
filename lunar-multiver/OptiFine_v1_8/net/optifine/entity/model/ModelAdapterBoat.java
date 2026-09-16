package net.optifine.entity.model;

import net.optifine.reflect.Reflector;

public class ModelAdapterBoat extends ModelAdapter {
   public ModelAdapterBoat() {
      super(ux.class, "boat", 0.5F);
   }

   @Override
   public bbo makeModel() {
      return new bax();
   }

   @Override
   public bct getModelRenderer(bbo model, String modelPart) {
      if (!(model instanceof bax)) {
         return null;
      } else {
         bax modelBoat = (bax)model;
         if (modelPart.equals("bottom")) {
            return modelBoat.a[0];
         } else if (modelPart.equals("back")) {
            return modelBoat.a[1];
         } else if (modelPart.equals("front")) {
            return modelBoat.a[2];
         } else if (modelPart.equals("right")) {
            return modelBoat.a[3];
         } else {
            return modelPart.equals("left") ? modelBoat.a[4] : null;
         }
      }
   }

   @Override
   public String[] getModelRendererNames() {
      return new String[]{"bottom", "back", "front", "right", "left"};
   }

   @Override
   public IEntityRenderer makeEntityRender(bbo modelBase, float shadowSize) {
      biu renderManager = ave.A().af();
      bik render = new bik(renderManager);
      if (!Reflector.RenderBoat_modelBoat.exists()) {
         Config.warn("Field not found: RenderBoat.modelBoat");
         return null;
      } else {
         Reflector.setFieldValue(render, Reflector.RenderBoat_modelBoat, modelBase);
         render.c = shadowSize;
         return render;
      }
   }
}
