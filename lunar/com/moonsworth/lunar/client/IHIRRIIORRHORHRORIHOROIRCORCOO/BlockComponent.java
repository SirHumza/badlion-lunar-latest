package com.moonsworth.lunar.client.IHIRRIIORRHORHRORIHOROIRCORCOO;

import com.eliotlash.molang.ast.Expr;
import com.eliotlash.molang.ast.Stmt;
import java.util.ArrayList;
import java.util.function.Consumer;
import lombok.Generated;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Type;

public interface HRCHROOHRIHCRCRHRIIROCIRHOIRHH {
   static HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      Expr var0,
      OCOHORHCROHICRRIHCIHHRRCIHICRI var1,
      RRCRRCORICCHOHHIRCHIROOHIIOHCO var2,
      OOROOCCIRCCRHOIOIORIHCHHOOCCOR var3,
      CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4,
      com.moonsworth.lunar.client.IHIRRIIORRHORHRORIHOROIRCORCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var5
   ) {
      if (var0 instanceof Expr.Constant var25) {
         var5.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            new com.moonsworth.lunar.client.IHIRRIIORRHORHRORIHOROIRCORCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var25.value())
         );
         return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.DOUBLE_PRIM,
            var1x -> var1x.OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(var1xx -> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1xx, var25.value()))
         );
      } else if (var0 instanceof Expr.BinOp var24) {
         var5.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            new com.moonsworth.lunar.client.IHIRRIIORRHORHRORIHOROIRCORCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(var24.operator())
         );
         HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var34 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var24.left(), var1, var2, var3, new CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(), var5
         );
         HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var42 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var24.right(), var1, var2, var3, new CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(), var5
         );
         if (var24.left() instanceof Expr.Str var49 && var24.right() instanceof Expr.Str var54) {
            return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               new Expr.Constant(var24.operator().applyString(var49.val(), var54.val())),
               var1,
               var2,
               var3,
               new CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(),
               var5
            );
         } else {
            return switch (var24.operator()) {
               case ADD -> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.DOUBLE_PRIM, var2x -> {
                  RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var34, var2x, HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.DOUBLE_PRIM);
                  RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var42, var2x, HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.DOUBLE_PRIM);
                  var2x.OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(var0xx -> var0xx.visitInsn(99));
               });
               case SUB -> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.DOUBLE_PRIM, var2x -> {
                  RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var34, var2x, HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.DOUBLE_PRIM);
                  RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var42, var2x, HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.DOUBLE_PRIM);
                  var2x.OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(var0xx -> var0xx.visitInsn(103));
               });
               case MUL -> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.DOUBLE_PRIM, var2x -> {
                  RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var34, var2x, HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.DOUBLE_PRIM);
                  RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var42, var2x, HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.DOUBLE_PRIM);
                  var2x.OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(var0xx -> var0xx.visitInsn(107));
               });
               case DIV -> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.DOUBLE_PRIM, var2x -> {
                  RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var34, var2x, HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.DOUBLE_PRIM);
                  RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var42, var2x, HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.DOUBLE_PRIM);
                  var2x.OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(var0xx -> var0xx.visitInsn(111));
               });
               case MOD -> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.DOUBLE_PRIM, var2x -> {
                  RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var34, var2x, HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.DOUBLE_PRIM);
                  RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var42, var2x, HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.DOUBLE_PRIM);
                  var2x.OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(var0xx -> var0xx.visitInsn(115));
               });
               case POW -> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.DOUBLE_PRIM,
                  var2x -> {
                     RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var34, var2x, HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.DOUBLE_PRIM);
                     RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var42, var2x, HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.DOUBLE_PRIM);
                     var2x.OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(
                        var0xx -> var0xx.visitMethodInsn(
                           184,
                           Type.getInternalName(Math.class),
                           "pow",
                           Type.getMethodDescriptor(Type.DOUBLE_TYPE, new Type[]{Type.DOUBLE_TYPE, Type.DOUBLE_TYPE}),
                           false
                        )
                     );
                  }
               );
               case LT -> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var34, var42, 155, false);
               case LEQ -> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var34, var42, 158, false);
               case GEQ -> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var34, var42, 156, true);
               case GT -> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var34, var42, 157, true);
               case EQ -> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.BOOLEAN,
                  var2x -> {
                     if (var34.HHRIOCOOORRIROHHCHIROIOOCOHRIH() == HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.BOOLEAN
                        && var42.HHRIOCOOORRIROHHCHIROIOOCOHRIH() == HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.BOOLEAN) {
                        RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var34, var2x, HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.BOOLEAN);
                        RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var42, var2x, HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.BOOLEAN);
                        var2x.OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(var0xx -> {
                           Label var1xx = new Label();
                           Label var2xx = new Label();
                           var0xx.visitJumpInsn(160, var2xx);
                           RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0xx, 1);
                           var0xx.visitJumpInsn(167, var1xx);
                           var0xx.visitLabel(var2xx);
                           RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0xx, 0);
                           var0xx.visitLabel(var1xx);
                        });
                     } else {
                        RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var34, var2x, HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.DOUBLE_PRIM);
                        RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var42, var2x, HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.DOUBLE_PRIM);
                        var2x.OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(
                           var0xx -> var0xx.visitMethodInsn(
                              184,
                              Type.getInternalName(CRICCOOHHHCHOORCICOCOHIHOIRHOO.class),
                              "epsilonEquals",
                              Type.getMethodDescriptor(Type.BOOLEAN_TYPE, new Type[]{Type.DOUBLE_TYPE, Type.DOUBLE_TYPE}),
                              false
                           )
                        );
                     }
                  }
               );
               case NEQ -> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.BOOLEAN,
                  var2x -> {
                     if (var34.HHRIOCOOORRIROHHCHIROIOOCOHRIH() == HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.BOOLEAN
                        && var42.HHRIOCOOORRIROHHCHIROIOOCOHRIH() == HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.BOOLEAN) {
                        RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var34, var2x, HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.BOOLEAN);
                        RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var42, var2x, HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.BOOLEAN);
                        var2x.OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(var0xx -> {
                           Label var1xx = new Label();
                           Label var2xx = new Label();
                           var0xx.visitJumpInsn(159, var2xx);
                           RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0xx, 1);
                           var0xx.visitJumpInsn(167, var1xx);
                           var0xx.visitLabel(var2xx);
                           RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0xx, 0);
                           var0xx.visitLabel(var1xx);
                        });
                     } else {
                        RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var34, var2x, HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.DOUBLE_PRIM);
                        RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var42, var2x, HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.DOUBLE_PRIM);
                        var2x.OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(
                           var0xx -> {
                              var0xx.visitMethodInsn(
                                 184,
                                 Type.getInternalName(CRICCOOHHHCHOORCICOCOHIHOIRHOO.class),
                                 "epsilonEquals",
                                 Type.getMethodDescriptor(Type.BOOLEAN_TYPE, new Type[]{Type.DOUBLE_TYPE, Type.DOUBLE_TYPE}),
                                 false
                              );
                              Label var1xx = new Label();
                              Label var2xx = new Label();
                              var0xx.visitJumpInsn(153, var1xx);
                              RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0xx, 0);
                              var0xx.visitJumpInsn(167, var2xx);
                              var0xx.visitLabel(var1xx);
                              RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0xx, 1);
                              var0xx.visitLabel(var2xx);
                           }
                        );
                     }
                  }
               );
               case AND -> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.BOOLEAN, var2x -> {
                  RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var34, var2x, HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.BOOLEAN);
                  Label var3x = new Label();
                  var2x.OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(var1xx -> var1xx.visitJumpInsn(153, var3x));
                  RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var42, var2x, HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.BOOLEAN);
                  var2x.OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(var1xx -> var1xx.visitJumpInsn(153, var3x));
                  var2x.OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(var1xx -> {
                     Label var2xx = new Label();
                     RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1xx, 1);
                     var1xx.visitJumpInsn(167, var2xx);
                     var1xx.visitLabel(var3x);
                     RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1xx, 0);
                     var1xx.visitLabel(var2xx);
                  });
               });
               case OR -> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.BOOLEAN, var2x -> {
                  RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var34, var2x, HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.BOOLEAN);
                  Label var3x = new Label();
                  Label var4x = new Label();
                  var2x.OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(var1xx -> var1xx.visitJumpInsn(154, var3x));
                  RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var42, var2x, HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.BOOLEAN);
                  var2x.OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(var1xx -> var1xx.visitJumpInsn(153, var4x));
                  var2x.OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(var2xx -> {
                     Label var3xx = new Label();
                     var2xx.visitLabel(var3x);
                     RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2xx, 1);
                     var2xx.visitJumpInsn(167, var3xx);
                     var2xx.visitLabel(var4x);
                     RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2xx, 0);
                     var2xx.visitLabel(var3xx);
                  });
               });
            };
         }
      } else if (var0 instanceof Expr.Block var23) {
         var5.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            new com.moonsworth.lunar.client.IHIRRIIORRHORHRORIHOROIRCORCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO()
         );
         ArrayList var33 = new ArrayList();
         Expr var41 = new Expr.Constant(0.0);

         for (Stmt var53 : var23.statements()) {
            if (var53 instanceof Stmt.Return var61) {
               var41 = var61.value();
               break;
            }

            if (var53 == var23.statements().get(var23.statements().size() - 1) && var53 instanceof Stmt.Expression var60) {
               var41 = var60.expr();
               break;
            }

            CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var59 = new CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();
            var33.add(
               com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORCOCORROHIROCCIORORRRRCHIOOCH(
                  CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var53, var1, var2, var3, var59, var5), var53
               )
            );
         }

         HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var48 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var41, var1, var2, var3, new CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(), var5
         );
         var5.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            new com.moonsworth.lunar.client.IHIRRIIORRHORHRORIHOROIRCORCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI()
         );
         return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.DOUBLE_PRIM, var2x -> {
            for (com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO var4x : var33) {
               RCIRROCCCIIHCIHCCRHHCCHOHHHCHH((CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH)var4x.OHICIOOICHICOIOCOROIIOCCHRRCIC, var2x);
            }

            RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var48, var2x, HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.DOUBLE_PRIM);
         });
      } else if (var0 instanceof Expr.Assignment var22) {
         if (var22.variable() instanceof Expr.Access var32) {
            HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var40 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               var22.expression(), var1, var2, var3, new CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(), var5
            );
            if (var32.target() instanceof Expr.Variable var46) {
               IIHRRHORCRCROCHHOHORCHCROCIHRO var58 = var2.HCICHICRRHORRORIRRRIHOROCOOIHO(CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var32));
               if (var58 == null && !var3.HHROHOHOHHHHIIHHIHHHCCOOCCCRCH()) {
                  var5.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                     new com.moonsworth.lunar.client.IHIRRIIORRHORHRORIHOROIRCORCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(1)
                  );
                  int var65 = var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var32, true);
                  return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.DOUBLE_PRIM, var2x -> {
                     RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var40, var2x, HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.DOUBLE_PRIM);
                     var2x.OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(var1xx -> {
                        var1xx.visitInsn(92);
                        var1xx.visitVarInsn(57, var65);
                     });
                  });
               } else {
                  var5.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                     new com.moonsworth.lunar.client.IHIRRIIORRHORHRORIHOROIRCORCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(0)
                  );
                  IIHRRHORCRCROCHHOHORCHCROCIHRO var64 = var2.CCOCRIRCHICIROOHCCHCRCHHOCRRIO(
                     CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var32)
                  );
                  return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                     HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.DOUBLE_PRIM,
                     var2x -> {
                        RCIRROCCCIIHCIHCCRHHCCHOHHHCHH((Object)var64, var2x);
                        RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var40, var2x, HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.DOUBLE_PRIM);
                        var2x.OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(var0xx -> var0xx.visitInsn(93));
                        var2x.OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(
                           var0xx -> var0xx.visitFieldInsn(
                              181, Type.getInternalName(IIHRRHORCRCROCHHOHORCHCROCIHRO.class), "value", Type.DOUBLE_TYPE.getDescriptor()
                           )
                        );
                     }
                  );
               }
            } else {
               if (var32.target() instanceof Expr.Struct var52) {
                  ;
               }

               throw new RuntimeException("Unexpected assignment to non variable/struct.");
            }
         } else {
            throw new IllegalStateException("Asigning to non variable!");
         }
      } else {
         if (var0 instanceof Expr.Access var6) {
            if (var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var6)) {
               var5.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  new com.moonsworth.lunar.client.IHIRRIIORRHORHRORIHOROIRCORCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(1)
               );
               int var31 = var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var6, true);
               return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.DOUBLE_PRIM,
                  var1x -> var1x.OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(var1xx -> var1xx.visitVarInsn(24, var31))
               );
            }

            if (var6.target() instanceof Expr.Variable var30) {
               String var38 = CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var6);
               IIHRRHORCRCROCHHOHORCHCROCIHRO var45 = var2.HCICHICRRHORRORIRRRIHOROCOOIHO(var38);
               if (var45 == null && var3.HHROHOHOHHHHIIHHIHHHCCOOCCCRCH()) {
                  var45 = new IIHRRHORCRCROCHHOHORCHCROCIHRO();
                  var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var38, var45);
               }

               if (var45 != null) {
                  var5.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                     new com.moonsworth.lunar.client.IHIRRIIORRHORHRORIHOROIRCORCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(2)
                  );
                  IIHRRHORCRCROCHHOHORCHCROCIHRO var51 = var45;
                  return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                     HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.DOUBLE_PRIM,
                     var1x -> {
                        RCIRROCCCIIHCIHCCRHHCCHOHHHCHH((Object)var51, var1x);
                        var1x.OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(
                           var0xx -> var0xx.visitFieldInsn(
                              180, Type.getInternalName(IIHRRHORCRCROCHHOHORCHCROCIHRO.class), "value", Type.DOUBLE_TYPE.getDescriptor()
                           )
                        );
                     }
                  );
               }

               throw new RuntimeException("Not found: " + var38);
            }
         }

         if (var0 instanceof Expr.Variable var21) {
            String var29 = CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var21);
            IIHRRHORCRCROCHHOHORCHCROCIHRO var37 = var2.HCICHICRRHORRORIRRRIHOROCOOIHO(var29);
            if (var37 == null && var3.HHROHOHOHHHHIIHHIHHHCCOOCCCRCH()) {
               var37 = new IIHRRHORCRCROCHHOHORCHCROCIHRO();
               var2.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var29, var37);
            }

            if (var37 != null) {
               var5.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  new com.moonsworth.lunar.client.IHIRRIIORRHORHRORIHOROIRCORCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRRCCOICORICIHCHRHIHIHROIRHOCR()
               );
               IIHRRHORCRCROCHHOHORCHCROCIHRO var44 = var37;
               return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.DOUBLE_PRIM,
                  var1x -> {
                     RCIRROCCCIIHCIHCCRHHCCHOHHHCHH((Object)var44, var1x);
                     var1x.OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(
                        var0xx -> var0xx.visitFieldInsn(
                           180, Type.getInternalName(IIHRRHORCRCROCHHOHORCHCROCIHRO.class), "value", Type.DOUBLE_TYPE.getDescriptor()
                        )
                     );
                  }
               );
            } else {
               throw new RuntimeException("Not found: " + var29);
            }
         } else if (!(var0 instanceof Expr.Call var14)) {
            if (var0 instanceof Expr.Negate var20) {
               var5.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  new com.moonsworth.lunar.client.IHIRRIIORRHORHRORIHOROIRCORCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CIOHHCORHRCCRICCCORIHCRHCCCRRR()
               );
               HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var28 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  var20.value(), var1, var2, var3, new CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(), var5
               );
               return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.DOUBLE_PRIM, var1x -> {
                  RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var28, var1x, HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.DOUBLE_PRIM);
                  var1x.OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(var0xx -> var0xx.visitInsn(119));
               });
            } else if (var0 instanceof Expr.Group var19) {
               var5.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  new com.moonsworth.lunar.client.IHIRRIIORRHORHRORIHOROIRCORCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI()
               );
               return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var19.value(), var1, var2, var3, new CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(), var5);
            } else if (var0 instanceof Expr.Ternary var18) {
               var5.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  new com.moonsworth.lunar.client.IHIRRIIORRHORHRORIHOROIRCORCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO()
               );
               HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var27 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  var18.condition(), var1, var2, var3, new CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(), var5
               );
               HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var36 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  var18.ifFalse(), var1, var2, var3, new CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(), var5
               );
               HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var43 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  var18.ifTrue(), var1, var2, var3, new CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(), var5
               );
               HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var50 = HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.DOUBLE_OBJ;
               if (var36.HHRIOCOOORRIROHHCHIROIOOCOHRIH() == HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.BOOLEAN
                  && var43.HHRIOCOOORRIROHHCHIROIOOCOHRIH() == HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.BOOLEAN) {
                  var50 = HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.BOOLEAN;
               }

               if (var36.HHRIOCOOORRIROHHCHIROIOOCOHRIH() == HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.DOUBLE_PRIM
                  && var43.HHRIOCOOORRIROHHCHIROIOOCOHRIH() == HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.DOUBLE_PRIM) {
                  var50 = HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.DOUBLE_PRIM;
               }

               HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var55 = var50;
               return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var50, var4x -> {
                  RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var27, var4x, HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.BOOLEAN);
                  Label var5x = new Label();
                  Label var6x = new Label();
                  var4x.OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(var1xx -> var1xx.visitJumpInsn(154, var5x));
                  RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var36, var4x, var55);
                  var4x.OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(var2xx -> {
                     var2xx.visitJumpInsn(167, var6x);
                     var2xx.visitLabel(var5x);
                  });
                  RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var43, var4x, var55);
                  var4x.OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(var1xx -> var1xx.visitLabel(var6x));
               });
            } else if (var0 instanceof Expr.Not var17) {
               var5.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  new com.moonsworth.lunar.client.IHIRRIIORRHORHRORIHOROIRCORCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR()
               );
               HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var26 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  var17.value(), var1, var2, var3, new CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(), var5
               );
               return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.BOOLEAN, var1x -> {
                  RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var26, var1x, HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.BOOLEAN);
                  var1x.OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(var0xx -> {
                     Label var1xx = new Label();
                     Label var2x = new Label();
                     var0xx.visitJumpInsn(153, var1xx);
                     RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0xx, 0);
                     var0xx.visitJumpInsn(167, var2x);
                     var0xx.visitLabel(var1xx);
                     RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0xx, 1);
                     var0xx.visitLabel(var2x);
                  });
               });
            } else if (var0 instanceof Expr.Coalesce var16) {
               return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var16.value(), var1, var2, var3, new CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(), var5);
            } else if (var0 instanceof Expr.Conditional var15) {
               return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  new Expr.Ternary(var15.condition(), var15.ifTrue(), new Expr.Constant(0.0)),
                  var1,
                  var2,
                  var3,
                  new CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(),
                  var5
               );
            } else {
               throw new RuntimeException("Not jiting expr: " + var0.getClass() + " - " + var0);
            }
         } else {
            String var7 = CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var14);
            com.moonsworth.lunar.client.IHIRRIIORRHORHRORIHOROIRCORCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var35 = var2.IOCCIHRHOIRHORIRIRHOHRHIIOCRIO(
               var7
            );
            if (var35 == null) {
               if (var3.OOIOHHHOOOCIHIRCRHIOIRCCCIHIII()) {
                  if (var3.IIOOHICIHHICROCHIIORRRROOIHIOC() != null) {
                     var3.IIOOHICIHHICROCHIIORRRROOIHIOC().add("Failed to find method " + var7);
                  }

                  return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                     new Expr.Constant(0.0), var1, var2, var3, new CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(), var5
                  );
               } else {
                  throw new IllegalStateException("Failed to find method " + var7);
               }
            } else {
               int var9 = var14.arguments().size();
               if (!var35.ICRCOOIHHHRCCROCCRIRCIOCIRIHIH(var9) && var3.IIOOHICIHHICROCHIIORRRROOIHIOC() != null) {
                  var3.IIOOHICIHHICROCHIIORRRROOIHIOC().add("Invalid argument count for " + var7 + " got " + var14.arguments().size());
               }

               if (var3.HHHICRHICOOCRICRIHCIICIICOCIOI()) {
                  while (!var35.ICRCOOIHHHRCCROCCRIRCIOCIRIHIH(var9)) {
                     if (var9 == 0) {
                        if (var3.OIRCORCIHCOCCOCRCCHCCHROCCHHHC()) {
                           return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                              new Expr.Constant(0.0), var1, var2, var3, new CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(), var5
                           );
                        }

                        throw new IllegalStateException("Too few arguments for " + var7 + " got " + var14.arguments().size());
                     }

                     var9--;
                  }
               } else if (!var35.ICRCOOIHHHRCCROCCRIRCIOCIRIHIH(var9)) {
                  if (var3.OIRCORCIHCOCCOCRCCHCCHROCCHHHC()) {
                     return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                        new Expr.Constant(0.0), var1, var2, var3, new CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(), var5
                     );
                  }

                  throw new IllegalStateException("Invalid argument count for " + var7 + " got " + var14.arguments().size());
               }

               var5.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  new com.moonsworth.lunar.client.IHIRRIIORRHORHRORIHOROIRCORCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(
                     (Class<? extends com.moonsworth.lunar.client.IHIRRIIORRHORHRORIHOROIRCORCOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI>)var35.getClass()
                  )
               );
               int var10 = 0;
               ArrayList var11 = new ArrayList();

               for (Expr var13 : var14.arguments()) {
                  var11.add(RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var13, var1, var2, var3, new CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(), var5));
                  if (++var10 == var9) {
                     break;
                  }
               }

               return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.DOUBLE_PRIM, var3x -> var35.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var11, var3x, var1)
               );
            }
         }
      }
   }

   static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var0) {
      var0.OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(HRCHROOHRIHCRCRHRIIROCIRHOIRHH::RCIRROCCCIIHCIHCCRHHCCHOHHHCHH);
   }

   static void IRCIIHHICIHRCOCRROCOICRIHHCCHH(RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var0) {
      var0.OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(HRCHROOHRIHCRCRHRIIROCIRHOIRHH::IRCIIHHICIHRCOCRROCOICRIHHCCHH);
   }

   static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(MethodVisitor var0) {
      var0.visitMethodInsn(
         184, Type.getInternalName(Double.class), "valueOf", Type.getMethodDescriptor(Type.getType(Double.class), new Type[]{Type.DOUBLE_TYPE}), false
      );
   }

   static void IRCIIHHICIHRCOCRROCOICRIHHCCHH(MethodVisitor var0) {
      var0.visitMethodInsn(182, Type.getInternalName(Double.class), "doubleValue", Type.getMethodDescriptor(Type.DOUBLE_TYPE, new Type[0]), false);
   }

   static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var0, RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var1) {
      var0.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1);
      var0.HHRIOCOOORRIROHHCHIROIOOCOHRIH().pop(var1);
   }

   static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var0, RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var1) {
      var0.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1);
   }

   static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var0,
      RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var1,
      HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2
   ) {
      var0.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1);
      if (var2 != var0.HHRIOCOOORRIROHHCHIROIOOCOHRIH()) {
         var0.HHRIOCOOORRIROHHCHIROIOOCOHRIH().convertTo(var2, var1);
      }
   }

   static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Object var0, RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var1) {
      String var2 = var1.OCCCRRHIIOCOIHRIIHOIRRCIORHHHI(var0);
      var1.OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(var2x -> {
         var2x.visitVarInsn(25, 0);
         var2x.visitFieldInsn(180, "MolangJit", var2, Type.getDescriptor(var0.getClass()));
      });
   }

   static HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var0,
      HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1,
      int var2,
      boolean var3
   ) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.BOOLEAN, var4 -> {
         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var4, HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.DOUBLE_PRIM);
         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var4, HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.DOUBLE_PRIM);
         var4.OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(var2xx -> {
            var2xx.visitInsn(var3 ? 152 : 151);
            Label var3xx = new Label();
            Label var4x = new Label();
            var2xx.visitJumpInsn(var2, var3xx);
            RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2xx, 0);
            var2xx.visitJumpInsn(167, var4x);
            var2xx.visitLabel(var3xx);
            RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2xx, 1);
            var2xx.visitLabel(var4x);
         });
      });
   }

   static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(MethodVisitor var0, Object var1) {
      if (var1 instanceof Double var2) {
         double var6 = var2;
         if (var6 == 0.0) {
            var0.visitInsn(14);
            return;
         }

         if (var6 == 1.0) {
            var0.visitInsn(15);
            return;
         }
      } else if (var1 instanceof Integer var3) {
         double var8 = var3.intValue();
         if (var8 == -1.0) {
            var0.visitInsn(2);
            return;
         }

         if (var8 == 0.0) {
            var0.visitInsn(3);
            return;
         }

         if (var8 == 1.0) {
            var0.visitInsn(4);
            return;
         }

         if (var8 == 2.0) {
            var0.visitInsn(5);
            return;
         }

         if (var8 == 3.0) {
            var0.visitInsn(6);
            return;
         }

         if (var8 == 4.0) {
            var0.visitInsn(7);
            return;
         }

         if (var8 == 5.0) {
            var0.visitInsn(8);
            return;
         }
      } else if (var1 instanceof Float var4) {
         double var9 = var4.floatValue();
         if (var9 == 0.0) {
            var0.visitInsn(11);
            return;
         }

         if (var9 == 1.0) {
            var0.visitInsn(12);
            return;
         }

         if (var9 == 2.0) {
            var0.visitInsn(13);
            return;
         }
      } else if (var1 instanceof Long var5) {
         double var10 = var5.longValue();
         if (var10 == 0.0) {
            var0.visitInsn(9);
            return;
         }

         if (var10 == 1.0) {
            var0.visitInsn(10);
            return;
         }
      }

      var0.visitLdcInsn(var1);
   }

   static HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var0, Consumer<RIOOCHICIHRHOHCCCCCHOCCCOHCRHI> var1
   ) {
      return new HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var0);
   }

   enum IRCIIHHICIHRCOCRROCOICRIHHCCHH {
      DOUBLE_PRIM,
      DOUBLE_OBJ,
      BOOLEAN;

      private static final int TRUE = 1;
      private static final int FALSE = 0;

      public void convertTo(HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1, RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var2) {
         switch (this) {
            case DOUBLE_OBJ:
               switch (var1) {
                  case BOOLEAN:
                     this.convertTo(DOUBLE_PRIM, var2);
                     DOUBLE_PRIM.convertTo(BOOLEAN, var2);
                     return;
                  case DOUBLE_PRIM:
                     HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var2);
                     return;
                  default:
                     return;
               }
            case BOOLEAN:
               switch (var1) {
                  case DOUBLE_OBJ:
                     this.convertTo(DOUBLE_PRIM, var2);
                     DOUBLE_PRIM.convertTo(var1, var2);
                     return;
                  case DOUBLE_PRIM:
                     var2.OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(var0 -> var0.visitInsn(135));
                     return;
                  default:
                     return;
               }
            case DOUBLE_PRIM:
               switch (var1) {
                  case DOUBLE_OBJ:
                     HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2);
                     break;
                  case BOOLEAN:
                     var2.OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(var0 -> {
                        Label var1x = new Label();
                        Label var2x = new Label();
                        HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, 0.0);
                        var0.visitInsn(151);
                        var0.visitJumpInsn(153, var1x);
                        HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, 1);
                        var0.visitJumpInsn(167, var2x);
                        var0.visitLabel(var1x);
                        HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, 0);
                        var0.visitLabel(var2x);
                     });
               }
         }
      }

      public void pop(RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var1) {
         switch (this) {
            case DOUBLE_OBJ:
            case BOOLEAN:
               var1.OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(var0 -> var0.visitInsn(87));
               break;
            case DOUBLE_PRIM:
               var1.OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(var0 -> var0.visitInsn(88));
         }
      }
   }

   class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      private final Consumer<RIOOCHICIHRHOHCCCCCHOCCCOHCRHI> OHRROOICOCHICIROIOHHCRHRROOHII;
      private final HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH OHCOOORIOCRHHCHCIHHHCOHCROORHR;

      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Consumer<RIOOCHICIHRHOHCCCCCHOCCCOHCRHI> var1, HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var2) {
         this.OHRROOICOCHICIROIOHHCRHRROOHII = var1;
         this.OHCOOORIOCRHHCHCIHHHCOHCROORHR = var2;
      }

      public void HHCCIRHCCCIIRHCROHIORHIRHHIORH(RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var1) {
         this.OHRROOICOCHICIROIOHHCRHRROOHII.accept(var1);
      }

      @Generated
      public HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH HHRIOCOOORRIROHHCHIROIOOCOHRIH() {
         return this.OHCOOORIOCRHHCHCIHHHCOHCROORHR;
      }
   }
}
