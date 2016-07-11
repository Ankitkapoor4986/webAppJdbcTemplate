/**
 * 
 */
package com.bb.bbwebapp.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.jdbc.core.RowMapper;

import com.bb.bbwebapp.model.TBBGroup;
import com.bb.bbwebapp.model.Head;

/**
 * @author ankit
 *
 */
public class TBBGroupMapper implements RowMapper<TBBGroup> {

	@Override
	public TBBGroup mapRow(ResultSet resultSet, int rowNo) throws SQLException {
		TBBGroup group = new TBBGroup();
		group.setGroupName(resultSet.getString("groupName"));
		group.setGroupId(resultSet.getLong("group_id"));
		if (group.getHeads() == null) {
			group.setHeads(new ArrayList<Head>());
		}
		while (resultSet.next()) {
			Head head = new Head();
			head.setId(resultSet.getLong("head_id"));
			head.setName(resultSet.getString("head_name"));
			group.getHeads().add(head);
		}
		return group;
	}

}
