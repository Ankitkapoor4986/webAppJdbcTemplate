/**
 * 
 */
package com.bb.bbwebapp.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.jdbc.core.RowMapper;

import com.bb.bbwebapp.model.TBBGroup;
import com.bb.bbwebapp.model.TBBHead;

/**
 * @author ankit
 *
 */
public class TBBGroupMapper implements RowMapper<TBBGroup> {

	@Override
	public TBBGroup mapRow(ResultSet resultSet, int rowNo) throws SQLException {
		TBBGroup group = new TBBGroup();
		group.setGroupName(resultSet.getString("groupName"));
		if (group.getHeads() == null) {
			group.setHeads(new ArrayList<TBBHead>());
		}
		while (resultSet.next()) {
			TBBHead head = new TBBHead();
			head.setName(resultSet.getString("head_name"));
			group.getHeads().add(head);
		}
		return group;
	}

}
