package com.Ape.dao;

import java.util.List;

import com.Ape.dataObject.DO_Merchant;

public interface DO_MerchantMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table merchant
	 * @mbg.generated  Sat Mar 07 12:31:37 CST 2020
	 */
	
	List<DO_Merchant> listMerchant();
	
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table merchant
	 * @mbg.generated  Sat Mar 07 12:31:37 CST 2020
	 */
	int insert(DO_Merchant record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table merchant
	 * @mbg.generated  Sat Mar 07 12:31:37 CST 2020
	 */
	int insertSelective(DO_Merchant record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table merchant
	 * @mbg.generated  Sat Mar 07 12:31:37 CST 2020
	 */
	DO_Merchant selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table merchant
	 * @mbg.generated  Sat Mar 07 12:31:37 CST 2020
	 */
	int updateByPrimaryKeySelective(DO_Merchant record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table merchant
	 * @mbg.generated  Sat Mar 07 12:31:37 CST 2020
	 */
	int updateByPrimaryKey(DO_Merchant record);
}