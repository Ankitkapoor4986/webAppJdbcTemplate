/**
 * 
 */
package com.bb.bbwebapp.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.bb.bbwebapp.model.TBBGroup;

/**
 * @author ankit
 *
 */
public class TBBGroupMapper implements RowMapper<TBBGroup>{

	@Override
	public TBBGroup mapRow(ResultSet resultSet, int rowNo) throws SQLException {
		TBBGroup group=new TBBGroup();
		group.setGroupName(resultSet.getString("groupName"));
		return group;
	}

	
}
