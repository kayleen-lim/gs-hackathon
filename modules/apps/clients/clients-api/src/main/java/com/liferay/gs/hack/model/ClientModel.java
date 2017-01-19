/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.gs.hack.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Client service. Represents a row in the &quot;gs_Client&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.gs.hack.model.impl.ClientModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.gs.hack.model.impl.ClientImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Client
 * @see com.liferay.gs.hack.model.impl.ClientImpl
 * @see com.liferay.gs.hack.model.impl.ClientModelImpl
 * @generated
 */
@ProviderType
public interface ClientModel extends BaseModel<Client>, GroupedModel,
	ShardedModel, StagedAuditedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a client model instance should use the {@link Client} interface instead.
	 */

	/**
	 * Returns the primary key of this client.
	 *
	 * @return the primary key of this client
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this client.
	 *
	 * @param primaryKey the primary key of this client
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this client.
	 *
	 * @return the uuid of this client
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this client.
	 *
	 * @param uuid the uuid of this client
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the client ID of this client.
	 *
	 * @return the client ID of this client
	 */
	public long getClientId();

	/**
	 * Sets the client ID of this client.
	 *
	 * @param clientId the client ID of this client
	 */
	public void setClientId(long clientId);

	/**
	 * Returns the group ID of this client.
	 *
	 * @return the group ID of this client
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this client.
	 *
	 * @param groupId the group ID of this client
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this client.
	 *
	 * @return the company ID of this client
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this client.
	 *
	 * @param companyId the company ID of this client
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this client.
	 *
	 * @return the user ID of this client
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this client.
	 *
	 * @param userId the user ID of this client
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this client.
	 *
	 * @return the user uuid of this client
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this client.
	 *
	 * @param userUuid the user uuid of this client
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this client.
	 *
	 * @return the user name of this client
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this client.
	 *
	 * @param userName the user name of this client
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this client.
	 *
	 * @return the create date of this client
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this client.
	 *
	 * @param createDate the create date of this client
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this client.
	 *
	 * @return the modified date of this client
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this client.
	 *
	 * @param modifiedDate the modified date of this client
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the name of this client.
	 *
	 * @return the name of this client
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this client.
	 *
	 * @param name the name of this client
	 */
	public void setName(String name);

	/**
	 * Returns the description of this client.
	 *
	 * @return the description of this client
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this client.
	 *
	 * @param description the description of this client
	 */
	public void setDescription(String description);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(Client client);

	@Override
	public int hashCode();

	@Override
	public CacheModel<Client> toCacheModel();

	@Override
	public Client toEscapedModel();

	@Override
	public Client toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}