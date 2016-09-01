package org.seckill.dao;

import java.util.Date;
import java.util.List;

import org.seckill.entity.Seckill;

public interface SeckillDao {
	
	/**
	 * 减少库存
	 * @param seckillId
	 * @param killTime
	 * @return 如果影响行数>1,表示更新的记录行数
	 */
	int reduceNumber(long seckillId,Date killTime);
	
	/**
	 * 根据ID查询
	 * @param seckillId
	 * @return
	 */
	Seckill queryById(long seckillId);
	
	/**
	 * 根据偏移量查询秒杀商品列表
	 * @param offset
	 * @param limit
	 * @return
	 */
	List<Seckill> queryAll(int offset,int limit);
}
