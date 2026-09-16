package net.optifine.entity.model;

public class ModelAdapterZombie extends ModelAdapterBiped {
   public ModelAdapterZombie() {
      super(we.class, "zombie", 0.5F);
   }

   @Override
   public bbo makeModel() {
      return new bcn();
   }

   @Override
   public IEntityRenderer makeEntityRender(bbo modelBase, float shadowSize) {
      biu renderManager = ave.A().af();
      bkm render = new bkm(renderManager);
      biv.setModelBipedMain(render, (bbj)modelBase);
      render.f = modelBase;
      render.c = shadowSize;
      return render;
   }
}
