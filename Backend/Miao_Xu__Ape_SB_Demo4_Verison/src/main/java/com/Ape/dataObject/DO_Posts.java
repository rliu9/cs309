package com.Ape.dataObject;

public class DO_Posts {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column posts.id
     *
     * @mbg.generated Mon Mar 16 00:18:54 CDT 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column posts.usersId
     *
     * @mbg.generated Mon Mar 16 00:18:54 CDT 2020
     */
    private Integer usersid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column posts.merchantsType
     *
     * @mbg.generated Mon Mar 16 00:18:54 CDT 2020
     */
    private String merchantstype;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column posts.title
     *
     * @mbg.generated Mon Mar 16 00:18:54 CDT 2020
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column posts.content
     *
     * @mbg.generated Mon Mar 16 00:18:54 CDT 2020
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column posts.username
     *
     * @mbg.generated Mon Mar 16 00:18:54 CDT 2020
     */
    private String username;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column posts.id
     *
     * @return the value of posts.id
     *
     * @mbg.generated Mon Mar 16 00:18:54 CDT 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column posts.id
     *
     * @param id the value for posts.id
     *
     * @mbg.generated Mon Mar 16 00:18:54 CDT 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column posts.usersId
     *
     * @return the value of posts.usersId
     *
     * @mbg.generated Mon Mar 16 00:18:54 CDT 2020
     */
    public Integer getUsersid() {
        return usersid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column posts.usersId
     *
     * @param usersid the value for posts.usersId
     *
     * @mbg.generated Mon Mar 16 00:18:54 CDT 2020
     */
    public void setUsersid(Integer usersid) {
        this.usersid = usersid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column posts.merchantsType
     *
     * @return the value of posts.merchantsType
     *
     * @mbg.generated Mon Mar 16 00:18:54 CDT 2020
     */
    public String getMerchantstype() {
        return merchantstype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column posts.merchantsType
     *
     * @param merchantstype the value for posts.merchantsType
     *
     * @mbg.generated Mon Mar 16 00:18:54 CDT 2020
     */
    public void setMerchantstype(String merchantstype) {
        this.merchantstype = merchantstype == null ? null : merchantstype.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column posts.title
     *
     * @return the value of posts.title
     *
     * @mbg.generated Mon Mar 16 00:18:54 CDT 2020
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column posts.title
     *
     * @param title the value for posts.title
     *
     * @mbg.generated Mon Mar 16 00:18:54 CDT 2020
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column posts.content
     *
     * @return the value of posts.content
     *
     * @mbg.generated Mon Mar 16 00:18:54 CDT 2020
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column posts.content
     *
     * @param content the value for posts.content
     *
     * @mbg.generated Mon Mar 16 00:18:54 CDT 2020
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column posts.username
     *
     * @return the value of posts.username
     *
     * @mbg.generated Mon Mar 16 00:18:54 CDT 2020
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column posts.username
     *
     * @param username the value for posts.username
     *
     * @mbg.generated Mon Mar 16 00:18:54 CDT 2020
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }
}