package net.optifine.entity.model;

import net.optifine.reflect.Reflector;

public class ModelAdapterWolf extends ModelAdapter {
   public ModelAdapterWolf() {
      super(ua.class, "wolf", 0.5F);
   }

   @Override
   public bbo makeModel() {
      return new bcm();
   }

   @Override
   public bct getModelRenderer(bbo model, String modelPart) {
      if (!(model instanceof bcm)) {
         return null;
      } else {
         bcm modelWolf = (bcm)model;
         if (modelPart.equals("head")) {
            return modelWolf.a;
         } else if (modelPart.equals("body")) {
            return modelWolf.b;
         } else if (modelPart.equals("leg1")) {
            return modelWolf.c;
         } else if (modelPart.equals("leg2")) {
            return modelWolf.d;
         } else if (modelPart.equals("leg3")) {
            return modelWolf.e;
         } else if (modelPart.equals("leg4")) {
            return modelWolf.f;
         } else if (modelPart.equals("tail")) {
            return (bct)Reflector.getFieldValue(modelWolf, Reflector.ModelWolf_tail);
         } else {
            return modelPart.equals("mane") ? (bct)Reflector.getFieldValue(modelWolf, Reflector.ModelWolf_mane) : null;
         }
      }
   }

   @Override
   public String[] getModelRendererNames() {
      return new String[]{"head", "body", "leg1", "leg2", "leg3", "leg4", "tail", "mane"};
   }

   @Override
   public IEntityRenderer makeEntityRender(bbo modelBase, float shadowSize) {
      biu renderManager = ave.A().af();
      return new bkl(renderManager, modelBase, shadowSize);
   }
}
