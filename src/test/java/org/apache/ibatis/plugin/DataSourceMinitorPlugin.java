package org.apache.ibatis.plugin;

import org.apache.ibatis.datasource.pooled.PooledDataSourceFactory;
import org.apache.ibatis.executor.statement.SimpleStatementHandler;
import org.apache.ibatis.session.ResultHandler;

import java.sql.Statement;
import java.util.Map;

@Intercepts({
  @Signature(type = PooledDataSourceFactory.class, method = "getDataSource", args = {})})
public class DataSourceMinitorPlugin implements Interceptor{


  @Override
  public Object intercept(Invocation invocation) throws Throwable {
    System.out.println("intecepti");
    return "sssss";
  }
}
