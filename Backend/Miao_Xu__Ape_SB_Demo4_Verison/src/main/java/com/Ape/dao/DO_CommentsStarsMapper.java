package com.Ape.dao;

import java.util.List;

import com.Ape.dataObject.DO_CommentsStars;

public interface DO_CommentsStarsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commentsstars
     *
     * @mbg.generated Mon Mar 16 00:18:54 CDT 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commentsstars
     *
     * @mbg.generated Mon Mar 16 00:18:54 CDT 2020
     */
    int insert(DO_CommentsStars record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commentsstars
     *
     * @mbg.generated Mon Mar 16 00:18:54 CDT 2020
     */
    int insertSelective(DO_CommentsStars record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commentsstars
     *
     * @mbg.generated Mon Mar 16 00:18:54 CDT 2020
     */
    DO_CommentsStars selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commentsstars
     *
     * @mbg.generated Mon Mar 16 00:18:54 CDT 2020
     */
    int updateByPrimaryKeySelective(DO_CommentsStars record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table commentsstars
     *
     * @mbg.generated Mon Mar 16 00:18:54 CDT 2020
     */
    int updateByPrimaryKey(DO_CommentsStars record);
    
    /**
     * @author Miao Xu
     * @param merchantsId
     * @return list of DO_CommentsStars by merchantsId.
     */
    List<DO_CommentsStars> selectByMerchantsId(Integer merchantsId);
    
    /**
     * @author Miao Xu
     * @param postsId
     * @return list of DO_CommentsStars by postsId.
     */
    List<DO_CommentsStars> selectByPostsId(Integer postsId);
}