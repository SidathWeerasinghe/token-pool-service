/*******************************************************************************
 * Copyright (c) 2015-2017, WSO2.Telco Inc. (http://www.wso2telco.com)
 *
 * All Rights Reserved. WSO2.Telco Inc. licences this file to you under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package com.wso2telco.dep.tpservice.dao;

import com.wso2telco.dep.tpservice.model.EmailDTO;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MailMapper implements ResultSetMapper<EmailDTO> {

	@Override
	public EmailDTO map(int index, ResultSet r, StatementContext ctx) throws SQLException {
	

		EmailDTO  emaildto = new EmailDTO();
        int emailId = r.getInt("idtstemail");
        int whoId =  r.getInt("tsxwhodid");
        String emailAddress = r.getString("tstmailaddr");
        emaildto.setEmailAddress(emailAddress);
        emaildto.setWhoId(whoId);
        emaildto.setEmailId(emailId);
        
		return emaildto;
	}

}
