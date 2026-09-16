package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.errorprone.annotations.DoNotMock;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

@DoNotMock(
   "Use TestingExecutors.sameThreadScheduledExecutor, or wrap a real Executor from java.util.concurrent.Executors with MoreExecutors.listeningDecorator"
)
@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
public interface RHOORRIIOCHIRRHOHOOHIROHCRICRO extends ExecutorService {
   <T> RCCCROCHCICCROHCOCCRRROCIIHCCH<T> RRCRRCORICCHOHHIRCHIROOHIIOHCO(Callable<T> var1);

   RCCCROCHCICCROHCOCCRRROCIIHCCH<?> CCHHCIRHICHHHHRRIHIORCCORCCIHR(Runnable var1);

   <T> RCCCROCHCICCROHCOCCRRROCIIHCCH<T> HHCCIRHCCCIIRHCROHIORHIRHHIORH(Runnable var1, T var2);

   @Override
   <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> var1);

   @Override
   <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> var1, long var2, TimeUnit var4);
}
