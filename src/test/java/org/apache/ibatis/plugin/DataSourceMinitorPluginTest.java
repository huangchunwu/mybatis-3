package org.apache.ibatis.plugin;

import org.apache.ibatis.BaseDataTest;
import org.apache.ibatis.datasource.pooled.PooledDataSourceFactory;
import org.apache.ibatis.executor.statement.SimpleStatementHandler;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataSourceMinitorPluginTest extends BaseDataTest {


  @Test
  public void test() {
    PooledDataSourceFactory pooledDataSourceFactory = new PooledDataSourceFactory();
    new DataSourceMinitorPlugin().plugin(pooledDataSourceFactory);
    System.out.println(pooledDataSourceFactory.getDataSource());
  }
}
