package net.optifine.entity.model;

public class ModelAdapterPigZombie extends ModelAdapterBiped {
   public ModelAdapterPigZombie() {
      super(vw.class, "zombie_pigman", 0.5F);
   }

   @Override
   public bbo makeModel() {
      return new bcn();
   }

   @Override
   public IEntityRenderer makeEntityRender(bbo modelBase, float shadowSize) {
      biu renderManager = ave.A().af();
      bjt render = new bjt(renderManager);
      biv.setModelBipedMain(render, (bbj)modelBase);
      render.f = modelBase;
      render.c = shadowSize;
      return render;
   }
}
