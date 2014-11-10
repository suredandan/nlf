package nc.liat6.frame.db.config;

/**
 * 数据库配置提供接口
 *
 * @author 6tail
 *
 */
public interface IDbConfigProvider{

  /**
   * 获取数据库配置
   * @return
   */
  DbConfig getDbConfig();
}