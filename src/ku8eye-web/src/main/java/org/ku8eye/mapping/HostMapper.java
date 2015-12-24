package org.ku8eye.mapping;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;
import org.ku8eye.domain.Host;

public interface HostMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table host
     *
     * @mbggenerated
     */
    @Delete({
        "delete from host",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table host
     *
     * @mbggenerated
     */
    @Insert({
        "insert into host (ZONE_ID, ",
        "HOST_NAME, IP, ROOT_PASSWD, ",
        "LOCATION, NOTE, ",
        "LAST_UPDATED, CORES, ",
        "MEMORY, USAGE_FLAG, ",
        "SSH_LOGIN, CLUSTER_ID)",
        "values (#{zoneId,jdbcType=INTEGER}, ",
        "#{hostName,jdbcType=CHAR}, #{ip,jdbcType=CHAR}, #{rootPasswd,jdbcType=CHAR}, ",
        "#{location,jdbcType=VARCHAR}, #{note,jdbcType=VARCHAR}, ",
        "#{lastUpdated,jdbcType=TIMESTAMP}, #{cores,jdbcType=TINYINT}, ",
        "#{memory,jdbcType=INTEGER}, #{usageFlag,jdbcType=TINYINT}, ",
        "#{sshLogin,jdbcType=TINYINT}, #{clusterId,jdbcType=INTEGER})"
    })
  
    int insert(Host record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table host
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "ID, ZONE_ID, HOST_NAME, IP, ROOT_PASSWD, LOCATION, NOTE, LAST_UPDATED, CORES, ",
        "MEMORY, USAGE_FLAG, SSH_LOGIN, CLUSTER_ID",
        "from host",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="ZONE_ID", property="zoneId", jdbcType=JdbcType.INTEGER),
        @Result(column="HOST_NAME", property="hostName", jdbcType=JdbcType.CHAR),
        @Result(column="IP", property="ip", jdbcType=JdbcType.CHAR),
        @Result(column="ROOT_PASSWD", property="rootPasswd", jdbcType=JdbcType.CHAR),
        @Result(column="LOCATION", property="location", jdbcType=JdbcType.VARCHAR),
        @Result(column="NOTE", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="LAST_UPDATED", property="lastUpdated", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CORES", property="cores", jdbcType=JdbcType.TINYINT),
        @Result(column="MEMORY", property="memory", jdbcType=JdbcType.INTEGER),
        @Result(column="USAGE_FLAG", property="usageFlag", jdbcType=JdbcType.TINYINT),
        @Result(column="SSH_LOGIN", property="sshLogin", jdbcType=JdbcType.TINYINT),
        @Result(column="CLUSTER_ID", property="clusterId", jdbcType=JdbcType.INTEGER)
    })
    Host selectByPrimaryKey(Integer id);
    
    
    
    @Select({
        "select",
        "ID, ZONE_ID, HOST_NAME, IP, ROOT_PASSWD, LOCATION, NOTE, LAST_UPDATED, CORES, ",
        "MEMORY, USAGE_FLAG, SSH_LOGIN, CLUSTER_ID",
        "from host",
        "where ID in (#{ids,jdbcType=VARCHAR})" 
    })
    
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="ZONE_ID", property="zoneId", jdbcType=JdbcType.INTEGER),
        @Result(column="HOST_NAME", property="hostName", jdbcType=JdbcType.CHAR),
        @Result(column="IP", property="ip", jdbcType=JdbcType.CHAR),
        @Result(column="ROOT_PASSWD", property="rootPasswd", jdbcType=JdbcType.CHAR),
        @Result(column="LOCATION", property="location", jdbcType=JdbcType.VARCHAR),
        @Result(column="NOTE", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="LAST_UPDATED", property="lastUpdated", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CORES", property="cores", jdbcType=JdbcType.TINYINT),
        @Result(column="MEMORY", property="memory", jdbcType=JdbcType.INTEGER),
        @Result(column="USAGE_FLAG", property="usageFlag", jdbcType=JdbcType.TINYINT),
        @Result(column="SSH_LOGIN", property="sshLogin", jdbcType=JdbcType.TINYINT),
        @Result(column="CLUSTER_ID", property="clusterId", jdbcType=JdbcType.INTEGER)
    })
    List<Host> selectByIds(String ids);
    

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table host
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "ID, ZONE_ID, HOST_NAME, IP, ROOT_PASSWD, LOCATION, NOTE, LAST_UPDATED, CORES, ",
        "MEMORY, USAGE_FLAG, SSH_LOGIN, CLUSTER_ID",
        "from host"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="ZONE_ID", property="zoneId", jdbcType=JdbcType.INTEGER),
        @Result(column="HOST_NAME", property="hostName", jdbcType=JdbcType.CHAR),
        @Result(column="IP", property="ip", jdbcType=JdbcType.CHAR),
        @Result(column="ROOT_PASSWD", property="rootPasswd", jdbcType=JdbcType.CHAR),
        @Result(column="LOCATION", property="location", jdbcType=JdbcType.VARCHAR),
        @Result(column="NOTE", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="LAST_UPDATED", property="lastUpdated", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CORES", property="cores", jdbcType=JdbcType.TINYINT),
        @Result(column="MEMORY", property="memory", jdbcType=JdbcType.INTEGER),
        @Result(column="USAGE_FLAG", property="usageFlag", jdbcType=JdbcType.TINYINT),
        @Result(column="SSH_LOGIN", property="sshLogin", jdbcType=JdbcType.TINYINT),
        @Result(column="CLUSTER_ID", property="clusterId", jdbcType=JdbcType.INTEGER)
    })
    List<Host> selectAll();
    
    @Select({
        "select",
        "ID, ZONE_ID, HOST_NAME, IP, ROOT_PASSWD, LOCATION, NOTE, LAST_UPDATED, CORES, ",
        "MEMORY, USAGE_FLAG, SSH_LOGIN, CLUSTER_ID",
        "from host",
        "where CLUSTER_ID = #{clusterId,jdbcType=INTEGER}"
        
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="ZONE_ID", property="zoneId", jdbcType=JdbcType.INTEGER),
        @Result(column="HOST_NAME", property="hostName", jdbcType=JdbcType.CHAR),
        @Result(column="IP", property="ip", jdbcType=JdbcType.CHAR),
        @Result(column="ROOT_PASSWD", property="rootPasswd", jdbcType=JdbcType.CHAR),
        @Result(column="LOCATION", property="location", jdbcType=JdbcType.VARCHAR),
        @Result(column="NOTE", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="LAST_UPDATED", property="lastUpdated", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CORES", property="cores", jdbcType=JdbcType.TINYINT),
        @Result(column="MEMORY", property="memory", jdbcType=JdbcType.INTEGER),
        @Result(column="USAGE_FLAG", property="usageFlag", jdbcType=JdbcType.TINYINT),
        @Result(column="SSH_LOGIN", property="sshLogin", jdbcType=JdbcType.TINYINT),
        @Result(column="CLUSTER_ID", property="clusterId", jdbcType=JdbcType.INTEGER)
    })
    List<Host> selectByClusterId(int clusterId);


    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table host
     *
     * @mbggenerated
     */
    @Update({
        "update host",
        "set ZONE_ID = #{zoneId,jdbcType=INTEGER},",
          "HOST_NAME = #{hostName,jdbcType=CHAR},",
          "IP = #{ip,jdbcType=CHAR},",
          "ROOT_PASSWD = #{rootPasswd,jdbcType=CHAR},",
          "LOCATION = #{location,jdbcType=VARCHAR},",
          "NOTE = #{note,jdbcType=VARCHAR},",
          "LAST_UPDATED = #{lastUpdated,jdbcType=TIMESTAMP},",
          "CORES = #{cores,jdbcType=TINYINT},",
          "MEMORY = #{memory,jdbcType=INTEGER},",
          "USAGE_FLAG = #{usageFlag,jdbcType=TINYINT},",
          "SSH_LOGIN = #{sshLogin,jdbcType=TINYINT},",
          "CLUSTER_ID = #{clusterId,jdbcType=INTEGER}",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Host record);
}