package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class OHHRIOHROOIHOROCIRHCHORIHRRRRI {
   protected static final String IHRCIRRRHRIOOCHIICRRIIIOOHCIOR = "org.springframework.";
   protected static final String OCHRCCHICOIOCRHHRCOIIIOHHCOIHO = "com.mchange.v2.c3p0.";
   protected static final Set<String> OHOCOHIIIOHOOIRRCCHOHROIIIHORH;
   protected Set<String> IHHIICOROHRCHIRICRORRRRCOOHROI;
   private static final OHHRIOHROOIHOROCIRHCHORIHRRRRI IICHIHRORCOIRROOIIHOOIRIIRIOII = new OHHRIOHROOIHOROCIRHCHORIHRRRRI();

   protected OHHRIOHROOIHOROCIRHCHORIHRRRRI() {
      this.IHHIICOROHRCHIRICRORRRRCOOHROI = OHOCOHIIIOHOOIRRCCHOHROIIIHORH;
   }

   public static OHHRIOHROOIHOROCIRHCHORIHRRRRI IOIOROHCHIOHICRROIRHHROCRCOCII() {
      return IICHIHRORCOIRROOIIHOOIRIIRIOII;
   }

   public void IIHRRHORCRCROCHHOHORCHCROCIHRO(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI var2,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var3
   ) {
      Class var4 = var2.RRICIOOORRIORHHICIRCIOCHRHRCHH();
      String var5 = var4.getName();
      if (!this.IHHIICOROHRCHIRICRORRRRCOOHROI.contains(var5)) {
         if (var4.isInterface()) {
            return;
         }

         if (var5.startsWith("org.springframework.")) {
            Class var6 = var4;

            while (true) {
               if (var6 == null || var6 == Object.class) {
                  return;
               }

               String var7 = var6.getSimpleName();
               if ("AbstractPointcutAdvisor".equals(var7) || "AbstractApplicationContext".equals(var7)) {
                  break;
               }

               var6 = var6.getSuperclass();
            }
         } else if (!var5.startsWith("com.mchange.v2.c3p0.") || !var5.endsWith("DataSource")) {
            return;
         }
      }

      var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var3, "Illegal type (%s) to deserialize: prevented for security reasons", new Object[]{var5});
   }

   static {
      HashSet var0 = new HashSet();
      var0.add("org.apache.commons.collections.functors.InvokerTransformer");
      var0.add("org.apache.commons.collections.functors.InstantiateTransformer");
      var0.add("org.apache.commons.collections4.functors.InvokerTransformer");
      var0.add("org.apache.commons.collections4.functors.InstantiateTransformer");
      var0.add("org.codehaus.groovy.runtime.ConvertedClosure");
      var0.add("org.codehaus.groovy.runtime.MethodClosure");
      var0.add("org.springframework.beans.factory.ObjectFactory");
      var0.add("com.sun.org.apache.xalan.internal.xsltc.trax.TemplatesImpl");
      var0.add("org.apache.xalan.xsltc.trax.TemplatesImpl");
      var0.add("com.sun.rowset.JdbcRowSetImpl");
      var0.add("java.util.logging.FileHandler");
      var0.add("java.rmi.server.UnicastRemoteObject");
      var0.add("org.springframework.beans.factory.config.PropertyPathFactoryBean");
      var0.add("org.springframework.aop.config.MethodLocatingFactoryBean");
      var0.add("org.springframework.beans.factory.config.BeanReferenceFactoryBean");
      var0.add("org.apache.tomcat.dbcp.dbcp2.BasicDataSource");
      var0.add("com.sun.org.apache.bcel.internal.util.ClassLoader");
      var0.add("org.hibernate.jmx.StatisticsService");
      var0.add("org.apache.ibatis.datasource.jndi.JndiDataSourceFactory");
      var0.add("org.apache.ibatis.parsing.XPathParser");
      var0.add("jodd.db.connection.DataSourceConnectionProvider");
      var0.add("oracle.jdbc.connector.OracleManagedConnectionFactory");
      var0.add("oracle.jdbc.rowset.OracleJDBCRowSet");
      var0.add("org.slf4j.ext.EventData");
      var0.add("flex.messaging.util.concurrent.AsynchBeansWorkManagerExecutor");
      var0.add("com.sun.deploy.security.ruleset.DRSHelper");
      var0.add("org.apache.axis2.jaxws.spi.handler.HandlerResolverImpl");
      var0.add("org.jboss.util.propertyeditor.DocumentEditor");
      var0.add("org.apache.openjpa.ee.RegistryManagedRuntime");
      var0.add("org.apache.openjpa.ee.JNDIManagedRuntime");
      var0.add("org.apache.openjpa.ee.WASRegistryManagedRuntime");
      var0.add("org.apache.axis2.transport.jms.JMSOutTransportInfo");
      var0.add("com.mysql.cj.jdbc.admin.MiniAdmin");
      var0.add("ch.qos.logback.core.db.DriverManagerConnectionSource");
      var0.add("org.jdom.transform.XSLTransformer");
      var0.add("org.jdom2.transform.XSLTransformer");
      var0.add("net.sf.ehcache.transaction.manager.DefaultTransactionManagerLookup");
      var0.add("net.sf.ehcache.hibernate.EhcacheJtaTransactionManagerLookup");
      var0.add("ch.qos.logback.core.db.JNDIConnectionSource");
      var0.add("com.zaxxer.hikari.HikariConfig");
      var0.add("com.zaxxer.hikari.HikariDataSource");
      var0.add("org.apache.cxf.jaxrs.provider.XSLTJaxbProvider");
      var0.add("org.apache.commons.configuration.JNDIConfiguration");
      var0.add("org.apache.commons.configuration2.JNDIConfiguration");
      var0.add("org.apache.xalan.lib.sql.JNDIConnectionPool");
      var0.add("com.sun.org.apache.xalan.internal.lib.sql.JNDIConnectionPool");
      var0.add("org.apache.commons.dbcp.cpdsadapter.DriverAdapterCPDS");
      var0.add("org.apache.commons.dbcp.datasources.PerUserPoolDataSource");
      var0.add("org.apache.commons.dbcp.datasources.SharedPoolDataSource");
      var0.add("com.p6spy.engine.spy.P6DataSource");
      var0.add("org.apache.log4j.receivers.db.DriverManagerConnectionSource");
      var0.add("org.apache.log4j.receivers.db.JNDIConnectionSource");
      var0.add("net.sf.ehcache.transaction.manager.selector.GenericJndiSelector");
      var0.add("net.sf.ehcache.transaction.manager.selector.GlassfishSelector");
      var0.add("org.apache.xbean.propertyeditor.JndiConverter");
      var0.add("org.apache.hadoop.shaded.com.zaxxer.hikari.HikariConfig");
      var0.add("com.ibatis.sqlmap.engine.transaction.jta.JtaTransactionConfig");
      var0.add("br.com.anteros.dbcp.AnterosDBCPConfig");
      var0.add("br.com.anteros.dbcp.AnterosDBCPDataSource");
      var0.add("javax.swing.JEditorPane");
      var0.add("javax.swing.JTextPane");
      var0.add("org.apache.shiro.realm.jndi.JndiRealmFactory");
      var0.add("org.apache.shiro.jndi.JndiObjectFactory");
      var0.add("org.apache.ignite.cache.jta.jndi.CacheJndiTmLookup");
      var0.add("org.apache.ignite.cache.jta.jndi.CacheJndiTmFactory");
      var0.add("org.quartz.utils.JNDIConnectionProvider");
      var0.add("org.apache.aries.transaction.jms.internal.XaPooledConnectionFactory");
      var0.add("org.apache.aries.transaction.jms.RecoverablePooledConnectionFactory");
      var0.add("com.caucho.config.types.ResourceRef");
      var0.add("org.aoju.bus.proxy.provider.RmiProvider");
      var0.add("org.aoju.bus.proxy.provider.remoting.RmiProvider");
      var0.add("org.apache.activemq.ActiveMQConnectionFactory");
      var0.add("org.apache.activemq.ActiveMQXAConnectionFactory");
      var0.add("org.apache.activemq.spring.ActiveMQConnectionFactory");
      var0.add("org.apache.activemq.spring.ActiveMQXAConnectionFactory");
      var0.add("org.apache.activemq.pool.JcaPooledConnectionFactory");
      var0.add("org.apache.activemq.pool.PooledConnectionFactory");
      var0.add("org.apache.activemq.pool.XaPooledConnectionFactory");
      var0.add("org.apache.activemq.jms.pool.XaPooledConnectionFactory");
      var0.add("org.apache.activemq.jms.pool.JcaPooledConnectionFactory");
      var0.add("org.apache.commons.proxy.provider.remoting.RmiProvider");
      var0.add("org.apache.commons.jelly.impl.Embedded");
      var0.add("oadd.org.apache.xalan.lib.sql.JNDIConnectionPool");
      var0.add("oadd.org.apache.commons.dbcp.cpdsadapter.DriverAdapterCPDS");
      var0.add("oadd.org.apache.commons.dbcp.datasources.PerUserPoolDataSource");
      var0.add("oadd.org.apache.commons.dbcp.datasources.SharedPoolDataSource");
      var0.add("oracle.jms.AQjmsQueueConnectionFactory");
      var0.add("oracle.jms.AQjmsXATopicConnectionFactory");
      var0.add("oracle.jms.AQjmsTopicConnectionFactory");
      var0.add("oracle.jms.AQjmsXAQueueConnectionFactory");
      var0.add("oracle.jms.AQjmsXAConnectionFactory");
      var0.add("org.jsecurity.realm.jndi.JndiRealmFactory");
      var0.add("com.pastdev.httpcomponents.configuration.JndiConfiguration");
      var0.add("com.nqadmin.rowset.JdbcRowSetImpl");
      var0.add("org.arrah.framework.rdbms.UpdatableJdbcRowsetImpl");
      var0.add("org.apache.commons.dbcp2.datasources.PerUserPoolDataSource");
      var0.add("org.apache.commons.dbcp2.datasources.SharedPoolDataSource");
      var0.add("org.apache.commons.dbcp2.cpdsadapter.DriverAdapterCPDS");
      var0.add("com.newrelic.agent.deps.ch.qos.logback.core.db.JNDIConnectionSource");
      var0.add("com.newrelic.agent.deps.ch.qos.logback.core.db.DriverManagerConnectionSource");
      var0.add("org.apache.tomcat.dbcp.dbcp.cpdsadapter.DriverAdapterCPDS");
      var0.add("org.apache.tomcat.dbcp.dbcp.datasources.PerUserPoolDataSource");
      var0.add("org.apache.tomcat.dbcp.dbcp.datasources.SharedPoolDataSource");
      var0.add("org.apache.tomcat.dbcp.dbcp2.cpdsadapter.DriverAdapterCPDS");
      var0.add("org.apache.tomcat.dbcp.dbcp2.datasources.PerUserPoolDataSource");
      var0.add("org.apache.tomcat.dbcp.dbcp2.datasources.SharedPoolDataSource");
      var0.add("com.oracle.wls.shaded.org.apache.xalan.lib.sql.JNDIConnectionPool");
      var0.add("org.docx4j.org.apache.xalan.lib.sql.JNDIConnectionPool");
      OHOCOHIIIOHOOIRRCCHOHROIIIHORH = Collections.unmodifiableSet(var0);
   }
}
