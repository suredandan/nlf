package nc.liat6.frame.db.custom.oracle;

import nc.liat6.frame.db.plugin.ISelecter;
import nc.liat6.frame.db.plugin.Rule;
import nc.liat6.frame.db.plugin.impl.CommonSelecter;

/**
 * Oracle数据库查询器
 * @author 6tail
 *
 */
public class OracleSelecter extends CommonSelecter implements IOracle{

	public ISelecter where(String column,Object value){
		Rule r = new Rule();
		r.setColumn(column);
		if(null != value){
			r.setOpStart("=");
			paramWheres.add(value);
		}else{
			r.setOpStart(" IS NULL");
			r.setTag("");
		}
		wheres.add(r);
		return this;
	}

	public ISelecter whereNq(String column,Object value){
		Rule r = new Rule();
		r.setColumn(column);
		if(null != value){
			r.setOpStart("!=");
			paramWheres.add(value);
		}else{
			r.setOpStart(" IS NOT NULL");
			r.setTag("");
		}
		wheres.add(r);

		return this;
	}

}
