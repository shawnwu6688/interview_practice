package designpatterns;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @ProjectName: interview_practice
 * @Package: designpatterns
 * @ClassName: JdbcTemplate
 * @Description: []
 * @Author: [Shawn]
 * @Date: 2022/7/9 19:35
 * @Version: V1.0
 * @Copyright: 2022  Inc. All rights reserved.
 * @TODO: Nothing
 **/
public class JdbcTemplate {
    //publicfinal Object execute(StatementCallback callback){
    //    Connection con=null;
    //    Statement stmt=null;
    //    try{
    //        con=getConnection();
    //        stmt=con.createStatement();
    //        Object retValue=callback.doWithStatement(stmt);
    //        return retValue;
    //    }catch(SQLException e){
    //        ...
    //    }finally{
    //        closeStatement(stmt);
    //        releaseConnection(con);
    //    }
    //}


}