package com.Ape.dataObject;

public class DO_Comments {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comments.id
     *
     * @mbg.generated Sat Mar 07 21:12:52 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comments.usersId
     *
     * @mbg.generated Sat Mar 07 21:12:52 CST 2020
     */
    private Integer usersid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comments.merchantsId
     *
     * @mbg.generated Sat Mar 07 21:12:52 CST 2020
     */
    private Integer merchantsid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comments.content
     *
     * @mbg.generated Sat Mar 07 21:12:52 CST 2020
     */
    private String content;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comments.id
     *
     * @return the value of comments.id
     *
     * @mbg.generated Sat Mar 07 21:12:52 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comments.id
     *
     * @param id the value for comments.id
     *
     * @mbg.generated Sat Mar 07 21:12:52 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comments.usersId
     *
     * @return the value of comments.usersId
     *
     * @mbg.generated Sat Mar 07 21:12:52 CST 2020
     */
    public Integer getUsersid() {
        return usersid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comments.usersId
     *
     * @param usersid the value for comments.usersId
     *
     * @mbg.generated Sat Mar 07 21:12:52 CST 2020
     */
    public void setUsersid(Integer usersid) {
        this.usersid = usersid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comments.merchantsId
     *
     * @return the value of comments.merchantsId
     *
     * @mbg.generated Sat Mar 07 21:12:52 CST 2020
     */
    public Integer getMerchantsid() {
        return merchantsid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comments.merchantsId
     *
     * @param merchantsid the value for comments.merchantsId
     *
     * @mbg.generated Sat Mar 07 21:12:52 CST 2020
     */
    public void setMerchantsid(Integer merchantsid) {
        this.merchantsid = merchantsid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comments.content
     *
     * @return the value of comments.content
     *
     * @mbg.generated Sat Mar 07 21:12:52 CST 2020
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comments.content
     *
     * @param content the value for comments.content
     *
     * @mbg.generated Sat Mar 07 21:12:52 CST 2020
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}